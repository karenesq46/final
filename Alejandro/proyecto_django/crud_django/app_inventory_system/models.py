from django.db import models


# Create your models here.
class Producto(models.Model):
    codigo = models.CharField(primary_key=True ,max_length=6)
    descripcion = models.CharField(max_length=50)
    foto = models.ImageField(upload_to="evidencia_img", blank=True, null=True)
    created_at = models.DateTimeField(auto_now_add=True)
    updated_at = models.DateTimeField(auto_now=True)
    
    def __str__(self):
        texto = "{0} ({1})"
        return texto.format(self.codigo, self.descripcion, self.foto.url, self.created_at, self.updated_at)
        

class Cliente(models.Model):
    nombre = models.CharField(max_length=20)
    direccion = models.TextField
    
    def __str__(self):
        texto = "{0} ({1})"
        return texto.format(self.nombre, self.direccion)


class Ventas(models.Model):
    codigo = models.CharField(primary_key=True, max_length=6)
    id_cliente = models.ForeignKey(Cliente, on_delete=models.CASCADE)
    productos = models.ForeignKey(Producto, on_delete=models.CASCADE)
    precio_total = models.FloatField
    created_at = models.DateTimeField(auto_now_add=True)
    updated_at = models.DateTimeField(auto_now=True)
    
    def __str__(self):
        texto = "{0} ({1})"
        return texto.format(self.productos, self.id_cliente, self.precio_total, self.created_at, self.updated_at)







    