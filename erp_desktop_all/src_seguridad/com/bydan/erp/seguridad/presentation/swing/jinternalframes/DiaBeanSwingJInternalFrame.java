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

import com.bydan.erp.seguridad.util.DiaConstantesFunciones;
import com.bydan.erp.seguridad.util.DiaParameterReturnGeneral;
//import com.bydan.erp.seguridad.util.DiaParameterGeneral;
//import com.bydan.erp.seguridad.presentation.report.source.DiaBean;
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

import com.bydan.erp.seguridad.presentation.swing.jinternalframes.auxiliar.*;
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
import com.bydan.erp.seguridad.resources.reportes.AuxiliarReportes;


import com.bydan.erp.seguridad.util.*;
import com.bydan.erp.seguridad.business.logic.*;

import com.bydan.erp.cartera.business.logic.*;
import com.bydan.erp.seguridad.business.logic.*;
import com.bydan.erp.nomina.business.logic.*;
import com.bydan.erp.contabilidad.business.logic.*;
import com.bydan.erp.comisiones.business.logic.*;
import com.bydan.erp.inventario.business.logic.*;
import com.bydan.erp.sris.business.logic.*;
import com.bydan.erp.facturacion.business.logic.*;
import com.bydan.erp.tesoreria.business.logic.*;
import com.bydan.erp.puntoventa.business.logic.*;
import com.bydan.erp.activosfijos.business.logic.*;
import com.bydan.erp.importaciones.business.logic.*;
import com.bydan.erp.produccion.business.logic.*;

//EJB

//PARAMETROS


//EJB PARAMETROS

import com.bydan.framework.erp.business.logic.*;
import com.bydan.framework.erp.util.*;

import com.bydan.erp.seguridad.business.entity.*;
//import com.bydan.framework.erp.business.entity.ConexionBeanFace;
//import com.bydan.framework.erp.business.entity.Mensajes;


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

import com.bydan.erp.cartera.presentation.swing.jinternalframes.auxiliar.*;
import com.bydan.erp.seguridad.presentation.swing.jinternalframes.auxiliar.*;
import com.bydan.erp.nomina.presentation.swing.jinternalframes.auxiliar.*;
import com.bydan.erp.contabilidad.presentation.swing.jinternalframes.auxiliar.*;
import com.bydan.erp.comisiones.presentation.swing.jinternalframes.auxiliar.*;
import com.bydan.erp.inventario.presentation.swing.jinternalframes.auxiliar.*;
import com.bydan.erp.sris.presentation.swing.jinternalframes.auxiliar.*;
import com.bydan.erp.facturacion.presentation.swing.jinternalframes.auxiliar.*;
import com.bydan.erp.tesoreria.presentation.swing.jinternalframes.auxiliar.*;
import com.bydan.erp.puntoventa.presentation.swing.jinternalframes.auxiliar.*;
import com.bydan.erp.activosfijos.presentation.swing.jinternalframes.auxiliar.*;
import com.bydan.erp.importaciones.presentation.swing.jinternalframes.auxiliar.*;
import com.bydan.erp.produccion.presentation.swing.jinternalframes.auxiliar.*;






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


import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;

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


import com.bydan.erp.cartera.business.entity.*;
import com.bydan.erp.seguridad.business.entity.*;
import com.bydan.erp.nomina.business.entity.*;
import com.bydan.erp.contabilidad.business.entity.*;
import com.bydan.erp.comisiones.business.entity.*;
import com.bydan.erp.inventario.business.entity.*;
import com.bydan.erp.sris.business.entity.*;
import com.bydan.erp.facturacion.business.entity.*;
import com.bydan.erp.tesoreria.business.entity.*;
import com.bydan.erp.puntoventa.business.entity.*;
import com.bydan.erp.activosfijos.business.entity.*;
import com.bydan.erp.importaciones.business.entity.*;
import com.bydan.erp.produccion.business.entity.*;
import com.bydan.erp.cartera.util.*;
import com.bydan.erp.seguridad.util.*;
import com.bydan.erp.nomina.util.*;
import com.bydan.erp.contabilidad.util.*;
import com.bydan.erp.comisiones.util.*;
import com.bydan.erp.inventario.util.*;
import com.bydan.erp.sris.util.*;
import com.bydan.erp.facturacion.util.*;
import com.bydan.erp.tesoreria.util.*;
import com.bydan.erp.puntoventa.util.*;
import com.bydan.erp.activosfijos.util.*;
import com.bydan.erp.importaciones.util.*;
import com.bydan.erp.produccion.util.*;
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


@SuppressWarnings("unused")
public class DiaBeanSwingJInternalFrame extends DiaJInternalFrame implements WindowListener,WindowFocusListener
{				
	
	public static final long serialVersionUID = 1L;
	
	public static Logger logger = Logger.getLogger(DiaBeanSwingJInternalFrame.class);  
	
	public static ClassValidator<Dia> diaValidator = new ClassValidator<Dia>(Dia.class);
	
	public InvalidValue[] invalidValues=null;
		

	//Ejb Foreign Keys
	
	public Dia dia;	
	public Dia diaAux;
	public Dia diaAnterior;//USADO PARA MANEJAR FOCUS GAINED,LOST
	public Dia diaTotales;
	public Long idDiaActual;
	public Long iIdNuevoDia=0L;
	public int rowIndexActual=0;
	
	
	
	
		
	
	
	
	
	
	
	
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
	
	public Boolean isPermisoTodoDia;
	public Boolean isPermisoNuevoDia;
	public Boolean isPermisoActualizarDia;
	public Boolean isPermisoActualizarOriginalDia;
	public Boolean isPermisoEliminarDia;
	public Boolean isPermisoGuardarCambiosDia;
	public Boolean isPermisoConsultaDia;
	public Boolean isPermisoBusquedaDia;
	public Boolean isPermisoReporteDia;
	public Boolean isPermisoPaginacionMedioDia;
	public Boolean isPermisoPaginacionAltoDia;
	public Boolean isPermisoPaginacionTodoDia;
	public Boolean isPermisoCopiarDia;
	public Boolean isPermisoVerFormDia;
	public Boolean isPermisoDuplicarDia;
	public Boolean isPermisoOrdenDia;
	
	
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
	
	public DiaParameterReturnGeneral diaReturnGeneral;
	public DiaParameterReturnGeneral diaParameterGeneral;
	
	 	
	public JasperPrint jasperPrint = null;
	
	public Long lIdUsuarioSesion=0L;				
	
	public Boolean isEsNuevoDia=false;
	public Boolean esParaAccionDesdeFormularioDia=false;
	public Boolean isEsMantenimientoRelacionesRelacionadoUnico=false;
	public Boolean isEsMantenimientoRelaciones=false;
	public Boolean isEsMantenimientoRelacionado=false;	
	public Boolean isContieneImagenes=false;
		
	//public Boolean conTotales=false; //Viene heredado de JInternalFrameBase
	//public Boolean esParaBusquedaForeignKey=false;
	
	
	
	
	//ESTA EN PADRE
	
	//public DiaLogic diaLogic;
	public SistemaLogicAdditional sistemaLogicAdditional;
	
	
	public Dia diaBean;
	public DiaConstantesFunciones diaConstantesFunciones;
	//public DiaParameterReturnGeneral diaReturnGeneral;
	
	//FK
	
	
	//PARAMETROS
	
	
	//public List<Dia> dias;	
	//public List<Dia> diasEliminados;
	//public List<Dia> diasAux;
	
	public String sAccionMantenimiento="";
	public String sAccionBusqueda="";
	public String sAccionAdicional="";
	public String sUltimaBusqueda="";
	
	public Mensaje mensaje;
	
	
	public String sVisibilidadTablaBusquedas="";					
	public String sVisibilidadTablaElementos="";	
	public String sVisibilidadTablaAcciones="";			
	
	public Boolean isVisibilidadCeldaNuevoDia=false;
	public Boolean isVisibilidadCeldaDuplicarDia=true;
	public Boolean isVisibilidadCeldaCopiarDia=true;
	public Boolean isVisibilidadCeldaVerFormDia=true;
	public Boolean isVisibilidadCeldaOrdenDia=true;
	public Boolean isVisibilidadCeldaNuevoRelacionesDia=false;
	public Boolean isVisibilidadCeldaModificarDia=false;
	public Boolean isVisibilidadCeldaActualizarDia=false;
	public Boolean isVisibilidadCeldaEliminarDia=false;
	public Boolean isVisibilidadCeldaCancelarDia=false;
	public Boolean isVisibilidadCeldaGuardarDia=false;	
	public Boolean isVisibilidadCeldaGuardarCambiosDia=false;	
	
	
	
	public Long getiIdNuevoDia() {
		return this.iIdNuevoDia;
	}

	public void setiIdNuevoDia(Long iIdNuevoDia) {
		this.iIdNuevoDia = iIdNuevoDia;
	}
	
	public Long getidDiaActual() {
		return this.idDiaActual;
	}

	public void setidDiaActual(Long idDiaActual) {
		this.idDiaActual = idDiaActual;
	}
	
	public int getrowIndexActual() {
		return this.rowIndexActual;
	}

	public void setrowIndexActual(int rowIndexActual) {
		this.rowIndexActual=rowIndexActual;
	}
	
	
	public Dia getdia() {
		return this.dia;
	}

	public void setdia(Dia dia) {
		this.dia = dia;
	}
	
	public Dia getdiaAux() {
		return this.diaAux;
	}

	public void setdiaAux(Dia diaAux) {
		this.diaAux = diaAux;
	}				
	
	public Dia getdiaAnterior() {
		return this.diaAnterior;
	}

	public void setdiaAnterior(Dia diaAnterior) {
		this.diaAnterior = diaAnterior;
	}	
	
	public Dia getdiaTotales() {
		return this.diaTotales;
	}

	public void setdiaTotales(Dia diaTotales) {
		this.diaTotales = diaTotales;
	}	
	
	public Dia getdiaBean() {
		return this.diaBean;
	}

	public void setdiaBean(Dia diaBean) {
		this.diaBean = diaBean;
	}	
	
	public DiaParameterReturnGeneral getdiaReturnGeneral() {
		return this.diaReturnGeneral;
	}

	public void setdiaReturnGeneral(DiaParameterReturnGeneral diaReturnGeneral) {
		this.diaReturnGeneral = diaReturnGeneral;
	}	
	
	
		
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	
	public DiaLogic getDiaLogic()	{		
		return diaLogic;
	}

