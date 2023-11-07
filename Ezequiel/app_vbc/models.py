from django.db import models

class Profile(models.Model):
    nombre = models.CharField(max_length=50)
    apellido = models.CharField(max_length=50)
    created_at = models.DateTimeField(auto_now_add=True)
    updated_at = models.DateTimeField(auto_now=True)
    foto = models.ImageField(blank=True, null=True,upload_to="evidencia_img")
    edad = models.CharField(max_length=50)