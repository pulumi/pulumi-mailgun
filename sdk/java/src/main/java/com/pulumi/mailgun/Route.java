// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.mailgun;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.mailgun.RouteArgs;
import com.pulumi.mailgun.Utilities;
import com.pulumi.mailgun.inputs.RouteState;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Provides a Mailgun Route resource. This can be used to create and manage routes on Mailgun.
 * 
 * ## Example Usage
 * 
 * &lt;!--Start PulumiCodeChooser --&gt;
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.mailgun.Route;
 * import com.pulumi.mailgun.RouteArgs;
 * import java.util.List;
 * import java.util.ArrayList;
 * import java.util.Map;
 * import java.io.File;
 * import java.nio.file.Files;
 * import java.nio.file.Paths;
 * 
 * public class App {
 *     public static void main(String[] args) {
 *         Pulumi.run(App::stack);
 *     }
 * 
 *     public static void stack(Context ctx) {
 *         // Create a new Mailgun route
 *         var default_ = new Route(&#34;default&#34;, RouteArgs.builder()        
 *             .priority(&#34;0&#34;)
 *             .description(&#34;inbound&#34;)
 *             .expression(&#34;match_recipient(&#39;.*@foo.example.com&#39;)&#34;)
 *             .actions(            
 *                 &#34;forward(&#39;http://example.com/api/v1/foos/&#39;)&#34;,
 *                 &#34;stop()&#34;)
 *             .build());
 * 
 *     }
 * }
 * ```
 * &lt;!--End PulumiCodeChooser --&gt;
 * 
 * ## Import
 * 
 * Routes can be imported using `ROUTE_ID` and `region` via `import` command. Route ID can be found on Mailgun portal in section `Receiving/Routes`. Region has to be chosen from `eu` or `us` (when no selection `us` is applied).
 * 
 * hcl
 * 
 * ```sh
 * $ pulumi import mailgun:index/route:Route test eu:123456789
 * ```
 * 
 */
@ResourceType(type="mailgun:index/route:Route")
public class Route extends com.pulumi.resources.CustomResource {
    @Export(name="actions", refs={List.class,String.class}, tree="[0,1]")
    private Output<List<String>> actions;

    public Output<List<String>> actions() {
        return this.actions;
    }
    @Export(name="description", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> description;

    public Output<Optional<String>> description() {
        return Codegen.optional(this.description);
    }
    /**
     * A filter expression like `match_recipient(&#39;.*@gmail.com&#39;)`
     * 
     */
    @Export(name="expression", refs={String.class}, tree="[0]")
    private Output<String> expression;

    /**
     * @return A filter expression like `match_recipient(&#39;.*@gmail.com&#39;)`
     * 
     */
    public Output<String> expression() {
        return this.expression;
    }
    /**
     * Smaller number indicates higher priority. Higher priority routes are handled first.
     * 
     */
    @Export(name="priority", refs={Integer.class}, tree="[0]")
    private Output<Integer> priority;

    /**
     * @return Smaller number indicates higher priority. Higher priority routes are handled first.
     * 
     */
    public Output<Integer> priority() {
        return this.priority;
    }
    /**
     * The region where domain will be created. Default value is `us`.
     * 
     */
    @Export(name="region", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> region;

    /**
     * @return The region where domain will be created. Default value is `us`.
     * 
     */
    public Output<Optional<String>> region() {
        return Codegen.optional(this.region);
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public Route(String name) {
        this(name, RouteArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public Route(String name, RouteArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Route(String name, RouteArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("mailgun:index/route:Route", name, args == null ? RouteArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private Route(String name, Output<String> id, @Nullable RouteState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("mailgun:index/route:Route", name, state, makeResourceOptions(options, id));
    }

    private static com.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable com.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = com.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .build();
        return com.pulumi.resources.CustomResourceOptions.merge(defaultOptions, options, id);
    }

    /**
     * Get an existing Host resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state
     * @param options Optional settings to control the behavior of the CustomResource.
     */
    public static Route get(String name, Output<String> id, @Nullable RouteState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new Route(name, id, state, options);
    }
}
