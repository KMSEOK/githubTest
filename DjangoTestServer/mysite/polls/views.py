from django.http import HttpResponse

def index(request): #mysite의 polls(앱) index함수 hello를 홈페이지에 보여줌
	return HttpResponse("Hello, world. You're at the polls index")


