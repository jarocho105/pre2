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




import com.bydan.erp.seguridad.business.entity.Usuario;
import com.bydan.erp.seguridad.business.entity.ResumenUsuario;
import com.bydan.erp.seguridad.business.entity.Opcion;
import com.bydan.erp.seguridad.business.entity.PerfilOpcion;
import com.bydan.erp.seguridad.business.entity.PerfilCampo;
import com.bydan.erp.seguridad.business.entity.PerfilAccion;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralSg;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralUsuario;
import com.bydan.erp.seguridad.business.entity.Modulo;
import com.bydan.erp.seguridad.business.entity.Accion;

import com.bydan.erp.seguridad.util.SistemaParameterReturnGeneralAdditional;
import com.bydan.erp.seguridad.util.SistemaParameterReturnGeneral;


//import com.bydan.erp.seguridad.business.entity.PerfilAccion;


import com.bydan.erp.seguridad.util.SistemaConstantesFunciones;
import com.bydan.erp.seguridad.util.SistemaConstantesFuncionesAdditional;
import com.bydan.erp.seguridad.business.logic.SistemaLogicAdditional;

import com.bydan.erp.contabilidad.util.TipoTributarioConstantesFunciones;
import com.bydan.erp.contabilidad.util.TipoTributarioParameterReturnGeneral;
//import com.bydan.erp.contabilidad.util.TipoTributarioParameterGeneral;
//import com.bydan.erp.contabilidad.presentation.report.source.TipoTributarioBean;
import com.bydan.framework.erp.business.dataaccess.ConstantesSql;
import com.bydan.framework.erp.business.entity.Classe;
import com.bydan.framework.erp.business.entity.DatoGeneral;
import com.bydan.framework.erp.business.entity.GeneralEntityParameterGeneral;
import com.bydan.framework.erp.business.entity.OrderBy;
import com.bydan.framework.erp.business.entity.DatoGeneralMinimo;
import com.bydan.framework.erp.business.entity.GeneralEntity;
import com.bydan.framework.erp.business.entity.Mensajes;
import com.bydan.framework.erp.business.entity.GeneralEntityParameterReturnGeneral;
//import com.bydan.framework.erp.business.entity.MaintenanceType;
import com.bydan.framework.erp.util.MaintenanceType;
import com.bydan.framework.erp.util.FuncionesReporte;
import com.bydan.framework.erp.business.logic.DatosCliente;
import com.bydan.framework.erp.business.logic.Pagination;

import com.bydan.erp.contabilidad.presentation.swing.jinternalframes.auxiliar.*;
import com.bydan.framework.erp.presentation.desktop.swing.TablaGeneralTotalModel;
import com.bydan.framework.erp.presentation.desktop.swing.TablaGeneralOrderByModel;
import com.bydan.framework.erp.presentation.desktop.swing.DateConverter;
import com.bydan.framework.erp.presentation.desktop.swing.DateConverterFromDate;
import com.bydan.framework.erp.presentation.desktop.swing.DateRenderer;
import com.bydan.framework.erp.presentation.desktop.swing.DateEditorRenderer;
import com.bydan.framework.erp.presentation.desktop.swing.BooleanRenderer;
import com.bydan.framework.erp.presentation.desktop.swing.BooleanEditorRenderer;
import com.bydan.framework.erp.presentation.desktop.swing.TextFieldRenderer;
import com.bydan.framework.erp.presentation.desktop.swing.RunnableProceso;
import com.bydan.framework.erp.presentation.desktop.swing.*;
//import com.bydan.framework.erp.presentation.desktop.swing.TextFieldEditorRenderer;
import com.bydan.framework.erp.presentation.desktop.swing.HeaderRenderer;
import com.bydan.framework.erp.presentation.desktop.swing.JInternalFrameBase;
import com.bydan.framework.erp.presentation.desktop.swing.FuncionesSwing;
import com.bydan.framework.erp.presentation.desktop.swing.MainJFrame;
import com.bydan.framework.erp.resources.imagenes.AuxiliarImagenes;
import com.bydan.erp.contabilidad.resources.reportes.AuxiliarReportes;


import com.bydan.erp.contabilidad.util.*;
import com.bydan.erp.contabilidad.business.logic.*;

import com.bydan.erp.seguridad.business.logic.*;
import com.bydan.erp.sris.business.logic.*;
import com.bydan.erp.facturacion.business.logic.*;
import com.bydan.erp.tesoreria.business.logic.*;
import com.bydan.erp.cartera.business.logic.*;
import com.bydan.erp.nomina.business.logic.*;
import com.bydan.erp.inventario.business.logic.*;

//EJB

//PARAMETROS


//EJB PARAMETROS

import com.bydan.framework.erp.business.logic.*;
import com.bydan.framework.erp.util.*;

import com.bydan.erp.contabilidad.business.entity.*;
//import com.bydan.framework.erp.business.entity.ConexionBeanFace;
//import com.bydan.framework.erp.business.entity.Mensajes;


import com.bydan.erp.seguridad.presentation.swing.jinternalframes.*;
import com.bydan.erp.sris.presentation.swing.jinternalframes.*;
import com.bydan.erp.facturacion.presentation.swing.jinternalframes.*;
import com.bydan.erp.tesoreria.presentation.swing.jinternalframes.*;
import com.bydan.erp.cartera.presentation.swing.jinternalframes.*;
import com.bydan.erp.nomina.presentation.swing.jinternalframes.*;
import com.bydan.erp.inventario.presentation.swing.jinternalframes.*;

import com.bydan.erp.seguridad.presentation.swing.jinternalframes.auxiliar.*;
import com.bydan.erp.sris.presentation.swing.jinternalframes.auxiliar.*;
import com.bydan.erp.facturacion.presentation.swing.jinternalframes.auxiliar.*;
import com.bydan.erp.tesoreria.presentation.swing.jinternalframes.auxiliar.*;
import com.bydan.erp.cartera.presentation.swing.jinternalframes.auxiliar.*;
import com.bydan.erp.nomina.presentation.swing.jinternalframes.auxiliar.*;
import com.bydan.erp.inventario.presentation.swing.jinternalframes.auxiliar.*;






import javax.imageio.ImageIO;
import java.net.NetworkInterface;
import java.net.InterfaceAddress;
import java.net.InetAddress;
import javax.naming.InitialContext;
import java.lang.Long;
import java.util.Date;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.Set;
import java.util.HashSet;
import java.util.List;
import java.util.ArrayList;
import java.io.Serializable;
import java.util.Hashtable;
import java.util.Collections;
import java.io.File;
import java.io.FileInputStream;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.BufferedReader;
import java.io.FileReader;
import java.util.HashMap;
import java.util.Map;
import java.io.PrintWriter;
import java.sql.SQLException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.stream.StreamSource;

import org.xml.sax.EntityResolver;
import org.xml.sax.InputSource;
import org.xml.sax.SAXException;

import org.w3c.dom.Document;
import org.w3c.dom.Document;
import org.w3c.dom.NodeList;
import org.w3c.dom.Node;
import org.w3c.dom.Element;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.poi.ss.usermodel.IndexedColors;
import org.apache.poi.ss.util.CellRangeAddress;

import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;


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
import net.sf.jasperreports.engine.data.JRBeanCollectionDataSource;
import net.sf.jasperreports.view.JasperViewer;

import org.apache.log4j.Logger;

import com.bydan.framework.erp.business.entity.Reporte;


//VALIDACION
import org.hibernate.validator.ClassValidator;
import org.hibernate.validator.InvalidValue;

import net.sf.jasperreports.engine.JREmptyDataSource;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperExportManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperPrintManager;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.JasperRunManager;
import net.sf.jasperreports.engine.export.JExcelApiExporter;
import net.sf.jasperreports.engine.export.JRCsvExporter;
import net.sf.jasperreports.engine.export.JRRtfExporter;
import net.sf.jasperreports.engine.export.JRXlsExporter;
import net.sf.jasperreports.engine.export.JRXlsExporterParameter;
import net.sf.jasperreports.engine.util.JRSaver;
import net.sf.jasperreports.engine.xml.JRXmlWriter;


import com.bydan.erp.contabilidad.presentation.web.jsf.sessionbean.*;

import java.util.EventObject;
import javax.swing.*;
import javax.swing.border.Border;
import javax.swing.border.TitledBorder;
import javax.swing.border.EmptyBorder;
import javax.swing.event.*;
import javax.swing.table.AbstractTableModel;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.TableColumn;
import javax.swing.table.TableCellEditor;
import javax.swing.table.TableCellRenderer;
import java.awt.*;
import java.awt.event.*;

import org.jdesktop.beansbinding.Binding.SyncFailure;
import org.jdesktop.beansbinding.BindingListener;
import org.jdesktop.beansbinding.Bindings;
import org.jdesktop.beansbinding.BeanProperty;
import org.jdesktop.beansbinding.ELProperty;
import org.jdesktop.beansbinding.AutoBinding.UpdateStrategy;
import org.jdesktop.beansbinding.PropertyStateEvent;
import org.jdesktop.swingbinding.JComboBoxBinding;
import org.jdesktop.swingbinding.SwingBindings;
import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeEvent;

import com.toedter.calendar.JDateChooser;


import com.bydan.erp.seguridad.business.entity.*;
import com.bydan.erp.sris.business.entity.*;
import com.bydan.erp.facturacion.business.entity.*;
import com.bydan.erp.tesoreria.business.entity.*;
import com.bydan.erp.cartera.business.entity.*;
import com.bydan.erp.nomina.business.entity.*;
import com.bydan.erp.inventario.business.entity.*;
import com.bydan.erp.seguridad.util.*;
import com.bydan.erp.sris.util.*;
import com.bydan.erp.facturacion.util.*;
import com.bydan.erp.tesoreria.util.*;
import com.bydan.erp.cartera.util.*;
import com.bydan.erp.nomina.util.*;
import com.bydan.erp.inventario.util.*;
import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.sris.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.facturacion.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.tesoreria.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.cartera.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.nomina.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.inventario.presentation.web.jsf.sessionbean.*;


@SuppressWarnings("unused")
public class TipoTributarioBeanSwingJInternalFrame extends TipoTributarioJInternalFrame implements WindowListener,WindowFocusListener
{				
	
	public static final long serialVersionUID = 1L;
	
	public static Logger logger = Logger.getLogger(TipoTributarioBeanSwingJInternalFrame.class);  
	
	public static ClassValidator<TipoTributario> tipotributarioValidator = new ClassValidator<TipoTributario>(TipoTributario.class);
	
	public InvalidValue[] invalidValues=null;
		

	//Ejb Foreign Keys
	
	public TipoTributario tipotributario;	
	public TipoTributario tipotributarioAux;
	public TipoTributario tipotributarioAnterior;//USADO PARA MANEJAR FOCUS GAINED,LOST
	public TipoTributario tipotributarioTotales;
	public Long idTipoTributarioActual;
	public Long iIdNuevoTipoTributario=0L;
	public int rowIndexActual=0;
	
	
	
	
	public String sFinalQueryComboPais="";

	public List<Pais> paissForeignKey;

	public List<Pais> getpaissForeignKey() {
		return paissForeignKey;
	}

	public void setpaissForeignKey(List<Pais> paissForeignKey) {
		this.paissForeignKey = paissForeignKey;
	}

	//OBJETO FK ACTUAL
	public Pais paisForeignKey;

	public Pais getpaisForeignKey() {
		return paisForeignKey;
	}

	public void setpaisForeignKey(Pais paisForeignKey) {
		this.paisForeignKey = paisForeignKey;
	}

		
	
	
	
	
	

	public Boolean isTienePermisosTransaccionLocal=false;

	public Boolean getIsTienePermisosTransaccionLocal() {
		return isTienePermisosTransaccionLocal;
	}

	public void setIsTienePermisosTransaccionLocal(Boolean isTienePermisosTransaccionLocal) {
		this.isTienePermisosTransaccionLocal= isTienePermisosTransaccionLocal;
	}


	public Boolean isTienePermisosFacturaProveedorServicio=false;

	public Boolean getIsTienePermisosFacturaProveedorServicio() {
		return isTienePermisosFacturaProveedorServicio;
	}

	public void setIsTienePermisosFacturaProveedorServicio(Boolean isTienePermisosFacturaProveedorServicio) {
		this.isTienePermisosFacturaProveedorServicio= isTienePermisosFacturaProveedorServicio;
	}


	public Boolean isTienePermisosDefinicion=false;

	public Boolean getIsTienePermisosDefinicion() {
		return isTienePermisosDefinicion;
	}

	public void setIsTienePermisosDefinicion(Boolean isTienePermisosDefinicion) {
		this.isTienePermisosDefinicion= isTienePermisosDefinicion;
	}

	
	
	//FALTA:PARA BUSQUEDAS POR CAMPO EN FORMULARIO
	public String sFinalQueryGeneral="";
	public Boolean isEntroOnLoad=false;
	public Boolean isErrorGuardar=false;
	
	public Boolean isGuardarCambiosEnLote=false;
	public Boolean isCargarCombosDependencia=false;
	public Boolean isSeleccionarTodos=false;
	public Boolean isSeleccionados=false;
	public Boolean conGraficoReporte=false;
	
	public Boolean isPostAccionNuevo=false;
	public Boolean isPostAccionSinCerrar=false;
	public Boolean isPostAccionSinMensaje=false;
	
	
	public Boolean esControlTabla=false;
	
	public Boolean isPermisoTodoTipoTributario;
	public Boolean isPermisoNuevoTipoTributario;
	public Boolean isPermisoActualizarTipoTributario;
	public Boolean isPermisoActualizarOriginalTipoTributario;
	public Boolean isPermisoEliminarTipoTributario;
	public Boolean isPermisoGuardarCambiosTipoTributario;
	public Boolean isPermisoConsultaTipoTributario;
	public Boolean isPermisoBusquedaTipoTributario;
	public Boolean isPermisoReporteTipoTributario;
	public Boolean isPermisoPaginacionMedioTipoTributario;
	public Boolean isPermisoPaginacionAltoTipoTributario;
	public Boolean isPermisoPaginacionTodoTipoTributario;
	public Boolean isPermisoCopiarTipoTributario;
	public Boolean isPermisoVerFormTipoTributario;
	public Boolean isPermisoDuplicarTipoTributario;
	public Boolean isPermisoOrdenTipoTributario;
	
	
	public ArrayList<DatoGeneral> arrDatoGeneral;
	public ArrayList<String> arrDatoGeneralNo;
	ArrayList<Classe> classesActual=new ArrayList<Classe>();
	
	public List<Accion> accions;	
	public List<Accion> accionsFormulario;
	
	
	public ArrayList<DatoGeneralMinimo> arrDatoGeneralMinimos;
	
	public ArrayList<Reporte> tiposArchivosReportes;
	public ArrayList<Reporte> tiposArchivosReportesDinamico;
	public ArrayList<Reporte> tiposReportes;
	public ArrayList<Reporte> tiposReportesDinamico;
	public ArrayList<Reporte> tiposGraficosReportes;
	public ArrayList<Reporte> tiposPaginacion;
	public ArrayList<Reporte> tiposRelaciones;
	public ArrayList<Reporte> tiposAcciones;
	public ArrayList<Reporte> tiposAccionesFormulario;
	public ArrayList<Reporte> tiposSeleccionar;
	
	public ArrayList<Reporte> tiposColumnasSelect;
	public ArrayList<Reporte> tiposRelacionesSelect;
	
	
	public Integer iNumeroPaginacion;
	public Integer iNumeroPaginacionPagina;
	public Pagination pagination;
	public DatosCliente datosCliente;
	public DatosDeep datosDeep;
	public String sTipoArchivoReporte="";
	public String sTipoArchivoReporteDinamico="";
	public String sTipoReporte="";
	public String sTipoReporteDinamico="";
	public String sTipoGraficoReporte="";
	public String sTipoPaginacion="";
	public String sTipoRelacion="";
	public String sTipoAccion="";
	public String sTipoAccionFormulario="";
	public String sTipoSeleccionar="";	
	public String sDetalleReporte="";
	public Boolean isMostrarNumeroPaginacion;
	public String sTipoReporteExtra="";
	public String sValorCampoGeneral="";
	public Boolean esReporteDinamico=false;
	public Boolean esReporteAccionProceso=false;
	public Boolean esRecargarFks=false;
	public String sPathReporteDinamico="";
	
	public TipoTributarioParameterReturnGeneral tipotributarioReturnGeneral;
	public TipoTributarioParameterReturnGeneral tipotributarioParameterGeneral;
	
	

	public TransaccionLocalLogic transaccionlocalLogic=null;

	public TransaccionLocalLogic getTransaccionLocalLogic() {
		return transaccionlocalLogic;
	}

	public void setTransaccionLocalLogic(TransaccionLocalLogic transaccionlocalLogic) {
		this.transaccionlocalLogic = transaccionlocalLogic;
	}


	public FacturaProveedorServicioLogic facturaproveedorservicioLogic=null;

	public FacturaProveedorServicioLogic getFacturaProveedorServicioLogic() {
		return facturaproveedorservicioLogic;
	}

	public void setFacturaProveedorServicioLogic(FacturaProveedorServicioLogic facturaproveedorservicioLogic) {
		this.facturaproveedorservicioLogic = facturaproveedorservicioLogic;
	}


	public DefinicionLogic definicionLogic=null;

	public DefinicionLogic getDefinicionLogic() {
		return definicionLogic;
	}

	public void setDefinicionLogic(DefinicionLogic definicionLogic) {
		this.definicionLogic = definicionLogic;
	}
 	
	public JasperPrint jasperPrint = null;
	
	public Long lIdUsuarioSesion=0L;				
	
	public Boolean isEsNuevoTipoTributario=false;
	public Boolean esParaAccionDesdeFormularioTipoTributario=false;
	public Boolean isEsMantenimientoRelacionesRelacionadoUnico=false;
	public Boolean isEsMantenimientoRelaciones=false;
	public Boolean isEsMantenimientoRelacionado=false;	
	public Boolean isContieneImagenes=false;
		
	//public Boolean conTotales=false; //Viene heredado de JInternalFrameBase
	//public Boolean esParaBusquedaForeignKey=false;
	
	
	protected TipoTributarioSessionBeanAdditional tipotributarioSessionBeanAdditional=null;
	
	public TipoTributarioSessionBeanAdditional getTipoTributarioSessionBeanAdditional() {
		return this.tipotributarioSessionBeanAdditional;
	}
	
	public void setTipoTributarioSessionBeanAdditional(TipoTributarioSessionBeanAdditional tipotributarioSessionBeanAdditional) {
		try {
			this.tipotributarioSessionBeanAdditional=tipotributarioSessionBeanAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	protected TipoTributarioBeanSwingJInternalFrameAdditional tipotributarioBeanSwingJInternalFrameAdditional=null;
	//public class TipoTributarioBeanSwingJInternalFrame
	
	public TipoTributarioBeanSwingJInternalFrameAdditional getTipoTributarioBeanSwingJInternalFrameAdditional() {
		return this.tipotributarioBeanSwingJInternalFrameAdditional;
	}
	
	public void setTipoTributarioBeanSwingJInternalFrameAdditional(TipoTributarioBeanSwingJInternalFrameAdditional tipotributarioBeanSwingJInternalFrameAdditional) {
		try {
			this.tipotributarioBeanSwingJInternalFrameAdditional=tipotributarioBeanSwingJInternalFrameAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	//ESTA EN PADRE
	
	//public TipoTributarioLogic tipotributarioLogic;
	public SistemaLogicAdditional sistemaLogicAdditional;
	
	
	public TipoTributario tipotributarioBean;
	public TipoTributarioConstantesFunciones tipotributarioConstantesFunciones;
	//public TipoTributarioParameterReturnGeneral tipotributarioReturnGeneral;
	
	//FK
	
	public PaisLogic paisLogic;
	
	//PARAMETROS
	
	
	//public List<TipoTributario> tipotributarios;	
	//public List<TipoTributario> tipotributariosEliminados;
	//public List<TipoTributario> tipotributariosAux;
	
	public String sAccionMantenimiento="";
	public String sAccionBusqueda="";
	public String sAccionAdicional="";
	public String sUltimaBusqueda="";
	
	public Mensaje mensaje;
	
	
	public String sVisibilidadTablaBusquedas="";					
	public String sVisibilidadTablaElementos="";	
	public String sVisibilidadTablaAcciones="";			
	
	public Boolean isVisibilidadCeldaNuevoTipoTributario=false;
	public Boolean isVisibilidadCeldaDuplicarTipoTributario=true;
	public Boolean isVisibilidadCeldaCopiarTipoTributario=true;
	public Boolean isVisibilidadCeldaVerFormTipoTributario=true;
	public Boolean isVisibilidadCeldaOrdenTipoTributario=true;
	public Boolean isVisibilidadCeldaNuevoRelacionesTipoTributario=false;
	public Boolean isVisibilidadCeldaModificarTipoTributario=false;
	public Boolean isVisibilidadCeldaActualizarTipoTributario=false;
	public Boolean isVisibilidadCeldaEliminarTipoTributario=false;
	public Boolean isVisibilidadCeldaCancelarTipoTributario=false;
	public Boolean isVisibilidadCeldaGuardarTipoTributario=false;	
	public Boolean isVisibilidadCeldaGuardarCambiosTipoTributario=false;	
	
	
	public Boolean isVisibilidadBusquedaPorCodigo=false;
	public Boolean isVisibilidadBusquedaPorId=false;
	public Boolean isVisibilidadBusquedaPorNombre=false;
	public Boolean isVisibilidadFK_IdPais=false;
	
	public Long getiIdNuevoTipoTributario() {
		return this.iIdNuevoTipoTributario;
	}

	public void setiIdNuevoTipoTributario(Long iIdNuevoTipoTributario) {
		this.iIdNuevoTipoTributario = iIdNuevoTipoTributario;
	}
	
	public Long getidTipoTributarioActual() {
		return this.idTipoTributarioActual;
	}

	public void setidTipoTributarioActual(Long idTipoTributarioActual) {
		this.idTipoTributarioActual = idTipoTributarioActual;
	}
	
	public int getrowIndexActual() {
		return this.rowIndexActual;
	}

	public void setrowIndexActual(int rowIndexActual) {
		this.rowIndexActual=rowIndexActual;
	}
	
	
	public TipoTributario gettipotributario() {
		return this.tipotributario;
	}

	public void settipotributario(TipoTributario tipotributario) {
		this.tipotributario = tipotributario;
	}
	
	public TipoTributario gettipotributarioAux() {
		return this.tipotributarioAux;
	}

	public void settipotributarioAux(TipoTributario tipotributarioAux) {
		this.tipotributarioAux = tipotributarioAux;
	}				
	
	public TipoTributario gettipotributarioAnterior() {
		return this.tipotributarioAnterior;
	}

	public void settipotributarioAnterior(TipoTributario tipotributarioAnterior) {
		this.tipotributarioAnterior = tipotributarioAnterior;
	}	
	
	public TipoTributario gettipotributarioTotales() {
		return this.tipotributarioTotales;
	}

	public void settipotributarioTotales(TipoTributario tipotributarioTotales) {
		this.tipotributarioTotales = tipotributarioTotales;
	}	
	
	public TipoTributario gettipotributarioBean() {
		return this.tipotributarioBean;
	}

	public void settipotributarioBean(TipoTributario tipotributarioBean) {
		this.tipotributarioBean = tipotributarioBean;
	}	
	
	public TipoTributarioParameterReturnGeneral gettipotributarioReturnGeneral() {
		return this.tipotributarioReturnGeneral;
	}

	public void settipotributarioReturnGeneral(TipoTributarioParameterReturnGeneral tipotributarioReturnGeneral) {
		this.tipotributarioReturnGeneral = tipotributarioReturnGeneral;
	}	
	
	
	public String codigoBusquedaPorCodigo="";

	public String getcodigoBusquedaPorCodigo() {
		return this.codigoBusquedaPorCodigo;
	}

	public void setcodigoBusquedaPorCodigo(String codigoBusquedaPorCodigo) {
		this.codigoBusquedaPorCodigo = codigoBusquedaPorCodigo;
	}

	public Long idBusquedaPorId=0L;

	public Long getidBusquedaPorId() {
		return this.idBusquedaPorId;
	}

	public void setidBusquedaPorId(Long idBusquedaPorId) {
		this.idBusquedaPorId = idBusquedaPorId;
	}

	public String nombreBusquedaPorNombre="";

	public String getnombreBusquedaPorNombre() {
		return this.nombreBusquedaPorNombre;
	}

	public void setnombreBusquedaPorNombre(String nombreBusquedaPorNombre) {
		this.nombreBusquedaPorNombre = nombreBusquedaPorNombre;
	}

	public Long id_paisFK_IdPais=-1L;

	public Long getid_paisFK_IdPais() {
		return this.id_paisFK_IdPais;
	}

	public void setid_paisFK_IdPais(Long id_paisFK_IdPais) {
		this.id_paisFK_IdPais = id_paisFK_IdPais;
	}

		
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	
	public TipoTributarioLogic getTipoTributarioLogic()	{		
		return tipotributarioLogic;
	}

	public void setTipoTributarioLogic(TipoTributarioLogic tipotributarioLogic) {
		this.tipotributarioLogic = tipotributarioLogic;
	}
	
	
	public void setsFinalQueryGeneral(String sFinalQueryGeneral) {
		this.sFinalQueryGeneral=sFinalQueryGeneral;
	}
	
	public String getsFinalQueryGeneral() {
		return this.sFinalQueryGeneral;
	}
		
	public Boolean getIsGuardarCambiosEnLote() {
		return isGuardarCambiosEnLote;
	}

	public void setIsGuardarCambiosEnLote(Boolean isGuardarCambiosEnLote) {
		this.isGuardarCambiosEnLote = isGuardarCambiosEnLote;
	}
	
	public Boolean getIsCargarCombosDependencia() {
		return isCargarCombosDependencia;
	}

	public void setIsCargarCombosDependencia(Boolean isCargarCombosDependencia) {
		this.isCargarCombosDependencia = isCargarCombosDependencia;
	}
	
	public Boolean getIsEsNuevoTipoTributario() {
		return isEsNuevoTipoTributario;
	}

	public void setIsEsNuevoTipoTributario(Boolean isEsNuevoTipoTributario) {
		this.isEsNuevoTipoTributario = isEsNuevoTipoTributario;
	}

	public Boolean getEsParaAccionDesdeFormularioTipoTributario() {
		return esParaAccionDesdeFormularioTipoTributario;
	}
	
	public void setEsParaAccionDesdeFormularioTipoTributario(Boolean esParaAccionDesdeFormularioTipoTributario) {
		this.esParaAccionDesdeFormularioTipoTributario = esParaAccionDesdeFormularioTipoTributario;
	}
	
	public Boolean getIsEsMantenimientoRelacionesRelacionadoUnico() {
		return isEsMantenimientoRelacionesRelacionadoUnico;
	}

	public void setIsEsMantenimientoRelacionesRelacionadoUnico(Boolean isEsMantenimientoRelacionesRelacionadoUnico) {
		this.isEsMantenimientoRelacionesRelacionadoUnico = isEsMantenimientoRelacionesRelacionadoUnico;
	}

	public Boolean getIsEsMantenimientoRelaciones() {
		return isEsMantenimientoRelaciones;
	}

	public void setIsEsMantenimientoRelaciones(Boolean isEsMantenimientoRelaciones) {
		this.isEsMantenimientoRelaciones = isEsMantenimientoRelaciones;
	}

	public Boolean getIsEsMantenimientoRelacionado() {
		return isEsMantenimientoRelacionado;
	}

	public void setIsEsMantenimientoRelacionado(Boolean isEsMantenimientoRelacionado) {
		this.isEsMantenimientoRelacionado = isEsMantenimientoRelacionado;
	}

	public Boolean getesParaBusquedaForeignKey() {
		return esParaBusquedaForeignKey;
	}

	public void setesParaBusquedaForeignKey(Boolean esParaBusquedaForeignKey) {
		this.esParaBusquedaForeignKey = esParaBusquedaForeignKey;
	}

	public Boolean getIsContieneImagenes() {
		return isContieneImagenes;
	}

	public void setIsContieneImagenes(Boolean isContieneImagenes) {
		this.isContieneImagenes = isContieneImagenes;
	}		
	
	
	public void cargarCombosPaissForeignKeyLista(String sFinalQuery)throws Exception
	{
		try
		{
			this.paissForeignKey=new ArrayList<Pais>();

			ArrayList<Classe> clases=new ArrayList<Classe>();
			ArrayList<String> arrClasses=new ArrayList<String>();
			Classe classe=new Classe();
			DatosDeep datosDeep=new DatosDeep(false,DeepLoadType.INCLUDE,clases,"");

			PaisLogic paisLogic=new PaisLogic();

			paisLogic.getPaisDataAccess().setIsForForeingKeyData(true);

			if(this.tipotributarioSessionBean==null) {
				this.tipotributarioSessionBean=new TipoTributarioSessionBean();
			}

			if(!this.tipotributarioSessionBean.getisBusquedaDesdeForeignKeySesionPais()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					paisLogic.getPaisDataAccess().setIsForForeingKeyData(true);

					paisLogic.getTodosPaissWithConnection(sFinalQuery,new Pagination());

					this.paissForeignKey=paisLogic.getPaiss();

				} else if(Constantes.ISUSAEJBREMOTE) {

				} else if(Constantes.ISUSAEJBHOME) {
				}


				//ARCHITECTURE
			} else {
				if(!this.conCargarMinimo) {
					this.setVisibilidadBusquedasParaPais(true);
				}
				//ARCHITECTURE

				if(Constantes.ISUSAEJBLOGICLAYER) {
					paisLogic.getEntityWithConnection(tipotributarioSessionBean.getlidPaisActual());
					this.paissForeignKey.add(paisLogic.getPais());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	
	
	public void setActualPaisForeignKey(Long idPaisSeleccionado,Boolean conCombosBusquedas,String sFormularioTipoBusqueda)throws Exception
	{
		try
		{
			Pais  paisTemp=null;

			for(Pais paisAux:paissForeignKey) {
				if(paisAux.getId()!=null && paisAux.getId().equals(idPaisSeleccionado)) {
					paisTemp=paisAux;
					break;
				}
			}

			if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){
				if(paisTemp!=null) {

					if(this.tipotributario!=null) {
						this.tipotributario.setPais(paisTemp);
					}

					if(this.jInternalFrameDetalleFormTipoTributario!=null) {
						this.jInternalFrameDetalleFormTipoTributario.jComboBoxid_paisTipoTributario.setSelectedItem(paisTemp);
					}
				} else {
					//jComboBoxid_paisTipoTributario.setSelectedItem(paisTemp);
					if(this.jInternalFrameDetalleFormTipoTributario!=null) {
						if(this.jInternalFrameDetalleFormTipoTributario.jComboBoxid_paisTipoTributario.getItemCount()>0) {
							this.jInternalFrameDetalleFormTipoTributario.jComboBoxid_paisTipoTributario.setSelectedIndex(0);
						}
					}
				}
			}

			if(conCombosBusquedas) {

		//BYDAN_BUSQUEDAS
						
				if(sFormularioTipoBusqueda.equals("FK_IdPais") || sFormularioTipoBusqueda.equals("Todos")){
					if(paisTemp!=null && jComboBoxid_paisFK_IdPaisTipoTributario!=null) {
						jComboBoxid_paisFK_IdPaisTipoTributario.setSelectedItem(paisTemp);
					} else {
						if(jComboBoxid_paisFK_IdPaisTipoTributario!=null) {
							//jComboBoxid_paisFK_IdPaisTipoTributario.setSelectedItem(paisTemp);
							if(jComboBoxid_paisFK_IdPaisTipoTributario.getItemCount()>0) {
								jComboBoxid_paisFK_IdPaisTipoTributario.setSelectedIndex(0);
							}
						}
					}
				}

					}

		}
		catch(Exception e)
		{
			throw e;
		}
	}

	public String getActualPaisForeignKeyDescripcion(Long idPaisSeleccionado)throws Exception
	{
		String sDescripcion="";

		try
		{
			Pais  paisTemp=null;

			for(Pais paisAux:paissForeignKey) {
				if(paisAux.getId()!=null && paisAux.getId().equals(idPaisSeleccionado)) {
					paisTemp=paisAux;
					break;
				}
			}


			sDescripcion=PaisConstantesFunciones.getPaisDescripcion(paisTemp);
		}
		catch(Exception e)
		{
			throw e;
		}

		return sDescripcion;
	}

	@SuppressWarnings("rawtypes")
	public void setActualPaisForeignKeyGenerico(Long idPaisSeleccionado,JComboBox jComboBoxid_paisTipoTributarioGenerico)throws Exception
	{
		try
		{
			Pais  paisTemp=null;

			for(Pais paisAux:paissForeignKey) {
				if(paisAux.getId()!=null && paisAux.getId().equals(idPaisSeleccionado)) {
					paisTemp=paisAux;
					break;
				}
			}

			if(paisTemp!=null) {
				jComboBoxid_paisTipoTributarioGenerico.setSelectedItem(paisTemp);
			} else {
				if(jComboBoxid_paisTipoTributarioGenerico!=null && jComboBoxid_paisTipoTributarioGenerico.getItemCount()>0) {
					jComboBoxid_paisTipoTributarioGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	
	
	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarPaisForeignKey(TipoTributario tipotributario,JComboBox jComboBoxid_paisTipoTributarioGenerico)throws Exception
	{
		try
		{
			Pais  paisAux=new Pais();

			if(jComboBoxid_paisTipoTributarioGenerico==null) {
				paisAux=(Pais)this.jInternalFrameDetalleFormTipoTributario.jComboBoxid_paisTipoTributario.getSelectedItem();
			} else {
				paisAux=(Pais)jComboBoxid_paisTipoTributarioGenerico.getSelectedItem();
			}

			if(paisAux!=null && paisAux.getId()!=null) {
				tipotributario.setid_pais(paisAux.getId());
				tipotributario.setpais_descripcion(TipoTributarioConstantesFunciones.getPaisDescripcion(paisAux));
				tipotributario.setPais(paisAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	
	


		@SuppressWarnings({ "unchecked", "rawtypes" })
		public void cargarCombosFramePaissForeignKey(String sFormularioTipoBusqueda)throws Exception {
			try {

				JComboBoxBinding jComboBoxBindingPais=null;

				if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){

					if(!TipoTributarioJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormTipoTributario!=null) { 
							this.jInternalFrameDetalleFormTipoTributario.jComboBoxid_paisTipoTributario.removeAllItems();

							for(Pais pais:this.paissForeignKey) {
								this.jInternalFrameDetalleFormTipoTributario.jComboBoxid_paisTipoTributario.addItem(pais);
							}
						}
					}

					if(this.jInternalFrameDetalleFormTipoTributario!=null) { 
					}

					if(!TipoTributarioJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {

					if(sFormularioTipoBusqueda.equals("FK_IdPais") || sFormularioTipoBusqueda.equals("Todos")){

						//BYDAN_BUSQUEDAS
						
						if(!TipoTributarioJInternalFrame.ISBINDING_MANUAL) {
						} else {
							this.jComboBoxid_paisFK_IdPaisTipoTributario.removeAllItems();

							for(Pais pais:this.paissForeignKey) {
								this.jComboBoxid_paisFK_IdPaisTipoTributario.addItem(pais);
							}
						}

						if(!TipoTributarioJInternalFrame.ISBINDING_MANUAL) {
						}

						
					}

				}

			}  catch(Exception e) {
				throw e;
			}
		}

	


		public void setSelectedItemCombosFramePaisForeignKey(Pais pais,int iIndexSelected,Boolean conSelectedIndex,Boolean conFormulario,Boolean conBusqueda)throws Exception {
			try {

				if(conFormulario) {
					if(!conSelectedIndex) {
						if(this.jInternalFrameDetalleFormTipoTributario!=null) {
							this.jInternalFrameDetalleFormTipoTributario.jComboBoxid_paisTipoTributario.setSelectedItem(pais);
						}
					} else {
						if(this.jInternalFrameDetalleFormTipoTributario!=null) {
							this.jInternalFrameDetalleFormTipoTributario.jComboBoxid_paisTipoTributario.setSelectedIndex(iIndexSelected);
						}
					}
				}


				if(!this.conCargarMinimo) {
					if(conBusqueda) {

					//BYDAN_BUSQUEDAS
					
						if(!conSelectedIndex) {
							this.jComboBoxid_paisFK_IdPaisTipoTributario.setSelectedItem(pais);
						} else {
							this.jComboBoxid_paisFK_IdPaisTipoTributario.setSelectedIndex(iIndexSelected);
						}

										}
				}
			} catch(Exception e) {
				throw e;
			}
		}

	


	
	public void refrescarForeignKeysDescripcionesTipoTributario() throws Exception {
		//SI FUNCIONA DEEPLOAD ESTO VA AL ULTIMO
		if(Constantes.ISUSAEJBLOGICLAYER) {
			TipoTributarioConstantesFunciones.refrescarForeignKeysDescripcionesTipoTributario(this.tipotributarioLogic.getTipoTributarios());
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			TipoTributarioConstantesFunciones.refrescarForeignKeysDescripcionesTipoTributario(this.tipotributarios);
		}
		
		/*
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		classes.add(new Classe(Pais.class));
			
		if(Constantes.ISUSAEJBLOGICLAYER) {
			//USA LOS OBJETOS DE LOGIC DIRECTAMENTE
			//tipotributarioLogic.setTipoTributarios(this.tipotributarios);
			tipotributarioLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
	
		} else if(Constantes.ISUSAEJBREMOTE) {
		} else if(Constantes.ISUSAEJBHOME) {
		}
		*/				
	}	
	
	
	
	public Integer getiNumeroPaginacion() {
		return iNumeroPaginacion;
	}

	public void setiNumeroPaginacion(Integer iNumeroPaginacion) {
		this.iNumeroPaginacion= iNumeroPaginacion;
	}
	
	public Integer getiNumeroPaginacionPagina() {
		return iNumeroPaginacionPagina;
	}

	public void setiNumeroPaginacionPagina(Integer iNumeroPaginacionPagina) {
		this.iNumeroPaginacionPagina= iNumeroPaginacionPagina;
	}
	
	
	public Boolean getIsSeleccionarTodos() {
		return this.isSeleccionarTodos;
	}

	public void setIsSeleccionarTodos(Boolean isSeleccionarTodos) {
		this.isSeleccionarTodos= isSeleccionarTodos;
	}
	
	public Boolean getEsControlTabla() {
		return this.esControlTabla;
	}

	public void setEsControlTabla(Boolean esControlTabla) {
		this.esControlTabla= esControlTabla;
	}
	
	public Boolean getIsSeleccionados() {
		return this.isSeleccionados;
	}

	public void setIsSeleccionados(Boolean isSeleccionados) {
		this.isSeleccionados= isSeleccionados;
	}
	
	public Boolean getIsPostAccionNuevo() {
		return this.isPostAccionNuevo;
	}

	public void setIsPostAccionNuevo(Boolean isPostAccionNuevo) {
		this.isPostAccionNuevo= isPostAccionNuevo;
	}
	
	public Boolean getIsPostAccionSinCerrar() {
		return this.isPostAccionSinCerrar;
	}

	public void setIsPostAccionSinCerrar(Boolean isPostAccionSinCerrar) {
		this.isPostAccionSinCerrar= isPostAccionSinCerrar;
	}
	
	public Boolean getIsPostAccionSinMensaje() {
		return this.isPostAccionSinMensaje;
	}

	public void setIsPostAccionSinMensaje(Boolean isPostAccionSinMensaje) {
		this.isPostAccionSinMensaje= isPostAccionSinMensaje;
	}
	
	public Boolean getConGraficoReporte() {
		return this.conGraficoReporte;
	}

	public void setConGraficoReporte(Boolean conGraficoReporte) {
		this.conGraficoReporte= conGraficoReporte;
	}
	
	
	public ArrayList<Reporte> gettiposArchivosReportes() {
		return this.tiposArchivosReportes;
	}
	
	public void settiposArchivosReportes(ArrayList<Reporte> tiposArchivosReportes) {
		this.tiposArchivosReportes = tiposArchivosReportes;
	}
	
	//TIPOS ARCHIVOS DINAMICOS
	public ArrayList<Reporte> gettiposArchivosReportesDinamico() {
		return this.tiposArchivosReportesDinamico;
	}
	
	public void settiposArchivosReportesDinamico(ArrayList<Reporte> tiposArchivosReportesDinamico) {
		this.tiposArchivosReportesDinamico = tiposArchivosReportesDinamico;
	}
	
	//TIPOS REPORTES
	public ArrayList<Reporte> gettiposReportes() {
		return this.tiposReportes;
	}
	
	public void settiposReportes(ArrayList<Reporte> tiposReportes) {
		this.tiposReportes = tiposReportes;
	}
	
	//TIPOS REPORTES
	public ArrayList<Reporte> gettiposReportesDinamico() {
		return this.tiposReportesDinamico;
	}
	
	public void settiposReportesDinamico(ArrayList<Reporte> tiposReportesDinamico) {
		this.tiposReportesDinamico = tiposReportesDinamico;
	}
	
	//TIPOS GRAFICOS REPORTES
	public ArrayList<Reporte> gettiposGraficosReportes() {
		return this.tiposGraficosReportes;
	}
	
	public void settiposGraficosReportes(ArrayList<Reporte> tiposGraficosReportes) {
		this.tiposGraficosReportes = tiposGraficosReportes;
	}
	
	public ArrayList<Reporte> gettiposPaginacion() {
		return this.tiposPaginacion;
	}
	
	public void settiposPaginacion(ArrayList<Reporte> tiposPaginacion) {
		this.tiposPaginacion = tiposPaginacion;
	}
	
	public ArrayList<Reporte> gettiposRelaciones() {
		return this.tiposRelaciones;
	}
	
	public void settiposRelaciones(ArrayList<Reporte> tiposRelaciones) {
		this.tiposRelaciones= tiposRelaciones;
	}
	
	public ArrayList<Reporte> gettiposAcciones() {
		return this.tiposAcciones;
	}
	
	public void settiposAcciones(ArrayList<Reporte> tiposAcciones) {
		this.tiposAcciones = tiposAcciones;
	}
	
	public ArrayList<Reporte> gettiposAccionesFormulario() {
		return this.tiposAccionesFormulario;
	}
	
	public void settiposAccionesFormulario(ArrayList<Reporte> tiposAccionesFormulario) {
		this.tiposAccionesFormulario = tiposAccionesFormulario;
	}
	
	public ArrayList<Reporte> gettiposSeleccionar() {
		return this.tiposSeleccionar;
	}
	
	public void settiposSeleccionar(ArrayList<Reporte> tiposSeleccionar) {
		this.tiposSeleccionar = tiposSeleccionar;
	}
	
	public ArrayList<Reporte> gettiposColumnasSelect() {
		return this.tiposColumnasSelect;
	}
	
	public void settiposColumnasSelect(ArrayList<Reporte> tiposColumnasSelect) {
		this.tiposColumnasSelect = tiposColumnasSelect;
	}
		
	public ArrayList<Reporte> gettiposRelacionesSelect() {
		return this.tiposRelacionesSelect;
	}
	
	public void settiposRelacionesSelect(ArrayList<Reporte> tiposRelacionesSelect) {
		this.tiposRelacionesSelect = tiposRelacionesSelect;
	}
	
	public Long getIIdUsuarioSesion() {
		return lIdUsuarioSesion;
	}

	public void setIIdUsuarioSesion(Long lIdUsuarioSesion) {
		this.lIdUsuarioSesion = lIdUsuarioSesion;
	}
	
	
	public List<Accion> getAccions() {
		return this.accions;
	}

	public void setAccions(List<Accion> accions) {
		this.accions = accions;
	}
	
	public List<Accion> getAccionsFormulario() {
		return this.accionsFormulario;
	}

	public void setAccionsFormulario(List<Accion> accionsFormulario) {
		this.accionsFormulario = accionsFormulario;
	}
	
	public String getsAccionMantenimiento() {
		return sAccionMantenimiento;
	}

	public void setsAccionMantenimiento(String sAccionMantenimiento) {
		this.sAccionMantenimiento = sAccionMantenimiento;
	}

	public String getsAccionBusqueda() {
		return sAccionBusqueda;
	}

	public void setsAccionBusqueda(String sAccionBusqueda) {
		this.sAccionBusqueda = sAccionBusqueda;
	}

	public String getsAccionAdicional() {
		return sAccionAdicional;
	}

	public void setsAccionAdicional(String sAccionAdicional) {
		this.sAccionAdicional = sAccionAdicional;
	}

	public String getsUltimaBusqueda() {
		return sUltimaBusqueda;
	}

	public void setsUltimaBusqueda(String sUltimaBusqueda) {
		this.sUltimaBusqueda = sUltimaBusqueda;
	}
	
	public String getsTipoArchivoReporte() {
		return sTipoArchivoReporte;
	}

	public void setsTipoArchivoReporte(String sTipoArchivoReporte) {
		this.sTipoArchivoReporte = sTipoArchivoReporte;
	}
	
	public String getsTipoArchivoReporteDinamico() {
		return sTipoArchivoReporteDinamico;
	}

	public void setsTipoArchivoReporteDinamico(String sTipoArchivoReporteDinamico) {
		this.sTipoArchivoReporteDinamico = sTipoArchivoReporteDinamico;
	}
	
	public String getsTipoReporte() {
		return sTipoReporte;
	}

	public void setsTipoReporte(String sTipoReporte) {
		this.sTipoReporte = sTipoReporte;
	}
	
	public String getsTipoReporteDinamico() {
		return sTipoReporteDinamico;
	}

	public void setsTipoReporteDinamico(String sTipoReporteDinamico) {
		this.sTipoReporteDinamico = sTipoReporteDinamico;
	}
	
	public String getsTipoGraficoReporte() {
		return sTipoGraficoReporte;
	}

	public void setsTipoGraficoReporte(String sTipoGraficoReporte) {
		this.sTipoGraficoReporte = sTipoGraficoReporte;
	}
	
	public String getsTipoPaginacion() {
		return sTipoPaginacion;
	}

	public void setsTipoPaginacion(String sTipoPaginacion) {
		this.sTipoPaginacion = sTipoPaginacion;
	}
	
	public String getsTipoRelacion() {
		return sTipoRelacion;
	}

	public void setsTipoRelacion(String sTipoRelacion) {
		this.sTipoRelacion = sTipoRelacion;
	}
	
	public String getsTipoAccion() {
		return sTipoAccion;
	}

	public void setsTipoAccion(String sTipoAccion) {
		this.sTipoAccion = sTipoAccion;
	}
	
	public String getsTipoAccionFormulario() {
		return sTipoAccionFormulario;
	}

	public void setsTipoAccionFormulario(String sTipoAccionFormulario) {
		this.sTipoAccionFormulario = sTipoAccionFormulario;
	}
	
	public String getsTipoSeleccionar() {
		return sTipoSeleccionar;
	}

	public void setsTipoSeleccionar(String sTipoSeleccionar) {
		this.sTipoSeleccionar = sTipoSeleccionar;
	}
	
	public String getsValorCampoGeneral() {
		return sValorCampoGeneral;
	}

	public void setsValorCampoGeneral(String sValorCampoGeneral) {
		this.sValorCampoGeneral = sValorCampoGeneral;
	}			

	public String getsDetalleReporte() {
		return sDetalleReporte;
	}

	public void setsDetalleReporte(String sDetalleReporte) {
		this.sDetalleReporte = sDetalleReporte;
	}
	
	
	public String getsTipoReporteExtra() {
		return sTipoReporteExtra;
	}

	public void setsTipoReporteExtra(String sTipoReporteExtra) {
		this.sTipoReporteExtra = sTipoReporteExtra;
	}
	
	public Boolean getesReporteDinamico() {
		return esReporteDinamico;
	}	
	
	public void setesReporteDinamico(Boolean esReporteDinamico) {
		this.esReporteDinamico = esReporteDinamico;
	}
	
	public Boolean getesRecargarFks() {
		return esRecargarFks;
	}	
	
	public void setesRecargarFks(Boolean esRecargarFks) {
		this.esRecargarFks = esRecargarFks;
	}
	
	public Boolean getesReporteAccionProceso() {
		return esReporteAccionProceso;
	}	
	
	public void setesReporteAccionProceso(Boolean esReporteAccionProceso) {
		this.esReporteAccionProceso= esReporteAccionProceso;
	}
		
	public TipoTributarioParameterReturnGeneral getTipoTributarioParameterGeneral() {
		return this.tipotributarioParameterGeneral;
	}
	
	public void setTipoTributarioParameterGeneral(TipoTributarioParameterReturnGeneral tipotributarioParameterGeneral) {
		this.tipotributarioParameterGeneral = tipotributarioParameterGeneral;
	}
	
	public String getsPathReporteDinamico() {
		return sPathReporteDinamico;
	}

	public void setsPathReporteDinamico(String sPathReporteDinamico) {
		this.sPathReporteDinamico = sPathReporteDinamico;
	}
		
	public Boolean getisMostrarNumeroPaginacion() {
		return isMostrarNumeroPaginacion;
	}

	public void setisMostrarNumeroPaginacion(Boolean isMostrarNumeroPaginacion) {
		this.isMostrarNumeroPaginacion = isMostrarNumeroPaginacion;
	}
	
	public Mensaje getMensaje() {
		return mensaje;
	}

	public void setMensaje(Mensaje mensaje) {
		this.mensaje = mensaje;
	}
	
	public Boolean getIsPermisoTodoTipoTributario() {
		return isPermisoTodoTipoTributario;
	}

	public void setIsPermisoTodoTipoTributario(Boolean isPermisoTodoTipoTributario) {
		this.isPermisoTodoTipoTributario = isPermisoTodoTipoTributario;
	}

	public Boolean getIsPermisoNuevoTipoTributario() {
		return isPermisoNuevoTipoTributario;
	}

	public void setIsPermisoNuevoTipoTributario(Boolean isPermisoNuevoTipoTributario) {
		this.isPermisoNuevoTipoTributario = isPermisoNuevoTipoTributario;
	}

	public Boolean getIsPermisoActualizarTipoTributario() {
		return isPermisoActualizarTipoTributario;
	}

	public void setIsPermisoActualizarTipoTributario(Boolean isPermisoActualizarTipoTributario) {
		this.isPermisoActualizarTipoTributario = isPermisoActualizarTipoTributario;
	}

	public Boolean getIsPermisoEliminarTipoTributario() {
		return isPermisoEliminarTipoTributario;
	}

	public void setIsPermisoEliminarTipoTributario(Boolean isPermisoEliminarTipoTributario) {
		this.isPermisoEliminarTipoTributario = isPermisoEliminarTipoTributario;
	}

	public Boolean getIsPermisoGuardarCambiosTipoTributario() {
		return isPermisoGuardarCambiosTipoTributario;
	}

	public void setIsPermisoGuardarCambiosTipoTributario(Boolean isPermisoGuardarCambiosTipoTributario) {
		this.isPermisoGuardarCambiosTipoTributario = isPermisoGuardarCambiosTipoTributario;
	}
	
	public Boolean getIsPermisoConsultaTipoTributario() {
		return isPermisoConsultaTipoTributario;
	}

	public void setIsPermisoConsultaTipoTributario(Boolean isPermisoConsultaTipoTributario) {
		this.isPermisoConsultaTipoTributario = isPermisoConsultaTipoTributario;
	}

	public Boolean getIsPermisoBusquedaTipoTributario() {
		return isPermisoBusquedaTipoTributario;
	}

	public void setIsPermisoBusquedaTipoTributario(Boolean isPermisoBusquedaTipoTributario) {
		this.isPermisoBusquedaTipoTributario = isPermisoBusquedaTipoTributario;
	}

	public Boolean getIsPermisoReporteTipoTributario() {
		return isPermisoReporteTipoTributario;
	}

	public void setIsPermisoReporteTipoTributario(Boolean isPermisoReporteTipoTributario) {
		this.isPermisoReporteTipoTributario = isPermisoReporteTipoTributario;
	}
	
	public Boolean getIsPermisoPaginacionMedioTipoTributario() {
		return isPermisoPaginacionMedioTipoTributario;
	}

	public void setIsPermisoPaginacionMedioTipoTributario(Boolean isPermisoPaginacionMedioTipoTributario) {
		this.isPermisoPaginacionMedioTipoTributario = isPermisoPaginacionMedioTipoTributario;
	}
	
	public Boolean getIsPermisoPaginacionTodoTipoTributario() {
		return isPermisoPaginacionTodoTipoTributario;
	}

	public void setIsPermisoPaginacionTodoTipoTributario(Boolean isPermisoPaginacionTodoTipoTributario) {
		this.isPermisoPaginacionTodoTipoTributario = isPermisoPaginacionTodoTipoTributario;
	}
	
	public Boolean getIsPermisoPaginacionAltoTipoTributario() {
		return isPermisoPaginacionAltoTipoTributario;
	}

	public void setIsPermisoPaginacionAltoTipoTributario(Boolean isPermisoPaginacionAltoTipoTributario) {
		this.isPermisoPaginacionAltoTipoTributario = isPermisoPaginacionAltoTipoTributario;
	}
	
	public Boolean getIsPermisoCopiarTipoTributario() {
		return isPermisoCopiarTipoTributario;
	}

	public void setIsPermisoCopiarTipoTributario(Boolean isPermisoCopiarTipoTributario) {
		this.isPermisoCopiarTipoTributario = isPermisoCopiarTipoTributario;
	}
	
	public Boolean getIsPermisoVerFormTipoTributario() {
		return isPermisoVerFormTipoTributario;
	}

	public void setIsPermisoVerFormTipoTributario(Boolean isPermisoVerFormTipoTributario) {
		this.isPermisoVerFormTipoTributario = isPermisoVerFormTipoTributario;
	}
	
	public Boolean getIsPermisoDuplicarTipoTributario() {
		return isPermisoDuplicarTipoTributario;
	}

	public void setIsPermisoDuplicarTipoTributario(Boolean isPermisoDuplicarTipoTributario) {
		this.isPermisoDuplicarTipoTributario = isPermisoDuplicarTipoTributario;
	}
	
	public Boolean getIsPermisoOrdenTipoTributario() {
		return isPermisoOrdenTipoTributario;
	}

	public void setIsPermisoOrdenTipoTributario(Boolean isPermisoOrdenTipoTributario) {
		this.isPermisoOrdenTipoTributario = isPermisoOrdenTipoTributario;
	}
	
	public String getsVisibilidadTablaBusquedas() {
		return sVisibilidadTablaBusquedas;
	}

	public void setsVisibilidadTablaBusquedas(String sVisibilidadTablaBusquedas) {
		this.sVisibilidadTablaBusquedas = sVisibilidadTablaBusquedas;
	}
	
	public String getsVisibilidadTablaElementos() {
		return sVisibilidadTablaElementos;
	}

	public void setsVisibilidadTablaElementos(String sVisibilidadTablaElementos) {
		this.sVisibilidadTablaElementos = sVisibilidadTablaElementos;
	}

	public String getsVisibilidadTablaAcciones() {
		return sVisibilidadTablaAcciones;
	}

	public void setsVisibilidadTablaAcciones(String sVisibilidadTablaAcciones) {
		this.sVisibilidadTablaAcciones = sVisibilidadTablaAcciones;
	}
	
	public Boolean getIsVisibilidadCeldaNuevoTipoTributario() {
		return isVisibilidadCeldaNuevoTipoTributario;
	}

	public void setIsVisibilidadCeldaNuevoTipoTributario(Boolean isVisibilidadCeldaNuevoTipoTributario) {
		this.isVisibilidadCeldaNuevoTipoTributario = isVisibilidadCeldaNuevoTipoTributario;
	}
	
	public Boolean getIsVisibilidadCeldaDuplicarTipoTributario() {
		return isVisibilidadCeldaDuplicarTipoTributario;
	}

	public void setIsVisibilidadCeldaDuplicarTipoTributario(Boolean isVisibilidadCeldaDuplicarTipoTributario) {
		this.isVisibilidadCeldaDuplicarTipoTributario = isVisibilidadCeldaDuplicarTipoTributario;
	}
	
	public Boolean getIsVisibilidadCeldaCopiarTipoTributario() {
		return isVisibilidadCeldaCopiarTipoTributario;
	}

	public void setIsVisibilidadCeldaCopiarTipoTributario(Boolean isVisibilidadCeldaCopiarTipoTributario) {
		this.isVisibilidadCeldaCopiarTipoTributario = isVisibilidadCeldaCopiarTipoTributario;
	}
	
	public Boolean getIsVisibilidadCeldaVerFormTipoTributario() {
		return isVisibilidadCeldaVerFormTipoTributario;
	}

	public void setIsVisibilidadCeldaVerFormTipoTributario(Boolean isVisibilidadCeldaVerFormTipoTributario) {
		this.isVisibilidadCeldaVerFormTipoTributario = isVisibilidadCeldaVerFormTipoTributario;
	}
	
	public Boolean getIsVisibilidadCeldaOrdenTipoTributario() {
		return isVisibilidadCeldaOrdenTipoTributario;
	}

	public void setIsVisibilidadCeldaOrdenTipoTributario(Boolean isVisibilidadCeldaOrdenTipoTributario) {
		this.isVisibilidadCeldaOrdenTipoTributario = isVisibilidadCeldaOrdenTipoTributario;
	}
	
	public Boolean getIsVisibilidadCeldaNuevoRelacionesTipoTributario() {
		return isVisibilidadCeldaNuevoRelacionesTipoTributario;
	}

	public void setIsVisibilidadCeldaNuevoRelacionesTipoTributario(Boolean isVisibilidadCeldaNuevoRelacionesTipoTributario) {
		this.isVisibilidadCeldaNuevoRelacionesTipoTributario = isVisibilidadCeldaNuevoRelacionesTipoTributario;
	}
	
	public Boolean getIsVisibilidadCeldaModificarTipoTributario() {
		return isVisibilidadCeldaModificarTipoTributario;
	}

	public void setIsVisibilidadCeldaModificarTipoTributario(Boolean isVisibilidadCeldaModificarTipoTributario) {
		this.isVisibilidadCeldaModificarTipoTributario = isVisibilidadCeldaModificarTipoTributario;
	}
	
	public Boolean getIsVisibilidadCeldaActualizarTipoTributario() {
		return isVisibilidadCeldaActualizarTipoTributario;
	}

	public void setIsVisibilidadCeldaActualizarTipoTributario(Boolean isVisibilidadCeldaActualizarTipoTributario) {
		this.isVisibilidadCeldaActualizarTipoTributario = isVisibilidadCeldaActualizarTipoTributario;
	}

	public Boolean getIsVisibilidadCeldaEliminarTipoTributario() {
		return isVisibilidadCeldaEliminarTipoTributario;
	}

	public void setIsVisibilidadCeldaEliminarTipoTributario(Boolean isVisibilidadCeldaEliminarTipoTributario) {
		this.isVisibilidadCeldaEliminarTipoTributario = isVisibilidadCeldaEliminarTipoTributario;
	}

	public Boolean getIsVisibilidadCeldaCancelarTipoTributario() {
		return isVisibilidadCeldaCancelarTipoTributario;
	}

	public void setIsVisibilidadCeldaCancelarTipoTributario(Boolean isVisibilidadCeldaCancelarTipoTributario) {
		this.isVisibilidadCeldaCancelarTipoTributario = isVisibilidadCeldaCancelarTipoTributario;
	}

	public Boolean getIsVisibilidadCeldaGuardarTipoTributario() {
		return isVisibilidadCeldaGuardarTipoTributario;
	}

	public void setIsVisibilidadCeldaGuardarTipoTributario(Boolean isVisibilidadCeldaGuardarTipoTributario) {
		this.isVisibilidadCeldaGuardarTipoTributario = isVisibilidadCeldaGuardarTipoTributario;
	}
	
	public Boolean getIsVisibilidadCeldaGuardarCambiosTipoTributario() {
		return isVisibilidadCeldaGuardarCambiosTipoTributario;
	}

	public void setIsVisibilidadCeldaGuardarCambiosTipoTributario(Boolean isVisibilidadCeldaGuardarCambiosTipoTributario) {
		this.isVisibilidadCeldaGuardarCambiosTipoTributario = isVisibilidadCeldaGuardarCambiosTipoTributario;
	}
		
	public TipoTributarioSessionBean gettipotributarioSessionBean() {
		return this.tipotributarioSessionBean;
	}
	
	public void settipotributarioSessionBean(TipoTributarioSessionBean tipotributarioSessionBean) {
		this.tipotributarioSessionBean=tipotributarioSessionBean;
	}
	
	
	public Boolean getisVisibilidadBusquedaPorCodigo() {
		return this.isVisibilidadBusquedaPorCodigo;
	}

	public void setisVisibilidadBusquedaPorCodigo(Boolean isVisibilidadBusquedaPorCodigo) {
		this.isVisibilidadBusquedaPorCodigo=isVisibilidadBusquedaPorCodigo;
	}

	public Boolean getisVisibilidadBusquedaPorId() {
		return this.isVisibilidadBusquedaPorId;
	}

	public void setisVisibilidadBusquedaPorId(Boolean isVisibilidadBusquedaPorId) {
		this.isVisibilidadBusquedaPorId=isVisibilidadBusquedaPorId;
	}

	public Boolean getisVisibilidadBusquedaPorNombre() {
		return this.isVisibilidadBusquedaPorNombre;
	}

	public void setisVisibilidadBusquedaPorNombre(Boolean isVisibilidadBusquedaPorNombre) {
		this.isVisibilidadBusquedaPorNombre=isVisibilidadBusquedaPorNombre;
	}

	public Boolean getisVisibilidadFK_IdPais() {
		return this.isVisibilidadFK_IdPais;
	}

	public void setisVisibilidadFK_IdPais(Boolean isVisibilidadFK_IdPais) {
		this.isVisibilidadFK_IdPais=isVisibilidadFK_IdPais;
	}

	
	
	public void setVariablesFormularioToObjetoActualForeignKeysTipoTributario(TipoTributario tipotributario)throws Exception {
		try {
			
				this.setActualParaGuardarPaisForeignKey(tipotributario,null);
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void cargarLicenciaCliente(DatosCliente datosCliente) throws Exception {
		Boolean existe=false;
			
		try {
				InputStream reportFile=null;
				
				String sPath=this.parametroGeneralUsuario.getpath_exportar()+"erp_bydan/license/license.xml";
				
				reportFile = new FileInputStream(sPath);
				
				Document documentBuilder=null;
				
				if(this.constantes2.DOCUMENT_BUILDER==null) {
					documentBuilder=Funciones2.parseXml(reportFile);
				} else {
					documentBuilder=this.constantes2.DOCUMENT_BUILDER;
				}
				
				//GlobalSeguridad.readXml(documentBuilder);
				
				String sNamePCServerLicencia="";
				String sClaveSistemaLicencia="";
				Date dFechaServerLicencia=null;
				
				//CARGAR ELEMENTOS DE LICENCIA
				NodeList nodeList = documentBuilder.getElementsByTagName("Licencia");
				
				for (int iIndice = 0; iIndice < nodeList.getLength(); iIndice++) {
					Node node = nodeList.item(iIndice);
				
					if (node.getNodeType() == Node.ELEMENT_NODE) {
						Element element = (Element) node;
						 
						sNamePCServerLicencia=element.getElementsByTagName("NombrePc").item(0).getTextContent();
						sClaveSistemaLicencia=element.getElementsByTagName("ClaveSistema").item(0).getTextContent();
						
						existe=true;
						break;
					}
				}														
			
				
			if(existe) {
				datosCliente.setsClaveSistema(sClaveSistemaLicencia);
				
				if(!datosCliente.getsNamePCServer().equals(sNamePCServerLicencia)
					&& !datosCliente.getsNamePCServer().equals("")) {
					
					datosCliente.setsNamePCServer(sNamePCServerLicencia);
				}
			} else {
				throw new Exception("NO EXISTE LICENCIA O NO ESTA BIEN FORMADO");
			}
		} catch(Exception e) {
			throw new Exception("NO EXISTE LICENCIA O NO ESTA BIEN FORMADO");
		}						
	}
	
	public void cargarDatosCliente() throws Exception {
		String sPrimerMacAddress="";		
		String sHostName="";		 
		String sHostIp="";		  
		String sHostUser="";
		
		
		sPrimerMacAddress=FuncionesNetwork.getPrimerMacAddress();		
		sHostName=FuncionesNetwork.getHostName();		 
		sHostIp=FuncionesNetwork.getHostIp();		  
		sHostUser=FuncionesNetwork.getHostUser();
		
		
		this.datosCliente=new DatosCliente();
		if(lIdUsuarioSesion!=null){datosCliente.setIdUsuario(this.lIdUsuarioSesion);}
		
		//SERVIDOR WEB Y TALVEZ SERVIDOR SWING WINDOWS
		this.datosCliente.setsUsuarioPCServer(sHostUser);
		this.datosCliente.setsNamePCServer(sHostName);
		this.datosCliente.setsIPPCServer(sHostIp);
		this.datosCliente.setsMacAddressPCServer(sPrimerMacAddress);
			
			//CLIENTE SWING WINDOWS
			this.datosCliente.setIsClienteWeb(false);
			
			this.datosCliente.setsUsuarioPC(sHostUser);
			this.datosCliente.setsNamePC(sHostName);
			this.datosCliente.setsIPPC(sHostIp);
			this.datosCliente.setsMacAddressPC(sPrimerMacAddress);	
			
			
			//this.cargarLicenciaCliente(this.datosCliente);
			
	}
	
	public void bugActualizarReferenciaActual(TipoTributario tipotributario,TipoTributario tipotributarioAux) throws Exception {
		//ARCHITECTURE		
		//EL ID NEGATIVO GUARDADO EN ORIGINAL SIRVE PARA VERIFICAR Y ACTUALIZAR EL REGISTRO NUEVO (ID,VERSIONROW)
		this.setCamposBaseDesdeOriginalTipoTributario(tipotributario);
					
		//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
		tipotributarioAux.setId(tipotributario.getId());
		tipotributarioAux.setVersionRow(tipotributario.getVersionRow());					
	}
	
	public void ejecutarMantenimiento(MaintenanceType maintenanceType)throws Exception {	
		try	{								
			
			//this.startProcessTipoTributario();
		
			int intSelectedRow = this.jTableDatosTipoTributario.getSelectedRow();	       
			
			//PUEDE SER -1 CUANDO SE ELIMINA EN GUARDAR CAMBIOS
			if(intSelectedRow>=0 && maintenanceType!=MaintenanceType.GUARDARCAMBIOS) {
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
					
				//ARCHITECTURE
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipotributario =(TipoTributario) this.tipotributarioLogic.getTipoTributarios().toArray()[this.jTableDatosTipoTributario.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
					this.tipotributario =(TipoTributario) this.tipotributarios.toArray()[this.jTableDatosTipoTributario.convertRowIndexToModel(intSelectedRow)];
				}
				
				//ARCHITECTURE
				
				if(TipoTributarioJInternalFrame.ISBINDING_MANUAL_TABLA) {
					//this.setVariablesFormularioToObjetoActualTipoTributario(this.tipotributario,true);
				}
				
				this.setVariablesFormularioToObjetoActualForeignKeysTipoTributario(this.tipotributario);
			}
			
			//LUEGO DE TRAER DATOS CORRESPONDIENTES QUE COINCIDA LISTA TABLA QUITO FILA TOTALES
			if(this.conTotales) {
				//MEJOR LO DEJO, SI EXISTE EXCEPCION SE PIEDE FILA TOTALES Y ORDEN INDICE FILA ACTUAL
				//this.quitarFilaTotales();
			}
			
			this.cargarDatosCliente();
			
			this.datosDeep=new DatosDeep();
			
			//SE CAMBIA ESTADOS CON ERROR, ENTONCES SE EJECUTA ANTES
			//this.invalidValues = tipotributarioValidator.getInvalidValues(this.tipotributario);
			
			//if(this.invalidValues==null || this.invalidValues.length<=0) {
			
			tipotributarioLogic.setDatosCliente(datosCliente);
			tipotributarioLogic.setIsConDeep(false);
			
			if(maintenanceType==MaintenanceType.NUEVO) {
				tipotributarioAux=new  TipoTributario();
				
				tipotributarioAux.setIsNew(true);
				tipotributarioAux.setIsChanged(true);
				
				tipotributarioAux.setTipoTributarioOriginal(this.tipotributario);
				
				tipotributarioAux.setId(this.tipotributario.getId());	
				tipotributarioAux.setVersionRow(this.tipotributario.getVersionRow());	
				tipotributarioAux.setid_pais(this.tipotributario.getid_pais());	
				tipotributarioAux.setcodigo(this.tipotributario.getcodigo());	
				tipotributarioAux.setnombre(this.tipotributario.getnombre());	
								
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.tipotributarioSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.tipotributarioSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(tipotributarioAux,tipotributarioLogic.getTipoTributarios());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(tipotributarioAux,tipotributarios);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote  && !this.tipotributarioSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.tipotributarioSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						tipotributarioLogic.saveTipoTributarios();//WithConnection
						//tipotributarioLogic.getSetVersionRowTipoTributarios();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE		
					
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.tipotributario,tipotributarioAux);
					
					this.refrescarForeignKeysDescripcionesTipoTributario();
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.tipotributarioSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
							this.jInternalFrameDetalleFormTipoTributario.transaccionlocalBeanSwingJInternalFrame.transaccionlocalLogic.getTransaccionLocals().addAll(this.jInternalFrameDetalleFormTipoTributario.transaccionlocalBeanSwingJInternalFrame.transaccionlocalsEliminados);
							this.jInternalFrameDetalleFormTipoTributario.facturaproveedorservicioBeanSwingJInternalFrame.facturaproveedorservicioLogic.getFacturaProveedorServicios().addAll(this.jInternalFrameDetalleFormTipoTributario.facturaproveedorservicioBeanSwingJInternalFrame.facturaproveedorserviciosEliminados);
							this.jInternalFrameDetalleFormTipoTributario.definicionBeanSwingJInternalFrame.definicionLogic.getDefinicions().addAll(this.jInternalFrameDetalleFormTipoTributario.definicionBeanSwingJInternalFrame.definicionsEliminados);
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
							this.jInternalFrameDetalleFormTipoTributario.transaccionlocalBeanSwingJInternalFrame.transaccionlocals.addAll(this.jInternalFrameDetalleFormTipoTributario.transaccionlocalBeanSwingJInternalFrame.transaccionlocalsEliminados);
							this.jInternalFrameDetalleFormTipoTributario.facturaproveedorservicioBeanSwingJInternalFrame.facturaproveedorservicios.addAll(this.jInternalFrameDetalleFormTipoTributario.facturaproveedorservicioBeanSwingJInternalFrame.facturaproveedorserviciosEliminados);
							this.jInternalFrameDetalleFormTipoTributario.definicionBeanSwingJInternalFrame.definicions.addAll(this.jInternalFrameDetalleFormTipoTributario.definicionBeanSwingJInternalFrame.definicionsEliminados);
						}
						//ARCHITECTURE	
						
						if(!this.tipotributarioSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
								if(this.jInternalFrameDetalleFormTipoTributario.transaccionlocalBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoTributario.transaccionlocalBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormTipoTributario.transaccionlocalBeanSwingJInternalFrame.quitarFilaTotales();*/}
								if(this.jInternalFrameDetalleFormTipoTributario.facturaproveedorservicioBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoTributario.facturaproveedorservicioBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormTipoTributario.facturaproveedorservicioBeanSwingJInternalFrame.quitarFilaTotales();*/}
								if(this.jInternalFrameDetalleFormTipoTributario.definicionBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoTributario.definicionBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormTipoTributario.definicionBeanSwingJInternalFrame.quitarFilaTotales();*/}
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
								if(this.jInternalFrameDetalleFormTipoTributario.transaccionlocalBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoTributario.transaccionlocalBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormTipoTributario.transaccionlocalBeanSwingJInternalFrame.quitarFilaTotales();*/}
								if(this.jInternalFrameDetalleFormTipoTributario.facturaproveedorservicioBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoTributario.facturaproveedorservicioBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormTipoTributario.facturaproveedorservicioBeanSwingJInternalFrame.quitarFilaTotales();*/}
								if(this.jInternalFrameDetalleFormTipoTributario.definicionBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoTributario.definicionBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormTipoTributario.definicionBeanSwingJInternalFrame.quitarFilaTotales();*/}	
							}
							//ARCHITECTURE
												
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								tipotributarioLogic.saveTipoTributarioRelaciones(tipotributarioAux,this.jInternalFrameDetalleFormTipoTributario.transaccionlocalBeanSwingJInternalFrame.transaccionlocalLogic.getTransaccionLocals(),this.jInternalFrameDetalleFormTipoTributario.facturaproveedorservicioBeanSwingJInternalFrame.facturaproveedorservicioLogic.getFacturaProveedorServicios(),this.jInternalFrameDetalleFormTipoTributario.definicionBeanSwingJInternalFrame.definicionLogic.getDefinicions());//WithConnection
								//tipotributarioLogic.getSetVersionRowTipoTributarios();//WithConnection
							} else if(Constantes.ISUSAEJBREMOTE) {
							} else if(Constantes.ISUSAEJBHOME) {
							}
							//ARCHITECTURE
							
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							this.bugActualizarReferenciaActual(this.tipotributario,tipotributarioAux);
					
					
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								
							this.jInternalFrameDetalleFormTipoTributario.transaccionlocalBeanSwingJInternalFrame.transaccionlocalLogic.setTransaccionLocals(new ArrayList<TransaccionLocal>());
							this.jInternalFrameDetalleFormTipoTributario.facturaproveedorservicioBeanSwingJInternalFrame.facturaproveedorservicioLogic.setFacturaProveedorServicios(new ArrayList<FacturaProveedorServicio>());
							this.jInternalFrameDetalleFormTipoTributario.definicionBeanSwingJInternalFrame.definicionLogic.setDefinicions(new ArrayList<Definicion>());
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							this.jInternalFrameDetalleFormTipoTributario.transaccionlocalBeanSwingJInternalFrame.transaccionlocals= new ArrayList<TransaccionLocal>();
							this.jInternalFrameDetalleFormTipoTributario.facturaproveedorservicioBeanSwingJInternalFrame.facturaproveedorservicios= new ArrayList<FacturaProveedorServicio>();
							this.jInternalFrameDetalleFormTipoTributario.definicionBeanSwingJInternalFrame.definicions= new ArrayList<Definicion>();
							}
							//ARCHITECTURE	
						} else {
							
							

							if(this.jInternalFrameDetalleFormTipoTributario.transaccionlocalBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoTributario.transaccionlocalBeanSwingJInternalFrame.conTotales) {this.jInternalFrameDetalleFormTipoTributario.transaccionlocalBeanSwingJInternalFrame.quitarFilaTotales();}
							tipotributarioAux.setTransaccionLocals(this.jInternalFrameDetalleFormTipoTributario.transaccionlocalBeanSwingJInternalFrame.transaccionlocalLogic.getTransaccionLocals());

							if(this.jInternalFrameDetalleFormTipoTributario.facturaproveedorservicioBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoTributario.facturaproveedorservicioBeanSwingJInternalFrame.conTotales) {this.jInternalFrameDetalleFormTipoTributario.facturaproveedorservicioBeanSwingJInternalFrame.quitarFilaTotales();}
							tipotributarioAux.setFacturaProveedorServicios(this.jInternalFrameDetalleFormTipoTributario.facturaproveedorservicioBeanSwingJInternalFrame.facturaproveedorservicioLogic.getFacturaProveedorServicios());

							if(this.jInternalFrameDetalleFormTipoTributario.definicionBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoTributario.definicionBeanSwingJInternalFrame.conTotales) {this.jInternalFrameDetalleFormTipoTributario.definicionBeanSwingJInternalFrame.quitarFilaTotales();}
							tipotributarioAux.setDefinicions(this.jInternalFrameDetalleFormTipoTributario.definicionBeanSwingJInternalFrame.definicionLogic.getDefinicions());
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								if(this.tipotributarioSessionBean.getEstaModoGuardarRelaciones() 
									|| this.tipotributarioSessionBean.getEsGuardarRelacionado())	{
									actualizarLista(tipotributarioAux,tipotributarioLogic.getTipoTributarios());
								}
							} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
								actualizarLista(tipotributarioAux,tipotributarios);
							}
							//ARCHITECTURE
							
							//AQUI EL ID NEGATIVO ES EL ID BUSCADO, YA QUE NO SE GENERA OTRO EN LA DB POR INGRESAR UNO NUEVO
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							//this.bugActualizarReferenciaActual(this.tipotributario,tipotributarioAux);												
						}
					}
				}
			} else if(maintenanceType==MaintenanceType.ACTUALIZAR) {
				tipotributarioAux=new  TipoTributario();
				
				//PUEDE QUE SE ACTUALIZE ALGUN REGISTRO NUEVO
				if(!this.tipotributarioSessionBean.getEsGuardarRelacionado() 
					|| (this.tipotributarioSessionBean.getEsGuardarRelacionado() && this.tipotributario.getId()>=0)) {
						
					tipotributarioAux.setIsNew(false);
				}
				
				tipotributarioAux.setIsDeleted(false);
			
				tipotributarioAux.setId(this.tipotributario.getId());	
				tipotributarioAux.setVersionRow(this.tipotributario.getVersionRow());	
				tipotributarioAux.setid_pais(this.tipotributario.getid_pais());	
				tipotributarioAux.setcodigo(this.tipotributario.getcodigo());	
				tipotributarioAux.setnombre(this.tipotributario.getnombre());	
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(tipotributarioAux,tipotributarioLogic.getTipoTributarios());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(tipotributarioAux,tipotributarios);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote && !this.tipotributarioSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.tipotributarioSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						tipotributarioLogic.saveTipoTributarios();//WithConnection
						//tipotributarioLogic.getSetVersionRowTipoTributarios();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}	
					//ARCHITECTURE
					
					//TALVEZ ESTA DEMAS POR SER UPDATE
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.tipotributario,tipotributarioAux);
					
					this.refrescarForeignKeysDescripcionesTipoTributario();
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.tipotributarioSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
							this.jInternalFrameDetalleFormTipoTributario.transaccionlocalBeanSwingJInternalFrame.transaccionlocalLogic.getTransaccionLocals().addAll(this.jInternalFrameDetalleFormTipoTributario.transaccionlocalBeanSwingJInternalFrame.transaccionlocalsEliminados);
							this.jInternalFrameDetalleFormTipoTributario.facturaproveedorservicioBeanSwingJInternalFrame.facturaproveedorservicioLogic.getFacturaProveedorServicios().addAll(this.jInternalFrameDetalleFormTipoTributario.facturaproveedorservicioBeanSwingJInternalFrame.facturaproveedorserviciosEliminados);
							this.jInternalFrameDetalleFormTipoTributario.definicionBeanSwingJInternalFrame.definicionLogic.getDefinicions().addAll(this.jInternalFrameDetalleFormTipoTributario.definicionBeanSwingJInternalFrame.definicionsEliminados);
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
							this.jInternalFrameDetalleFormTipoTributario.transaccionlocalBeanSwingJInternalFrame.transaccionlocals.addAll(this.jInternalFrameDetalleFormTipoTributario.transaccionlocalBeanSwingJInternalFrame.transaccionlocalsEliminados);
							this.jInternalFrameDetalleFormTipoTributario.facturaproveedorservicioBeanSwingJInternalFrame.facturaproveedorservicios.addAll(this.jInternalFrameDetalleFormTipoTributario.facturaproveedorservicioBeanSwingJInternalFrame.facturaproveedorserviciosEliminados);
							this.jInternalFrameDetalleFormTipoTributario.definicionBeanSwingJInternalFrame.definicions.addAll(this.jInternalFrameDetalleFormTipoTributario.definicionBeanSwingJInternalFrame.definicionsEliminados);
						}
						//ARCHITECTURE
						
						if(!this.tipotributarioSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
								if(this.jInternalFrameDetalleFormTipoTributario.transaccionlocalBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoTributario.transaccionlocalBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormTipoTributario.transaccionlocalBeanSwingJInternalFrame.quitarFilaTotales();*/}
								if(this.jInternalFrameDetalleFormTipoTributario.facturaproveedorservicioBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoTributario.facturaproveedorservicioBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormTipoTributario.facturaproveedorservicioBeanSwingJInternalFrame.quitarFilaTotales();*/}
								if(this.jInternalFrameDetalleFormTipoTributario.definicionBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoTributario.definicionBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormTipoTributario.definicionBeanSwingJInternalFrame.quitarFilaTotales();*/}
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
								if(this.jInternalFrameDetalleFormTipoTributario.transaccionlocalBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoTributario.transaccionlocalBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormTipoTributario.transaccionlocalBeanSwingJInternalFrame.quitarFilaTotales();*/}
								if(this.jInternalFrameDetalleFormTipoTributario.facturaproveedorservicioBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoTributario.facturaproveedorservicioBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormTipoTributario.facturaproveedorservicioBeanSwingJInternalFrame.quitarFilaTotales();*/}
								if(this.jInternalFrameDetalleFormTipoTributario.definicionBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoTributario.definicionBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormTipoTributario.definicionBeanSwingJInternalFrame.quitarFilaTotales();*/}	
							}
							//ARCHITECTURE
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								tipotributarioLogic.saveTipoTributarioRelaciones(tipotributarioAux,this.jInternalFrameDetalleFormTipoTributario.transaccionlocalBeanSwingJInternalFrame.transaccionlocalLogic.getTransaccionLocals(),this.jInternalFrameDetalleFormTipoTributario.facturaproveedorservicioBeanSwingJInternalFrame.facturaproveedorservicioLogic.getFacturaProveedorServicios(),this.jInternalFrameDetalleFormTipoTributario.definicionBeanSwingJInternalFrame.definicionLogic.getDefinicions());//WithConnection
								//tipotributarioLogic.getSetVersionRowTipoTributarios();//WithConnection
							} else if(Constantes.ISUSAEJBREMOTE) {
							} else if(Constantes.ISUSAEJBHOME) {
							}
							//ARCHITECTURE
							
							//TALVEZ ESTA DEMAS POR SER UPDATE
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							this.bugActualizarReferenciaActual(this.tipotributario,tipotributarioAux);
					
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								
							this.jInternalFrameDetalleFormTipoTributario.transaccionlocalBeanSwingJInternalFrame.transaccionlocalLogic.setTransaccionLocals(new ArrayList<TransaccionLocal>());
							this.jInternalFrameDetalleFormTipoTributario.facturaproveedorservicioBeanSwingJInternalFrame.facturaproveedorservicioLogic.setFacturaProveedorServicios(new ArrayList<FacturaProveedorServicio>());
							this.jInternalFrameDetalleFormTipoTributario.definicionBeanSwingJInternalFrame.definicionLogic.setDefinicions(new ArrayList<Definicion>());
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							this.jInternalFrameDetalleFormTipoTributario.transaccionlocalBeanSwingJInternalFrame.transaccionlocals= new ArrayList<TransaccionLocal>();
							this.jInternalFrameDetalleFormTipoTributario.facturaproveedorservicioBeanSwingJInternalFrame.facturaproveedorservicios= new ArrayList<FacturaProveedorServicio>();
							this.jInternalFrameDetalleFormTipoTributario.definicionBeanSwingJInternalFrame.definicions= new ArrayList<Definicion>();
							}
							//ARCHITECTURE
						} else {
							
							

							if(this.jInternalFrameDetalleFormTipoTributario.transaccionlocalBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoTributario.transaccionlocalBeanSwingJInternalFrame.conTotales) {this.jInternalFrameDetalleFormTipoTributario.transaccionlocalBeanSwingJInternalFrame.quitarFilaTotales();}
							tipotributarioAux.setTransaccionLocals(this.jInternalFrameDetalleFormTipoTributario.transaccionlocalBeanSwingJInternalFrame.transaccionlocalLogic.getTransaccionLocals());

							if(this.jInternalFrameDetalleFormTipoTributario.facturaproveedorservicioBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoTributario.facturaproveedorservicioBeanSwingJInternalFrame.conTotales) {this.jInternalFrameDetalleFormTipoTributario.facturaproveedorservicioBeanSwingJInternalFrame.quitarFilaTotales();}
							tipotributarioAux.setFacturaProveedorServicios(this.jInternalFrameDetalleFormTipoTributario.facturaproveedorservicioBeanSwingJInternalFrame.facturaproveedorservicioLogic.getFacturaProveedorServicios());

							if(this.jInternalFrameDetalleFormTipoTributario.definicionBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoTributario.definicionBeanSwingJInternalFrame.conTotales) {this.jInternalFrameDetalleFormTipoTributario.definicionBeanSwingJInternalFrame.quitarFilaTotales();}
							tipotributarioAux.setDefinicions(this.jInternalFrameDetalleFormTipoTributario.definicionBeanSwingJInternalFrame.definicionLogic.getDefinicions());
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								if(this.tipotributarioSessionBean.getEstaModoGuardarRelaciones() 
									|| this.tipotributarioSessionBean.getEsGuardarRelacionado())	{
									actualizarLista(tipotributarioAux,tipotributarioLogic.getTipoTributarios());
								}
							} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
								actualizarLista(tipotributarioAux,tipotributarios);
							}
							//ARCHITECTURE
							
							//AQUI EL ID NEGATIVO ES EL ID BUSCADO, YA QUE NO SE GENERA OTRO EN LA DB POR INGRESAR UNO NUEVO							
							//TALVEZ ESTA DEMAS POR SER UPDATE
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							//this.bugActualizarReferenciaActual(this.tipotributario,tipotributarioAux);
					
						}
					}
				}				
			} else if(maintenanceType==MaintenanceType.ELIMINAR) {
				tipotributarioAux=new  TipoTributario();
				
				tipotributarioAux.setIsNew(false);
				tipotributarioAux.setIsChanged(false);
				
				tipotributarioAux.setIsDeleted(true);
				
				tipotributarioAux.setId(this.tipotributario.getId());	
				tipotributarioAux.setVersionRow(this.tipotributario.getVersionRow());	
				tipotributarioAux.setid_pais(this.tipotributario.getid_pais());	
				tipotributarioAux.setcodigo(this.tipotributario.getcodigo());	
				tipotributarioAux.setnombre(this.tipotributario.getnombre());	
				
				if(this.tipotributarioSessionBean.getEsGuardarRelacionado()) {
					//ELEMENTO ACTUAL NO SE HA INGRESADO AL SISTEMA, NO SE PUEDE ELIMINAR ALGO QUE NO EXISTE
					if(this.tipotributarioAux.getId()>=0) {	
						this.tipotributariosEliminados.add(tipotributarioAux);											
					}
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					actualizarLista(tipotributarioAux,tipotributarioLogic.getTipoTributarios());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(tipotributarioAux,tipotributarios);
				}
				//ARCHITECTURE
				
				
				if(!isGuardarCambiosEnLote && !this.tipotributarioSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.tipotributarioSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						tipotributarioLogic.saveTipoTributarios();//WithConnection
						//tipotributarioLogic.getSetVersionRowTipoTributarios();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}	
					//ARCHITECTURE
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.tipotributarioSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
							this.jInternalFrameDetalleFormTipoTributario.transaccionlocalBeanSwingJInternalFrame.transaccionlocalLogic.getTransaccionLocals().addAll(this.jInternalFrameDetalleFormTipoTributario.transaccionlocalBeanSwingJInternalFrame.transaccionlocalsEliminados);
							this.jInternalFrameDetalleFormTipoTributario.facturaproveedorservicioBeanSwingJInternalFrame.facturaproveedorservicioLogic.getFacturaProveedorServicios().addAll(this.jInternalFrameDetalleFormTipoTributario.facturaproveedorservicioBeanSwingJInternalFrame.facturaproveedorserviciosEliminados);
							this.jInternalFrameDetalleFormTipoTributario.definicionBeanSwingJInternalFrame.definicionLogic.getDefinicions().addAll(this.jInternalFrameDetalleFormTipoTributario.definicionBeanSwingJInternalFrame.definicionsEliminados);
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
							this.jInternalFrameDetalleFormTipoTributario.transaccionlocalBeanSwingJInternalFrame.transaccionlocals.addAll(this.jInternalFrameDetalleFormTipoTributario.transaccionlocalBeanSwingJInternalFrame.transaccionlocalsEliminados);
							this.jInternalFrameDetalleFormTipoTributario.facturaproveedorservicioBeanSwingJInternalFrame.facturaproveedorservicios.addAll(this.jInternalFrameDetalleFormTipoTributario.facturaproveedorservicioBeanSwingJInternalFrame.facturaproveedorserviciosEliminados);
							this.jInternalFrameDetalleFormTipoTributario.definicionBeanSwingJInternalFrame.definicions.addAll(this.jInternalFrameDetalleFormTipoTributario.definicionBeanSwingJInternalFrame.definicionsEliminados);
						}
						//ARCHITECTURE
						
						
						if(!this.tipotributarioSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
								if(this.jInternalFrameDetalleFormTipoTributario.transaccionlocalBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoTributario.transaccionlocalBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormTipoTributario.transaccionlocalBeanSwingJInternalFrame.quitarFilaTotales();*/}
								if(this.jInternalFrameDetalleFormTipoTributario.facturaproveedorservicioBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoTributario.facturaproveedorservicioBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormTipoTributario.facturaproveedorservicioBeanSwingJInternalFrame.quitarFilaTotales();*/}
								if(this.jInternalFrameDetalleFormTipoTributario.definicionBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoTributario.definicionBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormTipoTributario.definicionBeanSwingJInternalFrame.quitarFilaTotales();*/}
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
								if(this.jInternalFrameDetalleFormTipoTributario.transaccionlocalBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoTributario.transaccionlocalBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormTipoTributario.transaccionlocalBeanSwingJInternalFrame.quitarFilaTotales();*/}
								if(this.jInternalFrameDetalleFormTipoTributario.facturaproveedorservicioBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoTributario.facturaproveedorservicioBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormTipoTributario.facturaproveedorservicioBeanSwingJInternalFrame.quitarFilaTotales();*/}
								if(this.jInternalFrameDetalleFormTipoTributario.definicionBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoTributario.definicionBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormTipoTributario.definicionBeanSwingJInternalFrame.quitarFilaTotales();*/}	
							}
							//ARCHITECTURE
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								tipotributarioLogic.saveTipoTributarioRelaciones(tipotributarioAux,this.jInternalFrameDetalleFormTipoTributario.transaccionlocalBeanSwingJInternalFrame.transaccionlocalLogic.getTransaccionLocals(),this.jInternalFrameDetalleFormTipoTributario.facturaproveedorservicioBeanSwingJInternalFrame.facturaproveedorservicioLogic.getFacturaProveedorServicios(),this.jInternalFrameDetalleFormTipoTributario.definicionBeanSwingJInternalFrame.definicionLogic.getDefinicions());//WithConnection
								//tipotributarioLogic.getSetVersionRowTipoTributarios();//WithConnection
							} else if(Constantes.ISUSAEJBREMOTE) {
							} else if(Constantes.ISUSAEJBHOME) {
							}
							//ARCHITECTURE
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								
							this.jInternalFrameDetalleFormTipoTributario.transaccionlocalBeanSwingJInternalFrame.transaccionlocalLogic.setTransaccionLocals(new ArrayList<TransaccionLocal>());
							this.jInternalFrameDetalleFormTipoTributario.facturaproveedorservicioBeanSwingJInternalFrame.facturaproveedorservicioLogic.setFacturaProveedorServicios(new ArrayList<FacturaProveedorServicio>());
							this.jInternalFrameDetalleFormTipoTributario.definicionBeanSwingJInternalFrame.definicionLogic.setDefinicions(new ArrayList<Definicion>());
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							this.jInternalFrameDetalleFormTipoTributario.transaccionlocalBeanSwingJInternalFrame.transaccionlocals= new ArrayList<TransaccionLocal>();
							this.jInternalFrameDetalleFormTipoTributario.facturaproveedorservicioBeanSwingJInternalFrame.facturaproveedorservicios= new ArrayList<FacturaProveedorServicio>();
							this.jInternalFrameDetalleFormTipoTributario.definicionBeanSwingJInternalFrame.definicions= new ArrayList<Definicion>();
							}
							//ARCHITECTURE
						}
					}  else {
							
						

							if(this.jInternalFrameDetalleFormTipoTributario.transaccionlocalBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoTributario.transaccionlocalBeanSwingJInternalFrame.conTotales) {this.jInternalFrameDetalleFormTipoTributario.transaccionlocalBeanSwingJInternalFrame.quitarFilaTotales();}
							tipotributarioAux.setTransaccionLocals(this.jInternalFrameDetalleFormTipoTributario.transaccionlocalBeanSwingJInternalFrame.transaccionlocalLogic.getTransaccionLocals());

							if(this.jInternalFrameDetalleFormTipoTributario.facturaproveedorservicioBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoTributario.facturaproveedorservicioBeanSwingJInternalFrame.conTotales) {this.jInternalFrameDetalleFormTipoTributario.facturaproveedorservicioBeanSwingJInternalFrame.quitarFilaTotales();}
							tipotributarioAux.setFacturaProveedorServicios(this.jInternalFrameDetalleFormTipoTributario.facturaproveedorservicioBeanSwingJInternalFrame.facturaproveedorservicioLogic.getFacturaProveedorServicios());

							if(this.jInternalFrameDetalleFormTipoTributario.definicionBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoTributario.definicionBeanSwingJInternalFrame.conTotales) {this.jInternalFrameDetalleFormTipoTributario.definicionBeanSwingJInternalFrame.quitarFilaTotales();}
							tipotributarioAux.setDefinicions(this.jInternalFrameDetalleFormTipoTributario.definicionBeanSwingJInternalFrame.definicionLogic.getDefinicions());
								
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							if(this.tipotributarioSessionBean.getEstaModoGuardarRelaciones() 
								|| this.tipotributarioSessionBean.getEsGuardarRelacionado())	{
								actualizarLista(tipotributarioAux,tipotributarioLogic.getTipoTributarios());
							}
						} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
							actualizarLista(tipotributarioAux,tipotributarios);
						}
						//ARCHITECTURE
					}
				}				
			} else if(maintenanceType==MaintenanceType.GUARDARCAMBIOS) {		
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipotributarioLogic.getTipoTributarios().addAll(this.tipotributariosEliminados);
					
					tipotributarioLogic.saveTipoTributarios();//WithConnection
					//tipotributarioLogic.getSetVersionRowTipoTributarios();//WithConnection
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}	
				//ARCHITECTURE
				this.refrescarForeignKeysDescripcionesTipoTributario();
				
				this.tipotributariosEliminados= new ArrayList<TipoTributario>();		
			}
			
			if(this.tipotributarioSessionBean.getEsGuardarRelacionado()) {
				 this.crearFilaTotales();
			}
			
			
									
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipotributarioSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				if(!this.isPostAccionSinMensaje) {
					JOptionPane.showMessageDialog(this,"Tipo Tributario GUARDADO CORRECTAMENTE","MANTENIMIENTO DE Tipo Tributario",JOptionPane.INFORMATION_MESSAGE);
					if(maintenanceType==MaintenanceType.NUEVO || maintenanceType==MaintenanceType.ACTUALIZAR) {
						//CUANDO ES NUEVO SE PIERDE REFERENCIA NO SE PORQUE
						this.tipotributario=tipotributarioAux;
					}
				}
			}
			
			this.isErrorGuardar=false;
			
			this.inicializarInvalidValues();
		/*
		} else {
			this.mostrarInvalidValues();	
		}
		*/
			
		} catch(Exception e) {
			this.isErrorGuardar=true;
			
			this.crearFilaTotales();
			
			throw e;
		} finally {
      		//this.finishProcessTipoTributario();
      	}
		
	}	
	
	public void actualizarRelaciones(TipoTributario tipotributarioLocal) throws Exception {
		
		if(this.tipotributarioSessionBean.getConGuardarRelaciones()) {			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
			
				tipotributarioLocal.setTransaccionLocals(this.jInternalFrameDetalleFormTipoTributario.transaccionlocalBeanSwingJInternalFrame.transaccionlocalLogic.getTransaccionLocals());
				tipotributarioLocal.setFacturaProveedorServicios(this.jInternalFrameDetalleFormTipoTributario.facturaproveedorservicioBeanSwingJInternalFrame.facturaproveedorservicioLogic.getFacturaProveedorServicios());
				tipotributarioLocal.setDefinicions(this.jInternalFrameDetalleFormTipoTributario.definicionBeanSwingJInternalFrame.definicionLogic.getDefinicions());
			
			} else {
			
				tipotributarioLocal.setTransaccionLocals(this.jInternalFrameDetalleFormTipoTributario.transaccionlocalBeanSwingJInternalFrame.transaccionlocals);
				tipotributarioLocal.setFacturaProveedorServicios(this.jInternalFrameDetalleFormTipoTributario.facturaproveedorservicioBeanSwingJInternalFrame.facturaproveedorservicios);
				tipotributarioLocal.setDefinicions(this.jInternalFrameDetalleFormTipoTributario.definicionBeanSwingJInternalFrame.definicions);	
			}
		}
	}
	
	public void actualizarRelacionFkPadreActual(TipoTributario tipotributarioLocal) throws Exception {	
		if(this.tipotributarioSessionBean.getEsGuardarRelacionado()) {			
			
		
			if(this.jInternalFrameParent.getClass().equals(PaisDetalleFormJInternalFrame.class)) {
				PaisBeanSwingJInternalFrame paisBeanSwingJInternalFrameLocal=(PaisBeanSwingJInternalFrame) ((PaisDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				paisBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoPais(paisBeanSwingJInternalFrameLocal.getpais(),true);
				paisBeanSwingJInternalFrameLocal.actualizarLista(paisBeanSwingJInternalFrameLocal.pais,this.paissForeignKey);

				paisBeanSwingJInternalFrameLocal.actualizarRelaciones(paisBeanSwingJInternalFrameLocal.pais);

				tipotributarioLocal.setPais(paisBeanSwingJInternalFrameLocal.pais);

				this.addItemDefectoCombosForeignKeyPais();
				this.cargarCombosFramePaissForeignKey("Formulario");
				this.setActualPaisForeignKey(paisBeanSwingJInternalFrameLocal.pais.getId(),false,"Formulario");
			}
		
		}
	}
	
	public Boolean validarTipoTributarioActual() throws Exception {
		Boolean estaValidado=false;
		this.inicializarInvalidValues();
		
		/*
		int intSelectedRow = this.jTableDatosTipoTributario.getSelectedRow();
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.tipotributario =(TipoTributario) this.tipotributarioLogic.getTipoTributarios().toArray()[this.jTableDatosTipoTributario.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
			this.tipotributario =(TipoTributario) this.tipotributarios.toArray()[this.jTableDatosTipoTributario.convertRowIndexToModel(intSelectedRow)];
		}
		//ARCHITECTURE
		*/
		
		this.invalidValues = tipotributarioValidator.getInvalidValues(this.tipotributario);
					
		if(this.invalidValues==null || this.invalidValues.length<=0) {
			estaValidado=true;
		} else {
			this.mostrarInvalidValues();	
		}
		
		return estaValidado;
	}
	
	public void actualizarLista(TipoTributario tipotributario,List<TipoTributario> tipotributarios) throws Exception {
		try	{		
			TipoTributarioConstantesFunciones.actualizarLista(tipotributario,tipotributarios,this.tipotributarioSessionBean.getEsGuardarRelacionado());		
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void actualizarSelectedLista(TipoTributario tipotributario,List<TipoTributario> tipotributarios) throws Exception {
		try	{			
			TipoTributarioConstantesFunciones.actualizarSelectedLista(tipotributario,tipotributarios);
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public Boolean tieneElementosSeleccionados() throws Exception {
		Boolean tiene=false;
		
		List<TipoTributario> tipotributariosLocal=null;
		
		try	{			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				tipotributariosLocal=this.tipotributarioLogic.getTipoTributarios();
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				tipotributariosLocal=this.tipotributarios;
			}
			//ARCHITECTURE
		
			for(TipoTributario tipotributarioLocal:tipotributariosLocal) {
				if(this.permiteMantenimiento(tipotributarioLocal) && tipotributarioLocal.getIsSelected()) {
					tiene=true;
					break;
				}
			}
		} catch(Exception e) {
			throw e;
		}
		
		return tiene;
	}			
	
	public void mostrarInvalidValues() throws Exception {
		String sMensaje="";
				
		for (InvalidValue invalidValue : this.invalidValues) {
			sMensaje+="\r\n"+TipoTributarioConstantesFunciones.getTipoTributarioLabelDesdeNombre(invalidValue.getPropertyName())+"->"+invalidValue.getMessage();
			
			//MOSTRAR CAMPOS INVALIDOS
			if(invalidValue.getPropertyName().equals(TipoTributarioConstantesFunciones.IDPAIS)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTipoTributario.jLabelid_paisTipoTributario,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(TipoTributarioConstantesFunciones.CODIGO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTipoTributario.jLabelcodigoTipoTributario,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(TipoTributarioConstantesFunciones.NOMBRE)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTipoTributario.jLabelnombreTipoTributario,invalidValue.getMessage());}
        }
		
		
		if(!sMensaje.equals("")) {
			//JOptionPane.showMessageDialog(this,sMensaje,"VALIDACION ",JOptionPane.ERROR_MESSAGE);
			throw new Exception(sMensaje);			
		}
		
		/*
		System.out.println(invalidValue);
        System.out.println("message=" + invalidValue.getMessage());
        System.out.println("propertyName=" + invalidValue.getPropertyName());
        System.out.println("propertyPath=" + invalidValue.getPropertyPath());
        System.out.println("value=" + invalidValue.getValue());
        */
	}		
	
	public void inicializarInvalidValues() throws Exception {
		String sMensaje="";	
		
		if(this.jInternalFrameDetalleFormTipoTributario!=null) {
		
		//MOSTRAR CAMPOS INVALIDOS
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormTipoTributario.jLabelid_paisTipoTributario,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormTipoTributario.jLabelcodigoTipoTributario,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormTipoTributario.jLabelnombreTipoTributario,"");
		
		}
	}
	
	
	
	public void actualizarObjetoPadreFk(String sTipo)  throws Exception {
		if(sTipo.equals("XXXAuxiliar")) {
		
		}
		
		 else  if(sTipo.equals("TransaccionLocal")) {
			if(this.tipotributario==null) {
				this.tipotributario= new TipoTributario();
			}

			if(this.tipotributarioSessionBean.getConGuardarRelaciones()) { //&& this.isEsNuevoTipoTributario
				this.setVariablesFormularioToObjetoActualTipoTributario(this.tipotributario,true);//false
				this.setVariablesFormularioToObjetoActualForeignKeysTipoTributario(this.tipotributario);

				this.jInternalFrameDetalleFormTipoTributario.transaccionlocalBeanSwingJInternalFrame.gettransaccionlocal().setTipoTributario(this.tipotributario);
			}

			return;
		}
		 else  if(sTipo.equals("FacturaProveedorServicio")) {
			if(this.tipotributario==null) {
				this.tipotributario= new TipoTributario();
			}

			if(this.tipotributarioSessionBean.getConGuardarRelaciones()) { //&& this.isEsNuevoTipoTributario
				this.setVariablesFormularioToObjetoActualTipoTributario(this.tipotributario,true);//false
				this.setVariablesFormularioToObjetoActualForeignKeysTipoTributario(this.tipotributario);

				this.jInternalFrameDetalleFormTipoTributario.facturaproveedorservicioBeanSwingJInternalFrame.getfacturaproveedorservicio().setTipoTributario(this.tipotributario);
			}

			return;
		}
		 else  if(sTipo.equals("Definicion")) {
			if(this.tipotributario==null) {
				this.tipotributario= new TipoTributario();
			}

			if(this.tipotributarioSessionBean.getConGuardarRelaciones()) { //&& this.isEsNuevoTipoTributario
				this.setVariablesFormularioToObjetoActualTipoTributario(this.tipotributario,true);//false
				this.setVariablesFormularioToObjetoActualForeignKeysTipoTributario(this.tipotributario);

				this.jInternalFrameDetalleFormTipoTributario.definicionBeanSwingJInternalFrame.getdefinicion().setTipoTributario(this.tipotributario);
			}

			return;
		}
	}
	
	public void nuevoPreparar() throws Exception {
		this.nuevoPreparar(false);
	}
	
	public void nuevoPreparar(Boolean esNuevoGuardarCambios) throws Exception {
		this.iIdNuevoTipoTributario--;	
		
		
		this.tipotributarioAux=new TipoTributario();
		
		this.tipotributarioAux.setId(this.iIdNuevoTipoTributario);
		this.tipotributarioAux.setIsChanged(true);
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.tipotributarioLogic.getTipoTributarios().add(this.tipotributarioAux);
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.tipotributarios.add(this.tipotributarioAux);
		}
		//ARCHITECTURE
		
		this.tipotributario=this.tipotributarioAux;
		
		if(TipoTributarioJInternalFrame.ISBINDING_MANUAL_TABLA) {
			this.setVariablesObjetoActualToFormularioTipoTributario(this.tipotributario);
			this.setVariablesObjetoActualToFormularioForeignKeyTipoTributario(this.tipotributario);
		}
				
		//this.setDefaultControlesTipoTributario();
		
		this.inicializarInvalidValues();
				
		//SELECCIONA ITEM DEFECTO-->SET O SELECTED INDEX
		this.setItemDefectoCombosForeignKeyTipoTributario();
		
		
		//INICIALIZA VARIABLES COMBOS GLOBALES A FORMULARIO(ParametroGeneralUsuario)
		this.setVariablesGlobalesCombosForeignKeyTipoTributario();
		
		//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
		//this.setVariablesGlobalesAuxiliaresCombosForeignKeyTipoTributario();
		
		//SI TIENE FOREIGN KEY CON CAMPO esDefecto=true, SE ACTUALIZA A OBJETO ACTUAL
		this.setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualTipoTributario(this.tipotributarioBean,this.tipotributario,false,false);
		
		//ACTUALIZA VALORES PARA EL OBJETO ACTUAL ANTES DE ENVIARLO A ACTUALIZAR
		this.setVariablesFormularioToObjetoActualForeignKeysTipoTributario(this.tipotributario);
				
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		if(this.jInternalFrameParent!=null) {
			this.jInternalFrameParent.actualizarObjetoPadreFk(TipoTributarioConstantesFunciones.CLASSNAME);
		}	
		
		
		if(this.tipotributarioSessionBean.getConGuardarRelaciones()) {
			classes=TipoTributarioConstantesFunciones.getClassesRelationshipsOfTipoTributario(new ArrayList<Classe>(),DeepLoadType.NONE);
		}
		
		this.classesActual=new ArrayList<Classe>();
		this.classesActual.addAll(classes);
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {						
			this.tipotributarioReturnGeneral=tipotributarioLogic.procesarEventosTipoTributariosWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,EventoGlobalTipo.FORM_RECARGAR,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.tipotributarioLogic.getTipoTributarios(),this.tipotributario,this.tipotributarioParameterGeneral,this.isEsNuevoTipoTributario,classes);//this.tipotributarioLogic.getTipoTributario()
						
		} else if(Constantes.ISUSAEJBREMOTE) {
						
		} else if(Constantes.ISUSAEJBHOME) {
		}
		//ARCHITECTURE
		
		//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
		//this.setVariablesObjetoReturnGeneralToBeanTipoTributario(this.tipotributarioReturnGeneral,this.tipotributarioBean,false);
		
		if(this.tipotributarioReturnGeneral.getConRecargarPropiedades()) {
			//INICIALIZA VARIABLES COMBOS NORMALES (FK)
			this.setVariablesObjetoActualToFormularioForeignKeyTipoTributario(this.tipotributarioReturnGeneral.getTipoTributario());
			
			//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
			this.setVariablesObjetoActualToFormularioTipoTributario(this.tipotributarioReturnGeneral.getTipoTributario());
		}
		
		if(this.tipotributarioReturnGeneral.getConRecargarRelaciones()) {
			//INICIALIZA VARIABLES RELACIONES A FORMULARIO
			this.setVariablesRelacionesObjetoActualToFormularioTipoTributario(this.tipotributarioReturnGeneral.getTipoTributario(),classes);//this.tipotributarioBean);	
		}
			
		//ACTUALIZA VARIABLES FORMULARIO A OBJETO ACTUAL (PARA NUEVO TABLA O GUARDAR CAMBIOS
		if(esNuevoGuardarCambios) {
			this.setVariablesFormularioToObjetoActualTipoTributario(this.tipotributario,false);
		}
		
		//INICIALIZA VARIABLES COMBOS DEFAULT DEL PROYECTO(|DEFAULT para FK)
		//this.setVariablesDefaultCombosForeignKeyTipoTributario();
		
		//INICIALIZA VARIABLES COMBOS PARAMETRO DEL PROYECTO(|VALORPARAM Era para ParametroModulo, ahora en logic)
		//this.setVariablesParametroCombosForeignKeyTipoTributario();						
		
		if(!esNuevoGuardarCambios) {
			//INICIALIZA VARIABLES POR OPCION MENU
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			TipoTributarioBeanSwingJInternalFrameAdditional.RecargarFormTipoTributario(this,"NUEVO_PREPARAR","",this.arrDatoGeneral);
		
			//NO FUNCIONA BINDINGS			
			this.inicializarActualizarBindingTipoTributario(false);
						
			if(tipotributarioSessionBean.getConGuardarRelaciones()) {
				//DEBERIA YA ESTAR CARGADO LOS COMBOS Y SI SE NECESITA ALGO MAS SE DEBE CREAR FUNCION LIMITADA
				//SI DEBE TRAER Y RESETEAR TABLA
				

				if(this.jInternalFrameDetalleFormTipoTributario.transaccionlocalBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoTributario.transaccionlocalBeanSwingJInternalFrame.transaccionlocalSessionBean.getEsGuardarRelacionado() && TransaccionLocalJInternalFrame.ESTA_CARGADO_PORPARTE) {
					this.jButtonTransaccionLocalActionPerformed(null,-1,false,true,null);
				}

				if(this.jInternalFrameDetalleFormTipoTributario.facturaproveedorservicioBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoTributario.facturaproveedorservicioBeanSwingJInternalFrame.facturaproveedorservicioSessionBean.getEsGuardarRelacionado() && FacturaProveedorServicioJInternalFrame.ESTA_CARGADO_PORPARTE) {
					this.jButtonFacturaProveedorServicioActionPerformed(null,-1,false,true,null);
				}

				if(this.jInternalFrameDetalleFormTipoTributario.definicionBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoTributario.definicionBeanSwingJInternalFrame.definicionSessionBean.getEsGuardarRelacionado() && DefinicionJInternalFrame.ESTA_CARGADO_PORPARTE) {
					this.jButtonDefinicionActionPerformed(null,-1,false,true,null);
				}				
			}
				
			//SI ES MANUAL
			if(TipoTributarioJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualTipoTributario();
			}
			
			this.actualizarVisualTableDatosTipoTributario();
			
			this.jTableDatosTipoTributario.setRowSelectionInterval(this.getIndiceNuevoTipoTributario(), this.getIndiceNuevoTipoTributario());
			
			this.seleccionarFilaTablaTipoTributarioActual();
						
			this.actualizarEstadoCeldasBotonesTipoTributario("a", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		}		
	}
	
	public void habilitarDeshabilitarControlesTipoTributario(Boolean isHabilitar) throws Exception {
		
		this.jInternalFrameDetalleFormTipoTributario.jTextAreacodigoTipoTributario.setEnabled(isHabilitar && this.tipotributarioConstantesFunciones.activarcodigoTipoTributario);
		this.jInternalFrameDetalleFormTipoTributario.jTextAreanombreTipoTributario.setEnabled(isHabilitar && this.tipotributarioConstantesFunciones.activarnombreTipoTributario);	
		
		this.jInternalFrameDetalleFormTipoTributario.jComboBoxid_paisTipoTributario.setEnabled(isHabilitar && this.tipotributarioConstantesFunciones.activarid_paisTipoTributario);
	};
	
	public void setDefaultControlesTipoTributario() throws Exception {
			
	};
	
	
	public void habilitarDeshabilitarTipoMantenimientoTipoTributario(Boolean esRelaciones) throws Exception {
		if(esRelaciones) {
			//this.tipotributarioSessionBean.setConGuardarRelaciones(true);			
			this.tipotributarioSessionBean.setEstaModoGuardarRelaciones(true);				
			this.jInternalFrameDetalleFormTipoTributario.jTabbedPaneRelacionesTipoTributario.setVisible(true);
			
			

			if(this.jInternalFrameDetalleFormTipoTributario.transaccionlocalBeanSwingJInternalFrame!=null) {
				this.jInternalFrameDetalleFormTipoTributario.transaccionlocalBeanSwingJInternalFrame.transaccionlocalSessionBean.setEsGuardarRelacionado(true);
				//this.jInternalFrameDetalleFormTipoTributario.transaccionlocalBeanSwingJInternalFrame.getContentPane().setVisible(true);
			}

			if(this.jInternalFrameDetalleFormTipoTributario.facturaproveedorservicioBeanSwingJInternalFrame!=null) {
				this.jInternalFrameDetalleFormTipoTributario.facturaproveedorservicioBeanSwingJInternalFrame.facturaproveedorservicioSessionBean.setEsGuardarRelacionado(true);
				//this.jInternalFrameDetalleFormTipoTributario.facturaproveedorservicioBeanSwingJInternalFrame.getContentPane().setVisible(true);
			}

			if(this.jInternalFrameDetalleFormTipoTributario.definicionBeanSwingJInternalFrame!=null) {
				this.jInternalFrameDetalleFormTipoTributario.definicionBeanSwingJInternalFrame.definicionSessionBean.setEsGuardarRelacionado(true);
				//this.jInternalFrameDetalleFormTipoTributario.definicionBeanSwingJInternalFrame.getContentPane().setVisible(true);
			}		
		} else {
			//this.tipotributarioSessionBean.setConGuardarRelaciones(false);			
			this.tipotributarioSessionBean.setEstaModoGuardarRelaciones(false);						
			this.jInternalFrameDetalleFormTipoTributario.jTabbedPaneRelacionesTipoTributario.setVisible(false);
			
			

			if(this.jInternalFrameDetalleFormTipoTributario.transaccionlocalBeanSwingJInternalFrame!=null) {
				this.jInternalFrameDetalleFormTipoTributario.transaccionlocalBeanSwingJInternalFrame.transaccionlocalSessionBean.setEsGuardarRelacionado(false);
				//this.jInternalFrameDetalleFormTipoTributario.transaccionlocalBeanSwingJInternalFrame.getContentPane().setVisible(false);
			}

			if(this.jInternalFrameDetalleFormTipoTributario.facturaproveedorservicioBeanSwingJInternalFrame!=null) {
				this.jInternalFrameDetalleFormTipoTributario.facturaproveedorservicioBeanSwingJInternalFrame.facturaproveedorservicioSessionBean.setEsGuardarRelacionado(false);
				//this.jInternalFrameDetalleFormTipoTributario.facturaproveedorservicioBeanSwingJInternalFrame.getContentPane().setVisible(false);
			}

			if(this.jInternalFrameDetalleFormTipoTributario.definicionBeanSwingJInternalFrame!=null) {
				this.jInternalFrameDetalleFormTipoTributario.definicionBeanSwingJInternalFrame.definicionSessionBean.setEsGuardarRelacionado(false);
				//this.jInternalFrameDetalleFormTipoTributario.definicionBeanSwingJInternalFrame.getContentPane().setVisible(false);
			}
		}
	};
	
	public int getIndiceNuevoTipoTributario() throws Exception {
		int iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(TipoTributario tipotributarioAux:this.tipotributarioLogic.getTipoTributarios()) {
				if(tipotributarioAux.getId().equals(this.iIdNuevoTipoTributario)) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(TipoTributario tipotributarioAux:this.tipotributarios) {
				if(tipotributarioAux.getId().equals(this.iIdNuevoTipoTributario)) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		}
		//ARCHITECTURE
		
		if(!existe) {
			//SI NO EXISTE TOMA LA ULTIMA FILA
			iIndice=iIndice-1;
		}
		
		return iIndice;
	}
	
	public int getIndiceActualTipoTributario(TipoTributario tipotributario,Integer iIndiceActual) throws Exception {
		Integer iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(TipoTributario tipotributarioAux:this.tipotributarioLogic.getTipoTributarios()) {
				if(tipotributarioAux.getId().equals(tipotributario.getId())) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(TipoTributario tipotributarioAux:this.tipotributarios) {
				if(tipotributarioAux.getId().equals(tipotributario.getId())) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		}
		//ARCHITECTURE
		
		if(!existe) {
			//SI NO EXISTE TOMA LA ULTIMA FILA
			iIndice=iIndiceActual;
		}
		
		return iIndice;
	}
	
	public void setCamposBaseDesdeOriginalTipoTributario(TipoTributario tipotributarioOriginal) throws Exception {
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(TipoTributario tipotributarioAux:this.tipotributarioLogic.getTipoTributarios()) {
				if(tipotributarioAux.getTipoTributarioOriginal().getId().equals(tipotributarioOriginal.getId())) {
					existe=true;
					tipotributarioOriginal.setId(tipotributarioAux.getId());
					tipotributarioOriginal.setVersionRow(tipotributarioAux.getVersionRow());
					break;
				}
				
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(TipoTributario tipotributarioAux:this.tipotributarios) {
				if(tipotributarioAux.getTipoTributarioOriginal().getId().equals(tipotributarioOriginal.getId())) {
					existe=true;
					tipotributarioOriginal.setId(tipotributarioAux.getId());
					tipotributarioOriginal.setVersionRow(tipotributarioAux.getVersionRow());
					break;
				}				
			}
		}
		//ARCHITECTURE
		
		if(!existe) {
			//SI NO EXISTE TOMA LA ULTIMA FILA
		}
	}
	
	public void cancelarNuevosTipoTributario(Boolean esParaCancelar) throws Exception {
		tipotributariosAux=new ArrayList<TipoTributario>();
		tipotributarioAux=new TipoTributario();
		
		if(!this.tipotributarioSessionBean.getEsGuardarRelacionado()) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(TipoTributario tipotributarioAux:this.tipotributarioLogic.getTipoTributarios()) {
					if(tipotributarioAux.getId()<0) {
						tipotributariosAux.add(tipotributarioAux);
					}		
				}
				this.iIdNuevoTipoTributario=0L;
				this.tipotributarioLogic.getTipoTributarios().removeAll(tipotributariosAux);
					
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(TipoTributario tipotributarioAux:this.tipotributarios) {
					if(tipotributarioAux.getId()<0) {
						tipotributariosAux.add(tipotributarioAux);
					}		
				}
				this.iIdNuevoTipoTributario=0L;
				this.tipotributarios.removeAll(tipotributariosAux);
			}	
		} else {			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				if(esParaCancelar && this.isEsNuevoTipoTributario 
					&& this.tipotributarioLogic.getTipoTributarios().size()>0
					) {
					tipotributarioAux=this.tipotributarioLogic.getTipoTributarios().get(this.tipotributarioLogic.getTipoTributarios().size() - 1);
				
					if(tipotributarioAux.getId()<0) {
						this.tipotributarioLogic.getTipoTributarios().remove(tipotributarioAux);
					}
				}
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				if(esParaCancelar && this.isEsNuevoTipoTributario && this.tipotributarios.size()>0) {
					tipotributarioAux=this.tipotributarios.get(this.tipotributarios.size() - 1);
				
					if(tipotributarioAux.getId()<0) {
						this.tipotributarios.remove(tipotributarioAux);
					}
				}
			}	
		}
	}
	
	public void cancelarNuevoTipoTributario(Boolean esParaCancelar) throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			if(tipotributario.getId()<0) {
				this.tipotributarioLogic.getTipoTributarios().remove(this.tipotributario);
			}					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			if(tipotributario.getId()<0) {
				this.tipotributarios.remove(this.tipotributario);
			}
		}			
	}
	
	public void setEstadosInicialesTipoTributario(List<TipoTributario> tipotributariosAux) throws Exception {
		TipoTributarioConstantesFunciones.setEstadosInicialesTipoTributario(tipotributariosAux);
	}
	
	public void setEstadosInicialesTipoTributario(TipoTributario tipotributarioAux) throws Exception {
		TipoTributarioConstantesFunciones.setEstadosInicialesTipoTributario(tipotributarioAux);		
	}
	
	public void nuevo() throws Exception {
		try	{
			//ESTA VALIDADO EN FUNCION ACTUALIZAR
			//if(this.validarTipoTributarioActual()) {
				this.ejecutarMantenimiento(MaintenanceType.NUEVO);
				
				this.actualizarEstadoCeldasBotonesTipoTributario("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
				
			//}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoTributarioConstantesFunciones.CLASSNAME);
		}
	}
	
	public void actualizar() throws Exception {
		try	{
			if(this.validarTipoTributarioActual()) {
				if(!this.isEsNuevoTipoTributario) {
					this.ejecutarMantenimiento(MaintenanceType.ACTUALIZAR);
					
					this.actualizarEstadoCeldasBotonesTipoTributario("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
					
				} else {					
					this.nuevo();
					this.isEsNuevoTipoTributario=false;
				}
				
				//SE CANCELA AL FINAL DEL PROCESO JBUTTONACTUALIZAR
				//this.cancelar(false);
			}		
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoTributarioConstantesFunciones.CLASSNAME);
		}
	}
	
	public void eliminar() throws Exception {
		try	{	
			if(this.validarTipoTributarioActual()) {
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE ELIMINAR EL/LA Tipo Tributario ?", "MANTENIMIENTO DE Tipo Tributario", JOptionPane.OK_CANCEL_OPTION) == 0) {
					this.ejecutarMantenimiento(MaintenanceType.ELIMINAR);			
					this.actualizarEstadoCeldasBotonesTipoTributario("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
				}
			
			}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoTributarioConstantesFunciones.CLASSNAME);
		}
	}
	
	public void guardarCambios() throws Exception {
		try	{
			this.ejecutarMantenimiento(MaintenanceType.GUARDARCAMBIOS);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoTributarioConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarAsignar(TipoTributario tipotributario) throws Exception {
		TipoTributarioConstantesFunciones.seleccionarAsignar(this.tipotributario,tipotributario);
	}
	
	public void seleccionar() throws Exception {
		try	{
			//ACTUALIZO EL PERMISO ACTUALIZAR CON EL PERMISO ACTUALIZAR ORIGINAL ESTE PERMISO SE UTILIZA PARA EL NUEVO TAMBIEN
			this.isPermisoActualizarTipoTributario=this.isPermisoActualizarOriginalTipoTributario;
			
			
			this.seleccionarAsignar(tipotributario);
			
			
			
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			TipoTributarioConstantesFunciones.quitarEspaciosTipoTributario(this.tipotributario,this.arrDatoGeneral);
			
			
			this.actualizarEstadoCeldasBotonesTipoTributario("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoTributarioConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarBusqueda(Long id) throws Exception {
		try	{
			this.tipotributarioSessionBean.setsFuncionBusquedaRapida(this.tipotributarioSessionBean.getsFuncionBusquedaRapida().replace("TO_REPLACE", id.toString()));
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoTributarioConstantesFunciones.CLASSNAME);
		}
	}
	
	
	
	public void cancelar() throws Exception {
		this.cancelar(true);
	}
	
	public void cancelar(Boolean esParaCancelar) throws Exception {
		try {
														
			
			//SE UTILIZA COLUMNA ELIMINAR EN TABLA
			if(this.isEsNuevoTipoTributario) {
				//NO CANCELA TODOS NUEVOS POR FUNCIONALIDAD GUARDAR CAMBIOS
				//this.cancelarNuevosTipoTributario(esParaCancelar);				
				this.cancelarNuevoTipoTributario(esParaCancelar);								
			}
			
			this.tipotributario=new TipoTributario();
			
			this.inicializarTipoTributario();
			
			this.actualizarEstadoCeldasBotonesTipoTributario("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoTributarioConstantesFunciones.CLASSNAME);
		}
	}
	
	public void inicializarTipoTributario() throws Exception {
		try {
			TipoTributarioConstantesFunciones.inicializarTipoTributario(this.tipotributario);
			
			} catch(Exception e) {
			throw e;
		}
	}
	
	public void anteriores()throws Exception {
		try	{
			//this.iNumeroPaginacionPagina=this.iNumeroPaginacionPagina-this.iNumeroPaginacion;
			
			if(this.iNumeroPaginacionPagina-this.iNumeroPaginacion<this.iNumeroPaginacion) {
				this.iNumeroPaginacionPagina=0;		
			} else {
				this.iNumeroPaginacionPagina=this.iNumeroPaginacionPagina-this.iNumeroPaginacion;
			}
			
			this.procesarBusqueda(this.sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoTributarioConstantesFunciones.CLASSNAME);
		}
	}
	
	public void siguientes()throws Exception {
		try	{			
			if(this.tipotributarioLogic.getTipoTributarios().size()>0) {
					
				this.iNumeroPaginacionPagina=this.iNumeroPaginacionPagina+this.iNumeroPaginacion;
			}
				
			this.procesarBusqueda(this.sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoTributarioConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void generarReporteTipoTributarios(String sAccionBusqueda,List<TipoTributario> tipotributariosParaReportes) throws Exception {
		//HttpSession httpSession = httpServletRequest.getSession();
		Long iIdUsuarioSesion=0L;	
		
		
		if(usuarioActual==null) {
			this.usuarioActual=new Usuario();
		}
		
		iIdUsuarioSesion=usuarioActual.getId();
		
		String sPathReportes="";
		
		InputStream reportFile=null;
		InputStream imageFile=null;
			
		imageFile=AuxiliarImagenes.class.getResourceAsStream("LogoReporte.jpg");			
				
		
		String sPathReporteFinal="";
		
		if(!esReporteAccionProceso) {
			if(!this.sTipoReporte.equals("RELACIONES")) {//!isEsReporteRelaciones
				if(!this.esReporteDinamico) {
					sPathReporteFinal="TipoTributario"+this.sTipoReporteExtra+"Design.jasper";
					reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);	
				} else {
					sPathReporteFinal=this.sPathReporteDinamico;
					reportFile = new FileInputStream(sPathReporteFinal);
				}
			} else {
				sPathReporteFinal="TipoTributarioMasterRelaciones"+this.sTipoReporteExtra+"Design.jasper";
				reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);
				//sPathReportes=reportFile.getPath().replace("TipoTributarioMasterRelacionesDesign.jasper", "");
			}
		} else {
				sPathReporteFinal="TipoTributario"+this.sTipoReporteExtra+"Design.jasper";
				reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);	
		}
		
		if(reportFile==null) {
			throw new JRRuntimeException(sPathReporteFinal+" no existe");
		}
		
		String sUsuario="";
		
		if(usuarioActual!=null) {
			sUsuario=usuarioActual.getuser_name();
		}
		
		Map<String, Object> parameters = new HashMap<String, Object>();
		parameters.put("usuario", sUsuario);
		
		parameters.put("titulo", Funciones.GetTituloSistemaReporte(this.parametroGeneralSg,this.moduloActual,this.usuarioActual));
		parameters.put("subtitulo", "Reporte De  Tipo Tributarios");		
		parameters.put("busquedapor", TipoTributarioConstantesFunciones.getNombreIndice(sAccionBusqueda)+sDetalleReporte);
		
		
		if(this.sTipoReporte.equals("RELACIONES")) {//isEsReporteRelaciones
			parameters.put("SUBREPORT_DIR", sPathReportes);
		}
		
		parameters.put("con_grafico", this.conGraficoReporte);
		
		JasperReport jasperReport = (JasperReport)JRLoader.loadObject(reportFile);
				
		this.cargarDatosCliente();
		
		ArrayList<Classe> classes=new ArrayList<Classe>();		
		
		if(this.sTipoReporte.equals("RELACIONES")) {//isEsReporteRelaciones
			
			classes.add(new Classe(TransaccionLocal.class));
			classes.add(new Classe(FacturaProveedorServicio.class));
			classes.add(new Classe(Definicion.class));
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {		
				try	{
					
					TipoTributarioLogic tipotributarioLogicAuxiliar=new TipoTributarioLogic();
					tipotributarioLogicAuxiliar.setDatosCliente(tipotributarioLogic.getDatosCliente());				
					tipotributarioLogicAuxiliar.setTipoTributarios(tipotributariosParaReportes);
					
					tipotributarioLogicAuxiliar.cargarRelacionesLoteForeignKeyTipoTributarioWithConnection(); //deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes, "");
					
					tipotributariosParaReportes=tipotributarioLogicAuxiliar.getTipoTributarios();
					
					//tipotributarioLogic.getNewConnexionToDeep();
					
					//for (TipoTributario tipotributario:tipotributariosParaReportes) {
					//	tipotributarioLogic.deepLoad(tipotributario, false, DeepLoadType.INCLUDE, classes);
					//}						
					//tipotributarioLogic.commitNewConnexionToDeep();
					
						
				} catch(Exception e) {
					throw e;
					
				} finally {
					//tipotributarioLogic.closeNewConnexionToDeep();
				}
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
			//ARCHITECTURE		
			
		
			
			

			InputStream reportFileTransaccionLocal = AuxiliarReportes.class.getResourceAsStream("TransaccionLocalDetalleRelacionesDesign.jasper");
			parameters.put("subreport_transaccionlocal", reportFileTransaccionLocal);

			InputStream reportFileFacturaProveedorServicio = AuxiliarReportes.class.getResourceAsStream("FacturaProveedorServicioDetalleRelacionesDesign.jasper");
			parameters.put("subreport_facturaproveedorservicio", reportFileFacturaProveedorServicio);

			InputStream reportFileDefinicion = AuxiliarReportes.class.getResourceAsStream("DefinicionDetalleRelacionesDesign.jasper");
			parameters.put("subreport_definicion", reportFileDefinicion);
		} else {
			//FK DEBERIA TRAERSE DE ANTEMANO
			
		}
								
		
		//CLASSES PARA REPORTES OBJETOS RELACIONADOS
		if(!this.sTipoReporte.equals("RELACIONES")) {//!isEsReporteRelaciones
			classes=new ArrayList<Classe>();
		}
		
		JRBeanArrayDataSource jrbeanArrayDataSourceTipoTributario=null;
		
		if(this.sTipoReporteExtra!=null && !this.sTipoReporteExtra.equals("")) {
			TipoTributarioConstantesFunciones.S_TIPOREPORTE_EXTRA=this.sTipoReporteExtra;
		} else {
			TipoTributarioConstantesFunciones.S_TIPOREPORTE_EXTRA="";
		}
		
		jrbeanArrayDataSourceTipoTributario=new JRBeanArrayDataSource(TipoTributarioJInternalFrame.TraerTipoTributarioBeans(tipotributariosParaReportes,classes).toArray());
		
		jasperPrint = JasperFillManager.fillReport(jasperReport,parameters,jrbeanArrayDataSourceTipoTributario);
				
		
		String sPathDest=Constantes.SUNIDAD_ARCHIVOS+":/"+Constantes.SCONTEXTSERVER+"/"+TipoTributarioConstantesFunciones.SCHEMA+"/reportes";
		
		File filePathDest = new File(sPathDest);
		
		if(!filePathDest.exists()) {
			filePathDest.mkdirs();				
		}
				
		String sDestFileName=sPathDest+"/"+TipoTributarioConstantesFunciones.CLASSNAME;
				
		if(this.sTipoArchivoReporte=="VISUALIZAR") {
			JasperViewer jasperViewer = new JasperViewer(jasperPrint,false) ;
			jasperViewer.setVisible(true) ; 

		} else if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML") {	
			//JasperFillManager.fillReportToFile(reportFile.getAbsolutePath(),parameters, new JRBeanArrayDataSource(TipoTributarioBean.TraerTipoTributarioBeans(tipotributariosParaReportes).toArray()));
							
			if(this.sTipoArchivoReporte=="HTML") {
				sDestFileName+=".html";
				JasperExportManager.exportReportToHtmlFile(jasperPrint,sDestFileName);
					
			} else if(this.sTipoArchivoReporte=="PDF") {
				sDestFileName+=".pdf";
				JasperExportManager.exportReportToPdfFile(jasperPrint,sDestFileName);
			} else {
				sDestFileName+=".xml";
				JasperExportManager.exportReportToXmlFile(jasperPrint,sDestFileName, false);
			}	
			
		} else if(this.sTipoArchivoReporte=="WORD"||this.sTipoArchivoReporte=="EXCEL") {
				
			if(this.sTipoArchivoReporte=="WORD") {
				sDestFileName+=".rtf";
					
				JRRtfExporter exporter = new JRRtfExporter();
		
				exporter.setParameter(JRExporterParameter.JASPER_PRINT, jasperPrint);
				exporter.setParameter(JRExporterParameter.OUTPUT_FILE_NAME, sDestFileName);
		
				exporter.exportReport();
				
			} else	{
				sDestFileName+=".xls";
					
				JRXlsExporter exporterXls = new JRXlsExporter();
		
				exporterXls.setParameter(JRExporterParameter.JASPER_PRINT, jasperPrint);
				exporterXls.setParameter(JRExporterParameter.OUTPUT_FILE_NAME, sDestFileName);
				exporterXls.setParameter(JRXlsExporterParameter.IS_ONE_PAGE_PER_SHEET, Boolean.TRUE);
		
				exporterXls.exportReport();
			}
			
		} else if(this.sTipoArchivoReporte=="EXCEL2"||this.sTipoArchivoReporte=="EXCEL2_2") {
			//sDestFileName+=".xlsx";
			
			if(this.sTipoReporte.equals("NORMAL")) {
				this.generarExcelReporteTipoTributarios(sAccionBusqueda,sTipoArchivoReporte,tipotributariosParaReportes);
			
			} else if(this.sTipoReporte.equals("FORMULARIO")){
				this.generarExcelReporteVerticalTipoTributarios(sAccionBusqueda,sTipoArchivoReporte,tipotributariosParaReportes,false);
			
			} else if(this.sTipoReporte.equals("DINAMICO")){
				
				if(this.sTipoReporteDinamico.equals("NORMAL")) {
					
					this.jButtonGenerarExcelReporteDinamicoTipoTributarioActionPerformed(null);
					//this.generarExcelReporteTipoTributarios(sAccionBusqueda,sTipoArchivoReporte,tipotributariosParaReportes);
					
				
				} else if(this.sTipoReporteDinamico.equals("FORMULARIO")){
					this.generarExcelReporteVerticalTipoTributarios(sAccionBusqueda,sTipoArchivoReporte,tipotributariosParaReportes,true);
				
				} else if(this.sTipoReporteDinamico.equals("RELACIONES")){
					this.generarExcelReporteRelacionesTipoTributarios(sAccionBusqueda,sTipoArchivoReporte,tipotributariosParaReportes,true);
				}
				
			} else if(this.sTipoReporte.equals("RELACIONES")){
				this.generarExcelReporteRelacionesTipoTributarios(sAccionBusqueda,sTipoArchivoReporte,tipotributariosParaReportes,false);
			}
		}
		
		if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML"||this.sTipoArchivoReporte=="WORD"||this.sTipoArchivoReporte=="EXCEL") {				
			JOptionPane.showMessageDialog(this,"REPORTE "+sDestFileName+" GENERADO SATISFACTORIAMENTE","REPORTES ",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteTipoTributarios(String sAccionBusqueda,String sTipoArchivoReporte,List<TipoTributario> tipotributariosParaReportes) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tipotributario";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("TipoTributarios");
         
        int iRow = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderTipoTributario("NORMAL",row,workbook);
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux=null;
		
		int i=0;
		
      	for(TipoTributario tipotributario : tipotributariosParaReportes) {            
			row = sheet.createRow(iRow++);
			iCell = 0;
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				cellStyleDataAux=cellStyleData;
			}
			
			TipoTributarioConstantesFunciones.generarExcelReporteDataTipoTributario("NORMAL",row,workbook,tipotributario,cellStyleDataAux);
		
			
			/*
            Cell cell0 = row.createCell(0);
            cell0.setCellValue(country.getName());
            Cell cell1 = row.createCell(1);
            cell1.setCellValue(country.getShortCode());
			*/
			
			i++;
        }
        
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipotributarioSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Tributario",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteHeaderTipoTributario(String sTipo,Row row,Workbook workbook) {
		
		TipoTributarioConstantesFunciones.generarExcelReporteHeaderTipoTributario(sTipo,row,workbook);
		
		/*
		Cell cell=null;
		int iCell=0;
		
		CellStyle cellStyle = workbook.createCellStyle();
		cellStyle.setFillBackgroundColor(IndexedColors.GREEN.getIndex());
		cellStyle.setFillPattern(CellStyle.ALIGN_FILL);
		*/
		
	}
	
	public void generarExcelReporteVerticalTipoTributarios(String sAccionBusqueda,String sTipoArchivoReporte,List<TipoTributario> tipotributariosParaReportes,Boolean paraDinamico) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tipotributario_vertical";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("TipoTributarios");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		CellStyle cellStyle = Funciones2.getStyleTitulo(workbook,"ZEBRA");;
		
		CellStyle cellStyleTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL_VERTICAL");
		
		
		for(TipoTributario tipotributario : tipotributariosParaReportes) {
			row = sheet.createRow(iRow++);
			iRowLast=iRow - 1;
			
			cell = row.createCell(0);
			cell.setCellValue(TipoTributarioConstantesFunciones.getTipoTributarioDescripcion(tipotributario));
			cell.setCellStyle(cellStyleTitulo);
			
			sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
	
			


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(TipoTributarioConstantesFunciones.LABEL_IDPAIS))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(TipoTributarioConstantesFunciones.LABEL_IDPAIS);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(tipotributario.getpais_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(TipoTributarioConstantesFunciones.LABEL_CODIGO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(TipoTributarioConstantesFunciones.LABEL_CODIGO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(tipotributario.getcodigo());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(TipoTributarioConstantesFunciones.LABEL_NOMBRE))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(TipoTributarioConstantesFunciones.LABEL_NOMBRE);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(tipotributario.getnombre());


			}						
        }
        
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipotributarioSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Tributario",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteRelacionesTipoTributarios(String sAccionBusqueda,String sTipoArchivoReporte,List<TipoTributario> tipotributariosParaReportes,Boolean paraDinamico) throws Exception {
		
		ArrayList<Classe> classes=new ArrayList<Classe>();
		List<TipoTributario> tipotributariosRespaldo=null;
		
		classes=TipoTributarioConstantesFunciones.getClassesRelationshipsOfTipoTributario(new ArrayList<Classe>(),DeepLoadType.NONE,false);
					
		this.datosDeep=new DatosDeep();
		
		this.datosDeep.setIsDeep(false);
		this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
		this.datosDeep.setClases(classes);
			
		this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
		this.datosCliente.setIsConDeep(true);	
		this.datosCliente.setIsConExportar(false);
		
						
		this.tipotributarioLogic.setDatosCliente(this.datosCliente);
		this.tipotributarioLogic.setDatosDeep(this.datosDeep);
		this.tipotributarioLogic.setIsConDeep(true);
		
		tipotributariosRespaldo=this.tipotributarioLogic.getTipoTributarios();
		
		this.tipotributarioLogic.setTipoTributarios(tipotributariosParaReportes);	
		this.tipotributarioLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
		
		tipotributariosParaReportes=this.tipotributarioLogic.getTipoTributarios();
		this.tipotributarioLogic.setTipoTributarios(tipotributariosRespaldo);
		
		
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tipotributario_relacion";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("TipoTributarios");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderTipoTributario("NORMAL",row,workbook);
		
		int i=0;
		int i2=0;
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL");
		CellStyle cellStyleDataZebra = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux =null;
		CellStyle cellStyleDataAuxHijo =null;
		
		for(TipoTributario tipotributario : tipotributariosParaReportes) {			
			if(i!=0) {
				row = sheet.createRow(iRow++);				
				this.generarExcelReporteHeaderTipoTributario("NORMAL",row,workbook);
			}
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				//cellStyleDataAux=cellStyleData;
			}
			
			row = sheet.createRow(iRow++);						
			TipoTributarioConstantesFunciones.generarExcelReporteDataTipoTributario("NORMAL",row,workbook,tipotributario,cellStyleDataAux);
		
			
			


				//TransaccionLocal
			if(!paraDinamico || (paraDinamico && this.existeRelacionReporteDinamico(TransaccionLocalConstantesFunciones.SCLASSWEBTITULO))) {

				if(tipotributario.getTransaccionLocals()!=null && tipotributario.getTransaccionLocals().size()>0) {
					row = sheet.createRow(iRow++);

					iCell=1;iRowLast=iRow-1; cell = row.createCell(iCell++);cell.setCellStyle(cellStyleDataTitulo);sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,1,5));
					cell.setCellValue(TransaccionLocalConstantesFunciones.SCLASSWEBTITULO);

					row = sheet.createRow(iRow++);
					TransaccionLocalConstantesFunciones.generarExcelReporteHeaderTransaccionLocal("RELACIONADO",row,workbook);
				}

				if(tipotributario.getTransaccionLocals()!=null) {
					i2=0;
					for(TransaccionLocal transaccionlocal : tipotributario.getTransaccionLocals()) {
						row = sheet.createRow(iRow++);

						cellStyleDataAuxHijo=null;
						if(i2%2==0) {
							cellStyleDataAuxHijo=cellStyleData;
						}

						TransaccionLocalConstantesFunciones.generarExcelReporteDataTransaccionLocal("RELACIONADO",row,workbook,transaccionlocal,cellStyleDataAuxHijo);
						i2++;
					}
				}
			}


				//FacturaProveedorServicio
			if(!paraDinamico || (paraDinamico && this.existeRelacionReporteDinamico(FacturaProveedorServicioConstantesFunciones.SCLASSWEBTITULO))) {

				if(tipotributario.getFacturaProveedorServicios()!=null && tipotributario.getFacturaProveedorServicios().size()>0) {
					row = sheet.createRow(iRow++);

					iCell=1;iRowLast=iRow-1; cell = row.createCell(iCell++);cell.setCellStyle(cellStyleDataTitulo);sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,1,5));
					cell.setCellValue(FacturaProveedorServicioConstantesFunciones.SCLASSWEBTITULO);

					row = sheet.createRow(iRow++);
					FacturaProveedorServicioConstantesFunciones.generarExcelReporteHeaderFacturaProveedorServicio("RELACIONADO",row,workbook);
				}

				if(tipotributario.getFacturaProveedorServicios()!=null) {
					i2=0;
					for(FacturaProveedorServicio facturaproveedorservicio : tipotributario.getFacturaProveedorServicios()) {
						row = sheet.createRow(iRow++);

						cellStyleDataAuxHijo=null;
						if(i2%2==0) {
							cellStyleDataAuxHijo=cellStyleData;
						}

						FacturaProveedorServicioConstantesFunciones.generarExcelReporteDataFacturaProveedorServicio("RELACIONADO",row,workbook,facturaproveedorservicio,cellStyleDataAuxHijo);
						i2++;
					}
				}
			}


				//Definicion
			if(!paraDinamico || (paraDinamico && this.existeRelacionReporteDinamico(DefinicionConstantesFunciones.SCLASSWEBTITULO))) {

				if(tipotributario.getDefinicions()!=null && tipotributario.getDefinicions().size()>0) {
					row = sheet.createRow(iRow++);

					iCell=1;iRowLast=iRow-1; cell = row.createCell(iCell++);cell.setCellStyle(cellStyleDataTitulo);sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,1,5));
					cell.setCellValue(DefinicionConstantesFunciones.SCLASSWEBTITULO);

					row = sheet.createRow(iRow++);
					DefinicionConstantesFunciones.generarExcelReporteHeaderDefinicion("RELACIONADO",row,workbook);
				}

				if(tipotributario.getDefinicions()!=null) {
					i2=0;
					for(Definicion definicion : tipotributario.getDefinicions()) {
						row = sheet.createRow(iRow++);

						cellStyleDataAuxHijo=null;
						if(i2%2==0) {
							cellStyleDataAuxHijo=cellStyleData;
						}

						DefinicionConstantesFunciones.generarExcelReporteDataDefinicion("RELACIONADO",row,workbook,definicion,cellStyleDataAuxHijo);
						i2++;
					}
				}
			}
			
			i++;
        }
        
		/*
		row = sheet.createRow(iRow++);
		iRowLast=iRow - 1;
			
		cell = row.createCell(0);
		cell.setCellValue(TipoTributarioConstantesFunciones.getTipoTributarioDescripcion(tipotributario));
		cell.setCellStyle(cellStyleTitulo);
			
		sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
		*/
		
			
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipotributarioSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Tributario",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	
	public Boolean existeColumnaReporteDinamico(String sColumna) {
		Boolean existe=false;
		
		Reporte reporte=new Reporte();
		
		
		for(int index:this.jInternalFrameReporteDinamicoTipoTributario.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoTipoTributario.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
			if(sColumna.equals(reporte.getsCodigo())) {
				existe=true;
				break;
			}
		
		}
		
		
		return existe;
	}
	
	public Boolean existeRelacionReporteDinamico(String sColumna) {
		Boolean existe=false;
		
		Reporte reporte=new Reporte();
		
		
		for(int index:this.jInternalFrameReporteDinamicoTipoTributario.getjListRelacionesSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoTipoTributario.getjListRelacionesSelectReporte().getModel().getElementAt(index);
			
			if(sColumna.equals(reporte.getsCodigo())) {
				existe=true;
				break;
			}
		
		}
		
		
		return existe;
	}
	
	public void startProcessTipoTributario() throws Exception {		
		this.startProcessTipoTributario(true);
	}
	
	public void startProcessTipoTributario(Boolean conSplash) throws Exception {		
		//FuncionesSwing.enableDisablePanels(false,this.jTabbedPaneBusquedasTipoTributario ,this.jPanelParametrosReportesTipoTributario, this.jScrollPanelDatosTipoTributario,this.jPanelPaginacionTipoTributario, this.jScrollPanelDatosEdicionTipoTributario, this.jPanelAccionesTipoTributario,this.jPanelAccionesFormularioTipoTributario,this.jmenuBarTipoTributario,this.jmenuBarDetalleTipoTributario,this.jTtoolBarTipoTributario,this.jTtoolBarDetalleTipoTributario);		
		
		final JTabbedPane jTabbedPaneBusquedasTipoTributario=this.jTabbedPaneBusquedasTipoTributario; 
		
		final JPanel jPanelParametrosReportesTipoTributario=this.jPanelParametrosReportesTipoTributario;
		//final JScrollPane jScrollPanelDatosTipoTributario=this.jScrollPanelDatosTipoTributario;
		final JTable jTableDatosTipoTributario=this.jTableDatosTipoTributario;		
		final JPanel jPanelPaginacionTipoTributario=this.jPanelPaginacionTipoTributario;
		//final JScrollPane jScrollPanelDatosEdicionTipoTributario=this.jScrollPanelDatosEdicionTipoTributario;
		final JPanel jPanelAccionesTipoTributario=this.jPanelAccionesTipoTributario;
		
		JPanel jPanelCamposAuxiliarTipoTributario=new JPanelMe();
		JPanel jPanelAccionesFormularioAuxiliarTipoTributario=new JPanelMe();
		
		if(this.jInternalFrameDetalleFormTipoTributario!=null) {
			jPanelCamposAuxiliarTipoTributario=this.jInternalFrameDetalleFormTipoTributario.jPanelCamposTipoTributario;
			jPanelAccionesFormularioAuxiliarTipoTributario=this.jInternalFrameDetalleFormTipoTributario.jPanelAccionesFormularioTipoTributario;
		}
		
		final JPanel jPanelCamposTipoTributario=jPanelCamposAuxiliarTipoTributario;
		final JPanel jPanelAccionesFormularioTipoTributario=jPanelAccionesFormularioAuxiliarTipoTributario;
		
		
		final JMenuBar jmenuBarTipoTributario=this.jmenuBarTipoTributario;
		final JToolBar jTtoolBarTipoTributario=this.jTtoolBarTipoTributario;		
		
		
		JMenuBar jmenuBarDetalleAuxiliarTipoTributario=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarTipoTributario=new JToolBar();		
		
		if(this.jInternalFrameDetalleFormTipoTributario!=null) {
			jmenuBarDetalleAuxiliarTipoTributario=this.jInternalFrameDetalleFormTipoTributario.jmenuBarDetalleTipoTributario;
			jTtoolBarDetalleAuxiliarTipoTributario=this.jInternalFrameDetalleFormTipoTributario.jTtoolBarDetalleTipoTributario;
		}
		
		final JMenuBar jmenuBarDetalleTipoTributario=jmenuBarDetalleAuxiliarTipoTributario;
		final JToolBar jTtoolBarDetalleTipoTributario=jTtoolBarDetalleAuxiliarTipoTributario;		
		
		
		
		
		
		if(Constantes2.CON_PROCESO_HILO) {
			Thread threadRunnableProcess;
			ProcessRunnable processRunnable;
			
			processRunnable=new ProcessRunnable();
			
			processRunnable.setsTipo("START");
			processRunnable.setDesktop(jDesktopPane);
			processRunnable.setModuloActual(moduloActual);
			processRunnable.setModuloUsuarioSeleccionado(moduloActual);
			processRunnable.setOpcionActual(opcionActual);
			processRunnable.setParametroGeneralSg(parametroGeneralSg);
			processRunnable.setParametroGeneralUsuario(parametroGeneralUsuario);
			processRunnable.setResumenUsuarioActual(resumenUsuarioActual);
			processRunnable.setUsuarioActual(usuarioActual);
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasTipoTributario;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesTipoTributario;
			processRunnable.jTableDatos=jTableDatosTipoTributario;
			processRunnable.jPanelCampos=jPanelCamposTipoTributario;
			processRunnable.jPanelPaginacion=jPanelPaginacionTipoTributario;
			processRunnable.jPanelAcciones=jPanelAccionesTipoTributario;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioTipoTributario;
			
			
			processRunnable.jmenuBar=jmenuBarTipoTributario;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleTipoTributario;
			processRunnable.jTtoolBar=jTtoolBarTipoTributario;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleTipoTributario;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasTipoTributario ,jPanelParametrosReportesTipoTributario,jTableDatosTipoTributario, /*jScrollPanelDatosTipoTributario,*/jPanelCamposTipoTributario,jPanelPaginacionTipoTributario, /*jScrollPanelDatosEdicionTipoTributario,*/ jPanelAccionesTipoTributario,jPanelAccionesFormularioTipoTributario,jmenuBarTipoTributario,jmenuBarDetalleTipoTributario,jTtoolBarTipoTributario,jTtoolBarDetalleTipoTributario);
		
			startProcess();//this.
		}
						
		/*
		if(conSplash) {
			SwingUtilities.invokeLater(new Runnable() {
			      public void run() {
			    	  try {
							FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasTipoTributario ,jPanelParametrosReportesTipoTributario, jScrollPanelDatosTipoTributario,jPanelPaginacionTipoTributario, jScrollPanelDatosEdicionTipoTributario, jPanelAccionesTipoTributario,jPanelAccionesFormularioTipoTributario,jmenuBarTipoTributario,jmenuBarDetalleTipoTributario,jTtoolBarTipoTributario,jTtoolBarDetalleTipoTributario);
						
							startProcess();//this.
							
						} catch (Exception e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
			      }
			});
		}
		*/
	}
	
	public void finishProcessTipoTributario() {// throws Exception 
		this.finishProcessTipoTributario(true);
	}
	
	public void finishProcessTipoTributario(Boolean conSplash) {// throws Exception 
		//FuncionesSwing.enableDisablePanels(true,this.jTabbedPaneBusquedasTipoTributario ,this.jPanelParametrosReportesTipoTributario, this.jScrollPanelDatosTipoTributario,this.jPanelPaginacionTipoTributario, this.jScrollPanelDatosEdicionTipoTributario, this.jPanelAccionesTipoTributario,this.jPanelAccionesFormularioTipoTributario,this.jmenuBarTipoTributario,this.jmenuBarDetalleTipoTributario,this.jTtoolBarTipoTributario,this.jTtoolBarDetalleTipoTributario);		
		
		final JTabbedPane jTabbedPaneBusquedasTipoTributario=this.jTabbedPaneBusquedasTipoTributario; 
		
		final JPanel jPanelParametrosReportesTipoTributario=this.jPanelParametrosReportesTipoTributario;
		//final JScrollPane jScrollPanelDatosTipoTributario=this.jScrollPanelDatosTipoTributario;
		final JTable jTableDatosTipoTributario=this.jTableDatosTipoTributario;		
		final JPanel jPanelPaginacionTipoTributario=this.jPanelPaginacionTipoTributario;
		//final JScrollPane jScrollPanelDatosEdicionTipoTributario=this.jScrollPanelDatosEdicionTipoTributario;
		final JPanel jPanelAccionesTipoTributario=this.jPanelAccionesTipoTributario;
		
		JPanel jPanelCamposAuxiliarTipoTributario=new JPanel();
		JPanel jPanelAccionesFormularioAuxiliarTipoTributario=new JPanel();
		
		if(this.jInternalFrameDetalleFormTipoTributario!=null) {
			jPanelCamposAuxiliarTipoTributario=this.jInternalFrameDetalleFormTipoTributario.jPanelCamposTipoTributario;
			jPanelAccionesFormularioAuxiliarTipoTributario=this.jInternalFrameDetalleFormTipoTributario.jPanelAccionesFormularioTipoTributario;
		}
		
		final JPanel jPanelCamposTipoTributario=jPanelCamposAuxiliarTipoTributario;
		final JPanel jPanelAccionesFormularioTipoTributario=jPanelAccionesFormularioAuxiliarTipoTributario;
		
		
		final JMenuBar jmenuBarTipoTributario=this.jmenuBarTipoTributario;		
		final JToolBar jTtoolBarTipoTributario=this.jTtoolBarTipoTributario;
				
		JMenuBar jmenuBarDetalleAuxiliarTipoTributario=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarTipoTributario=new JToolBar();
		
		if(this.jInternalFrameDetalleFormTipoTributario!=null) {
			jmenuBarDetalleAuxiliarTipoTributario=this.jInternalFrameDetalleFormTipoTributario.jmenuBarDetalleTipoTributario;
			jTtoolBarDetalleAuxiliarTipoTributario=this.jInternalFrameDetalleFormTipoTributario.jTtoolBarDetalleTipoTributario;		
		}
		
		final JMenuBar jmenuBarDetalleTipoTributario=jmenuBarDetalleAuxiliarTipoTributario;
		final JToolBar jTtoolBarDetalleTipoTributario=jTtoolBarDetalleAuxiliarTipoTributario;
		
		
		
		if(Constantes2.CON_PROCESO_HILO) {
			Thread threadRunnableProcess;
			ProcessRunnable processRunnable;
			
			processRunnable=new ProcessRunnable();
			
			processRunnable.setsTipo("END");
			processRunnable.setDesktop(jDesktopPane);
			processRunnable.setModuloActual(moduloActual);
			processRunnable.setModuloUsuarioSeleccionado(moduloActual);
			processRunnable.setOpcionActual(opcionActual);
			processRunnable.setParametroGeneralSg(parametroGeneralSg);
			processRunnable.setParametroGeneralUsuario(parametroGeneralUsuario);
			processRunnable.setResumenUsuarioActual(resumenUsuarioActual);
			processRunnable.setUsuarioActual(usuarioActual);
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasTipoTributario;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesTipoTributario;
			processRunnable.jTableDatos=jTableDatosTipoTributario;
			processRunnable.jPanelCampos=jPanelCamposTipoTributario;
			processRunnable.jPanelPaginacion=jPanelPaginacionTipoTributario;
			processRunnable.jPanelAcciones=jPanelAccionesTipoTributario;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioTipoTributario;
			
			
			processRunnable.jmenuBar=jmenuBarTipoTributario;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleTipoTributario;
			processRunnable.jTtoolBar=jTtoolBarTipoTributario;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleTipoTributario;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			if(conSplash) {
				SwingUtilities.invokeLater(new RunnableProceso(true,this,jTabbedPaneBusquedasTipoTributario ,jPanelParametrosReportesTipoTributario, jTableDatosTipoTributario,/*jScrollPanelDatosTipoTributario,*/jPanelCamposTipoTributario,jPanelPaginacionTipoTributario, /*jScrollPanelDatosEdicionTipoTributario,*/ jPanelAccionesTipoTributario,jPanelAccionesFormularioTipoTributario,jmenuBarTipoTributario,jmenuBarDetalleTipoTributario,jTtoolBarTipoTributario,jTtoolBarDetalleTipoTributario));
			}
		}						
	}
	
	/*
	public void habilitarDeshabilitarControlesTipoTributario(Boolean esHabilitar,Boolean conDetalle) {
		this.habilitarDeshabilitarToolBarTipoTributario(esHabilitar,conDetalle);
		this.habilitarDeshabilitarMenuTipoTributario(esHabilitar,conDetalle);
	}
	
	public void habilitarDeshabilitarToolBarTipoTributario(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jTtoolBarTipoTributario,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jTtoolBarDetalleTipoTributario,esHabilitar,1,1);
		}
	}
	
	public void habilitarDeshabilitarMenuTipoTributario(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jmenuBarTipoTributario,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jmenuBarDetalleTipoTributario,esHabilitar,1,1);
		}
	}
	*/
	
	
	
	public void procesarBusqueda(String sAccionBusqueda) throws Exception {		
		String  finalQueryPaginacion=this.tipotributarioConstantesFunciones.getsFinalQueryTipoTributario();
		String  finalQueryPaginacionTodos=this.tipotributarioConstantesFunciones.getsFinalQueryTipoTributario();
		
		Boolean esBusqueda=false;
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		if(!sAccionBusqueda.equals("Todos"))	{
			esBusqueda=true;
		}
		
		this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
		this.arrDatoGeneralNo= new  ArrayList<String>();
		
		ArrayList<String> arrColumnasGlobalesNo=TipoTributarioConstantesFunciones.getArrayColumnasGlobalesNoTipoTributario(this.arrDatoGeneral);
		ArrayList<String> arrColumnasGlobales=TipoTributarioConstantesFunciones.getArrayColumnasGlobalesTipoTributario(this.arrDatoGeneral,arrColumnasGlobalesNo);
		
			
		String  finalQueryGlobal="";
		
		finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,!esBusqueda,esBusqueda,arrColumnasGlobales,TipoTributarioConstantesFunciones.TABLENAME);
		
		String sOrderBy="";
		
		
		sOrderBy=Funciones2.getFinalQueryOrderBy(this.arrOrderBy);
		
		
		if(!sOrderBy.equals("")) {			
			finalQueryPaginacion=sOrderBy;
			finalQueryPaginacionTodos=sOrderBy;
		}
		
		
		//INICIALIZA ELIMINADOS
		this.tipotributariosEliminados= new ArrayList<TipoTributario>();
		
		if(!this.isEntroOnLoad) {
			this.onLoad();
		}/* else {
			this.isEntroOnLoad=false;
		}*/
		
		
		
				
		try	{		
			
			//this.startProcessTipoTributario();
		
				///*TipoTributarioSessionBean*/this.tipotributarioSessionBean=new TipoTributarioSessionBean();
			
			if(this.tipotributarioSessionBean==null) {
				this.tipotributarioSessionBean=new TipoTributarioSessionBean();
			}
			
			//ACTUALIZA EL TAMANIO DE PAGINACION DESDE EL COMBO
			if(this.sTipoPaginacion!=null && !this.sTipoPaginacion.equals("")) {
				if(!this.sTipoPaginacion.equals("TODOS")) {
					this.iNumeroPaginacion=Integer.parseInt(this.sTipoPaginacion);
				} else {
					this.iNumeroPaginacion=-1;
					this.iNumeroPaginacionPagina=-1;
				}
			} else {
				if(this.iNumeroPaginacion==null || (this.iNumeroPaginacion!=null && this.iNumeroPaginacion<=0)) {
					this.iNumeroPaginacion=TipoTributarioConstantesFunciones.INUMEROPAGINACION;
				}
			}
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);
			
			this.cargarDatosCliente();
			
			ArrayList<Classe> classes=new ArrayList<Classe>();
			
			classes=TipoTributarioConstantesFunciones.getClassesForeignKeysOfTipoTributario(new ArrayList<Classe>(),DeepLoadType.NONE);
			
		
			this.datosDeep=new DatosDeep();
			this.datosDeep.setIsDeep(false);
			this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
			this.datosDeep.setClases(classes);
			
			this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
			this.datosCliente.setIsConDeep(true);
			
			if(false) {//this.conExportar
				this.datosCliente.setIsConExportar(true);
				this.datosCliente.setDatosExportarParametros(Funciones2.getTipoExportar(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getcon_exportar_cabecera(),Funciones2.getTipoDelimiter(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getpath_exportar()+"/tipotributario."+Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario));
			} else {
				this.datosCliente.setIsConExportar(false);
			}
			
			tipotributariosAux= new ArrayList<TipoTributario>();
			
				
			tipotributarioLogic.setDatosCliente(this.datosCliente);
			tipotributarioLogic.setDatosDeep(this.datosDeep);
			tipotributarioLogic.setIsConDeep(true);
			
			
			tipotributarioLogic.getTipoTributarioDataAccess().setIsForForeingsKeysDataRelationships(true);
			
			if(sAccionBusqueda.equals("Todos") || sAccionBusqueda.equals("Query"))	{	
				if(sAccionBusqueda.equals("Todos")) {
					//FALTA:PARA BUSQUEDAS POR CAMPO EN FORMULARIO
					//this.sFinalQueryGeneral="";
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacionTodos );
					
					tipotributarioLogic.getTodosTipoTributarios(finalQueryGlobal,pagination);
					
					//tipotributarioLogic.getTodosTipoTributariosWithConnection(finalQueryGlobal,pagination);										
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
				
				if(tipotributarioLogic.getTipoTributarios()==null|| tipotributarioLogic.getTipoTributarios().size()==0)	{
					
				
				}
				
				if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(-1);
						this.pagination.setiMaxResults(-1);
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							tipotributariosAux= new ArrayList<TipoTributario>();
							tipotributariosAux.addAll(tipotributarioLogic.getTipoTributarios());						
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							tipotributariosAux= new ArrayList<TipoTributario>();
							tipotributariosAux.addAll(tipotributarios);
						}
						//ARCHITECTURE
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							tipotributarioLogic.getTodosTipoTributarios(finalQueryGlobal+"",this.pagination);												
							
							//tipotributarioLogic.getTodosTipoTributariosWithConnection(finalQueryGlobal+"",this.pagination);												
						} else if(Constantes.ISUSAEJBREMOTE) {
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
					}
					
					this.generarReporteTipoTributarios("Todos",tipotributarioLogic.getTipoTributarios() );
					
					if(false) {//isMostrarTodosResultadosReporte						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							tipotributarioLogic.setTipoTributarios(new ArrayList<TipoTributario>());					
							tipotributarioLogic.getTipoTributarios().addAll(tipotributariosAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							tipotributarios=new ArrayList<TipoTributario>();
							tipotributarios.addAll(tipotributariosAux);
						}
						//ARCHITECTURE
						
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);														
					}
				}
			}
			else if(sAccionBusqueda.equals("PorId")) {
				Long idTipoTributario=0L;
				
				if(this.idActual!=null && this.idActual!=0L) {
					idTipoTributario=this.idActual;
				
				} else if(this.idTipoTributarioActual!=null && this.idTipoTributarioActual!=0L) {
					idTipoTributario=idTipoTributarioActual;
				}
				
					
				this.sDetalleReporte=TipoTributarioConstantesFunciones.getDetalleIndicePorId(idTipoTributario);
				
				this.tipotributarios=new ArrayList<TipoTributario>();
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {					
					tipotributarioLogic.getEntity(idTipoTributario);
					
					//tipotributarioLogic.getEntityWithConnection(idTipoTributario);
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
								
				if(Constantes.ISUSAEJBLOGICLAYER) {
					tipotributarioLogic.setTipoTributarios(new ArrayList<TipoTributario>());
					tipotributarioLogic.getTipoTributarios().add(tipotributarioLogic.getTipoTributario());
				
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.tipotributarios=new ArrayList<TipoTributario>();
					this.tipotributarios.add(tipotributario);
				}
				
				if(tipotributarioLogic.getTipoTributario()==null)	{
					
				
				}			
			}
			
		
			else if(sAccionBusqueda.equals("BusquedaPorCodigo")) {
				this.sDetalleReporte=TipoTributarioConstantesFunciones.getDetalleIndiceBusquedaPorCodigo(codigoBusquedaPorCodigo);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					tipotributarioLogic.getTipoTributariosBusquedaPorCodigo(finalQueryGlobal,pagination,codigoBusquedaPorCodigo);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=TipoTributarioConstantesFunciones.getDetalleIndiceBusquedaPorCodigo(codigoBusquedaPorCodigo);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=TipoTributarioConstantesFunciones.getDetalleIndiceBusquedaPorCodigo(codigoBusquedaPorCodigo);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=tipotributarioLogic.getTipoTributarios()==null||tipotributarioLogic.getTipoTributarios().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=tipotributarios==null|| tipotributarios.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						tipotributariosAux=new ArrayList<TipoTributario>();
						tipotributariosAux.addAll(tipotributarioLogic.getTipoTributarios());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							tipotributariosAux=new ArrayList<TipoTributario>();
							tipotributariosAux.addAll(tipotributarios);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							tipotributarioLogic.getTipoTributariosBusquedaPorCodigo(finalQueryGlobal,pagination,codigoBusquedaPorCodigo);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=TipoTributarioConstantesFunciones.getDetalleIndiceBusquedaPorCodigo(codigoBusquedaPorCodigo);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=TipoTributarioConstantesFunciones.getDetalleIndiceBusquedaPorCodigo(codigoBusquedaPorCodigo);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteTipoTributarios("BusquedaPorCodigo",tipotributarioLogic.getTipoTributarios());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteTipoTributarios("BusquedaPorCodigo",tipotributarios);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						tipotributarioLogic.setTipoTributarios(new ArrayList<TipoTributario>());
						tipotributarioLogic.getTipoTributarios().addAll(tipotributariosAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							tipotributarios=new ArrayList<TipoTributario>();
							tipotributarios.addAll(tipotributariosAux);
						}
						//ARCHITECTURE
					}
				}

			}
			else if(sAccionBusqueda.equals("BusquedaPorId")) {
				this.sDetalleReporte=TipoTributarioConstantesFunciones.getDetalleIndiceBusquedaPorId(idBusquedaPorId);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					tipotributarioLogic.getTipoTributariosBusquedaPorId(finalQueryGlobal,pagination,idBusquedaPorId);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=TipoTributarioConstantesFunciones.getDetalleIndiceBusquedaPorId(idBusquedaPorId);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=TipoTributarioConstantesFunciones.getDetalleIndiceBusquedaPorId(idBusquedaPorId);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=tipotributarioLogic.getTipoTributarios()==null||tipotributarioLogic.getTipoTributarios().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=tipotributarios==null|| tipotributarios.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						tipotributariosAux=new ArrayList<TipoTributario>();
						tipotributariosAux.addAll(tipotributarioLogic.getTipoTributarios());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							tipotributariosAux=new ArrayList<TipoTributario>();
							tipotributariosAux.addAll(tipotributarios);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							tipotributarioLogic.getTipoTributariosBusquedaPorId(finalQueryGlobal,pagination,idBusquedaPorId);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=TipoTributarioConstantesFunciones.getDetalleIndiceBusquedaPorId(idBusquedaPorId);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=TipoTributarioConstantesFunciones.getDetalleIndiceBusquedaPorId(idBusquedaPorId);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteTipoTributarios("BusquedaPorId",tipotributarioLogic.getTipoTributarios());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteTipoTributarios("BusquedaPorId",tipotributarios);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						tipotributarioLogic.setTipoTributarios(new ArrayList<TipoTributario>());
						tipotributarioLogic.getTipoTributarios().addAll(tipotributariosAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							tipotributarios=new ArrayList<TipoTributario>();
							tipotributarios.addAll(tipotributariosAux);
						}
						//ARCHITECTURE
					}
				}

			}
			else if(sAccionBusqueda.equals("BusquedaPorNombre")) {
				this.sDetalleReporte=TipoTributarioConstantesFunciones.getDetalleIndiceBusquedaPorNombre(nombreBusquedaPorNombre);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					tipotributarioLogic.getTipoTributariosBusquedaPorNombre(finalQueryGlobal,pagination,nombreBusquedaPorNombre);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=TipoTributarioConstantesFunciones.getDetalleIndiceBusquedaPorNombre(nombreBusquedaPorNombre);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=TipoTributarioConstantesFunciones.getDetalleIndiceBusquedaPorNombre(nombreBusquedaPorNombre);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=tipotributarioLogic.getTipoTributarios()==null||tipotributarioLogic.getTipoTributarios().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=tipotributarios==null|| tipotributarios.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						tipotributariosAux=new ArrayList<TipoTributario>();
						tipotributariosAux.addAll(tipotributarioLogic.getTipoTributarios());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							tipotributariosAux=new ArrayList<TipoTributario>();
							tipotributariosAux.addAll(tipotributarios);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							tipotributarioLogic.getTipoTributariosBusquedaPorNombre(finalQueryGlobal,pagination,nombreBusquedaPorNombre);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=TipoTributarioConstantesFunciones.getDetalleIndiceBusquedaPorNombre(nombreBusquedaPorNombre);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=TipoTributarioConstantesFunciones.getDetalleIndiceBusquedaPorNombre(nombreBusquedaPorNombre);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteTipoTributarios("BusquedaPorNombre",tipotributarioLogic.getTipoTributarios());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteTipoTributarios("BusquedaPorNombre",tipotributarios);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						tipotributarioLogic.setTipoTributarios(new ArrayList<TipoTributario>());
						tipotributarioLogic.getTipoTributarios().addAll(tipotributariosAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							tipotributarios=new ArrayList<TipoTributario>();
							tipotributarios.addAll(tipotributariosAux);
						}
						//ARCHITECTURE
					}
				}

			}
			else if(sAccionBusqueda.equals("FK_IdPais")) {
				this.sDetalleReporte=TipoTributarioConstantesFunciones.getDetalleIndiceFK_IdPais(id_paisFK_IdPais);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					tipotributarioLogic.getTipoTributariosFK_IdPais(finalQueryGlobal,pagination,id_paisFK_IdPais);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=TipoTributarioConstantesFunciones.getDetalleIndiceFK_IdPais(id_paisFK_IdPais);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=TipoTributarioConstantesFunciones.getDetalleIndiceFK_IdPais(id_paisFK_IdPais);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=tipotributarioLogic.getTipoTributarios()==null||tipotributarioLogic.getTipoTributarios().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=tipotributarios==null|| tipotributarios.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						tipotributariosAux=new ArrayList<TipoTributario>();
						tipotributariosAux.addAll(tipotributarioLogic.getTipoTributarios());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							tipotributariosAux=new ArrayList<TipoTributario>();
							tipotributariosAux.addAll(tipotributarios);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							tipotributarioLogic.getTipoTributariosFK_IdPais(finalQueryGlobal,pagination,id_paisFK_IdPais);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=TipoTributarioConstantesFunciones.getDetalleIndiceFK_IdPais(id_paisFK_IdPais);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=TipoTributarioConstantesFunciones.getDetalleIndiceFK_IdPais(id_paisFK_IdPais);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteTipoTributarios("FK_IdPais",tipotributarioLogic.getTipoTributarios());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteTipoTributarios("FK_IdPais",tipotributarios);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						tipotributarioLogic.setTipoTributarios(new ArrayList<TipoTributario>());
						tipotributarioLogic.getTipoTributarios().addAll(tipotributariosAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							tipotributarios=new ArrayList<TipoTributario>();
							tipotributarios.addAll(tipotributariosAux);
						}
						//ARCHITECTURE
					}
				}

			} 
		
		
		
		this.redimensionarTablaDatos();
		//this.refrescarForeignKeysDescripcionesTipoTributario();
		
		
		if(this.conTotales) {
			this.crearFilaTotales();
		}		
		} catch (JRException e) {
			throw e;
		} catch(Exception e) {
			throw e;
      	} finally {
      		//this.finishProcessTipoTributario();
      	}
		
	}				
	
	public void redimensionarTablaDatos() throws Exception {
		int iSizeTabla=0;
				
		iSizeTabla=this.getSizeTablaDatos();
		
		//ARCHITECTURE
		/*
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=tipotributarioLogic.getTipoTributarios().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=tipotributarios.size();
		}
		*/
		//ARCHITECTURE
											
		this.redimensionarTablaDatos(iSizeTabla);		
	}
	
	public Integer getSizeTablaDatos() throws Exception {
		Integer iSizeTabla=0;
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=tipotributarioLogic.getTipoTributarios().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=tipotributarios.size();
		}
		//ARCHITECTURE
											
		return iSizeTabla;		
	}
	
			
	public Boolean permiteMantenimiento(TipoTributario tipotributario) {
		Boolean permite=true;
		
		if(this.tipotributario.getsType().equals(Constantes2.S_TOTALES)) {
			permite=false;
		}
		
		return permite;
	}
	
	public void traerValoresTablaTotales() throws Exception {
	}
	
	
	public void traerValoresTablaOrderBy() throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.arrOrderBy=TipoTributarioConstantesFunciones.getOrderByListaTipoTributario();							
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.arrOrderBy=TipoTributarioConstantesFunciones.getOrderByListaTipoTributario();
		}		
	}
	
	
	public Boolean existeFilaTotales() throws Exception {
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(TipoTributario tipotributario:tipotributarioLogic.getTipoTributarios()) {
				if(tipotributario.getsType().equals(Constantes2.S_TOTALES)) {
					tipotributarioTotales=tipotributario;
					existe=true;
					break;
				}
			}
								
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(TipoTributario tipotributario:this.tipotributarios) {
				if(tipotributario.getsType().equals(Constantes2.S_TOTALES)) {
					tipotributarioTotales=tipotributario;
					existe=true;
					break;
				}
			}
		}
		
		return existe;
	}
	
	public void crearFilaTotales() throws Exception {
		Boolean existe=false;
		
		existe=this.existeFilaTotales();
		
		if(!existe) {
			//SI NO ES UNO A UNO SE CREA FILA TOTALES
			this.tipotributarioAux=new TipoTributario();
			this.tipotributarioAux.setsType(Constantes2.S_TOTALES);
			this.tipotributarioAux.setIsNew(false);
			this.tipotributarioAux.setIsChanged(false);
			this.tipotributarioAux.setIsDeleted(false);
				
			if(Constantes.ISUSAEJBLOGICLAYER) {
				TipoTributarioConstantesFunciones.TotalizarValoresFilaTipoTributario(this.tipotributarioLogic.getTipoTributarios(),this.tipotributarioAux);
				
				this.tipotributarioLogic.getTipoTributarios().add(this.tipotributarioAux);
				
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				TipoTributarioConstantesFunciones.TotalizarValoresFilaTipoTributario(this.tipotributarios,this.tipotributarioAux);
				
				this.tipotributarios.add(this.tipotributarioAux);
			}
		}
	}
	
	public void quitarFilaTotales() throws Exception {
		tipotributarioTotales=new TipoTributario();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.tipotributarioLogic.getTipoTributarios().remove(tipotributarioTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.tipotributarios.remove(tipotributarioTotales);
			}
		}
	}
	
	public void actualizarFilaTotales() throws Exception {
		tipotributarioTotales=new TipoTributario();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(TipoTributario tipotributario:tipotributarioLogic.getTipoTributarios()) {
				if(tipotributario.getsType().equals(Constantes2.S_TOTALES)) {
					tipotributarioTotales=tipotributario;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				TipoTributarioConstantesFunciones.TotalizarValoresFilaTipoTributario(this.tipotributarioLogic.getTipoTributarios(),tipotributarioTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(TipoTributario tipotributario:this.tipotributarios) {
				if(tipotributario.getsType().equals(Constantes2.S_TOTALES)) {
					tipotributarioTotales=tipotributario;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				TipoTributarioConstantesFunciones.TotalizarValoresFilaTipoTributario(this.tipotributarios,tipotributarioTotales);
			}
		}
	}		
	
	public void recargarInformacion()throws Exception {
		try {
			sAccionBusqueda="Todos";
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda(sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoTributarioConstantesFunciones.CLASSNAME);
		}	
	}		
	
	
	public void getTipoTributariosBusquedaPorCodigo()throws Exception {
		try {
			sAccionBusqueda="BusquedaPorCodigo";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getTipoTributariosBusquedaPorId()throws Exception {
		try {
			sAccionBusqueda="BusquedaPorId";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getTipoTributariosBusquedaPorNombre()throws Exception {
		try {
			sAccionBusqueda="BusquedaPorNombre";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getTipoTributariosFK_IdPais()throws Exception {
		try {
			sAccionBusqueda="FK_IdPais";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getTipoTributarioPorCodigo()throws Exception {
		try {
			sAccionBusqueda="PorCodigo";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			throw e;
		}
	}

	
	
	public void getTipoTributariosBusquedaPorCodigo(String sFinalQuery,String codigo)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					tipotributarioLogic.getTipoTributariosBusquedaPorCodigo(sFinalQuery,this.pagination,codigo);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getTipoTributariosBusquedaPorId(String sFinalQuery,Long id)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					tipotributarioLogic.getTipoTributariosBusquedaPorId(sFinalQuery,this.pagination,id);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getTipoTributariosBusquedaPorNombre(String sFinalQuery,String nombre)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					tipotributarioLogic.getTipoTributariosBusquedaPorNombre(sFinalQuery,this.pagination,nombre);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getTipoTributariosFK_IdPais(String sFinalQuery,Long id_pais)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					tipotributarioLogic.getTipoTributariosFK_IdPais(sFinalQuery,this.pagination,id_pais);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getTipoTributarioPorCodigo(String codigo)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					tipotributarioLogic.getTipoTributarioPorCodigo(codigo);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	
	public void onLoad()throws Exception {		
		try {		
			isEntroOnLoad=true;
			//INTENTA TRAER DATOS DE BUSQUEDA ANTERIOR
			this.traerDatosBusquedaDesdeSession();
					
			//SINO SE CUMPLE VIENE DE PADRE FOREIGN O BUSQUEDA ANTIGUA
			if(this.sAccionBusqueda.equals("")) {
				this.sAccionBusqueda="Todos";
			}
								
			this.procesarBusqueda(sAccionBusqueda);
			
		} catch (Exception e) {
			throw e;
		}
	}		
	
	public void inicializarPermisosTipoTributario() {
		this.isPermisoTodoTipoTributario=false;
		this.isPermisoNuevoTipoTributario=false;
		this.isPermisoActualizarTipoTributario=false;
		this.isPermisoActualizarOriginalTipoTributario=false;
		this.isPermisoEliminarTipoTributario=false;
		this.isPermisoGuardarCambiosTipoTributario=false;
		this.isPermisoConsultaTipoTributario=false;
		this.isPermisoBusquedaTipoTributario=false;
		this.isPermisoReporteTipoTributario=false;		
		this.isPermisoOrdenTipoTributario=false;		
		this.isPermisoPaginacionMedioTipoTributario=false;		
		this.isPermisoPaginacionAltoTipoTributario=false;
		this.isPermisoPaginacionTodoTipoTributario=false;
		this.isPermisoCopiarTipoTributario=false;		
		this.isPermisoVerFormTipoTributario=false;		
		this.isPermisoDuplicarTipoTributario=false;		
		this.isPermisoOrdenTipoTributario=false;		
	}
	
	public void setPermisosUsuarioTipoTributario(Boolean isPermiso) {
		this.isPermisoTodoTipoTributario=isPermiso;
		this.isPermisoNuevoTipoTributario=isPermiso;
		this.isPermisoActualizarTipoTributario=isPermiso;
		this.isPermisoActualizarOriginalTipoTributario=isPermiso;
		this.isPermisoEliminarTipoTributario=isPermiso;
		this.isPermisoGuardarCambiosTipoTributario=isPermiso;
		this.isPermisoConsultaTipoTributario=isPermiso;
		this.isPermisoBusquedaTipoTributario=isPermiso;
		this.isPermisoReporteTipoTributario=isPermiso;
		this.isPermisoOrdenTipoTributario=isPermiso;		
		this.isPermisoPaginacionMedioTipoTributario=isPermiso;		
		this.isPermisoPaginacionAltoTipoTributario=isPermiso;		
		this.isPermisoPaginacionTodoTipoTributario=isPermiso;		
		this.isPermisoCopiarTipoTributario=isPermiso;		
		this.isPermisoVerFormTipoTributario=isPermiso;		
		this.isPermisoDuplicarTipoTributario=isPermiso;
		this.isPermisoOrdenTipoTributario=isPermiso;
	}
	
	public void setPermisosMantenimientoUsuarioTipoTributario(Boolean isPermiso) {
		//this.isPermisoTodoTipoTributario=isPermiso;
		this.isPermisoNuevoTipoTributario=isPermiso;
		this.isPermisoActualizarTipoTributario=isPermiso;
		this.isPermisoActualizarOriginalTipoTributario=isPermiso;
		this.isPermisoEliminarTipoTributario=isPermiso;
		this.isPermisoGuardarCambiosTipoTributario=isPermiso;
		//this.isPermisoConsultaTipoTributario=isPermiso;
		//this.isPermisoBusquedaTipoTributario=isPermiso;
		//this.isPermisoReporteTipoTributario=isPermiso;
		//this.isPermisoOrdenTipoTributario=isPermiso;		
		//this.isPermisoPaginacionMedioTipoTributario=isPermiso;		
		//this.isPermisoPaginacionAltoTipoTributario=isPermiso;		
		//this.isPermisoPaginacionTodoTipoTributario=isPermiso;		
		//this.isPermisoCopiarTipoTributario=isPermiso;		
		//this.isPermisoDuplicarTipoTributario=isPermiso;
		//this.isPermisoOrdenTipoTributario=isPermiso;
	}
	
	public void inicializarSetPermisosUsuarioTipoTributarioClasesRelacionadas() throws Exception {
		ArrayList<String> arrPaginas=new ArrayList<String>();		
		ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
		
		arrPaginas.add(TransaccionLocalConstantesFunciones.SNOMBREOPCION);
		arrPaginas.add(FacturaProveedorServicioConstantesFunciones.SNOMBREOPCION);
		arrPaginas.add(DefinicionConstantesFunciones.SNOMBREOPCION);
		
		if(TipoTributarioJInternalFrame.CON_LLAMADA_SIMPLE) {
			this.opcionsRelacionadas.addAll(this.sistemaReturnGeneral.getOpcionsRelacionadas());
			
		} else {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				opcionsFinal=sistemaLogicAdditional.tienePermisosOpcionesEnPaginaWeb(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, arrPaginas);
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
			
			this.opcionsRelacionadas.addAll(opcionsFinal);
		}
		
		

		this.isTienePermisosTransaccionLocal=false;
		this.isTienePermisosTransaccionLocal=this.verificarGetPermisosUsuarioOpcionTipoTributarioClaseRelacionada(this.opcionsRelacionadas,TransaccionLocalConstantesFunciones.SNOMBREOPCION);

		this.isTienePermisosFacturaProveedorServicio=false;
		this.isTienePermisosFacturaProveedorServicio=this.verificarGetPermisosUsuarioOpcionTipoTributarioClaseRelacionada(this.opcionsRelacionadas,FacturaProveedorServicioConstantesFunciones.SNOMBREOPCION);

		this.isTienePermisosDefinicion=false;
		this.isTienePermisosDefinicion=this.verificarGetPermisosUsuarioOpcionTipoTributarioClaseRelacionada(this.opcionsRelacionadas,DefinicionConstantesFunciones.SNOMBREOPCION);
		
	}
	
	public Boolean tienePermisosUsuarioEnPaginaWebTipoTributario(String sPagina) throws Exception {
		Boolean tienePermisos=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tienePermisos=sistemaLogicAdditional.tienePermisosEnPaginaWeb(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, sPagina);
		} else if(Constantes.ISUSAEJBREMOTE) {
		} else if(Constantes.ISUSAEJBHOME) {
		}
		
		return tienePermisos;
	}
	
	public void inicializarSetPermisosUsuarioTipoTributarioClasesRelacionadas(Boolean conPermiso) throws Exception {
		
		this.isTienePermisosTransaccionLocal=conPermiso;
		this.isTienePermisosFacturaProveedorServicio=conPermiso;
		this.isTienePermisosDefinicion=conPermiso;
	}
	
	public Boolean verificarGetPermisosUsuarioTipoTributarioClaseRelacionada(ArrayList<String> arrPaginasFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioClaseRelacionada(arrPaginasFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public Boolean verificarGetPermisosUsuarioOpcionTipoTributarioClaseRelacionada(List<Opcion> opcionsFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioOpcionClaseRelacionada(opcionsFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public void actualizarTabsSetPermisosUsuarioTipoTributarioClasesRelacionadas() throws Exception {
		

		if(!this.isTienePermisosTransaccionLocal && this.jInternalFrameDetalleFormTipoTributario!=null && this.jInternalFrameDetalleFormTipoTributario.transaccionlocalBeanSwingJInternalFrame!=null) {
			this.jInternalFrameDetalleFormTipoTributario.jTabbedPaneRelacionesTipoTributario.remove(this.jInternalFrameDetalleFormTipoTributario.transaccionlocalBeanSwingJInternalFrame.getContentPane());
		}

		if(!this.isTienePermisosFacturaProveedorServicio && this.jInternalFrameDetalleFormTipoTributario!=null && this.jInternalFrameDetalleFormTipoTributario.facturaproveedorservicioBeanSwingJInternalFrame!=null) {
			this.jInternalFrameDetalleFormTipoTributario.jTabbedPaneRelacionesTipoTributario.remove(this.jInternalFrameDetalleFormTipoTributario.facturaproveedorservicioBeanSwingJInternalFrame.getContentPane());
		}

		if(!this.isTienePermisosDefinicion && this.jInternalFrameDetalleFormTipoTributario!=null && this.jInternalFrameDetalleFormTipoTributario.definicionBeanSwingJInternalFrame!=null) {
			this.jInternalFrameDetalleFormTipoTributario.jTabbedPaneRelacionesTipoTributario.remove(this.jInternalFrameDetalleFormTipoTributario.definicionBeanSwingJInternalFrame.getContentPane());
		}
	}
	
	public void setPermisosUsuarioTipoTributario() throws Exception {
		
		PerfilOpcion perfilOpcionUsuario=new PerfilOpcion();		
		Long idOpcion=this.opcionActual.getId();
		
		if(TipoTributarioJInternalFrame.CON_LLAMADA_SIMPLE) {
			perfilOpcionUsuario=this.sistemaReturnGeneral.getPerfilOpcion();
			
		} else {
			if(this.tipotributarioSessionBean.getEsGuardarRelacionado()) {
				idOpcion=0L;
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				perfilOpcionUsuario=sistemaLogicAdditional.traerPermisosPaginaWebPerfilOpcion(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, TipoTributarioConstantesFunciones.SNOMBREOPCION,idOpcion);				
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
		}
		
		if(perfilOpcionUsuario!=null && perfilOpcionUsuario.getId()>0) {
			this.isPermisoNuevoTipoTributario=perfilOpcionUsuario.getingreso()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarTipoTributario=perfilOpcionUsuario.getmodificacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarOriginalTipoTributario=this.isPermisoActualizarTipoTributario;
			this.isPermisoEliminarTipoTributario=perfilOpcionUsuario.geteliminacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoGuardarCambiosTipoTributario=perfilOpcionUsuario.getguardar_cambios()||perfilOpcionUsuario.gettodo();
			this.isPermisoConsultaTipoTributario=perfilOpcionUsuario.getconsulta()||perfilOpcionUsuario.gettodo();
			this.isPermisoBusquedaTipoTributario=perfilOpcionUsuario.getbusqueda()||perfilOpcionUsuario.gettodo();
			this.isPermisoTodoTipoTributario=perfilOpcionUsuario.gettodo()||perfilOpcionUsuario.gettodo();
			this.isPermisoReporteTipoTributario=perfilOpcionUsuario.getreporte()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenTipoTributario=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionMedioTipoTributario=perfilOpcionUsuario.getpaginacion_medio()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionAltoTipoTributario=perfilOpcionUsuario.getpaginacion_alto()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionTodoTipoTributario=perfilOpcionUsuario.getpaginacion_todo()||perfilOpcionUsuario.gettodo();
			this.isPermisoCopiarTipoTributario=perfilOpcionUsuario.getcopiar()||perfilOpcionUsuario.gettodo();
			this.isPermisoVerFormTipoTributario=true;//perfilOpcionUsuario.getver_form()||perfilOpcionUsuario.gettodo();
			this.isPermisoDuplicarTipoTributario=perfilOpcionUsuario.getduplicar()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenTipoTributario=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			
			if(this.tipotributarioSessionBean.getEsGuardarRelacionado()) {
				this.opcionActual.setId(perfilOpcionUsuario.getid_opcion());
				
				this.jTableDatosTipoTributario.setToolTipText(this.jTableDatosTipoTributario.getToolTipText()+"_"+perfilOpcionUsuario.getid_opcion());		
			}
		} else {
			this.setPermisosUsuarioTipoTributario(false);
		}
		
		//SI SE NECESITA PONER TODOS LOS PERMISOS POR DEFECTO
		//
		
	}
	
	public void setAccionesUsuarioTipoTributario(Boolean esParaAccionesFormulario) throws Exception {		
		Reporte reporte=null;
		
		if(!esParaAccionesFormulario) {
			this.accions=new ArrayList<Accion>();
			
			if(TipoTributarioJInternalFrame.CON_LLAMADA_SIMPLE) {
				this.accions=this.sistemaReturnGeneral.getAccions();
				
				
			} else {
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.accions=sistemaLogicAdditional.getAccionesUsuario(this.usuarioActual,this.opcionActual,false);				
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
			}
			
			if(this.accions.size()>0) {			
				for(Accion accion:this.accions) {
					reporte=new Reporte();
					reporte.setsCodigo(accion.getcodigo());
					reporte.setsDescripcion(accion.getnombre());
		
		
					this.tiposAcciones.add(reporte);
				}
			}	
			
			

			reporte=new Reporte();
			reporte.setsCodigo("");
			reporte.setsDescripcion("");

			this.tiposAcciones.add(reporte);
			
		} else {
			//ACCIONES FORMULARIO
			this.accionsFormulario=new ArrayList<Accion>();
			
			if(TipoTributarioJInternalFrame.CON_LLAMADA_SIMPLE) {
				this.accionsFormulario=this.sistemaReturnGeneral.getAccionsFormulario();
			
			} else {
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.accionsFormulario=sistemaLogicAdditional.getAccionesUsuario(this.usuarioActual,this.opcionActual,true);				
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
			}
			
			if(this.accionsFormulario.size()>0) {			
				for(Accion accion:this.accionsFormulario) {
					reporte=new Reporte();
					reporte.setsCodigo(accion.getcodigo());
					reporte.setsDescripcion(accion.getnombre());
					
					this.tiposAccionesFormulario.add(reporte);
				}
			}	
			
			

			reporte=new Reporte();
			reporte.setsCodigo("");
			reporte.setsDescripcion("");

			this.tiposAccionesFormulario.add(reporte);
		}				
	}	 	
	
	public void setRelacionesUsuarioTipoTributario() throws Exception {
		Reporte reporte=null;
		
		

		if(this.isTienePermisosTransaccionLocal && this.tipotributarioConstantesFunciones.mostrarTransaccionLocalTipoTributario && !TipoTributarioConstantesFunciones.ISGUARDARREL) {

			reporte=new Reporte();
			reporte.setsCodigo("Transaccion Local");
			reporte.setsDescripcion("Transaccion Local");
			this.tiposRelaciones.add(reporte);
		}

		if(this.isTienePermisosFacturaProveedorServicio && this.tipotributarioConstantesFunciones.mostrarFacturaProveedorServicioTipoTributario && !TipoTributarioConstantesFunciones.ISGUARDARREL) {

			reporte=new Reporte();
			reporte.setsCodigo("Factura Proveedor");
			reporte.setsDescripcion("Factura Proveedor");
			this.tiposRelaciones.add(reporte);
		}

		if(this.isTienePermisosDefinicion && this.tipotributarioConstantesFunciones.mostrarDefinicionTipoTributario && !TipoTributarioConstantesFunciones.ISGUARDARREL) {

			reporte=new Reporte();
			reporte.setsCodigo("Definicion");
			reporte.setsDescripcion("Definicion");
			this.tiposRelaciones.add(reporte);
		}
		
		
		//ORDENAR ALFABETICAMENTE
		Collections.sort(this.tiposRelaciones, new ReporteComparator());
		/*
		reporte=new Reporte();
		reporte.setsCodigo(accion.getcodigo());
		reporte.setsDescripcion(accion.getnombre());
			
		this.tiposRelaciones.add(reporte);
		*/
	}	
	
		
	@SuppressWarnings({ "unchecked", "rawtypes" } )
	public void inicializarCombosForeignKeyTipoTributarioListas()throws Exception {
		try	{						
			
				this.paissForeignKey=new ArrayList();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void cargarCombosTodosForeignKeyTipoTributarioListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			String sFinalQueryCombo="";
			
			Modulo  moduloActualAux=new Modulo();
			
			if(TipoTributarioJInternalFrame.ISLOAD_FKLOTE) {
				this.cargarCombosLoteForeignKeyTipoTributarioListas(false);
			} else {
			
				this.cargarCombosForeignKeyPaisListas(cargarCombosDependencia,sFinalQueryCombo);
			}
		} catch(Exception e) {
			throw e;
		}		
	}		
	
	

	public void cargarCombosForeignKeyPaisListas(Boolean cargarCombosDependencia,String sFinalQuery)throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();

			String  finalQueryGlobal="";

			Modulo  moduloActualAux=new Modulo();

			if((this.paissForeignKey==null||this.paissForeignKey.size()<=0)) {
				this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
				this.arrDatoGeneralNo= new  ArrayList<String>();

				arrColumnasGlobales=PaisConstantesFunciones.getArrayColumnasGlobalesPais(this.arrDatoGeneral,this.arrDatoGeneralNo);
				finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,PaisConstantesFunciones.TABLENAME);

				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, sFinalQuery);
				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, "");

				finalQueryGlobal+=PaisConstantesFunciones.SFINALQUERY;

				this.cargarCombosPaissForeignKeyLista(finalQueryGlobal);
			}

		} catch(Exception e) {
			throw e;
		}
	}
	
	public void cargarCombosLoteForeignKeyTipoTributarioListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			Modulo  moduloActualAux=new Modulo();
			
			
			TipoTributarioParameterReturnGeneral tipotributarioReturnGeneral=new TipoTributarioParameterReturnGeneral();
						
			


				String finalQueryGlobalPais="";

				if(((this.paissForeignKey==null||this.paissForeignKey.size()<=0) && this.tipotributarioConstantesFunciones.cargarid_paisTipoTributario)
					 || (this.esRecargarFks && this.tipotributarioConstantesFunciones.cargarid_paisTipoTributario)) {

					if(!this.tipotributarioSessionBean.getisBusquedaDesdeForeignKeySesionPais()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=PaisConstantesFunciones.getArrayColumnasGlobalesPais(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalPais=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,PaisConstantesFunciones.TABLENAME);

						finalQueryGlobalPais=Funciones.GetFinalQueryAppend(finalQueryGlobalPais, "");
						finalQueryGlobalPais+=PaisConstantesFunciones.SFINALQUERY;

						//this.cargarCombosPaissForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalPais=" WHERE " + ConstantesSql.ID + "="+tipotributarioSessionBean.getlidPaisActual();
					}
				} else {
					finalQueryGlobalPais="NONE";
				}
			
			//ARCHITECTURE			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				tipotributarioReturnGeneral=tipotributarioLogic.cargarCombosLoteForeignKeyTipoTributario(finalQueryGlobalPais);//WithConnection
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}			
			//ARCHITECTURE
			
			

			if(!finalQueryGlobalPais.equals("NONE")) {
				this.paissForeignKey=tipotributarioReturnGeneral.getpaissForeignKey();
			}
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void addItemDefectoCombosTodosForeignKeyTipoTributario()throws Exception {
		try {
			
			this.addItemDefectoCombosForeignKeyPais();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	



	public void addItemDefectoCombosForeignKeyPais()throws Exception {
		try {
			if(this.tipotributarioSessionBean==null) {
				this.tipotributarioSessionBean=new TipoTributarioSessionBean();
			}

			if(!this.tipotributarioSessionBean.getisBusquedaDesdeForeignKeySesionPais()) {
				Pais pais=new Pais();
				PaisConstantesFunciones.setPaisDescripcion(pais,Constantes.SMENSAJE_ESCOJA_OPCION);
				pais.setId(null);

				if(!PaisConstantesFunciones.ExisteEnLista(this.paissForeignKey,pais,true)) {

					this.paissForeignKey.add(0,pais);
				}
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void initActionsCombosTodosForeignKeyTipoTributario()throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void initActionsCombosTodosForeignKeyTipoTributario(String sFormularioTipoBusqueda)throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	


	
	


	
	public void setVariablesGlobalesCombosForeignKeyTipoTributario()throws Exception {	
		try {
			if(this.parametroGeneralUsuario!=null && this.parametroGeneralUsuario.getId()>0) {
			
			
			
			}
			
			//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
			this.setVariablesGlobalesAuxiliaresCombosForeignKeyTipoTributario();
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToFormularioForeignKeyTipoTributario(TipoTributario tipotributario)throws Exception {	
		try {
			
			this.setActualPaisForeignKey(tipotributario.getid_pais(),false,"Formulario");			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToListasForeignKeyTipoTributario(TipoTributario tipotributario,String sTipoEvento)throws Exception {	
		try {
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	/*
	public void setVariablesCombosFromBeanForeignKeyTipoTributario()throws Exception {	
		try {
			
			this.setActualPaisForeignKey(this.tipotributarioConstantesFunciones.getid_pais(),false,"Formulario");			
		} catch(Exception e) {
			throw e;
		}
	}
	*/
	
	public void setVariablesGlobalesAuxiliaresCombosForeignKeyTipoTributario()throws Exception {	
		try {
			
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesDefaultCombosForeignKeyTipoTributario()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesParametroCombosForeignKeyTipoTributario()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void cargarCombosParametroTipoTributario()throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			//this.cargarDatosCliente();
			
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
		
	public void cargarCombosFrameForeignKeyTipoTributario()throws Exception {
		try {
			

			this.cargarCombosFramePaissForeignKey("Todos");

		} catch(Exception e) {
			throw e;
		}		
	}		
	
	public void cargarCombosFrameForeignKeyTipoTributario(String sFormularioTipoBusqueda)throws Exception {
		try {
			

			this.cargarCombosFramePaissForeignKey(sFormularioTipoBusqueda);

		} catch(Exception e) {
			throw e;
		}		
	}	
	
	public void setItemDefectoCombosForeignKeyTipoTributario()throws Exception {
		try {
			



			if(this.jInternalFrameDetalleFormTipoTributario.jComboBoxid_paisTipoTributario!=null && this.jInternalFrameDetalleFormTipoTributario.jComboBoxid_paisTipoTributario.getItemCount()>0) {
				this.jInternalFrameDetalleFormTipoTributario.jComboBoxid_paisTipoTributario.setSelectedIndex(0);
			}
		} catch(Exception e) {
			throw e;
		}		
	}		
	
	


	
	

	public TipoTributarioBeanSwingJInternalFrame() throws Exception {
		super(false,PaginaTipo.PRINCIPAL);
	}
	
	public TipoTributarioBeanSwingJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
	}
	
	public TipoTributarioBeanSwingJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
		
		this.tipotributarioSessionBean=new TipoTributarioSessionBean(); 
		this.tipotributarioConstantesFunciones=new TipoTributarioConstantesFunciones(); 
		this.tipotributarioBean=new TipoTributario();//(this.tipotributarioConstantesFunciones); 		
		this.tipotributarioReturnGeneral=new TipoTributarioParameterReturnGeneral(); 
		
		this.tipotributarioSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.tipotributarioSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
				
	}
	
	public TipoTributarioBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,cargarTodosDatos);
	}
		
	public TipoTributarioBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,false,false,cargarRelaciones,cargarTodosDatos);
	}	
	
	public TipoTributarioBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos) throws Exception //Boolean esParaBusquedaForeignKey
    {
		super(jdesktopPane,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		try {
			
			this.permiteRecargarForm=false;
			
			this.startProcessTipoTributario(true);
			
			Boolean esParaBusquedaForeignKey=false;//ANTES USADO COMO PARAMETRO DEL CONSTRUCTOR
			
			if(paginaTipo.equals(PaginaTipo.BUSQUEDA)) {
				esParaBusquedaForeignKey=true;
			}
			
			
			
			//SE ASIGNA EN CLASE PADRE
			/*
			this.parametroGeneralSg=parametroGeneralSg;		
			this.parametroGeneralUsuario=parametroGeneralUsuario;	
			this.usuarioActual=usuarioActual;
			this.moduloActual=moduloActual;
			*/						
			
			long start_time=0;
			long end_time=0;
			
			if(Constantes2.ISDEVELOPING2) {
				start_time = System.currentTimeMillis();
			}
			
			if(!cargarTodosDatos) {
				this.sAccionBusqueda="NINGUNO";
			}
			
			this.tipotributarioConstantesFunciones=new TipoTributarioConstantesFunciones(); 
			this.tipotributarioBean=new TipoTributario();//this.tipotributarioConstantesFunciones); 			
			this.tipotributarioReturnGeneral=new TipoTributarioParameterReturnGeneral(); 
		
			TipoTributarioBeanSwingJInternalFrameAdditional.CargaInicialInicio(this, "NORMAL", null);
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Tipo Tributario Mantenimiento",paginaTipo));			
			
			this.conTotales=false;
			
			
			
			this.tipotributario=new TipoTributario();
			this.tipotributarios = new ArrayList<TipoTributario>();
			this.tipotributariosAux = new ArrayList<TipoTributario>();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipotributarioLogic=new TipoTributarioLogic();
				this.tipotributarioLogic.getNewConnexionToDeep("");
			}
			
			//this.tipotributarioSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
			//this.tipotributarioSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
			
			this.jDesktopPane=jdesktopPane;
			
			if(this.jDesktopPane.getClass().equals(JDesktopPaneMe.class)) {
				this.constantes2=((JDesktopPaneMe)this.jDesktopPane).constantes2;
			}
			
			if(!Constantes.CON_VARIAS_VENTANAS) {
    			MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameDetalleFormTipoTributario);
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameReporteDinamicoTipoTributario!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoTipoTributario);	
					}
					
					if(this.jInternalFrameImportacionTipoTributario!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionTipoTributario);							
					}
					
				}
				
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameOrderByTipoTributario!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameOrderByTipoTributario);					
					}
					
				}
			}
			
			//DETALLE DATOS
			if(this.jInternalFrameDetalleFormTipoTributario!=null) { //this.conCargarFormDetalle) {
				this.jDesktopPane.add(this.jInternalFrameDetalleFormTipoTributario);
				this.jInternalFrameDetalleFormTipoTributario.setVisible(false);
				this.jInternalFrameDetalleFormTipoTributario.setSelected(false);						
			}
			
			if(!this.conCargarMinimo) {
				
				//REPORTE DINAMICO
				if(this.jInternalFrameReporteDinamicoTipoTributario!=null) {
					this.jDesktopPane.add(this.jInternalFrameReporteDinamicoTipoTributario);
					this.jInternalFrameReporteDinamicoTipoTributario.setVisible(false);
					this.jInternalFrameReporteDinamicoTipoTributario.setSelected(false);
				}
				
				//IMPORTACION
				if(this.jInternalFrameImportacionTipoTributario!=null) {
					this.jDesktopPane.add(this.jInternalFrameImportacionTipoTributario);
					this.jInternalFrameImportacionTipoTributario.setVisible(false);
					this.jInternalFrameImportacionTipoTributario.setSelected(false);
				}
				
				
			}
			
			
			if(!this.conCargarMinimo) {
				
				if(this.jInternalFrameOrderByTipoTributario!=null) {
					this.jDesktopPane.add(this.jInternalFrameOrderByTipoTributario);
					this.jInternalFrameOrderByTipoTributario.setVisible(false);
					this.jInternalFrameOrderByTipoTributario.setSelected(false);				
				}
				
			}
			
			
			//this.esParaBusquedaForeignKey=false;
			this.esParaBusquedaForeignKey=esParaBusquedaForeignKey;
			
			this.invalidValues=new InvalidValue[0];
			
			
			
			this.idTipoTributarioActual=0L;
			this.rowIndexActual=0;
			
			
			this.iNumeroPaginacionPagina=0;
			this.iNumeroPaginacion=TipoTributarioConstantesFunciones.INUMEROPAGINACION;
			this.pagination=new Pagination();
			this.datosCliente=new DatosCliente();
			this.lIdUsuarioSesion=0L;	
			this.sTipoArchivoReporte="";
			this.sTipoArchivoReporteDinamico="";
			this.sTipoReporte="";
			this.sTipoReporteDinamico="";
			this.sTipoPaginacion="";
			this.sTipoRelacion="";
			this.sTipoAccion="";
			this.sTipoAccionFormulario="";
			this.sTipoSeleccionar="";			
			this.sDetalleReporte="";
			this.sTipoReporteExtra="";
			this.sValorCampoGeneral="";
			this.sPathReporteDinamico="";			
			
			this.isMostrarNumeroPaginacion=false;
			this.isSeleccionarTodos=false;
			this.isSeleccionados=false;
			this.conGraficoReporte=false;
			this.isPostAccionNuevo=false;
			this.isPostAccionSinCerrar=false;
			this.isPostAccionSinMensaje=false;
			this.esReporteDinamico=false;
			this.esRecargarFks=false;
			this.esReporteAccionProceso=false;
			
			this.tipotributarioReturnGeneral=new TipoTributarioParameterReturnGeneral();
			
			this.tipotributarioParameterGeneral=new TipoTributarioParameterReturnGeneral();
			
			
			
			this.sistemaLogicAdditional=new SistemaLogicAdditional();
			
			this.sistemaLogicAdditional.setConnexion(this.tipotributarioLogic.getConnexion());			
			
			
			
			
			
			
			
			//VERIFICAR GLOBAL
			this.cargarDatosCliente();			
			
			
			if(!this.tipotributarioSessionBean.getEsGuardarRelacionado()) {
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					if(!sistemaLogicAdditional.validarLicenciaCliente(this.datosCliente,this.moduloActual,this.usuarioActual)) {
					 	this.setVisible(false);
						throw new Exception(Mensajes.SERROR_CONTROLGLOBAL);
					}
					
				} else if(Constantes.ISUSAEJBREMOTE) {
					
				} else if(Constantes.ISUSAEJBHOME) {
				}
			}			
			
			//VERIFICAR GLOBAL
			
			//VERIFICAR SESSION ACTUAL
			//this.cargarDatosCliente();
			
			this.sistemaReturnGeneral=new SistemaParameterReturnGeneral();
			
			SistemaParameterReturnGeneralAdditional.inicializarSinSeguridad(this.sistemaReturnGeneral);
			
			if(TipoTributarioJInternalFrame.CON_LLAMADA_SIMPLE) {
				if(this.tipotributarioSessionBean.getEsGuardarRelacionado()) {
					this.opcionActual.setId(0L);
					
					//idOpcion=0L;					
				}
				
				ArrayList<String> arrPaginas=new ArrayList<String>();		
				ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
				
				arrPaginas.add(TransaccionLocalConstantesFunciones.SNOMBREOPCION);
				arrPaginas.add(FacturaProveedorServicioConstantesFunciones.SNOMBREOPCION);
				arrPaginas.add(DefinicionConstantesFunciones.SNOMBREOPCION);
		
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					//this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActualWithConnection(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,TipoTributarioConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.tipotributarioSessionBean.getEsGuardarRelacionado(),this.tipotributarioSessionBean.getConGuardarRelaciones(),arrPaginas);
					
					this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActual(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,TipoTributarioConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.tipotributarioSessionBean.getEsGuardarRelacionado(),this.tipotributarioSessionBean.getConGuardarRelaciones(),arrPaginas);
					
					if(!this.sistemaReturnGeneral.getEsValidado()) {
					 	this.setVisible(false);
						throw new Exception(Mensajes.SERROR_SESIONACTUAL);
					}
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
					//FALTA
				}
			} else { 
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					if(!sistemaLogicAdditional.validarSesionUsuarioActual(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual)) {
					 	this.setVisible(false);
						throw new Exception(Mensajes.SERROR_SESIONACTUAL);
					}
				
				} else if(Constantes.ISUSAEJBREMOTE) {
					
				} else if(Constantes.ISUSAEJBHOME) {
				}
			} 
			//VERIFICAR SESSION ACTUAL
			
			
			this.sVisibilidadTablaBusquedas="table-row";
			this.sVisibilidadTablaElementos="none";
			this.sVisibilidadTablaAcciones="none";
			
			this.isVisibilidadCeldaNuevoTipoTributario=false;
			this.isVisibilidadCeldaDuplicarTipoTributario=true;
			this.isVisibilidadCeldaCopiarTipoTributario=true;
			this.isVisibilidadCeldaVerFormTipoTributario=true;
			this.isVisibilidadCeldaOrdenTipoTributario=true;
			this.isVisibilidadCeldaNuevoRelacionesTipoTributario=false;
			this.isVisibilidadCeldaModificarTipoTributario=false;
			this.isVisibilidadCeldaActualizarTipoTributario=false;
			this.isVisibilidadCeldaEliminarTipoTributario=false;
			this.isVisibilidadCeldaCancelarTipoTributario=false;
			this.isVisibilidadCeldaGuardarTipoTributario=false;
			this.isVisibilidadCeldaGuardarCambiosTipoTributario=false;
			
			
			this.isVisibilidadBusquedaPorCodigo=true;
			this.isVisibilidadBusquedaPorId=true;
			this.isVisibilidadBusquedaPorNombre=true;
			this.isVisibilidadFK_IdPais=true;
			
			//ELEMENTOS TABLAS PARAMETOS
			
			
			
			//ELEMENTOS TABLAS PARAMETOS_FIN
			
			//this.actualizarEstadoCeldasBotonesTipoTributario("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
						
			
			
			this.inicializarPermisosTipoTributario();
			
			//INICIALIZAR FALSE, TALVEZ COMENTAR
			this.setPermisosUsuarioTipoTributario(false);
			
			this.setPermisosUsuarioTipoTributario();
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.tipotributarioSessionBean.getEsGuardarRelacionado() 
				|| (this.tipotributarioSessionBean.getEsGuardarRelacionado() && this.tipotributarioSessionBean.getConGuardarRelaciones())) {
				
				this.inicializarSetPermisosUsuarioTipoTributarioClasesRelacionadas();
			}
			
			if(this.tipotributarioSessionBean.getConGuardarRelaciones()) {
				this.actualizarTabsSetPermisosUsuarioTipoTributarioClasesRelacionadas();
			}
			
			
			
			//SOLO SE EJECUTA LA PRIMERA VEZ, BINDINGS SI FUNCIONA
			if(!TipoTributarioJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingBotonesPermisosTipoTributario();
			} else {
				this.inicializarActualizarBindingBotonesPermisosManualTipoTributario();
			}
			
			if(!this.isPermisoBusquedaTipoTributario) {
				//BYDAN_BUSQUEDAS
				
				this.jTabbedPaneBusquedasTipoTributario.setVisible(false);				
				
			}
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.tipotributarioSessionBean.getEsGuardarRelacionado()) {				
				this.tiposArchivosReportes=Funciones.getListTiposArchivosReportes();
				this.tiposArchivosReportesDinamico=Funciones.getListTiposArchivosReportes();
				this.tiposReportes=Funciones.getListTiposReportes(false);
				this.tiposReportesDinamico=Funciones.getListTiposReportesDinamico(false);
				
				
				this.tiposReportes.add(new Reporte("RELACIONES","RELACIONES"));
				this.tiposReportesDinamico.add(new Reporte("RELACIONES","RELACIONES"));
				
				this.tiposGraficosReportes=Funciones2.getListTiposGraficosReportes();
				this.tiposPaginacion=Funciones2.getListTiposPaginacion(this.isPermisoPaginacionMedioTipoTributario,this.isPermisoPaginacionMedioTipoTributario,this.isPermisoPaginacionTodoTipoTributario);
				this.tiposSeleccionar=Funciones2.getListTiposSeleccionar();
				this.tiposSeleccionar.addAll(TipoTributarioConstantesFunciones.getTiposSeleccionarTipoTributario());
				
				this.tiposColumnasSelect=TipoTributarioConstantesFunciones.getTiposSeleccionarTipoTributario(true);
				
				this.tiposRelacionesSelect=new ArrayList<Reporte>();								
				
				this.cargarTiposRelacionesSelectTipoTributario();				
				//this.tiposRelacionesSelect=TipoTributarioConstantesFunciones.getTiposRelacionesTipoTributario(true);
				
			} else {
				this.tiposArchivosReportes=new ArrayList<Reporte>();
				this.tiposArchivosReportesDinamico=new ArrayList<Reporte>();
				this.tiposReportes=new ArrayList<Reporte>();
				this.tiposReportesDinamico=new ArrayList<Reporte>();
				this.tiposGraficosReportes=new ArrayList<Reporte>();
				this.tiposPaginacion=new ArrayList<Reporte>();
				this.tiposSeleccionar=new ArrayList<Reporte>();			
				this.tiposColumnasSelect=new ArrayList<Reporte>();	
				this.tiposRelacionesSelect=new ArrayList<Reporte>();	
			}
						
			
			//FUNCIONALIDAD_RELACIONADO
			//if(!this.tipotributarioSessionBean.getEsGuardarRelacionado()) {
				//SE ENCUENTRA MAS ADELANTE CON ACCIONES POR USUARIO
				//ACCIONES GENERALES Y POR USUARIO
				this.tiposRelaciones=Funciones2.getListTiposRelaciones();
				this.setRelacionesUsuarioTipoTributario();
				
				this.tiposAcciones=Funciones2.getListTiposAcciones(false,false,true);
				this.setAccionesUsuarioTipoTributario(false);	
				
				this.tiposAccionesFormulario=Funciones2.getListTiposAccionesFormulario(false,false,true);							
				this.setAccionesUsuarioTipoTributario(true);	
				
				this.inicializarActualizarBindingtiposArchivosReportesAccionesTipoTributario() ;
			
			/*
			} else {
				this.tiposAcciones=new ArrayList<Reporte>();
				this.tiposAccionesFormulario=new ArrayList<Reporte>();
			}
			*/						
			
			this.inicializarInvalidValues();
						
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			
			
			this.arrOrderBy= new  ArrayList<OrderBy>();
			
			
			this.arrDatoGeneralMinimos= new  ArrayList<DatoGeneralMinimo>();
			
			
			this.traerValoresTablaOrderBy();			
			
			
			this.isGuardarCambiosEnLote=false;
			this.isCargarCombosDependencia=false;
			
			
			this.transaccionlocalLogic=new TransaccionLocalLogic();
			this.facturaproveedorservicioLogic=new FacturaProveedorServicioLogic();
			this.definicionLogic=new DefinicionLogic(); 
			jasperPrint = null;												
			
			//FK
			
			this.paisLogic=new PaisLogic();
			
			//PARAMETROS
			
			
			/*
			if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {		
				hashtableEnv =  Funciones.getHashtableEnv();		
				initialContext = new InitialContext(hashtableEnv);	
			}
			*/
			/*
			if(Constantes.ISUSAEJBREMOTE) {
				tipotributarioImplementable= (TipoTributarioImplementable) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+TipoTributarioConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBREMOTE);
			} else if(Constantes.ISUSAEJBHOME) {
				tipotributarioImplementableHome= (TipoTributarioImplementableHome) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+TipoTributarioConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBLOCAL);
			}			
			*/
			
			
			this.tipotributarios= new ArrayList<TipoTributario>();
			this.tipotributariosEliminados= new ArrayList<TipoTributario>();
						
			this.isEsNuevoTipoTributario=false;
			this.esParaAccionDesdeFormularioTipoTributario=false;
			this.isEsMantenimientoRelacionesRelacionadoUnico=false;
			this.isEsMantenimientoRelaciones=false;
			this.isEsMantenimientoRelacionado=false;
			this.isContieneImagenes=false;
			
			
			
			
			
			//INICIALIZAR LISTAS FK
			
			this.paissForeignKey=new ArrayList<Pais>() ;
			
			
			
			
			if(blncargarCombostrForeignKey) {
				this.cargarCombosForeignKeyTipoTributario(this.isCargarCombosDependencia);
			}
			
			this.cargarCombosParametroTipoTributario();
			
			
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.tipotributarioSessionBean.getEsGuardarRelacionado()) {
				this.onLoad();
			}
						
			TipoTributarioBeanSwingJInternalFrameAdditional.RecargarVentanaSegunOpcion(this,opcionActual);
			
			/*
			if(blnCargarInformacionInicial) {
				this.recargarInformacion();
			}
			*/
			//this.iNumeroPaginacionPagina=0;
			//this.iNumeroPaginacion=TipoTributarioConstantesFunciones.INUMEROPAGINACION;
			
			this.actualizarEstadoCeldasBotonesTipoTributario("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			//SOLO LA PRIMERA VEZ HACE LOS BINDINGS, SOLO AHI FUNCIONA
			this.inicializarActualizarBindingTipoTributario(true); 
			
			//SE REDIMENSIONA SINO NO SE ACTUALIZA
			this.redimensionarTablaDatos();
			
			
			this.initActions();
			
			;
						
			if(this.jInternalFrameDetalleFormTipoTributario!=null) {//if(this.conCargarFormDetalle) {
				this.cargarMenuRelaciones();
			}
			
			//OBLIGA CARGAR DETALLE, MEJOR DESHABILITAR, FALTA TALVEZ PONER EN SELECCIONAR
			//MAYBE
			//this.updateControlesFormularioTipoTributario();
			
			if(!this.conCargarMinimo) {
				this.updateBusquedasFormularioTipoTributario();
			}
			
			TipoTributarioBeanSwingJInternalFrameAdditional.CargaInicial(this, "NORMAL", null);
			
			
			//SE REALIZA ESTO PARA QUE SE PUEDA RECORRER TAB SIN IMPORTAR ORDEN
			Boolean existeTabBusqueda=false;
			
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				
				for(int i=0; i<this.jTabbedPaneBusquedasTipoTributario.getTabCount(); i++) {
					this.jTabbedPaneBusquedasTipoTributario.setSelectedIndex(i);
						
					if(!existeTabBusqueda) {
						existeTabBusqueda=true;
					}
				}
					
				if(existeTabBusqueda) {
					this.jTabbedPaneBusquedasTipoTributario.setSelectedIndex(0);
				}	
				
				
			}
			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipotributarioLogic.commitNewConnexionToDeep();
			}
			
			
			if(Constantes2.ISDEVELOPING2) {
				end_time = System.currentTimeMillis();			
				String sTipo="Load Ventana";
				Funciones2.getMensajeTiempoEjecucion(start_time, end_time, sTipo,false);
			}  
			
			this.finishProcessTipoTributario(true);
			
			this.dEnd=(double)System.currentTimeMillis();
			
			this.dDif=this.dEnd - this.dStart;
			
			if(Constantes.ISDEVELOPING) {
				System.out.println("Tiempo(ms) Carga TipoTributario: " + this.dDif); 
			}
			
			this.permiteRecargarForm=true;
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipotributarioLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,TipoTributarioConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipotributarioLogic.closeNewConnexionToDeep();
			}
		}	 
    }
	
	public void cargarTiposRelacionesSelectTipoTributario() {
		Reporte reporte=new Reporte();
		
	

		reporte=new Reporte();
		reporte.setsCodigo(TransaccionLocalConstantesFunciones.SCLASSWEBTITULO);
		reporte.setsDescripcion(TransaccionLocalConstantesFunciones.SCLASSWEBTITULO);
		this.tiposRelacionesSelect.add(reporte);

		reporte=new Reporte();
		reporte.setsCodigo(FacturaProveedorServicioConstantesFunciones.SCLASSWEBTITULO);
		reporte.setsDescripcion(FacturaProveedorServicioConstantesFunciones.SCLASSWEBTITULO);
		this.tiposRelacionesSelect.add(reporte);

		reporte=new Reporte();
		reporte.setsCodigo(DefinicionConstantesFunciones.SCLASSWEBTITULO);
		reporte.setsDescripcion(DefinicionConstantesFunciones.SCLASSWEBTITULO);
		this.tiposRelacionesSelect.add(reporte);
	}
	
	
	
	public void jTabbedPaneChangeListenerGeneral(String sTipo,ChangeEvent evt) { 	  
		Boolean procesaCargarParteTab=false;
			
		try {
			int iIndex=0;		    			
			String sTitle="";
			
			//TABBED PANE RELACIONES
			if(sTipo.equals("RelacionesTipoTributario")) {
				iIndex=this.jInternalFrameDetalleFormTipoTributario.jTabbedPaneRelacionesTipoTributario.getSelectedIndex();		    
			
				sTitle=this.jInternalFrameDetalleFormTipoTributario.jTabbedPaneRelacionesTipoTributario.getTitleAt(iIndex);
				
				Integer intSelectedRow = 0;	
			
				intSelectedRow = this.jTableDatosTipoTributario.getSelectedRow();	
				
				

				if(sTitle.equals("Definiciones")) {
					if(!DefinicionJInternalFrame.ESTA_CARGADO_PORPARTE) {
						procesaCargarParteTab=true;
						this.startProcessTipoTributario();

						this.cargarParteTabPanelRelacionadaDefinicion(iIndex,intSelectedRow);
					}
					
				}

				if(sTitle.equals("Factura Proveedors")) {
					if(!FacturaProveedorServicioJInternalFrame.ESTA_CARGADO_PORPARTE) {
						procesaCargarParteTab=true;
						this.startProcessTipoTributario();

						this.cargarParteTabPanelRelacionadaFacturaProveedorServicio(iIndex,intSelectedRow);
					}
					
				}

				if(sTitle.equals("Transaccion Locales")) {
					if(!TransaccionLocalJInternalFrame.ESTA_CARGADO_PORPARTE) {
						procesaCargarParteTab=true;
						this.startProcessTipoTributario();

						this.cargarParteTabPanelRelacionadaTransaccionLocal(iIndex,intSelectedRow);
					}
					
				}
				
			}
			
			//TABBED PANE RELACIONES FIN(EXTRA TAB)
			;
			
  		} catch(Exception e) {
  			e.printStackTrace();
  		} finally {
			if(procesaCargarParteTab) {				
				this.finishProcessTipoTributario();	
			}
		}
    }
	
	

	public void cargarParteTabPanelRelacionadaDefinicion(int iIndex,int intSelectedRow) throws Exception {
		this.jInternalFrameDetalleFormTipoTributario.cargarSessionConBeanSwingJInternalFrameDefinicion(false,true,iIndex);
		this.jButtonDefinicionActionPerformed(null,intSelectedRow,false,true,null);
		this.redimensionarTablaPanelRelacionadaDefinicion();

		//this.jTabbedPaneRelacionesTipoTributario.updateUI();
		//this.jTabbedPaneRelacionesTipoTributario.removeTabAt(iIndex);
		//this.jTabbedPaneRelacionesTipoTributario.setSelectedIndex(iIndex);


	}

	public void cargarParteTabPanelRelacionadaFacturaProveedorServicio(int iIndex,int intSelectedRow) throws Exception {
		this.jInternalFrameDetalleFormTipoTributario.cargarSessionConBeanSwingJInternalFrameFacturaProveedorServicio(false,true,iIndex);
		this.jButtonFacturaProveedorServicioActionPerformed(null,intSelectedRow,false,true,null);
		this.redimensionarTablaPanelRelacionadaFacturaProveedorServicio();

		//this.jTabbedPaneRelacionesTipoTributario.updateUI();
		//this.jTabbedPaneRelacionesTipoTributario.removeTabAt(iIndex);
		//this.jTabbedPaneRelacionesTipoTributario.setSelectedIndex(iIndex);


	}

	public void cargarParteTabPanelRelacionadaTransaccionLocal(int iIndex,int intSelectedRow) throws Exception {
		this.jInternalFrameDetalleFormTipoTributario.cargarSessionConBeanSwingJInternalFrameTransaccionLocal(false,true,iIndex);
		this.jButtonTransaccionLocalActionPerformed(null,intSelectedRow,false,true,null);
		this.redimensionarTablaPanelRelacionadaTransaccionLocal();

		//this.jTabbedPaneRelacionesTipoTributario.updateUI();
		//this.jTabbedPaneRelacionesTipoTributario.removeTabAt(iIndex);
		//this.jTabbedPaneRelacionesTipoTributario.setSelectedIndex(iIndex);


	}
	
	public void jButtonRelacionActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
				 if(sTipo.equals("TransaccionLocal")) {
				int row=this.jTableDatosTipoTributario.getSelectedRow();
				jButtonTransaccionLocalActionPerformed(evt,row,true,false,null);
				}
				 else  if(sTipo.equals("FacturaProveedorServicio")) {
				int row=this.jTableDatosTipoTributario.getSelectedRow();
				jButtonFacturaProveedorServicioActionPerformed(evt,row,true,false,null);
				}
				 else  if(sTipo.equals("Definicion")) {
				int row=this.jTableDatosTipoTributario.getSelectedRow();
				jButtonDefinicionActionPerformed(evt,row,true,false,null);
				}
  		} catch(Exception e) {
  			e.printStackTrace();
  		}
    }
	
	public void cargarMenuRelaciones() {	
		JMenuItem jmenuItem= new JMenuItem("General");
		String sLabelMenu="";
		
		if(!this.tipotributarioSessionBean.getEsGuardarRelacionado()) {
			for(Reporte reporte:this.tiposRelaciones) {
			

				if(reporte.getsCodigo().equals("Transaccion Local")) {

					if(this.isTienePermisosTransaccionLocal && this.tipotributarioConstantesFunciones.mostrarTransaccionLocalTipoTributario && !TipoTributarioConstantesFunciones.ISGUARDARREL) {
						if(Constantes.ISDEVELOPING) {
							sLabelMenu="Transaccion Locales"+"("+TransaccionLocalConstantesFunciones.CLASSNAME+")";
						}

						jmenuItem = new JMenuItem(sLabelMenu);
						//jmenuItem.setMnemonic(KeyEvent.VK_S);
						//jmenuItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_S, ActionEvent.ALT_MASK));
						jmenuItem.setActionCommand("Transaccion Locales");

						if(tipotributarioConstantesFunciones.resaltarTransaccionLocalTipoTributario!=null) {
							jmenuItem.setBorderPainted(true);
							jmenuItem.setBorder(tipotributarioConstantesFunciones.resaltarTransaccionLocalTipoTributario);
						}

						jmenuItem.setEnabled(this.tipotributarioConstantesFunciones.activarTransaccionLocalTipoTributario);

						jmenuItem.addActionListener (new MenuItemRelacionActionListener(this,"TransaccionLocal"));

						

						this.jInternalFrameDetalleFormTipoTributario.jmenuDetalleTipoTributario.add(jmenuItem);

						
					}

					continue;
				}

				if(reporte.getsCodigo().equals("Factura Proveedor")) {

					if(this.isTienePermisosFacturaProveedorServicio && this.tipotributarioConstantesFunciones.mostrarFacturaProveedorServicioTipoTributario && !TipoTributarioConstantesFunciones.ISGUARDARREL) {
						if(Constantes.ISDEVELOPING) {
							sLabelMenu="Factura Proveedors"+"("+FacturaProveedorServicioConstantesFunciones.CLASSNAME+")";
						}

						jmenuItem = new JMenuItem(sLabelMenu);
						//jmenuItem.setMnemonic(KeyEvent.VK_S);
						//jmenuItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_S, ActionEvent.ALT_MASK));
						jmenuItem.setActionCommand("Factura Proveedors");

						if(tipotributarioConstantesFunciones.resaltarFacturaProveedorServicioTipoTributario!=null) {
							jmenuItem.setBorderPainted(true);
							jmenuItem.setBorder(tipotributarioConstantesFunciones.resaltarFacturaProveedorServicioTipoTributario);
						}

						jmenuItem.setEnabled(this.tipotributarioConstantesFunciones.activarFacturaProveedorServicioTipoTributario);

						jmenuItem.addActionListener (new MenuItemRelacionActionListener(this,"FacturaProveedorServicio"));

						

						this.jInternalFrameDetalleFormTipoTributario.jmenuDetalleTipoTributario.add(jmenuItem);

						
					}

					continue;
				}

				if(reporte.getsCodigo().equals("Definicion")) {

					if(this.isTienePermisosDefinicion && this.tipotributarioConstantesFunciones.mostrarDefinicionTipoTributario && !TipoTributarioConstantesFunciones.ISGUARDARREL) {
						if(Constantes.ISDEVELOPING) {
							sLabelMenu="Definiciones"+"("+DefinicionConstantesFunciones.CLASSNAME+")";
						}

						jmenuItem = new JMenuItem(sLabelMenu);
						//jmenuItem.setMnemonic(KeyEvent.VK_S);
						//jmenuItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_S, ActionEvent.ALT_MASK));
						jmenuItem.setActionCommand("Definiciones");

						if(tipotributarioConstantesFunciones.resaltarDefinicionTipoTributario!=null) {
							jmenuItem.setBorderPainted(true);
							jmenuItem.setBorder(tipotributarioConstantesFunciones.resaltarDefinicionTipoTributario);
						}

						jmenuItem.setEnabled(this.tipotributarioConstantesFunciones.activarDefinicionTipoTributario);

						jmenuItem.addActionListener (new MenuItemRelacionActionListener(this,"Definicion"));

						

						this.jInternalFrameDetalleFormTipoTributario.jmenuDetalleTipoTributario.add(jmenuItem);

						
					}

					continue;
				}
			}
		}
	}		
	
	public void cargarCombosForeignKeyTipoTributario(Boolean cargarCombosDependencia) throws Exception {   
		this.cargarCombosForeignKeyTipoTributario(cargarCombosDependencia,true,true);
	}
	
	//CARGAR COMBOS EN LOTE
	public void cargarCombosForeignKeyTipoTributario(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales) throws Exception {   
		this.cargarCombosTodosForeignKeyTipoTributarioListas(cargarCombosDependencia);
				
		this.addItemDefectoCombosTodosForeignKeyTipoTributario();
		
		this.cargarCombosFrameForeignKeyTipoTributario();						
		
		if(conInitActions) {
			this.initActionsCombosTodosForeignKeyTipoTributario();
		}
		
		if(conSetVariablesGlobales) {
			this.setVariablesGlobalesCombosForeignKeyTipoTributario();
		}
	}
	
	

	public void cargarCombosForeignKeyPais(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales,String sFinalQueryCombo,String sFormularioTipoBusqueda) throws Exception {
		try {
				this.cargarCombosForeignKeyPaisListas(cargarCombosDependencia,sFinalQueryCombo);
				this.addItemDefectoCombosForeignKeyPais();
				this.cargarCombosFramePaissForeignKey(sFormularioTipoBusqueda);

				if(conInitActions) {
				}

			this.recargarComboTablaPais(this.paissForeignKey);

		} catch(Exception e) {
			throw e;
		}
	}
	
	public void jButtonNuevoTipoTributarioActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.FORM_RECARGAR;
			String sTipo="NUEVO_NORMAL";
			
			this.estaModoNuevo=true;
			
			if(this.tipotributarioSessionBean.getConGuardarRelaciones()) {
				this.dStart=(double)System.currentTimeMillis();
			}
				
			//if(this.esUsoDesdeHijo) {
			//	eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
			//}
											
			if(this.jInternalFrameDetalleFormTipoTributario==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}			
				
			TipoTributarioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.tipotributario,new Object(),this.tipotributarioParameterGeneral,this.tipotributarioReturnGeneral);
			
			
			if(jTableDatosTipoTributario.getRowCount()>=1) {
				jTableDatosTipoTributario.removeRowSelectionInterval(0, jTableDatosTipoTributario.getRowCount()-1);						
			}
			
			this.isEsNuevoTipoTributario=true;
			
			//ESTABLECE SI ES RELACIONADO O NO 
			this.habilitarDeshabilitarTipoMantenimientoTipoTributario(esRelaciones);
			
			this.nuevoPreparar(false); 
			this.habilitarDeshabilitarControlesTipoTributario(true);			
			//this.tipotributario=new TipoTributario();
			//this.tipotributario.setIsChanged(true);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesTipoTributario(false) ;						
			 
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualTipoTributario() ;
			
			if(TipoTributarioJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleTipoTributario(esRelaciones);
			}
					
			//Se Duplica, sin sentido
			//this.actualizarInformacion("EVENTO_NUEVO",false,this.tipotributario);	
			this.actualizarInformacion("INFO_PADRE",false,this.tipotributario);				
			
			TipoTributarioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.tipotributario,new Object(),this.tipotributarioParameterGeneral,this.tipotributarioReturnGeneral);
			
			if(this.tipotributarioSessionBean.getConGuardarRelaciones()) {
				this.dEnd=(double)System.currentTimeMillis();					
				this.dDif=this.dEnd - this.dStart;
					
				if(Constantes.ISDEVELOPING) {
					System.out.println("Tiempo(ms) Nuevo Preparar TipoTributario: " + this.dDif); 
				}
			}
			
			//false para que pueda generar eventos
			this.estaModoNuevo=false;
							
			//Con this.estaModoNuevo=false;, se permite actualizar y usar eventos control al mismo tiempo (FuncionTipo.LAST)			
			TipoTributarioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.LAST,ControlTipo.FORM,EventoTipo.CLIC,EventoSubTipo.NEW,sTipo,this.tipotributario,new Object(),this.tipotributarioParameterGeneral,this.tipotributarioReturnGeneral);
			
		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,TipoTributarioConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;			
		}
	}
	
	public void jButtonDuplicarTipoTributarioActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			Boolean soloDuplicarUno=false;
			Boolean conSeleccionarFilaTabla=false;
			
			this.estaModoNuevo=true;
			this.estaModoDuplicar=true;
			
			ArrayList<TipoTributario> tipotributariosSeleccionados=new ArrayList<TipoTributario>();
			int intSelectedRow =-1;
			Integer iNumRowsSeleccionados=0;
			int[] arrNumRowsSeleccionados=null;
			
			//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
			if(conSeleccionarFilaTabla) {
				arrNumRowsSeleccionados=this.jTableDatosTipoTributario.getSelectedRows();
				iNumRowsSeleccionados=this.jTableDatosTipoTributario.getSelectedRows().length;			
			}
			
			tipotributariosSeleccionados=this.getTipoTributariosSeleccionados(false);
				
			if((soloDuplicarUno && iNumRowsSeleccionados.equals(1)) || !soloDuplicarUno) {
				//LO HACE NUEVOPREPARAR
				//this.iIdNuevoTipoTributario--;			
				//TipoTributario tipotributarioAux= new TipoTributario();			
				//tipotributarioAux.setId(this.iIdNuevoTipoTributario);																
				
				//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
				//TipoTributario tipotributarioOrigen=new TipoTributario();
				//for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {				
				
				for(TipoTributario tipotributarioOrigen : tipotributariosSeleccionados) {
					if(conSeleccionarFilaTabla) {
						if(!soloDuplicarUno) {
							//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
							//intSelectedRow =iNumRowSeleccionado;
						} else {
							intSelectedRow = this.jTableDatosTipoTributario.getSelectedRow();
						}
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							tipotributarioOrigen =(TipoTributario) this.tipotributarioLogic.getTipoTributarios().toArray()[this.jTableDatosTipoTributario.convertRowIndexToModel(intSelectedRow)];
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							tipotributarioOrigen =(TipoTributario) this.tipotributarios.toArray()[this.jTableDatosTipoTributario.convertRowIndexToModel(intSelectedRow)];
						}
					}
					
					this.aumentarTamanioFilaNuevaTablaTipoTributario();
					
					if(this.conTotales) {
						this.quitarFilaTotales();
					}
					
					this.nuevoPreparar(true);
					
					this.tipotributario.setsType("DUPLICADO");
					
					this.setCopiarVariablesObjetosTipoTributario(tipotributarioOrigen,this.tipotributario,true,true);
					
					this.setVariablesFormularioToObjetoActualForeignKeysTipoTributario(this.tipotributario);
					
					//LO HACE NUEVOPREPARAR
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.tipotributarioLogic.getTipoTributarios().add(this.tipotributarioAux);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.tipotributarios.add(this.tipotributarioAux);				
					}
					*/
				}
				
				this.inicializarActualizarBindingTablaTipoTributario(false);
				
				this.jTableDatosTipoTributario.setRowSelectionInterval(this.getIndiceNuevoTipoTributario(), this.getIndiceNuevoTipoTributario());
				
				int iLastRow =  this.jTableDatosTipoTributario.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosTipoTributario.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosTipoTributario.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaTipoTributario(false);
				}
			} else {
				throw new Exception("DEBE ESTAR SELECCIONADO 1 REGISTRO");
			}
			
		} catch(Exception e) {			
			FuncionesSwing.manageException(this, e,logger,TipoTributarioConstantesFunciones.CLASSNAME);
		
		} finally {
			this.estaModoNuevo=false;
			this.estaModoDuplicar=false;
		}
	}
	
	public void jButtonCopiarTipoTributarioActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			Boolean conSeleccionarFilaTabla=false;
			Integer iNumRowsSeleccionados=0;
			int[] intSelectedRows =null;
			int intSelectedRow =0;
			
			this.estaModoCopiar=true;
			
			ArrayList<TipoTributario> tipotributariosSeleccionados=new ArrayList<TipoTributario>();									
		
			TipoTributario tipotributarioOrigen=new TipoTributario();
			TipoTributario tipotributarioDestino=new TipoTributario();
				
			tipotributariosSeleccionados=this.getTipoTributariosSeleccionados(false);
			
			if(conSeleccionarFilaTabla) {
				iNumRowsSeleccionados=this.jTableDatosTipoTributario.getSelectedRows().length;	
			}
			
			if(iNumRowsSeleccionados.equals(2) || tipotributariosSeleccionados.size()==2) {
				if(conSeleccionarFilaTabla) {
					intSelectedRows =this.jTableDatosTipoTributario.getSelectedRows();
					intSelectedRow = intSelectedRows[0];	
									
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						tipotributarioOrigen =(TipoTributario) this.tipotributarioLogic.getTipoTributarios().toArray()[this.jTableDatosTipoTributario.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						tipotributarioOrigen =(TipoTributario) this.tipotributarios.toArray()[this.jTableDatosTipoTributario.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					intSelectedRow = intSelectedRows[1];
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						tipotributarioDestino =(TipoTributario) this.tipotributarioLogic.getTipoTributarios().toArray()[this.jTableDatosTipoTributario.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						tipotributarioDestino =(TipoTributario) this.tipotributarios.toArray()[this.jTableDatosTipoTributario.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				}
				
				tipotributarioOrigen =tipotributariosSeleccionados.get(0);
				tipotributarioDestino =tipotributariosSeleccionados.get(1);
				
				this.setCopiarVariablesObjetosTipoTributario(tipotributarioOrigen,tipotributarioDestino,true,false);
				
				tipotributarioDestino.setsType("DUPLICADO");
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(tipotributarioDestino,tipotributarioLogic.getTipoTributarios());					
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(tipotributarioDestino,tipotributarios);
				}
				//ARCHITECTURE
				
				this.inicializarActualizarBindingTablaTipoTributario(false);
				
				//this.jTableDatosTipoTributario.setRowSelectionInterval(this.getIndiceNuevoTipoTributario(), this.getIndiceNuevoTipoTributario());
				
				int iLastRow =  this.jTableDatosTipoTributario.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosTipoTributario.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosTipoTributario.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					//this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaTipoTributario(false);
				}
			} else {
				throw new Exception("DEBEN ESTAR SELECCIONADOS 2 REGISTROS");
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoTributarioConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.estaModoCopiar=false;
		}
	}
	
	public void jButtonVerFormTipoTributarioActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormTipoTributario==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.jInternalFrameDetalleFormTipoTributario.setSelected(true);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoTributarioConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonMostrarOcultarTipoTributarioActionPerformed(ActionEvent evt) throws Exception {   
		try {
			Boolean isVisible=this.jPanelParametrosReportesTipoTributario.isVisible();
			
			//BYDAN_BUSQUEDAS
			
			this.jTabbedPaneBusquedasTipoTributario.setVisible(!isVisible);			
			
			
			this.jPanelParametrosReportesTipoTributario.setVisible(!isVisible);
			this.jPanelPaginacionTipoTributario.setVisible(!isVisible);
			this.jPanelAccionesTipoTributario.setVisible(!isVisible);
							
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoTributarioConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarTipoTributarioActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.closingInternalFrameTipoTributario();
			
			//if(this.jInternalFrameParent==null) {
				//this.dispose();
			/*} else {
				this.setVisible(false);
	        	this.setSelected(false);	
			}*/			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoTributarioConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarReporteDinamicoTipoTributarioActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameReporteDinamicoTipoTributario();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoTributarioConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarImportacionTipoTributarioActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameImportacionTipoTributario();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoTributarioConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonAbrirOrderByTipoTributarioActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			
			this.abrirInicializarFrameOrderByTipoTributario();
			
			this.abrirFrameOrderByTipoTributario();
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoTributarioConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarOrderByTipoTributarioActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameOrderByTipoTributario();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoTributarioConstantesFunciones.CLASSNAME);
		}
	}
	
	public void abrirFrameDetalleTipoTributario(Boolean esRelaciones) throws Exception {	    	        
	    try {
			//CAUSA PROBLEMAS, SE ADICIONA EN CONSTRUCTOR, LUEGO SOLO VISIBLE true y false
			//this.jDesktopPane.add(jInternalFrameDetalleFormTipoTributario);
			
			if(!esRelaciones) {
				if(this.jInternalFrameDetalleFormTipoTributario.isMaximum()) {
					this.jInternalFrameDetalleFormTipoTributario.setMaximum(false);
				}								
				
	    		this.jInternalFrameDetalleFormTipoTributario.setSize(this.jInternalFrameDetalleFormTipoTributario.iWidthFormulario,this.jInternalFrameDetalleFormTipoTributario.iHeightFormulario);
	    	} else {
				if(this.iWidthScroll<this.jInternalFrameDetalleFormTipoTributario.iWidthFormularioMaximo) {
	    			this.jInternalFrameDetalleFormTipoTributario.setSize(this.iWidthScroll,this.iHeightScroll);
				} else {
					if(!this.jInternalFrameDetalleFormTipoTributario.isMaximum()) {
						this.jInternalFrameDetalleFormTipoTributario.setMaximum(true);
					}
				}
				
				if(this.jInternalFrameDetalleFormTipoTributario.jContentPaneDetalleTipoTributario.getWidth() > this.getWidth()) {
					this.jInternalFrameDetalleFormTipoTributario.jTabbedPaneRelacionesTipoTributario.setMinimumSize(new Dimension(this.jInternalFrameDetalleFormTipoTributario.jContentPaneDetalleTipoTributario.getWidth(),TipoTributarioConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormTipoTributario.jTabbedPaneRelacionesTipoTributario.setMaximumSize(new Dimension(this.jInternalFrameDetalleFormTipoTributario.jContentPaneDetalleTipoTributario.getWidth(),TipoTributarioConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormTipoTributario.jTabbedPaneRelacionesTipoTributario.setPreferredSize(new Dimension(this.jInternalFrameDetalleFormTipoTributario.jContentPaneDetalleTipoTributario.getWidth(),TipoTributarioConstantesFunciones.ALTO_TABPANE_RELACIONES));
					
					Dimension dimension=new Dimension(); 
					
					

					if(DefinicionJInternalFrame.ESTA_CARGADO_PORPARTE) {
						this.redimensionarTablaPanelRelacionadaDefinicion();
					}

					if(FacturaProveedorServicioJInternalFrame.ESTA_CARGADO_PORPARTE) {
						this.redimensionarTablaPanelRelacionadaFacturaProveedorServicio();
					}

					if(TransaccionLocalJInternalFrame.ESTA_CARGADO_PORPARTE) {
						this.redimensionarTablaPanelRelacionadaTransaccionLocal();
					}
					
				}
	    	}
			
		
	       	this.jInternalFrameDetalleFormTipoTributario.setVisible(true);
	        this.jInternalFrameDetalleFormTipoTributario.setSelected(true);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoTributarioConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirInicializarFrameOrderByTipoTributario() throws Exception {	    	        
	    try {
			if(this.jInternalFrameOrderByTipoTributario==null) {
				
				if(!this.conCargarMinimo) {
					this.jInternalFrameOrderByTipoTributario=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByTipoTributario,false,this);
				} else {
					this.jInternalFrameOrderByTipoTributario=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByTipoTributario,true,this);
				}
				
				this.jDesktopPane.add(this.jInternalFrameOrderByTipoTributario);
				this.jInternalFrameOrderByTipoTributario.setVisible(false);
				this.jInternalFrameOrderByTipoTributario.setSelected(false);
				
				this.jInternalFrameOrderByTipoTributario.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByTipoTributario"));
				
				this.inicializarActualizarBindingTablaOrderByTipoTributario();
			}
		} catch (final Exception e) {
			
		}
	}
	
	
	
	public void abrirInicializarFrameImportacionTipoTributario() throws Exception {	    	        
	    try {
			if(this.jInternalFrameImportacionTipoTributario==null) {
				
				this.jInternalFrameImportacionTipoTributario=new ImportacionJInternalFrame(TipoTributarioConstantesFunciones.SCLASSWEBTITULO,this);			
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionTipoTributario);							
				
				this.jDesktopPane.add(this.jInternalFrameImportacionTipoTributario);
				this.jInternalFrameImportacionTipoTributario.setVisible(false);
				this.jInternalFrameImportacionTipoTributario.setSelected(false);


				this.jInternalFrameImportacionTipoTributario.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionTipoTributario"));
				this.jInternalFrameImportacionTipoTributario.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionTipoTributario"));
				this.jInternalFrameImportacionTipoTributario.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionTipoTributario"));


			}
		} catch (final Exception e) {
			
		}
	}		
	
	
	
	public void abrirInicializarFrameReporteDinamicoTipoTributario() throws Exception {	    	        
	    try {
			
			if(this.jInternalFrameReporteDinamicoTipoTributario==null) {
				this.jInternalFrameReporteDinamicoTipoTributario=new ReporteDinamicoJInternalFrame(TipoTributarioConstantesFunciones.SCLASSWEBTITULO,this);	
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoTipoTributario);	
	
	
				this.jDesktopPane.add(this.jInternalFrameReporteDinamicoTipoTributario);
				this.jInternalFrameReporteDinamicoTipoTributario.setVisible(false);
				this.jInternalFrameReporteDinamicoTipoTributario.setSelected(false);
	
	
	
				this.jInternalFrameReporteDinamicoTipoTributario.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoTipoTributario"));
				this.jInternalFrameReporteDinamicoTipoTributario.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoTipoTributario"));
				this.jInternalFrameReporteDinamicoTipoTributario.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoTipoTributario"));
	
				this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualTipoTributario();
			}

		} catch (final Exception e) {
			
		}
	}	
	
	
	
		

	public void redimensionarTablaPanelRelacionadaDefinicion() {
		Dimension dimension=new Dimension();

		dimension=this.jInternalFrameDetalleFormTipoTributario.definicionBeanSwingJInternalFrame.jScrollPanelDatosDefinicion.getPreferredSize();
		dimension.setSize(this.jInternalFrameDetalleFormTipoTributario.jContentPaneDetalleTipoTributario.getWidth(),dimension.getHeight());

		this.jInternalFrameDetalleFormTipoTributario.definicionBeanSwingJInternalFrame.jScrollPanelDatosDefinicion.setMinimumSize(dimension);
		this.jInternalFrameDetalleFormTipoTributario.definicionBeanSwingJInternalFrame.jScrollPanelDatosDefinicion.setMaximumSize(dimension);
		this.jInternalFrameDetalleFormTipoTributario.definicionBeanSwingJInternalFrame.jScrollPanelDatosDefinicion.setPreferredSize(dimension);


	}

	public void redimensionarTablaPanelRelacionadaFacturaProveedorServicio() {
		Dimension dimension=new Dimension();

		dimension=this.jInternalFrameDetalleFormTipoTributario.facturaproveedorservicioBeanSwingJInternalFrame.jScrollPanelDatosFacturaProveedorServicio.getPreferredSize();
		dimension.setSize(this.jInternalFrameDetalleFormTipoTributario.jContentPaneDetalleTipoTributario.getWidth(),dimension.getHeight());

		this.jInternalFrameDetalleFormTipoTributario.facturaproveedorservicioBeanSwingJInternalFrame.jScrollPanelDatosFacturaProveedorServicio.setMinimumSize(dimension);
		this.jInternalFrameDetalleFormTipoTributario.facturaproveedorservicioBeanSwingJInternalFrame.jScrollPanelDatosFacturaProveedorServicio.setMaximumSize(dimension);
		this.jInternalFrameDetalleFormTipoTributario.facturaproveedorservicioBeanSwingJInternalFrame.jScrollPanelDatosFacturaProveedorServicio.setPreferredSize(dimension);


	}

	public void redimensionarTablaPanelRelacionadaTransaccionLocal() {
		Dimension dimension=new Dimension();

		dimension=this.jInternalFrameDetalleFormTipoTributario.transaccionlocalBeanSwingJInternalFrame.jScrollPanelDatosTransaccionLocal.getPreferredSize();
		dimension.setSize(this.jInternalFrameDetalleFormTipoTributario.jContentPaneDetalleTipoTributario.getWidth(),dimension.getHeight());

		this.jInternalFrameDetalleFormTipoTributario.transaccionlocalBeanSwingJInternalFrame.jScrollPanelDatosTransaccionLocal.setMinimumSize(dimension);
		this.jInternalFrameDetalleFormTipoTributario.transaccionlocalBeanSwingJInternalFrame.jScrollPanelDatosTransaccionLocal.setMaximumSize(dimension);
		this.jInternalFrameDetalleFormTipoTributario.transaccionlocalBeanSwingJInternalFrame.jScrollPanelDatosTransaccionLocal.setPreferredSize(dimension);


	}
					
	public void cerrarFrameDetalleTipoTributario() throws Exception {	    	        
	    try {
			//this.jDesktopPane.add(jInternalFrameDetalleFormTipoTributario);
			
	       	this.jInternalFrameDetalleFormTipoTributario.setVisible(false);
	        this.jInternalFrameDetalleFormTipoTributario.setSelected(false);
			
			//this.jInternalFrameDetalleFormTipoTributario.dispose();
			//this.jInternalFrameDetalleFormTipoTributario=null;
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoTributarioConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirFrameReporteDinamicoTipoTributario() throws Exception {	    	        
	    try {
			
			this.jInternalFrameReporteDinamicoTipoTributario.setVisible(true);
	        this.jInternalFrameReporteDinamicoTipoTributario.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoTributarioConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void abrirFrameImportacionTipoTributario() throws Exception {	    	        		
	    try {			
			this.jInternalFrameImportacionTipoTributario.setVisible(true);
	        this.jInternalFrameImportacionTipoTributario.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoTributarioConstantesFunciones.CLASSNAME);
	    }		
	}	
	
	
	
	
	
	public void abrirFrameOrderByTipoTributario() throws Exception {	    	        		
	    try {
			this.jInternalFrameOrderByTipoTributario.setVisible(true);
	        this.jInternalFrameOrderByTipoTributario.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoTributarioConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameOrderByTipoTributario() throws Exception {	    	        		
	    try {			
			this.jInternalFrameOrderByTipoTributario.setVisible(false);
	        this.jInternalFrameOrderByTipoTributario.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoTributarioConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameReporteDinamicoTipoTributario() throws Exception {			
	    try {
			this.jInternalFrameReporteDinamicoTipoTributario.setVisible(false);
	        this.jInternalFrameReporteDinamicoTipoTributario.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoTributarioConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameImportacionTipoTributario() throws Exception {	    	        		
	    try {
			this.jInternalFrameImportacionTipoTributario.setVisible(false);
	        this.jInternalFrameImportacionTipoTributario.setSelected(false);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoTributarioConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	
	public void jButtonModificarTipoTributarioActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.modificarTipoTributario(evt,-1,false);
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoTributarioConstantesFunciones.CLASSNAME);
		}
	}
	
	public void modificarTipoTributario(ActionEvent evt,int rowIndex,Boolean esRelaciones) throws Exception {   
		try {
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosTipoTributario.getSelectedRow();
			}
			
			this.habilitarDeshabilitarControlesTipoTributario(true);
			//this.isEsNuevoTipoTributario=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipotributario =(TipoTributario) this.tipotributarioLogic.getTipoTributarios().toArray()[this.jTableDatosTipoTributario.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.tipotributario =(TipoTributario) this.tipotributarios.toArray()[this.jTableDatosTipoTributario.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.actualizarEstadoCeldasBotonesTipoTributario("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesTipoTributario(false) ;
			
			if(tipotributarioSessionBean.getConGuardarRelaciones()) {
			

				if(this.jInternalFrameDetalleFormTipoTributario.transaccionlocalBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoTributario.transaccionlocalBeanSwingJInternalFrame.transaccionlocalSessionBean.getEsGuardarRelacionado() && TransaccionLocalJInternalFrame.ESTA_CARGADO_PORPARTE) {
					this.jButtonTransaccionLocalActionPerformed(null,intSelectedRow,false,true,null);
				}

				if(this.jInternalFrameDetalleFormTipoTributario.facturaproveedorservicioBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoTributario.facturaproveedorservicioBeanSwingJInternalFrame.facturaproveedorservicioSessionBean.getEsGuardarRelacionado() && FacturaProveedorServicioJInternalFrame.ESTA_CARGADO_PORPARTE) {
					this.jButtonFacturaProveedorServicioActionPerformed(null,intSelectedRow,false,true,null);
				}

				if(this.jInternalFrameDetalleFormTipoTributario.definicionBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoTributario.definicionBeanSwingJInternalFrame.definicionSessionBean.getEsGuardarRelacionado() && DefinicionJInternalFrame.ESTA_CARGADO_PORPARTE) {
					this.jButtonDefinicionActionPerformed(null,intSelectedRow,false,true,null);
				}
			}
			
			if(TipoTributarioJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleTipoTributario(esRelaciones);
			}
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualTipoTributario(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoTributarioConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarFilaTablaTipoTributarioActual() { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL
			Integer intSelectedRow = this.jTableDatosTipoTributario.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipotributario =(TipoTributario) this.tipotributarioLogic.getTipoTributarios().toArray()[this.jTableDatosTipoTributario.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipotributario =(TipoTributario) this.tipotributarios.toArray()[this.jTableDatosTipoTributario.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoTributarioConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void seleccionarTipoTributario(ActionEvent evt,int rowIndex) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormTipoTributario==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosTipoTributario.getSelectedRow();
			}
			
			//this.habilitarDeshabilitarControlesTipoTributario(true);
			//this.isEsNuevoTipoTributario=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipotributario =(TipoTributario) this.tipotributarioLogic.getTipoTributarios().toArray()[this.jTableDatosTipoTributario.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.tipotributario =(TipoTributario) this.tipotributarios.toArray()[this.jTableDatosTipoTributario.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.jInternalFrameParent.setIdCombosCodigoDesdeBusquedaForeignKey(this.tipotributario.getId(),this.sTipoBusqueda);
			
			this.dispose();
			
			//this.actualizarEstadoCeldasBotonesTipoTributario("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			/*
			this.inicializarActualizarBindingBotonesTipoTributario(false) ;
			
			if(TipoTributarioJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleTipoTributario(esRelaciones);
			}
			*/
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualTipoTributario(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoTributarioConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void setIdCombosCodigoDesdeBusquedaForeignKey(Long id,String sType)throws Exception{
		
		try {
		} catch(Exception e) {
			throw e;
		}
	}
	
	
	
	public void recargarComboTablaPais(List<Pais> paissForeignKey)throws Exception{
		TableColumn tableColumnPais=this.jTableDatosTipoTributario.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTipoTributario,TipoTributarioConstantesFunciones.LABEL_IDPAIS));
		TableCellEditor tableCellEditorPais =tableColumnPais.getCellEditor();

		PaisTableCell paisTableCellFk=(PaisTableCell)tableCellEditorPais;

		if(paisTableCellFk!=null) {
			paisTableCellFk.setpaissForeignKey(paissForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosTipoTributario.getSelectedRow();

		//if(intSelectedRow<=0) {
			//paisTableCellFk.setRowActual(intSelectedRow);
			//paisTableCellFk.setpaissForeignKeyActual(paissForeignKey);
		//}


		if(paisTableCellFk!=null) {
			paisTableCellFk.RecargarPaissForeignKey();
			//ACTUALIZA COMBOS DE TABLA-FIN
		}

	}	
	
	
	
	public void jButtonActualizarTipoTributarioActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipotributarioLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingParametrosReportesTipoTributario(false);
			
			//if(!this.isEsNuevoTipoTributario) {								
				int intSelectedRow = this.jTableDatosTipoTributario.getSelectedRow();	
				
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipotributario =(TipoTributario) this.tipotributarioLogic.getTipoTributarios().toArray()[this.jTableDatosTipoTributario.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.tipotributario =(TipoTributario) this.tipotributarios.toArray()[this.jTableDatosTipoTributario.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
			//}
				
			if(TipoTributarioJInternalFrame.ISBINDING_MANUAL_TABLA) {
				this.setVariablesFormularioToObjetoActualTipoTributario(this.tipotributario,true);
				this.setVariablesFormularioToObjetoActualForeignKeysTipoTributario(this.tipotributario);
				
			}
			
			if(this.permiteMantenimiento(this.tipotributario)) {	
				this.actualizar();
				
				if(!this.isGuardarCambiosEnLote && !this.tipotributarioSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
					
					this.isEsNuevoTipoTributario=true;
					this.inicializarActualizarBindingTablaTipoTributario(false);
					this.isEsNuevoTipoTributario=false;
				
				} else {					
					
					//PARA RELACIONADO ACTUALIZAR FILA TOTALES
					this.isEsNuevoTipoTributario=true;
					this.procesoActualizarFilaTotales(false,"MANTENIMIENTO");
					this.isEsNuevoTipoTributario=false;
				}
						
								
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesTipoTributario(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualTipoTributario(false);
				
				this.habilitarDeshabilitarControlesTipoTributario(false);
			
												
				
				if(TipoTributarioJInternalFrame.CON_DATOS_FRAME) {
					if(!this.isPostAccionSinCerrar) {
						this.cerrarFrameDetalleTipoTributario();
					}
				}
				
				if(this.isPostAccionNuevo) {
					this.jButtonNuevoTipoTributarioActionPerformed(evt,tipotributarioSessionBean.getConGuardarRelaciones());
				} else {
					if(this.isPostAccionSinCerrar) {
						Integer intSelectedRowActual=this.getIndiceActualTipoTributario(this.tipotributario,intSelectedRow);
						
						if(intSelectedRow>-1) {
							this.jTableDatosTipoTributario.setRowSelectionInterval(intSelectedRowActual, intSelectedRowActual);
							this.jButtonIdActionPerformed(evt,intSelectedRowActual,tipotributarioSessionBean.getConGuardarRelaciones(),false);
						}
					}
				}
				
				this.cancelar(false);
				
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipotributarioLogic.commitNewConnexionToDeep();
			}
			
			
			if(this.jInternalFrameParent!=null) { //&& this.isEsMantenimientoRelacionado) {
				Boolean esUsoDesdeHijoLocal=true;
				String sTipo="Formulario";
				Boolean conIrServidorAplicacionParent=false;
				Long id=this.tipotributario.getId();
				ArrayList<String> arrClasses=new ArrayList<String>();
				
				GeneralEntityParameterGeneral generalEntityParameterGeneral=new GeneralEntityParameterGeneral();
				
				generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
				generalEntityParameterGeneral.setsDominio("Formulario");
				generalEntityParameterGeneral.setsDominioTipo(TipoTributario.class.getName());
				
				this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoTributario.class.getName(),sTipo,"FORMULARIO",esControlTabla,conIrServidorAplicacionParent,
					id,this, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.FORM,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
					evt,generalEntityParameterGeneral,this);
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipotributarioLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,TipoTributarioConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipotributarioLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonEliminarTipoTributarioActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipotributarioLogic.getNewConnexionToDeep("");
			}
			
			int intSelectedRow = this.jTableDatosTipoTributario.getSelectedRow();	       
							
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipotributario =(TipoTributario) this.tipotributarioLogic.getTipoTributarios().toArray()[this.jTableDatosTipoTributario.convertRowIndexToModel(intSelectedRow)];
				this.tipotributario.setIsDeleted(true);
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.tipotributario =(TipoTributario) this.tipotributarios.toArray()[this.jTableDatosTipoTributario.convertRowIndexToModel(intSelectedRow)];
				this.tipotributario.setIsDeleted(true);
			}
			//ARCHITECTURE
			
			if(this.permiteMantenimiento(this.tipotributario)) {
				this.eliminar();
				
				if(!this.isGuardarCambiosEnLote && !this.tipotributarioSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
				}
				
				((TipoTributarioModel) this.jTableDatosTipoTributario.getModel()).fireTableRowsDeleted(intSelectedRow,intSelectedRow);
				
				this.isEsNuevoTipoTributario=true;
				this.inicializarActualizarBindingTablaTipoTributario(false);
				this.isEsNuevoTipoTributario=false;									
					
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesTipoTributario(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualTipoTributario(false);
				
				this.habilitarDeshabilitarControlesTipoTributario(false);
				
				
				
				if(TipoTributarioJInternalFrame.CON_DATOS_FRAME) {
					this.cerrarFrameDetalleTipoTributario();
				}
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipotributarioLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipotributarioLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,TipoTributarioConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipotributarioLogic.closeNewConnexionToDeep();
			}
		}		
	}
		
	public void jButtonCancelarTipoTributarioActionPerformed(ActionEvent evt) throws Exception {                                         	   	       
	  	try {
			if(jTableDatosTipoTributario.getRowCount()>=1) {
				jTableDatosTipoTributario.removeRowSelectionInterval(0, jTableDatosTipoTributario.getRowCount()-1);						
			}
						
			this.invalidValues=new InvalidValue[0];
			this.habilitarDeshabilitarControlesTipoTributario(false);
			this.cancelar(true);			
			this.inicializarActualizarBindingTablaTipoTributario(false);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesTipoTributario(false) ;
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualTipoTributario(false) ;
			
			this.isEsNuevoTipoTributario=false;
			
			if(TipoTributarioJInternalFrame.CON_DATOS_FRAME) {
				this.cerrarFrameDetalleTipoTributario();
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoTributarioConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonGuardarCambiosTipoTributarioActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipotributarioLogic.getNewConnexionToDeep("");
			}
			
			//this.estaModoGuardarCambios=true;
			
	    	this.guardarCambios();
			
			if(!this.isErrorGuardar) {
				this.procesarBusqueda(this.sAccionBusqueda);
				
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingTipoTributario(false);
				
				//SI ES MANUAL
				if(TipoTributarioJInternalFrame.ISBINDING_MANUAL) {				
					//this.inicializarActualizarBindingManualTipoTributario();				
				}
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipotributarioLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipotributarioLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,TipoTributarioConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipotributarioLogic.closeNewConnexionToDeep();
			}
			
			//this.estaModoGuardarCambios=false;
		}
	}
	
	public void jButtonNuevoGuardarCambiosTipoTributarioActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			this.estaModoNuevo=true;
			this.estaModoNuevoGuardarCambios=true;
			
			//LO HACE NUEVOPREPARAR
			//this.iIdNuevoTipoTributario--;			
			//TipoTributario tipotributarioAux= new TipoTributario();			
			//tipotributarioAux.setId(this.iIdNuevoTipoTributario);
			
			if(this.jInternalFrameDetalleFormTipoTributario==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.aumentarTamanioFilaNuevaTablaTipoTributario();
			
			if(this.conTotales) {
				this.quitarFilaTotales();
			}
			
			this.nuevoPreparar(true);
			
			this.setVariablesFormularioToObjetoActualForeignKeysTipoTributario(this.tipotributario);
			
			this.tipotributario.setsType("NUEVO_GUARDAR_CAMBIOS");
			
			//LO HACE NUEVOPREPARAR
			/*
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				this.tipotributarioLogic.getTipoTributarios().add(this.tipotributarioAux);
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				this.tipotributarios.add(this.tipotributarioAux);				
			}
			*/
			
			this.inicializarActualizarBindingTablaTipoTributario(false);
			
			this.jTableDatosTipoTributario.setRowSelectionInterval(this.getIndiceNuevoTipoTributario(), this.getIndiceNuevoTipoTributario());
			
			int iLastRow =  this.jTableDatosTipoTributario.getRowCount () - 1;
			Rectangle rectangle = this.jTableDatosTipoTributario.getCellRect(iLastRow, 0, true);
			
			this.jTableDatosTipoTributario.scrollRectToVisible(rectangle);
			
			//FILA TOTALES
			if(this.conTotales) {
				this.crearFilaTotales();
				
				this.inicializarActualizarBindingTablaTipoTributario(false);
			}

		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,TipoTributarioConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;
			this.estaModoNuevoGuardarCambios=false;
		}
	}		
	
	public void jButtonRecargarInformacionTipoTributarioActionPerformed(ActionEvent evt) throws Exception {    		
		try {
			this.iNumeroPaginacionPagina=0;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipotributarioLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingTipoTributario(false,false);
			
	    	this.recargarInformacion();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingTipoTributario(false);
			
			//SI ES MANUAL
			if(TipoTributarioJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualTipoTributario();
			}
			
			//this.abrirFrameTreeTipoTributario();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipotributarioLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipotributarioLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,TipoTributarioConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipotributarioLogic.closeNewConnexionToDeep();
			}
		}	
	}
	
	
	public void jButtonGenerarImportacionTipoTributarioActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedReader bufferedReader = null;
		String sXmlStringFile="";
		String sPath="";
		this.arrDatoGeneralMinimos= new  ArrayList<DatoGeneralMinimo>();
		DatoGeneralMinimo datoGeneralMinimo=new DatoGeneralMinimo();
		String sLine="";
		
		try {			
			if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR IMPORTACION DE Tipo TributarioS ?", "MANTENIMIENTO DE Tipo Tributario", JOptionPane.OK_CANCEL_OPTION) == 0) {
				bufferedReader = new BufferedReader(new FileReader(this.jInternalFrameImportacionTipoTributario.getFileImportacion().getAbsolutePath()));
								
				while ((sLine = bufferedReader.readLine()) != null) {
					datoGeneralMinimo=new DatoGeneralMinimo();
					datoGeneralMinimo.setsDescripcion(sLine);
					
					this.arrDatoGeneralMinimos.add(datoGeneralMinimo);
				}
				
				this.actualizarParametrosGeneralTipoTributario();
						
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {						
					this.tipotributarioReturnGeneral=tipotributarioLogic.procesarImportacionTipoTributariosWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this.arrDatoGeneralMinimos,this.tipotributarioParameterGeneral);
						
				} else if(Constantes.ISUSAEJBREMOTE) {
						
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
						
				this.procesarTipoTributarioReturnGeneral();
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoTributarioConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedReader != null) {
				bufferedReader.close();
			}	
		}				
	}
	
	
	
	public void jButtonAbrirImportacionTipoTributarioActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {
			int iReturnArchivo = this.jInternalFrameImportacionTipoTributario.getjFileChooserImportacion().showOpenDialog(this);
 
            if (iReturnArchivo == JFileChooser.APPROVE_OPTION) {
            	this.jInternalFrameImportacionTipoTributario.setFileImportacion(this.jInternalFrameImportacionTipoTributario.getjFileChooserImportacion().getSelectedFile());
            	
				this.jInternalFrameImportacionTipoTributario.getjTextFieldPathArchivoImportacion().setText(this.jInternalFrameImportacionTipoTributario.getFileImportacion().getName());
				
				//System.out.println("ARCHIVO ESCOGIDO: "+this.fileImportacionTipoTributario.getName());
				
            } else {
                //System.out.println("CANCELAR SELECCION");
				this.jInternalFrameImportacionTipoTributario.getjTextFieldPathArchivoImportacion().setText("SELECCION CANCELADA");
            }			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoTributarioConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedWriter != null) {
				bufferedWriter.close();
			}	
		}		
	}
	
	
	public void jButtonGenerarReporteDinamicoTipoTributarioActionPerformed(ActionEvent evt) throws Exception {    		
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {	
		
		ArrayList<TipoTributario> tipotributariosSeleccionados=new ArrayList<TipoTributario>();		

		tipotributariosSeleccionados=this.getTipoTributariosSeleccionados(true);
		
		
		this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoTipoTributario.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();
		
		this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoTipoTributario.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
		
		
		this.sTipoArchivoReporte=this.sTipoArchivoReporteDinamico;
		
		//this.sTipoReporteExtra="Base";
		
			InputStream reportFile=null;
			InputStream imageFile=null;
			
			imageFile=AuxiliarImagenes.class.getResourceAsStream("LogoReporte.jpg");			
				
		
		
			reportFile = AuxiliarReportes.class.getResourceAsStream("TipoTributarioBaseDesign.jrxml");	
			
			sPath=this.parametroGeneralUsuario.getpath_exportar()+"TipoTributarioBaseDesign.jrxml";
			
			sXmlStringFile=Funciones2.getStringFromInputStream(reportFile);
						
			bufferedWriter = new BufferedWriter(new FileWriter(sPath));
			
			
			sXmlStringFile=this.actualizarReporteDinamico(sXmlStringFile);
			
			
			bufferedWriter.write(sXmlStringFile);
			
			bufferedWriter.close();
			
			try{JasperCompileManager.compileReportToFile(sPath);}catch(Exception e){e.printStackTrace();}
			
			this.actualizarVariablesTipoReporte(false,true,false,sPath);
			
			/*
			this.esReporteDinamico=true;
			this.sPathReporteDinamico=sPath.replace(".jrxml",".jasper");
			this.sTipoReporteExtra="";
			*/
			
			this.generarReporteTipoTributarios("Todos",tipotributariosSeleccionados );

			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipotributarioSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				//DEBE APARECER EL REPORTE DIRECTAMENTE
				//JOptionPane.showMessageDialog(this,"GENERADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Tributario",JOptionPane.INFORMATION_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoTributarioConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedWriter != null) {
				bufferedWriter.close();
			}	
		}
	}		
	
	
	public String actualizarReporteDinamico(String sXmlStringFile) {				
		Reporte reporte=new Reporte();
		Integer iAnchoMaximoVertical=535;//781,782
		Integer iAnchoMaximoHorizontal=782;
		Integer iAnchoSum=0;
		Integer iAnchoColumna=0;
		
		Integer iAnchoMargenes=60;
		String sWidthGrafico="535";
		
		for(int index:this.jInternalFrameReporteDinamicoTipoTributario.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoTipoTributario.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case TipoTributarioConstantesFunciones.LABEL_IDPAIS:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_Pais_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_Pais_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_Pais_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_Pais_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case TipoTributarioConstantesFunciones.LABEL_CODIGO:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_digo_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_digo_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_digo_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_digo_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case TipoTributarioConstantesFunciones.LABEL_NOMBRE:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_mbre_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_mbre_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_mbre_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_mbre_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;
					
				default :
					break;
			}
		}
		
		iAnchoSum+=iAnchoMargenes;
		
		if(iAnchoSum>iAnchoMaximoVertical) {
			sXmlStringFile=sXmlStringFile.replace("595", "842");
			//sXmlStringFile=sXmlStringFile.replace("842", "595");
			sXmlStringFile=sXmlStringFile.replace("535", "782");
			sXmlStringFile=sXmlStringFile.replace("Portrait", "Landscape");			
			sWidthGrafico="782";
		
		} else {
			sXmlStringFile=sXmlStringFile.replace("842", "595");
			//sXmlStringFile=sXmlStringFile.replace("595", "842");
			sXmlStringFile=sXmlStringFile.replace("782", "535");
			sXmlStringFile=sXmlStringFile.replace("Landscape", "Portrait");
			sWidthGrafico="535";
		}
		
		if(this.jInternalFrameReporteDinamicoTipoTributario.getjCheckBoxConGraficoDinamico().isSelected()) {
			sXmlStringFile=this.actualizarGraficoReporteDinamico(sXmlStringFile,sWidthGrafico);
		} else {
			sXmlStringFile=sXmlStringFile.replace("colancho_summary_colancho", "30");
		}
		
		return sXmlStringFile;
	}
	
	
	
	public String actualizarGraficoReporteDinamico(String sXmlStringFile,String sWidthGrafico) {		
		String strGrafico="";		
		String sTipo="NORMAL";
		String strCategorySeries="";
		String sNombreCampoCategoria="";
		String sNombreCampoCategoriaValor="";
		Reporte reporte=new Reporte();
		Reporte reporteCategoriaValor=new Reporte();
		Reporte reporteTipoGraficoReporte=new Reporte();
		Boolean existe=false;
		
		sXmlStringFile=sXmlStringFile.replace("colancho_summary_colancho", "280");
		
		//CATEGORIA GRAFICO				
		reporte=((Reporte)this.jInternalFrameReporteDinamicoTipoTributario.getjComboBoxColumnaCategoriaGrafico().getSelectedItem());
				
		//TIPO GRAFICO REPORTE
		reporteTipoGraficoReporte=((Reporte)this.jInternalFrameReporteDinamicoTipoTributario.getjComboBoxTiposGraficosReportesDinamico().getSelectedItem());
		
		String sTipoGraficoReporte=reporteTipoGraficoReporte.getsCodigo();
		
		switch(reporte.getsCodigo()) {
			
				case TipoTributarioConstantesFunciones.LABEL_IDPAIS:
					sNombreCampoCategoria="id_pais";
					break;

				case TipoTributarioConstantesFunciones.LABEL_CODIGO:
					sNombreCampoCategoria="codigo";
					break;

				case TipoTributarioConstantesFunciones.LABEL_NOMBRE:
					sNombreCampoCategoria="nombre";
					break;
					
			default :
				break;
		}		
		//CATEGORIA GRAFICO
		
		//CATEGORIA VALOR				
		reporteCategoriaValor=((Reporte)this.jInternalFrameReporteDinamicoTipoTributario.getjComboBoxColumnaCategoriaValor().getSelectedItem());
		
		switch(reporteCategoriaValor.getsCodigo()) {
			
				case TipoTributarioConstantesFunciones.LABEL_IDPAIS:
					sNombreCampoCategoriaValor="id_pais";
					break;

				case TipoTributarioConstantesFunciones.LABEL_CODIGO:
					sNombreCampoCategoriaValor="codigo";
					break;

				case TipoTributarioConstantesFunciones.LABEL_NOMBRE:
					sNombreCampoCategoriaValor="nombre";
					break;
					
			default :
				break;
		}	
		//CATEGORIA VALOR
		
		//VALORES GRAFICO
		for(int index:this.jInternalFrameReporteDinamicoTipoTributario.getjListColumnasValoresGrafico().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoTipoTributario.getjListColumnasValoresGrafico().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case TipoTributarioConstantesFunciones.LABEL_IDPAIS:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Pais",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_pais");
					break;

				case TipoTributarioConstantesFunciones.LABEL_CODIGO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Codigo",sNombreCampoCategoria,sNombreCampoCategoriaValor,"codigo");
					break;

				case TipoTributarioConstantesFunciones.LABEL_NOMBRE:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Nombre",sNombreCampoCategoria,sNombreCampoCategoriaValor,"nombre");
					break;
					
				default :
					break;
			}
		}
		//VALORES GRAFICO
		//if(sTipoGraficoReporte.equals("BARRAS") || sTipoGraficoReporte.equals("BARRAS_3D") || sTipoGraficoReporte.equals("BARRAS_XY") ||
		//   sTipoGraficoReporte.equals("PASTEL") || sTipoGraficoReporte.equals("PASTEL_3D") || sTipoGraficoReporte.equals("APILADO")) {
			
			existe=true;
			strGrafico=FuncionesReporte.getStringGraficoReporte(sTipoGraficoReporte,sWidthGrafico,strCategorySeries);			
		//}
		
		if(existe) {
			sXmlStringFile=sXmlStringFile.replace("<!--GRAFICO-->", strGrafico);
		}												
		
		return sXmlStringFile;
	}
	
	
	//@SuppressWarnings("deprecation")
	
	public void jButtonGenerarExcelReporteDinamicoTipoTributarioActionPerformed(ActionEvent evt) throws Exception {		
		ArrayList<TipoTributario> tipotributariosSeleccionados=new ArrayList<TipoTributario>();		
		
		tipotributariosSeleccionados=this.getTipoTributariosSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tipotributario";//.xls";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		Boolean existeFilas=false;
		
		Workbook workbook = null;
		FileOutputStream fileOutputStream=null;
		Reporte reporte=new Reporte();
		
		try {
			
			if(sTipoArchivoReporte=="EXCEL2") {
				workbook = new HSSFWorkbook();
				sPath+=".xls";
			
			} else if(sTipoArchivoReporte=="EXCEL2_2") {
				workbook = new XSSFWorkbook();
				sPath+=".xlsx";			
			}
		
			Sheet sheet = workbook.createSheet("TipoTributarios");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			Row row = sheet.createRow(iRow);
			Cell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");
			
			for(int index:this.jInternalFrameReporteDinamicoTipoTributario.getjListColumnasSelectReporte().getSelectedIndices()) {
				reporte=(Reporte)this.jInternalFrameReporteDinamicoTipoTributario.getjListColumnasSelectReporte().getModel().getElementAt(index);
				
				switch(reporte.getsCodigo()) {
					
				case TipoTributarioConstantesFunciones.LABEL_IDPAIS:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(TipoTributarioConstantesFunciones.LABEL_IDPAIS);
					iRow++;

					for(TipoTributario tipotributario:tipotributariosSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(tipotributario.getpais_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case TipoTributarioConstantesFunciones.LABEL_CODIGO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(TipoTributarioConstantesFunciones.LABEL_CODIGO);
					iRow++;

					for(TipoTributario tipotributario:tipotributariosSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(tipotributario.getcodigo());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case TipoTributarioConstantesFunciones.LABEL_NOMBRE:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(TipoTributarioConstantesFunciones.LABEL_NOMBRE);
					iRow++;

					for(TipoTributario tipotributario:tipotributariosSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(tipotributario.getnombre());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;
					
					default :
						break;
				}
			}
			
			
			//if(conCabecera) {
			//	this.getFilaCabeceraExportarExcelTipoTributario(row);				
			//	iRow++;
			//}				
			
			//for(TipoTributario tipotributarioAux:tipotributariosSeleccionados) {
			//	row = sheet.createRow(iRow);
				
			//	this.getFilaDatosExportarExcelTipoTributario(tipotributarioAux,row);
				
			//	iRow++;
			//}
			
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipotributarioSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Tributario",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			
       		if (fileOutputStream != null) {
				fileOutputStream.close();
			}			
		}				
	}	
	
	
	
	
	public void buscarPorId(Long idActual) throws Exception {    		
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipotributarioLogic.getNewConnexionToDeep("");
			}
			
			this.idActual=idActual;
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda("PorId");
				    	
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingTipoTributario(false);
			
			//SI ES MANUAL
			if(TipoTributarioJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualTipoTributario();
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipotributarioLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipotributarioLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger);
			
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipotributarioLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonAnterioresTipoTributarioActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion-=this.iNumeroPaginacion;
			/*
			if(this.iNumeroPaginacion<0) {
				this.iNumeroPaginacion=0;
			}
			*/
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipotributarioLogic.getNewConnexionToDeep("");
			}
			
			this.anteriores();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingTipoTributario(false);
			
			//SI ES MANUAL
			if(TipoTributarioJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualTipoTributario();
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipotributarioLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipotributarioLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,TipoTributarioConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipotributarioLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonSiguientesTipoTributarioActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion+=this.iNumeroPaginacion;
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipotributarioLogic.getNewConnexionToDeep("");
			}
			
			this.siguientes();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingTipoTributario(false);
			
			//SI ES MANUAL
			if(TipoTributarioJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualTipoTributario();
			}		
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipotributarioLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipotributarioLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,TipoTributarioConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipotributarioLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void aumentarTamanioFilaNuevaTablaTipoTributario() throws Exception {		
		Dimension dimensionMinimum=this.jTableDatosTipoTributario.getMinimumSize();
		Dimension dimensionMaximum=this.jTableDatosTipoTributario.getMaximumSize();
		Dimension dimensionPreferred=this.jTableDatosTipoTributario.getPreferredSize();
	
		double iHeightConFilaNueva=dimensionPreferred.getHeight();
		
		iHeightConFilaNueva+=this.jTableDatosTipoTributario.getRowHeight();
		
		dimensionMinimum.setSize(dimensionMinimum.getWidth(),iHeightConFilaNueva);
		dimensionMaximum.setSize(dimensionMaximum.getWidth(),iHeightConFilaNueva);
		dimensionPreferred.setSize(dimensionPreferred.getWidth(),iHeightConFilaNueva);
		
		this.jTableDatosTipoTributario.setMinimumSize(dimensionMinimum);
		this.jTableDatosTipoTributario.setMaximumSize(dimensionMaximum);
		this.jTableDatosTipoTributario.setPreferredSize(dimensionPreferred);	
	}
	
	public void inicializarActualizarBindingTipoTributario(Boolean esInicializar) throws Exception {
		this.inicializarActualizarBindingTipoTributario(esInicializar,true);
	}
	
	public void inicializarActualizarBindingTipoTributario(Boolean esInicializar,Boolean conTabla) throws Exception {		
		if(conTabla) {
			this.inicializarActualizarBindingTablaTipoTributario(esInicializar);
		}
		
		this.inicializarActualizarBindingBotonesTipoTributario(esInicializar);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.tipotributarioSessionBean.getEsGuardarRelacionado()) {
			try{this.inicializarActualizarBindingBusquedasTipoTributario(esInicializar);}catch(Exception e){e.printStackTrace();}
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesTipoTributario(esInicializar) ;
			
			this.inicializarActualizarBindingParametrosReportesTipoTributario(esInicializar) ;
		}
		
		if(esInicializar) {
			if( !TipoTributarioJInternalFrame.ISBINDING_MANUAL_TABLA ||
			   	!TipoTributarioJInternalFrame.ISBINDING_MANUAL) {
			   	
			}
		}
	}
	
	public void inicializarActualizarBindingManualTipoTributario() throws Exception {		
		//NO SE NECESITA HACER BINDING OTRA VEZ
		//this.inicializarActualizarBindingTablaTipoTributario();
		
		this.inicializarActualizarBindingBotonesManualTipoTributario(true);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.tipotributarioSessionBean.getEsGuardarRelacionado()) {
			
			this.inicializarActualizarBindingBusquedasManualTipoTributario();			
			
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesTipoTributario() ;
			
			this.inicializarActualizarBindingParametrosReportesPostAccionesManualTipoTributario(false) ;			
			
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesPostAccionesManualTipoTributario(Boolean esSetControles) throws Exception {
		try	{					
			if(!esSetControles) {
				this.isSeleccionarTodos=this.jCheckBoxSeleccionarTodosTipoTributario.isSelected();
				this.isSeleccionados=this.jCheckBoxSeleccionadosTipoTributario.isSelected();
				
				
				this.conGraficoReporte=this.jCheckBoxConGraficoReporteTipoTributario.isSelected();															
				
				
				if(this.jInternalFrameDetalleFormTipoTributario!=null) {
				this.isPostAccionNuevo=this.jInternalFrameDetalleFormTipoTributario.jCheckBoxPostAccionNuevoTipoTributario.isSelected();
				this.isPostAccionSinCerrar=this.jInternalFrameDetalleFormTipoTributario.jCheckBoxPostAccionSinCerrarTipoTributario.isSelected();
				this.isPostAccionSinMensaje=this.jInternalFrameDetalleFormTipoTributario.jCheckBoxPostAccionSinMensajeTipoTributario.isSelected();
				}
			
			} else {
				this.jCheckBoxSeleccionarTodosTipoTributario.setSelected(this.isSeleccionarTodos);
				this.jCheckBoxSeleccionadosTipoTributario.setSelected(this.isSeleccionados);
				
				
				this.jCheckBoxConGraficoReporteTipoTributario.setSelected(this.conGraficoReporte);				
				
				
				if(this.jInternalFrameDetalleFormTipoTributario!=null) {
				this.jInternalFrameDetalleFormTipoTributario.jCheckBoxPostAccionNuevoTipoTributario.setSelected(this.isPostAccionNuevo);
				this.jInternalFrameDetalleFormTipoTributario.jCheckBoxPostAccionSinCerrarTipoTributario.setSelected(this.isPostAccionSinCerrar);
				this.jInternalFrameDetalleFormTipoTributario.jCheckBoxPostAccionSinMensajeTipoTributario.setSelected(this.isPostAccionSinMensaje);
				}
			}
			
			
			if(this.jComboBoxTiposPaginacionTipoTributario.getSelectedItem()!=null) {
				this.sTipoPaginacion=((Reporte)this.jComboBoxTiposPaginacionTipoTributario.getSelectedItem()).getsCodigo();			
			}
			
			
			
			if(this.jInternalFrameDetalleFormTipoTributario!=null) {
			this.sTipoAccionFormulario=((Reporte)this.jInternalFrameDetalleFormTipoTributario.jComboBoxTiposAccionesFormularioTipoTributario.getSelectedItem()).getsCodigo();
			}
			
			
			
			if(!this.conCargarMinimo) {
				this.sTipoArchivoReporte=((Reporte)this.jComboBoxTiposArchivosReportesTipoTributario.getSelectedItem()).getsCodigo();			
				
				if(this.jInternalFrameReporteDinamicoTipoTributario!=null) {
					this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoTipoTributario.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
				}
				
				this.sTipoRelacion=((Reporte)this.jComboBoxTiposRelacionesTipoTributario.getSelectedItem()).getsCodigo();
									
				this.sTipoAccion=((Reporte)this.jComboBoxTiposAccionesTipoTributario.getSelectedItem()).getsCodigo();
													
				this.sTipoSeleccionar=((Reporte)this.jComboBoxTiposSeleccionarTipoTributario.getSelectedItem()).getsCodigo();
									
				this.sTipoReporte=((Reporte)this.jComboBoxTiposReportesTipoTributario.getSelectedItem()).getsCodigo();							
					
				if(this.jInternalFrameReporteDinamicoTipoTributario!=null) {
					this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoTipoTributario.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();							
				}
				
				this.sTipoGraficoReporte=((Reporte)this.jComboBoxTiposGraficosReportesTipoTributario.getSelectedItem()).getsCodigo();											
			}			
			
			this.sValorCampoGeneral=this.jTextFieldValorCampoGeneralTipoTributario.getText();						
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesTipoTributario(Boolean esInicializar) throws Exception {
		try	{	
			if(TipoTributarioJInternalFrame.ISBINDING_MANUAL) {
				this. inicializarActualizarBindingParametrosReportesPostAccionesManualTipoTributario(false);
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public void inicializarActualizarBindingtiposArchivosReportesAccionesTipoTributario() throws Exception {
		try	{
			if(TipoTributarioJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingtiposArchivosReportesAccionesManualTipoTributario();
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleTipoTributario() throws Exception {
		//TIPOS ACCIONES FORMULARIO	
		this.jInternalFrameDetalleFormTipoTributario.jComboBoxTiposAccionesFormularioTipoTributario.removeAllItems();
				
		for(Reporte reporte:this.tiposAccionesFormulario) {
			this.jInternalFrameDetalleFormTipoTributario.jComboBoxTiposAccionesFormularioTipoTributario.addItem(reporte);
		}
		
		//TIPOS ACCIONES FORMULARIO
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualTipoTributario() throws Exception {
		try	{
			
			//TIPOS ARCHIVOS REPORTES
			this.jComboBoxTiposArchivosReportesTipoTributario.removeAllItems();
				
			for(Reporte reporte:this.tiposArchivosReportes) {
				this.jComboBoxTiposArchivosReportesTipoTributario.addItem(reporte);
			}
			
			
				
			//TIPOS REPORTES
			this.jComboBoxTiposReportesTipoTributario.removeAllItems();
				
			for(Reporte reporte:this.tiposReportes) {
				this.jComboBoxTiposReportesTipoTributario.addItem(reporte);
			}
			
			
			//TIPOS GRAFICOS REPORTES
			this.jComboBoxTiposGraficosReportesTipoTributario.removeAllItems();
				
			for(Reporte reporte:this.tiposGraficosReportes) {
				this.jComboBoxTiposGraficosReportesTipoTributario.addItem(reporte);
			}
			
			
			//TIPOS PAGINACION
			this.jComboBoxTiposPaginacionTipoTributario.removeAllItems();
				
			for(Reporte reporte:this.tiposPaginacion) {
				this.jComboBoxTiposPaginacionTipoTributario.addItem(reporte);
			}
			
			
			if(!this.tipotributarioSessionBean.getEsGuardarRelacionado()) {
				this.jComboBoxTiposPaginacionTipoTributario.setSelectedItem(Funciones2.getTipoPaginacionDefecto("NORMAL",this.tiposPaginacion));
			} else {
				this.jComboBoxTiposPaginacionTipoTributario.setSelectedItem(Funciones2.getTipoPaginacionDefecto("RELACIONADO",this.tiposPaginacion));
			}
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposRelacionesTipoTributario.removeAllItems();
				
			for(Reporte reporte:this.tiposRelaciones) {
				this.jComboBoxTiposRelacionesTipoTributario.addItem(reporte);
			}
			
			//TIPOS ACCIONES
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposAccionesTipoTributario.removeAllItems();
				
			for(Reporte reporte:this.tiposAcciones) {
				this.jComboBoxTiposAccionesTipoTributario.addItem(reporte);
			}
			
			//TIPOS ACCIONES			
			
			
			
			//TIPOS ACCIONES FORMULARIO	
			if(this.jInternalFrameDetalleFormTipoTributario!=null) { //if(this.conCargarFormDetalle) {
				this.jInternalFrameDetalleFormTipoTributario.jComboBoxTiposAccionesFormularioTipoTributario.removeAllItems();
				
				for(Reporte reporte:this.tiposAccionesFormulario) {
					this.jInternalFrameDetalleFormTipoTributario.jComboBoxTiposAccionesFormularioTipoTributario.addItem(reporte);
				}
				
			}
			//TIPOS ACCIONES FORMULARIO
			
			
			
			//TIPOS SELECCIONAR
			this.jComboBoxTiposSeleccionarTipoTributario.removeAllItems();
				
			for(Reporte reporte:this.tiposSeleccionar) {
				this.jComboBoxTiposSeleccionarTipoTributario.addItem(reporte);
			}
			
			
			if(this.tiposSeleccionar!=null && this.tiposSeleccionar.size()>1) {
				this.jComboBoxTiposSeleccionarTipoTributario.setSelectedIndex(1);
			}
				
			//REPORTE DINAMICO
			this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualTipoTributario();
							
			//TIPOS COLUMNAS SELECT
			//TIPOS SELECCIONAR
			
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualTipoTributario() throws Exception {
		try	{
			DefaultListModel<Reporte> defaultListModel=new DefaultListModel<Reporte>();
			
			
			//TIPOS ARCHIVOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoTipoTributario!=null) {
				this.jInternalFrameReporteDinamicoTipoTributario.getjComboBoxTiposArchivosReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposArchivosReportesDinamico) {
					this.jInternalFrameReporteDinamicoTipoTributario.getjComboBoxTiposArchivosReportesDinamico().addItem(reporte);
				}
				
			}
			
			//TIPOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoTipoTributario!=null) {
				this.jInternalFrameReporteDinamicoTipoTributario.getjComboBoxTiposReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposReportesDinamico) {
					this.jInternalFrameReporteDinamicoTipoTributario.getjComboBoxTiposReportesDinamico().addItem(reporte);
				}
				
			}
			
			defaultListModel=new DefaultListModel<Reporte>();
			
			if(this.jInternalFrameReporteDinamicoTipoTributario!=null) {
				
				if(this.jInternalFrameReporteDinamicoTipoTributario.getjListColumnasSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoTipoTributario.getjListColumnasSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposColumnasSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoTipoTributario.getjListColumnasSelectReporte().setModel(defaultListModel);									
						
				}	
					
				//TIPOS RELACIONES SELECT
				//TIPOS SELECCIONAR
				defaultListModel=new DefaultListModel<Reporte>();
				if(this.jInternalFrameReporteDinamicoTipoTributario.getjListRelacionesSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoTipoTributario.getjListRelacionesSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposRelacionesSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoTipoTributario.getjListRelacionesSelectReporte().setModel(defaultListModel);									
						
				}	
				
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	
	
	public void inicializarActualizarBindingBusquedasManualTipoTributario()  throws Exception {				
		//BYDAN_BUSQUEDAS		
		
		this.codigoBusquedaPorCodigo=this.jTextAreacodigoBusquedaPorCodigoTipoTributario.getText();
		//this.idBusquedaPorId=Long.parseLong(this.jLabelidTipoTributarioBusquedaPorId.getText());
		this.nombreBusquedaPorNombre=this.jTextAreanombreBusquedaPorNombreTipoTributario.getText();
		if(this.jComboBoxid_paisFK_IdPaisTipoTributario.getSelectedItem()!=null){this.id_paisFK_IdPais=((Pais)this.jComboBoxid_paisFK_IdPaisTipoTributario.getSelectedItem()).getId();}
		
	}
	
	
	
	
	public void inicializarActualizarBindingBusquedasTipoTributario(Boolean esInicializar) throws Exception {				
		if(TipoTributarioJInternalFrame.ISBINDING_MANUAL) {
			
			this.inicializarActualizarBindingBusquedasManualTipoTributario();			
			
		} else {
		}
	}		
		
	public void inicializarActualizarBindingTablaTipoTributario() throws Exception {
		this.inicializarActualizarBindingTablaTipoTributario(false);
	}
	
	
	public void inicializarActualizarBindingTablaOrderByTipoTributario() {
		//TABLA OrderBy	
		TableColumn tableColumn=new TableColumn();
		Integer iWidthTableDefinicionOrderBy=0;			
			
		this.jInternalFrameOrderByTipoTributario.getjTableDatosOrderBy().setModel(new TablaGeneralOrderByModel(this.arrOrderBy));
					
		//DEFINIR RENDERERS OrderBy
		tableColumn=this.jInternalFrameOrderByTipoTributario.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByTipoTributario.getjTableDatosOrderBy(),OrderBy.ISSELECTED));			
		//tableColumn.addPropertyChangeListener(new TipoTributarioPropertyChangeListener());
					
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		iWidthTableDefinicionOrderBy+=50;
					
		tableColumn=this.jInternalFrameOrderByTipoTributario.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByTipoTributario.getjTableDatosOrderBy(),OrderBy.NOMBRE));
		//tableColumn.addPropertyChangeListener(new TipoTributarioPropertyChangeListener());
					
		tableColumn.setPreferredWidth(150); 	 
		tableColumn.setWidth(150); 	 
		tableColumn.setMinWidth(150);
		tableColumn.setMaxWidth(150);
				
		iWidthTableDefinicionOrderBy+=150;
					
		//tableColumn=this.jTableDatosTipoTributarioOrderBy.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTipoTributarioOrderBy,OrderBy.NOMBREDB));			
		////tableColumn.addPropertyChangeListener(new TipoTributarioPropertyChangeListener());
								
		tableColumn=this.jInternalFrameOrderByTipoTributario.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByTipoTributario.getjTableDatosOrderBy(),OrderBy.ESDESC));
		//tableColumn.addPropertyChangeListener(new TipoTributarioPropertyChangeListener());
												
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		((AbstractTableModel) this.jInternalFrameOrderByTipoTributario.getjTableDatosOrderBy().getModel()).fireTableDataChanged();
				
		iWidthTableDefinicionOrderBy+=50;
	}
	
	
	
	public void inicializarActualizarBindingTablaTipoTributario(Boolean esInicializar) throws Exception {
		Boolean isNoExiste=false;
		Integer iCountNumeroColumnasNormal=0;
		Integer iCountNumeroColumnasFk=0;
		
		this.iWidthTableDefinicion=0;
		
		int iSizeTabla=0;
		
		iSizeTabla=this.getSizeTablaDatos();
		
	if(esInicializar || ConstantesSwing.FORZAR_INICIALIZAR_TABLA) {//esInicializar
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			isNoExiste=tipotributarioLogic.getTipoTributarios().size()==0;
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			isNoExiste=tipotributarios.size()==0;
		}
		//ARCHITECTURE
			
		if(isNoExiste) {
			if(this.iNumeroPaginacion-this.iNumeroPaginacion>0) {
				this.iNumeroPaginacion-=this.iNumeroPaginacion;
			}
		}
		
		TableColumn tableColumn=new TableColumn();
		
		if(TipoTributarioJInternalFrame.ISBINDING_MANUAL_TABLA) {
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.jTableDatosTipoTributario.setModel(new TipoTributarioModel(this.tipotributarioLogic.getTipoTributarios(),this));
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.jTableDatosTipoTributario.setModel(new TipoTributarioModel(this.tipotributarios,this));
			}
			//ARCHITECTURE
			
							
			
			
			if(this.jInternalFrameOrderByTipoTributario!=null && this.jInternalFrameOrderByTipoTributario.getjTableDatosOrderBy()!=null) {
				this.inicializarActualizarBindingTablaOrderByTipoTributario();
			}
			
								
			//DEFINIR RENDERERS
			tableColumn=this.jTableDatosTipoTributario.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTipoTributario,Constantes2.S_SELECCIONAR));
			//tableColumn.addPropertyChangeListener(new TipoTributarioPropertyChangeListener());
			tableColumn.setCellRenderer(new BooleanRenderer(true,"Seleccionar "+TipoTributarioConstantesFunciones.SCLASSWEBTITULO,tipotributarioConstantesFunciones.resaltarSeleccionarTipoTributario,true,false,"","",this));
			tableColumn.setCellEditor(new BooleanEditorRenderer(true,"Seleccionar "+TipoTributarioConstantesFunciones.SCLASSWEBTITULO,tipotributarioConstantesFunciones.resaltarSeleccionarTipoTributario,false,"","",this));			
			
			tableColumn.setPreferredWidth(50); 	 
			tableColumn.setWidth(50); 	 
			tableColumn.setMinWidth(50); 
			tableColumn.setMaxWidth(50); 
			
			this.iWidthTableDefinicion+=50;
			
			


			tableColumn=this.jTableDatosTipoTributario.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTipoTributario,TipoTributarioConstantesFunciones.LABEL_ID));

		if(this.tipotributarioConstantesFunciones.mostraridTipoTributario && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,TipoTributarioConstantesFunciones.LABEL_ID,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.tipotributarioConstantesFunciones.resaltaridTipoTributario,this.tipotributarioConstantesFunciones.activaridTipoTributario,this,true,"idTipoTributario","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.tipotributarioConstantesFunciones.resaltaridTipoTributario,this.tipotributarioConstantesFunciones.activaridTipoTributario,this,true,"idTipoTributario","BASICO",false));

			tableColumn.setPreferredWidth(50);
			tableColumn.setWidth(50);
			tableColumn.setMinWidth(50);
			tableColumn.setMaxWidth(50);

			this.iWidthTableDefinicion+=50;
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosTipoTributario.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTipoTributario,TipoTributarioConstantesFunciones.LABEL_IDPAIS));

		if(this.tipotributarioConstantesFunciones.mostrarid_paisTipoTributario && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,TipoTributarioConstantesFunciones.LABEL_IDPAIS,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++)) {
			tableColumn.setCellRenderer(new PaisTableCell(this.paissForeignKey,this.tipotributarioConstantesFunciones.resaltarid_paisTipoTributario,this,this.tipotributarioConstantesFunciones.activarid_paisTipoTributario));
			tableColumn.setCellEditor(new PaisTableCell(this.paissForeignKey,this.tipotributarioConstantesFunciones.resaltarid_paisTipoTributario,this,this.tipotributarioConstantesFunciones.activarid_paisTipoTributario,true,"id_paisTipoTributario","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new TipoTributarioPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosTipoTributario.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTipoTributario,TipoTributarioConstantesFunciones.LABEL_CODIGO));

		if(this.tipotributarioConstantesFunciones.mostrarcodigoTipoTributario && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,TipoTributarioConstantesFunciones.LABEL_CODIGO,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.tipotributarioConstantesFunciones.resaltarcodigoTipoTributario,this.tipotributarioConstantesFunciones.activarcodigoTipoTributario,this,true,"codigoTipoTributario","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.tipotributarioConstantesFunciones.resaltarcodigoTipoTributario,this.tipotributarioConstantesFunciones.activarcodigoTipoTributario,this,true,"codigoTipoTributario","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,130));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,130));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,130));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,130));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,130);
			//tableColumn.addPropertyChangeListener(new TipoTributarioPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosTipoTributario.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTipoTributario,TipoTributarioConstantesFunciones.LABEL_NOMBRE));

		if(this.tipotributarioConstantesFunciones.mostrarnombreTipoTributario && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,TipoTributarioConstantesFunciones.LABEL_NOMBRE,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.tipotributarioConstantesFunciones.resaltarnombreTipoTributario,this.tipotributarioConstantesFunciones.activarnombreTipoTributario,this,true,"nombreTipoTributario","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.tipotributarioConstantesFunciones.resaltarnombreTipoTributario,this.tipotributarioConstantesFunciones.activarnombreTipoTributario,this,true,"nombreTipoTributario","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,130));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,130));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,130));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,130));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,130);
			//tableColumn.addPropertyChangeListener(new TipoTributarioPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}
			
		} else {
		}			
					
		if(!this.tipotributarioSessionBean.getEsGuardarRelacionado()
			&& !this.esParaBusquedaForeignKey) {
			

			if(this.isTienePermisosTransaccionLocal && this.tipotributarioConstantesFunciones.mostrarTransaccionLocalTipoTributario && !TipoTributarioConstantesFunciones.ISGUARDARREL) {
				tableColumn= new TableColumn();
				tableColumn.setIdentifier("Transaccion Locales");
				tableColumn.setHeaderValue("Transaccion Locales");
				tableColumn.setCellRenderer(new TransaccionLocalTableCell(tipotributarioConstantesFunciones.resaltarTransaccionLocalTipoTributario,this,this.tipotributarioConstantesFunciones.activarTransaccionLocalTipoTributario));
				tableColumn.setCellEditor(new TransaccionLocalTableCell(tipotributarioConstantesFunciones.resaltarTransaccionLocalTipoTributario,this,this.tipotributarioConstantesFunciones.activarTransaccionLocalTipoTributario));

				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
				tableColumn.setWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);

				this.jTableDatosTipoTributario.addColumn(tableColumn);
			}

			if(this.isTienePermisosFacturaProveedorServicio && this.tipotributarioConstantesFunciones.mostrarFacturaProveedorServicioTipoTributario && !TipoTributarioConstantesFunciones.ISGUARDARREL) {
				tableColumn= new TableColumn();
				tableColumn.setIdentifier("Factura Proveedors");
				tableColumn.setHeaderValue("Factura Proveedors");
				tableColumn.setCellRenderer(new FacturaProveedorServicioTableCell(tipotributarioConstantesFunciones.resaltarFacturaProveedorServicioTipoTributario,this,this.tipotributarioConstantesFunciones.activarFacturaProveedorServicioTipoTributario));
				tableColumn.setCellEditor(new FacturaProveedorServicioTableCell(tipotributarioConstantesFunciones.resaltarFacturaProveedorServicioTipoTributario,this,this.tipotributarioConstantesFunciones.activarFacturaProveedorServicioTipoTributario));

				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
				tableColumn.setWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);

				this.jTableDatosTipoTributario.addColumn(tableColumn);
			}

			if(this.isTienePermisosDefinicion && this.tipotributarioConstantesFunciones.mostrarDefinicionTipoTributario && !TipoTributarioConstantesFunciones.ISGUARDARREL) {
				tableColumn= new TableColumn();
				tableColumn.setIdentifier("Definiciones");
				tableColumn.setHeaderValue("Definiciones");
				tableColumn.setCellRenderer(new DefinicionTableCell(tipotributarioConstantesFunciones.resaltarDefinicionTipoTributario,this,this.tipotributarioConstantesFunciones.activarDefinicionTipoTributario));
				tableColumn.setCellEditor(new DefinicionTableCell(tipotributarioConstantesFunciones.resaltarDefinicionTipoTributario,this,this.tipotributarioConstantesFunciones.activarDefinicionTipoTributario));

				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
				tableColumn.setWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);

				this.jTableDatosTipoTributario.addColumn(tableColumn);
			}
		}
		
		if(true) {
			String sLabelColumnAccion="Editar";
			String sLabelColumnAccionEli="Eli";
			
			if(this.esParaBusquedaForeignKey)  {
				sLabelColumnAccion="Seleccionar";
				
				//LO MISMO QUE ELSE
				tableColumn= new TableColumn();
				tableColumn.setIdentifier(sLabelColumnAccion);
				tableColumn.setHeaderValue(sLabelColumnAccion);
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.tipotributarioSessionBean.getEsGuardarRelacionado()));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.tipotributarioSessionBean.getEsGuardarRelacionado()));
	
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosTipoTributario.addColumn(tableColumn);
			
			} else {				
				
				//LO MISMO QUE IF
				
				tableColumn= new TableColumn();
				tableColumn.setIdentifier(sLabelColumnAccion);
				tableColumn.setHeaderValue(sLabelColumnAccion);
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.tipotributarioSessionBean.getEsGuardarRelacionado()));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.tipotributarioSessionBean.getEsGuardarRelacionado()));
		
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosTipoTributario.addColumn(tableColumn);				
					
				//ELIMINAR
				if(this.isPermisoEliminarTipoTributario && this.isPermisoGuardarCambiosTipoTributario) {
					tableColumn= new TableColumn();
					tableColumn.setIdentifier(Constantes2.S_ELI);
					tableColumn.setHeaderValue(sLabelColumnAccionEli);
					tableColumn.setCellRenderer(new IdTableCell(this,false,true,this.tipotributarioSessionBean.getEsGuardarRelacionado()));
					tableColumn.setCellEditor(new IdTableCell(this,false,true,this.tipotributarioSessionBean.getEsGuardarRelacionado()));
			
					tableColumn.setPreferredWidth(65); 	 
					tableColumn.setWidth(65); 	 
					tableColumn.setMinWidth(65); 
					tableColumn.setMaxWidth(65);
					
					this.iWidthTableDefinicion+=65;
						
					this.jTableDatosTipoTributario.addColumn(tableColumn);
				}
			}			
						
			if(this.conMaximoRelaciones && this.tipotributarioSessionBean.getConGuardarRelaciones()) {
				if(this.conFuncionalidadRelaciones) {
					tableColumn= new TableColumn();
					tableColumn.setIdentifier("Editar Rel");
					tableColumn.setHeaderValue("Editar Rel");
					tableColumn.setCellRenderer(new IdTableCell(this,true,false));
					tableColumn.setCellEditor(new IdTableCell(this,true,false));
		
					tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
					tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
					tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
					tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
					
					this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
					this.jTableDatosTipoTributario.addColumn(tableColumn);
				}
			}
			
			/*
			tableColumn= new TableColumn();
			tableColumn.setIdentifier(Constantes2.S_SELECCIONAR);
			tableColumn.setHeaderValue(Constantes2.S_SELECCIONAR);
			tableColumn.setCellRenderer(new IdSeleccionarTableCell(this));
			tableColumn.setCellEditor(new IdSeleccionarTableCell(this));
			
			tableColumn.setPreferredWidth(30); 	 
			tableColumn.setWidth(30); 	 
			tableColumn.setMinWidth(30); 
			
			this.iWidthTableDefinicion+=30;
			
			this.jTableDatosTipoTributario.addColumn(tableColumn);
			*/
		}
		
		Integer iUltimaColumna=0;//1
		Integer iNuevaPosicionColumna=0;
		
		
		//PERMITE ELIMINAR SIMPLE
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarTipoTributario && this.isPermisoGuardarCambiosTipoTributario) {
				iUltimaColumna++;
			}	
		}
		
		//PERMITE EDITAR SIMPLE
		iUltimaColumna++;	
		
				
		if(this.conFuncionalidadRelaciones) {
			if(this.conMaximoRelaciones && this.tipotributarioSessionBean.getConGuardarRelaciones()) {			
				//PERMITE EDITAR RELACIONES
				iUltimaColumna++;//2
			}
		}
		
		//MOVIA SELECCIONAR
		//iUltimaColumna++;
		
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarTipoTributario && this.isPermisoGuardarCambiosTipoTributario) {
				//REUBICA ELIMINAR SIMPLE
				jTableDatosTipoTributario.moveColumn(this.jTableDatosTipoTributario.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3
					
				iUltimaColumna--;
			}
		}
		//REUBICA EDITAR SIMPLE
		jTableDatosTipoTributario.moveColumn(this.jTableDatosTipoTributario.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3				
		
		
		if(this.conFuncionalidadRelaciones) {
			if(this.conMaximoRelaciones && this.tipotributarioSessionBean.getConGuardarRelaciones()) {	
				if(iUltimaColumna>1) {
					iUltimaColumna--;
				}
				
				//iNuevaPosicionColumna++;
				
				//REUBICA EDITAR RELACIONES
				jTableDatosTipoTributario.moveColumn(this.jTableDatosTipoTributario.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1
			}
		}
		
		
		//REUBICABA SELECCIONAR
		/*
		if(iUltimaColumna>1) {
			iUltimaColumna--;
		}
		
		//iNuevaPosicionColumna++;
			
		//REUBICA SELECCIONAR FILA CHECK
		jTableDatosTipoTributario.moveColumn(this.jTableDatosTipoTributario.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1		
		*/
		
		//DEFINEN HEADERS
		final TableCellRenderer tableHeaderDefaultCellRenderer = this.jTableDatosTipoTributario.getTableHeader().getDefaultRenderer();
		
		this.jTableDatosTipoTributario.getTableHeader().setDefaultRenderer(new TableCellRendererHeader(this.jTableDatosTipoTributario,tableHeaderDefaultCellRenderer));
	    
		TableColumn column=null;
		
		if(!TipoTributarioJInternalFrame.ISBINDING_MANUAL_TABLA) {
			for(int i = 0; i < this.jTableDatosTipoTributario.getColumnModel().getColumnCount(); i++) { 
				column = this.jTableDatosTipoTributario.getColumnModel().getColumn(i); 
				
				if(column.getIdentifier()!=null) {
					//SI SE UTILIZA UN HEADER ES GENERICO
					//column.setHeaderRenderer(new HeaderRenderer(column.getIdentifier().toString()));
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_ELI)) {
					continue;
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_SELECCIONAR)) {
					if(!TipoTributarioJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(50); 	 
						column.setWidth(50); 	 
						column.setMinWidth(50); 	
						column.setMaxWidth(50); 
						
						this.iWidthTableDefinicion+=50;
					}
					
				} else {
					if(!TipoTributarioJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						column.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						
						this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
					}
				}
			}
		}
		
		this.jTableDatosTipoTributario.setSelectionBackground(FuncionesSwing.getColorSelectedBackground());
		this.jTableDatosTipoTributario.setSelectionForeground(FuncionesSwing.getColorSelectedForeground());
		
		/*
		this.jTableDatosTipoTributario.setDefaultRenderer(Object.class, new DefaultTableCellRenderer() {
			private static final long serialVersionUID = 1L;
			
		    @Override
		    public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
		        final Component component= super.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, column);
		        //POR DEFECTO ES MEJOR, SE PIERDE DATOS AL SELECCIONAR BLANCO LETRAS BLANCAS
				component.setBackground(row % 2 == 0 ? FuncionesSwing.getColorTextFields(Constantes2.S_FONDOCONTROL_COLOR) : Funciones2.getColorFilaTabla2()); //FuncionesSwing.getColorTextFields(Constantes2.S_FONDOCONTROL_COLOR)
				component.setForeground(Funciones2.getColorTextoFilaTabla1());
				
				try {
		        	int iSize=-999;
		        	
		        	if(conTotales) {
						//FILA TOTALES OTRO COLOR, SI TABLA NO ES UNO A UNO
			        	if(Constantes.ISUSAEJBLOGICLAYER) {
							iSize=tipotributarioLogic.getTipoTributarios().size()-1;
								
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							iSize=tipotributarios.size()-1;
						}
						
						if(iSize==row) {
							component.setBackground(Funciones2.getColorFilaTablaTotales());
						}
		        	}
					
					//POR EFICIENCIA NO UTILIZAR					
					//if (component instanceof JComponent) {
		            //    JComponent jcomponent = (JComponent) component;		                 		                
		        	//}				
					
				} catch (Exception e) {
					e.printStackTrace();
				}
				
		        return component;
		    }
		});
		*/
		
		//ESTA EN LA DEFINICION DE LA TABLA
		//this.jTableDatosTipoTributario.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA);
		
		/*
		column=this.jTableDatosTipoTributario.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosSistema,Constantes2.S_SELECCIONAR));
		
		if(column!=null) {
			column.setPreferredWidth(25); 	 
			column.setWidth(25); 	 
			column.setMinWidth(25); 	
		}
		*/
			
			//CopyTableToTableTotal();
		} else {
			
			this.actualizarVisualTableDatosTipoTributario();
			
		}
	}
	
	/*
	//COPY_TABLES
	/* FALTARIA RESOLVER:
	   1 SOLO SCROLL PARA 2 TABLAS
	   COPIA EXACTA DE COLUMNAS DE UNA TABLA A OTRA, SI SE MODIFICA TAMANIO TAMBIEN LA OTRA
	*/
	
	public void jButtonIdActionPerformed(ActionEvent evt,int rowIndex,Boolean esRelaciones,Boolean esEliminar) { 
		try {
			if(!esEliminar) {
				this.estaModoSeleccionar=true;
				
				//this.isEsNuevoTipoTributario=false;
					
				TipoTributarioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.tipotributario,new Object(),this.tipotributarioParameterGeneral,this.tipotributarioReturnGeneral);
			
				if(this.tipotributarioSessionBean.getConGuardarRelaciones()) {
					this.dStart=(double)System.currentTimeMillis();
				}
				
				if(this.jInternalFrameDetalleFormTipoTributario==null) {
					this.inicializarFormDetalle();
				}
				
				this.inicializarInvalidValues();
				
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosTipoTributario.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosTipoTributario.getSelectedRow();	       
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipotributario =(TipoTributario) this.tipotributarioLogic.getTipoTributarios().toArray()[this.jTableDatosTipoTributario.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipotributario =(TipoTributario) this.tipotributarios.toArray()[this.jTableDatosTipoTributario.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//PUEDE SER PARA DUPLICADO O NUEVO TABLA
				
				if(this.tipotributario.getsType().equals("DUPLICADO")
				   || this.tipotributario.getsType().equals("NUEVO_GUARDAR_CAMBIOS")) {
					
					this.isEsNuevoTipoTributario=true;
				
				} else {
					this.isEsNuevoTipoTributario=false;	
				}
				
				//CONTROL VERSION ANTERIOR
				/*
				if(!this.tipotributarioSessionBean.getEsGuardarRelacionado()) {
					if(this.tipotributario.getId()>=0 && !this.tipotributario.getIsNew()) {						
						this.isEsNuevoTipoTributario=false;
						
					} else {
						this.isEsNuevoTipoTributario=true;
					}
					
				} else {
					//CONTROLAR PARA RELACIONADO
				}
				*/
				
				//ESTABLECE SI ES RELACIONADO O NO 
				this.habilitarDeshabilitarTipoMantenimientoTipoTributario(esRelaciones);						
				
				this.seleccionarTipoTributario(evt,null,rowIndex);
				
				//SELECCIONA ACTUAL PERO AUN NO SE HA INGRESADO AL SISTEMA
				//SE DESHABILITA POR GUARDAR CAMBIOS
				/*
				if(this.tipotributario.getId()<0) {
					this.isEsNuevoTipoTributario=true;
				}
				*/
				
				if(!this.esParaBusquedaForeignKey) {
					this.modificarTipoTributario(evt,rowIndex,esRelaciones);
				} else {
					this.seleccionarTipoTributario(evt,rowIndex);
				}	
				
				if(this.tipotributarioSessionBean.getConGuardarRelaciones()) {
					this.dEnd=(double)System.currentTimeMillis();					
					this.dDif=this.dEnd - this.dStart;
					
					if(Constantes.ISDEVELOPING) {
						System.out.println("Tiempo(ms) Seleccion TipoTributario: " + this.dDif); 
					}
				}								
				
				TipoTributarioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.tipotributario,new Object(),this.tipotributarioParameterGeneral,this.tipotributarioReturnGeneral);
				
			} else {
				this.estaModoEliminarGuardarCambios=true;
				
				this.seleccionarTipoTributario(evt,null,rowIndex);
				
				if(this.permiteMantenimiento(this.tipotributario)) {
					if(this.tipotributario.getId()>0) {
						this.tipotributario.setIsDeleted(true);
						
						this.tipotributariosEliminados.add(this.tipotributario);
					}
					
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.tipotributarioLogic.getTipoTributarios().remove(this.tipotributario);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.tipotributarios.remove(this.tipotributario);				
					}
					
					
					((TipoTributarioModel) this.jTableDatosTipoTributario.getModel()).fireTableRowsDeleted(rowIndex,rowIndex);
					
					this.actualizarFilaTotales();
					
					this.inicializarActualizarBindingTablaTipoTributario(false);					
				}								
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException2(this, e,logger,TipoTributarioConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoSeleccionar=false;				
			this.estaModoEliminarGuardarCambios=false;
		}
	}
	
	
	public void seleccionarTipoTributario(ActionEvent evt,javax.swing.event.ListSelectionEvent evt2,int rowIndex) throws Exception { 
		try {
			//SI PUEDE SER NUEVO Y SELECCIONAR (PARA DUPLICAR Y NUEVO TABLA)
			//if(!this.isEsNuevoTipoTributario) {
			
			if(this.jInternalFrameDetalleFormTipoTributario==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosTipoTributario.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosTipoTributario.getSelectedRow();	       
				}
				
				//CUANDO SE RECARGA TABLA TAMBIEN SE SELECCIONA PERO CON -1 POR LO QUE SE NECESITA VALIDAR ANTES
				if(intSelectedRow<0) {
					return;
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipotributario =(TipoTributario) this.tipotributarioLogic.getTipoTributarios().toArray()[this.jTableDatosTipoTributario.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipotributario =(TipoTributario) this.tipotributarios.toArray()[this.jTableDatosTipoTributario.convertRowIndexToModel(intSelectedRow)];
				}
				
				if(TipoTributarioJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesObjetoActualToFormularioTipoTributario(this.tipotributario);
				}
				
				//ARCHITECTURE
				try {
					

					//Pais
					if(!this.tipotributarioConstantesFunciones.cargarid_paisTipoTributario || this.tipotributarioConstantesFunciones.event_dependid_paisTipoTributario) {
						//this.cargarCombosPaissForeignKeyLista(" where id="+this.tipotributario.getid_pais());
									//this.inicializarActualizarBindingTipoTributario(false,false);
						this.paissForeignKey=new ArrayList<Pais>();

						if(tipotributario.getPais()!=null) {
							this.paissForeignKey.add(tipotributario.getPais());
						}

						this.addItemDefectoCombosForeignKeyPais();
						this.cargarCombosFramePaissForeignKey("Todos");
					}
					this.setActualPaisForeignKey(this.tipotributario.getid_pais(),false,"Formulario");
				} catch(Exception e) {
					throw e;
				}
				
				this.actualizarEstadoCeldasBotonesTipoTributario("s", this.isGuardarCambiosEnLote, this.isEsMantenimientoRelacionado);
				
				//NO FUNCIONA BINDING PERO SE MANTIENE
				this.inicializarActualizarBindingBotonesTipoTributario(false) ;
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualTipoTributario() ;
			//}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoTributarioConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesObjetoActualToFormularioTodoTipoTributario(TipoTributario tipotributario) throws Exception { 
		this.setVariablesObjetoActualToFormularioTodoTipoTributario(tipotributario,false,"NINGUNO");
	}
	
	public void setVariablesObjetoActualToFormularioTodoTipoTributario(TipoTributario tipotributario,Boolean conCargarListasDesdeObjetoActual,String sTipoEvento) throws Exception { 
		this.setVariablesObjetoActualToFormularioTipoTributario(tipotributario);
		
		if(conCargarListasDesdeObjetoActual) {
			this.setVariablesObjetoActualToListasForeignKeyTipoTributario(tipotributario,sTipoEvento);
		}
		
		this.setVariablesObjetoActualToFormularioForeignKeyTipoTributario(tipotributario);
	}
	
	public void setVariablesObjetoActualToFormularioTipoTributario(TipoTributario tipotributario) throws Exception { 
		try {			
			Image imageActual=null;
			ImageIcon imageIcon = null;
			
			if(this.jInternalFrameDetalleFormTipoTributario==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			
			this.jInternalFrameDetalleFormTipoTributario.jLabelidTipoTributario.setText(tipotributario.getId().toString());
			this.jInternalFrameDetalleFormTipoTributario.jTextAreacodigoTipoTributario.setText(tipotributario.getcodigo());
			this.jInternalFrameDetalleFormTipoTributario.jTextAreanombreTipoTributario.setText(tipotributario.getnombre());
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoTributarioConstantesFunciones.CLASSNAME);
		}
	}
		
	public void actualizarInformacion(String sTipo,TipoTributario tipotributarioLocal) throws Exception {
		this.actualizarInformacion(sTipo,false,tipotributarioLocal);
	}	
	
	public void actualizarInformacion(String sTipo,Boolean conParametroObjeto,TipoTributario tipotributarioLocal) throws Exception {
		
		if(!conParametroObjeto) {
			if(!this.getEsControlTabla()) {
				tipotributarioLocal=this.tipotributario;
			} else {
				tipotributarioLocal=this.tipotributarioAnterior;
			}
		}
		
		if(this.permiteMantenimiento(tipotributarioLocal)) {
			if(sTipo.equals("EVENTO_CONTROL")) { // || sTipo.equals("EVENTO_NUEVO")
				if(!this.esControlTabla) {
					this.setVariablesFormularioToObjetoActualTodoTipoTributario(tipotributarioLocal,true);
					
					if(tipotributarioSessionBean.getConGuardarRelaciones()) {
						this.actualizarRelaciones(tipotributarioLocal);
					}
				}
			
			} else if(sTipo.equals("INFO_PADRE")) {
				
				if(this.tipotributarioSessionBean.getEsGuardarRelacionado()) {
					this.actualizarRelacionFkPadreActual(tipotributarioLocal);
				}
			}
		}
	}
	
	public void setVariablesFormularioToObjetoActualTodoTipoTributario(TipoTributario tipotributario,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualTipoTributario(tipotributario,conColumnasBase);
		this.setVariablesFormularioToObjetoActualForeignKeysTipoTributario(tipotributario);
	}
	
	public void setVariablesFormularioToObjetoActualTipoTributario(TipoTributario tipotributario,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualTipoTributario(tipotributario,conColumnasBase,true);
	}
	
	public void setVariablesFormularioToObjetoActualTipoTributario(TipoTributario tipotributario,Boolean conColumnasBase,Boolean conInicializarInvalidValues) throws Exception { 
		String sMensajeCampoActual="";
		Boolean estaValidado=true;
		try {
			
			if(this.jInternalFrameDetalleFormTipoTributario==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			if(conInicializarInvalidValues) {
				this.inicializarInvalidValues();
			}
			
			

		try {
			if(this.jInternalFrameDetalleFormTipoTributario.jLabelidTipoTributario.getText()==null || this.jInternalFrameDetalleFormTipoTributario.jLabelidTipoTributario.getText()=="" || this.jInternalFrameDetalleFormTipoTributario.jLabelidTipoTributario.getText()=="Id") {
				this.jInternalFrameDetalleFormTipoTributario.jLabelidTipoTributario.setText("0");
			}

			if(conColumnasBase) {tipotributario.setId(Long.parseLong(this.jInternalFrameDetalleFormTipoTributario.jLabelidTipoTributario.getText()));}
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+TipoTributarioConstantesFunciones.LABEL_ID+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTipoTributario.jLabelIdTipoTributario,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			tipotributario.setcodigo(this.jInternalFrameDetalleFormTipoTributario.jTextAreacodigoTipoTributario.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+TipoTributarioConstantesFunciones.LABEL_CODIGO+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTipoTributario.jLabelcodigoTipoTributario,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			tipotributario.setnombre(this.jInternalFrameDetalleFormTipoTributario.jTextAreanombreTipoTributario.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+TipoTributarioConstantesFunciones.LABEL_NOMBRE+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTipoTributario.jLabelnombreTipoTributario,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}
			
			if(!estaValidado) {
				throw new Exception(sMensajeCampoActual);
			}
		} catch(NumberFormatException e) {
			throw new Exception(sMensajeCampoActual);
			//FuncionesSwing.manageException(this, e,logger,MovimientoInventarioConstantesFunciones.CLASSNAME);
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoTributarioConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualTipoTributario(TipoTributario tipotributarioBean,TipoTributario tipotributario,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			if(conDefault || (!conDefault && tipotributarioBean.getid_pais()!=null && !tipotributarioBean.getid_pais().equals(-1L))) {tipotributario.setid_pais(tipotributarioBean.getid_pais());}
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoTributarioConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setCopiarVariablesObjetosTipoTributario(TipoTributario tipotributarioOrigen,TipoTributario tipotributario,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			if(conColumnasBase) {if(conDefault || (!conDefault && tipotributarioOrigen.getId()!=null && !tipotributarioOrigen.getId().equals(0L))) {tipotributario.setId(tipotributarioOrigen.getId());}}
			if(conDefault || (!conDefault && tipotributarioOrigen.getid_pais()!=null && !tipotributarioOrigen.getid_pais().equals(-1L))) {tipotributario.setid_pais(tipotributarioOrigen.getid_pais());}
			if(conDefault || (!conDefault && tipotributarioOrigen.getcodigo()!=null && !tipotributarioOrigen.getcodigo().equals(""))) {tipotributario.setcodigo(tipotributarioOrigen.getcodigo());}
			if(conDefault || (!conDefault && tipotributarioOrigen.getnombre()!=null && !tipotributarioOrigen.getnombre().equals(""))) {tipotributario.setnombre(tipotributarioOrigen.getnombre());}
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoTributarioConstantesFunciones.CLASSNAME);
		}
	}
	
	/*
	public void setVariablesObjetoBeanActualToFormularioTipoTributario(TipoTributario tipotributario) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormTipoTributario.jLabelidTipoTributario.setText(tipotributario.getId().toString());
			this.jInternalFrameDetalleFormTipoTributario.jTextAreacodigoTipoTributario.setText(tipotributario.getcodigo());
			this.jInternalFrameDetalleFormTipoTributario.jTextAreanombreTipoTributario.setText(tipotributario.getnombre());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoTributarioConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoBeanActualToFormularioTipoTributario(TipoTributarioBean tipotributarioBean) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormTipoTributario.jLabelidTipoTributario.setText(tipotributarioBean.getId().toString());
			this.jInternalFrameDetalleFormTipoTributario.jTextAreacodigoTipoTributario.setText(tipotributarioBean.getcodigo());
			this.jInternalFrameDetalleFormTipoTributario.jTextAreanombreTipoTributario.setText(tipotributarioBean.getnombre());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoTributarioConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoReturnGeneralToBeanTipoTributario(TipoTributarioParameterReturnGeneral tipotributarioReturnGeneral,TipoTributarioBean tipotributarioBean,Boolean conDefault) throws Exception { 
		try {
			TipoTributario tipotributarioLocal=new TipoTributario();
			
			tipotributarioLocal=tipotributarioReturnGeneral.getTipoTributario();
			
			
			if(conColumnasBase) {if(conDefault || (!conDefault && tipotributarioLocal.getId()!=null && !tipotributarioLocal.getId().equals(0L))) {tipotributarioBean.setId(tipotributarioLocal.getId());}}
			if(conDefault || (!conDefault && tipotributarioLocal.getid_pais()!=null && !tipotributarioLocal.getid_pais().equals(-1L))) {tipotributarioBean.setid_pais(tipotributarioLocal.getid_pais());}
			if(conDefault || (!conDefault && tipotributarioLocal.getcodigo()!=null && !tipotributarioLocal.getcodigo().equals(""))) {tipotributarioBean.setcodigo(tipotributarioLocal.getcodigo());}
			if(conDefault || (!conDefault && tipotributarioLocal.getnombre()!=null && !tipotributarioLocal.getnombre().equals(""))) {tipotributarioBean.setnombre(tipotributarioLocal.getnombre());}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoTributarioConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	@SuppressWarnings("rawtypes")
	public static void setActualComboBoxTipoTributarioGenerico(Long idTipoTributarioSeleccionado,JComboBox jComboBoxTipoTributario,List<TipoTributario> tipotributariosLocal)throws Exception {
		try {
			TipoTributario  tipotributarioTemp=null;

			for(TipoTributario tipotributarioAux:tipotributariosLocal) {
				if(tipotributarioAux.getId()!=null && tipotributarioAux.getId().equals(idTipoTributarioSeleccionado)) {
					tipotributarioTemp=tipotributarioAux;
					break;
				}
			}

			jComboBoxTipoTributario.setSelectedItem(tipotributarioTemp);

		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("rawtypes")
	public static void setHotKeysComboBoxTipoTributarioGenerico(JComboBox jComboBoxTipoTributario,JInternalFrameBase jInternalFrameBase,String sNombreHotKeyAbstractAction,String sTipoBusqueda)throws Exception {
		try {
			//GLOBAL(id_empresa,id_sucursal,id_ejercicio)
			//BASICO(normal)
			//CON_BUSQUEDA(Permite buscar Fk)
			
			String sKeyStrokeName="";
			KeyStroke keyStrokeControl=null;
			
			if(!sTipoBusqueda.equals("GLOBAL")) {
				
				//BUSCAR
				sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
				keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_BUSCAR");
				
				jComboBoxTipoTributario.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxTipoTributario.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Busqueda"));
				//BUSCAR
				
				
				//ACTUALIZAR
				sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
				keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_ACTUALIZAR");
				
				jComboBoxTipoTributario.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxTipoTributario.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Update"));
				//ACTUALIZAR
				
				if(sTipoBusqueda.contains("CON_EVENT_CHANGE")) {
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxTipoTributario.addFocusListener(new ComboBoxFocusListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
						jComboBoxTipoTributario.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));						
					}
					
					/*
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxTipoTributario.addItemListener(new ComboBoxItemListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					} else {
						jComboBoxTipoTributario.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					}
					*/
				}								
				
				//CON_BUSQUEDA								
				if(sTipoBusqueda.contains("CON_BUSQUEDA")) {
					sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
					keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_BUSQUEDA");
							
					jComboBoxTipoTributario.getInputMap().put(keyStrokeControl, sKeyStrokeName);
					jComboBoxTipoTributario.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction));
				}
				//CON_BUSQUEDA
				
				
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	//PARA INICIALIZAR CONTROLES DE TABLA
	@SuppressWarnings("rawtypes")
	public void setHotKeysComboBoxGenerico(JComboBox jComboBox,JInternalFrameBase jInternalFrameBase,String sNombreHotKeyAbstractAction,String sTipoBusqueda) {
		if(sTipoBusqueda.contains("CON_EVENT_CHANGE")) {
			if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
				jComboBox.addItemListener(new ComboBoxItemListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
				jComboBox.addFocusListener(new ComboBoxFocusListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
			} else {
				jComboBox.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
				jComboBox.addFocusListener(new ComboBoxFocusListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
			}
		}
	}
	
	//PARA INICIALIZAR CONTROLES DE TABLA
	public void setHotKeysJTextFieldGenerico(JTextField jTextField,JInternalFrameBase jInternalFrameBase,String sNombreHotKeyAbstractAction,String sTipoBusqueda) {
		jTextField.addFocusListener(new TextFieldFocusListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
		jTextField.addActionListener(new TextFieldActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
	}
	
	//PARA INICIALIZAR CONTROLES DE TABLA
	public void setHotKeysJTextAreaGenerico(JTextArea jTextArea,JInternalFrameBase jInternalFrameBase,String sNombreHotKeyAbstractAction,String sTipoBusqueda) {
		jTextArea.addFocusListener(new TextAreaFocusListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
		
		//NO EXISTE
		//jTextArea.addActionListener(new TextAreaActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
	}
	
	//PARA INICIALIZAR CONTROLES DE TABLA
	public void setHotKeysJLabelGenerico(JLabel jLabel,JInternalFrameBase jInternalFrameBase,String sNombreHotKeyAbstractAction,String sTipoBusqueda) {
		jLabel.addFocusListener(new LabelFocusListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
		
		//NO EXISTE
		//jLabel.addActionListener(new LabelActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
	}
	
	//PARA INICIALIZAR CONTROLES DE TABLA
	public void setHotKeysJCheckBoxGenerico(JCheckBox jCheckBox,JInternalFrameBase jInternalFrameBase,String sNombreHotKeyAbstractAction,String sTipoBusqueda) {
		jCheckBox.addFocusListener(new CheckBoxFocusListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
		
		//SI SE DEFINE AL CAMBIAR VALOR, ESTE NUEVO VALOR NO SE ENVIA AL EVENTO
		//jCheckBox.addItemListener(new CheckBoxItemListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
	}
	
	//PARA INICIALIZAR CONTROLES DE TABLA
	public void setHotKeysJDateChooserGenerico(JDateChooser jDateChooser,JInternalFrameBase jInternalFrameBase,String sNombreHotKeyAbstractAction,String sTipoBusqueda) {
		FuncionesSwing.addDateListener(jDateChooser, jInternalFrameBase, sNombreHotKeyAbstractAction);
	}
	
	//PARA INICIALIZAR CONTROLES DE TABLA
	public void setHotKeysJButtonGenerico(JButton jButton,JInternalFrameBase jInternalFrameBase,String sNombreHotKeyAbstractAction,String sTipoBusqueda) {
		jButton.addActionListener(new ButtonActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
	}
	
	public void jButtonRelacionActionPerformed(String sTipo,ActionEvent evt,int rowIndex,Boolean conInicializar,Boolean esRelacionado) {
		//ABRIR RELACIONES
		try {
			
		if(sTipo.equals("TransaccionLocal")) {
			jButtonTransaccionLocalActionPerformed(evt,rowIndex,true,false,null);
		}
		 else if(sTipo.equals("FacturaProveedorServicio")) {
			jButtonFacturaProveedorServicioActionPerformed(evt,rowIndex,true,false,null);
		}
		 else if(sTipo.equals("Definicion")) {
			jButtonDefinicionActionPerformed(evt,rowIndex,true,false,null);
		}
		} catch (Exception e) {
			FuncionesSwing.manageException2(this, e,logger,TipoTributarioConstantesFunciones.CLASSNAME);
		}
	}
	
	public String getDescripcionFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		String sDescripcion="";
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tipotributario=(TipoTributario) tipotributarioLogic.getTipoTributarios().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			tipotributario =(TipoTributario) tipotributarios.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		if(sTipo.equals("Pais")) {
			//sDescripcion=this.getActualPaisForeignKeyDescripcion((Long)value);
			if(!tipotributario.getIsNew() && !tipotributario.getIsChanged() && !tipotributario.getIsDeleted()) {
				sDescripcion=tipotributario.getpais_descripcion();
			} else {
				//sDescripcion=this.getActualPaisForeignKeyDescripcion((Long)value);
				sDescripcion=tipotributario.getpais_descripcion();
			}
		}

		
		return sDescripcion;
	}
	
	public Color getColorFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		Color color=Color.WHITE;
		
		TipoTributario tipotributarioRow=new TipoTributario();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tipotributarioRow=(TipoTributario) tipotributarioLogic.getTipoTributarios().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			tipotributarioRow=(TipoTributario) tipotributarios.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		
		return color;
	}
	
	
	
	
	public void jButtonTransaccionLocalActionPerformed(ActionEvent evt,int rowIndex,Boolean conInicializar,Boolean esRelacionado,TipoTributario tipotributario) throws Exception {
			try {

				if(this.jInternalFrameDetalleFormTipoTributario==null) {
					this.inicializarFormDetalle();
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipotributarioLogic.getNewConnexionToDeep("");
				}

				int intSelectedRow =rowIndex;

				if(intSelectedRow!=-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tipotributario = (TipoTributario)this.tipotributarioLogic.getTipoTributarios().toArray()[this.jTableDatosTipoTributario.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE) {
						this.tipotributario = (TipoTributario)this.tipotributarios.toArray()[this.jTableDatosTipoTributario.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				} else {
					if(tipotributario!=null) {
						this.tipotributario = tipotributario;
					} else {
						this.tipotributario = new TipoTributario();
					}
				}

				if(this.isTienePermisosTransaccionLocal && this.permiteMantenimiento(this.tipotributario)) {
					TransaccionLocalBeanSwingJInternalFrame transaccionlocalBeanSwingJInternalFrame=null;

					if(conInicializar) {
						this.jInternalFrameDetalleFormTipoTributario.transaccionlocalBeanSwingJInternalFramePopup=new TransaccionLocalBeanSwingJInternalFrame(false,false,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.SECUNDARIO,false,false,true,false);
						this.jInternalFrameDetalleFormTipoTributario.transaccionlocalBeanSwingJInternalFramePopup.setJInternalFrameParent(this);

						transaccionlocalBeanSwingJInternalFrame=this.jInternalFrameDetalleFormTipoTributario.transaccionlocalBeanSwingJInternalFramePopup;
					} else {
						transaccionlocalBeanSwingJInternalFrame=this.jInternalFrameDetalleFormTipoTributario.transaccionlocalBeanSwingJInternalFrame;
					}

					List<TipoTributario> tipotributarios=new ArrayList<TipoTributario>();
					tipotributarios.add(this.tipotributario);
					if(!esRelacionado) {
						//transaccionlocalBeanSwingJInternalFrame.transaccionlocalSessionBean.setConGuardarRelaciones(false);
						//transaccionlocalBeanSwingJInternalFrame.transaccionlocalSessionBean.setEsGuardarRelacionado(false);
					}

					//DESHABILITA TEMPORALMENTE EVENTOS CHANGE DE TEXTOS,COMBOS,ETC
					transaccionlocalBeanSwingJInternalFrame.estaModoSeleccionar=true;
					this.jInternalFrameDetalleFormTipoTributario.cargarTransaccionLocalBeanSwingJInternalFrame(tipotributarios,this.tipotributario,transaccionlocalBeanSwingJInternalFrame,/*conInicializar,*/transaccionlocalBeanSwingJInternalFrame.transaccionlocalSessionBean.getConGuardarRelaciones(),transaccionlocalBeanSwingJInternalFrame.transaccionlocalSessionBean.getEsGuardarRelacionado());
					transaccionlocalBeanSwingJInternalFrame.estaModoSeleccionar=false;


					if(!esRelacionado) {
						transaccionlocalBeanSwingJInternalFrame.actualizarEstadoPanelsTransaccionLocal("no_relacionado");

						transaccionlocalBeanSwingJInternalFrame.redimensionarTablaDatosConTamanio(TransaccionLocalConstantesFunciones.ITAMANIOFILATABLA + (TransaccionLocalConstantesFunciones.ITAMANIOFILATABLA/2));

						transaccionlocalBeanSwingJInternalFrame.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_REL_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_REL_Y));

						TitledBorder titledBorderTipoTributario=(TitledBorder)this.jScrollPanelDatosTipoTributario.getBorder();
						TitledBorder titledBorderTransaccionLocal=(TitledBorder)transaccionlocalBeanSwingJInternalFrame.jScrollPanelDatosTransaccionLocal.getBorder();

						titledBorderTransaccionLocal.setTitle(titledBorderTipoTributario.getTitle() + " -> Transaccion Local");

						if(!Constantes.CON_VARIAS_VENTANAS) {
							MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,transaccionlocalBeanSwingJInternalFrame);
						}

						transaccionlocalBeanSwingJInternalFrame.setVisible(true);

						this.jDesktopPane.add(transaccionlocalBeanSwingJInternalFrame);

						transaccionlocalBeanSwingJInternalFrame.setSelected(true);
					}

				} else {
					if(!this.tipotributarioSessionBean.getConGuardarRelaciones()) {
						JOptionPane.showMessageDialog(this,"NO TIENE PERMISOS PARA USAR LA FUNCIONALIDAD DE Transaccion Local",Constantes.SERROR,JOptionPane.ERROR_MESSAGE);
					}
				}
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipotributarioLogic.commitNewConnexionToDeep();
				}

			}

			catch(Exception e) {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipotributarioLogic.rollbackNewConnexionToDeep();
				}


				FuncionesSwing.manageException2(this, e,logger,TipoTributarioConstantesFunciones.CLASSNAME);
			} finally { 
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipotributarioLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonFacturaProveedorServicioActionPerformed(ActionEvent evt,int rowIndex,Boolean conInicializar,Boolean esRelacionado,TipoTributario tipotributario) throws Exception {
			try {

				if(this.jInternalFrameDetalleFormTipoTributario==null) {
					this.inicializarFormDetalle();
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipotributarioLogic.getNewConnexionToDeep("");
				}

				int intSelectedRow =rowIndex;

				if(intSelectedRow!=-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tipotributario = (TipoTributario)this.tipotributarioLogic.getTipoTributarios().toArray()[this.jTableDatosTipoTributario.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE) {
						this.tipotributario = (TipoTributario)this.tipotributarios.toArray()[this.jTableDatosTipoTributario.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				} else {
					if(tipotributario!=null) {
						this.tipotributario = tipotributario;
					} else {
						this.tipotributario = new TipoTributario();
					}
				}

				if(this.isTienePermisosFacturaProveedorServicio && this.permiteMantenimiento(this.tipotributario)) {
					FacturaProveedorServicioBeanSwingJInternalFrame facturaproveedorservicioBeanSwingJInternalFrame=null;

					if(conInicializar) {
						this.jInternalFrameDetalleFormTipoTributario.facturaproveedorservicioBeanSwingJInternalFramePopup=new FacturaProveedorServicioBeanSwingJInternalFrame(false,false,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.SECUNDARIO,false,false,true,false);
						this.jInternalFrameDetalleFormTipoTributario.facturaproveedorservicioBeanSwingJInternalFramePopup.setJInternalFrameParent(this);

						facturaproveedorservicioBeanSwingJInternalFrame=this.jInternalFrameDetalleFormTipoTributario.facturaproveedorservicioBeanSwingJInternalFramePopup;
					} else {
						facturaproveedorservicioBeanSwingJInternalFrame=this.jInternalFrameDetalleFormTipoTributario.facturaproveedorservicioBeanSwingJInternalFrame;
					}

					List<TipoTributario> tipotributarios=new ArrayList<TipoTributario>();
					tipotributarios.add(this.tipotributario);
					if(!esRelacionado) {
						//facturaproveedorservicioBeanSwingJInternalFrame.facturaproveedorservicioSessionBean.setConGuardarRelaciones(false);
						//facturaproveedorservicioBeanSwingJInternalFrame.facturaproveedorservicioSessionBean.setEsGuardarRelacionado(false);
					}

					//DESHABILITA TEMPORALMENTE EVENTOS CHANGE DE TEXTOS,COMBOS,ETC
					facturaproveedorservicioBeanSwingJInternalFrame.estaModoSeleccionar=true;
					this.jInternalFrameDetalleFormTipoTributario.cargarFacturaProveedorServicioBeanSwingJInternalFrame(tipotributarios,this.tipotributario,facturaproveedorservicioBeanSwingJInternalFrame,/*conInicializar,*/facturaproveedorservicioBeanSwingJInternalFrame.facturaproveedorservicioSessionBean.getConGuardarRelaciones(),facturaproveedorservicioBeanSwingJInternalFrame.facturaproveedorservicioSessionBean.getEsGuardarRelacionado());
					facturaproveedorservicioBeanSwingJInternalFrame.estaModoSeleccionar=false;


					if(!esRelacionado) {
						facturaproveedorservicioBeanSwingJInternalFrame.actualizarEstadoPanelsFacturaProveedorServicio("no_relacionado");

						facturaproveedorservicioBeanSwingJInternalFrame.redimensionarTablaDatosConTamanio(FacturaProveedorServicioConstantesFunciones.ITAMANIOFILATABLA + (FacturaProveedorServicioConstantesFunciones.ITAMANIOFILATABLA/2));

						facturaproveedorservicioBeanSwingJInternalFrame.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_REL_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_REL_Y));

						TitledBorder titledBorderTipoTributario=(TitledBorder)this.jScrollPanelDatosTipoTributario.getBorder();
						TitledBorder titledBorderFacturaProveedorServicio=(TitledBorder)facturaproveedorservicioBeanSwingJInternalFrame.jScrollPanelDatosFacturaProveedorServicio.getBorder();

						titledBorderFacturaProveedorServicio.setTitle(titledBorderTipoTributario.getTitle() + " -> Factura Proveedor");

						if(!Constantes.CON_VARIAS_VENTANAS) {
							MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,facturaproveedorservicioBeanSwingJInternalFrame);
						}

						facturaproveedorservicioBeanSwingJInternalFrame.setVisible(true);

						this.jDesktopPane.add(facturaproveedorservicioBeanSwingJInternalFrame);

						facturaproveedorservicioBeanSwingJInternalFrame.setSelected(true);
					}

				} else {
					if(!this.tipotributarioSessionBean.getConGuardarRelaciones()) {
						JOptionPane.showMessageDialog(this,"NO TIENE PERMISOS PARA USAR LA FUNCIONALIDAD DE Factura Proveedor",Constantes.SERROR,JOptionPane.ERROR_MESSAGE);
					}
				}
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipotributarioLogic.commitNewConnexionToDeep();
				}

			}

			catch(Exception e) {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipotributarioLogic.rollbackNewConnexionToDeep();
				}


				FuncionesSwing.manageException2(this, e,logger,TipoTributarioConstantesFunciones.CLASSNAME);
			} finally { 
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipotributarioLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonDefinicionActionPerformed(ActionEvent evt,int rowIndex,Boolean conInicializar,Boolean esRelacionado,TipoTributario tipotributario) throws Exception {
			try {

				if(this.jInternalFrameDetalleFormTipoTributario==null) {
					this.inicializarFormDetalle();
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipotributarioLogic.getNewConnexionToDeep("");
				}

				int intSelectedRow =rowIndex;

				if(intSelectedRow!=-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tipotributario = (TipoTributario)this.tipotributarioLogic.getTipoTributarios().toArray()[this.jTableDatosTipoTributario.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE) {
						this.tipotributario = (TipoTributario)this.tipotributarios.toArray()[this.jTableDatosTipoTributario.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				} else {
					if(tipotributario!=null) {
						this.tipotributario = tipotributario;
					} else {
						this.tipotributario = new TipoTributario();
					}
				}

				if(this.isTienePermisosDefinicion && this.permiteMantenimiento(this.tipotributario)) {
					DefinicionBeanSwingJInternalFrame definicionBeanSwingJInternalFrame=null;

					if(conInicializar) {
						this.jInternalFrameDetalleFormTipoTributario.definicionBeanSwingJInternalFramePopup=new DefinicionBeanSwingJInternalFrame(false,false,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.SECUNDARIO,false,false,true,false);
						this.jInternalFrameDetalleFormTipoTributario.definicionBeanSwingJInternalFramePopup.setJInternalFrameParent(this);

						definicionBeanSwingJInternalFrame=this.jInternalFrameDetalleFormTipoTributario.definicionBeanSwingJInternalFramePopup;
					} else {
						definicionBeanSwingJInternalFrame=this.jInternalFrameDetalleFormTipoTributario.definicionBeanSwingJInternalFrame;
					}

					List<TipoTributario> tipotributarios=new ArrayList<TipoTributario>();
					tipotributarios.add(this.tipotributario);
					if(!esRelacionado) {
						//definicionBeanSwingJInternalFrame.definicionSessionBean.setConGuardarRelaciones(false);
						//definicionBeanSwingJInternalFrame.definicionSessionBean.setEsGuardarRelacionado(false);
					}

					//DESHABILITA TEMPORALMENTE EVENTOS CHANGE DE TEXTOS,COMBOS,ETC
					definicionBeanSwingJInternalFrame.estaModoSeleccionar=true;
					this.jInternalFrameDetalleFormTipoTributario.cargarDefinicionBeanSwingJInternalFrame(tipotributarios,this.tipotributario,definicionBeanSwingJInternalFrame,/*conInicializar,*/definicionBeanSwingJInternalFrame.definicionSessionBean.getConGuardarRelaciones(),definicionBeanSwingJInternalFrame.definicionSessionBean.getEsGuardarRelacionado());
					definicionBeanSwingJInternalFrame.estaModoSeleccionar=false;


					if(!esRelacionado) {
						definicionBeanSwingJInternalFrame.actualizarEstadoPanelsDefinicion("no_relacionado");

						definicionBeanSwingJInternalFrame.redimensionarTablaDatosConTamanio(DefinicionConstantesFunciones.ITAMANIOFILATABLA + (DefinicionConstantesFunciones.ITAMANIOFILATABLA/2));

						definicionBeanSwingJInternalFrame.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_REL_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_REL_Y));

						TitledBorder titledBorderTipoTributario=(TitledBorder)this.jScrollPanelDatosTipoTributario.getBorder();
						TitledBorder titledBorderDefinicion=(TitledBorder)definicionBeanSwingJInternalFrame.jScrollPanelDatosDefinicion.getBorder();

						titledBorderDefinicion.setTitle(titledBorderTipoTributario.getTitle() + " -> Definicion");

						if(!Constantes.CON_VARIAS_VENTANAS) {
							MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,definicionBeanSwingJInternalFrame);
						}

						definicionBeanSwingJInternalFrame.setVisible(true);

						this.jDesktopPane.add(definicionBeanSwingJInternalFrame);

						definicionBeanSwingJInternalFrame.setSelected(true);
					}

				} else {
					if(!this.tipotributarioSessionBean.getConGuardarRelaciones()) {
						JOptionPane.showMessageDialog(this,"NO TIENE PERMISOS PARA USAR LA FUNCIONALIDAD DE Definicion",Constantes.SERROR,JOptionPane.ERROR_MESSAGE);
					}
				}
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipotributarioLogic.commitNewConnexionToDeep();
				}

			}

			catch(Exception e) {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipotributarioLogic.rollbackNewConnexionToDeep();
				}


				FuncionesSwing.manageException2(this, e,logger,TipoTributarioConstantesFunciones.CLASSNAME);
			} finally { 
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipotributarioLogic.closeNewConnexionToDeep();
				}

			}
		}

	
	
	
	public void refrescarBindingTabla(Boolean blnSoloTabla) {
	}
	
	public void inicializarActualizarBindingBotonesManualTipoTributario(Boolean esSetControles) {						
		if(esSetControles) {
			this.jButtonNuevoTipoTributario.setVisible((this.isVisibilidadCeldaNuevoTipoTributario && this.isPermisoNuevoTipoTributario));			
			this.jButtonDuplicarTipoTributario.setVisible((this.isVisibilidadCeldaDuplicarTipoTributario && this.isPermisoDuplicarTipoTributario));			
			this.jButtonCopiarTipoTributario.setVisible((this.isVisibilidadCeldaCopiarTipoTributario && this.isPermisoCopiarTipoTributario));
			this.jButtonVerFormTipoTributario.setVisible((this.isVisibilidadCeldaVerFormTipoTributario && this.isPermisoVerFormTipoTributario));
			
			this.jButtonAbrirOrderByTipoTributario.setVisible((this.isVisibilidadCeldaOrdenTipoTributario && this.isPermisoOrdenTipoTributario));			
			
			this.jButtonNuevoRelacionesTipoTributario.setVisible((this.isVisibilidadCeldaNuevoRelacionesTipoTributario && this.isPermisoNuevoTipoTributario));			
			this.jButtonNuevoGuardarCambiosTipoTributario.setVisible((this.isVisibilidadCeldaNuevoTipoTributario && this.isPermisoNuevoTipoTributario && this.isPermisoGuardarCambiosTipoTributario));
			
			if(this.jInternalFrameDetalleFormTipoTributario!=null) {
			this.jInternalFrameDetalleFormTipoTributario.jButtonModificarTipoTributario.setVisible((this.isVisibilidadCeldaModificarTipoTributario && this.isPermisoActualizarTipoTributario));	
			this.jInternalFrameDetalleFormTipoTributario.jButtonActualizarTipoTributario.setVisible((this.isVisibilidadCeldaActualizarTipoTributario && this.isPermisoActualizarTipoTributario));	
			this.jInternalFrameDetalleFormTipoTributario.jButtonEliminarTipoTributario.setVisible((this.isVisibilidadCeldaEliminarTipoTributario && this.isPermisoEliminarTipoTributario));
			this.jInternalFrameDetalleFormTipoTributario.jButtonCancelarTipoTributario.setVisible(this.isVisibilidadCeldaCancelarTipoTributario);							
			this.jInternalFrameDetalleFormTipoTributario.jButtonGuardarCambiosTipoTributario.setVisible((this.isVisibilidadCeldaGuardarTipoTributario && this.isPermisoGuardarCambiosTipoTributario));			
			
			}
						
			this.jButtonGuardarCambiosTablaTipoTributario.setVisible((this.isVisibilidadCeldaGuardarCambiosTipoTributario && this.isPermisoGuardarCambiosTipoTributario));							
			
			//TOOLBAR
			
			this.jButtonNuevoToolBarTipoTributario.setVisible((this.isVisibilidadCeldaNuevoTipoTributario && this.isPermisoNuevoTipoTributario));						
			this.jButtonDuplicarToolBarTipoTributario.setVisible((this.isVisibilidadCeldaDuplicarTipoTributario && this.isPermisoDuplicarTipoTributario));						
			this.jButtonCopiarToolBarTipoTributario.setVisible((this.isVisibilidadCeldaCopiarTipoTributario && this.isPermisoCopiarTipoTributario));			
			this.jButtonVerFormToolBarTipoTributario.setVisible((this.isVisibilidadCeldaVerFormTipoTributario && this.isPermisoVerFormTipoTributario));			
			this.jButtonAbrirOrderByToolBarTipoTributario.setVisible((this.isVisibilidadCeldaOrdenTipoTributario && this.isPermisoOrdenTipoTributario));
			this.jButtonNuevoRelacionesToolBarTipoTributario.setVisible((this.isVisibilidadCeldaNuevoRelacionesTipoTributario && this.isPermisoNuevoTipoTributario));			
			this.jButtonNuevoGuardarCambiosToolBarTipoTributario.setVisible((this.isVisibilidadCeldaNuevoTipoTributario && this.isPermisoNuevoTipoTributario && this.isPermisoGuardarCambiosTipoTributario));			
			
			if(this.jInternalFrameDetalleFormTipoTributario!=null) {
			this.jInternalFrameDetalleFormTipoTributario.jButtonModificarToolBarTipoTributario.setVisible((this.isVisibilidadCeldaModificarTipoTributario && this.isPermisoActualizarTipoTributario));	
			this.jInternalFrameDetalleFormTipoTributario.jButtonActualizarToolBarTipoTributario.setVisible((this.isVisibilidadCeldaActualizarTipoTributario  && this.isPermisoActualizarTipoTributario));	
			this.jInternalFrameDetalleFormTipoTributario.jButtonEliminarToolBarTipoTributario.setVisible((this.isVisibilidadCeldaEliminarTipoTributario && this.isPermisoEliminarTipoTributario));
			this.jInternalFrameDetalleFormTipoTributario.jButtonCancelarToolBarTipoTributario.setVisible(this.isVisibilidadCeldaCancelarTipoTributario);				
			this.jInternalFrameDetalleFormTipoTributario.jButtonGuardarCambiosToolBarTipoTributario.setVisible((this.isVisibilidadCeldaGuardarTipoTributario && this.isPermisoGuardarCambiosTipoTributario));									
			}
			
			this.jButtonGuardarCambiosTablaToolBarTipoTributario.setVisible((this.isVisibilidadCeldaGuardarCambiosTipoTributario && this.isPermisoGuardarCambiosTipoTributario));									
			
			//TOOLBAR
			
			//MENUS
			
			this.jMenuItemNuevoTipoTributario.setVisible((this.isVisibilidadCeldaNuevoTipoTributario && this.isPermisoNuevoTipoTributario));			
			this.jMenuItemDuplicarTipoTributario.setVisible((this.isVisibilidadCeldaDuplicarTipoTributario && this.isPermisoDuplicarTipoTributario));			
			this.jMenuItemCopiarTipoTributario.setVisible((this.isVisibilidadCeldaCopiarTipoTributario && this.isPermisoCopiarTipoTributario));			
			this.jMenuItemVerFormTipoTributario.setVisible((this.isVisibilidadCeldaVerFormTipoTributario && this.isPermisoVerFormTipoTributario));			
			this.jMenuItemAbrirOrderByTipoTributario.setVisible((this.isVisibilidadCeldaOrdenTipoTributario && this.isPermisoOrdenTipoTributario));			
			//this.jMenuItemMostrarOcultarTipoTributario.setVisible((this.isVisibilidadCeldaOrdenTipoTributario && this.isPermisoOrdenTipoTributario));
			this.jMenuItemDetalleAbrirOrderByTipoTributario.setVisible((this.isVisibilidadCeldaOrdenTipoTributario && this.isPermisoOrdenTipoTributario));			
			//this.jMenuItemDetalleMostrarOcultarTipoTributario.setVisible((this.isVisibilidadCeldaOrdenTipoTributario && this.isPermisoOrdenTipoTributario));			
			this.jMenuItemNuevoRelacionesTipoTributario.setVisible((this.isVisibilidadCeldaNuevoRelacionesTipoTributario && this.isPermisoNuevoTipoTributario));			
			this.jMenuItemNuevoGuardarCambiosTipoTributario.setVisible((this.isVisibilidadCeldaNuevoTipoTributario && this.isPermisoNuevoTipoTributario && this.isPermisoGuardarCambiosTipoTributario));									
			
			if(this.jInternalFrameDetalleFormTipoTributario!=null) {
			this.jInternalFrameDetalleFormTipoTributario.jMenuItemModificarTipoTributario.setVisible((this.isVisibilidadCeldaModificarTipoTributario && this.isPermisoActualizarTipoTributario));	
			this.jInternalFrameDetalleFormTipoTributario.jMenuItemActualizarTipoTributario.setVisible((this.isVisibilidadCeldaActualizarTipoTributario && this.isPermisoActualizarTipoTributario));	
			this.jInternalFrameDetalleFormTipoTributario.jMenuItemEliminarTipoTributario.setVisible((this.isVisibilidadCeldaEliminarTipoTributario && this.isPermisoEliminarTipoTributario));
			this.jInternalFrameDetalleFormTipoTributario.jMenuItemCancelarTipoTributario.setVisible(this.isVisibilidadCeldaCancelarTipoTributario);				
			}
			
			this.jMenuItemGuardarCambiosTipoTributario.setVisible((this.isVisibilidadCeldaGuardarTipoTributario && this.isPermisoGuardarCambiosTipoTributario));						
			this.jMenuItemGuardarCambiosTablaTipoTributario.setVisible((this.isVisibilidadCeldaGuardarCambiosTipoTributario && this.isPermisoGuardarCambiosTipoTributario));						
			
			//MENUS
			
		} else {
			this.isVisibilidadCeldaNuevoTipoTributario=this.jButtonNuevoTipoTributario.isVisible();
			this.isVisibilidadCeldaDuplicarTipoTributario=this.jButtonDuplicarTipoTributario.isVisible();
			this.isVisibilidadCeldaCopiarTipoTributario=this.jButtonCopiarTipoTributario.isVisible();
			this.isVisibilidadCeldaVerFormTipoTributario=this.jButtonVerFormTipoTributario.isVisible();
			
			this.isVisibilidadCeldaOrdenTipoTributario=this.jButtonAbrirOrderByTipoTributario.isVisible();			
			
			this.isVisibilidadCeldaNuevoRelacionesTipoTributario=this.jButtonNuevoRelacionesTipoTributario.isVisible();
			this.isVisibilidadCeldaModificarTipoTributario=this.jButtonModificarTipoTributario.isVisible();
			
			if(this.jInternalFrameDetalleFormTipoTributario!=null) {
			this.isVisibilidadCeldaActualizarTipoTributario=this.jInternalFrameDetalleFormTipoTributario.jButtonActualizarTipoTributario.isVisible();
			this.isVisibilidadCeldaEliminarTipoTributario=this.jInternalFrameDetalleFormTipoTributario.jButtonEliminarTipoTributario.isVisible();
			this.isVisibilidadCeldaCancelarTipoTributario=this.jInternalFrameDetalleFormTipoTributario.jButtonCancelarTipoTributario.isVisible();
			this.isVisibilidadCeldaGuardarTipoTributario=this.jInternalFrameDetalleFormTipoTributario.jButtonGuardarCambiosTipoTributario.isVisible();			
			}
			
			this.isVisibilidadCeldaGuardarCambiosTipoTributario=this.jButtonGuardarCambiosTablaTipoTributario.isVisible();
			
			//TOOLBAR
			
			this.isVisibilidadCeldaNuevoTipoTributario=this.jButtonNuevoToolBarTipoTributario.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesTipoTributario=this.jButtonNuevoRelacionesToolBarTipoTributario.isVisible();
			
			if(this.jInternalFrameDetalleFormTipoTributario!=null) {
			this.isVisibilidadCeldaModificarTipoTributario=this.jInternalFrameDetalleFormTipoTributario.jButtonModificarToolBarTipoTributario.isVisible();
			this.isVisibilidadCeldaActualizarTipoTributario=this.jInternalFrameDetalleFormTipoTributario.jButtonActualizarToolBarTipoTributario.isVisible();
			this.isVisibilidadCeldaEliminarTipoTributario=this.jInternalFrameDetalleFormTipoTributario.jButtonEliminarToolBarTipoTributario.isVisible();
			this.isVisibilidadCeldaCancelarTipoTributario=this.jInternalFrameDetalleFormTipoTributario.jButtonCancelarToolBarTipoTributario.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarTipoTributario=this.jButtonGuardarCambiosToolBarTipoTributario.isVisible();
			this.isVisibilidadCeldaGuardarCambiosTipoTributario=this.jButtonGuardarCambiosTablaToolBarTipoTributario.isVisible();						
			
			//TOOLBAR
			
			//MENUS
			
			this.isVisibilidadCeldaNuevoTipoTributario=this.jMenuItemNuevoTipoTributario.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesTipoTributario=this.jMenuItemNuevoRelacionesTipoTributario.isVisible();
			
			if(this.jInternalFrameDetalleFormTipoTributario!=null) {
			this.isVisibilidadCeldaModificarTipoTributario=this.jInternalFrameDetalleFormTipoTributario.jMenuItemModificarTipoTributario.isVisible();
			this.isVisibilidadCeldaActualizarTipoTributario=this.jInternalFrameDetalleFormTipoTributario.jMenuItemActualizarTipoTributario.isVisible();
			this.isVisibilidadCeldaEliminarTipoTributario=this.jInternalFrameDetalleFormTipoTributario.jMenuItemEliminarTipoTributario.isVisible();
			this.isVisibilidadCeldaCancelarTipoTributario=this.jInternalFrameDetalleFormTipoTributario.jMenuItemCancelarTipoTributario.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarTipoTributario=this.jMenuItemGuardarCambiosTipoTributario.isVisible();
			this.isVisibilidadCeldaGuardarCambiosTipoTributario=this.jMenuItemGuardarCambiosTablaTipoTributario.isVisible();						
			
			//MENUS
		}
	}
	
	public void inicializarActualizarBindingBotonesTipoTributario(Boolean esInicializar) {
		if(TipoTributarioJInternalFrame.ISBINDING_MANUAL) {			
			if(this.tipotributarioSessionBean.getConGuardarRelaciones()) {
				//if(this.tipotributarioSessionBean.getEsGuardarRelacionado()) {
				
				this.actualizarEstadoCeldasBotonesConGuardarRelacionesTipoTributario();
			}
			
			this.inicializarActualizarBindingBotonesManualTipoTributario(true);
			
		} else {	
		}
	}		
	
	public void inicializarActualizarBindingBotonesPermisosManualTipoTributario() {
		this.jButtonNuevoTipoTributario.setVisible(this.isPermisoNuevoTipoTributario);			
		this.jButtonDuplicarTipoTributario.setVisible(this.isPermisoDuplicarTipoTributario);			
		this.jButtonCopiarTipoTributario.setVisible(this.isPermisoCopiarTipoTributario);			
		this.jButtonVerFormTipoTributario.setVisible(this.isPermisoVerFormTipoTributario);			
		
		this.jButtonAbrirOrderByTipoTributario.setVisible(this.isPermisoOrdenTipoTributario);					
		
		this.jButtonNuevoRelacionesTipoTributario.setVisible(this.isPermisoNuevoTipoTributario);			
		
		if(this.jInternalFrameDetalleFormTipoTributario!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoTributario.jButtonModificarTipoTributario.setVisible(this.isPermisoActualizarTipoTributario);	
			this.jInternalFrameDetalleFormTipoTributario.jButtonActualizarTipoTributario.setVisible(this.isPermisoActualizarTipoTributario);	
			this.jInternalFrameDetalleFormTipoTributario.jButtonEliminarTipoTributario.setVisible(this.isPermisoEliminarTipoTributario);
			this.jInternalFrameDetalleFormTipoTributario.jButtonCancelarTipoTributario.setVisible(this.isVisibilidadCeldaCancelarTipoTributario);						
			this.jInternalFrameDetalleFormTipoTributario.jButtonGuardarCambiosTipoTributario.setVisible(this.isPermisoGuardarCambiosTipoTributario);							
		}
		
		this.jButtonGuardarCambiosTablaTipoTributario.setVisible(this.isPermisoActualizarTipoTributario);
	}
	
	public void inicializarActualizarBindingBotonesPermisosManualFormDetalleTipoTributario() {
		this.jInternalFrameDetalleFormTipoTributario.jButtonModificarTipoTributario.setVisible(this.isPermisoActualizarTipoTributario);	
		this.jInternalFrameDetalleFormTipoTributario.jButtonActualizarTipoTributario.setVisible(this.isPermisoActualizarTipoTributario);	
		this.jInternalFrameDetalleFormTipoTributario.jButtonEliminarTipoTributario.setVisible(this.isPermisoEliminarTipoTributario);
		this.jInternalFrameDetalleFormTipoTributario.jButtonCancelarTipoTributario.setVisible(this.isVisibilidadCeldaCancelarTipoTributario);							
		this.jInternalFrameDetalleFormTipoTributario.jButtonGuardarCambiosTipoTributario.setVisible((this.isVisibilidadCeldaGuardarTipoTributario && this.isPermisoGuardarCambiosTipoTributario));			
	}
	
	public void inicializarActualizarBindingBotonesPermisosTipoTributario() {
		if(TipoTributarioJInternalFrame.ISBINDING_MANUAL) {
			this.inicializarActualizarBindingBotonesPermisosManualTipoTributario();
		} else {
		}
	}
	
	
	public void refrescarBindingBotonesTipoTributario() {
	}
	
	public void jTableDatosTipoTributarioListSelectionListener(javax.swing.event.ListSelectionEvent evt) throws Exception { 
		try {
			this.seleccionarTipoTributario(null,evt,-1);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoTributarioConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonidTipoTributarioBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipotributarioLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosTipoTributario.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualTipoTributario(this.gettipotributario(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoTributario(this.tipotributario);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tipotributario =(TipoTributario) this.tipotributarioLogic.getTipoTributarios().toArray()[this.jTableDatosTipoTributario.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.tipotributario =(TipoTributario) this.tipotributarios.toArray()[this.jTableDatosTipoTributario.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.tipotributario==null) {
						this.tipotributario = new TipoTributario();
					}

					this.setVariablesFormularioToObjetoActualTipoTributario(this.tipotributario,true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoTributario(this.tipotributario);
				}

				if(this.tipotributario.getId()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id = "+this.tipotributario.getId().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingTipoTributario(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipotributarioLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipotributarioLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,TipoTributarioConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipotributarioLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_paisTipoTributarioUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipotributarioLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisopais=true;

			idTienePermisopais=this.tienePermisosUsuarioEnPaginaWebTipoTributario(PaisConstantesFunciones.CLASSNAME);

			if(idTienePermisopais) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosTipoTributario.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosTipoTributario.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosTipoTributario.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipotributario =(TipoTributario) this.tipotributarioLogic.getTipoTributarios().toArray()[this.jTableDatosTipoTributario.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.tipotributario =(TipoTributario) this.tipotributarios.toArray()[this.jTableDatosTipoTributario.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualTipoTributario(this.gettipotributario(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysTipoTributario(this.tipotributario);

				this.paisBeanSwingJInternalFrame=new PaisBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.paisBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.paisBeanSwingJInternalFrame.getPaisLogic().setConnexion(this.tipotributarioLogic.getConnexion());

				if(this.tipotributario.getid_pais()!=null) {
					this.paisBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.paisBeanSwingJInternalFrame.setIdActual(this.tipotributario.getid_pais());
					this.paisBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.paisBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.paisBeanSwingJInternalFrame.inicializarActualizarBindingTablaPais();
				}

				JInternalFrameBase jinternalFrame =this.paisBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderTipoTributario=(TitledBorder)this.jScrollPanelDatosTipoTributario.getBorder();
				TitledBorder titledBorderpais=(TitledBorder)this.paisBeanSwingJInternalFrame.jScrollPanelDatosPais.getBorder();

				titledBorderpais.setTitle(titledBorderTipoTributario.getTitle() + " -> Pais");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipotributarioLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipotributarioLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,TipoTributarioConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipotributarioLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_paisTipoTributarioBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipotributarioLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosTipoTributario.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualTipoTributario(this.gettipotributario(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoTributario(this.tipotributario);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tipotributario =(TipoTributario) this.tipotributarioLogic.getTipoTributarios().toArray()[this.jTableDatosTipoTributario.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.tipotributario =(TipoTributario) this.tipotributarios.toArray()[this.jTableDatosTipoTributario.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.tipotributario==null) {
						this.tipotributario = new TipoTributario();
					}

					this.setVariablesFormularioToObjetoActualTipoTributario(this.tipotributario,true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoTributario(this.tipotributario);
				}

				if(this.tipotributario.getid_pais()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_pais = "+this.tipotributario.getid_pais().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingTipoTributario(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipotributarioLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipotributarioLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,TipoTributarioConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipotributarioLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtoncodigoTipoTributarioBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipotributarioLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosTipoTributario.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualTipoTributario(this.gettipotributario(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoTributario(this.tipotributario);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tipotributario =(TipoTributario) this.tipotributarioLogic.getTipoTributarios().toArray()[this.jTableDatosTipoTributario.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.tipotributario =(TipoTributario) this.tipotributarios.toArray()[this.jTableDatosTipoTributario.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.tipotributario==null) {
						this.tipotributario = new TipoTributario();
					}

					this.setVariablesFormularioToObjetoActualTipoTributario(this.tipotributario,true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoTributario(this.tipotributario);
				}

				if(this.tipotributario.getcodigo()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where codigo like '%"+this.tipotributario.getcodigo()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingTipoTributario(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipotributarioLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipotributarioLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,TipoTributarioConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipotributarioLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonnombreTipoTributarioBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipotributarioLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosTipoTributario.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualTipoTributario(this.gettipotributario(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoTributario(this.tipotributario);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tipotributario =(TipoTributario) this.tipotributarioLogic.getTipoTributarios().toArray()[this.jTableDatosTipoTributario.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.tipotributario =(TipoTributario) this.tipotributarios.toArray()[this.jTableDatosTipoTributario.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.tipotributario==null) {
						this.tipotributario = new TipoTributario();
					}

					this.setVariablesFormularioToObjetoActualTipoTributario(this.tipotributario,true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoTributario(this.tipotributario);
				}

				if(this.tipotributario.getnombre()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where nombre like '%"+this.tipotributario.getnombre()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingTipoTributario(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipotributarioLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipotributarioLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,TipoTributarioConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipotributarioLogic.closeNewConnexionToDeep();
				}

			}
		}

	
	
	public void jButtonBusquedaPorCodigoTipoTributarioActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipotributarioLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingTipoTributario(false,false);

			this.getTipoTributariosBusquedaPorCodigo();

			this.inicializarActualizarBindingTipoTributario(false);

			//if(TipoTributarioBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingTipoTributario(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipotributarioLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipotributarioLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,TipoTributarioConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipotributarioLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonBusquedaPorIdTipoTributarioActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipotributarioLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingTipoTributario(false,false);

			this.getTipoTributariosBusquedaPorId();

			this.inicializarActualizarBindingTipoTributario(false);

			//if(TipoTributarioBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingTipoTributario(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipotributarioLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipotributarioLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,TipoTributarioConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipotributarioLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonBusquedaPorNombreTipoTributarioActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipotributarioLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingTipoTributario(false,false);

			this.getTipoTributariosBusquedaPorNombre();

			this.inicializarActualizarBindingTipoTributario(false);

			//if(TipoTributarioBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingTipoTributario(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipotributarioLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipotributarioLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,TipoTributarioConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipotributarioLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdPaisTipoTributarioActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipotributarioLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingTipoTributario(false,false);

			this.getTipoTributariosFK_IdPais();

			this.inicializarActualizarBindingTipoTributario(false);

			//if(TipoTributarioBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingTipoTributario(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipotributarioLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipotributarioLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,TipoTributarioConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipotributarioLogic.closeNewConnexionToDeep();
			}
		}
	}

	
	public void closingInternalFrameTipoTributario() {
		if(this.jInternalFrameDetalleFormTipoTributario!=null) {
		

		if(this.jInternalFrameDetalleFormTipoTributario.transaccionlocalBeanSwingJInternalFrame!=null) {
			this.jInternalFrameDetalleFormTipoTributario.transaccionlocalBeanSwingJInternalFrame.setVisible(false);
			this.jInternalFrameDetalleFormTipoTributario.transaccionlocalBeanSwingJInternalFrame.dispose();
			this.jInternalFrameDetalleFormTipoTributario.transaccionlocalBeanSwingJInternalFrame=null;
		}

		if(this.jInternalFrameDetalleFormTipoTributario.transaccionlocalBeanSwingJInternalFramePopup!=null) {
			this.jInternalFrameDetalleFormTipoTributario.transaccionlocalBeanSwingJInternalFramePopup.setVisible(false);
			this.jInternalFrameDetalleFormTipoTributario.transaccionlocalBeanSwingJInternalFramePopup.dispose();
			this.jInternalFrameDetalleFormTipoTributario.transaccionlocalBeanSwingJInternalFramePopup=null;
		}

		if(this.jInternalFrameDetalleFormTipoTributario.facturaproveedorservicioBeanSwingJInternalFrame!=null) {
			this.jInternalFrameDetalleFormTipoTributario.facturaproveedorservicioBeanSwingJInternalFrame.setVisible(false);
			this.jInternalFrameDetalleFormTipoTributario.facturaproveedorservicioBeanSwingJInternalFrame.dispose();
			this.jInternalFrameDetalleFormTipoTributario.facturaproveedorservicioBeanSwingJInternalFrame=null;
		}

		if(this.jInternalFrameDetalleFormTipoTributario.facturaproveedorservicioBeanSwingJInternalFramePopup!=null) {
			this.jInternalFrameDetalleFormTipoTributario.facturaproveedorservicioBeanSwingJInternalFramePopup.setVisible(false);
			this.jInternalFrameDetalleFormTipoTributario.facturaproveedorservicioBeanSwingJInternalFramePopup.dispose();
			this.jInternalFrameDetalleFormTipoTributario.facturaproveedorservicioBeanSwingJInternalFramePopup=null;
		}

		if(this.jInternalFrameDetalleFormTipoTributario.definicionBeanSwingJInternalFrame!=null) {
			this.jInternalFrameDetalleFormTipoTributario.definicionBeanSwingJInternalFrame.setVisible(false);
			this.jInternalFrameDetalleFormTipoTributario.definicionBeanSwingJInternalFrame.dispose();
			this.jInternalFrameDetalleFormTipoTributario.definicionBeanSwingJInternalFrame=null;
		}

		if(this.jInternalFrameDetalleFormTipoTributario.definicionBeanSwingJInternalFramePopup!=null) {
			this.jInternalFrameDetalleFormTipoTributario.definicionBeanSwingJInternalFramePopup.setVisible(false);
			this.jInternalFrameDetalleFormTipoTributario.definicionBeanSwingJInternalFramePopup.dispose();
			this.jInternalFrameDetalleFormTipoTributario.definicionBeanSwingJInternalFramePopup=null;
		}	
		
		
		}
		
		if(this.jInternalFrameDetalleFormTipoTributario!=null) {
			this.jInternalFrameDetalleFormTipoTributario.setVisible(false);	    			
			this.jInternalFrameDetalleFormTipoTributario.dispose();
			this.jInternalFrameDetalleFormTipoTributario=null;
		}
		
		
		if(this.jInternalFrameReporteDinamicoTipoTributario!=null) {
			this.jInternalFrameReporteDinamicoTipoTributario.setVisible(false);	    			
			this.jInternalFrameReporteDinamicoTipoTributario.dispose();
			this.jInternalFrameReporteDinamicoTipoTributario=null;
		}
		
		if(this.jInternalFrameImportacionTipoTributario!=null) {
			this.jInternalFrameImportacionTipoTributario.setVisible(false);	    			
			this.jInternalFrameImportacionTipoTributario.dispose();
			this.jInternalFrameImportacionTipoTributario=null;
		}		
		
		
		this.setVisible(false);
		this.dispose();
		//this=null;
	}
	
	
	
	public void jButtonActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {			
			this.startProcessTipoTributario();
			
			TipoTributarioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipotributario,new Object(),this.tipotributarioParameterGeneral,this.tipotributarioReturnGeneral);
			
			
			if(sTipo.equals("NuevoTipoTributario")) {
				jButtonNuevoTipoTributarioActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarTipoTributario")) {
				jButtonDuplicarTipoTributarioActionPerformed(evt,false);
			} else if(sTipo.equals("CopiarTipoTributario")) {
				jButtonCopiarTipoTributarioActionPerformed(evt);
			} else if(sTipo.equals("VerFormTipoTributario")) {
				jButtonVerFormTipoTributarioActionPerformed(evt);
			} else if(sTipo.equals("NuevoToolBarTipoTributario")) {
				jButtonNuevoTipoTributarioActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarToolBarTipoTributario")) {
				jButtonDuplicarTipoTributarioActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemNuevoTipoTributario")) {
				jButtonNuevoTipoTributarioActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemDuplicarTipoTributario")) {
				jButtonDuplicarTipoTributarioActionPerformed(evt,false);
			} else if(sTipo.equals("NuevoRelacionesTipoTributario")) {
				jButtonNuevoTipoTributarioActionPerformed(evt,true);
			} else if(sTipo.equals("NuevoRelacionesToolBarTipoTributario")) {
				jButtonNuevoTipoTributarioActionPerformed(evt,true);
			} else if(sTipo.equals("MenuItemNuevoRelacionesTipoTributario")) {
				jButtonNuevoTipoTributarioActionPerformed(evt,true);
			} else if(sTipo.equals("ModificarTipoTributario")) {
				jButtonModificarTipoTributarioActionPerformed(evt);
			} else if(sTipo.equals("ModificarToolBarTipoTributario")) {
				jButtonModificarTipoTributarioActionPerformed(evt);
			} else if(sTipo.equals("MenuItemModificarTipoTributario")) {
				jButtonModificarTipoTributarioActionPerformed(evt);
			} else if(sTipo.equals("ActualizarTipoTributario")) {
				jButtonActualizarTipoTributarioActionPerformed(evt);
			} else if(sTipo.equals("ActualizarToolBarTipoTributario")) {
				jButtonActualizarTipoTributarioActionPerformed(evt);
			} else if(sTipo.equals("MenuItemActualizarTipoTributario")) {
				jButtonActualizarTipoTributarioActionPerformed(evt);
			} else if(sTipo.equals("EliminarTipoTributario")) {
				jButtonEliminarTipoTributarioActionPerformed(evt);
			} else if(sTipo.equals("EliminarToolBarTipoTributario")) {
				jButtonEliminarTipoTributarioActionPerformed(evt);
			} else if(sTipo.equals("MenuItemEliminarTipoTributario")) {
				jButtonEliminarTipoTributarioActionPerformed(evt);
			} else if(sTipo.equals("CancelarTipoTributario")) {
				jButtonCancelarTipoTributarioActionPerformed(evt);
			} else if(sTipo.equals("CancelarToolBarTipoTributario")) {
				jButtonCancelarTipoTributarioActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCancelarTipoTributario")) {
				jButtonCancelarTipoTributarioActionPerformed(evt);
			} else if(sTipo.equals("CerrarTipoTributario")) {
				jButtonCerrarTipoTributarioActionPerformed(evt);
			} else if(sTipo.equals("CerrarToolBarTipoTributario")) {
				jButtonCerrarTipoTributarioActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCerrarTipoTributario")) {
				jButtonCerrarTipoTributarioActionPerformed(evt);
			} else if(sTipo.equals("MostrarOcultarToolBarTipoTributario")) {
				jButtonMostrarOcultarTipoTributarioActionPerformed(evt);
			} else if(sTipo.equals("MenuItemDetalleCerrarTipoTributario")) {
				jButtonCancelarTipoTributarioActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTipoTributario")) {
				jButtonGuardarCambiosTipoTributarioActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosToolBarTipoTributario")) {
				jButtonGuardarCambiosTipoTributarioActionPerformed(evt);
			} else if(sTipo.equals("CopiarToolBarTipoTributario")) {
				jButtonCopiarTipoTributarioActionPerformed(evt);
			} else if(sTipo.equals("VerFormToolBarTipoTributario")) {
				jButtonVerFormTipoTributarioActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosTipoTributario")) {
				jButtonGuardarCambiosTipoTributarioActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCopiarTipoTributario")) {
				jButtonCopiarTipoTributarioActionPerformed(evt);
			} else if(sTipo.equals("MenuItemVerFormTipoTributario")) {
				jButtonVerFormTipoTributarioActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaTipoTributario")) {
				jButtonGuardarCambiosTipoTributarioActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaToolBarTipoTributario")) {
				jButtonGuardarCambiosTipoTributarioActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosTablaTipoTributario")) {
				jButtonGuardarCambiosTipoTributarioActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionTipoTributario")) {
				jButtonRecargarInformacionTipoTributarioActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionToolBarTipoTributario")) {
				jButtonRecargarInformacionTipoTributarioActionPerformed(evt);
			} else if(sTipo.equals("MenuItemRecargarInformacionTipoTributario")) {
				jButtonRecargarInformacionTipoTributarioActionPerformed(evt);
			}
			else if(sTipo.equals("AnterioresTipoTributario")) {
				jButtonAnterioresTipoTributarioActionPerformed(evt);
			} else if(sTipo.equals("AnterioresToolBarTipoTributario")) {
				jButtonAnterioresTipoTributarioActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAnterioreTipoTributario")) {
				jButtonAnterioresTipoTributarioActionPerformed(evt);
			} else if(sTipo.equals("SiguientesTipoTributario")) {
				jButtonSiguientesTipoTributarioActionPerformed(evt);
			} else if(sTipo.equals("SiguientesToolBarTipoTributario")) {
				jButtonSiguientesTipoTributarioActionPerformed(evt);
			} else if(sTipo.equals("MenuItemSiguientesTipoTributario")) {
				jButtonSiguientesTipoTributarioActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAbrirOrderByTipoTributario") || sTipo.equals("MenuItemDetalleAbrirOrderByTipoTributario")) {
				jButtonAbrirOrderByTipoTributarioActionPerformed(evt);
			} else if(sTipo.equals("MenuItemMostrarOcultarTipoTributario") || sTipo.equals("MenuItemDetalleMostrarOcultarTipoTributario")) {
				jButtonMostrarOcultarTipoTributarioActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosTipoTributario")) {
				jButtonNuevoGuardarCambiosTipoTributarioActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosToolBarTipoTributario")) {
				jButtonNuevoGuardarCambiosTipoTributarioActionPerformed(evt);
			} else if(sTipo.equals("MenuItemNuevoGuardarCambiosTipoTributario")) {
				jButtonNuevoGuardarCambiosTipoTributarioActionPerformed(evt);
			} 
			else if(sTipo.equals("CerrarReporteDinamicoTipoTributario")) {
				jButtonCerrarReporteDinamicoTipoTributarioActionPerformed(evt);
			} else if(sTipo.equals("GenerarReporteDinamicoTipoTributario")) {
				jButtonGenerarReporteDinamicoTipoTributarioActionPerformed(evt);
			} else if(sTipo.equals("GenerarExcelReporteDinamicoTipoTributario")) {
				
				jButtonGenerarExcelReporteDinamicoTipoTributarioActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarImportacionTipoTributario")) {
				jButtonCerrarImportacionTipoTributarioActionPerformed(evt);
			} else if(sTipo.equals("GenerarImportacionTipoTributario")) {
				
				jButtonGenerarImportacionTipoTributarioActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirImportacionTipoTributario")) {
				
				jButtonAbrirImportacionTipoTributarioActionPerformed(evt);
				
			} else if(sTipo.equals("TiposAccionesTipoTributario")) {
				jComboBoxTiposAccionesTipoTributarioActionListener(evt,false);
			} else if(sTipo.equals("TiposRelacionesTipoTributario")) {
				jComboBoxTiposRelacionesTipoTributarioActionListener(evt);
			} else if(sTipo.equals("TiposAccionesFormularioTipoTributario")) {
				jComboBoxTiposAccionesTipoTributarioActionListener(evt,true);
			} else if(sTipo.equals("TiposSeleccionarTipoTributario")) {
				
				jComboBoxTiposSeleccionarTipoTributarioActionListener(evt);
				
			} else if(sTipo.equals("ValorCampoGeneralTipoTributario")) {
				jTextFieldValorCampoGeneralTipoTributarioActionListener(evt);
			}
			
			
			else if(sTipo.equals("AbrirOrderByTipoTributario")) {
				jButtonAbrirOrderByTipoTributarioActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirOrderByToolBarTipoTributario")) {
				jButtonAbrirOrderByTipoTributarioActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarOrderByTipoTributario")) {
				jButtonCerrarOrderByTipoTributarioActionPerformed(evt);
			} 
						
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idTipoTributarioBusqueda")) {
				this.jButtonidTipoTributarioBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_paisTipoTributarioUpdate")) {
				this.jButtonid_paisTipoTributarioUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_paisTipoTributarioBusqueda")) {
				this.jButtonid_paisTipoTributarioBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("codigoTipoTributarioBusqueda")) {
				this.jButtoncodigoTipoTributarioBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombreTipoTributarioBusqueda")) {
				this.jButtonnombreTipoTributarioBusquedaActionPerformed(evt);
			}
			
			
			
			
			else if(sTipo.equals("BusquedaPorCodigoTipoTributario")) {
				this.jButtonBusquedaPorCodigoTipoTributarioActionPerformed(evt);
			}
			else if(sTipo.equals("BusquedaPorIdTipoTributario")) {
				this.jButtonBusquedaPorIdTipoTributarioActionPerformed(evt);
			}
			else if(sTipo.equals("BusquedaPorNombreTipoTributario")) {
				this.jButtonBusquedaPorNombreTipoTributarioActionPerformed(evt);
			}
			else if(sTipo.equals("FK_IdPaisTipoTributario")) {
				this.jButtonFK_IdPaisTipoTributarioActionPerformed(evt);
			}
			
			;
			
			
			TipoTributarioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipotributario,new Object(),this.tipotributarioParameterGeneral,this.tipotributarioReturnGeneral);
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoTributarioConstantesFunciones.CLASSNAME);
			
  		} finally {
      		this.finishProcessTipoTributario();
      	}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoTributarioActual();
			
				EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.CONTROL_CHANGE;
				
				Boolean esControlTabla=false;
				Container containerParent=null;
				JTextField jTextField=null;
				
				
				//PARAMETROS LLAMAR FUNCION PARENT
				GeneralEntityParameterGeneral generalEntityParameterGeneral=new GeneralEntityParameterGeneral();			
				Boolean esUsoDesdeHijoLocal=false;
				Boolean conIrServidorAplicacionParent=false;	
				ArrayList<String> arrClasses=new ArrayList<String>();			
				//PARAMETROS LLAMAR FUNCION PARENT_FIN
				
				/*
				if(this.esUsoDesdeHijo) {
					eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
				}
				*/
				
				ArrayList<Classe> classes=new ArrayList<Classe>();
				
				jTextField=(JTextField)evt.getSource();
				
				containerParent=jTextField.getParent();
						
				if(containerParent!=null && containerParent.getClass().equals(JTableMe.class)) {
					esControlTabla=true;
				}
						
				this.esControlTabla=esControlTabla;
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipotributario);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipotributario);
				
				TipoTributarioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipotributario,new Object(),this.tipotributarioParameterGeneral,this.tipotributarioReturnGeneral);
				
				


				
				TipoTributarioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipotributario,new Object(),this.tipotributarioParameterGeneral,this.tipotributarioReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoTributario.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoTributario.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
				}
				
			} catch(Exception e) {
  				FuncionesSwing.manageException2(this, e,logger,TipoTributarioConstantesFunciones.CLASSNAME);
  			}
    }
	
	public Boolean existeCambioValor(ControlTipo controlTipo,String sTipo) throws Exception {
		Boolean existeCambio=true;
		
		try {
			TipoTributario tipotributarioLocal=null;
			
			if(!this.getEsControlTabla()) {
				tipotributarioLocal=this.tipotributario;
			} else {
				tipotributarioLocal=this.tipotributarioAnterior;
			}
			
			if(controlTipo.equals(ControlTipo.TEXTBOX)) {
				


			}
		
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoTributarioConstantesFunciones.CLASSNAME);
  		}
		
		return existeCambio;
	}
	
	public void jTextFieldFocusLostGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl() && this.existeCambioValor(ControlTipo.TEXTBOX,sTipo)) {
				
				EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.CONTROL_CHANGE;
				
				Boolean esControlTabla=false;
				JTextField jTextField=null;
				Container containerParent=null;
				Component componentOpposite=null;
				
				//PARAMETROS LLAMAR FUNCION PARENT
				GeneralEntityParameterGeneral generalEntityParameterGeneral=new GeneralEntityParameterGeneral();			
				Boolean esUsoDesdeHijoLocal=false;
				Boolean conIrServidorAplicacionParent=false;	
				ArrayList<String> arrClasses=new ArrayList<String>();			
				//PARAMETROS LLAMAR FUNCION PARENT_FIN
				
				/*
				if(this.esUsoDesdeHijo) {
					eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
				}
				*/
				
				ArrayList<Classe> classes=new ArrayList<Classe>();
				
				jTextField=(JTextField)evt.getSource();
				
				containerParent=jTextField.getParent();
						
				componentOpposite=evt.getOppositeComponent();
				
				if((containerParent!=null && containerParent.getClass().equals(JTableMe.class))
					|| (componentOpposite!=null && componentOpposite.getClass().equals(JTableMe.class))
				) {					
					esControlTabla=true;
				}
				
				this.esControlTabla=esControlTabla;
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipotributario);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipotributario);
				
				TipoTributarioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipotributario,new Object(),this.tipotributarioParameterGeneral,this.tipotributarioReturnGeneral);
							
				
				


				
				TipoTributarioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipotributario,new Object(),this.tipotributarioParameterGeneral,this.tipotributarioReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoTributario.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoTributario.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoTributarioConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoTributarioActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosTipoTributario.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipotributarioAnterior =(TipoTributario) this.tipotributarioLogic.getTipoTributarios().toArray()[this.jTableDatosTipoTributario.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipotributarioAnterior =(TipoTributario) this.tipotributarios.toArray()[this.jTableDatosTipoTributario.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoTributarioConstantesFunciones.CLASSNAME);
  		}
    }	
	
	//CUANDO SE CAMBIA ALGUN FORMATO(TIPO DE LETRA,NEGRILLA,ETC)
	public void jTextFieldChangedUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			/*
			EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.CONTROL_CHANGE;
			
			//System.out.println("UPDATE");
			
			Boolean esControlTabla=false;
			//JTextField jTextField=null;
			Container containerParent=null;
			Component componentOpposite=null;
			
			if(this.esUsoDesdeHijo) {
				eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
			}
			
			TipoTributarioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipotributario,new Object(),this.tipotributarioParameterGeneral,this.tipotributarioReturnGeneral);
			
			ArrayList<Classe> classes=new ArrayList<Classe>();
			
			//jTextField=(JTextField)evt.getSource();
			
			containerParent=jTextField.getParent();
					
			componentOpposite=null;//evt.getOppositeComponent();
			
			if((containerParent!=null && containerParent.getClass().equals(JTableMe.class))
				|| (componentOpposite!=null && componentOpposite.getClass().equals(JTableMe.class))
			) {					
				esControlTabla=true;
			}
			
			this.esControlTabla=esControlTabla;
			
			


			
			TipoTributarioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipotributario,new Object(),this.tipotributarioParameterGeneral,this.tipotributarioReturnGeneral);
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoTributarioConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE QUITA ALGUN CARACTER
	public void jTextFieldRemoveUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoTributarioConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE INGRESA ALGUN CARACTER
	public void jTextFieldInsertUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoTributarioConstantesFunciones.CLASSNAME);
  		}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jFormattedTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoTributarioActual();
				
				EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.CONTROL_CHANGE;
				
				Boolean esControlTabla=false;
				Container containerParent=null;
				Container containerParentAux=null;
				JFormattedTextField JFormattedTextField=null;
				Component componentOpposite=null;
				
				//PARAMETROS LLAMAR FUNCION PARENT
				GeneralEntityParameterGeneral generalEntityParameterGeneral=new GeneralEntityParameterGeneral();			
				Boolean esUsoDesdeHijoLocal=false;
				Boolean conIrServidorAplicacionParent=false;	
				ArrayList<String> arrClasses=new ArrayList<String>();			
				//PARAMETROS LLAMAR FUNCION PARENT_FIN
				
				/*
				if(this.esUsoDesdeHijo) {
					eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
				}
				*/
				ArrayList<Classe> classes=new ArrayList<Classe>();
				
				JFormattedTextField=(JFormattedTextField)evt.getSource();
				
				containerParentAux=JFormattedTextField.getParent();
				
				if(containerParentAux!=null && containerParentAux.getClass().equals(JDateChooser.class)) {
					containerParent=containerParentAux.getParent();
				}
				
				componentOpposite=null;//evt.getOppositeComponent();
				
				if((containerParent!=null && containerParent.getClass().equals(JTableMe.class))
					|| (componentOpposite!=null && componentOpposite.getClass().equals(JTableMe.class))
				) {					
					esControlTabla=true;
				}
				
				this.esControlTabla=esControlTabla;
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipotributario);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipotributario);
				
				TipoTributarioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipotributario,new Object(),this.tipotributarioParameterGeneral,this.tipotributarioReturnGeneral);
								
						
				


				
				TipoTributarioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipotributario,new Object(),this.tipotributarioParameterGeneral,this.tipotributarioReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoTributario.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoTributario.class.getName(),sTipo,"DATE",esControlTabla,conIrServidorAplicacionParent,
							id,JFormattedTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoTributarioConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jFormattedTextFieldFocusLostGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl() && this.existeCambioValor(ControlTipo.TEXTBOX,sTipo)) {
				EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.CONTROL_CHANGE;
				
				Boolean esControlTabla=false;
				JTextField jTextField=null;
				Container containerParent=null;
				Container containerParentAux=null;
				Component componentOpposite=null;
				
				
				//PARAMETROS LLAMAR FUNCION PARENT
				GeneralEntityParameterGeneral generalEntityParameterGeneral=new GeneralEntityParameterGeneral();			
				Boolean esUsoDesdeHijoLocal=false;
				Boolean conIrServidorAplicacionParent=false;	
				ArrayList<String> arrClasses=new ArrayList<String>();			
				//PARAMETROS LLAMAR FUNCION PARENT_FIN
				
				/*
				if(this.esUsoDesdeHijo) {
					eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
				}
				*/
				
				ArrayList<Classe> classes=new ArrayList<Classe>();
				
				jTextField=(JTextField)evt.getSource();
				
				containerParentAux=jTextField.getParent();
						
				if(containerParentAux!=null && containerParentAux.getClass().equals(JDateChooser.class)) {
					containerParent=containerParentAux.getParent();
				}
				
				componentOpposite=evt.getOppositeComponent();
				
				if((containerParent!=null && containerParent.getClass().equals(JTableMe.class))
					|| (componentOpposite!=null && componentOpposite.getClass().equals(JTableMe.class))
				) {					
					esControlTabla=true;
				}
				
				this.esControlTabla=esControlTabla;
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipotributario);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipotributario);
				
				TipoTributarioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipotributario,new Object(),this.tipotributarioParameterGeneral,this.tipotributarioReturnGeneral);
								
				
				


				
				TipoTributarioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipotributario,new Object(),this.tipotributarioParameterGeneral,this.tipotributarioReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoTributario.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoTributario.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoTributarioConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jFormattedTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoTributarioActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosTipoTributario.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipotributarioAnterior =(TipoTributario) this.tipotributarioLogic.getTipoTributarios().toArray()[this.jTableDatosTipoTributario.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipotributarioAnterior =(TipoTributario) this.tipotributarios.toArray()[this.jTableDatosTipoTributario.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoTributarioConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusLostGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl() && this.existeCambioValor(ControlTipo.DATE,sTipo)) {
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipotributario);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipotributario);
			}	
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoTributarioConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoTributarioActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosTipoTributario.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipotributarioAnterior =(TipoTributario) this.tipotributarioLogic.getTipoTributarios().toArray()[this.jTableDatosTipoTributario.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipotributarioAnterior =(TipoTributario) this.tipotributarios.toArray()[this.jTableDatosTipoTributario.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoTributarioConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoTributarioActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.tipotributario);
			
			this.actualizarInformacion("INFO_PADRE",false,this.tipotributario);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoTributarioConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jTextAreaFocusLostGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl() && this.existeCambioValor(ControlTipo.TEXTAREA,sTipo)) {
				EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.CONTROL_CHANGE;
				
				Boolean esControlTabla=false;
				JTextArea jTextArea=null;
				Container containerParent=null;
				Component componentOpposite=null;
				
				//PARAMETROS LLAMAR FUNCION PARENT
				GeneralEntityParameterGeneral generalEntityParameterGeneral=new GeneralEntityParameterGeneral();			
				Boolean esUsoDesdeHijoLocal=false;
				Boolean conIrServidorAplicacionParent=false;	
				ArrayList<String> arrClasses=new ArrayList<String>();			
				//PARAMETROS LLAMAR FUNCION PARENT_FIN
				
				/*
				if(this.esUsoDesdeHijo) {
					eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
				}
				*/
				
				ArrayList<Classe> classes=new ArrayList<Classe>();
				
				jTextArea=(JTextArea)evt.getSource();
				
				containerParent=jTextArea.getParent();
				componentOpposite=evt.getOppositeComponent();
				
				if((containerParent!=null && containerParent.getClass().equals(JTableMe.class))
					|| (componentOpposite!=null && componentOpposite.getClass().equals(JTableMe.class))
				) {
					esControlTabla=true;
				}
				
				this.esControlTabla=esControlTabla;
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipotributario);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipotributario);
				
				TipoTributarioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipotributario,new Object(),this.tipotributarioParameterGeneral,this.tipotributarioReturnGeneral);
							
				
				


				
				TipoTributarioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipotributario,new Object(),this.tipotributarioParameterGeneral,this.tipotributarioReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoTributario.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoTributario.class.getName(),sTipo,"TEXTAREA",esControlTabla,conIrServidorAplicacionParent,
							id,jTextArea, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoTributarioConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoTributarioActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosTipoTributario.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tipotributarioAnterior =(TipoTributario) this.tipotributarioLogic.getTipoTributarios().toArray()[this.jTableDatosTipoTributario.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.tipotributarioAnterior =(TipoTributario) this.tipotributarios.toArray()[this.jTableDatosTipoTributario.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoTributarioConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaChangedUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			/*
			EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.CONTROL_CHANGE;
			
			//System.out.println("UPDATE");
			
			Boolean esControlTabla=false;
			//JTextArea jTextArea=null;
			Container containerParent=null;
			Component componentOpposite=null;
			
			if(this.esUsoDesdeHijo) {
				eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
			}
			
			TipoTributarioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipotributario,new Object(),this.tipotributarioParameterGeneral,this.tipotributarioReturnGeneral);
			
			ArrayList<Classe> classes=new ArrayList<Classe>();
			
			//jTextArea=(JTextArea)evt.getSource();
			
			containerParent=jTextArea.getParent();
			componentOpposite=null;//evt.getOppositeComponent();
			
			if((containerParent!=null && containerParent.getClass().equals(JTableMe.class))
				|| (componentOpposite!=null && componentOpposite.getClass().equals(JTableMe.class))
			) {
				esControlTabla=true;
			}
			
			this.esControlTabla=esControlTabla;
			
			


			
			TipoTributarioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipotributario,new Object(),this.tipotributarioParameterGeneral,this.tipotributarioReturnGeneral);
			
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoTributarioConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaRemoveUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoTributarioConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaInsertUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoTributarioConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jTextAreaActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoTributarioActual();
			
			this.actualizarInformacion("EVENTO_CONTROL",false,this.tipotributario);
			
			this.actualizarInformacion("INFO_PADRE",false,this.tipotributario);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoTributarioConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jLabelFocusLostGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.CONTROL_CHANGE;
				
				Boolean esControlTabla=false;
				JLabel jLabel=null;
				Container containerParent=null;
				Component componentOpposite=null;
				
				
				//PARAMETROS LLAMAR FUNCION PARENT
				GeneralEntityParameterGeneral generalEntityParameterGeneral=new GeneralEntityParameterGeneral();			
				Boolean esUsoDesdeHijoLocal=false;
				Boolean conIrServidorAplicacionParent=false;	
				ArrayList<String> arrClasses=new ArrayList<String>();			
				//PARAMETROS LLAMAR FUNCION PARENT_FIN
				
				
				/*
				if(this.esUsoDesdeHijo) {
					eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
				}
				*/
				
				ArrayList<Classe> classes=new ArrayList<Classe>();
				
				jLabel=(JLabel)evt.getSource();
				
				containerParent=jLabel.getParent();
						
				componentOpposite=evt.getOppositeComponent();
				
				if((containerParent!=null && containerParent.getClass().equals(JTableMe.class))
					|| (componentOpposite!=null && componentOpposite.getClass().equals(JTableMe.class))
				) {					
					esControlTabla=true;
				}
				
				this.esControlTabla=esControlTabla;
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipotributario);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipotributario);
				
				TipoTributarioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipotributario,new Object(),this.tipotributarioParameterGeneral,this.tipotributarioReturnGeneral);
								
				
				


				
				TipoTributarioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipotributario,new Object(),this.tipotributarioParameterGeneral,this.tipotributarioReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoTributario.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoTributario.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jLabel, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoTributarioConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jLabelFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoTributarioActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosTipoTributario.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipotributarioAnterior =(TipoTributario) this.tipotributarioLogic.getTipoTributarios().toArray()[this.jTableDatosTipoTributario.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipotributarioAnterior =(TipoTributario) this.tipotributarios.toArray()[this.jTableDatosTipoTributario.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoTributarioConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jLabelActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoTributarioActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.tipotributario);
			
			this.actualizarInformacion("INFO_PADRE",false,this.tipotributario);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoTributarioConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxItemListenerGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoTributarioActual();
				
				EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.CONTROL_CHANGE;
				
				Boolean esControlTabla=false;
				JCheckBox jCheckBox=null;
				Container containerParent=null;
				Component componentOpposite=null;
				
							
				//PARAMETROS LLAMAR FUNCION PARENT
				GeneralEntityParameterGeneral generalEntityParameterGeneral=new GeneralEntityParameterGeneral();			
				Boolean esUsoDesdeHijoLocal=false;
				Boolean conIrServidorAplicacionParent=false;	
				ArrayList<String> arrClasses=new ArrayList<String>();			
				//PARAMETROS LLAMAR FUNCION PARENT_FIN
				
				
				/*
				if(this.esUsoDesdeHijo) {
					eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
				}
				*/
				
				ArrayList<Classe> classes=new ArrayList<Classe>();
				
				jCheckBox=(JCheckBox)evt.getSource();
				
				containerParent=jCheckBox.getParent();
						
				componentOpposite=null;//evt.getOppositeComponent();
				
				if((containerParent!=null && containerParent.getClass().equals(JTableMe.class))
					|| (componentOpposite!=null && componentOpposite.getClass().equals(JTableMe.class))
				) {					
					esControlTabla=true;
				}
				
				this.esControlTabla=esControlTabla;
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipotributario);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipotributario);
				
				TipoTributarioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipotributario,new Object(),this.tipotributarioParameterGeneral,this.tipotributarioReturnGeneral);
												
				
				if(sTipo.equals("SeleccionarTodosTipoTributario")) {
					jCheckBoxSeleccionarTodosTipoTributarioItemListener(evt);
				
				} else if(sTipo.equals("SeleccionadosTipoTributario")) {
					jCheckBoxSeleccionadosTipoTributarioItemListener(evt);
				
				} else if(sTipo.equals("NuevoToolBarTipoTributario")) {
					
				}
				
				


				
				
				TipoTributarioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipotributario,new Object(),this.tipotributarioParameterGeneral,this.tipotributarioReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoTributario.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoTributario.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoTributarioConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxFocusLostGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl() && this.existeCambioValor(ControlTipo.CHECKBOX,sTipo)) {
				EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.CONTROL_CHANGE;
				
				Boolean esControlTabla=false;
				JCheckBox jCheckBox=null;
				Container containerParent=null;
				Component componentOpposite=null;
				
				
				//PARAMETROS LLAMAR FUNCION PARENT
				GeneralEntityParameterGeneral generalEntityParameterGeneral=new GeneralEntityParameterGeneral();			
				Boolean esUsoDesdeHijoLocal=false;
				Boolean conIrServidorAplicacionParent=false;	
				ArrayList<String> arrClasses=new ArrayList<String>();			
				//PARAMETROS LLAMAR FUNCION PARENT_FIN
				
				
				ArrayList<Classe> classes=new ArrayList<Classe>();
				
				jCheckBox=(JCheckBox)evt.getSource();
				
				containerParent=jCheckBox.getParent();
						
				componentOpposite=evt.getOppositeComponent();
				
				if((containerParent!=null && containerParent.getClass().equals(JTableMe.class))
					|| (componentOpposite!=null && componentOpposite.getClass().equals(JTableMe.class))
				) {					
					esControlTabla=true;
				}
				
				this.esControlTabla=esControlTabla;
				
				
				/*
				if(this.esUsoDesdeHijo) {
					eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
				}
				*/
				
				//this.actualizarInformacion("EVENTO_CONTROL",false,this.tipotributario);
				
				//this.actualizarInformacion("INFO_PADRE",false,this.tipotributario);
				
				TipoTributarioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipotributario,new Object(),this.tipotributarioParameterGeneral,this.tipotributarioReturnGeneral);
												
				
				


				
				
				TipoTributarioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipotributario,new Object(),this.tipotributarioParameterGeneral,this.tipotributarioReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoTributario.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoTributario.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoTributarioConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoTributarioActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosTipoTributario.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tipotributarioAnterior =(TipoTributario) this.tipotributarioLogic.getTipoTributarios().toArray()[this.jTableDatosTipoTributario.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.tipotributarioAnterior =(TipoTributario) this.tipotributarios.toArray()[this.jTableDatosTipoTributario.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoTributarioConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoTributarioActual();
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipotributario);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipotributario);
				
				TipoTributarioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipotributario,new Object(),this.tipotributarioParameterGeneral,this.tipotributarioReturnGeneral);
				
				
				TipoTributarioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipotributario,new Object(),this.tipotributarioParameterGeneral,this.tipotributarioReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoTributarioConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO SE UTILIZA, SE USA EL DE ABAJO, IGUAL SE DEJA EL CODIGO COMO RESPALDO Y ES CASI IGUAL
	//ERROR:SI SE USA,AL HACER CLIC EN EL MISMO ELEMENTO O EJECUTAR SELECTEDITEM, SIEMPRE SE EJECUTA COMO SI ESCOGIERA OTRO ELEMENTO(NO DEBERIA)
	//@SuppressWarnings("rawtypes")
	public void jComboBoxActionPerformedGeneral(String sTipo,ActionEvent evt) {		
		try {
			/*		
			EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.CONTROL_CHANGE;
			
			if(this.esUsoDesdeHijo) {
				eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
			}
			
			Container containerParent=null;
			Component componentOpposite=null;
			Boolean esControlTabla=false;
				
			ArrayList<Classe> classes=new ArrayList<Classe>();
			
			TipoTributarioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.tipotributario,new Object(),this.tipotributarioParameterGeneral,this.tipotributarioReturnGeneral);
			JComboBox jComboBoxGenerico=null;						
			
			if(evt.getSource().getClass().equals(JComboBox.class)
				|| evt.getSource().getClass().equals(JComboBoxMe.class)) {
					
				jComboBoxGenerico=(JComboBox)evt.getSource();
				
				containerParent=jComboBoxGenerico.getParent();
				
				componentOpposite=null;//evt.getOppositeComponent();
				
				if((containerParent!=null && containerParent.getClass().equals(JTableMe.class))
					|| (componentOpposite!=null && componentOpposite.getClass().equals(JTableMe.class))
				) {					
					esControlTabla=true;
				}
				
				this.esControlTabla=esControlTabla;
			}
			
			String sFinalQueryCombo="";
			
			


			
			TipoTributarioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipotributario,new Object(),this.tipotributarioParameterGeneral,this.tipotributarioReturnGeneral);
			*/						
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoTributarioConstantesFunciones.CLASSNAME);
  		}		
    }
	
	@SuppressWarnings("rawtypes")
	public void jComboBoxItemStateChangedGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if (evt.getStateChange() == ItemEvent.SELECTED && this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoTributarioActual();
			
				//PARAMETROS LLAMAR FUNCION PARENT
				GeneralEntityParameterGeneral generalEntityParameterGeneral=new GeneralEntityParameterGeneral();			
				Boolean esUsoDesdeHijoLocal=false;
				Boolean conIrServidorAplicacionParent=false;	
				ArrayList<String> arrClasses=new ArrayList<String>();			
				//PARAMETROS LLAMAR FUNCION PARENT_FIN
			
			
				EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.CONTROL_CHANGE;
				
				/*
				if(this.esUsoDesdeHijo) {
					eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
				}
				*/
				
				Container containerParent=null;
				Component componentOpposite=null;
				Boolean esControlTabla=false;
				
				ArrayList<Classe> classes=new ArrayList<Classe>();
				
				JComboBox jComboBoxGenerico=null;						
				
				if(evt.getSource().getClass().equals(JComboBox.class)
					|| evt.getSource().getClass().equals(JComboBoxMe.class)) {
						
					jComboBoxGenerico=(JComboBox)evt.getSource();
					
					containerParent=jComboBoxGenerico.getParent();
					
					componentOpposite=null;//evt.getOppositeComponent();
					
					if((containerParent!=null && containerParent.getClass().equals(JTableMe.class))
					|| (componentOpposite!=null && componentOpposite.getClass().equals(JTableMe.class))
					) {					
						esControlTabla=true;
					}		
					
					this.esControlTabla=esControlTabla;
				}
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipotributario);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipotributario);
				
				TipoTributarioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.tipotributario,new Object(),this.tipotributarioParameterGeneral,this.tipotributarioReturnGeneral);
				
				
				String sFinalQueryCombo="";
				
				


				
				TipoTributarioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipotributario,new Object(),this.tipotributarioParameterGeneral,this.tipotributarioReturnGeneral);
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoTributario.class.getName());
								
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoTributario.class.getName(),sTipo,"COMBOBOX",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoTributarioConstantesFunciones.CLASSNAME);
  		}
    }
	
	//@SuppressWarnings("rawtypes")
	public void jComboBoxFocusLostGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		//MANEJADO EN ITEMLISTENER
		/*
		try {
			if(this.permiteManejarEventosControl()) {
				EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.CONTROL_CHANGE;
				
				
				//if(this.esUsoDesdeHijo) {
				//	eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
				//}
				
				
				Container containerParent=null;
				Component componentOpposite=null;
				Boolean esControlTabla=false;
				
				ArrayList<Classe> classes=new ArrayList<Classe>();
				
				//PARAMETROS LLAMAR FUNCION PARENT
				GeneralEntityParameterGeneral generalEntityParameterGeneral=new GeneralEntityParameterGeneral();			
				Boolean esUsoDesdeHijoLocal=false;
				Boolean conIrServidorAplicacionParent=false;	
				ArrayList<String> arrClasses=new ArrayList<String>();			
				//PARAMETROS LLAMAR FUNCION PARENT_FIN
			
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipotributario);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipotributario);
				
				TipoTributarioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.tipotributario,new Object(),this.tipotributarioParameterGeneral,this.tipotributarioReturnGeneral);
				JComboBox jComboBoxGenerico=null;						
				
				if(evt.getSource().getClass().equals(JComboBox.class)
					|| evt.getSource().getClass().equals(JComboBoxMe.class)) {
						
					jComboBoxGenerico=(JComboBox)evt.getSource();
					
					containerParent=jComboBoxGenerico.getParent();
					
					componentOpposite=evt.getOppositeComponent();
					
					if((containerParent!=null && containerParent.getClass().equals(JTableMe.class))
					|| (componentOpposite!=null && componentOpposite.getClass().equals(JTableMe.class))
					) {					
						esControlTabla=true;
					}
					
					this.esControlTabla=esControlTabla;
				}
				
				String sFinalQueryCombo="";
				
				


				
				TipoTributarioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipotributario,new Object(),this.tipotributarioParameterGeneral,this.tipotributarioReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoTributario.class.getName());
				
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoTributario.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoTributarioConstantesFunciones.CLASSNAME);
  		}
		
		*/
    }
	
	public void jComboBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoTributarioActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosTipoTributario.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipotributarioAnterior =(TipoTributario) this.tipotributarioLogic.getTipoTributarios().toArray()[this.jTableDatosTipoTributario.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipotributarioAnterior =(TipoTributario) this.tipotributarios.toArray()[this.jTableDatosTipoTributario.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoTributarioConstantesFunciones.CLASSNAME);
  		}
    }		
	
	public void tableValueChangedGeneral(String sTipo,ListSelectionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				TipoTributarioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipotributario,new Object(),this.tipotributarioParameterGeneral,this.tipotributarioReturnGeneral);
				
				if(sTipo.equals("TableDatosSeleccionarTipoTributario")) {
					//BYDAN_DESHABILITADO
					//try {jTableDatosTipoTributarioListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
					
					//SOLO CUANDO MOUSE ES SOLTADO
					if (!evt.getValueIsAdjusting()) {
						//SELECCIONA FILA A OBJETO ACTUAL
						Integer intSelectedRow = this.jTableDatosTipoTributario.getSelectedRow();
						
						if(intSelectedRow!=null && intSelectedRow>-1) {
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								this.tipotributario =(TipoTributario) this.tipotributarioLogic.getTipoTributarios().toArray()[this.jTableDatosTipoTributario.convertRowIndexToModel(intSelectedRow)];
							} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
								this.tipotributario =(TipoTributario) this.tipotributarios.toArray()[this.jTableDatosTipoTributario.convertRowIndexToModel(intSelectedRow)];
							}
							//ARCHITECTURE
							
							//System.out.println(this.tipotributario);
						}
					}
					
				} else if(sTipo.equals("jButtonCancelarTipoTributario")) {
				
				}
				
				TipoTributarioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipotributario,new Object(),this.tipotributarioParameterGeneral,this.tipotributarioReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoTributarioConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void tableMouseAdapterGeneral(String sTipo,MouseEvent evt) { 	  
		try {
			TipoTributarioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.tipotributario,new Object(),this.tipotributarioParameterGeneral,this.tipotributarioReturnGeneral);
			
			if(sTipo.equals("DatosSeleccionarTipoTributario")) {
				if (evt.getClickCount() == 2) {
					jButtonIdActionPerformed(null,jTableDatosTipoTributario.getSelectedRow(),false,false);
				}	
			} else if(sTipo.equals("jButtonCancelarTipoTributario")) {
			
			}
			
			TipoTributarioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.tipotributario,new Object(),this.tipotributarioParameterGeneral,this.tipotributarioReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoTributarioConstantesFunciones.CLASSNAME);
  		}
    }
	
	;
	
	public void jButtonActionPerformedTecladoGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			this.startProcessTipoTributario();
			
			TipoTributarioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipotributario,new Object(),this.tipotributarioParameterGeneral,this.tipotributarioReturnGeneral);
			
			if(sTipo.equals("NuevoTipoTributario")) {
				jButtonNuevoTipoTributarioActionPerformed(evt,false);
				
			} else if(sTipo.equals("DuplicarTipoTributario")) {
				jButtonDuplicarTipoTributarioActionPerformed(evt,false);
				
			} else if(sTipo.equals("CopiarTipoTributario")) {
				jButtonCopiarTipoTributarioActionPerformed(evt);
				
			} else if(sTipo.equals("VerFormTipoTributario")) {
				jButtonVerFormTipoTributarioActionPerformed(evt);
				
			} else if(sTipo.equals("NuevoRelacionesTipoTributario")) {
				jButtonNuevoTipoTributarioActionPerformed(evt,true);
				
			} else if(sTipo.equals("ModificarTipoTributario")) {
				jButtonModificarTipoTributarioActionPerformed(evt);
				
			} else if(sTipo.equals("ActualizarTipoTributario")) {
				jButtonActualizarTipoTributarioActionPerformed(evt);
				
			} else if(sTipo.equals("EliminarTipoTributario")) {
				jButtonEliminarTipoTributarioActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosTablaTipoTributario")) {
				jButtonGuardarCambiosTipoTributarioActionPerformed(evt);
				
			} else if(sTipo.equals("CancelarTipoTributario")) {
				jButtonCancelarTipoTributarioActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarTipoTributario")) {
				jButtonCerrarTipoTributarioActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosTipoTributario")) {
				jButtonGuardarCambiosTipoTributarioActionPerformed(evt);
			
			} else if(sTipo.equals("NuevoGuardarCambiosTipoTributario")) {
				jButtonNuevoGuardarCambiosTipoTributarioActionPerformed(evt);
			
			} else if(sTipo.equals("AbrirOrderByTipoTributario")) {
				jButtonAbrirOrderByTipoTributarioActionPerformed(evt);
			
			} else if(sTipo.equals("RecargarInformacionTipoTributario")) {
				jButtonRecargarInformacionTipoTributarioActionPerformed(evt);
			
			} else if(sTipo.equals("AnterioresTipoTributario")) {
				jButtonAnterioresTipoTributarioActionPerformed(evt);			
			
			}  else if(sTipo.equals("SiguientesTipoTributario")) {
				jButtonSiguientesTipoTributarioActionPerformed(evt);			
			} 
			
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idTipoTributarioBusqueda")) {
				this.jButtonidTipoTributarioBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_paisTipoTributarioUpdate")) {
				this.jButtonid_paisTipoTributarioUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_paisTipoTributarioBusqueda")) {
				this.jButtonid_paisTipoTributarioBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("codigoTipoTributarioBusqueda")) {
				this.jButtoncodigoTipoTributarioBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombreTipoTributarioBusqueda")) {
				this.jButtonnombreTipoTributarioBusquedaActionPerformed(evt);
			}
			
			TipoTributarioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipotributario,new Object(),this.tipotributarioParameterGeneral,this.tipotributarioReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoTributarioConstantesFunciones.CLASSNAME);
			
  		}  finally {
      		this.finishProcessTipoTributario();
      	}
    }
	
	public void internalFrameClosingInternalFrameGeneral(String sTipo,InternalFrameEvent evt) { 	  
		try {
			TipoTributarioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.tipotributario,new Object(),this.tipotributarioParameterGeneral,this.tipotributarioReturnGeneral);
			
			if(sTipo.equals("CloseInternalFrameTipoTributario")) {
				closingInternalFrameTipoTributario();
				
			} else if(sTipo.equals("jButtonCancelarTipoTributario")) {
				JInternalFrameBase jInternalFrameDetalleFormTipoTributario = (JInternalFrameBase)evt.getSource();
	            	
	            TipoTributarioBeanSwingJInternalFrame jInternalFrameParent=(TipoTributarioBeanSwingJInternalFrame)jInternalFrameDetalleFormTipoTributario.getjInternalFrameParent();
	            
				jInternalFrameParent.jButtonCancelarTipoTributarioActionPerformed(null);
			}
			
			TipoTributarioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.tipotributario,new Object(),this.tipotributarioParameterGeneral,this.tipotributarioReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoTributarioConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void recargarFormTipoTributario(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion) throws Exception {
		this.recargarFormTipoTributario(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,false);
	}
	
	public void recargarFormTipoTributario(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion,Boolean esControlTabla) throws Exception {
		if(this.permiteRecargarForm && this.permiteMantenimiento(this.tipotributario)) {
			if(!esControlTabla) {
				if(TipoTributarioJInternalFrame.ISBINDING_MANUAL_TABLA) {			
					this.setVariablesFormularioToObjetoActualTipoTributario(this.tipotributario,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoTributario(this.tipotributario);			
				}
				
				if(this.tipotributarioSessionBean.getEstaModoGuardarRelaciones()) {
					this.setVariablesFormularioRelacionesToObjetoActualTipoTributario(this.tipotributario,classes);				
				}
			
				if(conIrServidorAplicacion) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {						
						this.tipotributarioReturnGeneral=tipotributarioLogic.procesarEventosTipoTributariosWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.tipotributarioLogic.getTipoTributarios(),this.tipotributario,this.tipotributarioParameterGeneral,this.isEsNuevoTipoTributario,classes);//this.tipotributarioLogic.getTipoTributario()//sTipoGeneral
									
					} else if(Constantes.ISUSAEJBREMOTE) {
									
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE
					
					//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					//this.setVariablesObjetoReturnGeneralToBeanTipoTributario(this.tipotributarioReturnGeneral,this.tipotributarioBean,false);
						
					//ACTUALIZA VARIABLES RELACIONES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					if(this.tipotributarioSessionBean.getEstaModoGuardarRelaciones()) {
						//this.setVariablesRelacionesObjetoReturnGeneralToBeanTipoTributario(classes,this.tipotributarioReturnGeneral,this.tipotributarioBean,false);
					}
						
					if(this.tipotributarioReturnGeneral.getConRecargarPropiedades()) {
						//INICIALIZA VARIABLES COMBOS NORMALES (FK)
						this.setVariablesObjetoActualToFormularioForeignKeyTipoTributario(this.tipotributarioReturnGeneral.getTipoTributario());
							
						//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
						this.setVariablesObjetoActualToFormularioTipoTributario(this.tipotributarioReturnGeneral.getTipoTributario());	
					}
						
					if(this.tipotributarioReturnGeneral.getConRecargarRelaciones()) {
						//INICIALIZA VARIABLES RELACIONES A FORMULARIO
						this.setVariablesRelacionesObjetoActualToFormularioTipoTributario(this.tipotributarioReturnGeneral.getTipoTributario(),classes);//this.tipotributarioBean);	
					}									
					
				} else {				
					//INICIALIZA VARIABLES RELACIONES A FORMULARIO
					this.setVariablesRelacionesObjetoActualToFormularioTipoTributario(this.tipotributario,classes);//this.tipotributarioBean);									
				}
			
				if(TipoTributarioJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesFormularioToObjetoActualTipoTributario(this.tipotributario,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoTributario(this.tipotributario);				
				}
				
			} else {
				
				if(((controlTipo.equals(ControlTipo.TEXTBOX) || controlTipo.equals(ControlTipo.DATE)
					|| controlTipo.equals(ControlTipo.TEXTAREA) || controlTipo.equals(ControlTipo.COMBOBOX)
					)				
					&& eventoTipo.equals(EventoTipo.CHANGE)
					)
					
					|| (controlTipo.equals(ControlTipo.CHECKBOX) && eventoTipo.equals(EventoTipo.CLIC))
					
				) { // && sTipoGeneral.equals("TEXTBOX")
					
					if(this.tipotributarioAnterior!=null) {
						this.tipotributario=this.tipotributarioAnterior;
					}
				}
				
				if(conIrServidorAplicacion) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {						
						this.tipotributarioReturnGeneral=tipotributarioLogic.procesarEventosTipoTributariosWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.tipotributarioLogic.getTipoTributarios(),this.tipotributario,this.tipotributarioParameterGeneral,this.isEsNuevoTipoTributario,classes);//this.tipotributarioLogic.getTipoTributario()//sTipoGeneral
									
					} else if(Constantes.ISUSAEJBREMOTE) {
									
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.tipotributarioSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.tipotributarioSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(this.tipotributarioReturnGeneral.getTipoTributario(),tipotributarioLogic.getTipoTributarios());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(this.tipotributarioReturnGeneral.getTipoTributario(),this.tipotributarios);
				}
				//ARCHITECTURE
				
				//this.jTableDatosTipoTributario.repaint();
				
				//((AbstractTableModel) this.jTableDatosTipoTributario.getModel()).fireTableDataChanged();
				
				this.actualizarVisualTableDatosTipoTributario();
			}
		}
	}
	
	public void actualizarVisualTableDatosTipoTributario() throws Exception {
		
		TipoTributarioModel tipotributarioModel=(TipoTributarioModel)this.jTableDatosTipoTributario.getModel();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tipotributarioModel.tipotributarios=this.tipotributarioLogic.getTipoTributarios();
		
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
			tipotributarioModel.tipotributarios=this.tipotributarios;
		}
		
		
		((TipoTributarioModel) this.jTableDatosTipoTributario.getModel()).fireTableDataChanged();
	}
	
	public void actualizarVisualTableDatosEventosVistaTipoTributario() throws Exception {
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.actualizarLista(this.gettipotributarioAnterior(),this.tipotributarioLogic.getTipoTributarios());
					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			this.actualizarLista(this.gettipotributarioAnterior(),this.tipotributarios);
		}
		//ARCHITECTURE
						
		this.actualizarFilaTotales();
						
		this.actualizarVisualTableDatosTipoTributario();	
	}
	
	public void setVariablesRelacionesObjetoActualToFormularioTipoTributario(TipoTributario tipotributario,ArrayList<Classe> classes) throws Exception { 
		try {
			
			for(Classe clas:classes) {
				if(clas.clas.equals(TransaccionLocal.class)) {
					this.jInternalFrameDetalleFormTipoTributario.transaccionlocalBeanSwingJInternalFrame.transaccionlocalLogic.setTransaccionLocals(tipotributario.getTransaccionLocals());
					this.jInternalFrameDetalleFormTipoTributario.transaccionlocalBeanSwingJInternalFrame.inicializarActualizarBindingTablaTransaccionLocal(false);
					break;
				}
			}
			for(Classe clas:classes) {
				if(clas.clas.equals(FacturaProveedorServicio.class)) {
					this.jInternalFrameDetalleFormTipoTributario.facturaproveedorservicioBeanSwingJInternalFrame.facturaproveedorservicioLogic.setFacturaProveedorServicios(tipotributario.getFacturaProveedorServicios());
					this.jInternalFrameDetalleFormTipoTributario.facturaproveedorservicioBeanSwingJInternalFrame.inicializarActualizarBindingTablaFacturaProveedorServicio(false);
					break;
				}
			}
			for(Classe clas:classes) {
				if(clas.clas.equals(Definicion.class)) {
					this.jInternalFrameDetalleFormTipoTributario.definicionBeanSwingJInternalFrame.definicionLogic.setDefinicions(tipotributario.getDefinicions());
					this.jInternalFrameDetalleFormTipoTributario.definicionBeanSwingJInternalFrame.inicializarActualizarBindingTablaDefinicion(false);
					break;
				}
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoTributarioConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setEventoParentGeneral(Boolean esUsoDesdeHijo,String sDominio,String sDominioTipo,String sTipo,String sTipoGeneral,Boolean esControlTabla,Boolean conIrServidorAplicacion,
						Long id,Component control, EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,ArrayList<String> arrClasses,
						Object evt,GeneralEntityParameterReturnGeneral generalEntityParameterGeneral,Object otro) { 	  
		try {
			
			if(this.permiteManejarEventosControl()) {
				
				//BASE COPIADO DESDE TEXTFIELLOSTFOCUS
				
				//EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
				Boolean conTodasRelaciones=false;
				
				this.esUsoDesdeHijo=esUsoDesdeHijo;
										
				TipoTributarioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.tipotributario,new Object(),generalEntityParameterGeneral,this.tipotributarioReturnGeneral);
				
				ArrayList<Classe> classes=new ArrayList<Classe>();
				
				for(String sClasse:arrClasses) {
					if(sClasse.equals("TODOS")) {
						conTodasRelaciones=true;
						break;
					}
				}
				
				if(this.tipotributarioSessionBean.getConGuardarRelaciones()) {
					if(conTodasRelaciones) {
						classes=TipoTributarioConstantesFunciones.getClassesRelationshipsOfTipoTributario(new ArrayList<Classe>(),DeepLoadType.NONE);
					} else {
						classes=TipoTributarioConstantesFunciones.getClassesRelationshipsFromStringsOfTipoTributario(arrClasses,DeepLoadType.NONE);
					}
				}
	
				this.classesActual=new ArrayList<Classe>();
				this.classesActual.addAll(classes);
	
				this.recargarFormTipoTributario(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,esControlTabla);
										
				TipoTributarioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.tipotributario,new Object(),generalEntityParameterGeneral,this.tipotributarioReturnGeneral);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoTributarioConstantesFunciones.CLASSNAME);
  		}
    }
	
	/*
	public void setVariablesRelacionesObjetoBeanActualToFormularioTipoTributario(TipoTributarioBean tipotributarioBean) throws Exception { 
		try {
			
			for(Classe clas:classes) {
				if(clas.clas.equals(TransaccionLocal.class)) {
					this.jInternalFrameDetalleFormTipoTributario.transaccionlocalBeanSwingJInternalFrame.transaccionlocalLogic.setTransaccionLocals(tipotributario.getTransaccionLocals());
					this.jInternalFrameDetalleFormTipoTributario.transaccionlocalBeanSwingJInternalFrame.inicializarActualizarBindingTablaTransaccionLocal(false);
					break;
				}
			}
			for(Classe clas:classes) {
				if(clas.clas.equals(FacturaProveedorServicio.class)) {
					this.jInternalFrameDetalleFormTipoTributario.facturaproveedorservicioBeanSwingJInternalFrame.facturaproveedorservicioLogic.setFacturaProveedorServicios(tipotributario.getFacturaProveedorServicios());
					this.jInternalFrameDetalleFormTipoTributario.facturaproveedorservicioBeanSwingJInternalFrame.inicializarActualizarBindingTablaFacturaProveedorServicio(false);
					break;
				}
			}
			for(Classe clas:classes) {
				if(clas.clas.equals(Definicion.class)) {
					this.jInternalFrameDetalleFormTipoTributario.definicionBeanSwingJInternalFrame.definicionLogic.setDefinicions(tipotributario.getDefinicions());
					this.jInternalFrameDetalleFormTipoTributario.definicionBeanSwingJInternalFrame.inicializarActualizarBindingTablaDefinicion(false);
					break;
				}
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoTributarioConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesRelacionesObjetoReturnGeneralToBeanTipoTributario(ArrayList<Classe> classes,TipoTributarioReturnGeneral tipotributarioReturnGeneral,TipoTributarioBean tipotributarioBean,Boolean conDefault) throws Exception {
		
			this.tipotributarioBean.setTransaccionLocals(tipotributarioReturnGeneral.getTipoTributario().getTransaccionLocals());
			this.tipotributarioBean.setFacturaProveedorServicios(tipotributarioReturnGeneral.getTipoTributario().getFacturaProveedorServicios());
			this.tipotributarioBean.setDefinicions(tipotributarioReturnGeneral.getTipoTributario().getDefinicions());
	}
	*/
	
	public void setVariablesFormularioRelacionesToObjetoActualTipoTributario(TipoTributario tipotributario,ArrayList<Classe> classes) throws Exception {
		
			for(Classe clas:classes) {
				if(clas.clas.equals(TransaccionLocal.class)) {
					tipotributario.setTransaccionLocals(this.jInternalFrameDetalleFormTipoTributario.transaccionlocalBeanSwingJInternalFrame.transaccionlocalLogic.getTransaccionLocals());
					break;
				}
			}
			for(Classe clas:classes) {
				if(clas.clas.equals(FacturaProveedorServicio.class)) {
					tipotributario.setFacturaProveedorServicios(this.jInternalFrameDetalleFormTipoTributario.facturaproveedorservicioBeanSwingJInternalFrame.facturaproveedorservicioLogic.getFacturaProveedorServicios());
					break;
				}
			}
			for(Classe clas:classes) {
				if(clas.clas.equals(Definicion.class)) {
					tipotributario.setDefinicions(this.jInternalFrameDetalleFormTipoTributario.definicionBeanSwingJInternalFrame.definicionLogic.getDefinicions());
					break;
				}
			}
	}
	
	public Boolean permiteManejarEventosControl() {
		Boolean permite=true;				
		
		if(this.estaModoNuevo || this.estaModoSeleccionar || this.estaModoEliminarGuardarCambios) {
			permite=false;
			
		} 
		
		//NO DEBE MEZCLARSE CONCEPTOS
		/*	
		if(!paraTabla && !this.permiteMantenimiento(this.tipotributario)) {
			System.out.println("ERROR:EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES");
				
			//JOptionPane.showMessageDialog(this,"EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES","EVENTO",JOptionPane.ERROR_MESSAGE);			
		}
		*/
		
		return permite;
	}
	
	public void inicializarFormDetalle() throws Exception {
		
		this.jInternalFrameDetalleFormTipoTributario = new TipoTributarioDetalleFormJInternalFrame(jDesktopPane,this.tipotributarioSessionBean.getConGuardarRelaciones(),this.tipotributarioSessionBean.getEsGuardarRelacionado(),this.cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		this.jDesktopPane.add(this.jInternalFrameDetalleFormTipoTributario);
		this.jInternalFrameDetalleFormTipoTributario.setVisible(false);
		this.jInternalFrameDetalleFormTipoTributario.setSelected(false);						
		
		this.jInternalFrameDetalleFormTipoTributario.setJInternalFrameParent(this);
		
		this.jInternalFrameDetalleFormTipoTributario.tipotributarioLogic=this.tipotributarioLogic;
		
		this.cargarCombosFrameForeignKeyTipoTributario("Formulario");
		
		this.inicializarActualizarBindingBotonesPermisosManualFormDetalleTipoTributario();
		this.inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleTipoTributario();
		
		this.initActionsFormDetalle();		
		
		this.initActionsCombosTodosForeignKeyTipoTributario("Formulario");
		
		//TALVEZ conSetVariablesGlobales COMO if() 
		this.setVariablesGlobalesCombosForeignKeyTipoTributario();
		
		this.cargarMenuRelaciones();
		
	}
	
	public void initActionsFormDetalle() {	
		
		this.jInternalFrameDetalleFormTipoTributario.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarTipoTributario"));
		
		this.jInternalFrameDetalleFormTipoTributario.jButtonModificarTipoTributario.addActionListener(new ButtonActionListener(this,"ModificarTipoTributario"));

		
		this.jInternalFrameDetalleFormTipoTributario.jButtonModificarToolBarTipoTributario.addActionListener(new ButtonActionListener(this,"ModificarToolBarTipoTributario"));
					
		this.jInternalFrameDetalleFormTipoTributario.jMenuItemModificarTipoTributario.addActionListener(new ButtonActionListener(this,"MenuItemModificarTipoTributario"));		
		
		
		
		this.jInternalFrameDetalleFormTipoTributario.jButtonActualizarTipoTributario.addActionListener (new ButtonActionListener(this,"ActualizarTipoTributario"));
		
		
		this.jInternalFrameDetalleFormTipoTributario.jButtonActualizarToolBarTipoTributario.addActionListener(new ButtonActionListener(this,"ActualizarToolBarTipoTributario"));
						
		this.jInternalFrameDetalleFormTipoTributario.jMenuItemActualizarTipoTributario.addActionListener (new ButtonActionListener(this,"MenuItemActualizarTipoTributario"));		
		
		
		
		this.jInternalFrameDetalleFormTipoTributario.jButtonEliminarTipoTributario.addActionListener (new ButtonActionListener(this,"EliminarTipoTributario"));
		
		
		this.jInternalFrameDetalleFormTipoTributario.jButtonEliminarToolBarTipoTributario.addActionListener (new ButtonActionListener(this,"EliminarToolBarTipoTributario"));
								
		this.jInternalFrameDetalleFormTipoTributario.jMenuItemEliminarTipoTributario.addActionListener (new ButtonActionListener(this,"MenuItemEliminarTipoTributario"));		
		
		
		
		this.jInternalFrameDetalleFormTipoTributario.jButtonCancelarTipoTributario.addActionListener (new ButtonActionListener(this,"CancelarTipoTributario"));
		
		
		this.jInternalFrameDetalleFormTipoTributario.jButtonCancelarToolBarTipoTributario.addActionListener (new ButtonActionListener(this,"CancelarToolBarTipoTributario"));
					
		this.jInternalFrameDetalleFormTipoTributario.jMenuItemCancelarTipoTributario.addActionListener (new ButtonActionListener(this,"MenuItemCancelarTipoTributario"));		
		
		
		
		
		
		this.jInternalFrameDetalleFormTipoTributario.jMenuItemDetalleCerrarTipoTributario.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarTipoTributario"));		
		
		
		
		this.jInternalFrameDetalleFormTipoTributario.jButtonGuardarCambiosToolBarTipoTributario.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarTipoTributario"));
		
		
		
		this.jInternalFrameDetalleFormTipoTributario.jButtonGuardarCambiosToolBarTipoTributario.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarTipoTributario"));
		
		
		
		this.jInternalFrameDetalleFormTipoTributario.jComboBoxTiposAccionesFormularioTipoTributario.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioTipoTributario"));
		
		
				
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoTributario.jButtonidTipoTributarioBusqueda.addActionListener(new ButtonActionListener(this,"idTipoTributarioBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormTipoTributario.jButtonid_paisTipoTributarioUpdate.addActionListener(new ButtonActionListener(this,"id_paisTipoTributarioUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoTributario.jButtonid_paisTipoTributarioBusqueda.addActionListener(new ButtonActionListener(this,"id_paisTipoTributarioBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoTributario.jButtoncodigoTipoTributarioBusqueda.addActionListener(new ButtonActionListener(this,"codigoTipoTributarioBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoTributario.jButtonnombreTipoTributarioBusqueda.addActionListener(new ButtonActionListener(this,"nombreTipoTributarioBusqueda"));
		
		
		;

		//TABBED PANE RELACIONES
		this.jInternalFrameDetalleFormTipoTributario.jTabbedPaneRelacionesTipoTributario.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesTipoTributario"));
		
		;		
		//TABBED PANE RELACIONES FIN(EXTRA TAB)	
	}
	
	public void initActions() {				
		this.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"CloseInternalFrameTipoTributario"));
		
		if(this.jInternalFrameDetalleFormTipoTributario!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoTributario.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarTipoTributario"));
		}
		
		this.jTableDatosTipoTributario.getSelectionModel().addListSelectionListener(new TableListSelectionListener(this,"TableDatosSeleccionarTipoTributario"));
		
		this.jTableDatosTipoTributario.addMouseListener(new TableMouseAdapter(this,"DatosSeleccionarTipoTributario"));
		
		this.jButtonNuevoTipoTributario.addActionListener(new ButtonActionListener(this,"NuevoTipoTributario"));
		
		this.jButtonDuplicarTipoTributario.addActionListener(new ButtonActionListener(this,"DuplicarTipoTributario"));
		
		this.jButtonCopiarTipoTributario.addActionListener(new ButtonActionListener(this,"CopiarTipoTributario"));
		
		this.jButtonVerFormTipoTributario.addActionListener(new ButtonActionListener(this,"VerFormTipoTributario"));
		
		
		this.jButtonNuevoToolBarTipoTributario.addActionListener(new ButtonActionListener(this,"NuevoToolBarTipoTributario"));
			
		this.jButtonDuplicarToolBarTipoTributario.addActionListener(new ButtonActionListener(this,"DuplicarToolBarTipoTributario"));
			
		this.jMenuItemNuevoTipoTributario.addActionListener (new ButtonActionListener(this,"MenuItemNuevoTipoTributario"));
			
		this.jMenuItemDuplicarTipoTributario.addActionListener (new ButtonActionListener(this,"MenuItemDuplicarTipoTributario"));		
		
		
		this.jButtonNuevoRelacionesTipoTributario.addActionListener (new ButtonActionListener(this,"NuevoRelacionesTipoTributario"));
		
		
		this.jButtonNuevoRelacionesToolBarTipoTributario.addActionListener(new ButtonActionListener(this,"NuevoRelacionesToolBarTipoTributario"));
			
		this.jMenuItemNuevoRelacionesTipoTributario.addActionListener(new ButtonActionListener(this,"MenuItemNuevoRelacionesTipoTributario"));		
		
		
		if(this.jInternalFrameDetalleFormTipoTributario!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoTributario.jButtonModificarTipoTributario.addActionListener(new ButtonActionListener(this,"ModificarTipoTributario"));
		}
		
		
		if(this.jInternalFrameDetalleFormTipoTributario!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoTributario.jButtonModificarToolBarTipoTributario.addActionListener(new ButtonActionListener(this,"ModificarToolBarTipoTributario"));
			
			this.jInternalFrameDetalleFormTipoTributario.jMenuItemModificarTipoTributario.addActionListener(new ButtonActionListener(this,"MenuItemModificarTipoTributario"));		
		}
		
		
		if(this.jInternalFrameDetalleFormTipoTributario!=null) { //if(this.conCargarFormDetalle) {			
			this.jInternalFrameDetalleFormTipoTributario.jButtonActualizarTipoTributario.addActionListener (new ButtonActionListener(this,"ActualizarTipoTributario"));
		}
		
		
		if(this.jInternalFrameDetalleFormTipoTributario!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoTributario.jButtonActualizarToolBarTipoTributario.addActionListener(new ButtonActionListener(this,"ActualizarToolBarTipoTributario"));
				
			this.jInternalFrameDetalleFormTipoTributario.jMenuItemActualizarTipoTributario.addActionListener (new ButtonActionListener(this,"MenuItemActualizarTipoTributario"));		
		}
		
		
		if(this.jInternalFrameDetalleFormTipoTributario!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoTributario.jButtonEliminarTipoTributario.addActionListener (new ButtonActionListener(this,"EliminarTipoTributario"));
		}
		
		
		if(this.jInternalFrameDetalleFormTipoTributario!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoTributario.jButtonEliminarToolBarTipoTributario.addActionListener (new ButtonActionListener(this,"EliminarToolBarTipoTributario"));
						
			this.jInternalFrameDetalleFormTipoTributario.jMenuItemEliminarTipoTributario.addActionListener (new ButtonActionListener(this,"MenuItemEliminarTipoTributario"));		
		}
		
		
		if(this.jInternalFrameDetalleFormTipoTributario!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoTributario.jButtonCancelarTipoTributario.addActionListener (new ButtonActionListener(this,"CancelarTipoTributario"));
		}
		
		
		if(this.jInternalFrameDetalleFormTipoTributario!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoTributario.jButtonCancelarToolBarTipoTributario.addActionListener (new ButtonActionListener(this,"CancelarToolBarTipoTributario"));
			
			this.jInternalFrameDetalleFormTipoTributario.jMenuItemCancelarTipoTributario.addActionListener (new ButtonActionListener(this,"MenuItemCancelarTipoTributario"));		
		}
		
		this.jButtonMostrarOcultarTablaToolBarTipoTributario.addActionListener (new ButtonActionListener(this,"MostrarOcultarToolBarTipoTributario"));		
		
		
		this.jButtonCerrarTipoTributario.addActionListener (new ButtonActionListener(this,"CerrarTipoTributario"));
		
		
		this.jButtonCerrarToolBarTipoTributario.addActionListener (new ButtonActionListener(this,"CerrarToolBarTipoTributario"));
			
		this.jMenuItemCerrarTipoTributario.addActionListener (new ButtonActionListener(this,"MenuItemCerrarTipoTributario"));
			
		if(this.jInternalFrameDetalleFormTipoTributario!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoTributario.jMenuItemDetalleCerrarTipoTributario.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarTipoTributario"));		
		}
		
		
		if(this.jInternalFrameDetalleFormTipoTributario!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoTributario.jButtonGuardarCambiosTipoTributario.addActionListener (new ButtonActionListener(this,"GuardarCambiosTipoTributario"));
		}
		
		
		if(this.jInternalFrameDetalleFormTipoTributario!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoTributario.jButtonGuardarCambiosToolBarTipoTributario.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarTipoTributario"));
		}
		
		this.jButtonCopiarToolBarTipoTributario.addActionListener (new ButtonActionListener(this,"CopiarToolBarTipoTributario"));
			
		this.jButtonVerFormToolBarTipoTributario.addActionListener (new ButtonActionListener(this,"VerFormToolBarTipoTributario"));
		
		this.jMenuItemGuardarCambiosTipoTributario.addActionListener (new ButtonActionListener(this,"MenuItemGuardarCambiosTipoTributario"));
			
		this.jMenuItemCopiarTipoTributario.addActionListener (new ButtonActionListener(this,"MenuItemCopiarTipoTributario"));		
		
		this.jMenuItemVerFormTipoTributario.addActionListener (new ButtonActionListener(this,"MenuItemVerFormTipoTributario"));		
		
		
		this.jButtonGuardarCambiosTablaTipoTributario.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaTipoTributario"));
		
		
		this.jButtonGuardarCambiosTablaToolBarTipoTributario.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaToolBarTipoTributario"));
			
		this.jMenuItemGuardarCambiosTablaTipoTributario.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaTipoTributario"));		
		
		
		
		this.jButtonRecargarInformacionTipoTributario.addActionListener (new ButtonActionListener(this,"RecargarInformacionTipoTributario"));
					
		this.jButtonRecargarInformacionToolBarTipoTributario.addActionListener (new ButtonActionListener(this,"RecargarInformacionToolBarTipoTributario"));
		
		this.jMenuItemRecargarInformacionTipoTributario.addActionListener (new ButtonActionListener(this,"MenuItemRecargarInformacionTipoTributario"));		
		
		
		
		this.jButtonAnterioresTipoTributario.addActionListener (new ButtonActionListener(this,"AnterioresTipoTributario"));
		
		
		this.jButtonAnterioresToolBarTipoTributario.addActionListener (new ButtonActionListener(this,"AnterioresToolBarTipoTributario"));
		
		this.jMenuItemAnterioresTipoTributario.addActionListener (new ButtonActionListener(this,"MenuItemAnterioresTipoTributario"));		
		
		
		this.jButtonSiguientesTipoTributario.addActionListener (new ButtonActionListener(this,"SiguientesTipoTributario"));
		
		
		this.jButtonSiguientesToolBarTipoTributario.addActionListener (new ButtonActionListener(this,"SiguientesToolBarTipoTributario"));
			
		this.jMenuItemSiguientesTipoTributario.addActionListener (new ButtonActionListener(this,"MenuItemSiguientesTipoTributario"));
			
		this.jMenuItemAbrirOrderByTipoTributario.addActionListener (new ButtonActionListener(this,"MenuItemAbrirOrderByTipoTributario"));
			
		this.jMenuItemMostrarOcultarTipoTributario.addActionListener (new ButtonActionListener(this,"MenuItemMostrarOcultarTipoTributario"));
			
		this.jMenuItemDetalleAbrirOrderByTipoTributario.addActionListener (new ButtonActionListener(this,"MenuItemDetalleAbrirOrderByTipoTributario"));
			
		this.jMenuItemDetalleMostarOcultarTipoTributario.addActionListener (new ButtonActionListener(this,"MenuItemDetalleMostrarOcultarTipoTributario"));		
		
		
		this.jButtonNuevoGuardarCambiosTipoTributario.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosTipoTributario"));
		
		
		this.jButtonNuevoGuardarCambiosToolBarTipoTributario.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosToolBarTipoTributario"));
			
		this.jMenuItemNuevoGuardarCambiosTipoTributario.addActionListener (new ButtonActionListener(this,"MenuItemNuevoGuardarCambiosTipoTributario"));		
		
		
		
		//SELECCIONAR TODOS
		
		this.jCheckBoxSeleccionarTodosTipoTributario.addItemListener(new CheckBoxItemListener(this,"SeleccionarTodosTipoTributario"));

		this.jCheckBoxSeleccionadosTipoTributario.addItemListener(new CheckBoxItemListener(this,"SeleccionadosTipoTributario"));
		
		if(this.jInternalFrameDetalleFormTipoTributario!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoTributario.jComboBoxTiposAccionesFormularioTipoTributario.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioTipoTributario"));
		}
		
		
		this.jComboBoxTiposRelacionesTipoTributario.addActionListener (new ButtonActionListener(this,"TiposRelacionesTipoTributario"));
			
		this.jComboBoxTiposAccionesTipoTributario.addActionListener (new ButtonActionListener(this,"TiposAccionesTipoTributario"));
					
		this.jComboBoxTiposSeleccionarTipoTributario.addActionListener (new ButtonActionListener(this,"TiposSeleccionarTipoTributario"));
			
		this.jTextFieldValorCampoGeneralTipoTributario.addActionListener (new ButtonActionListener(this,"ValorCampoGeneralTipoTributario"));		
		
		
		if(this.jInternalFrameDetalleFormTipoTributario!=null) { //if(this.conCargarFormDetalle) {
		
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoTributario.jButtonidTipoTributarioBusqueda.addActionListener(new ButtonActionListener(this,"idTipoTributarioBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormTipoTributario.jButtonid_paisTipoTributarioUpdate.addActionListener(new ButtonActionListener(this,"id_paisTipoTributarioUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoTributario.jButtonid_paisTipoTributarioBusqueda.addActionListener(new ButtonActionListener(this,"id_paisTipoTributarioBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoTributario.jButtoncodigoTipoTributarioBusqueda.addActionListener(new ButtonActionListener(this,"codigoTipoTributarioBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoTributario.jButtonnombreTipoTributarioBusqueda.addActionListener(new ButtonActionListener(this,"nombreTipoTributarioBusqueda"));
		}
		
		if(!this.conCargarMinimo) {
		//BYDAN_BUSQUEDAS
		
		
			this.jButtonBusquedaPorCodigoTipoTributario.addActionListener(new ButtonActionListener(this,"BusquedaPorCodigoTipoTributario"));

			this.jButtonBusquedaPorIdTipoTributario.addActionListener(new ButtonActionListener(this,"BusquedaPorIdTipoTributario"));

			this.jButtonBusquedaPorNombreTipoTributario.addActionListener(new ButtonActionListener(this,"BusquedaPorNombreTipoTributario"));

			this.jButtonFK_IdPaisTipoTributario.addActionListener(new ButtonActionListener(this,"FK_IdPaisTipoTributario"));
		
		
		
			//REPORTE DINAMICO
			
			if(this.jInternalFrameReporteDinamicoTipoTributario!=null) {
				this.jInternalFrameReporteDinamicoTipoTributario.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoTipoTributario"));
				this.jInternalFrameReporteDinamicoTipoTributario.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoTipoTributario"));
				this.jInternalFrameReporteDinamicoTipoTributario.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoTipoTributario"));
			}
			
			//this.jButtonCerrarReporteDinamicoTipoTributario.addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoTipoTributario"));				
			//this.jButtonGenerarReporteDinamicoTipoTributario.addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoTipoTributario"));
			//this.jButtonGenerarExcelReporteDinamicoTipoTributario.addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoTipoTributario"));
				
				
			//IMPORTACION			
			if(this.jInternalFrameImportacionTipoTributario!=null) {
				this.jInternalFrameImportacionTipoTributario.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionTipoTributario"));
				this.jInternalFrameImportacionTipoTributario.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionTipoTributario"));
				this.jInternalFrameImportacionTipoTributario.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionTipoTributario"));
			}
			
			//ORDER BY
			this.jButtonAbrirOrderByTipoTributario.addActionListener (new ButtonActionListener(this,"AbrirOrderByTipoTributario"));
			
			this.jButtonAbrirOrderByToolBarTipoTributario.addActionListener (new ButtonActionListener(this,"AbrirOrderByToolBarTipoTributario"));			
			
			if(this.jInternalFrameOrderByTipoTributario!=null) {
				this.jInternalFrameOrderByTipoTributario.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByTipoTributario"));				
			}
			
			
		}
		
		
		
		if(!this.conCargarMinimo) {
			if(this.jInternalFrameDetalleFormTipoTributario!=null) { //if(this.conCargarFormDetalle) {
			;
			}
		}
		
		
		//TABBED PANE RELACIONES
		if(this.jInternalFrameDetalleFormTipoTributario!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoTributario.jTabbedPaneRelacionesTipoTributario.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesTipoTributario"));
		
		;
		}
		//TABBED PANE RELACIONES FIN(EXTRA TAB)		
	}
	
	/*
	public void initActions() {
		String sMapKey = "";
		InputMap inputMap =null;
		
		this.addInternalFrameListener(new javax.swing.event.InternalFrameAdapter() {
            public void internalFrameClosing(InternalFrameEvent event) {          	
            	try {
            		closingInternalFrameTipoTributario();
				} catch (Exception e) {
					e.printStackTrace();
				}
            }
        });
		
		this.jInternalFrameDetalleFormTipoTributario.addInternalFrameListener(new javax.swing.event.InternalFrameAdapter() {
	        public void internalFrameClosing(InternalFrameEvent event) {
	            JInternalFrameBase jInternalFrameDetalleFormTipoTributario = (JInternalFrameBase)event.getSource();
	            	
	            TipoTributarioBeanSwingJInternalFrame jInternalFrameParent=(TipoTributarioBeanSwingJInternalFrame)jInternalFrameDetalleFormTipoTributario.getjInternalFrameParent();
	                
	            try {
					jInternalFrameParent.jButtonCancelarTipoTributarioActionPerformed(null);
					
					//jInternalFrameParent.dispose();
					//jInternalFrameParent=null;
					
				} catch (Exception e) {
					e.printStackTrace();
				}
	        }
	    });
			
		this.jTableDatosTipoTributario.getSelectionModel().addListSelectionListener (
	                new ListSelectionListener() {
	                    public void valueChanged(ListSelectionEvent e) {
							//BYDAN_DESHABILITADO
	                    	//try {jTableDatosTipoTributarioListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
	                    }
	                }
	     );
		
		this.jTableDatosTipoTributario.addMouseListener(new MouseAdapter() {
			   public void mouseClicked(MouseEvent evt) {
				      if (evt.getClickCount() == 2) {
				    	  jButtonIdActionPerformed(null,jTableDatosTipoTributario.getSelectedRow(),false,false);
				      }
				   }
		});
		
		this.jButtonNuevoTipoTributario.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoTipoTributarioActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoToolBarTipoTributario.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoTipoTributarioActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoTipoTributario.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoTipoTributarioActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoTipoTributario";
		inputMap = this.jButtonNuevoTipoTributario.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_N , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoTipoTributario.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoTipoTributarioActionPerformed(evt,false);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonNuevoRelacionesTipoTributario.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoTipoTributarioActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoRelacionesToolBarTipoTributario.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoTipoTributarioActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoRelacionesTipoTributario.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoTipoTributarioActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoRelacionesTipoTributario";
		inputMap = this.jButtonNuevoRelacionesTipoTributario.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_R , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoRelacionesTipoTributario.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoTipoTributarioActionPerformed(evt,true);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonModificarTipoTributario.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarTipoTributarioActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonModificarToolBarTipoTributario.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarTipoTributarioActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemModificarTipoTributario.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarTipoTributarioActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ModificarTipoTributario";
		inputMap = this.jButtonModificarTipoTributario.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_M , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonModificarTipoTributario.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonModificarTipoTributarioActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonActualizarTipoTributario.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarTipoTributarioActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonActualizarToolBarTipoTributario.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarTipoTributarioActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemActualizarTipoTributario.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarTipoTributarioActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ActualizarTipoTributario";
		inputMap = this.jButtonActualizarTipoTributario.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonActualizarTipoTributario.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonActualizarTipoTributarioActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonEliminarTipoTributario.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarTipoTributarioActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonEliminarToolBarTipoTributario.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarTipoTributarioActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
				
		this.jMenuItemEliminarTipoTributario.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarTipoTributarioActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "EliminarTipoTributario";
		inputMap = this.jButtonEliminarTipoTributario.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_E , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonEliminarTipoTributario.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonEliminarTipoTributarioActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCancelarTipoTributario.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarTipoTributarioActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCancelarToolBarTipoTributario.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarTipoTributarioActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCancelarTipoTributario.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarTipoTributarioActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CancelarTipoTributario";
		inputMap = this.jButtonCancelarTipoTributario.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_Q , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonCancelarTipoTributario.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCancelarTipoTributarioActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCerrarTipoTributario.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarTipoTributarioActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCerrarToolBarTipoTributario.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarTipoTributarioActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCerrarTipoTributario.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarTipoTributarioActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemDetalleCerrarTipoTributario.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  //try {jButtonCerrarTipoTributarioActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
					try {jButtonCancelarTipoTributarioActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CerrarTipoTributario";
		inputMap = this.jButtonCerrarTipoTributario.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_C , KeyEvent.ALT_MASK), sMapKey);
			
		this.jButtonCerrarTipoTributario.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCerrarTipoTributarioActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jInternalFrameDetalleFormTipoTributario.jButtonGuardarCambiosTipoTributario.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosTipoTributarioActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosToolBarTipoTributario.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosTipoTributarioActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosTipoTributario.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosTipoTributarioActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaTipoTributario.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosTipoTributarioActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaToolBarTipoTributario.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosTipoTributarioActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosTablaTipoTributario.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosTipoTributarioActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "GuardarCambiosTipoTributario";
		inputMap = this.jInternalFrameDetalleFormTipoTributario.jButtonGuardarCambiosTipoTributario.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jInternalFrameDetalleFormTipoTributario.jButtonGuardarCambiosTipoTributario.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonGuardarCambiosTipoTributarioActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonRecargarInformacionTipoTributario.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionTipoTributarioActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonRecargarInformacionToolBarTipoTributario.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionTipoTributarioActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemRecargarInformacionTipoTributario.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionTipoTributarioActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		this.jButtonAnterioresTipoTributario.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresTipoTributarioActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAnterioresToolBarTipoTributario.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresTipoTributarioActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemAnterioresTipoTributario.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresTipoTributarioActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesTipoTributario.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesTipoTributarioActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesToolBarTipoTributario.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesTipoTributarioActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemSiguientesTipoTributario.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesTipoTributarioActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosTipoTributario.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosTipoTributarioActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosToolBarTipoTributario.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosTipoTributarioActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoGuardarCambiosTipoTributario.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosTipoTributarioActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		//SELECCIONAR TODOS
		this.jCheckBoxSeleccionarTodosTipoTributario.addItemListener(new ItemListener() {		
			public void itemStateChanged(ItemEvent evt) {
				try {jCheckBoxSeleccionarTodosTipoTributarioItemListener(evt);}catch(Exception e){e.printStackTrace();}
			}
		});

		this.jComboBoxTiposAccionesTipoTributario.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposAccionesTipoTributarioActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jComboBoxTiposSeleccionarTipoTributario.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposSeleccionarTipoTributarioActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jTextFieldValorCampoGeneralTipoTributario.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jTextFieldValorCampoGeneralTipoTributarioActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoTributario.jButtonidTipoTributarioBusqueda.addActionListener(new ButtonActionListener(this,"idTipoTributarioBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormTipoTributario.jButtonid_paisTipoTributarioUpdate.addActionListener(new ButtonActionListener(this,"id_paisTipoTributarioUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoTributario.jButtonid_paisTipoTributarioBusqueda.addActionListener(new ButtonActionListener(this,"id_paisTipoTributarioBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoTributario.jButtoncodigoTipoTributarioBusqueda.addActionListener(new ButtonActionListener(this,"codigoTipoTributarioBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoTributario.jButtonnombreTipoTributarioBusqueda.addActionListener(new ButtonActionListener(this,"nombreTipoTributarioBusqueda"));
		
		
		this.jButtonBusquedaPorCodigoTipoTributario.addActionListener(new ButtonActionListener(this,"BusquedaPorCodigoTipoTributario"));

		this.jButtonBusquedaPorIdTipoTributario.addActionListener(new ButtonActionListener(this,"BusquedaPorIdTipoTributario"));

		this.jButtonBusquedaPorNombreTipoTributario.addActionListener(new ButtonActionListener(this,"BusquedaPorNombreTipoTributario"));

		this.jButtonFK_IdPaisTipoTributario.addActionListener(new ButtonActionListener(this,"FK_IdPaisTipoTributario"));

		
		//REPORTE DINAMICO
		this.jButtonCerrarReporteDinamicoTipoTributario.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarReporteDinamicoTipoTributarioActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarReporteDinamicoTipoTributario.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarReporteDinamicoTipoTributarioActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarExcelReporteDinamicoTipoTributario.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarExcelReporteDinamicoTipoTributarioActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		//IMPORTACION
		this.jButtonCerrarImportacionTipoTributario.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarImportacionTipoTributarioActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarImportacionTipoTributario.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarImportacionTipoTributarioActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAbrirImportacionTipoTributario.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAbrirImportacionTipoTributarioActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
	}
	*/
	
	
	public void jComboBoxTiposSeleccionarTipoTributarioActionListener(ActionEvent evt) throws Exception {    		
		try {			
			Reporte reporte=(Reporte)this.jComboBoxTiposSeleccionarTipoTributario.getSelectedItem();
			
			//if(reporte.getsCodigo().equals("SELECCIONAR")) {
			//}					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoTributarioConstantesFunciones.CLASSNAME);
		}
	}	
	
	
	
	public void seleccionarTodosTipoTributario(Boolean conSeleccionarTodos) throws Exception {    		
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				for(TipoTributario tipotributarioAux:this.tipotributarioLogic.getTipoTributarios()) {
					tipotributarioAux.setIsSelected(conSeleccionarTodos);
				}			
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(TipoTributario tipotributarioAux:tipotributarios) {
					tipotributarioAux.setIsSelected(conSeleccionarTodos);
				}
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoTributarioConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarTodosTipoTributarioItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingTipoTributario(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			
			if(sTipoSeleccionar.equals("COLUMNAS")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(TipoTributario tipotributarioAux:this.tipotributarioLogic.getTipoTributarios()) {
						tipotributarioAux.setIsSelected(this.isSeleccionarTodos);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(TipoTributario tipotributarioAux:tipotributarios) {
						tipotributarioAux.setIsSelected(this.isSeleccionarTodos);
					}
				}
			} else {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					for(TipoTributario tipotributarioAux:this.tipotributarioLogic.getTipoTributarios()) {
					
					}	
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(TipoTributario tipotributarioAux:tipotributarios) {
						
					}
				}
			}
					
			if(existe) {
				this.inicializarActualizarBindingTablaTipoTributario(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosTipoTributario.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosTipoTributario.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosTipoTributario,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoTributarioConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionadosTipoTributarioItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingTipoTributario(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			int[] arrNumRowsSeleccionados=null;
			
			arrNumRowsSeleccionados=this.jTableDatosTipoTributario.getSelectedRows();
			
			TipoTributario tipotributarioLocal=new TipoTributario();
			
			//this.seleccionarTodosTipoTributario(false);
			
			for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					tipotributarioLocal =(TipoTributario) this.tipotributarioLogic.getTipoTributarios().toArray()[this.jTableDatosTipoTributario.convertRowIndexToModel(iNumRowSeleccionado)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					tipotributarioLocal =(TipoTributario) this.tipotributarios.toArray()[this.jTableDatosTipoTributario.convertRowIndexToModel(iNumRowSeleccionado)];
				}
				
				tipotributarioLocal.setIsSelected(this.isSeleccionados);
			}
			
			/*
			if(sTipoSeleccionar.equals("SELECCIONAR")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(TipoTributario tipotributarioAux:this.tipotributarioLogic.getTipoTributarios()) {
						tipotributarioAux.setIsSelected(this.isSeleccionados);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(TipoTributario tipotributarioAux:tipotributarios) {
						tipotributarioAux.setIsSelected(this.isSeleccionados);
					}
				}
			}
			*/
			
			//if(existe) {
				this.inicializarActualizarBindingTablaTipoTributario(false);
			/*
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			*/
			
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosTipoTributario.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosTipoTributario.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosTipoTributario,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoTributarioConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarActualTipoTributarioItemListener(ItemEvent evt,Long idActual) throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoTributarioConstantesFunciones.CLASSNAME);
		}
	}
	
	public void ejecutarAuxiliarTipoTributarioParaAjaxPostBack() throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoTributarioConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jTextFieldValorCampoGeneralTipoTributarioActionListener(ActionEvent evt) throws Exception {    		
		try {
			this.inicializarActualizarBindingTipoTributario(false,false);
			
			//System.out.println(this.jTextFieldValorCampoGeneralTipoTributario.getText());		
			
			Boolean existe=false;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(TipoTributario tipotributarioAux:this.tipotributarioLogic.getTipoTributarios()) {
				
						if(sTipoSeleccionar.equals(TipoTributarioConstantesFunciones.LABEL_CODIGO)) {
							existe=true;
							tipotributarioAux.setcodigo(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(TipoTributarioConstantesFunciones.LABEL_NOMBRE)) {
							existe=true;
							tipotributarioAux.setnombre(this.sValorCampoGeneral);
						}
				}	
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(TipoTributario tipotributarioAux:tipotributarios) {
					
						if(sTipoSeleccionar.equals(TipoTributarioConstantesFunciones.LABEL_CODIGO)) {
							existe=true;
							tipotributarioAux.setcodigo(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(TipoTributarioConstantesFunciones.LABEL_NOMBRE)) {
							existe=true;
							tipotributarioAux.setnombre(this.sValorCampoGeneral);
						}
				}
			}
								
			if(existe) {
				this.inicializarActualizarBindingTablaTipoTributario(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoTributarioConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jComboBoxTiposAccionesTipoTributarioActionListener(ActionEvent evt,Boolean esParaAccionDesdeFormulario) throws Exception {    				
		Boolean conSplash=true;
		
		try {							
		
			this.inicializarActualizarBindingTipoTributario(false,false);
			
			Reporte reporte=new Reporte();
			
			this.esParaAccionDesdeFormularioTipoTributario=esParaAccionDesdeFormulario;
			
			if(!esParaAccionDesdeFormulario) {
				
				reporte=(Reporte)this.jComboBoxTiposAccionesTipoTributario.getSelectedItem();
				
			} else {
				reporte=(Reporte)this.jInternalFrameDetalleFormTipoTributario.jComboBoxTiposAccionesFormularioTipoTributario.getSelectedItem();
			}
			String sTipoAccionLocal=this.sTipoAccion;
			
			if(!esParaAccionDesdeFormulario) {
				sTipoAccionLocal=this.sTipoAccion;
			} else {
				sTipoAccionLocal=this.sTipoAccionFormulario;
			}
			
			if(sTipoAccionLocal.equals("GENERAR REPORTE")) {//reporte.getsCodigo().equals("GENERAR REPORTE")) {
				if(this.isPermisoReporteTipoTributario) {				
					conSplash=true;//false;										
					
					//this.startProcessTipoTributario(conSplash);
				
					this.generarReporteTipoTributariosSeleccionados();
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesTipoTributario.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormTipoTributario.jComboBoxTiposAccionesFormularioTipoTributario.setSelectedIndex(0);					
				}
			} else if(sTipoAccionLocal.equals("GENERAR REPORTE DINAMICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.mostrarReporteDinamicoTipoTributariosSeleccionados();
				//this.jComboBoxTiposAccionesTipoTributario.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("GENERAR_REPORTE_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoTipoTributariosSeleccionados(false);
				//this.jComboBoxTiposAccionesTipoTributario.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("GENERAR_REPORTE_TOTALES_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoTipoTributariosSeleccionados(true);
				//this.jComboBoxTiposAccionesTipoTributario.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessTipoTributario();
				
				this.exportarTipoTributariosSeleccionados();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesTipoTributario.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormTipoTributario.jComboBoxTiposAccionesFormularioTipoTributario.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("IMPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				this.mostrarImportacionTipoTributarios();
				//this.importarTipoTributarios();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesTipoTributario.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormTipoTributario.jComboBoxTiposAccionesFormularioTipoTributario.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS_EXCEL")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessTipoTributario();
				//SE EXPORTA SEGUN TIPO ARCHIVO SELECCIONADO
				//this.exportarExcelTipoTributariosSeleccionados();
				//this.jComboBoxTiposAccionesTipoTributario.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("RECARGAR_FK")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {								
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE RECARGAR REFERENCIAS ?", "MANTENIMIENTO DE Tipo Tributario", JOptionPane.OK_CANCEL_OPTION) == 0) {
				
				//this.startProcessTipoTributario();
				
					if(!esParaAccionDesdeFormulario || (esParaAccionDesdeFormulario && this.isEsNuevoTipoTributario)) {
						this.esRecargarFks=true;
						this.cargarCombosForeignKeyTipoTributario(false,false,false);
						this.esRecargarFks=false;
						
						JOptionPane.showMessageDialog(this,"PROCESO EJECUTADO CORRECTAMENTE","MANTENIMIENTO DE Tipo Tributario",JOptionPane.INFORMATION_MESSAGE);
					} else {
						JOptionPane.showMessageDialog(this,"ESTE PROCESO SOLO FUNCIONA AL INGRESAR UN NUEVO ELEMENTO","MANTENIMIENTO",JOptionPane.ERROR_MESSAGE);	
					}
					
					
				}
				
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesTipoTributario.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormTipoTributario.jComboBoxTiposAccionesFormularioTipoTributario.setSelectedIndex(0);					
				}	
			} 			
			else if(TipoTributarioBeanSwingJInternalFrame.EsProcesoReporte(reporte.getsCodigo())){
				if(this.isPermisoReporteTipoTributario) {				
					if(this.tieneElementosSeleccionados()) {
						this.quitarFilaTotales();
						
						conSplash=false;
						
						//this.startProcessTipoTributario(conSplash);
					
						//this.actualizarParametrosGeneralTipoTributario();
						
						this.generarReporteProcesoAccionTipoTributariosSeleccionados(reporte.getsCodigo());
						
						if(!esParaAccionDesdeFormulario) {
							
							this.jComboBoxTiposAccionesTipoTributario.setSelectedIndex(0);					
							
						} else {
							this.jInternalFrameDetalleFormTipoTributario.jComboBoxTiposAccionesFormularioTipoTributario.setSelectedIndex(0);					
						}
					} else {
						JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
			} 
			else if(TipoTributarioBeanSwingJInternalFrameAdditional.EsProcesoAccionNormal(reporte.getsCodigo())){
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR "+reporte.getsDescripcion()+" EN PROCESO Tipo TributarioS SELECCIONADOS?", "MANTENIMIENTO DE Tipo Tributario", JOptionPane.OK_CANCEL_OPTION) == 0) {
						//this.startProcessTipoTributario();
				
						this.actualizarParametrosGeneralTipoTributario();
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {						
							this.tipotributarioReturnGeneral=tipotributarioLogic.procesarAccionTipoTributariosWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,sTipoAccionLocal,this.tipotributarioLogic.getTipoTributarios(),this.tipotributarioParameterGeneral);
						
						} else if(Constantes.ISUSAEJBREMOTE) {
						
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
						this.procesarTipoTributarioReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesTipoTributario.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormTipoTributario.jComboBoxTiposAccionesFormularioTipoTributario.setSelectedIndex(0);					
					}
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}				
			} 
			else {
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					this.actualizarParametrosGeneralTipoTributario();
					
					TipoTributarioBeanSwingJInternalFrameAdditional.ProcesarAccion(reporte.getsCodigo(),reporte.getsDescripcion(),this);
					
					this.procesarTipoTributarioReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesTipoTributario.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormTipoTributario.jComboBoxTiposAccionesFormularioTipoTributario.setSelectedIndex(0);					
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}
			}
		} catch(Exception e) {
			this.esRecargarFks=false;
			
			FuncionesSwing.manageException(this, e,logger,TipoTributarioConstantesFunciones.CLASSNAME);
		
		}  finally {
      		//this.finishProcessTipoTributario(conSplash);
      	}
	}
	
	public void jComboBoxTiposRelacionesTipoTributarioActionListener(ActionEvent evt) throws Exception {    				
		Boolean conSplash=true;
		
		try {			
			this.startProcessTipoTributario();
			
			if(this.jInternalFrameDetalleFormTipoTributario==null) { //if(!this.conCargarFormDetalle) {			
				this.inicializarFormDetalle();
			}
			
			ArrayList<TipoTributario> tipotributariosSeleccionados=new ArrayList<TipoTributario>();		
			TipoTributario tipotributario=new TipoTributario();
			
			int rowIndex=-1;//CON ESTO SE DESHABILITA SELECCION POR INDICE
			
			this.inicializarActualizarBindingTipoTributario(false,false);
			
			Reporte reporte=new Reporte();
			
			
			reporte=(Reporte)this.jComboBoxTiposRelacionesTipoTributario.getSelectedItem();
			
			
			
			
			tipotributariosSeleccionados=this.getTipoTributariosSeleccionados(true);
			//this.sTipoAccion;
			
			if(tipotributariosSeleccionados.size()==1) {
				for(TipoTributario tipotributarioAux:tipotributariosSeleccionados) {
					tipotributario=tipotributarioAux;
				}
				
				if(this.sTipoAccion.equals("NONE")) {
				
				}
				
				else if(this.sTipoRelacion.equals("Transaccion Local")) {
					jButtonTransaccionLocalActionPerformed(null,rowIndex,true,false,tipotributario);
				}
				else if(this.sTipoRelacion.equals("Factura Proveedor")) {
					jButtonFacturaProveedorServicioActionPerformed(null,rowIndex,true,false,tipotributario);
				}
				else if(this.sTipoRelacion.equals("Definicion")) {
					jButtonDefinicionActionPerformed(null,rowIndex,true,false,tipotributario);
				}
			} else {
				JOptionPane.showMessageDialog(this,"SELECCIONE SOLO UN REGISTRO","RELACIONES",JOptionPane.ERROR_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoTributarioConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.finishProcessTipoTributario();
			
      		//this.finishProcessTipoTributario(conSplash);
      	}
	}
			
	public static Boolean EsProcesoReporte(String sTipoProceso) throws Exception {
		Boolean esProcesoAccionRepoorte=false;

		if(sTipoProceso.contains("REPORTE_")) {
			 esProcesoAccionRepoorte=true;
		}

		return esProcesoAccionRepoorte;
	}
	
	public void procesarTipoTributarioReturnGeneral() throws Exception {
		if(this.tipotributarioReturnGeneral.getConRetornoEstaProcesado()) {
			JOptionPane.showMessageDialog(this,this.tipotributarioReturnGeneral.getsMensajeProceso(),"PROCESO",JOptionPane.INFORMATION_MESSAGE);
		}
		
		if(this.tipotributarioReturnGeneral.getConMostrarMensaje()) {
			JOptionPane.showMessageDialog(this,this.tipotributarioReturnGeneral.getsMensajeProceso(),"PROCESO",FuncionesSwing.getColorSelectedBackground(this.tipotributarioReturnGeneral.getsTipoMensaje()));
		}
		
		if(this.tipotributarioReturnGeneral.getConRecargarInformacion()) {
			this.procesarBusqueda(this.sAccionBusqueda);
			
			this.inicializarActualizarBindingTipoTributario(false);
		}
		
		if(this.tipotributarioReturnGeneral.getConRetornoLista() || this.tipotributarioReturnGeneral.getConRetornoObjeto()) {
			if(this.tipotributarioReturnGeneral.getConRetornoLista()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.tipotributarioLogic.setTipoTributarios(this.tipotributarioReturnGeneral.getTipoTributarios());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			if(this.tipotributarioReturnGeneral.getConRetornoObjeto()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.tipotributarioLogic.setTipoTributario(this.tipotributarioReturnGeneral.getTipoTributario());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			this.inicializarActualizarBindingTipoTributario(false);
		}
	}
	
	public void actualizarParametrosGeneralTipoTributario() throws Exception {
		
		
	}
	
	public ArrayList<TipoTributario> getTipoTributariosSeleccionados(Boolean conSeleccionarTodosAutomatico) throws Exception {
		ArrayList<TipoTributario> tipotributariosSeleccionados=new ArrayList<TipoTributario>();
		Boolean existe=false;
		
		if(!this.esParaAccionDesdeFormularioTipoTributario) {
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				
				for(TipoTributario tipotributarioAux:tipotributarioLogic.getTipoTributarios()) {
					if(tipotributarioAux.getIsSelected()) {
						tipotributariosSeleccionados.add(tipotributarioAux);				
					}
				}
				
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(TipoTributario tipotributarioAux:this.tipotributarios) {
					if(tipotributarioAux.getIsSelected()) {
						tipotributariosSeleccionados.add(tipotributarioAux);				
					}
				}
			}
			
			if(tipotributariosSeleccionados.size()>0) {
				existe=true;
			}
			
			//SI NO ESTA NINGUNO SELECCIONADO SE SELECCIONA TODOS
			if(!existe) {
				if(conSeleccionarTodosAutomatico) {
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						tipotributariosSeleccionados.addAll(this.tipotributarioLogic.getTipoTributarios());
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						tipotributariosSeleccionados.addAll(this.tipotributarios);				
					}
				}
			}
		} else {
			tipotributariosSeleccionados.add(this.tipotributario);
		}
		
		return tipotributariosSeleccionados;
	}
	
	public void actualizarVariablesTipoReporte(Boolean esReporteNormal,Boolean esReporteDinamico,Boolean esReporteAccionProceso,String sPath) {
		if(esReporteNormal) {
			this.sTipoReporteExtra="";
			this.esReporteDinamico=false;
			this.sPathReporteDinamico="";
			this.esReporteAccionProceso=false;
			
		} else if(esReporteAccionProceso) {
			this.sTipoReporteExtra="";
			this.esReporteDinamico=false;
			this.sPathReporteDinamico="";
			this.esReporteAccionProceso=true;
			
		} else if(esReporteDinamico) {
			this.sTipoReporteExtra="";
			this.esReporteDinamico=true;
			this.esReporteAccionProceso=false;
			this.sPathReporteDinamico=sPath.replace(".jrxml",".jasper");			
		}
	}
	
	public void generarReporteTipoTributariosSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoReporte.equals("NORMAL") || this.sTipoReporte.equals("FORMULARIO")) {
			existe=true;								
			this.generarReporteNormalTipoTributariosSeleccionados();
			
		} else if(this.sTipoReporte.equals("DINAMICO")) {
			existe=true;
			this.mostrarReporteDinamicoTipoTributariosSeleccionados();
			
		} else if(this.sTipoReporte.equals("GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoTipoTributariosSeleccionados(false);
			
		} else if(this.sTipoReporte.equals("TOTALES_GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoTipoTributariosSeleccionados(true);
		}
		else if(this.sTipoReporte.equals("RELACIONES")) {
			//SI SE GENERA REPORTE RELACIONES
			existe=true;
			this.generarReporteRelacionesTipoTributariosSeleccionados();
		}					
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE REPORTE VALIDO","REPORTE DE Tipo Tributario",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void generarReporteRelacionesTipoTributariosSeleccionados() throws Exception {
		ArrayList<TipoTributario> tipotributariosSeleccionados=new ArrayList<TipoTributario>();		
		
		tipotributariosSeleccionados=this.getTipoTributariosSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
					
		//this.sTipoReporteExtra="MasterRelaciones";
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		
		this.generarReporteTipoTributarios("Todos",tipotributariosSeleccionados);
		
	}	
	
	public void generarReporteNormalTipoTributariosSeleccionados() throws Exception {
		ArrayList<TipoTributario> tipotributariosSeleccionados=new ArrayList<TipoTributario>();		
		
		tipotributariosSeleccionados=this.getTipoTributariosSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
								
		if(this.sTipoReporte.equals("FORMULARIO")) {
			this.sTipoReporteExtra="Vertical";					
		}
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.generarReporteTipoTributarios("Todos",tipotributariosSeleccionados);
	}		
	
	public void generarReporteProcesoAccionTipoTributariosSeleccionados(String sProcesoReporte) throws Exception {
		ArrayList<TipoTributario> tipotributariosSeleccionados=new ArrayList<TipoTributario>();
		
		tipotributariosSeleccionados=this.getTipoTributariosSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(false,false,true,"");
		
		/*
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.sTipoReporteExtra=sProcesoReporte.toLowerCase();
		
		this.esReporteAccionProceso=true;
		this.generarReporteTipoTributarios("Todos",tipotributariosSeleccionados);
		this.esReporteAccionProceso=false;
	}
	
	
	public void mostrarReporteDinamicoTipoTributariosSeleccionados() throws Exception {
		ArrayList<TipoTributario> tipotributariosSeleccionados=new ArrayList<TipoTributario>();		
		
		
		this.abrirInicializarFrameReporteDinamicoTipoTributario();
		
		
		tipotributariosSeleccionados=this.getTipoTributariosSeleccionados(true);
		
		this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirFrameReporteDinamicoTipoTributario();
		
		
		//this.generarReporteTipoTributarios("Todos",tipotributariosSeleccionados ,tipotributarioImplementable,tipotributarioImplementableHome);
	}
	
	public void mostrarImportacionTipoTributarios() throws Exception {
		//this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirInicializarFrameImportacionTipoTributario();
		
		this.abrirFrameImportacionTipoTributario();		
		
			
		//this.generarReporteTipoTributarios("Todos",tipotributariosSeleccionados ,tipotributarioImplementable,tipotributarioImplementableHome);
	}
	
	public void importarTipoTributarios() throws Exception {		
	
	}
	
	public void exportarTipoTributariosSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoArchivoReporte.equals("EXCEL")) {
			existe=true;
			this.exportarExcelTipoTributariosSeleccionados();
			
		} else if(this.sTipoArchivoReporte.equals("TEXTO")) {
			existe=true;
			this.exportarTextoTipoTributariosSeleccionados();
		
		} else if(this.sTipoArchivoReporte.equals("XML")) {
			existe=true;
			this.exportarXmlTipoTributariosSeleccionados();
		} 
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE ARCHIVO VALIDO","EXPORTACION DE Tipo Tributario",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void exportarTextoTipoTributariosSeleccionados() throws Exception {
		ArrayList<TipoTributario> tipotributariosSeleccionados=new ArrayList<TipoTributario>();		
		
		tipotributariosSeleccionados=this.getTipoTributariosSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tipotributario."+"txt";//Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario);
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		BufferedWriter bufferedWriter = null;
		FileWriter fileWriter=null;
		
		fileWriter=new FileWriter(sPath);
		
		bufferedWriter = new BufferedWriter(fileWriter);
		
		try {
			if(conCabecera) {
				sFilaCabecera=this.getFilaCabeceraExportarTipoTributario(sDelimiter);
				
				bufferedWriter.write(sFilaCabecera);
			}				
			
			for(TipoTributario tipotributarioAux:tipotributariosSeleccionados) {
				sFilaDatos=this.getFilaDatosExportarTipoTributario(tipotributarioAux,sDelimiter);
				
				bufferedWriter.write(sFilaDatos);
				
				//tipotributarioAux.setsDetalleGeneralEntityReporte(tipotributarioAux.toString());			
			}
			
			bufferedWriter.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipotributarioSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Tributario",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {
       		if (bufferedWriter != null) {
				bufferedWriter.close();
			}
		}
	}
	
	public String getFilaCabeceraExportarTipoTributario(String sDelimiter) {
		String sFilaCabecera="";
		
		
		sFilaCabecera+=TipoTributarioConstantesFunciones.LABEL_ID;

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaCabecera+=sDelimiter;
		sFilaCabecera+=TipoTributarioConstantesFunciones.LABEL_VERSIONROW;
		}

		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=TipoTributarioConstantesFunciones.LABEL_IDPAIS;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=TipoTributarioConstantesFunciones.LABEL_CODIGO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=TipoTributarioConstantesFunciones.LABEL_NOMBRE;
		
		return sFilaCabecera;
	}
	
	public String getFilaDatosExportarTipoTributario(TipoTributario tipotributario,String sDelimiter) {
		String sFilaDatos="";
		
		sFilaDatos+="\r\n";
		
		
		sFilaDatos+=tipotributario.getId().toString();

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaDatos+=sDelimiter;
		sFilaDatos+=tipotributario.getVersionRow().toString();
		}

		sFilaDatos+=sDelimiter;
		sFilaDatos+=tipotributario.getpais_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=tipotributario.getcodigo();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=tipotributario.getnombre();
		
		return sFilaDatos;
	}
	
	//@SuppressWarnings("deprecation")
	public void exportarExcelTipoTributariosSeleccionados() throws Exception {
		ArrayList<TipoTributario> tipotributariosSeleccionados=new ArrayList<TipoTributario>();		
		
		tipotributariosSeleccionados=this.getTipoTributariosSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tipotributario.xls";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		FileOutputStream fileOutputStream=null;
		
		try {
			HSSFWorkbook workbook = new HSSFWorkbook();
			HSSFSheet sheet = workbook.createSheet("TipoTributarios");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			HSSFRow row = sheet.createRow(iRow);
			HSSFCell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");

			if(conCabecera) {
				this.getFilaCabeceraExportarExcelTipoTributario(row);				
				iRow++;
			}				
			
			for(TipoTributario tipotributarioAux:tipotributariosSeleccionados) {
				row = sheet.createRow(iRow);
				
				this.getFilaDatosExportarExcelTipoTributario(tipotributarioAux,row);
				
				iRow++;
			}
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipotributarioSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Tributario",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			
       		if (fileOutputStream != null) {
				fileOutputStream.close();
			}			
		}
	}		
	
	public void exportarXmlTipoTributariosSeleccionados() throws Exception {
		ArrayList<TipoTributario> tipotributariosSeleccionados=new ArrayList<TipoTributario>();		
		
		tipotributariosSeleccionados=this.getTipoTributariosSeleccionados(true);
		
		//String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		//Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		//String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tipotributario.xml";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		DocumentBuilderFactory documentBuilderFactory=null;
		DocumentBuilder documentBuilder =null;
		
		try {
			documentBuilderFactory = DocumentBuilderFactory.newInstance();
			documentBuilder = documentBuilderFactory.newDocumentBuilder();
	
			Document document = documentBuilder.newDocument();
			Element elementRoot = document.createElement("tipotributarios");
			
			document.appendChild(elementRoot);
		    			
												
			Element element = null;//document.createElement("tipotributario");
			//elementRoot.appendChild(element);
		
			for(TipoTributario tipotributarioAux:tipotributariosSeleccionados) {
				element = document.createElement("tipotributario");
				elementRoot.appendChild(element);
			
				this.setFilaDatosExportarXmlTipoTributario(tipotributarioAux,document,element);
			}
			
			TransformerFactory transformerFactory = TransformerFactory.newInstance();
			Transformer transformer = transformerFactory.newTransformer();
			DOMSource domSource = new DOMSource(document);
			
			StreamResult streamResult = new StreamResult(new File(sPath));
	
			transformer.transform(domSource, streamResult);
						
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipotributarioSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Tributario",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			       				
		}
	}	
	
	//@SuppressWarnings("deprecation")
	public void getFilaCabeceraExportarExcelTipoTributario(HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(TipoTributarioConstantesFunciones.LABEL_ID);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
		cell = row.createCell(iColumn++);cell.setCellValue(TipoTributarioConstantesFunciones.LABEL_VERSIONROW);
		}

		cell = row.createCell(iColumn++);cell.setCellValue(TipoTributarioConstantesFunciones.LABEL_IDPAIS);
		cell = row.createCell(iColumn++);cell.setCellValue(TipoTributarioConstantesFunciones.LABEL_CODIGO);
		cell = row.createCell(iColumn++);cell.setCellValue(TipoTributarioConstantesFunciones.LABEL_NOMBRE);
	}
	
	//@SuppressWarnings("deprecation")
	public void getFilaDatosExportarExcelTipoTributario(TipoTributario tipotributario,HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(tipotributario.getId());
		cell = row.createCell(iColumn++);cell.setCellValue(tipotributario.getpais_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(tipotributario.getcodigo());
		cell = row.createCell(iColumn++);cell.setCellValue(tipotributario.getnombre());				
	}
	
	public void setFilaDatosExportarXmlTipoTributario(TipoTributario tipotributario,Document document,Element element) {
		/*
		Element lastname = document.createElement("lastname");
		lastname.appendChild(document.createTextNode("mook kim"));
		element.appendChild(lastname);
		*/
		

		Element elementId = document.createElement(TipoTributarioConstantesFunciones.ID);
		elementId.appendChild(document.createTextNode(tipotributario.getId().toString().trim()));
		element.appendChild(elementId);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){

		Element elementVersionRow = document.createElement(TipoTributarioConstantesFunciones.VERSIONROW);
		elementVersionRow.appendChild(document.createTextNode(tipotributario.getVersionRow().toString().trim()));
		element.appendChild(elementVersionRow);
		}


		Element elementpais_descripcion = document.createElement(TipoTributarioConstantesFunciones.IDPAIS);
		elementpais_descripcion.appendChild(document.createTextNode(tipotributario.getpais_descripcion()));
		element.appendChild(elementpais_descripcion);

		Element elementcodigo = document.createElement(TipoTributarioConstantesFunciones.CODIGO);
		elementcodigo.appendChild(document.createTextNode(tipotributario.getcodigo().trim()));
		element.appendChild(elementcodigo);

		Element elementnombre = document.createElement(TipoTributarioConstantesFunciones.NOMBRE);
		elementnombre.appendChild(document.createTextNode(tipotributario.getnombre().trim()));
		element.appendChild(elementnombre);
	}
	
	public void generarReporteGroupGenericoTipoTributariosSeleccionados(Boolean soloTotales) throws Exception {
		ArrayList<TipoTributario> tipotributariosSeleccionados=new ArrayList<TipoTributario>();
		
		tipotributariosSeleccionados=this.getTipoTributariosSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
		
		/*
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		if(!soloTotales) {
			this.sTipoReporteExtra=Constantes2.S_REPORTE_EXTRA_GROUP_GENERICO;
		} else {
			this.sTipoReporteExtra=Constantes2.S_REPORTE_EXTRA_GROUP_TOTALES_GENERICO;
		}
		
		this.setColumnaDescripcionReporteGroupGenericoTipoTributario(tipotributariosSeleccionados);
		
		this.generarReporteTipoTributarios("Todos",tipotributariosSeleccionados);
	}
	
	public void setColumnaDescripcionReporteGroupGenericoTipoTributario(ArrayList<TipoTributario> tipotributariosSeleccionados) throws Exception {    		
		try {
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			
			Boolean existe=false;
			
			for(TipoTributario tipotributarioAux:tipotributariosSeleccionados) {
				tipotributarioAux.setsDetalleGeneralEntityReporte(tipotributarioAux.toString());
			
				if(sTipoSeleccionar.equals(TipoTributarioConstantesFunciones.LABEL_IDPAIS)) {
					existe=true;
					tipotributarioAux.setsDescripcionGeneralEntityReporte1(tipotributarioAux.getpais_descripcion());
				}
				 else if(sTipoSeleccionar.equals(TipoTributarioConstantesFunciones.LABEL_CODIGO)) {
					existe=true;
					tipotributarioAux.setsDescripcionGeneralEntityReporte1(tipotributarioAux.getcodigo());
				}
				 else if(sTipoSeleccionar.equals(TipoTributarioConstantesFunciones.LABEL_NOMBRE)) {
					existe=true;
					tipotributarioAux.setsDescripcionGeneralEntityReporte1(tipotributarioAux.getnombre());
				}
			}	
											
			if(!existe) {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}										
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoTributarioConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void actualizarEstadoCeldasBotonesTipoTributario(String sAccion,Boolean isGuardarCambiosEnLote,Boolean isEsMantenimientoRelacionado) throws Exception {
		if(sAccion=="n") {
			if(!this.esParaBusquedaForeignKey) {
				this.isVisibilidadCeldaNuevoTipoTributario=true;
				this.isVisibilidadCeldaNuevoRelacionesTipoTributario=true;
				this.isVisibilidadCeldaGuardarCambiosTipoTributario=true;
			}
			
			this.isVisibilidadCeldaModificarTipoTributario=false;
			this.isVisibilidadCeldaActualizarTipoTributario=false;
			this.isVisibilidadCeldaEliminarTipoTributario=false;
			this.isVisibilidadCeldaCancelarTipoTributario=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoTributario=true;
				} else {
					this.isVisibilidadCeldaGuardarTipoTributario=false;
				}
			}
		} else if(sAccion=="a") {
			this.isVisibilidadCeldaNuevoTipoTributario=false;
			this.isVisibilidadCeldaNuevoRelacionesTipoTributario=false;
			this.isVisibilidadCeldaGuardarCambiosTipoTributario=false;
			this.isVisibilidadCeldaModificarTipoTributario=false;
			this.isVisibilidadCeldaActualizarTipoTributario=true;
			this.isVisibilidadCeldaEliminarTipoTributario=false;
			this.isVisibilidadCeldaCancelarTipoTributario=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoTributario=true;
				} else {
					this.isVisibilidadCeldaGuardarTipoTributario=false;
				}
			}
		} else if(sAccion=="ae") {
			this.isVisibilidadCeldaNuevoTipoTributario=false;
			this.isVisibilidadCeldaNuevoRelacionesTipoTributario=false;
			this.isVisibilidadCeldaGuardarCambiosTipoTributario=false;
			this.isVisibilidadCeldaModificarTipoTributario=false;
			this.isVisibilidadCeldaActualizarTipoTributario=true;
			this.isVisibilidadCeldaEliminarTipoTributario=true;
			this.isVisibilidadCeldaCancelarTipoTributario=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoTributario=true;
				} else {
					this.isVisibilidadCeldaGuardarTipoTributario=false;
				}
			}
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {
			this.isVisibilidadCeldaNuevoTipoTributario=false;
			this.isVisibilidadCeldaNuevoRelacionesTipoTributario=false;
			this.isVisibilidadCeldaGuardarCambiosTipoTributario=false;
			this.isVisibilidadCeldaModificarTipoTributario=false;
			this.isVisibilidadCeldaActualizarTipoTributario=true;
			this.isVisibilidadCeldaEliminarTipoTributario=false;
			this.isVisibilidadCeldaCancelarTipoTributario=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoTributario=false;
				} else {
					this.isVisibilidadCeldaGuardarTipoTributario=false;
				}
			}
		} else if(sAccion=="c") {
			this.isVisibilidadCeldaNuevoTipoTributario=true;
			this.isVisibilidadCeldaNuevoRelacionesTipoTributario=true;
			this.isVisibilidadCeldaGuardarCambiosTipoTributario=true;
			this.isVisibilidadCeldaModificarTipoTributario=false;
			this.isVisibilidadCeldaActualizarTipoTributario=false;
			this.isVisibilidadCeldaEliminarTipoTributario=false;
			this.isVisibilidadCeldaCancelarTipoTributario=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoTributario=true;
				} else {
					this.isVisibilidadCeldaGuardarTipoTributario=false;
				}
			}
		} else if(sAccion=="t") {
			this.isVisibilidadCeldaNuevoTipoTributario=false;
			this.isVisibilidadCeldaNuevoRelacionesTipoTributario=false;
			this.isVisibilidadCeldaGuardarCambiosTipoTributario=false;
			this.isVisibilidadCeldaActualizarTipoTributario=false;
			this.isVisibilidadCeldaEliminarTipoTributario=false;
			this.isVisibilidadCeldaCancelarTipoTributario=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoTributario=false;
				} else {
					this.isVisibilidadCeldaGuardarTipoTributario=false;
				}
			}
		}  else if(sAccion=="s"||sAccion=="s2") {
			this.isVisibilidadCeldaNuevoTipoTributario=false;
			this.isVisibilidadCeldaNuevoRelacionesTipoTributario=false;
			this.isVisibilidadCeldaGuardarCambiosTipoTributario=false;
			this.isVisibilidadCeldaModificarTipoTributario=true;
			this.isVisibilidadCeldaActualizarTipoTributario=false;
			this.isVisibilidadCeldaEliminarTipoTributario=false;
			this.isVisibilidadCeldaCancelarTipoTributario=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoTributario=false;
				} else {
					this.isVisibilidadCeldaGuardarTipoTributario=false;
				}
			}
		}
		
		//ACTUALIZA VISIBILIDAD PANELES
		if(TipoTributarioJInternalFrame.CON_DATOS_FRAME && !this.esParaBusquedaForeignKey) {
			//SIEMPRE VISIBLE
			this.isVisibilidadCeldaNuevoTipoTributario=true;
			this.isVisibilidadCeldaNuevoRelacionesTipoTributario=true;
			this.isVisibilidadCeldaGuardarCambiosTipoTributario=true;
		} else {
			this.actualizarEstadoPanelsTipoTributario(sAccion);						
		}
		
		if(this.esParaBusquedaForeignKey) {
			this.isVisibilidadCeldaCopiarTipoTributario=false;
			//this.isVisibilidadCeldaVerFormTipoTributario=false;
			this.isVisibilidadCeldaDuplicarTipoTributario=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONES
		if(!tipotributarioSessionBean.getConGuardarRelaciones()) {
			this.isVisibilidadCeldaNuevoRelacionesTipoTributario=false;
		} else {
			this.isVisibilidadCeldaNuevoTipoTributario=false;
			this.isVisibilidadCeldaGuardarCambiosTipoTributario=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONADO
		if(tipotributarioSessionBean.getEsGuardarRelacionado()) {
			if(!tipotributarioSessionBean.getConGuardarRelaciones()) {	
				this.isVisibilidadCeldaNuevoRelacionesTipoTributario=false;												
			}
			
			this.jButtonCerrarTipoTributario.setVisible(false);
		}
		
		//SI NO TIENE MAXIMO DE RELACIONES PERMITIDAS
		if(!this.conMaximoRelaciones) {
			this.isVisibilidadCeldaNuevoRelacionesTipoTributario=false;
		}
		
		if(!this.permiteMantenimiento(this.tipotributario)) {
			this.isVisibilidadCeldaActualizarTipoTributario=false;
			this.isVisibilidadCeldaEliminarTipoTributario=false;
		}
		
		
		
	}
	
	public void actualizarEstadoCeldasBotonesConGuardarRelacionesTipoTributario() {
		this.isVisibilidadCeldaNuevoTipoTributario=false;
		this.isVisibilidadCeldaGuardarCambiosTipoTributario=false;
	}
	
	public void actualizarEstadoPanelsTipoTributario(String sAccion) {
		if(sAccion=="n") {
			if(this.jScrollPanelDatosEdicionTipoTributario!=null) {
				this.jScrollPanelDatosEdicionTipoTributario.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasTipoTributario!=null) {
				this.jTabbedPaneBusquedasTipoTributario.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosTipoTributario!=null) {
				this.jScrollPanelDatosTipoTributario.setVisible(true);
			}
			
			if(this.jPanelPaginacionTipoTributario!=null) {
				this.jPanelPaginacionTipoTributario.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesTipoTributario!=null) {
				this.jPanelParametrosReportesTipoTributario.setVisible(true);		    
			}
			
		} else if(sAccion=="a") {				
			if(this.jScrollPanelDatosEdicionTipoTributario!=null) {
				this.jScrollPanelDatosEdicionTipoTributario.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasTipoTributario!=null) {
				this.jTabbedPaneBusquedasTipoTributario.setVisible(false);			
			}
			
			
			
			if(this.jScrollPanelDatosTipoTributario!=null) {
				this.jScrollPanelDatosTipoTributario.setVisible(false);
			}
			
			if(this.jPanelPaginacionTipoTributario!=null) {
				this.jPanelPaginacionTipoTributario.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesTipoTributario!=null) {
				this.jPanelParametrosReportesTipoTributario.setVisible(false);
			}
						
		} else if(sAccion=="ae") {		
			if(this.jScrollPanelDatosEdicionTipoTributario!=null) {
				this.jScrollPanelDatosEdicionTipoTributario.setVisible(true);		
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasTipoTributario!=null) {
				this.jTabbedPaneBusquedasTipoTributario.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosTipoTributario!=null) {
				this.jScrollPanelDatosTipoTributario.setVisible(false);
			}
			
			if(this.jPanelPaginacionTipoTributario!=null) {
				this.jPanelPaginacionTipoTributario.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesTipoTributario!=null) {
				this.jPanelParametrosReportesTipoTributario.setVisible(false);
			}
						
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {	
			if(this.jScrollPanelDatosEdicionTipoTributario!=null) {
				this.jScrollPanelDatosEdicionTipoTributario.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasTipoTributario!=null) {
				this.jTabbedPaneBusquedasTipoTributario.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosTipoTributario!=null) {
				this.jScrollPanelDatosTipoTributario.setVisible(false);
			}
			
			if(this.jPanelPaginacionTipoTributario!=null) {
				this.jPanelPaginacionTipoTributario.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesTipoTributario!=null) {
				this.jPanelParametrosReportesTipoTributario.setVisible(false);
			}
						
		} else if(sAccion=="c") {	
			if(this.jScrollPanelDatosEdicionTipoTributario!=null) {
				this.jScrollPanelDatosEdicionTipoTributario.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasTipoTributario!=null) {
				this.jTabbedPaneBusquedasTipoTributario.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosTipoTributario!=null) {
				this.jScrollPanelDatosTipoTributario.setVisible(true);
			}
			
			if(this.jPanelPaginacionTipoTributario!=null) {
				this.jPanelPaginacionTipoTributario.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesTipoTributario!=null) {
				this.jPanelParametrosReportesTipoTributario.setVisible(true);
			}
						
		} else if(sAccion=="t") {
			
			if(this.jScrollPanelDatosEdicionTipoTributario!=null) {
				this.jScrollPanelDatosEdicionTipoTributario.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasTipoTributario!=null) {
				this.jTabbedPaneBusquedasTipoTributario.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosTipoTributario!=null) {
				this.jScrollPanelDatosTipoTributario.setVisible(true);
			}
			
			if(this.jPanelPaginacionTipoTributario!=null) {
				this.jPanelPaginacionTipoTributario.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesTipoTributario!=null) {
				this.jPanelParametrosReportesTipoTributario.setVisible(true);
			}
						
		}  else if(sAccion=="s"||sAccion=="s2") {
			if(this.jScrollPanelDatosEdicionTipoTributario!=null) {
				this.jScrollPanelDatosEdicionTipoTributario.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasTipoTributario!=null) {
				this.jTabbedPaneBusquedasTipoTributario.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosTipoTributario!=null) {
				this.jScrollPanelDatosTipoTributario.setVisible(true);
			}
			
			if(this.jPanelPaginacionTipoTributario!=null) {
				this.jPanelPaginacionTipoTributario.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesTipoTributario!=null) {
				this.jPanelParametrosReportesTipoTributario.setVisible(true);
			}
			
		} 
		
		if(sAccion.equals("relacionado") || this.tipotributarioSessionBean.getEsGuardarRelacionado()) {
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				if(this.jTabbedPaneBusquedasTipoTributario!=null) {
					this.jTabbedPaneBusquedasTipoTributario.setVisible(false);				
				}
				
			}
			
			if(this.jPanelParametrosReportesTipoTributario!=null) {
				this.jPanelParametrosReportesTipoTributario.setVisible(false);
			}
		
		} else if(sAccion.equals("no_relacionado") && !this.tipotributarioSessionBean.getEsGuardarRelacionado()) {
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasTipoTributario!=null) {
				this.jTabbedPaneBusquedasTipoTributario.setVisible(true);			
			}
			
			if(this.jPanelParametrosReportesTipoTributario!=null) {
				this.jPanelParametrosReportesTipoTributario.setVisible(true);
			}
		}
	}	
	
	

	public void setVisibilidadBusquedasParaPais(Boolean isParaPais){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaPaisNegation=!isParaPais;

			this.isVisibilidadBusquedaPorCodigo=isParaPaisNegation;
			if(!this.isVisibilidadBusquedaPorCodigo) {this.jTabbedPaneBusquedasTipoTributario.remove(jPanelBusquedaPorCodigoTipoTributario);}

			this.isVisibilidadBusquedaPorId=isParaPaisNegation;
			if(!this.isVisibilidadBusquedaPorId) {this.jTabbedPaneBusquedasTipoTributario.remove(jPanelBusquedaPorIdTipoTributario);}

			this.isVisibilidadBusquedaPorNombre=isParaPaisNegation;
			if(!this.isVisibilidadBusquedaPorNombre) {this.jTabbedPaneBusquedasTipoTributario.remove(jPanelBusquedaPorNombreTipoTributario);}

			this.isVisibilidadFK_IdPais=isParaPais;
			if(!this.isVisibilidadFK_IdPais) {this.jTabbedPaneBusquedasTipoTributario.remove(jPanelFK_IdPaisTipoTributario);}
		}
		
	}
	
	

	public String registrarSesionTipoTributarioParaTransaccionLocales() throws Exception {
		Boolean isPaginaPopupTransaccionLocal=false;

		try {

			if(this.tipotributarioSessionBean==null) {
				this.tipotributarioSessionBean=new TipoTributarioSessionBean();
			}

			if(this.jInternalFrameDetalleFormTipoTributario.transaccionlocalSessionBean==null) {
				this.jInternalFrameDetalleFormTipoTributario.transaccionlocalSessionBean=new TransaccionLocalSessionBean();
			}

			this.jInternalFrameDetalleFormTipoTributario.transaccionlocalSessionBean.setsPathNavegacionActual(tipotributarioSessionBean.getsPathNavegacionActual()+Constantes.SHTMLFLECHA+TransaccionLocalConstantesFunciones.SCLASSWEBTITULO);
			this.jInternalFrameDetalleFormTipoTributario.transaccionlocalSessionBean.setisPermiteRecargarInformacion(false);
			isPaginaPopupTransaccionLocal=this.jInternalFrameDetalleFormTipoTributario.transaccionlocalSessionBean.getisPaginaPopup();
			this.jInternalFrameDetalleFormTipoTributario.transaccionlocalSessionBean.setisPermiteNavegacionHaciaForeignKeyDesdeTransaccionLocal(true);
			this.jInternalFrameDetalleFormTipoTributario.transaccionlocalSessionBean.setsNombrePaginaNavegacionHaciaForeignKeyDesdeTransaccionLocal(TipoTributarioConstantesFunciones.SNOMBREOPCION);
			this.jInternalFrameDetalleFormTipoTributario.transaccionlocalSessionBean.setisBusquedaDesdeForeignKeySesionTipoTributario(true);
			this.jInternalFrameDetalleFormTipoTributario.transaccionlocalSessionBean.setlidTipoTributarioActual(this.idTipoTributarioActual);

			tipotributarioSessionBean.setisBusquedaDesdeForeignKeySesionForeignKeyTipoTributario(true);
			tipotributarioSessionBean.setlIdTipoTributarioActualForeignKey(this.idTipoTributarioActual);

			String strPagina=Constantes.SNONE;
			SistemaLogicAdditional sistemaLogicAdditional=new SistemaLogicAdditional();

			guardarDatosBusquedaSession();

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}

		return "";
	}

	public String registrarSesionTipoTributarioParaFacturaProveedorServicios() throws Exception {
		Boolean isPaginaPopupFacturaProveedorServicio=false;

		try {

			if(this.tipotributarioSessionBean==null) {
				this.tipotributarioSessionBean=new TipoTributarioSessionBean();
			}

			if(this.jInternalFrameDetalleFormTipoTributario.facturaproveedorservicioSessionBean==null) {
				this.jInternalFrameDetalleFormTipoTributario.facturaproveedorservicioSessionBean=new FacturaProveedorServicioSessionBean();
			}

			this.jInternalFrameDetalleFormTipoTributario.facturaproveedorservicioSessionBean.setsPathNavegacionActual(tipotributarioSessionBean.getsPathNavegacionActual()+Constantes.SHTMLFLECHA+FacturaProveedorServicioConstantesFunciones.SCLASSWEBTITULO);
			this.jInternalFrameDetalleFormTipoTributario.facturaproveedorservicioSessionBean.setisPermiteRecargarInformacion(false);
			isPaginaPopupFacturaProveedorServicio=this.jInternalFrameDetalleFormTipoTributario.facturaproveedorservicioSessionBean.getisPaginaPopup();
			this.jInternalFrameDetalleFormTipoTributario.facturaproveedorservicioSessionBean.setisPermiteNavegacionHaciaForeignKeyDesdeFacturaProveedorServicio(true);
			this.jInternalFrameDetalleFormTipoTributario.facturaproveedorservicioSessionBean.setsNombrePaginaNavegacionHaciaForeignKeyDesdeFacturaProveedorServicio(TipoTributarioConstantesFunciones.SNOMBREOPCION);
			this.jInternalFrameDetalleFormTipoTributario.facturaproveedorservicioSessionBean.setisBusquedaDesdeForeignKeySesionTipoTributario(true);
			this.jInternalFrameDetalleFormTipoTributario.facturaproveedorservicioSessionBean.setlidTipoTributarioActual(this.idTipoTributarioActual);

			tipotributarioSessionBean.setisBusquedaDesdeForeignKeySesionForeignKeyTipoTributario(true);
			tipotributarioSessionBean.setlIdTipoTributarioActualForeignKey(this.idTipoTributarioActual);

			String strPagina=Constantes.SNONE;
			SistemaLogicAdditional sistemaLogicAdditional=new SistemaLogicAdditional();

			guardarDatosBusquedaSession();

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}

		return "";
	}

	public String registrarSesionTipoTributarioParaDefiniciones() throws Exception {
		Boolean isPaginaPopupDefinicion=false;

		try {

			if(this.tipotributarioSessionBean==null) {
				this.tipotributarioSessionBean=new TipoTributarioSessionBean();
			}

			if(this.jInternalFrameDetalleFormTipoTributario.definicionSessionBean==null) {
				this.jInternalFrameDetalleFormTipoTributario.definicionSessionBean=new DefinicionSessionBean();
			}

			this.jInternalFrameDetalleFormTipoTributario.definicionSessionBean.setsPathNavegacionActual(tipotributarioSessionBean.getsPathNavegacionActual()+Constantes.SHTMLFLECHA+DefinicionConstantesFunciones.SCLASSWEBTITULO);
			this.jInternalFrameDetalleFormTipoTributario.definicionSessionBean.setisPermiteRecargarInformacion(false);
			isPaginaPopupDefinicion=this.jInternalFrameDetalleFormTipoTributario.definicionSessionBean.getisPaginaPopup();
			this.jInternalFrameDetalleFormTipoTributario.definicionSessionBean.setisPermiteNavegacionHaciaForeignKeyDesdeDefinicion(true);
			this.jInternalFrameDetalleFormTipoTributario.definicionSessionBean.setsNombrePaginaNavegacionHaciaForeignKeyDesdeDefinicion(TipoTributarioConstantesFunciones.SNOMBREOPCION);
			this.jInternalFrameDetalleFormTipoTributario.definicionSessionBean.setisBusquedaDesdeForeignKeySesionTipoTributario(true);
			this.jInternalFrameDetalleFormTipoTributario.definicionSessionBean.setlidTipoTributarioActual(this.idTipoTributarioActual);

			tipotributarioSessionBean.setisBusquedaDesdeForeignKeySesionForeignKeyTipoTributario(true);
			tipotributarioSessionBean.setlIdTipoTributarioActualForeignKey(this.idTipoTributarioActual);

			String strPagina=Constantes.SNONE;
			SistemaLogicAdditional sistemaLogicAdditional=new SistemaLogicAdditional();

			guardarDatosBusquedaSession();

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}

		return "";
	}
	
	
	
	
	public void guardarDatosBusquedaSession() throws Exception {
		
		//TipoTributarioSessionBean tipotributarioSessionBean=new TipoTributarioSessionBean();
		
		if(this.tipotributarioSessionBean==null) {
			this.tipotributarioSessionBean=new TipoTributarioSessionBean();
		}
		
		this.tipotributarioSessionBean.setsUltimaBusquedaTipoTributario(this.getsAccionBusqueda());
		this.tipotributarioSessionBean.setiNumeroPaginacion(this.getiNumeroPaginacion());
		this.tipotributarioSessionBean.setiNumeroPaginacionPagina(this.getiNumeroPaginacionPagina());
		
		if(this.getsAccionBusqueda().equals("Todos")) {
			;
		}
		

		else if(this.getsAccionBusqueda().equals("BusquedaPorCodigo")) {
			tipotributarioSessionBean.setcodigo(this.getcodigoBusquedaPorCodigo());	
		}
		else if(this.getsAccionBusqueda().equals("BusquedaPorId")) {
			tipotributarioSessionBean.setid(this.getidBusquedaPorId());	
		}
		else if(this.getsAccionBusqueda().equals("BusquedaPorNombre")) {
			tipotributarioSessionBean.setnombre(this.getnombreBusquedaPorNombre());	
		}
		else if(this.getsAccionBusqueda().equals("FK_IdPais")) {
			tipotributarioSessionBean.setid_pais(this.getid_paisFK_IdPais());	
		}
		
	}
	
	public void traerDatosBusquedaDesdeSession() throws Exception {
		//TipoTributarioSessionBean tipotributarioSessionBean=new TipoTributarioSessionBean();
		
		if(this.tipotributarioSessionBean==null) {
			this.tipotributarioSessionBean=new TipoTributarioSessionBean();
		}
		
		if(this.tipotributarioSessionBean.getsUltimaBusquedaTipoTributario()!=null&&!this.tipotributarioSessionBean.getsUltimaBusquedaTipoTributario().equals("")) {
			this.setsAccionBusqueda(tipotributarioSessionBean.getsUltimaBusquedaTipoTributario());
			this.setiNumeroPaginacion(tipotributarioSessionBean.getiNumeroPaginacion());
			this.setiNumeroPaginacionPagina(tipotributarioSessionBean.getiNumeroPaginacionPagina());		
				
			if(this.getsAccionBusqueda().equals("Todos")) {
				;
			}
			

			 else if(this.getsAccionBusqueda().equals("BusquedaPorCodigo")) {
				this.setcodigoBusquedaPorCodigo(tipotributarioSessionBean.getcodigo());
				tipotributarioSessionBean.setcodigo("");
			}
			 else if(this.getsAccionBusqueda().equals("BusquedaPorId")) {
				this.setidBusquedaPorId(tipotributarioSessionBean.getid());
				tipotributarioSessionBean.setid(0L);
			}
			 else if(this.getsAccionBusqueda().equals("BusquedaPorNombre")) {
				this.setnombreBusquedaPorNombre(tipotributarioSessionBean.getnombre());
				tipotributarioSessionBean.setnombre("");
			}
			 else if(this.getsAccionBusqueda().equals("FK_IdPais")) {
				this.setid_paisFK_IdPais(tipotributarioSessionBean.getid_pais());
				tipotributarioSessionBean.setid_pais(-1L);
			}
		}
		
		this.tipotributarioSessionBean.setsUltimaBusquedaTipoTributario("");
		this.tipotributarioSessionBean.setiNumeroPaginacion(TipoTributarioConstantesFunciones.INUMEROPAGINACION);
		this.tipotributarioSessionBean.setiNumeroPaginacionPagina(0);
		
	}
	
	public void procesoActualizarFilaTotales(Boolean esCampoValor,String sTipo) {
		try {
			this.actualizarFilaTotales();
				
			this.traerValoresTablaTotales();
			
			this.inicializarActualizarBindingTablaTipoTributario(false);
			
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	public void updateBusquedasFormularioTipoTributario() {
		this.updateBorderResaltarBusquedasFormularioTipoTributario();
		this.updateVisibilidadBusquedasFormularioTipoTributario();
		this.updateHabilitarBusquedasFormularioTipoTributario();
	}
	
	public void updateBorderResaltarBusquedasFormularioTipoTributario() {					
	//BYDAN_BUSQUEDAS
		
	int index=0;
		
	if(this.jTabbedPaneBusquedasTipoTributario.getComponents().length>0) {
	

		if(this.tipotributarioConstantesFunciones.resaltarBusquedaPorCodigoTipoTributario!=null) {
			index= this.jTabbedPaneBusquedasTipoTributario.indexOfComponent(this.jPanelBusquedaPorCodigoTipoTributario);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasTipoTributario.getComponent(index);
				jPanel.setBorder(this.tipotributarioConstantesFunciones.resaltarBusquedaPorCodigoTipoTributario);
			}
		}

		if(this.tipotributarioConstantesFunciones.resaltarBusquedaPorIdTipoTributario!=null) {
			index= this.jTabbedPaneBusquedasTipoTributario.indexOfComponent(this.jPanelBusquedaPorIdTipoTributario);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasTipoTributario.getComponent(index);
				jPanel.setBorder(this.tipotributarioConstantesFunciones.resaltarBusquedaPorIdTipoTributario);
			}
		}

		if(this.tipotributarioConstantesFunciones.resaltarBusquedaPorNombreTipoTributario!=null) {
			index= this.jTabbedPaneBusquedasTipoTributario.indexOfComponent(this.jPanelBusquedaPorNombreTipoTributario);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasTipoTributario.getComponent(index);
				jPanel.setBorder(this.tipotributarioConstantesFunciones.resaltarBusquedaPorNombreTipoTributario);
			}
		}

		if(this.tipotributarioConstantesFunciones.resaltarFK_IdPaisTipoTributario!=null) {
			index= this.jTabbedPaneBusquedasTipoTributario.indexOfComponent(this.jPanelFK_IdPaisTipoTributario);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasTipoTributario.getComponent(index);
				jPanel.setBorder(this.tipotributarioConstantesFunciones.resaltarFK_IdPaisTipoTributario);
			}
		}
	}	
	
	}
	
	public void updateVisibilidadBusquedasFormularioTipoTributario() {
	//BYDAN_BUSQUEDAS
	
	int index=0;
	JPanel jPanel=null;
		
	if(this.jTabbedPaneBusquedasTipoTributario.getComponents().length>0) {
	

			index= this.jTabbedPaneBusquedasTipoTributario.indexOfComponent(this.jPanelBusquedaPorCodigoTipoTributario);
			jPanel=(JPanel)this.jTabbedPaneBusquedasTipoTributario.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.tipotributarioConstantesFunciones.mostrarBusquedaPorCodigoTipoTributario);
			if(!this.tipotributarioConstantesFunciones.mostrarBusquedaPorCodigoTipoTributario && index>-1) {
				this.jTabbedPaneBusquedasTipoTributario.remove(index);
			}

			index= this.jTabbedPaneBusquedasTipoTributario.indexOfComponent(this.jPanelBusquedaPorIdTipoTributario);
			jPanel=(JPanel)this.jTabbedPaneBusquedasTipoTributario.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.tipotributarioConstantesFunciones.mostrarBusquedaPorIdTipoTributario);
			if(!this.tipotributarioConstantesFunciones.mostrarBusquedaPorIdTipoTributario && index>-1) {
				this.jTabbedPaneBusquedasTipoTributario.remove(index);
			}

			index= this.jTabbedPaneBusquedasTipoTributario.indexOfComponent(this.jPanelBusquedaPorNombreTipoTributario);
			jPanel=(JPanel)this.jTabbedPaneBusquedasTipoTributario.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.tipotributarioConstantesFunciones.mostrarBusquedaPorNombreTipoTributario);
			if(!this.tipotributarioConstantesFunciones.mostrarBusquedaPorNombreTipoTributario && index>-1) {
				this.jTabbedPaneBusquedasTipoTributario.remove(index);
			}

			index= this.jTabbedPaneBusquedasTipoTributario.indexOfComponent(this.jPanelFK_IdPaisTipoTributario);
			jPanel=(JPanel)this.jTabbedPaneBusquedasTipoTributario.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.tipotributarioConstantesFunciones.mostrarFK_IdPaisTipoTributario);
			if(!this.tipotributarioConstantesFunciones.mostrarFK_IdPaisTipoTributario && index>-1) {
				this.jTabbedPaneBusquedasTipoTributario.remove(index);
			}
	}	
	
	}
	
	public void updateHabilitarBusquedasFormularioTipoTributario() {
	
	//BYDAN_BUSQUEDAS		
		int index=0;
		JPanel jPanel=null;
			
		if(this.jTabbedPaneBusquedasTipoTributario.getComponents().length>0) {
	

			index= this.jTabbedPaneBusquedasTipoTributario.indexOfComponent(this.jPanelBusquedaPorCodigoTipoTributario);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedasTipoTributario.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.tipotributarioConstantesFunciones.activarBusquedaPorCodigoTipoTributario);
				this.jTabbedPaneBusquedasTipoTributario.setEnabledAt(index,this.tipotributarioConstantesFunciones.activarBusquedaPorCodigoTipoTributario);
			}

			index= this.jTabbedPaneBusquedasTipoTributario.indexOfComponent(this.jPanelBusquedaPorIdTipoTributario);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedasTipoTributario.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.tipotributarioConstantesFunciones.activarBusquedaPorIdTipoTributario);
				this.jTabbedPaneBusquedasTipoTributario.setEnabledAt(index,this.tipotributarioConstantesFunciones.activarBusquedaPorIdTipoTributario);
			}

			index= this.jTabbedPaneBusquedasTipoTributario.indexOfComponent(this.jPanelBusquedaPorNombreTipoTributario);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedasTipoTributario.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.tipotributarioConstantesFunciones.activarBusquedaPorNombreTipoTributario);
				this.jTabbedPaneBusquedasTipoTributario.setEnabledAt(index,this.tipotributarioConstantesFunciones.activarBusquedaPorNombreTipoTributario);
			}

			index= this.jTabbedPaneBusquedasTipoTributario.indexOfComponent(this.jPanelFK_IdPaisTipoTributario);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedasTipoTributario.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.tipotributarioConstantesFunciones.activarFK_IdPaisTipoTributario);
				this.jTabbedPaneBusquedasTipoTributario.setEnabledAt(index,this.tipotributarioConstantesFunciones.activarFK_IdPaisTipoTributario);
			}
		}	
	
	}
	
	
	public void resaltarPanelBusquedaTipoTributario(String sTipoBusqueda) {
		Boolean existe=false;
		//BYDAN_BUSQUEDAS
		
		int index=0;
		Border resaltar = Funciones2.getBorderResaltar(this.parametroGeneralUsuario,"TAB");

		if(sTipoBusqueda.equals("BusquedaPorCodigo")) {
			index= this.jTabbedPaneBusquedasTipoTributario.indexOfComponent(this.jPanelBusquedaPorCodigoTipoTributario);

			this.jTabbedPaneBusquedasTipoTributario.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasTipoTributario.getComponent(index);

			this.tipotributarioConstantesFunciones.setResaltarBusquedaPorCodigoTipoTributario(resaltar);

			jPanel.setBorder(this.tipotributarioConstantesFunciones.resaltarBusquedaPorCodigoTipoTributario);
			existe=true;
		}
		else if(sTipoBusqueda.equals("BusquedaPorId")) {
			index= this.jTabbedPaneBusquedasTipoTributario.indexOfComponent(this.jPanelBusquedaPorIdTipoTributario);

			this.jTabbedPaneBusquedasTipoTributario.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasTipoTributario.getComponent(index);

			this.tipotributarioConstantesFunciones.setResaltarBusquedaPorIdTipoTributario(resaltar);

			jPanel.setBorder(this.tipotributarioConstantesFunciones.resaltarBusquedaPorIdTipoTributario);
			existe=true;
		}
		else if(sTipoBusqueda.equals("BusquedaPorNombre")) {
			index= this.jTabbedPaneBusquedasTipoTributario.indexOfComponent(this.jPanelBusquedaPorNombreTipoTributario);

			this.jTabbedPaneBusquedasTipoTributario.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasTipoTributario.getComponent(index);

			this.tipotributarioConstantesFunciones.setResaltarBusquedaPorNombreTipoTributario(resaltar);

			jPanel.setBorder(this.tipotributarioConstantesFunciones.resaltarBusquedaPorNombreTipoTributario);
			existe=true;
		}
		else if(sTipoBusqueda.equals("FK_IdPais")) {
			index= this.jTabbedPaneBusquedasTipoTributario.indexOfComponent(this.jPanelFK_IdPaisTipoTributario);

			this.jTabbedPaneBusquedasTipoTributario.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasTipoTributario.getComponent(index);

			this.tipotributarioConstantesFunciones.setResaltarFK_IdPaisTipoTributario(resaltar);

			jPanel.setBorder(this.tipotributarioConstantesFunciones.resaltarFK_IdPaisTipoTributario);
			existe=true;
		}
		

		if(existe) {
			
			this.jTtoolBarTipoTributario.setBorder(resaltar);
			
		}
	}	
	
	//NO FUNCIONA
	public void windowClosed(WindowEvent e) {	
	}
		
	public void windowClosing(WindowEvent e) {	    	    
	}

	public void windowOpened(WindowEvent e) {	    
	}

	public void windowIconified(WindowEvent e) {	    
	}

	public void windowDeiconified(WindowEvent e) {	    
	}

	public void windowActivated(WindowEvent e) {	    
	}

	public void windowDeactivated(WindowEvent e) {	    
	}

	public void windowGainedFocus(WindowEvent e) {	    
	}

	public void windowLostFocus(WindowEvent e) {	    
	}
	
	public void updateControlesFormularioTipoTributario() throws Exception {

		if(this.jInternalFrameDetalleFormTipoTributario==null) { //if(!this.conCargarFormDetalle) {			
			this.inicializarFormDetalle();
		}
		
		this.updateBorderResaltarControlesFormularioTipoTributario();
		this.updateVisibilidadResaltarControlesFormularioTipoTributario();
		this.updateHabilitarResaltarControlesFormularioTipoTributario();
		
	}
	
	public void updateBorderResaltarControlesFormularioTipoTributario() throws Exception {
		if(this.jInternalFrameDetalleFormTipoTributario==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
	
		if(this.tipotributarioConstantesFunciones.resaltaridTipoTributario!=null && this.jInternalFrameDetalleFormTipoTributario!=null) {this.jInternalFrameDetalleFormTipoTributario.jLabelidTipoTributario.setBorder(this.tipotributarioConstantesFunciones.resaltaridTipoTributario);}
		if(this.tipotributarioConstantesFunciones.resaltarid_paisTipoTributario!=null && this.jInternalFrameDetalleFormTipoTributario!=null) {this.jInternalFrameDetalleFormTipoTributario.jComboBoxid_paisTipoTributario.setBorder(this.tipotributarioConstantesFunciones.resaltarid_paisTipoTributario);}
		if(this.tipotributarioConstantesFunciones.resaltarcodigoTipoTributario!=null && this.jInternalFrameDetalleFormTipoTributario!=null) {this.jInternalFrameDetalleFormTipoTributario.jTextAreacodigoTipoTributario.setBorder(this.tipotributarioConstantesFunciones.resaltarcodigoTipoTributario);}
		if(this.tipotributarioConstantesFunciones.resaltarnombreTipoTributario!=null && this.jInternalFrameDetalleFormTipoTributario!=null) {this.jInternalFrameDetalleFormTipoTributario.jTextAreanombreTipoTributario.setBorder(this.tipotributarioConstantesFunciones.resaltarnombreTipoTributario);}
	}
	
	public void updateVisibilidadResaltarControlesFormularioTipoTributario() throws Exception {		
		if(this.jInternalFrameDetalleFormTipoTributario==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormTipoTributario!=null) {
	
		//this.jInternalFrameDetalleFormTipoTributario.jLabelidTipoTributario.setVisible(this.tipotributarioConstantesFunciones.mostraridTipoTributario);
		this.jInternalFrameDetalleFormTipoTributario.jPanelidTipoTributario.setVisible(this.tipotributarioConstantesFunciones.mostraridTipoTributario);
		//this.jInternalFrameDetalleFormTipoTributario.jComboBoxid_paisTipoTributario.setVisible(this.tipotributarioConstantesFunciones.mostrarid_paisTipoTributario);
		this.jInternalFrameDetalleFormTipoTributario.jPanelid_paisTipoTributario.setVisible(this.tipotributarioConstantesFunciones.mostrarid_paisTipoTributario);
		//this.jInternalFrameDetalleFormTipoTributario.jTextAreacodigoTipoTributario.setVisible(this.tipotributarioConstantesFunciones.mostrarcodigoTipoTributario);
		this.jInternalFrameDetalleFormTipoTributario.jPanelcodigoTipoTributario.setVisible(this.tipotributarioConstantesFunciones.mostrarcodigoTipoTributario);
		//this.jInternalFrameDetalleFormTipoTributario.jTextAreanombreTipoTributario.setVisible(this.tipotributarioConstantesFunciones.mostrarnombreTipoTributario);
		this.jInternalFrameDetalleFormTipoTributario.jPanelnombreTipoTributario.setVisible(this.tipotributarioConstantesFunciones.mostrarnombreTipoTributario);
		}
	}
	
	public void updateHabilitarResaltarControlesFormularioTipoTributario() throws Exception {
		if(this.jInternalFrameDetalleFormTipoTributario==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormTipoTributario!=null) {
	
		this.jInternalFrameDetalleFormTipoTributario.jLabelidTipoTributario.setEnabled(this.tipotributarioConstantesFunciones.activaridTipoTributario);
		this.jInternalFrameDetalleFormTipoTributario.jComboBoxid_paisTipoTributario.setEnabled(this.tipotributarioConstantesFunciones.activarid_paisTipoTributario);
		this.jInternalFrameDetalleFormTipoTributario.jTextAreacodigoTipoTributario.setEnabled(this.tipotributarioConstantesFunciones.activarcodigoTipoTributario);
		this.jInternalFrameDetalleFormTipoTributario.jTextAreanombreTipoTributario.setEnabled(this.tipotributarioConstantesFunciones.activarnombreTipoTributario);
		}
	}
	
		
}