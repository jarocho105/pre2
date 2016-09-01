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
package com.bydan.erp.activosfijos.presentation.swing.jinternalframes;


import com.bydan.erp.seguridad.presentation.swing.jinternalframes.*;

import com.bydan.erp.activosfijos.presentation.web.jsf.sessionbean.*;//;
import com.bydan.erp.activosfijos.presentation.swing.jinternalframes.*;
import com.bydan.erp.activosfijos.presentation.swing.jinternalframes.auxiliar.*;


import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;

//import com.bydan.erp.activosfijos.presentation.report.source.*;


import com.bydan.framework.erp.business.entity.Reporte;

import com.bydan.erp.seguridad.business.entity.Modulo;
import com.bydan.erp.seguridad.business.entity.Opcion;
import com.bydan.erp.seguridad.business.entity.Usuario;
import com.bydan.erp.seguridad.business.entity.ResumenUsuario;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralSg;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralUsuario;

import com.bydan.erp.seguridad.util.SistemaParameterReturnGeneral;



import com.bydan.erp.activosfijos.business.entity.*;
import com.bydan.erp.activosfijos.util.TipoGrupoActivoFijoConstantesFunciones;

import com.bydan.erp.activosfijos.business.logic.*;
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
public class TipoGrupoActivoFijoDetalleFormJInternalFrame extends TipoGrupoActivoFijoBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	
	
	public JToolBar jTtoolBarDetalleTipoGrupoActivoFijo;
	
	protected JMenuBar jmenuBarDetalleTipoGrupoActivoFijo;
	
	protected JMenu jmenuDetalleTipoGrupoActivoFijo;
	protected JMenu jmenuDetalleArchivoTipoGrupoActivoFijo;
	protected JMenu jmenuDetalleAccionesTipoGrupoActivoFijo;
	protected JMenu jmenuDetalleDatosTipoGrupoActivoFijo;
	
	
	
	protected JPanel jContentPane = null;
	protected JPanel jContentPaneDetalleTipoGrupoActivoFijo = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutTipoGrupoActivoFijo;	
	protected GridBagConstraints gridBagConstraintsTipoGrupoActivoFijo;	
		
	//protected JInternalFrameBase jInternalFrameParent; //ESTA EN BASE
	//protected TipoGrupoActivoFijoBeanSwingJInternalFrameAdditional jInternalFrameDetalleTipoGrupoActivoFijo;		
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected PaisBeanSwingJInternalFrame paisBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_pais="";
	
	public TipoGrupoActivoFijoSessionBean tipogrupoactivofijoSessionBean;
	
	
	
	
	public PaisSessionBean paisSessionBean;	
	
	public TipoGrupoActivoFijoLogic tipogrupoactivofijoLogic;
	
	public JScrollPane jScrollPanelDatosTipoGrupoActivoFijo;
	public JScrollPane jScrollPanelDatosEdicionTipoGrupoActivoFijo;
	public JScrollPane jScrollPanelDatosGeneralTipoGrupoActivoFijo;
	
	protected JPanel jPanelCamposTipoGrupoActivoFijo;    
	protected JPanel jPanelCamposOcultosTipoGrupoActivoFijo;    	
	protected JPanel jPanelAccionesTipoGrupoActivoFijo;
	protected JPanel jPanelAccionesFormularioTipoGrupoActivoFijo;
    
	
	
	protected Integer iXPanelCamposTipoGrupoActivoFijo=0;
	protected Integer iYPanelCamposTipoGrupoActivoFijo=0;
	
	protected Integer iXPanelCamposOcultosTipoGrupoActivoFijo=0;
	protected Integer iYPanelCamposOcultosTipoGrupoActivoFijo=0;
	
	;
	;
	
		
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	public JButton jButtonNuevoTipoGrupoActivoFijo;
	public JButton jButtonModificarTipoGrupoActivoFijo;
	public JButton jButtonActualizarTipoGrupoActivoFijo;
    public JButton jButtonEliminarTipoGrupoActivoFijo;
	public JButton jButtonCancelarTipoGrupoActivoFijo;
    public JButton jButtonGuardarCambiosTipoGrupoActivoFijo;
	public JButton jButtonGuardarCambiosTablaTipoGrupoActivoFijo;
	protected JButton jButtonCerrarTipoGrupoActivoFijo;
	
	
	protected JButton jButtonProcesarInformacionTipoGrupoActivoFijo;
	
	
	protected JCheckBox jCheckBoxPostAccionNuevoTipoGrupoActivoFijo;
	protected JCheckBox jCheckBoxPostAccionSinCerrarTipoGrupoActivoFijo;
	protected JCheckBox jCheckBoxPostAccionSinMensajeTipoGrupoActivoFijo;
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarTipoGrupoActivoFijo;
	protected JButton jButtonModificarToolBarTipoGrupoActivoFijo;
	protected JButton jButtonActualizarToolBarTipoGrupoActivoFijo;
    protected JButton jButtonEliminarToolBarTipoGrupoActivoFijo;
	protected JButton jButtonCancelarToolBarTipoGrupoActivoFijo;
    protected JButton jButtonGuardarCambiosToolBarTipoGrupoActivoFijo;
	protected JButton jButtonGuardarCambiosTablaToolBarTipoGrupoActivoFijo;
	protected JButton jButtonMostrarOcultarTablaToolBarTipoGrupoActivoFijo;
	protected JButton jButtonCerrarToolBarTipoGrupoActivoFijo;
	
	protected JButton jButtonProcesarInformacionToolBarTipoGrupoActivoFijo;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoTipoGrupoActivoFijo;
	protected JMenuItem jMenuItemModificarTipoGrupoActivoFijo;
	protected JMenuItem jMenuItemActualizarTipoGrupoActivoFijo;
    protected JMenuItem jMenuItemEliminarTipoGrupoActivoFijo;
	protected JMenuItem jMenuItemCancelarTipoGrupoActivoFijo;
    protected JMenuItem jMenuItemGuardarCambiosTipoGrupoActivoFijo;
	protected JMenuItem jMenuItemGuardarCambiosTablaTipoGrupoActivoFijo;
	protected JMenuItem jMenuItemCerrarTipoGrupoActivoFijo;
	protected JMenuItem jMenuItemDetalleCerrarTipoGrupoActivoFijo;
	protected JMenuItem jMenuItemDetalleMostarOcultarTipoGrupoActivoFijo;
	
	protected JMenuItem jMenuItemProcesarInformacionTipoGrupoActivoFijo;
	protected JMenuItem jMenuItemNuevoGuardarCambiosTipoGrupoActivoFijo;
	protected JMenuItem jMenuItemMostrarOcultarTipoGrupoActivoFijo;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesTipoGrupoActivoFijo;	
		
	
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesTipoGrupoActivoFijo;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesTipoGrupoActivoFijo;
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxTiposAccionesFormularioTipoGrupoActivoFijo;
	
		
	
	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	public JPanel jPanelidTipoGrupoActivoFijo;
	public JLabel jLabelIdTipoGrupoActivoFijo;
	public JTextFieldMe jTextFieldidTipoGrupoActivoFijo;
	public JButton jButtonidTipoGrupoActivoFijoBusqueda= new JButtonMe();

	public JPanel jPanelnombreTipoGrupoActivoFijo;
	public JLabel jLabelnombreTipoGrupoActivoFijo;
	public JTextArea jTextAreanombreTipoGrupoActivoFijo;
	public JScrollPane jscrollPanenombreTipoGrupoActivoFijo;
	public JButton jButtonnombreTipoGrupoActivoFijoBusqueda= new JButtonMe();

	
	public JPanel jPanelid_paisTipoGrupoActivoFijo;
	public JLabel jLabelid_paisTipoGrupoActivoFijo;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_paisTipoGrupoActivoFijo;
	public JButton jButtonid_paisTipoGrupoActivoFijo= new JButtonMe();
	public JButton jButtonid_paisTipoGrupoActivoFijoUpdate= new JButtonMe();
	public JButton jButtonid_paisTipoGrupoActivoFijoBusqueda= new JButtonMe();

	
	
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JTabbedPane jTabbedPaneRelacionesTipoGrupoActivoFijo;
	
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
	public int iHeightFormulario=330;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
				
	public int iHeightFormularioMaximo=0;
	public int iWidthFormularioMaximo=0;
	public int iWidthTableDefinicion=0;
	
	public double dStart = 0; 
	public double dEnd = 0; 
	public double dDif = 0; 
			
	public SistemaParameterReturnGeneral sistemaReturnGeneral;
	public List<Opcion> opcionsRelacionadas=new ArrayList<Opcion>();
	
	public TipoGrupoActivoFijoDetalleFormJInternalFrame(String sTipo) throws Exception {
		super(PaginaTipo.FORMULARIO);
       
		try {
			
	  		if(sTipo.equals("MINIMO")) {
				/*
				this.jPanelCamposTipoGrupoActivoFijo=new JPanel();
				this.jPanelAccionesFormularioTipoGrupoActivoFijo=new JPanel();
				this.jmenuBarDetalleTipoGrupoActivoFijo=new JMenuBar();
				this.jTtoolBarDetalleTipoGrupoActivoFijo=new JToolBar();
				*/
	  		}
	  		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoGrupoActivoFijoDetalleFormJInternalFrame(PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo); 
		
		//super("TipoGrupoActivoFijo No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	//ES AUXILIAR PARA WINDOWS FORMS
	public TipoGrupoActivoFijoDetalleFormJInternalFrame() throws Exception {
		super(PaginaTipo.FORMULARIO);
        //super("TipoGrupoActivoFijo No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoGrupoActivoFijoDetalleFormJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("TipoGrupoActivoFijo No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoGrupoActivoFijoDetalleFormJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("TipoGrupoActivoFijo No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoGrupoActivoFijoDetalleFormJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("TipoGrupoActivoFijo No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	public JButton getjButtonActualizarToolBarTipoGrupoActivoFijo() {
		return this.jButtonActualizarToolBarTipoGrupoActivoFijo;
	}
	
	public JButton getjButtonEliminarToolBarTipoGrupoActivoFijo() {
		return this.jButtonEliminarToolBarTipoGrupoActivoFijo;
	}
	
	public JButton getjButtonCancelarToolBarTipoGrupoActivoFijo() {
		return this.jButtonCancelarToolBarTipoGrupoActivoFijo;
	}		
	
	public JButton getjButtonProcesarInformacionTipoGrupoActivoFijo() {
		return this.jButtonProcesarInformacionTipoGrupoActivoFijo;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionTipoGrupoActivoFijo)	{
		this.jButtonProcesarInformacionTipoGrupoActivoFijo = jButtonProcesarInformacionTipoGrupoActivoFijo;
	}
	
	
	

	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesTipoGrupoActivoFijo() {
		return this.jComboBoxTiposAccionesTipoGrupoActivoFijo;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesTipoGrupoActivoFijo(
			JComboBox jComboBoxTiposRelacionesTipoGrupoActivoFijo) {
		this.jComboBoxTiposRelacionesTipoGrupoActivoFijo = jComboBoxTiposRelacionesTipoGrupoActivoFijo;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesTipoGrupoActivoFijo(
			JComboBox jComboBoxTiposAccionesTipoGrupoActivoFijo) {
		this.jComboBoxTiposAccionesTipoGrupoActivoFijo = jComboBoxTiposAccionesTipoGrupoActivoFijo;
	}		
	
			
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesFormularioTipoGrupoActivoFijo() {
		return this.jComboBoxTiposAccionesFormularioTipoGrupoActivoFijo;
	}				
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesFormularioTipoGrupoActivoFijo(
			JComboBox jComboBoxTiposAccionesFormularioTipoGrupoActivoFijo) {
		this.jComboBoxTiposAccionesFormularioTipoGrupoActivoFijo = jComboBoxTiposAccionesFormularioTipoGrupoActivoFijo;
	}
	
	private void initialize(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		this.tipogrupoactivofijoSessionBean=new TipoGrupoActivoFijoSessionBean();
		
		this.tipogrupoactivofijoSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.tipogrupoactivofijoSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.tipogrupoactivofijoSessionBean.getEsGuardarRelacionado();				
		
		this.conMostrarAccionesCampo=parametroGeneralUsuario.getcon_mostrar_acciones_campo_general() || opcionActual.getcon_mostrar_acciones_campo();
		
		
		if(!this.conCargarMinimo) {
		
		}
		
			
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		TipoGrupoActivoFijoJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		TipoGrupoActivoFijoJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		TipoGrupoActivoFijoJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Tipo Grupo Activo Fijo MANTENIMIENTO"));
		
		
		if(iWidth > 650) {
			iWidth=650;
		}
		
		if(iHeight > 660) {
			iHeight=660;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
		
		if(!this.tipogrupoactivofijoSessionBean.getEsGuardarRelacionado()) {
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
	
		TipoGrupoActivoFijoJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarDetalleTipoGrupoActivoFijo= new JToolBar("MENU DATOS");		
		
		//TOOLBAR
		//PRINCIPAL				
				this.jButtonProcesarInformacionToolBarTipoGrupoActivoFijo=new JButtonMe();
				this.jButtonModificarToolBarTipoGrupoActivoFijo=new JButtonMe();							
		//PRINCIPAL
		
		//DETALLE
		this.jButtonActualizarToolBarTipoGrupoActivoFijo=FuncionesSwing.getButtonToolBarGeneral(this.jButtonActualizarToolBarTipoGrupoActivoFijo,this.jTtoolBarDetalleTipoGrupoActivoFijo,
							"actualizar","actualizar","Actualizar"+" "+TipoGrupoActivoFijoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"),"Actualizar",false);
		
		
		
		
		this.jButtonEliminarToolBarTipoGrupoActivoFijo=FuncionesSwing.getButtonToolBarGeneral(this.jButtonEliminarToolBarTipoGrupoActivoFijo,this.jTtoolBarDetalleTipoGrupoActivoFijo,
							"eliminar","eliminar","Eliminar"+" "+TipoGrupoActivoFijoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"),"Eliminar",false);
		
		
		
		
		this.jButtonCancelarToolBarTipoGrupoActivoFijo=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCancelarToolBarTipoGrupoActivoFijo,this.jTtoolBarDetalleTipoGrupoActivoFijo,
							"cancelar","cancelar","Cancelar"+" "+TipoGrupoActivoFijoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"),"Cancelar",false);
		
		
		
		
		this.jButtonGuardarCambiosToolBarTipoGrupoActivoFijo=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosToolBarTipoGrupoActivoFijo,this.jTtoolBarDetalleTipoGrupoActivoFijo,
							"guardarcambios","guardarcambios","Guardar"+" "+TipoGrupoActivoFijoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		
		FuncionesSwing.setBoldButtonToolBar(this.jButtonActualizarToolBarTipoGrupoActivoFijo,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonEliminarToolBarTipoGrupoActivoFijo,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonCancelarToolBarTipoGrupoActivoFijo,STIPO_TAMANIO_GENERAL,false,false,this);
	}
	
	
	
	public void cargarMenus() {		
		
		this.jmenuBarDetalleTipoGrupoActivoFijo=new JMenuBarMe();
		
		//DETALLE
		this.jmenuDetalleTipoGrupoActivoFijo=new JMenuMe("Datos Relacionados");
		this.jmenuDetalleArchivoTipoGrupoActivoFijo=new JMenuMe("Archivo");
		this.jmenuDetalleAccionesTipoGrupoActivoFijo=new JMenuMe("Acciones");
		this.jmenuDetalleDatosTipoGrupoActivoFijo=new JMenuMe("Datos");
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoTipoGrupoActivoFijo= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoTipoGrupoActivoFijo.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoTipoGrupoActivoFijo,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoTipoGrupoActivoFijo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemModificarTipoGrupoActivoFijo= new JMenuItem("Editar" + FuncionesSwing.getKeyMensaje("MODIFICAR"));
		this.jMenuItemModificarTipoGrupoActivoFijo.setActionCommand("Editar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemModificarTipoGrupoActivoFijo,"modificar_button","Editar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemModificarTipoGrupoActivoFijo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemActualizarTipoGrupoActivoFijo= new JMenuItem("Actualizar" + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
		this.jMenuItemActualizarTipoGrupoActivoFijo.setActionCommand("Actualizar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemActualizarTipoGrupoActivoFijo,"actualizar_button","Actualizar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemActualizarTipoGrupoActivoFijo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemEliminarTipoGrupoActivoFijo= new JMenuItem("Eliminar" + FuncionesSwing.getKeyMensaje("ELIMINAR"));
		this.jMenuItemEliminarTipoGrupoActivoFijo.setActionCommand("Eliminar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemEliminarTipoGrupoActivoFijo,"eliminar_button","Eliminar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemEliminarTipoGrupoActivoFijo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCancelarTipoGrupoActivoFijo= new JMenuItem("Cancelar" + FuncionesSwing.getKeyMensaje("CANCELAR"));
		this.jMenuItemCancelarTipoGrupoActivoFijo.setActionCommand("Cancelar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCancelarTipoGrupoActivoFijo,"cancelar_button","Cancelar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCancelarTipoGrupoActivoFijo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosTipoGrupoActivoFijo= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTipoGrupoActivoFijo.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTipoGrupoActivoFijo,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTipoGrupoActivoFijo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarTipoGrupoActivoFijo= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarTipoGrupoActivoFijo.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarTipoGrupoActivoFijo,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarTipoGrupoActivoFijo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleCerrarTipoGrupoActivoFijo= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemDetalleCerrarTipoGrupoActivoFijo.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleCerrarTipoGrupoActivoFijo,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleCerrarTipoGrupoActivoFijo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarTipoGrupoActivoFijo= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarTipoGrupoActivoFijo.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarTipoGrupoActivoFijo,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarTipoGrupoActivoFijo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarTipoGrupoActivoFijo= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarTipoGrupoActivoFijo.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarTipoGrupoActivoFijo,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarTipoGrupoActivoFijo, STIPO_TAMANIO_GENERAL,false,true,this);			
		
		//DETALLE
		this.jmenuDetalleArchivoTipoGrupoActivoFijo.add(this.jMenuItemDetalleCerrarTipoGrupoActivoFijo);
		
		this.jmenuDetalleAccionesTipoGrupoActivoFijo.add(this.jMenuItemActualizarTipoGrupoActivoFijo);
		this.jmenuDetalleAccionesTipoGrupoActivoFijo.add(this.jMenuItemEliminarTipoGrupoActivoFijo);
		this.jmenuDetalleAccionesTipoGrupoActivoFijo.add(this.jMenuItemCancelarTipoGrupoActivoFijo);		
		
		//this.jmenuDetalleDatosTipoGrupoActivoFijo.add(this.jMenuItemDetalleAbrirOrderByTipoGrupoActivoFijo);				
		this.jmenuDetalleDatosTipoGrupoActivoFijo.add(this.jMenuItemDetalleMostarOcultarTipoGrupoActivoFijo);				
				
		//this.jmenuDetalleAccionesTipoGrupoActivoFijo.add(this.jMenuItemGuardarCambiosTipoGrupoActivoFijo);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES				
		
		//DETALLE
		FuncionesSwing.setBoldMenu(this.jmenuDetalleArchivoTipoGrupoActivoFijo, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleAccionesTipoGrupoActivoFijo, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleDatosTipoGrupoActivoFijo, STIPO_TAMANIO_GENERAL,false,true,this);
			
		this.jmenuBarDetalleTipoGrupoActivoFijo.add(this.jmenuDetalleArchivoTipoGrupoActivoFijo);		
		this.jmenuBarDetalleTipoGrupoActivoFijo.add(this.jmenuDetalleAccionesTipoGrupoActivoFijo);		
		this.jmenuBarDetalleTipoGrupoActivoFijo.add(this.jmenuDetalleDatosTipoGrupoActivoFijo);		
		
		//DETALLE_FIN
		
		
		//AGREGA MENU DETALLE A PANTALLA
		this.setJMenuBar(this.jmenuBarDetalleTipoGrupoActivoFijo);				
	}
	
	
	public void inicializarElementosCamposTipoGrupoActivoFijo() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		jLabelIdTipoGrupoActivoFijo = new JLabelMe();
		jLabelIdTipoGrupoActivoFijo.setText(""+Constantes2.S_CODIGO_UNICO+"");
		jLabelIdTipoGrupoActivoFijo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdTipoGrupoActivoFijo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdTipoGrupoActivoFijo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelIdTipoGrupoActivoFijo,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jPanelidTipoGrupoActivoFijo = new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelidTipoGrupoActivoFijo.setToolTipText(TipoGrupoActivoFijoConstantesFunciones.LABEL_ID);
		this.gridaBagLayoutTipoGrupoActivoFijo= new GridBagLayout();

		this.jPanelidTipoGrupoActivoFijo.setLayout(this.gridaBagLayoutTipoGrupoActivoFijo);

		jTextFieldidTipoGrupoActivoFijo = new JTextFieldMe();
		jTextFieldidTipoGrupoActivoFijo.setText("Id");

		jTextFieldidTipoGrupoActivoFijo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jTextFieldidTipoGrupoActivoFijo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jTextFieldidTipoGrupoActivoFijo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));



					
		this.jLabelnombreTipoGrupoActivoFijo = new JLabelMe();
		this.jLabelnombreTipoGrupoActivoFijo.setText(""+TipoGrupoActivoFijoConstantesFunciones.LABEL_NOMBRE+" : *");
		this.jLabelnombreTipoGrupoActivoFijo.setToolTipText("Nombre");
		this.jLabelnombreTipoGrupoActivoFijo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnombreTipoGrupoActivoFijo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnombreTipoGrupoActivoFijo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelnombreTipoGrupoActivoFijo,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelnombreTipoGrupoActivoFijo=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelnombreTipoGrupoActivoFijo.setToolTipText(TipoGrupoActivoFijoConstantesFunciones.LABEL_NOMBRE);
		this.gridaBagLayoutTipoGrupoActivoFijo = new GridBagLayout();
		this.jPanelnombreTipoGrupoActivoFijo.setLayout(this.gridaBagLayoutTipoGrupoActivoFijo);


		jTextAreanombreTipoGrupoActivoFijo= new JTextAreaMe();
		jTextAreanombreTipoGrupoActivoFijo.setEnabled(false);
		jTextAreanombreTipoGrupoActivoFijo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreTipoGrupoActivoFijo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreTipoGrupoActivoFijo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreTipoGrupoActivoFijo.setLineWrap(true);
		jTextAreanombreTipoGrupoActivoFijo.setWrapStyleWord(true);
		jTextAreanombreTipoGrupoActivoFijo.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreanombreTipoGrupoActivoFijo.setRows(4);

		FuncionesSwing.setBoldTextArea(jTextAreanombreTipoGrupoActivoFijo,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPanenombreTipoGrupoActivoFijo = new JScrollPane(jTextAreanombreTipoGrupoActivoFijo);
		jscrollPanenombreTipoGrupoActivoFijo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanenombreTipoGrupoActivoFijo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanenombreTipoGrupoActivoFijo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));

		this.jButtonnombreTipoGrupoActivoFijoBusqueda= new JButtonMe();
		this.jButtonnombreTipoGrupoActivoFijoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombreTipoGrupoActivoFijoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombreTipoGrupoActivoFijoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonnombreTipoGrupoActivoFijoBusqueda.setText("U");
		this.jButtonnombreTipoGrupoActivoFijoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonnombreTipoGrupoActivoFijoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonnombreTipoGrupoActivoFijoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreanombreTipoGrupoActivoFijo.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreanombreTipoGrupoActivoFijo.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"nombreTipoGrupoActivoFijoBusqueda"));

		if(this.tipogrupoactivofijoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonnombreTipoGrupoActivoFijoBusqueda.setVisible(false);		}


	}
	
	public void inicializarElementosCamposForeigKeysTipoGrupoActivoFijo() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		this.jLabelid_paisTipoGrupoActivoFijo = new JLabelMe();
		this.jLabelid_paisTipoGrupoActivoFijo.setText(""+TipoGrupoActivoFijoConstantesFunciones.LABEL_IDPAIS+" : *");
		this.jLabelid_paisTipoGrupoActivoFijo.setToolTipText("Pais");
		this.jLabelid_paisTipoGrupoActivoFijo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_paisTipoGrupoActivoFijo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_paisTipoGrupoActivoFijo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_paisTipoGrupoActivoFijo,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_paisTipoGrupoActivoFijo=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_paisTipoGrupoActivoFijo.setToolTipText(TipoGrupoActivoFijoConstantesFunciones.LABEL_IDPAIS);
		this.gridaBagLayoutTipoGrupoActivoFijo = new GridBagLayout();
		this.jPanelid_paisTipoGrupoActivoFijo.setLayout(this.gridaBagLayoutTipoGrupoActivoFijo);


		jComboBoxid_paisTipoGrupoActivoFijo= new JComboBoxMe();
		jComboBoxid_paisTipoGrupoActivoFijo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_paisTipoGrupoActivoFijo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_paisTipoGrupoActivoFijo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_paisTipoGrupoActivoFijo,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_paisTipoGrupoActivoFijo= new JButtonMe();
		this.jButtonid_paisTipoGrupoActivoFijo.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_paisTipoGrupoActivoFijo.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_paisTipoGrupoActivoFijo.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_paisTipoGrupoActivoFijo.setText("Buscar");
		this.jButtonid_paisTipoGrupoActivoFijo.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_paisTipoGrupoActivoFijo.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_paisTipoGrupoActivoFijo,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_paisTipoGrupoActivoFijo.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_paisTipoGrupoActivoFijo.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_paisTipoGrupoActivoFijo"));

		this.jButtonid_paisTipoGrupoActivoFijoBusqueda= new JButtonMe();
		this.jButtonid_paisTipoGrupoActivoFijoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_paisTipoGrupoActivoFijoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_paisTipoGrupoActivoFijoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_paisTipoGrupoActivoFijoBusqueda.setText("U");
		this.jButtonid_paisTipoGrupoActivoFijoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_paisTipoGrupoActivoFijoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_paisTipoGrupoActivoFijoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_paisTipoGrupoActivoFijo.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_paisTipoGrupoActivoFijo.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_paisTipoGrupoActivoFijoBusqueda"));

		if(this.tipogrupoactivofijoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_paisTipoGrupoActivoFijoBusqueda.setVisible(false);		}

		this.jButtonid_paisTipoGrupoActivoFijoUpdate= new JButtonMe();
		this.jButtonid_paisTipoGrupoActivoFijoUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_paisTipoGrupoActivoFijoUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_paisTipoGrupoActivoFijoUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_paisTipoGrupoActivoFijoUpdate.setText("U");
		this.jButtonid_paisTipoGrupoActivoFijoUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_paisTipoGrupoActivoFijoUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_paisTipoGrupoActivoFijoUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_paisTipoGrupoActivoFijo.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_paisTipoGrupoActivoFijo.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_paisTipoGrupoActivoFijoUpdate"));



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
		//this.jInternalFrameDetalleTipoGrupoActivoFijo = new TipoGrupoActivoFijoBeanSwingJInternalFrameAdditional(paginaTipo);//JInternalFrameBase("Tipo Grupo Activo Fijo DATOS");
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutTipoGrupoActivoFijo= new GridBagLayout();
		

		
		String sToolTipTipoGrupoActivoFijo="";
		sToolTipTipoGrupoActivoFijo=TipoGrupoActivoFijoConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipTipoGrupoActivoFijo+="(ActivosFijos.TipoGrupoActivoFijo)";
		}
		
		if(!this.tipogrupoactivofijoSessionBean.getEsGuardarRelacionado()) {
			sToolTipTipoGrupoActivoFijo+="_"+this.opcionActual.getId();
		}
								
		
		this.jButtonNuevoTipoGrupoActivoFijo = new JButtonMe();
		this.jButtonModificarTipoGrupoActivoFijo = new JButtonMe();
        this.jButtonActualizarTipoGrupoActivoFijo = new JButtonMe();
        this.jButtonEliminarTipoGrupoActivoFijo = new JButtonMe();
        this.jButtonCancelarTipoGrupoActivoFijo = new JButtonMe();
        this.jButtonGuardarCambiosTipoGrupoActivoFijo = new JButtonMe();
		this.jButtonGuardarCambiosTablaTipoGrupoActivoFijo = new JButtonMe();
		this.jButtonCerrarTipoGrupoActivoFijo = new JButtonMe();
		
		this.jScrollPanelDatosTipoGrupoActivoFijo = new JScrollPane();   
        this.jScrollPanelDatosEdicionTipoGrupoActivoFijo = new JScrollPane();
		this.jScrollPanelDatosGeneralTipoGrupoActivoFijo = new JScrollPane();
				
		
		
		this.jPanelCamposTipoGrupoActivoFijo = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelCamposOcultosTipoGrupoActivoFijo = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
        this.jPanelAccionesTipoGrupoActivoFijo = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		this.jPanelAccionesFormularioTipoGrupoActivoFijo = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		this.sPath=" <---> Acceso: Tipo Grupo Activo Fijo";
		
		if(!this.tipogrupoactivofijoSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosTipoGrupoActivoFijo.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Tipo Grupo Activo Fijos" + this.sPath));
		} else {
			this.jScrollPanelDatosTipoGrupoActivoFijo.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosEdicionTipoGrupoActivoFijo.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		this.jScrollPanelDatosGeneralTipoGrupoActivoFijo.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
			
        this.jPanelCamposTipoGrupoActivoFijo.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
        this.jPanelCamposTipoGrupoActivoFijo.setName("jPanelCamposTipoGrupoActivoFijo"); 

		this.jPanelCamposOcultosTipoGrupoActivoFijo.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos Ocultos"));
        this.jPanelCamposOcultosTipoGrupoActivoFijo.setName("jPanelCamposOcultosTipoGrupoActivoFijo"); 

        this.jPanelAccionesTipoGrupoActivoFijo.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesTipoGrupoActivoFijo.setToolTipText("Acciones");
        this.jPanelAccionesTipoGrupoActivoFijo.setName("Acciones"); 

		this.jPanelAccionesFormularioTipoGrupoActivoFijo.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones Extra/Post"));
        this.jPanelAccionesFormularioTipoGrupoActivoFijo.setToolTipText("Acciones");
        this.jPanelAccionesFormularioTipoGrupoActivoFijo.setName("Acciones"); 
		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosEdicionTipoGrupoActivoFijo, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralTipoGrupoActivoFijo, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosTipoGrupoActivoFijo, STIPO_TAMANIO_GENERAL,false,false,this);		
		FuncionesSwing.setBoldPanel(this.jPanelCamposTipoGrupoActivoFijo, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelCamposOcultosTipoGrupoActivoFijo, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelAccionesFormularioTipoGrupoActivoFijo, STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {
		
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		
        this.jButtonNuevoTipoGrupoActivoFijo.setText("Nuevo");
		this.jButtonModificarTipoGrupoActivoFijo.setText("Editar");
        this.jButtonActualizarTipoGrupoActivoFijo.setText("Actualizar");
        this.jButtonEliminarTipoGrupoActivoFijo.setText("Eliminar");
        this.jButtonCancelarTipoGrupoActivoFijo.setText("Cancelar");
        this.jButtonGuardarCambiosTipoGrupoActivoFijo.setText("Guardar");
		this.jButtonGuardarCambiosTablaTipoGrupoActivoFijo.setText("Guardar");
		this.jButtonCerrarTipoGrupoActivoFijo.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoTipoGrupoActivoFijo,"nuevo_button","Nuevo",this.tipogrupoactivofijoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonModificarTipoGrupoActivoFijo,"modificar_button","Editar",this.tipogrupoactivofijoSessionBean.getEsGuardarRelacionado());
       	FuncionesSwing.addImagenButtonGeneral(this.jButtonActualizarTipoGrupoActivoFijo,"actualizar_button","Actualizar",this.tipogrupoactivofijoSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonEliminarTipoGrupoActivoFijo,"eliminar_button","Eliminar",this.tipogrupoactivofijoSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonCancelarTipoGrupoActivoFijo,"cancelar_button","Cancelar",this.tipogrupoactivofijoSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTipoGrupoActivoFijo,"guardarcambios_button","Guardar",this.tipogrupoactivofijoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaTipoGrupoActivoFijo,"guardarcambiostabla_button","Guardar",this.tipogrupoactivofijoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarTipoGrupoActivoFijo,"cerrar_button","Salir",this.tipogrupoactivofijoSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoTipoGrupoActivoFijo, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonModificarTipoGrupoActivoFijo, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTipoGrupoActivoFijo, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaTipoGrupoActivoFijo, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarTipoGrupoActivoFijo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		FuncionesSwing.setBoldButton(this.jButtonActualizarTipoGrupoActivoFijo, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonEliminarTipoGrupoActivoFijo, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonCancelarTipoGrupoActivoFijo, STIPO_TAMANIO_GENERAL,false,false,this);
		
		this.jButtonNuevoTipoGrupoActivoFijo.setToolTipText("Nuevo"+" "+TipoGrupoActivoFijoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonModificarTipoGrupoActivoFijo.setToolTipText("Editar"+" "+TipoGrupoActivoFijoConstantesFunciones.SCLASSWEBTITULO+"");// + FuncionesSwing.getKeyMensaje("MODIFICAR"))
        this.jButtonActualizarTipoGrupoActivoFijo.setToolTipText("Actualizar"+" "+TipoGrupoActivoFijoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
        this.jButtonEliminarTipoGrupoActivoFijo.setToolTipText("Eliminar)"+" "+TipoGrupoActivoFijoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"));
        this.jButtonCancelarTipoGrupoActivoFijo.setToolTipText("Cancelar"+" "+TipoGrupoActivoFijoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"));
        this.jButtonGuardarCambiosTipoGrupoActivoFijo.setToolTipText("Guardar"+" "+TipoGrupoActivoFijoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonGuardarCambiosTablaTipoGrupoActivoFijo.setToolTipText("Guardar"+" "+TipoGrupoActivoFijoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarTipoGrupoActivoFijo.setToolTipText("Salir"+" "+TipoGrupoActivoFijoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoTipoGrupoActivoFijo";
		inputMap = this.jButtonNuevoTipoGrupoActivoFijo.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoTipoGrupoActivoFijo.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoTipoGrupoActivoFijo"));
		
		//ACTUALIZAR
		sMapKey = "ActualizarTipoGrupoActivoFijo";
		inputMap = this.jButtonActualizarTipoGrupoActivoFijo.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ACTUALIZAR") , FuncionesSwing.getMaskKey("ACTUALIZAR")), sMapKey);
		
		this.jButtonActualizarTipoGrupoActivoFijo.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ActualizarTipoGrupoActivoFijo"));
		
		//ELIMINAR
		sMapKey = "EliminarTipoGrupoActivoFijo";
		inputMap = this.jButtonEliminarTipoGrupoActivoFijo.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ELIMINAR") , FuncionesSwing.getMaskKey("ELIMINAR")), sMapKey);
		
		this.jButtonEliminarTipoGrupoActivoFijo.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"EliminarTipoGrupoActivoFijo"));
		
		//CANCELAR	
		sMapKey = "CancelarTipoGrupoActivoFijo";
		inputMap = this.jButtonCancelarTipoGrupoActivoFijo.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CANCELAR") , FuncionesSwing.getMaskKey("CANCELAR")), sMapKey);
		
		this.jButtonCancelarTipoGrupoActivoFijo.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CancelarTipoGrupoActivoFijo"));
		
		//CERRAR		
		sMapKey = "CerrarTipoGrupoActivoFijo";
		inputMap = this.jButtonCerrarTipoGrupoActivoFijo.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarTipoGrupoActivoFijo.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarTipoGrupoActivoFijo"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaTipoGrupoActivoFijo";
		inputMap = this.jButtonGuardarCambiosTablaTipoGrupoActivoFijo.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaTipoGrupoActivoFijo.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaTipoGrupoActivoFijo"));
		
		//HOT KEYS
		
		this.jCheckBoxPostAccionNuevoTipoGrupoActivoFijo = new JCheckBoxMe();
		this.jCheckBoxPostAccionNuevoTipoGrupoActivoFijo.setText("Nuevo");
		this.jCheckBoxPostAccionNuevoTipoGrupoActivoFijo.setToolTipText("Nuevo TipoGrupoActivoFijo");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionNuevoTipoGrupoActivoFijo, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinCerrarTipoGrupoActivoFijo = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinCerrarTipoGrupoActivoFijo.setText("Sin Cerrar");
		this.jCheckBoxPostAccionSinCerrarTipoGrupoActivoFijo.setToolTipText("Sin Cerrar Ventana TipoGrupoActivoFijo");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinCerrarTipoGrupoActivoFijo, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinMensajeTipoGrupoActivoFijo = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinMensajeTipoGrupoActivoFijo.setText("Sin Mensaje");
		this.jCheckBoxPostAccionSinMensajeTipoGrupoActivoFijo.setToolTipText("Sin Mensaje Confirmacion");				
				
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinMensajeTipoGrupoActivoFijo, STIPO_TAMANIO_GENERAL,false,false,this);       	
       
				
		
			
			
		this.jComboBoxTiposAccionesTipoGrupoActivoFijo = new JComboBoxMe();
		//this.jComboBoxTiposAccionesTipoGrupoActivoFijo.setText("Accion");
		this.jComboBoxTiposAccionesTipoGrupoActivoFijo.setToolTipText("Tipos de Acciones");
							
		

		this.jComboBoxTiposAccionesFormularioTipoGrupoActivoFijo = new JComboBoxMe();
		//this.jComboBoxTiposAccionesFormularioTipoGrupoActivoFijo.setText("Accion");				
    	this.jComboBoxTiposAccionesFormularioTipoGrupoActivoFijo.setToolTipText("Tipos de Acciones");
	
		this.jLabelAccionesTipoGrupoActivoFijo = new JLabelMe();
		
		this.jLabelAccionesTipoGrupoActivoFijo.setText("Acciones");		
		this.jLabelAccionesTipoGrupoActivoFijo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesTipoGrupoActivoFijo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesTipoGrupoActivoFijo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
        //HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		//HOT KEYS2
		
		//ELEMENTOS
		this.inicializarElementosCamposTipoGrupoActivoFijo();
		
		//ELEMENTOS FK
		this.inicializarElementosCamposForeigKeysTipoGrupoActivoFijo();
				
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		this.jTabbedPaneRelacionesTipoGrupoActivoFijo=new JTabbedPane();
		this.jTabbedPaneRelacionesTipoGrupoActivoFijo.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Relacionados"));
		
		//ESTA EN BEAN

		
		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneRelacionesTipoGrupoActivoFijo,STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		int iPosXAccionPaginacion=0;
		
		
		
				
		
		this.jComboBoxTiposAccionesTipoGrupoActivoFijo.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesTipoGrupoActivoFijo.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesTipoGrupoActivoFijo.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesTipoGrupoActivoFijo, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		
		
		this.jComboBoxTiposAccionesFormularioTipoGrupoActivoFijo.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioTipoGrupoActivoFijo.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioTipoGrupoActivoFijo.setPreferredSize(new Dimension(145,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesFormularioTipoGrupoActivoFijo, STIPO_TAMANIO_GENERAL,false,false,this);				
		
		GridBagLayout gridaBagLayoutCamposTipoGrupoActivoFijo = new GridBagLayout();
		GridBagLayout gridaBagLayoutCamposOcultosTipoGrupoActivoFijo = new GridBagLayout();
		
		this.jPanelCamposTipoGrupoActivoFijo.setLayout(gridaBagLayoutCamposTipoGrupoActivoFijo);
		this.jPanelCamposOcultosTipoGrupoActivoFijo.setLayout(gridaBagLayoutCamposOcultosTipoGrupoActivoFijo);
		
		;
		;
		
		
		//SUBPANELES SIMPLES
		//SUBPANELES POR CAMPO
        
	this.gridBagConstraintsTipoGrupoActivoFijo = new GridBagConstraints();
	this.gridBagConstraintsTipoGrupoActivoFijo.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoGrupoActivoFijo.gridy = 0;
	this.gridBagConstraintsTipoGrupoActivoFijo.gridx = 0;
	this.gridBagConstraintsTipoGrupoActivoFijo.ipadx = 0;
	this.gridBagConstraintsTipoGrupoActivoFijo.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelidTipoGrupoActivoFijo.add(jLabelIdTipoGrupoActivoFijo, this.gridBagConstraintsTipoGrupoActivoFijo);



	this.gridBagConstraintsTipoGrupoActivoFijo = new GridBagConstraints();
	this.gridBagConstraintsTipoGrupoActivoFijo.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoGrupoActivoFijo.gridy = 0;
	this.gridBagConstraintsTipoGrupoActivoFijo.gridx = 1;
	this.gridBagConstraintsTipoGrupoActivoFijo.ipadx = 0;
	this.gridBagConstraintsTipoGrupoActivoFijo.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelidTipoGrupoActivoFijo.add(jTextFieldidTipoGrupoActivoFijo, this.gridBagConstraintsTipoGrupoActivoFijo);


	this.gridBagConstraintsTipoGrupoActivoFijo = new GridBagConstraints();
	this.gridBagConstraintsTipoGrupoActivoFijo.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoGrupoActivoFijo.gridy = 0;
	this.gridBagConstraintsTipoGrupoActivoFijo.gridx = 0;
	this.gridBagConstraintsTipoGrupoActivoFijo.ipadx = 0;
	this.gridBagConstraintsTipoGrupoActivoFijo.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_paisTipoGrupoActivoFijo.add(jLabelid_paisTipoGrupoActivoFijo, this.gridBagConstraintsTipoGrupoActivoFijo);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsTipoGrupoActivoFijo = new GridBagConstraints();
		//this.gridBagConstraintsTipoGrupoActivoFijo.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoGrupoActivoFijo.gridy = 0;
		this.gridBagConstraintsTipoGrupoActivoFijo.gridx = 2;
		this.gridBagConstraintsTipoGrupoActivoFijo.ipadx = 0;
		this.gridBagConstraintsTipoGrupoActivoFijo.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_paisTipoGrupoActivoFijo.add(jButtonid_paisTipoGrupoActivoFijoBusqueda, this.gridBagConstraintsTipoGrupoActivoFijo);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsTipoGrupoActivoFijo = new GridBagConstraints();
		//this.gridBagConstraintsTipoGrupoActivoFijo.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoGrupoActivoFijo.gridy = 0;
		this.gridBagConstraintsTipoGrupoActivoFijo.gridx = 3;
		this.gridBagConstraintsTipoGrupoActivoFijo.ipadx = 0;
		this.gridBagConstraintsTipoGrupoActivoFijo.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_paisTipoGrupoActivoFijo.add(jButtonid_paisTipoGrupoActivoFijoUpdate, this.gridBagConstraintsTipoGrupoActivoFijo);
	}

	this.gridBagConstraintsTipoGrupoActivoFijo = new GridBagConstraints();
	this.gridBagConstraintsTipoGrupoActivoFijo.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoGrupoActivoFijo.gridy = 0;
	this.gridBagConstraintsTipoGrupoActivoFijo.gridx = 1;
	this.gridBagConstraintsTipoGrupoActivoFijo.ipadx = 0;
	this.gridBagConstraintsTipoGrupoActivoFijo.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_paisTipoGrupoActivoFijo.add(jComboBoxid_paisTipoGrupoActivoFijo, this.gridBagConstraintsTipoGrupoActivoFijo);


	this.gridBagConstraintsTipoGrupoActivoFijo = new GridBagConstraints();
	this.gridBagConstraintsTipoGrupoActivoFijo.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoGrupoActivoFijo.gridy = 0;
	this.gridBagConstraintsTipoGrupoActivoFijo.gridx = 0;
	this.gridBagConstraintsTipoGrupoActivoFijo.ipadx = 0;
	this.gridBagConstraintsTipoGrupoActivoFijo.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelnombreTipoGrupoActivoFijo.add(jLabelnombreTipoGrupoActivoFijo, this.gridBagConstraintsTipoGrupoActivoFijo);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsTipoGrupoActivoFijo = new GridBagConstraints();
		//this.gridBagConstraintsTipoGrupoActivoFijo.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoGrupoActivoFijo.gridy = 0;
		this.gridBagConstraintsTipoGrupoActivoFijo.gridx = 2;
		this.gridBagConstraintsTipoGrupoActivoFijo.ipadx = 0;
		this.gridBagConstraintsTipoGrupoActivoFijo.insets = new Insets(0, 0, 0, 0);
		this.jPanelnombreTipoGrupoActivoFijo.add(jButtonnombreTipoGrupoActivoFijoBusqueda, this.gridBagConstraintsTipoGrupoActivoFijo);
	}

	this.gridBagConstraintsTipoGrupoActivoFijo = new GridBagConstraints();
	this.gridBagConstraintsTipoGrupoActivoFijo.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoGrupoActivoFijo.gridy = 0;
	this.gridBagConstraintsTipoGrupoActivoFijo.gridx = 1;
	this.gridBagConstraintsTipoGrupoActivoFijo.ipadx = 0;
	this.gridBagConstraintsTipoGrupoActivoFijo.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelnombreTipoGrupoActivoFijo.add(jscrollPanenombreTipoGrupoActivoFijo, this.gridBagConstraintsTipoGrupoActivoFijo);


		//SUBPANELES SIMPLES
		
		//SUBPANELES EN PANEL
		//SUBPANELES EN PANEL CAMPOS NORMAL				
		
	this.gridBagConstraintsTipoGrupoActivoFijo = new GridBagConstraints();
	this.gridBagConstraintsTipoGrupoActivoFijo.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsTipoGrupoActivoFijo.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsTipoGrupoActivoFijo.gridy = iYPanelCamposTipoGrupoActivoFijo;
	this.gridBagConstraintsTipoGrupoActivoFijo.gridx = iXPanelCamposTipoGrupoActivoFijo++;
	this.gridBagConstraintsTipoGrupoActivoFijo.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsTipoGrupoActivoFijo.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposTipoGrupoActivoFijo.add(this.jPanelidTipoGrupoActivoFijo, this.gridBagConstraintsTipoGrupoActivoFijo);



	if(iXPanelCamposTipoGrupoActivoFijo % 1==0) {
		iXPanelCamposTipoGrupoActivoFijo=0;
		iYPanelCamposTipoGrupoActivoFijo++;
	}
	this.gridBagConstraintsTipoGrupoActivoFijo = new GridBagConstraints();
	this.gridBagConstraintsTipoGrupoActivoFijo.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsTipoGrupoActivoFijo.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsTipoGrupoActivoFijo.gridy = iYPanelCamposTipoGrupoActivoFijo;
	this.gridBagConstraintsTipoGrupoActivoFijo.gridx = iXPanelCamposTipoGrupoActivoFijo++;
	this.gridBagConstraintsTipoGrupoActivoFijo.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsTipoGrupoActivoFijo.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposTipoGrupoActivoFijo.add(this.jPanelid_paisTipoGrupoActivoFijo, this.gridBagConstraintsTipoGrupoActivoFijo);



	if(iXPanelCamposTipoGrupoActivoFijo % 1==0) {
		iXPanelCamposTipoGrupoActivoFijo=0;
		iYPanelCamposTipoGrupoActivoFijo++;
	}
	this.gridBagConstraintsTipoGrupoActivoFijo = new GridBagConstraints();
	this.gridBagConstraintsTipoGrupoActivoFijo.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsTipoGrupoActivoFijo.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsTipoGrupoActivoFijo.gridy = iYPanelCamposTipoGrupoActivoFijo;
	this.gridBagConstraintsTipoGrupoActivoFijo.gridx = iXPanelCamposTipoGrupoActivoFijo++;
	this.gridBagConstraintsTipoGrupoActivoFijo.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsTipoGrupoActivoFijo.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposTipoGrupoActivoFijo.add(this.jPanelnombreTipoGrupoActivoFijo, this.gridBagConstraintsTipoGrupoActivoFijo);



	if(iXPanelCamposTipoGrupoActivoFijo % 1==0) {
		iXPanelCamposTipoGrupoActivoFijo=0;
		iYPanelCamposTipoGrupoActivoFijo++;
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
			
		GridBagLayout gridaBagLayoutAccionesTipoGrupoActivoFijo= new GridBagLayout();
		this.jPanelAccionesTipoGrupoActivoFijo.setLayout(gridaBagLayoutAccionesTipoGrupoActivoFijo);
		
		GridBagLayout gridaBagLayoutAccionesFormularioTipoGrupoActivoFijo= new GridBagLayout();
		this.jPanelAccionesFormularioTipoGrupoActivoFijo.setLayout(gridaBagLayoutAccionesFormularioTipoGrupoActivoFijo);
		
		this.gridBagConstraintsTipoGrupoActivoFijo = new GridBagConstraints();
		this.gridBagConstraintsTipoGrupoActivoFijo.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsTipoGrupoActivoFijo.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioTipoGrupoActivoFijo.add(this.jComboBoxTiposAccionesFormularioTipoGrupoActivoFijo, this.gridBagConstraintsTipoGrupoActivoFijo);

		this.gridBagConstraintsTipoGrupoActivoFijo = new GridBagConstraints();
		this.gridBagConstraintsTipoGrupoActivoFijo.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsTipoGrupoActivoFijo.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioTipoGrupoActivoFijo.add(this.jCheckBoxPostAccionNuevoTipoGrupoActivoFijo, this.gridBagConstraintsTipoGrupoActivoFijo);
			
		//DEBE CERRARSE Y ACTUALIZARSE TODO NUEVAMENTE, SI ES RELACIONADO PUEDE FUNCIONAR
		//if(!this.tipogrupoactivofijoSessionBean.getEstaModoGuardarRelaciones()) {		
		//SE ARRIESGA
		//if(!this.conFuncionalidadRelaciones) {		
			this.gridBagConstraintsTipoGrupoActivoFijo = new GridBagConstraints();
			this.gridBagConstraintsTipoGrupoActivoFijo.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsTipoGrupoActivoFijo.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioTipoGrupoActivoFijo.add(this.jCheckBoxPostAccionSinCerrarTipoGrupoActivoFijo, this.gridBagConstraintsTipoGrupoActivoFijo);
		//}
		
		
		//NO TIENE MENSAJE POR DEFINICION, O ES MUY COMPLEJO LA PANTALLA PARA HACERLO MAS COMPLICADO
		if(!this.tipogrupoactivofijoSessionBean.getEsGuardarRelacionado()
			){				
			//&& !this.tipogrupoactivofijoSessionBean.getEstaModoGuardarRelaciones()) {
							
			this.gridBagConstraintsTipoGrupoActivoFijo = new GridBagConstraints();
			this.gridBagConstraintsTipoGrupoActivoFijo.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsTipoGrupoActivoFijo.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioTipoGrupoActivoFijo.add(this.jCheckBoxPostAccionSinMensajeTipoGrupoActivoFijo, this.gridBagConstraintsTipoGrupoActivoFijo);
		}
		
		
		int iPosXAccion=0;
		
		this.gridBagConstraintsTipoGrupoActivoFijo = new GridBagConstraints();
		this.gridBagConstraintsTipoGrupoActivoFijo.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoGrupoActivoFijo.gridy = 0;
		this.gridBagConstraintsTipoGrupoActivoFijo.gridx = iPosXAccion++;
			
		this.jPanelAccionesTipoGrupoActivoFijo.add(this.jButtonModificarTipoGrupoActivoFijo, this.gridBagConstraintsTipoGrupoActivoFijo);							

		this.gridBagConstraintsTipoGrupoActivoFijo = new GridBagConstraints();
		this.gridBagConstraintsTipoGrupoActivoFijo.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoGrupoActivoFijo.gridy = 0;
		this.gridBagConstraintsTipoGrupoActivoFijo.gridx =iPosXAccion++;
			
		this.jPanelAccionesTipoGrupoActivoFijo.add(this.jButtonEliminarTipoGrupoActivoFijo, this.gridBagConstraintsTipoGrupoActivoFijo);
		
			
		this.gridBagConstraintsTipoGrupoActivoFijo = new GridBagConstraints();
		this.gridBagConstraintsTipoGrupoActivoFijo.gridy = 0;		
		this.gridBagConstraintsTipoGrupoActivoFijo.gridx = iPosXAccion++;
		
		this.jPanelAccionesTipoGrupoActivoFijo.add(this.jButtonActualizarTipoGrupoActivoFijo, this.gridBagConstraintsTipoGrupoActivoFijo);


		this.gridBagConstraintsTipoGrupoActivoFijo = new GridBagConstraints();
		this.gridBagConstraintsTipoGrupoActivoFijo.gridy = 0;		
		this.gridBagConstraintsTipoGrupoActivoFijo.gridx = iPosXAccion++;
		
		this.jPanelAccionesTipoGrupoActivoFijo.add(this.jButtonGuardarCambiosTipoGrupoActivoFijo, this.gridBagConstraintsTipoGrupoActivoFijo);	
		
		this.gridBagConstraintsTipoGrupoActivoFijo = new GridBagConstraints();
		this.gridBagConstraintsTipoGrupoActivoFijo.gridy = 0;		
		this.gridBagConstraintsTipoGrupoActivoFijo.gridx =iPosXAccion++;
		
		this.jPanelAccionesTipoGrupoActivoFijo.add(this.jButtonCancelarTipoGrupoActivoFijo, this.gridBagConstraintsTipoGrupoActivoFijo);
		
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutTipoGrupoActivoFijo = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutTipoGrupoActivoFijo);
		
		if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.tipogrupoactivofijoSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsTipoGrupoActivoFijo = new GridBagConstraints();						
			this.gridBagConstraintsTipoGrupoActivoFijo.gridy = iGridyPrincipal++;
			this.gridBagConstraintsTipoGrupoActivoFijo.gridx = 0;		
			//this.gridBagConstraintsTipoGrupoActivoFijo.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoGrupoActivoFijo.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsTipoGrupoActivoFijo.ipadx = 100;
				
			
		}
		
		//PROCESANDO EN OTRA PANTALLA
		
		
		int iGridxBusquedasParametros=0;
		
	
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			//NO BUSQUEDA
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		
		this.gridBagConstraintsTipoGrupoActivoFijo = new GridBagConstraints();
		this.gridBagConstraintsTipoGrupoActivoFijo.gridy =iGridyPrincipal++;
		this.gridBagConstraintsTipoGrupoActivoFijo.gridx =0;
		this.gridBagConstraintsTipoGrupoActivoFijo.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsTipoGrupoActivoFijo.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosTipoGrupoActivoFijo, this.gridBagConstraintsTipoGrupoActivoFijo);
				
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);

		
			
		//if(TipoGrupoActivoFijoJInternalFrame.CON_DATOS_FRAME) {				
			//this.jInternalFrameDetalleTipoGrupoActivoFijo = new TipoGrupoActivoFijoBeanSwingJInternalFrameAdditional();//JInternalFrameBase("Tipo Grupo Activo Fijo DATOS");
			
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
			
	        //this.setTitle("[FOR] - Tipo Grupo Activo Fijo DATOS");
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Tipo Grupo Activo Fijo Formulario",PaginaTipo.FORMULARIO,paginaTipo));			
	        this.setSize(iWidthFormulario,iHeightFormulario);        
		   				
			this.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	        this.setResizable(true);
	        this.setClosable(true);
	        this.setMaximizable(true);
		    
			TipoGrupoActivoFijoModel tipogrupoactivofijoModel=new TipoGrupoActivoFijoModel(this);
			
			//SI USARA CLASE INTERNA
			//TipoGrupoActivoFijoModel.TipoGrupoActivoFijoFocusTraversalPolicy tipogrupoactivofijoFocusTraversalPolicy = tipogrupoactivofijoModel.new TipoGrupoActivoFijoFocusTraversalPolicy(this);
			
			//tipogrupoactivofijoFocusTraversalPolicy.settipogrupoactivofijoJInternalFrame(this);
			
			this.setFocusTraversalPolicy(tipogrupoactivofijoModel);
			
			
			this.jContentPaneDetalleTipoGrupoActivoFijo = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			GridBagLayout gridaBagLayoutDetalleTipoGrupoActivoFijo = new GridBagLayout();	
			this.jContentPaneDetalleTipoGrupoActivoFijo.setLayout(gridaBagLayoutDetalleTipoGrupoActivoFijo);
			
			GridBagLayout gridaBagLayoutBusquedasParametrosTipoGrupoActivoFijo = new GridBagLayout();
			
			
if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
				
				//AGREGA TOOLBAR DETALLE A PANTALLA
				
				this.gridBagConstraintsTipoGrupoActivoFijo = new GridBagConstraints();
				this.gridBagConstraintsTipoGrupoActivoFijo.gridy = iGridyRelaciones++;		
				this.gridBagConstraintsTipoGrupoActivoFijo.gridx = 0;
					
				
				this.jContentPaneDetalleTipoGrupoActivoFijo.add(jTtoolBarDetalleTipoGrupoActivoFijo, gridBagConstraintsTipoGrupoActivoFijo);								
				
}
			
			this.jScrollPanelDatosEdicionTipoGrupoActivoFijo=   new JScrollPane(jContentPaneDetalleTipoGrupoActivoFijo,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionTipoGrupoActivoFijo.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionTipoGrupoActivoFijo.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionTipoGrupoActivoFijo.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			this.jScrollPanelDatosGeneralTipoGrupoActivoFijo=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralTipoGrupoActivoFijo.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralTipoGrupoActivoFijo.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralTipoGrupoActivoFijo.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsTipoGrupoActivoFijo = new GridBagConstraints();
			
			
	        this.gridBagConstraintsTipoGrupoActivoFijo.gridy = iGridyRelaciones++;		
	        this.gridBagConstraintsTipoGrupoActivoFijo.gridx = 0;
	        
			this.jContentPaneDetalleTipoGrupoActivoFijo.add(jPanelCamposTipoGrupoActivoFijo, gridBagConstraintsTipoGrupoActivoFijo);
			
			
			
			
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
						&& tipogrupoactivofijoSessionBean.getConGuardarRelaciones()
						) {
					//paraCargarPorParte es false por defecto(y ejecuta funcion normal cargando detalle en tab panel), si se utiliza funcionalidad es true y carga tab panel auxiliar temporal
					
					
					if(this.tipogrupoactivofijoSessionBean.getConGuardarRelaciones()) {
						this.gridBagConstraintsTipoGrupoActivoFijo= new GridBagConstraints();
						this.gridBagConstraintsTipoGrupoActivoFijo.gridy = iGridyRelaciones++;
						this.gridBagConstraintsTipoGrupoActivoFijo.gridx = 0;
						this.jContentPaneDetalleTipoGrupoActivoFijo.add(this.jTabbedPaneRelacionesTipoGrupoActivoFijo, this.gridBagConstraintsTipoGrupoActivoFijo);
					}
					
					//RELACIONES OTROS AGRUPADOS
					;
					
					} else {
						//this.jButtonNuevoRelacionesTipoGrupoActivoFijo.setVisible(false);
						
					}
				}
			}
			
			Boolean tieneColumnasOcultas=false;
			
		
						
			
			if(!Constantes.ISDEVELOPING) {
	       		this.jPanelCamposOcultosTipoGrupoActivoFijo.setVisible(false);
			} else {
				if(tieneColumnasOcultas) {
					this.gridBagConstraintsTipoGrupoActivoFijo = new GridBagConstraints();
					this.gridBagConstraintsTipoGrupoActivoFijo.fill=GridBagConstraints.NONE;
					this.gridBagConstraintsTipoGrupoActivoFijo.anchor = GridBagConstraints.WEST;
					
					this.gridBagConstraintsTipoGrupoActivoFijo.gridy = iGridyRelaciones++;		
					this.gridBagConstraintsTipoGrupoActivoFijo.gridx = 0;
					
				
					this.jContentPaneDetalleTipoGrupoActivoFijo.add(jPanelCamposOcultosTipoGrupoActivoFijo, gridBagConstraintsTipoGrupoActivoFijo);
				
					this.jPanelCamposOcultosTipoGrupoActivoFijo.setVisible(true);
				}
			}					
			
			
			
			
			this.gridBagConstraintsTipoGrupoActivoFijo = new GridBagConstraints();
			this.gridBagConstraintsTipoGrupoActivoFijo.gridy = iGridyRelaciones++;//1;		
	        this.gridBagConstraintsTipoGrupoActivoFijo.gridx = 0;
	        this.gridBagConstraintsTipoGrupoActivoFijo.anchor = GridBagConstraints.CENTER;//WEST;
			
			
			
			this.jContentPaneDetalleTipoGrupoActivoFijo.add(this.jPanelAccionesFormularioTipoGrupoActivoFijo, this.gridBagConstraintsTipoGrupoActivoFijo);							
			
			
			
			this.gridBagConstraintsTipoGrupoActivoFijo = new GridBagConstraints();
	        this.gridBagConstraintsTipoGrupoActivoFijo.gridy = iGridyRelaciones;//1;		
	        this.gridBagConstraintsTipoGrupoActivoFijo.gridx = 0;
	        
			
			this.jContentPaneDetalleTipoGrupoActivoFijo.add(this.jPanelAccionesTipoGrupoActivoFijo, this.gridBagConstraintsTipoGrupoActivoFijo);							
			
	        //this.setContentPane(jScrollPanelDatosEdicionTipoGrupoActivoFijo);
			
		//} else {
			//DISENO_DETALLE COMENTAR Y
			//DISENO_DETALLE(Solo Descomentar Seccion Inferior)
			//NOTA-DISENO_DETALLE(Si cambia lo de abajo, cambiar lo comentado, Al final no es lo mismo)
			
			/*
			this.jScrollPanelDatosEdicionTipoGrupoActivoFijo=   new JScrollPane(this.jPanelCamposTipoGrupoActivoFijo,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionTipoGrupoActivoFijo.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionTipoGrupoActivoFijo.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionTipoGrupoActivoFijo.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			
			this.gridBagConstraintsTipoGrupoActivoFijo = new GridBagConstraints();
			this.gridBagConstraintsTipoGrupoActivoFijo.gridy = iGridyPrincipal++;		
			this.gridBagConstraintsTipoGrupoActivoFijo.gridx = 0;
			this.gridBagConstraintsTipoGrupoActivoFijo.fill = GridBagConstraints.BOTH;
			this.gridBagConstraintsTipoGrupoActivoFijo.ipady = this.getSize().height-yOffset*3;
			this.gridBagConstraintsTipoGrupoActivoFijo.anchor = GridBagConstraints.WEST;
			
			this.jContentPane.add(this.jScrollPanelDatosEdicionTipoGrupoActivoFijo, this.gridBagConstraintsTipoGrupoActivoFijo);
			
			//ACCIONES FORMULARIO
			this.gridBagConstraintsTipoGrupoActivoFijo = new GridBagConstraints();
			this.gridBagConstraintsTipoGrupoActivoFijo.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsTipoGrupoActivoFijo.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesFormularioTipoGrupoActivoFijo, this.gridBagConstraintsTipoGrupoActivoFijo);			
			
			this.gridBagConstraintsTipoGrupoActivoFijo = new GridBagConstraints();
			this.gridBagConstraintsTipoGrupoActivoFijo.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsTipoGrupoActivoFijo.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesTipoGrupoActivoFijo, this.gridBagConstraintsTipoGrupoActivoFijo);									
			*/
		//}								
			
		//DISENO_DETALLE-(Descomentar)
		/*
		this.gridBagConstraintsTipoGrupoActivoFijo = new GridBagConstraints();
		this.gridBagConstraintsTipoGrupoActivoFijo.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoGrupoActivoFijo.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposTipoGrupoActivoFijo, this.gridBagConstraintsTipoGrupoActivoFijo);
			
			
		this.gridBagConstraintsTipoGrupoActivoFijo = new GridBagConstraints();
		this.gridBagConstraintsTipoGrupoActivoFijo.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoGrupoActivoFijo.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosTipoGrupoActivoFijo, this.gridBagConstraintsTipoGrupoActivoFijo);
		
			
		this.gridBagConstraintsTipoGrupoActivoFijo = new GridBagConstraints();
		this.gridBagConstraintsTipoGrupoActivoFijo.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsTipoGrupoActivoFijo.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesTipoGrupoActivoFijo, this.gridBagConstraintsTipoGrupoActivoFijo);
		*/
		
			
     	//pack();
		
		
		//return this.jScrollPanelDatosGeneralTipoGrupoActivoFijo;//jContentPane;
		
		return jScrollPanelDatosEdicionTipoGrupoActivoFijo;
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
