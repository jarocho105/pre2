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


import com.bydan.erp.cartera.presentation.swing.jinternalframes.*;
import com.bydan.erp.seguridad.presentation.swing.jinternalframes.*;
import com.bydan.erp.nomina.presentation.swing.jinternalframes.*;
import com.bydan.erp.contabilidad.presentation.swing.jinternalframes.*;
import com.bydan.erp.comisiones.presentation.swing.jinternalframes.*;
import com.bydan.erp.inventario.presentation.swing.jinternalframes.*;
import com.bydan.erp.sris.presentation.swing.jinternalframes.*;
import com.bydan.erp.facturacion.presentation.swing.jinternalframes.*;
import com.bydan.erp.tesoreria.presentation.swing.jinternalframes.*;
import com.bydan.erp.puntoventa.presentation.swing.jinternalframes.*;
import com.bydan.erp.activosfijos.presentation.swing.jinternalframes.*;
import com.bydan.erp.importaciones.presentation.swing.jinternalframes.*;
import com.bydan.erp.produccion.presentation.swing.jinternalframes.*;

import com.bydan.erp.nomina.presentation.web.jsf.sessionbean.*;//;
import com.bydan.erp.nomina.presentation.swing.jinternalframes.*;
import com.bydan.erp.nomina.presentation.swing.jinternalframes.auxiliar.*;