	public void setDiaLogic(DiaLogic diaLogic) {
		this.diaLogic = diaLogic;
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
	
	public Boolean getIsEsNuevoDia() {
		return isEsNuevoDia;
	}

	public void setIsEsNuevoDia(Boolean isEsNuevoDia) {
		this.isEsNuevoDia = isEsNuevoDia;
	}

	public Boolean getEsParaAccionDesdeFormularioDia() {
		return esParaAccionDesdeFormularioDia;
	}
	
	public void setEsParaAccionDesdeFormularioDia(Boolean esParaAccionDesdeFormularioDia) {
		this.esParaAccionDesdeFormularioDia = esParaAccionDesdeFormularioDia;
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
	
	
	
	
	
	
	
	


	


	


	
	public void refrescarForeignKeysDescripcionesDia() throws Exception {
		//SI FUNCIONA DEEPLOAD ESTO VA AL ULTIMO
		if(Constantes.ISUSAEJBLOGICLAYER) {
			DiaConstantesFunciones.refrescarForeignKeysDescripcionesDia(this.diaLogic.getDias());
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			DiaConstantesFunciones.refrescarForeignKeysDescripcionesDia(this.dias);
		}
		
		/*
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
			
		if(Constantes.ISUSAEJBLOGICLAYER) {
			//USA LOS OBJETOS DE LOGIC DIRECTAMENTE
			//diaLogic.setDias(this.dias);
			diaLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
	
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
		
	public DiaParameterReturnGeneral getDiaParameterGeneral() {
		return this.diaParameterGeneral;
	}
	
	public void setDiaParameterGeneral(DiaParameterReturnGeneral diaParameterGeneral) {
		this.diaParameterGeneral = diaParameterGeneral;
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
	
	public Boolean getIsPermisoTodoDia() {
		return isPermisoTodoDia;
	}

	public void setIsPermisoTodoDia(Boolean isPermisoTodoDia) {
		this.isPermisoTodoDia = isPermisoTodoDia;
	}

	public Boolean getIsPermisoNuevoDia() {
		return isPermisoNuevoDia;
	}

	public void setIsPermisoNuevoDia(Boolean isPermisoNuevoDia) {
		this.isPermisoNuevoDia = isPermisoNuevoDia;
	}

	public Boolean getIsPermisoActualizarDia() {
		return isPermisoActualizarDia;
	}

	public void setIsPermisoActualizarDia(Boolean isPermisoActualizarDia) {
		this.isPermisoActualizarDia = isPermisoActualizarDia;
	}

	public Boolean getIsPermisoEliminarDia() {
		return isPermisoEliminarDia;
	}

	public void setIsPermisoEliminarDia(Boolean isPermisoEliminarDia) {
		this.isPermisoEliminarDia = isPermisoEliminarDia;
	}

	public Boolean getIsPermisoGuardarCambiosDia() {
		return isPermisoGuardarCambiosDia;
	}

	public void setIsPermisoGuardarCambiosDia(Boolean isPermisoGuardarCambiosDia) {
		this.isPermisoGuardarCambiosDia = isPermisoGuardarCambiosDia;
	}
	
	public Boolean getIsPermisoConsultaDia() {
		return isPermisoConsultaDia;
	}

	public void setIsPermisoConsultaDia(Boolean isPermisoConsultaDia) {
		this.isPermisoConsultaDia = isPermisoConsultaDia;
	}

	public Boolean getIsPermisoBusquedaDia() {
		return isPermisoBusquedaDia;
	}

	public void setIsPermisoBusquedaDia(Boolean isPermisoBusquedaDia) {
		this.isPermisoBusquedaDia = isPermisoBusquedaDia;
	}

	public Boolean getIsPermisoReporteDia() {
		return isPermisoReporteDia;
	}

	public void setIsPermisoReporteDia(Boolean isPermisoReporteDia) {
		this.isPermisoReporteDia = isPermisoReporteDia;
	}
	
	public Boolean getIsPermisoPaginacionMedioDia() {
		return isPermisoPaginacionMedioDia;
	}

	public void setIsPermisoPaginacionMedioDia(Boolean isPermisoPaginacionMedioDia) {
		this.isPermisoPaginacionMedioDia = isPermisoPaginacionMedioDia;
	}
	
	public Boolean getIsPermisoPaginacionTodoDia() {
		return isPermisoPaginacionTodoDia;
	}

	public void setIsPermisoPaginacionTodoDia(Boolean isPermisoPaginacionTodoDia) {
		this.isPermisoPaginacionTodoDia = isPermisoPaginacionTodoDia;
	}
	
	public Boolean getIsPermisoPaginacionAltoDia() {
		return isPermisoPaginacionAltoDia;
	}

	public void setIsPermisoPaginacionAltoDia(Boolean isPermisoPaginacionAltoDia) {
		this.isPermisoPaginacionAltoDia = isPermisoPaginacionAltoDia;
	}
	
	public Boolean getIsPermisoCopiarDia() {
		return isPermisoCopiarDia;
	}

	public void setIsPermisoCopiarDia(Boolean isPermisoCopiarDia) {
		this.isPermisoCopiarDia = isPermisoCopiarDia;
	}
	
	public Boolean getIsPermisoVerFormDia() {
		return isPermisoVerFormDia;
	}

	public void setIsPermisoVerFormDia(Boolean isPermisoVerFormDia) {
		this.isPermisoVerFormDia = isPermisoVerFormDia;
	}
	
	public Boolean getIsPermisoDuplicarDia() {
		return isPermisoDuplicarDia;
	}

	public void setIsPermisoDuplicarDia(Boolean isPermisoDuplicarDia) {
		this.isPermisoDuplicarDia = isPermisoDuplicarDia;
	}
	
	public Boolean getIsPermisoOrdenDia() {
		return isPermisoOrdenDia;
	}

	public void setIsPermisoOrdenDia(Boolean isPermisoOrdenDia) {
		this.isPermisoOrdenDia = isPermisoOrdenDia;
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
	
	public Boolean getIsVisibilidadCeldaNuevoDia() {
		return isVisibilidadCeldaNuevoDia;
	}

	public void setIsVisibilidadCeldaNuevoDia(Boolean isVisibilidadCeldaNuevoDia) {
		this.isVisibilidadCeldaNuevoDia = isVisibilidadCeldaNuevoDia;
	}
	
	public Boolean getIsVisibilidadCeldaDuplicarDia() {
		return isVisibilidadCeldaDuplicarDia;
	}

	public void setIsVisibilidadCeldaDuplicarDia(Boolean isVisibilidadCeldaDuplicarDia) {
		this.isVisibilidadCeldaDuplicarDia = isVisibilidadCeldaDuplicarDia;
	}
	
	public Boolean getIsVisibilidadCeldaCopiarDia() {
		return isVisibilidadCeldaCopiarDia;
	}

	public void setIsVisibilidadCeldaCopiarDia(Boolean isVisibilidadCeldaCopiarDia) {
		this.isVisibilidadCeldaCopiarDia = isVisibilidadCeldaCopiarDia;
	}
	
	public Boolean getIsVisibilidadCeldaVerFormDia() {
		return isVisibilidadCeldaVerFormDia;
	}

	public void setIsVisibilidadCeldaVerFormDia(Boolean isVisibilidadCeldaVerFormDia) {
		this.isVisibilidadCeldaVerFormDia = isVisibilidadCeldaVerFormDia;
	}
	
	public Boolean getIsVisibilidadCeldaOrdenDia() {
		return isVisibilidadCeldaOrdenDia;
	}

	public void setIsVisibilidadCeldaOrdenDia(Boolean isVisibilidadCeldaOrdenDia) {
		this.isVisibilidadCeldaOrdenDia = isVisibilidadCeldaOrdenDia;
	}
	
	public Boolean getIsVisibilidadCeldaNuevoRelacionesDia() {
		return isVisibilidadCeldaNuevoRelacionesDia;
	}

	public void setIsVisibilidadCeldaNuevoRelacionesDia(Boolean isVisibilidadCeldaNuevoRelacionesDia) {
		this.isVisibilidadCeldaNuevoRelacionesDia = isVisibilidadCeldaNuevoRelacionesDia;
	}
	
	public Boolean getIsVisibilidadCeldaModificarDia() {
		return isVisibilidadCeldaModificarDia;
	}

	public void setIsVisibilidadCeldaModificarDia(Boolean isVisibilidadCeldaModificarDia) {
		this.isVisibilidadCeldaModificarDia = isVisibilidadCeldaModificarDia;
	}
	
	public Boolean getIsVisibilidadCeldaActualizarDia() {
		return isVisibilidadCeldaActualizarDia;
	}

	public void setIsVisibilidadCeldaActualizarDia(Boolean isVisibilidadCeldaActualizarDia) {
		this.isVisibilidadCeldaActualizarDia = isVisibilidadCeldaActualizarDia;
	}

	public Boolean getIsVisibilidadCeldaEliminarDia() {
		return isVisibilidadCeldaEliminarDia;
	}

	public void setIsVisibilidadCeldaEliminarDia(Boolean isVisibilidadCeldaEliminarDia) {
		this.isVisibilidadCeldaEliminarDia = isVisibilidadCeldaEliminarDia;
	}

	public Boolean getIsVisibilidadCeldaCancelarDia() {
		return isVisibilidadCeldaCancelarDia;
	}

	public void setIsVisibilidadCeldaCancelarDia(Boolean isVisibilidadCeldaCancelarDia) {
		this.isVisibilidadCeldaCancelarDia = isVisibilidadCeldaCancelarDia;
	}

	public Boolean getIsVisibilidadCeldaGuardarDia() {
		return isVisibilidadCeldaGuardarDia;
	}

	public void setIsVisibilidadCeldaGuardarDia(Boolean isVisibilidadCeldaGuardarDia) {
		this.isVisibilidadCeldaGuardarDia = isVisibilidadCeldaGuardarDia;
	}
	
	public Boolean getIsVisibilidadCeldaGuardarCambiosDia() {
		return isVisibilidadCeldaGuardarCambiosDia;
	}

	public void setIsVisibilidadCeldaGuardarCambiosDia(Boolean isVisibilidadCeldaGuardarCambiosDia) {
		this.isVisibilidadCeldaGuardarCambiosDia = isVisibilidadCeldaGuardarCambiosDia;
	}
		
	public DiaSessionBean getdiaSessionBean() {
		return this.diaSessionBean;
	}
	
	public void setdiaSessionBean(DiaSessionBean diaSessionBean) {
		this.diaSessionBean=diaSessionBean;
	}
	
	
	
	
	public void setVariablesFormularioToObjetoActualForeignKeysDia(Dia dia)throws Exception {
		try {
			
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
	
	public void bugActualizarReferenciaActual(Dia dia,Dia diaAux) throws Exception {
		//ARCHITECTURE		
		//EL ID NEGATIVO GUARDADO EN ORIGINAL SIRVE PARA VERIFICAR Y ACTUALIZAR EL REGISTRO NUEVO (ID,VERSIONROW)
		this.setCamposBaseDesdeOriginalDia(dia);
					
		//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
		diaAux.setId(dia.getId());
		diaAux.setVersionRow(dia.getVersionRow());					
	}
	
	public void ejecutarMantenimiento(MaintenanceType maintenanceType)throws Exception {	
		try	{								
			
			//this.startProcessDia();
		
			int intSelectedRow = this.jTableDatosDia.getSelectedRow();	       
			
			//PUEDE SER -1 CUANDO SE ELIMINA EN GUARDAR CAMBIOS
			if(intSelectedRow>=0 && maintenanceType!=MaintenanceType.GUARDARCAMBIOS) {
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
					
				//ARCHITECTURE
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.dia =(Dia) this.diaLogic.getDias().toArray()[this.jTableDatosDia.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
					this.dia =(Dia) this.dias.toArray()[this.jTableDatosDia.convertRowIndexToModel(intSelectedRow)];
				}
				
				//ARCHITECTURE
				
				if(DiaJInternalFrame.ISBINDING_MANUAL_TABLA) {
					//this.setVariablesFormularioToObjetoActualDia(this.dia,true);
				}
				
				this.setVariablesFormularioToObjetoActualForeignKeysDia(this.dia);
			}
			
			//LUEGO DE TRAER DATOS CORRESPONDIENTES QUE COINCIDA LISTA TABLA QUITO FILA TOTALES
			if(this.conTotales) {
				//MEJOR LO DEJO, SI EXISTE EXCEPCION SE PIEDE FILA TOTALES Y ORDEN INDICE FILA ACTUAL
				//this.quitarFilaTotales();
			}
			
			this.cargarDatosCliente();
			
			this.datosDeep=new DatosDeep();
			
			//SE CAMBIA ESTADOS CON ERROR, ENTONCES SE EJECUTA ANTES
			//this.invalidValues = diaValidator.getInvalidValues(this.dia);
			
			//if(this.invalidValues==null || this.invalidValues.length<=0) {
			
			diaLogic.setDatosCliente(datosCliente);
			diaLogic.setIsConDeep(false);
			
			if(maintenanceType==MaintenanceType.NUEVO) {
				diaAux=new  Dia();
				
				diaAux.setIsNew(true);
				diaAux.setIsChanged(true);
				
				diaAux.setDiaOriginal(this.dia);
				
				diaAux.setId(this.dia.getId());	
				diaAux.setVersionRow(this.dia.getVersionRow());	
				diaAux.setnombre(this.dia.getnombre());	
								
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.diaSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.diaSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(diaAux,diaLogic.getDias());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(diaAux,dias);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote  && !this.diaSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.diaSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						diaLogic.saveDias();//WithConnection
						//diaLogic.getSetVersionRowDias();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE		
					
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.dia,diaAux);
					
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
				}
			} else if(maintenanceType==MaintenanceType.ACTUALIZAR) {
				diaAux=new  Dia();
				
				//PUEDE QUE SE ACTUALIZE ALGUN REGISTRO NUEVO
				if(!this.diaSessionBean.getEsGuardarRelacionado() 
					|| (this.diaSessionBean.getEsGuardarRelacionado() && this.dia.getId()>=0)) {
						
					diaAux.setIsNew(false);
				}
				
				diaAux.setIsDeleted(false);
			
				diaAux.setId(this.dia.getId());	
				diaAux.setVersionRow(this.dia.getVersionRow());	
				diaAux.setnombre(this.dia.getnombre());	
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(diaAux,diaLogic.getDias());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(diaAux,dias);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote && !this.diaSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.diaSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						diaLogic.saveDias();//WithConnection
						//diaLogic.getSetVersionRowDias();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}	
					//ARCHITECTURE
					
					//TALVEZ ESTA DEMAS POR SER UPDATE
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.dia,diaAux);
					
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
				}				
			} else if(maintenanceType==MaintenanceType.ELIMINAR) {
				diaAux=new  Dia();
				
				diaAux.setIsNew(false);
				diaAux.setIsChanged(false);
				
				diaAux.setIsDeleted(true);
				
				diaAux.setId(this.dia.getId());	
				diaAux.setVersionRow(this.dia.getVersionRow());	
				diaAux.setnombre(this.dia.getnombre());	
				
				if(this.diaSessionBean.getEsGuardarRelacionado()) {
					//ELEMENTO ACTUAL NO SE HA INGRESADO AL SISTEMA, NO SE PUEDE ELIMINAR ALGO QUE NO EXISTE
					if(this.diaAux.getId()>=0) {	
						this.diasEliminados.add(diaAux);											
					}
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					actualizarLista(diaAux,diaLogic.getDias());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(diaAux,dias);
				}
				//ARCHITECTURE
				
				
				if(!isGuardarCambiosEnLote && !this.diaSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.diaSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						diaLogic.saveDias();//WithConnection
						//diaLogic.getSetVersionRowDias();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}	
					//ARCHITECTURE
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
				}				
			} else if(maintenanceType==MaintenanceType.GUARDARCAMBIOS) {		
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.diaLogic.getDias().addAll(this.diasEliminados);
					
					diaLogic.saveDias();//WithConnection
					//diaLogic.getSetVersionRowDias();//WithConnection
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}	
				//ARCHITECTURE
				
				this.diasEliminados= new ArrayList<Dia>();		
			}
			
			if(this.diaSessionBean.getEsGuardarRelacionado()) {
				 this.crearFilaTotales();
			}
			
			
									
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.diaSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				if(!this.isPostAccionSinMensaje) {
					JOptionPane.showMessageDialog(this,"Dia GUARDADO CORRECTAMENTE","MANTENIMIENTO DE Dia",JOptionPane.INFORMATION_MESSAGE);
					if(maintenanceType==MaintenanceType.NUEVO || maintenanceType==MaintenanceType.ACTUALIZAR) {
						//CUANDO ES NUEVO SE PIERDE REFERENCIA NO SE PORQUE
						this.dia=diaAux;
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
      		//this.finishProcessDia();
      	}
		
	}	
	
	public void actualizarRelaciones(Dia diaLocal) throws Exception {
		
		if(this.diaSessionBean.getConGuardarRelaciones()) {			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
			
			
			} else {
				
			}
		}
	}
	
	public void actualizarRelacionFkPadreActual(Dia diaLocal) throws Exception {	
		if(this.diaSessionBean.getEsGuardarRelacionado()) {			
			
		
		
		}
	}
	
	public Boolean validarDiaActual() throws Exception {
		Boolean estaValidado=false;
		this.inicializarInvalidValues();
		
		/*
		int intSelectedRow = this.jTableDatosDia.getSelectedRow();
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.dia =(Dia) this.diaLogic.getDias().toArray()[this.jTableDatosDia.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
			this.dia =(Dia) this.dias.toArray()[this.jTableDatosDia.convertRowIndexToModel(intSelectedRow)];
		}
		//ARCHITECTURE
		*/
		
		this.invalidValues = diaValidator.getInvalidValues(this.dia);
					
		if(this.invalidValues==null || this.invalidValues.length<=0) {
			estaValidado=true;
		} else {
			this.mostrarInvalidValues();	
		}
		
		return estaValidado;
	}
	
	public void actualizarLista(Dia dia,List<Dia> dias) throws Exception {
		try	{		
			DiaConstantesFunciones.actualizarLista(dia,dias,this.diaSessionBean.getEsGuardarRelacionado());		
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void actualizarSelectedLista(Dia dia,List<Dia> dias) throws Exception {
		try	{			
			DiaConstantesFunciones.actualizarSelectedLista(dia,dias);
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public Boolean tieneElementosSeleccionados() throws Exception {
		Boolean tiene=false;
		
		List<Dia> diasLocal=null;
		
		try	{			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				diasLocal=this.diaLogic.getDias();
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				diasLocal=this.dias;
			}
			//ARCHITECTURE
		
			for(Dia diaLocal:diasLocal) {
				if(this.permiteMantenimiento(diaLocal) && diaLocal.getIsSelected()) {
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
			sMensaje+="\r\n"+DiaConstantesFunciones.getDiaLabelDesdeNombre(invalidValue.getPropertyName())+"->"+invalidValue.getMessage();
			
			//MOSTRAR CAMPOS INVALIDOS
			if(invalidValue.getPropertyName().equals(DiaConstantesFunciones.NOMBRE)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormDia.jLabelnombreDia,invalidValue.getMessage());}
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
		
		if(this.jInternalFrameDetalleFormDia!=null) {
		
		//MOSTRAR CAMPOS INVALIDOS
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormDia.jLabelnombreDia,"");
		
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
		this.iIdNuevoDia--;	
		
		
		this.diaAux=new Dia();
		
		this.diaAux.setId(this.iIdNuevoDia);
		this.diaAux.setIsChanged(true);
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.diaLogic.getDias().add(this.diaAux);
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.dias.add(this.diaAux);
		}
		//ARCHITECTURE
		
		this.dia=this.diaAux;
		
		if(DiaJInternalFrame.ISBINDING_MANUAL_TABLA) {
			this.setVariablesObjetoActualToFormularioDia(this.dia);
			this.setVariablesObjetoActualToFormularioForeignKeyDia(this.dia);
		}
				
		//this.setDefaultControlesDia();
		
		this.inicializarInvalidValues();
				
		//SELECCIONA ITEM DEFECTO-->SET O SELECTED INDEX
		this.setItemDefectoCombosForeignKeyDia();
		
		
		//INICIALIZA VARIABLES COMBOS GLOBALES A FORMULARIO(ParametroGeneralUsuario)
		this.setVariablesGlobalesCombosForeignKeyDia();
		
		//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
		//this.setVariablesGlobalesAuxiliaresCombosForeignKeyDia();
		
		//SI TIENE FOREIGN KEY CON CAMPO esDefecto=true, SE ACTUALIZA A OBJETO ACTUAL
		this.setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualDia(this.diaBean,this.dia,false,false);
		
		//ACTUALIZA VALORES PARA EL OBJETO ACTUAL ANTES DE ENVIARLO A ACTUALIZAR
		this.setVariablesFormularioToObjetoActualForeignKeysDia(this.dia);
				
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		if(this.jInternalFrameParent!=null) {
			this.jInternalFrameParent.actualizarObjetoPadreFk(DiaConstantesFunciones.CLASSNAME);
		}	
		
		
		if(this.diaSessionBean.getConGuardarRelaciones()) {
			classes=DiaConstantesFunciones.getClassesRelationshipsOfDia(new ArrayList<Classe>(),DeepLoadType.NONE);
		}
		
		this.classesActual=new ArrayList<Classe>();
		this.classesActual.addAll(classes);
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {						
			this.diaReturnGeneral=diaLogic.procesarEventosDiasWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,EventoGlobalTipo.FORM_RECARGAR,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.diaLogic.getDias(),this.dia,this.diaParameterGeneral,this.isEsNuevoDia,classes);//this.diaLogic.getDia()
						
		} else if(Constantes.ISUSAEJBREMOTE) {
						
		} else if(Constantes.ISUSAEJBHOME) {
		}
		//ARCHITECTURE
		
		//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
		//this.setVariablesObjetoReturnGeneralToBeanDia(this.diaReturnGeneral,this.diaBean,false);
		
		if(this.diaReturnGeneral.getConRecargarPropiedades()) {
			//INICIALIZA VARIABLES COMBOS NORMALES (FK)
			this.setVariablesObjetoActualToFormularioForeignKeyDia(this.diaReturnGeneral.getDia());
			
			//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
			this.setVariablesObjetoActualToFormularioDia(this.diaReturnGeneral.getDia());
		}
		
		if(this.diaReturnGeneral.getConRecargarRelaciones()) {
			//INICIALIZA VARIABLES RELACIONES A FORMULARIO
			this.setVariablesRelacionesObjetoActualToFormularioDia(this.diaReturnGeneral.getDia(),classes);//this.diaBean);	
		}
			
		//ACTUALIZA VARIABLES FORMULARIO A OBJETO ACTUAL (PARA NUEVO TABLA O GUARDAR CAMBIOS
		if(esNuevoGuardarCambios) {
			this.setVariablesFormularioToObjetoActualDia(this.dia,false);
		}
		
		//INICIALIZA VARIABLES COMBOS DEFAULT DEL PROYECTO(|DEFAULT para FK)
		//this.setVariablesDefaultCombosForeignKeyDia();
		
		//INICIALIZA VARIABLES COMBOS PARAMETRO DEL PROYECTO(|VALORPARAM Era para ParametroModulo, ahora en logic)
		//this.setVariablesParametroCombosForeignKeyDia();						
		
		if(!esNuevoGuardarCambios) {
			//INICIALIZA VARIABLES POR OPCION MENU
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
		
			//NO FUNCIONA BINDINGS			
			this.inicializarActualizarBindingDia(false);
						
			if(diaSessionBean.getConGuardarRelaciones()) {
				//DEBERIA YA ESTAR CARGADO LOS COMBOS Y SI SE NECESITA ALGO MAS SE DEBE CREAR FUNCION LIMITADA
				//SI DEBE TRAER Y RESETEAR TABLA
								
			}
				
			//SI ES MANUAL
			if(DiaJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualDia();
			}
			
			this.actualizarVisualTableDatosDia();
			
			this.jTableDatosDia.setRowSelectionInterval(this.getIndiceNuevoDia(), this.getIndiceNuevoDia());
			
			this.seleccionarFilaTablaDiaActual();
						
			this.actualizarEstadoCeldasBotonesDia("a", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		}		
	}
	
	public void habilitarDeshabilitarControlesDia(Boolean isHabilitar) throws Exception {
		
		this.jInternalFrameDetalleFormDia.jTextFieldnombreDia.setEnabled(isHabilitar && this.diaConstantesFunciones.activarnombreDia);	
		
	};
	
	public void setDefaultControlesDia() throws Exception {
			
	};
	
	
	public void habilitarDeshabilitarTipoMantenimientoDia(Boolean esRelaciones) throws Exception {
		if(esRelaciones) {
			//this.diaSessionBean.setConGuardarRelaciones(true);			
			this.diaSessionBean.setEstaModoGuardarRelaciones(true);				
			this.jInternalFrameDetalleFormDia.jTabbedPaneRelacionesDia.setVisible(true);
			
					
		} else {
			//this.diaSessionBean.setConGuardarRelaciones(false);			
			this.diaSessionBean.setEstaModoGuardarRelaciones(false);						
			this.jInternalFrameDetalleFormDia.jTabbedPaneRelacionesDia.setVisible(false);
			
			
		}
	};
	
	public int getIndiceNuevoDia() throws Exception {
		int iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(Dia diaAux:this.diaLogic.getDias()) {
				if(diaAux.getId().equals(this.iIdNuevoDia)) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(Dia diaAux:this.dias) {
				if(diaAux.getId().equals(this.iIdNuevoDia)) {
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
	
	public int getIndiceActualDia(Dia dia,Integer iIndiceActual) throws Exception {
		Integer iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(Dia diaAux:this.diaLogic.getDias()) {
				if(diaAux.getId().equals(dia.getId())) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(Dia diaAux:this.dias) {
				if(diaAux.getId().equals(dia.getId())) {
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
	
	public void setCamposBaseDesdeOriginalDia(Dia diaOriginal) throws Exception {
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(Dia diaAux:this.diaLogic.getDias()) {
				if(diaAux.getDiaOriginal().getId().equals(diaOriginal.getId())) {
					existe=true;
					diaOriginal.setId(diaAux.getId());
					diaOriginal.setVersionRow(diaAux.getVersionRow());
					break;
				}
				
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(Dia diaAux:this.dias) {
				if(diaAux.getDiaOriginal().getId().equals(diaOriginal.getId())) {
					existe=true;
					diaOriginal.setId(diaAux.getId());
					diaOriginal.setVersionRow(diaAux.getVersionRow());
					break;
				}				
			}
		}
		//ARCHITECTURE
		
		if(!existe) {
			//SI NO EXISTE TOMA LA ULTIMA FILA
		}
	}
	
	public void cancelarNuevosDia(Boolean esParaCancelar) throws Exception {
		diasAux=new ArrayList<Dia>();
		diaAux=new Dia();
		
		if(!this.diaSessionBean.getEsGuardarRelacionado()) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(Dia diaAux:this.diaLogic.getDias()) {
					if(diaAux.getId()<0) {
						diasAux.add(diaAux);
					}		
				}
				this.iIdNuevoDia=0L;
				this.diaLogic.getDias().removeAll(diasAux);
					
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(Dia diaAux:this.dias) {
					if(diaAux.getId()<0) {
						diasAux.add(diaAux);
					}		
				}
				this.iIdNuevoDia=0L;
				this.dias.removeAll(diasAux);
			}	
		} else {			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				if(esParaCancelar && this.isEsNuevoDia 
					&& this.diaLogic.getDias().size()>0
					) {
					diaAux=this.diaLogic.getDias().get(this.diaLogic.getDias().size() - 1);
				
					if(diaAux.getId()<0) {
						this.diaLogic.getDias().remove(diaAux);
					}
				}
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				if(esParaCancelar && this.isEsNuevoDia && this.dias.size()>0) {
					diaAux=this.dias.get(this.dias.size() - 1);
				
					if(diaAux.getId()<0) {
						this.dias.remove(diaAux);
					}
				}
			}	
		}
	}
	
	public void cancelarNuevoDia(Boolean esParaCancelar) throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			if(dia.getId()<0) {
				this.diaLogic.getDias().remove(this.dia);
			}					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			if(dia.getId()<0) {
				this.dias.remove(this.dia);
			}
		}			
	}
	
	public void setEstadosInicialesDia(List<Dia> diasAux) throws Exception {
		DiaConstantesFunciones.setEstadosInicialesDia(diasAux);
	}
	
	public void setEstadosInicialesDia(Dia diaAux) throws Exception {
		DiaConstantesFunciones.setEstadosInicialesDia(diaAux);		
	}
	
	public void nuevo() throws Exception {
		try	{
			//ESTA VALIDADO EN FUNCION ACTUALIZAR
			//if(this.validarDiaActual()) {
				this.ejecutarMantenimiento(MaintenanceType.NUEVO);
				
				this.actualizarEstadoCeldasBotonesDia("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
				
			//}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,DiaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void actualizar() throws Exception {
		try	{
			if(this.validarDiaActual()) {
				if(!this.isEsNuevoDia) {
					this.ejecutarMantenimiento(MaintenanceType.ACTUALIZAR);
					
					this.actualizarEstadoCeldasBotonesDia("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
					
				} else {					
					this.nuevo();
					this.isEsNuevoDia=false;
				}
				
				//SE CANCELA AL FINAL DEL PROCESO JBUTTONACTUALIZAR
				//this.cancelar(false);
			}		
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,DiaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void eliminar() throws Exception {
		try	{	
			if(this.validarDiaActual()) {
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE ELIMINAR EL/LA Dia ?", "MANTENIMIENTO DE Dia", JOptionPane.OK_CANCEL_OPTION) == 0) {
					this.ejecutarMantenimiento(MaintenanceType.ELIMINAR);			
					this.actualizarEstadoCeldasBotonesDia("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
				}
			
			}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,DiaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void guardarCambios() throws Exception {
		try	{
			this.ejecutarMantenimiento(MaintenanceType.GUARDARCAMBIOS);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DiaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarAsignar(Dia dia) throws Exception {
		DiaConstantesFunciones.seleccionarAsignar(this.dia,dia);
	}
	
	public void seleccionar() throws Exception {
		try	{
			//ACTUALIZO EL PERMISO ACTUALIZAR CON EL PERMISO ACTUALIZAR ORIGINAL ESTE PERMISO SE UTILIZA PARA EL NUEVO TAMBIEN
			this.isPermisoActualizarDia=this.isPermisoActualizarOriginalDia;
			
			
			this.seleccionarAsignar(dia);
			
			
			
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			DiaConstantesFunciones.quitarEspaciosDia(this.dia,this.arrDatoGeneral);
			
			
			this.actualizarEstadoCeldasBotonesDia("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DiaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarBusqueda(Long id) throws Exception {
		try	{
			this.diaSessionBean.setsFuncionBusquedaRapida(this.diaSessionBean.getsFuncionBusquedaRapida().replace("TO_REPLACE", id.toString()));
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DiaConstantesFunciones.CLASSNAME);
		}
	}
	
	
	
	public void cancelar() throws Exception {
		this.cancelar(true);
	}
	
	public void cancelar(Boolean esParaCancelar) throws Exception {
		try {
														
			
			//SE UTILIZA COLUMNA ELIMINAR EN TABLA
			if(this.isEsNuevoDia) {
				//NO CANCELA TODOS NUEVOS POR FUNCIONALIDAD GUARDAR CAMBIOS
				//this.cancelarNuevosDia(esParaCancelar);				
				this.cancelarNuevoDia(esParaCancelar);								
			}
			
			this.dia=new Dia();
			
			this.inicializarDia();
			
			this.actualizarEstadoCeldasBotonesDia("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DiaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void inicializarDia() throws Exception {
		try {
			DiaConstantesFunciones.inicializarDia(this.dia);
			
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
			FuncionesSwing.manageException(this, e,logger,DiaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void siguientes()throws Exception {
		try	{			
			if(this.diaLogic.getDias().size()>0) {
					
				this.iNumeroPaginacionPagina=this.iNumeroPaginacionPagina+this.iNumeroPaginacion;
			}
				
			this.procesarBusqueda(this.sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DiaConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void generarReporteDias(String sAccionBusqueda,List<Dia> diasParaReportes) throws Exception {
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
					sPathReporteFinal="Dia"+this.sTipoReporteExtra+"Design.jasper";
					reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);	
				} else {
					sPathReporteFinal=this.sPathReporteDinamico;
					reportFile = new FileInputStream(sPathReporteFinal);
				}
			} else {
				sPathReporteFinal="DiaMasterRelaciones"+this.sTipoReporteExtra+"Design.jasper";
				reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);
				//sPathReportes=reportFile.getPath().replace("DiaMasterRelacionesDesign.jasper", "");
			}
		} else {
				sPathReporteFinal="Dia"+this.sTipoReporteExtra+"Design.jasper";
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
		parameters.put("subtitulo", "Reporte De  Dias");		
		parameters.put("busquedapor", DiaConstantesFunciones.getNombreIndice(sAccionBusqueda)+sDetalleReporte);
		
		
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
		
		JRBeanArrayDataSource jrbeanArrayDataSourceDia=null;
		
		if(this.sTipoReporteExtra!=null && !this.sTipoReporteExtra.equals("")) {
			DiaConstantesFunciones.S_TIPOREPORTE_EXTRA=this.sTipoReporteExtra;
		} else {
			DiaConstantesFunciones.S_TIPOREPORTE_EXTRA="";
		}
		
		jrbeanArrayDataSourceDia=new JRBeanArrayDataSource(DiaJInternalFrame.TraerDiaBeans(diasParaReportes,classes).toArray());
		
		jasperPrint = JasperFillManager.fillReport(jasperReport,parameters,jrbeanArrayDataSourceDia);
				
		
		String sPathDest=Constantes.SUNIDAD_ARCHIVOS+":/"+Constantes.SCONTEXTSERVER+"/"+DiaConstantesFunciones.SCHEMA+"/reportes";
		
		File filePathDest = new File(sPathDest);
		
		if(!filePathDest.exists()) {
			filePathDest.mkdirs();				
		}
				
		String sDestFileName=sPathDest+"/"+DiaConstantesFunciones.CLASSNAME;
				
		if(this.sTipoArchivoReporte=="VISUALIZAR") {
			JasperViewer jasperViewer = new JasperViewer(jasperPrint,false) ;
			jasperViewer.setVisible(true) ; 

		} else if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML") {	
			//JasperFillManager.fillReportToFile(reportFile.getAbsolutePath(),parameters, new JRBeanArrayDataSource(DiaBean.TraerDiaBeans(diasParaReportes).toArray()));
							
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
				this.generarExcelReporteDias(sAccionBusqueda,sTipoArchivoReporte,diasParaReportes);
			
			} else if(this.sTipoReporte.equals("FORMULARIO")){
				this.generarExcelReporteVerticalDias(sAccionBusqueda,sTipoArchivoReporte,diasParaReportes,false);
			
			} else if(this.sTipoReporte.equals("DINAMICO")){
				
				if(this.sTipoReporteDinamico.equals("NORMAL")) {
					
					this.jButtonGenerarExcelReporteDinamicoDiaActionPerformed(null);
					//this.generarExcelReporteDias(sAccionBusqueda,sTipoArchivoReporte,diasParaReportes);
					
				
				} else if(this.sTipoReporteDinamico.equals("FORMULARIO")){
					this.generarExcelReporteVerticalDias(sAccionBusqueda,sTipoArchivoReporte,diasParaReportes,true);
				
				} else if(this.sTipoReporteDinamico.equals("RELACIONES")){
					this.generarExcelReporteRelacionesDias(sAccionBusqueda,sTipoArchivoReporte,diasParaReportes,true);
				}
				
			} else if(this.sTipoReporte.equals("RELACIONES")){
				this.generarExcelReporteRelacionesDias(sAccionBusqueda,sTipoArchivoReporte,diasParaReportes,false);
			}
		}
		
		if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML"||this.sTipoArchivoReporte=="WORD"||this.sTipoArchivoReporte=="EXCEL") {				
			JOptionPane.showMessageDialog(this,"REPORTE "+sDestFileName+" GENERADO SATISFACTORIAMENTE","REPORTES ",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteDias(String sAccionBusqueda,String sTipoArchivoReporte,List<Dia> diasParaReportes) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"dia";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("Dias");
         
        int iRow = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderDia("NORMAL",row,workbook);
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux=null;
		
		int i=0;
		
      	for(Dia dia : diasParaReportes) {            
			row = sheet.createRow(iRow++);
			iCell = 0;
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				cellStyleDataAux=cellStyleData;
			}
			
			DiaConstantesFunciones.generarExcelReporteDataDia("NORMAL",row,workbook,dia,cellStyleDataAux);
		
			
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
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.diaSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Dia",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteHeaderDia(String sTipo,Row row,Workbook workbook) {
		
		DiaConstantesFunciones.generarExcelReporteHeaderDia(sTipo,row,workbook);
		
		/*
		Cell cell=null;
		int iCell=0;
		
		CellStyle cellStyle = workbook.createCellStyle();
		cellStyle.setFillBackgroundColor(IndexedColors.GREEN.getIndex());
		cellStyle.setFillPattern(CellStyle.ALIGN_FILL);
		*/
		
	}
	
	public void generarExcelReporteVerticalDias(String sAccionBusqueda,String sTipoArchivoReporte,List<Dia> diasParaReportes,Boolean paraDinamico) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"dia_vertical";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("Dias");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		CellStyle cellStyle = Funciones2.getStyleTitulo(workbook,"ZEBRA");;
		
		CellStyle cellStyleTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL_VERTICAL");
		
		
		for(Dia dia : diasParaReportes) {
			row = sheet.createRow(iRow++);
			iRowLast=iRow - 1;
			
			cell = row.createCell(0);
			cell.setCellValue(DiaConstantesFunciones.getDiaDescripcion(dia));
			cell.setCellStyle(cellStyleTitulo);
			
			sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
	
			


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(DiaConstantesFunciones.LABEL_NOMBRE))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(DiaConstantesFunciones.LABEL_NOMBRE);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(dia.getnombre());


			}						
        }
        
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.diaSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Dia",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteRelacionesDias(String sAccionBusqueda,String sTipoArchivoReporte,List<Dia> diasParaReportes,Boolean paraDinamico) throws Exception {
		
		ArrayList<Classe> classes=new ArrayList<Classe>();
		List<Dia> diasRespaldo=null;
		
		classes=DiaConstantesFunciones.getClassesRelationshipsOfDia(new ArrayList<Classe>(),DeepLoadType.NONE,false);
					
		this.datosDeep=new DatosDeep();
		
		this.datosDeep.setIsDeep(false);
		this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
		this.datosDeep.setClases(classes);
			
		this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
		this.datosCliente.setIsConDeep(true);	
		this.datosCliente.setIsConExportar(false);
		
						
		this.diaLogic.setDatosCliente(this.datosCliente);
		this.diaLogic.setDatosDeep(this.datosDeep);
		this.diaLogic.setIsConDeep(true);
		
		diasRespaldo=this.diaLogic.getDias();
		
		this.diaLogic.setDias(diasParaReportes);	
		this.diaLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
		
		diasParaReportes=this.diaLogic.getDias();
		this.diaLogic.setDias(diasRespaldo);
		
		
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"dia_relacion";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("Dias");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderDia("NORMAL",row,workbook);
		
		int i=0;
		int i2=0;
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL");
		CellStyle cellStyleDataZebra = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux =null;
		CellStyle cellStyleDataAuxHijo =null;
		
		for(Dia dia : diasParaReportes) {			
			if(i!=0) {
				row = sheet.createRow(iRow++);				
				this.generarExcelReporteHeaderDia("NORMAL",row,workbook);
			}
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				//cellStyleDataAux=cellStyleData;
			}
			
			row = sheet.createRow(iRow++);						
			DiaConstantesFunciones.generarExcelReporteDataDia("NORMAL",row,workbook,dia,cellStyleDataAux);
		
			
			
			
			i++;
        }
        
		/*
		row = sheet.createRow(iRow++);
		iRowLast=iRow - 1;
			
		cell = row.createCell(0);
		cell.setCellValue(DiaConstantesFunciones.getDiaDescripcion(dia));
		cell.setCellStyle(cellStyleTitulo);
			
		sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
		*/
		
			
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.diaSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Dia",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	
	public Boolean existeColumnaReporteDinamico(String sColumna) {
		Boolean existe=false;
		
		Reporte reporte=new Reporte();
		
		
		for(int index:this.jInternalFrameReporteDinamicoDia.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoDia.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
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
		
		
		for(int index:this.jInternalFrameReporteDinamicoDia.getjListRelacionesSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoDia.getjListRelacionesSelectReporte().getModel().getElementAt(index);
			
			if(sColumna.equals(reporte.getsCodigo())) {
				existe=true;
				break;
			}
		
		}
		
		
		return existe;
	}
	
	public void startProcessDia() throws Exception {		
		this.startProcessDia(true);
	}
	
	public void startProcessDia(Boolean conSplash) throws Exception {		
		//FuncionesSwing.enableDisablePanels(false,null ,this.jPanelParametrosReportesDia, this.jScrollPanelDatosDia,this.jPanelPaginacionDia, this.jScrollPanelDatosEdicionDia, this.jPanelAccionesDia,this.jPanelAccionesFormularioDia,this.jmenuBarDia,this.jmenuBarDetalleDia,this.jTtoolBarDia,this.jTtoolBarDetalleDia);		
		
		final JTabbedPane jTabbedPaneBusquedasDia=null; 
		
		final JPanel jPanelParametrosReportesDia=this.jPanelParametrosReportesDia;
		//final JScrollPane jScrollPanelDatosDia=this.jScrollPanelDatosDia;
		final JTable jTableDatosDia=this.jTableDatosDia;		
		final JPanel jPanelPaginacionDia=this.jPanelPaginacionDia;
		//final JScrollPane jScrollPanelDatosEdicionDia=this.jScrollPanelDatosEdicionDia;
		final JPanel jPanelAccionesDia=this.jPanelAccionesDia;
		
		JPanel jPanelCamposAuxiliarDia=new JPanelMe();
		JPanel jPanelAccionesFormularioAuxiliarDia=new JPanelMe();
		
		if(this.jInternalFrameDetalleFormDia!=null) {
			jPanelCamposAuxiliarDia=this.jInternalFrameDetalleFormDia.jPanelCamposDia;
			jPanelAccionesFormularioAuxiliarDia=this.jInternalFrameDetalleFormDia.jPanelAccionesFormularioDia;
		}
		
		final JPanel jPanelCamposDia=jPanelCamposAuxiliarDia;
		final JPanel jPanelAccionesFormularioDia=jPanelAccionesFormularioAuxiliarDia;
		
		
		final JMenuBar jmenuBarDia=this.jmenuBarDia;
		final JToolBar jTtoolBarDia=this.jTtoolBarDia;		
		
		
		JMenuBar jmenuBarDetalleAuxiliarDia=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarDia=new JToolBar();		
		
		if(this.jInternalFrameDetalleFormDia!=null) {
			jmenuBarDetalleAuxiliarDia=this.jInternalFrameDetalleFormDia.jmenuBarDetalleDia;
			jTtoolBarDetalleAuxiliarDia=this.jInternalFrameDetalleFormDia.jTtoolBarDetalleDia;
		}
		
		final JMenuBar jmenuBarDetalleDia=jmenuBarDetalleAuxiliarDia;
		final JToolBar jTtoolBarDetalleDia=jTtoolBarDetalleAuxiliarDia;		
		
		
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasDia;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesDia;
			processRunnable.jTableDatos=jTableDatosDia;
			processRunnable.jPanelCampos=jPanelCamposDia;
			processRunnable.jPanelPaginacion=jPanelPaginacionDia;
			processRunnable.jPanelAcciones=jPanelAccionesDia;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioDia;
			
			
			processRunnable.jmenuBar=jmenuBarDia;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleDia;
			processRunnable.jTtoolBar=jTtoolBarDia;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleDia;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasDia ,jPanelParametrosReportesDia,jTableDatosDia, /*jScrollPanelDatosDia,*/jPanelCamposDia,jPanelPaginacionDia, /*jScrollPanelDatosEdicionDia,*/ jPanelAccionesDia,jPanelAccionesFormularioDia,jmenuBarDia,jmenuBarDetalleDia,jTtoolBarDia,jTtoolBarDetalleDia);
		
			startProcess();//this.
		}
						
		/*
		if(conSplash) {
			SwingUtilities.invokeLater(new Runnable() {
			      public void run() {
			    	  try {
							FuncionesSwing.enableDisablePanels(false,null ,jPanelParametrosReportesDia, jScrollPanelDatosDia,jPanelPaginacionDia, jScrollPanelDatosEdicionDia, jPanelAccionesDia,jPanelAccionesFormularioDia,jmenuBarDia,jmenuBarDetalleDia,jTtoolBarDia,jTtoolBarDetalleDia);
						
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
	
	public void finishProcessDia() {// throws Exception 
		this.finishProcessDia(true);
	}
	
	public void finishProcessDia(Boolean conSplash) {// throws Exception 
		//FuncionesSwing.enableDisablePanels(true,null ,this.jPanelParametrosReportesDia, this.jScrollPanelDatosDia,this.jPanelPaginacionDia, this.jScrollPanelDatosEdicionDia, this.jPanelAccionesDia,this.jPanelAccionesFormularioDia,this.jmenuBarDia,this.jmenuBarDetalleDia,this.jTtoolBarDia,this.jTtoolBarDetalleDia);		
		
		final JTabbedPane jTabbedPaneBusquedasDia=null; 
		
		final JPanel jPanelParametrosReportesDia=this.jPanelParametrosReportesDia;
		//final JScrollPane jScrollPanelDatosDia=this.jScrollPanelDatosDia;
		final JTable jTableDatosDia=this.jTableDatosDia;		
		final JPanel jPanelPaginacionDia=this.jPanelPaginacionDia;
		//final JScrollPane jScrollPanelDatosEdicionDia=this.jScrollPanelDatosEdicionDia;
		final JPanel jPanelAccionesDia=this.jPanelAccionesDia;
		
		JPanel jPanelCamposAuxiliarDia=new JPanel();
		JPanel jPanelAccionesFormularioAuxiliarDia=new JPanel();
		
		if(this.jInternalFrameDetalleFormDia!=null) {
			jPanelCamposAuxiliarDia=this.jInternalFrameDetalleFormDia.jPanelCamposDia;
			jPanelAccionesFormularioAuxiliarDia=this.jInternalFrameDetalleFormDia.jPanelAccionesFormularioDia;
		}
		
		final JPanel jPanelCamposDia=jPanelCamposAuxiliarDia;
		final JPanel jPanelAccionesFormularioDia=jPanelAccionesFormularioAuxiliarDia;
		
		
		final JMenuBar jmenuBarDia=this.jmenuBarDia;		
		final JToolBar jTtoolBarDia=this.jTtoolBarDia;
				
		JMenuBar jmenuBarDetalleAuxiliarDia=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarDia=new JToolBar();
		
		if(this.jInternalFrameDetalleFormDia!=null) {
			jmenuBarDetalleAuxiliarDia=this.jInternalFrameDetalleFormDia.jmenuBarDetalleDia;
			jTtoolBarDetalleAuxiliarDia=this.jInternalFrameDetalleFormDia.jTtoolBarDetalleDia;		
		}
		
		final JMenuBar jmenuBarDetalleDia=jmenuBarDetalleAuxiliarDia;
		final JToolBar jTtoolBarDetalleDia=jTtoolBarDetalleAuxiliarDia;
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasDia;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesDia;
			processRunnable.jTableDatos=jTableDatosDia;
			processRunnable.jPanelCampos=jPanelCamposDia;
			processRunnable.jPanelPaginacion=jPanelPaginacionDia;
			processRunnable.jPanelAcciones=jPanelAccionesDia;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioDia;
			
			
			processRunnable.jmenuBar=jmenuBarDia;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleDia;
			processRunnable.jTtoolBar=jTtoolBarDia;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleDia;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			if(conSplash) {
				SwingUtilities.invokeLater(new RunnableProceso(true,this,jTabbedPaneBusquedasDia ,jPanelParametrosReportesDia, jTableDatosDia,/*jScrollPanelDatosDia,*/jPanelCamposDia,jPanelPaginacionDia, /*jScrollPanelDatosEdicionDia,*/ jPanelAccionesDia,jPanelAccionesFormularioDia,jmenuBarDia,jmenuBarDetalleDia,jTtoolBarDia,jTtoolBarDetalleDia));
			}
		}						
	}
	
	/*
	public void habilitarDeshabilitarControlesDia(Boolean esHabilitar,Boolean conDetalle) {
		this.habilitarDeshabilitarToolBarDia(esHabilitar,conDetalle);
		this.habilitarDeshabilitarMenuDia(esHabilitar,conDetalle);
	}
	
	public void habilitarDeshabilitarToolBarDia(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jTtoolBarDia,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jTtoolBarDetalleDia,esHabilitar,1,1);
		}
	}
	
	public void habilitarDeshabilitarMenuDia(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jmenuBarDia,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jmenuBarDetalleDia,esHabilitar,1,1);
		}
	}
	*/
	
	
	
	public void procesarBusqueda(String sAccionBusqueda) throws Exception {		
		String  finalQueryPaginacion=this.diaConstantesFunciones.getsFinalQueryDia();
		String  finalQueryPaginacionTodos=this.diaConstantesFunciones.getsFinalQueryDia();
		
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
		
		ArrayList<String> arrColumnasGlobalesNo=DiaConstantesFunciones.getArrayColumnasGlobalesNoDia(this.arrDatoGeneral);
		ArrayList<String> arrColumnasGlobales=DiaConstantesFunciones.getArrayColumnasGlobalesDia(this.arrDatoGeneral,arrColumnasGlobalesNo);
		
			
		String  finalQueryGlobal="";
		
		finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,!esBusqueda,esBusqueda,arrColumnasGlobales,DiaConstantesFunciones.TABLENAME);
		
		String sOrderBy="";
		
		
		sOrderBy=Funciones2.getFinalQueryOrderBy(this.arrOrderBy);
		
		
		if(!sOrderBy.equals("")) {			
			finalQueryPaginacion=sOrderBy;
			finalQueryPaginacionTodos=sOrderBy;
		}
		
		
		//INICIALIZA ELIMINADOS
		this.diasEliminados= new ArrayList<Dia>();
		
		if(!this.isEntroOnLoad) {
			this.onLoad();
		}/* else {
			this.isEntroOnLoad=false;
		}*/
		
		
		
				
		try	{		
			
			//this.startProcessDia();
		
				///*DiaSessionBean*/this.diaSessionBean=new DiaSessionBean();
			
			if(this.diaSessionBean==null) {
				this.diaSessionBean=new DiaSessionBean();
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
					this.iNumeroPaginacion=DiaConstantesFunciones.INUMEROPAGINACION;
				}
			}
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);
			
			this.cargarDatosCliente();
			
			ArrayList<Classe> classes=new ArrayList<Classe>();
			
			classes=DiaConstantesFunciones.getClassesForeignKeysOfDia(new ArrayList<Classe>(),DeepLoadType.NONE);
			
		
			this.datosDeep=new DatosDeep();
			this.datosDeep.setIsDeep(false);
			this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
			this.datosDeep.setClases(classes);
			
			this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
			this.datosCliente.setIsConDeep(true);
			
			if(false) {//this.conExportar
				this.datosCliente.setIsConExportar(true);
				this.datosCliente.setDatosExportarParametros(Funciones2.getTipoExportar(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getcon_exportar_cabecera(),Funciones2.getTipoDelimiter(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getpath_exportar()+"/dia."+Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario));
			} else {
				this.datosCliente.setIsConExportar(false);
			}
			
			diasAux= new ArrayList<Dia>();
			
				
			diaLogic.setDatosCliente(this.datosCliente);
			diaLogic.setDatosDeep(this.datosDeep);
			diaLogic.setIsConDeep(true);
			
			
			diaLogic.getDiaDataAccess().setIsForForeingsKeysDataRelationships(true);
			
			if(sAccionBusqueda.equals("Todos") || sAccionBusqueda.equals("Query"))	{	
				if(sAccionBusqueda.equals("Todos")) {
					//FALTA:PARA BUSQUEDAS POR CAMPO EN FORMULARIO
					//this.sFinalQueryGeneral="";
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacionTodos );
					
					diaLogic.getTodosDias(finalQueryGlobal,pagination);
					
					//diaLogic.getTodosDiasWithConnection(finalQueryGlobal,pagination);										
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
				
				if(diaLogic.getDias()==null|| diaLogic.getDias().size()==0)	{
					
				
				}
				
				if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(-1);
						this.pagination.setiMaxResults(-1);
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							diasAux= new ArrayList<Dia>();
							diasAux.addAll(diaLogic.getDias());						
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							diasAux= new ArrayList<Dia>();
							diasAux.addAll(dias);
						}
						//ARCHITECTURE
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							diaLogic.getTodosDias(finalQueryGlobal+"",this.pagination);												
							
							//diaLogic.getTodosDiasWithConnection(finalQueryGlobal+"",this.pagination);												
						} else if(Constantes.ISUSAEJBREMOTE) {
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
					}
					
					this.generarReporteDias("Todos",diaLogic.getDias() );
					
					if(false) {//isMostrarTodosResultadosReporte						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							diaLogic.setDias(new ArrayList<Dia>());					
							diaLogic.getDias().addAll(diasAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							dias=new ArrayList<Dia>();
							dias.addAll(diasAux);
						}
						//ARCHITECTURE
						
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);														
					}
				}
			}
			else if(sAccionBusqueda.equals("PorId")) {
				Long idDia=0L;
				
				if(this.idActual!=null && this.idActual!=0L) {
					idDia=this.idActual;
				
				} else if(this.idDiaActual!=null && this.idDiaActual!=0L) {
					idDia=idDiaActual;
				}
				
					
				this.sDetalleReporte=DiaConstantesFunciones.getDetalleIndicePorId(idDia);
				
				this.dias=new ArrayList<Dia>();
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {					
					diaLogic.getEntity(idDia);
					
					//diaLogic.getEntityWithConnection(idDia);
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
								
				if(Constantes.ISUSAEJBLOGICLAYER) {
					diaLogic.setDias(new ArrayList<Dia>());
					diaLogic.getDias().add(diaLogic.getDia());
				
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.dias=new ArrayList<Dia>();
					this.dias.add(dia);
				}
				
				if(diaLogic.getDia()==null)	{
					
				
				}			
			}
			
		 
		
		
		
		this.redimensionarTablaDatos();
		//this.refrescarForeignKeysDescripcionesDia();
		
		
		if(this.conTotales) {
			this.crearFilaTotales();
		}		
		} catch (JRException e) {
			throw e;
		} catch(Exception e) {
			throw e;
      	} finally {
      		//this.finishProcessDia();
      	}
		
	}				
	
	public void redimensionarTablaDatos() throws Exception {
		int iSizeTabla=0;
				
		iSizeTabla=this.getSizeTablaDatos();
		
		//ARCHITECTURE
		/*
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=diaLogic.getDias().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=dias.size();
		}
		*/
		//ARCHITECTURE
											
		this.redimensionarTablaDatos(iSizeTabla);		
	}
	
	public Integer getSizeTablaDatos() throws Exception {
		Integer iSizeTabla=0;
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=diaLogic.getDias().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=dias.size();
		}
		//ARCHITECTURE
											
		return iSizeTabla;		
	}
	
			
	public Boolean permiteMantenimiento(Dia dia) {
		Boolean permite=true;
		
		if(this.dia.getsType().equals(Constantes2.S_TOTALES)) {
			permite=false;
		}
		
		return permite;
	}
	
	public void traerValoresTablaTotales() throws Exception {
	}
	
	
	public void traerValoresTablaOrderBy() throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.arrOrderBy=DiaConstantesFunciones.getOrderByListaDia();							
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.arrOrderBy=DiaConstantesFunciones.getOrderByListaDia();
		}		
	}
	
	
	public Boolean existeFilaTotales() throws Exception {
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(Dia dia:diaLogic.getDias()) {
				if(dia.getsType().equals(Constantes2.S_TOTALES)) {
					diaTotales=dia;
					existe=true;
					break;
				}
			}
								
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(Dia dia:this.dias) {
				if(dia.getsType().equals(Constantes2.S_TOTALES)) {
					diaTotales=dia;
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
			this.diaAux=new Dia();
			this.diaAux.setsType(Constantes2.S_TOTALES);
			this.diaAux.setIsNew(false);
			this.diaAux.setIsChanged(false);
			this.diaAux.setIsDeleted(false);
				
			if(Constantes.ISUSAEJBLOGICLAYER) {
				DiaConstantesFunciones.TotalizarValoresFilaDia(this.diaLogic.getDias(),this.diaAux);
				
				this.diaLogic.getDias().add(this.diaAux);
				
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				DiaConstantesFunciones.TotalizarValoresFilaDia(this.dias,this.diaAux);
				
				this.dias.add(this.diaAux);
			}
		}
	}
	
	public void quitarFilaTotales() throws Exception {
		diaTotales=new Dia();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.diaLogic.getDias().remove(diaTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.dias.remove(diaTotales);
			}
		}
	}
	
	public void actualizarFilaTotales() throws Exception {
		diaTotales=new Dia();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(Dia dia:diaLogic.getDias()) {
				if(dia.getsType().equals(Constantes2.S_TOTALES)) {
					diaTotales=dia;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				DiaConstantesFunciones.TotalizarValoresFilaDia(this.diaLogic.getDias(),diaTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(Dia dia:this.dias) {
				if(dia.getsType().equals(Constantes2.S_TOTALES)) {
					diaTotales=dia;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				DiaConstantesFunciones.TotalizarValoresFilaDia(this.dias,diaTotales);
			}
		}
	}		
	
	public void recargarInformacion()throws Exception {
		try {
			sAccionBusqueda="Todos";
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda(sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DiaConstantesFunciones.CLASSNAME);
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
	
	public void inicializarPermisosDia() {
		this.isPermisoTodoDia=false;
		this.isPermisoNuevoDia=false;
		this.isPermisoActualizarDia=false;
		this.isPermisoActualizarOriginalDia=false;
		this.isPermisoEliminarDia=false;
		this.isPermisoGuardarCambiosDia=false;
		this.isPermisoConsultaDia=false;
		this.isPermisoBusquedaDia=false;
		this.isPermisoReporteDia=false;		
		this.isPermisoOrdenDia=false;		
		this.isPermisoPaginacionMedioDia=false;		
		this.isPermisoPaginacionAltoDia=false;
		this.isPermisoPaginacionTodoDia=false;
		this.isPermisoCopiarDia=false;		
		this.isPermisoVerFormDia=false;		
		this.isPermisoDuplicarDia=false;		
		this.isPermisoOrdenDia=false;		
	}
	
	public void setPermisosUsuarioDia(Boolean isPermiso) {
		this.isPermisoTodoDia=isPermiso;
		this.isPermisoNuevoDia=isPermiso;
		this.isPermisoActualizarDia=isPermiso;
		this.isPermisoActualizarOriginalDia=isPermiso;
		this.isPermisoEliminarDia=isPermiso;
		this.isPermisoGuardarCambiosDia=isPermiso;
		this.isPermisoConsultaDia=isPermiso;
		this.isPermisoBusquedaDia=isPermiso;
		this.isPermisoReporteDia=isPermiso;
		this.isPermisoOrdenDia=isPermiso;		
		this.isPermisoPaginacionMedioDia=isPermiso;		
		this.isPermisoPaginacionAltoDia=isPermiso;		
		this.isPermisoPaginacionTodoDia=isPermiso;		
		this.isPermisoCopiarDia=isPermiso;		
		this.isPermisoVerFormDia=isPermiso;		
		this.isPermisoDuplicarDia=isPermiso;
		this.isPermisoOrdenDia=isPermiso;
	}
	
	public void setPermisosMantenimientoUsuarioDia(Boolean isPermiso) {
		//this.isPermisoTodoDia=isPermiso;
		this.isPermisoNuevoDia=isPermiso;
		this.isPermisoActualizarDia=isPermiso;
		this.isPermisoActualizarOriginalDia=isPermiso;
		this.isPermisoEliminarDia=isPermiso;
		this.isPermisoGuardarCambiosDia=isPermiso;
		//this.isPermisoConsultaDia=isPermiso;
		//this.isPermisoBusquedaDia=isPermiso;
		//this.isPermisoReporteDia=isPermiso;
		//this.isPermisoOrdenDia=isPermiso;		
		//this.isPermisoPaginacionMedioDia=isPermiso;		
		//this.isPermisoPaginacionAltoDia=isPermiso;		
		//this.isPermisoPaginacionTodoDia=isPermiso;		
		//this.isPermisoCopiarDia=isPermiso;		
		//this.isPermisoDuplicarDia=isPermiso;
		//this.isPermisoOrdenDia=isPermiso;
	}
	
	public void inicializarSetPermisosUsuarioDiaClasesRelacionadas() throws Exception {
		ArrayList<String> arrPaginas=new ArrayList<String>();		
		ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
		
		
		if(DiaJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public Boolean tienePermisosUsuarioEnPaginaWebDia(String sPagina) throws Exception {
		Boolean tienePermisos=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tienePermisos=sistemaLogicAdditional.tienePermisosEnPaginaWeb(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, sPagina);
		} else if(Constantes.ISUSAEJBREMOTE) {
		} else if(Constantes.ISUSAEJBHOME) {
		}
		
		return tienePermisos;
	}
	
	public void inicializarSetPermisosUsuarioDiaClasesRelacionadas(Boolean conPermiso) throws Exception {
		
	}
	
	public Boolean verificarGetPermisosUsuarioDiaClaseRelacionada(ArrayList<String> arrPaginasFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioClaseRelacionada(arrPaginasFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public Boolean verificarGetPermisosUsuarioOpcionDiaClaseRelacionada(List<Opcion> opcionsFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioOpcionClaseRelacionada(opcionsFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public void actualizarTabsSetPermisosUsuarioDiaClasesRelacionadas() throws Exception {
		
	}
	
	public void setPermisosUsuarioDia() throws Exception {
		
		PerfilOpcion perfilOpcionUsuario=new PerfilOpcion();		
		Long idOpcion=this.opcionActual.getId();
		
		if(DiaJInternalFrame.CON_LLAMADA_SIMPLE) {
			perfilOpcionUsuario=this.sistemaReturnGeneral.getPerfilOpcion();
			
		} else {
			if(this.diaSessionBean.getEsGuardarRelacionado()) {
				idOpcion=0L;
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				perfilOpcionUsuario=sistemaLogicAdditional.traerPermisosPaginaWebPerfilOpcion(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, DiaConstantesFunciones.SNOMBREOPCION,idOpcion);				
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
		}
		
		if(perfilOpcionUsuario!=null && perfilOpcionUsuario.getId()>0) {
			this.isPermisoNuevoDia=perfilOpcionUsuario.getingreso()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarDia=perfilOpcionUsuario.getmodificacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarOriginalDia=this.isPermisoActualizarDia;
			this.isPermisoEliminarDia=perfilOpcionUsuario.geteliminacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoGuardarCambiosDia=perfilOpcionUsuario.getguardar_cambios()||perfilOpcionUsuario.gettodo();
			this.isPermisoConsultaDia=perfilOpcionUsuario.getconsulta()||perfilOpcionUsuario.gettodo();
			this.isPermisoBusquedaDia=perfilOpcionUsuario.getbusqueda()||perfilOpcionUsuario.gettodo();
			this.isPermisoTodoDia=perfilOpcionUsuario.gettodo()||perfilOpcionUsuario.gettodo();
			this.isPermisoReporteDia=perfilOpcionUsuario.getreporte()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenDia=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionMedioDia=perfilOpcionUsuario.getpaginacion_medio()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionAltoDia=perfilOpcionUsuario.getpaginacion_alto()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionTodoDia=perfilOpcionUsuario.getpaginacion_todo()||perfilOpcionUsuario.gettodo();
			this.isPermisoCopiarDia=perfilOpcionUsuario.getcopiar()||perfilOpcionUsuario.gettodo();
			this.isPermisoVerFormDia=true;//perfilOpcionUsuario.getver_form()||perfilOpcionUsuario.gettodo();
			this.isPermisoDuplicarDia=perfilOpcionUsuario.getduplicar()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenDia=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			
			if(this.diaSessionBean.getEsGuardarRelacionado()) {
				this.opcionActual.setId(perfilOpcionUsuario.getid_opcion());
				
				this.jTableDatosDia.setToolTipText(this.jTableDatosDia.getToolTipText()+"_"+perfilOpcionUsuario.getid_opcion());		
			}
		} else {
			this.setPermisosUsuarioDia(false);
		}
		
		//SI SE NECESITA PONER TODOS LOS PERMISOS POR DEFECTO
		//
		
	}
	
	public void setAccionesUsuarioDia(Boolean esParaAccionesFormulario) throws Exception {		
		Reporte reporte=null;
		
		if(!esParaAccionesFormulario) {
			this.accions=new ArrayList<Accion>();
			
			if(DiaJInternalFrame.CON_LLAMADA_SIMPLE) {
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
			
			if(DiaJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public void setRelacionesUsuarioDia() throws Exception {
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
	
		
	public void inicializarCombosForeignKeyDiaListas()throws Exception {
		try	{						
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void cargarCombosTodosForeignKeyDiaListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			String sFinalQueryCombo="";
			
			Modulo  moduloActualAux=new Modulo();
			
			if(DiaJInternalFrame.ISLOAD_FKLOTE) {
				this.cargarCombosLoteForeignKeyDiaListas(false);
			} else {
			
			}
		} catch(Exception e) {
			throw e;
		}		
	}		
	
	
	
	public void cargarCombosLoteForeignKeyDiaListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			Modulo  moduloActualAux=new Modulo();
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void addItemDefectoCombosTodosForeignKeyDia()throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	


	
	public void initActionsCombosTodosForeignKeyDia()throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void initActionsCombosTodosForeignKeyDia(String sFormularioTipoBusqueda)throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	


	
	


	
	public void setVariablesGlobalesCombosForeignKeyDia()throws Exception {	
		try {
			if(this.parametroGeneralUsuario!=null && this.parametroGeneralUsuario.getId()>0) {
			
			
			
			}
			
			//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
			this.setVariablesGlobalesAuxiliaresCombosForeignKeyDia();
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToFormularioForeignKeyDia(Dia dia)throws Exception {	
		try {
						
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToListasForeignKeyDia(Dia dia,String sTipoEvento)throws Exception {	
		try {
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	/*
	public void setVariablesCombosFromBeanForeignKeyDia()throws Exception {	
		try {
						
		} catch(Exception e) {
			throw e;
		}
	}
	*/
	
	public void setVariablesGlobalesAuxiliaresCombosForeignKeyDia()throws Exception {	
		try {
			
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesDefaultCombosForeignKeyDia()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesParametroCombosForeignKeyDia()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void cargarCombosParametroDia()throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			//this.cargarDatosCliente();
			
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
		
	public void cargarCombosFrameForeignKeyDia()throws Exception {
		try {
			


		} catch(Exception e) {
			throw e;
		}		
	}		
	
	public void cargarCombosFrameForeignKeyDia(String sFormularioTipoBusqueda)throws Exception {
		try {
			


		} catch(Exception e) {
			throw e;
		}		
	}	
	
	public void setItemDefectoCombosForeignKeyDia()throws Exception {
		try {
			


		} catch(Exception e) {
			throw e;
		}		
	}		
	
	
	
	

	public DiaBeanSwingJInternalFrame() throws Exception {
		super(false,PaginaTipo.PRINCIPAL);
	}
	
	public DiaBeanSwingJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
	}
	
	public DiaBeanSwingJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
		
		this.diaSessionBean=new DiaSessionBean(); 
		this.diaConstantesFunciones=new DiaConstantesFunciones(); 
		this.diaBean=new Dia();//(this.diaConstantesFunciones); 		
		this.diaReturnGeneral=new DiaParameterReturnGeneral(); 
		
		this.diaSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.diaSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
				
	}
	
	public DiaBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,cargarTodosDatos);
	}
		
	public DiaBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,false,false,cargarRelaciones,cargarTodosDatos);
	}	
	
	public DiaBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos) throws Exception //Boolean esParaBusquedaForeignKey
    {
		super(jdesktopPane,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		try {
			
			this.permiteRecargarForm=false;
			
			this.startProcessDia(true);
			
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
			
			this.diaConstantesFunciones=new DiaConstantesFunciones(); 
			this.diaBean=new Dia();//this.diaConstantesFunciones); 			
			this.diaReturnGeneral=new DiaParameterReturnGeneral(); 
		
			DiaBeanSwingJInternalFrameAdditional.CargaInicialInicio(this, "NORMAL", null);
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Dia Mantenimiento",paginaTipo));			
			
			this.conTotales=false;
			
			
			
			this.dia=new Dia();
			this.dias = new ArrayList<Dia>();
			this.diasAux = new ArrayList<Dia>();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.diaLogic=new DiaLogic();
				this.diaLogic.getNewConnexionToDeep("");
			}
			
			//this.diaSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
			//this.diaSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
			
			this.jDesktopPane=jdesktopPane;
			
			if(this.jDesktopPane.getClass().equals(JDesktopPaneMe.class)) {
				this.constantes2=((JDesktopPaneMe)this.jDesktopPane).constantes2;
			}
			
			if(!Constantes.CON_VARIAS_VENTANAS) {
    			MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameDetalleFormDia);
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameReporteDinamicoDia!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoDia);	
					}
					
					if(this.jInternalFrameImportacionDia!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionDia);							
					}
					
				}
				
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameOrderByDia!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameOrderByDia);					
					}
					
				}
			}
			
			//DETALLE DATOS
			if(this.jInternalFrameDetalleFormDia!=null) { //this.conCargarFormDetalle) {
				this.jDesktopPane.add(this.jInternalFrameDetalleFormDia);
				this.jInternalFrameDetalleFormDia.setVisible(false);
				this.jInternalFrameDetalleFormDia.setSelected(false);						
			}
			
			if(!this.conCargarMinimo) {
				
				//REPORTE DINAMICO
				if(this.jInternalFrameReporteDinamicoDia!=null) {
					this.jDesktopPane.add(this.jInternalFrameReporteDinamicoDia);
					this.jInternalFrameReporteDinamicoDia.setVisible(false);
					this.jInternalFrameReporteDinamicoDia.setSelected(false);
				}
				
				//IMPORTACION
				if(this.jInternalFrameImportacionDia!=null) {
					this.jDesktopPane.add(this.jInternalFrameImportacionDia);
					this.jInternalFrameImportacionDia.setVisible(false);
					this.jInternalFrameImportacionDia.setSelected(false);
				}
				
				
			}
			
			
			if(!this.conCargarMinimo) {
				
				if(this.jInternalFrameOrderByDia!=null) {
					this.jDesktopPane.add(this.jInternalFrameOrderByDia);
					this.jInternalFrameOrderByDia.setVisible(false);
					this.jInternalFrameOrderByDia.setSelected(false);				
				}
				
			}
			
			
			//this.esParaBusquedaForeignKey=false;
			this.esParaBusquedaForeignKey=esParaBusquedaForeignKey;
			
			this.invalidValues=new InvalidValue[0];
			
			
			
			this.idDiaActual=0L;
			this.rowIndexActual=0;
			
			
			this.iNumeroPaginacionPagina=0;
			this.iNumeroPaginacion=DiaConstantesFunciones.INUMEROPAGINACION;
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
			
			this.diaReturnGeneral=new DiaParameterReturnGeneral();
			
			this.diaParameterGeneral=new DiaParameterReturnGeneral();
			
			
			
			this.sistemaLogicAdditional=new SistemaLogicAdditional();
			
			this.sistemaLogicAdditional.setConnexion(this.diaLogic.getConnexion());			
			
			
			
			
			
			
			
			//VERIFICAR GLOBAL
			this.cargarDatosCliente();			
			
			
			if(!this.diaSessionBean.getEsGuardarRelacionado()) {
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
			
			if(DiaJInternalFrame.CON_LLAMADA_SIMPLE) {
				if(this.diaSessionBean.getEsGuardarRelacionado()) {
					this.opcionActual.setId(0L);
					
					//idOpcion=0L;					
				}
				
				ArrayList<String> arrPaginas=new ArrayList<String>();		
				ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
				
		
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					//this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActualWithConnection(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,DiaConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.diaSessionBean.getEsGuardarRelacionado(),this.diaSessionBean.getConGuardarRelaciones(),arrPaginas);
					
					this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActual(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,DiaConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.diaSessionBean.getEsGuardarRelacionado(),this.diaSessionBean.getConGuardarRelaciones(),arrPaginas);
					
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
			
			this.isVisibilidadCeldaNuevoDia=false;
			this.isVisibilidadCeldaDuplicarDia=true;
			this.isVisibilidadCeldaCopiarDia=true;
			this.isVisibilidadCeldaVerFormDia=true;
			this.isVisibilidadCeldaOrdenDia=true;
			this.isVisibilidadCeldaNuevoRelacionesDia=false;
			this.isVisibilidadCeldaModificarDia=false;
			this.isVisibilidadCeldaActualizarDia=false;
			this.isVisibilidadCeldaEliminarDia=false;
			this.isVisibilidadCeldaCancelarDia=false;
			this.isVisibilidadCeldaGuardarDia=false;
			this.isVisibilidadCeldaGuardarCambiosDia=false;
			
			
			
			//ELEMENTOS TABLAS PARAMETOS
			
			
			
			//ELEMENTOS TABLAS PARAMETOS_FIN
			
			//this.actualizarEstadoCeldasBotonesDia("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
						
			
			
			this.inicializarPermisosDia();
			
			//INICIALIZAR FALSE, TALVEZ COMENTAR
			this.setPermisosUsuarioDia(false);
			
			this.setPermisosUsuarioDia();
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.diaSessionBean.getEsGuardarRelacionado() 
				|| (this.diaSessionBean.getEsGuardarRelacionado() && this.diaSessionBean.getConGuardarRelaciones())) {
				
				this.inicializarSetPermisosUsuarioDiaClasesRelacionadas();
			}
			
			if(this.diaSessionBean.getConGuardarRelaciones()) {
				this.actualizarTabsSetPermisosUsuarioDiaClasesRelacionadas();
			}
			
			
			
			//SOLO SE EJECUTA LA PRIMERA VEZ, BINDINGS SI FUNCIONA
			if(!DiaJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingBotonesPermisosDia();
			} else {
				this.inicializarActualizarBindingBotonesPermisosManualDia();
			}
			
			if(!this.isPermisoBusquedaDia) {
			}
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.diaSessionBean.getEsGuardarRelacionado()) {				
				this.tiposArchivosReportes=Funciones.getListTiposArchivosReportes();
				this.tiposArchivosReportesDinamico=Funciones.getListTiposArchivosReportes();
				this.tiposReportes=Funciones.getListTiposReportes(false);
				this.tiposReportesDinamico=Funciones.getListTiposReportesDinamico(false);
				
				
				
				this.tiposGraficosReportes=Funciones2.getListTiposGraficosReportes();
				this.tiposPaginacion=Funciones2.getListTiposPaginacion(this.isPermisoPaginacionMedioDia,this.isPermisoPaginacionMedioDia,this.isPermisoPaginacionTodoDia);
				this.tiposSeleccionar=Funciones2.getListTiposSeleccionar();
				this.tiposSeleccionar.addAll(DiaConstantesFunciones.getTiposSeleccionarDia());
				
				this.tiposColumnasSelect=DiaConstantesFunciones.getTiposSeleccionarDia(true);
				
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
			//if(!this.diaSessionBean.getEsGuardarRelacionado()) {
				//SE ENCUENTRA MAS ADELANTE CON ACCIONES POR USUARIO
				//ACCIONES GENERALES Y POR USUARIO
				this.tiposRelaciones=Funciones2.getListTiposRelaciones();
				this.setRelacionesUsuarioDia();
				
				this.tiposAcciones=Funciones2.getListTiposAcciones(false,true,false);
				this.setAccionesUsuarioDia(false);	
				
				this.tiposAccionesFormulario=Funciones2.getListTiposAccionesFormulario(false,true,false);							
				this.setAccionesUsuarioDia(true);	
				
				this.inicializarActualizarBindingtiposArchivosReportesAccionesDia() ;
			
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
			
			
			//PARAMETROS
			
			
			/*
			if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {		
				hashtableEnv =  Funciones.getHashtableEnv();		
				initialContext = new InitialContext(hashtableEnv);	
			}
			*/
			/*
			if(Constantes.ISUSAEJBREMOTE) {
				diaImplementable= (DiaImplementable) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+DiaConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBREMOTE);
			} else if(Constantes.ISUSAEJBHOME) {
				diaImplementableHome= (DiaImplementableHome) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+DiaConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBLOCAL);
			}			
			*/
			
			
			this.dias= new ArrayList<Dia>();
			this.diasEliminados= new ArrayList<Dia>();
						
			this.isEsNuevoDia=false;
			this.esParaAccionDesdeFormularioDia=false;
			this.isEsMantenimientoRelacionesRelacionadoUnico=false;
			this.isEsMantenimientoRelaciones=false;
			this.isEsMantenimientoRelacionado=false;
			this.isContieneImagenes=false;
			
			
			
			
			
			//INICIALIZAR LISTAS FK
			
			
			
			
			
			if(blncargarCombostrForeignKey) {
				this.cargarCombosForeignKeyDia(this.isCargarCombosDependencia);
			}
			
			this.cargarCombosParametroDia();
			
			
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.diaSessionBean.getEsGuardarRelacionado()) {
				this.onLoad();
			}
						
			
			/*
			if(blnCargarInformacionInicial) {
				this.recargarInformacion();
			}
			*/
			//this.iNumeroPaginacionPagina=0;
			//this.iNumeroPaginacion=DiaConstantesFunciones.INUMEROPAGINACION;
			
			this.actualizarEstadoCeldasBotonesDia("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			//SOLO LA PRIMERA VEZ HACE LOS BINDINGS, SOLO AHI FUNCIONA
			this.inicializarActualizarBindingDia(true); 
			
			//SE REDIMENSIONA SINO NO SE ACTUALIZA
			this.redimensionarTablaDatos();
			
			
			this.initActions();
			
			;
						
			if(this.jInternalFrameDetalleFormDia!=null) {//if(this.conCargarFormDetalle) {
				this.cargarMenuRelaciones();
			}
			
			//OBLIGA CARGAR DETALLE, MEJOR DESHABILITAR, FALTA TALVEZ PONER EN SELECCIONAR
			//MAYBE
			//this.updateControlesFormularioDia();
			
			if(!this.conCargarMinimo) {
				this.updateBusquedasFormularioDia();
			}
			
			
			
			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.diaLogic.commitNewConnexionToDeep();
			}
			
			
			if(Constantes2.ISDEVELOPING2) {
				end_time = System.currentTimeMillis();			
				String sTipo="Load Ventana";
				Funciones2.getMensajeTiempoEjecucion(start_time, end_time, sTipo,false);
			}  
			
			this.finishProcessDia(true);
			
			this.dEnd=(double)System.currentTimeMillis();
			
			this.dDif=this.dEnd - this.dStart;
			
			if(Constantes.ISDEVELOPING) {
				System.out.println("Tiempo(ms) Carga Dia: " + this.dDif); 
			}
			
			this.permiteRecargarForm=true;
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.diaLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,DiaConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.diaLogic.closeNewConnexionToDeep();
			}
		}	 
    }
	
	public void cargarTiposRelacionesSelectDia() {
		Reporte reporte=new Reporte();
		
	
	}
	
	
	
	public void jTabbedPaneChangeListenerGeneral(String sTipo,ChangeEvent evt) { 	  
		Boolean procesaCargarParteTab=false;
			
		try {
			int iIndex=0;		    			
			String sTitle="";
			
			//TABBED PANE RELACIONES
			if(sTipo.equals("RelacionesDia")) {
				iIndex=this.jInternalFrameDetalleFormDia.jTabbedPaneRelacionesDia.getSelectedIndex();		    
			
				sTitle=this.jInternalFrameDetalleFormDia.jTabbedPaneRelacionesDia.getTitleAt(iIndex);
				
				Integer intSelectedRow = 0;	
			
				intSelectedRow = this.jTableDatosDia.getSelectedRow();	
				
				
				
			}
			
			//TABBED PANE RELACIONES FIN(EXTRA TAB)
			;
			
  		} catch(Exception e) {
  			e.printStackTrace();
  		} finally {
			if(procesaCargarParteTab) {				
				this.finishProcessDia();	
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
	
	public void cargarCombosForeignKeyDia(Boolean cargarCombosDependencia) throws Exception {   
		this.cargarCombosForeignKeyDia(cargarCombosDependencia,true,true);
	}
	
	//CARGAR COMBOS EN LOTE
	public void cargarCombosForeignKeyDia(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales) throws Exception {   
		this.cargarCombosTodosForeignKeyDiaListas(cargarCombosDependencia);
				
		this.addItemDefectoCombosTodosForeignKeyDia();
		
		this.cargarCombosFrameForeignKeyDia();						
		
		if(conInitActions) {
			this.initActionsCombosTodosForeignKeyDia();
		}
		
		if(conSetVariablesGlobales) {
			this.setVariablesGlobalesCombosForeignKeyDia();
		}
	}
	
	
	
	public void jButtonNuevoDiaActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.FORM_RECARGAR;
			String sTipo="NUEVO_NORMAL";
			
			this.estaModoNuevo=true;
			
			if(this.diaSessionBean.getConGuardarRelaciones()) {
				this.dStart=(double)System.currentTimeMillis();
			}
				
			//if(this.esUsoDesdeHijo) {
			//	eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
			//}
											
			if(this.jInternalFrameDetalleFormDia==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}			
				
			DiaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.dia,new Object(),this.diaParameterGeneral,this.diaReturnGeneral);
			
			
			if(jTableDatosDia.getRowCount()>=1) {
				jTableDatosDia.removeRowSelectionInterval(0, jTableDatosDia.getRowCount()-1);						
			}
			
			this.isEsNuevoDia=true;
			
			//ESTABLECE SI ES RELACIONADO O NO 
			this.habilitarDeshabilitarTipoMantenimientoDia(esRelaciones);
			
			this.nuevoPreparar(false); 
			this.habilitarDeshabilitarControlesDia(true);			
			//this.dia=new Dia();
			//this.dia.setIsChanged(true);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesDia(false) ;						
			 
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualDia() ;
			
			if(DiaJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleDia(esRelaciones);
			}
					
			//Se Duplica, sin sentido
			//this.actualizarInformacion("EVENTO_NUEVO",false,this.dia);	
			this.actualizarInformacion("INFO_PADRE",false,this.dia);				
			
			DiaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.dia,new Object(),this.diaParameterGeneral,this.diaReturnGeneral);
			
			if(this.diaSessionBean.getConGuardarRelaciones()) {
				this.dEnd=(double)System.currentTimeMillis();					
				this.dDif=this.dEnd - this.dStart;
					
				if(Constantes.ISDEVELOPING) {
					System.out.println("Tiempo(ms) Nuevo Preparar Dia: " + this.dDif); 
				}
			}
			
			//false para que pueda generar eventos
			this.estaModoNuevo=false;
							
			//Con this.estaModoNuevo=false;, se permite actualizar y usar eventos control al mismo tiempo (FuncionTipo.LAST)			
			DiaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.LAST,ControlTipo.FORM,EventoTipo.CLIC,EventoSubTipo.NEW,sTipo,this.dia,new Object(),this.diaParameterGeneral,this.diaReturnGeneral);
			
		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,DiaConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;			
		}
	}
	
	public void jButtonDuplicarDiaActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			Boolean soloDuplicarUno=false;
			Boolean conSeleccionarFilaTabla=false;
			
			this.estaModoNuevo=true;
			this.estaModoDuplicar=true;
			
			ArrayList<Dia> diasSeleccionados=new ArrayList<Dia>();
			int intSelectedRow =-1;
			Integer iNumRowsSeleccionados=0;
			int[] arrNumRowsSeleccionados=null;
			
			//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
			if(conSeleccionarFilaTabla) {
				arrNumRowsSeleccionados=this.jTableDatosDia.getSelectedRows();
				iNumRowsSeleccionados=this.jTableDatosDia.getSelectedRows().length;			
			}
			
			diasSeleccionados=this.getDiasSeleccionados(false);
				
			if((soloDuplicarUno && iNumRowsSeleccionados.equals(1)) || !soloDuplicarUno) {
				//LO HACE NUEVOPREPARAR
				//this.iIdNuevoDia--;			
				//Dia diaAux= new Dia();			
				//diaAux.setId(this.iIdNuevoDia);																
				
				//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
				//Dia diaOrigen=new Dia();
				//for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {				
				
				for(Dia diaOrigen : diasSeleccionados) {
					if(conSeleccionarFilaTabla) {
						if(!soloDuplicarUno) {
							//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
							//intSelectedRow =iNumRowSeleccionado;
						} else {
							intSelectedRow = this.jTableDatosDia.getSelectedRow();
						}
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							diaOrigen =(Dia) this.diaLogic.getDias().toArray()[this.jTableDatosDia.convertRowIndexToModel(intSelectedRow)];
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							diaOrigen =(Dia) this.dias.toArray()[this.jTableDatosDia.convertRowIndexToModel(intSelectedRow)];
						}
					}
					
					this.aumentarTamanioFilaNuevaTablaDia();
					
					if(this.conTotales) {
						this.quitarFilaTotales();
					}
					
					this.nuevoPreparar(true);
					
					this.dia.setsType("DUPLICADO");
					
					this.setCopiarVariablesObjetosDia(diaOrigen,this.dia,true,true);
					
					this.setVariablesFormularioToObjetoActualForeignKeysDia(this.dia);
					
					//LO HACE NUEVOPREPARAR
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.diaLogic.getDias().add(this.diaAux);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.dias.add(this.diaAux);				
					}
					*/
				}
				
				this.inicializarActualizarBindingTablaDia(false);
				
				this.jTableDatosDia.setRowSelectionInterval(this.getIndiceNuevoDia(), this.getIndiceNuevoDia());
				
				int iLastRow =  this.jTableDatosDia.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosDia.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosDia.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaDia(false);
				}
			} else {
				throw new Exception("DEBE ESTAR SELECCIONADO 1 REGISTRO");
			}
			
		} catch(Exception e) {			
			FuncionesSwing.manageException(this, e,logger,DiaConstantesFunciones.CLASSNAME);
		
		} finally {
			this.estaModoNuevo=false;
			this.estaModoDuplicar=false;
		}
	}
	
	public void jButtonCopiarDiaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			Boolean conSeleccionarFilaTabla=false;
			Integer iNumRowsSeleccionados=0;
			int[] intSelectedRows =null;
			int intSelectedRow =0;
			
			this.estaModoCopiar=true;
			
			ArrayList<Dia> diasSeleccionados=new ArrayList<Dia>();									
		
			Dia diaOrigen=new Dia();
			Dia diaDestino=new Dia();
				
			diasSeleccionados=this.getDiasSeleccionados(false);
			
			if(conSeleccionarFilaTabla) {
				iNumRowsSeleccionados=this.jTableDatosDia.getSelectedRows().length;	
			}
			
			if(iNumRowsSeleccionados.equals(2) || diasSeleccionados.size()==2) {
				if(conSeleccionarFilaTabla) {
					intSelectedRows =this.jTableDatosDia.getSelectedRows();
					intSelectedRow = intSelectedRows[0];	
									
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						diaOrigen =(Dia) this.diaLogic.getDias().toArray()[this.jTableDatosDia.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						diaOrigen =(Dia) this.dias.toArray()[this.jTableDatosDia.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					intSelectedRow = intSelectedRows[1];
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						diaDestino =(Dia) this.diaLogic.getDias().toArray()[this.jTableDatosDia.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						diaDestino =(Dia) this.dias.toArray()[this.jTableDatosDia.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				}
				
				diaOrigen =diasSeleccionados.get(0);
				diaDestino =diasSeleccionados.get(1);
				
				this.setCopiarVariablesObjetosDia(diaOrigen,diaDestino,true,false);
				
				diaDestino.setsType("DUPLICADO");
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(diaDestino,diaLogic.getDias());					
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(diaDestino,dias);
				}
				//ARCHITECTURE
				
				this.inicializarActualizarBindingTablaDia(false);
				
				//this.jTableDatosDia.setRowSelectionInterval(this.getIndiceNuevoDia(), this.getIndiceNuevoDia());
				
				int iLastRow =  this.jTableDatosDia.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosDia.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosDia.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					//this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaDia(false);
				}
			} else {
				throw new Exception("DEBEN ESTAR SELECCIONADOS 2 REGISTROS");
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DiaConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.estaModoCopiar=false;
		}
	}
	
	public void jButtonVerFormDiaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormDia==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.jInternalFrameDetalleFormDia.setSelected(true);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DiaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonMostrarOcultarDiaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			Boolean isVisible=this.jPanelParametrosReportesDia.isVisible();
			
			
			this.jPanelParametrosReportesDia.setVisible(!isVisible);
			this.jPanelPaginacionDia.setVisible(!isVisible);
			this.jPanelAccionesDia.setVisible(!isVisible);
							
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DiaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarDiaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.closingInternalFrameDia();
			
			//if(this.jInternalFrameParent==null) {
				//this.dispose();
			/*} else {
				this.setVisible(false);
	        	this.setSelected(false);	
			}*/			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DiaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarReporteDinamicoDiaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameReporteDinamicoDia();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DiaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarImportacionDiaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameImportacionDia();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DiaConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonAbrirOrderByDiaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			
			this.abrirInicializarFrameOrderByDia();
			
			this.abrirFrameOrderByDia();
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DiaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarOrderByDiaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameOrderByDia();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DiaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void abrirFrameDetalleDia(Boolean esRelaciones) throws Exception {	    	        
	    try {
			//CAUSA PROBLEMAS, SE ADICIONA EN CONSTRUCTOR, LUEGO SOLO VISIBLE true y false
			//this.jDesktopPane.add(jInternalFrameDetalleFormDia);
			
			if(!esRelaciones) {
				if(this.jInternalFrameDetalleFormDia.isMaximum()) {
					this.jInternalFrameDetalleFormDia.setMaximum(false);
				}								
				
	    		this.jInternalFrameDetalleFormDia.setSize(this.jInternalFrameDetalleFormDia.iWidthFormulario,this.jInternalFrameDetalleFormDia.iHeightFormulario);
	    	} else {
				if(this.iWidthScroll<this.jInternalFrameDetalleFormDia.iWidthFormularioMaximo) {
	    			this.jInternalFrameDetalleFormDia.setSize(this.iWidthScroll,this.iHeightScroll);
				} else {
					if(!this.jInternalFrameDetalleFormDia.isMaximum()) {
						this.jInternalFrameDetalleFormDia.setMaximum(true);
					}
				}
				
				if(this.jInternalFrameDetalleFormDia.jContentPaneDetalleDia.getWidth() > this.getWidth()) {
					this.jInternalFrameDetalleFormDia.jTabbedPaneRelacionesDia.setMinimumSize(new Dimension(this.jInternalFrameDetalleFormDia.jContentPaneDetalleDia.getWidth(),DiaConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormDia.jTabbedPaneRelacionesDia.setMaximumSize(new Dimension(this.jInternalFrameDetalleFormDia.jContentPaneDetalleDia.getWidth(),DiaConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormDia.jTabbedPaneRelacionesDia.setPreferredSize(new Dimension(this.jInternalFrameDetalleFormDia.jContentPaneDetalleDia.getWidth(),DiaConstantesFunciones.ALTO_TABPANE_RELACIONES));
					
					Dimension dimension=new Dimension(); 
					
					
				}
	    	}
			
		
	       	this.jInternalFrameDetalleFormDia.setVisible(true);
	        this.jInternalFrameDetalleFormDia.setSelected(true);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,DiaConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirInicializarFrameOrderByDia() throws Exception {	    	        
	    try {
			if(this.jInternalFrameOrderByDia==null) {
				
				if(!this.conCargarMinimo) {
					this.jInternalFrameOrderByDia=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByDia,false,this);
				} else {
					this.jInternalFrameOrderByDia=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByDia,true,this);
				}
				
				this.jDesktopPane.add(this.jInternalFrameOrderByDia);
				this.jInternalFrameOrderByDia.setVisible(false);
				this.jInternalFrameOrderByDia.setSelected(false);
				
				this.jInternalFrameOrderByDia.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByDia"));
				
				this.inicializarActualizarBindingTablaOrderByDia();
			}
		} catch (final Exception e) {
			
		}
	}
	
	
	
	public void abrirInicializarFrameImportacionDia() throws Exception {	    	        
	    try {
			if(this.jInternalFrameImportacionDia==null) {
				
				this.jInternalFrameImportacionDia=new ImportacionJInternalFrame(DiaConstantesFunciones.SCLASSWEBTITULO,this);			
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionDia);							
				
				this.jDesktopPane.add(this.jInternalFrameImportacionDia);
				this.jInternalFrameImportacionDia.setVisible(false);
				this.jInternalFrameImportacionDia.setSelected(false);


				this.jInternalFrameImportacionDia.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionDia"));
				this.jInternalFrameImportacionDia.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionDia"));
				this.jInternalFrameImportacionDia.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionDia"));


			}
		} catch (final Exception e) {
			
		}
	}		
	
	
	
	public void abrirInicializarFrameReporteDinamicoDia() throws Exception {	    	        
	    try {
			
			if(this.jInternalFrameReporteDinamicoDia==null) {
				this.jInternalFrameReporteDinamicoDia=new ReporteDinamicoJInternalFrame(DiaConstantesFunciones.SCLASSWEBTITULO,this);	
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoDia);	
	
	
				this.jDesktopPane.add(this.jInternalFrameReporteDinamicoDia);
				this.jInternalFrameReporteDinamicoDia.setVisible(false);
				this.jInternalFrameReporteDinamicoDia.setSelected(false);
	
	
	
				this.jInternalFrameReporteDinamicoDia.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoDia"));
				this.jInternalFrameReporteDinamicoDia.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoDia"));
				this.jInternalFrameReporteDinamicoDia.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoDia"));
	
				this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualDia();
			}

		} catch (final Exception e) {
			
		}
	}	
	
	
	
					
	public void cerrarFrameDetalleDia() throws Exception {	    	        
	    try {
			//this.jDesktopPane.add(jInternalFrameDetalleFormDia);
			
	       	this.jInternalFrameDetalleFormDia.setVisible(false);
	        this.jInternalFrameDetalleFormDia.setSelected(false);
			
			//this.jInternalFrameDetalleFormDia.dispose();
			//this.jInternalFrameDetalleFormDia=null;
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,DiaConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirFrameReporteDinamicoDia() throws Exception {	    	        
	    try {
			
			this.jInternalFrameReporteDinamicoDia.setVisible(true);
	        this.jInternalFrameReporteDinamicoDia.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,DiaConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void abrirFrameImportacionDia() throws Exception {	    	        		
	    try {			
			this.jInternalFrameImportacionDia.setVisible(true);
	        this.jInternalFrameImportacionDia.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,DiaConstantesFunciones.CLASSNAME);
	    }		
	}	
	
	
	
	
	
	public void abrirFrameOrderByDia() throws Exception {	    	        		
	    try {
			this.jInternalFrameOrderByDia.setVisible(true);
	        this.jInternalFrameOrderByDia.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,DiaConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameOrderByDia() throws Exception {	    	        		
	    try {			
			this.jInternalFrameOrderByDia.setVisible(false);
	        this.jInternalFrameOrderByDia.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,DiaConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameReporteDinamicoDia() throws Exception {			
	    try {
			this.jInternalFrameReporteDinamicoDia.setVisible(false);
	        this.jInternalFrameReporteDinamicoDia.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,DiaConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameImportacionDia() throws Exception {	    	        		
	    try {
			this.jInternalFrameImportacionDia.setVisible(false);
	        this.jInternalFrameImportacionDia.setSelected(false);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,DiaConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	
	public void jButtonModificarDiaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.modificarDia(evt,-1,false);
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DiaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void modificarDia(ActionEvent evt,int rowIndex,Boolean esRelaciones) throws Exception {   
		try {
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosDia.getSelectedRow();
			}
			
			this.habilitarDeshabilitarControlesDia(true);
			//this.isEsNuevoDia=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.dia =(Dia) this.diaLogic.getDias().toArray()[this.jTableDatosDia.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.dia =(Dia) this.dias.toArray()[this.jTableDatosDia.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.actualizarEstadoCeldasBotonesDia("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesDia(false) ;
			
			if(diaSessionBean.getConGuardarRelaciones()) {
			
			}
			
			if(DiaJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleDia(esRelaciones);
			}
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualDia(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DiaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarFilaTablaDiaActual() { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL
			Integer intSelectedRow = this.jTableDatosDia.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.dia =(Dia) this.diaLogic.getDias().toArray()[this.jTableDatosDia.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.dia =(Dia) this.dias.toArray()[this.jTableDatosDia.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DiaConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void seleccionarDia(ActionEvent evt,int rowIndex) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormDia==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosDia.getSelectedRow();
			}
			
			//this.habilitarDeshabilitarControlesDia(true);
			//this.isEsNuevoDia=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.dia =(Dia) this.diaLogic.getDias().toArray()[this.jTableDatosDia.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.dia =(Dia) this.dias.toArray()[this.jTableDatosDia.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.jInternalFrameParent.setIdCombosCodigoDesdeBusquedaForeignKey(this.dia.getId(),this.sTipoBusqueda);
			
			this.dispose();
			
			//this.actualizarEstadoCeldasBotonesDia("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			/*
			this.inicializarActualizarBindingBotonesDia(false) ;
			
			if(DiaJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleDia(esRelaciones);
			}
			*/
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualDia(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DiaConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void setIdCombosCodigoDesdeBusquedaForeignKey(Long id,String sType)throws Exception{
		
		try {
		} catch(Exception e) {
			throw e;
		}
	}
	
	
	
	
	public void jButtonActualizarDiaActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.diaLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingParametrosReportesDia(false);
			
			//if(!this.isEsNuevoDia) {								
				int intSelectedRow = this.jTableDatosDia.getSelectedRow();	
				
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.dia =(Dia) this.diaLogic.getDias().toArray()[this.jTableDatosDia.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.dia =(Dia) this.dias.toArray()[this.jTableDatosDia.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
			//}
				
			if(DiaJInternalFrame.ISBINDING_MANUAL_TABLA) {
				this.setVariablesFormularioToObjetoActualDia(this.dia,true);
				this.setVariablesFormularioToObjetoActualForeignKeysDia(this.dia);
				
			}
			
			if(this.permiteMantenimiento(this.dia)) {	
				this.actualizar();
				
				if(!this.isGuardarCambiosEnLote && !this.diaSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
					
					this.isEsNuevoDia=true;
					this.inicializarActualizarBindingTablaDia(false);
					this.isEsNuevoDia=false;
				
				} else {					
					
					//PARA RELACIONADO ACTUALIZAR FILA TOTALES
					this.isEsNuevoDia=true;
					this.procesoActualizarFilaTotales(false,"MANTENIMIENTO");
					this.isEsNuevoDia=false;
				}
						
								
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesDia(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualDia(false);
				
				this.habilitarDeshabilitarControlesDia(false);
			
												
				
				if(DiaJInternalFrame.CON_DATOS_FRAME) {
					if(!this.isPostAccionSinCerrar) {
						this.cerrarFrameDetalleDia();
					}
				}
				
				if(this.isPostAccionNuevo) {
					this.jButtonNuevoDiaActionPerformed(evt,diaSessionBean.getConGuardarRelaciones());
				} else {
					if(this.isPostAccionSinCerrar) {
						Integer intSelectedRowActual=this.getIndiceActualDia(this.dia,intSelectedRow);
						
						if(intSelectedRow>-1) {
							this.jTableDatosDia.setRowSelectionInterval(intSelectedRowActual, intSelectedRowActual);
							this.jButtonIdActionPerformed(evt,intSelectedRowActual,diaSessionBean.getConGuardarRelaciones(),false);
						}
					}
				}
				
				this.cancelar(false);
				
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.diaLogic.commitNewConnexionToDeep();
			}
			
			
			if(this.jInternalFrameParent!=null) { //&& this.isEsMantenimientoRelacionado) {
				Boolean esUsoDesdeHijoLocal=true;
				String sTipo="Formulario";
				Boolean conIrServidorAplicacionParent=false;
				Long id=this.dia.getId();
				ArrayList<String> arrClasses=new ArrayList<String>();
				
				GeneralEntityParameterGeneral generalEntityParameterGeneral=new GeneralEntityParameterGeneral();
				
				generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
				generalEntityParameterGeneral.setsDominio("Formulario");
				generalEntityParameterGeneral.setsDominioTipo(Dia.class.getName());
				
				this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",Dia.class.getName(),sTipo,"FORMULARIO",esControlTabla,conIrServidorAplicacionParent,
					id,this, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.FORM,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
					evt,generalEntityParameterGeneral,this);
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.diaLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,DiaConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.diaLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonEliminarDiaActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.diaLogic.getNewConnexionToDeep("");
			}
			
			int intSelectedRow = this.jTableDatosDia.getSelectedRow();	       
							
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.dia =(Dia) this.diaLogic.getDias().toArray()[this.jTableDatosDia.convertRowIndexToModel(intSelectedRow)];
				this.dia.setIsDeleted(true);
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.dia =(Dia) this.dias.toArray()[this.jTableDatosDia.convertRowIndexToModel(intSelectedRow)];
				this.dia.setIsDeleted(true);
			}
			//ARCHITECTURE
			
			if(this.permiteMantenimiento(this.dia)) {
				this.eliminar();
				
				if(!this.isGuardarCambiosEnLote && !this.diaSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
				}
				
				((DiaModel) this.jTableDatosDia.getModel()).fireTableRowsDeleted(intSelectedRow,intSelectedRow);
				
				this.isEsNuevoDia=true;
				this.inicializarActualizarBindingTablaDia(false);
				this.isEsNuevoDia=false;									
					
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesDia(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualDia(false);
				
				this.habilitarDeshabilitarControlesDia(false);
				
				
				
				if(DiaJInternalFrame.CON_DATOS_FRAME) {
					this.cerrarFrameDetalleDia();
				}
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.diaLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.diaLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,DiaConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.diaLogic.closeNewConnexionToDeep();
			}
		}		
	}
		
	public void jButtonCancelarDiaActionPerformed(ActionEvent evt) throws Exception {                                         	   	       
	  	try {
			if(jTableDatosDia.getRowCount()>=1) {
				jTableDatosDia.removeRowSelectionInterval(0, jTableDatosDia.getRowCount()-1);						
			}
						
			this.invalidValues=new InvalidValue[0];
			this.habilitarDeshabilitarControlesDia(false);
			this.cancelar(true);			
			this.inicializarActualizarBindingTablaDia(false);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesDia(false) ;
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualDia(false) ;
			
			this.isEsNuevoDia=false;
			
			if(DiaJInternalFrame.CON_DATOS_FRAME) {
				this.cerrarFrameDetalleDia();
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DiaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonGuardarCambiosDiaActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.diaLogic.getNewConnexionToDeep("");
			}
			
			//this.estaModoGuardarCambios=true;
			
	    	this.guardarCambios();
			
			if(!this.isErrorGuardar) {
				this.procesarBusqueda(this.sAccionBusqueda);
				
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingDia(false);
				
				//SI ES MANUAL
				if(DiaJInternalFrame.ISBINDING_MANUAL) {				
					//this.inicializarActualizarBindingManualDia();				
				}
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.diaLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.diaLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,DiaConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.diaLogic.closeNewConnexionToDeep();
			}
			
			//this.estaModoGuardarCambios=false;
		}
	}
	
	public void jButtonNuevoGuardarCambiosDiaActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			this.estaModoNuevo=true;
			this.estaModoNuevoGuardarCambios=true;
			
			//LO HACE NUEVOPREPARAR
			//this.iIdNuevoDia--;			
			//Dia diaAux= new Dia();			
			//diaAux.setId(this.iIdNuevoDia);
			
			if(this.jInternalFrameDetalleFormDia==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.aumentarTamanioFilaNuevaTablaDia();
			
			if(this.conTotales) {
				this.quitarFilaTotales();
			}
			
			this.nuevoPreparar(true);
			
			this.setVariablesFormularioToObjetoActualForeignKeysDia(this.dia);
			
			this.dia.setsType("NUEVO_GUARDAR_CAMBIOS");
			
			//LO HACE NUEVOPREPARAR
			/*
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				this.diaLogic.getDias().add(this.diaAux);
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				this.dias.add(this.diaAux);				
			}
			*/
			
			this.inicializarActualizarBindingTablaDia(false);
			
			this.jTableDatosDia.setRowSelectionInterval(this.getIndiceNuevoDia(), this.getIndiceNuevoDia());
			
			int iLastRow =  this.jTableDatosDia.getRowCount () - 1;
			Rectangle rectangle = this.jTableDatosDia.getCellRect(iLastRow, 0, true);
			
			this.jTableDatosDia.scrollRectToVisible(rectangle);
			
			//FILA TOTALES
			if(this.conTotales) {
				this.crearFilaTotales();
				
				this.inicializarActualizarBindingTablaDia(false);
			}

		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,DiaConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;
			this.estaModoNuevoGuardarCambios=false;
		}
	}		
	
	public void jButtonRecargarInformacionDiaActionPerformed(ActionEvent evt) throws Exception {    		
		try {
			this.iNumeroPaginacionPagina=0;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.diaLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingDia(false,false);
			
	    	this.recargarInformacion();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingDia(false);
			
			//SI ES MANUAL
			if(DiaJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualDia();
			}
			
			//this.abrirFrameTreeDia();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.diaLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.diaLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,DiaConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.diaLogic.closeNewConnexionToDeep();
			}
		}	
	}
	
	
	public void jButtonGenerarImportacionDiaActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedReader bufferedReader = null;
		String sXmlStringFile="";
		String sPath="";
		this.arrDatoGeneralMinimos= new  ArrayList<DatoGeneralMinimo>();
		DatoGeneralMinimo datoGeneralMinimo=new DatoGeneralMinimo();
		String sLine="";
		
		try {			
			if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR IMPORTACION DE DiaS ?", "MANTENIMIENTO DE Dia", JOptionPane.OK_CANCEL_OPTION) == 0) {
				bufferedReader = new BufferedReader(new FileReader(this.jInternalFrameImportacionDia.getFileImportacion().getAbsolutePath()));
								
				while ((sLine = bufferedReader.readLine()) != null) {
					datoGeneralMinimo=new DatoGeneralMinimo();
					datoGeneralMinimo.setsDescripcion(sLine);
					
					this.arrDatoGeneralMinimos.add(datoGeneralMinimo);
				}
				
				this.actualizarParametrosGeneralDia();
						
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {						
					this.diaReturnGeneral=diaLogic.procesarImportacionDiasWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this.arrDatoGeneralMinimos,this.diaParameterGeneral);
						
				} else if(Constantes.ISUSAEJBREMOTE) {
						
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
						
				this.procesarDiaReturnGeneral();
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DiaConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedReader != null) {
				bufferedReader.close();
			}	
		}				
	}
	
	
	
	public void jButtonAbrirImportacionDiaActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {
			int iReturnArchivo = this.jInternalFrameImportacionDia.getjFileChooserImportacion().showOpenDialog(this);
 
            if (iReturnArchivo == JFileChooser.APPROVE_OPTION) {
            	this.jInternalFrameImportacionDia.setFileImportacion(this.jInternalFrameImportacionDia.getjFileChooserImportacion().getSelectedFile());
            	
				this.jInternalFrameImportacionDia.getjTextFieldPathArchivoImportacion().setText(this.jInternalFrameImportacionDia.getFileImportacion().getName());
				
				//System.out.println("ARCHIVO ESCOGIDO: "+this.fileImportacionDia.getName());
				
            } else {
                //System.out.println("CANCELAR SELECCION");
				this.jInternalFrameImportacionDia.getjTextFieldPathArchivoImportacion().setText("SELECCION CANCELADA");
            }			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DiaConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedWriter != null) {
				bufferedWriter.close();
			}	
		}		
	}
	
	
	public void jButtonGenerarReporteDinamicoDiaActionPerformed(ActionEvent evt) throws Exception {    		
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {	
		
		ArrayList<Dia> diasSeleccionados=new ArrayList<Dia>();		

		diasSeleccionados=this.getDiasSeleccionados(true);
		
		
		this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoDia.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();
		
		this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoDia.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
		
		
		this.sTipoArchivoReporte=this.sTipoArchivoReporteDinamico;
		
		//this.sTipoReporteExtra="Base";
		
			InputStream reportFile=null;
			InputStream imageFile=null;
			
			imageFile=AuxiliarImagenes.class.getResourceAsStream("LogoReporte.jpg");			
				
		
		
			reportFile = AuxiliarReportes.class.getResourceAsStream("DiaBaseDesign.jrxml");	
			
			sPath=this.parametroGeneralUsuario.getpath_exportar()+"DiaBaseDesign.jrxml";
			
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
			
			this.generarReporteDias("Todos",diasSeleccionados );

			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.diaSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				//DEBE APARECER EL REPORTE DIRECTAMENTE
				//JOptionPane.showMessageDialog(this,"GENERADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Dia",JOptionPane.INFORMATION_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DiaConstantesFunciones.CLASSNAME);
		
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
		
		for(int index:this.jInternalFrameReporteDinamicoDia.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoDia.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case DiaConstantesFunciones.LABEL_NOMBRE:
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
		
		if(this.jInternalFrameReporteDinamicoDia.getjCheckBoxConGraficoDinamico().isSelected()) {
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
		reporte=((Reporte)this.jInternalFrameReporteDinamicoDia.getjComboBoxColumnaCategoriaGrafico().getSelectedItem());
				
		//TIPO GRAFICO REPORTE
		reporteTipoGraficoReporte=((Reporte)this.jInternalFrameReporteDinamicoDia.getjComboBoxTiposGraficosReportesDinamico().getSelectedItem());
		
		String sTipoGraficoReporte=reporteTipoGraficoReporte.getsCodigo();
		
		switch(reporte.getsCodigo()) {
			
				case DiaConstantesFunciones.LABEL_NOMBRE:
					sNombreCampoCategoria="nombre";
					break;
					
			default :
				break;
		}		
		//CATEGORIA GRAFICO
		
		//CATEGORIA VALOR				
		reporteCategoriaValor=((Reporte)this.jInternalFrameReporteDinamicoDia.getjComboBoxColumnaCategoriaValor().getSelectedItem());
		
		switch(reporteCategoriaValor.getsCodigo()) {
			
				case DiaConstantesFunciones.LABEL_NOMBRE:
					sNombreCampoCategoriaValor="nombre";
					break;
					
			default :
				break;
		}	
		//CATEGORIA VALOR
		
		//VALORES GRAFICO
		for(int index:this.jInternalFrameReporteDinamicoDia.getjListColumnasValoresGrafico().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoDia.getjListColumnasValoresGrafico().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case DiaConstantesFunciones.LABEL_NOMBRE:
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
	
	public void jButtonGenerarExcelReporteDinamicoDiaActionPerformed(ActionEvent evt) throws Exception {		
		ArrayList<Dia> diasSeleccionados=new ArrayList<Dia>();		
		
		diasSeleccionados=this.getDiasSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"dia";//.xls";
		
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
		
			Sheet sheet = workbook.createSheet("Dias");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			Row row = sheet.createRow(iRow);
			Cell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");
			
			for(int index:this.jInternalFrameReporteDinamicoDia.getjListColumnasSelectReporte().getSelectedIndices()) {
				reporte=(Reporte)this.jInternalFrameReporteDinamicoDia.getjListColumnasSelectReporte().getModel().getElementAt(index);
				
				switch(reporte.getsCodigo()) {
					
				case DiaConstantesFunciones.LABEL_NOMBRE:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(DiaConstantesFunciones.LABEL_NOMBRE);
					iRow++;

					for(Dia dia:diasSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(dia.getnombre());
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
			//	this.getFilaCabeceraExportarExcelDia(row);				
			//	iRow++;
			//}				
			
			//for(Dia diaAux:diasSeleccionados) {
			//	row = sheet.createRow(iRow);
				
			//	this.getFilaDatosExportarExcelDia(diaAux,row);
				
			//	iRow++;
			//}
			
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.diaSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Dia",JOptionPane.INFORMATION_MESSAGE);
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
				this.diaLogic.getNewConnexionToDeep("");
			}
			
			this.idActual=idActual;
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda("PorId");
				    	
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingDia(false);
			
			//SI ES MANUAL
			if(DiaJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualDia();
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.diaLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.diaLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger);
			
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.diaLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonAnterioresDiaActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion-=this.iNumeroPaginacion;
			/*
			if(this.iNumeroPaginacion<0) {
				this.iNumeroPaginacion=0;
			}
			*/
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.diaLogic.getNewConnexionToDeep("");
			}
			
			this.anteriores();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingDia(false);
			
			//SI ES MANUAL
			if(DiaJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualDia();
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.diaLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.diaLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,DiaConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.diaLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonSiguientesDiaActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion+=this.iNumeroPaginacion;
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.diaLogic.getNewConnexionToDeep("");
			}
			
			this.siguientes();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingDia(false);
			
			//SI ES MANUAL
			if(DiaJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualDia();
			}		
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.diaLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.diaLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,DiaConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.diaLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void aumentarTamanioFilaNuevaTablaDia() throws Exception {		
		Dimension dimensionMinimum=this.jTableDatosDia.getMinimumSize();
		Dimension dimensionMaximum=this.jTableDatosDia.getMaximumSize();
		Dimension dimensionPreferred=this.jTableDatosDia.getPreferredSize();
	
		double iHeightConFilaNueva=dimensionPreferred.getHeight();
		
		iHeightConFilaNueva+=this.jTableDatosDia.getRowHeight();
		
		dimensionMinimum.setSize(dimensionMinimum.getWidth(),iHeightConFilaNueva);
		dimensionMaximum.setSize(dimensionMaximum.getWidth(),iHeightConFilaNueva);
		dimensionPreferred.setSize(dimensionPreferred.getWidth(),iHeightConFilaNueva);
		
		this.jTableDatosDia.setMinimumSize(dimensionMinimum);
		this.jTableDatosDia.setMaximumSize(dimensionMaximum);
		this.jTableDatosDia.setPreferredSize(dimensionPreferred);	
	}
	
	public void inicializarActualizarBindingDia(Boolean esInicializar) throws Exception {
		this.inicializarActualizarBindingDia(esInicializar,true);
	}
	
	public void inicializarActualizarBindingDia(Boolean esInicializar,Boolean conTabla) throws Exception {		
		if(conTabla) {
			this.inicializarActualizarBindingTablaDia(esInicializar);
		}
		
		this.inicializarActualizarBindingBotonesDia(esInicializar);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.diaSessionBean.getEsGuardarRelacionado()) {
			try{this.inicializarActualizarBindingBusquedasDia(esInicializar);}catch(Exception e){e.printStackTrace();}
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesDia(esInicializar) ;
			
			this.inicializarActualizarBindingParametrosReportesDia(esInicializar) ;
		}
		
		if(esInicializar) {
			if( !DiaJInternalFrame.ISBINDING_MANUAL_TABLA ||
			   	!DiaJInternalFrame.ISBINDING_MANUAL) {
			   	
			}
		}
	}
	
	public void inicializarActualizarBindingManualDia() throws Exception {		
		//NO SE NECESITA HACER BINDING OTRA VEZ
		//this.inicializarActualizarBindingTablaDia();
		
		this.inicializarActualizarBindingBotonesManualDia(true);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.diaSessionBean.getEsGuardarRelacionado()) {
			
			this.inicializarActualizarBindingBusquedasManualDia();			
			
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesDia() ;
			
			this.inicializarActualizarBindingParametrosReportesPostAccionesManualDia(false) ;			
			
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesPostAccionesManualDia(Boolean esSetControles) throws Exception {
		try	{					
			if(!esSetControles) {
				this.isSeleccionarTodos=this.jCheckBoxSeleccionarTodosDia.isSelected();
				this.isSeleccionados=this.jCheckBoxSeleccionadosDia.isSelected();
				
				
				this.conGraficoReporte=this.jCheckBoxConGraficoReporteDia.isSelected();															
				
				
				if(this.jInternalFrameDetalleFormDia!=null) {
				this.isPostAccionNuevo=this.jInternalFrameDetalleFormDia.jCheckBoxPostAccionNuevoDia.isSelected();
				this.isPostAccionSinCerrar=this.jInternalFrameDetalleFormDia.jCheckBoxPostAccionSinCerrarDia.isSelected();
				this.isPostAccionSinMensaje=this.jInternalFrameDetalleFormDia.jCheckBoxPostAccionSinMensajeDia.isSelected();
				}
			
			} else {
				this.jCheckBoxSeleccionarTodosDia.setSelected(this.isSeleccionarTodos);
				this.jCheckBoxSeleccionadosDia.setSelected(this.isSeleccionados);
				
				
				this.jCheckBoxConGraficoReporteDia.setSelected(this.conGraficoReporte);				
				
				
				if(this.jInternalFrameDetalleFormDia!=null) {
				this.jInternalFrameDetalleFormDia.jCheckBoxPostAccionNuevoDia.setSelected(this.isPostAccionNuevo);
				this.jInternalFrameDetalleFormDia.jCheckBoxPostAccionSinCerrarDia.setSelected(this.isPostAccionSinCerrar);
				this.jInternalFrameDetalleFormDia.jCheckBoxPostAccionSinMensajeDia.setSelected(this.isPostAccionSinMensaje);
				}
			}
			
			
			if(this.jComboBoxTiposPaginacionDia.getSelectedItem()!=null) {
				this.sTipoPaginacion=((Reporte)this.jComboBoxTiposPaginacionDia.getSelectedItem()).getsCodigo();			
			}
			
			
			
			if(this.jInternalFrameDetalleFormDia!=null) {
			this.sTipoAccionFormulario=((Reporte)this.jInternalFrameDetalleFormDia.jComboBoxTiposAccionesFormularioDia.getSelectedItem()).getsCodigo();
			}
			
			
			
			if(!this.conCargarMinimo) {
				this.sTipoArchivoReporte=((Reporte)this.jComboBoxTiposArchivosReportesDia.getSelectedItem()).getsCodigo();			
				
				if(this.jInternalFrameReporteDinamicoDia!=null) {
					this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoDia.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
				}
				
				this.sTipoRelacion=((Reporte)this.jComboBoxTiposRelacionesDia.getSelectedItem()).getsCodigo();
									
				this.sTipoAccion=((Reporte)this.jComboBoxTiposAccionesDia.getSelectedItem()).getsCodigo();
													
				this.sTipoSeleccionar=((Reporte)this.jComboBoxTiposSeleccionarDia.getSelectedItem()).getsCodigo();
									
				this.sTipoReporte=((Reporte)this.jComboBoxTiposReportesDia.getSelectedItem()).getsCodigo();							
					
				if(this.jInternalFrameReporteDinamicoDia!=null) {
					this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoDia.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();							
				}
				
				this.sTipoGraficoReporte=((Reporte)this.jComboBoxTiposGraficosReportesDia.getSelectedItem()).getsCodigo();											
			}			
			
			this.sValorCampoGeneral=this.jTextFieldValorCampoGeneralDia.getText();						
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesDia(Boolean esInicializar) throws Exception {
		try	{	
			if(DiaJInternalFrame.ISBINDING_MANUAL) {
				this. inicializarActualizarBindingParametrosReportesPostAccionesManualDia(false);
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public void inicializarActualizarBindingtiposArchivosReportesAccionesDia() throws Exception {
		try	{
			if(DiaJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingtiposArchivosReportesAccionesManualDia();
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleDia() throws Exception {
		//TIPOS ACCIONES FORMULARIO	
		this.jInternalFrameDetalleFormDia.jComboBoxTiposAccionesFormularioDia.removeAllItems();
				
		for(Reporte reporte:this.tiposAccionesFormulario) {
			this.jInternalFrameDetalleFormDia.jComboBoxTiposAccionesFormularioDia.addItem(reporte);
		}
		
		//TIPOS ACCIONES FORMULARIO
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualDia() throws Exception {
		try	{
			
			//TIPOS ARCHIVOS REPORTES
			this.jComboBoxTiposArchivosReportesDia.removeAllItems();
				
			for(Reporte reporte:this.tiposArchivosReportes) {
				this.jComboBoxTiposArchivosReportesDia.addItem(reporte);
			}
			
			
				
			//TIPOS REPORTES
			this.jComboBoxTiposReportesDia.removeAllItems();
				
			for(Reporte reporte:this.tiposReportes) {
				this.jComboBoxTiposReportesDia.addItem(reporte);
			}
			
			
			//TIPOS GRAFICOS REPORTES
			this.jComboBoxTiposGraficosReportesDia.removeAllItems();
				
			for(Reporte reporte:this.tiposGraficosReportes) {
				this.jComboBoxTiposGraficosReportesDia.addItem(reporte);
			}
			
			
			//TIPOS PAGINACION
			this.jComboBoxTiposPaginacionDia.removeAllItems();
				
			for(Reporte reporte:this.tiposPaginacion) {
				this.jComboBoxTiposPaginacionDia.addItem(reporte);
			}
			
			
			if(!this.diaSessionBean.getEsGuardarRelacionado()) {
				this.jComboBoxTiposPaginacionDia.setSelectedItem(Funciones2.getTipoPaginacionDefecto("NORMAL",this.tiposPaginacion));
			} else {
				this.jComboBoxTiposPaginacionDia.setSelectedItem(Funciones2.getTipoPaginacionDefecto("RELACIONADO",this.tiposPaginacion));
			}
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposRelacionesDia.removeAllItems();
				
			for(Reporte reporte:this.tiposRelaciones) {
				this.jComboBoxTiposRelacionesDia.addItem(reporte);
			}
			
			//TIPOS ACCIONES
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposAccionesDia.removeAllItems();
				
			for(Reporte reporte:this.tiposAcciones) {
				this.jComboBoxTiposAccionesDia.addItem(reporte);
			}
			
			//TIPOS ACCIONES			
			
			
			
			//TIPOS ACCIONES FORMULARIO	
			if(this.jInternalFrameDetalleFormDia!=null) { //if(this.conCargarFormDetalle) {
				this.jInternalFrameDetalleFormDia.jComboBoxTiposAccionesFormularioDia.removeAllItems();
				
				for(Reporte reporte:this.tiposAccionesFormulario) {
					this.jInternalFrameDetalleFormDia.jComboBoxTiposAccionesFormularioDia.addItem(reporte);
				}
				
			}
			//TIPOS ACCIONES FORMULARIO
			
			
			
			//TIPOS SELECCIONAR
			this.jComboBoxTiposSeleccionarDia.removeAllItems();
				
			for(Reporte reporte:this.tiposSeleccionar) {
				this.jComboBoxTiposSeleccionarDia.addItem(reporte);
			}
			
			
			if(this.tiposSeleccionar!=null && this.tiposSeleccionar.size()>1) {
				this.jComboBoxTiposSeleccionarDia.setSelectedIndex(1);
			}
				
			//REPORTE DINAMICO
			this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualDia();
							
			//TIPOS COLUMNAS SELECT
			//TIPOS SELECCIONAR
			
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualDia() throws Exception {
		try	{
			DefaultListModel<Reporte> defaultListModel=new DefaultListModel<Reporte>();
			
			
			//TIPOS ARCHIVOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoDia!=null) {
				this.jInternalFrameReporteDinamicoDia.getjComboBoxTiposArchivosReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposArchivosReportesDinamico) {
					this.jInternalFrameReporteDinamicoDia.getjComboBoxTiposArchivosReportesDinamico().addItem(reporte);
				}
				
			}
			
			//TIPOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoDia!=null) {
				this.jInternalFrameReporteDinamicoDia.getjComboBoxTiposReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposReportesDinamico) {
					this.jInternalFrameReporteDinamicoDia.getjComboBoxTiposReportesDinamico().addItem(reporte);
				}
				
			}
			
			defaultListModel=new DefaultListModel<Reporte>();
			
			if(this.jInternalFrameReporteDinamicoDia!=null) {
				
				if(this.jInternalFrameReporteDinamicoDia.getjListColumnasSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoDia.getjListColumnasSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposColumnasSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoDia.getjListColumnasSelectReporte().setModel(defaultListModel);									
						
				}	
					
				//TIPOS RELACIONES SELECT
				//TIPOS SELECCIONAR
				defaultListModel=new DefaultListModel<Reporte>();
				if(this.jInternalFrameReporteDinamicoDia.getjListRelacionesSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoDia.getjListRelacionesSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposRelacionesSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoDia.getjListRelacionesSelectReporte().setModel(defaultListModel);									
						
				}	
				
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	
	
	public void inicializarActualizarBindingBusquedasManualDia()  throws Exception {				
		//BYDAN_BUSQUEDAS		
		
		
	}
	
	
	
	
	public void inicializarActualizarBindingBusquedasDia(Boolean esInicializar) throws Exception {				
		if(DiaJInternalFrame.ISBINDING_MANUAL) {
			
			this.inicializarActualizarBindingBusquedasManualDia();			
			
		} else {
		}
	}		
		
	public void inicializarActualizarBindingTablaDia() throws Exception {
		this.inicializarActualizarBindingTablaDia(false);
	}
	
	
	public void inicializarActualizarBindingTablaOrderByDia() {
		//TABLA OrderBy	
		TableColumn tableColumn=new TableColumn();
		Integer iWidthTableDefinicionOrderBy=0;			
			
		this.jInternalFrameOrderByDia.getjTableDatosOrderBy().setModel(new TablaGeneralOrderByModel(this.arrOrderBy));
					
		//DEFINIR RENDERERS OrderBy
		tableColumn=this.jInternalFrameOrderByDia.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByDia.getjTableDatosOrderBy(),OrderBy.ISSELECTED));			
		//tableColumn.addPropertyChangeListener(new DiaPropertyChangeListener());
					
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		iWidthTableDefinicionOrderBy+=50;
					
		tableColumn=this.jInternalFrameOrderByDia.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByDia.getjTableDatosOrderBy(),OrderBy.NOMBRE));
		//tableColumn.addPropertyChangeListener(new DiaPropertyChangeListener());
					
		tableColumn.setPreferredWidth(150); 	 
		tableColumn.setWidth(150); 	 
		tableColumn.setMinWidth(150);
		tableColumn.setMaxWidth(150);
				
		iWidthTableDefinicionOrderBy+=150;
					
		//tableColumn=this.jTableDatosDiaOrderBy.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosDiaOrderBy,OrderBy.NOMBREDB));			
		////tableColumn.addPropertyChangeListener(new DiaPropertyChangeListener());
								
		tableColumn=this.jInternalFrameOrderByDia.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByDia.getjTableDatosOrderBy(),OrderBy.ESDESC));
		//tableColumn.addPropertyChangeListener(new DiaPropertyChangeListener());
												
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		((AbstractTableModel) this.jInternalFrameOrderByDia.getjTableDatosOrderBy().getModel()).fireTableDataChanged();
				
		iWidthTableDefinicionOrderBy+=50;
	}
	
	
	
	public void inicializarActualizarBindingTablaDia(Boolean esInicializar) throws Exception {
		Boolean isNoExiste=false;
		Integer iCountNumeroColumnasNormal=0;
		Integer iCountNumeroColumnasFk=0;
		
		this.iWidthTableDefinicion=0;
		
		int iSizeTabla=0;
		
		iSizeTabla=this.getSizeTablaDatos();
		
	if(esInicializar || ConstantesSwing.FORZAR_INICIALIZAR_TABLA) {//esInicializar
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			isNoExiste=diaLogic.getDias().size()==0;
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			isNoExiste=dias.size()==0;
		}
		//ARCHITECTURE
			
		if(isNoExiste) {
			if(this.iNumeroPaginacion-this.iNumeroPaginacion>0) {
				this.iNumeroPaginacion-=this.iNumeroPaginacion;
			}
		}
		
		TableColumn tableColumn=new TableColumn();
		
		if(DiaJInternalFrame.ISBINDING_MANUAL_TABLA) {
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.jTableDatosDia.setModel(new DiaModel(this.diaLogic.getDias(),this));
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.jTableDatosDia.setModel(new DiaModel(this.dias,this));
			}
			//ARCHITECTURE
			
							
			
			
			if(this.jInternalFrameOrderByDia!=null && this.jInternalFrameOrderByDia.getjTableDatosOrderBy()!=null) {
				this.inicializarActualizarBindingTablaOrderByDia();
			}
			
								
			//DEFINIR RENDERERS
			tableColumn=this.jTableDatosDia.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosDia,Constantes2.S_SELECCIONAR));
			//tableColumn.addPropertyChangeListener(new DiaPropertyChangeListener());
			tableColumn.setCellRenderer(new BooleanRenderer(true,"Seleccionar "+DiaConstantesFunciones.SCLASSWEBTITULO,diaConstantesFunciones.resaltarSeleccionarDia,true,false,"","",this));
			tableColumn.setCellEditor(new BooleanEditorRenderer(true,"Seleccionar "+DiaConstantesFunciones.SCLASSWEBTITULO,diaConstantesFunciones.resaltarSeleccionarDia,false,"","",this));			
			
			tableColumn.setPreferredWidth(50); 	 
			tableColumn.setWidth(50); 	 
			tableColumn.setMinWidth(50); 
			tableColumn.setMaxWidth(50); 
			
			this.iWidthTableDefinicion+=50;
			
			


			tableColumn=this.jTableDatosDia.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosDia,DiaConstantesFunciones.LABEL_ID));

		if(this.diaConstantesFunciones.mostraridDia && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,DiaConstantesFunciones.LABEL_ID,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.diaConstantesFunciones.resaltaridDia,this.diaConstantesFunciones.activaridDia,this,true,"idDia","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.diaConstantesFunciones.resaltaridDia,this.diaConstantesFunciones.activaridDia,this,true,"idDia","BASICO",false));

			tableColumn.setPreferredWidth(50);
			tableColumn.setWidth(50);
			tableColumn.setMinWidth(50);
			tableColumn.setMaxWidth(50);

			this.iWidthTableDefinicion+=50;
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosDia.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosDia,DiaConstantesFunciones.LABEL_NOMBRE));

		if(this.diaConstantesFunciones.mostrarnombreDia && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,DiaConstantesFunciones.LABEL_NOMBRE,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.diaConstantesFunciones.resaltarnombreDia,this.diaConstantesFunciones.activarnombreDia,this,true,"nombreDia","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.diaConstantesFunciones.resaltarnombreDia,this.diaConstantesFunciones.activarnombreDia,this,true,"nombreDia","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new DiaPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}
			
		} else {
		}			
					
		if(!this.diaSessionBean.getEsGuardarRelacionado()
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
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.diaSessionBean.getEsGuardarRelacionado()));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.diaSessionBean.getEsGuardarRelacionado()));
	
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosDia.addColumn(tableColumn);
			
			} else {				
				
				//LO MISMO QUE IF
				
				tableColumn= new TableColumn();
				tableColumn.setIdentifier(sLabelColumnAccion);
				tableColumn.setHeaderValue(sLabelColumnAccion);
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.diaSessionBean.getEsGuardarRelacionado()));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.diaSessionBean.getEsGuardarRelacionado()));
		
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosDia.addColumn(tableColumn);				
					
				//ELIMINAR
				if(this.isPermisoEliminarDia && this.isPermisoGuardarCambiosDia) {
					tableColumn= new TableColumn();
					tableColumn.setIdentifier(Constantes2.S_ELI);
					tableColumn.setHeaderValue(sLabelColumnAccionEli);
					tableColumn.setCellRenderer(new IdTableCell(this,false,true,this.diaSessionBean.getEsGuardarRelacionado()));
					tableColumn.setCellEditor(new IdTableCell(this,false,true,this.diaSessionBean.getEsGuardarRelacionado()));
			
					tableColumn.setPreferredWidth(65); 	 
					tableColumn.setWidth(65); 	 
					tableColumn.setMinWidth(65); 
					tableColumn.setMaxWidth(65);
					
					this.iWidthTableDefinicion+=65;
						
					this.jTableDatosDia.addColumn(tableColumn);
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
			
			this.jTableDatosDia.addColumn(tableColumn);
			*/
		}
		
		Integer iUltimaColumna=0;//1
		Integer iNuevaPosicionColumna=0;
		
		
		//PERMITE ELIMINAR SIMPLE
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarDia && this.isPermisoGuardarCambiosDia) {
				iUltimaColumna++;
			}	
		}
		
		//PERMITE EDITAR SIMPLE
		iUltimaColumna++;	
		
				
		
		//MOVIA SELECCIONAR
		//iUltimaColumna++;
		
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarDia && this.isPermisoGuardarCambiosDia) {
				//REUBICA ELIMINAR SIMPLE
				jTableDatosDia.moveColumn(this.jTableDatosDia.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3
					
				iUltimaColumna--;
			}
		}
		//REUBICA EDITAR SIMPLE
		jTableDatosDia.moveColumn(this.jTableDatosDia.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3				
		
		
		
		
		//REUBICABA SELECCIONAR
		/*
		if(iUltimaColumna>1) {
			iUltimaColumna--;
		}
		
		//iNuevaPosicionColumna++;
			
		//REUBICA SELECCIONAR FILA CHECK
		jTableDatosDia.moveColumn(this.jTableDatosDia.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1		
		*/
		
		//DEFINEN HEADERS
		final TableCellRenderer tableHeaderDefaultCellRenderer = this.jTableDatosDia.getTableHeader().getDefaultRenderer();
		
		this.jTableDatosDia.getTableHeader().setDefaultRenderer(new TableCellRendererHeader(this.jTableDatosDia,tableHeaderDefaultCellRenderer));
	    
		TableColumn column=null;
		
		if(!DiaJInternalFrame.ISBINDING_MANUAL_TABLA) {
			for(int i = 0; i < this.jTableDatosDia.getColumnModel().getColumnCount(); i++) { 
				column = this.jTableDatosDia.getColumnModel().getColumn(i); 
				
				if(column.getIdentifier()!=null) {
					//SI SE UTILIZA UN HEADER ES GENERICO
					//column.setHeaderRenderer(new HeaderRenderer(column.getIdentifier().toString()));
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_ELI)) {
					continue;
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_SELECCIONAR)) {
					if(!DiaJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(50); 	 
						column.setWidth(50); 	 
						column.setMinWidth(50); 	
						column.setMaxWidth(50); 
						
						this.iWidthTableDefinicion+=50;
					}
					
				} else {
					if(!DiaJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						column.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						
						this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
					}
				}
			}
		}
		
		this.jTableDatosDia.setSelectionBackground(FuncionesSwing.getColorSelectedBackground());
		this.jTableDatosDia.setSelectionForeground(FuncionesSwing.getColorSelectedForeground());
		
		/*
		this.jTableDatosDia.setDefaultRenderer(Object.class, new DefaultTableCellRenderer() {
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
							iSize=diaLogic.getDias().size()-1;
								
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							iSize=dias.size()-1;
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
		//this.jTableDatosDia.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA);
		
		/*
		column=this.jTableDatosDia.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosSistema,Constantes2.S_SELECCIONAR));
		
		if(column!=null) {
			column.setPreferredWidth(25); 	 
			column.setWidth(25); 	 
			column.setMinWidth(25); 	
		}
		*/
			
			//CopyTableToTableTotal();
		} else {
			
			this.actualizarVisualTableDatosDia();
			
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
				
				//this.isEsNuevoDia=false;
					
				DiaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.dia,new Object(),this.diaParameterGeneral,this.diaReturnGeneral);
			
				if(this.diaSessionBean.getConGuardarRelaciones()) {
					this.dStart=(double)System.currentTimeMillis();
				}
				
				if(this.jInternalFrameDetalleFormDia==null) {
					this.inicializarFormDetalle();
				}
				
				this.inicializarInvalidValues();
				
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosDia.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosDia.getSelectedRow();	       
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.dia =(Dia) this.diaLogic.getDias().toArray()[this.jTableDatosDia.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.dia =(Dia) this.dias.toArray()[this.jTableDatosDia.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//PUEDE SER PARA DUPLICADO O NUEVO TABLA
				
				if(this.dia.getsType().equals("DUPLICADO")
				   || this.dia.getsType().equals("NUEVO_GUARDAR_CAMBIOS")) {
					
					this.isEsNuevoDia=true;
				
				} else {
					this.isEsNuevoDia=false;	
				}
				
				//CONTROL VERSION ANTERIOR
				/*
				if(!this.diaSessionBean.getEsGuardarRelacionado()) {
					if(this.dia.getId()>=0 && !this.dia.getIsNew()) {						
						this.isEsNuevoDia=false;
						
					} else {
						this.isEsNuevoDia=true;
					}
					
				} else {
					//CONTROLAR PARA RELACIONADO
				}
				*/
				
				//ESTABLECE SI ES RELACIONADO O NO 
				this.habilitarDeshabilitarTipoMantenimientoDia(esRelaciones);						
				
				this.seleccionarDia(evt,null,rowIndex);
				
				//SELECCIONA ACTUAL PERO AUN NO SE HA INGRESADO AL SISTEMA
				//SE DESHABILITA POR GUARDAR CAMBIOS
				/*
				if(this.dia.getId()<0) {
					this.isEsNuevoDia=true;
				}
				*/
				
				if(!this.esParaBusquedaForeignKey) {
					this.modificarDia(evt,rowIndex,esRelaciones);
				} else {
					this.seleccionarDia(evt,rowIndex);
				}	
				
				if(this.diaSessionBean.getConGuardarRelaciones()) {
					this.dEnd=(double)System.currentTimeMillis();					
					this.dDif=this.dEnd - this.dStart;
					
					if(Constantes.ISDEVELOPING) {
						System.out.println("Tiempo(ms) Seleccion Dia: " + this.dDif); 
					}
				}								
				
				DiaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.dia,new Object(),this.diaParameterGeneral,this.diaReturnGeneral);
				
			} else {
				this.estaModoEliminarGuardarCambios=true;
				
				this.seleccionarDia(evt,null,rowIndex);
				
				if(this.permiteMantenimiento(this.dia)) {
					if(this.dia.getId()>0) {
						this.dia.setIsDeleted(true);
						
						this.diasEliminados.add(this.dia);
					}
					
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.diaLogic.getDias().remove(this.dia);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.dias.remove(this.dia);				
					}
					
					
					((DiaModel) this.jTableDatosDia.getModel()).fireTableRowsDeleted(rowIndex,rowIndex);
					
					this.actualizarFilaTotales();
					
					this.inicializarActualizarBindingTablaDia(false);					
				}								
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException2(this, e,logger,DiaConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoSeleccionar=false;				
			this.estaModoEliminarGuardarCambios=false;
		}
	}
	
	
	public void seleccionarDia(ActionEvent evt,javax.swing.event.ListSelectionEvent evt2,int rowIndex) throws Exception { 
		try {
			//SI PUEDE SER NUEVO Y SELECCIONAR (PARA DUPLICAR Y NUEVO TABLA)
			//if(!this.isEsNuevoDia) {
			
			if(this.jInternalFrameDetalleFormDia==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosDia.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosDia.getSelectedRow();	       
				}
				
				//CUANDO SE RECARGA TABLA TAMBIEN SE SELECCIONA PERO CON -1 POR LO QUE SE NECESITA VALIDAR ANTES
				if(intSelectedRow<0) {
					return;
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.dia =(Dia) this.diaLogic.getDias().toArray()[this.jTableDatosDia.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.dia =(Dia) this.dias.toArray()[this.jTableDatosDia.convertRowIndexToModel(intSelectedRow)];
				}
				
				if(DiaJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesObjetoActualToFormularioDia(this.dia);
				}
				
				//ARCHITECTURE
				try {
					
				} catch(Exception e) {
					throw e;
				}
				
				this.actualizarEstadoCeldasBotonesDia("s", this.isGuardarCambiosEnLote, this.isEsMantenimientoRelacionado);
				
				//NO FUNCIONA BINDING PERO SE MANTIENE
				this.inicializarActualizarBindingBotonesDia(false) ;
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualDia() ;
			//}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DiaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesObjetoActualToFormularioTodoDia(Dia dia) throws Exception { 
		this.setVariablesObjetoActualToFormularioTodoDia(dia,false,"NINGUNO");
	}
	
	public void setVariablesObjetoActualToFormularioTodoDia(Dia dia,Boolean conCargarListasDesdeObjetoActual,String sTipoEvento) throws Exception { 
		this.setVariablesObjetoActualToFormularioDia(dia);
		
		if(conCargarListasDesdeObjetoActual) {
			this.setVariablesObjetoActualToListasForeignKeyDia(dia,sTipoEvento);
		}
		
		this.setVariablesObjetoActualToFormularioForeignKeyDia(dia);
	}
	
	public void setVariablesObjetoActualToFormularioDia(Dia dia) throws Exception { 
		try {			
			Image imageActual=null;
			ImageIcon imageIcon = null;
			
			if(this.jInternalFrameDetalleFormDia==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			
			this.jInternalFrameDetalleFormDia.jTextFieldidDia.setText(dia.getId().toString());
			this.jInternalFrameDetalleFormDia.jTextFieldnombreDia.setText(dia.getnombre());
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,DiaConstantesFunciones.CLASSNAME);
		}
	}
		
	public void actualizarInformacion(String sTipo,Dia diaLocal) throws Exception {
		this.actualizarInformacion(sTipo,false,diaLocal);
	}	
	
	public void actualizarInformacion(String sTipo,Boolean conParametroObjeto,Dia diaLocal) throws Exception {
		
		if(!conParametroObjeto) {
			if(!this.getEsControlTabla()) {
				diaLocal=this.dia;
			} else {
				diaLocal=this.diaAnterior;
			}
		}
		
		if(this.permiteMantenimiento(diaLocal)) {
			if(sTipo.equals("EVENTO_CONTROL")) { // || sTipo.equals("EVENTO_NUEVO")
				if(!this.esControlTabla) {
					this.setVariablesFormularioToObjetoActualTodoDia(diaLocal,true);
					
					if(diaSessionBean.getConGuardarRelaciones()) {
						this.actualizarRelaciones(diaLocal);
					}
				}
			
			} else if(sTipo.equals("INFO_PADRE")) {
				
				if(this.diaSessionBean.getEsGuardarRelacionado()) {
					this.actualizarRelacionFkPadreActual(diaLocal);
				}
			}
		}
	}
	
	public void setVariablesFormularioToObjetoActualTodoDia(Dia dia,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualDia(dia,conColumnasBase);
		this.setVariablesFormularioToObjetoActualForeignKeysDia(dia);
	}
	
	public void setVariablesFormularioToObjetoActualDia(Dia dia,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualDia(dia,conColumnasBase,true);
	}
	
	public void setVariablesFormularioToObjetoActualDia(Dia dia,Boolean conColumnasBase,Boolean conInicializarInvalidValues) throws Exception { 
		String sMensajeCampoActual="";
		Boolean estaValidado=true;
		try {
			
			if(this.jInternalFrameDetalleFormDia==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			if(conInicializarInvalidValues) {
				this.inicializarInvalidValues();
			}
			
			

		try {
			if(this.jInternalFrameDetalleFormDia.jTextFieldidDia.getText()==null || this.jInternalFrameDetalleFormDia.jTextFieldidDia.getText()=="" || this.jInternalFrameDetalleFormDia.jTextFieldidDia.getText()=="Id") {
				this.jInternalFrameDetalleFormDia.jTextFieldidDia.setText("0");
			}

			if(conColumnasBase) {dia.setId(Long.parseLong(this.jInternalFrameDetalleFormDia.jTextFieldidDia.getText()));}
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+DiaConstantesFunciones.LABEL_ID+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormDia.jLabelIdDia,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			dia.setnombre(this.jInternalFrameDetalleFormDia.jTextFieldnombreDia.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+DiaConstantesFunciones.LABEL_NOMBRE+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormDia.jLabelnombreDia,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}
			
			if(!estaValidado) {
				throw new Exception(sMensajeCampoActual);
			}
		} catch(NumberFormatException e) {
			throw new Exception(sMensajeCampoActual);
			//FuncionesSwing.manageException(this, e,logger,MovimientoInventarioConstantesFunciones.CLASSNAME);
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,DiaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualDia(Dia diaBean,Dia dia,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,DiaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setCopiarVariablesObjetosDia(Dia diaOrigen,Dia dia,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			if(conColumnasBase) {if(conDefault || (!conDefault && diaOrigen.getId()!=null && !diaOrigen.getId().equals(0L))) {dia.setId(diaOrigen.getId());}}
			if(conDefault || (!conDefault && diaOrigen.getnombre()!=null && !diaOrigen.getnombre().equals(""))) {dia.setnombre(diaOrigen.getnombre());}
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,DiaConstantesFunciones.CLASSNAME);
		}
	}
	
	/*
	public void setVariablesObjetoBeanActualToFormularioDia(Dia dia) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormDia.jTextFieldidDia.setText(dia.getId().toString());
			this.jInternalFrameDetalleFormDia.jTextFieldnombreDia.setText(dia.getnombre());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DiaConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoBeanActualToFormularioDia(DiaBean diaBean) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormDia.jTextFieldidDia.setText(diaBean.getId().toString());
			this.jInternalFrameDetalleFormDia.jTextFieldnombreDia.setText(diaBean.getnombre());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DiaConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoReturnGeneralToBeanDia(DiaParameterReturnGeneral diaReturnGeneral,DiaBean diaBean,Boolean conDefault) throws Exception { 
		try {
			Dia diaLocal=new Dia();
			
			diaLocal=diaReturnGeneral.getDia();
			
			
			if(conColumnasBase) {if(conDefault || (!conDefault && diaLocal.getId()!=null && !diaLocal.getId().equals(0L))) {diaBean.setId(diaLocal.getId());}}
			if(conDefault || (!conDefault && diaLocal.getnombre()!=null && !diaLocal.getnombre().equals(""))) {diaBean.setnombre(diaLocal.getnombre());}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DiaConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	@SuppressWarnings("rawtypes")
	public static void setActualComboBoxDiaGenerico(Long idDiaSeleccionado,JComboBox jComboBoxDia,List<Dia> diasLocal)throws Exception {
		try {
			Dia  diaTemp=null;

			for(Dia diaAux:diasLocal) {
				if(diaAux.getId()!=null && diaAux.getId().equals(idDiaSeleccionado)) {
					diaTemp=diaAux;
					break;
				}
			}

			jComboBoxDia.setSelectedItem(diaTemp);

		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("rawtypes")
	public static void setHotKeysComboBoxDiaGenerico(JComboBox jComboBoxDia,JInternalFrameBase jInternalFrameBase,String sNombreHotKeyAbstractAction,String sTipoBusqueda)throws Exception {
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
				
				jComboBoxDia.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxDia.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Busqueda"));
				//BUSCAR
				
				
				//ACTUALIZAR
				sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
				keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_ACTUALIZAR");
				
				jComboBoxDia.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxDia.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Update"));
				//ACTUALIZAR
				
				if(sTipoBusqueda.contains("CON_EVENT_CHANGE")) {
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxDia.addFocusListener(new ComboBoxFocusListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
						jComboBoxDia.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));						
					}
					
					/*
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxDia.addItemListener(new ComboBoxItemListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					} else {
						jComboBoxDia.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					}
					*/
				}								
				
				//CON_BUSQUEDA								
				if(sTipoBusqueda.contains("CON_BUSQUEDA")) {
					sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
					keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_BUSQUEDA");
							
					jComboBoxDia.getInputMap().put(keyStrokeControl, sKeyStrokeName);
					jComboBoxDia.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction));
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
			FuncionesSwing.manageException2(this, e,logger,DiaConstantesFunciones.CLASSNAME);
		}
	}
	
	public String getDescripcionFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		String sDescripcion="";
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			dia=(Dia) diaLogic.getDias().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			dia =(Dia) dias.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		
		return sDescripcion;
	}
	
	public Color getColorFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		Color color=Color.WHITE;
		
		Dia diaRow=new Dia();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			diaRow=(Dia) diaLogic.getDias().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			diaRow=(Dia) dias.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		
		return color;
	}
	
	
	
	
	
	
	
	public void refrescarBindingTabla(Boolean blnSoloTabla) {
	}
	
	public void inicializarActualizarBindingBotonesManualDia(Boolean esSetControles) {						
		if(esSetControles) {
			this.jButtonNuevoDia.setVisible((this.isVisibilidadCeldaNuevoDia && this.isPermisoNuevoDia));			
			this.jButtonDuplicarDia.setVisible((this.isVisibilidadCeldaDuplicarDia && this.isPermisoDuplicarDia));			
			this.jButtonCopiarDia.setVisible((this.isVisibilidadCeldaCopiarDia && this.isPermisoCopiarDia));
			this.jButtonVerFormDia.setVisible((this.isVisibilidadCeldaVerFormDia && this.isPermisoVerFormDia));
			
			this.jButtonAbrirOrderByDia.setVisible((this.isVisibilidadCeldaOrdenDia && this.isPermisoOrdenDia));			
			
			this.jButtonNuevoRelacionesDia.setVisible((this.isVisibilidadCeldaNuevoRelacionesDia && this.isPermisoNuevoDia));			
			this.jButtonNuevoGuardarCambiosDia.setVisible((this.isVisibilidadCeldaNuevoDia && this.isPermisoNuevoDia && this.isPermisoGuardarCambiosDia));
			
			if(this.jInternalFrameDetalleFormDia!=null) {
			this.jInternalFrameDetalleFormDia.jButtonModificarDia.setVisible((this.isVisibilidadCeldaModificarDia && this.isPermisoActualizarDia));	
			this.jInternalFrameDetalleFormDia.jButtonActualizarDia.setVisible((this.isVisibilidadCeldaActualizarDia && this.isPermisoActualizarDia));	
			this.jInternalFrameDetalleFormDia.jButtonEliminarDia.setVisible((this.isVisibilidadCeldaEliminarDia && this.isPermisoEliminarDia));
			this.jInternalFrameDetalleFormDia.jButtonCancelarDia.setVisible(this.isVisibilidadCeldaCancelarDia);							
			this.jInternalFrameDetalleFormDia.jButtonGuardarCambiosDia.setVisible((this.isVisibilidadCeldaGuardarDia && this.isPermisoGuardarCambiosDia));			
			
			}
						
			this.jButtonGuardarCambiosTablaDia.setVisible((this.isVisibilidadCeldaGuardarCambiosDia && this.isPermisoGuardarCambiosDia));							
			
			//TOOLBAR
			
			this.jButtonNuevoToolBarDia.setVisible((this.isVisibilidadCeldaNuevoDia && this.isPermisoNuevoDia));						
			this.jButtonDuplicarToolBarDia.setVisible((this.isVisibilidadCeldaDuplicarDia && this.isPermisoDuplicarDia));						
			this.jButtonCopiarToolBarDia.setVisible((this.isVisibilidadCeldaCopiarDia && this.isPermisoCopiarDia));			
			this.jButtonVerFormToolBarDia.setVisible((this.isVisibilidadCeldaVerFormDia && this.isPermisoVerFormDia));			
			this.jButtonAbrirOrderByToolBarDia.setVisible((this.isVisibilidadCeldaOrdenDia && this.isPermisoOrdenDia));
			this.jButtonNuevoRelacionesToolBarDia.setVisible((this.isVisibilidadCeldaNuevoRelacionesDia && this.isPermisoNuevoDia));			
			this.jButtonNuevoGuardarCambiosToolBarDia.setVisible((this.isVisibilidadCeldaNuevoDia && this.isPermisoNuevoDia && this.isPermisoGuardarCambiosDia));			
			
			if(this.jInternalFrameDetalleFormDia!=null) {
			this.jInternalFrameDetalleFormDia.jButtonModificarToolBarDia.setVisible((this.isVisibilidadCeldaModificarDia && this.isPermisoActualizarDia));	
			this.jInternalFrameDetalleFormDia.jButtonActualizarToolBarDia.setVisible((this.isVisibilidadCeldaActualizarDia  && this.isPermisoActualizarDia));	
			this.jInternalFrameDetalleFormDia.jButtonEliminarToolBarDia.setVisible((this.isVisibilidadCeldaEliminarDia && this.isPermisoEliminarDia));
			this.jInternalFrameDetalleFormDia.jButtonCancelarToolBarDia.setVisible(this.isVisibilidadCeldaCancelarDia);				
			this.jInternalFrameDetalleFormDia.jButtonGuardarCambiosToolBarDia.setVisible((this.isVisibilidadCeldaGuardarDia && this.isPermisoGuardarCambiosDia));									
			}
			
			this.jButtonGuardarCambiosTablaToolBarDia.setVisible((this.isVisibilidadCeldaGuardarCambiosDia && this.isPermisoGuardarCambiosDia));									
			
			//TOOLBAR
			
			//MENUS
			
			this.jMenuItemNuevoDia.setVisible((this.isVisibilidadCeldaNuevoDia && this.isPermisoNuevoDia));			
			this.jMenuItemDuplicarDia.setVisible((this.isVisibilidadCeldaDuplicarDia && this.isPermisoDuplicarDia));			
			this.jMenuItemCopiarDia.setVisible((this.isVisibilidadCeldaCopiarDia && this.isPermisoCopiarDia));			
			this.jMenuItemVerFormDia.setVisible((this.isVisibilidadCeldaVerFormDia && this.isPermisoVerFormDia));			
			this.jMenuItemAbrirOrderByDia.setVisible((this.isVisibilidadCeldaOrdenDia && this.isPermisoOrdenDia));			
			//this.jMenuItemMostrarOcultarDia.setVisible((this.isVisibilidadCeldaOrdenDia && this.isPermisoOrdenDia));
			this.jMenuItemDetalleAbrirOrderByDia.setVisible((this.isVisibilidadCeldaOrdenDia && this.isPermisoOrdenDia));			
			//this.jMenuItemDetalleMostrarOcultarDia.setVisible((this.isVisibilidadCeldaOrdenDia && this.isPermisoOrdenDia));			
			this.jMenuItemNuevoRelacionesDia.setVisible((this.isVisibilidadCeldaNuevoRelacionesDia && this.isPermisoNuevoDia));			
			this.jMenuItemNuevoGuardarCambiosDia.setVisible((this.isVisibilidadCeldaNuevoDia && this.isPermisoNuevoDia && this.isPermisoGuardarCambiosDia));									
			
			if(this.jInternalFrameDetalleFormDia!=null) {
			this.jInternalFrameDetalleFormDia.jMenuItemModificarDia.setVisible((this.isVisibilidadCeldaModificarDia && this.isPermisoActualizarDia));	
			this.jInternalFrameDetalleFormDia.jMenuItemActualizarDia.setVisible((this.isVisibilidadCeldaActualizarDia && this.isPermisoActualizarDia));	
			this.jInternalFrameDetalleFormDia.jMenuItemEliminarDia.setVisible((this.isVisibilidadCeldaEliminarDia && this.isPermisoEliminarDia));
			this.jInternalFrameDetalleFormDia.jMenuItemCancelarDia.setVisible(this.isVisibilidadCeldaCancelarDia);				
			}
			
			this.jMenuItemGuardarCambiosDia.setVisible((this.isVisibilidadCeldaGuardarDia && this.isPermisoGuardarCambiosDia));						
			this.jMenuItemGuardarCambiosTablaDia.setVisible((this.isVisibilidadCeldaGuardarCambiosDia && this.isPermisoGuardarCambiosDia));						
			
			//MENUS
			
		} else {
			this.isVisibilidadCeldaNuevoDia=this.jButtonNuevoDia.isVisible();
			this.isVisibilidadCeldaDuplicarDia=this.jButtonDuplicarDia.isVisible();
			this.isVisibilidadCeldaCopiarDia=this.jButtonCopiarDia.isVisible();
			this.isVisibilidadCeldaVerFormDia=this.jButtonVerFormDia.isVisible();
			
			this.isVisibilidadCeldaOrdenDia=this.jButtonAbrirOrderByDia.isVisible();			
			
			this.isVisibilidadCeldaNuevoRelacionesDia=this.jButtonNuevoRelacionesDia.isVisible();
			this.isVisibilidadCeldaModificarDia=this.jButtonModificarDia.isVisible();
			
			if(this.jInternalFrameDetalleFormDia!=null) {
			this.isVisibilidadCeldaActualizarDia=this.jInternalFrameDetalleFormDia.jButtonActualizarDia.isVisible();
			this.isVisibilidadCeldaEliminarDia=this.jInternalFrameDetalleFormDia.jButtonEliminarDia.isVisible();
			this.isVisibilidadCeldaCancelarDia=this.jInternalFrameDetalleFormDia.jButtonCancelarDia.isVisible();
			this.isVisibilidadCeldaGuardarDia=this.jInternalFrameDetalleFormDia.jButtonGuardarCambiosDia.isVisible();			
			}
			
			this.isVisibilidadCeldaGuardarCambiosDia=this.jButtonGuardarCambiosTablaDia.isVisible();
			
			//TOOLBAR
			
			this.isVisibilidadCeldaNuevoDia=this.jButtonNuevoToolBarDia.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesDia=this.jButtonNuevoRelacionesToolBarDia.isVisible();
			
			if(this.jInternalFrameDetalleFormDia!=null) {
			this.isVisibilidadCeldaModificarDia=this.jInternalFrameDetalleFormDia.jButtonModificarToolBarDia.isVisible();
			this.isVisibilidadCeldaActualizarDia=this.jInternalFrameDetalleFormDia.jButtonActualizarToolBarDia.isVisible();
			this.isVisibilidadCeldaEliminarDia=this.jInternalFrameDetalleFormDia.jButtonEliminarToolBarDia.isVisible();
			this.isVisibilidadCeldaCancelarDia=this.jInternalFrameDetalleFormDia.jButtonCancelarToolBarDia.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarDia=this.jButtonGuardarCambiosToolBarDia.isVisible();
			this.isVisibilidadCeldaGuardarCambiosDia=this.jButtonGuardarCambiosTablaToolBarDia.isVisible();						
			
			//TOOLBAR
			
			//MENUS
			
			this.isVisibilidadCeldaNuevoDia=this.jMenuItemNuevoDia.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesDia=this.jMenuItemNuevoRelacionesDia.isVisible();
			
			if(this.jInternalFrameDetalleFormDia!=null) {
			this.isVisibilidadCeldaModificarDia=this.jInternalFrameDetalleFormDia.jMenuItemModificarDia.isVisible();
			this.isVisibilidadCeldaActualizarDia=this.jInternalFrameDetalleFormDia.jMenuItemActualizarDia.isVisible();
			this.isVisibilidadCeldaEliminarDia=this.jInternalFrameDetalleFormDia.jMenuItemEliminarDia.isVisible();
			this.isVisibilidadCeldaCancelarDia=this.jInternalFrameDetalleFormDia.jMenuItemCancelarDia.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarDia=this.jMenuItemGuardarCambiosDia.isVisible();
			this.isVisibilidadCeldaGuardarCambiosDia=this.jMenuItemGuardarCambiosTablaDia.isVisible();						
			
			//MENUS
		}
	}
	
	public void inicializarActualizarBindingBotonesDia(Boolean esInicializar) {
		if(DiaJInternalFrame.ISBINDING_MANUAL) {			
			if(this.diaSessionBean.getConGuardarRelaciones()) {
				//if(this.diaSessionBean.getEsGuardarRelacionado()) {
				
				this.actualizarEstadoCeldasBotonesConGuardarRelacionesDia();
			}
			
			this.inicializarActualizarBindingBotonesManualDia(true);
			
		} else {	
		}
	}		
	
	public void inicializarActualizarBindingBotonesPermisosManualDia() {
		this.jButtonNuevoDia.setVisible(this.isPermisoNuevoDia);			
		this.jButtonDuplicarDia.setVisible(this.isPermisoDuplicarDia);			
		this.jButtonCopiarDia.setVisible(this.isPermisoCopiarDia);			
		this.jButtonVerFormDia.setVisible(this.isPermisoVerFormDia);			
		
		this.jButtonAbrirOrderByDia.setVisible(this.isPermisoOrdenDia);					
		
		this.jButtonNuevoRelacionesDia.setVisible(this.isPermisoNuevoDia);			
		
		if(this.jInternalFrameDetalleFormDia!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormDia.jButtonModificarDia.setVisible(this.isPermisoActualizarDia);	
			this.jInternalFrameDetalleFormDia.jButtonActualizarDia.setVisible(this.isPermisoActualizarDia);	
			this.jInternalFrameDetalleFormDia.jButtonEliminarDia.setVisible(this.isPermisoEliminarDia);
			this.jInternalFrameDetalleFormDia.jButtonCancelarDia.setVisible(this.isVisibilidadCeldaCancelarDia);						
			this.jInternalFrameDetalleFormDia.jButtonGuardarCambiosDia.setVisible(this.isPermisoGuardarCambiosDia);							
		}
		
		this.jButtonGuardarCambiosTablaDia.setVisible(this.isPermisoActualizarDia);
	}
	
	public void inicializarActualizarBindingBotonesPermisosManualFormDetalleDia() {
		this.jInternalFrameDetalleFormDia.jButtonModificarDia.setVisible(this.isPermisoActualizarDia);	
		this.jInternalFrameDetalleFormDia.jButtonActualizarDia.setVisible(this.isPermisoActualizarDia);	
		this.jInternalFrameDetalleFormDia.jButtonEliminarDia.setVisible(this.isPermisoEliminarDia);
		this.jInternalFrameDetalleFormDia.jButtonCancelarDia.setVisible(this.isVisibilidadCeldaCancelarDia);							
		this.jInternalFrameDetalleFormDia.jButtonGuardarCambiosDia.setVisible((this.isVisibilidadCeldaGuardarDia && this.isPermisoGuardarCambiosDia));			
	}
	
	public void inicializarActualizarBindingBotonesPermisosDia() {
		if(DiaJInternalFrame.ISBINDING_MANUAL) {
			this.inicializarActualizarBindingBotonesPermisosManualDia();
		} else {
		}
	}
	
	
	public void refrescarBindingBotonesDia() {
	}
	
	public void jTableDatosDiaListSelectionListener(javax.swing.event.ListSelectionEvent evt) throws Exception { 
		try {
			this.seleccionarDia(null,evt,-1);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DiaConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonidDiaBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.diaLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosDia.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualDia(this.getdia(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysDia(this.dia);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.dia =(Dia) this.diaLogic.getDias().toArray()[this.jTableDatosDia.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.dia =(Dia) this.dias.toArray()[this.jTableDatosDia.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.dia==null) {
						this.dia = new Dia();
					}

					this.setVariablesFormularioToObjetoActualDia(this.dia,true);
					this.setVariablesFormularioToObjetoActualForeignKeysDia(this.dia);
				}

				if(this.dia.getId()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id = "+this.dia.getId().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingDia(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.diaLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.diaLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,DiaConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.diaLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonnombreDiaBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.diaLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosDia.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualDia(this.getdia(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysDia(this.dia);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.dia =(Dia) this.diaLogic.getDias().toArray()[this.jTableDatosDia.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.dia =(Dia) this.dias.toArray()[this.jTableDatosDia.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.dia==null) {
						this.dia = new Dia();
					}

					this.setVariablesFormularioToObjetoActualDia(this.dia,true);
					this.setVariablesFormularioToObjetoActualForeignKeysDia(this.dia);
				}

				if(this.dia.getnombre()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where nombre like '%"+this.dia.getnombre()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingDia(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.diaLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.diaLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,DiaConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.diaLogic.closeNewConnexionToDeep();
				}

			}
		}

	
	
	
	public void closingInternalFrameDia() {
		if(this.jInternalFrameDetalleFormDia!=null) {
			
		
		
		}
		
		if(this.jInternalFrameDetalleFormDia!=null) {
			this.jInternalFrameDetalleFormDia.setVisible(false);	    			
			this.jInternalFrameDetalleFormDia.dispose();
			this.jInternalFrameDetalleFormDia=null;
		}
		
		
		if(this.jInternalFrameReporteDinamicoDia!=null) {
			this.jInternalFrameReporteDinamicoDia.setVisible(false);	    			
			this.jInternalFrameReporteDinamicoDia.dispose();
			this.jInternalFrameReporteDinamicoDia=null;
		}
		
		if(this.jInternalFrameImportacionDia!=null) {
			this.jInternalFrameImportacionDia.setVisible(false);	    			
			this.jInternalFrameImportacionDia.dispose();
			this.jInternalFrameImportacionDia=null;
		}		
		
		
		this.setVisible(false);
		this.dispose();
		//this=null;
	}
	
	
	
	public void jButtonActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {			
			this.startProcessDia();
			
			DiaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.dia,new Object(),this.diaParameterGeneral,this.diaReturnGeneral);
			
			
			if(sTipo.equals("NuevoDia")) {
				jButtonNuevoDiaActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarDia")) {
				jButtonDuplicarDiaActionPerformed(evt,false);
			} else if(sTipo.equals("CopiarDia")) {
				jButtonCopiarDiaActionPerformed(evt);
			} else if(sTipo.equals("VerFormDia")) {
				jButtonVerFormDiaActionPerformed(evt);
			} else if(sTipo.equals("NuevoToolBarDia")) {
				jButtonNuevoDiaActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarToolBarDia")) {
				jButtonDuplicarDiaActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemNuevoDia")) {
				jButtonNuevoDiaActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemDuplicarDia")) {
				jButtonDuplicarDiaActionPerformed(evt,false);
			} else if(sTipo.equals("NuevoRelacionesDia")) {
				jButtonNuevoDiaActionPerformed(evt,true);
			} else if(sTipo.equals("NuevoRelacionesToolBarDia")) {
				jButtonNuevoDiaActionPerformed(evt,true);
			} else if(sTipo.equals("MenuItemNuevoRelacionesDia")) {
				jButtonNuevoDiaActionPerformed(evt,true);
			} else if(sTipo.equals("ModificarDia")) {
				jButtonModificarDiaActionPerformed(evt);
			} else if(sTipo.equals("ModificarToolBarDia")) {
				jButtonModificarDiaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemModificarDia")) {
				jButtonModificarDiaActionPerformed(evt);
			} else if(sTipo.equals("ActualizarDia")) {
				jButtonActualizarDiaActionPerformed(evt);
			} else if(sTipo.equals("ActualizarToolBarDia")) {
				jButtonActualizarDiaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemActualizarDia")) {
				jButtonActualizarDiaActionPerformed(evt);
			} else if(sTipo.equals("EliminarDia")) {
				jButtonEliminarDiaActionPerformed(evt);
			} else if(sTipo.equals("EliminarToolBarDia")) {
				jButtonEliminarDiaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemEliminarDia")) {
				jButtonEliminarDiaActionPerformed(evt);
			} else if(sTipo.equals("CancelarDia")) {
				jButtonCancelarDiaActionPerformed(evt);
			} else if(sTipo.equals("CancelarToolBarDia")) {
				jButtonCancelarDiaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCancelarDia")) {
				jButtonCancelarDiaActionPerformed(evt);
			} else if(sTipo.equals("CerrarDia")) {
				jButtonCerrarDiaActionPerformed(evt);
			} else if(sTipo.equals("CerrarToolBarDia")) {
				jButtonCerrarDiaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCerrarDia")) {
				jButtonCerrarDiaActionPerformed(evt);
			} else if(sTipo.equals("MostrarOcultarToolBarDia")) {
				jButtonMostrarOcultarDiaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemDetalleCerrarDia")) {
				jButtonCancelarDiaActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosDia")) {
				jButtonGuardarCambiosDiaActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosToolBarDia")) {
				jButtonGuardarCambiosDiaActionPerformed(evt);
			} else if(sTipo.equals("CopiarToolBarDia")) {
				jButtonCopiarDiaActionPerformed(evt);
			} else if(sTipo.equals("VerFormToolBarDia")) {
				jButtonVerFormDiaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosDia")) {
				jButtonGuardarCambiosDiaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCopiarDia")) {
				jButtonCopiarDiaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemVerFormDia")) {
				jButtonVerFormDiaActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaDia")) {
				jButtonGuardarCambiosDiaActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaToolBarDia")) {
				jButtonGuardarCambiosDiaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosTablaDia")) {
				jButtonGuardarCambiosDiaActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionDia")) {
				jButtonRecargarInformacionDiaActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionToolBarDia")) {
				jButtonRecargarInformacionDiaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemRecargarInformacionDia")) {
				jButtonRecargarInformacionDiaActionPerformed(evt);
			}
			else if(sTipo.equals("AnterioresDia")) {
				jButtonAnterioresDiaActionPerformed(evt);
			} else if(sTipo.equals("AnterioresToolBarDia")) {
				jButtonAnterioresDiaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAnterioreDia")) {
				jButtonAnterioresDiaActionPerformed(evt);
			} else if(sTipo.equals("SiguientesDia")) {
				jButtonSiguientesDiaActionPerformed(evt);
			} else if(sTipo.equals("SiguientesToolBarDia")) {
				jButtonSiguientesDiaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemSiguientesDia")) {
				jButtonSiguientesDiaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAbrirOrderByDia") || sTipo.equals("MenuItemDetalleAbrirOrderByDia")) {
				jButtonAbrirOrderByDiaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemMostrarOcultarDia") || sTipo.equals("MenuItemDetalleMostrarOcultarDia")) {
				jButtonMostrarOcultarDiaActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosDia")) {
				jButtonNuevoGuardarCambiosDiaActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosToolBarDia")) {
				jButtonNuevoGuardarCambiosDiaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemNuevoGuardarCambiosDia")) {
				jButtonNuevoGuardarCambiosDiaActionPerformed(evt);
			} 
			else if(sTipo.equals("CerrarReporteDinamicoDia")) {
				jButtonCerrarReporteDinamicoDiaActionPerformed(evt);
			} else if(sTipo.equals("GenerarReporteDinamicoDia")) {
				jButtonGenerarReporteDinamicoDiaActionPerformed(evt);
			} else if(sTipo.equals("GenerarExcelReporteDinamicoDia")) {
				
				jButtonGenerarExcelReporteDinamicoDiaActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarImportacionDia")) {
				jButtonCerrarImportacionDiaActionPerformed(evt);
			} else if(sTipo.equals("GenerarImportacionDia")) {
				
				jButtonGenerarImportacionDiaActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirImportacionDia")) {
				
				jButtonAbrirImportacionDiaActionPerformed(evt);
				
			} else if(sTipo.equals("TiposAccionesDia")) {
				jComboBoxTiposAccionesDiaActionListener(evt,false);
			} else if(sTipo.equals("TiposRelacionesDia")) {
				jComboBoxTiposRelacionesDiaActionListener(evt);
			} else if(sTipo.equals("TiposAccionesFormularioDia")) {
				jComboBoxTiposAccionesDiaActionListener(evt,true);
			} else if(sTipo.equals("TiposSeleccionarDia")) {
				
				jComboBoxTiposSeleccionarDiaActionListener(evt);
				
			} else if(sTipo.equals("ValorCampoGeneralDia")) {
				jTextFieldValorCampoGeneralDiaActionListener(evt);
			}
			
			
			else if(sTipo.equals("AbrirOrderByDia")) {
				jButtonAbrirOrderByDiaActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirOrderByToolBarDia")) {
				jButtonAbrirOrderByDiaActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarOrderByDia")) {
				jButtonCerrarOrderByDiaActionPerformed(evt);
			} 
						
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idDiaBusqueda")) {
				this.jButtonidDiaBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombreDiaBusqueda")) {
				this.jButtonnombreDiaBusquedaActionPerformed(evt);
			}
			
			
			
			
			
			;
			
			
			DiaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.dia,new Object(),this.diaParameterGeneral,this.diaReturnGeneral);
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DiaConstantesFunciones.CLASSNAME);
			
  		} finally {
      		this.finishProcessDia();
      	}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaDiaActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.dia);
				
				this.actualizarInformacion("INFO_PADRE",false,this.dia);
				
				DiaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.dia,new Object(),this.diaParameterGeneral,this.diaReturnGeneral);
				
				


				
				DiaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.dia,new Object(),this.diaParameterGeneral,this.diaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(Dia.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",Dia.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
				}
				
			} catch(Exception e) {
  				FuncionesSwing.manageException2(this, e,logger,DiaConstantesFunciones.CLASSNAME);
  			}
    }
	
	public Boolean existeCambioValor(ControlTipo controlTipo,String sTipo) throws Exception {
		Boolean existeCambio=true;
		
		try {
			Dia diaLocal=null;
			
			if(!this.getEsControlTabla()) {
				diaLocal=this.dia;
			} else {
				diaLocal=this.diaAnterior;
			}
			
			if(controlTipo.equals(ControlTipo.TEXTBOX)) {
				


			}
		
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DiaConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.dia);
				
				this.actualizarInformacion("INFO_PADRE",false,this.dia);
				
				DiaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.dia,new Object(),this.diaParameterGeneral,this.diaReturnGeneral);
							
				
				


				
				DiaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.dia,new Object(),this.diaParameterGeneral,this.diaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(Dia.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",Dia.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DiaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaDiaActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosDia.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.diaAnterior =(Dia) this.diaLogic.getDias().toArray()[this.jTableDatosDia.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.diaAnterior =(Dia) this.dias.toArray()[this.jTableDatosDia.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DiaConstantesFunciones.CLASSNAME);
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
			
			DiaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.dia,new Object(),this.diaParameterGeneral,this.diaReturnGeneral);
			
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
			
			


			
			DiaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.dia,new Object(),this.diaParameterGeneral,this.diaReturnGeneral);
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DiaConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE QUITA ALGUN CARACTER
	public void jTextFieldRemoveUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DiaConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE INGRESA ALGUN CARACTER
	public void jTextFieldInsertUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DiaConstantesFunciones.CLASSNAME);
  		}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jFormattedTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaDiaActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.dia);
				
				this.actualizarInformacion("INFO_PADRE",false,this.dia);
				
				DiaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.dia,new Object(),this.diaParameterGeneral,this.diaReturnGeneral);
								
						
				


				
				DiaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.dia,new Object(),this.diaParameterGeneral,this.diaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(Dia.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",Dia.class.getName(),sTipo,"DATE",esControlTabla,conIrServidorAplicacionParent,
							id,JFormattedTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DiaConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.dia);
				
				this.actualizarInformacion("INFO_PADRE",false,this.dia);
				
				DiaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.dia,new Object(),this.diaParameterGeneral,this.diaReturnGeneral);
								
				
				


				
				DiaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.dia,new Object(),this.diaParameterGeneral,this.diaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(Dia.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",Dia.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DiaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jFormattedTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaDiaActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosDia.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.diaAnterior =(Dia) this.diaLogic.getDias().toArray()[this.jTableDatosDia.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.diaAnterior =(Dia) this.dias.toArray()[this.jTableDatosDia.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DiaConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusLostGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl() && this.existeCambioValor(ControlTipo.DATE,sTipo)) {
				this.actualizarInformacion("EVENTO_CONTROL",false,this.dia);
				
				this.actualizarInformacion("INFO_PADRE",false,this.dia);
			}	
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DiaConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaDiaActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosDia.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.diaAnterior =(Dia) this.diaLogic.getDias().toArray()[this.jTableDatosDia.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.diaAnterior =(Dia) this.dias.toArray()[this.jTableDatosDia.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DiaConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaDiaActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.dia);
			
			this.actualizarInformacion("INFO_PADRE",false,this.dia);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DiaConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.dia);
				
				this.actualizarInformacion("INFO_PADRE",false,this.dia);
				
				DiaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.dia,new Object(),this.diaParameterGeneral,this.diaReturnGeneral);
							
				
				


				
				DiaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.dia,new Object(),this.diaParameterGeneral,this.diaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(Dia.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",Dia.class.getName(),sTipo,"TEXTAREA",esControlTabla,conIrServidorAplicacionParent,
							id,jTextArea, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DiaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaDiaActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosDia.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.diaAnterior =(Dia) this.diaLogic.getDias().toArray()[this.jTableDatosDia.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.diaAnterior =(Dia) this.dias.toArray()[this.jTableDatosDia.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DiaConstantesFunciones.CLASSNAME);
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
			
			DiaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.dia,new Object(),this.diaParameterGeneral,this.diaReturnGeneral);
			
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
			
			


			
			DiaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.dia,new Object(),this.diaParameterGeneral,this.diaReturnGeneral);
			
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DiaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaRemoveUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DiaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaInsertUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DiaConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jTextAreaActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaDiaActual();
			
