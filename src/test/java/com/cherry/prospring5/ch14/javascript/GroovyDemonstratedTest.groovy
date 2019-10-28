def list = ['This', 'is', 'John Mayer']
println list
assert list.size() == 3
assert list.class == ArrayList
assert list.reverse() == ['John Mayer', 'is', 'This']
assert list.sort{ it.size() } == ['is', 'This', 'John Mayer']
assert list[0..1] == ['is', 'This']