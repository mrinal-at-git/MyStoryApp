# MyStoryApp
An android application written in java and xml using Android Studio. It is a static application which display a List of Articles with their
title and short decription on clicking any of the view a new Activity opens up which contains the full content of the Article.

The list is displyed using RecyclerView, each block is basically a ViewHolder which holds the view(The ImageView, the the TextViews). 
The data is passed to RecyclerView using Adapter.

App looks like
![image](https://user-images.githubusercontent.com/60399993/75058927-f27fa000-5501-11ea-89f0-04965272c6a7.png)






The title and content to be displayed is predefined in  app/src/main/res/values/stories_title.xml and app/src/main/res/values/stories_content.xml file respectively, they can be modified as desired.
