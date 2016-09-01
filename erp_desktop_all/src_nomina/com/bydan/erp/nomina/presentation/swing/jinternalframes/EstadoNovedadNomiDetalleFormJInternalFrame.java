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
package com.bydan.erp.nomina.presentation.swing.jinternalframes;



import com.bydan.erp.nomina.presentation.web.jsf.sessionbean.*;//;
import com.bydan.erp.nomina.presentation.swing.jinternalframes.*;
import com.bydan.erp.nomina.presentation.swing.jinternalframes.auxiliar.*;



//import com.bydan.erp.nomina.presentation.report.source.*;


import com.bydan.framework.erp.business.entity.Reporte;

import com.bydan.erp.seguridad.business.entity.Modulo;
import com.bydan.erp.seguridad.business.entity.Opcion;
import com.bydan.erp.seguridad.business.entity.Usuario;
import com.bydan.erp.seguridad.business.entity.ResumenUsuario;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralSg;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralUsuario;

import com.bydan.erp.seguridad.util.SistemaParameterReturnGeneral;



import com.bydan.erp.nomina.business.entity.*;
import com.bydan.erp.nomina.util.EstadoNovedadNomiConstantesFunciones;

import com.bydan.erp.nomina.business.logic.*;
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
public class EstadoNovedadNomiDetalleFormJInternalFrame extends EstadoNovedadNomiBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	
	
	public JToolBar jTtoolBarDetalleEstadoNovedadNomi;
	
	protected JMenuBar jmenuBarDetalleEstadoNovedadNomi;
	
	protected JMenu jmenuDetalleEstadoNovedadNomi;
	protected JMenu jmenuDetalleArchivoEstadoNovedadNomi;
	protected JMenu jmenuDetalleAccionesEstadoNovedadNomi;
	protected JMenu jmenuDetalleDatosEstadoNovedadNomi;
	
	
	
	protected JPanel jContentPane = null;
	protected JPanel jContentPaneDetalleEstadoNovedadNomi = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutEstadoNovedadNomi;	
	protected GridBagConstraints gridBagConstraintsEstadoNovedadNomi;	
		
	//protected JInternalFrameBase jInternalFrameParent; //ESTA EN BASE
	//protected EstadoNovedadNomiBeanSwingJInternalFrameAdditional jInternalFrameDetalleEstadoNovedadNomi;		
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	
	
	public EstadoNovedadNomiSessionBean estadonovedadnomiSessionBean;
	
	

	public NovedadNomiBeanSwingJInternalFrame novedadnomiBeanSwingJInternalFrame=null;
	public NovedadNomiBeanSwingJInternalFrame novedadnomiBeanSwingJInternalFramePopup=null;
	public Boolean puedeCargarPorParteNovedadNomi=false;
	public NovedadNomiSessionBean novedadnomiSessionBean;
	
		
	
	public EstadoNovedadNomiLogic estadonovedadnomiLogic;
	
	public JScrollPane jScrollPanelDatosEstadoNovedadNomi;
	public JScrollPane jScrollPanelDatosEdicionEstadoNovedadNomi;
	public JScrollPane jScrollPanelDatosGeneralEstadoNovedadNomi;
	
	protected JPanel jPanelCamposEstadoNovedadNomi;    
	protected JPanel jPanelCamposOcultosEstadoNovedadNomi;    	
	protected JPanel jPanelAccionesEstadoNovedadNomi;
	protected JPanel jPanelAccionesFormularioEstadoNovedadNomi;
    
	
	
	protected Integer iXPanelCamposEstadoNovedadNomi=0;
	protected Integer iYPanelCamposEstadoNovedadNomi=0;
	
	protected Integer iXPanelCamposOcultosEstadoNovedadNomi=0;
	protected Integer iYPanelCamposOcultosEstadoNovedadNomi=0;
	
	;
	;
	
		
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	public JButton jButtonNuevoEstadoNovedadNomi;
	public JButton jButtonModificarEstadoNovedadNomi;
	public JButton jButtonActualizarEstadoNovedadNomi;
    public JButton jButtonEliminarEstadoNovedadNomi;
	public JButton jButtonCancelarEstadoNovedadNomi;
    public JButton jButtonGuardarCambiosEstadoNovedadNomi;
	public JButton jButtonGuardarCambiosTablaEstadoNovedadNomi;
	protected JButton jButtonCerrarEstadoNovedadNomi;
	
	
	protected JButton jButtonProcesarInformacionEstadoNovedadNomi;
	
	
	protected JCheckBox jCheckBoxPostAccionNuevoEstadoNovedadNomi;
	protected JCheckBox jCheckBoxPostAccionSinCerrarEstadoNovedadNomi;
	protected JCheckBox jCheckBoxPostAccionSinMensajeEstadoNovedadNomi;
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarEstadoNovedadNomi;
	protected JButton jButtonModificarToolBarEstadoNovedadNomi;
	protected JButton jButtonActualizarToolBarEstadoNovedadNomi;
    protected JButton jButtonEliminarToolBarEstadoNovedadNomi;
	protected JButton jButtonCancelarToolBarEstadoNovedadNomi;
    protected JButton jButtonGuardarCambiosToolBarEstadoNovedadNomi;
	protected JButton jButtonGuardarCambiosTablaToolBarEstadoNovedadNomi;
	protected JButton jButtonMostrarOcultarTablaToolBarEstadoNovedadNomi;
	protected JButton jButtonCerrarToolBarEstadoNovedadNomi;
	
	protected JButton jButtonProcesarInformacionToolBarEstadoNovedadNomi;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoEstadoNovedadNomi;
	protected JMenuItem jMenuItemModificarEstadoNovedadNomi;
	protected JMenuItem jMenuItemActualizarEstadoNovedadNomi;
    protected JMenuItem jMenuItemEliminarEstadoNovedadNomi;
	protected JMenuItem jMenuItemCancelarEstadoNovedadNomi;
    protected JMenuItem jMenuItemGuardarCambiosEstadoNovedadNomi;
	protected JMenuItem jMenuItemGuardarCambiosTablaEstadoNovedadNomi;
	protected JMenuItem jMenuItemCerrarEstadoNovedadNomi;
	protected JMenuItem jMenuItemDetalleCerrarEstadoNovedadNomi;
	protected JMenuItem jMenuItemDetalleMostarOcultarEstadoNovedadNomi;
	
	protected JMenuItem jMenuItemProcesarInformacionEstadoNovedadNomi;
	protected JMenuItem jMenuItemNuevoGuardarCambiosEstadoNovedadNomi;
	protected JMenuItem jMenuItemMostrarOcultarEstadoNovedadNomi;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesEstadoNovedadNomi;	
		
	
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesEstadoNovedadNomi;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesEstadoNovedadNomi;
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxTiposAccionesFormularioEstadoNovedadNomi;
	
		
	
	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	public JPanel jPanelidEstadoNovedadNomi;
	public JLabel jLabelIdEstadoNovedadNomi;
	public JTextFieldMe jTextFieldidEstadoNovedadNomi;
	public JButton jButtonidEstadoNovedadNomiBusqueda= new JButtonMe();

	public JPanel jPanelcodigoEstadoNovedadNomi;
	public JLabel jLabelcodigoEstadoNovedadNomi;
	public JTextField jTextFieldcodigoEstadoNovedadNomi;
	public JButton jButtoncodigoEstadoNovedadNomiBusqueda= new JButtonMe();

	public JPanel jPanelnombreEstadoNovedadNomi;
	public JLabel jLabelnombreEstadoNovedadNomi;
	public JTextArea jTextAreanombreEstadoNovedadNomi;
	public JScrollPane jscrollPanenombreEstadoNovedadNomi;
	public JButton jButtonnombreEstadoNovedadNomiBusqueda= new JButtonMe();

	
	
	
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JTabbedPane jTabbedPaneRelacionesEstadoNovedadNomi;
	
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
	
	public EstadoNovedadNomiDetalleFormJInternalFrame(String sTipo) throws Exception {
		super(PaginaTipo.FORMULARIO);
       
		try {
			
	  		if(sTipo.equals("MINIMO")) {
				/*
				this.jPanelCamposEstadoNovedadNomi=new JPanel();
				this.jPanelAccionesFormularioEstadoNovedadNomi=new JPanel();
				this.jmenuBarDetalleEstadoNovedadNomi=new JMenuBar();
				this.jTtoolBarDetalleEstadoNovedadNomi=new JToolBar();
				*/
	  		}
	  		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public EstadoNovedadNomiDetalleFormJInternalFrame(PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo); 
		
		//super("EstadoNovedadNomi No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	//ES AUXILIAR PARA WINDOWS FORMS
	public EstadoNovedadNomiDetalleFormJInternalFrame() throws Exception {
		super(PaginaTipo.FORMULARIO);
        //super("EstadoNovedadNomi No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public EstadoNovedadNomiDetalleFormJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("EstadoNovedadNomi No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public EstadoNovedadNomiDetalleFormJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("EstadoNovedadNomi No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public EstadoNovedadNomiDetalleFormJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("EstadoNovedadNomi No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	public JButton getjButtonActualizarToolBarEstadoNovedadNomi() {
		return this.jButtonActualizarToolBarEstadoNovedadNomi;
	}
	
	public JButton getjButtonEliminarToolBarEstadoNovedadNomi() {
		return this.jButtonEliminarToolBarEstadoNovedadNomi;
	}
	
	public JButton getjButtonCancelarToolBarEstadoNovedadNomi() {
		return this.jButtonCancelarToolBarEstadoNovedadNomi;
	}		
	
	public JButton getjButtonProcesarInformacionEstadoNovedadNomi() {
		return this.jButtonProcesarInformacionEstadoNovedadNomi;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionEstadoNovedadNomi)	{
		this.jButtonProcesarInformacionEstadoNovedadNomi = jButtonProcesarInformacionEstadoNovedadNomi;
	}
	
	
	

	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesEstadoNovedadNomi() {
		return this.jComboBoxTiposAccionesEstadoNovedadNomi;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesEstadoNovedadNomi(
			JComboBox jComboBoxTiposRelacionesEstadoNovedadNomi) {
		this.jComboBoxTiposRelacionesEstadoNovedadNomi = jComboBoxTiposRelacionesEstadoNovedadNomi;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesEstadoNovedadNomi(
			JComboBox jComboBoxTiposAccionesEstadoNovedadNomi) {
		this.jComboBoxTiposAccionesEstadoNovedadNomi = jComboBoxTiposAccionesEstadoNovedadNomi;
	}		
	
			
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesFormularioEstadoNovedadNomi() {
		return this.jComboBoxTiposAccionesFormularioEstadoNovedadNomi;
	}				
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesFormularioEstadoNovedadNomi(
			JComboBox jComboBoxTiposAccionesFormularioEstadoNovedadNomi) {
		this.jComboBoxTiposAccionesFormularioEstadoNovedadNomi = jComboBoxTiposAccionesFormularioEstadoNovedadNomi;
	}
	
	private void initialize(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		this.estadonovedadnomiSessionBean=new EstadoNovedadNomiSessionBean();
		
		this.estadonovedadnomiSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.estadonovedadnomiSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.estadonovedadnomiSessionBean.getEsGuardarRelacionado();				
		
		this.conMostrarAccionesCampo=parametroGeneralUsuario.getcon_mostrar_acciones_campo_general() || opcionActual.getcon_mostrar_acciones_campo();
		
		
		if(!this.conCargarMinimo) {
		
		//this.novedadnomiSessionBean=new NovedadNomiSessionBean();
		}
		
			
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		EstadoNovedadNomiJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		EstadoNovedadNomiJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		EstadoNovedadNomiJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Estado Novedad MANTENIMIENTO"));
		
		
		if(iWidth > 650) {
			iWidth=650;
		}
		
		if(iHeight > 910) {
			iHeight=910;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
		
		if(!this.estadonovedadnomiSessionBean.getEsGuardarRelacionado()) {
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
	
		EstadoNovedadNomiJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarDetalleEstadoNovedadNomi= new JToolBar("MENU DATOS");		
		
		//TOOLBAR
		//PRINCIPAL				
				this.jButtonProcesarInformacionToolBarEstadoNovedadNomi=new JButtonMe();
				this.jButtonModificarToolBarEstadoNovedadNomi=new JButtonMe();							
		//PRINCIPAL
		
		//DETALLE
		this.jButtonActualizarToolBarEstadoNovedadNomi=FuncionesSwing.getButtonToolBarGeneral(this.jButtonActualizarToolBarEstadoNovedadNomi,this.jTtoolBarDetalleEstadoNovedadNomi,
							"actualizar","actualizar","Actualizar"+" "+EstadoNovedadNomiConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"),"Actualizar",false);
		
		
		
		
		this.jButtonEliminarToolBarEstadoNovedadNomi=FuncionesSwing.getButtonToolBarGeneral(this.jButtonEliminarToolBarEstadoNovedadNomi,this.jTtoolBarDetalleEstadoNovedadNomi,
							"eliminar","eliminar","Eliminar"+" "+EstadoNovedadNomiConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"),"Eliminar",false);
		
		
		
		
		this.jButtonCancelarToolBarEstadoNovedadNomi=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCancelarToolBarEstadoNovedadNomi,this.jTtoolBarDetalleEstadoNovedadNomi,
							"cancelar","cancelar","Cancelar"+" "+EstadoNovedadNomiConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"),"Cancelar",false);
		
		
		
		
		this.jButtonGuardarCambiosToolBarEstadoNovedadNomi=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosToolBarEstadoNovedadNomi,this.jTtoolBarDetalleEstadoNovedadNomi,
							"guardarcambios","guardarcambios","Guardar"+" "+EstadoNovedadNomiConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		
		FuncionesSwing.setBoldButtonToolBar(this.jButtonActualizarToolBarEstadoNovedadNomi,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonEliminarToolBarEstadoNovedadNomi,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonCancelarToolBarEstadoNovedadNomi,STIPO_TAMANIO_GENERAL,false,false,this);
	}
	
	
	
	public void cargarMenus() {		
		
		this.jmenuBarDetalleEstadoNovedadNomi=new JMenuBarMe();
		
		//DETALLE
		this.jmenuDetalleEstadoNovedadNomi=new JMenuMe("Datos Relacionados");
		this.jmenuDetalleArchivoEstadoNovedadNomi=new JMenuMe("Archivo");
		this.jmenuDetalleAccionesEstadoNovedadNomi=new JMenuMe("Acciones");
		this.jmenuDetalleDatosEstadoNovedadNomi=new JMenuMe("Datos");
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoEstadoNovedadNomi= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoEstadoNovedadNomi.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoEstadoNovedadNomi,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoEstadoNovedadNomi, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemModificarEstadoNovedadNomi= new JMenuItem("Editar" + FuncionesSwing.getKeyMensaje("MODIFICAR"));
		this.jMenuItemModificarEstadoNovedadNomi.setActionCommand("Editar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemModificarEstadoNovedadNomi,"modificar_button","Editar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemModificarEstadoNovedadNomi, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemActualizarEstadoNovedadNomi= new JMenuItem("Actualizar" + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
		this.jMenuItemActualizarEstadoNovedadNomi.setActionCommand("Actualizar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemActualizarEstadoNovedadNomi,"actualizar_button","Actualizar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemActualizarEstadoNovedadNomi, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemEliminarEstadoNovedadNomi= new JMenuItem("Eliminar" + FuncionesSwing.getKeyMensaje("ELIMINAR"));
		this.jMenuItemEliminarEstadoNovedadNomi.setActionCommand("Eliminar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemEliminarEstadoNovedadNomi,"eliminar_button","Eliminar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemEliminarEstadoNovedadNomi, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCancelarEstadoNovedadNomi= new JMenuItem("Cancelar" + FuncionesSwing.getKeyMensaje("CANCELAR"));
		this.jMenuItemCancelarEstadoNovedadNomi.setActionCommand("Cancelar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCancelarEstadoNovedadNomi,"cancelar_button","Cancelar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCancelarEstadoNovedadNomi, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosEstadoNovedadNomi= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosEstadoNovedadNomi.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosEstadoNovedadNomi,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosEstadoNovedadNomi, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarEstadoNovedadNomi= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarEstadoNovedadNomi.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarEstadoNovedadNomi,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarEstadoNovedadNomi, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleCerrarEstadoNovedadNomi= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemDetalleCerrarEstadoNovedadNomi.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleCerrarEstadoNovedadNomi,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleCerrarEstadoNovedadNomi, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarEstadoNovedadNomi= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarEstadoNovedadNomi.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarEstadoNovedadNomi,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarEstadoNovedadNomi, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarEstadoNovedadNomi= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarEstadoNovedadNomi.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarEstadoNovedadNomi,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarEstadoNovedadNomi, STIPO_TAMANIO_GENERAL,false,true,this);			
		
		//DETALLE
		this.jmenuDetalleArchivoEstadoNovedadNomi.add(this.jMenuItemDetalleCerrarEstadoNovedadNomi);
		
		this.jmenuDetalleAccionesEstadoNovedadNomi.add(this.jMenuItemActualizarEstadoNovedadNomi);
		this.jmenuDetalleAccionesEstadoNovedadNomi.add(this.jMenuItemEliminarEstadoNovedadNomi);
		this.jmenuDetalleAccionesEstadoNovedadNomi.add(this.jMenuItemCancelarEstadoNovedadNomi);		
		
		//this.jmenuDetalleDatosEstadoNovedadNomi.add(this.jMenuItemDetalleAbrirOrderByEstadoNovedadNomi);				
		this.jmenuDetalleDatosEstadoNovedadNomi.add(this.jMenuItemDetalleMostarOcultarEstadoNovedadNomi);				
				
		//this.jmenuDetalleAccionesEstadoNovedadNomi.add(this.jMenuItemGuardarCambiosEstadoNovedadNomi);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES				
		
		//DETALLE
		FuncionesSwing.setBoldMenu(this.jmenuDetalleArchivoEstadoNovedadNomi, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleAccionesEstadoNovedadNomi, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleDatosEstadoNovedadNomi, STIPO_TAMANIO_GENERAL,false,true,this);
			
		this.jmenuBarDetalleEstadoNovedadNomi.add(this.jmenuDetalleArchivoEstadoNovedadNomi);		
		this.jmenuBarDetalleEstadoNovedadNomi.add(this.jmenuDetalleAccionesEstadoNovedadNomi);		
		this.jmenuBarDetalleEstadoNovedadNomi.add(this.jmenuDetalleDatosEstadoNovedadNomi);		
		
		//MENU RELACIONES
		if(!this.conCargarMinimo) {
			FuncionesSwing.setBoldMenu(this.jmenuDetalleEstadoNovedadNomi, STIPO_TAMANIO_GENERAL,false,true,this);
			
			this.jmenuBarDetalleEstadoNovedadNomi.add(this.jmenuDetalleEstadoNovedadNomi);		
		}
		//DETALLE_FIN
		
		
		//AGREGA MENU DETALLE A PANTALLA
		this.setJMenuBar(this.jmenuBarDetalleEstadoNovedadNomi);				
	}
	
	
	public void inicializarElementosCamposEstadoNovedadNomi() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		jLabelIdEstadoNovedadNomi = new JLabelMe();
		jLabelIdEstadoNovedadNomi.setText(""+Constantes2.S_CODIGO_UNICO+"");
		jLabelIdEstadoNovedadNomi.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdEstadoNovedadNomi.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdEstadoNovedadNomi.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelIdEstadoNovedadNomi,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jPanelidEstadoNovedadNomi = new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelidEstadoNovedadNomi.setToolTipText(EstadoNovedadNomiConstantesFunciones.LABEL_ID);
		this.gridaBagLayoutEstadoNovedadNomi= new GridBagLayout();

		this.jPanelidEstadoNovedadNomi.setLayout(this.gridaBagLayoutEstadoNovedadNomi);

		jTextFieldidEstadoNovedadNomi = new JTextFieldMe();
		jTextFieldidEstadoNovedadNomi.setText("Id");

		jTextFieldidEstadoNovedadNomi.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jTextFieldidEstadoNovedadNomi.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jTextFieldidEstadoNovedadNomi.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));



					
		this.jLabelcodigoEstadoNovedadNomi = new JLabelMe();
		this.jLabelcodigoEstadoNovedadNomi.setText(""+EstadoNovedadNomiConstantesFunciones.LABEL_CODIGO+" : *");
		this.jLabelcodigoEstadoNovedadNomi.setToolTipText("Codigo");
		this.jLabelcodigoEstadoNovedadNomi.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcodigoEstadoNovedadNomi.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcodigoEstadoNovedadNomi.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelcodigoEstadoNovedadNomi,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelcodigoEstadoNovedadNomi=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelcodigoEstadoNovedadNomi.setToolTipText(EstadoNovedadNomiConstantesFunciones.LABEL_CODIGO);
		this.gridaBagLayoutEstadoNovedadNomi = new GridBagLayout();
		this.jPanelcodigoEstadoNovedadNomi.setLayout(this.gridaBagLayoutEstadoNovedadNomi);


		jTextFieldcodigoEstadoNovedadNomi= new JTextFieldMe();

		jTextFieldcodigoEstadoNovedadNomi.setEnabled(false);
		jTextFieldcodigoEstadoNovedadNomi.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcodigoEstadoNovedadNomi.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcodigoEstadoNovedadNomi.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldcodigoEstadoNovedadNomi,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtoncodigoEstadoNovedadNomiBusqueda= new JButtonMe();
		this.jButtoncodigoEstadoNovedadNomiBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncodigoEstadoNovedadNomiBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncodigoEstadoNovedadNomiBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtoncodigoEstadoNovedadNomiBusqueda.setText("U");
		this.jButtoncodigoEstadoNovedadNomiBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtoncodigoEstadoNovedadNomiBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtoncodigoEstadoNovedadNomiBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldcodigoEstadoNovedadNomi.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldcodigoEstadoNovedadNomi.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"codigoEstadoNovedadNomiBusqueda"));

		if(this.estadonovedadnomiSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtoncodigoEstadoNovedadNomiBusqueda.setVisible(false);		}


					
		this.jLabelnombreEstadoNovedadNomi = new JLabelMe();
		this.jLabelnombreEstadoNovedadNomi.setText(""+EstadoNovedadNomiConstantesFunciones.LABEL_NOMBRE+" : *");
		this.jLabelnombreEstadoNovedadNomi.setToolTipText("Nombre");
		this.jLabelnombreEstadoNovedadNomi.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnombreEstadoNovedadNomi.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnombreEstadoNovedadNomi.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelnombreEstadoNovedadNomi,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelnombreEstadoNovedadNomi=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelnombreEstadoNovedadNomi.setToolTipText(EstadoNovedadNomiConstantesFunciones.LABEL_NOMBRE);
		this.gridaBagLayoutEstadoNovedadNomi = new GridBagLayout();
		this.jPanelnombreEstadoNovedadNomi.setLayout(this.gridaBagLayoutEstadoNovedadNomi);


		jTextAreanombreEstadoNovedadNomi= new JTextAreaMe();
		jTextAreanombreEstadoNovedadNomi.setEnabled(false);
		jTextAreanombreEstadoNovedadNomi.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreEstadoNovedadNomi.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreEstadoNovedadNomi.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreEstadoNovedadNomi.setLineWrap(true);
		jTextAreanombreEstadoNovedadNomi.setWrapStyleWord(true);
		jTextAreanombreEstadoNovedadNomi.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreanombreEstadoNovedadNomi.setRows(5);

		FuncionesSwing.setBoldTextArea(jTextAreanombreEstadoNovedadNomi,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPanenombreEstadoNovedadNomi = new JScrollPane(jTextAreanombreEstadoNovedadNomi);
		jscrollPanenombreEstadoNovedadNomi.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanenombreEstadoNovedadNomi.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanenombreEstadoNovedadNomi.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));

		this.jButtonnombreEstadoNovedadNomiBusqueda= new JButtonMe();
		this.jButtonnombreEstadoNovedadNomiBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombreEstadoNovedadNomiBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombreEstadoNovedadNomiBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonnombreEstadoNovedadNomiBusqueda.setText("U");
		this.jButtonnombreEstadoNovedadNomiBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonnombreEstadoNovedadNomiBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonnombreEstadoNovedadNomiBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreanombreEstadoNovedadNomi.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreanombreEstadoNovedadNomi.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"nombreEstadoNovedadNomiBusqueda"));

		if(this.estadonovedadnomiSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonnombreEstadoNovedadNomiBusqueda.setVisible(false);		}


	}
	
	public void inicializarElementosCamposForeigKeysEstadoNovedadNomi() {
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
		//this.jInternalFrameDetalleEstadoNovedadNomi = new EstadoNovedadNomiBeanSwingJInternalFrameAdditional(paginaTipo);//JInternalFrameBase("Estado Novedad DATOS");
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutEstadoNovedadNomi= new GridBagLayout();
		

		
		String sToolTipEstadoNovedadNomi="";
		sToolTipEstadoNovedadNomi=EstadoNovedadNomiConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipEstadoNovedadNomi+="(Nomina.EstadoNovedadNomi)";
		}
		
		if(!this.estadonovedadnomiSessionBean.getEsGuardarRelacionado()) {
			sToolTipEstadoNovedadNomi+="_"+this.opcionActual.getId();
		}
								
		
		this.jButtonNuevoEstadoNovedadNomi = new JButtonMe();
		this.jButtonModificarEstadoNovedadNomi = new JButtonMe();
        this.jButtonActualizarEstadoNovedadNomi = new JButtonMe();
        this.jButtonEliminarEstadoNovedadNomi = new JButtonMe();
        this.jButtonCancelarEstadoNovedadNomi = new JButtonMe();
        this.jButtonGuardarCambiosEstadoNovedadNomi = new JButtonMe();
		this.jButtonGuardarCambiosTablaEstadoNovedadNomi = new JButtonMe();
		this.jButtonCerrarEstadoNovedadNomi = new JButtonMe();
		
		this.jScrollPanelDatosEstadoNovedadNomi = new JScrollPane();   
        this.jScrollPanelDatosEdicionEstadoNovedadNomi = new JScrollPane();
		this.jScrollPanelDatosGeneralEstadoNovedadNomi = new JScrollPane();
				
		
		
		this.jPanelCamposEstadoNovedadNomi = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelCamposOcultosEstadoNovedadNomi = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
        this.jPanelAccionesEstadoNovedadNomi = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		this.jPanelAccionesFormularioEstadoNovedadNomi = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		this.sPath=" <---> Acceso: Estado Novedad";
		
		if(!this.estadonovedadnomiSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosEstadoNovedadNomi.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Estado Novedads" + this.sPath));
		} else {
			this.jScrollPanelDatosEstadoNovedadNomi.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosEdicionEstadoNovedadNomi.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		this.jScrollPanelDatosGeneralEstadoNovedadNomi.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
			
        this.jPanelCamposEstadoNovedadNomi.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
        this.jPanelCamposEstadoNovedadNomi.setName("jPanelCamposEstadoNovedadNomi"); 

		this.jPanelCamposOcultosEstadoNovedadNomi.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos Ocultos"));
        this.jPanelCamposOcultosEstadoNovedadNomi.setName("jPanelCamposOcultosEstadoNovedadNomi"); 

        this.jPanelAccionesEstadoNovedadNomi.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesEstadoNovedadNomi.setToolTipText("Acciones");
        this.jPanelAccionesEstadoNovedadNomi.setName("Acciones"); 

		this.jPanelAccionesFormularioEstadoNovedadNomi.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones Extra/Post"));
        this.jPanelAccionesFormularioEstadoNovedadNomi.setToolTipText("Acciones");
        this.jPanelAccionesFormularioEstadoNovedadNomi.setName("Acciones"); 
		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosEdicionEstadoNovedadNomi, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralEstadoNovedadNomi, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosEstadoNovedadNomi, STIPO_TAMANIO_GENERAL,false,false,this);		
		FuncionesSwing.setBoldPanel(this.jPanelCamposEstadoNovedadNomi, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelCamposOcultosEstadoNovedadNomi, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelAccionesFormularioEstadoNovedadNomi, STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {
		
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		
        this.jButtonNuevoEstadoNovedadNomi.setText("Nuevo");
		this.jButtonModificarEstadoNovedadNomi.setText("Editar");
        this.jButtonActualizarEstadoNovedadNomi.setText("Actualizar");
        this.jButtonEliminarEstadoNovedadNomi.setText("Eliminar");
        this.jButtonCancelarEstadoNovedadNomi.setText("Cancelar");
        this.jButtonGuardarCambiosEstadoNovedadNomi.setText("Guardar");
		this.jButtonGuardarCambiosTablaEstadoNovedadNomi.setText("Guardar");
		this.jButtonCerrarEstadoNovedadNomi.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoEstadoNovedadNomi,"nuevo_button","Nuevo",this.estadonovedadnomiSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonModificarEstadoNovedadNomi,"modificar_button","Editar",this.estadonovedadnomiSessionBean.getEsGuardarRelacionado());
       	FuncionesSwing.addImagenButtonGeneral(this.jButtonActualizarEstadoNovedadNomi,"actualizar_button","Actualizar",this.estadonovedadnomiSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonEliminarEstadoNovedadNomi,"eliminar_button","Eliminar",this.estadonovedadnomiSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonCancelarEstadoNovedadNomi,"cancelar_button","Cancelar",this.estadonovedadnomiSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosEstadoNovedadNomi,"guardarcambios_button","Guardar",this.estadonovedadnomiSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaEstadoNovedadNomi,"guardarcambiostabla_button","Guardar",this.estadonovedadnomiSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarEstadoNovedadNomi,"cerrar_button","Salir",this.estadonovedadnomiSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoEstadoNovedadNomi, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonModificarEstadoNovedadNomi, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosEstadoNovedadNomi, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaEstadoNovedadNomi, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarEstadoNovedadNomi, STIPO_TAMANIO_GENERAL,false,true,this);
		
		FuncionesSwing.setBoldButton(this.jButtonActualizarEstadoNovedadNomi, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonEliminarEstadoNovedadNomi, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonCancelarEstadoNovedadNomi, STIPO_TAMANIO_GENERAL,false,false,this);
		
		this.jButtonNuevoEstadoNovedadNomi.setToolTipText("Nuevo"+" "+EstadoNovedadNomiConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonModificarEstadoNovedadNomi.setToolTipText("Editar"+" "+EstadoNovedadNomiConstantesFunciones.SCLASSWEBTITULO+"");// + FuncionesSwing.getKeyMensaje("MODIFICAR"))
        this.jButtonActualizarEstadoNovedadNomi.setToolTipText("Actualizar"+" "+EstadoNovedadNomiConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
        this.jButtonEliminarEstadoNovedadNomi.setToolTipText("Eliminar)"+" "+EstadoNovedadNomiConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"));
        this.jButtonCancelarEstadoNovedadNomi.setToolTipText("Cancelar"+" "+EstadoNovedadNomiConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"));
        this.jButtonGuardarCambiosEstadoNovedadNomi.setToolTipText("Guardar"+" "+EstadoNovedadNomiConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonGuardarCambiosTablaEstadoNovedadNomi.setToolTipText("Guardar"+" "+EstadoNovedadNomiConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarEstadoNovedadNomi.setToolTipText("Salir"+" "+EstadoNovedadNomiConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoEstadoNovedadNomi";
		inputMap = this.jButtonNuevoEstadoNovedadNomi.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoEstadoNovedadNomi.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoEstadoNovedadNomi"));
		
		//ACTUALIZAR
		sMapKey = "ActualizarEstadoNovedadNomi";
		inputMap = this.jButtonActualizarEstadoNovedadNomi.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ACTUALIZAR") , FuncionesSwing.getMaskKey("ACTUALIZAR")), sMapKey);
		
		this.jButtonActualizarEstadoNovedadNomi.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ActualizarEstadoNovedadNomi"));
		
		//ELIMINAR
		sMapKey = "EliminarEstadoNovedadNomi";
		inputMap = this.jButtonEliminarEstadoNovedadNomi.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ELIMINAR") , FuncionesSwing.getMaskKey("ELIMINAR")), sMapKey);
		
		this.jButtonEliminarEstadoNovedadNomi.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"EliminarEstadoNovedadNomi"));
		
		//CANCELAR	
		sMapKey = "CancelarEstadoNovedadNomi";
		inputMap = this.jButtonCancelarEstadoNovedadNomi.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CANCELAR") , FuncionesSwing.getMaskKey("CANCELAR")), sMapKey);
		
		this.jButtonCancelarEstadoNovedadNomi.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CancelarEstadoNovedadNomi"));
		
		//CERRAR		
		sMapKey = "CerrarEstadoNovedadNomi";
		inputMap = this.jButtonCerrarEstadoNovedadNomi.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarEstadoNovedadNomi.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarEstadoNovedadNomi"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaEstadoNovedadNomi";
		inputMap = this.jButtonGuardarCambiosTablaEstadoNovedadNomi.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaEstadoNovedadNomi.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaEstadoNovedadNomi"));
		
		//HOT KEYS
		
		this.jCheckBoxPostAccionNuevoEstadoNovedadNomi = new JCheckBoxMe();
		this.jCheckBoxPostAccionNuevoEstadoNovedadNomi.setText("Nuevo");
		this.jCheckBoxPostAccionNuevoEstadoNovedadNomi.setToolTipText("Nuevo EstadoNovedadNomi");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionNuevoEstadoNovedadNomi, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinCerrarEstadoNovedadNomi = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinCerrarEstadoNovedadNomi.setText("Sin Cerrar");
		this.jCheckBoxPostAccionSinCerrarEstadoNovedadNomi.setToolTipText("Sin Cerrar Ventana EstadoNovedadNomi");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinCerrarEstadoNovedadNomi, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinMensajeEstadoNovedadNomi = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinMensajeEstadoNovedadNomi.setText("Sin Mensaje");
		this.jCheckBoxPostAccionSinMensajeEstadoNovedadNomi.setToolTipText("Sin Mensaje Confirmacion");				
				
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinMensajeEstadoNovedadNomi, STIPO_TAMANIO_GENERAL,false,false,this);       	
       
				
		
			
			
		this.jComboBoxTiposAccionesEstadoNovedadNomi = new JComboBoxMe();
		//this.jComboBoxTiposAccionesEstadoNovedadNomi.setText("Accion");
		this.jComboBoxTiposAccionesEstadoNovedadNomi.setToolTipText("Tipos de Acciones");
							
		

		this.jComboBoxTiposAccionesFormularioEstadoNovedadNomi = new JComboBoxMe();
		//this.jComboBoxTiposAccionesFormularioEstadoNovedadNomi.setText("Accion");				
    	this.jComboBoxTiposAccionesFormularioEstadoNovedadNomi.setToolTipText("Tipos de Acciones");
	
		this.jLabelAccionesEstadoNovedadNomi = new JLabelMe();
		
		this.jLabelAccionesEstadoNovedadNomi.setText("Acciones");		
		this.jLabelAccionesEstadoNovedadNomi.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesEstadoNovedadNomi.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesEstadoNovedadNomi.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
        //HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		//HOT KEYS2
		
		//ELEMENTOS
		this.inicializarElementosCamposEstadoNovedadNomi();
		
		//ELEMENTOS FK
		this.inicializarElementosCamposForeigKeysEstadoNovedadNomi();
				
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		this.jTabbedPaneRelacionesEstadoNovedadNomi=new JTabbedPane();
		this.jTabbedPaneRelacionesEstadoNovedadNomi.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Relacionados"));
		
		//ESTA EN BEAN

		
		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneRelacionesEstadoNovedadNomi,STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		int iPosXAccionPaginacion=0;
		
		
		
				
		
		this.jComboBoxTiposAccionesEstadoNovedadNomi.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesEstadoNovedadNomi.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesEstadoNovedadNomi.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesEstadoNovedadNomi, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		
		
		this.jComboBoxTiposAccionesFormularioEstadoNovedadNomi.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioEstadoNovedadNomi.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioEstadoNovedadNomi.setPreferredSize(new Dimension(145,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesFormularioEstadoNovedadNomi, STIPO_TAMANIO_GENERAL,false,false,this);				
		
		GridBagLayout gridaBagLayoutCamposEstadoNovedadNomi = new GridBagLayout();
		GridBagLayout gridaBagLayoutCamposOcultosEstadoNovedadNomi = new GridBagLayout();
		
		this.jPanelCamposEstadoNovedadNomi.setLayout(gridaBagLayoutCamposEstadoNovedadNomi);
		this.jPanelCamposOcultosEstadoNovedadNomi.setLayout(gridaBagLayoutCamposOcultosEstadoNovedadNomi);
		
		;
		;
		
		
		//SUBPANELES SIMPLES
		//SUBPANELES POR CAMPO
        
	this.gridBagConstraintsEstadoNovedadNomi = new GridBagConstraints();
	this.gridBagConstraintsEstadoNovedadNomi.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsEstadoNovedadNomi.gridy = 0;
	this.gridBagConstraintsEstadoNovedadNomi.gridx = 0;
	this.gridBagConstraintsEstadoNovedadNomi.ipadx = 0;
	this.gridBagConstraintsEstadoNovedadNomi.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelidEstadoNovedadNomi.add(jLabelIdEstadoNovedadNomi, this.gridBagConstraintsEstadoNovedadNomi);



	this.gridBagConstraintsEstadoNovedadNomi = new GridBagConstraints();
	this.gridBagConstraintsEstadoNovedadNomi.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsEstadoNovedadNomi.gridy = 0;
	this.gridBagConstraintsEstadoNovedadNomi.gridx = 1;
	this.gridBagConstraintsEstadoNovedadNomi.ipadx = 0;
	this.gridBagConstraintsEstadoNovedadNomi.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelidEstadoNovedadNomi.add(jTextFieldidEstadoNovedadNomi, this.gridBagConstraintsEstadoNovedadNomi);


	this.gridBagConstraintsEstadoNovedadNomi = new GridBagConstraints();
	this.gridBagConstraintsEstadoNovedadNomi.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsEstadoNovedadNomi.gridy = 0;
	this.gridBagConstraintsEstadoNovedadNomi.gridx = 0;
	this.gridBagConstraintsEstadoNovedadNomi.ipadx = 0;
	this.gridBagConstraintsEstadoNovedadNomi.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelcodigoEstadoNovedadNomi.add(jLabelcodigoEstadoNovedadNomi, this.gridBagConstraintsEstadoNovedadNomi);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsEstadoNovedadNomi = new GridBagConstraints();
		//this.gridBagConstraintsEstadoNovedadNomi.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsEstadoNovedadNomi.gridy = 0;
		this.gridBagConstraintsEstadoNovedadNomi.gridx = 2;
		this.gridBagConstraintsEstadoNovedadNomi.ipadx = 0;
		this.gridBagConstraintsEstadoNovedadNomi.insets = new Insets(0, 0, 0, 0);
		this.jPanelcodigoEstadoNovedadNomi.add(jButtoncodigoEstadoNovedadNomiBusqueda, this.gridBagConstraintsEstadoNovedadNomi);
	}

	this.gridBagConstraintsEstadoNovedadNomi = new GridBagConstraints();
	this.gridBagConstraintsEstadoNovedadNomi.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsEstadoNovedadNomi.gridy = 0;
	this.gridBagConstraintsEstadoNovedadNomi.gridx = 1;
	this.gridBagConstraintsEstadoNovedadNomi.ipadx = 0;
	this.gridBagConstraintsEstadoNovedadNomi.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelcodigoEstadoNovedadNomi.add(jTextFieldcodigoEstadoNovedadNomi, this.gridBagConstraintsEstadoNovedadNomi);


	this.gridBagConstraintsEstadoNovedadNomi = new GridBagConstraints();
	this.gridBagConstraintsEstadoNovedadNomi.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsEstadoNovedadNomi.gridy = 0;
	this.gridBagConstraintsEstadoNovedadNomi.gridx = 0;
	this.gridBagConstraintsEstadoNovedadNomi.ipadx = 0;
	this.gridBagConstraintsEstadoNovedadNomi.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelnombreEstadoNovedadNomi.add(jLabelnombreEstadoNovedadNomi, this.gridBagConstraintsEstadoNovedadNomi);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsEstadoNovedadNomi = new GridBagConstraints();
		//this.gridBagConstraintsEstadoNovedadNomi.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsEstadoNovedadNomi.gridy = 0;
		this.gridBagConstraintsEstadoNovedadNomi.gridx = 2;
		this.gridBagConstraintsEstadoNovedadNomi.ipadx = 0;
		this.gridBagConstraintsEstadoNovedadNomi.insets = new Insets(0, 0, 0, 0);
		this.jPanelnombreEstadoNovedadNomi.add(jButtonnombreEstadoNovedadNomiBusqueda, this.gridBagConstraintsEstadoNovedadNomi);
	}

	this.gridBagConstraintsEstadoNovedadNomi = new GridBagConstraints();
	this.gridBagConstraintsEstadoNovedadNomi.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsEstadoNovedadNomi.gridy = 0;
	this.gridBagConstraintsEstadoNovedadNomi.gridx = 1;
	this.gridBagConstraintsEstadoNovedadNomi.ipadx = 0;
	this.gridBagConstraintsEstadoNovedadNomi.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelnombreEstadoNovedadNomi.add(jscrollPanenombreEstadoNovedadNomi, this.gridBagConstraintsEstadoNovedadNomi);


		//SUBPANELES SIMPLES
		
		//SUBPANELES EN PANEL
		//SUBPANELES EN PANEL CAMPOS NORMAL				
		
	this.gridBagConstraintsEstadoNovedadNomi = new GridBagConstraints();
	this.gridBagConstraintsEstadoNovedadNomi.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsEstadoNovedadNomi.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsEstadoNovedadNomi.gridy = iYPanelCamposEstadoNovedadNomi;
	this.gridBagConstraintsEstadoNovedadNomi.gridx = iXPanelCamposEstadoNovedadNomi++;
	this.gridBagConstraintsEstadoNovedadNomi.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsEstadoNovedadNomi.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposEstadoNovedadNomi.add(this.jPanelidEstadoNovedadNomi, this.gridBagConstraintsEstadoNovedadNomi);



	if(iXPanelCamposEstadoNovedadNomi % 1==0) {
		iXPanelCamposEstadoNovedadNomi=0;
		iYPanelCamposEstadoNovedadNomi++;
	}
	this.gridBagConstraintsEstadoNovedadNomi = new GridBagConstraints();
	this.gridBagConstraintsEstadoNovedadNomi.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsEstadoNovedadNomi.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsEstadoNovedadNomi.gridy = iYPanelCamposEstadoNovedadNomi;
	this.gridBagConstraintsEstadoNovedadNomi.gridx = iXPanelCamposEstadoNovedadNomi++;
	this.gridBagConstraintsEstadoNovedadNomi.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsEstadoNovedadNomi.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposEstadoNovedadNomi.add(this.jPanelcodigoEstadoNovedadNomi, this.gridBagConstraintsEstadoNovedadNomi);



	if(iXPanelCamposEstadoNovedadNomi % 1==0) {
		iXPanelCamposEstadoNovedadNomi=0;
		iYPanelCamposEstadoNovedadNomi++;
	}
	this.gridBagConstraintsEstadoNovedadNomi = new GridBagConstraints();
	this.gridBagConstraintsEstadoNovedadNomi.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsEstadoNovedadNomi.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsEstadoNovedadNomi.gridy = iYPanelCamposEstadoNovedadNomi;
	this.gridBagConstraintsEstadoNovedadNomi.gridx = iXPanelCamposEstadoNovedadNomi++;
	this.gridBagConstraintsEstadoNovedadNomi.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsEstadoNovedadNomi.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposEstadoNovedadNomi.add(this.jPanelnombreEstadoNovedadNomi, this.gridBagConstraintsEstadoNovedadNomi);



	if(iXPanelCamposEstadoNovedadNomi % 1==0) {
		iXPanelCamposEstadoNovedadNomi=0;
		iYPanelCamposEstadoNovedadNomi++;
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
			
		GridBagLayout gridaBagLayoutAccionesEstadoNovedadNomi= new GridBagLayout();
		this.jPanelAccionesEstadoNovedadNomi.setLayout(gridaBagLayoutAccionesEstadoNovedadNomi);
		
		GridBagLayout gridaBagLayoutAccionesFormularioEstadoNovedadNomi= new GridBagLayout();
		this.jPanelAccionesFormularioEstadoNovedadNomi.setLayout(gridaBagLayoutAccionesFormularioEstadoNovedadNomi);
		
		this.gridBagConstraintsEstadoNovedadNomi = new GridBagConstraints();
		this.gridBagConstraintsEstadoNovedadNomi.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsEstadoNovedadNomi.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioEstadoNovedadNomi.add(this.jComboBoxTiposAccionesFormularioEstadoNovedadNomi, this.gridBagConstraintsEstadoNovedadNomi);

		this.gridBagConstraintsEstadoNovedadNomi = new GridBagConstraints();
		this.gridBagConstraintsEstadoNovedadNomi.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsEstadoNovedadNomi.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioEstadoNovedadNomi.add(this.jCheckBoxPostAccionNuevoEstadoNovedadNomi, this.gridBagConstraintsEstadoNovedadNomi);
			
		//DEBE CERRARSE Y ACTUALIZARSE TODO NUEVAMENTE, SI ES RELACIONADO PUEDE FUNCIONAR
		//if(!this.estadonovedadnomiSessionBean.getEstaModoGuardarRelaciones()) {		
		//SE ARRIESGA
		//if(!this.conFuncionalidadRelaciones) {		
			this.gridBagConstraintsEstadoNovedadNomi = new GridBagConstraints();
			this.gridBagConstraintsEstadoNovedadNomi.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsEstadoNovedadNomi.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioEstadoNovedadNomi.add(this.jCheckBoxPostAccionSinCerrarEstadoNovedadNomi, this.gridBagConstraintsEstadoNovedadNomi);
		//}
		
		
		//NO TIENE MENSAJE POR DEFINICION, O ES MUY COMPLEJO LA PANTALLA PARA HACERLO MAS COMPLICADO
		if(!this.estadonovedadnomiSessionBean.getEsGuardarRelacionado()
			){				
			//&& !this.estadonovedadnomiSessionBean.getEstaModoGuardarRelaciones()) {
							
			this.gridBagConstraintsEstadoNovedadNomi = new GridBagConstraints();
			this.gridBagConstraintsEstadoNovedadNomi.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsEstadoNovedadNomi.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioEstadoNovedadNomi.add(this.jCheckBoxPostAccionSinMensajeEstadoNovedadNomi, this.gridBagConstraintsEstadoNovedadNomi);
		}
		
		
		int iPosXAccion=0;
		
		this.gridBagConstraintsEstadoNovedadNomi = new GridBagConstraints();
		this.gridBagConstraintsEstadoNovedadNomi.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsEstadoNovedadNomi.gridy = 0;
		this.gridBagConstraintsEstadoNovedadNomi.gridx = iPosXAccion++;
			
		this.jPanelAccionesEstadoNovedadNomi.add(this.jButtonModificarEstadoNovedadNomi, this.gridBagConstraintsEstadoNovedadNomi);							

		this.gridBagConstraintsEstadoNovedadNomi = new GridBagConstraints();
		this.gridBagConstraintsEstadoNovedadNomi.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsEstadoNovedadNomi.gridy = 0;
		this.gridBagConstraintsEstadoNovedadNomi.gridx =iPosXAccion++;
			
		this.jPanelAccionesEstadoNovedadNomi.add(this.jButtonEliminarEstadoNovedadNomi, this.gridBagConstraintsEstadoNovedadNomi);
		
			
		this.gridBagConstraintsEstadoNovedadNomi = new GridBagConstraints();
		this.gridBagConstraintsEstadoNovedadNomi.gridy = 0;		
		this.gridBagConstraintsEstadoNovedadNomi.gridx = iPosXAccion++;
		
		this.jPanelAccionesEstadoNovedadNomi.add(this.jButtonActualizarEstadoNovedadNomi, this.gridBagConstraintsEstadoNovedadNomi);


		this.gridBagConstraintsEstadoNovedadNomi = new GridBagConstraints();
		this.gridBagConstraintsEstadoNovedadNomi.gridy = 0;		
		this.gridBagConstraintsEstadoNovedadNomi.gridx = iPosXAccion++;
		
		this.jPanelAccionesEstadoNovedadNomi.add(this.jButtonGuardarCambiosEstadoNovedadNomi, this.gridBagConstraintsEstadoNovedadNomi);	
		
		this.gridBagConstraintsEstadoNovedadNomi = new GridBagConstraints();
		this.gridBagConstraintsEstadoNovedadNomi.gridy = 0;		
		this.gridBagConstraintsEstadoNovedadNomi.gridx =iPosXAccion++;
		
		this.jPanelAccionesEstadoNovedadNomi.add(this.jButtonCancelarEstadoNovedadNomi, this.gridBagConstraintsEstadoNovedadNomi);
		
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutEstadoNovedadNomi = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutEstadoNovedadNomi);
		
		if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.estadonovedadnomiSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsEstadoNovedadNomi = new GridBagConstraints();						
			this.gridBagConstraintsEstadoNovedadNomi.gridy = iGridyPrincipal++;
			this.gridBagConstraintsEstadoNovedadNomi.gridx = 0;		
			//this.gridBagConstraintsEstadoNovedadNomi.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEstadoNovedadNomi.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsEstadoNovedadNomi.ipadx = 100;
				
			
		}
		
		//PROCESANDO EN OTRA PANTALLA
		
		
		int iGridxBusquedasParametros=0;
		
	
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			//NO BUSQUEDA
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		
		this.gridBagConstraintsEstadoNovedadNomi = new GridBagConstraints();
		this.gridBagConstraintsEstadoNovedadNomi.gridy =iGridyPrincipal++;
		this.gridBagConstraintsEstadoNovedadNomi.gridx =0;
		this.gridBagConstraintsEstadoNovedadNomi.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsEstadoNovedadNomi.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosEstadoNovedadNomi, this.gridBagConstraintsEstadoNovedadNomi);
				
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);

		
			
		//if(EstadoNovedadNomiJInternalFrame.CON_DATOS_FRAME) {				
			//this.jInternalFrameDetalleEstadoNovedadNomi = new EstadoNovedadNomiBeanSwingJInternalFrameAdditional();//JInternalFrameBase("Estado Novedad DATOS");
			
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
			
	        //this.setTitle("[FOR] - Estado Novedad DATOS");
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Estado Novedad Formulario",PaginaTipo.FORMULARIO,paginaTipo));			
	        this.setSize(iWidthFormulario,iHeightFormulario);        
		   				
			this.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	        this.setResizable(true);
	        this.setClosable(true);
	        this.setMaximizable(true);
		    
			EstadoNovedadNomiModel estadonovedadnomiModel=new EstadoNovedadNomiModel(this);
			
			//SI USARA CLASE INTERNA
			//EstadoNovedadNomiModel.EstadoNovedadNomiFocusTraversalPolicy estadonovedadnomiFocusTraversalPolicy = estadonovedadnomiModel.new EstadoNovedadNomiFocusTraversalPolicy(this);
			
			//estadonovedadnomiFocusTraversalPolicy.setestadonovedadnomiJInternalFrame(this);
			
			this.setFocusTraversalPolicy(estadonovedadnomiModel);
			
			
			this.jContentPaneDetalleEstadoNovedadNomi = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			GridBagLayout gridaBagLayoutDetalleEstadoNovedadNomi = new GridBagLayout();	
			this.jContentPaneDetalleEstadoNovedadNomi.setLayout(gridaBagLayoutDetalleEstadoNovedadNomi);
			
			GridBagLayout gridaBagLayoutBusquedasParametrosEstadoNovedadNomi = new GridBagLayout();
			
			
if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
				
				//AGREGA TOOLBAR DETALLE A PANTALLA
				
				this.gridBagConstraintsEstadoNovedadNomi = new GridBagConstraints();
				this.gridBagConstraintsEstadoNovedadNomi.gridy = iGridyRelaciones++;		
				this.gridBagConstraintsEstadoNovedadNomi.gridx = 0;
					
				
				this.jContentPaneDetalleEstadoNovedadNomi.add(jTtoolBarDetalleEstadoNovedadNomi, gridBagConstraintsEstadoNovedadNomi);								
				
}
			
			this.jScrollPanelDatosEdicionEstadoNovedadNomi=   new JScrollPane(jContentPaneDetalleEstadoNovedadNomi,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionEstadoNovedadNomi.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionEstadoNovedadNomi.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionEstadoNovedadNomi.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			this.jScrollPanelDatosGeneralEstadoNovedadNomi=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralEstadoNovedadNomi.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralEstadoNovedadNomi.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralEstadoNovedadNomi.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsEstadoNovedadNomi = new GridBagConstraints();
			
			
	        this.gridBagConstraintsEstadoNovedadNomi.gridy = iGridyRelaciones++;		
	        this.gridBagConstraintsEstadoNovedadNomi.gridx = 0;
	        
			this.jContentPaneDetalleEstadoNovedadNomi.add(jPanelCamposEstadoNovedadNomi, gridBagConstraintsEstadoNovedadNomi);
			
			
			
			
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
						&& estadonovedadnomiSessionBean.getConGuardarRelaciones()
						) {
					//paraCargarPorParte es false por defecto(y ejecuta funcion normal cargando detalle en tab panel), si se utiliza funcionalidad es true y carga tab panel auxiliar temporal
					
					this.cargarSessionConBeanSwingJInternalFrameNovedadNomi(this.puedeCargarPorParteNovedadNomi,false,-1);
					
					if(this.estadonovedadnomiSessionBean.getConGuardarRelaciones()) {
						this.gridBagConstraintsEstadoNovedadNomi= new GridBagConstraints();
						this.gridBagConstraintsEstadoNovedadNomi.gridy = iGridyRelaciones++;
						this.gridBagConstraintsEstadoNovedadNomi.gridx = 0;
						this.jContentPaneDetalleEstadoNovedadNomi.add(this.jTabbedPaneRelacionesEstadoNovedadNomi, this.gridBagConstraintsEstadoNovedadNomi);
					}
					
					//RELACIONES OTROS AGRUPADOS
					;
					
					} else {
						//this.jButtonNuevoRelacionesEstadoNovedadNomi.setVisible(false);
						
					this.cargarSessionConBeanSwingJInternalFrameNovedadNomi(true,false,-1);
					}
				}
			}
			
			Boolean tieneColumnasOcultas=false;
			
		
						
			
			if(!Constantes.ISDEVELOPING) {
	       		this.jPanelCamposOcultosEstadoNovedadNomi.setVisible(false);
			} else {
				if(tieneColumnasOcultas) {
					this.gridBagConstraintsEstadoNovedadNomi = new GridBagConstraints();
					this.gridBagConstraintsEstadoNovedadNomi.fill=GridBagConstraints.NONE;
					this.gridBagConstraintsEstadoNovedadNomi.anchor = GridBagConstraints.WEST;
					
					this.gridBagConstraintsEstadoNovedadNomi.gridy = iGridyRelaciones++;		
					this.gridBagConstraintsEstadoNovedadNomi.gridx = 0;
					
				
					this.jContentPaneDetalleEstadoNovedadNomi.add(jPanelCamposOcultosEstadoNovedadNomi, gridBagConstraintsEstadoNovedadNomi);
				
					this.jPanelCamposOcultosEstadoNovedadNomi.setVisible(true);
				}
			}					
			
			
			
			
			this.gridBagConstraintsEstadoNovedadNomi = new GridBagConstraints();
			this.gridBagConstraintsEstadoNovedadNomi.gridy = iGridyRelaciones++;//4;		
	        this.gridBagConstraintsEstadoNovedadNomi.gridx = 0;
	        this.gridBagConstraintsEstadoNovedadNomi.anchor = GridBagConstraints.CENTER;//WEST;
			
			
			
			this.jContentPaneDetalleEstadoNovedadNomi.add(this.jPanelAccionesFormularioEstadoNovedadNomi, this.gridBagConstraintsEstadoNovedadNomi);							
			
			
			
			this.gridBagConstraintsEstadoNovedadNomi = new GridBagConstraints();
	        this.gridBagConstraintsEstadoNovedadNomi.gridy = iGridyRelaciones;//4;		
	        this.gridBagConstraintsEstadoNovedadNomi.gridx = 0;
	        
			
			this.jContentPaneDetalleEstadoNovedadNomi.add(this.jPanelAccionesEstadoNovedadNomi, this.gridBagConstraintsEstadoNovedadNomi);							
			
	        //this.setContentPane(jScrollPanelDatosEdicionEstadoNovedadNomi);
			
		//} else {
			//DISENO_DETALLE COMENTAR Y
			//DISENO_DETALLE(Solo Descomentar Seccion Inferior)
			//NOTA-DISENO_DETALLE(Si cambia lo de abajo, cambiar lo comentado, Al final no es lo mismo)
			
			/*
			this.jScrollPanelDatosEdicionEstadoNovedadNomi=   new JScrollPane(this.jPanelCamposEstadoNovedadNomi,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionEstadoNovedadNomi.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionEstadoNovedadNomi.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionEstadoNovedadNomi.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			
			this.gridBagConstraintsEstadoNovedadNomi = new GridBagConstraints();
			this.gridBagConstraintsEstadoNovedadNomi.gridy = iGridyPrincipal++;		
			this.gridBagConstraintsEstadoNovedadNomi.gridx = 0;
			this.gridBagConstraintsEstadoNovedadNomi.fill = GridBagConstraints.BOTH;
			this.gridBagConstraintsEstadoNovedadNomi.ipady = this.getSize().height-yOffset*3;
			this.gridBagConstraintsEstadoNovedadNomi.anchor = GridBagConstraints.WEST;
			
			this.jContentPane.add(this.jScrollPanelDatosEdicionEstadoNovedadNomi, this.gridBagConstraintsEstadoNovedadNomi);
			
			//ACCIONES FORMULARIO
			this.gridBagConstraintsEstadoNovedadNomi = new GridBagConstraints();
			this.gridBagConstraintsEstadoNovedadNomi.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsEstadoNovedadNomi.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesFormularioEstadoNovedadNomi, this.gridBagConstraintsEstadoNovedadNomi);			
			
			this.gridBagConstraintsEstadoNovedadNomi = new GridBagConstraints();
			this.gridBagConstraintsEstadoNovedadNomi.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsEstadoNovedadNomi.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesEstadoNovedadNomi, this.gridBagConstraintsEstadoNovedadNomi);									
			*/
		//}								
			
		//DISENO_DETALLE-(Descomentar)
		/*
		this.gridBagConstraintsEstadoNovedadNomi = new GridBagConstraints();
		this.gridBagConstraintsEstadoNovedadNomi.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsEstadoNovedadNomi.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposEstadoNovedadNomi, this.gridBagConstraintsEstadoNovedadNomi);
			
			
		this.gridBagConstraintsEstadoNovedadNomi = new GridBagConstraints();
		this.gridBagConstraintsEstadoNovedadNomi.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsEstadoNovedadNomi.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosEstadoNovedadNomi, this.gridBagConstraintsEstadoNovedadNomi);
		
			
		this.gridBagConstraintsEstadoNovedadNomi = new GridBagConstraints();
		this.gridBagConstraintsEstadoNovedadNomi.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsEstadoNovedadNomi.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesEstadoNovedadNomi, this.gridBagConstraintsEstadoNovedadNomi);
		*/
		
			
     	//pack();
		
		
		//return this.jScrollPanelDatosGeneralEstadoNovedadNomi;//jContentPane;
		
		return jScrollPanelDatosEdicionEstadoNovedadNomi;
    } 
	
		

	public void cargarSessionConBeanSwingJInternalFrameNovedadNomi(Boolean soloSession,Boolean actualizarTab,Integer iIndexTab) throws Exception {

		//SOLO INICIALIZA SESSION (YA NO, CONSUME MUCHA MEMORIA)
		this.novedadnomiSessionBean=new NovedadNomiSessionBean();
		this.novedadnomiSessionBean.setConGuardarRelaciones(false);
		this.novedadnomiSessionBean.setEsGuardarRelacionado(true);

		this.novedadnomiBeanSwingJInternalFrame=null;//new NovedadNomiBeanSwingJInternalFrame(false,true,false);

		if(!soloSession) {
			//this.novedadnomiBeanSwingJInternalFramePopup=new NovedadNomiBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,true);
			//this.novedadnomiBeanSwingJInternalFramePopup.jInternalFrameParent=this;


			if(this.novedadnomiSessionBean.getEsGuardarRelacionado()) {

				NovedadNomiJInternalFrame.STIPO_TAMANIO_GENERAL=EstadoNovedadNomiJInternalFrame.STIPO_TAMANIO_GENERAL;
				NovedadNomiJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=EstadoNovedadNomiJInternalFrame.STIPO_TAMANIO_GENERAL;

				this.novedadnomiSessionBean.setEsGuardarRelacionado(true);

				this.novedadnomiBeanSwingJInternalFrame=new NovedadNomiBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.SECUNDARIO,false,true,false,false);//false->4

				this.novedadnomiBeanSwingJInternalFrame.setJInternalFrameParent(this);
				this.novedadnomiBeanSwingJInternalFrame.setnovedadnomiSessionBean(this.novedadnomiSessionBean);

				//this.gridBagConstraintsEstadoNovedadNomi = new GridBagConstraints();
				//this.gridBagConstraintsEstadoNovedadNomi.gridy = iGridyRelaciones++;
				//this.gridBagConstraintsEstadoNovedadNomi.gridx = 0;
				//this.jContentPaneDetalleEstadoNovedadNomi.add(this.novedadnomiBeanSwingJInternalFrame.getContentPane(), this.gridBagConstraintsEstadoNovedadNomi);

				if(!actualizarTab) {
					this.jTabbedPaneRelacionesEstadoNovedadNomi.add("Novedad Nomis",this.novedadnomiBeanSwingJInternalFrame.getContentPane());
				} else {
					this.jTabbedPaneRelacionesEstadoNovedadNomi.setComponentAt(iIndexTab,this.novedadnomiBeanSwingJInternalFrame.getContentPane());
				}

				//NovedadNomiJInternalFrame.ESTA_CARGADO_PORPARTE=true;
			} else {
				this.novedadnomiSessionBean.setEsGuardarRelacionado(false);
				this.novedadnomiBeanSwingJInternalFrame=null;//new NovedadNomiBeanSwingJInternalFrame(false,false,jDesktopPane,this.usuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,false);
			}
		} else {
			if(this.novedadnomiSessionBean.getEsGuardarRelacionado()) {
				if(this.puedeCargarPorParteNovedadNomi) {
					this.jTabbedPaneRelacionesEstadoNovedadNomi.add("Novedad Nomis",new JPanel());
				}
			}
		}
	}
	
	
	
	
		public void cargarNovedadNomiBeanSwingJInternalFrame(List<EstadoNovedadNomi> estadonovedadnomis,EstadoNovedadNomi estadonovedadnomi,NovedadNomiBeanSwingJInternalFrame novedadnomiBeanSwingJInternalFrame,/*Boolean conInicializar,*/Boolean conGuardarRelaciones,Boolean esGuardarRelacionado) throws Exception 
		{
			try
			{
				if(true/*conInicializar*/) {
					//GETCONTENTPANE SOLO UN PAPA, SE PIERDE PANEL, POR LO QUE SE CREA NUEVO POR CADA PANTALLA
					//novedadnomiBeanSwingJInternalFrame=new NovedadNomiBeanSwingJInternalFrame(false,false,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);

				}
					novedadnomiBeanSwingJInternalFrame.getNovedadNomiLogic().setConnexion(this.estadonovedadnomiLogic.getConnexion());

					novedadnomiBeanSwingJInternalFrame.setestadonovedadnomisForeignKey(estadonovedadnomis);
					novedadnomiBeanSwingJInternalFrame.setestadonovedadnomiForeignKey(estadonovedadnomi);
					novedadnomiBeanSwingJInternalFrame.novedadnomiSessionBean.setisBusquedaDesdeForeignKeySesionEstadoNovedadNomi(true);
					novedadnomiBeanSwingJInternalFrame.novedadnomiSessionBean.setlidEstadoNovedadNomiActual(estadonovedadnomi.getId());
					//NO VOLVER A RECARGAR FK, TALVEZ INICIALIZAR FK DEPENDENTES
					//Hijos Independientes, No carga Fk al inicializar, Hay que setisBusquedaDesdeForeignKeySesion(true), luego cargar todos los Fks necesarios
					novedadnomiBeanSwingJInternalFrame.cargarCombosForeignKeyNovedadNomi(novedadnomiBeanSwingJInternalFrame.isCargarCombosDependencia);
					novedadnomiBeanSwingJInternalFrame.setVisibilidadBusquedasParaEstadoNovedadNomi(true);
					novedadnomiBeanSwingJInternalFrame.setid_estado_novedad_nomiFK_IdEstadoNovedadNomi(estadonovedadnomi.getId());

					if(!this.conCargarFormDetalle) {
						novedadnomiBeanSwingJInternalFrame.inicializarFormDetalle();
					}

					novedadnomiBeanSwingJInternalFrame.setSelectedItemCombosFrameEstadoNovedadNomiForeignKey(estadonovedadnomi,1,false,true,true);
					novedadnomiBeanSwingJInternalFrame.setiNumeroPaginacion(Funciones2.getPaginacionDefecto("RELACIONADO"));
					novedadnomiBeanSwingJInternalFrame.procesarBusqueda("FK_IdEstadoNovedadNomi");
					novedadnomiBeanSwingJInternalFrame.setsAccionBusqueda("FK_IdEstadoNovedadNomi");
					novedadnomiBeanSwingJInternalFrame.inicializarActualizarBindingTablaNovedadNomi(true);
					novedadnomiBeanSwingJInternalFrame.actualizarEstadoCeldasBotonesNovedadNomi("n",novedadnomiBeanSwingJInternalFrame.isGuardarCambiosEnLote, novedadnomiBeanSwingJInternalFrame.isEsMantenimientoRelacionado);
					novedadnomiBeanSwingJInternalFrame.setAutoscrolls(true);
					novedadnomiBeanSwingJInternalFrame.setVisible(true);

					if(esGuardarRelacionado) {
						novedadnomiBeanSwingJInternalFrame.actualizarEstadoPanelsNovedadNomi("relacionado");
					} else {
						novedadnomiBeanSwingJInternalFrame.actualizarEstadoPanelsNovedadNomi("no_relacionado");
					}

					novedadnomiBeanSwingJInternalFrame.getjButtonRecargarInformacionNovedadNomi().setVisible(false);

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
