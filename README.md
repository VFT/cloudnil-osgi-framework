cloudnil-osgi-framework
=======================

A OSGi Enterprise Framework with SpringMVC+Hibernate+Virgo.

## Step:

> 1.Download STS and prepare the local OSGi development condition.
>
> 2.Install the virgo plugin for STS refer to [HERE](http://www.eclipse.org/virgo)
>
> 3.Import the four bundle project above into the workspace of STS.
>
> 4.Create a mysql database and run the SQL Script *contact.sql*,modify the database url in *com.cloudnil.framework.datasource\src\META-INF\spring\appContext.xml*.
>
> 5.Download all bundle's references by using Virgo plugin and store it in *VirgoTomcatServer-3.0.2\repository\usr*.
>
> 6.Publish the four bundle above on Virgo server and start it.
>
> 7.Test.In a general way url is *http://localhost:8080/cloudnil/*.
>
> 8.Add your code and complete other job.