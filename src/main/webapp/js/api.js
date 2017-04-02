var api = {
    getHamburgersMenu: function() {
        return $.getJSON(constants.api.root + 'menu/list');
    }
};