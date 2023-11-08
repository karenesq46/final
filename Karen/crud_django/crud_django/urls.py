"""crud_django URL Configuration

The `urlpatterns` list routes URLs to views. For more information please see:
    https://docs.djangoproject.com/en/3.2/topics/http/urls/
Examples:
Function views
    1. Add an import:  from my_app import views
    2. Add a URL to urlpatterns:  path('', views.home, name='home')
Class-based views
    1. Add an import:  from other_app.views import Home
    2. Add a URL to urlpatterns:  path('', Home.as_view(), name='home')
Including another URLconf
    1. Import the include() function: from django.urls import include, path
    2. Add a URL to urlpatterns:  path('blog/', include('blog.urls'))
"""
from crud_app.views import InicioView, user_view, user_list, user_edit, user_delete, UserList, UserCreate, UserUpdate, UserDelete
from django.contrib import admin
from django.urls import path
from django.conf import settings

urlpatterns = [
    path('admin/', admin.site.urls),
    path('', InicioView.as_view(), name='inicio'),
    path('crear/', UserCreate.as_view(), name='crear_usuario'),
    path('listar/', UserList.as_view(), name='listar_usuario'),
    path('<pk>/editar', UserUpdate.as_view(), name='editar_usuario'),
    path('<pk>/eliminar', UserDelete.as_view(), name='eliminar_usuario'),
]

if settings.DEBUG:
    from django.conf.urls.static import static
    urlpatterns += static(settings.MEDIA_URL, document_root=settings.MEDIA_ROOT)
