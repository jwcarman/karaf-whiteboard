# karaf-whiteboard

To install the blueprint configuration example, build the project locally and issue the following commands inside the Karaf console:

```
config:edit com.carmanconsulting.karaf.whiteboard
config:property-set stringValue foo
config:update
feature:repo-add mvn:com.carmanconsulting.karaf/karaf-whiteboard-features/1.0.0-SNAPSHOT/xml/features
feature:install karaf-whiteboard
```
