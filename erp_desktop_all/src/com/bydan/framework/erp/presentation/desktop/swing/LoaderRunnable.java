package com.bydan.framework.erp.presentation.desktop.swing;

import javax.swing.JDesktopPane;

import com.bydan.erp.cartera.presentation.swing.jinternalframes.*;
import com.bydan.erp.contabilidad.presentation.swing.jinternalframes.*;
import com.bydan.erp.inventario.presentation.swing.jinternalframes.*;
import com.bydan.erp.facturacion.presentation.swing.jinternalframes.*;
//import com.bydan.erp.tesoreria.presentation.swing.jinternalframes.*;
//import com.bydan.erp.sris.presentation.swing.jinternalframes.*;
import com.bydan.erp.nomina.presentation.swing.jinternalframes.*;

import com.bydan.erp.seguridad.business.entity.Modulo;
import com.bydan.erp.seguridad.business.entity.Opcion;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralSg;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralUsuario;
import com.bydan.erp.seguridad.business.entity.ResumenUsuario;
import com.bydan.erp.seguridad.business.entity.Usuario;
import com.bydan.framework.erp.util.Constantes;
import com.bydan.framework.erp.util.PaginaTipo;

public class LoaderRunnable implements Runnable {
	public String sTipo="NONE";
	
	public Modulo moduloUsuarioSeleccionado;
	public Opcion opcionActual;
	public Usuario usuarioActual;
	public ResumenUsuario resumenUsuarioActual;
	public ParametroGeneralSg parametroGeneralSg;
	public ParametroGeneralUsuario parametroGeneralUsuario;
	public Modulo moduloActual;
	public JDesktopPane desktop;
	
	public void run() {
		
		
		try {
			
			this.CargarTipoPorModulo();
			
			System.out.println("CARGANDO..... MODULO "+this.sTipo+"");
			
			//if(this.sTipo.equals("INVENTARIO")) {
			this.CargarObjetosRendimientoCriticoPorModulo();
			
			System.out.println("MODULO "+this.sTipo+" CARGADO!!!!! ");
			
			//}
		} catch (Exception e) {
			System.out.println("ERROR!!!!! MODULO "+this.sTipo+" CARGADO!!!!! ");
			
			// TODO Auto-generated catch block
			e.printStackTrace();
		}				
    }
	
	public void CargarObjetosRendimientoCriticoPorModulo() throws Exception {
    	/*
    	if(moduloUsuarioSeleccionado.getId().equals(1L)) {
    		MainJFrameContabilidad.AUX_TEMP="CARGADO";
    		LoaderRunnable.CargarObjetosRendimientoCriticoModuloContabilidad(opcionActual,usuarioActual,parametroGeneralSg,parametroGeneralUsuario,moduloActual,desktop);
    	}
    	*/
    	
    	int id_modulo=moduloUsuarioSeleccionado.getId().intValue();
    	
    	switch(id_modulo) {
	    	 case 1://CONTABILIDAD 
	    		 MainJFrameContabilidad.AUX_TEMP="CARGADO";
	     		 this.CargarObjetosRendimientoCriticoModuloContabilidad();
	    	    break;
	    	    
	    	 case 2: //SEGURIDAD
	    		 MainJFrameSeguridad.AUX_TEMP="CARGADO";
	    	     break;
	    	     
	    	 case 3: // PUNTO VENTA
	    		 MainJFramePuntoVenta.AUX_TEMP="CARGADO";
	    	     break;
	    	     
	    	 case 5: //INVENTARIO 
	    		 MainJFrameInventario.AUX_TEMP="CARGADO";
	    		 this.CargarObjetosRendimientoCriticoModuloInventario();
	    	     break;
	    	     
	    	 case 6: //FACTURACION 
	    		 MainJFrameFacturacion.AUX_TEMP="CARGADO";
	    		 break;
	    		 
	    	 case 8://NOMINA 
	    		 MainJFrameNomina.AUX_TEMP="CARGADO";
	    	     break;
	    	     
	    	 case 9://TESORERIA 
	    		 MainJFrameTesoreria.AUX_TEMP="CARGADO";
	    	     break;
	    	     
	    	 case 11://ACTIVOS FIJOS 
	    		 MainJFrameActivosFijos.AUX_TEMP="CARGADO";
	    	     break;
	    	     
	    	 case 14://CUENTAS POR COBRAR
	    		 MainJFrameCuentasPorCobrar.AUX_TEMP="CARGADO";
	    		 this.CargarObjetosRendimientoCriticoModuloCuentasPorCobrar();
	    	     break;
	    	     
	    	 case 15://CUENTAS POR PAGAR
	    		 MainJFrameCuentasPorPagar.AUX_TEMP="CARGADO";
	    		 this.CargarObjetosRendimientoCriticoModuloCuentasPorPagar();
	    	     break;
	    	     
	    	 case 16://COMISIONES
	    		 MainJFrameComisiones.AUX_TEMP="CARGADO";
	    	     break;

	    	 case 17://PRODUCCION
	    		 MainJFrameProduccion.AUX_TEMP="CARGADO";
	    	     break;
	    	     
	    	 case 18://SRI
	    		 //MainJFrameSri.AUX_TEMP="CARGADO";
	    	     break;
	    	     
	    	 case 19://PROYECTOS
	    		 //MainJFrameProyectos.AUX_TEMP="CARGADO";
	    	     break;

	    	 case 20://IMPORTACIONES
	    		 MainJFrameImportaciones.AUX_TEMP="CARGADO";
	    	     break;
	    	     
	    	 case 21://GERENCIAL
	    		 //MainJFrameGerencial.AUX_TEMP="CARGADO";
	    	     break;
	    	     
	    	 default: 
	    	     
	    	     break;
    	}    	    	
    }
	
