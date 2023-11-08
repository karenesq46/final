from django.db import models

# Create your models here.
class UserProfile(models.Model):
    nombre = models.CharField(max_length=50)
    apellido = models.CharField(max_length=50)
    edad = models.CharField(max_length=10)
    foto = models.ImageField(blank=True, null=True, upload_to="evidencia_img")
    created_at = models.DateTimeField(auto_now_add=True)
    updated_at = models.DateTimeField(auto_now=True)