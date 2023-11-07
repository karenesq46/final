from django.urls import path
from .views import Index, List, Delete, Insert, Update

urlpatterns = [
    path('', Index.as_view(), name = 'index'),
    path('list/', List.as_view(), name = 'list_tasks'),
    path('insert/', Insert.as_view(), name = 'insert'),
    #path('form/',views.formulario ,name = 'formulario'),
    path('delete/<pk>', Delete.as_view(), name = 'delete'),
    path('update/<pk>', Update.as_view(), name = 'update'),
    
]