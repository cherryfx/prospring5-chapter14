def names = ['John', 'Clayton', 'Mayer']
names.each {println 'Hello: ' + it}

def map = ['a': 10, 'b': 50]
Closure square = {key, value -> map[key] = value * value}
map.each square
println map