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


import com.bydan.erp.seguridad.presentation.swing.jinternalframes.*;
import com.bydan.erp.contabilidad.presentation.swing.jinternalframes.*;

import com.bydan.erp.nomina.presentation.web.jsf.sessionbean.*;//;
import com.bydan.erp.nomina.presentation.swing.jinternalframes.*;
import com.bydan.erp.nomina.presentation.swing.jinternalframes.auxiliar.*;


import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.contabilidad.presentation.web.jsf.sessionbean.*;

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
import com.bydan.erp.nomina.util.TipoGrupoRubroEmpleaConstantesFunciones;

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
public class TipoGrupoRubroEmpleaDetalleFormJInternalFrame extends TipoGrupoRubroEmpleaBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	
	
	public JToolBar jTtoolBarDetalleTipoGrupoRubroEmplea;
	
	protected JMenuBar jmenuBarDetalleTipoGrupoRubroEmplea;
	
	protected JMenu jmenuDetalleTipoGrupoRubroEmplea;
	protected JMenu jmenuDetalleArchivoTipoGrupoRubroEmplea;
	protected JMenu jmenuDetalleAccionesTipoGrupoRubroEmplea;
	protected JMenu jmenuDetalleDatosTipoGrupoRubroEmplea;
	
	
	
	protected JPanel jContentPane = null;
	protected JPanel jContentPaneDetalleTipoGrupoRubroEmplea = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutTipoGrupoRubroEmplea;	
	protected GridBagConstraints gridBagConstraintsTipoGrupoRubroEmplea;	
		
	//protected JInternalFrameBase jInternalFrameParent; //ESTA EN BASE
	//protected TipoGrupoRubroEmpleaBeanSwingJInternalFrameAdditional jInternalFrameDetalleTipoGrupoRubroEmplea;		
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	
	
	public TipoGrupoRubroEmpleaSessionBean tipogruporubroempleaSessionBean;
	
	
	
		
	
	public TipoGrupoRubroEmpleaLogic tipogruporubroempleaLogic;
	
	public JScrollPane jScrollPanelDatosTipoGrupoRubroEmplea;
	public JScrollPane jScrollPanelDatosEdicionTipoGrupoRubroEmplea;
	public JScrollPane jScrollPanelDatosGeneralTipoGrupoRubroEmplea;
	
	protected JPanel jPanelCamposTipoGrupoRubroEmplea;    
	protected JPanel jPanelCamposOcultosTipoGrupoRubroEmplea;    	
	protected JPanel jPanelAccionesTipoGrupoRubroEmplea;
	protected JPanel jPanelAccionesFormularioTipoGrupoRubroEmplea;
    
	
	
	protected Integer iXPanelCamposTipoGrupoRubroEmplea=0;
	protected Integer iYPanelCamposTipoGrupoRubroEmplea=0;
	
	protected Integer iXPanelCamposOcultosTipoGrupoRubroEmplea=0;
	protected Integer iYPanelCamposOcultosTipoGrupoRubroEmplea=0;
	
	;
	;
	
		
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	public JButton jButtonNuevoTipoGrupoRubroEmplea;
	public JButton jButtonModificarTipoGrupoRubroEmplea;
	public JButton jButtonActualizarTipoGrupoRubroEmplea;
    public JButton jButtonEliminarTipoGrupoRubroEmplea;
	public JButton jButtonCancelarTipoGrupoRubroEmplea;
    public JButton jButtonGuardarCambiosTipoGrupoRubroEmplea;
	public JButton jButtonGuardarCambiosTablaTipoGrupoRubroEmplea;
	protected JButton jButtonCerrarTipoGrupoRubroEmplea;
	
	
	protected JButton jButtonProcesarInformacionTipoGrupoRubroEmplea;
	
	
	protected JCheckBox jCheckBoxPostAccionNuevoTipoGrupoRubroEmplea;
	protected JCheckBox jCheckBoxPostAccionSinCerrarTipoGrupoRubroEmplea;
	protected JCheckBox jCheckBoxPostAccionSinMensajeTipoGrupoRubroEmplea;
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarTipoGrupoRubroEmplea;
	protected JButton jButtonModificarToolBarTipoGrupoRubroEmplea;
	protected JButton jButtonActualizarToolBarTipoGrupoRubroEmplea;
    protected JButton jButtonEliminarToolBarTipoGrupoRubroEmplea;
	protected JButton jButtonCancelarToolBarTipoGrupoRubroEmplea;
    protected JButton jButtonGuardarCambiosToolBarTipoGrupoRubroEmplea;
	protected JButton jButtonGuardarCambiosTablaToolBarTipoGrupoRubroEmplea;
	protected JButton jButtonMostrarOcultarTablaToolBarTipoGrupoRubroEmplea;
	protected JButton jButtonCerrarToolBarTipoGrupoRubroEmplea;
	
	protected JButton jButtonProcesarInformacionToolBarTipoGrupoRubroEmplea;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoTipoGrupoRubroEmplea;
	protected JMenuItem jMenuItemModificarTipoGrupoRubroEmplea;
	protected JMenuItem jMenuItemActualizarTipoGrupoRubroEmplea;
    protected JMenuItem jMenuItemEliminarTipoGrupoRubroEmplea;
	protected JMenuItem jMenuItemCancelarTipoGrupoRubroEmplea;
    protected JMenuItem jMenuItemGuardarCambiosTipoGrupoRubroEmplea;
	protected JMenuItem jMenuItemGuardarCambiosTablaTipoGrupoRubroEmplea;
	protected JMenuItem jMenuItemCerrarTipoGrupoRubroEmplea;
	protected JMenuItem jMenuItemDetalleCerrarTipoGrupoRubroEmplea;
	protected JMenuItem jMenuItemDetalleMostarOcultarTipoGrupoRubroEmplea;
	
	protected JMenuItem jMenuItemProcesarInformacionTipoGrupoRubroEmplea;
	protected JMenuItem jMenuItemNuevoGuardarCambiosTipoGrupoRubroEmplea;
	protected JMenuItem jMenuItemMostrarOcultarTipoGrupoRubroEmplea;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesTipoGrupoRubroEmplea;	
		
	
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesTipoGrupoRubroEmplea;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesTipoGrupoRubroEmplea;
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxTiposAccionesFormularioTipoGrupoRubroEmplea;
	
		
	
	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	public JPanel jPanelidTipoGrupoRubroEmplea;
	public JLabel jLabelIdTipoGrupoRubroEmplea;
	public JTextFieldMe jTextFieldidTipoGrupoRubroEmplea;
	public JButton jButtonidTipoGrupoRubroEmpleaBusqueda= new JButtonMe();

	public JPanel jPanelcodigoTipoGrupoRubroEmplea;
	public JLabel jLabelcodigoTipoGrupoRubroEmplea;
	public JTextField jTextFieldcodigoTipoGrupoRubroEmplea;
	public JButton jButtoncodigoTipoGrupoRubroEmpleaBusqueda= new JButtonMe();

	public JPanel jPanelnombreTipoGrupoRubroEmplea;
	public JLabel jLabelnombreTipoGrupoRubroEmplea;
	public JTextArea jTextAreanombreTipoGrupoRubroEmplea;
	public JScrollPane jscrollPanenombreTipoGrupoRubroEmplea;
	public JButton jButtonnombreTipoGrupoRubroEmpleaBusqueda= new JButtonMe();

	
	
	
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JTabbedPane jTabbedPaneRelacionesTipoGrupoRubroEmplea;
	
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
	
	public TipoGrupoRubroEmpleaDetalleFormJInternalFrame(String sTipo) throws Exception {
		super(PaginaTipo.FORMULARIO);
       
		try {
			
	  		if(sTipo.equals("MINIMO")) {
				/*
				this.jPanelCamposTipoGrupoRubroEmplea=new JPanel();
				this.jPanelAccionesFormularioTipoGrupoRubroEmplea=new JPanel();
				this.jmenuBarDetalleTipoGrupoRubroEmplea=new JMenuBar();
				this.jTtoolBarDetalleTipoGrupoRubroEmplea=new JToolBar();
				*/
	  		}
	  		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoGrupoRubroEmpleaDetalleFormJInternalFrame(PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo); 
		
		//super("TipoGrupoRubroEmplea No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	//ES AUXILIAR PARA WINDOWS FORMS
	public TipoGrupoRubroEmpleaDetalleFormJInternalFrame() throws Exception {
		super(PaginaTipo.FORMULARIO);
        //super("TipoGrupoRubroEmplea No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoGrupoRubroEmpleaDetalleFormJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("TipoGrupoRubroEmplea No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoGrupoRubroEmpleaDetalleFormJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("TipoGrupoRubroEmplea No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoGrupoRubroEmpleaDetalleFormJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("TipoGrupoRubroEmplea No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	public JButton getjButtonActualizarToolBarTipoGrupoRubroEmplea() {
		return this.jButtonActualizarToolBarTipoGrupoRubroEmplea;
	}
	
	public JButton getjButtonEliminarToolBarTipoGrupoRubroEmplea() {
		return this.jButtonEliminarToolBarTipoGrupoRubroEmplea;
	}
	
	public JButton getjButtonCancelarToolBarTipoGrupoRubroEmplea() {
		return this.jButtonCancelarToolBarTipoGrupoRubroEmplea;
	}		
	
	public JButton getjButtonProcesarInformacionTipoGrupoRubroEmplea() {
		return this.jButtonProcesarInformacionTipoGrupoRubroEmplea;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionTipoGrupoRubroEmplea)	{
		this.jButtonProcesarInformacionTipoGrupoRubroEmplea = jButtonProcesarInformacionTipoGrupoRubroEmplea;
	}
	
	
	

	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesTipoGrupoRubroEmplea() {
		return this.jComboBoxTiposAccionesTipoGrupoRubroEmplea;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesTipoGrupoRubroEmplea(
			JComboBox jComboBoxTiposRelacionesTipoGrupoRubroEmplea) {
		this.jComboBoxTiposRelacionesTipoGrupoRubroEmplea = jComboBoxTiposRelacionesTipoGrupoRubroEmplea;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesTipoGrupoRubroEmplea(
			JComboBox jComboBoxTiposAccionesTipoGrupoRubroEmplea) {
		this.jComboBoxTiposAccionesTipoGrupoRubroEmplea = jComboBoxTiposAccionesTipoGrupoRubroEmplea;
	}		
	
			
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesFormularioTipoGrupoRubroEmplea() {
		return this.jComboBoxTiposAccionesFormularioTipoGrupoRubroEmplea;
	}				
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesFormularioTipoGrupoRubroEmplea(
			JComboBox jComboBoxTiposAccionesFormularioTipoGrupoRubroEmplea) {
		this.jComboBoxTiposAccionesFormularioTipoGrupoRubroEmplea = jComboBoxTiposAccionesFormularioTipoGrupoRubroEmplea;
	}
	
	private void initialize(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		this.tipogruporubroempleaSessionBean=new TipoGrupoRubroEmpleaSessionBean();
		
		this.tipogruporubroempleaSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.tipogruporubroempleaSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.tipogruporubroempleaSessionBean.getEsGuardarRelacionado();				
		
		this.conMostrarAccionesCampo=parametroGeneralUsuario.getcon_mostrar_acciones_campo_general() || opcionActual.getcon_mostrar_acciones_campo();
		
		
		if(!this.conCargarMinimo) {
		
		}
		
			
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		TipoGrupoRubroEmpleaJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		TipoGrupoRubroEmpleaJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		TipoGrupoRubroEmpleaJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Tipo Grupo Rubro Empleado MANTENIMIENTO"));
		
		
		if(iWidth > 650) {
			iWidth=650;
		}
		
		if(iHeight > 650) {
			iHeight=650;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
		
		if(!this.tipogruporubroempleaSessionBean.getEsGuardarRelacionado()) {
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
	
		TipoGrupoRubroEmpleaJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarDetalleTipoGrupoRubroEmplea= new JToolBar("MENU DATOS");		
		
		//TOOLBAR
		//PRINCIPAL				
				this.jButtonProcesarInformacionToolBarTipoGrupoRubroEmplea=new JButtonMe();
				this.jButtonModificarToolBarTipoGrupoRubroEmplea=new JButtonMe();							
		//PRINCIPAL
		
		//DETALLE
		this.jButtonActualizarToolBarTipoGrupoRubroEmplea=FuncionesSwing.getButtonToolBarGeneral(this.jButtonActualizarToolBarTipoGrupoRubroEmplea,this.jTtoolBarDetalleTipoGrupoRubroEmplea,
							"actualizar","actualizar","Actualizar"+" "+TipoGrupoRubroEmpleaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"),"Actualizar",false);
		
		
		
		
		this.jButtonEliminarToolBarTipoGrupoRubroEmplea=FuncionesSwing.getButtonToolBarGeneral(this.jButtonEliminarToolBarTipoGrupoRubroEmplea,this.jTtoolBarDetalleTipoGrupoRubroEmplea,
							"eliminar","eliminar","Eliminar"+" "+TipoGrupoRubroEmpleaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"),"Eliminar",false);
		
		
		
		
		this.jButtonCancelarToolBarTipoGrupoRubroEmplea=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCancelarToolBarTipoGrupoRubroEmplea,this.jTtoolBarDetalleTipoGrupoRubroEmplea,
							"cancelar","cancelar","Cancelar"+" "+TipoGrupoRubroEmpleaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"),"Cancelar",false);
		
		
		
		
		this.jButtonGuardarCambiosToolBarTipoGrupoRubroEmplea=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosToolBarTipoGrupoRubroEmplea,this.jTtoolBarDetalleTipoGrupoRubroEmplea,
							"guardarcambios","guardarcambios","Guardar"+" "+TipoGrupoRubroEmpleaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		
		FuncionesSwing.setBoldButtonToolBar(this.jButtonActualizarToolBarTipoGrupoRubroEmplea,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonEliminarToolBarTipoGrupoRubroEmplea,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonCancelarToolBarTipoGrupoRubroEmplea,STIPO_TAMANIO_GENERAL,false,false,this);
	}
	
	
	
	public void cargarMenus() {		
		
		this.jmenuBarDetalleTipoGrupoRubroEmplea=new JMenuBarMe();
		
		//DETALLE
		this.jmenuDetalleTipoGrupoRubroEmplea=new JMenuMe("Datos Relacionados");
		this.jmenuDetalleArchivoTipoGrupoRubroEmplea=new JMenuMe("Archivo");
		this.jmenuDetalleAccionesTipoGrupoRubroEmplea=new JMenuMe("Acciones");
		this.jmenuDetalleDatosTipoGrupoRubroEmplea=new JMenuMe("Datos");
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoTipoGrupoRubroEmplea= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoTipoGrupoRubroEmplea.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoTipoGrupoRubroEmplea,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoTipoGrupoRubroEmplea, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemModificarTipoGrupoRubroEmplea= new JMenuItem("Editar" + FuncionesSwing.getKeyMensaje("MODIFICAR"));
		this.jMenuItemModificarTipoGrupoRubroEmplea.setActionCommand("Editar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemModificarTipoGrupoRubroEmplea,"modificar_button","Editar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemModificarTipoGrupoRubroEmplea, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemActualizarTipoGrupoRubroEmplea= new JMenuItem("Actualizar" + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
		this.jMenuItemActualizarTipoGrupoRubroEmplea.setActionCommand("Actualizar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemActualizarTipoGrupoRubroEmplea,"actualizar_button","Actualizar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemActualizarTipoGrupoRubroEmplea, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemEliminarTipoGrupoRubroEmplea= new JMenuItem("Eliminar" + FuncionesSwing.getKeyMensaje("ELIMINAR"));
		this.jMenuItemEliminarTipoGrupoRubroEmplea.setActionCommand("Eliminar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemEliminarTipoGrupoRubroEmplea,"eliminar_button","Eliminar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemEliminarTipoGrupoRubroEmplea, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCancelarTipoGrupoRubroEmplea= new JMenuItem("Cancelar" + FuncionesSwing.getKeyMensaje("CANCELAR"));
		this.jMenuItemCancelarTipoGrupoRubroEmplea.setActionCommand("Cancelar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCancelarTipoGrupoRubroEmplea,"cancelar_button","Cancelar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCancelarTipoGrupoRubroEmplea, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosTipoGrupoRubroEmplea= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTipoGrupoRubroEmplea.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTipoGrupoRubroEmplea,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTipoGrupoRubroEmplea, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarTipoGrupoRubroEmplea= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarTipoGrupoRubroEmplea.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarTipoGrupoRubroEmplea,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarTipoGrupoRubroEmplea, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleCerrarTipoGrupoRubroEmplea= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemDetalleCerrarTipoGrupoRubroEmplea.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleCerrarTipoGrupoRubroEmplea,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleCerrarTipoGrupoRubroEmplea, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarTipoGrupoRubroEmplea= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarTipoGrupoRubroEmplea.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarTipoGrupoRubroEmplea,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarTipoGrupoRubroEmplea, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarTipoGrupoRubroEmplea= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarTipoGrupoRubroEmplea.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarTipoGrupoRubroEmplea,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarTipoGrupoRubroEmplea, STIPO_TAMANIO_GENERAL,false,true,this);			
		
		//DETALLE
		this.jmenuDetalleArchivoTipoGrupoRubroEmplea.add(this.jMenuItemDetalleCerrarTipoGrupoRubroEmplea);
		
		this.jmenuDetalleAccionesTipoGrupoRubroEmplea.add(this.jMenuItemActualizarTipoGrupoRubroEmplea);
		this.jmenuDetalleAccionesTipoGrupoRubroEmplea.add(this.jMenuItemEliminarTipoGrupoRubroEmplea);
		this.jmenuDetalleAccionesTipoGrupoRubroEmplea.add(this.jMenuItemCancelarTipoGrupoRubroEmplea);		
		
		//this.jmenuDetalleDatosTipoGrupoRubroEmplea.add(this.jMenuItemDetalleAbrirOrderByTipoGrupoRubroEmplea);				
		this.jmenuDetalleDatosTipoGrupoRubroEmplea.add(this.jMenuItemDetalleMostarOcultarTipoGrupoRubroEmplea);				
				
		//this.jmenuDetalleAccionesTipoGrupoRubroEmplea.add(this.jMenuItemGuardarCambiosTipoGrupoRubroEmplea);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES				
		
		//DETALLE
		FuncionesSwing.setBoldMenu(this.jmenuDetalleArchivoTipoGrupoRubroEmplea, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleAccionesTipoGrupoRubroEmplea, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleDatosTipoGrupoRubroEmplea, STIPO_TAMANIO_GENERAL,false,true,this);
			
		this.jmenuBarDetalleTipoGrupoRubroEmplea.add(this.jmenuDetalleArchivoTipoGrupoRubroEmplea);		
		this.jmenuBarDetalleTipoGrupoRubroEmplea.add(this.jmenuDetalleAccionesTipoGrupoRubroEmplea);		
		this.jmenuBarDetalleTipoGrupoRubroEmplea.add(this.jmenuDetalleDatosTipoGrupoRubroEmplea);		
		
		//DETALLE_FIN
		
		
		//AGREGA MENU DETALLE A PANTALLA
		this.setJMenuBar(this.jmenuBarDetalleTipoGrupoRubroEmplea);				
	}
	
	
	public void inicializarElementosCamposTipoGrupoRubroEmplea() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		jLabelIdTipoGrupoRubroEmplea = new JLabelMe();
		jLabelIdTipoGrupoRubroEmplea.setText(""+Constantes2.S_CODIGO_UNICO+"");
		jLabelIdTipoGrupoRubroEmplea.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdTipoGrupoRubroEmplea.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdTipoGrupoRubroEmplea.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelIdTipoGrupoRubroEmplea,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jPanelidTipoGrupoRubroEmplea = new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelidTipoGrupoRubroEmplea.setToolTipText(TipoGrupoRubroEmpleaConstantesFunciones.LABEL_ID);
		this.gridaBagLayoutTipoGrupoRubroEmplea= new GridBagLayout();

		this.jPanelidTipoGrupoRubroEmplea.setLayout(this.gridaBagLayoutTipoGrupoRubroEmplea);

		jTextFieldidTipoGrupoRubroEmplea = new JTextFieldMe();
		jTextFieldidTipoGrupoRubroEmplea.setText("Id");

		jTextFieldidTipoGrupoRubroEmplea.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jTextFieldidTipoGrupoRubroEmplea.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jTextFieldidTipoGrupoRubroEmplea.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));



					
		this.jLabelcodigoTipoGrupoRubroEmplea = new JLabelMe();
		this.jLabelcodigoTipoGrupoRubroEmplea.setText(""+TipoGrupoRubroEmpleaConstantesFunciones.LABEL_CODIGO+" : *");
		this.jLabelcodigoTipoGrupoRubroEmplea.setToolTipText("Codigo");
		this.jLabelcodigoTipoGrupoRubroEmplea.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcodigoTipoGrupoRubroEmplea.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcodigoTipoGrupoRubroEmplea.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelcodigoTipoGrupoRubroEmplea,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelcodigoTipoGrupoRubroEmplea=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelcodigoTipoGrupoRubroEmplea.setToolTipText(TipoGrupoRubroEmpleaConstantesFunciones.LABEL_CODIGO);
		this.gridaBagLayoutTipoGrupoRubroEmplea = new GridBagLayout();
		this.jPanelcodigoTipoGrupoRubroEmplea.setLayout(this.gridaBagLayoutTipoGrupoRubroEmplea);


		jTextFieldcodigoTipoGrupoRubroEmplea= new JTextFieldMe();

		jTextFieldcodigoTipoGrupoRubroEmplea.setEnabled(false);
		jTextFieldcodigoTipoGrupoRubroEmplea.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcodigoTipoGrupoRubroEmplea.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcodigoTipoGrupoRubroEmplea.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldcodigoTipoGrupoRubroEmplea,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtoncodigoTipoGrupoRubroEmpleaBusqueda= new JButtonMe();
		this.jButtoncodigoTipoGrupoRubroEmpleaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncodigoTipoGrupoRubroEmpleaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncodigoTipoGrupoRubroEmpleaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtoncodigoTipoGrupoRubroEmpleaBusqueda.setText("U");
		this.jButtoncodigoTipoGrupoRubroEmpleaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtoncodigoTipoGrupoRubroEmpleaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtoncodigoTipoGrupoRubroEmpleaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldcodigoTipoGrupoRubroEmplea.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldcodigoTipoGrupoRubroEmplea.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"codigoTipoGrupoRubroEmpleaBusqueda"));

		if(this.tipogruporubroempleaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtoncodigoTipoGrupoRubroEmpleaBusqueda.setVisible(false);		}


					
		this.jLabelnombreTipoGrupoRubroEmplea = new JLabelMe();
		this.jLabelnombreTipoGrupoRubroEmplea.setText(""+TipoGrupoRubroEmpleaConstantesFunciones.LABEL_NOMBRE+" : *");
		this.jLabelnombreTipoGrupoRubroEmplea.setToolTipText("Nombre");
		this.jLabelnombreTipoGrupoRubroEmplea.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnombreTipoGrupoRubroEmplea.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnombreTipoGrupoRubroEmplea.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelnombreTipoGrupoRubroEmplea,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelnombreTipoGrupoRubroEmplea=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelnombreTipoGrupoRubroEmplea.setToolTipText(TipoGrupoRubroEmpleaConstantesFunciones.LABEL_NOMBRE);
		this.gridaBagLayoutTipoGrupoRubroEmplea = new GridBagLayout();
		this.jPanelnombreTipoGrupoRubroEmplea.setLayout(this.gridaBagLayoutTipoGrupoRubroEmplea);


		jTextAreanombreTipoGrupoRubroEmplea= new JTextAreaMe();
		jTextAreanombreTipoGrupoRubroEmplea.setEnabled(false);
		jTextAreanombreTipoGrupoRubroEmplea.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreTipoGrupoRubroEmplea.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreTipoGrupoRubroEmplea.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreTipoGrupoRubroEmplea.setLineWrap(true);
		jTextAreanombreTipoGrupoRubroEmplea.setWrapStyleWord(true);
		jTextAreanombreTipoGrupoRubroEmplea.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreanombreTipoGrupoRubroEmplea.setRows(4);

		FuncionesSwing.setBoldTextArea(jTextAreanombreTipoGrupoRubroEmplea,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPanenombreTipoGrupoRubroEmplea = new JScrollPane(jTextAreanombreTipoGrupoRubroEmplea);
		jscrollPanenombreTipoGrupoRubroEmplea.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanenombreTipoGrupoRubroEmplea.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanenombreTipoGrupoRubroEmplea.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));

		this.jButtonnombreTipoGrupoRubroEmpleaBusqueda= new JButtonMe();
		this.jButtonnombreTipoGrupoRubroEmpleaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombreTipoGrupoRubroEmpleaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombreTipoGrupoRubroEmpleaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonnombreTipoGrupoRubroEmpleaBusqueda.setText("U");
		this.jButtonnombreTipoGrupoRubroEmpleaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonnombreTipoGrupoRubroEmpleaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonnombreTipoGrupoRubroEmpleaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreanombreTipoGrupoRubroEmplea.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreanombreTipoGrupoRubroEmplea.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"nombreTipoGrupoRubroEmpleaBusqueda"));

		if(this.tipogruporubroempleaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonnombreTipoGrupoRubroEmpleaBusqueda.setVisible(false);		}


	}
	
	public void inicializarElementosCamposForeigKeysTipoGrupoRubroEmplea() {
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
		//this.jInternalFrameDetalleTipoGrupoRubroEmplea = new TipoGrupoRubroEmpleaBeanSwingJInternalFrameAdditional(paginaTipo);//JInternalFrameBase("Tipo Grupo Rubro Empleado DATOS");
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutTipoGrupoRubroEmplea= new GridBagLayout();
		

		
		String sToolTipTipoGrupoRubroEmplea="";
		sToolTipTipoGrupoRubroEmplea=TipoGrupoRubroEmpleaConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipTipoGrupoRubroEmplea+="(Nomina.TipoGrupoRubroEmplea)";
		}
		
		if(!this.tipogruporubroempleaSessionBean.getEsGuardarRelacionado()) {
			sToolTipTipoGrupoRubroEmplea+="_"+this.opcionActual.getId();
		}
								
		
		this.jButtonNuevoTipoGrupoRubroEmplea = new JButtonMe();
		this.jButtonModificarTipoGrupoRubroEmplea = new JButtonMe();
        this.jButtonActualizarTipoGrupoRubroEmplea = new JButtonMe();
        this.jButtonEliminarTipoGrupoRubroEmplea = new JButtonMe();
        this.jButtonCancelarTipoGrupoRubroEmplea = new JButtonMe();
        this.jButtonGuardarCambiosTipoGrupoRubroEmplea = new JButtonMe();
		this.jButtonGuardarCambiosTablaTipoGrupoRubroEmplea = new JButtonMe();
		this.jButtonCerrarTipoGrupoRubroEmplea = new JButtonMe();
		
		this.jScrollPanelDatosTipoGrupoRubroEmplea = new JScrollPane();   
        this.jScrollPanelDatosEdicionTipoGrupoRubroEmplea = new JScrollPane();
		this.jScrollPanelDatosGeneralTipoGrupoRubroEmplea = new JScrollPane();
				
		
		
		this.jPanelCamposTipoGrupoRubroEmplea = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelCamposOcultosTipoGrupoRubroEmplea = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
        this.jPanelAccionesTipoGrupoRubroEmplea = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		this.jPanelAccionesFormularioTipoGrupoRubroEmplea = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		this.sPath=" <---> Acceso: Tipo Grupo Rubro Empleado";
		
		if(!this.tipogruporubroempleaSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosTipoGrupoRubroEmplea.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Tipo Grupo Rubro Empleados" + this.sPath));
		} else {
			this.jScrollPanelDatosTipoGrupoRubroEmplea.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosEdicionTipoGrupoRubroEmplea.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		this.jScrollPanelDatosGeneralTipoGrupoRubroEmplea.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
			
        this.jPanelCamposTipoGrupoRubroEmplea.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
        this.jPanelCamposTipoGrupoRubroEmplea.setName("jPanelCamposTipoGrupoRubroEmplea"); 

		this.jPanelCamposOcultosTipoGrupoRubroEmplea.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos Ocultos"));
        this.jPanelCamposOcultosTipoGrupoRubroEmplea.setName("jPanelCamposOcultosTipoGrupoRubroEmplea"); 

        this.jPanelAccionesTipoGrupoRubroEmplea.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesTipoGrupoRubroEmplea.setToolTipText("Acciones");
        this.jPanelAccionesTipoGrupoRubroEmplea.setName("Acciones"); 

		this.jPanelAccionesFormularioTipoGrupoRubroEmplea.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones Extra/Post"));
        this.jPanelAccionesFormularioTipoGrupoRubroEmplea.setToolTipText("Acciones");
        this.jPanelAccionesFormularioTipoGrupoRubroEmplea.setName("Acciones"); 
		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosEdicionTipoGrupoRubroEmplea, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralTipoGrupoRubroEmplea, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosTipoGrupoRubroEmplea, STIPO_TAMANIO_GENERAL,false,false,this);		
		FuncionesSwing.setBoldPanel(this.jPanelCamposTipoGrupoRubroEmplea, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelCamposOcultosTipoGrupoRubroEmplea, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelAccionesFormularioTipoGrupoRubroEmplea, STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {
		
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		
        this.jButtonNuevoTipoGrupoRubroEmplea.setText("Nuevo");
		this.jButtonModificarTipoGrupoRubroEmplea.setText("Editar");
        this.jButtonActualizarTipoGrupoRubroEmplea.setText("Actualizar");
        this.jButtonEliminarTipoGrupoRubroEmplea.setText("Eliminar");
        this.jButtonCancelarTipoGrupoRubroEmplea.setText("Cancelar");
        this.jButtonGuardarCambiosTipoGrupoRubroEmplea.setText("Guardar");
		this.jButtonGuardarCambiosTablaTipoGrupoRubroEmplea.setText("Guardar");
		this.jButtonCerrarTipoGrupoRubroEmplea.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoTipoGrupoRubroEmplea,"nuevo_button","Nuevo",this.tipogruporubroempleaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonModificarTipoGrupoRubroEmplea,"modificar_button","Editar",this.tipogruporubroempleaSessionBean.getEsGuardarRelacionado());
       	FuncionesSwing.addImagenButtonGeneral(this.jButtonActualizarTipoGrupoRubroEmplea,"actualizar_button","Actualizar",this.tipogruporubroempleaSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonEliminarTipoGrupoRubroEmplea,"eliminar_button","Eliminar",this.tipogruporubroempleaSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonCancelarTipoGrupoRubroEmplea,"cancelar_button","Cancelar",this.tipogruporubroempleaSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTipoGrupoRubroEmplea,"guardarcambios_button","Guardar",this.tipogruporubroempleaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaTipoGrupoRubroEmplea,"guardarcambiostabla_button","Guardar",this.tipogruporubroempleaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarTipoGrupoRubroEmplea,"cerrar_button","Salir",this.tipogruporubroempleaSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoTipoGrupoRubroEmplea, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonModificarTipoGrupoRubroEmplea, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTipoGrupoRubroEmplea, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaTipoGrupoRubroEmplea, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarTipoGrupoRubroEmplea, STIPO_TAMANIO_GENERAL,false,true,this);
		
		FuncionesSwing.setBoldButton(this.jButtonActualizarTipoGrupoRubroEmplea, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonEliminarTipoGrupoRubroEmplea, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonCancelarTipoGrupoRubroEmplea, STIPO_TAMANIO_GENERAL,false,false,this);
		
		this.jButtonNuevoTipoGrupoRubroEmplea.setToolTipText("Nuevo"+" "+TipoGrupoRubroEmpleaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonModificarTipoGrupoRubroEmplea.setToolTipText("Editar"+" "+TipoGrupoRubroEmpleaConstantesFunciones.SCLASSWEBTITULO+"");// + FuncionesSwing.getKeyMensaje("MODIFICAR"))
        this.jButtonActualizarTipoGrupoRubroEmplea.setToolTipText("Actualizar"+" "+TipoGrupoRubroEmpleaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
        this.jButtonEliminarTipoGrupoRubroEmplea.setToolTipText("Eliminar)"+" "+TipoGrupoRubroEmpleaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"));
        this.jButtonCancelarTipoGrupoRubroEmplea.setToolTipText("Cancelar"+" "+TipoGrupoRubroEmpleaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"));
        this.jButtonGuardarCambiosTipoGrupoRubroEmplea.setToolTipText("Guardar"+" "+TipoGrupoRubroEmpleaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonGuardarCambiosTablaTipoGrupoRubroEmplea.setToolTipText("Guardar"+" "+TipoGrupoRubroEmpleaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarTipoGrupoRubroEmplea.setToolTipText("Salir"+" "+TipoGrupoRubroEmpleaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoTipoGrupoRubroEmplea";
		inputMap = this.jButtonNuevoTipoGrupoRubroEmplea.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoTipoGrupoRubroEmplea.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoTipoGrupoRubroEmplea"));
		
		//ACTUALIZAR
		sMapKey = "ActualizarTipoGrupoRubroEmplea";
		inputMap = this.jButtonActualizarTipoGrupoRubroEmplea.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ACTUALIZAR") , FuncionesSwing.getMaskKey("ACTUALIZAR")), sMapKey);
		
		this.jButtonActualizarTipoGrupoRubroEmplea.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ActualizarTipoGrupoRubroEmplea"));
		
		//ELIMINAR
		sMapKey = "EliminarTipoGrupoRubroEmplea";
		inputMap = this.jButtonEliminarTipoGrupoRubroEmplea.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ELIMINAR") , FuncionesSwing.getMaskKey("ELIMINAR")), sMapKey);
		
		this.jButtonEliminarTipoGrupoRubroEmplea.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"EliminarTipoGrupoRubroEmplea"));
		
		//CANCELAR	
		sMapKey = "CancelarTipoGrupoRubroEmplea";
		inputMap = this.jButtonCancelarTipoGrupoRubroEmplea.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CANCELAR") , FuncionesSwing.getMaskKey("CANCELAR")), sMapKey);
		
		this.jButtonCancelarTipoGrupoRubroEmplea.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CancelarTipoGrupoRubroEmplea"));
		
		//CERRAR		
		sMapKey = "CerrarTipoGrupoRubroEmplea";
		inputMap = this.jButtonCerrarTipoGrupoRubroEmplea.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarTipoGrupoRubroEmplea.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarTipoGrupoRubroEmplea"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaTipoGrupoRubroEmplea";
		inputMap = this.jButtonGuardarCambiosTablaTipoGrupoRubroEmplea.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaTipoGrupoRubroEmplea.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaTipoGrupoRubroEmplea"));
		
		//HOT KEYS
		
		this.jCheckBoxPostAccionNuevoTipoGrupoRubroEmplea = new JCheckBoxMe();
		this.jCheckBoxPostAccionNuevoTipoGrupoRubroEmplea.setText("Nuevo");
		this.jCheckBoxPostAccionNuevoTipoGrupoRubroEmplea.setToolTipText("Nuevo TipoGrupoRubroEmplea");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionNuevoTipoGrupoRubroEmplea, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinCerrarTipoGrupoRubroEmplea = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinCerrarTipoGrupoRubroEmplea.setText("Sin Cerrar");
		this.jCheckBoxPostAccionSinCerrarTipoGrupoRubroEmplea.setToolTipText("Sin Cerrar Ventana TipoGrupoRubroEmplea");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinCerrarTipoGrupoRubroEmplea, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinMensajeTipoGrupoRubroEmplea = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinMensajeTipoGrupoRubroEmplea.setText("Sin Mensaje");
		this.jCheckBoxPostAccionSinMensajeTipoGrupoRubroEmplea.setToolTipText("Sin Mensaje Confirmacion");				
				
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinMensajeTipoGrupoRubroEmplea, STIPO_TAMANIO_GENERAL,false,false,this);       	
       
				
		
			
			
		this.jComboBoxTiposAccionesTipoGrupoRubroEmplea = new JComboBoxMe();
		//this.jComboBoxTiposAccionesTipoGrupoRubroEmplea.setText("Accion");
		this.jComboBoxTiposAccionesTipoGrupoRubroEmplea.setToolTipText("Tipos de Acciones");
							
		

		this.jComboBoxTiposAccionesFormularioTipoGrupoRubroEmplea = new JComboBoxMe();
		//this.jComboBoxTiposAccionesFormularioTipoGrupoRubroEmplea.setText("Accion");				
    	this.jComboBoxTiposAccionesFormularioTipoGrupoRubroEmplea.setToolTipText("Tipos de Acciones");
	
		this.jLabelAccionesTipoGrupoRubroEmplea = new JLabelMe();
		
		this.jLabelAccionesTipoGrupoRubroEmplea.setText("Acciones");		
		this.jLabelAccionesTipoGrupoRubroEmplea.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesTipoGrupoRubroEmplea.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesTipoGrupoRubroEmplea.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
        //HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		//HOT KEYS2
		
		//ELEMENTOS
		this.inicializarElementosCamposTipoGrupoRubroEmplea();
		
		//ELEMENTOS FK
		this.inicializarElementosCamposForeigKeysTipoGrupoRubroEmplea();
				
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		this.jTabbedPaneRelacionesTipoGrupoRubroEmplea=new JTabbedPane();
		this.jTabbedPaneRelacionesTipoGrupoRubroEmplea.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Relacionados"));
		
		//ESTA EN BEAN

		
		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneRelacionesTipoGrupoRubroEmplea,STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		int iPosXAccionPaginacion=0;
		
		
		
				
		
		this.jComboBoxTiposAccionesTipoGrupoRubroEmplea.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesTipoGrupoRubroEmplea.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesTipoGrupoRubroEmplea.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesTipoGrupoRubroEmplea, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		
		
		this.jComboBoxTiposAccionesFormularioTipoGrupoRubroEmplea.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioTipoGrupoRubroEmplea.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioTipoGrupoRubroEmplea.setPreferredSize(new Dimension(145,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesFormularioTipoGrupoRubroEmplea, STIPO_TAMANIO_GENERAL,false,false,this);				
		
		GridBagLayout gridaBagLayoutCamposTipoGrupoRubroEmplea = new GridBagLayout();
		GridBagLayout gridaBagLayoutCamposOcultosTipoGrupoRubroEmplea = new GridBagLayout();
		
		this.jPanelCamposTipoGrupoRubroEmplea.setLayout(gridaBagLayoutCamposTipoGrupoRubroEmplea);
		this.jPanelCamposOcultosTipoGrupoRubroEmplea.setLayout(gridaBagLayoutCamposOcultosTipoGrupoRubroEmplea);
		
		;
		;
		
		
		//SUBPANELES SIMPLES
		//SUBPANELES POR CAMPO
        
	this.gridBagConstraintsTipoGrupoRubroEmplea = new GridBagConstraints();
	this.gridBagConstraintsTipoGrupoRubroEmplea.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoGrupoRubroEmplea.gridy = 0;
	this.gridBagConstraintsTipoGrupoRubroEmplea.gridx = 0;
	this.gridBagConstraintsTipoGrupoRubroEmplea.ipadx = 0;
	this.gridBagConstraintsTipoGrupoRubroEmplea.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelidTipoGrupoRubroEmplea.add(jLabelIdTipoGrupoRubroEmplea, this.gridBagConstraintsTipoGrupoRubroEmplea);



	this.gridBagConstraintsTipoGrupoRubroEmplea = new GridBagConstraints();
	this.gridBagConstraintsTipoGrupoRubroEmplea.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoGrupoRubroEmplea.gridy = 0;
	this.gridBagConstraintsTipoGrupoRubroEmplea.gridx = 1;
	this.gridBagConstraintsTipoGrupoRubroEmplea.ipadx = 0;
	this.gridBagConstraintsTipoGrupoRubroEmplea.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelidTipoGrupoRubroEmplea.add(jTextFieldidTipoGrupoRubroEmplea, this.gridBagConstraintsTipoGrupoRubroEmplea);


	this.gridBagConstraintsTipoGrupoRubroEmplea = new GridBagConstraints();
	this.gridBagConstraintsTipoGrupoRubroEmplea.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoGrupoRubroEmplea.gridy = 0;
	this.gridBagConstraintsTipoGrupoRubroEmplea.gridx = 0;
	this.gridBagConstraintsTipoGrupoRubroEmplea.ipadx = 0;
	this.gridBagConstraintsTipoGrupoRubroEmplea.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelcodigoTipoGrupoRubroEmplea.add(jLabelcodigoTipoGrupoRubroEmplea, this.gridBagConstraintsTipoGrupoRubroEmplea);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsTipoGrupoRubroEmplea = new GridBagConstraints();
		//this.gridBagConstraintsTipoGrupoRubroEmplea.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoGrupoRubroEmplea.gridy = 0;
		this.gridBagConstraintsTipoGrupoRubroEmplea.gridx = 2;
		this.gridBagConstraintsTipoGrupoRubroEmplea.ipadx = 0;
		this.gridBagConstraintsTipoGrupoRubroEmplea.insets = new Insets(0, 0, 0, 0);
		this.jPanelcodigoTipoGrupoRubroEmplea.add(jButtoncodigoTipoGrupoRubroEmpleaBusqueda, this.gridBagConstraintsTipoGrupoRubroEmplea);
	}

	this.gridBagConstraintsTipoGrupoRubroEmplea = new GridBagConstraints();
	this.gridBagConstraintsTipoGrupoRubroEmplea.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoGrupoRubroEmplea.gridy = 0;
	this.gridBagConstraintsTipoGrupoRubroEmplea.gridx = 1;
	this.gridBagConstraintsTipoGrupoRubroEmplea.ipadx = 0;
	this.gridBagConstraintsTipoGrupoRubroEmplea.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelcodigoTipoGrupoRubroEmplea.add(jTextFieldcodigoTipoGrupoRubroEmplea, this.gridBagConstraintsTipoGrupoRubroEmplea);


	this.gridBagConstraintsTipoGrupoRubroEmplea = new GridBagConstraints();
	this.gridBagConstraintsTipoGrupoRubroEmplea.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoGrupoRubroEmplea.gridy = 0;
	this.gridBagConstraintsTipoGrupoRubroEmplea.gridx = 0;
	this.gridBagConstraintsTipoGrupoRubroEmplea.ipadx = 0;
	this.gridBagConstraintsTipoGrupoRubroEmplea.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelnombreTipoGrupoRubroEmplea.add(jLabelnombreTipoGrupoRubroEmplea, this.gridBagConstraintsTipoGrupoRubroEmplea);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsTipoGrupoRubroEmplea = new GridBagConstraints();
		//this.gridBagConstraintsTipoGrupoRubroEmplea.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoGrupoRubroEmplea.gridy = 0;
		this.gridBagConstraintsTipoGrupoRubroEmplea.gridx = 2;
		this.gridBagConstraintsTipoGrupoRubroEmplea.ipadx = 0;
		this.gridBagConstraintsTipoGrupoRubroEmplea.insets = new Insets(0, 0, 0, 0);
		this.jPanelnombreTipoGrupoRubroEmplea.add(jButtonnombreTipoGrupoRubroEmpleaBusqueda, this.gridBagConstraintsTipoGrupoRubroEmplea);
	}

	this.gridBagConstraintsTipoGrupoRubroEmplea = new GridBagConstraints();
	this.gridBagConstraintsTipoGrupoRubroEmplea.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoGrupoRubroEmplea.gridy = 0;
	this.gridBagConstraintsTipoGrupoRubroEmplea.gridx = 1;
	this.gridBagConstraintsTipoGrupoRubroEmplea.ipadx = 0;
	this.gridBagConstraintsTipoGrupoRubroEmplea.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelnombreTipoGrupoRubroEmplea.add(jscrollPanenombreTipoGrupoRubroEmplea, this.gridBagConstraintsTipoGrupoRubroEmplea);


		//SUBPANELES SIMPLES
		
		//SUBPANELES EN PANEL
		//SUBPANELES EN PANEL CAMPOS NORMAL				
		
	this.gridBagConstraintsTipoGrupoRubroEmplea = new GridBagConstraints();
	this.gridBagConstraintsTipoGrupoRubroEmplea.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsTipoGrupoRubroEmplea.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsTipoGrupoRubroEmplea.gridy = iYPanelCamposTipoGrupoRubroEmplea;
	this.gridBagConstraintsTipoGrupoRubroEmplea.gridx = iXPanelCamposTipoGrupoRubroEmplea++;
	this.gridBagConstraintsTipoGrupoRubroEmplea.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsTipoGrupoRubroEmplea.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposTipoGrupoRubroEmplea.add(this.jPanelidTipoGrupoRubroEmplea, this.gridBagConstraintsTipoGrupoRubroEmplea);



	if(iXPanelCamposTipoGrupoRubroEmplea % 1==0) {
		iXPanelCamposTipoGrupoRubroEmplea=0;
		iYPanelCamposTipoGrupoRubroEmplea++;
	}
	this.gridBagConstraintsTipoGrupoRubroEmplea = new GridBagConstraints();
	this.gridBagConstraintsTipoGrupoRubroEmplea.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsTipoGrupoRubroEmplea.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsTipoGrupoRubroEmplea.gridy = iYPanelCamposTipoGrupoRubroEmplea;
	this.gridBagConstraintsTipoGrupoRubroEmplea.gridx = iXPanelCamposTipoGrupoRubroEmplea++;
	this.gridBagConstraintsTipoGrupoRubroEmplea.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsTipoGrupoRubroEmplea.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposTipoGrupoRubroEmplea.add(this.jPanelcodigoTipoGrupoRubroEmplea, this.gridBagConstraintsTipoGrupoRubroEmplea);



	if(iXPanelCamposTipoGrupoRubroEmplea % 1==0) {
		iXPanelCamposTipoGrupoRubroEmplea=0;
		iYPanelCamposTipoGrupoRubroEmplea++;
	}
	this.gridBagConstraintsTipoGrupoRubroEmplea = new GridBagConstraints();
	this.gridBagConstraintsTipoGrupoRubroEmplea.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsTipoGrupoRubroEmplea.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsTipoGrupoRubroEmplea.gridy = iYPanelCamposTipoGrupoRubroEmplea;
	this.gridBagConstraintsTipoGrupoRubroEmplea.gridx = iXPanelCamposTipoGrupoRubroEmplea++;
	this.gridBagConstraintsTipoGrupoRubroEmplea.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsTipoGrupoRubroEmplea.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposTipoGrupoRubroEmplea.add(this.jPanelnombreTipoGrupoRubroEmplea, this.gridBagConstraintsTipoGrupoRubroEmplea);



	if(iXPanelCamposTipoGrupoRubroEmplea % 1==0) {
		iXPanelCamposTipoGrupoRubroEmplea=0;
		iYPanelCamposTipoGrupoRubroEmplea++;
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
			
		GridBagLayout gridaBagLayoutAccionesTipoGrupoRubroEmplea= new GridBagLayout();
		this.jPanelAccionesTipoGrupoRubroEmplea.setLayout(gridaBagLayoutAccionesTipoGrupoRubroEmplea);
		
		GridBagLayout gridaBagLayoutAccionesFormularioTipoGrupoRubroEmplea= new GridBagLayout();
		this.jPanelAccionesFormularioTipoGrupoRubroEmplea.setLayout(gridaBagLayoutAccionesFormularioTipoGrupoRubroEmplea);
		
		this.gridBagConstraintsTipoGrupoRubroEmplea = new GridBagConstraints();
		this.gridBagConstraintsTipoGrupoRubroEmplea.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsTipoGrupoRubroEmplea.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioTipoGrupoRubroEmplea.add(this.jComboBoxTiposAccionesFormularioTipoGrupoRubroEmplea, this.gridBagConstraintsTipoGrupoRubroEmplea);

		this.gridBagConstraintsTipoGrupoRubroEmplea = new GridBagConstraints();
		this.gridBagConstraintsTipoGrupoRubroEmplea.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsTipoGrupoRubroEmplea.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioTipoGrupoRubroEmplea.add(this.jCheckBoxPostAccionNuevoTipoGrupoRubroEmplea, this.gridBagConstraintsTipoGrupoRubroEmplea);
			
		//DEBE CERRARSE Y ACTUALIZARSE TODO NUEVAMENTE, SI ES RELACIONADO PUEDE FUNCIONAR
		//if(!this.tipogruporubroempleaSessionBean.getEstaModoGuardarRelaciones()) {		
		//SE ARRIESGA
		//if(!this.conFuncionalidadRelaciones) {		
			this.gridBagConstraintsTipoGrupoRubroEmplea = new GridBagConstraints();
			this.gridBagConstraintsTipoGrupoRubroEmplea.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsTipoGrupoRubroEmplea.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioTipoGrupoRubroEmplea.add(this.jCheckBoxPostAccionSinCerrarTipoGrupoRubroEmplea, this.gridBagConstraintsTipoGrupoRubroEmplea);
		//}
		
		
		//NO TIENE MENSAJE POR DEFINICION, O ES MUY COMPLEJO LA PANTALLA PARA HACERLO MAS COMPLICADO
		if(!this.tipogruporubroempleaSessionBean.getEsGuardarRelacionado()
			){				
			//&& !this.tipogruporubroempleaSessionBean.getEstaModoGuardarRelaciones()) {
							
			this.gridBagConstraintsTipoGrupoRubroEmplea = new GridBagConstraints();
			this.gridBagConstraintsTipoGrupoRubroEmplea.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsTipoGrupoRubroEmplea.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioTipoGrupoRubroEmplea.add(this.jCheckBoxPostAccionSinMensajeTipoGrupoRubroEmplea, this.gridBagConstraintsTipoGrupoRubroEmplea);
		}
		
		
		int iPosXAccion=0;
		
		this.gridBagConstraintsTipoGrupoRubroEmplea = new GridBagConstraints();
		this.gridBagConstraintsTipoGrupoRubroEmplea.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoGrupoRubroEmplea.gridy = 0;
		this.gridBagConstraintsTipoGrupoRubroEmplea.gridx = iPosXAccion++;
			
		this.jPanelAccionesTipoGrupoRubroEmplea.add(this.jButtonModificarTipoGrupoRubroEmplea, this.gridBagConstraintsTipoGrupoRubroEmplea);							

		this.gridBagConstraintsTipoGrupoRubroEmplea = new GridBagConstraints();
		this.gridBagConstraintsTipoGrupoRubroEmplea.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoGrupoRubroEmplea.gridy = 0;
		this.gridBagConstraintsTipoGrupoRubroEmplea.gridx =iPosXAccion++;
			
		this.jPanelAccionesTipoGrupoRubroEmplea.add(this.jButtonEliminarTipoGrupoRubroEmplea, this.gridBagConstraintsTipoGrupoRubroEmplea);
		
			
		this.gridBagConstraintsTipoGrupoRubroEmplea = new GridBagConstraints();
		this.gridBagConstraintsTipoGrupoRubroEmplea.gridy = 0;		
		this.gridBagConstraintsTipoGrupoRubroEmplea.gridx = iPosXAccion++;
		
		this.jPanelAccionesTipoGrupoRubroEmplea.add(this.jButtonActualizarTipoGrupoRubroEmplea, this.gridBagConstraintsTipoGrupoRubroEmplea);


		this.gridBagConstraintsTipoGrupoRubroEmplea = new GridBagConstraints();
		this.gridBagConstraintsTipoGrupoRubroEmplea.gridy = 0;		
		this.gridBagConstraintsTipoGrupoRubroEmplea.gridx = iPosXAccion++;
		
		this.jPanelAccionesTipoGrupoRubroEmplea.add(this.jButtonGuardarCambiosTipoGrupoRubroEmplea, this.gridBagConstraintsTipoGrupoRubroEmplea);	
		
		this.gridBagConstraintsTipoGrupoRubroEmplea = new GridBagConstraints();
		this.gridBagConstraintsTipoGrupoRubroEmplea.gridy = 0;		
		this.gridBagConstraintsTipoGrupoRubroEmplea.gridx =iPosXAccion++;
		
		this.jPanelAccionesTipoGrupoRubroEmplea.add(this.jButtonCancelarTipoGrupoRubroEmplea, this.gridBagConstraintsTipoGrupoRubroEmplea);
		
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutTipoGrupoRubroEmplea = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutTipoGrupoRubroEmplea);
		
		if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.tipogruporubroempleaSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsTipoGrupoRubroEmplea = new GridBagConstraints();						
			this.gridBagConstraintsTipoGrupoRubroEmplea.gridy = iGridyPrincipal++;
			this.gridBagConstraintsTipoGrupoRubroEmplea.gridx = 0;		
			//this.gridBagConstraintsTipoGrupoRubroEmplea.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoGrupoRubroEmplea.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsTipoGrupoRubroEmplea.ipadx = 100;
				
			
		}
		
		//PROCESANDO EN OTRA PANTALLA
		
		
		int iGridxBusquedasParametros=0;
		
	
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			//NO BUSQUEDA
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		
		this.gridBagConstraintsTipoGrupoRubroEmplea = new GridBagConstraints();
		this.gridBagConstraintsTipoGrupoRubroEmplea.gridy =iGridyPrincipal++;
		this.gridBagConstraintsTipoGrupoRubroEmplea.gridx =0;
		this.gridBagConstraintsTipoGrupoRubroEmplea.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsTipoGrupoRubroEmplea.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosTipoGrupoRubroEmplea, this.gridBagConstraintsTipoGrupoRubroEmplea);
				
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);

		
			
		//if(TipoGrupoRubroEmpleaJInternalFrame.CON_DATOS_FRAME) {				
			//this.jInternalFrameDetalleTipoGrupoRubroEmplea = new TipoGrupoRubroEmpleaBeanSwingJInternalFrameAdditional();//JInternalFrameBase("Tipo Grupo Rubro Empleado DATOS");
			
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
			
	        //this.setTitle("[FOR] - Tipo Grupo Rubro Empleado DATOS");
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Tipo Grupo Rubro Empleado Formulario",PaginaTipo.FORMULARIO,paginaTipo));			
	        this.setSize(iWidthFormulario,iHeightFormulario);        
		   				
			this.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	        this.setResizable(true);
	        this.setClosable(true);
	        this.setMaximizable(true);
		    
			TipoGrupoRubroEmpleaModel tipogruporubroempleaModel=new TipoGrupoRubroEmpleaModel(this);
			
			//SI USARA CLASE INTERNA
			//TipoGrupoRubroEmpleaModel.TipoGrupoRubroEmpleaFocusTraversalPolicy tipogruporubroempleaFocusTraversalPolicy = tipogruporubroempleaModel.new TipoGrupoRubroEmpleaFocusTraversalPolicy(this);
			
			//tipogruporubroempleaFocusTraversalPolicy.settipogruporubroempleaJInternalFrame(this);
			
			this.setFocusTraversalPolicy(tipogruporubroempleaModel);
			
			
			this.jContentPaneDetalleTipoGrupoRubroEmplea = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			GridBagLayout gridaBagLayoutDetalleTipoGrupoRubroEmplea = new GridBagLayout();	
			this.jContentPaneDetalleTipoGrupoRubroEmplea.setLayout(gridaBagLayoutDetalleTipoGrupoRubroEmplea);
			
			GridBagLayout gridaBagLayoutBusquedasParametrosTipoGrupoRubroEmplea = new GridBagLayout();
			
			
if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
				
				//AGREGA TOOLBAR DETALLE A PANTALLA
				
				this.gridBagConstraintsTipoGrupoRubroEmplea = new GridBagConstraints();
				this.gridBagConstraintsTipoGrupoRubroEmplea.gridy = iGridyRelaciones++;		
				this.gridBagConstraintsTipoGrupoRubroEmplea.gridx = 0;
					
				
				this.jContentPaneDetalleTipoGrupoRubroEmplea.add(jTtoolBarDetalleTipoGrupoRubroEmplea, gridBagConstraintsTipoGrupoRubroEmplea);								
				
}
			
			this.jScrollPanelDatosEdicionTipoGrupoRubroEmplea=   new JScrollPane(jContentPaneDetalleTipoGrupoRubroEmplea,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionTipoGrupoRubroEmplea.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionTipoGrupoRubroEmplea.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionTipoGrupoRubroEmplea.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			this.jScrollPanelDatosGeneralTipoGrupoRubroEmplea=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralTipoGrupoRubroEmplea.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralTipoGrupoRubroEmplea.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralTipoGrupoRubroEmplea.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsTipoGrupoRubroEmplea = new GridBagConstraints();
			
			
	        this.gridBagConstraintsTipoGrupoRubroEmplea.gridy = iGridyRelaciones++;		
	        this.gridBagConstraintsTipoGrupoRubroEmplea.gridx = 0;
	        
			this.jContentPaneDetalleTipoGrupoRubroEmplea.add(jPanelCamposTipoGrupoRubroEmplea, gridBagConstraintsTipoGrupoRubroEmplea);
			
			
			
			
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
						&& tipogruporubroempleaSessionBean.getConGuardarRelaciones()
						) {
					
					if(this.tipogruporubroempleaSessionBean.getConGuardarRelaciones()) {
						this.gridBagConstraintsTipoGrupoRubroEmplea= new GridBagConstraints();
						this.gridBagConstraintsTipoGrupoRubroEmplea.gridy = iGridyRelaciones++;
						this.gridBagConstraintsTipoGrupoRubroEmplea.gridx = 0;
						this.jContentPaneDetalleTipoGrupoRubroEmplea.add(this.jTabbedPaneRelacionesTipoGrupoRubroEmplea, this.gridBagConstraintsTipoGrupoRubroEmplea);
					}
					
					//RELACIONES OTROS AGRUPADOS
					;
					
					} else {
						//this.jButtonNuevoRelacionesTipoGrupoRubroEmplea.setVisible(false);
					}
				}
			}
			
			Boolean tieneColumnasOcultas=false;
			
		
						
			
			if(!Constantes.ISDEVELOPING) {
	       		this.jPanelCamposOcultosTipoGrupoRubroEmplea.setVisible(false);
			} else {
				if(tieneColumnasOcultas) {
					this.gridBagConstraintsTipoGrupoRubroEmplea = new GridBagConstraints();
					this.gridBagConstraintsTipoGrupoRubroEmplea.fill=GridBagConstraints.NONE;
					this.gridBagConstraintsTipoGrupoRubroEmplea.anchor = GridBagConstraints.WEST;
					
					this.gridBagConstraintsTipoGrupoRubroEmplea.gridy = iGridyRelaciones++;		
					this.gridBagConstraintsTipoGrupoRubroEmplea.gridx = 0;
					
				
					this.jContentPaneDetalleTipoGrupoRubroEmplea.add(jPanelCamposOcultosTipoGrupoRubroEmplea, gridBagConstraintsTipoGrupoRubroEmplea);
				
					this.jPanelCamposOcultosTipoGrupoRubroEmplea.setVisible(true);
				}
			}					
			
			
			
			
			this.gridBagConstraintsTipoGrupoRubroEmplea = new GridBagConstraints();
			this.gridBagConstraintsTipoGrupoRubroEmplea.gridy = iGridyRelaciones++;//1;		
	        this.gridBagConstraintsTipoGrupoRubroEmplea.gridx = 0;
	        this.gridBagConstraintsTipoGrupoRubroEmplea.anchor = GridBagConstraints.CENTER;//WEST;
			
			
			
			this.jContentPaneDetalleTipoGrupoRubroEmplea.add(this.jPanelAccionesFormularioTipoGrupoRubroEmplea, this.gridBagConstraintsTipoGrupoRubroEmplea);							
			
			
			
			this.gridBagConstraintsTipoGrupoRubroEmplea = new GridBagConstraints();
	        this.gridBagConstraintsTipoGrupoRubroEmplea.gridy = iGridyRelaciones;//1;		
	        this.gridBagConstraintsTipoGrupoRubroEmplea.gridx = 0;
	        
			
			this.jContentPaneDetalleTipoGrupoRubroEmplea.add(this.jPanelAccionesTipoGrupoRubroEmplea, this.gridBagConstraintsTipoGrupoRubroEmplea);							
			
	        //this.setContentPane(jScrollPanelDatosEdicionTipoGrupoRubroEmplea);
			
		//} else {
			//DISENO_DETALLE COMENTAR Y
			//DISENO_DETALLE(Solo Descomentar Seccion Inferior)
			//NOTA-DISENO_DETALLE(Si cambia lo de abajo, cambiar lo comentado, Al final no es lo mismo)
			
			/*
			this.jScrollPanelDatosEdicionTipoGrupoRubroEmplea=   new JScrollPane(this.jPanelCamposTipoGrupoRubroEmplea,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionTipoGrupoRubroEmplea.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionTipoGrupoRubroEmplea.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionTipoGrupoRubroEmplea.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			
			this.gridBagConstraintsTipoGrupoRubroEmplea = new GridBagConstraints();
			this.gridBagConstraintsTipoGrupoRubroEmplea.gridy = iGridyPrincipal++;		
			this.gridBagConstraintsTipoGrupoRubroEmplea.gridx = 0;
			this.gridBagConstraintsTipoGrupoRubroEmplea.fill = GridBagConstraints.BOTH;
			this.gridBagConstraintsTipoGrupoRubroEmplea.ipady = this.getSize().height-yOffset*3;
			this.gridBagConstraintsTipoGrupoRubroEmplea.anchor = GridBagConstraints.WEST;
			
			this.jContentPane.add(this.jScrollPanelDatosEdicionTipoGrupoRubroEmplea, this.gridBagConstraintsTipoGrupoRubroEmplea);
			
			//ACCIONES FORMULARIO
			this.gridBagConstraintsTipoGrupoRubroEmplea = new GridBagConstraints();
			this.gridBagConstraintsTipoGrupoRubroEmplea.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsTipoGrupoRubroEmplea.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesFormularioTipoGrupoRubroEmplea, this.gridBagConstraintsTipoGrupoRubroEmplea);			
			
			this.gridBagConstraintsTipoGrupoRubroEmplea = new GridBagConstraints();
			this.gridBagConstraintsTipoGrupoRubroEmplea.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsTipoGrupoRubroEmplea.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesTipoGrupoRubroEmplea, this.gridBagConstraintsTipoGrupoRubroEmplea);									
			*/
		//}								
			
		//DISENO_DETALLE-(Descomentar)
		/*
		this.gridBagConstraintsTipoGrupoRubroEmplea = new GridBagConstraints();
		this.gridBagConstraintsTipoGrupoRubroEmplea.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoGrupoRubroEmplea.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposTipoGrupoRubroEmplea, this.gridBagConstraintsTipoGrupoRubroEmplea);
			
			
		this.gridBagConstraintsTipoGrupoRubroEmplea = new GridBagConstraints();
		this.gridBagConstraintsTipoGrupoRubroEmplea.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoGrupoRubroEmplea.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosTipoGrupoRubroEmplea, this.gridBagConstraintsTipoGrupoRubroEmplea);
		
			
		this.gridBagConstraintsTipoGrupoRubroEmplea = new GridBagConstraints();
		this.gridBagConstraintsTipoGrupoRubroEmplea.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsTipoGrupoRubroEmplea.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesTipoGrupoRubroEmplea, this.gridBagConstraintsTipoGrupoRubroEmplea);
		*/
		
			
     	//pack();
		
		
		//return this.jScrollPanelDatosGeneralTipoGrupoRubroEmplea;//jContentPane;
		
		return jScrollPanelDatosEdicionTipoGrupoRubroEmplea;
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
