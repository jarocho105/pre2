/*
*AVISO LEGAL
© Copyright
*Este programa esta protegido por la ley de derechos de autor.
*La reproduccion o distribucion ilicita de este programa o de cualquiera de
*sus partes esta penado por la ley con severas sanciones civiles y penales,
*y seran objeto de todas las sanciones legales que correspondan.

*Su contenido no puede copiarse para fines comerciales o de otras,
*ni puede mostrarse, incluso en una version modificada, en otros sitios Web.
Solo esta permitido colocar hipervinculos al sitio web.
*/
package com.bydan.erp.contabilidad.presentation.swing.jinternalframes;


import com.bydan.erp.sris.presentation.swing.jinternalframes.*;

import com.bydan.erp.contabilidad.presentation.web.jsf.sessionbean.*;//;
import com.bydan.erp.contabilidad.presentation.swing.jinternalframes.*;
import com.bydan.erp.contabilidad.presentation.swing.jinternalframes.auxiliar.*;


import com.bydan.erp.sris.presentation.web.jsf.sessionbean.*;

//import com.bydan.erp.contabilidad.presentation.report.source.*;


import com.bydan.framework.erp.business.entity.Reporte;

import com.bydan.erp.seguridad.business.entity.Modulo;
import com.bydan.erp.seguridad.business.entity.Opcion;
import com.bydan.erp.seguridad.business.entity.Usuario;
import com.bydan.erp.seguridad.business.entity.ResumenUsuario;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralSg;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralUsuario;

import com.bydan.erp.seguridad.util.SistemaParameterReturnGeneral;



import com.bydan.erp.contabilidad.business.entity.*;
import com.bydan.erp.contabilidad.util.TipoIvaConstantesFunciones;

import com.bydan.erp.contabilidad.business.logic.*;
import com.bydan.framework.erp.business.entity.DatoGeneral;
import com.bydan.framework.erp.business.entity.OrderBy;
import com.bydan.framework.erp.business.entity.Mensajes;
import com.bydan.framework.erp.business.logic.*;
import com.bydan.framework.erp.presentation.desktop.swing.DateConverter;
import com.bydan.framework.erp.presentation.desktop.swing.DateConverterFromDate;
import com.bydan.framework.erp.presentation.desktop.swing.FuncionesSwing;
import com.bydan.framework.erp.presentation.desktop.swing.JInternalFrameBase;
import com.bydan.framework.erp.presentation.desktop.swing.*;
import com.bydan.framework.erp.util.*;

import java.util.Date;
import java.util.List;
import java.util.ArrayList;
import java.io.File;
import java.util.HashMap;
import java.util.Map;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.sql.*;


import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JRRuntimeException;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.util.JRLoader;
import net.sf.jasperreports.engine.export.JRHtmlExporter;
import net.sf.jasperreports.j2ee.servlets.BaseHttpServlet;
import net.sf.jasperreports.engine.JRExporterParameter;
import net.sf.jasperreports.engine.data.JRBeanArrayDataSource;


import javax.swing.*;
import java.awt.*;
import javax.swing.border.EtchedBorder;
import javax.swing.border.Border;
import javax.swing.border.TitledBorder;
import java.awt.event.*;
import javax.swing.event.*;
import javax.swing.GroupLayout.Alignment;
import javax.swing.table.TableColumn;

import com.toedter.calendar.JDateChooser;


