import * as mailgun from "@pulumi/mailgun";

const route = new mailgun.Route("test-route", {
    priority: 0,
    description: "Inbound route",
    expression: "match_recipient('.*@example.com')",
    actions: [
        "forward('http://example.com/api/v1/foos/')",
        "stop()"
    ]
});

export const routeId = route.id;
