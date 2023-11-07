from django import forms
from .models import Profile

class ProfileForm(forms.ModelForm):
    class Meta:
        model = Profile
        fields = ['nombre', 'apellido','foto','edad']
        widgets = {
            'nombre' : forms.TextInput (attrs={'class':'form-control', 'required pattern':'[a-zA-Z]+'}),
            'apellido' : forms.TextInput (attrs={'class':'form-control', 'required pattern':'[a-zA-Z]+'}),
            'edad' : forms.TextInput (attrs={'class':'form-control','required pattern':'[0-9]+'})
        }        