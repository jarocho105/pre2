package com.bydan.framework.erp.presentation.desktop.swing;

import javax.swing.JDesktopPane;

import com.bydan.erp.seguridad.business.entity.*;

import com.bydan.erp.seguridad.presentation.swing.jinternalframes.*;
import com.bydan.erp.contabilidad.presentation.swing.jinternalframes.*;
import com.bydan.erp.contabilidad.presentation.swing.jinternalframes.report.*;
import com.bydan.erp.tesoreria.presentation.swing.jinternalframes.*;
import com.bydan.erp.tesoreria.presentation.swing.jinternalframes.report.*;
import com.bydan.erp.tesoreria.presentation.swing.jinternalframes.report.ComprobantesAnuladosBeanSwingJInternalFrame;
import com.bydan.erp.nomina.presentation.swing.jinternalframes.*;
import com.bydan.erp.cartera.presentation.swing.jinternalframes.*;
import com.bydan.erp.cartera.presentation.swing.jinternalframes.report.*;
import com.bydan.erp.comisiones.presentation.swing.jinternalframes.*;
import com.bydan.erp.activosfijos.presentation.swing.jinternalframes.*;
import com.bydan.erp.activosfijos.presentation.swing.jinternalframes.report.*;
import com.bydan.erp.facturacion.presentation.swing.jinternalframes.*;
import com.bydan.erp.inventario.presentation.swing.jinternalframes.*;
import com.bydan.erp.produccion.presentation.swing.jinternalframes.*;
import com.bydan.erp.importaciones.presentation.swing.jinternalframes.*;
import com.bydan.erp.puntoventa.presentation.swing.jinternalframes.*;
import com.bydan.erp.puntoventa.presentation.swing.jinternalframes.report.*;
import com.bydan.erp.sris.presentation.swing.jinternalframes.*;
import com.bydan.erp.sris.presentation.swing.jinternalframes.report.*;

import com.bydan.erp.seguridad.util.*;
import com.bydan.erp.contabilidad.util.*;
import com.bydan.erp.contabilidad.util.report.*;
import com.bydan.erp.tesoreria.util.*;
import com.bydan.erp.tesoreria.util.report.*;
import com.bydan.erp.tesoreria.util.report.ComprobantesAnuladosConstantesFunciones;
import com.bydan.erp.nomina.util.*;
import com.bydan.erp.cartera.util.*;
import com.bydan.erp.cartera.util.report.*;
import com.bydan.erp.comisiones.util.*;
import com.bydan.erp.activosfijos.util.*;
import com.bydan.erp.activosfijos.util.report.*;
import com.bydan.erp.facturacion.util.*;
import com.bydan.erp.inventario.util.*;
import com.bydan.erp.produccion.util.*;
import com.bydan.erp.importaciones.util.*;
import com.bydan.erp.puntoventa.util.*;
import com.bydan.erp.puntoventa.util.report.*;
import com.bydan.erp.sris.util.*;
import com.bydan.erp.sris.util.report.*;

import com.bydan.framework.erp.util.Constantes;
import com.bydan.framework.erp.util.PaginaTipo;
@SuppressWarnings("unused")
public class MainJFrameSris {
	/*
	public static Usuario usuarioActual=null;
	public static ParametroGeneralSg parametroGeneralSg=null;
	public static ParametroGeneralUsuario parametroGeneralUsuario=null;	
	public static Modulo moduloActual=null;
	public static JDesktopPane desktop;
	*/
	
	public static String AUX_TEMP="";
	