	public void CargarTipoPorModulo() throws Exception {
    	/*
    	if(moduloUsuarioSeleccionado.getId().equals(1L)) {
    		MainJFrameContabilidad.AUX_TEMP="CARGADO";
    		LoaderRunnable.CargarObjetosRendimientoCriticoModuloContabilidad(opcionActual,usuarioActual,parametroGeneralSg,parametroGeneralUsuario,moduloActual,desktop);
    	}
    	*/
    	
    	int id_modulo=moduloUsuarioSeleccionado.getId().intValue();
    	
    	switch(id_modulo) {
	    	 case 1://CONTABILIDAD 
	    		this.sTipo="CONTABILIDAD";
	    	    break;
	    	    
	    	 case 2: //SEGURIDAD
	    		 this.sTipo="SEGURIDAD";
	    	     break;
	    	     
	    	 case 3: // PUNTO VENTA
	    		 this.sTipo="PUNTO VENTA";
	    	     break;
	    	     
	    	 case 5: //INVENTARIO 
	    		 this.sTipo="INVENTARIO";
	    	     break;
	    	     
	    	 case 6: //FACTURACION 
	    		 this.sTipo="FACTURACION";
	    		 break;
	    		 
	    	 case 8://NOMINA 
	    		 this.sTipo="NOMINA";
	    	     break;
	    	     
	    	 case 9://TESORERIA 
	    		 this.sTipo="TESORERIA";
	    	     break;
	    	     
	    	 case 11://ACTIVOS FIJOS 
	    		 this.sTipo="ACTIVOS FIJOS";
	    	     break;
	    	     
	    	 case 14://CUENTAS POR COBRAR
	    		 this.sTipo="CUENTAS POR COBRAR";
	    	     break;
	    	     
	    	 case 15://CUENTAS POR PAGAR
	    		 this.sTipo="CUENTAS POR PAGAR";
	    	     break;
	    	     
	    	 case 16://COMISIONES
	    		 this.sTipo="COMISIONES";
	    	     break;

	    	 case 17://PRODUCCION
	    		 this.sTipo="PRODUCCION";
	    	     break;
	    	     
	    	 case 18://SRI
	    		 this.sTipo="SRI";
	    	     break;
	    	     
	    	 case 19://PROYECTOS
	    		 this.sTipo="PROYECTOS";
	    	     break;

	    	 case 20://IMPORTACIONES
	    		 this.sTipo="IMPORTACIONES";
	    	     break;
	    	     
	    	 case 21://GERENCIAL
	    		 this.sTipo="GERENCIAL";
	    	     break;
	    	     
	    	 default: 
	    	     
	    	     break;
    	}    	    	
    }
	
