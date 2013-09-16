from django.conf.urls import patterns, url

urlpatterns = patterns('PostTest.views',
	url(r'^$','index'),
	url(r'^sendrandomnumber/$','sendrandomnumber'),
	url(r'^returnnumber/$','returnnumber'),
	url(r'^returnjson/$','sendrandomnumber'),
	url(r'^randnumber/$','randnumber'),
)