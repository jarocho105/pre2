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

import com.bydan.erp.contabilidad.util.PresuTipoProyectoConstantesFunciones;
import com.bydan.erp.contabilidad.util.PresuTipoProyectoParameterReturnGeneral;
//import com.bydan.erp.contabilidad.util.PresuTipoProyectoParameterGeneral;
//import com.bydan.erp.contabilidad.presentation.report.source.PresuTipoProyectoBean;
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
public class PresuTipoProyectoBeanSwingJInternalFrame extends PresuTipoProyectoJInternalFrame implements WindowListener,WindowFocusListener
{				
	
	public static final long serialVersionUID = 1L;
	
	public static Logger logger = Logger.getLogger(PresuTipoProyectoBeanSwingJInternalFrame.class);  
	
	public static ClassValidator<PresuTipoProyecto> presutipoproyectoValidator = new ClassValidator<PresuTipoProyecto>(PresuTipoProyecto.class);
	
	public InvalidValue[] invalidValues=null;
		

	//Ejb Foreign Keys
	
	public PresuTipoProyecto presutipoproyecto;	
	public PresuTipoProyecto presutipoproyectoAux;
	public PresuTipoProyecto presutipoproyectoAnterior;//USADO PARA MANEJAR FOCUS GAINED,LOST
	public PresuTipoProyecto presutipoproyectoTotales;
	public Long idPresuTipoProyectoActual;
	public Long iIdNuevoPresuTipoProyecto=0L;
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
	
	public Boolean isPermisoTodoPresuTipoProyecto;
	public Boolean isPermisoNuevoPresuTipoProyecto;
	public Boolean isPermisoActualizarPresuTipoProyecto;
	public Boolean isPermisoActualizarOriginalPresuTipoProyecto;
	public Boolean isPermisoEliminarPresuTipoProyecto;
	public Boolean isPermisoGuardarCambiosPresuTipoProyecto;
	public Boolean isPermisoConsultaPresuTipoProyecto;
	public Boolean isPermisoBusquedaPresuTipoProyecto;
	public Boolean isPermisoReportePresuTipoProyecto;
	public Boolean isPermisoPaginacionMedioPresuTipoProyecto;
	public Boolean isPermisoPaginacionAltoPresuTipoProyecto;
	public Boolean isPermisoPaginacionTodoPresuTipoProyecto;
	public Boolean isPermisoCopiarPresuTipoProyecto;
	public Boolean isPermisoVerFormPresuTipoProyecto;
	public Boolean isPermisoDuplicarPresuTipoProyecto;
	public Boolean isPermisoOrdenPresuTipoProyecto;
	
	
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
	
	public PresuTipoProyectoParameterReturnGeneral presutipoproyectoReturnGeneral;
	public PresuTipoProyectoParameterReturnGeneral presutipoproyectoParameterGeneral;
	
	 	
	public JasperPrint jasperPrint = null;
	
	public Long lIdUsuarioSesion=0L;				
	
	public Boolean isEsNuevoPresuTipoProyecto=false;
	public Boolean esParaAccionDesdeFormularioPresuTipoProyecto=false;
	public Boolean isEsMantenimientoRelacionesRelacionadoUnico=false;
	public Boolean isEsMantenimientoRelaciones=false;
	public Boolean isEsMantenimientoRelacionado=false;	
	public Boolean isContieneImagenes=false;
		
	//public Boolean conTotales=false; //Viene heredado de JInternalFrameBase
	//public Boolean esParaBusquedaForeignKey=false;
	
	
	protected PresuTipoProyectoSessionBeanAdditional presutipoproyectoSessionBeanAdditional=null;
	
	public PresuTipoProyectoSessionBeanAdditional getPresuTipoProyectoSessionBeanAdditional() {
		return this.presutipoproyectoSessionBeanAdditional;
	}
	
	public void setPresuTipoProyectoSessionBeanAdditional(PresuTipoProyectoSessionBeanAdditional presutipoproyectoSessionBeanAdditional) {
		try {
			this.presutipoproyectoSessionBeanAdditional=presutipoproyectoSessionBeanAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	protected PresuTipoProyectoBeanSwingJInternalFrameAdditional presutipoproyectoBeanSwingJInternalFrameAdditional=null;
	//public class PresuTipoProyectoBeanSwingJInternalFrame
	
	public PresuTipoProyectoBeanSwingJInternalFrameAdditional getPresuTipoProyectoBeanSwingJInternalFrameAdditional() {
		return this.presutipoproyectoBeanSwingJInternalFrameAdditional;
	}
	
	public void setPresuTipoProyectoBeanSwingJInternalFrameAdditional(PresuTipoProyectoBeanSwingJInternalFrameAdditional presutipoproyectoBeanSwingJInternalFrameAdditional) {
		try {
			this.presutipoproyectoBeanSwingJInternalFrameAdditional=presutipoproyectoBeanSwingJInternalFrameAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	//ESTA EN PADRE
	
	//public PresuTipoProyectoLogic presutipoproyectoLogic;
	public SistemaLogicAdditional sistemaLogicAdditional;
	
	
	public PresuTipoProyecto presutipoproyectoBean;
	public PresuTipoProyectoConstantesFunciones presutipoproyectoConstantesFunciones;
	//public PresuTipoProyectoParameterReturnGeneral presutipoproyectoReturnGeneral;
	
	//FK
	
	public EmpresaLogic empresaLogic;
	
	//PARAMETROS
	
	
	//public List<PresuTipoProyecto> presutipoproyectos;	
	//public List<PresuTipoProyecto> presutipoproyectosEliminados;
	//public List<PresuTipoProyecto> presutipoproyectosAux;
	
	public String sAccionMantenimiento="";
	public String sAccionBusqueda="";
	public String sAccionAdicional="";
	public String sUltimaBusqueda="";
	
	public Mensaje mensaje;
	
	
	public String sVisibilidadTablaBusquedas="";					
	public String sVisibilidadTablaElementos="";	
	public String sVisibilidadTablaAcciones="";			
	
	public Boolean isVisibilidadCeldaNuevoPresuTipoProyecto=false;
	public Boolean isVisibilidadCeldaDuplicarPresuTipoProyecto=true;
	public Boolean isVisibilidadCeldaCopiarPresuTipoProyecto=true;
	public Boolean isVisibilidadCeldaVerFormPresuTipoProyecto=true;
	public Boolean isVisibilidadCeldaOrdenPresuTipoProyecto=true;
	public Boolean isVisibilidadCeldaNuevoRelacionesPresuTipoProyecto=false;
	public Boolean isVisibilidadCeldaModificarPresuTipoProyecto=false;
	public Boolean isVisibilidadCeldaActualizarPresuTipoProyecto=false;
	public Boolean isVisibilidadCeldaEliminarPresuTipoProyecto=false;
	public Boolean isVisibilidadCeldaCancelarPresuTipoProyecto=false;
	public Boolean isVisibilidadCeldaGuardarPresuTipoProyecto=false;	
	public Boolean isVisibilidadCeldaGuardarCambiosPresuTipoProyecto=false;	
	
	
	public Boolean isVisibilidadBusquedaPorCodigo=false;
	public Boolean isVisibilidadBusquedaPorNombre=false;
	public Boolean isVisibilidadFK_IdEmpresa=false;
	
	public Long getiIdNuevoPresuTipoProyecto() {
		return this.iIdNuevoPresuTipoProyecto;
	}

	public void setiIdNuevoPresuTipoProyecto(Long iIdNuevoPresuTipoProyecto) {
		this.iIdNuevoPresuTipoProyecto = iIdNuevoPresuTipoProyecto;
	}
	
	public Long getidPresuTipoProyectoActual() {
		return this.idPresuTipoProyectoActual;
	}

	public void setidPresuTipoProyectoActual(Long idPresuTipoProyectoActual) {
		this.idPresuTipoProyectoActual = idPresuTipoProyectoActual;
	}
	
	public int getrowIndexActual() {
		return this.rowIndexActual;
	}

	public void setrowIndexActual(int rowIndexActual) {
		this.rowIndexActual=rowIndexActual;
	}
	
	
	public PresuTipoProyecto getpresutipoproyecto() {
		return this.presutipoproyecto;
	}

	public void setpresutipoproyecto(PresuTipoProyecto presutipoproyecto) {
		this.presutipoproyecto = presutipoproyecto;
	}
	
	public PresuTipoProyecto getpresutipoproyectoAux() {
		return this.presutipoproyectoAux;
	}

	public void setpresutipoproyectoAux(PresuTipoProyecto presutipoproyectoAux) {
		this.presutipoproyectoAux = presutipoproyectoAux;
	}				
	
	public PresuTipoProyecto getpresutipoproyectoAnterior() {
		return this.presutipoproyectoAnterior;
	}

	public void setpresutipoproyectoAnterior(PresuTipoProyecto presutipoproyectoAnterior) {
		this.presutipoproyectoAnterior = presutipoproyectoAnterior;
	}	
	
	public PresuTipoProyecto getpresutipoproyectoTotales() {
		return this.presutipoproyectoTotales;
	}

	public void setpresutipoproyectoTotales(PresuTipoProyecto presutipoproyectoTotales) {
		this.presutipoproyectoTotales = presutipoproyectoTotales;
	}	
	
	public PresuTipoProyecto getpresutipoproyectoBean() {
		return this.presutipoproyectoBean;
	}

	public void setpresutipoproyectoBean(PresuTipoProyecto presutipoproyectoBean) {
		this.presutipoproyectoBean = presutipoproyectoBean;
	}	
	
	public PresuTipoProyectoParameterReturnGeneral getpresutipoproyectoReturnGeneral() {
		return this.presutipoproyectoReturnGeneral;
	}

	public void setpresutipoproyectoReturnGeneral(PresuTipoProyectoParameterReturnGeneral presutipoproyectoReturnGeneral) {
		this.presutipoproyectoReturnGeneral = presutipoproyectoReturnGeneral;
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
	
	
	public PresuTipoProyectoLogic getPresuTipoProyectoLogic()	{		
		return presutipoproyectoLogic;
	}

	public void setPresuTipoProyectoLogic(PresuTipoProyectoLogic presutipoproyectoLogic) {
		this.presutipoproyectoLogic = presutipoproyectoLogic;
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
	
	public Boolean getIsEsNuevoPresuTipoProyecto() {
		return isEsNuevoPresuTipoProyecto;
	}

	public void setIsEsNuevoPresuTipoProyecto(Boolean isEsNuevoPresuTipoProyecto) {
		this.isEsNuevoPresuTipoProyecto = isEsNuevoPresuTipoProyecto;
	}

	public Boolean getEsParaAccionDesdeFormularioPresuTipoProyecto() {
		return esParaAccionDesdeFormularioPresuTipoProyecto;
	}
	
	public void setEsParaAccionDesdeFormularioPresuTipoProyecto(Boolean esParaAccionDesdeFormularioPresuTipoProyecto) {
		this.esParaAccionDesdeFormularioPresuTipoProyecto = esParaAccionDesdeFormularioPresuTipoProyecto;
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

			if(this.presutipoproyectoSessionBean==null) {
				this.presutipoproyectoSessionBean=new PresuTipoProyectoSessionBean();
			}

			if(!this.presutipoproyectoSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {
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
					empresaLogic.getEntityWithConnection(presutipoproyectoSessionBean.getlidEmpresaActual());
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

					if(this.presutipoproyecto!=null) {
						this.presutipoproyecto.setEmpresa(empresaTemp);
					}

					if(this.jInternalFrameDetalleFormPresuTipoProyecto!=null) {
						this.jInternalFrameDetalleFormPresuTipoProyecto.jComboBoxid_empresaPresuTipoProyecto.setSelectedItem(empresaTemp);
					}
				} else {
					//jComboBoxid_empresaPresuTipoProyecto.setSelectedItem(empresaTemp);
					if(this.jInternalFrameDetalleFormPresuTipoProyecto!=null) {
						if(this.jInternalFrameDetalleFormPresuTipoProyecto.jComboBoxid_empresaPresuTipoProyecto.getItemCount()>0) {
							this.jInternalFrameDetalleFormPresuTipoProyecto.jComboBoxid_empresaPresuTipoProyecto.setSelectedIndex(0);
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
	public void setActualEmpresaForeignKeyGenerico(Long idEmpresaSeleccionado,JComboBox jComboBoxid_empresaPresuTipoProyectoGenerico)throws Exception
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
				jComboBoxid_empresaPresuTipoProyectoGenerico.setSelectedItem(empresaTemp);
			} else {
				if(jComboBoxid_empresaPresuTipoProyectoGenerico!=null && jComboBoxid_empresaPresuTipoProyectoGenerico.getItemCount()>0) {
					jComboBoxid_empresaPresuTipoProyectoGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	
	
	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarEmpresaForeignKey(PresuTipoProyecto presutipoproyecto,JComboBox jComboBoxid_empresaPresuTipoProyectoGenerico)throws Exception
	{
		try
		{
			Empresa  empresaAux=new Empresa();

			if(jComboBoxid_empresaPresuTipoProyectoGenerico==null) {
				empresaAux=(Empresa)this.jInternalFrameDetalleFormPresuTipoProyecto.jComboBoxid_empresaPresuTipoProyecto.getSelectedItem();
			} else {
				empresaAux=(Empresa)jComboBoxid_empresaPresuTipoProyectoGenerico.getSelectedItem();
			}

			if(empresaAux!=null && empresaAux.getId()!=null) {
				presutipoproyecto.setid_empresa(empresaAux.getId());
				presutipoproyecto.setempresa_descripcion(PresuTipoProyectoConstantesFunciones.getEmpresaDescripcion(empresaAux));
				presutipoproyecto.setEmpresa(empresaAux);			}
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

					if(!PresuTipoProyectoJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormPresuTipoProyecto!=null) { 
							this.jInternalFrameDetalleFormPresuTipoProyecto.jComboBoxid_empresaPresuTipoProyecto.removeAllItems();

							for(Empresa empresa:this.empresasForeignKey) {
								this.jInternalFrameDetalleFormPresuTipoProyecto.jComboBoxid_empresaPresuTipoProyecto.addItem(empresa);
							}
						}
					}

					if(this.jInternalFrameDetalleFormPresuTipoProyecto!=null) { 
					}

					if(!PresuTipoProyectoJInternalFrame.ISBINDING_MANUAL) {
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
						if(this.jInternalFrameDetalleFormPresuTipoProyecto!=null) {
							this.jInternalFrameDetalleFormPresuTipoProyecto.jComboBoxid_empresaPresuTipoProyecto.setSelectedItem(empresa);
						}
					} else {
						if(this.jInternalFrameDetalleFormPresuTipoProyecto!=null) {
							this.jInternalFrameDetalleFormPresuTipoProyecto.jComboBoxid_empresaPresuTipoProyecto.setSelectedIndex(iIndexSelected);
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

	


	
	public void refrescarForeignKeysDescripcionesPresuTipoProyecto() throws Exception {
		//SI FUNCIONA DEEPLOAD ESTO VA AL ULTIMO
		if(Constantes.ISUSAEJBLOGICLAYER) {
			PresuTipoProyectoConstantesFunciones.refrescarForeignKeysDescripcionesPresuTipoProyecto(this.presutipoproyectoLogic.getPresuTipoProyectos());
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			PresuTipoProyectoConstantesFunciones.refrescarForeignKeysDescripcionesPresuTipoProyecto(this.presutipoproyectos);
		}
		
		/*
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		classes.add(new Classe(Empresa.class));
			
		if(Constantes.ISUSAEJBLOGICLAYER) {
			//USA LOS OBJETOS DE LOGIC DIRECTAMENTE
			//presutipoproyectoLogic.setPresuTipoProyectos(this.presutipoproyectos);
			presutipoproyectoLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
	
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
		
	public PresuTipoProyectoParameterReturnGeneral getPresuTipoProyectoParameterGeneral() {
		return this.presutipoproyectoParameterGeneral;
	}
	
	public void setPresuTipoProyectoParameterGeneral(PresuTipoProyectoParameterReturnGeneral presutipoproyectoParameterGeneral) {
		this.presutipoproyectoParameterGeneral = presutipoproyectoParameterGeneral;
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
	
	public Boolean getIsPermisoTodoPresuTipoProyecto() {
		return isPermisoTodoPresuTipoProyecto;
	}

	public void setIsPermisoTodoPresuTipoProyecto(Boolean isPermisoTodoPresuTipoProyecto) {
		this.isPermisoTodoPresuTipoProyecto = isPermisoTodoPresuTipoProyecto;
	}

	public Boolean getIsPermisoNuevoPresuTipoProyecto() {
		return isPermisoNuevoPresuTipoProyecto;
	}

	public void setIsPermisoNuevoPresuTipoProyecto(Boolean isPermisoNuevoPresuTipoProyecto) {
		this.isPermisoNuevoPresuTipoProyecto = isPermisoNuevoPresuTipoProyecto;
	}

	public Boolean getIsPermisoActualizarPresuTipoProyecto() {
		return isPermisoActualizarPresuTipoProyecto;
	}

	public void setIsPermisoActualizarPresuTipoProyecto(Boolean isPermisoActualizarPresuTipoProyecto) {
		this.isPermisoActualizarPresuTipoProyecto = isPermisoActualizarPresuTipoProyecto;
	}

	public Boolean getIsPermisoEliminarPresuTipoProyecto() {
		return isPermisoEliminarPresuTipoProyecto;
	}

	public void setIsPermisoEliminarPresuTipoProyecto(Boolean isPermisoEliminarPresuTipoProyecto) {
		this.isPermisoEliminarPresuTipoProyecto = isPermisoEliminarPresuTipoProyecto;
	}

	public Boolean getIsPermisoGuardarCambiosPresuTipoProyecto() {
		return isPermisoGuardarCambiosPresuTipoProyecto;
	}

	public void setIsPermisoGuardarCambiosPresuTipoProyecto(Boolean isPermisoGuardarCambiosPresuTipoProyecto) {
		this.isPermisoGuardarCambiosPresuTipoProyecto = isPermisoGuardarCambiosPresuTipoProyecto;
	}
	
	public Boolean getIsPermisoConsultaPresuTipoProyecto() {
		return isPermisoConsultaPresuTipoProyecto;
	}

	public void setIsPermisoConsultaPresuTipoProyecto(Boolean isPermisoConsultaPresuTipoProyecto) {
		this.isPermisoConsultaPresuTipoProyecto = isPermisoConsultaPresuTipoProyecto;
	}

	public Boolean getIsPermisoBusquedaPresuTipoProyecto() {
		return isPermisoBusquedaPresuTipoProyecto;
	}

	public void setIsPermisoBusquedaPresuTipoProyecto(Boolean isPermisoBusquedaPresuTipoProyecto) {
		this.isPermisoBusquedaPresuTipoProyecto = isPermisoBusquedaPresuTipoProyecto;
	}

	public Boolean getIsPermisoReportePresuTipoProyecto() {
		return isPermisoReportePresuTipoProyecto;
	}

	public void setIsPermisoReportePresuTipoProyecto(Boolean isPermisoReportePresuTipoProyecto) {
		this.isPermisoReportePresuTipoProyecto = isPermisoReportePresuTipoProyecto;
	}
	
	public Boolean getIsPermisoPaginacionMedioPresuTipoProyecto() {
		return isPermisoPaginacionMedioPresuTipoProyecto;
	}

	public void setIsPermisoPaginacionMedioPresuTipoProyecto(Boolean isPermisoPaginacionMedioPresuTipoProyecto) {
		this.isPermisoPaginacionMedioPresuTipoProyecto = isPermisoPaginacionMedioPresuTipoProyecto;
	}
	
	public Boolean getIsPermisoPaginacionTodoPresuTipoProyecto() {
		return isPermisoPaginacionTodoPresuTipoProyecto;
	}

	public void setIsPermisoPaginacionTodoPresuTipoProyecto(Boolean isPermisoPaginacionTodoPresuTipoProyecto) {
		this.isPermisoPaginacionTodoPresuTipoProyecto = isPermisoPaginacionTodoPresuTipoProyecto;
	}
	
	public Boolean getIsPermisoPaginacionAltoPresuTipoProyecto() {
		return isPermisoPaginacionAltoPresuTipoProyecto;
	}

	public void setIsPermisoPaginacionAltoPresuTipoProyecto(Boolean isPermisoPaginacionAltoPresuTipoProyecto) {
		this.isPermisoPaginacionAltoPresuTipoProyecto = isPermisoPaginacionAltoPresuTipoProyecto;
	}
	
	public Boolean getIsPermisoCopiarPresuTipoProyecto() {
		return isPermisoCopiarPresuTipoProyecto;
	}

	public void setIsPermisoCopiarPresuTipoProyecto(Boolean isPermisoCopiarPresuTipoProyecto) {
		this.isPermisoCopiarPresuTipoProyecto = isPermisoCopiarPresuTipoProyecto;
	}
	
	public Boolean getIsPermisoVerFormPresuTipoProyecto() {
		return isPermisoVerFormPresuTipoProyecto;
	}

	public void setIsPermisoVerFormPresuTipoProyecto(Boolean isPermisoVerFormPresuTipoProyecto) {
		this.isPermisoVerFormPresuTipoProyecto = isPermisoVerFormPresuTipoProyecto;
	}
	
	public Boolean getIsPermisoDuplicarPresuTipoProyecto() {
		return isPermisoDuplicarPresuTipoProyecto;
	}

	public void setIsPermisoDuplicarPresuTipoProyecto(Boolean isPermisoDuplicarPresuTipoProyecto) {
		this.isPermisoDuplicarPresuTipoProyecto = isPermisoDuplicarPresuTipoProyecto;
	}
	
	public Boolean getIsPermisoOrdenPresuTipoProyecto() {
		return isPermisoOrdenPresuTipoProyecto;
	}

	public void setIsPermisoOrdenPresuTipoProyecto(Boolean isPermisoOrdenPresuTipoProyecto) {
		this.isPermisoOrdenPresuTipoProyecto = isPermisoOrdenPresuTipoProyecto;
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
	
	public Boolean getIsVisibilidadCeldaNuevoPresuTipoProyecto() {
		return isVisibilidadCeldaNuevoPresuTipoProyecto;
	}

	public void setIsVisibilidadCeldaNuevoPresuTipoProyecto(Boolean isVisibilidadCeldaNuevoPresuTipoProyecto) {
		this.isVisibilidadCeldaNuevoPresuTipoProyecto = isVisibilidadCeldaNuevoPresuTipoProyecto;
	}
	
	public Boolean getIsVisibilidadCeldaDuplicarPresuTipoProyecto() {
		return isVisibilidadCeldaDuplicarPresuTipoProyecto;
	}

	public void setIsVisibilidadCeldaDuplicarPresuTipoProyecto(Boolean isVisibilidadCeldaDuplicarPresuTipoProyecto) {
		this.isVisibilidadCeldaDuplicarPresuTipoProyecto = isVisibilidadCeldaDuplicarPresuTipoProyecto;
	}
	
	public Boolean getIsVisibilidadCeldaCopiarPresuTipoProyecto() {
		return isVisibilidadCeldaCopiarPresuTipoProyecto;
	}

	public void setIsVisibilidadCeldaCopiarPresuTipoProyecto(Boolean isVisibilidadCeldaCopiarPresuTipoProyecto) {
		this.isVisibilidadCeldaCopiarPresuTipoProyecto = isVisibilidadCeldaCopiarPresuTipoProyecto;
	}
	
	public Boolean getIsVisibilidadCeldaVerFormPresuTipoProyecto() {
		return isVisibilidadCeldaVerFormPresuTipoProyecto;
	}

	public void setIsVisibilidadCeldaVerFormPresuTipoProyecto(Boolean isVisibilidadCeldaVerFormPresuTipoProyecto) {
		this.isVisibilidadCeldaVerFormPresuTipoProyecto = isVisibilidadCeldaVerFormPresuTipoProyecto;
	}
	
	public Boolean getIsVisibilidadCeldaOrdenPresuTipoProyecto() {
		return isVisibilidadCeldaOrdenPresuTipoProyecto;
	}

	public void setIsVisibilidadCeldaOrdenPresuTipoProyecto(Boolean isVisibilidadCeldaOrdenPresuTipoProyecto) {
		this.isVisibilidadCeldaOrdenPresuTipoProyecto = isVisibilidadCeldaOrdenPresuTipoProyecto;
	}
	
	public Boolean getIsVisibilidadCeldaNuevoRelacionesPresuTipoProyecto() {
		return isVisibilidadCeldaNuevoRelacionesPresuTipoProyecto;
	}

	public void setIsVisibilidadCeldaNuevoRelacionesPresuTipoProyecto(Boolean isVisibilidadCeldaNuevoRelacionesPresuTipoProyecto) {
		this.isVisibilidadCeldaNuevoRelacionesPresuTipoProyecto = isVisibilidadCeldaNuevoRelacionesPresuTipoProyecto;
	}
	
	public Boolean getIsVisibilidadCeldaModificarPresuTipoProyecto() {
		return isVisibilidadCeldaModificarPresuTipoProyecto;
	}

	public void setIsVisibilidadCeldaModificarPresuTipoProyecto(Boolean isVisibilidadCeldaModificarPresuTipoProyecto) {
		this.isVisibilidadCeldaModificarPresuTipoProyecto = isVisibilidadCeldaModificarPresuTipoProyecto;
	}
	
	public Boolean getIsVisibilidadCeldaActualizarPresuTipoProyecto() {
		return isVisibilidadCeldaActualizarPresuTipoProyecto;
	}

	public void setIsVisibilidadCeldaActualizarPresuTipoProyecto(Boolean isVisibilidadCeldaActualizarPresuTipoProyecto) {
		this.isVisibilidadCeldaActualizarPresuTipoProyecto = isVisibilidadCeldaActualizarPresuTipoProyecto;
	}

	public Boolean getIsVisibilidadCeldaEliminarPresuTipoProyecto() {
		return isVisibilidadCeldaEliminarPresuTipoProyecto;
	}

	public void setIsVisibilidadCeldaEliminarPresuTipoProyecto(Boolean isVisibilidadCeldaEliminarPresuTipoProyecto) {
		this.isVisibilidadCeldaEliminarPresuTipoProyecto = isVisibilidadCeldaEliminarPresuTipoProyecto;
	}

	public Boolean getIsVisibilidadCeldaCancelarPresuTipoProyecto() {
		return isVisibilidadCeldaCancelarPresuTipoProyecto;
	}

	public void setIsVisibilidadCeldaCancelarPresuTipoProyecto(Boolean isVisibilidadCeldaCancelarPresuTipoProyecto) {
		this.isVisibilidadCeldaCancelarPresuTipoProyecto = isVisibilidadCeldaCancelarPresuTipoProyecto;
	}

	public Boolean getIsVisibilidadCeldaGuardarPresuTipoProyecto() {
		return isVisibilidadCeldaGuardarPresuTipoProyecto;
	}

	public void setIsVisibilidadCeldaGuardarPresuTipoProyecto(Boolean isVisibilidadCeldaGuardarPresuTipoProyecto) {
		this.isVisibilidadCeldaGuardarPresuTipoProyecto = isVisibilidadCeldaGuardarPresuTipoProyecto;
	}
	
	public Boolean getIsVisibilidadCeldaGuardarCambiosPresuTipoProyecto() {
		return isVisibilidadCeldaGuardarCambiosPresuTipoProyecto;
	}

	public void setIsVisibilidadCeldaGuardarCambiosPresuTipoProyecto(Boolean isVisibilidadCeldaGuardarCambiosPresuTipoProyecto) {
		this.isVisibilidadCeldaGuardarCambiosPresuTipoProyecto = isVisibilidadCeldaGuardarCambiosPresuTipoProyecto;
	}
		
	public PresuTipoProyectoSessionBean getpresutipoproyectoSessionBean() {
		return this.presutipoproyectoSessionBean;
	}
	
	public void setpresutipoproyectoSessionBean(PresuTipoProyectoSessionBean presutipoproyectoSessionBean) {
		this.presutipoproyectoSessionBean=presutipoproyectoSessionBean;
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

	
	
	public void setVariablesFormularioToObjetoActualForeignKeysPresuTipoProyecto(PresuTipoProyecto presutipoproyecto)throws Exception {
		try {
			
				this.setActualParaGuardarEmpresaForeignKey(presutipoproyecto,null);
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
	
	public void bugActualizarReferenciaActual(PresuTipoProyecto presutipoproyecto,PresuTipoProyecto presutipoproyectoAux) throws Exception {
		//ARCHITECTURE		
		//EL ID NEGATIVO GUARDADO EN ORIGINAL SIRVE PARA VERIFICAR Y ACTUALIZAR EL REGISTRO NUEVO (ID,VERSIONROW)
		this.setCamposBaseDesdeOriginalPresuTipoProyecto(presutipoproyecto);
					
		//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
		presutipoproyectoAux.setId(presutipoproyecto.getId());
		presutipoproyectoAux.setVersionRow(presutipoproyecto.getVersionRow());					
	}
	
	public void ejecutarMantenimiento(MaintenanceType maintenanceType)throws Exception {	
		try	{								
			
			//this.startProcessPresuTipoProyecto();
		
			int intSelectedRow = this.jTableDatosPresuTipoProyecto.getSelectedRow();	       
			
			//PUEDE SER -1 CUANDO SE ELIMINA EN GUARDAR CAMBIOS
			if(intSelectedRow>=0 && maintenanceType!=MaintenanceType.GUARDARCAMBIOS) {
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
					
				//ARCHITECTURE
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.presutipoproyecto =(PresuTipoProyecto) this.presutipoproyectoLogic.getPresuTipoProyectos().toArray()[this.jTableDatosPresuTipoProyecto.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
					this.presutipoproyecto =(PresuTipoProyecto) this.presutipoproyectos.toArray()[this.jTableDatosPresuTipoProyecto.convertRowIndexToModel(intSelectedRow)];
				}
				
				//ARCHITECTURE
				
				if(PresuTipoProyectoJInternalFrame.ISBINDING_MANUAL_TABLA) {
					//this.setVariablesFormularioToObjetoActualPresuTipoProyecto(this.presutipoproyecto,true);
				}
				
				this.setVariablesFormularioToObjetoActualForeignKeysPresuTipoProyecto(this.presutipoproyecto);
			}
			
			//LUEGO DE TRAER DATOS CORRESPONDIENTES QUE COINCIDA LISTA TABLA QUITO FILA TOTALES
			if(this.conTotales) {
				//MEJOR LO DEJO, SI EXISTE EXCEPCION SE PIEDE FILA TOTALES Y ORDEN INDICE FILA ACTUAL
				//this.quitarFilaTotales();
			}
			
			this.cargarDatosCliente();
			
			this.datosDeep=new DatosDeep();
			
			//SE CAMBIA ESTADOS CON ERROR, ENTONCES SE EJECUTA ANTES
			//this.invalidValues = presutipoproyectoValidator.getInvalidValues(this.presutipoproyecto);
			
			//if(this.invalidValues==null || this.invalidValues.length<=0) {
			
			presutipoproyectoLogic.setDatosCliente(datosCliente);
			presutipoproyectoLogic.setIsConDeep(false);
			
			if(maintenanceType==MaintenanceType.NUEVO) {
				presutipoproyectoAux=new  PresuTipoProyecto();
				
				presutipoproyectoAux.setIsNew(true);
				presutipoproyectoAux.setIsChanged(true);
				
				presutipoproyectoAux.setPresuTipoProyectoOriginal(this.presutipoproyecto);
				
				presutipoproyectoAux.setId(this.presutipoproyecto.getId());	
				presutipoproyectoAux.setVersionRow(this.presutipoproyecto.getVersionRow());	
				presutipoproyectoAux.setid_empresa(this.presutipoproyecto.getid_empresa());	
				presutipoproyectoAux.setcodigo(this.presutipoproyecto.getcodigo());	
				presutipoproyectoAux.setnombre(this.presutipoproyecto.getnombre());	
								
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.presutipoproyectoSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.presutipoproyectoSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(presutipoproyectoAux,presutipoproyectoLogic.getPresuTipoProyectos());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(presutipoproyectoAux,presutipoproyectos);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote  && !this.presutipoproyectoSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.presutipoproyectoSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						presutipoproyectoLogic.savePresuTipoProyectos();//WithConnection
						//presutipoproyectoLogic.getSetVersionRowPresuTipoProyectos();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE		
					
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.presutipoproyecto,presutipoproyectoAux);
					
					this.refrescarForeignKeysDescripcionesPresuTipoProyecto();
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.presutipoproyectoSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
						}
						//ARCHITECTURE	
						
						if(!this.presutipoproyectoSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE
												
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								presutipoproyectoLogic.savePresuTipoProyectoRelaciones(presutipoproyectoAux);//WithConnection
								//presutipoproyectoLogic.getSetVersionRowPresuTipoProyectos();//WithConnection
							} else if(Constantes.ISUSAEJBREMOTE) {
							} else if(Constantes.ISUSAEJBHOME) {
							}
							//ARCHITECTURE
							
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							this.bugActualizarReferenciaActual(this.presutipoproyecto,presutipoproyectoAux);
					
					
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE	
						} else {
							
							
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								if(this.presutipoproyectoSessionBean.getEstaModoGuardarRelaciones() 
									|| this.presutipoproyectoSessionBean.getEsGuardarRelacionado())	{
									actualizarLista(presutipoproyectoAux,presutipoproyectoLogic.getPresuTipoProyectos());
								}
							} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
								actualizarLista(presutipoproyectoAux,presutipoproyectos);
							}
							//ARCHITECTURE
							
							//AQUI EL ID NEGATIVO ES EL ID BUSCADO, YA QUE NO SE GENERA OTRO EN LA DB POR INGRESAR UNO NUEVO
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							//this.bugActualizarReferenciaActual(this.presutipoproyecto,presutipoproyectoAux);												
						}
					}
				}
			} else if(maintenanceType==MaintenanceType.ACTUALIZAR) {
				presutipoproyectoAux=new  PresuTipoProyecto();
				
				//PUEDE QUE SE ACTUALIZE ALGUN REGISTRO NUEVO
				if(!this.presutipoproyectoSessionBean.getEsGuardarRelacionado() 
					|| (this.presutipoproyectoSessionBean.getEsGuardarRelacionado() && this.presutipoproyecto.getId()>=0)) {
						
					presutipoproyectoAux.setIsNew(false);
				}
				
				presutipoproyectoAux.setIsDeleted(false);
			
				presutipoproyectoAux.setId(this.presutipoproyecto.getId());	
				presutipoproyectoAux.setVersionRow(this.presutipoproyecto.getVersionRow());	
				presutipoproyectoAux.setid_empresa(this.presutipoproyecto.getid_empresa());	
				presutipoproyectoAux.setcodigo(this.presutipoproyecto.getcodigo());	
				presutipoproyectoAux.setnombre(this.presutipoproyecto.getnombre());	
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(presutipoproyectoAux,presutipoproyectoLogic.getPresuTipoProyectos());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(presutipoproyectoAux,presutipoproyectos);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote && !this.presutipoproyectoSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.presutipoproyectoSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						presutipoproyectoLogic.savePresuTipoProyectos();//WithConnection
						//presutipoproyectoLogic.getSetVersionRowPresuTipoProyectos();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}	
					//ARCHITECTURE
					
					//TALVEZ ESTA DEMAS POR SER UPDATE
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.presutipoproyecto,presutipoproyectoAux);
					
					this.refrescarForeignKeysDescripcionesPresuTipoProyecto();
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.presutipoproyectoSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
						}
						//ARCHITECTURE
						
						if(!this.presutipoproyectoSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								presutipoproyectoLogic.savePresuTipoProyectoRelaciones(presutipoproyectoAux);//WithConnection
								//presutipoproyectoLogic.getSetVersionRowPresuTipoProyectos();//WithConnection
							} else if(Constantes.ISUSAEJBREMOTE) {
							} else if(Constantes.ISUSAEJBHOME) {
							}
							//ARCHITECTURE
							
							//TALVEZ ESTA DEMAS POR SER UPDATE
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							this.bugActualizarReferenciaActual(this.presutipoproyecto,presutipoproyectoAux);
					
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE
						} else {
							
							
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								if(this.presutipoproyectoSessionBean.getEstaModoGuardarRelaciones() 
									|| this.presutipoproyectoSessionBean.getEsGuardarRelacionado())	{
									actualizarLista(presutipoproyectoAux,presutipoproyectoLogic.getPresuTipoProyectos());
								}
							} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
								actualizarLista(presutipoproyectoAux,presutipoproyectos);
							}
							//ARCHITECTURE
							
							//AQUI EL ID NEGATIVO ES EL ID BUSCADO, YA QUE NO SE GENERA OTRO EN LA DB POR INGRESAR UNO NUEVO							
							//TALVEZ ESTA DEMAS POR SER UPDATE
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							//this.bugActualizarReferenciaActual(this.presutipoproyecto,presutipoproyectoAux);
					
						}
					}
				}				
			} else if(maintenanceType==MaintenanceType.ELIMINAR) {
				presutipoproyectoAux=new  PresuTipoProyecto();
				
				presutipoproyectoAux.setIsNew(false);
				presutipoproyectoAux.setIsChanged(false);
				
				presutipoproyectoAux.setIsDeleted(true);
				
				presutipoproyectoAux.setId(this.presutipoproyecto.getId());	
				presutipoproyectoAux.setVersionRow(this.presutipoproyecto.getVersionRow());	
				presutipoproyectoAux.setid_empresa(this.presutipoproyecto.getid_empresa());	
				presutipoproyectoAux.setcodigo(this.presutipoproyecto.getcodigo());	
				presutipoproyectoAux.setnombre(this.presutipoproyecto.getnombre());	
				
				if(this.presutipoproyectoSessionBean.getEsGuardarRelacionado()) {
					//ELEMENTO ACTUAL NO SE HA INGRESADO AL SISTEMA, NO SE PUEDE ELIMINAR ALGO QUE NO EXISTE
					if(this.presutipoproyectoAux.getId()>=0) {	
						this.presutipoproyectosEliminados.add(presutipoproyectoAux);											
					}
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					actualizarLista(presutipoproyectoAux,presutipoproyectoLogic.getPresuTipoProyectos());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(presutipoproyectoAux,presutipoproyectos);
				}
				//ARCHITECTURE
				
				
				if(!isGuardarCambiosEnLote && !this.presutipoproyectoSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.presutipoproyectoSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						presutipoproyectoLogic.savePresuTipoProyectos();//WithConnection
						//presutipoproyectoLogic.getSetVersionRowPresuTipoProyectos();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}	
					//ARCHITECTURE
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.presutipoproyectoSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
						}
						//ARCHITECTURE
						
						
						if(!this.presutipoproyectoSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								presutipoproyectoLogic.savePresuTipoProyectoRelaciones(presutipoproyectoAux);//WithConnection
								//presutipoproyectoLogic.getSetVersionRowPresuTipoProyectos();//WithConnection
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
							if(this.presutipoproyectoSessionBean.getEstaModoGuardarRelaciones() 
								|| this.presutipoproyectoSessionBean.getEsGuardarRelacionado())	{
								actualizarLista(presutipoproyectoAux,presutipoproyectoLogic.getPresuTipoProyectos());
							}
						} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
							actualizarLista(presutipoproyectoAux,presutipoproyectos);
						}
						//ARCHITECTURE
					}
				}				
			} else if(maintenanceType==MaintenanceType.GUARDARCAMBIOS) {		
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.presutipoproyectoLogic.getPresuTipoProyectos().addAll(this.presutipoproyectosEliminados);
					
					presutipoproyectoLogic.savePresuTipoProyectos();//WithConnection
					//presutipoproyectoLogic.getSetVersionRowPresuTipoProyectos();//WithConnection
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}	
				//ARCHITECTURE
				this.refrescarForeignKeysDescripcionesPresuTipoProyecto();
				
				this.presutipoproyectosEliminados= new ArrayList<PresuTipoProyecto>();		
			}
			
			if(this.presutipoproyectoSessionBean.getEsGuardarRelacionado()) {
				 this.crearFilaTotales();
			}
			
			
									
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.presutipoproyectoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				if(!this.isPostAccionSinMensaje) {
					JOptionPane.showMessageDialog(this,"Tipo Proyecto GUARDADO CORRECTAMENTE","MANTENIMIENTO DE Tipo Proyecto",JOptionPane.INFORMATION_MESSAGE);
					if(maintenanceType==MaintenanceType.NUEVO || maintenanceType==MaintenanceType.ACTUALIZAR) {
						//CUANDO ES NUEVO SE PIERDE REFERENCIA NO SE PORQUE
						this.presutipoproyecto=presutipoproyectoAux;
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
      		//this.finishProcessPresuTipoProyecto();
      	}
		
	}	
	
	public void actualizarRelaciones(PresuTipoProyecto presutipoproyectoLocal) throws Exception {
		
		if(this.presutipoproyectoSessionBean.getConGuardarRelaciones()) {			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
			
			
			} else {
				
			}
		}
	}
	
	public void actualizarRelacionFkPadreActual(PresuTipoProyecto presutipoproyectoLocal) throws Exception {	
		if(this.presutipoproyectoSessionBean.getEsGuardarRelacionado()) {			
			
		
			if(this.jInternalFrameParent.getClass().equals(EmpresaDetalleFormJInternalFrame.class)) {
				EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrameLocal=(EmpresaBeanSwingJInternalFrame) ((EmpresaDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				empresaBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoEmpresa(empresaBeanSwingJInternalFrameLocal.getempresa(),true);
				empresaBeanSwingJInternalFrameLocal.actualizarLista(empresaBeanSwingJInternalFrameLocal.empresa,this.empresasForeignKey);

				empresaBeanSwingJInternalFrameLocal.actualizarRelaciones(empresaBeanSwingJInternalFrameLocal.empresa);

				presutipoproyectoLocal.setEmpresa(empresaBeanSwingJInternalFrameLocal.empresa);

				this.addItemDefectoCombosForeignKeyEmpresa();
				this.cargarCombosFrameEmpresasForeignKey("Formulario");
				this.setActualEmpresaForeignKey(empresaBeanSwingJInternalFrameLocal.empresa.getId(),false,"Formulario");
			}
		
		}
	}
	
	public Boolean validarPresuTipoProyectoActual() throws Exception {
		Boolean estaValidado=false;
		this.inicializarInvalidValues();
		
		/*
		int intSelectedRow = this.jTableDatosPresuTipoProyecto.getSelectedRow();
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.presutipoproyecto =(PresuTipoProyecto) this.presutipoproyectoLogic.getPresuTipoProyectos().toArray()[this.jTableDatosPresuTipoProyecto.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
			this.presutipoproyecto =(PresuTipoProyecto) this.presutipoproyectos.toArray()[this.jTableDatosPresuTipoProyecto.convertRowIndexToModel(intSelectedRow)];
		}
		//ARCHITECTURE
		*/
		
		this.invalidValues = presutipoproyectoValidator.getInvalidValues(this.presutipoproyecto);
					
		if(this.invalidValues==null || this.invalidValues.length<=0) {
			estaValidado=true;
		} else {
			this.mostrarInvalidValues();	
		}
		
		return estaValidado;
	}
	
	public void actualizarLista(PresuTipoProyecto presutipoproyecto,List<PresuTipoProyecto> presutipoproyectos) throws Exception {
		try	{		
			PresuTipoProyectoConstantesFunciones.actualizarLista(presutipoproyecto,presutipoproyectos,this.presutipoproyectoSessionBean.getEsGuardarRelacionado());		
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void actualizarSelectedLista(PresuTipoProyecto presutipoproyecto,List<PresuTipoProyecto> presutipoproyectos) throws Exception {
		try	{			
			PresuTipoProyectoConstantesFunciones.actualizarSelectedLista(presutipoproyecto,presutipoproyectos);
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public Boolean tieneElementosSeleccionados() throws Exception {
		Boolean tiene=false;
		
		List<PresuTipoProyecto> presutipoproyectosLocal=null;
		
		try	{			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				presutipoproyectosLocal=this.presutipoproyectoLogic.getPresuTipoProyectos();
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				presutipoproyectosLocal=this.presutipoproyectos;
			}
			//ARCHITECTURE
		
			for(PresuTipoProyecto presutipoproyectoLocal:presutipoproyectosLocal) {
				if(this.permiteMantenimiento(presutipoproyectoLocal) && presutipoproyectoLocal.getIsSelected()) {
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
			sMensaje+="\r\n"+PresuTipoProyectoConstantesFunciones.getPresuTipoProyectoLabelDesdeNombre(invalidValue.getPropertyName())+"->"+invalidValue.getMessage();
			
			//MOSTRAR CAMPOS INVALIDOS
			if(invalidValue.getPropertyName().equals(PresuTipoProyectoConstantesFunciones.IDEMPRESA)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormPresuTipoProyecto.jLabelid_empresaPresuTipoProyecto,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(PresuTipoProyectoConstantesFunciones.CODIGO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormPresuTipoProyecto.jLabelcodigoPresuTipoProyecto,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(PresuTipoProyectoConstantesFunciones.NOMBRE)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormPresuTipoProyecto.jLabelnombrePresuTipoProyecto,invalidValue.getMessage());}
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
		
		if(this.jInternalFrameDetalleFormPresuTipoProyecto!=null) {
		
		//MOSTRAR CAMPOS INVALIDOS
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormPresuTipoProyecto.jLabelid_empresaPresuTipoProyecto,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormPresuTipoProyecto.jLabelcodigoPresuTipoProyecto,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormPresuTipoProyecto.jLabelnombrePresuTipoProyecto,"");
		
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
		this.iIdNuevoPresuTipoProyecto--;	
		
		
		this.presutipoproyectoAux=new PresuTipoProyecto();
		
		this.presutipoproyectoAux.setId(this.iIdNuevoPresuTipoProyecto);
		this.presutipoproyectoAux.setIsChanged(true);
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.presutipoproyectoLogic.getPresuTipoProyectos().add(this.presutipoproyectoAux);
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.presutipoproyectos.add(this.presutipoproyectoAux);
		}
		//ARCHITECTURE
		
		this.presutipoproyecto=this.presutipoproyectoAux;
		
		if(PresuTipoProyectoJInternalFrame.ISBINDING_MANUAL_TABLA) {
			this.setVariablesObjetoActualToFormularioPresuTipoProyecto(this.presutipoproyecto);
			this.setVariablesObjetoActualToFormularioForeignKeyPresuTipoProyecto(this.presutipoproyecto);
		}
				
		//this.setDefaultControlesPresuTipoProyecto();
		
		this.inicializarInvalidValues();
				
		//SELECCIONA ITEM DEFECTO-->SET O SELECTED INDEX
		this.setItemDefectoCombosForeignKeyPresuTipoProyecto();
		
		
		//INICIALIZA VARIABLES COMBOS GLOBALES A FORMULARIO(ParametroGeneralUsuario)
		this.setVariablesGlobalesCombosForeignKeyPresuTipoProyecto();
		
		//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
		//this.setVariablesGlobalesAuxiliaresCombosForeignKeyPresuTipoProyecto();
		
		//SI TIENE FOREIGN KEY CON CAMPO esDefecto=true, SE ACTUALIZA A OBJETO ACTUAL
		this.setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualPresuTipoProyecto(this.presutipoproyectoBean,this.presutipoproyecto,false,false);
		
		//ACTUALIZA VALORES PARA EL OBJETO ACTUAL ANTES DE ENVIARLO A ACTUALIZAR
		this.setVariablesFormularioToObjetoActualForeignKeysPresuTipoProyecto(this.presutipoproyecto);
				
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		if(this.jInternalFrameParent!=null) {
			this.jInternalFrameParent.actualizarObjetoPadreFk(PresuTipoProyectoConstantesFunciones.CLASSNAME);
		}	
		
		
		if(this.presutipoproyectoSessionBean.getConGuardarRelaciones()) {
			classes=PresuTipoProyectoConstantesFunciones.getClassesRelationshipsOfPresuTipoProyecto(new ArrayList<Classe>(),DeepLoadType.NONE);
		}
		
		this.classesActual=new ArrayList<Classe>();
		this.classesActual.addAll(classes);
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {						
			this.presutipoproyectoReturnGeneral=presutipoproyectoLogic.procesarEventosPresuTipoProyectosWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,EventoGlobalTipo.FORM_RECARGAR,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.presutipoproyectoLogic.getPresuTipoProyectos(),this.presutipoproyecto,this.presutipoproyectoParameterGeneral,this.isEsNuevoPresuTipoProyecto,classes);//this.presutipoproyectoLogic.getPresuTipoProyecto()
						
		} else if(Constantes.ISUSAEJBREMOTE) {
						
		} else if(Constantes.ISUSAEJBHOME) {
		}
		//ARCHITECTURE
		
		//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
		//this.setVariablesObjetoReturnGeneralToBeanPresuTipoProyecto(this.presutipoproyectoReturnGeneral,this.presutipoproyectoBean,false);
		
		if(this.presutipoproyectoReturnGeneral.getConRecargarPropiedades()) {
			//INICIALIZA VARIABLES COMBOS NORMALES (FK)
			this.setVariablesObjetoActualToFormularioForeignKeyPresuTipoProyecto(this.presutipoproyectoReturnGeneral.getPresuTipoProyecto());
			
			//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
			this.setVariablesObjetoActualToFormularioPresuTipoProyecto(this.presutipoproyectoReturnGeneral.getPresuTipoProyecto());
		}
		
		if(this.presutipoproyectoReturnGeneral.getConRecargarRelaciones()) {
			//INICIALIZA VARIABLES RELACIONES A FORMULARIO
			this.setVariablesRelacionesObjetoActualToFormularioPresuTipoProyecto(this.presutipoproyectoReturnGeneral.getPresuTipoProyecto(),classes);//this.presutipoproyectoBean);	
		}
			
		//ACTUALIZA VARIABLES FORMULARIO A OBJETO ACTUAL (PARA NUEVO TABLA O GUARDAR CAMBIOS
		if(esNuevoGuardarCambios) {
			this.setVariablesFormularioToObjetoActualPresuTipoProyecto(this.presutipoproyecto,false);
		}
		
		//INICIALIZA VARIABLES COMBOS DEFAULT DEL PROYECTO(|DEFAULT para FK)
		//this.setVariablesDefaultCombosForeignKeyPresuTipoProyecto();
		
		//INICIALIZA VARIABLES COMBOS PARAMETRO DEL PROYECTO(|VALORPARAM Era para ParametroModulo, ahora en logic)
		//this.setVariablesParametroCombosForeignKeyPresuTipoProyecto();						
		
		if(!esNuevoGuardarCambios) {
			//INICIALIZA VARIABLES POR OPCION MENU
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			PresuTipoProyectoBeanSwingJInternalFrameAdditional.RecargarFormPresuTipoProyecto(this,"NUEVO_PREPARAR","",this.arrDatoGeneral);
		
			//NO FUNCIONA BINDINGS			
			this.inicializarActualizarBindingPresuTipoProyecto(false);
						
			if(presutipoproyectoSessionBean.getConGuardarRelaciones()) {
				//DEBERIA YA ESTAR CARGADO LOS COMBOS Y SI SE NECESITA ALGO MAS SE DEBE CREAR FUNCION LIMITADA
				//SI DEBE TRAER Y RESETEAR TABLA
								
			}
				
			//SI ES MANUAL
			if(PresuTipoProyectoJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualPresuTipoProyecto();
			}
			
			this.actualizarVisualTableDatosPresuTipoProyecto();
			
			this.jTableDatosPresuTipoProyecto.setRowSelectionInterval(this.getIndiceNuevoPresuTipoProyecto(), this.getIndiceNuevoPresuTipoProyecto());
			
			this.seleccionarFilaTablaPresuTipoProyectoActual();
						
			this.actualizarEstadoCeldasBotonesPresuTipoProyecto("a", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		}		
	}
	
	public void habilitarDeshabilitarControlesPresuTipoProyecto(Boolean isHabilitar) throws Exception {
		
		this.jInternalFrameDetalleFormPresuTipoProyecto.jTextFieldcodigoPresuTipoProyecto.setEnabled(isHabilitar && this.presutipoproyectoConstantesFunciones.activarcodigoPresuTipoProyecto);
		this.jInternalFrameDetalleFormPresuTipoProyecto.jTextAreanombrePresuTipoProyecto.setEnabled(isHabilitar && this.presutipoproyectoConstantesFunciones.activarnombrePresuTipoProyecto);	
		//
		this.jInternalFrameDetalleFormPresuTipoProyecto.jComboBoxid_empresaPresuTipoProyecto.setEnabled(isHabilitar && this.presutipoproyectoConstantesFunciones.activarid_empresaPresuTipoProyecto);
	};
	
	public void setDefaultControlesPresuTipoProyecto() throws Exception {
			
	};
	
	
	public void habilitarDeshabilitarTipoMantenimientoPresuTipoProyecto(Boolean esRelaciones) throws Exception {
		if(esRelaciones) {
			//this.presutipoproyectoSessionBean.setConGuardarRelaciones(true);			
			this.presutipoproyectoSessionBean.setEstaModoGuardarRelaciones(true);				
			this.jInternalFrameDetalleFormPresuTipoProyecto.jTabbedPaneRelacionesPresuTipoProyecto.setVisible(true);
			
					
		} else {
			//this.presutipoproyectoSessionBean.setConGuardarRelaciones(false);			
			this.presutipoproyectoSessionBean.setEstaModoGuardarRelaciones(false);						
			this.jInternalFrameDetalleFormPresuTipoProyecto.jTabbedPaneRelacionesPresuTipoProyecto.setVisible(false);
			
			
		}
	};
	
	public int getIndiceNuevoPresuTipoProyecto() throws Exception {
		int iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(PresuTipoProyecto presutipoproyectoAux:this.presutipoproyectoLogic.getPresuTipoProyectos()) {
				if(presutipoproyectoAux.getId().equals(this.iIdNuevoPresuTipoProyecto)) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(PresuTipoProyecto presutipoproyectoAux:this.presutipoproyectos) {
				if(presutipoproyectoAux.getId().equals(this.iIdNuevoPresuTipoProyecto)) {
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
	
	public int getIndiceActualPresuTipoProyecto(PresuTipoProyecto presutipoproyecto,Integer iIndiceActual) throws Exception {
		Integer iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(PresuTipoProyecto presutipoproyectoAux:this.presutipoproyectoLogic.getPresuTipoProyectos()) {
				if(presutipoproyectoAux.getId().equals(presutipoproyecto.getId())) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(PresuTipoProyecto presutipoproyectoAux:this.presutipoproyectos) {
				if(presutipoproyectoAux.getId().equals(presutipoproyecto.getId())) {
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
	
	public void setCamposBaseDesdeOriginalPresuTipoProyecto(PresuTipoProyecto presutipoproyectoOriginal) throws Exception {
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(PresuTipoProyecto presutipoproyectoAux:this.presutipoproyectoLogic.getPresuTipoProyectos()) {
				if(presutipoproyectoAux.getPresuTipoProyectoOriginal().getId().equals(presutipoproyectoOriginal.getId())) {
					existe=true;
					presutipoproyectoOriginal.setId(presutipoproyectoAux.getId());
					presutipoproyectoOriginal.setVersionRow(presutipoproyectoAux.getVersionRow());
					break;
				}
				
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(PresuTipoProyecto presutipoproyectoAux:this.presutipoproyectos) {
				if(presutipoproyectoAux.getPresuTipoProyectoOriginal().getId().equals(presutipoproyectoOriginal.getId())) {
					existe=true;
					presutipoproyectoOriginal.setId(presutipoproyectoAux.getId());
					presutipoproyectoOriginal.setVersionRow(presutipoproyectoAux.getVersionRow());
					break;
				}				
			}
		}
		//ARCHITECTURE
		
		if(!existe) {
			//SI NO EXISTE TOMA LA ULTIMA FILA
		}
	}
	
	public void cancelarNuevosPresuTipoProyecto(Boolean esParaCancelar) throws Exception {
		presutipoproyectosAux=new ArrayList<PresuTipoProyecto>();
		presutipoproyectoAux=new PresuTipoProyecto();
		
		if(!this.presutipoproyectoSessionBean.getEsGuardarRelacionado()) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(PresuTipoProyecto presutipoproyectoAux:this.presutipoproyectoLogic.getPresuTipoProyectos()) {
					if(presutipoproyectoAux.getId()<0) {
						presutipoproyectosAux.add(presutipoproyectoAux);
					}		
				}
				this.iIdNuevoPresuTipoProyecto=0L;
				this.presutipoproyectoLogic.getPresuTipoProyectos().removeAll(presutipoproyectosAux);
					
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(PresuTipoProyecto presutipoproyectoAux:this.presutipoproyectos) {
					if(presutipoproyectoAux.getId()<0) {
						presutipoproyectosAux.add(presutipoproyectoAux);
					}		
				}
				this.iIdNuevoPresuTipoProyecto=0L;
				this.presutipoproyectos.removeAll(presutipoproyectosAux);
			}	
		} else {			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				if(esParaCancelar && this.isEsNuevoPresuTipoProyecto 
					&& this.presutipoproyectoLogic.getPresuTipoProyectos().size()>0
					) {
					presutipoproyectoAux=this.presutipoproyectoLogic.getPresuTipoProyectos().get(this.presutipoproyectoLogic.getPresuTipoProyectos().size() - 1);
				
					if(presutipoproyectoAux.getId()<0) {
						this.presutipoproyectoLogic.getPresuTipoProyectos().remove(presutipoproyectoAux);
					}
				}
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				if(esParaCancelar && this.isEsNuevoPresuTipoProyecto && this.presutipoproyectos.size()>0) {
					presutipoproyectoAux=this.presutipoproyectos.get(this.presutipoproyectos.size() - 1);
				
					if(presutipoproyectoAux.getId()<0) {
						this.presutipoproyectos.remove(presutipoproyectoAux);
					}
				}
			}	
		}
	}
	
	public void cancelarNuevoPresuTipoProyecto(Boolean esParaCancelar) throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			if(presutipoproyecto.getId()<0) {
				this.presutipoproyectoLogic.getPresuTipoProyectos().remove(this.presutipoproyecto);
			}					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			if(presutipoproyecto.getId()<0) {
				this.presutipoproyectos.remove(this.presutipoproyecto);
			}
		}			
	}
	
	public void setEstadosInicialesPresuTipoProyecto(List<PresuTipoProyecto> presutipoproyectosAux) throws Exception {
		PresuTipoProyectoConstantesFunciones.setEstadosInicialesPresuTipoProyecto(presutipoproyectosAux);
	}
	
	public void setEstadosInicialesPresuTipoProyecto(PresuTipoProyecto presutipoproyectoAux) throws Exception {
		PresuTipoProyectoConstantesFunciones.setEstadosInicialesPresuTipoProyecto(presutipoproyectoAux);		
	}
	
	public void nuevo() throws Exception {
		try	{
			//ESTA VALIDADO EN FUNCION ACTUALIZAR
			//if(this.validarPresuTipoProyectoActual()) {
				this.ejecutarMantenimiento(MaintenanceType.NUEVO);
				
				this.actualizarEstadoCeldasBotonesPresuTipoProyecto("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
				
			//}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,PresuTipoProyectoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void actualizar() throws Exception {
		try	{
			if(this.validarPresuTipoProyectoActual()) {
				if(!this.isEsNuevoPresuTipoProyecto) {
					this.ejecutarMantenimiento(MaintenanceType.ACTUALIZAR);
					
					this.actualizarEstadoCeldasBotonesPresuTipoProyecto("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
					
				} else {					
					this.nuevo();
					this.isEsNuevoPresuTipoProyecto=false;
				}
				
				//SE CANCELA AL FINAL DEL PROCESO JBUTTONACTUALIZAR
				//this.cancelar(false);
			}		
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,PresuTipoProyectoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void eliminar() throws Exception {
		try	{	
			if(this.validarPresuTipoProyectoActual()) {
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE ELIMINAR EL/LA Tipo Proyecto ?", "MANTENIMIENTO DE Tipo Proyecto", JOptionPane.OK_CANCEL_OPTION) == 0) {
					this.ejecutarMantenimiento(MaintenanceType.ELIMINAR);			
					this.actualizarEstadoCeldasBotonesPresuTipoProyecto("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
				}
			
			}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,PresuTipoProyectoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void guardarCambios() throws Exception {
		try	{
			this.ejecutarMantenimiento(MaintenanceType.GUARDARCAMBIOS);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PresuTipoProyectoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarAsignar(PresuTipoProyecto presutipoproyecto) throws Exception {
		PresuTipoProyectoConstantesFunciones.seleccionarAsignar(this.presutipoproyecto,presutipoproyecto);
	}
	
	public void seleccionar() throws Exception {
		try	{
			//ACTUALIZO EL PERMISO ACTUALIZAR CON EL PERMISO ACTUALIZAR ORIGINAL ESTE PERMISO SE UTILIZA PARA EL NUEVO TAMBIEN
			this.isPermisoActualizarPresuTipoProyecto=this.isPermisoActualizarOriginalPresuTipoProyecto;
			
			
			this.seleccionarAsignar(presutipoproyecto);
			
			
			
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			PresuTipoProyectoConstantesFunciones.quitarEspaciosPresuTipoProyecto(this.presutipoproyecto,this.arrDatoGeneral);
			
			
			this.actualizarEstadoCeldasBotonesPresuTipoProyecto("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PresuTipoProyectoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarBusqueda(Long id) throws Exception {
		try	{
			this.presutipoproyectoSessionBean.setsFuncionBusquedaRapida(this.presutipoproyectoSessionBean.getsFuncionBusquedaRapida().replace("TO_REPLACE", id.toString()));
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PresuTipoProyectoConstantesFunciones.CLASSNAME);
		}
	}
	
	
	
	public void cancelar() throws Exception {
		this.cancelar(true);
	}
	
	public void cancelar(Boolean esParaCancelar) throws Exception {
		try {
														
			
			//SE UTILIZA COLUMNA ELIMINAR EN TABLA
			if(this.isEsNuevoPresuTipoProyecto) {
				//NO CANCELA TODOS NUEVOS POR FUNCIONALIDAD GUARDAR CAMBIOS
				//this.cancelarNuevosPresuTipoProyecto(esParaCancelar);				
				this.cancelarNuevoPresuTipoProyecto(esParaCancelar);								
			}
			
			this.presutipoproyecto=new PresuTipoProyecto();
			
			this.inicializarPresuTipoProyecto();
			
			this.actualizarEstadoCeldasBotonesPresuTipoProyecto("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PresuTipoProyectoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void inicializarPresuTipoProyecto() throws Exception {
		try {
			PresuTipoProyectoConstantesFunciones.inicializarPresuTipoProyecto(this.presutipoproyecto);
			
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
			FuncionesSwing.manageException(this, e,logger,PresuTipoProyectoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void siguientes()throws Exception {
		try	{			
			if(this.presutipoproyectoLogic.getPresuTipoProyectos().size()>0) {
					
				this.iNumeroPaginacionPagina=this.iNumeroPaginacionPagina+this.iNumeroPaginacion;
			}
				
			this.procesarBusqueda(this.sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PresuTipoProyectoConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void generarReportePresuTipoProyectos(String sAccionBusqueda,List<PresuTipoProyecto> presutipoproyectosParaReportes) throws Exception {
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
					sPathReporteFinal="PresuTipoProyecto"+this.sTipoReporteExtra+"Design.jasper";
					reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);	
				} else {
					sPathReporteFinal=this.sPathReporteDinamico;
					reportFile = new FileInputStream(sPathReporteFinal);
				}
			} else {
				sPathReporteFinal="PresuTipoProyectoMasterRelaciones"+this.sTipoReporteExtra+"Design.jasper";
				reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);
				//sPathReportes=reportFile.getPath().replace("PresuTipoProyectoMasterRelacionesDesign.jasper", "");
			}
		} else {
				sPathReporteFinal="PresuTipoProyecto"+this.sTipoReporteExtra+"Design.jasper";
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
		parameters.put("subtitulo", "Reporte De  Tipo Proyectos");		
		parameters.put("busquedapor", PresuTipoProyectoConstantesFunciones.getNombreIndice(sAccionBusqueda)+sDetalleReporte);
		
		
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
		
		JRBeanArrayDataSource jrbeanArrayDataSourcePresuTipoProyecto=null;
		
		if(this.sTipoReporteExtra!=null && !this.sTipoReporteExtra.equals("")) {
			PresuTipoProyectoConstantesFunciones.S_TIPOREPORTE_EXTRA=this.sTipoReporteExtra;
		} else {
			PresuTipoProyectoConstantesFunciones.S_TIPOREPORTE_EXTRA="";
		}
		
		jrbeanArrayDataSourcePresuTipoProyecto=new JRBeanArrayDataSource(PresuTipoProyectoJInternalFrame.TraerPresuTipoProyectoBeans(presutipoproyectosParaReportes,classes).toArray());
		
		jasperPrint = JasperFillManager.fillReport(jasperReport,parameters,jrbeanArrayDataSourcePresuTipoProyecto);
				
		
		String sPathDest=Constantes.SUNIDAD_ARCHIVOS+":/"+Constantes.SCONTEXTSERVER+"/"+PresuTipoProyectoConstantesFunciones.SCHEMA+"/reportes";
		
		File filePathDest = new File(sPathDest);
		
		if(!filePathDest.exists()) {
			filePathDest.mkdirs();				
		}
				
		String sDestFileName=sPathDest+"/"+PresuTipoProyectoConstantesFunciones.CLASSNAME;
				
		if(this.sTipoArchivoReporte=="VISUALIZAR") {
			JasperViewer jasperViewer = new JasperViewer(jasperPrint,false) ;
			jasperViewer.setVisible(true) ; 

		} else if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML") {	
			//JasperFillManager.fillReportToFile(reportFile.getAbsolutePath(),parameters, new JRBeanArrayDataSource(PresuTipoProyectoBean.TraerPresuTipoProyectoBeans(presutipoproyectosParaReportes).toArray()));
							
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
				this.generarExcelReportePresuTipoProyectos(sAccionBusqueda,sTipoArchivoReporte,presutipoproyectosParaReportes);
			
			} else if(this.sTipoReporte.equals("FORMULARIO")){
				this.generarExcelReporteVerticalPresuTipoProyectos(sAccionBusqueda,sTipoArchivoReporte,presutipoproyectosParaReportes,false);
			
			} else if(this.sTipoReporte.equals("DINAMICO")){
				
				if(this.sTipoReporteDinamico.equals("NORMAL")) {
					
					this.jButtonGenerarExcelReporteDinamicoPresuTipoProyectoActionPerformed(null);
					//this.generarExcelReportePresuTipoProyectos(sAccionBusqueda,sTipoArchivoReporte,presutipoproyectosParaReportes);
					
				
				} else if(this.sTipoReporteDinamico.equals("FORMULARIO")){
					this.generarExcelReporteVerticalPresuTipoProyectos(sAccionBusqueda,sTipoArchivoReporte,presutipoproyectosParaReportes,true);
				
				} else if(this.sTipoReporteDinamico.equals("RELACIONES")){
					this.generarExcelReporteRelacionesPresuTipoProyectos(sAccionBusqueda,sTipoArchivoReporte,presutipoproyectosParaReportes,true);
				}
				
			} else if(this.sTipoReporte.equals("RELACIONES")){
				this.generarExcelReporteRelacionesPresuTipoProyectos(sAccionBusqueda,sTipoArchivoReporte,presutipoproyectosParaReportes,false);
			}
		}
		
		if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML"||this.sTipoArchivoReporte=="WORD"||this.sTipoArchivoReporte=="EXCEL") {				
			JOptionPane.showMessageDialog(this,"REPORTE "+sDestFileName+" GENERADO SATISFACTORIAMENTE","REPORTES ",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReportePresuTipoProyectos(String sAccionBusqueda,String sTipoArchivoReporte,List<PresuTipoProyecto> presutipoproyectosParaReportes) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"presutipoproyecto";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("PresuTipoProyectos");
         
        int iRow = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderPresuTipoProyecto("NORMAL",row,workbook);
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux=null;
		
		int i=0;
		
      	for(PresuTipoProyecto presutipoproyecto : presutipoproyectosParaReportes) {            
			row = sheet.createRow(iRow++);
			iCell = 0;
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				cellStyleDataAux=cellStyleData;
			}
			
			PresuTipoProyectoConstantesFunciones.generarExcelReporteDataPresuTipoProyecto("NORMAL",row,workbook,presutipoproyecto,cellStyleDataAux);
		
			
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
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.presutipoproyectoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Proyecto",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteHeaderPresuTipoProyecto(String sTipo,Row row,Workbook workbook) {
		
		PresuTipoProyectoConstantesFunciones.generarExcelReporteHeaderPresuTipoProyecto(sTipo,row,workbook);
		
		/*
		Cell cell=null;
		int iCell=0;
		
		CellStyle cellStyle = workbook.createCellStyle();
		cellStyle.setFillBackgroundColor(IndexedColors.GREEN.getIndex());
		cellStyle.setFillPattern(CellStyle.ALIGN_FILL);
		*/
		
	}
	
	public void generarExcelReporteVerticalPresuTipoProyectos(String sAccionBusqueda,String sTipoArchivoReporte,List<PresuTipoProyecto> presutipoproyectosParaReportes,Boolean paraDinamico) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"presutipoproyecto_vertical";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("PresuTipoProyectos");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		CellStyle cellStyle = Funciones2.getStyleTitulo(workbook,"ZEBRA");;
		
		CellStyle cellStyleTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL_VERTICAL");
		
		
		for(PresuTipoProyecto presutipoproyecto : presutipoproyectosParaReportes) {
			row = sheet.createRow(iRow++);
			iRowLast=iRow - 1;
			
			cell = row.createCell(0);
			cell.setCellValue(PresuTipoProyectoConstantesFunciones.getPresuTipoProyectoDescripcion(presutipoproyecto));
			cell.setCellStyle(cellStyleTitulo);
			
			sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
	
			


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(PresuTipoProyectoConstantesFunciones.LABEL_IDEMPRESA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(PresuTipoProyectoConstantesFunciones.LABEL_IDEMPRESA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(presutipoproyecto.getempresa_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(PresuTipoProyectoConstantesFunciones.LABEL_CODIGO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(PresuTipoProyectoConstantesFunciones.LABEL_CODIGO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(presutipoproyecto.getcodigo());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(PresuTipoProyectoConstantesFunciones.LABEL_NOMBRE))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(PresuTipoProyectoConstantesFunciones.LABEL_NOMBRE);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(presutipoproyecto.getnombre());


			}						
        }
        
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.presutipoproyectoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Proyecto",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteRelacionesPresuTipoProyectos(String sAccionBusqueda,String sTipoArchivoReporte,List<PresuTipoProyecto> presutipoproyectosParaReportes,Boolean paraDinamico) throws Exception {
		
		ArrayList<Classe> classes=new ArrayList<Classe>();
		List<PresuTipoProyecto> presutipoproyectosRespaldo=null;
		
		classes=PresuTipoProyectoConstantesFunciones.getClassesRelationshipsOfPresuTipoProyecto(new ArrayList<Classe>(),DeepLoadType.NONE,false);
					
		this.datosDeep=new DatosDeep();
		
		this.datosDeep.setIsDeep(false);
		this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
		this.datosDeep.setClases(classes);
			
		this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
		this.datosCliente.setIsConDeep(true);	
		this.datosCliente.setIsConExportar(false);
		
						
		this.presutipoproyectoLogic.setDatosCliente(this.datosCliente);
		this.presutipoproyectoLogic.setDatosDeep(this.datosDeep);
		this.presutipoproyectoLogic.setIsConDeep(true);
		
		presutipoproyectosRespaldo=this.presutipoproyectoLogic.getPresuTipoProyectos();
		
		this.presutipoproyectoLogic.setPresuTipoProyectos(presutipoproyectosParaReportes);	
		this.presutipoproyectoLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
		
		presutipoproyectosParaReportes=this.presutipoproyectoLogic.getPresuTipoProyectos();
		this.presutipoproyectoLogic.setPresuTipoProyectos(presutipoproyectosRespaldo);
		
		
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"presutipoproyecto_relacion";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("PresuTipoProyectos");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderPresuTipoProyecto("NORMAL",row,workbook);
		
		int i=0;
		int i2=0;
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL");
		CellStyle cellStyleDataZebra = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux =null;
		CellStyle cellStyleDataAuxHijo =null;
		
		for(PresuTipoProyecto presutipoproyecto : presutipoproyectosParaReportes) {			
			if(i!=0) {
				row = sheet.createRow(iRow++);				
				this.generarExcelReporteHeaderPresuTipoProyecto("NORMAL",row,workbook);
			}
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				//cellStyleDataAux=cellStyleData;
			}
			
			row = sheet.createRow(iRow++);						
			PresuTipoProyectoConstantesFunciones.generarExcelReporteDataPresuTipoProyecto("NORMAL",row,workbook,presutipoproyecto,cellStyleDataAux);
		
			
			
			
			i++;
        }
        
		/*
		row = sheet.createRow(iRow++);
		iRowLast=iRow - 1;
			
		cell = row.createCell(0);
		cell.setCellValue(PresuTipoProyectoConstantesFunciones.getPresuTipoProyectoDescripcion(presutipoproyecto));
		cell.setCellStyle(cellStyleTitulo);
			
		sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
		*/
		
			
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.presutipoproyectoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Proyecto",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	
	public Boolean existeColumnaReporteDinamico(String sColumna) {
		Boolean existe=false;
		
		Reporte reporte=new Reporte();
		
		
		for(int index:this.jInternalFrameReporteDinamicoPresuTipoProyecto.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoPresuTipoProyecto.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
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
		
		
		for(int index:this.jInternalFrameReporteDinamicoPresuTipoProyecto.getjListRelacionesSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoPresuTipoProyecto.getjListRelacionesSelectReporte().getModel().getElementAt(index);
			
			if(sColumna.equals(reporte.getsCodigo())) {
				existe=true;
				break;
			}
		
		}
		
		
		return existe;
	}
	
	public void startProcessPresuTipoProyecto() throws Exception {		
		this.startProcessPresuTipoProyecto(true);
	}
	
	public void startProcessPresuTipoProyecto(Boolean conSplash) throws Exception {		
		//FuncionesSwing.enableDisablePanels(false,this.jTabbedPaneBusquedasPresuTipoProyecto ,this.jPanelParametrosReportesPresuTipoProyecto, this.jScrollPanelDatosPresuTipoProyecto,this.jPanelPaginacionPresuTipoProyecto, this.jScrollPanelDatosEdicionPresuTipoProyecto, this.jPanelAccionesPresuTipoProyecto,this.jPanelAccionesFormularioPresuTipoProyecto,this.jmenuBarPresuTipoProyecto,this.jmenuBarDetallePresuTipoProyecto,this.jTtoolBarPresuTipoProyecto,this.jTtoolBarDetallePresuTipoProyecto);		
		
		final JTabbedPane jTabbedPaneBusquedasPresuTipoProyecto=this.jTabbedPaneBusquedasPresuTipoProyecto; 
		
		final JPanel jPanelParametrosReportesPresuTipoProyecto=this.jPanelParametrosReportesPresuTipoProyecto;
		//final JScrollPane jScrollPanelDatosPresuTipoProyecto=this.jScrollPanelDatosPresuTipoProyecto;
		final JTable jTableDatosPresuTipoProyecto=this.jTableDatosPresuTipoProyecto;		
		final JPanel jPanelPaginacionPresuTipoProyecto=this.jPanelPaginacionPresuTipoProyecto;
		//final JScrollPane jScrollPanelDatosEdicionPresuTipoProyecto=this.jScrollPanelDatosEdicionPresuTipoProyecto;
		final JPanel jPanelAccionesPresuTipoProyecto=this.jPanelAccionesPresuTipoProyecto;
		
		JPanel jPanelCamposAuxiliarPresuTipoProyecto=new JPanelMe();
		JPanel jPanelAccionesFormularioAuxiliarPresuTipoProyecto=new JPanelMe();
		
		if(this.jInternalFrameDetalleFormPresuTipoProyecto!=null) {
			jPanelCamposAuxiliarPresuTipoProyecto=this.jInternalFrameDetalleFormPresuTipoProyecto.jPanelCamposPresuTipoProyecto;
			jPanelAccionesFormularioAuxiliarPresuTipoProyecto=this.jInternalFrameDetalleFormPresuTipoProyecto.jPanelAccionesFormularioPresuTipoProyecto;
		}
		
		final JPanel jPanelCamposPresuTipoProyecto=jPanelCamposAuxiliarPresuTipoProyecto;
		final JPanel jPanelAccionesFormularioPresuTipoProyecto=jPanelAccionesFormularioAuxiliarPresuTipoProyecto;
		
		
		final JMenuBar jmenuBarPresuTipoProyecto=this.jmenuBarPresuTipoProyecto;
		final JToolBar jTtoolBarPresuTipoProyecto=this.jTtoolBarPresuTipoProyecto;		
		
		
		JMenuBar jmenuBarDetalleAuxiliarPresuTipoProyecto=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarPresuTipoProyecto=new JToolBar();		
		
		if(this.jInternalFrameDetalleFormPresuTipoProyecto!=null) {
			jmenuBarDetalleAuxiliarPresuTipoProyecto=this.jInternalFrameDetalleFormPresuTipoProyecto.jmenuBarDetallePresuTipoProyecto;
			jTtoolBarDetalleAuxiliarPresuTipoProyecto=this.jInternalFrameDetalleFormPresuTipoProyecto.jTtoolBarDetallePresuTipoProyecto;
		}
		
		final JMenuBar jmenuBarDetallePresuTipoProyecto=jmenuBarDetalleAuxiliarPresuTipoProyecto;
		final JToolBar jTtoolBarDetallePresuTipoProyecto=jTtoolBarDetalleAuxiliarPresuTipoProyecto;		
		
		
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasPresuTipoProyecto;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesPresuTipoProyecto;
			processRunnable.jTableDatos=jTableDatosPresuTipoProyecto;
			processRunnable.jPanelCampos=jPanelCamposPresuTipoProyecto;
			processRunnable.jPanelPaginacion=jPanelPaginacionPresuTipoProyecto;
			processRunnable.jPanelAcciones=jPanelAccionesPresuTipoProyecto;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioPresuTipoProyecto;
			
			
			processRunnable.jmenuBar=jmenuBarPresuTipoProyecto;
			processRunnable.jmenuBarDetalle=jmenuBarDetallePresuTipoProyecto;
			processRunnable.jTtoolBar=jTtoolBarPresuTipoProyecto;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetallePresuTipoProyecto;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasPresuTipoProyecto ,jPanelParametrosReportesPresuTipoProyecto,jTableDatosPresuTipoProyecto, /*jScrollPanelDatosPresuTipoProyecto,*/jPanelCamposPresuTipoProyecto,jPanelPaginacionPresuTipoProyecto, /*jScrollPanelDatosEdicionPresuTipoProyecto,*/ jPanelAccionesPresuTipoProyecto,jPanelAccionesFormularioPresuTipoProyecto,jmenuBarPresuTipoProyecto,jmenuBarDetallePresuTipoProyecto,jTtoolBarPresuTipoProyecto,jTtoolBarDetallePresuTipoProyecto);
		
			startProcess();//this.
		}
						
		/*
		if(conSplash) {
			SwingUtilities.invokeLater(new Runnable() {
			      public void run() {
			    	  try {
							FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasPresuTipoProyecto ,jPanelParametrosReportesPresuTipoProyecto, jScrollPanelDatosPresuTipoProyecto,jPanelPaginacionPresuTipoProyecto, jScrollPanelDatosEdicionPresuTipoProyecto, jPanelAccionesPresuTipoProyecto,jPanelAccionesFormularioPresuTipoProyecto,jmenuBarPresuTipoProyecto,jmenuBarDetallePresuTipoProyecto,jTtoolBarPresuTipoProyecto,jTtoolBarDetallePresuTipoProyecto);
						
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
	
	public void finishProcessPresuTipoProyecto() {// throws Exception 
		this.finishProcessPresuTipoProyecto(true);
	}
	
	public void finishProcessPresuTipoProyecto(Boolean conSplash) {// throws Exception 
		//FuncionesSwing.enableDisablePanels(true,this.jTabbedPaneBusquedasPresuTipoProyecto ,this.jPanelParametrosReportesPresuTipoProyecto, this.jScrollPanelDatosPresuTipoProyecto,this.jPanelPaginacionPresuTipoProyecto, this.jScrollPanelDatosEdicionPresuTipoProyecto, this.jPanelAccionesPresuTipoProyecto,this.jPanelAccionesFormularioPresuTipoProyecto,this.jmenuBarPresuTipoProyecto,this.jmenuBarDetallePresuTipoProyecto,this.jTtoolBarPresuTipoProyecto,this.jTtoolBarDetallePresuTipoProyecto);		
		
		final JTabbedPane jTabbedPaneBusquedasPresuTipoProyecto=this.jTabbedPaneBusquedasPresuTipoProyecto; 
		
		final JPanel jPanelParametrosReportesPresuTipoProyecto=this.jPanelParametrosReportesPresuTipoProyecto;
		//final JScrollPane jScrollPanelDatosPresuTipoProyecto=this.jScrollPanelDatosPresuTipoProyecto;
		final JTable jTableDatosPresuTipoProyecto=this.jTableDatosPresuTipoProyecto;		
		final JPanel jPanelPaginacionPresuTipoProyecto=this.jPanelPaginacionPresuTipoProyecto;
		//final JScrollPane jScrollPanelDatosEdicionPresuTipoProyecto=this.jScrollPanelDatosEdicionPresuTipoProyecto;
		final JPanel jPanelAccionesPresuTipoProyecto=this.jPanelAccionesPresuTipoProyecto;
		
		JPanel jPanelCamposAuxiliarPresuTipoProyecto=new JPanel();
		JPanel jPanelAccionesFormularioAuxiliarPresuTipoProyecto=new JPanel();
		
		if(this.jInternalFrameDetalleFormPresuTipoProyecto!=null) {
			jPanelCamposAuxiliarPresuTipoProyecto=this.jInternalFrameDetalleFormPresuTipoProyecto.jPanelCamposPresuTipoProyecto;
			jPanelAccionesFormularioAuxiliarPresuTipoProyecto=this.jInternalFrameDetalleFormPresuTipoProyecto.jPanelAccionesFormularioPresuTipoProyecto;
		}
		
		final JPanel jPanelCamposPresuTipoProyecto=jPanelCamposAuxiliarPresuTipoProyecto;
		final JPanel jPanelAccionesFormularioPresuTipoProyecto=jPanelAccionesFormularioAuxiliarPresuTipoProyecto;
		
		
		final JMenuBar jmenuBarPresuTipoProyecto=this.jmenuBarPresuTipoProyecto;		
		final JToolBar jTtoolBarPresuTipoProyecto=this.jTtoolBarPresuTipoProyecto;
				
		JMenuBar jmenuBarDetalleAuxiliarPresuTipoProyecto=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarPresuTipoProyecto=new JToolBar();
		
		if(this.jInternalFrameDetalleFormPresuTipoProyecto!=null) {
			jmenuBarDetalleAuxiliarPresuTipoProyecto=this.jInternalFrameDetalleFormPresuTipoProyecto.jmenuBarDetallePresuTipoProyecto;
			jTtoolBarDetalleAuxiliarPresuTipoProyecto=this.jInternalFrameDetalleFormPresuTipoProyecto.jTtoolBarDetallePresuTipoProyecto;		
		}
		
		final JMenuBar jmenuBarDetallePresuTipoProyecto=jmenuBarDetalleAuxiliarPresuTipoProyecto;
		final JToolBar jTtoolBarDetallePresuTipoProyecto=jTtoolBarDetalleAuxiliarPresuTipoProyecto;
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasPresuTipoProyecto;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesPresuTipoProyecto;
			processRunnable.jTableDatos=jTableDatosPresuTipoProyecto;
			processRunnable.jPanelCampos=jPanelCamposPresuTipoProyecto;
			processRunnable.jPanelPaginacion=jPanelPaginacionPresuTipoProyecto;
			processRunnable.jPanelAcciones=jPanelAccionesPresuTipoProyecto;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioPresuTipoProyecto;
			
			
			processRunnable.jmenuBar=jmenuBarPresuTipoProyecto;
			processRunnable.jmenuBarDetalle=jmenuBarDetallePresuTipoProyecto;
			processRunnable.jTtoolBar=jTtoolBarPresuTipoProyecto;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetallePresuTipoProyecto;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			if(conSplash) {
				SwingUtilities.invokeLater(new RunnableProceso(true,this,jTabbedPaneBusquedasPresuTipoProyecto ,jPanelParametrosReportesPresuTipoProyecto, jTableDatosPresuTipoProyecto,/*jScrollPanelDatosPresuTipoProyecto,*/jPanelCamposPresuTipoProyecto,jPanelPaginacionPresuTipoProyecto, /*jScrollPanelDatosEdicionPresuTipoProyecto,*/ jPanelAccionesPresuTipoProyecto,jPanelAccionesFormularioPresuTipoProyecto,jmenuBarPresuTipoProyecto,jmenuBarDetallePresuTipoProyecto,jTtoolBarPresuTipoProyecto,jTtoolBarDetallePresuTipoProyecto));
			}
		}						
	}
	
	/*
	public void habilitarDeshabilitarControlesPresuTipoProyecto(Boolean esHabilitar,Boolean conDetalle) {
		this.habilitarDeshabilitarToolBarPresuTipoProyecto(esHabilitar,conDetalle);
		this.habilitarDeshabilitarMenuPresuTipoProyecto(esHabilitar,conDetalle);
	}
	
	public void habilitarDeshabilitarToolBarPresuTipoProyecto(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jTtoolBarPresuTipoProyecto,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jTtoolBarDetallePresuTipoProyecto,esHabilitar,1,1);
		}
	}
	
	public void habilitarDeshabilitarMenuPresuTipoProyecto(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jmenuBarPresuTipoProyecto,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jmenuBarDetallePresuTipoProyecto,esHabilitar,1,1);
		}
	}
	*/
	
	
	
	public void procesarBusqueda(String sAccionBusqueda) throws Exception {		
		String  finalQueryPaginacion=this.presutipoproyectoConstantesFunciones.getsFinalQueryPresuTipoProyecto();
		String  finalQueryPaginacionTodos=this.presutipoproyectoConstantesFunciones.getsFinalQueryPresuTipoProyecto();
		
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
		
		ArrayList<String> arrColumnasGlobalesNo=PresuTipoProyectoConstantesFunciones.getArrayColumnasGlobalesNoPresuTipoProyecto(this.arrDatoGeneral);
		ArrayList<String> arrColumnasGlobales=PresuTipoProyectoConstantesFunciones.getArrayColumnasGlobalesPresuTipoProyecto(this.arrDatoGeneral,arrColumnasGlobalesNo);
		
			
		String  finalQueryGlobal="";
		
		finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,!esBusqueda,esBusqueda,arrColumnasGlobales,PresuTipoProyectoConstantesFunciones.TABLENAME);
		
		String sOrderBy="";
		
		
		sOrderBy=Funciones2.getFinalQueryOrderBy(this.arrOrderBy);
		
		
		if(!sOrderBy.equals("")) {			
			finalQueryPaginacion=sOrderBy;
			finalQueryPaginacionTodos=sOrderBy;
		}
		
		
		//INICIALIZA ELIMINADOS
		this.presutipoproyectosEliminados= new ArrayList<PresuTipoProyecto>();
		
		if(!this.isEntroOnLoad) {
			this.onLoad();
		}/* else {
			this.isEntroOnLoad=false;
		}*/
		
		
		
				
		try	{		
			
			//this.startProcessPresuTipoProyecto();
		
				///*PresuTipoProyectoSessionBean*/this.presutipoproyectoSessionBean=new PresuTipoProyectoSessionBean();
			
			if(this.presutipoproyectoSessionBean==null) {
				this.presutipoproyectoSessionBean=new PresuTipoProyectoSessionBean();
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
					this.iNumeroPaginacion=PresuTipoProyectoConstantesFunciones.INUMEROPAGINACION;
				}
			}
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);
			
			this.cargarDatosCliente();
			
			ArrayList<Classe> classes=new ArrayList<Classe>();
			
			classes=PresuTipoProyectoConstantesFunciones.getClassesForeignKeysOfPresuTipoProyecto(new ArrayList<Classe>(),DeepLoadType.NONE);
			
		
			this.datosDeep=new DatosDeep();
			this.datosDeep.setIsDeep(false);
			this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
			this.datosDeep.setClases(classes);
			
			this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
			this.datosCliente.setIsConDeep(true);
			
			if(false) {//this.conExportar
				this.datosCliente.setIsConExportar(true);
				this.datosCliente.setDatosExportarParametros(Funciones2.getTipoExportar(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getcon_exportar_cabecera(),Funciones2.getTipoDelimiter(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getpath_exportar()+"/presutipoproyecto."+Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario));
			} else {
				this.datosCliente.setIsConExportar(false);
			}
			
			presutipoproyectosAux= new ArrayList<PresuTipoProyecto>();
			
				
			presutipoproyectoLogic.setDatosCliente(this.datosCliente);
			presutipoproyectoLogic.setDatosDeep(this.datosDeep);
			presutipoproyectoLogic.setIsConDeep(true);
			
			
			presutipoproyectoLogic.getPresuTipoProyectoDataAccess().setIsForForeingsKeysDataRelationships(true);
			
			if(sAccionBusqueda.equals("Todos") || sAccionBusqueda.equals("Query"))	{	
				if(sAccionBusqueda.equals("Todos")) {
					//FALTA:PARA BUSQUEDAS POR CAMPO EN FORMULARIO
					//this.sFinalQueryGeneral="";
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacionTodos );
					
					presutipoproyectoLogic.getTodosPresuTipoProyectos(finalQueryGlobal,pagination);
					
					//presutipoproyectoLogic.getTodosPresuTipoProyectosWithConnection(finalQueryGlobal,pagination);										
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
				
				if(presutipoproyectoLogic.getPresuTipoProyectos()==null|| presutipoproyectoLogic.getPresuTipoProyectos().size()==0)	{
					
				
				}
				
				if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(-1);
						this.pagination.setiMaxResults(-1);
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							presutipoproyectosAux= new ArrayList<PresuTipoProyecto>();
							presutipoproyectosAux.addAll(presutipoproyectoLogic.getPresuTipoProyectos());						
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							presutipoproyectosAux= new ArrayList<PresuTipoProyecto>();
							presutipoproyectosAux.addAll(presutipoproyectos);
						}
						//ARCHITECTURE
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							presutipoproyectoLogic.getTodosPresuTipoProyectos(finalQueryGlobal+"",this.pagination);												
							
							//presutipoproyectoLogic.getTodosPresuTipoProyectosWithConnection(finalQueryGlobal+"",this.pagination);												
						} else if(Constantes.ISUSAEJBREMOTE) {
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
					}
					
					this.generarReportePresuTipoProyectos("Todos",presutipoproyectoLogic.getPresuTipoProyectos() );
					
					if(false) {//isMostrarTodosResultadosReporte						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							presutipoproyectoLogic.setPresuTipoProyectos(new ArrayList<PresuTipoProyecto>());					
							presutipoproyectoLogic.getPresuTipoProyectos().addAll(presutipoproyectosAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							presutipoproyectos=new ArrayList<PresuTipoProyecto>();
							presutipoproyectos.addAll(presutipoproyectosAux);
						}
						//ARCHITECTURE
						
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);														
					}
				}
			}
			else if(sAccionBusqueda.equals("PorId")) {
				Long idPresuTipoProyecto=0L;
				
				if(this.idActual!=null && this.idActual!=0L) {
					idPresuTipoProyecto=this.idActual;
				
				} else if(this.idPresuTipoProyectoActual!=null && this.idPresuTipoProyectoActual!=0L) {
					idPresuTipoProyecto=idPresuTipoProyectoActual;
				}
				
					
				this.sDetalleReporte=PresuTipoProyectoConstantesFunciones.getDetalleIndicePorId(idPresuTipoProyecto);
				
				this.presutipoproyectos=new ArrayList<PresuTipoProyecto>();
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {					
					presutipoproyectoLogic.getEntity(idPresuTipoProyecto);
					
					//presutipoproyectoLogic.getEntityWithConnection(idPresuTipoProyecto);
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
								
				if(Constantes.ISUSAEJBLOGICLAYER) {
					presutipoproyectoLogic.setPresuTipoProyectos(new ArrayList<PresuTipoProyecto>());
					presutipoproyectoLogic.getPresuTipoProyectos().add(presutipoproyectoLogic.getPresuTipoProyecto());
				
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.presutipoproyectos=new ArrayList<PresuTipoProyecto>();
					this.presutipoproyectos.add(presutipoproyecto);
				}
				
				if(presutipoproyectoLogic.getPresuTipoProyecto()==null)	{
					
				
				}			
			}
			
		
			else if(sAccionBusqueda.equals("BusquedaPorCodigo")) {
				this.sDetalleReporte=PresuTipoProyectoConstantesFunciones.getDetalleIndiceBusquedaPorCodigo(codigoBusquedaPorCodigo);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					presutipoproyectoLogic.getPresuTipoProyectosBusquedaPorCodigo(finalQueryGlobal,pagination,codigoBusquedaPorCodigo);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=PresuTipoProyectoConstantesFunciones.getDetalleIndiceBusquedaPorCodigo(codigoBusquedaPorCodigo);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=PresuTipoProyectoConstantesFunciones.getDetalleIndiceBusquedaPorCodigo(codigoBusquedaPorCodigo);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=presutipoproyectoLogic.getPresuTipoProyectos()==null||presutipoproyectoLogic.getPresuTipoProyectos().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=presutipoproyectos==null|| presutipoproyectos.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						presutipoproyectosAux=new ArrayList<PresuTipoProyecto>();
						presutipoproyectosAux.addAll(presutipoproyectoLogic.getPresuTipoProyectos());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							presutipoproyectosAux=new ArrayList<PresuTipoProyecto>();
							presutipoproyectosAux.addAll(presutipoproyectos);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							presutipoproyectoLogic.getPresuTipoProyectosBusquedaPorCodigo(finalQueryGlobal,pagination,codigoBusquedaPorCodigo);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=PresuTipoProyectoConstantesFunciones.getDetalleIndiceBusquedaPorCodigo(codigoBusquedaPorCodigo);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=PresuTipoProyectoConstantesFunciones.getDetalleIndiceBusquedaPorCodigo(codigoBusquedaPorCodigo);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReportePresuTipoProyectos("BusquedaPorCodigo",presutipoproyectoLogic.getPresuTipoProyectos());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReportePresuTipoProyectos("BusquedaPorCodigo",presutipoproyectos);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						presutipoproyectoLogic.setPresuTipoProyectos(new ArrayList<PresuTipoProyecto>());
						presutipoproyectoLogic.getPresuTipoProyectos().addAll(presutipoproyectosAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							presutipoproyectos=new ArrayList<PresuTipoProyecto>();
							presutipoproyectos.addAll(presutipoproyectosAux);
						}
						//ARCHITECTURE
					}
				}

			}
			else if(sAccionBusqueda.equals("BusquedaPorNombre")) {
				this.sDetalleReporte=PresuTipoProyectoConstantesFunciones.getDetalleIndiceBusquedaPorNombre(nombreBusquedaPorNombre);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					presutipoproyectoLogic.getPresuTipoProyectosBusquedaPorNombre(finalQueryGlobal,pagination,nombreBusquedaPorNombre);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=PresuTipoProyectoConstantesFunciones.getDetalleIndiceBusquedaPorNombre(nombreBusquedaPorNombre);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=PresuTipoProyectoConstantesFunciones.getDetalleIndiceBusquedaPorNombre(nombreBusquedaPorNombre);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=presutipoproyectoLogic.getPresuTipoProyectos()==null||presutipoproyectoLogic.getPresuTipoProyectos().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=presutipoproyectos==null|| presutipoproyectos.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						presutipoproyectosAux=new ArrayList<PresuTipoProyecto>();
						presutipoproyectosAux.addAll(presutipoproyectoLogic.getPresuTipoProyectos());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							presutipoproyectosAux=new ArrayList<PresuTipoProyecto>();
							presutipoproyectosAux.addAll(presutipoproyectos);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							presutipoproyectoLogic.getPresuTipoProyectosBusquedaPorNombre(finalQueryGlobal,pagination,nombreBusquedaPorNombre);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=PresuTipoProyectoConstantesFunciones.getDetalleIndiceBusquedaPorNombre(nombreBusquedaPorNombre);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=PresuTipoProyectoConstantesFunciones.getDetalleIndiceBusquedaPorNombre(nombreBusquedaPorNombre);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReportePresuTipoProyectos("BusquedaPorNombre",presutipoproyectoLogic.getPresuTipoProyectos());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReportePresuTipoProyectos("BusquedaPorNombre",presutipoproyectos);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						presutipoproyectoLogic.setPresuTipoProyectos(new ArrayList<PresuTipoProyecto>());
						presutipoproyectoLogic.getPresuTipoProyectos().addAll(presutipoproyectosAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							presutipoproyectos=new ArrayList<PresuTipoProyecto>();
							presutipoproyectos.addAll(presutipoproyectosAux);
						}
						//ARCHITECTURE
					}
				}

			}
			else if(sAccionBusqueda.equals("FK_IdEmpresa")) {
				this.sDetalleReporte=PresuTipoProyectoConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					presutipoproyectoLogic.getPresuTipoProyectosFK_IdEmpresa(finalQueryGlobal,pagination,id_empresaFK_IdEmpresa);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=PresuTipoProyectoConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=PresuTipoProyectoConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=presutipoproyectoLogic.getPresuTipoProyectos()==null||presutipoproyectoLogic.getPresuTipoProyectos().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=presutipoproyectos==null|| presutipoproyectos.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						presutipoproyectosAux=new ArrayList<PresuTipoProyecto>();
						presutipoproyectosAux.addAll(presutipoproyectoLogic.getPresuTipoProyectos());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							presutipoproyectosAux=new ArrayList<PresuTipoProyecto>();
							presutipoproyectosAux.addAll(presutipoproyectos);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							presutipoproyectoLogic.getPresuTipoProyectosFK_IdEmpresa(finalQueryGlobal,pagination,id_empresaFK_IdEmpresa);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=PresuTipoProyectoConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=PresuTipoProyectoConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReportePresuTipoProyectos("FK_IdEmpresa",presutipoproyectoLogic.getPresuTipoProyectos());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReportePresuTipoProyectos("FK_IdEmpresa",presutipoproyectos);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						presutipoproyectoLogic.setPresuTipoProyectos(new ArrayList<PresuTipoProyecto>());
						presutipoproyectoLogic.getPresuTipoProyectos().addAll(presutipoproyectosAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							presutipoproyectos=new ArrayList<PresuTipoProyecto>();
							presutipoproyectos.addAll(presutipoproyectosAux);
						}
						//ARCHITECTURE
					}
				}

			} 
		
		
		
		this.redimensionarTablaDatos();
		//this.refrescarForeignKeysDescripcionesPresuTipoProyecto();
		
		
		if(this.conTotales) {
			this.crearFilaTotales();
		}		
		} catch (JRException e) {
			throw e;
		} catch(Exception e) {
			throw e;
      	} finally {
      		//this.finishProcessPresuTipoProyecto();
      	}
		
	}				
	
	public void redimensionarTablaDatos() throws Exception {
		int iSizeTabla=0;
				
		iSizeTabla=this.getSizeTablaDatos();
		
		//ARCHITECTURE
		/*
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=presutipoproyectoLogic.getPresuTipoProyectos().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=presutipoproyectos.size();
		}
		*/
		//ARCHITECTURE
											
		this.redimensionarTablaDatos(iSizeTabla);		
	}
	
	public Integer getSizeTablaDatos() throws Exception {
		Integer iSizeTabla=0;
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=presutipoproyectoLogic.getPresuTipoProyectos().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=presutipoproyectos.size();
		}
		//ARCHITECTURE
											
		return iSizeTabla;		
	}
	
			
	public Boolean permiteMantenimiento(PresuTipoProyecto presutipoproyecto) {
		Boolean permite=true;
		
		if(this.presutipoproyecto.getsType().equals(Constantes2.S_TOTALES)) {
			permite=false;
		}
		
		return permite;
	}
	
	public void traerValoresTablaTotales() throws Exception {
	}
	
	
	public void traerValoresTablaOrderBy() throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.arrOrderBy=PresuTipoProyectoConstantesFunciones.getOrderByListaPresuTipoProyecto();							
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.arrOrderBy=PresuTipoProyectoConstantesFunciones.getOrderByListaPresuTipoProyecto();
		}		
	}
	
	
	public Boolean existeFilaTotales() throws Exception {
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(PresuTipoProyecto presutipoproyecto:presutipoproyectoLogic.getPresuTipoProyectos()) {
				if(presutipoproyecto.getsType().equals(Constantes2.S_TOTALES)) {
					presutipoproyectoTotales=presutipoproyecto;
					existe=true;
					break;
				}
			}
								
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(PresuTipoProyecto presutipoproyecto:this.presutipoproyectos) {
				if(presutipoproyecto.getsType().equals(Constantes2.S_TOTALES)) {
					presutipoproyectoTotales=presutipoproyecto;
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
			this.presutipoproyectoAux=new PresuTipoProyecto();
			this.presutipoproyectoAux.setsType(Constantes2.S_TOTALES);
			this.presutipoproyectoAux.setIsNew(false);
			this.presutipoproyectoAux.setIsChanged(false);
			this.presutipoproyectoAux.setIsDeleted(false);
				
			if(Constantes.ISUSAEJBLOGICLAYER) {
				PresuTipoProyectoConstantesFunciones.TotalizarValoresFilaPresuTipoProyecto(this.presutipoproyectoLogic.getPresuTipoProyectos(),this.presutipoproyectoAux);
				
				this.presutipoproyectoLogic.getPresuTipoProyectos().add(this.presutipoproyectoAux);
				
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				PresuTipoProyectoConstantesFunciones.TotalizarValoresFilaPresuTipoProyecto(this.presutipoproyectos,this.presutipoproyectoAux);
				
				this.presutipoproyectos.add(this.presutipoproyectoAux);
			}
		}
	}
	
	public void quitarFilaTotales() throws Exception {
		presutipoproyectoTotales=new PresuTipoProyecto();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.presutipoproyectoLogic.getPresuTipoProyectos().remove(presutipoproyectoTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.presutipoproyectos.remove(presutipoproyectoTotales);
			}
		}
	}
	
	public void actualizarFilaTotales() throws Exception {
		presutipoproyectoTotales=new PresuTipoProyecto();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(PresuTipoProyecto presutipoproyecto:presutipoproyectoLogic.getPresuTipoProyectos()) {
				if(presutipoproyecto.getsType().equals(Constantes2.S_TOTALES)) {
					presutipoproyectoTotales=presutipoproyecto;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				PresuTipoProyectoConstantesFunciones.TotalizarValoresFilaPresuTipoProyecto(this.presutipoproyectoLogic.getPresuTipoProyectos(),presutipoproyectoTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(PresuTipoProyecto presutipoproyecto:this.presutipoproyectos) {
				if(presutipoproyecto.getsType().equals(Constantes2.S_TOTALES)) {
					presutipoproyectoTotales=presutipoproyecto;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				PresuTipoProyectoConstantesFunciones.TotalizarValoresFilaPresuTipoProyecto(this.presutipoproyectos,presutipoproyectoTotales);
			}
		}
	}		
	
	public void recargarInformacion()throws Exception {
		try {
			sAccionBusqueda="Todos";
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda(sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PresuTipoProyectoConstantesFunciones.CLASSNAME);
		}	
	}		
	
	
	public void getPresuTipoProyectosBusquedaPorCodigo()throws Exception {
		try {
			sAccionBusqueda="BusquedaPorCodigo";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getPresuTipoProyectosBusquedaPorNombre()throws Exception {
		try {
			sAccionBusqueda="BusquedaPorNombre";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getPresuTipoProyectosFK_IdEmpresa()throws Exception {
		try {
			sAccionBusqueda="FK_IdEmpresa";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	
	
	public void getPresuTipoProyectosBusquedaPorCodigo(String sFinalQuery,String codigo)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					presutipoproyectoLogic.getPresuTipoProyectosBusquedaPorCodigo(sFinalQuery,this.pagination,codigo);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getPresuTipoProyectosBusquedaPorNombre(String sFinalQuery,String nombre)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					presutipoproyectoLogic.getPresuTipoProyectosBusquedaPorNombre(sFinalQuery,this.pagination,nombre);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getPresuTipoProyectosFK_IdEmpresa(String sFinalQuery,Long id_empresa)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					presutipoproyectoLogic.getPresuTipoProyectosFK_IdEmpresa(sFinalQuery,this.pagination,id_empresa);
				
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
	
	public void inicializarPermisosPresuTipoProyecto() {
		this.isPermisoTodoPresuTipoProyecto=false;
		this.isPermisoNuevoPresuTipoProyecto=false;
		this.isPermisoActualizarPresuTipoProyecto=false;
		this.isPermisoActualizarOriginalPresuTipoProyecto=false;
		this.isPermisoEliminarPresuTipoProyecto=false;
		this.isPermisoGuardarCambiosPresuTipoProyecto=false;
		this.isPermisoConsultaPresuTipoProyecto=false;
		this.isPermisoBusquedaPresuTipoProyecto=false;
		this.isPermisoReportePresuTipoProyecto=false;		
		this.isPermisoOrdenPresuTipoProyecto=false;		
		this.isPermisoPaginacionMedioPresuTipoProyecto=false;		
		this.isPermisoPaginacionAltoPresuTipoProyecto=false;
		this.isPermisoPaginacionTodoPresuTipoProyecto=false;
		this.isPermisoCopiarPresuTipoProyecto=false;		
		this.isPermisoVerFormPresuTipoProyecto=false;		
		this.isPermisoDuplicarPresuTipoProyecto=false;		
		this.isPermisoOrdenPresuTipoProyecto=false;		
	}
	
	public void setPermisosUsuarioPresuTipoProyecto(Boolean isPermiso) {
		this.isPermisoTodoPresuTipoProyecto=isPermiso;
		this.isPermisoNuevoPresuTipoProyecto=isPermiso;
		this.isPermisoActualizarPresuTipoProyecto=isPermiso;
		this.isPermisoActualizarOriginalPresuTipoProyecto=isPermiso;
		this.isPermisoEliminarPresuTipoProyecto=isPermiso;
		this.isPermisoGuardarCambiosPresuTipoProyecto=isPermiso;
		this.isPermisoConsultaPresuTipoProyecto=isPermiso;
		this.isPermisoBusquedaPresuTipoProyecto=isPermiso;
		this.isPermisoReportePresuTipoProyecto=isPermiso;
		this.isPermisoOrdenPresuTipoProyecto=isPermiso;		
		this.isPermisoPaginacionMedioPresuTipoProyecto=isPermiso;		
		this.isPermisoPaginacionAltoPresuTipoProyecto=isPermiso;		
		this.isPermisoPaginacionTodoPresuTipoProyecto=isPermiso;		
		this.isPermisoCopiarPresuTipoProyecto=isPermiso;		
		this.isPermisoVerFormPresuTipoProyecto=isPermiso;		
		this.isPermisoDuplicarPresuTipoProyecto=isPermiso;
		this.isPermisoOrdenPresuTipoProyecto=isPermiso;
	}
	
	public void setPermisosMantenimientoUsuarioPresuTipoProyecto(Boolean isPermiso) {
		//this.isPermisoTodoPresuTipoProyecto=isPermiso;
		this.isPermisoNuevoPresuTipoProyecto=isPermiso;
		this.isPermisoActualizarPresuTipoProyecto=isPermiso;
		this.isPermisoActualizarOriginalPresuTipoProyecto=isPermiso;
		this.isPermisoEliminarPresuTipoProyecto=isPermiso;
		this.isPermisoGuardarCambiosPresuTipoProyecto=isPermiso;
		//this.isPermisoConsultaPresuTipoProyecto=isPermiso;
		//this.isPermisoBusquedaPresuTipoProyecto=isPermiso;
		//this.isPermisoReportePresuTipoProyecto=isPermiso;
		//this.isPermisoOrdenPresuTipoProyecto=isPermiso;		
		//this.isPermisoPaginacionMedioPresuTipoProyecto=isPermiso;		
		//this.isPermisoPaginacionAltoPresuTipoProyecto=isPermiso;		
		//this.isPermisoPaginacionTodoPresuTipoProyecto=isPermiso;		
		//this.isPermisoCopiarPresuTipoProyecto=isPermiso;		
		//this.isPermisoDuplicarPresuTipoProyecto=isPermiso;
		//this.isPermisoOrdenPresuTipoProyecto=isPermiso;
	}
	
	public void inicializarSetPermisosUsuarioPresuTipoProyectoClasesRelacionadas() throws Exception {
		ArrayList<String> arrPaginas=new ArrayList<String>();		
		ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
		
		
		if(PresuTipoProyectoJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public Boolean tienePermisosUsuarioEnPaginaWebPresuTipoProyecto(String sPagina) throws Exception {
		Boolean tienePermisos=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tienePermisos=sistemaLogicAdditional.tienePermisosEnPaginaWeb(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, sPagina);
		} else if(Constantes.ISUSAEJBREMOTE) {
		} else if(Constantes.ISUSAEJBHOME) {
		}
		
		return tienePermisos;
	}
	
	public void inicializarSetPermisosUsuarioPresuTipoProyectoClasesRelacionadas(Boolean conPermiso) throws Exception {
		
	}
	
	public Boolean verificarGetPermisosUsuarioPresuTipoProyectoClaseRelacionada(ArrayList<String> arrPaginasFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioClaseRelacionada(arrPaginasFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public Boolean verificarGetPermisosUsuarioOpcionPresuTipoProyectoClaseRelacionada(List<Opcion> opcionsFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioOpcionClaseRelacionada(opcionsFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public void actualizarTabsSetPermisosUsuarioPresuTipoProyectoClasesRelacionadas() throws Exception {
		
	}
	
	public void setPermisosUsuarioPresuTipoProyecto() throws Exception {
		
		PerfilOpcion perfilOpcionUsuario=new PerfilOpcion();		
		Long idOpcion=this.opcionActual.getId();
		
		if(PresuTipoProyectoJInternalFrame.CON_LLAMADA_SIMPLE) {
			perfilOpcionUsuario=this.sistemaReturnGeneral.getPerfilOpcion();
			
		} else {
			if(this.presutipoproyectoSessionBean.getEsGuardarRelacionado()) {
				idOpcion=0L;
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				perfilOpcionUsuario=sistemaLogicAdditional.traerPermisosPaginaWebPerfilOpcion(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, PresuTipoProyectoConstantesFunciones.SNOMBREOPCION,idOpcion);				
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
		}
		
		if(perfilOpcionUsuario!=null && perfilOpcionUsuario.getId()>0) {
			this.isPermisoNuevoPresuTipoProyecto=perfilOpcionUsuario.getingreso()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarPresuTipoProyecto=perfilOpcionUsuario.getmodificacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarOriginalPresuTipoProyecto=this.isPermisoActualizarPresuTipoProyecto;
			this.isPermisoEliminarPresuTipoProyecto=perfilOpcionUsuario.geteliminacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoGuardarCambiosPresuTipoProyecto=perfilOpcionUsuario.getguardar_cambios()||perfilOpcionUsuario.gettodo();
			this.isPermisoConsultaPresuTipoProyecto=perfilOpcionUsuario.getconsulta()||perfilOpcionUsuario.gettodo();
			this.isPermisoBusquedaPresuTipoProyecto=perfilOpcionUsuario.getbusqueda()||perfilOpcionUsuario.gettodo();
			this.isPermisoTodoPresuTipoProyecto=perfilOpcionUsuario.gettodo()||perfilOpcionUsuario.gettodo();
			this.isPermisoReportePresuTipoProyecto=perfilOpcionUsuario.getreporte()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenPresuTipoProyecto=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionMedioPresuTipoProyecto=perfilOpcionUsuario.getpaginacion_medio()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionAltoPresuTipoProyecto=perfilOpcionUsuario.getpaginacion_alto()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionTodoPresuTipoProyecto=perfilOpcionUsuario.getpaginacion_todo()||perfilOpcionUsuario.gettodo();
			this.isPermisoCopiarPresuTipoProyecto=perfilOpcionUsuario.getcopiar()||perfilOpcionUsuario.gettodo();
			this.isPermisoVerFormPresuTipoProyecto=true;//perfilOpcionUsuario.getver_form()||perfilOpcionUsuario.gettodo();
			this.isPermisoDuplicarPresuTipoProyecto=perfilOpcionUsuario.getduplicar()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenPresuTipoProyecto=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			
			if(this.presutipoproyectoSessionBean.getEsGuardarRelacionado()) {
				this.opcionActual.setId(perfilOpcionUsuario.getid_opcion());
				
				this.jTableDatosPresuTipoProyecto.setToolTipText(this.jTableDatosPresuTipoProyecto.getToolTipText()+"_"+perfilOpcionUsuario.getid_opcion());		
			}
		} else {
			this.setPermisosUsuarioPresuTipoProyecto(false);
		}
		
		//SI SE NECESITA PONER TODOS LOS PERMISOS POR DEFECTO
		//
		
	}
	
	public void setAccionesUsuarioPresuTipoProyecto(Boolean esParaAccionesFormulario) throws Exception {		
		Reporte reporte=null;
		
		if(!esParaAccionesFormulario) {
			this.accions=new ArrayList<Accion>();
			
			if(PresuTipoProyectoJInternalFrame.CON_LLAMADA_SIMPLE) {
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
			
			if(PresuTipoProyectoJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public void setRelacionesUsuarioPresuTipoProyecto() throws Exception {
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
	public void inicializarCombosForeignKeyPresuTipoProyectoListas()throws Exception {
		try	{						
			
				this.empresasForeignKey=new ArrayList();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void cargarCombosTodosForeignKeyPresuTipoProyectoListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			String sFinalQueryCombo="";
			
			Modulo  moduloActualAux=new Modulo();
			
			if(PresuTipoProyectoJInternalFrame.ISLOAD_FKLOTE) {
				this.cargarCombosLoteForeignKeyPresuTipoProyectoListas(false);
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
	
	public void cargarCombosLoteForeignKeyPresuTipoProyectoListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			Modulo  moduloActualAux=new Modulo();
			
			
			PresuTipoProyectoParameterReturnGeneral presutipoproyectoReturnGeneral=new PresuTipoProyectoParameterReturnGeneral();
						
			


				String finalQueryGlobalEmpresa="";

				if(((this.empresasForeignKey==null||this.empresasForeignKey.size()<=0) && this.presutipoproyectoConstantesFunciones.cargarid_empresaPresuTipoProyecto)
					 || (this.esRecargarFks && this.presutipoproyectoConstantesFunciones.cargarid_empresaPresuTipoProyecto)) {

					if(!this.presutipoproyectoSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=EmpresaConstantesFunciones.getArrayColumnasGlobalesEmpresa(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalEmpresa=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,EmpresaConstantesFunciones.TABLENAME);

						finalQueryGlobalEmpresa=Funciones.GetFinalQueryAppend(finalQueryGlobalEmpresa, "");
						finalQueryGlobalEmpresa+=EmpresaConstantesFunciones.SFINALQUERY;

						//this.cargarCombosEmpresasForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalEmpresa=" WHERE " + ConstantesSql.ID + "="+presutipoproyectoSessionBean.getlidEmpresaActual();
					}
				} else {
					finalQueryGlobalEmpresa="NONE";
				}
			
			//ARCHITECTURE			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				presutipoproyectoReturnGeneral=presutipoproyectoLogic.cargarCombosLoteForeignKeyPresuTipoProyecto(finalQueryGlobalEmpresa);//WithConnection
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}			
			//ARCHITECTURE
			
			

			if(!finalQueryGlobalEmpresa.equals("NONE")) {
				this.empresasForeignKey=presutipoproyectoReturnGeneral.getempresasForeignKey();
			}
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void addItemDefectoCombosTodosForeignKeyPresuTipoProyecto()throws Exception {
		try {
			
			this.addItemDefectoCombosForeignKeyEmpresa();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	



	public void addItemDefectoCombosForeignKeyEmpresa()throws Exception {
		try {
			if(this.presutipoproyectoSessionBean==null) {
				this.presutipoproyectoSessionBean=new PresuTipoProyectoSessionBean();
			}

			if(!this.presutipoproyectoSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {
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
	
	public void initActionsCombosTodosForeignKeyPresuTipoProyecto()throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void initActionsCombosTodosForeignKeyPresuTipoProyecto(String sFormularioTipoBusqueda)throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	


	
	


	
	public void setVariablesGlobalesCombosForeignKeyPresuTipoProyecto()throws Exception {	
		try {
			if(this.parametroGeneralUsuario!=null && this.parametroGeneralUsuario.getId()>0) {
			
				this.setActualEmpresaForeignKey(this.parametroGeneralUsuario.getid_empresa(),false,"Formulario");
			
			
			}
			
			//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
			this.setVariablesGlobalesAuxiliaresCombosForeignKeyPresuTipoProyecto();
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToFormularioForeignKeyPresuTipoProyecto(PresuTipoProyecto presutipoproyecto)throws Exception {	
		try {
						
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToListasForeignKeyPresuTipoProyecto(PresuTipoProyecto presutipoproyecto,String sTipoEvento)throws Exception {	
		try {
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	/*
	public void setVariablesCombosFromBeanForeignKeyPresuTipoProyecto()throws Exception {	
		try {
						
		} catch(Exception e) {
			throw e;
		}
	}
	*/
	
	public void setVariablesGlobalesAuxiliaresCombosForeignKeyPresuTipoProyecto()throws Exception {	
		try {
			
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesDefaultCombosForeignKeyPresuTipoProyecto()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesParametroCombosForeignKeyPresuTipoProyecto()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void cargarCombosParametroPresuTipoProyecto()throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			//this.cargarDatosCliente();
			
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
		
	public void cargarCombosFrameForeignKeyPresuTipoProyecto()throws Exception {
		try {
			

			this.cargarCombosFrameEmpresasForeignKey("Todos");

		} catch(Exception e) {
			throw e;
		}		
	}		
	
	public void cargarCombosFrameForeignKeyPresuTipoProyecto(String sFormularioTipoBusqueda)throws Exception {
		try {
			

			this.cargarCombosFrameEmpresasForeignKey(sFormularioTipoBusqueda);

		} catch(Exception e) {
			throw e;
		}		
	}	
	
	public void setItemDefectoCombosForeignKeyPresuTipoProyecto()throws Exception {
		try {
			



			if(this.jInternalFrameDetalleFormPresuTipoProyecto.jComboBoxid_empresaPresuTipoProyecto!=null && this.jInternalFrameDetalleFormPresuTipoProyecto.jComboBoxid_empresaPresuTipoProyecto.getItemCount()>0) {
				this.jInternalFrameDetalleFormPresuTipoProyecto.jComboBoxid_empresaPresuTipoProyecto.setSelectedIndex(0);
			}
		} catch(Exception e) {
			throw e;
		}		
	}		
	
	


	
	

	public PresuTipoProyectoBeanSwingJInternalFrame() throws Exception {
		super(false,PaginaTipo.PRINCIPAL);
	}
	
	public PresuTipoProyectoBeanSwingJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
	}
	
	public PresuTipoProyectoBeanSwingJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
		
		this.presutipoproyectoSessionBean=new PresuTipoProyectoSessionBean(); 
		this.presutipoproyectoConstantesFunciones=new PresuTipoProyectoConstantesFunciones(); 
		this.presutipoproyectoBean=new PresuTipoProyecto();//(this.presutipoproyectoConstantesFunciones); 		
		this.presutipoproyectoReturnGeneral=new PresuTipoProyectoParameterReturnGeneral(); 
		
		this.presutipoproyectoSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.presutipoproyectoSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
				
	}
	
	public PresuTipoProyectoBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,cargarTodosDatos);
	}
		
	public PresuTipoProyectoBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,false,false,cargarRelaciones,cargarTodosDatos);
	}	
	
	public PresuTipoProyectoBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos) throws Exception //Boolean esParaBusquedaForeignKey
    {
		super(jdesktopPane,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		try {
			
			this.permiteRecargarForm=false;
			
			this.startProcessPresuTipoProyecto(true);
			
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
			
			this.presutipoproyectoConstantesFunciones=new PresuTipoProyectoConstantesFunciones(); 
			this.presutipoproyectoBean=new PresuTipoProyecto();//this.presutipoproyectoConstantesFunciones); 			
			this.presutipoproyectoReturnGeneral=new PresuTipoProyectoParameterReturnGeneral(); 
		
			PresuTipoProyectoBeanSwingJInternalFrameAdditional.CargaInicialInicio(this, "NORMAL", null);
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Tipo Proyecto Mantenimiento",paginaTipo));			
			
			this.conTotales=false;
			
			
			
			this.presutipoproyecto=new PresuTipoProyecto();
			this.presutipoproyectos = new ArrayList<PresuTipoProyecto>();
			this.presutipoproyectosAux = new ArrayList<PresuTipoProyecto>();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.presutipoproyectoLogic=new PresuTipoProyectoLogic();
				this.presutipoproyectoLogic.getNewConnexionToDeep("");
			}
			
			//this.presutipoproyectoSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
			//this.presutipoproyectoSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
			
			this.jDesktopPane=jdesktopPane;
			
			if(this.jDesktopPane.getClass().equals(JDesktopPaneMe.class)) {
				this.constantes2=((JDesktopPaneMe)this.jDesktopPane).constantes2;
			}
			
			if(!Constantes.CON_VARIAS_VENTANAS) {
    			MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameDetalleFormPresuTipoProyecto);
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameReporteDinamicoPresuTipoProyecto!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoPresuTipoProyecto);	
					}
					
					if(this.jInternalFrameImportacionPresuTipoProyecto!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionPresuTipoProyecto);							
					}
					
				}
				
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameOrderByPresuTipoProyecto!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameOrderByPresuTipoProyecto);					
					}
					
				}
			}
			
			//DETALLE DATOS
			if(this.jInternalFrameDetalleFormPresuTipoProyecto!=null) { //this.conCargarFormDetalle) {
				this.jDesktopPane.add(this.jInternalFrameDetalleFormPresuTipoProyecto);
				this.jInternalFrameDetalleFormPresuTipoProyecto.setVisible(false);
				this.jInternalFrameDetalleFormPresuTipoProyecto.setSelected(false);						
			}
			
			if(!this.conCargarMinimo) {
				
				//REPORTE DINAMICO
				if(this.jInternalFrameReporteDinamicoPresuTipoProyecto!=null) {
					this.jDesktopPane.add(this.jInternalFrameReporteDinamicoPresuTipoProyecto);
					this.jInternalFrameReporteDinamicoPresuTipoProyecto.setVisible(false);
					this.jInternalFrameReporteDinamicoPresuTipoProyecto.setSelected(false);
				}
				
				//IMPORTACION
				if(this.jInternalFrameImportacionPresuTipoProyecto!=null) {
					this.jDesktopPane.add(this.jInternalFrameImportacionPresuTipoProyecto);
					this.jInternalFrameImportacionPresuTipoProyecto.setVisible(false);
					this.jInternalFrameImportacionPresuTipoProyecto.setSelected(false);
				}
				
				
			}
			
			
			if(!this.conCargarMinimo) {
				
				if(this.jInternalFrameOrderByPresuTipoProyecto!=null) {
					this.jDesktopPane.add(this.jInternalFrameOrderByPresuTipoProyecto);
					this.jInternalFrameOrderByPresuTipoProyecto.setVisible(false);
					this.jInternalFrameOrderByPresuTipoProyecto.setSelected(false);				
				}
				
			}
			
			
			//this.esParaBusquedaForeignKey=false;
			this.esParaBusquedaForeignKey=esParaBusquedaForeignKey;
			
			this.invalidValues=new InvalidValue[0];
			
			
			
			this.idPresuTipoProyectoActual=0L;
			this.rowIndexActual=0;
			
			
			this.iNumeroPaginacionPagina=0;
			this.iNumeroPaginacion=PresuTipoProyectoConstantesFunciones.INUMEROPAGINACION;
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
			
			this.presutipoproyectoReturnGeneral=new PresuTipoProyectoParameterReturnGeneral();
			
			this.presutipoproyectoParameterGeneral=new PresuTipoProyectoParameterReturnGeneral();
			
			
			
			this.sistemaLogicAdditional=new SistemaLogicAdditional();
			
			this.sistemaLogicAdditional.setConnexion(this.presutipoproyectoLogic.getConnexion());			
			
			
			
			
			
			
			
			//VERIFICAR GLOBAL
			this.cargarDatosCliente();			
			
			
			if(!this.presutipoproyectoSessionBean.getEsGuardarRelacionado()) {
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
			
			if(PresuTipoProyectoJInternalFrame.CON_LLAMADA_SIMPLE) {
				if(this.presutipoproyectoSessionBean.getEsGuardarRelacionado()) {
					this.opcionActual.setId(0L);
					
					//idOpcion=0L;					
				}
				
				ArrayList<String> arrPaginas=new ArrayList<String>();		
				ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
				
		
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					//this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActualWithConnection(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,PresuTipoProyectoConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.presutipoproyectoSessionBean.getEsGuardarRelacionado(),this.presutipoproyectoSessionBean.getConGuardarRelaciones(),arrPaginas);
					
					this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActual(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,PresuTipoProyectoConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.presutipoproyectoSessionBean.getEsGuardarRelacionado(),this.presutipoproyectoSessionBean.getConGuardarRelaciones(),arrPaginas);
					
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
			
			this.isVisibilidadCeldaNuevoPresuTipoProyecto=false;
			this.isVisibilidadCeldaDuplicarPresuTipoProyecto=true;
			this.isVisibilidadCeldaCopiarPresuTipoProyecto=true;
			this.isVisibilidadCeldaVerFormPresuTipoProyecto=true;
			this.isVisibilidadCeldaOrdenPresuTipoProyecto=true;
			this.isVisibilidadCeldaNuevoRelacionesPresuTipoProyecto=false;
			this.isVisibilidadCeldaModificarPresuTipoProyecto=false;
			this.isVisibilidadCeldaActualizarPresuTipoProyecto=false;
			this.isVisibilidadCeldaEliminarPresuTipoProyecto=false;
			this.isVisibilidadCeldaCancelarPresuTipoProyecto=false;
			this.isVisibilidadCeldaGuardarPresuTipoProyecto=false;
			this.isVisibilidadCeldaGuardarCambiosPresuTipoProyecto=false;
			
			
			this.isVisibilidadBusquedaPorCodigo=true;
			this.isVisibilidadBusquedaPorNombre=true;
			this.isVisibilidadFK_IdEmpresa=true;
			
			//ELEMENTOS TABLAS PARAMETOS
			
			
			
			//ELEMENTOS TABLAS PARAMETOS_FIN
			
			//this.actualizarEstadoCeldasBotonesPresuTipoProyecto("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
						
			
			
			this.inicializarPermisosPresuTipoProyecto();
			
			//INICIALIZAR FALSE, TALVEZ COMENTAR
			this.setPermisosUsuarioPresuTipoProyecto(false);
			
			this.setPermisosUsuarioPresuTipoProyecto();
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.presutipoproyectoSessionBean.getEsGuardarRelacionado() 
				|| (this.presutipoproyectoSessionBean.getEsGuardarRelacionado() && this.presutipoproyectoSessionBean.getConGuardarRelaciones())) {
				
				this.inicializarSetPermisosUsuarioPresuTipoProyectoClasesRelacionadas();
			}
			
			if(this.presutipoproyectoSessionBean.getConGuardarRelaciones()) {
				this.actualizarTabsSetPermisosUsuarioPresuTipoProyectoClasesRelacionadas();
			}
			
			
			
			//SOLO SE EJECUTA LA PRIMERA VEZ, BINDINGS SI FUNCIONA
			if(!PresuTipoProyectoJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingBotonesPermisosPresuTipoProyecto();
			} else {
				this.inicializarActualizarBindingBotonesPermisosManualPresuTipoProyecto();
			}
			
			if(!this.isPermisoBusquedaPresuTipoProyecto) {
				//BYDAN_BUSQUEDAS
				
				this.jTabbedPaneBusquedasPresuTipoProyecto.setVisible(false);				
				
			}
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.presutipoproyectoSessionBean.getEsGuardarRelacionado()) {				
				this.tiposArchivosReportes=Funciones.getListTiposArchivosReportes();
				this.tiposArchivosReportesDinamico=Funciones.getListTiposArchivosReportes();
				this.tiposReportes=Funciones.getListTiposReportes(false);
				this.tiposReportesDinamico=Funciones.getListTiposReportesDinamico(false);
				
				
				
				this.tiposGraficosReportes=Funciones2.getListTiposGraficosReportes();
				this.tiposPaginacion=Funciones2.getListTiposPaginacion(this.isPermisoPaginacionMedioPresuTipoProyecto,this.isPermisoPaginacionMedioPresuTipoProyecto,this.isPermisoPaginacionTodoPresuTipoProyecto);
				this.tiposSeleccionar=Funciones2.getListTiposSeleccionar();
				this.tiposSeleccionar.addAll(PresuTipoProyectoConstantesFunciones.getTiposSeleccionarPresuTipoProyecto());
				
				this.tiposColumnasSelect=PresuTipoProyectoConstantesFunciones.getTiposSeleccionarPresuTipoProyecto(true);
				
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
			//if(!this.presutipoproyectoSessionBean.getEsGuardarRelacionado()) {
				//SE ENCUENTRA MAS ADELANTE CON ACCIONES POR USUARIO
				//ACCIONES GENERALES Y POR USUARIO
				this.tiposRelaciones=Funciones2.getListTiposRelaciones();
				this.setRelacionesUsuarioPresuTipoProyecto();
				
				this.tiposAcciones=Funciones2.getListTiposAcciones(false,false,true);
				this.setAccionesUsuarioPresuTipoProyecto(false);	
				
				this.tiposAccionesFormulario=Funciones2.getListTiposAccionesFormulario(false,false,true);							
				this.setAccionesUsuarioPresuTipoProyecto(true);	
				
				this.inicializarActualizarBindingtiposArchivosReportesAccionesPresuTipoProyecto() ;
			
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
				presutipoproyectoImplementable= (PresuTipoProyectoImplementable) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+PresuTipoProyectoConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBREMOTE);
			} else if(Constantes.ISUSAEJBHOME) {
				presutipoproyectoImplementableHome= (PresuTipoProyectoImplementableHome) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+PresuTipoProyectoConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBLOCAL);
			}			
			*/
			
			
			this.presutipoproyectos= new ArrayList<PresuTipoProyecto>();
			this.presutipoproyectosEliminados= new ArrayList<PresuTipoProyecto>();
						
			this.isEsNuevoPresuTipoProyecto=false;
			this.esParaAccionDesdeFormularioPresuTipoProyecto=false;
			this.isEsMantenimientoRelacionesRelacionadoUnico=false;
			this.isEsMantenimientoRelaciones=false;
			this.isEsMantenimientoRelacionado=false;
			this.isContieneImagenes=false;
			
			
			
			
			
			//INICIALIZAR LISTAS FK
			
			this.empresasForeignKey=new ArrayList<Empresa>() ;
			
			
			
			
			if(blncargarCombostrForeignKey) {
				this.cargarCombosForeignKeyPresuTipoProyecto(this.isCargarCombosDependencia);
			}
			
			this.cargarCombosParametroPresuTipoProyecto();
			
			
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.presutipoproyectoSessionBean.getEsGuardarRelacionado()) {
				this.onLoad();
			}
						
			PresuTipoProyectoBeanSwingJInternalFrameAdditional.RecargarVentanaSegunOpcion(this,opcionActual);
			
			/*
			if(blnCargarInformacionInicial) {
				this.recargarInformacion();
			}
			*/
			//this.iNumeroPaginacionPagina=0;
			//this.iNumeroPaginacion=PresuTipoProyectoConstantesFunciones.INUMEROPAGINACION;
			
			this.actualizarEstadoCeldasBotonesPresuTipoProyecto("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			//SOLO LA PRIMERA VEZ HACE LOS BINDINGS, SOLO AHI FUNCIONA
			this.inicializarActualizarBindingPresuTipoProyecto(true); 
			
			//SE REDIMENSIONA SINO NO SE ACTUALIZA
			this.redimensionarTablaDatos();
			
			
			this.initActions();
			
			;
						
			if(this.jInternalFrameDetalleFormPresuTipoProyecto!=null) {//if(this.conCargarFormDetalle) {
				this.cargarMenuRelaciones();
			}
			
			//OBLIGA CARGAR DETALLE, MEJOR DESHABILITAR, FALTA TALVEZ PONER EN SELECCIONAR
			//MAYBE
			//this.updateControlesFormularioPresuTipoProyecto();
			
			if(!this.conCargarMinimo) {
				this.updateBusquedasFormularioPresuTipoProyecto();
			}
			
			PresuTipoProyectoBeanSwingJInternalFrameAdditional.CargaInicial(this, "NORMAL", null);
			
			
			//SE REALIZA ESTO PARA QUE SE PUEDA RECORRER TAB SIN IMPORTAR ORDEN
			Boolean existeTabBusqueda=false;
			
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				
				for(int i=0; i<this.jTabbedPaneBusquedasPresuTipoProyecto.getTabCount(); i++) {
					this.jTabbedPaneBusquedasPresuTipoProyecto.setSelectedIndex(i);
						
					if(!existeTabBusqueda) {
						existeTabBusqueda=true;
					}
				}
					
				if(existeTabBusqueda) {
					this.jTabbedPaneBusquedasPresuTipoProyecto.setSelectedIndex(0);
				}	
				
				
			}
			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.presutipoproyectoLogic.commitNewConnexionToDeep();
			}
			
			
			if(Constantes2.ISDEVELOPING2) {
				end_time = System.currentTimeMillis();			
				String sTipo="Load Ventana";
				Funciones2.getMensajeTiempoEjecucion(start_time, end_time, sTipo,false);
			}  
			
			this.finishProcessPresuTipoProyecto(true);
			
			this.dEnd=(double)System.currentTimeMillis();
			
			this.dDif=this.dEnd - this.dStart;
			
			if(Constantes.ISDEVELOPING) {
				System.out.println("Tiempo(ms) Carga PresuTipoProyecto: " + this.dDif); 
			}
			
			this.permiteRecargarForm=true;
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.presutipoproyectoLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,PresuTipoProyectoConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.presutipoproyectoLogic.closeNewConnexionToDeep();
			}
		}	 
    }
	
	public void cargarTiposRelacionesSelectPresuTipoProyecto() {
		Reporte reporte=new Reporte();
		
	
	}
	
	
	
	public void jTabbedPaneChangeListenerGeneral(String sTipo,ChangeEvent evt) { 	  
		Boolean procesaCargarParteTab=false;
			
		try {
			int iIndex=0;		    			
			String sTitle="";
			
			//TABBED PANE RELACIONES
			if(sTipo.equals("RelacionesPresuTipoProyecto")) {
				iIndex=this.jInternalFrameDetalleFormPresuTipoProyecto.jTabbedPaneRelacionesPresuTipoProyecto.getSelectedIndex();		    
			
				sTitle=this.jInternalFrameDetalleFormPresuTipoProyecto.jTabbedPaneRelacionesPresuTipoProyecto.getTitleAt(iIndex);
				
				Integer intSelectedRow = 0;	
			
				intSelectedRow = this.jTableDatosPresuTipoProyecto.getSelectedRow();	
				
				
				
			}
			
			//TABBED PANE RELACIONES FIN(EXTRA TAB)
			;
			
  		} catch(Exception e) {
  			e.printStackTrace();
  		} finally {
			if(procesaCargarParteTab) {				
				this.finishProcessPresuTipoProyecto();	
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
	
	public void cargarCombosForeignKeyPresuTipoProyecto(Boolean cargarCombosDependencia) throws Exception {   
		this.cargarCombosForeignKeyPresuTipoProyecto(cargarCombosDependencia,true,true);
	}
	
	//CARGAR COMBOS EN LOTE
	public void cargarCombosForeignKeyPresuTipoProyecto(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales) throws Exception {   
		this.cargarCombosTodosForeignKeyPresuTipoProyectoListas(cargarCombosDependencia);
				
		this.addItemDefectoCombosTodosForeignKeyPresuTipoProyecto();
		
		this.cargarCombosFrameForeignKeyPresuTipoProyecto();						
		
		if(conInitActions) {
			this.initActionsCombosTodosForeignKeyPresuTipoProyecto();
		}
		
		if(conSetVariablesGlobales) {
			this.setVariablesGlobalesCombosForeignKeyPresuTipoProyecto();
		}
	}
	
	
	
	public void jButtonNuevoPresuTipoProyectoActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.FORM_RECARGAR;
			String sTipo="NUEVO_NORMAL";
			
			this.estaModoNuevo=true;
			
			if(this.presutipoproyectoSessionBean.getConGuardarRelaciones()) {
				this.dStart=(double)System.currentTimeMillis();
			}
				
			//if(this.esUsoDesdeHijo) {
			//	eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
			//}
											
			if(this.jInternalFrameDetalleFormPresuTipoProyecto==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}			
				
			PresuTipoProyectoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.presutipoproyecto,new Object(),this.presutipoproyectoParameterGeneral,this.presutipoproyectoReturnGeneral);
			
			
			if(jTableDatosPresuTipoProyecto.getRowCount()>=1) {
				jTableDatosPresuTipoProyecto.removeRowSelectionInterval(0, jTableDatosPresuTipoProyecto.getRowCount()-1);						
			}
			
			this.isEsNuevoPresuTipoProyecto=true;
			
			//ESTABLECE SI ES RELACIONADO O NO 
			this.habilitarDeshabilitarTipoMantenimientoPresuTipoProyecto(esRelaciones);
			
			this.nuevoPreparar(false); 
			this.habilitarDeshabilitarControlesPresuTipoProyecto(true);			
			//this.presutipoproyecto=new PresuTipoProyecto();
			//this.presutipoproyecto.setIsChanged(true);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesPresuTipoProyecto(false) ;						
			 
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualPresuTipoProyecto() ;
			
			if(PresuTipoProyectoJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetallePresuTipoProyecto(esRelaciones);
			}
					
			//Se Duplica, sin sentido
			//this.actualizarInformacion("EVENTO_NUEVO",false,this.presutipoproyecto);	
			this.actualizarInformacion("INFO_PADRE",false,this.presutipoproyecto);				
			
			PresuTipoProyectoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.presutipoproyecto,new Object(),this.presutipoproyectoParameterGeneral,this.presutipoproyectoReturnGeneral);
			
			if(this.presutipoproyectoSessionBean.getConGuardarRelaciones()) {
				this.dEnd=(double)System.currentTimeMillis();					
				this.dDif=this.dEnd - this.dStart;
					
				if(Constantes.ISDEVELOPING) {
					System.out.println("Tiempo(ms) Nuevo Preparar PresuTipoProyecto: " + this.dDif); 
				}
			}
			
			//false para que pueda generar eventos
			this.estaModoNuevo=false;
							
			//Con this.estaModoNuevo=false;, se permite actualizar y usar eventos control al mismo tiempo (FuncionTipo.LAST)			
			PresuTipoProyectoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.LAST,ControlTipo.FORM,EventoTipo.CLIC,EventoSubTipo.NEW,sTipo,this.presutipoproyecto,new Object(),this.presutipoproyectoParameterGeneral,this.presutipoproyectoReturnGeneral);
			
		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,PresuTipoProyectoConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;			
		}
	}
	
	public void jButtonDuplicarPresuTipoProyectoActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			Boolean soloDuplicarUno=false;
			Boolean conSeleccionarFilaTabla=false;
			
			this.estaModoNuevo=true;
			this.estaModoDuplicar=true;
			
			ArrayList<PresuTipoProyecto> presutipoproyectosSeleccionados=new ArrayList<PresuTipoProyecto>();
			int intSelectedRow =-1;
			Integer iNumRowsSeleccionados=0;
			int[] arrNumRowsSeleccionados=null;
			
			//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
			if(conSeleccionarFilaTabla) {
				arrNumRowsSeleccionados=this.jTableDatosPresuTipoProyecto.getSelectedRows();
				iNumRowsSeleccionados=this.jTableDatosPresuTipoProyecto.getSelectedRows().length;			
			}
			
			presutipoproyectosSeleccionados=this.getPresuTipoProyectosSeleccionados(false);
				
			if((soloDuplicarUno && iNumRowsSeleccionados.equals(1)) || !soloDuplicarUno) {
				//LO HACE NUEVOPREPARAR
				//this.iIdNuevoPresuTipoProyecto--;			
				//PresuTipoProyecto presutipoproyectoAux= new PresuTipoProyecto();			
				//presutipoproyectoAux.setId(this.iIdNuevoPresuTipoProyecto);																
				
				//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
				//PresuTipoProyecto presutipoproyectoOrigen=new PresuTipoProyecto();
				//for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {				
				
				for(PresuTipoProyecto presutipoproyectoOrigen : presutipoproyectosSeleccionados) {
					if(conSeleccionarFilaTabla) {
						if(!soloDuplicarUno) {
							//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
							//intSelectedRow =iNumRowSeleccionado;
						} else {
							intSelectedRow = this.jTableDatosPresuTipoProyecto.getSelectedRow();
						}
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							presutipoproyectoOrigen =(PresuTipoProyecto) this.presutipoproyectoLogic.getPresuTipoProyectos().toArray()[this.jTableDatosPresuTipoProyecto.convertRowIndexToModel(intSelectedRow)];
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							presutipoproyectoOrigen =(PresuTipoProyecto) this.presutipoproyectos.toArray()[this.jTableDatosPresuTipoProyecto.convertRowIndexToModel(intSelectedRow)];
						}
					}
					
					this.aumentarTamanioFilaNuevaTablaPresuTipoProyecto();
					
					if(this.conTotales) {
						this.quitarFilaTotales();
					}
					
					this.nuevoPreparar(true);
					
					this.presutipoproyecto.setsType("DUPLICADO");
					
					this.setCopiarVariablesObjetosPresuTipoProyecto(presutipoproyectoOrigen,this.presutipoproyecto,true,true);
					
					this.setVariablesFormularioToObjetoActualForeignKeysPresuTipoProyecto(this.presutipoproyecto);
					
					//LO HACE NUEVOPREPARAR
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.presutipoproyectoLogic.getPresuTipoProyectos().add(this.presutipoproyectoAux);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.presutipoproyectos.add(this.presutipoproyectoAux);				
					}
					*/
				}
				
				this.inicializarActualizarBindingTablaPresuTipoProyecto(false);
				
				this.jTableDatosPresuTipoProyecto.setRowSelectionInterval(this.getIndiceNuevoPresuTipoProyecto(), this.getIndiceNuevoPresuTipoProyecto());
				
				int iLastRow =  this.jTableDatosPresuTipoProyecto.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosPresuTipoProyecto.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosPresuTipoProyecto.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaPresuTipoProyecto(false);
				}
			} else {
				throw new Exception("DEBE ESTAR SELECCIONADO 1 REGISTRO");
			}
			
		} catch(Exception e) {			
			FuncionesSwing.manageException(this, e,logger,PresuTipoProyectoConstantesFunciones.CLASSNAME);
		
		} finally {
			this.estaModoNuevo=false;
			this.estaModoDuplicar=false;
		}
	}
	
	public void jButtonCopiarPresuTipoProyectoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			Boolean conSeleccionarFilaTabla=false;
			Integer iNumRowsSeleccionados=0;
			int[] intSelectedRows =null;
			int intSelectedRow =0;
			
			this.estaModoCopiar=true;
			
			ArrayList<PresuTipoProyecto> presutipoproyectosSeleccionados=new ArrayList<PresuTipoProyecto>();									
		
			PresuTipoProyecto presutipoproyectoOrigen=new PresuTipoProyecto();
			PresuTipoProyecto presutipoproyectoDestino=new PresuTipoProyecto();
				
			presutipoproyectosSeleccionados=this.getPresuTipoProyectosSeleccionados(false);
			
			if(conSeleccionarFilaTabla) {
				iNumRowsSeleccionados=this.jTableDatosPresuTipoProyecto.getSelectedRows().length;	
			}
			
			if(iNumRowsSeleccionados.equals(2) || presutipoproyectosSeleccionados.size()==2) {
				if(conSeleccionarFilaTabla) {
					intSelectedRows =this.jTableDatosPresuTipoProyecto.getSelectedRows();
					intSelectedRow = intSelectedRows[0];	
									
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						presutipoproyectoOrigen =(PresuTipoProyecto) this.presutipoproyectoLogic.getPresuTipoProyectos().toArray()[this.jTableDatosPresuTipoProyecto.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						presutipoproyectoOrigen =(PresuTipoProyecto) this.presutipoproyectos.toArray()[this.jTableDatosPresuTipoProyecto.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					intSelectedRow = intSelectedRows[1];
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						presutipoproyectoDestino =(PresuTipoProyecto) this.presutipoproyectoLogic.getPresuTipoProyectos().toArray()[this.jTableDatosPresuTipoProyecto.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						presutipoproyectoDestino =(PresuTipoProyecto) this.presutipoproyectos.toArray()[this.jTableDatosPresuTipoProyecto.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				}
				
				presutipoproyectoOrigen =presutipoproyectosSeleccionados.get(0);
				presutipoproyectoDestino =presutipoproyectosSeleccionados.get(1);
				
				this.setCopiarVariablesObjetosPresuTipoProyecto(presutipoproyectoOrigen,presutipoproyectoDestino,true,false);
				
				presutipoproyectoDestino.setsType("DUPLICADO");
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(presutipoproyectoDestino,presutipoproyectoLogic.getPresuTipoProyectos());					
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(presutipoproyectoDestino,presutipoproyectos);
				}
				//ARCHITECTURE
				
				this.inicializarActualizarBindingTablaPresuTipoProyecto(false);
				
				//this.jTableDatosPresuTipoProyecto.setRowSelectionInterval(this.getIndiceNuevoPresuTipoProyecto(), this.getIndiceNuevoPresuTipoProyecto());
				
				int iLastRow =  this.jTableDatosPresuTipoProyecto.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosPresuTipoProyecto.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosPresuTipoProyecto.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					//this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaPresuTipoProyecto(false);
				}
			} else {
				throw new Exception("DEBEN ESTAR SELECCIONADOS 2 REGISTROS");
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PresuTipoProyectoConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.estaModoCopiar=false;
		}
	}
	
	public void jButtonVerFormPresuTipoProyectoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormPresuTipoProyecto==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.jInternalFrameDetalleFormPresuTipoProyecto.setSelected(true);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PresuTipoProyectoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonMostrarOcultarPresuTipoProyectoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			Boolean isVisible=this.jPanelParametrosReportesPresuTipoProyecto.isVisible();
			
			//BYDAN_BUSQUEDAS
			
			this.jTabbedPaneBusquedasPresuTipoProyecto.setVisible(!isVisible);			
			
			
			this.jPanelParametrosReportesPresuTipoProyecto.setVisible(!isVisible);
			this.jPanelPaginacionPresuTipoProyecto.setVisible(!isVisible);
			this.jPanelAccionesPresuTipoProyecto.setVisible(!isVisible);
							
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PresuTipoProyectoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarPresuTipoProyectoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.closingInternalFramePresuTipoProyecto();
			
			//if(this.jInternalFrameParent==null) {
				//this.dispose();
			/*} else {
				this.setVisible(false);
	        	this.setSelected(false);	
			}*/			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PresuTipoProyectoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarReporteDinamicoPresuTipoProyectoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameReporteDinamicoPresuTipoProyecto();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PresuTipoProyectoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarImportacionPresuTipoProyectoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameImportacionPresuTipoProyecto();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PresuTipoProyectoConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonAbrirOrderByPresuTipoProyectoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			
			this.abrirInicializarFrameOrderByPresuTipoProyecto();
			
			this.abrirFrameOrderByPresuTipoProyecto();
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PresuTipoProyectoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarOrderByPresuTipoProyectoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameOrderByPresuTipoProyecto();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PresuTipoProyectoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void abrirFrameDetallePresuTipoProyecto(Boolean esRelaciones) throws Exception {	    	        
	    try {
			//CAUSA PROBLEMAS, SE ADICIONA EN CONSTRUCTOR, LUEGO SOLO VISIBLE true y false
			//this.jDesktopPane.add(jInternalFrameDetalleFormPresuTipoProyecto);
			
			if(!esRelaciones) {
				if(this.jInternalFrameDetalleFormPresuTipoProyecto.isMaximum()) {
					this.jInternalFrameDetalleFormPresuTipoProyecto.setMaximum(false);
				}								
				
	    		this.jInternalFrameDetalleFormPresuTipoProyecto.setSize(this.jInternalFrameDetalleFormPresuTipoProyecto.iWidthFormulario,this.jInternalFrameDetalleFormPresuTipoProyecto.iHeightFormulario);
	    	} else {
				if(this.iWidthScroll<this.jInternalFrameDetalleFormPresuTipoProyecto.iWidthFormularioMaximo) {
	    			this.jInternalFrameDetalleFormPresuTipoProyecto.setSize(this.iWidthScroll,this.iHeightScroll);
				} else {
					if(!this.jInternalFrameDetalleFormPresuTipoProyecto.isMaximum()) {
						this.jInternalFrameDetalleFormPresuTipoProyecto.setMaximum(true);
					}
				}
				
				if(this.jInternalFrameDetalleFormPresuTipoProyecto.jContentPaneDetallePresuTipoProyecto.getWidth() > this.getWidth()) {
					this.jInternalFrameDetalleFormPresuTipoProyecto.jTabbedPaneRelacionesPresuTipoProyecto.setMinimumSize(new Dimension(this.jInternalFrameDetalleFormPresuTipoProyecto.jContentPaneDetallePresuTipoProyecto.getWidth(),PresuTipoProyectoConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormPresuTipoProyecto.jTabbedPaneRelacionesPresuTipoProyecto.setMaximumSize(new Dimension(this.jInternalFrameDetalleFormPresuTipoProyecto.jContentPaneDetallePresuTipoProyecto.getWidth(),PresuTipoProyectoConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormPresuTipoProyecto.jTabbedPaneRelacionesPresuTipoProyecto.setPreferredSize(new Dimension(this.jInternalFrameDetalleFormPresuTipoProyecto.jContentPaneDetallePresuTipoProyecto.getWidth(),PresuTipoProyectoConstantesFunciones.ALTO_TABPANE_RELACIONES));
					
					Dimension dimension=new Dimension(); 
					
					
					
				}
	    	}
			
		
	       	this.jInternalFrameDetalleFormPresuTipoProyecto.setVisible(true);
	        this.jInternalFrameDetalleFormPresuTipoProyecto.setSelected(true);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,PresuTipoProyectoConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirInicializarFrameOrderByPresuTipoProyecto() throws Exception {	    	        
	    try {
			if(this.jInternalFrameOrderByPresuTipoProyecto==null) {
				
				if(!this.conCargarMinimo) {
					this.jInternalFrameOrderByPresuTipoProyecto=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByPresuTipoProyecto,false,this);
				} else {
					this.jInternalFrameOrderByPresuTipoProyecto=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByPresuTipoProyecto,true,this);
				}
				
				this.jDesktopPane.add(this.jInternalFrameOrderByPresuTipoProyecto);
				this.jInternalFrameOrderByPresuTipoProyecto.setVisible(false);
				this.jInternalFrameOrderByPresuTipoProyecto.setSelected(false);
				
				this.jInternalFrameOrderByPresuTipoProyecto.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByPresuTipoProyecto"));
				
				this.inicializarActualizarBindingTablaOrderByPresuTipoProyecto();
			}
		} catch (final Exception e) {
			
		}
	}
	
	
	
	public void abrirInicializarFrameImportacionPresuTipoProyecto() throws Exception {	    	        
	    try {
			if(this.jInternalFrameImportacionPresuTipoProyecto==null) {
				
				this.jInternalFrameImportacionPresuTipoProyecto=new ImportacionJInternalFrame(PresuTipoProyectoConstantesFunciones.SCLASSWEBTITULO,this);			
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionPresuTipoProyecto);							
				
				this.jDesktopPane.add(this.jInternalFrameImportacionPresuTipoProyecto);
				this.jInternalFrameImportacionPresuTipoProyecto.setVisible(false);
				this.jInternalFrameImportacionPresuTipoProyecto.setSelected(false);


				this.jInternalFrameImportacionPresuTipoProyecto.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionPresuTipoProyecto"));
				this.jInternalFrameImportacionPresuTipoProyecto.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionPresuTipoProyecto"));
				this.jInternalFrameImportacionPresuTipoProyecto.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionPresuTipoProyecto"));


			}
		} catch (final Exception e) {
			
		}
	}		
	
	
	
	public void abrirInicializarFrameReporteDinamicoPresuTipoProyecto() throws Exception {	    	        
	    try {
			
			if(this.jInternalFrameReporteDinamicoPresuTipoProyecto==null) {
				this.jInternalFrameReporteDinamicoPresuTipoProyecto=new ReporteDinamicoJInternalFrame(PresuTipoProyectoConstantesFunciones.SCLASSWEBTITULO,this);	
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoPresuTipoProyecto);	
	
	
				this.jDesktopPane.add(this.jInternalFrameReporteDinamicoPresuTipoProyecto);
				this.jInternalFrameReporteDinamicoPresuTipoProyecto.setVisible(false);
				this.jInternalFrameReporteDinamicoPresuTipoProyecto.setSelected(false);
	
	
	
				this.jInternalFrameReporteDinamicoPresuTipoProyecto.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoPresuTipoProyecto"));
				this.jInternalFrameReporteDinamicoPresuTipoProyecto.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoPresuTipoProyecto"));
				this.jInternalFrameReporteDinamicoPresuTipoProyecto.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoPresuTipoProyecto"));
	
				this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualPresuTipoProyecto();
			}

		} catch (final Exception e) {
			
		}
	}	
	
	
	
		
					
	public void cerrarFrameDetallePresuTipoProyecto() throws Exception {	    	        
	    try {
			//this.jDesktopPane.add(jInternalFrameDetalleFormPresuTipoProyecto);
			
	       	this.jInternalFrameDetalleFormPresuTipoProyecto.setVisible(false);
	        this.jInternalFrameDetalleFormPresuTipoProyecto.setSelected(false);
			
			//this.jInternalFrameDetalleFormPresuTipoProyecto.dispose();
			//this.jInternalFrameDetalleFormPresuTipoProyecto=null;
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,PresuTipoProyectoConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirFrameReporteDinamicoPresuTipoProyecto() throws Exception {	    	        
	    try {
			
			this.jInternalFrameReporteDinamicoPresuTipoProyecto.setVisible(true);
	        this.jInternalFrameReporteDinamicoPresuTipoProyecto.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,PresuTipoProyectoConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void abrirFrameImportacionPresuTipoProyecto() throws Exception {	    	        		
	    try {			
			this.jInternalFrameImportacionPresuTipoProyecto.setVisible(true);
	        this.jInternalFrameImportacionPresuTipoProyecto.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,PresuTipoProyectoConstantesFunciones.CLASSNAME);
	    }		
	}	
	
	
	
	
	
	public void abrirFrameOrderByPresuTipoProyecto() throws Exception {	    	        		
	    try {
			this.jInternalFrameOrderByPresuTipoProyecto.setVisible(true);
	        this.jInternalFrameOrderByPresuTipoProyecto.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,PresuTipoProyectoConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameOrderByPresuTipoProyecto() throws Exception {	    	        		
	    try {			
			this.jInternalFrameOrderByPresuTipoProyecto.setVisible(false);
	        this.jInternalFrameOrderByPresuTipoProyecto.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,PresuTipoProyectoConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameReporteDinamicoPresuTipoProyecto() throws Exception {			
	    try {
			this.jInternalFrameReporteDinamicoPresuTipoProyecto.setVisible(false);
	        this.jInternalFrameReporteDinamicoPresuTipoProyecto.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,PresuTipoProyectoConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameImportacionPresuTipoProyecto() throws Exception {	    	        		
	    try {
			this.jInternalFrameImportacionPresuTipoProyecto.setVisible(false);
	        this.jInternalFrameImportacionPresuTipoProyecto.setSelected(false);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,PresuTipoProyectoConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	
	public void jButtonModificarPresuTipoProyectoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.modificarPresuTipoProyecto(evt,-1,false);
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PresuTipoProyectoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void modificarPresuTipoProyecto(ActionEvent evt,int rowIndex,Boolean esRelaciones) throws Exception {   
		try {
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosPresuTipoProyecto.getSelectedRow();
			}
			
			this.habilitarDeshabilitarControlesPresuTipoProyecto(true);
			//this.isEsNuevoPresuTipoProyecto=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.presutipoproyecto =(PresuTipoProyecto) this.presutipoproyectoLogic.getPresuTipoProyectos().toArray()[this.jTableDatosPresuTipoProyecto.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.presutipoproyecto =(PresuTipoProyecto) this.presutipoproyectos.toArray()[this.jTableDatosPresuTipoProyecto.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.actualizarEstadoCeldasBotonesPresuTipoProyecto("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesPresuTipoProyecto(false) ;
			
			if(presutipoproyectoSessionBean.getConGuardarRelaciones()) {
			
			}
			
			if(PresuTipoProyectoJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetallePresuTipoProyecto(esRelaciones);
			}
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualPresuTipoProyecto(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PresuTipoProyectoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarFilaTablaPresuTipoProyectoActual() { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL
			Integer intSelectedRow = this.jTableDatosPresuTipoProyecto.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.presutipoproyecto =(PresuTipoProyecto) this.presutipoproyectoLogic.getPresuTipoProyectos().toArray()[this.jTableDatosPresuTipoProyecto.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.presutipoproyecto =(PresuTipoProyecto) this.presutipoproyectos.toArray()[this.jTableDatosPresuTipoProyecto.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PresuTipoProyectoConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void seleccionarPresuTipoProyecto(ActionEvent evt,int rowIndex) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormPresuTipoProyecto==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosPresuTipoProyecto.getSelectedRow();
			}
			
			//this.habilitarDeshabilitarControlesPresuTipoProyecto(true);
			//this.isEsNuevoPresuTipoProyecto=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.presutipoproyecto =(PresuTipoProyecto) this.presutipoproyectoLogic.getPresuTipoProyectos().toArray()[this.jTableDatosPresuTipoProyecto.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.presutipoproyecto =(PresuTipoProyecto) this.presutipoproyectos.toArray()[this.jTableDatosPresuTipoProyecto.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.jInternalFrameParent.setIdCombosCodigoDesdeBusquedaForeignKey(this.presutipoproyecto.getId(),this.sTipoBusqueda);
			
			this.dispose();
			
			//this.actualizarEstadoCeldasBotonesPresuTipoProyecto("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			/*
			this.inicializarActualizarBindingBotonesPresuTipoProyecto(false) ;
			
			if(PresuTipoProyectoJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetallePresuTipoProyecto(esRelaciones);
			}
			*/
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualPresuTipoProyecto(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PresuTipoProyectoConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void setIdCombosCodigoDesdeBusquedaForeignKey(Long id,String sType)throws Exception{
		
		try {
		} catch(Exception e) {
			throw e;
		}
	}
	
		
	
	
	public void jButtonActualizarPresuTipoProyectoActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.presutipoproyectoLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingParametrosReportesPresuTipoProyecto(false);
			
			//if(!this.isEsNuevoPresuTipoProyecto) {								
				int intSelectedRow = this.jTableDatosPresuTipoProyecto.getSelectedRow();	
				
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.presutipoproyecto =(PresuTipoProyecto) this.presutipoproyectoLogic.getPresuTipoProyectos().toArray()[this.jTableDatosPresuTipoProyecto.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.presutipoproyecto =(PresuTipoProyecto) this.presutipoproyectos.toArray()[this.jTableDatosPresuTipoProyecto.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
			//}
				
			if(PresuTipoProyectoJInternalFrame.ISBINDING_MANUAL_TABLA) {
				this.setVariablesFormularioToObjetoActualPresuTipoProyecto(this.presutipoproyecto,true);
				this.setVariablesFormularioToObjetoActualForeignKeysPresuTipoProyecto(this.presutipoproyecto);
				
			}
			
			if(this.permiteMantenimiento(this.presutipoproyecto)) {	
				this.actualizar();
				
				if(!this.isGuardarCambiosEnLote && !this.presutipoproyectoSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
					
					this.isEsNuevoPresuTipoProyecto=true;
					this.inicializarActualizarBindingTablaPresuTipoProyecto(false);
					this.isEsNuevoPresuTipoProyecto=false;
				
				} else {					
					
					//PARA RELACIONADO ACTUALIZAR FILA TOTALES
					this.isEsNuevoPresuTipoProyecto=true;
					this.procesoActualizarFilaTotales(false,"MANTENIMIENTO");
					this.isEsNuevoPresuTipoProyecto=false;
				}
						
								
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesPresuTipoProyecto(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualPresuTipoProyecto(false);
				
				this.habilitarDeshabilitarControlesPresuTipoProyecto(false);
			
												
				
				if(PresuTipoProyectoJInternalFrame.CON_DATOS_FRAME) {
					if(!this.isPostAccionSinCerrar) {
						this.cerrarFrameDetallePresuTipoProyecto();
					}
				}
				
				if(this.isPostAccionNuevo) {
					this.jButtonNuevoPresuTipoProyectoActionPerformed(evt,presutipoproyectoSessionBean.getConGuardarRelaciones());
				} else {
					if(this.isPostAccionSinCerrar) {
						Integer intSelectedRowActual=this.getIndiceActualPresuTipoProyecto(this.presutipoproyecto,intSelectedRow);
						
						if(intSelectedRow>-1) {
							this.jTableDatosPresuTipoProyecto.setRowSelectionInterval(intSelectedRowActual, intSelectedRowActual);
							this.jButtonIdActionPerformed(evt,intSelectedRowActual,presutipoproyectoSessionBean.getConGuardarRelaciones(),false);
						}
					}
				}
				
				this.cancelar(false);
				
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.presutipoproyectoLogic.commitNewConnexionToDeep();
			}
			
			
			if(this.jInternalFrameParent!=null) { //&& this.isEsMantenimientoRelacionado) {
				Boolean esUsoDesdeHijoLocal=true;
				String sTipo="Formulario";
				Boolean conIrServidorAplicacionParent=false;
				Long id=this.presutipoproyecto.getId();
				ArrayList<String> arrClasses=new ArrayList<String>();
				
				GeneralEntityParameterGeneral generalEntityParameterGeneral=new GeneralEntityParameterGeneral();
				
				generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
				generalEntityParameterGeneral.setsDominio("Formulario");
				generalEntityParameterGeneral.setsDominioTipo(PresuTipoProyecto.class.getName());
				
				this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",PresuTipoProyecto.class.getName(),sTipo,"FORMULARIO",esControlTabla,conIrServidorAplicacionParent,
					id,this, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.FORM,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
					evt,generalEntityParameterGeneral,this);
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.presutipoproyectoLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,PresuTipoProyectoConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.presutipoproyectoLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonEliminarPresuTipoProyectoActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.presutipoproyectoLogic.getNewConnexionToDeep("");
			}
			
			int intSelectedRow = this.jTableDatosPresuTipoProyecto.getSelectedRow();	       
							
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.presutipoproyecto =(PresuTipoProyecto) this.presutipoproyectoLogic.getPresuTipoProyectos().toArray()[this.jTableDatosPresuTipoProyecto.convertRowIndexToModel(intSelectedRow)];
				this.presutipoproyecto.setIsDeleted(true);
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.presutipoproyecto =(PresuTipoProyecto) this.presutipoproyectos.toArray()[this.jTableDatosPresuTipoProyecto.convertRowIndexToModel(intSelectedRow)];
				this.presutipoproyecto.setIsDeleted(true);
			}
			//ARCHITECTURE
			
			if(this.permiteMantenimiento(this.presutipoproyecto)) {
				this.eliminar();
				
				if(!this.isGuardarCambiosEnLote && !this.presutipoproyectoSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
				}
				
				((PresuTipoProyectoModel) this.jTableDatosPresuTipoProyecto.getModel()).fireTableRowsDeleted(intSelectedRow,intSelectedRow);
				
				this.isEsNuevoPresuTipoProyecto=true;
				this.inicializarActualizarBindingTablaPresuTipoProyecto(false);
				this.isEsNuevoPresuTipoProyecto=false;									
					
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesPresuTipoProyecto(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualPresuTipoProyecto(false);
				
				this.habilitarDeshabilitarControlesPresuTipoProyecto(false);
				
				
				
				if(PresuTipoProyectoJInternalFrame.CON_DATOS_FRAME) {
					this.cerrarFrameDetallePresuTipoProyecto();
				}
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.presutipoproyectoLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.presutipoproyectoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,PresuTipoProyectoConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.presutipoproyectoLogic.closeNewConnexionToDeep();
			}
		}		
	}
		
	public void jButtonCancelarPresuTipoProyectoActionPerformed(ActionEvent evt) throws Exception {                                         	   	       
	  	try {
			if(jTableDatosPresuTipoProyecto.getRowCount()>=1) {
				jTableDatosPresuTipoProyecto.removeRowSelectionInterval(0, jTableDatosPresuTipoProyecto.getRowCount()-1);						
			}
						
			this.invalidValues=new InvalidValue[0];
			this.habilitarDeshabilitarControlesPresuTipoProyecto(false);
			this.cancelar(true);			
			this.inicializarActualizarBindingTablaPresuTipoProyecto(false);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesPresuTipoProyecto(false) ;
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualPresuTipoProyecto(false) ;
			
			this.isEsNuevoPresuTipoProyecto=false;
			
			if(PresuTipoProyectoJInternalFrame.CON_DATOS_FRAME) {
				this.cerrarFrameDetallePresuTipoProyecto();
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PresuTipoProyectoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonGuardarCambiosPresuTipoProyectoActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.presutipoproyectoLogic.getNewConnexionToDeep("");
			}
			
			//this.estaModoGuardarCambios=true;
			
	    	this.guardarCambios();
			
			if(!this.isErrorGuardar) {
				this.procesarBusqueda(this.sAccionBusqueda);
				
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingPresuTipoProyecto(false);
				
				//SI ES MANUAL
				if(PresuTipoProyectoJInternalFrame.ISBINDING_MANUAL) {				
					//this.inicializarActualizarBindingManualPresuTipoProyecto();				
				}
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.presutipoproyectoLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.presutipoproyectoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,PresuTipoProyectoConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.presutipoproyectoLogic.closeNewConnexionToDeep();
			}
			
			//this.estaModoGuardarCambios=false;
		}
	}
	
	public void jButtonNuevoGuardarCambiosPresuTipoProyectoActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			this.estaModoNuevo=true;
			this.estaModoNuevoGuardarCambios=true;
			
			//LO HACE NUEVOPREPARAR
			//this.iIdNuevoPresuTipoProyecto--;			
			//PresuTipoProyecto presutipoproyectoAux= new PresuTipoProyecto();			
			//presutipoproyectoAux.setId(this.iIdNuevoPresuTipoProyecto);
			
			if(this.jInternalFrameDetalleFormPresuTipoProyecto==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.aumentarTamanioFilaNuevaTablaPresuTipoProyecto();
			
			if(this.conTotales) {
				this.quitarFilaTotales();
			}
			
			this.nuevoPreparar(true);
			
			this.setVariablesFormularioToObjetoActualForeignKeysPresuTipoProyecto(this.presutipoproyecto);
			
			this.presutipoproyecto.setsType("NUEVO_GUARDAR_CAMBIOS");
			
			//LO HACE NUEVOPREPARAR
			/*
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				this.presutipoproyectoLogic.getPresuTipoProyectos().add(this.presutipoproyectoAux);
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				this.presutipoproyectos.add(this.presutipoproyectoAux);				
			}
			*/
			
			this.inicializarActualizarBindingTablaPresuTipoProyecto(false);
			
			this.jTableDatosPresuTipoProyecto.setRowSelectionInterval(this.getIndiceNuevoPresuTipoProyecto(), this.getIndiceNuevoPresuTipoProyecto());
			
			int iLastRow =  this.jTableDatosPresuTipoProyecto.getRowCount () - 1;
			Rectangle rectangle = this.jTableDatosPresuTipoProyecto.getCellRect(iLastRow, 0, true);
			
			this.jTableDatosPresuTipoProyecto.scrollRectToVisible(rectangle);
			
			//FILA TOTALES
			if(this.conTotales) {
				this.crearFilaTotales();
				
				this.inicializarActualizarBindingTablaPresuTipoProyecto(false);
			}

		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,PresuTipoProyectoConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;
			this.estaModoNuevoGuardarCambios=false;
		}
	}		
	
	public void jButtonRecargarInformacionPresuTipoProyectoActionPerformed(ActionEvent evt) throws Exception {    		
		try {
			this.iNumeroPaginacionPagina=0;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.presutipoproyectoLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingPresuTipoProyecto(false,false);
			
	    	this.recargarInformacion();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingPresuTipoProyecto(false);
			
			//SI ES MANUAL
			if(PresuTipoProyectoJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualPresuTipoProyecto();
			}
			
			//this.abrirFrameTreePresuTipoProyecto();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.presutipoproyectoLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.presutipoproyectoLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,PresuTipoProyectoConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.presutipoproyectoLogic.closeNewConnexionToDeep();
			}
		}	
	}
	
	
	public void jButtonGenerarImportacionPresuTipoProyectoActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedReader bufferedReader = null;
		String sXmlStringFile="";
		String sPath="";
		this.arrDatoGeneralMinimos= new  ArrayList<DatoGeneralMinimo>();
		DatoGeneralMinimo datoGeneralMinimo=new DatoGeneralMinimo();
		String sLine="";
		
		try {			
			if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR IMPORTACION DE Tipo ProyectoS ?", "MANTENIMIENTO DE Tipo Proyecto", JOptionPane.OK_CANCEL_OPTION) == 0) {
				bufferedReader = new BufferedReader(new FileReader(this.jInternalFrameImportacionPresuTipoProyecto.getFileImportacion().getAbsolutePath()));
								
				while ((sLine = bufferedReader.readLine()) != null) {
					datoGeneralMinimo=new DatoGeneralMinimo();
					datoGeneralMinimo.setsDescripcion(sLine);
					
					this.arrDatoGeneralMinimos.add(datoGeneralMinimo);
				}
				
				this.actualizarParametrosGeneralPresuTipoProyecto();
						
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {						
					this.presutipoproyectoReturnGeneral=presutipoproyectoLogic.procesarImportacionPresuTipoProyectosWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this.arrDatoGeneralMinimos,this.presutipoproyectoParameterGeneral);
						
				} else if(Constantes.ISUSAEJBREMOTE) {
						
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
						
				this.procesarPresuTipoProyectoReturnGeneral();
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PresuTipoProyectoConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedReader != null) {
				bufferedReader.close();
			}	
		}				
	}
	
	
	
	public void jButtonAbrirImportacionPresuTipoProyectoActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {
			int iReturnArchivo = this.jInternalFrameImportacionPresuTipoProyecto.getjFileChooserImportacion().showOpenDialog(this);
 
            if (iReturnArchivo == JFileChooser.APPROVE_OPTION) {
            	this.jInternalFrameImportacionPresuTipoProyecto.setFileImportacion(this.jInternalFrameImportacionPresuTipoProyecto.getjFileChooserImportacion().getSelectedFile());
            	
				this.jInternalFrameImportacionPresuTipoProyecto.getjTextFieldPathArchivoImportacion().setText(this.jInternalFrameImportacionPresuTipoProyecto.getFileImportacion().getName());
				
				//System.out.println("ARCHIVO ESCOGIDO: "+this.fileImportacionPresuTipoProyecto.getName());
				
            } else {
                //System.out.println("CANCELAR SELECCION");
				this.jInternalFrameImportacionPresuTipoProyecto.getjTextFieldPathArchivoImportacion().setText("SELECCION CANCELADA");
            }			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PresuTipoProyectoConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedWriter != null) {
				bufferedWriter.close();
			}	
		}		
	}
	
	
	public void jButtonGenerarReporteDinamicoPresuTipoProyectoActionPerformed(ActionEvent evt) throws Exception {    		
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {	
		
		ArrayList<PresuTipoProyecto> presutipoproyectosSeleccionados=new ArrayList<PresuTipoProyecto>();		

		presutipoproyectosSeleccionados=this.getPresuTipoProyectosSeleccionados(true);
		
		
		this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoPresuTipoProyecto.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();
		
		this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoPresuTipoProyecto.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
		
		
		this.sTipoArchivoReporte=this.sTipoArchivoReporteDinamico;
		
		//this.sTipoReporteExtra="Base";
		
			InputStream reportFile=null;
			InputStream imageFile=null;
			
			imageFile=AuxiliarImagenes.class.getResourceAsStream("LogoReporte.jpg");			
				
		
		
			reportFile = AuxiliarReportes.class.getResourceAsStream("PresuTipoProyectoBaseDesign.jrxml");	
			
			sPath=this.parametroGeneralUsuario.getpath_exportar()+"PresuTipoProyectoBaseDesign.jrxml";
			
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
			
			this.generarReportePresuTipoProyectos("Todos",presutipoproyectosSeleccionados );

			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.presutipoproyectoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				//DEBE APARECER EL REPORTE DIRECTAMENTE
				//JOptionPane.showMessageDialog(this,"GENERADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Proyecto",JOptionPane.INFORMATION_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PresuTipoProyectoConstantesFunciones.CLASSNAME);
		
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
		
		for(int index:this.jInternalFrameReporteDinamicoPresuTipoProyecto.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoPresuTipoProyecto.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case PresuTipoProyectoConstantesFunciones.LABEL_IDEMPRESA:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_Empresa_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_Empresa_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_Empresa_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_Empresa_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case PresuTipoProyectoConstantesFunciones.LABEL_CODIGO:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_digo_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_digo_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_digo_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_digo_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case PresuTipoProyectoConstantesFunciones.LABEL_NOMBRE:
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
		
		if(this.jInternalFrameReporteDinamicoPresuTipoProyecto.getjCheckBoxConGraficoDinamico().isSelected()) {
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
		reporte=((Reporte)this.jInternalFrameReporteDinamicoPresuTipoProyecto.getjComboBoxColumnaCategoriaGrafico().getSelectedItem());
				
		//TIPO GRAFICO REPORTE
		reporteTipoGraficoReporte=((Reporte)this.jInternalFrameReporteDinamicoPresuTipoProyecto.getjComboBoxTiposGraficosReportesDinamico().getSelectedItem());
		
		String sTipoGraficoReporte=reporteTipoGraficoReporte.getsCodigo();
		
		switch(reporte.getsCodigo()) {
			
				case PresuTipoProyectoConstantesFunciones.LABEL_IDEMPRESA:
					sNombreCampoCategoria="id_empresa";
					break;

				case PresuTipoProyectoConstantesFunciones.LABEL_CODIGO:
					sNombreCampoCategoria="codigo";
					break;

				case PresuTipoProyectoConstantesFunciones.LABEL_NOMBRE:
					sNombreCampoCategoria="nombre";
					break;
					
			default :
				break;
		}		
		//CATEGORIA GRAFICO
		
		//CATEGORIA VALOR				
		reporteCategoriaValor=((Reporte)this.jInternalFrameReporteDinamicoPresuTipoProyecto.getjComboBoxColumnaCategoriaValor().getSelectedItem());
		
		switch(reporteCategoriaValor.getsCodigo()) {
			
				case PresuTipoProyectoConstantesFunciones.LABEL_IDEMPRESA:
					sNombreCampoCategoriaValor="id_empresa";
					break;

				case PresuTipoProyectoConstantesFunciones.LABEL_CODIGO:
					sNombreCampoCategoriaValor="codigo";
					break;

				case PresuTipoProyectoConstantesFunciones.LABEL_NOMBRE:
					sNombreCampoCategoriaValor="nombre";
					break;
					
			default :
				break;
		}	
		//CATEGORIA VALOR
		
		//VALORES GRAFICO
		for(int index:this.jInternalFrameReporteDinamicoPresuTipoProyecto.getjListColumnasValoresGrafico().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoPresuTipoProyecto.getjListColumnasValoresGrafico().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case PresuTipoProyectoConstantesFunciones.LABEL_IDEMPRESA:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Empresa",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_empresa");
					break;

				case PresuTipoProyectoConstantesFunciones.LABEL_CODIGO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Codigo",sNombreCampoCategoria,sNombreCampoCategoriaValor,"codigo");
					break;

				case PresuTipoProyectoConstantesFunciones.LABEL_NOMBRE:
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
	
	public void jButtonGenerarExcelReporteDinamicoPresuTipoProyectoActionPerformed(ActionEvent evt) throws Exception {		
		ArrayList<PresuTipoProyecto> presutipoproyectosSeleccionados=new ArrayList<PresuTipoProyecto>();		
		
		presutipoproyectosSeleccionados=this.getPresuTipoProyectosSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"presutipoproyecto";//.xls";
		
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
		
			Sheet sheet = workbook.createSheet("PresuTipoProyectos");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			Row row = sheet.createRow(iRow);
			Cell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");
			
			for(int index:this.jInternalFrameReporteDinamicoPresuTipoProyecto.getjListColumnasSelectReporte().getSelectedIndices()) {
				reporte=(Reporte)this.jInternalFrameReporteDinamicoPresuTipoProyecto.getjListColumnasSelectReporte().getModel().getElementAt(index);
				
				switch(reporte.getsCodigo()) {
					
				case PresuTipoProyectoConstantesFunciones.LABEL_IDEMPRESA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(PresuTipoProyectoConstantesFunciones.LABEL_IDEMPRESA);
					iRow++;

					for(PresuTipoProyecto presutipoproyecto:presutipoproyectosSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(presutipoproyecto.getempresa_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case PresuTipoProyectoConstantesFunciones.LABEL_CODIGO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(PresuTipoProyectoConstantesFunciones.LABEL_CODIGO);
					iRow++;

					for(PresuTipoProyecto presutipoproyecto:presutipoproyectosSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(presutipoproyecto.getcodigo());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case PresuTipoProyectoConstantesFunciones.LABEL_NOMBRE:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(PresuTipoProyectoConstantesFunciones.LABEL_NOMBRE);
					iRow++;

					for(PresuTipoProyecto presutipoproyecto:presutipoproyectosSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(presutipoproyecto.getnombre());
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
			//	this.getFilaCabeceraExportarExcelPresuTipoProyecto(row);				
			//	iRow++;
			//}				
			
			//for(PresuTipoProyecto presutipoproyectoAux:presutipoproyectosSeleccionados) {
			//	row = sheet.createRow(iRow);
				
			//	this.getFilaDatosExportarExcelPresuTipoProyecto(presutipoproyectoAux,row);
				
			//	iRow++;
			//}
			
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.presutipoproyectoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Proyecto",JOptionPane.INFORMATION_MESSAGE);
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
				this.presutipoproyectoLogic.getNewConnexionToDeep("");
			}
			
			this.idActual=idActual;
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda("PorId");
				    	
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingPresuTipoProyecto(false);
			
			//SI ES MANUAL
			if(PresuTipoProyectoJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualPresuTipoProyecto();
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.presutipoproyectoLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.presutipoproyectoLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger);
			
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.presutipoproyectoLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonAnterioresPresuTipoProyectoActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion-=this.iNumeroPaginacion;
			/*
			if(this.iNumeroPaginacion<0) {
				this.iNumeroPaginacion=0;
			}
			*/
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.presutipoproyectoLogic.getNewConnexionToDeep("");
			}
			
			this.anteriores();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingPresuTipoProyecto(false);
			
			//SI ES MANUAL
			if(PresuTipoProyectoJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualPresuTipoProyecto();
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.presutipoproyectoLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.presutipoproyectoLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,PresuTipoProyectoConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.presutipoproyectoLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonSiguientesPresuTipoProyectoActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion+=this.iNumeroPaginacion;
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.presutipoproyectoLogic.getNewConnexionToDeep("");
			}
			
			this.siguientes();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingPresuTipoProyecto(false);
			
			//SI ES MANUAL
			if(PresuTipoProyectoJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualPresuTipoProyecto();
			}		
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.presutipoproyectoLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.presutipoproyectoLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,PresuTipoProyectoConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.presutipoproyectoLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void aumentarTamanioFilaNuevaTablaPresuTipoProyecto() throws Exception {		
		Dimension dimensionMinimum=this.jTableDatosPresuTipoProyecto.getMinimumSize();
		Dimension dimensionMaximum=this.jTableDatosPresuTipoProyecto.getMaximumSize();
		Dimension dimensionPreferred=this.jTableDatosPresuTipoProyecto.getPreferredSize();
	
		double iHeightConFilaNueva=dimensionPreferred.getHeight();
		
		iHeightConFilaNueva+=this.jTableDatosPresuTipoProyecto.getRowHeight();
		
		dimensionMinimum.setSize(dimensionMinimum.getWidth(),iHeightConFilaNueva);
		dimensionMaximum.setSize(dimensionMaximum.getWidth(),iHeightConFilaNueva);
		dimensionPreferred.setSize(dimensionPreferred.getWidth(),iHeightConFilaNueva);
		
		this.jTableDatosPresuTipoProyecto.setMinimumSize(dimensionMinimum);
		this.jTableDatosPresuTipoProyecto.setMaximumSize(dimensionMaximum);
		this.jTableDatosPresuTipoProyecto.setPreferredSize(dimensionPreferred);	
	}
	
	public void inicializarActualizarBindingPresuTipoProyecto(Boolean esInicializar) throws Exception {
		this.inicializarActualizarBindingPresuTipoProyecto(esInicializar,true);
	}
	
	public void inicializarActualizarBindingPresuTipoProyecto(Boolean esInicializar,Boolean conTabla) throws Exception {		
		if(conTabla) {
			this.inicializarActualizarBindingTablaPresuTipoProyecto(esInicializar);
		}
		
		this.inicializarActualizarBindingBotonesPresuTipoProyecto(esInicializar);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.presutipoproyectoSessionBean.getEsGuardarRelacionado()) {
			try{this.inicializarActualizarBindingBusquedasPresuTipoProyecto(esInicializar);}catch(Exception e){e.printStackTrace();}
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesPresuTipoProyecto(esInicializar) ;
			
			this.inicializarActualizarBindingParametrosReportesPresuTipoProyecto(esInicializar) ;
		}
		
		if(esInicializar) {
			if( !PresuTipoProyectoJInternalFrame.ISBINDING_MANUAL_TABLA ||
			   	!PresuTipoProyectoJInternalFrame.ISBINDING_MANUAL) {
			   	
			}
		}
	}
	
	public void inicializarActualizarBindingManualPresuTipoProyecto() throws Exception {		
		//NO SE NECESITA HACER BINDING OTRA VEZ
		//this.inicializarActualizarBindingTablaPresuTipoProyecto();
		
		this.inicializarActualizarBindingBotonesManualPresuTipoProyecto(true);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.presutipoproyectoSessionBean.getEsGuardarRelacionado()) {
			
			this.inicializarActualizarBindingBusquedasManualPresuTipoProyecto();			
			
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesPresuTipoProyecto() ;
			
			this.inicializarActualizarBindingParametrosReportesPostAccionesManualPresuTipoProyecto(false) ;			
			
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesPostAccionesManualPresuTipoProyecto(Boolean esSetControles) throws Exception {
		try	{					
			if(!esSetControles) {
				this.isSeleccionarTodos=this.jCheckBoxSeleccionarTodosPresuTipoProyecto.isSelected();
				this.isSeleccionados=this.jCheckBoxSeleccionadosPresuTipoProyecto.isSelected();
				
				
				this.conGraficoReporte=this.jCheckBoxConGraficoReportePresuTipoProyecto.isSelected();															
				
				
				if(this.jInternalFrameDetalleFormPresuTipoProyecto!=null) {
				this.isPostAccionNuevo=this.jInternalFrameDetalleFormPresuTipoProyecto.jCheckBoxPostAccionNuevoPresuTipoProyecto.isSelected();
				this.isPostAccionSinCerrar=this.jInternalFrameDetalleFormPresuTipoProyecto.jCheckBoxPostAccionSinCerrarPresuTipoProyecto.isSelected();
				this.isPostAccionSinMensaje=this.jInternalFrameDetalleFormPresuTipoProyecto.jCheckBoxPostAccionSinMensajePresuTipoProyecto.isSelected();
				}
			
			} else {
				this.jCheckBoxSeleccionarTodosPresuTipoProyecto.setSelected(this.isSeleccionarTodos);
				this.jCheckBoxSeleccionadosPresuTipoProyecto.setSelected(this.isSeleccionados);
				
				
				this.jCheckBoxConGraficoReportePresuTipoProyecto.setSelected(this.conGraficoReporte);				
				
				
				if(this.jInternalFrameDetalleFormPresuTipoProyecto!=null) {
				this.jInternalFrameDetalleFormPresuTipoProyecto.jCheckBoxPostAccionNuevoPresuTipoProyecto.setSelected(this.isPostAccionNuevo);
				this.jInternalFrameDetalleFormPresuTipoProyecto.jCheckBoxPostAccionSinCerrarPresuTipoProyecto.setSelected(this.isPostAccionSinCerrar);
				this.jInternalFrameDetalleFormPresuTipoProyecto.jCheckBoxPostAccionSinMensajePresuTipoProyecto.setSelected(this.isPostAccionSinMensaje);
				}
			}
			
			
			if(this.jComboBoxTiposPaginacionPresuTipoProyecto.getSelectedItem()!=null) {
				this.sTipoPaginacion=((Reporte)this.jComboBoxTiposPaginacionPresuTipoProyecto.getSelectedItem()).getsCodigo();			
			}
			
			
			
			if(this.jInternalFrameDetalleFormPresuTipoProyecto!=null) {
			this.sTipoAccionFormulario=((Reporte)this.jInternalFrameDetalleFormPresuTipoProyecto.jComboBoxTiposAccionesFormularioPresuTipoProyecto.getSelectedItem()).getsCodigo();
			}
			
			
			
			if(!this.conCargarMinimo) {
				this.sTipoArchivoReporte=((Reporte)this.jComboBoxTiposArchivosReportesPresuTipoProyecto.getSelectedItem()).getsCodigo();			
				
				if(this.jInternalFrameReporteDinamicoPresuTipoProyecto!=null) {
					this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoPresuTipoProyecto.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
				}
				
				this.sTipoRelacion=((Reporte)this.jComboBoxTiposRelacionesPresuTipoProyecto.getSelectedItem()).getsCodigo();
									
				this.sTipoAccion=((Reporte)this.jComboBoxTiposAccionesPresuTipoProyecto.getSelectedItem()).getsCodigo();
													
				this.sTipoSeleccionar=((Reporte)this.jComboBoxTiposSeleccionarPresuTipoProyecto.getSelectedItem()).getsCodigo();
									
				this.sTipoReporte=((Reporte)this.jComboBoxTiposReportesPresuTipoProyecto.getSelectedItem()).getsCodigo();							
					
				if(this.jInternalFrameReporteDinamicoPresuTipoProyecto!=null) {
					this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoPresuTipoProyecto.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();							
				}
				
				this.sTipoGraficoReporte=((Reporte)this.jComboBoxTiposGraficosReportesPresuTipoProyecto.getSelectedItem()).getsCodigo();											
			}			
			
			this.sValorCampoGeneral=this.jTextFieldValorCampoGeneralPresuTipoProyecto.getText();						
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesPresuTipoProyecto(Boolean esInicializar) throws Exception {
		try	{	
			if(PresuTipoProyectoJInternalFrame.ISBINDING_MANUAL) {
				this. inicializarActualizarBindingParametrosReportesPostAccionesManualPresuTipoProyecto(false);
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public void inicializarActualizarBindingtiposArchivosReportesAccionesPresuTipoProyecto() throws Exception {
		try	{
			if(PresuTipoProyectoJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingtiposArchivosReportesAccionesManualPresuTipoProyecto();
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetallePresuTipoProyecto() throws Exception {
		//TIPOS ACCIONES FORMULARIO	
		this.jInternalFrameDetalleFormPresuTipoProyecto.jComboBoxTiposAccionesFormularioPresuTipoProyecto.removeAllItems();
				
		for(Reporte reporte:this.tiposAccionesFormulario) {
			this.jInternalFrameDetalleFormPresuTipoProyecto.jComboBoxTiposAccionesFormularioPresuTipoProyecto.addItem(reporte);
		}
		
		//TIPOS ACCIONES FORMULARIO
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualPresuTipoProyecto() throws Exception {
		try	{
			
			//TIPOS ARCHIVOS REPORTES
			this.jComboBoxTiposArchivosReportesPresuTipoProyecto.removeAllItems();
				
			for(Reporte reporte:this.tiposArchivosReportes) {
				this.jComboBoxTiposArchivosReportesPresuTipoProyecto.addItem(reporte);
			}
			
			
				
			//TIPOS REPORTES
			this.jComboBoxTiposReportesPresuTipoProyecto.removeAllItems();
				
			for(Reporte reporte:this.tiposReportes) {
				this.jComboBoxTiposReportesPresuTipoProyecto.addItem(reporte);
			}
			
			
			//TIPOS GRAFICOS REPORTES
			this.jComboBoxTiposGraficosReportesPresuTipoProyecto.removeAllItems();
				
			for(Reporte reporte:this.tiposGraficosReportes) {
				this.jComboBoxTiposGraficosReportesPresuTipoProyecto.addItem(reporte);
			}
			
			
			//TIPOS PAGINACION
			this.jComboBoxTiposPaginacionPresuTipoProyecto.removeAllItems();
				
			for(Reporte reporte:this.tiposPaginacion) {
				this.jComboBoxTiposPaginacionPresuTipoProyecto.addItem(reporte);
			}
			
			
			if(!this.presutipoproyectoSessionBean.getEsGuardarRelacionado()) {
				this.jComboBoxTiposPaginacionPresuTipoProyecto.setSelectedItem(Funciones2.getTipoPaginacionDefecto("NORMAL",this.tiposPaginacion));
			} else {
				this.jComboBoxTiposPaginacionPresuTipoProyecto.setSelectedItem(Funciones2.getTipoPaginacionDefecto("RELACIONADO",this.tiposPaginacion));
			}
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposRelacionesPresuTipoProyecto.removeAllItems();
				
			for(Reporte reporte:this.tiposRelaciones) {
				this.jComboBoxTiposRelacionesPresuTipoProyecto.addItem(reporte);
			}
			
			//TIPOS ACCIONES
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposAccionesPresuTipoProyecto.removeAllItems();
				
			for(Reporte reporte:this.tiposAcciones) {
				this.jComboBoxTiposAccionesPresuTipoProyecto.addItem(reporte);
			}
			
			//TIPOS ACCIONES			
			
			
			
			//TIPOS ACCIONES FORMULARIO	
			if(this.jInternalFrameDetalleFormPresuTipoProyecto!=null) { //if(this.conCargarFormDetalle) {
				this.jInternalFrameDetalleFormPresuTipoProyecto.jComboBoxTiposAccionesFormularioPresuTipoProyecto.removeAllItems();
				
				for(Reporte reporte:this.tiposAccionesFormulario) {
					this.jInternalFrameDetalleFormPresuTipoProyecto.jComboBoxTiposAccionesFormularioPresuTipoProyecto.addItem(reporte);
				}
				
			}
			//TIPOS ACCIONES FORMULARIO
			
			
			
			//TIPOS SELECCIONAR
			this.jComboBoxTiposSeleccionarPresuTipoProyecto.removeAllItems();
				
			for(Reporte reporte:this.tiposSeleccionar) {
				this.jComboBoxTiposSeleccionarPresuTipoProyecto.addItem(reporte);
			}
			
			
			if(this.tiposSeleccionar!=null && this.tiposSeleccionar.size()>1) {
				this.jComboBoxTiposSeleccionarPresuTipoProyecto.setSelectedIndex(1);
			}
				
			//REPORTE DINAMICO
			this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualPresuTipoProyecto();
							
			//TIPOS COLUMNAS SELECT
			//TIPOS SELECCIONAR
			
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualPresuTipoProyecto() throws Exception {
		try	{
			DefaultListModel<Reporte> defaultListModel=new DefaultListModel<Reporte>();
			
			
			//TIPOS ARCHIVOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoPresuTipoProyecto!=null) {
				this.jInternalFrameReporteDinamicoPresuTipoProyecto.getjComboBoxTiposArchivosReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposArchivosReportesDinamico) {
					this.jInternalFrameReporteDinamicoPresuTipoProyecto.getjComboBoxTiposArchivosReportesDinamico().addItem(reporte);
				}
				
			}
			
			//TIPOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoPresuTipoProyecto!=null) {
				this.jInternalFrameReporteDinamicoPresuTipoProyecto.getjComboBoxTiposReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposReportesDinamico) {
					this.jInternalFrameReporteDinamicoPresuTipoProyecto.getjComboBoxTiposReportesDinamico().addItem(reporte);
				}
				
			}
			
			defaultListModel=new DefaultListModel<Reporte>();
			
			if(this.jInternalFrameReporteDinamicoPresuTipoProyecto!=null) {
				
				if(this.jInternalFrameReporteDinamicoPresuTipoProyecto.getjListColumnasSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoPresuTipoProyecto.getjListColumnasSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposColumnasSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoPresuTipoProyecto.getjListColumnasSelectReporte().setModel(defaultListModel);									
						
				}	
					
				//TIPOS RELACIONES SELECT
				//TIPOS SELECCIONAR
				defaultListModel=new DefaultListModel<Reporte>();
				if(this.jInternalFrameReporteDinamicoPresuTipoProyecto.getjListRelacionesSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoPresuTipoProyecto.getjListRelacionesSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposRelacionesSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoPresuTipoProyecto.getjListRelacionesSelectReporte().setModel(defaultListModel);									
						
				}	
				
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	
	
	public void inicializarActualizarBindingBusquedasManualPresuTipoProyecto()  throws Exception {				
		//BYDAN_BUSQUEDAS		
		
		this.codigoBusquedaPorCodigo=this.jTextFieldcodigoBusquedaPorCodigoPresuTipoProyecto.getText();
		this.nombreBusquedaPorNombre=this.jTextAreanombreBusquedaPorNombrePresuTipoProyecto.getText();
		
	}
	
	
	
	
	public void inicializarActualizarBindingBusquedasPresuTipoProyecto(Boolean esInicializar) throws Exception {				
		if(PresuTipoProyectoJInternalFrame.ISBINDING_MANUAL) {
			
			this.inicializarActualizarBindingBusquedasManualPresuTipoProyecto();			
			
		} else {
		}
	}		
		
	public void inicializarActualizarBindingTablaPresuTipoProyecto() throws Exception {
		this.inicializarActualizarBindingTablaPresuTipoProyecto(false);
	}
	
	
	public void inicializarActualizarBindingTablaOrderByPresuTipoProyecto() {
		//TABLA OrderBy	
		TableColumn tableColumn=new TableColumn();
		Integer iWidthTableDefinicionOrderBy=0;			
			
		this.jInternalFrameOrderByPresuTipoProyecto.getjTableDatosOrderBy().setModel(new TablaGeneralOrderByModel(this.arrOrderBy));
					
		//DEFINIR RENDERERS OrderBy
		tableColumn=this.jInternalFrameOrderByPresuTipoProyecto.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByPresuTipoProyecto.getjTableDatosOrderBy(),OrderBy.ISSELECTED));			
		//tableColumn.addPropertyChangeListener(new PresuTipoProyectoPropertyChangeListener());
					
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		iWidthTableDefinicionOrderBy+=50;
					
		tableColumn=this.jInternalFrameOrderByPresuTipoProyecto.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByPresuTipoProyecto.getjTableDatosOrderBy(),OrderBy.NOMBRE));
		//tableColumn.addPropertyChangeListener(new PresuTipoProyectoPropertyChangeListener());
					
		tableColumn.setPreferredWidth(150); 	 
		tableColumn.setWidth(150); 	 
		tableColumn.setMinWidth(150);
		tableColumn.setMaxWidth(150);
				
		iWidthTableDefinicionOrderBy+=150;
					
		//tableColumn=this.jTableDatosPresuTipoProyectoOrderBy.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosPresuTipoProyectoOrderBy,OrderBy.NOMBREDB));			
		////tableColumn.addPropertyChangeListener(new PresuTipoProyectoPropertyChangeListener());
								
		tableColumn=this.jInternalFrameOrderByPresuTipoProyecto.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByPresuTipoProyecto.getjTableDatosOrderBy(),OrderBy.ESDESC));
		//tableColumn.addPropertyChangeListener(new PresuTipoProyectoPropertyChangeListener());
												
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		((AbstractTableModel) this.jInternalFrameOrderByPresuTipoProyecto.getjTableDatosOrderBy().getModel()).fireTableDataChanged();
				
		iWidthTableDefinicionOrderBy+=50;
	}
	
	
	
	public void inicializarActualizarBindingTablaPresuTipoProyecto(Boolean esInicializar) throws Exception {
		Boolean isNoExiste=false;
		Integer iCountNumeroColumnasNormal=0;
		Integer iCountNumeroColumnasFk=0;
		
		this.iWidthTableDefinicion=0;
		
		int iSizeTabla=0;
		
		iSizeTabla=this.getSizeTablaDatos();
		
	if(esInicializar || ConstantesSwing.FORZAR_INICIALIZAR_TABLA) {//esInicializar
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			isNoExiste=presutipoproyectoLogic.getPresuTipoProyectos().size()==0;
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			isNoExiste=presutipoproyectos.size()==0;
		}
		//ARCHITECTURE
			
		if(isNoExiste) {
			if(this.iNumeroPaginacion-this.iNumeroPaginacion>0) {
				this.iNumeroPaginacion-=this.iNumeroPaginacion;
			}
		}
		
		TableColumn tableColumn=new TableColumn();
		
		if(PresuTipoProyectoJInternalFrame.ISBINDING_MANUAL_TABLA) {
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.jTableDatosPresuTipoProyecto.setModel(new PresuTipoProyectoModel(this.presutipoproyectoLogic.getPresuTipoProyectos(),this));
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.jTableDatosPresuTipoProyecto.setModel(new PresuTipoProyectoModel(this.presutipoproyectos,this));
			}
			//ARCHITECTURE
			
							
			
			
			if(this.jInternalFrameOrderByPresuTipoProyecto!=null && this.jInternalFrameOrderByPresuTipoProyecto.getjTableDatosOrderBy()!=null) {
				this.inicializarActualizarBindingTablaOrderByPresuTipoProyecto();
			}
			
								
			//DEFINIR RENDERERS
			tableColumn=this.jTableDatosPresuTipoProyecto.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosPresuTipoProyecto,Constantes2.S_SELECCIONAR));
			//tableColumn.addPropertyChangeListener(new PresuTipoProyectoPropertyChangeListener());
			tableColumn.setCellRenderer(new BooleanRenderer(true,"Seleccionar "+PresuTipoProyectoConstantesFunciones.SCLASSWEBTITULO,presutipoproyectoConstantesFunciones.resaltarSeleccionarPresuTipoProyecto,true,false,"","",this));
			tableColumn.setCellEditor(new BooleanEditorRenderer(true,"Seleccionar "+PresuTipoProyectoConstantesFunciones.SCLASSWEBTITULO,presutipoproyectoConstantesFunciones.resaltarSeleccionarPresuTipoProyecto,false,"","",this));			
			
			tableColumn.setPreferredWidth(50); 	 
			tableColumn.setWidth(50); 	 
			tableColumn.setMinWidth(50); 
			tableColumn.setMaxWidth(50); 
			
			this.iWidthTableDefinicion+=50;
			
			


			tableColumn=this.jTableDatosPresuTipoProyecto.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosPresuTipoProyecto,PresuTipoProyectoConstantesFunciones.LABEL_ID));

		if(this.presutipoproyectoConstantesFunciones.mostraridPresuTipoProyecto && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,PresuTipoProyectoConstantesFunciones.LABEL_ID,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.presutipoproyectoConstantesFunciones.resaltaridPresuTipoProyecto,this.presutipoproyectoConstantesFunciones.activaridPresuTipoProyecto,this,true,"idPresuTipoProyecto","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.presutipoproyectoConstantesFunciones.resaltaridPresuTipoProyecto,this.presutipoproyectoConstantesFunciones.activaridPresuTipoProyecto,this,true,"idPresuTipoProyecto","BASICO",false));

			tableColumn.setPreferredWidth(50);
			tableColumn.setWidth(50);
			tableColumn.setMinWidth(50);
			tableColumn.setMaxWidth(50);

			this.iWidthTableDefinicion+=50;
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosPresuTipoProyecto.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosPresuTipoProyecto,PresuTipoProyectoConstantesFunciones.LABEL_IDEMPRESA));

		if(this.presutipoproyectoConstantesFunciones.mostrarid_empresaPresuTipoProyecto && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,PresuTipoProyectoConstantesFunciones.LABEL_IDEMPRESA,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++) && Constantes.ISDEVELOPING) {
			tableColumn.setCellRenderer(new EmpresaTableCell(this.empresasForeignKey,this.presutipoproyectoConstantesFunciones.resaltarid_empresaPresuTipoProyecto,this,this.presutipoproyectoConstantesFunciones.activarid_empresaPresuTipoProyecto));
			tableColumn.setCellEditor(new EmpresaTableCell(this.empresasForeignKey,this.presutipoproyectoConstantesFunciones.resaltarid_empresaPresuTipoProyecto,this,this.presutipoproyectoConstantesFunciones.activarid_empresaPresuTipoProyecto,false,"id_empresaPresuTipoProyecto","GLOBAL"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new PresuTipoProyectoPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosPresuTipoProyecto.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosPresuTipoProyecto,PresuTipoProyectoConstantesFunciones.LABEL_CODIGO));

		if(this.presutipoproyectoConstantesFunciones.mostrarcodigoPresuTipoProyecto && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,PresuTipoProyectoConstantesFunciones.LABEL_CODIGO,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.presutipoproyectoConstantesFunciones.resaltarcodigoPresuTipoProyecto,this.presutipoproyectoConstantesFunciones.activarcodigoPresuTipoProyecto,this,true,"codigoPresuTipoProyecto","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.presutipoproyectoConstantesFunciones.resaltarcodigoPresuTipoProyecto,this.presutipoproyectoConstantesFunciones.activarcodigoPresuTipoProyecto,this,true,"codigoPresuTipoProyecto","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new PresuTipoProyectoPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosPresuTipoProyecto.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosPresuTipoProyecto,PresuTipoProyectoConstantesFunciones.LABEL_NOMBRE));

		if(this.presutipoproyectoConstantesFunciones.mostrarnombrePresuTipoProyecto && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,PresuTipoProyectoConstantesFunciones.LABEL_NOMBRE,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.presutipoproyectoConstantesFunciones.resaltarnombrePresuTipoProyecto,this.presutipoproyectoConstantesFunciones.activarnombrePresuTipoProyecto,this,true,"nombrePresuTipoProyecto","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.presutipoproyectoConstantesFunciones.resaltarnombrePresuTipoProyecto,this.presutipoproyectoConstantesFunciones.activarnombrePresuTipoProyecto,this,true,"nombrePresuTipoProyecto","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new PresuTipoProyectoPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}
			
		} else {
		}			
					
		if(!this.presutipoproyectoSessionBean.getEsGuardarRelacionado()
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
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.presutipoproyectoSessionBean.getEsGuardarRelacionado()));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.presutipoproyectoSessionBean.getEsGuardarRelacionado()));
	
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosPresuTipoProyecto.addColumn(tableColumn);
			
			} else {				
				
				//LO MISMO QUE IF
				
				tableColumn= new TableColumn();
				tableColumn.setIdentifier(sLabelColumnAccion);
				tableColumn.setHeaderValue(sLabelColumnAccion);
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.presutipoproyectoSessionBean.getEsGuardarRelacionado()));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.presutipoproyectoSessionBean.getEsGuardarRelacionado()));
		
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosPresuTipoProyecto.addColumn(tableColumn);				
					
				//ELIMINAR
				if(this.isPermisoEliminarPresuTipoProyecto && this.isPermisoGuardarCambiosPresuTipoProyecto) {
					tableColumn= new TableColumn();
					tableColumn.setIdentifier(Constantes2.S_ELI);
					tableColumn.setHeaderValue(sLabelColumnAccionEli);
					tableColumn.setCellRenderer(new IdTableCell(this,false,true,this.presutipoproyectoSessionBean.getEsGuardarRelacionado()));
					tableColumn.setCellEditor(new IdTableCell(this,false,true,this.presutipoproyectoSessionBean.getEsGuardarRelacionado()));
			
					tableColumn.setPreferredWidth(65); 	 
					tableColumn.setWidth(65); 	 
					tableColumn.setMinWidth(65); 
					tableColumn.setMaxWidth(65);
					
					this.iWidthTableDefinicion+=65;
						
					this.jTableDatosPresuTipoProyecto.addColumn(tableColumn);
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
			
			this.jTableDatosPresuTipoProyecto.addColumn(tableColumn);
			*/
		}
		
		Integer iUltimaColumna=0;//1
		Integer iNuevaPosicionColumna=0;
		
		
		//PERMITE ELIMINAR SIMPLE
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarPresuTipoProyecto && this.isPermisoGuardarCambiosPresuTipoProyecto) {
				iUltimaColumna++;
			}	
		}
		
		//PERMITE EDITAR SIMPLE
		iUltimaColumna++;	
		
				
		
		//MOVIA SELECCIONAR
		//iUltimaColumna++;
		
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarPresuTipoProyecto && this.isPermisoGuardarCambiosPresuTipoProyecto) {
				//REUBICA ELIMINAR SIMPLE
				jTableDatosPresuTipoProyecto.moveColumn(this.jTableDatosPresuTipoProyecto.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3
					
				iUltimaColumna--;
			}
		}
		//REUBICA EDITAR SIMPLE
		jTableDatosPresuTipoProyecto.moveColumn(this.jTableDatosPresuTipoProyecto.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3				
		
		
		
		
		//REUBICABA SELECCIONAR
		/*
		if(iUltimaColumna>1) {
			iUltimaColumna--;
		}
		
		//iNuevaPosicionColumna++;
			
		//REUBICA SELECCIONAR FILA CHECK
		jTableDatosPresuTipoProyecto.moveColumn(this.jTableDatosPresuTipoProyecto.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1		
		*/
		
		//DEFINEN HEADERS
		final TableCellRenderer tableHeaderDefaultCellRenderer = this.jTableDatosPresuTipoProyecto.getTableHeader().getDefaultRenderer();
		
		this.jTableDatosPresuTipoProyecto.getTableHeader().setDefaultRenderer(new TableCellRendererHeader(this.jTableDatosPresuTipoProyecto,tableHeaderDefaultCellRenderer));
	    
		TableColumn column=null;
		
		if(!PresuTipoProyectoJInternalFrame.ISBINDING_MANUAL_TABLA) {
			for(int i = 0; i < this.jTableDatosPresuTipoProyecto.getColumnModel().getColumnCount(); i++) { 
				column = this.jTableDatosPresuTipoProyecto.getColumnModel().getColumn(i); 
				
				if(column.getIdentifier()!=null) {
					//SI SE UTILIZA UN HEADER ES GENERICO
					//column.setHeaderRenderer(new HeaderRenderer(column.getIdentifier().toString()));
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_ELI)) {
					continue;
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_SELECCIONAR)) {
					if(!PresuTipoProyectoJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(50); 	 
						column.setWidth(50); 	 
						column.setMinWidth(50); 	
						column.setMaxWidth(50); 
						
						this.iWidthTableDefinicion+=50;
					}
					
				} else {
					if(!PresuTipoProyectoJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						column.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						
						this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
					}
				}
			}
		}
		
		this.jTableDatosPresuTipoProyecto.setSelectionBackground(FuncionesSwing.getColorSelectedBackground());
		this.jTableDatosPresuTipoProyecto.setSelectionForeground(FuncionesSwing.getColorSelectedForeground());
		
		/*
		this.jTableDatosPresuTipoProyecto.setDefaultRenderer(Object.class, new DefaultTableCellRenderer() {
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
							iSize=presutipoproyectoLogic.getPresuTipoProyectos().size()-1;
								
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							iSize=presutipoproyectos.size()-1;
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
		//this.jTableDatosPresuTipoProyecto.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA);
		
		/*
		column=this.jTableDatosPresuTipoProyecto.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosSistema,Constantes2.S_SELECCIONAR));
		
		if(column!=null) {
			column.setPreferredWidth(25); 	 
			column.setWidth(25); 	 
			column.setMinWidth(25); 	
		}
		*/
			
			//CopyTableToTableTotal();
		} else {
			
			this.actualizarVisualTableDatosPresuTipoProyecto();
			
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
				
				//this.isEsNuevoPresuTipoProyecto=false;
					
				PresuTipoProyectoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.presutipoproyecto,new Object(),this.presutipoproyectoParameterGeneral,this.presutipoproyectoReturnGeneral);
			
				if(this.presutipoproyectoSessionBean.getConGuardarRelaciones()) {
					this.dStart=(double)System.currentTimeMillis();
				}
				
				if(this.jInternalFrameDetalleFormPresuTipoProyecto==null) {
					this.inicializarFormDetalle();
				}
				
				this.inicializarInvalidValues();
				
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosPresuTipoProyecto.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosPresuTipoProyecto.getSelectedRow();	       
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.presutipoproyecto =(PresuTipoProyecto) this.presutipoproyectoLogic.getPresuTipoProyectos().toArray()[this.jTableDatosPresuTipoProyecto.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.presutipoproyecto =(PresuTipoProyecto) this.presutipoproyectos.toArray()[this.jTableDatosPresuTipoProyecto.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//PUEDE SER PARA DUPLICADO O NUEVO TABLA
				
				if(this.presutipoproyecto.getsType().equals("DUPLICADO")
				   || this.presutipoproyecto.getsType().equals("NUEVO_GUARDAR_CAMBIOS")) {
					
					this.isEsNuevoPresuTipoProyecto=true;
				
				} else {
					this.isEsNuevoPresuTipoProyecto=false;	
				}
				
				//CONTROL VERSION ANTERIOR
				/*
				if(!this.presutipoproyectoSessionBean.getEsGuardarRelacionado()) {
					if(this.presutipoproyecto.getId()>=0 && !this.presutipoproyecto.getIsNew()) {						
						this.isEsNuevoPresuTipoProyecto=false;
						
					} else {
						this.isEsNuevoPresuTipoProyecto=true;
					}
					
				} else {
					//CONTROLAR PARA RELACIONADO
				}
				*/
				
				//ESTABLECE SI ES RELACIONADO O NO 
				this.habilitarDeshabilitarTipoMantenimientoPresuTipoProyecto(esRelaciones);						
				
				this.seleccionarPresuTipoProyecto(evt,null,rowIndex);
				
				//SELECCIONA ACTUAL PERO AUN NO SE HA INGRESADO AL SISTEMA
				//SE DESHABILITA POR GUARDAR CAMBIOS
				/*
				if(this.presutipoproyecto.getId()<0) {
					this.isEsNuevoPresuTipoProyecto=true;
				}
				*/
				
				if(!this.esParaBusquedaForeignKey) {
					this.modificarPresuTipoProyecto(evt,rowIndex,esRelaciones);
				} else {
					this.seleccionarPresuTipoProyecto(evt,rowIndex);
				}	
				
				if(this.presutipoproyectoSessionBean.getConGuardarRelaciones()) {
					this.dEnd=(double)System.currentTimeMillis();					
					this.dDif=this.dEnd - this.dStart;
					
					if(Constantes.ISDEVELOPING) {
						System.out.println("Tiempo(ms) Seleccion PresuTipoProyecto: " + this.dDif); 
					}
				}								
				
				PresuTipoProyectoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.presutipoproyecto,new Object(),this.presutipoproyectoParameterGeneral,this.presutipoproyectoReturnGeneral);
				
			} else {
				this.estaModoEliminarGuardarCambios=true;
				
				this.seleccionarPresuTipoProyecto(evt,null,rowIndex);
				
				if(this.permiteMantenimiento(this.presutipoproyecto)) {
					if(this.presutipoproyecto.getId()>0) {
						this.presutipoproyecto.setIsDeleted(true);
						
						this.presutipoproyectosEliminados.add(this.presutipoproyecto);
					}
					
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.presutipoproyectoLogic.getPresuTipoProyectos().remove(this.presutipoproyecto);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.presutipoproyectos.remove(this.presutipoproyecto);				
					}
					
					
					((PresuTipoProyectoModel) this.jTableDatosPresuTipoProyecto.getModel()).fireTableRowsDeleted(rowIndex,rowIndex);
					
					this.actualizarFilaTotales();
					
					this.inicializarActualizarBindingTablaPresuTipoProyecto(false);					
				}								
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException2(this, e,logger,PresuTipoProyectoConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoSeleccionar=false;				
			this.estaModoEliminarGuardarCambios=false;
		}
	}
	
	
	public void seleccionarPresuTipoProyecto(ActionEvent evt,javax.swing.event.ListSelectionEvent evt2,int rowIndex) throws Exception { 
		try {
			//SI PUEDE SER NUEVO Y SELECCIONAR (PARA DUPLICAR Y NUEVO TABLA)
			//if(!this.isEsNuevoPresuTipoProyecto) {
			
			if(this.jInternalFrameDetalleFormPresuTipoProyecto==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosPresuTipoProyecto.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosPresuTipoProyecto.getSelectedRow();	       
				}
				
				//CUANDO SE RECARGA TABLA TAMBIEN SE SELECCIONA PERO CON -1 POR LO QUE SE NECESITA VALIDAR ANTES
				if(intSelectedRow<0) {
					return;
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.presutipoproyecto =(PresuTipoProyecto) this.presutipoproyectoLogic.getPresuTipoProyectos().toArray()[this.jTableDatosPresuTipoProyecto.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.presutipoproyecto =(PresuTipoProyecto) this.presutipoproyectos.toArray()[this.jTableDatosPresuTipoProyecto.convertRowIndexToModel(intSelectedRow)];
				}
				
				if(PresuTipoProyectoJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesObjetoActualToFormularioPresuTipoProyecto(this.presutipoproyecto);
				}
				
				//ARCHITECTURE
				try {
					

					//Empresa
					if(!this.presutipoproyectoConstantesFunciones.cargarid_empresaPresuTipoProyecto || this.presutipoproyectoConstantesFunciones.event_dependid_empresaPresuTipoProyecto) {
						//this.cargarCombosEmpresasForeignKeyLista(" where id="+this.presutipoproyecto.getid_empresa());
									//this.inicializarActualizarBindingPresuTipoProyecto(false,false);
						this.empresasForeignKey=new ArrayList<Empresa>();

						if(presutipoproyecto.getEmpresa()!=null) {
							this.empresasForeignKey.add(presutipoproyecto.getEmpresa());
						}

						this.addItemDefectoCombosForeignKeyEmpresa();
						this.cargarCombosFrameEmpresasForeignKey("Todos");
					}
					this.setActualEmpresaForeignKey(this.presutipoproyecto.getid_empresa(),false,"Formulario");
				} catch(Exception e) {
					throw e;
				}
				
				this.actualizarEstadoCeldasBotonesPresuTipoProyecto("s", this.isGuardarCambiosEnLote, this.isEsMantenimientoRelacionado);
				
				//NO FUNCIONA BINDING PERO SE MANTIENE
				this.inicializarActualizarBindingBotonesPresuTipoProyecto(false) ;
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualPresuTipoProyecto() ;
			//}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PresuTipoProyectoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesObjetoActualToFormularioTodoPresuTipoProyecto(PresuTipoProyecto presutipoproyecto) throws Exception { 
		this.setVariablesObjetoActualToFormularioTodoPresuTipoProyecto(presutipoproyecto,false,"NINGUNO");
	}
	
	public void setVariablesObjetoActualToFormularioTodoPresuTipoProyecto(PresuTipoProyecto presutipoproyecto,Boolean conCargarListasDesdeObjetoActual,String sTipoEvento) throws Exception { 
		this.setVariablesObjetoActualToFormularioPresuTipoProyecto(presutipoproyecto);
		
		if(conCargarListasDesdeObjetoActual) {
			this.setVariablesObjetoActualToListasForeignKeyPresuTipoProyecto(presutipoproyecto,sTipoEvento);
		}
		
		this.setVariablesObjetoActualToFormularioForeignKeyPresuTipoProyecto(presutipoproyecto);
	}
	
	public void setVariablesObjetoActualToFormularioPresuTipoProyecto(PresuTipoProyecto presutipoproyecto) throws Exception { 
		try {			
			Image imageActual=null;
			ImageIcon imageIcon = null;
			
			if(this.jInternalFrameDetalleFormPresuTipoProyecto==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			
			this.jInternalFrameDetalleFormPresuTipoProyecto.jLabelidPresuTipoProyecto.setText(presutipoproyecto.getId().toString());
			this.jInternalFrameDetalleFormPresuTipoProyecto.jTextFieldcodigoPresuTipoProyecto.setText(presutipoproyecto.getcodigo());
			this.jInternalFrameDetalleFormPresuTipoProyecto.jTextAreanombrePresuTipoProyecto.setText(presutipoproyecto.getnombre());
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,PresuTipoProyectoConstantesFunciones.CLASSNAME);
		}
	}
		
	public void actualizarInformacion(String sTipo,PresuTipoProyecto presutipoproyectoLocal) throws Exception {
		this.actualizarInformacion(sTipo,false,presutipoproyectoLocal);
	}	
	
	public void actualizarInformacion(String sTipo,Boolean conParametroObjeto,PresuTipoProyecto presutipoproyectoLocal) throws Exception {
		
		if(!conParametroObjeto) {
			if(!this.getEsControlTabla()) {
				presutipoproyectoLocal=this.presutipoproyecto;
			} else {
				presutipoproyectoLocal=this.presutipoproyectoAnterior;
			}
		}
		
		if(this.permiteMantenimiento(presutipoproyectoLocal)) {
			if(sTipo.equals("EVENTO_CONTROL")) { // || sTipo.equals("EVENTO_NUEVO")
				if(!this.esControlTabla) {
					this.setVariablesFormularioToObjetoActualTodoPresuTipoProyecto(presutipoproyectoLocal,true);
					
					if(presutipoproyectoSessionBean.getConGuardarRelaciones()) {
						this.actualizarRelaciones(presutipoproyectoLocal);
					}
				}
			
			} else if(sTipo.equals("INFO_PADRE")) {
				
				if(this.presutipoproyectoSessionBean.getEsGuardarRelacionado()) {
					this.actualizarRelacionFkPadreActual(presutipoproyectoLocal);
				}
			}
		}
	}
	
	public void setVariablesFormularioToObjetoActualTodoPresuTipoProyecto(PresuTipoProyecto presutipoproyecto,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualPresuTipoProyecto(presutipoproyecto,conColumnasBase);
		this.setVariablesFormularioToObjetoActualForeignKeysPresuTipoProyecto(presutipoproyecto);
	}
	
	public void setVariablesFormularioToObjetoActualPresuTipoProyecto(PresuTipoProyecto presutipoproyecto,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualPresuTipoProyecto(presutipoproyecto,conColumnasBase,true);
	}
	
	public void setVariablesFormularioToObjetoActualPresuTipoProyecto(PresuTipoProyecto presutipoproyecto,Boolean conColumnasBase,Boolean conInicializarInvalidValues) throws Exception { 
		String sMensajeCampoActual="";
		Boolean estaValidado=true;
		try {
			
			if(this.jInternalFrameDetalleFormPresuTipoProyecto==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			if(conInicializarInvalidValues) {
				this.inicializarInvalidValues();
			}
			
			

		try {
			if(this.jInternalFrameDetalleFormPresuTipoProyecto.jLabelidPresuTipoProyecto.getText()==null || this.jInternalFrameDetalleFormPresuTipoProyecto.jLabelidPresuTipoProyecto.getText()=="" || this.jInternalFrameDetalleFormPresuTipoProyecto.jLabelidPresuTipoProyecto.getText()=="Id") {
				this.jInternalFrameDetalleFormPresuTipoProyecto.jLabelidPresuTipoProyecto.setText("0");
			}

			if(conColumnasBase) {presutipoproyecto.setId(Long.parseLong(this.jInternalFrameDetalleFormPresuTipoProyecto.jLabelidPresuTipoProyecto.getText()));}
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+PresuTipoProyectoConstantesFunciones.LABEL_ID+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormPresuTipoProyecto.jLabelIdPresuTipoProyecto,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			presutipoproyecto.setcodigo(this.jInternalFrameDetalleFormPresuTipoProyecto.jTextFieldcodigoPresuTipoProyecto.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+PresuTipoProyectoConstantesFunciones.LABEL_CODIGO+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormPresuTipoProyecto.jLabelcodigoPresuTipoProyecto,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			presutipoproyecto.setnombre(this.jInternalFrameDetalleFormPresuTipoProyecto.jTextAreanombrePresuTipoProyecto.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+PresuTipoProyectoConstantesFunciones.LABEL_NOMBRE+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormPresuTipoProyecto.jLabelnombrePresuTipoProyecto,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}
			
			if(!estaValidado) {
				throw new Exception(sMensajeCampoActual);
			}
		} catch(NumberFormatException e) {
			throw new Exception(sMensajeCampoActual);
			//FuncionesSwing.manageException(this, e,logger,MovimientoInventarioConstantesFunciones.CLASSNAME);
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,PresuTipoProyectoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualPresuTipoProyecto(PresuTipoProyecto presutipoproyectoBean,PresuTipoProyecto presutipoproyecto,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,PresuTipoProyectoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setCopiarVariablesObjetosPresuTipoProyecto(PresuTipoProyecto presutipoproyectoOrigen,PresuTipoProyecto presutipoproyecto,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			if(conColumnasBase) {if(conDefault || (!conDefault && presutipoproyectoOrigen.getId()!=null && !presutipoproyectoOrigen.getId().equals(0L))) {presutipoproyecto.setId(presutipoproyectoOrigen.getId());}}
			if(conDefault || (!conDefault && presutipoproyectoOrigen.getcodigo()!=null && !presutipoproyectoOrigen.getcodigo().equals(""))) {presutipoproyecto.setcodigo(presutipoproyectoOrigen.getcodigo());}
			if(conDefault || (!conDefault && presutipoproyectoOrigen.getnombre()!=null && !presutipoproyectoOrigen.getnombre().equals(""))) {presutipoproyecto.setnombre(presutipoproyectoOrigen.getnombre());}
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,PresuTipoProyectoConstantesFunciones.CLASSNAME);
		}
	}
	
	/*
	public void setVariablesObjetoBeanActualToFormularioPresuTipoProyecto(PresuTipoProyecto presutipoproyecto) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormPresuTipoProyecto.jLabelidPresuTipoProyecto.setText(presutipoproyecto.getId().toString());
			this.jInternalFrameDetalleFormPresuTipoProyecto.jTextFieldcodigoPresuTipoProyecto.setText(presutipoproyecto.getcodigo());
			this.jInternalFrameDetalleFormPresuTipoProyecto.jTextAreanombrePresuTipoProyecto.setText(presutipoproyecto.getnombre());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PresuTipoProyectoConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoBeanActualToFormularioPresuTipoProyecto(PresuTipoProyectoBean presutipoproyectoBean) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormPresuTipoProyecto.jLabelidPresuTipoProyecto.setText(presutipoproyectoBean.getId().toString());
			this.jInternalFrameDetalleFormPresuTipoProyecto.jTextFieldcodigoPresuTipoProyecto.setText(presutipoproyectoBean.getcodigo());
			this.jInternalFrameDetalleFormPresuTipoProyecto.jTextAreanombrePresuTipoProyecto.setText(presutipoproyectoBean.getnombre());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PresuTipoProyectoConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoReturnGeneralToBeanPresuTipoProyecto(PresuTipoProyectoParameterReturnGeneral presutipoproyectoReturnGeneral,PresuTipoProyectoBean presutipoproyectoBean,Boolean conDefault) throws Exception { 
		try {
			PresuTipoProyecto presutipoproyectoLocal=new PresuTipoProyecto();
			
			presutipoproyectoLocal=presutipoproyectoReturnGeneral.getPresuTipoProyecto();
			
			
			if(conColumnasBase) {if(conDefault || (!conDefault && presutipoproyectoLocal.getId()!=null && !presutipoproyectoLocal.getId().equals(0L))) {presutipoproyectoBean.setId(presutipoproyectoLocal.getId());}}
			if(conDefault || (!conDefault && presutipoproyectoLocal.getcodigo()!=null && !presutipoproyectoLocal.getcodigo().equals(""))) {presutipoproyectoBean.setcodigo(presutipoproyectoLocal.getcodigo());}
			if(conDefault || (!conDefault && presutipoproyectoLocal.getnombre()!=null && !presutipoproyectoLocal.getnombre().equals(""))) {presutipoproyectoBean.setnombre(presutipoproyectoLocal.getnombre());}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PresuTipoProyectoConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	@SuppressWarnings("rawtypes")
	public static void setActualComboBoxPresuTipoProyectoGenerico(Long idPresuTipoProyectoSeleccionado,JComboBox jComboBoxPresuTipoProyecto,List<PresuTipoProyecto> presutipoproyectosLocal)throws Exception {
		try {
			PresuTipoProyecto  presutipoproyectoTemp=null;

			for(PresuTipoProyecto presutipoproyectoAux:presutipoproyectosLocal) {
				if(presutipoproyectoAux.getId()!=null && presutipoproyectoAux.getId().equals(idPresuTipoProyectoSeleccionado)) {
					presutipoproyectoTemp=presutipoproyectoAux;
					break;
				}
			}

			jComboBoxPresuTipoProyecto.setSelectedItem(presutipoproyectoTemp);

		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("rawtypes")
	public static void setHotKeysComboBoxPresuTipoProyectoGenerico(JComboBox jComboBoxPresuTipoProyecto,JInternalFrameBase jInternalFrameBase,String sNombreHotKeyAbstractAction,String sTipoBusqueda)throws Exception {
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
				
				jComboBoxPresuTipoProyecto.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxPresuTipoProyecto.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Busqueda"));
				//BUSCAR
				
				
				//ACTUALIZAR
				sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
				keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_ACTUALIZAR");
				
				jComboBoxPresuTipoProyecto.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxPresuTipoProyecto.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Update"));
				//ACTUALIZAR
				
				if(sTipoBusqueda.contains("CON_EVENT_CHANGE")) {
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxPresuTipoProyecto.addFocusListener(new ComboBoxFocusListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
						jComboBoxPresuTipoProyecto.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));						
					}
					
					/*
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxPresuTipoProyecto.addItemListener(new ComboBoxItemListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					} else {
						jComboBoxPresuTipoProyecto.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					}
					*/
				}								
				
				//CON_BUSQUEDA								
				if(sTipoBusqueda.contains("CON_BUSQUEDA")) {
					sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
					keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_BUSQUEDA");
							
					jComboBoxPresuTipoProyecto.getInputMap().put(keyStrokeControl, sKeyStrokeName);
					jComboBoxPresuTipoProyecto.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction));
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
			FuncionesSwing.manageException2(this, e,logger,PresuTipoProyectoConstantesFunciones.CLASSNAME);
		}
	}
	
	public String getDescripcionFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		String sDescripcion="";
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			presutipoproyecto=(PresuTipoProyecto) presutipoproyectoLogic.getPresuTipoProyectos().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			presutipoproyecto =(PresuTipoProyecto) presutipoproyectos.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		if(sTipo.equals("Empresa")) {
			//sDescripcion=this.getActualEmpresaForeignKeyDescripcion((Long)value);
			if(!presutipoproyecto.getIsNew() && !presutipoproyecto.getIsChanged() && !presutipoproyecto.getIsDeleted()) {
				sDescripcion=presutipoproyecto.getempresa_descripcion();
			} else {
				//sDescripcion=this.getActualEmpresaForeignKeyDescripcion((Long)value);
				sDescripcion=presutipoproyecto.getempresa_descripcion();
			}
		}

		
		return sDescripcion;
	}
	
	public Color getColorFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		Color color=Color.WHITE;
		
		PresuTipoProyecto presutipoproyectoRow=new PresuTipoProyecto();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			presutipoproyectoRow=(PresuTipoProyecto) presutipoproyectoLogic.getPresuTipoProyectos().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			presutipoproyectoRow=(PresuTipoProyecto) presutipoproyectos.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		
		return color;
	}
	
	
	
	
	
	
	
	public void refrescarBindingTabla(Boolean blnSoloTabla) {
	}
	
	public void inicializarActualizarBindingBotonesManualPresuTipoProyecto(Boolean esSetControles) {						
		if(esSetControles) {
			this.jButtonNuevoPresuTipoProyecto.setVisible((this.isVisibilidadCeldaNuevoPresuTipoProyecto && this.isPermisoNuevoPresuTipoProyecto));			
			this.jButtonDuplicarPresuTipoProyecto.setVisible((this.isVisibilidadCeldaDuplicarPresuTipoProyecto && this.isPermisoDuplicarPresuTipoProyecto));			
			this.jButtonCopiarPresuTipoProyecto.setVisible((this.isVisibilidadCeldaCopiarPresuTipoProyecto && this.isPermisoCopiarPresuTipoProyecto));
			this.jButtonVerFormPresuTipoProyecto.setVisible((this.isVisibilidadCeldaVerFormPresuTipoProyecto && this.isPermisoVerFormPresuTipoProyecto));
			
			this.jButtonAbrirOrderByPresuTipoProyecto.setVisible((this.isVisibilidadCeldaOrdenPresuTipoProyecto && this.isPermisoOrdenPresuTipoProyecto));			
			
			this.jButtonNuevoRelacionesPresuTipoProyecto.setVisible((this.isVisibilidadCeldaNuevoRelacionesPresuTipoProyecto && this.isPermisoNuevoPresuTipoProyecto));			
			this.jButtonNuevoGuardarCambiosPresuTipoProyecto.setVisible((this.isVisibilidadCeldaNuevoPresuTipoProyecto && this.isPermisoNuevoPresuTipoProyecto && this.isPermisoGuardarCambiosPresuTipoProyecto));
			
			if(this.jInternalFrameDetalleFormPresuTipoProyecto!=null) {
			this.jInternalFrameDetalleFormPresuTipoProyecto.jButtonModificarPresuTipoProyecto.setVisible((this.isVisibilidadCeldaModificarPresuTipoProyecto && this.isPermisoActualizarPresuTipoProyecto));	
			this.jInternalFrameDetalleFormPresuTipoProyecto.jButtonActualizarPresuTipoProyecto.setVisible((this.isVisibilidadCeldaActualizarPresuTipoProyecto && this.isPermisoActualizarPresuTipoProyecto));	
			this.jInternalFrameDetalleFormPresuTipoProyecto.jButtonEliminarPresuTipoProyecto.setVisible((this.isVisibilidadCeldaEliminarPresuTipoProyecto && this.isPermisoEliminarPresuTipoProyecto));
			this.jInternalFrameDetalleFormPresuTipoProyecto.jButtonCancelarPresuTipoProyecto.setVisible(this.isVisibilidadCeldaCancelarPresuTipoProyecto);							
			this.jInternalFrameDetalleFormPresuTipoProyecto.jButtonGuardarCambiosPresuTipoProyecto.setVisible((this.isVisibilidadCeldaGuardarPresuTipoProyecto && this.isPermisoGuardarCambiosPresuTipoProyecto));			
			
			}
						
			this.jButtonGuardarCambiosTablaPresuTipoProyecto.setVisible((this.isVisibilidadCeldaGuardarCambiosPresuTipoProyecto && this.isPermisoGuardarCambiosPresuTipoProyecto));							
			
			//TOOLBAR
			
			this.jButtonNuevoToolBarPresuTipoProyecto.setVisible((this.isVisibilidadCeldaNuevoPresuTipoProyecto && this.isPermisoNuevoPresuTipoProyecto));						
			this.jButtonDuplicarToolBarPresuTipoProyecto.setVisible((this.isVisibilidadCeldaDuplicarPresuTipoProyecto && this.isPermisoDuplicarPresuTipoProyecto));						
			this.jButtonCopiarToolBarPresuTipoProyecto.setVisible((this.isVisibilidadCeldaCopiarPresuTipoProyecto && this.isPermisoCopiarPresuTipoProyecto));			
			this.jButtonVerFormToolBarPresuTipoProyecto.setVisible((this.isVisibilidadCeldaVerFormPresuTipoProyecto && this.isPermisoVerFormPresuTipoProyecto));			
			this.jButtonAbrirOrderByToolBarPresuTipoProyecto.setVisible((this.isVisibilidadCeldaOrdenPresuTipoProyecto && this.isPermisoOrdenPresuTipoProyecto));
			this.jButtonNuevoRelacionesToolBarPresuTipoProyecto.setVisible((this.isVisibilidadCeldaNuevoRelacionesPresuTipoProyecto && this.isPermisoNuevoPresuTipoProyecto));			
			this.jButtonNuevoGuardarCambiosToolBarPresuTipoProyecto.setVisible((this.isVisibilidadCeldaNuevoPresuTipoProyecto && this.isPermisoNuevoPresuTipoProyecto && this.isPermisoGuardarCambiosPresuTipoProyecto));			
			
			if(this.jInternalFrameDetalleFormPresuTipoProyecto!=null) {
			this.jInternalFrameDetalleFormPresuTipoProyecto.jButtonModificarToolBarPresuTipoProyecto.setVisible((this.isVisibilidadCeldaModificarPresuTipoProyecto && this.isPermisoActualizarPresuTipoProyecto));	
			this.jInternalFrameDetalleFormPresuTipoProyecto.jButtonActualizarToolBarPresuTipoProyecto.setVisible((this.isVisibilidadCeldaActualizarPresuTipoProyecto  && this.isPermisoActualizarPresuTipoProyecto));	
			this.jInternalFrameDetalleFormPresuTipoProyecto.jButtonEliminarToolBarPresuTipoProyecto.setVisible((this.isVisibilidadCeldaEliminarPresuTipoProyecto && this.isPermisoEliminarPresuTipoProyecto));
			this.jInternalFrameDetalleFormPresuTipoProyecto.jButtonCancelarToolBarPresuTipoProyecto.setVisible(this.isVisibilidadCeldaCancelarPresuTipoProyecto);				
			this.jInternalFrameDetalleFormPresuTipoProyecto.jButtonGuardarCambiosToolBarPresuTipoProyecto.setVisible((this.isVisibilidadCeldaGuardarPresuTipoProyecto && this.isPermisoGuardarCambiosPresuTipoProyecto));									
			}
			
			this.jButtonGuardarCambiosTablaToolBarPresuTipoProyecto.setVisible((this.isVisibilidadCeldaGuardarCambiosPresuTipoProyecto && this.isPermisoGuardarCambiosPresuTipoProyecto));									
			
			//TOOLBAR
			
			//MENUS
			
			this.jMenuItemNuevoPresuTipoProyecto.setVisible((this.isVisibilidadCeldaNuevoPresuTipoProyecto && this.isPermisoNuevoPresuTipoProyecto));			
			this.jMenuItemDuplicarPresuTipoProyecto.setVisible((this.isVisibilidadCeldaDuplicarPresuTipoProyecto && this.isPermisoDuplicarPresuTipoProyecto));			
			this.jMenuItemCopiarPresuTipoProyecto.setVisible((this.isVisibilidadCeldaCopiarPresuTipoProyecto && this.isPermisoCopiarPresuTipoProyecto));			
			this.jMenuItemVerFormPresuTipoProyecto.setVisible((this.isVisibilidadCeldaVerFormPresuTipoProyecto && this.isPermisoVerFormPresuTipoProyecto));			
			this.jMenuItemAbrirOrderByPresuTipoProyecto.setVisible((this.isVisibilidadCeldaOrdenPresuTipoProyecto && this.isPermisoOrdenPresuTipoProyecto));			
			//this.jMenuItemMostrarOcultarPresuTipoProyecto.setVisible((this.isVisibilidadCeldaOrdenPresuTipoProyecto && this.isPermisoOrdenPresuTipoProyecto));
			this.jMenuItemDetalleAbrirOrderByPresuTipoProyecto.setVisible((this.isVisibilidadCeldaOrdenPresuTipoProyecto && this.isPermisoOrdenPresuTipoProyecto));			
			//this.jMenuItemDetalleMostrarOcultarPresuTipoProyecto.setVisible((this.isVisibilidadCeldaOrdenPresuTipoProyecto && this.isPermisoOrdenPresuTipoProyecto));			
			this.jMenuItemNuevoRelacionesPresuTipoProyecto.setVisible((this.isVisibilidadCeldaNuevoRelacionesPresuTipoProyecto && this.isPermisoNuevoPresuTipoProyecto));			
			this.jMenuItemNuevoGuardarCambiosPresuTipoProyecto.setVisible((this.isVisibilidadCeldaNuevoPresuTipoProyecto && this.isPermisoNuevoPresuTipoProyecto && this.isPermisoGuardarCambiosPresuTipoProyecto));									
			
			if(this.jInternalFrameDetalleFormPresuTipoProyecto!=null) {
			this.jInternalFrameDetalleFormPresuTipoProyecto.jMenuItemModificarPresuTipoProyecto.setVisible((this.isVisibilidadCeldaModificarPresuTipoProyecto && this.isPermisoActualizarPresuTipoProyecto));	
			this.jInternalFrameDetalleFormPresuTipoProyecto.jMenuItemActualizarPresuTipoProyecto.setVisible((this.isVisibilidadCeldaActualizarPresuTipoProyecto && this.isPermisoActualizarPresuTipoProyecto));	
			this.jInternalFrameDetalleFormPresuTipoProyecto.jMenuItemEliminarPresuTipoProyecto.setVisible((this.isVisibilidadCeldaEliminarPresuTipoProyecto && this.isPermisoEliminarPresuTipoProyecto));
			this.jInternalFrameDetalleFormPresuTipoProyecto.jMenuItemCancelarPresuTipoProyecto.setVisible(this.isVisibilidadCeldaCancelarPresuTipoProyecto);				
			}
			
			this.jMenuItemGuardarCambiosPresuTipoProyecto.setVisible((this.isVisibilidadCeldaGuardarPresuTipoProyecto && this.isPermisoGuardarCambiosPresuTipoProyecto));						
			this.jMenuItemGuardarCambiosTablaPresuTipoProyecto.setVisible((this.isVisibilidadCeldaGuardarCambiosPresuTipoProyecto && this.isPermisoGuardarCambiosPresuTipoProyecto));						
			
			//MENUS
			
		} else {
			this.isVisibilidadCeldaNuevoPresuTipoProyecto=this.jButtonNuevoPresuTipoProyecto.isVisible();
			this.isVisibilidadCeldaDuplicarPresuTipoProyecto=this.jButtonDuplicarPresuTipoProyecto.isVisible();
			this.isVisibilidadCeldaCopiarPresuTipoProyecto=this.jButtonCopiarPresuTipoProyecto.isVisible();
			this.isVisibilidadCeldaVerFormPresuTipoProyecto=this.jButtonVerFormPresuTipoProyecto.isVisible();
			
			this.isVisibilidadCeldaOrdenPresuTipoProyecto=this.jButtonAbrirOrderByPresuTipoProyecto.isVisible();			
			
			this.isVisibilidadCeldaNuevoRelacionesPresuTipoProyecto=this.jButtonNuevoRelacionesPresuTipoProyecto.isVisible();
			this.isVisibilidadCeldaModificarPresuTipoProyecto=this.jButtonModificarPresuTipoProyecto.isVisible();
			
			if(this.jInternalFrameDetalleFormPresuTipoProyecto!=null) {
			this.isVisibilidadCeldaActualizarPresuTipoProyecto=this.jInternalFrameDetalleFormPresuTipoProyecto.jButtonActualizarPresuTipoProyecto.isVisible();
			this.isVisibilidadCeldaEliminarPresuTipoProyecto=this.jInternalFrameDetalleFormPresuTipoProyecto.jButtonEliminarPresuTipoProyecto.isVisible();
			this.isVisibilidadCeldaCancelarPresuTipoProyecto=this.jInternalFrameDetalleFormPresuTipoProyecto.jButtonCancelarPresuTipoProyecto.isVisible();
			this.isVisibilidadCeldaGuardarPresuTipoProyecto=this.jInternalFrameDetalleFormPresuTipoProyecto.jButtonGuardarCambiosPresuTipoProyecto.isVisible();			
			}
			
			this.isVisibilidadCeldaGuardarCambiosPresuTipoProyecto=this.jButtonGuardarCambiosTablaPresuTipoProyecto.isVisible();
			
			//TOOLBAR
			
			this.isVisibilidadCeldaNuevoPresuTipoProyecto=this.jButtonNuevoToolBarPresuTipoProyecto.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesPresuTipoProyecto=this.jButtonNuevoRelacionesToolBarPresuTipoProyecto.isVisible();
			
			if(this.jInternalFrameDetalleFormPresuTipoProyecto!=null) {
			this.isVisibilidadCeldaModificarPresuTipoProyecto=this.jInternalFrameDetalleFormPresuTipoProyecto.jButtonModificarToolBarPresuTipoProyecto.isVisible();
			this.isVisibilidadCeldaActualizarPresuTipoProyecto=this.jInternalFrameDetalleFormPresuTipoProyecto.jButtonActualizarToolBarPresuTipoProyecto.isVisible();
			this.isVisibilidadCeldaEliminarPresuTipoProyecto=this.jInternalFrameDetalleFormPresuTipoProyecto.jButtonEliminarToolBarPresuTipoProyecto.isVisible();
			this.isVisibilidadCeldaCancelarPresuTipoProyecto=this.jInternalFrameDetalleFormPresuTipoProyecto.jButtonCancelarToolBarPresuTipoProyecto.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarPresuTipoProyecto=this.jButtonGuardarCambiosToolBarPresuTipoProyecto.isVisible();
			this.isVisibilidadCeldaGuardarCambiosPresuTipoProyecto=this.jButtonGuardarCambiosTablaToolBarPresuTipoProyecto.isVisible();						
			
			//TOOLBAR
			
			//MENUS
			
			this.isVisibilidadCeldaNuevoPresuTipoProyecto=this.jMenuItemNuevoPresuTipoProyecto.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesPresuTipoProyecto=this.jMenuItemNuevoRelacionesPresuTipoProyecto.isVisible();
			
			if(this.jInternalFrameDetalleFormPresuTipoProyecto!=null) {
			this.isVisibilidadCeldaModificarPresuTipoProyecto=this.jInternalFrameDetalleFormPresuTipoProyecto.jMenuItemModificarPresuTipoProyecto.isVisible();
			this.isVisibilidadCeldaActualizarPresuTipoProyecto=this.jInternalFrameDetalleFormPresuTipoProyecto.jMenuItemActualizarPresuTipoProyecto.isVisible();
			this.isVisibilidadCeldaEliminarPresuTipoProyecto=this.jInternalFrameDetalleFormPresuTipoProyecto.jMenuItemEliminarPresuTipoProyecto.isVisible();
			this.isVisibilidadCeldaCancelarPresuTipoProyecto=this.jInternalFrameDetalleFormPresuTipoProyecto.jMenuItemCancelarPresuTipoProyecto.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarPresuTipoProyecto=this.jMenuItemGuardarCambiosPresuTipoProyecto.isVisible();
			this.isVisibilidadCeldaGuardarCambiosPresuTipoProyecto=this.jMenuItemGuardarCambiosTablaPresuTipoProyecto.isVisible();						
			
			//MENUS
		}
	}
	
	public void inicializarActualizarBindingBotonesPresuTipoProyecto(Boolean esInicializar) {
		if(PresuTipoProyectoJInternalFrame.ISBINDING_MANUAL) {			
			if(this.presutipoproyectoSessionBean.getConGuardarRelaciones()) {
				//if(this.presutipoproyectoSessionBean.getEsGuardarRelacionado()) {
				
				this.actualizarEstadoCeldasBotonesConGuardarRelacionesPresuTipoProyecto();
			}
			
			this.inicializarActualizarBindingBotonesManualPresuTipoProyecto(true);
			
		} else {	
		}
	}		
	
	public void inicializarActualizarBindingBotonesPermisosManualPresuTipoProyecto() {
		this.jButtonNuevoPresuTipoProyecto.setVisible(this.isPermisoNuevoPresuTipoProyecto);			
		this.jButtonDuplicarPresuTipoProyecto.setVisible(this.isPermisoDuplicarPresuTipoProyecto);			
		this.jButtonCopiarPresuTipoProyecto.setVisible(this.isPermisoCopiarPresuTipoProyecto);			
		this.jButtonVerFormPresuTipoProyecto.setVisible(this.isPermisoVerFormPresuTipoProyecto);			
		
		this.jButtonAbrirOrderByPresuTipoProyecto.setVisible(this.isPermisoOrdenPresuTipoProyecto);					
		
		this.jButtonNuevoRelacionesPresuTipoProyecto.setVisible(this.isPermisoNuevoPresuTipoProyecto);			
		
		if(this.jInternalFrameDetalleFormPresuTipoProyecto!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormPresuTipoProyecto.jButtonModificarPresuTipoProyecto.setVisible(this.isPermisoActualizarPresuTipoProyecto);	
			this.jInternalFrameDetalleFormPresuTipoProyecto.jButtonActualizarPresuTipoProyecto.setVisible(this.isPermisoActualizarPresuTipoProyecto);	
			this.jInternalFrameDetalleFormPresuTipoProyecto.jButtonEliminarPresuTipoProyecto.setVisible(this.isPermisoEliminarPresuTipoProyecto);
			this.jInternalFrameDetalleFormPresuTipoProyecto.jButtonCancelarPresuTipoProyecto.setVisible(this.isVisibilidadCeldaCancelarPresuTipoProyecto);						
			this.jInternalFrameDetalleFormPresuTipoProyecto.jButtonGuardarCambiosPresuTipoProyecto.setVisible(this.isPermisoGuardarCambiosPresuTipoProyecto);							
		}
		
		this.jButtonGuardarCambiosTablaPresuTipoProyecto.setVisible(this.isPermisoActualizarPresuTipoProyecto);
	}
	
	public void inicializarActualizarBindingBotonesPermisosManualFormDetallePresuTipoProyecto() {
		this.jInternalFrameDetalleFormPresuTipoProyecto.jButtonModificarPresuTipoProyecto.setVisible(this.isPermisoActualizarPresuTipoProyecto);	
		this.jInternalFrameDetalleFormPresuTipoProyecto.jButtonActualizarPresuTipoProyecto.setVisible(this.isPermisoActualizarPresuTipoProyecto);	
		this.jInternalFrameDetalleFormPresuTipoProyecto.jButtonEliminarPresuTipoProyecto.setVisible(this.isPermisoEliminarPresuTipoProyecto);
		this.jInternalFrameDetalleFormPresuTipoProyecto.jButtonCancelarPresuTipoProyecto.setVisible(this.isVisibilidadCeldaCancelarPresuTipoProyecto);							
		this.jInternalFrameDetalleFormPresuTipoProyecto.jButtonGuardarCambiosPresuTipoProyecto.setVisible((this.isVisibilidadCeldaGuardarPresuTipoProyecto && this.isPermisoGuardarCambiosPresuTipoProyecto));			
	}
	
	public void inicializarActualizarBindingBotonesPermisosPresuTipoProyecto() {
		if(PresuTipoProyectoJInternalFrame.ISBINDING_MANUAL) {
			this.inicializarActualizarBindingBotonesPermisosManualPresuTipoProyecto();
		} else {
		}
	}
	
	
	public void refrescarBindingBotonesPresuTipoProyecto() {
	}
	
	public void jTableDatosPresuTipoProyectoListSelectionListener(javax.swing.event.ListSelectionEvent evt) throws Exception { 
		try {
			this.seleccionarPresuTipoProyecto(null,evt,-1);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PresuTipoProyectoConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonidPresuTipoProyectoBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.presutipoproyectoLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosPresuTipoProyecto.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualPresuTipoProyecto(this.getpresutipoproyecto(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysPresuTipoProyecto(this.presutipoproyecto);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.presutipoproyecto =(PresuTipoProyecto) this.presutipoproyectoLogic.getPresuTipoProyectos().toArray()[this.jTableDatosPresuTipoProyecto.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.presutipoproyecto =(PresuTipoProyecto) this.presutipoproyectos.toArray()[this.jTableDatosPresuTipoProyecto.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.presutipoproyecto==null) {
						this.presutipoproyecto = new PresuTipoProyecto();
					}

					this.setVariablesFormularioToObjetoActualPresuTipoProyecto(this.presutipoproyecto,true);
					this.setVariablesFormularioToObjetoActualForeignKeysPresuTipoProyecto(this.presutipoproyecto);
				}

				if(this.presutipoproyecto.getId()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id = "+this.presutipoproyecto.getId().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingPresuTipoProyecto(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.presutipoproyectoLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.presutipoproyectoLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,PresuTipoProyectoConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.presutipoproyectoLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_empresaPresuTipoProyectoUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.presutipoproyectoLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisoempresa=true;

			idTienePermisoempresa=this.tienePermisosUsuarioEnPaginaWebPresuTipoProyecto(EmpresaConstantesFunciones.CLASSNAME);

			if(idTienePermisoempresa) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosPresuTipoProyecto.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosPresuTipoProyecto.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosPresuTipoProyecto.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.presutipoproyecto =(PresuTipoProyecto) this.presutipoproyectoLogic.getPresuTipoProyectos().toArray()[this.jTableDatosPresuTipoProyecto.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.presutipoproyecto =(PresuTipoProyecto) this.presutipoproyectos.toArray()[this.jTableDatosPresuTipoProyecto.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualPresuTipoProyecto(this.getpresutipoproyecto(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysPresuTipoProyecto(this.presutipoproyecto);

				this.empresaBeanSwingJInternalFrame=new EmpresaBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.empresaBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.empresaBeanSwingJInternalFrame.getEmpresaLogic().setConnexion(this.presutipoproyectoLogic.getConnexion());

				if(this.presutipoproyecto.getid_empresa()!=null) {
					this.empresaBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.empresaBeanSwingJInternalFrame.setIdActual(this.presutipoproyecto.getid_empresa());
					this.empresaBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.empresaBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.empresaBeanSwingJInternalFrame.inicializarActualizarBindingTablaEmpresa();
				}

				JInternalFrameBase jinternalFrame =this.empresaBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderPresuTipoProyecto=(TitledBorder)this.jScrollPanelDatosPresuTipoProyecto.getBorder();
				TitledBorder titledBorderempresa=(TitledBorder)this.empresaBeanSwingJInternalFrame.jScrollPanelDatosEmpresa.getBorder();

				titledBorderempresa.setTitle(titledBorderPresuTipoProyecto.getTitle() + " -> Empresa");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.presutipoproyectoLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.presutipoproyectoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,PresuTipoProyectoConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.presutipoproyectoLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_empresaPresuTipoProyectoBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.presutipoproyectoLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosPresuTipoProyecto.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualPresuTipoProyecto(this.getpresutipoproyecto(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysPresuTipoProyecto(this.presutipoproyecto);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.presutipoproyecto =(PresuTipoProyecto) this.presutipoproyectoLogic.getPresuTipoProyectos().toArray()[this.jTableDatosPresuTipoProyecto.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.presutipoproyecto =(PresuTipoProyecto) this.presutipoproyectos.toArray()[this.jTableDatosPresuTipoProyecto.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.presutipoproyecto==null) {
						this.presutipoproyecto = new PresuTipoProyecto();
					}

					this.setVariablesFormularioToObjetoActualPresuTipoProyecto(this.presutipoproyecto,true);
					this.setVariablesFormularioToObjetoActualForeignKeysPresuTipoProyecto(this.presutipoproyecto);
				}

				if(this.presutipoproyecto.getid_empresa()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_empresa = "+this.presutipoproyecto.getid_empresa().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingPresuTipoProyecto(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.presutipoproyectoLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.presutipoproyectoLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,PresuTipoProyectoConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.presutipoproyectoLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtoncodigoPresuTipoProyectoBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.presutipoproyectoLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosPresuTipoProyecto.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualPresuTipoProyecto(this.getpresutipoproyecto(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysPresuTipoProyecto(this.presutipoproyecto);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.presutipoproyecto =(PresuTipoProyecto) this.presutipoproyectoLogic.getPresuTipoProyectos().toArray()[this.jTableDatosPresuTipoProyecto.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.presutipoproyecto =(PresuTipoProyecto) this.presutipoproyectos.toArray()[this.jTableDatosPresuTipoProyecto.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.presutipoproyecto==null) {
						this.presutipoproyecto = new PresuTipoProyecto();
					}

					this.setVariablesFormularioToObjetoActualPresuTipoProyecto(this.presutipoproyecto,true);
					this.setVariablesFormularioToObjetoActualForeignKeysPresuTipoProyecto(this.presutipoproyecto);
				}

				if(this.presutipoproyecto.getcodigo()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where codigo like '%"+this.presutipoproyecto.getcodigo()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingPresuTipoProyecto(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.presutipoproyectoLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.presutipoproyectoLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,PresuTipoProyectoConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.presutipoproyectoLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonnombrePresuTipoProyectoBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.presutipoproyectoLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosPresuTipoProyecto.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualPresuTipoProyecto(this.getpresutipoproyecto(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysPresuTipoProyecto(this.presutipoproyecto);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.presutipoproyecto =(PresuTipoProyecto) this.presutipoproyectoLogic.getPresuTipoProyectos().toArray()[this.jTableDatosPresuTipoProyecto.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.presutipoproyecto =(PresuTipoProyecto) this.presutipoproyectos.toArray()[this.jTableDatosPresuTipoProyecto.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.presutipoproyecto==null) {
						this.presutipoproyecto = new PresuTipoProyecto();
					}

					this.setVariablesFormularioToObjetoActualPresuTipoProyecto(this.presutipoproyecto,true);
					this.setVariablesFormularioToObjetoActualForeignKeysPresuTipoProyecto(this.presutipoproyecto);
				}

				if(this.presutipoproyecto.getnombre()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where nombre like '%"+this.presutipoproyecto.getnombre()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingPresuTipoProyecto(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.presutipoproyectoLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.presutipoproyectoLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,PresuTipoProyectoConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.presutipoproyectoLogic.closeNewConnexionToDeep();
				}

			}
		}

	
	
	public void jButtonBusquedaPorCodigoPresuTipoProyectoActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.presutipoproyectoLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingPresuTipoProyecto(false,false);

			this.getPresuTipoProyectosBusquedaPorCodigo();

			this.inicializarActualizarBindingPresuTipoProyecto(false);

			//if(PresuTipoProyectoBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingPresuTipoProyecto(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.presutipoproyectoLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.presutipoproyectoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,PresuTipoProyectoConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.presutipoproyectoLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonBusquedaPorNombrePresuTipoProyectoActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.presutipoproyectoLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingPresuTipoProyecto(false,false);

			this.getPresuTipoProyectosBusquedaPorNombre();

			this.inicializarActualizarBindingPresuTipoProyecto(false);

			//if(PresuTipoProyectoBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingPresuTipoProyecto(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.presutipoproyectoLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.presutipoproyectoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,PresuTipoProyectoConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.presutipoproyectoLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdEmpresaPresuTipoProyectoActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.presutipoproyectoLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingPresuTipoProyecto(false,false);

			this.getPresuTipoProyectosFK_IdEmpresa();

			this.inicializarActualizarBindingPresuTipoProyecto(false);

			//if(PresuTipoProyectoBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingPresuTipoProyecto(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.presutipoproyectoLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.presutipoproyectoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,PresuTipoProyectoConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.presutipoproyectoLogic.closeNewConnexionToDeep();
			}
		}
	}

	
	public void closingInternalFramePresuTipoProyecto() {
		if(this.jInternalFrameDetalleFormPresuTipoProyecto!=null) {
			
		
		
		}
		
		if(this.jInternalFrameDetalleFormPresuTipoProyecto!=null) {
			this.jInternalFrameDetalleFormPresuTipoProyecto.setVisible(false);	    			
			this.jInternalFrameDetalleFormPresuTipoProyecto.dispose();
			this.jInternalFrameDetalleFormPresuTipoProyecto=null;
		}
		
		
		if(this.jInternalFrameReporteDinamicoPresuTipoProyecto!=null) {
			this.jInternalFrameReporteDinamicoPresuTipoProyecto.setVisible(false);	    			
			this.jInternalFrameReporteDinamicoPresuTipoProyecto.dispose();
			this.jInternalFrameReporteDinamicoPresuTipoProyecto=null;
		}
		
		if(this.jInternalFrameImportacionPresuTipoProyecto!=null) {
			this.jInternalFrameImportacionPresuTipoProyecto.setVisible(false);	    			
			this.jInternalFrameImportacionPresuTipoProyecto.dispose();
			this.jInternalFrameImportacionPresuTipoProyecto=null;
		}		
		
		
		this.setVisible(false);
		this.dispose();
		//this=null;
	}
	
	
	
	public void jButtonActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {			
			this.startProcessPresuTipoProyecto();
			
			PresuTipoProyectoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.presutipoproyecto,new Object(),this.presutipoproyectoParameterGeneral,this.presutipoproyectoReturnGeneral);
			
			
			if(sTipo.equals("NuevoPresuTipoProyecto")) {
				jButtonNuevoPresuTipoProyectoActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarPresuTipoProyecto")) {
				jButtonDuplicarPresuTipoProyectoActionPerformed(evt,false);
			} else if(sTipo.equals("CopiarPresuTipoProyecto")) {
				jButtonCopiarPresuTipoProyectoActionPerformed(evt);
			} else if(sTipo.equals("VerFormPresuTipoProyecto")) {
				jButtonVerFormPresuTipoProyectoActionPerformed(evt);
			} else if(sTipo.equals("NuevoToolBarPresuTipoProyecto")) {
				jButtonNuevoPresuTipoProyectoActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarToolBarPresuTipoProyecto")) {
				jButtonDuplicarPresuTipoProyectoActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemNuevoPresuTipoProyecto")) {
				jButtonNuevoPresuTipoProyectoActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemDuplicarPresuTipoProyecto")) {
				jButtonDuplicarPresuTipoProyectoActionPerformed(evt,false);
			} else if(sTipo.equals("NuevoRelacionesPresuTipoProyecto")) {
				jButtonNuevoPresuTipoProyectoActionPerformed(evt,true);
			} else if(sTipo.equals("NuevoRelacionesToolBarPresuTipoProyecto")) {
				jButtonNuevoPresuTipoProyectoActionPerformed(evt,true);
			} else if(sTipo.equals("MenuItemNuevoRelacionesPresuTipoProyecto")) {
				jButtonNuevoPresuTipoProyectoActionPerformed(evt,true);
			} else if(sTipo.equals("ModificarPresuTipoProyecto")) {
				jButtonModificarPresuTipoProyectoActionPerformed(evt);
			} else if(sTipo.equals("ModificarToolBarPresuTipoProyecto")) {
				jButtonModificarPresuTipoProyectoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemModificarPresuTipoProyecto")) {
				jButtonModificarPresuTipoProyectoActionPerformed(evt);
			} else if(sTipo.equals("ActualizarPresuTipoProyecto")) {
				jButtonActualizarPresuTipoProyectoActionPerformed(evt);
			} else if(sTipo.equals("ActualizarToolBarPresuTipoProyecto")) {
				jButtonActualizarPresuTipoProyectoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemActualizarPresuTipoProyecto")) {
				jButtonActualizarPresuTipoProyectoActionPerformed(evt);
			} else if(sTipo.equals("EliminarPresuTipoProyecto")) {
				jButtonEliminarPresuTipoProyectoActionPerformed(evt);
			} else if(sTipo.equals("EliminarToolBarPresuTipoProyecto")) {
				jButtonEliminarPresuTipoProyectoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemEliminarPresuTipoProyecto")) {
				jButtonEliminarPresuTipoProyectoActionPerformed(evt);
			} else if(sTipo.equals("CancelarPresuTipoProyecto")) {
				jButtonCancelarPresuTipoProyectoActionPerformed(evt);
			} else if(sTipo.equals("CancelarToolBarPresuTipoProyecto")) {
				jButtonCancelarPresuTipoProyectoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCancelarPresuTipoProyecto")) {
				jButtonCancelarPresuTipoProyectoActionPerformed(evt);
			} else if(sTipo.equals("CerrarPresuTipoProyecto")) {
				jButtonCerrarPresuTipoProyectoActionPerformed(evt);
			} else if(sTipo.equals("CerrarToolBarPresuTipoProyecto")) {
				jButtonCerrarPresuTipoProyectoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCerrarPresuTipoProyecto")) {
				jButtonCerrarPresuTipoProyectoActionPerformed(evt);
			} else if(sTipo.equals("MostrarOcultarToolBarPresuTipoProyecto")) {
				jButtonMostrarOcultarPresuTipoProyectoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemDetalleCerrarPresuTipoProyecto")) {
				jButtonCancelarPresuTipoProyectoActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosPresuTipoProyecto")) {
				jButtonGuardarCambiosPresuTipoProyectoActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosToolBarPresuTipoProyecto")) {
				jButtonGuardarCambiosPresuTipoProyectoActionPerformed(evt);
			} else if(sTipo.equals("CopiarToolBarPresuTipoProyecto")) {
				jButtonCopiarPresuTipoProyectoActionPerformed(evt);
			} else if(sTipo.equals("VerFormToolBarPresuTipoProyecto")) {
				jButtonVerFormPresuTipoProyectoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosPresuTipoProyecto")) {
				jButtonGuardarCambiosPresuTipoProyectoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCopiarPresuTipoProyecto")) {
				jButtonCopiarPresuTipoProyectoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemVerFormPresuTipoProyecto")) {
				jButtonVerFormPresuTipoProyectoActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaPresuTipoProyecto")) {
				jButtonGuardarCambiosPresuTipoProyectoActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaToolBarPresuTipoProyecto")) {
				jButtonGuardarCambiosPresuTipoProyectoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosTablaPresuTipoProyecto")) {
				jButtonGuardarCambiosPresuTipoProyectoActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionPresuTipoProyecto")) {
				jButtonRecargarInformacionPresuTipoProyectoActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionToolBarPresuTipoProyecto")) {
				jButtonRecargarInformacionPresuTipoProyectoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemRecargarInformacionPresuTipoProyecto")) {
				jButtonRecargarInformacionPresuTipoProyectoActionPerformed(evt);
			}
			else if(sTipo.equals("AnterioresPresuTipoProyecto")) {
				jButtonAnterioresPresuTipoProyectoActionPerformed(evt);
			} else if(sTipo.equals("AnterioresToolBarPresuTipoProyecto")) {
				jButtonAnterioresPresuTipoProyectoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAnteriorePresuTipoProyecto")) {
				jButtonAnterioresPresuTipoProyectoActionPerformed(evt);
			} else if(sTipo.equals("SiguientesPresuTipoProyecto")) {
				jButtonSiguientesPresuTipoProyectoActionPerformed(evt);
			} else if(sTipo.equals("SiguientesToolBarPresuTipoProyecto")) {
				jButtonSiguientesPresuTipoProyectoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemSiguientesPresuTipoProyecto")) {
				jButtonSiguientesPresuTipoProyectoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAbrirOrderByPresuTipoProyecto") || sTipo.equals("MenuItemDetalleAbrirOrderByPresuTipoProyecto")) {
				jButtonAbrirOrderByPresuTipoProyectoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemMostrarOcultarPresuTipoProyecto") || sTipo.equals("MenuItemDetalleMostrarOcultarPresuTipoProyecto")) {
				jButtonMostrarOcultarPresuTipoProyectoActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosPresuTipoProyecto")) {
				jButtonNuevoGuardarCambiosPresuTipoProyectoActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosToolBarPresuTipoProyecto")) {
				jButtonNuevoGuardarCambiosPresuTipoProyectoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemNuevoGuardarCambiosPresuTipoProyecto")) {
				jButtonNuevoGuardarCambiosPresuTipoProyectoActionPerformed(evt);
			} 
			else if(sTipo.equals("CerrarReporteDinamicoPresuTipoProyecto")) {
				jButtonCerrarReporteDinamicoPresuTipoProyectoActionPerformed(evt);
			} else if(sTipo.equals("GenerarReporteDinamicoPresuTipoProyecto")) {
				jButtonGenerarReporteDinamicoPresuTipoProyectoActionPerformed(evt);
			} else if(sTipo.equals("GenerarExcelReporteDinamicoPresuTipoProyecto")) {
				
				jButtonGenerarExcelReporteDinamicoPresuTipoProyectoActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarImportacionPresuTipoProyecto")) {
				jButtonCerrarImportacionPresuTipoProyectoActionPerformed(evt);
			} else if(sTipo.equals("GenerarImportacionPresuTipoProyecto")) {
				
				jButtonGenerarImportacionPresuTipoProyectoActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirImportacionPresuTipoProyecto")) {
				
				jButtonAbrirImportacionPresuTipoProyectoActionPerformed(evt);
				
			} else if(sTipo.equals("TiposAccionesPresuTipoProyecto")) {
				jComboBoxTiposAccionesPresuTipoProyectoActionListener(evt,false);
			} else if(sTipo.equals("TiposRelacionesPresuTipoProyecto")) {
				jComboBoxTiposRelacionesPresuTipoProyectoActionListener(evt);
			} else if(sTipo.equals("TiposAccionesFormularioPresuTipoProyecto")) {
				jComboBoxTiposAccionesPresuTipoProyectoActionListener(evt,true);
			} else if(sTipo.equals("TiposSeleccionarPresuTipoProyecto")) {
				
				jComboBoxTiposSeleccionarPresuTipoProyectoActionListener(evt);
				
			} else if(sTipo.equals("ValorCampoGeneralPresuTipoProyecto")) {
				jTextFieldValorCampoGeneralPresuTipoProyectoActionListener(evt);
			}
			
			
			else if(sTipo.equals("AbrirOrderByPresuTipoProyecto")) {
				jButtonAbrirOrderByPresuTipoProyectoActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirOrderByToolBarPresuTipoProyecto")) {
				jButtonAbrirOrderByPresuTipoProyectoActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarOrderByPresuTipoProyecto")) {
				jButtonCerrarOrderByPresuTipoProyectoActionPerformed(evt);
			} 
						
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idPresuTipoProyectoBusqueda")) {
				this.jButtonidPresuTipoProyectoBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_empresaPresuTipoProyectoUpdate")) {
				this.jButtonid_empresaPresuTipoProyectoUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_empresaPresuTipoProyectoBusqueda")) {
				this.jButtonid_empresaPresuTipoProyectoBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("codigoPresuTipoProyectoBusqueda")) {
				this.jButtoncodigoPresuTipoProyectoBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombrePresuTipoProyectoBusqueda")) {
				this.jButtonnombrePresuTipoProyectoBusquedaActionPerformed(evt);
			}
			
			
			
			
			else if(sTipo.equals("BusquedaPorCodigoPresuTipoProyecto")) {
				this.jButtonBusquedaPorCodigoPresuTipoProyectoActionPerformed(evt);
			}
			else if(sTipo.equals("BusquedaPorNombrePresuTipoProyecto")) {
				this.jButtonBusquedaPorNombrePresuTipoProyectoActionPerformed(evt);
			}
			
			;
			
			
			PresuTipoProyectoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.presutipoproyecto,new Object(),this.presutipoproyectoParameterGeneral,this.presutipoproyectoReturnGeneral);
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PresuTipoProyectoConstantesFunciones.CLASSNAME);
			
  		} finally {
      		this.finishProcessPresuTipoProyecto();
      	}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaPresuTipoProyectoActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.presutipoproyecto);
				
				this.actualizarInformacion("INFO_PADRE",false,this.presutipoproyecto);
				
				PresuTipoProyectoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.presutipoproyecto,new Object(),this.presutipoproyectoParameterGeneral,this.presutipoproyectoReturnGeneral);
				
				


				
				PresuTipoProyectoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.presutipoproyecto,new Object(),this.presutipoproyectoParameterGeneral,this.presutipoproyectoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(PresuTipoProyecto.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",PresuTipoProyecto.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
				}
				
			} catch(Exception e) {
  				FuncionesSwing.manageException2(this, e,logger,PresuTipoProyectoConstantesFunciones.CLASSNAME);
  			}
    }
	
	public Boolean existeCambioValor(ControlTipo controlTipo,String sTipo) throws Exception {
		Boolean existeCambio=true;
		
		try {
			PresuTipoProyecto presutipoproyectoLocal=null;
			
			if(!this.getEsControlTabla()) {
				presutipoproyectoLocal=this.presutipoproyecto;
			} else {
				presutipoproyectoLocal=this.presutipoproyectoAnterior;
			}
			
			if(controlTipo.equals(ControlTipo.TEXTBOX)) {
				


			}
		
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PresuTipoProyectoConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.presutipoproyecto);
				
				this.actualizarInformacion("INFO_PADRE",false,this.presutipoproyecto);
				
				PresuTipoProyectoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.presutipoproyecto,new Object(),this.presutipoproyectoParameterGeneral,this.presutipoproyectoReturnGeneral);
							
				
				


				
				PresuTipoProyectoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.presutipoproyecto,new Object(),this.presutipoproyectoParameterGeneral,this.presutipoproyectoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(PresuTipoProyecto.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",PresuTipoProyecto.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PresuTipoProyectoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaPresuTipoProyectoActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosPresuTipoProyecto.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.presutipoproyectoAnterior =(PresuTipoProyecto) this.presutipoproyectoLogic.getPresuTipoProyectos().toArray()[this.jTableDatosPresuTipoProyecto.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.presutipoproyectoAnterior =(PresuTipoProyecto) this.presutipoproyectos.toArray()[this.jTableDatosPresuTipoProyecto.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PresuTipoProyectoConstantesFunciones.CLASSNAME);
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
			
			PresuTipoProyectoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.presutipoproyecto,new Object(),this.presutipoproyectoParameterGeneral,this.presutipoproyectoReturnGeneral);
			
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
			
			


			
			PresuTipoProyectoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.presutipoproyecto,new Object(),this.presutipoproyectoParameterGeneral,this.presutipoproyectoReturnGeneral);
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PresuTipoProyectoConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE QUITA ALGUN CARACTER
	public void jTextFieldRemoveUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PresuTipoProyectoConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE INGRESA ALGUN CARACTER
	public void jTextFieldInsertUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PresuTipoProyectoConstantesFunciones.CLASSNAME);
  		}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jFormattedTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaPresuTipoProyectoActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.presutipoproyecto);
				
				this.actualizarInformacion("INFO_PADRE",false,this.presutipoproyecto);
				
				PresuTipoProyectoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.presutipoproyecto,new Object(),this.presutipoproyectoParameterGeneral,this.presutipoproyectoReturnGeneral);
								
						
				


				
				PresuTipoProyectoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.presutipoproyecto,new Object(),this.presutipoproyectoParameterGeneral,this.presutipoproyectoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(PresuTipoProyecto.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",PresuTipoProyecto.class.getName(),sTipo,"DATE",esControlTabla,conIrServidorAplicacionParent,
							id,JFormattedTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PresuTipoProyectoConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.presutipoproyecto);
				
				this.actualizarInformacion("INFO_PADRE",false,this.presutipoproyecto);
				
				PresuTipoProyectoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.presutipoproyecto,new Object(),this.presutipoproyectoParameterGeneral,this.presutipoproyectoReturnGeneral);
								
				
				


				
				PresuTipoProyectoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.presutipoproyecto,new Object(),this.presutipoproyectoParameterGeneral,this.presutipoproyectoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(PresuTipoProyecto.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",PresuTipoProyecto.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PresuTipoProyectoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jFormattedTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaPresuTipoProyectoActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosPresuTipoProyecto.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.presutipoproyectoAnterior =(PresuTipoProyecto) this.presutipoproyectoLogic.getPresuTipoProyectos().toArray()[this.jTableDatosPresuTipoProyecto.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.presutipoproyectoAnterior =(PresuTipoProyecto) this.presutipoproyectos.toArray()[this.jTableDatosPresuTipoProyecto.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PresuTipoProyectoConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusLostGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl() && this.existeCambioValor(ControlTipo.DATE,sTipo)) {
				this.actualizarInformacion("EVENTO_CONTROL",false,this.presutipoproyecto);
				
				this.actualizarInformacion("INFO_PADRE",false,this.presutipoproyecto);
			}	
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PresuTipoProyectoConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaPresuTipoProyectoActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosPresuTipoProyecto.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.presutipoproyectoAnterior =(PresuTipoProyecto) this.presutipoproyectoLogic.getPresuTipoProyectos().toArray()[this.jTableDatosPresuTipoProyecto.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.presutipoproyectoAnterior =(PresuTipoProyecto) this.presutipoproyectos.toArray()[this.jTableDatosPresuTipoProyecto.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PresuTipoProyectoConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaPresuTipoProyectoActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.presutipoproyecto);
			
			this.actualizarInformacion("INFO_PADRE",false,this.presutipoproyecto);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PresuTipoProyectoConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.presutipoproyecto);
				
				this.actualizarInformacion("INFO_PADRE",false,this.presutipoproyecto);
				
				PresuTipoProyectoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.presutipoproyecto,new Object(),this.presutipoproyectoParameterGeneral,this.presutipoproyectoReturnGeneral);
							
				
				


				
				PresuTipoProyectoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.presutipoproyecto,new Object(),this.presutipoproyectoParameterGeneral,this.presutipoproyectoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(PresuTipoProyecto.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",PresuTipoProyecto.class.getName(),sTipo,"TEXTAREA",esControlTabla,conIrServidorAplicacionParent,
							id,jTextArea, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PresuTipoProyectoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaPresuTipoProyectoActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosPresuTipoProyecto.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.presutipoproyectoAnterior =(PresuTipoProyecto) this.presutipoproyectoLogic.getPresuTipoProyectos().toArray()[this.jTableDatosPresuTipoProyecto.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.presutipoproyectoAnterior =(PresuTipoProyecto) this.presutipoproyectos.toArray()[this.jTableDatosPresuTipoProyecto.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PresuTipoProyectoConstantesFunciones.CLASSNAME);
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
			
			PresuTipoProyectoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.presutipoproyecto,new Object(),this.presutipoproyectoParameterGeneral,this.presutipoproyectoReturnGeneral);
			
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
			
			


			
			PresuTipoProyectoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.presutipoproyecto,new Object(),this.presutipoproyectoParameterGeneral,this.presutipoproyectoReturnGeneral);
			
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PresuTipoProyectoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaRemoveUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PresuTipoProyectoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaInsertUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PresuTipoProyectoConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jTextAreaActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaPresuTipoProyectoActual();
			
			this.actualizarInformacion("EVENTO_CONTROL",false,this.presutipoproyecto);
			
			this.actualizarInformacion("INFO_PADRE",false,this.presutipoproyecto);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PresuTipoProyectoConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.presutipoproyecto);
				
				this.actualizarInformacion("INFO_PADRE",false,this.presutipoproyecto);
				
				PresuTipoProyectoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.presutipoproyecto,new Object(),this.presutipoproyectoParameterGeneral,this.presutipoproyectoReturnGeneral);
								
				
				


				
				PresuTipoProyectoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.presutipoproyecto,new Object(),this.presutipoproyectoParameterGeneral,this.presutipoproyectoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(PresuTipoProyecto.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",PresuTipoProyecto.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jLabel, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PresuTipoProyectoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jLabelFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaPresuTipoProyectoActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosPresuTipoProyecto.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.presutipoproyectoAnterior =(PresuTipoProyecto) this.presutipoproyectoLogic.getPresuTipoProyectos().toArray()[this.jTableDatosPresuTipoProyecto.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.presutipoproyectoAnterior =(PresuTipoProyecto) this.presutipoproyectos.toArray()[this.jTableDatosPresuTipoProyecto.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PresuTipoProyectoConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jLabelActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaPresuTipoProyectoActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.presutipoproyecto);
			
			this.actualizarInformacion("INFO_PADRE",false,this.presutipoproyecto);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PresuTipoProyectoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxItemListenerGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaPresuTipoProyectoActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.presutipoproyecto);
				
				this.actualizarInformacion("INFO_PADRE",false,this.presutipoproyecto);
				
				PresuTipoProyectoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.presutipoproyecto,new Object(),this.presutipoproyectoParameterGeneral,this.presutipoproyectoReturnGeneral);
												
				
				if(sTipo.equals("SeleccionarTodosPresuTipoProyecto")) {
					jCheckBoxSeleccionarTodosPresuTipoProyectoItemListener(evt);
				
				} else if(sTipo.equals("SeleccionadosPresuTipoProyecto")) {
					jCheckBoxSeleccionadosPresuTipoProyectoItemListener(evt);
				
				} else if(sTipo.equals("NuevoToolBarPresuTipoProyecto")) {
					
				}
				
				


				
				
				PresuTipoProyectoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.presutipoproyecto,new Object(),this.presutipoproyectoParameterGeneral,this.presutipoproyectoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(PresuTipoProyecto.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",PresuTipoProyecto.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PresuTipoProyectoConstantesFunciones.CLASSNAME);
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
				
				//this.actualizarInformacion("EVENTO_CONTROL",false,this.presutipoproyecto);
				
				//this.actualizarInformacion("INFO_PADRE",false,this.presutipoproyecto);
				
				PresuTipoProyectoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.presutipoproyecto,new Object(),this.presutipoproyectoParameterGeneral,this.presutipoproyectoReturnGeneral);
												
				
				


				
				
				PresuTipoProyectoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.presutipoproyecto,new Object(),this.presutipoproyectoParameterGeneral,this.presutipoproyectoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(PresuTipoProyecto.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",PresuTipoProyecto.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PresuTipoProyectoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaPresuTipoProyectoActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosPresuTipoProyecto.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.presutipoproyectoAnterior =(PresuTipoProyecto) this.presutipoproyectoLogic.getPresuTipoProyectos().toArray()[this.jTableDatosPresuTipoProyecto.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.presutipoproyectoAnterior =(PresuTipoProyecto) this.presutipoproyectos.toArray()[this.jTableDatosPresuTipoProyecto.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PresuTipoProyectoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaPresuTipoProyectoActual();
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.presutipoproyecto);
				
				this.actualizarInformacion("INFO_PADRE",false,this.presutipoproyecto);
				
				PresuTipoProyectoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.presutipoproyecto,new Object(),this.presutipoproyectoParameterGeneral,this.presutipoproyectoReturnGeneral);
				
				
				PresuTipoProyectoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.presutipoproyecto,new Object(),this.presutipoproyectoParameterGeneral,this.presutipoproyectoReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PresuTipoProyectoConstantesFunciones.CLASSNAME);
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
			
			PresuTipoProyectoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.presutipoproyecto,new Object(),this.presutipoproyectoParameterGeneral,this.presutipoproyectoReturnGeneral);
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
			
			


			
			PresuTipoProyectoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.presutipoproyecto,new Object(),this.presutipoproyectoParameterGeneral,this.presutipoproyectoReturnGeneral);
			*/						
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PresuTipoProyectoConstantesFunciones.CLASSNAME);
  		}		
    }
	
	@SuppressWarnings("rawtypes")
	public void jComboBoxItemStateChangedGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if (evt.getStateChange() == ItemEvent.SELECTED && this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaPresuTipoProyectoActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.presutipoproyecto);
				
				this.actualizarInformacion("INFO_PADRE",false,this.presutipoproyecto);
				
				PresuTipoProyectoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.presutipoproyecto,new Object(),this.presutipoproyectoParameterGeneral,this.presutipoproyectoReturnGeneral);
				
				
				String sFinalQueryCombo="";
				
				


				
				PresuTipoProyectoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.presutipoproyecto,new Object(),this.presutipoproyectoParameterGeneral,this.presutipoproyectoReturnGeneral);
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(PresuTipoProyecto.class.getName());
								
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",PresuTipoProyecto.class.getName(),sTipo,"COMBOBOX",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PresuTipoProyectoConstantesFunciones.CLASSNAME);
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
			
				this.actualizarInformacion("EVENTO_CONTROL",false,this.presutipoproyecto);
				
				this.actualizarInformacion("INFO_PADRE",false,this.presutipoproyecto);
				
				PresuTipoProyectoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.presutipoproyecto,new Object(),this.presutipoproyectoParameterGeneral,this.presutipoproyectoReturnGeneral);
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
				
				


				
				PresuTipoProyectoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.presutipoproyecto,new Object(),this.presutipoproyectoParameterGeneral,this.presutipoproyectoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(PresuTipoProyecto.class.getName());
				
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",PresuTipoProyecto.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PresuTipoProyectoConstantesFunciones.CLASSNAME);
  		}
		
		*/
    }
	
	public void jComboBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaPresuTipoProyectoActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosPresuTipoProyecto.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.presutipoproyectoAnterior =(PresuTipoProyecto) this.presutipoproyectoLogic.getPresuTipoProyectos().toArray()[this.jTableDatosPresuTipoProyecto.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.presutipoproyectoAnterior =(PresuTipoProyecto) this.presutipoproyectos.toArray()[this.jTableDatosPresuTipoProyecto.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PresuTipoProyectoConstantesFunciones.CLASSNAME);
  		}
    }		
	
	public void tableValueChangedGeneral(String sTipo,ListSelectionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				PresuTipoProyectoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.presutipoproyecto,new Object(),this.presutipoproyectoParameterGeneral,this.presutipoproyectoReturnGeneral);
				
				if(sTipo.equals("TableDatosSeleccionarPresuTipoProyecto")) {
					//BYDAN_DESHABILITADO
					//try {jTableDatosPresuTipoProyectoListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
					
					//SOLO CUANDO MOUSE ES SOLTADO
					if (!evt.getValueIsAdjusting()) {
						//SELECCIONA FILA A OBJETO ACTUAL
						Integer intSelectedRow = this.jTableDatosPresuTipoProyecto.getSelectedRow();
						
						if(intSelectedRow!=null && intSelectedRow>-1) {
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								this.presutipoproyecto =(PresuTipoProyecto) this.presutipoproyectoLogic.getPresuTipoProyectos().toArray()[this.jTableDatosPresuTipoProyecto.convertRowIndexToModel(intSelectedRow)];
							} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
								this.presutipoproyecto =(PresuTipoProyecto) this.presutipoproyectos.toArray()[this.jTableDatosPresuTipoProyecto.convertRowIndexToModel(intSelectedRow)];
							}
							//ARCHITECTURE
							
							//System.out.println(this.presutipoproyecto);
						}
					}
					
				} else if(sTipo.equals("jButtonCancelarPresuTipoProyecto")) {
				
				}
				
				PresuTipoProyectoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.presutipoproyecto,new Object(),this.presutipoproyectoParameterGeneral,this.presutipoproyectoReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PresuTipoProyectoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void tableMouseAdapterGeneral(String sTipo,MouseEvent evt) { 	  
		try {
			PresuTipoProyectoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.presutipoproyecto,new Object(),this.presutipoproyectoParameterGeneral,this.presutipoproyectoReturnGeneral);
			
			if(sTipo.equals("DatosSeleccionarPresuTipoProyecto")) {
				if (evt.getClickCount() == 2) {
					jButtonIdActionPerformed(null,jTableDatosPresuTipoProyecto.getSelectedRow(),false,false);
				}	
			} else if(sTipo.equals("jButtonCancelarPresuTipoProyecto")) {
			
			}
			
			PresuTipoProyectoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.presutipoproyecto,new Object(),this.presutipoproyectoParameterGeneral,this.presutipoproyectoReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PresuTipoProyectoConstantesFunciones.CLASSNAME);
  		}
    }
	
	;
	
	public void jButtonActionPerformedTecladoGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			this.startProcessPresuTipoProyecto();
			
			PresuTipoProyectoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.presutipoproyecto,new Object(),this.presutipoproyectoParameterGeneral,this.presutipoproyectoReturnGeneral);
			
			if(sTipo.equals("NuevoPresuTipoProyecto")) {
				jButtonNuevoPresuTipoProyectoActionPerformed(evt,false);
				
			} else if(sTipo.equals("DuplicarPresuTipoProyecto")) {
				jButtonDuplicarPresuTipoProyectoActionPerformed(evt,false);
				
			} else if(sTipo.equals("CopiarPresuTipoProyecto")) {
				jButtonCopiarPresuTipoProyectoActionPerformed(evt);
				
			} else if(sTipo.equals("VerFormPresuTipoProyecto")) {
				jButtonVerFormPresuTipoProyectoActionPerformed(evt);
				
			} else if(sTipo.equals("NuevoRelacionesPresuTipoProyecto")) {
				jButtonNuevoPresuTipoProyectoActionPerformed(evt,true);
				
			} else if(sTipo.equals("ModificarPresuTipoProyecto")) {
				jButtonModificarPresuTipoProyectoActionPerformed(evt);
				
			} else if(sTipo.equals("ActualizarPresuTipoProyecto")) {
				jButtonActualizarPresuTipoProyectoActionPerformed(evt);
				
			} else if(sTipo.equals("EliminarPresuTipoProyecto")) {
				jButtonEliminarPresuTipoProyectoActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosTablaPresuTipoProyecto")) {
				jButtonGuardarCambiosPresuTipoProyectoActionPerformed(evt);
				
			} else if(sTipo.equals("CancelarPresuTipoProyecto")) {
				jButtonCancelarPresuTipoProyectoActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarPresuTipoProyecto")) {
				jButtonCerrarPresuTipoProyectoActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosPresuTipoProyecto")) {
				jButtonGuardarCambiosPresuTipoProyectoActionPerformed(evt);
			
			} else if(sTipo.equals("NuevoGuardarCambiosPresuTipoProyecto")) {
				jButtonNuevoGuardarCambiosPresuTipoProyectoActionPerformed(evt);
			
			} else if(sTipo.equals("AbrirOrderByPresuTipoProyecto")) {
				jButtonAbrirOrderByPresuTipoProyectoActionPerformed(evt);
			
			} else if(sTipo.equals("RecargarInformacionPresuTipoProyecto")) {
				jButtonRecargarInformacionPresuTipoProyectoActionPerformed(evt);
			
			} else if(sTipo.equals("AnterioresPresuTipoProyecto")) {
				jButtonAnterioresPresuTipoProyectoActionPerformed(evt);			
			
			}  else if(sTipo.equals("SiguientesPresuTipoProyecto")) {
				jButtonSiguientesPresuTipoProyectoActionPerformed(evt);			
			} 
			
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idPresuTipoProyectoBusqueda")) {
				this.jButtonidPresuTipoProyectoBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_empresaPresuTipoProyectoUpdate")) {
				this.jButtonid_empresaPresuTipoProyectoUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_empresaPresuTipoProyectoBusqueda")) {
				this.jButtonid_empresaPresuTipoProyectoBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("codigoPresuTipoProyectoBusqueda")) {
				this.jButtoncodigoPresuTipoProyectoBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombrePresuTipoProyectoBusqueda")) {
				this.jButtonnombrePresuTipoProyectoBusquedaActionPerformed(evt);
			}
			
			PresuTipoProyectoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.presutipoproyecto,new Object(),this.presutipoproyectoParameterGeneral,this.presutipoproyectoReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PresuTipoProyectoConstantesFunciones.CLASSNAME);
			
  		}  finally {
      		this.finishProcessPresuTipoProyecto();
      	}
    }
	
	public void internalFrameClosingInternalFrameGeneral(String sTipo,InternalFrameEvent evt) { 	  
		try {
			PresuTipoProyectoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.presutipoproyecto,new Object(),this.presutipoproyectoParameterGeneral,this.presutipoproyectoReturnGeneral);
			
			if(sTipo.equals("CloseInternalFramePresuTipoProyecto")) {
				closingInternalFramePresuTipoProyecto();
				
			} else if(sTipo.equals("jButtonCancelarPresuTipoProyecto")) {
				JInternalFrameBase jInternalFrameDetalleFormPresuTipoProyecto = (JInternalFrameBase)evt.getSource();
	            	
	            PresuTipoProyectoBeanSwingJInternalFrame jInternalFrameParent=(PresuTipoProyectoBeanSwingJInternalFrame)jInternalFrameDetalleFormPresuTipoProyecto.getjInternalFrameParent();
	            
				jInternalFrameParent.jButtonCancelarPresuTipoProyectoActionPerformed(null);
			}
			
			PresuTipoProyectoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.presutipoproyecto,new Object(),this.presutipoproyectoParameterGeneral,this.presutipoproyectoReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PresuTipoProyectoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void recargarFormPresuTipoProyecto(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion) throws Exception {
		this.recargarFormPresuTipoProyecto(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,false);
	}
	
	public void recargarFormPresuTipoProyecto(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion,Boolean esControlTabla) throws Exception {
		if(this.permiteRecargarForm && this.permiteMantenimiento(this.presutipoproyecto)) {
			if(!esControlTabla) {
				if(PresuTipoProyectoJInternalFrame.ISBINDING_MANUAL_TABLA) {			
					this.setVariablesFormularioToObjetoActualPresuTipoProyecto(this.presutipoproyecto,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysPresuTipoProyecto(this.presutipoproyecto);			
				}
				
				if(this.presutipoproyectoSessionBean.getEstaModoGuardarRelaciones()) {
					this.setVariablesFormularioRelacionesToObjetoActualPresuTipoProyecto(this.presutipoproyecto,classes);				
				}
			
				if(conIrServidorAplicacion) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {						
						this.presutipoproyectoReturnGeneral=presutipoproyectoLogic.procesarEventosPresuTipoProyectosWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.presutipoproyectoLogic.getPresuTipoProyectos(),this.presutipoproyecto,this.presutipoproyectoParameterGeneral,this.isEsNuevoPresuTipoProyecto,classes);//this.presutipoproyectoLogic.getPresuTipoProyecto()//sTipoGeneral
									
					} else if(Constantes.ISUSAEJBREMOTE) {
									
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE
					
					//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					//this.setVariablesObjetoReturnGeneralToBeanPresuTipoProyecto(this.presutipoproyectoReturnGeneral,this.presutipoproyectoBean,false);
						
					//ACTUALIZA VARIABLES RELACIONES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					if(this.presutipoproyectoSessionBean.getEstaModoGuardarRelaciones()) {
						//this.setVariablesRelacionesObjetoReturnGeneralToBeanPresuTipoProyecto(classes,this.presutipoproyectoReturnGeneral,this.presutipoproyectoBean,false);
					}
						
					if(this.presutipoproyectoReturnGeneral.getConRecargarPropiedades()) {
						//INICIALIZA VARIABLES COMBOS NORMALES (FK)
						this.setVariablesObjetoActualToFormularioForeignKeyPresuTipoProyecto(this.presutipoproyectoReturnGeneral.getPresuTipoProyecto());
							
						//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
						this.setVariablesObjetoActualToFormularioPresuTipoProyecto(this.presutipoproyectoReturnGeneral.getPresuTipoProyecto());	
					}
						
					if(this.presutipoproyectoReturnGeneral.getConRecargarRelaciones()) {
						//INICIALIZA VARIABLES RELACIONES A FORMULARIO
						this.setVariablesRelacionesObjetoActualToFormularioPresuTipoProyecto(this.presutipoproyectoReturnGeneral.getPresuTipoProyecto(),classes);//this.presutipoproyectoBean);	
					}									
					
				} else {				
					//INICIALIZA VARIABLES RELACIONES A FORMULARIO
					this.setVariablesRelacionesObjetoActualToFormularioPresuTipoProyecto(this.presutipoproyecto,classes);//this.presutipoproyectoBean);									
				}
			
				if(PresuTipoProyectoJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesFormularioToObjetoActualPresuTipoProyecto(this.presutipoproyecto,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysPresuTipoProyecto(this.presutipoproyecto);				
				}
				
			} else {
				
				if(((controlTipo.equals(ControlTipo.TEXTBOX) || controlTipo.equals(ControlTipo.DATE)
					|| controlTipo.equals(ControlTipo.TEXTAREA) || controlTipo.equals(ControlTipo.COMBOBOX)
					)				
					&& eventoTipo.equals(EventoTipo.CHANGE)
					)
					
					|| (controlTipo.equals(ControlTipo.CHECKBOX) && eventoTipo.equals(EventoTipo.CLIC))
					
				) { // && sTipoGeneral.equals("TEXTBOX")
					
					if(this.presutipoproyectoAnterior!=null) {
						this.presutipoproyecto=this.presutipoproyectoAnterior;
					}
				}
				
				if(conIrServidorAplicacion) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {						
						this.presutipoproyectoReturnGeneral=presutipoproyectoLogic.procesarEventosPresuTipoProyectosWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.presutipoproyectoLogic.getPresuTipoProyectos(),this.presutipoproyecto,this.presutipoproyectoParameterGeneral,this.isEsNuevoPresuTipoProyecto,classes);//this.presutipoproyectoLogic.getPresuTipoProyecto()//sTipoGeneral
									
					} else if(Constantes.ISUSAEJBREMOTE) {
									
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.presutipoproyectoSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.presutipoproyectoSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(this.presutipoproyectoReturnGeneral.getPresuTipoProyecto(),presutipoproyectoLogic.getPresuTipoProyectos());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(this.presutipoproyectoReturnGeneral.getPresuTipoProyecto(),this.presutipoproyectos);
				}
				//ARCHITECTURE
				
				//this.jTableDatosPresuTipoProyecto.repaint();
				
				//((AbstractTableModel) this.jTableDatosPresuTipoProyecto.getModel()).fireTableDataChanged();
				
				this.actualizarVisualTableDatosPresuTipoProyecto();
			}
		}
	}
	
	public void actualizarVisualTableDatosPresuTipoProyecto() throws Exception {
		
		PresuTipoProyectoModel presutipoproyectoModel=(PresuTipoProyectoModel)this.jTableDatosPresuTipoProyecto.getModel();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			presutipoproyectoModel.presutipoproyectos=this.presutipoproyectoLogic.getPresuTipoProyectos();
		
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
			presutipoproyectoModel.presutipoproyectos=this.presutipoproyectos;
		}
		
		
		((PresuTipoProyectoModel) this.jTableDatosPresuTipoProyecto.getModel()).fireTableDataChanged();
	}
	
	public void actualizarVisualTableDatosEventosVistaPresuTipoProyecto() throws Exception {
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.actualizarLista(this.getpresutipoproyectoAnterior(),this.presutipoproyectoLogic.getPresuTipoProyectos());
					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			this.actualizarLista(this.getpresutipoproyectoAnterior(),this.presutipoproyectos);
		}
		//ARCHITECTURE
						
		this.actualizarFilaTotales();
						
		this.actualizarVisualTableDatosPresuTipoProyecto();	
	}
	
	public void setVariablesRelacionesObjetoActualToFormularioPresuTipoProyecto(PresuTipoProyecto presutipoproyecto,ArrayList<Classe> classes) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PresuTipoProyectoConstantesFunciones.CLASSNAME);
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
										
				PresuTipoProyectoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.presutipoproyecto,new Object(),generalEntityParameterGeneral,this.presutipoproyectoReturnGeneral);
				
				ArrayList<Classe> classes=new ArrayList<Classe>();
				
				for(String sClasse:arrClasses) {
					if(sClasse.equals("TODOS")) {
						conTodasRelaciones=true;
						break;
					}
				}
				
				if(this.presutipoproyectoSessionBean.getConGuardarRelaciones()) {
					if(conTodasRelaciones) {
						classes=PresuTipoProyectoConstantesFunciones.getClassesRelationshipsOfPresuTipoProyecto(new ArrayList<Classe>(),DeepLoadType.NONE);
					} else {
						classes=PresuTipoProyectoConstantesFunciones.getClassesRelationshipsFromStringsOfPresuTipoProyecto(arrClasses,DeepLoadType.NONE);
					}
				}
	
				this.classesActual=new ArrayList<Classe>();
				this.classesActual.addAll(classes);
	
				this.recargarFormPresuTipoProyecto(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,esControlTabla);
										
				PresuTipoProyectoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.presutipoproyecto,new Object(),generalEntityParameterGeneral,this.presutipoproyectoReturnGeneral);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PresuTipoProyectoConstantesFunciones.CLASSNAME);
  		}
    }
	
	/*
	public void setVariablesRelacionesObjetoBeanActualToFormularioPresuTipoProyecto(PresuTipoProyectoBean presutipoproyectoBean) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PresuTipoProyectoConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesRelacionesObjetoReturnGeneralToBeanPresuTipoProyecto(ArrayList<Classe> classes,PresuTipoProyectoReturnGeneral presutipoproyectoReturnGeneral,PresuTipoProyectoBean presutipoproyectoBean,Boolean conDefault) throws Exception {
		
	}
	*/
	
	public void setVariablesFormularioRelacionesToObjetoActualPresuTipoProyecto(PresuTipoProyecto presutipoproyecto,ArrayList<Classe> classes) throws Exception {
		
	}
	
	public Boolean permiteManejarEventosControl() {
		Boolean permite=true;				
		
		if(this.estaModoNuevo || this.estaModoSeleccionar || this.estaModoEliminarGuardarCambios) {
			permite=false;
			
		} 
		
		//NO DEBE MEZCLARSE CONCEPTOS
		/*	
		if(!paraTabla && !this.permiteMantenimiento(this.presutipoproyecto)) {
			System.out.println("ERROR:EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES");
				
			//JOptionPane.showMessageDialog(this,"EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES","EVENTO",JOptionPane.ERROR_MESSAGE);			
		}
		*/
		
		return permite;
	}
	
	public void inicializarFormDetalle() throws Exception {
		
		this.jInternalFrameDetalleFormPresuTipoProyecto = new PresuTipoProyectoDetalleFormJInternalFrame(jDesktopPane,this.presutipoproyectoSessionBean.getConGuardarRelaciones(),this.presutipoproyectoSessionBean.getEsGuardarRelacionado(),this.cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		this.jDesktopPane.add(this.jInternalFrameDetalleFormPresuTipoProyecto);
		this.jInternalFrameDetalleFormPresuTipoProyecto.setVisible(false);
		this.jInternalFrameDetalleFormPresuTipoProyecto.setSelected(false);						
		
		this.jInternalFrameDetalleFormPresuTipoProyecto.setJInternalFrameParent(this);
		
		this.jInternalFrameDetalleFormPresuTipoProyecto.presutipoproyectoLogic=this.presutipoproyectoLogic;
		
		this.cargarCombosFrameForeignKeyPresuTipoProyecto("Formulario");
		
		this.inicializarActualizarBindingBotonesPermisosManualFormDetallePresuTipoProyecto();
		this.inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetallePresuTipoProyecto();
		
		this.initActionsFormDetalle();		
		
		this.initActionsCombosTodosForeignKeyPresuTipoProyecto("Formulario");
		
		//TALVEZ conSetVariablesGlobales COMO if() 
		this.setVariablesGlobalesCombosForeignKeyPresuTipoProyecto();
		
		this.cargarMenuRelaciones();
		
	}
	
	public void initActionsFormDetalle() {	
		
		this.jInternalFrameDetalleFormPresuTipoProyecto.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarPresuTipoProyecto"));
		
		this.jInternalFrameDetalleFormPresuTipoProyecto.jButtonModificarPresuTipoProyecto.addActionListener(new ButtonActionListener(this,"ModificarPresuTipoProyecto"));

		
		this.jInternalFrameDetalleFormPresuTipoProyecto.jButtonModificarToolBarPresuTipoProyecto.addActionListener(new ButtonActionListener(this,"ModificarToolBarPresuTipoProyecto"));
					
		this.jInternalFrameDetalleFormPresuTipoProyecto.jMenuItemModificarPresuTipoProyecto.addActionListener(new ButtonActionListener(this,"MenuItemModificarPresuTipoProyecto"));		
		
		
		
		this.jInternalFrameDetalleFormPresuTipoProyecto.jButtonActualizarPresuTipoProyecto.addActionListener (new ButtonActionListener(this,"ActualizarPresuTipoProyecto"));
		
		
		this.jInternalFrameDetalleFormPresuTipoProyecto.jButtonActualizarToolBarPresuTipoProyecto.addActionListener(new ButtonActionListener(this,"ActualizarToolBarPresuTipoProyecto"));
						
		this.jInternalFrameDetalleFormPresuTipoProyecto.jMenuItemActualizarPresuTipoProyecto.addActionListener (new ButtonActionListener(this,"MenuItemActualizarPresuTipoProyecto"));		
		
		
		
		this.jInternalFrameDetalleFormPresuTipoProyecto.jButtonEliminarPresuTipoProyecto.addActionListener (new ButtonActionListener(this,"EliminarPresuTipoProyecto"));
		
		
		this.jInternalFrameDetalleFormPresuTipoProyecto.jButtonEliminarToolBarPresuTipoProyecto.addActionListener (new ButtonActionListener(this,"EliminarToolBarPresuTipoProyecto"));
								
		this.jInternalFrameDetalleFormPresuTipoProyecto.jMenuItemEliminarPresuTipoProyecto.addActionListener (new ButtonActionListener(this,"MenuItemEliminarPresuTipoProyecto"));		
		
		
		
		this.jInternalFrameDetalleFormPresuTipoProyecto.jButtonCancelarPresuTipoProyecto.addActionListener (new ButtonActionListener(this,"CancelarPresuTipoProyecto"));
		
		
		this.jInternalFrameDetalleFormPresuTipoProyecto.jButtonCancelarToolBarPresuTipoProyecto.addActionListener (new ButtonActionListener(this,"CancelarToolBarPresuTipoProyecto"));
					
		this.jInternalFrameDetalleFormPresuTipoProyecto.jMenuItemCancelarPresuTipoProyecto.addActionListener (new ButtonActionListener(this,"MenuItemCancelarPresuTipoProyecto"));		
		
		
		
		
		
		this.jInternalFrameDetalleFormPresuTipoProyecto.jMenuItemDetalleCerrarPresuTipoProyecto.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarPresuTipoProyecto"));		
		
		
		
		this.jInternalFrameDetalleFormPresuTipoProyecto.jButtonGuardarCambiosToolBarPresuTipoProyecto.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarPresuTipoProyecto"));
		
		
		
		this.jInternalFrameDetalleFormPresuTipoProyecto.jButtonGuardarCambiosToolBarPresuTipoProyecto.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarPresuTipoProyecto"));
		
		
		
		this.jInternalFrameDetalleFormPresuTipoProyecto.jComboBoxTiposAccionesFormularioPresuTipoProyecto.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioPresuTipoProyecto"));
		
		
				
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPresuTipoProyecto.jButtonidPresuTipoProyectoBusqueda.addActionListener(new ButtonActionListener(this,"idPresuTipoProyectoBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormPresuTipoProyecto.jButtonid_empresaPresuTipoProyectoUpdate.addActionListener(new ButtonActionListener(this,"id_empresaPresuTipoProyectoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPresuTipoProyecto.jButtonid_empresaPresuTipoProyectoBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaPresuTipoProyectoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPresuTipoProyecto.jButtoncodigoPresuTipoProyectoBusqueda.addActionListener(new ButtonActionListener(this,"codigoPresuTipoProyectoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPresuTipoProyecto.jButtonnombrePresuTipoProyectoBusqueda.addActionListener(new ButtonActionListener(this,"nombrePresuTipoProyectoBusqueda"));
		
		
		;

		//TABBED PANE RELACIONES
		this.jInternalFrameDetalleFormPresuTipoProyecto.jTabbedPaneRelacionesPresuTipoProyecto.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesPresuTipoProyecto"));
		
		;		
		//TABBED PANE RELACIONES FIN(EXTRA TAB)	
	}
	
	public void initActions() {				
		this.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"CloseInternalFramePresuTipoProyecto"));
		
		if(this.jInternalFrameDetalleFormPresuTipoProyecto!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormPresuTipoProyecto.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarPresuTipoProyecto"));
		}
		
		this.jTableDatosPresuTipoProyecto.getSelectionModel().addListSelectionListener(new TableListSelectionListener(this,"TableDatosSeleccionarPresuTipoProyecto"));
		
		this.jTableDatosPresuTipoProyecto.addMouseListener(new TableMouseAdapter(this,"DatosSeleccionarPresuTipoProyecto"));
		
		this.jButtonNuevoPresuTipoProyecto.addActionListener(new ButtonActionListener(this,"NuevoPresuTipoProyecto"));
		
		this.jButtonDuplicarPresuTipoProyecto.addActionListener(new ButtonActionListener(this,"DuplicarPresuTipoProyecto"));
		
		this.jButtonCopiarPresuTipoProyecto.addActionListener(new ButtonActionListener(this,"CopiarPresuTipoProyecto"));
		
		this.jButtonVerFormPresuTipoProyecto.addActionListener(new ButtonActionListener(this,"VerFormPresuTipoProyecto"));
		
		
		this.jButtonNuevoToolBarPresuTipoProyecto.addActionListener(new ButtonActionListener(this,"NuevoToolBarPresuTipoProyecto"));
			
		this.jButtonDuplicarToolBarPresuTipoProyecto.addActionListener(new ButtonActionListener(this,"DuplicarToolBarPresuTipoProyecto"));
			
		this.jMenuItemNuevoPresuTipoProyecto.addActionListener (new ButtonActionListener(this,"MenuItemNuevoPresuTipoProyecto"));
			
		this.jMenuItemDuplicarPresuTipoProyecto.addActionListener (new ButtonActionListener(this,"MenuItemDuplicarPresuTipoProyecto"));		
		
		
		this.jButtonNuevoRelacionesPresuTipoProyecto.addActionListener (new ButtonActionListener(this,"NuevoRelacionesPresuTipoProyecto"));
		
		
		this.jButtonNuevoRelacionesToolBarPresuTipoProyecto.addActionListener(new ButtonActionListener(this,"NuevoRelacionesToolBarPresuTipoProyecto"));
			
		this.jMenuItemNuevoRelacionesPresuTipoProyecto.addActionListener(new ButtonActionListener(this,"MenuItemNuevoRelacionesPresuTipoProyecto"));		
		
		
		if(this.jInternalFrameDetalleFormPresuTipoProyecto!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormPresuTipoProyecto.jButtonModificarPresuTipoProyecto.addActionListener(new ButtonActionListener(this,"ModificarPresuTipoProyecto"));
		}
		
		
		if(this.jInternalFrameDetalleFormPresuTipoProyecto!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormPresuTipoProyecto.jButtonModificarToolBarPresuTipoProyecto.addActionListener(new ButtonActionListener(this,"ModificarToolBarPresuTipoProyecto"));
			
			this.jInternalFrameDetalleFormPresuTipoProyecto.jMenuItemModificarPresuTipoProyecto.addActionListener(new ButtonActionListener(this,"MenuItemModificarPresuTipoProyecto"));		
		}
		
		
		if(this.jInternalFrameDetalleFormPresuTipoProyecto!=null) { //if(this.conCargarFormDetalle) {			
			this.jInternalFrameDetalleFormPresuTipoProyecto.jButtonActualizarPresuTipoProyecto.addActionListener (new ButtonActionListener(this,"ActualizarPresuTipoProyecto"));
		}
		
		
		if(this.jInternalFrameDetalleFormPresuTipoProyecto!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormPresuTipoProyecto.jButtonActualizarToolBarPresuTipoProyecto.addActionListener(new ButtonActionListener(this,"ActualizarToolBarPresuTipoProyecto"));
				
			this.jInternalFrameDetalleFormPresuTipoProyecto.jMenuItemActualizarPresuTipoProyecto.addActionListener (new ButtonActionListener(this,"MenuItemActualizarPresuTipoProyecto"));		
		}
		
		
		if(this.jInternalFrameDetalleFormPresuTipoProyecto!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormPresuTipoProyecto.jButtonEliminarPresuTipoProyecto.addActionListener (new ButtonActionListener(this,"EliminarPresuTipoProyecto"));
		}
		
		
		if(this.jInternalFrameDetalleFormPresuTipoProyecto!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormPresuTipoProyecto.jButtonEliminarToolBarPresuTipoProyecto.addActionListener (new ButtonActionListener(this,"EliminarToolBarPresuTipoProyecto"));
						
			this.jInternalFrameDetalleFormPresuTipoProyecto.jMenuItemEliminarPresuTipoProyecto.addActionListener (new ButtonActionListener(this,"MenuItemEliminarPresuTipoProyecto"));		
		}
		
		
		if(this.jInternalFrameDetalleFormPresuTipoProyecto!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormPresuTipoProyecto.jButtonCancelarPresuTipoProyecto.addActionListener (new ButtonActionListener(this,"CancelarPresuTipoProyecto"));
		}
		
		
		if(this.jInternalFrameDetalleFormPresuTipoProyecto!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormPresuTipoProyecto.jButtonCancelarToolBarPresuTipoProyecto.addActionListener (new ButtonActionListener(this,"CancelarToolBarPresuTipoProyecto"));
			
			this.jInternalFrameDetalleFormPresuTipoProyecto.jMenuItemCancelarPresuTipoProyecto.addActionListener (new ButtonActionListener(this,"MenuItemCancelarPresuTipoProyecto"));		
		}
		
		this.jButtonMostrarOcultarTablaToolBarPresuTipoProyecto.addActionListener (new ButtonActionListener(this,"MostrarOcultarToolBarPresuTipoProyecto"));		
		
		
		this.jButtonCerrarPresuTipoProyecto.addActionListener (new ButtonActionListener(this,"CerrarPresuTipoProyecto"));
		
		
		this.jButtonCerrarToolBarPresuTipoProyecto.addActionListener (new ButtonActionListener(this,"CerrarToolBarPresuTipoProyecto"));
			
		this.jMenuItemCerrarPresuTipoProyecto.addActionListener (new ButtonActionListener(this,"MenuItemCerrarPresuTipoProyecto"));
			
		if(this.jInternalFrameDetalleFormPresuTipoProyecto!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormPresuTipoProyecto.jMenuItemDetalleCerrarPresuTipoProyecto.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarPresuTipoProyecto"));		
		}
		
		
		if(this.jInternalFrameDetalleFormPresuTipoProyecto!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormPresuTipoProyecto.jButtonGuardarCambiosPresuTipoProyecto.addActionListener (new ButtonActionListener(this,"GuardarCambiosPresuTipoProyecto"));
		}
		
		
		if(this.jInternalFrameDetalleFormPresuTipoProyecto!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormPresuTipoProyecto.jButtonGuardarCambiosToolBarPresuTipoProyecto.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarPresuTipoProyecto"));
		}
		
		this.jButtonCopiarToolBarPresuTipoProyecto.addActionListener (new ButtonActionListener(this,"CopiarToolBarPresuTipoProyecto"));
			
		this.jButtonVerFormToolBarPresuTipoProyecto.addActionListener (new ButtonActionListener(this,"VerFormToolBarPresuTipoProyecto"));
		
		this.jMenuItemGuardarCambiosPresuTipoProyecto.addActionListener (new ButtonActionListener(this,"MenuItemGuardarCambiosPresuTipoProyecto"));
			
		this.jMenuItemCopiarPresuTipoProyecto.addActionListener (new ButtonActionListener(this,"MenuItemCopiarPresuTipoProyecto"));		
		
		this.jMenuItemVerFormPresuTipoProyecto.addActionListener (new ButtonActionListener(this,"MenuItemVerFormPresuTipoProyecto"));		
		
		
		this.jButtonGuardarCambiosTablaPresuTipoProyecto.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaPresuTipoProyecto"));
		
		
		this.jButtonGuardarCambiosTablaToolBarPresuTipoProyecto.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaToolBarPresuTipoProyecto"));
			
		this.jMenuItemGuardarCambiosTablaPresuTipoProyecto.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaPresuTipoProyecto"));		
		
		
		
		this.jButtonRecargarInformacionPresuTipoProyecto.addActionListener (new ButtonActionListener(this,"RecargarInformacionPresuTipoProyecto"));
					
		this.jButtonRecargarInformacionToolBarPresuTipoProyecto.addActionListener (new ButtonActionListener(this,"RecargarInformacionToolBarPresuTipoProyecto"));
		
		this.jMenuItemRecargarInformacionPresuTipoProyecto.addActionListener (new ButtonActionListener(this,"MenuItemRecargarInformacionPresuTipoProyecto"));		
		
		
		
		this.jButtonAnterioresPresuTipoProyecto.addActionListener (new ButtonActionListener(this,"AnterioresPresuTipoProyecto"));
		
		
		this.jButtonAnterioresToolBarPresuTipoProyecto.addActionListener (new ButtonActionListener(this,"AnterioresToolBarPresuTipoProyecto"));
		
		this.jMenuItemAnterioresPresuTipoProyecto.addActionListener (new ButtonActionListener(this,"MenuItemAnterioresPresuTipoProyecto"));		
		
		
		this.jButtonSiguientesPresuTipoProyecto.addActionListener (new ButtonActionListener(this,"SiguientesPresuTipoProyecto"));
		
		
		this.jButtonSiguientesToolBarPresuTipoProyecto.addActionListener (new ButtonActionListener(this,"SiguientesToolBarPresuTipoProyecto"));
			
		this.jMenuItemSiguientesPresuTipoProyecto.addActionListener (new ButtonActionListener(this,"MenuItemSiguientesPresuTipoProyecto"));
			
		this.jMenuItemAbrirOrderByPresuTipoProyecto.addActionListener (new ButtonActionListener(this,"MenuItemAbrirOrderByPresuTipoProyecto"));
			
		this.jMenuItemMostrarOcultarPresuTipoProyecto.addActionListener (new ButtonActionListener(this,"MenuItemMostrarOcultarPresuTipoProyecto"));
			
		this.jMenuItemDetalleAbrirOrderByPresuTipoProyecto.addActionListener (new ButtonActionListener(this,"MenuItemDetalleAbrirOrderByPresuTipoProyecto"));
			
		this.jMenuItemDetalleMostarOcultarPresuTipoProyecto.addActionListener (new ButtonActionListener(this,"MenuItemDetalleMostrarOcultarPresuTipoProyecto"));		
		
		
		this.jButtonNuevoGuardarCambiosPresuTipoProyecto.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosPresuTipoProyecto"));
		
		
		this.jButtonNuevoGuardarCambiosToolBarPresuTipoProyecto.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosToolBarPresuTipoProyecto"));
			
		this.jMenuItemNuevoGuardarCambiosPresuTipoProyecto.addActionListener (new ButtonActionListener(this,"MenuItemNuevoGuardarCambiosPresuTipoProyecto"));		
		
		
		
		//SELECCIONAR TODOS
		
		this.jCheckBoxSeleccionarTodosPresuTipoProyecto.addItemListener(new CheckBoxItemListener(this,"SeleccionarTodosPresuTipoProyecto"));

		this.jCheckBoxSeleccionadosPresuTipoProyecto.addItemListener(new CheckBoxItemListener(this,"SeleccionadosPresuTipoProyecto"));
		
		if(this.jInternalFrameDetalleFormPresuTipoProyecto!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormPresuTipoProyecto.jComboBoxTiposAccionesFormularioPresuTipoProyecto.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioPresuTipoProyecto"));
		}
		
		
		this.jComboBoxTiposRelacionesPresuTipoProyecto.addActionListener (new ButtonActionListener(this,"TiposRelacionesPresuTipoProyecto"));
			
		this.jComboBoxTiposAccionesPresuTipoProyecto.addActionListener (new ButtonActionListener(this,"TiposAccionesPresuTipoProyecto"));
					
		this.jComboBoxTiposSeleccionarPresuTipoProyecto.addActionListener (new ButtonActionListener(this,"TiposSeleccionarPresuTipoProyecto"));
			
		this.jTextFieldValorCampoGeneralPresuTipoProyecto.addActionListener (new ButtonActionListener(this,"ValorCampoGeneralPresuTipoProyecto"));		
		
		
		if(this.jInternalFrameDetalleFormPresuTipoProyecto!=null) { //if(this.conCargarFormDetalle) {
		
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPresuTipoProyecto.jButtonidPresuTipoProyectoBusqueda.addActionListener(new ButtonActionListener(this,"idPresuTipoProyectoBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormPresuTipoProyecto.jButtonid_empresaPresuTipoProyectoUpdate.addActionListener(new ButtonActionListener(this,"id_empresaPresuTipoProyectoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPresuTipoProyecto.jButtonid_empresaPresuTipoProyectoBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaPresuTipoProyectoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPresuTipoProyecto.jButtoncodigoPresuTipoProyectoBusqueda.addActionListener(new ButtonActionListener(this,"codigoPresuTipoProyectoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPresuTipoProyecto.jButtonnombrePresuTipoProyectoBusqueda.addActionListener(new ButtonActionListener(this,"nombrePresuTipoProyectoBusqueda"));
		}
		
		if(!this.conCargarMinimo) {
		//BYDAN_BUSQUEDAS
		
		
			this.jButtonBusquedaPorCodigoPresuTipoProyecto.addActionListener(new ButtonActionListener(this,"BusquedaPorCodigoPresuTipoProyecto"));

			this.jButtonBusquedaPorNombrePresuTipoProyecto.addActionListener(new ButtonActionListener(this,"BusquedaPorNombrePresuTipoProyecto"));
		
		
		
			//REPORTE DINAMICO
			
			if(this.jInternalFrameReporteDinamicoPresuTipoProyecto!=null) {
				this.jInternalFrameReporteDinamicoPresuTipoProyecto.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoPresuTipoProyecto"));
				this.jInternalFrameReporteDinamicoPresuTipoProyecto.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoPresuTipoProyecto"));
				this.jInternalFrameReporteDinamicoPresuTipoProyecto.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoPresuTipoProyecto"));
			}
			
			//this.jButtonCerrarReporteDinamicoPresuTipoProyecto.addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoPresuTipoProyecto"));				
			//this.jButtonGenerarReporteDinamicoPresuTipoProyecto.addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoPresuTipoProyecto"));
			//this.jButtonGenerarExcelReporteDinamicoPresuTipoProyecto.addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoPresuTipoProyecto"));
				
				
			//IMPORTACION			
			if(this.jInternalFrameImportacionPresuTipoProyecto!=null) {
				this.jInternalFrameImportacionPresuTipoProyecto.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionPresuTipoProyecto"));
				this.jInternalFrameImportacionPresuTipoProyecto.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionPresuTipoProyecto"));
				this.jInternalFrameImportacionPresuTipoProyecto.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionPresuTipoProyecto"));
			}
			
			//ORDER BY
			this.jButtonAbrirOrderByPresuTipoProyecto.addActionListener (new ButtonActionListener(this,"AbrirOrderByPresuTipoProyecto"));
			
			this.jButtonAbrirOrderByToolBarPresuTipoProyecto.addActionListener (new ButtonActionListener(this,"AbrirOrderByToolBarPresuTipoProyecto"));			
			
			if(this.jInternalFrameOrderByPresuTipoProyecto!=null) {
				this.jInternalFrameOrderByPresuTipoProyecto.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByPresuTipoProyecto"));				
			}
			
			
		}
		
		
		
		if(!this.conCargarMinimo) {
			if(this.jInternalFrameDetalleFormPresuTipoProyecto!=null) { //if(this.conCargarFormDetalle) {
			;
			}
		}
		
		
		//TABBED PANE RELACIONES
		if(this.jInternalFrameDetalleFormPresuTipoProyecto!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormPresuTipoProyecto.jTabbedPaneRelacionesPresuTipoProyecto.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesPresuTipoProyecto"));
		
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
            		closingInternalFramePresuTipoProyecto();
				} catch (Exception e) {
					e.printStackTrace();
				}
            }
        });
		
		this.jInternalFrameDetalleFormPresuTipoProyecto.addInternalFrameListener(new javax.swing.event.InternalFrameAdapter() {
	        public void internalFrameClosing(InternalFrameEvent event) {
	            JInternalFrameBase jInternalFrameDetalleFormPresuTipoProyecto = (JInternalFrameBase)event.getSource();
	            	
	            PresuTipoProyectoBeanSwingJInternalFrame jInternalFrameParent=(PresuTipoProyectoBeanSwingJInternalFrame)jInternalFrameDetalleFormPresuTipoProyecto.getjInternalFrameParent();
	                
	            try {
					jInternalFrameParent.jButtonCancelarPresuTipoProyectoActionPerformed(null);
					
					//jInternalFrameParent.dispose();
					//jInternalFrameParent=null;
					
				} catch (Exception e) {
					e.printStackTrace();
				}
	        }
	    });
			
		this.jTableDatosPresuTipoProyecto.getSelectionModel().addListSelectionListener (
	                new ListSelectionListener() {
	                    public void valueChanged(ListSelectionEvent e) {
							//BYDAN_DESHABILITADO
	                    	//try {jTableDatosPresuTipoProyectoListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
	                    }
	                }
	     );
		
		this.jTableDatosPresuTipoProyecto.addMouseListener(new MouseAdapter() {
			   public void mouseClicked(MouseEvent evt) {
				      if (evt.getClickCount() == 2) {
				    	  jButtonIdActionPerformed(null,jTableDatosPresuTipoProyecto.getSelectedRow(),false,false);
				      }
				   }
		});
		
		this.jButtonNuevoPresuTipoProyecto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoPresuTipoProyectoActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoToolBarPresuTipoProyecto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoPresuTipoProyectoActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoPresuTipoProyecto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoPresuTipoProyectoActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoPresuTipoProyecto";
		inputMap = this.jButtonNuevoPresuTipoProyecto.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_N , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoPresuTipoProyecto.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoPresuTipoProyectoActionPerformed(evt,false);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonNuevoRelacionesPresuTipoProyecto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoPresuTipoProyectoActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoRelacionesToolBarPresuTipoProyecto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoPresuTipoProyectoActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoRelacionesPresuTipoProyecto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoPresuTipoProyectoActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoRelacionesPresuTipoProyecto";
		inputMap = this.jButtonNuevoRelacionesPresuTipoProyecto.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_R , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoRelacionesPresuTipoProyecto.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoPresuTipoProyectoActionPerformed(evt,true);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonModificarPresuTipoProyecto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarPresuTipoProyectoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonModificarToolBarPresuTipoProyecto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarPresuTipoProyectoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemModificarPresuTipoProyecto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarPresuTipoProyectoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ModificarPresuTipoProyecto";
		inputMap = this.jButtonModificarPresuTipoProyecto.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_M , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonModificarPresuTipoProyecto.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonModificarPresuTipoProyectoActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonActualizarPresuTipoProyecto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarPresuTipoProyectoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonActualizarToolBarPresuTipoProyecto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarPresuTipoProyectoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemActualizarPresuTipoProyecto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarPresuTipoProyectoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ActualizarPresuTipoProyecto";
		inputMap = this.jButtonActualizarPresuTipoProyecto.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonActualizarPresuTipoProyecto.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonActualizarPresuTipoProyectoActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonEliminarPresuTipoProyecto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarPresuTipoProyectoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonEliminarToolBarPresuTipoProyecto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarPresuTipoProyectoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
				
		this.jMenuItemEliminarPresuTipoProyecto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarPresuTipoProyectoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "EliminarPresuTipoProyecto";
		inputMap = this.jButtonEliminarPresuTipoProyecto.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_E , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonEliminarPresuTipoProyecto.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonEliminarPresuTipoProyectoActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCancelarPresuTipoProyecto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarPresuTipoProyectoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCancelarToolBarPresuTipoProyecto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarPresuTipoProyectoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCancelarPresuTipoProyecto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarPresuTipoProyectoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CancelarPresuTipoProyecto";
		inputMap = this.jButtonCancelarPresuTipoProyecto.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_Q , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonCancelarPresuTipoProyecto.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCancelarPresuTipoProyectoActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCerrarPresuTipoProyecto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarPresuTipoProyectoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCerrarToolBarPresuTipoProyecto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarPresuTipoProyectoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCerrarPresuTipoProyecto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarPresuTipoProyectoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemDetalleCerrarPresuTipoProyecto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  //try {jButtonCerrarPresuTipoProyectoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
					try {jButtonCancelarPresuTipoProyectoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CerrarPresuTipoProyecto";
		inputMap = this.jButtonCerrarPresuTipoProyecto.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_C , KeyEvent.ALT_MASK), sMapKey);
			
		this.jButtonCerrarPresuTipoProyecto.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCerrarPresuTipoProyectoActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jInternalFrameDetalleFormPresuTipoProyecto.jButtonGuardarCambiosPresuTipoProyecto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosPresuTipoProyectoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosToolBarPresuTipoProyecto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosPresuTipoProyectoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosPresuTipoProyecto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosPresuTipoProyectoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaPresuTipoProyecto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosPresuTipoProyectoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaToolBarPresuTipoProyecto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosPresuTipoProyectoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosTablaPresuTipoProyecto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosPresuTipoProyectoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "GuardarCambiosPresuTipoProyecto";
		inputMap = this.jInternalFrameDetalleFormPresuTipoProyecto.jButtonGuardarCambiosPresuTipoProyecto.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jInternalFrameDetalleFormPresuTipoProyecto.jButtonGuardarCambiosPresuTipoProyecto.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonGuardarCambiosPresuTipoProyectoActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonRecargarInformacionPresuTipoProyecto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionPresuTipoProyectoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonRecargarInformacionToolBarPresuTipoProyecto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionPresuTipoProyectoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemRecargarInformacionPresuTipoProyecto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionPresuTipoProyectoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		this.jButtonAnterioresPresuTipoProyecto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresPresuTipoProyectoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAnterioresToolBarPresuTipoProyecto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresPresuTipoProyectoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemAnterioresPresuTipoProyecto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresPresuTipoProyectoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesPresuTipoProyecto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesPresuTipoProyectoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesToolBarPresuTipoProyecto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesPresuTipoProyectoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemSiguientesPresuTipoProyecto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesPresuTipoProyectoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosPresuTipoProyecto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosPresuTipoProyectoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosToolBarPresuTipoProyecto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosPresuTipoProyectoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoGuardarCambiosPresuTipoProyecto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosPresuTipoProyectoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		//SELECCIONAR TODOS
		this.jCheckBoxSeleccionarTodosPresuTipoProyecto.addItemListener(new ItemListener() {		
			public void itemStateChanged(ItemEvent evt) {
				try {jCheckBoxSeleccionarTodosPresuTipoProyectoItemListener(evt);}catch(Exception e){e.printStackTrace();}
			}
		});

		this.jComboBoxTiposAccionesPresuTipoProyecto.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposAccionesPresuTipoProyectoActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jComboBoxTiposSeleccionarPresuTipoProyecto.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposSeleccionarPresuTipoProyectoActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jTextFieldValorCampoGeneralPresuTipoProyecto.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jTextFieldValorCampoGeneralPresuTipoProyectoActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPresuTipoProyecto.jButtonidPresuTipoProyectoBusqueda.addActionListener(new ButtonActionListener(this,"idPresuTipoProyectoBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormPresuTipoProyecto.jButtonid_empresaPresuTipoProyectoUpdate.addActionListener(new ButtonActionListener(this,"id_empresaPresuTipoProyectoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPresuTipoProyecto.jButtonid_empresaPresuTipoProyectoBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaPresuTipoProyectoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPresuTipoProyecto.jButtoncodigoPresuTipoProyectoBusqueda.addActionListener(new ButtonActionListener(this,"codigoPresuTipoProyectoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPresuTipoProyecto.jButtonnombrePresuTipoProyectoBusqueda.addActionListener(new ButtonActionListener(this,"nombrePresuTipoProyectoBusqueda"));
		
		
		this.jButtonBusquedaPorCodigoPresuTipoProyecto.addActionListener(new ButtonActionListener(this,"BusquedaPorCodigoPresuTipoProyecto"));

		this.jButtonBusquedaPorNombrePresuTipoProyecto.addActionListener(new ButtonActionListener(this,"BusquedaPorNombrePresuTipoProyecto"));

		
		//REPORTE DINAMICO
		this.jButtonCerrarReporteDinamicoPresuTipoProyecto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarReporteDinamicoPresuTipoProyectoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarReporteDinamicoPresuTipoProyecto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarReporteDinamicoPresuTipoProyectoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarExcelReporteDinamicoPresuTipoProyecto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarExcelReporteDinamicoPresuTipoProyectoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		//IMPORTACION
		this.jButtonCerrarImportacionPresuTipoProyecto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarImportacionPresuTipoProyectoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarImportacionPresuTipoProyecto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarImportacionPresuTipoProyectoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAbrirImportacionPresuTipoProyecto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAbrirImportacionPresuTipoProyectoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
	}
	*/
	
	
	public void jComboBoxTiposSeleccionarPresuTipoProyectoActionListener(ActionEvent evt) throws Exception {    		
		try {			
			Reporte reporte=(Reporte)this.jComboBoxTiposSeleccionarPresuTipoProyecto.getSelectedItem();
			
			//if(reporte.getsCodigo().equals("SELECCIONAR")) {
			//}					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PresuTipoProyectoConstantesFunciones.CLASSNAME);
		}
	}	
	
	
	
	public void seleccionarTodosPresuTipoProyecto(Boolean conSeleccionarTodos) throws Exception {    		
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				for(PresuTipoProyecto presutipoproyectoAux:this.presutipoproyectoLogic.getPresuTipoProyectos()) {
					presutipoproyectoAux.setIsSelected(conSeleccionarTodos);
				}			
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(PresuTipoProyecto presutipoproyectoAux:presutipoproyectos) {
					presutipoproyectoAux.setIsSelected(conSeleccionarTodos);
				}
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PresuTipoProyectoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarTodosPresuTipoProyectoItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingPresuTipoProyecto(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			
			if(sTipoSeleccionar.equals("COLUMNAS")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(PresuTipoProyecto presutipoproyectoAux:this.presutipoproyectoLogic.getPresuTipoProyectos()) {
						presutipoproyectoAux.setIsSelected(this.isSeleccionarTodos);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(PresuTipoProyecto presutipoproyectoAux:presutipoproyectos) {
						presutipoproyectoAux.setIsSelected(this.isSeleccionarTodos);
					}
				}
			} else {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					for(PresuTipoProyecto presutipoproyectoAux:this.presutipoproyectoLogic.getPresuTipoProyectos()) {
					
					}	
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(PresuTipoProyecto presutipoproyectoAux:presutipoproyectos) {
						
					}
				}
			}
					
			if(existe) {
				this.inicializarActualizarBindingTablaPresuTipoProyecto(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosPresuTipoProyecto.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosPresuTipoProyecto.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosPresuTipoProyecto,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PresuTipoProyectoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionadosPresuTipoProyectoItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingPresuTipoProyecto(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			int[] arrNumRowsSeleccionados=null;
			
			arrNumRowsSeleccionados=this.jTableDatosPresuTipoProyecto.getSelectedRows();
			
			PresuTipoProyecto presutipoproyectoLocal=new PresuTipoProyecto();
			
			//this.seleccionarTodosPresuTipoProyecto(false);
			
			for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					presutipoproyectoLocal =(PresuTipoProyecto) this.presutipoproyectoLogic.getPresuTipoProyectos().toArray()[this.jTableDatosPresuTipoProyecto.convertRowIndexToModel(iNumRowSeleccionado)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					presutipoproyectoLocal =(PresuTipoProyecto) this.presutipoproyectos.toArray()[this.jTableDatosPresuTipoProyecto.convertRowIndexToModel(iNumRowSeleccionado)];
				}
				
				presutipoproyectoLocal.setIsSelected(this.isSeleccionados);
			}
			
			/*
			if(sTipoSeleccionar.equals("SELECCIONAR")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(PresuTipoProyecto presutipoproyectoAux:this.presutipoproyectoLogic.getPresuTipoProyectos()) {
						presutipoproyectoAux.setIsSelected(this.isSeleccionados);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(PresuTipoProyecto presutipoproyectoAux:presutipoproyectos) {
						presutipoproyectoAux.setIsSelected(this.isSeleccionados);
					}
				}
			}
			*/
			
			//if(existe) {
				this.inicializarActualizarBindingTablaPresuTipoProyecto(false);
			/*
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			*/
			
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosPresuTipoProyecto.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosPresuTipoProyecto.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosPresuTipoProyecto,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PresuTipoProyectoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarActualPresuTipoProyectoItemListener(ItemEvent evt,Long idActual) throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PresuTipoProyectoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void ejecutarAuxiliarPresuTipoProyectoParaAjaxPostBack() throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PresuTipoProyectoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jTextFieldValorCampoGeneralPresuTipoProyectoActionListener(ActionEvent evt) throws Exception {    		
		try {
			this.inicializarActualizarBindingPresuTipoProyecto(false,false);
			
			//System.out.println(this.jTextFieldValorCampoGeneralPresuTipoProyecto.getText());		
			
			Boolean existe=false;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(PresuTipoProyecto presutipoproyectoAux:this.presutipoproyectoLogic.getPresuTipoProyectos()) {
				
						if(sTipoSeleccionar.equals(PresuTipoProyectoConstantesFunciones.LABEL_CODIGO)) {
							existe=true;
							presutipoproyectoAux.setcodigo(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(PresuTipoProyectoConstantesFunciones.LABEL_NOMBRE)) {
							existe=true;
							presutipoproyectoAux.setnombre(this.sValorCampoGeneral);
						}
				}	
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(PresuTipoProyecto presutipoproyectoAux:presutipoproyectos) {
					
						if(sTipoSeleccionar.equals(PresuTipoProyectoConstantesFunciones.LABEL_CODIGO)) {
							existe=true;
							presutipoproyectoAux.setcodigo(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(PresuTipoProyectoConstantesFunciones.LABEL_NOMBRE)) {
							existe=true;
							presutipoproyectoAux.setnombre(this.sValorCampoGeneral);
						}
				}
			}
								
			if(existe) {
				this.inicializarActualizarBindingTablaPresuTipoProyecto(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PresuTipoProyectoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jComboBoxTiposAccionesPresuTipoProyectoActionListener(ActionEvent evt,Boolean esParaAccionDesdeFormulario) throws Exception {    				
		Boolean conSplash=true;
		
		try {							
		
			this.inicializarActualizarBindingPresuTipoProyecto(false,false);
			
			Reporte reporte=new Reporte();
			
			this.esParaAccionDesdeFormularioPresuTipoProyecto=esParaAccionDesdeFormulario;
			
			if(!esParaAccionDesdeFormulario) {
				
				reporte=(Reporte)this.jComboBoxTiposAccionesPresuTipoProyecto.getSelectedItem();
				
			} else {
				reporte=(Reporte)this.jInternalFrameDetalleFormPresuTipoProyecto.jComboBoxTiposAccionesFormularioPresuTipoProyecto.getSelectedItem();
			}
			String sTipoAccionLocal=this.sTipoAccion;
			
			if(!esParaAccionDesdeFormulario) {
				sTipoAccionLocal=this.sTipoAccion;
			} else {
				sTipoAccionLocal=this.sTipoAccionFormulario;
			}
			
			if(sTipoAccionLocal.equals("GENERAR REPORTE")) {//reporte.getsCodigo().equals("GENERAR REPORTE")) {
				if(this.isPermisoReportePresuTipoProyecto) {				
					conSplash=true;//false;										
					
					//this.startProcessPresuTipoProyecto(conSplash);
				
					this.generarReportePresuTipoProyectosSeleccionados();
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesPresuTipoProyecto.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormPresuTipoProyecto.jComboBoxTiposAccionesFormularioPresuTipoProyecto.setSelectedIndex(0);					
				}
			} else if(sTipoAccionLocal.equals("GENERAR REPORTE DINAMICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.mostrarReporteDinamicoPresuTipoProyectosSeleccionados();
				//this.jComboBoxTiposAccionesPresuTipoProyecto.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("GENERAR_REPORTE_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoPresuTipoProyectosSeleccionados(false);
				//this.jComboBoxTiposAccionesPresuTipoProyecto.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("GENERAR_REPORTE_TOTALES_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoPresuTipoProyectosSeleccionados(true);
				//this.jComboBoxTiposAccionesPresuTipoProyecto.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessPresuTipoProyecto();
				
				this.exportarPresuTipoProyectosSeleccionados();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesPresuTipoProyecto.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormPresuTipoProyecto.jComboBoxTiposAccionesFormularioPresuTipoProyecto.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("IMPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				this.mostrarImportacionPresuTipoProyectos();
				//this.importarPresuTipoProyectos();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesPresuTipoProyecto.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormPresuTipoProyecto.jComboBoxTiposAccionesFormularioPresuTipoProyecto.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS_EXCEL")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessPresuTipoProyecto();
				//SE EXPORTA SEGUN TIPO ARCHIVO SELECCIONADO
				//this.exportarExcelPresuTipoProyectosSeleccionados();
				//this.jComboBoxTiposAccionesPresuTipoProyecto.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("RECARGAR_FK")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {								
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE RECARGAR REFERENCIAS ?", "MANTENIMIENTO DE Tipo Proyecto", JOptionPane.OK_CANCEL_OPTION) == 0) {
				
				//this.startProcessPresuTipoProyecto();
				
					if(!esParaAccionDesdeFormulario || (esParaAccionDesdeFormulario && this.isEsNuevoPresuTipoProyecto)) {
						this.esRecargarFks=true;
						this.cargarCombosForeignKeyPresuTipoProyecto(false,false,false);
						this.esRecargarFks=false;
						
						JOptionPane.showMessageDialog(this,"PROCESO EJECUTADO CORRECTAMENTE","MANTENIMIENTO DE Tipo Proyecto",JOptionPane.INFORMATION_MESSAGE);
					} else {
						JOptionPane.showMessageDialog(this,"ESTE PROCESO SOLO FUNCIONA AL INGRESAR UN NUEVO ELEMENTO","MANTENIMIENTO",JOptionPane.ERROR_MESSAGE);	
					}
					
					
				}
				
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesPresuTipoProyecto.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormPresuTipoProyecto.jComboBoxTiposAccionesFormularioPresuTipoProyecto.setSelectedIndex(0);					
				}	
			} 			
			else if(PresuTipoProyectoBeanSwingJInternalFrame.EsProcesoReporte(reporte.getsCodigo())){
				if(this.isPermisoReportePresuTipoProyecto) {				
					if(this.tieneElementosSeleccionados()) {
						this.quitarFilaTotales();
						
						conSplash=false;
						
						//this.startProcessPresuTipoProyecto(conSplash);
					
						//this.actualizarParametrosGeneralPresuTipoProyecto();
						
						this.generarReporteProcesoAccionPresuTipoProyectosSeleccionados(reporte.getsCodigo());
						
						if(!esParaAccionDesdeFormulario) {
							
							this.jComboBoxTiposAccionesPresuTipoProyecto.setSelectedIndex(0);					
							
						} else {
							this.jInternalFrameDetalleFormPresuTipoProyecto.jComboBoxTiposAccionesFormularioPresuTipoProyecto.setSelectedIndex(0);					
						}
					} else {
						JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
			} 
			else if(PresuTipoProyectoBeanSwingJInternalFrameAdditional.EsProcesoAccionNormal(reporte.getsCodigo())){
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR "+reporte.getsDescripcion()+" EN PROCESO Tipo ProyectoS SELECCIONADOS?", "MANTENIMIENTO DE Tipo Proyecto", JOptionPane.OK_CANCEL_OPTION) == 0) {
						//this.startProcessPresuTipoProyecto();
				
						this.actualizarParametrosGeneralPresuTipoProyecto();
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {						
							this.presutipoproyectoReturnGeneral=presutipoproyectoLogic.procesarAccionPresuTipoProyectosWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,sTipoAccionLocal,this.presutipoproyectoLogic.getPresuTipoProyectos(),this.presutipoproyectoParameterGeneral);
						
						} else if(Constantes.ISUSAEJBREMOTE) {
						
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
						this.procesarPresuTipoProyectoReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesPresuTipoProyecto.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormPresuTipoProyecto.jComboBoxTiposAccionesFormularioPresuTipoProyecto.setSelectedIndex(0);					
					}
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}				
			} 
			else {
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					this.actualizarParametrosGeneralPresuTipoProyecto();
					
					PresuTipoProyectoBeanSwingJInternalFrameAdditional.ProcesarAccion(reporte.getsCodigo(),reporte.getsDescripcion(),this);
					
					this.procesarPresuTipoProyectoReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesPresuTipoProyecto.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormPresuTipoProyecto.jComboBoxTiposAccionesFormularioPresuTipoProyecto.setSelectedIndex(0);					
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}
			}
		} catch(Exception e) {
			this.esRecargarFks=false;
			
			FuncionesSwing.manageException(this, e,logger,PresuTipoProyectoConstantesFunciones.CLASSNAME);
		
		}  finally {
      		//this.finishProcessPresuTipoProyecto(conSplash);
      	}
	}
	
	public void jComboBoxTiposRelacionesPresuTipoProyectoActionListener(ActionEvent evt) throws Exception {    				
		Boolean conSplash=true;
		
		try {			
			this.startProcessPresuTipoProyecto();
			
			if(this.jInternalFrameDetalleFormPresuTipoProyecto==null) { //if(!this.conCargarFormDetalle) {			
				this.inicializarFormDetalle();
			}
			
			ArrayList<PresuTipoProyecto> presutipoproyectosSeleccionados=new ArrayList<PresuTipoProyecto>();		
			PresuTipoProyecto presutipoproyecto=new PresuTipoProyecto();
			
			int rowIndex=-1;//CON ESTO SE DESHABILITA SELECCION POR INDICE
			
			this.inicializarActualizarBindingPresuTipoProyecto(false,false);
			
			Reporte reporte=new Reporte();
			
			
			reporte=(Reporte)this.jComboBoxTiposRelacionesPresuTipoProyecto.getSelectedItem();
			
			
			
			
			presutipoproyectosSeleccionados=this.getPresuTipoProyectosSeleccionados(true);
			//this.sTipoAccion;
			
			if(presutipoproyectosSeleccionados.size()==1) {
				for(PresuTipoProyecto presutipoproyectoAux:presutipoproyectosSeleccionados) {
					presutipoproyecto=presutipoproyectoAux;
				}
				
				if(this.sTipoAccion.equals("NONE")) {
				
				}
				
			} else {
				JOptionPane.showMessageDialog(this,"SELECCIONE SOLO UN REGISTRO","RELACIONES",JOptionPane.ERROR_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PresuTipoProyectoConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.finishProcessPresuTipoProyecto();
			
      		//this.finishProcessPresuTipoProyecto(conSplash);
      	}
	}
			
	public static Boolean EsProcesoReporte(String sTipoProceso) throws Exception {
		Boolean esProcesoAccionRepoorte=false;

		if(sTipoProceso.contains("REPORTE_")) {
			 esProcesoAccionRepoorte=true;
		}

		return esProcesoAccionRepoorte;
	}
	
	public void procesarPresuTipoProyectoReturnGeneral() throws Exception {
		if(this.presutipoproyectoReturnGeneral.getConRetornoEstaProcesado()) {
			JOptionPane.showMessageDialog(this,this.presutipoproyectoReturnGeneral.getsMensajeProceso(),"PROCESO",JOptionPane.INFORMATION_MESSAGE);
		}
		
		if(this.presutipoproyectoReturnGeneral.getConMostrarMensaje()) {
			JOptionPane.showMessageDialog(this,this.presutipoproyectoReturnGeneral.getsMensajeProceso(),"PROCESO",FuncionesSwing.getColorSelectedBackground(this.presutipoproyectoReturnGeneral.getsTipoMensaje()));
		}
		
		if(this.presutipoproyectoReturnGeneral.getConRecargarInformacion()) {
			this.procesarBusqueda(this.sAccionBusqueda);
			
			this.inicializarActualizarBindingPresuTipoProyecto(false);
		}
		
		if(this.presutipoproyectoReturnGeneral.getConRetornoLista() || this.presutipoproyectoReturnGeneral.getConRetornoObjeto()) {
			if(this.presutipoproyectoReturnGeneral.getConRetornoLista()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.presutipoproyectoLogic.setPresuTipoProyectos(this.presutipoproyectoReturnGeneral.getPresuTipoProyectos());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			if(this.presutipoproyectoReturnGeneral.getConRetornoObjeto()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.presutipoproyectoLogic.setPresuTipoProyecto(this.presutipoproyectoReturnGeneral.getPresuTipoProyecto());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			this.inicializarActualizarBindingPresuTipoProyecto(false);
		}
	}
	
	public void actualizarParametrosGeneralPresuTipoProyecto() throws Exception {
		
		
	}
	
	public ArrayList<PresuTipoProyecto> getPresuTipoProyectosSeleccionados(Boolean conSeleccionarTodosAutomatico) throws Exception {
		ArrayList<PresuTipoProyecto> presutipoproyectosSeleccionados=new ArrayList<PresuTipoProyecto>();
		Boolean existe=false;
		
		if(!this.esParaAccionDesdeFormularioPresuTipoProyecto) {
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				
				for(PresuTipoProyecto presutipoproyectoAux:presutipoproyectoLogic.getPresuTipoProyectos()) {
					if(presutipoproyectoAux.getIsSelected()) {
						presutipoproyectosSeleccionados.add(presutipoproyectoAux);				
					}
				}
				
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(PresuTipoProyecto presutipoproyectoAux:this.presutipoproyectos) {
					if(presutipoproyectoAux.getIsSelected()) {
						presutipoproyectosSeleccionados.add(presutipoproyectoAux);				
					}
				}
			}
			
			if(presutipoproyectosSeleccionados.size()>0) {
				existe=true;
			}
			
			//SI NO ESTA NINGUNO SELECCIONADO SE SELECCIONA TODOS
			if(!existe) {
				if(conSeleccionarTodosAutomatico) {
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						presutipoproyectosSeleccionados.addAll(this.presutipoproyectoLogic.getPresuTipoProyectos());
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						presutipoproyectosSeleccionados.addAll(this.presutipoproyectos);				
					}
				}
			}
		} else {
			presutipoproyectosSeleccionados.add(this.presutipoproyecto);
		}
		
		return presutipoproyectosSeleccionados;
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
	
	public void generarReportePresuTipoProyectosSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoReporte.equals("NORMAL") || this.sTipoReporte.equals("FORMULARIO")) {
			existe=true;								
			this.generarReporteNormalPresuTipoProyectosSeleccionados();
			
		} else if(this.sTipoReporte.equals("DINAMICO")) {
			existe=true;
			this.mostrarReporteDinamicoPresuTipoProyectosSeleccionados();
			
		} else if(this.sTipoReporte.equals("GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoPresuTipoProyectosSeleccionados(false);
			
		} else if(this.sTipoReporte.equals("TOTALES_GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoPresuTipoProyectosSeleccionados(true);
		}
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE REPORTE VALIDO","REPORTE DE Tipo Proyecto",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void generarReporteRelacionesPresuTipoProyectosSeleccionados() throws Exception {
		ArrayList<PresuTipoProyecto> presutipoproyectosSeleccionados=new ArrayList<PresuTipoProyecto>();		
		
		presutipoproyectosSeleccionados=this.getPresuTipoProyectosSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
					
		//this.sTipoReporteExtra="MasterRelaciones";
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		
		this.generarReportePresuTipoProyectos("Todos",presutipoproyectosSeleccionados);
		
	}	
	
	public void generarReporteNormalPresuTipoProyectosSeleccionados() throws Exception {
		ArrayList<PresuTipoProyecto> presutipoproyectosSeleccionados=new ArrayList<PresuTipoProyecto>();		
		
		presutipoproyectosSeleccionados=this.getPresuTipoProyectosSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
								
		if(this.sTipoReporte.equals("FORMULARIO")) {
			this.sTipoReporteExtra="Vertical";					
		}
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.generarReportePresuTipoProyectos("Todos",presutipoproyectosSeleccionados);
	}		
	
	public void generarReporteProcesoAccionPresuTipoProyectosSeleccionados(String sProcesoReporte) throws Exception {
		ArrayList<PresuTipoProyecto> presutipoproyectosSeleccionados=new ArrayList<PresuTipoProyecto>();
		
		presutipoproyectosSeleccionados=this.getPresuTipoProyectosSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(false,false,true,"");
		
		/*
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.sTipoReporteExtra=sProcesoReporte.toLowerCase();
		
		this.esReporteAccionProceso=true;
		this.generarReportePresuTipoProyectos("Todos",presutipoproyectosSeleccionados);
		this.esReporteAccionProceso=false;
	}
	
	
	public void mostrarReporteDinamicoPresuTipoProyectosSeleccionados() throws Exception {
		ArrayList<PresuTipoProyecto> presutipoproyectosSeleccionados=new ArrayList<PresuTipoProyecto>();		
		
		
		this.abrirInicializarFrameReporteDinamicoPresuTipoProyecto();
		
		
		presutipoproyectosSeleccionados=this.getPresuTipoProyectosSeleccionados(true);
		
		this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirFrameReporteDinamicoPresuTipoProyecto();
		
		
		//this.generarReportePresuTipoProyectos("Todos",presutipoproyectosSeleccionados ,presutipoproyectoImplementable,presutipoproyectoImplementableHome);
	}
	
	public void mostrarImportacionPresuTipoProyectos() throws Exception {
		//this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirInicializarFrameImportacionPresuTipoProyecto();
		
		this.abrirFrameImportacionPresuTipoProyecto();		
		
			
		//this.generarReportePresuTipoProyectos("Todos",presutipoproyectosSeleccionados ,presutipoproyectoImplementable,presutipoproyectoImplementableHome);
	}
	
	public void importarPresuTipoProyectos() throws Exception {		
	
	}
	
	public void exportarPresuTipoProyectosSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoArchivoReporte.equals("EXCEL")) {
			existe=true;
			this.exportarExcelPresuTipoProyectosSeleccionados();
			
		} else if(this.sTipoArchivoReporte.equals("TEXTO")) {
			existe=true;
			this.exportarTextoPresuTipoProyectosSeleccionados();
		
		} else if(this.sTipoArchivoReporte.equals("XML")) {
			existe=true;
			this.exportarXmlPresuTipoProyectosSeleccionados();
		} 
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE ARCHIVO VALIDO","EXPORTACION DE Tipo Proyecto",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void exportarTextoPresuTipoProyectosSeleccionados() throws Exception {
		ArrayList<PresuTipoProyecto> presutipoproyectosSeleccionados=new ArrayList<PresuTipoProyecto>();		
		
		presutipoproyectosSeleccionados=this.getPresuTipoProyectosSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"presutipoproyecto."+"txt";//Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario);
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		BufferedWriter bufferedWriter = null;
		FileWriter fileWriter=null;
		
		fileWriter=new FileWriter(sPath);
		
		bufferedWriter = new BufferedWriter(fileWriter);
		
		try {
			if(conCabecera) {
				sFilaCabecera=this.getFilaCabeceraExportarPresuTipoProyecto(sDelimiter);
				
				bufferedWriter.write(sFilaCabecera);
			}				
			
			for(PresuTipoProyecto presutipoproyectoAux:presutipoproyectosSeleccionados) {
				sFilaDatos=this.getFilaDatosExportarPresuTipoProyecto(presutipoproyectoAux,sDelimiter);
				
				bufferedWriter.write(sFilaDatos);
				
				//presutipoproyectoAux.setsDetalleGeneralEntityReporte(presutipoproyectoAux.toString());			
			}
			
			bufferedWriter.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.presutipoproyectoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Proyecto",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {
       		if (bufferedWriter != null) {
				bufferedWriter.close();
			}
		}
	}
	
	public String getFilaCabeceraExportarPresuTipoProyecto(String sDelimiter) {
		String sFilaCabecera="";
		
		
		sFilaCabecera+=PresuTipoProyectoConstantesFunciones.LABEL_ID;

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaCabecera+=sDelimiter;
		sFilaCabecera+=PresuTipoProyectoConstantesFunciones.LABEL_VERSIONROW;
		}

		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=PresuTipoProyectoConstantesFunciones.LABEL_IDEMPRESA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=PresuTipoProyectoConstantesFunciones.LABEL_CODIGO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=PresuTipoProyectoConstantesFunciones.LABEL_NOMBRE;
		
		return sFilaCabecera;
	}
	
	public String getFilaDatosExportarPresuTipoProyecto(PresuTipoProyecto presutipoproyecto,String sDelimiter) {
		String sFilaDatos="";
		
		sFilaDatos+="\r\n";
		
		
		sFilaDatos+=presutipoproyecto.getId().toString();

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaDatos+=sDelimiter;
		sFilaDatos+=presutipoproyecto.getVersionRow().toString();
		}

		sFilaDatos+=sDelimiter;
		sFilaDatos+=presutipoproyecto.getempresa_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=presutipoproyecto.getcodigo();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=presutipoproyecto.getnombre();
		
		return sFilaDatos;
	}
	
	//@SuppressWarnings("deprecation")
	public void exportarExcelPresuTipoProyectosSeleccionados() throws Exception {
		ArrayList<PresuTipoProyecto> presutipoproyectosSeleccionados=new ArrayList<PresuTipoProyecto>();		
		
		presutipoproyectosSeleccionados=this.getPresuTipoProyectosSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"presutipoproyecto.xls";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		FileOutputStream fileOutputStream=null;
		
		try {
			HSSFWorkbook workbook = new HSSFWorkbook();
			HSSFSheet sheet = workbook.createSheet("PresuTipoProyectos");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			HSSFRow row = sheet.createRow(iRow);
			HSSFCell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");

			if(conCabecera) {
				this.getFilaCabeceraExportarExcelPresuTipoProyecto(row);				
				iRow++;
			}				
			
			for(PresuTipoProyecto presutipoproyectoAux:presutipoproyectosSeleccionados) {
				row = sheet.createRow(iRow);
				
				this.getFilaDatosExportarExcelPresuTipoProyecto(presutipoproyectoAux,row);
				
				iRow++;
			}
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.presutipoproyectoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Proyecto",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			
       		if (fileOutputStream != null) {
				fileOutputStream.close();
			}			
		}
	}		
	
	public void exportarXmlPresuTipoProyectosSeleccionados() throws Exception {
		ArrayList<PresuTipoProyecto> presutipoproyectosSeleccionados=new ArrayList<PresuTipoProyecto>();		
		
		presutipoproyectosSeleccionados=this.getPresuTipoProyectosSeleccionados(true);
		
		//String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		//Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		//String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"presutipoproyecto.xml";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		DocumentBuilderFactory documentBuilderFactory=null;
		DocumentBuilder documentBuilder =null;
		
		try {
			documentBuilderFactory = DocumentBuilderFactory.newInstance();
			documentBuilder = documentBuilderFactory.newDocumentBuilder();
	
			Document document = documentBuilder.newDocument();
			Element elementRoot = document.createElement("presutipoproyectos");
			
			document.appendChild(elementRoot);
		    			
												
			Element element = null;//document.createElement("presutipoproyecto");
			//elementRoot.appendChild(element);
		
			for(PresuTipoProyecto presutipoproyectoAux:presutipoproyectosSeleccionados) {
				element = document.createElement("presutipoproyecto");
				elementRoot.appendChild(element);
			
				this.setFilaDatosExportarXmlPresuTipoProyecto(presutipoproyectoAux,document,element);
			}
			
			TransformerFactory transformerFactory = TransformerFactory.newInstance();
			Transformer transformer = transformerFactory.newTransformer();
			DOMSource domSource = new DOMSource(document);
			
			StreamResult streamResult = new StreamResult(new File(sPath));
	
			transformer.transform(domSource, streamResult);
						
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.presutipoproyectoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Proyecto",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			       				
		}
	}	
	
	//@SuppressWarnings("deprecation")
	public void getFilaCabeceraExportarExcelPresuTipoProyecto(HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(PresuTipoProyectoConstantesFunciones.LABEL_ID);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
		cell = row.createCell(iColumn++);cell.setCellValue(PresuTipoProyectoConstantesFunciones.LABEL_VERSIONROW);
		}

		cell = row.createCell(iColumn++);cell.setCellValue(PresuTipoProyectoConstantesFunciones.LABEL_IDEMPRESA);
		cell = row.createCell(iColumn++);cell.setCellValue(PresuTipoProyectoConstantesFunciones.LABEL_CODIGO);
		cell = row.createCell(iColumn++);cell.setCellValue(PresuTipoProyectoConstantesFunciones.LABEL_NOMBRE);
	}
	
	//@SuppressWarnings("deprecation")
	public void getFilaDatosExportarExcelPresuTipoProyecto(PresuTipoProyecto presutipoproyecto,HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(presutipoproyecto.getId());
		cell = row.createCell(iColumn++);cell.setCellValue(presutipoproyecto.getempresa_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(presutipoproyecto.getcodigo());
		cell = row.createCell(iColumn++);cell.setCellValue(presutipoproyecto.getnombre());				
	}
	
	public void setFilaDatosExportarXmlPresuTipoProyecto(PresuTipoProyecto presutipoproyecto,Document document,Element element) {
		/*
		Element lastname = document.createElement("lastname");
		lastname.appendChild(document.createTextNode("mook kim"));
		element.appendChild(lastname);
		*/
		

		Element elementId = document.createElement(PresuTipoProyectoConstantesFunciones.ID);
		elementId.appendChild(document.createTextNode(presutipoproyecto.getId().toString().trim()));
		element.appendChild(elementId);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){

		Element elementVersionRow = document.createElement(PresuTipoProyectoConstantesFunciones.VERSIONROW);
		elementVersionRow.appendChild(document.createTextNode(presutipoproyecto.getVersionRow().toString().trim()));
		element.appendChild(elementVersionRow);
		}


		Element elementempresa_descripcion = document.createElement(PresuTipoProyectoConstantesFunciones.IDEMPRESA);
		elementempresa_descripcion.appendChild(document.createTextNode(presutipoproyecto.getempresa_descripcion()));
		element.appendChild(elementempresa_descripcion);

		Element elementcodigo = document.createElement(PresuTipoProyectoConstantesFunciones.CODIGO);
		elementcodigo.appendChild(document.createTextNode(presutipoproyecto.getcodigo().trim()));
		element.appendChild(elementcodigo);

		Element elementnombre = document.createElement(PresuTipoProyectoConstantesFunciones.NOMBRE);
		elementnombre.appendChild(document.createTextNode(presutipoproyecto.getnombre().trim()));
		element.appendChild(elementnombre);
	}
	
	public void generarReporteGroupGenericoPresuTipoProyectosSeleccionados(Boolean soloTotales) throws Exception {
		ArrayList<PresuTipoProyecto> presutipoproyectosSeleccionados=new ArrayList<PresuTipoProyecto>();
		
		presutipoproyectosSeleccionados=this.getPresuTipoProyectosSeleccionados(true);
		
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
		
		this.setColumnaDescripcionReporteGroupGenericoPresuTipoProyecto(presutipoproyectosSeleccionados);
		
		this.generarReportePresuTipoProyectos("Todos",presutipoproyectosSeleccionados);
	}
	
	public void setColumnaDescripcionReporteGroupGenericoPresuTipoProyecto(ArrayList<PresuTipoProyecto> presutipoproyectosSeleccionados) throws Exception {    		
		try {
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			
			Boolean existe=false;
			
			for(PresuTipoProyecto presutipoproyectoAux:presutipoproyectosSeleccionados) {
				presutipoproyectoAux.setsDetalleGeneralEntityReporte(presutipoproyectoAux.toString());
			
				if(sTipoSeleccionar.equals(PresuTipoProyectoConstantesFunciones.LABEL_IDEMPRESA)) {
					existe=true;
					presutipoproyectoAux.setsDescripcionGeneralEntityReporte1(presutipoproyectoAux.getempresa_descripcion());
				}
				 else if(sTipoSeleccionar.equals(PresuTipoProyectoConstantesFunciones.LABEL_CODIGO)) {
					existe=true;
					presutipoproyectoAux.setsDescripcionGeneralEntityReporte1(presutipoproyectoAux.getcodigo());
				}
				 else if(sTipoSeleccionar.equals(PresuTipoProyectoConstantesFunciones.LABEL_NOMBRE)) {
					existe=true;
					presutipoproyectoAux.setsDescripcionGeneralEntityReporte1(presutipoproyectoAux.getnombre());
				}
			}	
											
			if(!existe) {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}										
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PresuTipoProyectoConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void actualizarEstadoCeldasBotonesPresuTipoProyecto(String sAccion,Boolean isGuardarCambiosEnLote,Boolean isEsMantenimientoRelacionado) throws Exception {
		if(sAccion=="n") {
			if(!this.esParaBusquedaForeignKey) {
				this.isVisibilidadCeldaNuevoPresuTipoProyecto=true;
				this.isVisibilidadCeldaNuevoRelacionesPresuTipoProyecto=true;
				this.isVisibilidadCeldaGuardarCambiosPresuTipoProyecto=true;
			}
			
			this.isVisibilidadCeldaModificarPresuTipoProyecto=false;
			this.isVisibilidadCeldaActualizarPresuTipoProyecto=false;
			this.isVisibilidadCeldaEliminarPresuTipoProyecto=false;
			this.isVisibilidadCeldaCancelarPresuTipoProyecto=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarPresuTipoProyecto=true;
				} else {
					this.isVisibilidadCeldaGuardarPresuTipoProyecto=false;
				}
			}
		} else if(sAccion=="a") {
			this.isVisibilidadCeldaNuevoPresuTipoProyecto=false;
			this.isVisibilidadCeldaNuevoRelacionesPresuTipoProyecto=false;
			this.isVisibilidadCeldaGuardarCambiosPresuTipoProyecto=false;
			this.isVisibilidadCeldaModificarPresuTipoProyecto=false;
			this.isVisibilidadCeldaActualizarPresuTipoProyecto=true;
			this.isVisibilidadCeldaEliminarPresuTipoProyecto=false;
			this.isVisibilidadCeldaCancelarPresuTipoProyecto=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarPresuTipoProyecto=true;
				} else {
					this.isVisibilidadCeldaGuardarPresuTipoProyecto=false;
				}
			}
		} else if(sAccion=="ae") {
			this.isVisibilidadCeldaNuevoPresuTipoProyecto=false;
			this.isVisibilidadCeldaNuevoRelacionesPresuTipoProyecto=false;
			this.isVisibilidadCeldaGuardarCambiosPresuTipoProyecto=false;
			this.isVisibilidadCeldaModificarPresuTipoProyecto=false;
			this.isVisibilidadCeldaActualizarPresuTipoProyecto=true;
			this.isVisibilidadCeldaEliminarPresuTipoProyecto=true;
			this.isVisibilidadCeldaCancelarPresuTipoProyecto=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarPresuTipoProyecto=true;
				} else {
					this.isVisibilidadCeldaGuardarPresuTipoProyecto=false;
				}
			}
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {
			this.isVisibilidadCeldaNuevoPresuTipoProyecto=false;
			this.isVisibilidadCeldaNuevoRelacionesPresuTipoProyecto=false;
			this.isVisibilidadCeldaGuardarCambiosPresuTipoProyecto=false;
			this.isVisibilidadCeldaModificarPresuTipoProyecto=false;
			this.isVisibilidadCeldaActualizarPresuTipoProyecto=true;
			this.isVisibilidadCeldaEliminarPresuTipoProyecto=false;
			this.isVisibilidadCeldaCancelarPresuTipoProyecto=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarPresuTipoProyecto=false;
				} else {
					this.isVisibilidadCeldaGuardarPresuTipoProyecto=false;
				}
			}
		} else if(sAccion=="c") {
			this.isVisibilidadCeldaNuevoPresuTipoProyecto=true;
			this.isVisibilidadCeldaNuevoRelacionesPresuTipoProyecto=true;
			this.isVisibilidadCeldaGuardarCambiosPresuTipoProyecto=true;
			this.isVisibilidadCeldaModificarPresuTipoProyecto=false;
			this.isVisibilidadCeldaActualizarPresuTipoProyecto=false;
			this.isVisibilidadCeldaEliminarPresuTipoProyecto=false;
			this.isVisibilidadCeldaCancelarPresuTipoProyecto=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarPresuTipoProyecto=true;
				} else {
					this.isVisibilidadCeldaGuardarPresuTipoProyecto=false;
				}
			}
		} else if(sAccion=="t") {
			this.isVisibilidadCeldaNuevoPresuTipoProyecto=false;
			this.isVisibilidadCeldaNuevoRelacionesPresuTipoProyecto=false;
			this.isVisibilidadCeldaGuardarCambiosPresuTipoProyecto=false;
			this.isVisibilidadCeldaActualizarPresuTipoProyecto=false;
			this.isVisibilidadCeldaEliminarPresuTipoProyecto=false;
			this.isVisibilidadCeldaCancelarPresuTipoProyecto=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarPresuTipoProyecto=false;
				} else {
					this.isVisibilidadCeldaGuardarPresuTipoProyecto=false;
				}
			}
		}  else if(sAccion=="s"||sAccion=="s2") {
			this.isVisibilidadCeldaNuevoPresuTipoProyecto=false;
			this.isVisibilidadCeldaNuevoRelacionesPresuTipoProyecto=false;
			this.isVisibilidadCeldaGuardarCambiosPresuTipoProyecto=false;
			this.isVisibilidadCeldaModificarPresuTipoProyecto=true;
			this.isVisibilidadCeldaActualizarPresuTipoProyecto=false;
			this.isVisibilidadCeldaEliminarPresuTipoProyecto=false;
			this.isVisibilidadCeldaCancelarPresuTipoProyecto=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarPresuTipoProyecto=false;
				} else {
					this.isVisibilidadCeldaGuardarPresuTipoProyecto=false;
				}
			}
		}
		
		//ACTUALIZA VISIBILIDAD PANELES
		if(PresuTipoProyectoJInternalFrame.CON_DATOS_FRAME && !this.esParaBusquedaForeignKey) {
			//SIEMPRE VISIBLE
			this.isVisibilidadCeldaNuevoPresuTipoProyecto=true;
			this.isVisibilidadCeldaNuevoRelacionesPresuTipoProyecto=true;
			this.isVisibilidadCeldaGuardarCambiosPresuTipoProyecto=true;
		} else {
			this.actualizarEstadoPanelsPresuTipoProyecto(sAccion);						
		}
		
		if(this.esParaBusquedaForeignKey) {
			this.isVisibilidadCeldaCopiarPresuTipoProyecto=false;
			//this.isVisibilidadCeldaVerFormPresuTipoProyecto=false;
			this.isVisibilidadCeldaDuplicarPresuTipoProyecto=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONES
		if(!presutipoproyectoSessionBean.getConGuardarRelaciones()) {
			this.isVisibilidadCeldaNuevoRelacionesPresuTipoProyecto=false;
		} else {
			this.isVisibilidadCeldaNuevoPresuTipoProyecto=false;
			this.isVisibilidadCeldaGuardarCambiosPresuTipoProyecto=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONADO
		if(presutipoproyectoSessionBean.getEsGuardarRelacionado()) {
			if(!presutipoproyectoSessionBean.getConGuardarRelaciones()) {	
				this.isVisibilidadCeldaNuevoRelacionesPresuTipoProyecto=false;												
			}
			
			this.jButtonCerrarPresuTipoProyecto.setVisible(false);
		}
		
		//SI NO TIENE MAXIMO DE RELACIONES PERMITIDAS
		if(!this.conMaximoRelaciones) {
			this.isVisibilidadCeldaNuevoRelacionesPresuTipoProyecto=false;
		}
		
		if(!this.permiteMantenimiento(this.presutipoproyecto)) {
			this.isVisibilidadCeldaActualizarPresuTipoProyecto=false;
			this.isVisibilidadCeldaEliminarPresuTipoProyecto=false;
		}
		
		
		
	}
	
	public void actualizarEstadoCeldasBotonesConGuardarRelacionesPresuTipoProyecto() {
	}
	
	public void actualizarEstadoPanelsPresuTipoProyecto(String sAccion) {
		if(sAccion=="n") {
			if(this.jScrollPanelDatosEdicionPresuTipoProyecto!=null) {
				this.jScrollPanelDatosEdicionPresuTipoProyecto.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasPresuTipoProyecto!=null) {
				this.jTabbedPaneBusquedasPresuTipoProyecto.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosPresuTipoProyecto!=null) {
				this.jScrollPanelDatosPresuTipoProyecto.setVisible(true);
			}
			
			if(this.jPanelPaginacionPresuTipoProyecto!=null) {
				this.jPanelPaginacionPresuTipoProyecto.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesPresuTipoProyecto!=null) {
				this.jPanelParametrosReportesPresuTipoProyecto.setVisible(true);		    
			}
			
		} else if(sAccion=="a") {				
			if(this.jScrollPanelDatosEdicionPresuTipoProyecto!=null) {
				this.jScrollPanelDatosEdicionPresuTipoProyecto.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasPresuTipoProyecto!=null) {
				this.jTabbedPaneBusquedasPresuTipoProyecto.setVisible(false);			
			}
			
			
			
			if(this.jScrollPanelDatosPresuTipoProyecto!=null) {
				this.jScrollPanelDatosPresuTipoProyecto.setVisible(false);
			}
			
			if(this.jPanelPaginacionPresuTipoProyecto!=null) {
				this.jPanelPaginacionPresuTipoProyecto.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesPresuTipoProyecto!=null) {
				this.jPanelParametrosReportesPresuTipoProyecto.setVisible(false);
			}
						
		} else if(sAccion=="ae") {		
			if(this.jScrollPanelDatosEdicionPresuTipoProyecto!=null) {
				this.jScrollPanelDatosEdicionPresuTipoProyecto.setVisible(true);		
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasPresuTipoProyecto!=null) {
				this.jTabbedPaneBusquedasPresuTipoProyecto.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosPresuTipoProyecto!=null) {
				this.jScrollPanelDatosPresuTipoProyecto.setVisible(false);
			}
			
			if(this.jPanelPaginacionPresuTipoProyecto!=null) {
				this.jPanelPaginacionPresuTipoProyecto.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesPresuTipoProyecto!=null) {
				this.jPanelParametrosReportesPresuTipoProyecto.setVisible(false);
			}
						
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {	
			if(this.jScrollPanelDatosEdicionPresuTipoProyecto!=null) {
				this.jScrollPanelDatosEdicionPresuTipoProyecto.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasPresuTipoProyecto!=null) {
				this.jTabbedPaneBusquedasPresuTipoProyecto.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosPresuTipoProyecto!=null) {
				this.jScrollPanelDatosPresuTipoProyecto.setVisible(false);
			}
			
			if(this.jPanelPaginacionPresuTipoProyecto!=null) {
				this.jPanelPaginacionPresuTipoProyecto.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesPresuTipoProyecto!=null) {
				this.jPanelParametrosReportesPresuTipoProyecto.setVisible(false);
			}
						
		} else if(sAccion=="c") {	
			if(this.jScrollPanelDatosEdicionPresuTipoProyecto!=null) {
				this.jScrollPanelDatosEdicionPresuTipoProyecto.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasPresuTipoProyecto!=null) {
				this.jTabbedPaneBusquedasPresuTipoProyecto.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosPresuTipoProyecto!=null) {
				this.jScrollPanelDatosPresuTipoProyecto.setVisible(true);
			}
			
			if(this.jPanelPaginacionPresuTipoProyecto!=null) {
				this.jPanelPaginacionPresuTipoProyecto.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesPresuTipoProyecto!=null) {
				this.jPanelParametrosReportesPresuTipoProyecto.setVisible(true);
			}
						
		} else if(sAccion=="t") {
			
			if(this.jScrollPanelDatosEdicionPresuTipoProyecto!=null) {
				this.jScrollPanelDatosEdicionPresuTipoProyecto.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasPresuTipoProyecto!=null) {
				this.jTabbedPaneBusquedasPresuTipoProyecto.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosPresuTipoProyecto!=null) {
				this.jScrollPanelDatosPresuTipoProyecto.setVisible(true);
			}
			
			if(this.jPanelPaginacionPresuTipoProyecto!=null) {
				this.jPanelPaginacionPresuTipoProyecto.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesPresuTipoProyecto!=null) {
				this.jPanelParametrosReportesPresuTipoProyecto.setVisible(true);
			}
						
		}  else if(sAccion=="s"||sAccion=="s2") {
			if(this.jScrollPanelDatosEdicionPresuTipoProyecto!=null) {
				this.jScrollPanelDatosEdicionPresuTipoProyecto.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasPresuTipoProyecto!=null) {
				this.jTabbedPaneBusquedasPresuTipoProyecto.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosPresuTipoProyecto!=null) {
				this.jScrollPanelDatosPresuTipoProyecto.setVisible(true);
			}
			
			if(this.jPanelPaginacionPresuTipoProyecto!=null) {
				this.jPanelPaginacionPresuTipoProyecto.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesPresuTipoProyecto!=null) {
				this.jPanelParametrosReportesPresuTipoProyecto.setVisible(true);
			}
			
		} 
		
		if(sAccion.equals("relacionado") || this.presutipoproyectoSessionBean.getEsGuardarRelacionado()) {
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				if(this.jTabbedPaneBusquedasPresuTipoProyecto!=null) {
					this.jTabbedPaneBusquedasPresuTipoProyecto.setVisible(false);				
				}
				
			}
			
			if(this.jPanelParametrosReportesPresuTipoProyecto!=null) {
				this.jPanelParametrosReportesPresuTipoProyecto.setVisible(false);
			}
		
		} else if(sAccion.equals("no_relacionado") && !this.presutipoproyectoSessionBean.getEsGuardarRelacionado()) {
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasPresuTipoProyecto!=null) {
				this.jTabbedPaneBusquedasPresuTipoProyecto.setVisible(true);			
			}
			
			if(this.jPanelParametrosReportesPresuTipoProyecto!=null) {
				this.jPanelParametrosReportesPresuTipoProyecto.setVisible(true);
			}
		}
	}	
	
	

	public void setVisibilidadBusquedasParaEmpresa(Boolean isParaEmpresa){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaEmpresaNegation=!isParaEmpresa;

			this.isVisibilidadBusquedaPorCodigo=isParaEmpresaNegation;
			if(!this.isVisibilidadBusquedaPorCodigo) {this.jTabbedPaneBusquedasPresuTipoProyecto.remove(jPanelBusquedaPorCodigoPresuTipoProyecto);}

			this.isVisibilidadBusquedaPorNombre=isParaEmpresaNegation;
			if(!this.isVisibilidadBusquedaPorNombre) {this.jTabbedPaneBusquedasPresuTipoProyecto.remove(jPanelBusquedaPorNombrePresuTipoProyecto);}
		}
		
	}
	
	
	
	
	
	
	public void guardarDatosBusquedaSession() throws Exception {
		
		//PresuTipoProyectoSessionBean presutipoproyectoSessionBean=new PresuTipoProyectoSessionBean();
		
		if(this.presutipoproyectoSessionBean==null) {
			this.presutipoproyectoSessionBean=new PresuTipoProyectoSessionBean();
		}
		
		this.presutipoproyectoSessionBean.setsUltimaBusquedaPresuTipoProyecto(this.getsAccionBusqueda());
		this.presutipoproyectoSessionBean.setiNumeroPaginacion(this.getiNumeroPaginacion());
		this.presutipoproyectoSessionBean.setiNumeroPaginacionPagina(this.getiNumeroPaginacionPagina());
		
		if(this.getsAccionBusqueda().equals("Todos")) {
			;
		}
		

		else if(this.getsAccionBusqueda().equals("BusquedaPorCodigo")) {
			presutipoproyectoSessionBean.setcodigo(this.getcodigoBusquedaPorCodigo());	
		}
		else if(this.getsAccionBusqueda().equals("BusquedaPorNombre")) {
			presutipoproyectoSessionBean.setnombre(this.getnombreBusquedaPorNombre());	
		}
		else if(this.getsAccionBusqueda().equals("FK_IdEmpresa")) {
			presutipoproyectoSessionBean.setid_empresa(this.getid_empresaFK_IdEmpresa());	
		}
		
	}
	
	public void traerDatosBusquedaDesdeSession() throws Exception {
		//PresuTipoProyectoSessionBean presutipoproyectoSessionBean=new PresuTipoProyectoSessionBean();
		
		if(this.presutipoproyectoSessionBean==null) {
			this.presutipoproyectoSessionBean=new PresuTipoProyectoSessionBean();
		}
		
		if(this.presutipoproyectoSessionBean.getsUltimaBusquedaPresuTipoProyecto()!=null&&!this.presutipoproyectoSessionBean.getsUltimaBusquedaPresuTipoProyecto().equals("")) {
			this.setsAccionBusqueda(presutipoproyectoSessionBean.getsUltimaBusquedaPresuTipoProyecto());
			this.setiNumeroPaginacion(presutipoproyectoSessionBean.getiNumeroPaginacion());
			this.setiNumeroPaginacionPagina(presutipoproyectoSessionBean.getiNumeroPaginacionPagina());		
				
			if(this.getsAccionBusqueda().equals("Todos")) {
				;
			}
			

			 else if(this.getsAccionBusqueda().equals("BusquedaPorCodigo")) {
				this.setcodigoBusquedaPorCodigo(presutipoproyectoSessionBean.getcodigo());
				presutipoproyectoSessionBean.setcodigo("");
			}
			 else if(this.getsAccionBusqueda().equals("BusquedaPorNombre")) {
				this.setnombreBusquedaPorNombre(presutipoproyectoSessionBean.getnombre());
				presutipoproyectoSessionBean.setnombre("");
			}
			 else if(this.getsAccionBusqueda().equals("FK_IdEmpresa")) {
				this.setid_empresaFK_IdEmpresa(presutipoproyectoSessionBean.getid_empresa());
				presutipoproyectoSessionBean.setid_empresa(-1L);
			}
		}
		
		this.presutipoproyectoSessionBean.setsUltimaBusquedaPresuTipoProyecto("");
		this.presutipoproyectoSessionBean.setiNumeroPaginacion(PresuTipoProyectoConstantesFunciones.INUMEROPAGINACION);
		this.presutipoproyectoSessionBean.setiNumeroPaginacionPagina(0);
		
	}
	
	public void procesoActualizarFilaTotales(Boolean esCampoValor,String sTipo) {
		try {
			this.actualizarFilaTotales();
				
			this.traerValoresTablaTotales();
			
			this.inicializarActualizarBindingTablaPresuTipoProyecto(false);
			
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	public void updateBusquedasFormularioPresuTipoProyecto() {
		this.updateBorderResaltarBusquedasFormularioPresuTipoProyecto();
		this.updateVisibilidadBusquedasFormularioPresuTipoProyecto();
		this.updateHabilitarBusquedasFormularioPresuTipoProyecto();
	}
	
	public void updateBorderResaltarBusquedasFormularioPresuTipoProyecto() {					
	//BYDAN_BUSQUEDAS
		
	int index=0;
		
	if(this.jTabbedPaneBusquedasPresuTipoProyecto.getComponents().length>0) {
	

		if(this.presutipoproyectoConstantesFunciones.resaltarBusquedaPorCodigoPresuTipoProyecto!=null) {
			index= this.jTabbedPaneBusquedasPresuTipoProyecto.indexOfComponent(this.jPanelBusquedaPorCodigoPresuTipoProyecto);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasPresuTipoProyecto.getComponent(index);
				jPanel.setBorder(this.presutipoproyectoConstantesFunciones.resaltarBusquedaPorCodigoPresuTipoProyecto);
			}
		}

		if(this.presutipoproyectoConstantesFunciones.resaltarBusquedaPorNombrePresuTipoProyecto!=null) {
			index= this.jTabbedPaneBusquedasPresuTipoProyecto.indexOfComponent(this.jPanelBusquedaPorNombrePresuTipoProyecto);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasPresuTipoProyecto.getComponent(index);
				jPanel.setBorder(this.presutipoproyectoConstantesFunciones.resaltarBusquedaPorNombrePresuTipoProyecto);
			}
		}
	}	
	
	}
	
	public void updateVisibilidadBusquedasFormularioPresuTipoProyecto() {
	//BYDAN_BUSQUEDAS
	
	int index=0;
	JPanel jPanel=null;
		
	if(this.jTabbedPaneBusquedasPresuTipoProyecto.getComponents().length>0) {
	

			index= this.jTabbedPaneBusquedasPresuTipoProyecto.indexOfComponent(this.jPanelBusquedaPorCodigoPresuTipoProyecto);
			jPanel=(JPanel)this.jTabbedPaneBusquedasPresuTipoProyecto.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.presutipoproyectoConstantesFunciones.mostrarBusquedaPorCodigoPresuTipoProyecto);
			if(!this.presutipoproyectoConstantesFunciones.mostrarBusquedaPorCodigoPresuTipoProyecto && index>-1) {
				this.jTabbedPaneBusquedasPresuTipoProyecto.remove(index);
			}

			index= this.jTabbedPaneBusquedasPresuTipoProyecto.indexOfComponent(this.jPanelBusquedaPorNombrePresuTipoProyecto);
			jPanel=(JPanel)this.jTabbedPaneBusquedasPresuTipoProyecto.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.presutipoproyectoConstantesFunciones.mostrarBusquedaPorNombrePresuTipoProyecto);
			if(!this.presutipoproyectoConstantesFunciones.mostrarBusquedaPorNombrePresuTipoProyecto && index>-1) {
				this.jTabbedPaneBusquedasPresuTipoProyecto.remove(index);
			}
	}	
	
	}
	
	public void updateHabilitarBusquedasFormularioPresuTipoProyecto() {
	
	//BYDAN_BUSQUEDAS		
		int index=0;
		JPanel jPanel=null;
			
		if(this.jTabbedPaneBusquedasPresuTipoProyecto.getComponents().length>0) {
	

			index= this.jTabbedPaneBusquedasPresuTipoProyecto.indexOfComponent(this.jPanelBusquedaPorCodigoPresuTipoProyecto);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedasPresuTipoProyecto.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.presutipoproyectoConstantesFunciones.activarBusquedaPorCodigoPresuTipoProyecto);
				this.jTabbedPaneBusquedasPresuTipoProyecto.setEnabledAt(index,this.presutipoproyectoConstantesFunciones.activarBusquedaPorCodigoPresuTipoProyecto);
			}

			index= this.jTabbedPaneBusquedasPresuTipoProyecto.indexOfComponent(this.jPanelBusquedaPorNombrePresuTipoProyecto);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedasPresuTipoProyecto.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.presutipoproyectoConstantesFunciones.activarBusquedaPorNombrePresuTipoProyecto);
				this.jTabbedPaneBusquedasPresuTipoProyecto.setEnabledAt(index,this.presutipoproyectoConstantesFunciones.activarBusquedaPorNombrePresuTipoProyecto);
			}
		}	
	
	}
	
	
	public void resaltarPanelBusquedaPresuTipoProyecto(String sTipoBusqueda) {
		Boolean existe=false;
		//BYDAN_BUSQUEDAS
		
		int index=0;
		Border resaltar = Funciones2.getBorderResaltar(this.parametroGeneralUsuario,"TAB");

		if(sTipoBusqueda.equals("BusquedaPorCodigo")) {
			index= this.jTabbedPaneBusquedasPresuTipoProyecto.indexOfComponent(this.jPanelBusquedaPorCodigoPresuTipoProyecto);

			this.jTabbedPaneBusquedasPresuTipoProyecto.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasPresuTipoProyecto.getComponent(index);

			this.presutipoproyectoConstantesFunciones.setResaltarBusquedaPorCodigoPresuTipoProyecto(resaltar);

			jPanel.setBorder(this.presutipoproyectoConstantesFunciones.resaltarBusquedaPorCodigoPresuTipoProyecto);
			existe=true;
		}
		else if(sTipoBusqueda.equals("BusquedaPorNombre")) {
			index= this.jTabbedPaneBusquedasPresuTipoProyecto.indexOfComponent(this.jPanelBusquedaPorNombrePresuTipoProyecto);

			this.jTabbedPaneBusquedasPresuTipoProyecto.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasPresuTipoProyecto.getComponent(index);

			this.presutipoproyectoConstantesFunciones.setResaltarBusquedaPorNombrePresuTipoProyecto(resaltar);

			jPanel.setBorder(this.presutipoproyectoConstantesFunciones.resaltarBusquedaPorNombrePresuTipoProyecto);
			existe=true;
		}
		

		if(existe) {
			
			this.jTtoolBarPresuTipoProyecto.setBorder(resaltar);
			
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
	
	public void updateControlesFormularioPresuTipoProyecto() throws Exception {

		if(this.jInternalFrameDetalleFormPresuTipoProyecto==null) { //if(!this.conCargarFormDetalle) {			
			this.inicializarFormDetalle();
		}
		
		this.updateBorderResaltarControlesFormularioPresuTipoProyecto();
		this.updateVisibilidadResaltarControlesFormularioPresuTipoProyecto();
		this.updateHabilitarResaltarControlesFormularioPresuTipoProyecto();
		
	}
	
	public void updateBorderResaltarControlesFormularioPresuTipoProyecto() throws Exception {
		if(this.jInternalFrameDetalleFormPresuTipoProyecto==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
	
		if(this.presutipoproyectoConstantesFunciones.resaltaridPresuTipoProyecto!=null && this.jInternalFrameDetalleFormPresuTipoProyecto!=null) {this.jInternalFrameDetalleFormPresuTipoProyecto.jLabelidPresuTipoProyecto.setBorder(this.presutipoproyectoConstantesFunciones.resaltaridPresuTipoProyecto);}
		if(this.presutipoproyectoConstantesFunciones.resaltarid_empresaPresuTipoProyecto!=null && this.jInternalFrameDetalleFormPresuTipoProyecto!=null) {this.jInternalFrameDetalleFormPresuTipoProyecto.jComboBoxid_empresaPresuTipoProyecto.setBorder(this.presutipoproyectoConstantesFunciones.resaltarid_empresaPresuTipoProyecto);}
		if(this.presutipoproyectoConstantesFunciones.resaltarcodigoPresuTipoProyecto!=null && this.jInternalFrameDetalleFormPresuTipoProyecto!=null) {this.jInternalFrameDetalleFormPresuTipoProyecto.jTextFieldcodigoPresuTipoProyecto.setBorder(this.presutipoproyectoConstantesFunciones.resaltarcodigoPresuTipoProyecto);}
		if(this.presutipoproyectoConstantesFunciones.resaltarnombrePresuTipoProyecto!=null && this.jInternalFrameDetalleFormPresuTipoProyecto!=null) {this.jInternalFrameDetalleFormPresuTipoProyecto.jTextAreanombrePresuTipoProyecto.setBorder(this.presutipoproyectoConstantesFunciones.resaltarnombrePresuTipoProyecto);}
	}
	
	public void updateVisibilidadResaltarControlesFormularioPresuTipoProyecto() throws Exception {		
		if(this.jInternalFrameDetalleFormPresuTipoProyecto==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormPresuTipoProyecto!=null) {
	
		//this.jInternalFrameDetalleFormPresuTipoProyecto.jLabelidPresuTipoProyecto.setVisible(this.presutipoproyectoConstantesFunciones.mostraridPresuTipoProyecto);
		this.jInternalFrameDetalleFormPresuTipoProyecto.jPanelidPresuTipoProyecto.setVisible(this.presutipoproyectoConstantesFunciones.mostraridPresuTipoProyecto);
		//this.jInternalFrameDetalleFormPresuTipoProyecto.jComboBoxid_empresaPresuTipoProyecto.setVisible(this.presutipoproyectoConstantesFunciones.mostrarid_empresaPresuTipoProyecto);
		this.jInternalFrameDetalleFormPresuTipoProyecto.jPanelid_empresaPresuTipoProyecto.setVisible(this.presutipoproyectoConstantesFunciones.mostrarid_empresaPresuTipoProyecto);
		//this.jInternalFrameDetalleFormPresuTipoProyecto.jTextFieldcodigoPresuTipoProyecto.setVisible(this.presutipoproyectoConstantesFunciones.mostrarcodigoPresuTipoProyecto);
		this.jInternalFrameDetalleFormPresuTipoProyecto.jPanelcodigoPresuTipoProyecto.setVisible(this.presutipoproyectoConstantesFunciones.mostrarcodigoPresuTipoProyecto);
		//this.jInternalFrameDetalleFormPresuTipoProyecto.jTextAreanombrePresuTipoProyecto.setVisible(this.presutipoproyectoConstantesFunciones.mostrarnombrePresuTipoProyecto);
		this.jInternalFrameDetalleFormPresuTipoProyecto.jPanelnombrePresuTipoProyecto.setVisible(this.presutipoproyectoConstantesFunciones.mostrarnombrePresuTipoProyecto);
		}
	}
	
	public void updateHabilitarResaltarControlesFormularioPresuTipoProyecto() throws Exception {
		if(this.jInternalFrameDetalleFormPresuTipoProyecto==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormPresuTipoProyecto!=null) {
	
		this.jInternalFrameDetalleFormPresuTipoProyecto.jLabelidPresuTipoProyecto.setEnabled(this.presutipoproyectoConstantesFunciones.activaridPresuTipoProyecto);
		this.jInternalFrameDetalleFormPresuTipoProyecto.jComboBoxid_empresaPresuTipoProyecto.setEnabled(this.presutipoproyectoConstantesFunciones.activarid_empresaPresuTipoProyecto);
		this.jInternalFrameDetalleFormPresuTipoProyecto.jTextFieldcodigoPresuTipoProyecto.setEnabled(this.presutipoproyectoConstantesFunciones.activarcodigoPresuTipoProyecto);
		this.jInternalFrameDetalleFormPresuTipoProyecto.jTextAreanombrePresuTipoProyecto.setEnabled(this.presutipoproyectoConstantesFunciones.activarnombrePresuTipoProyecto);
		}
	}
	
		
}