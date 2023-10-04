from django.urls import path
from . import views

urlpatterns = [
    path('', views.home),
    path('registrarProducto/', views.registrarProducto),
    path('editarProducto/<codigo>', views.editarProducto),
    path('editarProductos/', views.editarProductos),
    path('eliminarProducto/<codigo>', views.eliminarProducto), 
]