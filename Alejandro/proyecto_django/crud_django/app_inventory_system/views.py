from django.shortcuts import render, redirect
from .models import Producto, Cliente, Ventas
from django.contrib import messages

# Create your views here.
def home(request):
    productosList = Producto.objects.all()
    messages.info(request, 'Los productos se cargaron correctamente.')
    return render(request, "app_inventory_system/html/Ventas.html", {"productos": productosList})

def registrarProducto(request):
    codigo = request.POST['txtCodigo']
    descripcion = request.POST['txtDescripcion']
    foto = request.POST['urlFoto']

    producto = Producto.objects.create(codigo=codigo, descripcion=descripcion, foto=foto)
    messages.success(request, 'El producto se agregó correctamente.')
    return redirect('/')

def editarProducto(request,codigo):
    producto = Producto.objects.get(codigo=codigo)
    return render(request, "app_inventory_system/html/editarProducto.html", {"producto": producto})

def editarProductos(request):
    codigo = request.POST['txtCodigo']
    descripcion = request.POST['txtDescripcion']
    foto = request.POST['urlFoto.url']

    producto = Producto.objects.get(codigo=codigo)
    producto.descripcion=descripcion
    producto.foto=foto
    producto.save()
    messages.success(request, 'El producto se modifico satisfactoriamente.')

    return redirect('/')


def eliminarProducto(request, codigo):
    producto = Producto.objects.get(codigo=codigo)
    producto.delete()
    messages.error(request,'El producto se elimino correctamente.')

    return redirect('/')