		@SuppressWarnings("unused")
		public void CargarObjetosRendimientoCriticoModuloContabilidad() throws Exception {
	    	if(AsientoContableBeanSwingJInternalFrame.CON_CARGAR_MEMORIA_INICIAL) {
	    		//AsientoContableBeanSwingJInternalFrame asientocontableBeanSwingJInternalFrame=new AsientoContableBeanSwingJInternalFrame(false,false,desktop,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,PaginaTipo.BUSQUEDA,true,false,false,false);//true,true)-->Penultimo CARGA RELACIONES
	    		AsientoContableBeanSwingJInternalFrame asientocontableBeanSwingJInternalFrame;
	    		DetalleAsientoContableBeanSwingJInternalFrame detalleasientocontableBeanSwingJInternalFrame;
	    		RetencionBeanSwingJInternalFrame retencionBeanSwingJInternalFrame;
	    		DetalleMoviClienProveBeanSwingJInternalFrame detalleMoviClienProveBeanSwingJInternalFrame;
	    		ImportarExportarBeanSwingJInternalFrame importarexportarBeanSwingJInternalFrame;
	    		//SrisBeanSwingJInternalFrame srisBeanSwingJInternalFrame;
	    		PrestamoBeanSwingJInternalFrame prestamoBeanSwingJInternalFrame;
	    		
	    		
	    		asientocontableBeanSwingJInternalFrame=new AsientoContableBeanSwingJInternalFrame(false,false,desktop,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,PaginaTipo.BUSQUEDA,false,false,false,false);//true,true)-->Penultimo CARGA RELACIONES
	    		detalleasientocontableBeanSwingJInternalFrame=new DetalleAsientoContableBeanSwingJInternalFrame(false,false,desktop,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,PaginaTipo.BUSQUEDA,false,false,false,false);//true,true)-->Penultimo CARGA RELACIONES
	    		retencionBeanSwingJInternalFrame=new RetencionBeanSwingJInternalFrame(false,false,desktop,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,PaginaTipo.BUSQUEDA,false,false,false,false);//true,true)-->Penultimo CARGA RELACIONES
	    		detalleMoviClienProveBeanSwingJInternalFrame=new DetalleMoviClienProveBeanSwingJInternalFrame(false,false,desktop,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,PaginaTipo.BUSQUEDA,false,false,false,false);//true,true)-->Penultimo CARGA RELACIONES
	    		importarexportarBeanSwingJInternalFrame=new ImportarExportarBeanSwingJInternalFrame(false,false,desktop,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,PaginaTipo.BUSQUEDA,false,false,false,false);//true,true)-->Penultimo CARGA RELACIONES
	    		//srisBeanSwingJInternalFrame=new SrisBeanSwingJInternalFrame(false,false,desktop,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,PaginaTipo.BUSQUEDA,false,false,false,false);//true,true)-->Penultimo CARGA RELACIONES
	    		prestamoBeanSwingJInternalFrame=new PrestamoBeanSwingJInternalFrame(false,false,desktop,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,PaginaTipo.BUSQUEDA,false,false,false,false);//true,true)-->Penultimo CARGA RELACIONES
	    		
	    		    		
	    		AsientoContableBeanSwingJInternalFrame.CON_CARGAR_MEMORIA_INICIAL=false;
	    	}
	    }
	    
