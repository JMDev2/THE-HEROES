import spark.ModelAndView;
import spark.template.handlebars.HandlebarsTemplateEngine;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import static spark.Spark.*;
public class App {
    public static void main(String[] args) {
        staticFileLocation("/public");


        get("/", (request, response) -> {
            Map<String, Object> model = new HashMap<String, Object>();
            String heroName = request.queryParams("heroName");


            return new ModelAndView(model, "index.hbs");
        }, new HandlebarsTemplateEngine());

        get("/newhero", (request, response) -> {
            Map<String, Object> model = new HashMap<String, Object>();
            String heroName = request.queryParams("heroName");
            return new ModelAndView(model, "newhero.hbs");
        }, new HandlebarsTemplateEngine());



        post("/heroesdetails/new", (request, response) -> {
            Map<String, Object> model = new HashMap<>();
            String heroName = request.queryParams("heroName");
            Integer heroAge = Integer.parseInt(request.queryParams("heroAge"));
            String heroStrength = request.queryParams("heroStrength");
            String heroWeakness = request.queryParams("heroWeakness");

            Hero hero = new Hero(heroName, heroAge, heroStrength, heroWeakness);
            request.session().attribute("Hero", hero);
            model.put("Hero", request.session().attribute("Hero"));


            return new ModelAndView(model, "heroesdetails.hbs");
        }, new HandlebarsTemplateEngine());

//        heroesdetails
        get("/heroesdetails", (request, response) -> {
            Map<String, Object> model = new HashMap<String, Object>();

            return new ModelAndView(model, "heroesdetails.hbs");
        }, new HandlebarsTemplateEngine());

//        newsquad
        get("/newsquad", (request, response) -> {
            Map<String, Object> model = new HashMap<>();
            return new ModelAndView(model, "newsquad.hbs");
        }, new HandlebarsTemplateEngine());

//
//        post a squad
        post("/squaddetails/new", (request, response) -> {
            Map<String, Object> model = new HashMap<>();
            ArrayList mySquadArraylist = Squad.getAll();
            Integer squadSize = Integer.parseInt(request.queryParams("squadSize"));
            String squadName = request.queryParams("squadName");
            String squadCause = request.queryParams("squadCause");
            Squad squad = new Squad(squadSize, squadName, squadCause);
            request.session().attribute("Squad", squad);
            model.put("Squad", request.session().attribute("Squad"));
            return new ModelAndView(model, "squaddetails.hbs");
        }, new HandlebarsTemplateEngine());


        get("/", (req, res) -> {
            Map<String, Object> model = new HashMap<>();
            return new ModelAndView(model, "index.hbs");
        }, new HandlebarsTemplateEngine());







    }

}
