# Create your views here.
from django.http import HttpResponse

import random

def index(request):
    return HttpResponse("Hello, world. You're at the PostTest index.")

def sendrandomnumber(request):
	random.seed(request.POST['seed'])
	return HttpResponse("Your random number is " + str(random.randint(1,1000)))

def returnnumber(request):
	return HttpResponse("Your number is " + str(request.POST['number']))

def returnJSON(request):
	return HttpResponse("Your number is " + str(request.POST['number']))

def randnumber(request):
	return HttpResponse("Your random number is " + str(random.randint(1,1000)))