		@SuppressWarnings("unused")
	    public void CargarObjetosRendimientoCriticoModuloInventario() throws Exception {
	    	if(MovimientoInventarioBeanSwingJInternalFrame.CON_CARGAR_MEMORIA_INICIAL) {
	    		MovimientoInventarioBeanSwingJInternalFrame movimientoInventarioBeanSwingJInternalFrame;
	    		DetalleMovimientoInventarioBeanSwingJInternalFrame detallemovimientoInventarioBeanSwingJInternalFrame;
	    		FormaPagoInvenBeanSwingJInternalFrame formaPagoInvenBeanSwingJInternalFrame;
	    		
	    		MovimientoInventarioJInternalFrame movimientoInventarioSwingJInternalFrame;
	    		DetalleMovimientoInventarioJInternalFrame detallemovimientoInventarioSwingJInternalFrame;
	    		FormaPagoInvenJInternalFrame formaPagoInvenSwingJInternalFrame;
	    		
	    		
	    		//VERSION1
	    		//movimientoInventarioBeanSwingJInternalFrame=new MovimientoInventarioBeanSwingJInternalFrame(false,false,desktop,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,PaginaTipo.BUSQUEDA,true,false,true,false);//true,true)-->Penultimo CARGA RELACIONES
	    		
	    		//VERSION2
	    		//movimientoInventarioBeanSwingJInternalFrame=new MovimientoInventarioBeanSwingJInternalFrame(true,true,desktop,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,PaginaTipo.PRINCIPAL,false,false,true,true);
	    		
	    		//VERSION1 3VECES
	    		//1
	    		//movimientoInventarioBeanSwingJInternalFrame=new MovimientoInventarioBeanSwingJInternalFrame(false,false,desktop,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,PaginaTipo.BUSQUEDA,true,false,true,false);//true,true)-->Penultimo CARGA RELACIONES
	    		//2
	    		//movimientoInventarioBeanSwingJInternalFrame=new MovimientoInventarioBeanSwingJInternalFrame(false,false,desktop,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,PaginaTipo.BUSQUEDA,true,false,true,false);//true,true)-->Penultimo CARGA RELACIONES
	    		//3
	    		//movimientoInventarioBeanSwingJInternalFrame=new MovimientoInventarioBeanSwingJInternalFrame(false,false,desktop,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,PaginaTipo.BUSQUEDA,true,false,true,false);//true,true)-->Penultimo CARGA RELACIONES
	    		//VERSION1 3VECES_FIN
	    		
	    		//ANADIR A DESKTOP
	    		//this.addJInternalFrameAuxiliar(movimientoInventarioBeanSwingJInternalFrame);
	    		//movimientoInventarioBeanSwingJInternalFrame.setVisible(true);
	    		//movimientoInventarioBeanSwingJInternalFrame.setSelected(true);	
	    		

	    		//OK	    		
	    		movimientoInventarioBeanSwingJInternalFrame=new MovimientoInventarioBeanSwingJInternalFrame(false,false,desktop,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,PaginaTipo.BUSQUEDA,false,false,false,false);//true,true)-->Penultimo CARGA RELACIONES
	    		detallemovimientoInventarioBeanSwingJInternalFrame=new DetalleMovimientoInventarioBeanSwingJInternalFrame(false,false,desktop,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,PaginaTipo.BUSQUEDA,false,false,false,false);//true,true)-->Penultimo CARGA RELACIONES
	    		formaPagoInvenBeanSwingJInternalFrame=new FormaPagoInvenBeanSwingJInternalFrame(false,false,desktop,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,PaginaTipo.BUSQUEDA,false,false,false,false);//true,true)-->Penultimo CARGA RELACIONES	    		
	    		
	    		//VERSION 2 SOLO DISENO	
	    		/*
	    		movimientoInventarioSwingJInternalFrame=new MovimientoInventarioJInternalFrame(desktop,false,false,false,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,PaginaTipo.PRINCIPAL);
	    		detallemovimientoInventarioSwingJInternalFrame=new DetalleMovimientoInventarioJInternalFrame(desktop,false,false,false,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,PaginaTipo.PRINCIPAL);;
	    		formaPagoInvenSwingJInternalFrame=new FormaPagoInvenJInternalFrame(desktop,false,false,false,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,PaginaTipo.PRINCIPAL);;
	    		*/
	    		
	    		
	    		//movimientoInventarioSwingJInternalFrame=new MovimientoInventarioJInternalFrame(desktop,true,false,true,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,PaginaTipo.PRINCIPAL);
	    		
	    		
	    		
	    		MovimientoInventarioBeanSwingJInternalFrame.CON_CARGAR_MEMORIA_INICIAL=false;
	    	}
	    }
	    
		@SuppressWarnings("unused")
	    public void CargarObjetosRendimientoCriticoModuloCuentasPorCobrar() throws Exception {
	    	/*
	    	if(AsientoContableBeanSwingJInternalFrame.CON_CARGAR_MEMORIA_INICIAL) {
	    		AsientoContableBeanSwingJInternalFrame asientocontableBeanSwingJInternalFrame=new AsientoContableBeanSwingJInternalFrame(false,false,desktop,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,true,false,true,false);//true,true)
	    		AsientoContableBeanSwingJInternalFrame.CON_CARGAR_MEMORIA_INICIAL=false;
	    	}
	    	*/
	    	
	    	if(ClienteBeanSwingJInternalFrame.CON_CARGAR_MEMORIA_INICIAL) {
	    		ClienteBeanSwingJInternalFrame clienteBeanSwingJInternalFrame=new ClienteBeanSwingJInternalFrame(false,false,desktop,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,PaginaTipo.BUSQUEDA,true,false,false,false);//true,true)
	    		ClienteBeanSwingJInternalFrame.CON_CARGAR_MEMORIA_INICIAL=false;
	    	}
	    }
	    
