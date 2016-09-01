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


import com.bydan.erp.seguridad.presentation.swing.jinternalframes.*;
import com.bydan.erp.nomina.presentation.swing.jinternalframes.*;

import com.bydan.erp.contabilidad.presentation.web.jsf.sessionbean.*;//;
import com.bydan.erp.contabilidad.presentation.swing.jinternalframes.*;
import com.bydan.erp.contabilidad.presentation.swing.jinternalframes.auxiliar.*;


import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.nomina.presentation.web.jsf.sessionbean.*;

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
import com.bydan.erp.contabilidad.util.PresuTipoProyectoConstantesFunciones;

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
public class PresuTipoProyectoDetalleFormJInternalFrame extends PresuTipoProyectoBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	
	
	public JToolBar jTtoolBarDetallePresuTipoProyecto;
	
	protected JMenuBar jmenuBarDetallePresuTipoProyecto;
	
	protected JMenu jmenuDetallePresuTipoProyecto;
	protected JMenu jmenuDetalleArchivoPresuTipoProyecto;
	protected JMenu jmenuDetalleAccionesPresuTipoProyecto;
	protected JMenu jmenuDetalleDatosPresuTipoProyecto;
	
	
	
	protected JPanel jContentPane = null;
	protected JPanel jContentPaneDetallePresuTipoProyecto = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutPresuTipoProyecto;	
	protected GridBagConstraints gridBagConstraintsPresuTipoProyecto;	
		
	//protected JInternalFrameBase jInternalFrameParent; //ESTA EN BASE
	//protected PresuTipoProyectoBeanSwingJInternalFrameAdditional jInternalFrameDetallePresuTipoProyecto;		
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empresa="";
	
	public PresuTipoProyectoSessionBean presutipoproyectoSessionBean;
	
	
	
	
	public EmpresaSessionBean empresaSessionBean;	
	
	public PresuTipoProyectoLogic presutipoproyectoLogic;
	
	public JScrollPane jScrollPanelDatosPresuTipoProyecto;
	public JScrollPane jScrollPanelDatosEdicionPresuTipoProyecto;
	public JScrollPane jScrollPanelDatosGeneralPresuTipoProyecto;
	
	protected JPanel jPanelCamposPresuTipoProyecto;    
	protected JPanel jPanelCamposOcultosPresuTipoProyecto;    	
	protected JPanel jPanelAccionesPresuTipoProyecto;
	protected JPanel jPanelAccionesFormularioPresuTipoProyecto;
    
	
	
	protected Integer iXPanelCamposPresuTipoProyecto=0;
	protected Integer iYPanelCamposPresuTipoProyecto=0;
	
	protected Integer iXPanelCamposOcultosPresuTipoProyecto=0;
	protected Integer iYPanelCamposOcultosPresuTipoProyecto=0;
	
	;
	;
	
		
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	public JButton jButtonNuevoPresuTipoProyecto;
	public JButton jButtonModificarPresuTipoProyecto;
	public JButton jButtonActualizarPresuTipoProyecto;
    public JButton jButtonEliminarPresuTipoProyecto;
	public JButton jButtonCancelarPresuTipoProyecto;
    public JButton jButtonGuardarCambiosPresuTipoProyecto;
	public JButton jButtonGuardarCambiosTablaPresuTipoProyecto;
	protected JButton jButtonCerrarPresuTipoProyecto;
	
	
	protected JButton jButtonProcesarInformacionPresuTipoProyecto;
	
	
	protected JCheckBox jCheckBoxPostAccionNuevoPresuTipoProyecto;
	protected JCheckBox jCheckBoxPostAccionSinCerrarPresuTipoProyecto;
	protected JCheckBox jCheckBoxPostAccionSinMensajePresuTipoProyecto;
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarPresuTipoProyecto;
	protected JButton jButtonModificarToolBarPresuTipoProyecto;
	protected JButton jButtonActualizarToolBarPresuTipoProyecto;
    protected JButton jButtonEliminarToolBarPresuTipoProyecto;
	protected JButton jButtonCancelarToolBarPresuTipoProyecto;
    protected JButton jButtonGuardarCambiosToolBarPresuTipoProyecto;
	protected JButton jButtonGuardarCambiosTablaToolBarPresuTipoProyecto;
	protected JButton jButtonMostrarOcultarTablaToolBarPresuTipoProyecto;
	protected JButton jButtonCerrarToolBarPresuTipoProyecto;
	
	protected JButton jButtonProcesarInformacionToolBarPresuTipoProyecto;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoPresuTipoProyecto;
	protected JMenuItem jMenuItemModificarPresuTipoProyecto;
	protected JMenuItem jMenuItemActualizarPresuTipoProyecto;
    protected JMenuItem jMenuItemEliminarPresuTipoProyecto;
	protected JMenuItem jMenuItemCancelarPresuTipoProyecto;
    protected JMenuItem jMenuItemGuardarCambiosPresuTipoProyecto;
	protected JMenuItem jMenuItemGuardarCambiosTablaPresuTipoProyecto;
	protected JMenuItem jMenuItemCerrarPresuTipoProyecto;
	protected JMenuItem jMenuItemDetalleCerrarPresuTipoProyecto;
	protected JMenuItem jMenuItemDetalleMostarOcultarPresuTipoProyecto;
	
	protected JMenuItem jMenuItemProcesarInformacionPresuTipoProyecto;
	protected JMenuItem jMenuItemNuevoGuardarCambiosPresuTipoProyecto;
	protected JMenuItem jMenuItemMostrarOcultarPresuTipoProyecto;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesPresuTipoProyecto;	
		
	
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesPresuTipoProyecto;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesPresuTipoProyecto;
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxTiposAccionesFormularioPresuTipoProyecto;
	
		
	
	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	public JPanel jPanelidPresuTipoProyecto;
	public JLabel jLabelIdPresuTipoProyecto;
	public JLabel jLabelidPresuTipoProyecto;
	public JButton jButtonidPresuTipoProyectoBusqueda= new JButtonMe();

	public JPanel jPanelcodigoPresuTipoProyecto;
	public JLabel jLabelcodigoPresuTipoProyecto;
	public JTextField jTextFieldcodigoPresuTipoProyecto;
	public JButton jButtoncodigoPresuTipoProyectoBusqueda= new JButtonMe();

	public JPanel jPanelnombrePresuTipoProyecto;
	public JLabel jLabelnombrePresuTipoProyecto;
	public JTextArea jTextAreanombrePresuTipoProyecto;
	public JScrollPane jscrollPanenombrePresuTipoProyecto;
	public JButton jButtonnombrePresuTipoProyectoBusqueda= new JButtonMe();

	
	public JPanel jPanelid_empresaPresuTipoProyecto;
	public JLabel jLabelid_empresaPresuTipoProyecto;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_empresaPresuTipoProyecto;
	public JButton jButtonid_empresaPresuTipoProyecto= new JButtonMe();
	public JButton jButtonid_empresaPresuTipoProyectoUpdate= new JButtonMe();
	public JButton jButtonid_empresaPresuTipoProyectoBusqueda= new JButtonMe();

	
	
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JTabbedPane jTabbedPaneRelacionesPresuTipoProyecto;
	
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
	
	public PresuTipoProyectoDetalleFormJInternalFrame(String sTipo) throws Exception {
		super(PaginaTipo.FORMULARIO);
       
		try {
			
	  		if(sTipo.equals("MINIMO")) {
				/*
				this.jPanelCamposPresuTipoProyecto=new JPanel();
				this.jPanelAccionesFormularioPresuTipoProyecto=new JPanel();
				this.jmenuBarDetallePresuTipoProyecto=new JMenuBar();
				this.jTtoolBarDetallePresuTipoProyecto=new JToolBar();
				*/
	  		}
	  		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public PresuTipoProyectoDetalleFormJInternalFrame(PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo); 
		
		//super("PresuTipoProyecto No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	//ES AUXILIAR PARA WINDOWS FORMS
	public PresuTipoProyectoDetalleFormJInternalFrame() throws Exception {
		super(PaginaTipo.FORMULARIO);
        //super("PresuTipoProyecto No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public PresuTipoProyectoDetalleFormJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("PresuTipoProyecto No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public PresuTipoProyectoDetalleFormJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("PresuTipoProyecto No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public PresuTipoProyectoDetalleFormJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("PresuTipoProyecto No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	public JButton getjButtonActualizarToolBarPresuTipoProyecto() {
		return this.jButtonActualizarToolBarPresuTipoProyecto;
	}
	
	public JButton getjButtonEliminarToolBarPresuTipoProyecto() {
		return this.jButtonEliminarToolBarPresuTipoProyecto;
	}
	
	public JButton getjButtonCancelarToolBarPresuTipoProyecto() {
		return this.jButtonCancelarToolBarPresuTipoProyecto;
	}		
	
	public JButton getjButtonProcesarInformacionPresuTipoProyecto() {
		return this.jButtonProcesarInformacionPresuTipoProyecto;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionPresuTipoProyecto)	{
		this.jButtonProcesarInformacionPresuTipoProyecto = jButtonProcesarInformacionPresuTipoProyecto;
	}
	
	
	

	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesPresuTipoProyecto() {
		return this.jComboBoxTiposAccionesPresuTipoProyecto;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesPresuTipoProyecto(
			JComboBox jComboBoxTiposRelacionesPresuTipoProyecto) {
		this.jComboBoxTiposRelacionesPresuTipoProyecto = jComboBoxTiposRelacionesPresuTipoProyecto;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesPresuTipoProyecto(
			JComboBox jComboBoxTiposAccionesPresuTipoProyecto) {
		this.jComboBoxTiposAccionesPresuTipoProyecto = jComboBoxTiposAccionesPresuTipoProyecto;
	}		
	
			
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesFormularioPresuTipoProyecto() {
		return this.jComboBoxTiposAccionesFormularioPresuTipoProyecto;
	}				
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesFormularioPresuTipoProyecto(
			JComboBox jComboBoxTiposAccionesFormularioPresuTipoProyecto) {
		this.jComboBoxTiposAccionesFormularioPresuTipoProyecto = jComboBoxTiposAccionesFormularioPresuTipoProyecto;
	}
	
	private void initialize(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		this.presutipoproyectoSessionBean=new PresuTipoProyectoSessionBean();
		
		this.presutipoproyectoSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.presutipoproyectoSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.presutipoproyectoSessionBean.getEsGuardarRelacionado();				
		
		this.conMostrarAccionesCampo=parametroGeneralUsuario.getcon_mostrar_acciones_campo_general() || opcionActual.getcon_mostrar_acciones_campo();
		
		
		if(!this.conCargarMinimo) {
		
		}
		
			
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		PresuTipoProyectoJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		PresuTipoProyectoJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		PresuTipoProyectoJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Tipo Proyecto MANTENIMIENTO"));
		
		
		if(iWidth > 650) {
			iWidth=650;
		}
		
		if(iHeight > 660) {
			iHeight=660;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
		
		if(!this.presutipoproyectoSessionBean.getEsGuardarRelacionado()) {
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
	
		PresuTipoProyectoJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarDetallePresuTipoProyecto= new JToolBar("MENU DATOS");		
		
		//TOOLBAR
		//PRINCIPAL				
				this.jButtonProcesarInformacionToolBarPresuTipoProyecto=new JButtonMe();
				this.jButtonModificarToolBarPresuTipoProyecto=new JButtonMe();							
		//PRINCIPAL
		
		//DETALLE
		this.jButtonActualizarToolBarPresuTipoProyecto=FuncionesSwing.getButtonToolBarGeneral(this.jButtonActualizarToolBarPresuTipoProyecto,this.jTtoolBarDetallePresuTipoProyecto,
							"actualizar","actualizar","Actualizar"+" "+PresuTipoProyectoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"),"Actualizar",false);
		
		
		
		
		this.jButtonEliminarToolBarPresuTipoProyecto=FuncionesSwing.getButtonToolBarGeneral(this.jButtonEliminarToolBarPresuTipoProyecto,this.jTtoolBarDetallePresuTipoProyecto,
							"eliminar","eliminar","Eliminar"+" "+PresuTipoProyectoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"),"Eliminar",false);
		
		
		
		
		this.jButtonCancelarToolBarPresuTipoProyecto=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCancelarToolBarPresuTipoProyecto,this.jTtoolBarDetallePresuTipoProyecto,
							"cancelar","cancelar","Cancelar"+" "+PresuTipoProyectoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"),"Cancelar",false);
		
		
		
		
		this.jButtonGuardarCambiosToolBarPresuTipoProyecto=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosToolBarPresuTipoProyecto,this.jTtoolBarDetallePresuTipoProyecto,
							"guardarcambios","guardarcambios","Guardar"+" "+PresuTipoProyectoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		
		FuncionesSwing.setBoldButtonToolBar(this.jButtonActualizarToolBarPresuTipoProyecto,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonEliminarToolBarPresuTipoProyecto,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonCancelarToolBarPresuTipoProyecto,STIPO_TAMANIO_GENERAL,false,false,this);
	}
	
	
	
	public void cargarMenus() {		
		
		this.jmenuBarDetallePresuTipoProyecto=new JMenuBarMe();
		
		//DETALLE
		this.jmenuDetallePresuTipoProyecto=new JMenuMe("Datos Relacionados");
		this.jmenuDetalleArchivoPresuTipoProyecto=new JMenuMe("Archivo");
		this.jmenuDetalleAccionesPresuTipoProyecto=new JMenuMe("Acciones");
		this.jmenuDetalleDatosPresuTipoProyecto=new JMenuMe("Datos");
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoPresuTipoProyecto= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoPresuTipoProyecto.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoPresuTipoProyecto,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoPresuTipoProyecto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemModificarPresuTipoProyecto= new JMenuItem("Editar" + FuncionesSwing.getKeyMensaje("MODIFICAR"));
		this.jMenuItemModificarPresuTipoProyecto.setActionCommand("Editar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemModificarPresuTipoProyecto,"modificar_button","Editar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemModificarPresuTipoProyecto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemActualizarPresuTipoProyecto= new JMenuItem("Actualizar" + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
		this.jMenuItemActualizarPresuTipoProyecto.setActionCommand("Actualizar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemActualizarPresuTipoProyecto,"actualizar_button","Actualizar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemActualizarPresuTipoProyecto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemEliminarPresuTipoProyecto= new JMenuItem("Eliminar" + FuncionesSwing.getKeyMensaje("ELIMINAR"));
		this.jMenuItemEliminarPresuTipoProyecto.setActionCommand("Eliminar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemEliminarPresuTipoProyecto,"eliminar_button","Eliminar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemEliminarPresuTipoProyecto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCancelarPresuTipoProyecto= new JMenuItem("Cancelar" + FuncionesSwing.getKeyMensaje("CANCELAR"));
		this.jMenuItemCancelarPresuTipoProyecto.setActionCommand("Cancelar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCancelarPresuTipoProyecto,"cancelar_button","Cancelar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCancelarPresuTipoProyecto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosPresuTipoProyecto= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosPresuTipoProyecto.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosPresuTipoProyecto,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosPresuTipoProyecto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarPresuTipoProyecto= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarPresuTipoProyecto.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarPresuTipoProyecto,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarPresuTipoProyecto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleCerrarPresuTipoProyecto= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemDetalleCerrarPresuTipoProyecto.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleCerrarPresuTipoProyecto,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleCerrarPresuTipoProyecto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarPresuTipoProyecto= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarPresuTipoProyecto.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarPresuTipoProyecto,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarPresuTipoProyecto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarPresuTipoProyecto= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarPresuTipoProyecto.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarPresuTipoProyecto,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarPresuTipoProyecto, STIPO_TAMANIO_GENERAL,false,true,this);			
		
		//DETALLE
		this.jmenuDetalleArchivoPresuTipoProyecto.add(this.jMenuItemDetalleCerrarPresuTipoProyecto);
		
		this.jmenuDetalleAccionesPresuTipoProyecto.add(this.jMenuItemActualizarPresuTipoProyecto);
		this.jmenuDetalleAccionesPresuTipoProyecto.add(this.jMenuItemEliminarPresuTipoProyecto);
		this.jmenuDetalleAccionesPresuTipoProyecto.add(this.jMenuItemCancelarPresuTipoProyecto);		
		
		//this.jmenuDetalleDatosPresuTipoProyecto.add(this.jMenuItemDetalleAbrirOrderByPresuTipoProyecto);				
		this.jmenuDetalleDatosPresuTipoProyecto.add(this.jMenuItemDetalleMostarOcultarPresuTipoProyecto);				
				
		//this.jmenuDetalleAccionesPresuTipoProyecto.add(this.jMenuItemGuardarCambiosPresuTipoProyecto);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES				
		
		//DETALLE
		FuncionesSwing.setBoldMenu(this.jmenuDetalleArchivoPresuTipoProyecto, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleAccionesPresuTipoProyecto, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleDatosPresuTipoProyecto, STIPO_TAMANIO_GENERAL,false,true,this);
			
		this.jmenuBarDetallePresuTipoProyecto.add(this.jmenuDetalleArchivoPresuTipoProyecto);		
		this.jmenuBarDetallePresuTipoProyecto.add(this.jmenuDetalleAccionesPresuTipoProyecto);		
		this.jmenuBarDetallePresuTipoProyecto.add(this.jmenuDetalleDatosPresuTipoProyecto);		
		
		//DETALLE_FIN
		
		
		//AGREGA MENU DETALLE A PANTALLA
		this.setJMenuBar(this.jmenuBarDetallePresuTipoProyecto);				
	}
	
	
	public void inicializarElementosCamposPresuTipoProyecto() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		jLabelIdPresuTipoProyecto = new JLabelMe();
		jLabelIdPresuTipoProyecto.setText(""+Constantes2.S_CODIGO_UNICO+"");
		jLabelIdPresuTipoProyecto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdPresuTipoProyecto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdPresuTipoProyecto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelIdPresuTipoProyecto,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jPanelidPresuTipoProyecto = new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelidPresuTipoProyecto.setToolTipText(PresuTipoProyectoConstantesFunciones.LABEL_ID);
		this.gridaBagLayoutPresuTipoProyecto= new GridBagLayout();

		this.jPanelidPresuTipoProyecto.setLayout(this.gridaBagLayoutPresuTipoProyecto);

		jLabelidPresuTipoProyecto = new JLabel();
		jLabelidPresuTipoProyecto.setText("Id");

		jLabelidPresuTipoProyecto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidPresuTipoProyecto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidPresuTipoProyecto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));



					
		this.jLabelcodigoPresuTipoProyecto = new JLabelMe();
		this.jLabelcodigoPresuTipoProyecto.setText(""+PresuTipoProyectoConstantesFunciones.LABEL_CODIGO+" : *");
		this.jLabelcodigoPresuTipoProyecto.setToolTipText("Codigo");
		this.jLabelcodigoPresuTipoProyecto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcodigoPresuTipoProyecto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcodigoPresuTipoProyecto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelcodigoPresuTipoProyecto,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelcodigoPresuTipoProyecto=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelcodigoPresuTipoProyecto.setToolTipText(PresuTipoProyectoConstantesFunciones.LABEL_CODIGO);
		this.gridaBagLayoutPresuTipoProyecto = new GridBagLayout();
		this.jPanelcodigoPresuTipoProyecto.setLayout(this.gridaBagLayoutPresuTipoProyecto);


		jTextFieldcodigoPresuTipoProyecto= new JTextFieldMe();

		jTextFieldcodigoPresuTipoProyecto.setEnabled(false);
		jTextFieldcodigoPresuTipoProyecto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcodigoPresuTipoProyecto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcodigoPresuTipoProyecto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldcodigoPresuTipoProyecto,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtoncodigoPresuTipoProyectoBusqueda= new JButtonMe();
		this.jButtoncodigoPresuTipoProyectoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncodigoPresuTipoProyectoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncodigoPresuTipoProyectoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtoncodigoPresuTipoProyectoBusqueda.setText("U");
		this.jButtoncodigoPresuTipoProyectoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtoncodigoPresuTipoProyectoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtoncodigoPresuTipoProyectoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldcodigoPresuTipoProyecto.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldcodigoPresuTipoProyecto.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"codigoPresuTipoProyectoBusqueda"));

		if(this.presutipoproyectoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtoncodigoPresuTipoProyectoBusqueda.setVisible(false);		}


					
		this.jLabelnombrePresuTipoProyecto = new JLabelMe();
		this.jLabelnombrePresuTipoProyecto.setText(""+PresuTipoProyectoConstantesFunciones.LABEL_NOMBRE+" : *");
		this.jLabelnombrePresuTipoProyecto.setToolTipText("Nombre");
		this.jLabelnombrePresuTipoProyecto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnombrePresuTipoProyecto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnombrePresuTipoProyecto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelnombrePresuTipoProyecto,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelnombrePresuTipoProyecto=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelnombrePresuTipoProyecto.setToolTipText(PresuTipoProyectoConstantesFunciones.LABEL_NOMBRE);
		this.gridaBagLayoutPresuTipoProyecto = new GridBagLayout();
		this.jPanelnombrePresuTipoProyecto.setLayout(this.gridaBagLayoutPresuTipoProyecto);


		jTextAreanombrePresuTipoProyecto= new JTextAreaMe();
		jTextAreanombrePresuTipoProyecto.setEnabled(false);
		jTextAreanombrePresuTipoProyecto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombrePresuTipoProyecto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombrePresuTipoProyecto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombrePresuTipoProyecto.setLineWrap(true);
		jTextAreanombrePresuTipoProyecto.setWrapStyleWord(true);
		jTextAreanombrePresuTipoProyecto.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreanombrePresuTipoProyecto.setRows(4);

		FuncionesSwing.setBoldTextArea(jTextAreanombrePresuTipoProyecto,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPanenombrePresuTipoProyecto = new JScrollPane(jTextAreanombrePresuTipoProyecto);
		jscrollPanenombrePresuTipoProyecto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanenombrePresuTipoProyecto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanenombrePresuTipoProyecto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));

		this.jButtonnombrePresuTipoProyectoBusqueda= new JButtonMe();
		this.jButtonnombrePresuTipoProyectoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombrePresuTipoProyectoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombrePresuTipoProyectoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonnombrePresuTipoProyectoBusqueda.setText("U");
		this.jButtonnombrePresuTipoProyectoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonnombrePresuTipoProyectoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonnombrePresuTipoProyectoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreanombrePresuTipoProyecto.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreanombrePresuTipoProyecto.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"nombrePresuTipoProyectoBusqueda"));

		if(this.presutipoproyectoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonnombrePresuTipoProyectoBusqueda.setVisible(false);		}


	}
	
	public void inicializarElementosCamposForeigKeysPresuTipoProyecto() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		this.jLabelid_empresaPresuTipoProyecto = new JLabelMe();
		this.jLabelid_empresaPresuTipoProyecto.setText(""+PresuTipoProyectoConstantesFunciones.LABEL_IDEMPRESA+" : *");
		this.jLabelid_empresaPresuTipoProyecto.setToolTipText("Empresa");
		this.jLabelid_empresaPresuTipoProyecto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaPresuTipoProyecto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaPresuTipoProyecto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_empresaPresuTipoProyecto,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_empresaPresuTipoProyecto=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_empresaPresuTipoProyecto.setToolTipText(PresuTipoProyectoConstantesFunciones.LABEL_IDEMPRESA);
		this.gridaBagLayoutPresuTipoProyecto = new GridBagLayout();
		this.jPanelid_empresaPresuTipoProyecto.setLayout(this.gridaBagLayoutPresuTipoProyecto);


		jComboBoxid_empresaPresuTipoProyecto= new JComboBoxMe();
		jComboBoxid_empresaPresuTipoProyecto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaPresuTipoProyecto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaPresuTipoProyecto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_empresaPresuTipoProyecto,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_empresaPresuTipoProyecto.setEnabled(false);

		this.jButtonid_empresaPresuTipoProyecto= new JButtonMe();
		this.jButtonid_empresaPresuTipoProyecto.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaPresuTipoProyecto.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaPresuTipoProyecto.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaPresuTipoProyecto.setText("Buscar");
		this.jButtonid_empresaPresuTipoProyecto.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_empresaPresuTipoProyecto.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaPresuTipoProyecto,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_empresaPresuTipoProyecto.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaPresuTipoProyecto.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaPresuTipoProyecto"));

		this.jButtonid_empresaPresuTipoProyectoBusqueda= new JButtonMe();
		this.jButtonid_empresaPresuTipoProyectoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaPresuTipoProyectoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaPresuTipoProyectoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaPresuTipoProyectoBusqueda.setText("U");
		this.jButtonid_empresaPresuTipoProyectoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_empresaPresuTipoProyectoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaPresuTipoProyectoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_empresaPresuTipoProyecto.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaPresuTipoProyecto.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaPresuTipoProyectoBusqueda"));

		if(this.presutipoproyectoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_empresaPresuTipoProyectoBusqueda.setVisible(false);		}

		this.jButtonid_empresaPresuTipoProyectoUpdate= new JButtonMe();
		this.jButtonid_empresaPresuTipoProyectoUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaPresuTipoProyectoUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaPresuTipoProyectoUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaPresuTipoProyectoUpdate.setText("U");
		this.jButtonid_empresaPresuTipoProyectoUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_empresaPresuTipoProyectoUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaPresuTipoProyectoUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_empresaPresuTipoProyecto.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaPresuTipoProyecto.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaPresuTipoProyectoUpdate"));



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
		//this.jInternalFrameDetallePresuTipoProyecto = new PresuTipoProyectoBeanSwingJInternalFrameAdditional(paginaTipo);//JInternalFrameBase("Tipo Proyecto DATOS");
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutPresuTipoProyecto= new GridBagLayout();
		

		
		String sToolTipPresuTipoProyecto="";
		sToolTipPresuTipoProyecto=PresuTipoProyectoConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipPresuTipoProyecto+="(Contabilidad.PresuTipoProyecto)";
		}
		
		if(!this.presutipoproyectoSessionBean.getEsGuardarRelacionado()) {
			sToolTipPresuTipoProyecto+="_"+this.opcionActual.getId();
		}
								
		
		this.jButtonNuevoPresuTipoProyecto = new JButtonMe();
		this.jButtonModificarPresuTipoProyecto = new JButtonMe();
        this.jButtonActualizarPresuTipoProyecto = new JButtonMe();
        this.jButtonEliminarPresuTipoProyecto = new JButtonMe();
        this.jButtonCancelarPresuTipoProyecto = new JButtonMe();
        this.jButtonGuardarCambiosPresuTipoProyecto = new JButtonMe();
		this.jButtonGuardarCambiosTablaPresuTipoProyecto = new JButtonMe();
		this.jButtonCerrarPresuTipoProyecto = new JButtonMe();
		
		this.jScrollPanelDatosPresuTipoProyecto = new JScrollPane();   
        this.jScrollPanelDatosEdicionPresuTipoProyecto = new JScrollPane();
		this.jScrollPanelDatosGeneralPresuTipoProyecto = new JScrollPane();
				
		
		
		this.jPanelCamposPresuTipoProyecto = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelCamposOcultosPresuTipoProyecto = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
        this.jPanelAccionesPresuTipoProyecto = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		this.jPanelAccionesFormularioPresuTipoProyecto = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		this.sPath=" <---> Acceso: Tipo Proyecto";
		
		if(!this.presutipoproyectoSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosPresuTipoProyecto.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Tipo Proyectos" + this.sPath));
		} else {
			this.jScrollPanelDatosPresuTipoProyecto.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosEdicionPresuTipoProyecto.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		this.jScrollPanelDatosGeneralPresuTipoProyecto.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
			
        this.jPanelCamposPresuTipoProyecto.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
        this.jPanelCamposPresuTipoProyecto.setName("jPanelCamposPresuTipoProyecto"); 

		this.jPanelCamposOcultosPresuTipoProyecto.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos Ocultos"));
        this.jPanelCamposOcultosPresuTipoProyecto.setName("jPanelCamposOcultosPresuTipoProyecto"); 

        this.jPanelAccionesPresuTipoProyecto.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesPresuTipoProyecto.setToolTipText("Acciones");
        this.jPanelAccionesPresuTipoProyecto.setName("Acciones"); 

		this.jPanelAccionesFormularioPresuTipoProyecto.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones Extra/Post"));
        this.jPanelAccionesFormularioPresuTipoProyecto.setToolTipText("Acciones");
        this.jPanelAccionesFormularioPresuTipoProyecto.setName("Acciones"); 
		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosEdicionPresuTipoProyecto, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralPresuTipoProyecto, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosPresuTipoProyecto, STIPO_TAMANIO_GENERAL,false,false,this);		
		FuncionesSwing.setBoldPanel(this.jPanelCamposPresuTipoProyecto, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelCamposOcultosPresuTipoProyecto, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelAccionesFormularioPresuTipoProyecto, STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {
		
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		
        this.jButtonNuevoPresuTipoProyecto.setText("Nuevo");
		this.jButtonModificarPresuTipoProyecto.setText("Editar");
        this.jButtonActualizarPresuTipoProyecto.setText("Actualizar");
        this.jButtonEliminarPresuTipoProyecto.setText("Eliminar");
        this.jButtonCancelarPresuTipoProyecto.setText("Cancelar");
        this.jButtonGuardarCambiosPresuTipoProyecto.setText("Guardar");
		this.jButtonGuardarCambiosTablaPresuTipoProyecto.setText("Guardar");
		this.jButtonCerrarPresuTipoProyecto.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoPresuTipoProyecto,"nuevo_button","Nuevo",this.presutipoproyectoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonModificarPresuTipoProyecto,"modificar_button","Editar",this.presutipoproyectoSessionBean.getEsGuardarRelacionado());
       	FuncionesSwing.addImagenButtonGeneral(this.jButtonActualizarPresuTipoProyecto,"actualizar_button","Actualizar",this.presutipoproyectoSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonEliminarPresuTipoProyecto,"eliminar_button","Eliminar",this.presutipoproyectoSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonCancelarPresuTipoProyecto,"cancelar_button","Cancelar",this.presutipoproyectoSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosPresuTipoProyecto,"guardarcambios_button","Guardar",this.presutipoproyectoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaPresuTipoProyecto,"guardarcambiostabla_button","Guardar",this.presutipoproyectoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarPresuTipoProyecto,"cerrar_button","Salir",this.presutipoproyectoSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoPresuTipoProyecto, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonModificarPresuTipoProyecto, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosPresuTipoProyecto, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaPresuTipoProyecto, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarPresuTipoProyecto, STIPO_TAMANIO_GENERAL,false,true,this);
		
		FuncionesSwing.setBoldButton(this.jButtonActualizarPresuTipoProyecto, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonEliminarPresuTipoProyecto, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonCancelarPresuTipoProyecto, STIPO_TAMANIO_GENERAL,false,false,this);
		
		this.jButtonNuevoPresuTipoProyecto.setToolTipText("Nuevo"+" "+PresuTipoProyectoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonModificarPresuTipoProyecto.setToolTipText("Editar"+" "+PresuTipoProyectoConstantesFunciones.SCLASSWEBTITULO+"");// + FuncionesSwing.getKeyMensaje("MODIFICAR"))
        this.jButtonActualizarPresuTipoProyecto.setToolTipText("Actualizar"+" "+PresuTipoProyectoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
        this.jButtonEliminarPresuTipoProyecto.setToolTipText("Eliminar)"+" "+PresuTipoProyectoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"));
        this.jButtonCancelarPresuTipoProyecto.setToolTipText("Cancelar"+" "+PresuTipoProyectoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"));
        this.jButtonGuardarCambiosPresuTipoProyecto.setToolTipText("Guardar"+" "+PresuTipoProyectoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonGuardarCambiosTablaPresuTipoProyecto.setToolTipText("Guardar"+" "+PresuTipoProyectoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarPresuTipoProyecto.setToolTipText("Salir"+" "+PresuTipoProyectoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoPresuTipoProyecto";
		inputMap = this.jButtonNuevoPresuTipoProyecto.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoPresuTipoProyecto.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoPresuTipoProyecto"));
		
		//ACTUALIZAR
		sMapKey = "ActualizarPresuTipoProyecto";
		inputMap = this.jButtonActualizarPresuTipoProyecto.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ACTUALIZAR") , FuncionesSwing.getMaskKey("ACTUALIZAR")), sMapKey);
		
		this.jButtonActualizarPresuTipoProyecto.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ActualizarPresuTipoProyecto"));
		
		//ELIMINAR
		sMapKey = "EliminarPresuTipoProyecto";
		inputMap = this.jButtonEliminarPresuTipoProyecto.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ELIMINAR") , FuncionesSwing.getMaskKey("ELIMINAR")), sMapKey);
		
		this.jButtonEliminarPresuTipoProyecto.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"EliminarPresuTipoProyecto"));
		
		//CANCELAR	
		sMapKey = "CancelarPresuTipoProyecto";
		inputMap = this.jButtonCancelarPresuTipoProyecto.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CANCELAR") , FuncionesSwing.getMaskKey("CANCELAR")), sMapKey);
		
		this.jButtonCancelarPresuTipoProyecto.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CancelarPresuTipoProyecto"));
		
		//CERRAR		
		sMapKey = "CerrarPresuTipoProyecto";
		inputMap = this.jButtonCerrarPresuTipoProyecto.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarPresuTipoProyecto.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarPresuTipoProyecto"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaPresuTipoProyecto";
		inputMap = this.jButtonGuardarCambiosTablaPresuTipoProyecto.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaPresuTipoProyecto.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaPresuTipoProyecto"));
		
		//HOT KEYS
		
		this.jCheckBoxPostAccionNuevoPresuTipoProyecto = new JCheckBoxMe();
		this.jCheckBoxPostAccionNuevoPresuTipoProyecto.setText("Nuevo");
		this.jCheckBoxPostAccionNuevoPresuTipoProyecto.setToolTipText("Nuevo PresuTipoProyecto");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionNuevoPresuTipoProyecto, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinCerrarPresuTipoProyecto = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinCerrarPresuTipoProyecto.setText("Sin Cerrar");
		this.jCheckBoxPostAccionSinCerrarPresuTipoProyecto.setToolTipText("Sin Cerrar Ventana PresuTipoProyecto");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinCerrarPresuTipoProyecto, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinMensajePresuTipoProyecto = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinMensajePresuTipoProyecto.setText("Sin Mensaje");
		this.jCheckBoxPostAccionSinMensajePresuTipoProyecto.setToolTipText("Sin Mensaje Confirmacion");				
				
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinMensajePresuTipoProyecto, STIPO_TAMANIO_GENERAL,false,false,this);       	
       
				
		
			
			
		this.jComboBoxTiposAccionesPresuTipoProyecto = new JComboBoxMe();
		//this.jComboBoxTiposAccionesPresuTipoProyecto.setText("Accion");
		this.jComboBoxTiposAccionesPresuTipoProyecto.setToolTipText("Tipos de Acciones");
							
		

		this.jComboBoxTiposAccionesFormularioPresuTipoProyecto = new JComboBoxMe();
		//this.jComboBoxTiposAccionesFormularioPresuTipoProyecto.setText("Accion");				
    	this.jComboBoxTiposAccionesFormularioPresuTipoProyecto.setToolTipText("Tipos de Acciones");
	
		this.jLabelAccionesPresuTipoProyecto = new JLabelMe();
		
		this.jLabelAccionesPresuTipoProyecto.setText("Acciones");		
		this.jLabelAccionesPresuTipoProyecto.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesPresuTipoProyecto.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesPresuTipoProyecto.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
        //HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		//HOT KEYS2
		
		//ELEMENTOS
		this.inicializarElementosCamposPresuTipoProyecto();
		
		//ELEMENTOS FK
		this.inicializarElementosCamposForeigKeysPresuTipoProyecto();
				
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		this.jTabbedPaneRelacionesPresuTipoProyecto=new JTabbedPane();
		this.jTabbedPaneRelacionesPresuTipoProyecto.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Relacionados"));
		
		//ESTA EN BEAN

		
		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneRelacionesPresuTipoProyecto,STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		int iPosXAccionPaginacion=0;
		
		
		
				
		
		this.jComboBoxTiposAccionesPresuTipoProyecto.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesPresuTipoProyecto.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesPresuTipoProyecto.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesPresuTipoProyecto, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		
		
		this.jComboBoxTiposAccionesFormularioPresuTipoProyecto.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioPresuTipoProyecto.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioPresuTipoProyecto.setPreferredSize(new Dimension(145,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesFormularioPresuTipoProyecto, STIPO_TAMANIO_GENERAL,false,false,this);				
		
		GridBagLayout gridaBagLayoutCamposPresuTipoProyecto = new GridBagLayout();
		GridBagLayout gridaBagLayoutCamposOcultosPresuTipoProyecto = new GridBagLayout();
		
		this.jPanelCamposPresuTipoProyecto.setLayout(gridaBagLayoutCamposPresuTipoProyecto);
		this.jPanelCamposOcultosPresuTipoProyecto.setLayout(gridaBagLayoutCamposOcultosPresuTipoProyecto);
		
		;
		;
		
		
		//SUBPANELES SIMPLES
		//SUBPANELES POR CAMPO
        
	this.gridBagConstraintsPresuTipoProyecto = new GridBagConstraints();
	this.gridBagConstraintsPresuTipoProyecto.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPresuTipoProyecto.gridy = 0;
	this.gridBagConstraintsPresuTipoProyecto.gridx = 0;
	this.gridBagConstraintsPresuTipoProyecto.ipadx = 0;
	this.gridBagConstraintsPresuTipoProyecto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelidPresuTipoProyecto.add(jLabelIdPresuTipoProyecto, this.gridBagConstraintsPresuTipoProyecto);



	this.gridBagConstraintsPresuTipoProyecto = new GridBagConstraints();
	this.gridBagConstraintsPresuTipoProyecto.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPresuTipoProyecto.gridy = 0;
	this.gridBagConstraintsPresuTipoProyecto.gridx = 1;
	this.gridBagConstraintsPresuTipoProyecto.ipadx = 0;
	this.gridBagConstraintsPresuTipoProyecto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelidPresuTipoProyecto.add(jLabelidPresuTipoProyecto, this.gridBagConstraintsPresuTipoProyecto);


	this.gridBagConstraintsPresuTipoProyecto = new GridBagConstraints();
	this.gridBagConstraintsPresuTipoProyecto.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPresuTipoProyecto.gridy = 0;
	this.gridBagConstraintsPresuTipoProyecto.gridx = 0;
	this.gridBagConstraintsPresuTipoProyecto.ipadx = 0;
	this.gridBagConstraintsPresuTipoProyecto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_empresaPresuTipoProyecto.add(jLabelid_empresaPresuTipoProyecto, this.gridBagConstraintsPresuTipoProyecto);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsPresuTipoProyecto = new GridBagConstraints();
		//this.gridBagConstraintsPresuTipoProyecto.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPresuTipoProyecto.gridy = 0;
		this.gridBagConstraintsPresuTipoProyecto.gridx = 2;
		this.gridBagConstraintsPresuTipoProyecto.ipadx = 0;
		this.gridBagConstraintsPresuTipoProyecto.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaPresuTipoProyecto.add(jButtonid_empresaPresuTipoProyectoBusqueda, this.gridBagConstraintsPresuTipoProyecto);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsPresuTipoProyecto = new GridBagConstraints();
		//this.gridBagConstraintsPresuTipoProyecto.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPresuTipoProyecto.gridy = 0;
		this.gridBagConstraintsPresuTipoProyecto.gridx = 3;
		this.gridBagConstraintsPresuTipoProyecto.ipadx = 0;
		this.gridBagConstraintsPresuTipoProyecto.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaPresuTipoProyecto.add(jButtonid_empresaPresuTipoProyectoUpdate, this.gridBagConstraintsPresuTipoProyecto);
	}

	this.gridBagConstraintsPresuTipoProyecto = new GridBagConstraints();
	this.gridBagConstraintsPresuTipoProyecto.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPresuTipoProyecto.gridy = 0;
	this.gridBagConstraintsPresuTipoProyecto.gridx = 1;
	this.gridBagConstraintsPresuTipoProyecto.ipadx = 0;
	this.gridBagConstraintsPresuTipoProyecto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_empresaPresuTipoProyecto.add(jComboBoxid_empresaPresuTipoProyecto, this.gridBagConstraintsPresuTipoProyecto);


	this.gridBagConstraintsPresuTipoProyecto = new GridBagConstraints();
	this.gridBagConstraintsPresuTipoProyecto.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPresuTipoProyecto.gridy = 0;
	this.gridBagConstraintsPresuTipoProyecto.gridx = 0;
	this.gridBagConstraintsPresuTipoProyecto.ipadx = 0;
	this.gridBagConstraintsPresuTipoProyecto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelcodigoPresuTipoProyecto.add(jLabelcodigoPresuTipoProyecto, this.gridBagConstraintsPresuTipoProyecto);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsPresuTipoProyecto = new GridBagConstraints();
		//this.gridBagConstraintsPresuTipoProyecto.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPresuTipoProyecto.gridy = 0;
		this.gridBagConstraintsPresuTipoProyecto.gridx = 2;
		this.gridBagConstraintsPresuTipoProyecto.ipadx = 0;
		this.gridBagConstraintsPresuTipoProyecto.insets = new Insets(0, 0, 0, 0);
		this.jPanelcodigoPresuTipoProyecto.add(jButtoncodigoPresuTipoProyectoBusqueda, this.gridBagConstraintsPresuTipoProyecto);
	}

	this.gridBagConstraintsPresuTipoProyecto = new GridBagConstraints();
	this.gridBagConstraintsPresuTipoProyecto.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPresuTipoProyecto.gridy = 0;
	this.gridBagConstraintsPresuTipoProyecto.gridx = 1;
	this.gridBagConstraintsPresuTipoProyecto.ipadx = 0;
	this.gridBagConstraintsPresuTipoProyecto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelcodigoPresuTipoProyecto.add(jTextFieldcodigoPresuTipoProyecto, this.gridBagConstraintsPresuTipoProyecto);


	this.gridBagConstraintsPresuTipoProyecto = new GridBagConstraints();
	this.gridBagConstraintsPresuTipoProyecto.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPresuTipoProyecto.gridy = 0;
	this.gridBagConstraintsPresuTipoProyecto.gridx = 0;
	this.gridBagConstraintsPresuTipoProyecto.ipadx = 0;
	this.gridBagConstraintsPresuTipoProyecto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelnombrePresuTipoProyecto.add(jLabelnombrePresuTipoProyecto, this.gridBagConstraintsPresuTipoProyecto);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsPresuTipoProyecto = new GridBagConstraints();
		//this.gridBagConstraintsPresuTipoProyecto.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPresuTipoProyecto.gridy = 0;
		this.gridBagConstraintsPresuTipoProyecto.gridx = 2;
		this.gridBagConstraintsPresuTipoProyecto.ipadx = 0;
		this.gridBagConstraintsPresuTipoProyecto.insets = new Insets(0, 0, 0, 0);
		this.jPanelnombrePresuTipoProyecto.add(jButtonnombrePresuTipoProyectoBusqueda, this.gridBagConstraintsPresuTipoProyecto);
	}

	this.gridBagConstraintsPresuTipoProyecto = new GridBagConstraints();
	this.gridBagConstraintsPresuTipoProyecto.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPresuTipoProyecto.gridy = 0;
	this.gridBagConstraintsPresuTipoProyecto.gridx = 1;
	this.gridBagConstraintsPresuTipoProyecto.ipadx = 0;
	this.gridBagConstraintsPresuTipoProyecto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelnombrePresuTipoProyecto.add(jscrollPanenombrePresuTipoProyecto, this.gridBagConstraintsPresuTipoProyecto);


		//SUBPANELES SIMPLES
		
		//SUBPANELES EN PANEL
		//SUBPANELES EN PANEL CAMPOS NORMAL				
		
	this.gridBagConstraintsPresuTipoProyecto = new GridBagConstraints();
	this.gridBagConstraintsPresuTipoProyecto.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsPresuTipoProyecto.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsPresuTipoProyecto.gridy = iYPanelCamposPresuTipoProyecto;
	this.gridBagConstraintsPresuTipoProyecto.gridx = iXPanelCamposPresuTipoProyecto++;
	this.gridBagConstraintsPresuTipoProyecto.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsPresuTipoProyecto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposPresuTipoProyecto.add(this.jPanelidPresuTipoProyecto, this.gridBagConstraintsPresuTipoProyecto);



	if(iXPanelCamposPresuTipoProyecto % 1==0) {
		iXPanelCamposPresuTipoProyecto=0;
		iYPanelCamposPresuTipoProyecto++;
	}
	this.gridBagConstraintsPresuTipoProyecto = new GridBagConstraints();
	this.gridBagConstraintsPresuTipoProyecto.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsPresuTipoProyecto.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsPresuTipoProyecto.gridy = iYPanelCamposPresuTipoProyecto;
	this.gridBagConstraintsPresuTipoProyecto.gridx = iXPanelCamposPresuTipoProyecto++;
	this.gridBagConstraintsPresuTipoProyecto.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsPresuTipoProyecto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposPresuTipoProyecto.add(this.jPanelcodigoPresuTipoProyecto, this.gridBagConstraintsPresuTipoProyecto);



	if(iXPanelCamposPresuTipoProyecto % 1==0) {
		iXPanelCamposPresuTipoProyecto=0;
		iYPanelCamposPresuTipoProyecto++;
	}
	this.gridBagConstraintsPresuTipoProyecto = new GridBagConstraints();
	this.gridBagConstraintsPresuTipoProyecto.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsPresuTipoProyecto.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsPresuTipoProyecto.gridy = iYPanelCamposPresuTipoProyecto;
	this.gridBagConstraintsPresuTipoProyecto.gridx = iXPanelCamposPresuTipoProyecto++;
	this.gridBagConstraintsPresuTipoProyecto.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsPresuTipoProyecto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposPresuTipoProyecto.add(this.jPanelnombrePresuTipoProyecto, this.gridBagConstraintsPresuTipoProyecto);



	if(iXPanelCamposPresuTipoProyecto % 1==0) {
		iXPanelCamposPresuTipoProyecto=0;
		iYPanelCamposPresuTipoProyecto++;
	}
		
		//SUBPANELES EN PANEL CAMPOS OCULTOS				
		
	this.gridBagConstraintsPresuTipoProyecto = new GridBagConstraints();
	this.gridBagConstraintsPresuTipoProyecto.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsPresuTipoProyecto.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsPresuTipoProyecto.gridy = iYPanelCamposOcultosPresuTipoProyecto;
	this.gridBagConstraintsPresuTipoProyecto.gridx = iXPanelCamposOcultosPresuTipoProyecto++;
	this.gridBagConstraintsPresuTipoProyecto.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsPresuTipoProyecto.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosPresuTipoProyecto.add(this.jPanelid_empresaPresuTipoProyecto, this.gridBagConstraintsPresuTipoProyecto);



	if(iXPanelCamposOcultosPresuTipoProyecto % 1==0) {
		iXPanelCamposOcultosPresuTipoProyecto=0;
		iYPanelCamposOcultosPresuTipoProyecto++;
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
			
		GridBagLayout gridaBagLayoutAccionesPresuTipoProyecto= new GridBagLayout();
		this.jPanelAccionesPresuTipoProyecto.setLayout(gridaBagLayoutAccionesPresuTipoProyecto);
		
		GridBagLayout gridaBagLayoutAccionesFormularioPresuTipoProyecto= new GridBagLayout();
		this.jPanelAccionesFormularioPresuTipoProyecto.setLayout(gridaBagLayoutAccionesFormularioPresuTipoProyecto);
		
		this.gridBagConstraintsPresuTipoProyecto = new GridBagConstraints();
		this.gridBagConstraintsPresuTipoProyecto.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsPresuTipoProyecto.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioPresuTipoProyecto.add(this.jComboBoxTiposAccionesFormularioPresuTipoProyecto, this.gridBagConstraintsPresuTipoProyecto);

		this.gridBagConstraintsPresuTipoProyecto = new GridBagConstraints();
		this.gridBagConstraintsPresuTipoProyecto.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsPresuTipoProyecto.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioPresuTipoProyecto.add(this.jCheckBoxPostAccionNuevoPresuTipoProyecto, this.gridBagConstraintsPresuTipoProyecto);
			
		//DEBE CERRARSE Y ACTUALIZARSE TODO NUEVAMENTE, SI ES RELACIONADO PUEDE FUNCIONAR
		//if(!this.presutipoproyectoSessionBean.getEstaModoGuardarRelaciones()) {		
		//SE ARRIESGA
		//if(!this.conFuncionalidadRelaciones) {		
			this.gridBagConstraintsPresuTipoProyecto = new GridBagConstraints();
			this.gridBagConstraintsPresuTipoProyecto.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsPresuTipoProyecto.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioPresuTipoProyecto.add(this.jCheckBoxPostAccionSinCerrarPresuTipoProyecto, this.gridBagConstraintsPresuTipoProyecto);
		//}
		
		
		//NO TIENE MENSAJE POR DEFINICION, O ES MUY COMPLEJO LA PANTALLA PARA HACERLO MAS COMPLICADO
		if(!this.presutipoproyectoSessionBean.getEsGuardarRelacionado()
			){				
			//&& !this.presutipoproyectoSessionBean.getEstaModoGuardarRelaciones()) {
							
			this.gridBagConstraintsPresuTipoProyecto = new GridBagConstraints();
			this.gridBagConstraintsPresuTipoProyecto.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsPresuTipoProyecto.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioPresuTipoProyecto.add(this.jCheckBoxPostAccionSinMensajePresuTipoProyecto, this.gridBagConstraintsPresuTipoProyecto);
		}
		
		
		int iPosXAccion=0;
		
		this.gridBagConstraintsPresuTipoProyecto = new GridBagConstraints();
		this.gridBagConstraintsPresuTipoProyecto.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsPresuTipoProyecto.gridy = 0;
		this.gridBagConstraintsPresuTipoProyecto.gridx = iPosXAccion++;
			
		this.jPanelAccionesPresuTipoProyecto.add(this.jButtonModificarPresuTipoProyecto, this.gridBagConstraintsPresuTipoProyecto);							

		this.gridBagConstraintsPresuTipoProyecto = new GridBagConstraints();
		this.gridBagConstraintsPresuTipoProyecto.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsPresuTipoProyecto.gridy = 0;
		this.gridBagConstraintsPresuTipoProyecto.gridx =iPosXAccion++;
			
		this.jPanelAccionesPresuTipoProyecto.add(this.jButtonEliminarPresuTipoProyecto, this.gridBagConstraintsPresuTipoProyecto);
		
			
		this.gridBagConstraintsPresuTipoProyecto = new GridBagConstraints();
		this.gridBagConstraintsPresuTipoProyecto.gridy = 0;		
		this.gridBagConstraintsPresuTipoProyecto.gridx = iPosXAccion++;
		
		this.jPanelAccionesPresuTipoProyecto.add(this.jButtonActualizarPresuTipoProyecto, this.gridBagConstraintsPresuTipoProyecto);


		this.gridBagConstraintsPresuTipoProyecto = new GridBagConstraints();
		this.gridBagConstraintsPresuTipoProyecto.gridy = 0;		
		this.gridBagConstraintsPresuTipoProyecto.gridx = iPosXAccion++;
		
		this.jPanelAccionesPresuTipoProyecto.add(this.jButtonGuardarCambiosPresuTipoProyecto, this.gridBagConstraintsPresuTipoProyecto);	
		
		this.gridBagConstraintsPresuTipoProyecto = new GridBagConstraints();
		this.gridBagConstraintsPresuTipoProyecto.gridy = 0;		
		this.gridBagConstraintsPresuTipoProyecto.gridx =iPosXAccion++;
		
		this.jPanelAccionesPresuTipoProyecto.add(this.jButtonCancelarPresuTipoProyecto, this.gridBagConstraintsPresuTipoProyecto);
		
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutPresuTipoProyecto = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutPresuTipoProyecto);
		
		if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.presutipoproyectoSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsPresuTipoProyecto = new GridBagConstraints();						
			this.gridBagConstraintsPresuTipoProyecto.gridy = iGridyPrincipal++;
			this.gridBagConstraintsPresuTipoProyecto.gridx = 0;		
			//this.gridBagConstraintsPresuTipoProyecto.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsPresuTipoProyecto.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsPresuTipoProyecto.ipadx = 100;
				
			
		}
		
		//PROCESANDO EN OTRA PANTALLA
		
		
		int iGridxBusquedasParametros=0;
		
	
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			//NO BUSQUEDA
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		
		this.gridBagConstraintsPresuTipoProyecto = new GridBagConstraints();
		this.gridBagConstraintsPresuTipoProyecto.gridy =iGridyPrincipal++;
		this.gridBagConstraintsPresuTipoProyecto.gridx =0;
		this.gridBagConstraintsPresuTipoProyecto.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsPresuTipoProyecto.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosPresuTipoProyecto, this.gridBagConstraintsPresuTipoProyecto);
				
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);

		
			
		//if(PresuTipoProyectoJInternalFrame.CON_DATOS_FRAME) {				
			//this.jInternalFrameDetallePresuTipoProyecto = new PresuTipoProyectoBeanSwingJInternalFrameAdditional();//JInternalFrameBase("Tipo Proyecto DATOS");
			
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
			
	        //this.setTitle("[FOR] - Tipo Proyecto DATOS");
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Tipo Proyecto Formulario",PaginaTipo.FORMULARIO,paginaTipo));			
	        this.setSize(iWidthFormulario,iHeightFormulario);        
		   				
			this.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	        this.setResizable(true);
	        this.setClosable(true);
	        this.setMaximizable(true);
		    
			PresuTipoProyectoModel presutipoproyectoModel=new PresuTipoProyectoModel(this);
			
			//SI USARA CLASE INTERNA
			//PresuTipoProyectoModel.PresuTipoProyectoFocusTraversalPolicy presutipoproyectoFocusTraversalPolicy = presutipoproyectoModel.new PresuTipoProyectoFocusTraversalPolicy(this);
			
			//presutipoproyectoFocusTraversalPolicy.setpresutipoproyectoJInternalFrame(this);
			
			this.setFocusTraversalPolicy(presutipoproyectoModel);
			
			
			this.jContentPaneDetallePresuTipoProyecto = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			GridBagLayout gridaBagLayoutDetallePresuTipoProyecto = new GridBagLayout();	
			this.jContentPaneDetallePresuTipoProyecto.setLayout(gridaBagLayoutDetallePresuTipoProyecto);
			
			GridBagLayout gridaBagLayoutBusquedasParametrosPresuTipoProyecto = new GridBagLayout();
			
			
if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
				
				//AGREGA TOOLBAR DETALLE A PANTALLA
				
				this.gridBagConstraintsPresuTipoProyecto = new GridBagConstraints();
				this.gridBagConstraintsPresuTipoProyecto.gridy = iGridyRelaciones++;		
				this.gridBagConstraintsPresuTipoProyecto.gridx = 0;
					
				
				this.jContentPaneDetallePresuTipoProyecto.add(jTtoolBarDetallePresuTipoProyecto, gridBagConstraintsPresuTipoProyecto);								
				
}
			
			this.jScrollPanelDatosEdicionPresuTipoProyecto=   new JScrollPane(jContentPaneDetallePresuTipoProyecto,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionPresuTipoProyecto.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionPresuTipoProyecto.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionPresuTipoProyecto.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			this.jScrollPanelDatosGeneralPresuTipoProyecto=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralPresuTipoProyecto.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralPresuTipoProyecto.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralPresuTipoProyecto.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsPresuTipoProyecto = new GridBagConstraints();
			
			
	        this.gridBagConstraintsPresuTipoProyecto.gridy = iGridyRelaciones++;		
	        this.gridBagConstraintsPresuTipoProyecto.gridx = 0;
	        
			this.jContentPaneDetallePresuTipoProyecto.add(jPanelCamposPresuTipoProyecto, gridBagConstraintsPresuTipoProyecto);
			
			
			
			
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
						&& presutipoproyectoSessionBean.getConGuardarRelaciones()
						) {
					//paraCargarPorParte es false por defecto(y ejecuta funcion normal cargando detalle en tab panel), si se utiliza funcionalidad es true y carga tab panel auxiliar temporal
					
					
					if(this.presutipoproyectoSessionBean.getConGuardarRelaciones()) {
						this.gridBagConstraintsPresuTipoProyecto= new GridBagConstraints();
						this.gridBagConstraintsPresuTipoProyecto.gridy = iGridyRelaciones++;
						this.gridBagConstraintsPresuTipoProyecto.gridx = 0;
						this.jContentPaneDetallePresuTipoProyecto.add(this.jTabbedPaneRelacionesPresuTipoProyecto, this.gridBagConstraintsPresuTipoProyecto);
					}
					
					//RELACIONES OTROS AGRUPADOS
					;
					
					} else {
						//this.jButtonNuevoRelacionesPresuTipoProyecto.setVisible(false);
						
					}
				}
			}
			
			Boolean tieneColumnasOcultas=false;
			
			tieneColumnasOcultas=true;
		
						
			
			if(!Constantes.ISDEVELOPING) {
	       		this.jPanelCamposOcultosPresuTipoProyecto.setVisible(false);
			} else {
				if(tieneColumnasOcultas) {
					this.gridBagConstraintsPresuTipoProyecto = new GridBagConstraints();
					this.gridBagConstraintsPresuTipoProyecto.fill=GridBagConstraints.NONE;
					this.gridBagConstraintsPresuTipoProyecto.anchor = GridBagConstraints.WEST;
					
					this.gridBagConstraintsPresuTipoProyecto.gridy = iGridyRelaciones++;		
					this.gridBagConstraintsPresuTipoProyecto.gridx = 0;
					
				
					this.jContentPaneDetallePresuTipoProyecto.add(jPanelCamposOcultosPresuTipoProyecto, gridBagConstraintsPresuTipoProyecto);
				
					this.jPanelCamposOcultosPresuTipoProyecto.setVisible(true);
				}
			}					
			
			
			
			
			this.gridBagConstraintsPresuTipoProyecto = new GridBagConstraints();
			this.gridBagConstraintsPresuTipoProyecto.gridy = iGridyRelaciones++;//1;		
	        this.gridBagConstraintsPresuTipoProyecto.gridx = 0;
	        this.gridBagConstraintsPresuTipoProyecto.anchor = GridBagConstraints.CENTER;//WEST;
			
			
			
			this.jContentPaneDetallePresuTipoProyecto.add(this.jPanelAccionesFormularioPresuTipoProyecto, this.gridBagConstraintsPresuTipoProyecto);							
			
			
			
			this.gridBagConstraintsPresuTipoProyecto = new GridBagConstraints();
	        this.gridBagConstraintsPresuTipoProyecto.gridy = iGridyRelaciones;//1;		
	        this.gridBagConstraintsPresuTipoProyecto.gridx = 0;
	        
			
			this.jContentPaneDetallePresuTipoProyecto.add(this.jPanelAccionesPresuTipoProyecto, this.gridBagConstraintsPresuTipoProyecto);							
			
	        //this.setContentPane(jScrollPanelDatosEdicionPresuTipoProyecto);
			
		//} else {
			//DISENO_DETALLE COMENTAR Y
			//DISENO_DETALLE(Solo Descomentar Seccion Inferior)
			//NOTA-DISENO_DETALLE(Si cambia lo de abajo, cambiar lo comentado, Al final no es lo mismo)
			
			/*
			this.jScrollPanelDatosEdicionPresuTipoProyecto=   new JScrollPane(this.jPanelCamposPresuTipoProyecto,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionPresuTipoProyecto.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionPresuTipoProyecto.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionPresuTipoProyecto.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			
			this.gridBagConstraintsPresuTipoProyecto = new GridBagConstraints();
			this.gridBagConstraintsPresuTipoProyecto.gridy = iGridyPrincipal++;		
			this.gridBagConstraintsPresuTipoProyecto.gridx = 0;
			this.gridBagConstraintsPresuTipoProyecto.fill = GridBagConstraints.BOTH;
			this.gridBagConstraintsPresuTipoProyecto.ipady = this.getSize().height-yOffset*3;
			this.gridBagConstraintsPresuTipoProyecto.anchor = GridBagConstraints.WEST;
			
			this.jContentPane.add(this.jScrollPanelDatosEdicionPresuTipoProyecto, this.gridBagConstraintsPresuTipoProyecto);
			
			//ACCIONES FORMULARIO
			this.gridBagConstraintsPresuTipoProyecto = new GridBagConstraints();
			this.gridBagConstraintsPresuTipoProyecto.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsPresuTipoProyecto.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesFormularioPresuTipoProyecto, this.gridBagConstraintsPresuTipoProyecto);			
			
			this.gridBagConstraintsPresuTipoProyecto = new GridBagConstraints();
			this.gridBagConstraintsPresuTipoProyecto.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsPresuTipoProyecto.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesPresuTipoProyecto, this.gridBagConstraintsPresuTipoProyecto);									
			*/
		//}								
			
		//DISENO_DETALLE-(Descomentar)
		/*
		this.gridBagConstraintsPresuTipoProyecto = new GridBagConstraints();
		this.gridBagConstraintsPresuTipoProyecto.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsPresuTipoProyecto.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposPresuTipoProyecto, this.gridBagConstraintsPresuTipoProyecto);
			
			
		this.gridBagConstraintsPresuTipoProyecto = new GridBagConstraints();
		this.gridBagConstraintsPresuTipoProyecto.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsPresuTipoProyecto.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosPresuTipoProyecto, this.gridBagConstraintsPresuTipoProyecto);
		
			
		this.gridBagConstraintsPresuTipoProyecto = new GridBagConstraints();
		this.gridBagConstraintsPresuTipoProyecto.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsPresuTipoProyecto.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesPresuTipoProyecto, this.gridBagConstraintsPresuTipoProyecto);
		*/
		
			
     	//pack();
		
		
		//return this.jScrollPanelDatosGeneralPresuTipoProyecto;//jContentPane;
		
		return jScrollPanelDatosEdicionPresuTipoProyecto;
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
