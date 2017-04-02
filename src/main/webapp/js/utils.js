var utils = {

    buildHamburgersMenuList: function(data) {

        var html = "<div>";

        for(var i=0; i<data.length; i++) {

            html +=

                '<div class="col-xs-12 col-sm-3 col-sm-push-9">' +

                '<h2 class="media-heading"><span class="label label-primary">$ '+data[i].price.toFixed(2)+'</span></h2>' +
                '<p style="padding:10px;"></p>' +
                '<p><a class="btn btn-danger btn-lg" href="#">Order Now!</a></p>' +
                '</div>' +
                '<div class="col-xs-12 col-sm-9 col-sm-pull-3">' +
                '<div class="media">' +
                '<div class="media-left media-middle">' +
                '<a href="#">' +
                '<img class="media-object img-thumbnail"'+
                'src="img/sandwich.jpg" alt="Sandwich">'+
                '</a>'+
                '</div>'+
                '<div class="media-body">'+
                '<h2 class="media-heading hamburguer-description">'+data[i].description+'</h2>'+
                '<p>'+this.buildHamburgersIngredientsList(data[i].listOfIngredients)+'</p>'+
                '</div>'+
                '</div>'+
                '</div>';

        }

        html += "</div>";

        return html;
    },

    buildHamburgersIngredientsList(listOfIngredients) {
        var list = '';
        for(var i=0; i<listOfIngredients.length; i++) {
            list += listOfIngredients[i].description
            if(i != listOfIngredients.length-1) list += ", ";
        }
        return list;
    }

};