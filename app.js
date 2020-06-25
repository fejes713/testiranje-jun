var app = angular.module('myApp', []);
app.controller('MyCtrl', function ($scope) {
    var vm = this;
    vm.obj = {
        naziv: '',
        godina: 1992,
        cena: 0
    }

    vm.add = function () {
        var el = {
            naziv: vm.obj.naziv,
            godina: 1992,
            cena: vm.obj.cena
        }
        vm.vina.push(el);
        }

    vm.brisi = function (el) {
        var lista = [];
        for (var i in vm.vina) {
            //if (vm.vina[i] != el) {
            if(i != 0){
                lista.push(vm.vina[i]);
            }
        }
        vm.vina = lista;
    }

    vm.vina = [
        { naziv: 'Мерло', godina: 1992, cena: 19000},
        { naziv: 'Bordeaux red', godina: 2001, cena: 59000},
        { naziv: 'Chardonnay', godina: 2003, cena: 49000 }
    ]

    vm.izracunajProsek = function(){
        vm.suma = 0;
        for(var i in vm.vina){
            suma += vm.vina[i].plata;
        }
        vm.prosek = suma / vm.vina.length;
    }
});
