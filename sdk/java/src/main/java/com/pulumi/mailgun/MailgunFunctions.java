// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.mailgun;

import com.pulumi.core.Output;
import com.pulumi.core.TypeShape;
import com.pulumi.deployment.Deployment;
import com.pulumi.deployment.InvokeOptions;
import com.pulumi.deployment.InvokeOutputOptions;
import com.pulumi.mailgun.Utilities;
import com.pulumi.mailgun.inputs.GetDomainArgs;
import com.pulumi.mailgun.inputs.GetDomainPlainArgs;
import com.pulumi.mailgun.outputs.GetDomainResult;
import java.util.concurrent.CompletableFuture;

public final class MailgunFunctions {
    /**
     * `mailgun.Domain` provides details about a Mailgun domain.
     * 
     * ## Example Usage
     * 
     * &lt;!--Start PulumiCodeChooser --&gt;
     * <pre>
     * {@code
     * package generated_program;
     * 
     * import com.pulumi.Context;
     * import com.pulumi.Pulumi;
     * import com.pulumi.core.Output;
     * import com.pulumi.mailgun.MailgunFunctions;
     * import com.pulumi.mailgun.inputs.GetDomainArgs;
     * import com.pulumi.aws.route53Record;
     * import com.pulumi.aws.Route53RecordArgs;
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
     *         final var domain = MailgunFunctions.getDomain(GetDomainArgs.builder()
     *             .name("test.example.com")
     *             .build());
     * 
     *         var mailgun_mx = new Route53Record("mailgun-mx", Route53RecordArgs.builder()
     *             .zoneId(zoneId)
     *             .name(domainMailgun.name())
     *             .type("MX")
     *             .ttl(3600)
     *             .records(            
     *                 String.format("%s %s.", domain.applyValue(getDomainResult -> getDomainResult.receivingRecords()[0].priority()),domain.applyValue(getDomainResult -> getDomainResult.receivingRecords()[0].value())),
     *                 String.format("%s %s.", domain.applyValue(getDomainResult -> getDomainResult.receivingRecords()[1].priority()),domain.applyValue(getDomainResult -> getDomainResult.receivingRecords()[1].value())))
     *             .build());
     * 
     *     }
     * }
     * }
     * </pre>
     * &lt;!--End PulumiCodeChooser --&gt;
     * 
     */
    public static Output<GetDomainResult> getDomain(GetDomainArgs args) {
        return getDomain(args, InvokeOptions.Empty);
    }
    /**
     * `mailgun.Domain` provides details about a Mailgun domain.
     * 
     * ## Example Usage
     * 
     * &lt;!--Start PulumiCodeChooser --&gt;
     * <pre>
     * {@code
     * package generated_program;
     * 
     * import com.pulumi.Context;
     * import com.pulumi.Pulumi;
     * import com.pulumi.core.Output;
     * import com.pulumi.mailgun.MailgunFunctions;
     * import com.pulumi.mailgun.inputs.GetDomainArgs;
     * import com.pulumi.aws.route53Record;
     * import com.pulumi.aws.Route53RecordArgs;
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
     *         final var domain = MailgunFunctions.getDomain(GetDomainArgs.builder()
     *             .name("test.example.com")
     *             .build());
     * 
     *         var mailgun_mx = new Route53Record("mailgun-mx", Route53RecordArgs.builder()
     *             .zoneId(zoneId)
     *             .name(domainMailgun.name())
     *             .type("MX")
     *             .ttl(3600)
     *             .records(            
     *                 String.format("%s %s.", domain.applyValue(getDomainResult -> getDomainResult.receivingRecords()[0].priority()),domain.applyValue(getDomainResult -> getDomainResult.receivingRecords()[0].value())),
     *                 String.format("%s %s.", domain.applyValue(getDomainResult -> getDomainResult.receivingRecords()[1].priority()),domain.applyValue(getDomainResult -> getDomainResult.receivingRecords()[1].value())))
     *             .build());
     * 
     *     }
     * }
     * }
     * </pre>
     * &lt;!--End PulumiCodeChooser --&gt;
     * 
     */
    public static CompletableFuture<GetDomainResult> getDomainPlain(GetDomainPlainArgs args) {
        return getDomainPlain(args, InvokeOptions.Empty);
    }
    /**
     * `mailgun.Domain` provides details about a Mailgun domain.
     * 
     * ## Example Usage
     * 
     * &lt;!--Start PulumiCodeChooser --&gt;
     * <pre>
     * {@code
     * package generated_program;
     * 
     * import com.pulumi.Context;
     * import com.pulumi.Pulumi;
     * import com.pulumi.core.Output;
     * import com.pulumi.mailgun.MailgunFunctions;
     * import com.pulumi.mailgun.inputs.GetDomainArgs;
     * import com.pulumi.aws.route53Record;
     * import com.pulumi.aws.Route53RecordArgs;
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
     *         final var domain = MailgunFunctions.getDomain(GetDomainArgs.builder()
     *             .name("test.example.com")
     *             .build());
     * 
     *         var mailgun_mx = new Route53Record("mailgun-mx", Route53RecordArgs.builder()
     *             .zoneId(zoneId)
     *             .name(domainMailgun.name())
     *             .type("MX")
     *             .ttl(3600)
     *             .records(            
     *                 String.format("%s %s.", domain.applyValue(getDomainResult -> getDomainResult.receivingRecords()[0].priority()),domain.applyValue(getDomainResult -> getDomainResult.receivingRecords()[0].value())),
     *                 String.format("%s %s.", domain.applyValue(getDomainResult -> getDomainResult.receivingRecords()[1].priority()),domain.applyValue(getDomainResult -> getDomainResult.receivingRecords()[1].value())))
     *             .build());
     * 
     *     }
     * }
     * }
     * </pre>
     * &lt;!--End PulumiCodeChooser --&gt;
     * 
     */
    public static Output<GetDomainResult> getDomain(GetDomainArgs args, InvokeOptions options) {
        return Deployment.getInstance().invoke("mailgun:index/getDomain:getDomain", TypeShape.of(GetDomainResult.class), args, Utilities.withVersion(options));
    }
    /**
     * `mailgun.Domain` provides details about a Mailgun domain.
     * 
     * ## Example Usage
     * 
     * &lt;!--Start PulumiCodeChooser --&gt;
     * <pre>
     * {@code
     * package generated_program;
     * 
     * import com.pulumi.Context;
     * import com.pulumi.Pulumi;
     * import com.pulumi.core.Output;
     * import com.pulumi.mailgun.MailgunFunctions;
     * import com.pulumi.mailgun.inputs.GetDomainArgs;
     * import com.pulumi.aws.route53Record;
     * import com.pulumi.aws.Route53RecordArgs;
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
     *         final var domain = MailgunFunctions.getDomain(GetDomainArgs.builder()
     *             .name("test.example.com")
     *             .build());
     * 
     *         var mailgun_mx = new Route53Record("mailgun-mx", Route53RecordArgs.builder()
     *             .zoneId(zoneId)
     *             .name(domainMailgun.name())
     *             .type("MX")
     *             .ttl(3600)
     *             .records(            
     *                 String.format("%s %s.", domain.applyValue(getDomainResult -> getDomainResult.receivingRecords()[0].priority()),domain.applyValue(getDomainResult -> getDomainResult.receivingRecords()[0].value())),
     *                 String.format("%s %s.", domain.applyValue(getDomainResult -> getDomainResult.receivingRecords()[1].priority()),domain.applyValue(getDomainResult -> getDomainResult.receivingRecords()[1].value())))
     *             .build());
     * 
     *     }
     * }
     * }
     * </pre>
     * &lt;!--End PulumiCodeChooser --&gt;
     * 
     */
    public static Output<GetDomainResult> getDomain(GetDomainArgs args, InvokeOutputOptions options) {
        return Deployment.getInstance().invoke("mailgun:index/getDomain:getDomain", TypeShape.of(GetDomainResult.class), args, Utilities.withVersion(options));
    }
    /**
     * `mailgun.Domain` provides details about a Mailgun domain.
     * 
     * ## Example Usage
     * 
     * &lt;!--Start PulumiCodeChooser --&gt;
     * <pre>
     * {@code
     * package generated_program;
     * 
     * import com.pulumi.Context;
     * import com.pulumi.Pulumi;
     * import com.pulumi.core.Output;
     * import com.pulumi.mailgun.MailgunFunctions;
     * import com.pulumi.mailgun.inputs.GetDomainArgs;
     * import com.pulumi.aws.route53Record;
     * import com.pulumi.aws.Route53RecordArgs;
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
     *         final var domain = MailgunFunctions.getDomain(GetDomainArgs.builder()
     *             .name("test.example.com")
     *             .build());
     * 
     *         var mailgun_mx = new Route53Record("mailgun-mx", Route53RecordArgs.builder()
     *             .zoneId(zoneId)
     *             .name(domainMailgun.name())
     *             .type("MX")
     *             .ttl(3600)
     *             .records(            
     *                 String.format("%s %s.", domain.applyValue(getDomainResult -> getDomainResult.receivingRecords()[0].priority()),domain.applyValue(getDomainResult -> getDomainResult.receivingRecords()[0].value())),
     *                 String.format("%s %s.", domain.applyValue(getDomainResult -> getDomainResult.receivingRecords()[1].priority()),domain.applyValue(getDomainResult -> getDomainResult.receivingRecords()[1].value())))
     *             .build());
     * 
     *     }
     * }
     * }
     * </pre>
     * &lt;!--End PulumiCodeChooser --&gt;
     * 
     */
    public static CompletableFuture<GetDomainResult> getDomainPlain(GetDomainPlainArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("mailgun:index/getDomain:getDomain", TypeShape.of(GetDomainResult.class), args, Utilities.withVersion(options));
    }
}