		@SuppressWarnings("unused")
	    public void CargarObjetosRendimientoCriticoModuloCuentasPorPagar() throws Exception {
	    	/*
	    	if(AsientoContableBeanSwingJInternalFrame.CON_CARGAR_MEMORIA_INICIAL) {
	    		AsientoContableBeanSwingJInternalFrame asientocontableBeanSwingJInternalFrame=new AsientoContableBeanSwingJInternalFrame(false,false,desktop,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,true,false,true,false);//true,true)
	    		AsientoContableBeanSwingJInternalFrame.CON_CARGAR_MEMORIA_INICIAL=false;
	    	}
	    	*/
	    	
	    	if(ClienteBeanSwingJInternalFrame.CON_CARGAR_MEMORIA_INICIAL) {
	    		ClienteBeanSwingJInternalFrame clienteBeanSwingJInternalFrame=new ClienteBeanSwingJInternalFrame(false,false,desktop,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,PaginaTipo.BUSQUEDA,true,false,false,false);//true,true)
	    		ClienteBeanSwingJInternalFrame.CON_CARGAR_MEMORIA_INICIAL=false;
	    	}
	    }

		public void addJInternalFrameAuxiliar(JInternalFrameBase jinternalFrame) throws Exception {
		    
			if(!Constantes.CON_VARIAS_VENTANAS) {
				MainJFrame.cerrarJInternalFramesExistentes(this.desktop,jinternalFrame);
			}
			
			//SwingUtilities.updateComponentTreeUI(jinternalFrame);
			
			//jinternalFrame.pack();
			jinternalFrame.setAutoscrolls(true);
			
		    //frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
			jinternalFrame.setVisible(true); //necessary as of 1.3
	    	
	        this.desktop.add(jinternalFrame);
	               			
	        jinternalFrame.setSelected(true);
		}
		
		public String getsTipo() {
			return sTipo;
		}

		public void setsTipo(String sTipo) {
			this.sTipo = sTipo;
		}

		public Modulo getModuloUsuarioSeleccionado() {
			return moduloUsuarioSeleccionado;
		}

		public void setModuloUsuarioSeleccionado(Modulo moduloUsuarioSeleccionado) {
			this.moduloUsuarioSeleccionado = moduloUsuarioSeleccionado;
		}

		public Opcion getOpcionActual() {
			return opcionActual;
		}

		public void setOpcionActual(Opcion opcionActual) {
			this.opcionActual = opcionActual;
		}

		public Usuario getUsuarioActual() {
			return usuarioActual;
		}

		public void setUsuarioActual(Usuario usuarioActual) {
			this.usuarioActual = usuarioActual;
		}

		public ResumenUsuario getResumenUsuarioActual() {
			return resumenUsuarioActual;
		}

		public void setResumenUsuarioActual(ResumenUsuario resumenUsuarioActual) {
			this.resumenUsuarioActual = resumenUsuarioActual;
		}

		public ParametroGeneralSg getParametroGeneralSg() {
			return parametroGeneralSg;
		}

		public void setParametroGeneralSg(ParametroGeneralSg parametroGeneralSg) {
			this.parametroGeneralSg = parametroGeneralSg;
		}

		public ParametroGeneralUsuario getParametroGeneralUsuario() {
			return parametroGeneralUsuario;
		}

		public void setParametroGeneralUsuario(
				ParametroGeneralUsuario parametroGeneralUsuario) {
			this.parametroGeneralUsuario = parametroGeneralUsuario;
		}

		public Modulo getModuloActual() {
			return moduloActual;
		}

		public void setModuloActual(Modulo moduloActual) {
			this.moduloActual = moduloActual;
		}

		public JDesktopPane getDesktop() {
			return desktop;
		}

		public void setDesktop(JDesktopPane desktop) {
			this.desktop = desktop;
		}				
}