import com.bydan.erp.cartera.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.nomina.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.contabilidad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.comisiones.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.inventario.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.sris.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.facturacion.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.tesoreria.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.puntoventa.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.activosfijos.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.importaciones.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.produccion.presentation.web.jsf.sessionbean.*;

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
import com.bydan.erp.nomina.util.ProfesionConstantesFunciones;

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
public class ProfesionDetalleFormJInternalFrame extends ProfesionBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	
	
	public JToolBar jTtoolBarDetalleProfesion;
	
	protected JMenuBar jmenuBarDetalleProfesion;
	
	protected JMenu jmenuDetalleProfesion;
	protected JMenu jmenuDetalleArchivoProfesion;
	protected JMenu jmenuDetalleAccionesProfesion;
	protected JMenu jmenuDetalleDatosProfesion;
	
	
	
	protected JPanel jContentPane = null;
	protected JPanel jContentPaneDetalleProfesion = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutProfesion;	
	protected GridBagConstraints gridBagConstraintsProfesion;	
		
	//protected JInternalFrameBase jInternalFrameParent; //ESTA EN BASE
	//protected ProfesionBeanSwingJInternalFrameAdditional jInternalFrameDetalleProfesion;		
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	
	
	public ProfesionSessionBean profesionSessionBean;
	
	

	public ClienteBeanSwingJInternalFrame clienteBeanSwingJInternalFrame=null;
	public ClienteBeanSwingJInternalFrame clienteBeanSwingJInternalFramePopup=null;
	public Boolean puedeCargarPorParteCliente=false;
	public ClienteSessionBean clienteSessionBean;

	public ProfesionEmpleaBeanSwingJInternalFrame profesionempleaBeanSwingJInternalFrame=null;
	public ProfesionEmpleaBeanSwingJInternalFrame profesionempleaBeanSwingJInternalFramePopup=null;
	public Boolean puedeCargarPorParteProfesionEmplea=false;
	public ProfesionEmpleaSessionBean profesionempleaSessionBean;

	public ReferenciaBeanSwingJInternalFrame referenciaBeanSwingJInternalFrame=null;
	public ReferenciaBeanSwingJInternalFrame referenciaBeanSwingJInternalFramePopup=null;
	public Boolean puedeCargarPorParteReferencia=false;
	public ReferenciaSessionBean referenciaSessionBean;
	
		
	
	public ProfesionLogic profesionLogic;
	
	public JScrollPane jScrollPanelDatosProfesion;
	public JScrollPane jScrollPanelDatosEdicionProfesion;
	public JScrollPane jScrollPanelDatosGeneralProfesion;
	
	protected JPanel jPanelCamposProfesion;    
	protected JPanel jPanelCamposOcultosProfesion;    	
	protected JPanel jPanelAccionesProfesion;
	protected JPanel jPanelAccionesFormularioProfesion;
    
	
	
	protected Integer iXPanelCamposProfesion=0;
	protected Integer iYPanelCamposProfesion=0;
	
	protected Integer iXPanelCamposOcultosProfesion=0;
	protected Integer iYPanelCamposOcultosProfesion=0;
	
	;
	;
	
		
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	public JButton jButtonNuevoProfesion;
	public JButton jButtonModificarProfesion;
	public JButton jButtonActualizarProfesion;
    public JButton jButtonEliminarProfesion;
	public JButton jButtonCancelarProfesion;
    public JButton jButtonGuardarCambiosProfesion;
	public JButton jButtonGuardarCambiosTablaProfesion;
	protected JButton jButtonCerrarProfesion;
	
	
	protected JButton jButtonProcesarInformacionProfesion;
	
	
	protected JCheckBox jCheckBoxPostAccionNuevoProfesion;
	protected JCheckBox jCheckBoxPostAccionSinCerrarProfesion;
	protected JCheckBox jCheckBoxPostAccionSinMensajeProfesion;
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarProfesion;
	protected JButton jButtonModificarToolBarProfesion;
	protected JButton jButtonActualizarToolBarProfesion;
    protected JButton jButtonEliminarToolBarProfesion;
	protected JButton jButtonCancelarToolBarProfesion;
    protected JButton jButtonGuardarCambiosToolBarProfesion;
	protected JButton jButtonGuardarCambiosTablaToolBarProfesion;
	protected JButton jButtonMostrarOcultarTablaToolBarProfesion;
	protected JButton jButtonCerrarToolBarProfesion;
	
	protected JButton jButtonProcesarInformacionToolBarProfesion;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoProfesion;
	protected JMenuItem jMenuItemModificarProfesion;
	protected JMenuItem jMenuItemActualizarProfesion;
    protected JMenuItem jMenuItemEliminarProfesion;
	protected JMenuItem jMenuItemCancelarProfesion;
    protected JMenuItem jMenuItemGuardarCambiosProfesion;
	protected JMenuItem jMenuItemGuardarCambiosTablaProfesion;
	protected JMenuItem jMenuItemCerrarProfesion;
	protected JMenuItem jMenuItemDetalleCerrarProfesion;
	protected JMenuItem jMenuItemDetalleMostarOcultarProfesion;
	
	protected JMenuItem jMenuItemProcesarInformacionProfesion;
	protected JMenuItem jMenuItemNuevoGuardarCambiosProfesion;
	protected JMenuItem jMenuItemMostrarOcultarProfesion;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesProfesion;	
		
	
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesProfesion;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesProfesion;
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxTiposAccionesFormularioProfesion;
	
		
	
	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	public JPanel jPanelidProfesion;
	public JLabel jLabelIdProfesion;
	public JTextFieldMe jTextFieldidProfesion;
	public JButton jButtonidProfesionBusqueda= new JButtonMe();

	public JPanel jPanelcodigoProfesion;
	public JLabel jLabelcodigoProfesion;
	public JTextField jTextFieldcodigoProfesion;
	public JButton jButtoncodigoProfesionBusqueda= new JButtonMe();

	public JPanel jPanelnombreProfesion;
	public JLabel jLabelnombreProfesion;
	public JTextArea jTextAreanombreProfesion;
	public JScrollPane jscrollPanenombreProfesion;
	public JButton jButtonnombreProfesionBusqueda= new JButtonMe();

	
	
	
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JTabbedPane jTabbedPaneRelacionesProfesion;
	
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
	
	public ProfesionDetalleFormJInternalFrame(String sTipo) throws Exception {
		super(PaginaTipo.FORMULARIO);
       
		try {
			
	  		if(sTipo.equals("MINIMO")) {
				/*
				this.jPanelCamposProfesion=new JPanel();
				this.jPanelAccionesFormularioProfesion=new JPanel();
				this.jmenuBarDetalleProfesion=new JMenuBar();
				this.jTtoolBarDetalleProfesion=new JToolBar();
				*/
	  		}
	  		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ProfesionDetalleFormJInternalFrame(PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo); 
		
		//super("Profesion No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	//ES AUXILIAR PARA WINDOWS FORMS
	public ProfesionDetalleFormJInternalFrame() throws Exception {
		super(PaginaTipo.FORMULARIO);
        //super("Profesion No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ProfesionDetalleFormJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("Profesion No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ProfesionDetalleFormJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("Profesion No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ProfesionDetalleFormJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("Profesion No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	public JButton getjButtonActualizarToolBarProfesion() {
		return this.jButtonActualizarToolBarProfesion;
	}
	
	public JButton getjButtonEliminarToolBarProfesion() {
		return this.jButtonEliminarToolBarProfesion;
	}
	
	public JButton getjButtonCancelarToolBarProfesion() {
		return this.jButtonCancelarToolBarProfesion;
	}		
	
	public JButton getjButtonProcesarInformacionProfesion() {
		return this.jButtonProcesarInformacionProfesion;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionProfesion)	{
		this.jButtonProcesarInformacionProfesion = jButtonProcesarInformacionProfesion;
	}
	
	
	

	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesProfesion() {
		return this.jComboBoxTiposAccionesProfesion;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesProfesion(
			JComboBox jComboBoxTiposRelacionesProfesion) {
		this.jComboBoxTiposRelacionesProfesion = jComboBoxTiposRelacionesProfesion;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesProfesion(
			JComboBox jComboBoxTiposAccionesProfesion) {
		this.jComboBoxTiposAccionesProfesion = jComboBoxTiposAccionesProfesion;
	}		
	
			
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesFormularioProfesion() {
		return this.jComboBoxTiposAccionesFormularioProfesion;
	}				
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesFormularioProfesion(
			JComboBox jComboBoxTiposAccionesFormularioProfesion) {
		this.jComboBoxTiposAccionesFormularioProfesion = jComboBoxTiposAccionesFormularioProfesion;
	}
	
	private void initialize(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		this.profesionSessionBean=new ProfesionSessionBean();
		
		this.profesionSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.profesionSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.profesionSessionBean.getEsGuardarRelacionado();				
		
		this.conMostrarAccionesCampo=parametroGeneralUsuario.getcon_mostrar_acciones_campo_general() || opcionActual.getcon_mostrar_acciones_campo();
		
		
		if(!this.conCargarMinimo) {
		
		//this.clienteSessionBean=new ClienteSessionBean();
		//this.profesionempleaSessionBean=new ProfesionEmpleaSessionBean();
		//this.referenciaSessionBean=new ReferenciaSessionBean();
		}
		
			
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		ProfesionJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		ProfesionJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		ProfesionJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Profesion MANTENIMIENTO"));
		
		
		if(iWidth > 650) {
			iWidth=650;
		}
		
		if(iHeight > 1110) {
			iHeight=1110;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
		
		if(!this.profesionSessionBean.getEsGuardarRelacionado()) {
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
	
		ProfesionJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarDetalleProfesion= new JToolBar("MENU DATOS");		
		
		//TOOLBAR
		//PRINCIPAL				
				this.jButtonProcesarInformacionToolBarProfesion=new JButtonMe();
				this.jButtonModificarToolBarProfesion=new JButtonMe();							
		//PRINCIPAL
		
		//DETALLE
		this.jButtonActualizarToolBarProfesion=FuncionesSwing.getButtonToolBarGeneral(this.jButtonActualizarToolBarProfesion,this.jTtoolBarDetalleProfesion,
							"actualizar","actualizar","Actualizar"+" "+ProfesionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"),"Actualizar",false);
		
		
		
		
		this.jButtonEliminarToolBarProfesion=FuncionesSwing.getButtonToolBarGeneral(this.jButtonEliminarToolBarProfesion,this.jTtoolBarDetalleProfesion,
							"eliminar","eliminar","Eliminar"+" "+ProfesionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"),"Eliminar",false);
		
		
		
		
		this.jButtonCancelarToolBarProfesion=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCancelarToolBarProfesion,this.jTtoolBarDetalleProfesion,
							"cancelar","cancelar","Cancelar"+" "+ProfesionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"),"Cancelar",false);
		
		
		
		
		this.jButtonGuardarCambiosToolBarProfesion=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosToolBarProfesion,this.jTtoolBarDetalleProfesion,
							"guardarcambios","guardarcambios","Guardar"+" "+ProfesionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		
		FuncionesSwing.setBoldButtonToolBar(this.jButtonActualizarToolBarProfesion,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonEliminarToolBarProfesion,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonCancelarToolBarProfesion,STIPO_TAMANIO_GENERAL,false,false,this);
	}
	
	
	
	public void cargarMenus() {		
		
		this.jmenuBarDetalleProfesion=new JMenuBarMe();
		
		//DETALLE
		this.jmenuDetalleProfesion=new JMenuMe("Datos Relacionados");
		this.jmenuDetalleArchivoProfesion=new JMenuMe("Archivo");
		this.jmenuDetalleAccionesProfesion=new JMenuMe("Acciones");
		this.jmenuDetalleDatosProfesion=new JMenuMe("Datos");
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoProfesion= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoProfesion.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoProfesion,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoProfesion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemModificarProfesion= new JMenuItem("Editar" + FuncionesSwing.getKeyMensaje("MODIFICAR"));
		this.jMenuItemModificarProfesion.setActionCommand("Editar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemModificarProfesion,"modificar_button","Editar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemModificarProfesion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemActualizarProfesion= new JMenuItem("Actualizar" + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
		this.jMenuItemActualizarProfesion.setActionCommand("Actualizar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemActualizarProfesion,"actualizar_button","Actualizar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemActualizarProfesion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemEliminarProfesion= new JMenuItem("Eliminar" + FuncionesSwing.getKeyMensaje("ELIMINAR"));
		this.jMenuItemEliminarProfesion.setActionCommand("Eliminar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemEliminarProfesion,"eliminar_button","Eliminar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemEliminarProfesion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCancelarProfesion= new JMenuItem("Cancelar" + FuncionesSwing.getKeyMensaje("CANCELAR"));
		this.jMenuItemCancelarProfesion.setActionCommand("Cancelar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCancelarProfesion,"cancelar_button","Cancelar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCancelarProfesion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosProfesion= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosProfesion.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosProfesion,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosProfesion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarProfesion= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarProfesion.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarProfesion,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarProfesion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleCerrarProfesion= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemDetalleCerrarProfesion.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleCerrarProfesion,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleCerrarProfesion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarProfesion= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarProfesion.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarProfesion,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarProfesion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarProfesion= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarProfesion.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarProfesion,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarProfesion, STIPO_TAMANIO_GENERAL,false,true,this);			
		
		//DETALLE
		this.jmenuDetalleArchivoProfesion.add(this.jMenuItemDetalleCerrarProfesion);
		
		this.jmenuDetalleAccionesProfesion.add(this.jMenuItemActualizarProfesion);
		this.jmenuDetalleAccionesProfesion.add(this.jMenuItemEliminarProfesion);
		this.jmenuDetalleAccionesProfesion.add(this.jMenuItemCancelarProfesion);		
		
		//this.jmenuDetalleDatosProfesion.add(this.jMenuItemDetalleAbrirOrderByProfesion);				
		this.jmenuDetalleDatosProfesion.add(this.jMenuItemDetalleMostarOcultarProfesion);				
				
		//this.jmenuDetalleAccionesProfesion.add(this.jMenuItemGuardarCambiosProfesion);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES				
		
		//DETALLE
		FuncionesSwing.setBoldMenu(this.jmenuDetalleArchivoProfesion, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleAccionesProfesion, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleDatosProfesion, STIPO_TAMANIO_GENERAL,false,true,this);
			
		this.jmenuBarDetalleProfesion.add(this.jmenuDetalleArchivoProfesion);		
		this.jmenuBarDetalleProfesion.add(this.jmenuDetalleAccionesProfesion);		
		this.jmenuBarDetalleProfesion.add(this.jmenuDetalleDatosProfesion);		
		
		//MENU RELACIONES
		if(!this.conCargarMinimo) {
			FuncionesSwing.setBoldMenu(this.jmenuDetalleProfesion, STIPO_TAMANIO_GENERAL,false,true,this);
			
			this.jmenuBarDetalleProfesion.add(this.jmenuDetalleProfesion);		
		}
		//DETALLE_FIN
		
		
		//AGREGA MENU DETALLE A PANTALLA
		this.setJMenuBar(this.jmenuBarDetalleProfesion);				
	}
	
	
	public void inicializarElementosCamposProfesion() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		jLabelIdProfesion = new JLabelMe();
		jLabelIdProfesion.setText(""+Constantes2.S_CODIGO_UNICO+"");
		jLabelIdProfesion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdProfesion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdProfesion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelIdProfesion,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jPanelidProfesion = new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelidProfesion.setToolTipText(ProfesionConstantesFunciones.LABEL_ID);
		this.gridaBagLayoutProfesion= new GridBagLayout();

		this.jPanelidProfesion.setLayout(this.gridaBagLayoutProfesion);

		jTextFieldidProfesion = new JTextFieldMe();
		jTextFieldidProfesion.setText("Id");

		jTextFieldidProfesion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jTextFieldidProfesion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jTextFieldidProfesion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));



					
		this.jLabelcodigoProfesion = new JLabelMe();
		this.jLabelcodigoProfesion.setText(""+ProfesionConstantesFunciones.LABEL_CODIGO+" : *");
		this.jLabelcodigoProfesion.setToolTipText("Codigo");
		this.jLabelcodigoProfesion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcodigoProfesion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcodigoProfesion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelcodigoProfesion,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelcodigoProfesion=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelcodigoProfesion.setToolTipText(ProfesionConstantesFunciones.LABEL_CODIGO);
		this.gridaBagLayoutProfesion = new GridBagLayout();
		this.jPanelcodigoProfesion.setLayout(this.gridaBagLayoutProfesion);


		jTextFieldcodigoProfesion= new JTextFieldMe();

		jTextFieldcodigoProfesion.setEnabled(false);
		jTextFieldcodigoProfesion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcodigoProfesion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcodigoProfesion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldcodigoProfesion,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtoncodigoProfesionBusqueda= new JButtonMe();
		this.jButtoncodigoProfesionBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncodigoProfesionBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncodigoProfesionBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtoncodigoProfesionBusqueda.setText("U");
		this.jButtoncodigoProfesionBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtoncodigoProfesionBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtoncodigoProfesionBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldcodigoProfesion.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldcodigoProfesion.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"codigoProfesionBusqueda"));

		if(this.profesionSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtoncodigoProfesionBusqueda.setVisible(false);		}


					
		this.jLabelnombreProfesion = new JLabelMe();
		this.jLabelnombreProfesion.setText(""+ProfesionConstantesFunciones.LABEL_NOMBRE+" : *");
		this.jLabelnombreProfesion.setToolTipText("Nombre");
		this.jLabelnombreProfesion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnombreProfesion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnombreProfesion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelnombreProfesion,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelnombreProfesion=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelnombreProfesion.setToolTipText(ProfesionConstantesFunciones.LABEL_NOMBRE);
		this.gridaBagLayoutProfesion = new GridBagLayout();
		this.jPanelnombreProfesion.setLayout(this.gridaBagLayoutProfesion);


		jTextAreanombreProfesion= new JTextAreaMe();
		jTextAreanombreProfesion.setEnabled(false);
		jTextAreanombreProfesion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreProfesion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreProfesion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreProfesion.setLineWrap(true);
		jTextAreanombreProfesion.setWrapStyleWord(true);
		jTextAreanombreProfesion.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreanombreProfesion.setRows(5);

		FuncionesSwing.setBoldTextArea(jTextAreanombreProfesion,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPanenombreProfesion = new JScrollPane(jTextAreanombreProfesion);
		jscrollPanenombreProfesion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanenombreProfesion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanenombreProfesion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));

		this.jButtonnombreProfesionBusqueda= new JButtonMe();
		this.jButtonnombreProfesionBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombreProfesionBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombreProfesionBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonnombreProfesionBusqueda.setText("U");
		this.jButtonnombreProfesionBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonnombreProfesionBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonnombreProfesionBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreanombreProfesion.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreanombreProfesion.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"nombreProfesionBusqueda"));

		if(this.profesionSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonnombreProfesionBusqueda.setVisible(false);		}


	}
	
	public void inicializarElementosCamposForeigKeysProfesion() {
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
		//this.jInternalFrameDetalleProfesion = new ProfesionBeanSwingJInternalFrameAdditional(paginaTipo);//JInternalFrameBase("Profesion DATOS");
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutProfesion= new GridBagLayout();
		

		
		String sToolTipProfesion="";
		sToolTipProfesion=ProfesionConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipProfesion+="(Nomina.Profesion)";
		}
		
		if(!this.profesionSessionBean.getEsGuardarRelacionado()) {
			sToolTipProfesion+="_"+this.opcionActual.getId();
		}
								
		
		this.jButtonNuevoProfesion = new JButtonMe();
		this.jButtonModificarProfesion = new JButtonMe();
        this.jButtonActualizarProfesion = new JButtonMe();
        this.jButtonEliminarProfesion = new JButtonMe();
        this.jButtonCancelarProfesion = new JButtonMe();
        this.jButtonGuardarCambiosProfesion = new JButtonMe();
		this.jButtonGuardarCambiosTablaProfesion = new JButtonMe();
		this.jButtonCerrarProfesion = new JButtonMe();
		
		this.jScrollPanelDatosProfesion = new JScrollPane();   
        this.jScrollPanelDatosEdicionProfesion = new JScrollPane();
		this.jScrollPanelDatosGeneralProfesion = new JScrollPane();
				
		
		
		this.jPanelCamposProfesion = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelCamposOcultosProfesion = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
        this.jPanelAccionesProfesion = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		this.jPanelAccionesFormularioProfesion = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		this.sPath=" <---> Acceso: Profesion";
		
		if(!this.profesionSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosProfesion.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Profesiones" + this.sPath));
		} else {
			this.jScrollPanelDatosProfesion.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosEdicionProfesion.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		this.jScrollPanelDatosGeneralProfesion.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
			
        this.jPanelCamposProfesion.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
        this.jPanelCamposProfesion.setName("jPanelCamposProfesion"); 

		this.jPanelCamposOcultosProfesion.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos Ocultos"));
        this.jPanelCamposOcultosProfesion.setName("jPanelCamposOcultosProfesion"); 

        this.jPanelAccionesProfesion.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesProfesion.setToolTipText("Acciones");
        this.jPanelAccionesProfesion.setName("Acciones"); 

		this.jPanelAccionesFormularioProfesion.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones Extra/Post"));
        this.jPanelAccionesFormularioProfesion.setToolTipText("Acciones");
        this.jPanelAccionesFormularioProfesion.setName("Acciones"); 
		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosEdicionProfesion, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralProfesion, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosProfesion, STIPO_TAMANIO_GENERAL,false,false,this);		
		FuncionesSwing.setBoldPanel(this.jPanelCamposProfesion, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelCamposOcultosProfesion, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelAccionesFormularioProfesion, STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {
		
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		
        this.jButtonNuevoProfesion.setText("Nuevo");
		this.jButtonModificarProfesion.setText("Editar");
        this.jButtonActualizarProfesion.setText("Actualizar");
        this.jButtonEliminarProfesion.setText("Eliminar");
        this.jButtonCancelarProfesion.setText("Cancelar");
        this.jButtonGuardarCambiosProfesion.setText("Guardar");
		this.jButtonGuardarCambiosTablaProfesion.setText("Guardar");
		this.jButtonCerrarProfesion.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoProfesion,"nuevo_button","Nuevo",this.profesionSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonModificarProfesion,"modificar_button","Editar",this.profesionSessionBean.getEsGuardarRelacionado());
       	FuncionesSwing.addImagenButtonGeneral(this.jButtonActualizarProfesion,"actualizar_button","Actualizar",this.profesionSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonEliminarProfesion,"eliminar_button","Eliminar",this.profesionSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonCancelarProfesion,"cancelar_button","Cancelar",this.profesionSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosProfesion,"guardarcambios_button","Guardar",this.profesionSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaProfesion,"guardarcambiostabla_button","Guardar",this.profesionSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarProfesion,"cerrar_button","Salir",this.profesionSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoProfesion, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonModificarProfesion, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosProfesion, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaProfesion, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarProfesion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		FuncionesSwing.setBoldButton(this.jButtonActualizarProfesion, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonEliminarProfesion, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonCancelarProfesion, STIPO_TAMANIO_GENERAL,false,false,this);
		
		this.jButtonNuevoProfesion.setToolTipText("Nuevo"+" "+ProfesionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonModificarProfesion.setToolTipText("Editar"+" "+ProfesionConstantesFunciones.SCLASSWEBTITULO+"");// + FuncionesSwing.getKeyMensaje("MODIFICAR"))
        this.jButtonActualizarProfesion.setToolTipText("Actualizar"+" "+ProfesionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
        this.jButtonEliminarProfesion.setToolTipText("Eliminar)"+" "+ProfesionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"));
        this.jButtonCancelarProfesion.setToolTipText("Cancelar"+" "+ProfesionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"));
        this.jButtonGuardarCambiosProfesion.setToolTipText("Guardar"+" "+ProfesionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonGuardarCambiosTablaProfesion.setToolTipText("Guardar"+" "+ProfesionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarProfesion.setToolTipText("Salir"+" "+ProfesionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoProfesion";
		inputMap = this.jButtonNuevoProfesion.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoProfesion.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoProfesion"));
		
		//ACTUALIZAR
		sMapKey = "ActualizarProfesion";
		inputMap = this.jButtonActualizarProfesion.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ACTUALIZAR") , FuncionesSwing.getMaskKey("ACTUALIZAR")), sMapKey);
		
		this.jButtonActualizarProfesion.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ActualizarProfesion"));
		
		//ELIMINAR
		sMapKey = "EliminarProfesion";
		inputMap = this.jButtonEliminarProfesion.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ELIMINAR") , FuncionesSwing.getMaskKey("ELIMINAR")), sMapKey);
		
		this.jButtonEliminarProfesion.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"EliminarProfesion"));
		
		//CANCELAR	
		sMapKey = "CancelarProfesion";
		inputMap = this.jButtonCancelarProfesion.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CANCELAR") , FuncionesSwing.getMaskKey("CANCELAR")), sMapKey);
		
		this.jButtonCancelarProfesion.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CancelarProfesion"));
		
		//CERRAR		
		sMapKey = "CerrarProfesion";
		inputMap = this.jButtonCerrarProfesion.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarProfesion.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarProfesion"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaProfesion";
		inputMap = this.jButtonGuardarCambiosTablaProfesion.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaProfesion.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaProfesion"));
		
		//HOT KEYS
		
		this.jCheckBoxPostAccionNuevoProfesion = new JCheckBoxMe();
		this.jCheckBoxPostAccionNuevoProfesion.setText("Nuevo");
		this.jCheckBoxPostAccionNuevoProfesion.setToolTipText("Nuevo Profesion");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionNuevoProfesion, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinCerrarProfesion = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinCerrarProfesion.setText("Sin Cerrar");
		this.jCheckBoxPostAccionSinCerrarProfesion.setToolTipText("Sin Cerrar Ventana Profesion");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinCerrarProfesion, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinMensajeProfesion = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinMensajeProfesion.setText("Sin Mensaje");
		this.jCheckBoxPostAccionSinMensajeProfesion.setToolTipText("Sin Mensaje Confirmacion");				
				
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinMensajeProfesion, STIPO_TAMANIO_GENERAL,false,false,this);       	
       
				
		
			
			
		this.jComboBoxTiposAccionesProfesion = new JComboBoxMe();
		//this.jComboBoxTiposAccionesProfesion.setText("Accion");
		this.jComboBoxTiposAccionesProfesion.setToolTipText("Tipos de Acciones");
							
		

		this.jComboBoxTiposAccionesFormularioProfesion = new JComboBoxMe();
		//this.jComboBoxTiposAccionesFormularioProfesion.setText("Accion");				
    	this.jComboBoxTiposAccionesFormularioProfesion.setToolTipText("Tipos de Acciones");
	
		this.jLabelAccionesProfesion = new JLabelMe();
		
		this.jLabelAccionesProfesion.setText("Acciones");		
		this.jLabelAccionesProfesion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesProfesion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesProfesion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
        //HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		//HOT KEYS2
		
		//ELEMENTOS
		this.inicializarElementosCamposProfesion();
		
		//ELEMENTOS FK
		this.inicializarElementosCamposForeigKeysProfesion();
				
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		this.jTabbedPaneRelacionesProfesion=new JTabbedPane();
		this.jTabbedPaneRelacionesProfesion.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Relacionados"));
		
		//ESTA EN BEAN

		
		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneRelacionesProfesion,STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		int iPosXAccionPaginacion=0;
		
		
		
				
		
		this.jComboBoxTiposAccionesProfesion.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesProfesion.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesProfesion.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesProfesion, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		
		
		this.jComboBoxTiposAccionesFormularioProfesion.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioProfesion.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioProfesion.setPreferredSize(new Dimension(145,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesFormularioProfesion, STIPO_TAMANIO_GENERAL,false,false,this);				
		
		GridBagLayout gridaBagLayoutCamposProfesion = new GridBagLayout();
		GridBagLayout gridaBagLayoutCamposOcultosProfesion = new GridBagLayout();
		
		this.jPanelCamposProfesion.setLayout(gridaBagLayoutCamposProfesion);
		this.jPanelCamposOcultosProfesion.setLayout(gridaBagLayoutCamposOcultosProfesion);
		
		;
		;
		
		
		//SUBPANELES SIMPLES
		//SUBPANELES POR CAMPO
        
	this.gridBagConstraintsProfesion = new GridBagConstraints();
	this.gridBagConstraintsProfesion.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProfesion.gridy = 0;
	this.gridBagConstraintsProfesion.gridx = 0;
	this.gridBagConstraintsProfesion.ipadx = 0;
	this.gridBagConstraintsProfesion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelidProfesion.add(jLabelIdProfesion, this.gridBagConstraintsProfesion);



	this.gridBagConstraintsProfesion = new GridBagConstraints();
	this.gridBagConstraintsProfesion.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProfesion.gridy = 0;
	this.gridBagConstraintsProfesion.gridx = 1;
	this.gridBagConstraintsProfesion.ipadx = 0;
	this.gridBagConstraintsProfesion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelidProfesion.add(jTextFieldidProfesion, this.gridBagConstraintsProfesion);


	this.gridBagConstraintsProfesion = new GridBagConstraints();
	this.gridBagConstraintsProfesion.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProfesion.gridy = 0;
	this.gridBagConstraintsProfesion.gridx = 0;
	this.gridBagConstraintsProfesion.ipadx = 0;
	this.gridBagConstraintsProfesion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelcodigoProfesion.add(jLabelcodigoProfesion, this.gridBagConstraintsProfesion);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsProfesion = new GridBagConstraints();
		//this.gridBagConstraintsProfesion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProfesion.gridy = 0;
		this.gridBagConstraintsProfesion.gridx = 2;
		this.gridBagConstraintsProfesion.ipadx = 0;
		this.gridBagConstraintsProfesion.insets = new Insets(0, 0, 0, 0);
		this.jPanelcodigoProfesion.add(jButtoncodigoProfesionBusqueda, this.gridBagConstraintsProfesion);
	}

	this.gridBagConstraintsProfesion = new GridBagConstraints();
	this.gridBagConstraintsProfesion.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProfesion.gridy = 0;
	this.gridBagConstraintsProfesion.gridx = 1;
	this.gridBagConstraintsProfesion.ipadx = 0;
	this.gridBagConstraintsProfesion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelcodigoProfesion.add(jTextFieldcodigoProfesion, this.gridBagConstraintsProfesion);


	this.gridBagConstraintsProfesion = new GridBagConstraints();
	this.gridBagConstraintsProfesion.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProfesion.gridy = 0;
	this.gridBagConstraintsProfesion.gridx = 0;
	this.gridBagConstraintsProfesion.ipadx = 0;
	this.gridBagConstraintsProfesion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelnombreProfesion.add(jLabelnombreProfesion, this.gridBagConstraintsProfesion);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsProfesion = new GridBagConstraints();
		//this.gridBagConstraintsProfesion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsProfesion.gridy = 0;
		this.gridBagConstraintsProfesion.gridx = 2;
		this.gridBagConstraintsProfesion.ipadx = 0;
		this.gridBagConstraintsProfesion.insets = new Insets(0, 0, 0, 0);
		this.jPanelnombreProfesion.add(jButtonnombreProfesionBusqueda, this.gridBagConstraintsProfesion);
	}

	this.gridBagConstraintsProfesion = new GridBagConstraints();
	this.gridBagConstraintsProfesion.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsProfesion.gridy = 0;
	this.gridBagConstraintsProfesion.gridx = 1;
	this.gridBagConstraintsProfesion.ipadx = 0;
	this.gridBagConstraintsProfesion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelnombreProfesion.add(jscrollPanenombreProfesion, this.gridBagConstraintsProfesion);


		//SUBPANELES SIMPLES
		
		//SUBPANELES EN PANEL
		//SUBPANELES EN PANEL CAMPOS NORMAL				
		
	this.gridBagConstraintsProfesion = new GridBagConstraints();
	this.gridBagConstraintsProfesion.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsProfesion.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsProfesion.gridy = iYPanelCamposProfesion;
	this.gridBagConstraintsProfesion.gridx = iXPanelCamposProfesion++;
	this.gridBagConstraintsProfesion.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsProfesion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposProfesion.add(this.jPanelidProfesion, this.gridBagConstraintsProfesion);



	if(iXPanelCamposProfesion % 1==0) {
		iXPanelCamposProfesion=0;
		iYPanelCamposProfesion++;
	}
	this.gridBagConstraintsProfesion = new GridBagConstraints();
	this.gridBagConstraintsProfesion.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsProfesion.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsProfesion.gridy = iYPanelCamposProfesion;
	this.gridBagConstraintsProfesion.gridx = iXPanelCamposProfesion++;
	this.gridBagConstraintsProfesion.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsProfesion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposProfesion.add(this.jPanelcodigoProfesion, this.gridBagConstraintsProfesion);



	if(iXPanelCamposProfesion % 1==0) {
		iXPanelCamposProfesion=0;
		iYPanelCamposProfesion++;
	}
	this.gridBagConstraintsProfesion = new GridBagConstraints();
	this.gridBagConstraintsProfesion.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsProfesion.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsProfesion.gridy = iYPanelCamposProfesion;
	this.gridBagConstraintsProfesion.gridx = iXPanelCamposProfesion++;
	this.gridBagConstraintsProfesion.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsProfesion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposProfesion.add(this.jPanelnombreProfesion, this.gridBagConstraintsProfesion);



	if(iXPanelCamposProfesion % 1==0) {
		iXPanelCamposProfesion=0;
		iYPanelCamposProfesion++;
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
			
		GridBagLayout gridaBagLayoutAccionesProfesion= new GridBagLayout();
		this.jPanelAccionesProfesion.setLayout(gridaBagLayoutAccionesProfesion);
		
		GridBagLayout gridaBagLayoutAccionesFormularioProfesion= new GridBagLayout();
		this.jPanelAccionesFormularioProfesion.setLayout(gridaBagLayoutAccionesFormularioProfesion);
		
		this.gridBagConstraintsProfesion = new GridBagConstraints();
		this.gridBagConstraintsProfesion.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsProfesion.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioProfesion.add(this.jComboBoxTiposAccionesFormularioProfesion, this.gridBagConstraintsProfesion);

		this.gridBagConstraintsProfesion = new GridBagConstraints();
		this.gridBagConstraintsProfesion.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsProfesion.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioProfesion.add(this.jCheckBoxPostAccionNuevoProfesion, this.gridBagConstraintsProfesion);
			
		//DEBE CERRARSE Y ACTUALIZARSE TODO NUEVAMENTE, SI ES RELACIONADO PUEDE FUNCIONAR
		//if(!this.profesionSessionBean.getEstaModoGuardarRelaciones()) {		
		//SE ARRIESGA
		//if(!this.conFuncionalidadRelaciones) {		
			this.gridBagConstraintsProfesion = new GridBagConstraints();
			this.gridBagConstraintsProfesion.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsProfesion.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioProfesion.add(this.jCheckBoxPostAccionSinCerrarProfesion, this.gridBagConstraintsProfesion);
		//}
		
		
		//NO TIENE MENSAJE POR DEFINICION, O ES MUY COMPLEJO LA PANTALLA PARA HACERLO MAS COMPLICADO
		if(!this.profesionSessionBean.getEsGuardarRelacionado()
			){				
			//&& !this.profesionSessionBean.getEstaModoGuardarRelaciones()) {
							
			this.gridBagConstraintsProfesion = new GridBagConstraints();
			this.gridBagConstraintsProfesion.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsProfesion.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioProfesion.add(this.jCheckBoxPostAccionSinMensajeProfesion, this.gridBagConstraintsProfesion);
		}
		
		
		int iPosXAccion=0;
		
		this.gridBagConstraintsProfesion = new GridBagConstraints();
		this.gridBagConstraintsProfesion.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsProfesion.gridy = 0;
		this.gridBagConstraintsProfesion.gridx = iPosXAccion++;
			
		this.jPanelAccionesProfesion.add(this.jButtonModificarProfesion, this.gridBagConstraintsProfesion);							

		this.gridBagConstraintsProfesion = new GridBagConstraints();
		this.gridBagConstraintsProfesion.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsProfesion.gridy = 0;
		this.gridBagConstraintsProfesion.gridx =iPosXAccion++;
			
		this.jPanelAccionesProfesion.add(this.jButtonEliminarProfesion, this.gridBagConstraintsProfesion);
		
			
		this.gridBagConstraintsProfesion = new GridBagConstraints();
		this.gridBagConstraintsProfesion.gridy = 0;		
		this.gridBagConstraintsProfesion.gridx = iPosXAccion++;
		
		this.jPanelAccionesProfesion.add(this.jButtonActualizarProfesion, this.gridBagConstraintsProfesion);


		this.gridBagConstraintsProfesion = new GridBagConstraints();
		this.gridBagConstraintsProfesion.gridy = 0;		
		this.gridBagConstraintsProfesion.gridx = iPosXAccion++;
		
		this.jPanelAccionesProfesion.add(this.jButtonGuardarCambiosProfesion, this.gridBagConstraintsProfesion);	
		
		this.gridBagConstraintsProfesion = new GridBagConstraints();
		this.gridBagConstraintsProfesion.gridy = 0;		
		this.gridBagConstraintsProfesion.gridx =iPosXAccion++;
		
		this.jPanelAccionesProfesion.add(this.jButtonCancelarProfesion, this.gridBagConstraintsProfesion);
		
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutProfesion = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutProfesion);
		
		if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.profesionSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsProfesion = new GridBagConstraints();						
			this.gridBagConstraintsProfesion.gridy = iGridyPrincipal++;
			this.gridBagConstraintsProfesion.gridx = 0;		
			//this.gridBagConstraintsProfesion.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsProfesion.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsProfesion.ipadx = 100;
				
			
		}
		
		//PROCESANDO EN OTRA PANTALLA
		
		
		int iGridxBusquedasParametros=0;
		
	
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			//NO BUSQUEDA
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		
		this.gridBagConstraintsProfesion = new GridBagConstraints();
		this.gridBagConstraintsProfesion.gridy =iGridyPrincipal++;
		this.gridBagConstraintsProfesion.gridx =0;
		this.gridBagConstraintsProfesion.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsProfesion.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosProfesion, this.gridBagConstraintsProfesion);
				
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);

		
			
		//if(ProfesionJInternalFrame.CON_DATOS_FRAME) {				
			//this.jInternalFrameDetalleProfesion = new ProfesionBeanSwingJInternalFrameAdditional();//JInternalFrameBase("Profesion DATOS");
			
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
			
	        //this.setTitle("[FOR] - Profesion DATOS");
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Profesion Formulario",PaginaTipo.FORMULARIO,paginaTipo));			
	        this.setSize(iWidthFormulario,iHeightFormulario);        
		   				
			this.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	        this.setResizable(true);
	        this.setClosable(true);
	        this.setMaximizable(true);
		    
			ProfesionModel profesionModel=new ProfesionModel(this);
			
			//SI USARA CLASE INTERNA
			//ProfesionModel.ProfesionFocusTraversalPolicy profesionFocusTraversalPolicy = profesionModel.new ProfesionFocusTraversalPolicy(this);
			
			//profesionFocusTraversalPolicy.setprofesionJInternalFrame(this);
			
			this.setFocusTraversalPolicy(profesionModel);
			
			
			this.jContentPaneDetalleProfesion = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			GridBagLayout gridaBagLayoutDetalleProfesion = new GridBagLayout();	
			this.jContentPaneDetalleProfesion.setLayout(gridaBagLayoutDetalleProfesion);
			
			GridBagLayout gridaBagLayoutBusquedasParametrosProfesion = new GridBagLayout();
			
			
if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
				
				//AGREGA TOOLBAR DETALLE A PANTALLA
				
				this.gridBagConstraintsProfesion = new GridBagConstraints();
				this.gridBagConstraintsProfesion.gridy = iGridyRelaciones++;		
				this.gridBagConstraintsProfesion.gridx = 0;
					
				
				this.jContentPaneDetalleProfesion.add(jTtoolBarDetalleProfesion, gridBagConstraintsProfesion);								
				
}
			
			this.jScrollPanelDatosEdicionProfesion=   new JScrollPane(jContentPaneDetalleProfesion,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionProfesion.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionProfesion.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionProfesion.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			this.jScrollPanelDatosGeneralProfesion=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralProfesion.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralProfesion.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralProfesion.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsProfesion = new GridBagConstraints();
			
			
	        this.gridBagConstraintsProfesion.gridy = iGridyRelaciones++;		
	        this.gridBagConstraintsProfesion.gridx = 0;
	        
			this.jContentPaneDetalleProfesion.add(jPanelCamposProfesion, gridBagConstraintsProfesion);
			
			
			
			
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
						&& profesionSessionBean.getConGuardarRelaciones()
						) {
					//paraCargarPorParte es false por defecto(y ejecuta funcion normal cargando detalle en tab panel), si se utiliza funcionalidad es true y carga tab panel auxiliar temporal
					
					this.cargarSessionConBeanSwingJInternalFrameCliente(this.puedeCargarPorParteCliente,false,-1);
					this.cargarSessionConBeanSwingJInternalFrameProfesionEmplea(this.puedeCargarPorParteProfesionEmplea,false,-1);
					this.cargarSessionConBeanSwingJInternalFrameReferencia(this.puedeCargarPorParteReferencia,false,-1);
					
					if(this.profesionSessionBean.getConGuardarRelaciones()) {
						this.gridBagConstraintsProfesion= new GridBagConstraints();
						this.gridBagConstraintsProfesion.gridy = iGridyRelaciones++;
						this.gridBagConstraintsProfesion.gridx = 0;
						this.jContentPaneDetalleProfesion.add(this.jTabbedPaneRelacionesProfesion, this.gridBagConstraintsProfesion);
					}
					
					//RELACIONES OTROS AGRUPADOS
					;
					
					} else {
						//this.jButtonNuevoRelacionesProfesion.setVisible(false);
						
					this.cargarSessionConBeanSwingJInternalFrameCliente(true,false,-1);
					this.cargarSessionConBeanSwingJInternalFrameProfesionEmplea(true,false,-1);
					this.cargarSessionConBeanSwingJInternalFrameReferencia(true,false,-1);
					}
				}
			}
			
			Boolean tieneColumnasOcultas=false;
			
		
						
			
			if(!Constantes.ISDEVELOPING) {
	       		this.jPanelCamposOcultosProfesion.setVisible(false);
			} else {
				if(tieneColumnasOcultas) {
					this.gridBagConstraintsProfesion = new GridBagConstraints();
					this.gridBagConstraintsProfesion.fill=GridBagConstraints.NONE;
					this.gridBagConstraintsProfesion.anchor = GridBagConstraints.WEST;
					
					this.gridBagConstraintsProfesion.gridy = iGridyRelaciones++;		
					this.gridBagConstraintsProfesion.gridx = 0;
					
				
					this.jContentPaneDetalleProfesion.add(jPanelCamposOcultosProfesion, gridBagConstraintsProfesion);
				
					this.jPanelCamposOcultosProfesion.setVisible(true);
				}
			}					
			
			
			
			
			this.gridBagConstraintsProfesion = new GridBagConstraints();
			this.gridBagConstraintsProfesion.gridy = iGridyRelaciones++;//10;		
	        this.gridBagConstraintsProfesion.gridx = 0;
	        this.gridBagConstraintsProfesion.anchor = GridBagConstraints.CENTER;//WEST;
			
			
			
			this.jContentPaneDetalleProfesion.add(this.jPanelAccionesFormularioProfesion, this.gridBagConstraintsProfesion);							
			
			
			
			this.gridBagConstraintsProfesion = new GridBagConstraints();
	        this.gridBagConstraintsProfesion.gridy = iGridyRelaciones;//10;		
	        this.gridBagConstraintsProfesion.gridx = 0;
	        
			
			this.jContentPaneDetalleProfesion.add(this.jPanelAccionesProfesion, this.gridBagConstraintsProfesion);							
			
	        //this.setContentPane(jScrollPanelDatosEdicionProfesion);
			
		//} else {
			//DISENO_DETALLE COMENTAR Y
			//DISENO_DETALLE(Solo Descomentar Seccion Inferior)
			//NOTA-DISENO_DETALLE(Si cambia lo de abajo, cambiar lo comentado, Al final no es lo mismo)
			
			/*
			this.jScrollPanelDatosEdicionProfesion=   new JScrollPane(this.jPanelCamposProfesion,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionProfesion.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionProfesion.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionProfesion.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			
			this.gridBagConstraintsProfesion = new GridBagConstraints();
			this.gridBagConstraintsProfesion.gridy = iGridyPrincipal++;		
			this.gridBagConstraintsProfesion.gridx = 0;
			this.gridBagConstraintsProfesion.fill = GridBagConstraints.BOTH;
			this.gridBagConstraintsProfesion.ipady = this.getSize().height-yOffset*3;
			this.gridBagConstraintsProfesion.anchor = GridBagConstraints.WEST;
			
			this.jContentPane.add(this.jScrollPanelDatosEdicionProfesion, this.gridBagConstraintsProfesion);
			
			//ACCIONES FORMULARIO
			this.gridBagConstraintsProfesion = new GridBagConstraints();
			this.gridBagConstraintsProfesion.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsProfesion.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesFormularioProfesion, this.gridBagConstraintsProfesion);			
			
			this.gridBagConstraintsProfesion = new GridBagConstraints();
			this.gridBagConstraintsProfesion.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsProfesion.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesProfesion, this.gridBagConstraintsProfesion);									
			*/
		//}								
			
		//DISENO_DETALLE-(Descomentar)
		/*
		this.gridBagConstraintsProfesion = new GridBagConstraints();
		this.gridBagConstraintsProfesion.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsProfesion.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposProfesion, this.gridBagConstraintsProfesion);
			
			
		this.gridBagConstraintsProfesion = new GridBagConstraints();
		this.gridBagConstraintsProfesion.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsProfesion.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosProfesion, this.gridBagConstraintsProfesion);
		
			
		this.gridBagConstraintsProfesion = new GridBagConstraints();
		this.gridBagConstraintsProfesion.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsProfesion.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesProfesion, this.gridBagConstraintsProfesion);
		*/
		
			
     	//pack();
		
		
		//return this.jScrollPanelDatosGeneralProfesion;//jContentPane;
		
		return jScrollPanelDatosEdicionProfesion;
    } 
	
		

	public void cargarSessionConBeanSwingJInternalFrameCliente(Boolean soloSession,Boolean actualizarTab,Integer iIndexTab) throws Exception {

		//SOLO INICIALIZA SESSION (YA NO, CONSUME MUCHA MEMORIA)
		this.clienteSessionBean=new ClienteSessionBean();
		this.clienteSessionBean.setConGuardarRelaciones(false);
		this.clienteSessionBean.setEsGuardarRelacionado(true);

		this.clienteBeanSwingJInternalFrame=null;//new ClienteBeanSwingJInternalFrame(false,true,false);

		if(!soloSession) {
			//this.clienteBeanSwingJInternalFramePopup=new ClienteBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,true);
			//this.clienteBeanSwingJInternalFramePopup.jInternalFrameParent=this;


			if(this.clienteSessionBean.getEsGuardarRelacionado()) {

				ClienteJInternalFrame.STIPO_TAMANIO_GENERAL=ProfesionJInternalFrame.STIPO_TAMANIO_GENERAL;
				ClienteJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=ProfesionJInternalFrame.STIPO_TAMANIO_GENERAL;

				this.clienteSessionBean.setEsGuardarRelacionado(true);

				this.clienteBeanSwingJInternalFrame=new ClienteBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.SECUNDARIO,false,true,false,false);//false->4

				this.clienteBeanSwingJInternalFrame.setJInternalFrameParent(this);
				this.clienteBeanSwingJInternalFrame.setclienteSessionBean(this.clienteSessionBean);

				//this.gridBagConstraintsProfesion = new GridBagConstraints();
				//this.gridBagConstraintsProfesion.gridy = iGridyRelaciones++;
				//this.gridBagConstraintsProfesion.gridx = 0;
				//this.jContentPaneDetalleProfesion.add(this.clienteBeanSwingJInternalFrame.getContentPane(), this.gridBagConstraintsProfesion);

				if(!actualizarTab) {
					this.jTabbedPaneRelacionesProfesion.add("Clientes",this.clienteBeanSwingJInternalFrame.getContentPane());
				} else {
					this.jTabbedPaneRelacionesProfesion.setComponentAt(iIndexTab,this.clienteBeanSwingJInternalFrame.getContentPane());
				}

				//ClienteJInternalFrame.ESTA_CARGADO_PORPARTE=true;
			} else {
				this.clienteSessionBean.setEsGuardarRelacionado(false);
				this.clienteBeanSwingJInternalFrame=null;//new ClienteBeanSwingJInternalFrame(false,false,jDesktopPane,this.usuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,false);
			}
		} else {
			if(this.clienteSessionBean.getEsGuardarRelacionado()) {
				if(this.puedeCargarPorParteCliente) {
					this.jTabbedPaneRelacionesProfesion.add("Clientes",new JPanel());
				}
			}
		}
	}

	public void cargarSessionConBeanSwingJInternalFrameProfesionEmplea(Boolean soloSession,Boolean actualizarTab,Integer iIndexTab) throws Exception {

		//SOLO INICIALIZA SESSION (YA NO, CONSUME MUCHA MEMORIA)
		this.profesionempleaSessionBean=new ProfesionEmpleaSessionBean();
		this.profesionempleaSessionBean.setConGuardarRelaciones(false);
		this.profesionempleaSessionBean.setEsGuardarRelacionado(true);

		this.profesionempleaBeanSwingJInternalFrame=null;//new ProfesionEmpleaBeanSwingJInternalFrame(false,true,false);

		if(!soloSession) {
			//this.profesionempleaBeanSwingJInternalFramePopup=new ProfesionEmpleaBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,true);
			//this.profesionempleaBeanSwingJInternalFramePopup.jInternalFrameParent=this;


			if(this.profesionempleaSessionBean.getEsGuardarRelacionado()) {

				ProfesionEmpleaJInternalFrame.STIPO_TAMANIO_GENERAL=ProfesionJInternalFrame.STIPO_TAMANIO_GENERAL;
				ProfesionEmpleaJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=ProfesionJInternalFrame.STIPO_TAMANIO_GENERAL;

				this.profesionempleaSessionBean.setEsGuardarRelacionado(true);

				this.profesionempleaBeanSwingJInternalFrame=new ProfesionEmpleaBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.SECUNDARIO,false,true,false,false);//false->4

				this.profesionempleaBeanSwingJInternalFrame.setJInternalFrameParent(this);
				this.profesionempleaBeanSwingJInternalFrame.setprofesionempleaSessionBean(this.profesionempleaSessionBean);

				//this.gridBagConstraintsProfesion = new GridBagConstraints();
				//this.gridBagConstraintsProfesion.gridy = iGridyRelaciones++;
				//this.gridBagConstraintsProfesion.gridx = 0;
				//this.jContentPaneDetalleProfesion.add(this.profesionempleaBeanSwingJInternalFrame.getContentPane(), this.gridBagConstraintsProfesion);

				if(!actualizarTab) {
					this.jTabbedPaneRelacionesProfesion.add("Profesion Empleas",this.profesionempleaBeanSwingJInternalFrame.getContentPane());
				} else {
					this.jTabbedPaneRelacionesProfesion.setComponentAt(iIndexTab,this.profesionempleaBeanSwingJInternalFrame.getContentPane());
				}

				//ProfesionEmpleaJInternalFrame.ESTA_CARGADO_PORPARTE=true;
			} else {
				this.profesionempleaSessionBean.setEsGuardarRelacionado(false);
				this.profesionempleaBeanSwingJInternalFrame=null;//new ProfesionEmpleaBeanSwingJInternalFrame(false,false,jDesktopPane,this.usuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,false);
			}
		} else {
			if(this.profesionempleaSessionBean.getEsGuardarRelacionado()) {
				if(this.puedeCargarPorParteProfesionEmplea) {
					this.jTabbedPaneRelacionesProfesion.add("Profesion Empleas",new JPanel());
				}
			}
		}
	}

	public void cargarSessionConBeanSwingJInternalFrameReferencia(Boolean soloSession,Boolean actualizarTab,Integer iIndexTab) throws Exception {

		//SOLO INICIALIZA SESSION (YA NO, CONSUME MUCHA MEMORIA)
		this.referenciaSessionBean=new ReferenciaSessionBean();
		this.referenciaSessionBean.setConGuardarRelaciones(false);
		this.referenciaSessionBean.setEsGuardarRelacionado(true);

		this.referenciaBeanSwingJInternalFrame=null;//new ReferenciaBeanSwingJInternalFrame(false,true,false);

		if(!soloSession) {
			//this.referenciaBeanSwingJInternalFramePopup=new ReferenciaBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,true);
			//this.referenciaBeanSwingJInternalFramePopup.jInternalFrameParent=this;


			if(this.referenciaSessionBean.getEsGuardarRelacionado()) {

				ReferenciaJInternalFrame.STIPO_TAMANIO_GENERAL=ProfesionJInternalFrame.STIPO_TAMANIO_GENERAL;
				ReferenciaJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=ProfesionJInternalFrame.STIPO_TAMANIO_GENERAL;

				this.referenciaSessionBean.setEsGuardarRelacionado(true);

				this.referenciaBeanSwingJInternalFrame=new ReferenciaBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.SECUNDARIO,false,true,false,false);//false->4

				this.referenciaBeanSwingJInternalFrame.setJInternalFrameParent(this);
				this.referenciaBeanSwingJInternalFrame.setreferenciaSessionBean(this.referenciaSessionBean);

				//this.gridBagConstraintsProfesion = new GridBagConstraints();
				//this.gridBagConstraintsProfesion.gridy = iGridyRelaciones++;
				//this.gridBagConstraintsProfesion.gridx = 0;
				//this.jContentPaneDetalleProfesion.add(this.referenciaBeanSwingJInternalFrame.getContentPane(), this.gridBagConstraintsProfesion);

				if(!actualizarTab) {
					this.jTabbedPaneRelacionesProfesion.add("Referencias",this.referenciaBeanSwingJInternalFrame.getContentPane());
				} else {
					this.jTabbedPaneRelacionesProfesion.setComponentAt(iIndexTab,this.referenciaBeanSwingJInternalFrame.getContentPane());
				}

				//ReferenciaJInternalFrame.ESTA_CARGADO_PORPARTE=true;
			} else {
				this.referenciaSessionBean.setEsGuardarRelacionado(false);
				this.referenciaBeanSwingJInternalFrame=null;//new ReferenciaBeanSwingJInternalFrame(false,false,jDesktopPane,this.usuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,false);
			}
		} else {
			if(this.referenciaSessionBean.getEsGuardarRelacionado()) {
				if(this.puedeCargarPorParteReferencia) {
					this.jTabbedPaneRelacionesProfesion.add("Referencias",new JPanel());
				}
			}
		}
	}
	
	
	
	
		public void cargarClienteBeanSwingJInternalFrame(List<Profesion> profesions,Profesion profesion,ClienteBeanSwingJInternalFrame clienteBeanSwingJInternalFrame,/*Boolean conInicializar,*/Boolean conGuardarRelaciones,Boolean esGuardarRelacionado) throws Exception 
		{
			try
			{
				if(true/*conInicializar*/) {
					//GETCONTENTPANE SOLO UN PAPA, SE PIERDE PANEL, POR LO QUE SE CREA NUEVO POR CADA PANTALLA
					//clienteBeanSwingJInternalFrame=new ClienteBeanSwingJInternalFrame(false,false,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);

				}
					clienteBeanSwingJInternalFrame.getClienteLogic().setConnexion(this.profesionLogic.getConnexion());

					clienteBeanSwingJInternalFrame.setprofesionsForeignKey(profesions);
					clienteBeanSwingJInternalFrame.setprofesionForeignKey(profesion);
					clienteBeanSwingJInternalFrame.clienteSessionBean.setisBusquedaDesdeForeignKeySesionProfesion(true);
					clienteBeanSwingJInternalFrame.clienteSessionBean.setlidProfesionActual(profesion.getId());
					//NO VOLVER A RECARGAR FK, TALVEZ INICIALIZAR FK DEPENDENTES
					//Hijos Independientes, No carga Fk al inicializar, Hay que setisBusquedaDesdeForeignKeySesion(true), luego cargar todos los Fks necesarios
					clienteBeanSwingJInternalFrame.cargarCombosForeignKeyCliente(clienteBeanSwingJInternalFrame.isCargarCombosDependencia);
					clienteBeanSwingJInternalFrame.setVisibilidadBusquedasParaProfesion(true);
					clienteBeanSwingJInternalFrame.setid_profesionFK_IdProfesion(profesion.getId());

					if(!this.conCargarFormDetalle) {
						clienteBeanSwingJInternalFrame.inicializarFormDetalle();
					}

					clienteBeanSwingJInternalFrame.setSelectedItemCombosFrameProfesionForeignKey(profesion,1,false,true,true);
					clienteBeanSwingJInternalFrame.setiNumeroPaginacion(Funciones2.getPaginacionDefecto("RELACIONADO"));
					clienteBeanSwingJInternalFrame.procesarBusqueda("FK_IdProfesion");
					clienteBeanSwingJInternalFrame.setsAccionBusqueda("FK_IdProfesion");
					clienteBeanSwingJInternalFrame.inicializarActualizarBindingTablaCliente(true);
					clienteBeanSwingJInternalFrame.actualizarEstadoCeldasBotonesCliente("n",clienteBeanSwingJInternalFrame.isGuardarCambiosEnLote, clienteBeanSwingJInternalFrame.isEsMantenimientoRelacionado);
					clienteBeanSwingJInternalFrame.setAutoscrolls(true);
					clienteBeanSwingJInternalFrame.setVisible(true);

					if(esGuardarRelacionado) {
						clienteBeanSwingJInternalFrame.actualizarEstadoPanelsCliente("relacionado");
					} else {
						clienteBeanSwingJInternalFrame.actualizarEstadoPanelsCliente("no_relacionado");
					}

					clienteBeanSwingJInternalFrame.getjButtonRecargarInformacionCliente().setVisible(false);

			}
			catch(Exception e)
			{
				throw e;
			}
		}

		public void cargarProfesionEmpleaBeanSwingJInternalFrame(List<Profesion> profesions,Profesion profesion,ProfesionEmpleaBeanSwingJInternalFrame profesionempleaBeanSwingJInternalFrame,/*Boolean conInicializar,*/Boolean conGuardarRelaciones,Boolean esGuardarRelacionado) throws Exception 
		{
			try
			{
				if(true/*conInicializar*/) {
					//GETCONTENTPANE SOLO UN PAPA, SE PIERDE PANEL, POR LO QUE SE CREA NUEVO POR CADA PANTALLA
					//profesionempleaBeanSwingJInternalFrame=new ProfesionEmpleaBeanSwingJInternalFrame(false,false,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);

				}
					profesionempleaBeanSwingJInternalFrame.getProfesionEmpleaLogic().setConnexion(this.profesionLogic.getConnexion());

					profesionempleaBeanSwingJInternalFrame.setprofesionsForeignKey(profesions);
					profesionempleaBeanSwingJInternalFrame.setprofesionForeignKey(profesion);
					profesionempleaBeanSwingJInternalFrame.profesionempleaSessionBean.setisBusquedaDesdeForeignKeySesionProfesion(true);
					profesionempleaBeanSwingJInternalFrame.profesionempleaSessionBean.setlidProfesionActual(profesion.getId());
					//NO VOLVER A RECARGAR FK, TALVEZ INICIALIZAR FK DEPENDENTES
					//Hijos Independientes, No carga Fk al inicializar, Hay que setisBusquedaDesdeForeignKeySesion(true), luego cargar todos los Fks necesarios
					profesionempleaBeanSwingJInternalFrame.cargarCombosForeignKeyProfesionEmplea(profesionempleaBeanSwingJInternalFrame.isCargarCombosDependencia);
					profesionempleaBeanSwingJInternalFrame.setVisibilidadBusquedasParaProfesion(true);
					profesionempleaBeanSwingJInternalFrame.setid_profesionFK_IdProfesion(profesion.getId());

					if(!this.conCargarFormDetalle) {
						profesionempleaBeanSwingJInternalFrame.inicializarFormDetalle();
					}

					profesionempleaBeanSwingJInternalFrame.setSelectedItemCombosFrameProfesionForeignKey(profesion,1,false,true,true);
					profesionempleaBeanSwingJInternalFrame.setiNumeroPaginacion(Funciones2.getPaginacionDefecto("RELACIONADO"));
					profesionempleaBeanSwingJInternalFrame.procesarBusqueda("FK_IdProfesion");
					profesionempleaBeanSwingJInternalFrame.setsAccionBusqueda("FK_IdProfesion");
					profesionempleaBeanSwingJInternalFrame.inicializarActualizarBindingTablaProfesionEmplea(true);
					profesionempleaBeanSwingJInternalFrame.actualizarEstadoCeldasBotonesProfesionEmplea("n",profesionempleaBeanSwingJInternalFrame.isGuardarCambiosEnLote, profesionempleaBeanSwingJInternalFrame.isEsMantenimientoRelacionado);
					profesionempleaBeanSwingJInternalFrame.setAutoscrolls(true);
					profesionempleaBeanSwingJInternalFrame.setVisible(true);

					if(esGuardarRelacionado) {
						profesionempleaBeanSwingJInternalFrame.actualizarEstadoPanelsProfesionEmplea("relacionado");
					} else {
						profesionempleaBeanSwingJInternalFrame.actualizarEstadoPanelsProfesionEmplea("no_relacionado");
					}

					profesionempleaBeanSwingJInternalFrame.getjButtonRecargarInformacionProfesionEmplea().setVisible(false);

			}
			catch(Exception e)
			{
				throw e;
			}
		}

		public void cargarReferenciaBeanSwingJInternalFrame(List<Profesion> profesions,Profesion profesion,ReferenciaBeanSwingJInternalFrame referenciaBeanSwingJInternalFrame,/*Boolean conInicializar,*/Boolean conGuardarRelaciones,Boolean esGuardarRelacionado) throws Exception 
		{
			try
			{
				if(true/*conInicializar*/) {
					//GETCONTENTPANE SOLO UN PAPA, SE PIERDE PANEL, POR LO QUE SE CREA NUEVO POR CADA PANTALLA
					//referenciaBeanSwingJInternalFrame=new ReferenciaBeanSwingJInternalFrame(false,false,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);

				}
					referenciaBeanSwingJInternalFrame.getReferenciaLogic().setConnexion(this.profesionLogic.getConnexion());

					referenciaBeanSwingJInternalFrame.setprofesionsForeignKey(profesions);
					referenciaBeanSwingJInternalFrame.setprofesionForeignKey(profesion);
					referenciaBeanSwingJInternalFrame.referenciaSessionBean.setisBusquedaDesdeForeignKeySesionProfesion(true);
					referenciaBeanSwingJInternalFrame.referenciaSessionBean.setlidProfesionActual(profesion.getId());
					//NO VOLVER A RECARGAR FK, TALVEZ INICIALIZAR FK DEPENDENTES
					//Hijos Independientes, No carga Fk al inicializar, Hay que setisBusquedaDesdeForeignKeySesion(true), luego cargar todos los Fks necesarios
					referenciaBeanSwingJInternalFrame.cargarCombosForeignKeyReferencia(referenciaBeanSwingJInternalFrame.isCargarCombosDependencia);
					referenciaBeanSwingJInternalFrame.setVisibilidadBusquedasParaProfesion(true);
					referenciaBeanSwingJInternalFrame.setid_profesionFK_IdProfesion(profesion.getId());

					if(!this.conCargarFormDetalle) {
						referenciaBeanSwingJInternalFrame.inicializarFormDetalle();
					}

					referenciaBeanSwingJInternalFrame.setSelectedItemCombosFrameProfesionForeignKey(profesion,1,false,true,true);
					referenciaBeanSwingJInternalFrame.setiNumeroPaginacion(Funciones2.getPaginacionDefecto("RELACIONADO"));
					referenciaBeanSwingJInternalFrame.procesarBusqueda("FK_IdProfesion");
					referenciaBeanSwingJInternalFrame.setsAccionBusqueda("FK_IdProfesion");
					referenciaBeanSwingJInternalFrame.inicializarActualizarBindingTablaReferencia(true);
					referenciaBeanSwingJInternalFrame.actualizarEstadoCeldasBotonesReferencia("n",referenciaBeanSwingJInternalFrame.isGuardarCambiosEnLote, referenciaBeanSwingJInternalFrame.isEsMantenimientoRelacionado);
					referenciaBeanSwingJInternalFrame.setAutoscrolls(true);
					referenciaBeanSwingJInternalFrame.setVisible(true);

					if(esGuardarRelacionado) {
						referenciaBeanSwingJInternalFrame.actualizarEstadoPanelsReferencia("relacionado");
					} else {
						referenciaBeanSwingJInternalFrame.actualizarEstadoPanelsReferencia("no_relacionado");
					}

					referenciaBeanSwingJInternalFrame.getjButtonRecargarInformacionReferencia().setVisible(false);

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
