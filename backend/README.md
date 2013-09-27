django-gcm
==========
[![Build Status](https://travis-ci.org/bogdal/django-gcm.png?branch=master)](https://travis-ci.org/bogdal/django-gcm)
[![PyPI](https://version-image.appspot.com/pypi/?name=django-gcm)](https://pypi.python.org/pypi/django-gcm/)

Google Cloud Messaging Server in Django

Quickstart
-------

Install the package via ``pip``:

    pip install django-gcm
    
Add <code>gcm</code> to <code>INSTALLED_APPS</code> in <code>settings.py</code>

Add <code>GCM_APIKEY</code> to <code>settings.py</code> file:

```python
GCM_APIKEY = "<api_key>"
```


Add <code>gcm urls</code> to <code>urls.py</code> file:

```python
urlpatterns = patterns('',
  ...
  url(r'', include('gcm.urls')),
  ...
)
```

Send messages
-----
You can simply use the console:
```
$ python manage.py gcm_messenger --devices
Devices list:
(#1) My phone
$ python manage.py gcm_messenger 1 'my test message'
[OK] device #1 (My phone): id=xxxxx
```
or use python for that:
```python
from gcm.models import Device
my_phone = Device.objects.get(name='My phone')
my_phone.send_message('my test message')
```

Client
------

Simple client application you can find <a href='https://github.com/bogdal/pager'>here</a>.


