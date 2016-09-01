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
package com.bydan.erp.seguridad.presentation.swing.jinternalframes;



import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;//;
import com.bydan.erp.seguridad.presentation.swing.jinternalframes.*;
import com.bydan.erp.seguridad.presentation.swing.jinternalframes.auxiliar.*;



//import com.bydan.erp.seguridad.presentation.report.source.*;


import com.bydan.framework.erp.business.entity.Reporte;

import com.bydan.erp.seguridad.business.entity.Modulo;
import com.bydan.erp.seguridad.business.entity.Opcion;
import com.bydan.erp.seguridad.business.entity.Usuario;
import com.bydan.erp.seguridad.business.entity.ResumenUsuario;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralSg;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralUsuario;

import com.bydan.erp.seguridad.util.SistemaParameterReturnGeneral;



import com.bydan.erp.seguridad.business.entity.*;
import com.bydan.erp.seguridad.util.TipoTeclaMascaraConstantesFunciones;

import com.bydan.erp.seguridad.business.logic.*;
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
public class TipoTeclaMascaraDetalleFormJInternalFrame extends TipoTeclaMascaraBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	
	
	public JToolBar jTtoolBarDetalleTipoTeclaMascara;
	
	protected JMenuBar jmenuBarDetalleTipoTeclaMascara;
	
	protected JMenu jmenuDetalleTipoTeclaMascara;
	protected JMenu jmenuDetalleArchivoTipoTeclaMascara;
	protected JMenu jmenuDetalleAccionesTipoTeclaMascara;
	protected JMenu jmenuDetalleDatosTipoTeclaMascara;
	
	
	
	protected JPanel jContentPane = null;
	protected JPanel jContentPaneDetalleTipoTeclaMascara = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutTipoTeclaMascara;	
	protected GridBagConstraints gridBagConstraintsTipoTeclaMascara;	
		
	//protected JInternalFrameBase jInternalFrameParent; //ESTA EN BASE
	//protected TipoTeclaMascaraBeanSwingJInternalFrameAdditional jInternalFrameDetalleTipoTeclaMascara;		
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	
	
	public TipoTeclaMascaraSessionBean tipoteclamascaraSessionBean;
	
	
	
		
	
	public TipoTeclaMascaraLogic tipoteclamascaraLogic;
	
	public JScrollPane jScrollPanelDatosTipoTeclaMascara;
	public JScrollPane jScrollPanelDatosEdicionTipoTeclaMascara;
	public JScrollPane jScrollPanelDatosGeneralTipoTeclaMascara;
	
	protected JPanel jPanelCamposTipoTeclaMascara;    
	protected JPanel jPanelCamposOcultosTipoTeclaMascara;    	
	protected JPanel jPanelAccionesTipoTeclaMascara;
	protected JPanel jPanelAccionesFormularioTipoTeclaMascara;
    
	
	
	protected Integer iXPanelCamposTipoTeclaMascara=0;
	protected Integer iYPanelCamposTipoTeclaMascara=0;
	
	protected Integer iXPanelCamposOcultosTipoTeclaMascara=0;
	protected Integer iYPanelCamposOcultosTipoTeclaMascara=0;
	
	;
	;
	
		
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	public JButton jButtonNuevoTipoTeclaMascara;
	public JButton jButtonModificarTipoTeclaMascara;
	public JButton jButtonActualizarTipoTeclaMascara;
    public JButton jButtonEliminarTipoTeclaMascara;
	public JButton jButtonCancelarTipoTeclaMascara;
    public JButton jButtonGuardarCambiosTipoTeclaMascara;
	public JButton jButtonGuardarCambiosTablaTipoTeclaMascara;
	protected JButton jButtonCerrarTipoTeclaMascara;
	
	
	protected JButton jButtonProcesarInformacionTipoTeclaMascara;
	
	
	protected JCheckBox jCheckBoxPostAccionNuevoTipoTeclaMascara;
	protected JCheckBox jCheckBoxPostAccionSinCerrarTipoTeclaMascara;
	protected JCheckBox jCheckBoxPostAccionSinMensajeTipoTeclaMascara;
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarTipoTeclaMascara;
	protected JButton jButtonModificarToolBarTipoTeclaMascara;
	protected JButton jButtonActualizarToolBarTipoTeclaMascara;
    protected JButton jButtonEliminarToolBarTipoTeclaMascara;
	protected JButton jButtonCancelarToolBarTipoTeclaMascara;
    protected JButton jButtonGuardarCambiosToolBarTipoTeclaMascara;
	protected JButton jButtonGuardarCambiosTablaToolBarTipoTeclaMascara;
	protected JButton jButtonMostrarOcultarTablaToolBarTipoTeclaMascara;
	protected JButton jButtonCerrarToolBarTipoTeclaMascara;
	
	protected JButton jButtonProcesarInformacionToolBarTipoTeclaMascara;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoTipoTeclaMascara;
	protected JMenuItem jMenuItemModificarTipoTeclaMascara;
	protected JMenuItem jMenuItemActualizarTipoTeclaMascara;
    protected JMenuItem jMenuItemEliminarTipoTeclaMascara;
	protected JMenuItem jMenuItemCancelarTipoTeclaMascara;
    protected JMenuItem jMenuItemGuardarCambiosTipoTeclaMascara;
	protected JMenuItem jMenuItemGuardarCambiosTablaTipoTeclaMascara;
	protected JMenuItem jMenuItemCerrarTipoTeclaMascara;
	protected JMenuItem jMenuItemDetalleCerrarTipoTeclaMascara;
	protected JMenuItem jMenuItemDetalleMostarOcultarTipoTeclaMascara;
	
	protected JMenuItem jMenuItemProcesarInformacionTipoTeclaMascara;
	protected JMenuItem jMenuItemNuevoGuardarCambiosTipoTeclaMascara;
	protected JMenuItem jMenuItemMostrarOcultarTipoTeclaMascara;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesTipoTeclaMascara;	
		
	
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesTipoTeclaMascara;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesTipoTeclaMascara;
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxTiposAccionesFormularioTipoTeclaMascara;
	
		
	
	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	public JPanel jPanelidTipoTeclaMascara;
	public JLabel jLabelIdTipoTeclaMascara;
	public JTextFieldMe jTextFieldidTipoTeclaMascara;
	public JButton jButtonidTipoTeclaMascaraBusqueda= new JButtonMe();

	public JPanel jPanelcodigoTipoTeclaMascara;
	public JLabel jLabelcodigoTipoTeclaMascara;
	public JTextField jTextFieldcodigoTipoTeclaMascara;
	public JButton jButtoncodigoTipoTeclaMascaraBusqueda= new JButtonMe();

	public JPanel jPanelnombreTipoTeclaMascara;
	public JLabel jLabelnombreTipoTeclaMascara;
	public JTextArea jTextAreanombreTipoTeclaMascara;
	public JScrollPane jscrollPanenombreTipoTeclaMascara;
	public JButton jButtonnombreTipoTeclaMascaraBusqueda= new JButtonMe();

	
	
	
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JTabbedPane jTabbedPaneRelacionesTipoTeclaMascara;
	
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
	
	public TipoTeclaMascaraDetalleFormJInternalFrame(String sTipo) throws Exception {
		super(PaginaTipo.FORMULARIO);
       
		try {
			
	  		if(sTipo.equals("MINIMO")) {
				/*
				this.jPanelCamposTipoTeclaMascara=new JPanel();
				this.jPanelAccionesFormularioTipoTeclaMascara=new JPanel();
				this.jmenuBarDetalleTipoTeclaMascara=new JMenuBar();
				this.jTtoolBarDetalleTipoTeclaMascara=new JToolBar();
				*/
	  		}
	  		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoTeclaMascaraDetalleFormJInternalFrame(PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo); 
		
		//super("TipoTeclaMascara No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	//ES AUXILIAR PARA WINDOWS FORMS
	public TipoTeclaMascaraDetalleFormJInternalFrame() throws Exception {
		super(PaginaTipo.FORMULARIO);
        //super("TipoTeclaMascara No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoTeclaMascaraDetalleFormJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("TipoTeclaMascara No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoTeclaMascaraDetalleFormJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("TipoTeclaMascara No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoTeclaMascaraDetalleFormJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("TipoTeclaMascara No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	public JButton getjButtonActualizarToolBarTipoTeclaMascara() {
		return this.jButtonActualizarToolBarTipoTeclaMascara;
	}
	
	public JButton getjButtonEliminarToolBarTipoTeclaMascara() {
		return this.jButtonEliminarToolBarTipoTeclaMascara;
	}
	
	public JButton getjButtonCancelarToolBarTipoTeclaMascara() {
		return this.jButtonCancelarToolBarTipoTeclaMascara;
	}		
	
	public JButton getjButtonProcesarInformacionTipoTeclaMascara() {
		return this.jButtonProcesarInformacionTipoTeclaMascara;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionTipoTeclaMascara)	{
		this.jButtonProcesarInformacionTipoTeclaMascara = jButtonProcesarInformacionTipoTeclaMascara;
	}
	
	
	

	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesTipoTeclaMascara() {
		return this.jComboBoxTiposAccionesTipoTeclaMascara;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesTipoTeclaMascara(
			JComboBox jComboBoxTiposRelacionesTipoTeclaMascara) {
		this.jComboBoxTiposRelacionesTipoTeclaMascara = jComboBoxTiposRelacionesTipoTeclaMascara;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesTipoTeclaMascara(
			JComboBox jComboBoxTiposAccionesTipoTeclaMascara) {
		this.jComboBoxTiposAccionesTipoTeclaMascara = jComboBoxTiposAccionesTipoTeclaMascara;
	}		
	
			
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesFormularioTipoTeclaMascara() {
		return this.jComboBoxTiposAccionesFormularioTipoTeclaMascara;
	}				
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesFormularioTipoTeclaMascara(
			JComboBox jComboBoxTiposAccionesFormularioTipoTeclaMascara) {
		this.jComboBoxTiposAccionesFormularioTipoTeclaMascara = jComboBoxTiposAccionesFormularioTipoTeclaMascara;
	}
	
	private void initialize(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		this.tipoteclamascaraSessionBean=new TipoTeclaMascaraSessionBean();
		
		this.tipoteclamascaraSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.tipoteclamascaraSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.tipoteclamascaraSessionBean.getEsGuardarRelacionado();				
		
		this.conMostrarAccionesCampo=parametroGeneralUsuario.getcon_mostrar_acciones_campo_general() || opcionActual.getcon_mostrar_acciones_campo();
		
		
		if(!this.conCargarMinimo) {
		
		}
		
			
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		TipoTeclaMascaraJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		TipoTeclaMascaraJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		TipoTeclaMascaraJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Tipo Tecla Mascara MANTENIMIENTO"));
		
		
		if(iWidth > 650) {
			iWidth=650;
		}
		
		if(iHeight > 650) {
			iHeight=650;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
		
		if(!this.tipoteclamascaraSessionBean.getEsGuardarRelacionado()) {
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
	
		TipoTeclaMascaraJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarDetalleTipoTeclaMascara= new JToolBar("MENU DATOS");		
		
		//TOOLBAR
		//PRINCIPAL				
				this.jButtonProcesarInformacionToolBarTipoTeclaMascara=new JButtonMe();
				this.jButtonModificarToolBarTipoTeclaMascara=new JButtonMe();							
		//PRINCIPAL
		
		//DETALLE
		this.jButtonActualizarToolBarTipoTeclaMascara=FuncionesSwing.getButtonToolBarGeneral(this.jButtonActualizarToolBarTipoTeclaMascara,this.jTtoolBarDetalleTipoTeclaMascara,
							"actualizar","actualizar","Actualizar"+" "+TipoTeclaMascaraConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"),"Actualizar",false);
		
		
		
		
		this.jButtonEliminarToolBarTipoTeclaMascara=FuncionesSwing.getButtonToolBarGeneral(this.jButtonEliminarToolBarTipoTeclaMascara,this.jTtoolBarDetalleTipoTeclaMascara,
							"eliminar","eliminar","Eliminar"+" "+TipoTeclaMascaraConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"),"Eliminar",false);
		
		
		
		
		this.jButtonCancelarToolBarTipoTeclaMascara=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCancelarToolBarTipoTeclaMascara,this.jTtoolBarDetalleTipoTeclaMascara,
							"cancelar","cancelar","Cancelar"+" "+TipoTeclaMascaraConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"),"Cancelar",false);
		
		
		
		
		this.jButtonGuardarCambiosToolBarTipoTeclaMascara=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosToolBarTipoTeclaMascara,this.jTtoolBarDetalleTipoTeclaMascara,
							"guardarcambios","guardarcambios","Guardar"+" "+TipoTeclaMascaraConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		
		FuncionesSwing.setBoldButtonToolBar(this.jButtonActualizarToolBarTipoTeclaMascara,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonEliminarToolBarTipoTeclaMascara,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonCancelarToolBarTipoTeclaMascara,STIPO_TAMANIO_GENERAL,false,false,this);
	}
	
	
	
	public void cargarMenus() {		
		
		this.jmenuBarDetalleTipoTeclaMascara=new JMenuBarMe();
		
		//DETALLE
		this.jmenuDetalleTipoTeclaMascara=new JMenuMe("Datos Relacionados");
		this.jmenuDetalleArchivoTipoTeclaMascara=new JMenuMe("Archivo");
		this.jmenuDetalleAccionesTipoTeclaMascara=new JMenuMe("Acciones");
		this.jmenuDetalleDatosTipoTeclaMascara=new JMenuMe("Datos");
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoTipoTeclaMascara= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoTipoTeclaMascara.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoTipoTeclaMascara,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoTipoTeclaMascara, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemModificarTipoTeclaMascara= new JMenuItem("Editar" + FuncionesSwing.getKeyMensaje("MODIFICAR"));
		this.jMenuItemModificarTipoTeclaMascara.setActionCommand("Editar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemModificarTipoTeclaMascara,"modificar_button","Editar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemModificarTipoTeclaMascara, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemActualizarTipoTeclaMascara= new JMenuItem("Actualizar" + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
		this.jMenuItemActualizarTipoTeclaMascara.setActionCommand("Actualizar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemActualizarTipoTeclaMascara,"actualizar_button","Actualizar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemActualizarTipoTeclaMascara, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemEliminarTipoTeclaMascara= new JMenuItem("Eliminar" + FuncionesSwing.getKeyMensaje("ELIMINAR"));
		this.jMenuItemEliminarTipoTeclaMascara.setActionCommand("Eliminar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemEliminarTipoTeclaMascara,"eliminar_button","Eliminar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemEliminarTipoTeclaMascara, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCancelarTipoTeclaMascara= new JMenuItem("Cancelar" + FuncionesSwing.getKeyMensaje("CANCELAR"));
		this.jMenuItemCancelarTipoTeclaMascara.setActionCommand("Cancelar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCancelarTipoTeclaMascara,"cancelar_button","Cancelar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCancelarTipoTeclaMascara, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosTipoTeclaMascara= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTipoTeclaMascara.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTipoTeclaMascara,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTipoTeclaMascara, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarTipoTeclaMascara= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarTipoTeclaMascara.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarTipoTeclaMascara,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarTipoTeclaMascara, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleCerrarTipoTeclaMascara= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemDetalleCerrarTipoTeclaMascara.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleCerrarTipoTeclaMascara,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleCerrarTipoTeclaMascara, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarTipoTeclaMascara= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarTipoTeclaMascara.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarTipoTeclaMascara,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarTipoTeclaMascara, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarTipoTeclaMascara= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarTipoTeclaMascara.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarTipoTeclaMascara,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarTipoTeclaMascara, STIPO_TAMANIO_GENERAL,false,true,this);			
		
		//DETALLE
		this.jmenuDetalleArchivoTipoTeclaMascara.add(this.jMenuItemDetalleCerrarTipoTeclaMascara);
		
		this.jmenuDetalleAccionesTipoTeclaMascara.add(this.jMenuItemActualizarTipoTeclaMascara);
		this.jmenuDetalleAccionesTipoTeclaMascara.add(this.jMenuItemEliminarTipoTeclaMascara);
		this.jmenuDetalleAccionesTipoTeclaMascara.add(this.jMenuItemCancelarTipoTeclaMascara);		
		
		//this.jmenuDetalleDatosTipoTeclaMascara.add(this.jMenuItemDetalleAbrirOrderByTipoTeclaMascara);				
		this.jmenuDetalleDatosTipoTeclaMascara.add(this.jMenuItemDetalleMostarOcultarTipoTeclaMascara);				
				
		//this.jmenuDetalleAccionesTipoTeclaMascara.add(this.jMenuItemGuardarCambiosTipoTeclaMascara);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES				
		
		//DETALLE
		FuncionesSwing.setBoldMenu(this.jmenuDetalleArchivoTipoTeclaMascara, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleAccionesTipoTeclaMascara, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleDatosTipoTeclaMascara, STIPO_TAMANIO_GENERAL,false,true,this);
			
		this.jmenuBarDetalleTipoTeclaMascara.add(this.jmenuDetalleArchivoTipoTeclaMascara);		
		this.jmenuBarDetalleTipoTeclaMascara.add(this.jmenuDetalleAccionesTipoTeclaMascara);		
		this.jmenuBarDetalleTipoTeclaMascara.add(this.jmenuDetalleDatosTipoTeclaMascara);		
		
		//DETALLE_FIN
		
		
		//AGREGA MENU DETALLE A PANTALLA
		this.setJMenuBar(this.jmenuBarDetalleTipoTeclaMascara);				
	}
	
	
	public void inicializarElementosCamposTipoTeclaMascara() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		jLabelIdTipoTeclaMascara = new JLabelMe();
		jLabelIdTipoTeclaMascara.setText(""+Constantes2.S_CODIGO_UNICO+"");
		jLabelIdTipoTeclaMascara.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdTipoTeclaMascara.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdTipoTeclaMascara.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelIdTipoTeclaMascara,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jPanelidTipoTeclaMascara = new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelidTipoTeclaMascara.setToolTipText(TipoTeclaMascaraConstantesFunciones.LABEL_ID);
		this.gridaBagLayoutTipoTeclaMascara= new GridBagLayout();

		this.jPanelidTipoTeclaMascara.setLayout(this.gridaBagLayoutTipoTeclaMascara);

		jTextFieldidTipoTeclaMascara = new JTextFieldMe();
		jTextFieldidTipoTeclaMascara.setText("Id");

		jTextFieldidTipoTeclaMascara.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jTextFieldidTipoTeclaMascara.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jTextFieldidTipoTeclaMascara.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));



					
		this.jLabelcodigoTipoTeclaMascara = new JLabelMe();
		this.jLabelcodigoTipoTeclaMascara.setText(""+TipoTeclaMascaraConstantesFunciones.LABEL_CODIGO+" : *");
		this.jLabelcodigoTipoTeclaMascara.setToolTipText("Codigo");
		this.jLabelcodigoTipoTeclaMascara.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcodigoTipoTeclaMascara.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcodigoTipoTeclaMascara.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelcodigoTipoTeclaMascara,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelcodigoTipoTeclaMascara=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelcodigoTipoTeclaMascara.setToolTipText(TipoTeclaMascaraConstantesFunciones.LABEL_CODIGO);
		this.gridaBagLayoutTipoTeclaMascara = new GridBagLayout();
		this.jPanelcodigoTipoTeclaMascara.setLayout(this.gridaBagLayoutTipoTeclaMascara);


		jTextFieldcodigoTipoTeclaMascara= new JTextFieldMe();

		jTextFieldcodigoTipoTeclaMascara.setEnabled(false);
		jTextFieldcodigoTipoTeclaMascara.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcodigoTipoTeclaMascara.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcodigoTipoTeclaMascara.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldcodigoTipoTeclaMascara,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtoncodigoTipoTeclaMascaraBusqueda= new JButtonMe();
		this.jButtoncodigoTipoTeclaMascaraBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncodigoTipoTeclaMascaraBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncodigoTipoTeclaMascaraBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtoncodigoTipoTeclaMascaraBusqueda.setText("U");
		this.jButtoncodigoTipoTeclaMascaraBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtoncodigoTipoTeclaMascaraBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtoncodigoTipoTeclaMascaraBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldcodigoTipoTeclaMascara.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldcodigoTipoTeclaMascara.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"codigoTipoTeclaMascaraBusqueda"));

		if(this.tipoteclamascaraSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtoncodigoTipoTeclaMascaraBusqueda.setVisible(false);		}


					
		this.jLabelnombreTipoTeclaMascara = new JLabelMe();
		this.jLabelnombreTipoTeclaMascara.setText(""+TipoTeclaMascaraConstantesFunciones.LABEL_NOMBRE+" : *");
		this.jLabelnombreTipoTeclaMascara.setToolTipText("Nombre");
		this.jLabelnombreTipoTeclaMascara.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnombreTipoTeclaMascara.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnombreTipoTeclaMascara.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelnombreTipoTeclaMascara,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelnombreTipoTeclaMascara=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelnombreTipoTeclaMascara.setToolTipText(TipoTeclaMascaraConstantesFunciones.LABEL_NOMBRE);
		this.gridaBagLayoutTipoTeclaMascara = new GridBagLayout();
		this.jPanelnombreTipoTeclaMascara.setLayout(this.gridaBagLayoutTipoTeclaMascara);


		jTextAreanombreTipoTeclaMascara= new JTextAreaMe();
		jTextAreanombreTipoTeclaMascara.setEnabled(false);
		jTextAreanombreTipoTeclaMascara.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreTipoTeclaMascara.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreTipoTeclaMascara.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreTipoTeclaMascara.setLineWrap(true);
		jTextAreanombreTipoTeclaMascara.setWrapStyleWord(true);
		jTextAreanombreTipoTeclaMascara.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreanombreTipoTeclaMascara.setRows(5);

		FuncionesSwing.setBoldTextArea(jTextAreanombreTipoTeclaMascara,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPanenombreTipoTeclaMascara = new JScrollPane(jTextAreanombreTipoTeclaMascara);
		jscrollPanenombreTipoTeclaMascara.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanenombreTipoTeclaMascara.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanenombreTipoTeclaMascara.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));

		this.jButtonnombreTipoTeclaMascaraBusqueda= new JButtonMe();
		this.jButtonnombreTipoTeclaMascaraBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombreTipoTeclaMascaraBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombreTipoTeclaMascaraBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonnombreTipoTeclaMascaraBusqueda.setText("U");
		this.jButtonnombreTipoTeclaMascaraBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonnombreTipoTeclaMascaraBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonnombreTipoTeclaMascaraBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreanombreTipoTeclaMascara.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreanombreTipoTeclaMascara.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"nombreTipoTeclaMascaraBusqueda"));

		if(this.tipoteclamascaraSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonnombreTipoTeclaMascaraBusqueda.setVisible(false);		}


	}
	
	public void inicializarElementosCamposForeigKeysTipoTeclaMascara() {
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
		//this.jInternalFrameDetalleTipoTeclaMascara = new TipoTeclaMascaraBeanSwingJInternalFrameAdditional(paginaTipo);//JInternalFrameBase("Tipo Tecla Mascara DATOS");
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutTipoTeclaMascara= new GridBagLayout();
		

		
		String sToolTipTipoTeclaMascara="";
		sToolTipTipoTeclaMascara=TipoTeclaMascaraConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipTipoTeclaMascara+="(Seguridad.TipoTeclaMascara)";
		}
		
		if(!this.tipoteclamascaraSessionBean.getEsGuardarRelacionado()) {
			sToolTipTipoTeclaMascara+="_"+this.opcionActual.getId();
		}
								
		
		this.jButtonNuevoTipoTeclaMascara = new JButtonMe();
		this.jButtonModificarTipoTeclaMascara = new JButtonMe();
        this.jButtonActualizarTipoTeclaMascara = new JButtonMe();
        this.jButtonEliminarTipoTeclaMascara = new JButtonMe();
        this.jButtonCancelarTipoTeclaMascara = new JButtonMe();
        this.jButtonGuardarCambiosTipoTeclaMascara = new JButtonMe();
		this.jButtonGuardarCambiosTablaTipoTeclaMascara = new JButtonMe();
		this.jButtonCerrarTipoTeclaMascara = new JButtonMe();
		
		this.jScrollPanelDatosTipoTeclaMascara = new JScrollPane();   
        this.jScrollPanelDatosEdicionTipoTeclaMascara = new JScrollPane();
		this.jScrollPanelDatosGeneralTipoTeclaMascara = new JScrollPane();
				
		
		
		this.jPanelCamposTipoTeclaMascara = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelCamposOcultosTipoTeclaMascara = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
        this.jPanelAccionesTipoTeclaMascara = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		this.jPanelAccionesFormularioTipoTeclaMascara = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		this.sPath=" <---> Acceso: Tipo Tecla Mascara";
		
		if(!this.tipoteclamascaraSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosTipoTeclaMascara.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Tipo Tecla Mascaras" + this.sPath));
		} else {
			this.jScrollPanelDatosTipoTeclaMascara.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosEdicionTipoTeclaMascara.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		this.jScrollPanelDatosGeneralTipoTeclaMascara.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
			
        this.jPanelCamposTipoTeclaMascara.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
        this.jPanelCamposTipoTeclaMascara.setName("jPanelCamposTipoTeclaMascara"); 

		this.jPanelCamposOcultosTipoTeclaMascara.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos Ocultos"));
        this.jPanelCamposOcultosTipoTeclaMascara.setName("jPanelCamposOcultosTipoTeclaMascara"); 

        this.jPanelAccionesTipoTeclaMascara.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesTipoTeclaMascara.setToolTipText("Acciones");
        this.jPanelAccionesTipoTeclaMascara.setName("Acciones"); 

		this.jPanelAccionesFormularioTipoTeclaMascara.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones Extra/Post"));
        this.jPanelAccionesFormularioTipoTeclaMascara.setToolTipText("Acciones");
        this.jPanelAccionesFormularioTipoTeclaMascara.setName("Acciones"); 
		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosEdicionTipoTeclaMascara, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralTipoTeclaMascara, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosTipoTeclaMascara, STIPO_TAMANIO_GENERAL,false,false,this);		
		FuncionesSwing.setBoldPanel(this.jPanelCamposTipoTeclaMascara, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelCamposOcultosTipoTeclaMascara, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelAccionesFormularioTipoTeclaMascara, STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {
		
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		
        this.jButtonNuevoTipoTeclaMascara.setText("Nuevo");
		this.jButtonModificarTipoTeclaMascara.setText("Editar");
        this.jButtonActualizarTipoTeclaMascara.setText("Actualizar");
        this.jButtonEliminarTipoTeclaMascara.setText("Eliminar");
        this.jButtonCancelarTipoTeclaMascara.setText("Cancelar");
        this.jButtonGuardarCambiosTipoTeclaMascara.setText("Guardar");
		this.jButtonGuardarCambiosTablaTipoTeclaMascara.setText("Guardar");
		this.jButtonCerrarTipoTeclaMascara.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoTipoTeclaMascara,"nuevo_button","Nuevo",this.tipoteclamascaraSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonModificarTipoTeclaMascara,"modificar_button","Editar",this.tipoteclamascaraSessionBean.getEsGuardarRelacionado());
       	FuncionesSwing.addImagenButtonGeneral(this.jButtonActualizarTipoTeclaMascara,"actualizar_button","Actualizar",this.tipoteclamascaraSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonEliminarTipoTeclaMascara,"eliminar_button","Eliminar",this.tipoteclamascaraSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonCancelarTipoTeclaMascara,"cancelar_button","Cancelar",this.tipoteclamascaraSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTipoTeclaMascara,"guardarcambios_button","Guardar",this.tipoteclamascaraSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaTipoTeclaMascara,"guardarcambiostabla_button","Guardar",this.tipoteclamascaraSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarTipoTeclaMascara,"cerrar_button","Salir",this.tipoteclamascaraSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoTipoTeclaMascara, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonModificarTipoTeclaMascara, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTipoTeclaMascara, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaTipoTeclaMascara, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarTipoTeclaMascara, STIPO_TAMANIO_GENERAL,false,true,this);
		
		FuncionesSwing.setBoldButton(this.jButtonActualizarTipoTeclaMascara, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonEliminarTipoTeclaMascara, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonCancelarTipoTeclaMascara, STIPO_TAMANIO_GENERAL,false,false,this);
		
		this.jButtonNuevoTipoTeclaMascara.setToolTipText("Nuevo"+" "+TipoTeclaMascaraConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonModificarTipoTeclaMascara.setToolTipText("Editar"+" "+TipoTeclaMascaraConstantesFunciones.SCLASSWEBTITULO+"");// + FuncionesSwing.getKeyMensaje("MODIFICAR"))
        this.jButtonActualizarTipoTeclaMascara.setToolTipText("Actualizar"+" "+TipoTeclaMascaraConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
        this.jButtonEliminarTipoTeclaMascara.setToolTipText("Eliminar)"+" "+TipoTeclaMascaraConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"));
        this.jButtonCancelarTipoTeclaMascara.setToolTipText("Cancelar"+" "+TipoTeclaMascaraConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"));
        this.jButtonGuardarCambiosTipoTeclaMascara.setToolTipText("Guardar"+" "+TipoTeclaMascaraConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonGuardarCambiosTablaTipoTeclaMascara.setToolTipText("Guardar"+" "+TipoTeclaMascaraConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarTipoTeclaMascara.setToolTipText("Salir"+" "+TipoTeclaMascaraConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoTipoTeclaMascara";
		inputMap = this.jButtonNuevoTipoTeclaMascara.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoTipoTeclaMascara.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoTipoTeclaMascara"));
		
		//ACTUALIZAR
		sMapKey = "ActualizarTipoTeclaMascara";
		inputMap = this.jButtonActualizarTipoTeclaMascara.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ACTUALIZAR") , FuncionesSwing.getMaskKey("ACTUALIZAR")), sMapKey);
		
		this.jButtonActualizarTipoTeclaMascara.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ActualizarTipoTeclaMascara"));
		
		//ELIMINAR
		sMapKey = "EliminarTipoTeclaMascara";
		inputMap = this.jButtonEliminarTipoTeclaMascara.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ELIMINAR") , FuncionesSwing.getMaskKey("ELIMINAR")), sMapKey);
		
		this.jButtonEliminarTipoTeclaMascara.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"EliminarTipoTeclaMascara"));
		
		//CANCELAR	
		sMapKey = "CancelarTipoTeclaMascara";
		inputMap = this.jButtonCancelarTipoTeclaMascara.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CANCELAR") , FuncionesSwing.getMaskKey("CANCELAR")), sMapKey);
		
		this.jButtonCancelarTipoTeclaMascara.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CancelarTipoTeclaMascara"));
		
		//CERRAR		
		sMapKey = "CerrarTipoTeclaMascara";
		inputMap = this.jButtonCerrarTipoTeclaMascara.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarTipoTeclaMascara.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarTipoTeclaMascara"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaTipoTeclaMascara";
		inputMap = this.jButtonGuardarCambiosTablaTipoTeclaMascara.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaTipoTeclaMascara.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaTipoTeclaMascara"));
		
		//HOT KEYS
		
		this.jCheckBoxPostAccionNuevoTipoTeclaMascara = new JCheckBoxMe();
		this.jCheckBoxPostAccionNuevoTipoTeclaMascara.setText("Nuevo");
		this.jCheckBoxPostAccionNuevoTipoTeclaMascara.setToolTipText("Nuevo TipoTeclaMascara");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionNuevoTipoTeclaMascara, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinCerrarTipoTeclaMascara = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinCerrarTipoTeclaMascara.setText("Sin Cerrar");
		this.jCheckBoxPostAccionSinCerrarTipoTeclaMascara.setToolTipText("Sin Cerrar Ventana TipoTeclaMascara");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinCerrarTipoTeclaMascara, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinMensajeTipoTeclaMascara = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinMensajeTipoTeclaMascara.setText("Sin Mensaje");
		this.jCheckBoxPostAccionSinMensajeTipoTeclaMascara.setToolTipText("Sin Mensaje Confirmacion");				
				
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinMensajeTipoTeclaMascara, STIPO_TAMANIO_GENERAL,false,false,this);       	
       
				
		
			
			
		this.jComboBoxTiposAccionesTipoTeclaMascara = new JComboBoxMe();
		//this.jComboBoxTiposAccionesTipoTeclaMascara.setText("Accion");
		this.jComboBoxTiposAccionesTipoTeclaMascara.setToolTipText("Tipos de Acciones");
							
		

		this.jComboBoxTiposAccionesFormularioTipoTeclaMascara = new JComboBoxMe();
		//this.jComboBoxTiposAccionesFormularioTipoTeclaMascara.setText("Accion");				
    	this.jComboBoxTiposAccionesFormularioTipoTeclaMascara.setToolTipText("Tipos de Acciones");
	
		this.jLabelAccionesTipoTeclaMascara = new JLabelMe();
		
		this.jLabelAccionesTipoTeclaMascara.setText("Acciones");		
		this.jLabelAccionesTipoTeclaMascara.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesTipoTeclaMascara.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesTipoTeclaMascara.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
        //HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		//HOT KEYS2
		
		//ELEMENTOS
		this.inicializarElementosCamposTipoTeclaMascara();
		
		//ELEMENTOS FK
		this.inicializarElementosCamposForeigKeysTipoTeclaMascara();
				
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		this.jTabbedPaneRelacionesTipoTeclaMascara=new JTabbedPane();
		this.jTabbedPaneRelacionesTipoTeclaMascara.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Relacionados"));
		
		//ESTA EN BEAN

		
		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneRelacionesTipoTeclaMascara,STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		int iPosXAccionPaginacion=0;
		
		
		
				
		
		this.jComboBoxTiposAccionesTipoTeclaMascara.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesTipoTeclaMascara.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesTipoTeclaMascara.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesTipoTeclaMascara, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		
		
		this.jComboBoxTiposAccionesFormularioTipoTeclaMascara.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioTipoTeclaMascara.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioTipoTeclaMascara.setPreferredSize(new Dimension(145,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesFormularioTipoTeclaMascara, STIPO_TAMANIO_GENERAL,false,false,this);				
		
		GridBagLayout gridaBagLayoutCamposTipoTeclaMascara = new GridBagLayout();
		GridBagLayout gridaBagLayoutCamposOcultosTipoTeclaMascara = new GridBagLayout();
		
		this.jPanelCamposTipoTeclaMascara.setLayout(gridaBagLayoutCamposTipoTeclaMascara);
		this.jPanelCamposOcultosTipoTeclaMascara.setLayout(gridaBagLayoutCamposOcultosTipoTeclaMascara);
		
		;
		;
		
		
		//SUBPANELES SIMPLES
		//SUBPANELES POR CAMPO
        
	this.gridBagConstraintsTipoTeclaMascara = new GridBagConstraints();
	this.gridBagConstraintsTipoTeclaMascara.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoTeclaMascara.gridy = 0;
	this.gridBagConstraintsTipoTeclaMascara.gridx = 0;
	this.gridBagConstraintsTipoTeclaMascara.ipadx = 0;
	this.gridBagConstraintsTipoTeclaMascara.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelidTipoTeclaMascara.add(jLabelIdTipoTeclaMascara, this.gridBagConstraintsTipoTeclaMascara);



	this.gridBagConstraintsTipoTeclaMascara = new GridBagConstraints();
	this.gridBagConstraintsTipoTeclaMascara.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoTeclaMascara.gridy = 0;
	this.gridBagConstraintsTipoTeclaMascara.gridx = 1;
	this.gridBagConstraintsTipoTeclaMascara.ipadx = 0;
	this.gridBagConstraintsTipoTeclaMascara.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelidTipoTeclaMascara.add(jTextFieldidTipoTeclaMascara, this.gridBagConstraintsTipoTeclaMascara);


	this.gridBagConstraintsTipoTeclaMascara = new GridBagConstraints();
	this.gridBagConstraintsTipoTeclaMascara.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoTeclaMascara.gridy = 0;
	this.gridBagConstraintsTipoTeclaMascara.gridx = 0;
	this.gridBagConstraintsTipoTeclaMascara.ipadx = 0;
	this.gridBagConstraintsTipoTeclaMascara.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelcodigoTipoTeclaMascara.add(jLabelcodigoTipoTeclaMascara, this.gridBagConstraintsTipoTeclaMascara);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsTipoTeclaMascara = new GridBagConstraints();
		//this.gridBagConstraintsTipoTeclaMascara.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoTeclaMascara.gridy = 0;
		this.gridBagConstraintsTipoTeclaMascara.gridx = 2;
		this.gridBagConstraintsTipoTeclaMascara.ipadx = 0;
		this.gridBagConstraintsTipoTeclaMascara.insets = new Insets(0, 0, 0, 0);
		this.jPanelcodigoTipoTeclaMascara.add(jButtoncodigoTipoTeclaMascaraBusqueda, this.gridBagConstraintsTipoTeclaMascara);
	}

	this.gridBagConstraintsTipoTeclaMascara = new GridBagConstraints();
	this.gridBagConstraintsTipoTeclaMascara.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoTeclaMascara.gridy = 0;
	this.gridBagConstraintsTipoTeclaMascara.gridx = 1;
	this.gridBagConstraintsTipoTeclaMascara.ipadx = 0;
	this.gridBagConstraintsTipoTeclaMascara.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelcodigoTipoTeclaMascara.add(jTextFieldcodigoTipoTeclaMascara, this.gridBagConstraintsTipoTeclaMascara);


	this.gridBagConstraintsTipoTeclaMascara = new GridBagConstraints();
	this.gridBagConstraintsTipoTeclaMascara.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoTeclaMascara.gridy = 0;
	this.gridBagConstraintsTipoTeclaMascara.gridx = 0;
	this.gridBagConstraintsTipoTeclaMascara.ipadx = 0;
	this.gridBagConstraintsTipoTeclaMascara.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelnombreTipoTeclaMascara.add(jLabelnombreTipoTeclaMascara, this.gridBagConstraintsTipoTeclaMascara);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsTipoTeclaMascara = new GridBagConstraints();
		//this.gridBagConstraintsTipoTeclaMascara.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoTeclaMascara.gridy = 0;
		this.gridBagConstraintsTipoTeclaMascara.gridx = 2;
		this.gridBagConstraintsTipoTeclaMascara.ipadx = 0;
		this.gridBagConstraintsTipoTeclaMascara.insets = new Insets(0, 0, 0, 0);
		this.jPanelnombreTipoTeclaMascara.add(jButtonnombreTipoTeclaMascaraBusqueda, this.gridBagConstraintsTipoTeclaMascara);
	}

	this.gridBagConstraintsTipoTeclaMascara = new GridBagConstraints();
	this.gridBagConstraintsTipoTeclaMascara.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoTeclaMascara.gridy = 0;
	this.gridBagConstraintsTipoTeclaMascara.gridx = 1;
	this.gridBagConstraintsTipoTeclaMascara.ipadx = 0;
	this.gridBagConstraintsTipoTeclaMascara.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelnombreTipoTeclaMascara.add(jscrollPanenombreTipoTeclaMascara, this.gridBagConstraintsTipoTeclaMascara);


		//SUBPANELES SIMPLES
		
		//SUBPANELES EN PANEL
		//SUBPANELES EN PANEL CAMPOS NORMAL				
		
	this.gridBagConstraintsTipoTeclaMascara = new GridBagConstraints();
	this.gridBagConstraintsTipoTeclaMascara.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsTipoTeclaMascara.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsTipoTeclaMascara.gridy = iYPanelCamposTipoTeclaMascara;
	this.gridBagConstraintsTipoTeclaMascara.gridx = iXPanelCamposTipoTeclaMascara++;
	this.gridBagConstraintsTipoTeclaMascara.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsTipoTeclaMascara.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposTipoTeclaMascara.add(this.jPanelidTipoTeclaMascara, this.gridBagConstraintsTipoTeclaMascara);



	if(iXPanelCamposTipoTeclaMascara % 1==0) {
		iXPanelCamposTipoTeclaMascara=0;
		iYPanelCamposTipoTeclaMascara++;
	}
	this.gridBagConstraintsTipoTeclaMascara = new GridBagConstraints();
	this.gridBagConstraintsTipoTeclaMascara.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsTipoTeclaMascara.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsTipoTeclaMascara.gridy = iYPanelCamposTipoTeclaMascara;
	this.gridBagConstraintsTipoTeclaMascara.gridx = iXPanelCamposTipoTeclaMascara++;
	this.gridBagConstraintsTipoTeclaMascara.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsTipoTeclaMascara.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposTipoTeclaMascara.add(this.jPanelcodigoTipoTeclaMascara, this.gridBagConstraintsTipoTeclaMascara);



	if(iXPanelCamposTipoTeclaMascara % 1==0) {
		iXPanelCamposTipoTeclaMascara=0;
		iYPanelCamposTipoTeclaMascara++;
	}
	this.gridBagConstraintsTipoTeclaMascara = new GridBagConstraints();
	this.gridBagConstraintsTipoTeclaMascara.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsTipoTeclaMascara.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsTipoTeclaMascara.gridy = iYPanelCamposTipoTeclaMascara;
	this.gridBagConstraintsTipoTeclaMascara.gridx = iXPanelCamposTipoTeclaMascara++;
	this.gridBagConstraintsTipoTeclaMascara.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsTipoTeclaMascara.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposTipoTeclaMascara.add(this.jPanelnombreTipoTeclaMascara, this.gridBagConstraintsTipoTeclaMascara);



	if(iXPanelCamposTipoTeclaMascara % 1==0) {
		iXPanelCamposTipoTeclaMascara=0;
		iYPanelCamposTipoTeclaMascara++;
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
			
		GridBagLayout gridaBagLayoutAccionesTipoTeclaMascara= new GridBagLayout();
		this.jPanelAccionesTipoTeclaMascara.setLayout(gridaBagLayoutAccionesTipoTeclaMascara);
		
		GridBagLayout gridaBagLayoutAccionesFormularioTipoTeclaMascara= new GridBagLayout();
		this.jPanelAccionesFormularioTipoTeclaMascara.setLayout(gridaBagLayoutAccionesFormularioTipoTeclaMascara);
		
		this.gridBagConstraintsTipoTeclaMascara = new GridBagConstraints();
		this.gridBagConstraintsTipoTeclaMascara.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsTipoTeclaMascara.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioTipoTeclaMascara.add(this.jComboBoxTiposAccionesFormularioTipoTeclaMascara, this.gridBagConstraintsTipoTeclaMascara);

		this.gridBagConstraintsTipoTeclaMascara = new GridBagConstraints();
		this.gridBagConstraintsTipoTeclaMascara.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsTipoTeclaMascara.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioTipoTeclaMascara.add(this.jCheckBoxPostAccionNuevoTipoTeclaMascara, this.gridBagConstraintsTipoTeclaMascara);
			
		//DEBE CERRARSE Y ACTUALIZARSE TODO NUEVAMENTE, SI ES RELACIONADO PUEDE FUNCIONAR
		//if(!this.tipoteclamascaraSessionBean.getEstaModoGuardarRelaciones()) {		
		//SE ARRIESGA
		//if(!this.conFuncionalidadRelaciones) {		
			this.gridBagConstraintsTipoTeclaMascara = new GridBagConstraints();
			this.gridBagConstraintsTipoTeclaMascara.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsTipoTeclaMascara.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioTipoTeclaMascara.add(this.jCheckBoxPostAccionSinCerrarTipoTeclaMascara, this.gridBagConstraintsTipoTeclaMascara);
		//}
		
		
		//NO TIENE MENSAJE POR DEFINICION, O ES MUY COMPLEJO LA PANTALLA PARA HACERLO MAS COMPLICADO
		if(!this.tipoteclamascaraSessionBean.getEsGuardarRelacionado()
			){				
			//&& !this.tipoteclamascaraSessionBean.getEstaModoGuardarRelaciones()) {
							
			this.gridBagConstraintsTipoTeclaMascara = new GridBagConstraints();
			this.gridBagConstraintsTipoTeclaMascara.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsTipoTeclaMascara.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioTipoTeclaMascara.add(this.jCheckBoxPostAccionSinMensajeTipoTeclaMascara, this.gridBagConstraintsTipoTeclaMascara);
		}
		
		
		int iPosXAccion=0;
		
		this.gridBagConstraintsTipoTeclaMascara = new GridBagConstraints();
		this.gridBagConstraintsTipoTeclaMascara.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoTeclaMascara.gridy = 0;
		this.gridBagConstraintsTipoTeclaMascara.gridx = iPosXAccion++;
			
		this.jPanelAccionesTipoTeclaMascara.add(this.jButtonModificarTipoTeclaMascara, this.gridBagConstraintsTipoTeclaMascara);							

		this.gridBagConstraintsTipoTeclaMascara = new GridBagConstraints();
		this.gridBagConstraintsTipoTeclaMascara.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoTeclaMascara.gridy = 0;
		this.gridBagConstraintsTipoTeclaMascara.gridx =iPosXAccion++;
			
		this.jPanelAccionesTipoTeclaMascara.add(this.jButtonEliminarTipoTeclaMascara, this.gridBagConstraintsTipoTeclaMascara);
		
			
		this.gridBagConstraintsTipoTeclaMascara = new GridBagConstraints();
		this.gridBagConstraintsTipoTeclaMascara.gridy = 0;		
		this.gridBagConstraintsTipoTeclaMascara.gridx = iPosXAccion++;
		
		this.jPanelAccionesTipoTeclaMascara.add(this.jButtonActualizarTipoTeclaMascara, this.gridBagConstraintsTipoTeclaMascara);


		this.gridBagConstraintsTipoTeclaMascara = new GridBagConstraints();
		this.gridBagConstraintsTipoTeclaMascara.gridy = 0;		
		this.gridBagConstraintsTipoTeclaMascara.gridx = iPosXAccion++;
		
		this.jPanelAccionesTipoTeclaMascara.add(this.jButtonGuardarCambiosTipoTeclaMascara, this.gridBagConstraintsTipoTeclaMascara);	
		
		this.gridBagConstraintsTipoTeclaMascara = new GridBagConstraints();
		this.gridBagConstraintsTipoTeclaMascara.gridy = 0;		
		this.gridBagConstraintsTipoTeclaMascara.gridx =iPosXAccion++;
		
		this.jPanelAccionesTipoTeclaMascara.add(this.jButtonCancelarTipoTeclaMascara, this.gridBagConstraintsTipoTeclaMascara);
		
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutTipoTeclaMascara = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutTipoTeclaMascara);
		
		if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.tipoteclamascaraSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsTipoTeclaMascara = new GridBagConstraints();						
			this.gridBagConstraintsTipoTeclaMascara.gridy = iGridyPrincipal++;
			this.gridBagConstraintsTipoTeclaMascara.gridx = 0;		
			//this.gridBagConstraintsTipoTeclaMascara.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoTeclaMascara.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsTipoTeclaMascara.ipadx = 100;
				
			
		}
		
		//PROCESANDO EN OTRA PANTALLA
		
		
		int iGridxBusquedasParametros=0;
		
	
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			//NO BUSQUEDA
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		
		this.gridBagConstraintsTipoTeclaMascara = new GridBagConstraints();
		this.gridBagConstraintsTipoTeclaMascara.gridy =iGridyPrincipal++;
		this.gridBagConstraintsTipoTeclaMascara.gridx =0;
		this.gridBagConstraintsTipoTeclaMascara.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsTipoTeclaMascara.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosTipoTeclaMascara, this.gridBagConstraintsTipoTeclaMascara);
				
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);

		
			
		//if(TipoTeclaMascaraJInternalFrame.CON_DATOS_FRAME) {				
			//this.jInternalFrameDetalleTipoTeclaMascara = new TipoTeclaMascaraBeanSwingJInternalFrameAdditional();//JInternalFrameBase("Tipo Tecla Mascara DATOS");
			
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
			
	        //this.setTitle("[FOR] - Tipo Tecla Mascara DATOS");
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Tipo Tecla Mascara Formulario",PaginaTipo.FORMULARIO,paginaTipo));			
	        this.setSize(iWidthFormulario,iHeightFormulario);        
		   				
			this.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	        this.setResizable(true);
	        this.setClosable(true);
	        this.setMaximizable(true);
		    
			TipoTeclaMascaraModel tipoteclamascaraModel=new TipoTeclaMascaraModel(this);
			
			//SI USARA CLASE INTERNA
			//TipoTeclaMascaraModel.TipoTeclaMascaraFocusTraversalPolicy tipoteclamascaraFocusTraversalPolicy = tipoteclamascaraModel.new TipoTeclaMascaraFocusTraversalPolicy(this);
			
			//tipoteclamascaraFocusTraversalPolicy.settipoteclamascaraJInternalFrame(this);
			
			this.setFocusTraversalPolicy(tipoteclamascaraModel);
			
			
			this.jContentPaneDetalleTipoTeclaMascara = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			GridBagLayout gridaBagLayoutDetalleTipoTeclaMascara = new GridBagLayout();	
			this.jContentPaneDetalleTipoTeclaMascara.setLayout(gridaBagLayoutDetalleTipoTeclaMascara);
			
			GridBagLayout gridaBagLayoutBusquedasParametrosTipoTeclaMascara = new GridBagLayout();
			
			
if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
				
				//AGREGA TOOLBAR DETALLE A PANTALLA
				
				this.gridBagConstraintsTipoTeclaMascara = new GridBagConstraints();
				this.gridBagConstraintsTipoTeclaMascara.gridy = iGridyRelaciones++;		
				this.gridBagConstraintsTipoTeclaMascara.gridx = 0;
					
				
				this.jContentPaneDetalleTipoTeclaMascara.add(jTtoolBarDetalleTipoTeclaMascara, gridBagConstraintsTipoTeclaMascara);								
				
}
			
			this.jScrollPanelDatosEdicionTipoTeclaMascara=   new JScrollPane(jContentPaneDetalleTipoTeclaMascara,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionTipoTeclaMascara.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionTipoTeclaMascara.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionTipoTeclaMascara.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			this.jScrollPanelDatosGeneralTipoTeclaMascara=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralTipoTeclaMascara.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralTipoTeclaMascara.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralTipoTeclaMascara.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsTipoTeclaMascara = new GridBagConstraints();
			
			
	        this.gridBagConstraintsTipoTeclaMascara.gridy = iGridyRelaciones++;		
	        this.gridBagConstraintsTipoTeclaMascara.gridx = 0;
	        
			this.jContentPaneDetalleTipoTeclaMascara.add(jPanelCamposTipoTeclaMascara, gridBagConstraintsTipoTeclaMascara);
			
			
			
			
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
						&& tipoteclamascaraSessionBean.getConGuardarRelaciones()
						) {
					
					if(this.tipoteclamascaraSessionBean.getConGuardarRelaciones()) {
						this.gridBagConstraintsTipoTeclaMascara= new GridBagConstraints();
						this.gridBagConstraintsTipoTeclaMascara.gridy = iGridyRelaciones++;
						this.gridBagConstraintsTipoTeclaMascara.gridx = 0;
						this.jContentPaneDetalleTipoTeclaMascara.add(this.jTabbedPaneRelacionesTipoTeclaMascara, this.gridBagConstraintsTipoTeclaMascara);
					}
					
					//RELACIONES OTROS AGRUPADOS
					;
					
					} else {
						//this.jButtonNuevoRelacionesTipoTeclaMascara.setVisible(false);
					}
				}
			}
			
			Boolean tieneColumnasOcultas=false;
			
		
						
			
			if(!Constantes.ISDEVELOPING) {
	       		this.jPanelCamposOcultosTipoTeclaMascara.setVisible(false);
			} else {
				if(tieneColumnasOcultas) {
					this.gridBagConstraintsTipoTeclaMascara = new GridBagConstraints();
					this.gridBagConstraintsTipoTeclaMascara.fill=GridBagConstraints.NONE;
					this.gridBagConstraintsTipoTeclaMascara.anchor = GridBagConstraints.WEST;
					
					this.gridBagConstraintsTipoTeclaMascara.gridy = iGridyRelaciones++;		
					this.gridBagConstraintsTipoTeclaMascara.gridx = 0;
					
				
					this.jContentPaneDetalleTipoTeclaMascara.add(jPanelCamposOcultosTipoTeclaMascara, gridBagConstraintsTipoTeclaMascara);
				
					this.jPanelCamposOcultosTipoTeclaMascara.setVisible(true);
				}
			}					
			
			
			
			
			this.gridBagConstraintsTipoTeclaMascara = new GridBagConstraints();
			this.gridBagConstraintsTipoTeclaMascara.gridy = iGridyRelaciones++;//1;		
	        this.gridBagConstraintsTipoTeclaMascara.gridx = 0;
	        this.gridBagConstraintsTipoTeclaMascara.anchor = GridBagConstraints.CENTER;//WEST;
			
			
			
			this.jContentPaneDetalleTipoTeclaMascara.add(this.jPanelAccionesFormularioTipoTeclaMascara, this.gridBagConstraintsTipoTeclaMascara);							
			
			
			
			this.gridBagConstraintsTipoTeclaMascara = new GridBagConstraints();
	        this.gridBagConstraintsTipoTeclaMascara.gridy = iGridyRelaciones;//1;		
	        this.gridBagConstraintsTipoTeclaMascara.gridx = 0;
	        
			
			this.jContentPaneDetalleTipoTeclaMascara.add(this.jPanelAccionesTipoTeclaMascara, this.gridBagConstraintsTipoTeclaMascara);							
			
	        //this.setContentPane(jScrollPanelDatosEdicionTipoTeclaMascara);
			
		//} else {
			//DISENO_DETALLE COMENTAR Y
			//DISENO_DETALLE(Solo Descomentar Seccion Inferior)
			//NOTA-DISENO_DETALLE(Si cambia lo de abajo, cambiar lo comentado, Al final no es lo mismo)
			
			/*
			this.jScrollPanelDatosEdicionTipoTeclaMascara=   new JScrollPane(this.jPanelCamposTipoTeclaMascara,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionTipoTeclaMascara.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionTipoTeclaMascara.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionTipoTeclaMascara.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			
			this.gridBagConstraintsTipoTeclaMascara = new GridBagConstraints();
			this.gridBagConstraintsTipoTeclaMascara.gridy = iGridyPrincipal++;		
			this.gridBagConstraintsTipoTeclaMascara.gridx = 0;
			this.gridBagConstraintsTipoTeclaMascara.fill = GridBagConstraints.BOTH;
			this.gridBagConstraintsTipoTeclaMascara.ipady = this.getSize().height-yOffset*3;
			this.gridBagConstraintsTipoTeclaMascara.anchor = GridBagConstraints.WEST;
			
			this.jContentPane.add(this.jScrollPanelDatosEdicionTipoTeclaMascara, this.gridBagConstraintsTipoTeclaMascara);
			
			//ACCIONES FORMULARIO
			this.gridBagConstraintsTipoTeclaMascara = new GridBagConstraints();
			this.gridBagConstraintsTipoTeclaMascara.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsTipoTeclaMascara.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesFormularioTipoTeclaMascara, this.gridBagConstraintsTipoTeclaMascara);			
			
			this.gridBagConstraintsTipoTeclaMascara = new GridBagConstraints();
			this.gridBagConstraintsTipoTeclaMascara.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsTipoTeclaMascara.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesTipoTeclaMascara, this.gridBagConstraintsTipoTeclaMascara);									
			*/
		//}								
			
		//DISENO_DETALLE-(Descomentar)
		/*
		this.gridBagConstraintsTipoTeclaMascara = new GridBagConstraints();
		this.gridBagConstraintsTipoTeclaMascara.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoTeclaMascara.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposTipoTeclaMascara, this.gridBagConstraintsTipoTeclaMascara);
			
			
		this.gridBagConstraintsTipoTeclaMascara = new GridBagConstraints();
		this.gridBagConstraintsTipoTeclaMascara.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoTeclaMascara.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosTipoTeclaMascara, this.gridBagConstraintsTipoTeclaMascara);
		
			
		this.gridBagConstraintsTipoTeclaMascara = new GridBagConstraints();
		this.gridBagConstraintsTipoTeclaMascara.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsTipoTeclaMascara.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesTipoTeclaMascara, this.gridBagConstraintsTipoTeclaMascara);
		*/
		
			
     	//pack();
		
		
		//return this.jScrollPanelDatosGeneralTipoTeclaMascara;//jContentPane;
		
		return jScrollPanelDatosEdicionTipoTeclaMascara;
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
