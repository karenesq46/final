from django import forms
from django.core.validators import RegexValidator
from .models import UserProfile

class UserProfileForm(forms.ModelForm):
    # Validadores personalizados para campos de texto
    letras_validator = RegexValidator(
        regex=r'^[a-zA-Z]*$',
        message='Este campo solo permite letras.'
    )

    numeros_validator = RegexValidator(
        regex=r'^[0-9]*$',
        message='Este campo solo permite números.'
    )

    class Meta:
        model = UserProfile
        fields = ['nombre', 'apellido', 'edad', 'foto']
        labels = {'nombre': 'Nombre', 'apellido': 'Apellido', 'edad': 'Edad', 'foto': 'Foto'}
        widgets = {
            'nombre': forms.TextInput(attrs={'class': 'form-control'}),
            'apellido': forms.TextInput(attrs={'class': 'form-control'}),
            'edad': forms.NumberInput(attrs={'class': 'form-control'}),
            'foto': forms.FileInput(attrs={'class': 'form-control'}),
        }

    # Aplicar validadores a campos específicos
    def __init__(self, *args, **kwargs):
        super(UserProfileForm, self).__init__(*args, **kwargs)
        self.fields['nombre'].validators.append(self.letras_validator)
        self.fields['apellido'].validators.append(self.letras_validator)
        self.fields['edad'].validators.append(self.numeros_validator)
