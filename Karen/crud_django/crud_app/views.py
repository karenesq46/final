from django.http import HttpResponse
from django.urls import reverse_lazy
from django.views.generic import View
from django.shortcuts import redirect, render 
from django.views.generic import ListView, CreateView, UpdateView, DeleteView, TemplateView
from .models import UserProfile
from crud_app.forms import UserProfileForm
from django.db.utils import IntegrityError 

def user_view(request):
    if request.method == 'POST':
        form = UserProfileForm(request.POST)
        if form.is_valid():
            form.save()
        return redirect('crear_usuario')
    else:
        form=UserProfileForm()
    return render(request, 'user_form.html', {'form':form})

def user_list(request):
    profile=UserProfile.objects.all().order_by('id')
    contexto={'profiles':profile}
    return render(request, 'user_list.html', contexto)

def user_edit(request, id_profile):
    profile=UserProfile.objects.get(id=id_profile)
    if request.method == "GET":
        form = UserProfileForm(instance=profile)
    else:
        form = UserProfileForm(request.POST, instance=profile)
        if form.is_valid():
            form.save()
        return redirect('listar_usuario')
    return render(request, 'user_form.html', {'form': form})

def user_delete(request, id_profile):
    profile=UserProfile.objects.get(id=id_profile)
    if request.method == "POST":
        profile.delete()
        return redirect('listar_usuario')
    return render(request, 'user_delete.html', {'profile':profile})


class InicioView(View):
    def get(self, request, *args, **kwargs):
        return render(request, 'index.html')  # Renderiza la plantilla 'index.html'

    def post(self, request, *args, **kwargs):
        query = request.POST.get('query', '')
        # Redirige a la página de inicio
        return redirect('inicio')
    
    
#VISTAS BASADAS EN CLASES

class UserList(ListView):
    model=UserProfile
    template_name= 'user_list.html'
    def get_queryset(self):
        queryset = UserProfile.objects.all().order_by('id')
        return queryset


class UserCreate(CreateView):
    model = UserProfile
    form_class = UserProfileForm
    template_name = 'user_form.html'
    success_url=reverse_lazy('listar_usuario')

class UserUpdate(UpdateView):
    model = UserProfile
    form_class = UserProfileForm
    template_name = 'user_form.html'
    success_url=reverse_lazy('listar_usuario')

class UserDelete(DeleteView):
    model = UserProfile
    template_name = 'user_delete.html'
    success_url=reverse_lazy('listar_usuario')
