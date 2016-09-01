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
package com.bydan.erp.tesoreria.presentation.swing.jinternalframes;



import com.bydan.erp.tesoreria.presentation.web.jsf.sessionbean.*;//;
import com.bydan.erp.tesoreria.presentation.swing.jinternalframes.*;
import com.bydan.erp.tesoreria.presentation.swing.jinternalframes.auxiliar.*;



//import com.bydan.erp.tesoreria.presentation.report.source.*;


import com.bydan.framework.erp.business.entity.Reporte;

import com.bydan.erp.seguridad.business.entity.Modulo;
import com.bydan.erp.seguridad.business.entity.Opcion;
import com.bydan.erp.seguridad.business.entity.Usuario;
import com.bydan.erp.seguridad.business.entity.ResumenUsuario;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralSg;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralUsuario;

import com.bydan.erp.seguridad.util.SistemaParameterReturnGeneral;



import com.bydan.erp.tesoreria.business.entity.*;
import com.bydan.erp.tesoreria.util.TipoCodigoSriBancoConstantesFunciones;

import com.bydan.erp.tesoreria.business.logic.*;
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
public class TipoCodigoSriBancoDetalleFormJInternalFrame extends TipoCodigoSriBancoBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	
	
	public JToolBar jTtoolBarDetalleTipoCodigoSriBanco;
	
	protected JMenuBar jmenuBarDetalleTipoCodigoSriBanco;
	
	protected JMenu jmenuDetalleTipoCodigoSriBanco;
	protected JMenu jmenuDetalleArchivoTipoCodigoSriBanco;
	protected JMenu jmenuDetalleAccionesTipoCodigoSriBanco;
	protected JMenu jmenuDetalleDatosTipoCodigoSriBanco;
	
	
	
	protected JPanel jContentPane = null;
	protected JPanel jContentPaneDetalleTipoCodigoSriBanco = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutTipoCodigoSriBanco;	
	protected GridBagConstraints gridBagConstraintsTipoCodigoSriBanco;	
		
	//protected JInternalFrameBase jInternalFrameParent; //ESTA EN BASE
	//protected TipoCodigoSriBancoBeanSwingJInternalFrameAdditional jInternalFrameDetalleTipoCodigoSriBanco;		
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	
	
	public TipoCodigoSriBancoSessionBean tipocodigosribancoSessionBean;
	
	
	
		
	
	public TipoCodigoSriBancoLogic tipocodigosribancoLogic;
	
	public JScrollPane jScrollPanelDatosTipoCodigoSriBanco;
	public JScrollPane jScrollPanelDatosEdicionTipoCodigoSriBanco;
	public JScrollPane jScrollPanelDatosGeneralTipoCodigoSriBanco;
	
	protected JPanel jPanelCamposTipoCodigoSriBanco;    
	protected JPanel jPanelCamposOcultosTipoCodigoSriBanco;    	
	protected JPanel jPanelAccionesTipoCodigoSriBanco;
	protected JPanel jPanelAccionesFormularioTipoCodigoSriBanco;
    
	
	
	protected Integer iXPanelCamposTipoCodigoSriBanco=0;
	protected Integer iYPanelCamposTipoCodigoSriBanco=0;
	
	protected Integer iXPanelCamposOcultosTipoCodigoSriBanco=0;
	protected Integer iYPanelCamposOcultosTipoCodigoSriBanco=0;
	
	;
	;
	
		
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	public JButton jButtonNuevoTipoCodigoSriBanco;
	public JButton jButtonModificarTipoCodigoSriBanco;
	public JButton jButtonActualizarTipoCodigoSriBanco;
    public JButton jButtonEliminarTipoCodigoSriBanco;
	public JButton jButtonCancelarTipoCodigoSriBanco;
    public JButton jButtonGuardarCambiosTipoCodigoSriBanco;
	public JButton jButtonGuardarCambiosTablaTipoCodigoSriBanco;
	protected JButton jButtonCerrarTipoCodigoSriBanco;
	
	
	protected JButton jButtonProcesarInformacionTipoCodigoSriBanco;
	
	
	protected JCheckBox jCheckBoxPostAccionNuevoTipoCodigoSriBanco;
	protected JCheckBox jCheckBoxPostAccionSinCerrarTipoCodigoSriBanco;
	protected JCheckBox jCheckBoxPostAccionSinMensajeTipoCodigoSriBanco;
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarTipoCodigoSriBanco;
	protected JButton jButtonModificarToolBarTipoCodigoSriBanco;
	protected JButton jButtonActualizarToolBarTipoCodigoSriBanco;
    protected JButton jButtonEliminarToolBarTipoCodigoSriBanco;
	protected JButton jButtonCancelarToolBarTipoCodigoSriBanco;
    protected JButton jButtonGuardarCambiosToolBarTipoCodigoSriBanco;
	protected JButton jButtonGuardarCambiosTablaToolBarTipoCodigoSriBanco;
	protected JButton jButtonMostrarOcultarTablaToolBarTipoCodigoSriBanco;
	protected JButton jButtonCerrarToolBarTipoCodigoSriBanco;
	
	protected JButton jButtonProcesarInformacionToolBarTipoCodigoSriBanco;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoTipoCodigoSriBanco;
	protected JMenuItem jMenuItemModificarTipoCodigoSriBanco;
	protected JMenuItem jMenuItemActualizarTipoCodigoSriBanco;
    protected JMenuItem jMenuItemEliminarTipoCodigoSriBanco;
	protected JMenuItem jMenuItemCancelarTipoCodigoSriBanco;
    protected JMenuItem jMenuItemGuardarCambiosTipoCodigoSriBanco;
	protected JMenuItem jMenuItemGuardarCambiosTablaTipoCodigoSriBanco;
	protected JMenuItem jMenuItemCerrarTipoCodigoSriBanco;
	protected JMenuItem jMenuItemDetalleCerrarTipoCodigoSriBanco;
	protected JMenuItem jMenuItemDetalleMostarOcultarTipoCodigoSriBanco;
	
	protected JMenuItem jMenuItemProcesarInformacionTipoCodigoSriBanco;
	protected JMenuItem jMenuItemNuevoGuardarCambiosTipoCodigoSriBanco;
	protected JMenuItem jMenuItemMostrarOcultarTipoCodigoSriBanco;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesTipoCodigoSriBanco;	
		
	
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesTipoCodigoSriBanco;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesTipoCodigoSriBanco;
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxTiposAccionesFormularioTipoCodigoSriBanco;
	
		
	
	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	public JPanel jPanelidTipoCodigoSriBanco;
	public JLabel jLabelIdTipoCodigoSriBanco;
	public JTextFieldMe jTextFieldidTipoCodigoSriBanco;
	public JButton jButtonidTipoCodigoSriBancoBusqueda= new JButtonMe();

	public JPanel jPanelcodigoTipoCodigoSriBanco;
	public JLabel jLabelcodigoTipoCodigoSriBanco;
	public JTextField jTextFieldcodigoTipoCodigoSriBanco;
	public JButton jButtoncodigoTipoCodigoSriBancoBusqueda= new JButtonMe();

	public JPanel jPanelnombreTipoCodigoSriBanco;
	public JLabel jLabelnombreTipoCodigoSriBanco;
	public JTextArea jTextAreanombreTipoCodigoSriBanco;
	public JScrollPane jscrollPanenombreTipoCodigoSriBanco;
	public JButton jButtonnombreTipoCodigoSriBancoBusqueda= new JButtonMe();

	
	
	
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JTabbedPane jTabbedPaneRelacionesTipoCodigoSriBanco;
	
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
	
	public TipoCodigoSriBancoDetalleFormJInternalFrame(String sTipo) throws Exception {
		super(PaginaTipo.FORMULARIO);
       
		try {
			
	  		if(sTipo.equals("MINIMO")) {
				/*
				this.jPanelCamposTipoCodigoSriBanco=new JPanel();
				this.jPanelAccionesFormularioTipoCodigoSriBanco=new JPanel();
				this.jmenuBarDetalleTipoCodigoSriBanco=new JMenuBar();
				this.jTtoolBarDetalleTipoCodigoSriBanco=new JToolBar();
				*/
	  		}
	  		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoCodigoSriBancoDetalleFormJInternalFrame(PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo); 
		
		//super("TipoCodigoSriBanco No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	//ES AUXILIAR PARA WINDOWS FORMS
	public TipoCodigoSriBancoDetalleFormJInternalFrame() throws Exception {
		super(PaginaTipo.FORMULARIO);
        //super("TipoCodigoSriBanco No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoCodigoSriBancoDetalleFormJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("TipoCodigoSriBanco No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoCodigoSriBancoDetalleFormJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("TipoCodigoSriBanco No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoCodigoSriBancoDetalleFormJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("TipoCodigoSriBanco No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	public JButton getjButtonActualizarToolBarTipoCodigoSriBanco() {
		return this.jButtonActualizarToolBarTipoCodigoSriBanco;
	}
	
	public JButton getjButtonEliminarToolBarTipoCodigoSriBanco() {
		return this.jButtonEliminarToolBarTipoCodigoSriBanco;
	}
	
	public JButton getjButtonCancelarToolBarTipoCodigoSriBanco() {
		return this.jButtonCancelarToolBarTipoCodigoSriBanco;
	}		
	
	public JButton getjButtonProcesarInformacionTipoCodigoSriBanco() {
		return this.jButtonProcesarInformacionTipoCodigoSriBanco;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionTipoCodigoSriBanco)	{
		this.jButtonProcesarInformacionTipoCodigoSriBanco = jButtonProcesarInformacionTipoCodigoSriBanco;
	}
	
	
	

	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesTipoCodigoSriBanco() {
		return this.jComboBoxTiposAccionesTipoCodigoSriBanco;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesTipoCodigoSriBanco(
			JComboBox jComboBoxTiposRelacionesTipoCodigoSriBanco) {
		this.jComboBoxTiposRelacionesTipoCodigoSriBanco = jComboBoxTiposRelacionesTipoCodigoSriBanco;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesTipoCodigoSriBanco(
			JComboBox jComboBoxTiposAccionesTipoCodigoSriBanco) {
		this.jComboBoxTiposAccionesTipoCodigoSriBanco = jComboBoxTiposAccionesTipoCodigoSriBanco;
	}		
	
			
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesFormularioTipoCodigoSriBanco() {
		return this.jComboBoxTiposAccionesFormularioTipoCodigoSriBanco;
	}				
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesFormularioTipoCodigoSriBanco(
			JComboBox jComboBoxTiposAccionesFormularioTipoCodigoSriBanco) {
		this.jComboBoxTiposAccionesFormularioTipoCodigoSriBanco = jComboBoxTiposAccionesFormularioTipoCodigoSriBanco;
	}
	
	private void initialize(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		this.tipocodigosribancoSessionBean=new TipoCodigoSriBancoSessionBean();
		
		this.tipocodigosribancoSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.tipocodigosribancoSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.tipocodigosribancoSessionBean.getEsGuardarRelacionado();				
		
		this.conMostrarAccionesCampo=parametroGeneralUsuario.getcon_mostrar_acciones_campo_general() || opcionActual.getcon_mostrar_acciones_campo();
		
		
		if(!this.conCargarMinimo) {
		
		}
		
			
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		TipoCodigoSriBancoJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		TipoCodigoSriBancoJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		TipoCodigoSriBancoJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"A MANTENIMIENTO"));
		
		
		if(iWidth > 650) {
			iWidth=650;
		}
		
		if(iHeight > 650) {
			iHeight=650;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
		
		if(!this.tipocodigosribancoSessionBean.getEsGuardarRelacionado()) {
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
	
		TipoCodigoSriBancoJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarDetalleTipoCodigoSriBanco= new JToolBar("MENU DATOS");		
		
		//TOOLBAR
		//PRINCIPAL				
				this.jButtonProcesarInformacionToolBarTipoCodigoSriBanco=new JButtonMe();
				this.jButtonModificarToolBarTipoCodigoSriBanco=new JButtonMe();							
		//PRINCIPAL
		
		//DETALLE
		this.jButtonActualizarToolBarTipoCodigoSriBanco=FuncionesSwing.getButtonToolBarGeneral(this.jButtonActualizarToolBarTipoCodigoSriBanco,this.jTtoolBarDetalleTipoCodigoSriBanco,
							"actualizar","actualizar","Actualizar"+" "+TipoCodigoSriBancoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"),"Actualizar",false);
		
		
		
		
		this.jButtonEliminarToolBarTipoCodigoSriBanco=FuncionesSwing.getButtonToolBarGeneral(this.jButtonEliminarToolBarTipoCodigoSriBanco,this.jTtoolBarDetalleTipoCodigoSriBanco,
							"eliminar","eliminar","Eliminar"+" "+TipoCodigoSriBancoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"),"Eliminar",false);
		
		
		
		
		this.jButtonCancelarToolBarTipoCodigoSriBanco=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCancelarToolBarTipoCodigoSriBanco,this.jTtoolBarDetalleTipoCodigoSriBanco,
							"cancelar","cancelar","Cancelar"+" "+TipoCodigoSriBancoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"),"Cancelar",false);
		
		
		
		
		this.jButtonGuardarCambiosToolBarTipoCodigoSriBanco=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosToolBarTipoCodigoSriBanco,this.jTtoolBarDetalleTipoCodigoSriBanco,
							"guardarcambios","guardarcambios","Guardar"+" "+TipoCodigoSriBancoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		
		FuncionesSwing.setBoldButtonToolBar(this.jButtonActualizarToolBarTipoCodigoSriBanco,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonEliminarToolBarTipoCodigoSriBanco,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonCancelarToolBarTipoCodigoSriBanco,STIPO_TAMANIO_GENERAL,false,false,this);
	}
	
	
	
	public void cargarMenus() {		
		
		this.jmenuBarDetalleTipoCodigoSriBanco=new JMenuBarMe();
		
		//DETALLE
		this.jmenuDetalleTipoCodigoSriBanco=new JMenuMe("Datos Relacionados");
		this.jmenuDetalleArchivoTipoCodigoSriBanco=new JMenuMe("Archivo");
		this.jmenuDetalleAccionesTipoCodigoSriBanco=new JMenuMe("Acciones");
		this.jmenuDetalleDatosTipoCodigoSriBanco=new JMenuMe("Datos");
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoTipoCodigoSriBanco= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoTipoCodigoSriBanco.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoTipoCodigoSriBanco,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoTipoCodigoSriBanco, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemModificarTipoCodigoSriBanco= new JMenuItem("Editar" + FuncionesSwing.getKeyMensaje("MODIFICAR"));
		this.jMenuItemModificarTipoCodigoSriBanco.setActionCommand("Editar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemModificarTipoCodigoSriBanco,"modificar_button","Editar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemModificarTipoCodigoSriBanco, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemActualizarTipoCodigoSriBanco= new JMenuItem("Actualizar" + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
		this.jMenuItemActualizarTipoCodigoSriBanco.setActionCommand("Actualizar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemActualizarTipoCodigoSriBanco,"actualizar_button","Actualizar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemActualizarTipoCodigoSriBanco, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemEliminarTipoCodigoSriBanco= new JMenuItem("Eliminar" + FuncionesSwing.getKeyMensaje("ELIMINAR"));
		this.jMenuItemEliminarTipoCodigoSriBanco.setActionCommand("Eliminar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemEliminarTipoCodigoSriBanco,"eliminar_button","Eliminar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemEliminarTipoCodigoSriBanco, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCancelarTipoCodigoSriBanco= new JMenuItem("Cancelar" + FuncionesSwing.getKeyMensaje("CANCELAR"));
		this.jMenuItemCancelarTipoCodigoSriBanco.setActionCommand("Cancelar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCancelarTipoCodigoSriBanco,"cancelar_button","Cancelar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCancelarTipoCodigoSriBanco, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosTipoCodigoSriBanco= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTipoCodigoSriBanco.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTipoCodigoSriBanco,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTipoCodigoSriBanco, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarTipoCodigoSriBanco= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarTipoCodigoSriBanco.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarTipoCodigoSriBanco,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarTipoCodigoSriBanco, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleCerrarTipoCodigoSriBanco= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemDetalleCerrarTipoCodigoSriBanco.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleCerrarTipoCodigoSriBanco,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleCerrarTipoCodigoSriBanco, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarTipoCodigoSriBanco= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarTipoCodigoSriBanco.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarTipoCodigoSriBanco,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarTipoCodigoSriBanco, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarTipoCodigoSriBanco= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarTipoCodigoSriBanco.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarTipoCodigoSriBanco,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarTipoCodigoSriBanco, STIPO_TAMANIO_GENERAL,false,true,this);			
		
		//DETALLE
		this.jmenuDetalleArchivoTipoCodigoSriBanco.add(this.jMenuItemDetalleCerrarTipoCodigoSriBanco);
		
		this.jmenuDetalleAccionesTipoCodigoSriBanco.add(this.jMenuItemActualizarTipoCodigoSriBanco);
		this.jmenuDetalleAccionesTipoCodigoSriBanco.add(this.jMenuItemEliminarTipoCodigoSriBanco);
		this.jmenuDetalleAccionesTipoCodigoSriBanco.add(this.jMenuItemCancelarTipoCodigoSriBanco);		
		
		//this.jmenuDetalleDatosTipoCodigoSriBanco.add(this.jMenuItemDetalleAbrirOrderByTipoCodigoSriBanco);				
		this.jmenuDetalleDatosTipoCodigoSriBanco.add(this.jMenuItemDetalleMostarOcultarTipoCodigoSriBanco);				
				
		//this.jmenuDetalleAccionesTipoCodigoSriBanco.add(this.jMenuItemGuardarCambiosTipoCodigoSriBanco);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES				
		
		//DETALLE
		FuncionesSwing.setBoldMenu(this.jmenuDetalleArchivoTipoCodigoSriBanco, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleAccionesTipoCodigoSriBanco, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleDatosTipoCodigoSriBanco, STIPO_TAMANIO_GENERAL,false,true,this);
			
		this.jmenuBarDetalleTipoCodigoSriBanco.add(this.jmenuDetalleArchivoTipoCodigoSriBanco);		
		this.jmenuBarDetalleTipoCodigoSriBanco.add(this.jmenuDetalleAccionesTipoCodigoSriBanco);		
		this.jmenuBarDetalleTipoCodigoSriBanco.add(this.jmenuDetalleDatosTipoCodigoSriBanco);		
		
		//DETALLE_FIN
		
		
		//AGREGA MENU DETALLE A PANTALLA
		this.setJMenuBar(this.jmenuBarDetalleTipoCodigoSriBanco);				
	}
	
	
	public void inicializarElementosCamposTipoCodigoSriBanco() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		jLabelIdTipoCodigoSriBanco = new JLabelMe();
		jLabelIdTipoCodigoSriBanco.setText(""+Constantes2.S_CODIGO_UNICO+"");
		jLabelIdTipoCodigoSriBanco.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdTipoCodigoSriBanco.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdTipoCodigoSriBanco.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelIdTipoCodigoSriBanco,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jPanelidTipoCodigoSriBanco = new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelidTipoCodigoSriBanco.setToolTipText(TipoCodigoSriBancoConstantesFunciones.LABEL_ID);
		this.gridaBagLayoutTipoCodigoSriBanco= new GridBagLayout();

		this.jPanelidTipoCodigoSriBanco.setLayout(this.gridaBagLayoutTipoCodigoSriBanco);

		jTextFieldidTipoCodigoSriBanco = new JTextFieldMe();
		jTextFieldidTipoCodigoSriBanco.setText("Id");

		jTextFieldidTipoCodigoSriBanco.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jTextFieldidTipoCodigoSriBanco.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jTextFieldidTipoCodigoSriBanco.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));



					
		this.jLabelcodigoTipoCodigoSriBanco = new JLabelMe();
		this.jLabelcodigoTipoCodigoSriBanco.setText(""+TipoCodigoSriBancoConstantesFunciones.LABEL_CODIGO+" : *");
		this.jLabelcodigoTipoCodigoSriBanco.setToolTipText("Codigo");
		this.jLabelcodigoTipoCodigoSriBanco.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcodigoTipoCodigoSriBanco.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcodigoTipoCodigoSriBanco.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelcodigoTipoCodigoSriBanco,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelcodigoTipoCodigoSriBanco=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelcodigoTipoCodigoSriBanco.setToolTipText(TipoCodigoSriBancoConstantesFunciones.LABEL_CODIGO);
		this.gridaBagLayoutTipoCodigoSriBanco = new GridBagLayout();
		this.jPanelcodigoTipoCodigoSriBanco.setLayout(this.gridaBagLayoutTipoCodigoSriBanco);


		jTextFieldcodigoTipoCodigoSriBanco= new JTextFieldMe();

		jTextFieldcodigoTipoCodigoSriBanco.setEnabled(false);
		jTextFieldcodigoTipoCodigoSriBanco.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcodigoTipoCodigoSriBanco.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcodigoTipoCodigoSriBanco.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldcodigoTipoCodigoSriBanco,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtoncodigoTipoCodigoSriBancoBusqueda= new JButtonMe();
		this.jButtoncodigoTipoCodigoSriBancoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncodigoTipoCodigoSriBancoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncodigoTipoCodigoSriBancoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtoncodigoTipoCodigoSriBancoBusqueda.setText("U");
		this.jButtoncodigoTipoCodigoSriBancoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtoncodigoTipoCodigoSriBancoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtoncodigoTipoCodigoSriBancoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldcodigoTipoCodigoSriBanco.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldcodigoTipoCodigoSriBanco.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"codigoTipoCodigoSriBancoBusqueda"));

		if(this.tipocodigosribancoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtoncodigoTipoCodigoSriBancoBusqueda.setVisible(false);		}


					
		this.jLabelnombreTipoCodigoSriBanco = new JLabelMe();
		this.jLabelnombreTipoCodigoSriBanco.setText(""+TipoCodigoSriBancoConstantesFunciones.LABEL_NOMBRE+" : *");
		this.jLabelnombreTipoCodigoSriBanco.setToolTipText("Nombre");
		this.jLabelnombreTipoCodigoSriBanco.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnombreTipoCodigoSriBanco.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnombreTipoCodigoSriBanco.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelnombreTipoCodigoSriBanco,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelnombreTipoCodigoSriBanco=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelnombreTipoCodigoSriBanco.setToolTipText(TipoCodigoSriBancoConstantesFunciones.LABEL_NOMBRE);
		this.gridaBagLayoutTipoCodigoSriBanco = new GridBagLayout();
		this.jPanelnombreTipoCodigoSriBanco.setLayout(this.gridaBagLayoutTipoCodigoSriBanco);


		jTextAreanombreTipoCodigoSriBanco= new JTextAreaMe();
		jTextAreanombreTipoCodigoSriBanco.setEnabled(false);
		jTextAreanombreTipoCodigoSriBanco.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreTipoCodigoSriBanco.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreTipoCodigoSriBanco.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreTipoCodigoSriBanco.setLineWrap(true);
		jTextAreanombreTipoCodigoSriBanco.setWrapStyleWord(true);
		jTextAreanombreTipoCodigoSriBanco.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreanombreTipoCodigoSriBanco.setRows(4);

		FuncionesSwing.setBoldTextArea(jTextAreanombreTipoCodigoSriBanco,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPanenombreTipoCodigoSriBanco = new JScrollPane(jTextAreanombreTipoCodigoSriBanco);
		jscrollPanenombreTipoCodigoSriBanco.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanenombreTipoCodigoSriBanco.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanenombreTipoCodigoSriBanco.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));

		this.jButtonnombreTipoCodigoSriBancoBusqueda= new JButtonMe();
		this.jButtonnombreTipoCodigoSriBancoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombreTipoCodigoSriBancoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombreTipoCodigoSriBancoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonnombreTipoCodigoSriBancoBusqueda.setText("U");
		this.jButtonnombreTipoCodigoSriBancoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonnombreTipoCodigoSriBancoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonnombreTipoCodigoSriBancoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreanombreTipoCodigoSriBanco.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreanombreTipoCodigoSriBanco.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"nombreTipoCodigoSriBancoBusqueda"));

		if(this.tipocodigosribancoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonnombreTipoCodigoSriBancoBusqueda.setVisible(false);		}


	}
	
	public void inicializarElementosCamposForeigKeysTipoCodigoSriBanco() {
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
		//this.jInternalFrameDetalleTipoCodigoSriBanco = new TipoCodigoSriBancoBeanSwingJInternalFrameAdditional(paginaTipo);//JInternalFrameBase("A DATOS");
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutTipoCodigoSriBanco= new GridBagLayout();
		

		
		String sToolTipTipoCodigoSriBanco="";
		sToolTipTipoCodigoSriBanco=TipoCodigoSriBancoConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipTipoCodigoSriBanco+="(Tesoreria.TipoCodigoSriBanco)";
		}
		
		if(!this.tipocodigosribancoSessionBean.getEsGuardarRelacionado()) {
			sToolTipTipoCodigoSriBanco+="_"+this.opcionActual.getId();
		}
								
		
		this.jButtonNuevoTipoCodigoSriBanco = new JButtonMe();
		this.jButtonModificarTipoCodigoSriBanco = new JButtonMe();
        this.jButtonActualizarTipoCodigoSriBanco = new JButtonMe();
        this.jButtonEliminarTipoCodigoSriBanco = new JButtonMe();
        this.jButtonCancelarTipoCodigoSriBanco = new JButtonMe();
        this.jButtonGuardarCambiosTipoCodigoSriBanco = new JButtonMe();
		this.jButtonGuardarCambiosTablaTipoCodigoSriBanco = new JButtonMe();
		this.jButtonCerrarTipoCodigoSriBanco = new JButtonMe();
		
		this.jScrollPanelDatosTipoCodigoSriBanco = new JScrollPane();   
        this.jScrollPanelDatosEdicionTipoCodigoSriBanco = new JScrollPane();
		this.jScrollPanelDatosGeneralTipoCodigoSriBanco = new JScrollPane();
				
		
		
		this.jPanelCamposTipoCodigoSriBanco = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelCamposOcultosTipoCodigoSriBanco = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
        this.jPanelAccionesTipoCodigoSriBanco = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		this.jPanelAccionesFormularioTipoCodigoSriBanco = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		this.sPath=" <---> Acceso: A";
		
		if(!this.tipocodigosribancoSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosTipoCodigoSriBanco.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos As" + this.sPath));
		} else {
			this.jScrollPanelDatosTipoCodigoSriBanco.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosEdicionTipoCodigoSriBanco.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		this.jScrollPanelDatosGeneralTipoCodigoSriBanco.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
			
        this.jPanelCamposTipoCodigoSriBanco.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
        this.jPanelCamposTipoCodigoSriBanco.setName("jPanelCamposTipoCodigoSriBanco"); 

		this.jPanelCamposOcultosTipoCodigoSriBanco.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos Ocultos"));
        this.jPanelCamposOcultosTipoCodigoSriBanco.setName("jPanelCamposOcultosTipoCodigoSriBanco"); 

        this.jPanelAccionesTipoCodigoSriBanco.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesTipoCodigoSriBanco.setToolTipText("Acciones");
        this.jPanelAccionesTipoCodigoSriBanco.setName("Acciones"); 

		this.jPanelAccionesFormularioTipoCodigoSriBanco.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones Extra/Post"));
        this.jPanelAccionesFormularioTipoCodigoSriBanco.setToolTipText("Acciones");
        this.jPanelAccionesFormularioTipoCodigoSriBanco.setName("Acciones"); 
		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosEdicionTipoCodigoSriBanco, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralTipoCodigoSriBanco, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosTipoCodigoSriBanco, STIPO_TAMANIO_GENERAL,false,false,this);		
		FuncionesSwing.setBoldPanel(this.jPanelCamposTipoCodigoSriBanco, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelCamposOcultosTipoCodigoSriBanco, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelAccionesFormularioTipoCodigoSriBanco, STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {
		
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		
        this.jButtonNuevoTipoCodigoSriBanco.setText("Nuevo");
		this.jButtonModificarTipoCodigoSriBanco.setText("Editar");
        this.jButtonActualizarTipoCodigoSriBanco.setText("Actualizar");
        this.jButtonEliminarTipoCodigoSriBanco.setText("Eliminar");
        this.jButtonCancelarTipoCodigoSriBanco.setText("Cancelar");
        this.jButtonGuardarCambiosTipoCodigoSriBanco.setText("Guardar");
		this.jButtonGuardarCambiosTablaTipoCodigoSriBanco.setText("Guardar");
		this.jButtonCerrarTipoCodigoSriBanco.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoTipoCodigoSriBanco,"nuevo_button","Nuevo",this.tipocodigosribancoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonModificarTipoCodigoSriBanco,"modificar_button","Editar",this.tipocodigosribancoSessionBean.getEsGuardarRelacionado());
       	FuncionesSwing.addImagenButtonGeneral(this.jButtonActualizarTipoCodigoSriBanco,"actualizar_button","Actualizar",this.tipocodigosribancoSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonEliminarTipoCodigoSriBanco,"eliminar_button","Eliminar",this.tipocodigosribancoSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonCancelarTipoCodigoSriBanco,"cancelar_button","Cancelar",this.tipocodigosribancoSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTipoCodigoSriBanco,"guardarcambios_button","Guardar",this.tipocodigosribancoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaTipoCodigoSriBanco,"guardarcambiostabla_button","Guardar",this.tipocodigosribancoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarTipoCodigoSriBanco,"cerrar_button","Salir",this.tipocodigosribancoSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoTipoCodigoSriBanco, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonModificarTipoCodigoSriBanco, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTipoCodigoSriBanco, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaTipoCodigoSriBanco, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarTipoCodigoSriBanco, STIPO_TAMANIO_GENERAL,false,true,this);
		
		FuncionesSwing.setBoldButton(this.jButtonActualizarTipoCodigoSriBanco, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonEliminarTipoCodigoSriBanco, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonCancelarTipoCodigoSriBanco, STIPO_TAMANIO_GENERAL,false,false,this);
		
		this.jButtonNuevoTipoCodigoSriBanco.setToolTipText("Nuevo"+" "+TipoCodigoSriBancoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonModificarTipoCodigoSriBanco.setToolTipText("Editar"+" "+TipoCodigoSriBancoConstantesFunciones.SCLASSWEBTITULO+"");// + FuncionesSwing.getKeyMensaje("MODIFICAR"))
        this.jButtonActualizarTipoCodigoSriBanco.setToolTipText("Actualizar"+" "+TipoCodigoSriBancoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
        this.jButtonEliminarTipoCodigoSriBanco.setToolTipText("Eliminar)"+" "+TipoCodigoSriBancoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"));
        this.jButtonCancelarTipoCodigoSriBanco.setToolTipText("Cancelar"+" "+TipoCodigoSriBancoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"));
        this.jButtonGuardarCambiosTipoCodigoSriBanco.setToolTipText("Guardar"+" "+TipoCodigoSriBancoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonGuardarCambiosTablaTipoCodigoSriBanco.setToolTipText("Guardar"+" "+TipoCodigoSriBancoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarTipoCodigoSriBanco.setToolTipText("Salir"+" "+TipoCodigoSriBancoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoTipoCodigoSriBanco";
		inputMap = this.jButtonNuevoTipoCodigoSriBanco.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoTipoCodigoSriBanco.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoTipoCodigoSriBanco"));
		
		//ACTUALIZAR
		sMapKey = "ActualizarTipoCodigoSriBanco";
		inputMap = this.jButtonActualizarTipoCodigoSriBanco.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ACTUALIZAR") , FuncionesSwing.getMaskKey("ACTUALIZAR")), sMapKey);
		
		this.jButtonActualizarTipoCodigoSriBanco.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ActualizarTipoCodigoSriBanco"));
		
		//ELIMINAR
		sMapKey = "EliminarTipoCodigoSriBanco";
		inputMap = this.jButtonEliminarTipoCodigoSriBanco.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ELIMINAR") , FuncionesSwing.getMaskKey("ELIMINAR")), sMapKey);
		
		this.jButtonEliminarTipoCodigoSriBanco.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"EliminarTipoCodigoSriBanco"));
		
		//CANCELAR	
		sMapKey = "CancelarTipoCodigoSriBanco";
		inputMap = this.jButtonCancelarTipoCodigoSriBanco.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CANCELAR") , FuncionesSwing.getMaskKey("CANCELAR")), sMapKey);
		
		this.jButtonCancelarTipoCodigoSriBanco.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CancelarTipoCodigoSriBanco"));
		
		//CERRAR		
		sMapKey = "CerrarTipoCodigoSriBanco";
		inputMap = this.jButtonCerrarTipoCodigoSriBanco.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarTipoCodigoSriBanco.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarTipoCodigoSriBanco"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaTipoCodigoSriBanco";
		inputMap = this.jButtonGuardarCambiosTablaTipoCodigoSriBanco.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaTipoCodigoSriBanco.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaTipoCodigoSriBanco"));
		
		//HOT KEYS
		
		this.jCheckBoxPostAccionNuevoTipoCodigoSriBanco = new JCheckBoxMe();
		this.jCheckBoxPostAccionNuevoTipoCodigoSriBanco.setText("Nuevo");
		this.jCheckBoxPostAccionNuevoTipoCodigoSriBanco.setToolTipText("Nuevo TipoCodigoSriBanco");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionNuevoTipoCodigoSriBanco, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinCerrarTipoCodigoSriBanco = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinCerrarTipoCodigoSriBanco.setText("Sin Cerrar");
		this.jCheckBoxPostAccionSinCerrarTipoCodigoSriBanco.setToolTipText("Sin Cerrar Ventana TipoCodigoSriBanco");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinCerrarTipoCodigoSriBanco, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinMensajeTipoCodigoSriBanco = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinMensajeTipoCodigoSriBanco.setText("Sin Mensaje");
		this.jCheckBoxPostAccionSinMensajeTipoCodigoSriBanco.setToolTipText("Sin Mensaje Confirmacion");				
				
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinMensajeTipoCodigoSriBanco, STIPO_TAMANIO_GENERAL,false,false,this);       	
       
				
		
			
			
		this.jComboBoxTiposAccionesTipoCodigoSriBanco = new JComboBoxMe();
		//this.jComboBoxTiposAccionesTipoCodigoSriBanco.setText("Accion");
		this.jComboBoxTiposAccionesTipoCodigoSriBanco.setToolTipText("Tipos de Acciones");
							
		

		this.jComboBoxTiposAccionesFormularioTipoCodigoSriBanco = new JComboBoxMe();
		//this.jComboBoxTiposAccionesFormularioTipoCodigoSriBanco.setText("Accion");				
    	this.jComboBoxTiposAccionesFormularioTipoCodigoSriBanco.setToolTipText("Tipos de Acciones");
	
		this.jLabelAccionesTipoCodigoSriBanco = new JLabelMe();
		
		this.jLabelAccionesTipoCodigoSriBanco.setText("Acciones");		
		this.jLabelAccionesTipoCodigoSriBanco.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesTipoCodigoSriBanco.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesTipoCodigoSriBanco.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
        //HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		//HOT KEYS2
		
		//ELEMENTOS
		this.inicializarElementosCamposTipoCodigoSriBanco();
		
		//ELEMENTOS FK
		this.inicializarElementosCamposForeigKeysTipoCodigoSriBanco();
				
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		this.jTabbedPaneRelacionesTipoCodigoSriBanco=new JTabbedPane();
		this.jTabbedPaneRelacionesTipoCodigoSriBanco.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Relacionados"));
		
		//ESTA EN BEAN

		
		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneRelacionesTipoCodigoSriBanco,STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		int iPosXAccionPaginacion=0;
		
		
		
				
		
		this.jComboBoxTiposAccionesTipoCodigoSriBanco.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesTipoCodigoSriBanco.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesTipoCodigoSriBanco.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesTipoCodigoSriBanco, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		
		
		this.jComboBoxTiposAccionesFormularioTipoCodigoSriBanco.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioTipoCodigoSriBanco.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioTipoCodigoSriBanco.setPreferredSize(new Dimension(145,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesFormularioTipoCodigoSriBanco, STIPO_TAMANIO_GENERAL,false,false,this);				
		
		GridBagLayout gridaBagLayoutCamposTipoCodigoSriBanco = new GridBagLayout();
		GridBagLayout gridaBagLayoutCamposOcultosTipoCodigoSriBanco = new GridBagLayout();
		
		this.jPanelCamposTipoCodigoSriBanco.setLayout(gridaBagLayoutCamposTipoCodigoSriBanco);
		this.jPanelCamposOcultosTipoCodigoSriBanco.setLayout(gridaBagLayoutCamposOcultosTipoCodigoSriBanco);
		
		;
		;
		
		
		//SUBPANELES SIMPLES
		//SUBPANELES POR CAMPO
        
	this.gridBagConstraintsTipoCodigoSriBanco = new GridBagConstraints();
	this.gridBagConstraintsTipoCodigoSriBanco.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoCodigoSriBanco.gridy = 0;
	this.gridBagConstraintsTipoCodigoSriBanco.gridx = 0;
	this.gridBagConstraintsTipoCodigoSriBanco.ipadx = 0;
	this.gridBagConstraintsTipoCodigoSriBanco.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelidTipoCodigoSriBanco.add(jLabelIdTipoCodigoSriBanco, this.gridBagConstraintsTipoCodigoSriBanco);



	this.gridBagConstraintsTipoCodigoSriBanco = new GridBagConstraints();
	this.gridBagConstraintsTipoCodigoSriBanco.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoCodigoSriBanco.gridy = 0;
	this.gridBagConstraintsTipoCodigoSriBanco.gridx = 1;
	this.gridBagConstraintsTipoCodigoSriBanco.ipadx = 0;
	this.gridBagConstraintsTipoCodigoSriBanco.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelidTipoCodigoSriBanco.add(jTextFieldidTipoCodigoSriBanco, this.gridBagConstraintsTipoCodigoSriBanco);


	this.gridBagConstraintsTipoCodigoSriBanco = new GridBagConstraints();
	this.gridBagConstraintsTipoCodigoSriBanco.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoCodigoSriBanco.gridy = 0;
	this.gridBagConstraintsTipoCodigoSriBanco.gridx = 0;
	this.gridBagConstraintsTipoCodigoSriBanco.ipadx = 0;
	this.gridBagConstraintsTipoCodigoSriBanco.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelcodigoTipoCodigoSriBanco.add(jLabelcodigoTipoCodigoSriBanco, this.gridBagConstraintsTipoCodigoSriBanco);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsTipoCodigoSriBanco = new GridBagConstraints();
		//this.gridBagConstraintsTipoCodigoSriBanco.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoCodigoSriBanco.gridy = 0;
		this.gridBagConstraintsTipoCodigoSriBanco.gridx = 2;
		this.gridBagConstraintsTipoCodigoSriBanco.ipadx = 0;
		this.gridBagConstraintsTipoCodigoSriBanco.insets = new Insets(0, 0, 0, 0);
		this.jPanelcodigoTipoCodigoSriBanco.add(jButtoncodigoTipoCodigoSriBancoBusqueda, this.gridBagConstraintsTipoCodigoSriBanco);
	}

	this.gridBagConstraintsTipoCodigoSriBanco = new GridBagConstraints();
	this.gridBagConstraintsTipoCodigoSriBanco.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoCodigoSriBanco.gridy = 0;
	this.gridBagConstraintsTipoCodigoSriBanco.gridx = 1;
	this.gridBagConstraintsTipoCodigoSriBanco.ipadx = 0;
	this.gridBagConstraintsTipoCodigoSriBanco.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelcodigoTipoCodigoSriBanco.add(jTextFieldcodigoTipoCodigoSriBanco, this.gridBagConstraintsTipoCodigoSriBanco);


	this.gridBagConstraintsTipoCodigoSriBanco = new GridBagConstraints();
	this.gridBagConstraintsTipoCodigoSriBanco.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoCodigoSriBanco.gridy = 0;
	this.gridBagConstraintsTipoCodigoSriBanco.gridx = 0;
	this.gridBagConstraintsTipoCodigoSriBanco.ipadx = 0;
	this.gridBagConstraintsTipoCodigoSriBanco.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelnombreTipoCodigoSriBanco.add(jLabelnombreTipoCodigoSriBanco, this.gridBagConstraintsTipoCodigoSriBanco);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsTipoCodigoSriBanco = new GridBagConstraints();
		//this.gridBagConstraintsTipoCodigoSriBanco.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoCodigoSriBanco.gridy = 0;
		this.gridBagConstraintsTipoCodigoSriBanco.gridx = 2;
		this.gridBagConstraintsTipoCodigoSriBanco.ipadx = 0;
		this.gridBagConstraintsTipoCodigoSriBanco.insets = new Insets(0, 0, 0, 0);
		this.jPanelnombreTipoCodigoSriBanco.add(jButtonnombreTipoCodigoSriBancoBusqueda, this.gridBagConstraintsTipoCodigoSriBanco);
	}

	this.gridBagConstraintsTipoCodigoSriBanco = new GridBagConstraints();
	this.gridBagConstraintsTipoCodigoSriBanco.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoCodigoSriBanco.gridy = 0;
	this.gridBagConstraintsTipoCodigoSriBanco.gridx = 1;
	this.gridBagConstraintsTipoCodigoSriBanco.ipadx = 0;
	this.gridBagConstraintsTipoCodigoSriBanco.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelnombreTipoCodigoSriBanco.add(jscrollPanenombreTipoCodigoSriBanco, this.gridBagConstraintsTipoCodigoSriBanco);


		//SUBPANELES SIMPLES
		
		//SUBPANELES EN PANEL
		//SUBPANELES EN PANEL CAMPOS NORMAL				
		
	this.gridBagConstraintsTipoCodigoSriBanco = new GridBagConstraints();
	this.gridBagConstraintsTipoCodigoSriBanco.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsTipoCodigoSriBanco.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsTipoCodigoSriBanco.gridy = iYPanelCamposTipoCodigoSriBanco;
	this.gridBagConstraintsTipoCodigoSriBanco.gridx = iXPanelCamposTipoCodigoSriBanco++;
	this.gridBagConstraintsTipoCodigoSriBanco.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsTipoCodigoSriBanco.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposTipoCodigoSriBanco.add(this.jPanelidTipoCodigoSriBanco, this.gridBagConstraintsTipoCodigoSriBanco);



	if(iXPanelCamposTipoCodigoSriBanco % 1==0) {
		iXPanelCamposTipoCodigoSriBanco=0;
		iYPanelCamposTipoCodigoSriBanco++;
	}
	this.gridBagConstraintsTipoCodigoSriBanco = new GridBagConstraints();
	this.gridBagConstraintsTipoCodigoSriBanco.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsTipoCodigoSriBanco.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsTipoCodigoSriBanco.gridy = iYPanelCamposTipoCodigoSriBanco;
	this.gridBagConstraintsTipoCodigoSriBanco.gridx = iXPanelCamposTipoCodigoSriBanco++;
	this.gridBagConstraintsTipoCodigoSriBanco.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsTipoCodigoSriBanco.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposTipoCodigoSriBanco.add(this.jPanelcodigoTipoCodigoSriBanco, this.gridBagConstraintsTipoCodigoSriBanco);



	if(iXPanelCamposTipoCodigoSriBanco % 1==0) {
		iXPanelCamposTipoCodigoSriBanco=0;
		iYPanelCamposTipoCodigoSriBanco++;
	}
	this.gridBagConstraintsTipoCodigoSriBanco = new GridBagConstraints();
	this.gridBagConstraintsTipoCodigoSriBanco.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsTipoCodigoSriBanco.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsTipoCodigoSriBanco.gridy = iYPanelCamposTipoCodigoSriBanco;
	this.gridBagConstraintsTipoCodigoSriBanco.gridx = iXPanelCamposTipoCodigoSriBanco++;
	this.gridBagConstraintsTipoCodigoSriBanco.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsTipoCodigoSriBanco.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposTipoCodigoSriBanco.add(this.jPanelnombreTipoCodigoSriBanco, this.gridBagConstraintsTipoCodigoSriBanco);



	if(iXPanelCamposTipoCodigoSriBanco % 1==0) {
		iXPanelCamposTipoCodigoSriBanco=0;
		iYPanelCamposTipoCodigoSriBanco++;
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
			
		GridBagLayout gridaBagLayoutAccionesTipoCodigoSriBanco= new GridBagLayout();
		this.jPanelAccionesTipoCodigoSriBanco.setLayout(gridaBagLayoutAccionesTipoCodigoSriBanco);
		
		GridBagLayout gridaBagLayoutAccionesFormularioTipoCodigoSriBanco= new GridBagLayout();
		this.jPanelAccionesFormularioTipoCodigoSriBanco.setLayout(gridaBagLayoutAccionesFormularioTipoCodigoSriBanco);
		
		this.gridBagConstraintsTipoCodigoSriBanco = new GridBagConstraints();
		this.gridBagConstraintsTipoCodigoSriBanco.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsTipoCodigoSriBanco.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioTipoCodigoSriBanco.add(this.jComboBoxTiposAccionesFormularioTipoCodigoSriBanco, this.gridBagConstraintsTipoCodigoSriBanco);

		this.gridBagConstraintsTipoCodigoSriBanco = new GridBagConstraints();
		this.gridBagConstraintsTipoCodigoSriBanco.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsTipoCodigoSriBanco.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioTipoCodigoSriBanco.add(this.jCheckBoxPostAccionNuevoTipoCodigoSriBanco, this.gridBagConstraintsTipoCodigoSriBanco);
			
		//DEBE CERRARSE Y ACTUALIZARSE TODO NUEVAMENTE, SI ES RELACIONADO PUEDE FUNCIONAR
		//if(!this.tipocodigosribancoSessionBean.getEstaModoGuardarRelaciones()) {		
		//SE ARRIESGA
		//if(!this.conFuncionalidadRelaciones) {		
			this.gridBagConstraintsTipoCodigoSriBanco = new GridBagConstraints();
			this.gridBagConstraintsTipoCodigoSriBanco.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsTipoCodigoSriBanco.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioTipoCodigoSriBanco.add(this.jCheckBoxPostAccionSinCerrarTipoCodigoSriBanco, this.gridBagConstraintsTipoCodigoSriBanco);
		//}
		
		
		//NO TIENE MENSAJE POR DEFINICION, O ES MUY COMPLEJO LA PANTALLA PARA HACERLO MAS COMPLICADO
		if(!this.tipocodigosribancoSessionBean.getEsGuardarRelacionado()
			){				
			//&& !this.tipocodigosribancoSessionBean.getEstaModoGuardarRelaciones()) {
							
			this.gridBagConstraintsTipoCodigoSriBanco = new GridBagConstraints();
			this.gridBagConstraintsTipoCodigoSriBanco.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsTipoCodigoSriBanco.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioTipoCodigoSriBanco.add(this.jCheckBoxPostAccionSinMensajeTipoCodigoSriBanco, this.gridBagConstraintsTipoCodigoSriBanco);
		}
		
		
		int iPosXAccion=0;
		
		this.gridBagConstraintsTipoCodigoSriBanco = new GridBagConstraints();
		this.gridBagConstraintsTipoCodigoSriBanco.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoCodigoSriBanco.gridy = 0;
		this.gridBagConstraintsTipoCodigoSriBanco.gridx = iPosXAccion++;
			
		this.jPanelAccionesTipoCodigoSriBanco.add(this.jButtonModificarTipoCodigoSriBanco, this.gridBagConstraintsTipoCodigoSriBanco);							

		this.gridBagConstraintsTipoCodigoSriBanco = new GridBagConstraints();
		this.gridBagConstraintsTipoCodigoSriBanco.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoCodigoSriBanco.gridy = 0;
		this.gridBagConstraintsTipoCodigoSriBanco.gridx =iPosXAccion++;
			
		this.jPanelAccionesTipoCodigoSriBanco.add(this.jButtonEliminarTipoCodigoSriBanco, this.gridBagConstraintsTipoCodigoSriBanco);
		
			
		this.gridBagConstraintsTipoCodigoSriBanco = new GridBagConstraints();
		this.gridBagConstraintsTipoCodigoSriBanco.gridy = 0;		
		this.gridBagConstraintsTipoCodigoSriBanco.gridx = iPosXAccion++;
		
		this.jPanelAccionesTipoCodigoSriBanco.add(this.jButtonActualizarTipoCodigoSriBanco, this.gridBagConstraintsTipoCodigoSriBanco);


		this.gridBagConstraintsTipoCodigoSriBanco = new GridBagConstraints();
		this.gridBagConstraintsTipoCodigoSriBanco.gridy = 0;		
		this.gridBagConstraintsTipoCodigoSriBanco.gridx = iPosXAccion++;
		
		this.jPanelAccionesTipoCodigoSriBanco.add(this.jButtonGuardarCambiosTipoCodigoSriBanco, this.gridBagConstraintsTipoCodigoSriBanco);	
		
		this.gridBagConstraintsTipoCodigoSriBanco = new GridBagConstraints();
		this.gridBagConstraintsTipoCodigoSriBanco.gridy = 0;		
		this.gridBagConstraintsTipoCodigoSriBanco.gridx =iPosXAccion++;
		
		this.jPanelAccionesTipoCodigoSriBanco.add(this.jButtonCancelarTipoCodigoSriBanco, this.gridBagConstraintsTipoCodigoSriBanco);
		
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutTipoCodigoSriBanco = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutTipoCodigoSriBanco);
		
		if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.tipocodigosribancoSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsTipoCodigoSriBanco = new GridBagConstraints();						
			this.gridBagConstraintsTipoCodigoSriBanco.gridy = iGridyPrincipal++;
			this.gridBagConstraintsTipoCodigoSriBanco.gridx = 0;		
			//this.gridBagConstraintsTipoCodigoSriBanco.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoCodigoSriBanco.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsTipoCodigoSriBanco.ipadx = 100;
				
			
		}
		
		//PROCESANDO EN OTRA PANTALLA
		
		
		int iGridxBusquedasParametros=0;
		
	
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			//NO BUSQUEDA
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		
		this.gridBagConstraintsTipoCodigoSriBanco = new GridBagConstraints();
		this.gridBagConstraintsTipoCodigoSriBanco.gridy =iGridyPrincipal++;
		this.gridBagConstraintsTipoCodigoSriBanco.gridx =0;
		this.gridBagConstraintsTipoCodigoSriBanco.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsTipoCodigoSriBanco.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosTipoCodigoSriBanco, this.gridBagConstraintsTipoCodigoSriBanco);
				
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);

		
			
		//if(TipoCodigoSriBancoJInternalFrame.CON_DATOS_FRAME) {				
			//this.jInternalFrameDetalleTipoCodigoSriBanco = new TipoCodigoSriBancoBeanSwingJInternalFrameAdditional();//JInternalFrameBase("A DATOS");
			
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
			
	        //this.setTitle("[FOR] - A DATOS");
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"A Formulario",PaginaTipo.FORMULARIO,paginaTipo));			
	        this.setSize(iWidthFormulario,iHeightFormulario);        
		   				
			this.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	        this.setResizable(true);
	        this.setClosable(true);
	        this.setMaximizable(true);
		    
			TipoCodigoSriBancoModel tipocodigosribancoModel=new TipoCodigoSriBancoModel(this);
			
			//SI USARA CLASE INTERNA
			//TipoCodigoSriBancoModel.TipoCodigoSriBancoFocusTraversalPolicy tipocodigosribancoFocusTraversalPolicy = tipocodigosribancoModel.new TipoCodigoSriBancoFocusTraversalPolicy(this);
			
			//tipocodigosribancoFocusTraversalPolicy.settipocodigosribancoJInternalFrame(this);
			
			this.setFocusTraversalPolicy(tipocodigosribancoModel);
			
			
			this.jContentPaneDetalleTipoCodigoSriBanco = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			GridBagLayout gridaBagLayoutDetalleTipoCodigoSriBanco = new GridBagLayout();	
			this.jContentPaneDetalleTipoCodigoSriBanco.setLayout(gridaBagLayoutDetalleTipoCodigoSriBanco);
			
			GridBagLayout gridaBagLayoutBusquedasParametrosTipoCodigoSriBanco = new GridBagLayout();
			
			
if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
				
				//AGREGA TOOLBAR DETALLE A PANTALLA
				
				this.gridBagConstraintsTipoCodigoSriBanco = new GridBagConstraints();
				this.gridBagConstraintsTipoCodigoSriBanco.gridy = iGridyRelaciones++;		
				this.gridBagConstraintsTipoCodigoSriBanco.gridx = 0;
					
				
				this.jContentPaneDetalleTipoCodigoSriBanco.add(jTtoolBarDetalleTipoCodigoSriBanco, gridBagConstraintsTipoCodigoSriBanco);								
				
}
			
			this.jScrollPanelDatosEdicionTipoCodigoSriBanco=   new JScrollPane(jContentPaneDetalleTipoCodigoSriBanco,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionTipoCodigoSriBanco.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionTipoCodigoSriBanco.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionTipoCodigoSriBanco.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			this.jScrollPanelDatosGeneralTipoCodigoSriBanco=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralTipoCodigoSriBanco.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralTipoCodigoSriBanco.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralTipoCodigoSriBanco.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsTipoCodigoSriBanco = new GridBagConstraints();
			
			
	        this.gridBagConstraintsTipoCodigoSriBanco.gridy = iGridyRelaciones++;		
	        this.gridBagConstraintsTipoCodigoSriBanco.gridx = 0;
	        
			this.jContentPaneDetalleTipoCodigoSriBanco.add(jPanelCamposTipoCodigoSriBanco, gridBagConstraintsTipoCodigoSriBanco);
			
			
			
			
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
						&& tipocodigosribancoSessionBean.getConGuardarRelaciones()
						) {
					//paraCargarPorParte es false por defecto(y ejecuta funcion normal cargando detalle en tab panel), si se utiliza funcionalidad es true y carga tab panel auxiliar temporal
					
					
					if(this.tipocodigosribancoSessionBean.getConGuardarRelaciones()) {
						this.gridBagConstraintsTipoCodigoSriBanco= new GridBagConstraints();
						this.gridBagConstraintsTipoCodigoSriBanco.gridy = iGridyRelaciones++;
						this.gridBagConstraintsTipoCodigoSriBanco.gridx = 0;
						this.jContentPaneDetalleTipoCodigoSriBanco.add(this.jTabbedPaneRelacionesTipoCodigoSriBanco, this.gridBagConstraintsTipoCodigoSriBanco);
					}
					
					//RELACIONES OTROS AGRUPADOS
					;
					
					} else {
						//this.jButtonNuevoRelacionesTipoCodigoSriBanco.setVisible(false);
						
					}
				}
			}
			
			Boolean tieneColumnasOcultas=false;
			
		
						
			
			if(!Constantes.ISDEVELOPING) {
	       		this.jPanelCamposOcultosTipoCodigoSriBanco.setVisible(false);
			} else {
				if(tieneColumnasOcultas) {
					this.gridBagConstraintsTipoCodigoSriBanco = new GridBagConstraints();
					this.gridBagConstraintsTipoCodigoSriBanco.fill=GridBagConstraints.NONE;
					this.gridBagConstraintsTipoCodigoSriBanco.anchor = GridBagConstraints.WEST;
					
					this.gridBagConstraintsTipoCodigoSriBanco.gridy = iGridyRelaciones++;		
					this.gridBagConstraintsTipoCodigoSriBanco.gridx = 0;
					
				
					this.jContentPaneDetalleTipoCodigoSriBanco.add(jPanelCamposOcultosTipoCodigoSriBanco, gridBagConstraintsTipoCodigoSriBanco);
				
					this.jPanelCamposOcultosTipoCodigoSriBanco.setVisible(true);
				}
			}					
			
			
			
			
			this.gridBagConstraintsTipoCodigoSriBanco = new GridBagConstraints();
			this.gridBagConstraintsTipoCodigoSriBanco.gridy = iGridyRelaciones++;//1;		
	        this.gridBagConstraintsTipoCodigoSriBanco.gridx = 0;
	        this.gridBagConstraintsTipoCodigoSriBanco.anchor = GridBagConstraints.CENTER;//WEST;
			
			
			
			this.jContentPaneDetalleTipoCodigoSriBanco.add(this.jPanelAccionesFormularioTipoCodigoSriBanco, this.gridBagConstraintsTipoCodigoSriBanco);							
			
			
			
			this.gridBagConstraintsTipoCodigoSriBanco = new GridBagConstraints();
	        this.gridBagConstraintsTipoCodigoSriBanco.gridy = iGridyRelaciones;//1;		
	        this.gridBagConstraintsTipoCodigoSriBanco.gridx = 0;
	        
			
			this.jContentPaneDetalleTipoCodigoSriBanco.add(this.jPanelAccionesTipoCodigoSriBanco, this.gridBagConstraintsTipoCodigoSriBanco);							
			
	        //this.setContentPane(jScrollPanelDatosEdicionTipoCodigoSriBanco);
			
		//} else {
			//DISENO_DETALLE COMENTAR Y
			//DISENO_DETALLE(Solo Descomentar Seccion Inferior)
			//NOTA-DISENO_DETALLE(Si cambia lo de abajo, cambiar lo comentado, Al final no es lo mismo)
			
			/*
			this.jScrollPanelDatosEdicionTipoCodigoSriBanco=   new JScrollPane(this.jPanelCamposTipoCodigoSriBanco,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionTipoCodigoSriBanco.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionTipoCodigoSriBanco.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionTipoCodigoSriBanco.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			
			this.gridBagConstraintsTipoCodigoSriBanco = new GridBagConstraints();
			this.gridBagConstraintsTipoCodigoSriBanco.gridy = iGridyPrincipal++;		
			this.gridBagConstraintsTipoCodigoSriBanco.gridx = 0;
			this.gridBagConstraintsTipoCodigoSriBanco.fill = GridBagConstraints.BOTH;
			this.gridBagConstraintsTipoCodigoSriBanco.ipady = this.getSize().height-yOffset*3;
			this.gridBagConstraintsTipoCodigoSriBanco.anchor = GridBagConstraints.WEST;
			
			this.jContentPane.add(this.jScrollPanelDatosEdicionTipoCodigoSriBanco, this.gridBagConstraintsTipoCodigoSriBanco);
			
			//ACCIONES FORMULARIO
			this.gridBagConstraintsTipoCodigoSriBanco = new GridBagConstraints();
			this.gridBagConstraintsTipoCodigoSriBanco.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsTipoCodigoSriBanco.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesFormularioTipoCodigoSriBanco, this.gridBagConstraintsTipoCodigoSriBanco);			
			
			this.gridBagConstraintsTipoCodigoSriBanco = new GridBagConstraints();
			this.gridBagConstraintsTipoCodigoSriBanco.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsTipoCodigoSriBanco.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesTipoCodigoSriBanco, this.gridBagConstraintsTipoCodigoSriBanco);									
			*/
		//}								
			
		//DISENO_DETALLE-(Descomentar)
		/*
		this.gridBagConstraintsTipoCodigoSriBanco = new GridBagConstraints();
		this.gridBagConstraintsTipoCodigoSriBanco.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoCodigoSriBanco.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposTipoCodigoSriBanco, this.gridBagConstraintsTipoCodigoSriBanco);
			
			
		this.gridBagConstraintsTipoCodigoSriBanco = new GridBagConstraints();
		this.gridBagConstraintsTipoCodigoSriBanco.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoCodigoSriBanco.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosTipoCodigoSriBanco, this.gridBagConstraintsTipoCodigoSriBanco);
		
			
		this.gridBagConstraintsTipoCodigoSriBanco = new GridBagConstraints();
		this.gridBagConstraintsTipoCodigoSriBanco.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsTipoCodigoSriBanco.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesTipoCodigoSriBanco, this.gridBagConstraintsTipoCodigoSriBanco);
		*/
		
			
     	//pack();
		
		
		//return this.jScrollPanelDatosGeneralTipoCodigoSriBanco;//jContentPane;
		
		return jScrollPanelDatosEdicionTipoCodigoSriBanco;
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
