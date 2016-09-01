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
package com.bydan.erp.cartera.presentation.swing.jinternalframes;


import com.bydan.erp.importaciones.presentation.swing.jinternalframes.*;
import com.bydan.erp.seguridad.presentation.swing.jinternalframes.*;
import com.bydan.erp.contabilidad.presentation.swing.jinternalframes.*;
import com.bydan.erp.cartera.presentation.swing.jinternalframes.*;
import com.bydan.erp.nomina.presentation.swing.jinternalframes.*;
import com.bydan.erp.inventario.presentation.swing.jinternalframes.*;
import com.bydan.erp.facturacion.presentation.swing.jinternalframes.*;
import com.bydan.erp.comisiones.presentation.swing.jinternalframes.*;

import com.bydan.erp.cartera.presentation.web.jsf.sessionbean.*;//;
import com.bydan.erp.cartera.presentation.swing.jinternalframes.*;
import com.bydan.erp.cartera.presentation.swing.jinternalframes.auxiliar.*;


import com.bydan.erp.importaciones.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.contabilidad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.cartera.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.nomina.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.inventario.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.facturacion.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.comisiones.presentation.web.jsf.sessionbean.*;

//import com.bydan.erp.cartera.presentation.report.source.*;


import com.bydan.framework.erp.business.entity.Reporte;

import com.bydan.erp.seguridad.business.entity.Modulo;
import com.bydan.erp.seguridad.business.entity.Opcion;
import com.bydan.erp.seguridad.business.entity.Usuario;
import com.bydan.erp.seguridad.business.entity.ResumenUsuario;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralSg;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralUsuario;

import com.bydan.erp.seguridad.util.SistemaParameterReturnGeneral;



import com.bydan.erp.cartera.business.entity.*;
import com.bydan.erp.cartera.util.TipoViaTransporteConstantesFunciones;

