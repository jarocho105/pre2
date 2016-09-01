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
package com.bydan.erp.nomina.presentation.swing.jinternalframes.report;




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

//import com.bydan.erp.nomina.util.IngresosPromediosConstantesFunciones;
import com.bydan.erp.nomina.util.report.IngresosPromediosParameterReturnGeneral;
//import com.bydan.erp.nomina.util.report.IngresosPromediosParameterGeneral;
//import com.bydan.erp.nomina.presentation.report.source.report.IngresosPromediosBean;
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

import com.bydan.erp.nomina.presentation.swing.jinternalframes.auxiliar.report.*;
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
import com.bydan.erp.nomina.resources.reportes.report.AuxiliarReportes;

import com.bydan.erp.nomina.util.*;

import com.bydan.erp.nomina.util.report.*;
import com.bydan.erp.nomina.business.logic.report.*;

import com.bydan.erp.nomina.business.logic.*;
import com.bydan.erp.seguridad.business.logic.*;

//EJB

//PARAMETROS


//EJB PARAMETROS

import com.bydan.framework.erp.business.logic.*;
import com.bydan.framework.erp.util.*;

import com.bydan.erp.nomina.business.entity.*;
import com.bydan.erp.nomina.business.entity.report.*;
//import com.bydan.framework.erp.business.entity.ConexionBeanFace;
//import com.bydan.framework.erp.business.entity.Mensajes;


import com.bydan.erp.nomina.presentation.swing.jinternalframes.*;
import com.bydan.erp.seguridad.presentation.swing.jinternalframes.*;

import com.bydan.erp.nomina.presentation.swing.jinternalframes.auxiliar.*;
import com.bydan.erp.seguridad.presentation.swing.jinternalframes.auxiliar.*;






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

//import org.hibernate.collection.PersistentBag;

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


import com.bydan.erp.nomina.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.nomina.presentation.web.jsf.sessionbean.report.*;

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


import com.bydan.erp.nomina.business.entity.*;
import com.bydan.erp.seguridad.business.entity.*;
import com.bydan.erp.nomina.util.*;
import com.bydan.erp.seguridad.util.*;
import com.bydan.erp.nomina.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;


@SuppressWarnings("unused")
public class IngresosPromediosBeanSwingJInternalFrame extends IngresosPromediosJInternalFrame implements WindowListener,WindowFocusListener
{				
	
	public static final long serialVersionUID = 1L;
	
	public static Logger logger = Logger.getLogger(IngresosPromediosBeanSwingJInternalFrame.class);  
	
	public static ClassValidator<IngresosPromedios> ingresospromediosValidator = new ClassValidator<IngresosPromedios>(IngresosPromedios.class);
	
	public InvalidValue[] invalidValues=null;
		

	//Ejb Foreign Keys
	
	public IngresosPromedios ingresospromedios;	
	public IngresosPromedios ingresospromediosAux;
	public IngresosPromedios ingresospromediosAnterior;//USADO PARA MANEJAR FOCUS GAINED,LOST
	public IngresosPromedios ingresospromediosTotales;
	public Long idIngresosPromediosActual;
	public Long iIdNuevoIngresosPromedios=0L;
	public int rowIndexActual=0;
	
	
	
	
	public String sFinalQueryComboEstructura="";

	public List<Estructura> estructurasForeignKey;

	public List<Estructura> getestructurasForeignKey() {
		return estructurasForeignKey;
	}

	public void setestructurasForeignKey(List<Estructura> estructurasForeignKey) {
		this.estructurasForeignKey = estructurasForeignKey;
	}

	//OBJETO FK ACTUAL
	public Estructura estructuraForeignKey;

	public Estructura getestructuraForeignKey() {
		return estructuraForeignKey;
	}

	public void setestructuraForeignKey(Estructura estructuraForeignKey) {
		this.estructuraForeignKey = estructuraForeignKey;
	}

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

	public String sFinalQueryComboAnio="";

	public List<Anio> aniosForeignKey;

	public List<Anio> getaniosForeignKey() {
		return aniosForeignKey;
	}

	public void setaniosForeignKey(List<Anio> aniosForeignKey) {
		this.aniosForeignKey = aniosForeignKey;
	}

	//OBJETO FK ACTUAL
	public Anio anioForeignKey;

	public Anio getanioForeignKey() {
		return anioForeignKey;
	}

	public void setanioForeignKey(Anio anioForeignKey) {
		this.anioForeignKey = anioForeignKey;
	}

	public String sFinalQueryComboMes="";

	public List<Mes> messForeignKey;

	public List<Mes> getmessForeignKey() {
		return messForeignKey;
	}

	public void setmessForeignKey(List<Mes> messForeignKey) {
		this.messForeignKey = messForeignKey;
	}

	//OBJETO FK ACTUAL
	public Mes mesForeignKey;

	public Mes getmesForeignKey() {
		return mesForeignKey;
	}

	public void setmesForeignKey(Mes mesForeignKey) {
		this.mesForeignKey = mesForeignKey;
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
	
	public Boolean isPermisoTodoIngresosPromedios;
	public Boolean isPermisoNuevoIngresosPromedios;
	public Boolean isPermisoActualizarIngresosPromedios;
	public Boolean isPermisoActualizarOriginalIngresosPromedios;
	public Boolean isPermisoEliminarIngresosPromedios;
	public Boolean isPermisoGuardarCambiosIngresosPromedios;
	public Boolean isPermisoConsultaIngresosPromedios;
	public Boolean isPermisoBusquedaIngresosPromedios;
	public Boolean isPermisoReporteIngresosPromedios;
	public Boolean isPermisoPaginacionMedioIngresosPromedios;
	public Boolean isPermisoPaginacionAltoIngresosPromedios;
	public Boolean isPermisoPaginacionTodoIngresosPromedios;
	public Boolean isPermisoCopiarIngresosPromedios;
	public Boolean isPermisoVerFormIngresosPromedios;
	public Boolean isPermisoDuplicarIngresosPromedios;
	public Boolean isPermisoOrdenIngresosPromedios;
	
	
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
	
	public IngresosPromediosParameterReturnGeneral ingresospromediosReturnGeneral;
	public IngresosPromediosParameterReturnGeneral ingresospromediosParameterGeneral;
	
	 	
	public JasperPrint jasperPrint = null;
	
	public Long lIdUsuarioSesion=0L;				
	
	public Boolean isEsNuevoIngresosPromedios=false;
	public Boolean esParaAccionDesdeFormularioIngresosPromedios=false;
	public Boolean isEsMantenimientoRelacionesRelacionadoUnico=false;
	public Boolean isEsMantenimientoRelaciones=false;
	public Boolean isEsMantenimientoRelacionado=false;	
	public Boolean isContieneImagenes=false;
		
	//public Boolean conTotales=false; //Viene heredado de JInternalFrameBase
	//public Boolean esParaBusquedaForeignKey=false;
	
	
	protected IngresosPromediosSessionBeanAdditional ingresospromediosSessionBeanAdditional=null;
	
	public IngresosPromediosSessionBeanAdditional getIngresosPromediosSessionBeanAdditional() {
		return this.ingresospromediosSessionBeanAdditional;
	}
	
	public void setIngresosPromediosSessionBeanAdditional(IngresosPromediosSessionBeanAdditional ingresospromediosSessionBeanAdditional) {
		try {
			this.ingresospromediosSessionBeanAdditional=ingresospromediosSessionBeanAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	protected IngresosPromediosBeanSwingJInternalFrameAdditional ingresospromediosBeanSwingJInternalFrameAdditional=null;
	//public class IngresosPromediosBeanSwingJInternalFrame
	
	public IngresosPromediosBeanSwingJInternalFrameAdditional getIngresosPromediosBeanSwingJInternalFrameAdditional() {
		return this.ingresospromediosBeanSwingJInternalFrameAdditional;
	}
	
	public void setIngresosPromediosBeanSwingJInternalFrameAdditional(IngresosPromediosBeanSwingJInternalFrameAdditional ingresospromediosBeanSwingJInternalFrameAdditional) {
		try {
			this.ingresospromediosBeanSwingJInternalFrameAdditional=ingresospromediosBeanSwingJInternalFrameAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	//ESTA EN PADRE
	
	//public IngresosPromediosLogic ingresospromediosLogic;
	public SistemaLogicAdditional sistemaLogicAdditional;
	
	
	public IngresosPromedios ingresospromediosBean;
	public IngresosPromediosConstantesFunciones ingresospromediosConstantesFunciones;
	//public IngresosPromediosParameterReturnGeneral ingresospromediosReturnGeneral;
	
	//FK
	
	public EstructuraLogic estructuraLogic;
	public EmpresaLogic empresaLogic;
	public AnioLogic anioLogic;
	public MesLogic mesLogic;
	
	//PARAMETROS
	
	
	//public List<IngresosPromedios> ingresospromedioss;	
	//public List<IngresosPromedios> ingresospromediossEliminados;
	//public List<IngresosPromedios> ingresospromediossAux;
	
	public String sAccionMantenimiento="";
	public String sAccionBusqueda="";
	public String sAccionAdicional="";
	public String sUltimaBusqueda="";
	
	public Mensaje mensaje;
	
	
	public String sVisibilidadTablaBusquedas="";					
	public String sVisibilidadTablaElementos="";	
	public String sVisibilidadTablaAcciones="";			
	
	public Boolean isVisibilidadCeldaNuevoIngresosPromedios=false;
	public Boolean isVisibilidadCeldaDuplicarIngresosPromedios=true;
	public Boolean isVisibilidadCeldaCopiarIngresosPromedios=true;
	public Boolean isVisibilidadCeldaVerFormIngresosPromedios=true;
	public Boolean isVisibilidadCeldaOrdenIngresosPromedios=true;
	public Boolean isVisibilidadCeldaNuevoRelacionesIngresosPromedios=false;
	public Boolean isVisibilidadCeldaModificarIngresosPromedios=false;
	public Boolean isVisibilidadCeldaActualizarIngresosPromedios=false;
	public Boolean isVisibilidadCeldaEliminarIngresosPromedios=false;
	public Boolean isVisibilidadCeldaCancelarIngresosPromedios=false;
	public Boolean isVisibilidadCeldaGuardarIngresosPromedios=false;	
	public Boolean isVisibilidadCeldaGuardarCambiosIngresosPromedios=false;	
	
	
	public Boolean isVisibilidadBusquedaIngresosPromedios=false;
	public Boolean isVisibilidadFK_IdAnio=false;
	public Boolean isVisibilidadFK_IdEmpresa=false;
	public Boolean isVisibilidadFK_IdEstructura=false;
	public Boolean isVisibilidadFK_IdMes=false;
	
	public Long getiIdNuevoIngresosPromedios() {
		return this.iIdNuevoIngresosPromedios;
	}

	public void setiIdNuevoIngresosPromedios(Long iIdNuevoIngresosPromedios) {
		this.iIdNuevoIngresosPromedios = iIdNuevoIngresosPromedios;
	}
	
	public Long getidIngresosPromediosActual() {
		return this.idIngresosPromediosActual;
	}

	public void setidIngresosPromediosActual(Long idIngresosPromediosActual) {
		this.idIngresosPromediosActual = idIngresosPromediosActual;
	}
	
	public int getrowIndexActual() {
		return this.rowIndexActual;
	}

	public void setrowIndexActual(int rowIndexActual) {
		this.rowIndexActual=rowIndexActual;
	}
	
	
	public IngresosPromedios getingresospromedios() {
		return this.ingresospromedios;
	}

	public void setingresospromedios(IngresosPromedios ingresospromedios) {
		this.ingresospromedios = ingresospromedios;
	}
	
	public IngresosPromedios getingresospromediosAux() {
		return this.ingresospromediosAux;
	}

	public void setingresospromediosAux(IngresosPromedios ingresospromediosAux) {
		this.ingresospromediosAux = ingresospromediosAux;
	}				
	
	public IngresosPromedios getingresospromediosAnterior() {
		return this.ingresospromediosAnterior;
	}

	public void setingresospromediosAnterior(IngresosPromedios ingresospromediosAnterior) {
		this.ingresospromediosAnterior = ingresospromediosAnterior;
	}	
	
	public IngresosPromedios getingresospromediosTotales() {
		return this.ingresospromediosTotales;
	}

	public void setingresospromediosTotales(IngresosPromedios ingresospromediosTotales) {
		this.ingresospromediosTotales = ingresospromediosTotales;
	}	
	
	public IngresosPromedios getingresospromediosBean() {
		return this.ingresospromediosBean;
	}

	public void setingresospromediosBean(IngresosPromedios ingresospromediosBean) {
		this.ingresospromediosBean = ingresospromediosBean;
	}	
	
	public IngresosPromediosParameterReturnGeneral getingresospromediosReturnGeneral() {
		return this.ingresospromediosReturnGeneral;
	}

	public void setingresospromediosReturnGeneral(IngresosPromediosParameterReturnGeneral ingresospromediosReturnGeneral) {
		this.ingresospromediosReturnGeneral = ingresospromediosReturnGeneral;
	}	
	
	
	public Long id_estructuraBusquedaIngresosPromedios=-1L;

	public Long getid_estructuraBusquedaIngresosPromedios() {
		return this.id_estructuraBusquedaIngresosPromedios;
	}

	public void setid_estructuraBusquedaIngresosPromedios(Long id_estructuraBusquedaIngresosPromedios) {
		this.id_estructuraBusquedaIngresosPromedios = id_estructuraBusquedaIngresosPromedios;
	}

;
	public String codigoBusquedaIngresosPromedios="";

	public String getcodigoBusquedaIngresosPromedios() {
		return this.codigoBusquedaIngresosPromedios;
	}

	public void setcodigoBusquedaIngresosPromedios(String codigoBusquedaIngresosPromedios) {
		this.codigoBusquedaIngresosPromedios = codigoBusquedaIngresosPromedios;
	}

;
	public Long id_anioBusquedaIngresosPromedios=null;

	public Long getid_anioBusquedaIngresosPromedios() {
		return this.id_anioBusquedaIngresosPromedios;
	}

	public void setid_anioBusquedaIngresosPromedios(Long id_anioBusquedaIngresosPromedios) {
		this.id_anioBusquedaIngresosPromedios = id_anioBusquedaIngresosPromedios;
	}

;
	public Long id_mesBusquedaIngresosPromedios=null;

	public Long getid_mesBusquedaIngresosPromedios() {
		return this.id_mesBusquedaIngresosPromedios;
	}

	public void setid_mesBusquedaIngresosPromedios(Long id_mesBusquedaIngresosPromedios) {
		this.id_mesBusquedaIngresosPromedios = id_mesBusquedaIngresosPromedios;
	}

	public Long id_anioFK_IdAnio=null;

	public Long getid_anioFK_IdAnio() {
		return this.id_anioFK_IdAnio;
	}

	public void setid_anioFK_IdAnio(Long id_anioFK_IdAnio) {
		this.id_anioFK_IdAnio = id_anioFK_IdAnio;
	}

	public Long id_empresaFK_IdEmpresa=-1L;

	public Long getid_empresaFK_IdEmpresa() {
		return this.id_empresaFK_IdEmpresa;
	}

	public void setid_empresaFK_IdEmpresa(Long id_empresaFK_IdEmpresa) {
		this.id_empresaFK_IdEmpresa = id_empresaFK_IdEmpresa;
	}

	public Long id_estructuraFK_IdEstructura=-1L;

	public Long getid_estructuraFK_IdEstructura() {
		return this.id_estructuraFK_IdEstructura;
	}

	public void setid_estructuraFK_IdEstructura(Long id_estructuraFK_IdEstructura) {
		this.id_estructuraFK_IdEstructura = id_estructuraFK_IdEstructura;
	}

	public Long id_mesFK_IdMes=null;

	public Long getid_mesFK_IdMes() {
		return this.id_mesFK_IdMes;
	}

	public void setid_mesFK_IdMes(Long id_mesFK_IdMes) {
		this.id_mesFK_IdMes = id_mesFK_IdMes;
	}

		
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	
	public IngresosPromediosLogic getIngresosPromediosLogic()	{		
		return ingresospromediosLogic;
	}

	public void setIngresosPromediosLogic(IngresosPromediosLogic ingresospromediosLogic) {
		this.ingresospromediosLogic = ingresospromediosLogic;
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
	
	public Boolean getIsEsNuevoIngresosPromedios() {
		return isEsNuevoIngresosPromedios;
	}

	public void setIsEsNuevoIngresosPromedios(Boolean isEsNuevoIngresosPromedios) {
		this.isEsNuevoIngresosPromedios = isEsNuevoIngresosPromedios;
	}

	public Boolean getEsParaAccionDesdeFormularioIngresosPromedios() {
		return esParaAccionDesdeFormularioIngresosPromedios;
	}
	
	public void setEsParaAccionDesdeFormularioIngresosPromedios(Boolean esParaAccionDesdeFormularioIngresosPromedios) {
		this.esParaAccionDesdeFormularioIngresosPromedios = esParaAccionDesdeFormularioIngresosPromedios;
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
	
	
	public void cargarCombosEstructurasForeignKeyLista(String sFinalQuery)throws Exception
	{
		try
		{
			this.estructurasForeignKey=new ArrayList<Estructura>();

			ArrayList<Classe> clases=new ArrayList<Classe>();
			ArrayList<String> arrClasses=new ArrayList<String>();
			Classe classe=new Classe();
			DatosDeep datosDeep=new DatosDeep(false,DeepLoadType.INCLUDE,clases,"");

			EstructuraLogic estructuraLogic=new EstructuraLogic();

			estructuraLogic.getEstructuraDataAccess().setIsForForeingKeyData(true);

			if(this.ingresospromediosSessionBean==null) {
				this.ingresospromediosSessionBean=new IngresosPromediosSessionBean();
			}

			if(!this.ingresospromediosSessionBean.getisBusquedaDesdeForeignKeySesionEstructura()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					estructuraLogic.getEstructuraDataAccess().setIsForForeingKeyData(true);

					estructuraLogic.getTodosEstructurasWithConnection(sFinalQuery,new Pagination());

					this.estructurasForeignKey=estructuraLogic.getEstructuras();

				} else if(Constantes.ISUSAEJBREMOTE) {

				} else if(Constantes.ISUSAEJBHOME) {
				}


				//ARCHITECTURE
			} else {
				if(!this.conCargarMinimo) {
					this.setVisibilidadBusquedasParaEstructura(true);
				}
				//ARCHITECTURE

				if(Constantes.ISUSAEJBLOGICLAYER) {
					estructuraLogic.getEntityWithConnection(ingresospromediosSessionBean.getlidEstructuraActual());
					this.estructurasForeignKey.add(estructuraLogic.getEstructura());
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

			if(this.ingresospromediosSessionBean==null) {
				this.ingresospromediosSessionBean=new IngresosPromediosSessionBean();
			}

			if(!this.ingresospromediosSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {
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
					empresaLogic.getEntityWithConnection(ingresospromediosSessionBean.getlidEmpresaActual());
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

	public void cargarCombosAniosForeignKeyLista(String sFinalQuery)throws Exception
	{
		try
		{
			this.aniosForeignKey=new ArrayList<Anio>();

			ArrayList<Classe> clases=new ArrayList<Classe>();
			ArrayList<String> arrClasses=new ArrayList<String>();
			Classe classe=new Classe();
			DatosDeep datosDeep=new DatosDeep(false,DeepLoadType.INCLUDE,clases,"");

			AnioLogic anioLogic=new AnioLogic();

			//anioLogic.getAnioDataAccess().setIsForForeingKeyData(true);

			if(this.ingresospromediosSessionBean==null) {
				this.ingresospromediosSessionBean=new IngresosPromediosSessionBean();
			}

			if(!this.ingresospromediosSessionBean.getisBusquedaDesdeForeignKeySesionAnio()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//anioLogic.getAnioDataAccess().setIsForForeingKeyData(true);

					anioLogic.getTodosAniosWithConnection(sFinalQuery,new Pagination());

					this.aniosForeignKey=anioLogic.getAnios();

				} else if(Constantes.ISUSAEJBREMOTE) {

				} else if(Constantes.ISUSAEJBHOME) {
				}


				//ARCHITECTURE
			} else {
				if(!this.conCargarMinimo) {
					this.setVisibilidadBusquedasParaAnio(true);
				}
				//ARCHITECTURE

				if(Constantes.ISUSAEJBLOGICLAYER) {
					anioLogic.getEntityWithConnection(ingresospromediosSessionBean.getlidAnioActual());
					this.aniosForeignKey.add(anioLogic.getAnio());
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

	public void cargarCombosMessForeignKeyLista(String sFinalQuery)throws Exception
	{
		try
		{
			this.messForeignKey=new ArrayList<Mes>();

			ArrayList<Classe> clases=new ArrayList<Classe>();
			ArrayList<String> arrClasses=new ArrayList<String>();
			Classe classe=new Classe();
			DatosDeep datosDeep=new DatosDeep(false,DeepLoadType.INCLUDE,clases,"");

			MesLogic mesLogic=new MesLogic();

			//mesLogic.getMesDataAccess().setIsForForeingKeyData(true);

			if(this.ingresospromediosSessionBean==null) {
				this.ingresospromediosSessionBean=new IngresosPromediosSessionBean();
			}

			if(!this.ingresospromediosSessionBean.getisBusquedaDesdeForeignKeySesionMes()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//mesLogic.getMesDataAccess().setIsForForeingKeyData(true);

					mesLogic.getTodosMessWithConnection(sFinalQuery,new Pagination());

					this.messForeignKey=mesLogic.getMess();

				} else if(Constantes.ISUSAEJBREMOTE) {

				} else if(Constantes.ISUSAEJBHOME) {
				}


				//ARCHITECTURE
			} else {
				if(!this.conCargarMinimo) {
					this.setVisibilidadBusquedasParaMes(true);
				}
				//ARCHITECTURE

				if(Constantes.ISUSAEJBLOGICLAYER) {
					mesLogic.getEntityWithConnection(ingresospromediosSessionBean.getlidMesActual());
					this.messForeignKey.add(mesLogic.getMes());
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

	
	
	public void setActualEstructuraForeignKey(Long idEstructuraSeleccionado,Boolean conCombosBusquedas,String sFormularioTipoBusqueda)throws Exception
	{
		try
		{
			Estructura  estructuraTemp=null;

			for(Estructura estructuraAux:estructurasForeignKey) {
				if(estructuraAux.getId()!=null && estructuraAux.getId().equals(idEstructuraSeleccionado)) {
					estructuraTemp=estructuraAux;
					break;
				}
			}

			if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){
				if(estructuraTemp!=null) {

					if(this.ingresospromedios!=null) {
						this.ingresospromedios.setEstructura(estructuraTemp);
					}

					if(this.jInternalFrameDetalleFormIngresosPromedios!=null) {
						this.jInternalFrameDetalleFormIngresosPromedios.jComboBoxid_estructuraIngresosPromedios.setSelectedItem(estructuraTemp);
					}
				} else {
					//jComboBoxid_estructuraIngresosPromedios.setSelectedItem(estructuraTemp);
					if(this.jInternalFrameDetalleFormIngresosPromedios!=null) {
						if(this.jInternalFrameDetalleFormIngresosPromedios.jComboBoxid_estructuraIngresosPromedios.getItemCount()>0) {
							this.jInternalFrameDetalleFormIngresosPromedios.jComboBoxid_estructuraIngresosPromedios.setSelectedIndex(0);
						}
					}
				}
			}

			if(conCombosBusquedas) {

		//BYDAN_BUSQUEDAS
						
				if(sFormularioTipoBusqueda.equals("BusquedaIngresosPromedios") || sFormularioTipoBusqueda.equals("Todos")){
					if(estructuraTemp!=null && jComboBoxid_estructuraBusquedaIngresosPromediosIngresosPromedios!=null) {
						jComboBoxid_estructuraBusquedaIngresosPromediosIngresosPromedios.setSelectedItem(estructuraTemp);
					} else {
						if(jComboBoxid_estructuraBusquedaIngresosPromediosIngresosPromedios!=null) {
							//jComboBoxid_estructuraBusquedaIngresosPromediosIngresosPromedios.setSelectedItem(estructuraTemp);
							if(jComboBoxid_estructuraBusquedaIngresosPromediosIngresosPromedios.getItemCount()>0) {
								jComboBoxid_estructuraBusquedaIngresosPromediosIngresosPromedios.setSelectedIndex(0);
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

	public String getActualEstructuraForeignKeyDescripcion(Long idEstructuraSeleccionado)throws Exception
	{
		String sDescripcion="";

		try
		{
			Estructura  estructuraTemp=null;

			for(Estructura estructuraAux:estructurasForeignKey) {
				if(estructuraAux.getId()!=null && estructuraAux.getId().equals(idEstructuraSeleccionado)) {
					estructuraTemp=estructuraAux;
					break;
				}
			}


			sDescripcion=EstructuraConstantesFunciones.getEstructuraDescripcion(estructuraTemp);
		}
		catch(Exception e)
		{
			throw e;
		}

		return sDescripcion;
	}

	@SuppressWarnings("rawtypes")
	public void setActualEstructuraForeignKeyGenerico(Long idEstructuraSeleccionado,JComboBox jComboBoxid_estructuraIngresosPromediosGenerico)throws Exception
	{
		try
		{
			Estructura  estructuraTemp=null;

			for(Estructura estructuraAux:estructurasForeignKey) {
				if(estructuraAux.getId()!=null && estructuraAux.getId().equals(idEstructuraSeleccionado)) {
					estructuraTemp=estructuraAux;
					break;
				}
			}

			if(estructuraTemp!=null) {
				jComboBoxid_estructuraIngresosPromediosGenerico.setSelectedItem(estructuraTemp);
			} else {
				if(jComboBoxid_estructuraIngresosPromediosGenerico!=null && jComboBoxid_estructuraIngresosPromediosGenerico.getItemCount()>0) {
					jComboBoxid_estructuraIngresosPromediosGenerico.setSelectedIndex(0);
				}
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

					if(this.ingresospromedios!=null) {
						this.ingresospromedios.setEmpresa(empresaTemp);
					}

					if(this.jInternalFrameDetalleFormIngresosPromedios!=null) {
						this.jInternalFrameDetalleFormIngresosPromedios.jComboBoxid_empresaIngresosPromedios.setSelectedItem(empresaTemp);
					}
				} else {
					//jComboBoxid_empresaIngresosPromedios.setSelectedItem(empresaTemp);
					if(this.jInternalFrameDetalleFormIngresosPromedios!=null) {
						if(this.jInternalFrameDetalleFormIngresosPromedios.jComboBoxid_empresaIngresosPromedios.getItemCount()>0) {
							this.jInternalFrameDetalleFormIngresosPromedios.jComboBoxid_empresaIngresosPromedios.setSelectedIndex(0);
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
	public void setActualEmpresaForeignKeyGenerico(Long idEmpresaSeleccionado,JComboBox jComboBoxid_empresaIngresosPromediosGenerico)throws Exception
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
				jComboBoxid_empresaIngresosPromediosGenerico.setSelectedItem(empresaTemp);
			} else {
				if(jComboBoxid_empresaIngresosPromediosGenerico!=null && jComboBoxid_empresaIngresosPromediosGenerico.getItemCount()>0) {
					jComboBoxid_empresaIngresosPromediosGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	public void setActualAnioForeignKey(Long idAnioSeleccionado,Boolean conCombosBusquedas,String sFormularioTipoBusqueda)throws Exception
	{
		try
		{
			Anio  anioTemp=null;

			for(Anio anioAux:aniosForeignKey) {
				if(anioAux.getId()!=null && anioAux.getId().equals(idAnioSeleccionado)) {
					anioTemp=anioAux;
					break;
				}
			}

			if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){
				if(anioTemp!=null) {

					if(this.ingresospromedios!=null) {
						this.ingresospromedios.setAnio(anioTemp);
					}

					if(this.jInternalFrameDetalleFormIngresosPromedios!=null) {
						this.jInternalFrameDetalleFormIngresosPromedios.jComboBoxid_anioIngresosPromedios.setSelectedItem(anioTemp);
					}
				} else {
					//jComboBoxid_anioIngresosPromedios.setSelectedItem(anioTemp);
					if(this.jInternalFrameDetalleFormIngresosPromedios!=null) {
						if(this.jInternalFrameDetalleFormIngresosPromedios.jComboBoxid_anioIngresosPromedios.getItemCount()>0) {
							this.jInternalFrameDetalleFormIngresosPromedios.jComboBoxid_anioIngresosPromedios.setSelectedIndex(0);
						}
					}
				}
			}

			if(conCombosBusquedas) {

		//BYDAN_BUSQUEDAS
						
				if(sFormularioTipoBusqueda.equals("BusquedaIngresosPromedios") || sFormularioTipoBusqueda.equals("Todos")){
					if(anioTemp!=null && jComboBoxid_anioBusquedaIngresosPromediosIngresosPromedios!=null) {
						jComboBoxid_anioBusquedaIngresosPromediosIngresosPromedios.setSelectedItem(anioTemp);
					} else {
						if(jComboBoxid_anioBusquedaIngresosPromediosIngresosPromedios!=null) {
							//jComboBoxid_anioBusquedaIngresosPromediosIngresosPromedios.setSelectedItem(anioTemp);
							if(jComboBoxid_anioBusquedaIngresosPromediosIngresosPromedios.getItemCount()>0) {
								jComboBoxid_anioBusquedaIngresosPromediosIngresosPromedios.setSelectedIndex(0);
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

	public String getActualAnioForeignKeyDescripcion(Long idAnioSeleccionado)throws Exception
	{
		String sDescripcion="";

		try
		{
			Anio  anioTemp=null;

			for(Anio anioAux:aniosForeignKey) {
				if(anioAux.getId()!=null && anioAux.getId().equals(idAnioSeleccionado)) {
					anioTemp=anioAux;
					break;
				}
			}


			sDescripcion=AnioConstantesFunciones.getAnioDescripcion(anioTemp);
		}
		catch(Exception e)
		{
			throw e;
		}

		return sDescripcion;
	}

	@SuppressWarnings("rawtypes")
	public void setActualAnioForeignKeyGenerico(Long idAnioSeleccionado,JComboBox jComboBoxid_anioIngresosPromediosGenerico)throws Exception
	{
		try
		{
			Anio  anioTemp=null;

			for(Anio anioAux:aniosForeignKey) {
				if(anioAux.getId()!=null && anioAux.getId().equals(idAnioSeleccionado)) {
					anioTemp=anioAux;
					break;
				}
			}

			if(anioTemp!=null) {
				jComboBoxid_anioIngresosPromediosGenerico.setSelectedItem(anioTemp);
			} else {
				if(jComboBoxid_anioIngresosPromediosGenerico!=null && jComboBoxid_anioIngresosPromediosGenerico.getItemCount()>0) {
					jComboBoxid_anioIngresosPromediosGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	public void setActualMesForeignKey(Long idMesSeleccionado,Boolean conCombosBusquedas,String sFormularioTipoBusqueda)throws Exception
	{
		try
		{
			Mes  mesTemp=null;

			for(Mes mesAux:messForeignKey) {
				if(mesAux.getId()!=null && mesAux.getId().equals(idMesSeleccionado)) {
					mesTemp=mesAux;
					break;
				}
			}

			if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){
				if(mesTemp!=null) {

					if(this.ingresospromedios!=null) {
						this.ingresospromedios.setMes(mesTemp);
					}

					if(this.jInternalFrameDetalleFormIngresosPromedios!=null) {
						this.jInternalFrameDetalleFormIngresosPromedios.jComboBoxid_mesIngresosPromedios.setSelectedItem(mesTemp);
					}
				} else {
					//jComboBoxid_mesIngresosPromedios.setSelectedItem(mesTemp);
					if(this.jInternalFrameDetalleFormIngresosPromedios!=null) {
						if(this.jInternalFrameDetalleFormIngresosPromedios.jComboBoxid_mesIngresosPromedios.getItemCount()>0) {
							this.jInternalFrameDetalleFormIngresosPromedios.jComboBoxid_mesIngresosPromedios.setSelectedIndex(0);
						}
					}
				}
			}

			if(conCombosBusquedas) {

		//BYDAN_BUSQUEDAS
						
				if(sFormularioTipoBusqueda.equals("BusquedaIngresosPromedios") || sFormularioTipoBusqueda.equals("Todos")){
					if(mesTemp!=null && jComboBoxid_mesBusquedaIngresosPromediosIngresosPromedios!=null) {
						jComboBoxid_mesBusquedaIngresosPromediosIngresosPromedios.setSelectedItem(mesTemp);
					} else {
						if(jComboBoxid_mesBusquedaIngresosPromediosIngresosPromedios!=null) {
							//jComboBoxid_mesBusquedaIngresosPromediosIngresosPromedios.setSelectedItem(mesTemp);
							if(jComboBoxid_mesBusquedaIngresosPromediosIngresosPromedios.getItemCount()>0) {
								jComboBoxid_mesBusquedaIngresosPromediosIngresosPromedios.setSelectedIndex(0);
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

	public String getActualMesForeignKeyDescripcion(Long idMesSeleccionado)throws Exception
	{
		String sDescripcion="";

		try
		{
			Mes  mesTemp=null;

			for(Mes mesAux:messForeignKey) {
				if(mesAux.getId()!=null && mesAux.getId().equals(idMesSeleccionado)) {
					mesTemp=mesAux;
					break;
				}
			}


			sDescripcion=MesConstantesFunciones.getMesDescripcion(mesTemp);
		}
		catch(Exception e)
		{
			throw e;
		}

		return sDescripcion;
	}

	@SuppressWarnings("rawtypes")
	public void setActualMesForeignKeyGenerico(Long idMesSeleccionado,JComboBox jComboBoxid_mesIngresosPromediosGenerico)throws Exception
	{
		try
		{
			Mes  mesTemp=null;

			for(Mes mesAux:messForeignKey) {
				if(mesAux.getId()!=null && mesAux.getId().equals(idMesSeleccionado)) {
					mesTemp=mesAux;
					break;
				}
			}

			if(mesTemp!=null) {
				jComboBoxid_mesIngresosPromediosGenerico.setSelectedItem(mesTemp);
			} else {
				if(jComboBoxid_mesIngresosPromediosGenerico!=null && jComboBoxid_mesIngresosPromediosGenerico.getItemCount()>0) {
					jComboBoxid_mesIngresosPromediosGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	
	
	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarEstructuraForeignKey(IngresosPromedios ingresospromedios,JComboBox jComboBoxid_estructuraIngresosPromediosGenerico)throws Exception
	{
		try
		{
			Estructura  estructuraAux=new Estructura();

			if(jComboBoxid_estructuraIngresosPromediosGenerico==null) {
				estructuraAux=(Estructura)this.jInternalFrameDetalleFormIngresosPromedios.jComboBoxid_estructuraIngresosPromedios.getSelectedItem();
			} else {
				estructuraAux=(Estructura)jComboBoxid_estructuraIngresosPromediosGenerico.getSelectedItem();
			}

			if(estructuraAux!=null && estructuraAux.getId()!=null) {
				ingresospromedios.setid_estructura(estructuraAux.getId());
				ingresospromedios.setestructura_descripcion(IngresosPromediosConstantesFunciones.getEstructuraDescripcion(estructuraAux));
				ingresospromedios.setEstructura(estructuraAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarEmpresaForeignKey(IngresosPromedios ingresospromedios,JComboBox jComboBoxid_empresaIngresosPromediosGenerico)throws Exception
	{
		try
		{
			Empresa  empresaAux=new Empresa();

			if(jComboBoxid_empresaIngresosPromediosGenerico==null) {
				empresaAux=(Empresa)this.jInternalFrameDetalleFormIngresosPromedios.jComboBoxid_empresaIngresosPromedios.getSelectedItem();
			} else {
				empresaAux=(Empresa)jComboBoxid_empresaIngresosPromediosGenerico.getSelectedItem();
			}

			if(empresaAux!=null && empresaAux.getId()!=null) {
				ingresospromedios.setid_empresa(empresaAux.getId());
				ingresospromedios.setempresa_descripcion(IngresosPromediosConstantesFunciones.getEmpresaDescripcion(empresaAux));
				ingresospromedios.setEmpresa(empresaAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarAnioForeignKey(IngresosPromedios ingresospromedios,JComboBox jComboBoxid_anioIngresosPromediosGenerico)throws Exception
	{
		try
		{
			Anio  anioAux=new Anio();

			if(jComboBoxid_anioIngresosPromediosGenerico==null) {
				anioAux=(Anio)this.jInternalFrameDetalleFormIngresosPromedios.jComboBoxid_anioIngresosPromedios.getSelectedItem();
			} else {
				anioAux=(Anio)jComboBoxid_anioIngresosPromediosGenerico.getSelectedItem();
			}

			if(anioAux!=null) {
				ingresospromedios.setid_anio(anioAux.getId());
				ingresospromedios.setanio_descripcion(IngresosPromediosConstantesFunciones.getAnioDescripcion(anioAux));
				ingresospromedios.setAnio(anioAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarMesForeignKey(IngresosPromedios ingresospromedios,JComboBox jComboBoxid_mesIngresosPromediosGenerico)throws Exception
	{
		try
		{
			Mes  mesAux=new Mes();

			if(jComboBoxid_mesIngresosPromediosGenerico==null) {
				mesAux=(Mes)this.jInternalFrameDetalleFormIngresosPromedios.jComboBoxid_mesIngresosPromedios.getSelectedItem();
			} else {
				mesAux=(Mes)jComboBoxid_mesIngresosPromediosGenerico.getSelectedItem();
			}

			if(mesAux!=null) {
				ingresospromedios.setid_mes(mesAux.getId());
				ingresospromedios.setmes_descripcion(IngresosPromediosConstantesFunciones.getMesDescripcion(mesAux));
				ingresospromedios.setMes(mesAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	
	


		@SuppressWarnings({ "unchecked", "rawtypes" })
		public void cargarCombosFrameEstructurasForeignKey(String sFormularioTipoBusqueda)throws Exception {
			try {

				JComboBoxBinding jComboBoxBindingEstructura=null;

				if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){

					if(!IngresosPromediosJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormIngresosPromedios!=null) { 
							this.jInternalFrameDetalleFormIngresosPromedios.jComboBoxid_estructuraIngresosPromedios.removeAllItems();

							for(Estructura estructura:this.estructurasForeignKey) {
								this.jInternalFrameDetalleFormIngresosPromedios.jComboBoxid_estructuraIngresosPromedios.addItem(estructura);
							}
						}
					}

					if(this.jInternalFrameDetalleFormIngresosPromedios!=null) { 
					}

					if(!IngresosPromediosJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {

					if(sFormularioTipoBusqueda.equals("BusquedaIngresosPromedios") || sFormularioTipoBusqueda.equals("Todos")){

						//BYDAN_BUSQUEDAS
						
						if(!IngresosPromediosJInternalFrame.ISBINDING_MANUAL) {
						} else {
							this.jComboBoxid_estructuraBusquedaIngresosPromediosIngresosPromedios.removeAllItems();

							for(Estructura estructura:this.estructurasForeignKey) {
								this.jComboBoxid_estructuraBusquedaIngresosPromediosIngresosPromedios.addItem(estructura);
							}
						}

						if(!IngresosPromediosJInternalFrame.ISBINDING_MANUAL) {
						}

						
					}

				}

			}  catch(Exception e) {
				throw e;
			}
		}

		@SuppressWarnings({ "unchecked", "rawtypes" })
		public void cargarCombosFrameEmpresasForeignKey(String sFormularioTipoBusqueda)throws Exception {
			try {

				JComboBoxBinding jComboBoxBindingEmpresa=null;

				if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){

					if(!IngresosPromediosJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormIngresosPromedios!=null) { 
							this.jInternalFrameDetalleFormIngresosPromedios.jComboBoxid_empresaIngresosPromedios.removeAllItems();

							for(Empresa empresa:this.empresasForeignKey) {
								this.jInternalFrameDetalleFormIngresosPromedios.jComboBoxid_empresaIngresosPromedios.addItem(empresa);
							}
						}
					}

					if(this.jInternalFrameDetalleFormIngresosPromedios!=null) { 
					}

					if(!IngresosPromediosJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {


				}

			}  catch(Exception e) {
				throw e;
			}
		}

		@SuppressWarnings({ "unchecked", "rawtypes" })
		public void cargarCombosFrameAniosForeignKey(String sFormularioTipoBusqueda)throws Exception {
			try {

				JComboBoxBinding jComboBoxBindingAnio=null;

				if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){

					if(!IngresosPromediosJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormIngresosPromedios!=null) { 
							this.jInternalFrameDetalleFormIngresosPromedios.jComboBoxid_anioIngresosPromedios.removeAllItems();

							for(Anio anio:this.aniosForeignKey) {
								this.jInternalFrameDetalleFormIngresosPromedios.jComboBoxid_anioIngresosPromedios.addItem(anio);
							}
						}
					}

					if(this.jInternalFrameDetalleFormIngresosPromedios!=null) { 
					}

					if(!IngresosPromediosJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {

					if(sFormularioTipoBusqueda.equals("BusquedaIngresosPromedios") || sFormularioTipoBusqueda.equals("Todos")){

						//BYDAN_BUSQUEDAS
						
						if(!IngresosPromediosJInternalFrame.ISBINDING_MANUAL) {
						} else {
							this.jComboBoxid_anioBusquedaIngresosPromediosIngresosPromedios.removeAllItems();

							for(Anio anio:this.aniosForeignKey) {
								this.jComboBoxid_anioBusquedaIngresosPromediosIngresosPromedios.addItem(anio);
							}
						}

						if(!IngresosPromediosJInternalFrame.ISBINDING_MANUAL) {
						}

						
					}

				}

			}  catch(Exception e) {
				throw e;
			}
		}

		@SuppressWarnings({ "unchecked", "rawtypes" })
		public void cargarCombosFrameMessForeignKey(String sFormularioTipoBusqueda)throws Exception {
			try {

				JComboBoxBinding jComboBoxBindingMes=null;

				if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){

					if(!IngresosPromediosJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormIngresosPromedios!=null) { 
							this.jInternalFrameDetalleFormIngresosPromedios.jComboBoxid_mesIngresosPromedios.removeAllItems();

							for(Mes mes:this.messForeignKey) {
								this.jInternalFrameDetalleFormIngresosPromedios.jComboBoxid_mesIngresosPromedios.addItem(mes);
							}
						}
					}

					if(this.jInternalFrameDetalleFormIngresosPromedios!=null) { 
					}

					if(!IngresosPromediosJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {

					if(sFormularioTipoBusqueda.equals("BusquedaIngresosPromedios") || sFormularioTipoBusqueda.equals("Todos")){

						//BYDAN_BUSQUEDAS
						
						if(!IngresosPromediosJInternalFrame.ISBINDING_MANUAL) {
						} else {
							this.jComboBoxid_mesBusquedaIngresosPromediosIngresosPromedios.removeAllItems();

							for(Mes mes:this.messForeignKey) {
								this.jComboBoxid_mesBusquedaIngresosPromediosIngresosPromedios.addItem(mes);
							}
						}

						if(!IngresosPromediosJInternalFrame.ISBINDING_MANUAL) {
						}

						
					}

				}

			}  catch(Exception e) {
				throw e;
			}
		}

	


		public void setSelectedItemCombosFrameEstructuraForeignKey(Estructura estructura,int iIndexSelected,Boolean conSelectedIndex,Boolean conFormulario,Boolean conBusqueda)throws Exception {
			try {

				if(conFormulario) {
					if(!conSelectedIndex) {
						if(this.jInternalFrameDetalleFormIngresosPromedios!=null) {
							this.jInternalFrameDetalleFormIngresosPromedios.jComboBoxid_estructuraIngresosPromedios.setSelectedItem(estructura);
						}
					} else {
						if(this.jInternalFrameDetalleFormIngresosPromedios!=null) {
							this.jInternalFrameDetalleFormIngresosPromedios.jComboBoxid_estructuraIngresosPromedios.setSelectedIndex(iIndexSelected);
						}
					}
				}


				if(!this.conCargarMinimo) {
					if(conBusqueda) {

					//BYDAN_BUSQUEDAS
					
						if(!conSelectedIndex) {
							this.jComboBoxid_estructuraBusquedaIngresosPromediosIngresosPromedios.setSelectedItem(estructura);
						} else {
							this.jComboBoxid_estructuraBusquedaIngresosPromediosIngresosPromedios.setSelectedIndex(iIndexSelected);
						}

										}
				}
			} catch(Exception e) {
				throw e;
			}
		}

		public void setSelectedItemCombosFrameEmpresaForeignKey(Empresa empresa,int iIndexSelected,Boolean conSelectedIndex,Boolean conFormulario,Boolean conBusqueda)throws Exception {
			try {

				if(conFormulario) {
					if(!conSelectedIndex) {
						if(this.jInternalFrameDetalleFormIngresosPromedios!=null) {
							this.jInternalFrameDetalleFormIngresosPromedios.jComboBoxid_empresaIngresosPromedios.setSelectedItem(empresa);
						}
					} else {
						if(this.jInternalFrameDetalleFormIngresosPromedios!=null) {
							this.jInternalFrameDetalleFormIngresosPromedios.jComboBoxid_empresaIngresosPromedios.setSelectedIndex(iIndexSelected);
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

		public void setSelectedItemCombosFrameAnioForeignKey(Anio anio,int iIndexSelected,Boolean conSelectedIndex,Boolean conFormulario,Boolean conBusqueda)throws Exception {
			try {

				if(conFormulario) {
					if(!conSelectedIndex) {
						if(this.jInternalFrameDetalleFormIngresosPromedios!=null) {
							this.jInternalFrameDetalleFormIngresosPromedios.jComboBoxid_anioIngresosPromedios.setSelectedItem(anio);
						}
					} else {
						if(this.jInternalFrameDetalleFormIngresosPromedios!=null) {
							this.jInternalFrameDetalleFormIngresosPromedios.jComboBoxid_anioIngresosPromedios.setSelectedIndex(iIndexSelected);
						}
					}
				}


				if(!this.conCargarMinimo) {
					if(conBusqueda) {

					//BYDAN_BUSQUEDAS
					
						if(!conSelectedIndex) {
							this.jComboBoxid_anioBusquedaIngresosPromediosIngresosPromedios.setSelectedItem(anio);
						} else {
							this.jComboBoxid_anioBusquedaIngresosPromediosIngresosPromedios.setSelectedIndex(iIndexSelected);
						}

										}
				}
			} catch(Exception e) {
				throw e;
			}
		}

		public void setSelectedItemCombosFrameMesForeignKey(Mes mes,int iIndexSelected,Boolean conSelectedIndex,Boolean conFormulario,Boolean conBusqueda)throws Exception {
			try {

				if(conFormulario) {
					if(!conSelectedIndex) {
						if(this.jInternalFrameDetalleFormIngresosPromedios!=null) {
							this.jInternalFrameDetalleFormIngresosPromedios.jComboBoxid_mesIngresosPromedios.setSelectedItem(mes);
						}
					} else {
						if(this.jInternalFrameDetalleFormIngresosPromedios!=null) {
							this.jInternalFrameDetalleFormIngresosPromedios.jComboBoxid_mesIngresosPromedios.setSelectedIndex(iIndexSelected);
						}
					}
				}


				if(!this.conCargarMinimo) {
					if(conBusqueda) {

					//BYDAN_BUSQUEDAS
					
						if(!conSelectedIndex) {
							this.jComboBoxid_mesBusquedaIngresosPromediosIngresosPromedios.setSelectedItem(mes);
						} else {
							this.jComboBoxid_mesBusquedaIngresosPromediosIngresosPromedios.setSelectedIndex(iIndexSelected);
						}

										}
				}
			} catch(Exception e) {
				throw e;
			}
		}

	


	
	public void refrescarForeignKeysDescripcionesIngresosPromedios() throws Exception {
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
		
	public IngresosPromediosParameterReturnGeneral getIngresosPromediosParameterGeneral() {
		return this.ingresospromediosParameterGeneral;
	}
	
	public void setIngresosPromediosParameterGeneral(IngresosPromediosParameterReturnGeneral ingresospromediosParameterGeneral) {
		this.ingresospromediosParameterGeneral = ingresospromediosParameterGeneral;
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
	
	public Boolean getIsPermisoTodoIngresosPromedios() {
		return isPermisoTodoIngresosPromedios;
	}

	public void setIsPermisoTodoIngresosPromedios(Boolean isPermisoTodoIngresosPromedios) {
		this.isPermisoTodoIngresosPromedios = isPermisoTodoIngresosPromedios;
	}

	public Boolean getIsPermisoNuevoIngresosPromedios() {
		return isPermisoNuevoIngresosPromedios;
	}

	public void setIsPermisoNuevoIngresosPromedios(Boolean isPermisoNuevoIngresosPromedios) {
		this.isPermisoNuevoIngresosPromedios = isPermisoNuevoIngresosPromedios;
	}

	public Boolean getIsPermisoActualizarIngresosPromedios() {
		return isPermisoActualizarIngresosPromedios;
	}

	public void setIsPermisoActualizarIngresosPromedios(Boolean isPermisoActualizarIngresosPromedios) {
		this.isPermisoActualizarIngresosPromedios = isPermisoActualizarIngresosPromedios;
	}

	public Boolean getIsPermisoEliminarIngresosPromedios() {
		return isPermisoEliminarIngresosPromedios;
	}

	public void setIsPermisoEliminarIngresosPromedios(Boolean isPermisoEliminarIngresosPromedios) {
		this.isPermisoEliminarIngresosPromedios = isPermisoEliminarIngresosPromedios;
	}

	public Boolean getIsPermisoGuardarCambiosIngresosPromedios() {
		return isPermisoGuardarCambiosIngresosPromedios;
	}

	public void setIsPermisoGuardarCambiosIngresosPromedios(Boolean isPermisoGuardarCambiosIngresosPromedios) {
		this.isPermisoGuardarCambiosIngresosPromedios = isPermisoGuardarCambiosIngresosPromedios;
	}
	
	public Boolean getIsPermisoConsultaIngresosPromedios() {
		return isPermisoConsultaIngresosPromedios;
	}

	public void setIsPermisoConsultaIngresosPromedios(Boolean isPermisoConsultaIngresosPromedios) {
		this.isPermisoConsultaIngresosPromedios = isPermisoConsultaIngresosPromedios;
	}

	public Boolean getIsPermisoBusquedaIngresosPromedios() {
		return isPermisoBusquedaIngresosPromedios;
	}

	public void setIsPermisoBusquedaIngresosPromedios(Boolean isPermisoBusquedaIngresosPromedios) {
		this.isPermisoBusquedaIngresosPromedios = isPermisoBusquedaIngresosPromedios;
	}

	public Boolean getIsPermisoReporteIngresosPromedios() {
		return isPermisoReporteIngresosPromedios;
	}

	public void setIsPermisoReporteIngresosPromedios(Boolean isPermisoReporteIngresosPromedios) {
		this.isPermisoReporteIngresosPromedios = isPermisoReporteIngresosPromedios;
	}
	
	public Boolean getIsPermisoPaginacionMedioIngresosPromedios() {
		return isPermisoPaginacionMedioIngresosPromedios;
	}

	public void setIsPermisoPaginacionMedioIngresosPromedios(Boolean isPermisoPaginacionMedioIngresosPromedios) {
		this.isPermisoPaginacionMedioIngresosPromedios = isPermisoPaginacionMedioIngresosPromedios;
	}
	
	public Boolean getIsPermisoPaginacionTodoIngresosPromedios() {
		return isPermisoPaginacionTodoIngresosPromedios;
	}

	public void setIsPermisoPaginacionTodoIngresosPromedios(Boolean isPermisoPaginacionTodoIngresosPromedios) {
		this.isPermisoPaginacionTodoIngresosPromedios = isPermisoPaginacionTodoIngresosPromedios;
	}
	
	public Boolean getIsPermisoPaginacionAltoIngresosPromedios() {
		return isPermisoPaginacionAltoIngresosPromedios;
	}

	public void setIsPermisoPaginacionAltoIngresosPromedios(Boolean isPermisoPaginacionAltoIngresosPromedios) {
		this.isPermisoPaginacionAltoIngresosPromedios = isPermisoPaginacionAltoIngresosPromedios;
	}
	
	public Boolean getIsPermisoCopiarIngresosPromedios() {
		return isPermisoCopiarIngresosPromedios;
	}

	public void setIsPermisoCopiarIngresosPromedios(Boolean isPermisoCopiarIngresosPromedios) {
		this.isPermisoCopiarIngresosPromedios = isPermisoCopiarIngresosPromedios;
	}
	
	public Boolean getIsPermisoVerFormIngresosPromedios() {
		return isPermisoVerFormIngresosPromedios;
	}

	public void setIsPermisoVerFormIngresosPromedios(Boolean isPermisoVerFormIngresosPromedios) {
		this.isPermisoVerFormIngresosPromedios = isPermisoVerFormIngresosPromedios;
	}
	
	public Boolean getIsPermisoDuplicarIngresosPromedios() {
		return isPermisoDuplicarIngresosPromedios;
	}

	public void setIsPermisoDuplicarIngresosPromedios(Boolean isPermisoDuplicarIngresosPromedios) {
		this.isPermisoDuplicarIngresosPromedios = isPermisoDuplicarIngresosPromedios;
	}
	
	public Boolean getIsPermisoOrdenIngresosPromedios() {
		return isPermisoOrdenIngresosPromedios;
	}

	public void setIsPermisoOrdenIngresosPromedios(Boolean isPermisoOrdenIngresosPromedios) {
		this.isPermisoOrdenIngresosPromedios = isPermisoOrdenIngresosPromedios;
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
	
	public Boolean getIsVisibilidadCeldaNuevoIngresosPromedios() {
		return isVisibilidadCeldaNuevoIngresosPromedios;
	}

	public void setIsVisibilidadCeldaNuevoIngresosPromedios(Boolean isVisibilidadCeldaNuevoIngresosPromedios) {
		this.isVisibilidadCeldaNuevoIngresosPromedios = isVisibilidadCeldaNuevoIngresosPromedios;
	}
	
	public Boolean getIsVisibilidadCeldaDuplicarIngresosPromedios() {
		return isVisibilidadCeldaDuplicarIngresosPromedios;
	}

	public void setIsVisibilidadCeldaDuplicarIngresosPromedios(Boolean isVisibilidadCeldaDuplicarIngresosPromedios) {
		this.isVisibilidadCeldaDuplicarIngresosPromedios = isVisibilidadCeldaDuplicarIngresosPromedios;
	}
	
	public Boolean getIsVisibilidadCeldaCopiarIngresosPromedios() {
		return isVisibilidadCeldaCopiarIngresosPromedios;
	}

	public void setIsVisibilidadCeldaCopiarIngresosPromedios(Boolean isVisibilidadCeldaCopiarIngresosPromedios) {
		this.isVisibilidadCeldaCopiarIngresosPromedios = isVisibilidadCeldaCopiarIngresosPromedios;
	}
	
	public Boolean getIsVisibilidadCeldaVerFormIngresosPromedios() {
		return isVisibilidadCeldaVerFormIngresosPromedios;
	}

	public void setIsVisibilidadCeldaVerFormIngresosPromedios(Boolean isVisibilidadCeldaVerFormIngresosPromedios) {
		this.isVisibilidadCeldaVerFormIngresosPromedios = isVisibilidadCeldaVerFormIngresosPromedios;
	}
	
	public Boolean getIsVisibilidadCeldaOrdenIngresosPromedios() {
		return isVisibilidadCeldaOrdenIngresosPromedios;
	}

	public void setIsVisibilidadCeldaOrdenIngresosPromedios(Boolean isVisibilidadCeldaOrdenIngresosPromedios) {
		this.isVisibilidadCeldaOrdenIngresosPromedios = isVisibilidadCeldaOrdenIngresosPromedios;
	}
	
	public Boolean getIsVisibilidadCeldaNuevoRelacionesIngresosPromedios() {
		return isVisibilidadCeldaNuevoRelacionesIngresosPromedios;
	}

	public void setIsVisibilidadCeldaNuevoRelacionesIngresosPromedios(Boolean isVisibilidadCeldaNuevoRelacionesIngresosPromedios) {
		this.isVisibilidadCeldaNuevoRelacionesIngresosPromedios = isVisibilidadCeldaNuevoRelacionesIngresosPromedios;
	}
	
	public Boolean getIsVisibilidadCeldaModificarIngresosPromedios() {
		return isVisibilidadCeldaModificarIngresosPromedios;
	}

	public void setIsVisibilidadCeldaModificarIngresosPromedios(Boolean isVisibilidadCeldaModificarIngresosPromedios) {
		this.isVisibilidadCeldaModificarIngresosPromedios = isVisibilidadCeldaModificarIngresosPromedios;
	}
	
	public Boolean getIsVisibilidadCeldaActualizarIngresosPromedios() {
		return isVisibilidadCeldaActualizarIngresosPromedios;
	}

	public void setIsVisibilidadCeldaActualizarIngresosPromedios(Boolean isVisibilidadCeldaActualizarIngresosPromedios) {
		this.isVisibilidadCeldaActualizarIngresosPromedios = isVisibilidadCeldaActualizarIngresosPromedios;
	}

	public Boolean getIsVisibilidadCeldaEliminarIngresosPromedios() {
		return isVisibilidadCeldaEliminarIngresosPromedios;
	}

	public void setIsVisibilidadCeldaEliminarIngresosPromedios(Boolean isVisibilidadCeldaEliminarIngresosPromedios) {
		this.isVisibilidadCeldaEliminarIngresosPromedios = isVisibilidadCeldaEliminarIngresosPromedios;
	}

	public Boolean getIsVisibilidadCeldaCancelarIngresosPromedios() {
		return isVisibilidadCeldaCancelarIngresosPromedios;
	}

	public void setIsVisibilidadCeldaCancelarIngresosPromedios(Boolean isVisibilidadCeldaCancelarIngresosPromedios) {
		this.isVisibilidadCeldaCancelarIngresosPromedios = isVisibilidadCeldaCancelarIngresosPromedios;
	}

	public Boolean getIsVisibilidadCeldaGuardarIngresosPromedios() {
		return isVisibilidadCeldaGuardarIngresosPromedios;
	}

	public void setIsVisibilidadCeldaGuardarIngresosPromedios(Boolean isVisibilidadCeldaGuardarIngresosPromedios) {
		this.isVisibilidadCeldaGuardarIngresosPromedios = isVisibilidadCeldaGuardarIngresosPromedios;
	}
	
	public Boolean getIsVisibilidadCeldaGuardarCambiosIngresosPromedios() {
		return isVisibilidadCeldaGuardarCambiosIngresosPromedios;
	}

	public void setIsVisibilidadCeldaGuardarCambiosIngresosPromedios(Boolean isVisibilidadCeldaGuardarCambiosIngresosPromedios) {
		this.isVisibilidadCeldaGuardarCambiosIngresosPromedios = isVisibilidadCeldaGuardarCambiosIngresosPromedios;
	}
		
	public IngresosPromediosSessionBean getingresospromediosSessionBean() {
		return this.ingresospromediosSessionBean;
	}
	
	public void setingresospromediosSessionBean(IngresosPromediosSessionBean ingresospromediosSessionBean) {
		this.ingresospromediosSessionBean=ingresospromediosSessionBean;
	}
	
	
	public Boolean getisVisibilidadBusquedaIngresosPromedios() {
		return this.isVisibilidadBusquedaIngresosPromedios;
	}

	public void setisVisibilidadBusquedaIngresosPromedios(Boolean isVisibilidadBusquedaIngresosPromedios) {
		this.isVisibilidadBusquedaIngresosPromedios=isVisibilidadBusquedaIngresosPromedios;
	}

	public Boolean getisVisibilidadFK_IdAnio() {
		return this.isVisibilidadFK_IdAnio;
	}

	public void setisVisibilidadFK_IdAnio(Boolean isVisibilidadFK_IdAnio) {
		this.isVisibilidadFK_IdAnio=isVisibilidadFK_IdAnio;
	}

	public Boolean getisVisibilidadFK_IdEmpresa() {
		return this.isVisibilidadFK_IdEmpresa;
	}

	public void setisVisibilidadFK_IdEmpresa(Boolean isVisibilidadFK_IdEmpresa) {
		this.isVisibilidadFK_IdEmpresa=isVisibilidadFK_IdEmpresa;
	}

	public Boolean getisVisibilidadFK_IdEstructura() {
		return this.isVisibilidadFK_IdEstructura;
	}

	public void setisVisibilidadFK_IdEstructura(Boolean isVisibilidadFK_IdEstructura) {
		this.isVisibilidadFK_IdEstructura=isVisibilidadFK_IdEstructura;
	}

	public Boolean getisVisibilidadFK_IdMes() {
		return this.isVisibilidadFK_IdMes;
	}

	public void setisVisibilidadFK_IdMes(Boolean isVisibilidadFK_IdMes) {
		this.isVisibilidadFK_IdMes=isVisibilidadFK_IdMes;
	}

	
	
	public void setVariablesFormularioToObjetoActualForeignKeysIngresosPromedios(IngresosPromedios ingresospromedios)throws Exception {
		try {
			
				this.setActualParaGuardarEstructuraForeignKey(ingresospromedios,null);
				this.setActualParaGuardarEmpresaForeignKey(ingresospromedios,null);
				this.setActualParaGuardarAnioForeignKey(ingresospromedios,null);
				this.setActualParaGuardarMesForeignKey(ingresospromedios,null);
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
	
	public void bugActualizarReferenciaActual(IngresosPromedios ingresospromedios,IngresosPromedios ingresospromediosAux) throws Exception {
		//ARCHITECTURE		
		//EL ID NEGATIVO GUARDADO EN ORIGINAL SIRVE PARA VERIFICAR Y ACTUALIZAR EL REGISTRO NUEVO (ID,VERSIONROW)
		this.setCamposBaseDesdeOriginalIngresosPromedios(ingresospromedios);
					
		//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
		ingresospromediosAux.setId(ingresospromedios.getId());
		ingresospromediosAux.setVersionRow(ingresospromedios.getVersionRow());					
	}
	
	public void ejecutarMantenimiento(MaintenanceType maintenanceType)throws Exception {	
	}	
	
	public void actualizarRelaciones(IngresosPromedios ingresospromediosLocal) throws Exception {
		
		if(this.ingresospromediosSessionBean.getConGuardarRelaciones()) {			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
			
			
			} else {
				
			}
		}
	}
	
	public void actualizarRelacionFkPadreActual(IngresosPromedios ingresospromediosLocal) throws Exception {	
		if(this.ingresospromediosSessionBean.getEsGuardarRelacionado()) {			
			
		
			if(this.jInternalFrameParent.getClass().equals(EstructuraDetalleFormJInternalFrame.class)) {
				EstructuraBeanSwingJInternalFrame estructuraBeanSwingJInternalFrameLocal=(EstructuraBeanSwingJInternalFrame) ((EstructuraDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				estructuraBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoEstructura(estructuraBeanSwingJInternalFrameLocal.getestructura(),true);
				estructuraBeanSwingJInternalFrameLocal.actualizarLista(estructuraBeanSwingJInternalFrameLocal.estructura,this.estructurasForeignKey);

				estructuraBeanSwingJInternalFrameLocal.actualizarRelaciones(estructuraBeanSwingJInternalFrameLocal.estructura);

				ingresospromediosLocal.setEstructura(estructuraBeanSwingJInternalFrameLocal.estructura);

				this.addItemDefectoCombosForeignKeyEstructura();
				this.cargarCombosFrameEstructurasForeignKey("Formulario");
				this.setActualEstructuraForeignKey(estructuraBeanSwingJInternalFrameLocal.estructura.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(EmpresaDetalleFormJInternalFrame.class)) {
				EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrameLocal=(EmpresaBeanSwingJInternalFrame) ((EmpresaDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				empresaBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoEmpresa(empresaBeanSwingJInternalFrameLocal.getempresa(),true);
				empresaBeanSwingJInternalFrameLocal.actualizarLista(empresaBeanSwingJInternalFrameLocal.empresa,this.empresasForeignKey);

				empresaBeanSwingJInternalFrameLocal.actualizarRelaciones(empresaBeanSwingJInternalFrameLocal.empresa);

				ingresospromediosLocal.setEmpresa(empresaBeanSwingJInternalFrameLocal.empresa);

				this.addItemDefectoCombosForeignKeyEmpresa();
				this.cargarCombosFrameEmpresasForeignKey("Formulario");
				this.setActualEmpresaForeignKey(empresaBeanSwingJInternalFrameLocal.empresa.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(AnioDetalleFormJInternalFrame.class)) {
				AnioBeanSwingJInternalFrame anioBeanSwingJInternalFrameLocal=(AnioBeanSwingJInternalFrame) ((AnioDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				anioBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoAnio(anioBeanSwingJInternalFrameLocal.getanio(),true);
				anioBeanSwingJInternalFrameLocal.actualizarLista(anioBeanSwingJInternalFrameLocal.anio,this.aniosForeignKey);

				anioBeanSwingJInternalFrameLocal.actualizarRelaciones(anioBeanSwingJInternalFrameLocal.anio);

				ingresospromediosLocal.setAnio(anioBeanSwingJInternalFrameLocal.anio);

				this.addItemDefectoCombosForeignKeyAnio();
				this.cargarCombosFrameAniosForeignKey("Formulario");
				this.setActualAnioForeignKey(anioBeanSwingJInternalFrameLocal.anio.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(MesDetalleFormJInternalFrame.class)) {
				MesBeanSwingJInternalFrame mesBeanSwingJInternalFrameLocal=(MesBeanSwingJInternalFrame) ((MesDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				mesBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoMes(mesBeanSwingJInternalFrameLocal.getmes(),true);
				mesBeanSwingJInternalFrameLocal.actualizarLista(mesBeanSwingJInternalFrameLocal.mes,this.messForeignKey);

				mesBeanSwingJInternalFrameLocal.actualizarRelaciones(mesBeanSwingJInternalFrameLocal.mes);

				ingresospromediosLocal.setMes(mesBeanSwingJInternalFrameLocal.mes);

				this.addItemDefectoCombosForeignKeyMes();
				this.cargarCombosFrameMessForeignKey("Formulario");
				this.setActualMesForeignKey(mesBeanSwingJInternalFrameLocal.mes.getId(),false,"Formulario");
			}
		
		}
	}
	
	public Boolean validarIngresosPromediosActual() throws Exception {
		Boolean estaValidado=false;
		this.inicializarInvalidValues();
		
		/*
		int intSelectedRow = this.jTableDatosIngresosPromedios.getSelectedRow();
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.ingresospromedios =(IngresosPromedios) this.ingresospromediosLogic.getIngresosPromedioss().toArray()[this.jTableDatosIngresosPromedios.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
			this.ingresospromedios =(IngresosPromedios) this.ingresospromedioss.toArray()[this.jTableDatosIngresosPromedios.convertRowIndexToModel(intSelectedRow)];
		}
		//ARCHITECTURE
		*/
		
		this.invalidValues = ingresospromediosValidator.getInvalidValues(this.ingresospromedios);
					
		if(this.invalidValues==null || this.invalidValues.length<=0) {
			estaValidado=true;
		} else {
			this.mostrarInvalidValues();	
		}
		
		return estaValidado;
	}
	
	public void actualizarLista(IngresosPromedios ingresospromedios,List<IngresosPromedios> ingresospromedioss) throws Exception {
	}		
	
	public void actualizarSelectedLista(IngresosPromedios ingresospromedios,List<IngresosPromedios> ingresospromedioss) throws Exception {
		try	{			
			IngresosPromediosConstantesFunciones.actualizarSelectedLista(ingresospromedios,ingresospromedioss);
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public Boolean tieneElementosSeleccionados() throws Exception {
		Boolean tiene=false;
		
		List<IngresosPromedios> ingresospromediossLocal=null;
		
		try	{			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				ingresospromediossLocal=this.ingresospromediosLogic.getIngresosPromedioss();
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				ingresospromediossLocal=this.ingresospromedioss;
			}
			//ARCHITECTURE
		
			for(IngresosPromedios ingresospromediosLocal:ingresospromediossLocal) {
				if(this.permiteMantenimiento(ingresospromediosLocal) && ingresospromediosLocal.getIsSelected()) {
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
			sMensaje+="\r\n"+IngresosPromediosConstantesFunciones.getIngresosPromediosLabelDesdeNombre(invalidValue.getPropertyName())+"->"+invalidValue.getMessage();
			
			//MOSTRAR CAMPOS INVALIDOS
			if(invalidValue.getPropertyName().equals(IngresosPromediosConstantesFunciones.CODIGOCARGO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormIngresosPromedios.jLabelcodigo_cargoIngresosPromedios,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(IngresosPromediosConstantesFunciones.CODIGODATO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormIngresosPromedios.jLabelcodigo_datoIngresosPromedios,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(IngresosPromediosConstantesFunciones.NOMBRE)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormIngresosPromedios.jLabelnombreIngresosPromedios,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(IngresosPromediosConstantesFunciones.VALORPAGO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormIngresosPromedios.jLabelvalor_pagoIngresosPromedios,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(IngresosPromediosConstantesFunciones.NOMBRERUBROEMPLEA)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormIngresosPromedios.jLabelnombre_rubro_empleaIngresosPromedios,invalidValue.getMessage());}
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
		
		if(this.jInternalFrameDetalleFormIngresosPromedios!=null) {
		
		//MOSTRAR CAMPOS INVALIDOS
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormIngresosPromedios.jLabelcodigo_cargoIngresosPromedios,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormIngresosPromedios.jLabelcodigo_datoIngresosPromedios,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormIngresosPromedios.jLabelnombreIngresosPromedios,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormIngresosPromedios.jLabelvalor_pagoIngresosPromedios,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormIngresosPromedios.jLabelnombre_rubro_empleaIngresosPromedios,"");
		
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
		this.iIdNuevoIngresosPromedios--;	
		
		
		this.ingresospromediosAux=new IngresosPromedios();
		
		this.ingresospromediosAux.setId(this.iIdNuevoIngresosPromedios);
		this.ingresospromediosAux.setIsChanged(true);
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.ingresospromediosLogic.getIngresosPromedioss().add(this.ingresospromediosAux);
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.ingresospromedioss.add(this.ingresospromediosAux);
		}
		//ARCHITECTURE
		
		this.ingresospromedios=this.ingresospromediosAux;
		
		if(IngresosPromediosJInternalFrame.ISBINDING_MANUAL_TABLA) {
			this.setVariablesObjetoActualToFormularioIngresosPromedios(this.ingresospromedios);
			this.setVariablesObjetoActualToFormularioForeignKeyIngresosPromedios(this.ingresospromedios);
		}
				
		//this.setDefaultControlesIngresosPromedios();
		
		this.inicializarInvalidValues();
				
		//SELECCIONA ITEM DEFECTO-->SET O SELECTED INDEX
		this.setItemDefectoCombosForeignKeyIngresosPromedios();
		
		
		//INICIALIZA VARIABLES COMBOS GLOBALES A FORMULARIO(ParametroGeneralUsuario)
		this.setVariablesGlobalesCombosForeignKeyIngresosPromedios();
		
		//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
		//this.setVariablesGlobalesAuxiliaresCombosForeignKeyIngresosPromedios();
		
		//SI TIENE FOREIGN KEY CON CAMPO esDefecto=true, SE ACTUALIZA A OBJETO ACTUAL
		this.setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualIngresosPromedios(this.ingresospromediosBean,this.ingresospromedios,false,false);
		
		//ACTUALIZA VALORES PARA EL OBJETO ACTUAL ANTES DE ENVIARLO A ACTUALIZAR
		this.setVariablesFormularioToObjetoActualForeignKeysIngresosPromedios(this.ingresospromedios);
				
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		
		//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
		//this.setVariablesObjetoReturnGeneralToBeanIngresosPromedios(this.ingresospromediosReturnGeneral,this.ingresospromediosBean,false);
		
		if(this.ingresospromediosReturnGeneral.getConRecargarPropiedades()) {
			//INICIALIZA VARIABLES COMBOS NORMALES (FK)
			this.setVariablesObjetoActualToFormularioForeignKeyIngresosPromedios(this.ingresospromediosReturnGeneral.getIngresosPromedios());
			
			//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
			this.setVariablesObjetoActualToFormularioIngresosPromedios(this.ingresospromediosReturnGeneral.getIngresosPromedios());
		}
		
		if(this.ingresospromediosReturnGeneral.getConRecargarRelaciones()) {
			//INICIALIZA VARIABLES RELACIONES A FORMULARIO
			this.setVariablesRelacionesObjetoActualToFormularioIngresosPromedios(this.ingresospromediosReturnGeneral.getIngresosPromedios(),classes);//this.ingresospromediosBean);	
		}
			
		//ACTUALIZA VARIABLES FORMULARIO A OBJETO ACTUAL (PARA NUEVO TABLA O GUARDAR CAMBIOS
		if(esNuevoGuardarCambios) {
			this.setVariablesFormularioToObjetoActualIngresosPromedios(this.ingresospromedios,false);
		}
		
		//INICIALIZA VARIABLES COMBOS DEFAULT DEL PROYECTO(|DEFAULT para FK)
		//this.setVariablesDefaultCombosForeignKeyIngresosPromedios();
		
		//INICIALIZA VARIABLES COMBOS PARAMETRO DEL PROYECTO(|VALORPARAM Era para ParametroModulo, ahora en logic)
		//this.setVariablesParametroCombosForeignKeyIngresosPromedios();						
		
		if(!esNuevoGuardarCambios) {
			//INICIALIZA VARIABLES POR OPCION MENU
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			IngresosPromediosBeanSwingJInternalFrameAdditional.RecargarFormIngresosPromedios(this,"NUEVO_PREPARAR","",this.arrDatoGeneral);
		
			//NO FUNCIONA BINDINGS			
			this.inicializarActualizarBindingIngresosPromedios(false);
						
			if(ingresospromediosSessionBean.getConGuardarRelaciones()) {
				//DEBERIA YA ESTAR CARGADO LOS COMBOS Y SI SE NECESITA ALGO MAS SE DEBE CREAR FUNCION LIMITADA
				//SI DEBE TRAER Y RESETEAR TABLA
								
			}
				
			//SI ES MANUAL
			if(IngresosPromediosJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualIngresosPromedios();
			}
			
			this.actualizarVisualTableDatosIngresosPromedios();
			
			this.jTableDatosIngresosPromedios.setRowSelectionInterval(this.getIndiceNuevoIngresosPromedios(), this.getIndiceNuevoIngresosPromedios());
			
			this.seleccionarFilaTablaIngresosPromediosActual();
						
			this.actualizarEstadoCeldasBotonesIngresosPromedios("a", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		}		
	}
	
	public void habilitarDeshabilitarControlesIngresosPromedios(Boolean isHabilitar) throws Exception {
		
		this.jInternalFrameDetalleFormIngresosPromedios.jTextFieldcodigoIngresosPromedios.setEnabled(isHabilitar && this.ingresospromediosConstantesFunciones.activarcodigoIngresosPromedios);
		this.jInternalFrameDetalleFormIngresosPromedios.jTextFieldcodigo_cargoIngresosPromedios.setEnabled(isHabilitar && this.ingresospromediosConstantesFunciones.activarcodigo_cargoIngresosPromedios);
		this.jInternalFrameDetalleFormIngresosPromedios.jTextFieldcodigo_datoIngresosPromedios.setEnabled(isHabilitar && this.ingresospromediosConstantesFunciones.activarcodigo_datoIngresosPromedios);
		this.jInternalFrameDetalleFormIngresosPromedios.jTextAreanombreIngresosPromedios.setEnabled(isHabilitar && this.ingresospromediosConstantesFunciones.activarnombreIngresosPromedios);
		this.jInternalFrameDetalleFormIngresosPromedios.jTextFieldvalor_pagoIngresosPromedios.setEnabled(isHabilitar && this.ingresospromediosConstantesFunciones.activarvalor_pagoIngresosPromedios);
		this.jInternalFrameDetalleFormIngresosPromedios.jTextAreanombre_rubro_empleaIngresosPromedios.setEnabled(isHabilitar && this.ingresospromediosConstantesFunciones.activarnombre_rubro_empleaIngresosPromedios);	
		
		this.jInternalFrameDetalleFormIngresosPromedios.jComboBoxid_estructuraIngresosPromedios.setEnabled(isHabilitar && this.ingresospromediosConstantesFunciones.activarid_estructuraIngresosPromedios);//
		this.jInternalFrameDetalleFormIngresosPromedios.jComboBoxid_empresaIngresosPromedios.setEnabled(isHabilitar && this.ingresospromediosConstantesFunciones.activarid_empresaIngresosPromedios);
		this.jInternalFrameDetalleFormIngresosPromedios.jComboBoxid_anioIngresosPromedios.setEnabled(isHabilitar && this.ingresospromediosConstantesFunciones.activarid_anioIngresosPromedios);
		this.jInternalFrameDetalleFormIngresosPromedios.jComboBoxid_mesIngresosPromedios.setEnabled(isHabilitar && this.ingresospromediosConstantesFunciones.activarid_mesIngresosPromedios);
	};
	
	public void setDefaultControlesIngresosPromedios() throws Exception {
			
	};
	
	
	public void habilitarDeshabilitarTipoMantenimientoIngresosPromedios(Boolean esRelaciones) throws Exception {
		if(esRelaciones) {
			//this.ingresospromediosSessionBean.setConGuardarRelaciones(true);			
			this.ingresospromediosSessionBean.setEstaModoGuardarRelaciones(true);				
			this.jInternalFrameDetalleFormIngresosPromedios.jTabbedPaneRelacionesIngresosPromedios.setVisible(true);
			
					
		} else {
			//this.ingresospromediosSessionBean.setConGuardarRelaciones(false);			
			this.ingresospromediosSessionBean.setEstaModoGuardarRelaciones(false);						
			this.jInternalFrameDetalleFormIngresosPromedios.jTabbedPaneRelacionesIngresosPromedios.setVisible(false);
			
			
		}
	};
	
	public int getIndiceNuevoIngresosPromedios() throws Exception {
		int iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(IngresosPromedios ingresospromediosAux:this.ingresospromediosLogic.getIngresosPromedioss()) {
				if(ingresospromediosAux.getId().equals(this.iIdNuevoIngresosPromedios)) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(IngresosPromedios ingresospromediosAux:this.ingresospromedioss) {
				if(ingresospromediosAux.getId().equals(this.iIdNuevoIngresosPromedios)) {
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
	
	public int getIndiceActualIngresosPromedios(IngresosPromedios ingresospromedios,Integer iIndiceActual) throws Exception {
		Integer iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(IngresosPromedios ingresospromediosAux:this.ingresospromediosLogic.getIngresosPromedioss()) {
				if(ingresospromediosAux.getId().equals(ingresospromedios.getId())) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(IngresosPromedios ingresospromediosAux:this.ingresospromedioss) {
				if(ingresospromediosAux.getId().equals(ingresospromedios.getId())) {
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
	
	public void setCamposBaseDesdeOriginalIngresosPromedios(IngresosPromedios ingresospromediosOriginal) throws Exception {
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(IngresosPromedios ingresospromediosAux:this.ingresospromediosLogic.getIngresosPromedioss()) {
				if(ingresospromediosAux.getIngresosPromediosOriginal().getId().equals(ingresospromediosOriginal.getId())) {
					existe=true;
					ingresospromediosOriginal.setId(ingresospromediosAux.getId());
					ingresospromediosOriginal.setVersionRow(ingresospromediosAux.getVersionRow());
					break;
				}
				
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(IngresosPromedios ingresospromediosAux:this.ingresospromedioss) {
				if(ingresospromediosAux.getIngresosPromediosOriginal().getId().equals(ingresospromediosOriginal.getId())) {
					existe=true;
					ingresospromediosOriginal.setId(ingresospromediosAux.getId());
					ingresospromediosOriginal.setVersionRow(ingresospromediosAux.getVersionRow());
					break;
				}				
			}
		}
		//ARCHITECTURE
		
		if(!existe) {
			//SI NO EXISTE TOMA LA ULTIMA FILA
		}
	}
	
	public void cancelarNuevosIngresosPromedios(Boolean esParaCancelar) throws Exception {
		ingresospromediossAux=new ArrayList<IngresosPromedios>();
		ingresospromediosAux=new IngresosPromedios();
		
		if(!this.ingresospromediosSessionBean.getEsGuardarRelacionado()) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(IngresosPromedios ingresospromediosAux:this.ingresospromediosLogic.getIngresosPromedioss()) {
					if(ingresospromediosAux.getId()<0) {
						ingresospromediossAux.add(ingresospromediosAux);
					}		
				}
				this.iIdNuevoIngresosPromedios=0L;
				this.ingresospromediosLogic.getIngresosPromedioss().removeAll(ingresospromediossAux);
					
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(IngresosPromedios ingresospromediosAux:this.ingresospromedioss) {
					if(ingresospromediosAux.getId()<0) {
						ingresospromediossAux.add(ingresospromediosAux);
					}		
				}
				this.iIdNuevoIngresosPromedios=0L;
				this.ingresospromedioss.removeAll(ingresospromediossAux);
			}	
		} else {			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				if(esParaCancelar && this.isEsNuevoIngresosPromedios 
					&& this.ingresospromediosLogic.getIngresosPromedioss().size()>0
					) {
					ingresospromediosAux=this.ingresospromediosLogic.getIngresosPromedioss().get(this.ingresospromediosLogic.getIngresosPromedioss().size() - 1);
				
					if(ingresospromediosAux.getId()<0) {
						this.ingresospromediosLogic.getIngresosPromedioss().remove(ingresospromediosAux);
					}
				}
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				if(esParaCancelar && this.isEsNuevoIngresosPromedios && this.ingresospromedioss.size()>0) {
					ingresospromediosAux=this.ingresospromedioss.get(this.ingresospromedioss.size() - 1);
				
					if(ingresospromediosAux.getId()<0) {
						this.ingresospromedioss.remove(ingresospromediosAux);
					}
				}
			}	
		}
	}
	
	public void cancelarNuevoIngresosPromedios(Boolean esParaCancelar) throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			if(ingresospromedios.getId()<0) {
				this.ingresospromediosLogic.getIngresosPromedioss().remove(this.ingresospromedios);
			}					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			if(ingresospromedios.getId()<0) {
				this.ingresospromedioss.remove(this.ingresospromedios);
			}
		}			
	}
	
	public void setEstadosInicialesIngresosPromedios(List<IngresosPromedios> ingresospromediossAux) throws Exception {
		IngresosPromediosConstantesFunciones.setEstadosInicialesIngresosPromedios(ingresospromediossAux);
	}
	
	public void setEstadosInicialesIngresosPromedios(IngresosPromedios ingresospromediosAux) throws Exception {
		IngresosPromediosConstantesFunciones.setEstadosInicialesIngresosPromedios(ingresospromediosAux);		
	}
	
	public void nuevo() throws Exception {
		try	{
			//ESTA VALIDADO EN FUNCION ACTUALIZAR
			//if(this.validarIngresosPromediosActual()) {
				this.ejecutarMantenimiento(MaintenanceType.NUEVO);
				
				this.actualizarEstadoCeldasBotonesIngresosPromedios("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
				
			//}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,IngresosPromediosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void actualizar() throws Exception {
		try	{
			if(this.validarIngresosPromediosActual()) {
				if(!this.isEsNuevoIngresosPromedios) {
					this.ejecutarMantenimiento(MaintenanceType.ACTUALIZAR);
					
					this.actualizarEstadoCeldasBotonesIngresosPromedios("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
					
				} else {					
					this.nuevo();
					this.isEsNuevoIngresosPromedios=false;
				}
				
				//SE CANCELA AL FINAL DEL PROCESO JBUTTONACTUALIZAR
				//this.cancelar(false);
			}		
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,IngresosPromediosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void eliminar() throws Exception {
		try	{	
			if(this.validarIngresosPromediosActual()) {
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE ELIMINAR EL/LA Ingresos Promedios ?", "MANTENIMIENTO DE Ingresos Promedios", JOptionPane.OK_CANCEL_OPTION) == 0) {
					this.ejecutarMantenimiento(MaintenanceType.ELIMINAR);			
					this.actualizarEstadoCeldasBotonesIngresosPromedios("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
				}
			
			}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,IngresosPromediosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void guardarCambios() throws Exception {
		try	{
			this.ejecutarMantenimiento(MaintenanceType.GUARDARCAMBIOS);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,IngresosPromediosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarAsignar(IngresosPromedios ingresospromedios) throws Exception {
		IngresosPromediosConstantesFunciones.seleccionarAsignar(this.ingresospromedios,ingresospromedios);
	}
	
	public void seleccionar() throws Exception {
		try	{
			//ACTUALIZO EL PERMISO ACTUALIZAR CON EL PERMISO ACTUALIZAR ORIGINAL ESTE PERMISO SE UTILIZA PARA EL NUEVO TAMBIEN
			this.isPermisoActualizarIngresosPromedios=this.isPermisoActualizarOriginalIngresosPromedios;
			
			
			this.seleccionarAsignar(ingresospromedios);
			
			
			
			
			
			this.actualizarEstadoCeldasBotonesIngresosPromedios("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,IngresosPromediosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarBusqueda(Long id) throws Exception {
		try	{
			this.ingresospromediosSessionBean.setsFuncionBusquedaRapida(this.ingresospromediosSessionBean.getsFuncionBusquedaRapida().replace("TO_REPLACE", id.toString()));
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,IngresosPromediosConstantesFunciones.CLASSNAME);
		}
	}
	
	
	
	public void cancelar() throws Exception {
		this.cancelar(true);
	}
	
	public void cancelar(Boolean esParaCancelar) throws Exception {
		try {
														
			
			//SE UTILIZA COLUMNA ELIMINAR EN TABLA
			if(this.isEsNuevoIngresosPromedios) {
				//NO CANCELA TODOS NUEVOS POR FUNCIONALIDAD GUARDAR CAMBIOS
				//this.cancelarNuevosIngresosPromedios(esParaCancelar);				
				this.cancelarNuevoIngresosPromedios(esParaCancelar);								
			}
			
			this.ingresospromedios=new IngresosPromedios();
			
			this.inicializarIngresosPromedios();
			
			this.actualizarEstadoCeldasBotonesIngresosPromedios("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,IngresosPromediosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void inicializarIngresosPromedios() throws Exception {
		try {
			IngresosPromediosConstantesFunciones.inicializarIngresosPromedios(this.ingresospromedios);
			
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
			FuncionesSwing.manageException(this, e,logger,IngresosPromediosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void siguientes()throws Exception {
		try	{			
			if(this.ingresospromediosLogic.getIngresosPromedioss().size()>0) {
					
				this.iNumeroPaginacionPagina=this.iNumeroPaginacionPagina+this.iNumeroPaginacion;
			}
				
			this.procesarBusqueda(this.sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,IngresosPromediosConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void generarReporteIngresosPromedioss(String sAccionBusqueda,List<IngresosPromedios> ingresospromediossParaReportes) throws Exception {
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
					sPathReporteFinal="IngresosPromedios"+this.sTipoReporteExtra+"Design.jasper";
					reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);	
				} else {
					sPathReporteFinal=this.sPathReporteDinamico;
					reportFile = new FileInputStream(sPathReporteFinal);
				}
			} else {
				sPathReporteFinal="IngresosPromediosMasterRelaciones"+this.sTipoReporteExtra+"Design.jasper";
				reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);
				//sPathReportes=reportFile.getPath().replace("IngresosPromediosMasterRelacionesDesign.jasper", "");
			}
		} else {
				sPathReporteFinal="IngresosPromedios"+this.sTipoReporteExtra+"Design.jasper";
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
		parameters.put("subtitulo", "Reporte De  Ingresos Promedioses");		
		parameters.put("busquedapor", IngresosPromediosConstantesFunciones.getNombreIndice(sAccionBusqueda)+sDetalleReporte);
		
		
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
		
		JRBeanArrayDataSource jrbeanArrayDataSourceIngresosPromedios=null;
		
		if(this.sTipoReporteExtra!=null && !this.sTipoReporteExtra.equals("")) {
			IngresosPromediosConstantesFunciones.S_TIPOREPORTE_EXTRA=this.sTipoReporteExtra;
		} else {
			IngresosPromediosConstantesFunciones.S_TIPOREPORTE_EXTRA="";
		}
		
		jrbeanArrayDataSourceIngresosPromedios=new JRBeanArrayDataSource(IngresosPromediosJInternalFrame.TraerIngresosPromediosBeans(ingresospromediossParaReportes,classes).toArray());
		
		jasperPrint = JasperFillManager.fillReport(jasperReport,parameters,jrbeanArrayDataSourceIngresosPromedios);
				
		
		String sPathDest=Constantes.SUNIDAD_ARCHIVOS+":/"+Constantes.SCONTEXTSERVER+"/"+IngresosPromediosConstantesFunciones.SCHEMA+"/reportes";
		
		File filePathDest = new File(sPathDest);
		
		if(!filePathDest.exists()) {
			filePathDest.mkdirs();				
		}
				
		String sDestFileName=sPathDest+"/"+IngresosPromediosConstantesFunciones.CLASSNAME;
				
		if(this.sTipoArchivoReporte=="VISUALIZAR") {
			JasperViewer jasperViewer = new JasperViewer(jasperPrint,false) ;
			jasperViewer.setVisible(true) ; 

		} else if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML") {	
			//JasperFillManager.fillReportToFile(reportFile.getAbsolutePath(),parameters, new JRBeanArrayDataSource(IngresosPromediosBean.TraerIngresosPromediosBeans(ingresospromediossParaReportes).toArray()));
							
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
				this.generarExcelReporteIngresosPromedioss(sAccionBusqueda,sTipoArchivoReporte,ingresospromediossParaReportes);
			
			} else if(this.sTipoReporte.equals("FORMULARIO")){
				this.generarExcelReporteVerticalIngresosPromedioss(sAccionBusqueda,sTipoArchivoReporte,ingresospromediossParaReportes,false);
			
			} else if(this.sTipoReporte.equals("DINAMICO")){
				
				if(this.sTipoReporteDinamico.equals("NORMAL")) {
					
					this.jButtonGenerarExcelReporteDinamicoIngresosPromediosActionPerformed(null);
					//this.generarExcelReporteIngresosPromedioss(sAccionBusqueda,sTipoArchivoReporte,ingresospromediossParaReportes);
					
				
				} else if(this.sTipoReporteDinamico.equals("FORMULARIO")){
					this.generarExcelReporteVerticalIngresosPromedioss(sAccionBusqueda,sTipoArchivoReporte,ingresospromediossParaReportes,true);
				
				} else if(this.sTipoReporteDinamico.equals("RELACIONES")){
					this.generarExcelReporteRelacionesIngresosPromedioss(sAccionBusqueda,sTipoArchivoReporte,ingresospromediossParaReportes,true);
				}
				
			} else if(this.sTipoReporte.equals("RELACIONES")){
				this.generarExcelReporteRelacionesIngresosPromedioss(sAccionBusqueda,sTipoArchivoReporte,ingresospromediossParaReportes,false);
			}
		}
		
		if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML"||this.sTipoArchivoReporte=="WORD"||this.sTipoArchivoReporte=="EXCEL") {				
			JOptionPane.showMessageDialog(this,"REPORTE "+sDestFileName+" GENERADO SATISFACTORIAMENTE","REPORTES ",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteIngresosPromedioss(String sAccionBusqueda,String sTipoArchivoReporte,List<IngresosPromedios> ingresospromediossParaReportes) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"ingresospromedios";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("IngresosPromedioss");
         
        int iRow = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderIngresosPromedios("NORMAL",row,workbook);
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux=null;
		
		int i=0;
		
      	for(IngresosPromedios ingresospromedios : ingresospromediossParaReportes) {            
			row = sheet.createRow(iRow++);
			iCell = 0;
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				cellStyleDataAux=cellStyleData;
			}
			
			IngresosPromediosConstantesFunciones.generarExcelReporteDataIngresosPromedios("NORMAL",row,workbook,ingresospromedios,cellStyleDataAux);
		
			
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
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.ingresospromediosSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Ingresos Promedios",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteHeaderIngresosPromedios(String sTipo,Row row,Workbook workbook) {
		
		IngresosPromediosConstantesFunciones.generarExcelReporteHeaderIngresosPromedios(sTipo,row,workbook);
		
		/*
		Cell cell=null;
		int iCell=0;
		
		CellStyle cellStyle = workbook.createCellStyle();
		cellStyle.setFillBackgroundColor(IndexedColors.GREEN.getIndex());
		cellStyle.setFillPattern(CellStyle.ALIGN_FILL);
		*/
		
	}
	
	public void generarExcelReporteVerticalIngresosPromedioss(String sAccionBusqueda,String sTipoArchivoReporte,List<IngresosPromedios> ingresospromediossParaReportes,Boolean paraDinamico) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"ingresospromedios_vertical";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("IngresosPromedioss");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		CellStyle cellStyle = Funciones2.getStyleTitulo(workbook,"ZEBRA");;
		
		CellStyle cellStyleTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL_VERTICAL");
		
		
		for(IngresosPromedios ingresospromedios : ingresospromediossParaReportes) {
			row = sheet.createRow(iRow++);
			iRowLast=iRow - 1;
			
			cell = row.createCell(0);
			cell.setCellValue(IngresosPromediosConstantesFunciones.getIngresosPromediosDescripcion(ingresospromedios));
			cell.setCellStyle(cellStyleTitulo);
			
			sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
	
			


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(IngresosPromediosConstantesFunciones.LABEL_IDESTRUCTURA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(IngresosPromediosConstantesFunciones.LABEL_IDESTRUCTURA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(ingresospromedios.getestructura_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(IngresosPromediosConstantesFunciones.LABEL_CODIGO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(IngresosPromediosConstantesFunciones.LABEL_CODIGO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(ingresospromedios.getcodigo());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(IngresosPromediosConstantesFunciones.LABEL_IDEMPRESA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(IngresosPromediosConstantesFunciones.LABEL_IDEMPRESA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(ingresospromedios.getempresa_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(IngresosPromediosConstantesFunciones.LABEL_IDANIO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(IngresosPromediosConstantesFunciones.LABEL_IDANIO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(ingresospromedios.getanio_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(IngresosPromediosConstantesFunciones.LABEL_IDMES))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(IngresosPromediosConstantesFunciones.LABEL_IDMES);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(ingresospromedios.getmes_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(IngresosPromediosConstantesFunciones.LABEL_CODIGOCARGO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(IngresosPromediosConstantesFunciones.LABEL_CODIGOCARGO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(ingresospromedios.getcodigo_cargo());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(IngresosPromediosConstantesFunciones.LABEL_CODIGODATO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(IngresosPromediosConstantesFunciones.LABEL_CODIGODATO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(ingresospromedios.getcodigo_dato());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(IngresosPromediosConstantesFunciones.LABEL_NOMBRE))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(IngresosPromediosConstantesFunciones.LABEL_NOMBRE);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(ingresospromedios.getnombre());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(IngresosPromediosConstantesFunciones.LABEL_VALORPAGO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(IngresosPromediosConstantesFunciones.LABEL_VALORPAGO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(ingresospromedios.getvalor_pago());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(IngresosPromediosConstantesFunciones.LABEL_NOMBRERUBROEMPLEA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(IngresosPromediosConstantesFunciones.LABEL_NOMBRERUBROEMPLEA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(ingresospromedios.getnombre_rubro_emplea());


			}						
        }
        
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.ingresospromediosSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Ingresos Promedios",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteRelacionesIngresosPromedioss(String sAccionBusqueda,String sTipoArchivoReporte,List<IngresosPromedios> ingresospromediossParaReportes,Boolean paraDinamico) throws Exception {
		
		ArrayList<Classe> classes=new ArrayList<Classe>();
		List<IngresosPromedios> ingresospromediossRespaldo=null;
		
		classes=IngresosPromediosConstantesFunciones.getClassesRelationshipsOfIngresosPromedios(new ArrayList<Classe>(),DeepLoadType.NONE,false);
					
		this.datosDeep=new DatosDeep();
		
		this.datosDeep.setIsDeep(false);
		this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
		this.datosDeep.setClases(classes);
			
		this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
		this.datosCliente.setIsConDeep(true);	
		this.datosCliente.setIsConExportar(false);
		
						
		this.ingresospromediosLogic.setDatosCliente(this.datosCliente);
		this.ingresospromediosLogic.setDatosDeep(this.datosDeep);
		this.ingresospromediosLogic.setIsConDeep(true);
		
		ingresospromediossRespaldo=this.ingresospromediosLogic.getIngresosPromedioss();
		
		this.ingresospromediosLogic.setIngresosPromedioss(ingresospromediossParaReportes);	
		this.ingresospromediosLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
		
		ingresospromediossParaReportes=this.ingresospromediosLogic.getIngresosPromedioss();
		this.ingresospromediosLogic.setIngresosPromedioss(ingresospromediossRespaldo);
		
		
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"ingresospromedios_relacion";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("IngresosPromedioss");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderIngresosPromedios("NORMAL",row,workbook);
		
		int i=0;
		int i2=0;
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL");
		CellStyle cellStyleDataZebra = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux =null;
		CellStyle cellStyleDataAuxHijo =null;
		
		for(IngresosPromedios ingresospromedios : ingresospromediossParaReportes) {			
			if(i!=0) {
				row = sheet.createRow(iRow++);				
				this.generarExcelReporteHeaderIngresosPromedios("NORMAL",row,workbook);
			}
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				//cellStyleDataAux=cellStyleData;
			}
			
			row = sheet.createRow(iRow++);						
			IngresosPromediosConstantesFunciones.generarExcelReporteDataIngresosPromedios("NORMAL",row,workbook,ingresospromedios,cellStyleDataAux);
		
			
			
			
			i++;
        }
        
		/*
		row = sheet.createRow(iRow++);
		iRowLast=iRow - 1;
			
		cell = row.createCell(0);
		cell.setCellValue(IngresosPromediosConstantesFunciones.getIngresosPromediosDescripcion(ingresospromedios));
		cell.setCellStyle(cellStyleTitulo);
			
		sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
		*/
		
			
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.ingresospromediosSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Ingresos Promedios",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	
	public Boolean existeColumnaReporteDinamico(String sColumna) {
		Boolean existe=false;
		
		Reporte reporte=new Reporte();
		
		
		for(int index:this.jInternalFrameReporteDinamicoIngresosPromedios.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoIngresosPromedios.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
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
		
		
		for(int index:this.jInternalFrameReporteDinamicoIngresosPromedios.getjListRelacionesSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoIngresosPromedios.getjListRelacionesSelectReporte().getModel().getElementAt(index);
			
			if(sColumna.equals(reporte.getsCodigo())) {
				existe=true;
				break;
			}
		
		}
		
		
		return existe;
	}
	
	public void startProcessIngresosPromedios() throws Exception {		
		this.startProcessIngresosPromedios(true);
	}
	
	public void startProcessIngresosPromedios(Boolean conSplash) throws Exception {		
		//FuncionesSwing.enableDisablePanels(false,this.jTabbedPaneBusquedasIngresosPromedios ,this.jPanelParametrosReportesIngresosPromedios, this.jScrollPanelDatosIngresosPromedios,this.jPanelPaginacionIngresosPromedios, this.jScrollPanelDatosEdicionIngresosPromedios, this.jPanelAccionesIngresosPromedios,this.jPanelAccionesFormularioIngresosPromedios,this.jmenuBarIngresosPromedios,this.jmenuBarDetalleIngresosPromedios,this.jTtoolBarIngresosPromedios,this.jTtoolBarDetalleIngresosPromedios);		
		
		final JTabbedPane jTabbedPaneBusquedasIngresosPromedios=this.jTabbedPaneBusquedasIngresosPromedios; 
		
		final JPanel jPanelParametrosReportesIngresosPromedios=this.jPanelParametrosReportesIngresosPromedios;
		//final JScrollPane jScrollPanelDatosIngresosPromedios=this.jScrollPanelDatosIngresosPromedios;
		final JTable jTableDatosIngresosPromedios=this.jTableDatosIngresosPromedios;		
		final JPanel jPanelPaginacionIngresosPromedios=this.jPanelPaginacionIngresosPromedios;
		//final JScrollPane jScrollPanelDatosEdicionIngresosPromedios=this.jScrollPanelDatosEdicionIngresosPromedios;
		final JPanel jPanelAccionesIngresosPromedios=this.jPanelAccionesIngresosPromedios;
		
		JPanel jPanelCamposAuxiliarIngresosPromedios=new JPanelMe();
		JPanel jPanelAccionesFormularioAuxiliarIngresosPromedios=new JPanelMe();
		
		if(this.jInternalFrameDetalleFormIngresosPromedios!=null) {
			jPanelCamposAuxiliarIngresosPromedios=this.jInternalFrameDetalleFormIngresosPromedios.jPanelCamposIngresosPromedios;
			jPanelAccionesFormularioAuxiliarIngresosPromedios=this.jInternalFrameDetalleFormIngresosPromedios.jPanelAccionesFormularioIngresosPromedios;
		}
		
		final JPanel jPanelCamposIngresosPromedios=jPanelCamposAuxiliarIngresosPromedios;
		final JPanel jPanelAccionesFormularioIngresosPromedios=jPanelAccionesFormularioAuxiliarIngresosPromedios;
		
		
		final JMenuBar jmenuBarIngresosPromedios=this.jmenuBarIngresosPromedios;
		final JToolBar jTtoolBarIngresosPromedios=this.jTtoolBarIngresosPromedios;		
		
		
		JMenuBar jmenuBarDetalleAuxiliarIngresosPromedios=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarIngresosPromedios=new JToolBar();		
		
		if(this.jInternalFrameDetalleFormIngresosPromedios!=null) {
			jmenuBarDetalleAuxiliarIngresosPromedios=this.jInternalFrameDetalleFormIngresosPromedios.jmenuBarDetalleIngresosPromedios;
			jTtoolBarDetalleAuxiliarIngresosPromedios=this.jInternalFrameDetalleFormIngresosPromedios.jTtoolBarDetalleIngresosPromedios;
		}
		
		final JMenuBar jmenuBarDetalleIngresosPromedios=jmenuBarDetalleAuxiliarIngresosPromedios;
		final JToolBar jTtoolBarDetalleIngresosPromedios=jTtoolBarDetalleAuxiliarIngresosPromedios;		
		
		
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasIngresosPromedios;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesIngresosPromedios;
			processRunnable.jTableDatos=jTableDatosIngresosPromedios;
			processRunnable.jPanelCampos=jPanelCamposIngresosPromedios;
			processRunnable.jPanelPaginacion=jPanelPaginacionIngresosPromedios;
			processRunnable.jPanelAcciones=jPanelAccionesIngresosPromedios;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioIngresosPromedios;
			
			
			processRunnable.jmenuBar=jmenuBarIngresosPromedios;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleIngresosPromedios;
			processRunnable.jTtoolBar=jTtoolBarIngresosPromedios;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleIngresosPromedios;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasIngresosPromedios ,jPanelParametrosReportesIngresosPromedios,jTableDatosIngresosPromedios, /*jScrollPanelDatosIngresosPromedios,*/jPanelCamposIngresosPromedios,jPanelPaginacionIngresosPromedios, /*jScrollPanelDatosEdicionIngresosPromedios,*/ jPanelAccionesIngresosPromedios,jPanelAccionesFormularioIngresosPromedios,jmenuBarIngresosPromedios,jmenuBarDetalleIngresosPromedios,jTtoolBarIngresosPromedios,jTtoolBarDetalleIngresosPromedios);
		
			startProcess();//this.
		}
						
		/*
		if(conSplash) {
			SwingUtilities.invokeLater(new Runnable() {
			      public void run() {
			    	  try {
							FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasIngresosPromedios ,jPanelParametrosReportesIngresosPromedios, jScrollPanelDatosIngresosPromedios,jPanelPaginacionIngresosPromedios, jScrollPanelDatosEdicionIngresosPromedios, jPanelAccionesIngresosPromedios,jPanelAccionesFormularioIngresosPromedios,jmenuBarIngresosPromedios,jmenuBarDetalleIngresosPromedios,jTtoolBarIngresosPromedios,jTtoolBarDetalleIngresosPromedios);
						
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
	
	public void finishProcessIngresosPromedios() {// throws Exception 
		this.finishProcessIngresosPromedios(true);
	}
	
	public void finishProcessIngresosPromedios(Boolean conSplash) {// throws Exception 
		//FuncionesSwing.enableDisablePanels(true,this.jTabbedPaneBusquedasIngresosPromedios ,this.jPanelParametrosReportesIngresosPromedios, this.jScrollPanelDatosIngresosPromedios,this.jPanelPaginacionIngresosPromedios, this.jScrollPanelDatosEdicionIngresosPromedios, this.jPanelAccionesIngresosPromedios,this.jPanelAccionesFormularioIngresosPromedios,this.jmenuBarIngresosPromedios,this.jmenuBarDetalleIngresosPromedios,this.jTtoolBarIngresosPromedios,this.jTtoolBarDetalleIngresosPromedios);		
		
		final JTabbedPane jTabbedPaneBusquedasIngresosPromedios=this.jTabbedPaneBusquedasIngresosPromedios; 
		
		final JPanel jPanelParametrosReportesIngresosPromedios=this.jPanelParametrosReportesIngresosPromedios;
		//final JScrollPane jScrollPanelDatosIngresosPromedios=this.jScrollPanelDatosIngresosPromedios;
		final JTable jTableDatosIngresosPromedios=this.jTableDatosIngresosPromedios;		
		final JPanel jPanelPaginacionIngresosPromedios=this.jPanelPaginacionIngresosPromedios;
		//final JScrollPane jScrollPanelDatosEdicionIngresosPromedios=this.jScrollPanelDatosEdicionIngresosPromedios;
		final JPanel jPanelAccionesIngresosPromedios=this.jPanelAccionesIngresosPromedios;
		
		JPanel jPanelCamposAuxiliarIngresosPromedios=new JPanel();
		JPanel jPanelAccionesFormularioAuxiliarIngresosPromedios=new JPanel();
		
		if(this.jInternalFrameDetalleFormIngresosPromedios!=null) {
			jPanelCamposAuxiliarIngresosPromedios=this.jInternalFrameDetalleFormIngresosPromedios.jPanelCamposIngresosPromedios;
			jPanelAccionesFormularioAuxiliarIngresosPromedios=this.jInternalFrameDetalleFormIngresosPromedios.jPanelAccionesFormularioIngresosPromedios;
		}
		
		final JPanel jPanelCamposIngresosPromedios=jPanelCamposAuxiliarIngresosPromedios;
		final JPanel jPanelAccionesFormularioIngresosPromedios=jPanelAccionesFormularioAuxiliarIngresosPromedios;
		
		
		final JMenuBar jmenuBarIngresosPromedios=this.jmenuBarIngresosPromedios;		
		final JToolBar jTtoolBarIngresosPromedios=this.jTtoolBarIngresosPromedios;
				
		JMenuBar jmenuBarDetalleAuxiliarIngresosPromedios=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarIngresosPromedios=new JToolBar();
		
		if(this.jInternalFrameDetalleFormIngresosPromedios!=null) {
			jmenuBarDetalleAuxiliarIngresosPromedios=this.jInternalFrameDetalleFormIngresosPromedios.jmenuBarDetalleIngresosPromedios;
			jTtoolBarDetalleAuxiliarIngresosPromedios=this.jInternalFrameDetalleFormIngresosPromedios.jTtoolBarDetalleIngresosPromedios;		
		}
		
		final JMenuBar jmenuBarDetalleIngresosPromedios=jmenuBarDetalleAuxiliarIngresosPromedios;
		final JToolBar jTtoolBarDetalleIngresosPromedios=jTtoolBarDetalleAuxiliarIngresosPromedios;
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasIngresosPromedios;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesIngresosPromedios;
			processRunnable.jTableDatos=jTableDatosIngresosPromedios;
			processRunnable.jPanelCampos=jPanelCamposIngresosPromedios;
			processRunnable.jPanelPaginacion=jPanelPaginacionIngresosPromedios;
			processRunnable.jPanelAcciones=jPanelAccionesIngresosPromedios;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioIngresosPromedios;
			
			
			processRunnable.jmenuBar=jmenuBarIngresosPromedios;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleIngresosPromedios;
			processRunnable.jTtoolBar=jTtoolBarIngresosPromedios;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleIngresosPromedios;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			if(conSplash) {
				SwingUtilities.invokeLater(new RunnableProceso(true,this,jTabbedPaneBusquedasIngresosPromedios ,jPanelParametrosReportesIngresosPromedios, jTableDatosIngresosPromedios,/*jScrollPanelDatosIngresosPromedios,*/jPanelCamposIngresosPromedios,jPanelPaginacionIngresosPromedios, /*jScrollPanelDatosEdicionIngresosPromedios,*/ jPanelAccionesIngresosPromedios,jPanelAccionesFormularioIngresosPromedios,jmenuBarIngresosPromedios,jmenuBarDetalleIngresosPromedios,jTtoolBarIngresosPromedios,jTtoolBarDetalleIngresosPromedios));
			}
		}						
	}
	
	/*
	public void habilitarDeshabilitarControlesIngresosPromedios(Boolean esHabilitar,Boolean conDetalle) {
		this.habilitarDeshabilitarToolBarIngresosPromedios(esHabilitar,conDetalle);
		this.habilitarDeshabilitarMenuIngresosPromedios(esHabilitar,conDetalle);
	}
	
	public void habilitarDeshabilitarToolBarIngresosPromedios(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jTtoolBarIngresosPromedios,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jTtoolBarDetalleIngresosPromedios,esHabilitar,1,1);
		}
	}
	
	public void habilitarDeshabilitarMenuIngresosPromedios(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jmenuBarIngresosPromedios,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jmenuBarDetalleIngresosPromedios,esHabilitar,1,1);
		}
	}
	*/
	
	
	
	public void procesarBusqueda(String sAccionBusqueda) throws Exception {		
		String  finalQueryPaginacion=this.ingresospromediosConstantesFunciones.getsFinalQueryIngresosPromedios();
		String  finalQueryPaginacionTodos=this.ingresospromediosConstantesFunciones.getsFinalQueryIngresosPromedios();
		
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
		
		ArrayList<String> arrColumnasGlobalesNo=IngresosPromediosConstantesFunciones.getArrayColumnasGlobalesNoIngresosPromedios(this.arrDatoGeneral);
		ArrayList<String> arrColumnasGlobales=IngresosPromediosConstantesFunciones.getArrayColumnasGlobalesIngresosPromedios(this.arrDatoGeneral,arrColumnasGlobalesNo);
		
			
		String  finalQueryGlobal="";
		
		finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,!esBusqueda,esBusqueda,arrColumnasGlobales,IngresosPromediosConstantesFunciones.TABLENAME);
		
		String sOrderBy="";
		
		
		sOrderBy=Funciones2.getFinalQueryOrderBy(this.arrOrderBy);
		
		
		if(!sOrderBy.equals("")) {			
			finalQueryPaginacion=sOrderBy;
			finalQueryPaginacionTodos=sOrderBy;
		}
		
		
		//INICIALIZA ELIMINADOS
		this.ingresospromediossEliminados= new ArrayList<IngresosPromedios>();
		
		if(!this.isEntroOnLoad) {
			this.onLoad();
		}/* else {
			this.isEntroOnLoad=false;
		}*/
		
		
		
				
		try	{		
			
			//this.startProcessIngresosPromedios();
		
				///*IngresosPromediosSessionBean*/this.ingresospromediosSessionBean=new IngresosPromediosSessionBean();
			
			if(this.ingresospromediosSessionBean==null) {
				this.ingresospromediosSessionBean=new IngresosPromediosSessionBean();
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
					this.iNumeroPaginacion=IngresosPromediosConstantesFunciones.INUMEROPAGINACION;
				}
			}
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);
			
			this.cargarDatosCliente();
			
			ArrayList<Classe> classes=new ArrayList<Classe>();
			
			classes=IngresosPromediosConstantesFunciones.getClassesForeignKeysOfIngresosPromedios(new ArrayList<Classe>(),DeepLoadType.NONE);
			
		
			this.datosDeep=new DatosDeep();
			this.datosDeep.setIsDeep(false);
			this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
			this.datosDeep.setClases(classes);
			
			this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
			this.datosCliente.setIsConDeep(true);
			
			if(false) {//this.conExportar
				this.datosCliente.setIsConExportar(true);
				this.datosCliente.setDatosExportarParametros(Funciones2.getTipoExportar(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getcon_exportar_cabecera(),Funciones2.getTipoDelimiter(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getpath_exportar()+"/ingresospromedios."+Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario));
			} else {
				this.datosCliente.setIsConExportar(false);
			}
			
			ingresospromediossAux= new ArrayList<IngresosPromedios>();
			
				
			ingresospromediosLogic.setDatosCliente(this.datosCliente);
			ingresospromediosLogic.setDatosDeep(this.datosDeep);
			ingresospromediosLogic.setIsConDeep(true);
			
			
			
			if(sAccionBusqueda.equals("Todos") || sAccionBusqueda.equals("Query"))	{	
				if(sAccionBusqueda.equals("Todos")) {
					//FALTA:PARA BUSQUEDAS POR CAMPO EN FORMULARIO
					//this.sFinalQueryGeneral="";
				}
				
			}
			
		
			else if(sAccionBusqueda.equals("BusquedaIngresosPromedios")) {
				this.sDetalleReporte=IngresosPromediosConstantesFunciones.getDetalleIndiceBusquedaIngresosPromedios(id_estructuraBusquedaIngresosPromedios,codigoBusquedaIngresosPromedios,id_anioBusquedaIngresosPromedios,id_mesBusquedaIngresosPromedios);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					ingresospromediosLogic.getIngresosPromediossBusquedaIngresosPromedios(finalQueryGlobal,pagination,this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,id_estructuraBusquedaIngresosPromedios,codigoBusquedaIngresosPromedios,id_anioBusquedaIngresosPromedios,id_mesBusquedaIngresosPromedios);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=IngresosPromediosConstantesFunciones.getDetalleIndiceBusquedaIngresosPromedios(id_estructuraBusquedaIngresosPromedios,codigoBusquedaIngresosPromedios,id_anioBusquedaIngresosPromedios,id_mesBusquedaIngresosPromedios);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=IngresosPromediosConstantesFunciones.getDetalleIndiceBusquedaIngresosPromedios(id_estructuraBusquedaIngresosPromedios,codigoBusquedaIngresosPromedios,id_anioBusquedaIngresosPromedios,id_mesBusquedaIngresosPromedios);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=ingresospromediosLogic.getIngresosPromedioss()==null||ingresospromediosLogic.getIngresosPromedioss().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=ingresospromedioss==null|| ingresospromedioss.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						ingresospromediossAux=new ArrayList<IngresosPromedios>();
						ingresospromediossAux.addAll(ingresospromediosLogic.getIngresosPromedioss());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							ingresospromediossAux=new ArrayList<IngresosPromedios>();
							ingresospromediossAux.addAll(ingresospromedioss);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							ingresospromediosLogic.getIngresosPromediossBusquedaIngresosPromedios(finalQueryGlobal,pagination,this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,id_estructuraBusquedaIngresosPromedios,codigoBusquedaIngresosPromedios,id_anioBusquedaIngresosPromedios,id_mesBusquedaIngresosPromedios);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=IngresosPromediosConstantesFunciones.getDetalleIndiceBusquedaIngresosPromedios(id_estructuraBusquedaIngresosPromedios,codigoBusquedaIngresosPromedios,id_anioBusquedaIngresosPromedios,id_mesBusquedaIngresosPromedios);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=IngresosPromediosConstantesFunciones.getDetalleIndiceBusquedaIngresosPromedios(id_estructuraBusquedaIngresosPromedios,codigoBusquedaIngresosPromedios,id_anioBusquedaIngresosPromedios,id_mesBusquedaIngresosPromedios);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteIngresosPromedioss("BusquedaIngresosPromedios",ingresospromediosLogic.getIngresosPromedioss());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteIngresosPromedioss("BusquedaIngresosPromedios",ingresospromedioss);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						ingresospromediosLogic.setIngresosPromedioss(new ArrayList<IngresosPromedios>());
						ingresospromediosLogic.getIngresosPromedioss().addAll(ingresospromediossAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							ingresospromedioss=new ArrayList<IngresosPromedios>();
							ingresospromedioss.addAll(ingresospromediossAux);
						}
						//ARCHITECTURE
					}
				}

			} 
		
		
		
		this.redimensionarTablaDatos();
		//this.refrescarForeignKeysDescripcionesIngresosPromedios();
		
		
		if(this.conTotales) {
			this.crearFilaTotales();
		}		
		} catch (JRException e) {
			throw e;
		} catch(Exception e) {
			throw e;
      	} finally {
      		//this.finishProcessIngresosPromedios();
      	}
		
	}				
	
	public void redimensionarTablaDatos() throws Exception {
		int iSizeTabla=0;
				
		iSizeTabla=this.getSizeTablaDatos();
		
		//ARCHITECTURE
		/*
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=ingresospromediosLogic.getIngresosPromedioss().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=ingresospromedioss.size();
		}
		*/
		//ARCHITECTURE
											
		this.redimensionarTablaDatos(iSizeTabla);		
	}
	
	public Integer getSizeTablaDatos() throws Exception {
		Integer iSizeTabla=0;
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=ingresospromediosLogic.getIngresosPromedioss().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=ingresospromedioss.size();
		}
		//ARCHITECTURE
											
		return iSizeTabla;		
	}
	
			
	public Boolean permiteMantenimiento(IngresosPromedios ingresospromedios) {
		Boolean permite=true;
		
		if(this.ingresospromedios.getsType().equals(Constantes2.S_TOTALES)) {
			permite=false;
		}
		
		return permite;
	}
	
	public void traerValoresTablaTotales() throws Exception {
	}
	
	
	public void traerValoresTablaOrderBy() throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.arrOrderBy=IngresosPromediosConstantesFunciones.getOrderByListaIngresosPromedios();							
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.arrOrderBy=IngresosPromediosConstantesFunciones.getOrderByListaIngresosPromedios();
		}		
	}
	
	
	public Boolean existeFilaTotales() throws Exception {
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(IngresosPromedios ingresospromedios:ingresospromediosLogic.getIngresosPromedioss()) {
				if(ingresospromedios.getsType().equals(Constantes2.S_TOTALES)) {
					ingresospromediosTotales=ingresospromedios;
					existe=true;
					break;
				}
			}
								
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(IngresosPromedios ingresospromedios:this.ingresospromedioss) {
				if(ingresospromedios.getsType().equals(Constantes2.S_TOTALES)) {
					ingresospromediosTotales=ingresospromedios;
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
			this.ingresospromediosAux=new IngresosPromedios();
			this.ingresospromediosAux.setsType(Constantes2.S_TOTALES);
			this.ingresospromediosAux.setIsNew(false);
			this.ingresospromediosAux.setIsChanged(false);
			this.ingresospromediosAux.setIsDeleted(false);
				
			if(Constantes.ISUSAEJBLOGICLAYER) {
				//IngresosPromediosConstantesFunciones.TotalizarValoresFilaIngresosPromedios(this.ingresospromediosLogic.getIngresosPromedioss(),this.ingresospromediosAux);
				
				//this.ingresospromediosLogic.getIngresosPromedioss().add(this.ingresospromediosAux);
				
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				IngresosPromediosConstantesFunciones.TotalizarValoresFilaIngresosPromedios(this.ingresospromedioss,this.ingresospromediosAux);
				
				this.ingresospromedioss.add(this.ingresospromediosAux);
			}
		}
	}
	
	public void quitarFilaTotales() throws Exception {
		ingresospromediosTotales=new IngresosPromedios();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.ingresospromediosLogic.getIngresosPromedioss().remove(ingresospromediosTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.ingresospromedioss.remove(ingresospromediosTotales);
			}
		}
	}
	
	public void actualizarFilaTotales() throws Exception {
		ingresospromediosTotales=new IngresosPromedios();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(IngresosPromedios ingresospromedios:ingresospromediosLogic.getIngresosPromedioss()) {
				if(ingresospromedios.getsType().equals(Constantes2.S_TOTALES)) {
					ingresospromediosTotales=ingresospromedios;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				IngresosPromediosConstantesFunciones.TotalizarValoresFilaIngresosPromedios(this.ingresospromediosLogic.getIngresosPromedioss(),ingresospromediosTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(IngresosPromedios ingresospromedios:this.ingresospromedioss) {
				if(ingresospromedios.getsType().equals(Constantes2.S_TOTALES)) {
					ingresospromediosTotales=ingresospromedios;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				IngresosPromediosConstantesFunciones.TotalizarValoresFilaIngresosPromedios(this.ingresospromedioss,ingresospromediosTotales);
			}
		}
	}		
	
	public void recargarInformacion()throws Exception {
		try {
			sAccionBusqueda="Todos";
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda(sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,IngresosPromediosConstantesFunciones.CLASSNAME);
		}	
	}		
	
	
	public void getIngresosPromediossBusquedaIngresosPromedios()throws Exception {
		try {
			sAccionBusqueda="BusquedaIngresosPromedios";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getIngresosPromediossFK_IdAnio()throws Exception {
		try {
			sAccionBusqueda="FK_IdAnio";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getIngresosPromediossFK_IdEmpresa()throws Exception {
		try {
			sAccionBusqueda="FK_IdEmpresa";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getIngresosPromediossFK_IdEstructura()throws Exception {
		try {
			sAccionBusqueda="FK_IdEstructura";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getIngresosPromediossFK_IdMes()throws Exception {
		try {
			sAccionBusqueda="FK_IdMes";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	
	
	public void getIngresosPromediossBusquedaIngresosPromedios(String sFinalQuery,Long id_estructura,String codigo,Long id_anio,Long id_mes)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//ingresospromediosLogic.getIngresosPromediossBusquedaIngresosPromedios(sFinalQuery,this.pagination,id_estructura,codigo,id_anio,id_mes);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getIngresosPromediossFK_IdAnio(String sFinalQuery,Long id_anio)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//ingresospromediosLogic.getIngresosPromediossFK_IdAnio(sFinalQuery,this.pagination,id_anio);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getIngresosPromediossFK_IdEmpresa(String sFinalQuery,Long id_empresa)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//ingresospromediosLogic.getIngresosPromediossFK_IdEmpresa(sFinalQuery,this.pagination,id_empresa);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getIngresosPromediossFK_IdEstructura(String sFinalQuery,Long id_estructura)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//ingresospromediosLogic.getIngresosPromediossFK_IdEstructura(sFinalQuery,this.pagination,id_estructura);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getIngresosPromediossFK_IdMes(String sFinalQuery,Long id_mes)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//ingresospromediosLogic.getIngresosPromediossFK_IdMes(sFinalQuery,this.pagination,id_mes);
				
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
								
			//this.procesarBusqueda(sAccionBusqueda);
			
		} catch (Exception e) {
			throw e;
		}
	}		
	
	public void inicializarPermisosIngresosPromedios() {
		this.isPermisoTodoIngresosPromedios=false;
		this.isPermisoNuevoIngresosPromedios=false;
		this.isPermisoActualizarIngresosPromedios=false;
		this.isPermisoActualizarOriginalIngresosPromedios=false;
		this.isPermisoEliminarIngresosPromedios=false;
		this.isPermisoGuardarCambiosIngresosPromedios=false;
		this.isPermisoConsultaIngresosPromedios=true;
		this.isPermisoBusquedaIngresosPromedios=true;
		this.isPermisoReporteIngresosPromedios=true;
		this.isPermisoOrdenIngresosPromedios=false;		
		this.isPermisoPaginacionMedioIngresosPromedios=false;		
		this.isPermisoPaginacionAltoIngresosPromedios=false;		
		this.isPermisoPaginacionTodoIngresosPromedios=false;		
		this.isPermisoCopiarIngresosPromedios=false;		
		this.isPermisoVerFormIngresosPromedios=false;		
		this.isPermisoDuplicarIngresosPromedios=false;
		this.isPermisoOrdenIngresosPromedios=false;
	}
	
	public void setPermisosUsuarioIngresosPromedios(Boolean isPermiso) {
		this.isPermisoTodoIngresosPromedios=isPermiso;
		this.isPermisoNuevoIngresosPromedios=isPermiso;
		this.isPermisoActualizarIngresosPromedios=isPermiso;
		this.isPermisoActualizarOriginalIngresosPromedios=isPermiso;
		this.isPermisoEliminarIngresosPromedios=isPermiso;
		this.isPermisoGuardarCambiosIngresosPromedios=isPermiso;
		this.isPermisoConsultaIngresosPromedios=isPermiso;
		this.isPermisoBusquedaIngresosPromedios=isPermiso;
		this.isPermisoReporteIngresosPromedios=isPermiso;
		this.isPermisoOrdenIngresosPromedios=isPermiso;		
		this.isPermisoPaginacionMedioIngresosPromedios=isPermiso;		
		this.isPermisoPaginacionAltoIngresosPromedios=isPermiso;		
		this.isPermisoPaginacionTodoIngresosPromedios=isPermiso;		
		this.isPermisoCopiarIngresosPromedios=isPermiso;		
		this.isPermisoVerFormIngresosPromedios=isPermiso;		
		this.isPermisoDuplicarIngresosPromedios=isPermiso;
		this.isPermisoOrdenIngresosPromedios=isPermiso;
	}
	
	public void setPermisosMantenimientoUsuarioIngresosPromedios(Boolean isPermiso) {
		//this.isPermisoTodoIngresosPromedios=isPermiso;
		this.isPermisoNuevoIngresosPromedios=isPermiso;
		this.isPermisoActualizarIngresosPromedios=isPermiso;
		this.isPermisoActualizarOriginalIngresosPromedios=isPermiso;
		this.isPermisoEliminarIngresosPromedios=isPermiso;
		this.isPermisoGuardarCambiosIngresosPromedios=isPermiso;
		//this.isPermisoConsultaIngresosPromedios=isPermiso;
		//this.isPermisoBusquedaIngresosPromedios=isPermiso;
		//this.isPermisoReporteIngresosPromedios=isPermiso;
		//this.isPermisoOrdenIngresosPromedios=isPermiso;		
		//this.isPermisoPaginacionMedioIngresosPromedios=isPermiso;		
		//this.isPermisoPaginacionAltoIngresosPromedios=isPermiso;		
		//this.isPermisoPaginacionTodoIngresosPromedios=isPermiso;		
		//this.isPermisoCopiarIngresosPromedios=isPermiso;		
		//this.isPermisoDuplicarIngresosPromedios=isPermiso;
		//this.isPermisoOrdenIngresosPromedios=isPermiso;
	}
	
	public void inicializarSetPermisosUsuarioIngresosPromediosClasesRelacionadas() throws Exception {
		ArrayList<String> arrPaginas=new ArrayList<String>();		
		ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
		
		
		if(IngresosPromediosJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public Boolean tienePermisosUsuarioEnPaginaWebIngresosPromedios(String sPagina) throws Exception {
		Boolean tienePermisos=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tienePermisos=sistemaLogicAdditional.tienePermisosEnPaginaWeb(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, sPagina);
		} else if(Constantes.ISUSAEJBREMOTE) {
		} else if(Constantes.ISUSAEJBHOME) {
		}
		
		return tienePermisos;
	}
	
	public void inicializarSetPermisosUsuarioIngresosPromediosClasesRelacionadas(Boolean conPermiso) throws Exception {
		
	}
	
	public Boolean verificarGetPermisosUsuarioIngresosPromediosClaseRelacionada(ArrayList<String> arrPaginasFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioClaseRelacionada(arrPaginasFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public Boolean verificarGetPermisosUsuarioOpcionIngresosPromediosClaseRelacionada(List<Opcion> opcionsFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioOpcionClaseRelacionada(opcionsFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public void actualizarTabsSetPermisosUsuarioIngresosPromediosClasesRelacionadas() throws Exception {
		
	}
	
	public void setPermisosUsuarioIngresosPromedios() throws Exception {
		
		PerfilOpcion perfilOpcionUsuario=new PerfilOpcion();		
		Long idOpcion=this.opcionActual.getId();
		
		if(IngresosPromediosJInternalFrame.CON_LLAMADA_SIMPLE) {
			perfilOpcionUsuario=this.sistemaReturnGeneral.getPerfilOpcion();
			
		} else {
			if(this.ingresospromediosSessionBean.getEsGuardarRelacionado()) {
				idOpcion=0L;
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				perfilOpcionUsuario=sistemaLogicAdditional.traerPermisosPaginaWebPerfilOpcion(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, IngresosPromediosConstantesFunciones.SNOMBREOPCION,idOpcion);				
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
		}
		
		if(perfilOpcionUsuario!=null && perfilOpcionUsuario.getId()>0) {
			this.isPermisoNuevoIngresosPromedios=perfilOpcionUsuario.getingreso()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarIngresosPromedios=perfilOpcionUsuario.getmodificacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarOriginalIngresosPromedios=this.isPermisoActualizarIngresosPromedios;
			this.isPermisoEliminarIngresosPromedios=perfilOpcionUsuario.geteliminacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoGuardarCambiosIngresosPromedios=perfilOpcionUsuario.getguardar_cambios()||perfilOpcionUsuario.gettodo();
			this.isPermisoConsultaIngresosPromedios=perfilOpcionUsuario.getconsulta()||perfilOpcionUsuario.gettodo();
			this.isPermisoBusquedaIngresosPromedios=perfilOpcionUsuario.getbusqueda()||perfilOpcionUsuario.gettodo();
			this.isPermisoTodoIngresosPromedios=perfilOpcionUsuario.gettodo()||perfilOpcionUsuario.gettodo();
			this.isPermisoReporteIngresosPromedios=perfilOpcionUsuario.getreporte()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenIngresosPromedios=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionMedioIngresosPromedios=perfilOpcionUsuario.getpaginacion_medio()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionAltoIngresosPromedios=perfilOpcionUsuario.getpaginacion_alto()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionTodoIngresosPromedios=perfilOpcionUsuario.getpaginacion_todo()||perfilOpcionUsuario.gettodo();
			this.isPermisoCopiarIngresosPromedios=perfilOpcionUsuario.getcopiar()||perfilOpcionUsuario.gettodo();
			this.isPermisoVerFormIngresosPromedios=true;//perfilOpcionUsuario.getver_form()||perfilOpcionUsuario.gettodo();
			this.isPermisoDuplicarIngresosPromedios=perfilOpcionUsuario.getduplicar()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenIngresosPromedios=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			
			if(this.ingresospromediosSessionBean.getEsGuardarRelacionado()) {
				this.opcionActual.setId(perfilOpcionUsuario.getid_opcion());
				
				this.jTableDatosIngresosPromedios.setToolTipText(this.jTableDatosIngresosPromedios.getToolTipText()+"_"+perfilOpcionUsuario.getid_opcion());		
			}
		} else {
			this.setPermisosUsuarioIngresosPromedios(false);
		}
		
		//SI SE NECESITA PONER TODOS LOS PERMISOS POR DEFECTO
		//
		
	}
	
	public void setAccionesUsuarioIngresosPromedios(Boolean esParaAccionesFormulario) throws Exception {		
		Reporte reporte=null;
		
		if(!esParaAccionesFormulario) {
			this.accions=new ArrayList<Accion>();
			
			if(IngresosPromediosJInternalFrame.CON_LLAMADA_SIMPLE) {
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
			
			if(IngresosPromediosJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public void setRelacionesUsuarioIngresosPromedios() throws Exception {
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
	public void inicializarCombosForeignKeyIngresosPromediosListas()throws Exception {
		try	{						
			
				this.estructurasForeignKey=new ArrayList();
				this.empresasForeignKey=new ArrayList();
				this.aniosForeignKey=new ArrayList();
				this.messForeignKey=new ArrayList();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void cargarCombosTodosForeignKeyIngresosPromediosListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			String sFinalQueryCombo="";
			
			Modulo  moduloActualAux=new Modulo();
			
			if(IngresosPromediosJInternalFrame.ISLOAD_FKLOTE) {
			} else {
			
				this.cargarCombosForeignKeyEstructuraListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeyEmpresaListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeyAnioListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeyMesListas(cargarCombosDependencia,sFinalQueryCombo);
			}
		} catch(Exception e) {
			throw e;
		}		
	}		
	
	

	public void cargarCombosForeignKeyEstructuraListas(Boolean cargarCombosDependencia,String sFinalQuery)throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();

			String  finalQueryGlobal="";

			Modulo  moduloActualAux=new Modulo();

			if((this.estructurasForeignKey==null||this.estructurasForeignKey.size()<=0)) {
				this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
				this.arrDatoGeneralNo= new  ArrayList<String>();

				arrColumnasGlobales=EstructuraConstantesFunciones.getArrayColumnasGlobalesEstructura(this.arrDatoGeneral,this.arrDatoGeneralNo);
				finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,EstructuraConstantesFunciones.TABLENAME);

				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, sFinalQuery);
				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, "");

				finalQueryGlobal+=EstructuraConstantesFunciones.SFINALQUERY;

				this.cargarCombosEstructurasForeignKeyLista(finalQueryGlobal);
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

	public void cargarCombosForeignKeyAnioListas(Boolean cargarCombosDependencia,String sFinalQuery)throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();

			String  finalQueryGlobal="";

			Modulo  moduloActualAux=new Modulo();

			if((this.aniosForeignKey==null||this.aniosForeignKey.size()<=0)) {
				this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
				this.arrDatoGeneralNo= new  ArrayList<String>();

				arrColumnasGlobales=AnioConstantesFunciones.getArrayColumnasGlobalesAnio(this.arrDatoGeneral,this.arrDatoGeneralNo);
				finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,AnioConstantesFunciones.TABLENAME);

				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, sFinalQuery);
				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, "");

				finalQueryGlobal+=AnioConstantesFunciones.SFINALQUERY;

				this.cargarCombosAniosForeignKeyLista(finalQueryGlobal);
			}

		} catch(Exception e) {
			throw e;
		}
	}

	public void cargarCombosForeignKeyMesListas(Boolean cargarCombosDependencia,String sFinalQuery)throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();

			String  finalQueryGlobal="";

			Modulo  moduloActualAux=new Modulo();

			if((this.messForeignKey==null||this.messForeignKey.size()<=0)) {
				this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
				this.arrDatoGeneralNo= new  ArrayList<String>();

				arrColumnasGlobales=MesConstantesFunciones.getArrayColumnasGlobalesMes(this.arrDatoGeneral,this.arrDatoGeneralNo);
				finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,MesConstantesFunciones.TABLENAME);

				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, sFinalQuery);
				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, "");

				finalQueryGlobal+=MesConstantesFunciones.SFINALQUERY;

				this.cargarCombosMessForeignKeyLista(finalQueryGlobal);
			}

		} catch(Exception e) {
			throw e;
		}
	}
	
	
	public void addItemDefectoCombosTodosForeignKeyIngresosPromedios()throws Exception {
		try {
			
			this.addItemDefectoCombosForeignKeyEstructura();
			this.addItemDefectoCombosForeignKeyEmpresa();
			this.addItemDefectoCombosForeignKeyAnio();
			this.addItemDefectoCombosForeignKeyMes();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	



	public void addItemDefectoCombosForeignKeyEstructura()throws Exception {
		try {
			if(this.ingresospromediosSessionBean==null) {
				this.ingresospromediosSessionBean=new IngresosPromediosSessionBean();
			}

			if(!this.ingresospromediosSessionBean.getisBusquedaDesdeForeignKeySesionEstructura()) {
				Estructura estructura=new Estructura();
				EstructuraConstantesFunciones.setEstructuraDescripcion(estructura,Constantes.SMENSAJE_ESCOJA_OPCION);
				estructura.setId(null);

				if(!EstructuraConstantesFunciones.ExisteEnLista(this.estructurasForeignKey,estructura,true)) {

					this.estructurasForeignKey.add(0,estructura);
				}
			}
		} catch(Exception e) {
			throw e;
		}
	}

	public void addItemDefectoCombosForeignKeyEmpresa()throws Exception {
		try {

			if(!this.ingresospromediosSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {
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

	public void addItemDefectoCombosForeignKeyAnio()throws Exception {
		try {

			if(!this.ingresospromediosSessionBean.getisBusquedaDesdeForeignKeySesionAnio()) {
				Anio anio=new Anio();
				AnioConstantesFunciones.setAnioDescripcion(anio,Constantes.SMENSAJE_ESCOJA_OPCION);
				anio.setId(null);

				if(!AnioConstantesFunciones.ExisteEnLista(this.aniosForeignKey,anio,true)) {

					this.aniosForeignKey.add(0,anio);
				}
			}
		} catch(Exception e) {
			throw e;
		}
	}

	public void addItemDefectoCombosForeignKeyMes()throws Exception {
		try {

			if(!this.ingresospromediosSessionBean.getisBusquedaDesdeForeignKeySesionMes()) {
				Mes mes=new Mes();
				MesConstantesFunciones.setMesDescripcion(mes,Constantes.SMENSAJE_ESCOJA_OPCION);
				mes.setId(null);

				if(!MesConstantesFunciones.ExisteEnLista(this.messForeignKey,mes,true)) {

					this.messForeignKey.add(0,mes);
				}
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void initActionsCombosTodosForeignKeyIngresosPromedios()throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void initActionsCombosTodosForeignKeyIngresosPromedios(String sFormularioTipoBusqueda)throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	


	
	


	
	public void setVariablesGlobalesCombosForeignKeyIngresosPromedios()throws Exception {	
		try {
			if(this.parametroGeneralUsuario!=null && this.parametroGeneralUsuario.getId()>0) {
			
			
			
			}
			
			//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
			this.setVariablesGlobalesAuxiliaresCombosForeignKeyIngresosPromedios();
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToFormularioForeignKeyIngresosPromedios(IngresosPromedios ingresospromedios)throws Exception {	
		try {
						
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToListasForeignKeyIngresosPromedios(IngresosPromedios ingresospromedios,String sTipoEvento)throws Exception {	
		try {
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	/*
	public void setVariablesCombosFromBeanForeignKeyIngresosPromedios()throws Exception {	
		try {
						
		} catch(Exception e) {
			throw e;
		}
	}
	*/
	
	public void setVariablesGlobalesAuxiliaresCombosForeignKeyIngresosPromedios()throws Exception {	
		try {
			
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesDefaultCombosForeignKeyIngresosPromedios()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesParametroCombosForeignKeyIngresosPromedios()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void cargarCombosParametroIngresosPromedios()throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			//this.cargarDatosCliente();
			
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
		
	public void cargarCombosFrameForeignKeyIngresosPromedios()throws Exception {
		try {
			

			this.cargarCombosFrameEstructurasForeignKey("Todos");
			this.cargarCombosFrameEmpresasForeignKey("Todos");
			this.cargarCombosFrameAniosForeignKey("Todos");
			this.cargarCombosFrameMessForeignKey("Todos");

		} catch(Exception e) {
			throw e;
		}		
	}		
	
	public void cargarCombosFrameForeignKeyIngresosPromedios(String sFormularioTipoBusqueda)throws Exception {
		try {
			

			this.cargarCombosFrameEstructurasForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameEmpresasForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameAniosForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameMessForeignKey(sFormularioTipoBusqueda);

		} catch(Exception e) {
			throw e;
		}		
	}	
	
	public void setItemDefectoCombosForeignKeyIngresosPromedios()throws Exception {
		try {
			



			if(this.jInternalFrameDetalleFormIngresosPromedios.jComboBoxid_estructuraIngresosPromedios!=null && this.jInternalFrameDetalleFormIngresosPromedios.jComboBoxid_estructuraIngresosPromedios.getItemCount()>0) {
				this.jInternalFrameDetalleFormIngresosPromedios.jComboBoxid_estructuraIngresosPromedios.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormIngresosPromedios.jComboBoxid_empresaIngresosPromedios!=null && this.jInternalFrameDetalleFormIngresosPromedios.jComboBoxid_empresaIngresosPromedios.getItemCount()>0) {
				this.jInternalFrameDetalleFormIngresosPromedios.jComboBoxid_empresaIngresosPromedios.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormIngresosPromedios.jComboBoxid_anioIngresosPromedios!=null && this.jInternalFrameDetalleFormIngresosPromedios.jComboBoxid_anioIngresosPromedios.getItemCount()>0) {
				this.jInternalFrameDetalleFormIngresosPromedios.jComboBoxid_anioIngresosPromedios.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormIngresosPromedios.jComboBoxid_mesIngresosPromedios!=null && this.jInternalFrameDetalleFormIngresosPromedios.jComboBoxid_mesIngresosPromedios.getItemCount()>0) {
				this.jInternalFrameDetalleFormIngresosPromedios.jComboBoxid_mesIngresosPromedios.setSelectedIndex(0);
			}
		} catch(Exception e) {
			throw e;
		}		
	}		
	
	








	
	

	public IngresosPromediosBeanSwingJInternalFrame() throws Exception {
		super(false,PaginaTipo.PRINCIPAL);
	}
	
	public IngresosPromediosBeanSwingJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
	}
	
	public IngresosPromediosBeanSwingJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
		
		this.ingresospromediosSessionBean=new IngresosPromediosSessionBean(); 
		this.ingresospromediosConstantesFunciones=new IngresosPromediosConstantesFunciones(); 
		this.ingresospromediosBean=new IngresosPromedios();//(this.ingresospromediosConstantesFunciones); 		
		this.ingresospromediosReturnGeneral=new IngresosPromediosParameterReturnGeneral(); 
		
		this.ingresospromediosSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.ingresospromediosSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
				
	}
	
	public IngresosPromediosBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,cargarTodosDatos);
	}
		
	public IngresosPromediosBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,false,false,cargarRelaciones,cargarTodosDatos);
	}	
	
	public IngresosPromediosBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos) throws Exception //Boolean esParaBusquedaForeignKey
    {
		super(jdesktopPane,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		try {
			
			this.permiteRecargarForm=false;
			
			this.startProcessIngresosPromedios(true);
			
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
			
			this.ingresospromediosConstantesFunciones=new IngresosPromediosConstantesFunciones(); 
			this.ingresospromediosBean=new IngresosPromedios();//this.ingresospromediosConstantesFunciones); 			
			this.ingresospromediosReturnGeneral=new IngresosPromediosParameterReturnGeneral(); 
		
			IngresosPromediosBeanSwingJInternalFrameAdditional.CargaInicialInicio(this, "NORMAL", null);
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Ingresos Promedios Mantenimiento",paginaTipo));			
			
			this.conTotales=false;
			
			this.conTotales=true;
			
			
			this.ingresospromedios=new IngresosPromedios();
			this.ingresospromedioss = new ArrayList<IngresosPromedios>();
			this.ingresospromediossAux = new ArrayList<IngresosPromedios>();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.ingresospromediosLogic=new IngresosPromediosLogic();
				this.ingresospromediosLogic.getNewConnexionToDeep("");
			}
			
			//this.ingresospromediosSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
			//this.ingresospromediosSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
			
			this.jDesktopPane=jdesktopPane;
			
			if(this.jDesktopPane.getClass().equals(JDesktopPaneMe.class)) {
				this.constantes2=((JDesktopPaneMe)this.jDesktopPane).constantes2;
			}
			
			if(!Constantes.CON_VARIAS_VENTANAS) {
    			MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameDetalleFormIngresosPromedios);
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameReporteDinamicoIngresosPromedios!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoIngresosPromedios);	
					}
					
					if(this.jInternalFrameImportacionIngresosPromedios!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionIngresosPromedios);							
					}
					
				}
				
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameOrderByIngresosPromedios!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameOrderByIngresosPromedios);					
					}
					
				}
			}
			
			//DETALLE DATOS
			if(this.jInternalFrameDetalleFormIngresosPromedios!=null) { //this.conCargarFormDetalle) {
				this.jDesktopPane.add(this.jInternalFrameDetalleFormIngresosPromedios);
				this.jInternalFrameDetalleFormIngresosPromedios.setVisible(false);
				this.jInternalFrameDetalleFormIngresosPromedios.setSelected(false);						
			}
			
			if(!this.conCargarMinimo) {
				
				//REPORTE DINAMICO
				if(this.jInternalFrameReporteDinamicoIngresosPromedios!=null) {
					this.jDesktopPane.add(this.jInternalFrameReporteDinamicoIngresosPromedios);
					this.jInternalFrameReporteDinamicoIngresosPromedios.setVisible(false);
					this.jInternalFrameReporteDinamicoIngresosPromedios.setSelected(false);
				}
				
				//IMPORTACION
				if(this.jInternalFrameImportacionIngresosPromedios!=null) {
					this.jDesktopPane.add(this.jInternalFrameImportacionIngresosPromedios);
					this.jInternalFrameImportacionIngresosPromedios.setVisible(false);
					this.jInternalFrameImportacionIngresosPromedios.setSelected(false);
				}
				
				
			}
			
			
			if(!this.conCargarMinimo) {
				
				if(this.jInternalFrameOrderByIngresosPromedios!=null) {
					this.jDesktopPane.add(this.jInternalFrameOrderByIngresosPromedios);
					this.jInternalFrameOrderByIngresosPromedios.setVisible(false);
					this.jInternalFrameOrderByIngresosPromedios.setSelected(false);				
				}
				
			}
			
			
			//this.esParaBusquedaForeignKey=false;
			this.esParaBusquedaForeignKey=esParaBusquedaForeignKey;
			
			this.invalidValues=new InvalidValue[0];
			
			
			
			this.idIngresosPromediosActual=0L;
			this.rowIndexActual=0;
			
			
			this.iNumeroPaginacionPagina=0;
			this.iNumeroPaginacion=IngresosPromediosConstantesFunciones.INUMEROPAGINACION;
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
			
			this.ingresospromediosReturnGeneral=new IngresosPromediosParameterReturnGeneral();
			
			this.ingresospromediosParameterGeneral=new IngresosPromediosParameterReturnGeneral();
			
			
			
			this.sistemaLogicAdditional=new SistemaLogicAdditional();
			
			this.sistemaLogicAdditional.setConnexion(this.ingresospromediosLogic.getConnexion());			
			
			
			
			
			
			
			
			//VERIFICAR GLOBAL
			this.cargarDatosCliente();			
			
			
			if(!this.ingresospromediosSessionBean.getEsGuardarRelacionado()) {
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
			
			if(IngresosPromediosJInternalFrame.CON_LLAMADA_SIMPLE) {
				if(this.ingresospromediosSessionBean.getEsGuardarRelacionado()) {
					this.opcionActual.setId(0L);
					
					//idOpcion=0L;					
				}
				
				ArrayList<String> arrPaginas=new ArrayList<String>();		
				ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
				
		
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					//this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActualWithConnection(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,IngresosPromediosConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.ingresospromediosSessionBean.getEsGuardarRelacionado(),this.ingresospromediosSessionBean.getConGuardarRelaciones(),arrPaginas);
					
					this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActual(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,IngresosPromediosConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.ingresospromediosSessionBean.getEsGuardarRelacionado(),this.ingresospromediosSessionBean.getConGuardarRelaciones(),arrPaginas);
					
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
			
			this.isVisibilidadCeldaNuevoIngresosPromedios=false;
			this.isVisibilidadCeldaDuplicarIngresosPromedios=true;
			this.isVisibilidadCeldaCopiarIngresosPromedios=true;
			this.isVisibilidadCeldaVerFormIngresosPromedios=true;
			this.isVisibilidadCeldaOrdenIngresosPromedios=true;
			this.isVisibilidadCeldaNuevoRelacionesIngresosPromedios=false;
			this.isVisibilidadCeldaModificarIngresosPromedios=false;
			this.isVisibilidadCeldaActualizarIngresosPromedios=false;
			this.isVisibilidadCeldaEliminarIngresosPromedios=false;
			this.isVisibilidadCeldaCancelarIngresosPromedios=false;
			this.isVisibilidadCeldaGuardarIngresosPromedios=false;
			this.isVisibilidadCeldaGuardarCambiosIngresosPromedios=false;
			
			
			this.isVisibilidadBusquedaIngresosPromedios=true;
			this.isVisibilidadFK_IdAnio=true;
			this.isVisibilidadFK_IdEmpresa=true;
			this.isVisibilidadFK_IdEstructura=true;
			this.isVisibilidadFK_IdMes=true;
			
			//ELEMENTOS TABLAS PARAMETOS
			
			
			
			//ELEMENTOS TABLAS PARAMETOS_FIN
			
			//this.actualizarEstadoCeldasBotonesIngresosPromedios("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
						
			
			
			this.inicializarPermisosIngresosPromedios();
			
			//INICIALIZAR FALSE, TALVEZ COMENTAR
			this.setPermisosUsuarioIngresosPromedios(false);
			
			this.setPermisosUsuarioIngresosPromedios();
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.ingresospromediosSessionBean.getEsGuardarRelacionado() 
				|| (this.ingresospromediosSessionBean.getEsGuardarRelacionado() && this.ingresospromediosSessionBean.getConGuardarRelaciones())) {
				
				this.inicializarSetPermisosUsuarioIngresosPromediosClasesRelacionadas();
			}
			
			if(this.ingresospromediosSessionBean.getConGuardarRelaciones()) {
				this.actualizarTabsSetPermisosUsuarioIngresosPromediosClasesRelacionadas();
			}
			
			
			
			//SOLO SE EJECUTA LA PRIMERA VEZ, BINDINGS SI FUNCIONA
			if(!IngresosPromediosJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingBotonesPermisosIngresosPromedios();
			} else {
				this.inicializarActualizarBindingBotonesPermisosManualIngresosPromedios();
			}
			
			if(!this.isPermisoBusquedaIngresosPromedios) {
				//BYDAN_BUSQUEDAS
				
				this.jTabbedPaneBusquedasIngresosPromedios.setVisible(false);				
				
			}
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.ingresospromediosSessionBean.getEsGuardarRelacionado()) {				
				this.tiposArchivosReportes=Funciones.getListTiposArchivosReportes();
				this.tiposArchivosReportesDinamico=Funciones.getListTiposArchivosReportes();
				this.tiposReportes=Funciones.getListTiposReportes(true);
				this.tiposReportesDinamico=Funciones.getListTiposReportesDinamico(true);
				
				
				
				this.tiposGraficosReportes=Funciones2.getListTiposGraficosReportes();
				this.tiposPaginacion=Funciones2.getListTiposPaginacion(true,true,true);
				this.tiposSeleccionar=Funciones2.getListTiposSeleccionar();
				this.tiposSeleccionar.addAll(IngresosPromediosConstantesFunciones.getTiposSeleccionarIngresosPromedios());
				
				this.tiposColumnasSelect=IngresosPromediosConstantesFunciones.getTiposSeleccionarIngresosPromedios(true);
				
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
			//if(!this.ingresospromediosSessionBean.getEsGuardarRelacionado()) {
				//SE ENCUENTRA MAS ADELANTE CON ACCIONES POR USUARIO
				//ACCIONES GENERALES Y POR USUARIO
				this.tiposRelaciones=Funciones2.getListTiposRelaciones();
				this.setRelacionesUsuarioIngresosPromedios();
				
				this.tiposAcciones=Funciones2.getListTiposAcciones(true,false,false);
				this.setAccionesUsuarioIngresosPromedios(false);	
				
				this.tiposAccionesFormulario=Funciones2.getListTiposAccionesFormulario(true,false,false);							
				this.setAccionesUsuarioIngresosPromedios(true);	
				
				this.inicializarActualizarBindingtiposArchivosReportesAccionesIngresosPromedios() ;
			
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
			
			this.estructuraLogic=new EstructuraLogic();
			this.empresaLogic=new EmpresaLogic();
			this.anioLogic=new AnioLogic();
			this.mesLogic=new MesLogic();
			
			//PARAMETROS
			
			
			/*
			if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {		
				hashtableEnv =  Funciones.getHashtableEnv();		
				initialContext = new InitialContext(hashtableEnv);	
			}
			*/
			/*
			if(Constantes.ISUSAEJBREMOTE) {
				ingresospromediosImplementable= (IngresosPromediosImplementable) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+IngresosPromediosConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBREMOTE);
			} else if(Constantes.ISUSAEJBHOME) {
				ingresospromediosImplementableHome= (IngresosPromediosImplementableHome) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+IngresosPromediosConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBLOCAL);
			}			
			*/
			
			
			this.ingresospromedioss= new ArrayList<IngresosPromedios>();
			this.ingresospromediossEliminados= new ArrayList<IngresosPromedios>();
						
			this.isEsNuevoIngresosPromedios=false;
			this.esParaAccionDesdeFormularioIngresosPromedios=false;
			this.isEsMantenimientoRelacionesRelacionadoUnico=false;
			this.isEsMantenimientoRelaciones=false;
			this.isEsMantenimientoRelacionado=false;
			this.isContieneImagenes=false;
			
			
			
			
			
			//INICIALIZAR LISTAS FK
			
			this.estructurasForeignKey=new ArrayList<Estructura>() ;
			this.empresasForeignKey=new ArrayList<Empresa>() ;
			this.aniosForeignKey=new ArrayList<Anio>() ;
			this.messForeignKey=new ArrayList<Mes>() ;
			
			
			
			
			if(blncargarCombostrForeignKey) {
				this.cargarCombosForeignKeyIngresosPromedios(this.isCargarCombosDependencia);
			}
			
			this.cargarCombosParametroIngresosPromedios();
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.ingresospromediosSessionBean.getEsGuardarRelacionado()) {
				this.onLoad();
			}
						
			IngresosPromediosBeanSwingJInternalFrameAdditional.RecargarVentanaSegunOpcion(this,opcionActual);
			
			/*
			if(blnCargarInformacionInicial) {
				this.recargarInformacion();
			}
			*/
			//this.iNumeroPaginacionPagina=0;
			//this.iNumeroPaginacion=IngresosPromediosConstantesFunciones.INUMEROPAGINACION;
			
			this.actualizarEstadoCeldasBotonesIngresosPromedios("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			//SOLO LA PRIMERA VEZ HACE LOS BINDINGS, SOLO AHI FUNCIONA
			this.inicializarActualizarBindingIngresosPromedios(true); 
			
			//SE REDIMENSIONA SINO NO SE ACTUALIZA
			this.redimensionarTablaDatos();
			
			
			this.initActions();
			
			;
						
			if(this.jInternalFrameDetalleFormIngresosPromedios!=null) {//if(this.conCargarFormDetalle) {
				this.cargarMenuRelaciones();
			}
			
			//OBLIGA CARGAR DETALLE, MEJOR DESHABILITAR, FALTA TALVEZ PONER EN SELECCIONAR
			//MAYBE
			//this.updateControlesFormularioIngresosPromedios();
			
			if(!this.conCargarMinimo) {
				this.updateBusquedasFormularioIngresosPromedios();
			}
			
			IngresosPromediosBeanSwingJInternalFrameAdditional.CargaInicial(this, "NORMAL", null);
			
			
			//SE REALIZA ESTO PARA QUE SE PUEDA RECORRER TAB SIN IMPORTAR ORDEN
			Boolean existeTabBusqueda=false;
			
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				
				for(int i=0; i<this.jTabbedPaneBusquedasIngresosPromedios.getTabCount(); i++) {
					this.jTabbedPaneBusquedasIngresosPromedios.setSelectedIndex(i);
						
					if(!existeTabBusqueda) {
						existeTabBusqueda=true;
					}
				}
					
				if(existeTabBusqueda) {
					this.jTabbedPaneBusquedasIngresosPromedios.setSelectedIndex(0);
				}	
				
				
			}
			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.ingresospromediosLogic.commitNewConnexionToDeep();
			}
			
			
			if(Constantes2.ISDEVELOPING2) {
				end_time = System.currentTimeMillis();			
				String sTipo="Load Ventana";
				Funciones2.getMensajeTiempoEjecucion(start_time, end_time, sTipo,false);
			}  
			
			this.finishProcessIngresosPromedios(true);
			
			this.dEnd=(double)System.currentTimeMillis();
			
			this.dDif=this.dEnd - this.dStart;
			
			if(Constantes.ISDEVELOPING) {
				System.out.println("Tiempo(ms) Carga IngresosPromedios: " + this.dDif); 
			}
			
			this.permiteRecargarForm=true;
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.ingresospromediosLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,IngresosPromediosConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.ingresospromediosLogic.closeNewConnexionToDeep();
			}
		}	 
    }
	
	public void cargarTiposRelacionesSelectIngresosPromedios() {
		Reporte reporte=new Reporte();
		
	
	}
	
	
	
	public void jTabbedPaneChangeListenerGeneral(String sTipo,ChangeEvent evt) { 	  
		Boolean procesaCargarParteTab=false;
			
		try {
			int iIndex=0;		    			
			String sTitle="";
			
			//TABBED PANE RELACIONES
			if(sTipo.equals("RelacionesIngresosPromedios")) {
				iIndex=this.jInternalFrameDetalleFormIngresosPromedios.jTabbedPaneRelacionesIngresosPromedios.getSelectedIndex();		    
			
				sTitle=this.jInternalFrameDetalleFormIngresosPromedios.jTabbedPaneRelacionesIngresosPromedios.getTitleAt(iIndex);
				
				Integer intSelectedRow = 0;	
			
				intSelectedRow = this.jTableDatosIngresosPromedios.getSelectedRow();	
				
				
				
			}
			
			//TABBED PANE RELACIONES FIN(EXTRA TAB)
			;
			
  		} catch(Exception e) {
  			e.printStackTrace();
  		} finally {
			if(procesaCargarParteTab) {				
				this.finishProcessIngresosPromedios();	
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
	
	public void cargarCombosForeignKeyIngresosPromedios(Boolean cargarCombosDependencia) throws Exception {   
		this.cargarCombosForeignKeyIngresosPromedios(cargarCombosDependencia,true,true);
	}
	
	//CARGAR COMBOS EN LOTE
	public void cargarCombosForeignKeyIngresosPromedios(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales) throws Exception {   
		this.cargarCombosTodosForeignKeyIngresosPromediosListas(cargarCombosDependencia);
				
		this.addItemDefectoCombosTodosForeignKeyIngresosPromedios();
		
		this.cargarCombosFrameForeignKeyIngresosPromedios();						
		
		if(conInitActions) {
			this.initActionsCombosTodosForeignKeyIngresosPromedios();
		}
		
		if(conSetVariablesGlobales) {
			this.setVariablesGlobalesCombosForeignKeyIngresosPromedios();
		}
	}
	
	

	public void cargarCombosForeignKeyEstructura(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales,String sFinalQueryCombo,String sFormularioTipoBusqueda) throws Exception {
		try {
				this.cargarCombosForeignKeyEstructuraListas(cargarCombosDependencia,sFinalQueryCombo);
				this.addItemDefectoCombosForeignKeyEstructura();
				this.cargarCombosFrameEstructurasForeignKey(sFormularioTipoBusqueda);

				if(conInitActions) {
				}

			this.recargarComboTablaEstructura(this.estructurasForeignKey);

		} catch(Exception e) {
			throw e;
		}
	}

	public void cargarCombosForeignKeyAnio(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales,String sFinalQueryCombo,String sFormularioTipoBusqueda) throws Exception {
		try {
				this.cargarCombosForeignKeyAnioListas(cargarCombosDependencia,sFinalQueryCombo);
				this.addItemDefectoCombosForeignKeyAnio();
				this.cargarCombosFrameAniosForeignKey(sFormularioTipoBusqueda);

				if(conInitActions) {
				}

			this.recargarComboTablaAnio(this.aniosForeignKey);

		} catch(Exception e) {
			throw e;
		}
	}

	public void cargarCombosForeignKeyMes(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales,String sFinalQueryCombo,String sFormularioTipoBusqueda) throws Exception {
		try {
				this.cargarCombosForeignKeyMesListas(cargarCombosDependencia,sFinalQueryCombo);
				this.addItemDefectoCombosForeignKeyMes();
				this.cargarCombosFrameMessForeignKey(sFormularioTipoBusqueda);

				if(conInitActions) {
				}

			this.recargarComboTablaMes(this.messForeignKey);

		} catch(Exception e) {
			throw e;
		}
	}
	
	public void jButtonNuevoIngresosPromediosActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.FORM_RECARGAR;
			String sTipo="NUEVO_NORMAL";
			
			this.estaModoNuevo=true;
			
			if(this.ingresospromediosSessionBean.getConGuardarRelaciones()) {
				this.dStart=(double)System.currentTimeMillis();
			}
				
			//if(this.esUsoDesdeHijo) {
			//	eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
			//}
											
			if(this.jInternalFrameDetalleFormIngresosPromedios==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}			
				
			IngresosPromediosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.ingresospromedios,new Object(),this.ingresospromediosParameterGeneral,this.ingresospromediosReturnGeneral);
			
			
			if(jTableDatosIngresosPromedios.getRowCount()>=1) {
				jTableDatosIngresosPromedios.removeRowSelectionInterval(0, jTableDatosIngresosPromedios.getRowCount()-1);						
			}
			
			this.isEsNuevoIngresosPromedios=true;
			
			//ESTABLECE SI ES RELACIONADO O NO 
			this.habilitarDeshabilitarTipoMantenimientoIngresosPromedios(esRelaciones);
			
			this.nuevoPreparar(false); 
			this.habilitarDeshabilitarControlesIngresosPromedios(true);			
			//this.ingresospromedios=new IngresosPromedios();
			//this.ingresospromedios.setIsChanged(true);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesIngresosPromedios(false) ;						
			 
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualIngresosPromedios() ;
			
			if(IngresosPromediosJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleIngresosPromedios(esRelaciones);
			}
					
			//Se Duplica, sin sentido
			//this.actualizarInformacion("EVENTO_NUEVO",false,this.ingresospromedios);	
			this.actualizarInformacion("INFO_PADRE",false,this.ingresospromedios);				
			
			IngresosPromediosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.ingresospromedios,new Object(),this.ingresospromediosParameterGeneral,this.ingresospromediosReturnGeneral);
			
			if(this.ingresospromediosSessionBean.getConGuardarRelaciones()) {
				this.dEnd=(double)System.currentTimeMillis();					
				this.dDif=this.dEnd - this.dStart;
					
				if(Constantes.ISDEVELOPING) {
					System.out.println("Tiempo(ms) Nuevo Preparar IngresosPromedios: " + this.dDif); 
				}
			}
			
			//false para que pueda generar eventos
			this.estaModoNuevo=false;
							
			//Con this.estaModoNuevo=false;, se permite actualizar y usar eventos control al mismo tiempo (FuncionTipo.LAST)			
			IngresosPromediosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.LAST,ControlTipo.FORM,EventoTipo.CLIC,EventoSubTipo.NEW,sTipo,this.ingresospromedios,new Object(),this.ingresospromediosParameterGeneral,this.ingresospromediosReturnGeneral);
			
		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,IngresosPromediosConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;			
		}
	}
	
	public void jButtonDuplicarIngresosPromediosActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			Boolean soloDuplicarUno=false;
			Boolean conSeleccionarFilaTabla=false;
			
			this.estaModoNuevo=true;
			this.estaModoDuplicar=true;
			
			ArrayList<IngresosPromedios> ingresospromediossSeleccionados=new ArrayList<IngresosPromedios>();
			int intSelectedRow =-1;
			Integer iNumRowsSeleccionados=0;
			int[] arrNumRowsSeleccionados=null;
			
			//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
			if(conSeleccionarFilaTabla) {
				arrNumRowsSeleccionados=this.jTableDatosIngresosPromedios.getSelectedRows();
				iNumRowsSeleccionados=this.jTableDatosIngresosPromedios.getSelectedRows().length;			
			}
			
			ingresospromediossSeleccionados=this.getIngresosPromediossSeleccionados(false);
				
			if((soloDuplicarUno && iNumRowsSeleccionados.equals(1)) || !soloDuplicarUno) {
				//LO HACE NUEVOPREPARAR
				//this.iIdNuevoIngresosPromedios--;			
				//IngresosPromedios ingresospromediosAux= new IngresosPromedios();			
				//ingresospromediosAux.setId(this.iIdNuevoIngresosPromedios);																
				
				//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
				//IngresosPromedios ingresospromediosOrigen=new IngresosPromedios();
				//for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {				
				
				for(IngresosPromedios ingresospromediosOrigen : ingresospromediossSeleccionados) {
					if(conSeleccionarFilaTabla) {
						if(!soloDuplicarUno) {
							//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
							//intSelectedRow =iNumRowSeleccionado;
						} else {
							intSelectedRow = this.jTableDatosIngresosPromedios.getSelectedRow();
						}
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							ingresospromediosOrigen =(IngresosPromedios) this.ingresospromediosLogic.getIngresosPromedioss().toArray()[this.jTableDatosIngresosPromedios.convertRowIndexToModel(intSelectedRow)];
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							ingresospromediosOrigen =(IngresosPromedios) this.ingresospromedioss.toArray()[this.jTableDatosIngresosPromedios.convertRowIndexToModel(intSelectedRow)];
						}
					}
					
					this.aumentarTamanioFilaNuevaTablaIngresosPromedios();
					
					if(this.conTotales) {
						this.quitarFilaTotales();
					}
					
					this.nuevoPreparar(true);
					
					this.ingresospromedios.setsType("DUPLICADO");
					
					this.setCopiarVariablesObjetosIngresosPromedios(ingresospromediosOrigen,this.ingresospromedios,true,true);
					
					this.setVariablesFormularioToObjetoActualForeignKeysIngresosPromedios(this.ingresospromedios);
					
					//LO HACE NUEVOPREPARAR
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.ingresospromediosLogic.getIngresosPromedioss().add(this.ingresospromediosAux);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.ingresospromedioss.add(this.ingresospromediosAux);				
					}
					*/
				}
				
				this.inicializarActualizarBindingTablaIngresosPromedios(false);
				
				this.jTableDatosIngresosPromedios.setRowSelectionInterval(this.getIndiceNuevoIngresosPromedios(), this.getIndiceNuevoIngresosPromedios());
				
				int iLastRow =  this.jTableDatosIngresosPromedios.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosIngresosPromedios.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosIngresosPromedios.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaIngresosPromedios(false);
				}
			} else {
				throw new Exception("DEBE ESTAR SELECCIONADO 1 REGISTRO");
			}
			
		} catch(Exception e) {			
			FuncionesSwing.manageException(this, e,logger,IngresosPromediosConstantesFunciones.CLASSNAME);
		
		} finally {
			this.estaModoNuevo=false;
			this.estaModoDuplicar=false;
		}
	}
	
	public void jButtonCopiarIngresosPromediosActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			Boolean conSeleccionarFilaTabla=false;
			Integer iNumRowsSeleccionados=0;
			int[] intSelectedRows =null;
			int intSelectedRow =0;
			
			this.estaModoCopiar=true;
			
			ArrayList<IngresosPromedios> ingresospromediossSeleccionados=new ArrayList<IngresosPromedios>();									
		
			IngresosPromedios ingresospromediosOrigen=new IngresosPromedios();
			IngresosPromedios ingresospromediosDestino=new IngresosPromedios();
				
			ingresospromediossSeleccionados=this.getIngresosPromediossSeleccionados(false);
			
			if(conSeleccionarFilaTabla) {
				iNumRowsSeleccionados=this.jTableDatosIngresosPromedios.getSelectedRows().length;	
			}
			
			if(iNumRowsSeleccionados.equals(2) || ingresospromediossSeleccionados.size()==2) {
				if(conSeleccionarFilaTabla) {
					intSelectedRows =this.jTableDatosIngresosPromedios.getSelectedRows();
					intSelectedRow = intSelectedRows[0];	
									
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						ingresospromediosOrigen =(IngresosPromedios) this.ingresospromediosLogic.getIngresosPromedioss().toArray()[this.jTableDatosIngresosPromedios.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						ingresospromediosOrigen =(IngresosPromedios) this.ingresospromedioss.toArray()[this.jTableDatosIngresosPromedios.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					intSelectedRow = intSelectedRows[1];
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						ingresospromediosDestino =(IngresosPromedios) this.ingresospromediosLogic.getIngresosPromedioss().toArray()[this.jTableDatosIngresosPromedios.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						ingresospromediosDestino =(IngresosPromedios) this.ingresospromedioss.toArray()[this.jTableDatosIngresosPromedios.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				}
				
				ingresospromediosOrigen =ingresospromediossSeleccionados.get(0);
				ingresospromediosDestino =ingresospromediossSeleccionados.get(1);
				
				this.setCopiarVariablesObjetosIngresosPromedios(ingresospromediosOrigen,ingresospromediosDestino,true,false);
				
				ingresospromediosDestino.setsType("DUPLICADO");
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(ingresospromediosDestino,ingresospromediosLogic.getIngresosPromedioss());					
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(ingresospromediosDestino,ingresospromedioss);
				}
				//ARCHITECTURE
				
				this.inicializarActualizarBindingTablaIngresosPromedios(false);
				
				//this.jTableDatosIngresosPromedios.setRowSelectionInterval(this.getIndiceNuevoIngresosPromedios(), this.getIndiceNuevoIngresosPromedios());
				
				int iLastRow =  this.jTableDatosIngresosPromedios.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosIngresosPromedios.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosIngresosPromedios.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					//this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaIngresosPromedios(false);
				}
			} else {
				throw new Exception("DEBEN ESTAR SELECCIONADOS 2 REGISTROS");
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,IngresosPromediosConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.estaModoCopiar=false;
		}
	}
	
	public void jButtonVerFormIngresosPromediosActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormIngresosPromedios==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.jInternalFrameDetalleFormIngresosPromedios.setSelected(true);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,IngresosPromediosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonMostrarOcultarIngresosPromediosActionPerformed(ActionEvent evt) throws Exception {   
		try {
			Boolean isVisible=this.jPanelParametrosReportesIngresosPromedios.isVisible();
			
			//BYDAN_BUSQUEDAS
			
			this.jTabbedPaneBusquedasIngresosPromedios.setVisible(!isVisible);			
			
			
			this.jPanelParametrosReportesIngresosPromedios.setVisible(!isVisible);
			this.jPanelPaginacionIngresosPromedios.setVisible(!isVisible);
			this.jPanelAccionesIngresosPromedios.setVisible(!isVisible);
							
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,IngresosPromediosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarIngresosPromediosActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.closingInternalFrameIngresosPromedios();
			
			//if(this.jInternalFrameParent==null) {
				//this.dispose();
			/*} else {
				this.setVisible(false);
	        	this.setSelected(false);	
			}*/			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,IngresosPromediosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarReporteDinamicoIngresosPromediosActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameReporteDinamicoIngresosPromedios();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,IngresosPromediosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarImportacionIngresosPromediosActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameImportacionIngresosPromedios();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,IngresosPromediosConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonAbrirOrderByIngresosPromediosActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			
			this.abrirInicializarFrameOrderByIngresosPromedios();
			
			this.abrirFrameOrderByIngresosPromedios();
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,IngresosPromediosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarOrderByIngresosPromediosActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameOrderByIngresosPromedios();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,IngresosPromediosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void abrirFrameDetalleIngresosPromedios(Boolean esRelaciones) throws Exception {	    	        
	    try {
			//CAUSA PROBLEMAS, SE ADICIONA EN CONSTRUCTOR, LUEGO SOLO VISIBLE true y false
			//this.jDesktopPane.add(jInternalFrameDetalleFormIngresosPromedios);
			
			if(!esRelaciones) {
				if(this.jInternalFrameDetalleFormIngresosPromedios.isMaximum()) {
					this.jInternalFrameDetalleFormIngresosPromedios.setMaximum(false);
				}								
				
	    		this.jInternalFrameDetalleFormIngresosPromedios.setSize(this.jInternalFrameDetalleFormIngresosPromedios.iWidthFormulario,this.jInternalFrameDetalleFormIngresosPromedios.iHeightFormulario);
	    	} else {
				if(this.iWidthScroll<this.jInternalFrameDetalleFormIngresosPromedios.iWidthFormularioMaximo) {
	    			this.jInternalFrameDetalleFormIngresosPromedios.setSize(this.iWidthScroll,this.iHeightScroll);
				} else {
					if(!this.jInternalFrameDetalleFormIngresosPromedios.isMaximum()) {
						this.jInternalFrameDetalleFormIngresosPromedios.setMaximum(true);
					}
				}
				
				if(this.jInternalFrameDetalleFormIngresosPromedios.jContentPaneDetalleIngresosPromedios.getWidth() > this.getWidth()) {
					this.jInternalFrameDetalleFormIngresosPromedios.jTabbedPaneRelacionesIngresosPromedios.setMinimumSize(new Dimension(this.jInternalFrameDetalleFormIngresosPromedios.jContentPaneDetalleIngresosPromedios.getWidth(),IngresosPromediosConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormIngresosPromedios.jTabbedPaneRelacionesIngresosPromedios.setMaximumSize(new Dimension(this.jInternalFrameDetalleFormIngresosPromedios.jContentPaneDetalleIngresosPromedios.getWidth(),IngresosPromediosConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormIngresosPromedios.jTabbedPaneRelacionesIngresosPromedios.setPreferredSize(new Dimension(this.jInternalFrameDetalleFormIngresosPromedios.jContentPaneDetalleIngresosPromedios.getWidth(),IngresosPromediosConstantesFunciones.ALTO_TABPANE_RELACIONES));
					
					Dimension dimension=new Dimension(); 
					
					
					
				}
	    	}
			
		
	       	this.jInternalFrameDetalleFormIngresosPromedios.setVisible(true);
	        this.jInternalFrameDetalleFormIngresosPromedios.setSelected(true);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,IngresosPromediosConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirInicializarFrameOrderByIngresosPromedios() throws Exception {	    	        
	    try {
			if(this.jInternalFrameOrderByIngresosPromedios==null) {
				
				if(!this.conCargarMinimo) {
					this.jInternalFrameOrderByIngresosPromedios=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByIngresosPromedios,false,this);
				} else {
					this.jInternalFrameOrderByIngresosPromedios=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByIngresosPromedios,true,this);
				}
				
				this.jDesktopPane.add(this.jInternalFrameOrderByIngresosPromedios);
				this.jInternalFrameOrderByIngresosPromedios.setVisible(false);
				this.jInternalFrameOrderByIngresosPromedios.setSelected(false);
				
				this.jInternalFrameOrderByIngresosPromedios.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByIngresosPromedios"));
				
				this.inicializarActualizarBindingTablaOrderByIngresosPromedios();
			}
		} catch (final Exception e) {
			
		}
	}
	
	
	
	public void abrirInicializarFrameImportacionIngresosPromedios() throws Exception {	    	        
	    try {
			if(this.jInternalFrameImportacionIngresosPromedios==null) {
				
				this.jInternalFrameImportacionIngresosPromedios=new ImportacionJInternalFrame(IngresosPromediosConstantesFunciones.SCLASSWEBTITULO,this);			
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionIngresosPromedios);							
				
				this.jDesktopPane.add(this.jInternalFrameImportacionIngresosPromedios);
				this.jInternalFrameImportacionIngresosPromedios.setVisible(false);
				this.jInternalFrameImportacionIngresosPromedios.setSelected(false);


				this.jInternalFrameImportacionIngresosPromedios.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionIngresosPromedios"));
				this.jInternalFrameImportacionIngresosPromedios.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionIngresosPromedios"));
				this.jInternalFrameImportacionIngresosPromedios.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionIngresosPromedios"));


			}
		} catch (final Exception e) {
			
		}
	}		
	
	
	
	public void abrirInicializarFrameReporteDinamicoIngresosPromedios() throws Exception {	    	        
	    try {
			
			if(this.jInternalFrameReporteDinamicoIngresosPromedios==null) {
				this.jInternalFrameReporteDinamicoIngresosPromedios=new ReporteDinamicoJInternalFrame(IngresosPromediosConstantesFunciones.SCLASSWEBTITULO,this);	
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoIngresosPromedios);	
	
	
				this.jDesktopPane.add(this.jInternalFrameReporteDinamicoIngresosPromedios);
				this.jInternalFrameReporteDinamicoIngresosPromedios.setVisible(false);
				this.jInternalFrameReporteDinamicoIngresosPromedios.setSelected(false);
	
	
	
				this.jInternalFrameReporteDinamicoIngresosPromedios.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoIngresosPromedios"));
				this.jInternalFrameReporteDinamicoIngresosPromedios.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoIngresosPromedios"));
				this.jInternalFrameReporteDinamicoIngresosPromedios.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoIngresosPromedios"));
	
				this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualIngresosPromedios();
			}

		} catch (final Exception e) {
			
		}
	}	
	
	
	
		
					
	public void cerrarFrameDetalleIngresosPromedios() throws Exception {	    	        
	    try {
			//this.jDesktopPane.add(jInternalFrameDetalleFormIngresosPromedios);
			
	       	this.jInternalFrameDetalleFormIngresosPromedios.setVisible(false);
	        this.jInternalFrameDetalleFormIngresosPromedios.setSelected(false);
			
			//this.jInternalFrameDetalleFormIngresosPromedios.dispose();
			//this.jInternalFrameDetalleFormIngresosPromedios=null;
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,IngresosPromediosConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirFrameReporteDinamicoIngresosPromedios() throws Exception {	    	        
	    try {
			
			this.jInternalFrameReporteDinamicoIngresosPromedios.setVisible(true);
	        this.jInternalFrameReporteDinamicoIngresosPromedios.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,IngresosPromediosConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void abrirFrameImportacionIngresosPromedios() throws Exception {	    	        		
	    try {			
			this.jInternalFrameImportacionIngresosPromedios.setVisible(true);
	        this.jInternalFrameImportacionIngresosPromedios.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,IngresosPromediosConstantesFunciones.CLASSNAME);
	    }		
	}	
	
	
	
	
	
	public void abrirFrameOrderByIngresosPromedios() throws Exception {	    	        		
	    try {
			this.jInternalFrameOrderByIngresosPromedios.setVisible(true);
	        this.jInternalFrameOrderByIngresosPromedios.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,IngresosPromediosConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameOrderByIngresosPromedios() throws Exception {	    	        		
	    try {			
			this.jInternalFrameOrderByIngresosPromedios.setVisible(false);
	        this.jInternalFrameOrderByIngresosPromedios.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,IngresosPromediosConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameReporteDinamicoIngresosPromedios() throws Exception {			
	    try {
			this.jInternalFrameReporteDinamicoIngresosPromedios.setVisible(false);
	        this.jInternalFrameReporteDinamicoIngresosPromedios.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,IngresosPromediosConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameImportacionIngresosPromedios() throws Exception {	    	        		
	    try {
			this.jInternalFrameImportacionIngresosPromedios.setVisible(false);
	        this.jInternalFrameImportacionIngresosPromedios.setSelected(false);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,IngresosPromediosConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	
	public void jButtonModificarIngresosPromediosActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.modificarIngresosPromedios(evt,-1,false);
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,IngresosPromediosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void modificarIngresosPromedios(ActionEvent evt,int rowIndex,Boolean esRelaciones) throws Exception {   
		try {
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosIngresosPromedios.getSelectedRow();
			}
			
			this.habilitarDeshabilitarControlesIngresosPromedios(true);
			//this.isEsNuevoIngresosPromedios=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.ingresospromedios =(IngresosPromedios) this.ingresospromediosLogic.getIngresosPromedioss().toArray()[this.jTableDatosIngresosPromedios.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.ingresospromedios =(IngresosPromedios) this.ingresospromedioss.toArray()[this.jTableDatosIngresosPromedios.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.actualizarEstadoCeldasBotonesIngresosPromedios("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesIngresosPromedios(false) ;
			
			if(ingresospromediosSessionBean.getConGuardarRelaciones()) {
			
			}
			
			if(IngresosPromediosJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleIngresosPromedios(esRelaciones);
			}
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualIngresosPromedios(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,IngresosPromediosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarFilaTablaIngresosPromediosActual() { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL
			Integer intSelectedRow = this.jTableDatosIngresosPromedios.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.ingresospromedios =(IngresosPromedios) this.ingresospromediosLogic.getIngresosPromedioss().toArray()[this.jTableDatosIngresosPromedios.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.ingresospromedios =(IngresosPromedios) this.ingresospromedioss.toArray()[this.jTableDatosIngresosPromedios.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,IngresosPromediosConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void seleccionarIngresosPromedios(ActionEvent evt,int rowIndex) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormIngresosPromedios==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosIngresosPromedios.getSelectedRow();
			}
			
			//this.habilitarDeshabilitarControlesIngresosPromedios(true);
			//this.isEsNuevoIngresosPromedios=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.ingresospromedios =(IngresosPromedios) this.ingresospromediosLogic.getIngresosPromedioss().toArray()[this.jTableDatosIngresosPromedios.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.ingresospromedios =(IngresosPromedios) this.ingresospromedioss.toArray()[this.jTableDatosIngresosPromedios.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.jInternalFrameParent.setIdCombosCodigoDesdeBusquedaForeignKey(this.ingresospromedios.getId(),this.sTipoBusqueda);
			
			this.dispose();
			
			//this.actualizarEstadoCeldasBotonesIngresosPromedios("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			/*
			this.inicializarActualizarBindingBotonesIngresosPromedios(false) ;
			
			if(IngresosPromediosJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleIngresosPromedios(esRelaciones);
			}
			*/
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualIngresosPromedios(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,IngresosPromediosConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void setIdCombosCodigoDesdeBusquedaForeignKey(Long id,String sType)throws Exception{
		
		try {
		} catch(Exception e) {
			throw e;
		}
	}
	
	
	
	public void recargarComboTablaEstructura(List<Estructura> estructurasForeignKey)throws Exception{
		TableColumn tableColumnEstructura=this.jTableDatosIngresosPromedios.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosIngresosPromedios,IngresosPromediosConstantesFunciones.LABEL_IDESTRUCTURA));
		TableCellEditor tableCellEditorEstructura =tableColumnEstructura.getCellEditor();

		EstructuraTableCell estructuraTableCellFk=(EstructuraTableCell)tableCellEditorEstructura;

		if(estructuraTableCellFk!=null) {
			estructuraTableCellFk.setestructurasForeignKey(estructurasForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosIngresosPromedios.getSelectedRow();

		//if(intSelectedRow<=0) {
			//estructuraTableCellFk.setRowActual(intSelectedRow);
			//estructuraTableCellFk.setestructurasForeignKeyActual(estructurasForeignKey);
		//}


		if(estructuraTableCellFk!=null) {
			estructuraTableCellFk.RecargarEstructurasForeignKey();
			//ACTUALIZA COMBOS DE TABLA-FIN
		}

	}	
		
	
	public void recargarComboTablaAnio(List<Anio> aniosForeignKey)throws Exception{
		TableColumn tableColumnAnio=this.jTableDatosIngresosPromedios.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosIngresosPromedios,IngresosPromediosConstantesFunciones.LABEL_IDANIO));
		TableCellEditor tableCellEditorAnio =tableColumnAnio.getCellEditor();

		AnioTableCell anioTableCellFk=(AnioTableCell)tableCellEditorAnio;

		if(anioTableCellFk!=null) {
			anioTableCellFk.setaniosForeignKey(aniosForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosIngresosPromedios.getSelectedRow();

		//if(intSelectedRow<=0) {
			//anioTableCellFk.setRowActual(intSelectedRow);
			//anioTableCellFk.setaniosForeignKeyActual(aniosForeignKey);
		//}


		if(anioTableCellFk!=null) {
			anioTableCellFk.RecargarAniosForeignKey();
			//ACTUALIZA COMBOS DE TABLA-FIN
		}

	}	
	
	
	public void recargarComboTablaMes(List<Mes> messForeignKey)throws Exception{
		TableColumn tableColumnMes=this.jTableDatosIngresosPromedios.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosIngresosPromedios,IngresosPromediosConstantesFunciones.LABEL_IDMES));
		TableCellEditor tableCellEditorMes =tableColumnMes.getCellEditor();

		MesTableCell mesTableCellFk=(MesTableCell)tableCellEditorMes;

		if(mesTableCellFk!=null) {
			mesTableCellFk.setmessForeignKey(messForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosIngresosPromedios.getSelectedRow();

		//if(intSelectedRow<=0) {
			//mesTableCellFk.setRowActual(intSelectedRow);
			//mesTableCellFk.setmessForeignKeyActual(messForeignKey);
		//}


		if(mesTableCellFk!=null) {
			mesTableCellFk.RecargarMessForeignKey();
			//ACTUALIZA COMBOS DE TABLA-FIN
		}

	}	
	
	
	
	public void jButtonActualizarIngresosPromediosActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.ingresospromediosLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingParametrosReportesIngresosPromedios(false);
			
			//if(!this.isEsNuevoIngresosPromedios) {								
				int intSelectedRow = this.jTableDatosIngresosPromedios.getSelectedRow();	
				
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.ingresospromedios =(IngresosPromedios) this.ingresospromediosLogic.getIngresosPromedioss().toArray()[this.jTableDatosIngresosPromedios.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.ingresospromedios =(IngresosPromedios) this.ingresospromedioss.toArray()[this.jTableDatosIngresosPromedios.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
			//}
				
			if(IngresosPromediosJInternalFrame.ISBINDING_MANUAL_TABLA) {
				this.setVariablesFormularioToObjetoActualIngresosPromedios(this.ingresospromedios,true);
				this.setVariablesFormularioToObjetoActualForeignKeysIngresosPromedios(this.ingresospromedios);
				
			}
			
			if(this.permiteMantenimiento(this.ingresospromedios)) {	
				this.actualizar();
				
				if(!this.isGuardarCambiosEnLote && !this.ingresospromediosSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
					
					this.isEsNuevoIngresosPromedios=true;
					this.inicializarActualizarBindingTablaIngresosPromedios(false);
					this.isEsNuevoIngresosPromedios=false;
				
				} else {					
					
					//PARA RELACIONADO ACTUALIZAR FILA TOTALES
					this.isEsNuevoIngresosPromedios=true;
					this.procesoActualizarFilaTotales(false,"MANTENIMIENTO");
					this.isEsNuevoIngresosPromedios=false;
				}
						
								
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesIngresosPromedios(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualIngresosPromedios(false);
				
				this.habilitarDeshabilitarControlesIngresosPromedios(false);
			
												
				
				if(IngresosPromediosJInternalFrame.CON_DATOS_FRAME) {
					if(!this.isPostAccionSinCerrar) {
						this.cerrarFrameDetalleIngresosPromedios();
					}
				}
				
				if(this.isPostAccionNuevo) {
					this.jButtonNuevoIngresosPromediosActionPerformed(evt,ingresospromediosSessionBean.getConGuardarRelaciones());
				} else {
					if(this.isPostAccionSinCerrar) {
						Integer intSelectedRowActual=this.getIndiceActualIngresosPromedios(this.ingresospromedios,intSelectedRow);
						
						if(intSelectedRow>-1) {
							this.jTableDatosIngresosPromedios.setRowSelectionInterval(intSelectedRowActual, intSelectedRowActual);
							this.jButtonIdActionPerformed(evt,intSelectedRowActual,ingresospromediosSessionBean.getConGuardarRelaciones(),false);
						}
					}
				}
				
				this.cancelar(false);
				
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.ingresospromediosLogic.commitNewConnexionToDeep();
			}
			
			
			if(this.jInternalFrameParent!=null) { //&& this.isEsMantenimientoRelacionado) {
				Boolean esUsoDesdeHijoLocal=true;
				String sTipo="Formulario";
				Boolean conIrServidorAplicacionParent=false;
				Long id=this.ingresospromedios.getId();
				ArrayList<String> arrClasses=new ArrayList<String>();
				
				GeneralEntityParameterGeneral generalEntityParameterGeneral=new GeneralEntityParameterGeneral();
				
				generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
				generalEntityParameterGeneral.setsDominio("Formulario");
				generalEntityParameterGeneral.setsDominioTipo(IngresosPromedios.class.getName());
				
				this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",IngresosPromedios.class.getName(),sTipo,"FORMULARIO",esControlTabla,conIrServidorAplicacionParent,
					id,this, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.FORM,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
					evt,generalEntityParameterGeneral,this);
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.ingresospromediosLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,IngresosPromediosConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.ingresospromediosLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonEliminarIngresosPromediosActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.ingresospromediosLogic.getNewConnexionToDeep("");
			}
			
			int intSelectedRow = this.jTableDatosIngresosPromedios.getSelectedRow();	       
							
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.ingresospromedios =(IngresosPromedios) this.ingresospromediosLogic.getIngresosPromedioss().toArray()[this.jTableDatosIngresosPromedios.convertRowIndexToModel(intSelectedRow)];
				this.ingresospromedios.setIsDeleted(true);
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.ingresospromedios =(IngresosPromedios) this.ingresospromedioss.toArray()[this.jTableDatosIngresosPromedios.convertRowIndexToModel(intSelectedRow)];
				this.ingresospromedios.setIsDeleted(true);
			}
			//ARCHITECTURE
			
			if(this.permiteMantenimiento(this.ingresospromedios)) {
				this.eliminar();
				
				if(!this.isGuardarCambiosEnLote && !this.ingresospromediosSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
				}
				
				((IngresosPromediosModel) this.jTableDatosIngresosPromedios.getModel()).fireTableRowsDeleted(intSelectedRow,intSelectedRow);
				
				this.isEsNuevoIngresosPromedios=true;
				this.inicializarActualizarBindingTablaIngresosPromedios(false);
				this.isEsNuevoIngresosPromedios=false;									
					
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesIngresosPromedios(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualIngresosPromedios(false);
				
				this.habilitarDeshabilitarControlesIngresosPromedios(false);
				
				
				
				if(IngresosPromediosJInternalFrame.CON_DATOS_FRAME) {
					this.cerrarFrameDetalleIngresosPromedios();
				}
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.ingresospromediosLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.ingresospromediosLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,IngresosPromediosConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.ingresospromediosLogic.closeNewConnexionToDeep();
			}
		}		
	}
		
	public void jButtonCancelarIngresosPromediosActionPerformed(ActionEvent evt) throws Exception {                                         	   	       
	  	try {
			if(jTableDatosIngresosPromedios.getRowCount()>=1) {
				jTableDatosIngresosPromedios.removeRowSelectionInterval(0, jTableDatosIngresosPromedios.getRowCount()-1);						
			}
						
			this.invalidValues=new InvalidValue[0];
			this.habilitarDeshabilitarControlesIngresosPromedios(false);
			this.cancelar(true);			
			this.inicializarActualizarBindingTablaIngresosPromedios(false);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesIngresosPromedios(false) ;
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualIngresosPromedios(false) ;
			
			this.isEsNuevoIngresosPromedios=false;
			
			if(IngresosPromediosJInternalFrame.CON_DATOS_FRAME) {
				this.cerrarFrameDetalleIngresosPromedios();
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,IngresosPromediosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonGuardarCambiosIngresosPromediosActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.ingresospromediosLogic.getNewConnexionToDeep("");
			}
			
			//this.estaModoGuardarCambios=true;
			
	    	this.guardarCambios();
			
			if(!this.isErrorGuardar) {
				this.procesarBusqueda(this.sAccionBusqueda);
				
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingIngresosPromedios(false);
				
				//SI ES MANUAL
				if(IngresosPromediosJInternalFrame.ISBINDING_MANUAL) {				
					//this.inicializarActualizarBindingManualIngresosPromedios();				
				}
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.ingresospromediosLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.ingresospromediosLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,IngresosPromediosConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.ingresospromediosLogic.closeNewConnexionToDeep();
			}
			
			//this.estaModoGuardarCambios=false;
		}
	}
	
	public void jButtonNuevoGuardarCambiosIngresosPromediosActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			this.estaModoNuevo=true;
			this.estaModoNuevoGuardarCambios=true;
			
			//LO HACE NUEVOPREPARAR
			//this.iIdNuevoIngresosPromedios--;			
			//IngresosPromedios ingresospromediosAux= new IngresosPromedios();			
			//ingresospromediosAux.setId(this.iIdNuevoIngresosPromedios);
			
			if(this.jInternalFrameDetalleFormIngresosPromedios==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.aumentarTamanioFilaNuevaTablaIngresosPromedios();
			
			if(this.conTotales) {
				this.quitarFilaTotales();
			}
			
			this.nuevoPreparar(true);
			
			this.setVariablesFormularioToObjetoActualForeignKeysIngresosPromedios(this.ingresospromedios);
			
			this.ingresospromedios.setsType("NUEVO_GUARDAR_CAMBIOS");
			
			//LO HACE NUEVOPREPARAR
			/*
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				this.ingresospromediosLogic.getIngresosPromedioss().add(this.ingresospromediosAux);
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				this.ingresospromedioss.add(this.ingresospromediosAux);				
			}
			*/
			
			this.inicializarActualizarBindingTablaIngresosPromedios(false);
			
			this.jTableDatosIngresosPromedios.setRowSelectionInterval(this.getIndiceNuevoIngresosPromedios(), this.getIndiceNuevoIngresosPromedios());
			
			int iLastRow =  this.jTableDatosIngresosPromedios.getRowCount () - 1;
			Rectangle rectangle = this.jTableDatosIngresosPromedios.getCellRect(iLastRow, 0, true);
			
			this.jTableDatosIngresosPromedios.scrollRectToVisible(rectangle);
			
			//FILA TOTALES
			if(this.conTotales) {
				this.crearFilaTotales();
				
				this.inicializarActualizarBindingTablaIngresosPromedios(false);
			}

		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,IngresosPromediosConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;
			this.estaModoNuevoGuardarCambios=false;
		}
	}		
	
	public void jButtonRecargarInformacionIngresosPromediosActionPerformed(ActionEvent evt) throws Exception {    		
		try {
			this.iNumeroPaginacionPagina=0;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.ingresospromediosLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingIngresosPromedios(false,false);
			
	    	this.recargarInformacion();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingIngresosPromedios(false);
			
			//SI ES MANUAL
			if(IngresosPromediosJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualIngresosPromedios();
			}
			
			//this.abrirFrameTreeIngresosPromedios();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.ingresospromediosLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.ingresospromediosLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,IngresosPromediosConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.ingresospromediosLogic.closeNewConnexionToDeep();
			}
		}	
	}
	
	
	public void jButtonGenerarImportacionIngresosPromediosActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedReader bufferedReader = null;
		String sXmlStringFile="";
		String sPath="";
		this.arrDatoGeneralMinimos= new  ArrayList<DatoGeneralMinimo>();
		DatoGeneralMinimo datoGeneralMinimo=new DatoGeneralMinimo();
		String sLine="";
		
		try {			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,IngresosPromediosConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedReader != null) {
				bufferedReader.close();
			}	
		}				
	}
	
	
	
	public void jButtonAbrirImportacionIngresosPromediosActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {
			int iReturnArchivo = this.jInternalFrameImportacionIngresosPromedios.getjFileChooserImportacion().showOpenDialog(this);
 
            if (iReturnArchivo == JFileChooser.APPROVE_OPTION) {
            	this.jInternalFrameImportacionIngresosPromedios.setFileImportacion(this.jInternalFrameImportacionIngresosPromedios.getjFileChooserImportacion().getSelectedFile());
            	
				this.jInternalFrameImportacionIngresosPromedios.getjTextFieldPathArchivoImportacion().setText(this.jInternalFrameImportacionIngresosPromedios.getFileImportacion().getName());
				
				//System.out.println("ARCHIVO ESCOGIDO: "+this.fileImportacionIngresosPromedios.getName());
				
            } else {
                //System.out.println("CANCELAR SELECCION");
				this.jInternalFrameImportacionIngresosPromedios.getjTextFieldPathArchivoImportacion().setText("SELECCION CANCELADA");
            }			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,IngresosPromediosConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedWriter != null) {
				bufferedWriter.close();
			}	
		}		
	}
	
	
	public void jButtonGenerarReporteDinamicoIngresosPromediosActionPerformed(ActionEvent evt) throws Exception {    		
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {	
		
		ArrayList<IngresosPromedios> ingresospromediossSeleccionados=new ArrayList<IngresosPromedios>();		

		ingresospromediossSeleccionados=this.getIngresosPromediossSeleccionados(true);
		
		
		this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoIngresosPromedios.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();
		
		this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoIngresosPromedios.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
		
		
		this.sTipoArchivoReporte=this.sTipoArchivoReporteDinamico;
		
		//this.sTipoReporteExtra="Base";
		
			InputStream reportFile=null;
			InputStream imageFile=null;
			
			imageFile=AuxiliarImagenes.class.getResourceAsStream("LogoReporte.jpg");			
				
		
		
			reportFile = AuxiliarReportes.class.getResourceAsStream("IngresosPromediosBaseDesign.jrxml");	
			
			sPath=this.parametroGeneralUsuario.getpath_exportar()+"IngresosPromediosBaseDesign.jrxml";
			
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
			
			this.generarReporteIngresosPromedioss("Todos",ingresospromediossSeleccionados );

			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.ingresospromediosSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				//DEBE APARECER EL REPORTE DIRECTAMENTE
				//JOptionPane.showMessageDialog(this,"GENERADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Ingresos Promedios",JOptionPane.INFORMATION_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,IngresosPromediosConstantesFunciones.CLASSNAME);
		
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
		
		for(int index:this.jInternalFrameReporteDinamicoIngresosPromedios.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoIngresosPromedios.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case IngresosPromediosConstantesFunciones.LABEL_CODIGOCARGO:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_digoCargo_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_digoCargo_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_digoCargo_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_digoCargo_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case IngresosPromediosConstantesFunciones.LABEL_CODIGODATO:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_digoDato_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_digoDato_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_digoDato_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_digoDato_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case IngresosPromediosConstantesFunciones.LABEL_NOMBRE:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_mbre_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_mbre_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_mbre_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_mbre_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case IngresosPromediosConstantesFunciones.LABEL_VALORPAGO:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_lorPago_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_lorPago_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_lorPago_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_lorPago_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case IngresosPromediosConstantesFunciones.LABEL_NOMBRERUBROEMPLEA:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_mbreRubroEmplea_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_mbreRubroEmplea_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_mbreRubroEmplea_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_mbreRubroEmplea_colx", iAnchoSum.toString());

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
		
		if(this.jInternalFrameReporteDinamicoIngresosPromedios.getjCheckBoxConGraficoDinamico().isSelected()) {
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
		reporte=((Reporte)this.jInternalFrameReporteDinamicoIngresosPromedios.getjComboBoxColumnaCategoriaGrafico().getSelectedItem());
				
		//TIPO GRAFICO REPORTE
		reporteTipoGraficoReporte=((Reporte)this.jInternalFrameReporteDinamicoIngresosPromedios.getjComboBoxTiposGraficosReportesDinamico().getSelectedItem());
		
		String sTipoGraficoReporte=reporteTipoGraficoReporte.getsCodigo();
		
		switch(reporte.getsCodigo()) {
			
				case IngresosPromediosConstantesFunciones.LABEL_CODIGOCARGO:
					sNombreCampoCategoria="codigo_cargo";
					break;

				case IngresosPromediosConstantesFunciones.LABEL_CODIGODATO:
					sNombreCampoCategoria="codigo_dato";
					break;

				case IngresosPromediosConstantesFunciones.LABEL_NOMBRE:
					sNombreCampoCategoria="nombre";
					break;

				case IngresosPromediosConstantesFunciones.LABEL_VALORPAGO:
					sNombreCampoCategoria="valor_pago";
					break;

				case IngresosPromediosConstantesFunciones.LABEL_NOMBRERUBROEMPLEA:
					sNombreCampoCategoria="nombre_rubro_emplea";
					break;
					
			default :
				break;
		}		
		//CATEGORIA GRAFICO
		
		//CATEGORIA VALOR				
		reporteCategoriaValor=((Reporte)this.jInternalFrameReporteDinamicoIngresosPromedios.getjComboBoxColumnaCategoriaValor().getSelectedItem());
		
		switch(reporteCategoriaValor.getsCodigo()) {
			
				case IngresosPromediosConstantesFunciones.LABEL_CODIGOCARGO:
					sNombreCampoCategoriaValor="codigo_cargo";
					break;

				case IngresosPromediosConstantesFunciones.LABEL_CODIGODATO:
					sNombreCampoCategoriaValor="codigo_dato";
					break;

				case IngresosPromediosConstantesFunciones.LABEL_NOMBRE:
					sNombreCampoCategoriaValor="nombre";
					break;

				case IngresosPromediosConstantesFunciones.LABEL_VALORPAGO:
					sNombreCampoCategoriaValor="valor_pago";
					break;

				case IngresosPromediosConstantesFunciones.LABEL_NOMBRERUBROEMPLEA:
					sNombreCampoCategoriaValor="nombre_rubro_emplea";
					break;
					
			default :
				break;
		}	
		//CATEGORIA VALOR
		
		//VALORES GRAFICO
		for(int index:this.jInternalFrameReporteDinamicoIngresosPromedios.getjListColumnasValoresGrafico().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoIngresosPromedios.getjListColumnasValoresGrafico().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case IngresosPromediosConstantesFunciones.LABEL_CODIGOCARGO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Codigo Cargo",sNombreCampoCategoria,sNombreCampoCategoriaValor,"codigo_cargo");
					break;

				case IngresosPromediosConstantesFunciones.LABEL_CODIGODATO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Codigo Dato",sNombreCampoCategoria,sNombreCampoCategoriaValor,"codigo_dato");
					break;

				case IngresosPromediosConstantesFunciones.LABEL_NOMBRE:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Nombre",sNombreCampoCategoria,sNombreCampoCategoriaValor,"nombre");
					break;

				case IngresosPromediosConstantesFunciones.LABEL_VALORPAGO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Valor Pago",sNombreCampoCategoria,sNombreCampoCategoriaValor,"valor_pago");
					break;

				case IngresosPromediosConstantesFunciones.LABEL_NOMBRERUBROEMPLEA:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Nombre Rubro Emplea",sNombreCampoCategoria,sNombreCampoCategoriaValor,"nombre_rubro_emplea");
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
	
	public void jButtonGenerarExcelReporteDinamicoIngresosPromediosActionPerformed(ActionEvent evt) throws Exception {		
		ArrayList<IngresosPromedios> ingresospromediossSeleccionados=new ArrayList<IngresosPromedios>();		
		
		ingresospromediossSeleccionados=this.getIngresosPromediossSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"ingresospromedios";//.xls";
		
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
		
			Sheet sheet = workbook.createSheet("IngresosPromedioss");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			Row row = sheet.createRow(iRow);
			Cell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");
			
			for(int index:this.jInternalFrameReporteDinamicoIngresosPromedios.getjListColumnasSelectReporte().getSelectedIndices()) {
				reporte=(Reporte)this.jInternalFrameReporteDinamicoIngresosPromedios.getjListColumnasSelectReporte().getModel().getElementAt(index);
				
				switch(reporte.getsCodigo()) {
					
				case IngresosPromediosConstantesFunciones.LABEL_IDESTRUCTURA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(IngresosPromediosConstantesFunciones.LABEL_IDESTRUCTURA);
					iRow++;

					for(IngresosPromedios ingresospromedios:ingresospromediossSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(ingresospromedios.getestructura_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case IngresosPromediosConstantesFunciones.LABEL_CODIGO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(IngresosPromediosConstantesFunciones.LABEL_CODIGO);
					iRow++;

					for(IngresosPromedios ingresospromedios:ingresospromediossSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(ingresospromedios.getcodigo());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case IngresosPromediosConstantesFunciones.LABEL_IDEMPRESA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(IngresosPromediosConstantesFunciones.LABEL_IDEMPRESA);
					iRow++;

					for(IngresosPromedios ingresospromedios:ingresospromediossSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(ingresospromedios.getempresa_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case IngresosPromediosConstantesFunciones.LABEL_IDANIO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(IngresosPromediosConstantesFunciones.LABEL_IDANIO);
					iRow++;

					for(IngresosPromedios ingresospromedios:ingresospromediossSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(ingresospromedios.getanio_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case IngresosPromediosConstantesFunciones.LABEL_IDMES:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(IngresosPromediosConstantesFunciones.LABEL_IDMES);
					iRow++;

					for(IngresosPromedios ingresospromedios:ingresospromediossSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(ingresospromedios.getmes_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case IngresosPromediosConstantesFunciones.LABEL_CODIGOCARGO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(IngresosPromediosConstantesFunciones.LABEL_CODIGOCARGO);
					iRow++;

					for(IngresosPromedios ingresospromedios:ingresospromediossSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(ingresospromedios.getcodigo_cargo());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case IngresosPromediosConstantesFunciones.LABEL_CODIGODATO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(IngresosPromediosConstantesFunciones.LABEL_CODIGODATO);
					iRow++;

					for(IngresosPromedios ingresospromedios:ingresospromediossSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(ingresospromedios.getcodigo_dato());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case IngresosPromediosConstantesFunciones.LABEL_NOMBRE:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(IngresosPromediosConstantesFunciones.LABEL_NOMBRE);
					iRow++;

					for(IngresosPromedios ingresospromedios:ingresospromediossSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(ingresospromedios.getnombre());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case IngresosPromediosConstantesFunciones.LABEL_VALORPAGO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(IngresosPromediosConstantesFunciones.LABEL_VALORPAGO);
					iRow++;

					for(IngresosPromedios ingresospromedios:ingresospromediossSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(ingresospromedios.getvalor_pago());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case IngresosPromediosConstantesFunciones.LABEL_NOMBRERUBROEMPLEA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(IngresosPromediosConstantesFunciones.LABEL_NOMBRERUBROEMPLEA);
					iRow++;

					for(IngresosPromedios ingresospromedios:ingresospromediossSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(ingresospromedios.getnombre_rubro_emplea());
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
			//	this.getFilaCabeceraExportarExcelIngresosPromedios(row);				
			//	iRow++;
			//}				
			
			//for(IngresosPromedios ingresospromediosAux:ingresospromediossSeleccionados) {
			//	row = sheet.createRow(iRow);
				
			//	this.getFilaDatosExportarExcelIngresosPromedios(ingresospromediosAux,row);
				
			//	iRow++;
			//}
			
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.ingresospromediosSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Ingresos Promedios",JOptionPane.INFORMATION_MESSAGE);
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
				this.ingresospromediosLogic.getNewConnexionToDeep("");
			}
			
			this.idActual=idActual;
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda("PorId");
				    	
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingIngresosPromedios(false);
			
			//SI ES MANUAL
			if(IngresosPromediosJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualIngresosPromedios();
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.ingresospromediosLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.ingresospromediosLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger);
			
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.ingresospromediosLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonAnterioresIngresosPromediosActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion-=this.iNumeroPaginacion;
			/*
			if(this.iNumeroPaginacion<0) {
				this.iNumeroPaginacion=0;
			}
			*/
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.ingresospromediosLogic.getNewConnexionToDeep("");
			}
			
			this.anteriores();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingIngresosPromedios(false);
			
			//SI ES MANUAL
			if(IngresosPromediosJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualIngresosPromedios();
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.ingresospromediosLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.ingresospromediosLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,IngresosPromediosConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.ingresospromediosLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonSiguientesIngresosPromediosActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion+=this.iNumeroPaginacion;
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.ingresospromediosLogic.getNewConnexionToDeep("");
			}
			
			this.siguientes();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingIngresosPromedios(false);
			
			//SI ES MANUAL
			if(IngresosPromediosJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualIngresosPromedios();
			}		
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.ingresospromediosLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.ingresospromediosLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,IngresosPromediosConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.ingresospromediosLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void aumentarTamanioFilaNuevaTablaIngresosPromedios() throws Exception {		
		Dimension dimensionMinimum=this.jTableDatosIngresosPromedios.getMinimumSize();
		Dimension dimensionMaximum=this.jTableDatosIngresosPromedios.getMaximumSize();
		Dimension dimensionPreferred=this.jTableDatosIngresosPromedios.getPreferredSize();
	
		double iHeightConFilaNueva=dimensionPreferred.getHeight();
		
		iHeightConFilaNueva+=this.jTableDatosIngresosPromedios.getRowHeight();
		
		dimensionMinimum.setSize(dimensionMinimum.getWidth(),iHeightConFilaNueva);
		dimensionMaximum.setSize(dimensionMaximum.getWidth(),iHeightConFilaNueva);
		dimensionPreferred.setSize(dimensionPreferred.getWidth(),iHeightConFilaNueva);
		
		this.jTableDatosIngresosPromedios.setMinimumSize(dimensionMinimum);
		this.jTableDatosIngresosPromedios.setMaximumSize(dimensionMaximum);
		this.jTableDatosIngresosPromedios.setPreferredSize(dimensionPreferred);	
	}
	
	public void inicializarActualizarBindingIngresosPromedios(Boolean esInicializar) throws Exception {
		this.inicializarActualizarBindingIngresosPromedios(esInicializar,true);
	}
	
	public void inicializarActualizarBindingIngresosPromedios(Boolean esInicializar,Boolean conTabla) throws Exception {		
		if(conTabla) {
			this.inicializarActualizarBindingTablaIngresosPromedios(esInicializar);
		}
		
		this.inicializarActualizarBindingBotonesIngresosPromedios(esInicializar);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.ingresospromediosSessionBean.getEsGuardarRelacionado()) {
			try{this.inicializarActualizarBindingBusquedasIngresosPromedios(esInicializar);}catch(Exception e){e.printStackTrace();}
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesIngresosPromedios(esInicializar) ;
			
			this.inicializarActualizarBindingParametrosReportesIngresosPromedios(esInicializar) ;
		}
		
		if(esInicializar) {
			if( !IngresosPromediosJInternalFrame.ISBINDING_MANUAL_TABLA ||
			   	!IngresosPromediosJInternalFrame.ISBINDING_MANUAL) {
			   	
			}
		}
	}
	
	public void inicializarActualizarBindingManualIngresosPromedios() throws Exception {		
		//NO SE NECESITA HACER BINDING OTRA VEZ
		//this.inicializarActualizarBindingTablaIngresosPromedios();
		
		this.inicializarActualizarBindingBotonesManualIngresosPromedios(true);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.ingresospromediosSessionBean.getEsGuardarRelacionado()) {
			
			this.inicializarActualizarBindingBusquedasManualIngresosPromedios();			
			
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesIngresosPromedios() ;
			
			this.inicializarActualizarBindingParametrosReportesPostAccionesManualIngresosPromedios(false) ;			
			
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesPostAccionesManualIngresosPromedios(Boolean esSetControles) throws Exception {
		try	{					
			if(!esSetControles) {
				this.isSeleccionarTodos=this.jCheckBoxSeleccionarTodosIngresosPromedios.isSelected();
				this.isSeleccionados=this.jCheckBoxSeleccionadosIngresosPromedios.isSelected();
				
				
				this.conGraficoReporte=this.jCheckBoxConGraficoReporteIngresosPromedios.isSelected();															
				
				
				if(this.jInternalFrameDetalleFormIngresosPromedios!=null) {
				this.isPostAccionNuevo=this.jInternalFrameDetalleFormIngresosPromedios.jCheckBoxPostAccionNuevoIngresosPromedios.isSelected();
				this.isPostAccionSinCerrar=this.jInternalFrameDetalleFormIngresosPromedios.jCheckBoxPostAccionSinCerrarIngresosPromedios.isSelected();
				this.isPostAccionSinMensaje=this.jInternalFrameDetalleFormIngresosPromedios.jCheckBoxPostAccionSinMensajeIngresosPromedios.isSelected();
				}
			
			} else {
				this.jCheckBoxSeleccionarTodosIngresosPromedios.setSelected(this.isSeleccionarTodos);
				this.jCheckBoxSeleccionadosIngresosPromedios.setSelected(this.isSeleccionados);
				
				
				this.jCheckBoxConGraficoReporteIngresosPromedios.setSelected(this.conGraficoReporte);				
				
				
				if(this.jInternalFrameDetalleFormIngresosPromedios!=null) {
				this.jInternalFrameDetalleFormIngresosPromedios.jCheckBoxPostAccionNuevoIngresosPromedios.setSelected(this.isPostAccionNuevo);
				this.jInternalFrameDetalleFormIngresosPromedios.jCheckBoxPostAccionSinCerrarIngresosPromedios.setSelected(this.isPostAccionSinCerrar);
				this.jInternalFrameDetalleFormIngresosPromedios.jCheckBoxPostAccionSinMensajeIngresosPromedios.setSelected(this.isPostAccionSinMensaje);
				}
			}
			
			
			if(this.jComboBoxTiposPaginacionIngresosPromedios.getSelectedItem()!=null) {
				this.sTipoPaginacion=((Reporte)this.jComboBoxTiposPaginacionIngresosPromedios.getSelectedItem()).getsCodigo();			
			}
			
			
			
			if(this.jInternalFrameDetalleFormIngresosPromedios!=null) {
			this.sTipoAccionFormulario=((Reporte)this.jInternalFrameDetalleFormIngresosPromedios.jComboBoxTiposAccionesFormularioIngresosPromedios.getSelectedItem()).getsCodigo();
			}
			
			
			
			if(!this.conCargarMinimo) {
				this.sTipoArchivoReporte=((Reporte)this.jComboBoxTiposArchivosReportesIngresosPromedios.getSelectedItem()).getsCodigo();			
				
				if(this.jInternalFrameReporteDinamicoIngresosPromedios!=null) {
					this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoIngresosPromedios.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
				}
				
				this.sTipoRelacion=((Reporte)this.jComboBoxTiposRelacionesIngresosPromedios.getSelectedItem()).getsCodigo();
									
				this.sTipoAccion=((Reporte)this.jComboBoxTiposAccionesIngresosPromedios.getSelectedItem()).getsCodigo();
													
				this.sTipoSeleccionar=((Reporte)this.jComboBoxTiposSeleccionarIngresosPromedios.getSelectedItem()).getsCodigo();
									
				this.sTipoReporte=((Reporte)this.jComboBoxTiposReportesIngresosPromedios.getSelectedItem()).getsCodigo();							
					
				if(this.jInternalFrameReporteDinamicoIngresosPromedios!=null) {
					this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoIngresosPromedios.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();							
				}
				
				this.sTipoGraficoReporte=((Reporte)this.jComboBoxTiposGraficosReportesIngresosPromedios.getSelectedItem()).getsCodigo();											
			}			
			
			this.sValorCampoGeneral=this.jTextFieldValorCampoGeneralIngresosPromedios.getText();						
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesIngresosPromedios(Boolean esInicializar) throws Exception {
		try	{	
			if(IngresosPromediosJInternalFrame.ISBINDING_MANUAL) {
				this. inicializarActualizarBindingParametrosReportesPostAccionesManualIngresosPromedios(false);
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public void inicializarActualizarBindingtiposArchivosReportesAccionesIngresosPromedios() throws Exception {
		try	{
			if(IngresosPromediosJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingtiposArchivosReportesAccionesManualIngresosPromedios();
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleIngresosPromedios() throws Exception {
		//TIPOS ACCIONES FORMULARIO	
		this.jInternalFrameDetalleFormIngresosPromedios.jComboBoxTiposAccionesFormularioIngresosPromedios.removeAllItems();
				
		for(Reporte reporte:this.tiposAccionesFormulario) {
			this.jInternalFrameDetalleFormIngresosPromedios.jComboBoxTiposAccionesFormularioIngresosPromedios.addItem(reporte);
		}
		
		//TIPOS ACCIONES FORMULARIO
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualIngresosPromedios() throws Exception {
		try	{
			
			//TIPOS ARCHIVOS REPORTES
			this.jComboBoxTiposArchivosReportesIngresosPromedios.removeAllItems();
				
			for(Reporte reporte:this.tiposArchivosReportes) {
				this.jComboBoxTiposArchivosReportesIngresosPromedios.addItem(reporte);
			}
			
			
				
			//TIPOS REPORTES
			this.jComboBoxTiposReportesIngresosPromedios.removeAllItems();
				
			for(Reporte reporte:this.tiposReportes) {
				this.jComboBoxTiposReportesIngresosPromedios.addItem(reporte);
			}
			
			
			//TIPOS GRAFICOS REPORTES
			this.jComboBoxTiposGraficosReportesIngresosPromedios.removeAllItems();
				
			for(Reporte reporte:this.tiposGraficosReportes) {
				this.jComboBoxTiposGraficosReportesIngresosPromedios.addItem(reporte);
			}
			
			
			//TIPOS PAGINACION
			this.jComboBoxTiposPaginacionIngresosPromedios.removeAllItems();
				
			for(Reporte reporte:this.tiposPaginacion) {
				this.jComboBoxTiposPaginacionIngresosPromedios.addItem(reporte);
			}
			
			
			if(!this.ingresospromediosSessionBean.getEsGuardarRelacionado()) {
				this.jComboBoxTiposPaginacionIngresosPromedios.setSelectedItem(Funciones2.getTipoPaginacionDefecto("NORMAL",this.tiposPaginacion));
			} else {
				this.jComboBoxTiposPaginacionIngresosPromedios.setSelectedItem(Funciones2.getTipoPaginacionDefecto("RELACIONADO",this.tiposPaginacion));
			}
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposRelacionesIngresosPromedios.removeAllItems();
				
			for(Reporte reporte:this.tiposRelaciones) {
				this.jComboBoxTiposRelacionesIngresosPromedios.addItem(reporte);
			}
			
			//TIPOS ACCIONES
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposAccionesIngresosPromedios.removeAllItems();
				
			for(Reporte reporte:this.tiposAcciones) {
				this.jComboBoxTiposAccionesIngresosPromedios.addItem(reporte);
			}
			
			//TIPOS ACCIONES			
			
			
			
			//TIPOS ACCIONES FORMULARIO	
			if(this.jInternalFrameDetalleFormIngresosPromedios!=null) { //if(this.conCargarFormDetalle) {
				this.jInternalFrameDetalleFormIngresosPromedios.jComboBoxTiposAccionesFormularioIngresosPromedios.removeAllItems();
				
				for(Reporte reporte:this.tiposAccionesFormulario) {
					this.jInternalFrameDetalleFormIngresosPromedios.jComboBoxTiposAccionesFormularioIngresosPromedios.addItem(reporte);
				}
				
			}
			//TIPOS ACCIONES FORMULARIO
			
			
			
			//TIPOS SELECCIONAR
			this.jComboBoxTiposSeleccionarIngresosPromedios.removeAllItems();
				
			for(Reporte reporte:this.tiposSeleccionar) {
				this.jComboBoxTiposSeleccionarIngresosPromedios.addItem(reporte);
			}
			
			
			if(this.tiposSeleccionar!=null && this.tiposSeleccionar.size()>1) {
				this.jComboBoxTiposSeleccionarIngresosPromedios.setSelectedIndex(1);
			}
				
			//REPORTE DINAMICO
			this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualIngresosPromedios();
							
			//TIPOS COLUMNAS SELECT
			//TIPOS SELECCIONAR
			
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualIngresosPromedios() throws Exception {
		try	{
			DefaultListModel<Reporte> defaultListModel=new DefaultListModel<Reporte>();
			
			
			//TIPOS ARCHIVOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoIngresosPromedios!=null) {
				this.jInternalFrameReporteDinamicoIngresosPromedios.getjComboBoxTiposArchivosReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposArchivosReportesDinamico) {
					this.jInternalFrameReporteDinamicoIngresosPromedios.getjComboBoxTiposArchivosReportesDinamico().addItem(reporte);
				}
				
			}
			
			//TIPOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoIngresosPromedios!=null) {
				this.jInternalFrameReporteDinamicoIngresosPromedios.getjComboBoxTiposReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposReportesDinamico) {
					this.jInternalFrameReporteDinamicoIngresosPromedios.getjComboBoxTiposReportesDinamico().addItem(reporte);
				}
				
			}
			
			defaultListModel=new DefaultListModel<Reporte>();
			
			if(this.jInternalFrameReporteDinamicoIngresosPromedios!=null) {
				
				if(this.jInternalFrameReporteDinamicoIngresosPromedios.getjListColumnasSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoIngresosPromedios.getjListColumnasSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposColumnasSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoIngresosPromedios.getjListColumnasSelectReporte().setModel(defaultListModel);									
						
				}	
					
				//TIPOS RELACIONES SELECT
				//TIPOS SELECCIONAR
				defaultListModel=new DefaultListModel<Reporte>();
				if(this.jInternalFrameReporteDinamicoIngresosPromedios.getjListRelacionesSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoIngresosPromedios.getjListRelacionesSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposRelacionesSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoIngresosPromedios.getjListRelacionesSelectReporte().setModel(defaultListModel);									
						
				}	
				
				
				//TIPOS COLUMNAS CATEGORIA DINAMICO
				if(this.jInternalFrameReporteDinamicoIngresosPromedios.getjComboBoxColumnaCategoriaGrafico()!=null) {
					this.jInternalFrameReporteDinamicoIngresosPromedios.getjComboBoxColumnaCategoriaGrafico().removeAllItems();
						
					ArrayList<Reporte> tiposColumnasCategoria=IngresosPromediosConstantesFunciones.getTiposSeleccionarIngresosPromedios(true,true,false,true,true);
						
					for(Reporte reporte:tiposColumnasCategoria) {//this.tiposSeleccionar
						this.jInternalFrameReporteDinamicoIngresosPromedios.getjComboBoxColumnaCategoriaGrafico().addItem(reporte);
					}
					
				}
					
				//TIPOS COLUMNAS CATEGORIA VALOR DINAMICO
				if(this.jInternalFrameReporteDinamicoIngresosPromedios.getjComboBoxColumnaCategoriaValor()!=null) {
					this.jInternalFrameReporteDinamicoIngresosPromedios.getjComboBoxColumnaCategoriaValor().removeAllItems();
						
					ArrayList<Reporte> tiposColumnasCategoriaValor=IngresosPromediosConstantesFunciones.getTiposSeleccionarIngresosPromedios(false,false,true,false,false);
						
					for(Reporte reporte:tiposColumnasCategoriaValor) {//this.tiposSeleccionar
						this.jInternalFrameReporteDinamicoIngresosPromedios.getjComboBoxColumnaCategoriaValor().addItem(reporte);
					}
					
				}
					
				//TIPOS COLUMNAS VALOR
				defaultListModel=new DefaultListModel<Reporte>();
					
				if(this.jInternalFrameReporteDinamicoIngresosPromedios.getjListColumnasValoresGrafico()!=null) {
					this.jInternalFrameReporteDinamicoIngresosPromedios.getjListColumnasValoresGrafico().removeAll();
						
					ArrayList<Reporte> tiposColumnasValor=IngresosPromediosConstantesFunciones.getTiposSeleccionarIngresosPromedios(false,false,true,false,false);
						
					for(Reporte reporte:tiposColumnasValor) {//this.tiposSeleccionar
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoIngresosPromedios.getjListColumnasValoresGrafico().setModel(defaultListModel);									
						
				}
					
				//TIPOS GRAFICOS REPORTES DINAMICOS
				if(this.jInternalFrameReporteDinamicoIngresosPromedios.getjComboBoxTiposGraficosReportesDinamico()!=null) {
					this.jInternalFrameReporteDinamicoIngresosPromedios.getjComboBoxTiposGraficosReportesDinamico().removeAllItems();
						
					for(Reporte reporte:this.tiposGraficosReportes) {
						this.jInternalFrameReporteDinamicoIngresosPromedios.getjComboBoxTiposGraficosReportesDinamico().addItem(reporte);
					}
					
				}
			
			
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	
	
	public void inicializarActualizarBindingBusquedasManualIngresosPromedios()  throws Exception {				
		//BYDAN_BUSQUEDAS		
		
		if(this.jComboBoxid_estructuraBusquedaIngresosPromediosIngresosPromedios.getSelectedItem()!=null){this.id_estructuraBusquedaIngresosPromedios=((Estructura)this.jComboBoxid_estructuraBusquedaIngresosPromediosIngresosPromedios.getSelectedItem()).getId();}
		this.codigoBusquedaIngresosPromedios=this.jTextFieldcodigoBusquedaIngresosPromediosIngresosPromedios.getText();
		if(this.jComboBoxid_anioBusquedaIngresosPromediosIngresosPromedios.getSelectedItem()!=null){this.id_anioBusquedaIngresosPromedios=((Anio)this.jComboBoxid_anioBusquedaIngresosPromediosIngresosPromedios.getSelectedItem()).getId();}
		if(this.jComboBoxid_mesBusquedaIngresosPromediosIngresosPromedios.getSelectedItem()!=null){this.id_mesBusquedaIngresosPromedios=((Mes)this.jComboBoxid_mesBusquedaIngresosPromediosIngresosPromedios.getSelectedItem()).getId();}
		
	}
	
	
	
	
	public void inicializarActualizarBindingBusquedasIngresosPromedios(Boolean esInicializar) throws Exception {				
		if(IngresosPromediosJInternalFrame.ISBINDING_MANUAL) {
			
			this.inicializarActualizarBindingBusquedasManualIngresosPromedios();			
			
		} else {
		}
	}		
		
	public void inicializarActualizarBindingTablaIngresosPromedios() throws Exception {
		this.inicializarActualizarBindingTablaIngresosPromedios(false);
	}
	
	
	public void inicializarActualizarBindingTablaOrderByIngresosPromedios() {
		//TABLA OrderBy	
		TableColumn tableColumn=new TableColumn();
		Integer iWidthTableDefinicionOrderBy=0;			
			
		this.jInternalFrameOrderByIngresosPromedios.getjTableDatosOrderBy().setModel(new TablaGeneralOrderByModel(this.arrOrderBy));
					
		//DEFINIR RENDERERS OrderBy
		tableColumn=this.jInternalFrameOrderByIngresosPromedios.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByIngresosPromedios.getjTableDatosOrderBy(),OrderBy.ISSELECTED));			
		//tableColumn.addPropertyChangeListener(new IngresosPromediosPropertyChangeListener());
					
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		iWidthTableDefinicionOrderBy+=50;
					
		tableColumn=this.jInternalFrameOrderByIngresosPromedios.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByIngresosPromedios.getjTableDatosOrderBy(),OrderBy.NOMBRE));
		//tableColumn.addPropertyChangeListener(new IngresosPromediosPropertyChangeListener());
					
		tableColumn.setPreferredWidth(150); 	 
		tableColumn.setWidth(150); 	 
		tableColumn.setMinWidth(150);
		tableColumn.setMaxWidth(150);
				
		iWidthTableDefinicionOrderBy+=150;
					
		//tableColumn=this.jTableDatosIngresosPromediosOrderBy.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosIngresosPromediosOrderBy,OrderBy.NOMBREDB));			
		////tableColumn.addPropertyChangeListener(new IngresosPromediosPropertyChangeListener());
								
		tableColumn=this.jInternalFrameOrderByIngresosPromedios.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByIngresosPromedios.getjTableDatosOrderBy(),OrderBy.ESDESC));
		//tableColumn.addPropertyChangeListener(new IngresosPromediosPropertyChangeListener());
												
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		((AbstractTableModel) this.jInternalFrameOrderByIngresosPromedios.getjTableDatosOrderBy().getModel()).fireTableDataChanged();
				
		iWidthTableDefinicionOrderBy+=50;
	}
	
	
	
	public void inicializarActualizarBindingTablaIngresosPromedios(Boolean esInicializar) throws Exception {
		Boolean isNoExiste=false;
		Integer iCountNumeroColumnasNormal=0;
		Integer iCountNumeroColumnasFk=0;
		
		this.iWidthTableDefinicion=0;
		
		int iSizeTabla=0;
		
		iSizeTabla=this.getSizeTablaDatos();
		
	if(esInicializar || ConstantesSwing.FORZAR_INICIALIZAR_TABLA) {//esInicializar
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			isNoExiste=ingresospromediosLogic.getIngresosPromedioss().size()==0;
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			isNoExiste=ingresospromedioss.size()==0;
		}
		//ARCHITECTURE
			
		if(isNoExiste) {
			if(this.iNumeroPaginacion-this.iNumeroPaginacion>0) {
				this.iNumeroPaginacion-=this.iNumeroPaginacion;
			}
		}
		
		TableColumn tableColumn=new TableColumn();
		
		if(IngresosPromediosJInternalFrame.ISBINDING_MANUAL_TABLA) {
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.jTableDatosIngresosPromedios.setModel(new IngresosPromediosModel(this.ingresospromediosLogic.getIngresosPromedioss(),this));
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.jTableDatosIngresosPromedios.setModel(new IngresosPromediosModel(this.ingresospromedioss,this));
			}
			//ARCHITECTURE
			
							
			
			
			if(this.jInternalFrameOrderByIngresosPromedios!=null && this.jInternalFrameOrderByIngresosPromedios.getjTableDatosOrderBy()!=null) {
				this.inicializarActualizarBindingTablaOrderByIngresosPromedios();
			}
			
								
			//DEFINIR RENDERERS
			tableColumn=this.jTableDatosIngresosPromedios.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosIngresosPromedios,Constantes2.S_SELECCIONAR));
			//tableColumn.addPropertyChangeListener(new IngresosPromediosPropertyChangeListener());
			tableColumn.setCellRenderer(new BooleanRenderer(true,"Seleccionar "+IngresosPromediosConstantesFunciones.SCLASSWEBTITULO,ingresospromediosConstantesFunciones.resaltarSeleccionarIngresosPromedios,iSizeTabla,true,false,"","",this));
			tableColumn.setCellEditor(new BooleanEditorRenderer(true,"Seleccionar "+IngresosPromediosConstantesFunciones.SCLASSWEBTITULO,ingresospromediosConstantesFunciones.resaltarSeleccionarIngresosPromedios,false,"","",this));			
			
			tableColumn.setPreferredWidth(50); 	 
			tableColumn.setWidth(50); 	 
			tableColumn.setMinWidth(50); 
			tableColumn.setMaxWidth(50); 
			
			this.iWidthTableDefinicion+=50;
			
			


			tableColumn=this.jTableDatosIngresosPromedios.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosIngresosPromedios,IngresosPromediosConstantesFunciones.LABEL_ID));

		if(this.ingresospromediosConstantesFunciones.mostraridIngresosPromedios && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,IngresosPromediosConstantesFunciones.LABEL_ID,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.ingresospromediosConstantesFunciones.resaltaridIngresosPromedios,this.ingresospromediosConstantesFunciones.activaridIngresosPromedios,iSizeTabla,this,true,"idIngresosPromedios","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.ingresospromediosConstantesFunciones.resaltaridIngresosPromedios,this.ingresospromediosConstantesFunciones.activaridIngresosPromedios,this,true,"idIngresosPromedios","BASICO",false));

			tableColumn.setPreferredWidth(50);
			tableColumn.setWidth(50);
			tableColumn.setMinWidth(50);
			tableColumn.setMaxWidth(50);

			this.iWidthTableDefinicion+=50;
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosIngresosPromedios.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosIngresosPromedios,IngresosPromediosConstantesFunciones.LABEL_CODIGOCARGO));

		if(this.ingresospromediosConstantesFunciones.mostrarcodigo_cargoIngresosPromedios && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,IngresosPromediosConstantesFunciones.LABEL_CODIGOCARGO,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.ingresospromediosConstantesFunciones.resaltarcodigo_cargoIngresosPromedios,this.ingresospromediosConstantesFunciones.activarcodigo_cargoIngresosPromedios,iSizeTabla,this,true,"codigo_cargoIngresosPromedios","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.ingresospromediosConstantesFunciones.resaltarcodigo_cargoIngresosPromedios,this.ingresospromediosConstantesFunciones.activarcodigo_cargoIngresosPromedios,this,true,"codigo_cargoIngresosPromedios","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new IngresosPromediosPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosIngresosPromedios.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosIngresosPromedios,IngresosPromediosConstantesFunciones.LABEL_CODIGODATO));

		if(this.ingresospromediosConstantesFunciones.mostrarcodigo_datoIngresosPromedios && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,IngresosPromediosConstantesFunciones.LABEL_CODIGODATO,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.ingresospromediosConstantesFunciones.resaltarcodigo_datoIngresosPromedios,this.ingresospromediosConstantesFunciones.activarcodigo_datoIngresosPromedios,iSizeTabla,this,true,"codigo_datoIngresosPromedios","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.ingresospromediosConstantesFunciones.resaltarcodigo_datoIngresosPromedios,this.ingresospromediosConstantesFunciones.activarcodigo_datoIngresosPromedios,this,true,"codigo_datoIngresosPromedios","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new IngresosPromediosPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosIngresosPromedios.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosIngresosPromedios,IngresosPromediosConstantesFunciones.LABEL_NOMBRE));

		if(this.ingresospromediosConstantesFunciones.mostrarnombreIngresosPromedios && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,IngresosPromediosConstantesFunciones.LABEL_NOMBRE,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.ingresospromediosConstantesFunciones.resaltarnombreIngresosPromedios,this.ingresospromediosConstantesFunciones.activarnombreIngresosPromedios,iSizeTabla,this,true,"nombreIngresosPromedios","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.ingresospromediosConstantesFunciones.resaltarnombreIngresosPromedios,this.ingresospromediosConstantesFunciones.activarnombreIngresosPromedios,this,true,"nombreIngresosPromedios","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new IngresosPromediosPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosIngresosPromedios.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosIngresosPromedios,IngresosPromediosConstantesFunciones.LABEL_VALORPAGO));

		if(this.ingresospromediosConstantesFunciones.mostrarvalor_pagoIngresosPromedios && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,IngresosPromediosConstantesFunciones.LABEL_VALORPAGO,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.ingresospromediosConstantesFunciones.resaltarvalor_pagoIngresosPromedios,this.ingresospromediosConstantesFunciones.activarvalor_pagoIngresosPromedios,iSizeTabla,this,true,"valor_pagoIngresosPromedios","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.ingresospromediosConstantesFunciones.resaltarvalor_pagoIngresosPromedios,this.ingresospromediosConstantesFunciones.activarvalor_pagoIngresosPromedios,this,true,"valor_pagoIngresosPromedios","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA);

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
			//tableColumn.addPropertyChangeListener(new IngresosPromediosPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosIngresosPromedios.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosIngresosPromedios,IngresosPromediosConstantesFunciones.LABEL_NOMBRERUBROEMPLEA));

		if(this.ingresospromediosConstantesFunciones.mostrarnombre_rubro_empleaIngresosPromedios && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,IngresosPromediosConstantesFunciones.LABEL_NOMBRERUBROEMPLEA,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.ingresospromediosConstantesFunciones.resaltarnombre_rubro_empleaIngresosPromedios,this.ingresospromediosConstantesFunciones.activarnombre_rubro_empleaIngresosPromedios,iSizeTabla,this,true,"nombre_rubro_empleaIngresosPromedios","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.ingresospromediosConstantesFunciones.resaltarnombre_rubro_empleaIngresosPromedios,this.ingresospromediosConstantesFunciones.activarnombre_rubro_empleaIngresosPromedios,this,true,"nombre_rubro_empleaIngresosPromedios","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new IngresosPromediosPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}
			
		} else {
		}			
					
		if(!this.ingresospromediosSessionBean.getEsGuardarRelacionado()
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
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.ingresospromediosSessionBean.getEsGuardarRelacionado(),iSizeTabla));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.ingresospromediosSessionBean.getEsGuardarRelacionado(),iSizeTabla));
	
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosIngresosPromedios.addColumn(tableColumn);
			
			} else {				
				
				//LO MISMO QUE IF
				
				tableColumn= new TableColumn();
				tableColumn.setIdentifier(sLabelColumnAccion);
				tableColumn.setHeaderValue(sLabelColumnAccion);
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.ingresospromediosSessionBean.getEsGuardarRelacionado(),iSizeTabla));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.ingresospromediosSessionBean.getEsGuardarRelacionado(),iSizeTabla));
		
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosIngresosPromedios.addColumn(tableColumn);				
					
				//ELIMINAR
				if(this.isPermisoEliminarIngresosPromedios && this.isPermisoGuardarCambiosIngresosPromedios) {
					tableColumn= new TableColumn();
					tableColumn.setIdentifier(Constantes2.S_ELI);
					tableColumn.setHeaderValue(sLabelColumnAccionEli);
					tableColumn.setCellRenderer(new IdTableCell(this,false,true,this.ingresospromediosSessionBean.getEsGuardarRelacionado(),iSizeTabla));
					tableColumn.setCellEditor(new IdTableCell(this,false,true,this.ingresospromediosSessionBean.getEsGuardarRelacionado(),iSizeTabla));
			
					tableColumn.setPreferredWidth(65); 	 
					tableColumn.setWidth(65); 	 
					tableColumn.setMinWidth(65); 
					tableColumn.setMaxWidth(65);
					
					this.iWidthTableDefinicion+=65;
						
					this.jTableDatosIngresosPromedios.addColumn(tableColumn);
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
			
			this.jTableDatosIngresosPromedios.addColumn(tableColumn);
			*/
		}
		
		Integer iUltimaColumna=0;//1
		Integer iNuevaPosicionColumna=0;
		
		
		//PERMITE ELIMINAR SIMPLE
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarIngresosPromedios && this.isPermisoGuardarCambiosIngresosPromedios) {
				iUltimaColumna++;
			}	
		}
		
		//PERMITE EDITAR SIMPLE
		iUltimaColumna++;	
		
				
		
		//MOVIA SELECCIONAR
		//iUltimaColumna++;
		
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarIngresosPromedios && this.isPermisoGuardarCambiosIngresosPromedios) {
				//REUBICA ELIMINAR SIMPLE
				jTableDatosIngresosPromedios.moveColumn(this.jTableDatosIngresosPromedios.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3
					
				iUltimaColumna--;
			}
		}
		//REUBICA EDITAR SIMPLE
		jTableDatosIngresosPromedios.moveColumn(this.jTableDatosIngresosPromedios.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3				
		
		
		
		
		//REUBICABA SELECCIONAR
		/*
		if(iUltimaColumna>1) {
			iUltimaColumna--;
		}
		
		//iNuevaPosicionColumna++;
			
		//REUBICA SELECCIONAR FILA CHECK
		jTableDatosIngresosPromedios.moveColumn(this.jTableDatosIngresosPromedios.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1		
		*/
		
		//DEFINEN HEADERS
		final TableCellRenderer tableHeaderDefaultCellRenderer = this.jTableDatosIngresosPromedios.getTableHeader().getDefaultRenderer();
		
		this.jTableDatosIngresosPromedios.getTableHeader().setDefaultRenderer(new TableCellRendererHeader(this.jTableDatosIngresosPromedios,tableHeaderDefaultCellRenderer));
	    
		TableColumn column=null;
		
		if(!IngresosPromediosJInternalFrame.ISBINDING_MANUAL_TABLA) {
			for(int i = 0; i < this.jTableDatosIngresosPromedios.getColumnModel().getColumnCount(); i++) { 
				column = this.jTableDatosIngresosPromedios.getColumnModel().getColumn(i); 
				
				if(column.getIdentifier()!=null) {
					//SI SE UTILIZA UN HEADER ES GENERICO
					//column.setHeaderRenderer(new HeaderRenderer(column.getIdentifier().toString()));
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_ELI)) {
					continue;
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_SELECCIONAR)) {
					if(!IngresosPromediosJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(50); 	 
						column.setWidth(50); 	 
						column.setMinWidth(50); 	
						column.setMaxWidth(50); 
						
						this.iWidthTableDefinicion+=50;
					}
					
				} else {
					if(!IngresosPromediosJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						column.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						
						this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
					}
				}
			}
		}
		
		this.jTableDatosIngresosPromedios.setSelectionBackground(FuncionesSwing.getColorSelectedBackground());
		this.jTableDatosIngresosPromedios.setSelectionForeground(FuncionesSwing.getColorSelectedForeground());
		
		/*
		this.jTableDatosIngresosPromedios.setDefaultRenderer(Object.class, new DefaultTableCellRenderer() {
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
							//iSize=ingresospromediosLogic.getIngresosPromedioss().size()-1;
								
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							iSize=ingresospromedioss.size()-1;
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
		//this.jTableDatosIngresosPromedios.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA);
		
		/*
		column=this.jTableDatosIngresosPromedios.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosSistema,Constantes2.S_SELECCIONAR));
		
		if(column!=null) {
			column.setPreferredWidth(25); 	 
			column.setWidth(25); 	 
			column.setMinWidth(25); 	
		}
		*/
			
			//CopyTableToTableTotal();
		} else {
			
			this.actualizarVisualTableDatosIngresosPromedios();
			
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
				
				//this.isEsNuevoIngresosPromedios=false;
					
				IngresosPromediosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.ingresospromedios,new Object(),this.ingresospromediosParameterGeneral,this.ingresospromediosReturnGeneral);
			
				if(this.ingresospromediosSessionBean.getConGuardarRelaciones()) {
					this.dStart=(double)System.currentTimeMillis();
				}
				
				if(this.jInternalFrameDetalleFormIngresosPromedios==null) {
					this.inicializarFormDetalle();
				}
				
				this.inicializarInvalidValues();
				
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosIngresosPromedios.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosIngresosPromedios.getSelectedRow();	       
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.ingresospromedios =(IngresosPromedios) this.ingresospromediosLogic.getIngresosPromedioss().toArray()[this.jTableDatosIngresosPromedios.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.ingresospromedios =(IngresosPromedios) this.ingresospromedioss.toArray()[this.jTableDatosIngresosPromedios.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//PUEDE SER PARA DUPLICADO O NUEVO TABLA
				
				if(this.ingresospromedios.getsType().equals("DUPLICADO")
				   || this.ingresospromedios.getsType().equals("NUEVO_GUARDAR_CAMBIOS")) {
					
					this.isEsNuevoIngresosPromedios=true;
				
				} else {
					this.isEsNuevoIngresosPromedios=false;	
				}
				
				//CONTROL VERSION ANTERIOR
				/*
				if(!this.ingresospromediosSessionBean.getEsGuardarRelacionado()) {
					if(this.ingresospromedios.getId()>=0 && !this.ingresospromedios.getIsNew()) {						
						this.isEsNuevoIngresosPromedios=false;
						
					} else {
						this.isEsNuevoIngresosPromedios=true;
					}
					
				} else {
					//CONTROLAR PARA RELACIONADO
				}
				*/
				
				//ESTABLECE SI ES RELACIONADO O NO 
				this.habilitarDeshabilitarTipoMantenimientoIngresosPromedios(esRelaciones);						
				
				this.seleccionarIngresosPromedios(evt,null,rowIndex);
				
				//SELECCIONA ACTUAL PERO AUN NO SE HA INGRESADO AL SISTEMA
				//SE DESHABILITA POR GUARDAR CAMBIOS
				/*
				if(this.ingresospromedios.getId()<0) {
					this.isEsNuevoIngresosPromedios=true;
				}
				*/
				
				if(!this.esParaBusquedaForeignKey) {
					this.modificarIngresosPromedios(evt,rowIndex,esRelaciones);
				} else {
					this.seleccionarIngresosPromedios(evt,rowIndex);
				}	
				
				if(this.ingresospromediosSessionBean.getConGuardarRelaciones()) {
					this.dEnd=(double)System.currentTimeMillis();					
					this.dDif=this.dEnd - this.dStart;
					
					if(Constantes.ISDEVELOPING) {
						System.out.println("Tiempo(ms) Seleccion IngresosPromedios: " + this.dDif); 
					}
				}								
				
				IngresosPromediosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.ingresospromedios,new Object(),this.ingresospromediosParameterGeneral,this.ingresospromediosReturnGeneral);
				
			} else {
				this.estaModoEliminarGuardarCambios=true;
				
				this.seleccionarIngresosPromedios(evt,null,rowIndex);
				
				if(this.permiteMantenimiento(this.ingresospromedios)) {
					if(this.ingresospromedios.getId()>0) {
						this.ingresospromedios.setIsDeleted(true);
						
						this.ingresospromediossEliminados.add(this.ingresospromedios);
					}
					
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.ingresospromediosLogic.getIngresosPromedioss().remove(this.ingresospromedios);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.ingresospromedioss.remove(this.ingresospromedios);				
					}
					
					
					((IngresosPromediosModel) this.jTableDatosIngresosPromedios.getModel()).fireTableRowsDeleted(rowIndex,rowIndex);
					
					this.actualizarFilaTotales();
					
					this.inicializarActualizarBindingTablaIngresosPromedios(false);					
				}								
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException2(this, e,logger,IngresosPromediosConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoSeleccionar=false;				
			this.estaModoEliminarGuardarCambios=false;
		}
	}
	
	
	public void seleccionarIngresosPromedios(ActionEvent evt,javax.swing.event.ListSelectionEvent evt2,int rowIndex) throws Exception { 
		try {
			//SI PUEDE SER NUEVO Y SELECCIONAR (PARA DUPLICAR Y NUEVO TABLA)
			//if(!this.isEsNuevoIngresosPromedios) {
			
			if(this.jInternalFrameDetalleFormIngresosPromedios==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosIngresosPromedios.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosIngresosPromedios.getSelectedRow();	       
				}
				
				//CUANDO SE RECARGA TABLA TAMBIEN SE SELECCIONA PERO CON -1 POR LO QUE SE NECESITA VALIDAR ANTES
				if(intSelectedRow<0) {
					return;
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.ingresospromedios =(IngresosPromedios) this.ingresospromediosLogic.getIngresosPromedioss().toArray()[this.jTableDatosIngresosPromedios.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.ingresospromedios =(IngresosPromedios) this.ingresospromedioss.toArray()[this.jTableDatosIngresosPromedios.convertRowIndexToModel(intSelectedRow)];
				}
				
				if(IngresosPromediosJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesObjetoActualToFormularioIngresosPromedios(this.ingresospromedios);
				}
				
				//ARCHITECTURE
				try {
					
				} catch(Exception e) {
					throw e;
				}
				
				this.actualizarEstadoCeldasBotonesIngresosPromedios("s", this.isGuardarCambiosEnLote, this.isEsMantenimientoRelacionado);
				
				//NO FUNCIONA BINDING PERO SE MANTIENE
				this.inicializarActualizarBindingBotonesIngresosPromedios(false) ;
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualIngresosPromedios() ;
			//}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,IngresosPromediosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesObjetoActualToFormularioTodoIngresosPromedios(IngresosPromedios ingresospromedios) throws Exception { 
		this.setVariablesObjetoActualToFormularioTodoIngresosPromedios(ingresospromedios,false,"NINGUNO");
	}
	
	public void setVariablesObjetoActualToFormularioTodoIngresosPromedios(IngresosPromedios ingresospromedios,Boolean conCargarListasDesdeObjetoActual,String sTipoEvento) throws Exception { 
		this.setVariablesObjetoActualToFormularioIngresosPromedios(ingresospromedios);
		
		if(conCargarListasDesdeObjetoActual) {
			this.setVariablesObjetoActualToListasForeignKeyIngresosPromedios(ingresospromedios,sTipoEvento);
		}
		
		this.setVariablesObjetoActualToFormularioForeignKeyIngresosPromedios(ingresospromedios);
	}
	
	public void setVariablesObjetoActualToFormularioIngresosPromedios(IngresosPromedios ingresospromedios) throws Exception { 
		try {			
			Image imageActual=null;
			ImageIcon imageIcon = null;
			
			if(this.jInternalFrameDetalleFormIngresosPromedios==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			
			this.jInternalFrameDetalleFormIngresosPromedios.jLabelidIngresosPromedios.setText(ingresospromedios.getId().toString());
			this.jInternalFrameDetalleFormIngresosPromedios.jTextFieldcodigo_cargoIngresosPromedios.setText(ingresospromedios.getcodigo_cargo());
			this.jInternalFrameDetalleFormIngresosPromedios.jTextFieldcodigo_datoIngresosPromedios.setText(ingresospromedios.getcodigo_dato());
			this.jInternalFrameDetalleFormIngresosPromedios.jTextAreanombreIngresosPromedios.setText(ingresospromedios.getnombre());
			this.jInternalFrameDetalleFormIngresosPromedios.jTextFieldvalor_pagoIngresosPromedios.setText(ingresospromedios.getvalor_pago().toString());
			this.jInternalFrameDetalleFormIngresosPromedios.jTextAreanombre_rubro_empleaIngresosPromedios.setText(ingresospromedios.getnombre_rubro_emplea());
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,IngresosPromediosConstantesFunciones.CLASSNAME);
		}
	}
		
	public void actualizarInformacion(String sTipo,IngresosPromedios ingresospromediosLocal) throws Exception {
		this.actualizarInformacion(sTipo,false,ingresospromediosLocal);
	}	
	
	public void actualizarInformacion(String sTipo,Boolean conParametroObjeto,IngresosPromedios ingresospromediosLocal) throws Exception {
		
		if(!conParametroObjeto) {
			if(!this.getEsControlTabla()) {
				ingresospromediosLocal=this.ingresospromedios;
			} else {
				ingresospromediosLocal=this.ingresospromediosAnterior;
			}
		}
		
		if(this.permiteMantenimiento(ingresospromediosLocal)) {
			if(sTipo.equals("EVENTO_CONTROL")) { // || sTipo.equals("EVENTO_NUEVO")
				if(!this.esControlTabla) {
					this.setVariablesFormularioToObjetoActualTodoIngresosPromedios(ingresospromediosLocal,true);
					
					if(ingresospromediosSessionBean.getConGuardarRelaciones()) {
						this.actualizarRelaciones(ingresospromediosLocal);
					}
				}
			
			} else if(sTipo.equals("INFO_PADRE")) {
				
				if(this.ingresospromediosSessionBean.getEsGuardarRelacionado()) {
					this.actualizarRelacionFkPadreActual(ingresospromediosLocal);
				}
			}
		}
	}
	
	public void setVariablesFormularioToObjetoActualTodoIngresosPromedios(IngresosPromedios ingresospromedios,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualIngresosPromedios(ingresospromedios,conColumnasBase);
		this.setVariablesFormularioToObjetoActualForeignKeysIngresosPromedios(ingresospromedios);
	}
	
	public void setVariablesFormularioToObjetoActualIngresosPromedios(IngresosPromedios ingresospromedios,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualIngresosPromedios(ingresospromedios,conColumnasBase,true);
	}
	
	public void setVariablesFormularioToObjetoActualIngresosPromedios(IngresosPromedios ingresospromedios,Boolean conColumnasBase,Boolean conInicializarInvalidValues) throws Exception { 
		String sMensajeCampoActual="";
		Boolean estaValidado=true;
		try {
			
			if(this.jInternalFrameDetalleFormIngresosPromedios==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			if(conInicializarInvalidValues) {
				this.inicializarInvalidValues();
			}
			
			

		try {
			if(this.jInternalFrameDetalleFormIngresosPromedios.jLabelidIngresosPromedios.getText()==null || this.jInternalFrameDetalleFormIngresosPromedios.jLabelidIngresosPromedios.getText()=="" || this.jInternalFrameDetalleFormIngresosPromedios.jLabelidIngresosPromedios.getText()=="Id") {
				this.jInternalFrameDetalleFormIngresosPromedios.jLabelidIngresosPromedios.setText("0");
			}

			if(conColumnasBase) {ingresospromedios.setId(Long.parseLong(this.jInternalFrameDetalleFormIngresosPromedios.jLabelidIngresosPromedios.getText()));}
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+IngresosPromediosConstantesFunciones.LABEL_ID+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormIngresosPromedios.jLabelIdIngresosPromedios,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			ingresospromedios.setcodigo_cargo(this.jInternalFrameDetalleFormIngresosPromedios.jTextFieldcodigo_cargoIngresosPromedios.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+IngresosPromediosConstantesFunciones.LABEL_CODIGOCARGO+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormIngresosPromedios.jLabelcodigo_cargoIngresosPromedios,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			ingresospromedios.setcodigo_dato(this.jInternalFrameDetalleFormIngresosPromedios.jTextFieldcodigo_datoIngresosPromedios.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+IngresosPromediosConstantesFunciones.LABEL_CODIGODATO+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormIngresosPromedios.jLabelcodigo_datoIngresosPromedios,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			ingresospromedios.setnombre(this.jInternalFrameDetalleFormIngresosPromedios.jTextAreanombreIngresosPromedios.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+IngresosPromediosConstantesFunciones.LABEL_NOMBRE+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormIngresosPromedios.jLabelnombreIngresosPromedios,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			ingresospromedios.setvalor_pago(Double.parseDouble(this.jInternalFrameDetalleFormIngresosPromedios.jTextFieldvalor_pagoIngresosPromedios.getText()));
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+IngresosPromediosConstantesFunciones.LABEL_VALORPAGO+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormIngresosPromedios.jLabelvalor_pagoIngresosPromedios,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			ingresospromedios.setnombre_rubro_emplea(this.jInternalFrameDetalleFormIngresosPromedios.jTextAreanombre_rubro_empleaIngresosPromedios.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+IngresosPromediosConstantesFunciones.LABEL_NOMBRERUBROEMPLEA+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormIngresosPromedios.jLabelnombre_rubro_empleaIngresosPromedios,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}
			
			if(!estaValidado) {
				throw new Exception(sMensajeCampoActual);
			}
		} catch(NumberFormatException e) {
			throw new Exception(sMensajeCampoActual);
			//FuncionesSwing.manageException(this, e,logger,MovimientoInventarioConstantesFunciones.CLASSNAME);
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,IngresosPromediosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualIngresosPromedios(IngresosPromedios ingresospromediosBean,IngresosPromedios ingresospromedios,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,IngresosPromediosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setCopiarVariablesObjetosIngresosPromedios(IngresosPromedios ingresospromediosOrigen,IngresosPromedios ingresospromedios,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			if(conColumnasBase) {if(conDefault || (!conDefault && ingresospromediosOrigen.getId()!=null && !ingresospromediosOrigen.getId().equals(0L))) {ingresospromedios.setId(ingresospromediosOrigen.getId());}}
			if(conDefault || (!conDefault && ingresospromediosOrigen.getcodigo()!=null && !ingresospromediosOrigen.getcodigo().equals(""))) {ingresospromedios.setcodigo(ingresospromediosOrigen.getcodigo());}
			if(conDefault || (!conDefault && ingresospromediosOrigen.getcodigo_cargo()!=null && !ingresospromediosOrigen.getcodigo_cargo().equals(""))) {ingresospromedios.setcodigo_cargo(ingresospromediosOrigen.getcodigo_cargo());}
			if(conDefault || (!conDefault && ingresospromediosOrigen.getcodigo_dato()!=null && !ingresospromediosOrigen.getcodigo_dato().equals(""))) {ingresospromedios.setcodigo_dato(ingresospromediosOrigen.getcodigo_dato());}
			if(conDefault || (!conDefault && ingresospromediosOrigen.getnombre()!=null && !ingresospromediosOrigen.getnombre().equals(""))) {ingresospromedios.setnombre(ingresospromediosOrigen.getnombre());}
			if(conDefault || (!conDefault && ingresospromediosOrigen.getvalor_pago()!=null && !ingresospromediosOrigen.getvalor_pago().equals(0.0))) {ingresospromedios.setvalor_pago(ingresospromediosOrigen.getvalor_pago());}
			if(conDefault || (!conDefault && ingresospromediosOrigen.getnombre_rubro_emplea()!=null && !ingresospromediosOrigen.getnombre_rubro_emplea().equals(""))) {ingresospromedios.setnombre_rubro_emplea(ingresospromediosOrigen.getnombre_rubro_emplea());}
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,IngresosPromediosConstantesFunciones.CLASSNAME);
		}
	}
	
	/*
	public void setVariablesObjetoBeanActualToFormularioIngresosPromedios(IngresosPromedios ingresospromedios) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormIngresosPromedios.jLabelidIngresosPromedios.setText(ingresospromedios.getId().toString());
			this.jInternalFrameDetalleFormIngresosPromedios.jTextFieldcodigo_cargoIngresosPromedios.setText(ingresospromedios.getcodigo_cargo());
			this.jInternalFrameDetalleFormIngresosPromedios.jTextFieldcodigo_datoIngresosPromedios.setText(ingresospromedios.getcodigo_dato());
			this.jInternalFrameDetalleFormIngresosPromedios.jTextAreanombreIngresosPromedios.setText(ingresospromedios.getnombre());
			this.jInternalFrameDetalleFormIngresosPromedios.jTextFieldvalor_pagoIngresosPromedios.setText(ingresospromedios.getvalor_pago().toString());
			this.jInternalFrameDetalleFormIngresosPromedios.jTextAreanombre_rubro_empleaIngresosPromedios.setText(ingresospromedios.getnombre_rubro_emplea());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,IngresosPromediosConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoBeanActualToFormularioIngresosPromedios(IngresosPromediosBean ingresospromediosBean) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormIngresosPromedios.jLabelidIngresosPromedios.setText(ingresospromediosBean.getId().toString());
			this.jInternalFrameDetalleFormIngresosPromedios.jTextFieldcodigo_cargoIngresosPromedios.setText(ingresospromediosBean.getcodigo_cargo());
			this.jInternalFrameDetalleFormIngresosPromedios.jTextFieldcodigo_datoIngresosPromedios.setText(ingresospromediosBean.getcodigo_dato());
			this.jInternalFrameDetalleFormIngresosPromedios.jTextAreanombreIngresosPromedios.setText(ingresospromediosBean.getnombre());
			this.jInternalFrameDetalleFormIngresosPromedios.jTextFieldvalor_pagoIngresosPromedios.setText(ingresospromediosBean.getvalor_pago().toString());
			this.jInternalFrameDetalleFormIngresosPromedios.jTextAreanombre_rubro_empleaIngresosPromedios.setText(ingresospromediosBean.getnombre_rubro_emplea());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,IngresosPromediosConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoReturnGeneralToBeanIngresosPromedios(IngresosPromediosParameterReturnGeneral ingresospromediosReturnGeneral,IngresosPromediosBean ingresospromediosBean,Boolean conDefault) throws Exception { 
		try {
			IngresosPromedios ingresospromediosLocal=new IngresosPromedios();
			
			ingresospromediosLocal=ingresospromediosReturnGeneral.getIngresosPromedios();
			
			
			if(conColumnasBase) {if(conDefault || (!conDefault && ingresospromediosLocal.getId()!=null && !ingresospromediosLocal.getId().equals(0L))) {ingresospromediosBean.setId(ingresospromediosLocal.getId());}}
			if(conDefault || (!conDefault && ingresospromediosLocal.getcodigo_cargo()!=null && !ingresospromediosLocal.getcodigo_cargo().equals(""))) {ingresospromediosBean.setcodigo_cargo(ingresospromediosLocal.getcodigo_cargo());}
			if(conDefault || (!conDefault && ingresospromediosLocal.getcodigo_dato()!=null && !ingresospromediosLocal.getcodigo_dato().equals(""))) {ingresospromediosBean.setcodigo_dato(ingresospromediosLocal.getcodigo_dato());}
			if(conDefault || (!conDefault && ingresospromediosLocal.getnombre()!=null && !ingresospromediosLocal.getnombre().equals(""))) {ingresospromediosBean.setnombre(ingresospromediosLocal.getnombre());}
			if(conDefault || (!conDefault && ingresospromediosLocal.getvalor_pago()!=null && !ingresospromediosLocal.getvalor_pago().equals(0.0))) {ingresospromediosBean.setvalor_pago(ingresospromediosLocal.getvalor_pago());}
			if(conDefault || (!conDefault && ingresospromediosLocal.getnombre_rubro_emplea()!=null && !ingresospromediosLocal.getnombre_rubro_emplea().equals(""))) {ingresospromediosBean.setnombre_rubro_emplea(ingresospromediosLocal.getnombre_rubro_emplea());}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,IngresosPromediosConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	@SuppressWarnings("rawtypes")
	public static void setActualComboBoxIngresosPromediosGenerico(Long idIngresosPromediosSeleccionado,JComboBox jComboBoxIngresosPromedios,List<IngresosPromedios> ingresospromediossLocal)throws Exception {
		try {
			IngresosPromedios  ingresospromediosTemp=null;

			for(IngresosPromedios ingresospromediosAux:ingresospromediossLocal) {
				if(ingresospromediosAux.getId()!=null && ingresospromediosAux.getId().equals(idIngresosPromediosSeleccionado)) {
					ingresospromediosTemp=ingresospromediosAux;
					break;
				}
			}

			jComboBoxIngresosPromedios.setSelectedItem(ingresospromediosTemp);

		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("rawtypes")
	public static void setHotKeysComboBoxIngresosPromediosGenerico(JComboBox jComboBoxIngresosPromedios,JInternalFrameBase jInternalFrameBase,String sNombreHotKeyAbstractAction,String sTipoBusqueda)throws Exception {
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
				
				jComboBoxIngresosPromedios.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxIngresosPromedios.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Busqueda"));
				//BUSCAR
				
				
				//ACTUALIZAR
				sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
				keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_ACTUALIZAR");
				
				jComboBoxIngresosPromedios.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxIngresosPromedios.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Update"));
				//ACTUALIZAR
				
				if(sTipoBusqueda.contains("CON_EVENT_CHANGE")) {
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxIngresosPromedios.addFocusListener(new ComboBoxFocusListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
						jComboBoxIngresosPromedios.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));						
					}
					
					/*
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxIngresosPromedios.addItemListener(new ComboBoxItemListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					} else {
						jComboBoxIngresosPromedios.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					}
					*/
				}								
				
				//CON_BUSQUEDA								
				if(sTipoBusqueda.contains("CON_BUSQUEDA")) {
					sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
					keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_BUSQUEDA");
							
					jComboBoxIngresosPromedios.getInputMap().put(keyStrokeControl, sKeyStrokeName);
					jComboBoxIngresosPromedios.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction));
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
			FuncionesSwing.manageException2(this, e,logger,IngresosPromediosConstantesFunciones.CLASSNAME);
		}
	}
	
	public String getDescripcionFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		String sDescripcion="";
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			ingresospromedios=(IngresosPromedios) ingresospromediosLogic.getIngresosPromedioss().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			ingresospromedios =(IngresosPromedios) ingresospromedioss.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		if(sTipo.equals("Estructura")) {
			//sDescripcion=this.getActualEstructuraForeignKeyDescripcion((Long)value);
			if(!ingresospromedios.getIsNew() && !ingresospromedios.getIsChanged() && !ingresospromedios.getIsDeleted()) {
				sDescripcion=ingresospromedios.getestructura_descripcion();
			} else {
				//sDescripcion=this.getActualEstructuraForeignKeyDescripcion((Long)value);
				sDescripcion=ingresospromedios.getestructura_descripcion();
			}
		}

		if(sTipo.equals("Empresa")) {
			//sDescripcion=this.getActualEmpresaForeignKeyDescripcion((Long)value);
			if(!ingresospromedios.getIsNew() && !ingresospromedios.getIsChanged() && !ingresospromedios.getIsDeleted()) {
				sDescripcion=ingresospromedios.getempresa_descripcion();
			} else {
				//sDescripcion=this.getActualEmpresaForeignKeyDescripcion((Long)value);
				sDescripcion=ingresospromedios.getempresa_descripcion();
			}
		}

		if(sTipo.equals("Anio")) {
			//sDescripcion=this.getActualAnioForeignKeyDescripcion((Long)value);
			if(!ingresospromedios.getIsNew() && !ingresospromedios.getIsChanged() && !ingresospromedios.getIsDeleted()) {
				sDescripcion=ingresospromedios.getanio_descripcion();
			} else {
				//sDescripcion=this.getActualAnioForeignKeyDescripcion((Long)value);
				sDescripcion=ingresospromedios.getanio_descripcion();
			}
		}

		if(sTipo.equals("Mes")) {
			//sDescripcion=this.getActualMesForeignKeyDescripcion((Long)value);
			if(!ingresospromedios.getIsNew() && !ingresospromedios.getIsChanged() && !ingresospromedios.getIsDeleted()) {
				sDescripcion=ingresospromedios.getmes_descripcion();
			} else {
				//sDescripcion=this.getActualMesForeignKeyDescripcion((Long)value);
				sDescripcion=ingresospromedios.getmes_descripcion();
			}
		}

		
		return sDescripcion;
	}
	
	public Color getColorFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		Color color=Color.WHITE;
		
		IngresosPromedios ingresospromediosRow=new IngresosPromedios();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			ingresospromediosRow=(IngresosPromedios) ingresospromediosLogic.getIngresosPromedioss().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			ingresospromediosRow=(IngresosPromedios) ingresospromedioss.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		
		return color;
	}
	
	
	
	
	
	
	
	public void refrescarBindingTabla(Boolean blnSoloTabla) {
	}
	
	public void inicializarActualizarBindingBotonesManualIngresosPromedios(Boolean esSetControles) {						
		if(esSetControles) {
			this.jButtonNuevoIngresosPromedios.setVisible((this.isVisibilidadCeldaNuevoIngresosPromedios && this.isPermisoNuevoIngresosPromedios));			
			this.jButtonDuplicarIngresosPromedios.setVisible((this.isVisibilidadCeldaDuplicarIngresosPromedios && this.isPermisoDuplicarIngresosPromedios));			
			this.jButtonCopiarIngresosPromedios.setVisible((this.isVisibilidadCeldaCopiarIngresosPromedios && this.isPermisoCopiarIngresosPromedios));
			this.jButtonVerFormIngresosPromedios.setVisible((this.isVisibilidadCeldaVerFormIngresosPromedios && this.isPermisoVerFormIngresosPromedios));
			
			this.jButtonAbrirOrderByIngresosPromedios.setVisible((this.isVisibilidadCeldaOrdenIngresosPromedios && this.isPermisoOrdenIngresosPromedios));			
			
			this.jButtonNuevoRelacionesIngresosPromedios.setVisible((this.isVisibilidadCeldaNuevoRelacionesIngresosPromedios && this.isPermisoNuevoIngresosPromedios));			
			this.jButtonNuevoGuardarCambiosIngresosPromedios.setVisible((this.isVisibilidadCeldaNuevoIngresosPromedios && this.isPermisoNuevoIngresosPromedios && this.isPermisoGuardarCambiosIngresosPromedios));
			
			if(this.jInternalFrameDetalleFormIngresosPromedios!=null) {
			this.jInternalFrameDetalleFormIngresosPromedios.jButtonModificarIngresosPromedios.setVisible((this.isVisibilidadCeldaModificarIngresosPromedios && this.isPermisoActualizarIngresosPromedios));	
			this.jInternalFrameDetalleFormIngresosPromedios.jButtonActualizarIngresosPromedios.setVisible((this.isVisibilidadCeldaActualizarIngresosPromedios && this.isPermisoActualizarIngresosPromedios));	
			this.jInternalFrameDetalleFormIngresosPromedios.jButtonEliminarIngresosPromedios.setVisible((this.isVisibilidadCeldaEliminarIngresosPromedios && this.isPermisoEliminarIngresosPromedios));
			this.jInternalFrameDetalleFormIngresosPromedios.jButtonCancelarIngresosPromedios.setVisible(this.isVisibilidadCeldaCancelarIngresosPromedios);							
			this.jInternalFrameDetalleFormIngresosPromedios.jButtonGuardarCambiosIngresosPromedios.setVisible((this.isVisibilidadCeldaGuardarIngresosPromedios && this.isPermisoGuardarCambiosIngresosPromedios));			
			
			}
						
			this.jButtonGuardarCambiosTablaIngresosPromedios.setVisible((this.isVisibilidadCeldaGuardarCambiosIngresosPromedios && this.isPermisoGuardarCambiosIngresosPromedios));							
			
			//TOOLBAR
			
			this.jButtonNuevoToolBarIngresosPromedios.setVisible((this.isVisibilidadCeldaNuevoIngresosPromedios && this.isPermisoNuevoIngresosPromedios));						
			this.jButtonDuplicarToolBarIngresosPromedios.setVisible((this.isVisibilidadCeldaDuplicarIngresosPromedios && this.isPermisoDuplicarIngresosPromedios));						
			this.jButtonCopiarToolBarIngresosPromedios.setVisible((this.isVisibilidadCeldaCopiarIngresosPromedios && this.isPermisoCopiarIngresosPromedios));			
			this.jButtonVerFormToolBarIngresosPromedios.setVisible((this.isVisibilidadCeldaVerFormIngresosPromedios && this.isPermisoVerFormIngresosPromedios));			
			this.jButtonAbrirOrderByToolBarIngresosPromedios.setVisible((this.isVisibilidadCeldaOrdenIngresosPromedios && this.isPermisoOrdenIngresosPromedios));
			this.jButtonNuevoRelacionesToolBarIngresosPromedios.setVisible((this.isVisibilidadCeldaNuevoRelacionesIngresosPromedios && this.isPermisoNuevoIngresosPromedios));			
			this.jButtonNuevoGuardarCambiosToolBarIngresosPromedios.setVisible((this.isVisibilidadCeldaNuevoIngresosPromedios && this.isPermisoNuevoIngresosPromedios && this.isPermisoGuardarCambiosIngresosPromedios));			
			
			if(this.jInternalFrameDetalleFormIngresosPromedios!=null) {
			this.jInternalFrameDetalleFormIngresosPromedios.jButtonModificarToolBarIngresosPromedios.setVisible((this.isVisibilidadCeldaModificarIngresosPromedios && this.isPermisoActualizarIngresosPromedios));	
			this.jInternalFrameDetalleFormIngresosPromedios.jButtonActualizarToolBarIngresosPromedios.setVisible((this.isVisibilidadCeldaActualizarIngresosPromedios  && this.isPermisoActualizarIngresosPromedios));	
			this.jInternalFrameDetalleFormIngresosPromedios.jButtonEliminarToolBarIngresosPromedios.setVisible((this.isVisibilidadCeldaEliminarIngresosPromedios && this.isPermisoEliminarIngresosPromedios));
			this.jInternalFrameDetalleFormIngresosPromedios.jButtonCancelarToolBarIngresosPromedios.setVisible(this.isVisibilidadCeldaCancelarIngresosPromedios);				
			this.jInternalFrameDetalleFormIngresosPromedios.jButtonGuardarCambiosToolBarIngresosPromedios.setVisible((this.isVisibilidadCeldaGuardarIngresosPromedios && this.isPermisoGuardarCambiosIngresosPromedios));									
			}
			
			this.jButtonGuardarCambiosTablaToolBarIngresosPromedios.setVisible((this.isVisibilidadCeldaGuardarCambiosIngresosPromedios && this.isPermisoGuardarCambiosIngresosPromedios));									
			
			//TOOLBAR
			
			//MENUS
			
			this.jMenuItemNuevoIngresosPromedios.setVisible((this.isVisibilidadCeldaNuevoIngresosPromedios && this.isPermisoNuevoIngresosPromedios));			
			this.jMenuItemDuplicarIngresosPromedios.setVisible((this.isVisibilidadCeldaDuplicarIngresosPromedios && this.isPermisoDuplicarIngresosPromedios));			
			this.jMenuItemCopiarIngresosPromedios.setVisible((this.isVisibilidadCeldaCopiarIngresosPromedios && this.isPermisoCopiarIngresosPromedios));			
			this.jMenuItemVerFormIngresosPromedios.setVisible((this.isVisibilidadCeldaVerFormIngresosPromedios && this.isPermisoVerFormIngresosPromedios));			
			this.jMenuItemAbrirOrderByIngresosPromedios.setVisible((this.isVisibilidadCeldaOrdenIngresosPromedios && this.isPermisoOrdenIngresosPromedios));			
			//this.jMenuItemMostrarOcultarIngresosPromedios.setVisible((this.isVisibilidadCeldaOrdenIngresosPromedios && this.isPermisoOrdenIngresosPromedios));
			this.jMenuItemDetalleAbrirOrderByIngresosPromedios.setVisible((this.isVisibilidadCeldaOrdenIngresosPromedios && this.isPermisoOrdenIngresosPromedios));			
			//this.jMenuItemDetalleMostrarOcultarIngresosPromedios.setVisible((this.isVisibilidadCeldaOrdenIngresosPromedios && this.isPermisoOrdenIngresosPromedios));			
			this.jMenuItemNuevoRelacionesIngresosPromedios.setVisible((this.isVisibilidadCeldaNuevoRelacionesIngresosPromedios && this.isPermisoNuevoIngresosPromedios));			
			this.jMenuItemNuevoGuardarCambiosIngresosPromedios.setVisible((this.isVisibilidadCeldaNuevoIngresosPromedios && this.isPermisoNuevoIngresosPromedios && this.isPermisoGuardarCambiosIngresosPromedios));									
			
			if(this.jInternalFrameDetalleFormIngresosPromedios!=null) {
			this.jInternalFrameDetalleFormIngresosPromedios.jMenuItemModificarIngresosPromedios.setVisible((this.isVisibilidadCeldaModificarIngresosPromedios && this.isPermisoActualizarIngresosPromedios));	
			this.jInternalFrameDetalleFormIngresosPromedios.jMenuItemActualizarIngresosPromedios.setVisible((this.isVisibilidadCeldaActualizarIngresosPromedios && this.isPermisoActualizarIngresosPromedios));	
			this.jInternalFrameDetalleFormIngresosPromedios.jMenuItemEliminarIngresosPromedios.setVisible((this.isVisibilidadCeldaEliminarIngresosPromedios && this.isPermisoEliminarIngresosPromedios));
			this.jInternalFrameDetalleFormIngresosPromedios.jMenuItemCancelarIngresosPromedios.setVisible(this.isVisibilidadCeldaCancelarIngresosPromedios);				
			}
			
			this.jMenuItemGuardarCambiosIngresosPromedios.setVisible((this.isVisibilidadCeldaGuardarIngresosPromedios && this.isPermisoGuardarCambiosIngresosPromedios));						
			this.jMenuItemGuardarCambiosTablaIngresosPromedios.setVisible((this.isVisibilidadCeldaGuardarCambiosIngresosPromedios && this.isPermisoGuardarCambiosIngresosPromedios));						
			
			//MENUS
			
		} else {
			this.isVisibilidadCeldaNuevoIngresosPromedios=this.jButtonNuevoIngresosPromedios.isVisible();
			this.isVisibilidadCeldaDuplicarIngresosPromedios=this.jButtonDuplicarIngresosPromedios.isVisible();
			this.isVisibilidadCeldaCopiarIngresosPromedios=this.jButtonCopiarIngresosPromedios.isVisible();
			this.isVisibilidadCeldaVerFormIngresosPromedios=this.jButtonVerFormIngresosPromedios.isVisible();
			
			this.isVisibilidadCeldaOrdenIngresosPromedios=this.jButtonAbrirOrderByIngresosPromedios.isVisible();			
			
			this.isVisibilidadCeldaNuevoRelacionesIngresosPromedios=this.jButtonNuevoRelacionesIngresosPromedios.isVisible();
			this.isVisibilidadCeldaModificarIngresosPromedios=this.jButtonModificarIngresosPromedios.isVisible();
			
			if(this.jInternalFrameDetalleFormIngresosPromedios!=null) {
			this.isVisibilidadCeldaActualizarIngresosPromedios=this.jInternalFrameDetalleFormIngresosPromedios.jButtonActualizarIngresosPromedios.isVisible();
			this.isVisibilidadCeldaEliminarIngresosPromedios=this.jInternalFrameDetalleFormIngresosPromedios.jButtonEliminarIngresosPromedios.isVisible();
			this.isVisibilidadCeldaCancelarIngresosPromedios=this.jInternalFrameDetalleFormIngresosPromedios.jButtonCancelarIngresosPromedios.isVisible();
			this.isVisibilidadCeldaGuardarIngresosPromedios=this.jInternalFrameDetalleFormIngresosPromedios.jButtonGuardarCambiosIngresosPromedios.isVisible();			
			}
			
			this.isVisibilidadCeldaGuardarCambiosIngresosPromedios=this.jButtonGuardarCambiosTablaIngresosPromedios.isVisible();
			
			//TOOLBAR
			
			this.isVisibilidadCeldaNuevoIngresosPromedios=this.jButtonNuevoToolBarIngresosPromedios.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesIngresosPromedios=this.jButtonNuevoRelacionesToolBarIngresosPromedios.isVisible();
			
			if(this.jInternalFrameDetalleFormIngresosPromedios!=null) {
			this.isVisibilidadCeldaModificarIngresosPromedios=this.jInternalFrameDetalleFormIngresosPromedios.jButtonModificarToolBarIngresosPromedios.isVisible();
			this.isVisibilidadCeldaActualizarIngresosPromedios=this.jInternalFrameDetalleFormIngresosPromedios.jButtonActualizarToolBarIngresosPromedios.isVisible();
			this.isVisibilidadCeldaEliminarIngresosPromedios=this.jInternalFrameDetalleFormIngresosPromedios.jButtonEliminarToolBarIngresosPromedios.isVisible();
			this.isVisibilidadCeldaCancelarIngresosPromedios=this.jInternalFrameDetalleFormIngresosPromedios.jButtonCancelarToolBarIngresosPromedios.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarIngresosPromedios=this.jButtonGuardarCambiosToolBarIngresosPromedios.isVisible();
			this.isVisibilidadCeldaGuardarCambiosIngresosPromedios=this.jButtonGuardarCambiosTablaToolBarIngresosPromedios.isVisible();						
			
			//TOOLBAR
			
			//MENUS
			
			this.isVisibilidadCeldaNuevoIngresosPromedios=this.jMenuItemNuevoIngresosPromedios.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesIngresosPromedios=this.jMenuItemNuevoRelacionesIngresosPromedios.isVisible();
			
			if(this.jInternalFrameDetalleFormIngresosPromedios!=null) {
			this.isVisibilidadCeldaModificarIngresosPromedios=this.jInternalFrameDetalleFormIngresosPromedios.jMenuItemModificarIngresosPromedios.isVisible();
			this.isVisibilidadCeldaActualizarIngresosPromedios=this.jInternalFrameDetalleFormIngresosPromedios.jMenuItemActualizarIngresosPromedios.isVisible();
			this.isVisibilidadCeldaEliminarIngresosPromedios=this.jInternalFrameDetalleFormIngresosPromedios.jMenuItemEliminarIngresosPromedios.isVisible();
			this.isVisibilidadCeldaCancelarIngresosPromedios=this.jInternalFrameDetalleFormIngresosPromedios.jMenuItemCancelarIngresosPromedios.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarIngresosPromedios=this.jMenuItemGuardarCambiosIngresosPromedios.isVisible();
			this.isVisibilidadCeldaGuardarCambiosIngresosPromedios=this.jMenuItemGuardarCambiosTablaIngresosPromedios.isVisible();						
			
			//MENUS
		}
	}
	
	public void inicializarActualizarBindingBotonesIngresosPromedios(Boolean esInicializar) {
		if(IngresosPromediosJInternalFrame.ISBINDING_MANUAL) {			
			if(this.ingresospromediosSessionBean.getConGuardarRelaciones()) {
				//if(this.ingresospromediosSessionBean.getEsGuardarRelacionado()) {
				
				this.actualizarEstadoCeldasBotonesConGuardarRelacionesIngresosPromedios();
			}
			
			this.inicializarActualizarBindingBotonesManualIngresosPromedios(true);
			
		} else {	
		}
	}		
	
	public void inicializarActualizarBindingBotonesPermisosManualIngresosPromedios() {
		this.jButtonNuevoIngresosPromedios.setVisible(this.isPermisoNuevoIngresosPromedios);			
		this.jButtonDuplicarIngresosPromedios.setVisible(this.isPermisoDuplicarIngresosPromedios);			
		this.jButtonCopiarIngresosPromedios.setVisible(this.isPermisoCopiarIngresosPromedios);			
		this.jButtonVerFormIngresosPromedios.setVisible(this.isPermisoVerFormIngresosPromedios);			
		
		this.jButtonAbrirOrderByIngresosPromedios.setVisible(this.isPermisoOrdenIngresosPromedios);					
		
		this.jButtonNuevoRelacionesIngresosPromedios.setVisible(this.isPermisoNuevoIngresosPromedios);			
		
		if(this.jInternalFrameDetalleFormIngresosPromedios!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormIngresosPromedios.jButtonModificarIngresosPromedios.setVisible(this.isPermisoActualizarIngresosPromedios);	
			this.jInternalFrameDetalleFormIngresosPromedios.jButtonActualizarIngresosPromedios.setVisible(this.isPermisoActualizarIngresosPromedios);	
			this.jInternalFrameDetalleFormIngresosPromedios.jButtonEliminarIngresosPromedios.setVisible(this.isPermisoEliminarIngresosPromedios);
			this.jInternalFrameDetalleFormIngresosPromedios.jButtonCancelarIngresosPromedios.setVisible(this.isVisibilidadCeldaCancelarIngresosPromedios);						
			this.jInternalFrameDetalleFormIngresosPromedios.jButtonGuardarCambiosIngresosPromedios.setVisible(this.isPermisoGuardarCambiosIngresosPromedios);							
		}
		
		this.jButtonGuardarCambiosTablaIngresosPromedios.setVisible(this.isPermisoActualizarIngresosPromedios);
	}
	
	public void inicializarActualizarBindingBotonesPermisosManualFormDetalleIngresosPromedios() {
		this.jInternalFrameDetalleFormIngresosPromedios.jButtonModificarIngresosPromedios.setVisible(this.isPermisoActualizarIngresosPromedios);	
		this.jInternalFrameDetalleFormIngresosPromedios.jButtonActualizarIngresosPromedios.setVisible(this.isPermisoActualizarIngresosPromedios);	
		this.jInternalFrameDetalleFormIngresosPromedios.jButtonEliminarIngresosPromedios.setVisible(this.isPermisoEliminarIngresosPromedios);
		this.jInternalFrameDetalleFormIngresosPromedios.jButtonCancelarIngresosPromedios.setVisible(this.isVisibilidadCeldaCancelarIngresosPromedios);							
		this.jInternalFrameDetalleFormIngresosPromedios.jButtonGuardarCambiosIngresosPromedios.setVisible((this.isVisibilidadCeldaGuardarIngresosPromedios && this.isPermisoGuardarCambiosIngresosPromedios));			
	}
	
	public void inicializarActualizarBindingBotonesPermisosIngresosPromedios() {
		if(IngresosPromediosJInternalFrame.ISBINDING_MANUAL) {
			this.inicializarActualizarBindingBotonesPermisosManualIngresosPromedios();
		} else {
		}
	}
	
	
	public void refrescarBindingBotonesIngresosPromedios() {
	}
	
	public void jTableDatosIngresosPromediosListSelectionListener(javax.swing.event.ListSelectionEvent evt) throws Exception { 
		try {
			this.seleccionarIngresosPromedios(null,evt,-1);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,IngresosPromediosConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonidIngresosPromediosBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.ingresospromediosLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosIngresosPromedios.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualIngresosPromedios(this.getingresospromedios(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysIngresosPromedios(this.ingresospromedios);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.ingresospromedios =(IngresosPromedios) this.ingresospromediosLogic.getIngresosPromedioss().toArray()[this.jTableDatosIngresosPromedios.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.ingresospromedios =(IngresosPromedios) this.ingresospromedioss.toArray()[this.jTableDatosIngresosPromedios.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.ingresospromedios==null) {
						this.ingresospromedios = new IngresosPromedios();
					}

					this.setVariablesFormularioToObjetoActualIngresosPromedios(this.ingresospromedios,true);
					this.setVariablesFormularioToObjetoActualForeignKeysIngresosPromedios(this.ingresospromedios);
				}

				if(this.ingresospromedios.getId()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id = "+this.ingresospromedios.getId().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingIngresosPromedios(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.ingresospromediosLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.ingresospromediosLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,IngresosPromediosConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.ingresospromediosLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_estructuraIngresosPromediosUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.ingresospromediosLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisoestructura=true;

			idTienePermisoestructura=this.tienePermisosUsuarioEnPaginaWebIngresosPromedios(EstructuraConstantesFunciones.CLASSNAME);

			if(idTienePermisoestructura) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosIngresosPromedios.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosIngresosPromedios.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosIngresosPromedios.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.ingresospromedios =(IngresosPromedios) this.ingresospromediosLogic.getIngresosPromedioss().toArray()[this.jTableDatosIngresosPromedios.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.ingresospromedios =(IngresosPromedios) this.ingresospromedioss.toArray()[this.jTableDatosIngresosPromedios.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualIngresosPromedios(this.getingresospromedios(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysIngresosPromedios(this.ingresospromedios);

				this.estructuraBeanSwingJInternalFrame=new EstructuraBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.estructuraBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.estructuraBeanSwingJInternalFrame.getEstructuraLogic().setConnexion(this.ingresospromediosLogic.getConnexion());

				if(this.ingresospromedios.getid_estructura()!=null) {
					this.estructuraBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.estructuraBeanSwingJInternalFrame.setIdActual(this.ingresospromedios.getid_estructura());
					this.estructuraBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.estructuraBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.estructuraBeanSwingJInternalFrame.inicializarActualizarBindingTablaEstructura();
				}

				JInternalFrameBase jinternalFrame =this.estructuraBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderIngresosPromedios=(TitledBorder)this.jScrollPanelDatosIngresosPromedios.getBorder();
				TitledBorder titledBorderestructura=(TitledBorder)this.estructuraBeanSwingJInternalFrame.jScrollPanelDatosEstructura.getBorder();

				titledBorderestructura.setTitle(titledBorderIngresosPromedios.getTitle() + " -> Estructura");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.ingresospromediosLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.ingresospromediosLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,IngresosPromediosConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.ingresospromediosLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_estructuraIngresosPromediosBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.ingresospromediosLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosIngresosPromedios.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualIngresosPromedios(this.getingresospromedios(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysIngresosPromedios(this.ingresospromedios);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.ingresospromedios =(IngresosPromedios) this.ingresospromediosLogic.getIngresosPromedioss().toArray()[this.jTableDatosIngresosPromedios.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.ingresospromedios =(IngresosPromedios) this.ingresospromedioss.toArray()[this.jTableDatosIngresosPromedios.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.ingresospromedios==null) {
						this.ingresospromedios = new IngresosPromedios();
					}

					this.setVariablesFormularioToObjetoActualIngresosPromedios(this.ingresospromedios,true);
					this.setVariablesFormularioToObjetoActualForeignKeysIngresosPromedios(this.ingresospromedios);
				}

				if(this.ingresospromedios.getid_estructura()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_estructura = "+this.ingresospromedios.getid_estructura().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingIngresosPromedios(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.ingresospromediosLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.ingresospromediosLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,IngresosPromediosConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.ingresospromediosLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtoncodigoIngresosPromediosBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.ingresospromediosLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosIngresosPromedios.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualIngresosPromedios(this.getingresospromedios(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysIngresosPromedios(this.ingresospromedios);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.ingresospromedios =(IngresosPromedios) this.ingresospromediosLogic.getIngresosPromedioss().toArray()[this.jTableDatosIngresosPromedios.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.ingresospromedios =(IngresosPromedios) this.ingresospromedioss.toArray()[this.jTableDatosIngresosPromedios.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.ingresospromedios==null) {
						this.ingresospromedios = new IngresosPromedios();
					}

					this.setVariablesFormularioToObjetoActualIngresosPromedios(this.ingresospromedios,true);
					this.setVariablesFormularioToObjetoActualForeignKeysIngresosPromedios(this.ingresospromedios);
				}

				if(this.ingresospromedios.getcodigo()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where codigo like '%"+this.ingresospromedios.getcodigo()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingIngresosPromedios(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.ingresospromediosLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.ingresospromediosLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,IngresosPromediosConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.ingresospromediosLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_empresaIngresosPromediosUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.ingresospromediosLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisoempresa=true;

			idTienePermisoempresa=this.tienePermisosUsuarioEnPaginaWebIngresosPromedios(EmpresaConstantesFunciones.CLASSNAME);

			if(idTienePermisoempresa) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosIngresosPromedios.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosIngresosPromedios.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosIngresosPromedios.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.ingresospromedios =(IngresosPromedios) this.ingresospromediosLogic.getIngresosPromedioss().toArray()[this.jTableDatosIngresosPromedios.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.ingresospromedios =(IngresosPromedios) this.ingresospromedioss.toArray()[this.jTableDatosIngresosPromedios.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualIngresosPromedios(this.getingresospromedios(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysIngresosPromedios(this.ingresospromedios);

				this.empresaBeanSwingJInternalFrame=new EmpresaBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.empresaBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.empresaBeanSwingJInternalFrame.getEmpresaLogic().setConnexion(this.ingresospromediosLogic.getConnexion());

				if(this.ingresospromedios.getid_empresa()!=null) {
					this.empresaBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.empresaBeanSwingJInternalFrame.setIdActual(this.ingresospromedios.getid_empresa());
					this.empresaBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.empresaBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.empresaBeanSwingJInternalFrame.inicializarActualizarBindingTablaEmpresa();
				}

				JInternalFrameBase jinternalFrame =this.empresaBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderIngresosPromedios=(TitledBorder)this.jScrollPanelDatosIngresosPromedios.getBorder();
				TitledBorder titledBorderempresa=(TitledBorder)this.empresaBeanSwingJInternalFrame.jScrollPanelDatosEmpresa.getBorder();

				titledBorderempresa.setTitle(titledBorderIngresosPromedios.getTitle() + " -> Empresa");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.ingresospromediosLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.ingresospromediosLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,IngresosPromediosConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.ingresospromediosLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_empresaIngresosPromediosBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.ingresospromediosLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosIngresosPromedios.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualIngresosPromedios(this.getingresospromedios(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysIngresosPromedios(this.ingresospromedios);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.ingresospromedios =(IngresosPromedios) this.ingresospromediosLogic.getIngresosPromedioss().toArray()[this.jTableDatosIngresosPromedios.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.ingresospromedios =(IngresosPromedios) this.ingresospromedioss.toArray()[this.jTableDatosIngresosPromedios.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.ingresospromedios==null) {
						this.ingresospromedios = new IngresosPromedios();
					}

					this.setVariablesFormularioToObjetoActualIngresosPromedios(this.ingresospromedios,true);
					this.setVariablesFormularioToObjetoActualForeignKeysIngresosPromedios(this.ingresospromedios);
				}

				if(this.ingresospromedios.getid_empresa()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_empresa = "+this.ingresospromedios.getid_empresa().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingIngresosPromedios(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.ingresospromediosLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.ingresospromediosLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,IngresosPromediosConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.ingresospromediosLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_anioIngresosPromediosUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.ingresospromediosLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisoanio=true;

			idTienePermisoanio=this.tienePermisosUsuarioEnPaginaWebIngresosPromedios(AnioConstantesFunciones.CLASSNAME);

			if(idTienePermisoanio) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosIngresosPromedios.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosIngresosPromedios.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosIngresosPromedios.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.ingresospromedios =(IngresosPromedios) this.ingresospromediosLogic.getIngresosPromedioss().toArray()[this.jTableDatosIngresosPromedios.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.ingresospromedios =(IngresosPromedios) this.ingresospromedioss.toArray()[this.jTableDatosIngresosPromedios.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualIngresosPromedios(this.getingresospromedios(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysIngresosPromedios(this.ingresospromedios);

				this.anioBeanSwingJInternalFrame=new AnioBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.anioBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.anioBeanSwingJInternalFrame.getAnioLogic().setConnexion(this.ingresospromediosLogic.getConnexion());

				if(this.ingresospromedios.getid_anio()!=null) {
					this.anioBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.anioBeanSwingJInternalFrame.setIdActual(this.ingresospromedios.getid_anio());
					this.anioBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.anioBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.anioBeanSwingJInternalFrame.inicializarActualizarBindingTablaAnio();
				}

				JInternalFrameBase jinternalFrame =this.anioBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderIngresosPromedios=(TitledBorder)this.jScrollPanelDatosIngresosPromedios.getBorder();
				TitledBorder titledBorderanio=(TitledBorder)this.anioBeanSwingJInternalFrame.jScrollPanelDatosAnio.getBorder();

				titledBorderanio.setTitle(titledBorderIngresosPromedios.getTitle() + " -> Anio");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.ingresospromediosLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.ingresospromediosLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,IngresosPromediosConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.ingresospromediosLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_anioIngresosPromediosBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.ingresospromediosLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosIngresosPromedios.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualIngresosPromedios(this.getingresospromedios(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysIngresosPromedios(this.ingresospromedios);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.ingresospromedios =(IngresosPromedios) this.ingresospromediosLogic.getIngresosPromedioss().toArray()[this.jTableDatosIngresosPromedios.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.ingresospromedios =(IngresosPromedios) this.ingresospromedioss.toArray()[this.jTableDatosIngresosPromedios.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.ingresospromedios==null) {
						this.ingresospromedios = new IngresosPromedios();
					}

					this.setVariablesFormularioToObjetoActualIngresosPromedios(this.ingresospromedios,true);
					this.setVariablesFormularioToObjetoActualForeignKeysIngresosPromedios(this.ingresospromedios);
				}

				if(this.ingresospromedios.getid_anio()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_anio = "+this.ingresospromedios.getid_anio().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingIngresosPromedios(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.ingresospromediosLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.ingresospromediosLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,IngresosPromediosConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.ingresospromediosLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_mesIngresosPromediosUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.ingresospromediosLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisomes=true;

			idTienePermisomes=this.tienePermisosUsuarioEnPaginaWebIngresosPromedios(MesConstantesFunciones.CLASSNAME);

			if(idTienePermisomes) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosIngresosPromedios.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosIngresosPromedios.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosIngresosPromedios.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.ingresospromedios =(IngresosPromedios) this.ingresospromediosLogic.getIngresosPromedioss().toArray()[this.jTableDatosIngresosPromedios.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.ingresospromedios =(IngresosPromedios) this.ingresospromedioss.toArray()[this.jTableDatosIngresosPromedios.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualIngresosPromedios(this.getingresospromedios(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysIngresosPromedios(this.ingresospromedios);

				this.mesBeanSwingJInternalFrame=new MesBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.mesBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.mesBeanSwingJInternalFrame.getMesLogic().setConnexion(this.ingresospromediosLogic.getConnexion());

				if(this.ingresospromedios.getid_mes()!=null) {
					this.mesBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.mesBeanSwingJInternalFrame.setIdActual(this.ingresospromedios.getid_mes());
					this.mesBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.mesBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.mesBeanSwingJInternalFrame.inicializarActualizarBindingTablaMes();
				}

				JInternalFrameBase jinternalFrame =this.mesBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderIngresosPromedios=(TitledBorder)this.jScrollPanelDatosIngresosPromedios.getBorder();
				TitledBorder titledBordermes=(TitledBorder)this.mesBeanSwingJInternalFrame.jScrollPanelDatosMes.getBorder();

				titledBordermes.setTitle(titledBorderIngresosPromedios.getTitle() + " -> Mes");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.ingresospromediosLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.ingresospromediosLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,IngresosPromediosConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.ingresospromediosLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_mesIngresosPromediosBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.ingresospromediosLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosIngresosPromedios.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualIngresosPromedios(this.getingresospromedios(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysIngresosPromedios(this.ingresospromedios);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.ingresospromedios =(IngresosPromedios) this.ingresospromediosLogic.getIngresosPromedioss().toArray()[this.jTableDatosIngresosPromedios.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.ingresospromedios =(IngresosPromedios) this.ingresospromedioss.toArray()[this.jTableDatosIngresosPromedios.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.ingresospromedios==null) {
						this.ingresospromedios = new IngresosPromedios();
					}

					this.setVariablesFormularioToObjetoActualIngresosPromedios(this.ingresospromedios,true);
					this.setVariablesFormularioToObjetoActualForeignKeysIngresosPromedios(this.ingresospromedios);
				}

				if(this.ingresospromedios.getid_mes()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_mes = "+this.ingresospromedios.getid_mes().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingIngresosPromedios(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.ingresospromediosLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.ingresospromediosLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,IngresosPromediosConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.ingresospromediosLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtoncodigo_cargoIngresosPromediosBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.ingresospromediosLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosIngresosPromedios.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualIngresosPromedios(this.getingresospromedios(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysIngresosPromedios(this.ingresospromedios);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.ingresospromedios =(IngresosPromedios) this.ingresospromediosLogic.getIngresosPromedioss().toArray()[this.jTableDatosIngresosPromedios.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.ingresospromedios =(IngresosPromedios) this.ingresospromedioss.toArray()[this.jTableDatosIngresosPromedios.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.ingresospromedios==null) {
						this.ingresospromedios = new IngresosPromedios();
					}

					this.setVariablesFormularioToObjetoActualIngresosPromedios(this.ingresospromedios,true);
					this.setVariablesFormularioToObjetoActualForeignKeysIngresosPromedios(this.ingresospromedios);
				}

				if(this.ingresospromedios.getcodigo_cargo()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where codigo_cargo like '%"+this.ingresospromedios.getcodigo_cargo()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingIngresosPromedios(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.ingresospromediosLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.ingresospromediosLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,IngresosPromediosConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.ingresospromediosLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtoncodigo_datoIngresosPromediosBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.ingresospromediosLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosIngresosPromedios.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualIngresosPromedios(this.getingresospromedios(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysIngresosPromedios(this.ingresospromedios);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.ingresospromedios =(IngresosPromedios) this.ingresospromediosLogic.getIngresosPromedioss().toArray()[this.jTableDatosIngresosPromedios.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.ingresospromedios =(IngresosPromedios) this.ingresospromedioss.toArray()[this.jTableDatosIngresosPromedios.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.ingresospromedios==null) {
						this.ingresospromedios = new IngresosPromedios();
					}

					this.setVariablesFormularioToObjetoActualIngresosPromedios(this.ingresospromedios,true);
					this.setVariablesFormularioToObjetoActualForeignKeysIngresosPromedios(this.ingresospromedios);
				}

				if(this.ingresospromedios.getcodigo_dato()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where codigo_dato like '%"+this.ingresospromedios.getcodigo_dato()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingIngresosPromedios(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.ingresospromediosLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.ingresospromediosLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,IngresosPromediosConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.ingresospromediosLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonnombreIngresosPromediosBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.ingresospromediosLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosIngresosPromedios.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualIngresosPromedios(this.getingresospromedios(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysIngresosPromedios(this.ingresospromedios);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.ingresospromedios =(IngresosPromedios) this.ingresospromediosLogic.getIngresosPromedioss().toArray()[this.jTableDatosIngresosPromedios.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.ingresospromedios =(IngresosPromedios) this.ingresospromedioss.toArray()[this.jTableDatosIngresosPromedios.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.ingresospromedios==null) {
						this.ingresospromedios = new IngresosPromedios();
					}

					this.setVariablesFormularioToObjetoActualIngresosPromedios(this.ingresospromedios,true);
					this.setVariablesFormularioToObjetoActualForeignKeysIngresosPromedios(this.ingresospromedios);
				}

				if(this.ingresospromedios.getnombre()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where nombre like '%"+this.ingresospromedios.getnombre()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingIngresosPromedios(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.ingresospromediosLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.ingresospromediosLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,IngresosPromediosConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.ingresospromediosLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonvalor_pagoIngresosPromediosBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.ingresospromediosLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosIngresosPromedios.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualIngresosPromedios(this.getingresospromedios(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysIngresosPromedios(this.ingresospromedios);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.ingresospromedios =(IngresosPromedios) this.ingresospromediosLogic.getIngresosPromedioss().toArray()[this.jTableDatosIngresosPromedios.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.ingresospromedios =(IngresosPromedios) this.ingresospromedioss.toArray()[this.jTableDatosIngresosPromedios.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.ingresospromedios==null) {
						this.ingresospromedios = new IngresosPromedios();
					}

					this.setVariablesFormularioToObjetoActualIngresosPromedios(this.ingresospromedios,true);
					this.setVariablesFormularioToObjetoActualForeignKeysIngresosPromedios(this.ingresospromedios);
				}

				if(this.ingresospromedios.getvalor_pago()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where valor_pago = "+this.ingresospromedios.getvalor_pago().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingIngresosPromedios(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.ingresospromediosLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.ingresospromediosLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,IngresosPromediosConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.ingresospromediosLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonnombre_rubro_empleaIngresosPromediosBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.ingresospromediosLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosIngresosPromedios.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualIngresosPromedios(this.getingresospromedios(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysIngresosPromedios(this.ingresospromedios);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.ingresospromedios =(IngresosPromedios) this.ingresospromediosLogic.getIngresosPromedioss().toArray()[this.jTableDatosIngresosPromedios.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.ingresospromedios =(IngresosPromedios) this.ingresospromedioss.toArray()[this.jTableDatosIngresosPromedios.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.ingresospromedios==null) {
						this.ingresospromedios = new IngresosPromedios();
					}

					this.setVariablesFormularioToObjetoActualIngresosPromedios(this.ingresospromedios,true);
					this.setVariablesFormularioToObjetoActualForeignKeysIngresosPromedios(this.ingresospromedios);
				}

				if(this.ingresospromedios.getnombre_rubro_emplea()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where nombre_rubro_emplea like '%"+this.ingresospromedios.getnombre_rubro_emplea()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingIngresosPromedios(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.ingresospromediosLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.ingresospromediosLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,IngresosPromediosConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.ingresospromediosLogic.closeNewConnexionToDeep();
				}

			}
		}

	
	
	public void jButtonBusquedaIngresosPromediosIngresosPromediosActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.ingresospromediosLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingIngresosPromedios(false,false);

			this.getIngresosPromediossBusquedaIngresosPromedios();

			this.inicializarActualizarBindingIngresosPromedios(false);

			//if(IngresosPromediosBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingIngresosPromedios(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.ingresospromediosLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.ingresospromediosLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,IngresosPromediosConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.ingresospromediosLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdAnioIngresosPromediosActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.ingresospromediosLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingIngresosPromedios(false,false);

			this.getIngresosPromediossFK_IdAnio();

			this.inicializarActualizarBindingIngresosPromedios(false);

			//if(IngresosPromediosBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingIngresosPromedios(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.ingresospromediosLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.ingresospromediosLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,IngresosPromediosConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.ingresospromediosLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdEmpresaIngresosPromediosActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.ingresospromediosLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingIngresosPromedios(false,false);

			this.getIngresosPromediossFK_IdEmpresa();

			this.inicializarActualizarBindingIngresosPromedios(false);

			//if(IngresosPromediosBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingIngresosPromedios(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.ingresospromediosLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.ingresospromediosLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,IngresosPromediosConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.ingresospromediosLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdEstructuraIngresosPromediosActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.ingresospromediosLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingIngresosPromedios(false,false);

			this.getIngresosPromediossFK_IdEstructura();

			this.inicializarActualizarBindingIngresosPromedios(false);

			//if(IngresosPromediosBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingIngresosPromedios(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.ingresospromediosLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.ingresospromediosLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,IngresosPromediosConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.ingresospromediosLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdMesIngresosPromediosActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.ingresospromediosLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingIngresosPromedios(false,false);

			this.getIngresosPromediossFK_IdMes();

			this.inicializarActualizarBindingIngresosPromedios(false);

			//if(IngresosPromediosBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingIngresosPromedios(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.ingresospromediosLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.ingresospromediosLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,IngresosPromediosConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.ingresospromediosLogic.closeNewConnexionToDeep();
			}
		}
	}

	
	public void closingInternalFrameIngresosPromedios() {
		if(this.jInternalFrameDetalleFormIngresosPromedios!=null) {
			
		
		
		}
		
		if(this.jInternalFrameDetalleFormIngresosPromedios!=null) {
			this.jInternalFrameDetalleFormIngresosPromedios.setVisible(false);	    			
			this.jInternalFrameDetalleFormIngresosPromedios.dispose();
			this.jInternalFrameDetalleFormIngresosPromedios=null;
		}
		
		
		if(this.jInternalFrameReporteDinamicoIngresosPromedios!=null) {
			this.jInternalFrameReporteDinamicoIngresosPromedios.setVisible(false);	    			
			this.jInternalFrameReporteDinamicoIngresosPromedios.dispose();
			this.jInternalFrameReporteDinamicoIngresosPromedios=null;
		}
		
		if(this.jInternalFrameImportacionIngresosPromedios!=null) {
			this.jInternalFrameImportacionIngresosPromedios.setVisible(false);	    			
			this.jInternalFrameImportacionIngresosPromedios.dispose();
			this.jInternalFrameImportacionIngresosPromedios=null;
		}		
		
		
		this.setVisible(false);
		this.dispose();
		//this=null;
	}
	
	
	
	public void jButtonActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {			
			this.startProcessIngresosPromedios();
			
			IngresosPromediosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.ingresospromedios,new Object(),this.ingresospromediosParameterGeneral,this.ingresospromediosReturnGeneral);
			
			
			if(sTipo.equals("NuevoIngresosPromedios")) {
				jButtonNuevoIngresosPromediosActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarIngresosPromedios")) {
				jButtonDuplicarIngresosPromediosActionPerformed(evt,false);
			} else if(sTipo.equals("CopiarIngresosPromedios")) {
				jButtonCopiarIngresosPromediosActionPerformed(evt);
			} else if(sTipo.equals("VerFormIngresosPromedios")) {
				jButtonVerFormIngresosPromediosActionPerformed(evt);
			} else if(sTipo.equals("NuevoToolBarIngresosPromedios")) {
				jButtonNuevoIngresosPromediosActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarToolBarIngresosPromedios")) {
				jButtonDuplicarIngresosPromediosActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemNuevoIngresosPromedios")) {
				jButtonNuevoIngresosPromediosActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemDuplicarIngresosPromedios")) {
				jButtonDuplicarIngresosPromediosActionPerformed(evt,false);
			} else if(sTipo.equals("NuevoRelacionesIngresosPromedios")) {
				jButtonNuevoIngresosPromediosActionPerformed(evt,true);
			} else if(sTipo.equals("NuevoRelacionesToolBarIngresosPromedios")) {
				jButtonNuevoIngresosPromediosActionPerformed(evt,true);
			} else if(sTipo.equals("MenuItemNuevoRelacionesIngresosPromedios")) {
				jButtonNuevoIngresosPromediosActionPerformed(evt,true);
			} else if(sTipo.equals("ModificarIngresosPromedios")) {
				jButtonModificarIngresosPromediosActionPerformed(evt);
			} else if(sTipo.equals("ModificarToolBarIngresosPromedios")) {
				jButtonModificarIngresosPromediosActionPerformed(evt);
			} else if(sTipo.equals("MenuItemModificarIngresosPromedios")) {
				jButtonModificarIngresosPromediosActionPerformed(evt);
			} else if(sTipo.equals("ActualizarIngresosPromedios")) {
				jButtonActualizarIngresosPromediosActionPerformed(evt);
			} else if(sTipo.equals("ActualizarToolBarIngresosPromedios")) {
				jButtonActualizarIngresosPromediosActionPerformed(evt);
			} else if(sTipo.equals("MenuItemActualizarIngresosPromedios")) {
				jButtonActualizarIngresosPromediosActionPerformed(evt);
			} else if(sTipo.equals("EliminarIngresosPromedios")) {
				jButtonEliminarIngresosPromediosActionPerformed(evt);
			} else if(sTipo.equals("EliminarToolBarIngresosPromedios")) {
				jButtonEliminarIngresosPromediosActionPerformed(evt);
			} else if(sTipo.equals("MenuItemEliminarIngresosPromedios")) {
				jButtonEliminarIngresosPromediosActionPerformed(evt);
			} else if(sTipo.equals("CancelarIngresosPromedios")) {
				jButtonCancelarIngresosPromediosActionPerformed(evt);
			} else if(sTipo.equals("CancelarToolBarIngresosPromedios")) {
				jButtonCancelarIngresosPromediosActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCancelarIngresosPromedios")) {
				jButtonCancelarIngresosPromediosActionPerformed(evt);
			} else if(sTipo.equals("CerrarIngresosPromedios")) {
				jButtonCerrarIngresosPromediosActionPerformed(evt);
			} else if(sTipo.equals("CerrarToolBarIngresosPromedios")) {
				jButtonCerrarIngresosPromediosActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCerrarIngresosPromedios")) {
				jButtonCerrarIngresosPromediosActionPerformed(evt);
			} else if(sTipo.equals("MostrarOcultarToolBarIngresosPromedios")) {
				jButtonMostrarOcultarIngresosPromediosActionPerformed(evt);
			} else if(sTipo.equals("MenuItemDetalleCerrarIngresosPromedios")) {
				jButtonCancelarIngresosPromediosActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosIngresosPromedios")) {
				jButtonGuardarCambiosIngresosPromediosActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosToolBarIngresosPromedios")) {
				jButtonGuardarCambiosIngresosPromediosActionPerformed(evt);
			} else if(sTipo.equals("CopiarToolBarIngresosPromedios")) {
				jButtonCopiarIngresosPromediosActionPerformed(evt);
			} else if(sTipo.equals("VerFormToolBarIngresosPromedios")) {
				jButtonVerFormIngresosPromediosActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosIngresosPromedios")) {
				jButtonGuardarCambiosIngresosPromediosActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCopiarIngresosPromedios")) {
				jButtonCopiarIngresosPromediosActionPerformed(evt);
			} else if(sTipo.equals("MenuItemVerFormIngresosPromedios")) {
				jButtonVerFormIngresosPromediosActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaIngresosPromedios")) {
				jButtonGuardarCambiosIngresosPromediosActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaToolBarIngresosPromedios")) {
				jButtonGuardarCambiosIngresosPromediosActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosTablaIngresosPromedios")) {
				jButtonGuardarCambiosIngresosPromediosActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionIngresosPromedios")) {
				jButtonRecargarInformacionIngresosPromediosActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionToolBarIngresosPromedios")) {
				jButtonRecargarInformacionIngresosPromediosActionPerformed(evt);
			} else if(sTipo.equals("MenuItemRecargarInformacionIngresosPromedios")) {
				jButtonRecargarInformacionIngresosPromediosActionPerformed(evt);
			}
			else if(sTipo.equals("AnterioresIngresosPromedios")) {
				jButtonAnterioresIngresosPromediosActionPerformed(evt);
			} else if(sTipo.equals("AnterioresToolBarIngresosPromedios")) {
				jButtonAnterioresIngresosPromediosActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAnterioreIngresosPromedios")) {
				jButtonAnterioresIngresosPromediosActionPerformed(evt);
			} else if(sTipo.equals("SiguientesIngresosPromedios")) {
				jButtonSiguientesIngresosPromediosActionPerformed(evt);
			} else if(sTipo.equals("SiguientesToolBarIngresosPromedios")) {
				jButtonSiguientesIngresosPromediosActionPerformed(evt);
			} else if(sTipo.equals("MenuItemSiguientesIngresosPromedios")) {
				jButtonSiguientesIngresosPromediosActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAbrirOrderByIngresosPromedios") || sTipo.equals("MenuItemDetalleAbrirOrderByIngresosPromedios")) {
				jButtonAbrirOrderByIngresosPromediosActionPerformed(evt);
			} else if(sTipo.equals("MenuItemMostrarOcultarIngresosPromedios") || sTipo.equals("MenuItemDetalleMostrarOcultarIngresosPromedios")) {
				jButtonMostrarOcultarIngresosPromediosActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosIngresosPromedios")) {
				jButtonNuevoGuardarCambiosIngresosPromediosActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosToolBarIngresosPromedios")) {
				jButtonNuevoGuardarCambiosIngresosPromediosActionPerformed(evt);
			} else if(sTipo.equals("MenuItemNuevoGuardarCambiosIngresosPromedios")) {
				jButtonNuevoGuardarCambiosIngresosPromediosActionPerformed(evt);
			} 
			else if(sTipo.equals("CerrarReporteDinamicoIngresosPromedios")) {
				jButtonCerrarReporteDinamicoIngresosPromediosActionPerformed(evt);
			} else if(sTipo.equals("GenerarReporteDinamicoIngresosPromedios")) {
				jButtonGenerarReporteDinamicoIngresosPromediosActionPerformed(evt);
			} else if(sTipo.equals("GenerarExcelReporteDinamicoIngresosPromedios")) {
				
				jButtonGenerarExcelReporteDinamicoIngresosPromediosActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarImportacionIngresosPromedios")) {
				jButtonCerrarImportacionIngresosPromediosActionPerformed(evt);
			} else if(sTipo.equals("GenerarImportacionIngresosPromedios")) {
				
				jButtonGenerarImportacionIngresosPromediosActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirImportacionIngresosPromedios")) {
				
				jButtonAbrirImportacionIngresosPromediosActionPerformed(evt);
				
			} else if(sTipo.equals("TiposAccionesIngresosPromedios")) {
				jComboBoxTiposAccionesIngresosPromediosActionListener(evt,false);
			} else if(sTipo.equals("TiposRelacionesIngresosPromedios")) {
				jComboBoxTiposRelacionesIngresosPromediosActionListener(evt);
			} else if(sTipo.equals("TiposAccionesFormularioIngresosPromedios")) {
				jComboBoxTiposAccionesIngresosPromediosActionListener(evt,true);
			} else if(sTipo.equals("TiposSeleccionarIngresosPromedios")) {
				
				jComboBoxTiposSeleccionarIngresosPromediosActionListener(evt);
				
			} else if(sTipo.equals("ValorCampoGeneralIngresosPromedios")) {
				jTextFieldValorCampoGeneralIngresosPromediosActionListener(evt);
			}
			
			
			else if(sTipo.equals("AbrirOrderByIngresosPromedios")) {
				jButtonAbrirOrderByIngresosPromediosActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirOrderByToolBarIngresosPromedios")) {
				jButtonAbrirOrderByIngresosPromediosActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarOrderByIngresosPromedios")) {
				jButtonCerrarOrderByIngresosPromediosActionPerformed(evt);
			} 
						
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idIngresosPromediosBusqueda")) {
				this.jButtonidIngresosPromediosBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_estructuraIngresosPromediosUpdate")) {
				this.jButtonid_estructuraIngresosPromediosUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_estructuraIngresosPromediosBusqueda")) {
				this.jButtonid_estructuraIngresosPromediosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("codigoIngresosPromediosBusqueda")) {
				this.jButtoncodigoIngresosPromediosBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_empresaIngresosPromediosUpdate")) {
				this.jButtonid_empresaIngresosPromediosUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_empresaIngresosPromediosBusqueda")) {
				this.jButtonid_empresaIngresosPromediosBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_anioIngresosPromediosUpdate")) {
				this.jButtonid_anioIngresosPromediosUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_anioIngresosPromediosBusqueda")) {
				this.jButtonid_anioIngresosPromediosBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_mesIngresosPromediosUpdate")) {
				this.jButtonid_mesIngresosPromediosUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_mesIngresosPromediosBusqueda")) {
				this.jButtonid_mesIngresosPromediosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("codigo_cargoIngresosPromediosBusqueda")) {
				this.jButtoncodigo_cargoIngresosPromediosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("codigo_datoIngresosPromediosBusqueda")) {
				this.jButtoncodigo_datoIngresosPromediosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombreIngresosPromediosBusqueda")) {
				this.jButtonnombreIngresosPromediosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("valor_pagoIngresosPromediosBusqueda")) {
				this.jButtonvalor_pagoIngresosPromediosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombre_rubro_empleaIngresosPromediosBusqueda")) {
				this.jButtonnombre_rubro_empleaIngresosPromediosBusquedaActionPerformed(evt);
			}
			
			
			
			
			else if(sTipo.equals("BusquedaIngresosPromediosIngresosPromedios")) {
				this.jButtonBusquedaIngresosPromediosIngresosPromediosActionPerformed(evt);
			}
			
			;
			
			
			IngresosPromediosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.ingresospromedios,new Object(),this.ingresospromediosParameterGeneral,this.ingresospromediosReturnGeneral);
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,IngresosPromediosConstantesFunciones.CLASSNAME);
			
  		} finally {
      		this.finishProcessIngresosPromedios();
      	}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaIngresosPromediosActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.ingresospromedios);
				
				this.actualizarInformacion("INFO_PADRE",false,this.ingresospromedios);
				
				IngresosPromediosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.ingresospromedios,new Object(),this.ingresospromediosParameterGeneral,this.ingresospromediosReturnGeneral);
				
				


				
				IngresosPromediosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.ingresospromedios,new Object(),this.ingresospromediosParameterGeneral,this.ingresospromediosReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(IngresosPromedios.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",IngresosPromedios.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
				}
				
			} catch(Exception e) {
  				FuncionesSwing.manageException2(this, e,logger,IngresosPromediosConstantesFunciones.CLASSNAME);
  			}
    }
	
	public Boolean existeCambioValor(ControlTipo controlTipo,String sTipo) throws Exception {
		Boolean existeCambio=true;
		
		try {
			IngresosPromedios ingresospromediosLocal=null;
			
			if(!this.getEsControlTabla()) {
				ingresospromediosLocal=this.ingresospromedios;
			} else {
				ingresospromediosLocal=this.ingresospromediosAnterior;
			}
			
			if(controlTipo.equals(ControlTipo.TEXTBOX)) {
				


			}
		
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,IngresosPromediosConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.ingresospromedios);
				
				this.actualizarInformacion("INFO_PADRE",false,this.ingresospromedios);
				
				IngresosPromediosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.ingresospromedios,new Object(),this.ingresospromediosParameterGeneral,this.ingresospromediosReturnGeneral);
							
				
				


				
				IngresosPromediosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.ingresospromedios,new Object(),this.ingresospromediosParameterGeneral,this.ingresospromediosReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(IngresosPromedios.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",IngresosPromedios.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,IngresosPromediosConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaIngresosPromediosActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosIngresosPromedios.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.ingresospromediosAnterior =(IngresosPromedios) this.ingresospromediosLogic.getIngresosPromedioss().toArray()[this.jTableDatosIngresosPromedios.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.ingresospromediosAnterior =(IngresosPromedios) this.ingresospromedioss.toArray()[this.jTableDatosIngresosPromedios.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,IngresosPromediosConstantesFunciones.CLASSNAME);
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
			
			IngresosPromediosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.ingresospromedios,new Object(),this.ingresospromediosParameterGeneral,this.ingresospromediosReturnGeneral);
			
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
			
			


			
			IngresosPromediosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.ingresospromedios,new Object(),this.ingresospromediosParameterGeneral,this.ingresospromediosReturnGeneral);
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,IngresosPromediosConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE QUITA ALGUN CARACTER
	public void jTextFieldRemoveUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,IngresosPromediosConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE INGRESA ALGUN CARACTER
	public void jTextFieldInsertUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,IngresosPromediosConstantesFunciones.CLASSNAME);
  		}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jFormattedTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaIngresosPromediosActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.ingresospromedios);
				
				this.actualizarInformacion("INFO_PADRE",false,this.ingresospromedios);
				
				IngresosPromediosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.ingresospromedios,new Object(),this.ingresospromediosParameterGeneral,this.ingresospromediosReturnGeneral);
								
						
				


				
				IngresosPromediosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.ingresospromedios,new Object(),this.ingresospromediosParameterGeneral,this.ingresospromediosReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(IngresosPromedios.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",IngresosPromedios.class.getName(),sTipo,"DATE",esControlTabla,conIrServidorAplicacionParent,
							id,JFormattedTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,IngresosPromediosConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.ingresospromedios);
				
				this.actualizarInformacion("INFO_PADRE",false,this.ingresospromedios);
				
				IngresosPromediosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.ingresospromedios,new Object(),this.ingresospromediosParameterGeneral,this.ingresospromediosReturnGeneral);
								
				
				


				
				IngresosPromediosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.ingresospromedios,new Object(),this.ingresospromediosParameterGeneral,this.ingresospromediosReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(IngresosPromedios.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",IngresosPromedios.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,IngresosPromediosConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jFormattedTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaIngresosPromediosActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosIngresosPromedios.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.ingresospromediosAnterior =(IngresosPromedios) this.ingresospromediosLogic.getIngresosPromedioss().toArray()[this.jTableDatosIngresosPromedios.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.ingresospromediosAnterior =(IngresosPromedios) this.ingresospromedioss.toArray()[this.jTableDatosIngresosPromedios.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,IngresosPromediosConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusLostGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl() && this.existeCambioValor(ControlTipo.DATE,sTipo)) {
				this.actualizarInformacion("EVENTO_CONTROL",false,this.ingresospromedios);
				
				this.actualizarInformacion("INFO_PADRE",false,this.ingresospromedios);
			}	
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,IngresosPromediosConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaIngresosPromediosActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosIngresosPromedios.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.ingresospromediosAnterior =(IngresosPromedios) this.ingresospromediosLogic.getIngresosPromedioss().toArray()[this.jTableDatosIngresosPromedios.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.ingresospromediosAnterior =(IngresosPromedios) this.ingresospromedioss.toArray()[this.jTableDatosIngresosPromedios.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,IngresosPromediosConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaIngresosPromediosActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.ingresospromedios);
			
			this.actualizarInformacion("INFO_PADRE",false,this.ingresospromedios);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,IngresosPromediosConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.ingresospromedios);
				
				this.actualizarInformacion("INFO_PADRE",false,this.ingresospromedios);
				
				IngresosPromediosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.ingresospromedios,new Object(),this.ingresospromediosParameterGeneral,this.ingresospromediosReturnGeneral);
							
				
				


				
				IngresosPromediosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.ingresospromedios,new Object(),this.ingresospromediosParameterGeneral,this.ingresospromediosReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(IngresosPromedios.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",IngresosPromedios.class.getName(),sTipo,"TEXTAREA",esControlTabla,conIrServidorAplicacionParent,
							id,jTextArea, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,IngresosPromediosConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaIngresosPromediosActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosIngresosPromedios.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.ingresospromediosAnterior =(IngresosPromedios) this.ingresospromediosLogic.getIngresosPromedioss().toArray()[this.jTableDatosIngresosPromedios.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.ingresospromediosAnterior =(IngresosPromedios) this.ingresospromedioss.toArray()[this.jTableDatosIngresosPromedios.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,IngresosPromediosConstantesFunciones.CLASSNAME);
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
			
			IngresosPromediosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.ingresospromedios,new Object(),this.ingresospromediosParameterGeneral,this.ingresospromediosReturnGeneral);
			
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
			
			


			
			IngresosPromediosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.ingresospromedios,new Object(),this.ingresospromediosParameterGeneral,this.ingresospromediosReturnGeneral);
			
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,IngresosPromediosConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaRemoveUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,IngresosPromediosConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaInsertUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,IngresosPromediosConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jTextAreaActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaIngresosPromediosActual();
			
			this.actualizarInformacion("EVENTO_CONTROL",false,this.ingresospromedios);
			
			this.actualizarInformacion("INFO_PADRE",false,this.ingresospromedios);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,IngresosPromediosConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.ingresospromedios);
				
				this.actualizarInformacion("INFO_PADRE",false,this.ingresospromedios);
				
				IngresosPromediosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.ingresospromedios,new Object(),this.ingresospromediosParameterGeneral,this.ingresospromediosReturnGeneral);
								
				
				


				
				IngresosPromediosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.ingresospromedios,new Object(),this.ingresospromediosParameterGeneral,this.ingresospromediosReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(IngresosPromedios.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",IngresosPromedios.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jLabel, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,IngresosPromediosConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jLabelFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaIngresosPromediosActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosIngresosPromedios.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.ingresospromediosAnterior =(IngresosPromedios) this.ingresospromediosLogic.getIngresosPromedioss().toArray()[this.jTableDatosIngresosPromedios.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.ingresospromediosAnterior =(IngresosPromedios) this.ingresospromedioss.toArray()[this.jTableDatosIngresosPromedios.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,IngresosPromediosConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jLabelActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaIngresosPromediosActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.ingresospromedios);
			
			this.actualizarInformacion("INFO_PADRE",false,this.ingresospromedios);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,IngresosPromediosConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxItemListenerGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaIngresosPromediosActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.ingresospromedios);
				
				this.actualizarInformacion("INFO_PADRE",false,this.ingresospromedios);
				
				IngresosPromediosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.ingresospromedios,new Object(),this.ingresospromediosParameterGeneral,this.ingresospromediosReturnGeneral);
												
				
				if(sTipo.equals("SeleccionarTodosIngresosPromedios")) {
					jCheckBoxSeleccionarTodosIngresosPromediosItemListener(evt);
				
				} else if(sTipo.equals("SeleccionadosIngresosPromedios")) {
					jCheckBoxSeleccionadosIngresosPromediosItemListener(evt);
				
				} else if(sTipo.equals("NuevoToolBarIngresosPromedios")) {
					
				}
				
				


				
				
				IngresosPromediosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.ingresospromedios,new Object(),this.ingresospromediosParameterGeneral,this.ingresospromediosReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(IngresosPromedios.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",IngresosPromedios.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,IngresosPromediosConstantesFunciones.CLASSNAME);
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
				
				//this.actualizarInformacion("EVENTO_CONTROL",false,this.ingresospromedios);
				
				//this.actualizarInformacion("INFO_PADRE",false,this.ingresospromedios);
				
				IngresosPromediosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.ingresospromedios,new Object(),this.ingresospromediosParameterGeneral,this.ingresospromediosReturnGeneral);
												
				
				


				
				
				IngresosPromediosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.ingresospromedios,new Object(),this.ingresospromediosParameterGeneral,this.ingresospromediosReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(IngresosPromedios.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",IngresosPromedios.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,IngresosPromediosConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaIngresosPromediosActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosIngresosPromedios.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.ingresospromediosAnterior =(IngresosPromedios) this.ingresospromediosLogic.getIngresosPromedioss().toArray()[this.jTableDatosIngresosPromedios.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.ingresospromediosAnterior =(IngresosPromedios) this.ingresospromedioss.toArray()[this.jTableDatosIngresosPromedios.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,IngresosPromediosConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaIngresosPromediosActual();
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.ingresospromedios);
				
				this.actualizarInformacion("INFO_PADRE",false,this.ingresospromedios);
				
				IngresosPromediosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.ingresospromedios,new Object(),this.ingresospromediosParameterGeneral,this.ingresospromediosReturnGeneral);
				
				
				IngresosPromediosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.ingresospromedios,new Object(),this.ingresospromediosParameterGeneral,this.ingresospromediosReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,IngresosPromediosConstantesFunciones.CLASSNAME);
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
			
			IngresosPromediosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.ingresospromedios,new Object(),this.ingresospromediosParameterGeneral,this.ingresospromediosReturnGeneral);
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
			
			


			
			IngresosPromediosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.ingresospromedios,new Object(),this.ingresospromediosParameterGeneral,this.ingresospromediosReturnGeneral);
			*/						
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,IngresosPromediosConstantesFunciones.CLASSNAME);
  		}		
    }
	
	@SuppressWarnings("rawtypes")
	public void jComboBoxItemStateChangedGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if (evt.getStateChange() == ItemEvent.SELECTED && this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaIngresosPromediosActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.ingresospromedios);
				
				this.actualizarInformacion("INFO_PADRE",false,this.ingresospromedios);
				
				IngresosPromediosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.ingresospromedios,new Object(),this.ingresospromediosParameterGeneral,this.ingresospromediosReturnGeneral);
				
				
				String sFinalQueryCombo="";
				
				


				
				IngresosPromediosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.ingresospromedios,new Object(),this.ingresospromediosParameterGeneral,this.ingresospromediosReturnGeneral);
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(IngresosPromedios.class.getName());
								
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",IngresosPromedios.class.getName(),sTipo,"COMBOBOX",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,IngresosPromediosConstantesFunciones.CLASSNAME);
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
			
				this.actualizarInformacion("EVENTO_CONTROL",false,this.ingresospromedios);
				
				this.actualizarInformacion("INFO_PADRE",false,this.ingresospromedios);
				
				IngresosPromediosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.ingresospromedios,new Object(),this.ingresospromediosParameterGeneral,this.ingresospromediosReturnGeneral);
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
				
				


				
				IngresosPromediosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.ingresospromedios,new Object(),this.ingresospromediosParameterGeneral,this.ingresospromediosReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(IngresosPromedios.class.getName());
				
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",IngresosPromedios.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,IngresosPromediosConstantesFunciones.CLASSNAME);
  		}
		
		*/
    }
	
	public void jComboBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaIngresosPromediosActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosIngresosPromedios.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.ingresospromediosAnterior =(IngresosPromedios) this.ingresospromediosLogic.getIngresosPromedioss().toArray()[this.jTableDatosIngresosPromedios.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.ingresospromediosAnterior =(IngresosPromedios) this.ingresospromedioss.toArray()[this.jTableDatosIngresosPromedios.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,IngresosPromediosConstantesFunciones.CLASSNAME);
  		}
    }		
	
	public void tableValueChangedGeneral(String sTipo,ListSelectionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				IngresosPromediosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.ingresospromedios,new Object(),this.ingresospromediosParameterGeneral,this.ingresospromediosReturnGeneral);
				
				if(sTipo.equals("TableDatosSeleccionarIngresosPromedios")) {
					//BYDAN_DESHABILITADO
					//try {jTableDatosIngresosPromediosListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
					
					//SOLO CUANDO MOUSE ES SOLTADO
					if (!evt.getValueIsAdjusting()) {
						//SELECCIONA FILA A OBJETO ACTUAL
						Integer intSelectedRow = this.jTableDatosIngresosPromedios.getSelectedRow();
						
						if(intSelectedRow!=null && intSelectedRow>-1) {
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								this.ingresospromedios =(IngresosPromedios) this.ingresospromediosLogic.getIngresosPromedioss().toArray()[this.jTableDatosIngresosPromedios.convertRowIndexToModel(intSelectedRow)];
							} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
								this.ingresospromedios =(IngresosPromedios) this.ingresospromedioss.toArray()[this.jTableDatosIngresosPromedios.convertRowIndexToModel(intSelectedRow)];
							}
							//ARCHITECTURE
							
							//System.out.println(this.ingresospromedios);
						}
					}
					
				} else if(sTipo.equals("jButtonCancelarIngresosPromedios")) {
				
				}
				
				IngresosPromediosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.ingresospromedios,new Object(),this.ingresospromediosParameterGeneral,this.ingresospromediosReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,IngresosPromediosConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void tableMouseAdapterGeneral(String sTipo,MouseEvent evt) { 	  
		try {
			IngresosPromediosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.ingresospromedios,new Object(),this.ingresospromediosParameterGeneral,this.ingresospromediosReturnGeneral);
			
			if(sTipo.equals("DatosSeleccionarIngresosPromedios")) {
				if (evt.getClickCount() == 2) {
					jButtonIdActionPerformed(null,jTableDatosIngresosPromedios.getSelectedRow(),false,false);
				}	
			} else if(sTipo.equals("jButtonCancelarIngresosPromedios")) {
			
			}
			
			IngresosPromediosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.ingresospromedios,new Object(),this.ingresospromediosParameterGeneral,this.ingresospromediosReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,IngresosPromediosConstantesFunciones.CLASSNAME);
  		}
    }
	
	;
	
	public void jButtonActionPerformedTecladoGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			this.startProcessIngresosPromedios();
			
			IngresosPromediosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.ingresospromedios,new Object(),this.ingresospromediosParameterGeneral,this.ingresospromediosReturnGeneral);
			
			if(sTipo.equals("NuevoIngresosPromedios")) {
				jButtonNuevoIngresosPromediosActionPerformed(evt,false);
				
			} else if(sTipo.equals("DuplicarIngresosPromedios")) {
				jButtonDuplicarIngresosPromediosActionPerformed(evt,false);
				
			} else if(sTipo.equals("CopiarIngresosPromedios")) {
				jButtonCopiarIngresosPromediosActionPerformed(evt);
				
			} else if(sTipo.equals("VerFormIngresosPromedios")) {
				jButtonVerFormIngresosPromediosActionPerformed(evt);
				
			} else if(sTipo.equals("NuevoRelacionesIngresosPromedios")) {
				jButtonNuevoIngresosPromediosActionPerformed(evt,true);
				
			} else if(sTipo.equals("ModificarIngresosPromedios")) {
				jButtonModificarIngresosPromediosActionPerformed(evt);
				
			} else if(sTipo.equals("ActualizarIngresosPromedios")) {
				jButtonActualizarIngresosPromediosActionPerformed(evt);
				
			} else if(sTipo.equals("EliminarIngresosPromedios")) {
				jButtonEliminarIngresosPromediosActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosTablaIngresosPromedios")) {
				jButtonGuardarCambiosIngresosPromediosActionPerformed(evt);
				
			} else if(sTipo.equals("CancelarIngresosPromedios")) {
				jButtonCancelarIngresosPromediosActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarIngresosPromedios")) {
				jButtonCerrarIngresosPromediosActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosIngresosPromedios")) {
				jButtonGuardarCambiosIngresosPromediosActionPerformed(evt);
			
			} else if(sTipo.equals("NuevoGuardarCambiosIngresosPromedios")) {
				jButtonNuevoGuardarCambiosIngresosPromediosActionPerformed(evt);
			
			} else if(sTipo.equals("AbrirOrderByIngresosPromedios")) {
				jButtonAbrirOrderByIngresosPromediosActionPerformed(evt);
			
			} else if(sTipo.equals("RecargarInformacionIngresosPromedios")) {
				jButtonRecargarInformacionIngresosPromediosActionPerformed(evt);
			
			} else if(sTipo.equals("AnterioresIngresosPromedios")) {
				jButtonAnterioresIngresosPromediosActionPerformed(evt);			
			
			}  else if(sTipo.equals("SiguientesIngresosPromedios")) {
				jButtonSiguientesIngresosPromediosActionPerformed(evt);			
			} 
			
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idIngresosPromediosBusqueda")) {
				this.jButtonidIngresosPromediosBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_estructuraIngresosPromediosUpdate")) {
				this.jButtonid_estructuraIngresosPromediosUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_estructuraIngresosPromediosBusqueda")) {
				this.jButtonid_estructuraIngresosPromediosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("codigoIngresosPromediosBusqueda")) {
				this.jButtoncodigoIngresosPromediosBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_empresaIngresosPromediosUpdate")) {
				this.jButtonid_empresaIngresosPromediosUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_empresaIngresosPromediosBusqueda")) {
				this.jButtonid_empresaIngresosPromediosBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_anioIngresosPromediosUpdate")) {
				this.jButtonid_anioIngresosPromediosUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_anioIngresosPromediosBusqueda")) {
				this.jButtonid_anioIngresosPromediosBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_mesIngresosPromediosUpdate")) {
				this.jButtonid_mesIngresosPromediosUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_mesIngresosPromediosBusqueda")) {
				this.jButtonid_mesIngresosPromediosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("codigo_cargoIngresosPromediosBusqueda")) {
				this.jButtoncodigo_cargoIngresosPromediosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("codigo_datoIngresosPromediosBusqueda")) {
				this.jButtoncodigo_datoIngresosPromediosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombreIngresosPromediosBusqueda")) {
				this.jButtonnombreIngresosPromediosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("valor_pagoIngresosPromediosBusqueda")) {
				this.jButtonvalor_pagoIngresosPromediosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombre_rubro_empleaIngresosPromediosBusqueda")) {
				this.jButtonnombre_rubro_empleaIngresosPromediosBusquedaActionPerformed(evt);
			}
			
			IngresosPromediosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.ingresospromedios,new Object(),this.ingresospromediosParameterGeneral,this.ingresospromediosReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,IngresosPromediosConstantesFunciones.CLASSNAME);
			
  		}  finally {
      		this.finishProcessIngresosPromedios();
      	}
    }
	
	public void internalFrameClosingInternalFrameGeneral(String sTipo,InternalFrameEvent evt) { 	  
		try {
			IngresosPromediosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.ingresospromedios,new Object(),this.ingresospromediosParameterGeneral,this.ingresospromediosReturnGeneral);
			
			if(sTipo.equals("CloseInternalFrameIngresosPromedios")) {
				closingInternalFrameIngresosPromedios();
				
			} else if(sTipo.equals("jButtonCancelarIngresosPromedios")) {
				JInternalFrameBase jInternalFrameDetalleFormIngresosPromedios = (JInternalFrameBase)evt.getSource();
	            	
	            IngresosPromediosBeanSwingJInternalFrame jInternalFrameParent=(IngresosPromediosBeanSwingJInternalFrame)jInternalFrameDetalleFormIngresosPromedios.getjInternalFrameParent();
	            
				jInternalFrameParent.jButtonCancelarIngresosPromediosActionPerformed(null);
			}
			
			IngresosPromediosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.ingresospromedios,new Object(),this.ingresospromediosParameterGeneral,this.ingresospromediosReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,IngresosPromediosConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void recargarFormIngresosPromedios(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion) throws Exception {
		this.recargarFormIngresosPromedios(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,false);
	}
	
	public void recargarFormIngresosPromedios(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion,Boolean esControlTabla) throws Exception {
		if(this.permiteRecargarForm && this.permiteMantenimiento(this.ingresospromedios)) {
			if(!esControlTabla) {
				if(IngresosPromediosJInternalFrame.ISBINDING_MANUAL_TABLA) {			
					this.setVariablesFormularioToObjetoActualIngresosPromedios(this.ingresospromedios,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysIngresosPromedios(this.ingresospromedios);			
				}
				
				if(this.ingresospromediosSessionBean.getEstaModoGuardarRelaciones()) {
					this.setVariablesFormularioRelacionesToObjetoActualIngresosPromedios(this.ingresospromedios,classes);				
				}
			
				if(conIrServidorAplicacion) {
					
					//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					//this.setVariablesObjetoReturnGeneralToBeanIngresosPromedios(this.ingresospromediosReturnGeneral,this.ingresospromediosBean,false);
						
					//ACTUALIZA VARIABLES RELACIONES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					if(this.ingresospromediosSessionBean.getEstaModoGuardarRelaciones()) {
						//this.setVariablesRelacionesObjetoReturnGeneralToBeanIngresosPromedios(classes,this.ingresospromediosReturnGeneral,this.ingresospromediosBean,false);
					}
						
					if(this.ingresospromediosReturnGeneral.getConRecargarPropiedades()) {
						//INICIALIZA VARIABLES COMBOS NORMALES (FK)
						this.setVariablesObjetoActualToFormularioForeignKeyIngresosPromedios(this.ingresospromediosReturnGeneral.getIngresosPromedios());
							
						//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
						this.setVariablesObjetoActualToFormularioIngresosPromedios(this.ingresospromediosReturnGeneral.getIngresosPromedios());	
					}
						
					if(this.ingresospromediosReturnGeneral.getConRecargarRelaciones()) {
						//INICIALIZA VARIABLES RELACIONES A FORMULARIO
						this.setVariablesRelacionesObjetoActualToFormularioIngresosPromedios(this.ingresospromediosReturnGeneral.getIngresosPromedios(),classes);//this.ingresospromediosBean);	
					}									
					
				} else {				
					//INICIALIZA VARIABLES RELACIONES A FORMULARIO
					this.setVariablesRelacionesObjetoActualToFormularioIngresosPromedios(this.ingresospromedios,classes);//this.ingresospromediosBean);									
				}
			
				if(IngresosPromediosJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesFormularioToObjetoActualIngresosPromedios(this.ingresospromedios,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysIngresosPromedios(this.ingresospromedios);				
				}
				
			} else {
				
				if(((controlTipo.equals(ControlTipo.TEXTBOX) || controlTipo.equals(ControlTipo.DATE)
					|| controlTipo.equals(ControlTipo.TEXTAREA) || controlTipo.equals(ControlTipo.COMBOBOX)
					)				
					&& eventoTipo.equals(EventoTipo.CHANGE)
					)
					
					|| (controlTipo.equals(ControlTipo.CHECKBOX) && eventoTipo.equals(EventoTipo.CLIC))
					
				) { // && sTipoGeneral.equals("TEXTBOX")
					
					if(this.ingresospromediosAnterior!=null) {
						this.ingresospromedios=this.ingresospromediosAnterior;
					}
				}
				
				if(conIrServidorAplicacion) {
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.ingresospromediosSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.ingresospromediosSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(this.ingresospromediosReturnGeneral.getIngresosPromedios(),ingresospromediosLogic.getIngresosPromedioss());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(this.ingresospromediosReturnGeneral.getIngresosPromedios(),this.ingresospromedioss);
				}
				//ARCHITECTURE
				
				//this.jTableDatosIngresosPromedios.repaint();
				
				//((AbstractTableModel) this.jTableDatosIngresosPromedios.getModel()).fireTableDataChanged();
				
				this.actualizarVisualTableDatosIngresosPromedios();
			}
		}
	}
	
	public void actualizarVisualTableDatosIngresosPromedios() throws Exception {
		
		IngresosPromediosModel ingresospromediosModel=(IngresosPromediosModel)this.jTableDatosIngresosPromedios.getModel();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			ingresospromediosModel.ingresospromedioss=this.ingresospromediosLogic.getIngresosPromedioss();
		
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
			ingresospromediosModel.ingresospromedioss=this.ingresospromedioss;
		}
		
		
		((IngresosPromediosModel) this.jTableDatosIngresosPromedios.getModel()).fireTableDataChanged();
	}
	
	public void actualizarVisualTableDatosEventosVistaIngresosPromedios() throws Exception {
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.actualizarLista(this.getingresospromediosAnterior(),this.ingresospromediosLogic.getIngresosPromedioss());
					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			this.actualizarLista(this.getingresospromediosAnterior(),this.ingresospromedioss);
		}
		//ARCHITECTURE
						
		this.actualizarFilaTotales();
						
		this.actualizarVisualTableDatosIngresosPromedios();	
	}
	
	public void setVariablesRelacionesObjetoActualToFormularioIngresosPromedios(IngresosPromedios ingresospromedios,ArrayList<Classe> classes) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,IngresosPromediosConstantesFunciones.CLASSNAME);
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
										
				IngresosPromediosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.ingresospromedios,new Object(),generalEntityParameterGeneral,this.ingresospromediosReturnGeneral);
				
				ArrayList<Classe> classes=new ArrayList<Classe>();
				
				for(String sClasse:arrClasses) {
					if(sClasse.equals("TODOS")) {
						conTodasRelaciones=true;
						break;
					}
				}
				
				if(this.ingresospromediosSessionBean.getConGuardarRelaciones()) {
					if(conTodasRelaciones) {
						classes=IngresosPromediosConstantesFunciones.getClassesRelationshipsOfIngresosPromedios(new ArrayList<Classe>(),DeepLoadType.NONE);
					} else {
						classes=IngresosPromediosConstantesFunciones.getClassesRelationshipsFromStringsOfIngresosPromedios(arrClasses,DeepLoadType.NONE);
					}
				}
	
				this.classesActual=new ArrayList<Classe>();
				this.classesActual.addAll(classes);
	
				this.recargarFormIngresosPromedios(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,esControlTabla);
										
				IngresosPromediosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.ingresospromedios,new Object(),generalEntityParameterGeneral,this.ingresospromediosReturnGeneral);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,IngresosPromediosConstantesFunciones.CLASSNAME);
  		}
    }
	
	/*
	public void setVariablesRelacionesObjetoBeanActualToFormularioIngresosPromedios(IngresosPromediosBean ingresospromediosBean) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,IngresosPromediosConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesRelacionesObjetoReturnGeneralToBeanIngresosPromedios(ArrayList<Classe> classes,IngresosPromediosReturnGeneral ingresospromediosReturnGeneral,IngresosPromediosBean ingresospromediosBean,Boolean conDefault) throws Exception {
		
	}
	*/
	
	public void setVariablesFormularioRelacionesToObjetoActualIngresosPromedios(IngresosPromedios ingresospromedios,ArrayList<Classe> classes) throws Exception {
		
	}
	
	public Boolean permiteManejarEventosControl() {
		Boolean permite=true;				
		
		if(this.estaModoNuevo || this.estaModoSeleccionar || this.estaModoEliminarGuardarCambios) {
			permite=false;
			
		} 
		
		//NO DEBE MEZCLARSE CONCEPTOS
		/*	
		if(!paraTabla && !this.permiteMantenimiento(this.ingresospromedios)) {
			System.out.println("ERROR:EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES");
				
			//JOptionPane.showMessageDialog(this,"EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES","EVENTO",JOptionPane.ERROR_MESSAGE);			
		}
		*/
		
		return permite;
	}
	
	public void inicializarFormDetalle() throws Exception {
		
		this.jInternalFrameDetalleFormIngresosPromedios = new IngresosPromediosDetalleFormJInternalFrame(jDesktopPane,this.ingresospromediosSessionBean.getConGuardarRelaciones(),this.ingresospromediosSessionBean.getEsGuardarRelacionado(),this.cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		this.jDesktopPane.add(this.jInternalFrameDetalleFormIngresosPromedios);
		this.jInternalFrameDetalleFormIngresosPromedios.setVisible(false);
		this.jInternalFrameDetalleFormIngresosPromedios.setSelected(false);						
		
		this.jInternalFrameDetalleFormIngresosPromedios.setJInternalFrameParent(this);
		
		this.jInternalFrameDetalleFormIngresosPromedios.ingresospromediosLogic=this.ingresospromediosLogic;
		
		this.cargarCombosFrameForeignKeyIngresosPromedios("Formulario");
		
		this.inicializarActualizarBindingBotonesPermisosManualFormDetalleIngresosPromedios();
		this.inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleIngresosPromedios();
		
		this.initActionsFormDetalle();		
		
		this.initActionsCombosTodosForeignKeyIngresosPromedios("Formulario");
		
		//TALVEZ conSetVariablesGlobales COMO if() 
		this.setVariablesGlobalesCombosForeignKeyIngresosPromedios();
		
		this.cargarMenuRelaciones();
		
	}
	
	public void initActionsFormDetalle() {	
		
		this.jInternalFrameDetalleFormIngresosPromedios.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarIngresosPromedios"));
		
		this.jInternalFrameDetalleFormIngresosPromedios.jButtonModificarIngresosPromedios.addActionListener(new ButtonActionListener(this,"ModificarIngresosPromedios"));

		
		this.jInternalFrameDetalleFormIngresosPromedios.jButtonModificarToolBarIngresosPromedios.addActionListener(new ButtonActionListener(this,"ModificarToolBarIngresosPromedios"));
					
		this.jInternalFrameDetalleFormIngresosPromedios.jMenuItemModificarIngresosPromedios.addActionListener(new ButtonActionListener(this,"MenuItemModificarIngresosPromedios"));		
		
		
		
		this.jInternalFrameDetalleFormIngresosPromedios.jButtonActualizarIngresosPromedios.addActionListener (new ButtonActionListener(this,"ActualizarIngresosPromedios"));
		
		
		this.jInternalFrameDetalleFormIngresosPromedios.jButtonActualizarToolBarIngresosPromedios.addActionListener(new ButtonActionListener(this,"ActualizarToolBarIngresosPromedios"));
						
		this.jInternalFrameDetalleFormIngresosPromedios.jMenuItemActualizarIngresosPromedios.addActionListener (new ButtonActionListener(this,"MenuItemActualizarIngresosPromedios"));		
		
		
		
		this.jInternalFrameDetalleFormIngresosPromedios.jButtonEliminarIngresosPromedios.addActionListener (new ButtonActionListener(this,"EliminarIngresosPromedios"));
		
		
		this.jInternalFrameDetalleFormIngresosPromedios.jButtonEliminarToolBarIngresosPromedios.addActionListener (new ButtonActionListener(this,"EliminarToolBarIngresosPromedios"));
								
		this.jInternalFrameDetalleFormIngresosPromedios.jMenuItemEliminarIngresosPromedios.addActionListener (new ButtonActionListener(this,"MenuItemEliminarIngresosPromedios"));		
		
		
		
		this.jInternalFrameDetalleFormIngresosPromedios.jButtonCancelarIngresosPromedios.addActionListener (new ButtonActionListener(this,"CancelarIngresosPromedios"));
		
		
		this.jInternalFrameDetalleFormIngresosPromedios.jButtonCancelarToolBarIngresosPromedios.addActionListener (new ButtonActionListener(this,"CancelarToolBarIngresosPromedios"));
					
		this.jInternalFrameDetalleFormIngresosPromedios.jMenuItemCancelarIngresosPromedios.addActionListener (new ButtonActionListener(this,"MenuItemCancelarIngresosPromedios"));		
		
		
		
		
		
		this.jInternalFrameDetalleFormIngresosPromedios.jMenuItemDetalleCerrarIngresosPromedios.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarIngresosPromedios"));		
		
		
		
		this.jInternalFrameDetalleFormIngresosPromedios.jButtonGuardarCambiosToolBarIngresosPromedios.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarIngresosPromedios"));
		
		
		
		this.jInternalFrameDetalleFormIngresosPromedios.jButtonGuardarCambiosToolBarIngresosPromedios.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarIngresosPromedios"));
		
		
		
		this.jInternalFrameDetalleFormIngresosPromedios.jComboBoxTiposAccionesFormularioIngresosPromedios.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioIngresosPromedios"));
		
		
				
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormIngresosPromedios.jButtonidIngresosPromediosBusqueda.addActionListener(new ButtonActionListener(this,"idIngresosPromediosBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormIngresosPromedios.jButtonid_estructuraIngresosPromediosUpdate.addActionListener(new ButtonActionListener(this,"id_estructuraIngresosPromediosUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormIngresosPromedios.jButtonid_estructuraIngresosPromediosBusqueda.addActionListener(new ButtonActionListener(this,"id_estructuraIngresosPromediosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormIngresosPromedios.jButtoncodigoIngresosPromediosBusqueda.addActionListener(new ButtonActionListener(this,"codigoIngresosPromediosBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormIngresosPromedios.jButtonid_empresaIngresosPromediosUpdate.addActionListener(new ButtonActionListener(this,"id_empresaIngresosPromediosUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormIngresosPromedios.jButtonid_empresaIngresosPromediosBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaIngresosPromediosBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormIngresosPromedios.jButtonid_anioIngresosPromediosUpdate.addActionListener(new ButtonActionListener(this,"id_anioIngresosPromediosUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormIngresosPromedios.jButtonid_anioIngresosPromediosBusqueda.addActionListener(new ButtonActionListener(this,"id_anioIngresosPromediosBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormIngresosPromedios.jButtonid_mesIngresosPromediosUpdate.addActionListener(new ButtonActionListener(this,"id_mesIngresosPromediosUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormIngresosPromedios.jButtonid_mesIngresosPromediosBusqueda.addActionListener(new ButtonActionListener(this,"id_mesIngresosPromediosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormIngresosPromedios.jButtoncodigo_cargoIngresosPromediosBusqueda.addActionListener(new ButtonActionListener(this,"codigo_cargoIngresosPromediosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormIngresosPromedios.jButtoncodigo_datoIngresosPromediosBusqueda.addActionListener(new ButtonActionListener(this,"codigo_datoIngresosPromediosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormIngresosPromedios.jButtonnombreIngresosPromediosBusqueda.addActionListener(new ButtonActionListener(this,"nombreIngresosPromediosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormIngresosPromedios.jButtonvalor_pagoIngresosPromediosBusqueda.addActionListener(new ButtonActionListener(this,"valor_pagoIngresosPromediosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormIngresosPromedios.jButtonnombre_rubro_empleaIngresosPromediosBusqueda.addActionListener(new ButtonActionListener(this,"nombre_rubro_empleaIngresosPromediosBusqueda"));
		
		
		;

		//TABBED PANE RELACIONES
		this.jInternalFrameDetalleFormIngresosPromedios.jTabbedPaneRelacionesIngresosPromedios.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesIngresosPromedios"));
		
		;		
		//TABBED PANE RELACIONES FIN(EXTRA TAB)	
	}
	
	public void initActions() {				
		this.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"CloseInternalFrameIngresosPromedios"));
		
		if(this.jInternalFrameDetalleFormIngresosPromedios!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormIngresosPromedios.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarIngresosPromedios"));
		}
		
		this.jTableDatosIngresosPromedios.getSelectionModel().addListSelectionListener(new TableListSelectionListener(this,"TableDatosSeleccionarIngresosPromedios"));
		
		this.jTableDatosIngresosPromedios.addMouseListener(new TableMouseAdapter(this,"DatosSeleccionarIngresosPromedios"));
		
		this.jButtonNuevoIngresosPromedios.addActionListener(new ButtonActionListener(this,"NuevoIngresosPromedios"));
		
		this.jButtonDuplicarIngresosPromedios.addActionListener(new ButtonActionListener(this,"DuplicarIngresosPromedios"));
		
		this.jButtonCopiarIngresosPromedios.addActionListener(new ButtonActionListener(this,"CopiarIngresosPromedios"));
		
		this.jButtonVerFormIngresosPromedios.addActionListener(new ButtonActionListener(this,"VerFormIngresosPromedios"));
		
		
		this.jButtonNuevoToolBarIngresosPromedios.addActionListener(new ButtonActionListener(this,"NuevoToolBarIngresosPromedios"));
			
		this.jButtonDuplicarToolBarIngresosPromedios.addActionListener(new ButtonActionListener(this,"DuplicarToolBarIngresosPromedios"));
			
		this.jMenuItemNuevoIngresosPromedios.addActionListener (new ButtonActionListener(this,"MenuItemNuevoIngresosPromedios"));
			
		this.jMenuItemDuplicarIngresosPromedios.addActionListener (new ButtonActionListener(this,"MenuItemDuplicarIngresosPromedios"));		
		
		
		this.jButtonNuevoRelacionesIngresosPromedios.addActionListener (new ButtonActionListener(this,"NuevoRelacionesIngresosPromedios"));
		
		
		this.jButtonNuevoRelacionesToolBarIngresosPromedios.addActionListener(new ButtonActionListener(this,"NuevoRelacionesToolBarIngresosPromedios"));
			
		this.jMenuItemNuevoRelacionesIngresosPromedios.addActionListener(new ButtonActionListener(this,"MenuItemNuevoRelacionesIngresosPromedios"));		
		
		
		if(this.jInternalFrameDetalleFormIngresosPromedios!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormIngresosPromedios.jButtonModificarIngresosPromedios.addActionListener(new ButtonActionListener(this,"ModificarIngresosPromedios"));
		}
		
		
		if(this.jInternalFrameDetalleFormIngresosPromedios!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormIngresosPromedios.jButtonModificarToolBarIngresosPromedios.addActionListener(new ButtonActionListener(this,"ModificarToolBarIngresosPromedios"));
			
			this.jInternalFrameDetalleFormIngresosPromedios.jMenuItemModificarIngresosPromedios.addActionListener(new ButtonActionListener(this,"MenuItemModificarIngresosPromedios"));		
		}
		
		
		if(this.jInternalFrameDetalleFormIngresosPromedios!=null) { //if(this.conCargarFormDetalle) {			
			this.jInternalFrameDetalleFormIngresosPromedios.jButtonActualizarIngresosPromedios.addActionListener (new ButtonActionListener(this,"ActualizarIngresosPromedios"));
		}
		
		
		if(this.jInternalFrameDetalleFormIngresosPromedios!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormIngresosPromedios.jButtonActualizarToolBarIngresosPromedios.addActionListener(new ButtonActionListener(this,"ActualizarToolBarIngresosPromedios"));
				
			this.jInternalFrameDetalleFormIngresosPromedios.jMenuItemActualizarIngresosPromedios.addActionListener (new ButtonActionListener(this,"MenuItemActualizarIngresosPromedios"));		
		}
		
		
		if(this.jInternalFrameDetalleFormIngresosPromedios!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormIngresosPromedios.jButtonEliminarIngresosPromedios.addActionListener (new ButtonActionListener(this,"EliminarIngresosPromedios"));
		}
		
		
		if(this.jInternalFrameDetalleFormIngresosPromedios!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormIngresosPromedios.jButtonEliminarToolBarIngresosPromedios.addActionListener (new ButtonActionListener(this,"EliminarToolBarIngresosPromedios"));
						
			this.jInternalFrameDetalleFormIngresosPromedios.jMenuItemEliminarIngresosPromedios.addActionListener (new ButtonActionListener(this,"MenuItemEliminarIngresosPromedios"));		
		}
		
		
		if(this.jInternalFrameDetalleFormIngresosPromedios!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormIngresosPromedios.jButtonCancelarIngresosPromedios.addActionListener (new ButtonActionListener(this,"CancelarIngresosPromedios"));
		}
		
		
		if(this.jInternalFrameDetalleFormIngresosPromedios!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormIngresosPromedios.jButtonCancelarToolBarIngresosPromedios.addActionListener (new ButtonActionListener(this,"CancelarToolBarIngresosPromedios"));
			
			this.jInternalFrameDetalleFormIngresosPromedios.jMenuItemCancelarIngresosPromedios.addActionListener (new ButtonActionListener(this,"MenuItemCancelarIngresosPromedios"));		
		}
		
		this.jButtonMostrarOcultarTablaToolBarIngresosPromedios.addActionListener (new ButtonActionListener(this,"MostrarOcultarToolBarIngresosPromedios"));		
		
		
		this.jButtonCerrarIngresosPromedios.addActionListener (new ButtonActionListener(this,"CerrarIngresosPromedios"));
		
		
		this.jButtonCerrarToolBarIngresosPromedios.addActionListener (new ButtonActionListener(this,"CerrarToolBarIngresosPromedios"));
			
		this.jMenuItemCerrarIngresosPromedios.addActionListener (new ButtonActionListener(this,"MenuItemCerrarIngresosPromedios"));
			
		if(this.jInternalFrameDetalleFormIngresosPromedios!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormIngresosPromedios.jMenuItemDetalleCerrarIngresosPromedios.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarIngresosPromedios"));		
		}
		
		
		if(this.jInternalFrameDetalleFormIngresosPromedios!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormIngresosPromedios.jButtonGuardarCambiosIngresosPromedios.addActionListener (new ButtonActionListener(this,"GuardarCambiosIngresosPromedios"));
		}
		
		
		if(this.jInternalFrameDetalleFormIngresosPromedios!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormIngresosPromedios.jButtonGuardarCambiosToolBarIngresosPromedios.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarIngresosPromedios"));
		}
		
		this.jButtonCopiarToolBarIngresosPromedios.addActionListener (new ButtonActionListener(this,"CopiarToolBarIngresosPromedios"));
			
		this.jButtonVerFormToolBarIngresosPromedios.addActionListener (new ButtonActionListener(this,"VerFormToolBarIngresosPromedios"));
		
		this.jMenuItemGuardarCambiosIngresosPromedios.addActionListener (new ButtonActionListener(this,"MenuItemGuardarCambiosIngresosPromedios"));
			
		this.jMenuItemCopiarIngresosPromedios.addActionListener (new ButtonActionListener(this,"MenuItemCopiarIngresosPromedios"));		
		
		this.jMenuItemVerFormIngresosPromedios.addActionListener (new ButtonActionListener(this,"MenuItemVerFormIngresosPromedios"));		
		
		
		this.jButtonGuardarCambiosTablaIngresosPromedios.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaIngresosPromedios"));
		
		
		this.jButtonGuardarCambiosTablaToolBarIngresosPromedios.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaToolBarIngresosPromedios"));
			
		this.jMenuItemGuardarCambiosTablaIngresosPromedios.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaIngresosPromedios"));		
		
		
		
		this.jButtonRecargarInformacionIngresosPromedios.addActionListener (new ButtonActionListener(this,"RecargarInformacionIngresosPromedios"));
					
		this.jButtonRecargarInformacionToolBarIngresosPromedios.addActionListener (new ButtonActionListener(this,"RecargarInformacionToolBarIngresosPromedios"));
		
		this.jMenuItemRecargarInformacionIngresosPromedios.addActionListener (new ButtonActionListener(this,"MenuItemRecargarInformacionIngresosPromedios"));		
		
		
		
		this.jButtonAnterioresIngresosPromedios.addActionListener (new ButtonActionListener(this,"AnterioresIngresosPromedios"));
		
		
		this.jButtonAnterioresToolBarIngresosPromedios.addActionListener (new ButtonActionListener(this,"AnterioresToolBarIngresosPromedios"));
		
		this.jMenuItemAnterioresIngresosPromedios.addActionListener (new ButtonActionListener(this,"MenuItemAnterioresIngresosPromedios"));		
		
		
		this.jButtonSiguientesIngresosPromedios.addActionListener (new ButtonActionListener(this,"SiguientesIngresosPromedios"));
		
		
		this.jButtonSiguientesToolBarIngresosPromedios.addActionListener (new ButtonActionListener(this,"SiguientesToolBarIngresosPromedios"));
			
		this.jMenuItemSiguientesIngresosPromedios.addActionListener (new ButtonActionListener(this,"MenuItemSiguientesIngresosPromedios"));
			
		this.jMenuItemAbrirOrderByIngresosPromedios.addActionListener (new ButtonActionListener(this,"MenuItemAbrirOrderByIngresosPromedios"));
			
		this.jMenuItemMostrarOcultarIngresosPromedios.addActionListener (new ButtonActionListener(this,"MenuItemMostrarOcultarIngresosPromedios"));
			
		this.jMenuItemDetalleAbrirOrderByIngresosPromedios.addActionListener (new ButtonActionListener(this,"MenuItemDetalleAbrirOrderByIngresosPromedios"));
			
		this.jMenuItemDetalleMostarOcultarIngresosPromedios.addActionListener (new ButtonActionListener(this,"MenuItemDetalleMostrarOcultarIngresosPromedios"));		
		
		
		this.jButtonNuevoGuardarCambiosIngresosPromedios.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosIngresosPromedios"));
		
		
		this.jButtonNuevoGuardarCambiosToolBarIngresosPromedios.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosToolBarIngresosPromedios"));
			
		this.jMenuItemNuevoGuardarCambiosIngresosPromedios.addActionListener (new ButtonActionListener(this,"MenuItemNuevoGuardarCambiosIngresosPromedios"));		
		
		
		
		//SELECCIONAR TODOS
		
		this.jCheckBoxSeleccionarTodosIngresosPromedios.addItemListener(new CheckBoxItemListener(this,"SeleccionarTodosIngresosPromedios"));

		this.jCheckBoxSeleccionadosIngresosPromedios.addItemListener(new CheckBoxItemListener(this,"SeleccionadosIngresosPromedios"));
		
		if(this.jInternalFrameDetalleFormIngresosPromedios!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormIngresosPromedios.jComboBoxTiposAccionesFormularioIngresosPromedios.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioIngresosPromedios"));
		}
		
		
		this.jComboBoxTiposRelacionesIngresosPromedios.addActionListener (new ButtonActionListener(this,"TiposRelacionesIngresosPromedios"));
			
		this.jComboBoxTiposAccionesIngresosPromedios.addActionListener (new ButtonActionListener(this,"TiposAccionesIngresosPromedios"));
					
		this.jComboBoxTiposSeleccionarIngresosPromedios.addActionListener (new ButtonActionListener(this,"TiposSeleccionarIngresosPromedios"));
			
		this.jTextFieldValorCampoGeneralIngresosPromedios.addActionListener (new ButtonActionListener(this,"ValorCampoGeneralIngresosPromedios"));		
		
		
		if(this.jInternalFrameDetalleFormIngresosPromedios!=null) { //if(this.conCargarFormDetalle) {
		
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormIngresosPromedios.jButtonidIngresosPromediosBusqueda.addActionListener(new ButtonActionListener(this,"idIngresosPromediosBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormIngresosPromedios.jButtonid_estructuraIngresosPromediosUpdate.addActionListener(new ButtonActionListener(this,"id_estructuraIngresosPromediosUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormIngresosPromedios.jButtonid_estructuraIngresosPromediosBusqueda.addActionListener(new ButtonActionListener(this,"id_estructuraIngresosPromediosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormIngresosPromedios.jButtoncodigoIngresosPromediosBusqueda.addActionListener(new ButtonActionListener(this,"codigoIngresosPromediosBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormIngresosPromedios.jButtonid_empresaIngresosPromediosUpdate.addActionListener(new ButtonActionListener(this,"id_empresaIngresosPromediosUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormIngresosPromedios.jButtonid_empresaIngresosPromediosBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaIngresosPromediosBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormIngresosPromedios.jButtonid_anioIngresosPromediosUpdate.addActionListener(new ButtonActionListener(this,"id_anioIngresosPromediosUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormIngresosPromedios.jButtonid_anioIngresosPromediosBusqueda.addActionListener(new ButtonActionListener(this,"id_anioIngresosPromediosBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormIngresosPromedios.jButtonid_mesIngresosPromediosUpdate.addActionListener(new ButtonActionListener(this,"id_mesIngresosPromediosUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormIngresosPromedios.jButtonid_mesIngresosPromediosBusqueda.addActionListener(new ButtonActionListener(this,"id_mesIngresosPromediosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormIngresosPromedios.jButtoncodigo_cargoIngresosPromediosBusqueda.addActionListener(new ButtonActionListener(this,"codigo_cargoIngresosPromediosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormIngresosPromedios.jButtoncodigo_datoIngresosPromediosBusqueda.addActionListener(new ButtonActionListener(this,"codigo_datoIngresosPromediosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormIngresosPromedios.jButtonnombreIngresosPromediosBusqueda.addActionListener(new ButtonActionListener(this,"nombreIngresosPromediosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormIngresosPromedios.jButtonvalor_pagoIngresosPromediosBusqueda.addActionListener(new ButtonActionListener(this,"valor_pagoIngresosPromediosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormIngresosPromedios.jButtonnombre_rubro_empleaIngresosPromediosBusqueda.addActionListener(new ButtonActionListener(this,"nombre_rubro_empleaIngresosPromediosBusqueda"));
		}
		
		if(!this.conCargarMinimo) {
		//BYDAN_BUSQUEDAS
		
		
			this.jButtonBusquedaIngresosPromediosIngresosPromedios.addActionListener(new ButtonActionListener(this,"BusquedaIngresosPromediosIngresosPromedios"));
		
		
		
			//REPORTE DINAMICO
			
			if(this.jInternalFrameReporteDinamicoIngresosPromedios!=null) {
				this.jInternalFrameReporteDinamicoIngresosPromedios.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoIngresosPromedios"));
				this.jInternalFrameReporteDinamicoIngresosPromedios.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoIngresosPromedios"));
				this.jInternalFrameReporteDinamicoIngresosPromedios.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoIngresosPromedios"));
			}
			
			//this.jButtonCerrarReporteDinamicoIngresosPromedios.addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoIngresosPromedios"));				
			//this.jButtonGenerarReporteDinamicoIngresosPromedios.addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoIngresosPromedios"));
			//this.jButtonGenerarExcelReporteDinamicoIngresosPromedios.addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoIngresosPromedios"));
				
				
			//IMPORTACION			
			if(this.jInternalFrameImportacionIngresosPromedios!=null) {
				this.jInternalFrameImportacionIngresosPromedios.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionIngresosPromedios"));
				this.jInternalFrameImportacionIngresosPromedios.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionIngresosPromedios"));
				this.jInternalFrameImportacionIngresosPromedios.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionIngresosPromedios"));
			}
			
			//ORDER BY
			this.jButtonAbrirOrderByIngresosPromedios.addActionListener (new ButtonActionListener(this,"AbrirOrderByIngresosPromedios"));
			
			this.jButtonAbrirOrderByToolBarIngresosPromedios.addActionListener (new ButtonActionListener(this,"AbrirOrderByToolBarIngresosPromedios"));			
			
			if(this.jInternalFrameOrderByIngresosPromedios!=null) {
				this.jInternalFrameOrderByIngresosPromedios.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByIngresosPromedios"));				
			}
			
			
		}
		
		
		
		if(!this.conCargarMinimo) {
			if(this.jInternalFrameDetalleFormIngresosPromedios!=null) { //if(this.conCargarFormDetalle) {
			;
			}
		}
		
		
		//TABBED PANE RELACIONES
		if(this.jInternalFrameDetalleFormIngresosPromedios!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormIngresosPromedios.jTabbedPaneRelacionesIngresosPromedios.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesIngresosPromedios"));
		
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
            		closingInternalFrameIngresosPromedios();
				} catch (Exception e) {
					e.printStackTrace();
				}
            }
        });
		
		this.jInternalFrameDetalleFormIngresosPromedios.addInternalFrameListener(new javax.swing.event.InternalFrameAdapter() {
	        public void internalFrameClosing(InternalFrameEvent event) {
	            JInternalFrameBase jInternalFrameDetalleFormIngresosPromedios = (JInternalFrameBase)event.getSource();
	            	
	            IngresosPromediosBeanSwingJInternalFrame jInternalFrameParent=(IngresosPromediosBeanSwingJInternalFrame)jInternalFrameDetalleFormIngresosPromedios.getjInternalFrameParent();
	                
	            try {
					jInternalFrameParent.jButtonCancelarIngresosPromediosActionPerformed(null);
					
					//jInternalFrameParent.dispose();
					//jInternalFrameParent=null;
					
				} catch (Exception e) {
					e.printStackTrace();
				}
	        }
	    });
			
		this.jTableDatosIngresosPromedios.getSelectionModel().addListSelectionListener (
	                new ListSelectionListener() {
	                    public void valueChanged(ListSelectionEvent e) {
							//BYDAN_DESHABILITADO
	                    	//try {jTableDatosIngresosPromediosListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
	                    }
	                }
	     );
		
		this.jTableDatosIngresosPromedios.addMouseListener(new MouseAdapter() {
			   public void mouseClicked(MouseEvent evt) {
				      if (evt.getClickCount() == 2) {
				    	  jButtonIdActionPerformed(null,jTableDatosIngresosPromedios.getSelectedRow(),false,false);
				      }
				   }
		});
		
		this.jButtonNuevoIngresosPromedios.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoIngresosPromediosActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoToolBarIngresosPromedios.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoIngresosPromediosActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoIngresosPromedios.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoIngresosPromediosActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoIngresosPromedios";
		inputMap = this.jButtonNuevoIngresosPromedios.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_N , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoIngresosPromedios.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoIngresosPromediosActionPerformed(evt,false);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonNuevoRelacionesIngresosPromedios.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoIngresosPromediosActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoRelacionesToolBarIngresosPromedios.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoIngresosPromediosActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoRelacionesIngresosPromedios.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoIngresosPromediosActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoRelacionesIngresosPromedios";
		inputMap = this.jButtonNuevoRelacionesIngresosPromedios.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_R , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoRelacionesIngresosPromedios.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoIngresosPromediosActionPerformed(evt,true);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonModificarIngresosPromedios.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarIngresosPromediosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonModificarToolBarIngresosPromedios.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarIngresosPromediosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemModificarIngresosPromedios.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarIngresosPromediosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ModificarIngresosPromedios";
		inputMap = this.jButtonModificarIngresosPromedios.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_M , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonModificarIngresosPromedios.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonModificarIngresosPromediosActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonActualizarIngresosPromedios.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarIngresosPromediosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonActualizarToolBarIngresosPromedios.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarIngresosPromediosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemActualizarIngresosPromedios.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarIngresosPromediosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ActualizarIngresosPromedios";
		inputMap = this.jButtonActualizarIngresosPromedios.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonActualizarIngresosPromedios.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonActualizarIngresosPromediosActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonEliminarIngresosPromedios.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarIngresosPromediosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonEliminarToolBarIngresosPromedios.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarIngresosPromediosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
				
		this.jMenuItemEliminarIngresosPromedios.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarIngresosPromediosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "EliminarIngresosPromedios";
		inputMap = this.jButtonEliminarIngresosPromedios.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_E , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonEliminarIngresosPromedios.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonEliminarIngresosPromediosActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCancelarIngresosPromedios.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarIngresosPromediosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCancelarToolBarIngresosPromedios.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarIngresosPromediosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCancelarIngresosPromedios.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarIngresosPromediosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CancelarIngresosPromedios";
		inputMap = this.jButtonCancelarIngresosPromedios.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_Q , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonCancelarIngresosPromedios.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCancelarIngresosPromediosActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCerrarIngresosPromedios.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarIngresosPromediosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCerrarToolBarIngresosPromedios.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarIngresosPromediosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCerrarIngresosPromedios.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarIngresosPromediosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemDetalleCerrarIngresosPromedios.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  //try {jButtonCerrarIngresosPromediosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
					try {jButtonCancelarIngresosPromediosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CerrarIngresosPromedios";
		inputMap = this.jButtonCerrarIngresosPromedios.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_C , KeyEvent.ALT_MASK), sMapKey);
			
		this.jButtonCerrarIngresosPromedios.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCerrarIngresosPromediosActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jInternalFrameDetalleFormIngresosPromedios.jButtonGuardarCambiosIngresosPromedios.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosIngresosPromediosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosToolBarIngresosPromedios.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosIngresosPromediosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosIngresosPromedios.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosIngresosPromediosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaIngresosPromedios.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosIngresosPromediosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaToolBarIngresosPromedios.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosIngresosPromediosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosTablaIngresosPromedios.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosIngresosPromediosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "GuardarCambiosIngresosPromedios";
		inputMap = this.jInternalFrameDetalleFormIngresosPromedios.jButtonGuardarCambiosIngresosPromedios.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jInternalFrameDetalleFormIngresosPromedios.jButtonGuardarCambiosIngresosPromedios.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonGuardarCambiosIngresosPromediosActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonRecargarInformacionIngresosPromedios.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionIngresosPromediosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonRecargarInformacionToolBarIngresosPromedios.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionIngresosPromediosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemRecargarInformacionIngresosPromedios.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionIngresosPromediosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		this.jButtonAnterioresIngresosPromedios.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresIngresosPromediosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAnterioresToolBarIngresosPromedios.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresIngresosPromediosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemAnterioresIngresosPromedios.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresIngresosPromediosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesIngresosPromedios.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesIngresosPromediosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesToolBarIngresosPromedios.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesIngresosPromediosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemSiguientesIngresosPromedios.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesIngresosPromediosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosIngresosPromedios.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosIngresosPromediosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosToolBarIngresosPromedios.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosIngresosPromediosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoGuardarCambiosIngresosPromedios.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosIngresosPromediosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		//SELECCIONAR TODOS
		this.jCheckBoxSeleccionarTodosIngresosPromedios.addItemListener(new ItemListener() {		
			public void itemStateChanged(ItemEvent evt) {
				try {jCheckBoxSeleccionarTodosIngresosPromediosItemListener(evt);}catch(Exception e){e.printStackTrace();}
			}
		});

		this.jComboBoxTiposAccionesIngresosPromedios.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposAccionesIngresosPromediosActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jComboBoxTiposSeleccionarIngresosPromedios.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposSeleccionarIngresosPromediosActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jTextFieldValorCampoGeneralIngresosPromedios.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jTextFieldValorCampoGeneralIngresosPromediosActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormIngresosPromedios.jButtonidIngresosPromediosBusqueda.addActionListener(new ButtonActionListener(this,"idIngresosPromediosBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormIngresosPromedios.jButtonid_estructuraIngresosPromediosUpdate.addActionListener(new ButtonActionListener(this,"id_estructuraIngresosPromediosUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormIngresosPromedios.jButtonid_estructuraIngresosPromediosBusqueda.addActionListener(new ButtonActionListener(this,"id_estructuraIngresosPromediosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormIngresosPromedios.jButtoncodigoIngresosPromediosBusqueda.addActionListener(new ButtonActionListener(this,"codigoIngresosPromediosBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormIngresosPromedios.jButtonid_empresaIngresosPromediosUpdate.addActionListener(new ButtonActionListener(this,"id_empresaIngresosPromediosUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormIngresosPromedios.jButtonid_empresaIngresosPromediosBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaIngresosPromediosBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormIngresosPromedios.jButtonid_anioIngresosPromediosUpdate.addActionListener(new ButtonActionListener(this,"id_anioIngresosPromediosUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormIngresosPromedios.jButtonid_anioIngresosPromediosBusqueda.addActionListener(new ButtonActionListener(this,"id_anioIngresosPromediosBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormIngresosPromedios.jButtonid_mesIngresosPromediosUpdate.addActionListener(new ButtonActionListener(this,"id_mesIngresosPromediosUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormIngresosPromedios.jButtonid_mesIngresosPromediosBusqueda.addActionListener(new ButtonActionListener(this,"id_mesIngresosPromediosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormIngresosPromedios.jButtoncodigo_cargoIngresosPromediosBusqueda.addActionListener(new ButtonActionListener(this,"codigo_cargoIngresosPromediosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormIngresosPromedios.jButtoncodigo_datoIngresosPromediosBusqueda.addActionListener(new ButtonActionListener(this,"codigo_datoIngresosPromediosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormIngresosPromedios.jButtonnombreIngresosPromediosBusqueda.addActionListener(new ButtonActionListener(this,"nombreIngresosPromediosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormIngresosPromedios.jButtonvalor_pagoIngresosPromediosBusqueda.addActionListener(new ButtonActionListener(this,"valor_pagoIngresosPromediosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormIngresosPromedios.jButtonnombre_rubro_empleaIngresosPromediosBusqueda.addActionListener(new ButtonActionListener(this,"nombre_rubro_empleaIngresosPromediosBusqueda"));
		
		
		this.jButtonBusquedaIngresosPromediosIngresosPromedios.addActionListener(new ButtonActionListener(this,"BusquedaIngresosPromediosIngresosPromedios"));

		
		//REPORTE DINAMICO
		this.jButtonCerrarReporteDinamicoIngresosPromedios.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarReporteDinamicoIngresosPromediosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarReporteDinamicoIngresosPromedios.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarReporteDinamicoIngresosPromediosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarExcelReporteDinamicoIngresosPromedios.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarExcelReporteDinamicoIngresosPromediosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		//IMPORTACION
		this.jButtonCerrarImportacionIngresosPromedios.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarImportacionIngresosPromediosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarImportacionIngresosPromedios.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarImportacionIngresosPromediosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAbrirImportacionIngresosPromedios.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAbrirImportacionIngresosPromediosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
	}
	*/
	
	
	public void jComboBoxTiposSeleccionarIngresosPromediosActionListener(ActionEvent evt) throws Exception {    		
		try {			
			Reporte reporte=(Reporte)this.jComboBoxTiposSeleccionarIngresosPromedios.getSelectedItem();
			
			//if(reporte.getsCodigo().equals("SELECCIONAR")) {
			//}					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,IngresosPromediosConstantesFunciones.CLASSNAME);
		}
	}	
	
	
	
	public void seleccionarTodosIngresosPromedios(Boolean conSeleccionarTodos) throws Exception {    		
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				for(IngresosPromedios ingresospromediosAux:this.ingresospromediosLogic.getIngresosPromedioss()) {
					ingresospromediosAux.setIsSelected(conSeleccionarTodos);
				}			
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(IngresosPromedios ingresospromediosAux:ingresospromedioss) {
					ingresospromediosAux.setIsSelected(conSeleccionarTodos);
				}
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,IngresosPromediosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarTodosIngresosPromediosItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingIngresosPromedios(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			
			if(sTipoSeleccionar.equals("COLUMNAS")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(IngresosPromedios ingresospromediosAux:this.ingresospromediosLogic.getIngresosPromedioss()) {
						ingresospromediosAux.setIsSelected(this.isSeleccionarTodos);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(IngresosPromedios ingresospromediosAux:ingresospromedioss) {
						ingresospromediosAux.setIsSelected(this.isSeleccionarTodos);
					}
				}
			} else {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					for(IngresosPromedios ingresospromediosAux:this.ingresospromediosLogic.getIngresosPromedioss()) {
					
					}	
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(IngresosPromedios ingresospromediosAux:ingresospromedioss) {
						
					}
				}
			}
					
			if(existe) {
				this.inicializarActualizarBindingTablaIngresosPromedios(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosIngresosPromedios.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosIngresosPromedios.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosIngresosPromedios,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,IngresosPromediosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionadosIngresosPromediosItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingIngresosPromedios(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			int[] arrNumRowsSeleccionados=null;
			
			arrNumRowsSeleccionados=this.jTableDatosIngresosPromedios.getSelectedRows();
			
			IngresosPromedios ingresospromediosLocal=new IngresosPromedios();
			
			//this.seleccionarTodosIngresosPromedios(false);
			
			for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					ingresospromediosLocal =(IngresosPromedios) this.ingresospromediosLogic.getIngresosPromedioss().toArray()[this.jTableDatosIngresosPromedios.convertRowIndexToModel(iNumRowSeleccionado)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					ingresospromediosLocal =(IngresosPromedios) this.ingresospromedioss.toArray()[this.jTableDatosIngresosPromedios.convertRowIndexToModel(iNumRowSeleccionado)];
				}
				
				ingresospromediosLocal.setIsSelected(this.isSeleccionados);
			}
			
			/*
			if(sTipoSeleccionar.equals("SELECCIONAR")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(IngresosPromedios ingresospromediosAux:this.ingresospromediosLogic.getIngresosPromedioss()) {
						ingresospromediosAux.setIsSelected(this.isSeleccionados);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(IngresosPromedios ingresospromediosAux:ingresospromedioss) {
						ingresospromediosAux.setIsSelected(this.isSeleccionados);
					}
				}
			}
			*/
			
			//if(existe) {
				this.inicializarActualizarBindingTablaIngresosPromedios(false);
			/*
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			*/
			
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosIngresosPromedios.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosIngresosPromedios.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosIngresosPromedios,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,IngresosPromediosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarActualIngresosPromediosItemListener(ItemEvent evt,Long idActual) throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,IngresosPromediosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void ejecutarAuxiliarIngresosPromediosParaAjaxPostBack() throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,IngresosPromediosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jTextFieldValorCampoGeneralIngresosPromediosActionListener(ActionEvent evt) throws Exception {    		
		try {
			this.inicializarActualizarBindingIngresosPromedios(false,false);
			
			//System.out.println(this.jTextFieldValorCampoGeneralIngresosPromedios.getText());		
			
			Boolean existe=false;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(IngresosPromedios ingresospromediosAux:this.ingresospromediosLogic.getIngresosPromedioss()) {
				
						if(sTipoSeleccionar.equals(IngresosPromediosConstantesFunciones.LABEL_CODIGO)) {
							existe=true;
							ingresospromediosAux.setcodigo(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(IngresosPromediosConstantesFunciones.LABEL_CODIGOCARGO)) {
							existe=true;
							ingresospromediosAux.setcodigo_cargo(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(IngresosPromediosConstantesFunciones.LABEL_CODIGODATO)) {
							existe=true;
							ingresospromediosAux.setcodigo_dato(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(IngresosPromediosConstantesFunciones.LABEL_NOMBRE)) {
							existe=true;
							ingresospromediosAux.setnombre(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(IngresosPromediosConstantesFunciones.LABEL_VALORPAGO)) {
							existe=true;
							ingresospromediosAux.setvalor_pago(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(IngresosPromediosConstantesFunciones.LABEL_NOMBRERUBROEMPLEA)) {
							existe=true;
							ingresospromediosAux.setnombre_rubro_emplea(this.sValorCampoGeneral);
						}
				}	
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(IngresosPromedios ingresospromediosAux:ingresospromedioss) {
					
						if(sTipoSeleccionar.equals(IngresosPromediosConstantesFunciones.LABEL_CODIGO)) {
							existe=true;
							ingresospromediosAux.setcodigo(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(IngresosPromediosConstantesFunciones.LABEL_CODIGOCARGO)) {
							existe=true;
							ingresospromediosAux.setcodigo_cargo(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(IngresosPromediosConstantesFunciones.LABEL_CODIGODATO)) {
							existe=true;
							ingresospromediosAux.setcodigo_dato(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(IngresosPromediosConstantesFunciones.LABEL_NOMBRE)) {
							existe=true;
							ingresospromediosAux.setnombre(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(IngresosPromediosConstantesFunciones.LABEL_VALORPAGO)) {
							existe=true;
							ingresospromediosAux.setvalor_pago(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(IngresosPromediosConstantesFunciones.LABEL_NOMBRERUBROEMPLEA)) {
							existe=true;
							ingresospromediosAux.setnombre_rubro_emplea(this.sValorCampoGeneral);
						}
				}
			}
								
			if(existe) {
				this.inicializarActualizarBindingTablaIngresosPromedios(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,IngresosPromediosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jComboBoxTiposAccionesIngresosPromediosActionListener(ActionEvent evt,Boolean esParaAccionDesdeFormulario) throws Exception {    				
		Boolean conSplash=true;
		
		try {							
		
			this.inicializarActualizarBindingIngresosPromedios(false,false);
			
			Reporte reporte=new Reporte();
			
			this.esParaAccionDesdeFormularioIngresosPromedios=esParaAccionDesdeFormulario;
			
			if(!esParaAccionDesdeFormulario) {
				
				reporte=(Reporte)this.jComboBoxTiposAccionesIngresosPromedios.getSelectedItem();
				
			} else {
				reporte=(Reporte)this.jInternalFrameDetalleFormIngresosPromedios.jComboBoxTiposAccionesFormularioIngresosPromedios.getSelectedItem();
			}
			String sTipoAccionLocal=this.sTipoAccion;
			
			if(!esParaAccionDesdeFormulario) {
				sTipoAccionLocal=this.sTipoAccion;
			} else {
				sTipoAccionLocal=this.sTipoAccionFormulario;
			}
			
			if(sTipoAccionLocal.equals("GENERAR REPORTE")) {//reporte.getsCodigo().equals("GENERAR REPORTE")) {
				if(this.isPermisoReporteIngresosPromedios) {				
					conSplash=true;//false;										
					
					//this.startProcessIngresosPromedios(conSplash);
				
					this.generarReporteIngresosPromediossSeleccionados();
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesIngresosPromedios.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormIngresosPromedios.jComboBoxTiposAccionesFormularioIngresosPromedios.setSelectedIndex(0);					
				}
			} else if(sTipoAccionLocal.equals("GENERAR REPORTE DINAMICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.mostrarReporteDinamicoIngresosPromediossSeleccionados();
				//this.jComboBoxTiposAccionesIngresosPromedios.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("GENERAR_REPORTE_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoIngresosPromediossSeleccionados(false);
				//this.jComboBoxTiposAccionesIngresosPromedios.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("GENERAR_REPORTE_TOTALES_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoIngresosPromediossSeleccionados(true);
				//this.jComboBoxTiposAccionesIngresosPromedios.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessIngresosPromedios();
				
				this.exportarIngresosPromediossSeleccionados();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesIngresosPromedios.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormIngresosPromedios.jComboBoxTiposAccionesFormularioIngresosPromedios.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("IMPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				this.mostrarImportacionIngresosPromedioss();
				//this.importarIngresosPromedioss();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesIngresosPromedios.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormIngresosPromedios.jComboBoxTiposAccionesFormularioIngresosPromedios.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS_EXCEL")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessIngresosPromedios();
				//SE EXPORTA SEGUN TIPO ARCHIVO SELECCIONADO
				//this.exportarExcelIngresosPromediossSeleccionados();
				//this.jComboBoxTiposAccionesIngresosPromedios.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("RECARGAR_FK")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {								
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE RECARGAR REFERENCIAS ?", "MANTENIMIENTO DE Ingresos Promedios", JOptionPane.OK_CANCEL_OPTION) == 0) {
				
				//this.startProcessIngresosPromedios();
				
					if(!esParaAccionDesdeFormulario || (esParaAccionDesdeFormulario && this.isEsNuevoIngresosPromedios)) {
						this.esRecargarFks=true;
						this.cargarCombosForeignKeyIngresosPromedios(false,false,false);
						this.esRecargarFks=false;
						
						JOptionPane.showMessageDialog(this,"PROCESO EJECUTADO CORRECTAMENTE","MANTENIMIENTO DE Ingresos Promedios",JOptionPane.INFORMATION_MESSAGE);
					} else {
						JOptionPane.showMessageDialog(this,"ESTE PROCESO SOLO FUNCIONA AL INGRESAR UN NUEVO ELEMENTO","MANTENIMIENTO",JOptionPane.ERROR_MESSAGE);	
					}
					
					
				}
				
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesIngresosPromedios.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormIngresosPromedios.jComboBoxTiposAccionesFormularioIngresosPromedios.setSelectedIndex(0);					
				}	
			} 			
			else if(IngresosPromediosBeanSwingJInternalFrame.EsProcesoReporte(reporte.getsCodigo())){
				if(this.isPermisoReporteIngresosPromedios) {				
					if(this.tieneElementosSeleccionados()) {
						this.quitarFilaTotales();
						
						conSplash=false;
						
						//this.startProcessIngresosPromedios(conSplash);
					
						//this.actualizarParametrosGeneralIngresosPromedios();
						
						this.generarReporteProcesoAccionIngresosPromediossSeleccionados(reporte.getsCodigo());
						
						if(!esParaAccionDesdeFormulario) {
							
							this.jComboBoxTiposAccionesIngresosPromedios.setSelectedIndex(0);					
							
						} else {
							this.jInternalFrameDetalleFormIngresosPromedios.jComboBoxTiposAccionesFormularioIngresosPromedios.setSelectedIndex(0);					
						}
					} else {
						JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
			} 
			else if(IngresosPromediosBeanSwingJInternalFrameAdditional.EsProcesoAccionNormal(reporte.getsCodigo())){
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR "+reporte.getsDescripcion()+" EN PROCESO Ingresos PromediosES SELECCIONADOS?", "MANTENIMIENTO DE Ingresos Promedios", JOptionPane.OK_CANCEL_OPTION) == 0) {
						//this.startProcessIngresosPromedios();
				
						this.actualizarParametrosGeneralIngresosPromedios();
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {						
							this.ingresospromediosReturnGeneral=ingresospromediosLogic.procesarAccionIngresosPromediossWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,sTipoAccionLocal,this.ingresospromediosLogic.getIngresosPromedioss(),this.ingresospromediosParameterGeneral);
						
						} else if(Constantes.ISUSAEJBREMOTE) {
						
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
						this.procesarIngresosPromediosReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesIngresosPromedios.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormIngresosPromedios.jComboBoxTiposAccionesFormularioIngresosPromedios.setSelectedIndex(0);					
					}
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}				
			} 
			else {
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					this.actualizarParametrosGeneralIngresosPromedios();
					
					IngresosPromediosBeanSwingJInternalFrameAdditional.ProcesarAccion(reporte.getsCodigo(),reporte.getsDescripcion(),this);
					
					this.procesarIngresosPromediosReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesIngresosPromedios.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormIngresosPromedios.jComboBoxTiposAccionesFormularioIngresosPromedios.setSelectedIndex(0);					
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}
			}
		} catch(Exception e) {
			this.esRecargarFks=false;
			
			FuncionesSwing.manageException(this, e,logger,IngresosPromediosConstantesFunciones.CLASSNAME);
		
		}  finally {
      		//this.finishProcessIngresosPromedios(conSplash);
      	}
	}
	
	public void jComboBoxTiposRelacionesIngresosPromediosActionListener(ActionEvent evt) throws Exception {    				
		Boolean conSplash=true;
		
		try {			
			this.startProcessIngresosPromedios();
			
			if(this.jInternalFrameDetalleFormIngresosPromedios==null) { //if(!this.conCargarFormDetalle) {			
				this.inicializarFormDetalle();
			}
			
			ArrayList<IngresosPromedios> ingresospromediossSeleccionados=new ArrayList<IngresosPromedios>();		
			IngresosPromedios ingresospromedios=new IngresosPromedios();
			
			int rowIndex=-1;//CON ESTO SE DESHABILITA SELECCION POR INDICE
			
			this.inicializarActualizarBindingIngresosPromedios(false,false);
			
			Reporte reporte=new Reporte();
			
			
			reporte=(Reporte)this.jComboBoxTiposRelacionesIngresosPromedios.getSelectedItem();
			
			
			
			
			ingresospromediossSeleccionados=this.getIngresosPromediossSeleccionados(true);
			//this.sTipoAccion;
			
			if(ingresospromediossSeleccionados.size()==1) {
				for(IngresosPromedios ingresospromediosAux:ingresospromediossSeleccionados) {
					ingresospromedios=ingresospromediosAux;
				}
				
				if(this.sTipoAccion.equals("NONE")) {
				
				}
				
			} else {
				JOptionPane.showMessageDialog(this,"SELECCIONE SOLO UN REGISTRO","RELACIONES",JOptionPane.ERROR_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,IngresosPromediosConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.finishProcessIngresosPromedios();
			
      		//this.finishProcessIngresosPromedios(conSplash);
      	}
	}
			
	public static Boolean EsProcesoReporte(String sTipoProceso) throws Exception {
		Boolean esProcesoAccionRepoorte=false;

		if(sTipoProceso.contains("REPORTE_")) {
			 esProcesoAccionRepoorte=true;
		}

		return esProcesoAccionRepoorte;
	}
	
	public void procesarIngresosPromediosReturnGeneral() throws Exception {
		if(this.ingresospromediosReturnGeneral.getConRetornoEstaProcesado()) {
			JOptionPane.showMessageDialog(this,this.ingresospromediosReturnGeneral.getsMensajeProceso(),"PROCESO",JOptionPane.INFORMATION_MESSAGE);
		}
		
		if(this.ingresospromediosReturnGeneral.getConMostrarMensaje()) {
			JOptionPane.showMessageDialog(this,this.ingresospromediosReturnGeneral.getsMensajeProceso(),"PROCESO",FuncionesSwing.getColorSelectedBackground(this.ingresospromediosReturnGeneral.getsTipoMensaje()));
		}
		
		if(this.ingresospromediosReturnGeneral.getConRecargarInformacion()) {
			this.procesarBusqueda(this.sAccionBusqueda);
			
			this.inicializarActualizarBindingIngresosPromedios(false);
		}
		
		if(this.ingresospromediosReturnGeneral.getConRetornoLista() || this.ingresospromediosReturnGeneral.getConRetornoObjeto()) {
			if(this.ingresospromediosReturnGeneral.getConRetornoLista()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.ingresospromediosLogic.setIngresosPromedioss(this.ingresospromediosReturnGeneral.getIngresosPromedioss());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			
			this.inicializarActualizarBindingIngresosPromedios(false);
		}
	}
	
	public void actualizarParametrosGeneralIngresosPromedios() throws Exception {
		
		
	}
	
	public ArrayList<IngresosPromedios> getIngresosPromediossSeleccionados(Boolean conSeleccionarTodosAutomatico) throws Exception {
		ArrayList<IngresosPromedios> ingresospromediossSeleccionados=new ArrayList<IngresosPromedios>();
		Boolean existe=false;
		
		if(!this.esParaAccionDesdeFormularioIngresosPromedios) {
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				
				for(IngresosPromedios ingresospromediosAux:ingresospromediosLogic.getIngresosPromedioss()) {
					if(ingresospromediosAux.getIsSelected()) {
						ingresospromediossSeleccionados.add(ingresospromediosAux);				
					}
				}
				
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(IngresosPromedios ingresospromediosAux:this.ingresospromedioss) {
					if(ingresospromediosAux.getIsSelected()) {
						ingresospromediossSeleccionados.add(ingresospromediosAux);				
					}
				}
			}
			
			if(ingresospromediossSeleccionados.size()>0) {
				existe=true;
			}
			
			//SI NO ESTA NINGUNO SELECCIONADO SE SELECCIONA TODOS
			if(!existe) {
				if(conSeleccionarTodosAutomatico) {
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						ingresospromediossSeleccionados.addAll(this.ingresospromediosLogic.getIngresosPromedioss());
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						ingresospromediossSeleccionados.addAll(this.ingresospromedioss);				
					}
				}
			}
		} else {
			ingresospromediossSeleccionados.add(this.ingresospromedios);
		}
		
		return ingresospromediossSeleccionados;
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
	
	public void generarReporteIngresosPromediossSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoReporte.equals("NORMAL") || this.sTipoReporte.equals("FORMULARIO")) {
			existe=true;								
			this.generarReporteNormalIngresosPromediossSeleccionados();
			
		} else if(this.sTipoReporte.equals("DINAMICO")) {
			existe=true;
			this.mostrarReporteDinamicoIngresosPromediossSeleccionados();
			
		} else if(this.sTipoReporte.equals("GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoIngresosPromediossSeleccionados(false);
			
		} else if(this.sTipoReporte.equals("TOTALES_GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoIngresosPromediossSeleccionados(true);
		}
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE REPORTE VALIDO","REPORTE DE Ingresos Promedios",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void generarReporteRelacionesIngresosPromediossSeleccionados() throws Exception {
		ArrayList<IngresosPromedios> ingresospromediossSeleccionados=new ArrayList<IngresosPromedios>();		
		
		ingresospromediossSeleccionados=this.getIngresosPromediossSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
					
		//this.sTipoReporteExtra="MasterRelaciones";
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		
		this.generarReporteIngresosPromedioss("Todos",ingresospromediossSeleccionados);
		
	}	
	
	public void generarReporteNormalIngresosPromediossSeleccionados() throws Exception {
		ArrayList<IngresosPromedios> ingresospromediossSeleccionados=new ArrayList<IngresosPromedios>();		
		
		ingresospromediossSeleccionados=this.getIngresosPromediossSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
								
		if(this.sTipoReporte.equals("FORMULARIO")) {
			this.sTipoReporteExtra="Vertical";					
		}
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.generarReporteIngresosPromedioss("Todos",ingresospromediossSeleccionados);
	}		
	
	public void generarReporteProcesoAccionIngresosPromediossSeleccionados(String sProcesoReporte) throws Exception {
		ArrayList<IngresosPromedios> ingresospromediossSeleccionados=new ArrayList<IngresosPromedios>();
		
		ingresospromediossSeleccionados=this.getIngresosPromediossSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(false,false,true,"");
		
		/*
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.sTipoReporteExtra=sProcesoReporte.toLowerCase();
		
		this.esReporteAccionProceso=true;
		this.generarReporteIngresosPromedioss("Todos",ingresospromediossSeleccionados);
		this.esReporteAccionProceso=false;
	}
	
	
	public void mostrarReporteDinamicoIngresosPromediossSeleccionados() throws Exception {
		ArrayList<IngresosPromedios> ingresospromediossSeleccionados=new ArrayList<IngresosPromedios>();		
		
		
		this.abrirInicializarFrameReporteDinamicoIngresosPromedios();
		
		
		ingresospromediossSeleccionados=this.getIngresosPromediossSeleccionados(true);
		
		this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirFrameReporteDinamicoIngresosPromedios();
		
		
		//this.generarReporteIngresosPromedioss("Todos",ingresospromediossSeleccionados ,ingresospromediosImplementable,ingresospromediosImplementableHome);
	}
	
	public void mostrarImportacionIngresosPromedioss() throws Exception {
		//this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirInicializarFrameImportacionIngresosPromedios();
		
		this.abrirFrameImportacionIngresosPromedios();		
		
			
		//this.generarReporteIngresosPromedioss("Todos",ingresospromediossSeleccionados ,ingresospromediosImplementable,ingresospromediosImplementableHome);
	}
	
	public void importarIngresosPromedioss() throws Exception {		
	
	}
	
	public void exportarIngresosPromediossSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoArchivoReporte.equals("EXCEL")) {
			existe=true;
			this.exportarExcelIngresosPromediossSeleccionados();
			
		} else if(this.sTipoArchivoReporte.equals("TEXTO")) {
			existe=true;
			this.exportarTextoIngresosPromediossSeleccionados();
		
		} else if(this.sTipoArchivoReporte.equals("XML")) {
			existe=true;
			this.exportarXmlIngresosPromediossSeleccionados();
		} 
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE ARCHIVO VALIDO","EXPORTACION DE Ingresos Promedios",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void exportarTextoIngresosPromediossSeleccionados() throws Exception {
		ArrayList<IngresosPromedios> ingresospromediossSeleccionados=new ArrayList<IngresosPromedios>();		
		
		ingresospromediossSeleccionados=this.getIngresosPromediossSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"ingresospromedios."+"txt";//Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario);
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		BufferedWriter bufferedWriter = null;
		FileWriter fileWriter=null;
		
		fileWriter=new FileWriter(sPath);
		
		bufferedWriter = new BufferedWriter(fileWriter);
		
		try {
			if(conCabecera) {
				sFilaCabecera=this.getFilaCabeceraExportarIngresosPromedios(sDelimiter);
				
				bufferedWriter.write(sFilaCabecera);
			}				
			
			for(IngresosPromedios ingresospromediosAux:ingresospromediossSeleccionados) {
				sFilaDatos=this.getFilaDatosExportarIngresosPromedios(ingresospromediosAux,sDelimiter);
				
				bufferedWriter.write(sFilaDatos);
				
				//ingresospromediosAux.setsDetalleGeneralEntityReporte(ingresospromediosAux.toString());			
			}
			
			bufferedWriter.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.ingresospromediosSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Ingresos Promedios",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {
       		if (bufferedWriter != null) {
				bufferedWriter.close();
			}
		}
	}
	
	public String getFilaCabeceraExportarIngresosPromedios(String sDelimiter) {
		String sFilaCabecera="";
		
		
		sFilaCabecera+=IngresosPromediosConstantesFunciones.LABEL_ID;

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaCabecera+=sDelimiter;
		sFilaCabecera+=IngresosPromediosConstantesFunciones.LABEL_VERSIONROW;
		}

		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=IngresosPromediosConstantesFunciones.LABEL_IDESTRUCTURA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=IngresosPromediosConstantesFunciones.LABEL_CODIGO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=IngresosPromediosConstantesFunciones.LABEL_IDEMPRESA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=IngresosPromediosConstantesFunciones.LABEL_IDANIO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=IngresosPromediosConstantesFunciones.LABEL_IDMES;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=IngresosPromediosConstantesFunciones.LABEL_CODIGOCARGO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=IngresosPromediosConstantesFunciones.LABEL_CODIGODATO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=IngresosPromediosConstantesFunciones.LABEL_NOMBRE;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=IngresosPromediosConstantesFunciones.LABEL_VALORPAGO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=IngresosPromediosConstantesFunciones.LABEL_NOMBRERUBROEMPLEA;
		
		return sFilaCabecera;
	}
	
	public String getFilaDatosExportarIngresosPromedios(IngresosPromedios ingresospromedios,String sDelimiter) {
		String sFilaDatos="";
		
		sFilaDatos+="\r\n";
		
		
		sFilaDatos+=ingresospromedios.getId().toString();

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaDatos+=sDelimiter;
		sFilaDatos+=ingresospromedios.getVersionRow().toString();
		}

		sFilaDatos+=sDelimiter;
		sFilaDatos+=ingresospromedios.getestructura_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=ingresospromedios.getcodigo();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=ingresospromedios.getempresa_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=ingresospromedios.getanio_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=ingresospromedios.getmes_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=ingresospromedios.getcodigo_cargo();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=ingresospromedios.getcodigo_dato();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=ingresospromedios.getnombre();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=ingresospromedios.getvalor_pago().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=ingresospromedios.getnombre_rubro_emplea();
		
		return sFilaDatos;
	}
	
	//@SuppressWarnings("deprecation")
	public void exportarExcelIngresosPromediossSeleccionados() throws Exception {
		ArrayList<IngresosPromedios> ingresospromediossSeleccionados=new ArrayList<IngresosPromedios>();		
		
		ingresospromediossSeleccionados=this.getIngresosPromediossSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"ingresospromedios.xls";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		FileOutputStream fileOutputStream=null;
		
		try {
			HSSFWorkbook workbook = new HSSFWorkbook();
			HSSFSheet sheet = workbook.createSheet("IngresosPromedioss");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			HSSFRow row = sheet.createRow(iRow);
			HSSFCell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");

			if(conCabecera) {
				this.getFilaCabeceraExportarExcelIngresosPromedios(row);				
				iRow++;
			}				
			
			for(IngresosPromedios ingresospromediosAux:ingresospromediossSeleccionados) {
				row = sheet.createRow(iRow);
				
				this.getFilaDatosExportarExcelIngresosPromedios(ingresospromediosAux,row);
				
				iRow++;
			}
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.ingresospromediosSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Ingresos Promedios",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			
       		if (fileOutputStream != null) {
				fileOutputStream.close();
			}			
		}
	}		
	
	public void exportarXmlIngresosPromediossSeleccionados() throws Exception {
		ArrayList<IngresosPromedios> ingresospromediossSeleccionados=new ArrayList<IngresosPromedios>();		
		
		ingresospromediossSeleccionados=this.getIngresosPromediossSeleccionados(true);
		
		//String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		//Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		//String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"ingresospromedios.xml";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		DocumentBuilderFactory documentBuilderFactory=null;
		DocumentBuilder documentBuilder =null;
		
		try {
			documentBuilderFactory = DocumentBuilderFactory.newInstance();
			documentBuilder = documentBuilderFactory.newDocumentBuilder();
	
			Document document = documentBuilder.newDocument();
			Element elementRoot = document.createElement("ingresospromedioss");
			
			document.appendChild(elementRoot);
		    			
												
			Element element = null;//document.createElement("ingresospromedios");
			//elementRoot.appendChild(element);
		
			for(IngresosPromedios ingresospromediosAux:ingresospromediossSeleccionados) {
				element = document.createElement("ingresospromedios");
				elementRoot.appendChild(element);
			
				this.setFilaDatosExportarXmlIngresosPromedios(ingresospromediosAux,document,element);
			}
			
			TransformerFactory transformerFactory = TransformerFactory.newInstance();
			Transformer transformer = transformerFactory.newTransformer();
			DOMSource domSource = new DOMSource(document);
			
			StreamResult streamResult = new StreamResult(new File(sPath));
	
			transformer.transform(domSource, streamResult);
						
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.ingresospromediosSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Ingresos Promedios",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			       				
		}
	}	
	
	//@SuppressWarnings("deprecation")
	public void getFilaCabeceraExportarExcelIngresosPromedios(HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(IngresosPromediosConstantesFunciones.LABEL_ID);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
		cell = row.createCell(iColumn++);cell.setCellValue(IngresosPromediosConstantesFunciones.LABEL_VERSIONROW);
		}

		cell = row.createCell(iColumn++);cell.setCellValue(IngresosPromediosConstantesFunciones.LABEL_IDESTRUCTURA);
		cell = row.createCell(iColumn++);cell.setCellValue(IngresosPromediosConstantesFunciones.LABEL_CODIGO);
		cell = row.createCell(iColumn++);cell.setCellValue(IngresosPromediosConstantesFunciones.LABEL_IDEMPRESA);
		cell = row.createCell(iColumn++);cell.setCellValue(IngresosPromediosConstantesFunciones.LABEL_IDANIO);
		cell = row.createCell(iColumn++);cell.setCellValue(IngresosPromediosConstantesFunciones.LABEL_IDMES);
		cell = row.createCell(iColumn++);cell.setCellValue(IngresosPromediosConstantesFunciones.LABEL_CODIGOCARGO);
		cell = row.createCell(iColumn++);cell.setCellValue(IngresosPromediosConstantesFunciones.LABEL_CODIGODATO);
		cell = row.createCell(iColumn++);cell.setCellValue(IngresosPromediosConstantesFunciones.LABEL_NOMBRE);
		cell = row.createCell(iColumn++);cell.setCellValue(IngresosPromediosConstantesFunciones.LABEL_VALORPAGO);
		cell = row.createCell(iColumn++);cell.setCellValue(IngresosPromediosConstantesFunciones.LABEL_NOMBRERUBROEMPLEA);
	}
	
	//@SuppressWarnings("deprecation")
	public void getFilaDatosExportarExcelIngresosPromedios(IngresosPromedios ingresospromedios,HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(ingresospromedios.getId());
		cell = row.createCell(iColumn++);cell.setCellValue(ingresospromedios.getestructura_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(ingresospromedios.getcodigo());
		cell = row.createCell(iColumn++);cell.setCellValue(ingresospromedios.getempresa_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(ingresospromedios.getanio_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(ingresospromedios.getmes_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(ingresospromedios.getcodigo_cargo());
		cell = row.createCell(iColumn++);cell.setCellValue(ingresospromedios.getcodigo_dato());
		cell = row.createCell(iColumn++);cell.setCellValue(ingresospromedios.getnombre());
		cell = row.createCell(iColumn++);cell.setCellValue(ingresospromedios.getvalor_pago());
		cell = row.createCell(iColumn++);cell.setCellValue(ingresospromedios.getnombre_rubro_emplea());				
	}
	
	public void setFilaDatosExportarXmlIngresosPromedios(IngresosPromedios ingresospromedios,Document document,Element element) {
		/*
		Element lastname = document.createElement("lastname");
		lastname.appendChild(document.createTextNode("mook kim"));
		element.appendChild(lastname);
		*/
		

		Element elementId = document.createElement(IngresosPromediosConstantesFunciones.ID);
		elementId.appendChild(document.createTextNode(ingresospromedios.getId().toString().trim()));
		element.appendChild(elementId);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){

		Element elementVersionRow = document.createElement(IngresosPromediosConstantesFunciones.VERSIONROW);
		elementVersionRow.appendChild(document.createTextNode(ingresospromedios.getVersionRow().toString().trim()));
		element.appendChild(elementVersionRow);
		}


		Element elementestructura_descripcion = document.createElement(IngresosPromediosConstantesFunciones.IDESTRUCTURA);
		elementestructura_descripcion.appendChild(document.createTextNode(ingresospromedios.getestructura_descripcion()));
		element.appendChild(elementestructura_descripcion);

		Element elementcodigo = document.createElement(IngresosPromediosConstantesFunciones.CODIGO);
		elementcodigo.appendChild(document.createTextNode(ingresospromedios.getcodigo().trim()));
		element.appendChild(elementcodigo);

		Element elementempresa_descripcion = document.createElement(IngresosPromediosConstantesFunciones.IDEMPRESA);
		elementempresa_descripcion.appendChild(document.createTextNode(ingresospromedios.getempresa_descripcion()));
		element.appendChild(elementempresa_descripcion);

		Element elementanio_descripcion = document.createElement(IngresosPromediosConstantesFunciones.IDANIO);
		elementanio_descripcion.appendChild(document.createTextNode(ingresospromedios.getanio_descripcion()));
		element.appendChild(elementanio_descripcion);

		Element elementmes_descripcion = document.createElement(IngresosPromediosConstantesFunciones.IDMES);
		elementmes_descripcion.appendChild(document.createTextNode(ingresospromedios.getmes_descripcion()));
		element.appendChild(elementmes_descripcion);

		Element elementcodigo_cargo = document.createElement(IngresosPromediosConstantesFunciones.CODIGOCARGO);
		elementcodigo_cargo.appendChild(document.createTextNode(ingresospromedios.getcodigo_cargo().trim()));
		element.appendChild(elementcodigo_cargo);

		Element elementcodigo_dato = document.createElement(IngresosPromediosConstantesFunciones.CODIGODATO);
		elementcodigo_dato.appendChild(document.createTextNode(ingresospromedios.getcodigo_dato().trim()));
		element.appendChild(elementcodigo_dato);

		Element elementnombre = document.createElement(IngresosPromediosConstantesFunciones.NOMBRE);
		elementnombre.appendChild(document.createTextNode(ingresospromedios.getnombre().trim()));
		element.appendChild(elementnombre);

		Element elementvalor_pago = document.createElement(IngresosPromediosConstantesFunciones.VALORPAGO);
		elementvalor_pago.appendChild(document.createTextNode(ingresospromedios.getvalor_pago().toString().trim()));
		element.appendChild(elementvalor_pago);

		Element elementnombre_rubro_emplea = document.createElement(IngresosPromediosConstantesFunciones.NOMBRERUBROEMPLEA);
		elementnombre_rubro_emplea.appendChild(document.createTextNode(ingresospromedios.getnombre_rubro_emplea().trim()));
		element.appendChild(elementnombre_rubro_emplea);
	}
	
	public void generarReporteGroupGenericoIngresosPromediossSeleccionados(Boolean soloTotales) throws Exception {
		ArrayList<IngresosPromedios> ingresospromediossSeleccionados=new ArrayList<IngresosPromedios>();
		
		ingresospromediossSeleccionados=this.getIngresosPromediossSeleccionados(true);
		
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
		
		this.setColumnaDescripcionReporteGroupGenericoIngresosPromedios(ingresospromediossSeleccionados);
		
		this.generarReporteIngresosPromedioss("Todos",ingresospromediossSeleccionados);
	}
	
	public void setColumnaDescripcionReporteGroupGenericoIngresosPromedios(ArrayList<IngresosPromedios> ingresospromediossSeleccionados) throws Exception {    		
		try {
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			
			Boolean existe=false;
			
			for(IngresosPromedios ingresospromediosAux:ingresospromediossSeleccionados) {
				ingresospromediosAux.setsDetalleGeneralEntityReporte(ingresospromediosAux.toString());
			
				if(sTipoSeleccionar.equals(IngresosPromediosConstantesFunciones.LABEL_IDESTRUCTURA)) {
					existe=true;
					ingresospromediosAux.setsDescripcionGeneralEntityReporte1(ingresospromediosAux.getestructura_descripcion());
				}
				 else if(sTipoSeleccionar.equals(IngresosPromediosConstantesFunciones.LABEL_CODIGO)) {
					existe=true;
					ingresospromediosAux.setsDescripcionGeneralEntityReporte1(ingresospromediosAux.getcodigo());
				}
				 else if(sTipoSeleccionar.equals(IngresosPromediosConstantesFunciones.LABEL_IDEMPRESA)) {
					existe=true;
					ingresospromediosAux.setsDescripcionGeneralEntityReporte1(ingresospromediosAux.getempresa_descripcion());
				}
				 else if(sTipoSeleccionar.equals(IngresosPromediosConstantesFunciones.LABEL_IDANIO)) {
					existe=true;
					ingresospromediosAux.setsDescripcionGeneralEntityReporte1(ingresospromediosAux.getanio_descripcion());
				}
				 else if(sTipoSeleccionar.equals(IngresosPromediosConstantesFunciones.LABEL_IDMES)) {
					existe=true;
					ingresospromediosAux.setsDescripcionGeneralEntityReporte1(ingresospromediosAux.getmes_descripcion());
				}
				 else if(sTipoSeleccionar.equals(IngresosPromediosConstantesFunciones.LABEL_CODIGOCARGO)) {
					existe=true;
					ingresospromediosAux.setsDescripcionGeneralEntityReporte1(ingresospromediosAux.getcodigo_cargo());
				}
				 else if(sTipoSeleccionar.equals(IngresosPromediosConstantesFunciones.LABEL_CODIGODATO)) {
					existe=true;
					ingresospromediosAux.setsDescripcionGeneralEntityReporte1(ingresospromediosAux.getcodigo_dato());
				}
				 else if(sTipoSeleccionar.equals(IngresosPromediosConstantesFunciones.LABEL_NOMBRE)) {
					existe=true;
					ingresospromediosAux.setsDescripcionGeneralEntityReporte1(ingresospromediosAux.getnombre());
				}
				 else if(sTipoSeleccionar.equals(IngresosPromediosConstantesFunciones.LABEL_NOMBRERUBROEMPLEA)) {
					existe=true;
					ingresospromediosAux.setsDescripcionGeneralEntityReporte1(ingresospromediosAux.getnombre_rubro_emplea());
				}
			}	
											
			if(!existe) {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}										
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,IngresosPromediosConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void actualizarEstadoCeldasBotonesIngresosPromedios(String sAccion,Boolean isGuardarCambiosEnLote,Boolean isEsMantenimientoRelacionado) throws Exception {
		if(sAccion=="n") {
			if(!this.esParaBusquedaForeignKey) {
				this.isVisibilidadCeldaNuevoIngresosPromedios=true;
				this.isVisibilidadCeldaNuevoRelacionesIngresosPromedios=true;
				this.isVisibilidadCeldaGuardarCambiosIngresosPromedios=true;
			}
			
			this.isVisibilidadCeldaModificarIngresosPromedios=false;
			this.isVisibilidadCeldaActualizarIngresosPromedios=false;
			this.isVisibilidadCeldaEliminarIngresosPromedios=false;
			this.isVisibilidadCeldaCancelarIngresosPromedios=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarIngresosPromedios=true;
				} else {
					this.isVisibilidadCeldaGuardarIngresosPromedios=false;
				}
			}
		} else if(sAccion=="a") {
			this.isVisibilidadCeldaNuevoIngresosPromedios=false;
			this.isVisibilidadCeldaNuevoRelacionesIngresosPromedios=false;
			this.isVisibilidadCeldaGuardarCambiosIngresosPromedios=false;
			this.isVisibilidadCeldaModificarIngresosPromedios=false;
			this.isVisibilidadCeldaActualizarIngresosPromedios=true;
			this.isVisibilidadCeldaEliminarIngresosPromedios=false;
			this.isVisibilidadCeldaCancelarIngresosPromedios=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarIngresosPromedios=true;
				} else {
					this.isVisibilidadCeldaGuardarIngresosPromedios=false;
				}
			}
		} else if(sAccion=="ae") {
			this.isVisibilidadCeldaNuevoIngresosPromedios=false;
			this.isVisibilidadCeldaNuevoRelacionesIngresosPromedios=false;
			this.isVisibilidadCeldaGuardarCambiosIngresosPromedios=false;
			this.isVisibilidadCeldaModificarIngresosPromedios=false;
			this.isVisibilidadCeldaActualizarIngresosPromedios=true;
			this.isVisibilidadCeldaEliminarIngresosPromedios=true;
			this.isVisibilidadCeldaCancelarIngresosPromedios=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarIngresosPromedios=true;
				} else {
					this.isVisibilidadCeldaGuardarIngresosPromedios=false;
				}
			}
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {
			this.isVisibilidadCeldaNuevoIngresosPromedios=false;
			this.isVisibilidadCeldaNuevoRelacionesIngresosPromedios=false;
			this.isVisibilidadCeldaGuardarCambiosIngresosPromedios=false;
			this.isVisibilidadCeldaModificarIngresosPromedios=false;
			this.isVisibilidadCeldaActualizarIngresosPromedios=true;
			this.isVisibilidadCeldaEliminarIngresosPromedios=false;
			this.isVisibilidadCeldaCancelarIngresosPromedios=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarIngresosPromedios=false;
				} else {
					this.isVisibilidadCeldaGuardarIngresosPromedios=false;
				}
			}
		} else if(sAccion=="c") {
			this.isVisibilidadCeldaNuevoIngresosPromedios=true;
			this.isVisibilidadCeldaNuevoRelacionesIngresosPromedios=true;
			this.isVisibilidadCeldaGuardarCambiosIngresosPromedios=true;
			this.isVisibilidadCeldaModificarIngresosPromedios=false;
			this.isVisibilidadCeldaActualizarIngresosPromedios=false;
			this.isVisibilidadCeldaEliminarIngresosPromedios=false;
			this.isVisibilidadCeldaCancelarIngresosPromedios=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarIngresosPromedios=true;
				} else {
					this.isVisibilidadCeldaGuardarIngresosPromedios=false;
				}
			}
		} else if(sAccion=="t") {
			this.isVisibilidadCeldaNuevoIngresosPromedios=false;
			this.isVisibilidadCeldaNuevoRelacionesIngresosPromedios=false;
			this.isVisibilidadCeldaGuardarCambiosIngresosPromedios=false;
			this.isVisibilidadCeldaActualizarIngresosPromedios=false;
			this.isVisibilidadCeldaEliminarIngresosPromedios=false;
			this.isVisibilidadCeldaCancelarIngresosPromedios=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarIngresosPromedios=false;
				} else {
					this.isVisibilidadCeldaGuardarIngresosPromedios=false;
				}
			}
		}  else if(sAccion=="s"||sAccion=="s2") {
			this.isVisibilidadCeldaNuevoIngresosPromedios=false;
			this.isVisibilidadCeldaNuevoRelacionesIngresosPromedios=false;
			this.isVisibilidadCeldaGuardarCambiosIngresosPromedios=false;
			this.isVisibilidadCeldaModificarIngresosPromedios=true;
			this.isVisibilidadCeldaActualizarIngresosPromedios=false;
			this.isVisibilidadCeldaEliminarIngresosPromedios=false;
			this.isVisibilidadCeldaCancelarIngresosPromedios=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarIngresosPromedios=false;
				} else {
					this.isVisibilidadCeldaGuardarIngresosPromedios=false;
				}
			}
		}
		
		//ACTUALIZA VISIBILIDAD PANELES
		if(IngresosPromediosJInternalFrame.CON_DATOS_FRAME && !this.esParaBusquedaForeignKey) {
			//SIEMPRE VISIBLE
			this.isVisibilidadCeldaNuevoIngresosPromedios=true;
			this.isVisibilidadCeldaNuevoRelacionesIngresosPromedios=true;
			this.isVisibilidadCeldaGuardarCambiosIngresosPromedios=true;
		} else {
			this.actualizarEstadoPanelsIngresosPromedios(sAccion);						
		}
		
		if(this.esParaBusquedaForeignKey) {
			this.isVisibilidadCeldaCopiarIngresosPromedios=false;
			//this.isVisibilidadCeldaVerFormIngresosPromedios=false;
			this.isVisibilidadCeldaDuplicarIngresosPromedios=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONES
		if(!ingresospromediosSessionBean.getConGuardarRelaciones()) {
			this.isVisibilidadCeldaNuevoRelacionesIngresosPromedios=false;
		} else {
			this.isVisibilidadCeldaNuevoIngresosPromedios=false;
			this.isVisibilidadCeldaGuardarCambiosIngresosPromedios=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONADO
		if(ingresospromediosSessionBean.getEsGuardarRelacionado()) {
			if(!ingresospromediosSessionBean.getConGuardarRelaciones()) {	
				this.isVisibilidadCeldaNuevoRelacionesIngresosPromedios=false;												
			}
			
			this.jButtonCerrarIngresosPromedios.setVisible(false);
		}
		
		//SI NO TIENE MAXIMO DE RELACIONES PERMITIDAS
		if(!this.conMaximoRelaciones) {
			this.isVisibilidadCeldaNuevoRelacionesIngresosPromedios=false;
		}
		
		if(!this.permiteMantenimiento(this.ingresospromedios)) {
			this.isVisibilidadCeldaActualizarIngresosPromedios=false;
			this.isVisibilidadCeldaEliminarIngresosPromedios=false;
		}
		
		
		//SE DESHABILITA SIEMPRE
		this.isVisibilidadCeldaNuevoIngresosPromedios=false;
		this.isVisibilidadCeldaNuevoRelacionesIngresosPromedios=false;
		this.isVisibilidadCeldaGuardarCambiosIngresosPromedios=false;
		//this.isVisibilidadCeldaModificarIngresosPromedios=true;
		this.isVisibilidadCeldaActualizarIngresosPromedios=false;
		this.isVisibilidadCeldaEliminarIngresosPromedios=false;
		//this.isVisibilidadCeldaCancelarIngresosPromedios=true;			
		this.isVisibilidadCeldaGuardarIngresosPromedios=false;
		
	}
	
	public void actualizarEstadoCeldasBotonesConGuardarRelacionesIngresosPromedios() {
	}
	
	public void actualizarEstadoPanelsIngresosPromedios(String sAccion) {
		if(sAccion=="n") {
			if(this.jScrollPanelDatosEdicionIngresosPromedios!=null) {
				this.jScrollPanelDatosEdicionIngresosPromedios.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasIngresosPromedios!=null) {
				this.jTabbedPaneBusquedasIngresosPromedios.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosIngresosPromedios!=null) {
				this.jScrollPanelDatosIngresosPromedios.setVisible(true);
			}
			
			if(this.jPanelPaginacionIngresosPromedios!=null) {
				this.jPanelPaginacionIngresosPromedios.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesIngresosPromedios!=null) {
				this.jPanelParametrosReportesIngresosPromedios.setVisible(true);		    
			}
			
		} else if(sAccion=="a") {				
			if(this.jScrollPanelDatosEdicionIngresosPromedios!=null) {
				this.jScrollPanelDatosEdicionIngresosPromedios.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasIngresosPromedios!=null) {
				this.jTabbedPaneBusquedasIngresosPromedios.setVisible(false);			
			}
			
			
			
			if(this.jScrollPanelDatosIngresosPromedios!=null) {
				this.jScrollPanelDatosIngresosPromedios.setVisible(false);
			}
			
			if(this.jPanelPaginacionIngresosPromedios!=null) {
				this.jPanelPaginacionIngresosPromedios.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesIngresosPromedios!=null) {
				this.jPanelParametrosReportesIngresosPromedios.setVisible(false);
			}
						
		} else if(sAccion=="ae") {		
			if(this.jScrollPanelDatosEdicionIngresosPromedios!=null) {
				this.jScrollPanelDatosEdicionIngresosPromedios.setVisible(true);		
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasIngresosPromedios!=null) {
				this.jTabbedPaneBusquedasIngresosPromedios.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosIngresosPromedios!=null) {
				this.jScrollPanelDatosIngresosPromedios.setVisible(false);
			}
			
			if(this.jPanelPaginacionIngresosPromedios!=null) {
				this.jPanelPaginacionIngresosPromedios.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesIngresosPromedios!=null) {
				this.jPanelParametrosReportesIngresosPromedios.setVisible(false);
			}
						
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {	
			if(this.jScrollPanelDatosEdicionIngresosPromedios!=null) {
				this.jScrollPanelDatosEdicionIngresosPromedios.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasIngresosPromedios!=null) {
				this.jTabbedPaneBusquedasIngresosPromedios.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosIngresosPromedios!=null) {
				this.jScrollPanelDatosIngresosPromedios.setVisible(false);
			}
			
			if(this.jPanelPaginacionIngresosPromedios!=null) {
				this.jPanelPaginacionIngresosPromedios.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesIngresosPromedios!=null) {
				this.jPanelParametrosReportesIngresosPromedios.setVisible(false);
			}
						
		} else if(sAccion=="c") {	
			if(this.jScrollPanelDatosEdicionIngresosPromedios!=null) {
				this.jScrollPanelDatosEdicionIngresosPromedios.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasIngresosPromedios!=null) {
				this.jTabbedPaneBusquedasIngresosPromedios.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosIngresosPromedios!=null) {
				this.jScrollPanelDatosIngresosPromedios.setVisible(true);
			}
			
			if(this.jPanelPaginacionIngresosPromedios!=null) {
				this.jPanelPaginacionIngresosPromedios.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesIngresosPromedios!=null) {
				this.jPanelParametrosReportesIngresosPromedios.setVisible(true);
			}
						
		} else if(sAccion=="t") {
			
			if(this.jScrollPanelDatosEdicionIngresosPromedios!=null) {
				this.jScrollPanelDatosEdicionIngresosPromedios.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasIngresosPromedios!=null) {
				this.jTabbedPaneBusquedasIngresosPromedios.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosIngresosPromedios!=null) {
				this.jScrollPanelDatosIngresosPromedios.setVisible(true);
			}
			
			if(this.jPanelPaginacionIngresosPromedios!=null) {
				this.jPanelPaginacionIngresosPromedios.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesIngresosPromedios!=null) {
				this.jPanelParametrosReportesIngresosPromedios.setVisible(true);
			}
						
		}  else if(sAccion=="s"||sAccion=="s2") {
			if(this.jScrollPanelDatosEdicionIngresosPromedios!=null) {
				this.jScrollPanelDatosEdicionIngresosPromedios.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasIngresosPromedios!=null) {
				this.jTabbedPaneBusquedasIngresosPromedios.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosIngresosPromedios!=null) {
				this.jScrollPanelDatosIngresosPromedios.setVisible(true);
			}
			
			if(this.jPanelPaginacionIngresosPromedios!=null) {
				this.jPanelPaginacionIngresosPromedios.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesIngresosPromedios!=null) {
				this.jPanelParametrosReportesIngresosPromedios.setVisible(true);
			}
			
		} 
		
		if(sAccion.equals("relacionado") || this.ingresospromediosSessionBean.getEsGuardarRelacionado()) {
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				if(this.jTabbedPaneBusquedasIngresosPromedios!=null) {
					this.jTabbedPaneBusquedasIngresosPromedios.setVisible(false);				
				}
				
			}
			
			if(this.jPanelParametrosReportesIngresosPromedios!=null) {
				this.jPanelParametrosReportesIngresosPromedios.setVisible(false);
			}
		
		} else if(sAccion.equals("no_relacionado") && !this.ingresospromediosSessionBean.getEsGuardarRelacionado()) {
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasIngresosPromedios!=null) {
				this.jTabbedPaneBusquedasIngresosPromedios.setVisible(true);			
			}
			
			if(this.jPanelParametrosReportesIngresosPromedios!=null) {
				this.jPanelParametrosReportesIngresosPromedios.setVisible(true);
			}
		}
	}	
	
	

	public void setVisibilidadBusquedasParaEstructura(Boolean isParaEstructura){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaEstructuraNegation=!isParaEstructura;

			this.isVisibilidadBusquedaIngresosPromedios=isParaEstructura;
			if(!this.isVisibilidadBusquedaIngresosPromedios) {this.jTabbedPaneBusquedasIngresosPromedios.remove(jPanelBusquedaIngresosPromediosIngresosPromedios);}
		}
		
	}

	public void setVisibilidadBusquedasParaEmpresa(Boolean isParaEmpresa){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaEmpresaNegation=!isParaEmpresa;

			this.isVisibilidadBusquedaIngresosPromedios=isParaEmpresaNegation;
			if(!this.isVisibilidadBusquedaIngresosPromedios) {this.jTabbedPaneBusquedasIngresosPromedios.remove(jPanelBusquedaIngresosPromediosIngresosPromedios);}
		}
		
	}

	public void setVisibilidadBusquedasParaAnio(Boolean isParaAnio){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaAnioNegation=!isParaAnio;

			this.isVisibilidadBusquedaIngresosPromedios=isParaAnio;
			if(!this.isVisibilidadBusquedaIngresosPromedios) {this.jTabbedPaneBusquedasIngresosPromedios.remove(jPanelBusquedaIngresosPromediosIngresosPromedios);}
		}
		
	}

	public void setVisibilidadBusquedasParaMes(Boolean isParaMes){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaMesNegation=!isParaMes;

			this.isVisibilidadBusquedaIngresosPromedios=isParaMes;
			if(!this.isVisibilidadBusquedaIngresosPromedios) {this.jTabbedPaneBusquedasIngresosPromedios.remove(jPanelBusquedaIngresosPromediosIngresosPromedios);}
		}
		
	}
	
	
	
	
	
	
	public void guardarDatosBusquedaSession() throws Exception {
	}
	
	public void traerDatosBusquedaDesdeSession() throws Exception {
	}
	
	public void procesoActualizarFilaTotales(Boolean esCampoValor,String sTipo) {
		try {
			this.actualizarFilaTotales();
				
			this.traerValoresTablaTotales();
			
			this.inicializarActualizarBindingTablaIngresosPromedios(false);
			
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	public void updateBusquedasFormularioIngresosPromedios() {
		this.updateBorderResaltarBusquedasFormularioIngresosPromedios();
		this.updateVisibilidadBusquedasFormularioIngresosPromedios();
		this.updateHabilitarBusquedasFormularioIngresosPromedios();
	}
	
	public void updateBorderResaltarBusquedasFormularioIngresosPromedios() {					
	//BYDAN_BUSQUEDAS
		
	int index=0;
		
	if(this.jTabbedPaneBusquedasIngresosPromedios.getComponents().length>0) {
	

		if(this.ingresospromediosConstantesFunciones.resaltarBusquedaIngresosPromediosIngresosPromedios!=null) {
			index= this.jTabbedPaneBusquedasIngresosPromedios.indexOfComponent(this.jPanelBusquedaIngresosPromediosIngresosPromedios);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasIngresosPromedios.getComponent(index);
				jPanel.setBorder(this.ingresospromediosConstantesFunciones.resaltarBusquedaIngresosPromediosIngresosPromedios);
			}
		}
	}	
	
	}
	
	public void updateVisibilidadBusquedasFormularioIngresosPromedios() {
	//BYDAN_BUSQUEDAS
	
	int index=0;
	JPanel jPanel=null;
		
	if(this.jTabbedPaneBusquedasIngresosPromedios.getComponents().length>0) {
	

			index= this.jTabbedPaneBusquedasIngresosPromedios.indexOfComponent(this.jPanelBusquedaIngresosPromediosIngresosPromedios);
			jPanel=(JPanel)this.jTabbedPaneBusquedasIngresosPromedios.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.ingresospromediosConstantesFunciones.mostrarBusquedaIngresosPromediosIngresosPromedios);
			if(!this.ingresospromediosConstantesFunciones.mostrarBusquedaIngresosPromediosIngresosPromedios && index>-1) {
				this.jTabbedPaneBusquedasIngresosPromedios.remove(index);
			}
	}	
	
	}
	
	public void updateHabilitarBusquedasFormularioIngresosPromedios() {
	
	//BYDAN_BUSQUEDAS		
		int index=0;
		JPanel jPanel=null;
			
		if(this.jTabbedPaneBusquedasIngresosPromedios.getComponents().length>0) {
	

			index= this.jTabbedPaneBusquedasIngresosPromedios.indexOfComponent(this.jPanelBusquedaIngresosPromediosIngresosPromedios);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedasIngresosPromedios.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.ingresospromediosConstantesFunciones.activarBusquedaIngresosPromediosIngresosPromedios);
				this.jTabbedPaneBusquedasIngresosPromedios.setEnabledAt(index,this.ingresospromediosConstantesFunciones.activarBusquedaIngresosPromediosIngresosPromedios);
			}
		}	
	
	}
	
	
	public void resaltarPanelBusquedaIngresosPromedios(String sTipoBusqueda) {
		Boolean existe=false;
		//BYDAN_BUSQUEDAS
		
		int index=0;
		Border resaltar = Funciones2.getBorderResaltar(this.parametroGeneralUsuario,"TAB");

		if(sTipoBusqueda.equals("BusquedaIngresosPromedios")) {
			index= this.jTabbedPaneBusquedasIngresosPromedios.indexOfComponent(this.jPanelBusquedaIngresosPromediosIngresosPromedios);

			this.jTabbedPaneBusquedasIngresosPromedios.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasIngresosPromedios.getComponent(index);

			this.ingresospromediosConstantesFunciones.setResaltarBusquedaIngresosPromediosIngresosPromedios(resaltar);

			jPanel.setBorder(this.ingresospromediosConstantesFunciones.resaltarBusquedaIngresosPromediosIngresosPromedios);
			existe=true;
		}
		

		if(existe) {
			
			this.jTtoolBarIngresosPromedios.setBorder(resaltar);
			
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
	
	public void updateControlesFormularioIngresosPromedios() throws Exception {

		if(this.jInternalFrameDetalleFormIngresosPromedios==null) { //if(!this.conCargarFormDetalle) {			
			this.inicializarFormDetalle();
		}
		
		this.updateBorderResaltarControlesFormularioIngresosPromedios();
		this.updateVisibilidadResaltarControlesFormularioIngresosPromedios();
		this.updateHabilitarResaltarControlesFormularioIngresosPromedios();
		
	}
	
	public void updateBorderResaltarControlesFormularioIngresosPromedios() throws Exception {
		if(this.jInternalFrameDetalleFormIngresosPromedios==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
	
		if(this.ingresospromediosConstantesFunciones.resaltaridIngresosPromedios!=null && this.jInternalFrameDetalleFormIngresosPromedios!=null) {this.jInternalFrameDetalleFormIngresosPromedios.jLabelidIngresosPromedios.setBorder(this.ingresospromediosConstantesFunciones.resaltaridIngresosPromedios);}
		if(this.ingresospromediosConstantesFunciones.resaltarid_estructuraIngresosPromedios!=null && this.jInternalFrameDetalleFormIngresosPromedios!=null) {this.jInternalFrameDetalleFormIngresosPromedios.jComboBoxid_estructuraIngresosPromedios.setBorder(this.ingresospromediosConstantesFunciones.resaltarid_estructuraIngresosPromedios);}
		if(this.ingresospromediosConstantesFunciones.resaltarcodigoIngresosPromedios!=null && this.jInternalFrameDetalleFormIngresosPromedios!=null) {this.jInternalFrameDetalleFormIngresosPromedios.jTextFieldcodigoIngresosPromedios.setBorder(this.ingresospromediosConstantesFunciones.resaltarcodigoIngresosPromedios);}
		if(this.ingresospromediosConstantesFunciones.resaltarid_empresaIngresosPromedios!=null && this.jInternalFrameDetalleFormIngresosPromedios!=null) {this.jInternalFrameDetalleFormIngresosPromedios.jComboBoxid_empresaIngresosPromedios.setBorder(this.ingresospromediosConstantesFunciones.resaltarid_empresaIngresosPromedios);}
		if(this.ingresospromediosConstantesFunciones.resaltarid_anioIngresosPromedios!=null && this.jInternalFrameDetalleFormIngresosPromedios!=null) {this.jInternalFrameDetalleFormIngresosPromedios.jComboBoxid_anioIngresosPromedios.setBorder(this.ingresospromediosConstantesFunciones.resaltarid_anioIngresosPromedios);}
		if(this.ingresospromediosConstantesFunciones.resaltarid_mesIngresosPromedios!=null && this.jInternalFrameDetalleFormIngresosPromedios!=null) {this.jInternalFrameDetalleFormIngresosPromedios.jComboBoxid_mesIngresosPromedios.setBorder(this.ingresospromediosConstantesFunciones.resaltarid_mesIngresosPromedios);}
		if(this.ingresospromediosConstantesFunciones.resaltarcodigo_cargoIngresosPromedios!=null && this.jInternalFrameDetalleFormIngresosPromedios!=null) {this.jInternalFrameDetalleFormIngresosPromedios.jTextFieldcodigo_cargoIngresosPromedios.setBorder(this.ingresospromediosConstantesFunciones.resaltarcodigo_cargoIngresosPromedios);}
		if(this.ingresospromediosConstantesFunciones.resaltarcodigo_datoIngresosPromedios!=null && this.jInternalFrameDetalleFormIngresosPromedios!=null) {this.jInternalFrameDetalleFormIngresosPromedios.jTextFieldcodigo_datoIngresosPromedios.setBorder(this.ingresospromediosConstantesFunciones.resaltarcodigo_datoIngresosPromedios);}
		if(this.ingresospromediosConstantesFunciones.resaltarnombreIngresosPromedios!=null && this.jInternalFrameDetalleFormIngresosPromedios!=null) {this.jInternalFrameDetalleFormIngresosPromedios.jTextAreanombreIngresosPromedios.setBorder(this.ingresospromediosConstantesFunciones.resaltarnombreIngresosPromedios);}
		if(this.ingresospromediosConstantesFunciones.resaltarvalor_pagoIngresosPromedios!=null && this.jInternalFrameDetalleFormIngresosPromedios!=null) {this.jInternalFrameDetalleFormIngresosPromedios.jTextFieldvalor_pagoIngresosPromedios.setBorder(this.ingresospromediosConstantesFunciones.resaltarvalor_pagoIngresosPromedios);}
		if(this.ingresospromediosConstantesFunciones.resaltarnombre_rubro_empleaIngresosPromedios!=null && this.jInternalFrameDetalleFormIngresosPromedios!=null) {this.jInternalFrameDetalleFormIngresosPromedios.jTextAreanombre_rubro_empleaIngresosPromedios.setBorder(this.ingresospromediosConstantesFunciones.resaltarnombre_rubro_empleaIngresosPromedios);}
	}
	
	public void updateVisibilidadResaltarControlesFormularioIngresosPromedios() throws Exception {		
		if(this.jInternalFrameDetalleFormIngresosPromedios==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormIngresosPromedios!=null) {
	
		//this.jInternalFrameDetalleFormIngresosPromedios.jLabelidIngresosPromedios.setVisible(this.ingresospromediosConstantesFunciones.mostraridIngresosPromedios);
		this.jInternalFrameDetalleFormIngresosPromedios.jPanelidIngresosPromedios.setVisible(this.ingresospromediosConstantesFunciones.mostraridIngresosPromedios);
		//this.jInternalFrameDetalleFormIngresosPromedios.jComboBoxid_estructuraIngresosPromedios.setVisible(this.ingresospromediosConstantesFunciones.mostrarid_estructuraIngresosPromedios);
		this.jInternalFrameDetalleFormIngresosPromedios.jPanelid_estructuraIngresosPromedios.setVisible(this.ingresospromediosConstantesFunciones.mostrarid_estructuraIngresosPromedios);
		//this.jInternalFrameDetalleFormIngresosPromedios.jTextFieldcodigoIngresosPromedios.setVisible(this.ingresospromediosConstantesFunciones.mostrarcodigoIngresosPromedios);
		this.jInternalFrameDetalleFormIngresosPromedios.jPanelcodigoIngresosPromedios.setVisible(this.ingresospromediosConstantesFunciones.mostrarcodigoIngresosPromedios);
		//this.jInternalFrameDetalleFormIngresosPromedios.jComboBoxid_empresaIngresosPromedios.setVisible(this.ingresospromediosConstantesFunciones.mostrarid_empresaIngresosPromedios);
		this.jInternalFrameDetalleFormIngresosPromedios.jPanelid_empresaIngresosPromedios.setVisible(this.ingresospromediosConstantesFunciones.mostrarid_empresaIngresosPromedios);
		//this.jInternalFrameDetalleFormIngresosPromedios.jComboBoxid_anioIngresosPromedios.setVisible(this.ingresospromediosConstantesFunciones.mostrarid_anioIngresosPromedios);
		this.jInternalFrameDetalleFormIngresosPromedios.jPanelid_anioIngresosPromedios.setVisible(this.ingresospromediosConstantesFunciones.mostrarid_anioIngresosPromedios);
		//this.jInternalFrameDetalleFormIngresosPromedios.jComboBoxid_mesIngresosPromedios.setVisible(this.ingresospromediosConstantesFunciones.mostrarid_mesIngresosPromedios);
		this.jInternalFrameDetalleFormIngresosPromedios.jPanelid_mesIngresosPromedios.setVisible(this.ingresospromediosConstantesFunciones.mostrarid_mesIngresosPromedios);
		//this.jInternalFrameDetalleFormIngresosPromedios.jTextFieldcodigo_cargoIngresosPromedios.setVisible(this.ingresospromediosConstantesFunciones.mostrarcodigo_cargoIngresosPromedios);
		this.jInternalFrameDetalleFormIngresosPromedios.jPanelcodigo_cargoIngresosPromedios.setVisible(this.ingresospromediosConstantesFunciones.mostrarcodigo_cargoIngresosPromedios);
		//this.jInternalFrameDetalleFormIngresosPromedios.jTextFieldcodigo_datoIngresosPromedios.setVisible(this.ingresospromediosConstantesFunciones.mostrarcodigo_datoIngresosPromedios);
		this.jInternalFrameDetalleFormIngresosPromedios.jPanelcodigo_datoIngresosPromedios.setVisible(this.ingresospromediosConstantesFunciones.mostrarcodigo_datoIngresosPromedios);
		//this.jInternalFrameDetalleFormIngresosPromedios.jTextAreanombreIngresosPromedios.setVisible(this.ingresospromediosConstantesFunciones.mostrarnombreIngresosPromedios);
		this.jInternalFrameDetalleFormIngresosPromedios.jPanelnombreIngresosPromedios.setVisible(this.ingresospromediosConstantesFunciones.mostrarnombreIngresosPromedios);
		//this.jInternalFrameDetalleFormIngresosPromedios.jTextFieldvalor_pagoIngresosPromedios.setVisible(this.ingresospromediosConstantesFunciones.mostrarvalor_pagoIngresosPromedios);
		this.jInternalFrameDetalleFormIngresosPromedios.jPanelvalor_pagoIngresosPromedios.setVisible(this.ingresospromediosConstantesFunciones.mostrarvalor_pagoIngresosPromedios);
		//this.jInternalFrameDetalleFormIngresosPromedios.jTextAreanombre_rubro_empleaIngresosPromedios.setVisible(this.ingresospromediosConstantesFunciones.mostrarnombre_rubro_empleaIngresosPromedios);
		this.jInternalFrameDetalleFormIngresosPromedios.jPanelnombre_rubro_empleaIngresosPromedios.setVisible(this.ingresospromediosConstantesFunciones.mostrarnombre_rubro_empleaIngresosPromedios);
		}
	}
	
	public void updateHabilitarResaltarControlesFormularioIngresosPromedios() throws Exception {
		if(this.jInternalFrameDetalleFormIngresosPromedios==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormIngresosPromedios!=null) {
	
		this.jInternalFrameDetalleFormIngresosPromedios.jLabelidIngresosPromedios.setEnabled(this.ingresospromediosConstantesFunciones.activaridIngresosPromedios);
		this.jInternalFrameDetalleFormIngresosPromedios.jComboBoxid_estructuraIngresosPromedios.setEnabled(this.ingresospromediosConstantesFunciones.activarid_estructuraIngresosPromedios);
		this.jInternalFrameDetalleFormIngresosPromedios.jTextFieldcodigoIngresosPromedios.setEnabled(this.ingresospromediosConstantesFunciones.activarcodigoIngresosPromedios);
		this.jInternalFrameDetalleFormIngresosPromedios.jComboBoxid_empresaIngresosPromedios.setEnabled(this.ingresospromediosConstantesFunciones.activarid_empresaIngresosPromedios);
		this.jInternalFrameDetalleFormIngresosPromedios.jComboBoxid_anioIngresosPromedios.setEnabled(this.ingresospromediosConstantesFunciones.activarid_anioIngresosPromedios);
		this.jInternalFrameDetalleFormIngresosPromedios.jComboBoxid_mesIngresosPromedios.setEnabled(this.ingresospromediosConstantesFunciones.activarid_mesIngresosPromedios);
		this.jInternalFrameDetalleFormIngresosPromedios.jTextFieldcodigo_cargoIngresosPromedios.setEnabled(this.ingresospromediosConstantesFunciones.activarcodigo_cargoIngresosPromedios);
		this.jInternalFrameDetalleFormIngresosPromedios.jTextFieldcodigo_datoIngresosPromedios.setEnabled(this.ingresospromediosConstantesFunciones.activarcodigo_datoIngresosPromedios);
		this.jInternalFrameDetalleFormIngresosPromedios.jTextAreanombreIngresosPromedios.setEnabled(this.ingresospromediosConstantesFunciones.activarnombreIngresosPromedios);
		this.jInternalFrameDetalleFormIngresosPromedios.jTextFieldvalor_pagoIngresosPromedios.setEnabled(this.ingresospromediosConstantesFunciones.activarvalor_pagoIngresosPromedios);
		this.jInternalFrameDetalleFormIngresosPromedios.jTextAreanombre_rubro_empleaIngresosPromedios.setEnabled(this.ingresospromediosConstantesFunciones.activarnombre_rubro_empleaIngresosPromedios);
		}
	}
	
		
}