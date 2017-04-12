

def a =[a:'aa',first:'aaaaaa',last:'aaaaaaaaaaaaaaa']
a.each {
    println "$it.key , $it.value"

}
a.remove('a')
a.each {
    println "$it.key , $it.value"

}
s = 'aasdasdsad'
print s