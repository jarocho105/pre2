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
import com.bydan.erp.seguridad.util.ParametroGeneralSgConstantesFunciones;

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
public class ParametroGeneralSgDetalleFormJInternalFrame extends ParametroGeneralSgBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	
	
	public JToolBar jTtoolBarDetalleParametroGeneralSg;
	
	protected JMenuBar jmenuBarDetalleParametroGeneralSg;
	
	protected JMenu jmenuDetalleParametroGeneralSg;
	protected JMenu jmenuDetalleArchivoParametroGeneralSg;
	protected JMenu jmenuDetalleAccionesParametroGeneralSg;
	protected JMenu jmenuDetalleDatosParametroGeneralSg;
	
	
	
	protected JPanel jContentPane = null;
	protected JPanel jContentPaneDetalleParametroGeneralSg = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutParametroGeneralSg;	
	protected GridBagConstraints gridBagConstraintsParametroGeneralSg;	
		
	//protected JInternalFrameBase jInternalFrameParent; //ESTA EN BASE
	//protected ParametroGeneralSgBeanSwingJInternalFrameAdditional jInternalFrameDetalleParametroGeneralSg;		
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	
	
	public ParametroGeneralSgSessionBean parametrogeneralsgSessionBean;
	
	
	
		
	
	public ParametroGeneralSgLogic parametrogeneralsgLogic;
	
	public JScrollPane jScrollPanelDatosParametroGeneralSg;
	public JScrollPane jScrollPanelDatosEdicionParametroGeneralSg;
	public JScrollPane jScrollPanelDatosGeneralParametroGeneralSg;
	
	protected JPanel jPanelCamposParametroGeneralSg;    
	protected JPanel jPanelCamposOcultosParametroGeneralSg;    	
	protected JPanel jPanelAccionesParametroGeneralSg;
	protected JPanel jPanelAccionesFormularioParametroGeneralSg;
    
	
	
	protected Integer iXPanelCamposParametroGeneralSg=0;
	protected Integer iYPanelCamposParametroGeneralSg=0;
	
	protected Integer iXPanelCamposOcultosParametroGeneralSg=0;
	protected Integer iYPanelCamposOcultosParametroGeneralSg=0;
	
	;
	;
	
		
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	public JButton jButtonNuevoParametroGeneralSg;
	public JButton jButtonModificarParametroGeneralSg;
	public JButton jButtonActualizarParametroGeneralSg;
    public JButton jButtonEliminarParametroGeneralSg;
	public JButton jButtonCancelarParametroGeneralSg;
    public JButton jButtonGuardarCambiosParametroGeneralSg;
	public JButton jButtonGuardarCambiosTablaParametroGeneralSg;
	protected JButton jButtonCerrarParametroGeneralSg;
	
	
	protected JButton jButtonProcesarInformacionParametroGeneralSg;
	
	
	protected JCheckBox jCheckBoxPostAccionNuevoParametroGeneralSg;
	protected JCheckBox jCheckBoxPostAccionSinCerrarParametroGeneralSg;
	protected JCheckBox jCheckBoxPostAccionSinMensajeParametroGeneralSg;
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarParametroGeneralSg;
	protected JButton jButtonModificarToolBarParametroGeneralSg;
	protected JButton jButtonActualizarToolBarParametroGeneralSg;
    protected JButton jButtonEliminarToolBarParametroGeneralSg;
	protected JButton jButtonCancelarToolBarParametroGeneralSg;
    protected JButton jButtonGuardarCambiosToolBarParametroGeneralSg;
	protected JButton jButtonGuardarCambiosTablaToolBarParametroGeneralSg;
	protected JButton jButtonMostrarOcultarTablaToolBarParametroGeneralSg;
	protected JButton jButtonCerrarToolBarParametroGeneralSg;
	
	protected JButton jButtonProcesarInformacionToolBarParametroGeneralSg;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoParametroGeneralSg;
	protected JMenuItem jMenuItemModificarParametroGeneralSg;
	protected JMenuItem jMenuItemActualizarParametroGeneralSg;
    protected JMenuItem jMenuItemEliminarParametroGeneralSg;
	protected JMenuItem jMenuItemCancelarParametroGeneralSg;
    protected JMenuItem jMenuItemGuardarCambiosParametroGeneralSg;
	protected JMenuItem jMenuItemGuardarCambiosTablaParametroGeneralSg;
	protected JMenuItem jMenuItemCerrarParametroGeneralSg;
	protected JMenuItem jMenuItemDetalleCerrarParametroGeneralSg;
	protected JMenuItem jMenuItemDetalleMostarOcultarParametroGeneralSg;
	
	protected JMenuItem jMenuItemProcesarInformacionParametroGeneralSg;
	protected JMenuItem jMenuItemNuevoGuardarCambiosParametroGeneralSg;
	protected JMenuItem jMenuItemMostrarOcultarParametroGeneralSg;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesParametroGeneralSg;	
		
	
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesParametroGeneralSg;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesParametroGeneralSg;
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxTiposAccionesFormularioParametroGeneralSg;
	
		
	
	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	public JPanel jPanelidParametroGeneralSg;
	public JLabel jLabelIdParametroGeneralSg;
	public JLabel jLabelidParametroGeneralSg;
	public JButton jButtonidParametroGeneralSgBusqueda= new JButtonMe();

	public JPanel jPanelnombre_sistemaParametroGeneralSg;
	public JLabel jLabelnombre_sistemaParametroGeneralSg;
	public JTextArea jTextAreanombre_sistemaParametroGeneralSg;
	public JScrollPane jscrollPanenombre_sistemaParametroGeneralSg;
	public JButton jButtonnombre_sistemaParametroGeneralSgBusqueda= new JButtonMe();

	public JPanel jPanelnombre_simple_sistemaParametroGeneralSg;
	public JLabel jLabelnombre_simple_sistemaParametroGeneralSg;
	public JTextArea jTextAreanombre_simple_sistemaParametroGeneralSg;
	public JScrollPane jscrollPanenombre_simple_sistemaParametroGeneralSg;
	public JButton jButtonnombre_simple_sistemaParametroGeneralSgBusqueda= new JButtonMe();

	public JPanel jPanelnombre_empresaParametroGeneralSg;
	public JLabel jLabelnombre_empresaParametroGeneralSg;
	public JTextArea jTextAreanombre_empresaParametroGeneralSg;
	public JScrollPane jscrollPanenombre_empresaParametroGeneralSg;
	public JButton jButtonnombre_empresaParametroGeneralSgBusqueda= new JButtonMe();

	public JPanel jPanelversion_sistemaParametroGeneralSg;
	public JLabel jLabelversion_sistemaParametroGeneralSg;
	public JTextField jTextFieldversion_sistemaParametroGeneralSg;
	public JButton jButtonversion_sistemaParametroGeneralSgBusqueda= new JButtonMe();

	public JPanel jPanelsiglas_sistemaParametroGeneralSg;
	public JLabel jLabelsiglas_sistemaParametroGeneralSg;
	public JTextField jTextFieldsiglas_sistemaParametroGeneralSg;
	public JButton jButtonsiglas_sistemaParametroGeneralSgBusqueda= new JButtonMe();

	public JPanel jPanelmail_sistemaParametroGeneralSg;
	public JLabel jLabelmail_sistemaParametroGeneralSg;
	public JTextArea jTextAreamail_sistemaParametroGeneralSg;
	public JScrollPane jscrollPanemail_sistemaParametroGeneralSg;
	public JButton jButtonmail_sistemaParametroGeneralSgBusqueda= new JButtonMe();

	public JPanel jPaneltelefono_sistemaParametroGeneralSg;
	public JLabel jLabeltelefono_sistemaParametroGeneralSg;
	public JTextField jTextFieldtelefono_sistemaParametroGeneralSg;
	public JButton jButtontelefono_sistemaParametroGeneralSgBusqueda= new JButtonMe();

	public JPanel jPanelfax_sistemaParametroGeneralSg;
	public JLabel jLabelfax_sistemaParametroGeneralSg;
	public JTextField jTextFieldfax_sistemaParametroGeneralSg;
	public JButton jButtonfax_sistemaParametroGeneralSgBusqueda= new JButtonMe();

	public JPanel jPanelrepresentante_nombreParametroGeneralSg;
	public JLabel jLabelrepresentante_nombreParametroGeneralSg;
	public JTextArea jTextArearepresentante_nombreParametroGeneralSg;
	public JScrollPane jscrollPanerepresentante_nombreParametroGeneralSg;
	public JButton jButtonrepresentante_nombreParametroGeneralSgBusqueda= new JButtonMe();

	public JPanel jPanelcodigo_proceso_actualizacionParametroGeneralSg;
	public JLabel jLabelcodigo_proceso_actualizacionParametroGeneralSg;
	public JTextField jTextFieldcodigo_proceso_actualizacionParametroGeneralSg;
	public JButton jButtoncodigo_proceso_actualizacionParametroGeneralSgBusqueda= new JButtonMe();

	public JPanel jPanelesta_activoParametroGeneralSg;
	public JLabel jLabelesta_activoParametroGeneralSg;
	public JCheckBox jCheckBoxesta_activoParametroGeneralSg;
	public JButton jButtonesta_activoParametroGeneralSgBusqueda= new JButtonMe();

	
	
	
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JTabbedPane jTabbedPaneRelacionesParametroGeneralSg;
	
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
	public int iHeightFormulario=1430;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
				
	public int iHeightFormularioMaximo=0;
	public int iWidthFormularioMaximo=0;
	public int iWidthTableDefinicion=0;
	
	public double dStart = 0; 
	public double dEnd = 0; 
	public double dDif = 0; 
			
	public SistemaParameterReturnGeneral sistemaReturnGeneral;
	public List<Opcion> opcionsRelacionadas=new ArrayList<Opcion>();
	
	public ParametroGeneralSgDetalleFormJInternalFrame(String sTipo) throws Exception {
		super(PaginaTipo.FORMULARIO);
       
		try {
			
	  		if(sTipo.equals("MINIMO")) {
				/*
				this.jPanelCamposParametroGeneralSg=new JPanel();
				this.jPanelAccionesFormularioParametroGeneralSg=new JPanel();
				this.jmenuBarDetalleParametroGeneralSg=new JMenuBar();
				this.jTtoolBarDetalleParametroGeneralSg=new JToolBar();
				*/
	  		}
	  		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ParametroGeneralSgDetalleFormJInternalFrame(PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo); 
		
		//super("ParametroGeneralSg No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	//ES AUXILIAR PARA WINDOWS FORMS
	public ParametroGeneralSgDetalleFormJInternalFrame() throws Exception {
		super(PaginaTipo.FORMULARIO);
        //super("ParametroGeneralSg No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ParametroGeneralSgDetalleFormJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("ParametroGeneralSg No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ParametroGeneralSgDetalleFormJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("ParametroGeneralSg No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ParametroGeneralSgDetalleFormJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("ParametroGeneralSg No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	public JButton getjButtonActualizarToolBarParametroGeneralSg() {
		return this.jButtonActualizarToolBarParametroGeneralSg;
	}
	
	public JButton getjButtonEliminarToolBarParametroGeneralSg() {
		return this.jButtonEliminarToolBarParametroGeneralSg;
	}
	
	public JButton getjButtonCancelarToolBarParametroGeneralSg() {
		return this.jButtonCancelarToolBarParametroGeneralSg;
	}		
	
	public JButton getjButtonProcesarInformacionParametroGeneralSg() {
		return this.jButtonProcesarInformacionParametroGeneralSg;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionParametroGeneralSg)	{
		this.jButtonProcesarInformacionParametroGeneralSg = jButtonProcesarInformacionParametroGeneralSg;
	}
	
	
	

	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesParametroGeneralSg() {
		return this.jComboBoxTiposAccionesParametroGeneralSg;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesParametroGeneralSg(
			JComboBox jComboBoxTiposRelacionesParametroGeneralSg) {
		this.jComboBoxTiposRelacionesParametroGeneralSg = jComboBoxTiposRelacionesParametroGeneralSg;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesParametroGeneralSg(
			JComboBox jComboBoxTiposAccionesParametroGeneralSg) {
		this.jComboBoxTiposAccionesParametroGeneralSg = jComboBoxTiposAccionesParametroGeneralSg;
	}		
	
			
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesFormularioParametroGeneralSg() {
		return this.jComboBoxTiposAccionesFormularioParametroGeneralSg;
	}				
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesFormularioParametroGeneralSg(
			JComboBox jComboBoxTiposAccionesFormularioParametroGeneralSg) {
		this.jComboBoxTiposAccionesFormularioParametroGeneralSg = jComboBoxTiposAccionesFormularioParametroGeneralSg;
	}
	
	private void initialize(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		this.parametrogeneralsgSessionBean=new ParametroGeneralSgSessionBean();
		
		this.parametrogeneralsgSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.parametrogeneralsgSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.parametrogeneralsgSessionBean.getEsGuardarRelacionado();				
		
		this.conMostrarAccionesCampo=parametroGeneralUsuario.getcon_mostrar_acciones_campo_general() || opcionActual.getcon_mostrar_acciones_campo();
		
		
		if(!this.conCargarMinimo) {
		
		}
		
			
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		ParametroGeneralSgJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		ParametroGeneralSgJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		ParametroGeneralSgJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Parametro General MANTENIMIENTO"));
		
		
		if(iWidth > 1350) {
			iWidth=1350;
		}
		
		if(iHeight > 650) {
			iHeight=650;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
		
		if(!this.parametrogeneralsgSessionBean.getEsGuardarRelacionado()) {
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
	
		ParametroGeneralSgJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarDetalleParametroGeneralSg= new JToolBar("MENU DATOS");		
		
		//TOOLBAR
		//PRINCIPAL				
				this.jButtonProcesarInformacionToolBarParametroGeneralSg=new JButtonMe();
				this.jButtonModificarToolBarParametroGeneralSg=new JButtonMe();							
		//PRINCIPAL
		
		//DETALLE
		this.jButtonActualizarToolBarParametroGeneralSg=FuncionesSwing.getButtonToolBarGeneral(this.jButtonActualizarToolBarParametroGeneralSg,this.jTtoolBarDetalleParametroGeneralSg,
							"actualizar","actualizar","Actualizar"+" "+ParametroGeneralSgConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"),"Actualizar",false);
		
		
		
		
		this.jButtonEliminarToolBarParametroGeneralSg=FuncionesSwing.getButtonToolBarGeneral(this.jButtonEliminarToolBarParametroGeneralSg,this.jTtoolBarDetalleParametroGeneralSg,
							"eliminar","eliminar","Eliminar"+" "+ParametroGeneralSgConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"),"Eliminar",false);
		
		
		
		
		this.jButtonCancelarToolBarParametroGeneralSg=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCancelarToolBarParametroGeneralSg,this.jTtoolBarDetalleParametroGeneralSg,
							"cancelar","cancelar","Cancelar"+" "+ParametroGeneralSgConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"),"Cancelar",false);
		
		
		
		
		this.jButtonGuardarCambiosToolBarParametroGeneralSg=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosToolBarParametroGeneralSg,this.jTtoolBarDetalleParametroGeneralSg,
							"guardarcambios","guardarcambios","Guardar"+" "+ParametroGeneralSgConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		
		FuncionesSwing.setBoldButtonToolBar(this.jButtonActualizarToolBarParametroGeneralSg,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonEliminarToolBarParametroGeneralSg,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonCancelarToolBarParametroGeneralSg,STIPO_TAMANIO_GENERAL,false,false,this);
	}
	
	
	
	public void cargarMenus() {		
		
		this.jmenuBarDetalleParametroGeneralSg=new JMenuBarMe();
		
		//DETALLE
		this.jmenuDetalleParametroGeneralSg=new JMenuMe("Datos Relacionados");
		this.jmenuDetalleArchivoParametroGeneralSg=new JMenuMe("Archivo");
		this.jmenuDetalleAccionesParametroGeneralSg=new JMenuMe("Acciones");
		this.jmenuDetalleDatosParametroGeneralSg=new JMenuMe("Datos");
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoParametroGeneralSg= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoParametroGeneralSg.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoParametroGeneralSg,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoParametroGeneralSg, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemModificarParametroGeneralSg= new JMenuItem("Editar" + FuncionesSwing.getKeyMensaje("MODIFICAR"));
		this.jMenuItemModificarParametroGeneralSg.setActionCommand("Editar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemModificarParametroGeneralSg,"modificar_button","Editar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemModificarParametroGeneralSg, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemActualizarParametroGeneralSg= new JMenuItem("Actualizar" + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
		this.jMenuItemActualizarParametroGeneralSg.setActionCommand("Actualizar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemActualizarParametroGeneralSg,"actualizar_button","Actualizar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemActualizarParametroGeneralSg, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemEliminarParametroGeneralSg= new JMenuItem("Eliminar" + FuncionesSwing.getKeyMensaje("ELIMINAR"));
		this.jMenuItemEliminarParametroGeneralSg.setActionCommand("Eliminar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemEliminarParametroGeneralSg,"eliminar_button","Eliminar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemEliminarParametroGeneralSg, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCancelarParametroGeneralSg= new JMenuItem("Cancelar" + FuncionesSwing.getKeyMensaje("CANCELAR"));
		this.jMenuItemCancelarParametroGeneralSg.setActionCommand("Cancelar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCancelarParametroGeneralSg,"cancelar_button","Cancelar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCancelarParametroGeneralSg, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosParametroGeneralSg= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosParametroGeneralSg.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosParametroGeneralSg,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosParametroGeneralSg, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarParametroGeneralSg= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarParametroGeneralSg.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarParametroGeneralSg,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarParametroGeneralSg, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleCerrarParametroGeneralSg= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemDetalleCerrarParametroGeneralSg.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleCerrarParametroGeneralSg,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleCerrarParametroGeneralSg, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarParametroGeneralSg= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarParametroGeneralSg.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarParametroGeneralSg,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarParametroGeneralSg, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarParametroGeneralSg= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarParametroGeneralSg.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarParametroGeneralSg,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarParametroGeneralSg, STIPO_TAMANIO_GENERAL,false,true,this);			
		
		//DETALLE
		this.jmenuDetalleArchivoParametroGeneralSg.add(this.jMenuItemDetalleCerrarParametroGeneralSg);
		
		this.jmenuDetalleAccionesParametroGeneralSg.add(this.jMenuItemActualizarParametroGeneralSg);
		this.jmenuDetalleAccionesParametroGeneralSg.add(this.jMenuItemEliminarParametroGeneralSg);
		this.jmenuDetalleAccionesParametroGeneralSg.add(this.jMenuItemCancelarParametroGeneralSg);		
		
		//this.jmenuDetalleDatosParametroGeneralSg.add(this.jMenuItemDetalleAbrirOrderByParametroGeneralSg);				
		this.jmenuDetalleDatosParametroGeneralSg.add(this.jMenuItemDetalleMostarOcultarParametroGeneralSg);				
				
		//this.jmenuDetalleAccionesParametroGeneralSg.add(this.jMenuItemGuardarCambiosParametroGeneralSg);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES				
		
		//DETALLE
		FuncionesSwing.setBoldMenu(this.jmenuDetalleArchivoParametroGeneralSg, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleAccionesParametroGeneralSg, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleDatosParametroGeneralSg, STIPO_TAMANIO_GENERAL,false,true,this);
			
		this.jmenuBarDetalleParametroGeneralSg.add(this.jmenuDetalleArchivoParametroGeneralSg);		
		this.jmenuBarDetalleParametroGeneralSg.add(this.jmenuDetalleAccionesParametroGeneralSg);		
		this.jmenuBarDetalleParametroGeneralSg.add(this.jmenuDetalleDatosParametroGeneralSg);		
		
		//DETALLE_FIN
		
		
		//AGREGA MENU DETALLE A PANTALLA
		this.setJMenuBar(this.jmenuBarDetalleParametroGeneralSg);				
	}
	
	
	public void inicializarElementosCamposParametroGeneralSg() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		jLabelIdParametroGeneralSg = new JLabelMe();
		jLabelIdParametroGeneralSg.setText(""+Constantes2.S_CODIGO_UNICO+"");
		jLabelIdParametroGeneralSg.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdParametroGeneralSg.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdParametroGeneralSg.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelIdParametroGeneralSg,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jPanelidParametroGeneralSg = new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelidParametroGeneralSg.setToolTipText(ParametroGeneralSgConstantesFunciones.LABEL_ID);
		this.gridaBagLayoutParametroGeneralSg= new GridBagLayout();

		this.jPanelidParametroGeneralSg.setLayout(this.gridaBagLayoutParametroGeneralSg);

		jLabelidParametroGeneralSg = new JLabel();
		jLabelidParametroGeneralSg.setText("Id");

		jLabelidParametroGeneralSg.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidParametroGeneralSg.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidParametroGeneralSg.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));



					
		this.jLabelnombre_sistemaParametroGeneralSg = new JLabelMe();
		this.jLabelnombre_sistemaParametroGeneralSg.setText(""+ParametroGeneralSgConstantesFunciones.LABEL_NOMBRESISTEMA+" : *");
		this.jLabelnombre_sistemaParametroGeneralSg.setToolTipText("Nombre Sistema");
		this.jLabelnombre_sistemaParametroGeneralSg.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnombre_sistemaParametroGeneralSg.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnombre_sistemaParametroGeneralSg.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelnombre_sistemaParametroGeneralSg,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelnombre_sistemaParametroGeneralSg=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelnombre_sistemaParametroGeneralSg.setToolTipText(ParametroGeneralSgConstantesFunciones.LABEL_NOMBRESISTEMA);
		this.gridaBagLayoutParametroGeneralSg = new GridBagLayout();
		this.jPanelnombre_sistemaParametroGeneralSg.setLayout(this.gridaBagLayoutParametroGeneralSg);


		jTextAreanombre_sistemaParametroGeneralSg= new JTextAreaMe();
		jTextAreanombre_sistemaParametroGeneralSg.setEnabled(false);
		jTextAreanombre_sistemaParametroGeneralSg.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombre_sistemaParametroGeneralSg.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombre_sistemaParametroGeneralSg.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombre_sistemaParametroGeneralSg.setLineWrap(true);
		jTextAreanombre_sistemaParametroGeneralSg.setWrapStyleWord(true);
		jTextAreanombre_sistemaParametroGeneralSg.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreanombre_sistemaParametroGeneralSg.setRows(5);

		FuncionesSwing.setBoldTextArea(jTextAreanombre_sistemaParametroGeneralSg,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPanenombre_sistemaParametroGeneralSg = new JScrollPane(jTextAreanombre_sistemaParametroGeneralSg);
		jscrollPanenombre_sistemaParametroGeneralSg.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanenombre_sistemaParametroGeneralSg.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanenombre_sistemaParametroGeneralSg.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));

		this.jButtonnombre_sistemaParametroGeneralSgBusqueda= new JButtonMe();
		this.jButtonnombre_sistemaParametroGeneralSgBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombre_sistemaParametroGeneralSgBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombre_sistemaParametroGeneralSgBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonnombre_sistemaParametroGeneralSgBusqueda.setText("U");
		this.jButtonnombre_sistemaParametroGeneralSgBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonnombre_sistemaParametroGeneralSgBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonnombre_sistemaParametroGeneralSgBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreanombre_sistemaParametroGeneralSg.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreanombre_sistemaParametroGeneralSg.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"nombre_sistemaParametroGeneralSgBusqueda"));

		if(this.parametrogeneralsgSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonnombre_sistemaParametroGeneralSgBusqueda.setVisible(false);		}


					
		this.jLabelnombre_simple_sistemaParametroGeneralSg = new JLabelMe();
		this.jLabelnombre_simple_sistemaParametroGeneralSg.setText(""+ParametroGeneralSgConstantesFunciones.LABEL_NOMBRESIMPLESISTEMA+" : *");
		this.jLabelnombre_simple_sistemaParametroGeneralSg.setToolTipText("Nombre Simple Sistema");
		this.jLabelnombre_simple_sistemaParametroGeneralSg.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));
		this.jLabelnombre_simple_sistemaParametroGeneralSg.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));
		this.jLabelnombre_simple_sistemaParametroGeneralSg.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));

		FuncionesSwing.setBoldLabel(jLabelnombre_simple_sistemaParametroGeneralSg,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelnombre_simple_sistemaParametroGeneralSg=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelnombre_simple_sistemaParametroGeneralSg.setToolTipText(ParametroGeneralSgConstantesFunciones.LABEL_NOMBRESIMPLESISTEMA);
		this.gridaBagLayoutParametroGeneralSg = new GridBagLayout();
		this.jPanelnombre_simple_sistemaParametroGeneralSg.setLayout(this.gridaBagLayoutParametroGeneralSg);


		jTextAreanombre_simple_sistemaParametroGeneralSg= new JTextAreaMe();
		jTextAreanombre_simple_sistemaParametroGeneralSg.setEnabled(false);
		jTextAreanombre_simple_sistemaParametroGeneralSg.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombre_simple_sistemaParametroGeneralSg.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombre_simple_sistemaParametroGeneralSg.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombre_simple_sistemaParametroGeneralSg.setLineWrap(true);
		jTextAreanombre_simple_sistemaParametroGeneralSg.setWrapStyleWord(true);
		jTextAreanombre_simple_sistemaParametroGeneralSg.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreanombre_simple_sistemaParametroGeneralSg.setRows(5);

		FuncionesSwing.setBoldTextArea(jTextAreanombre_simple_sistemaParametroGeneralSg,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPanenombre_simple_sistemaParametroGeneralSg = new JScrollPane(jTextAreanombre_simple_sistemaParametroGeneralSg);
		jscrollPanenombre_simple_sistemaParametroGeneralSg.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanenombre_simple_sistemaParametroGeneralSg.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanenombre_simple_sistemaParametroGeneralSg.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));

		this.jButtonnombre_simple_sistemaParametroGeneralSgBusqueda= new JButtonMe();
		this.jButtonnombre_simple_sistemaParametroGeneralSgBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombre_simple_sistemaParametroGeneralSgBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombre_simple_sistemaParametroGeneralSgBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonnombre_simple_sistemaParametroGeneralSgBusqueda.setText("U");
		this.jButtonnombre_simple_sistemaParametroGeneralSgBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonnombre_simple_sistemaParametroGeneralSgBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonnombre_simple_sistemaParametroGeneralSgBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreanombre_simple_sistemaParametroGeneralSg.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreanombre_simple_sistemaParametroGeneralSg.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"nombre_simple_sistemaParametroGeneralSgBusqueda"));

		if(this.parametrogeneralsgSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonnombre_simple_sistemaParametroGeneralSgBusqueda.setVisible(false);		}


					
		this.jLabelnombre_empresaParametroGeneralSg = new JLabelMe();
		this.jLabelnombre_empresaParametroGeneralSg.setText(""+ParametroGeneralSgConstantesFunciones.LABEL_NOMBREEMPRESA+" : *");
		this.jLabelnombre_empresaParametroGeneralSg.setToolTipText("Nombre Empresa");
		this.jLabelnombre_empresaParametroGeneralSg.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnombre_empresaParametroGeneralSg.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnombre_empresaParametroGeneralSg.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelnombre_empresaParametroGeneralSg,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelnombre_empresaParametroGeneralSg=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelnombre_empresaParametroGeneralSg.setToolTipText(ParametroGeneralSgConstantesFunciones.LABEL_NOMBREEMPRESA);
		this.gridaBagLayoutParametroGeneralSg = new GridBagLayout();
		this.jPanelnombre_empresaParametroGeneralSg.setLayout(this.gridaBagLayoutParametroGeneralSg);


		jTextAreanombre_empresaParametroGeneralSg= new JTextAreaMe();
		jTextAreanombre_empresaParametroGeneralSg.setEnabled(false);
		jTextAreanombre_empresaParametroGeneralSg.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombre_empresaParametroGeneralSg.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombre_empresaParametroGeneralSg.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombre_empresaParametroGeneralSg.setLineWrap(true);
		jTextAreanombre_empresaParametroGeneralSg.setWrapStyleWord(true);
		jTextAreanombre_empresaParametroGeneralSg.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreanombre_empresaParametroGeneralSg.setRows(5);

		FuncionesSwing.setBoldTextArea(jTextAreanombre_empresaParametroGeneralSg,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPanenombre_empresaParametroGeneralSg = new JScrollPane(jTextAreanombre_empresaParametroGeneralSg);
		jscrollPanenombre_empresaParametroGeneralSg.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanenombre_empresaParametroGeneralSg.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanenombre_empresaParametroGeneralSg.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));

		this.jButtonnombre_empresaParametroGeneralSgBusqueda= new JButtonMe();
		this.jButtonnombre_empresaParametroGeneralSgBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombre_empresaParametroGeneralSgBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombre_empresaParametroGeneralSgBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonnombre_empresaParametroGeneralSgBusqueda.setText("U");
		this.jButtonnombre_empresaParametroGeneralSgBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonnombre_empresaParametroGeneralSgBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonnombre_empresaParametroGeneralSgBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreanombre_empresaParametroGeneralSg.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreanombre_empresaParametroGeneralSg.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"nombre_empresaParametroGeneralSgBusqueda"));

		if(this.parametrogeneralsgSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonnombre_empresaParametroGeneralSgBusqueda.setVisible(false);		}


					
		this.jLabelversion_sistemaParametroGeneralSg = new JLabelMe();
		this.jLabelversion_sistemaParametroGeneralSg.setText(""+ParametroGeneralSgConstantesFunciones.LABEL_VERSIONSISTEMA+" : *");
		this.jLabelversion_sistemaParametroGeneralSg.setToolTipText("Version Sistema");
		this.jLabelversion_sistemaParametroGeneralSg.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelversion_sistemaParametroGeneralSg.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelversion_sistemaParametroGeneralSg.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabelversion_sistemaParametroGeneralSg,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelversion_sistemaParametroGeneralSg=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelversion_sistemaParametroGeneralSg.setToolTipText(ParametroGeneralSgConstantesFunciones.LABEL_VERSIONSISTEMA);
		this.gridaBagLayoutParametroGeneralSg = new GridBagLayout();
		this.jPanelversion_sistemaParametroGeneralSg.setLayout(this.gridaBagLayoutParametroGeneralSg);


		jTextFieldversion_sistemaParametroGeneralSg= new JTextFieldMe();
		jTextFieldversion_sistemaParametroGeneralSg.setEnabled(false);
		jTextFieldversion_sistemaParametroGeneralSg.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldversion_sistemaParametroGeneralSg.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldversion_sistemaParametroGeneralSg.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldversion_sistemaParametroGeneralSg,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldversion_sistemaParametroGeneralSg.setText("0.0");

		this.jButtonversion_sistemaParametroGeneralSgBusqueda= new JButtonMe();
		this.jButtonversion_sistemaParametroGeneralSgBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonversion_sistemaParametroGeneralSgBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonversion_sistemaParametroGeneralSgBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonversion_sistemaParametroGeneralSgBusqueda.setText("U");
		this.jButtonversion_sistemaParametroGeneralSgBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonversion_sistemaParametroGeneralSgBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonversion_sistemaParametroGeneralSgBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldversion_sistemaParametroGeneralSg.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldversion_sistemaParametroGeneralSg.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"version_sistemaParametroGeneralSgBusqueda"));

		if(this.parametrogeneralsgSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonversion_sistemaParametroGeneralSgBusqueda.setVisible(false);		}


					
		this.jLabelsiglas_sistemaParametroGeneralSg = new JLabelMe();
		this.jLabelsiglas_sistemaParametroGeneralSg.setText(""+ParametroGeneralSgConstantesFunciones.LABEL_SIGLASSISTEMA+" : *");
		this.jLabelsiglas_sistemaParametroGeneralSg.setToolTipText("Siglas Sistema");
		this.jLabelsiglas_sistemaParametroGeneralSg.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelsiglas_sistemaParametroGeneralSg.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelsiglas_sistemaParametroGeneralSg.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelsiglas_sistemaParametroGeneralSg,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelsiglas_sistemaParametroGeneralSg=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelsiglas_sistemaParametroGeneralSg.setToolTipText(ParametroGeneralSgConstantesFunciones.LABEL_SIGLASSISTEMA);
		this.gridaBagLayoutParametroGeneralSg = new GridBagLayout();
		this.jPanelsiglas_sistemaParametroGeneralSg.setLayout(this.gridaBagLayoutParametroGeneralSg);


		jTextFieldsiglas_sistemaParametroGeneralSg= new JTextFieldMe();

		jTextFieldsiglas_sistemaParametroGeneralSg.setEnabled(false);
		jTextFieldsiglas_sistemaParametroGeneralSg.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldsiglas_sistemaParametroGeneralSg.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldsiglas_sistemaParametroGeneralSg.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldsiglas_sistemaParametroGeneralSg,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonsiglas_sistemaParametroGeneralSgBusqueda= new JButtonMe();
		this.jButtonsiglas_sistemaParametroGeneralSgBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonsiglas_sistemaParametroGeneralSgBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonsiglas_sistemaParametroGeneralSgBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonsiglas_sistemaParametroGeneralSgBusqueda.setText("U");
		this.jButtonsiglas_sistemaParametroGeneralSgBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonsiglas_sistemaParametroGeneralSgBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonsiglas_sistemaParametroGeneralSgBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldsiglas_sistemaParametroGeneralSg.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldsiglas_sistemaParametroGeneralSg.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"siglas_sistemaParametroGeneralSgBusqueda"));

		if(this.parametrogeneralsgSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonsiglas_sistemaParametroGeneralSgBusqueda.setVisible(false);		}


					
		this.jLabelmail_sistemaParametroGeneralSg = new JLabelMe();
		this.jLabelmail_sistemaParametroGeneralSg.setText(""+ParametroGeneralSgConstantesFunciones.LABEL_MAILSISTEMA+" :");
		this.jLabelmail_sistemaParametroGeneralSg.setToolTipText("Mail Sistema");
		this.jLabelmail_sistemaParametroGeneralSg.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelmail_sistemaParametroGeneralSg.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelmail_sistemaParametroGeneralSg.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelmail_sistemaParametroGeneralSg,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelmail_sistemaParametroGeneralSg=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelmail_sistemaParametroGeneralSg.setToolTipText(ParametroGeneralSgConstantesFunciones.LABEL_MAILSISTEMA);
		this.gridaBagLayoutParametroGeneralSg = new GridBagLayout();
		this.jPanelmail_sistemaParametroGeneralSg.setLayout(this.gridaBagLayoutParametroGeneralSg);


		jTextAreamail_sistemaParametroGeneralSg= new JTextAreaMe();
		jTextAreamail_sistemaParametroGeneralSg.setEnabled(false);
		jTextAreamail_sistemaParametroGeneralSg.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreamail_sistemaParametroGeneralSg.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreamail_sistemaParametroGeneralSg.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreamail_sistemaParametroGeneralSg.setLineWrap(true);
		jTextAreamail_sistemaParametroGeneralSg.setWrapStyleWord(true);
		jTextAreamail_sistemaParametroGeneralSg.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreamail_sistemaParametroGeneralSg.setRows(4);

		FuncionesSwing.setBoldTextArea(jTextAreamail_sistemaParametroGeneralSg,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPanemail_sistemaParametroGeneralSg = new JScrollPane(jTextAreamail_sistemaParametroGeneralSg);
		jscrollPanemail_sistemaParametroGeneralSg.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanemail_sistemaParametroGeneralSg.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanemail_sistemaParametroGeneralSg.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));

		this.jButtonmail_sistemaParametroGeneralSgBusqueda= new JButtonMe();
		this.jButtonmail_sistemaParametroGeneralSgBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonmail_sistemaParametroGeneralSgBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonmail_sistemaParametroGeneralSgBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonmail_sistemaParametroGeneralSgBusqueda.setText("U");
		this.jButtonmail_sistemaParametroGeneralSgBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonmail_sistemaParametroGeneralSgBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonmail_sistemaParametroGeneralSgBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreamail_sistemaParametroGeneralSg.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreamail_sistemaParametroGeneralSg.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"mail_sistemaParametroGeneralSgBusqueda"));

		if(this.parametrogeneralsgSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonmail_sistemaParametroGeneralSgBusqueda.setVisible(false);		}


					
		this.jLabeltelefono_sistemaParametroGeneralSg = new JLabelMe();
		this.jLabeltelefono_sistemaParametroGeneralSg.setText(""+ParametroGeneralSgConstantesFunciones.LABEL_TELEFONOSISTEMA+" :");
		this.jLabeltelefono_sistemaParametroGeneralSg.setToolTipText("Telefono Sistema");
		this.jLabeltelefono_sistemaParametroGeneralSg.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabeltelefono_sistemaParametroGeneralSg.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabeltelefono_sistemaParametroGeneralSg.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabeltelefono_sistemaParametroGeneralSg,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPaneltelefono_sistemaParametroGeneralSg=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPaneltelefono_sistemaParametroGeneralSg.setToolTipText(ParametroGeneralSgConstantesFunciones.LABEL_TELEFONOSISTEMA);
		this.gridaBagLayoutParametroGeneralSg = new GridBagLayout();
		this.jPaneltelefono_sistemaParametroGeneralSg.setLayout(this.gridaBagLayoutParametroGeneralSg);


		jTextFieldtelefono_sistemaParametroGeneralSg= new JTextFieldMe();

		jTextFieldtelefono_sistemaParametroGeneralSg.setEnabled(false);
		jTextFieldtelefono_sistemaParametroGeneralSg.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldtelefono_sistemaParametroGeneralSg.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldtelefono_sistemaParametroGeneralSg.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldtelefono_sistemaParametroGeneralSg,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtontelefono_sistemaParametroGeneralSgBusqueda= new JButtonMe();
		this.jButtontelefono_sistemaParametroGeneralSgBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtontelefono_sistemaParametroGeneralSgBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtontelefono_sistemaParametroGeneralSgBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtontelefono_sistemaParametroGeneralSgBusqueda.setText("U");
		this.jButtontelefono_sistemaParametroGeneralSgBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtontelefono_sistemaParametroGeneralSgBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtontelefono_sistemaParametroGeneralSgBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldtelefono_sistemaParametroGeneralSg.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldtelefono_sistemaParametroGeneralSg.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"telefono_sistemaParametroGeneralSgBusqueda"));

		if(this.parametrogeneralsgSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtontelefono_sistemaParametroGeneralSgBusqueda.setVisible(false);		}


					
		this.jLabelfax_sistemaParametroGeneralSg = new JLabelMe();
		this.jLabelfax_sistemaParametroGeneralSg.setText(""+ParametroGeneralSgConstantesFunciones.LABEL_FAXSISTEMA+" :");
		this.jLabelfax_sistemaParametroGeneralSg.setToolTipText("Fax Sistema");
		this.jLabelfax_sistemaParametroGeneralSg.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelfax_sistemaParametroGeneralSg.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelfax_sistemaParametroGeneralSg.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelfax_sistemaParametroGeneralSg,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelfax_sistemaParametroGeneralSg=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelfax_sistemaParametroGeneralSg.setToolTipText(ParametroGeneralSgConstantesFunciones.LABEL_FAXSISTEMA);
		this.gridaBagLayoutParametroGeneralSg = new GridBagLayout();
		this.jPanelfax_sistemaParametroGeneralSg.setLayout(this.gridaBagLayoutParametroGeneralSg);


		jTextFieldfax_sistemaParametroGeneralSg= new JTextFieldMe();

		jTextFieldfax_sistemaParametroGeneralSg.setEnabled(false);
		jTextFieldfax_sistemaParametroGeneralSg.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldfax_sistemaParametroGeneralSg.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldfax_sistemaParametroGeneralSg.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldfax_sistemaParametroGeneralSg,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonfax_sistemaParametroGeneralSgBusqueda= new JButtonMe();
		this.jButtonfax_sistemaParametroGeneralSgBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfax_sistemaParametroGeneralSgBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfax_sistemaParametroGeneralSgBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonfax_sistemaParametroGeneralSgBusqueda.setText("U");
		this.jButtonfax_sistemaParametroGeneralSgBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonfax_sistemaParametroGeneralSgBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonfax_sistemaParametroGeneralSgBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldfax_sistemaParametroGeneralSg.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldfax_sistemaParametroGeneralSg.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"fax_sistemaParametroGeneralSgBusqueda"));

		if(this.parametrogeneralsgSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonfax_sistemaParametroGeneralSgBusqueda.setVisible(false);		}


					
		this.jLabelrepresentante_nombreParametroGeneralSg = new JLabelMe();
		this.jLabelrepresentante_nombreParametroGeneralSg.setText(""+ParametroGeneralSgConstantesFunciones.LABEL_REPRESENTANTENOMBRE+" :");
		this.jLabelrepresentante_nombreParametroGeneralSg.setToolTipText("Representante Nombre");
		this.jLabelrepresentante_nombreParametroGeneralSg.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));
		this.jLabelrepresentante_nombreParametroGeneralSg.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));
		this.jLabelrepresentante_nombreParametroGeneralSg.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));

		FuncionesSwing.setBoldLabel(jLabelrepresentante_nombreParametroGeneralSg,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelrepresentante_nombreParametroGeneralSg=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelrepresentante_nombreParametroGeneralSg.setToolTipText(ParametroGeneralSgConstantesFunciones.LABEL_REPRESENTANTENOMBRE);
		this.gridaBagLayoutParametroGeneralSg = new GridBagLayout();
		this.jPanelrepresentante_nombreParametroGeneralSg.setLayout(this.gridaBagLayoutParametroGeneralSg);


		jTextArearepresentante_nombreParametroGeneralSg= new JTextAreaMe();
		jTextArearepresentante_nombreParametroGeneralSg.setEnabled(false);
		jTextArearepresentante_nombreParametroGeneralSg.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextArearepresentante_nombreParametroGeneralSg.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextArearepresentante_nombreParametroGeneralSg.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextArearepresentante_nombreParametroGeneralSg.setLineWrap(true);
		jTextArearepresentante_nombreParametroGeneralSg.setWrapStyleWord(true);
		jTextArearepresentante_nombreParametroGeneralSg.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextArearepresentante_nombreParametroGeneralSg.setRows(5);

		FuncionesSwing.setBoldTextArea(jTextArearepresentante_nombreParametroGeneralSg,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPanerepresentante_nombreParametroGeneralSg = new JScrollPane(jTextArearepresentante_nombreParametroGeneralSg);
		jscrollPanerepresentante_nombreParametroGeneralSg.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanerepresentante_nombreParametroGeneralSg.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanerepresentante_nombreParametroGeneralSg.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));

		this.jButtonrepresentante_nombreParametroGeneralSgBusqueda= new JButtonMe();
		this.jButtonrepresentante_nombreParametroGeneralSgBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonrepresentante_nombreParametroGeneralSgBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonrepresentante_nombreParametroGeneralSgBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonrepresentante_nombreParametroGeneralSgBusqueda.setText("U");
		this.jButtonrepresentante_nombreParametroGeneralSgBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonrepresentante_nombreParametroGeneralSgBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonrepresentante_nombreParametroGeneralSgBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextArearepresentante_nombreParametroGeneralSg.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextArearepresentante_nombreParametroGeneralSg.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"representante_nombreParametroGeneralSgBusqueda"));

		if(this.parametrogeneralsgSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonrepresentante_nombreParametroGeneralSgBusqueda.setVisible(false);		}


					
		this.jLabelcodigo_proceso_actualizacionParametroGeneralSg = new JLabelMe();
		this.jLabelcodigo_proceso_actualizacionParametroGeneralSg.setText(""+ParametroGeneralSgConstantesFunciones.LABEL_CODIGOPROCESOACTUALIZACION+" : *");
		this.jLabelcodigo_proceso_actualizacionParametroGeneralSg.setToolTipText("Codigo Proceso Actualizacion");
		this.jLabelcodigo_proceso_actualizacionParametroGeneralSg.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));
		this.jLabelcodigo_proceso_actualizacionParametroGeneralSg.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));
		this.jLabelcodigo_proceso_actualizacionParametroGeneralSg.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));

		FuncionesSwing.setBoldLabel(jLabelcodigo_proceso_actualizacionParametroGeneralSg,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelcodigo_proceso_actualizacionParametroGeneralSg=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelcodigo_proceso_actualizacionParametroGeneralSg.setToolTipText(ParametroGeneralSgConstantesFunciones.LABEL_CODIGOPROCESOACTUALIZACION);
		this.gridaBagLayoutParametroGeneralSg = new GridBagLayout();
		this.jPanelcodigo_proceso_actualizacionParametroGeneralSg.setLayout(this.gridaBagLayoutParametroGeneralSg);


		jTextFieldcodigo_proceso_actualizacionParametroGeneralSg= new JTextFieldMe();

		jTextFieldcodigo_proceso_actualizacionParametroGeneralSg.setEnabled(false);
		jTextFieldcodigo_proceso_actualizacionParametroGeneralSg.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcodigo_proceso_actualizacionParametroGeneralSg.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcodigo_proceso_actualizacionParametroGeneralSg.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldcodigo_proceso_actualizacionParametroGeneralSg,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtoncodigo_proceso_actualizacionParametroGeneralSgBusqueda= new JButtonMe();
		this.jButtoncodigo_proceso_actualizacionParametroGeneralSgBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncodigo_proceso_actualizacionParametroGeneralSgBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncodigo_proceso_actualizacionParametroGeneralSgBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtoncodigo_proceso_actualizacionParametroGeneralSgBusqueda.setText("U");
		this.jButtoncodigo_proceso_actualizacionParametroGeneralSgBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtoncodigo_proceso_actualizacionParametroGeneralSgBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtoncodigo_proceso_actualizacionParametroGeneralSgBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldcodigo_proceso_actualizacionParametroGeneralSg.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldcodigo_proceso_actualizacionParametroGeneralSg.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"codigo_proceso_actualizacionParametroGeneralSgBusqueda"));

		if(this.parametrogeneralsgSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtoncodigo_proceso_actualizacionParametroGeneralSgBusqueda.setVisible(false);		}


					
		this.jLabelesta_activoParametroGeneralSg = new JLabelMe();
		this.jLabelesta_activoParametroGeneralSg.setText(""+ParametroGeneralSgConstantesFunciones.LABEL_ESTAACTIVO+" : *");
		this.jLabelesta_activoParametroGeneralSg.setToolTipText("Esta Activo");
		this.jLabelesta_activoParametroGeneralSg.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelesta_activoParametroGeneralSg.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelesta_activoParametroGeneralSg.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelesta_activoParametroGeneralSg,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelesta_activoParametroGeneralSg=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelesta_activoParametroGeneralSg.setToolTipText(ParametroGeneralSgConstantesFunciones.LABEL_ESTAACTIVO);
		this.gridaBagLayoutParametroGeneralSg = new GridBagLayout();
		this.jPanelesta_activoParametroGeneralSg.setLayout(this.gridaBagLayoutParametroGeneralSg);


		jCheckBoxesta_activoParametroGeneralSg= new JCheckBoxMe();
		jCheckBoxesta_activoParametroGeneralSg.setEnabled(false);

		jCheckBoxesta_activoParametroGeneralSg.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jCheckBoxesta_activoParametroGeneralSg.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jCheckBoxesta_activoParametroGeneralSg.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldCheckBox(jCheckBoxesta_activoParametroGeneralSg,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonesta_activoParametroGeneralSgBusqueda= new JButtonMe();
		this.jButtonesta_activoParametroGeneralSgBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonesta_activoParametroGeneralSgBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonesta_activoParametroGeneralSgBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonesta_activoParametroGeneralSgBusqueda.setText("U");
		this.jButtonesta_activoParametroGeneralSgBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonesta_activoParametroGeneralSgBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonesta_activoParametroGeneralSgBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jCheckBoxesta_activoParametroGeneralSg.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jCheckBoxesta_activoParametroGeneralSg.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"esta_activoParametroGeneralSgBusqueda"));

		if(this.parametrogeneralsgSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonesta_activoParametroGeneralSgBusqueda.setVisible(false);		}


	}
	
	public void inicializarElementosCamposForeigKeysParametroGeneralSg() {
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
		//this.jInternalFrameDetalleParametroGeneralSg = new ParametroGeneralSgBeanSwingJInternalFrameAdditional(paginaTipo);//JInternalFrameBase("Parametro General DATOS");
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutParametroGeneralSg= new GridBagLayout();
		

		
		String sToolTipParametroGeneralSg="";
		sToolTipParametroGeneralSg=ParametroGeneralSgConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipParametroGeneralSg+="(Seguridad.ParametroGeneralSg)";
		}
		
		if(!this.parametrogeneralsgSessionBean.getEsGuardarRelacionado()) {
			sToolTipParametroGeneralSg+="_"+this.opcionActual.getId();
		}
								
		
		this.jButtonNuevoParametroGeneralSg = new JButtonMe();
		this.jButtonModificarParametroGeneralSg = new JButtonMe();
        this.jButtonActualizarParametroGeneralSg = new JButtonMe();
        this.jButtonEliminarParametroGeneralSg = new JButtonMe();
        this.jButtonCancelarParametroGeneralSg = new JButtonMe();
        this.jButtonGuardarCambiosParametroGeneralSg = new JButtonMe();
		this.jButtonGuardarCambiosTablaParametroGeneralSg = new JButtonMe();
		this.jButtonCerrarParametroGeneralSg = new JButtonMe();
		
		this.jScrollPanelDatosParametroGeneralSg = new JScrollPane();   
        this.jScrollPanelDatosEdicionParametroGeneralSg = new JScrollPane();
		this.jScrollPanelDatosGeneralParametroGeneralSg = new JScrollPane();
				
		
		
		this.jPanelCamposParametroGeneralSg = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelCamposOcultosParametroGeneralSg = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
        this.jPanelAccionesParametroGeneralSg = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		this.jPanelAccionesFormularioParametroGeneralSg = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		this.sPath=" <---> Acceso: Parametro General";
		
		if(!this.parametrogeneralsgSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosParametroGeneralSg.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Parametro Generales" + this.sPath));
		} else {
			this.jScrollPanelDatosParametroGeneralSg.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosEdicionParametroGeneralSg.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		this.jScrollPanelDatosGeneralParametroGeneralSg.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
			
        this.jPanelCamposParametroGeneralSg.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
        this.jPanelCamposParametroGeneralSg.setName("jPanelCamposParametroGeneralSg"); 

		this.jPanelCamposOcultosParametroGeneralSg.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos Ocultos"));
        this.jPanelCamposOcultosParametroGeneralSg.setName("jPanelCamposOcultosParametroGeneralSg"); 

        this.jPanelAccionesParametroGeneralSg.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesParametroGeneralSg.setToolTipText("Acciones");
        this.jPanelAccionesParametroGeneralSg.setName("Acciones"); 

		this.jPanelAccionesFormularioParametroGeneralSg.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones Extra/Post"));
        this.jPanelAccionesFormularioParametroGeneralSg.setToolTipText("Acciones");
        this.jPanelAccionesFormularioParametroGeneralSg.setName("Acciones"); 
		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosEdicionParametroGeneralSg, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralParametroGeneralSg, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosParametroGeneralSg, STIPO_TAMANIO_GENERAL,false,false,this);		
		FuncionesSwing.setBoldPanel(this.jPanelCamposParametroGeneralSg, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelCamposOcultosParametroGeneralSg, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelAccionesFormularioParametroGeneralSg, STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {
		
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		
        this.jButtonNuevoParametroGeneralSg.setText("Nuevo");
		this.jButtonModificarParametroGeneralSg.setText("Editar");
        this.jButtonActualizarParametroGeneralSg.setText("Actualizar");
        this.jButtonEliminarParametroGeneralSg.setText("Eliminar");
        this.jButtonCancelarParametroGeneralSg.setText("Cancelar");
        this.jButtonGuardarCambiosParametroGeneralSg.setText("Guardar");
		this.jButtonGuardarCambiosTablaParametroGeneralSg.setText("Guardar");
		this.jButtonCerrarParametroGeneralSg.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoParametroGeneralSg,"nuevo_button","Nuevo",this.parametrogeneralsgSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonModificarParametroGeneralSg,"modificar_button","Editar",this.parametrogeneralsgSessionBean.getEsGuardarRelacionado());
       	FuncionesSwing.addImagenButtonGeneral(this.jButtonActualizarParametroGeneralSg,"actualizar_button","Actualizar",this.parametrogeneralsgSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonEliminarParametroGeneralSg,"eliminar_button","Eliminar",this.parametrogeneralsgSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonCancelarParametroGeneralSg,"cancelar_button","Cancelar",this.parametrogeneralsgSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosParametroGeneralSg,"guardarcambios_button","Guardar",this.parametrogeneralsgSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaParametroGeneralSg,"guardarcambiostabla_button","Guardar",this.parametrogeneralsgSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarParametroGeneralSg,"cerrar_button","Salir",this.parametrogeneralsgSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoParametroGeneralSg, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonModificarParametroGeneralSg, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosParametroGeneralSg, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaParametroGeneralSg, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarParametroGeneralSg, STIPO_TAMANIO_GENERAL,false,true,this);
		
		FuncionesSwing.setBoldButton(this.jButtonActualizarParametroGeneralSg, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonEliminarParametroGeneralSg, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonCancelarParametroGeneralSg, STIPO_TAMANIO_GENERAL,false,false,this);
		
		this.jButtonNuevoParametroGeneralSg.setToolTipText("Nuevo"+" "+ParametroGeneralSgConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonModificarParametroGeneralSg.setToolTipText("Editar"+" "+ParametroGeneralSgConstantesFunciones.SCLASSWEBTITULO+"");// + FuncionesSwing.getKeyMensaje("MODIFICAR"))
        this.jButtonActualizarParametroGeneralSg.setToolTipText("Actualizar"+" "+ParametroGeneralSgConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
        this.jButtonEliminarParametroGeneralSg.setToolTipText("Eliminar)"+" "+ParametroGeneralSgConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"));
        this.jButtonCancelarParametroGeneralSg.setToolTipText("Cancelar"+" "+ParametroGeneralSgConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"));
        this.jButtonGuardarCambiosParametroGeneralSg.setToolTipText("Guardar"+" "+ParametroGeneralSgConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonGuardarCambiosTablaParametroGeneralSg.setToolTipText("Guardar"+" "+ParametroGeneralSgConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarParametroGeneralSg.setToolTipText("Salir"+" "+ParametroGeneralSgConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoParametroGeneralSg";
		inputMap = this.jButtonNuevoParametroGeneralSg.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoParametroGeneralSg.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoParametroGeneralSg"));
		
		//ACTUALIZAR
		sMapKey = "ActualizarParametroGeneralSg";
		inputMap = this.jButtonActualizarParametroGeneralSg.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ACTUALIZAR") , FuncionesSwing.getMaskKey("ACTUALIZAR")), sMapKey);
		
		this.jButtonActualizarParametroGeneralSg.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ActualizarParametroGeneralSg"));
		
		//ELIMINAR
		sMapKey = "EliminarParametroGeneralSg";
		inputMap = this.jButtonEliminarParametroGeneralSg.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ELIMINAR") , FuncionesSwing.getMaskKey("ELIMINAR")), sMapKey);
		
		this.jButtonEliminarParametroGeneralSg.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"EliminarParametroGeneralSg"));
		
		//CANCELAR	
		sMapKey = "CancelarParametroGeneralSg";
		inputMap = this.jButtonCancelarParametroGeneralSg.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CANCELAR") , FuncionesSwing.getMaskKey("CANCELAR")), sMapKey);
		
		this.jButtonCancelarParametroGeneralSg.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CancelarParametroGeneralSg"));
		
		//CERRAR		
		sMapKey = "CerrarParametroGeneralSg";
		inputMap = this.jButtonCerrarParametroGeneralSg.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarParametroGeneralSg.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarParametroGeneralSg"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaParametroGeneralSg";
		inputMap = this.jButtonGuardarCambiosTablaParametroGeneralSg.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaParametroGeneralSg.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaParametroGeneralSg"));
		
		//HOT KEYS
		
		this.jCheckBoxPostAccionNuevoParametroGeneralSg = new JCheckBoxMe();
		this.jCheckBoxPostAccionNuevoParametroGeneralSg.setText("Nuevo");
		this.jCheckBoxPostAccionNuevoParametroGeneralSg.setToolTipText("Nuevo ParametroGeneralSg");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionNuevoParametroGeneralSg, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinCerrarParametroGeneralSg = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinCerrarParametroGeneralSg.setText("Sin Cerrar");
		this.jCheckBoxPostAccionSinCerrarParametroGeneralSg.setToolTipText("Sin Cerrar Ventana ParametroGeneralSg");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinCerrarParametroGeneralSg, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinMensajeParametroGeneralSg = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinMensajeParametroGeneralSg.setText("Sin Mensaje");
		this.jCheckBoxPostAccionSinMensajeParametroGeneralSg.setToolTipText("Sin Mensaje Confirmacion");				
				
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinMensajeParametroGeneralSg, STIPO_TAMANIO_GENERAL,false,false,this);       	
       
				
		
			
			
		this.jComboBoxTiposAccionesParametroGeneralSg = new JComboBoxMe();
		//this.jComboBoxTiposAccionesParametroGeneralSg.setText("Accion");
		this.jComboBoxTiposAccionesParametroGeneralSg.setToolTipText("Tipos de Acciones");
							
		

		this.jComboBoxTiposAccionesFormularioParametroGeneralSg = new JComboBoxMe();
		//this.jComboBoxTiposAccionesFormularioParametroGeneralSg.setText("Accion");				
    	this.jComboBoxTiposAccionesFormularioParametroGeneralSg.setToolTipText("Tipos de Acciones");
	
		this.jLabelAccionesParametroGeneralSg = new JLabelMe();
		
		this.jLabelAccionesParametroGeneralSg.setText("Acciones");		
		this.jLabelAccionesParametroGeneralSg.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesParametroGeneralSg.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesParametroGeneralSg.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
        //HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		//HOT KEYS2
		
		//ELEMENTOS
		this.inicializarElementosCamposParametroGeneralSg();
		
		//ELEMENTOS FK
		this.inicializarElementosCamposForeigKeysParametroGeneralSg();
				
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		this.jTabbedPaneRelacionesParametroGeneralSg=new JTabbedPane();
		this.jTabbedPaneRelacionesParametroGeneralSg.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Relacionados"));
		
		//ESTA EN BEAN

		
		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneRelacionesParametroGeneralSg,STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		int iPosXAccionPaginacion=0;
		
		
		
				
		
		this.jComboBoxTiposAccionesParametroGeneralSg.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesParametroGeneralSg.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesParametroGeneralSg.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesParametroGeneralSg, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		
		
		this.jComboBoxTiposAccionesFormularioParametroGeneralSg.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioParametroGeneralSg.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioParametroGeneralSg.setPreferredSize(new Dimension(145,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesFormularioParametroGeneralSg, STIPO_TAMANIO_GENERAL,false,false,this);				
		
		GridBagLayout gridaBagLayoutCamposParametroGeneralSg = new GridBagLayout();
		GridBagLayout gridaBagLayoutCamposOcultosParametroGeneralSg = new GridBagLayout();
		
		this.jPanelCamposParametroGeneralSg.setLayout(gridaBagLayoutCamposParametroGeneralSg);
		this.jPanelCamposOcultosParametroGeneralSg.setLayout(gridaBagLayoutCamposOcultosParametroGeneralSg);
		
		;
		;
		
		
		//SUBPANELES SIMPLES
		//SUBPANELES POR CAMPO
        
	this.gridBagConstraintsParametroGeneralSg = new GridBagConstraints();
	this.gridBagConstraintsParametroGeneralSg.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsParametroGeneralSg.gridy = 0;
	this.gridBagConstraintsParametroGeneralSg.gridx = 0;
	this.gridBagConstraintsParametroGeneralSg.ipadx = 0;
	this.gridBagConstraintsParametroGeneralSg.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelidParametroGeneralSg.add(jLabelIdParametroGeneralSg, this.gridBagConstraintsParametroGeneralSg);



	this.gridBagConstraintsParametroGeneralSg = new GridBagConstraints();
	this.gridBagConstraintsParametroGeneralSg.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsParametroGeneralSg.gridy = 0;
	this.gridBagConstraintsParametroGeneralSg.gridx = 1;
	this.gridBagConstraintsParametroGeneralSg.ipadx = 0;
	this.gridBagConstraintsParametroGeneralSg.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelidParametroGeneralSg.add(jLabelidParametroGeneralSg, this.gridBagConstraintsParametroGeneralSg);


	this.gridBagConstraintsParametroGeneralSg = new GridBagConstraints();
	this.gridBagConstraintsParametroGeneralSg.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsParametroGeneralSg.gridy = 0;
	this.gridBagConstraintsParametroGeneralSg.gridx = 0;
	this.gridBagConstraintsParametroGeneralSg.ipadx = 0;
	this.gridBagConstraintsParametroGeneralSg.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelnombre_sistemaParametroGeneralSg.add(jLabelnombre_sistemaParametroGeneralSg, this.gridBagConstraintsParametroGeneralSg);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsParametroGeneralSg = new GridBagConstraints();
		//this.gridBagConstraintsParametroGeneralSg.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsParametroGeneralSg.gridy = 0;
		this.gridBagConstraintsParametroGeneralSg.gridx = 2;
		this.gridBagConstraintsParametroGeneralSg.ipadx = 0;
		this.gridBagConstraintsParametroGeneralSg.insets = new Insets(0, 0, 0, 0);
		this.jPanelnombre_sistemaParametroGeneralSg.add(jButtonnombre_sistemaParametroGeneralSgBusqueda, this.gridBagConstraintsParametroGeneralSg);
	}

	this.gridBagConstraintsParametroGeneralSg = new GridBagConstraints();
	this.gridBagConstraintsParametroGeneralSg.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsParametroGeneralSg.gridy = 0;
	this.gridBagConstraintsParametroGeneralSg.gridx = 1;
	this.gridBagConstraintsParametroGeneralSg.ipadx = 0;
	this.gridBagConstraintsParametroGeneralSg.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelnombre_sistemaParametroGeneralSg.add(jscrollPanenombre_sistemaParametroGeneralSg, this.gridBagConstraintsParametroGeneralSg);


	this.gridBagConstraintsParametroGeneralSg = new GridBagConstraints();
	this.gridBagConstraintsParametroGeneralSg.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsParametroGeneralSg.gridy = 0;
	this.gridBagConstraintsParametroGeneralSg.gridx = 0;
	this.gridBagConstraintsParametroGeneralSg.ipadx = 0;
	this.gridBagConstraintsParametroGeneralSg.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelnombre_simple_sistemaParametroGeneralSg.add(jLabelnombre_simple_sistemaParametroGeneralSg, this.gridBagConstraintsParametroGeneralSg);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsParametroGeneralSg = new GridBagConstraints();
		//this.gridBagConstraintsParametroGeneralSg.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsParametroGeneralSg.gridy = 0;
		this.gridBagConstraintsParametroGeneralSg.gridx = 2;
		this.gridBagConstraintsParametroGeneralSg.ipadx = 0;
		this.gridBagConstraintsParametroGeneralSg.insets = new Insets(0, 0, 0, 0);
		this.jPanelnombre_simple_sistemaParametroGeneralSg.add(jButtonnombre_simple_sistemaParametroGeneralSgBusqueda, this.gridBagConstraintsParametroGeneralSg);
	}

	this.gridBagConstraintsParametroGeneralSg = new GridBagConstraints();
	this.gridBagConstraintsParametroGeneralSg.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsParametroGeneralSg.gridy = 0;
	this.gridBagConstraintsParametroGeneralSg.gridx = 1;
	this.gridBagConstraintsParametroGeneralSg.ipadx = 0;
	this.gridBagConstraintsParametroGeneralSg.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelnombre_simple_sistemaParametroGeneralSg.add(jscrollPanenombre_simple_sistemaParametroGeneralSg, this.gridBagConstraintsParametroGeneralSg);


	this.gridBagConstraintsParametroGeneralSg = new GridBagConstraints();
	this.gridBagConstraintsParametroGeneralSg.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsParametroGeneralSg.gridy = 0;
	this.gridBagConstraintsParametroGeneralSg.gridx = 0;
	this.gridBagConstraintsParametroGeneralSg.ipadx = 0;
	this.gridBagConstraintsParametroGeneralSg.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelnombre_empresaParametroGeneralSg.add(jLabelnombre_empresaParametroGeneralSg, this.gridBagConstraintsParametroGeneralSg);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsParametroGeneralSg = new GridBagConstraints();
		//this.gridBagConstraintsParametroGeneralSg.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsParametroGeneralSg.gridy = 0;
		this.gridBagConstraintsParametroGeneralSg.gridx = 2;
		this.gridBagConstraintsParametroGeneralSg.ipadx = 0;
		this.gridBagConstraintsParametroGeneralSg.insets = new Insets(0, 0, 0, 0);
		this.jPanelnombre_empresaParametroGeneralSg.add(jButtonnombre_empresaParametroGeneralSgBusqueda, this.gridBagConstraintsParametroGeneralSg);
	}

	this.gridBagConstraintsParametroGeneralSg = new GridBagConstraints();
	this.gridBagConstraintsParametroGeneralSg.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsParametroGeneralSg.gridy = 0;
	this.gridBagConstraintsParametroGeneralSg.gridx = 1;
	this.gridBagConstraintsParametroGeneralSg.ipadx = 0;
	this.gridBagConstraintsParametroGeneralSg.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelnombre_empresaParametroGeneralSg.add(jscrollPanenombre_empresaParametroGeneralSg, this.gridBagConstraintsParametroGeneralSg);


	this.gridBagConstraintsParametroGeneralSg = new GridBagConstraints();
	this.gridBagConstraintsParametroGeneralSg.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsParametroGeneralSg.gridy = 0;
	this.gridBagConstraintsParametroGeneralSg.gridx = 0;
	this.gridBagConstraintsParametroGeneralSg.ipadx = 0;
	this.gridBagConstraintsParametroGeneralSg.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelversion_sistemaParametroGeneralSg.add(jLabelversion_sistemaParametroGeneralSg, this.gridBagConstraintsParametroGeneralSg);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsParametroGeneralSg = new GridBagConstraints();
		//this.gridBagConstraintsParametroGeneralSg.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsParametroGeneralSg.gridy = 0;
		this.gridBagConstraintsParametroGeneralSg.gridx = 2;
		this.gridBagConstraintsParametroGeneralSg.ipadx = 0;
		this.gridBagConstraintsParametroGeneralSg.insets = new Insets(0, 0, 0, 0);
		this.jPanelversion_sistemaParametroGeneralSg.add(jButtonversion_sistemaParametroGeneralSgBusqueda, this.gridBagConstraintsParametroGeneralSg);
	}

	this.gridBagConstraintsParametroGeneralSg = new GridBagConstraints();
	this.gridBagConstraintsParametroGeneralSg.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsParametroGeneralSg.gridy = 0;
	this.gridBagConstraintsParametroGeneralSg.gridx = 1;
	this.gridBagConstraintsParametroGeneralSg.ipadx = 0;
	this.gridBagConstraintsParametroGeneralSg.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelversion_sistemaParametroGeneralSg.add(jTextFieldversion_sistemaParametroGeneralSg, this.gridBagConstraintsParametroGeneralSg);


	this.gridBagConstraintsParametroGeneralSg = new GridBagConstraints();
	this.gridBagConstraintsParametroGeneralSg.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsParametroGeneralSg.gridy = 0;
	this.gridBagConstraintsParametroGeneralSg.gridx = 0;
	this.gridBagConstraintsParametroGeneralSg.ipadx = 0;
	this.gridBagConstraintsParametroGeneralSg.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelsiglas_sistemaParametroGeneralSg.add(jLabelsiglas_sistemaParametroGeneralSg, this.gridBagConstraintsParametroGeneralSg);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsParametroGeneralSg = new GridBagConstraints();
		//this.gridBagConstraintsParametroGeneralSg.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsParametroGeneralSg.gridy = 0;
		this.gridBagConstraintsParametroGeneralSg.gridx = 2;
		this.gridBagConstraintsParametroGeneralSg.ipadx = 0;
		this.gridBagConstraintsParametroGeneralSg.insets = new Insets(0, 0, 0, 0);
		this.jPanelsiglas_sistemaParametroGeneralSg.add(jButtonsiglas_sistemaParametroGeneralSgBusqueda, this.gridBagConstraintsParametroGeneralSg);
	}

	this.gridBagConstraintsParametroGeneralSg = new GridBagConstraints();
	this.gridBagConstraintsParametroGeneralSg.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsParametroGeneralSg.gridy = 0;
	this.gridBagConstraintsParametroGeneralSg.gridx = 1;
	this.gridBagConstraintsParametroGeneralSg.ipadx = 0;
	this.gridBagConstraintsParametroGeneralSg.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelsiglas_sistemaParametroGeneralSg.add(jTextFieldsiglas_sistemaParametroGeneralSg, this.gridBagConstraintsParametroGeneralSg);


	this.gridBagConstraintsParametroGeneralSg = new GridBagConstraints();
	this.gridBagConstraintsParametroGeneralSg.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsParametroGeneralSg.gridy = 0;
	this.gridBagConstraintsParametroGeneralSg.gridx = 0;
	this.gridBagConstraintsParametroGeneralSg.ipadx = 0;
	this.gridBagConstraintsParametroGeneralSg.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelmail_sistemaParametroGeneralSg.add(jLabelmail_sistemaParametroGeneralSg, this.gridBagConstraintsParametroGeneralSg);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsParametroGeneralSg = new GridBagConstraints();
		//this.gridBagConstraintsParametroGeneralSg.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsParametroGeneralSg.gridy = 0;
		this.gridBagConstraintsParametroGeneralSg.gridx = 2;
		this.gridBagConstraintsParametroGeneralSg.ipadx = 0;
		this.gridBagConstraintsParametroGeneralSg.insets = new Insets(0, 0, 0, 0);
		this.jPanelmail_sistemaParametroGeneralSg.add(jButtonmail_sistemaParametroGeneralSgBusqueda, this.gridBagConstraintsParametroGeneralSg);
	}

	this.gridBagConstraintsParametroGeneralSg = new GridBagConstraints();
	this.gridBagConstraintsParametroGeneralSg.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsParametroGeneralSg.gridy = 0;
	this.gridBagConstraintsParametroGeneralSg.gridx = 1;
	this.gridBagConstraintsParametroGeneralSg.ipadx = 0;
	this.gridBagConstraintsParametroGeneralSg.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelmail_sistemaParametroGeneralSg.add(jscrollPanemail_sistemaParametroGeneralSg, this.gridBagConstraintsParametroGeneralSg);


	this.gridBagConstraintsParametroGeneralSg = new GridBagConstraints();
	this.gridBagConstraintsParametroGeneralSg.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsParametroGeneralSg.gridy = 0;
	this.gridBagConstraintsParametroGeneralSg.gridx = 0;
	this.gridBagConstraintsParametroGeneralSg.ipadx = 0;
	this.gridBagConstraintsParametroGeneralSg.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPaneltelefono_sistemaParametroGeneralSg.add(jLabeltelefono_sistemaParametroGeneralSg, this.gridBagConstraintsParametroGeneralSg);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsParametroGeneralSg = new GridBagConstraints();
		//this.gridBagConstraintsParametroGeneralSg.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsParametroGeneralSg.gridy = 0;
		this.gridBagConstraintsParametroGeneralSg.gridx = 2;
		this.gridBagConstraintsParametroGeneralSg.ipadx = 0;
		this.gridBagConstraintsParametroGeneralSg.insets = new Insets(0, 0, 0, 0);
		this.jPaneltelefono_sistemaParametroGeneralSg.add(jButtontelefono_sistemaParametroGeneralSgBusqueda, this.gridBagConstraintsParametroGeneralSg);
	}

	this.gridBagConstraintsParametroGeneralSg = new GridBagConstraints();
	this.gridBagConstraintsParametroGeneralSg.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsParametroGeneralSg.gridy = 0;
	this.gridBagConstraintsParametroGeneralSg.gridx = 1;
	this.gridBagConstraintsParametroGeneralSg.ipadx = 0;
	this.gridBagConstraintsParametroGeneralSg.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPaneltelefono_sistemaParametroGeneralSg.add(jTextFieldtelefono_sistemaParametroGeneralSg, this.gridBagConstraintsParametroGeneralSg);


	this.gridBagConstraintsParametroGeneralSg = new GridBagConstraints();
	this.gridBagConstraintsParametroGeneralSg.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsParametroGeneralSg.gridy = 0;
	this.gridBagConstraintsParametroGeneralSg.gridx = 0;
	this.gridBagConstraintsParametroGeneralSg.ipadx = 0;
	this.gridBagConstraintsParametroGeneralSg.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelfax_sistemaParametroGeneralSg.add(jLabelfax_sistemaParametroGeneralSg, this.gridBagConstraintsParametroGeneralSg);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsParametroGeneralSg = new GridBagConstraints();
		//this.gridBagConstraintsParametroGeneralSg.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsParametroGeneralSg.gridy = 0;
		this.gridBagConstraintsParametroGeneralSg.gridx = 2;
		this.gridBagConstraintsParametroGeneralSg.ipadx = 0;
		this.gridBagConstraintsParametroGeneralSg.insets = new Insets(0, 0, 0, 0);
		this.jPanelfax_sistemaParametroGeneralSg.add(jButtonfax_sistemaParametroGeneralSgBusqueda, this.gridBagConstraintsParametroGeneralSg);
	}

	this.gridBagConstraintsParametroGeneralSg = new GridBagConstraints();
	this.gridBagConstraintsParametroGeneralSg.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsParametroGeneralSg.gridy = 0;
	this.gridBagConstraintsParametroGeneralSg.gridx = 1;
	this.gridBagConstraintsParametroGeneralSg.ipadx = 0;
	this.gridBagConstraintsParametroGeneralSg.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelfax_sistemaParametroGeneralSg.add(jTextFieldfax_sistemaParametroGeneralSg, this.gridBagConstraintsParametroGeneralSg);


	this.gridBagConstraintsParametroGeneralSg = new GridBagConstraints();
	this.gridBagConstraintsParametroGeneralSg.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsParametroGeneralSg.gridy = 0;
	this.gridBagConstraintsParametroGeneralSg.gridx = 0;
	this.gridBagConstraintsParametroGeneralSg.ipadx = 0;
	this.gridBagConstraintsParametroGeneralSg.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelrepresentante_nombreParametroGeneralSg.add(jLabelrepresentante_nombreParametroGeneralSg, this.gridBagConstraintsParametroGeneralSg);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsParametroGeneralSg = new GridBagConstraints();
		//this.gridBagConstraintsParametroGeneralSg.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsParametroGeneralSg.gridy = 0;
		this.gridBagConstraintsParametroGeneralSg.gridx = 2;
		this.gridBagConstraintsParametroGeneralSg.ipadx = 0;
		this.gridBagConstraintsParametroGeneralSg.insets = new Insets(0, 0, 0, 0);
		this.jPanelrepresentante_nombreParametroGeneralSg.add(jButtonrepresentante_nombreParametroGeneralSgBusqueda, this.gridBagConstraintsParametroGeneralSg);
	}

	this.gridBagConstraintsParametroGeneralSg = new GridBagConstraints();
	this.gridBagConstraintsParametroGeneralSg.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsParametroGeneralSg.gridy = 0;
	this.gridBagConstraintsParametroGeneralSg.gridx = 1;
	this.gridBagConstraintsParametroGeneralSg.ipadx = 0;
	this.gridBagConstraintsParametroGeneralSg.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelrepresentante_nombreParametroGeneralSg.add(jscrollPanerepresentante_nombreParametroGeneralSg, this.gridBagConstraintsParametroGeneralSg);


	this.gridBagConstraintsParametroGeneralSg = new GridBagConstraints();
	this.gridBagConstraintsParametroGeneralSg.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsParametroGeneralSg.gridy = 0;
	this.gridBagConstraintsParametroGeneralSg.gridx = 0;
	this.gridBagConstraintsParametroGeneralSg.ipadx = 0;
	this.gridBagConstraintsParametroGeneralSg.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelcodigo_proceso_actualizacionParametroGeneralSg.add(jLabelcodigo_proceso_actualizacionParametroGeneralSg, this.gridBagConstraintsParametroGeneralSg);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsParametroGeneralSg = new GridBagConstraints();
		//this.gridBagConstraintsParametroGeneralSg.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsParametroGeneralSg.gridy = 0;
		this.gridBagConstraintsParametroGeneralSg.gridx = 2;
		this.gridBagConstraintsParametroGeneralSg.ipadx = 0;
		this.gridBagConstraintsParametroGeneralSg.insets = new Insets(0, 0, 0, 0);
		this.jPanelcodigo_proceso_actualizacionParametroGeneralSg.add(jButtoncodigo_proceso_actualizacionParametroGeneralSgBusqueda, this.gridBagConstraintsParametroGeneralSg);
	}

	this.gridBagConstraintsParametroGeneralSg = new GridBagConstraints();
	this.gridBagConstraintsParametroGeneralSg.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsParametroGeneralSg.gridy = 0;
	this.gridBagConstraintsParametroGeneralSg.gridx = 1;
	this.gridBagConstraintsParametroGeneralSg.ipadx = 0;
	this.gridBagConstraintsParametroGeneralSg.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelcodigo_proceso_actualizacionParametroGeneralSg.add(jTextFieldcodigo_proceso_actualizacionParametroGeneralSg, this.gridBagConstraintsParametroGeneralSg);


	this.gridBagConstraintsParametroGeneralSg = new GridBagConstraints();
	this.gridBagConstraintsParametroGeneralSg.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsParametroGeneralSg.gridy = 0;
	this.gridBagConstraintsParametroGeneralSg.gridx = 0;
	this.gridBagConstraintsParametroGeneralSg.ipadx = 0;
	this.gridBagConstraintsParametroGeneralSg.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelesta_activoParametroGeneralSg.add(jLabelesta_activoParametroGeneralSg, this.gridBagConstraintsParametroGeneralSg);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsParametroGeneralSg = new GridBagConstraints();
		//this.gridBagConstraintsParametroGeneralSg.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsParametroGeneralSg.gridy = 0;
		this.gridBagConstraintsParametroGeneralSg.gridx = 2;
		this.gridBagConstraintsParametroGeneralSg.ipadx = 0;
		this.gridBagConstraintsParametroGeneralSg.insets = new Insets(0, 0, 0, 0);
		this.jPanelesta_activoParametroGeneralSg.add(jButtonesta_activoParametroGeneralSgBusqueda, this.gridBagConstraintsParametroGeneralSg);
	}

	this.gridBagConstraintsParametroGeneralSg = new GridBagConstraints();
	this.gridBagConstraintsParametroGeneralSg.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsParametroGeneralSg.gridy = 0;
	this.gridBagConstraintsParametroGeneralSg.gridx = 1;
	this.gridBagConstraintsParametroGeneralSg.ipadx = 0;
	this.gridBagConstraintsParametroGeneralSg.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelesta_activoParametroGeneralSg.add(jCheckBoxesta_activoParametroGeneralSg, this.gridBagConstraintsParametroGeneralSg);


		//SUBPANELES SIMPLES
		
		//SUBPANELES EN PANEL
		//SUBPANELES EN PANEL CAMPOS NORMAL				
		
	this.gridBagConstraintsParametroGeneralSg = new GridBagConstraints();
	this.gridBagConstraintsParametroGeneralSg.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsParametroGeneralSg.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsParametroGeneralSg.gridy = iYPanelCamposParametroGeneralSg;
	this.gridBagConstraintsParametroGeneralSg.gridx = iXPanelCamposParametroGeneralSg++;
	this.gridBagConstraintsParametroGeneralSg.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsParametroGeneralSg.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposParametroGeneralSg.add(this.jPanelidParametroGeneralSg, this.gridBagConstraintsParametroGeneralSg);



	if(iXPanelCamposParametroGeneralSg % 1==0) {
		iXPanelCamposParametroGeneralSg=0;
		iYPanelCamposParametroGeneralSg++;
	}
	this.gridBagConstraintsParametroGeneralSg = new GridBagConstraints();
	this.gridBagConstraintsParametroGeneralSg.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsParametroGeneralSg.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsParametroGeneralSg.gridy = iYPanelCamposParametroGeneralSg;
	this.gridBagConstraintsParametroGeneralSg.gridx = iXPanelCamposParametroGeneralSg++;
	this.gridBagConstraintsParametroGeneralSg.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsParametroGeneralSg.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposParametroGeneralSg.add(this.jPanelnombre_sistemaParametroGeneralSg, this.gridBagConstraintsParametroGeneralSg);



	if(iXPanelCamposParametroGeneralSg % 1==0) {
		iXPanelCamposParametroGeneralSg=0;
		iYPanelCamposParametroGeneralSg++;
	}
	this.gridBagConstraintsParametroGeneralSg = new GridBagConstraints();
	this.gridBagConstraintsParametroGeneralSg.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsParametroGeneralSg.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsParametroGeneralSg.gridy = iYPanelCamposParametroGeneralSg;
	this.gridBagConstraintsParametroGeneralSg.gridx = iXPanelCamposParametroGeneralSg++;
	this.gridBagConstraintsParametroGeneralSg.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsParametroGeneralSg.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposParametroGeneralSg.add(this.jPanelnombre_simple_sistemaParametroGeneralSg, this.gridBagConstraintsParametroGeneralSg);



	if(iXPanelCamposParametroGeneralSg % 1==0) {
		iXPanelCamposParametroGeneralSg=0;
		iYPanelCamposParametroGeneralSg++;
	}
	this.gridBagConstraintsParametroGeneralSg = new GridBagConstraints();
	this.gridBagConstraintsParametroGeneralSg.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsParametroGeneralSg.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsParametroGeneralSg.gridy = iYPanelCamposParametroGeneralSg;
	this.gridBagConstraintsParametroGeneralSg.gridx = iXPanelCamposParametroGeneralSg++;
	this.gridBagConstraintsParametroGeneralSg.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsParametroGeneralSg.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposParametroGeneralSg.add(this.jPanelnombre_empresaParametroGeneralSg, this.gridBagConstraintsParametroGeneralSg);



	if(iXPanelCamposParametroGeneralSg % 1==0) {
		iXPanelCamposParametroGeneralSg=0;
		iYPanelCamposParametroGeneralSg++;
	}
	this.gridBagConstraintsParametroGeneralSg = new GridBagConstraints();
	this.gridBagConstraintsParametroGeneralSg.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsParametroGeneralSg.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsParametroGeneralSg.gridy = iYPanelCamposParametroGeneralSg;
	this.gridBagConstraintsParametroGeneralSg.gridx = iXPanelCamposParametroGeneralSg++;
	this.gridBagConstraintsParametroGeneralSg.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsParametroGeneralSg.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposParametroGeneralSg.add(this.jPanelversion_sistemaParametroGeneralSg, this.gridBagConstraintsParametroGeneralSg);



	if(iXPanelCamposParametroGeneralSg % 1==0) {
		iXPanelCamposParametroGeneralSg=0;
		iYPanelCamposParametroGeneralSg++;
	}
	this.gridBagConstraintsParametroGeneralSg = new GridBagConstraints();
	this.gridBagConstraintsParametroGeneralSg.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsParametroGeneralSg.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsParametroGeneralSg.gridy = iYPanelCamposParametroGeneralSg;
	this.gridBagConstraintsParametroGeneralSg.gridx = iXPanelCamposParametroGeneralSg++;
	this.gridBagConstraintsParametroGeneralSg.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsParametroGeneralSg.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposParametroGeneralSg.add(this.jPanelsiglas_sistemaParametroGeneralSg, this.gridBagConstraintsParametroGeneralSg);



	if(iXPanelCamposParametroGeneralSg % 1==0) {
		iXPanelCamposParametroGeneralSg=0;
		iYPanelCamposParametroGeneralSg++;
	}
	this.gridBagConstraintsParametroGeneralSg = new GridBagConstraints();
	this.gridBagConstraintsParametroGeneralSg.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsParametroGeneralSg.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsParametroGeneralSg.gridy = iYPanelCamposParametroGeneralSg;
	this.gridBagConstraintsParametroGeneralSg.gridx = iXPanelCamposParametroGeneralSg++;
	this.gridBagConstraintsParametroGeneralSg.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsParametroGeneralSg.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposParametroGeneralSg.add(this.jPanelmail_sistemaParametroGeneralSg, this.gridBagConstraintsParametroGeneralSg);



	if(iXPanelCamposParametroGeneralSg % 1==0) {
		iXPanelCamposParametroGeneralSg=0;
		iYPanelCamposParametroGeneralSg++;
	}
	this.gridBagConstraintsParametroGeneralSg = new GridBagConstraints();
	this.gridBagConstraintsParametroGeneralSg.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsParametroGeneralSg.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsParametroGeneralSg.gridy = iYPanelCamposParametroGeneralSg;
	this.gridBagConstraintsParametroGeneralSg.gridx = iXPanelCamposParametroGeneralSg++;
	this.gridBagConstraintsParametroGeneralSg.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsParametroGeneralSg.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposParametroGeneralSg.add(this.jPaneltelefono_sistemaParametroGeneralSg, this.gridBagConstraintsParametroGeneralSg);



	if(iXPanelCamposParametroGeneralSg % 1==0) {
		iXPanelCamposParametroGeneralSg=0;
		iYPanelCamposParametroGeneralSg++;
	}
	this.gridBagConstraintsParametroGeneralSg = new GridBagConstraints();
	this.gridBagConstraintsParametroGeneralSg.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsParametroGeneralSg.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsParametroGeneralSg.gridy = iYPanelCamposParametroGeneralSg;
	this.gridBagConstraintsParametroGeneralSg.gridx = iXPanelCamposParametroGeneralSg++;
	this.gridBagConstraintsParametroGeneralSg.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsParametroGeneralSg.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposParametroGeneralSg.add(this.jPanelfax_sistemaParametroGeneralSg, this.gridBagConstraintsParametroGeneralSg);



	if(iXPanelCamposParametroGeneralSg % 1==0) {
		iXPanelCamposParametroGeneralSg=0;
		iYPanelCamposParametroGeneralSg++;
	}
	this.gridBagConstraintsParametroGeneralSg = new GridBagConstraints();
	this.gridBagConstraintsParametroGeneralSg.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsParametroGeneralSg.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsParametroGeneralSg.gridy = iYPanelCamposParametroGeneralSg;
	this.gridBagConstraintsParametroGeneralSg.gridx = iXPanelCamposParametroGeneralSg++;
	this.gridBagConstraintsParametroGeneralSg.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsParametroGeneralSg.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposParametroGeneralSg.add(this.jPanelrepresentante_nombreParametroGeneralSg, this.gridBagConstraintsParametroGeneralSg);



	if(iXPanelCamposParametroGeneralSg % 1==0) {
		iXPanelCamposParametroGeneralSg=0;
		iYPanelCamposParametroGeneralSg++;
	}
	this.gridBagConstraintsParametroGeneralSg = new GridBagConstraints();
	this.gridBagConstraintsParametroGeneralSg.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsParametroGeneralSg.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsParametroGeneralSg.gridy = iYPanelCamposParametroGeneralSg;
	this.gridBagConstraintsParametroGeneralSg.gridx = iXPanelCamposParametroGeneralSg++;
	this.gridBagConstraintsParametroGeneralSg.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsParametroGeneralSg.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposParametroGeneralSg.add(this.jPanelcodigo_proceso_actualizacionParametroGeneralSg, this.gridBagConstraintsParametroGeneralSg);



	if(iXPanelCamposParametroGeneralSg % 1==0) {
		iXPanelCamposParametroGeneralSg=0;
		iYPanelCamposParametroGeneralSg++;
	}
	this.gridBagConstraintsParametroGeneralSg = new GridBagConstraints();
	this.gridBagConstraintsParametroGeneralSg.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsParametroGeneralSg.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsParametroGeneralSg.gridy = iYPanelCamposParametroGeneralSg;
	this.gridBagConstraintsParametroGeneralSg.gridx = iXPanelCamposParametroGeneralSg++;
	this.gridBagConstraintsParametroGeneralSg.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsParametroGeneralSg.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposParametroGeneralSg.add(this.jPanelesta_activoParametroGeneralSg, this.gridBagConstraintsParametroGeneralSg);



	if(iXPanelCamposParametroGeneralSg % 1==0) {
		iXPanelCamposParametroGeneralSg=0;
		iYPanelCamposParametroGeneralSg++;
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
			
		GridBagLayout gridaBagLayoutAccionesParametroGeneralSg= new GridBagLayout();
		this.jPanelAccionesParametroGeneralSg.setLayout(gridaBagLayoutAccionesParametroGeneralSg);
		
		GridBagLayout gridaBagLayoutAccionesFormularioParametroGeneralSg= new GridBagLayout();
		this.jPanelAccionesFormularioParametroGeneralSg.setLayout(gridaBagLayoutAccionesFormularioParametroGeneralSg);
		
		this.gridBagConstraintsParametroGeneralSg = new GridBagConstraints();
		this.gridBagConstraintsParametroGeneralSg.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsParametroGeneralSg.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioParametroGeneralSg.add(this.jComboBoxTiposAccionesFormularioParametroGeneralSg, this.gridBagConstraintsParametroGeneralSg);

		this.gridBagConstraintsParametroGeneralSg = new GridBagConstraints();
		this.gridBagConstraintsParametroGeneralSg.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsParametroGeneralSg.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioParametroGeneralSg.add(this.jCheckBoxPostAccionNuevoParametroGeneralSg, this.gridBagConstraintsParametroGeneralSg);
			
		//DEBE CERRARSE Y ACTUALIZARSE TODO NUEVAMENTE, SI ES RELACIONADO PUEDE FUNCIONAR
		//if(!this.parametrogeneralsgSessionBean.getEstaModoGuardarRelaciones()) {		
		//SE ARRIESGA
		//if(!this.conFuncionalidadRelaciones) {		
			this.gridBagConstraintsParametroGeneralSg = new GridBagConstraints();
			this.gridBagConstraintsParametroGeneralSg.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsParametroGeneralSg.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioParametroGeneralSg.add(this.jCheckBoxPostAccionSinCerrarParametroGeneralSg, this.gridBagConstraintsParametroGeneralSg);
		//}
		
		
		//NO TIENE MENSAJE POR DEFINICION, O ES MUY COMPLEJO LA PANTALLA PARA HACERLO MAS COMPLICADO
		if(!this.parametrogeneralsgSessionBean.getEsGuardarRelacionado()
			){				
			//&& !this.parametrogeneralsgSessionBean.getEstaModoGuardarRelaciones()) {
							
			this.gridBagConstraintsParametroGeneralSg = new GridBagConstraints();
			this.gridBagConstraintsParametroGeneralSg.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsParametroGeneralSg.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioParametroGeneralSg.add(this.jCheckBoxPostAccionSinMensajeParametroGeneralSg, this.gridBagConstraintsParametroGeneralSg);
		}
		
		
		int iPosXAccion=0;
		
		this.gridBagConstraintsParametroGeneralSg = new GridBagConstraints();
		this.gridBagConstraintsParametroGeneralSg.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsParametroGeneralSg.gridy = 0;
		this.gridBagConstraintsParametroGeneralSg.gridx = iPosXAccion++;
			
		this.jPanelAccionesParametroGeneralSg.add(this.jButtonModificarParametroGeneralSg, this.gridBagConstraintsParametroGeneralSg);							

		this.gridBagConstraintsParametroGeneralSg = new GridBagConstraints();
		this.gridBagConstraintsParametroGeneralSg.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsParametroGeneralSg.gridy = 0;
		this.gridBagConstraintsParametroGeneralSg.gridx =iPosXAccion++;
			
		this.jPanelAccionesParametroGeneralSg.add(this.jButtonEliminarParametroGeneralSg, this.gridBagConstraintsParametroGeneralSg);
		
			
		this.gridBagConstraintsParametroGeneralSg = new GridBagConstraints();
		this.gridBagConstraintsParametroGeneralSg.gridy = 0;		
		this.gridBagConstraintsParametroGeneralSg.gridx = iPosXAccion++;
		
		this.jPanelAccionesParametroGeneralSg.add(this.jButtonActualizarParametroGeneralSg, this.gridBagConstraintsParametroGeneralSg);


		this.gridBagConstraintsParametroGeneralSg = new GridBagConstraints();
		this.gridBagConstraintsParametroGeneralSg.gridy = 0;		
		this.gridBagConstraintsParametroGeneralSg.gridx = iPosXAccion++;
		
		this.jPanelAccionesParametroGeneralSg.add(this.jButtonGuardarCambiosParametroGeneralSg, this.gridBagConstraintsParametroGeneralSg);	
		
		this.gridBagConstraintsParametroGeneralSg = new GridBagConstraints();
		this.gridBagConstraintsParametroGeneralSg.gridy = 0;		
		this.gridBagConstraintsParametroGeneralSg.gridx =iPosXAccion++;
		
		this.jPanelAccionesParametroGeneralSg.add(this.jButtonCancelarParametroGeneralSg, this.gridBagConstraintsParametroGeneralSg);
		
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutParametroGeneralSg = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutParametroGeneralSg);
		
		if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.parametrogeneralsgSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsParametroGeneralSg = new GridBagConstraints();						
			this.gridBagConstraintsParametroGeneralSg.gridy = iGridyPrincipal++;
			this.gridBagConstraintsParametroGeneralSg.gridx = 0;		
			//this.gridBagConstraintsParametroGeneralSg.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsParametroGeneralSg.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsParametroGeneralSg.ipadx = 100;
				
			
		}
		
		//PROCESANDO EN OTRA PANTALLA
		
		
		int iGridxBusquedasParametros=0;
		
	
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			//NO BUSQUEDA
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		
		this.gridBagConstraintsParametroGeneralSg = new GridBagConstraints();
		this.gridBagConstraintsParametroGeneralSg.gridy =iGridyPrincipal++;
		this.gridBagConstraintsParametroGeneralSg.gridx =0;
		this.gridBagConstraintsParametroGeneralSg.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsParametroGeneralSg.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosParametroGeneralSg, this.gridBagConstraintsParametroGeneralSg);
				
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);

		
			
		//if(ParametroGeneralSgJInternalFrame.CON_DATOS_FRAME) {				
			//this.jInternalFrameDetalleParametroGeneralSg = new ParametroGeneralSgBeanSwingJInternalFrameAdditional();//JInternalFrameBase("Parametro General DATOS");
			
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
			
	        //this.setTitle("[FOR] - Parametro General DATOS");
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Parametro General Formulario",PaginaTipo.FORMULARIO,paginaTipo));			
	        this.setSize(iWidthFormulario,iHeightFormulario);        
		   				
			this.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	        this.setResizable(true);
	        this.setClosable(true);
	        this.setMaximizable(true);
		    
			ParametroGeneralSgModel parametrogeneralsgModel=new ParametroGeneralSgModel(this);
			
			//SI USARA CLASE INTERNA
			//ParametroGeneralSgModel.ParametroGeneralSgFocusTraversalPolicy parametrogeneralsgFocusTraversalPolicy = parametrogeneralsgModel.new ParametroGeneralSgFocusTraversalPolicy(this);
			
			//parametrogeneralsgFocusTraversalPolicy.setparametrogeneralsgJInternalFrame(this);
			
			this.setFocusTraversalPolicy(parametrogeneralsgModel);
			
			
			this.jContentPaneDetalleParametroGeneralSg = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			GridBagLayout gridaBagLayoutDetalleParametroGeneralSg = new GridBagLayout();	
			this.jContentPaneDetalleParametroGeneralSg.setLayout(gridaBagLayoutDetalleParametroGeneralSg);
			
			GridBagLayout gridaBagLayoutBusquedasParametrosParametroGeneralSg = new GridBagLayout();
			
			
