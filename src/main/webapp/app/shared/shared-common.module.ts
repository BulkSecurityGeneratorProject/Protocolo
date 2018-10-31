import { NgModule } from '@angular/core';

import { ProtocoloSharedLibsModule, JhiAlertComponent, JhiAlertErrorComponent } from './';

@NgModule({
    imports: [ProtocoloSharedLibsModule],
    declarations: [JhiAlertComponent, JhiAlertErrorComponent],
    exports: [ProtocoloSharedLibsModule, JhiAlertComponent, JhiAlertErrorComponent]
})
export class ProtocoloSharedCommonModule {}
