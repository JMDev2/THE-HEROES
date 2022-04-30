import spark.ModelAndView;
import spark.template.handlebars.HandlebarsTemplateEngine;

import java.util.HashMap;
import java.util.Map;

import static spark.Spark.*;
public class App {
    public static void main(String[] args) {
        staticFileLocation("/public");


        get("/",(request, response) -> {


            Map<String, Object> model = new HashMap<String, Object>();

            return new ModelAndView(model, "index.hbs");

        }, new HandlebarsTemplateEngine());

        get("/newhero", (req, res) -> {
            Map<String, Object> model = new HashMap<>();
            return new ModelAndView(model, "newhero.hbs");
        }, new HandlebarsTemplateEngine());

//        heroesdetails
        get("/heroesdetails", (req, res) -> {
            Map<String, Object> model = new HashMap<>();
            return new ModelAndView(model, "heroesdetails.hbs");
        }, new HandlebarsTemplateEngine());

//        newsquad
        get("/newsquad", (req, res) -> {
            Map<String, Object> model = new HashMap<>();
            return new ModelAndView(model, "newsquad.hbs");
        }, new HandlebarsTemplateEngine());

//        squaddetails
        get("/squaddetails", (req, res) -> {
            Map<String, Object> model = new HashMap<>();
            return new ModelAndView(model, "squaddetails.hbs");
        }, new HandlebarsTemplateEngine());

        get("/", (req, res) -> {
            Map<String, Object> model = new HashMap<>();
            return new ModelAndView(model, "index.hbs");
        }, new HandlebarsTemplateEngine());







    }

}
