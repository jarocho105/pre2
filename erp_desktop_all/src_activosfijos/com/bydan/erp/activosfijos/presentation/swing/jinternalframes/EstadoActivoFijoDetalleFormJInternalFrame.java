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
import com.bydan.erp.cartera.presentation.swing.jinternalframes.*;
import com.bydan.erp.contabilidad.presentation.swing.jinternalframes.*;
import com.bydan.erp.facturacion.presentation.swing.jinternalframes.*;
import com.bydan.erp.activosfijos.presentation.swing.jinternalframes.*;

import com.bydan.erp.activosfijos.presentation.web.jsf.sessionbean.*;//;
import com.bydan.erp.activosfijos.presentation.swing.jinternalframes.*;
import com.bydan.erp.activosfijos.presentation.swing.jinternalframes.auxiliar.*;


import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.cartera.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.contabilidad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.facturacion.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.activosfijos.presentation.web.jsf.sessionbean.*;

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
import com.bydan.erp.activosfijos.util.EstadoActivoFijoConstantesFunciones;

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
public class EstadoActivoFijoDetalleFormJInternalFrame extends EstadoActivoFijoBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	
	
	public JToolBar jTtoolBarDetalleEstadoActivoFijo;
	
	protected JMenuBar jmenuBarDetalleEstadoActivoFijo;
	
	protected JMenu jmenuDetalleEstadoActivoFijo;
	protected JMenu jmenuDetalleArchivoEstadoActivoFijo;
	protected JMenu jmenuDetalleAccionesEstadoActivoFijo;
	protected JMenu jmenuDetalleDatosEstadoActivoFijo;
	
	
	
	protected JPanel jContentPane = null;
	protected JPanel jContentPaneDetalleEstadoActivoFijo = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutEstadoActivoFijo;	
	protected GridBagConstraints gridBagConstraintsEstadoActivoFijo;	
		
	//protected JInternalFrameBase jInternalFrameParent; //ESTA EN BASE
	//protected EstadoActivoFijoBeanSwingJInternalFrameAdditional jInternalFrameDetalleEstadoActivoFijo;		
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empresa="";
	
	public EstadoActivoFijoSessionBean estadoactivofijoSessionBean;
	
	

	public DetalleActivoFijoBeanSwingJInternalFrame detalleactivofijoBeanSwingJInternalFrame=null;
	public DetalleActivoFijoBeanSwingJInternalFrame detalleactivofijoBeanSwingJInternalFramePopup=null;
	public Boolean puedeCargarPorParteDetalleActivoFijo=false;
	public DetalleActivoFijoSessionBean detalleactivofijoSessionBean;

	public ParteActivoFijoBeanSwingJInternalFrame parteactivofijoBeanSwingJInternalFrame=null;
	public ParteActivoFijoBeanSwingJInternalFrame parteactivofijoBeanSwingJInternalFramePopup=null;
	public Boolean puedeCargarPorParteParteActivoFijo=false;
	public ParteActivoFijoSessionBean parteactivofijoSessionBean;
	
	
	public EmpresaSessionBean empresaSessionBean;	
	
	public EstadoActivoFijoLogic estadoactivofijoLogic;
	
	public JScrollPane jScrollPanelDatosEstadoActivoFijo;
	public JScrollPane jScrollPanelDatosEdicionEstadoActivoFijo;
	public JScrollPane jScrollPanelDatosGeneralEstadoActivoFijo;
	
	protected JPanel jPanelCamposEstadoActivoFijo;    
	protected JPanel jPanelCamposOcultosEstadoActivoFijo;    	
	protected JPanel jPanelAccionesEstadoActivoFijo;
	protected JPanel jPanelAccionesFormularioEstadoActivoFijo;
    
	
	
	protected Integer iXPanelCamposEstadoActivoFijo=0;
	protected Integer iYPanelCamposEstadoActivoFijo=0;
	
	protected Integer iXPanelCamposOcultosEstadoActivoFijo=0;
	protected Integer iYPanelCamposOcultosEstadoActivoFijo=0;
	
	;
	;
	
		
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	public JButton jButtonNuevoEstadoActivoFijo;
	public JButton jButtonModificarEstadoActivoFijo;
	public JButton jButtonActualizarEstadoActivoFijo;
    public JButton jButtonEliminarEstadoActivoFijo;
	public JButton jButtonCancelarEstadoActivoFijo;
    public JButton jButtonGuardarCambiosEstadoActivoFijo;
	public JButton jButtonGuardarCambiosTablaEstadoActivoFijo;
	protected JButton jButtonCerrarEstadoActivoFijo;
	
	
	protected JButton jButtonProcesarInformacionEstadoActivoFijo;
	
	
	protected JCheckBox jCheckBoxPostAccionNuevoEstadoActivoFijo;
	protected JCheckBox jCheckBoxPostAccionSinCerrarEstadoActivoFijo;
	protected JCheckBox jCheckBoxPostAccionSinMensajeEstadoActivoFijo;
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarEstadoActivoFijo;
	protected JButton jButtonModificarToolBarEstadoActivoFijo;
	protected JButton jButtonActualizarToolBarEstadoActivoFijo;
    protected JButton jButtonEliminarToolBarEstadoActivoFijo;
	protected JButton jButtonCancelarToolBarEstadoActivoFijo;
    protected JButton jButtonGuardarCambiosToolBarEstadoActivoFijo;
	protected JButton jButtonGuardarCambiosTablaToolBarEstadoActivoFijo;
	protected JButton jButtonMostrarOcultarTablaToolBarEstadoActivoFijo;
	protected JButton jButtonCerrarToolBarEstadoActivoFijo;
	
	protected JButton jButtonProcesarInformacionToolBarEstadoActivoFijo;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoEstadoActivoFijo;
	protected JMenuItem jMenuItemModificarEstadoActivoFijo;
	protected JMenuItem jMenuItemActualizarEstadoActivoFijo;
    protected JMenuItem jMenuItemEliminarEstadoActivoFijo;
	protected JMenuItem jMenuItemCancelarEstadoActivoFijo;
    protected JMenuItem jMenuItemGuardarCambiosEstadoActivoFijo;
	protected JMenuItem jMenuItemGuardarCambiosTablaEstadoActivoFijo;
	protected JMenuItem jMenuItemCerrarEstadoActivoFijo;
	protected JMenuItem jMenuItemDetalleCerrarEstadoActivoFijo;
	protected JMenuItem jMenuItemDetalleMostarOcultarEstadoActivoFijo;
	
	protected JMenuItem jMenuItemProcesarInformacionEstadoActivoFijo;
	protected JMenuItem jMenuItemNuevoGuardarCambiosEstadoActivoFijo;
	protected JMenuItem jMenuItemMostrarOcultarEstadoActivoFijo;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesEstadoActivoFijo;	
		
	
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesEstadoActivoFijo;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesEstadoActivoFijo;
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxTiposAccionesFormularioEstadoActivoFijo;
	
		
	
	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	public JPanel jPanelidEstadoActivoFijo;
	public JLabel jLabelIdEstadoActivoFijo;
	public JLabel jLabelidEstadoActivoFijo;
	public JButton jButtonidEstadoActivoFijoBusqueda= new JButtonMe();

	public JPanel jPanelcodigoEstadoActivoFijo;
	public JLabel jLabelcodigoEstadoActivoFijo;
	public JTextField jTextFieldcodigoEstadoActivoFijo;
	public JButton jButtoncodigoEstadoActivoFijoBusqueda= new JButtonMe();

	public JPanel jPanelnombreEstadoActivoFijo;
	public JLabel jLabelnombreEstadoActivoFijo;
	public JTextArea jTextAreanombreEstadoActivoFijo;
	public JScrollPane jscrollPanenombreEstadoActivoFijo;
	public JButton jButtonnombreEstadoActivoFijoBusqueda= new JButtonMe();

	
	public JPanel jPanelid_empresaEstadoActivoFijo;
	public JLabel jLabelid_empresaEstadoActivoFijo;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_empresaEstadoActivoFijo;
	public JButton jButtonid_empresaEstadoActivoFijo= new JButtonMe();
	public JButton jButtonid_empresaEstadoActivoFijoUpdate= new JButtonMe();
	public JButton jButtonid_empresaEstadoActivoFijoBusqueda= new JButtonMe();

	
	
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JTabbedPane jTabbedPaneRelacionesEstadoActivoFijo;
	
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
	
	public EstadoActivoFijoDetalleFormJInternalFrame(String sTipo) throws Exception {
		super(PaginaTipo.FORMULARIO);
       
		try {
			
	  		if(sTipo.equals("MINIMO")) {
				/*
				this.jPanelCamposEstadoActivoFijo=new JPanel();
				this.jPanelAccionesFormularioEstadoActivoFijo=new JPanel();
				this.jmenuBarDetalleEstadoActivoFijo=new JMenuBar();
				this.jTtoolBarDetalleEstadoActivoFijo=new JToolBar();
				*/
	  		}
	  		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public EstadoActivoFijoDetalleFormJInternalFrame(PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo); 
		
		//super("EstadoActivoFijo No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	//ES AUXILIAR PARA WINDOWS FORMS
	public EstadoActivoFijoDetalleFormJInternalFrame() throws Exception {
		super(PaginaTipo.FORMULARIO);
        //super("EstadoActivoFijo No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public EstadoActivoFijoDetalleFormJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("EstadoActivoFijo No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public EstadoActivoFijoDetalleFormJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("EstadoActivoFijo No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public EstadoActivoFijoDetalleFormJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("EstadoActivoFijo No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	public JButton getjButtonActualizarToolBarEstadoActivoFijo() {
		return this.jButtonActualizarToolBarEstadoActivoFijo;
	}
	
	public JButton getjButtonEliminarToolBarEstadoActivoFijo() {
		return this.jButtonEliminarToolBarEstadoActivoFijo;
	}
	
	public JButton getjButtonCancelarToolBarEstadoActivoFijo() {
		return this.jButtonCancelarToolBarEstadoActivoFijo;
	}		
	
	public JButton getjButtonProcesarInformacionEstadoActivoFijo() {
		return this.jButtonProcesarInformacionEstadoActivoFijo;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionEstadoActivoFijo)	{
		this.jButtonProcesarInformacionEstadoActivoFijo = jButtonProcesarInformacionEstadoActivoFijo;
	}
	
	
	

	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesEstadoActivoFijo() {
		return this.jComboBoxTiposAccionesEstadoActivoFijo;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesEstadoActivoFijo(
			JComboBox jComboBoxTiposRelacionesEstadoActivoFijo) {
		this.jComboBoxTiposRelacionesEstadoActivoFijo = jComboBoxTiposRelacionesEstadoActivoFijo;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesEstadoActivoFijo(
			JComboBox jComboBoxTiposAccionesEstadoActivoFijo) {
		this.jComboBoxTiposAccionesEstadoActivoFijo = jComboBoxTiposAccionesEstadoActivoFijo;
	}		
	
			
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesFormularioEstadoActivoFijo() {
		return this.jComboBoxTiposAccionesFormularioEstadoActivoFijo;
	}				
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesFormularioEstadoActivoFijo(
			JComboBox jComboBoxTiposAccionesFormularioEstadoActivoFijo) {
		this.jComboBoxTiposAccionesFormularioEstadoActivoFijo = jComboBoxTiposAccionesFormularioEstadoActivoFijo;
	}
	
	private void initialize(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		this.estadoactivofijoSessionBean=new EstadoActivoFijoSessionBean();
		
		this.estadoactivofijoSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.estadoactivofijoSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.estadoactivofijoSessionBean.getEsGuardarRelacionado();				
		
		this.conMostrarAccionesCampo=parametroGeneralUsuario.getcon_mostrar_acciones_campo_general() || opcionActual.getcon_mostrar_acciones_campo();
		
		
		if(!this.conCargarMinimo) {
		
		//this.detalleactivofijoSessionBean=new DetalleActivoFijoSessionBean();
		//this.parteactivofijoSessionBean=new ParteActivoFijoSessionBean();
		}
		
			
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		EstadoActivoFijoJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		EstadoActivoFijoJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		EstadoActivoFijoJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Estado Activo Fijo MANTENIMIENTO"));
		
		
		if(iWidth > 650) {
			iWidth=650;
		}
		
		if(iHeight > 1110) {
			iHeight=1110;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
		
		if(!this.estadoactivofijoSessionBean.getEsGuardarRelacionado()) {
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
	
		EstadoActivoFijoJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarDetalleEstadoActivoFijo= new JToolBar("MENU DATOS");		
		
		//TOOLBAR
		//PRINCIPAL				
				this.jButtonProcesarInformacionToolBarEstadoActivoFijo=new JButtonMe();
				this.jButtonModificarToolBarEstadoActivoFijo=new JButtonMe();							
		//PRINCIPAL
		
		//DETALLE
		this.jButtonActualizarToolBarEstadoActivoFijo=FuncionesSwing.getButtonToolBarGeneral(this.jButtonActualizarToolBarEstadoActivoFijo,this.jTtoolBarDetalleEstadoActivoFijo,
							"actualizar","actualizar","Actualizar"+" "+EstadoActivoFijoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"),"Actualizar",false);
		
		
		
		
		this.jButtonEliminarToolBarEstadoActivoFijo=FuncionesSwing.getButtonToolBarGeneral(this.jButtonEliminarToolBarEstadoActivoFijo,this.jTtoolBarDetalleEstadoActivoFijo,
							"eliminar","eliminar","Eliminar"+" "+EstadoActivoFijoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"),"Eliminar",false);
		
		
		
		
		this.jButtonCancelarToolBarEstadoActivoFijo=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCancelarToolBarEstadoActivoFijo,this.jTtoolBarDetalleEstadoActivoFijo,
							"cancelar","cancelar","Cancelar"+" "+EstadoActivoFijoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"),"Cancelar",false);
		
		
		
		
		this.jButtonGuardarCambiosToolBarEstadoActivoFijo=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosToolBarEstadoActivoFijo,this.jTtoolBarDetalleEstadoActivoFijo,
							"guardarcambios","guardarcambios","Guardar"+" "+EstadoActivoFijoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		
		FuncionesSwing.setBoldButtonToolBar(this.jButtonActualizarToolBarEstadoActivoFijo,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonEliminarToolBarEstadoActivoFijo,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonCancelarToolBarEstadoActivoFijo,STIPO_TAMANIO_GENERAL,false,false,this);
	}
	
	
	
	public void cargarMenus() {		
		
		this.jmenuBarDetalleEstadoActivoFijo=new JMenuBarMe();
		
		//DETALLE
		this.jmenuDetalleEstadoActivoFijo=new JMenuMe("Datos Relacionados");
		this.jmenuDetalleArchivoEstadoActivoFijo=new JMenuMe("Archivo");
		this.jmenuDetalleAccionesEstadoActivoFijo=new JMenuMe("Acciones");
		this.jmenuDetalleDatosEstadoActivoFijo=new JMenuMe("Datos");
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoEstadoActivoFijo= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoEstadoActivoFijo.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoEstadoActivoFijo,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoEstadoActivoFijo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemModificarEstadoActivoFijo= new JMenuItem("Editar" + FuncionesSwing.getKeyMensaje("MODIFICAR"));
		this.jMenuItemModificarEstadoActivoFijo.setActionCommand("Editar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemModificarEstadoActivoFijo,"modificar_button","Editar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemModificarEstadoActivoFijo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemActualizarEstadoActivoFijo= new JMenuItem("Actualizar" + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
		this.jMenuItemActualizarEstadoActivoFijo.setActionCommand("Actualizar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemActualizarEstadoActivoFijo,"actualizar_button","Actualizar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemActualizarEstadoActivoFijo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemEliminarEstadoActivoFijo= new JMenuItem("Eliminar" + FuncionesSwing.getKeyMensaje("ELIMINAR"));
		this.jMenuItemEliminarEstadoActivoFijo.setActionCommand("Eliminar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemEliminarEstadoActivoFijo,"eliminar_button","Eliminar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemEliminarEstadoActivoFijo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCancelarEstadoActivoFijo= new JMenuItem("Cancelar" + FuncionesSwing.getKeyMensaje("CANCELAR"));
		this.jMenuItemCancelarEstadoActivoFijo.setActionCommand("Cancelar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCancelarEstadoActivoFijo,"cancelar_button","Cancelar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCancelarEstadoActivoFijo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosEstadoActivoFijo= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosEstadoActivoFijo.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosEstadoActivoFijo,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosEstadoActivoFijo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarEstadoActivoFijo= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarEstadoActivoFijo.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarEstadoActivoFijo,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarEstadoActivoFijo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleCerrarEstadoActivoFijo= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemDetalleCerrarEstadoActivoFijo.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleCerrarEstadoActivoFijo,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleCerrarEstadoActivoFijo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarEstadoActivoFijo= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarEstadoActivoFijo.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarEstadoActivoFijo,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarEstadoActivoFijo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarEstadoActivoFijo= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarEstadoActivoFijo.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarEstadoActivoFijo,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarEstadoActivoFijo, STIPO_TAMANIO_GENERAL,false,true,this);			
		
		//DETALLE
		this.jmenuDetalleArchivoEstadoActivoFijo.add(this.jMenuItemDetalleCerrarEstadoActivoFijo);
		
		this.jmenuDetalleAccionesEstadoActivoFijo.add(this.jMenuItemActualizarEstadoActivoFijo);
		this.jmenuDetalleAccionesEstadoActivoFijo.add(this.jMenuItemEliminarEstadoActivoFijo);
		this.jmenuDetalleAccionesEstadoActivoFijo.add(this.jMenuItemCancelarEstadoActivoFijo);		
		
		//this.jmenuDetalleDatosEstadoActivoFijo.add(this.jMenuItemDetalleAbrirOrderByEstadoActivoFijo);				
		this.jmenuDetalleDatosEstadoActivoFijo.add(this.jMenuItemDetalleMostarOcultarEstadoActivoFijo);				
				
		//this.jmenuDetalleAccionesEstadoActivoFijo.add(this.jMenuItemGuardarCambiosEstadoActivoFijo);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES				
		
		//DETALLE
		FuncionesSwing.setBoldMenu(this.jmenuDetalleArchivoEstadoActivoFijo, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleAccionesEstadoActivoFijo, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleDatosEstadoActivoFijo, STIPO_TAMANIO_GENERAL,false,true,this);
			
		this.jmenuBarDetalleEstadoActivoFijo.add(this.jmenuDetalleArchivoEstadoActivoFijo);		
		this.jmenuBarDetalleEstadoActivoFijo.add(this.jmenuDetalleAccionesEstadoActivoFijo);		
		this.jmenuBarDetalleEstadoActivoFijo.add(this.jmenuDetalleDatosEstadoActivoFijo);		
		
		//MENU RELACIONES
		if(!this.conCargarMinimo) {
			FuncionesSwing.setBoldMenu(this.jmenuDetalleEstadoActivoFijo, STIPO_TAMANIO_GENERAL,false,true,this);
			
			this.jmenuBarDetalleEstadoActivoFijo.add(this.jmenuDetalleEstadoActivoFijo);		
		}
		//DETALLE_FIN
		
		
		//AGREGA MENU DETALLE A PANTALLA
		this.setJMenuBar(this.jmenuBarDetalleEstadoActivoFijo);				
	}
	
	
	public void inicializarElementosCamposEstadoActivoFijo() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		jLabelIdEstadoActivoFijo = new JLabelMe();
		jLabelIdEstadoActivoFijo.setText(""+Constantes2.S_CODIGO_UNICO+"");
		jLabelIdEstadoActivoFijo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdEstadoActivoFijo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdEstadoActivoFijo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelIdEstadoActivoFijo,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jPanelidEstadoActivoFijo = new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelidEstadoActivoFijo.setToolTipText(EstadoActivoFijoConstantesFunciones.LABEL_ID);
		this.gridaBagLayoutEstadoActivoFijo= new GridBagLayout();

		this.jPanelidEstadoActivoFijo.setLayout(this.gridaBagLayoutEstadoActivoFijo);

		jLabelidEstadoActivoFijo = new JLabel();
		jLabelidEstadoActivoFijo.setText("Id");

		jLabelidEstadoActivoFijo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidEstadoActivoFijo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidEstadoActivoFijo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));



					
		this.jLabelcodigoEstadoActivoFijo = new JLabelMe();
		this.jLabelcodigoEstadoActivoFijo.setText(""+EstadoActivoFijoConstantesFunciones.LABEL_CODIGO+" : *");
		this.jLabelcodigoEstadoActivoFijo.setToolTipText("Codigo");
		this.jLabelcodigoEstadoActivoFijo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcodigoEstadoActivoFijo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcodigoEstadoActivoFijo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelcodigoEstadoActivoFijo,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelcodigoEstadoActivoFijo=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelcodigoEstadoActivoFijo.setToolTipText(EstadoActivoFijoConstantesFunciones.LABEL_CODIGO);
		this.gridaBagLayoutEstadoActivoFijo = new GridBagLayout();
		this.jPanelcodigoEstadoActivoFijo.setLayout(this.gridaBagLayoutEstadoActivoFijo);


		jTextFieldcodigoEstadoActivoFijo= new JTextFieldMe();

		jTextFieldcodigoEstadoActivoFijo.setEnabled(false);
		jTextFieldcodigoEstadoActivoFijo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcodigoEstadoActivoFijo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcodigoEstadoActivoFijo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldcodigoEstadoActivoFijo,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtoncodigoEstadoActivoFijoBusqueda= new JButtonMe();
		this.jButtoncodigoEstadoActivoFijoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncodigoEstadoActivoFijoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncodigoEstadoActivoFijoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtoncodigoEstadoActivoFijoBusqueda.setText("U");
		this.jButtoncodigoEstadoActivoFijoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtoncodigoEstadoActivoFijoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtoncodigoEstadoActivoFijoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldcodigoEstadoActivoFijo.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldcodigoEstadoActivoFijo.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"codigoEstadoActivoFijoBusqueda"));

		if(this.estadoactivofijoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtoncodigoEstadoActivoFijoBusqueda.setVisible(false);		}


					
		this.jLabelnombreEstadoActivoFijo = new JLabelMe();
		this.jLabelnombreEstadoActivoFijo.setText(""+EstadoActivoFijoConstantesFunciones.LABEL_NOMBRE+" : *");
		this.jLabelnombreEstadoActivoFijo.setToolTipText("Nombre");
		this.jLabelnombreEstadoActivoFijo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnombreEstadoActivoFijo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnombreEstadoActivoFijo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelnombreEstadoActivoFijo,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelnombreEstadoActivoFijo=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelnombreEstadoActivoFijo.setToolTipText(EstadoActivoFijoConstantesFunciones.LABEL_NOMBRE);
		this.gridaBagLayoutEstadoActivoFijo = new GridBagLayout();
		this.jPanelnombreEstadoActivoFijo.setLayout(this.gridaBagLayoutEstadoActivoFijo);


		jTextAreanombreEstadoActivoFijo= new JTextAreaMe();
		jTextAreanombreEstadoActivoFijo.setEnabled(false);
		jTextAreanombreEstadoActivoFijo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreEstadoActivoFijo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreEstadoActivoFijo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreEstadoActivoFijo.setLineWrap(true);
		jTextAreanombreEstadoActivoFijo.setWrapStyleWord(true);
		jTextAreanombreEstadoActivoFijo.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreanombreEstadoActivoFijo.setRows(4);

		FuncionesSwing.setBoldTextArea(jTextAreanombreEstadoActivoFijo,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPanenombreEstadoActivoFijo = new JScrollPane(jTextAreanombreEstadoActivoFijo);
		jscrollPanenombreEstadoActivoFijo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanenombreEstadoActivoFijo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanenombreEstadoActivoFijo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));

		this.jButtonnombreEstadoActivoFijoBusqueda= new JButtonMe();
		this.jButtonnombreEstadoActivoFijoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombreEstadoActivoFijoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombreEstadoActivoFijoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonnombreEstadoActivoFijoBusqueda.setText("U");
		this.jButtonnombreEstadoActivoFijoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonnombreEstadoActivoFijoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonnombreEstadoActivoFijoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreanombreEstadoActivoFijo.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreanombreEstadoActivoFijo.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"nombreEstadoActivoFijoBusqueda"));

		if(this.estadoactivofijoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonnombreEstadoActivoFijoBusqueda.setVisible(false);		}


	}
	
	public void inicializarElementosCamposForeigKeysEstadoActivoFijo() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		this.jLabelid_empresaEstadoActivoFijo = new JLabelMe();
		this.jLabelid_empresaEstadoActivoFijo.setText(""+EstadoActivoFijoConstantesFunciones.LABEL_IDEMPRESA+" : *");
		this.jLabelid_empresaEstadoActivoFijo.setToolTipText("Empresa");
		this.jLabelid_empresaEstadoActivoFijo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaEstadoActivoFijo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaEstadoActivoFijo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_empresaEstadoActivoFijo,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_empresaEstadoActivoFijo=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_empresaEstadoActivoFijo.setToolTipText(EstadoActivoFijoConstantesFunciones.LABEL_IDEMPRESA);
		this.gridaBagLayoutEstadoActivoFijo = new GridBagLayout();
		this.jPanelid_empresaEstadoActivoFijo.setLayout(this.gridaBagLayoutEstadoActivoFijo);


		jComboBoxid_empresaEstadoActivoFijo= new JComboBoxMe();
		jComboBoxid_empresaEstadoActivoFijo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaEstadoActivoFijo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaEstadoActivoFijo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_empresaEstadoActivoFijo,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_empresaEstadoActivoFijo.setEnabled(false);

		this.jButtonid_empresaEstadoActivoFijo= new JButtonMe();
		this.jButtonid_empresaEstadoActivoFijo.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaEstadoActivoFijo.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaEstadoActivoFijo.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaEstadoActivoFijo.setText("Buscar");
		this.jButtonid_empresaEstadoActivoFijo.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_empresaEstadoActivoFijo.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaEstadoActivoFijo,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_empresaEstadoActivoFijo.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaEstadoActivoFijo.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaEstadoActivoFijo"));

		this.jButtonid_empresaEstadoActivoFijoBusqueda= new JButtonMe();
		this.jButtonid_empresaEstadoActivoFijoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaEstadoActivoFijoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaEstadoActivoFijoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaEstadoActivoFijoBusqueda.setText("U");
		this.jButtonid_empresaEstadoActivoFijoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_empresaEstadoActivoFijoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaEstadoActivoFijoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_empresaEstadoActivoFijo.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaEstadoActivoFijo.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaEstadoActivoFijoBusqueda"));

		if(this.estadoactivofijoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_empresaEstadoActivoFijoBusqueda.setVisible(false);		}

		this.jButtonid_empresaEstadoActivoFijoUpdate= new JButtonMe();
		this.jButtonid_empresaEstadoActivoFijoUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaEstadoActivoFijoUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaEstadoActivoFijoUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaEstadoActivoFijoUpdate.setText("U");
		this.jButtonid_empresaEstadoActivoFijoUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_empresaEstadoActivoFijoUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaEstadoActivoFijoUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_empresaEstadoActivoFijo.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaEstadoActivoFijo.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaEstadoActivoFijoUpdate"));



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
		//this.jInternalFrameDetalleEstadoActivoFijo = new EstadoActivoFijoBeanSwingJInternalFrameAdditional(paginaTipo);//JInternalFrameBase("Estado Activo Fijo DATOS");
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutEstadoActivoFijo= new GridBagLayout();
		

		
		String sToolTipEstadoActivoFijo="";
		sToolTipEstadoActivoFijo=EstadoActivoFijoConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipEstadoActivoFijo+="(ActivosFijos.EstadoActivoFijo)";
		}
		
		if(!this.estadoactivofijoSessionBean.getEsGuardarRelacionado()) {
			sToolTipEstadoActivoFijo+="_"+this.opcionActual.getId();
		}
								
		
		this.jButtonNuevoEstadoActivoFijo = new JButtonMe();
		this.jButtonModificarEstadoActivoFijo = new JButtonMe();
        this.jButtonActualizarEstadoActivoFijo = new JButtonMe();
        this.jButtonEliminarEstadoActivoFijo = new JButtonMe();
        this.jButtonCancelarEstadoActivoFijo = new JButtonMe();
        this.jButtonGuardarCambiosEstadoActivoFijo = new JButtonMe();
		this.jButtonGuardarCambiosTablaEstadoActivoFijo = new JButtonMe();
		this.jButtonCerrarEstadoActivoFijo = new JButtonMe();
		
		this.jScrollPanelDatosEstadoActivoFijo = new JScrollPane();   
        this.jScrollPanelDatosEdicionEstadoActivoFijo = new JScrollPane();
		this.jScrollPanelDatosGeneralEstadoActivoFijo = new JScrollPane();
				
		
		
		this.jPanelCamposEstadoActivoFijo = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelCamposOcultosEstadoActivoFijo = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
        this.jPanelAccionesEstadoActivoFijo = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		this.jPanelAccionesFormularioEstadoActivoFijo = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		this.sPath=" <---> Acceso: Estado Activo Fijo";
		
		if(!this.estadoactivofijoSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosEstadoActivoFijo.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Estado Activo Fijos" + this.sPath));
		} else {
			this.jScrollPanelDatosEstadoActivoFijo.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosEdicionEstadoActivoFijo.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		this.jScrollPanelDatosGeneralEstadoActivoFijo.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
			
        this.jPanelCamposEstadoActivoFijo.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
        this.jPanelCamposEstadoActivoFijo.setName("jPanelCamposEstadoActivoFijo"); 

		this.jPanelCamposOcultosEstadoActivoFijo.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos Ocultos"));
        this.jPanelCamposOcultosEstadoActivoFijo.setName("jPanelCamposOcultosEstadoActivoFijo"); 

        this.jPanelAccionesEstadoActivoFijo.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesEstadoActivoFijo.setToolTipText("Acciones");
        this.jPanelAccionesEstadoActivoFijo.setName("Acciones"); 

		this.jPanelAccionesFormularioEstadoActivoFijo.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones Extra/Post"));
        this.jPanelAccionesFormularioEstadoActivoFijo.setToolTipText("Acciones");
        this.jPanelAccionesFormularioEstadoActivoFijo.setName("Acciones"); 
		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosEdicionEstadoActivoFijo, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralEstadoActivoFijo, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosEstadoActivoFijo, STIPO_TAMANIO_GENERAL,false,false,this);		
		FuncionesSwing.setBoldPanel(this.jPanelCamposEstadoActivoFijo, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelCamposOcultosEstadoActivoFijo, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelAccionesFormularioEstadoActivoFijo, STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {
		
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		
        this.jButtonNuevoEstadoActivoFijo.setText("Nuevo");
		this.jButtonModificarEstadoActivoFijo.setText("Editar");
        this.jButtonActualizarEstadoActivoFijo.setText("Actualizar");
        this.jButtonEliminarEstadoActivoFijo.setText("Eliminar");
        this.jButtonCancelarEstadoActivoFijo.setText("Cancelar");
        this.jButtonGuardarCambiosEstadoActivoFijo.setText("Guardar");
		this.jButtonGuardarCambiosTablaEstadoActivoFijo.setText("Guardar");
		this.jButtonCerrarEstadoActivoFijo.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoEstadoActivoFijo,"nuevo_button","Nuevo",this.estadoactivofijoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonModificarEstadoActivoFijo,"modificar_button","Editar",this.estadoactivofijoSessionBean.getEsGuardarRelacionado());
       	FuncionesSwing.addImagenButtonGeneral(this.jButtonActualizarEstadoActivoFijo,"actualizar_button","Actualizar",this.estadoactivofijoSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonEliminarEstadoActivoFijo,"eliminar_button","Eliminar",this.estadoactivofijoSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonCancelarEstadoActivoFijo,"cancelar_button","Cancelar",this.estadoactivofijoSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosEstadoActivoFijo,"guardarcambios_button","Guardar",this.estadoactivofijoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaEstadoActivoFijo,"guardarcambiostabla_button","Guardar",this.estadoactivofijoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarEstadoActivoFijo,"cerrar_button","Salir",this.estadoactivofijoSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoEstadoActivoFijo, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonModificarEstadoActivoFijo, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosEstadoActivoFijo, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaEstadoActivoFijo, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarEstadoActivoFijo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		FuncionesSwing.setBoldButton(this.jButtonActualizarEstadoActivoFijo, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonEliminarEstadoActivoFijo, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonCancelarEstadoActivoFijo, STIPO_TAMANIO_GENERAL,false,false,this);
		
		this.jButtonNuevoEstadoActivoFijo.setToolTipText("Nuevo"+" "+EstadoActivoFijoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonModificarEstadoActivoFijo.setToolTipText("Editar"+" "+EstadoActivoFijoConstantesFunciones.SCLASSWEBTITULO+"");// + FuncionesSwing.getKeyMensaje("MODIFICAR"))
        this.jButtonActualizarEstadoActivoFijo.setToolTipText("Actualizar"+" "+EstadoActivoFijoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
        this.jButtonEliminarEstadoActivoFijo.setToolTipText("Eliminar)"+" "+EstadoActivoFijoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"));
        this.jButtonCancelarEstadoActivoFijo.setToolTipText("Cancelar"+" "+EstadoActivoFijoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"));
        this.jButtonGuardarCambiosEstadoActivoFijo.setToolTipText("Guardar"+" "+EstadoActivoFijoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonGuardarCambiosTablaEstadoActivoFijo.setToolTipText("Guardar"+" "+EstadoActivoFijoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarEstadoActivoFijo.setToolTipText("Salir"+" "+EstadoActivoFijoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoEstadoActivoFijo";
		inputMap = this.jButtonNuevoEstadoActivoFijo.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoEstadoActivoFijo.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoEstadoActivoFijo"));
		
		//ACTUALIZAR
		sMapKey = "ActualizarEstadoActivoFijo";
		inputMap = this.jButtonActualizarEstadoActivoFijo.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ACTUALIZAR") , FuncionesSwing.getMaskKey("ACTUALIZAR")), sMapKey);
		
		this.jButtonActualizarEstadoActivoFijo.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ActualizarEstadoActivoFijo"));
		
		//ELIMINAR
		sMapKey = "EliminarEstadoActivoFijo";
		inputMap = this.jButtonEliminarEstadoActivoFijo.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ELIMINAR") , FuncionesSwing.getMaskKey("ELIMINAR")), sMapKey);
		
		this.jButtonEliminarEstadoActivoFijo.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"EliminarEstadoActivoFijo"));
		
		//CANCELAR	
		sMapKey = "CancelarEstadoActivoFijo";
		inputMap = this.jButtonCancelarEstadoActivoFijo.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CANCELAR") , FuncionesSwing.getMaskKey("CANCELAR")), sMapKey);
		
		this.jButtonCancelarEstadoActivoFijo.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CancelarEstadoActivoFijo"));
		
		//CERRAR		
		sMapKey = "CerrarEstadoActivoFijo";
		inputMap = this.jButtonCerrarEstadoActivoFijo.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarEstadoActivoFijo.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarEstadoActivoFijo"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaEstadoActivoFijo";
		inputMap = this.jButtonGuardarCambiosTablaEstadoActivoFijo.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaEstadoActivoFijo.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaEstadoActivoFijo"));
		
		//HOT KEYS
		
		this.jCheckBoxPostAccionNuevoEstadoActivoFijo = new JCheckBoxMe();
		this.jCheckBoxPostAccionNuevoEstadoActivoFijo.setText("Nuevo");
		this.jCheckBoxPostAccionNuevoEstadoActivoFijo.setToolTipText("Nuevo EstadoActivoFijo");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionNuevoEstadoActivoFijo, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinCerrarEstadoActivoFijo = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinCerrarEstadoActivoFijo.setText("Sin Cerrar");
		this.jCheckBoxPostAccionSinCerrarEstadoActivoFijo.setToolTipText("Sin Cerrar Ventana EstadoActivoFijo");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinCerrarEstadoActivoFijo, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinMensajeEstadoActivoFijo = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinMensajeEstadoActivoFijo.setText("Sin Mensaje");
		this.jCheckBoxPostAccionSinMensajeEstadoActivoFijo.setToolTipText("Sin Mensaje Confirmacion");				
				
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinMensajeEstadoActivoFijo, STIPO_TAMANIO_GENERAL,false,false,this);       	
       
				
		
			
			
		this.jComboBoxTiposAccionesEstadoActivoFijo = new JComboBoxMe();
		//this.jComboBoxTiposAccionesEstadoActivoFijo.setText("Accion");
		this.jComboBoxTiposAccionesEstadoActivoFijo.setToolTipText("Tipos de Acciones");
							
		

		this.jComboBoxTiposAccionesFormularioEstadoActivoFijo = new JComboBoxMe();
		//this.jComboBoxTiposAccionesFormularioEstadoActivoFijo.setText("Accion");				
    	this.jComboBoxTiposAccionesFormularioEstadoActivoFijo.setToolTipText("Tipos de Acciones");
	
		this.jLabelAccionesEstadoActivoFijo = new JLabelMe();
		
		this.jLabelAccionesEstadoActivoFijo.setText("Acciones");		
		this.jLabelAccionesEstadoActivoFijo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesEstadoActivoFijo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesEstadoActivoFijo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
        //HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		//HOT KEYS2
		
		//ELEMENTOS
		this.inicializarElementosCamposEstadoActivoFijo();
		
		//ELEMENTOS FK
		this.inicializarElementosCamposForeigKeysEstadoActivoFijo();
				
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		this.jTabbedPaneRelacionesEstadoActivoFijo=new JTabbedPane();
		this.jTabbedPaneRelacionesEstadoActivoFijo.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Relacionados"));
		
		//ESTA EN BEAN

		
		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneRelacionesEstadoActivoFijo,STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		int iPosXAccionPaginacion=0;
		
		
		
				
		
		this.jComboBoxTiposAccionesEstadoActivoFijo.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesEstadoActivoFijo.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesEstadoActivoFijo.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesEstadoActivoFijo, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		
		
		this.jComboBoxTiposAccionesFormularioEstadoActivoFijo.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioEstadoActivoFijo.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioEstadoActivoFijo.setPreferredSize(new Dimension(145,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesFormularioEstadoActivoFijo, STIPO_TAMANIO_GENERAL,false,false,this);				
		
		GridBagLayout gridaBagLayoutCamposEstadoActivoFijo = new GridBagLayout();
		GridBagLayout gridaBagLayoutCamposOcultosEstadoActivoFijo = new GridBagLayout();
		
		this.jPanelCamposEstadoActivoFijo.setLayout(gridaBagLayoutCamposEstadoActivoFijo);
		this.jPanelCamposOcultosEstadoActivoFijo.setLayout(gridaBagLayoutCamposOcultosEstadoActivoFijo);
		
		;
		;
		
		
		//SUBPANELES SIMPLES
		//SUBPANELES POR CAMPO
        
	this.gridBagConstraintsEstadoActivoFijo = new GridBagConstraints();
	this.gridBagConstraintsEstadoActivoFijo.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsEstadoActivoFijo.gridy = 0;
	this.gridBagConstraintsEstadoActivoFijo.gridx = 0;
	this.gridBagConstraintsEstadoActivoFijo.ipadx = 0;
	this.gridBagConstraintsEstadoActivoFijo.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelidEstadoActivoFijo.add(jLabelIdEstadoActivoFijo, this.gridBagConstraintsEstadoActivoFijo);



	this.gridBagConstraintsEstadoActivoFijo = new GridBagConstraints();
	this.gridBagConstraintsEstadoActivoFijo.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsEstadoActivoFijo.gridy = 0;
	this.gridBagConstraintsEstadoActivoFijo.gridx = 1;
	this.gridBagConstraintsEstadoActivoFijo.ipadx = 0;
	this.gridBagConstraintsEstadoActivoFijo.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelidEstadoActivoFijo.add(jLabelidEstadoActivoFijo, this.gridBagConstraintsEstadoActivoFijo);


	this.gridBagConstraintsEstadoActivoFijo = new GridBagConstraints();
	this.gridBagConstraintsEstadoActivoFijo.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsEstadoActivoFijo.gridy = 0;
	this.gridBagConstraintsEstadoActivoFijo.gridx = 0;
	this.gridBagConstraintsEstadoActivoFijo.ipadx = 0;
	this.gridBagConstraintsEstadoActivoFijo.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_empresaEstadoActivoFijo.add(jLabelid_empresaEstadoActivoFijo, this.gridBagConstraintsEstadoActivoFijo);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsEstadoActivoFijo = new GridBagConstraints();
		//this.gridBagConstraintsEstadoActivoFijo.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsEstadoActivoFijo.gridy = 0;
		this.gridBagConstraintsEstadoActivoFijo.gridx = 2;
		this.gridBagConstraintsEstadoActivoFijo.ipadx = 0;
		this.gridBagConstraintsEstadoActivoFijo.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaEstadoActivoFijo.add(jButtonid_empresaEstadoActivoFijoBusqueda, this.gridBagConstraintsEstadoActivoFijo);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsEstadoActivoFijo = new GridBagConstraints();
		//this.gridBagConstraintsEstadoActivoFijo.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsEstadoActivoFijo.gridy = 0;
		this.gridBagConstraintsEstadoActivoFijo.gridx = 3;
		this.gridBagConstraintsEstadoActivoFijo.ipadx = 0;
		this.gridBagConstraintsEstadoActivoFijo.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaEstadoActivoFijo.add(jButtonid_empresaEstadoActivoFijoUpdate, this.gridBagConstraintsEstadoActivoFijo);
	}

	this.gridBagConstraintsEstadoActivoFijo = new GridBagConstraints();
	this.gridBagConstraintsEstadoActivoFijo.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsEstadoActivoFijo.gridy = 0;
	this.gridBagConstraintsEstadoActivoFijo.gridx = 1;
	this.gridBagConstraintsEstadoActivoFijo.ipadx = 0;
	this.gridBagConstraintsEstadoActivoFijo.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_empresaEstadoActivoFijo.add(jComboBoxid_empresaEstadoActivoFijo, this.gridBagConstraintsEstadoActivoFijo);


	this.gridBagConstraintsEstadoActivoFijo = new GridBagConstraints();
	this.gridBagConstraintsEstadoActivoFijo.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsEstadoActivoFijo.gridy = 0;
	this.gridBagConstraintsEstadoActivoFijo.gridx = 0;
	this.gridBagConstraintsEstadoActivoFijo.ipadx = 0;
	this.gridBagConstraintsEstadoActivoFijo.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelcodigoEstadoActivoFijo.add(jLabelcodigoEstadoActivoFijo, this.gridBagConstraintsEstadoActivoFijo);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsEstadoActivoFijo = new GridBagConstraints();
		//this.gridBagConstraintsEstadoActivoFijo.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsEstadoActivoFijo.gridy = 0;
		this.gridBagConstraintsEstadoActivoFijo.gridx = 2;
		this.gridBagConstraintsEstadoActivoFijo.ipadx = 0;
		this.gridBagConstraintsEstadoActivoFijo.insets = new Insets(0, 0, 0, 0);
		this.jPanelcodigoEstadoActivoFijo.add(jButtoncodigoEstadoActivoFijoBusqueda, this.gridBagConstraintsEstadoActivoFijo);
	}

	this.gridBagConstraintsEstadoActivoFijo = new GridBagConstraints();
	this.gridBagConstraintsEstadoActivoFijo.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsEstadoActivoFijo.gridy = 0;
	this.gridBagConstraintsEstadoActivoFijo.gridx = 1;
	this.gridBagConstraintsEstadoActivoFijo.ipadx = 0;
	this.gridBagConstraintsEstadoActivoFijo.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelcodigoEstadoActivoFijo.add(jTextFieldcodigoEstadoActivoFijo, this.gridBagConstraintsEstadoActivoFijo);


	this.gridBagConstraintsEstadoActivoFijo = new GridBagConstraints();
	this.gridBagConstraintsEstadoActivoFijo.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsEstadoActivoFijo.gridy = 0;
	this.gridBagConstraintsEstadoActivoFijo.gridx = 0;
	this.gridBagConstraintsEstadoActivoFijo.ipadx = 0;
	this.gridBagConstraintsEstadoActivoFijo.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelnombreEstadoActivoFijo.add(jLabelnombreEstadoActivoFijo, this.gridBagConstraintsEstadoActivoFijo);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsEstadoActivoFijo = new GridBagConstraints();
		//this.gridBagConstraintsEstadoActivoFijo.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsEstadoActivoFijo.gridy = 0;
		this.gridBagConstraintsEstadoActivoFijo.gridx = 2;
		this.gridBagConstraintsEstadoActivoFijo.ipadx = 0;
		this.gridBagConstraintsEstadoActivoFijo.insets = new Insets(0, 0, 0, 0);
		this.jPanelnombreEstadoActivoFijo.add(jButtonnombreEstadoActivoFijoBusqueda, this.gridBagConstraintsEstadoActivoFijo);
	}

	this.gridBagConstraintsEstadoActivoFijo = new GridBagConstraints();
	this.gridBagConstraintsEstadoActivoFijo.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsEstadoActivoFijo.gridy = 0;
	this.gridBagConstraintsEstadoActivoFijo.gridx = 1;
	this.gridBagConstraintsEstadoActivoFijo.ipadx = 0;
	this.gridBagConstraintsEstadoActivoFijo.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelnombreEstadoActivoFijo.add(jscrollPanenombreEstadoActivoFijo, this.gridBagConstraintsEstadoActivoFijo);


		//SUBPANELES SIMPLES
		
		//SUBPANELES EN PANEL
		//SUBPANELES EN PANEL CAMPOS NORMAL				
		
	this.gridBagConstraintsEstadoActivoFijo = new GridBagConstraints();
	this.gridBagConstraintsEstadoActivoFijo.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsEstadoActivoFijo.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsEstadoActivoFijo.gridy = iYPanelCamposEstadoActivoFijo;
	this.gridBagConstraintsEstadoActivoFijo.gridx = iXPanelCamposEstadoActivoFijo++;
	this.gridBagConstraintsEstadoActivoFijo.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsEstadoActivoFijo.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposEstadoActivoFijo.add(this.jPanelidEstadoActivoFijo, this.gridBagConstraintsEstadoActivoFijo);



	if(iXPanelCamposEstadoActivoFijo % 1==0) {
		iXPanelCamposEstadoActivoFijo=0;
		iYPanelCamposEstadoActivoFijo++;
	}
	this.gridBagConstraintsEstadoActivoFijo = new GridBagConstraints();
	this.gridBagConstraintsEstadoActivoFijo.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsEstadoActivoFijo.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsEstadoActivoFijo.gridy = iYPanelCamposEstadoActivoFijo;
	this.gridBagConstraintsEstadoActivoFijo.gridx = iXPanelCamposEstadoActivoFijo++;
	this.gridBagConstraintsEstadoActivoFijo.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsEstadoActivoFijo.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposEstadoActivoFijo.add(this.jPanelcodigoEstadoActivoFijo, this.gridBagConstraintsEstadoActivoFijo);



	if(iXPanelCamposEstadoActivoFijo % 1==0) {
		iXPanelCamposEstadoActivoFijo=0;
		iYPanelCamposEstadoActivoFijo++;
	}
	this.gridBagConstraintsEstadoActivoFijo = new GridBagConstraints();
	this.gridBagConstraintsEstadoActivoFijo.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsEstadoActivoFijo.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsEstadoActivoFijo.gridy = iYPanelCamposEstadoActivoFijo;
	this.gridBagConstraintsEstadoActivoFijo.gridx = iXPanelCamposEstadoActivoFijo++;
	this.gridBagConstraintsEstadoActivoFijo.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsEstadoActivoFijo.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposEstadoActivoFijo.add(this.jPanelnombreEstadoActivoFijo, this.gridBagConstraintsEstadoActivoFijo);



	if(iXPanelCamposEstadoActivoFijo % 1==0) {
		iXPanelCamposEstadoActivoFijo=0;
		iYPanelCamposEstadoActivoFijo++;
	}
		
		//SUBPANELES EN PANEL CAMPOS OCULTOS				
		
	this.gridBagConstraintsEstadoActivoFijo = new GridBagConstraints();
	this.gridBagConstraintsEstadoActivoFijo.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsEstadoActivoFijo.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsEstadoActivoFijo.gridy = iYPanelCamposOcultosEstadoActivoFijo;
	this.gridBagConstraintsEstadoActivoFijo.gridx = iXPanelCamposOcultosEstadoActivoFijo++;
	this.gridBagConstraintsEstadoActivoFijo.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsEstadoActivoFijo.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosEstadoActivoFijo.add(this.jPanelid_empresaEstadoActivoFijo, this.gridBagConstraintsEstadoActivoFijo);



	if(iXPanelCamposOcultosEstadoActivoFijo % 1==0) {
		iXPanelCamposOcultosEstadoActivoFijo=0;
		iYPanelCamposOcultosEstadoActivoFijo++;
	}
		
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
			
		GridBagLayout gridaBagLayoutAccionesEstadoActivoFijo= new GridBagLayout();
		this.jPanelAccionesEstadoActivoFijo.setLayout(gridaBagLayoutAccionesEstadoActivoFijo);
		
		GridBagLayout gridaBagLayoutAccionesFormularioEstadoActivoFijo= new GridBagLayout();
		this.jPanelAccionesFormularioEstadoActivoFijo.setLayout(gridaBagLayoutAccionesFormularioEstadoActivoFijo);
		
		this.gridBagConstraintsEstadoActivoFijo = new GridBagConstraints();
		this.gridBagConstraintsEstadoActivoFijo.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsEstadoActivoFijo.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioEstadoActivoFijo.add(this.jComboBoxTiposAccionesFormularioEstadoActivoFijo, this.gridBagConstraintsEstadoActivoFijo);

		this.gridBagConstraintsEstadoActivoFijo = new GridBagConstraints();
		this.gridBagConstraintsEstadoActivoFijo.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsEstadoActivoFijo.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioEstadoActivoFijo.add(this.jCheckBoxPostAccionNuevoEstadoActivoFijo, this.gridBagConstraintsEstadoActivoFijo);
			
		//DEBE CERRARSE Y ACTUALIZARSE TODO NUEVAMENTE, SI ES RELACIONADO PUEDE FUNCIONAR
		//if(!this.estadoactivofijoSessionBean.getEstaModoGuardarRelaciones()) {		
		//SE ARRIESGA
		//if(!this.conFuncionalidadRelaciones) {		
			this.gridBagConstraintsEstadoActivoFijo = new GridBagConstraints();
			this.gridBagConstraintsEstadoActivoFijo.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsEstadoActivoFijo.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioEstadoActivoFijo.add(this.jCheckBoxPostAccionSinCerrarEstadoActivoFijo, this.gridBagConstraintsEstadoActivoFijo);
		//}
		
		
		//NO TIENE MENSAJE POR DEFINICION, O ES MUY COMPLEJO LA PANTALLA PARA HACERLO MAS COMPLICADO
		if(!this.estadoactivofijoSessionBean.getEsGuardarRelacionado()
			){				
			//&& !this.estadoactivofijoSessionBean.getEstaModoGuardarRelaciones()) {
							
			this.gridBagConstraintsEstadoActivoFijo = new GridBagConstraints();
			this.gridBagConstraintsEstadoActivoFijo.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsEstadoActivoFijo.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioEstadoActivoFijo.add(this.jCheckBoxPostAccionSinMensajeEstadoActivoFijo, this.gridBagConstraintsEstadoActivoFijo);
		}
		
		
		int iPosXAccion=0;
		
		this.gridBagConstraintsEstadoActivoFijo = new GridBagConstraints();
		this.gridBagConstraintsEstadoActivoFijo.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsEstadoActivoFijo.gridy = 0;
		this.gridBagConstraintsEstadoActivoFijo.gridx = iPosXAccion++;
			
		this.jPanelAccionesEstadoActivoFijo.add(this.jButtonModificarEstadoActivoFijo, this.gridBagConstraintsEstadoActivoFijo);							

		this.gridBagConstraintsEstadoActivoFijo = new GridBagConstraints();
		this.gridBagConstraintsEstadoActivoFijo.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsEstadoActivoFijo.gridy = 0;
		this.gridBagConstraintsEstadoActivoFijo.gridx =iPosXAccion++;
			
		this.jPanelAccionesEstadoActivoFijo.add(this.jButtonEliminarEstadoActivoFijo, this.gridBagConstraintsEstadoActivoFijo);
		
			
		this.gridBagConstraintsEstadoActivoFijo = new GridBagConstraints();
		this.gridBagConstraintsEstadoActivoFijo.gridy = 0;		
		this.gridBagConstraintsEstadoActivoFijo.gridx = iPosXAccion++;
		
		this.jPanelAccionesEstadoActivoFijo.add(this.jButtonActualizarEstadoActivoFijo, this.gridBagConstraintsEstadoActivoFijo);


		this.gridBagConstraintsEstadoActivoFijo = new GridBagConstraints();
		this.gridBagConstraintsEstadoActivoFijo.gridy = 0;		
		this.gridBagConstraintsEstadoActivoFijo.gridx = iPosXAccion++;
		
		this.jPanelAccionesEstadoActivoFijo.add(this.jButtonGuardarCambiosEstadoActivoFijo, this.gridBagConstraintsEstadoActivoFijo);	
		
		this.gridBagConstraintsEstadoActivoFijo = new GridBagConstraints();
		this.gridBagConstraintsEstadoActivoFijo.gridy = 0;		
		this.gridBagConstraintsEstadoActivoFijo.gridx =iPosXAccion++;
		
		this.jPanelAccionesEstadoActivoFijo.add(this.jButtonCancelarEstadoActivoFijo, this.gridBagConstraintsEstadoActivoFijo);
		
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutEstadoActivoFijo = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutEstadoActivoFijo);
		
		if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.estadoactivofijoSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsEstadoActivoFijo = new GridBagConstraints();						
			this.gridBagConstraintsEstadoActivoFijo.gridy = iGridyPrincipal++;
			this.gridBagConstraintsEstadoActivoFijo.gridx = 0;		
			//this.gridBagConstraintsEstadoActivoFijo.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsEstadoActivoFijo.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsEstadoActivoFijo.ipadx = 100;
				
			
		}
		
		//PROCESANDO EN OTRA PANTALLA
		
		
		int iGridxBusquedasParametros=0;
		
	
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			//NO BUSQUEDA
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		
		this.gridBagConstraintsEstadoActivoFijo = new GridBagConstraints();
		this.gridBagConstraintsEstadoActivoFijo.gridy =iGridyPrincipal++;
		this.gridBagConstraintsEstadoActivoFijo.gridx =0;
		this.gridBagConstraintsEstadoActivoFijo.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsEstadoActivoFijo.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosEstadoActivoFijo, this.gridBagConstraintsEstadoActivoFijo);
				
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);

		
			
		//if(EstadoActivoFijoJInternalFrame.CON_DATOS_FRAME) {				
			//this.jInternalFrameDetalleEstadoActivoFijo = new EstadoActivoFijoBeanSwingJInternalFrameAdditional();//JInternalFrameBase("Estado Activo Fijo DATOS");
			
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
			
	        //this.setTitle("[FOR] - Estado Activo Fijo DATOS");
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Estado Activo Fijo Formulario",PaginaTipo.FORMULARIO,paginaTipo));			
	        this.setSize(iWidthFormulario,iHeightFormulario);        
		   				
			this.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	        this.setResizable(true);
	        this.setClosable(true);
	        this.setMaximizable(true);
		    
			EstadoActivoFijoModel estadoactivofijoModel=new EstadoActivoFijoModel(this);
			
			//SI USARA CLASE INTERNA
			//EstadoActivoFijoModel.EstadoActivoFijoFocusTraversalPolicy estadoactivofijoFocusTraversalPolicy = estadoactivofijoModel.new EstadoActivoFijoFocusTraversalPolicy(this);
			
			//estadoactivofijoFocusTraversalPolicy.setestadoactivofijoJInternalFrame(this);
			
			this.setFocusTraversalPolicy(estadoactivofijoModel);
			
			
			this.jContentPaneDetalleEstadoActivoFijo = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			GridBagLayout gridaBagLayoutDetalleEstadoActivoFijo = new GridBagLayout();	
			this.jContentPaneDetalleEstadoActivoFijo.setLayout(gridaBagLayoutDetalleEstadoActivoFijo);
			
			GridBagLayout gridaBagLayoutBusquedasParametrosEstadoActivoFijo = new GridBagLayout();
			
			
if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
				
				//AGREGA TOOLBAR DETALLE A PANTALLA
				
				this.gridBagConstraintsEstadoActivoFijo = new GridBagConstraints();
				this.gridBagConstraintsEstadoActivoFijo.gridy = iGridyRelaciones++;		
				this.gridBagConstraintsEstadoActivoFijo.gridx = 0;
					
				
				this.jContentPaneDetalleEstadoActivoFijo.add(jTtoolBarDetalleEstadoActivoFijo, gridBagConstraintsEstadoActivoFijo);								
				
}
			
			this.jScrollPanelDatosEdicionEstadoActivoFijo=   new JScrollPane(jContentPaneDetalleEstadoActivoFijo,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionEstadoActivoFijo.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionEstadoActivoFijo.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionEstadoActivoFijo.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			this.jScrollPanelDatosGeneralEstadoActivoFijo=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralEstadoActivoFijo.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralEstadoActivoFijo.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralEstadoActivoFijo.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsEstadoActivoFijo = new GridBagConstraints();
			
			
	        this.gridBagConstraintsEstadoActivoFijo.gridy = iGridyRelaciones++;		
	        this.gridBagConstraintsEstadoActivoFijo.gridx = 0;
	        
			this.jContentPaneDetalleEstadoActivoFijo.add(jPanelCamposEstadoActivoFijo, gridBagConstraintsEstadoActivoFijo);
			
			
			
			
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
						&& estadoactivofijoSessionBean.getConGuardarRelaciones()
						) {
					//paraCargarPorParte es false por defecto(y ejecuta funcion normal cargando detalle en tab panel), si se utiliza funcionalidad es true y carga tab panel auxiliar temporal
					
					this.cargarSessionConBeanSwingJInternalFrameDetalleActivoFijo(this.puedeCargarPorParteDetalleActivoFijo,false,-1);
					this.cargarSessionConBeanSwingJInternalFrameParteActivoFijo(this.puedeCargarPorParteParteActivoFijo,false,-1);
					
					if(this.estadoactivofijoSessionBean.getConGuardarRelaciones()) {
						this.gridBagConstraintsEstadoActivoFijo= new GridBagConstraints();
						this.gridBagConstraintsEstadoActivoFijo.gridy = iGridyRelaciones++;
						this.gridBagConstraintsEstadoActivoFijo.gridx = 0;
						this.jContentPaneDetalleEstadoActivoFijo.add(this.jTabbedPaneRelacionesEstadoActivoFijo, this.gridBagConstraintsEstadoActivoFijo);
					}
					
					//RELACIONES OTROS AGRUPADOS
					;
					
					} else {
						//this.jButtonNuevoRelacionesEstadoActivoFijo.setVisible(false);
						
					this.cargarSessionConBeanSwingJInternalFrameDetalleActivoFijo(true,false,-1);
					this.cargarSessionConBeanSwingJInternalFrameParteActivoFijo(true,false,-1);
					}
				}
			}
			
			Boolean tieneColumnasOcultas=false;
			
			tieneColumnasOcultas=true;
		
						
			
			if(!Constantes.ISDEVELOPING) {
	       		this.jPanelCamposOcultosEstadoActivoFijo.setVisible(false);
			} else {
				if(tieneColumnasOcultas) {
					this.gridBagConstraintsEstadoActivoFijo = new GridBagConstraints();
					this.gridBagConstraintsEstadoActivoFijo.fill=GridBagConstraints.NONE;
					this.gridBagConstraintsEstadoActivoFijo.anchor = GridBagConstraints.WEST;
					
					this.gridBagConstraintsEstadoActivoFijo.gridy = iGridyRelaciones++;		
					this.gridBagConstraintsEstadoActivoFijo.gridx = 0;
					
				
					this.jContentPaneDetalleEstadoActivoFijo.add(jPanelCamposOcultosEstadoActivoFijo, gridBagConstraintsEstadoActivoFijo);
				
					this.jPanelCamposOcultosEstadoActivoFijo.setVisible(true);
				}
			}					
			
			
			
			
			this.gridBagConstraintsEstadoActivoFijo = new GridBagConstraints();
			this.gridBagConstraintsEstadoActivoFijo.gridy = iGridyRelaciones++;//7;		
	        this.gridBagConstraintsEstadoActivoFijo.gridx = 0;
	        this.gridBagConstraintsEstadoActivoFijo.anchor = GridBagConstraints.CENTER;//WEST;
			
			
			
			this.jContentPaneDetalleEstadoActivoFijo.add(this.jPanelAccionesFormularioEstadoActivoFijo, this.gridBagConstraintsEstadoActivoFijo);							
			
			
			
			this.gridBagConstraintsEstadoActivoFijo = new GridBagConstraints();
	        this.gridBagConstraintsEstadoActivoFijo.gridy = iGridyRelaciones;//7;		
	        this.gridBagConstraintsEstadoActivoFijo.gridx = 0;
	        
			
			this.jContentPaneDetalleEstadoActivoFijo.add(this.jPanelAccionesEstadoActivoFijo, this.gridBagConstraintsEstadoActivoFijo);							
			
	        //this.setContentPane(jScrollPanelDatosEdicionEstadoActivoFijo);
			
		//} else {
			//DISENO_DETALLE COMENTAR Y
			//DISENO_DETALLE(Solo Descomentar Seccion Inferior)
			//NOTA-DISENO_DETALLE(Si cambia lo de abajo, cambiar lo comentado, Al final no es lo mismo)
			
			/*
			this.jScrollPanelDatosEdicionEstadoActivoFijo=   new JScrollPane(this.jPanelCamposEstadoActivoFijo,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionEstadoActivoFijo.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionEstadoActivoFijo.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionEstadoActivoFijo.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			
			this.gridBagConstraintsEstadoActivoFijo = new GridBagConstraints();
			this.gridBagConstraintsEstadoActivoFijo.gridy = iGridyPrincipal++;		
			this.gridBagConstraintsEstadoActivoFijo.gridx = 0;
			this.gridBagConstraintsEstadoActivoFijo.fill = GridBagConstraints.BOTH;
			this.gridBagConstraintsEstadoActivoFijo.ipady = this.getSize().height-yOffset*3;
			this.gridBagConstraintsEstadoActivoFijo.anchor = GridBagConstraints.WEST;
			
			this.jContentPane.add(this.jScrollPanelDatosEdicionEstadoActivoFijo, this.gridBagConstraintsEstadoActivoFijo);
			
			//ACCIONES FORMULARIO
			this.gridBagConstraintsEstadoActivoFijo = new GridBagConstraints();
			this.gridBagConstraintsEstadoActivoFijo.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsEstadoActivoFijo.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesFormularioEstadoActivoFijo, this.gridBagConstraintsEstadoActivoFijo);			
			
			this.gridBagConstraintsEstadoActivoFijo = new GridBagConstraints();
			this.gridBagConstraintsEstadoActivoFijo.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsEstadoActivoFijo.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesEstadoActivoFijo, this.gridBagConstraintsEstadoActivoFijo);									
			*/
		//}								
			
		//DISENO_DETALLE-(Descomentar)
		/*
		this.gridBagConstraintsEstadoActivoFijo = new GridBagConstraints();
		this.gridBagConstraintsEstadoActivoFijo.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsEstadoActivoFijo.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposEstadoActivoFijo, this.gridBagConstraintsEstadoActivoFijo);
			
			
		this.gridBagConstraintsEstadoActivoFijo = new GridBagConstraints();
		this.gridBagConstraintsEstadoActivoFijo.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsEstadoActivoFijo.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosEstadoActivoFijo, this.gridBagConstraintsEstadoActivoFijo);
		
			
		this.gridBagConstraintsEstadoActivoFijo = new GridBagConstraints();
		this.gridBagConstraintsEstadoActivoFijo.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsEstadoActivoFijo.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesEstadoActivoFijo, this.gridBagConstraintsEstadoActivoFijo);
		*/
		
			
     	//pack();
		
		
		//return this.jScrollPanelDatosGeneralEstadoActivoFijo;//jContentPane;
		
		return jScrollPanelDatosEdicionEstadoActivoFijo;
    } 
	
		

	public void cargarSessionConBeanSwingJInternalFrameDetalleActivoFijo(Boolean soloSession,Boolean actualizarTab,Integer iIndexTab) throws Exception {

		//SOLO INICIALIZA SESSION (YA NO, CONSUME MUCHA MEMORIA)
		this.detalleactivofijoSessionBean=new DetalleActivoFijoSessionBean();
		this.detalleactivofijoSessionBean.setConGuardarRelaciones(false);
		this.detalleactivofijoSessionBean.setEsGuardarRelacionado(true);

		this.detalleactivofijoBeanSwingJInternalFrame=null;//new DetalleActivoFijoBeanSwingJInternalFrame(false,true,false);

		if(!soloSession) {
			//this.detalleactivofijoBeanSwingJInternalFramePopup=new DetalleActivoFijoBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,true);
			//this.detalleactivofijoBeanSwingJInternalFramePopup.jInternalFrameParent=this;


			if(this.detalleactivofijoSessionBean.getEsGuardarRelacionado()) {

				DetalleActivoFijoJInternalFrame.STIPO_TAMANIO_GENERAL=EstadoActivoFijoJInternalFrame.STIPO_TAMANIO_GENERAL;
				DetalleActivoFijoJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=EstadoActivoFijoJInternalFrame.STIPO_TAMANIO_GENERAL;

				this.detalleactivofijoSessionBean.setEsGuardarRelacionado(true);

				this.detalleactivofijoBeanSwingJInternalFrame=new DetalleActivoFijoBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.SECUNDARIO,false,true,false,false);//false->4

				this.detalleactivofijoBeanSwingJInternalFrame.setJInternalFrameParent(this);
				this.detalleactivofijoBeanSwingJInternalFrame.setdetalleactivofijoSessionBean(this.detalleactivofijoSessionBean);

				//this.gridBagConstraintsEstadoActivoFijo = new GridBagConstraints();
				//this.gridBagConstraintsEstadoActivoFijo.gridy = iGridyRelaciones++;
				//this.gridBagConstraintsEstadoActivoFijo.gridx = 0;
				//this.jContentPaneDetalleEstadoActivoFijo.add(this.detalleactivofijoBeanSwingJInternalFrame.getContentPane(), this.gridBagConstraintsEstadoActivoFijo);

				if(!actualizarTab) {
					this.jTabbedPaneRelacionesEstadoActivoFijo.add("Detalle Activo Fijos",this.detalleactivofijoBeanSwingJInternalFrame.getContentPane());
				} else {
					this.jTabbedPaneRelacionesEstadoActivoFijo.setComponentAt(iIndexTab,this.detalleactivofijoBeanSwingJInternalFrame.getContentPane());
				}

				//DetalleActivoFijoJInternalFrame.ESTA_CARGADO_PORPARTE=true;
			} else {
				this.detalleactivofijoSessionBean.setEsGuardarRelacionado(false);
				this.detalleactivofijoBeanSwingJInternalFrame=null;//new DetalleActivoFijoBeanSwingJInternalFrame(false,false,jDesktopPane,this.usuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,false);
			}
		} else {
			if(this.detalleactivofijoSessionBean.getEsGuardarRelacionado()) {
				if(this.puedeCargarPorParteDetalleActivoFijo) {
					this.jTabbedPaneRelacionesEstadoActivoFijo.add("Detalle Activo Fijos",new JPanel());
				}
			}
		}
	}

	public void cargarSessionConBeanSwingJInternalFrameParteActivoFijo(Boolean soloSession,Boolean actualizarTab,Integer iIndexTab) throws Exception {

		//SOLO INICIALIZA SESSION (YA NO, CONSUME MUCHA MEMORIA)
		this.parteactivofijoSessionBean=new ParteActivoFijoSessionBean();
		this.parteactivofijoSessionBean.setConGuardarRelaciones(false);
		this.parteactivofijoSessionBean.setEsGuardarRelacionado(true);

		this.parteactivofijoBeanSwingJInternalFrame=null;//new ParteActivoFijoBeanSwingJInternalFrame(false,true,false);

		if(!soloSession) {
			//this.parteactivofijoBeanSwingJInternalFramePopup=new ParteActivoFijoBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,true);
			//this.parteactivofijoBeanSwingJInternalFramePopup.jInternalFrameParent=this;


			if(this.parteactivofijoSessionBean.getEsGuardarRelacionado()) {

				ParteActivoFijoJInternalFrame.STIPO_TAMANIO_GENERAL=EstadoActivoFijoJInternalFrame.STIPO_TAMANIO_GENERAL;
				ParteActivoFijoJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=EstadoActivoFijoJInternalFrame.STIPO_TAMANIO_GENERAL;

				this.parteactivofijoSessionBean.setEsGuardarRelacionado(true);

				this.parteactivofijoBeanSwingJInternalFrame=new ParteActivoFijoBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.SECUNDARIO,false,true,false,false);//false->4

				this.parteactivofijoBeanSwingJInternalFrame.setJInternalFrameParent(this);
				this.parteactivofijoBeanSwingJInternalFrame.setparteactivofijoSessionBean(this.parteactivofijoSessionBean);

				//this.gridBagConstraintsEstadoActivoFijo = new GridBagConstraints();
				//this.gridBagConstraintsEstadoActivoFijo.gridy = iGridyRelaciones++;
				//this.gridBagConstraintsEstadoActivoFijo.gridx = 0;
				//this.jContentPaneDetalleEstadoActivoFijo.add(this.parteactivofijoBeanSwingJInternalFrame.getContentPane(), this.gridBagConstraintsEstadoActivoFijo);

				if(!actualizarTab) {
					this.jTabbedPaneRelacionesEstadoActivoFijo.add("Parte Activo Fijos",this.parteactivofijoBeanSwingJInternalFrame.getContentPane());
				} else {
					this.jTabbedPaneRelacionesEstadoActivoFijo.setComponentAt(iIndexTab,this.parteactivofijoBeanSwingJInternalFrame.getContentPane());
				}

				//ParteActivoFijoJInternalFrame.ESTA_CARGADO_PORPARTE=true;
			} else {
				this.parteactivofijoSessionBean.setEsGuardarRelacionado(false);
				this.parteactivofijoBeanSwingJInternalFrame=null;//new ParteActivoFijoBeanSwingJInternalFrame(false,false,jDesktopPane,this.usuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,false);
			}
		} else {
			if(this.parteactivofijoSessionBean.getEsGuardarRelacionado()) {
				if(this.puedeCargarPorParteParteActivoFijo) {
					this.jTabbedPaneRelacionesEstadoActivoFijo.add("Parte Activo Fijos",new JPanel());
				}
			}
		}
	}
	
	
	
	
		public void cargarDetalleActivoFijoBeanSwingJInternalFrame(List<EstadoActivoFijo> estadoactivofijos,EstadoActivoFijo estadoactivofijo,DetalleActivoFijoBeanSwingJInternalFrame detalleactivofijoBeanSwingJInternalFrame,/*Boolean conInicializar,*/Boolean conGuardarRelaciones,Boolean esGuardarRelacionado) throws Exception 
		{
			try
			{
				if(true/*conInicializar*/) {
					//GETCONTENTPANE SOLO UN PAPA, SE PIERDE PANEL, POR LO QUE SE CREA NUEVO POR CADA PANTALLA
					//detalleactivofijoBeanSwingJInternalFrame=new DetalleActivoFijoBeanSwingJInternalFrame(false,false,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);

				}
					detalleactivofijoBeanSwingJInternalFrame.getDetalleActivoFijoLogic().setConnexion(this.estadoactivofijoLogic.getConnexion());

					detalleactivofijoBeanSwingJInternalFrame.setestadoactivofijosForeignKey(estadoactivofijos);
					detalleactivofijoBeanSwingJInternalFrame.setestadoactivofijoForeignKey(estadoactivofijo);
					detalleactivofijoBeanSwingJInternalFrame.detalleactivofijoSessionBean.setisBusquedaDesdeForeignKeySesionEstadoActivoFijo(true);
					detalleactivofijoBeanSwingJInternalFrame.detalleactivofijoSessionBean.setlidEstadoActivoFijoActual(estadoactivofijo.getId());
					//NO VOLVER A RECARGAR FK, TALVEZ INICIALIZAR FK DEPENDENTES
					//Hijos Independientes, No carga Fk al inicializar, Hay que setisBusquedaDesdeForeignKeySesion(true), luego cargar todos los Fks necesarios
					detalleactivofijoBeanSwingJInternalFrame.cargarCombosForeignKeyDetalleActivoFijo(detalleactivofijoBeanSwingJInternalFrame.isCargarCombosDependencia);
					detalleactivofijoBeanSwingJInternalFrame.setVisibilidadBusquedasParaEstadoActivoFijo(true);
					detalleactivofijoBeanSwingJInternalFrame.setid_estado_activo_fijoFK_IdEstadoActivoFijo(estadoactivofijo.getId());

					if(!this.conCargarFormDetalle) {
						detalleactivofijoBeanSwingJInternalFrame.inicializarFormDetalle();
					}

					detalleactivofijoBeanSwingJInternalFrame.setSelectedItemCombosFrameEstadoActivoFijoForeignKey(estadoactivofijo,1,false,true,true);
					detalleactivofijoBeanSwingJInternalFrame.setiNumeroPaginacion(Funciones2.getPaginacionDefecto("RELACIONADO"));
					detalleactivofijoBeanSwingJInternalFrame.procesarBusqueda("FK_IdEstadoActivoFijo");
					detalleactivofijoBeanSwingJInternalFrame.setsAccionBusqueda("FK_IdEstadoActivoFijo");
					detalleactivofijoBeanSwingJInternalFrame.inicializarActualizarBindingTablaDetalleActivoFijo(true);
					detalleactivofijoBeanSwingJInternalFrame.actualizarEstadoCeldasBotonesDetalleActivoFijo("n",detalleactivofijoBeanSwingJInternalFrame.isGuardarCambiosEnLote, detalleactivofijoBeanSwingJInternalFrame.isEsMantenimientoRelacionado);
					detalleactivofijoBeanSwingJInternalFrame.setAutoscrolls(true);
					detalleactivofijoBeanSwingJInternalFrame.setVisible(true);

					if(esGuardarRelacionado) {
						detalleactivofijoBeanSwingJInternalFrame.actualizarEstadoPanelsDetalleActivoFijo("relacionado");
					} else {
						detalleactivofijoBeanSwingJInternalFrame.actualizarEstadoPanelsDetalleActivoFijo("no_relacionado");
					}

					detalleactivofijoBeanSwingJInternalFrame.getjButtonRecargarInformacionDetalleActivoFijo().setVisible(false);

			}
			catch(Exception e)
			{
				throw e;
			}
		}

		public void cargarParteActivoFijoBeanSwingJInternalFrame(List<EstadoActivoFijo> estadoactivofijos,EstadoActivoFijo estadoactivofijo,ParteActivoFijoBeanSwingJInternalFrame parteactivofijoBeanSwingJInternalFrame,/*Boolean conInicializar,*/Boolean conGuardarRelaciones,Boolean esGuardarRelacionado) throws Exception 
		{
			try
			{
				if(true/*conInicializar*/) {
					//GETCONTENTPANE SOLO UN PAPA, SE PIERDE PANEL, POR LO QUE SE CREA NUEVO POR CADA PANTALLA
					//parteactivofijoBeanSwingJInternalFrame=new ParteActivoFijoBeanSwingJInternalFrame(false,false,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);

				}
					parteactivofijoBeanSwingJInternalFrame.getParteActivoFijoLogic().setConnexion(this.estadoactivofijoLogic.getConnexion());

					parteactivofijoBeanSwingJInternalFrame.setestadoactivofijosForeignKey(estadoactivofijos);
					parteactivofijoBeanSwingJInternalFrame.setestadoactivofijoForeignKey(estadoactivofijo);
					parteactivofijoBeanSwingJInternalFrame.parteactivofijoSessionBean.setisBusquedaDesdeForeignKeySesionEstadoActivoFijo(true);
					parteactivofijoBeanSwingJInternalFrame.parteactivofijoSessionBean.setlidEstadoActivoFijoActual(estadoactivofijo.getId());
					//NO VOLVER A RECARGAR FK, TALVEZ INICIALIZAR FK DEPENDENTES
					//Hijos Independientes, No carga Fk al inicializar, Hay que setisBusquedaDesdeForeignKeySesion(true), luego cargar todos los Fks necesarios
					parteactivofijoBeanSwingJInternalFrame.cargarCombosForeignKeyParteActivoFijo(parteactivofijoBeanSwingJInternalFrame.isCargarCombosDependencia);
					parteactivofijoBeanSwingJInternalFrame.setVisibilidadBusquedasParaEstadoActivoFijo(true);
					parteactivofijoBeanSwingJInternalFrame.setid_estado_activo_fijoFK_IdEstadoActivoFijo(estadoactivofijo.getId());

					if(!this.conCargarFormDetalle) {
						parteactivofijoBeanSwingJInternalFrame.inicializarFormDetalle();
					}

					parteactivofijoBeanSwingJInternalFrame.setSelectedItemCombosFrameEstadoActivoFijoForeignKey(estadoactivofijo,1,false,true,true);
					parteactivofijoBeanSwingJInternalFrame.setiNumeroPaginacion(Funciones2.getPaginacionDefecto("RELACIONADO"));
					parteactivofijoBeanSwingJInternalFrame.procesarBusqueda("FK_IdEstadoActivoFijo");
					parteactivofijoBeanSwingJInternalFrame.setsAccionBusqueda("FK_IdEstadoActivoFijo");
					parteactivofijoBeanSwingJInternalFrame.inicializarActualizarBindingTablaParteActivoFijo(true);
					parteactivofijoBeanSwingJInternalFrame.actualizarEstadoCeldasBotonesParteActivoFijo("n",parteactivofijoBeanSwingJInternalFrame.isGuardarCambiosEnLote, parteactivofijoBeanSwingJInternalFrame.isEsMantenimientoRelacionado);
					parteactivofijoBeanSwingJInternalFrame.setAutoscrolls(true);
					parteactivofijoBeanSwingJInternalFrame.setVisible(true);

					if(esGuardarRelacionado) {
						parteactivofijoBeanSwingJInternalFrame.actualizarEstadoPanelsParteActivoFijo("relacionado");
					} else {
						parteactivofijoBeanSwingJInternalFrame.actualizarEstadoPanelsParteActivoFijo("no_relacionado");
					}

					parteactivofijoBeanSwingJInternalFrame.getjButtonRecargarInformacionParteActivoFijo().setVisible(false);

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