	public static JInternalFrameBase getJInternalFrameBaseMenu(String strPaquete,String strPantalla,Opcion opcionActual
									,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Modulo moduloActual,JDesktopPane desktop,Boolean esParaPrecargarModulo) throws Exception{
    
	JInternalFrameBase jinternalFrame=new JInternalFrameBase();
   
		
	AutoriRetencionBeanSwingJInternalFrame autoriretencionBeanSwingJInternalFrame=null;
	CuentaCreditoFiscalBeanSwingJInternalFrame cuentacreditofiscalBeanSwingJInternalFrame=null;
	TipoIceBeanSwingJInternalFrame tipoiceBeanSwingJInternalFrame=null;
	TipoIvaBeanSwingJInternalFrame tipoivaBeanSwingJInternalFrame=null;
	TipoRetencionBeanSwingJInternalFrame tiporetencionBeanSwingJInternalFrame=null;
	TipoRetencionIvaBeanSwingJInternalFrame tiporetencionivaBeanSwingJInternalFrame=null;
	TipoSalarioNetoBeanSwingJInternalFrame tiposalarionetoBeanSwingJInternalFrame=null;
	
	DocumentoAnuladoBeanSwingJInternalFrame documentoanuladoBeanSwingJInternalFrame=null;
	FacturaDiarioBeanSwingJInternalFrame facturadiarioBeanSwingJInternalFrame=null;
	ImportarExportarBeanSwingJInternalFrame importarexportarBeanSwingJInternalFrame=null;
	PeriodoDeclaraBeanSwingJInternalFrame periododeclaraBeanSwingJInternalFrame=null;
	RetencionVentaBeanSwingJInternalFrame retencionventaBeanSwingJInternalFrame=null;
	TipoBancoBeanSwingJInternalFrame tipobancoBeanSwingJInternalFrame=null;
	TipoComprobanteBeanSwingJInternalFrame tipocomprobanteBeanSwingJInternalFrame=null;
	TipoTributarioBeanSwingJInternalFrame tipotributarioBeanSwingJInternalFrame=null;
	TransaccionContaBeanSwingJInternalFrame transaccioncontaBeanSwingJInternalFrame=null;
	TransaccionLocalBeanSwingJInternalFrame transaccionlocalBeanSwingJInternalFrame=null;
	FacturaProveedorBeanSwingJInternalFrame facturaproveedorBeanSwingJInternalFrame=null;
	FacturaBeanSwingJInternalFrame facturaBeanSwingJInternalFrame=null;
	FacturaPuntoVentaBeanSwingJInternalFrame facturapuntoventaBeanSwingJInternalFrame=null;
	RetencionBeanSwingJInternalFrame retencionBeanSwingJInternalFrame=null;
	AsientoContableBeanSwingJInternalFrame asientocontableBeanSwingJInternalFrame=null;

	
	//SRIS REPORTES
	SriComprasBeanSwingJInternalFrame sricomprasBeanSwingJInternalFrame=null;
	SriDetalladosIvaBeanSwingJInternalFrame sridetalladosivaBeanSwingJInternalFrame=null;
	SriFacturasProveedoresBeanSwingJInternalFrame srifacturasproveedoresBeanSwingJInternalFrame=null;
	SriFacturasProveedoresIva012BeanSwingJInternalFrame srifacturasproveedoresiva012BeanSwingJInternalFrame=null;
	SriRetencionesBeanSwingJInternalFrame sriretencionesBeanSwingJInternalFrame=null;

	//SRI_PROCESOS
	TransaccionesLocalesFacturasBeanSwingJInternalFrame transaccioneslocalesfacturasBeanSwingJInternalFrame=null;
	TransaccionesLocalesNotasCreditosBeanSwingJInternalFrame transaccioneslocalesnotascreditosBeanSwingJInternalFrame=null;
	GuardarIvasVentasBeanSwingJInternalFrame guardarivasventasBeanSwingJInternalFrame=null;
	FacturacionesPorDiariosBeanSwingJInternalFrame facturacionespordiariosBeanSwingJInternalFrame=null;
	FacturasPuntoVentaBeanSwingJInternalFrame facturaspuntoventaBeanSwingJInternalFrame=null;

	
	if(strPaquete.equals(Constantes.SMODULO_SRI)) {
		
		//SRI
    	
		if(strPantalla.equals(AutoriRetencionConstantesFunciones.CLASSNAME)) {
			autoriretencionBeanSwingJInternalFrame=new AutoriRetencionBeanSwingJInternalFrame(true,true,desktop,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,PaginaTipo.PRINCIPAL,false,false,true,true);
			jinternalFrame =autoriretencionBeanSwingJInternalFrame;
		}

		else if(strPantalla.equals(CuentaCreditoFiscalConstantesFunciones.CLASSNAME)) {
			cuentacreditofiscalBeanSwingJInternalFrame=new CuentaCreditoFiscalBeanSwingJInternalFrame(true,true,desktop,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,PaginaTipo.PRINCIPAL,false,false,true,true);
			jinternalFrame =cuentacreditofiscalBeanSwingJInternalFrame;
		}

		else if(strPantalla.equals(TipoIceConstantesFunciones.CLASSNAME)) {
			tipoiceBeanSwingJInternalFrame=new TipoIceBeanSwingJInternalFrame(true,true,desktop,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,PaginaTipo.PRINCIPAL,false,false,true,true);
			jinternalFrame =tipoiceBeanSwingJInternalFrame;
		}

		else if(strPantalla.equals(TipoIvaConstantesFunciones.CLASSNAME)) {
			tipoivaBeanSwingJInternalFrame=new TipoIvaBeanSwingJInternalFrame(true,true,desktop,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,PaginaTipo.PRINCIPAL,false,false,true,true);
			jinternalFrame =tipoivaBeanSwingJInternalFrame;
		}

		else if(strPantalla.equals(TipoRetencionConstantesFunciones.CLASSNAME)) {
			tiporetencionBeanSwingJInternalFrame=new TipoRetencionBeanSwingJInternalFrame(true,true,desktop,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,PaginaTipo.PRINCIPAL,false,false,true,true);
			jinternalFrame =tiporetencionBeanSwingJInternalFrame;
		}

		else if(strPantalla.equals(TipoRetencionIvaConstantesFunciones.CLASSNAME)) {
			tiporetencionivaBeanSwingJInternalFrame=new TipoRetencionIvaBeanSwingJInternalFrame(true,true,desktop,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,PaginaTipo.PRINCIPAL,false,false,true,true);
			jinternalFrame =tiporetencionivaBeanSwingJInternalFrame;
		}

		else if(strPantalla.equals(TipoSalarioNetoConstantesFunciones.CLASSNAME)) {
			tiposalarionetoBeanSwingJInternalFrame=new TipoSalarioNetoBeanSwingJInternalFrame(true,true,desktop,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,PaginaTipo.PRINCIPAL,false,false,true,true);
			jinternalFrame =tiposalarionetoBeanSwingJInternalFrame;
		
		} else if(strPantalla.equals(DocumentoAnuladoConstantesFunciones.CLASSNAME)) {
			documentoanuladoBeanSwingJInternalFrame=new DocumentoAnuladoBeanSwingJInternalFrame(true,true,desktop,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,PaginaTipo.PRINCIPAL,false,false,true,true);
			jinternalFrame =documentoanuladoBeanSwingJInternalFrame;
		}

		else if(strPantalla.equals(FacturaDiarioConstantesFunciones.CLASSNAME)) {
			facturadiarioBeanSwingJInternalFrame=new FacturaDiarioBeanSwingJInternalFrame(true,true,desktop,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,PaginaTipo.PRINCIPAL,false,false,true,true);
			jinternalFrame =facturadiarioBeanSwingJInternalFrame;
		}

		else if(strPantalla.equals(ImportarExportarConstantesFunciones.CLASSNAME)) {
			importarexportarBeanSwingJInternalFrame=new ImportarExportarBeanSwingJInternalFrame(true,true,desktop,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,PaginaTipo.PRINCIPAL,false,false,true,true);
			jinternalFrame =importarexportarBeanSwingJInternalFrame;
		}

		else if(strPantalla.equals(PeriodoDeclaraConstantesFunciones.CLASSNAME)) {
			periododeclaraBeanSwingJInternalFrame=new PeriodoDeclaraBeanSwingJInternalFrame(true,true,desktop,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,PaginaTipo.PRINCIPAL,false,false,true,true);
			jinternalFrame =periododeclaraBeanSwingJInternalFrame;
		}

		else if(strPantalla.equals(RetencionVentaConstantesFunciones.CLASSNAME)) {
			retencionventaBeanSwingJInternalFrame=new RetencionVentaBeanSwingJInternalFrame(true,true,desktop,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,PaginaTipo.PRINCIPAL,false,false,true,true);
			jinternalFrame =retencionventaBeanSwingJInternalFrame;
		}

		else if(strPantalla.equals(TipoBancoConstantesFunciones.CLASSNAME)) {
			tipobancoBeanSwingJInternalFrame=new TipoBancoBeanSwingJInternalFrame(true,true,desktop,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,PaginaTipo.PRINCIPAL,false,false,true,true);
			jinternalFrame =tipobancoBeanSwingJInternalFrame;
		}

		else if(strPantalla.equals(TipoComprobanteConstantesFunciones.CLASSNAME)) {
			tipocomprobanteBeanSwingJInternalFrame=new TipoComprobanteBeanSwingJInternalFrame(true,true,desktop,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,PaginaTipo.PRINCIPAL,false,false,true,true);
			jinternalFrame =tipocomprobanteBeanSwingJInternalFrame;
		}

		else if(strPantalla.equals(TipoTributarioConstantesFunciones.CLASSNAME)) {
			tipotributarioBeanSwingJInternalFrame=new TipoTributarioBeanSwingJInternalFrame(true,true,desktop,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,PaginaTipo.PRINCIPAL,false,false,true,true);
			jinternalFrame =tipotributarioBeanSwingJInternalFrame;
		}

		else if(strPantalla.equals(TransaccionContaConstantesFunciones.CLASSNAME)) {
			transaccioncontaBeanSwingJInternalFrame=new TransaccionContaBeanSwingJInternalFrame(true,true,desktop,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,PaginaTipo.PRINCIPAL,false,false,true,true);
			jinternalFrame =transaccioncontaBeanSwingJInternalFrame;
		}

		else if(strPantalla.equals(TransaccionLocalConstantesFunciones.CLASSNAME)) {
			transaccionlocalBeanSwingJInternalFrame=new TransaccionLocalBeanSwingJInternalFrame(true,true,desktop,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,PaginaTipo.PRINCIPAL,false,false,true,true);
			jinternalFrame =transaccionlocalBeanSwingJInternalFrame;
		
		} else if(strPantalla.equals(SriComprasConstantesFunciones.CLASSNAME)) {
			sricomprasBeanSwingJInternalFrame=new SriComprasBeanSwingJInternalFrame(true,true,desktop,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,PaginaTipo.PRINCIPAL,false,false,true,true);
			jinternalFrame =sricomprasBeanSwingJInternalFrame;
		}

		else if(strPantalla.equals(SriDetalladosIvaConstantesFunciones.CLASSNAME)) {
			sridetalladosivaBeanSwingJInternalFrame=new SriDetalladosIvaBeanSwingJInternalFrame(true,true,desktop,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,PaginaTipo.PRINCIPAL,false,false,true,true);
			jinternalFrame =sridetalladosivaBeanSwingJInternalFrame;
		}

		else if(strPantalla.equals(SriFacturasProveedoresConstantesFunciones.CLASSNAME)) {
			srifacturasproveedoresBeanSwingJInternalFrame=new SriFacturasProveedoresBeanSwingJInternalFrame(true,true,desktop,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,PaginaTipo.PRINCIPAL,false,false,true,true);
			jinternalFrame =srifacturasproveedoresBeanSwingJInternalFrame;
		}

		else if(strPantalla.equals(SriFacturasProveedoresIva012ConstantesFunciones.CLASSNAME)) {
			srifacturasproveedoresiva012BeanSwingJInternalFrame=new SriFacturasProveedoresIva012BeanSwingJInternalFrame(true,true,desktop,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,PaginaTipo.PRINCIPAL,false,false,true,true);
			jinternalFrame =srifacturasproveedoresiva012BeanSwingJInternalFrame;
		}

		else if(strPantalla.equals(SriRetencionesConstantesFunciones.CLASSNAME)) {
			sriretencionesBeanSwingJInternalFrame=new SriRetencionesBeanSwingJInternalFrame(true,true,desktop,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,PaginaTipo.PRINCIPAL,false,false,true,true);
			jinternalFrame =sriretencionesBeanSwingJInternalFrame;
		
		} else if(strPantalla.equals(FacturaProveedorConstantesFunciones.CLASSNAME)) {
			facturaproveedorBeanSwingJInternalFrame=new FacturaProveedorBeanSwingJInternalFrame(true,true,desktop,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,PaginaTipo.PRINCIPAL,false,false,true,true);
			jinternalFrame =facturaproveedorBeanSwingJInternalFrame;
		
		} else if(strPantalla.equals(FacturaConstantesFunciones.CLASSNAME)) {
			facturaBeanSwingJInternalFrame=new FacturaBeanSwingJInternalFrame(true,true,desktop,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,PaginaTipo.PRINCIPAL,false,false,true,true);
			jinternalFrame =facturaBeanSwingJInternalFrame;
		}

		else if(strPantalla.equals(FacturaPuntoVentaConstantesFunciones.CLASSNAME)) {
			facturapuntoventaBeanSwingJInternalFrame=new FacturaPuntoVentaBeanSwingJInternalFrame(true,true,desktop,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,PaginaTipo.PRINCIPAL,false,false,true,true);
			jinternalFrame =facturapuntoventaBeanSwingJInternalFrame;
		}

		else if(strPantalla.equals(RetencionConstantesFunciones.CLASSNAME)) {
			retencionBeanSwingJInternalFrame=new RetencionBeanSwingJInternalFrame(true,true,desktop,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,PaginaTipo.PRINCIPAL,false,false,true,true);
			jinternalFrame =retencionBeanSwingJInternalFrame;
		
		} else if(strPantalla.equals(AsientoContableConstantesFunciones.CLASSNAME)) {
			asientocontableBeanSwingJInternalFrame=new AsientoContableBeanSwingJInternalFrame(true,true,desktop,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,PaginaTipo.PRINCIPAL,false,false,true,true);
			jinternalFrame =asientocontableBeanSwingJInternalFrame;
		
		} else if(strPantalla.equals(TransaccionesLocalesFacturasConstantesFunciones.CLASSNAME)) {
			transaccioneslocalesfacturasBeanSwingJInternalFrame=new TransaccionesLocalesFacturasBeanSwingJInternalFrame(true,true,desktop,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,PaginaTipo.PRINCIPAL,false,false,true,true);
			jinternalFrame =transaccioneslocalesfacturasBeanSwingJInternalFrame;
		}

		else if(strPantalla.equals(TransaccionesLocalesNotasCreditosConstantesFunciones.CLASSNAME)) {
			transaccioneslocalesnotascreditosBeanSwingJInternalFrame=new TransaccionesLocalesNotasCreditosBeanSwingJInternalFrame(true,true,desktop,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,PaginaTipo.PRINCIPAL,false,false,true,true);
			jinternalFrame =transaccioneslocalesnotascreditosBeanSwingJInternalFrame;
		
		} else if(strPantalla.equals(GuardarIvasVentasConstantesFunciones.CLASSNAME)) {
			guardarivasventasBeanSwingJInternalFrame=new GuardarIvasVentasBeanSwingJInternalFrame(true,true,desktop,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,PaginaTipo.PRINCIPAL,false,false,true,true);
			jinternalFrame =guardarivasventasBeanSwingJInternalFrame;
		
		} else if(strPantalla.equals(FacturacionesPorDiariosConstantesFunciones.CLASSNAME)) {
			facturacionespordiariosBeanSwingJInternalFrame=new FacturacionesPorDiariosBeanSwingJInternalFrame(true,true,desktop,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,PaginaTipo.PRINCIPAL,false,false,true,true);
			jinternalFrame =facturacionespordiariosBeanSwingJInternalFrame;
		}

		else if(strPantalla.equals(FacturasPuntoVentaConstantesFunciones.CLASSNAME)) {
			facturaspuntoventaBeanSwingJInternalFrame=new FacturasPuntoVentaBeanSwingJInternalFrame(true,true,desktop,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,PaginaTipo.PRINCIPAL,false,false,true,true);
			jinternalFrame =facturaspuntoventaBeanSwingJInternalFrame;
		}
	}
		
		return jinternalFrame;
    }
	
}