if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
				
				//AGREGA TOOLBAR DETALLE A PANTALLA
				
				this.gridBagConstraintsParametroGeneralSg = new GridBagConstraints();
				this.gridBagConstraintsParametroGeneralSg.gridy = iGridyRelaciones++;		
				this.gridBagConstraintsParametroGeneralSg.gridx = 0;
					
				
				this.jContentPaneDetalleParametroGeneralSg.add(jTtoolBarDetalleParametroGeneralSg, gridBagConstraintsParametroGeneralSg);								
				
}
			
			this.jScrollPanelDatosEdicionParametroGeneralSg=   new JScrollPane(jContentPaneDetalleParametroGeneralSg,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionParametroGeneralSg.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionParametroGeneralSg.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionParametroGeneralSg.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			this.jScrollPanelDatosGeneralParametroGeneralSg=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralParametroGeneralSg.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralParametroGeneralSg.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralParametroGeneralSg.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsParametroGeneralSg = new GridBagConstraints();
			
			
	        this.gridBagConstraintsParametroGeneralSg.gridy = iGridyRelaciones++;		
	        this.gridBagConstraintsParametroGeneralSg.gridx = 0;
	        
			this.jContentPaneDetalleParametroGeneralSg.add(jPanelCamposParametroGeneralSg, gridBagConstraintsParametroGeneralSg);
			
			
			
			
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
						&& parametrogeneralsgSessionBean.getConGuardarRelaciones()
						) {
					
					if(this.parametrogeneralsgSessionBean.getConGuardarRelaciones()) {
						this.gridBagConstraintsParametroGeneralSg= new GridBagConstraints();
						this.gridBagConstraintsParametroGeneralSg.gridy = iGridyRelaciones++;
						this.gridBagConstraintsParametroGeneralSg.gridx = 0;
						this.jContentPaneDetalleParametroGeneralSg.add(this.jTabbedPaneRelacionesParametroGeneralSg, this.gridBagConstraintsParametroGeneralSg);
					}
					
					//RELACIONES OTROS AGRUPADOS
					;
					
					} else {
						//this.jButtonNuevoRelacionesParametroGeneralSg.setVisible(false);
					}
				}
			}
			
			Boolean tieneColumnasOcultas=false;
			
		
						
			
			if(!Constantes.ISDEVELOPING) {
	       		this.jPanelCamposOcultosParametroGeneralSg.setVisible(false);
			} else {
				if(tieneColumnasOcultas) {
					this.gridBagConstraintsParametroGeneralSg = new GridBagConstraints();
					this.gridBagConstraintsParametroGeneralSg.fill=GridBagConstraints.NONE;
					this.gridBagConstraintsParametroGeneralSg.anchor = GridBagConstraints.WEST;
					
					this.gridBagConstraintsParametroGeneralSg.gridy = iGridyRelaciones++;		
					this.gridBagConstraintsParametroGeneralSg.gridx = 0;
					
				
					this.jContentPaneDetalleParametroGeneralSg.add(jPanelCamposOcultosParametroGeneralSg, gridBagConstraintsParametroGeneralSg);
				
					this.jPanelCamposOcultosParametroGeneralSg.setVisible(true);
				}
			}					
			
			
			
			
			this.gridBagConstraintsParametroGeneralSg = new GridBagConstraints();
			this.gridBagConstraintsParametroGeneralSg.gridy = iGridyRelaciones++;//1;		
	        this.gridBagConstraintsParametroGeneralSg.gridx = 0;
	        this.gridBagConstraintsParametroGeneralSg.anchor = GridBagConstraints.CENTER;//WEST;
			
			
			
			this.jContentPaneDetalleParametroGeneralSg.add(this.jPanelAccionesFormularioParametroGeneralSg, this.gridBagConstraintsParametroGeneralSg);							
			
			
			
			this.gridBagConstraintsParametroGeneralSg = new GridBagConstraints();
	        this.gridBagConstraintsParametroGeneralSg.gridy = iGridyRelaciones;//1;		
	        this.gridBagConstraintsParametroGeneralSg.gridx = 0;
	        
			
			this.jContentPaneDetalleParametroGeneralSg.add(this.jPanelAccionesParametroGeneralSg, this.gridBagConstraintsParametroGeneralSg);							
			
	        //this.setContentPane(jScrollPanelDatosEdicionParametroGeneralSg);
			
		//} else {
			//DISENO_DETALLE COMENTAR Y
			//DISENO_DETALLE(Solo Descomentar Seccion Inferior)
			//NOTA-DISENO_DETALLE(Si cambia lo de abajo, cambiar lo comentado, Al final no es lo mismo)
			
			/*
			this.jScrollPanelDatosEdicionParametroGeneralSg=   new JScrollPane(this.jPanelCamposParametroGeneralSg,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionParametroGeneralSg.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionParametroGeneralSg.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionParametroGeneralSg.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			
			this.gridBagConstraintsParametroGeneralSg = new GridBagConstraints();
			this.gridBagConstraintsParametroGeneralSg.gridy = iGridyPrincipal++;		
			this.gridBagConstraintsParametroGeneralSg.gridx = 0;
			this.gridBagConstraintsParametroGeneralSg.fill = GridBagConstraints.BOTH;
			this.gridBagConstraintsParametroGeneralSg.ipady = this.getSize().height-yOffset*3;
			this.gridBagConstraintsParametroGeneralSg.anchor = GridBagConstraints.WEST;
			
			this.jContentPane.add(this.jScrollPanelDatosEdicionParametroGeneralSg, this.gridBagConstraintsParametroGeneralSg);
			
			//ACCIONES FORMULARIO
			this.gridBagConstraintsParametroGeneralSg = new GridBagConstraints();
			this.gridBagConstraintsParametroGeneralSg.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsParametroGeneralSg.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesFormularioParametroGeneralSg, this.gridBagConstraintsParametroGeneralSg);			
			
			this.gridBagConstraintsParametroGeneralSg = new GridBagConstraints();
			this.gridBagConstraintsParametroGeneralSg.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsParametroGeneralSg.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesParametroGeneralSg, this.gridBagConstraintsParametroGeneralSg);									
			*/
		//}								
			
		//DISENO_DETALLE-(Descomentar)
		/*
		this.gridBagConstraintsParametroGeneralSg = new GridBagConstraints();
		this.gridBagConstraintsParametroGeneralSg.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsParametroGeneralSg.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposParametroGeneralSg, this.gridBagConstraintsParametroGeneralSg);
			
			
		this.gridBagConstraintsParametroGeneralSg = new GridBagConstraints();
		this.gridBagConstraintsParametroGeneralSg.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsParametroGeneralSg.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosParametroGeneralSg, this.gridBagConstraintsParametroGeneralSg);
		
			
		this.gridBagConstraintsParametroGeneralSg = new GridBagConstraints();
		this.gridBagConstraintsParametroGeneralSg.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsParametroGeneralSg.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesParametroGeneralSg, this.gridBagConstraintsParametroGeneralSg);
		*/
		
			
     	//pack();
		
		
		//return this.jScrollPanelDatosGeneralParametroGeneralSg;//jContentPane;
		
		return jScrollPanelDatosEdicionParametroGeneralSg;
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
