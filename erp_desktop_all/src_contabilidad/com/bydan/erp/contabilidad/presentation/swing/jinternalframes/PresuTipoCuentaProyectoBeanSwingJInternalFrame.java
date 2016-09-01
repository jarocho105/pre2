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

import com.bydan.erp.contabilidad.util.PresuTipoCuentaProyectoConstantesFunciones;
import com.bydan.erp.contabilidad.util.PresuTipoCuentaProyectoParameterReturnGeneral;
//import com.bydan.erp.contabilidad.util.PresuTipoCuentaProyectoParameterGeneral;
//import com.bydan.erp.contabilidad.presentation.report.source.PresuTipoCuentaProyectoBean;
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
import com.bydan.erp.nomina.business.logic.*;

//EJB

//PARAMETROS


//EJB PARAMETROS

import com.bydan.framework.erp.business.logic.*;
import com.bydan.framework.erp.util.*;

import com.bydan.erp.contabilidad.business.entity.*;
//import com.bydan.framework.erp.business.entity.ConexionBeanFace;
//import com.bydan.framework.erp.business.entity.Mensajes;


import com.bydan.erp.seguridad.presentation.swing.jinternalframes.*;
import com.bydan.erp.nomina.presentation.swing.jinternalframes.*;

import com.bydan.erp.seguridad.presentation.swing.jinternalframes.auxiliar.*;
import com.bydan.erp.nomina.presentation.swing.jinternalframes.auxiliar.*;






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
import com.bydan.erp.nomina.business.entity.*;
import com.bydan.erp.seguridad.util.*;
import com.bydan.erp.nomina.util.*;
import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.nomina.presentation.web.jsf.sessionbean.*;


@SuppressWarnings("unused")
public class PresuTipoCuentaProyectoBeanSwingJInternalFrame extends PresuTipoCuentaProyectoJInternalFrame implements WindowListener,WindowFocusListener
{				
	
	public static final long serialVersionUID = 1L;
	
	public static Logger logger = Logger.getLogger(PresuTipoCuentaProyectoBeanSwingJInternalFrame.class);  
	
	public static ClassValidator<PresuTipoCuentaProyecto> presutipocuentaproyectoValidator = new ClassValidator<PresuTipoCuentaProyecto>(PresuTipoCuentaProyecto.class);
	
	public InvalidValue[] invalidValues=null;
		

	//Ejb Foreign Keys
	
	public PresuTipoCuentaProyecto presutipocuentaproyecto;	
	public PresuTipoCuentaProyecto presutipocuentaproyectoAux;
	public PresuTipoCuentaProyecto presutipocuentaproyectoAnterior;//USADO PARA MANEJAR FOCUS GAINED,LOST
	public PresuTipoCuentaProyecto presutipocuentaproyectoTotales;
	public Long idPresuTipoCuentaProyectoActual;
	public Long iIdNuevoPresuTipoCuentaProyecto=0L;
	public int rowIndexActual=0;
	
	
	
	
	public String sFinalQueryComboEmpresa="";

	public List<Empresa> empresasForeignKey;

	public List<Empresa> getempresasForeignKey() {
		return empresasForeignKey;
	}

	public void setempresasForeignKey(List<Empresa> empresasForeignKey) {
		this.empresasForeignKey = empresasForeignKey;
	}

	//OBJETO FK ACTUAL
	public Empresa empresaForeignKey;

	public Empresa getempresaForeignKey() {
		return empresaForeignKey;
	}

	public void setempresaForeignKey(Empresa empresaForeignKey) {
		this.empresaForeignKey = empresaForeignKey;
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
	
	public Boolean isPermisoTodoPresuTipoCuentaProyecto;
	public Boolean isPermisoNuevoPresuTipoCuentaProyecto;
	public Boolean isPermisoActualizarPresuTipoCuentaProyecto;
	public Boolean isPermisoActualizarOriginalPresuTipoCuentaProyecto;
	public Boolean isPermisoEliminarPresuTipoCuentaProyecto;
	public Boolean isPermisoGuardarCambiosPresuTipoCuentaProyecto;
	public Boolean isPermisoConsultaPresuTipoCuentaProyecto;
	public Boolean isPermisoBusquedaPresuTipoCuentaProyecto;
	public Boolean isPermisoReportePresuTipoCuentaProyecto;
	public Boolean isPermisoPaginacionMedioPresuTipoCuentaProyecto;
	public Boolean isPermisoPaginacionAltoPresuTipoCuentaProyecto;
	public Boolean isPermisoPaginacionTodoPresuTipoCuentaProyecto;
	public Boolean isPermisoCopiarPresuTipoCuentaProyecto;
	public Boolean isPermisoVerFormPresuTipoCuentaProyecto;
	public Boolean isPermisoDuplicarPresuTipoCuentaProyecto;
	public Boolean isPermisoOrdenPresuTipoCuentaProyecto;
	
	
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
	
	public PresuTipoCuentaProyectoParameterReturnGeneral presutipocuentaproyectoReturnGeneral;
	public PresuTipoCuentaProyectoParameterReturnGeneral presutipocuentaproyectoParameterGeneral;
	
	 	
	public JasperPrint jasperPrint = null;
	
	public Long lIdUsuarioSesion=0L;				
	
	public Boolean isEsNuevoPresuTipoCuentaProyecto=false;
	public Boolean esParaAccionDesdeFormularioPresuTipoCuentaProyecto=false;
	public Boolean isEsMantenimientoRelacionesRelacionadoUnico=false;
	public Boolean isEsMantenimientoRelaciones=false;
	public Boolean isEsMantenimientoRelacionado=false;	
	public Boolean isContieneImagenes=false;
		
	//public Boolean conTotales=false; //Viene heredado de JInternalFrameBase
	//public Boolean esParaBusquedaForeignKey=false;
	
	
	protected PresuTipoCuentaProyectoSessionBeanAdditional presutipocuentaproyectoSessionBeanAdditional=null;
	
	public PresuTipoCuentaProyectoSessionBeanAdditional getPresuTipoCuentaProyectoSessionBeanAdditional() {
		return this.presutipocuentaproyectoSessionBeanAdditional;
	}
	
	public void setPresuTipoCuentaProyectoSessionBeanAdditional(PresuTipoCuentaProyectoSessionBeanAdditional presutipocuentaproyectoSessionBeanAdditional) {
		try {
			this.presutipocuentaproyectoSessionBeanAdditional=presutipocuentaproyectoSessionBeanAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	protected PresuTipoCuentaProyectoBeanSwingJInternalFrameAdditional presutipocuentaproyectoBeanSwingJInternalFrameAdditional=null;
	//public class PresuTipoCuentaProyectoBeanSwingJInternalFrame
	
	public PresuTipoCuentaProyectoBeanSwingJInternalFrameAdditional getPresuTipoCuentaProyectoBeanSwingJInternalFrameAdditional() {
		return this.presutipocuentaproyectoBeanSwingJInternalFrameAdditional;
	}
	
	public void setPresuTipoCuentaProyectoBeanSwingJInternalFrameAdditional(PresuTipoCuentaProyectoBeanSwingJInternalFrameAdditional presutipocuentaproyectoBeanSwingJInternalFrameAdditional) {
		try {
			this.presutipocuentaproyectoBeanSwingJInternalFrameAdditional=presutipocuentaproyectoBeanSwingJInternalFrameAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	//ESTA EN PADRE
	
	//public PresuTipoCuentaProyectoLogic presutipocuentaproyectoLogic;
	public SistemaLogicAdditional sistemaLogicAdditional;
	
	
	public PresuTipoCuentaProyecto presutipocuentaproyectoBean;
	public PresuTipoCuentaProyectoConstantesFunciones presutipocuentaproyectoConstantesFunciones;
	//public PresuTipoCuentaProyectoParameterReturnGeneral presutipocuentaproyectoReturnGeneral;
	
	//FK
	
	public EmpresaLogic empresaLogic;
	
	//PARAMETROS
	
	
	//public List<PresuTipoCuentaProyecto> presutipocuentaproyectos;	
	//public List<PresuTipoCuentaProyecto> presutipocuentaproyectosEliminados;
	//public List<PresuTipoCuentaProyecto> presutipocuentaproyectosAux;
	
	public String sAccionMantenimiento="";
	public String sAccionBusqueda="";
	public String sAccionAdicional="";
	public String sUltimaBusqueda="";
	
	public Mensaje mensaje;
	
	
	public String sVisibilidadTablaBusquedas="";					
	public String sVisibilidadTablaElementos="";	
	public String sVisibilidadTablaAcciones="";			
	
	public Boolean isVisibilidadCeldaNuevoPresuTipoCuentaProyecto=false;
	public Boolean isVisibilidadCeldaDuplicarPresuTipoCuentaProyecto=true;
	public Boolean isVisibilidadCeldaCopiarPresuTipoCuentaProyecto=true;
	public Boolean isVisibilidadCeldaVerFormPresuTipoCuentaProyecto=true;
	public Boolean isVisibilidadCeldaOrdenPresuTipoCuentaProyecto=true;
	public Boolean isVisibilidadCeldaNuevoRelacionesPresuTipoCuentaProyecto=false;
	public Boolean isVisibilidadCeldaModificarPresuTipoCuentaProyecto=false;
	public Boolean isVisibilidadCeldaActualizarPresuTipoCuentaProyecto=false;
	public Boolean isVisibilidadCeldaEliminarPresuTipoCuentaProyecto=false;
	public Boolean isVisibilidadCeldaCancelarPresuTipoCuentaProyecto=false;
	public Boolean isVisibilidadCeldaGuardarPresuTipoCuentaProyecto=false;	
	public Boolean isVisibilidadCeldaGuardarCambiosPresuTipoCuentaProyecto=false;	
	
	
	public Boolean isVisibilidadBusquedaPorCodigo=false;
	public Boolean isVisibilidadBusquedaPorNombre=false;
	public Boolean isVisibilidadFK_IdEmpresa=false;
	
	public Long getiIdNuevoPresuTipoCuentaProyecto() {
		return this.iIdNuevoPresuTipoCuentaProyecto;
	}

	public void setiIdNuevoPresuTipoCuentaProyecto(Long iIdNuevoPresuTipoCuentaProyecto) {
		this.iIdNuevoPresuTipoCuentaProyecto = iIdNuevoPresuTipoCuentaProyecto;
	}
	
	public Long getidPresuTipoCuentaProyectoActual() {
		return this.idPresuTipoCuentaProyectoActual;
	}

	public void setidPresuTipoCuentaProyectoActual(Long idPresuTipoCuentaProyectoActual) {
		this.idPresuTipoCuentaProyectoActual = idPresuTipoCuentaProyectoActual;
	}
	
	public int getrowIndexActual() {
		return this.rowIndexActual;
	}

	public void setrowIndexActual(int rowIndexActual) {
		this.rowIndexActual=rowIndexActual;
	}
	
	
	public PresuTipoCuentaProyecto getpresutipocuentaproyecto() {
		return this.presutipocuentaproyecto;
	}

	public void setpresutipocuentaproyecto(PresuTipoCuentaProyecto presutipocuentaproyecto) {
		this.presutipocuentaproyecto = presutipocuentaproyecto;
	}
	
	public PresuTipoCuentaProyecto getpresutipocuentaproyectoAux() {
		return this.presutipocuentaproyectoAux;
	}

	public void setpresutipocuentaproyectoAux(PresuTipoCuentaProyecto presutipocuentaproyectoAux) {
		this.presutipocuentaproyectoAux = presutipocuentaproyectoAux;
	}				
	
	public PresuTipoCuentaProyecto getpresutipocuentaproyectoAnterior() {
		return this.presutipocuentaproyectoAnterior;
	}

	public void setpresutipocuentaproyectoAnterior(PresuTipoCuentaProyecto presutipocuentaproyectoAnterior) {
		this.presutipocuentaproyectoAnterior = presutipocuentaproyectoAnterior;
	}	
	
	public PresuTipoCuentaProyecto getpresutipocuentaproyectoTotales() {
		return this.presutipocuentaproyectoTotales;
	}

	public void setpresutipocuentaproyectoTotales(PresuTipoCuentaProyecto presutipocuentaproyectoTotales) {
		this.presutipocuentaproyectoTotales = presutipocuentaproyectoTotales;
	}	
	
	public PresuTipoCuentaProyecto getpresutipocuentaproyectoBean() {
		return this.presutipocuentaproyectoBean;
	}

	public void setpresutipocuentaproyectoBean(PresuTipoCuentaProyecto presutipocuentaproyectoBean) {
		this.presutipocuentaproyectoBean = presutipocuentaproyectoBean;
	}	
	
	public PresuTipoCuentaProyectoParameterReturnGeneral getpresutipocuentaproyectoReturnGeneral() {
		return this.presutipocuentaproyectoReturnGeneral;
	}

	public void setpresutipocuentaproyectoReturnGeneral(PresuTipoCuentaProyectoParameterReturnGeneral presutipocuentaproyectoReturnGeneral) {
		this.presutipocuentaproyectoReturnGeneral = presutipocuentaproyectoReturnGeneral;
	}	
	
	
	public String codigoBusquedaPorCodigo="";

	public String getcodigoBusquedaPorCodigo() {
		return this.codigoBusquedaPorCodigo;
	}

	public void setcodigoBusquedaPorCodigo(String codigoBusquedaPorCodigo) {
		this.codigoBusquedaPorCodigo = codigoBusquedaPorCodigo;
	}

	public String nombreBusquedaPorNombre="";

	public String getnombreBusquedaPorNombre() {
		return this.nombreBusquedaPorNombre;
	}

	public void setnombreBusquedaPorNombre(String nombreBusquedaPorNombre) {
		this.nombreBusquedaPorNombre = nombreBusquedaPorNombre;
	}

	public Long id_empresaFK_IdEmpresa=-1L;

	public Long getid_empresaFK_IdEmpresa() {
		return this.id_empresaFK_IdEmpresa;
	}

	public void setid_empresaFK_IdEmpresa(Long id_empresaFK_IdEmpresa) {
		this.id_empresaFK_IdEmpresa = id_empresaFK_IdEmpresa;
	}

		
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	
	public PresuTipoCuentaProyectoLogic getPresuTipoCuentaProyectoLogic()	{		
		return presutipocuentaproyectoLogic;
	}

	public void setPresuTipoCuentaProyectoLogic(PresuTipoCuentaProyectoLogic presutipocuentaproyectoLogic) {
		this.presutipocuentaproyectoLogic = presutipocuentaproyectoLogic;
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
	
	public Boolean getIsEsNuevoPresuTipoCuentaProyecto() {
		return isEsNuevoPresuTipoCuentaProyecto;
	}

	public void setIsEsNuevoPresuTipoCuentaProyecto(Boolean isEsNuevoPresuTipoCuentaProyecto) {
		this.isEsNuevoPresuTipoCuentaProyecto = isEsNuevoPresuTipoCuentaProyecto;
	}

	public Boolean getEsParaAccionDesdeFormularioPresuTipoCuentaProyecto() {
		return esParaAccionDesdeFormularioPresuTipoCuentaProyecto;
	}
	
	public void setEsParaAccionDesdeFormularioPresuTipoCuentaProyecto(Boolean esParaAccionDesdeFormularioPresuTipoCuentaProyecto) {
		this.esParaAccionDesdeFormularioPresuTipoCuentaProyecto = esParaAccionDesdeFormularioPresuTipoCuentaProyecto;
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
	
	
	public void cargarCombosEmpresasForeignKeyLista(String sFinalQuery)throws Exception
	{
		try
		{
			this.empresasForeignKey=new ArrayList<Empresa>();

			ArrayList<Classe> clases=new ArrayList<Classe>();
			ArrayList<String> arrClasses=new ArrayList<String>();
			Classe classe=new Classe();
			DatosDeep datosDeep=new DatosDeep(false,DeepLoadType.INCLUDE,clases,"");

			EmpresaLogic empresaLogic=new EmpresaLogic();

			//empresaLogic.getEmpresaDataAccess().setIsForForeingKeyData(true);

			if(this.presutipocuentaproyectoSessionBean==null) {
				this.presutipocuentaproyectoSessionBean=new PresuTipoCuentaProyectoSessionBean();
			}

			if(!this.presutipocuentaproyectoSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//empresaLogic.getEmpresaDataAccess().setIsForForeingKeyData(true);

					empresaLogic.getTodosEmpresasWithConnection(sFinalQuery,new Pagination());

					this.empresasForeignKey=empresaLogic.getEmpresas();

				} else if(Constantes.ISUSAEJBREMOTE) {

				} else if(Constantes.ISUSAEJBHOME) {
				}


				//ARCHITECTURE
			} else {
				if(!this.conCargarMinimo) {
					this.setVisibilidadBusquedasParaEmpresa(true);
				}
				//ARCHITECTURE

				if(Constantes.ISUSAEJBLOGICLAYER) {
					empresaLogic.getEntityWithConnection(presutipocuentaproyectoSessionBean.getlidEmpresaActual());
					this.empresasForeignKey.add(empresaLogic.getEmpresa());
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

	
	
	public void setActualEmpresaForeignKey(Long idEmpresaSeleccionado,Boolean conCombosBusquedas,String sFormularioTipoBusqueda)throws Exception
	{
		try
		{
			Empresa  empresaTemp=null;

			for(Empresa empresaAux:empresasForeignKey) {
				if(empresaAux.getId()!=null && empresaAux.getId().equals(idEmpresaSeleccionado)) {
					empresaTemp=empresaAux;
					break;
				}
			}

			if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){
				if(empresaTemp!=null) {

					if(this.presutipocuentaproyecto!=null) {
						this.presutipocuentaproyecto.setEmpresa(empresaTemp);
					}

					if(this.jInternalFrameDetalleFormPresuTipoCuentaProyecto!=null) {
						this.jInternalFrameDetalleFormPresuTipoCuentaProyecto.jComboBoxid_empresaPresuTipoCuentaProyecto.setSelectedItem(empresaTemp);
					}
				} else {
					//jComboBoxid_empresaPresuTipoCuentaProyecto.setSelectedItem(empresaTemp);
					if(this.jInternalFrameDetalleFormPresuTipoCuentaProyecto!=null) {
						if(this.jInternalFrameDetalleFormPresuTipoCuentaProyecto.jComboBoxid_empresaPresuTipoCuentaProyecto.getItemCount()>0) {
							this.jInternalFrameDetalleFormPresuTipoCuentaProyecto.jComboBoxid_empresaPresuTipoCuentaProyecto.setSelectedIndex(0);
						}
					}
				}
			}

			if(conCombosBusquedas) {

		//BYDAN_BUSQUEDAS
						

					}

		}
		catch(Exception e)
		{
			throw e;
		}
	}

	public String getActualEmpresaForeignKeyDescripcion(Long idEmpresaSeleccionado)throws Exception
	{
		String sDescripcion="";

		try
		{
			Empresa  empresaTemp=null;

			for(Empresa empresaAux:empresasForeignKey) {
				if(empresaAux.getId()!=null && empresaAux.getId().equals(idEmpresaSeleccionado)) {
					empresaTemp=empresaAux;
					break;
				}
			}


			sDescripcion=EmpresaConstantesFunciones.getEmpresaDescripcion(empresaTemp);
		}
		catch(Exception e)
		{
			throw e;
		}

		return sDescripcion;
	}

	@SuppressWarnings("rawtypes")
	public void setActualEmpresaForeignKeyGenerico(Long idEmpresaSeleccionado,JComboBox jComboBoxid_empresaPresuTipoCuentaProyectoGenerico)throws Exception
	{
		try
		{
			Empresa  empresaTemp=null;

			for(Empresa empresaAux:empresasForeignKey) {
				if(empresaAux.getId()!=null && empresaAux.getId().equals(idEmpresaSeleccionado)) {
					empresaTemp=empresaAux;
					break;
				}
			}

			if(empresaTemp!=null) {
				jComboBoxid_empresaPresuTipoCuentaProyectoGenerico.setSelectedItem(empresaTemp);
			} else {
				if(jComboBoxid_empresaPresuTipoCuentaProyectoGenerico!=null && jComboBoxid_empresaPresuTipoCuentaProyectoGenerico.getItemCount()>0) {
					jComboBoxid_empresaPresuTipoCuentaProyectoGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	
	
	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarEmpresaForeignKey(PresuTipoCuentaProyecto presutipocuentaproyecto,JComboBox jComboBoxid_empresaPresuTipoCuentaProyectoGenerico)throws Exception
	{
		try
		{
			Empresa  empresaAux=new Empresa();

			if(jComboBoxid_empresaPresuTipoCuentaProyectoGenerico==null) {
				empresaAux=(Empresa)this.jInternalFrameDetalleFormPresuTipoCuentaProyecto.jComboBoxid_empresaPresuTipoCuentaProyecto.getSelectedItem();
			} else {
				empresaAux=(Empresa)jComboBoxid_empresaPresuTipoCuentaProyectoGenerico.getSelectedItem();
			}

			if(empresaAux!=null && empresaAux.getId()!=null) {
				presutipocuentaproyecto.setid_empresa(empresaAux.getId());
				presutipocuentaproyecto.setempresa_descripcion(PresuTipoCuentaProyectoConstantesFunciones.getEmpresaDescripcion(empresaAux));
				presutipocuentaproyecto.setEmpresa(empresaAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	
	


		@SuppressWarnings({ "unchecked", "rawtypes" })
		public void cargarCombosFrameEmpresasForeignKey(String sFormularioTipoBusqueda)throws Exception {
			try {

				JComboBoxBinding jComboBoxBindingEmpresa=null;

				if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){

					if(!PresuTipoCuentaProyectoJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormPresuTipoCuentaProyecto!=null) { 
							this.jInternalFrameDetalleFormPresuTipoCuentaProyecto.jComboBoxid_empresaPresuTipoCuentaProyecto.removeAllItems();

							for(Empresa empresa:this.empresasForeignKey) {
								this.jInternalFrameDetalleFormPresuTipoCuentaProyecto.jComboBoxid_empresaPresuTipoCuentaProyecto.addItem(empresa);
							}
						}
					}

					if(this.jInternalFrameDetalleFormPresuTipoCuentaProyecto!=null) { 
					}

					if(!PresuTipoCuentaProyectoJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {


				}

			}  catch(Exception e) {
				throw e;
			}
		}

	


		public void setSelectedItemCombosFrameEmpresaForeignKey(Empresa empresa,int iIndexSelected,Boolean conSelectedIndex,Boolean conFormulario,Boolean conBusqueda)throws Exception {
			try {

				if(conFormulario) {
					if(!conSelectedIndex) {
						if(this.jInternalFrameDetalleFormPresuTipoCuentaProyecto!=null) {
							this.jInternalFrameDetalleFormPresuTipoCuentaProyecto.jComboBoxid_empresaPresuTipoCuentaProyecto.setSelectedItem(empresa);
						}
					} else {
						if(this.jInternalFrameDetalleFormPresuTipoCuentaProyecto!=null) {
							this.jInternalFrameDetalleFormPresuTipoCuentaProyecto.jComboBoxid_empresaPresuTipoCuentaProyecto.setSelectedIndex(iIndexSelected);
						}
					}
				}


				if(!this.conCargarMinimo) {
					if(conBusqueda) {

					//BYDAN_BUSQUEDAS
					

										}
				}
			} catch(Exception e) {
				throw e;
			}
		}

	


	
	public void refrescarForeignKeysDescripcionesPresuTipoCuentaProyecto() throws Exception {
		//SI FUNCIONA DEEPLOAD ESTO VA AL ULTIMO
		if(Constantes.ISUSAEJBLOGICLAYER) {
			PresuTipoCuentaProyectoConstantesFunciones.refrescarForeignKeysDescripcionesPresuTipoCuentaProyecto(this.presutipocuentaproyectoLogic.getPresuTipoCuentaProyectos());
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			PresuTipoCuentaProyectoConstantesFunciones.refrescarForeignKeysDescripcionesPresuTipoCuentaProyecto(this.presutipocuentaproyectos);
		}
		
		/*
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		classes.add(new Classe(Empresa.class));
			
		if(Constantes.ISUSAEJBLOGICLAYER) {
			//USA LOS OBJETOS DE LOGIC DIRECTAMENTE
			//presutipocuentaproyectoLogic.setPresuTipoCuentaProyectos(this.presutipocuentaproyectos);
			presutipocuentaproyectoLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
	
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
		
	public PresuTipoCuentaProyectoParameterReturnGeneral getPresuTipoCuentaProyectoParameterGeneral() {
		return this.presutipocuentaproyectoParameterGeneral;
	}
	
	public void setPresuTipoCuentaProyectoParameterGeneral(PresuTipoCuentaProyectoParameterReturnGeneral presutipocuentaproyectoParameterGeneral) {
		this.presutipocuentaproyectoParameterGeneral = presutipocuentaproyectoParameterGeneral;
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
	
	public Boolean getIsPermisoTodoPresuTipoCuentaProyecto() {
		return isPermisoTodoPresuTipoCuentaProyecto;
	}

	public void setIsPermisoTodoPresuTipoCuentaProyecto(Boolean isPermisoTodoPresuTipoCuentaProyecto) {
		this.isPermisoTodoPresuTipoCuentaProyecto = isPermisoTodoPresuTipoCuentaProyecto;
	}

	public Boolean getIsPermisoNuevoPresuTipoCuentaProyecto() {
		return isPermisoNuevoPresuTipoCuentaProyecto;
	}

	public void setIsPermisoNuevoPresuTipoCuentaProyecto(Boolean isPermisoNuevoPresuTipoCuentaProyecto) {
		this.isPermisoNuevoPresuTipoCuentaProyecto = isPermisoNuevoPresuTipoCuentaProyecto;
	}

	public Boolean getIsPermisoActualizarPresuTipoCuentaProyecto() {
		return isPermisoActualizarPresuTipoCuentaProyecto;
	}

	public void setIsPermisoActualizarPresuTipoCuentaProyecto(Boolean isPermisoActualizarPresuTipoCuentaProyecto) {
		this.isPermisoActualizarPresuTipoCuentaProyecto = isPermisoActualizarPresuTipoCuentaProyecto;
	}

	public Boolean getIsPermisoEliminarPresuTipoCuentaProyecto() {
		return isPermisoEliminarPresuTipoCuentaProyecto;
	}

	public void setIsPermisoEliminarPresuTipoCuentaProyecto(Boolean isPermisoEliminarPresuTipoCuentaProyecto) {
		this.isPermisoEliminarPresuTipoCuentaProyecto = isPermisoEliminarPresuTipoCuentaProyecto;
	}

	public Boolean getIsPermisoGuardarCambiosPresuTipoCuentaProyecto() {
		return isPermisoGuardarCambiosPresuTipoCuentaProyecto;
	}

	public void setIsPermisoGuardarCambiosPresuTipoCuentaProyecto(Boolean isPermisoGuardarCambiosPresuTipoCuentaProyecto) {
		this.isPermisoGuardarCambiosPresuTipoCuentaProyecto = isPermisoGuardarCambiosPresuTipoCuentaProyecto;
	}
	
	public Boolean getIsPermisoConsultaPresuTipoCuentaProyecto() {
		return isPermisoConsultaPresuTipoCuentaProyecto;
	}

	public void setIsPermisoConsultaPresuTipoCuentaProyecto(Boolean isPermisoConsultaPresuTipoCuentaProyecto) {
		this.isPermisoConsultaPresuTipoCuentaProyecto = isPermisoConsultaPresuTipoCuentaProyecto;
	}

	public Boolean getIsPermisoBusquedaPresuTipoCuentaProyecto() {
		return isPermisoBusquedaPresuTipoCuentaProyecto;
	}

	public void setIsPermisoBusquedaPresuTipoCuentaProyecto(Boolean isPermisoBusquedaPresuTipoCuentaProyecto) {
		this.isPermisoBusquedaPresuTipoCuentaProyecto = isPermisoBusquedaPresuTipoCuentaProyecto;
	}

	public Boolean getIsPermisoReportePresuTipoCuentaProyecto() {
		return isPermisoReportePresuTipoCuentaProyecto;
	}

	public void setIsPermisoReportePresuTipoCuentaProyecto(Boolean isPermisoReportePresuTipoCuentaProyecto) {
		this.isPermisoReportePresuTipoCuentaProyecto = isPermisoReportePresuTipoCuentaProyecto;
	}
	
	public Boolean getIsPermisoPaginacionMedioPresuTipoCuentaProyecto() {
		return isPermisoPaginacionMedioPresuTipoCuentaProyecto;
	}

	public void setIsPermisoPaginacionMedioPresuTipoCuentaProyecto(Boolean isPermisoPaginacionMedioPresuTipoCuentaProyecto) {
		this.isPermisoPaginacionMedioPresuTipoCuentaProyecto = isPermisoPaginacionMedioPresuTipoCuentaProyecto;
	}
	
	public Boolean getIsPermisoPaginacionTodoPresuTipoCuentaProyecto() {
		return isPermisoPaginacionTodoPresuTipoCuentaProyecto;
	}

	public void setIsPermisoPaginacionTodoPresuTipoCuentaProyecto(Boolean isPermisoPaginacionTodoPresuTipoCuentaProyecto) {
		this.isPermisoPaginacionTodoPresuTipoCuentaProyecto = isPermisoPaginacionTodoPresuTipoCuentaProyecto;
	}
	
	public Boolean getIsPermisoPaginacionAltoPresuTipoCuentaProyecto() {
		return isPermisoPaginacionAltoPresuTipoCuentaProyecto;
	}

	public void setIsPermisoPaginacionAltoPresuTipoCuentaProyecto(Boolean isPermisoPaginacionAltoPresuTipoCuentaProyecto) {
		this.isPermisoPaginacionAltoPresuTipoCuentaProyecto = isPermisoPaginacionAltoPresuTipoCuentaProyecto;
	}
	
	public Boolean getIsPermisoCopiarPresuTipoCuentaProyecto() {
		return isPermisoCopiarPresuTipoCuentaProyecto;
	}

	public void setIsPermisoCopiarPresuTipoCuentaProyecto(Boolean isPermisoCopiarPresuTipoCuentaProyecto) {
		this.isPermisoCopiarPresuTipoCuentaProyecto = isPermisoCopiarPresuTipoCuentaProyecto;
	}
	
	public Boolean getIsPermisoVerFormPresuTipoCuentaProyecto() {
		return isPermisoVerFormPresuTipoCuentaProyecto;
	}

	public void setIsPermisoVerFormPresuTipoCuentaProyecto(Boolean isPermisoVerFormPresuTipoCuentaProyecto) {
		this.isPermisoVerFormPresuTipoCuentaProyecto = isPermisoVerFormPresuTipoCuentaProyecto;
	}
	
	public Boolean getIsPermisoDuplicarPresuTipoCuentaProyecto() {
		return isPermisoDuplicarPresuTipoCuentaProyecto;
	}

	public void setIsPermisoDuplicarPresuTipoCuentaProyecto(Boolean isPermisoDuplicarPresuTipoCuentaProyecto) {
		this.isPermisoDuplicarPresuTipoCuentaProyecto = isPermisoDuplicarPresuTipoCuentaProyecto;
	}
	
	public Boolean getIsPermisoOrdenPresuTipoCuentaProyecto() {
		return isPermisoOrdenPresuTipoCuentaProyecto;
	}

	public void setIsPermisoOrdenPresuTipoCuentaProyecto(Boolean isPermisoOrdenPresuTipoCuentaProyecto) {
		this.isPermisoOrdenPresuTipoCuentaProyecto = isPermisoOrdenPresuTipoCuentaProyecto;
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
	
	public Boolean getIsVisibilidadCeldaNuevoPresuTipoCuentaProyecto() {
		return isVisibilidadCeldaNuevoPresuTipoCuentaProyecto;
	}

	public void setIsVisibilidadCeldaNuevoPresuTipoCuentaProyecto(Boolean isVisibilidadCeldaNuevoPresuTipoCuentaProyecto) {
		this.isVisibilidadCeldaNuevoPresuTipoCuentaProyecto = isVisibilidadCeldaNuevoPresuTipoCuentaProyecto;
	}
	
	public Boolean getIsVisibilidadCeldaDuplicarPresuTipoCuentaProyecto() {
		return isVisibilidadCeldaDuplicarPresuTipoCuentaProyecto;
	}

	public void setIsVisibilidadCeldaDuplicarPresuTipoCuentaProyecto(Boolean isVisibilidadCeldaDuplicarPresuTipoCuentaProyecto) {
		this.isVisibilidadCeldaDuplicarPresuTipoCuentaProyecto = isVisibilidadCeldaDuplicarPresuTipoCuentaProyecto;
	}
	
	public Boolean getIsVisibilidadCeldaCopiarPresuTipoCuentaProyecto() {
		return isVisibilidadCeldaCopiarPresuTipoCuentaProyecto;
	}

	public void setIsVisibilidadCeldaCopiarPresuTipoCuentaProyecto(Boolean isVisibilidadCeldaCopiarPresuTipoCuentaProyecto) {
		this.isVisibilidadCeldaCopiarPresuTipoCuentaProyecto = isVisibilidadCeldaCopiarPresuTipoCuentaProyecto;
	}
	
	public Boolean getIsVisibilidadCeldaVerFormPresuTipoCuentaProyecto() {
		return isVisibilidadCeldaVerFormPresuTipoCuentaProyecto;
	}

	public void setIsVisibilidadCeldaVerFormPresuTipoCuentaProyecto(Boolean isVisibilidadCeldaVerFormPresuTipoCuentaProyecto) {
		this.isVisibilidadCeldaVerFormPresuTipoCuentaProyecto = isVisibilidadCeldaVerFormPresuTipoCuentaProyecto;
	}
	
	public Boolean getIsVisibilidadCeldaOrdenPresuTipoCuentaProyecto() {
		return isVisibilidadCeldaOrdenPresuTipoCuentaProyecto;
	}

	public void setIsVisibilidadCeldaOrdenPresuTipoCuentaProyecto(Boolean isVisibilidadCeldaOrdenPresuTipoCuentaProyecto) {
		this.isVisibilidadCeldaOrdenPresuTipoCuentaProyecto = isVisibilidadCeldaOrdenPresuTipoCuentaProyecto;
	}
	
	public Boolean getIsVisibilidadCeldaNuevoRelacionesPresuTipoCuentaProyecto() {
		return isVisibilidadCeldaNuevoRelacionesPresuTipoCuentaProyecto;
	}

	public void setIsVisibilidadCeldaNuevoRelacionesPresuTipoCuentaProyecto(Boolean isVisibilidadCeldaNuevoRelacionesPresuTipoCuentaProyecto) {
		this.isVisibilidadCeldaNuevoRelacionesPresuTipoCuentaProyecto = isVisibilidadCeldaNuevoRelacionesPresuTipoCuentaProyecto;
	}
	
	public Boolean getIsVisibilidadCeldaModificarPresuTipoCuentaProyecto() {
		return isVisibilidadCeldaModificarPresuTipoCuentaProyecto;
	}

	public void setIsVisibilidadCeldaModificarPresuTipoCuentaProyecto(Boolean isVisibilidadCeldaModificarPresuTipoCuentaProyecto) {
		this.isVisibilidadCeldaModificarPresuTipoCuentaProyecto = isVisibilidadCeldaModificarPresuTipoCuentaProyecto;
	}
	
	public Boolean getIsVisibilidadCeldaActualizarPresuTipoCuentaProyecto() {
		return isVisibilidadCeldaActualizarPresuTipoCuentaProyecto;
	}

	public void setIsVisibilidadCeldaActualizarPresuTipoCuentaProyecto(Boolean isVisibilidadCeldaActualizarPresuTipoCuentaProyecto) {
		this.isVisibilidadCeldaActualizarPresuTipoCuentaProyecto = isVisibilidadCeldaActualizarPresuTipoCuentaProyecto;
	}

	public Boolean getIsVisibilidadCeldaEliminarPresuTipoCuentaProyecto() {
		return isVisibilidadCeldaEliminarPresuTipoCuentaProyecto;
	}

	public void setIsVisibilidadCeldaEliminarPresuTipoCuentaProyecto(Boolean isVisibilidadCeldaEliminarPresuTipoCuentaProyecto) {
		this.isVisibilidadCeldaEliminarPresuTipoCuentaProyecto = isVisibilidadCeldaEliminarPresuTipoCuentaProyecto;
	}

	public Boolean getIsVisibilidadCeldaCancelarPresuTipoCuentaProyecto() {
		return isVisibilidadCeldaCancelarPresuTipoCuentaProyecto;
	}

	public void setIsVisibilidadCeldaCancelarPresuTipoCuentaProyecto(Boolean isVisibilidadCeldaCancelarPresuTipoCuentaProyecto) {
		this.isVisibilidadCeldaCancelarPresuTipoCuentaProyecto = isVisibilidadCeldaCancelarPresuTipoCuentaProyecto;
	}

	public Boolean getIsVisibilidadCeldaGuardarPresuTipoCuentaProyecto() {
		return isVisibilidadCeldaGuardarPresuTipoCuentaProyecto;
	}

	public void setIsVisibilidadCeldaGuardarPresuTipoCuentaProyecto(Boolean isVisibilidadCeldaGuardarPresuTipoCuentaProyecto) {
		this.isVisibilidadCeldaGuardarPresuTipoCuentaProyecto = isVisibilidadCeldaGuardarPresuTipoCuentaProyecto;
	}
	
	public Boolean getIsVisibilidadCeldaGuardarCambiosPresuTipoCuentaProyecto() {
		return isVisibilidadCeldaGuardarCambiosPresuTipoCuentaProyecto;
	}

	public void setIsVisibilidadCeldaGuardarCambiosPresuTipoCuentaProyecto(Boolean isVisibilidadCeldaGuardarCambiosPresuTipoCuentaProyecto) {
		this.isVisibilidadCeldaGuardarCambiosPresuTipoCuentaProyecto = isVisibilidadCeldaGuardarCambiosPresuTipoCuentaProyecto;
	}
		
	public PresuTipoCuentaProyectoSessionBean getpresutipocuentaproyectoSessionBean() {
		return this.presutipocuentaproyectoSessionBean;
	}
	
	public void setpresutipocuentaproyectoSessionBean(PresuTipoCuentaProyectoSessionBean presutipocuentaproyectoSessionBean) {
		this.presutipocuentaproyectoSessionBean=presutipocuentaproyectoSessionBean;
	}
	
	
	public Boolean getisVisibilidadBusquedaPorCodigo() {
		return this.isVisibilidadBusquedaPorCodigo;
	}

	public void setisVisibilidadBusquedaPorCodigo(Boolean isVisibilidadBusquedaPorCodigo) {
		this.isVisibilidadBusquedaPorCodigo=isVisibilidadBusquedaPorCodigo;
	}

	public Boolean getisVisibilidadBusquedaPorNombre() {
		return this.isVisibilidadBusquedaPorNombre;
	}

	public void setisVisibilidadBusquedaPorNombre(Boolean isVisibilidadBusquedaPorNombre) {
		this.isVisibilidadBusquedaPorNombre=isVisibilidadBusquedaPorNombre;
	}

	public Boolean getisVisibilidadFK_IdEmpresa() {
		return this.isVisibilidadFK_IdEmpresa;
	}

	public void setisVisibilidadFK_IdEmpresa(Boolean isVisibilidadFK_IdEmpresa) {
		this.isVisibilidadFK_IdEmpresa=isVisibilidadFK_IdEmpresa;
	}

	
	
	public void setVariablesFormularioToObjetoActualForeignKeysPresuTipoCuentaProyecto(PresuTipoCuentaProyecto presutipocuentaproyecto)throws Exception {
		try {
			
				this.setActualParaGuardarEmpresaForeignKey(presutipocuentaproyecto,null);
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
	
	public void bugActualizarReferenciaActual(PresuTipoCuentaProyecto presutipocuentaproyecto,PresuTipoCuentaProyecto presutipocuentaproyectoAux) throws Exception {
		//ARCHITECTURE		
		//EL ID NEGATIVO GUARDADO EN ORIGINAL SIRVE PARA VERIFICAR Y ACTUALIZAR EL REGISTRO NUEVO (ID,VERSIONROW)
		this.setCamposBaseDesdeOriginalPresuTipoCuentaProyecto(presutipocuentaproyecto);
					
		//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
		presutipocuentaproyectoAux.setId(presutipocuentaproyecto.getId());
		presutipocuentaproyectoAux.setVersionRow(presutipocuentaproyecto.getVersionRow());					
	}
	
	public void ejecutarMantenimiento(MaintenanceType maintenanceType)throws Exception {	
		try	{								
			
			//this.startProcessPresuTipoCuentaProyecto();
		
			int intSelectedRow = this.jTableDatosPresuTipoCuentaProyecto.getSelectedRow();	       
			
			//PUEDE SER -1 CUANDO SE ELIMINA EN GUARDAR CAMBIOS
			if(intSelectedRow>=0 && maintenanceType!=MaintenanceType.GUARDARCAMBIOS) {
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
					
				//ARCHITECTURE
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.presutipocuentaproyecto =(PresuTipoCuentaProyecto) this.presutipocuentaproyectoLogic.getPresuTipoCuentaProyectos().toArray()[this.jTableDatosPresuTipoCuentaProyecto.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
					this.presutipocuentaproyecto =(PresuTipoCuentaProyecto) this.presutipocuentaproyectos.toArray()[this.jTableDatosPresuTipoCuentaProyecto.convertRowIndexToModel(intSelectedRow)];
				}
				
				//ARCHITECTURE
				
				if(PresuTipoCuentaProyectoJInternalFrame.ISBINDING_MANUAL_TABLA) {
					//this.setVariablesFormularioToObjetoActualPresuTipoCuentaProyecto(this.presutipocuentaproyecto,true);
				}
				
				this.setVariablesFormularioToObjetoActualForeignKeysPresuTipoCuentaProyecto(this.presutipocuentaproyecto);
			}
			
			//LUEGO DE TRAER DATOS CORRESPONDIENTES QUE COINCIDA LISTA TABLA QUITO FILA TOTALES
			if(this.conTotales) {
				//MEJOR LO DEJO, SI EXISTE EXCEPCION SE PIEDE FILA TOTALES Y ORDEN INDICE FILA ACTUAL
				//this.quitarFilaTotales();
			}
			
			this.cargarDatosCliente();
			
			this.datosDeep=new DatosDeep();
			
			//SE CAMBIA ESTADOS CON ERROR, ENTONCES SE EJECUTA ANTES
			//this.invalidValues = presutipocuentaproyectoValidator.getInvalidValues(this.presutipocuentaproyecto);
			
			//if(this.invalidValues==null || this.invalidValues.length<=0) {
			
			presutipocuentaproyectoLogic.setDatosCliente(datosCliente);
			presutipocuentaproyectoLogic.setIsConDeep(false);
			
			if(maintenanceType==MaintenanceType.NUEVO) {
				presutipocuentaproyectoAux=new  PresuTipoCuentaProyecto();
				
				presutipocuentaproyectoAux.setIsNew(true);
				presutipocuentaproyectoAux.setIsChanged(true);
				
				presutipocuentaproyectoAux.setPresuTipoCuentaProyectoOriginal(this.presutipocuentaproyecto);
				
				presutipocuentaproyectoAux.setId(this.presutipocuentaproyecto.getId());	
				presutipocuentaproyectoAux.setVersionRow(this.presutipocuentaproyecto.getVersionRow());	
				presutipocuentaproyectoAux.setid_empresa(this.presutipocuentaproyecto.getid_empresa());	
				presutipocuentaproyectoAux.setcodigo(this.presutipocuentaproyecto.getcodigo());	
				presutipocuentaproyectoAux.setnombre(this.presutipocuentaproyecto.getnombre());	
								
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.presutipocuentaproyectoSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.presutipocuentaproyectoSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(presutipocuentaproyectoAux,presutipocuentaproyectoLogic.getPresuTipoCuentaProyectos());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(presutipocuentaproyectoAux,presutipocuentaproyectos);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote  && !this.presutipocuentaproyectoSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.presutipocuentaproyectoSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						presutipocuentaproyectoLogic.savePresuTipoCuentaProyectos();//WithConnection
						//presutipocuentaproyectoLogic.getSetVersionRowPresuTipoCuentaProyectos();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE		
					
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.presutipocuentaproyecto,presutipocuentaproyectoAux);
					
					this.refrescarForeignKeysDescripcionesPresuTipoCuentaProyecto();
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.presutipocuentaproyectoSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
						}
						//ARCHITECTURE	
						
						if(!this.presutipocuentaproyectoSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE
												
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								presutipocuentaproyectoLogic.savePresuTipoCuentaProyectoRelaciones(presutipocuentaproyectoAux);//WithConnection
								//presutipocuentaproyectoLogic.getSetVersionRowPresuTipoCuentaProyectos();//WithConnection
							} else if(Constantes.ISUSAEJBREMOTE) {
							} else if(Constantes.ISUSAEJBHOME) {
							}
							//ARCHITECTURE
							
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							this.bugActualizarReferenciaActual(this.presutipocuentaproyecto,presutipocuentaproyectoAux);
					
					
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE	
						} else {
							
							
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								if(this.presutipocuentaproyectoSessionBean.getEstaModoGuardarRelaciones() 
									|| this.presutipocuentaproyectoSessionBean.getEsGuardarRelacionado())	{
									actualizarLista(presutipocuentaproyectoAux,presutipocuentaproyectoLogic.getPresuTipoCuentaProyectos());
								}
							} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
								actualizarLista(presutipocuentaproyectoAux,presutipocuentaproyectos);
							}
							//ARCHITECTURE
							
							//AQUI EL ID NEGATIVO ES EL ID BUSCADO, YA QUE NO SE GENERA OTRO EN LA DB POR INGRESAR UNO NUEVO
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							//this.bugActualizarReferenciaActual(this.presutipocuentaproyecto,presutipocuentaproyectoAux);												
						}
					}
				}
			} else if(maintenanceType==MaintenanceType.ACTUALIZAR) {
				presutipocuentaproyectoAux=new  PresuTipoCuentaProyecto();
				
				//PUEDE QUE SE ACTUALIZE ALGUN REGISTRO NUEVO
				if(!this.presutipocuentaproyectoSessionBean.getEsGuardarRelacionado() 
					|| (this.presutipocuentaproyectoSessionBean.getEsGuardarRelacionado() && this.presutipocuentaproyecto.getId()>=0)) {
						
					presutipocuentaproyectoAux.setIsNew(false);
				}
				
				presutipocuentaproyectoAux.setIsDeleted(false);
			
				presutipocuentaproyectoAux.setId(this.presutipocuentaproyecto.getId());	
				presutipocuentaproyectoAux.setVersionRow(this.presutipocuentaproyecto.getVersionRow());	
				presutipocuentaproyectoAux.setid_empresa(this.presutipocuentaproyecto.getid_empresa());	
				presutipocuentaproyectoAux.setcodigo(this.presutipocuentaproyecto.getcodigo());	
				presutipocuentaproyectoAux.setnombre(this.presutipocuentaproyecto.getnombre());	
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(presutipocuentaproyectoAux,presutipocuentaproyectoLogic.getPresuTipoCuentaProyectos());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(presutipocuentaproyectoAux,presutipocuentaproyectos);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote && !this.presutipocuentaproyectoSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.presutipocuentaproyectoSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						presutipocuentaproyectoLogic.savePresuTipoCuentaProyectos();//WithConnection
						//presutipocuentaproyectoLogic.getSetVersionRowPresuTipoCuentaProyectos();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}	
					//ARCHITECTURE
					
					//TALVEZ ESTA DEMAS POR SER UPDATE
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.presutipocuentaproyecto,presutipocuentaproyectoAux);
					
					this.refrescarForeignKeysDescripcionesPresuTipoCuentaProyecto();
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.presutipocuentaproyectoSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
						}
						//ARCHITECTURE
						
						if(!this.presutipocuentaproyectoSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								presutipocuentaproyectoLogic.savePresuTipoCuentaProyectoRelaciones(presutipocuentaproyectoAux);//WithConnection
								//presutipocuentaproyectoLogic.getSetVersionRowPresuTipoCuentaProyectos();//WithConnection
							} else if(Constantes.ISUSAEJBREMOTE) {
							} else if(Constantes.ISUSAEJBHOME) {
							}
							//ARCHITECTURE
							
							//TALVEZ ESTA DEMAS POR SER UPDATE
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							this.bugActualizarReferenciaActual(this.presutipocuentaproyecto,presutipocuentaproyectoAux);
					
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE
						} else {
							
							
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								if(this.presutipocuentaproyectoSessionBean.getEstaModoGuardarRelaciones() 
									|| this.presutipocuentaproyectoSessionBean.getEsGuardarRelacionado())	{
									actualizarLista(presutipocuentaproyectoAux,presutipocuentaproyectoLogic.getPresuTipoCuentaProyectos());
								}
							} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
								actualizarLista(presutipocuentaproyectoAux,presutipocuentaproyectos);
							}
							//ARCHITECTURE
							
							//AQUI EL ID NEGATIVO ES EL ID BUSCADO, YA QUE NO SE GENERA OTRO EN LA DB POR INGRESAR UNO NUEVO							
							//TALVEZ ESTA DEMAS POR SER UPDATE
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							//this.bugActualizarReferenciaActual(this.presutipocuentaproyecto,presutipocuentaproyectoAux);
					
						}
					}
				}				
			} else if(maintenanceType==MaintenanceType.ELIMINAR) {
				presutipocuentaproyectoAux=new  PresuTipoCuentaProyecto();
				
				presutipocuentaproyectoAux.setIsNew(false);
				presutipocuentaproyectoAux.setIsChanged(false);
				
				presutipocuentaproyectoAux.setIsDeleted(true);
				
				presutipocuentaproyectoAux.setId(this.presutipocuentaproyecto.getId());	
				presutipocuentaproyectoAux.setVersionRow(this.presutipocuentaproyecto.getVersionRow());	
				presutipocuentaproyectoAux.setid_empresa(this.presutipocuentaproyecto.getid_empresa());	
				presutipocuentaproyectoAux.setcodigo(this.presutipocuentaproyecto.getcodigo());	
				presutipocuentaproyectoAux.setnombre(this.presutipocuentaproyecto.getnombre());	
				
				if(this.presutipocuentaproyectoSessionBean.getEsGuardarRelacionado()) {
					//ELEMENTO ACTUAL NO SE HA INGRESADO AL SISTEMA, NO SE PUEDE ELIMINAR ALGO QUE NO EXISTE
					if(this.presutipocuentaproyectoAux.getId()>=0) {	
						this.presutipocuentaproyectosEliminados.add(presutipocuentaproyectoAux);											
					}
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					actualizarLista(presutipocuentaproyectoAux,presutipocuentaproyectoLogic.getPresuTipoCuentaProyectos());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(presutipocuentaproyectoAux,presutipocuentaproyectos);
				}
				//ARCHITECTURE
				
				
				if(!isGuardarCambiosEnLote && !this.presutipocuentaproyectoSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.presutipocuentaproyectoSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						presutipocuentaproyectoLogic.savePresuTipoCuentaProyectos();//WithConnection
						//presutipocuentaproyectoLogic.getSetVersionRowPresuTipoCuentaProyectos();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}	
					//ARCHITECTURE
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.presutipocuentaproyectoSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
						}
						//ARCHITECTURE
						
						
						if(!this.presutipocuentaproyectoSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								presutipocuentaproyectoLogic.savePresuTipoCuentaProyectoRelaciones(presutipocuentaproyectoAux);//WithConnection
								//presutipocuentaproyectoLogic.getSetVersionRowPresuTipoCuentaProyectos();//WithConnection
							} else if(Constantes.ISUSAEJBREMOTE) {
							} else if(Constantes.ISUSAEJBHOME) {
							}
							//ARCHITECTURE
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE
						}
					}  else {
							
						
								
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							if(this.presutipocuentaproyectoSessionBean.getEstaModoGuardarRelaciones() 
								|| this.presutipocuentaproyectoSessionBean.getEsGuardarRelacionado())	{
								actualizarLista(presutipocuentaproyectoAux,presutipocuentaproyectoLogic.getPresuTipoCuentaProyectos());
							}
						} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
							actualizarLista(presutipocuentaproyectoAux,presutipocuentaproyectos);
						}
						//ARCHITECTURE
					}
				}				
			} else if(maintenanceType==MaintenanceType.GUARDARCAMBIOS) {		
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.presutipocuentaproyectoLogic.getPresuTipoCuentaProyectos().addAll(this.presutipocuentaproyectosEliminados);
					
					presutipocuentaproyectoLogic.savePresuTipoCuentaProyectos();//WithConnection
					//presutipocuentaproyectoLogic.getSetVersionRowPresuTipoCuentaProyectos();//WithConnection
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}	
				//ARCHITECTURE
				this.refrescarForeignKeysDescripcionesPresuTipoCuentaProyecto();
				
				this.presutipocuentaproyectosEliminados= new ArrayList<PresuTipoCuentaProyecto>();		
			}
			
			if(this.presutipocuentaproyectoSessionBean.getEsGuardarRelacionado()) {
				 this.crearFilaTotales();
			}
			
			
									
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.presutipocuentaproyectoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				if(!this.isPostAccionSinMensaje) {
					JOptionPane.showMessageDialog(this,"Tipo Cuenta Proyecto GUARDADO CORRECTAMENTE","MANTENIMIENTO DE Tipo Cuenta Proyecto",JOptionPane.INFORMATION_MESSAGE);
					if(maintenanceType==MaintenanceType.NUEVO || maintenanceType==MaintenanceType.ACTUALIZAR) {
						//CUANDO ES NUEVO SE PIERDE REFERENCIA NO SE PORQUE
						this.presutipocuentaproyecto=presutipocuentaproyectoAux;
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
      		//this.finishProcessPresuTipoCuentaProyecto();
      	}
		
	}	
	
	public void actualizarRelaciones(PresuTipoCuentaProyecto presutipocuentaproyectoLocal) throws Exception {
		
		if(this.presutipocuentaproyectoSessionBean.getConGuardarRelaciones()) {			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
			
			
			} else {
				
			}
		}
	}
	
	public void actualizarRelacionFkPadreActual(PresuTipoCuentaProyecto presutipocuentaproyectoLocal) throws Exception {	
		if(this.presutipocuentaproyectoSessionBean.getEsGuardarRelacionado()) {			
			
		
			if(this.jInternalFrameParent.getClass().equals(EmpresaDetalleFormJInternalFrame.class)) {
				EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrameLocal=(EmpresaBeanSwingJInternalFrame) ((EmpresaDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				empresaBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoEmpresa(empresaBeanSwingJInternalFrameLocal.getempresa(),true);
				empresaBeanSwingJInternalFrameLocal.actualizarLista(empresaBeanSwingJInternalFrameLocal.empresa,this.empresasForeignKey);

				empresaBeanSwingJInternalFrameLocal.actualizarRelaciones(empresaBeanSwingJInternalFrameLocal.empresa);

				presutipocuentaproyectoLocal.setEmpresa(empresaBeanSwingJInternalFrameLocal.empresa);

				this.addItemDefectoCombosForeignKeyEmpresa();
				this.cargarCombosFrameEmpresasForeignKey("Formulario");
				this.setActualEmpresaForeignKey(empresaBeanSwingJInternalFrameLocal.empresa.getId(),false,"Formulario");
			}
		
		}
	}
	
	public Boolean validarPresuTipoCuentaProyectoActual() throws Exception {
		Boolean estaValidado=false;
		this.inicializarInvalidValues();
		
		/*
		int intSelectedRow = this.jTableDatosPresuTipoCuentaProyecto.getSelectedRow();
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.presutipocuentaproyecto =(PresuTipoCuentaProyecto) this.presutipocuentaproyectoLogic.getPresuTipoCuentaProyectos().toArray()[this.jTableDatosPresuTipoCuentaProyecto.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
			this.presutipocuentaproyecto =(PresuTipoCuentaProyecto) this.presutipocuentaproyectos.toArray()[this.jTableDatosPresuTipoCuentaProyecto.convertRowIndexToModel(intSelectedRow)];
		}
		//ARCHITECTURE
		*/
		
		this.invalidValues = presutipocuentaproyectoValidator.getInvalidValues(this.presutipocuentaproyecto);
					
		if(this.invalidValues==null || this.invalidValues.length<=0) {
			estaValidado=true;
		} else {
			this.mostrarInvalidValues();	
		}
		
		return estaValidado;
	}
	
	public void actualizarLista(PresuTipoCuentaProyecto presutipocuentaproyecto,List<PresuTipoCuentaProyecto> presutipocuentaproyectos) throws Exception {
		try	{		
			PresuTipoCuentaProyectoConstantesFunciones.actualizarLista(presutipocuentaproyecto,presutipocuentaproyectos,this.presutipocuentaproyectoSessionBean.getEsGuardarRelacionado());		
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void actualizarSelectedLista(PresuTipoCuentaProyecto presutipocuentaproyecto,List<PresuTipoCuentaProyecto> presutipocuentaproyectos) throws Exception {
		try	{			
			PresuTipoCuentaProyectoConstantesFunciones.actualizarSelectedLista(presutipocuentaproyecto,presutipocuentaproyectos);
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public Boolean tieneElementosSeleccionados() throws Exception {
		Boolean tiene=false;
		
		List<PresuTipoCuentaProyecto> presutipocuentaproyectosLocal=null;
		
		try	{			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				presutipocuentaproyectosLocal=this.presutipocuentaproyectoLogic.getPresuTipoCuentaProyectos();
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				presutipocuentaproyectosLocal=this.presutipocuentaproyectos;
			}
			//ARCHITECTURE
		
			for(PresuTipoCuentaProyecto presutipocuentaproyectoLocal:presutipocuentaproyectosLocal) {
				if(this.permiteMantenimiento(presutipocuentaproyectoLocal) && presutipocuentaproyectoLocal.getIsSelected()) {
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
			sMensaje+="\r\n"+PresuTipoCuentaProyectoConstantesFunciones.getPresuTipoCuentaProyectoLabelDesdeNombre(invalidValue.getPropertyName())+"->"+invalidValue.getMessage();
			
			//MOSTRAR CAMPOS INVALIDOS
			if(invalidValue.getPropertyName().equals(PresuTipoCuentaProyectoConstantesFunciones.IDEMPRESA)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormPresuTipoCuentaProyecto.jLabelid_empresaPresuTipoCuentaProyecto,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(PresuTipoCuentaProyectoConstantesFunciones.CODIGO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormPresuTipoCuentaProyecto.jLabelcodigoPresuTipoCuentaProyecto,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(PresuTipoCuentaProyectoConstantesFunciones.NOMBRE)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormPresuTipoCuentaProyecto.jLabelnombrePresuTipoCuentaProyecto,invalidValue.getMessage());}
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
		
		if(this.jInternalFrameDetalleFormPresuTipoCuentaProyecto!=null) {
		
		//MOSTRAR CAMPOS INVALIDOS
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormPresuTipoCuentaProyecto.jLabelid_empresaPresuTipoCuentaProyecto,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormPresuTipoCuentaProyecto.jLabelcodigoPresuTipoCuentaProyecto,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormPresuTipoCuentaProyecto.jLabelnombrePresuTipoCuentaProyecto,"");
		
		}
	}
	
	
	
	public void actualizarObjetoPadreFk(String sTipo)  throws Exception {
		if(sTipo.equals("XXXAuxiliar")) {
		
		}
		
	}
	
	public void nuevoPreparar() throws Exception {
		this.nuevoPreparar(false);
	}
	
	public void nuevoPreparar(Boolean esNuevoGuardarCambios) throws Exception {
		this.iIdNuevoPresuTipoCuentaProyecto--;	
		
		
		this.presutipocuentaproyectoAux=new PresuTipoCuentaProyecto();
		
		this.presutipocuentaproyectoAux.setId(this.iIdNuevoPresuTipoCuentaProyecto);
		this.presutipocuentaproyectoAux.setIsChanged(true);
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.presutipocuentaproyectoLogic.getPresuTipoCuentaProyectos().add(this.presutipocuentaproyectoAux);
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.presutipocuentaproyectos.add(this.presutipocuentaproyectoAux);
		}
		//ARCHITECTURE
		
		this.presutipocuentaproyecto=this.presutipocuentaproyectoAux;
		
		if(PresuTipoCuentaProyectoJInternalFrame.ISBINDING_MANUAL_TABLA) {
			this.setVariablesObjetoActualToFormularioPresuTipoCuentaProyecto(this.presutipocuentaproyecto);
			this.setVariablesObjetoActualToFormularioForeignKeyPresuTipoCuentaProyecto(this.presutipocuentaproyecto);
		}
				
		//this.setDefaultControlesPresuTipoCuentaProyecto();
		
		this.inicializarInvalidValues();
				
		//SELECCIONA ITEM DEFECTO-->SET O SELECTED INDEX
		this.setItemDefectoCombosForeignKeyPresuTipoCuentaProyecto();
		
		
		//INICIALIZA VARIABLES COMBOS GLOBALES A FORMULARIO(ParametroGeneralUsuario)
		this.setVariablesGlobalesCombosForeignKeyPresuTipoCuentaProyecto();
		
		//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
		//this.setVariablesGlobalesAuxiliaresCombosForeignKeyPresuTipoCuentaProyecto();
		
		//SI TIENE FOREIGN KEY CON CAMPO esDefecto=true, SE ACTUALIZA A OBJETO ACTUAL
		this.setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualPresuTipoCuentaProyecto(this.presutipocuentaproyectoBean,this.presutipocuentaproyecto,false,false);
		
		//ACTUALIZA VALORES PARA EL OBJETO ACTUAL ANTES DE ENVIARLO A ACTUALIZAR
		this.setVariablesFormularioToObjetoActualForeignKeysPresuTipoCuentaProyecto(this.presutipocuentaproyecto);
				
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		if(this.jInternalFrameParent!=null) {
			this.jInternalFrameParent.actualizarObjetoPadreFk(PresuTipoCuentaProyectoConstantesFunciones.CLASSNAME);
		}	
		
		
		if(this.presutipocuentaproyectoSessionBean.getConGuardarRelaciones()) {
			classes=PresuTipoCuentaProyectoConstantesFunciones.getClassesRelationshipsOfPresuTipoCuentaProyecto(new ArrayList<Classe>(),DeepLoadType.NONE);
		}
		
		this.classesActual=new ArrayList<Classe>();
		this.classesActual.addAll(classes);
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {						
			this.presutipocuentaproyectoReturnGeneral=presutipocuentaproyectoLogic.procesarEventosPresuTipoCuentaProyectosWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,EventoGlobalTipo.FORM_RECARGAR,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.presutipocuentaproyectoLogic.getPresuTipoCuentaProyectos(),this.presutipocuentaproyecto,this.presutipocuentaproyectoParameterGeneral,this.isEsNuevoPresuTipoCuentaProyecto,classes);//this.presutipocuentaproyectoLogic.getPresuTipoCuentaProyecto()
						
		} else if(Constantes.ISUSAEJBREMOTE) {
						
		} else if(Constantes.ISUSAEJBHOME) {
		}
		//ARCHITECTURE
		
		//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
		//this.setVariablesObjetoReturnGeneralToBeanPresuTipoCuentaProyecto(this.presutipocuentaproyectoReturnGeneral,this.presutipocuentaproyectoBean,false);
		
		if(this.presutipocuentaproyectoReturnGeneral.getConRecargarPropiedades()) {
			//INICIALIZA VARIABLES COMBOS NORMALES (FK)
			this.setVariablesObjetoActualToFormularioForeignKeyPresuTipoCuentaProyecto(this.presutipocuentaproyectoReturnGeneral.getPresuTipoCuentaProyecto());
			
			//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
			this.setVariablesObjetoActualToFormularioPresuTipoCuentaProyecto(this.presutipocuentaproyectoReturnGeneral.getPresuTipoCuentaProyecto());
		}
		
		if(this.presutipocuentaproyectoReturnGeneral.getConRecargarRelaciones()) {
			//INICIALIZA VARIABLES RELACIONES A FORMULARIO
			this.setVariablesRelacionesObjetoActualToFormularioPresuTipoCuentaProyecto(this.presutipocuentaproyectoReturnGeneral.getPresuTipoCuentaProyecto(),classes);//this.presutipocuentaproyectoBean);	
		}
			
		//ACTUALIZA VARIABLES FORMULARIO A OBJETO ACTUAL (PARA NUEVO TABLA O GUARDAR CAMBIOS
		if(esNuevoGuardarCambios) {
			this.setVariablesFormularioToObjetoActualPresuTipoCuentaProyecto(this.presutipocuentaproyecto,false);
		}
		
		//INICIALIZA VARIABLES COMBOS DEFAULT DEL PROYECTO(|DEFAULT para FK)
		//this.setVariablesDefaultCombosForeignKeyPresuTipoCuentaProyecto();
		
		//INICIALIZA VARIABLES COMBOS PARAMETRO DEL PROYECTO(|VALORPARAM Era para ParametroModulo, ahora en logic)
		//this.setVariablesParametroCombosForeignKeyPresuTipoCuentaProyecto();						
		
		if(!esNuevoGuardarCambios) {
			//INICIALIZA VARIABLES POR OPCION MENU
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			PresuTipoCuentaProyectoBeanSwingJInternalFrameAdditional.RecargarFormPresuTipoCuentaProyecto(this,"NUEVO_PREPARAR","",this.arrDatoGeneral);
		
			//NO FUNCIONA BINDINGS			
			this.inicializarActualizarBindingPresuTipoCuentaProyecto(false);
						
			if(presutipocuentaproyectoSessionBean.getConGuardarRelaciones()) {
				//DEBERIA YA ESTAR CARGADO LOS COMBOS Y SI SE NECESITA ALGO MAS SE DEBE CREAR FUNCION LIMITADA
				//SI DEBE TRAER Y RESETEAR TABLA
								
			}
				
			//SI ES MANUAL
			if(PresuTipoCuentaProyectoJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualPresuTipoCuentaProyecto();
			}
			
			this.actualizarVisualTableDatosPresuTipoCuentaProyecto();
			
			this.jTableDatosPresuTipoCuentaProyecto.setRowSelectionInterval(this.getIndiceNuevoPresuTipoCuentaProyecto(), this.getIndiceNuevoPresuTipoCuentaProyecto());
			
			this.seleccionarFilaTablaPresuTipoCuentaProyectoActual();
						
			this.actualizarEstadoCeldasBotonesPresuTipoCuentaProyecto("a", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		}		
	}
	
	public void habilitarDeshabilitarControlesPresuTipoCuentaProyecto(Boolean isHabilitar) throws Exception {
		
		this.jInternalFrameDetalleFormPresuTipoCuentaProyecto.jTextFieldcodigoPresuTipoCuentaProyecto.setEnabled(isHabilitar && this.presutipocuentaproyectoConstantesFunciones.activarcodigoPresuTipoCuentaProyecto);
		this.jInternalFrameDetalleFormPresuTipoCuentaProyecto.jTextAreanombrePresuTipoCuentaProyecto.setEnabled(isHabilitar && this.presutipocuentaproyectoConstantesFunciones.activarnombrePresuTipoCuentaProyecto);	
		//
		this.jInternalFrameDetalleFormPresuTipoCuentaProyecto.jComboBoxid_empresaPresuTipoCuentaProyecto.setEnabled(isHabilitar && this.presutipocuentaproyectoConstantesFunciones.activarid_empresaPresuTipoCuentaProyecto);
	};
	
	public void setDefaultControlesPresuTipoCuentaProyecto() throws Exception {
			
	};
	
	
	public void habilitarDeshabilitarTipoMantenimientoPresuTipoCuentaProyecto(Boolean esRelaciones) throws Exception {
		if(esRelaciones) {
			//this.presutipocuentaproyectoSessionBean.setConGuardarRelaciones(true);			
			this.presutipocuentaproyectoSessionBean.setEstaModoGuardarRelaciones(true);				
			this.jInternalFrameDetalleFormPresuTipoCuentaProyecto.jTabbedPaneRelacionesPresuTipoCuentaProyecto.setVisible(true);
			
					
		} else {
			//this.presutipocuentaproyectoSessionBean.setConGuardarRelaciones(false);			
			this.presutipocuentaproyectoSessionBean.setEstaModoGuardarRelaciones(false);						
			this.jInternalFrameDetalleFormPresuTipoCuentaProyecto.jTabbedPaneRelacionesPresuTipoCuentaProyecto.setVisible(false);
			
			
		}
	};
	
	public int getIndiceNuevoPresuTipoCuentaProyecto() throws Exception {
		int iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(PresuTipoCuentaProyecto presutipocuentaproyectoAux:this.presutipocuentaproyectoLogic.getPresuTipoCuentaProyectos()) {
				if(presutipocuentaproyectoAux.getId().equals(this.iIdNuevoPresuTipoCuentaProyecto)) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(PresuTipoCuentaProyecto presutipocuentaproyectoAux:this.presutipocuentaproyectos) {
				if(presutipocuentaproyectoAux.getId().equals(this.iIdNuevoPresuTipoCuentaProyecto)) {
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
	
	public int getIndiceActualPresuTipoCuentaProyecto(PresuTipoCuentaProyecto presutipocuentaproyecto,Integer iIndiceActual) throws Exception {
		Integer iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(PresuTipoCuentaProyecto presutipocuentaproyectoAux:this.presutipocuentaproyectoLogic.getPresuTipoCuentaProyectos()) {
				if(presutipocuentaproyectoAux.getId().equals(presutipocuentaproyecto.getId())) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(PresuTipoCuentaProyecto presutipocuentaproyectoAux:this.presutipocuentaproyectos) {
				if(presutipocuentaproyectoAux.getId().equals(presutipocuentaproyecto.getId())) {
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
	
	public void setCamposBaseDesdeOriginalPresuTipoCuentaProyecto(PresuTipoCuentaProyecto presutipocuentaproyectoOriginal) throws Exception {
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(PresuTipoCuentaProyecto presutipocuentaproyectoAux:this.presutipocuentaproyectoLogic.getPresuTipoCuentaProyectos()) {
				if(presutipocuentaproyectoAux.getPresuTipoCuentaProyectoOriginal().getId().equals(presutipocuentaproyectoOriginal.getId())) {
					existe=true;
					presutipocuentaproyectoOriginal.setId(presutipocuentaproyectoAux.getId());
					presutipocuentaproyectoOriginal.setVersionRow(presutipocuentaproyectoAux.getVersionRow());
					break;
				}
				
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(PresuTipoCuentaProyecto presutipocuentaproyectoAux:this.presutipocuentaproyectos) {
				if(presutipocuentaproyectoAux.getPresuTipoCuentaProyectoOriginal().getId().equals(presutipocuentaproyectoOriginal.getId())) {
					existe=true;
					presutipocuentaproyectoOriginal.setId(presutipocuentaproyectoAux.getId());
					presutipocuentaproyectoOriginal.setVersionRow(presutipocuentaproyectoAux.getVersionRow());
					break;
				}				
			}
		}
		//ARCHITECTURE
		
		if(!existe) {
			//SI NO EXISTE TOMA LA ULTIMA FILA
		}
	}
	
	public void cancelarNuevosPresuTipoCuentaProyecto(Boolean esParaCancelar) throws Exception {
		presutipocuentaproyectosAux=new ArrayList<PresuTipoCuentaProyecto>();
		presutipocuentaproyectoAux=new PresuTipoCuentaProyecto();
		
		if(!this.presutipocuentaproyectoSessionBean.getEsGuardarRelacionado()) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(PresuTipoCuentaProyecto presutipocuentaproyectoAux:this.presutipocuentaproyectoLogic.getPresuTipoCuentaProyectos()) {
					if(presutipocuentaproyectoAux.getId()<0) {
						presutipocuentaproyectosAux.add(presutipocuentaproyectoAux);
					}		
				}
				this.iIdNuevoPresuTipoCuentaProyecto=0L;
				this.presutipocuentaproyectoLogic.getPresuTipoCuentaProyectos().removeAll(presutipocuentaproyectosAux);
					
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(PresuTipoCuentaProyecto presutipocuentaproyectoAux:this.presutipocuentaproyectos) {
					if(presutipocuentaproyectoAux.getId()<0) {
						presutipocuentaproyectosAux.add(presutipocuentaproyectoAux);
					}		
				}
				this.iIdNuevoPresuTipoCuentaProyecto=0L;
				this.presutipocuentaproyectos.removeAll(presutipocuentaproyectosAux);
			}	
		} else {			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				if(esParaCancelar && this.isEsNuevoPresuTipoCuentaProyecto 
					&& this.presutipocuentaproyectoLogic.getPresuTipoCuentaProyectos().size()>0
					) {
					presutipocuentaproyectoAux=this.presutipocuentaproyectoLogic.getPresuTipoCuentaProyectos().get(this.presutipocuentaproyectoLogic.getPresuTipoCuentaProyectos().size() - 1);
				
					if(presutipocuentaproyectoAux.getId()<0) {
						this.presutipocuentaproyectoLogic.getPresuTipoCuentaProyectos().remove(presutipocuentaproyectoAux);
					}
				}
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				if(esParaCancelar && this.isEsNuevoPresuTipoCuentaProyecto && this.presutipocuentaproyectos.size()>0) {
					presutipocuentaproyectoAux=this.presutipocuentaproyectos.get(this.presutipocuentaproyectos.size() - 1);
				
					if(presutipocuentaproyectoAux.getId()<0) {
						this.presutipocuentaproyectos.remove(presutipocuentaproyectoAux);
					}
				}
			}	
		}
	}
	
	public void cancelarNuevoPresuTipoCuentaProyecto(Boolean esParaCancelar) throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			if(presutipocuentaproyecto.getId()<0) {
				this.presutipocuentaproyectoLogic.getPresuTipoCuentaProyectos().remove(this.presutipocuentaproyecto);
			}					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			if(presutipocuentaproyecto.getId()<0) {
				this.presutipocuentaproyectos.remove(this.presutipocuentaproyecto);
			}
		}			
	}
	
	public void setEstadosInicialesPresuTipoCuentaProyecto(List<PresuTipoCuentaProyecto> presutipocuentaproyectosAux) throws Exception {
		PresuTipoCuentaProyectoConstantesFunciones.setEstadosInicialesPresuTipoCuentaProyecto(presutipocuentaproyectosAux);
	}
	
	public void setEstadosInicialesPresuTipoCuentaProyecto(PresuTipoCuentaProyecto presutipocuentaproyectoAux) throws Exception {
		PresuTipoCuentaProyectoConstantesFunciones.setEstadosInicialesPresuTipoCuentaProyecto(presutipocuentaproyectoAux);		
	}
	
	public void nuevo() throws Exception {
		try	{
			//ESTA VALIDADO EN FUNCION ACTUALIZAR
			//if(this.validarPresuTipoCuentaProyectoActual()) {
				this.ejecutarMantenimiento(MaintenanceType.NUEVO);
				
				this.actualizarEstadoCeldasBotonesPresuTipoCuentaProyecto("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
				
			//}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,PresuTipoCuentaProyectoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void actualizar() throws Exception {
		try	{
			if(this.validarPresuTipoCuentaProyectoActual()) {
				if(!this.isEsNuevoPresuTipoCuentaProyecto) {
					this.ejecutarMantenimiento(MaintenanceType.ACTUALIZAR);
					
					this.actualizarEstadoCeldasBotonesPresuTipoCuentaProyecto("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
					
				} else {					
					this.nuevo();
					this.isEsNuevoPresuTipoCuentaProyecto=false;
				}
				
				//SE CANCELA AL FINAL DEL PROCESO JBUTTONACTUALIZAR
				//this.cancelar(false);
			}		
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,PresuTipoCuentaProyectoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void eliminar() throws Exception {
		try	{	
			if(this.validarPresuTipoCuentaProyectoActual()) {
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE ELIMINAR EL/LA Tipo Cuenta Proyecto ?", "MANTENIMIENTO DE Tipo Cuenta Proyecto", JOptionPane.OK_CANCEL_OPTION) == 0) {
					this.ejecutarMantenimiento(MaintenanceType.ELIMINAR);			
					this.actualizarEstadoCeldasBotonesPresuTipoCuentaProyecto("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
				}
			
			}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,PresuTipoCuentaProyectoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void guardarCambios() throws Exception {
		try	{
			this.ejecutarMantenimiento(MaintenanceType.GUARDARCAMBIOS);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PresuTipoCuentaProyectoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarAsignar(PresuTipoCuentaProyecto presutipocuentaproyecto) throws Exception {
		PresuTipoCuentaProyectoConstantesFunciones.seleccionarAsignar(this.presutipocuentaproyecto,presutipocuentaproyecto);
	}
	
	public void seleccionar() throws Exception {
		try	{
			//ACTUALIZO EL PERMISO ACTUALIZAR CON EL PERMISO ACTUALIZAR ORIGINAL ESTE PERMISO SE UTILIZA PARA EL NUEVO TAMBIEN
			this.isPermisoActualizarPresuTipoCuentaProyecto=this.isPermisoActualizarOriginalPresuTipoCuentaProyecto;
			
			
			this.seleccionarAsignar(presutipocuentaproyecto);
			
			
			
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			PresuTipoCuentaProyectoConstantesFunciones.quitarEspaciosPresuTipoCuentaProyecto(this.presutipocuentaproyecto,this.arrDatoGeneral);
			
			
			this.actualizarEstadoCeldasBotonesPresuTipoCuentaProyecto("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PresuTipoCuentaProyectoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarBusqueda(Long id) throws Exception {
		try	{
			this.presutipocuentaproyectoSessionBean.setsFuncionBusquedaRapida(this.presutipocuentaproyectoSessionBean.getsFuncionBusquedaRapida().replace("TO_REPLACE", id.toString()));
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PresuTipoCuentaProyectoConstantesFunciones.CLASSNAME);
		}
	}
	
	
	
	public void cancelar() throws Exception {
		this.cancelar(true);
	}
	
	public void cancelar(Boolean esParaCancelar) throws Exception {
		try {
														
			
			//SE UTILIZA COLUMNA ELIMINAR EN TABLA
			if(this.isEsNuevoPresuTipoCuentaProyecto) {
				//NO CANCELA TODOS NUEVOS POR FUNCIONALIDAD GUARDAR CAMBIOS
				//this.cancelarNuevosPresuTipoCuentaProyecto(esParaCancelar);				
				this.cancelarNuevoPresuTipoCuentaProyecto(esParaCancelar);								
			}
			
			this.presutipocuentaproyecto=new PresuTipoCuentaProyecto();
			
			this.inicializarPresuTipoCuentaProyecto();
			
			this.actualizarEstadoCeldasBotonesPresuTipoCuentaProyecto("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PresuTipoCuentaProyectoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void inicializarPresuTipoCuentaProyecto() throws Exception {
		try {
			PresuTipoCuentaProyectoConstantesFunciones.inicializarPresuTipoCuentaProyecto(this.presutipocuentaproyecto);
			
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
			FuncionesSwing.manageException(this, e,logger,PresuTipoCuentaProyectoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void siguientes()throws Exception {
		try	{			
			if(this.presutipocuentaproyectoLogic.getPresuTipoCuentaProyectos().size()>0) {
					
				this.iNumeroPaginacionPagina=this.iNumeroPaginacionPagina+this.iNumeroPaginacion;
			}
				
			this.procesarBusqueda(this.sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PresuTipoCuentaProyectoConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void generarReportePresuTipoCuentaProyectos(String sAccionBusqueda,List<PresuTipoCuentaProyecto> presutipocuentaproyectosParaReportes) throws Exception {
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
					sPathReporteFinal="PresuTipoCuentaProyecto"+this.sTipoReporteExtra+"Design.jasper";
					reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);	
				} else {
					sPathReporteFinal=this.sPathReporteDinamico;
					reportFile = new FileInputStream(sPathReporteFinal);
				}
			} else {
				sPathReporteFinal="PresuTipoCuentaProyectoMasterRelaciones"+this.sTipoReporteExtra+"Design.jasper";
				reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);
				//sPathReportes=reportFile.getPath().replace("PresuTipoCuentaProyectoMasterRelacionesDesign.jasper", "");
			}
		} else {
				sPathReporteFinal="PresuTipoCuentaProyecto"+this.sTipoReporteExtra+"Design.jasper";
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
		parameters.put("subtitulo", "Reporte De  Tipo Cuenta Proyectos");		
		parameters.put("busquedapor", PresuTipoCuentaProyectoConstantesFunciones.getNombreIndice(sAccionBusqueda)+sDetalleReporte);
		
		
		if(this.sTipoReporte.equals("RELACIONES")) {//isEsReporteRelaciones
			parameters.put("SUBREPORT_DIR", sPathReportes);
		}
		
		parameters.put("con_grafico", this.conGraficoReporte);
		
		JasperReport jasperReport = (JasperReport)JRLoader.loadObject(reportFile);
				
		this.cargarDatosCliente();
		
		ArrayList<Classe> classes=new ArrayList<Classe>();		
		
		if(this.sTipoReporte.equals("RELACIONES")) {//isEsReporteRelaciones
			
			
		} else {
			//FK DEBERIA TRAERSE DE ANTEMANO
			
		}
								
		
		//CLASSES PARA REPORTES OBJETOS RELACIONADOS
		if(!this.sTipoReporte.equals("RELACIONES")) {//!isEsReporteRelaciones
			classes=new ArrayList<Classe>();
		}
		
		JRBeanArrayDataSource jrbeanArrayDataSourcePresuTipoCuentaProyecto=null;
		
		if(this.sTipoReporteExtra!=null && !this.sTipoReporteExtra.equals("")) {
			PresuTipoCuentaProyectoConstantesFunciones.S_TIPOREPORTE_EXTRA=this.sTipoReporteExtra;
		} else {
			PresuTipoCuentaProyectoConstantesFunciones.S_TIPOREPORTE_EXTRA="";
		}
		
		jrbeanArrayDataSourcePresuTipoCuentaProyecto=new JRBeanArrayDataSource(PresuTipoCuentaProyectoJInternalFrame.TraerPresuTipoCuentaProyectoBeans(presutipocuentaproyectosParaReportes,classes).toArray());
		
		jasperPrint = JasperFillManager.fillReport(jasperReport,parameters,jrbeanArrayDataSourcePresuTipoCuentaProyecto);
				
		
		String sPathDest=Constantes.SUNIDAD_ARCHIVOS+":/"+Constantes.SCONTEXTSERVER+"/"+PresuTipoCuentaProyectoConstantesFunciones.SCHEMA+"/reportes";
		
		File filePathDest = new File(sPathDest);
		
		if(!filePathDest.exists()) {
			filePathDest.mkdirs();				
		}
				
		String sDestFileName=sPathDest+"/"+PresuTipoCuentaProyectoConstantesFunciones.CLASSNAME;
				
		if(this.sTipoArchivoReporte=="VISUALIZAR") {
			JasperViewer jasperViewer = new JasperViewer(jasperPrint,false) ;
			jasperViewer.setVisible(true) ; 

		} else if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML") {	
			//JasperFillManager.fillReportToFile(reportFile.getAbsolutePath(),parameters, new JRBeanArrayDataSource(PresuTipoCuentaProyectoBean.TraerPresuTipoCuentaProyectoBeans(presutipocuentaproyectosParaReportes).toArray()));
							
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
				this.generarExcelReportePresuTipoCuentaProyectos(sAccionBusqueda,sTipoArchivoReporte,presutipocuentaproyectosParaReportes);
			
			} else if(this.sTipoReporte.equals("FORMULARIO")){
				this.generarExcelReporteVerticalPresuTipoCuentaProyectos(sAccionBusqueda,sTipoArchivoReporte,presutipocuentaproyectosParaReportes,false);
			
			} else if(this.sTipoReporte.equals("DINAMICO")){
				
				if(this.sTipoReporteDinamico.equals("NORMAL")) {
					
					this.jButtonGenerarExcelReporteDinamicoPresuTipoCuentaProyectoActionPerformed(null);
					//this.generarExcelReportePresuTipoCuentaProyectos(sAccionBusqueda,sTipoArchivoReporte,presutipocuentaproyectosParaReportes);
					
				
				} else if(this.sTipoReporteDinamico.equals("FORMULARIO")){
					this.generarExcelReporteVerticalPresuTipoCuentaProyectos(sAccionBusqueda,sTipoArchivoReporte,presutipocuentaproyectosParaReportes,true);
				
				} else if(this.sTipoReporteDinamico.equals("RELACIONES")){
					this.generarExcelReporteRelacionesPresuTipoCuentaProyectos(sAccionBusqueda,sTipoArchivoReporte,presutipocuentaproyectosParaReportes,true);
				}
				
			} else if(this.sTipoReporte.equals("RELACIONES")){
				this.generarExcelReporteRelacionesPresuTipoCuentaProyectos(sAccionBusqueda,sTipoArchivoReporte,presutipocuentaproyectosParaReportes,false);
			}
		}
		
		if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML"||this.sTipoArchivoReporte=="WORD"||this.sTipoArchivoReporte=="EXCEL") {				
			JOptionPane.showMessageDialog(this,"REPORTE "+sDestFileName+" GENERADO SATISFACTORIAMENTE","REPORTES ",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReportePresuTipoCuentaProyectos(String sAccionBusqueda,String sTipoArchivoReporte,List<PresuTipoCuentaProyecto> presutipocuentaproyectosParaReportes) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"presutipocuentaproyecto";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("PresuTipoCuentaProyectos");
         
        int iRow = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderPresuTipoCuentaProyecto("NORMAL",row,workbook);
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux=null;
		
		int i=0;
		
      	for(PresuTipoCuentaProyecto presutipocuentaproyecto : presutipocuentaproyectosParaReportes) {            
			row = sheet.createRow(iRow++);
			iCell = 0;
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				cellStyleDataAux=cellStyleData;
			}
			
			PresuTipoCuentaProyectoConstantesFunciones.generarExcelReporteDataPresuTipoCuentaProyecto("NORMAL",row,workbook,presutipocuentaproyecto,cellStyleDataAux);
		
			
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
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.presutipocuentaproyectoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Cuenta Proyecto",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteHeaderPresuTipoCuentaProyecto(String sTipo,Row row,Workbook workbook) {
		
		PresuTipoCuentaProyectoConstantesFunciones.generarExcelReporteHeaderPresuTipoCuentaProyecto(sTipo,row,workbook);
		
		/*
		Cell cell=null;
		int iCell=0;
		
		CellStyle cellStyle = workbook.createCellStyle();
		cellStyle.setFillBackgroundColor(IndexedColors.GREEN.getIndex());
		cellStyle.setFillPattern(CellStyle.ALIGN_FILL);
		*/
		
	}
	
	public void generarExcelReporteVerticalPresuTipoCuentaProyectos(String sAccionBusqueda,String sTipoArchivoReporte,List<PresuTipoCuentaProyecto> presutipocuentaproyectosParaReportes,Boolean paraDinamico) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"presutipocuentaproyecto_vertical";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("PresuTipoCuentaProyectos");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		CellStyle cellStyle = Funciones2.getStyleTitulo(workbook,"ZEBRA");;
		
		CellStyle cellStyleTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL_VERTICAL");
		
		
		for(PresuTipoCuentaProyecto presutipocuentaproyecto : presutipocuentaproyectosParaReportes) {
			row = sheet.createRow(iRow++);
			iRowLast=iRow - 1;
			
			cell = row.createCell(0);
			cell.setCellValue(PresuTipoCuentaProyectoConstantesFunciones.getPresuTipoCuentaProyectoDescripcion(presutipocuentaproyecto));
			cell.setCellStyle(cellStyleTitulo);
			
			sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
	
			


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(PresuTipoCuentaProyectoConstantesFunciones.LABEL_IDEMPRESA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(PresuTipoCuentaProyectoConstantesFunciones.LABEL_IDEMPRESA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(presutipocuentaproyecto.getempresa_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(PresuTipoCuentaProyectoConstantesFunciones.LABEL_CODIGO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(PresuTipoCuentaProyectoConstantesFunciones.LABEL_CODIGO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(presutipocuentaproyecto.getcodigo());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(PresuTipoCuentaProyectoConstantesFunciones.LABEL_NOMBRE))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(PresuTipoCuentaProyectoConstantesFunciones.LABEL_NOMBRE);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(presutipocuentaproyecto.getnombre());


			}						
        }
        
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.presutipocuentaproyectoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Cuenta Proyecto",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteRelacionesPresuTipoCuentaProyectos(String sAccionBusqueda,String sTipoArchivoReporte,List<PresuTipoCuentaProyecto> presutipocuentaproyectosParaReportes,Boolean paraDinamico) throws Exception {
		
		ArrayList<Classe> classes=new ArrayList<Classe>();
		List<PresuTipoCuentaProyecto> presutipocuentaproyectosRespaldo=null;
		
		classes=PresuTipoCuentaProyectoConstantesFunciones.getClassesRelationshipsOfPresuTipoCuentaProyecto(new ArrayList<Classe>(),DeepLoadType.NONE,false);
					
		this.datosDeep=new DatosDeep();
		
		this.datosDeep.setIsDeep(false);
		this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
		this.datosDeep.setClases(classes);
			
		this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
		this.datosCliente.setIsConDeep(true);	
		this.datosCliente.setIsConExportar(false);
		
						
		this.presutipocuentaproyectoLogic.setDatosCliente(this.datosCliente);
		this.presutipocuentaproyectoLogic.setDatosDeep(this.datosDeep);
		this.presutipocuentaproyectoLogic.setIsConDeep(true);
		
		presutipocuentaproyectosRespaldo=this.presutipocuentaproyectoLogic.getPresuTipoCuentaProyectos();
		
		this.presutipocuentaproyectoLogic.setPresuTipoCuentaProyectos(presutipocuentaproyectosParaReportes);	
		this.presutipocuentaproyectoLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
		
		presutipocuentaproyectosParaReportes=this.presutipocuentaproyectoLogic.getPresuTipoCuentaProyectos();
		this.presutipocuentaproyectoLogic.setPresuTipoCuentaProyectos(presutipocuentaproyectosRespaldo);
		
		
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"presutipocuentaproyecto_relacion";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("PresuTipoCuentaProyectos");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderPresuTipoCuentaProyecto("NORMAL",row,workbook);
		
		int i=0;
		int i2=0;
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL");
		CellStyle cellStyleDataZebra = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux =null;
		CellStyle cellStyleDataAuxHijo =null;
		
		for(PresuTipoCuentaProyecto presutipocuentaproyecto : presutipocuentaproyectosParaReportes) {			
			if(i!=0) {
				row = sheet.createRow(iRow++);				
				this.generarExcelReporteHeaderPresuTipoCuentaProyecto("NORMAL",row,workbook);
			}
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				//cellStyleDataAux=cellStyleData;
			}
			
			row = sheet.createRow(iRow++);						
			PresuTipoCuentaProyectoConstantesFunciones.generarExcelReporteDataPresuTipoCuentaProyecto("NORMAL",row,workbook,presutipocuentaproyecto,cellStyleDataAux);
		
			
			
			
			i++;
        }
        
		/*
		row = sheet.createRow(iRow++);
		iRowLast=iRow - 1;
			
		cell = row.createCell(0);
		cell.setCellValue(PresuTipoCuentaProyectoConstantesFunciones.getPresuTipoCuentaProyectoDescripcion(presutipocuentaproyecto));
		cell.setCellStyle(cellStyleTitulo);
			
		sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
		*/
		
			
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.presutipocuentaproyectoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Cuenta Proyecto",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	
	public Boolean existeColumnaReporteDinamico(String sColumna) {
		Boolean existe=false;
		
		Reporte reporte=new Reporte();
		
		
		for(int index:this.jInternalFrameReporteDinamicoPresuTipoCuentaProyecto.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoPresuTipoCuentaProyecto.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
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
		
		
		for(int index:this.jInternalFrameReporteDinamicoPresuTipoCuentaProyecto.getjListRelacionesSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoPresuTipoCuentaProyecto.getjListRelacionesSelectReporte().getModel().getElementAt(index);
			
			if(sColumna.equals(reporte.getsCodigo())) {
				existe=true;
				break;
			}
		
		}
		
		
		return existe;
	}
	
	public void startProcessPresuTipoCuentaProyecto() throws Exception {		
		this.startProcessPresuTipoCuentaProyecto(true);
	}
	
	public void startProcessPresuTipoCuentaProyecto(Boolean conSplash) throws Exception {		
		//FuncionesSwing.enableDisablePanels(false,this.jTabbedPaneBusquedasPresuTipoCuentaProyecto ,this.jPanelParametrosReportesPresuTipoCuentaProyecto, this.jScrollPanelDatosPresuTipoCuentaProyecto,this.jPanelPaginacionPresuTipoCuentaProyecto, this.jScrollPanelDatosEdicionPresuTipoCuentaProyecto, this.jPanelAccionesPresuTipoCuentaProyecto,this.jPanelAccionesFormularioPresuTipoCuentaProyecto,this.jmenuBarPresuTipoCuentaProyecto,this.jmenuBarDetallePresuTipoCuentaProyecto,this.jTtoolBarPresuTipoCuentaProyecto,this.jTtoolBarDetallePresuTipoCuentaProyecto);		
		
		final JTabbedPane jTabbedPaneBusquedasPresuTipoCuentaProyecto=this.jTabbedPaneBusquedasPresuTipoCuentaProyecto; 
		
		final JPanel jPanelParametrosReportesPresuTipoCuentaProyecto=this.jPanelParametrosReportesPresuTipoCuentaProyecto;
		//final JScrollPane jScrollPanelDatosPresuTipoCuentaProyecto=this.jScrollPanelDatosPresuTipoCuentaProyecto;
		final JTable jTableDatosPresuTipoCuentaProyecto=this.jTableDatosPresuTipoCuentaProyecto;		
		final JPanel jPanelPaginacionPresuTipoCuentaProyecto=this.jPanelPaginacionPresuTipoCuentaProyecto;
		//final JScrollPane jScrollPanelDatosEdicionPresuTipoCuentaProyecto=this.jScrollPanelDatosEdicionPresuTipoCuentaProyecto;
		final JPanel jPanelAccionesPresuTipoCuentaProyecto=this.jPanelAccionesPresuTipoCuentaProyecto;
		
		JPanel jPanelCamposAuxiliarPresuTipoCuentaProyecto=new JPanelMe();
		JPanel jPanelAccionesFormularioAuxiliarPresuTipoCuentaProyecto=new JPanelMe();
		
		if(this.jInternalFrameDetalleFormPresuTipoCuentaProyecto!=null) {
			jPanelCamposAuxiliarPresuTipoCuentaProyecto=this.jInternalFrameDetalleFormPresuTipoCuentaProyecto.jPanelCamposPresuTipoCuentaProyecto;
			jPanelAccionesFormularioAuxiliarPresuTipoCuentaProyecto=this.jInternalFrameDetalleFormPresuTipoCuentaProyecto.jPanelAccionesFormularioPresuTipoCuentaProyecto;
		}
		
		final JPanel jPanelCamposPresuTipoCuentaProyecto=jPanelCamposAuxiliarPresuTipoCuentaProyecto;
		final JPanel jPanelAccionesFormularioPresuTipoCuentaProyecto=jPanelAccionesFormularioAuxiliarPresuTipoCuentaProyecto;
		
		
		final JMenuBar jmenuBarPresuTipoCuentaProyecto=this.jmenuBarPresuTipoCuentaProyecto;
		final JToolBar jTtoolBarPresuTipoCuentaProyecto=this.jTtoolBarPresuTipoCuentaProyecto;		
		
		
		JMenuBar jmenuBarDetalleAuxiliarPresuTipoCuentaProyecto=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarPresuTipoCuentaProyecto=new JToolBar();		
		
		if(this.jInternalFrameDetalleFormPresuTipoCuentaProyecto!=null) {
			jmenuBarDetalleAuxiliarPresuTipoCuentaProyecto=this.jInternalFrameDetalleFormPresuTipoCuentaProyecto.jmenuBarDetallePresuTipoCuentaProyecto;
			jTtoolBarDetalleAuxiliarPresuTipoCuentaProyecto=this.jInternalFrameDetalleFormPresuTipoCuentaProyecto.jTtoolBarDetallePresuTipoCuentaProyecto;
		}
		
		final JMenuBar jmenuBarDetallePresuTipoCuentaProyecto=jmenuBarDetalleAuxiliarPresuTipoCuentaProyecto;
		final JToolBar jTtoolBarDetallePresuTipoCuentaProyecto=jTtoolBarDetalleAuxiliarPresuTipoCuentaProyecto;		
		
		
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasPresuTipoCuentaProyecto;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesPresuTipoCuentaProyecto;
			processRunnable.jTableDatos=jTableDatosPresuTipoCuentaProyecto;
			processRunnable.jPanelCampos=jPanelCamposPresuTipoCuentaProyecto;
			processRunnable.jPanelPaginacion=jPanelPaginacionPresuTipoCuentaProyecto;
			processRunnable.jPanelAcciones=jPanelAccionesPresuTipoCuentaProyecto;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioPresuTipoCuentaProyecto;
			
			
			processRunnable.jmenuBar=jmenuBarPresuTipoCuentaProyecto;
			processRunnable.jmenuBarDetalle=jmenuBarDetallePresuTipoCuentaProyecto;
			processRunnable.jTtoolBar=jTtoolBarPresuTipoCuentaProyecto;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetallePresuTipoCuentaProyecto;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasPresuTipoCuentaProyecto ,jPanelParametrosReportesPresuTipoCuentaProyecto,jTableDatosPresuTipoCuentaProyecto, /*jScrollPanelDatosPresuTipoCuentaProyecto,*/jPanelCamposPresuTipoCuentaProyecto,jPanelPaginacionPresuTipoCuentaProyecto, /*jScrollPanelDatosEdicionPresuTipoCuentaProyecto,*/ jPanelAccionesPresuTipoCuentaProyecto,jPanelAccionesFormularioPresuTipoCuentaProyecto,jmenuBarPresuTipoCuentaProyecto,jmenuBarDetallePresuTipoCuentaProyecto,jTtoolBarPresuTipoCuentaProyecto,jTtoolBarDetallePresuTipoCuentaProyecto);
		
			startProcess();//this.
		}
						
		/*
		if(conSplash) {
			SwingUtilities.invokeLater(new Runnable() {
			      public void run() {
			    	  try {
							FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasPresuTipoCuentaProyecto ,jPanelParametrosReportesPresuTipoCuentaProyecto, jScrollPanelDatosPresuTipoCuentaProyecto,jPanelPaginacionPresuTipoCuentaProyecto, jScrollPanelDatosEdicionPresuTipoCuentaProyecto, jPanelAccionesPresuTipoCuentaProyecto,jPanelAccionesFormularioPresuTipoCuentaProyecto,jmenuBarPresuTipoCuentaProyecto,jmenuBarDetallePresuTipoCuentaProyecto,jTtoolBarPresuTipoCuentaProyecto,jTtoolBarDetallePresuTipoCuentaProyecto);
						
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
	
	public void finishProcessPresuTipoCuentaProyecto() {// throws Exception 
		this.finishProcessPresuTipoCuentaProyecto(true);
	}
	
	public void finishProcessPresuTipoCuentaProyecto(Boolean conSplash) {// throws Exception 
		//FuncionesSwing.enableDisablePanels(true,this.jTabbedPaneBusquedasPresuTipoCuentaProyecto ,this.jPanelParametrosReportesPresuTipoCuentaProyecto, this.jScrollPanelDatosPresuTipoCuentaProyecto,this.jPanelPaginacionPresuTipoCuentaProyecto, this.jScrollPanelDatosEdicionPresuTipoCuentaProyecto, this.jPanelAccionesPresuTipoCuentaProyecto,this.jPanelAccionesFormularioPresuTipoCuentaProyecto,this.jmenuBarPresuTipoCuentaProyecto,this.jmenuBarDetallePresuTipoCuentaProyecto,this.jTtoolBarPresuTipoCuentaProyecto,this.jTtoolBarDetallePresuTipoCuentaProyecto);		
		
		final JTabbedPane jTabbedPaneBusquedasPresuTipoCuentaProyecto=this.jTabbedPaneBusquedasPresuTipoCuentaProyecto; 
		
		final JPanel jPanelParametrosReportesPresuTipoCuentaProyecto=this.jPanelParametrosReportesPresuTipoCuentaProyecto;
		//final JScrollPane jScrollPanelDatosPresuTipoCuentaProyecto=this.jScrollPanelDatosPresuTipoCuentaProyecto;
		final JTable jTableDatosPresuTipoCuentaProyecto=this.jTableDatosPresuTipoCuentaProyecto;		
		final JPanel jPanelPaginacionPresuTipoCuentaProyecto=this.jPanelPaginacionPresuTipoCuentaProyecto;
		//final JScrollPane jScrollPanelDatosEdicionPresuTipoCuentaProyecto=this.jScrollPanelDatosEdicionPresuTipoCuentaProyecto;
		final JPanel jPanelAccionesPresuTipoCuentaProyecto=this.jPanelAccionesPresuTipoCuentaProyecto;
		
		JPanel jPanelCamposAuxiliarPresuTipoCuentaProyecto=new JPanel();
		JPanel jPanelAccionesFormularioAuxiliarPresuTipoCuentaProyecto=new JPanel();
		
		if(this.jInternalFrameDetalleFormPresuTipoCuentaProyecto!=null) {
			jPanelCamposAuxiliarPresuTipoCuentaProyecto=this.jInternalFrameDetalleFormPresuTipoCuentaProyecto.jPanelCamposPresuTipoCuentaProyecto;
			jPanelAccionesFormularioAuxiliarPresuTipoCuentaProyecto=this.jInternalFrameDetalleFormPresuTipoCuentaProyecto.jPanelAccionesFormularioPresuTipoCuentaProyecto;
		}
		
		final JPanel jPanelCamposPresuTipoCuentaProyecto=jPanelCamposAuxiliarPresuTipoCuentaProyecto;
		final JPanel jPanelAccionesFormularioPresuTipoCuentaProyecto=jPanelAccionesFormularioAuxiliarPresuTipoCuentaProyecto;
		
		
		final JMenuBar jmenuBarPresuTipoCuentaProyecto=this.jmenuBarPresuTipoCuentaProyecto;		
		final JToolBar jTtoolBarPresuTipoCuentaProyecto=this.jTtoolBarPresuTipoCuentaProyecto;
				
		JMenuBar jmenuBarDetalleAuxiliarPresuTipoCuentaProyecto=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarPresuTipoCuentaProyecto=new JToolBar();
		
		if(this.jInternalFrameDetalleFormPresuTipoCuentaProyecto!=null) {
			jmenuBarDetalleAuxiliarPresuTipoCuentaProyecto=this.jInternalFrameDetalleFormPresuTipoCuentaProyecto.jmenuBarDetallePresuTipoCuentaProyecto;
			jTtoolBarDetalleAuxiliarPresuTipoCuentaProyecto=this.jInternalFrameDetalleFormPresuTipoCuentaProyecto.jTtoolBarDetallePresuTipoCuentaProyecto;		
		}
		
		final JMenuBar jmenuBarDetallePresuTipoCuentaProyecto=jmenuBarDetalleAuxiliarPresuTipoCuentaProyecto;
		final JToolBar jTtoolBarDetallePresuTipoCuentaProyecto=jTtoolBarDetalleAuxiliarPresuTipoCuentaProyecto;
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasPresuTipoCuentaProyecto;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesPresuTipoCuentaProyecto;
			processRunnable.jTableDatos=jTableDatosPresuTipoCuentaProyecto;
			processRunnable.jPanelCampos=jPanelCamposPresuTipoCuentaProyecto;
			processRunnable.jPanelPaginacion=jPanelPaginacionPresuTipoCuentaProyecto;
			processRunnable.jPanelAcciones=jPanelAccionesPresuTipoCuentaProyecto;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioPresuTipoCuentaProyecto;
			
			
			processRunnable.jmenuBar=jmenuBarPresuTipoCuentaProyecto;
			processRunnable.jmenuBarDetalle=jmenuBarDetallePresuTipoCuentaProyecto;
			processRunnable.jTtoolBar=jTtoolBarPresuTipoCuentaProyecto;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetallePresuTipoCuentaProyecto;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			if(conSplash) {
				SwingUtilities.invokeLater(new RunnableProceso(true,this,jTabbedPaneBusquedasPresuTipoCuentaProyecto ,jPanelParametrosReportesPresuTipoCuentaProyecto, jTableDatosPresuTipoCuentaProyecto,/*jScrollPanelDatosPresuTipoCuentaProyecto,*/jPanelCamposPresuTipoCuentaProyecto,jPanelPaginacionPresuTipoCuentaProyecto, /*jScrollPanelDatosEdicionPresuTipoCuentaProyecto,*/ jPanelAccionesPresuTipoCuentaProyecto,jPanelAccionesFormularioPresuTipoCuentaProyecto,jmenuBarPresuTipoCuentaProyecto,jmenuBarDetallePresuTipoCuentaProyecto,jTtoolBarPresuTipoCuentaProyecto,jTtoolBarDetallePresuTipoCuentaProyecto));
			}
		}						
	}
	
	/*
	public void habilitarDeshabilitarControlesPresuTipoCuentaProyecto(Boolean esHabilitar,Boolean conDetalle) {
		this.habilitarDeshabilitarToolBarPresuTipoCuentaProyecto(esHabilitar,conDetalle);
		this.habilitarDeshabilitarMenuPresuTipoCuentaProyecto(esHabilitar,conDetalle);
	}
	
	public void habilitarDeshabilitarToolBarPresuTipoCuentaProyecto(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jTtoolBarPresuTipoCuentaProyecto,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jTtoolBarDetallePresuTipoCuentaProyecto,esHabilitar,1,1);
		}
	}
	
	public void habilitarDeshabilitarMenuPresuTipoCuentaProyecto(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jmenuBarPresuTipoCuentaProyecto,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jmenuBarDetallePresuTipoCuentaProyecto,esHabilitar,1,1);
		}
	}
	*/
	
	
	
	public void procesarBusqueda(String sAccionBusqueda) throws Exception {		
		String  finalQueryPaginacion=this.presutipocuentaproyectoConstantesFunciones.getsFinalQueryPresuTipoCuentaProyecto();
		String  finalQueryPaginacionTodos=this.presutipocuentaproyectoConstantesFunciones.getsFinalQueryPresuTipoCuentaProyecto();
		
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
		
		ArrayList<String> arrColumnasGlobalesNo=PresuTipoCuentaProyectoConstantesFunciones.getArrayColumnasGlobalesNoPresuTipoCuentaProyecto(this.arrDatoGeneral);
		ArrayList<String> arrColumnasGlobales=PresuTipoCuentaProyectoConstantesFunciones.getArrayColumnasGlobalesPresuTipoCuentaProyecto(this.arrDatoGeneral,arrColumnasGlobalesNo);
		
			
		String  finalQueryGlobal="";
		
		finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,!esBusqueda,esBusqueda,arrColumnasGlobales,PresuTipoCuentaProyectoConstantesFunciones.TABLENAME);
		
		String sOrderBy="";
		
		
		sOrderBy=Funciones2.getFinalQueryOrderBy(this.arrOrderBy);
		
		
		if(!sOrderBy.equals("")) {			
			finalQueryPaginacion=sOrderBy;
			finalQueryPaginacionTodos=sOrderBy;
		}
		
		
		//INICIALIZA ELIMINADOS
		this.presutipocuentaproyectosEliminados= new ArrayList<PresuTipoCuentaProyecto>();
		
		if(!this.isEntroOnLoad) {
			this.onLoad();
		}/* else {
			this.isEntroOnLoad=false;
		}*/
		
		
		
				
		try	{		
			
			//this.startProcessPresuTipoCuentaProyecto();
		
				///*PresuTipoCuentaProyectoSessionBean*/this.presutipocuentaproyectoSessionBean=new PresuTipoCuentaProyectoSessionBean();
			
			if(this.presutipocuentaproyectoSessionBean==null) {
				this.presutipocuentaproyectoSessionBean=new PresuTipoCuentaProyectoSessionBean();
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
					this.iNumeroPaginacion=PresuTipoCuentaProyectoConstantesFunciones.INUMEROPAGINACION;
				}
			}
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);
			
			this.cargarDatosCliente();
			
			ArrayList<Classe> classes=new ArrayList<Classe>();
			
			classes=PresuTipoCuentaProyectoConstantesFunciones.getClassesForeignKeysOfPresuTipoCuentaProyecto(new ArrayList<Classe>(),DeepLoadType.NONE);
			
		
			this.datosDeep=new DatosDeep();
			this.datosDeep.setIsDeep(false);
			this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
			this.datosDeep.setClases(classes);
			
			this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
			this.datosCliente.setIsConDeep(true);
			
			if(false) {//this.conExportar
				this.datosCliente.setIsConExportar(true);
				this.datosCliente.setDatosExportarParametros(Funciones2.getTipoExportar(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getcon_exportar_cabecera(),Funciones2.getTipoDelimiter(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getpath_exportar()+"/presutipocuentaproyecto."+Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario));
			} else {
				this.datosCliente.setIsConExportar(false);
			}
			
			presutipocuentaproyectosAux= new ArrayList<PresuTipoCuentaProyecto>();
			
				
			presutipocuentaproyectoLogic.setDatosCliente(this.datosCliente);
			presutipocuentaproyectoLogic.setDatosDeep(this.datosDeep);
			presutipocuentaproyectoLogic.setIsConDeep(true);
			
			
			presutipocuentaproyectoLogic.getPresuTipoCuentaProyectoDataAccess().setIsForForeingsKeysDataRelationships(true);
			
			if(sAccionBusqueda.equals("Todos") || sAccionBusqueda.equals("Query"))	{	
				if(sAccionBusqueda.equals("Todos")) {
					//FALTA:PARA BUSQUEDAS POR CAMPO EN FORMULARIO
					//this.sFinalQueryGeneral="";
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacionTodos );
					
					presutipocuentaproyectoLogic.getTodosPresuTipoCuentaProyectos(finalQueryGlobal,pagination);
					
					//presutipocuentaproyectoLogic.getTodosPresuTipoCuentaProyectosWithConnection(finalQueryGlobal,pagination);										
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
				
				if(presutipocuentaproyectoLogic.getPresuTipoCuentaProyectos()==null|| presutipocuentaproyectoLogic.getPresuTipoCuentaProyectos().size()==0)	{
					
				
				}
				
				if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(-1);
						this.pagination.setiMaxResults(-1);
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							presutipocuentaproyectosAux= new ArrayList<PresuTipoCuentaProyecto>();
							presutipocuentaproyectosAux.addAll(presutipocuentaproyectoLogic.getPresuTipoCuentaProyectos());						
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							presutipocuentaproyectosAux= new ArrayList<PresuTipoCuentaProyecto>();
							presutipocuentaproyectosAux.addAll(presutipocuentaproyectos);
						}
						//ARCHITECTURE
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							presutipocuentaproyectoLogic.getTodosPresuTipoCuentaProyectos(finalQueryGlobal+"",this.pagination);												
							
							//presutipocuentaproyectoLogic.getTodosPresuTipoCuentaProyectosWithConnection(finalQueryGlobal+"",this.pagination);												
						} else if(Constantes.ISUSAEJBREMOTE) {
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
					}
					
					this.generarReportePresuTipoCuentaProyectos("Todos",presutipocuentaproyectoLogic.getPresuTipoCuentaProyectos() );
					
					if(false) {//isMostrarTodosResultadosReporte						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							presutipocuentaproyectoLogic.setPresuTipoCuentaProyectos(new ArrayList<PresuTipoCuentaProyecto>());					
							presutipocuentaproyectoLogic.getPresuTipoCuentaProyectos().addAll(presutipocuentaproyectosAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							presutipocuentaproyectos=new ArrayList<PresuTipoCuentaProyecto>();
							presutipocuentaproyectos.addAll(presutipocuentaproyectosAux);
						}
						//ARCHITECTURE
						
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);														
					}
				}
			}
			else if(sAccionBusqueda.equals("PorId")) {
				Long idPresuTipoCuentaProyecto=0L;
				
				if(this.idActual!=null && this.idActual!=0L) {
					idPresuTipoCuentaProyecto=this.idActual;
				
				} else if(this.idPresuTipoCuentaProyectoActual!=null && this.idPresuTipoCuentaProyectoActual!=0L) {
					idPresuTipoCuentaProyecto=idPresuTipoCuentaProyectoActual;
				}
				
					
				this.sDetalleReporte=PresuTipoCuentaProyectoConstantesFunciones.getDetalleIndicePorId(idPresuTipoCuentaProyecto);
				
				this.presutipocuentaproyectos=new ArrayList<PresuTipoCuentaProyecto>();
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {					
					presutipocuentaproyectoLogic.getEntity(idPresuTipoCuentaProyecto);
					
					//presutipocuentaproyectoLogic.getEntityWithConnection(idPresuTipoCuentaProyecto);
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
								
				if(Constantes.ISUSAEJBLOGICLAYER) {
					presutipocuentaproyectoLogic.setPresuTipoCuentaProyectos(new ArrayList<PresuTipoCuentaProyecto>());
					presutipocuentaproyectoLogic.getPresuTipoCuentaProyectos().add(presutipocuentaproyectoLogic.getPresuTipoCuentaProyecto());
				
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.presutipocuentaproyectos=new ArrayList<PresuTipoCuentaProyecto>();
					this.presutipocuentaproyectos.add(presutipocuentaproyecto);
				}
				
				if(presutipocuentaproyectoLogic.getPresuTipoCuentaProyecto()==null)	{
					
				
				}			
			}
			
		
			else if(sAccionBusqueda.equals("BusquedaPorCodigo")) {
				this.sDetalleReporte=PresuTipoCuentaProyectoConstantesFunciones.getDetalleIndiceBusquedaPorCodigo(codigoBusquedaPorCodigo);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					presutipocuentaproyectoLogic.getPresuTipoCuentaProyectosBusquedaPorCodigo(finalQueryGlobal,pagination,codigoBusquedaPorCodigo);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=PresuTipoCuentaProyectoConstantesFunciones.getDetalleIndiceBusquedaPorCodigo(codigoBusquedaPorCodigo);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=PresuTipoCuentaProyectoConstantesFunciones.getDetalleIndiceBusquedaPorCodigo(codigoBusquedaPorCodigo);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=presutipocuentaproyectoLogic.getPresuTipoCuentaProyectos()==null||presutipocuentaproyectoLogic.getPresuTipoCuentaProyectos().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=presutipocuentaproyectos==null|| presutipocuentaproyectos.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						presutipocuentaproyectosAux=new ArrayList<PresuTipoCuentaProyecto>();
						presutipocuentaproyectosAux.addAll(presutipocuentaproyectoLogic.getPresuTipoCuentaProyectos());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							presutipocuentaproyectosAux=new ArrayList<PresuTipoCuentaProyecto>();
							presutipocuentaproyectosAux.addAll(presutipocuentaproyectos);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							presutipocuentaproyectoLogic.getPresuTipoCuentaProyectosBusquedaPorCodigo(finalQueryGlobal,pagination,codigoBusquedaPorCodigo);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=PresuTipoCuentaProyectoConstantesFunciones.getDetalleIndiceBusquedaPorCodigo(codigoBusquedaPorCodigo);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=PresuTipoCuentaProyectoConstantesFunciones.getDetalleIndiceBusquedaPorCodigo(codigoBusquedaPorCodigo);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReportePresuTipoCuentaProyectos("BusquedaPorCodigo",presutipocuentaproyectoLogic.getPresuTipoCuentaProyectos());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReportePresuTipoCuentaProyectos("BusquedaPorCodigo",presutipocuentaproyectos);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						presutipocuentaproyectoLogic.setPresuTipoCuentaProyectos(new ArrayList<PresuTipoCuentaProyecto>());
						presutipocuentaproyectoLogic.getPresuTipoCuentaProyectos().addAll(presutipocuentaproyectosAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							presutipocuentaproyectos=new ArrayList<PresuTipoCuentaProyecto>();
							presutipocuentaproyectos.addAll(presutipocuentaproyectosAux);
						}
						//ARCHITECTURE
					}
				}

			}
			else if(sAccionBusqueda.equals("BusquedaPorNombre")) {
				this.sDetalleReporte=PresuTipoCuentaProyectoConstantesFunciones.getDetalleIndiceBusquedaPorNombre(nombreBusquedaPorNombre);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					presutipocuentaproyectoLogic.getPresuTipoCuentaProyectosBusquedaPorNombre(finalQueryGlobal,pagination,nombreBusquedaPorNombre);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=PresuTipoCuentaProyectoConstantesFunciones.getDetalleIndiceBusquedaPorNombre(nombreBusquedaPorNombre);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=PresuTipoCuentaProyectoConstantesFunciones.getDetalleIndiceBusquedaPorNombre(nombreBusquedaPorNombre);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=presutipocuentaproyectoLogic.getPresuTipoCuentaProyectos()==null||presutipocuentaproyectoLogic.getPresuTipoCuentaProyectos().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=presutipocuentaproyectos==null|| presutipocuentaproyectos.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						presutipocuentaproyectosAux=new ArrayList<PresuTipoCuentaProyecto>();
						presutipocuentaproyectosAux.addAll(presutipocuentaproyectoLogic.getPresuTipoCuentaProyectos());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							presutipocuentaproyectosAux=new ArrayList<PresuTipoCuentaProyecto>();
							presutipocuentaproyectosAux.addAll(presutipocuentaproyectos);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							presutipocuentaproyectoLogic.getPresuTipoCuentaProyectosBusquedaPorNombre(finalQueryGlobal,pagination,nombreBusquedaPorNombre);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=PresuTipoCuentaProyectoConstantesFunciones.getDetalleIndiceBusquedaPorNombre(nombreBusquedaPorNombre);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=PresuTipoCuentaProyectoConstantesFunciones.getDetalleIndiceBusquedaPorNombre(nombreBusquedaPorNombre);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReportePresuTipoCuentaProyectos("BusquedaPorNombre",presutipocuentaproyectoLogic.getPresuTipoCuentaProyectos());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReportePresuTipoCuentaProyectos("BusquedaPorNombre",presutipocuentaproyectos);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						presutipocuentaproyectoLogic.setPresuTipoCuentaProyectos(new ArrayList<PresuTipoCuentaProyecto>());
						presutipocuentaproyectoLogic.getPresuTipoCuentaProyectos().addAll(presutipocuentaproyectosAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							presutipocuentaproyectos=new ArrayList<PresuTipoCuentaProyecto>();
							presutipocuentaproyectos.addAll(presutipocuentaproyectosAux);
						}
						//ARCHITECTURE
					}
				}

			}
			else if(sAccionBusqueda.equals("FK_IdEmpresa")) {
				this.sDetalleReporte=PresuTipoCuentaProyectoConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					presutipocuentaproyectoLogic.getPresuTipoCuentaProyectosFK_IdEmpresa(finalQueryGlobal,pagination,id_empresaFK_IdEmpresa);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=PresuTipoCuentaProyectoConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=PresuTipoCuentaProyectoConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=presutipocuentaproyectoLogic.getPresuTipoCuentaProyectos()==null||presutipocuentaproyectoLogic.getPresuTipoCuentaProyectos().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=presutipocuentaproyectos==null|| presutipocuentaproyectos.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						presutipocuentaproyectosAux=new ArrayList<PresuTipoCuentaProyecto>();
						presutipocuentaproyectosAux.addAll(presutipocuentaproyectoLogic.getPresuTipoCuentaProyectos());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							presutipocuentaproyectosAux=new ArrayList<PresuTipoCuentaProyecto>();
							presutipocuentaproyectosAux.addAll(presutipocuentaproyectos);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							presutipocuentaproyectoLogic.getPresuTipoCuentaProyectosFK_IdEmpresa(finalQueryGlobal,pagination,id_empresaFK_IdEmpresa);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=PresuTipoCuentaProyectoConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=PresuTipoCuentaProyectoConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReportePresuTipoCuentaProyectos("FK_IdEmpresa",presutipocuentaproyectoLogic.getPresuTipoCuentaProyectos());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReportePresuTipoCuentaProyectos("FK_IdEmpresa",presutipocuentaproyectos);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						presutipocuentaproyectoLogic.setPresuTipoCuentaProyectos(new ArrayList<PresuTipoCuentaProyecto>());
						presutipocuentaproyectoLogic.getPresuTipoCuentaProyectos().addAll(presutipocuentaproyectosAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							presutipocuentaproyectos=new ArrayList<PresuTipoCuentaProyecto>();
							presutipocuentaproyectos.addAll(presutipocuentaproyectosAux);
						}
						//ARCHITECTURE
					}
				}

			} 
		
		
		
		this.redimensionarTablaDatos();
		//this.refrescarForeignKeysDescripcionesPresuTipoCuentaProyecto();
		
		
		if(this.conTotales) {
			this.crearFilaTotales();
		}		
		} catch (JRException e) {
			throw e;
		} catch(Exception e) {
			throw e;
      	} finally {
      		//this.finishProcessPresuTipoCuentaProyecto();
      	}
		
	}				
	
	public void redimensionarTablaDatos() throws Exception {
		int iSizeTabla=0;
				
		iSizeTabla=this.getSizeTablaDatos();
		
		//ARCHITECTURE
		/*
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=presutipocuentaproyectoLogic.getPresuTipoCuentaProyectos().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=presutipocuentaproyectos.size();
		}
		*/
		//ARCHITECTURE
											
		this.redimensionarTablaDatos(iSizeTabla);		
	}
	
	public Integer getSizeTablaDatos() throws Exception {
		Integer iSizeTabla=0;
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=presutipocuentaproyectoLogic.getPresuTipoCuentaProyectos().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=presutipocuentaproyectos.size();
		}
		//ARCHITECTURE
											
		return iSizeTabla;		
	}
	
			
	public Boolean permiteMantenimiento(PresuTipoCuentaProyecto presutipocuentaproyecto) {
		Boolean permite=true;
		
		if(this.presutipocuentaproyecto.getsType().equals(Constantes2.S_TOTALES)) {
			permite=false;
		}
		
		return permite;
	}
	
	public void traerValoresTablaTotales() throws Exception {
	}
	
	
	public void traerValoresTablaOrderBy() throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.arrOrderBy=PresuTipoCuentaProyectoConstantesFunciones.getOrderByListaPresuTipoCuentaProyecto();							
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.arrOrderBy=PresuTipoCuentaProyectoConstantesFunciones.getOrderByListaPresuTipoCuentaProyecto();
		}		
	}
	
	
	public Boolean existeFilaTotales() throws Exception {
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(PresuTipoCuentaProyecto presutipocuentaproyecto:presutipocuentaproyectoLogic.getPresuTipoCuentaProyectos()) {
				if(presutipocuentaproyecto.getsType().equals(Constantes2.S_TOTALES)) {
					presutipocuentaproyectoTotales=presutipocuentaproyecto;
					existe=true;
					break;
				}
			}
								
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(PresuTipoCuentaProyecto presutipocuentaproyecto:this.presutipocuentaproyectos) {
				if(presutipocuentaproyecto.getsType().equals(Constantes2.S_TOTALES)) {
					presutipocuentaproyectoTotales=presutipocuentaproyecto;
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
			this.presutipocuentaproyectoAux=new PresuTipoCuentaProyecto();
			this.presutipocuentaproyectoAux.setsType(Constantes2.S_TOTALES);
			this.presutipocuentaproyectoAux.setIsNew(false);
			this.presutipocuentaproyectoAux.setIsChanged(false);
			this.presutipocuentaproyectoAux.setIsDeleted(false);
				
			if(Constantes.ISUSAEJBLOGICLAYER) {
				PresuTipoCuentaProyectoConstantesFunciones.TotalizarValoresFilaPresuTipoCuentaProyecto(this.presutipocuentaproyectoLogic.getPresuTipoCuentaProyectos(),this.presutipocuentaproyectoAux);
				
				this.presutipocuentaproyectoLogic.getPresuTipoCuentaProyectos().add(this.presutipocuentaproyectoAux);
				
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				PresuTipoCuentaProyectoConstantesFunciones.TotalizarValoresFilaPresuTipoCuentaProyecto(this.presutipocuentaproyectos,this.presutipocuentaproyectoAux);
				
				this.presutipocuentaproyectos.add(this.presutipocuentaproyectoAux);
			}
		}
	}
	
	public void quitarFilaTotales() throws Exception {
		presutipocuentaproyectoTotales=new PresuTipoCuentaProyecto();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.presutipocuentaproyectoLogic.getPresuTipoCuentaProyectos().remove(presutipocuentaproyectoTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.presutipocuentaproyectos.remove(presutipocuentaproyectoTotales);
			}
		}
	}
	
	public void actualizarFilaTotales() throws Exception {
		presutipocuentaproyectoTotales=new PresuTipoCuentaProyecto();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(PresuTipoCuentaProyecto presutipocuentaproyecto:presutipocuentaproyectoLogic.getPresuTipoCuentaProyectos()) {
				if(presutipocuentaproyecto.getsType().equals(Constantes2.S_TOTALES)) {
					presutipocuentaproyectoTotales=presutipocuentaproyecto;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				PresuTipoCuentaProyectoConstantesFunciones.TotalizarValoresFilaPresuTipoCuentaProyecto(this.presutipocuentaproyectoLogic.getPresuTipoCuentaProyectos(),presutipocuentaproyectoTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(PresuTipoCuentaProyecto presutipocuentaproyecto:this.presutipocuentaproyectos) {
				if(presutipocuentaproyecto.getsType().equals(Constantes2.S_TOTALES)) {
					presutipocuentaproyectoTotales=presutipocuentaproyecto;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				PresuTipoCuentaProyectoConstantesFunciones.TotalizarValoresFilaPresuTipoCuentaProyecto(this.presutipocuentaproyectos,presutipocuentaproyectoTotales);
			}
		}
	}		
	
	public void recargarInformacion()throws Exception {
		try {
			sAccionBusqueda="Todos";
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda(sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PresuTipoCuentaProyectoConstantesFunciones.CLASSNAME);
		}	
	}		
	
	
	public void getPresuTipoCuentaProyectosBusquedaPorCodigo()throws Exception {
		try {
			sAccionBusqueda="BusquedaPorCodigo";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getPresuTipoCuentaProyectosBusquedaPorNombre()throws Exception {
		try {
			sAccionBusqueda="BusquedaPorNombre";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getPresuTipoCuentaProyectosFK_IdEmpresa()throws Exception {
		try {
			sAccionBusqueda="FK_IdEmpresa";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	
	
	public void getPresuTipoCuentaProyectosBusquedaPorCodigo(String sFinalQuery,String codigo)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					presutipocuentaproyectoLogic.getPresuTipoCuentaProyectosBusquedaPorCodigo(sFinalQuery,this.pagination,codigo);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getPresuTipoCuentaProyectosBusquedaPorNombre(String sFinalQuery,String nombre)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					presutipocuentaproyectoLogic.getPresuTipoCuentaProyectosBusquedaPorNombre(sFinalQuery,this.pagination,nombre);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getPresuTipoCuentaProyectosFK_IdEmpresa(String sFinalQuery,Long id_empresa)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					presutipocuentaproyectoLogic.getPresuTipoCuentaProyectosFK_IdEmpresa(sFinalQuery,this.pagination,id_empresa);
				
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
	
	public void inicializarPermisosPresuTipoCuentaProyecto() {
		this.isPermisoTodoPresuTipoCuentaProyecto=false;
		this.isPermisoNuevoPresuTipoCuentaProyecto=false;
		this.isPermisoActualizarPresuTipoCuentaProyecto=false;
		this.isPermisoActualizarOriginalPresuTipoCuentaProyecto=false;
		this.isPermisoEliminarPresuTipoCuentaProyecto=false;
		this.isPermisoGuardarCambiosPresuTipoCuentaProyecto=false;
		this.isPermisoConsultaPresuTipoCuentaProyecto=false;
		this.isPermisoBusquedaPresuTipoCuentaProyecto=false;
		this.isPermisoReportePresuTipoCuentaProyecto=false;		
		this.isPermisoOrdenPresuTipoCuentaProyecto=false;		
		this.isPermisoPaginacionMedioPresuTipoCuentaProyecto=false;		
		this.isPermisoPaginacionAltoPresuTipoCuentaProyecto=false;
		this.isPermisoPaginacionTodoPresuTipoCuentaProyecto=false;
		this.isPermisoCopiarPresuTipoCuentaProyecto=false;		
		this.isPermisoVerFormPresuTipoCuentaProyecto=false;		
		this.isPermisoDuplicarPresuTipoCuentaProyecto=false;		
		this.isPermisoOrdenPresuTipoCuentaProyecto=false;		
	}
	
	public void setPermisosUsuarioPresuTipoCuentaProyecto(Boolean isPermiso) {
		this.isPermisoTodoPresuTipoCuentaProyecto=isPermiso;
		this.isPermisoNuevoPresuTipoCuentaProyecto=isPermiso;
		this.isPermisoActualizarPresuTipoCuentaProyecto=isPermiso;
		this.isPermisoActualizarOriginalPresuTipoCuentaProyecto=isPermiso;
		this.isPermisoEliminarPresuTipoCuentaProyecto=isPermiso;
		this.isPermisoGuardarCambiosPresuTipoCuentaProyecto=isPermiso;
		this.isPermisoConsultaPresuTipoCuentaProyecto=isPermiso;
		this.isPermisoBusquedaPresuTipoCuentaProyecto=isPermiso;
		this.isPermisoReportePresuTipoCuentaProyecto=isPermiso;
		this.isPermisoOrdenPresuTipoCuentaProyecto=isPermiso;		
		this.isPermisoPaginacionMedioPresuTipoCuentaProyecto=isPermiso;		
		this.isPermisoPaginacionAltoPresuTipoCuentaProyecto=isPermiso;		
		this.isPermisoPaginacionTodoPresuTipoCuentaProyecto=isPermiso;		
		this.isPermisoCopiarPresuTipoCuentaProyecto=isPermiso;		
		this.isPermisoVerFormPresuTipoCuentaProyecto=isPermiso;		
		this.isPermisoDuplicarPresuTipoCuentaProyecto=isPermiso;
		this.isPermisoOrdenPresuTipoCuentaProyecto=isPermiso;
	}
	
	public void setPermisosMantenimientoUsuarioPresuTipoCuentaProyecto(Boolean isPermiso) {
		//this.isPermisoTodoPresuTipoCuentaProyecto=isPermiso;
		this.isPermisoNuevoPresuTipoCuentaProyecto=isPermiso;
		this.isPermisoActualizarPresuTipoCuentaProyecto=isPermiso;
		this.isPermisoActualizarOriginalPresuTipoCuentaProyecto=isPermiso;
		this.isPermisoEliminarPresuTipoCuentaProyecto=isPermiso;
		this.isPermisoGuardarCambiosPresuTipoCuentaProyecto=isPermiso;
		//this.isPermisoConsultaPresuTipoCuentaProyecto=isPermiso;
		//this.isPermisoBusquedaPresuTipoCuentaProyecto=isPermiso;
		//this.isPermisoReportePresuTipoCuentaProyecto=isPermiso;
		//this.isPermisoOrdenPresuTipoCuentaProyecto=isPermiso;		
		//this.isPermisoPaginacionMedioPresuTipoCuentaProyecto=isPermiso;		
		//this.isPermisoPaginacionAltoPresuTipoCuentaProyecto=isPermiso;		
		//this.isPermisoPaginacionTodoPresuTipoCuentaProyecto=isPermiso;		
		//this.isPermisoCopiarPresuTipoCuentaProyecto=isPermiso;		
		//this.isPermisoDuplicarPresuTipoCuentaProyecto=isPermiso;
		//this.isPermisoOrdenPresuTipoCuentaProyecto=isPermiso;
	}
	
	public void inicializarSetPermisosUsuarioPresuTipoCuentaProyectoClasesRelacionadas() throws Exception {
		ArrayList<String> arrPaginas=new ArrayList<String>();		
		ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
		
		
		if(PresuTipoCuentaProyectoJInternalFrame.CON_LLAMADA_SIMPLE) {
			this.opcionsRelacionadas.addAll(this.sistemaReturnGeneral.getOpcionsRelacionadas());
			
		} else {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				opcionsFinal=sistemaLogicAdditional.tienePermisosOpcionesEnPaginaWeb(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, arrPaginas);
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
			
			this.opcionsRelacionadas.addAll(opcionsFinal);
		}
		
		
		
	}
	
	public Boolean tienePermisosUsuarioEnPaginaWebPresuTipoCuentaProyecto(String sPagina) throws Exception {
		Boolean tienePermisos=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tienePermisos=sistemaLogicAdditional.tienePermisosEnPaginaWeb(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, sPagina);
		} else if(Constantes.ISUSAEJBREMOTE) {
		} else if(Constantes.ISUSAEJBHOME) {
		}
		
		return tienePermisos;
	}
	
	public void inicializarSetPermisosUsuarioPresuTipoCuentaProyectoClasesRelacionadas(Boolean conPermiso) throws Exception {
		
	}
	
	public Boolean verificarGetPermisosUsuarioPresuTipoCuentaProyectoClaseRelacionada(ArrayList<String> arrPaginasFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioClaseRelacionada(arrPaginasFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public Boolean verificarGetPermisosUsuarioOpcionPresuTipoCuentaProyectoClaseRelacionada(List<Opcion> opcionsFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioOpcionClaseRelacionada(opcionsFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public void actualizarTabsSetPermisosUsuarioPresuTipoCuentaProyectoClasesRelacionadas() throws Exception {
		
	}
	
	public void setPermisosUsuarioPresuTipoCuentaProyecto() throws Exception {
		
		PerfilOpcion perfilOpcionUsuario=new PerfilOpcion();		
		Long idOpcion=this.opcionActual.getId();
		
		if(PresuTipoCuentaProyectoJInternalFrame.CON_LLAMADA_SIMPLE) {
			perfilOpcionUsuario=this.sistemaReturnGeneral.getPerfilOpcion();
			
		} else {
			if(this.presutipocuentaproyectoSessionBean.getEsGuardarRelacionado()) {
				idOpcion=0L;
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				perfilOpcionUsuario=sistemaLogicAdditional.traerPermisosPaginaWebPerfilOpcion(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, PresuTipoCuentaProyectoConstantesFunciones.SNOMBREOPCION,idOpcion);				
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
		}
		
		if(perfilOpcionUsuario!=null && perfilOpcionUsuario.getId()>0) {
			this.isPermisoNuevoPresuTipoCuentaProyecto=perfilOpcionUsuario.getingreso()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarPresuTipoCuentaProyecto=perfilOpcionUsuario.getmodificacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarOriginalPresuTipoCuentaProyecto=this.isPermisoActualizarPresuTipoCuentaProyecto;
			this.isPermisoEliminarPresuTipoCuentaProyecto=perfilOpcionUsuario.geteliminacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoGuardarCambiosPresuTipoCuentaProyecto=perfilOpcionUsuario.getguardar_cambios()||perfilOpcionUsuario.gettodo();
			this.isPermisoConsultaPresuTipoCuentaProyecto=perfilOpcionUsuario.getconsulta()||perfilOpcionUsuario.gettodo();
			this.isPermisoBusquedaPresuTipoCuentaProyecto=perfilOpcionUsuario.getbusqueda()||perfilOpcionUsuario.gettodo();
			this.isPermisoTodoPresuTipoCuentaProyecto=perfilOpcionUsuario.gettodo()||perfilOpcionUsuario.gettodo();
			this.isPermisoReportePresuTipoCuentaProyecto=perfilOpcionUsuario.getreporte()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenPresuTipoCuentaProyecto=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionMedioPresuTipoCuentaProyecto=perfilOpcionUsuario.getpaginacion_medio()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionAltoPresuTipoCuentaProyecto=perfilOpcionUsuario.getpaginacion_alto()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionTodoPresuTipoCuentaProyecto=perfilOpcionUsuario.getpaginacion_todo()||perfilOpcionUsuario.gettodo();
			this.isPermisoCopiarPresuTipoCuentaProyecto=perfilOpcionUsuario.getcopiar()||perfilOpcionUsuario.gettodo();
			this.isPermisoVerFormPresuTipoCuentaProyecto=true;//perfilOpcionUsuario.getver_form()||perfilOpcionUsuario.gettodo();
			this.isPermisoDuplicarPresuTipoCuentaProyecto=perfilOpcionUsuario.getduplicar()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenPresuTipoCuentaProyecto=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			
			if(this.presutipocuentaproyectoSessionBean.getEsGuardarRelacionado()) {
				this.opcionActual.setId(perfilOpcionUsuario.getid_opcion());
				
				this.jTableDatosPresuTipoCuentaProyecto.setToolTipText(this.jTableDatosPresuTipoCuentaProyecto.getToolTipText()+"_"+perfilOpcionUsuario.getid_opcion());		
			}
		} else {
			this.setPermisosUsuarioPresuTipoCuentaProyecto(false);
		}
		
		//SI SE NECESITA PONER TODOS LOS PERMISOS POR DEFECTO
		//
		
	}
	
	public void setAccionesUsuarioPresuTipoCuentaProyecto(Boolean esParaAccionesFormulario) throws Exception {		
		Reporte reporte=null;
		
		if(!esParaAccionesFormulario) {
			this.accions=new ArrayList<Accion>();
			
			if(PresuTipoCuentaProyectoJInternalFrame.CON_LLAMADA_SIMPLE) {
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
			
			if(PresuTipoCuentaProyectoJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public void setRelacionesUsuarioPresuTipoCuentaProyecto() throws Exception {
		Reporte reporte=null;
		
		
		
		
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
	public void inicializarCombosForeignKeyPresuTipoCuentaProyectoListas()throws Exception {
		try	{						
			
				this.empresasForeignKey=new ArrayList();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void cargarCombosTodosForeignKeyPresuTipoCuentaProyectoListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			String sFinalQueryCombo="";
			
			Modulo  moduloActualAux=new Modulo();
			
			if(PresuTipoCuentaProyectoJInternalFrame.ISLOAD_FKLOTE) {
				this.cargarCombosLoteForeignKeyPresuTipoCuentaProyectoListas(false);
			} else {
			
				this.cargarCombosForeignKeyEmpresaListas(cargarCombosDependencia,sFinalQueryCombo);
			}
		} catch(Exception e) {
			throw e;
		}		
	}		
	
	

	public void cargarCombosForeignKeyEmpresaListas(Boolean cargarCombosDependencia,String sFinalQuery)throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();

			String  finalQueryGlobal="";

			Modulo  moduloActualAux=new Modulo();

			if((this.empresasForeignKey==null||this.empresasForeignKey.size()<=0)) {
				this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
				this.arrDatoGeneralNo= new  ArrayList<String>();

				arrColumnasGlobales=EmpresaConstantesFunciones.getArrayColumnasGlobalesEmpresa(this.arrDatoGeneral,this.arrDatoGeneralNo);
				finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,EmpresaConstantesFunciones.TABLENAME);

				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, sFinalQuery);
				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, "");

				finalQueryGlobal+=EmpresaConstantesFunciones.SFINALQUERY;

				this.cargarCombosEmpresasForeignKeyLista(finalQueryGlobal);
			}

		} catch(Exception e) {
			throw e;
		}
	}
	
	public void cargarCombosLoteForeignKeyPresuTipoCuentaProyectoListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			Modulo  moduloActualAux=new Modulo();
			
			
			PresuTipoCuentaProyectoParameterReturnGeneral presutipocuentaproyectoReturnGeneral=new PresuTipoCuentaProyectoParameterReturnGeneral();
						
			


				String finalQueryGlobalEmpresa="";

				if(((this.empresasForeignKey==null||this.empresasForeignKey.size()<=0) && this.presutipocuentaproyectoConstantesFunciones.cargarid_empresaPresuTipoCuentaProyecto)
					 || (this.esRecargarFks && this.presutipocuentaproyectoConstantesFunciones.cargarid_empresaPresuTipoCuentaProyecto)) {

					if(!this.presutipocuentaproyectoSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=EmpresaConstantesFunciones.getArrayColumnasGlobalesEmpresa(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalEmpresa=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,EmpresaConstantesFunciones.TABLENAME);

						finalQueryGlobalEmpresa=Funciones.GetFinalQueryAppend(finalQueryGlobalEmpresa, "");
						finalQueryGlobalEmpresa+=EmpresaConstantesFunciones.SFINALQUERY;

						//this.cargarCombosEmpresasForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalEmpresa=" WHERE " + ConstantesSql.ID + "="+presutipocuentaproyectoSessionBean.getlidEmpresaActual();
					}
				} else {
					finalQueryGlobalEmpresa="NONE";
				}
			
			//ARCHITECTURE			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				presutipocuentaproyectoReturnGeneral=presutipocuentaproyectoLogic.cargarCombosLoteForeignKeyPresuTipoCuentaProyecto(finalQueryGlobalEmpresa);//WithConnection
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}			
			//ARCHITECTURE
			
			

			if(!finalQueryGlobalEmpresa.equals("NONE")) {
				this.empresasForeignKey=presutipocuentaproyectoReturnGeneral.getempresasForeignKey();
			}
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void addItemDefectoCombosTodosForeignKeyPresuTipoCuentaProyecto()throws Exception {
		try {
			
			this.addItemDefectoCombosForeignKeyEmpresa();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	



	public void addItemDefectoCombosForeignKeyEmpresa()throws Exception {
		try {
			if(this.presutipocuentaproyectoSessionBean==null) {
				this.presutipocuentaproyectoSessionBean=new PresuTipoCuentaProyectoSessionBean();
			}

			if(!this.presutipocuentaproyectoSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {
				Empresa empresa=new Empresa();
				EmpresaConstantesFunciones.setEmpresaDescripcion(empresa,Constantes.SMENSAJE_ESCOJA_OPCION);
				empresa.setId(null);

				if(!EmpresaConstantesFunciones.ExisteEnLista(this.empresasForeignKey,empresa,true)) {

					this.empresasForeignKey.add(0,empresa);
				}
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void initActionsCombosTodosForeignKeyPresuTipoCuentaProyecto()throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void initActionsCombosTodosForeignKeyPresuTipoCuentaProyecto(String sFormularioTipoBusqueda)throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	


	
	


	
	public void setVariablesGlobalesCombosForeignKeyPresuTipoCuentaProyecto()throws Exception {	
		try {
			if(this.parametroGeneralUsuario!=null && this.parametroGeneralUsuario.getId()>0) {
			
				this.setActualEmpresaForeignKey(this.parametroGeneralUsuario.getid_empresa(),false,"Formulario");
			
			
			}
			
			//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
			this.setVariablesGlobalesAuxiliaresCombosForeignKeyPresuTipoCuentaProyecto();
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToFormularioForeignKeyPresuTipoCuentaProyecto(PresuTipoCuentaProyecto presutipocuentaproyecto)throws Exception {	
		try {
						
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToListasForeignKeyPresuTipoCuentaProyecto(PresuTipoCuentaProyecto presutipocuentaproyecto,String sTipoEvento)throws Exception {	
		try {
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	/*
	public void setVariablesCombosFromBeanForeignKeyPresuTipoCuentaProyecto()throws Exception {	
		try {
						
		} catch(Exception e) {
			throw e;
		}
	}
	*/
	
	public void setVariablesGlobalesAuxiliaresCombosForeignKeyPresuTipoCuentaProyecto()throws Exception {	
		try {
			
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesDefaultCombosForeignKeyPresuTipoCuentaProyecto()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesParametroCombosForeignKeyPresuTipoCuentaProyecto()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void cargarCombosParametroPresuTipoCuentaProyecto()throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			//this.cargarDatosCliente();
			
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
		
	public void cargarCombosFrameForeignKeyPresuTipoCuentaProyecto()throws Exception {
		try {
			

			this.cargarCombosFrameEmpresasForeignKey("Todos");

		} catch(Exception e) {
			throw e;
		}		
	}		
	
	public void cargarCombosFrameForeignKeyPresuTipoCuentaProyecto(String sFormularioTipoBusqueda)throws Exception {
		try {
			

			this.cargarCombosFrameEmpresasForeignKey(sFormularioTipoBusqueda);

		} catch(Exception e) {
			throw e;
		}		
	}	
	
	public void setItemDefectoCombosForeignKeyPresuTipoCuentaProyecto()throws Exception {
		try {
			



			if(this.jInternalFrameDetalleFormPresuTipoCuentaProyecto.jComboBoxid_empresaPresuTipoCuentaProyecto!=null && this.jInternalFrameDetalleFormPresuTipoCuentaProyecto.jComboBoxid_empresaPresuTipoCuentaProyecto.getItemCount()>0) {
				this.jInternalFrameDetalleFormPresuTipoCuentaProyecto.jComboBoxid_empresaPresuTipoCuentaProyecto.setSelectedIndex(0);
			}
		} catch(Exception e) {
			throw e;
		}		
	}		
	
	


	
	

	public PresuTipoCuentaProyectoBeanSwingJInternalFrame() throws Exception {
		super(false,PaginaTipo.PRINCIPAL);
	}
	
	public PresuTipoCuentaProyectoBeanSwingJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
	}
	
	public PresuTipoCuentaProyectoBeanSwingJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
		
		this.presutipocuentaproyectoSessionBean=new PresuTipoCuentaProyectoSessionBean(); 
		this.presutipocuentaproyectoConstantesFunciones=new PresuTipoCuentaProyectoConstantesFunciones(); 
		this.presutipocuentaproyectoBean=new PresuTipoCuentaProyecto();//(this.presutipocuentaproyectoConstantesFunciones); 		
		this.presutipocuentaproyectoReturnGeneral=new PresuTipoCuentaProyectoParameterReturnGeneral(); 
		
		this.presutipocuentaproyectoSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.presutipocuentaproyectoSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
				
	}
	
	public PresuTipoCuentaProyectoBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,cargarTodosDatos);
	}
		
	public PresuTipoCuentaProyectoBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,false,false,cargarRelaciones,cargarTodosDatos);
	}	
	
	public PresuTipoCuentaProyectoBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos) throws Exception //Boolean esParaBusquedaForeignKey
    {
		super(jdesktopPane,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		try {
			
			this.permiteRecargarForm=false;
			
			this.startProcessPresuTipoCuentaProyecto(true);
			
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
			
			this.presutipocuentaproyectoConstantesFunciones=new PresuTipoCuentaProyectoConstantesFunciones(); 
			this.presutipocuentaproyectoBean=new PresuTipoCuentaProyecto();//this.presutipocuentaproyectoConstantesFunciones); 			
			this.presutipocuentaproyectoReturnGeneral=new PresuTipoCuentaProyectoParameterReturnGeneral(); 
		
			PresuTipoCuentaProyectoBeanSwingJInternalFrameAdditional.CargaInicialInicio(this, "NORMAL", null);
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Tipo Cuenta Proyecto Mantenimiento",paginaTipo));			
			
			this.conTotales=false;
			
			
			
			this.presutipocuentaproyecto=new PresuTipoCuentaProyecto();
			this.presutipocuentaproyectos = new ArrayList<PresuTipoCuentaProyecto>();
			this.presutipocuentaproyectosAux = new ArrayList<PresuTipoCuentaProyecto>();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.presutipocuentaproyectoLogic=new PresuTipoCuentaProyectoLogic();
				this.presutipocuentaproyectoLogic.getNewConnexionToDeep("");
			}
			
			//this.presutipocuentaproyectoSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
			//this.presutipocuentaproyectoSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
			
			this.jDesktopPane=jdesktopPane;
			
			if(this.jDesktopPane.getClass().equals(JDesktopPaneMe.class)) {
				this.constantes2=((JDesktopPaneMe)this.jDesktopPane).constantes2;
			}
			
			if(!Constantes.CON_VARIAS_VENTANAS) {
    			MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameDetalleFormPresuTipoCuentaProyecto);
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameReporteDinamicoPresuTipoCuentaProyecto!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoPresuTipoCuentaProyecto);	
					}
					
					if(this.jInternalFrameImportacionPresuTipoCuentaProyecto!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionPresuTipoCuentaProyecto);							
					}
					
				}
				
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameOrderByPresuTipoCuentaProyecto!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameOrderByPresuTipoCuentaProyecto);					
					}
					
				}
			}
			
			//DETALLE DATOS
			if(this.jInternalFrameDetalleFormPresuTipoCuentaProyecto!=null) { //this.conCargarFormDetalle) {
				this.jDesktopPane.add(this.jInternalFrameDetalleFormPresuTipoCuentaProyecto);
				this.jInternalFrameDetalleFormPresuTipoCuentaProyecto.setVisible(false);
				this.jInternalFrameDetalleFormPresuTipoCuentaProyecto.setSelected(false);						
			}
			
			if(!this.conCargarMinimo) {
				
				//REPORTE DINAMICO
				if(this.jInternalFrameReporteDinamicoPresuTipoCuentaProyecto!=null) {
					this.jDesktopPane.add(this.jInternalFrameReporteDinamicoPresuTipoCuentaProyecto);
					this.jInternalFrameReporteDinamicoPresuTipoCuentaProyecto.setVisible(false);
					this.jInternalFrameReporteDinamicoPresuTipoCuentaProyecto.setSelected(false);
				}
				
				//IMPORTACION
				if(this.jInternalFrameImportacionPresuTipoCuentaProyecto!=null) {
					this.jDesktopPane.add(this.jInternalFrameImportacionPresuTipoCuentaProyecto);
					this.jInternalFrameImportacionPresuTipoCuentaProyecto.setVisible(false);
					this.jInternalFrameImportacionPresuTipoCuentaProyecto.setSelected(false);
				}
				
				
			}
			
			
			if(!this.conCargarMinimo) {
				
				if(this.jInternalFrameOrderByPresuTipoCuentaProyecto!=null) {
					this.jDesktopPane.add(this.jInternalFrameOrderByPresuTipoCuentaProyecto);
					this.jInternalFrameOrderByPresuTipoCuentaProyecto.setVisible(false);
					this.jInternalFrameOrderByPresuTipoCuentaProyecto.setSelected(false);				
				}
				
			}
			
			
			//this.esParaBusquedaForeignKey=false;
			this.esParaBusquedaForeignKey=esParaBusquedaForeignKey;
			
			this.invalidValues=new InvalidValue[0];
			
			
			
			this.idPresuTipoCuentaProyectoActual=0L;
			this.rowIndexActual=0;
			
			
			this.iNumeroPaginacionPagina=0;
			this.iNumeroPaginacion=PresuTipoCuentaProyectoConstantesFunciones.INUMEROPAGINACION;
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
			
			this.presutipocuentaproyectoReturnGeneral=new PresuTipoCuentaProyectoParameterReturnGeneral();
			
			this.presutipocuentaproyectoParameterGeneral=new PresuTipoCuentaProyectoParameterReturnGeneral();
			
			
			
			this.sistemaLogicAdditional=new SistemaLogicAdditional();
			
			this.sistemaLogicAdditional.setConnexion(this.presutipocuentaproyectoLogic.getConnexion());			
			
			
			
			
			
			
			
			//VERIFICAR GLOBAL
			this.cargarDatosCliente();			
			
			
			if(!this.presutipocuentaproyectoSessionBean.getEsGuardarRelacionado()) {
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
			
			if(PresuTipoCuentaProyectoJInternalFrame.CON_LLAMADA_SIMPLE) {
				if(this.presutipocuentaproyectoSessionBean.getEsGuardarRelacionado()) {
					this.opcionActual.setId(0L);
					
					//idOpcion=0L;					
				}
				
				ArrayList<String> arrPaginas=new ArrayList<String>();		
				ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
				
		
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					//this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActualWithConnection(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,PresuTipoCuentaProyectoConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.presutipocuentaproyectoSessionBean.getEsGuardarRelacionado(),this.presutipocuentaproyectoSessionBean.getConGuardarRelaciones(),arrPaginas);
					
					this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActual(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,PresuTipoCuentaProyectoConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.presutipocuentaproyectoSessionBean.getEsGuardarRelacionado(),this.presutipocuentaproyectoSessionBean.getConGuardarRelaciones(),arrPaginas);
					
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
			
			this.isVisibilidadCeldaNuevoPresuTipoCuentaProyecto=false;
			this.isVisibilidadCeldaDuplicarPresuTipoCuentaProyecto=true;
			this.isVisibilidadCeldaCopiarPresuTipoCuentaProyecto=true;
			this.isVisibilidadCeldaVerFormPresuTipoCuentaProyecto=true;
			this.isVisibilidadCeldaOrdenPresuTipoCuentaProyecto=true;
			this.isVisibilidadCeldaNuevoRelacionesPresuTipoCuentaProyecto=false;
			this.isVisibilidadCeldaModificarPresuTipoCuentaProyecto=false;
			this.isVisibilidadCeldaActualizarPresuTipoCuentaProyecto=false;
			this.isVisibilidadCeldaEliminarPresuTipoCuentaProyecto=false;
			this.isVisibilidadCeldaCancelarPresuTipoCuentaProyecto=false;
			this.isVisibilidadCeldaGuardarPresuTipoCuentaProyecto=false;
			this.isVisibilidadCeldaGuardarCambiosPresuTipoCuentaProyecto=false;
			
			
			this.isVisibilidadBusquedaPorCodigo=true;
			this.isVisibilidadBusquedaPorNombre=true;
			this.isVisibilidadFK_IdEmpresa=true;
			
			//ELEMENTOS TABLAS PARAMETOS
			
			
			
			//ELEMENTOS TABLAS PARAMETOS_FIN
			
			//this.actualizarEstadoCeldasBotonesPresuTipoCuentaProyecto("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
						
			
			
			this.inicializarPermisosPresuTipoCuentaProyecto();
			
			//INICIALIZAR FALSE, TALVEZ COMENTAR
			this.setPermisosUsuarioPresuTipoCuentaProyecto(false);
			
			this.setPermisosUsuarioPresuTipoCuentaProyecto();
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.presutipocuentaproyectoSessionBean.getEsGuardarRelacionado() 
				|| (this.presutipocuentaproyectoSessionBean.getEsGuardarRelacionado() && this.presutipocuentaproyectoSessionBean.getConGuardarRelaciones())) {
				
				this.inicializarSetPermisosUsuarioPresuTipoCuentaProyectoClasesRelacionadas();
			}
			
			if(this.presutipocuentaproyectoSessionBean.getConGuardarRelaciones()) {
				this.actualizarTabsSetPermisosUsuarioPresuTipoCuentaProyectoClasesRelacionadas();
			}
			
			
			
			//SOLO SE EJECUTA LA PRIMERA VEZ, BINDINGS SI FUNCIONA
			if(!PresuTipoCuentaProyectoJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingBotonesPermisosPresuTipoCuentaProyecto();
			} else {
				this.inicializarActualizarBindingBotonesPermisosManualPresuTipoCuentaProyecto();
			}
			
			if(!this.isPermisoBusquedaPresuTipoCuentaProyecto) {
				//BYDAN_BUSQUEDAS
				
				this.jTabbedPaneBusquedasPresuTipoCuentaProyecto.setVisible(false);				
				
			}
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.presutipocuentaproyectoSessionBean.getEsGuardarRelacionado()) {				
				this.tiposArchivosReportes=Funciones.getListTiposArchivosReportes();
				this.tiposArchivosReportesDinamico=Funciones.getListTiposArchivosReportes();
				this.tiposReportes=Funciones.getListTiposReportes(false);
				this.tiposReportesDinamico=Funciones.getListTiposReportesDinamico(false);
				
				
				
				this.tiposGraficosReportes=Funciones2.getListTiposGraficosReportes();
				this.tiposPaginacion=Funciones2.getListTiposPaginacion(this.isPermisoPaginacionMedioPresuTipoCuentaProyecto,this.isPermisoPaginacionMedioPresuTipoCuentaProyecto,this.isPermisoPaginacionTodoPresuTipoCuentaProyecto);
				this.tiposSeleccionar=Funciones2.getListTiposSeleccionar();
				this.tiposSeleccionar.addAll(PresuTipoCuentaProyectoConstantesFunciones.getTiposSeleccionarPresuTipoCuentaProyecto());
				
				this.tiposColumnasSelect=PresuTipoCuentaProyectoConstantesFunciones.getTiposSeleccionarPresuTipoCuentaProyecto(true);
				
				this.tiposRelacionesSelect=new ArrayList<Reporte>();								
				
				
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
			//if(!this.presutipocuentaproyectoSessionBean.getEsGuardarRelacionado()) {
				//SE ENCUENTRA MAS ADELANTE CON ACCIONES POR USUARIO
				//ACCIONES GENERALES Y POR USUARIO
				this.tiposRelaciones=Funciones2.getListTiposRelaciones();
				this.setRelacionesUsuarioPresuTipoCuentaProyecto();
				
				this.tiposAcciones=Funciones2.getListTiposAcciones(false,false,true);
				this.setAccionesUsuarioPresuTipoCuentaProyecto(false);	
				
				this.tiposAccionesFormulario=Funciones2.getListTiposAccionesFormulario(false,false,true);							
				this.setAccionesUsuarioPresuTipoCuentaProyecto(true);	
				
				this.inicializarActualizarBindingtiposArchivosReportesAccionesPresuTipoCuentaProyecto() ;
			
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
			
			 
			jasperPrint = null;												
			
			//FK
			
			this.empresaLogic=new EmpresaLogic();
			
			//PARAMETROS
			
			
			/*
			if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {		
				hashtableEnv =  Funciones.getHashtableEnv();		
				initialContext = new InitialContext(hashtableEnv);	
			}
			*/
			/*
			if(Constantes.ISUSAEJBREMOTE) {
				presutipocuentaproyectoImplementable= (PresuTipoCuentaProyectoImplementable) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+PresuTipoCuentaProyectoConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBREMOTE);
			} else if(Constantes.ISUSAEJBHOME) {
				presutipocuentaproyectoImplementableHome= (PresuTipoCuentaProyectoImplementableHome) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+PresuTipoCuentaProyectoConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBLOCAL);
			}			
			*/
			
			
			this.presutipocuentaproyectos= new ArrayList<PresuTipoCuentaProyecto>();
			this.presutipocuentaproyectosEliminados= new ArrayList<PresuTipoCuentaProyecto>();
						
			this.isEsNuevoPresuTipoCuentaProyecto=false;
			this.esParaAccionDesdeFormularioPresuTipoCuentaProyecto=false;
			this.isEsMantenimientoRelacionesRelacionadoUnico=false;
			this.isEsMantenimientoRelaciones=false;
			this.isEsMantenimientoRelacionado=false;
			this.isContieneImagenes=false;
			
			
			
			
			
			//INICIALIZAR LISTAS FK
			
			this.empresasForeignKey=new ArrayList<Empresa>() ;
			
			
			
			
			if(blncargarCombostrForeignKey) {
				this.cargarCombosForeignKeyPresuTipoCuentaProyecto(this.isCargarCombosDependencia);
			}
			
			this.cargarCombosParametroPresuTipoCuentaProyecto();
			
			
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.presutipocuentaproyectoSessionBean.getEsGuardarRelacionado()) {
				this.onLoad();
			}
						
			PresuTipoCuentaProyectoBeanSwingJInternalFrameAdditional.RecargarVentanaSegunOpcion(this,opcionActual);
			
			/*
			if(blnCargarInformacionInicial) {
				this.recargarInformacion();
			}
			*/
			//this.iNumeroPaginacionPagina=0;
			//this.iNumeroPaginacion=PresuTipoCuentaProyectoConstantesFunciones.INUMEROPAGINACION;
			
			this.actualizarEstadoCeldasBotonesPresuTipoCuentaProyecto("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			//SOLO LA PRIMERA VEZ HACE LOS BINDINGS, SOLO AHI FUNCIONA
			this.inicializarActualizarBindingPresuTipoCuentaProyecto(true); 
			
			//SE REDIMENSIONA SINO NO SE ACTUALIZA
			this.redimensionarTablaDatos();
			
			
			this.initActions();
			
			;
						
			if(this.jInternalFrameDetalleFormPresuTipoCuentaProyecto!=null) {//if(this.conCargarFormDetalle) {
				this.cargarMenuRelaciones();
			}
			
			//OBLIGA CARGAR DETALLE, MEJOR DESHABILITAR, FALTA TALVEZ PONER EN SELECCIONAR
			//MAYBE
			//this.updateControlesFormularioPresuTipoCuentaProyecto();
			
			if(!this.conCargarMinimo) {
				this.updateBusquedasFormularioPresuTipoCuentaProyecto();
			}
			
			PresuTipoCuentaProyectoBeanSwingJInternalFrameAdditional.CargaInicial(this, "NORMAL", null);
			
			
			//SE REALIZA ESTO PARA QUE SE PUEDA RECORRER TAB SIN IMPORTAR ORDEN
			Boolean existeTabBusqueda=false;
			
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				
				for(int i=0; i<this.jTabbedPaneBusquedasPresuTipoCuentaProyecto.getTabCount(); i++) {
					this.jTabbedPaneBusquedasPresuTipoCuentaProyecto.setSelectedIndex(i);
						
					if(!existeTabBusqueda) {
						existeTabBusqueda=true;
					}
				}
					
				if(existeTabBusqueda) {
					this.jTabbedPaneBusquedasPresuTipoCuentaProyecto.setSelectedIndex(0);
				}	
				
				
			}
			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.presutipocuentaproyectoLogic.commitNewConnexionToDeep();
			}
			
			
			if(Constantes2.ISDEVELOPING2) {
				end_time = System.currentTimeMillis();			
				String sTipo="Load Ventana";
				Funciones2.getMensajeTiempoEjecucion(start_time, end_time, sTipo,false);
			}  
			
			this.finishProcessPresuTipoCuentaProyecto(true);
			
			this.dEnd=(double)System.currentTimeMillis();
			
			this.dDif=this.dEnd - this.dStart;
			
			if(Constantes.ISDEVELOPING) {
				System.out.println("Tiempo(ms) Carga PresuTipoCuentaProyecto: " + this.dDif); 
			}
			
			this.permiteRecargarForm=true;
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.presutipocuentaproyectoLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,PresuTipoCuentaProyectoConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.presutipocuentaproyectoLogic.closeNewConnexionToDeep();
			}
		}	 
    }
	
	public void cargarTiposRelacionesSelectPresuTipoCuentaProyecto() {
		Reporte reporte=new Reporte();
		
	
	}
	
	
	
	public void jTabbedPaneChangeListenerGeneral(String sTipo,ChangeEvent evt) { 	  
		Boolean procesaCargarParteTab=false;
			
		try {
			int iIndex=0;		    			
			String sTitle="";
			
			//TABBED PANE RELACIONES
			if(sTipo.equals("RelacionesPresuTipoCuentaProyecto")) {
				iIndex=this.jInternalFrameDetalleFormPresuTipoCuentaProyecto.jTabbedPaneRelacionesPresuTipoCuentaProyecto.getSelectedIndex();		    
			
				sTitle=this.jInternalFrameDetalleFormPresuTipoCuentaProyecto.jTabbedPaneRelacionesPresuTipoCuentaProyecto.getTitleAt(iIndex);
				
				Integer intSelectedRow = 0;	
			
				intSelectedRow = this.jTableDatosPresuTipoCuentaProyecto.getSelectedRow();	
				
				
				
			}
			
			//TABBED PANE RELACIONES FIN(EXTRA TAB)
			;
			
  		} catch(Exception e) {
  			e.printStackTrace();
  		} finally {
			if(procesaCargarParteTab) {				
				this.finishProcessPresuTipoCuentaProyecto();	
			}
		}
    }
	
	
	
	public void jButtonRelacionActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
  		} catch(Exception e) {
  			e.printStackTrace();
  		}
    }
	
	public void cargarMenuRelaciones() {	
		JMenuItem jmenuItem= new JMenuItem("General");
		String sLabelMenu="";
		
	}		
	
	public void cargarCombosForeignKeyPresuTipoCuentaProyecto(Boolean cargarCombosDependencia) throws Exception {   
		this.cargarCombosForeignKeyPresuTipoCuentaProyecto(cargarCombosDependencia,true,true);
	}
	
	//CARGAR COMBOS EN LOTE
	public void cargarCombosForeignKeyPresuTipoCuentaProyecto(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales) throws Exception {   
		this.cargarCombosTodosForeignKeyPresuTipoCuentaProyectoListas(cargarCombosDependencia);
				
		this.addItemDefectoCombosTodosForeignKeyPresuTipoCuentaProyecto();
		
		this.cargarCombosFrameForeignKeyPresuTipoCuentaProyecto();						
		
		if(conInitActions) {
			this.initActionsCombosTodosForeignKeyPresuTipoCuentaProyecto();
		}
		
		if(conSetVariablesGlobales) {
			this.setVariablesGlobalesCombosForeignKeyPresuTipoCuentaProyecto();
		}
	}
	
	
	
	public void jButtonNuevoPresuTipoCuentaProyectoActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.FORM_RECARGAR;
			String sTipo="NUEVO_NORMAL";
			
			this.estaModoNuevo=true;
			
			if(this.presutipocuentaproyectoSessionBean.getConGuardarRelaciones()) {
				this.dStart=(double)System.currentTimeMillis();
			}
				
			//if(this.esUsoDesdeHijo) {
			//	eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
			//}
											
			if(this.jInternalFrameDetalleFormPresuTipoCuentaProyecto==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}			
				
			PresuTipoCuentaProyectoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.presutipocuentaproyecto,new Object(),this.presutipocuentaproyectoParameterGeneral,this.presutipocuentaproyectoReturnGeneral);
			
			
			if(jTableDatosPresuTipoCuentaProyecto.getRowCount()>=1) {
				jTableDatosPresuTipoCuentaProyecto.removeRowSelectionInterval(0, jTableDatosPresuTipoCuentaProyecto.getRowCount()-1);						
			}
			
			this.isEsNuevoPresuTipoCuentaProyecto=true;
			
			//ESTABLECE SI ES RELACIONADO O NO 
			this.habilitarDeshabilitarTipoMantenimientoPresuTipoCuentaProyecto(esRelaciones);
			
			this.nuevoPreparar(false); 
			this.habilitarDeshabilitarControlesPresuTipoCuentaProyecto(true);			
			//this.presutipocuentaproyecto=new PresuTipoCuentaProyecto();
			//this.presutipocuentaproyecto.setIsChanged(true);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesPresuTipoCuentaProyecto(false) ;						
			 
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualPresuTipoCuentaProyecto() ;
			
			if(PresuTipoCuentaProyectoJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetallePresuTipoCuentaProyecto(esRelaciones);
			}
					
			//Se Duplica, sin sentido
			//this.actualizarInformacion("EVENTO_NUEVO",false,this.presutipocuentaproyecto);	
			this.actualizarInformacion("INFO_PADRE",false,this.presutipocuentaproyecto);				
			
			PresuTipoCuentaProyectoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.presutipocuentaproyecto,new Object(),this.presutipocuentaproyectoParameterGeneral,this.presutipocuentaproyectoReturnGeneral);
			
			if(this.presutipocuentaproyectoSessionBean.getConGuardarRelaciones()) {
				this.dEnd=(double)System.currentTimeMillis();					
				this.dDif=this.dEnd - this.dStart;
					
				if(Constantes.ISDEVELOPING) {
					System.out.println("Tiempo(ms) Nuevo Preparar PresuTipoCuentaProyecto: " + this.dDif); 
				}
			}
			
			//false para que pueda generar eventos
			this.estaModoNuevo=false;
							
			//Con this.estaModoNuevo=false;, se permite actualizar y usar eventos control al mismo tiempo (FuncionTipo.LAST)			
			PresuTipoCuentaProyectoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.LAST,ControlTipo.FORM,EventoTipo.CLIC,EventoSubTipo.NEW,sTipo,this.presutipocuentaproyecto,new Object(),this.presutipocuentaproyectoParameterGeneral,this.presutipocuentaproyectoReturnGeneral);
			
		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,PresuTipoCuentaProyectoConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;			
		}
	}
	
	public void jButtonDuplicarPresuTipoCuentaProyectoActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			Boolean soloDuplicarUno=false;
			Boolean conSeleccionarFilaTabla=false;
			
			this.estaModoNuevo=true;
			this.estaModoDuplicar=true;
			
			ArrayList<PresuTipoCuentaProyecto> presutipocuentaproyectosSeleccionados=new ArrayList<PresuTipoCuentaProyecto>();
			int intSelectedRow =-1;
			Integer iNumRowsSeleccionados=0;
			int[] arrNumRowsSeleccionados=null;
			
			//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
			if(conSeleccionarFilaTabla) {
				arrNumRowsSeleccionados=this.jTableDatosPresuTipoCuentaProyecto.getSelectedRows();
				iNumRowsSeleccionados=this.jTableDatosPresuTipoCuentaProyecto.getSelectedRows().length;			
			}
			
			presutipocuentaproyectosSeleccionados=this.getPresuTipoCuentaProyectosSeleccionados(false);
				
			if((soloDuplicarUno && iNumRowsSeleccionados.equals(1)) || !soloDuplicarUno) {
				//LO HACE NUEVOPREPARAR
				//this.iIdNuevoPresuTipoCuentaProyecto--;			
				//PresuTipoCuentaProyecto presutipocuentaproyectoAux= new PresuTipoCuentaProyecto();			
				//presutipocuentaproyectoAux.setId(this.iIdNuevoPresuTipoCuentaProyecto);																
				
				//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
				//PresuTipoCuentaProyecto presutipocuentaproyectoOrigen=new PresuTipoCuentaProyecto();
				//for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {				
				
				for(PresuTipoCuentaProyecto presutipocuentaproyectoOrigen : presutipocuentaproyectosSeleccionados) {
					if(conSeleccionarFilaTabla) {
						if(!soloDuplicarUno) {
							//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
							//intSelectedRow =iNumRowSeleccionado;
						} else {
							intSelectedRow = this.jTableDatosPresuTipoCuentaProyecto.getSelectedRow();
						}
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							presutipocuentaproyectoOrigen =(PresuTipoCuentaProyecto) this.presutipocuentaproyectoLogic.getPresuTipoCuentaProyectos().toArray()[this.jTableDatosPresuTipoCuentaProyecto.convertRowIndexToModel(intSelectedRow)];
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							presutipocuentaproyectoOrigen =(PresuTipoCuentaProyecto) this.presutipocuentaproyectos.toArray()[this.jTableDatosPresuTipoCuentaProyecto.convertRowIndexToModel(intSelectedRow)];
						}
					}
					
					this.aumentarTamanioFilaNuevaTablaPresuTipoCuentaProyecto();
					
					if(this.conTotales) {
						this.quitarFilaTotales();
					}
					
					this.nuevoPreparar(true);
					
					this.presutipocuentaproyecto.setsType("DUPLICADO");
					
					this.setCopiarVariablesObjetosPresuTipoCuentaProyecto(presutipocuentaproyectoOrigen,this.presutipocuentaproyecto,true,true);
					
					this.setVariablesFormularioToObjetoActualForeignKeysPresuTipoCuentaProyecto(this.presutipocuentaproyecto);
					
					//LO HACE NUEVOPREPARAR
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.presutipocuentaproyectoLogic.getPresuTipoCuentaProyectos().add(this.presutipocuentaproyectoAux);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.presutipocuentaproyectos.add(this.presutipocuentaproyectoAux);				
					}
					*/
				}
				
				this.inicializarActualizarBindingTablaPresuTipoCuentaProyecto(false);
				
				this.jTableDatosPresuTipoCuentaProyecto.setRowSelectionInterval(this.getIndiceNuevoPresuTipoCuentaProyecto(), this.getIndiceNuevoPresuTipoCuentaProyecto());
				
				int iLastRow =  this.jTableDatosPresuTipoCuentaProyecto.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosPresuTipoCuentaProyecto.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosPresuTipoCuentaProyecto.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaPresuTipoCuentaProyecto(false);
				}
			} else {
				throw new Exception("DEBE ESTAR SELECCIONADO 1 REGISTRO");
			}
			
		} catch(Exception e) {			
			FuncionesSwing.manageException(this, e,logger,PresuTipoCuentaProyectoConstantesFunciones.CLASSNAME);
		
		} finally {
			this.estaModoNuevo=false;
			this.estaModoDuplicar=false;
		}
	}
	
	public void jButtonCopiarPresuTipoCuentaProyectoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			Boolean conSeleccionarFilaTabla=false;
			Integer iNumRowsSeleccionados=0;
			int[] intSelectedRows =null;
			int intSelectedRow =0;
			
			this.estaModoCopiar=true;
			
			ArrayList<PresuTipoCuentaProyecto> presutipocuentaproyectosSeleccionados=new ArrayList<PresuTipoCuentaProyecto>();									
		
			PresuTipoCuentaProyecto presutipocuentaproyectoOrigen=new PresuTipoCuentaProyecto();
			PresuTipoCuentaProyecto presutipocuentaproyectoDestino=new PresuTipoCuentaProyecto();
				
			presutipocuentaproyectosSeleccionados=this.getPresuTipoCuentaProyectosSeleccionados(false);
			
			if(conSeleccionarFilaTabla) {
				iNumRowsSeleccionados=this.jTableDatosPresuTipoCuentaProyecto.getSelectedRows().length;	
			}
			
			if(iNumRowsSeleccionados.equals(2) || presutipocuentaproyectosSeleccionados.size()==2) {
				if(conSeleccionarFilaTabla) {
					intSelectedRows =this.jTableDatosPresuTipoCuentaProyecto.getSelectedRows();
					intSelectedRow = intSelectedRows[0];	
									
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						presutipocuentaproyectoOrigen =(PresuTipoCuentaProyecto) this.presutipocuentaproyectoLogic.getPresuTipoCuentaProyectos().toArray()[this.jTableDatosPresuTipoCuentaProyecto.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						presutipocuentaproyectoOrigen =(PresuTipoCuentaProyecto) this.presutipocuentaproyectos.toArray()[this.jTableDatosPresuTipoCuentaProyecto.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					intSelectedRow = intSelectedRows[1];
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						presutipocuentaproyectoDestino =(PresuTipoCuentaProyecto) this.presutipocuentaproyectoLogic.getPresuTipoCuentaProyectos().toArray()[this.jTableDatosPresuTipoCuentaProyecto.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						presutipocuentaproyectoDestino =(PresuTipoCuentaProyecto) this.presutipocuentaproyectos.toArray()[this.jTableDatosPresuTipoCuentaProyecto.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				}
				
				presutipocuentaproyectoOrigen =presutipocuentaproyectosSeleccionados.get(0);
				presutipocuentaproyectoDestino =presutipocuentaproyectosSeleccionados.get(1);
				
				this.setCopiarVariablesObjetosPresuTipoCuentaProyecto(presutipocuentaproyectoOrigen,presutipocuentaproyectoDestino,true,false);
				
				presutipocuentaproyectoDestino.setsType("DUPLICADO");
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(presutipocuentaproyectoDestino,presutipocuentaproyectoLogic.getPresuTipoCuentaProyectos());					
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(presutipocuentaproyectoDestino,presutipocuentaproyectos);
				}
				//ARCHITECTURE
				
				this.inicializarActualizarBindingTablaPresuTipoCuentaProyecto(false);
				
				//this.jTableDatosPresuTipoCuentaProyecto.setRowSelectionInterval(this.getIndiceNuevoPresuTipoCuentaProyecto(), this.getIndiceNuevoPresuTipoCuentaProyecto());
				
				int iLastRow =  this.jTableDatosPresuTipoCuentaProyecto.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosPresuTipoCuentaProyecto.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosPresuTipoCuentaProyecto.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					//this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaPresuTipoCuentaProyecto(false);
				}
			} else {
				throw new Exception("DEBEN ESTAR SELECCIONADOS 2 REGISTROS");
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PresuTipoCuentaProyectoConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.estaModoCopiar=false;
		}
	}
	
	public void jButtonVerFormPresuTipoCuentaProyectoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormPresuTipoCuentaProyecto==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.jInternalFrameDetalleFormPresuTipoCuentaProyecto.setSelected(true);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PresuTipoCuentaProyectoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonMostrarOcultarPresuTipoCuentaProyectoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			Boolean isVisible=this.jPanelParametrosReportesPresuTipoCuentaProyecto.isVisible();
			
			//BYDAN_BUSQUEDAS
			
			this.jTabbedPaneBusquedasPresuTipoCuentaProyecto.setVisible(!isVisible);			
			
			
			this.jPanelParametrosReportesPresuTipoCuentaProyecto.setVisible(!isVisible);
			this.jPanelPaginacionPresuTipoCuentaProyecto.setVisible(!isVisible);
			this.jPanelAccionesPresuTipoCuentaProyecto.setVisible(!isVisible);
							
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PresuTipoCuentaProyectoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarPresuTipoCuentaProyectoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.closingInternalFramePresuTipoCuentaProyecto();
			
			//if(this.jInternalFrameParent==null) {
				//this.dispose();
			/*} else {
				this.setVisible(false);
	        	this.setSelected(false);	
			}*/			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PresuTipoCuentaProyectoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarReporteDinamicoPresuTipoCuentaProyectoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameReporteDinamicoPresuTipoCuentaProyecto();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PresuTipoCuentaProyectoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarImportacionPresuTipoCuentaProyectoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameImportacionPresuTipoCuentaProyecto();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PresuTipoCuentaProyectoConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonAbrirOrderByPresuTipoCuentaProyectoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			
			this.abrirInicializarFrameOrderByPresuTipoCuentaProyecto();
			
			this.abrirFrameOrderByPresuTipoCuentaProyecto();
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PresuTipoCuentaProyectoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarOrderByPresuTipoCuentaProyectoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameOrderByPresuTipoCuentaProyecto();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PresuTipoCuentaProyectoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void abrirFrameDetallePresuTipoCuentaProyecto(Boolean esRelaciones) throws Exception {	    	        
	    try {
			//CAUSA PROBLEMAS, SE ADICIONA EN CONSTRUCTOR, LUEGO SOLO VISIBLE true y false
			//this.jDesktopPane.add(jInternalFrameDetalleFormPresuTipoCuentaProyecto);
			
			if(!esRelaciones) {
				if(this.jInternalFrameDetalleFormPresuTipoCuentaProyecto.isMaximum()) {
					this.jInternalFrameDetalleFormPresuTipoCuentaProyecto.setMaximum(false);
				}								
				
	    		this.jInternalFrameDetalleFormPresuTipoCuentaProyecto.setSize(this.jInternalFrameDetalleFormPresuTipoCuentaProyecto.iWidthFormulario,this.jInternalFrameDetalleFormPresuTipoCuentaProyecto.iHeightFormulario);
	    	} else {
				if(this.iWidthScroll<this.jInternalFrameDetalleFormPresuTipoCuentaProyecto.iWidthFormularioMaximo) {
	    			this.jInternalFrameDetalleFormPresuTipoCuentaProyecto.setSize(this.iWidthScroll,this.iHeightScroll);
				} else {
					if(!this.jInternalFrameDetalleFormPresuTipoCuentaProyecto.isMaximum()) {
						this.jInternalFrameDetalleFormPresuTipoCuentaProyecto.setMaximum(true);
					}
				}
				
				if(this.jInternalFrameDetalleFormPresuTipoCuentaProyecto.jContentPaneDetallePresuTipoCuentaProyecto.getWidth() > this.getWidth()) {
					this.jInternalFrameDetalleFormPresuTipoCuentaProyecto.jTabbedPaneRelacionesPresuTipoCuentaProyecto.setMinimumSize(new Dimension(this.jInternalFrameDetalleFormPresuTipoCuentaProyecto.jContentPaneDetallePresuTipoCuentaProyecto.getWidth(),PresuTipoCuentaProyectoConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormPresuTipoCuentaProyecto.jTabbedPaneRelacionesPresuTipoCuentaProyecto.setMaximumSize(new Dimension(this.jInternalFrameDetalleFormPresuTipoCuentaProyecto.jContentPaneDetallePresuTipoCuentaProyecto.getWidth(),PresuTipoCuentaProyectoConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormPresuTipoCuentaProyecto.jTabbedPaneRelacionesPresuTipoCuentaProyecto.setPreferredSize(new Dimension(this.jInternalFrameDetalleFormPresuTipoCuentaProyecto.jContentPaneDetallePresuTipoCuentaProyecto.getWidth(),PresuTipoCuentaProyectoConstantesFunciones.ALTO_TABPANE_RELACIONES));
					
					Dimension dimension=new Dimension(); 
					
					
					
				}
	    	}
			
		
	       	this.jInternalFrameDetalleFormPresuTipoCuentaProyecto.setVisible(true);
	        this.jInternalFrameDetalleFormPresuTipoCuentaProyecto.setSelected(true);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,PresuTipoCuentaProyectoConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirInicializarFrameOrderByPresuTipoCuentaProyecto() throws Exception {	    	        
	    try {
			if(this.jInternalFrameOrderByPresuTipoCuentaProyecto==null) {
				
				if(!this.conCargarMinimo) {
					this.jInternalFrameOrderByPresuTipoCuentaProyecto=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByPresuTipoCuentaProyecto,false,this);
				} else {
					this.jInternalFrameOrderByPresuTipoCuentaProyecto=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByPresuTipoCuentaProyecto,true,this);
				}
				
				this.jDesktopPane.add(this.jInternalFrameOrderByPresuTipoCuentaProyecto);
				this.jInternalFrameOrderByPresuTipoCuentaProyecto.setVisible(false);
				this.jInternalFrameOrderByPresuTipoCuentaProyecto.setSelected(false);
				
				this.jInternalFrameOrderByPresuTipoCuentaProyecto.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByPresuTipoCuentaProyecto"));
				
				this.inicializarActualizarBindingTablaOrderByPresuTipoCuentaProyecto();
			}
		} catch (final Exception e) {
			
		}
	}
	
	
	
	public void abrirInicializarFrameImportacionPresuTipoCuentaProyecto() throws Exception {	    	        
	    try {
			if(this.jInternalFrameImportacionPresuTipoCuentaProyecto==null) {
				
				this.jInternalFrameImportacionPresuTipoCuentaProyecto=new ImportacionJInternalFrame(PresuTipoCuentaProyectoConstantesFunciones.SCLASSWEBTITULO,this);			
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionPresuTipoCuentaProyecto);							
				
				this.jDesktopPane.add(this.jInternalFrameImportacionPresuTipoCuentaProyecto);
				this.jInternalFrameImportacionPresuTipoCuentaProyecto.setVisible(false);
				this.jInternalFrameImportacionPresuTipoCuentaProyecto.setSelected(false);


				this.jInternalFrameImportacionPresuTipoCuentaProyecto.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionPresuTipoCuentaProyecto"));
				this.jInternalFrameImportacionPresuTipoCuentaProyecto.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionPresuTipoCuentaProyecto"));
				this.jInternalFrameImportacionPresuTipoCuentaProyecto.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionPresuTipoCuentaProyecto"));


			}
		} catch (final Exception e) {
			
		}
	}		
	
	
	
	public void abrirInicializarFrameReporteDinamicoPresuTipoCuentaProyecto() throws Exception {	    	        
	    try {
			
			if(this.jInternalFrameReporteDinamicoPresuTipoCuentaProyecto==null) {
				this.jInternalFrameReporteDinamicoPresuTipoCuentaProyecto=new ReporteDinamicoJInternalFrame(PresuTipoCuentaProyectoConstantesFunciones.SCLASSWEBTITULO,this);	
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoPresuTipoCuentaProyecto);	
	
	
				this.jDesktopPane.add(this.jInternalFrameReporteDinamicoPresuTipoCuentaProyecto);
				this.jInternalFrameReporteDinamicoPresuTipoCuentaProyecto.setVisible(false);
				this.jInternalFrameReporteDinamicoPresuTipoCuentaProyecto.setSelected(false);
	
	
	
				this.jInternalFrameReporteDinamicoPresuTipoCuentaProyecto.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoPresuTipoCuentaProyecto"));
				this.jInternalFrameReporteDinamicoPresuTipoCuentaProyecto.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoPresuTipoCuentaProyecto"));
				this.jInternalFrameReporteDinamicoPresuTipoCuentaProyecto.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoPresuTipoCuentaProyecto"));
	
				this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualPresuTipoCuentaProyecto();
			}

		} catch (final Exception e) {
			
		}
	}	
	
	
	
		
					
	public void cerrarFrameDetallePresuTipoCuentaProyecto() throws Exception {	    	        
	    try {
			//this.jDesktopPane.add(jInternalFrameDetalleFormPresuTipoCuentaProyecto);
			
	       	this.jInternalFrameDetalleFormPresuTipoCuentaProyecto.setVisible(false);
	        this.jInternalFrameDetalleFormPresuTipoCuentaProyecto.setSelected(false);
			
			//this.jInternalFrameDetalleFormPresuTipoCuentaProyecto.dispose();
			//this.jInternalFrameDetalleFormPresuTipoCuentaProyecto=null;
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,PresuTipoCuentaProyectoConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirFrameReporteDinamicoPresuTipoCuentaProyecto() throws Exception {	    	        
	    try {
			
			this.jInternalFrameReporteDinamicoPresuTipoCuentaProyecto.setVisible(true);
	        this.jInternalFrameReporteDinamicoPresuTipoCuentaProyecto.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,PresuTipoCuentaProyectoConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void abrirFrameImportacionPresuTipoCuentaProyecto() throws Exception {	    	        		
	    try {			
			this.jInternalFrameImportacionPresuTipoCuentaProyecto.setVisible(true);
	        this.jInternalFrameImportacionPresuTipoCuentaProyecto.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,PresuTipoCuentaProyectoConstantesFunciones.CLASSNAME);
	    }		
	}	
	
	
	
	
	
	public void abrirFrameOrderByPresuTipoCuentaProyecto() throws Exception {	    	        		
	    try {
			this.jInternalFrameOrderByPresuTipoCuentaProyecto.setVisible(true);
	        this.jInternalFrameOrderByPresuTipoCuentaProyecto.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,PresuTipoCuentaProyectoConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameOrderByPresuTipoCuentaProyecto() throws Exception {	    	        		
	    try {			
			this.jInternalFrameOrderByPresuTipoCuentaProyecto.setVisible(false);
	        this.jInternalFrameOrderByPresuTipoCuentaProyecto.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,PresuTipoCuentaProyectoConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameReporteDinamicoPresuTipoCuentaProyecto() throws Exception {			
	    try {
			this.jInternalFrameReporteDinamicoPresuTipoCuentaProyecto.setVisible(false);
	        this.jInternalFrameReporteDinamicoPresuTipoCuentaProyecto.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,PresuTipoCuentaProyectoConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameImportacionPresuTipoCuentaProyecto() throws Exception {	    	        		
	    try {
			this.jInternalFrameImportacionPresuTipoCuentaProyecto.setVisible(false);
	        this.jInternalFrameImportacionPresuTipoCuentaProyecto.setSelected(false);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,PresuTipoCuentaProyectoConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	
	public void jButtonModificarPresuTipoCuentaProyectoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.modificarPresuTipoCuentaProyecto(evt,-1,false);
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PresuTipoCuentaProyectoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void modificarPresuTipoCuentaProyecto(ActionEvent evt,int rowIndex,Boolean esRelaciones) throws Exception {   
		try {
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosPresuTipoCuentaProyecto.getSelectedRow();
			}
			
			this.habilitarDeshabilitarControlesPresuTipoCuentaProyecto(true);
			//this.isEsNuevoPresuTipoCuentaProyecto=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.presutipocuentaproyecto =(PresuTipoCuentaProyecto) this.presutipocuentaproyectoLogic.getPresuTipoCuentaProyectos().toArray()[this.jTableDatosPresuTipoCuentaProyecto.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.presutipocuentaproyecto =(PresuTipoCuentaProyecto) this.presutipocuentaproyectos.toArray()[this.jTableDatosPresuTipoCuentaProyecto.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.actualizarEstadoCeldasBotonesPresuTipoCuentaProyecto("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesPresuTipoCuentaProyecto(false) ;
			
			if(presutipocuentaproyectoSessionBean.getConGuardarRelaciones()) {
			
			}
			
			if(PresuTipoCuentaProyectoJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetallePresuTipoCuentaProyecto(esRelaciones);
			}
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualPresuTipoCuentaProyecto(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PresuTipoCuentaProyectoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarFilaTablaPresuTipoCuentaProyectoActual() { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL
			Integer intSelectedRow = this.jTableDatosPresuTipoCuentaProyecto.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.presutipocuentaproyecto =(PresuTipoCuentaProyecto) this.presutipocuentaproyectoLogic.getPresuTipoCuentaProyectos().toArray()[this.jTableDatosPresuTipoCuentaProyecto.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.presutipocuentaproyecto =(PresuTipoCuentaProyecto) this.presutipocuentaproyectos.toArray()[this.jTableDatosPresuTipoCuentaProyecto.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PresuTipoCuentaProyectoConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void seleccionarPresuTipoCuentaProyecto(ActionEvent evt,int rowIndex) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormPresuTipoCuentaProyecto==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosPresuTipoCuentaProyecto.getSelectedRow();
			}
			
			//this.habilitarDeshabilitarControlesPresuTipoCuentaProyecto(true);
			//this.isEsNuevoPresuTipoCuentaProyecto=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.presutipocuentaproyecto =(PresuTipoCuentaProyecto) this.presutipocuentaproyectoLogic.getPresuTipoCuentaProyectos().toArray()[this.jTableDatosPresuTipoCuentaProyecto.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.presutipocuentaproyecto =(PresuTipoCuentaProyecto) this.presutipocuentaproyectos.toArray()[this.jTableDatosPresuTipoCuentaProyecto.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.jInternalFrameParent.setIdCombosCodigoDesdeBusquedaForeignKey(this.presutipocuentaproyecto.getId(),this.sTipoBusqueda);
			
			this.dispose();
			
			//this.actualizarEstadoCeldasBotonesPresuTipoCuentaProyecto("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			/*
			this.inicializarActualizarBindingBotonesPresuTipoCuentaProyecto(false) ;
			
			if(PresuTipoCuentaProyectoJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetallePresuTipoCuentaProyecto(esRelaciones);
			}
			*/
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualPresuTipoCuentaProyecto(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PresuTipoCuentaProyectoConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void setIdCombosCodigoDesdeBusquedaForeignKey(Long id,String sType)throws Exception{
		
		try {
		} catch(Exception e) {
			throw e;
		}
	}
	
		
	
	
	public void jButtonActualizarPresuTipoCuentaProyectoActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.presutipocuentaproyectoLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingParametrosReportesPresuTipoCuentaProyecto(false);
			
			//if(!this.isEsNuevoPresuTipoCuentaProyecto) {								
				int intSelectedRow = this.jTableDatosPresuTipoCuentaProyecto.getSelectedRow();	
				
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.presutipocuentaproyecto =(PresuTipoCuentaProyecto) this.presutipocuentaproyectoLogic.getPresuTipoCuentaProyectos().toArray()[this.jTableDatosPresuTipoCuentaProyecto.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.presutipocuentaproyecto =(PresuTipoCuentaProyecto) this.presutipocuentaproyectos.toArray()[this.jTableDatosPresuTipoCuentaProyecto.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
			//}
				
			if(PresuTipoCuentaProyectoJInternalFrame.ISBINDING_MANUAL_TABLA) {
				this.setVariablesFormularioToObjetoActualPresuTipoCuentaProyecto(this.presutipocuentaproyecto,true);
				this.setVariablesFormularioToObjetoActualForeignKeysPresuTipoCuentaProyecto(this.presutipocuentaproyecto);
				
			}
			
			if(this.permiteMantenimiento(this.presutipocuentaproyecto)) {	
				this.actualizar();
				
				if(!this.isGuardarCambiosEnLote && !this.presutipocuentaproyectoSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
					
					this.isEsNuevoPresuTipoCuentaProyecto=true;
					this.inicializarActualizarBindingTablaPresuTipoCuentaProyecto(false);
					this.isEsNuevoPresuTipoCuentaProyecto=false;
				
				} else {					
					
					//PARA RELACIONADO ACTUALIZAR FILA TOTALES
					this.isEsNuevoPresuTipoCuentaProyecto=true;
					this.procesoActualizarFilaTotales(false,"MANTENIMIENTO");
					this.isEsNuevoPresuTipoCuentaProyecto=false;
				}
						
								
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesPresuTipoCuentaProyecto(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualPresuTipoCuentaProyecto(false);
				
				this.habilitarDeshabilitarControlesPresuTipoCuentaProyecto(false);
			
												
				
				if(PresuTipoCuentaProyectoJInternalFrame.CON_DATOS_FRAME) {
					if(!this.isPostAccionSinCerrar) {
						this.cerrarFrameDetallePresuTipoCuentaProyecto();
					}
				}
				
				if(this.isPostAccionNuevo) {
					this.jButtonNuevoPresuTipoCuentaProyectoActionPerformed(evt,presutipocuentaproyectoSessionBean.getConGuardarRelaciones());
				} else {
					if(this.isPostAccionSinCerrar) {
						Integer intSelectedRowActual=this.getIndiceActualPresuTipoCuentaProyecto(this.presutipocuentaproyecto,intSelectedRow);
						
						if(intSelectedRow>-1) {
							this.jTableDatosPresuTipoCuentaProyecto.setRowSelectionInterval(intSelectedRowActual, intSelectedRowActual);
							this.jButtonIdActionPerformed(evt,intSelectedRowActual,presutipocuentaproyectoSessionBean.getConGuardarRelaciones(),false);
						}
					}
				}
				
				this.cancelar(false);
				
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.presutipocuentaproyectoLogic.commitNewConnexionToDeep();
			}
			
			
			if(this.jInternalFrameParent!=null) { //&& this.isEsMantenimientoRelacionado) {
				Boolean esUsoDesdeHijoLocal=true;
				String sTipo="Formulario";
				Boolean conIrServidorAplicacionParent=false;
				Long id=this.presutipocuentaproyecto.getId();
				ArrayList<String> arrClasses=new ArrayList<String>();
				
				GeneralEntityParameterGeneral generalEntityParameterGeneral=new GeneralEntityParameterGeneral();
				
				generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
				generalEntityParameterGeneral.setsDominio("Formulario");
				generalEntityParameterGeneral.setsDominioTipo(PresuTipoCuentaProyecto.class.getName());
				
				this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",PresuTipoCuentaProyecto.class.getName(),sTipo,"FORMULARIO",esControlTabla,conIrServidorAplicacionParent,
					id,this, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.FORM,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
					evt,generalEntityParameterGeneral,this);
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.presutipocuentaproyectoLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,PresuTipoCuentaProyectoConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.presutipocuentaproyectoLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonEliminarPresuTipoCuentaProyectoActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.presutipocuentaproyectoLogic.getNewConnexionToDeep("");
			}
			
			int intSelectedRow = this.jTableDatosPresuTipoCuentaProyecto.getSelectedRow();	       
							
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.presutipocuentaproyecto =(PresuTipoCuentaProyecto) this.presutipocuentaproyectoLogic.getPresuTipoCuentaProyectos().toArray()[this.jTableDatosPresuTipoCuentaProyecto.convertRowIndexToModel(intSelectedRow)];
				this.presutipocuentaproyecto.setIsDeleted(true);
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.presutipocuentaproyecto =(PresuTipoCuentaProyecto) this.presutipocuentaproyectos.toArray()[this.jTableDatosPresuTipoCuentaProyecto.convertRowIndexToModel(intSelectedRow)];
				this.presutipocuentaproyecto.setIsDeleted(true);
			}
			//ARCHITECTURE
			
			if(this.permiteMantenimiento(this.presutipocuentaproyecto)) {
				this.eliminar();
				
				if(!this.isGuardarCambiosEnLote && !this.presutipocuentaproyectoSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
				}
				
				((PresuTipoCuentaProyectoModel) this.jTableDatosPresuTipoCuentaProyecto.getModel()).fireTableRowsDeleted(intSelectedRow,intSelectedRow);
				
				this.isEsNuevoPresuTipoCuentaProyecto=true;
				this.inicializarActualizarBindingTablaPresuTipoCuentaProyecto(false);
				this.isEsNuevoPresuTipoCuentaProyecto=false;									
					
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesPresuTipoCuentaProyecto(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualPresuTipoCuentaProyecto(false);
				
				this.habilitarDeshabilitarControlesPresuTipoCuentaProyecto(false);
				
				
				
				if(PresuTipoCuentaProyectoJInternalFrame.CON_DATOS_FRAME) {
					this.cerrarFrameDetallePresuTipoCuentaProyecto();
				}
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.presutipocuentaproyectoLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.presutipocuentaproyectoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,PresuTipoCuentaProyectoConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.presutipocuentaproyectoLogic.closeNewConnexionToDeep();
			}
		}		
	}
		
	public void jButtonCancelarPresuTipoCuentaProyectoActionPerformed(ActionEvent evt) throws Exception {                                         	   	       
	  	try {
			if(jTableDatosPresuTipoCuentaProyecto.getRowCount()>=1) {
				jTableDatosPresuTipoCuentaProyecto.removeRowSelectionInterval(0, jTableDatosPresuTipoCuentaProyecto.getRowCount()-1);						
			}
						
			this.invalidValues=new InvalidValue[0];
			this.habilitarDeshabilitarControlesPresuTipoCuentaProyecto(false);
			this.cancelar(true);			
			this.inicializarActualizarBindingTablaPresuTipoCuentaProyecto(false);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesPresuTipoCuentaProyecto(false) ;
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualPresuTipoCuentaProyecto(false) ;
			
			this.isEsNuevoPresuTipoCuentaProyecto=false;
			
			if(PresuTipoCuentaProyectoJInternalFrame.CON_DATOS_FRAME) {
				this.cerrarFrameDetallePresuTipoCuentaProyecto();
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PresuTipoCuentaProyectoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonGuardarCambiosPresuTipoCuentaProyectoActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.presutipocuentaproyectoLogic.getNewConnexionToDeep("");
			}
			
			//this.estaModoGuardarCambios=true;
			
	    	this.guardarCambios();
			
			if(!this.isErrorGuardar) {
				this.procesarBusqueda(this.sAccionBusqueda);
				
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingPresuTipoCuentaProyecto(false);
				
				//SI ES MANUAL
				if(PresuTipoCuentaProyectoJInternalFrame.ISBINDING_MANUAL) {				
					//this.inicializarActualizarBindingManualPresuTipoCuentaProyecto();				
				}
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.presutipocuentaproyectoLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.presutipocuentaproyectoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,PresuTipoCuentaProyectoConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.presutipocuentaproyectoLogic.closeNewConnexionToDeep();
			}
			
			//this.estaModoGuardarCambios=false;
		}
	}
	
	public void jButtonNuevoGuardarCambiosPresuTipoCuentaProyectoActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			this.estaModoNuevo=true;
			this.estaModoNuevoGuardarCambios=true;
			
			//LO HACE NUEVOPREPARAR
			//this.iIdNuevoPresuTipoCuentaProyecto--;			
			//PresuTipoCuentaProyecto presutipocuentaproyectoAux= new PresuTipoCuentaProyecto();			
			//presutipocuentaproyectoAux.setId(this.iIdNuevoPresuTipoCuentaProyecto);
			
			if(this.jInternalFrameDetalleFormPresuTipoCuentaProyecto==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.aumentarTamanioFilaNuevaTablaPresuTipoCuentaProyecto();
			
			if(this.conTotales) {
				this.quitarFilaTotales();
			}
			
			this.nuevoPreparar(true);
			
			this.setVariablesFormularioToObjetoActualForeignKeysPresuTipoCuentaProyecto(this.presutipocuentaproyecto);
			
			this.presutipocuentaproyecto.setsType("NUEVO_GUARDAR_CAMBIOS");
			
			//LO HACE NUEVOPREPARAR
			/*
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				this.presutipocuentaproyectoLogic.getPresuTipoCuentaProyectos().add(this.presutipocuentaproyectoAux);
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				this.presutipocuentaproyectos.add(this.presutipocuentaproyectoAux);				
			}
			*/
			
			this.inicializarActualizarBindingTablaPresuTipoCuentaProyecto(false);
			
			this.jTableDatosPresuTipoCuentaProyecto.setRowSelectionInterval(this.getIndiceNuevoPresuTipoCuentaProyecto(), this.getIndiceNuevoPresuTipoCuentaProyecto());
			
			int iLastRow =  this.jTableDatosPresuTipoCuentaProyecto.getRowCount () - 1;
			Rectangle rectangle = this.jTableDatosPresuTipoCuentaProyecto.getCellRect(iLastRow, 0, true);
			
			this.jTableDatosPresuTipoCuentaProyecto.scrollRectToVisible(rectangle);
			
			//FILA TOTALES
			if(this.conTotales) {
				this.crearFilaTotales();
				
				this.inicializarActualizarBindingTablaPresuTipoCuentaProyecto(false);
			}

		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,PresuTipoCuentaProyectoConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;
			this.estaModoNuevoGuardarCambios=false;
		}
	}		
	
	public void jButtonRecargarInformacionPresuTipoCuentaProyectoActionPerformed(ActionEvent evt) throws Exception {    		
		try {
			this.iNumeroPaginacionPagina=0;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.presutipocuentaproyectoLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingPresuTipoCuentaProyecto(false,false);
			
	    	this.recargarInformacion();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingPresuTipoCuentaProyecto(false);
			
			//SI ES MANUAL
			if(PresuTipoCuentaProyectoJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualPresuTipoCuentaProyecto();
			}
			
			//this.abrirFrameTreePresuTipoCuentaProyecto();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.presutipocuentaproyectoLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.presutipocuentaproyectoLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,PresuTipoCuentaProyectoConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.presutipocuentaproyectoLogic.closeNewConnexionToDeep();
			}
		}	
	}
	
	
	public void jButtonGenerarImportacionPresuTipoCuentaProyectoActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedReader bufferedReader = null;
		String sXmlStringFile="";
		String sPath="";
		this.arrDatoGeneralMinimos= new  ArrayList<DatoGeneralMinimo>();
		DatoGeneralMinimo datoGeneralMinimo=new DatoGeneralMinimo();
		String sLine="";
		
		try {			
			if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR IMPORTACION DE Tipo Cuenta ProyectoS ?", "MANTENIMIENTO DE Tipo Cuenta Proyecto", JOptionPane.OK_CANCEL_OPTION) == 0) {
				bufferedReader = new BufferedReader(new FileReader(this.jInternalFrameImportacionPresuTipoCuentaProyecto.getFileImportacion().getAbsolutePath()));
								
				while ((sLine = bufferedReader.readLine()) != null) {
					datoGeneralMinimo=new DatoGeneralMinimo();
					datoGeneralMinimo.setsDescripcion(sLine);
					
					this.arrDatoGeneralMinimos.add(datoGeneralMinimo);
				}
				
				this.actualizarParametrosGeneralPresuTipoCuentaProyecto();
						
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {						
					this.presutipocuentaproyectoReturnGeneral=presutipocuentaproyectoLogic.procesarImportacionPresuTipoCuentaProyectosWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this.arrDatoGeneralMinimos,this.presutipocuentaproyectoParameterGeneral);
						
				} else if(Constantes.ISUSAEJBREMOTE) {
						
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
						
				this.procesarPresuTipoCuentaProyectoReturnGeneral();
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PresuTipoCuentaProyectoConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedReader != null) {
				bufferedReader.close();
			}	
		}				
	}
	
	
	
	public void jButtonAbrirImportacionPresuTipoCuentaProyectoActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {
			int iReturnArchivo = this.jInternalFrameImportacionPresuTipoCuentaProyecto.getjFileChooserImportacion().showOpenDialog(this);
 
            if (iReturnArchivo == JFileChooser.APPROVE_OPTION) {
            	this.jInternalFrameImportacionPresuTipoCuentaProyecto.setFileImportacion(this.jInternalFrameImportacionPresuTipoCuentaProyecto.getjFileChooserImportacion().getSelectedFile());
            	
				this.jInternalFrameImportacionPresuTipoCuentaProyecto.getjTextFieldPathArchivoImportacion().setText(this.jInternalFrameImportacionPresuTipoCuentaProyecto.getFileImportacion().getName());
				
				//System.out.println("ARCHIVO ESCOGIDO: "+this.fileImportacionPresuTipoCuentaProyecto.getName());
				
            } else {
                //System.out.println("CANCELAR SELECCION");
				this.jInternalFrameImportacionPresuTipoCuentaProyecto.getjTextFieldPathArchivoImportacion().setText("SELECCION CANCELADA");
            }			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PresuTipoCuentaProyectoConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedWriter != null) {
				bufferedWriter.close();
			}	
		}		
	}
	
	
	public void jButtonGenerarReporteDinamicoPresuTipoCuentaProyectoActionPerformed(ActionEvent evt) throws Exception {    		
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {	
		
		ArrayList<PresuTipoCuentaProyecto> presutipocuentaproyectosSeleccionados=new ArrayList<PresuTipoCuentaProyecto>();		

		presutipocuentaproyectosSeleccionados=this.getPresuTipoCuentaProyectosSeleccionados(true);
		
		
		this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoPresuTipoCuentaProyecto.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();
		
		this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoPresuTipoCuentaProyecto.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
		
		
		this.sTipoArchivoReporte=this.sTipoArchivoReporteDinamico;
		
		//this.sTipoReporteExtra="Base";
		
			InputStream reportFile=null;
			InputStream imageFile=null;
			
			imageFile=AuxiliarImagenes.class.getResourceAsStream("LogoReporte.jpg");			
				
		
		
			reportFile = AuxiliarReportes.class.getResourceAsStream("PresuTipoCuentaProyectoBaseDesign.jrxml");	
			
			sPath=this.parametroGeneralUsuario.getpath_exportar()+"PresuTipoCuentaProyectoBaseDesign.jrxml";
			
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
			
			this.generarReportePresuTipoCuentaProyectos("Todos",presutipocuentaproyectosSeleccionados );

			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.presutipocuentaproyectoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				//DEBE APARECER EL REPORTE DIRECTAMENTE
				//JOptionPane.showMessageDialog(this,"GENERADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Cuenta Proyecto",JOptionPane.INFORMATION_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PresuTipoCuentaProyectoConstantesFunciones.CLASSNAME);
		
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
		
		for(int index:this.jInternalFrameReporteDinamicoPresuTipoCuentaProyecto.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoPresuTipoCuentaProyecto.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case PresuTipoCuentaProyectoConstantesFunciones.LABEL_IDEMPRESA:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_Empresa_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_Empresa_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_Empresa_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_Empresa_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case PresuTipoCuentaProyectoConstantesFunciones.LABEL_CODIGO:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_digo_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_digo_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_digo_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_digo_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case PresuTipoCuentaProyectoConstantesFunciones.LABEL_NOMBRE:
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
		
		if(this.jInternalFrameReporteDinamicoPresuTipoCuentaProyecto.getjCheckBoxConGraficoDinamico().isSelected()) {
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
		reporte=((Reporte)this.jInternalFrameReporteDinamicoPresuTipoCuentaProyecto.getjComboBoxColumnaCategoriaGrafico().getSelectedItem());
				
		//TIPO GRAFICO REPORTE
		reporteTipoGraficoReporte=((Reporte)this.jInternalFrameReporteDinamicoPresuTipoCuentaProyecto.getjComboBoxTiposGraficosReportesDinamico().getSelectedItem());
		
		String sTipoGraficoReporte=reporteTipoGraficoReporte.getsCodigo();
		
		switch(reporte.getsCodigo()) {
			
				case PresuTipoCuentaProyectoConstantesFunciones.LABEL_IDEMPRESA:
					sNombreCampoCategoria="id_empresa";
					break;

				case PresuTipoCuentaProyectoConstantesFunciones.LABEL_CODIGO:
					sNombreCampoCategoria="codigo";
					break;

				case PresuTipoCuentaProyectoConstantesFunciones.LABEL_NOMBRE:
					sNombreCampoCategoria="nombre";
					break;
					
			default :
				break;
		}		
		//CATEGORIA GRAFICO
		
		//CATEGORIA VALOR				
		reporteCategoriaValor=((Reporte)this.jInternalFrameReporteDinamicoPresuTipoCuentaProyecto.getjComboBoxColumnaCategoriaValor().getSelectedItem());
		
		switch(reporteCategoriaValor.getsCodigo()) {
			
				case PresuTipoCuentaProyectoConstantesFunciones.LABEL_IDEMPRESA:
					sNombreCampoCategoriaValor="id_empresa";
					break;

				case PresuTipoCuentaProyectoConstantesFunciones.LABEL_CODIGO:
					sNombreCampoCategoriaValor="codigo";
					break;

				case PresuTipoCuentaProyectoConstantesFunciones.LABEL_NOMBRE:
					sNombreCampoCategoriaValor="nombre";
					break;
					
			default :
				break;
		}	
		//CATEGORIA VALOR
		
		//VALORES GRAFICO
		for(int index:this.jInternalFrameReporteDinamicoPresuTipoCuentaProyecto.getjListColumnasValoresGrafico().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoPresuTipoCuentaProyecto.getjListColumnasValoresGrafico().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case PresuTipoCuentaProyectoConstantesFunciones.LABEL_IDEMPRESA:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Empresa",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_empresa");
					break;

				case PresuTipoCuentaProyectoConstantesFunciones.LABEL_CODIGO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Codigo",sNombreCampoCategoria,sNombreCampoCategoriaValor,"codigo");
					break;

				case PresuTipoCuentaProyectoConstantesFunciones.LABEL_NOMBRE:
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
	
	public void jButtonGenerarExcelReporteDinamicoPresuTipoCuentaProyectoActionPerformed(ActionEvent evt) throws Exception {		
		ArrayList<PresuTipoCuentaProyecto> presutipocuentaproyectosSeleccionados=new ArrayList<PresuTipoCuentaProyecto>();		
		
		presutipocuentaproyectosSeleccionados=this.getPresuTipoCuentaProyectosSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"presutipocuentaproyecto";//.xls";
		
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
		
			Sheet sheet = workbook.createSheet("PresuTipoCuentaProyectos");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			Row row = sheet.createRow(iRow);
			Cell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");
			
			for(int index:this.jInternalFrameReporteDinamicoPresuTipoCuentaProyecto.getjListColumnasSelectReporte().getSelectedIndices()) {
				reporte=(Reporte)this.jInternalFrameReporteDinamicoPresuTipoCuentaProyecto.getjListColumnasSelectReporte().getModel().getElementAt(index);
				
				switch(reporte.getsCodigo()) {
					
				case PresuTipoCuentaProyectoConstantesFunciones.LABEL_IDEMPRESA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(PresuTipoCuentaProyectoConstantesFunciones.LABEL_IDEMPRESA);
					iRow++;

					for(PresuTipoCuentaProyecto presutipocuentaproyecto:presutipocuentaproyectosSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(presutipocuentaproyecto.getempresa_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case PresuTipoCuentaProyectoConstantesFunciones.LABEL_CODIGO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(PresuTipoCuentaProyectoConstantesFunciones.LABEL_CODIGO);
					iRow++;

					for(PresuTipoCuentaProyecto presutipocuentaproyecto:presutipocuentaproyectosSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(presutipocuentaproyecto.getcodigo());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case PresuTipoCuentaProyectoConstantesFunciones.LABEL_NOMBRE:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(PresuTipoCuentaProyectoConstantesFunciones.LABEL_NOMBRE);
					iRow++;

					for(PresuTipoCuentaProyecto presutipocuentaproyecto:presutipocuentaproyectosSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(presutipocuentaproyecto.getnombre());
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
			//	this.getFilaCabeceraExportarExcelPresuTipoCuentaProyecto(row);				
			//	iRow++;
			//}				
			
			//for(PresuTipoCuentaProyecto presutipocuentaproyectoAux:presutipocuentaproyectosSeleccionados) {
			//	row = sheet.createRow(iRow);
				
			//	this.getFilaDatosExportarExcelPresuTipoCuentaProyecto(presutipocuentaproyectoAux,row);
				
			//	iRow++;
			//}
			
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.presutipocuentaproyectoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Cuenta Proyecto",JOptionPane.INFORMATION_MESSAGE);
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
				this.presutipocuentaproyectoLogic.getNewConnexionToDeep("");
			}
			
			this.idActual=idActual;
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda("PorId");
				    	
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingPresuTipoCuentaProyecto(false);
			
			//SI ES MANUAL
			if(PresuTipoCuentaProyectoJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualPresuTipoCuentaProyecto();
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.presutipocuentaproyectoLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.presutipocuentaproyectoLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger);
			
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.presutipocuentaproyectoLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonAnterioresPresuTipoCuentaProyectoActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion-=this.iNumeroPaginacion;
			/*
			if(this.iNumeroPaginacion<0) {
				this.iNumeroPaginacion=0;
			}
			*/
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.presutipocuentaproyectoLogic.getNewConnexionToDeep("");
			}
			
			this.anteriores();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingPresuTipoCuentaProyecto(false);
			
			//SI ES MANUAL
			if(PresuTipoCuentaProyectoJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualPresuTipoCuentaProyecto();
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.presutipocuentaproyectoLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.presutipocuentaproyectoLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,PresuTipoCuentaProyectoConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.presutipocuentaproyectoLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonSiguientesPresuTipoCuentaProyectoActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion+=this.iNumeroPaginacion;
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.presutipocuentaproyectoLogic.getNewConnexionToDeep("");
			}
			
			this.siguientes();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingPresuTipoCuentaProyecto(false);
			
			//SI ES MANUAL
			if(PresuTipoCuentaProyectoJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualPresuTipoCuentaProyecto();
			}		
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.presutipocuentaproyectoLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.presutipocuentaproyectoLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,PresuTipoCuentaProyectoConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.presutipocuentaproyectoLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void aumentarTamanioFilaNuevaTablaPresuTipoCuentaProyecto() throws Exception {		
		Dimension dimensionMinimum=this.jTableDatosPresuTipoCuentaProyecto.getMinimumSize();
		Dimension dimensionMaximum=this.jTableDatosPresuTipoCuentaProyecto.getMaximumSize();
		Dimension dimensionPreferred=this.jTableDatosPresuTipoCuentaProyecto.getPreferredSize();
	
		double iHeightConFilaNueva=dimensionPreferred.getHeight();
		
		iHeightConFilaNueva+=this.jTableDatosPresuTipoCuentaProyecto.getRowHeight();
		
		dimensionMinimum.setSize(dimensionMinimum.getWidth(),iHeightConFilaNueva);
		dimensionMaximum.setSize(dimensionMaximum.getWidth(),iHeightConFilaNueva);
		dimensionPreferred.setSize(dimensionPreferred.getWidth(),iHeightConFilaNueva);
		
		this.jTableDatosPresuTipoCuentaProyecto.setMinimumSize(dimensionMinimum);
		this.jTableDatosPresuTipoCuentaProyecto.setMaximumSize(dimensionMaximum);
		this.jTableDatosPresuTipoCuentaProyecto.setPreferredSize(dimensionPreferred);	
	}
	
	public void inicializarActualizarBindingPresuTipoCuentaProyecto(Boolean esInicializar) throws Exception {
		this.inicializarActualizarBindingPresuTipoCuentaProyecto(esInicializar,true);
	}
	
	public void inicializarActualizarBindingPresuTipoCuentaProyecto(Boolean esInicializar,Boolean conTabla) throws Exception {		
		if(conTabla) {
			this.inicializarActualizarBindingTablaPresuTipoCuentaProyecto(esInicializar);
		}
		
		this.inicializarActualizarBindingBotonesPresuTipoCuentaProyecto(esInicializar);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.presutipocuentaproyectoSessionBean.getEsGuardarRelacionado()) {
			try{this.inicializarActualizarBindingBusquedasPresuTipoCuentaProyecto(esInicializar);}catch(Exception e){e.printStackTrace();}
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesPresuTipoCuentaProyecto(esInicializar) ;
			
			this.inicializarActualizarBindingParametrosReportesPresuTipoCuentaProyecto(esInicializar) ;
		}
		
		if(esInicializar) {
			if( !PresuTipoCuentaProyectoJInternalFrame.ISBINDING_MANUAL_TABLA ||
			   	!PresuTipoCuentaProyectoJInternalFrame.ISBINDING_MANUAL) {
			   	
			}
		}
	}
	
	public void inicializarActualizarBindingManualPresuTipoCuentaProyecto() throws Exception {		
		//NO SE NECESITA HACER BINDING OTRA VEZ
		//this.inicializarActualizarBindingTablaPresuTipoCuentaProyecto();
		
		this.inicializarActualizarBindingBotonesManualPresuTipoCuentaProyecto(true);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.presutipocuentaproyectoSessionBean.getEsGuardarRelacionado()) {
			
			this.inicializarActualizarBindingBusquedasManualPresuTipoCuentaProyecto();			
			
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesPresuTipoCuentaProyecto() ;
			
			this.inicializarActualizarBindingParametrosReportesPostAccionesManualPresuTipoCuentaProyecto(false) ;			
			
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesPostAccionesManualPresuTipoCuentaProyecto(Boolean esSetControles) throws Exception {
		try	{					
			if(!esSetControles) {
				this.isSeleccionarTodos=this.jCheckBoxSeleccionarTodosPresuTipoCuentaProyecto.isSelected();
				this.isSeleccionados=this.jCheckBoxSeleccionadosPresuTipoCuentaProyecto.isSelected();
				
				
				this.conGraficoReporte=this.jCheckBoxConGraficoReportePresuTipoCuentaProyecto.isSelected();															
				
				
				if(this.jInternalFrameDetalleFormPresuTipoCuentaProyecto!=null) {
				this.isPostAccionNuevo=this.jInternalFrameDetalleFormPresuTipoCuentaProyecto.jCheckBoxPostAccionNuevoPresuTipoCuentaProyecto.isSelected();
				this.isPostAccionSinCerrar=this.jInternalFrameDetalleFormPresuTipoCuentaProyecto.jCheckBoxPostAccionSinCerrarPresuTipoCuentaProyecto.isSelected();
				this.isPostAccionSinMensaje=this.jInternalFrameDetalleFormPresuTipoCuentaProyecto.jCheckBoxPostAccionSinMensajePresuTipoCuentaProyecto.isSelected();
				}
			
			} else {
				this.jCheckBoxSeleccionarTodosPresuTipoCuentaProyecto.setSelected(this.isSeleccionarTodos);
				this.jCheckBoxSeleccionadosPresuTipoCuentaProyecto.setSelected(this.isSeleccionados);
				
				
				this.jCheckBoxConGraficoReportePresuTipoCuentaProyecto.setSelected(this.conGraficoReporte);				
				
				
				if(this.jInternalFrameDetalleFormPresuTipoCuentaProyecto!=null) {
				this.jInternalFrameDetalleFormPresuTipoCuentaProyecto.jCheckBoxPostAccionNuevoPresuTipoCuentaProyecto.setSelected(this.isPostAccionNuevo);
				this.jInternalFrameDetalleFormPresuTipoCuentaProyecto.jCheckBoxPostAccionSinCerrarPresuTipoCuentaProyecto.setSelected(this.isPostAccionSinCerrar);
				this.jInternalFrameDetalleFormPresuTipoCuentaProyecto.jCheckBoxPostAccionSinMensajePresuTipoCuentaProyecto.setSelected(this.isPostAccionSinMensaje);
				}
			}
			
			
			if(this.jComboBoxTiposPaginacionPresuTipoCuentaProyecto.getSelectedItem()!=null) {
				this.sTipoPaginacion=((Reporte)this.jComboBoxTiposPaginacionPresuTipoCuentaProyecto.getSelectedItem()).getsCodigo();			
			}
			
			
			
			if(this.jInternalFrameDetalleFormPresuTipoCuentaProyecto!=null) {
			this.sTipoAccionFormulario=((Reporte)this.jInternalFrameDetalleFormPresuTipoCuentaProyecto.jComboBoxTiposAccionesFormularioPresuTipoCuentaProyecto.getSelectedItem()).getsCodigo();
			}
			
			
			
			if(!this.conCargarMinimo) {
				this.sTipoArchivoReporte=((Reporte)this.jComboBoxTiposArchivosReportesPresuTipoCuentaProyecto.getSelectedItem()).getsCodigo();			
				
				if(this.jInternalFrameReporteDinamicoPresuTipoCuentaProyecto!=null) {
					this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoPresuTipoCuentaProyecto.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
				}
				
				this.sTipoRelacion=((Reporte)this.jComboBoxTiposRelacionesPresuTipoCuentaProyecto.getSelectedItem()).getsCodigo();
									
				this.sTipoAccion=((Reporte)this.jComboBoxTiposAccionesPresuTipoCuentaProyecto.getSelectedItem()).getsCodigo();
													
				this.sTipoSeleccionar=((Reporte)this.jComboBoxTiposSeleccionarPresuTipoCuentaProyecto.getSelectedItem()).getsCodigo();
									
				this.sTipoReporte=((Reporte)this.jComboBoxTiposReportesPresuTipoCuentaProyecto.getSelectedItem()).getsCodigo();							
					
				if(this.jInternalFrameReporteDinamicoPresuTipoCuentaProyecto!=null) {
					this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoPresuTipoCuentaProyecto.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();							
				}
				
				this.sTipoGraficoReporte=((Reporte)this.jComboBoxTiposGraficosReportesPresuTipoCuentaProyecto.getSelectedItem()).getsCodigo();											
			}			
			
			this.sValorCampoGeneral=this.jTextFieldValorCampoGeneralPresuTipoCuentaProyecto.getText();						
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesPresuTipoCuentaProyecto(Boolean esInicializar) throws Exception {
		try	{	
			if(PresuTipoCuentaProyectoJInternalFrame.ISBINDING_MANUAL) {
				this. inicializarActualizarBindingParametrosReportesPostAccionesManualPresuTipoCuentaProyecto(false);
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public void inicializarActualizarBindingtiposArchivosReportesAccionesPresuTipoCuentaProyecto() throws Exception {
		try	{
			if(PresuTipoCuentaProyectoJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingtiposArchivosReportesAccionesManualPresuTipoCuentaProyecto();
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetallePresuTipoCuentaProyecto() throws Exception {
		//TIPOS ACCIONES FORMULARIO	
		this.jInternalFrameDetalleFormPresuTipoCuentaProyecto.jComboBoxTiposAccionesFormularioPresuTipoCuentaProyecto.removeAllItems();
				
		for(Reporte reporte:this.tiposAccionesFormulario) {
			this.jInternalFrameDetalleFormPresuTipoCuentaProyecto.jComboBoxTiposAccionesFormularioPresuTipoCuentaProyecto.addItem(reporte);
		}
		
		//TIPOS ACCIONES FORMULARIO
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualPresuTipoCuentaProyecto() throws Exception {
		try	{
			
			//TIPOS ARCHIVOS REPORTES
			this.jComboBoxTiposArchivosReportesPresuTipoCuentaProyecto.removeAllItems();
				
			for(Reporte reporte:this.tiposArchivosReportes) {
				this.jComboBoxTiposArchivosReportesPresuTipoCuentaProyecto.addItem(reporte);
			}
			
			
				
			//TIPOS REPORTES
			this.jComboBoxTiposReportesPresuTipoCuentaProyecto.removeAllItems();
				
			for(Reporte reporte:this.tiposReportes) {
				this.jComboBoxTiposReportesPresuTipoCuentaProyecto.addItem(reporte);
			}
			
			
			//TIPOS GRAFICOS REPORTES
			this.jComboBoxTiposGraficosReportesPresuTipoCuentaProyecto.removeAllItems();
				
			for(Reporte reporte:this.tiposGraficosReportes) {
				this.jComboBoxTiposGraficosReportesPresuTipoCuentaProyecto.addItem(reporte);
			}
			
			
			//TIPOS PAGINACION
			this.jComboBoxTiposPaginacionPresuTipoCuentaProyecto.removeAllItems();
				
			for(Reporte reporte:this.tiposPaginacion) {
				this.jComboBoxTiposPaginacionPresuTipoCuentaProyecto.addItem(reporte);
			}
			
			
			if(!this.presutipocuentaproyectoSessionBean.getEsGuardarRelacionado()) {
				this.jComboBoxTiposPaginacionPresuTipoCuentaProyecto.setSelectedItem(Funciones2.getTipoPaginacionDefecto("NORMAL",this.tiposPaginacion));
			} else {
				this.jComboBoxTiposPaginacionPresuTipoCuentaProyecto.setSelectedItem(Funciones2.getTipoPaginacionDefecto("RELACIONADO",this.tiposPaginacion));
			}
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposRelacionesPresuTipoCuentaProyecto.removeAllItems();
				
			for(Reporte reporte:this.tiposRelaciones) {
				this.jComboBoxTiposRelacionesPresuTipoCuentaProyecto.addItem(reporte);
			}
			
			//TIPOS ACCIONES
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposAccionesPresuTipoCuentaProyecto.removeAllItems();
				
			for(Reporte reporte:this.tiposAcciones) {
				this.jComboBoxTiposAccionesPresuTipoCuentaProyecto.addItem(reporte);
			}
			
			//TIPOS ACCIONES			
			
			
			
			//TIPOS ACCIONES FORMULARIO	
			if(this.jInternalFrameDetalleFormPresuTipoCuentaProyecto!=null) { //if(this.conCargarFormDetalle) {
				this.jInternalFrameDetalleFormPresuTipoCuentaProyecto.jComboBoxTiposAccionesFormularioPresuTipoCuentaProyecto.removeAllItems();
				
				for(Reporte reporte:this.tiposAccionesFormulario) {
					this.jInternalFrameDetalleFormPresuTipoCuentaProyecto.jComboBoxTiposAccionesFormularioPresuTipoCuentaProyecto.addItem(reporte);
				}
				
			}
			//TIPOS ACCIONES FORMULARIO
			
			
			
			//TIPOS SELECCIONAR
			this.jComboBoxTiposSeleccionarPresuTipoCuentaProyecto.removeAllItems();
				
			for(Reporte reporte:this.tiposSeleccionar) {
				this.jComboBoxTiposSeleccionarPresuTipoCuentaProyecto.addItem(reporte);
			}
			
			
			if(this.tiposSeleccionar!=null && this.tiposSeleccionar.size()>1) {
				this.jComboBoxTiposSeleccionarPresuTipoCuentaProyecto.setSelectedIndex(1);
			}
				
			//REPORTE DINAMICO
			this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualPresuTipoCuentaProyecto();
							
			//TIPOS COLUMNAS SELECT
			//TIPOS SELECCIONAR
			
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualPresuTipoCuentaProyecto() throws Exception {
		try	{
			DefaultListModel<Reporte> defaultListModel=new DefaultListModel<Reporte>();
			
			
			//TIPOS ARCHIVOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoPresuTipoCuentaProyecto!=null) {
				this.jInternalFrameReporteDinamicoPresuTipoCuentaProyecto.getjComboBoxTiposArchivosReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposArchivosReportesDinamico) {
					this.jInternalFrameReporteDinamicoPresuTipoCuentaProyecto.getjComboBoxTiposArchivosReportesDinamico().addItem(reporte);
				}
				
			}
			
			//TIPOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoPresuTipoCuentaProyecto!=null) {
				this.jInternalFrameReporteDinamicoPresuTipoCuentaProyecto.getjComboBoxTiposReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposReportesDinamico) {
					this.jInternalFrameReporteDinamicoPresuTipoCuentaProyecto.getjComboBoxTiposReportesDinamico().addItem(reporte);
				}
				
			}
			
			defaultListModel=new DefaultListModel<Reporte>();
			
			if(this.jInternalFrameReporteDinamicoPresuTipoCuentaProyecto!=null) {
				
				if(this.jInternalFrameReporteDinamicoPresuTipoCuentaProyecto.getjListColumnasSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoPresuTipoCuentaProyecto.getjListColumnasSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposColumnasSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoPresuTipoCuentaProyecto.getjListColumnasSelectReporte().setModel(defaultListModel);									
						
				}	
					
				//TIPOS RELACIONES SELECT
				//TIPOS SELECCIONAR
				defaultListModel=new DefaultListModel<Reporte>();
				if(this.jInternalFrameReporteDinamicoPresuTipoCuentaProyecto.getjListRelacionesSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoPresuTipoCuentaProyecto.getjListRelacionesSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposRelacionesSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoPresuTipoCuentaProyecto.getjListRelacionesSelectReporte().setModel(defaultListModel);									
						
				}	
				
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	
	
	public void inicializarActualizarBindingBusquedasManualPresuTipoCuentaProyecto()  throws Exception {				
		//BYDAN_BUSQUEDAS		
		
		this.codigoBusquedaPorCodigo=this.jTextFieldcodigoBusquedaPorCodigoPresuTipoCuentaProyecto.getText();
		this.nombreBusquedaPorNombre=this.jTextAreanombreBusquedaPorNombrePresuTipoCuentaProyecto.getText();
		
	}
	
	
	
	
	public void inicializarActualizarBindingBusquedasPresuTipoCuentaProyecto(Boolean esInicializar) throws Exception {				
		if(PresuTipoCuentaProyectoJInternalFrame.ISBINDING_MANUAL) {
			
			this.inicializarActualizarBindingBusquedasManualPresuTipoCuentaProyecto();			
			
		} else {
		}
	}		
		
	public void inicializarActualizarBindingTablaPresuTipoCuentaProyecto() throws Exception {
		this.inicializarActualizarBindingTablaPresuTipoCuentaProyecto(false);
	}
	
	
	public void inicializarActualizarBindingTablaOrderByPresuTipoCuentaProyecto() {
		//TABLA OrderBy	
		TableColumn tableColumn=new TableColumn();
		Integer iWidthTableDefinicionOrderBy=0;			
			
		this.jInternalFrameOrderByPresuTipoCuentaProyecto.getjTableDatosOrderBy().setModel(new TablaGeneralOrderByModel(this.arrOrderBy));
					
		//DEFINIR RENDERERS OrderBy
		tableColumn=this.jInternalFrameOrderByPresuTipoCuentaProyecto.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByPresuTipoCuentaProyecto.getjTableDatosOrderBy(),OrderBy.ISSELECTED));			
		//tableColumn.addPropertyChangeListener(new PresuTipoCuentaProyectoPropertyChangeListener());
					
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		iWidthTableDefinicionOrderBy+=50;
					
		tableColumn=this.jInternalFrameOrderByPresuTipoCuentaProyecto.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByPresuTipoCuentaProyecto.getjTableDatosOrderBy(),OrderBy.NOMBRE));
		//tableColumn.addPropertyChangeListener(new PresuTipoCuentaProyectoPropertyChangeListener());
					
		tableColumn.setPreferredWidth(150); 	 
		tableColumn.setWidth(150); 	 
		tableColumn.setMinWidth(150);
		tableColumn.setMaxWidth(150);
				
		iWidthTableDefinicionOrderBy+=150;
					
		//tableColumn=this.jTableDatosPresuTipoCuentaProyectoOrderBy.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosPresuTipoCuentaProyectoOrderBy,OrderBy.NOMBREDB));			
		////tableColumn.addPropertyChangeListener(new PresuTipoCuentaProyectoPropertyChangeListener());
								
		tableColumn=this.jInternalFrameOrderByPresuTipoCuentaProyecto.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByPresuTipoCuentaProyecto.getjTableDatosOrderBy(),OrderBy.ESDESC));
		//tableColumn.addPropertyChangeListener(new PresuTipoCuentaProyectoPropertyChangeListener());
												
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		((AbstractTableModel) this.jInternalFrameOrderByPresuTipoCuentaProyecto.getjTableDatosOrderBy().getModel()).fireTableDataChanged();
				
		iWidthTableDefinicionOrderBy+=50;
	}
	
	
	
	public void inicializarActualizarBindingTablaPresuTipoCuentaProyecto(Boolean esInicializar) throws Exception {
		Boolean isNoExiste=false;
		Integer iCountNumeroColumnasNormal=0;
		Integer iCountNumeroColumnasFk=0;
		
		this.iWidthTableDefinicion=0;
		
		int iSizeTabla=0;
		
		iSizeTabla=this.getSizeTablaDatos();
		
	if(esInicializar || ConstantesSwing.FORZAR_INICIALIZAR_TABLA) {//esInicializar
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			isNoExiste=presutipocuentaproyectoLogic.getPresuTipoCuentaProyectos().size()==0;
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			isNoExiste=presutipocuentaproyectos.size()==0;
		}
		//ARCHITECTURE
			
		if(isNoExiste) {
			if(this.iNumeroPaginacion-this.iNumeroPaginacion>0) {
				this.iNumeroPaginacion-=this.iNumeroPaginacion;
			}
		}
		
		TableColumn tableColumn=new TableColumn();
		
		if(PresuTipoCuentaProyectoJInternalFrame.ISBINDING_MANUAL_TABLA) {
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.jTableDatosPresuTipoCuentaProyecto.setModel(new PresuTipoCuentaProyectoModel(this.presutipocuentaproyectoLogic.getPresuTipoCuentaProyectos(),this));
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.jTableDatosPresuTipoCuentaProyecto.setModel(new PresuTipoCuentaProyectoModel(this.presutipocuentaproyectos,this));
			}
			//ARCHITECTURE
			
							
			
			
			if(this.jInternalFrameOrderByPresuTipoCuentaProyecto!=null && this.jInternalFrameOrderByPresuTipoCuentaProyecto.getjTableDatosOrderBy()!=null) {
				this.inicializarActualizarBindingTablaOrderByPresuTipoCuentaProyecto();
			}
			
								
			//DEFINIR RENDERERS
			tableColumn=this.jTableDatosPresuTipoCuentaProyecto.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosPresuTipoCuentaProyecto,Constantes2.S_SELECCIONAR));
			//tableColumn.addPropertyChangeListener(new PresuTipoCuentaProyectoPropertyChangeListener());
			tableColumn.setCellRenderer(new BooleanRenderer(true,"Seleccionar "+PresuTipoCuentaProyectoConstantesFunciones.SCLASSWEBTITULO,presutipocuentaproyectoConstantesFunciones.resaltarSeleccionarPresuTipoCuentaProyecto,true,false,"","",this));
			tableColumn.setCellEditor(new BooleanEditorRenderer(true,"Seleccionar "+PresuTipoCuentaProyectoConstantesFunciones.SCLASSWEBTITULO,presutipocuentaproyectoConstantesFunciones.resaltarSeleccionarPresuTipoCuentaProyecto,false,"","",this));			
			
			tableColumn.setPreferredWidth(50); 	 
			tableColumn.setWidth(50); 	 
			tableColumn.setMinWidth(50); 
			tableColumn.setMaxWidth(50); 
			
			this.iWidthTableDefinicion+=50;
			
			


			tableColumn=this.jTableDatosPresuTipoCuentaProyecto.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosPresuTipoCuentaProyecto,PresuTipoCuentaProyectoConstantesFunciones.LABEL_ID));

		if(this.presutipocuentaproyectoConstantesFunciones.mostraridPresuTipoCuentaProyecto && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,PresuTipoCuentaProyectoConstantesFunciones.LABEL_ID,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.presutipocuentaproyectoConstantesFunciones.resaltaridPresuTipoCuentaProyecto,this.presutipocuentaproyectoConstantesFunciones.activaridPresuTipoCuentaProyecto,this,true,"idPresuTipoCuentaProyecto","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.presutipocuentaproyectoConstantesFunciones.resaltaridPresuTipoCuentaProyecto,this.presutipocuentaproyectoConstantesFunciones.activaridPresuTipoCuentaProyecto,this,true,"idPresuTipoCuentaProyecto","BASICO",false));

			tableColumn.setPreferredWidth(50);
			tableColumn.setWidth(50);
			tableColumn.setMinWidth(50);
			tableColumn.setMaxWidth(50);

			this.iWidthTableDefinicion+=50;
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosPresuTipoCuentaProyecto.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosPresuTipoCuentaProyecto,PresuTipoCuentaProyectoConstantesFunciones.LABEL_IDEMPRESA));

		if(this.presutipocuentaproyectoConstantesFunciones.mostrarid_empresaPresuTipoCuentaProyecto && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,PresuTipoCuentaProyectoConstantesFunciones.LABEL_IDEMPRESA,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++) && Constantes.ISDEVELOPING) {
			tableColumn.setCellRenderer(new EmpresaTableCell(this.empresasForeignKey,this.presutipocuentaproyectoConstantesFunciones.resaltarid_empresaPresuTipoCuentaProyecto,this,this.presutipocuentaproyectoConstantesFunciones.activarid_empresaPresuTipoCuentaProyecto));
			tableColumn.setCellEditor(new EmpresaTableCell(this.empresasForeignKey,this.presutipocuentaproyectoConstantesFunciones.resaltarid_empresaPresuTipoCuentaProyecto,this,this.presutipocuentaproyectoConstantesFunciones.activarid_empresaPresuTipoCuentaProyecto,false,"id_empresaPresuTipoCuentaProyecto","GLOBAL"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new PresuTipoCuentaProyectoPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosPresuTipoCuentaProyecto.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosPresuTipoCuentaProyecto,PresuTipoCuentaProyectoConstantesFunciones.LABEL_CODIGO));

		if(this.presutipocuentaproyectoConstantesFunciones.mostrarcodigoPresuTipoCuentaProyecto && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,PresuTipoCuentaProyectoConstantesFunciones.LABEL_CODIGO,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.presutipocuentaproyectoConstantesFunciones.resaltarcodigoPresuTipoCuentaProyecto,this.presutipocuentaproyectoConstantesFunciones.activarcodigoPresuTipoCuentaProyecto,this,true,"codigoPresuTipoCuentaProyecto","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.presutipocuentaproyectoConstantesFunciones.resaltarcodigoPresuTipoCuentaProyecto,this.presutipocuentaproyectoConstantesFunciones.activarcodigoPresuTipoCuentaProyecto,this,true,"codigoPresuTipoCuentaProyecto","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new PresuTipoCuentaProyectoPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosPresuTipoCuentaProyecto.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosPresuTipoCuentaProyecto,PresuTipoCuentaProyectoConstantesFunciones.LABEL_NOMBRE));

		if(this.presutipocuentaproyectoConstantesFunciones.mostrarnombrePresuTipoCuentaProyecto && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,PresuTipoCuentaProyectoConstantesFunciones.LABEL_NOMBRE,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.presutipocuentaproyectoConstantesFunciones.resaltarnombrePresuTipoCuentaProyecto,this.presutipocuentaproyectoConstantesFunciones.activarnombrePresuTipoCuentaProyecto,this,true,"nombrePresuTipoCuentaProyecto","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.presutipocuentaproyectoConstantesFunciones.resaltarnombrePresuTipoCuentaProyecto,this.presutipocuentaproyectoConstantesFunciones.activarnombrePresuTipoCuentaProyecto,this,true,"nombrePresuTipoCuentaProyecto","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new PresuTipoCuentaProyectoPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}
			
		} else {
		}			
					
		if(!this.presutipocuentaproyectoSessionBean.getEsGuardarRelacionado()
			&& !this.esParaBusquedaForeignKey) {
			
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
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.presutipocuentaproyectoSessionBean.getEsGuardarRelacionado()));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.presutipocuentaproyectoSessionBean.getEsGuardarRelacionado()));
	
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosPresuTipoCuentaProyecto.addColumn(tableColumn);
			
			} else {				
				
				//LO MISMO QUE IF
				
				tableColumn= new TableColumn();
				tableColumn.setIdentifier(sLabelColumnAccion);
				tableColumn.setHeaderValue(sLabelColumnAccion);
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.presutipocuentaproyectoSessionBean.getEsGuardarRelacionado()));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.presutipocuentaproyectoSessionBean.getEsGuardarRelacionado()));
		
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosPresuTipoCuentaProyecto.addColumn(tableColumn);				
					
				//ELIMINAR
				if(this.isPermisoEliminarPresuTipoCuentaProyecto && this.isPermisoGuardarCambiosPresuTipoCuentaProyecto) {
					tableColumn= new TableColumn();
					tableColumn.setIdentifier(Constantes2.S_ELI);
					tableColumn.setHeaderValue(sLabelColumnAccionEli);
					tableColumn.setCellRenderer(new IdTableCell(this,false,true,this.presutipocuentaproyectoSessionBean.getEsGuardarRelacionado()));
					tableColumn.setCellEditor(new IdTableCell(this,false,true,this.presutipocuentaproyectoSessionBean.getEsGuardarRelacionado()));
			
					tableColumn.setPreferredWidth(65); 	 
					tableColumn.setWidth(65); 	 
					tableColumn.setMinWidth(65); 
					tableColumn.setMaxWidth(65);
					
					this.iWidthTableDefinicion+=65;
						
					this.jTableDatosPresuTipoCuentaProyecto.addColumn(tableColumn);
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
			
			this.jTableDatosPresuTipoCuentaProyecto.addColumn(tableColumn);
			*/
		}
		
		Integer iUltimaColumna=0;//1
		Integer iNuevaPosicionColumna=0;
		
		
		//PERMITE ELIMINAR SIMPLE
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarPresuTipoCuentaProyecto && this.isPermisoGuardarCambiosPresuTipoCuentaProyecto) {
				iUltimaColumna++;
			}	
		}
		
		//PERMITE EDITAR SIMPLE
		iUltimaColumna++;	
		
				
		
		//MOVIA SELECCIONAR
		//iUltimaColumna++;
		
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarPresuTipoCuentaProyecto && this.isPermisoGuardarCambiosPresuTipoCuentaProyecto) {
				//REUBICA ELIMINAR SIMPLE
				jTableDatosPresuTipoCuentaProyecto.moveColumn(this.jTableDatosPresuTipoCuentaProyecto.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3
					
				iUltimaColumna--;
			}
		}
		//REUBICA EDITAR SIMPLE
		jTableDatosPresuTipoCuentaProyecto.moveColumn(this.jTableDatosPresuTipoCuentaProyecto.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3				
		
		
		
		
		//REUBICABA SELECCIONAR
		/*
		if(iUltimaColumna>1) {
			iUltimaColumna--;
		}
		
		//iNuevaPosicionColumna++;
			
		//REUBICA SELECCIONAR FILA CHECK
		jTableDatosPresuTipoCuentaProyecto.moveColumn(this.jTableDatosPresuTipoCuentaProyecto.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1		
		*/
		
		//DEFINEN HEADERS
		final TableCellRenderer tableHeaderDefaultCellRenderer = this.jTableDatosPresuTipoCuentaProyecto.getTableHeader().getDefaultRenderer();
		
		this.jTableDatosPresuTipoCuentaProyecto.getTableHeader().setDefaultRenderer(new TableCellRendererHeader(this.jTableDatosPresuTipoCuentaProyecto,tableHeaderDefaultCellRenderer));
	    
		TableColumn column=null;
		
		if(!PresuTipoCuentaProyectoJInternalFrame.ISBINDING_MANUAL_TABLA) {
			for(int i = 0; i < this.jTableDatosPresuTipoCuentaProyecto.getColumnModel().getColumnCount(); i++) { 
				column = this.jTableDatosPresuTipoCuentaProyecto.getColumnModel().getColumn(i); 
				
				if(column.getIdentifier()!=null) {
					//SI SE UTILIZA UN HEADER ES GENERICO
					//column.setHeaderRenderer(new HeaderRenderer(column.getIdentifier().toString()));
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_ELI)) {
					continue;
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_SELECCIONAR)) {
					if(!PresuTipoCuentaProyectoJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(50); 	 
						column.setWidth(50); 	 
						column.setMinWidth(50); 	
						column.setMaxWidth(50); 
						
						this.iWidthTableDefinicion+=50;
					}
					
				} else {
					if(!PresuTipoCuentaProyectoJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						column.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						
						this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
					}
				}
			}
		}
		
		this.jTableDatosPresuTipoCuentaProyecto.setSelectionBackground(FuncionesSwing.getColorSelectedBackground());
		this.jTableDatosPresuTipoCuentaProyecto.setSelectionForeground(FuncionesSwing.getColorSelectedForeground());
		
		/*
		this.jTableDatosPresuTipoCuentaProyecto.setDefaultRenderer(Object.class, new DefaultTableCellRenderer() {
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
							iSize=presutipocuentaproyectoLogic.getPresuTipoCuentaProyectos().size()-1;
								
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							iSize=presutipocuentaproyectos.size()-1;
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
		//this.jTableDatosPresuTipoCuentaProyecto.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA);
		
		/*
		column=this.jTableDatosPresuTipoCuentaProyecto.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosSistema,Constantes2.S_SELECCIONAR));
		
		if(column!=null) {
			column.setPreferredWidth(25); 	 
			column.setWidth(25); 	 
			column.setMinWidth(25); 	
		}
		*/
			
			//CopyTableToTableTotal();
		} else {
			
			this.actualizarVisualTableDatosPresuTipoCuentaProyecto();
			
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
				
				//this.isEsNuevoPresuTipoCuentaProyecto=false;
					
				PresuTipoCuentaProyectoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.presutipocuentaproyecto,new Object(),this.presutipocuentaproyectoParameterGeneral,this.presutipocuentaproyectoReturnGeneral);
			
				if(this.presutipocuentaproyectoSessionBean.getConGuardarRelaciones()) {
					this.dStart=(double)System.currentTimeMillis();
				}
				
				if(this.jInternalFrameDetalleFormPresuTipoCuentaProyecto==null) {
					this.inicializarFormDetalle();
				}
				
				this.inicializarInvalidValues();
				
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosPresuTipoCuentaProyecto.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosPresuTipoCuentaProyecto.getSelectedRow();	       
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.presutipocuentaproyecto =(PresuTipoCuentaProyecto) this.presutipocuentaproyectoLogic.getPresuTipoCuentaProyectos().toArray()[this.jTableDatosPresuTipoCuentaProyecto.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.presutipocuentaproyecto =(PresuTipoCuentaProyecto) this.presutipocuentaproyectos.toArray()[this.jTableDatosPresuTipoCuentaProyecto.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//PUEDE SER PARA DUPLICADO O NUEVO TABLA
				
				if(this.presutipocuentaproyecto.getsType().equals("DUPLICADO")
				   || this.presutipocuentaproyecto.getsType().equals("NUEVO_GUARDAR_CAMBIOS")) {
					
					this.isEsNuevoPresuTipoCuentaProyecto=true;
				
				} else {
					this.isEsNuevoPresuTipoCuentaProyecto=false;	
				}
				
				//CONTROL VERSION ANTERIOR
				/*
				if(!this.presutipocuentaproyectoSessionBean.getEsGuardarRelacionado()) {
					if(this.presutipocuentaproyecto.getId()>=0 && !this.presutipocuentaproyecto.getIsNew()) {						
						this.isEsNuevoPresuTipoCuentaProyecto=false;
						
					} else {
						this.isEsNuevoPresuTipoCuentaProyecto=true;
					}
					
				} else {
					//CONTROLAR PARA RELACIONADO
				}
				*/
				
				//ESTABLECE SI ES RELACIONADO O NO 
				this.habilitarDeshabilitarTipoMantenimientoPresuTipoCuentaProyecto(esRelaciones);						
				
				this.seleccionarPresuTipoCuentaProyecto(evt,null,rowIndex);
				
				//SELECCIONA ACTUAL PERO AUN NO SE HA INGRESADO AL SISTEMA
				//SE DESHABILITA POR GUARDAR CAMBIOS
				/*
				if(this.presutipocuentaproyecto.getId()<0) {
					this.isEsNuevoPresuTipoCuentaProyecto=true;
				}
				*/
				
				if(!this.esParaBusquedaForeignKey) {
					this.modificarPresuTipoCuentaProyecto(evt,rowIndex,esRelaciones);
				} else {
					this.seleccionarPresuTipoCuentaProyecto(evt,rowIndex);
				}	
				
				if(this.presutipocuentaproyectoSessionBean.getConGuardarRelaciones()) {
					this.dEnd=(double)System.currentTimeMillis();					
					this.dDif=this.dEnd - this.dStart;
					
					if(Constantes.ISDEVELOPING) {
						System.out.println("Tiempo(ms) Seleccion PresuTipoCuentaProyecto: " + this.dDif); 
					}
				}								
				
				PresuTipoCuentaProyectoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.presutipocuentaproyecto,new Object(),this.presutipocuentaproyectoParameterGeneral,this.presutipocuentaproyectoReturnGeneral);
				
			} else {
				this.estaModoEliminarGuardarCambios=true;
				
				this.seleccionarPresuTipoCuentaProyecto(evt,null,rowIndex);
				
				if(this.permiteMantenimiento(this.presutipocuentaproyecto)) {
					if(this.presutipocuentaproyecto.getId()>0) {
						this.presutipocuentaproyecto.setIsDeleted(true);
						
						this.presutipocuentaproyectosEliminados.add(this.presutipocuentaproyecto);
					}
					
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.presutipocuentaproyectoLogic.getPresuTipoCuentaProyectos().remove(this.presutipocuentaproyecto);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.presutipocuentaproyectos.remove(this.presutipocuentaproyecto);				
					}
					
					
					((PresuTipoCuentaProyectoModel) this.jTableDatosPresuTipoCuentaProyecto.getModel()).fireTableRowsDeleted(rowIndex,rowIndex);
					
					this.actualizarFilaTotales();
					
					this.inicializarActualizarBindingTablaPresuTipoCuentaProyecto(false);					
				}								
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException2(this, e,logger,PresuTipoCuentaProyectoConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoSeleccionar=false;				
			this.estaModoEliminarGuardarCambios=false;
		}
	}
	
	
	public void seleccionarPresuTipoCuentaProyecto(ActionEvent evt,javax.swing.event.ListSelectionEvent evt2,int rowIndex) throws Exception { 
		try {
			//SI PUEDE SER NUEVO Y SELECCIONAR (PARA DUPLICAR Y NUEVO TABLA)
			//if(!this.isEsNuevoPresuTipoCuentaProyecto) {
			
			if(this.jInternalFrameDetalleFormPresuTipoCuentaProyecto==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosPresuTipoCuentaProyecto.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosPresuTipoCuentaProyecto.getSelectedRow();	       
				}
				
				//CUANDO SE RECARGA TABLA TAMBIEN SE SELECCIONA PERO CON -1 POR LO QUE SE NECESITA VALIDAR ANTES
				if(intSelectedRow<0) {
					return;
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.presutipocuentaproyecto =(PresuTipoCuentaProyecto) this.presutipocuentaproyectoLogic.getPresuTipoCuentaProyectos().toArray()[this.jTableDatosPresuTipoCuentaProyecto.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.presutipocuentaproyecto =(PresuTipoCuentaProyecto) this.presutipocuentaproyectos.toArray()[this.jTableDatosPresuTipoCuentaProyecto.convertRowIndexToModel(intSelectedRow)];
				}
				
				if(PresuTipoCuentaProyectoJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesObjetoActualToFormularioPresuTipoCuentaProyecto(this.presutipocuentaproyecto);
				}
				
				//ARCHITECTURE
				try {
					

					//Empresa
					if(!this.presutipocuentaproyectoConstantesFunciones.cargarid_empresaPresuTipoCuentaProyecto || this.presutipocuentaproyectoConstantesFunciones.event_dependid_empresaPresuTipoCuentaProyecto) {
						//this.cargarCombosEmpresasForeignKeyLista(" where id="+this.presutipocuentaproyecto.getid_empresa());
									//this.inicializarActualizarBindingPresuTipoCuentaProyecto(false,false);
						this.empresasForeignKey=new ArrayList<Empresa>();

						if(presutipocuentaproyecto.getEmpresa()!=null) {
							this.empresasForeignKey.add(presutipocuentaproyecto.getEmpresa());
						}

						this.addItemDefectoCombosForeignKeyEmpresa();
						this.cargarCombosFrameEmpresasForeignKey("Todos");
					}
					this.setActualEmpresaForeignKey(this.presutipocuentaproyecto.getid_empresa(),false,"Formulario");
				} catch(Exception e) {
					throw e;
				}
				
				this.actualizarEstadoCeldasBotonesPresuTipoCuentaProyecto("s", this.isGuardarCambiosEnLote, this.isEsMantenimientoRelacionado);
				
				//NO FUNCIONA BINDING PERO SE MANTIENE
				this.inicializarActualizarBindingBotonesPresuTipoCuentaProyecto(false) ;
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualPresuTipoCuentaProyecto() ;
			//}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PresuTipoCuentaProyectoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesObjetoActualToFormularioTodoPresuTipoCuentaProyecto(PresuTipoCuentaProyecto presutipocuentaproyecto) throws Exception { 
		this.setVariablesObjetoActualToFormularioTodoPresuTipoCuentaProyecto(presutipocuentaproyecto,false,"NINGUNO");
	}
	
	public void setVariablesObjetoActualToFormularioTodoPresuTipoCuentaProyecto(PresuTipoCuentaProyecto presutipocuentaproyecto,Boolean conCargarListasDesdeObjetoActual,String sTipoEvento) throws Exception { 
		this.setVariablesObjetoActualToFormularioPresuTipoCuentaProyecto(presutipocuentaproyecto);
		
		if(conCargarListasDesdeObjetoActual) {
			this.setVariablesObjetoActualToListasForeignKeyPresuTipoCuentaProyecto(presutipocuentaproyecto,sTipoEvento);
		}
		
		this.setVariablesObjetoActualToFormularioForeignKeyPresuTipoCuentaProyecto(presutipocuentaproyecto);
	}
	
	public void setVariablesObjetoActualToFormularioPresuTipoCuentaProyecto(PresuTipoCuentaProyecto presutipocuentaproyecto) throws Exception { 
		try {			
			Image imageActual=null;
			ImageIcon imageIcon = null;
			
			if(this.jInternalFrameDetalleFormPresuTipoCuentaProyecto==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			
			this.jInternalFrameDetalleFormPresuTipoCuentaProyecto.jLabelidPresuTipoCuentaProyecto.setText(presutipocuentaproyecto.getId().toString());
			this.jInternalFrameDetalleFormPresuTipoCuentaProyecto.jTextFieldcodigoPresuTipoCuentaProyecto.setText(presutipocuentaproyecto.getcodigo());
			this.jInternalFrameDetalleFormPresuTipoCuentaProyecto.jTextAreanombrePresuTipoCuentaProyecto.setText(presutipocuentaproyecto.getnombre());
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,PresuTipoCuentaProyectoConstantesFunciones.CLASSNAME);
		}
	}
		
	public void actualizarInformacion(String sTipo,PresuTipoCuentaProyecto presutipocuentaproyectoLocal) throws Exception {
		this.actualizarInformacion(sTipo,false,presutipocuentaproyectoLocal);
	}	
	
	public void actualizarInformacion(String sTipo,Boolean conParametroObjeto,PresuTipoCuentaProyecto presutipocuentaproyectoLocal) throws Exception {
		
		if(!conParametroObjeto) {
			if(!this.getEsControlTabla()) {
				presutipocuentaproyectoLocal=this.presutipocuentaproyecto;
			} else {
				presutipocuentaproyectoLocal=this.presutipocuentaproyectoAnterior;
			}
		}
		
		if(this.permiteMantenimiento(presutipocuentaproyectoLocal)) {
			if(sTipo.equals("EVENTO_CONTROL")) { // || sTipo.equals("EVENTO_NUEVO")
				if(!this.esControlTabla) {
					this.setVariablesFormularioToObjetoActualTodoPresuTipoCuentaProyecto(presutipocuentaproyectoLocal,true);
					
					if(presutipocuentaproyectoSessionBean.getConGuardarRelaciones()) {
						this.actualizarRelaciones(presutipocuentaproyectoLocal);
					}
				}
			
			} else if(sTipo.equals("INFO_PADRE")) {
				
				if(this.presutipocuentaproyectoSessionBean.getEsGuardarRelacionado()) {
					this.actualizarRelacionFkPadreActual(presutipocuentaproyectoLocal);
				}
			}
		}
	}
	
	public void setVariablesFormularioToObjetoActualTodoPresuTipoCuentaProyecto(PresuTipoCuentaProyecto presutipocuentaproyecto,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualPresuTipoCuentaProyecto(presutipocuentaproyecto,conColumnasBase);
		this.setVariablesFormularioToObjetoActualForeignKeysPresuTipoCuentaProyecto(presutipocuentaproyecto);
	}
	
	public void setVariablesFormularioToObjetoActualPresuTipoCuentaProyecto(PresuTipoCuentaProyecto presutipocuentaproyecto,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualPresuTipoCuentaProyecto(presutipocuentaproyecto,conColumnasBase,true);
	}
	
	public void setVariablesFormularioToObjetoActualPresuTipoCuentaProyecto(PresuTipoCuentaProyecto presutipocuentaproyecto,Boolean conColumnasBase,Boolean conInicializarInvalidValues) throws Exception { 
		String sMensajeCampoActual="";
		Boolean estaValidado=true;
		try {
			
			if(this.jInternalFrameDetalleFormPresuTipoCuentaProyecto==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			if(conInicializarInvalidValues) {
				this.inicializarInvalidValues();
			}
			
			

		try {
			if(this.jInternalFrameDetalleFormPresuTipoCuentaProyecto.jLabelidPresuTipoCuentaProyecto.getText()==null || this.jInternalFrameDetalleFormPresuTipoCuentaProyecto.jLabelidPresuTipoCuentaProyecto.getText()=="" || this.jInternalFrameDetalleFormPresuTipoCuentaProyecto.jLabelidPresuTipoCuentaProyecto.getText()=="Id") {
				this.jInternalFrameDetalleFormPresuTipoCuentaProyecto.jLabelidPresuTipoCuentaProyecto.setText("0");
			}

			if(conColumnasBase) {presutipocuentaproyecto.setId(Long.parseLong(this.jInternalFrameDetalleFormPresuTipoCuentaProyecto.jLabelidPresuTipoCuentaProyecto.getText()));}
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+PresuTipoCuentaProyectoConstantesFunciones.LABEL_ID+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormPresuTipoCuentaProyecto.jLabelIdPresuTipoCuentaProyecto,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			presutipocuentaproyecto.setcodigo(this.jInternalFrameDetalleFormPresuTipoCuentaProyecto.jTextFieldcodigoPresuTipoCuentaProyecto.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+PresuTipoCuentaProyectoConstantesFunciones.LABEL_CODIGO+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormPresuTipoCuentaProyecto.jLabelcodigoPresuTipoCuentaProyecto,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			presutipocuentaproyecto.setnombre(this.jInternalFrameDetalleFormPresuTipoCuentaProyecto.jTextAreanombrePresuTipoCuentaProyecto.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+PresuTipoCuentaProyectoConstantesFunciones.LABEL_NOMBRE+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormPresuTipoCuentaProyecto.jLabelnombrePresuTipoCuentaProyecto,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}
			
			if(!estaValidado) {
				throw new Exception(sMensajeCampoActual);
			}
		} catch(NumberFormatException e) {
			throw new Exception(sMensajeCampoActual);
			//FuncionesSwing.manageException(this, e,logger,MovimientoInventarioConstantesFunciones.CLASSNAME);
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,PresuTipoCuentaProyectoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualPresuTipoCuentaProyecto(PresuTipoCuentaProyecto presutipocuentaproyectoBean,PresuTipoCuentaProyecto presutipocuentaproyecto,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,PresuTipoCuentaProyectoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setCopiarVariablesObjetosPresuTipoCuentaProyecto(PresuTipoCuentaProyecto presutipocuentaproyectoOrigen,PresuTipoCuentaProyecto presutipocuentaproyecto,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			if(conColumnasBase) {if(conDefault || (!conDefault && presutipocuentaproyectoOrigen.getId()!=null && !presutipocuentaproyectoOrigen.getId().equals(0L))) {presutipocuentaproyecto.setId(presutipocuentaproyectoOrigen.getId());}}
			if(conDefault || (!conDefault && presutipocuentaproyectoOrigen.getcodigo()!=null && !presutipocuentaproyectoOrigen.getcodigo().equals(""))) {presutipocuentaproyecto.setcodigo(presutipocuentaproyectoOrigen.getcodigo());}
			if(conDefault || (!conDefault && presutipocuentaproyectoOrigen.getnombre()!=null && !presutipocuentaproyectoOrigen.getnombre().equals(""))) {presutipocuentaproyecto.setnombre(presutipocuentaproyectoOrigen.getnombre());}
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,PresuTipoCuentaProyectoConstantesFunciones.CLASSNAME);
		}
	}
	
	/*
	public void setVariablesObjetoBeanActualToFormularioPresuTipoCuentaProyecto(PresuTipoCuentaProyecto presutipocuentaproyecto) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormPresuTipoCuentaProyecto.jLabelidPresuTipoCuentaProyecto.setText(presutipocuentaproyecto.getId().toString());
			this.jInternalFrameDetalleFormPresuTipoCuentaProyecto.jTextFieldcodigoPresuTipoCuentaProyecto.setText(presutipocuentaproyecto.getcodigo());
			this.jInternalFrameDetalleFormPresuTipoCuentaProyecto.jTextAreanombrePresuTipoCuentaProyecto.setText(presutipocuentaproyecto.getnombre());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PresuTipoCuentaProyectoConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoBeanActualToFormularioPresuTipoCuentaProyecto(PresuTipoCuentaProyectoBean presutipocuentaproyectoBean) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormPresuTipoCuentaProyecto.jLabelidPresuTipoCuentaProyecto.setText(presutipocuentaproyectoBean.getId().toString());
			this.jInternalFrameDetalleFormPresuTipoCuentaProyecto.jTextFieldcodigoPresuTipoCuentaProyecto.setText(presutipocuentaproyectoBean.getcodigo());
			this.jInternalFrameDetalleFormPresuTipoCuentaProyecto.jTextAreanombrePresuTipoCuentaProyecto.setText(presutipocuentaproyectoBean.getnombre());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PresuTipoCuentaProyectoConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoReturnGeneralToBeanPresuTipoCuentaProyecto(PresuTipoCuentaProyectoParameterReturnGeneral presutipocuentaproyectoReturnGeneral,PresuTipoCuentaProyectoBean presutipocuentaproyectoBean,Boolean conDefault) throws Exception { 
		try {
			PresuTipoCuentaProyecto presutipocuentaproyectoLocal=new PresuTipoCuentaProyecto();
			
			presutipocuentaproyectoLocal=presutipocuentaproyectoReturnGeneral.getPresuTipoCuentaProyecto();
			
			
			if(conColumnasBase) {if(conDefault || (!conDefault && presutipocuentaproyectoLocal.getId()!=null && !presutipocuentaproyectoLocal.getId().equals(0L))) {presutipocuentaproyectoBean.setId(presutipocuentaproyectoLocal.getId());}}
			if(conDefault || (!conDefault && presutipocuentaproyectoLocal.getcodigo()!=null && !presutipocuentaproyectoLocal.getcodigo().equals(""))) {presutipocuentaproyectoBean.setcodigo(presutipocuentaproyectoLocal.getcodigo());}
			if(conDefault || (!conDefault && presutipocuentaproyectoLocal.getnombre()!=null && !presutipocuentaproyectoLocal.getnombre().equals(""))) {presutipocuentaproyectoBean.setnombre(presutipocuentaproyectoLocal.getnombre());}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PresuTipoCuentaProyectoConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	@SuppressWarnings("rawtypes")
	public static void setActualComboBoxPresuTipoCuentaProyectoGenerico(Long idPresuTipoCuentaProyectoSeleccionado,JComboBox jComboBoxPresuTipoCuentaProyecto,List<PresuTipoCuentaProyecto> presutipocuentaproyectosLocal)throws Exception {
		try {
			PresuTipoCuentaProyecto  presutipocuentaproyectoTemp=null;

			for(PresuTipoCuentaProyecto presutipocuentaproyectoAux:presutipocuentaproyectosLocal) {
				if(presutipocuentaproyectoAux.getId()!=null && presutipocuentaproyectoAux.getId().equals(idPresuTipoCuentaProyectoSeleccionado)) {
					presutipocuentaproyectoTemp=presutipocuentaproyectoAux;
					break;
				}
			}

			jComboBoxPresuTipoCuentaProyecto.setSelectedItem(presutipocuentaproyectoTemp);

		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("rawtypes")
	public static void setHotKeysComboBoxPresuTipoCuentaProyectoGenerico(JComboBox jComboBoxPresuTipoCuentaProyecto,JInternalFrameBase jInternalFrameBase,String sNombreHotKeyAbstractAction,String sTipoBusqueda)throws Exception {
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
				
				jComboBoxPresuTipoCuentaProyecto.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxPresuTipoCuentaProyecto.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Busqueda"));
				//BUSCAR
				
				
				//ACTUALIZAR
				sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
				keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_ACTUALIZAR");
				
				jComboBoxPresuTipoCuentaProyecto.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxPresuTipoCuentaProyecto.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Update"));
				//ACTUALIZAR
				
				if(sTipoBusqueda.contains("CON_EVENT_CHANGE")) {
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxPresuTipoCuentaProyecto.addFocusListener(new ComboBoxFocusListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
						jComboBoxPresuTipoCuentaProyecto.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));						
					}
					
					/*
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxPresuTipoCuentaProyecto.addItemListener(new ComboBoxItemListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					} else {
						jComboBoxPresuTipoCuentaProyecto.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					}
					*/
				}								
				
				//CON_BUSQUEDA								
				if(sTipoBusqueda.contains("CON_BUSQUEDA")) {
					sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
					keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_BUSQUEDA");
							
					jComboBoxPresuTipoCuentaProyecto.getInputMap().put(keyStrokeControl, sKeyStrokeName);
					jComboBoxPresuTipoCuentaProyecto.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction));
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
			
		} catch (Exception e) {
			FuncionesSwing.manageException2(this, e,logger,PresuTipoCuentaProyectoConstantesFunciones.CLASSNAME);
		}
	}
	
	public String getDescripcionFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		String sDescripcion="";
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			presutipocuentaproyecto=(PresuTipoCuentaProyecto) presutipocuentaproyectoLogic.getPresuTipoCuentaProyectos().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			presutipocuentaproyecto =(PresuTipoCuentaProyecto) presutipocuentaproyectos.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		if(sTipo.equals("Empresa")) {
			//sDescripcion=this.getActualEmpresaForeignKeyDescripcion((Long)value);
			if(!presutipocuentaproyecto.getIsNew() && !presutipocuentaproyecto.getIsChanged() && !presutipocuentaproyecto.getIsDeleted()) {
				sDescripcion=presutipocuentaproyecto.getempresa_descripcion();
			} else {
				//sDescripcion=this.getActualEmpresaForeignKeyDescripcion((Long)value);
				sDescripcion=presutipocuentaproyecto.getempresa_descripcion();
			}
		}

		
		return sDescripcion;
	}
	
	public Color getColorFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		Color color=Color.WHITE;
		
		PresuTipoCuentaProyecto presutipocuentaproyectoRow=new PresuTipoCuentaProyecto();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			presutipocuentaproyectoRow=(PresuTipoCuentaProyecto) presutipocuentaproyectoLogic.getPresuTipoCuentaProyectos().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			presutipocuentaproyectoRow=(PresuTipoCuentaProyecto) presutipocuentaproyectos.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		
		return color;
	}
	
	
	
	
	
	
	
	public void refrescarBindingTabla(Boolean blnSoloTabla) {
	}
	
	public void inicializarActualizarBindingBotonesManualPresuTipoCuentaProyecto(Boolean esSetControles) {						
		if(esSetControles) {
			this.jButtonNuevoPresuTipoCuentaProyecto.setVisible((this.isVisibilidadCeldaNuevoPresuTipoCuentaProyecto && this.isPermisoNuevoPresuTipoCuentaProyecto));			
			this.jButtonDuplicarPresuTipoCuentaProyecto.setVisible((this.isVisibilidadCeldaDuplicarPresuTipoCuentaProyecto && this.isPermisoDuplicarPresuTipoCuentaProyecto));			
			this.jButtonCopiarPresuTipoCuentaProyecto.setVisible((this.isVisibilidadCeldaCopiarPresuTipoCuentaProyecto && this.isPermisoCopiarPresuTipoCuentaProyecto));
			this.jButtonVerFormPresuTipoCuentaProyecto.setVisible((this.isVisibilidadCeldaVerFormPresuTipoCuentaProyecto && this.isPermisoVerFormPresuTipoCuentaProyecto));
			
			this.jButtonAbrirOrderByPresuTipoCuentaProyecto.setVisible((this.isVisibilidadCeldaOrdenPresuTipoCuentaProyecto && this.isPermisoOrdenPresuTipoCuentaProyecto));			
			
			this.jButtonNuevoRelacionesPresuTipoCuentaProyecto.setVisible((this.isVisibilidadCeldaNuevoRelacionesPresuTipoCuentaProyecto && this.isPermisoNuevoPresuTipoCuentaProyecto));			
			this.jButtonNuevoGuardarCambiosPresuTipoCuentaProyecto.setVisible((this.isVisibilidadCeldaNuevoPresuTipoCuentaProyecto && this.isPermisoNuevoPresuTipoCuentaProyecto && this.isPermisoGuardarCambiosPresuTipoCuentaProyecto));
			
			if(this.jInternalFrameDetalleFormPresuTipoCuentaProyecto!=null) {
			this.jInternalFrameDetalleFormPresuTipoCuentaProyecto.jButtonModificarPresuTipoCuentaProyecto.setVisible((this.isVisibilidadCeldaModificarPresuTipoCuentaProyecto && this.isPermisoActualizarPresuTipoCuentaProyecto));	
			this.jInternalFrameDetalleFormPresuTipoCuentaProyecto.jButtonActualizarPresuTipoCuentaProyecto.setVisible((this.isVisibilidadCeldaActualizarPresuTipoCuentaProyecto && this.isPermisoActualizarPresuTipoCuentaProyecto));	
			this.jInternalFrameDetalleFormPresuTipoCuentaProyecto.jButtonEliminarPresuTipoCuentaProyecto.setVisible((this.isVisibilidadCeldaEliminarPresuTipoCuentaProyecto && this.isPermisoEliminarPresuTipoCuentaProyecto));
			this.jInternalFrameDetalleFormPresuTipoCuentaProyecto.jButtonCancelarPresuTipoCuentaProyecto.setVisible(this.isVisibilidadCeldaCancelarPresuTipoCuentaProyecto);							
			this.jInternalFrameDetalleFormPresuTipoCuentaProyecto.jButtonGuardarCambiosPresuTipoCuentaProyecto.setVisible((this.isVisibilidadCeldaGuardarPresuTipoCuentaProyecto && this.isPermisoGuardarCambiosPresuTipoCuentaProyecto));			
			
			}
						
			this.jButtonGuardarCambiosTablaPresuTipoCuentaProyecto.setVisible((this.isVisibilidadCeldaGuardarCambiosPresuTipoCuentaProyecto && this.isPermisoGuardarCambiosPresuTipoCuentaProyecto));							
			
			//TOOLBAR
			
			this.jButtonNuevoToolBarPresuTipoCuentaProyecto.setVisible((this.isVisibilidadCeldaNuevoPresuTipoCuentaProyecto && this.isPermisoNuevoPresuTipoCuentaProyecto));						
			this.jButtonDuplicarToolBarPresuTipoCuentaProyecto.setVisible((this.isVisibilidadCeldaDuplicarPresuTipoCuentaProyecto && this.isPermisoDuplicarPresuTipoCuentaProyecto));						
			this.jButtonCopiarToolBarPresuTipoCuentaProyecto.setVisible((this.isVisibilidadCeldaCopiarPresuTipoCuentaProyecto && this.isPermisoCopiarPresuTipoCuentaProyecto));			
			this.jButtonVerFormToolBarPresuTipoCuentaProyecto.setVisible((this.isVisibilidadCeldaVerFormPresuTipoCuentaProyecto && this.isPermisoVerFormPresuTipoCuentaProyecto));			
			this.jButtonAbrirOrderByToolBarPresuTipoCuentaProyecto.setVisible((this.isVisibilidadCeldaOrdenPresuTipoCuentaProyecto && this.isPermisoOrdenPresuTipoCuentaProyecto));
			this.jButtonNuevoRelacionesToolBarPresuTipoCuentaProyecto.setVisible((this.isVisibilidadCeldaNuevoRelacionesPresuTipoCuentaProyecto && this.isPermisoNuevoPresuTipoCuentaProyecto));			
			this.jButtonNuevoGuardarCambiosToolBarPresuTipoCuentaProyecto.setVisible((this.isVisibilidadCeldaNuevoPresuTipoCuentaProyecto && this.isPermisoNuevoPresuTipoCuentaProyecto && this.isPermisoGuardarCambiosPresuTipoCuentaProyecto));			
			
			if(this.jInternalFrameDetalleFormPresuTipoCuentaProyecto!=null) {
			this.jInternalFrameDetalleFormPresuTipoCuentaProyecto.jButtonModificarToolBarPresuTipoCuentaProyecto.setVisible((this.isVisibilidadCeldaModificarPresuTipoCuentaProyecto && this.isPermisoActualizarPresuTipoCuentaProyecto));	
			this.jInternalFrameDetalleFormPresuTipoCuentaProyecto.jButtonActualizarToolBarPresuTipoCuentaProyecto.setVisible((this.isVisibilidadCeldaActualizarPresuTipoCuentaProyecto  && this.isPermisoActualizarPresuTipoCuentaProyecto));	
			this.jInternalFrameDetalleFormPresuTipoCuentaProyecto.jButtonEliminarToolBarPresuTipoCuentaProyecto.setVisible((this.isVisibilidadCeldaEliminarPresuTipoCuentaProyecto && this.isPermisoEliminarPresuTipoCuentaProyecto));
			this.jInternalFrameDetalleFormPresuTipoCuentaProyecto.jButtonCancelarToolBarPresuTipoCuentaProyecto.setVisible(this.isVisibilidadCeldaCancelarPresuTipoCuentaProyecto);				
			this.jInternalFrameDetalleFormPresuTipoCuentaProyecto.jButtonGuardarCambiosToolBarPresuTipoCuentaProyecto.setVisible((this.isVisibilidadCeldaGuardarPresuTipoCuentaProyecto && this.isPermisoGuardarCambiosPresuTipoCuentaProyecto));									
			}
			
			this.jButtonGuardarCambiosTablaToolBarPresuTipoCuentaProyecto.setVisible((this.isVisibilidadCeldaGuardarCambiosPresuTipoCuentaProyecto && this.isPermisoGuardarCambiosPresuTipoCuentaProyecto));									
			
			//TOOLBAR
			
			//MENUS
			
			this.jMenuItemNuevoPresuTipoCuentaProyecto.setVisible((this.isVisibilidadCeldaNuevoPresuTipoCuentaProyecto && this.isPermisoNuevoPresuTipoCuentaProyecto));			
			this.jMenuItemDuplicarPresuTipoCuentaProyecto.setVisible((this.isVisibilidadCeldaDuplicarPresuTipoCuentaProyecto && this.isPermisoDuplicarPresuTipoCuentaProyecto));			
			this.jMenuItemCopiarPresuTipoCuentaProyecto.setVisible((this.isVisibilidadCeldaCopiarPresuTipoCuentaProyecto && this.isPermisoCopiarPresuTipoCuentaProyecto));			
			this.jMenuItemVerFormPresuTipoCuentaProyecto.setVisible((this.isVisibilidadCeldaVerFormPresuTipoCuentaProyecto && this.isPermisoVerFormPresuTipoCuentaProyecto));			
			this.jMenuItemAbrirOrderByPresuTipoCuentaProyecto.setVisible((this.isVisibilidadCeldaOrdenPresuTipoCuentaProyecto && this.isPermisoOrdenPresuTipoCuentaProyecto));			
			//this.jMenuItemMostrarOcultarPresuTipoCuentaProyecto.setVisible((this.isVisibilidadCeldaOrdenPresuTipoCuentaProyecto && this.isPermisoOrdenPresuTipoCuentaProyecto));
			this.jMenuItemDetalleAbrirOrderByPresuTipoCuentaProyecto.setVisible((this.isVisibilidadCeldaOrdenPresuTipoCuentaProyecto && this.isPermisoOrdenPresuTipoCuentaProyecto));			
			//this.jMenuItemDetalleMostrarOcultarPresuTipoCuentaProyecto.setVisible((this.isVisibilidadCeldaOrdenPresuTipoCuentaProyecto && this.isPermisoOrdenPresuTipoCuentaProyecto));			
			this.jMenuItemNuevoRelacionesPresuTipoCuentaProyecto.setVisible((this.isVisibilidadCeldaNuevoRelacionesPresuTipoCuentaProyecto && this.isPermisoNuevoPresuTipoCuentaProyecto));			
			this.jMenuItemNuevoGuardarCambiosPresuTipoCuentaProyecto.setVisible((this.isVisibilidadCeldaNuevoPresuTipoCuentaProyecto && this.isPermisoNuevoPresuTipoCuentaProyecto && this.isPermisoGuardarCambiosPresuTipoCuentaProyecto));									
			
			if(this.jInternalFrameDetalleFormPresuTipoCuentaProyecto!=null) {
			this.jInternalFrameDetalleFormPresuTipoCuentaProyecto.jMenuItemModificarPresuTipoCuentaProyecto.setVisible((this.isVisibilidadCeldaModificarPresuTipoCuentaProyecto && this.isPermisoActualizarPresuTipoCuentaProyecto));	
			this.jInternalFrameDetalleFormPresuTipoCuentaProyecto.jMenuItemActualizarPresuTipoCuentaProyecto.setVisible((this.isVisibilidadCeldaActualizarPresuTipoCuentaProyecto && this.isPermisoActualizarPresuTipoCuentaProyecto));	
			this.jInternalFrameDetalleFormPresuTipoCuentaProyecto.jMenuItemEliminarPresuTipoCuentaProyecto.setVisible((this.isVisibilidadCeldaEliminarPresuTipoCuentaProyecto && this.isPermisoEliminarPresuTipoCuentaProyecto));
			this.jInternalFrameDetalleFormPresuTipoCuentaProyecto.jMenuItemCancelarPresuTipoCuentaProyecto.setVisible(this.isVisibilidadCeldaCancelarPresuTipoCuentaProyecto);				
			}
			
			this.jMenuItemGuardarCambiosPresuTipoCuentaProyecto.setVisible((this.isVisibilidadCeldaGuardarPresuTipoCuentaProyecto && this.isPermisoGuardarCambiosPresuTipoCuentaProyecto));						
			this.jMenuItemGuardarCambiosTablaPresuTipoCuentaProyecto.setVisible((this.isVisibilidadCeldaGuardarCambiosPresuTipoCuentaProyecto && this.isPermisoGuardarCambiosPresuTipoCuentaProyecto));						
			
			//MENUS
			
		} else {
			this.isVisibilidadCeldaNuevoPresuTipoCuentaProyecto=this.jButtonNuevoPresuTipoCuentaProyecto.isVisible();
			this.isVisibilidadCeldaDuplicarPresuTipoCuentaProyecto=this.jButtonDuplicarPresuTipoCuentaProyecto.isVisible();
			this.isVisibilidadCeldaCopiarPresuTipoCuentaProyecto=this.jButtonCopiarPresuTipoCuentaProyecto.isVisible();
			this.isVisibilidadCeldaVerFormPresuTipoCuentaProyecto=this.jButtonVerFormPresuTipoCuentaProyecto.isVisible();
			
			this.isVisibilidadCeldaOrdenPresuTipoCuentaProyecto=this.jButtonAbrirOrderByPresuTipoCuentaProyecto.isVisible();			
			
			this.isVisibilidadCeldaNuevoRelacionesPresuTipoCuentaProyecto=this.jButtonNuevoRelacionesPresuTipoCuentaProyecto.isVisible();
			this.isVisibilidadCeldaModificarPresuTipoCuentaProyecto=this.jButtonModificarPresuTipoCuentaProyecto.isVisible();
			
			if(this.jInternalFrameDetalleFormPresuTipoCuentaProyecto!=null) {
			this.isVisibilidadCeldaActualizarPresuTipoCuentaProyecto=this.jInternalFrameDetalleFormPresuTipoCuentaProyecto.jButtonActualizarPresuTipoCuentaProyecto.isVisible();
			this.isVisibilidadCeldaEliminarPresuTipoCuentaProyecto=this.jInternalFrameDetalleFormPresuTipoCuentaProyecto.jButtonEliminarPresuTipoCuentaProyecto.isVisible();
			this.isVisibilidadCeldaCancelarPresuTipoCuentaProyecto=this.jInternalFrameDetalleFormPresuTipoCuentaProyecto.jButtonCancelarPresuTipoCuentaProyecto.isVisible();
			this.isVisibilidadCeldaGuardarPresuTipoCuentaProyecto=this.jInternalFrameDetalleFormPresuTipoCuentaProyecto.jButtonGuardarCambiosPresuTipoCuentaProyecto.isVisible();			
			}
			
			this.isVisibilidadCeldaGuardarCambiosPresuTipoCuentaProyecto=this.jButtonGuardarCambiosTablaPresuTipoCuentaProyecto.isVisible();
			
			//TOOLBAR
			
			this.isVisibilidadCeldaNuevoPresuTipoCuentaProyecto=this.jButtonNuevoToolBarPresuTipoCuentaProyecto.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesPresuTipoCuentaProyecto=this.jButtonNuevoRelacionesToolBarPresuTipoCuentaProyecto.isVisible();
			
			if(this.jInternalFrameDetalleFormPresuTipoCuentaProyecto!=null) {
			this.isVisibilidadCeldaModificarPresuTipoCuentaProyecto=this.jInternalFrameDetalleFormPresuTipoCuentaProyecto.jButtonModificarToolBarPresuTipoCuentaProyecto.isVisible();
			this.isVisibilidadCeldaActualizarPresuTipoCuentaProyecto=this.jInternalFrameDetalleFormPresuTipoCuentaProyecto.jButtonActualizarToolBarPresuTipoCuentaProyecto.isVisible();
			this.isVisibilidadCeldaEliminarPresuTipoCuentaProyecto=this.jInternalFrameDetalleFormPresuTipoCuentaProyecto.jButtonEliminarToolBarPresuTipoCuentaProyecto.isVisible();
			this.isVisibilidadCeldaCancelarPresuTipoCuentaProyecto=this.jInternalFrameDetalleFormPresuTipoCuentaProyecto.jButtonCancelarToolBarPresuTipoCuentaProyecto.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarPresuTipoCuentaProyecto=this.jButtonGuardarCambiosToolBarPresuTipoCuentaProyecto.isVisible();
			this.isVisibilidadCeldaGuardarCambiosPresuTipoCuentaProyecto=this.jButtonGuardarCambiosTablaToolBarPresuTipoCuentaProyecto.isVisible();						
			
			//TOOLBAR
			
			//MENUS
			
			this.isVisibilidadCeldaNuevoPresuTipoCuentaProyecto=this.jMenuItemNuevoPresuTipoCuentaProyecto.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesPresuTipoCuentaProyecto=this.jMenuItemNuevoRelacionesPresuTipoCuentaProyecto.isVisible();
			
			if(this.jInternalFrameDetalleFormPresuTipoCuentaProyecto!=null) {
			this.isVisibilidadCeldaModificarPresuTipoCuentaProyecto=this.jInternalFrameDetalleFormPresuTipoCuentaProyecto.jMenuItemModificarPresuTipoCuentaProyecto.isVisible();
			this.isVisibilidadCeldaActualizarPresuTipoCuentaProyecto=this.jInternalFrameDetalleFormPresuTipoCuentaProyecto.jMenuItemActualizarPresuTipoCuentaProyecto.isVisible();
			this.isVisibilidadCeldaEliminarPresuTipoCuentaProyecto=this.jInternalFrameDetalleFormPresuTipoCuentaProyecto.jMenuItemEliminarPresuTipoCuentaProyecto.isVisible();
			this.isVisibilidadCeldaCancelarPresuTipoCuentaProyecto=this.jInternalFrameDetalleFormPresuTipoCuentaProyecto.jMenuItemCancelarPresuTipoCuentaProyecto.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarPresuTipoCuentaProyecto=this.jMenuItemGuardarCambiosPresuTipoCuentaProyecto.isVisible();
			this.isVisibilidadCeldaGuardarCambiosPresuTipoCuentaProyecto=this.jMenuItemGuardarCambiosTablaPresuTipoCuentaProyecto.isVisible();						
			
			//MENUS
		}
	}
	
	public void inicializarActualizarBindingBotonesPresuTipoCuentaProyecto(Boolean esInicializar) {
		if(PresuTipoCuentaProyectoJInternalFrame.ISBINDING_MANUAL) {			
			if(this.presutipocuentaproyectoSessionBean.getConGuardarRelaciones()) {
				//if(this.presutipocuentaproyectoSessionBean.getEsGuardarRelacionado()) {
				
				this.actualizarEstadoCeldasBotonesConGuardarRelacionesPresuTipoCuentaProyecto();
			}
			
			this.inicializarActualizarBindingBotonesManualPresuTipoCuentaProyecto(true);
			
		} else {	
		}
	}		
	
	public void inicializarActualizarBindingBotonesPermisosManualPresuTipoCuentaProyecto() {
		this.jButtonNuevoPresuTipoCuentaProyecto.setVisible(this.isPermisoNuevoPresuTipoCuentaProyecto);			
		this.jButtonDuplicarPresuTipoCuentaProyecto.setVisible(this.isPermisoDuplicarPresuTipoCuentaProyecto);			
		this.jButtonCopiarPresuTipoCuentaProyecto.setVisible(this.isPermisoCopiarPresuTipoCuentaProyecto);			
		this.jButtonVerFormPresuTipoCuentaProyecto.setVisible(this.isPermisoVerFormPresuTipoCuentaProyecto);			
		
		this.jButtonAbrirOrderByPresuTipoCuentaProyecto.setVisible(this.isPermisoOrdenPresuTipoCuentaProyecto);					
		
		this.jButtonNuevoRelacionesPresuTipoCuentaProyecto.setVisible(this.isPermisoNuevoPresuTipoCuentaProyecto);			
		
		if(this.jInternalFrameDetalleFormPresuTipoCuentaProyecto!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormPresuTipoCuentaProyecto.jButtonModificarPresuTipoCuentaProyecto.setVisible(this.isPermisoActualizarPresuTipoCuentaProyecto);	
			this.jInternalFrameDetalleFormPresuTipoCuentaProyecto.jButtonActualizarPresuTipoCuentaProyecto.setVisible(this.isPermisoActualizarPresuTipoCuentaProyecto);	
			this.jInternalFrameDetalleFormPresuTipoCuentaProyecto.jButtonEliminarPresuTipoCuentaProyecto.setVisible(this.isPermisoEliminarPresuTipoCuentaProyecto);
			this.jInternalFrameDetalleFormPresuTipoCuentaProyecto.jButtonCancelarPresuTipoCuentaProyecto.setVisible(this.isVisibilidadCeldaCancelarPresuTipoCuentaProyecto);						
			this.jInternalFrameDetalleFormPresuTipoCuentaProyecto.jButtonGuardarCambiosPresuTipoCuentaProyecto.setVisible(this.isPermisoGuardarCambiosPresuTipoCuentaProyecto);							
		}
		
		this.jButtonGuardarCambiosTablaPresuTipoCuentaProyecto.setVisible(this.isPermisoActualizarPresuTipoCuentaProyecto);
	}
	
	public void inicializarActualizarBindingBotonesPermisosManualFormDetallePresuTipoCuentaProyecto() {
		this.jInternalFrameDetalleFormPresuTipoCuentaProyecto.jButtonModificarPresuTipoCuentaProyecto.setVisible(this.isPermisoActualizarPresuTipoCuentaProyecto);	
		this.jInternalFrameDetalleFormPresuTipoCuentaProyecto.jButtonActualizarPresuTipoCuentaProyecto.setVisible(this.isPermisoActualizarPresuTipoCuentaProyecto);	
		this.jInternalFrameDetalleFormPresuTipoCuentaProyecto.jButtonEliminarPresuTipoCuentaProyecto.setVisible(this.isPermisoEliminarPresuTipoCuentaProyecto);
		this.jInternalFrameDetalleFormPresuTipoCuentaProyecto.jButtonCancelarPresuTipoCuentaProyecto.setVisible(this.isVisibilidadCeldaCancelarPresuTipoCuentaProyecto);							
		this.jInternalFrameDetalleFormPresuTipoCuentaProyecto.jButtonGuardarCambiosPresuTipoCuentaProyecto.setVisible((this.isVisibilidadCeldaGuardarPresuTipoCuentaProyecto && this.isPermisoGuardarCambiosPresuTipoCuentaProyecto));			
	}
	
	public void inicializarActualizarBindingBotonesPermisosPresuTipoCuentaProyecto() {
		if(PresuTipoCuentaProyectoJInternalFrame.ISBINDING_MANUAL) {
			this.inicializarActualizarBindingBotonesPermisosManualPresuTipoCuentaProyecto();
		} else {
		}
	}
	
	
	public void refrescarBindingBotonesPresuTipoCuentaProyecto() {
	}
	
	public void jTableDatosPresuTipoCuentaProyectoListSelectionListener(javax.swing.event.ListSelectionEvent evt) throws Exception { 
		try {
			this.seleccionarPresuTipoCuentaProyecto(null,evt,-1);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PresuTipoCuentaProyectoConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonidPresuTipoCuentaProyectoBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.presutipocuentaproyectoLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosPresuTipoCuentaProyecto.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualPresuTipoCuentaProyecto(this.getpresutipocuentaproyecto(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysPresuTipoCuentaProyecto(this.presutipocuentaproyecto);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.presutipocuentaproyecto =(PresuTipoCuentaProyecto) this.presutipocuentaproyectoLogic.getPresuTipoCuentaProyectos().toArray()[this.jTableDatosPresuTipoCuentaProyecto.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.presutipocuentaproyecto =(PresuTipoCuentaProyecto) this.presutipocuentaproyectos.toArray()[this.jTableDatosPresuTipoCuentaProyecto.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.presutipocuentaproyecto==null) {
						this.presutipocuentaproyecto = new PresuTipoCuentaProyecto();
					}

					this.setVariablesFormularioToObjetoActualPresuTipoCuentaProyecto(this.presutipocuentaproyecto,true);
					this.setVariablesFormularioToObjetoActualForeignKeysPresuTipoCuentaProyecto(this.presutipocuentaproyecto);
				}

				if(this.presutipocuentaproyecto.getId()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id = "+this.presutipocuentaproyecto.getId().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingPresuTipoCuentaProyecto(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.presutipocuentaproyectoLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.presutipocuentaproyectoLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,PresuTipoCuentaProyectoConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.presutipocuentaproyectoLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_empresaPresuTipoCuentaProyectoUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.presutipocuentaproyectoLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisoempresa=true;

			idTienePermisoempresa=this.tienePermisosUsuarioEnPaginaWebPresuTipoCuentaProyecto(EmpresaConstantesFunciones.CLASSNAME);

			if(idTienePermisoempresa) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosPresuTipoCuentaProyecto.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosPresuTipoCuentaProyecto.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosPresuTipoCuentaProyecto.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.presutipocuentaproyecto =(PresuTipoCuentaProyecto) this.presutipocuentaproyectoLogic.getPresuTipoCuentaProyectos().toArray()[this.jTableDatosPresuTipoCuentaProyecto.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.presutipocuentaproyecto =(PresuTipoCuentaProyecto) this.presutipocuentaproyectos.toArray()[this.jTableDatosPresuTipoCuentaProyecto.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualPresuTipoCuentaProyecto(this.getpresutipocuentaproyecto(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysPresuTipoCuentaProyecto(this.presutipocuentaproyecto);

				this.empresaBeanSwingJInternalFrame=new EmpresaBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.empresaBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.empresaBeanSwingJInternalFrame.getEmpresaLogic().setConnexion(this.presutipocuentaproyectoLogic.getConnexion());

				if(this.presutipocuentaproyecto.getid_empresa()!=null) {
					this.empresaBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.empresaBeanSwingJInternalFrame.setIdActual(this.presutipocuentaproyecto.getid_empresa());
					this.empresaBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.empresaBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.empresaBeanSwingJInternalFrame.inicializarActualizarBindingTablaEmpresa();
				}

				JInternalFrameBase jinternalFrame =this.empresaBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderPresuTipoCuentaProyecto=(TitledBorder)this.jScrollPanelDatosPresuTipoCuentaProyecto.getBorder();
				TitledBorder titledBorderempresa=(TitledBorder)this.empresaBeanSwingJInternalFrame.jScrollPanelDatosEmpresa.getBorder();

				titledBorderempresa.setTitle(titledBorderPresuTipoCuentaProyecto.getTitle() + " -> Empresa");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.presutipocuentaproyectoLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.presutipocuentaproyectoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,PresuTipoCuentaProyectoConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.presutipocuentaproyectoLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_empresaPresuTipoCuentaProyectoBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.presutipocuentaproyectoLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosPresuTipoCuentaProyecto.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualPresuTipoCuentaProyecto(this.getpresutipocuentaproyecto(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysPresuTipoCuentaProyecto(this.presutipocuentaproyecto);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.presutipocuentaproyecto =(PresuTipoCuentaProyecto) this.presutipocuentaproyectoLogic.getPresuTipoCuentaProyectos().toArray()[this.jTableDatosPresuTipoCuentaProyecto.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.presutipocuentaproyecto =(PresuTipoCuentaProyecto) this.presutipocuentaproyectos.toArray()[this.jTableDatosPresuTipoCuentaProyecto.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.presutipocuentaproyecto==null) {
						this.presutipocuentaproyecto = new PresuTipoCuentaProyecto();
					}

					this.setVariablesFormularioToObjetoActualPresuTipoCuentaProyecto(this.presutipocuentaproyecto,true);
					this.setVariablesFormularioToObjetoActualForeignKeysPresuTipoCuentaProyecto(this.presutipocuentaproyecto);
				}

				if(this.presutipocuentaproyecto.getid_empresa()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_empresa = "+this.presutipocuentaproyecto.getid_empresa().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingPresuTipoCuentaProyecto(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.presutipocuentaproyectoLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.presutipocuentaproyectoLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,PresuTipoCuentaProyectoConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.presutipocuentaproyectoLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtoncodigoPresuTipoCuentaProyectoBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.presutipocuentaproyectoLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosPresuTipoCuentaProyecto.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualPresuTipoCuentaProyecto(this.getpresutipocuentaproyecto(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysPresuTipoCuentaProyecto(this.presutipocuentaproyecto);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.presutipocuentaproyecto =(PresuTipoCuentaProyecto) this.presutipocuentaproyectoLogic.getPresuTipoCuentaProyectos().toArray()[this.jTableDatosPresuTipoCuentaProyecto.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.presutipocuentaproyecto =(PresuTipoCuentaProyecto) this.presutipocuentaproyectos.toArray()[this.jTableDatosPresuTipoCuentaProyecto.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.presutipocuentaproyecto==null) {
						this.presutipocuentaproyecto = new PresuTipoCuentaProyecto();
					}

					this.setVariablesFormularioToObjetoActualPresuTipoCuentaProyecto(this.presutipocuentaproyecto,true);
					this.setVariablesFormularioToObjetoActualForeignKeysPresuTipoCuentaProyecto(this.presutipocuentaproyecto);
				}

				if(this.presutipocuentaproyecto.getcodigo()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where codigo like '%"+this.presutipocuentaproyecto.getcodigo()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingPresuTipoCuentaProyecto(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.presutipocuentaproyectoLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.presutipocuentaproyectoLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,PresuTipoCuentaProyectoConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.presutipocuentaproyectoLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonnombrePresuTipoCuentaProyectoBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.presutipocuentaproyectoLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosPresuTipoCuentaProyecto.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualPresuTipoCuentaProyecto(this.getpresutipocuentaproyecto(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysPresuTipoCuentaProyecto(this.presutipocuentaproyecto);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.presutipocuentaproyecto =(PresuTipoCuentaProyecto) this.presutipocuentaproyectoLogic.getPresuTipoCuentaProyectos().toArray()[this.jTableDatosPresuTipoCuentaProyecto.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.presutipocuentaproyecto =(PresuTipoCuentaProyecto) this.presutipocuentaproyectos.toArray()[this.jTableDatosPresuTipoCuentaProyecto.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.presutipocuentaproyecto==null) {
						this.presutipocuentaproyecto = new PresuTipoCuentaProyecto();
					}

					this.setVariablesFormularioToObjetoActualPresuTipoCuentaProyecto(this.presutipocuentaproyecto,true);
					this.setVariablesFormularioToObjetoActualForeignKeysPresuTipoCuentaProyecto(this.presutipocuentaproyecto);
				}

				if(this.presutipocuentaproyecto.getnombre()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where nombre like '%"+this.presutipocuentaproyecto.getnombre()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingPresuTipoCuentaProyecto(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.presutipocuentaproyectoLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.presutipocuentaproyectoLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,PresuTipoCuentaProyectoConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.presutipocuentaproyectoLogic.closeNewConnexionToDeep();
				}

			}
		}

	
	
	public void jButtonBusquedaPorCodigoPresuTipoCuentaProyectoActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.presutipocuentaproyectoLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingPresuTipoCuentaProyecto(false,false);

			this.getPresuTipoCuentaProyectosBusquedaPorCodigo();

			this.inicializarActualizarBindingPresuTipoCuentaProyecto(false);

			//if(PresuTipoCuentaProyectoBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingPresuTipoCuentaProyecto(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.presutipocuentaproyectoLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.presutipocuentaproyectoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,PresuTipoCuentaProyectoConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.presutipocuentaproyectoLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonBusquedaPorNombrePresuTipoCuentaProyectoActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.presutipocuentaproyectoLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingPresuTipoCuentaProyecto(false,false);

			this.getPresuTipoCuentaProyectosBusquedaPorNombre();

			this.inicializarActualizarBindingPresuTipoCuentaProyecto(false);

			//if(PresuTipoCuentaProyectoBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingPresuTipoCuentaProyecto(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.presutipocuentaproyectoLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.presutipocuentaproyectoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,PresuTipoCuentaProyectoConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.presutipocuentaproyectoLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdEmpresaPresuTipoCuentaProyectoActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.presutipocuentaproyectoLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingPresuTipoCuentaProyecto(false,false);

			this.getPresuTipoCuentaProyectosFK_IdEmpresa();

			this.inicializarActualizarBindingPresuTipoCuentaProyecto(false);

			//if(PresuTipoCuentaProyectoBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingPresuTipoCuentaProyecto(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.presutipocuentaproyectoLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.presutipocuentaproyectoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,PresuTipoCuentaProyectoConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.presutipocuentaproyectoLogic.closeNewConnexionToDeep();
			}
		}
	}

	
	public void closingInternalFramePresuTipoCuentaProyecto() {
		if(this.jInternalFrameDetalleFormPresuTipoCuentaProyecto!=null) {
			
		
		
		}
		
		if(this.jInternalFrameDetalleFormPresuTipoCuentaProyecto!=null) {
			this.jInternalFrameDetalleFormPresuTipoCuentaProyecto.setVisible(false);	    			
			this.jInternalFrameDetalleFormPresuTipoCuentaProyecto.dispose();
			this.jInternalFrameDetalleFormPresuTipoCuentaProyecto=null;
		}
		
		
		if(this.jInternalFrameReporteDinamicoPresuTipoCuentaProyecto!=null) {
			this.jInternalFrameReporteDinamicoPresuTipoCuentaProyecto.setVisible(false);	    			
			this.jInternalFrameReporteDinamicoPresuTipoCuentaProyecto.dispose();
			this.jInternalFrameReporteDinamicoPresuTipoCuentaProyecto=null;
		}
		
		if(this.jInternalFrameImportacionPresuTipoCuentaProyecto!=null) {
			this.jInternalFrameImportacionPresuTipoCuentaProyecto.setVisible(false);	    			
			this.jInternalFrameImportacionPresuTipoCuentaProyecto.dispose();
			this.jInternalFrameImportacionPresuTipoCuentaProyecto=null;
		}		
		
		
		this.setVisible(false);
		this.dispose();
		//this=null;
	}
	
	
	
	public void jButtonActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {			
			this.startProcessPresuTipoCuentaProyecto();
			
			PresuTipoCuentaProyectoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.presutipocuentaproyecto,new Object(),this.presutipocuentaproyectoParameterGeneral,this.presutipocuentaproyectoReturnGeneral);
			
			
			if(sTipo.equals("NuevoPresuTipoCuentaProyecto")) {
				jButtonNuevoPresuTipoCuentaProyectoActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarPresuTipoCuentaProyecto")) {
				jButtonDuplicarPresuTipoCuentaProyectoActionPerformed(evt,false);
			} else if(sTipo.equals("CopiarPresuTipoCuentaProyecto")) {
				jButtonCopiarPresuTipoCuentaProyectoActionPerformed(evt);
			} else if(sTipo.equals("VerFormPresuTipoCuentaProyecto")) {
				jButtonVerFormPresuTipoCuentaProyectoActionPerformed(evt);
			} else if(sTipo.equals("NuevoToolBarPresuTipoCuentaProyecto")) {
				jButtonNuevoPresuTipoCuentaProyectoActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarToolBarPresuTipoCuentaProyecto")) {
				jButtonDuplicarPresuTipoCuentaProyectoActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemNuevoPresuTipoCuentaProyecto")) {
				jButtonNuevoPresuTipoCuentaProyectoActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemDuplicarPresuTipoCuentaProyecto")) {
				jButtonDuplicarPresuTipoCuentaProyectoActionPerformed(evt,false);
			} else if(sTipo.equals("NuevoRelacionesPresuTipoCuentaProyecto")) {
				jButtonNuevoPresuTipoCuentaProyectoActionPerformed(evt,true);
			} else if(sTipo.equals("NuevoRelacionesToolBarPresuTipoCuentaProyecto")) {
				jButtonNuevoPresuTipoCuentaProyectoActionPerformed(evt,true);
			} else if(sTipo.equals("MenuItemNuevoRelacionesPresuTipoCuentaProyecto")) {
				jButtonNuevoPresuTipoCuentaProyectoActionPerformed(evt,true);
			} else if(sTipo.equals("ModificarPresuTipoCuentaProyecto")) {
				jButtonModificarPresuTipoCuentaProyectoActionPerformed(evt);
			} else if(sTipo.equals("ModificarToolBarPresuTipoCuentaProyecto")) {
				jButtonModificarPresuTipoCuentaProyectoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemModificarPresuTipoCuentaProyecto")) {
				jButtonModificarPresuTipoCuentaProyectoActionPerformed(evt);
			} else if(sTipo.equals("ActualizarPresuTipoCuentaProyecto")) {
				jButtonActualizarPresuTipoCuentaProyectoActionPerformed(evt);
			} else if(sTipo.equals("ActualizarToolBarPresuTipoCuentaProyecto")) {
				jButtonActualizarPresuTipoCuentaProyectoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemActualizarPresuTipoCuentaProyecto")) {
				jButtonActualizarPresuTipoCuentaProyectoActionPerformed(evt);
			} else if(sTipo.equals("EliminarPresuTipoCuentaProyecto")) {
				jButtonEliminarPresuTipoCuentaProyectoActionPerformed(evt);
			} else if(sTipo.equals("EliminarToolBarPresuTipoCuentaProyecto")) {
				jButtonEliminarPresuTipoCuentaProyectoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemEliminarPresuTipoCuentaProyecto")) {
				jButtonEliminarPresuTipoCuentaProyectoActionPerformed(evt);
			} else if(sTipo.equals("CancelarPresuTipoCuentaProyecto")) {
				jButtonCancelarPresuTipoCuentaProyectoActionPerformed(evt);
			} else if(sTipo.equals("CancelarToolBarPresuTipoCuentaProyecto")) {
				jButtonCancelarPresuTipoCuentaProyectoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCancelarPresuTipoCuentaProyecto")) {
				jButtonCancelarPresuTipoCuentaProyectoActionPerformed(evt);
			} else if(sTipo.equals("CerrarPresuTipoCuentaProyecto")) {
				jButtonCerrarPresuTipoCuentaProyectoActionPerformed(evt);
			} else if(sTipo.equals("CerrarToolBarPresuTipoCuentaProyecto")) {
				jButtonCerrarPresuTipoCuentaProyectoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCerrarPresuTipoCuentaProyecto")) {
				jButtonCerrarPresuTipoCuentaProyectoActionPerformed(evt);
			} else if(sTipo.equals("MostrarOcultarToolBarPresuTipoCuentaProyecto")) {
				jButtonMostrarOcultarPresuTipoCuentaProyectoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemDetalleCerrarPresuTipoCuentaProyecto")) {
				jButtonCancelarPresuTipoCuentaProyectoActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosPresuTipoCuentaProyecto")) {
				jButtonGuardarCambiosPresuTipoCuentaProyectoActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosToolBarPresuTipoCuentaProyecto")) {
				jButtonGuardarCambiosPresuTipoCuentaProyectoActionPerformed(evt);
			} else if(sTipo.equals("CopiarToolBarPresuTipoCuentaProyecto")) {
				jButtonCopiarPresuTipoCuentaProyectoActionPerformed(evt);
			} else if(sTipo.equals("VerFormToolBarPresuTipoCuentaProyecto")) {
				jButtonVerFormPresuTipoCuentaProyectoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosPresuTipoCuentaProyecto")) {
				jButtonGuardarCambiosPresuTipoCuentaProyectoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCopiarPresuTipoCuentaProyecto")) {
				jButtonCopiarPresuTipoCuentaProyectoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemVerFormPresuTipoCuentaProyecto")) {
				jButtonVerFormPresuTipoCuentaProyectoActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaPresuTipoCuentaProyecto")) {
				jButtonGuardarCambiosPresuTipoCuentaProyectoActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaToolBarPresuTipoCuentaProyecto")) {
				jButtonGuardarCambiosPresuTipoCuentaProyectoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosTablaPresuTipoCuentaProyecto")) {
				jButtonGuardarCambiosPresuTipoCuentaProyectoActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionPresuTipoCuentaProyecto")) {
				jButtonRecargarInformacionPresuTipoCuentaProyectoActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionToolBarPresuTipoCuentaProyecto")) {
				jButtonRecargarInformacionPresuTipoCuentaProyectoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemRecargarInformacionPresuTipoCuentaProyecto")) {
				jButtonRecargarInformacionPresuTipoCuentaProyectoActionPerformed(evt);
			}
			else if(sTipo.equals("AnterioresPresuTipoCuentaProyecto")) {
				jButtonAnterioresPresuTipoCuentaProyectoActionPerformed(evt);
			} else if(sTipo.equals("AnterioresToolBarPresuTipoCuentaProyecto")) {
				jButtonAnterioresPresuTipoCuentaProyectoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAnteriorePresuTipoCuentaProyecto")) {
				jButtonAnterioresPresuTipoCuentaProyectoActionPerformed(evt);
			} else if(sTipo.equals("SiguientesPresuTipoCuentaProyecto")) {
				jButtonSiguientesPresuTipoCuentaProyectoActionPerformed(evt);
			} else if(sTipo.equals("SiguientesToolBarPresuTipoCuentaProyecto")) {
				jButtonSiguientesPresuTipoCuentaProyectoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemSiguientesPresuTipoCuentaProyecto")) {
				jButtonSiguientesPresuTipoCuentaProyectoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAbrirOrderByPresuTipoCuentaProyecto") || sTipo.equals("MenuItemDetalleAbrirOrderByPresuTipoCuentaProyecto")) {
				jButtonAbrirOrderByPresuTipoCuentaProyectoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemMostrarOcultarPresuTipoCuentaProyecto") || sTipo.equals("MenuItemDetalleMostrarOcultarPresuTipoCuentaProyecto")) {
				jButtonMostrarOcultarPresuTipoCuentaProyectoActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosPresuTipoCuentaProyecto")) {
				jButtonNuevoGuardarCambiosPresuTipoCuentaProyectoActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosToolBarPresuTipoCuentaProyecto")) {
				jButtonNuevoGuardarCambiosPresuTipoCuentaProyectoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemNuevoGuardarCambiosPresuTipoCuentaProyecto")) {
				jButtonNuevoGuardarCambiosPresuTipoCuentaProyectoActionPerformed(evt);
			} 
			else if(sTipo.equals("CerrarReporteDinamicoPresuTipoCuentaProyecto")) {
				jButtonCerrarReporteDinamicoPresuTipoCuentaProyectoActionPerformed(evt);
			} else if(sTipo.equals("GenerarReporteDinamicoPresuTipoCuentaProyecto")) {
				jButtonGenerarReporteDinamicoPresuTipoCuentaProyectoActionPerformed(evt);
			} else if(sTipo.equals("GenerarExcelReporteDinamicoPresuTipoCuentaProyecto")) {
				
				jButtonGenerarExcelReporteDinamicoPresuTipoCuentaProyectoActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarImportacionPresuTipoCuentaProyecto")) {
				jButtonCerrarImportacionPresuTipoCuentaProyectoActionPerformed(evt);
			} else if(sTipo.equals("GenerarImportacionPresuTipoCuentaProyecto")) {
				
				jButtonGenerarImportacionPresuTipoCuentaProyectoActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirImportacionPresuTipoCuentaProyecto")) {
				
				jButtonAbrirImportacionPresuTipoCuentaProyectoActionPerformed(evt);
				
			} else if(sTipo.equals("TiposAccionesPresuTipoCuentaProyecto")) {
				jComboBoxTiposAccionesPresuTipoCuentaProyectoActionListener(evt,false);
			} else if(sTipo.equals("TiposRelacionesPresuTipoCuentaProyecto")) {
				jComboBoxTiposRelacionesPresuTipoCuentaProyectoActionListener(evt);
			} else if(sTipo.equals("TiposAccionesFormularioPresuTipoCuentaProyecto")) {
				jComboBoxTiposAccionesPresuTipoCuentaProyectoActionListener(evt,true);
			} else if(sTipo.equals("TiposSeleccionarPresuTipoCuentaProyecto")) {
				
				jComboBoxTiposSeleccionarPresuTipoCuentaProyectoActionListener(evt);
				
			} else if(sTipo.equals("ValorCampoGeneralPresuTipoCuentaProyecto")) {
				jTextFieldValorCampoGeneralPresuTipoCuentaProyectoActionListener(evt);
			}
			
			
			else if(sTipo.equals("AbrirOrderByPresuTipoCuentaProyecto")) {
				jButtonAbrirOrderByPresuTipoCuentaProyectoActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirOrderByToolBarPresuTipoCuentaProyecto")) {
				jButtonAbrirOrderByPresuTipoCuentaProyectoActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarOrderByPresuTipoCuentaProyecto")) {
				jButtonCerrarOrderByPresuTipoCuentaProyectoActionPerformed(evt);
			} 
						
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idPresuTipoCuentaProyectoBusqueda")) {
				this.jButtonidPresuTipoCuentaProyectoBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_empresaPresuTipoCuentaProyectoUpdate")) {
				this.jButtonid_empresaPresuTipoCuentaProyectoUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_empresaPresuTipoCuentaProyectoBusqueda")) {
				this.jButtonid_empresaPresuTipoCuentaProyectoBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("codigoPresuTipoCuentaProyectoBusqueda")) {
				this.jButtoncodigoPresuTipoCuentaProyectoBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombrePresuTipoCuentaProyectoBusqueda")) {
				this.jButtonnombrePresuTipoCuentaProyectoBusquedaActionPerformed(evt);
			}
			
			
			
			
			else if(sTipo.equals("BusquedaPorCodigoPresuTipoCuentaProyecto")) {
				this.jButtonBusquedaPorCodigoPresuTipoCuentaProyectoActionPerformed(evt);
			}
			else if(sTipo.equals("BusquedaPorNombrePresuTipoCuentaProyecto")) {
				this.jButtonBusquedaPorNombrePresuTipoCuentaProyectoActionPerformed(evt);
			}
			
			;
			
			
			PresuTipoCuentaProyectoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.presutipocuentaproyecto,new Object(),this.presutipocuentaproyectoParameterGeneral,this.presutipocuentaproyectoReturnGeneral);
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PresuTipoCuentaProyectoConstantesFunciones.CLASSNAME);
			
  		} finally {
      		this.finishProcessPresuTipoCuentaProyecto();
      	}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaPresuTipoCuentaProyectoActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.presutipocuentaproyecto);
				
				this.actualizarInformacion("INFO_PADRE",false,this.presutipocuentaproyecto);
				
				PresuTipoCuentaProyectoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.presutipocuentaproyecto,new Object(),this.presutipocuentaproyectoParameterGeneral,this.presutipocuentaproyectoReturnGeneral);
				
				


				
				PresuTipoCuentaProyectoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.presutipocuentaproyecto,new Object(),this.presutipocuentaproyectoParameterGeneral,this.presutipocuentaproyectoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(PresuTipoCuentaProyecto.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",PresuTipoCuentaProyecto.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
				}
				
			} catch(Exception e) {
  				FuncionesSwing.manageException2(this, e,logger,PresuTipoCuentaProyectoConstantesFunciones.CLASSNAME);
  			}
    }
	
	public Boolean existeCambioValor(ControlTipo controlTipo,String sTipo) throws Exception {
		Boolean existeCambio=true;
		
		try {
			PresuTipoCuentaProyecto presutipocuentaproyectoLocal=null;
			
			if(!this.getEsControlTabla()) {
				presutipocuentaproyectoLocal=this.presutipocuentaproyecto;
			} else {
				presutipocuentaproyectoLocal=this.presutipocuentaproyectoAnterior;
			}
			
			if(controlTipo.equals(ControlTipo.TEXTBOX)) {
				


			}
		
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PresuTipoCuentaProyectoConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.presutipocuentaproyecto);
				
				this.actualizarInformacion("INFO_PADRE",false,this.presutipocuentaproyecto);
				
				PresuTipoCuentaProyectoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.presutipocuentaproyecto,new Object(),this.presutipocuentaproyectoParameterGeneral,this.presutipocuentaproyectoReturnGeneral);
							
				
				


				
				PresuTipoCuentaProyectoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.presutipocuentaproyecto,new Object(),this.presutipocuentaproyectoParameterGeneral,this.presutipocuentaproyectoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(PresuTipoCuentaProyecto.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",PresuTipoCuentaProyecto.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PresuTipoCuentaProyectoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaPresuTipoCuentaProyectoActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosPresuTipoCuentaProyecto.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.presutipocuentaproyectoAnterior =(PresuTipoCuentaProyecto) this.presutipocuentaproyectoLogic.getPresuTipoCuentaProyectos().toArray()[this.jTableDatosPresuTipoCuentaProyecto.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.presutipocuentaproyectoAnterior =(PresuTipoCuentaProyecto) this.presutipocuentaproyectos.toArray()[this.jTableDatosPresuTipoCuentaProyecto.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PresuTipoCuentaProyectoConstantesFunciones.CLASSNAME);
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
			
			PresuTipoCuentaProyectoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.presutipocuentaproyecto,new Object(),this.presutipocuentaproyectoParameterGeneral,this.presutipocuentaproyectoReturnGeneral);
			
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
			
			


			
			PresuTipoCuentaProyectoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.presutipocuentaproyecto,new Object(),this.presutipocuentaproyectoParameterGeneral,this.presutipocuentaproyectoReturnGeneral);
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PresuTipoCuentaProyectoConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE QUITA ALGUN CARACTER
	public void jTextFieldRemoveUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PresuTipoCuentaProyectoConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE INGRESA ALGUN CARACTER
	public void jTextFieldInsertUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PresuTipoCuentaProyectoConstantesFunciones.CLASSNAME);
  		}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jFormattedTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaPresuTipoCuentaProyectoActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.presutipocuentaproyecto);
				
				this.actualizarInformacion("INFO_PADRE",false,this.presutipocuentaproyecto);
				
				PresuTipoCuentaProyectoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.presutipocuentaproyecto,new Object(),this.presutipocuentaproyectoParameterGeneral,this.presutipocuentaproyectoReturnGeneral);
								
						
				


				
				PresuTipoCuentaProyectoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.presutipocuentaproyecto,new Object(),this.presutipocuentaproyectoParameterGeneral,this.presutipocuentaproyectoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(PresuTipoCuentaProyecto.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",PresuTipoCuentaProyecto.class.getName(),sTipo,"DATE",esControlTabla,conIrServidorAplicacionParent,
							id,JFormattedTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PresuTipoCuentaProyectoConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.presutipocuentaproyecto);
				
				this.actualizarInformacion("INFO_PADRE",false,this.presutipocuentaproyecto);
				
				PresuTipoCuentaProyectoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.presutipocuentaproyecto,new Object(),this.presutipocuentaproyectoParameterGeneral,this.presutipocuentaproyectoReturnGeneral);
								
				
				


				
				PresuTipoCuentaProyectoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.presutipocuentaproyecto,new Object(),this.presutipocuentaproyectoParameterGeneral,this.presutipocuentaproyectoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(PresuTipoCuentaProyecto.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",PresuTipoCuentaProyecto.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PresuTipoCuentaProyectoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jFormattedTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaPresuTipoCuentaProyectoActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosPresuTipoCuentaProyecto.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.presutipocuentaproyectoAnterior =(PresuTipoCuentaProyecto) this.presutipocuentaproyectoLogic.getPresuTipoCuentaProyectos().toArray()[this.jTableDatosPresuTipoCuentaProyecto.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.presutipocuentaproyectoAnterior =(PresuTipoCuentaProyecto) this.presutipocuentaproyectos.toArray()[this.jTableDatosPresuTipoCuentaProyecto.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PresuTipoCuentaProyectoConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusLostGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl() && this.existeCambioValor(ControlTipo.DATE,sTipo)) {
				this.actualizarInformacion("EVENTO_CONTROL",false,this.presutipocuentaproyecto);
				
				this.actualizarInformacion("INFO_PADRE",false,this.presutipocuentaproyecto);
			}	
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PresuTipoCuentaProyectoConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaPresuTipoCuentaProyectoActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosPresuTipoCuentaProyecto.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.presutipocuentaproyectoAnterior =(PresuTipoCuentaProyecto) this.presutipocuentaproyectoLogic.getPresuTipoCuentaProyectos().toArray()[this.jTableDatosPresuTipoCuentaProyecto.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.presutipocuentaproyectoAnterior =(PresuTipoCuentaProyecto) this.presutipocuentaproyectos.toArray()[this.jTableDatosPresuTipoCuentaProyecto.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PresuTipoCuentaProyectoConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaPresuTipoCuentaProyectoActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.presutipocuentaproyecto);
			
			this.actualizarInformacion("INFO_PADRE",false,this.presutipocuentaproyecto);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PresuTipoCuentaProyectoConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.presutipocuentaproyecto);
				
				this.actualizarInformacion("INFO_PADRE",false,this.presutipocuentaproyecto);
				
				PresuTipoCuentaProyectoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.presutipocuentaproyecto,new Object(),this.presutipocuentaproyectoParameterGeneral,this.presutipocuentaproyectoReturnGeneral);
							
				
				


				
				PresuTipoCuentaProyectoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.presutipocuentaproyecto,new Object(),this.presutipocuentaproyectoParameterGeneral,this.presutipocuentaproyectoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(PresuTipoCuentaProyecto.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",PresuTipoCuentaProyecto.class.getName(),sTipo,"TEXTAREA",esControlTabla,conIrServidorAplicacionParent,
							id,jTextArea, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PresuTipoCuentaProyectoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaPresuTipoCuentaProyectoActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosPresuTipoCuentaProyecto.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.presutipocuentaproyectoAnterior =(PresuTipoCuentaProyecto) this.presutipocuentaproyectoLogic.getPresuTipoCuentaProyectos().toArray()[this.jTableDatosPresuTipoCuentaProyecto.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.presutipocuentaproyectoAnterior =(PresuTipoCuentaProyecto) this.presutipocuentaproyectos.toArray()[this.jTableDatosPresuTipoCuentaProyecto.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PresuTipoCuentaProyectoConstantesFunciones.CLASSNAME);
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
			
			PresuTipoCuentaProyectoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.presutipocuentaproyecto,new Object(),this.presutipocuentaproyectoParameterGeneral,this.presutipocuentaproyectoReturnGeneral);
			
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
			
			


			
			PresuTipoCuentaProyectoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.presutipocuentaproyecto,new Object(),this.presutipocuentaproyectoParameterGeneral,this.presutipocuentaproyectoReturnGeneral);
			
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PresuTipoCuentaProyectoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaRemoveUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PresuTipoCuentaProyectoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaInsertUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PresuTipoCuentaProyectoConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jTextAreaActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaPresuTipoCuentaProyectoActual();
			
			this.actualizarInformacion("EVENTO_CONTROL",false,this.presutipocuentaproyecto);
			
			this.actualizarInformacion("INFO_PADRE",false,this.presutipocuentaproyecto);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PresuTipoCuentaProyectoConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.presutipocuentaproyecto);
				
				this.actualizarInformacion("INFO_PADRE",false,this.presutipocuentaproyecto);
				
				PresuTipoCuentaProyectoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.presutipocuentaproyecto,new Object(),this.presutipocuentaproyectoParameterGeneral,this.presutipocuentaproyectoReturnGeneral);
								
				
				


				
				PresuTipoCuentaProyectoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.presutipocuentaproyecto,new Object(),this.presutipocuentaproyectoParameterGeneral,this.presutipocuentaproyectoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(PresuTipoCuentaProyecto.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",PresuTipoCuentaProyecto.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jLabel, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PresuTipoCuentaProyectoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jLabelFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaPresuTipoCuentaProyectoActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosPresuTipoCuentaProyecto.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.presutipocuentaproyectoAnterior =(PresuTipoCuentaProyecto) this.presutipocuentaproyectoLogic.getPresuTipoCuentaProyectos().toArray()[this.jTableDatosPresuTipoCuentaProyecto.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.presutipocuentaproyectoAnterior =(PresuTipoCuentaProyecto) this.presutipocuentaproyectos.toArray()[this.jTableDatosPresuTipoCuentaProyecto.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PresuTipoCuentaProyectoConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jLabelActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaPresuTipoCuentaProyectoActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.presutipocuentaproyecto);
			
			this.actualizarInformacion("INFO_PADRE",false,this.presutipocuentaproyecto);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PresuTipoCuentaProyectoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxItemListenerGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaPresuTipoCuentaProyectoActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.presutipocuentaproyecto);
				
				this.actualizarInformacion("INFO_PADRE",false,this.presutipocuentaproyecto);
				
				PresuTipoCuentaProyectoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.presutipocuentaproyecto,new Object(),this.presutipocuentaproyectoParameterGeneral,this.presutipocuentaproyectoReturnGeneral);
												
				
				if(sTipo.equals("SeleccionarTodosPresuTipoCuentaProyecto")) {
					jCheckBoxSeleccionarTodosPresuTipoCuentaProyectoItemListener(evt);
				
				} else if(sTipo.equals("SeleccionadosPresuTipoCuentaProyecto")) {
					jCheckBoxSeleccionadosPresuTipoCuentaProyectoItemListener(evt);
				
				} else if(sTipo.equals("NuevoToolBarPresuTipoCuentaProyecto")) {
					
				}
				
				


				
				
				PresuTipoCuentaProyectoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.presutipocuentaproyecto,new Object(),this.presutipocuentaproyectoParameterGeneral,this.presutipocuentaproyectoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(PresuTipoCuentaProyecto.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",PresuTipoCuentaProyecto.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PresuTipoCuentaProyectoConstantesFunciones.CLASSNAME);
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
				
				//this.actualizarInformacion("EVENTO_CONTROL",false,this.presutipocuentaproyecto);
				
				//this.actualizarInformacion("INFO_PADRE",false,this.presutipocuentaproyecto);
				
				PresuTipoCuentaProyectoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.presutipocuentaproyecto,new Object(),this.presutipocuentaproyectoParameterGeneral,this.presutipocuentaproyectoReturnGeneral);
												
				
				


				
				
				PresuTipoCuentaProyectoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.presutipocuentaproyecto,new Object(),this.presutipocuentaproyectoParameterGeneral,this.presutipocuentaproyectoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(PresuTipoCuentaProyecto.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",PresuTipoCuentaProyecto.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PresuTipoCuentaProyectoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaPresuTipoCuentaProyectoActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosPresuTipoCuentaProyecto.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.presutipocuentaproyectoAnterior =(PresuTipoCuentaProyecto) this.presutipocuentaproyectoLogic.getPresuTipoCuentaProyectos().toArray()[this.jTableDatosPresuTipoCuentaProyecto.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.presutipocuentaproyectoAnterior =(PresuTipoCuentaProyecto) this.presutipocuentaproyectos.toArray()[this.jTableDatosPresuTipoCuentaProyecto.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PresuTipoCuentaProyectoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaPresuTipoCuentaProyectoActual();
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.presutipocuentaproyecto);
				
				this.actualizarInformacion("INFO_PADRE",false,this.presutipocuentaproyecto);
				
				PresuTipoCuentaProyectoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.presutipocuentaproyecto,new Object(),this.presutipocuentaproyectoParameterGeneral,this.presutipocuentaproyectoReturnGeneral);
				
				
				PresuTipoCuentaProyectoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.presutipocuentaproyecto,new Object(),this.presutipocuentaproyectoParameterGeneral,this.presutipocuentaproyectoReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PresuTipoCuentaProyectoConstantesFunciones.CLASSNAME);
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
			
			PresuTipoCuentaProyectoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.presutipocuentaproyecto,new Object(),this.presutipocuentaproyectoParameterGeneral,this.presutipocuentaproyectoReturnGeneral);
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
			
			


			
			PresuTipoCuentaProyectoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.presutipocuentaproyecto,new Object(),this.presutipocuentaproyectoParameterGeneral,this.presutipocuentaproyectoReturnGeneral);
			*/						
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PresuTipoCuentaProyectoConstantesFunciones.CLASSNAME);
  		}		
    }
	
	@SuppressWarnings("rawtypes")
	public void jComboBoxItemStateChangedGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if (evt.getStateChange() == ItemEvent.SELECTED && this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaPresuTipoCuentaProyectoActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.presutipocuentaproyecto);
				
				this.actualizarInformacion("INFO_PADRE",false,this.presutipocuentaproyecto);
				
				PresuTipoCuentaProyectoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.presutipocuentaproyecto,new Object(),this.presutipocuentaproyectoParameterGeneral,this.presutipocuentaproyectoReturnGeneral);
				
				
				String sFinalQueryCombo="";
				
				


				
				PresuTipoCuentaProyectoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.presutipocuentaproyecto,new Object(),this.presutipocuentaproyectoParameterGeneral,this.presutipocuentaproyectoReturnGeneral);
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(PresuTipoCuentaProyecto.class.getName());
								
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",PresuTipoCuentaProyecto.class.getName(),sTipo,"COMBOBOX",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PresuTipoCuentaProyectoConstantesFunciones.CLASSNAME);
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
			
				this.actualizarInformacion("EVENTO_CONTROL",false,this.presutipocuentaproyecto);
				
				this.actualizarInformacion("INFO_PADRE",false,this.presutipocuentaproyecto);
				
				PresuTipoCuentaProyectoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.presutipocuentaproyecto,new Object(),this.presutipocuentaproyectoParameterGeneral,this.presutipocuentaproyectoReturnGeneral);
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
				
				


				
				PresuTipoCuentaProyectoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.presutipocuentaproyecto,new Object(),this.presutipocuentaproyectoParameterGeneral,this.presutipocuentaproyectoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(PresuTipoCuentaProyecto.class.getName());
				
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",PresuTipoCuentaProyecto.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PresuTipoCuentaProyectoConstantesFunciones.CLASSNAME);
  		}
		
		*/
    }
	
	public void jComboBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaPresuTipoCuentaProyectoActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosPresuTipoCuentaProyecto.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.presutipocuentaproyectoAnterior =(PresuTipoCuentaProyecto) this.presutipocuentaproyectoLogic.getPresuTipoCuentaProyectos().toArray()[this.jTableDatosPresuTipoCuentaProyecto.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.presutipocuentaproyectoAnterior =(PresuTipoCuentaProyecto) this.presutipocuentaproyectos.toArray()[this.jTableDatosPresuTipoCuentaProyecto.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PresuTipoCuentaProyectoConstantesFunciones.CLASSNAME);
  		}
    }		
	
	public void tableValueChangedGeneral(String sTipo,ListSelectionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				PresuTipoCuentaProyectoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.presutipocuentaproyecto,new Object(),this.presutipocuentaproyectoParameterGeneral,this.presutipocuentaproyectoReturnGeneral);
				
				if(sTipo.equals("TableDatosSeleccionarPresuTipoCuentaProyecto")) {
					//BYDAN_DESHABILITADO
					//try {jTableDatosPresuTipoCuentaProyectoListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
					
					//SOLO CUANDO MOUSE ES SOLTADO
					if (!evt.getValueIsAdjusting()) {
						//SELECCIONA FILA A OBJETO ACTUAL
						Integer intSelectedRow = this.jTableDatosPresuTipoCuentaProyecto.getSelectedRow();
						
						if(intSelectedRow!=null && intSelectedRow>-1) {
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								this.presutipocuentaproyecto =(PresuTipoCuentaProyecto) this.presutipocuentaproyectoLogic.getPresuTipoCuentaProyectos().toArray()[this.jTableDatosPresuTipoCuentaProyecto.convertRowIndexToModel(intSelectedRow)];
							} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
								this.presutipocuentaproyecto =(PresuTipoCuentaProyecto) this.presutipocuentaproyectos.toArray()[this.jTableDatosPresuTipoCuentaProyecto.convertRowIndexToModel(intSelectedRow)];
							}
							//ARCHITECTURE
							
							//System.out.println(this.presutipocuentaproyecto);
						}
					}
					
				} else if(sTipo.equals("jButtonCancelarPresuTipoCuentaProyecto")) {
				
				}
				
				PresuTipoCuentaProyectoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.presutipocuentaproyecto,new Object(),this.presutipocuentaproyectoParameterGeneral,this.presutipocuentaproyectoReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PresuTipoCuentaProyectoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void tableMouseAdapterGeneral(String sTipo,MouseEvent evt) { 	  
		try {
			PresuTipoCuentaProyectoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.presutipocuentaproyecto,new Object(),this.presutipocuentaproyectoParameterGeneral,this.presutipocuentaproyectoReturnGeneral);
			
			if(sTipo.equals("DatosSeleccionarPresuTipoCuentaProyecto")) {
				if (evt.getClickCount() == 2) {
					jButtonIdActionPerformed(null,jTableDatosPresuTipoCuentaProyecto.getSelectedRow(),false,false);
				}	
			} else if(sTipo.equals("jButtonCancelarPresuTipoCuentaProyecto")) {
			
			}
			
			PresuTipoCuentaProyectoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.presutipocuentaproyecto,new Object(),this.presutipocuentaproyectoParameterGeneral,this.presutipocuentaproyectoReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PresuTipoCuentaProyectoConstantesFunciones.CLASSNAME);
  		}
    }
	
	;
	
	public void jButtonActionPerformedTecladoGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			this.startProcessPresuTipoCuentaProyecto();
			
			PresuTipoCuentaProyectoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.presutipocuentaproyecto,new Object(),this.presutipocuentaproyectoParameterGeneral,this.presutipocuentaproyectoReturnGeneral);
			
			if(sTipo.equals("NuevoPresuTipoCuentaProyecto")) {
				jButtonNuevoPresuTipoCuentaProyectoActionPerformed(evt,false);
				
			} else if(sTipo.equals("DuplicarPresuTipoCuentaProyecto")) {
				jButtonDuplicarPresuTipoCuentaProyectoActionPerformed(evt,false);
				
			} else if(sTipo.equals("CopiarPresuTipoCuentaProyecto")) {
				jButtonCopiarPresuTipoCuentaProyectoActionPerformed(evt);
				
			} else if(sTipo.equals("VerFormPresuTipoCuentaProyecto")) {
				jButtonVerFormPresuTipoCuentaProyectoActionPerformed(evt);
				
			} else if(sTipo.equals("NuevoRelacionesPresuTipoCuentaProyecto")) {
				jButtonNuevoPresuTipoCuentaProyectoActionPerformed(evt,true);
				
			} else if(sTipo.equals("ModificarPresuTipoCuentaProyecto")) {
				jButtonModificarPresuTipoCuentaProyectoActionPerformed(evt);
				
			} else if(sTipo.equals("ActualizarPresuTipoCuentaProyecto")) {
				jButtonActualizarPresuTipoCuentaProyectoActionPerformed(evt);
				
			} else if(sTipo.equals("EliminarPresuTipoCuentaProyecto")) {
				jButtonEliminarPresuTipoCuentaProyectoActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosTablaPresuTipoCuentaProyecto")) {
				jButtonGuardarCambiosPresuTipoCuentaProyectoActionPerformed(evt);
				
			} else if(sTipo.equals("CancelarPresuTipoCuentaProyecto")) {
				jButtonCancelarPresuTipoCuentaProyectoActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarPresuTipoCuentaProyecto")) {
				jButtonCerrarPresuTipoCuentaProyectoActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosPresuTipoCuentaProyecto")) {
				jButtonGuardarCambiosPresuTipoCuentaProyectoActionPerformed(evt);
			
			} else if(sTipo.equals("NuevoGuardarCambiosPresuTipoCuentaProyecto")) {
				jButtonNuevoGuardarCambiosPresuTipoCuentaProyectoActionPerformed(evt);
			
			} else if(sTipo.equals("AbrirOrderByPresuTipoCuentaProyecto")) {
				jButtonAbrirOrderByPresuTipoCuentaProyectoActionPerformed(evt);
			
			} else if(sTipo.equals("RecargarInformacionPresuTipoCuentaProyecto")) {
				jButtonRecargarInformacionPresuTipoCuentaProyectoActionPerformed(evt);
			
			} else if(sTipo.equals("AnterioresPresuTipoCuentaProyecto")) {
				jButtonAnterioresPresuTipoCuentaProyectoActionPerformed(evt);			
			
			}  else if(sTipo.equals("SiguientesPresuTipoCuentaProyecto")) {
				jButtonSiguientesPresuTipoCuentaProyectoActionPerformed(evt);			
			} 
			
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idPresuTipoCuentaProyectoBusqueda")) {
				this.jButtonidPresuTipoCuentaProyectoBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_empresaPresuTipoCuentaProyectoUpdate")) {
				this.jButtonid_empresaPresuTipoCuentaProyectoUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_empresaPresuTipoCuentaProyectoBusqueda")) {
				this.jButtonid_empresaPresuTipoCuentaProyectoBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("codigoPresuTipoCuentaProyectoBusqueda")) {
				this.jButtoncodigoPresuTipoCuentaProyectoBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombrePresuTipoCuentaProyectoBusqueda")) {
				this.jButtonnombrePresuTipoCuentaProyectoBusquedaActionPerformed(evt);
			}
			
			PresuTipoCuentaProyectoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.presutipocuentaproyecto,new Object(),this.presutipocuentaproyectoParameterGeneral,this.presutipocuentaproyectoReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PresuTipoCuentaProyectoConstantesFunciones.CLASSNAME);
			
  		}  finally {
      		this.finishProcessPresuTipoCuentaProyecto();
      	}
    }
	
	public void internalFrameClosingInternalFrameGeneral(String sTipo,InternalFrameEvent evt) { 	  
		try {
			PresuTipoCuentaProyectoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.presutipocuentaproyecto,new Object(),this.presutipocuentaproyectoParameterGeneral,this.presutipocuentaproyectoReturnGeneral);
			
			if(sTipo.equals("CloseInternalFramePresuTipoCuentaProyecto")) {
				closingInternalFramePresuTipoCuentaProyecto();
				
			} else if(sTipo.equals("jButtonCancelarPresuTipoCuentaProyecto")) {
				JInternalFrameBase jInternalFrameDetalleFormPresuTipoCuentaProyecto = (JInternalFrameBase)evt.getSource();
	            	
	            PresuTipoCuentaProyectoBeanSwingJInternalFrame jInternalFrameParent=(PresuTipoCuentaProyectoBeanSwingJInternalFrame)jInternalFrameDetalleFormPresuTipoCuentaProyecto.getjInternalFrameParent();
	            
				jInternalFrameParent.jButtonCancelarPresuTipoCuentaProyectoActionPerformed(null);
			}
			
			PresuTipoCuentaProyectoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.presutipocuentaproyecto,new Object(),this.presutipocuentaproyectoParameterGeneral,this.presutipocuentaproyectoReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PresuTipoCuentaProyectoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void recargarFormPresuTipoCuentaProyecto(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion) throws Exception {
		this.recargarFormPresuTipoCuentaProyecto(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,false);
	}
	
	public void recargarFormPresuTipoCuentaProyecto(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion,Boolean esControlTabla) throws Exception {
		if(this.permiteRecargarForm && this.permiteMantenimiento(this.presutipocuentaproyecto)) {
			if(!esControlTabla) {
				if(PresuTipoCuentaProyectoJInternalFrame.ISBINDING_MANUAL_TABLA) {			
					this.setVariablesFormularioToObjetoActualPresuTipoCuentaProyecto(this.presutipocuentaproyecto,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysPresuTipoCuentaProyecto(this.presutipocuentaproyecto);			
				}
				
				if(this.presutipocuentaproyectoSessionBean.getEstaModoGuardarRelaciones()) {
					this.setVariablesFormularioRelacionesToObjetoActualPresuTipoCuentaProyecto(this.presutipocuentaproyecto,classes);				
				}
			
				if(conIrServidorAplicacion) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {						
						this.presutipocuentaproyectoReturnGeneral=presutipocuentaproyectoLogic.procesarEventosPresuTipoCuentaProyectosWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.presutipocuentaproyectoLogic.getPresuTipoCuentaProyectos(),this.presutipocuentaproyecto,this.presutipocuentaproyectoParameterGeneral,this.isEsNuevoPresuTipoCuentaProyecto,classes);//this.presutipocuentaproyectoLogic.getPresuTipoCuentaProyecto()//sTipoGeneral
									
					} else if(Constantes.ISUSAEJBREMOTE) {
									
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE
					
					//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					//this.setVariablesObjetoReturnGeneralToBeanPresuTipoCuentaProyecto(this.presutipocuentaproyectoReturnGeneral,this.presutipocuentaproyectoBean,false);
						
					//ACTUALIZA VARIABLES RELACIONES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					if(this.presutipocuentaproyectoSessionBean.getEstaModoGuardarRelaciones()) {
						//this.setVariablesRelacionesObjetoReturnGeneralToBeanPresuTipoCuentaProyecto(classes,this.presutipocuentaproyectoReturnGeneral,this.presutipocuentaproyectoBean,false);
					}
						
					if(this.presutipocuentaproyectoReturnGeneral.getConRecargarPropiedades()) {
						//INICIALIZA VARIABLES COMBOS NORMALES (FK)
						this.setVariablesObjetoActualToFormularioForeignKeyPresuTipoCuentaProyecto(this.presutipocuentaproyectoReturnGeneral.getPresuTipoCuentaProyecto());
							
						//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
						this.setVariablesObjetoActualToFormularioPresuTipoCuentaProyecto(this.presutipocuentaproyectoReturnGeneral.getPresuTipoCuentaProyecto());	
					}
						
					if(this.presutipocuentaproyectoReturnGeneral.getConRecargarRelaciones()) {
						//INICIALIZA VARIABLES RELACIONES A FORMULARIO
						this.setVariablesRelacionesObjetoActualToFormularioPresuTipoCuentaProyecto(this.presutipocuentaproyectoReturnGeneral.getPresuTipoCuentaProyecto(),classes);//this.presutipocuentaproyectoBean);	
					}									
					
				} else {				
					//INICIALIZA VARIABLES RELACIONES A FORMULARIO
					this.setVariablesRelacionesObjetoActualToFormularioPresuTipoCuentaProyecto(this.presutipocuentaproyecto,classes);//this.presutipocuentaproyectoBean);									
				}
			
				if(PresuTipoCuentaProyectoJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesFormularioToObjetoActualPresuTipoCuentaProyecto(this.presutipocuentaproyecto,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysPresuTipoCuentaProyecto(this.presutipocuentaproyecto);				
				}
				
			} else {
				
				if(((controlTipo.equals(ControlTipo.TEXTBOX) || controlTipo.equals(ControlTipo.DATE)
					|| controlTipo.equals(ControlTipo.TEXTAREA) || controlTipo.equals(ControlTipo.COMBOBOX)
					)				
					&& eventoTipo.equals(EventoTipo.CHANGE)
					)
					
					|| (controlTipo.equals(ControlTipo.CHECKBOX) && eventoTipo.equals(EventoTipo.CLIC))
					
				) { // && sTipoGeneral.equals("TEXTBOX")
					
					if(this.presutipocuentaproyectoAnterior!=null) {
						this.presutipocuentaproyecto=this.presutipocuentaproyectoAnterior;
					}
				}
				
				if(conIrServidorAplicacion) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {						
						this.presutipocuentaproyectoReturnGeneral=presutipocuentaproyectoLogic.procesarEventosPresuTipoCuentaProyectosWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.presutipocuentaproyectoLogic.getPresuTipoCuentaProyectos(),this.presutipocuentaproyecto,this.presutipocuentaproyectoParameterGeneral,this.isEsNuevoPresuTipoCuentaProyecto,classes);//this.presutipocuentaproyectoLogic.getPresuTipoCuentaProyecto()//sTipoGeneral
									
					} else if(Constantes.ISUSAEJBREMOTE) {
									
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.presutipocuentaproyectoSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.presutipocuentaproyectoSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(this.presutipocuentaproyectoReturnGeneral.getPresuTipoCuentaProyecto(),presutipocuentaproyectoLogic.getPresuTipoCuentaProyectos());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(this.presutipocuentaproyectoReturnGeneral.getPresuTipoCuentaProyecto(),this.presutipocuentaproyectos);
				}
				//ARCHITECTURE
				
				//this.jTableDatosPresuTipoCuentaProyecto.repaint();
				
				//((AbstractTableModel) this.jTableDatosPresuTipoCuentaProyecto.getModel()).fireTableDataChanged();
				
				this.actualizarVisualTableDatosPresuTipoCuentaProyecto();
			}
		}
	}
	
	public void actualizarVisualTableDatosPresuTipoCuentaProyecto() throws Exception {
		
		PresuTipoCuentaProyectoModel presutipocuentaproyectoModel=(PresuTipoCuentaProyectoModel)this.jTableDatosPresuTipoCuentaProyecto.getModel();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			presutipocuentaproyectoModel.presutipocuentaproyectos=this.presutipocuentaproyectoLogic.getPresuTipoCuentaProyectos();
		
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
			presutipocuentaproyectoModel.presutipocuentaproyectos=this.presutipocuentaproyectos;
		}
		
		
		((PresuTipoCuentaProyectoModel) this.jTableDatosPresuTipoCuentaProyecto.getModel()).fireTableDataChanged();
	}
	
	public void actualizarVisualTableDatosEventosVistaPresuTipoCuentaProyecto() throws Exception {
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.actualizarLista(this.getpresutipocuentaproyectoAnterior(),this.presutipocuentaproyectoLogic.getPresuTipoCuentaProyectos());
					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			this.actualizarLista(this.getpresutipocuentaproyectoAnterior(),this.presutipocuentaproyectos);
		}
		//ARCHITECTURE
						
		this.actualizarFilaTotales();
						
		this.actualizarVisualTableDatosPresuTipoCuentaProyecto();	
	}
	
	public void setVariablesRelacionesObjetoActualToFormularioPresuTipoCuentaProyecto(PresuTipoCuentaProyecto presutipocuentaproyecto,ArrayList<Classe> classes) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PresuTipoCuentaProyectoConstantesFunciones.CLASSNAME);
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
										
				PresuTipoCuentaProyectoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.presutipocuentaproyecto,new Object(),generalEntityParameterGeneral,this.presutipocuentaproyectoReturnGeneral);
				
				ArrayList<Classe> classes=new ArrayList<Classe>();
				
				for(String sClasse:arrClasses) {
					if(sClasse.equals("TODOS")) {
						conTodasRelaciones=true;
						break;
					}
				}
				
				if(this.presutipocuentaproyectoSessionBean.getConGuardarRelaciones()) {
					if(conTodasRelaciones) {
						classes=PresuTipoCuentaProyectoConstantesFunciones.getClassesRelationshipsOfPresuTipoCuentaProyecto(new ArrayList<Classe>(),DeepLoadType.NONE);
					} else {
						classes=PresuTipoCuentaProyectoConstantesFunciones.getClassesRelationshipsFromStringsOfPresuTipoCuentaProyecto(arrClasses,DeepLoadType.NONE);
					}
				}
	
				this.classesActual=new ArrayList<Classe>();
				this.classesActual.addAll(classes);
	
				this.recargarFormPresuTipoCuentaProyecto(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,esControlTabla);
										
				PresuTipoCuentaProyectoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.presutipocuentaproyecto,new Object(),generalEntityParameterGeneral,this.presutipocuentaproyectoReturnGeneral);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PresuTipoCuentaProyectoConstantesFunciones.CLASSNAME);
  		}
    }
	
	/*
	public void setVariablesRelacionesObjetoBeanActualToFormularioPresuTipoCuentaProyecto(PresuTipoCuentaProyectoBean presutipocuentaproyectoBean) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PresuTipoCuentaProyectoConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesRelacionesObjetoReturnGeneralToBeanPresuTipoCuentaProyecto(ArrayList<Classe> classes,PresuTipoCuentaProyectoReturnGeneral presutipocuentaproyectoReturnGeneral,PresuTipoCuentaProyectoBean presutipocuentaproyectoBean,Boolean conDefault) throws Exception {
		
	}
	*/
	
	public void setVariablesFormularioRelacionesToObjetoActualPresuTipoCuentaProyecto(PresuTipoCuentaProyecto presutipocuentaproyecto,ArrayList<Classe> classes) throws Exception {
		
	}
	
	public Boolean permiteManejarEventosControl() {
		Boolean permite=true;				
		
		if(this.estaModoNuevo || this.estaModoSeleccionar || this.estaModoEliminarGuardarCambios) {
			permite=false;
			
		} 
		
		//NO DEBE MEZCLARSE CONCEPTOS
		/*	
		if(!paraTabla && !this.permiteMantenimiento(this.presutipocuentaproyecto)) {
			System.out.println("ERROR:EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES");
				
			//JOptionPane.showMessageDialog(this,"EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES","EVENTO",JOptionPane.ERROR_MESSAGE);			
		}
		*/
		
		return permite;
	}
	
	public void inicializarFormDetalle() throws Exception {
		
		this.jInternalFrameDetalleFormPresuTipoCuentaProyecto = new PresuTipoCuentaProyectoDetalleFormJInternalFrame(jDesktopPane,this.presutipocuentaproyectoSessionBean.getConGuardarRelaciones(),this.presutipocuentaproyectoSessionBean.getEsGuardarRelacionado(),this.cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		this.jDesktopPane.add(this.jInternalFrameDetalleFormPresuTipoCuentaProyecto);
		this.jInternalFrameDetalleFormPresuTipoCuentaProyecto.setVisible(false);
		this.jInternalFrameDetalleFormPresuTipoCuentaProyecto.setSelected(false);						
		
		this.jInternalFrameDetalleFormPresuTipoCuentaProyecto.setJInternalFrameParent(this);
		
		this.jInternalFrameDetalleFormPresuTipoCuentaProyecto.presutipocuentaproyectoLogic=this.presutipocuentaproyectoLogic;
		
		this.cargarCombosFrameForeignKeyPresuTipoCuentaProyecto("Formulario");
		
		this.inicializarActualizarBindingBotonesPermisosManualFormDetallePresuTipoCuentaProyecto();
		this.inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetallePresuTipoCuentaProyecto();
		
		this.initActionsFormDetalle();		
		
		this.initActionsCombosTodosForeignKeyPresuTipoCuentaProyecto("Formulario");
		
		//TALVEZ conSetVariablesGlobales COMO if() 
		this.setVariablesGlobalesCombosForeignKeyPresuTipoCuentaProyecto();
		
		this.cargarMenuRelaciones();
		
	}
	
	public void initActionsFormDetalle() {	
		
		this.jInternalFrameDetalleFormPresuTipoCuentaProyecto.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarPresuTipoCuentaProyecto"));
		
		this.jInternalFrameDetalleFormPresuTipoCuentaProyecto.jButtonModificarPresuTipoCuentaProyecto.addActionListener(new ButtonActionListener(this,"ModificarPresuTipoCuentaProyecto"));

		
		this.jInternalFrameDetalleFormPresuTipoCuentaProyecto.jButtonModificarToolBarPresuTipoCuentaProyecto.addActionListener(new ButtonActionListener(this,"ModificarToolBarPresuTipoCuentaProyecto"));
					
		this.jInternalFrameDetalleFormPresuTipoCuentaProyecto.jMenuItemModificarPresuTipoCuentaProyecto.addActionListener(new ButtonActionListener(this,"MenuItemModificarPresuTipoCuentaProyecto"));		
		
		
		
		this.jInternalFrameDetalleFormPresuTipoCuentaProyecto.jButtonActualizarPresuTipoCuentaProyecto.addActionListener (new ButtonActionListener(this,"ActualizarPresuTipoCuentaProyecto"));
		
		
		this.jInternalFrameDetalleFormPresuTipoCuentaProyecto.jButtonActualizarToolBarPresuTipoCuentaProyecto.addActionListener(new ButtonActionListener(this,"ActualizarToolBarPresuTipoCuentaProyecto"));
						
		this.jInternalFrameDetalleFormPresuTipoCuentaProyecto.jMenuItemActualizarPresuTipoCuentaProyecto.addActionListener (new ButtonActionListener(this,"MenuItemActualizarPresuTipoCuentaProyecto"));		
		
		
		
		this.jInternalFrameDetalleFormPresuTipoCuentaProyecto.jButtonEliminarPresuTipoCuentaProyecto.addActionListener (new ButtonActionListener(this,"EliminarPresuTipoCuentaProyecto"));
		
		
		this.jInternalFrameDetalleFormPresuTipoCuentaProyecto.jButtonEliminarToolBarPresuTipoCuentaProyecto.addActionListener (new ButtonActionListener(this,"EliminarToolBarPresuTipoCuentaProyecto"));
								
		this.jInternalFrameDetalleFormPresuTipoCuentaProyecto.jMenuItemEliminarPresuTipoCuentaProyecto.addActionListener (new ButtonActionListener(this,"MenuItemEliminarPresuTipoCuentaProyecto"));		
		
		
		
		this.jInternalFrameDetalleFormPresuTipoCuentaProyecto.jButtonCancelarPresuTipoCuentaProyecto.addActionListener (new ButtonActionListener(this,"CancelarPresuTipoCuentaProyecto"));
		
		
		this.jInternalFrameDetalleFormPresuTipoCuentaProyecto.jButtonCancelarToolBarPresuTipoCuentaProyecto.addActionListener (new ButtonActionListener(this,"CancelarToolBarPresuTipoCuentaProyecto"));
					
		this.jInternalFrameDetalleFormPresuTipoCuentaProyecto.jMenuItemCancelarPresuTipoCuentaProyecto.addActionListener (new ButtonActionListener(this,"MenuItemCancelarPresuTipoCuentaProyecto"));		
		
		
		
		
		
		this.jInternalFrameDetalleFormPresuTipoCuentaProyecto.jMenuItemDetalleCerrarPresuTipoCuentaProyecto.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarPresuTipoCuentaProyecto"));		
		
		
		
		this.jInternalFrameDetalleFormPresuTipoCuentaProyecto.jButtonGuardarCambiosToolBarPresuTipoCuentaProyecto.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarPresuTipoCuentaProyecto"));
		
		
		
		this.jInternalFrameDetalleFormPresuTipoCuentaProyecto.jButtonGuardarCambiosToolBarPresuTipoCuentaProyecto.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarPresuTipoCuentaProyecto"));
		
		
		
		this.jInternalFrameDetalleFormPresuTipoCuentaProyecto.jComboBoxTiposAccionesFormularioPresuTipoCuentaProyecto.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioPresuTipoCuentaProyecto"));
		
		
				
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPresuTipoCuentaProyecto.jButtonidPresuTipoCuentaProyectoBusqueda.addActionListener(new ButtonActionListener(this,"idPresuTipoCuentaProyectoBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormPresuTipoCuentaProyecto.jButtonid_empresaPresuTipoCuentaProyectoUpdate.addActionListener(new ButtonActionListener(this,"id_empresaPresuTipoCuentaProyectoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPresuTipoCuentaProyecto.jButtonid_empresaPresuTipoCuentaProyectoBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaPresuTipoCuentaProyectoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPresuTipoCuentaProyecto.jButtoncodigoPresuTipoCuentaProyectoBusqueda.addActionListener(new ButtonActionListener(this,"codigoPresuTipoCuentaProyectoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPresuTipoCuentaProyecto.jButtonnombrePresuTipoCuentaProyectoBusqueda.addActionListener(new ButtonActionListener(this,"nombrePresuTipoCuentaProyectoBusqueda"));
		
		
		;

		//TABBED PANE RELACIONES
		this.jInternalFrameDetalleFormPresuTipoCuentaProyecto.jTabbedPaneRelacionesPresuTipoCuentaProyecto.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesPresuTipoCuentaProyecto"));
		
		;		
		//TABBED PANE RELACIONES FIN(EXTRA TAB)	
	}
	
	public void initActions() {				
		this.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"CloseInternalFramePresuTipoCuentaProyecto"));
		
		if(this.jInternalFrameDetalleFormPresuTipoCuentaProyecto!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormPresuTipoCuentaProyecto.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarPresuTipoCuentaProyecto"));
		}
		
		this.jTableDatosPresuTipoCuentaProyecto.getSelectionModel().addListSelectionListener(new TableListSelectionListener(this,"TableDatosSeleccionarPresuTipoCuentaProyecto"));
		
		this.jTableDatosPresuTipoCuentaProyecto.addMouseListener(new TableMouseAdapter(this,"DatosSeleccionarPresuTipoCuentaProyecto"));
		
		this.jButtonNuevoPresuTipoCuentaProyecto.addActionListener(new ButtonActionListener(this,"NuevoPresuTipoCuentaProyecto"));
		
		this.jButtonDuplicarPresuTipoCuentaProyecto.addActionListener(new ButtonActionListener(this,"DuplicarPresuTipoCuentaProyecto"));
		
		this.jButtonCopiarPresuTipoCuentaProyecto.addActionListener(new ButtonActionListener(this,"CopiarPresuTipoCuentaProyecto"));
		
		this.jButtonVerFormPresuTipoCuentaProyecto.addActionListener(new ButtonActionListener(this,"VerFormPresuTipoCuentaProyecto"));
		
		
		this.jButtonNuevoToolBarPresuTipoCuentaProyecto.addActionListener(new ButtonActionListener(this,"NuevoToolBarPresuTipoCuentaProyecto"));
			
		this.jButtonDuplicarToolBarPresuTipoCuentaProyecto.addActionListener(new ButtonActionListener(this,"DuplicarToolBarPresuTipoCuentaProyecto"));
			
		this.jMenuItemNuevoPresuTipoCuentaProyecto.addActionListener (new ButtonActionListener(this,"MenuItemNuevoPresuTipoCuentaProyecto"));
			
		this.jMenuItemDuplicarPresuTipoCuentaProyecto.addActionListener (new ButtonActionListener(this,"MenuItemDuplicarPresuTipoCuentaProyecto"));		
		
		
		this.jButtonNuevoRelacionesPresuTipoCuentaProyecto.addActionListener (new ButtonActionListener(this,"NuevoRelacionesPresuTipoCuentaProyecto"));
		
		
		this.jButtonNuevoRelacionesToolBarPresuTipoCuentaProyecto.addActionListener(new ButtonActionListener(this,"NuevoRelacionesToolBarPresuTipoCuentaProyecto"));
			
		this.jMenuItemNuevoRelacionesPresuTipoCuentaProyecto.addActionListener(new ButtonActionListener(this,"MenuItemNuevoRelacionesPresuTipoCuentaProyecto"));		
		
		
		if(this.jInternalFrameDetalleFormPresuTipoCuentaProyecto!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormPresuTipoCuentaProyecto.jButtonModificarPresuTipoCuentaProyecto.addActionListener(new ButtonActionListener(this,"ModificarPresuTipoCuentaProyecto"));
		}
		
		
		if(this.jInternalFrameDetalleFormPresuTipoCuentaProyecto!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormPresuTipoCuentaProyecto.jButtonModificarToolBarPresuTipoCuentaProyecto.addActionListener(new ButtonActionListener(this,"ModificarToolBarPresuTipoCuentaProyecto"));
			
			this.jInternalFrameDetalleFormPresuTipoCuentaProyecto.jMenuItemModificarPresuTipoCuentaProyecto.addActionListener(new ButtonActionListener(this,"MenuItemModificarPresuTipoCuentaProyecto"));		
		}
		
		
		if(this.jInternalFrameDetalleFormPresuTipoCuentaProyecto!=null) { //if(this.conCargarFormDetalle) {			
			this.jInternalFrameDetalleFormPresuTipoCuentaProyecto.jButtonActualizarPresuTipoCuentaProyecto.addActionListener (new ButtonActionListener(this,"ActualizarPresuTipoCuentaProyecto"));
		}
		
		
		if(this.jInternalFrameDetalleFormPresuTipoCuentaProyecto!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormPresuTipoCuentaProyecto.jButtonActualizarToolBarPresuTipoCuentaProyecto.addActionListener(new ButtonActionListener(this,"ActualizarToolBarPresuTipoCuentaProyecto"));
				
			this.jInternalFrameDetalleFormPresuTipoCuentaProyecto.jMenuItemActualizarPresuTipoCuentaProyecto.addActionListener (new ButtonActionListener(this,"MenuItemActualizarPresuTipoCuentaProyecto"));		
		}
		
		
		if(this.jInternalFrameDetalleFormPresuTipoCuentaProyecto!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormPresuTipoCuentaProyecto.jButtonEliminarPresuTipoCuentaProyecto.addActionListener (new ButtonActionListener(this,"EliminarPresuTipoCuentaProyecto"));
		}
		
		
		if(this.jInternalFrameDetalleFormPresuTipoCuentaProyecto!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormPresuTipoCuentaProyecto.jButtonEliminarToolBarPresuTipoCuentaProyecto.addActionListener (new ButtonActionListener(this,"EliminarToolBarPresuTipoCuentaProyecto"));
						
			this.jInternalFrameDetalleFormPresuTipoCuentaProyecto.jMenuItemEliminarPresuTipoCuentaProyecto.addActionListener (new ButtonActionListener(this,"MenuItemEliminarPresuTipoCuentaProyecto"));		
		}
		
		
		if(this.jInternalFrameDetalleFormPresuTipoCuentaProyecto!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormPresuTipoCuentaProyecto.jButtonCancelarPresuTipoCuentaProyecto.addActionListener (new ButtonActionListener(this,"CancelarPresuTipoCuentaProyecto"));
		}
		
		
		if(this.jInternalFrameDetalleFormPresuTipoCuentaProyecto!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormPresuTipoCuentaProyecto.jButtonCancelarToolBarPresuTipoCuentaProyecto.addActionListener (new ButtonActionListener(this,"CancelarToolBarPresuTipoCuentaProyecto"));
			
			this.jInternalFrameDetalleFormPresuTipoCuentaProyecto.jMenuItemCancelarPresuTipoCuentaProyecto.addActionListener (new ButtonActionListener(this,"MenuItemCancelarPresuTipoCuentaProyecto"));		
		}
		
		this.jButtonMostrarOcultarTablaToolBarPresuTipoCuentaProyecto.addActionListener (new ButtonActionListener(this,"MostrarOcultarToolBarPresuTipoCuentaProyecto"));		
		
		
		this.jButtonCerrarPresuTipoCuentaProyecto.addActionListener (new ButtonActionListener(this,"CerrarPresuTipoCuentaProyecto"));
		
		
		this.jButtonCerrarToolBarPresuTipoCuentaProyecto.addActionListener (new ButtonActionListener(this,"CerrarToolBarPresuTipoCuentaProyecto"));
			
		this.jMenuItemCerrarPresuTipoCuentaProyecto.addActionListener (new ButtonActionListener(this,"MenuItemCerrarPresuTipoCuentaProyecto"));
			
		if(this.jInternalFrameDetalleFormPresuTipoCuentaProyecto!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormPresuTipoCuentaProyecto.jMenuItemDetalleCerrarPresuTipoCuentaProyecto.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarPresuTipoCuentaProyecto"));		
		}
		
		
		if(this.jInternalFrameDetalleFormPresuTipoCuentaProyecto!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormPresuTipoCuentaProyecto.jButtonGuardarCambiosPresuTipoCuentaProyecto.addActionListener (new ButtonActionListener(this,"GuardarCambiosPresuTipoCuentaProyecto"));
		}
		
		
		if(this.jInternalFrameDetalleFormPresuTipoCuentaProyecto!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormPresuTipoCuentaProyecto.jButtonGuardarCambiosToolBarPresuTipoCuentaProyecto.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarPresuTipoCuentaProyecto"));
		}
		
		this.jButtonCopiarToolBarPresuTipoCuentaProyecto.addActionListener (new ButtonActionListener(this,"CopiarToolBarPresuTipoCuentaProyecto"));
			
		this.jButtonVerFormToolBarPresuTipoCuentaProyecto.addActionListener (new ButtonActionListener(this,"VerFormToolBarPresuTipoCuentaProyecto"));
		
		this.jMenuItemGuardarCambiosPresuTipoCuentaProyecto.addActionListener (new ButtonActionListener(this,"MenuItemGuardarCambiosPresuTipoCuentaProyecto"));
			
		this.jMenuItemCopiarPresuTipoCuentaProyecto.addActionListener (new ButtonActionListener(this,"MenuItemCopiarPresuTipoCuentaProyecto"));		
		
		this.jMenuItemVerFormPresuTipoCuentaProyecto.addActionListener (new ButtonActionListener(this,"MenuItemVerFormPresuTipoCuentaProyecto"));		
		
		
		this.jButtonGuardarCambiosTablaPresuTipoCuentaProyecto.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaPresuTipoCuentaProyecto"));
		
		
		this.jButtonGuardarCambiosTablaToolBarPresuTipoCuentaProyecto.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaToolBarPresuTipoCuentaProyecto"));
			
		this.jMenuItemGuardarCambiosTablaPresuTipoCuentaProyecto.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaPresuTipoCuentaProyecto"));		
		
		
		
		this.jButtonRecargarInformacionPresuTipoCuentaProyecto.addActionListener (new ButtonActionListener(this,"RecargarInformacionPresuTipoCuentaProyecto"));
					
		this.jButtonRecargarInformacionToolBarPresuTipoCuentaProyecto.addActionListener (new ButtonActionListener(this,"RecargarInformacionToolBarPresuTipoCuentaProyecto"));
		
		this.jMenuItemRecargarInformacionPresuTipoCuentaProyecto.addActionListener (new ButtonActionListener(this,"MenuItemRecargarInformacionPresuTipoCuentaProyecto"));		
		
		
		
		this.jButtonAnterioresPresuTipoCuentaProyecto.addActionListener (new ButtonActionListener(this,"AnterioresPresuTipoCuentaProyecto"));
		
		
		this.jButtonAnterioresToolBarPresuTipoCuentaProyecto.addActionListener (new ButtonActionListener(this,"AnterioresToolBarPresuTipoCuentaProyecto"));
		
		this.jMenuItemAnterioresPresuTipoCuentaProyecto.addActionListener (new ButtonActionListener(this,"MenuItemAnterioresPresuTipoCuentaProyecto"));		
		
		
		this.jButtonSiguientesPresuTipoCuentaProyecto.addActionListener (new ButtonActionListener(this,"SiguientesPresuTipoCuentaProyecto"));
		
		
		this.jButtonSiguientesToolBarPresuTipoCuentaProyecto.addActionListener (new ButtonActionListener(this,"SiguientesToolBarPresuTipoCuentaProyecto"));
			
		this.jMenuItemSiguientesPresuTipoCuentaProyecto.addActionListener (new ButtonActionListener(this,"MenuItemSiguientesPresuTipoCuentaProyecto"));
			
		this.jMenuItemAbrirOrderByPresuTipoCuentaProyecto.addActionListener (new ButtonActionListener(this,"MenuItemAbrirOrderByPresuTipoCuentaProyecto"));
			
		this.jMenuItemMostrarOcultarPresuTipoCuentaProyecto.addActionListener (new ButtonActionListener(this,"MenuItemMostrarOcultarPresuTipoCuentaProyecto"));
			
		this.jMenuItemDetalleAbrirOrderByPresuTipoCuentaProyecto.addActionListener (new ButtonActionListener(this,"MenuItemDetalleAbrirOrderByPresuTipoCuentaProyecto"));
			
		this.jMenuItemDetalleMostarOcultarPresuTipoCuentaProyecto.addActionListener (new ButtonActionListener(this,"MenuItemDetalleMostrarOcultarPresuTipoCuentaProyecto"));		
		
		
		this.jButtonNuevoGuardarCambiosPresuTipoCuentaProyecto.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosPresuTipoCuentaProyecto"));
		
		
		this.jButtonNuevoGuardarCambiosToolBarPresuTipoCuentaProyecto.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosToolBarPresuTipoCuentaProyecto"));
			
		this.jMenuItemNuevoGuardarCambiosPresuTipoCuentaProyecto.addActionListener (new ButtonActionListener(this,"MenuItemNuevoGuardarCambiosPresuTipoCuentaProyecto"));		
		
		
		
		//SELECCIONAR TODOS
		
		this.jCheckBoxSeleccionarTodosPresuTipoCuentaProyecto.addItemListener(new CheckBoxItemListener(this,"SeleccionarTodosPresuTipoCuentaProyecto"));

		this.jCheckBoxSeleccionadosPresuTipoCuentaProyecto.addItemListener(new CheckBoxItemListener(this,"SeleccionadosPresuTipoCuentaProyecto"));
		
		if(this.jInternalFrameDetalleFormPresuTipoCuentaProyecto!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormPresuTipoCuentaProyecto.jComboBoxTiposAccionesFormularioPresuTipoCuentaProyecto.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioPresuTipoCuentaProyecto"));
		}
		
		
		this.jComboBoxTiposRelacionesPresuTipoCuentaProyecto.addActionListener (new ButtonActionListener(this,"TiposRelacionesPresuTipoCuentaProyecto"));
			
		this.jComboBoxTiposAccionesPresuTipoCuentaProyecto.addActionListener (new ButtonActionListener(this,"TiposAccionesPresuTipoCuentaProyecto"));
					
		this.jComboBoxTiposSeleccionarPresuTipoCuentaProyecto.addActionListener (new ButtonActionListener(this,"TiposSeleccionarPresuTipoCuentaProyecto"));
			
		this.jTextFieldValorCampoGeneralPresuTipoCuentaProyecto.addActionListener (new ButtonActionListener(this,"ValorCampoGeneralPresuTipoCuentaProyecto"));		
		
		
		if(this.jInternalFrameDetalleFormPresuTipoCuentaProyecto!=null) { //if(this.conCargarFormDetalle) {
		
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPresuTipoCuentaProyecto.jButtonidPresuTipoCuentaProyectoBusqueda.addActionListener(new ButtonActionListener(this,"idPresuTipoCuentaProyectoBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormPresuTipoCuentaProyecto.jButtonid_empresaPresuTipoCuentaProyectoUpdate.addActionListener(new ButtonActionListener(this,"id_empresaPresuTipoCuentaProyectoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPresuTipoCuentaProyecto.jButtonid_empresaPresuTipoCuentaProyectoBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaPresuTipoCuentaProyectoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPresuTipoCuentaProyecto.jButtoncodigoPresuTipoCuentaProyectoBusqueda.addActionListener(new ButtonActionListener(this,"codigoPresuTipoCuentaProyectoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPresuTipoCuentaProyecto.jButtonnombrePresuTipoCuentaProyectoBusqueda.addActionListener(new ButtonActionListener(this,"nombrePresuTipoCuentaProyectoBusqueda"));
		}
		
		if(!this.conCargarMinimo) {
		//BYDAN_BUSQUEDAS
		
		
			this.jButtonBusquedaPorCodigoPresuTipoCuentaProyecto.addActionListener(new ButtonActionListener(this,"BusquedaPorCodigoPresuTipoCuentaProyecto"));

			this.jButtonBusquedaPorNombrePresuTipoCuentaProyecto.addActionListener(new ButtonActionListener(this,"BusquedaPorNombrePresuTipoCuentaProyecto"));
		
		
		
			//REPORTE DINAMICO
			
			if(this.jInternalFrameReporteDinamicoPresuTipoCuentaProyecto!=null) {
				this.jInternalFrameReporteDinamicoPresuTipoCuentaProyecto.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoPresuTipoCuentaProyecto"));
				this.jInternalFrameReporteDinamicoPresuTipoCuentaProyecto.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoPresuTipoCuentaProyecto"));
				this.jInternalFrameReporteDinamicoPresuTipoCuentaProyecto.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoPresuTipoCuentaProyecto"));
			}
			
			//this.jButtonCerrarReporteDinamicoPresuTipoCuentaProyecto.addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoPresuTipoCuentaProyecto"));				
			//this.jButtonGenerarReporteDinamicoPresuTipoCuentaProyecto.addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoPresuTipoCuentaProyecto"));
			//this.jButtonGenerarExcelReporteDinamicoPresuTipoCuentaProyecto.addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoPresuTipoCuentaProyecto"));
				
				
			//IMPORTACION			
			if(this.jInternalFrameImportacionPresuTipoCuentaProyecto!=null) {
				this.jInternalFrameImportacionPresuTipoCuentaProyecto.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionPresuTipoCuentaProyecto"));
				this.jInternalFrameImportacionPresuTipoCuentaProyecto.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionPresuTipoCuentaProyecto"));
				this.jInternalFrameImportacionPresuTipoCuentaProyecto.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionPresuTipoCuentaProyecto"));
			}
			
			//ORDER BY
			this.jButtonAbrirOrderByPresuTipoCuentaProyecto.addActionListener (new ButtonActionListener(this,"AbrirOrderByPresuTipoCuentaProyecto"));
			
			this.jButtonAbrirOrderByToolBarPresuTipoCuentaProyecto.addActionListener (new ButtonActionListener(this,"AbrirOrderByToolBarPresuTipoCuentaProyecto"));			
			
			if(this.jInternalFrameOrderByPresuTipoCuentaProyecto!=null) {
				this.jInternalFrameOrderByPresuTipoCuentaProyecto.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByPresuTipoCuentaProyecto"));				
			}
			
			
		}
		
		
		
		if(!this.conCargarMinimo) {
			if(this.jInternalFrameDetalleFormPresuTipoCuentaProyecto!=null) { //if(this.conCargarFormDetalle) {
			;
			}
		}
		
		
		//TABBED PANE RELACIONES
		if(this.jInternalFrameDetalleFormPresuTipoCuentaProyecto!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormPresuTipoCuentaProyecto.jTabbedPaneRelacionesPresuTipoCuentaProyecto.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesPresuTipoCuentaProyecto"));
		
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
            		closingInternalFramePresuTipoCuentaProyecto();
				} catch (Exception e) {
					e.printStackTrace();
				}
            }
        });
		
		this.jInternalFrameDetalleFormPresuTipoCuentaProyecto.addInternalFrameListener(new javax.swing.event.InternalFrameAdapter() {
	        public void internalFrameClosing(InternalFrameEvent event) {
	            JInternalFrameBase jInternalFrameDetalleFormPresuTipoCuentaProyecto = (JInternalFrameBase)event.getSource();
	            	
	            PresuTipoCuentaProyectoBeanSwingJInternalFrame jInternalFrameParent=(PresuTipoCuentaProyectoBeanSwingJInternalFrame)jInternalFrameDetalleFormPresuTipoCuentaProyecto.getjInternalFrameParent();
	                
	            try {
					jInternalFrameParent.jButtonCancelarPresuTipoCuentaProyectoActionPerformed(null);
					
					//jInternalFrameParent.dispose();
					//jInternalFrameParent=null;
					
				} catch (Exception e) {
					e.printStackTrace();
				}
	        }
	    });
			
		this.jTableDatosPresuTipoCuentaProyecto.getSelectionModel().addListSelectionListener (
	                new ListSelectionListener() {
	                    public void valueChanged(ListSelectionEvent e) {
							//BYDAN_DESHABILITADO
	                    	//try {jTableDatosPresuTipoCuentaProyectoListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
	                    }
	                }
	     );
		
		this.jTableDatosPresuTipoCuentaProyecto.addMouseListener(new MouseAdapter() {
			   public void mouseClicked(MouseEvent evt) {
				      if (evt.getClickCount() == 2) {
				    	  jButtonIdActionPerformed(null,jTableDatosPresuTipoCuentaProyecto.getSelectedRow(),false,false);
				      }
				   }
		});
		
		this.jButtonNuevoPresuTipoCuentaProyecto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoPresuTipoCuentaProyectoActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoToolBarPresuTipoCuentaProyecto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoPresuTipoCuentaProyectoActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoPresuTipoCuentaProyecto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoPresuTipoCuentaProyectoActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoPresuTipoCuentaProyecto";
		inputMap = this.jButtonNuevoPresuTipoCuentaProyecto.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_N , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoPresuTipoCuentaProyecto.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoPresuTipoCuentaProyectoActionPerformed(evt,false);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonNuevoRelacionesPresuTipoCuentaProyecto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoPresuTipoCuentaProyectoActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoRelacionesToolBarPresuTipoCuentaProyecto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoPresuTipoCuentaProyectoActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoRelacionesPresuTipoCuentaProyecto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoPresuTipoCuentaProyectoActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoRelacionesPresuTipoCuentaProyecto";
		inputMap = this.jButtonNuevoRelacionesPresuTipoCuentaProyecto.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_R , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoRelacionesPresuTipoCuentaProyecto.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoPresuTipoCuentaProyectoActionPerformed(evt,true);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonModificarPresuTipoCuentaProyecto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarPresuTipoCuentaProyectoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonModificarToolBarPresuTipoCuentaProyecto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarPresuTipoCuentaProyectoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemModificarPresuTipoCuentaProyecto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarPresuTipoCuentaProyectoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ModificarPresuTipoCuentaProyecto";
		inputMap = this.jButtonModificarPresuTipoCuentaProyecto.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_M , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonModificarPresuTipoCuentaProyecto.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonModificarPresuTipoCuentaProyectoActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonActualizarPresuTipoCuentaProyecto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarPresuTipoCuentaProyectoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonActualizarToolBarPresuTipoCuentaProyecto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarPresuTipoCuentaProyectoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemActualizarPresuTipoCuentaProyecto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarPresuTipoCuentaProyectoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ActualizarPresuTipoCuentaProyecto";
		inputMap = this.jButtonActualizarPresuTipoCuentaProyecto.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonActualizarPresuTipoCuentaProyecto.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonActualizarPresuTipoCuentaProyectoActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonEliminarPresuTipoCuentaProyecto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarPresuTipoCuentaProyectoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonEliminarToolBarPresuTipoCuentaProyecto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarPresuTipoCuentaProyectoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
				
		this.jMenuItemEliminarPresuTipoCuentaProyecto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarPresuTipoCuentaProyectoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "EliminarPresuTipoCuentaProyecto";
		inputMap = this.jButtonEliminarPresuTipoCuentaProyecto.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_E , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonEliminarPresuTipoCuentaProyecto.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonEliminarPresuTipoCuentaProyectoActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCancelarPresuTipoCuentaProyecto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarPresuTipoCuentaProyectoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCancelarToolBarPresuTipoCuentaProyecto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarPresuTipoCuentaProyectoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCancelarPresuTipoCuentaProyecto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarPresuTipoCuentaProyectoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CancelarPresuTipoCuentaProyecto";
		inputMap = this.jButtonCancelarPresuTipoCuentaProyecto.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_Q , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonCancelarPresuTipoCuentaProyecto.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCancelarPresuTipoCuentaProyectoActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCerrarPresuTipoCuentaProyecto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarPresuTipoCuentaProyectoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCerrarToolBarPresuTipoCuentaProyecto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarPresuTipoCuentaProyectoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCerrarPresuTipoCuentaProyecto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarPresuTipoCuentaProyectoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemDetalleCerrarPresuTipoCuentaProyecto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  //try {jButtonCerrarPresuTipoCuentaProyectoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
					try {jButtonCancelarPresuTipoCuentaProyectoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CerrarPresuTipoCuentaProyecto";
		inputMap = this.jButtonCerrarPresuTipoCuentaProyecto.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_C , KeyEvent.ALT_MASK), sMapKey);
			
		this.jButtonCerrarPresuTipoCuentaProyecto.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCerrarPresuTipoCuentaProyectoActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jInternalFrameDetalleFormPresuTipoCuentaProyecto.jButtonGuardarCambiosPresuTipoCuentaProyecto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosPresuTipoCuentaProyectoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosToolBarPresuTipoCuentaProyecto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosPresuTipoCuentaProyectoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosPresuTipoCuentaProyecto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosPresuTipoCuentaProyectoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaPresuTipoCuentaProyecto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosPresuTipoCuentaProyectoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaToolBarPresuTipoCuentaProyecto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosPresuTipoCuentaProyectoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosTablaPresuTipoCuentaProyecto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosPresuTipoCuentaProyectoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "GuardarCambiosPresuTipoCuentaProyecto";
		inputMap = this.jInternalFrameDetalleFormPresuTipoCuentaProyecto.jButtonGuardarCambiosPresuTipoCuentaProyecto.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jInternalFrameDetalleFormPresuTipoCuentaProyecto.jButtonGuardarCambiosPresuTipoCuentaProyecto.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonGuardarCambiosPresuTipoCuentaProyectoActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonRecargarInformacionPresuTipoCuentaProyecto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionPresuTipoCuentaProyectoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonRecargarInformacionToolBarPresuTipoCuentaProyecto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionPresuTipoCuentaProyectoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemRecargarInformacionPresuTipoCuentaProyecto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionPresuTipoCuentaProyectoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		this.jButtonAnterioresPresuTipoCuentaProyecto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresPresuTipoCuentaProyectoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAnterioresToolBarPresuTipoCuentaProyecto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresPresuTipoCuentaProyectoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemAnterioresPresuTipoCuentaProyecto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresPresuTipoCuentaProyectoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesPresuTipoCuentaProyecto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesPresuTipoCuentaProyectoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesToolBarPresuTipoCuentaProyecto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesPresuTipoCuentaProyectoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemSiguientesPresuTipoCuentaProyecto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesPresuTipoCuentaProyectoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosPresuTipoCuentaProyecto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosPresuTipoCuentaProyectoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosToolBarPresuTipoCuentaProyecto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosPresuTipoCuentaProyectoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoGuardarCambiosPresuTipoCuentaProyecto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosPresuTipoCuentaProyectoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		//SELECCIONAR TODOS
		this.jCheckBoxSeleccionarTodosPresuTipoCuentaProyecto.addItemListener(new ItemListener() {		
			public void itemStateChanged(ItemEvent evt) {
				try {jCheckBoxSeleccionarTodosPresuTipoCuentaProyectoItemListener(evt);}catch(Exception e){e.printStackTrace();}
			}
		});

		this.jComboBoxTiposAccionesPresuTipoCuentaProyecto.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposAccionesPresuTipoCuentaProyectoActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jComboBoxTiposSeleccionarPresuTipoCuentaProyecto.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposSeleccionarPresuTipoCuentaProyectoActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jTextFieldValorCampoGeneralPresuTipoCuentaProyecto.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jTextFieldValorCampoGeneralPresuTipoCuentaProyectoActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPresuTipoCuentaProyecto.jButtonidPresuTipoCuentaProyectoBusqueda.addActionListener(new ButtonActionListener(this,"idPresuTipoCuentaProyectoBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormPresuTipoCuentaProyecto.jButtonid_empresaPresuTipoCuentaProyectoUpdate.addActionListener(new ButtonActionListener(this,"id_empresaPresuTipoCuentaProyectoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPresuTipoCuentaProyecto.jButtonid_empresaPresuTipoCuentaProyectoBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaPresuTipoCuentaProyectoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPresuTipoCuentaProyecto.jButtoncodigoPresuTipoCuentaProyectoBusqueda.addActionListener(new ButtonActionListener(this,"codigoPresuTipoCuentaProyectoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPresuTipoCuentaProyecto.jButtonnombrePresuTipoCuentaProyectoBusqueda.addActionListener(new ButtonActionListener(this,"nombrePresuTipoCuentaProyectoBusqueda"));
		
		
		this.jButtonBusquedaPorCodigoPresuTipoCuentaProyecto.addActionListener(new ButtonActionListener(this,"BusquedaPorCodigoPresuTipoCuentaProyecto"));

		this.jButtonBusquedaPorNombrePresuTipoCuentaProyecto.addActionListener(new ButtonActionListener(this,"BusquedaPorNombrePresuTipoCuentaProyecto"));

		
		//REPORTE DINAMICO
		this.jButtonCerrarReporteDinamicoPresuTipoCuentaProyecto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarReporteDinamicoPresuTipoCuentaProyectoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarReporteDinamicoPresuTipoCuentaProyecto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarReporteDinamicoPresuTipoCuentaProyectoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarExcelReporteDinamicoPresuTipoCuentaProyecto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarExcelReporteDinamicoPresuTipoCuentaProyectoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		//IMPORTACION
		this.jButtonCerrarImportacionPresuTipoCuentaProyecto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarImportacionPresuTipoCuentaProyectoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarImportacionPresuTipoCuentaProyecto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarImportacionPresuTipoCuentaProyectoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAbrirImportacionPresuTipoCuentaProyecto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAbrirImportacionPresuTipoCuentaProyectoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
	}
	*/
	
	
	public void jComboBoxTiposSeleccionarPresuTipoCuentaProyectoActionListener(ActionEvent evt) throws Exception {    		
		try {			
			Reporte reporte=(Reporte)this.jComboBoxTiposSeleccionarPresuTipoCuentaProyecto.getSelectedItem();
			
			//if(reporte.getsCodigo().equals("SELECCIONAR")) {
			//}					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PresuTipoCuentaProyectoConstantesFunciones.CLASSNAME);
		}
	}	
	
	
	
	public void seleccionarTodosPresuTipoCuentaProyecto(Boolean conSeleccionarTodos) throws Exception {    		
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				for(PresuTipoCuentaProyecto presutipocuentaproyectoAux:this.presutipocuentaproyectoLogic.getPresuTipoCuentaProyectos()) {
					presutipocuentaproyectoAux.setIsSelected(conSeleccionarTodos);
				}			
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(PresuTipoCuentaProyecto presutipocuentaproyectoAux:presutipocuentaproyectos) {
					presutipocuentaproyectoAux.setIsSelected(conSeleccionarTodos);
				}
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PresuTipoCuentaProyectoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarTodosPresuTipoCuentaProyectoItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingPresuTipoCuentaProyecto(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			
			if(sTipoSeleccionar.equals("COLUMNAS")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(PresuTipoCuentaProyecto presutipocuentaproyectoAux:this.presutipocuentaproyectoLogic.getPresuTipoCuentaProyectos()) {
						presutipocuentaproyectoAux.setIsSelected(this.isSeleccionarTodos);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(PresuTipoCuentaProyecto presutipocuentaproyectoAux:presutipocuentaproyectos) {
						presutipocuentaproyectoAux.setIsSelected(this.isSeleccionarTodos);
					}
				}
			} else {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					for(PresuTipoCuentaProyecto presutipocuentaproyectoAux:this.presutipocuentaproyectoLogic.getPresuTipoCuentaProyectos()) {
					
					}	
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(PresuTipoCuentaProyecto presutipocuentaproyectoAux:presutipocuentaproyectos) {
						
					}
				}
			}
					
			if(existe) {
				this.inicializarActualizarBindingTablaPresuTipoCuentaProyecto(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosPresuTipoCuentaProyecto.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosPresuTipoCuentaProyecto.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosPresuTipoCuentaProyecto,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PresuTipoCuentaProyectoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionadosPresuTipoCuentaProyectoItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingPresuTipoCuentaProyecto(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			int[] arrNumRowsSeleccionados=null;
			
			arrNumRowsSeleccionados=this.jTableDatosPresuTipoCuentaProyecto.getSelectedRows();
			
			PresuTipoCuentaProyecto presutipocuentaproyectoLocal=new PresuTipoCuentaProyecto();
			
			//this.seleccionarTodosPresuTipoCuentaProyecto(false);
			
			for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					presutipocuentaproyectoLocal =(PresuTipoCuentaProyecto) this.presutipocuentaproyectoLogic.getPresuTipoCuentaProyectos().toArray()[this.jTableDatosPresuTipoCuentaProyecto.convertRowIndexToModel(iNumRowSeleccionado)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					presutipocuentaproyectoLocal =(PresuTipoCuentaProyecto) this.presutipocuentaproyectos.toArray()[this.jTableDatosPresuTipoCuentaProyecto.convertRowIndexToModel(iNumRowSeleccionado)];
				}
				
				presutipocuentaproyectoLocal.setIsSelected(this.isSeleccionados);
			}
			
			/*
			if(sTipoSeleccionar.equals("SELECCIONAR")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(PresuTipoCuentaProyecto presutipocuentaproyectoAux:this.presutipocuentaproyectoLogic.getPresuTipoCuentaProyectos()) {
						presutipocuentaproyectoAux.setIsSelected(this.isSeleccionados);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(PresuTipoCuentaProyecto presutipocuentaproyectoAux:presutipocuentaproyectos) {
						presutipocuentaproyectoAux.setIsSelected(this.isSeleccionados);
					}
				}
			}
			*/
			
			//if(existe) {
				this.inicializarActualizarBindingTablaPresuTipoCuentaProyecto(false);
			/*
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			*/
			
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosPresuTipoCuentaProyecto.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosPresuTipoCuentaProyecto.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosPresuTipoCuentaProyecto,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PresuTipoCuentaProyectoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarActualPresuTipoCuentaProyectoItemListener(ItemEvent evt,Long idActual) throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PresuTipoCuentaProyectoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void ejecutarAuxiliarPresuTipoCuentaProyectoParaAjaxPostBack() throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PresuTipoCuentaProyectoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jTextFieldValorCampoGeneralPresuTipoCuentaProyectoActionListener(ActionEvent evt) throws Exception {    		
		try {
			this.inicializarActualizarBindingPresuTipoCuentaProyecto(false,false);
			
			//System.out.println(this.jTextFieldValorCampoGeneralPresuTipoCuentaProyecto.getText());		
			
			Boolean existe=false;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(PresuTipoCuentaProyecto presutipocuentaproyectoAux:this.presutipocuentaproyectoLogic.getPresuTipoCuentaProyectos()) {
				
						if(sTipoSeleccionar.equals(PresuTipoCuentaProyectoConstantesFunciones.LABEL_CODIGO)) {
							existe=true;
							presutipocuentaproyectoAux.setcodigo(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(PresuTipoCuentaProyectoConstantesFunciones.LABEL_NOMBRE)) {
							existe=true;
							presutipocuentaproyectoAux.setnombre(this.sValorCampoGeneral);
						}
				}	
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(PresuTipoCuentaProyecto presutipocuentaproyectoAux:presutipocuentaproyectos) {
					
						if(sTipoSeleccionar.equals(PresuTipoCuentaProyectoConstantesFunciones.LABEL_CODIGO)) {
							existe=true;
							presutipocuentaproyectoAux.setcodigo(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(PresuTipoCuentaProyectoConstantesFunciones.LABEL_NOMBRE)) {
							existe=true;
							presutipocuentaproyectoAux.setnombre(this.sValorCampoGeneral);
						}
				}
			}
								
			if(existe) {
				this.inicializarActualizarBindingTablaPresuTipoCuentaProyecto(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PresuTipoCuentaProyectoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jComboBoxTiposAccionesPresuTipoCuentaProyectoActionListener(ActionEvent evt,Boolean esParaAccionDesdeFormulario) throws Exception {    				
		Boolean conSplash=true;
		
		try {							
		
			this.inicializarActualizarBindingPresuTipoCuentaProyecto(false,false);
			
			Reporte reporte=new Reporte();
			
			this.esParaAccionDesdeFormularioPresuTipoCuentaProyecto=esParaAccionDesdeFormulario;
			
			if(!esParaAccionDesdeFormulario) {
				
				reporte=(Reporte)this.jComboBoxTiposAccionesPresuTipoCuentaProyecto.getSelectedItem();
				
			} else {
				reporte=(Reporte)this.jInternalFrameDetalleFormPresuTipoCuentaProyecto.jComboBoxTiposAccionesFormularioPresuTipoCuentaProyecto.getSelectedItem();
			}
			String sTipoAccionLocal=this.sTipoAccion;
			
			if(!esParaAccionDesdeFormulario) {
				sTipoAccionLocal=this.sTipoAccion;
			} else {
				sTipoAccionLocal=this.sTipoAccionFormulario;
			}
			
			if(sTipoAccionLocal.equals("GENERAR REPORTE")) {//reporte.getsCodigo().equals("GENERAR REPORTE")) {
				if(this.isPermisoReportePresuTipoCuentaProyecto) {				
					conSplash=true;//false;										
					
					//this.startProcessPresuTipoCuentaProyecto(conSplash);
				
					this.generarReportePresuTipoCuentaProyectosSeleccionados();
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesPresuTipoCuentaProyecto.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormPresuTipoCuentaProyecto.jComboBoxTiposAccionesFormularioPresuTipoCuentaProyecto.setSelectedIndex(0);					
				}
			} else if(sTipoAccionLocal.equals("GENERAR REPORTE DINAMICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.mostrarReporteDinamicoPresuTipoCuentaProyectosSeleccionados();
				//this.jComboBoxTiposAccionesPresuTipoCuentaProyecto.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("GENERAR_REPORTE_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoPresuTipoCuentaProyectosSeleccionados(false);
				//this.jComboBoxTiposAccionesPresuTipoCuentaProyecto.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("GENERAR_REPORTE_TOTALES_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoPresuTipoCuentaProyectosSeleccionados(true);
				//this.jComboBoxTiposAccionesPresuTipoCuentaProyecto.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessPresuTipoCuentaProyecto();
				
				this.exportarPresuTipoCuentaProyectosSeleccionados();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesPresuTipoCuentaProyecto.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormPresuTipoCuentaProyecto.jComboBoxTiposAccionesFormularioPresuTipoCuentaProyecto.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("IMPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				this.mostrarImportacionPresuTipoCuentaProyectos();
				//this.importarPresuTipoCuentaProyectos();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesPresuTipoCuentaProyecto.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormPresuTipoCuentaProyecto.jComboBoxTiposAccionesFormularioPresuTipoCuentaProyecto.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS_EXCEL")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessPresuTipoCuentaProyecto();
				//SE EXPORTA SEGUN TIPO ARCHIVO SELECCIONADO
				//this.exportarExcelPresuTipoCuentaProyectosSeleccionados();
				//this.jComboBoxTiposAccionesPresuTipoCuentaProyecto.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("RECARGAR_FK")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {								
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE RECARGAR REFERENCIAS ?", "MANTENIMIENTO DE Tipo Cuenta Proyecto", JOptionPane.OK_CANCEL_OPTION) == 0) {
				
				//this.startProcessPresuTipoCuentaProyecto();
				
					if(!esParaAccionDesdeFormulario || (esParaAccionDesdeFormulario && this.isEsNuevoPresuTipoCuentaProyecto)) {
						this.esRecargarFks=true;
						this.cargarCombosForeignKeyPresuTipoCuentaProyecto(false,false,false);
						this.esRecargarFks=false;
						
						JOptionPane.showMessageDialog(this,"PROCESO EJECUTADO CORRECTAMENTE","MANTENIMIENTO DE Tipo Cuenta Proyecto",JOptionPane.INFORMATION_MESSAGE);
					} else {
						JOptionPane.showMessageDialog(this,"ESTE PROCESO SOLO FUNCIONA AL INGRESAR UN NUEVO ELEMENTO","MANTENIMIENTO",JOptionPane.ERROR_MESSAGE);	
					}
					
					
				}
				
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesPresuTipoCuentaProyecto.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormPresuTipoCuentaProyecto.jComboBoxTiposAccionesFormularioPresuTipoCuentaProyecto.setSelectedIndex(0);					
				}	
			} 			
			else if(PresuTipoCuentaProyectoBeanSwingJInternalFrame.EsProcesoReporte(reporte.getsCodigo())){
				if(this.isPermisoReportePresuTipoCuentaProyecto) {				
					if(this.tieneElementosSeleccionados()) {
						this.quitarFilaTotales();
						
						conSplash=false;
						
						//this.startProcessPresuTipoCuentaProyecto(conSplash);
					
						//this.actualizarParametrosGeneralPresuTipoCuentaProyecto();
						
						this.generarReporteProcesoAccionPresuTipoCuentaProyectosSeleccionados(reporte.getsCodigo());
						
						if(!esParaAccionDesdeFormulario) {
							
							this.jComboBoxTiposAccionesPresuTipoCuentaProyecto.setSelectedIndex(0);					
							
						} else {
							this.jInternalFrameDetalleFormPresuTipoCuentaProyecto.jComboBoxTiposAccionesFormularioPresuTipoCuentaProyecto.setSelectedIndex(0);					
						}
					} else {
						JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
			} 
			else if(PresuTipoCuentaProyectoBeanSwingJInternalFrameAdditional.EsProcesoAccionNormal(reporte.getsCodigo())){
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR "+reporte.getsDescripcion()+" EN PROCESO Tipo Cuenta ProyectoS SELECCIONADOS?", "MANTENIMIENTO DE Tipo Cuenta Proyecto", JOptionPane.OK_CANCEL_OPTION) == 0) {
						//this.startProcessPresuTipoCuentaProyecto();
				
						this.actualizarParametrosGeneralPresuTipoCuentaProyecto();
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {						
							this.presutipocuentaproyectoReturnGeneral=presutipocuentaproyectoLogic.procesarAccionPresuTipoCuentaProyectosWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,sTipoAccionLocal,this.presutipocuentaproyectoLogic.getPresuTipoCuentaProyectos(),this.presutipocuentaproyectoParameterGeneral);
						
						} else if(Constantes.ISUSAEJBREMOTE) {
						
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
						this.procesarPresuTipoCuentaProyectoReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesPresuTipoCuentaProyecto.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormPresuTipoCuentaProyecto.jComboBoxTiposAccionesFormularioPresuTipoCuentaProyecto.setSelectedIndex(0);					
					}
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}				
			} 
			else {
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					this.actualizarParametrosGeneralPresuTipoCuentaProyecto();
					
					PresuTipoCuentaProyectoBeanSwingJInternalFrameAdditional.ProcesarAccion(reporte.getsCodigo(),reporte.getsDescripcion(),this);
					
					this.procesarPresuTipoCuentaProyectoReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesPresuTipoCuentaProyecto.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormPresuTipoCuentaProyecto.jComboBoxTiposAccionesFormularioPresuTipoCuentaProyecto.setSelectedIndex(0);					
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}
			}
		} catch(Exception e) {
			this.esRecargarFks=false;
			
			FuncionesSwing.manageException(this, e,logger,PresuTipoCuentaProyectoConstantesFunciones.CLASSNAME);
		
		}  finally {
      		//this.finishProcessPresuTipoCuentaProyecto(conSplash);
      	}
	}
	
	public void jComboBoxTiposRelacionesPresuTipoCuentaProyectoActionListener(ActionEvent evt) throws Exception {    				
		Boolean conSplash=true;
		
		try {			
			this.startProcessPresuTipoCuentaProyecto();
			
			if(this.jInternalFrameDetalleFormPresuTipoCuentaProyecto==null) { //if(!this.conCargarFormDetalle) {			
				this.inicializarFormDetalle();
			}
			
			ArrayList<PresuTipoCuentaProyecto> presutipocuentaproyectosSeleccionados=new ArrayList<PresuTipoCuentaProyecto>();		
			PresuTipoCuentaProyecto presutipocuentaproyecto=new PresuTipoCuentaProyecto();
			
			int rowIndex=-1;//CON ESTO SE DESHABILITA SELECCION POR INDICE
			
			this.inicializarActualizarBindingPresuTipoCuentaProyecto(false,false);
			
			Reporte reporte=new Reporte();
			
			
			reporte=(Reporte)this.jComboBoxTiposRelacionesPresuTipoCuentaProyecto.getSelectedItem();
			
			
			
			
			presutipocuentaproyectosSeleccionados=this.getPresuTipoCuentaProyectosSeleccionados(true);
			//this.sTipoAccion;
			
			if(presutipocuentaproyectosSeleccionados.size()==1) {
				for(PresuTipoCuentaProyecto presutipocuentaproyectoAux:presutipocuentaproyectosSeleccionados) {
					presutipocuentaproyecto=presutipocuentaproyectoAux;
				}
				
				if(this.sTipoAccion.equals("NONE")) {
				
				}
				
			} else {
				JOptionPane.showMessageDialog(this,"SELECCIONE SOLO UN REGISTRO","RELACIONES",JOptionPane.ERROR_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PresuTipoCuentaProyectoConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.finishProcessPresuTipoCuentaProyecto();
			
      		//this.finishProcessPresuTipoCuentaProyecto(conSplash);
      	}
	}
			
	public static Boolean EsProcesoReporte(String sTipoProceso) throws Exception {
		Boolean esProcesoAccionRepoorte=false;

		if(sTipoProceso.contains("REPORTE_")) {
			 esProcesoAccionRepoorte=true;
		}

		return esProcesoAccionRepoorte;
	}
	
	public void procesarPresuTipoCuentaProyectoReturnGeneral() throws Exception {
		if(this.presutipocuentaproyectoReturnGeneral.getConRetornoEstaProcesado()) {
			JOptionPane.showMessageDialog(this,this.presutipocuentaproyectoReturnGeneral.getsMensajeProceso(),"PROCESO",JOptionPane.INFORMATION_MESSAGE);
		}
		
		if(this.presutipocuentaproyectoReturnGeneral.getConMostrarMensaje()) {
			JOptionPane.showMessageDialog(this,this.presutipocuentaproyectoReturnGeneral.getsMensajeProceso(),"PROCESO",FuncionesSwing.getColorSelectedBackground(this.presutipocuentaproyectoReturnGeneral.getsTipoMensaje()));
		}
		
		if(this.presutipocuentaproyectoReturnGeneral.getConRecargarInformacion()) {
			this.procesarBusqueda(this.sAccionBusqueda);
			
			this.inicializarActualizarBindingPresuTipoCuentaProyecto(false);
		}
		
		if(this.presutipocuentaproyectoReturnGeneral.getConRetornoLista() || this.presutipocuentaproyectoReturnGeneral.getConRetornoObjeto()) {
			if(this.presutipocuentaproyectoReturnGeneral.getConRetornoLista()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.presutipocuentaproyectoLogic.setPresuTipoCuentaProyectos(this.presutipocuentaproyectoReturnGeneral.getPresuTipoCuentaProyectos());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			if(this.presutipocuentaproyectoReturnGeneral.getConRetornoObjeto()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.presutipocuentaproyectoLogic.setPresuTipoCuentaProyecto(this.presutipocuentaproyectoReturnGeneral.getPresuTipoCuentaProyecto());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			this.inicializarActualizarBindingPresuTipoCuentaProyecto(false);
		}
	}
	
	public void actualizarParametrosGeneralPresuTipoCuentaProyecto() throws Exception {
		
		
	}
	
	public ArrayList<PresuTipoCuentaProyecto> getPresuTipoCuentaProyectosSeleccionados(Boolean conSeleccionarTodosAutomatico) throws Exception {
		ArrayList<PresuTipoCuentaProyecto> presutipocuentaproyectosSeleccionados=new ArrayList<PresuTipoCuentaProyecto>();
		Boolean existe=false;
		
		if(!this.esParaAccionDesdeFormularioPresuTipoCuentaProyecto) {
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				
				for(PresuTipoCuentaProyecto presutipocuentaproyectoAux:presutipocuentaproyectoLogic.getPresuTipoCuentaProyectos()) {
					if(presutipocuentaproyectoAux.getIsSelected()) {
						presutipocuentaproyectosSeleccionados.add(presutipocuentaproyectoAux);				
					}
				}
				
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(PresuTipoCuentaProyecto presutipocuentaproyectoAux:this.presutipocuentaproyectos) {
					if(presutipocuentaproyectoAux.getIsSelected()) {
						presutipocuentaproyectosSeleccionados.add(presutipocuentaproyectoAux);				
					}
				}
			}
			
			if(presutipocuentaproyectosSeleccionados.size()>0) {
				existe=true;
			}
			
			//SI NO ESTA NINGUNO SELECCIONADO SE SELECCIONA TODOS
			if(!existe) {
				if(conSeleccionarTodosAutomatico) {
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						presutipocuentaproyectosSeleccionados.addAll(this.presutipocuentaproyectoLogic.getPresuTipoCuentaProyectos());
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						presutipocuentaproyectosSeleccionados.addAll(this.presutipocuentaproyectos);				
					}
				}
			}
		} else {
			presutipocuentaproyectosSeleccionados.add(this.presutipocuentaproyecto);
		}
		
		return presutipocuentaproyectosSeleccionados;
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
	
	public void generarReportePresuTipoCuentaProyectosSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoReporte.equals("NORMAL") || this.sTipoReporte.equals("FORMULARIO")) {
			existe=true;								
			this.generarReporteNormalPresuTipoCuentaProyectosSeleccionados();
			
		} else if(this.sTipoReporte.equals("DINAMICO")) {
			existe=true;
			this.mostrarReporteDinamicoPresuTipoCuentaProyectosSeleccionados();
			
		} else if(this.sTipoReporte.equals("GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoPresuTipoCuentaProyectosSeleccionados(false);
			
		} else if(this.sTipoReporte.equals("TOTALES_GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoPresuTipoCuentaProyectosSeleccionados(true);
		}
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE REPORTE VALIDO","REPORTE DE Tipo Cuenta Proyecto",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void generarReporteRelacionesPresuTipoCuentaProyectosSeleccionados() throws Exception {
		ArrayList<PresuTipoCuentaProyecto> presutipocuentaproyectosSeleccionados=new ArrayList<PresuTipoCuentaProyecto>();		
		
		presutipocuentaproyectosSeleccionados=this.getPresuTipoCuentaProyectosSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
					
		//this.sTipoReporteExtra="MasterRelaciones";
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		
		this.generarReportePresuTipoCuentaProyectos("Todos",presutipocuentaproyectosSeleccionados);
		
	}	
	
	public void generarReporteNormalPresuTipoCuentaProyectosSeleccionados() throws Exception {
		ArrayList<PresuTipoCuentaProyecto> presutipocuentaproyectosSeleccionados=new ArrayList<PresuTipoCuentaProyecto>();		
		
		presutipocuentaproyectosSeleccionados=this.getPresuTipoCuentaProyectosSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
								
		if(this.sTipoReporte.equals("FORMULARIO")) {
			this.sTipoReporteExtra="Vertical";					
		}
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.generarReportePresuTipoCuentaProyectos("Todos",presutipocuentaproyectosSeleccionados);
	}		
	
	public void generarReporteProcesoAccionPresuTipoCuentaProyectosSeleccionados(String sProcesoReporte) throws Exception {
		ArrayList<PresuTipoCuentaProyecto> presutipocuentaproyectosSeleccionados=new ArrayList<PresuTipoCuentaProyecto>();
		
		presutipocuentaproyectosSeleccionados=this.getPresuTipoCuentaProyectosSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(false,false,true,"");
		
		/*
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.sTipoReporteExtra=sProcesoReporte.toLowerCase();
		
		this.esReporteAccionProceso=true;
		this.generarReportePresuTipoCuentaProyectos("Todos",presutipocuentaproyectosSeleccionados);
		this.esReporteAccionProceso=false;
	}
	
	
	public void mostrarReporteDinamicoPresuTipoCuentaProyectosSeleccionados() throws Exception {
		ArrayList<PresuTipoCuentaProyecto> presutipocuentaproyectosSeleccionados=new ArrayList<PresuTipoCuentaProyecto>();		
		
		
		this.abrirInicializarFrameReporteDinamicoPresuTipoCuentaProyecto();
		
		
		presutipocuentaproyectosSeleccionados=this.getPresuTipoCuentaProyectosSeleccionados(true);
		
		this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirFrameReporteDinamicoPresuTipoCuentaProyecto();
		
		
		//this.generarReportePresuTipoCuentaProyectos("Todos",presutipocuentaproyectosSeleccionados ,presutipocuentaproyectoImplementable,presutipocuentaproyectoImplementableHome);
	}
	
	public void mostrarImportacionPresuTipoCuentaProyectos() throws Exception {
		//this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirInicializarFrameImportacionPresuTipoCuentaProyecto();
		
		this.abrirFrameImportacionPresuTipoCuentaProyecto();		
		
			
		//this.generarReportePresuTipoCuentaProyectos("Todos",presutipocuentaproyectosSeleccionados ,presutipocuentaproyectoImplementable,presutipocuentaproyectoImplementableHome);
	}
	
	public void importarPresuTipoCuentaProyectos() throws Exception {		
	
	}
	
	public void exportarPresuTipoCuentaProyectosSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoArchivoReporte.equals("EXCEL")) {
			existe=true;
			this.exportarExcelPresuTipoCuentaProyectosSeleccionados();
			
		} else if(this.sTipoArchivoReporte.equals("TEXTO")) {
			existe=true;
			this.exportarTextoPresuTipoCuentaProyectosSeleccionados();
		
		} else if(this.sTipoArchivoReporte.equals("XML")) {
			existe=true;
			this.exportarXmlPresuTipoCuentaProyectosSeleccionados();
		} 
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE ARCHIVO VALIDO","EXPORTACION DE Tipo Cuenta Proyecto",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void exportarTextoPresuTipoCuentaProyectosSeleccionados() throws Exception {
		ArrayList<PresuTipoCuentaProyecto> presutipocuentaproyectosSeleccionados=new ArrayList<PresuTipoCuentaProyecto>();		
		
		presutipocuentaproyectosSeleccionados=this.getPresuTipoCuentaProyectosSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"presutipocuentaproyecto."+"txt";//Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario);
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		BufferedWriter bufferedWriter = null;
		FileWriter fileWriter=null;
		
		fileWriter=new FileWriter(sPath);
		
		bufferedWriter = new BufferedWriter(fileWriter);
		
		try {
			if(conCabecera) {
				sFilaCabecera=this.getFilaCabeceraExportarPresuTipoCuentaProyecto(sDelimiter);
				
				bufferedWriter.write(sFilaCabecera);
			}				
			
			for(PresuTipoCuentaProyecto presutipocuentaproyectoAux:presutipocuentaproyectosSeleccionados) {
				sFilaDatos=this.getFilaDatosExportarPresuTipoCuentaProyecto(presutipocuentaproyectoAux,sDelimiter);
				
				bufferedWriter.write(sFilaDatos);
				
				//presutipocuentaproyectoAux.setsDetalleGeneralEntityReporte(presutipocuentaproyectoAux.toString());			
			}
			
			bufferedWriter.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.presutipocuentaproyectoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Cuenta Proyecto",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {
       		if (bufferedWriter != null) {
				bufferedWriter.close();
			}
		}
	}
	
	public String getFilaCabeceraExportarPresuTipoCuentaProyecto(String sDelimiter) {
		String sFilaCabecera="";
		
		
		sFilaCabecera+=PresuTipoCuentaProyectoConstantesFunciones.LABEL_ID;

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaCabecera+=sDelimiter;
		sFilaCabecera+=PresuTipoCuentaProyectoConstantesFunciones.LABEL_VERSIONROW;
		}

		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=PresuTipoCuentaProyectoConstantesFunciones.LABEL_IDEMPRESA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=PresuTipoCuentaProyectoConstantesFunciones.LABEL_CODIGO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=PresuTipoCuentaProyectoConstantesFunciones.LABEL_NOMBRE;
		
		return sFilaCabecera;
	}
	
	public String getFilaDatosExportarPresuTipoCuentaProyecto(PresuTipoCuentaProyecto presutipocuentaproyecto,String sDelimiter) {
		String sFilaDatos="";
		
		sFilaDatos+="\r\n";
		
		
		sFilaDatos+=presutipocuentaproyecto.getId().toString();

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaDatos+=sDelimiter;
		sFilaDatos+=presutipocuentaproyecto.getVersionRow().toString();
		}

		sFilaDatos+=sDelimiter;
		sFilaDatos+=presutipocuentaproyecto.getempresa_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=presutipocuentaproyecto.getcodigo();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=presutipocuentaproyecto.getnombre();
		
		return sFilaDatos;
	}
	
	//@SuppressWarnings("deprecation")
	public void exportarExcelPresuTipoCuentaProyectosSeleccionados() throws Exception {
		ArrayList<PresuTipoCuentaProyecto> presutipocuentaproyectosSeleccionados=new ArrayList<PresuTipoCuentaProyecto>();		
		
		presutipocuentaproyectosSeleccionados=this.getPresuTipoCuentaProyectosSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"presutipocuentaproyecto.xls";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		FileOutputStream fileOutputStream=null;
		
		try {
			HSSFWorkbook workbook = new HSSFWorkbook();
			HSSFSheet sheet = workbook.createSheet("PresuTipoCuentaProyectos");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			HSSFRow row = sheet.createRow(iRow);
			HSSFCell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");

			if(conCabecera) {
				this.getFilaCabeceraExportarExcelPresuTipoCuentaProyecto(row);				
				iRow++;
			}				
			
			for(PresuTipoCuentaProyecto presutipocuentaproyectoAux:presutipocuentaproyectosSeleccionados) {
				row = sheet.createRow(iRow);
				
				this.getFilaDatosExportarExcelPresuTipoCuentaProyecto(presutipocuentaproyectoAux,row);
				
				iRow++;
			}
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.presutipocuentaproyectoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Cuenta Proyecto",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			
       		if (fileOutputStream != null) {
				fileOutputStream.close();
			}			
		}
	}		
	
	public void exportarXmlPresuTipoCuentaProyectosSeleccionados() throws Exception {
		ArrayList<PresuTipoCuentaProyecto> presutipocuentaproyectosSeleccionados=new ArrayList<PresuTipoCuentaProyecto>();		
		
		presutipocuentaproyectosSeleccionados=this.getPresuTipoCuentaProyectosSeleccionados(true);
		
		//String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		//Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		//String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"presutipocuentaproyecto.xml";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		DocumentBuilderFactory documentBuilderFactory=null;
		DocumentBuilder documentBuilder =null;
		
		try {
			documentBuilderFactory = DocumentBuilderFactory.newInstance();
			documentBuilder = documentBuilderFactory.newDocumentBuilder();
	
			Document document = documentBuilder.newDocument();
			Element elementRoot = document.createElement("presutipocuentaproyectos");
			
			document.appendChild(elementRoot);
		    			
												
			Element element = null;//document.createElement("presutipocuentaproyecto");
			//elementRoot.appendChild(element);
		
			for(PresuTipoCuentaProyecto presutipocuentaproyectoAux:presutipocuentaproyectosSeleccionados) {
				element = document.createElement("presutipocuentaproyecto");
				elementRoot.appendChild(element);
			
				this.setFilaDatosExportarXmlPresuTipoCuentaProyecto(presutipocuentaproyectoAux,document,element);
			}
			
			TransformerFactory transformerFactory = TransformerFactory.newInstance();
			Transformer transformer = transformerFactory.newTransformer();
			DOMSource domSource = new DOMSource(document);
			
			StreamResult streamResult = new StreamResult(new File(sPath));
	
			transformer.transform(domSource, streamResult);
						
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.presutipocuentaproyectoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Cuenta Proyecto",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			       				
		}
	}	
	
	//@SuppressWarnings("deprecation")
	public void getFilaCabeceraExportarExcelPresuTipoCuentaProyecto(HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(PresuTipoCuentaProyectoConstantesFunciones.LABEL_ID);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
		cell = row.createCell(iColumn++);cell.setCellValue(PresuTipoCuentaProyectoConstantesFunciones.LABEL_VERSIONROW);
		}

		cell = row.createCell(iColumn++);cell.setCellValue(PresuTipoCuentaProyectoConstantesFunciones.LABEL_IDEMPRESA);
		cell = row.createCell(iColumn++);cell.setCellValue(PresuTipoCuentaProyectoConstantesFunciones.LABEL_CODIGO);
		cell = row.createCell(iColumn++);cell.setCellValue(PresuTipoCuentaProyectoConstantesFunciones.LABEL_NOMBRE);
	}
	
	//@SuppressWarnings("deprecation")
	public void getFilaDatosExportarExcelPresuTipoCuentaProyecto(PresuTipoCuentaProyecto presutipocuentaproyecto,HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(presutipocuentaproyecto.getId());
		cell = row.createCell(iColumn++);cell.setCellValue(presutipocuentaproyecto.getempresa_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(presutipocuentaproyecto.getcodigo());
		cell = row.createCell(iColumn++);cell.setCellValue(presutipocuentaproyecto.getnombre());				
	}
	
	public void setFilaDatosExportarXmlPresuTipoCuentaProyecto(PresuTipoCuentaProyecto presutipocuentaproyecto,Document document,Element element) {
		/*
		Element lastname = document.createElement("lastname");
		lastname.appendChild(document.createTextNode("mook kim"));
		element.appendChild(lastname);
		*/
		

		Element elementId = document.createElement(PresuTipoCuentaProyectoConstantesFunciones.ID);
		elementId.appendChild(document.createTextNode(presutipocuentaproyecto.getId().toString().trim()));
		element.appendChild(elementId);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){

		Element elementVersionRow = document.createElement(PresuTipoCuentaProyectoConstantesFunciones.VERSIONROW);
		elementVersionRow.appendChild(document.createTextNode(presutipocuentaproyecto.getVersionRow().toString().trim()));
		element.appendChild(elementVersionRow);
		}


		Element elementempresa_descripcion = document.createElement(PresuTipoCuentaProyectoConstantesFunciones.IDEMPRESA);
		elementempresa_descripcion.appendChild(document.createTextNode(presutipocuentaproyecto.getempresa_descripcion()));
		element.appendChild(elementempresa_descripcion);

		Element elementcodigo = document.createElement(PresuTipoCuentaProyectoConstantesFunciones.CODIGO);
		elementcodigo.appendChild(document.createTextNode(presutipocuentaproyecto.getcodigo().trim()));
		element.appendChild(elementcodigo);

		Element elementnombre = document.createElement(PresuTipoCuentaProyectoConstantesFunciones.NOMBRE);
		elementnombre.appendChild(document.createTextNode(presutipocuentaproyecto.getnombre().trim()));
		element.appendChild(elementnombre);
	}
	
	public void generarReporteGroupGenericoPresuTipoCuentaProyectosSeleccionados(Boolean soloTotales) throws Exception {
		ArrayList<PresuTipoCuentaProyecto> presutipocuentaproyectosSeleccionados=new ArrayList<PresuTipoCuentaProyecto>();
		
		presutipocuentaproyectosSeleccionados=this.getPresuTipoCuentaProyectosSeleccionados(true);
		
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
		
		this.setColumnaDescripcionReporteGroupGenericoPresuTipoCuentaProyecto(presutipocuentaproyectosSeleccionados);
		
		this.generarReportePresuTipoCuentaProyectos("Todos",presutipocuentaproyectosSeleccionados);
	}
	
	public void setColumnaDescripcionReporteGroupGenericoPresuTipoCuentaProyecto(ArrayList<PresuTipoCuentaProyecto> presutipocuentaproyectosSeleccionados) throws Exception {    		
		try {
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			
			Boolean existe=false;
			
			for(PresuTipoCuentaProyecto presutipocuentaproyectoAux:presutipocuentaproyectosSeleccionados) {
				presutipocuentaproyectoAux.setsDetalleGeneralEntityReporte(presutipocuentaproyectoAux.toString());
			
				if(sTipoSeleccionar.equals(PresuTipoCuentaProyectoConstantesFunciones.LABEL_IDEMPRESA)) {
					existe=true;
					presutipocuentaproyectoAux.setsDescripcionGeneralEntityReporte1(presutipocuentaproyectoAux.getempresa_descripcion());
				}
				 else if(sTipoSeleccionar.equals(PresuTipoCuentaProyectoConstantesFunciones.LABEL_CODIGO)) {
					existe=true;
					presutipocuentaproyectoAux.setsDescripcionGeneralEntityReporte1(presutipocuentaproyectoAux.getcodigo());
				}
				 else if(sTipoSeleccionar.equals(PresuTipoCuentaProyectoConstantesFunciones.LABEL_NOMBRE)) {
					existe=true;
					presutipocuentaproyectoAux.setsDescripcionGeneralEntityReporte1(presutipocuentaproyectoAux.getnombre());
				}
			}	
											
			if(!existe) {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}										
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PresuTipoCuentaProyectoConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void actualizarEstadoCeldasBotonesPresuTipoCuentaProyecto(String sAccion,Boolean isGuardarCambiosEnLote,Boolean isEsMantenimientoRelacionado) throws Exception {
		if(sAccion=="n") {
			if(!this.esParaBusquedaForeignKey) {
				this.isVisibilidadCeldaNuevoPresuTipoCuentaProyecto=true;
				this.isVisibilidadCeldaNuevoRelacionesPresuTipoCuentaProyecto=true;
				this.isVisibilidadCeldaGuardarCambiosPresuTipoCuentaProyecto=true;
			}
			
			this.isVisibilidadCeldaModificarPresuTipoCuentaProyecto=false;
			this.isVisibilidadCeldaActualizarPresuTipoCuentaProyecto=false;
			this.isVisibilidadCeldaEliminarPresuTipoCuentaProyecto=false;
			this.isVisibilidadCeldaCancelarPresuTipoCuentaProyecto=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarPresuTipoCuentaProyecto=true;
				} else {
					this.isVisibilidadCeldaGuardarPresuTipoCuentaProyecto=false;
				}
			}
		} else if(sAccion=="a") {
			this.isVisibilidadCeldaNuevoPresuTipoCuentaProyecto=false;
			this.isVisibilidadCeldaNuevoRelacionesPresuTipoCuentaProyecto=false;
			this.isVisibilidadCeldaGuardarCambiosPresuTipoCuentaProyecto=false;
			this.isVisibilidadCeldaModificarPresuTipoCuentaProyecto=false;
			this.isVisibilidadCeldaActualizarPresuTipoCuentaProyecto=true;
			this.isVisibilidadCeldaEliminarPresuTipoCuentaProyecto=false;
			this.isVisibilidadCeldaCancelarPresuTipoCuentaProyecto=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarPresuTipoCuentaProyecto=true;
				} else {
					this.isVisibilidadCeldaGuardarPresuTipoCuentaProyecto=false;
				}
			}
		} else if(sAccion=="ae") {
			this.isVisibilidadCeldaNuevoPresuTipoCuentaProyecto=false;
			this.isVisibilidadCeldaNuevoRelacionesPresuTipoCuentaProyecto=false;
			this.isVisibilidadCeldaGuardarCambiosPresuTipoCuentaProyecto=false;
			this.isVisibilidadCeldaModificarPresuTipoCuentaProyecto=false;
			this.isVisibilidadCeldaActualizarPresuTipoCuentaProyecto=true;
			this.isVisibilidadCeldaEliminarPresuTipoCuentaProyecto=true;
			this.isVisibilidadCeldaCancelarPresuTipoCuentaProyecto=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarPresuTipoCuentaProyecto=true;
				} else {
					this.isVisibilidadCeldaGuardarPresuTipoCuentaProyecto=false;
				}
			}
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {
			this.isVisibilidadCeldaNuevoPresuTipoCuentaProyecto=false;
			this.isVisibilidadCeldaNuevoRelacionesPresuTipoCuentaProyecto=false;
			this.isVisibilidadCeldaGuardarCambiosPresuTipoCuentaProyecto=false;
			this.isVisibilidadCeldaModificarPresuTipoCuentaProyecto=false;
			this.isVisibilidadCeldaActualizarPresuTipoCuentaProyecto=true;
			this.isVisibilidadCeldaEliminarPresuTipoCuentaProyecto=false;
			this.isVisibilidadCeldaCancelarPresuTipoCuentaProyecto=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarPresuTipoCuentaProyecto=false;
				} else {
					this.isVisibilidadCeldaGuardarPresuTipoCuentaProyecto=false;
				}
			}
		} else if(sAccion=="c") {
			this.isVisibilidadCeldaNuevoPresuTipoCuentaProyecto=true;
			this.isVisibilidadCeldaNuevoRelacionesPresuTipoCuentaProyecto=true;
			this.isVisibilidadCeldaGuardarCambiosPresuTipoCuentaProyecto=true;
			this.isVisibilidadCeldaModificarPresuTipoCuentaProyecto=false;
			this.isVisibilidadCeldaActualizarPresuTipoCuentaProyecto=false;
			this.isVisibilidadCeldaEliminarPresuTipoCuentaProyecto=false;
			this.isVisibilidadCeldaCancelarPresuTipoCuentaProyecto=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarPresuTipoCuentaProyecto=true;
				} else {
					this.isVisibilidadCeldaGuardarPresuTipoCuentaProyecto=false;
				}
			}
		} else if(sAccion=="t") {
			this.isVisibilidadCeldaNuevoPresuTipoCuentaProyecto=false;
			this.isVisibilidadCeldaNuevoRelacionesPresuTipoCuentaProyecto=false;
			this.isVisibilidadCeldaGuardarCambiosPresuTipoCuentaProyecto=false;
			this.isVisibilidadCeldaActualizarPresuTipoCuentaProyecto=false;
			this.isVisibilidadCeldaEliminarPresuTipoCuentaProyecto=false;
			this.isVisibilidadCeldaCancelarPresuTipoCuentaProyecto=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarPresuTipoCuentaProyecto=false;
				} else {
					this.isVisibilidadCeldaGuardarPresuTipoCuentaProyecto=false;
				}
			}
		}  else if(sAccion=="s"||sAccion=="s2") {
			this.isVisibilidadCeldaNuevoPresuTipoCuentaProyecto=false;
			this.isVisibilidadCeldaNuevoRelacionesPresuTipoCuentaProyecto=false;
			this.isVisibilidadCeldaGuardarCambiosPresuTipoCuentaProyecto=false;
			this.isVisibilidadCeldaModificarPresuTipoCuentaProyecto=true;
			this.isVisibilidadCeldaActualizarPresuTipoCuentaProyecto=false;
			this.isVisibilidadCeldaEliminarPresuTipoCuentaProyecto=false;
			this.isVisibilidadCeldaCancelarPresuTipoCuentaProyecto=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarPresuTipoCuentaProyecto=false;
				} else {
					this.isVisibilidadCeldaGuardarPresuTipoCuentaProyecto=false;
				}
			}
		}
		
		//ACTUALIZA VISIBILIDAD PANELES
		if(PresuTipoCuentaProyectoJInternalFrame.CON_DATOS_FRAME && !this.esParaBusquedaForeignKey) {
			//SIEMPRE VISIBLE
			this.isVisibilidadCeldaNuevoPresuTipoCuentaProyecto=true;
			this.isVisibilidadCeldaNuevoRelacionesPresuTipoCuentaProyecto=true;
			this.isVisibilidadCeldaGuardarCambiosPresuTipoCuentaProyecto=true;
		} else {
			this.actualizarEstadoPanelsPresuTipoCuentaProyecto(sAccion);						
		}
		
		if(this.esParaBusquedaForeignKey) {
			this.isVisibilidadCeldaCopiarPresuTipoCuentaProyecto=false;
			//this.isVisibilidadCeldaVerFormPresuTipoCuentaProyecto=false;
			this.isVisibilidadCeldaDuplicarPresuTipoCuentaProyecto=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONES
		if(!presutipocuentaproyectoSessionBean.getConGuardarRelaciones()) {
			this.isVisibilidadCeldaNuevoRelacionesPresuTipoCuentaProyecto=false;
		} else {
			this.isVisibilidadCeldaNuevoPresuTipoCuentaProyecto=false;
			this.isVisibilidadCeldaGuardarCambiosPresuTipoCuentaProyecto=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONADO
		if(presutipocuentaproyectoSessionBean.getEsGuardarRelacionado()) {
			if(!presutipocuentaproyectoSessionBean.getConGuardarRelaciones()) {	
				this.isVisibilidadCeldaNuevoRelacionesPresuTipoCuentaProyecto=false;												
			}
			
			this.jButtonCerrarPresuTipoCuentaProyecto.setVisible(false);
		}
		
		//SI NO TIENE MAXIMO DE RELACIONES PERMITIDAS
		if(!this.conMaximoRelaciones) {
			this.isVisibilidadCeldaNuevoRelacionesPresuTipoCuentaProyecto=false;
		}
		
		if(!this.permiteMantenimiento(this.presutipocuentaproyecto)) {
			this.isVisibilidadCeldaActualizarPresuTipoCuentaProyecto=false;
			this.isVisibilidadCeldaEliminarPresuTipoCuentaProyecto=false;
		}
		
		
		
	}
	
	public void actualizarEstadoCeldasBotonesConGuardarRelacionesPresuTipoCuentaProyecto() {
	}
	
	public void actualizarEstadoPanelsPresuTipoCuentaProyecto(String sAccion) {
		if(sAccion=="n") {
			if(this.jScrollPanelDatosEdicionPresuTipoCuentaProyecto!=null) {
				this.jScrollPanelDatosEdicionPresuTipoCuentaProyecto.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasPresuTipoCuentaProyecto!=null) {
				this.jTabbedPaneBusquedasPresuTipoCuentaProyecto.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosPresuTipoCuentaProyecto!=null) {
				this.jScrollPanelDatosPresuTipoCuentaProyecto.setVisible(true);
			}
			
			if(this.jPanelPaginacionPresuTipoCuentaProyecto!=null) {
				this.jPanelPaginacionPresuTipoCuentaProyecto.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesPresuTipoCuentaProyecto!=null) {
				this.jPanelParametrosReportesPresuTipoCuentaProyecto.setVisible(true);		    
			}
			
		} else if(sAccion=="a") {				
			if(this.jScrollPanelDatosEdicionPresuTipoCuentaProyecto!=null) {
				this.jScrollPanelDatosEdicionPresuTipoCuentaProyecto.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasPresuTipoCuentaProyecto!=null) {
				this.jTabbedPaneBusquedasPresuTipoCuentaProyecto.setVisible(false);			
			}
			
			
			
			if(this.jScrollPanelDatosPresuTipoCuentaProyecto!=null) {
				this.jScrollPanelDatosPresuTipoCuentaProyecto.setVisible(false);
			}
			
			if(this.jPanelPaginacionPresuTipoCuentaProyecto!=null) {
				this.jPanelPaginacionPresuTipoCuentaProyecto.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesPresuTipoCuentaProyecto!=null) {
				this.jPanelParametrosReportesPresuTipoCuentaProyecto.setVisible(false);
			}
						
		} else if(sAccion=="ae") {		
			if(this.jScrollPanelDatosEdicionPresuTipoCuentaProyecto!=null) {
				this.jScrollPanelDatosEdicionPresuTipoCuentaProyecto.setVisible(true);		
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasPresuTipoCuentaProyecto!=null) {
				this.jTabbedPaneBusquedasPresuTipoCuentaProyecto.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosPresuTipoCuentaProyecto!=null) {
				this.jScrollPanelDatosPresuTipoCuentaProyecto.setVisible(false);
			}
			
			if(this.jPanelPaginacionPresuTipoCuentaProyecto!=null) {
				this.jPanelPaginacionPresuTipoCuentaProyecto.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesPresuTipoCuentaProyecto!=null) {
				this.jPanelParametrosReportesPresuTipoCuentaProyecto.setVisible(false);
			}
						
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {	
			if(this.jScrollPanelDatosEdicionPresuTipoCuentaProyecto!=null) {
				this.jScrollPanelDatosEdicionPresuTipoCuentaProyecto.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasPresuTipoCuentaProyecto!=null) {
				this.jTabbedPaneBusquedasPresuTipoCuentaProyecto.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosPresuTipoCuentaProyecto!=null) {
				this.jScrollPanelDatosPresuTipoCuentaProyecto.setVisible(false);
			}
			
			if(this.jPanelPaginacionPresuTipoCuentaProyecto!=null) {
				this.jPanelPaginacionPresuTipoCuentaProyecto.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesPresuTipoCuentaProyecto!=null) {
				this.jPanelParametrosReportesPresuTipoCuentaProyecto.setVisible(false);
			}
						
		} else if(sAccion=="c") {	
			if(this.jScrollPanelDatosEdicionPresuTipoCuentaProyecto!=null) {
				this.jScrollPanelDatosEdicionPresuTipoCuentaProyecto.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasPresuTipoCuentaProyecto!=null) {
				this.jTabbedPaneBusquedasPresuTipoCuentaProyecto.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosPresuTipoCuentaProyecto!=null) {
				this.jScrollPanelDatosPresuTipoCuentaProyecto.setVisible(true);
			}
			
			if(this.jPanelPaginacionPresuTipoCuentaProyecto!=null) {
				this.jPanelPaginacionPresuTipoCuentaProyecto.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesPresuTipoCuentaProyecto!=null) {
				this.jPanelParametrosReportesPresuTipoCuentaProyecto.setVisible(true);
			}
						
		} else if(sAccion=="t") {
			
			if(this.jScrollPanelDatosEdicionPresuTipoCuentaProyecto!=null) {
				this.jScrollPanelDatosEdicionPresuTipoCuentaProyecto.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasPresuTipoCuentaProyecto!=null) {
				this.jTabbedPaneBusquedasPresuTipoCuentaProyecto.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosPresuTipoCuentaProyecto!=null) {
				this.jScrollPanelDatosPresuTipoCuentaProyecto.setVisible(true);
			}
			
			if(this.jPanelPaginacionPresuTipoCuentaProyecto!=null) {
				this.jPanelPaginacionPresuTipoCuentaProyecto.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesPresuTipoCuentaProyecto!=null) {
				this.jPanelParametrosReportesPresuTipoCuentaProyecto.setVisible(true);
			}
						
		}  else if(sAccion=="s"||sAccion=="s2") {
			if(this.jScrollPanelDatosEdicionPresuTipoCuentaProyecto!=null) {
				this.jScrollPanelDatosEdicionPresuTipoCuentaProyecto.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasPresuTipoCuentaProyecto!=null) {
				this.jTabbedPaneBusquedasPresuTipoCuentaProyecto.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosPresuTipoCuentaProyecto!=null) {
				this.jScrollPanelDatosPresuTipoCuentaProyecto.setVisible(true);
			}
			
			if(this.jPanelPaginacionPresuTipoCuentaProyecto!=null) {
				this.jPanelPaginacionPresuTipoCuentaProyecto.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesPresuTipoCuentaProyecto!=null) {
				this.jPanelParametrosReportesPresuTipoCuentaProyecto.setVisible(true);
			}
			
		} 
		
		if(sAccion.equals("relacionado") || this.presutipocuentaproyectoSessionBean.getEsGuardarRelacionado()) {
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				if(this.jTabbedPaneBusquedasPresuTipoCuentaProyecto!=null) {
					this.jTabbedPaneBusquedasPresuTipoCuentaProyecto.setVisible(false);				
				}
				
			}
			
			if(this.jPanelParametrosReportesPresuTipoCuentaProyecto!=null) {
				this.jPanelParametrosReportesPresuTipoCuentaProyecto.setVisible(false);
			}
		
		} else if(sAccion.equals("no_relacionado") && !this.presutipocuentaproyectoSessionBean.getEsGuardarRelacionado()) {
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasPresuTipoCuentaProyecto!=null) {
				this.jTabbedPaneBusquedasPresuTipoCuentaProyecto.setVisible(true);			
			}
			
			if(this.jPanelParametrosReportesPresuTipoCuentaProyecto!=null) {
				this.jPanelParametrosReportesPresuTipoCuentaProyecto.setVisible(true);
			}
		}
	}	
	
	

	public void setVisibilidadBusquedasParaEmpresa(Boolean isParaEmpresa){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaEmpresaNegation=!isParaEmpresa;

			this.isVisibilidadBusquedaPorCodigo=isParaEmpresaNegation;
			if(!this.isVisibilidadBusquedaPorCodigo) {this.jTabbedPaneBusquedasPresuTipoCuentaProyecto.remove(jPanelBusquedaPorCodigoPresuTipoCuentaProyecto);}

			this.isVisibilidadBusquedaPorNombre=isParaEmpresaNegation;
			if(!this.isVisibilidadBusquedaPorNombre) {this.jTabbedPaneBusquedasPresuTipoCuentaProyecto.remove(jPanelBusquedaPorNombrePresuTipoCuentaProyecto);}
		}
		
	}
	
	
	
	
	
	
	public void guardarDatosBusquedaSession() throws Exception {
		
		//PresuTipoCuentaProyectoSessionBean presutipocuentaproyectoSessionBean=new PresuTipoCuentaProyectoSessionBean();
		
		if(this.presutipocuentaproyectoSessionBean==null) {
			this.presutipocuentaproyectoSessionBean=new PresuTipoCuentaProyectoSessionBean();
		}
		
		this.presutipocuentaproyectoSessionBean.setsUltimaBusquedaPresuTipoCuentaProyecto(this.getsAccionBusqueda());
		this.presutipocuentaproyectoSessionBean.setiNumeroPaginacion(this.getiNumeroPaginacion());
		this.presutipocuentaproyectoSessionBean.setiNumeroPaginacionPagina(this.getiNumeroPaginacionPagina());
		
		if(this.getsAccionBusqueda().equals("Todos")) {
			;
		}
		

		else if(this.getsAccionBusqueda().equals("BusquedaPorCodigo")) {
			presutipocuentaproyectoSessionBean.setcodigo(this.getcodigoBusquedaPorCodigo());	
		}
		else if(this.getsAccionBusqueda().equals("BusquedaPorNombre")) {
			presutipocuentaproyectoSessionBean.setnombre(this.getnombreBusquedaPorNombre());	
		}
		else if(this.getsAccionBusqueda().equals("FK_IdEmpresa")) {
			presutipocuentaproyectoSessionBean.setid_empresa(this.getid_empresaFK_IdEmpresa());	
		}
		
	}
	
	public void traerDatosBusquedaDesdeSession() throws Exception {
		//PresuTipoCuentaProyectoSessionBean presutipocuentaproyectoSessionBean=new PresuTipoCuentaProyectoSessionBean();
		
		if(this.presutipocuentaproyectoSessionBean==null) {
			this.presutipocuentaproyectoSessionBean=new PresuTipoCuentaProyectoSessionBean();
		}
		
		if(this.presutipocuentaproyectoSessionBean.getsUltimaBusquedaPresuTipoCuentaProyecto()!=null&&!this.presutipocuentaproyectoSessionBean.getsUltimaBusquedaPresuTipoCuentaProyecto().equals("")) {
			this.setsAccionBusqueda(presutipocuentaproyectoSessionBean.getsUltimaBusquedaPresuTipoCuentaProyecto());
			this.setiNumeroPaginacion(presutipocuentaproyectoSessionBean.getiNumeroPaginacion());
			this.setiNumeroPaginacionPagina(presutipocuentaproyectoSessionBean.getiNumeroPaginacionPagina());		
				
			if(this.getsAccionBusqueda().equals("Todos")) {
				;
			}
			

			 else if(this.getsAccionBusqueda().equals("BusquedaPorCodigo")) {
				this.setcodigoBusquedaPorCodigo(presutipocuentaproyectoSessionBean.getcodigo());
				presutipocuentaproyectoSessionBean.setcodigo("");
			}
			 else if(this.getsAccionBusqueda().equals("BusquedaPorNombre")) {
				this.setnombreBusquedaPorNombre(presutipocuentaproyectoSessionBean.getnombre());
				presutipocuentaproyectoSessionBean.setnombre("");
			}
			 else if(this.getsAccionBusqueda().equals("FK_IdEmpresa")) {
				this.setid_empresaFK_IdEmpresa(presutipocuentaproyectoSessionBean.getid_empresa());
				presutipocuentaproyectoSessionBean.setid_empresa(-1L);
			}
		}
		
		this.presutipocuentaproyectoSessionBean.setsUltimaBusquedaPresuTipoCuentaProyecto("");
		this.presutipocuentaproyectoSessionBean.setiNumeroPaginacion(PresuTipoCuentaProyectoConstantesFunciones.INUMEROPAGINACION);
		this.presutipocuentaproyectoSessionBean.setiNumeroPaginacionPagina(0);
		
	}
	
	public void procesoActualizarFilaTotales(Boolean esCampoValor,String sTipo) {
		try {
			this.actualizarFilaTotales();
				
			this.traerValoresTablaTotales();
			
			this.inicializarActualizarBindingTablaPresuTipoCuentaProyecto(false);
			
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	public void updateBusquedasFormularioPresuTipoCuentaProyecto() {
		this.updateBorderResaltarBusquedasFormularioPresuTipoCuentaProyecto();
		this.updateVisibilidadBusquedasFormularioPresuTipoCuentaProyecto();
		this.updateHabilitarBusquedasFormularioPresuTipoCuentaProyecto();
	}
	
	public void updateBorderResaltarBusquedasFormularioPresuTipoCuentaProyecto() {					
	//BYDAN_BUSQUEDAS
		
	int index=0;
		
	if(this.jTabbedPaneBusquedasPresuTipoCuentaProyecto.getComponents().length>0) {
	

		if(this.presutipocuentaproyectoConstantesFunciones.resaltarBusquedaPorCodigoPresuTipoCuentaProyecto!=null) {
			index= this.jTabbedPaneBusquedasPresuTipoCuentaProyecto.indexOfComponent(this.jPanelBusquedaPorCodigoPresuTipoCuentaProyecto);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasPresuTipoCuentaProyecto.getComponent(index);
				jPanel.setBorder(this.presutipocuentaproyectoConstantesFunciones.resaltarBusquedaPorCodigoPresuTipoCuentaProyecto);
			}
		}

		if(this.presutipocuentaproyectoConstantesFunciones.resaltarBusquedaPorNombrePresuTipoCuentaProyecto!=null) {
			index= this.jTabbedPaneBusquedasPresuTipoCuentaProyecto.indexOfComponent(this.jPanelBusquedaPorNombrePresuTipoCuentaProyecto);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasPresuTipoCuentaProyecto.getComponent(index);
				jPanel.setBorder(this.presutipocuentaproyectoConstantesFunciones.resaltarBusquedaPorNombrePresuTipoCuentaProyecto);
			}
		}
	}	
	
	}
	
	public void updateVisibilidadBusquedasFormularioPresuTipoCuentaProyecto() {
	//BYDAN_BUSQUEDAS
	
	int index=0;
	JPanel jPanel=null;
		
	if(this.jTabbedPaneBusquedasPresuTipoCuentaProyecto.getComponents().length>0) {
	

			index= this.jTabbedPaneBusquedasPresuTipoCuentaProyecto.indexOfComponent(this.jPanelBusquedaPorCodigoPresuTipoCuentaProyecto);
			jPanel=(JPanel)this.jTabbedPaneBusquedasPresuTipoCuentaProyecto.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.presutipocuentaproyectoConstantesFunciones.mostrarBusquedaPorCodigoPresuTipoCuentaProyecto);
			if(!this.presutipocuentaproyectoConstantesFunciones.mostrarBusquedaPorCodigoPresuTipoCuentaProyecto && index>-1) {
				this.jTabbedPaneBusquedasPresuTipoCuentaProyecto.remove(index);
			}

			index= this.jTabbedPaneBusquedasPresuTipoCuentaProyecto.indexOfComponent(this.jPanelBusquedaPorNombrePresuTipoCuentaProyecto);
			jPanel=(JPanel)this.jTabbedPaneBusquedasPresuTipoCuentaProyecto.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.presutipocuentaproyectoConstantesFunciones.mostrarBusquedaPorNombrePresuTipoCuentaProyecto);
			if(!this.presutipocuentaproyectoConstantesFunciones.mostrarBusquedaPorNombrePresuTipoCuentaProyecto && index>-1) {
				this.jTabbedPaneBusquedasPresuTipoCuentaProyecto.remove(index);
			}
	}	
	
	}
	
	public void updateHabilitarBusquedasFormularioPresuTipoCuentaProyecto() {
	
	//BYDAN_BUSQUEDAS		
		int index=0;
		JPanel jPanel=null;
			
		if(this.jTabbedPaneBusquedasPresuTipoCuentaProyecto.getComponents().length>0) {
	

			index= this.jTabbedPaneBusquedasPresuTipoCuentaProyecto.indexOfComponent(this.jPanelBusquedaPorCodigoPresuTipoCuentaProyecto);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedasPresuTipoCuentaProyecto.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.presutipocuentaproyectoConstantesFunciones.activarBusquedaPorCodigoPresuTipoCuentaProyecto);
				this.jTabbedPaneBusquedasPresuTipoCuentaProyecto.setEnabledAt(index,this.presutipocuentaproyectoConstantesFunciones.activarBusquedaPorCodigoPresuTipoCuentaProyecto);
			}

			index= this.jTabbedPaneBusquedasPresuTipoCuentaProyecto.indexOfComponent(this.jPanelBusquedaPorNombrePresuTipoCuentaProyecto);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedasPresuTipoCuentaProyecto.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.presutipocuentaproyectoConstantesFunciones.activarBusquedaPorNombrePresuTipoCuentaProyecto);
				this.jTabbedPaneBusquedasPresuTipoCuentaProyecto.setEnabledAt(index,this.presutipocuentaproyectoConstantesFunciones.activarBusquedaPorNombrePresuTipoCuentaProyecto);
			}
		}	
	
	}
	
	
	public void resaltarPanelBusquedaPresuTipoCuentaProyecto(String sTipoBusqueda) {
		Boolean existe=false;
		//BYDAN_BUSQUEDAS
		
		int index=0;
		Border resaltar = Funciones2.getBorderResaltar(this.parametroGeneralUsuario,"TAB");

		if(sTipoBusqueda.equals("BusquedaPorCodigo")) {
			index= this.jTabbedPaneBusquedasPresuTipoCuentaProyecto.indexOfComponent(this.jPanelBusquedaPorCodigoPresuTipoCuentaProyecto);

			this.jTabbedPaneBusquedasPresuTipoCuentaProyecto.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasPresuTipoCuentaProyecto.getComponent(index);

			this.presutipocuentaproyectoConstantesFunciones.setResaltarBusquedaPorCodigoPresuTipoCuentaProyecto(resaltar);

			jPanel.setBorder(this.presutipocuentaproyectoConstantesFunciones.resaltarBusquedaPorCodigoPresuTipoCuentaProyecto);
			existe=true;
		}
		else if(sTipoBusqueda.equals("BusquedaPorNombre")) {
			index= this.jTabbedPaneBusquedasPresuTipoCuentaProyecto.indexOfComponent(this.jPanelBusquedaPorNombrePresuTipoCuentaProyecto);

			this.jTabbedPaneBusquedasPresuTipoCuentaProyecto.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasPresuTipoCuentaProyecto.getComponent(index);

			this.presutipocuentaproyectoConstantesFunciones.setResaltarBusquedaPorNombrePresuTipoCuentaProyecto(resaltar);

			jPanel.setBorder(this.presutipocuentaproyectoConstantesFunciones.resaltarBusquedaPorNombrePresuTipoCuentaProyecto);
			existe=true;
		}
		

		if(existe) {
			
			this.jTtoolBarPresuTipoCuentaProyecto.setBorder(resaltar);
			
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
	
	public void updateControlesFormularioPresuTipoCuentaProyecto() throws Exception {

		if(this.jInternalFrameDetalleFormPresuTipoCuentaProyecto==null) { //if(!this.conCargarFormDetalle) {			
			this.inicializarFormDetalle();
		}
		
		this.updateBorderResaltarControlesFormularioPresuTipoCuentaProyecto();
		this.updateVisibilidadResaltarControlesFormularioPresuTipoCuentaProyecto();
		this.updateHabilitarResaltarControlesFormularioPresuTipoCuentaProyecto();
		
	}
	
	public void updateBorderResaltarControlesFormularioPresuTipoCuentaProyecto() throws Exception {
		if(this.jInternalFrameDetalleFormPresuTipoCuentaProyecto==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
	
		if(this.presutipocuentaproyectoConstantesFunciones.resaltaridPresuTipoCuentaProyecto!=null && this.jInternalFrameDetalleFormPresuTipoCuentaProyecto!=null) {this.jInternalFrameDetalleFormPresuTipoCuentaProyecto.jLabelidPresuTipoCuentaProyecto.setBorder(this.presutipocuentaproyectoConstantesFunciones.resaltaridPresuTipoCuentaProyecto);}
		if(this.presutipocuentaproyectoConstantesFunciones.resaltarid_empresaPresuTipoCuentaProyecto!=null && this.jInternalFrameDetalleFormPresuTipoCuentaProyecto!=null) {this.jInternalFrameDetalleFormPresuTipoCuentaProyecto.jComboBoxid_empresaPresuTipoCuentaProyecto.setBorder(this.presutipocuentaproyectoConstantesFunciones.resaltarid_empresaPresuTipoCuentaProyecto);}
		if(this.presutipocuentaproyectoConstantesFunciones.resaltarcodigoPresuTipoCuentaProyecto!=null && this.jInternalFrameDetalleFormPresuTipoCuentaProyecto!=null) {this.jInternalFrameDetalleFormPresuTipoCuentaProyecto.jTextFieldcodigoPresuTipoCuentaProyecto.setBorder(this.presutipocuentaproyectoConstantesFunciones.resaltarcodigoPresuTipoCuentaProyecto);}
		if(this.presutipocuentaproyectoConstantesFunciones.resaltarnombrePresuTipoCuentaProyecto!=null && this.jInternalFrameDetalleFormPresuTipoCuentaProyecto!=null) {this.jInternalFrameDetalleFormPresuTipoCuentaProyecto.jTextAreanombrePresuTipoCuentaProyecto.setBorder(this.presutipocuentaproyectoConstantesFunciones.resaltarnombrePresuTipoCuentaProyecto);}
	}
	
	public void updateVisibilidadResaltarControlesFormularioPresuTipoCuentaProyecto() throws Exception {		
		if(this.jInternalFrameDetalleFormPresuTipoCuentaProyecto==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormPresuTipoCuentaProyecto!=null) {
	
		//this.jInternalFrameDetalleFormPresuTipoCuentaProyecto.jLabelidPresuTipoCuentaProyecto.setVisible(this.presutipocuentaproyectoConstantesFunciones.mostraridPresuTipoCuentaProyecto);
		this.jInternalFrameDetalleFormPresuTipoCuentaProyecto.jPanelidPresuTipoCuentaProyecto.setVisible(this.presutipocuentaproyectoConstantesFunciones.mostraridPresuTipoCuentaProyecto);
		//this.jInternalFrameDetalleFormPresuTipoCuentaProyecto.jComboBoxid_empresaPresuTipoCuentaProyecto.setVisible(this.presutipocuentaproyectoConstantesFunciones.mostrarid_empresaPresuTipoCuentaProyecto);
		this.jInternalFrameDetalleFormPresuTipoCuentaProyecto.jPanelid_empresaPresuTipoCuentaProyecto.setVisible(this.presutipocuentaproyectoConstantesFunciones.mostrarid_empresaPresuTipoCuentaProyecto);
		//this.jInternalFrameDetalleFormPresuTipoCuentaProyecto.jTextFieldcodigoPresuTipoCuentaProyecto.setVisible(this.presutipocuentaproyectoConstantesFunciones.mostrarcodigoPresuTipoCuentaProyecto);
		this.jInternalFrameDetalleFormPresuTipoCuentaProyecto.jPanelcodigoPresuTipoCuentaProyecto.setVisible(this.presutipocuentaproyectoConstantesFunciones.mostrarcodigoPresuTipoCuentaProyecto);
		//this.jInternalFrameDetalleFormPresuTipoCuentaProyecto.jTextAreanombrePresuTipoCuentaProyecto.setVisible(this.presutipocuentaproyectoConstantesFunciones.mostrarnombrePresuTipoCuentaProyecto);
		this.jInternalFrameDetalleFormPresuTipoCuentaProyecto.jPanelnombrePresuTipoCuentaProyecto.setVisible(this.presutipocuentaproyectoConstantesFunciones.mostrarnombrePresuTipoCuentaProyecto);
		}
	}
	
	public void updateHabilitarResaltarControlesFormularioPresuTipoCuentaProyecto() throws Exception {
		if(this.jInternalFrameDetalleFormPresuTipoCuentaProyecto==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormPresuTipoCuentaProyecto!=null) {
	
		this.jInternalFrameDetalleFormPresuTipoCuentaProyecto.jLabelidPresuTipoCuentaProyecto.setEnabled(this.presutipocuentaproyectoConstantesFunciones.activaridPresuTipoCuentaProyecto);
		this.jInternalFrameDetalleFormPresuTipoCuentaProyecto.jComboBoxid_empresaPresuTipoCuentaProyecto.setEnabled(this.presutipocuentaproyectoConstantesFunciones.activarid_empresaPresuTipoCuentaProyecto);
		this.jInternalFrameDetalleFormPresuTipoCuentaProyecto.jTextFieldcodigoPresuTipoCuentaProyecto.setEnabled(this.presutipocuentaproyectoConstantesFunciones.activarcodigoPresuTipoCuentaProyecto);
		this.jInternalFrameDetalleFormPresuTipoCuentaProyecto.jTextAreanombrePresuTipoCuentaProyecto.setEnabled(this.presutipocuentaproyectoConstantesFunciones.activarnombrePresuTipoCuentaProyecto);
		}
	}
	
		
}