import com.bydan.erp.cartera.business.logic.*;
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
public class TipoViaTransporteDetalleFormJInternalFrame extends TipoViaTransporteBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	
	
	public JToolBar jTtoolBarDetalleTipoViaTransporte;
	
	protected JMenuBar jmenuBarDetalleTipoViaTransporte;
	
	protected JMenu jmenuDetalleTipoViaTransporte;
	protected JMenu jmenuDetalleArchivoTipoViaTransporte;
	protected JMenu jmenuDetalleAccionesTipoViaTransporte;
	protected JMenu jmenuDetalleDatosTipoViaTransporte;
	
	
	
	protected JPanel jContentPane = null;
	protected JPanel jContentPaneDetalleTipoViaTransporte = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutTipoViaTransporte;	
	protected GridBagConstraints gridBagConstraintsTipoViaTransporte;	
		
	//protected JInternalFrameBase jInternalFrameParent; //ESTA EN BASE
	//protected TipoViaTransporteBeanSwingJInternalFrameAdditional jInternalFrameDetalleTipoViaTransporte;		
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	
	
	public TipoViaTransporteSessionBean tipoviatransporteSessionBean;
	
	
	
		
	
	public TipoViaTransporteLogic tipoviatransporteLogic;
	
	public JScrollPane jScrollPanelDatosTipoViaTransporte;
	public JScrollPane jScrollPanelDatosEdicionTipoViaTransporte;
	public JScrollPane jScrollPanelDatosGeneralTipoViaTransporte;
	
	protected JPanel jPanelCamposTipoViaTransporte;    
	protected JPanel jPanelCamposOcultosTipoViaTransporte;    	
	protected JPanel jPanelAccionesTipoViaTransporte;
	protected JPanel jPanelAccionesFormularioTipoViaTransporte;
    
	
	
	protected Integer iXPanelCamposTipoViaTransporte=0;
	protected Integer iYPanelCamposTipoViaTransporte=0;
	
	protected Integer iXPanelCamposOcultosTipoViaTransporte=0;
	protected Integer iYPanelCamposOcultosTipoViaTransporte=0;
	
	;
	;
	
		
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	public JButton jButtonNuevoTipoViaTransporte;
	public JButton jButtonModificarTipoViaTransporte;
	public JButton jButtonActualizarTipoViaTransporte;
    public JButton jButtonEliminarTipoViaTransporte;
	public JButton jButtonCancelarTipoViaTransporte;
    public JButton jButtonGuardarCambiosTipoViaTransporte;
	public JButton jButtonGuardarCambiosTablaTipoViaTransporte;
	protected JButton jButtonCerrarTipoViaTransporte;
	
	
	protected JButton jButtonProcesarInformacionTipoViaTransporte;
	
	
	protected JCheckBox jCheckBoxPostAccionNuevoTipoViaTransporte;
	protected JCheckBox jCheckBoxPostAccionSinCerrarTipoViaTransporte;
	protected JCheckBox jCheckBoxPostAccionSinMensajeTipoViaTransporte;
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarTipoViaTransporte;
	protected JButton jButtonModificarToolBarTipoViaTransporte;
	protected JButton jButtonActualizarToolBarTipoViaTransporte;
    protected JButton jButtonEliminarToolBarTipoViaTransporte;
	protected JButton jButtonCancelarToolBarTipoViaTransporte;
    protected JButton jButtonGuardarCambiosToolBarTipoViaTransporte;
	protected JButton jButtonGuardarCambiosTablaToolBarTipoViaTransporte;
	protected JButton jButtonMostrarOcultarTablaToolBarTipoViaTransporte;
	protected JButton jButtonCerrarToolBarTipoViaTransporte;
	
	protected JButton jButtonProcesarInformacionToolBarTipoViaTransporte;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoTipoViaTransporte;
	protected JMenuItem jMenuItemModificarTipoViaTransporte;
	protected JMenuItem jMenuItemActualizarTipoViaTransporte;
    protected JMenuItem jMenuItemEliminarTipoViaTransporte;
	protected JMenuItem jMenuItemCancelarTipoViaTransporte;
    protected JMenuItem jMenuItemGuardarCambiosTipoViaTransporte;
	protected JMenuItem jMenuItemGuardarCambiosTablaTipoViaTransporte;
	protected JMenuItem jMenuItemCerrarTipoViaTransporte;
	protected JMenuItem jMenuItemDetalleCerrarTipoViaTransporte;
	protected JMenuItem jMenuItemDetalleMostarOcultarTipoViaTransporte;
	
	protected JMenuItem jMenuItemProcesarInformacionTipoViaTransporte;
	protected JMenuItem jMenuItemNuevoGuardarCambiosTipoViaTransporte;
	protected JMenuItem jMenuItemMostrarOcultarTipoViaTransporte;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesTipoViaTransporte;	
		
	
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesTipoViaTransporte;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesTipoViaTransporte;
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxTiposAccionesFormularioTipoViaTransporte;
	
		
	
	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	public JPanel jPanelidTipoViaTransporte;
	public JLabel jLabelIdTipoViaTransporte;
	public JTextFieldMe jTextFieldidTipoViaTransporte;
	public JButton jButtonidTipoViaTransporteBusqueda= new JButtonMe();

	public JPanel jPanelnombreTipoViaTransporte;
	public JLabel jLabelnombreTipoViaTransporte;
	public JTextArea jTextAreanombreTipoViaTransporte;
	public JScrollPane jscrollPanenombreTipoViaTransporte;
	public JButton jButtonnombreTipoViaTransporteBusqueda= new JButtonMe();

	
	
	
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JTabbedPane jTabbedPaneRelacionesTipoViaTransporte;
	
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
	public int iHeightFormulario=286;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
				
	public int iHeightFormularioMaximo=0;
	public int iWidthFormularioMaximo=0;
	public int iWidthTableDefinicion=0;
	
	public double dStart = 0; 
	public double dEnd = 0; 
	public double dDif = 0; 
			
	public SistemaParameterReturnGeneral sistemaReturnGeneral;
	public List<Opcion> opcionsRelacionadas=new ArrayList<Opcion>();
	
	public TipoViaTransporteDetalleFormJInternalFrame(String sTipo) throws Exception {
		super(PaginaTipo.FORMULARIO);
       
		try {
			
	  		if(sTipo.equals("MINIMO")) {
				/*
				this.jPanelCamposTipoViaTransporte=new JPanel();
				this.jPanelAccionesFormularioTipoViaTransporte=new JPanel();
				this.jmenuBarDetalleTipoViaTransporte=new JMenuBar();
				this.jTtoolBarDetalleTipoViaTransporte=new JToolBar();
				*/
	  		}
	  		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoViaTransporteDetalleFormJInternalFrame(PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo); 
		
		//super("TipoViaTransporte No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	//ES AUXILIAR PARA WINDOWS FORMS
	public TipoViaTransporteDetalleFormJInternalFrame() throws Exception {
		super(PaginaTipo.FORMULARIO);
        //super("TipoViaTransporte No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoViaTransporteDetalleFormJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("TipoViaTransporte No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoViaTransporteDetalleFormJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("TipoViaTransporte No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoViaTransporteDetalleFormJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("TipoViaTransporte No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	public JButton getjButtonActualizarToolBarTipoViaTransporte() {
		return this.jButtonActualizarToolBarTipoViaTransporte;
	}
	
	public JButton getjButtonEliminarToolBarTipoViaTransporte() {
		return this.jButtonEliminarToolBarTipoViaTransporte;
	}
	
	public JButton getjButtonCancelarToolBarTipoViaTransporte() {
		return this.jButtonCancelarToolBarTipoViaTransporte;
	}		
	
	public JButton getjButtonProcesarInformacionTipoViaTransporte() {
		return this.jButtonProcesarInformacionTipoViaTransporte;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionTipoViaTransporte)	{
		this.jButtonProcesarInformacionTipoViaTransporte = jButtonProcesarInformacionTipoViaTransporte;
	}
	
	
	

	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesTipoViaTransporte() {
		return this.jComboBoxTiposAccionesTipoViaTransporte;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesTipoViaTransporte(
			JComboBox jComboBoxTiposRelacionesTipoViaTransporte) {
		this.jComboBoxTiposRelacionesTipoViaTransporte = jComboBoxTiposRelacionesTipoViaTransporte;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesTipoViaTransporte(
			JComboBox jComboBoxTiposAccionesTipoViaTransporte) {
		this.jComboBoxTiposAccionesTipoViaTransporte = jComboBoxTiposAccionesTipoViaTransporte;
	}		
	
			
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesFormularioTipoViaTransporte() {
		return this.jComboBoxTiposAccionesFormularioTipoViaTransporte;
	}				
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesFormularioTipoViaTransporte(
			JComboBox jComboBoxTiposAccionesFormularioTipoViaTransporte) {
		this.jComboBoxTiposAccionesFormularioTipoViaTransporte = jComboBoxTiposAccionesFormularioTipoViaTransporte;
	}
	
	private void initialize(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		this.tipoviatransporteSessionBean=new TipoViaTransporteSessionBean();
		
		this.tipoviatransporteSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.tipoviatransporteSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.tipoviatransporteSessionBean.getEsGuardarRelacionado();				
		
		this.conMostrarAccionesCampo=parametroGeneralUsuario.getcon_mostrar_acciones_campo_general() || opcionActual.getcon_mostrar_acciones_campo();
		
		
		if(!this.conCargarMinimo) {
		
		}
		
			
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		TipoViaTransporteJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		TipoViaTransporteJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		TipoViaTransporteJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Tipo Via Transporte MANTENIMIENTO"));
		
		
		if(iWidth > 650) {
			iWidth=650;
		}
		
		if(iHeight > 650) {
			iHeight=650;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
		
		if(!this.tipoviatransporteSessionBean.getEsGuardarRelacionado()) {
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
	
		TipoViaTransporteJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarDetalleTipoViaTransporte= new JToolBar("MENU DATOS");		
		
		//TOOLBAR
		//PRINCIPAL				
				this.jButtonProcesarInformacionToolBarTipoViaTransporte=new JButtonMe();
				this.jButtonModificarToolBarTipoViaTransporte=new JButtonMe();							
		//PRINCIPAL
		
		//DETALLE
		this.jButtonActualizarToolBarTipoViaTransporte=FuncionesSwing.getButtonToolBarGeneral(this.jButtonActualizarToolBarTipoViaTransporte,this.jTtoolBarDetalleTipoViaTransporte,
							"actualizar","actualizar","Actualizar"+" "+TipoViaTransporteConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"),"Actualizar",false);
		
		
		
		
		this.jButtonEliminarToolBarTipoViaTransporte=FuncionesSwing.getButtonToolBarGeneral(this.jButtonEliminarToolBarTipoViaTransporte,this.jTtoolBarDetalleTipoViaTransporte,
							"eliminar","eliminar","Eliminar"+" "+TipoViaTransporteConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"),"Eliminar",false);
		
		
		
		
		this.jButtonCancelarToolBarTipoViaTransporte=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCancelarToolBarTipoViaTransporte,this.jTtoolBarDetalleTipoViaTransporte,
							"cancelar","cancelar","Cancelar"+" "+TipoViaTransporteConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"),"Cancelar",false);
		
		
		
		
		this.jButtonGuardarCambiosToolBarTipoViaTransporte=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosToolBarTipoViaTransporte,this.jTtoolBarDetalleTipoViaTransporte,
							"guardarcambios","guardarcambios","Guardar"+" "+TipoViaTransporteConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		
		FuncionesSwing.setBoldButtonToolBar(this.jButtonActualizarToolBarTipoViaTransporte,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonEliminarToolBarTipoViaTransporte,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonCancelarToolBarTipoViaTransporte,STIPO_TAMANIO_GENERAL,false,false,this);
	}
	
	
	
	public void cargarMenus() {		
		
		this.jmenuBarDetalleTipoViaTransporte=new JMenuBarMe();
		
		//DETALLE
		this.jmenuDetalleTipoViaTransporte=new JMenuMe("Datos Relacionados");
		this.jmenuDetalleArchivoTipoViaTransporte=new JMenuMe("Archivo");
		this.jmenuDetalleAccionesTipoViaTransporte=new JMenuMe("Acciones");
		this.jmenuDetalleDatosTipoViaTransporte=new JMenuMe("Datos");
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoTipoViaTransporte= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoTipoViaTransporte.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoTipoViaTransporte,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoTipoViaTransporte, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemModificarTipoViaTransporte= new JMenuItem("Editar" + FuncionesSwing.getKeyMensaje("MODIFICAR"));
		this.jMenuItemModificarTipoViaTransporte.setActionCommand("Editar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemModificarTipoViaTransporte,"modificar_button","Editar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemModificarTipoViaTransporte, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemActualizarTipoViaTransporte= new JMenuItem("Actualizar" + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
		this.jMenuItemActualizarTipoViaTransporte.setActionCommand("Actualizar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemActualizarTipoViaTransporte,"actualizar_button","Actualizar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemActualizarTipoViaTransporte, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemEliminarTipoViaTransporte= new JMenuItem("Eliminar" + FuncionesSwing.getKeyMensaje("ELIMINAR"));
		this.jMenuItemEliminarTipoViaTransporte.setActionCommand("Eliminar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemEliminarTipoViaTransporte,"eliminar_button","Eliminar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemEliminarTipoViaTransporte, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCancelarTipoViaTransporte= new JMenuItem("Cancelar" + FuncionesSwing.getKeyMensaje("CANCELAR"));
		this.jMenuItemCancelarTipoViaTransporte.setActionCommand("Cancelar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCancelarTipoViaTransporte,"cancelar_button","Cancelar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCancelarTipoViaTransporte, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosTipoViaTransporte= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTipoViaTransporte.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTipoViaTransporte,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTipoViaTransporte, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarTipoViaTransporte= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarTipoViaTransporte.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarTipoViaTransporte,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarTipoViaTransporte, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleCerrarTipoViaTransporte= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemDetalleCerrarTipoViaTransporte.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleCerrarTipoViaTransporte,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleCerrarTipoViaTransporte, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarTipoViaTransporte= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarTipoViaTransporte.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarTipoViaTransporte,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarTipoViaTransporte, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarTipoViaTransporte= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarTipoViaTransporte.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarTipoViaTransporte,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarTipoViaTransporte, STIPO_TAMANIO_GENERAL,false,true,this);			
		
		//DETALLE
		this.jmenuDetalleArchivoTipoViaTransporte.add(this.jMenuItemDetalleCerrarTipoViaTransporte);
		
		this.jmenuDetalleAccionesTipoViaTransporte.add(this.jMenuItemActualizarTipoViaTransporte);
		this.jmenuDetalleAccionesTipoViaTransporte.add(this.jMenuItemEliminarTipoViaTransporte);
		this.jmenuDetalleAccionesTipoViaTransporte.add(this.jMenuItemCancelarTipoViaTransporte);		
		
		//this.jmenuDetalleDatosTipoViaTransporte.add(this.jMenuItemDetalleAbrirOrderByTipoViaTransporte);				
		this.jmenuDetalleDatosTipoViaTransporte.add(this.jMenuItemDetalleMostarOcultarTipoViaTransporte);				
				
		//this.jmenuDetalleAccionesTipoViaTransporte.add(this.jMenuItemGuardarCambiosTipoViaTransporte);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES				
		
		//DETALLE
		FuncionesSwing.setBoldMenu(this.jmenuDetalleArchivoTipoViaTransporte, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleAccionesTipoViaTransporte, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleDatosTipoViaTransporte, STIPO_TAMANIO_GENERAL,false,true,this);
			
		this.jmenuBarDetalleTipoViaTransporte.add(this.jmenuDetalleArchivoTipoViaTransporte);		
		this.jmenuBarDetalleTipoViaTransporte.add(this.jmenuDetalleAccionesTipoViaTransporte);		
		this.jmenuBarDetalleTipoViaTransporte.add(this.jmenuDetalleDatosTipoViaTransporte);		
		
		//DETALLE_FIN
		
		
		//AGREGA MENU DETALLE A PANTALLA
		this.setJMenuBar(this.jmenuBarDetalleTipoViaTransporte);				
	}
	
	
	public void inicializarElementosCamposTipoViaTransporte() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		jLabelIdTipoViaTransporte = new JLabelMe();
		jLabelIdTipoViaTransporte.setText(""+Constantes2.S_CODIGO_UNICO+"");
		jLabelIdTipoViaTransporte.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdTipoViaTransporte.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdTipoViaTransporte.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelIdTipoViaTransporte,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jPanelidTipoViaTransporte = new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelidTipoViaTransporte.setToolTipText(TipoViaTransporteConstantesFunciones.LABEL_ID);
		this.gridaBagLayoutTipoViaTransporte= new GridBagLayout();

		this.jPanelidTipoViaTransporte.setLayout(this.gridaBagLayoutTipoViaTransporte);

		jTextFieldidTipoViaTransporte = new JTextFieldMe();
		jTextFieldidTipoViaTransporte.setText("Id");

		jTextFieldidTipoViaTransporte.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jTextFieldidTipoViaTransporte.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jTextFieldidTipoViaTransporte.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));



					
		this.jLabelnombreTipoViaTransporte = new JLabelMe();
		this.jLabelnombreTipoViaTransporte.setText(""+TipoViaTransporteConstantesFunciones.LABEL_NOMBRE+" : *");
		this.jLabelnombreTipoViaTransporte.setToolTipText("Nombre");
		this.jLabelnombreTipoViaTransporte.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnombreTipoViaTransporte.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnombreTipoViaTransporte.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelnombreTipoViaTransporte,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelnombreTipoViaTransporte=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelnombreTipoViaTransporte.setToolTipText(TipoViaTransporteConstantesFunciones.LABEL_NOMBRE);
		this.gridaBagLayoutTipoViaTransporte = new GridBagLayout();
		this.jPanelnombreTipoViaTransporte.setLayout(this.gridaBagLayoutTipoViaTransporte);


		jTextAreanombreTipoViaTransporte= new JTextAreaMe();
		jTextAreanombreTipoViaTransporte.setEnabled(false);
		jTextAreanombreTipoViaTransporte.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreTipoViaTransporte.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreTipoViaTransporte.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreTipoViaTransporte.setLineWrap(true);
		jTextAreanombreTipoViaTransporte.setWrapStyleWord(true);
		jTextAreanombreTipoViaTransporte.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreanombreTipoViaTransporte.setRows(4);

		FuncionesSwing.setBoldTextArea(jTextAreanombreTipoViaTransporte,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPanenombreTipoViaTransporte = new JScrollPane(jTextAreanombreTipoViaTransporte);
		jscrollPanenombreTipoViaTransporte.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanenombreTipoViaTransporte.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanenombreTipoViaTransporte.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));

		this.jButtonnombreTipoViaTransporteBusqueda= new JButtonMe();
		this.jButtonnombreTipoViaTransporteBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombreTipoViaTransporteBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombreTipoViaTransporteBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonnombreTipoViaTransporteBusqueda.setText("U");
		this.jButtonnombreTipoViaTransporteBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonnombreTipoViaTransporteBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonnombreTipoViaTransporteBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreanombreTipoViaTransporte.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreanombreTipoViaTransporte.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"nombreTipoViaTransporteBusqueda"));

		if(this.tipoviatransporteSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonnombreTipoViaTransporteBusqueda.setVisible(false);		}


	}
	
	public void inicializarElementosCamposForeigKeysTipoViaTransporte() {
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
		//this.jInternalFrameDetalleTipoViaTransporte = new TipoViaTransporteBeanSwingJInternalFrameAdditional(paginaTipo);//JInternalFrameBase("Tipo Via Transporte DATOS");
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutTipoViaTransporte= new GridBagLayout();
		

		
		String sToolTipTipoViaTransporte="";
		sToolTipTipoViaTransporte=TipoViaTransporteConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipTipoViaTransporte+="(Cartera.TipoViaTransporte)";
		}
		
		if(!this.tipoviatransporteSessionBean.getEsGuardarRelacionado()) {
			sToolTipTipoViaTransporte+="_"+this.opcionActual.getId();
		}
								
		
		this.jButtonNuevoTipoViaTransporte = new JButtonMe();
		this.jButtonModificarTipoViaTransporte = new JButtonMe();
        this.jButtonActualizarTipoViaTransporte = new JButtonMe();
        this.jButtonEliminarTipoViaTransporte = new JButtonMe();
        this.jButtonCancelarTipoViaTransporte = new JButtonMe();
        this.jButtonGuardarCambiosTipoViaTransporte = new JButtonMe();
		this.jButtonGuardarCambiosTablaTipoViaTransporte = new JButtonMe();
		this.jButtonCerrarTipoViaTransporte = new JButtonMe();
		
		this.jScrollPanelDatosTipoViaTransporte = new JScrollPane();   
        this.jScrollPanelDatosEdicionTipoViaTransporte = new JScrollPane();
		this.jScrollPanelDatosGeneralTipoViaTransporte = new JScrollPane();
				
		
		
		this.jPanelCamposTipoViaTransporte = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelCamposOcultosTipoViaTransporte = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
        this.jPanelAccionesTipoViaTransporte = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		this.jPanelAccionesFormularioTipoViaTransporte = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		this.sPath=" <---> Acceso: Tipo Via Transporte";
		
		if(!this.tipoviatransporteSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosTipoViaTransporte.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Tipo Via Transportes" + this.sPath));
		} else {
			this.jScrollPanelDatosTipoViaTransporte.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosEdicionTipoViaTransporte.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		this.jScrollPanelDatosGeneralTipoViaTransporte.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
			
        this.jPanelCamposTipoViaTransporte.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
        this.jPanelCamposTipoViaTransporte.setName("jPanelCamposTipoViaTransporte"); 

		this.jPanelCamposOcultosTipoViaTransporte.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos Ocultos"));
        this.jPanelCamposOcultosTipoViaTransporte.setName("jPanelCamposOcultosTipoViaTransporte"); 

        this.jPanelAccionesTipoViaTransporte.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesTipoViaTransporte.setToolTipText("Acciones");
        this.jPanelAccionesTipoViaTransporte.setName("Acciones"); 

		this.jPanelAccionesFormularioTipoViaTransporte.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones Extra/Post"));
        this.jPanelAccionesFormularioTipoViaTransporte.setToolTipText("Acciones");
        this.jPanelAccionesFormularioTipoViaTransporte.setName("Acciones"); 
		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosEdicionTipoViaTransporte, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralTipoViaTransporte, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosTipoViaTransporte, STIPO_TAMANIO_GENERAL,false,false,this);		
		FuncionesSwing.setBoldPanel(this.jPanelCamposTipoViaTransporte, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelCamposOcultosTipoViaTransporte, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelAccionesFormularioTipoViaTransporte, STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {
		
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		
        this.jButtonNuevoTipoViaTransporte.setText("Nuevo");
		this.jButtonModificarTipoViaTransporte.setText("Editar");
        this.jButtonActualizarTipoViaTransporte.setText("Actualizar");
        this.jButtonEliminarTipoViaTransporte.setText("Eliminar");
        this.jButtonCancelarTipoViaTransporte.setText("Cancelar");
        this.jButtonGuardarCambiosTipoViaTransporte.setText("Guardar");
		this.jButtonGuardarCambiosTablaTipoViaTransporte.setText("Guardar");
		this.jButtonCerrarTipoViaTransporte.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoTipoViaTransporte,"nuevo_button","Nuevo",this.tipoviatransporteSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonModificarTipoViaTransporte,"modificar_button","Editar",this.tipoviatransporteSessionBean.getEsGuardarRelacionado());
       	FuncionesSwing.addImagenButtonGeneral(this.jButtonActualizarTipoViaTransporte,"actualizar_button","Actualizar",this.tipoviatransporteSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonEliminarTipoViaTransporte,"eliminar_button","Eliminar",this.tipoviatransporteSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonCancelarTipoViaTransporte,"cancelar_button","Cancelar",this.tipoviatransporteSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTipoViaTransporte,"guardarcambios_button","Guardar",this.tipoviatransporteSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaTipoViaTransporte,"guardarcambiostabla_button","Guardar",this.tipoviatransporteSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarTipoViaTransporte,"cerrar_button","Salir",this.tipoviatransporteSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoTipoViaTransporte, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonModificarTipoViaTransporte, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTipoViaTransporte, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaTipoViaTransporte, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarTipoViaTransporte, STIPO_TAMANIO_GENERAL,false,true,this);
		
		FuncionesSwing.setBoldButton(this.jButtonActualizarTipoViaTransporte, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonEliminarTipoViaTransporte, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonCancelarTipoViaTransporte, STIPO_TAMANIO_GENERAL,false,false,this);
		
		this.jButtonNuevoTipoViaTransporte.setToolTipText("Nuevo"+" "+TipoViaTransporteConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonModificarTipoViaTransporte.setToolTipText("Editar"+" "+TipoViaTransporteConstantesFunciones.SCLASSWEBTITULO+"");// + FuncionesSwing.getKeyMensaje("MODIFICAR"))
        this.jButtonActualizarTipoViaTransporte.setToolTipText("Actualizar"+" "+TipoViaTransporteConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
        this.jButtonEliminarTipoViaTransporte.setToolTipText("Eliminar)"+" "+TipoViaTransporteConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"));
        this.jButtonCancelarTipoViaTransporte.setToolTipText("Cancelar"+" "+TipoViaTransporteConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"));
        this.jButtonGuardarCambiosTipoViaTransporte.setToolTipText("Guardar"+" "+TipoViaTransporteConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonGuardarCambiosTablaTipoViaTransporte.setToolTipText("Guardar"+" "+TipoViaTransporteConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarTipoViaTransporte.setToolTipText("Salir"+" "+TipoViaTransporteConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoTipoViaTransporte";
		inputMap = this.jButtonNuevoTipoViaTransporte.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoTipoViaTransporte.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoTipoViaTransporte"));
		
		//ACTUALIZAR
		sMapKey = "ActualizarTipoViaTransporte";
		inputMap = this.jButtonActualizarTipoViaTransporte.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ACTUALIZAR") , FuncionesSwing.getMaskKey("ACTUALIZAR")), sMapKey);
		
		this.jButtonActualizarTipoViaTransporte.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ActualizarTipoViaTransporte"));
		
		//ELIMINAR
		sMapKey = "EliminarTipoViaTransporte";
		inputMap = this.jButtonEliminarTipoViaTransporte.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ELIMINAR") , FuncionesSwing.getMaskKey("ELIMINAR")), sMapKey);
		
		this.jButtonEliminarTipoViaTransporte.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"EliminarTipoViaTransporte"));
		
		//CANCELAR	
		sMapKey = "CancelarTipoViaTransporte";
		inputMap = this.jButtonCancelarTipoViaTransporte.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CANCELAR") , FuncionesSwing.getMaskKey("CANCELAR")), sMapKey);
		
		this.jButtonCancelarTipoViaTransporte.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CancelarTipoViaTransporte"));
		
		//CERRAR		
		sMapKey = "CerrarTipoViaTransporte";
		inputMap = this.jButtonCerrarTipoViaTransporte.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarTipoViaTransporte.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarTipoViaTransporte"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaTipoViaTransporte";
		inputMap = this.jButtonGuardarCambiosTablaTipoViaTransporte.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaTipoViaTransporte.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaTipoViaTransporte"));
		
		//HOT KEYS
		
		this.jCheckBoxPostAccionNuevoTipoViaTransporte = new JCheckBoxMe();
		this.jCheckBoxPostAccionNuevoTipoViaTransporte.setText("Nuevo");
		this.jCheckBoxPostAccionNuevoTipoViaTransporte.setToolTipText("Nuevo TipoViaTransporte");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionNuevoTipoViaTransporte, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinCerrarTipoViaTransporte = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinCerrarTipoViaTransporte.setText("Sin Cerrar");
		this.jCheckBoxPostAccionSinCerrarTipoViaTransporte.setToolTipText("Sin Cerrar Ventana TipoViaTransporte");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinCerrarTipoViaTransporte, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinMensajeTipoViaTransporte = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinMensajeTipoViaTransporte.setText("Sin Mensaje");
		this.jCheckBoxPostAccionSinMensajeTipoViaTransporte.setToolTipText("Sin Mensaje Confirmacion");				
				
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinMensajeTipoViaTransporte, STIPO_TAMANIO_GENERAL,false,false,this);       	
       
				
		
			
			
		this.jComboBoxTiposAccionesTipoViaTransporte = new JComboBoxMe();
		//this.jComboBoxTiposAccionesTipoViaTransporte.setText("Accion");
		this.jComboBoxTiposAccionesTipoViaTransporte.setToolTipText("Tipos de Acciones");
							
		

		this.jComboBoxTiposAccionesFormularioTipoViaTransporte = new JComboBoxMe();
		//this.jComboBoxTiposAccionesFormularioTipoViaTransporte.setText("Accion");				
    	this.jComboBoxTiposAccionesFormularioTipoViaTransporte.setToolTipText("Tipos de Acciones");
	
		this.jLabelAccionesTipoViaTransporte = new JLabelMe();
		
		this.jLabelAccionesTipoViaTransporte.setText("Acciones");		
		this.jLabelAccionesTipoViaTransporte.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesTipoViaTransporte.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesTipoViaTransporte.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
        //HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		//HOT KEYS2
		
		//ELEMENTOS
		this.inicializarElementosCamposTipoViaTransporte();
		
		//ELEMENTOS FK
		this.inicializarElementosCamposForeigKeysTipoViaTransporte();
				
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		this.jTabbedPaneRelacionesTipoViaTransporte=new JTabbedPane();
		this.jTabbedPaneRelacionesTipoViaTransporte.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Relacionados"));
		
		//ESTA EN BEAN

		
		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneRelacionesTipoViaTransporte,STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		int iPosXAccionPaginacion=0;
		
		
		
				
		
		this.jComboBoxTiposAccionesTipoViaTransporte.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesTipoViaTransporte.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesTipoViaTransporte.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesTipoViaTransporte, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		
		
		this.jComboBoxTiposAccionesFormularioTipoViaTransporte.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioTipoViaTransporte.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioTipoViaTransporte.setPreferredSize(new Dimension(145,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesFormularioTipoViaTransporte, STIPO_TAMANIO_GENERAL,false,false,this);				
		
		GridBagLayout gridaBagLayoutCamposTipoViaTransporte = new GridBagLayout();
		GridBagLayout gridaBagLayoutCamposOcultosTipoViaTransporte = new GridBagLayout();
		
		this.jPanelCamposTipoViaTransporte.setLayout(gridaBagLayoutCamposTipoViaTransporte);
		this.jPanelCamposOcultosTipoViaTransporte.setLayout(gridaBagLayoutCamposOcultosTipoViaTransporte);
		
		;
		;
		
		
		//SUBPANELES SIMPLES
		//SUBPANELES POR CAMPO
        
	this.gridBagConstraintsTipoViaTransporte = new GridBagConstraints();
	this.gridBagConstraintsTipoViaTransporte.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoViaTransporte.gridy = 0;
	this.gridBagConstraintsTipoViaTransporte.gridx = 0;
	this.gridBagConstraintsTipoViaTransporte.ipadx = 0;
	this.gridBagConstraintsTipoViaTransporte.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelidTipoViaTransporte.add(jLabelIdTipoViaTransporte, this.gridBagConstraintsTipoViaTransporte);



	this.gridBagConstraintsTipoViaTransporte = new GridBagConstraints();
	this.gridBagConstraintsTipoViaTransporte.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoViaTransporte.gridy = 0;
	this.gridBagConstraintsTipoViaTransporte.gridx = 1;
	this.gridBagConstraintsTipoViaTransporte.ipadx = 0;
	this.gridBagConstraintsTipoViaTransporte.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelidTipoViaTransporte.add(jTextFieldidTipoViaTransporte, this.gridBagConstraintsTipoViaTransporte);


	this.gridBagConstraintsTipoViaTransporte = new GridBagConstraints();
	this.gridBagConstraintsTipoViaTransporte.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoViaTransporte.gridy = 0;
	this.gridBagConstraintsTipoViaTransporte.gridx = 0;
	this.gridBagConstraintsTipoViaTransporte.ipadx = 0;
	this.gridBagConstraintsTipoViaTransporte.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelnombreTipoViaTransporte.add(jLabelnombreTipoViaTransporte, this.gridBagConstraintsTipoViaTransporte);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsTipoViaTransporte = new GridBagConstraints();
		//this.gridBagConstraintsTipoViaTransporte.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoViaTransporte.gridy = 0;
		this.gridBagConstraintsTipoViaTransporte.gridx = 2;
		this.gridBagConstraintsTipoViaTransporte.ipadx = 0;
		this.gridBagConstraintsTipoViaTransporte.insets = new Insets(0, 0, 0, 0);
		this.jPanelnombreTipoViaTransporte.add(jButtonnombreTipoViaTransporteBusqueda, this.gridBagConstraintsTipoViaTransporte);
	}

	this.gridBagConstraintsTipoViaTransporte = new GridBagConstraints();
	this.gridBagConstraintsTipoViaTransporte.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoViaTransporte.gridy = 0;
	this.gridBagConstraintsTipoViaTransporte.gridx = 1;
	this.gridBagConstraintsTipoViaTransporte.ipadx = 0;
	this.gridBagConstraintsTipoViaTransporte.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelnombreTipoViaTransporte.add(jscrollPanenombreTipoViaTransporte, this.gridBagConstraintsTipoViaTransporte);


		//SUBPANELES SIMPLES
		
		//SUBPANELES EN PANEL
		//SUBPANELES EN PANEL CAMPOS NORMAL				
		
	this.gridBagConstraintsTipoViaTransporte = new GridBagConstraints();
	this.gridBagConstraintsTipoViaTransporte.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsTipoViaTransporte.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsTipoViaTransporte.gridy = iYPanelCamposTipoViaTransporte;
	this.gridBagConstraintsTipoViaTransporte.gridx = iXPanelCamposTipoViaTransporte++;
	this.gridBagConstraintsTipoViaTransporte.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsTipoViaTransporte.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposTipoViaTransporte.add(this.jPanelidTipoViaTransporte, this.gridBagConstraintsTipoViaTransporte);



	if(iXPanelCamposTipoViaTransporte % 1==0) {
		iXPanelCamposTipoViaTransporte=0;
		iYPanelCamposTipoViaTransporte++;
	}
	this.gridBagConstraintsTipoViaTransporte = new GridBagConstraints();
	this.gridBagConstraintsTipoViaTransporte.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsTipoViaTransporte.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsTipoViaTransporte.gridy = iYPanelCamposTipoViaTransporte;
	this.gridBagConstraintsTipoViaTransporte.gridx = iXPanelCamposTipoViaTransporte++;
	this.gridBagConstraintsTipoViaTransporte.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsTipoViaTransporte.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposTipoViaTransporte.add(this.jPanelnombreTipoViaTransporte, this.gridBagConstraintsTipoViaTransporte);



	if(iXPanelCamposTipoViaTransporte % 1==0) {
		iXPanelCamposTipoViaTransporte=0;
		iYPanelCamposTipoViaTransporte++;
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
			
		GridBagLayout gridaBagLayoutAccionesTipoViaTransporte= new GridBagLayout();
		this.jPanelAccionesTipoViaTransporte.setLayout(gridaBagLayoutAccionesTipoViaTransporte);
		
		GridBagLayout gridaBagLayoutAccionesFormularioTipoViaTransporte= new GridBagLayout();
		this.jPanelAccionesFormularioTipoViaTransporte.setLayout(gridaBagLayoutAccionesFormularioTipoViaTransporte);
		
		this.gridBagConstraintsTipoViaTransporte = new GridBagConstraints();
		this.gridBagConstraintsTipoViaTransporte.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsTipoViaTransporte.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioTipoViaTransporte.add(this.jComboBoxTiposAccionesFormularioTipoViaTransporte, this.gridBagConstraintsTipoViaTransporte);

		this.gridBagConstraintsTipoViaTransporte = new GridBagConstraints();
		this.gridBagConstraintsTipoViaTransporte.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsTipoViaTransporte.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioTipoViaTransporte.add(this.jCheckBoxPostAccionNuevoTipoViaTransporte, this.gridBagConstraintsTipoViaTransporte);
			
		//DEBE CERRARSE Y ACTUALIZARSE TODO NUEVAMENTE, SI ES RELACIONADO PUEDE FUNCIONAR
		//if(!this.tipoviatransporteSessionBean.getEstaModoGuardarRelaciones()) {		
		//SE ARRIESGA
		//if(!this.conFuncionalidadRelaciones) {		
			this.gridBagConstraintsTipoViaTransporte = new GridBagConstraints();
			this.gridBagConstraintsTipoViaTransporte.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsTipoViaTransporte.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioTipoViaTransporte.add(this.jCheckBoxPostAccionSinCerrarTipoViaTransporte, this.gridBagConstraintsTipoViaTransporte);
		//}
		
		
		//NO TIENE MENSAJE POR DEFINICION, O ES MUY COMPLEJO LA PANTALLA PARA HACERLO MAS COMPLICADO
		if(!this.tipoviatransporteSessionBean.getEsGuardarRelacionado()
			){				
			//&& !this.tipoviatransporteSessionBean.getEstaModoGuardarRelaciones()) {
							
			this.gridBagConstraintsTipoViaTransporte = new GridBagConstraints();
			this.gridBagConstraintsTipoViaTransporte.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsTipoViaTransporte.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioTipoViaTransporte.add(this.jCheckBoxPostAccionSinMensajeTipoViaTransporte, this.gridBagConstraintsTipoViaTransporte);
		}
		
		
		int iPosXAccion=0;
		
		this.gridBagConstraintsTipoViaTransporte = new GridBagConstraints();
		this.gridBagConstraintsTipoViaTransporte.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoViaTransporte.gridy = 0;
		this.gridBagConstraintsTipoViaTransporte.gridx = iPosXAccion++;
			
		this.jPanelAccionesTipoViaTransporte.add(this.jButtonModificarTipoViaTransporte, this.gridBagConstraintsTipoViaTransporte);							

		this.gridBagConstraintsTipoViaTransporte = new GridBagConstraints();
		this.gridBagConstraintsTipoViaTransporte.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoViaTransporte.gridy = 0;
		this.gridBagConstraintsTipoViaTransporte.gridx =iPosXAccion++;
			
		this.jPanelAccionesTipoViaTransporte.add(this.jButtonEliminarTipoViaTransporte, this.gridBagConstraintsTipoViaTransporte);
		
			
		this.gridBagConstraintsTipoViaTransporte = new GridBagConstraints();
		this.gridBagConstraintsTipoViaTransporte.gridy = 0;		
		this.gridBagConstraintsTipoViaTransporte.gridx = iPosXAccion++;
		
		this.jPanelAccionesTipoViaTransporte.add(this.jButtonActualizarTipoViaTransporte, this.gridBagConstraintsTipoViaTransporte);


		this.gridBagConstraintsTipoViaTransporte = new GridBagConstraints();
		this.gridBagConstraintsTipoViaTransporte.gridy = 0;		
		this.gridBagConstraintsTipoViaTransporte.gridx = iPosXAccion++;
		
		this.jPanelAccionesTipoViaTransporte.add(this.jButtonGuardarCambiosTipoViaTransporte, this.gridBagConstraintsTipoViaTransporte);	
		
		this.gridBagConstraintsTipoViaTransporte = new GridBagConstraints();
		this.gridBagConstraintsTipoViaTransporte.gridy = 0;		
		this.gridBagConstraintsTipoViaTransporte.gridx =iPosXAccion++;
		
		this.jPanelAccionesTipoViaTransporte.add(this.jButtonCancelarTipoViaTransporte, this.gridBagConstraintsTipoViaTransporte);
		
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutTipoViaTransporte = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutTipoViaTransporte);
		
		if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.tipoviatransporteSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsTipoViaTransporte = new GridBagConstraints();						
			this.gridBagConstraintsTipoViaTransporte.gridy = iGridyPrincipal++;
			this.gridBagConstraintsTipoViaTransporte.gridx = 0;		
			//this.gridBagConstraintsTipoViaTransporte.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoViaTransporte.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsTipoViaTransporte.ipadx = 100;
				
			
		}
		
		//PROCESANDO EN OTRA PANTALLA
		
		
		int iGridxBusquedasParametros=0;
		
	
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			//NO BUSQUEDA
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		
		this.gridBagConstraintsTipoViaTransporte = new GridBagConstraints();
		this.gridBagConstraintsTipoViaTransporte.gridy =iGridyPrincipal++;
		this.gridBagConstraintsTipoViaTransporte.gridx =0;
		this.gridBagConstraintsTipoViaTransporte.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsTipoViaTransporte.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosTipoViaTransporte, this.gridBagConstraintsTipoViaTransporte);
				
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);

		
			
		//if(TipoViaTransporteJInternalFrame.CON_DATOS_FRAME) {				
			//this.jInternalFrameDetalleTipoViaTransporte = new TipoViaTransporteBeanSwingJInternalFrameAdditional();//JInternalFrameBase("Tipo Via Transporte DATOS");
			
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
			
	        //this.setTitle("[FOR] - Tipo Via Transporte DATOS");
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Tipo Via Transporte Formulario",PaginaTipo.FORMULARIO,paginaTipo));			
	        this.setSize(iWidthFormulario,iHeightFormulario);        
		   				
			this.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	        this.setResizable(true);
	        this.setClosable(true);
	        this.setMaximizable(true);
		    
			TipoViaTransporteModel tipoviatransporteModel=new TipoViaTransporteModel(this);
			
			//SI USARA CLASE INTERNA
			//TipoViaTransporteModel.TipoViaTransporteFocusTraversalPolicy tipoviatransporteFocusTraversalPolicy = tipoviatransporteModel.new TipoViaTransporteFocusTraversalPolicy(this);
			
			//tipoviatransporteFocusTraversalPolicy.settipoviatransporteJInternalFrame(this);
			
			this.setFocusTraversalPolicy(tipoviatransporteModel);
			
			
			this.jContentPaneDetalleTipoViaTransporte = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			GridBagLayout gridaBagLayoutDetalleTipoViaTransporte = new GridBagLayout();	
			this.jContentPaneDetalleTipoViaTransporte.setLayout(gridaBagLayoutDetalleTipoViaTransporte);
			
			GridBagLayout gridaBagLayoutBusquedasParametrosTipoViaTransporte = new GridBagLayout();
			
			
if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
				
				//AGREGA TOOLBAR DETALLE A PANTALLA
				
				this.gridBagConstraintsTipoViaTransporte = new GridBagConstraints();
				this.gridBagConstraintsTipoViaTransporte.gridy = iGridyRelaciones++;		
				this.gridBagConstraintsTipoViaTransporte.gridx = 0;
					
				
				this.jContentPaneDetalleTipoViaTransporte.add(jTtoolBarDetalleTipoViaTransporte, gridBagConstraintsTipoViaTransporte);								
				
}
			
			this.jScrollPanelDatosEdicionTipoViaTransporte=   new JScrollPane(jContentPaneDetalleTipoViaTransporte,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionTipoViaTransporte.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionTipoViaTransporte.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionTipoViaTransporte.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			this.jScrollPanelDatosGeneralTipoViaTransporte=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralTipoViaTransporte.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralTipoViaTransporte.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralTipoViaTransporte.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsTipoViaTransporte = new GridBagConstraints();
			
			
	        this.gridBagConstraintsTipoViaTransporte.gridy = iGridyRelaciones++;		
	        this.gridBagConstraintsTipoViaTransporte.gridx = 0;
	        
			this.jContentPaneDetalleTipoViaTransporte.add(jPanelCamposTipoViaTransporte, gridBagConstraintsTipoViaTransporte);
			
			
			
			
			//if(!this.conCargarMinimo) {
			
			
			;
			//}
						
			this.conMaximoRelaciones=false;
			
			if(this.parametroGeneralUsuario.getcon_cargar_por_parte()) {
			}									
			
			//CARGA O NO CARGA RELACIONADOS(MAESTRO DETALLE)
									  // ABAJO VIENE DE PARAMETRO GENERAL USUARIO
			if(conMaximoRelaciones) { // && this.conFuncionalidadRelaciones) {
				if(!this.conCargarMinimo) {
					if(cargarRelaciones 
						&& tipoviatransporteSessionBean.getConGuardarRelaciones()
						) {
					
					if(this.tipoviatransporteSessionBean.getConGuardarRelaciones()) {
						this.gridBagConstraintsTipoViaTransporte= new GridBagConstraints();
						this.gridBagConstraintsTipoViaTransporte.gridy = iGridyRelaciones++;
						this.gridBagConstraintsTipoViaTransporte.gridx = 0;
						this.jContentPaneDetalleTipoViaTransporte.add(this.jTabbedPaneRelacionesTipoViaTransporte, this.gridBagConstraintsTipoViaTransporte);
					}
					
					//RELACIONES OTROS AGRUPADOS
					;
					
					} else {
						//this.jButtonNuevoRelacionesTipoViaTransporte.setVisible(false);
					}
				}
			}
			
			Boolean tieneColumnasOcultas=false;
			
		
						
			
			if(!Constantes.ISDEVELOPING) {
	       		this.jPanelCamposOcultosTipoViaTransporte.setVisible(false);
			} else {
				if(tieneColumnasOcultas) {
					this.gridBagConstraintsTipoViaTransporte = new GridBagConstraints();
					this.gridBagConstraintsTipoViaTransporte.fill=GridBagConstraints.NONE;
					this.gridBagConstraintsTipoViaTransporte.anchor = GridBagConstraints.WEST;
					
					this.gridBagConstraintsTipoViaTransporte.gridy = iGridyRelaciones++;		
					this.gridBagConstraintsTipoViaTransporte.gridx = 0;
					
				
					this.jContentPaneDetalleTipoViaTransporte.add(jPanelCamposOcultosTipoViaTransporte, gridBagConstraintsTipoViaTransporte);
				
					this.jPanelCamposOcultosTipoViaTransporte.setVisible(true);
				}
			}					
			
			
			
			
			this.gridBagConstraintsTipoViaTransporte = new GridBagConstraints();
			this.gridBagConstraintsTipoViaTransporte.gridy = iGridyRelaciones++;//1;		
	        this.gridBagConstraintsTipoViaTransporte.gridx = 0;
	        this.gridBagConstraintsTipoViaTransporte.anchor = GridBagConstraints.CENTER;//WEST;
			
			
			
			this.jContentPaneDetalleTipoViaTransporte.add(this.jPanelAccionesFormularioTipoViaTransporte, this.gridBagConstraintsTipoViaTransporte);							
			
			
			
			this.gridBagConstraintsTipoViaTransporte = new GridBagConstraints();
	        this.gridBagConstraintsTipoViaTransporte.gridy = iGridyRelaciones;//1;		
	        this.gridBagConstraintsTipoViaTransporte.gridx = 0;
	        
			
			this.jContentPaneDetalleTipoViaTransporte.add(this.jPanelAccionesTipoViaTransporte, this.gridBagConstraintsTipoViaTransporte);							
			
	        //this.setContentPane(jScrollPanelDatosEdicionTipoViaTransporte);
			
		//} else {
			//DISENO_DETALLE COMENTAR Y
			//DISENO_DETALLE(Solo Descomentar Seccion Inferior)
			//NOTA-DISENO_DETALLE(Si cambia lo de abajo, cambiar lo comentado, Al final no es lo mismo)
			
			/*
			this.jScrollPanelDatosEdicionTipoViaTransporte=   new JScrollPane(this.jPanelCamposTipoViaTransporte,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionTipoViaTransporte.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionTipoViaTransporte.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionTipoViaTransporte.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			
			this.gridBagConstraintsTipoViaTransporte = new GridBagConstraints();
			this.gridBagConstraintsTipoViaTransporte.gridy = iGridyPrincipal++;		
			this.gridBagConstraintsTipoViaTransporte.gridx = 0;
			this.gridBagConstraintsTipoViaTransporte.fill = GridBagConstraints.BOTH;
			this.gridBagConstraintsTipoViaTransporte.ipady = this.getSize().height-yOffset*3;
			this.gridBagConstraintsTipoViaTransporte.anchor = GridBagConstraints.WEST;
			
			this.jContentPane.add(this.jScrollPanelDatosEdicionTipoViaTransporte, this.gridBagConstraintsTipoViaTransporte);
			
			//ACCIONES FORMULARIO
			this.gridBagConstraintsTipoViaTransporte = new GridBagConstraints();
			this.gridBagConstraintsTipoViaTransporte.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsTipoViaTransporte.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesFormularioTipoViaTransporte, this.gridBagConstraintsTipoViaTransporte);			
			
			this.gridBagConstraintsTipoViaTransporte = new GridBagConstraints();
			this.gridBagConstraintsTipoViaTransporte.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsTipoViaTransporte.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesTipoViaTransporte, this.gridBagConstraintsTipoViaTransporte);									
			*/
		//}								
			
		//DISENO_DETALLE-(Descomentar)
		/*
		this.gridBagConstraintsTipoViaTransporte = new GridBagConstraints();
		this.gridBagConstraintsTipoViaTransporte.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoViaTransporte.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposTipoViaTransporte, this.gridBagConstraintsTipoViaTransporte);
			
			
		this.gridBagConstraintsTipoViaTransporte = new GridBagConstraints();
		this.gridBagConstraintsTipoViaTransporte.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoViaTransporte.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosTipoViaTransporte, this.gridBagConstraintsTipoViaTransporte);
		
			
		this.gridBagConstraintsTipoViaTransporte = new GridBagConstraints();
		this.gridBagConstraintsTipoViaTransporte.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsTipoViaTransporte.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesTipoViaTransporte, this.gridBagConstraintsTipoViaTransporte);
		*/
		
			
     	//pack();
		
		
		//return this.jScrollPanelDatosGeneralTipoViaTransporte;//jContentPane;
		
		return jScrollPanelDatosEdicionTipoViaTransporte;
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