@SuppressWarnings("unused")
public class TipoIvaDetalleFormJInternalFrame extends TipoIvaBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	
	
	public JToolBar jTtoolBarDetalleTipoIva;
	
	protected JMenuBar jmenuBarDetalleTipoIva;
	
	protected JMenu jmenuDetalleTipoIva;
	protected JMenu jmenuDetalleArchivoTipoIva;
	protected JMenu jmenuDetalleAccionesTipoIva;
	protected JMenu jmenuDetalleDatosTipoIva;
	
	
	
	protected JPanel jContentPane = null;
	protected JPanel jContentPaneDetalleTipoIva = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutTipoIva;	
	protected GridBagConstraints gridBagConstraintsTipoIva;	
		
	//protected JInternalFrameBase jInternalFrameParent; //ESTA EN BASE
	//protected TipoIvaBeanSwingJInternalFrameAdditional jInternalFrameDetalleTipoIva;		
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	
	
	public TipoIvaSessionBean tipoivaSessionBean;
	
	

	public TransaccionLocalBeanSwingJInternalFrame transaccionlocalBeanSwingJInternalFrame=null;
	public TransaccionLocalBeanSwingJInternalFrame transaccionlocalBeanSwingJInternalFramePopup=null;
	public Boolean puedeCargarPorParteTransaccionLocal=false;
	public TransaccionLocalSessionBean transaccionlocalSessionBean;

	public FacturaDiarioBeanSwingJInternalFrame facturadiarioBeanSwingJInternalFrame=null;
	public FacturaDiarioBeanSwingJInternalFrame facturadiarioBeanSwingJInternalFramePopup=null;
	public Boolean puedeCargarPorParteFacturaDiario=false;
	public FacturaDiarioSessionBean facturadiarioSessionBean;
	
		
	
	public TipoIvaLogic tipoivaLogic;
	
	public JScrollPane jScrollPanelDatosTipoIva;
	public JScrollPane jScrollPanelDatosEdicionTipoIva;
	public JScrollPane jScrollPanelDatosGeneralTipoIva;
	
	protected JPanel jPanelCamposTipoIva;    
	protected JPanel jPanelCamposOcultosTipoIva;    	
	protected JPanel jPanelAccionesTipoIva;
	protected JPanel jPanelAccionesFormularioTipoIva;
    
	
	
	protected Integer iXPanelCamposTipoIva=0;
	protected Integer iYPanelCamposTipoIva=0;
	
	protected Integer iXPanelCamposOcultosTipoIva=0;
	protected Integer iYPanelCamposOcultosTipoIva=0;
	
	;
	;
	
		
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	public JButton jButtonNuevoTipoIva;
	public JButton jButtonModificarTipoIva;
	public JButton jButtonActualizarTipoIva;
    public JButton jButtonEliminarTipoIva;
	public JButton jButtonCancelarTipoIva;
    public JButton jButtonGuardarCambiosTipoIva;
	public JButton jButtonGuardarCambiosTablaTipoIva;
	protected JButton jButtonCerrarTipoIva;
	
	
	protected JButton jButtonProcesarInformacionTipoIva;
	
	
	protected JCheckBox jCheckBoxPostAccionNuevoTipoIva;
	protected JCheckBox jCheckBoxPostAccionSinCerrarTipoIva;
	protected JCheckBox jCheckBoxPostAccionSinMensajeTipoIva;
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarTipoIva;
	protected JButton jButtonModificarToolBarTipoIva;
	protected JButton jButtonActualizarToolBarTipoIva;
    protected JButton jButtonEliminarToolBarTipoIva;
	protected JButton jButtonCancelarToolBarTipoIva;
    protected JButton jButtonGuardarCambiosToolBarTipoIva;
	protected JButton jButtonGuardarCambiosTablaToolBarTipoIva;
	protected JButton jButtonMostrarOcultarTablaToolBarTipoIva;
	protected JButton jButtonCerrarToolBarTipoIva;
	
	protected JButton jButtonProcesarInformacionToolBarTipoIva;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoTipoIva;
	protected JMenuItem jMenuItemModificarTipoIva;
	protected JMenuItem jMenuItemActualizarTipoIva;
    protected JMenuItem jMenuItemEliminarTipoIva;
	protected JMenuItem jMenuItemCancelarTipoIva;
    protected JMenuItem jMenuItemGuardarCambiosTipoIva;
	protected JMenuItem jMenuItemGuardarCambiosTablaTipoIva;
	protected JMenuItem jMenuItemCerrarTipoIva;
	protected JMenuItem jMenuItemDetalleCerrarTipoIva;
	protected JMenuItem jMenuItemDetalleMostarOcultarTipoIva;
	
	protected JMenuItem jMenuItemProcesarInformacionTipoIva;
	protected JMenuItem jMenuItemNuevoGuardarCambiosTipoIva;
	protected JMenuItem jMenuItemMostrarOcultarTipoIva;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesTipoIva;	
		
	
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesTipoIva;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesTipoIva;
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxTiposAccionesFormularioTipoIva;
	
		
	
	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	public JPanel jPanelidTipoIva;
	public JLabel jLabelIdTipoIva;
	public JTextFieldMe jTextFieldidTipoIva;
	public JButton jButtonidTipoIvaBusqueda= new JButtonMe();

	public JPanel jPanelcodigoTipoIva;
	public JLabel jLabelcodigoTipoIva;
	public JTextField jTextFieldcodigoTipoIva;
	public JButton jButtoncodigoTipoIvaBusqueda= new JButtonMe();

	public JPanel jPanelnombreTipoIva;
	public JLabel jLabelnombreTipoIva;
	public JTextArea jTextAreanombreTipoIva;
	public JScrollPane jscrollPanenombreTipoIva;
	public JButton jButtonnombreTipoIvaBusqueda= new JButtonMe();

	
	
	
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JTabbedPane jTabbedPaneRelacionesTipoIva;
	
	public static int openFrameCount = 0;
    public static final int xOffset = 10, yOffset = 35;
	
	//LOS DATOS DE NUEVO Y EDICION ACTUAL APARECEN EN OTRA VENTANA(true) O NO(false)
	public static Boolean CON_DATOS_FRAME=true;
	
	public static Boolean ISBINDING_MANUAL=true;
	public static Boolean ISLOAD_FKLOTE=true;
	public static Boolean ISBINDING_MANUAL_TABLA=true;
	public static Boolean CON_CARGAR_MEMORIA_INICIAL=true;
	
	//Al final no se utilizan, se inicializan desde JInternalFrameBase, desde ParametroGeneralUsuario
	public static String STIPO_TAMANIO_GENERAL="NORMAL";
	public static String STIPO_TAMANIO_GENERAL_TABLA="NORMAL";
	public static Boolean CONTIPO_TAMANIO_MANUAL=false;
	public static Boolean CON_LLAMADA_SIMPLE=true;
	public static Boolean CON_LLAMADA_SIMPLE_TOTAL=true;
	public static Boolean ESTA_CARGADO_PORPARTE=false;
	
	public int iWidthScroll=0;//(screenSize.width-screenSize.width/2)+(250*0);
	public int iHeightScroll=0;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
	public int iWidthFormulario=450;//(screenSize.width-screenSize.width/2)+(250*0);
	public int iHeightFormulario=418;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
				
	public int iHeightFormularioMaximo=0;
	public int iWidthFormularioMaximo=0;
	public int iWidthTableDefinicion=0;
	
	public double dStart = 0; 
	public double dEnd = 0; 
	public double dDif = 0; 
			
	public SistemaParameterReturnGeneral sistemaReturnGeneral;
	public List<Opcion> opcionsRelacionadas=new ArrayList<Opcion>();
	
	public TipoIvaDetalleFormJInternalFrame(String sTipo) throws Exception {
		super(PaginaTipo.FORMULARIO);
       
		try {
			
	  		if(sTipo.equals("MINIMO")) {
				/*
				this.jPanelCamposTipoIva=new JPanel();
				this.jPanelAccionesFormularioTipoIva=new JPanel();
				this.jmenuBarDetalleTipoIva=new JMenuBar();
				this.jTtoolBarDetalleTipoIva=new JToolBar();
				*/
	  		}
	  		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoIvaDetalleFormJInternalFrame(PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo); 
		
		//super("TipoIva No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	//ES AUXILIAR PARA WINDOWS FORMS
	public TipoIvaDetalleFormJInternalFrame() throws Exception {
		super(PaginaTipo.FORMULARIO);
        //super("TipoIva No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoIvaDetalleFormJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("TipoIva No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoIvaDetalleFormJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("TipoIva No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoIvaDetalleFormJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("TipoIva No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			
			long start_time=0;
			long end_time=0;
			
			if(Constantes2.ISDEVELOPING2) {
				start_time = System.currentTimeMillis();
			}

			this.initialize(jdesktopPane,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
			
			if(Constantes2.ISDEVELOPING2) {
				end_time = System.currentTimeMillis();			
				String sTipo="Clase Padre Ventana";
				Funciones2.getMensajeTiempoEjecucion(start_time, end_time, sTipo,false);
			}  
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }		

	public JInternalFrameBase getJInternalFrameParent() {
		return jInternalFrameParent;
	}

	public void setJInternalFrameParent(JInternalFrameBase internalFrameParent)	{
		jInternalFrameParent = internalFrameParent;
	}
	
	
	public JButton getjButtonActualizarToolBarTipoIva() {
		return this.jButtonActualizarToolBarTipoIva;
	}
	
	public JButton getjButtonEliminarToolBarTipoIva() {
		return this.jButtonEliminarToolBarTipoIva;
	}
	
	public JButton getjButtonCancelarToolBarTipoIva() {
		return this.jButtonCancelarToolBarTipoIva;
	}		
	
	public JButton getjButtonProcesarInformacionTipoIva() {
		return this.jButtonProcesarInformacionTipoIva;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionTipoIva)	{
		this.jButtonProcesarInformacionTipoIva = jButtonProcesarInformacionTipoIva;
	}
	
	
	

	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesTipoIva() {
		return this.jComboBoxTiposAccionesTipoIva;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesTipoIva(
			JComboBox jComboBoxTiposRelacionesTipoIva) {
		this.jComboBoxTiposRelacionesTipoIva = jComboBoxTiposRelacionesTipoIva;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesTipoIva(
			JComboBox jComboBoxTiposAccionesTipoIva) {
		this.jComboBoxTiposAccionesTipoIva = jComboBoxTiposAccionesTipoIva;
	}		
	
			
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesFormularioTipoIva() {
		return this.jComboBoxTiposAccionesFormularioTipoIva;
	}				
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesFormularioTipoIva(
			JComboBox jComboBoxTiposAccionesFormularioTipoIva) {
		this.jComboBoxTiposAccionesFormularioTipoIva = jComboBoxTiposAccionesFormularioTipoIva;
	}
	
	private void initialize(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		this.tipoivaSessionBean=new TipoIvaSessionBean();
		
		this.tipoivaSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.tipoivaSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.tipoivaSessionBean.getEsGuardarRelacionado();				
		
		this.conMostrarAccionesCampo=parametroGeneralUsuario.getcon_mostrar_acciones_campo_general() || opcionActual.getcon_mostrar_acciones_campo();
		
		
		if(!this.conCargarMinimo) {
		
		//this.transaccionlocalSessionBean=new TransaccionLocalSessionBean();
		//this.facturadiarioSessionBean=new FacturaDiarioSessionBean();
		}
		
			
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		TipoIvaJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		TipoIvaJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		TipoIvaJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Tipo Iva MANTENIMIENTO"));
		
		
		if(iWidth > 650) {
			iWidth=650;
		}
		
		if(iHeight > 910) {
			iHeight=910;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
		
		if(!this.tipoivaSessionBean.getEsGuardarRelacionado()) {
			this.setResizable(true);
			this.setClosable(true);
			this.setMaximizable(true);
			this.iconable=true;
			
			setLocation(xOffset*openFrameCount, yOffset*openFrameCount);
			
			if(Constantes.CON_VARIAS_VENTANAS) {
				openFrameCount++;
				
				if(openFrameCount==Constantes.INUM_MAX_VENTANAS) {
					openFrameCount=0;
				}
			}
		}				
	
		TipoIvaJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarDetalleTipoIva= new JToolBar("MENU DATOS");		
		
		//TOOLBAR
		//PRINCIPAL				
				this.jButtonProcesarInformacionToolBarTipoIva=new JButtonMe();
				this.jButtonModificarToolBarTipoIva=new JButtonMe();							
		//PRINCIPAL
		
		//DETALLE
		this.jButtonActualizarToolBarTipoIva=FuncionesSwing.getButtonToolBarGeneral(this.jButtonActualizarToolBarTipoIva,this.jTtoolBarDetalleTipoIva,
							"actualizar","actualizar","Actualizar"+" "+TipoIvaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"),"Actualizar",false);
		
		
		
		
		this.jButtonEliminarToolBarTipoIva=FuncionesSwing.getButtonToolBarGeneral(this.jButtonEliminarToolBarTipoIva,this.jTtoolBarDetalleTipoIva,
							"eliminar","eliminar","Eliminar"+" "+TipoIvaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"),"Eliminar",false);
		
		
		
		
		this.jButtonCancelarToolBarTipoIva=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCancelarToolBarTipoIva,this.jTtoolBarDetalleTipoIva,
							"cancelar","cancelar","Cancelar"+" "+TipoIvaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"),"Cancelar",false);
		
		
		
		
		this.jButtonGuardarCambiosToolBarTipoIva=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosToolBarTipoIva,this.jTtoolBarDetalleTipoIva,
							"guardarcambios","guardarcambios","Guardar"+" "+TipoIvaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		
		FuncionesSwing.setBoldButtonToolBar(this.jButtonActualizarToolBarTipoIva,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonEliminarToolBarTipoIva,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonCancelarToolBarTipoIva,STIPO_TAMANIO_GENERAL,false,false,this);
	}
	
	
	
	public void cargarMenus() {		
		
		this.jmenuBarDetalleTipoIva=new JMenuBarMe();
		
		//DETALLE
		this.jmenuDetalleTipoIva=new JMenuMe("Datos Relacionados");
		this.jmenuDetalleArchivoTipoIva=new JMenuMe("Archivo");
		this.jmenuDetalleAccionesTipoIva=new JMenuMe("Acciones");
		this.jmenuDetalleDatosTipoIva=new JMenuMe("Datos");
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoTipoIva= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoTipoIva.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoTipoIva,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoTipoIva, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemModificarTipoIva= new JMenuItem("Editar" + FuncionesSwing.getKeyMensaje("MODIFICAR"));
		this.jMenuItemModificarTipoIva.setActionCommand("Editar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemModificarTipoIva,"modificar_button","Editar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemModificarTipoIva, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemActualizarTipoIva= new JMenuItem("Actualizar" + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
		this.jMenuItemActualizarTipoIva.setActionCommand("Actualizar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemActualizarTipoIva,"actualizar_button","Actualizar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemActualizarTipoIva, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemEliminarTipoIva= new JMenuItem("Eliminar" + FuncionesSwing.getKeyMensaje("ELIMINAR"));
		this.jMenuItemEliminarTipoIva.setActionCommand("Eliminar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemEliminarTipoIva,"eliminar_button","Eliminar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemEliminarTipoIva, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCancelarTipoIva= new JMenuItem("Cancelar" + FuncionesSwing.getKeyMensaje("CANCELAR"));
		this.jMenuItemCancelarTipoIva.setActionCommand("Cancelar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCancelarTipoIva,"cancelar_button","Cancelar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCancelarTipoIva, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosTipoIva= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTipoIva.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTipoIva,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTipoIva, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarTipoIva= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarTipoIva.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarTipoIva,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarTipoIva, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleCerrarTipoIva= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemDetalleCerrarTipoIva.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleCerrarTipoIva,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleCerrarTipoIva, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarTipoIva= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarTipoIva.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarTipoIva,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarTipoIva, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarTipoIva= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarTipoIva.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarTipoIva,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarTipoIva, STIPO_TAMANIO_GENERAL,false,true,this);			
		
		//DETALLE
		this.jmenuDetalleArchivoTipoIva.add(this.jMenuItemDetalleCerrarTipoIva);
		
		this.jmenuDetalleAccionesTipoIva.add(this.jMenuItemActualizarTipoIva);
		this.jmenuDetalleAccionesTipoIva.add(this.jMenuItemEliminarTipoIva);
		this.jmenuDetalleAccionesTipoIva.add(this.jMenuItemCancelarTipoIva);		
		
		//this.jmenuDetalleDatosTipoIva.add(this.jMenuItemDetalleAbrirOrderByTipoIva);				
		this.jmenuDetalleDatosTipoIva.add(this.jMenuItemDetalleMostarOcultarTipoIva);				
				
		//this.jmenuDetalleAccionesTipoIva.add(this.jMenuItemGuardarCambiosTipoIva);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES				
		
		//DETALLE
		FuncionesSwing.setBoldMenu(this.jmenuDetalleArchivoTipoIva, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleAccionesTipoIva, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleDatosTipoIva, STIPO_TAMANIO_GENERAL,false,true,this);
			
		this.jmenuBarDetalleTipoIva.add(this.jmenuDetalleArchivoTipoIva);		
		this.jmenuBarDetalleTipoIva.add(this.jmenuDetalleAccionesTipoIva);		
		this.jmenuBarDetalleTipoIva.add(this.jmenuDetalleDatosTipoIva);		
		
		//MENU RELACIONES
		if(!this.conCargarMinimo) {
			FuncionesSwing.setBoldMenu(this.jmenuDetalleTipoIva, STIPO_TAMANIO_GENERAL,false,true,this);
			
			this.jmenuBarDetalleTipoIva.add(this.jmenuDetalleTipoIva);		
		}
		//DETALLE_FIN
		
		
		//AGREGA MENU DETALLE A PANTALLA
		this.setJMenuBar(this.jmenuBarDetalleTipoIva);				
	}
	
	
	public void inicializarElementosCamposTipoIva() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		jLabelIdTipoIva = new JLabelMe();
		jLabelIdTipoIva.setText(""+Constantes2.S_CODIGO_UNICO+"");
		jLabelIdTipoIva.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdTipoIva.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdTipoIva.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelIdTipoIva,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jPanelidTipoIva = new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelidTipoIva.setToolTipText(TipoIvaConstantesFunciones.LABEL_ID);
		this.gridaBagLayoutTipoIva= new GridBagLayout();

		this.jPanelidTipoIva.setLayout(this.gridaBagLayoutTipoIva);

		jTextFieldidTipoIva = new JTextFieldMe();
		jTextFieldidTipoIva.setText("Id");

		jTextFieldidTipoIva.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jTextFieldidTipoIva.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jTextFieldidTipoIva.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));



					
		this.jLabelcodigoTipoIva = new JLabelMe();
		this.jLabelcodigoTipoIva.setText(""+TipoIvaConstantesFunciones.LABEL_CODIGO+" : *");
		this.jLabelcodigoTipoIva.setToolTipText("Codigo");
		this.jLabelcodigoTipoIva.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcodigoTipoIva.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcodigoTipoIva.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelcodigoTipoIva,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelcodigoTipoIva=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelcodigoTipoIva.setToolTipText(TipoIvaConstantesFunciones.LABEL_CODIGO);
		this.gridaBagLayoutTipoIva = new GridBagLayout();
		this.jPanelcodigoTipoIva.setLayout(this.gridaBagLayoutTipoIva);


		jTextFieldcodigoTipoIva= new JTextFieldMe();

		jTextFieldcodigoTipoIva.setEnabled(false);
		jTextFieldcodigoTipoIva.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcodigoTipoIva.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcodigoTipoIva.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldcodigoTipoIva,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtoncodigoTipoIvaBusqueda= new JButtonMe();
		this.jButtoncodigoTipoIvaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncodigoTipoIvaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncodigoTipoIvaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtoncodigoTipoIvaBusqueda.setText("U");
		this.jButtoncodigoTipoIvaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtoncodigoTipoIvaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtoncodigoTipoIvaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldcodigoTipoIva.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldcodigoTipoIva.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"codigoTipoIvaBusqueda"));

		if(this.tipoivaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtoncodigoTipoIvaBusqueda.setVisible(false);		}


					
		this.jLabelnombreTipoIva = new JLabelMe();
		this.jLabelnombreTipoIva.setText(""+TipoIvaConstantesFunciones.LABEL_NOMBRE+" : *");
		this.jLabelnombreTipoIva.setToolTipText("Nombre");
		this.jLabelnombreTipoIva.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnombreTipoIva.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnombreTipoIva.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelnombreTipoIva,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelnombreTipoIva=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelnombreTipoIva.setToolTipText(TipoIvaConstantesFunciones.LABEL_NOMBRE);
		this.gridaBagLayoutTipoIva = new GridBagLayout();
		this.jPanelnombreTipoIva.setLayout(this.gridaBagLayoutTipoIva);


		jTextAreanombreTipoIva= new JTextAreaMe();
		jTextAreanombreTipoIva.setEnabled(false);
		jTextAreanombreTipoIva.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreTipoIva.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreTipoIva.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreTipoIva.setLineWrap(true);
		jTextAreanombreTipoIva.setWrapStyleWord(true);
		jTextAreanombreTipoIva.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreanombreTipoIva.setRows(4);

		FuncionesSwing.setBoldTextArea(jTextAreanombreTipoIva,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPanenombreTipoIva = new JScrollPane(jTextAreanombreTipoIva);
		jscrollPanenombreTipoIva.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanenombreTipoIva.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanenombreTipoIva.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));

		this.jButtonnombreTipoIvaBusqueda= new JButtonMe();
		this.jButtonnombreTipoIvaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombreTipoIvaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombreTipoIvaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonnombreTipoIvaBusqueda.setText("U");
		this.jButtonnombreTipoIvaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonnombreTipoIvaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonnombreTipoIvaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreanombreTipoIva.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreanombreTipoIva.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"nombreTipoIvaBusqueda"));

		if(this.tipoivaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonnombreTipoIvaBusqueda.setVisible(false);		}


	}
	
	public void inicializarElementosCamposForeigKeysTipoIva() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
	}
	
	public void jButtonActionPerformedTecladoGeneral(String sTipo,ActionEvent evt) {
		//System.out.println("TRANSFIERE EL MANEJO AL PADRE O FORM PRINCIPAL");
		
		jInternalFrameParent.jButtonActionPerformedTecladoGeneral(sTipo,evt);
	}
	
	//JPanel
	//@SuppressWarnings({"unchecked" })//"rawtypes"
	public JScrollPane getJContentPane(int iWidth,int iHeight,JDesktopPane jDesktopPane,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {	
		//PARA TABLA PARAMETROS
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		this.jContentPane = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
				
		this.usuarioActual=usuarioActual;
		this.resumenUsuarioActual=resumenUsuarioActual;
		this.opcionActual=opcionActual;
		
		this.moduloActual=moduloActual;		
		this.parametroGeneralSg=parametroGeneralSg;		
		this.parametroGeneralUsuario=parametroGeneralUsuario;	
		
		this.jDesktopPane=jDesktopPane;
				
		this.conFuncionalidadRelaciones=parametroGeneralUsuario.getcon_guardar_relaciones();
		
		
		int iGridyPrincipal=0;
		
		
		this.inicializarToolBar();		
		
		
		//CARGAR MENUS
		//this.jInternalFrameDetalleTipoIva = new TipoIvaBeanSwingJInternalFrameAdditional(paginaTipo);//JInternalFrameBase("Tipo Iva DATOS");
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutTipoIva= new GridBagLayout();
		

		
		String sToolTipTipoIva="";
		sToolTipTipoIva=TipoIvaConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipTipoIva+="(Contabilidad.TipoIva)";
		}
		
		if(!this.tipoivaSessionBean.getEsGuardarRelacionado()) {
			sToolTipTipoIva+="_"+this.opcionActual.getId();
		}
								
		
		this.jButtonNuevoTipoIva = new JButtonMe();
		this.jButtonModificarTipoIva = new JButtonMe();
        this.jButtonActualizarTipoIva = new JButtonMe();
        this.jButtonEliminarTipoIva = new JButtonMe();
        this.jButtonCancelarTipoIva = new JButtonMe();
        this.jButtonGuardarCambiosTipoIva = new JButtonMe();
		this.jButtonGuardarCambiosTablaTipoIva = new JButtonMe();
		this.jButtonCerrarTipoIva = new JButtonMe();
		
		this.jScrollPanelDatosTipoIva = new JScrollPane();   
        this.jScrollPanelDatosEdicionTipoIva = new JScrollPane();
		this.jScrollPanelDatosGeneralTipoIva = new JScrollPane();
				
		
		
		this.jPanelCamposTipoIva = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelCamposOcultosTipoIva = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
        this.jPanelAccionesTipoIva = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		this.jPanelAccionesFormularioTipoIva = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		this.sPath=" <---> Acceso: Tipo Iva";
		
		if(!this.tipoivaSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosTipoIva.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Tipo Ivas" + this.sPath));
		} else {
			this.jScrollPanelDatosTipoIva.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosEdicionTipoIva.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		this.jScrollPanelDatosGeneralTipoIva.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
			
        this.jPanelCamposTipoIva.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
        this.jPanelCamposTipoIva.setName("jPanelCamposTipoIva"); 

		this.jPanelCamposOcultosTipoIva.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos Ocultos"));
        this.jPanelCamposOcultosTipoIva.setName("jPanelCamposOcultosTipoIva"); 

        this.jPanelAccionesTipoIva.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesTipoIva.setToolTipText("Acciones");
        this.jPanelAccionesTipoIva.setName("Acciones"); 

		this.jPanelAccionesFormularioTipoIva.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones Extra/Post"));
        this.jPanelAccionesFormularioTipoIva.setToolTipText("Acciones");
        this.jPanelAccionesFormularioTipoIva.setName("Acciones"); 
		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosEdicionTipoIva, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralTipoIva, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosTipoIva, STIPO_TAMANIO_GENERAL,false,false,this);		
		FuncionesSwing.setBoldPanel(this.jPanelCamposTipoIva, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelCamposOcultosTipoIva, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelAccionesFormularioTipoIva, STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {
		
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		
        this.jButtonNuevoTipoIva.setText("Nuevo");
		this.jButtonModificarTipoIva.setText("Editar");
        this.jButtonActualizarTipoIva.setText("Actualizar");
        this.jButtonEliminarTipoIva.setText("Eliminar");
        this.jButtonCancelarTipoIva.setText("Cancelar");
        this.jButtonGuardarCambiosTipoIva.setText("Guardar");
		this.jButtonGuardarCambiosTablaTipoIva.setText("Guardar");
		this.jButtonCerrarTipoIva.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoTipoIva,"nuevo_button","Nuevo",this.tipoivaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonModificarTipoIva,"modificar_button","Editar",this.tipoivaSessionBean.getEsGuardarRelacionado());
       	FuncionesSwing.addImagenButtonGeneral(this.jButtonActualizarTipoIva,"actualizar_button","Actualizar",this.tipoivaSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonEliminarTipoIva,"eliminar_button","Eliminar",this.tipoivaSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonCancelarTipoIva,"cancelar_button","Cancelar",this.tipoivaSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTipoIva,"guardarcambios_button","Guardar",this.tipoivaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaTipoIva,"guardarcambiostabla_button","Guardar",this.tipoivaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarTipoIva,"cerrar_button","Salir",this.tipoivaSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoTipoIva, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonModificarTipoIva, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTipoIva, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaTipoIva, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarTipoIva, STIPO_TAMANIO_GENERAL,false,true,this);
		
		FuncionesSwing.setBoldButton(this.jButtonActualizarTipoIva, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonEliminarTipoIva, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonCancelarTipoIva, STIPO_TAMANIO_GENERAL,false,false,this);
		
		this.jButtonNuevoTipoIva.setToolTipText("Nuevo"+" "+TipoIvaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonModificarTipoIva.setToolTipText("Editar"+" "+TipoIvaConstantesFunciones.SCLASSWEBTITULO+"");// + FuncionesSwing.getKeyMensaje("MODIFICAR"))
        this.jButtonActualizarTipoIva.setToolTipText("Actualizar"+" "+TipoIvaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
        this.jButtonEliminarTipoIva.setToolTipText("Eliminar)"+" "+TipoIvaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"));
        this.jButtonCancelarTipoIva.setToolTipText("Cancelar"+" "+TipoIvaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"));
        this.jButtonGuardarCambiosTipoIva.setToolTipText("Guardar"+" "+TipoIvaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonGuardarCambiosTablaTipoIva.setToolTipText("Guardar"+" "+TipoIvaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarTipoIva.setToolTipText("Salir"+" "+TipoIvaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
		//HOT KEYS
		/*
		N->Nuevo
		N->Alt + Nuevo Relaciones (ANTES R)
		A->Actualizar
		E->Eliminar
		S->Cerrar
		C->->Mayus + Cancelar (ANTES Q->Quit)
		G->Guardar Cambios
		D->Duplicar
		C->Alt + Cop?ar
		O->Orden
		N->Nuevo Tabla
		R->Recargar Informacion Inicial (ANTES I)
		Alt + Pag.Down->Siguientes
		Alt + Pag.Up->Anteriores
		
		NO UTILIZADOS
		M->Modificar
		
		*/
		String sMapKey = "";
		InputMap inputMap =null;
		
		//NUEVO
		sMapKey = "NuevoTipoIva";
		inputMap = this.jButtonNuevoTipoIva.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoTipoIva.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoTipoIva"));
		
		//ACTUALIZAR
		sMapKey = "ActualizarTipoIva";
		inputMap = this.jButtonActualizarTipoIva.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ACTUALIZAR") , FuncionesSwing.getMaskKey("ACTUALIZAR")), sMapKey);
		
		this.jButtonActualizarTipoIva.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ActualizarTipoIva"));
		
		//ELIMINAR
		sMapKey = "EliminarTipoIva";
		inputMap = this.jButtonEliminarTipoIva.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ELIMINAR") , FuncionesSwing.getMaskKey("ELIMINAR")), sMapKey);
		
		this.jButtonEliminarTipoIva.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"EliminarTipoIva"));
		
		//CANCELAR	
		sMapKey = "CancelarTipoIva";
		inputMap = this.jButtonCancelarTipoIva.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CANCELAR") , FuncionesSwing.getMaskKey("CANCELAR")), sMapKey);
		
		this.jButtonCancelarTipoIva.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CancelarTipoIva"));
		
		//CERRAR		
		sMapKey = "CerrarTipoIva";
		inputMap = this.jButtonCerrarTipoIva.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarTipoIva.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarTipoIva"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaTipoIva";
		inputMap = this.jButtonGuardarCambiosTablaTipoIva.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaTipoIva.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaTipoIva"));
		
		//HOT KEYS
		
		this.jCheckBoxPostAccionNuevoTipoIva = new JCheckBoxMe();
		this.jCheckBoxPostAccionNuevoTipoIva.setText("Nuevo");
		this.jCheckBoxPostAccionNuevoTipoIva.setToolTipText("Nuevo TipoIva");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionNuevoTipoIva, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinCerrarTipoIva = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinCerrarTipoIva.setText("Sin Cerrar");
		this.jCheckBoxPostAccionSinCerrarTipoIva.setToolTipText("Sin Cerrar Ventana TipoIva");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinCerrarTipoIva, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinMensajeTipoIva = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinMensajeTipoIva.setText("Sin Mensaje");
		this.jCheckBoxPostAccionSinMensajeTipoIva.setToolTipText("Sin Mensaje Confirmacion");				
				
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinMensajeTipoIva, STIPO_TAMANIO_GENERAL,false,false,this);       	
       
				
		
			
			
		this.jComboBoxTiposAccionesTipoIva = new JComboBoxMe();
		//this.jComboBoxTiposAccionesTipoIva.setText("Accion");
		this.jComboBoxTiposAccionesTipoIva.setToolTipText("Tipos de Acciones");
							
		

		this.jComboBoxTiposAccionesFormularioTipoIva = new JComboBoxMe();
		//this.jComboBoxTiposAccionesFormularioTipoIva.setText("Accion");				
    	this.jComboBoxTiposAccionesFormularioTipoIva.setToolTipText("Tipos de Acciones");
	
		this.jLabelAccionesTipoIva = new JLabelMe();
		
		this.jLabelAccionesTipoIva.setText("Acciones");		
		this.jLabelAccionesTipoIva.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesTipoIva.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesTipoIva.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
        //HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		//HOT KEYS2
		
		//ELEMENTOS
		this.inicializarElementosCamposTipoIva();
		
		//ELEMENTOS FK
		this.inicializarElementosCamposForeigKeysTipoIva();
				
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		this.jTabbedPaneRelacionesTipoIva=new JTabbedPane();
		this.jTabbedPaneRelacionesTipoIva.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Relacionados"));
		
		//ESTA EN BEAN

		
		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneRelacionesTipoIva,STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		int iPosXAccionPaginacion=0;
		
		
		
				
		
		this.jComboBoxTiposAccionesTipoIva.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesTipoIva.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesTipoIva.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesTipoIva, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		
		
		this.jComboBoxTiposAccionesFormularioTipoIva.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioTipoIva.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioTipoIva.setPreferredSize(new Dimension(145,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesFormularioTipoIva, STIPO_TAMANIO_GENERAL,false,false,this);				
		
		GridBagLayout gridaBagLayoutCamposTipoIva = new GridBagLayout();
		GridBagLayout gridaBagLayoutCamposOcultosTipoIva = new GridBagLayout();
		
		this.jPanelCamposTipoIva.setLayout(gridaBagLayoutCamposTipoIva);
		this.jPanelCamposOcultosTipoIva.setLayout(gridaBagLayoutCamposOcultosTipoIva);
		
		;
		;
		
		
		//SUBPANELES SIMPLES
		//SUBPANELES POR CAMPO
        
	this.gridBagConstraintsTipoIva = new GridBagConstraints();
	this.gridBagConstraintsTipoIva.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoIva.gridy = 0;
	this.gridBagConstraintsTipoIva.gridx = 0;
	this.gridBagConstraintsTipoIva.ipadx = 0;
	this.gridBagConstraintsTipoIva.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelidTipoIva.add(jLabelIdTipoIva, this.gridBagConstraintsTipoIva);



	this.gridBagConstraintsTipoIva = new GridBagConstraints();
	this.gridBagConstraintsTipoIva.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoIva.gridy = 0;
	this.gridBagConstraintsTipoIva.gridx = 1;
	this.gridBagConstraintsTipoIva.ipadx = 0;
	this.gridBagConstraintsTipoIva.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelidTipoIva.add(jTextFieldidTipoIva, this.gridBagConstraintsTipoIva);


	this.gridBagConstraintsTipoIva = new GridBagConstraints();
	this.gridBagConstraintsTipoIva.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoIva.gridy = 0;
	this.gridBagConstraintsTipoIva.gridx = 0;
	this.gridBagConstraintsTipoIva.ipadx = 0;
	this.gridBagConstraintsTipoIva.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelcodigoTipoIva.add(jLabelcodigoTipoIva, this.gridBagConstraintsTipoIva);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsTipoIva = new GridBagConstraints();
		//this.gridBagConstraintsTipoIva.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoIva.gridy = 0;
		this.gridBagConstraintsTipoIva.gridx = 2;
		this.gridBagConstraintsTipoIva.ipadx = 0;
		this.gridBagConstraintsTipoIva.insets = new Insets(0, 0, 0, 0);
		this.jPanelcodigoTipoIva.add(jButtoncodigoTipoIvaBusqueda, this.gridBagConstraintsTipoIva);
	}

	this.gridBagConstraintsTipoIva = new GridBagConstraints();
	this.gridBagConstraintsTipoIva.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoIva.gridy = 0;
	this.gridBagConstraintsTipoIva.gridx = 1;
	this.gridBagConstraintsTipoIva.ipadx = 0;
	this.gridBagConstraintsTipoIva.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelcodigoTipoIva.add(jTextFieldcodigoTipoIva, this.gridBagConstraintsTipoIva);


	this.gridBagConstraintsTipoIva = new GridBagConstraints();
	this.gridBagConstraintsTipoIva.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoIva.gridy = 0;
	this.gridBagConstraintsTipoIva.gridx = 0;
	this.gridBagConstraintsTipoIva.ipadx = 0;
	this.gridBagConstraintsTipoIva.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelnombreTipoIva.add(jLabelnombreTipoIva, this.gridBagConstraintsTipoIva);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsTipoIva = new GridBagConstraints();
		//this.gridBagConstraintsTipoIva.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoIva.gridy = 0;
		this.gridBagConstraintsTipoIva.gridx = 2;
		this.gridBagConstraintsTipoIva.ipadx = 0;
		this.gridBagConstraintsTipoIva.insets = new Insets(0, 0, 0, 0);
		this.jPanelnombreTipoIva.add(jButtonnombreTipoIvaBusqueda, this.gridBagConstraintsTipoIva);
	}

	this.gridBagConstraintsTipoIva = new GridBagConstraints();
	this.gridBagConstraintsTipoIva.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoIva.gridy = 0;
	this.gridBagConstraintsTipoIva.gridx = 1;
	this.gridBagConstraintsTipoIva.ipadx = 0;
	this.gridBagConstraintsTipoIva.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelnombreTipoIva.add(jscrollPanenombreTipoIva, this.gridBagConstraintsTipoIva);


		//SUBPANELES SIMPLES
		
		//SUBPANELES EN PANEL
		//SUBPANELES EN PANEL CAMPOS NORMAL				
		
	this.gridBagConstraintsTipoIva = new GridBagConstraints();
	this.gridBagConstraintsTipoIva.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsTipoIva.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsTipoIva.gridy = iYPanelCamposTipoIva;
	this.gridBagConstraintsTipoIva.gridx = iXPanelCamposTipoIva++;
	this.gridBagConstraintsTipoIva.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsTipoIva.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposTipoIva.add(this.jPanelidTipoIva, this.gridBagConstraintsTipoIva);



	if(iXPanelCamposTipoIva % 1==0) {
		iXPanelCamposTipoIva=0;
		iYPanelCamposTipoIva++;
	}
	this.gridBagConstraintsTipoIva = new GridBagConstraints();
	this.gridBagConstraintsTipoIva.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsTipoIva.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsTipoIva.gridy = iYPanelCamposTipoIva;
	this.gridBagConstraintsTipoIva.gridx = iXPanelCamposTipoIva++;
	this.gridBagConstraintsTipoIva.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsTipoIva.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposTipoIva.add(this.jPanelcodigoTipoIva, this.gridBagConstraintsTipoIva);



	if(iXPanelCamposTipoIva % 1==0) {
		iXPanelCamposTipoIva=0;
		iYPanelCamposTipoIva++;
	}
	this.gridBagConstraintsTipoIva = new GridBagConstraints();
	this.gridBagConstraintsTipoIva.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsTipoIva.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsTipoIva.gridy = iYPanelCamposTipoIva;
	this.gridBagConstraintsTipoIva.gridx = iXPanelCamposTipoIva++;
	this.gridBagConstraintsTipoIva.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsTipoIva.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposTipoIva.add(this.jPanelnombreTipoIva, this.gridBagConstraintsTipoIva);



	if(iXPanelCamposTipoIva % 1==0) {
		iXPanelCamposTipoIva=0;
		iYPanelCamposTipoIva++;
	}
		
		//SUBPANELES EN PANEL CAMPOS OCULTOS				
		
		
		//SUBPANELES EN PANEL CAMPOS INICIO				
		
		
		//SUBPANELES EN PANEL CAMPOS FIN				
		
				
		//SUBPANELES EN PANEL
		
		//ELEMENTOS TABLAS PARAMETOS
			//SUBPANELES POR CAMPO
		if(!this.conCargarMinimo) {
			
			//SUBPANELES EN PANEL CAMPOS				
			
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
			 		
			
		
		
		
		
		
		Integer iGridXParametrosAccionesFormulario=0;
		Integer iGridYParametrosAccionesFormulario=0;
			
		GridBagLayout gridaBagLayoutAccionesTipoIva= new GridBagLayout();
		this.jPanelAccionesTipoIva.setLayout(gridaBagLayoutAccionesTipoIva);
		
		GridBagLayout gridaBagLayoutAccionesFormularioTipoIva= new GridBagLayout();
		this.jPanelAccionesFormularioTipoIva.setLayout(gridaBagLayoutAccionesFormularioTipoIva);
		
		this.gridBagConstraintsTipoIva = new GridBagConstraints();
		this.gridBagConstraintsTipoIva.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsTipoIva.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioTipoIva.add(this.jComboBoxTiposAccionesFormularioTipoIva, this.gridBagConstraintsTipoIva);

		this.gridBagConstraintsTipoIva = new GridBagConstraints();
		this.gridBagConstraintsTipoIva.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsTipoIva.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioTipoIva.add(this.jCheckBoxPostAccionNuevoTipoIva, this.gridBagConstraintsTipoIva);
			
		//DEBE CERRARSE Y ACTUALIZARSE TODO NUEVAMENTE, SI ES RELACIONADO PUEDE FUNCIONAR
		//if(!this.tipoivaSessionBean.getEstaModoGuardarRelaciones()) {		
		//SE ARRIESGA
		//if(!this.conFuncionalidadRelaciones) {		
			this.gridBagConstraintsTipoIva = new GridBagConstraints();
			this.gridBagConstraintsTipoIva.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsTipoIva.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioTipoIva.add(this.jCheckBoxPostAccionSinCerrarTipoIva, this.gridBagConstraintsTipoIva);
		//}
		
		
		//NO TIENE MENSAJE POR DEFINICION, O ES MUY COMPLEJO LA PANTALLA PARA HACERLO MAS COMPLICADO
		if(!this.tipoivaSessionBean.getEsGuardarRelacionado()
			){				
			//&& !this.tipoivaSessionBean.getEstaModoGuardarRelaciones()) {
							
			this.gridBagConstraintsTipoIva = new GridBagConstraints();
			this.gridBagConstraintsTipoIva.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsTipoIva.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioTipoIva.add(this.jCheckBoxPostAccionSinMensajeTipoIva, this.gridBagConstraintsTipoIva);
		}
		
		
		int iPosXAccion=0;
		
		this.gridBagConstraintsTipoIva = new GridBagConstraints();
		this.gridBagConstraintsTipoIva.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoIva.gridy = 0;
		this.gridBagConstraintsTipoIva.gridx = iPosXAccion++;
			
		this.jPanelAccionesTipoIva.add(this.jButtonModificarTipoIva, this.gridBagConstraintsTipoIva);							

		this.gridBagConstraintsTipoIva = new GridBagConstraints();
		this.gridBagConstraintsTipoIva.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoIva.gridy = 0;
		this.gridBagConstraintsTipoIva.gridx =iPosXAccion++;
			
		this.jPanelAccionesTipoIva.add(this.jButtonEliminarTipoIva, this.gridBagConstraintsTipoIva);
		
			
		this.gridBagConstraintsTipoIva = new GridBagConstraints();
		this.gridBagConstraintsTipoIva.gridy = 0;		
		this.gridBagConstraintsTipoIva.gridx = iPosXAccion++;
		
		this.jPanelAccionesTipoIva.add(this.jButtonActualizarTipoIva, this.gridBagConstraintsTipoIva);


		this.gridBagConstraintsTipoIva = new GridBagConstraints();
		this.gridBagConstraintsTipoIva.gridy = 0;		
		this.gridBagConstraintsTipoIva.gridx = iPosXAccion++;
		
		this.jPanelAccionesTipoIva.add(this.jButtonGuardarCambiosTipoIva, this.gridBagConstraintsTipoIva);	
		
		this.gridBagConstraintsTipoIva = new GridBagConstraints();
		this.gridBagConstraintsTipoIva.gridy = 0;		
		this.gridBagConstraintsTipoIva.gridx =iPosXAccion++;
		
		this.jPanelAccionesTipoIva.add(this.jButtonCancelarTipoIva, this.gridBagConstraintsTipoIva);
		
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutTipoIva = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutTipoIva);
		
		if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.tipoivaSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsTipoIva = new GridBagConstraints();						
			this.gridBagConstraintsTipoIva.gridy = iGridyPrincipal++;
			this.gridBagConstraintsTipoIva.gridx = 0;		
			//this.gridBagConstraintsTipoIva.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoIva.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsTipoIva.ipadx = 100;
				
			
		}
		
		//PROCESANDO EN OTRA PANTALLA
		
		
		int iGridxBusquedasParametros=0;
		
	
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			//NO BUSQUEDA
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		
		this.gridBagConstraintsTipoIva = new GridBagConstraints();
		this.gridBagConstraintsTipoIva.gridy =iGridyPrincipal++;
		this.gridBagConstraintsTipoIva.gridx =0;
		this.gridBagConstraintsTipoIva.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsTipoIva.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosTipoIva, this.gridBagConstraintsTipoIva);
				
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);

		
			
		//if(TipoIvaJInternalFrame.CON_DATOS_FRAME) {				
			//this.jInternalFrameDetalleTipoIva = new TipoIvaBeanSwingJInternalFrameAdditional();//JInternalFrameBase("Tipo Iva DATOS");
			
			this.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	        //this.setjInternalFrameParent(this);
	        
			iHeightFormularioMaximo=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
	        
	        if(iHeightFormulario>iHeightFormularioMaximo) {
	        	iHeightFormulario=iHeightFormularioMaximo;
	        }
			
			iWidthFormularioMaximo=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
	        
			if(iWidthFormulario>iWidthFormularioMaximo) {
	        	iWidthFormulario=iWidthFormularioMaximo;
	        }
			
	        //this.setTitle("[FOR] - Tipo Iva DATOS");
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Tipo Iva Formulario",PaginaTipo.FORMULARIO,paginaTipo));			
	        this.setSize(iWidthFormulario,iHeightFormulario);        
		   				
			this.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	        this.setResizable(true);
	        this.setClosable(true);
	        this.setMaximizable(true);
		    
			TipoIvaModel tipoivaModel=new TipoIvaModel(this);
			
			//SI USARA CLASE INTERNA
			//TipoIvaModel.TipoIvaFocusTraversalPolicy tipoivaFocusTraversalPolicy = tipoivaModel.new TipoIvaFocusTraversalPolicy(this);
			
			//tipoivaFocusTraversalPolicy.settipoivaJInternalFrame(this);
			
			this.setFocusTraversalPolicy(tipoivaModel);
			
			
			this.jContentPaneDetalleTipoIva = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			GridBagLayout gridaBagLayoutDetalleTipoIva = new GridBagLayout();	
			this.jContentPaneDetalleTipoIva.setLayout(gridaBagLayoutDetalleTipoIva);
			
			GridBagLayout gridaBagLayoutBusquedasParametrosTipoIva = new GridBagLayout();
			
			
if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
				
				//AGREGA TOOLBAR DETALLE A PANTALLA
				
				this.gridBagConstraintsTipoIva = new GridBagConstraints();
				this.gridBagConstraintsTipoIva.gridy = iGridyRelaciones++;		
				this.gridBagConstraintsTipoIva.gridx = 0;
					
				
				this.jContentPaneDetalleTipoIva.add(jTtoolBarDetalleTipoIva, gridBagConstraintsTipoIva);								
				
}
			
			this.jScrollPanelDatosEdicionTipoIva=   new JScrollPane(jContentPaneDetalleTipoIva,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionTipoIva.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionTipoIva.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionTipoIva.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			this.jScrollPanelDatosGeneralTipoIva=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralTipoIva.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralTipoIva.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralTipoIva.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsTipoIva = new GridBagConstraints();
			
			
	        this.gridBagConstraintsTipoIva.gridy = iGridyRelaciones++;		
	        this.gridBagConstraintsTipoIva.gridx = 0;
	        
			this.jContentPaneDetalleTipoIva.add(jPanelCamposTipoIva, gridBagConstraintsTipoIva);
			
			
			
			
			//if(!this.conCargarMinimo) {
			
			
			;
			//}
						
			this.conMaximoRelaciones=true;
			
			if(this.parametroGeneralUsuario.getcon_cargar_por_parte()) {
				
			}									
			
			//CARGA O NO CARGA RELACIONADOS(MAESTRO DETALLE)
									  // ABAJO VIENE DE PARAMETRO GENERAL USUARIO
			if(conMaximoRelaciones) { // && this.conFuncionalidadRelaciones) {
				if(!this.conCargarMinimo) {
					if(cargarRelaciones 
						&& tipoivaSessionBean.getConGuardarRelaciones()
						) {
					//paraCargarPorParte es false por defecto(y ejecuta funcion normal cargando detalle en tab panel), si se utiliza funcionalidad es true y carga tab panel auxiliar temporal
					
					this.cargarSessionConBeanSwingJInternalFrameFacturaDiario(this.puedeCargarPorParteFacturaDiario,false,-1);
					this.cargarSessionConBeanSwingJInternalFrameTransaccionLocal(this.puedeCargarPorParteTransaccionLocal,false,-1);
					
					if(this.tipoivaSessionBean.getConGuardarRelaciones()) {
						this.gridBagConstraintsTipoIva= new GridBagConstraints();
						this.gridBagConstraintsTipoIva.gridy = iGridyRelaciones++;
						this.gridBagConstraintsTipoIva.gridx = 0;
						this.jContentPaneDetalleTipoIva.add(this.jTabbedPaneRelacionesTipoIva, this.gridBagConstraintsTipoIva);
					}
					
					//RELACIONES OTROS AGRUPADOS
					;
					
					} else {
						//this.jButtonNuevoRelacionesTipoIva.setVisible(false);
						
					this.cargarSessionConBeanSwingJInternalFrameFacturaDiario(true,false,-1);
					this.cargarSessionConBeanSwingJInternalFrameTransaccionLocal(true,false,-1);
					}
				}
			}
			
			Boolean tieneColumnasOcultas=false;
			
		
						
			
			if(!Constantes.ISDEVELOPING) {
	       		this.jPanelCamposOcultosTipoIva.setVisible(false);
			} else {
				if(tieneColumnasOcultas) {
					this.gridBagConstraintsTipoIva = new GridBagConstraints();
					this.gridBagConstraintsTipoIva.fill=GridBagConstraints.NONE;
					this.gridBagConstraintsTipoIva.anchor = GridBagConstraints.WEST;
					
					this.gridBagConstraintsTipoIva.gridy = iGridyRelaciones++;		
					this.gridBagConstraintsTipoIva.gridx = 0;
					
				
					this.jContentPaneDetalleTipoIva.add(jPanelCamposOcultosTipoIva, gridBagConstraintsTipoIva);
				
					this.jPanelCamposOcultosTipoIva.setVisible(true);
				}
			}					
			
			
			
			
			this.gridBagConstraintsTipoIva = new GridBagConstraints();
			this.gridBagConstraintsTipoIva.gridy = iGridyRelaciones++;//7;		
	        this.gridBagConstraintsTipoIva.gridx = 0;
	        this.gridBagConstraintsTipoIva.anchor = GridBagConstraints.CENTER;//WEST;
			
			
			
			this.jContentPaneDetalleTipoIva.add(this.jPanelAccionesFormularioTipoIva, this.gridBagConstraintsTipoIva);							
			
			
			
			this.gridBagConstraintsTipoIva = new GridBagConstraints();
	        this.gridBagConstraintsTipoIva.gridy = iGridyRelaciones;//7;		
	        this.gridBagConstraintsTipoIva.gridx = 0;
	        
			
			this.jContentPaneDetalleTipoIva.add(this.jPanelAccionesTipoIva, this.gridBagConstraintsTipoIva);							
			
	        //this.setContentPane(jScrollPanelDatosEdicionTipoIva);
			
		//} else {
			//DISENO_DETALLE COMENTAR Y
			//DISENO_DETALLE(Solo Descomentar Seccion Inferior)
			//NOTA-DISENO_DETALLE(Si cambia lo de abajo, cambiar lo comentado, Al final no es lo mismo)
			
			/*
			this.jScrollPanelDatosEdicionTipoIva=   new JScrollPane(this.jPanelCamposTipoIva,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionTipoIva.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionTipoIva.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionTipoIva.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			
			this.gridBagConstraintsTipoIva = new GridBagConstraints();
			this.gridBagConstraintsTipoIva.gridy = iGridyPrincipal++;		
			this.gridBagConstraintsTipoIva.gridx = 0;
			this.gridBagConstraintsTipoIva.fill = GridBagConstraints.BOTH;
			this.gridBagConstraintsTipoIva.ipady = this.getSize().height-yOffset*3;
			this.gridBagConstraintsTipoIva.anchor = GridBagConstraints.WEST;
			
			this.jContentPane.add(this.jScrollPanelDatosEdicionTipoIva, this.gridBagConstraintsTipoIva);
			
			//ACCIONES FORMULARIO
			this.gridBagConstraintsTipoIva = new GridBagConstraints();
			this.gridBagConstraintsTipoIva.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsTipoIva.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesFormularioTipoIva, this.gridBagConstraintsTipoIva);			
			
			this.gridBagConstraintsTipoIva = new GridBagConstraints();
			this.gridBagConstraintsTipoIva.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsTipoIva.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesTipoIva, this.gridBagConstraintsTipoIva);									
			*/
		//}								
			
		//DISENO_DETALLE-(Descomentar)
		/*
		this.gridBagConstraintsTipoIva = new GridBagConstraints();
		this.gridBagConstraintsTipoIva.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoIva.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposTipoIva, this.gridBagConstraintsTipoIva);
			
			
		this.gridBagConstraintsTipoIva = new GridBagConstraints();
		this.gridBagConstraintsTipoIva.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoIva.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosTipoIva, this.gridBagConstraintsTipoIva);
		
			
		this.gridBagConstraintsTipoIva = new GridBagConstraints();
		this.gridBagConstraintsTipoIva.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsTipoIva.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesTipoIva, this.gridBagConstraintsTipoIva);
		*/
		
			
     	//pack();
		
		
		//return this.jScrollPanelDatosGeneralTipoIva;//jContentPane;
		
		return jScrollPanelDatosEdicionTipoIva;
    } 
	
		

	public void cargarSessionConBeanSwingJInternalFrameFacturaDiario(Boolean soloSession,Boolean actualizarTab,Integer iIndexTab) throws Exception {

		//SOLO INICIALIZA SESSION (YA NO, CONSUME MUCHA MEMORIA)
		this.facturadiarioSessionBean=new FacturaDiarioSessionBean();
		this.facturadiarioSessionBean.setConGuardarRelaciones(false);
		this.facturadiarioSessionBean.setEsGuardarRelacionado(true);

		this.facturadiarioBeanSwingJInternalFrame=null;//new FacturaDiarioBeanSwingJInternalFrame(false,true,false);

		if(!soloSession) {
			//this.facturadiarioBeanSwingJInternalFramePopup=new FacturaDiarioBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,true);
			//this.facturadiarioBeanSwingJInternalFramePopup.jInternalFrameParent=this;


			if(this.facturadiarioSessionBean.getEsGuardarRelacionado()) {

				FacturaDiarioJInternalFrame.STIPO_TAMANIO_GENERAL=TipoIvaJInternalFrame.STIPO_TAMANIO_GENERAL;
				FacturaDiarioJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=TipoIvaJInternalFrame.STIPO_TAMANIO_GENERAL;

				this.facturadiarioSessionBean.setEsGuardarRelacionado(true);

				this.facturadiarioBeanSwingJInternalFrame=new FacturaDiarioBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.SECUNDARIO,false,true,false,false);//false->4

				this.facturadiarioBeanSwingJInternalFrame.setJInternalFrameParent(this);
				this.facturadiarioBeanSwingJInternalFrame.setfacturadiarioSessionBean(this.facturadiarioSessionBean);

				//this.gridBagConstraintsTipoIva = new GridBagConstraints();
				//this.gridBagConstraintsTipoIva.gridy = iGridyRelaciones++;
				//this.gridBagConstraintsTipoIva.gridx = 0;
				//this.jContentPaneDetalleTipoIva.add(this.facturadiarioBeanSwingJInternalFrame.getContentPane(), this.gridBagConstraintsTipoIva);

				if(!actualizarTab) {
					this.jTabbedPaneRelacionesTipoIva.add("Factura Diarios",this.facturadiarioBeanSwingJInternalFrame.getContentPane());
				} else {
					this.jTabbedPaneRelacionesTipoIva.setComponentAt(iIndexTab,this.facturadiarioBeanSwingJInternalFrame.getContentPane());
				}

				//FacturaDiarioJInternalFrame.ESTA_CARGADO_PORPARTE=true;
			} else {
				this.facturadiarioSessionBean.setEsGuardarRelacionado(false);
				this.facturadiarioBeanSwingJInternalFrame=null;//new FacturaDiarioBeanSwingJInternalFrame(false,false,jDesktopPane,this.usuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,false);
			}
		} else {
			if(this.facturadiarioSessionBean.getEsGuardarRelacionado()) {
				if(this.puedeCargarPorParteFacturaDiario) {
					this.jTabbedPaneRelacionesTipoIva.add("Factura Diarios",new JPanel());
				}
			}
		}
	}

	public void cargarSessionConBeanSwingJInternalFrameTransaccionLocal(Boolean soloSession,Boolean actualizarTab,Integer iIndexTab) throws Exception {

		//SOLO INICIALIZA SESSION (YA NO, CONSUME MUCHA MEMORIA)
		this.transaccionlocalSessionBean=new TransaccionLocalSessionBean();
		this.transaccionlocalSessionBean.setConGuardarRelaciones(false);
		this.transaccionlocalSessionBean.setEsGuardarRelacionado(true);

		this.transaccionlocalBeanSwingJInternalFrame=null;//new TransaccionLocalBeanSwingJInternalFrame(false,true,false);

		if(!soloSession) {
			//this.transaccionlocalBeanSwingJInternalFramePopup=new TransaccionLocalBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,true);
			//this.transaccionlocalBeanSwingJInternalFramePopup.jInternalFrameParent=this;


			if(this.transaccionlocalSessionBean.getEsGuardarRelacionado()) {

				TransaccionLocalJInternalFrame.STIPO_TAMANIO_GENERAL=TipoIvaJInternalFrame.STIPO_TAMANIO_GENERAL;
				TransaccionLocalJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=TipoIvaJInternalFrame.STIPO_TAMANIO_GENERAL;

				this.transaccionlocalSessionBean.setEsGuardarRelacionado(true);

				this.transaccionlocalBeanSwingJInternalFrame=new TransaccionLocalBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.SECUNDARIO,false,true,false,false);//false->4

				this.transaccionlocalBeanSwingJInternalFrame.setJInternalFrameParent(this);
				this.transaccionlocalBeanSwingJInternalFrame.settransaccionlocalSessionBean(this.transaccionlocalSessionBean);

				//this.gridBagConstraintsTipoIva = new GridBagConstraints();
				//this.gridBagConstraintsTipoIva.gridy = iGridyRelaciones++;
				//this.gridBagConstraintsTipoIva.gridx = 0;
				//this.jContentPaneDetalleTipoIva.add(this.transaccionlocalBeanSwingJInternalFrame.getContentPane(), this.gridBagConstraintsTipoIva);

				if(!actualizarTab) {
					this.jTabbedPaneRelacionesTipoIva.add("Transaccion Locales",this.transaccionlocalBeanSwingJInternalFrame.getContentPane());
				} else {
					this.jTabbedPaneRelacionesTipoIva.setComponentAt(iIndexTab,this.transaccionlocalBeanSwingJInternalFrame.getContentPane());
				}

				//TransaccionLocalJInternalFrame.ESTA_CARGADO_PORPARTE=true;
			} else {
				this.transaccionlocalSessionBean.setEsGuardarRelacionado(false);
				this.transaccionlocalBeanSwingJInternalFrame=null;//new TransaccionLocalBeanSwingJInternalFrame(false,false,jDesktopPane,this.usuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,false);
			}
		} else {
			if(this.transaccionlocalSessionBean.getEsGuardarRelacionado()) {
				if(this.puedeCargarPorParteTransaccionLocal) {
					this.jTabbedPaneRelacionesTipoIva.add("Transaccion Locales",new JPanel());
				}
			}
		}
	}
	
	
	
	
		public void cargarTransaccionLocalBeanSwingJInternalFrame(List<TipoIva> tipoivas,TipoIva tipoiva,TransaccionLocalBeanSwingJInternalFrame transaccionlocalBeanSwingJInternalFrame,/*Boolean conInicializar,*/Boolean conGuardarRelaciones,Boolean esGuardarRelacionado) throws Exception 
		{
			try
			{
				if(true/*conInicializar*/) {
					//GETCONTENTPANE SOLO UN PAPA, SE PIERDE PANEL, POR LO QUE SE CREA NUEVO POR CADA PANTALLA
					//transaccionlocalBeanSwingJInternalFrame=new TransaccionLocalBeanSwingJInternalFrame(false,false,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);

				}
					transaccionlocalBeanSwingJInternalFrame.getTransaccionLocalLogic().setConnexion(this.tipoivaLogic.getConnexion());

					transaccionlocalBeanSwingJInternalFrame.settipoivasForeignKey(tipoivas);
					transaccionlocalBeanSwingJInternalFrame.settipoivaForeignKey(tipoiva);
					transaccionlocalBeanSwingJInternalFrame.transaccionlocalSessionBean.setisBusquedaDesdeForeignKeySesionTipoIva(true);
					transaccionlocalBeanSwingJInternalFrame.transaccionlocalSessionBean.setlidTipoIvaActual(tipoiva.getId());
					//NO VOLVER A RECARGAR FK, TALVEZ INICIALIZAR FK DEPENDENTES
					//Hijos Independientes, No carga Fk al inicializar, Hay que setisBusquedaDesdeForeignKeySesion(true), luego cargar todos los Fks necesarios
					transaccionlocalBeanSwingJInternalFrame.cargarCombosForeignKeyTransaccionLocal(transaccionlocalBeanSwingJInternalFrame.isCargarCombosDependencia);
					transaccionlocalBeanSwingJInternalFrame.setVisibilidadBusquedasParaTipoIva(true);
					transaccionlocalBeanSwingJInternalFrame.setid_tipo_ivaFK_IdTipoIva(tipoiva.getId());

					if(!this.conCargarFormDetalle) {
						transaccionlocalBeanSwingJInternalFrame.inicializarFormDetalle();
					}

					transaccionlocalBeanSwingJInternalFrame.setSelectedItemCombosFrameTipoIvaForeignKey(tipoiva,1,false,true,true);
					transaccionlocalBeanSwingJInternalFrame.setiNumeroPaginacion(Funciones2.getPaginacionDefecto("RELACIONADO"));
					transaccionlocalBeanSwingJInternalFrame.procesarBusqueda("FK_IdTipoIva");
					transaccionlocalBeanSwingJInternalFrame.setsAccionBusqueda("FK_IdTipoIva");
					transaccionlocalBeanSwingJInternalFrame.inicializarActualizarBindingTablaTransaccionLocal(true);
					transaccionlocalBeanSwingJInternalFrame.actualizarEstadoCeldasBotonesTransaccionLocal("n",transaccionlocalBeanSwingJInternalFrame.isGuardarCambiosEnLote, transaccionlocalBeanSwingJInternalFrame.isEsMantenimientoRelacionado);
					transaccionlocalBeanSwingJInternalFrame.setAutoscrolls(true);
					transaccionlocalBeanSwingJInternalFrame.setVisible(true);

					if(esGuardarRelacionado) {
						transaccionlocalBeanSwingJInternalFrame.actualizarEstadoPanelsTransaccionLocal("relacionado");
					} else {
						transaccionlocalBeanSwingJInternalFrame.actualizarEstadoPanelsTransaccionLocal("no_relacionado");
					}

					transaccionlocalBeanSwingJInternalFrame.getjButtonRecargarInformacionTransaccionLocal().setVisible(false);

			}
			catch(Exception e)
			{
				throw e;
			}
		}

		public void cargarFacturaDiarioBeanSwingJInternalFrame(List<TipoIva> tipoivas,TipoIva tipoiva,FacturaDiarioBeanSwingJInternalFrame facturadiarioBeanSwingJInternalFrame,/*Boolean conInicializar,*/Boolean conGuardarRelaciones,Boolean esGuardarRelacionado) throws Exception 
		{
			try
			{
				if(true/*conInicializar*/) {
					//GETCONTENTPANE SOLO UN PAPA, SE PIERDE PANEL, POR LO QUE SE CREA NUEVO POR CADA PANTALLA
					//facturadiarioBeanSwingJInternalFrame=new FacturaDiarioBeanSwingJInternalFrame(false,false,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);

				}
					facturadiarioBeanSwingJInternalFrame.getFacturaDiarioLogic().setConnexion(this.tipoivaLogic.getConnexion());

					facturadiarioBeanSwingJInternalFrame.settipoivasForeignKey(tipoivas);
					facturadiarioBeanSwingJInternalFrame.settipoivaForeignKey(tipoiva);
					facturadiarioBeanSwingJInternalFrame.facturadiarioSessionBean.setisBusquedaDesdeForeignKeySesionTipoIva(true);
					facturadiarioBeanSwingJInternalFrame.facturadiarioSessionBean.setlidTipoIvaActual(tipoiva.getId());
					//NO VOLVER A RECARGAR FK, TALVEZ INICIALIZAR FK DEPENDENTES
					//Hijos Independientes, No carga Fk al inicializar, Hay que setisBusquedaDesdeForeignKeySesion(true), luego cargar todos los Fks necesarios
					facturadiarioBeanSwingJInternalFrame.cargarCombosForeignKeyFacturaDiario(facturadiarioBeanSwingJInternalFrame.isCargarCombosDependencia);
					facturadiarioBeanSwingJInternalFrame.setVisibilidadBusquedasParaTipoIva(true);
					facturadiarioBeanSwingJInternalFrame.setid_tipo_ivaFK_IdTipoIva(tipoiva.getId());

					if(!this.conCargarFormDetalle) {
						facturadiarioBeanSwingJInternalFrame.inicializarFormDetalle();
					}

					facturadiarioBeanSwingJInternalFrame.setSelectedItemCombosFrameTipoIvaForeignKey(tipoiva,1,false,true,true);
					facturadiarioBeanSwingJInternalFrame.setiNumeroPaginacion(Funciones2.getPaginacionDefecto("RELACIONADO"));
					facturadiarioBeanSwingJInternalFrame.procesarBusqueda("FK_IdTipoIva");
					facturadiarioBeanSwingJInternalFrame.setsAccionBusqueda("FK_IdTipoIva");
					facturadiarioBeanSwingJInternalFrame.inicializarActualizarBindingTablaFacturaDiario(true);
					facturadiarioBeanSwingJInternalFrame.actualizarEstadoCeldasBotonesFacturaDiario("n",facturadiarioBeanSwingJInternalFrame.isGuardarCambiosEnLote, facturadiarioBeanSwingJInternalFrame.isEsMantenimientoRelacionado);
					facturadiarioBeanSwingJInternalFrame.setAutoscrolls(true);
					facturadiarioBeanSwingJInternalFrame.setVisible(true);

					if(esGuardarRelacionado) {
						facturadiarioBeanSwingJInternalFrame.actualizarEstadoPanelsFacturaDiario("relacionado");
					} else {
						facturadiarioBeanSwingJInternalFrame.actualizarEstadoPanelsFacturaDiario("no_relacionado");
					}

					facturadiarioBeanSwingJInternalFrame.getjButtonRecargarInformacionFacturaDiario().setVisible(false);

			}
			catch(Exception e)
			{
				throw e;
			}
		}

	
	
	
	
	/*
	case "CONTROL_BUSQUEDA":
		sKeyName="F3";
	case "CONTROL_BUSCAR":
		sKeyName="F4";
	case "CONTROL_ARBOL":
		sKeyName="F5";
	case "CONTROL_ACTUALIZAR":
		sKeyName="F6";
	sKeyName="N";					
	*/
}