			this.actualizarInformacion("EVENTO_CONTROL",false,this.dia);
			
			this.actualizarInformacion("INFO_PADRE",false,this.dia);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DiaConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.dia);
				
				this.actualizarInformacion("INFO_PADRE",false,this.dia);
				
				DiaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.dia,new Object(),this.diaParameterGeneral,this.diaReturnGeneral);
								
				
				


				
				DiaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.dia,new Object(),this.diaParameterGeneral,this.diaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(Dia.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",Dia.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jLabel, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DiaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jLabelFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaDiaActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosDia.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.diaAnterior =(Dia) this.diaLogic.getDias().toArray()[this.jTableDatosDia.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.diaAnterior =(Dia) this.dias.toArray()[this.jTableDatosDia.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DiaConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jLabelActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaDiaActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.dia);
			
			this.actualizarInformacion("INFO_PADRE",false,this.dia);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DiaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxItemListenerGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaDiaActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.dia);
				
				this.actualizarInformacion("INFO_PADRE",false,this.dia);
				
				DiaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.dia,new Object(),this.diaParameterGeneral,this.diaReturnGeneral);
												
				
				if(sTipo.equals("SeleccionarTodosDia")) {
					jCheckBoxSeleccionarTodosDiaItemListener(evt);
				
				} else if(sTipo.equals("SeleccionadosDia")) {
					jCheckBoxSeleccionadosDiaItemListener(evt);
				
				} else if(sTipo.equals("NuevoToolBarDia")) {
					
				}
				
				


				
				
				DiaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.dia,new Object(),this.diaParameterGeneral,this.diaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(Dia.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",Dia.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DiaConstantesFunciones.CLASSNAME);
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
				
				//this.actualizarInformacion("EVENTO_CONTROL",false,this.dia);
				
				//this.actualizarInformacion("INFO_PADRE",false,this.dia);
				
				DiaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.dia,new Object(),this.diaParameterGeneral,this.diaReturnGeneral);
												
				
				


				
				
				DiaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.dia,new Object(),this.diaParameterGeneral,this.diaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(Dia.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",Dia.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DiaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaDiaActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosDia.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.diaAnterior =(Dia) this.diaLogic.getDias().toArray()[this.jTableDatosDia.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.diaAnterior =(Dia) this.dias.toArray()[this.jTableDatosDia.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DiaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaDiaActual();
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.dia);
				
				this.actualizarInformacion("INFO_PADRE",false,this.dia);
				
				DiaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.dia,new Object(),this.diaParameterGeneral,this.diaReturnGeneral);
				
				
				DiaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.dia,new Object(),this.diaParameterGeneral,this.diaReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DiaConstantesFunciones.CLASSNAME);
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
			
			DiaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.dia,new Object(),this.diaParameterGeneral,this.diaReturnGeneral);
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
			
			


			
			DiaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.dia,new Object(),this.diaParameterGeneral,this.diaReturnGeneral);
			*/						
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DiaConstantesFunciones.CLASSNAME);
  		}		
    }
	
	@SuppressWarnings("rawtypes")
	public void jComboBoxItemStateChangedGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if (evt.getStateChange() == ItemEvent.SELECTED && this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaDiaActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.dia);
				
				this.actualizarInformacion("INFO_PADRE",false,this.dia);
				
				DiaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.dia,new Object(),this.diaParameterGeneral,this.diaReturnGeneral);
				
				
				String sFinalQueryCombo="";
				
				


				
				DiaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.dia,new Object(),this.diaParameterGeneral,this.diaReturnGeneral);
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(Dia.class.getName());
								
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",Dia.class.getName(),sTipo,"COMBOBOX",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DiaConstantesFunciones.CLASSNAME);
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
			
				this.actualizarInformacion("EVENTO_CONTROL",false,this.dia);
				
				this.actualizarInformacion("INFO_PADRE",false,this.dia);
				
				DiaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.dia,new Object(),this.diaParameterGeneral,this.diaReturnGeneral);
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
				
				


				
				DiaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.dia,new Object(),this.diaParameterGeneral,this.diaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(Dia.class.getName());
				
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",Dia.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DiaConstantesFunciones.CLASSNAME);
  		}
		
		*/
    }
	
	public void jComboBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaDiaActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosDia.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.diaAnterior =(Dia) this.diaLogic.getDias().toArray()[this.jTableDatosDia.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.diaAnterior =(Dia) this.dias.toArray()[this.jTableDatosDia.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DiaConstantesFunciones.CLASSNAME);
  		}
    }		
	
	public void tableValueChangedGeneral(String sTipo,ListSelectionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				DiaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.dia,new Object(),this.diaParameterGeneral,this.diaReturnGeneral);
				
				if(sTipo.equals("TableDatosSeleccionarDia")) {
					//BYDAN_DESHABILITADO
					//try {jTableDatosDiaListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
					
					//SOLO CUANDO MOUSE ES SOLTADO
					if (!evt.getValueIsAdjusting()) {
						//SELECCIONA FILA A OBJETO ACTUAL
						Integer intSelectedRow = this.jTableDatosDia.getSelectedRow();
						
						if(intSelectedRow!=null && intSelectedRow>-1) {
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								this.dia =(Dia) this.diaLogic.getDias().toArray()[this.jTableDatosDia.convertRowIndexToModel(intSelectedRow)];
							} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
								this.dia =(Dia) this.dias.toArray()[this.jTableDatosDia.convertRowIndexToModel(intSelectedRow)];
							}
							//ARCHITECTURE
							
							//System.out.println(this.dia);
						}
					}
					
				} else if(sTipo.equals("jButtonCancelarDia")) {
				
				}
				
				DiaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.dia,new Object(),this.diaParameterGeneral,this.diaReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DiaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void tableMouseAdapterGeneral(String sTipo,MouseEvent evt) { 	  
		try {
			DiaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.dia,new Object(),this.diaParameterGeneral,this.diaReturnGeneral);
			
			if(sTipo.equals("DatosSeleccionarDia")) {
				if (evt.getClickCount() == 2) {
					jButtonIdActionPerformed(null,jTableDatosDia.getSelectedRow(),false,false);
				}	
			} else if(sTipo.equals("jButtonCancelarDia")) {
			
			}
			
			DiaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.dia,new Object(),this.diaParameterGeneral,this.diaReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DiaConstantesFunciones.CLASSNAME);
  		}
    }
	
	;
	
	public void jButtonActionPerformedTecladoGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			this.startProcessDia();
			
			DiaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.dia,new Object(),this.diaParameterGeneral,this.diaReturnGeneral);
			
			if(sTipo.equals("NuevoDia")) {
				jButtonNuevoDiaActionPerformed(evt,false);
				
			} else if(sTipo.equals("DuplicarDia")) {
				jButtonDuplicarDiaActionPerformed(evt,false);
				
			} else if(sTipo.equals("CopiarDia")) {
				jButtonCopiarDiaActionPerformed(evt);
				
			} else if(sTipo.equals("VerFormDia")) {
				jButtonVerFormDiaActionPerformed(evt);
				
			} else if(sTipo.equals("NuevoRelacionesDia")) {
				jButtonNuevoDiaActionPerformed(evt,true);
				
			} else if(sTipo.equals("ModificarDia")) {
				jButtonModificarDiaActionPerformed(evt);
				
			} else if(sTipo.equals("ActualizarDia")) {
				jButtonActualizarDiaActionPerformed(evt);
				
			} else if(sTipo.equals("EliminarDia")) {
				jButtonEliminarDiaActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosTablaDia")) {
				jButtonGuardarCambiosDiaActionPerformed(evt);
				
			} else if(sTipo.equals("CancelarDia")) {
				jButtonCancelarDiaActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarDia")) {
				jButtonCerrarDiaActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosDia")) {
				jButtonGuardarCambiosDiaActionPerformed(evt);
			
			} else if(sTipo.equals("NuevoGuardarCambiosDia")) {
				jButtonNuevoGuardarCambiosDiaActionPerformed(evt);
			
			} else if(sTipo.equals("AbrirOrderByDia")) {
				jButtonAbrirOrderByDiaActionPerformed(evt);
			
			} else if(sTipo.equals("RecargarInformacionDia")) {
				jButtonRecargarInformacionDiaActionPerformed(evt);
			
			} else if(sTipo.equals("AnterioresDia")) {
				jButtonAnterioresDiaActionPerformed(evt);			
			
			}  else if(sTipo.equals("SiguientesDia")) {
				jButtonSiguientesDiaActionPerformed(evt);			
			} 
			
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idDiaBusqueda")) {
				this.jButtonidDiaBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombreDiaBusqueda")) {
				this.jButtonnombreDiaBusquedaActionPerformed(evt);
			}
			
			DiaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.dia,new Object(),this.diaParameterGeneral,this.diaReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DiaConstantesFunciones.CLASSNAME);
			
  		}  finally {
      		this.finishProcessDia();
      	}
    }
	
	public void internalFrameClosingInternalFrameGeneral(String sTipo,InternalFrameEvent evt) { 	  
		try {
			DiaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.dia,new Object(),this.diaParameterGeneral,this.diaReturnGeneral);
			
			if(sTipo.equals("CloseInternalFrameDia")) {
				closingInternalFrameDia();
				
			} else if(sTipo.equals("jButtonCancelarDia")) {
				JInternalFrameBase jInternalFrameDetalleFormDia = (JInternalFrameBase)evt.getSource();
	            	
	            DiaBeanSwingJInternalFrame jInternalFrameParent=(DiaBeanSwingJInternalFrame)jInternalFrameDetalleFormDia.getjInternalFrameParent();
	            
				jInternalFrameParent.jButtonCancelarDiaActionPerformed(null);
			}
			
			DiaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.dia,new Object(),this.diaParameterGeneral,this.diaReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DiaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void recargarFormDia(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion) throws Exception {
		this.recargarFormDia(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,false);
	}
	
	public void recargarFormDia(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion,Boolean esControlTabla) throws Exception {
		if(this.permiteRecargarForm && this.permiteMantenimiento(this.dia)) {
			if(!esControlTabla) {
				if(DiaJInternalFrame.ISBINDING_MANUAL_TABLA) {			
					this.setVariablesFormularioToObjetoActualDia(this.dia,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysDia(this.dia);			
				}
				
				if(this.diaSessionBean.getEstaModoGuardarRelaciones()) {
					this.setVariablesFormularioRelacionesToObjetoActualDia(this.dia,classes);				
				}
			
				if(conIrServidorAplicacion) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {						
						this.diaReturnGeneral=diaLogic.procesarEventosDiasWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.diaLogic.getDias(),this.dia,this.diaParameterGeneral,this.isEsNuevoDia,classes);//this.diaLogic.getDia()//sTipoGeneral
									
					} else if(Constantes.ISUSAEJBREMOTE) {
									
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE
					
					//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					//this.setVariablesObjetoReturnGeneralToBeanDia(this.diaReturnGeneral,this.diaBean,false);
						
					//ACTUALIZA VARIABLES RELACIONES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					if(this.diaSessionBean.getEstaModoGuardarRelaciones()) {
						//this.setVariablesRelacionesObjetoReturnGeneralToBeanDia(classes,this.diaReturnGeneral,this.diaBean,false);
					}
						
					if(this.diaReturnGeneral.getConRecargarPropiedades()) {
						//INICIALIZA VARIABLES COMBOS NORMALES (FK)
						this.setVariablesObjetoActualToFormularioForeignKeyDia(this.diaReturnGeneral.getDia());
							
						//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
						this.setVariablesObjetoActualToFormularioDia(this.diaReturnGeneral.getDia());	
					}
						
					if(this.diaReturnGeneral.getConRecargarRelaciones()) {
						//INICIALIZA VARIABLES RELACIONES A FORMULARIO
						this.setVariablesRelacionesObjetoActualToFormularioDia(this.diaReturnGeneral.getDia(),classes);//this.diaBean);	
					}									
					
				} else {				
					//INICIALIZA VARIABLES RELACIONES A FORMULARIO
					this.setVariablesRelacionesObjetoActualToFormularioDia(this.dia,classes);//this.diaBean);									
				}
			
				if(DiaJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesFormularioToObjetoActualDia(this.dia,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysDia(this.dia);				
				}
				
			} else {
				
				if(((controlTipo.equals(ControlTipo.TEXTBOX) || controlTipo.equals(ControlTipo.DATE)
					|| controlTipo.equals(ControlTipo.TEXTAREA) || controlTipo.equals(ControlTipo.COMBOBOX)
					)				
					&& eventoTipo.equals(EventoTipo.CHANGE)
					)
					
					|| (controlTipo.equals(ControlTipo.CHECKBOX) && eventoTipo.equals(EventoTipo.CLIC))
					
				) { // && sTipoGeneral.equals("TEXTBOX")
					
					if(this.diaAnterior!=null) {
						this.dia=this.diaAnterior;
					}
				}
				
				if(conIrServidorAplicacion) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {						
						this.diaReturnGeneral=diaLogic.procesarEventosDiasWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.diaLogic.getDias(),this.dia,this.diaParameterGeneral,this.isEsNuevoDia,classes);//this.diaLogic.getDia()//sTipoGeneral
									
					} else if(Constantes.ISUSAEJBREMOTE) {
									
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.diaSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.diaSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(this.diaReturnGeneral.getDia(),diaLogic.getDias());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(this.diaReturnGeneral.getDia(),this.dias);
				}
				//ARCHITECTURE
				
				//this.jTableDatosDia.repaint();
				
				//((AbstractTableModel) this.jTableDatosDia.getModel()).fireTableDataChanged();
				
				this.actualizarVisualTableDatosDia();
			}
		}
	}
	
	public void actualizarVisualTableDatosDia() throws Exception {
		
		DiaModel diaModel=(DiaModel)this.jTableDatosDia.getModel();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			diaModel.dias=this.diaLogic.getDias();
		
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
			diaModel.dias=this.dias;
		}
		
		
		((DiaModel) this.jTableDatosDia.getModel()).fireTableDataChanged();
	}
	
	public void actualizarVisualTableDatosEventosVistaDia() throws Exception {
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.actualizarLista(this.getdiaAnterior(),this.diaLogic.getDias());
					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			this.actualizarLista(this.getdiaAnterior(),this.dias);
		}
		//ARCHITECTURE
						
		this.actualizarFilaTotales();
						
		this.actualizarVisualTableDatosDia();	
	}
	
	public void setVariablesRelacionesObjetoActualToFormularioDia(Dia dia,ArrayList<Classe> classes) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DiaConstantesFunciones.CLASSNAME);
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
										
				DiaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.dia,new Object(),generalEntityParameterGeneral,this.diaReturnGeneral);
				
				ArrayList<Classe> classes=new ArrayList<Classe>();
				
				for(String sClasse:arrClasses) {
					if(sClasse.equals("TODOS")) {
						conTodasRelaciones=true;
						break;
					}
				}
				
				if(this.diaSessionBean.getConGuardarRelaciones()) {
					if(conTodasRelaciones) {
						classes=DiaConstantesFunciones.getClassesRelationshipsOfDia(new ArrayList<Classe>(),DeepLoadType.NONE);
					} else {
						classes=DiaConstantesFunciones.getClassesRelationshipsFromStringsOfDia(arrClasses,DeepLoadType.NONE);
					}
				}
	
				this.classesActual=new ArrayList<Classe>();
				this.classesActual.addAll(classes);
	
				this.recargarFormDia(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,esControlTabla);
										
				DiaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.dia,new Object(),generalEntityParameterGeneral,this.diaReturnGeneral);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DiaConstantesFunciones.CLASSNAME);
  		}
    }
	
	/*
	public void setVariablesRelacionesObjetoBeanActualToFormularioDia(DiaBean diaBean) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DiaConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesRelacionesObjetoReturnGeneralToBeanDia(ArrayList<Classe> classes,DiaReturnGeneral diaReturnGeneral,DiaBean diaBean,Boolean conDefault) throws Exception {
		
	}
	*/
	
	public void setVariablesFormularioRelacionesToObjetoActualDia(Dia dia,ArrayList<Classe> classes) throws Exception {
		
	}
	
	public Boolean permiteManejarEventosControl() {
		Boolean permite=true;				
		
		if(this.estaModoNuevo || this.estaModoSeleccionar || this.estaModoEliminarGuardarCambios) {
			permite=false;
			
		} 
		
		//NO DEBE MEZCLARSE CONCEPTOS
		/*	
		if(!paraTabla && !this.permiteMantenimiento(this.dia)) {
			System.out.println("ERROR:EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES");
				
			//JOptionPane.showMessageDialog(this,"EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES","EVENTO",JOptionPane.ERROR_MESSAGE);			
		}
		*/
		
		return permite;
	}
	
	public void inicializarFormDetalle() throws Exception {
		
		this.jInternalFrameDetalleFormDia = new DiaDetalleFormJInternalFrame(jDesktopPane,this.diaSessionBean.getConGuardarRelaciones(),this.diaSessionBean.getEsGuardarRelacionado(),this.cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		this.jDesktopPane.add(this.jInternalFrameDetalleFormDia);
		this.jInternalFrameDetalleFormDia.setVisible(false);
		this.jInternalFrameDetalleFormDia.setSelected(false);						
		
		this.jInternalFrameDetalleFormDia.setJInternalFrameParent(this);
		
		this.jInternalFrameDetalleFormDia.diaLogic=this.diaLogic;
		
		this.cargarCombosFrameForeignKeyDia("Formulario");
		
		this.inicializarActualizarBindingBotonesPermisosManualFormDetalleDia();
		this.inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleDia();
		
		this.initActionsFormDetalle();		
		
		this.initActionsCombosTodosForeignKeyDia("Formulario");
		
		//TALVEZ conSetVariablesGlobales COMO if() 
		this.setVariablesGlobalesCombosForeignKeyDia();
		
		this.cargarMenuRelaciones();
		
	}
	
	public void initActionsFormDetalle() {	
		
		this.jInternalFrameDetalleFormDia.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarDia"));
		
		this.jInternalFrameDetalleFormDia.jButtonModificarDia.addActionListener(new ButtonActionListener(this,"ModificarDia"));

		
		this.jInternalFrameDetalleFormDia.jButtonModificarToolBarDia.addActionListener(new ButtonActionListener(this,"ModificarToolBarDia"));
					
		this.jInternalFrameDetalleFormDia.jMenuItemModificarDia.addActionListener(new ButtonActionListener(this,"MenuItemModificarDia"));		
		
		
		
		this.jInternalFrameDetalleFormDia.jButtonActualizarDia.addActionListener (new ButtonActionListener(this,"ActualizarDia"));
		
		
		this.jInternalFrameDetalleFormDia.jButtonActualizarToolBarDia.addActionListener(new ButtonActionListener(this,"ActualizarToolBarDia"));
						
		this.jInternalFrameDetalleFormDia.jMenuItemActualizarDia.addActionListener (new ButtonActionListener(this,"MenuItemActualizarDia"));		
		
		
		
		this.jInternalFrameDetalleFormDia.jButtonEliminarDia.addActionListener (new ButtonActionListener(this,"EliminarDia"));
		
		
		this.jInternalFrameDetalleFormDia.jButtonEliminarToolBarDia.addActionListener (new ButtonActionListener(this,"EliminarToolBarDia"));
								
		this.jInternalFrameDetalleFormDia.jMenuItemEliminarDia.addActionListener (new ButtonActionListener(this,"MenuItemEliminarDia"));		
		
		
		
		this.jInternalFrameDetalleFormDia.jButtonCancelarDia.addActionListener (new ButtonActionListener(this,"CancelarDia"));
		
		
		this.jInternalFrameDetalleFormDia.jButtonCancelarToolBarDia.addActionListener (new ButtonActionListener(this,"CancelarToolBarDia"));
					
		this.jInternalFrameDetalleFormDia.jMenuItemCancelarDia.addActionListener (new ButtonActionListener(this,"MenuItemCancelarDia"));		
		
		
		
		
		
		this.jInternalFrameDetalleFormDia.jMenuItemDetalleCerrarDia.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarDia"));		
		
		
		
		this.jInternalFrameDetalleFormDia.jButtonGuardarCambiosToolBarDia.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarDia"));
		
		
		
		this.jInternalFrameDetalleFormDia.jButtonGuardarCambiosToolBarDia.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarDia"));
		
		
		
		this.jInternalFrameDetalleFormDia.jComboBoxTiposAccionesFormularioDia.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioDia"));
		
		
				
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDia.jButtonidDiaBusqueda.addActionListener(new ButtonActionListener(this,"idDiaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDia.jButtonnombreDiaBusqueda.addActionListener(new ButtonActionListener(this,"nombreDiaBusqueda"));
		
		
		;

		//TABBED PANE RELACIONES
		this.jInternalFrameDetalleFormDia.jTabbedPaneRelacionesDia.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesDia"));
		
		;		
		//TABBED PANE RELACIONES FIN(EXTRA TAB)	
	}
	
	public void initActions() {				
		this.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"CloseInternalFrameDia"));
		
		if(this.jInternalFrameDetalleFormDia!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormDia.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarDia"));
		}
		
		this.jTableDatosDia.getSelectionModel().addListSelectionListener(new TableListSelectionListener(this,"TableDatosSeleccionarDia"));
		
		this.jTableDatosDia.addMouseListener(new TableMouseAdapter(this,"DatosSeleccionarDia"));
		
		this.jButtonNuevoDia.addActionListener(new ButtonActionListener(this,"NuevoDia"));
		
		this.jButtonDuplicarDia.addActionListener(new ButtonActionListener(this,"DuplicarDia"));
		
		this.jButtonCopiarDia.addActionListener(new ButtonActionListener(this,"CopiarDia"));
		
		this.jButtonVerFormDia.addActionListener(new ButtonActionListener(this,"VerFormDia"));
		
		
		this.jButtonNuevoToolBarDia.addActionListener(new ButtonActionListener(this,"NuevoToolBarDia"));
			
		this.jButtonDuplicarToolBarDia.addActionListener(new ButtonActionListener(this,"DuplicarToolBarDia"));
			
		this.jMenuItemNuevoDia.addActionListener (new ButtonActionListener(this,"MenuItemNuevoDia"));
			
		this.jMenuItemDuplicarDia.addActionListener (new ButtonActionListener(this,"MenuItemDuplicarDia"));		
		
		
		this.jButtonNuevoRelacionesDia.addActionListener (new ButtonActionListener(this,"NuevoRelacionesDia"));
		
		
		this.jButtonNuevoRelacionesToolBarDia.addActionListener(new ButtonActionListener(this,"NuevoRelacionesToolBarDia"));
			
		this.jMenuItemNuevoRelacionesDia.addActionListener(new ButtonActionListener(this,"MenuItemNuevoRelacionesDia"));		
		
		
		if(this.jInternalFrameDetalleFormDia!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormDia.jButtonModificarDia.addActionListener(new ButtonActionListener(this,"ModificarDia"));
		}
		
		
		if(this.jInternalFrameDetalleFormDia!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormDia.jButtonModificarToolBarDia.addActionListener(new ButtonActionListener(this,"ModificarToolBarDia"));
			
			this.jInternalFrameDetalleFormDia.jMenuItemModificarDia.addActionListener(new ButtonActionListener(this,"MenuItemModificarDia"));		
		}
		
		
		if(this.jInternalFrameDetalleFormDia!=null) { //if(this.conCargarFormDetalle) {			
			this.jInternalFrameDetalleFormDia.jButtonActualizarDia.addActionListener (new ButtonActionListener(this,"ActualizarDia"));
		}
		
		
		if(this.jInternalFrameDetalleFormDia!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormDia.jButtonActualizarToolBarDia.addActionListener(new ButtonActionListener(this,"ActualizarToolBarDia"));
				
			this.jInternalFrameDetalleFormDia.jMenuItemActualizarDia.addActionListener (new ButtonActionListener(this,"MenuItemActualizarDia"));		
		}
		
		
		if(this.jInternalFrameDetalleFormDia!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormDia.jButtonEliminarDia.addActionListener (new ButtonActionListener(this,"EliminarDia"));
		}
		
		
		if(this.jInternalFrameDetalleFormDia!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormDia.jButtonEliminarToolBarDia.addActionListener (new ButtonActionListener(this,"EliminarToolBarDia"));
						
			this.jInternalFrameDetalleFormDia.jMenuItemEliminarDia.addActionListener (new ButtonActionListener(this,"MenuItemEliminarDia"));		
		}
		
		
		if(this.jInternalFrameDetalleFormDia!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormDia.jButtonCancelarDia.addActionListener (new ButtonActionListener(this,"CancelarDia"));
		}
		
		
		if(this.jInternalFrameDetalleFormDia!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormDia.jButtonCancelarToolBarDia.addActionListener (new ButtonActionListener(this,"CancelarToolBarDia"));
			
			this.jInternalFrameDetalleFormDia.jMenuItemCancelarDia.addActionListener (new ButtonActionListener(this,"MenuItemCancelarDia"));		
		}
		
		this.jButtonMostrarOcultarTablaToolBarDia.addActionListener (new ButtonActionListener(this,"MostrarOcultarToolBarDia"));		
		
		
		this.jButtonCerrarDia.addActionListener (new ButtonActionListener(this,"CerrarDia"));
		
		
		this.jButtonCerrarToolBarDia.addActionListener (new ButtonActionListener(this,"CerrarToolBarDia"));
			
		this.jMenuItemCerrarDia.addActionListener (new ButtonActionListener(this,"MenuItemCerrarDia"));
			
		if(this.jInternalFrameDetalleFormDia!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormDia.jMenuItemDetalleCerrarDia.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarDia"));		
		}
		
		
		if(this.jInternalFrameDetalleFormDia!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormDia.jButtonGuardarCambiosDia.addActionListener (new ButtonActionListener(this,"GuardarCambiosDia"));
		}
		
		
		if(this.jInternalFrameDetalleFormDia!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormDia.jButtonGuardarCambiosToolBarDia.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarDia"));
		}
		
		this.jButtonCopiarToolBarDia.addActionListener (new ButtonActionListener(this,"CopiarToolBarDia"));
			
		this.jButtonVerFormToolBarDia.addActionListener (new ButtonActionListener(this,"VerFormToolBarDia"));
		
		this.jMenuItemGuardarCambiosDia.addActionListener (new ButtonActionListener(this,"MenuItemGuardarCambiosDia"));
			
		this.jMenuItemCopiarDia.addActionListener (new ButtonActionListener(this,"MenuItemCopiarDia"));		
		
		this.jMenuItemVerFormDia.addActionListener (new ButtonActionListener(this,"MenuItemVerFormDia"));		
		
		
		this.jButtonGuardarCambiosTablaDia.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaDia"));
		
		
		this.jButtonGuardarCambiosTablaToolBarDia.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaToolBarDia"));
			
		this.jMenuItemGuardarCambiosTablaDia.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaDia"));		
		
		
		
		this.jButtonRecargarInformacionDia.addActionListener (new ButtonActionListener(this,"RecargarInformacionDia"));
					
		this.jButtonRecargarInformacionToolBarDia.addActionListener (new ButtonActionListener(this,"RecargarInformacionToolBarDia"));
		
		this.jMenuItemRecargarInformacionDia.addActionListener (new ButtonActionListener(this,"MenuItemRecargarInformacionDia"));		
		
		
		
		this.jButtonAnterioresDia.addActionListener (new ButtonActionListener(this,"AnterioresDia"));
		
		
		this.jButtonAnterioresToolBarDia.addActionListener (new ButtonActionListener(this,"AnterioresToolBarDia"));
		
		this.jMenuItemAnterioresDia.addActionListener (new ButtonActionListener(this,"MenuItemAnterioresDia"));		
		
		
		this.jButtonSiguientesDia.addActionListener (new ButtonActionListener(this,"SiguientesDia"));
		
		
		this.jButtonSiguientesToolBarDia.addActionListener (new ButtonActionListener(this,"SiguientesToolBarDia"));
			
		this.jMenuItemSiguientesDia.addActionListener (new ButtonActionListener(this,"MenuItemSiguientesDia"));
			
		this.jMenuItemAbrirOrderByDia.addActionListener (new ButtonActionListener(this,"MenuItemAbrirOrderByDia"));
			
		this.jMenuItemMostrarOcultarDia.addActionListener (new ButtonActionListener(this,"MenuItemMostrarOcultarDia"));
			
		this.jMenuItemDetalleAbrirOrderByDia.addActionListener (new ButtonActionListener(this,"MenuItemDetalleAbrirOrderByDia"));
			
		this.jMenuItemDetalleMostarOcultarDia.addActionListener (new ButtonActionListener(this,"MenuItemDetalleMostrarOcultarDia"));		
		
		
		this.jButtonNuevoGuardarCambiosDia.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosDia"));
		
		
		this.jButtonNuevoGuardarCambiosToolBarDia.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosToolBarDia"));
			
		this.jMenuItemNuevoGuardarCambiosDia.addActionListener (new ButtonActionListener(this,"MenuItemNuevoGuardarCambiosDia"));		
		
		
		
		//SELECCIONAR TODOS
		
		this.jCheckBoxSeleccionarTodosDia.addItemListener(new CheckBoxItemListener(this,"SeleccionarTodosDia"));

		this.jCheckBoxSeleccionadosDia.addItemListener(new CheckBoxItemListener(this,"SeleccionadosDia"));
		
		if(this.jInternalFrameDetalleFormDia!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormDia.jComboBoxTiposAccionesFormularioDia.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioDia"));
		}
		
		
		this.jComboBoxTiposRelacionesDia.addActionListener (new ButtonActionListener(this,"TiposRelacionesDia"));
			
		this.jComboBoxTiposAccionesDia.addActionListener (new ButtonActionListener(this,"TiposAccionesDia"));
					
		this.jComboBoxTiposSeleccionarDia.addActionListener (new ButtonActionListener(this,"TiposSeleccionarDia"));
			
		this.jTextFieldValorCampoGeneralDia.addActionListener (new ButtonActionListener(this,"ValorCampoGeneralDia"));		
		
		
		if(this.jInternalFrameDetalleFormDia!=null) { //if(this.conCargarFormDetalle) {
		
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDia.jButtonidDiaBusqueda.addActionListener(new ButtonActionListener(this,"idDiaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDia.jButtonnombreDiaBusqueda.addActionListener(new ButtonActionListener(this,"nombreDiaBusqueda"));
		}
		
		if(!this.conCargarMinimo) {
		//BYDAN_BUSQUEDAS
		
				
		
		
			//REPORTE DINAMICO
			
			if(this.jInternalFrameReporteDinamicoDia!=null) {
				this.jInternalFrameReporteDinamicoDia.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoDia"));
				this.jInternalFrameReporteDinamicoDia.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoDia"));
				this.jInternalFrameReporteDinamicoDia.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoDia"));
			}
			
			//this.jButtonCerrarReporteDinamicoDia.addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoDia"));				
			//this.jButtonGenerarReporteDinamicoDia.addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoDia"));
			//this.jButtonGenerarExcelReporteDinamicoDia.addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoDia"));
				
				
			//IMPORTACION			
			if(this.jInternalFrameImportacionDia!=null) {
				this.jInternalFrameImportacionDia.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionDia"));
				this.jInternalFrameImportacionDia.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionDia"));
				this.jInternalFrameImportacionDia.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionDia"));
			}
			
			//ORDER BY
			this.jButtonAbrirOrderByDia.addActionListener (new ButtonActionListener(this,"AbrirOrderByDia"));
			
			this.jButtonAbrirOrderByToolBarDia.addActionListener (new ButtonActionListener(this,"AbrirOrderByToolBarDia"));			
			
			if(this.jInternalFrameOrderByDia!=null) {
				this.jInternalFrameOrderByDia.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByDia"));				
			}
			
			
		}
		
		
		
		if(!this.conCargarMinimo) {
			if(this.jInternalFrameDetalleFormDia!=null) { //if(this.conCargarFormDetalle) {
			;
			}
		}
		
		
		//TABBED PANE RELACIONES
		if(this.jInternalFrameDetalleFormDia!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormDia.jTabbedPaneRelacionesDia.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesDia"));
		
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
            		closingInternalFrameDia();
				} catch (Exception e) {
					e.printStackTrace();
				}
            }
        });
		
		this.jInternalFrameDetalleFormDia.addInternalFrameListener(new javax.swing.event.InternalFrameAdapter() {
	        public void internalFrameClosing(InternalFrameEvent event) {
	            JInternalFrameBase jInternalFrameDetalleFormDia = (JInternalFrameBase)event.getSource();
	            	
	            DiaBeanSwingJInternalFrame jInternalFrameParent=(DiaBeanSwingJInternalFrame)jInternalFrameDetalleFormDia.getjInternalFrameParent();
	                
	            try {
					jInternalFrameParent.jButtonCancelarDiaActionPerformed(null);
					
					//jInternalFrameParent.dispose();
					//jInternalFrameParent=null;
					
				} catch (Exception e) {
					e.printStackTrace();
				}
	        }
	    });
			
		this.jTableDatosDia.getSelectionModel().addListSelectionListener (
	                new ListSelectionListener() {
	                    public void valueChanged(ListSelectionEvent e) {
							//BYDAN_DESHABILITADO
	                    	//try {jTableDatosDiaListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
	                    }
	                }
	     );
		
		this.jTableDatosDia.addMouseListener(new MouseAdapter() {
			   public void mouseClicked(MouseEvent evt) {
				      if (evt.getClickCount() == 2) {
				    	  jButtonIdActionPerformed(null,jTableDatosDia.getSelectedRow(),false,false);
				      }
				   }
		});
		
		this.jButtonNuevoDia.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoDiaActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoToolBarDia.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoDiaActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoDia.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoDiaActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoDia";
		inputMap = this.jButtonNuevoDia.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_N , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoDia.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoDiaActionPerformed(evt,false);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonNuevoRelacionesDia.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoDiaActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoRelacionesToolBarDia.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoDiaActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoRelacionesDia.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoDiaActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoRelacionesDia";
		inputMap = this.jButtonNuevoRelacionesDia.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_R , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoRelacionesDia.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoDiaActionPerformed(evt,true);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonModificarDia.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarDiaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonModificarToolBarDia.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarDiaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemModificarDia.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarDiaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ModificarDia";
		inputMap = this.jButtonModificarDia.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_M , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonModificarDia.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonModificarDiaActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonActualizarDia.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarDiaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonActualizarToolBarDia.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarDiaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemActualizarDia.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarDiaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ActualizarDia";
		inputMap = this.jButtonActualizarDia.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonActualizarDia.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonActualizarDiaActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonEliminarDia.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarDiaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonEliminarToolBarDia.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarDiaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
				
		this.jMenuItemEliminarDia.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarDiaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "EliminarDia";
		inputMap = this.jButtonEliminarDia.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_E , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonEliminarDia.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonEliminarDiaActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCancelarDia.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarDiaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCancelarToolBarDia.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarDiaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCancelarDia.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarDiaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CancelarDia";
		inputMap = this.jButtonCancelarDia.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_Q , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonCancelarDia.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCancelarDiaActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCerrarDia.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarDiaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCerrarToolBarDia.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarDiaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCerrarDia.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarDiaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemDetalleCerrarDia.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  //try {jButtonCerrarDiaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
					try {jButtonCancelarDiaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CerrarDia";
		inputMap = this.jButtonCerrarDia.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_C , KeyEvent.ALT_MASK), sMapKey);
			
		this.jButtonCerrarDia.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCerrarDiaActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jInternalFrameDetalleFormDia.jButtonGuardarCambiosDia.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosDiaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosToolBarDia.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosDiaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosDia.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosDiaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaDia.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosDiaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaToolBarDia.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosDiaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosTablaDia.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosDiaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "GuardarCambiosDia";
		inputMap = this.jInternalFrameDetalleFormDia.jButtonGuardarCambiosDia.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jInternalFrameDetalleFormDia.jButtonGuardarCambiosDia.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonGuardarCambiosDiaActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonRecargarInformacionDia.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionDiaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonRecargarInformacionToolBarDia.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionDiaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemRecargarInformacionDia.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionDiaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		this.jButtonAnterioresDia.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresDiaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAnterioresToolBarDia.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresDiaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemAnterioresDia.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresDiaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesDia.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesDiaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesToolBarDia.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesDiaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemSiguientesDia.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesDiaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosDia.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosDiaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosToolBarDia.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosDiaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoGuardarCambiosDia.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosDiaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		//SELECCIONAR TODOS
		this.jCheckBoxSeleccionarTodosDia.addItemListener(new ItemListener() {		
			public void itemStateChanged(ItemEvent evt) {
				try {jCheckBoxSeleccionarTodosDiaItemListener(evt);}catch(Exception e){e.printStackTrace();}
			}
		});

		this.jComboBoxTiposAccionesDia.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposAccionesDiaActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jComboBoxTiposSeleccionarDia.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposSeleccionarDiaActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jTextFieldValorCampoGeneralDia.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jTextFieldValorCampoGeneralDiaActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDia.jButtonidDiaBusqueda.addActionListener(new ButtonActionListener(this,"idDiaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDia.jButtonnombreDiaBusqueda.addActionListener(new ButtonActionListener(this,"nombreDiaBusqueda"));
		
		
		
		//REPORTE DINAMICO
		this.jButtonCerrarReporteDinamicoDia.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarReporteDinamicoDiaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarReporteDinamicoDia.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarReporteDinamicoDiaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarExcelReporteDinamicoDia.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarExcelReporteDinamicoDiaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		//IMPORTACION
		this.jButtonCerrarImportacionDia.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarImportacionDiaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarImportacionDia.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarImportacionDiaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAbrirImportacionDia.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAbrirImportacionDiaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
	}
	*/
	
	
	public void jComboBoxTiposSeleccionarDiaActionListener(ActionEvent evt) throws Exception {    		
		try {			
			Reporte reporte=(Reporte)this.jComboBoxTiposSeleccionarDia.getSelectedItem();
			
			//if(reporte.getsCodigo().equals("SELECCIONAR")) {
			//}					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DiaConstantesFunciones.CLASSNAME);
		}
	}	
	
	
	
	public void seleccionarTodosDia(Boolean conSeleccionarTodos) throws Exception {    		
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				for(Dia diaAux:this.diaLogic.getDias()) {
					diaAux.setIsSelected(conSeleccionarTodos);
				}			
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(Dia diaAux:dias) {
					diaAux.setIsSelected(conSeleccionarTodos);
				}
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DiaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarTodosDiaItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingDia(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			
			if(sTipoSeleccionar.equals("COLUMNAS")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(Dia diaAux:this.diaLogic.getDias()) {
						diaAux.setIsSelected(this.isSeleccionarTodos);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(Dia diaAux:dias) {
						diaAux.setIsSelected(this.isSeleccionarTodos);
					}
				}
			} else {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					for(Dia diaAux:this.diaLogic.getDias()) {
					
					}	
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(Dia diaAux:dias) {
						
					}
				}
			}
					
			if(existe) {
				this.inicializarActualizarBindingTablaDia(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosDia.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosDia.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosDia,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DiaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionadosDiaItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingDia(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			int[] arrNumRowsSeleccionados=null;
			
			arrNumRowsSeleccionados=this.jTableDatosDia.getSelectedRows();
			
			Dia diaLocal=new Dia();
			
			//this.seleccionarTodosDia(false);
			
			for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					diaLocal =(Dia) this.diaLogic.getDias().toArray()[this.jTableDatosDia.convertRowIndexToModel(iNumRowSeleccionado)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					diaLocal =(Dia) this.dias.toArray()[this.jTableDatosDia.convertRowIndexToModel(iNumRowSeleccionado)];
				}
				
				diaLocal.setIsSelected(this.isSeleccionados);
			}
			
			/*
			if(sTipoSeleccionar.equals("SELECCIONAR")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(Dia diaAux:this.diaLogic.getDias()) {
						diaAux.setIsSelected(this.isSeleccionados);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(Dia diaAux:dias) {
						diaAux.setIsSelected(this.isSeleccionados);
					}
				}
			}
			*/
			
			//if(existe) {
				this.inicializarActualizarBindingTablaDia(false);
			/*
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			*/
			
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosDia.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosDia.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosDia,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DiaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarActualDiaItemListener(ItemEvent evt,Long idActual) throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DiaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void ejecutarAuxiliarDiaParaAjaxPostBack() throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DiaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jTextFieldValorCampoGeneralDiaActionListener(ActionEvent evt) throws Exception {    		
		try {
			this.inicializarActualizarBindingDia(false,false);
			
			//System.out.println(this.jTextFieldValorCampoGeneralDia.getText());		
			
			Boolean existe=false;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(Dia diaAux:this.diaLogic.getDias()) {
				
						if(sTipoSeleccionar.equals(DiaConstantesFunciones.LABEL_NOMBRE)) {
							existe=true;
							diaAux.setnombre(this.sValorCampoGeneral);
						}
				}	
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(Dia diaAux:dias) {
					
						if(sTipoSeleccionar.equals(DiaConstantesFunciones.LABEL_NOMBRE)) {
							existe=true;
							diaAux.setnombre(this.sValorCampoGeneral);
						}
				}
			}
								
			if(existe) {
				this.inicializarActualizarBindingTablaDia(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DiaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jComboBoxTiposAccionesDiaActionListener(ActionEvent evt,Boolean esParaAccionDesdeFormulario) throws Exception {    				
		Boolean conSplash=true;
		
		try {							
		
			this.inicializarActualizarBindingDia(false,false);
			
			Reporte reporte=new Reporte();
			
			this.esParaAccionDesdeFormularioDia=esParaAccionDesdeFormulario;
			
			if(!esParaAccionDesdeFormulario) {
				
				reporte=(Reporte)this.jComboBoxTiposAccionesDia.getSelectedItem();
				
			} else {
				reporte=(Reporte)this.jInternalFrameDetalleFormDia.jComboBoxTiposAccionesFormularioDia.getSelectedItem();
			}
			String sTipoAccionLocal=this.sTipoAccion;
			
			if(!esParaAccionDesdeFormulario) {
				sTipoAccionLocal=this.sTipoAccion;
			} else {
				sTipoAccionLocal=this.sTipoAccionFormulario;
			}
			
			if(sTipoAccionLocal.equals("GENERAR REPORTE")) {//reporte.getsCodigo().equals("GENERAR REPORTE")) {
				if(this.isPermisoReporteDia) {				
					conSplash=true;//false;										
					
					//this.startProcessDia(conSplash);
				
					this.generarReporteDiasSeleccionados();
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesDia.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormDia.jComboBoxTiposAccionesFormularioDia.setSelectedIndex(0);					
				}
			} else if(sTipoAccionLocal.equals("GENERAR REPORTE DINAMICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.mostrarReporteDinamicoDiasSeleccionados();
				//this.jComboBoxTiposAccionesDia.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("GENERAR_REPORTE_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoDiasSeleccionados(false);
				//this.jComboBoxTiposAccionesDia.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("GENERAR_REPORTE_TOTALES_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoDiasSeleccionados(true);
				//this.jComboBoxTiposAccionesDia.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessDia();
				
				this.exportarDiasSeleccionados();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesDia.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormDia.jComboBoxTiposAccionesFormularioDia.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("IMPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				this.mostrarImportacionDias();
				//this.importarDias();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesDia.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormDia.jComboBoxTiposAccionesFormularioDia.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS_EXCEL")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessDia();
				//SE EXPORTA SEGUN TIPO ARCHIVO SELECCIONADO
				//this.exportarExcelDiasSeleccionados();
				//this.jComboBoxTiposAccionesDia.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("RECARGAR_FK")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {								
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE RECARGAR REFERENCIAS ?", "MANTENIMIENTO DE Dia", JOptionPane.OK_CANCEL_OPTION) == 0) {
				
				//this.startProcessDia();
				
					if(!esParaAccionDesdeFormulario || (esParaAccionDesdeFormulario && this.isEsNuevoDia)) {
						this.esRecargarFks=true;
						this.cargarCombosForeignKeyDia(false,false,false);
						this.esRecargarFks=false;
						
						JOptionPane.showMessageDialog(this,"PROCESO EJECUTADO CORRECTAMENTE","MANTENIMIENTO DE Dia",JOptionPane.INFORMATION_MESSAGE);
					} else {
						JOptionPane.showMessageDialog(this,"ESTE PROCESO SOLO FUNCIONA AL INGRESAR UN NUEVO ELEMENTO","MANTENIMIENTO",JOptionPane.ERROR_MESSAGE);	
					}
					
					
				}
				
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesDia.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormDia.jComboBoxTiposAccionesFormularioDia.setSelectedIndex(0);					
				}	
			} 			
			else {
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					this.actualizarParametrosGeneralDia();
					
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}
			}
		} catch(Exception e) {
			this.esRecargarFks=false;
			
			FuncionesSwing.manageException(this, e,logger,DiaConstantesFunciones.CLASSNAME);
		
		}  finally {
      		//this.finishProcessDia(conSplash);
      	}
	}
	
	public void jComboBoxTiposRelacionesDiaActionListener(ActionEvent evt) throws Exception {    				
		Boolean conSplash=true;
		
		try {			
			this.startProcessDia();
			
			if(this.jInternalFrameDetalleFormDia==null) { //if(!this.conCargarFormDetalle) {			
				this.inicializarFormDetalle();
			}
			
			ArrayList<Dia> diasSeleccionados=new ArrayList<Dia>();		
			Dia dia=new Dia();
			
			int rowIndex=-1;//CON ESTO SE DESHABILITA SELECCION POR INDICE
			
			this.inicializarActualizarBindingDia(false,false);
			
			Reporte reporte=new Reporte();
			
			
			reporte=(Reporte)this.jComboBoxTiposRelacionesDia.getSelectedItem();
			
			
			
			
			diasSeleccionados=this.getDiasSeleccionados(true);
			//this.sTipoAccion;
			
			if(diasSeleccionados.size()==1) {
				for(Dia diaAux:diasSeleccionados) {
					dia=diaAux;
				}
				
				if(this.sTipoAccion.equals("NONE")) {
				
				}
				
			} else {
				JOptionPane.showMessageDialog(this,"SELECCIONE SOLO UN REGISTRO","RELACIONES",JOptionPane.ERROR_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DiaConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.finishProcessDia();
			
      		//this.finishProcessDia(conSplash);
      	}
	}
			
	public static Boolean EsProcesoReporte(String sTipoProceso) throws Exception {
		Boolean esProcesoAccionRepoorte=false;

		if(sTipoProceso.contains("REPORTE_")) {
			 esProcesoAccionRepoorte=true;
		}

		return esProcesoAccionRepoorte;
	}
	
	public void procesarDiaReturnGeneral() throws Exception {
		if(this.diaReturnGeneral.getConRetornoEstaProcesado()) {
			JOptionPane.showMessageDialog(this,this.diaReturnGeneral.getsMensajeProceso(),"PROCESO",JOptionPane.INFORMATION_MESSAGE);
		}
		
		if(this.diaReturnGeneral.getConMostrarMensaje()) {
			JOptionPane.showMessageDialog(this,this.diaReturnGeneral.getsMensajeProceso(),"PROCESO",FuncionesSwing.getColorSelectedBackground(this.diaReturnGeneral.getsTipoMensaje()));
		}
		
		if(this.diaReturnGeneral.getConRecargarInformacion()) {
			this.procesarBusqueda(this.sAccionBusqueda);
			
			this.inicializarActualizarBindingDia(false);
		}
		
		if(this.diaReturnGeneral.getConRetornoLista() || this.diaReturnGeneral.getConRetornoObjeto()) {
			if(this.diaReturnGeneral.getConRetornoLista()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.diaLogic.setDias(this.diaReturnGeneral.getDias());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			if(this.diaReturnGeneral.getConRetornoObjeto()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.diaLogic.setDia(this.diaReturnGeneral.getDia());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			this.inicializarActualizarBindingDia(false);
		}
	}
	
	public void actualizarParametrosGeneralDia() throws Exception {
		
		
	}
	
	public ArrayList<Dia> getDiasSeleccionados(Boolean conSeleccionarTodosAutomatico) throws Exception {
		ArrayList<Dia> diasSeleccionados=new ArrayList<Dia>();
		Boolean existe=false;
		
		if(!this.esParaAccionDesdeFormularioDia) {
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				
				for(Dia diaAux:diaLogic.getDias()) {
					if(diaAux.getIsSelected()) {
						diasSeleccionados.add(diaAux);				
					}
				}
				
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(Dia diaAux:this.dias) {
					if(diaAux.getIsSelected()) {
						diasSeleccionados.add(diaAux);				
					}
				}
			}
			
			if(diasSeleccionados.size()>0) {
				existe=true;
			}
			
			//SI NO ESTA NINGUNO SELECCIONADO SE SELECCIONA TODOS
			if(!existe) {
				if(conSeleccionarTodosAutomatico) {
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						diasSeleccionados.addAll(this.diaLogic.getDias());
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						diasSeleccionados.addAll(this.dias);				
					}
				}
			}
		} else {
			diasSeleccionados.add(this.dia);
		}
		
		return diasSeleccionados;
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
	
	public void generarReporteDiasSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoReporte.equals("NORMAL") || this.sTipoReporte.equals("FORMULARIO")) {
			existe=true;								
			this.generarReporteNormalDiasSeleccionados();
			
		} else if(this.sTipoReporte.equals("DINAMICO")) {
			existe=true;
			this.mostrarReporteDinamicoDiasSeleccionados();
			
		} else if(this.sTipoReporte.equals("GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoDiasSeleccionados(false);
			
		} else if(this.sTipoReporte.equals("TOTALES_GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoDiasSeleccionados(true);
		}
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE REPORTE VALIDO","REPORTE DE Dia",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void generarReporteRelacionesDiasSeleccionados() throws Exception {
		ArrayList<Dia> diasSeleccionados=new ArrayList<Dia>();		
		
		diasSeleccionados=this.getDiasSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
					
		//this.sTipoReporteExtra="MasterRelaciones";
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		
		this.generarReporteDias("Todos",diasSeleccionados);
		
	}	
	
	public void generarReporteNormalDiasSeleccionados() throws Exception {
		ArrayList<Dia> diasSeleccionados=new ArrayList<Dia>();		
		
		diasSeleccionados=this.getDiasSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
								
		if(this.sTipoReporte.equals("FORMULARIO")) {
			this.sTipoReporteExtra="Vertical";					
		}
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.generarReporteDias("Todos",diasSeleccionados);
	}		
	
	public void generarReporteProcesoAccionDiasSeleccionados(String sProcesoReporte) throws Exception {
		ArrayList<Dia> diasSeleccionados=new ArrayList<Dia>();
		
		diasSeleccionados=this.getDiasSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(false,false,true,"");
		
		/*
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.sTipoReporteExtra=sProcesoReporte.toLowerCase();
		
		this.esReporteAccionProceso=true;
		this.generarReporteDias("Todos",diasSeleccionados);
		this.esReporteAccionProceso=false;
	}
	
	
	public void mostrarReporteDinamicoDiasSeleccionados() throws Exception {
		ArrayList<Dia> diasSeleccionados=new ArrayList<Dia>();		
		
		
		this.abrirInicializarFrameReporteDinamicoDia();
		
		
		diasSeleccionados=this.getDiasSeleccionados(true);
		
		this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirFrameReporteDinamicoDia();
		
		
		//this.generarReporteDias("Todos",diasSeleccionados ,diaImplementable,diaImplementableHome);
	}
	
	public void mostrarImportacionDias() throws Exception {
		//this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirInicializarFrameImportacionDia();
		
		this.abrirFrameImportacionDia();		
		
			
		//this.generarReporteDias("Todos",diasSeleccionados ,diaImplementable,diaImplementableHome);
	}
	
	public void importarDias() throws Exception {		
	
	}
	
	public void exportarDiasSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoArchivoReporte.equals("EXCEL")) {
			existe=true;
			this.exportarExcelDiasSeleccionados();
			
		} else if(this.sTipoArchivoReporte.equals("TEXTO")) {
			existe=true;
			this.exportarTextoDiasSeleccionados();
		
		} else if(this.sTipoArchivoReporte.equals("XML")) {
			existe=true;
			this.exportarXmlDiasSeleccionados();
		} 
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE ARCHIVO VALIDO","EXPORTACION DE Dia",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void exportarTextoDiasSeleccionados() throws Exception {
		ArrayList<Dia> diasSeleccionados=new ArrayList<Dia>();		
		
		diasSeleccionados=this.getDiasSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"dia."+"txt";//Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario);
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		BufferedWriter bufferedWriter = null;
		FileWriter fileWriter=null;
		
		fileWriter=new FileWriter(sPath);
		
		bufferedWriter = new BufferedWriter(fileWriter);
		
		try {
			if(conCabecera) {
				sFilaCabecera=this.getFilaCabeceraExportarDia(sDelimiter);
				
				bufferedWriter.write(sFilaCabecera);
			}				
			
			for(Dia diaAux:diasSeleccionados) {
				sFilaDatos=this.getFilaDatosExportarDia(diaAux,sDelimiter);
				
				bufferedWriter.write(sFilaDatos);
				
				//diaAux.setsDetalleGeneralEntityReporte(diaAux.toString());			
			}
			
			bufferedWriter.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.diaSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Dia",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {
       		if (bufferedWriter != null) {
				bufferedWriter.close();
			}
		}
	}
	
	public String getFilaCabeceraExportarDia(String sDelimiter) {
		String sFilaCabecera="";
		
		
		sFilaCabecera+=DiaConstantesFunciones.LABEL_ID;

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaCabecera+=sDelimiter;
		sFilaCabecera+=DiaConstantesFunciones.LABEL_VERSIONROW;
		}

		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=DiaConstantesFunciones.LABEL_NOMBRE;
		
		return sFilaCabecera;
	}
	
	public String getFilaDatosExportarDia(Dia dia,String sDelimiter) {
		String sFilaDatos="";
		
		sFilaDatos+="\r\n";
		
		
		sFilaDatos+=dia.getId().toString();

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaDatos+=sDelimiter;
		sFilaDatos+=dia.getVersionRow().toString();
		}

		sFilaDatos+=sDelimiter;
		sFilaDatos+=dia.getnombre();
		
		return sFilaDatos;
	}
	
	//@SuppressWarnings("deprecation")
	public void exportarExcelDiasSeleccionados() throws Exception {
		ArrayList<Dia> diasSeleccionados=new ArrayList<Dia>();		
		
		diasSeleccionados=this.getDiasSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"dia.xls";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		FileOutputStream fileOutputStream=null;
		
		try {
			HSSFWorkbook workbook = new HSSFWorkbook();
			HSSFSheet sheet = workbook.createSheet("Dias");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			HSSFRow row = sheet.createRow(iRow);
			HSSFCell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");

			if(conCabecera) {
				this.getFilaCabeceraExportarExcelDia(row);				
				iRow++;
			}				
			
			for(Dia diaAux:diasSeleccionados) {
				row = sheet.createRow(iRow);
				
				this.getFilaDatosExportarExcelDia(diaAux,row);
				
				iRow++;
			}
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.diaSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Dia",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			
       		if (fileOutputStream != null) {
				fileOutputStream.close();
			}			
		}
	}		
	
	public void exportarXmlDiasSeleccionados() throws Exception {
		ArrayList<Dia> diasSeleccionados=new ArrayList<Dia>();		
		
		diasSeleccionados=this.getDiasSeleccionados(true);
		
		//String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		//Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		//String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"dia.xml";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		DocumentBuilderFactory documentBuilderFactory=null;
		DocumentBuilder documentBuilder =null;
		
		try {
			documentBuilderFactory = DocumentBuilderFactory.newInstance();
			documentBuilder = documentBuilderFactory.newDocumentBuilder();
	
			Document document = documentBuilder.newDocument();
			Element elementRoot = document.createElement("dias");
			
			document.appendChild(elementRoot);
		    			
												
			Element element = null;//document.createElement("dia");
			//elementRoot.appendChild(element);
		
			for(Dia diaAux:diasSeleccionados) {
				element = document.createElement("dia");
				elementRoot.appendChild(element);
			
				this.setFilaDatosExportarXmlDia(diaAux,document,element);
			}
			
			TransformerFactory transformerFactory = TransformerFactory.newInstance();
			Transformer transformer = transformerFactory.newTransformer();
			DOMSource domSource = new DOMSource(document);
			
			StreamResult streamResult = new StreamResult(new File(sPath));
	
			transformer.transform(domSource, streamResult);
						
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.diaSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Dia",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			       				
		}
	}	
	
	//@SuppressWarnings("deprecation")
	public void getFilaCabeceraExportarExcelDia(HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(DiaConstantesFunciones.LABEL_ID);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
		cell = row.createCell(iColumn++);cell.setCellValue(DiaConstantesFunciones.LABEL_VERSIONROW);
		}

		cell = row.createCell(iColumn++);cell.setCellValue(DiaConstantesFunciones.LABEL_NOMBRE);
	}
	
	//@SuppressWarnings("deprecation")
	public void getFilaDatosExportarExcelDia(Dia dia,HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(dia.getId());
		cell = row.createCell(iColumn++);cell.setCellValue(dia.getnombre());				
	}
	
	public void setFilaDatosExportarXmlDia(Dia dia,Document document,Element element) {
		/*
		Element lastname = document.createElement("lastname");
		lastname.appendChild(document.createTextNode("mook kim"));
		element.appendChild(lastname);
		*/
		

		Element elementId = document.createElement(DiaConstantesFunciones.ID);
		elementId.appendChild(document.createTextNode(dia.getId().toString().trim()));
		element.appendChild(elementId);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){

		Element elementVersionRow = document.createElement(DiaConstantesFunciones.VERSIONROW);
		elementVersionRow.appendChild(document.createTextNode(dia.getVersionRow().toString().trim()));
		element.appendChild(elementVersionRow);
		}


		Element elementnombre = document.createElement(DiaConstantesFunciones.NOMBRE);
		elementnombre.appendChild(document.createTextNode(dia.getnombre().trim()));
		element.appendChild(elementnombre);
	}
	
	public void generarReporteGroupGenericoDiasSeleccionados(Boolean soloTotales) throws Exception {
		ArrayList<Dia> diasSeleccionados=new ArrayList<Dia>();
		
		diasSeleccionados=this.getDiasSeleccionados(true);
		
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
		
		this.setColumnaDescripcionReporteGroupGenericoDia(diasSeleccionados);
		
		this.generarReporteDias("Todos",diasSeleccionados);
	}
	
	public void setColumnaDescripcionReporteGroupGenericoDia(ArrayList<Dia> diasSeleccionados) throws Exception {    		
		try {
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			
			Boolean existe=false;
			
			for(Dia diaAux:diasSeleccionados) {
				diaAux.setsDetalleGeneralEntityReporte(diaAux.toString());
			
				if(sTipoSeleccionar.equals(DiaConstantesFunciones.LABEL_NOMBRE)) {
					existe=true;
					diaAux.setsDescripcionGeneralEntityReporte1(diaAux.getnombre());
				}
			}	
											
			if(!existe) {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}										
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DiaConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void actualizarEstadoCeldasBotonesDia(String sAccion,Boolean isGuardarCambiosEnLote,Boolean isEsMantenimientoRelacionado) throws Exception {
		if(sAccion=="n") {
			if(!this.esParaBusquedaForeignKey) {
				this.isVisibilidadCeldaNuevoDia=true;
				this.isVisibilidadCeldaNuevoRelacionesDia=true;
				this.isVisibilidadCeldaGuardarCambiosDia=true;
			}
			
			this.isVisibilidadCeldaModificarDia=false;
			this.isVisibilidadCeldaActualizarDia=false;
			this.isVisibilidadCeldaEliminarDia=false;
			this.isVisibilidadCeldaCancelarDia=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarDia=true;
				} else {
					this.isVisibilidadCeldaGuardarDia=false;
				}
			}
		} else if(sAccion=="a") {
			this.isVisibilidadCeldaNuevoDia=false;
			this.isVisibilidadCeldaNuevoRelacionesDia=false;
			this.isVisibilidadCeldaGuardarCambiosDia=false;
			this.isVisibilidadCeldaModificarDia=false;
			this.isVisibilidadCeldaActualizarDia=true;
			this.isVisibilidadCeldaEliminarDia=false;
			this.isVisibilidadCeldaCancelarDia=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarDia=true;
				} else {
					this.isVisibilidadCeldaGuardarDia=false;
				}
			}
		} else if(sAccion=="ae") {
			this.isVisibilidadCeldaNuevoDia=false;
			this.isVisibilidadCeldaNuevoRelacionesDia=false;
			this.isVisibilidadCeldaGuardarCambiosDia=false;
			this.isVisibilidadCeldaModificarDia=false;
			this.isVisibilidadCeldaActualizarDia=true;
			this.isVisibilidadCeldaEliminarDia=true;
			this.isVisibilidadCeldaCancelarDia=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarDia=true;
				} else {
					this.isVisibilidadCeldaGuardarDia=false;
				}
			}
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {
			this.isVisibilidadCeldaNuevoDia=false;
			this.isVisibilidadCeldaNuevoRelacionesDia=false;
			this.isVisibilidadCeldaGuardarCambiosDia=false;
			this.isVisibilidadCeldaModificarDia=false;
			this.isVisibilidadCeldaActualizarDia=true;
			this.isVisibilidadCeldaEliminarDia=false;
			this.isVisibilidadCeldaCancelarDia=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarDia=false;
				} else {
					this.isVisibilidadCeldaGuardarDia=false;
				}
			}
		} else if(sAccion=="c") {
			this.isVisibilidadCeldaNuevoDia=true;
			this.isVisibilidadCeldaNuevoRelacionesDia=true;
			this.isVisibilidadCeldaGuardarCambiosDia=true;
			this.isVisibilidadCeldaModificarDia=false;
			this.isVisibilidadCeldaActualizarDia=false;
			this.isVisibilidadCeldaEliminarDia=false;
			this.isVisibilidadCeldaCancelarDia=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarDia=true;
				} else {
					this.isVisibilidadCeldaGuardarDia=false;
				}
			}
		} else if(sAccion=="t") {
			this.isVisibilidadCeldaNuevoDia=false;
			this.isVisibilidadCeldaNuevoRelacionesDia=false;
			this.isVisibilidadCeldaGuardarCambiosDia=false;
			this.isVisibilidadCeldaActualizarDia=false;
			this.isVisibilidadCeldaEliminarDia=false;
			this.isVisibilidadCeldaCancelarDia=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarDia=false;
				} else {
					this.isVisibilidadCeldaGuardarDia=false;
				}
			}
		}  else if(sAccion=="s"||sAccion=="s2") {
			this.isVisibilidadCeldaNuevoDia=false;
			this.isVisibilidadCeldaNuevoRelacionesDia=false;
			this.isVisibilidadCeldaGuardarCambiosDia=false;
			this.isVisibilidadCeldaModificarDia=true;
			this.isVisibilidadCeldaActualizarDia=false;
			this.isVisibilidadCeldaEliminarDia=false;
			this.isVisibilidadCeldaCancelarDia=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarDia=false;
				} else {
					this.isVisibilidadCeldaGuardarDia=false;
				}
			}
		}
		
		//ACTUALIZA VISIBILIDAD PANELES
		if(DiaJInternalFrame.CON_DATOS_FRAME && !this.esParaBusquedaForeignKey) {
			//SIEMPRE VISIBLE
			this.isVisibilidadCeldaNuevoDia=true;
			this.isVisibilidadCeldaNuevoRelacionesDia=true;
			this.isVisibilidadCeldaGuardarCambiosDia=true;
		} else {
			this.actualizarEstadoPanelsDia(sAccion);						
		}
		
		if(this.esParaBusquedaForeignKey) {
			this.isVisibilidadCeldaCopiarDia=false;
			//this.isVisibilidadCeldaVerFormDia=false;
			this.isVisibilidadCeldaDuplicarDia=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONES
		if(!diaSessionBean.getConGuardarRelaciones()) {
			this.isVisibilidadCeldaNuevoRelacionesDia=false;
		} else {
			this.isVisibilidadCeldaNuevoDia=false;
			this.isVisibilidadCeldaGuardarCambiosDia=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONADO
		if(diaSessionBean.getEsGuardarRelacionado()) {
			if(!diaSessionBean.getConGuardarRelaciones()) {	
				this.isVisibilidadCeldaNuevoRelacionesDia=false;												
			}
			
			this.jButtonCerrarDia.setVisible(false);
		}
		
		//SI NO TIENE MAXIMO DE RELACIONES PERMITIDAS
		if(!this.conMaximoRelaciones) {
			this.isVisibilidadCeldaNuevoRelacionesDia=false;
		}
		
		if(!this.permiteMantenimiento(this.dia)) {
			this.isVisibilidadCeldaActualizarDia=false;
			this.isVisibilidadCeldaEliminarDia=false;
		}
		
		
		
	}
	
	public void actualizarEstadoCeldasBotonesConGuardarRelacionesDia() {
	}
	
	public void actualizarEstadoPanelsDia(String sAccion) {
		if(sAccion=="n") {
			if(this.jScrollPanelDatosEdicionDia!=null) {
				this.jScrollPanelDatosEdicionDia.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosDia!=null) {
				this.jScrollPanelDatosDia.setVisible(true);
			}
			
			if(this.jPanelPaginacionDia!=null) {
				this.jPanelPaginacionDia.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesDia!=null) {
				this.jPanelParametrosReportesDia.setVisible(true);		    
			}
			
		} else if(sAccion=="a") {				
			if(this.jScrollPanelDatosEdicionDia!=null) {
				this.jScrollPanelDatosEdicionDia.setVisible(true);			
			}
			
			
			
			if(this.jScrollPanelDatosDia!=null) {
				this.jScrollPanelDatosDia.setVisible(false);
			}
			
			if(this.jPanelPaginacionDia!=null) {
				this.jPanelPaginacionDia.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesDia!=null) {
				this.jPanelParametrosReportesDia.setVisible(false);
			}
						
		} else if(sAccion=="ae") {		
			if(this.jScrollPanelDatosEdicionDia!=null) {
				this.jScrollPanelDatosEdicionDia.setVisible(true);		
			}
			
			
			if(this.jScrollPanelDatosDia!=null) {
				this.jScrollPanelDatosDia.setVisible(false);
			}
			
			if(this.jPanelPaginacionDia!=null) {
				this.jPanelPaginacionDia.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesDia!=null) {
				this.jPanelParametrosReportesDia.setVisible(false);
			}
						
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {	
			if(this.jScrollPanelDatosEdicionDia!=null) {
				this.jScrollPanelDatosEdicionDia.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosDia!=null) {
				this.jScrollPanelDatosDia.setVisible(false);
			}
			
			if(this.jPanelPaginacionDia!=null) {
				this.jPanelPaginacionDia.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesDia!=null) {
				this.jPanelParametrosReportesDia.setVisible(false);
			}
						
		} else if(sAccion=="c") {	
			if(this.jScrollPanelDatosEdicionDia!=null) {
				this.jScrollPanelDatosEdicionDia.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosDia!=null) {
				this.jScrollPanelDatosDia.setVisible(true);
			}
			
			if(this.jPanelPaginacionDia!=null) {
				this.jPanelPaginacionDia.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesDia!=null) {
				this.jPanelParametrosReportesDia.setVisible(true);
			}
						
		} else if(sAccion=="t") {
			
			if(this.jScrollPanelDatosEdicionDia!=null) {
				this.jScrollPanelDatosEdicionDia.setVisible(false);
			}
			
			
			if(this.jScrollPanelDatosDia!=null) {
				this.jScrollPanelDatosDia.setVisible(true);
			}
			
			if(this.jPanelPaginacionDia!=null) {
				this.jPanelPaginacionDia.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesDia!=null) {
				this.jPanelParametrosReportesDia.setVisible(true);
			}
						
		}  else if(sAccion=="s"||sAccion=="s2") {
			if(this.jScrollPanelDatosEdicionDia!=null) {
				this.jScrollPanelDatosEdicionDia.setVisible(false);
			}
			
			
			if(this.jScrollPanelDatosDia!=null) {
				this.jScrollPanelDatosDia.setVisible(true);
			}
			
			if(this.jPanelPaginacionDia!=null) {
				this.jPanelPaginacionDia.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesDia!=null) {
				this.jPanelParametrosReportesDia.setVisible(true);
			}
			
		} 
		
		if(sAccion.equals("relacionado") || this.diaSessionBean.getEsGuardarRelacionado()) {
		
		} else if(sAccion.equals("no_relacionado") && !this.diaSessionBean.getEsGuardarRelacionado()) {
		}
	}	
	
	
	
	
	
	
	
	
	public void guardarDatosBusquedaSession() throws Exception {
		
		//DiaSessionBean diaSessionBean=new DiaSessionBean();
		
		if(this.diaSessionBean==null) {
			this.diaSessionBean=new DiaSessionBean();
		}
		
		this.diaSessionBean.setsUltimaBusquedaDia(this.getsAccionBusqueda());
		this.diaSessionBean.setiNumeroPaginacion(this.getiNumeroPaginacion());
		this.diaSessionBean.setiNumeroPaginacionPagina(this.getiNumeroPaginacionPagina());
		
		if(this.getsAccionBusqueda().equals("Todos")) {
			;
		}
		

		
	}
	
	public void traerDatosBusquedaDesdeSession() throws Exception {
		//DiaSessionBean diaSessionBean=new DiaSessionBean();
		
		if(this.diaSessionBean==null) {
			this.diaSessionBean=new DiaSessionBean();
		}
		
		if(this.diaSessionBean.getsUltimaBusquedaDia()!=null&&!this.diaSessionBean.getsUltimaBusquedaDia().equals("")) {
			this.setsAccionBusqueda(diaSessionBean.getsUltimaBusquedaDia());
			this.setiNumeroPaginacion(diaSessionBean.getiNumeroPaginacion());
			this.setiNumeroPaginacionPagina(diaSessionBean.getiNumeroPaginacionPagina());		
				
			if(this.getsAccionBusqueda().equals("Todos")) {
				;
			}
			

		}
		
		this.diaSessionBean.setsUltimaBusquedaDia("");
		this.diaSessionBean.setiNumeroPaginacion(DiaConstantesFunciones.INUMEROPAGINACION);
		this.diaSessionBean.setiNumeroPaginacionPagina(0);
		
	}
	
	public void procesoActualizarFilaTotales(Boolean esCampoValor,String sTipo) {
		try {
			this.actualizarFilaTotales();
				
			this.traerValoresTablaTotales();
			
			this.inicializarActualizarBindingTablaDia(false);
			
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	public void updateBusquedasFormularioDia() {
		this.updateBorderResaltarBusquedasFormularioDia();
		this.updateVisibilidadBusquedasFormularioDia();
		this.updateHabilitarBusquedasFormularioDia();
	}
	
	public void updateBorderResaltarBusquedasFormularioDia() {					
	}
	
	public void updateVisibilidadBusquedasFormularioDia() {
	}
	
	public void updateHabilitarBusquedasFormularioDia() {
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
	
	public void updateControlesFormularioDia() throws Exception {

		if(this.jInternalFrameDetalleFormDia==null) { //if(!this.conCargarFormDetalle) {			
			this.inicializarFormDetalle();
		}
		
		this.updateBorderResaltarControlesFormularioDia();
		this.updateVisibilidadResaltarControlesFormularioDia();
		this.updateHabilitarResaltarControlesFormularioDia();
		
	}
	
	public void updateBorderResaltarControlesFormularioDia() throws Exception {
		if(this.jInternalFrameDetalleFormDia==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
	
		if(this.diaConstantesFunciones.resaltaridDia!=null && this.jInternalFrameDetalleFormDia!=null) {this.jInternalFrameDetalleFormDia.jTextFieldidDia.setBorder(this.diaConstantesFunciones.resaltaridDia);}
		if(this.diaConstantesFunciones.resaltarnombreDia!=null && this.jInternalFrameDetalleFormDia!=null) {this.jInternalFrameDetalleFormDia.jTextFieldnombreDia.setBorder(this.diaConstantesFunciones.resaltarnombreDia);}
	}
	
	public void updateVisibilidadResaltarControlesFormularioDia() throws Exception {		
		if(this.jInternalFrameDetalleFormDia==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormDia!=null) {
	
		//this.jInternalFrameDetalleFormDia.jTextFieldidDia.setVisible(this.diaConstantesFunciones.mostraridDia);
		this.jInternalFrameDetalleFormDia.jPanelidDia.setVisible(this.diaConstantesFunciones.mostraridDia);
		//this.jInternalFrameDetalleFormDia.jTextFieldnombreDia.setVisible(this.diaConstantesFunciones.mostrarnombreDia);
		this.jInternalFrameDetalleFormDia.jPanelnombreDia.setVisible(this.diaConstantesFunciones.mostrarnombreDia);
		}
	}
	
	public void updateHabilitarResaltarControlesFormularioDia() throws Exception {
		if(this.jInternalFrameDetalleFormDia==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormDia!=null) {
	
		this.jInternalFrameDetalleFormDia.jTextFieldidDia.setEnabled(this.diaConstantesFunciones.activaridDia);
		this.jInternalFrameDetalleFormDia.jTextFieldnombreDia.setEnabled(this.diaConstantesFunciones.activarnombreDia);
		}
	}
	
		
}