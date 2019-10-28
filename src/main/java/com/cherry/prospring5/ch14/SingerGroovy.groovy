package com.cherry.prospring5.ch14

class SingerGroovy {
    def firstName
    def lastName
    def birthDate
    String toString() {
        "($firstName,$lastName,$birthDate)"
    }

    public static void main(String[] args) {
        SingerGroovy singer = new SingerGroovy(firstName: 'John', lastName: 'Mayer',
                birthDate: new Date(
                        (new GregorianCalendar(1977, 9, 16)).getTime().getTime()))
        SingerGroovy anotherSinger =
                new SingerGroovy(firstName: 39, lastName: 'Mayer', birthDate: new Date(
                        (new GregorianCalendar(1977, 9, 16)).getTime().getTime()))
        println singer
        println anotherSinger
        println singer.firstName + 39
        println anotherSinger.firstName + 39
    }
}