var sandwich = {

    callGetHamburgersMenu: function() {
        var promise = api.getHamburgersMenu()

        promise.done(function(data) {
            var html = utils.buildHamburgersMenuList(data);

            document.getElementById("hamburger-menu").innerHTML = html;
        });
    }

};

sandwich.callGetHamburgersMenu();