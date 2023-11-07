
from django.views.generic import TemplateView, ListView, CreateView, DeleteView, UpdateView
from .models import Profile
from django.urls import reverse_lazy
from .forms import ProfileForm

class Index(TemplateView):#esta clase muestra
    template_name = 'home.html'

class List (ListView):
      model = Profile
      template_name = 'list_tasks.html'

#def formulario(request):
#      form = ProfileForm()
#      if form.is_valid():
#         form.save()
#         form = ProfileForm()
#      return render(request, 'list_tasks.html',{'form':form})

class Insert (CreateView):
      model = Profile
      form_class = ProfileForm
      template_name = 'list_tasks.html'
      success_url = reverse_lazy('list_tasks')

class Update (UpdateView):
      model = Profile
      form_class = ProfileForm
      template_name = 'list_tasks.html'
      success_url = reverse_lazy('list_tasks')


class Delete (DeleteView):
      model = Profile
      template_name = 'delete.html'
      success_url = reverse_lazy('list_tasks')