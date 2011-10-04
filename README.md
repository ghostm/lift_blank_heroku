A blank Lift project that is ready for [Heroku](http://deep-stone-6456.herokuapp.com/)

Start here:

    $ git clone git@github.com:ghostm/lift-omniauth.git

Create a new heroku app on their Cedar stack:

    $ heroku create --stack cedar

Deploy your code:

    $ git push heroku master

All done:

    $ heroku open

For more info about Scala on Heroku check out the [dev center](http://devcenter.heroku.com/articles/scala)

More details about the changes made to the standard Lift Blank project to get it ready for Heroku ...

Instead of deploying a war file we want to start Jetty directly.  As others before me have figured out, the easiest way to do this is create a Main method to start jetty. See JettyLauncher.scala - save this in your src/main/scala dir. Then use Typesafe's start script plugin to generate a script to start the app.

Note: make sure that project/build.properties doesn't start with a comment line.  Heroku doesn't like that.

Based on [Scalatra on Heroku](https://gist.github.com/1209277)