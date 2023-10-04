from django.contrib import admin
from .models import Producto
from .models import Cliente
from .models import Ventas

# Register your models here.
admin.site.register(Producto)
admin.site.register(Cliente)
admin.site.register(Ventas)
