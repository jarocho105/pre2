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
package com.bydan.erp.inventario.presentation.swing.jinternalframes;




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

import com.bydan.erp.inventario.util.TipoAutoriConsepConstantesFunciones;
import com.bydan.erp.inventario.util.TipoAutoriConsepParameterReturnGeneral;
//import com.bydan.erp.inventario.util.TipoAutoriConsepParameterGeneral;
//import com.bydan.erp.inventario.presentation.report.source.TipoAutoriConsepBean;
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

import com.bydan.erp.inventario.presentation.swing.jinternalframes.auxiliar.*;
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
import com.bydan.erp.inventario.resources.reportes.AuxiliarReportes;


import com.bydan.erp.inventario.util.*;
import com.bydan.erp.inventario.business.logic.*;

import com.bydan.erp.seguridad.business.logic.*;
import com.bydan.erp.cartera.business.logic.*;
import com.bydan.erp.nomina.business.logic.*;

//EJB

//PARAMETROS


//EJB PARAMETROS

import com.bydan.framework.erp.business.logic.*;
import com.bydan.framework.erp.util.*;

import com.bydan.erp.inventario.business.entity.*;
//import com.bydan.framework.erp.business.entity.ConexionBeanFace;
//import com.bydan.framework.erp.business.entity.Mensajes;


import com.bydan.erp.seguridad.presentation.swing.jinternalframes.*;
import com.bydan.erp.cartera.presentation.swing.jinternalframes.*;
import com.bydan.erp.nomina.presentation.swing.jinternalframes.*;

import com.bydan.erp.seguridad.presentation.swing.jinternalframes.auxiliar.*;
import com.bydan.erp.cartera.presentation.swing.jinternalframes.auxiliar.*;
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


import com.bydan.erp.inventario.presentation.web.jsf.sessionbean.*;

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
import com.bydan.erp.cartera.business.entity.*;
import com.bydan.erp.nomina.business.entity.*;
import com.bydan.erp.seguridad.util.*;
import com.bydan.erp.cartera.util.*;
import com.bydan.erp.nomina.util.*;
import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.cartera.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.nomina.presentation.web.jsf.sessionbean.*;


@SuppressWarnings("unused")
public class TipoAutoriConsepBeanSwingJInternalFrame extends TipoAutoriConsepJInternalFrame implements WindowListener,WindowFocusListener
{				
	
	public static final long serialVersionUID = 1L;
	
	public static Logger logger = Logger.getLogger(TipoAutoriConsepBeanSwingJInternalFrame.class);  
	
	public static ClassValidator<TipoAutoriConsep> tipoautoriconsepValidator = new ClassValidator<TipoAutoriConsep>(TipoAutoriConsep.class);
	
	public InvalidValue[] invalidValues=null;
		

	//Ejb Foreign Keys
	
	public TipoAutoriConsep tipoautoriconsep;	
	public TipoAutoriConsep tipoautoriconsepAux;
	public TipoAutoriConsep tipoautoriconsepAnterior;//USADO PARA MANEJAR FOCUS GAINED,LOST
	public TipoAutoriConsep tipoautoriconsepTotales;
	public Long idTipoAutoriConsepActual;
	public Long iIdNuevoTipoAutoriConsep=0L;
	public int rowIndexActual=0;
	
	
	
	
		
	
	
	
	
	

	public Boolean isTienePermisosAutoriConsep=false;

	public Boolean getIsTienePermisosAutoriConsep() {
		return isTienePermisosAutoriConsep;
	}

	public void setIsTienePermisosAutoriConsep(Boolean isTienePermisosAutoriConsep) {
		this.isTienePermisosAutoriConsep= isTienePermisosAutoriConsep;
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
	
	public Boolean isPermisoTodoTipoAutoriConsep;
	public Boolean isPermisoNuevoTipoAutoriConsep;
	public Boolean isPermisoActualizarTipoAutoriConsep;
	public Boolean isPermisoActualizarOriginalTipoAutoriConsep;
	public Boolean isPermisoEliminarTipoAutoriConsep;
	public Boolean isPermisoGuardarCambiosTipoAutoriConsep;
	public Boolean isPermisoConsultaTipoAutoriConsep;
	public Boolean isPermisoBusquedaTipoAutoriConsep;
	public Boolean isPermisoReporteTipoAutoriConsep;
	public Boolean isPermisoPaginacionMedioTipoAutoriConsep;
	public Boolean isPermisoPaginacionAltoTipoAutoriConsep;
	public Boolean isPermisoPaginacionTodoTipoAutoriConsep;
	public Boolean isPermisoCopiarTipoAutoriConsep;
	public Boolean isPermisoVerFormTipoAutoriConsep;
	public Boolean isPermisoDuplicarTipoAutoriConsep;
	public Boolean isPermisoOrdenTipoAutoriConsep;
	
	
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
	
	public TipoAutoriConsepParameterReturnGeneral tipoautoriconsepReturnGeneral;
	public TipoAutoriConsepParameterReturnGeneral tipoautoriconsepParameterGeneral;
	
	

	public AutoriConsepLogic autoriconsepLogic=null;

	public AutoriConsepLogic getAutoriConsepLogic() {
		return autoriconsepLogic;
	}

	public void setAutoriConsepLogic(AutoriConsepLogic autoriconsepLogic) {
		this.autoriconsepLogic = autoriconsepLogic;
	}
 	
	public JasperPrint jasperPrint = null;
	
	public Long lIdUsuarioSesion=0L;				
	
	public Boolean isEsNuevoTipoAutoriConsep=false;
	public Boolean esParaAccionDesdeFormularioTipoAutoriConsep=false;
	public Boolean isEsMantenimientoRelacionesRelacionadoUnico=false;
	public Boolean isEsMantenimientoRelaciones=false;
	public Boolean isEsMantenimientoRelacionado=false;	
	public Boolean isContieneImagenes=false;
		
	//public Boolean conTotales=false; //Viene heredado de JInternalFrameBase
	//public Boolean esParaBusquedaForeignKey=false;
	
	
	
	
	//ESTA EN PADRE
	
	//public TipoAutoriConsepLogic tipoautoriconsepLogic;
	public SistemaLogicAdditional sistemaLogicAdditional;
	
	
	public TipoAutoriConsep tipoautoriconsepBean;
	public TipoAutoriConsepConstantesFunciones tipoautoriconsepConstantesFunciones;
	//public TipoAutoriConsepParameterReturnGeneral tipoautoriconsepReturnGeneral;
	
	//FK
	
	
	//PARAMETROS
	
	
	//public List<TipoAutoriConsep> tipoautoriconseps;	
	//public List<TipoAutoriConsep> tipoautoriconsepsEliminados;
	//public List<TipoAutoriConsep> tipoautoriconsepsAux;
	
	public String sAccionMantenimiento="";
	public String sAccionBusqueda="";
	public String sAccionAdicional="";
	public String sUltimaBusqueda="";
	
	public Mensaje mensaje;
	
	
	public String sVisibilidadTablaBusquedas="";					
	public String sVisibilidadTablaElementos="";	
	public String sVisibilidadTablaAcciones="";			
	
	public Boolean isVisibilidadCeldaNuevoTipoAutoriConsep=false;
	public Boolean isVisibilidadCeldaDuplicarTipoAutoriConsep=true;
	public Boolean isVisibilidadCeldaCopiarTipoAutoriConsep=true;
	public Boolean isVisibilidadCeldaVerFormTipoAutoriConsep=true;
	public Boolean isVisibilidadCeldaOrdenTipoAutoriConsep=true;
	public Boolean isVisibilidadCeldaNuevoRelacionesTipoAutoriConsep=false;
	public Boolean isVisibilidadCeldaModificarTipoAutoriConsep=false;
	public Boolean isVisibilidadCeldaActualizarTipoAutoriConsep=false;
	public Boolean isVisibilidadCeldaEliminarTipoAutoriConsep=false;
	public Boolean isVisibilidadCeldaCancelarTipoAutoriConsep=false;
	public Boolean isVisibilidadCeldaGuardarTipoAutoriConsep=false;	
	public Boolean isVisibilidadCeldaGuardarCambiosTipoAutoriConsep=false;	
	
	
	public Boolean isVisibilidadBusquedaPorCodigo=false;
	public Boolean isVisibilidadBusquedaPorNombre=false;
	
	public Long getiIdNuevoTipoAutoriConsep() {
		return this.iIdNuevoTipoAutoriConsep;
	}

	public void setiIdNuevoTipoAutoriConsep(Long iIdNuevoTipoAutoriConsep) {
		this.iIdNuevoTipoAutoriConsep = iIdNuevoTipoAutoriConsep;
	}
	
	public Long getidTipoAutoriConsepActual() {
		return this.idTipoAutoriConsepActual;
	}

	public void setidTipoAutoriConsepActual(Long idTipoAutoriConsepActual) {
		this.idTipoAutoriConsepActual = idTipoAutoriConsepActual;
	}
	
	public int getrowIndexActual() {
		return this.rowIndexActual;
	}

	public void setrowIndexActual(int rowIndexActual) {
		this.rowIndexActual=rowIndexActual;
	}
	
	
	public TipoAutoriConsep gettipoautoriconsep() {
		return this.tipoautoriconsep;
	}

	public void settipoautoriconsep(TipoAutoriConsep tipoautoriconsep) {
		this.tipoautoriconsep = tipoautoriconsep;
	}
	
	public TipoAutoriConsep gettipoautoriconsepAux() {
		return this.tipoautoriconsepAux;
	}

	public void settipoautoriconsepAux(TipoAutoriConsep tipoautoriconsepAux) {
		this.tipoautoriconsepAux = tipoautoriconsepAux;
	}				
	
	public TipoAutoriConsep gettipoautoriconsepAnterior() {
		return this.tipoautoriconsepAnterior;
	}

	public void settipoautoriconsepAnterior(TipoAutoriConsep tipoautoriconsepAnterior) {
		this.tipoautoriconsepAnterior = tipoautoriconsepAnterior;
	}	
	
	public TipoAutoriConsep gettipoautoriconsepTotales() {
		return this.tipoautoriconsepTotales;
	}

	public void settipoautoriconsepTotales(TipoAutoriConsep tipoautoriconsepTotales) {
		this.tipoautoriconsepTotales = tipoautoriconsepTotales;
	}	
	
	public TipoAutoriConsep gettipoautoriconsepBean() {
		return this.tipoautoriconsepBean;
	}

	public void settipoautoriconsepBean(TipoAutoriConsep tipoautoriconsepBean) {
		this.tipoautoriconsepBean = tipoautoriconsepBean;
	}	
	
	public TipoAutoriConsepParameterReturnGeneral gettipoautoriconsepReturnGeneral() {
		return this.tipoautoriconsepReturnGeneral;
	}

	public void settipoautoriconsepReturnGeneral(TipoAutoriConsepParameterReturnGeneral tipoautoriconsepReturnGeneral) {
		this.tipoautoriconsepReturnGeneral = tipoautoriconsepReturnGeneral;
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

		
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	
	public TipoAutoriConsepLogic getTipoAutoriConsepLogic()	{		
		return tipoautoriconsepLogic;
	}

	public void setTipoAutoriConsepLogic(TipoAutoriConsepLogic tipoautoriconsepLogic) {
		this.tipoautoriconsepLogic = tipoautoriconsepLogic;
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
	
	public Boolean getIsEsNuevoTipoAutoriConsep() {
		return isEsNuevoTipoAutoriConsep;
	}

	public void setIsEsNuevoTipoAutoriConsep(Boolean isEsNuevoTipoAutoriConsep) {
		this.isEsNuevoTipoAutoriConsep = isEsNuevoTipoAutoriConsep;
	}

	public Boolean getEsParaAccionDesdeFormularioTipoAutoriConsep() {
		return esParaAccionDesdeFormularioTipoAutoriConsep;
	}
	
	public void setEsParaAccionDesdeFormularioTipoAutoriConsep(Boolean esParaAccionDesdeFormularioTipoAutoriConsep) {
		this.esParaAccionDesdeFormularioTipoAutoriConsep = esParaAccionDesdeFormularioTipoAutoriConsep;
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
	
	
	
	
	
	
	
	


	


	


	
	public void refrescarForeignKeysDescripcionesTipoAutoriConsep() throws Exception {
		//SI FUNCIONA DEEPLOAD ESTO VA AL ULTIMO
		if(Constantes.ISUSAEJBLOGICLAYER) {
			TipoAutoriConsepConstantesFunciones.refrescarForeignKeysDescripcionesTipoAutoriConsep(this.tipoautoriconsepLogic.getTipoAutoriConseps());
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			TipoAutoriConsepConstantesFunciones.refrescarForeignKeysDescripcionesTipoAutoriConsep(this.tipoautoriconseps);
		}
		
		/*
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
			
		if(Constantes.ISUSAEJBLOGICLAYER) {
			//USA LOS OBJETOS DE LOGIC DIRECTAMENTE
			//tipoautoriconsepLogic.setTipoAutoriConseps(this.tipoautoriconseps);
			tipoautoriconsepLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
	
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
		
	public TipoAutoriConsepParameterReturnGeneral getTipoAutoriConsepParameterGeneral() {
		return this.tipoautoriconsepParameterGeneral;
	}
	
	public void setTipoAutoriConsepParameterGeneral(TipoAutoriConsepParameterReturnGeneral tipoautoriconsepParameterGeneral) {
		this.tipoautoriconsepParameterGeneral = tipoautoriconsepParameterGeneral;
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
	
	public Boolean getIsPermisoTodoTipoAutoriConsep() {
		return isPermisoTodoTipoAutoriConsep;
	}

	public void setIsPermisoTodoTipoAutoriConsep(Boolean isPermisoTodoTipoAutoriConsep) {
		this.isPermisoTodoTipoAutoriConsep = isPermisoTodoTipoAutoriConsep;
	}

	public Boolean getIsPermisoNuevoTipoAutoriConsep() {
		return isPermisoNuevoTipoAutoriConsep;
	}

	public void setIsPermisoNuevoTipoAutoriConsep(Boolean isPermisoNuevoTipoAutoriConsep) {
		this.isPermisoNuevoTipoAutoriConsep = isPermisoNuevoTipoAutoriConsep;
	}

	public Boolean getIsPermisoActualizarTipoAutoriConsep() {
		return isPermisoActualizarTipoAutoriConsep;
	}

	public void setIsPermisoActualizarTipoAutoriConsep(Boolean isPermisoActualizarTipoAutoriConsep) {
		this.isPermisoActualizarTipoAutoriConsep = isPermisoActualizarTipoAutoriConsep;
	}

	public Boolean getIsPermisoEliminarTipoAutoriConsep() {
		return isPermisoEliminarTipoAutoriConsep;
	}

	public void setIsPermisoEliminarTipoAutoriConsep(Boolean isPermisoEliminarTipoAutoriConsep) {
		this.isPermisoEliminarTipoAutoriConsep = isPermisoEliminarTipoAutoriConsep;
	}

	public Boolean getIsPermisoGuardarCambiosTipoAutoriConsep() {
		return isPermisoGuardarCambiosTipoAutoriConsep;
	}

	public void setIsPermisoGuardarCambiosTipoAutoriConsep(Boolean isPermisoGuardarCambiosTipoAutoriConsep) {
		this.isPermisoGuardarCambiosTipoAutoriConsep = isPermisoGuardarCambiosTipoAutoriConsep;
	}
	
	public Boolean getIsPermisoConsultaTipoAutoriConsep() {
		return isPermisoConsultaTipoAutoriConsep;
	}

	public void setIsPermisoConsultaTipoAutoriConsep(Boolean isPermisoConsultaTipoAutoriConsep) {
		this.isPermisoConsultaTipoAutoriConsep = isPermisoConsultaTipoAutoriConsep;
	}

	public Boolean getIsPermisoBusquedaTipoAutoriConsep() {
		return isPermisoBusquedaTipoAutoriConsep;
	}

	public void setIsPermisoBusquedaTipoAutoriConsep(Boolean isPermisoBusquedaTipoAutoriConsep) {
		this.isPermisoBusquedaTipoAutoriConsep = isPermisoBusquedaTipoAutoriConsep;
	}

	public Boolean getIsPermisoReporteTipoAutoriConsep() {
		return isPermisoReporteTipoAutoriConsep;
	}

	public void setIsPermisoReporteTipoAutoriConsep(Boolean isPermisoReporteTipoAutoriConsep) {
		this.isPermisoReporteTipoAutoriConsep = isPermisoReporteTipoAutoriConsep;
	}
	
	public Boolean getIsPermisoPaginacionMedioTipoAutoriConsep() {
		return isPermisoPaginacionMedioTipoAutoriConsep;
	}

	public void setIsPermisoPaginacionMedioTipoAutoriConsep(Boolean isPermisoPaginacionMedioTipoAutoriConsep) {
		this.isPermisoPaginacionMedioTipoAutoriConsep = isPermisoPaginacionMedioTipoAutoriConsep;
	}
	
	public Boolean getIsPermisoPaginacionTodoTipoAutoriConsep() {
		return isPermisoPaginacionTodoTipoAutoriConsep;
	}

	public void setIsPermisoPaginacionTodoTipoAutoriConsep(Boolean isPermisoPaginacionTodoTipoAutoriConsep) {
		this.isPermisoPaginacionTodoTipoAutoriConsep = isPermisoPaginacionTodoTipoAutoriConsep;
	}
	
	public Boolean getIsPermisoPaginacionAltoTipoAutoriConsep() {
		return isPermisoPaginacionAltoTipoAutoriConsep;
	}

	public void setIsPermisoPaginacionAltoTipoAutoriConsep(Boolean isPermisoPaginacionAltoTipoAutoriConsep) {
		this.isPermisoPaginacionAltoTipoAutoriConsep = isPermisoPaginacionAltoTipoAutoriConsep;
	}
	
	public Boolean getIsPermisoCopiarTipoAutoriConsep() {
		return isPermisoCopiarTipoAutoriConsep;
	}

	public void setIsPermisoCopiarTipoAutoriConsep(Boolean isPermisoCopiarTipoAutoriConsep) {
		this.isPermisoCopiarTipoAutoriConsep = isPermisoCopiarTipoAutoriConsep;
	}
	
	public Boolean getIsPermisoVerFormTipoAutoriConsep() {
		return isPermisoVerFormTipoAutoriConsep;
	}

	public void setIsPermisoVerFormTipoAutoriConsep(Boolean isPermisoVerFormTipoAutoriConsep) {
		this.isPermisoVerFormTipoAutoriConsep = isPermisoVerFormTipoAutoriConsep;
	}
	
	public Boolean getIsPermisoDuplicarTipoAutoriConsep() {
		return isPermisoDuplicarTipoAutoriConsep;
	}

	public void setIsPermisoDuplicarTipoAutoriConsep(Boolean isPermisoDuplicarTipoAutoriConsep) {
		this.isPermisoDuplicarTipoAutoriConsep = isPermisoDuplicarTipoAutoriConsep;
	}
	
	public Boolean getIsPermisoOrdenTipoAutoriConsep() {
		return isPermisoOrdenTipoAutoriConsep;
	}

	public void setIsPermisoOrdenTipoAutoriConsep(Boolean isPermisoOrdenTipoAutoriConsep) {
		this.isPermisoOrdenTipoAutoriConsep = isPermisoOrdenTipoAutoriConsep;
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
	
	public Boolean getIsVisibilidadCeldaNuevoTipoAutoriConsep() {
		return isVisibilidadCeldaNuevoTipoAutoriConsep;
	}

	public void setIsVisibilidadCeldaNuevoTipoAutoriConsep(Boolean isVisibilidadCeldaNuevoTipoAutoriConsep) {
		this.isVisibilidadCeldaNuevoTipoAutoriConsep = isVisibilidadCeldaNuevoTipoAutoriConsep;
	}
	
	public Boolean getIsVisibilidadCeldaDuplicarTipoAutoriConsep() {
		return isVisibilidadCeldaDuplicarTipoAutoriConsep;
	}

	public void setIsVisibilidadCeldaDuplicarTipoAutoriConsep(Boolean isVisibilidadCeldaDuplicarTipoAutoriConsep) {
		this.isVisibilidadCeldaDuplicarTipoAutoriConsep = isVisibilidadCeldaDuplicarTipoAutoriConsep;
	}
	
	public Boolean getIsVisibilidadCeldaCopiarTipoAutoriConsep() {
		return isVisibilidadCeldaCopiarTipoAutoriConsep;
	}

	public void setIsVisibilidadCeldaCopiarTipoAutoriConsep(Boolean isVisibilidadCeldaCopiarTipoAutoriConsep) {
		this.isVisibilidadCeldaCopiarTipoAutoriConsep = isVisibilidadCeldaCopiarTipoAutoriConsep;
	}
	
	public Boolean getIsVisibilidadCeldaVerFormTipoAutoriConsep() {
		return isVisibilidadCeldaVerFormTipoAutoriConsep;
	}

	public void setIsVisibilidadCeldaVerFormTipoAutoriConsep(Boolean isVisibilidadCeldaVerFormTipoAutoriConsep) {
		this.isVisibilidadCeldaVerFormTipoAutoriConsep = isVisibilidadCeldaVerFormTipoAutoriConsep;
	}
	
	public Boolean getIsVisibilidadCeldaOrdenTipoAutoriConsep() {
		return isVisibilidadCeldaOrdenTipoAutoriConsep;
	}

	public void setIsVisibilidadCeldaOrdenTipoAutoriConsep(Boolean isVisibilidadCeldaOrdenTipoAutoriConsep) {
		this.isVisibilidadCeldaOrdenTipoAutoriConsep = isVisibilidadCeldaOrdenTipoAutoriConsep;
	}
	
	public Boolean getIsVisibilidadCeldaNuevoRelacionesTipoAutoriConsep() {
		return isVisibilidadCeldaNuevoRelacionesTipoAutoriConsep;
	}

	public void setIsVisibilidadCeldaNuevoRelacionesTipoAutoriConsep(Boolean isVisibilidadCeldaNuevoRelacionesTipoAutoriConsep) {
		this.isVisibilidadCeldaNuevoRelacionesTipoAutoriConsep = isVisibilidadCeldaNuevoRelacionesTipoAutoriConsep;
	}
	
	public Boolean getIsVisibilidadCeldaModificarTipoAutoriConsep() {
		return isVisibilidadCeldaModificarTipoAutoriConsep;
	}

	public void setIsVisibilidadCeldaModificarTipoAutoriConsep(Boolean isVisibilidadCeldaModificarTipoAutoriConsep) {
		this.isVisibilidadCeldaModificarTipoAutoriConsep = isVisibilidadCeldaModificarTipoAutoriConsep;
	}
	
	public Boolean getIsVisibilidadCeldaActualizarTipoAutoriConsep() {
		return isVisibilidadCeldaActualizarTipoAutoriConsep;
	}

	public void setIsVisibilidadCeldaActualizarTipoAutoriConsep(Boolean isVisibilidadCeldaActualizarTipoAutoriConsep) {
		this.isVisibilidadCeldaActualizarTipoAutoriConsep = isVisibilidadCeldaActualizarTipoAutoriConsep;
	}

	public Boolean getIsVisibilidadCeldaEliminarTipoAutoriConsep() {
		return isVisibilidadCeldaEliminarTipoAutoriConsep;
	}

	public void setIsVisibilidadCeldaEliminarTipoAutoriConsep(Boolean isVisibilidadCeldaEliminarTipoAutoriConsep) {
		this.isVisibilidadCeldaEliminarTipoAutoriConsep = isVisibilidadCeldaEliminarTipoAutoriConsep;
	}

	public Boolean getIsVisibilidadCeldaCancelarTipoAutoriConsep() {
		return isVisibilidadCeldaCancelarTipoAutoriConsep;
	}

	public void setIsVisibilidadCeldaCancelarTipoAutoriConsep(Boolean isVisibilidadCeldaCancelarTipoAutoriConsep) {
		this.isVisibilidadCeldaCancelarTipoAutoriConsep = isVisibilidadCeldaCancelarTipoAutoriConsep;
	}

	public Boolean getIsVisibilidadCeldaGuardarTipoAutoriConsep() {
		return isVisibilidadCeldaGuardarTipoAutoriConsep;
	}

	public void setIsVisibilidadCeldaGuardarTipoAutoriConsep(Boolean isVisibilidadCeldaGuardarTipoAutoriConsep) {
		this.isVisibilidadCeldaGuardarTipoAutoriConsep = isVisibilidadCeldaGuardarTipoAutoriConsep;
	}
	
	public Boolean getIsVisibilidadCeldaGuardarCambiosTipoAutoriConsep() {
		return isVisibilidadCeldaGuardarCambiosTipoAutoriConsep;
	}

	public void setIsVisibilidadCeldaGuardarCambiosTipoAutoriConsep(Boolean isVisibilidadCeldaGuardarCambiosTipoAutoriConsep) {
		this.isVisibilidadCeldaGuardarCambiosTipoAutoriConsep = isVisibilidadCeldaGuardarCambiosTipoAutoriConsep;
	}
		
	public TipoAutoriConsepSessionBean gettipoautoriconsepSessionBean() {
		return this.tipoautoriconsepSessionBean;
	}
	
	public void settipoautoriconsepSessionBean(TipoAutoriConsepSessionBean tipoautoriconsepSessionBean) {
		this.tipoautoriconsepSessionBean=tipoautoriconsepSessionBean;
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

	
	
	public void setVariablesFormularioToObjetoActualForeignKeysTipoAutoriConsep(TipoAutoriConsep tipoautoriconsep)throws Exception {
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
	
	public void bugActualizarReferenciaActual(TipoAutoriConsep tipoautoriconsep,TipoAutoriConsep tipoautoriconsepAux) throws Exception {
		//ARCHITECTURE		
		//EL ID NEGATIVO GUARDADO EN ORIGINAL SIRVE PARA VERIFICAR Y ACTUALIZAR EL REGISTRO NUEVO (ID,VERSIONROW)
		this.setCamposBaseDesdeOriginalTipoAutoriConsep(tipoautoriconsep);
					
		//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
		tipoautoriconsepAux.setId(tipoautoriconsep.getId());
		tipoautoriconsepAux.setVersionRow(tipoautoriconsep.getVersionRow());					
	}
	
	public void ejecutarMantenimiento(MaintenanceType maintenanceType)throws Exception {	
		try	{								
			
			//this.startProcessTipoAutoriConsep();
		
			int intSelectedRow = this.jTableDatosTipoAutoriConsep.getSelectedRow();	       
			
			//PUEDE SER -1 CUANDO SE ELIMINA EN GUARDAR CAMBIOS
			if(intSelectedRow>=0 && maintenanceType!=MaintenanceType.GUARDARCAMBIOS) {
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
					
				//ARCHITECTURE
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoautoriconsep =(TipoAutoriConsep) this.tipoautoriconsepLogic.getTipoAutoriConseps().toArray()[this.jTableDatosTipoAutoriConsep.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
					this.tipoautoriconsep =(TipoAutoriConsep) this.tipoautoriconseps.toArray()[this.jTableDatosTipoAutoriConsep.convertRowIndexToModel(intSelectedRow)];
				}
				
				//ARCHITECTURE
				
				if(TipoAutoriConsepJInternalFrame.ISBINDING_MANUAL_TABLA) {
					//this.setVariablesFormularioToObjetoActualTipoAutoriConsep(this.tipoautoriconsep,true);
				}
				
				this.setVariablesFormularioToObjetoActualForeignKeysTipoAutoriConsep(this.tipoautoriconsep);
			}
			
			//LUEGO DE TRAER DATOS CORRESPONDIENTES QUE COINCIDA LISTA TABLA QUITO FILA TOTALES
			if(this.conTotales) {
				//MEJOR LO DEJO, SI EXISTE EXCEPCION SE PIEDE FILA TOTALES Y ORDEN INDICE FILA ACTUAL
				//this.quitarFilaTotales();
			}
			
			this.cargarDatosCliente();
			
			this.datosDeep=new DatosDeep();
			
			//SE CAMBIA ESTADOS CON ERROR, ENTONCES SE EJECUTA ANTES
			//this.invalidValues = tipoautoriconsepValidator.getInvalidValues(this.tipoautoriconsep);
			
			//if(this.invalidValues==null || this.invalidValues.length<=0) {
			
			tipoautoriconsepLogic.setDatosCliente(datosCliente);
			tipoautoriconsepLogic.setIsConDeep(false);
			
			if(maintenanceType==MaintenanceType.NUEVO) {
				tipoautoriconsepAux=new  TipoAutoriConsep();
				
				tipoautoriconsepAux.setIsNew(true);
				tipoautoriconsepAux.setIsChanged(true);
				
				tipoautoriconsepAux.setTipoAutoriConsepOriginal(this.tipoautoriconsep);
				
				tipoautoriconsepAux.setId(this.tipoautoriconsep.getId());	
				tipoautoriconsepAux.setVersionRow(this.tipoautoriconsep.getVersionRow());	
				tipoautoriconsepAux.setcodigo(this.tipoautoriconsep.getcodigo());	
				tipoautoriconsepAux.setnombre(this.tipoautoriconsep.getnombre());	
								
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.tipoautoriconsepSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.tipoautoriconsepSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(tipoautoriconsepAux,tipoautoriconsepLogic.getTipoAutoriConseps());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(tipoautoriconsepAux,tipoautoriconseps);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote  && !this.tipoautoriconsepSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.tipoautoriconsepSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						tipoautoriconsepLogic.saveTipoAutoriConseps();//WithConnection
						//tipoautoriconsepLogic.getSetVersionRowTipoAutoriConseps();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE		
					
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.tipoautoriconsep,tipoautoriconsepAux);
					
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.tipoautoriconsepSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
					}
				}
			} else if(maintenanceType==MaintenanceType.ACTUALIZAR) {
				tipoautoriconsepAux=new  TipoAutoriConsep();
				
				//PUEDE QUE SE ACTUALIZE ALGUN REGISTRO NUEVO
				if(!this.tipoautoriconsepSessionBean.getEsGuardarRelacionado() 
					|| (this.tipoautoriconsepSessionBean.getEsGuardarRelacionado() && this.tipoautoriconsep.getId()>=0)) {
						
					tipoautoriconsepAux.setIsNew(false);
				}
				
				tipoautoriconsepAux.setIsDeleted(false);
			
				tipoautoriconsepAux.setId(this.tipoautoriconsep.getId());	
				tipoautoriconsepAux.setVersionRow(this.tipoautoriconsep.getVersionRow());	
				tipoautoriconsepAux.setcodigo(this.tipoautoriconsep.getcodigo());	
				tipoautoriconsepAux.setnombre(this.tipoautoriconsep.getnombre());	
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(tipoautoriconsepAux,tipoautoriconsepLogic.getTipoAutoriConseps());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(tipoautoriconsepAux,tipoautoriconseps);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote && !this.tipoautoriconsepSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.tipoautoriconsepSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						tipoautoriconsepLogic.saveTipoAutoriConseps();//WithConnection
						//tipoautoriconsepLogic.getSetVersionRowTipoAutoriConseps();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}	
					//ARCHITECTURE
					
					//TALVEZ ESTA DEMAS POR SER UPDATE
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.tipoautoriconsep,tipoautoriconsepAux);
					
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.tipoautoriconsepSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
					}
				}				
			} else if(maintenanceType==MaintenanceType.ELIMINAR) {
				tipoautoriconsepAux=new  TipoAutoriConsep();
				
				tipoautoriconsepAux.setIsNew(false);
				tipoautoriconsepAux.setIsChanged(false);
				
				tipoautoriconsepAux.setIsDeleted(true);
				
				tipoautoriconsepAux.setId(this.tipoautoriconsep.getId());	
				tipoautoriconsepAux.setVersionRow(this.tipoautoriconsep.getVersionRow());	
				tipoautoriconsepAux.setcodigo(this.tipoautoriconsep.getcodigo());	
				tipoautoriconsepAux.setnombre(this.tipoautoriconsep.getnombre());	
				
				if(this.tipoautoriconsepSessionBean.getEsGuardarRelacionado()) {
					//ELEMENTO ACTUAL NO SE HA INGRESADO AL SISTEMA, NO SE PUEDE ELIMINAR ALGO QUE NO EXISTE
					if(this.tipoautoriconsepAux.getId()>=0) {	
						this.tipoautoriconsepsEliminados.add(tipoautoriconsepAux);											
					}
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					actualizarLista(tipoautoriconsepAux,tipoautoriconsepLogic.getTipoAutoriConseps());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(tipoautoriconsepAux,tipoautoriconseps);
				}
				//ARCHITECTURE
				
				
				if(!isGuardarCambiosEnLote && !this.tipoautoriconsepSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.tipoautoriconsepSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						tipoautoriconsepLogic.saveTipoAutoriConseps();//WithConnection
						//tipoautoriconsepLogic.getSetVersionRowTipoAutoriConseps();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}	
					//ARCHITECTURE
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.tipoautoriconsepSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
					}  else {
							
						

							if(this.jInternalFrameDetalleFormTipoAutoriConsep.autoriconsepBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoAutoriConsep.autoriconsepBeanSwingJInternalFrame.conTotales) {this.jInternalFrameDetalleFormTipoAutoriConsep.autoriconsepBeanSwingJInternalFrame.quitarFilaTotales();}
							tipoautoriconsepAux.setAutoriConseps(this.jInternalFrameDetalleFormTipoAutoriConsep.autoriconsepBeanSwingJInternalFrame.autoriconsepLogic.getAutoriConseps());
								
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							if(this.tipoautoriconsepSessionBean.getEstaModoGuardarRelaciones() 
								|| this.tipoautoriconsepSessionBean.getEsGuardarRelacionado())	{
								actualizarLista(tipoautoriconsepAux,tipoautoriconsepLogic.getTipoAutoriConseps());
							}
						} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
							actualizarLista(tipoautoriconsepAux,tipoautoriconseps);
						}
						//ARCHITECTURE
					}
				}				
			} else if(maintenanceType==MaintenanceType.GUARDARCAMBIOS) {		
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoautoriconsepLogic.getTipoAutoriConseps().addAll(this.tipoautoriconsepsEliminados);
					
					tipoautoriconsepLogic.saveTipoAutoriConseps();//WithConnection
					//tipoautoriconsepLogic.getSetVersionRowTipoAutoriConseps();//WithConnection
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}	
				//ARCHITECTURE
				
				this.tipoautoriconsepsEliminados= new ArrayList<TipoAutoriConsep>();		
			}
			
			if(this.tipoautoriconsepSessionBean.getEsGuardarRelacionado()) {
				 this.crearFilaTotales();
			}
			
			
									
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipoautoriconsepSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				if(!this.isPostAccionSinMensaje) {
					JOptionPane.showMessageDialog(this,"Tipo Autorizacion Consep GUARDADO CORRECTAMENTE","MANTENIMIENTO DE Tipo Autorizacion Consep",JOptionPane.INFORMATION_MESSAGE);
					if(maintenanceType==MaintenanceType.NUEVO || maintenanceType==MaintenanceType.ACTUALIZAR) {
						//CUANDO ES NUEVO SE PIERDE REFERENCIA NO SE PORQUE
						this.tipoautoriconsep=tipoautoriconsepAux;
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
      		//this.finishProcessTipoAutoriConsep();
      	}
		
	}	
	
	public void actualizarRelaciones(TipoAutoriConsep tipoautoriconsepLocal) throws Exception {
		
		if(this.tipoautoriconsepSessionBean.getConGuardarRelaciones()) {			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
			
				tipoautoriconsepLocal.setAutoriConseps(this.jInternalFrameDetalleFormTipoAutoriConsep.autoriconsepBeanSwingJInternalFrame.autoriconsepLogic.getAutoriConseps());
			
			} else {
			
				tipoautoriconsepLocal.setAutoriConseps(this.jInternalFrameDetalleFormTipoAutoriConsep.autoriconsepBeanSwingJInternalFrame.autoriconseps);	
			}
		}
	}
	
	public void actualizarRelacionFkPadreActual(TipoAutoriConsep tipoautoriconsepLocal) throws Exception {	
		if(this.tipoautoriconsepSessionBean.getEsGuardarRelacionado()) {			
			
		
		
		}
	}
	
	public Boolean validarTipoAutoriConsepActual() throws Exception {
		Boolean estaValidado=false;
		this.inicializarInvalidValues();
		
		/*
		int intSelectedRow = this.jTableDatosTipoAutoriConsep.getSelectedRow();
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.tipoautoriconsep =(TipoAutoriConsep) this.tipoautoriconsepLogic.getTipoAutoriConseps().toArray()[this.jTableDatosTipoAutoriConsep.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
			this.tipoautoriconsep =(TipoAutoriConsep) this.tipoautoriconseps.toArray()[this.jTableDatosTipoAutoriConsep.convertRowIndexToModel(intSelectedRow)];
		}
		//ARCHITECTURE
		*/
		
		this.invalidValues = tipoautoriconsepValidator.getInvalidValues(this.tipoautoriconsep);
					
		if(this.invalidValues==null || this.invalidValues.length<=0) {
			estaValidado=true;
		} else {
			this.mostrarInvalidValues();	
		}
		
		return estaValidado;
	}
	
	public void actualizarLista(TipoAutoriConsep tipoautoriconsep,List<TipoAutoriConsep> tipoautoriconseps) throws Exception {
		try	{		
			TipoAutoriConsepConstantesFunciones.actualizarLista(tipoautoriconsep,tipoautoriconseps,this.tipoautoriconsepSessionBean.getEsGuardarRelacionado());		
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void actualizarSelectedLista(TipoAutoriConsep tipoautoriconsep,List<TipoAutoriConsep> tipoautoriconseps) throws Exception {
		try	{			
			TipoAutoriConsepConstantesFunciones.actualizarSelectedLista(tipoautoriconsep,tipoautoriconseps);
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public Boolean tieneElementosSeleccionados() throws Exception {
		Boolean tiene=false;
		
		List<TipoAutoriConsep> tipoautoriconsepsLocal=null;
		
		try	{			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				tipoautoriconsepsLocal=this.tipoautoriconsepLogic.getTipoAutoriConseps();
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				tipoautoriconsepsLocal=this.tipoautoriconseps;
			}
			//ARCHITECTURE
		
			for(TipoAutoriConsep tipoautoriconsepLocal:tipoautoriconsepsLocal) {
				if(this.permiteMantenimiento(tipoautoriconsepLocal) && tipoautoriconsepLocal.getIsSelected()) {
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
			sMensaje+="\r\n"+TipoAutoriConsepConstantesFunciones.getTipoAutoriConsepLabelDesdeNombre(invalidValue.getPropertyName())+"->"+invalidValue.getMessage();
			
			//MOSTRAR CAMPOS INVALIDOS
			if(invalidValue.getPropertyName().equals(TipoAutoriConsepConstantesFunciones.CODIGO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTipoAutoriConsep.jLabelcodigoTipoAutoriConsep,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(TipoAutoriConsepConstantesFunciones.NOMBRE)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTipoAutoriConsep.jLabelnombreTipoAutoriConsep,invalidValue.getMessage());}
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
		
		if(this.jInternalFrameDetalleFormTipoAutoriConsep!=null) {
		
		//MOSTRAR CAMPOS INVALIDOS
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormTipoAutoriConsep.jLabelcodigoTipoAutoriConsep,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormTipoAutoriConsep.jLabelnombreTipoAutoriConsep,"");
		
		}
	}
	
	
	
	public void actualizarObjetoPadreFk(String sTipo)  throws Exception {
		if(sTipo.equals("XXXAuxiliar")) {
		
		}
		
		 else  if(sTipo.equals("AutoriConsep")) {
			if(this.tipoautoriconsep==null) {
				this.tipoautoriconsep= new TipoAutoriConsep();
			}

			if(this.tipoautoriconsepSessionBean.getConGuardarRelaciones()) { //&& this.isEsNuevoTipoAutoriConsep
				this.setVariablesFormularioToObjetoActualTipoAutoriConsep(this.tipoautoriconsep,true);//false
				this.setVariablesFormularioToObjetoActualForeignKeysTipoAutoriConsep(this.tipoautoriconsep);

				this.jInternalFrameDetalleFormTipoAutoriConsep.autoriconsepBeanSwingJInternalFrame.getautoriconsep().setTipoAutoriConsep(this.tipoautoriconsep);
			}

			return;
		}
	}
	
	public void nuevoPreparar() throws Exception {
		this.nuevoPreparar(false);
	}
	
	public void nuevoPreparar(Boolean esNuevoGuardarCambios) throws Exception {
		this.iIdNuevoTipoAutoriConsep--;	
		
		
		this.tipoautoriconsepAux=new TipoAutoriConsep();
		
		this.tipoautoriconsepAux.setId(this.iIdNuevoTipoAutoriConsep);
		this.tipoautoriconsepAux.setIsChanged(true);
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.tipoautoriconsepLogic.getTipoAutoriConseps().add(this.tipoautoriconsepAux);
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.tipoautoriconseps.add(this.tipoautoriconsepAux);
		}
		//ARCHITECTURE
		
		this.tipoautoriconsep=this.tipoautoriconsepAux;
		
		if(TipoAutoriConsepJInternalFrame.ISBINDING_MANUAL_TABLA) {
			this.setVariablesObjetoActualToFormularioTipoAutoriConsep(this.tipoautoriconsep);
			this.setVariablesObjetoActualToFormularioForeignKeyTipoAutoriConsep(this.tipoautoriconsep);
		}
				
		//this.setDefaultControlesTipoAutoriConsep();
		
		this.inicializarInvalidValues();
				
		//SELECCIONA ITEM DEFECTO-->SET O SELECTED INDEX
		this.setItemDefectoCombosForeignKeyTipoAutoriConsep();
		
		
		//INICIALIZA VARIABLES COMBOS GLOBALES A FORMULARIO(ParametroGeneralUsuario)
		this.setVariablesGlobalesCombosForeignKeyTipoAutoriConsep();
		
		//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
		//this.setVariablesGlobalesAuxiliaresCombosForeignKeyTipoAutoriConsep();
		
		//SI TIENE FOREIGN KEY CON CAMPO esDefecto=true, SE ACTUALIZA A OBJETO ACTUAL
		this.setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualTipoAutoriConsep(this.tipoautoriconsepBean,this.tipoautoriconsep,false,false);
		
		//ACTUALIZA VALORES PARA EL OBJETO ACTUAL ANTES DE ENVIARLO A ACTUALIZAR
		this.setVariablesFormularioToObjetoActualForeignKeysTipoAutoriConsep(this.tipoautoriconsep);
				
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		if(this.jInternalFrameParent!=null) {
			this.jInternalFrameParent.actualizarObjetoPadreFk(TipoAutoriConsepConstantesFunciones.CLASSNAME);
		}	
		
		
		if(this.tipoautoriconsepSessionBean.getConGuardarRelaciones()) {
			classes=TipoAutoriConsepConstantesFunciones.getClassesRelationshipsOfTipoAutoriConsep(new ArrayList<Classe>(),DeepLoadType.NONE);
		}
		
		this.classesActual=new ArrayList<Classe>();
		this.classesActual.addAll(classes);
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {						
			this.tipoautoriconsepReturnGeneral=tipoautoriconsepLogic.procesarEventosTipoAutoriConsepsWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,EventoGlobalTipo.FORM_RECARGAR,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.tipoautoriconsepLogic.getTipoAutoriConseps(),this.tipoautoriconsep,this.tipoautoriconsepParameterGeneral,this.isEsNuevoTipoAutoriConsep,classes);//this.tipoautoriconsepLogic.getTipoAutoriConsep()
						
		} else if(Constantes.ISUSAEJBREMOTE) {
						
		} else if(Constantes.ISUSAEJBHOME) {
		}
		//ARCHITECTURE
		
		//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
		//this.setVariablesObjetoReturnGeneralToBeanTipoAutoriConsep(this.tipoautoriconsepReturnGeneral,this.tipoautoriconsepBean,false);
		
		if(this.tipoautoriconsepReturnGeneral.getConRecargarPropiedades()) {
			//INICIALIZA VARIABLES COMBOS NORMALES (FK)
			this.setVariablesObjetoActualToFormularioForeignKeyTipoAutoriConsep(this.tipoautoriconsepReturnGeneral.getTipoAutoriConsep());
			
			//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
			this.setVariablesObjetoActualToFormularioTipoAutoriConsep(this.tipoautoriconsepReturnGeneral.getTipoAutoriConsep());
		}
		
		if(this.tipoautoriconsepReturnGeneral.getConRecargarRelaciones()) {
			//INICIALIZA VARIABLES RELACIONES A FORMULARIO
			this.setVariablesRelacionesObjetoActualToFormularioTipoAutoriConsep(this.tipoautoriconsepReturnGeneral.getTipoAutoriConsep(),classes);//this.tipoautoriconsepBean);	
		}
			
		//ACTUALIZA VARIABLES FORMULARIO A OBJETO ACTUAL (PARA NUEVO TABLA O GUARDAR CAMBIOS
		if(esNuevoGuardarCambios) {
			this.setVariablesFormularioToObjetoActualTipoAutoriConsep(this.tipoautoriconsep,false);
		}
		
		//INICIALIZA VARIABLES COMBOS DEFAULT DEL PROYECTO(|DEFAULT para FK)
		//this.setVariablesDefaultCombosForeignKeyTipoAutoriConsep();
		
		//INICIALIZA VARIABLES COMBOS PARAMETRO DEL PROYECTO(|VALORPARAM Era para ParametroModulo, ahora en logic)
		//this.setVariablesParametroCombosForeignKeyTipoAutoriConsep();						
		
		if(!esNuevoGuardarCambios) {
			//INICIALIZA VARIABLES POR OPCION MENU
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
		
			//NO FUNCIONA BINDINGS			
			this.inicializarActualizarBindingTipoAutoriConsep(false);
						
			if(tipoautoriconsepSessionBean.getConGuardarRelaciones()) {
				//DEBERIA YA ESTAR CARGADO LOS COMBOS Y SI SE NECESITA ALGO MAS SE DEBE CREAR FUNCION LIMITADA
				//SI DEBE TRAER Y RESETEAR TABLA
				

				if(this.jInternalFrameDetalleFormTipoAutoriConsep.autoriconsepBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoAutoriConsep.autoriconsepBeanSwingJInternalFrame.autoriconsepSessionBean.getEsGuardarRelacionado() && AutoriConsepJInternalFrame.ESTA_CARGADO_PORPARTE) {
					this.jButtonAutoriConsepActionPerformed(null,-1,false,true,null);
				}				
			}
				
			//SI ES MANUAL
			if(TipoAutoriConsepJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualTipoAutoriConsep();
			}
			
			this.actualizarVisualTableDatosTipoAutoriConsep();
			
			this.jTableDatosTipoAutoriConsep.setRowSelectionInterval(this.getIndiceNuevoTipoAutoriConsep(), this.getIndiceNuevoTipoAutoriConsep());
			
			this.seleccionarFilaTablaTipoAutoriConsepActual();
						
			this.actualizarEstadoCeldasBotonesTipoAutoriConsep("a", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		}		
	}
	
	public void habilitarDeshabilitarControlesTipoAutoriConsep(Boolean isHabilitar) throws Exception {
		
		this.jInternalFrameDetalleFormTipoAutoriConsep.jTextFieldcodigoTipoAutoriConsep.setEnabled(isHabilitar && this.tipoautoriconsepConstantesFunciones.activarcodigoTipoAutoriConsep);
		this.jInternalFrameDetalleFormTipoAutoriConsep.jTextFieldnombreTipoAutoriConsep.setEnabled(isHabilitar && this.tipoautoriconsepConstantesFunciones.activarnombreTipoAutoriConsep);	
		
	};
	
	public void setDefaultControlesTipoAutoriConsep() throws Exception {
			
	};
	
	
	public void habilitarDeshabilitarTipoMantenimientoTipoAutoriConsep(Boolean esRelaciones) throws Exception {
		if(esRelaciones) {
			//this.tipoautoriconsepSessionBean.setConGuardarRelaciones(true);			
			this.tipoautoriconsepSessionBean.setEstaModoGuardarRelaciones(true);				
			this.jInternalFrameDetalleFormTipoAutoriConsep.jTabbedPaneRelacionesTipoAutoriConsep.setVisible(true);
			
			

			if(this.jInternalFrameDetalleFormTipoAutoriConsep.autoriconsepBeanSwingJInternalFrame!=null) {
				this.jInternalFrameDetalleFormTipoAutoriConsep.autoriconsepBeanSwingJInternalFrame.autoriconsepSessionBean.setEsGuardarRelacionado(true);
				//this.jInternalFrameDetalleFormTipoAutoriConsep.autoriconsepBeanSwingJInternalFrame.getContentPane().setVisible(true);
			}		
		} else {
			//this.tipoautoriconsepSessionBean.setConGuardarRelaciones(false);			
			this.tipoautoriconsepSessionBean.setEstaModoGuardarRelaciones(false);						
			this.jInternalFrameDetalleFormTipoAutoriConsep.jTabbedPaneRelacionesTipoAutoriConsep.setVisible(false);
			
			

			if(this.jInternalFrameDetalleFormTipoAutoriConsep.autoriconsepBeanSwingJInternalFrame!=null) {
				this.jInternalFrameDetalleFormTipoAutoriConsep.autoriconsepBeanSwingJInternalFrame.autoriconsepSessionBean.setEsGuardarRelacionado(false);
				//this.jInternalFrameDetalleFormTipoAutoriConsep.autoriconsepBeanSwingJInternalFrame.getContentPane().setVisible(false);
			}
		}
	};
	
	public int getIndiceNuevoTipoAutoriConsep() throws Exception {
		int iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(TipoAutoriConsep tipoautoriconsepAux:this.tipoautoriconsepLogic.getTipoAutoriConseps()) {
				if(tipoautoriconsepAux.getId().equals(this.iIdNuevoTipoAutoriConsep)) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(TipoAutoriConsep tipoautoriconsepAux:this.tipoautoriconseps) {
				if(tipoautoriconsepAux.getId().equals(this.iIdNuevoTipoAutoriConsep)) {
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
	
	public int getIndiceActualTipoAutoriConsep(TipoAutoriConsep tipoautoriconsep,Integer iIndiceActual) throws Exception {
		Integer iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(TipoAutoriConsep tipoautoriconsepAux:this.tipoautoriconsepLogic.getTipoAutoriConseps()) {
				if(tipoautoriconsepAux.getId().equals(tipoautoriconsep.getId())) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(TipoAutoriConsep tipoautoriconsepAux:this.tipoautoriconseps) {
				if(tipoautoriconsepAux.getId().equals(tipoautoriconsep.getId())) {
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
	
	public void setCamposBaseDesdeOriginalTipoAutoriConsep(TipoAutoriConsep tipoautoriconsepOriginal) throws Exception {
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(TipoAutoriConsep tipoautoriconsepAux:this.tipoautoriconsepLogic.getTipoAutoriConseps()) {
				if(tipoautoriconsepAux.getTipoAutoriConsepOriginal().getId().equals(tipoautoriconsepOriginal.getId())) {
					existe=true;
					tipoautoriconsepOriginal.setId(tipoautoriconsepAux.getId());
					tipoautoriconsepOriginal.setVersionRow(tipoautoriconsepAux.getVersionRow());
					break;
				}
				
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(TipoAutoriConsep tipoautoriconsepAux:this.tipoautoriconseps) {
				if(tipoautoriconsepAux.getTipoAutoriConsepOriginal().getId().equals(tipoautoriconsepOriginal.getId())) {
					existe=true;
					tipoautoriconsepOriginal.setId(tipoautoriconsepAux.getId());
					tipoautoriconsepOriginal.setVersionRow(tipoautoriconsepAux.getVersionRow());
					break;
				}				
			}
		}
		//ARCHITECTURE
		
		if(!existe) {
			//SI NO EXISTE TOMA LA ULTIMA FILA
		}
	}
	
	public void cancelarNuevosTipoAutoriConsep(Boolean esParaCancelar) throws Exception {
		tipoautoriconsepsAux=new ArrayList<TipoAutoriConsep>();
		tipoautoriconsepAux=new TipoAutoriConsep();
		
		if(!this.tipoautoriconsepSessionBean.getEsGuardarRelacionado()) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(TipoAutoriConsep tipoautoriconsepAux:this.tipoautoriconsepLogic.getTipoAutoriConseps()) {
					if(tipoautoriconsepAux.getId()<0) {
						tipoautoriconsepsAux.add(tipoautoriconsepAux);
					}		
				}
				this.iIdNuevoTipoAutoriConsep=0L;
				this.tipoautoriconsepLogic.getTipoAutoriConseps().removeAll(tipoautoriconsepsAux);
					
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(TipoAutoriConsep tipoautoriconsepAux:this.tipoautoriconseps) {
					if(tipoautoriconsepAux.getId()<0) {
						tipoautoriconsepsAux.add(tipoautoriconsepAux);
					}		
				}
				this.iIdNuevoTipoAutoriConsep=0L;
				this.tipoautoriconseps.removeAll(tipoautoriconsepsAux);
			}	
		} else {			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				if(esParaCancelar && this.isEsNuevoTipoAutoriConsep 
					&& this.tipoautoriconsepLogic.getTipoAutoriConseps().size()>0
					) {
					tipoautoriconsepAux=this.tipoautoriconsepLogic.getTipoAutoriConseps().get(this.tipoautoriconsepLogic.getTipoAutoriConseps().size() - 1);
				
					if(tipoautoriconsepAux.getId()<0) {
						this.tipoautoriconsepLogic.getTipoAutoriConseps().remove(tipoautoriconsepAux);
					}
				}
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				if(esParaCancelar && this.isEsNuevoTipoAutoriConsep && this.tipoautoriconseps.size()>0) {
					tipoautoriconsepAux=this.tipoautoriconseps.get(this.tipoautoriconseps.size() - 1);
				
					if(tipoautoriconsepAux.getId()<0) {
						this.tipoautoriconseps.remove(tipoautoriconsepAux);
					}
				}
			}	
		}
	}
	
	public void cancelarNuevoTipoAutoriConsep(Boolean esParaCancelar) throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			if(tipoautoriconsep.getId()<0) {
				this.tipoautoriconsepLogic.getTipoAutoriConseps().remove(this.tipoautoriconsep);
			}					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			if(tipoautoriconsep.getId()<0) {
				this.tipoautoriconseps.remove(this.tipoautoriconsep);
			}
		}			
	}
	
	public void setEstadosInicialesTipoAutoriConsep(List<TipoAutoriConsep> tipoautoriconsepsAux) throws Exception {
		TipoAutoriConsepConstantesFunciones.setEstadosInicialesTipoAutoriConsep(tipoautoriconsepsAux);
	}
	
	public void setEstadosInicialesTipoAutoriConsep(TipoAutoriConsep tipoautoriconsepAux) throws Exception {
		TipoAutoriConsepConstantesFunciones.setEstadosInicialesTipoAutoriConsep(tipoautoriconsepAux);		
	}
	
	public void nuevo() throws Exception {
		try	{
			//ESTA VALIDADO EN FUNCION ACTUALIZAR
			//if(this.validarTipoAutoriConsepActual()) {
				this.ejecutarMantenimiento(MaintenanceType.NUEVO);
				
				this.actualizarEstadoCeldasBotonesTipoAutoriConsep("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
				
			//}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoAutoriConsepConstantesFunciones.CLASSNAME);
		}
	}
	
	public void actualizar() throws Exception {
		try	{
			if(this.validarTipoAutoriConsepActual()) {
				if(!this.isEsNuevoTipoAutoriConsep) {
					this.ejecutarMantenimiento(MaintenanceType.ACTUALIZAR);
					
					this.actualizarEstadoCeldasBotonesTipoAutoriConsep("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
					
				} else {					
					this.nuevo();
					this.isEsNuevoTipoAutoriConsep=false;
				}
				
				//SE CANCELA AL FINAL DEL PROCESO JBUTTONACTUALIZAR
				//this.cancelar(false);
			}		
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoAutoriConsepConstantesFunciones.CLASSNAME);
		}
	}
	
	public void eliminar() throws Exception {
		try	{	
			if(this.validarTipoAutoriConsepActual()) {
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE ELIMINAR EL/LA Tipo Autorizacion Consep ?", "MANTENIMIENTO DE Tipo Autorizacion Consep", JOptionPane.OK_CANCEL_OPTION) == 0) {
					this.ejecutarMantenimiento(MaintenanceType.ELIMINAR);			
					this.actualizarEstadoCeldasBotonesTipoAutoriConsep("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
				}
			
			}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoAutoriConsepConstantesFunciones.CLASSNAME);
		}
	}
	
	public void guardarCambios() throws Exception {
		try	{
			this.ejecutarMantenimiento(MaintenanceType.GUARDARCAMBIOS);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoAutoriConsepConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarAsignar(TipoAutoriConsep tipoautoriconsep) throws Exception {
		TipoAutoriConsepConstantesFunciones.seleccionarAsignar(this.tipoautoriconsep,tipoautoriconsep);
	}
	
	public void seleccionar() throws Exception {
		try	{
			//ACTUALIZO EL PERMISO ACTUALIZAR CON EL PERMISO ACTUALIZAR ORIGINAL ESTE PERMISO SE UTILIZA PARA EL NUEVO TAMBIEN
			this.isPermisoActualizarTipoAutoriConsep=this.isPermisoActualizarOriginalTipoAutoriConsep;
			
			
			this.seleccionarAsignar(tipoautoriconsep);
			
			
			
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			TipoAutoriConsepConstantesFunciones.quitarEspaciosTipoAutoriConsep(this.tipoautoriconsep,this.arrDatoGeneral);
			
			
			this.actualizarEstadoCeldasBotonesTipoAutoriConsep("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoAutoriConsepConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarBusqueda(Long id) throws Exception {
		try	{
			this.tipoautoriconsepSessionBean.setsFuncionBusquedaRapida(this.tipoautoriconsepSessionBean.getsFuncionBusquedaRapida().replace("TO_REPLACE", id.toString()));
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoAutoriConsepConstantesFunciones.CLASSNAME);
		}
	}
	
	
	
	public void cancelar() throws Exception {
		this.cancelar(true);
	}
	
	public void cancelar(Boolean esParaCancelar) throws Exception {
		try {
														
			
			//SE UTILIZA COLUMNA ELIMINAR EN TABLA
			if(this.isEsNuevoTipoAutoriConsep) {
				//NO CANCELA TODOS NUEVOS POR FUNCIONALIDAD GUARDAR CAMBIOS
				//this.cancelarNuevosTipoAutoriConsep(esParaCancelar);				
				this.cancelarNuevoTipoAutoriConsep(esParaCancelar);								
			}
			
			this.tipoautoriconsep=new TipoAutoriConsep();
			
			this.inicializarTipoAutoriConsep();
			
			this.actualizarEstadoCeldasBotonesTipoAutoriConsep("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoAutoriConsepConstantesFunciones.CLASSNAME);
		}
	}
	
	public void inicializarTipoAutoriConsep() throws Exception {
		try {
			TipoAutoriConsepConstantesFunciones.inicializarTipoAutoriConsep(this.tipoautoriconsep);
			
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
			FuncionesSwing.manageException(this, e,logger,TipoAutoriConsepConstantesFunciones.CLASSNAME);
		}
	}
	
	public void siguientes()throws Exception {
		try	{			
			if(this.tipoautoriconsepLogic.getTipoAutoriConseps().size()>0) {
					
				this.iNumeroPaginacionPagina=this.iNumeroPaginacionPagina+this.iNumeroPaginacion;
			}
				
			this.procesarBusqueda(this.sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoAutoriConsepConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void generarReporteTipoAutoriConseps(String sAccionBusqueda,List<TipoAutoriConsep> tipoautoriconsepsParaReportes) throws Exception {
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
					sPathReporteFinal="TipoAutoriConsep"+this.sTipoReporteExtra+"Design.jasper";
					reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);	
				} else {
					sPathReporteFinal=this.sPathReporteDinamico;
					reportFile = new FileInputStream(sPathReporteFinal);
				}
			} else {
				sPathReporteFinal="TipoAutoriConsepMasterRelaciones"+this.sTipoReporteExtra+"Design.jasper";
				reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);
				//sPathReportes=reportFile.getPath().replace("TipoAutoriConsepMasterRelacionesDesign.jasper", "");
			}
		} else {
				sPathReporteFinal="TipoAutoriConsep"+this.sTipoReporteExtra+"Design.jasper";
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
		parameters.put("subtitulo", "Reporte De  Tipo Autorizacion Consepes");		
		parameters.put("busquedapor", TipoAutoriConsepConstantesFunciones.getNombreIndice(sAccionBusqueda)+sDetalleReporte);
		
		
		if(this.sTipoReporte.equals("RELACIONES")) {//isEsReporteRelaciones
			parameters.put("SUBREPORT_DIR", sPathReportes);
		}
		
		parameters.put("con_grafico", this.conGraficoReporte);
		
		JasperReport jasperReport = (JasperReport)JRLoader.loadObject(reportFile);
				
		this.cargarDatosCliente();
		
		ArrayList<Classe> classes=new ArrayList<Classe>();		
		
		if(this.sTipoReporte.equals("RELACIONES")) {//isEsReporteRelaciones
			
			classes.add(new Classe(AutoriConsep.class));
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {		
				try	{
					
					TipoAutoriConsepLogic tipoautoriconsepLogicAuxiliar=new TipoAutoriConsepLogic();
					tipoautoriconsepLogicAuxiliar.setDatosCliente(tipoautoriconsepLogic.getDatosCliente());				
					tipoautoriconsepLogicAuxiliar.setTipoAutoriConseps(tipoautoriconsepsParaReportes);
					
					tipoautoriconsepLogicAuxiliar.cargarRelacionesLoteForeignKeyTipoAutoriConsepWithConnection(); //deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes, "");
					
					tipoautoriconsepsParaReportes=tipoautoriconsepLogicAuxiliar.getTipoAutoriConseps();
					
					//tipoautoriconsepLogic.getNewConnexionToDeep();
					
					//for (TipoAutoriConsep tipoautoriconsep:tipoautoriconsepsParaReportes) {
					//	tipoautoriconsepLogic.deepLoad(tipoautoriconsep, false, DeepLoadType.INCLUDE, classes);
					//}						
					//tipoautoriconsepLogic.commitNewConnexionToDeep();
					
						
				} catch(Exception e) {
					throw e;
					
				} finally {
					//tipoautoriconsepLogic.closeNewConnexionToDeep();
				}
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
			//ARCHITECTURE		
			
		
			
			

			InputStream reportFileAutoriConsep = AuxiliarReportes.class.getResourceAsStream("AutoriConsepDetalleRelacionesDesign.jasper");
			parameters.put("subreport_autoriconsep", reportFileAutoriConsep);
		} else {
			//FK DEBERIA TRAERSE DE ANTEMANO
			
		}
								
		
		//CLASSES PARA REPORTES OBJETOS RELACIONADOS
		if(!this.sTipoReporte.equals("RELACIONES")) {//!isEsReporteRelaciones
			classes=new ArrayList<Classe>();
		}
		
		JRBeanArrayDataSource jrbeanArrayDataSourceTipoAutoriConsep=null;
		
		if(this.sTipoReporteExtra!=null && !this.sTipoReporteExtra.equals("")) {
			TipoAutoriConsepConstantesFunciones.S_TIPOREPORTE_EXTRA=this.sTipoReporteExtra;
		} else {
			TipoAutoriConsepConstantesFunciones.S_TIPOREPORTE_EXTRA="";
		}
		
		jrbeanArrayDataSourceTipoAutoriConsep=new JRBeanArrayDataSource(TipoAutoriConsepJInternalFrame.TraerTipoAutoriConsepBeans(tipoautoriconsepsParaReportes,classes).toArray());
		
		jasperPrint = JasperFillManager.fillReport(jasperReport,parameters,jrbeanArrayDataSourceTipoAutoriConsep);
				
		
		String sPathDest=Constantes.SUNIDAD_ARCHIVOS+":/"+Constantes.SCONTEXTSERVER+"/"+TipoAutoriConsepConstantesFunciones.SCHEMA+"/reportes";
		
		File filePathDest = new File(sPathDest);
		
		if(!filePathDest.exists()) {
			filePathDest.mkdirs();				
		}
				
		String sDestFileName=sPathDest+"/"+TipoAutoriConsepConstantesFunciones.CLASSNAME;
				
		if(this.sTipoArchivoReporte=="VISUALIZAR") {
			JasperViewer jasperViewer = new JasperViewer(jasperPrint,false) ;
			jasperViewer.setVisible(true) ; 

		} else if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML") {	
			//JasperFillManager.fillReportToFile(reportFile.getAbsolutePath(),parameters, new JRBeanArrayDataSource(TipoAutoriConsepBean.TraerTipoAutoriConsepBeans(tipoautoriconsepsParaReportes).toArray()));
							
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
				this.generarExcelReporteTipoAutoriConseps(sAccionBusqueda,sTipoArchivoReporte,tipoautoriconsepsParaReportes);
			
			} else if(this.sTipoReporte.equals("FORMULARIO")){
				this.generarExcelReporteVerticalTipoAutoriConseps(sAccionBusqueda,sTipoArchivoReporte,tipoautoriconsepsParaReportes,false);
			
			} else if(this.sTipoReporte.equals("DINAMICO")){
				
				if(this.sTipoReporteDinamico.equals("NORMAL")) {
					
					this.jButtonGenerarExcelReporteDinamicoTipoAutoriConsepActionPerformed(null);
					//this.generarExcelReporteTipoAutoriConseps(sAccionBusqueda,sTipoArchivoReporte,tipoautoriconsepsParaReportes);
					
				
				} else if(this.sTipoReporteDinamico.equals("FORMULARIO")){
					this.generarExcelReporteVerticalTipoAutoriConseps(sAccionBusqueda,sTipoArchivoReporte,tipoautoriconsepsParaReportes,true);
				
				} else if(this.sTipoReporteDinamico.equals("RELACIONES")){
					this.generarExcelReporteRelacionesTipoAutoriConseps(sAccionBusqueda,sTipoArchivoReporte,tipoautoriconsepsParaReportes,true);
				}
				
			} else if(this.sTipoReporte.equals("RELACIONES")){
				this.generarExcelReporteRelacionesTipoAutoriConseps(sAccionBusqueda,sTipoArchivoReporte,tipoautoriconsepsParaReportes,false);
			}
		}
		
		if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML"||this.sTipoArchivoReporte=="WORD"||this.sTipoArchivoReporte=="EXCEL") {				
			JOptionPane.showMessageDialog(this,"REPORTE "+sDestFileName+" GENERADO SATISFACTORIAMENTE","REPORTES ",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteTipoAutoriConseps(String sAccionBusqueda,String sTipoArchivoReporte,List<TipoAutoriConsep> tipoautoriconsepsParaReportes) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tipoautoriconsep";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("TipoAutoriConseps");
         
        int iRow = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderTipoAutoriConsep("NORMAL",row,workbook);
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux=null;
		
		int i=0;
		
      	for(TipoAutoriConsep tipoautoriconsep : tipoautoriconsepsParaReportes) {            
			row = sheet.createRow(iRow++);
			iCell = 0;
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				cellStyleDataAux=cellStyleData;
			}
			
			TipoAutoriConsepConstantesFunciones.generarExcelReporteDataTipoAutoriConsep("NORMAL",row,workbook,tipoautoriconsep,cellStyleDataAux);
		
			
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
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipoautoriconsepSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Autorizacion Consep",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteHeaderTipoAutoriConsep(String sTipo,Row row,Workbook workbook) {
		
		TipoAutoriConsepConstantesFunciones.generarExcelReporteHeaderTipoAutoriConsep(sTipo,row,workbook);
		
		/*
		Cell cell=null;
		int iCell=0;
		
		CellStyle cellStyle = workbook.createCellStyle();
		cellStyle.setFillBackgroundColor(IndexedColors.GREEN.getIndex());
		cellStyle.setFillPattern(CellStyle.ALIGN_FILL);
		*/
		
	}
	
	public void generarExcelReporteVerticalTipoAutoriConseps(String sAccionBusqueda,String sTipoArchivoReporte,List<TipoAutoriConsep> tipoautoriconsepsParaReportes,Boolean paraDinamico) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tipoautoriconsep_vertical";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("TipoAutoriConseps");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		CellStyle cellStyle = Funciones2.getStyleTitulo(workbook,"ZEBRA");;
		
		CellStyle cellStyleTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL_VERTICAL");
		
		
		for(TipoAutoriConsep tipoautoriconsep : tipoautoriconsepsParaReportes) {
			row = sheet.createRow(iRow++);
			iRowLast=iRow - 1;
			
			cell = row.createCell(0);
			cell.setCellValue(TipoAutoriConsepConstantesFunciones.getTipoAutoriConsepDescripcion(tipoautoriconsep));
			cell.setCellStyle(cellStyleTitulo);
			
			sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
	
			


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(TipoAutoriConsepConstantesFunciones.LABEL_CODIGO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(TipoAutoriConsepConstantesFunciones.LABEL_CODIGO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(tipoautoriconsep.getcodigo());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(TipoAutoriConsepConstantesFunciones.LABEL_NOMBRE))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(TipoAutoriConsepConstantesFunciones.LABEL_NOMBRE);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(tipoautoriconsep.getnombre());


			}						
        }
        
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipoautoriconsepSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Autorizacion Consep",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteRelacionesTipoAutoriConseps(String sAccionBusqueda,String sTipoArchivoReporte,List<TipoAutoriConsep> tipoautoriconsepsParaReportes,Boolean paraDinamico) throws Exception {
		
		ArrayList<Classe> classes=new ArrayList<Classe>();
		List<TipoAutoriConsep> tipoautoriconsepsRespaldo=null;
		
		classes=TipoAutoriConsepConstantesFunciones.getClassesRelationshipsOfTipoAutoriConsep(new ArrayList<Classe>(),DeepLoadType.NONE,false);
					
		this.datosDeep=new DatosDeep();
		
		this.datosDeep.setIsDeep(false);
		this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
		this.datosDeep.setClases(classes);
			
		this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
		this.datosCliente.setIsConDeep(true);	
		this.datosCliente.setIsConExportar(false);
		
						
		this.tipoautoriconsepLogic.setDatosCliente(this.datosCliente);
		this.tipoautoriconsepLogic.setDatosDeep(this.datosDeep);
		this.tipoautoriconsepLogic.setIsConDeep(true);
		
		tipoautoriconsepsRespaldo=this.tipoautoriconsepLogic.getTipoAutoriConseps();
		
		this.tipoautoriconsepLogic.setTipoAutoriConseps(tipoautoriconsepsParaReportes);	
		this.tipoautoriconsepLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
		
		tipoautoriconsepsParaReportes=this.tipoautoriconsepLogic.getTipoAutoriConseps();
		this.tipoautoriconsepLogic.setTipoAutoriConseps(tipoautoriconsepsRespaldo);
		
		
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tipoautoriconsep_relacion";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("TipoAutoriConseps");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderTipoAutoriConsep("NORMAL",row,workbook);
		
		int i=0;
		int i2=0;
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL");
		CellStyle cellStyleDataZebra = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux =null;
		CellStyle cellStyleDataAuxHijo =null;
		
		for(TipoAutoriConsep tipoautoriconsep : tipoautoriconsepsParaReportes) {			
			if(i!=0) {
				row = sheet.createRow(iRow++);				
				this.generarExcelReporteHeaderTipoAutoriConsep("NORMAL",row,workbook);
			}
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				//cellStyleDataAux=cellStyleData;
			}
			
			row = sheet.createRow(iRow++);						
			TipoAutoriConsepConstantesFunciones.generarExcelReporteDataTipoAutoriConsep("NORMAL",row,workbook,tipoautoriconsep,cellStyleDataAux);
		
			
			


				//AutoriConsep
			if(!paraDinamico || (paraDinamico && this.existeRelacionReporteDinamico(AutoriConsepConstantesFunciones.SCLASSWEBTITULO))) {

				if(tipoautoriconsep.getAutoriConseps()!=null && tipoautoriconsep.getAutoriConseps().size()>0) {
					row = sheet.createRow(iRow++);

					iCell=1;iRowLast=iRow-1; cell = row.createCell(iCell++);cell.setCellStyle(cellStyleDataTitulo);sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,1,5));
					cell.setCellValue(AutoriConsepConstantesFunciones.SCLASSWEBTITULO);

					row = sheet.createRow(iRow++);
					AutoriConsepConstantesFunciones.generarExcelReporteHeaderAutoriConsep("RELACIONADO",row,workbook);
				}

				if(tipoautoriconsep.getAutoriConseps()!=null) {
					i2=0;
					for(AutoriConsep autoriconsep : tipoautoriconsep.getAutoriConseps()) {
						row = sheet.createRow(iRow++);

						cellStyleDataAuxHijo=null;
						if(i2%2==0) {
							cellStyleDataAuxHijo=cellStyleData;
						}

						AutoriConsepConstantesFunciones.generarExcelReporteDataAutoriConsep("RELACIONADO",row,workbook,autoriconsep,cellStyleDataAuxHijo);
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
		cell.setCellValue(TipoAutoriConsepConstantesFunciones.getTipoAutoriConsepDescripcion(tipoautoriconsep));
		cell.setCellStyle(cellStyleTitulo);
			
		sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
		*/
		
			
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipoautoriconsepSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Autorizacion Consep",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	
	public Boolean existeColumnaReporteDinamico(String sColumna) {
		Boolean existe=false;
		
		Reporte reporte=new Reporte();
		
		
		for(int index:this.jInternalFrameReporteDinamicoTipoAutoriConsep.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoTipoAutoriConsep.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
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
		
		
		for(int index:this.jInternalFrameReporteDinamicoTipoAutoriConsep.getjListRelacionesSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoTipoAutoriConsep.getjListRelacionesSelectReporte().getModel().getElementAt(index);
			
			if(sColumna.equals(reporte.getsCodigo())) {
				existe=true;
				break;
			}
		
		}
		
		
		return existe;
	}
	
	public void startProcessTipoAutoriConsep() throws Exception {		
		this.startProcessTipoAutoriConsep(true);
	}
	
	public void startProcessTipoAutoriConsep(Boolean conSplash) throws Exception {		
		//FuncionesSwing.enableDisablePanels(false,this.jTabbedPaneBusquedasTipoAutoriConsep ,this.jPanelParametrosReportesTipoAutoriConsep, this.jScrollPanelDatosTipoAutoriConsep,this.jPanelPaginacionTipoAutoriConsep, this.jScrollPanelDatosEdicionTipoAutoriConsep, this.jPanelAccionesTipoAutoriConsep,this.jPanelAccionesFormularioTipoAutoriConsep,this.jmenuBarTipoAutoriConsep,this.jmenuBarDetalleTipoAutoriConsep,this.jTtoolBarTipoAutoriConsep,this.jTtoolBarDetalleTipoAutoriConsep);		
		
		final JTabbedPane jTabbedPaneBusquedasTipoAutoriConsep=this.jTabbedPaneBusquedasTipoAutoriConsep; 
		
		final JPanel jPanelParametrosReportesTipoAutoriConsep=this.jPanelParametrosReportesTipoAutoriConsep;
		//final JScrollPane jScrollPanelDatosTipoAutoriConsep=this.jScrollPanelDatosTipoAutoriConsep;
		final JTable jTableDatosTipoAutoriConsep=this.jTableDatosTipoAutoriConsep;		
		final JPanel jPanelPaginacionTipoAutoriConsep=this.jPanelPaginacionTipoAutoriConsep;
		//final JScrollPane jScrollPanelDatosEdicionTipoAutoriConsep=this.jScrollPanelDatosEdicionTipoAutoriConsep;
		final JPanel jPanelAccionesTipoAutoriConsep=this.jPanelAccionesTipoAutoriConsep;
		
		JPanel jPanelCamposAuxiliarTipoAutoriConsep=new JPanelMe();
		JPanel jPanelAccionesFormularioAuxiliarTipoAutoriConsep=new JPanelMe();
		
		if(this.jInternalFrameDetalleFormTipoAutoriConsep!=null) {
			jPanelCamposAuxiliarTipoAutoriConsep=this.jInternalFrameDetalleFormTipoAutoriConsep.jPanelCamposTipoAutoriConsep;
			jPanelAccionesFormularioAuxiliarTipoAutoriConsep=this.jInternalFrameDetalleFormTipoAutoriConsep.jPanelAccionesFormularioTipoAutoriConsep;
		}
		
		final JPanel jPanelCamposTipoAutoriConsep=jPanelCamposAuxiliarTipoAutoriConsep;
		final JPanel jPanelAccionesFormularioTipoAutoriConsep=jPanelAccionesFormularioAuxiliarTipoAutoriConsep;
		
		
		final JMenuBar jmenuBarTipoAutoriConsep=this.jmenuBarTipoAutoriConsep;
		final JToolBar jTtoolBarTipoAutoriConsep=this.jTtoolBarTipoAutoriConsep;		
		
		
		JMenuBar jmenuBarDetalleAuxiliarTipoAutoriConsep=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarTipoAutoriConsep=new JToolBar();		
		
		if(this.jInternalFrameDetalleFormTipoAutoriConsep!=null) {
			jmenuBarDetalleAuxiliarTipoAutoriConsep=this.jInternalFrameDetalleFormTipoAutoriConsep.jmenuBarDetalleTipoAutoriConsep;
			jTtoolBarDetalleAuxiliarTipoAutoriConsep=this.jInternalFrameDetalleFormTipoAutoriConsep.jTtoolBarDetalleTipoAutoriConsep;
		}
		
		final JMenuBar jmenuBarDetalleTipoAutoriConsep=jmenuBarDetalleAuxiliarTipoAutoriConsep;
		final JToolBar jTtoolBarDetalleTipoAutoriConsep=jTtoolBarDetalleAuxiliarTipoAutoriConsep;		
		
		
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasTipoAutoriConsep;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesTipoAutoriConsep;
			processRunnable.jTableDatos=jTableDatosTipoAutoriConsep;
			processRunnable.jPanelCampos=jPanelCamposTipoAutoriConsep;
			processRunnable.jPanelPaginacion=jPanelPaginacionTipoAutoriConsep;
			processRunnable.jPanelAcciones=jPanelAccionesTipoAutoriConsep;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioTipoAutoriConsep;
			
			
			processRunnable.jmenuBar=jmenuBarTipoAutoriConsep;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleTipoAutoriConsep;
			processRunnable.jTtoolBar=jTtoolBarTipoAutoriConsep;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleTipoAutoriConsep;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasTipoAutoriConsep ,jPanelParametrosReportesTipoAutoriConsep,jTableDatosTipoAutoriConsep, /*jScrollPanelDatosTipoAutoriConsep,*/jPanelCamposTipoAutoriConsep,jPanelPaginacionTipoAutoriConsep, /*jScrollPanelDatosEdicionTipoAutoriConsep,*/ jPanelAccionesTipoAutoriConsep,jPanelAccionesFormularioTipoAutoriConsep,jmenuBarTipoAutoriConsep,jmenuBarDetalleTipoAutoriConsep,jTtoolBarTipoAutoriConsep,jTtoolBarDetalleTipoAutoriConsep);
		
			startProcess();//this.
		}
						
		/*
		if(conSplash) {
			SwingUtilities.invokeLater(new Runnable() {
			      public void run() {
			    	  try {
							FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasTipoAutoriConsep ,jPanelParametrosReportesTipoAutoriConsep, jScrollPanelDatosTipoAutoriConsep,jPanelPaginacionTipoAutoriConsep, jScrollPanelDatosEdicionTipoAutoriConsep, jPanelAccionesTipoAutoriConsep,jPanelAccionesFormularioTipoAutoriConsep,jmenuBarTipoAutoriConsep,jmenuBarDetalleTipoAutoriConsep,jTtoolBarTipoAutoriConsep,jTtoolBarDetalleTipoAutoriConsep);
						
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
	
	public void finishProcessTipoAutoriConsep() {// throws Exception 
		this.finishProcessTipoAutoriConsep(true);
	}
	
	public void finishProcessTipoAutoriConsep(Boolean conSplash) {// throws Exception 
		//FuncionesSwing.enableDisablePanels(true,this.jTabbedPaneBusquedasTipoAutoriConsep ,this.jPanelParametrosReportesTipoAutoriConsep, this.jScrollPanelDatosTipoAutoriConsep,this.jPanelPaginacionTipoAutoriConsep, this.jScrollPanelDatosEdicionTipoAutoriConsep, this.jPanelAccionesTipoAutoriConsep,this.jPanelAccionesFormularioTipoAutoriConsep,this.jmenuBarTipoAutoriConsep,this.jmenuBarDetalleTipoAutoriConsep,this.jTtoolBarTipoAutoriConsep,this.jTtoolBarDetalleTipoAutoriConsep);		
		
		final JTabbedPane jTabbedPaneBusquedasTipoAutoriConsep=this.jTabbedPaneBusquedasTipoAutoriConsep; 
		
		final JPanel jPanelParametrosReportesTipoAutoriConsep=this.jPanelParametrosReportesTipoAutoriConsep;
		//final JScrollPane jScrollPanelDatosTipoAutoriConsep=this.jScrollPanelDatosTipoAutoriConsep;
		final JTable jTableDatosTipoAutoriConsep=this.jTableDatosTipoAutoriConsep;		
		final JPanel jPanelPaginacionTipoAutoriConsep=this.jPanelPaginacionTipoAutoriConsep;
		//final JScrollPane jScrollPanelDatosEdicionTipoAutoriConsep=this.jScrollPanelDatosEdicionTipoAutoriConsep;
		final JPanel jPanelAccionesTipoAutoriConsep=this.jPanelAccionesTipoAutoriConsep;
		
		JPanel jPanelCamposAuxiliarTipoAutoriConsep=new JPanel();
		JPanel jPanelAccionesFormularioAuxiliarTipoAutoriConsep=new JPanel();
		
		if(this.jInternalFrameDetalleFormTipoAutoriConsep!=null) {
			jPanelCamposAuxiliarTipoAutoriConsep=this.jInternalFrameDetalleFormTipoAutoriConsep.jPanelCamposTipoAutoriConsep;
			jPanelAccionesFormularioAuxiliarTipoAutoriConsep=this.jInternalFrameDetalleFormTipoAutoriConsep.jPanelAccionesFormularioTipoAutoriConsep;
		}
		
		final JPanel jPanelCamposTipoAutoriConsep=jPanelCamposAuxiliarTipoAutoriConsep;
		final JPanel jPanelAccionesFormularioTipoAutoriConsep=jPanelAccionesFormularioAuxiliarTipoAutoriConsep;
		
		
		final JMenuBar jmenuBarTipoAutoriConsep=this.jmenuBarTipoAutoriConsep;		
		final JToolBar jTtoolBarTipoAutoriConsep=this.jTtoolBarTipoAutoriConsep;
				
		JMenuBar jmenuBarDetalleAuxiliarTipoAutoriConsep=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarTipoAutoriConsep=new JToolBar();
		
		if(this.jInternalFrameDetalleFormTipoAutoriConsep!=null) {
			jmenuBarDetalleAuxiliarTipoAutoriConsep=this.jInternalFrameDetalleFormTipoAutoriConsep.jmenuBarDetalleTipoAutoriConsep;
			jTtoolBarDetalleAuxiliarTipoAutoriConsep=this.jInternalFrameDetalleFormTipoAutoriConsep.jTtoolBarDetalleTipoAutoriConsep;		
		}
		
		final JMenuBar jmenuBarDetalleTipoAutoriConsep=jmenuBarDetalleAuxiliarTipoAutoriConsep;
		final JToolBar jTtoolBarDetalleTipoAutoriConsep=jTtoolBarDetalleAuxiliarTipoAutoriConsep;
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasTipoAutoriConsep;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesTipoAutoriConsep;
			processRunnable.jTableDatos=jTableDatosTipoAutoriConsep;
			processRunnable.jPanelCampos=jPanelCamposTipoAutoriConsep;
			processRunnable.jPanelPaginacion=jPanelPaginacionTipoAutoriConsep;
			processRunnable.jPanelAcciones=jPanelAccionesTipoAutoriConsep;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioTipoAutoriConsep;
			
			
			processRunnable.jmenuBar=jmenuBarTipoAutoriConsep;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleTipoAutoriConsep;
			processRunnable.jTtoolBar=jTtoolBarTipoAutoriConsep;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleTipoAutoriConsep;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			if(conSplash) {
				SwingUtilities.invokeLater(new RunnableProceso(true,this,jTabbedPaneBusquedasTipoAutoriConsep ,jPanelParametrosReportesTipoAutoriConsep, jTableDatosTipoAutoriConsep,/*jScrollPanelDatosTipoAutoriConsep,*/jPanelCamposTipoAutoriConsep,jPanelPaginacionTipoAutoriConsep, /*jScrollPanelDatosEdicionTipoAutoriConsep,*/ jPanelAccionesTipoAutoriConsep,jPanelAccionesFormularioTipoAutoriConsep,jmenuBarTipoAutoriConsep,jmenuBarDetalleTipoAutoriConsep,jTtoolBarTipoAutoriConsep,jTtoolBarDetalleTipoAutoriConsep));
			}
		}						
	}
	
	/*
	public void habilitarDeshabilitarControlesTipoAutoriConsep(Boolean esHabilitar,Boolean conDetalle) {
		this.habilitarDeshabilitarToolBarTipoAutoriConsep(esHabilitar,conDetalle);
		this.habilitarDeshabilitarMenuTipoAutoriConsep(esHabilitar,conDetalle);
	}
	
	public void habilitarDeshabilitarToolBarTipoAutoriConsep(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jTtoolBarTipoAutoriConsep,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jTtoolBarDetalleTipoAutoriConsep,esHabilitar,1,1);
		}
	}
	
	public void habilitarDeshabilitarMenuTipoAutoriConsep(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jmenuBarTipoAutoriConsep,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jmenuBarDetalleTipoAutoriConsep,esHabilitar,1,1);
		}
	}
	*/
	
	
	
	public void procesarBusqueda(String sAccionBusqueda) throws Exception {		
		String  finalQueryPaginacion=this.tipoautoriconsepConstantesFunciones.getsFinalQueryTipoAutoriConsep();
		String  finalQueryPaginacionTodos=this.tipoautoriconsepConstantesFunciones.getsFinalQueryTipoAutoriConsep();
		
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
		
		ArrayList<String> arrColumnasGlobalesNo=TipoAutoriConsepConstantesFunciones.getArrayColumnasGlobalesNoTipoAutoriConsep(this.arrDatoGeneral);
		ArrayList<String> arrColumnasGlobales=TipoAutoriConsepConstantesFunciones.getArrayColumnasGlobalesTipoAutoriConsep(this.arrDatoGeneral,arrColumnasGlobalesNo);
		
			
		String  finalQueryGlobal="";
		
		finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,!esBusqueda,esBusqueda,arrColumnasGlobales,TipoAutoriConsepConstantesFunciones.TABLENAME);
		
		String sOrderBy="";
		
		
		sOrderBy=Funciones2.getFinalQueryOrderBy(this.arrOrderBy);
		
		
		if(!sOrderBy.equals("")) {			
			finalQueryPaginacion=sOrderBy;
			finalQueryPaginacionTodos=sOrderBy;
		}
		
		
		//INICIALIZA ELIMINADOS
		this.tipoautoriconsepsEliminados= new ArrayList<TipoAutoriConsep>();
		
		if(!this.isEntroOnLoad) {
			this.onLoad();
		}/* else {
			this.isEntroOnLoad=false;
		}*/
		
		
		
				
		try	{		
			
			//this.startProcessTipoAutoriConsep();
		
				///*TipoAutoriConsepSessionBean*/this.tipoautoriconsepSessionBean=new TipoAutoriConsepSessionBean();
			
			if(this.tipoautoriconsepSessionBean==null) {
				this.tipoautoriconsepSessionBean=new TipoAutoriConsepSessionBean();
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
					this.iNumeroPaginacion=TipoAutoriConsepConstantesFunciones.INUMEROPAGINACION;
				}
			}
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);
			
			this.cargarDatosCliente();
			
			ArrayList<Classe> classes=new ArrayList<Classe>();
			
			classes=TipoAutoriConsepConstantesFunciones.getClassesForeignKeysOfTipoAutoriConsep(new ArrayList<Classe>(),DeepLoadType.NONE);
			
		
			this.datosDeep=new DatosDeep();
			this.datosDeep.setIsDeep(false);
			this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
			this.datosDeep.setClases(classes);
			
			this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
			this.datosCliente.setIsConDeep(true);
			
			if(false) {//this.conExportar
				this.datosCliente.setIsConExportar(true);
				this.datosCliente.setDatosExportarParametros(Funciones2.getTipoExportar(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getcon_exportar_cabecera(),Funciones2.getTipoDelimiter(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getpath_exportar()+"/tipoautoriconsep."+Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario));
			} else {
				this.datosCliente.setIsConExportar(false);
			}
			
			tipoautoriconsepsAux= new ArrayList<TipoAutoriConsep>();
			
				
			tipoautoriconsepLogic.setDatosCliente(this.datosCliente);
			tipoautoriconsepLogic.setDatosDeep(this.datosDeep);
			tipoautoriconsepLogic.setIsConDeep(true);
			
			
			tipoautoriconsepLogic.getTipoAutoriConsepDataAccess().setIsForForeingsKeysDataRelationships(true);
			
			if(sAccionBusqueda.equals("Todos") || sAccionBusqueda.equals("Query"))	{	
				if(sAccionBusqueda.equals("Todos")) {
					//FALTA:PARA BUSQUEDAS POR CAMPO EN FORMULARIO
					//this.sFinalQueryGeneral="";
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacionTodos );
					
					tipoautoriconsepLogic.getTodosTipoAutoriConseps(finalQueryGlobal,pagination);
					
					//tipoautoriconsepLogic.getTodosTipoAutoriConsepsWithConnection(finalQueryGlobal,pagination);										
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
				
				if(tipoautoriconsepLogic.getTipoAutoriConseps()==null|| tipoautoriconsepLogic.getTipoAutoriConseps().size()==0)	{
					
				
				}
				
				if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(-1);
						this.pagination.setiMaxResults(-1);
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							tipoautoriconsepsAux= new ArrayList<TipoAutoriConsep>();
							tipoautoriconsepsAux.addAll(tipoautoriconsepLogic.getTipoAutoriConseps());						
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							tipoautoriconsepsAux= new ArrayList<TipoAutoriConsep>();
							tipoautoriconsepsAux.addAll(tipoautoriconseps);
						}
						//ARCHITECTURE
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							tipoautoriconsepLogic.getTodosTipoAutoriConseps(finalQueryGlobal+"",this.pagination);												
							
							//tipoautoriconsepLogic.getTodosTipoAutoriConsepsWithConnection(finalQueryGlobal+"",this.pagination);												
						} else if(Constantes.ISUSAEJBREMOTE) {
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
					}
					
					this.generarReporteTipoAutoriConseps("Todos",tipoautoriconsepLogic.getTipoAutoriConseps() );
					
					if(false) {//isMostrarTodosResultadosReporte						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							tipoautoriconsepLogic.setTipoAutoriConseps(new ArrayList<TipoAutoriConsep>());					
							tipoautoriconsepLogic.getTipoAutoriConseps().addAll(tipoautoriconsepsAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							tipoautoriconseps=new ArrayList<TipoAutoriConsep>();
							tipoautoriconseps.addAll(tipoautoriconsepsAux);
						}
						//ARCHITECTURE
						
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);														
					}
				}
			}
			else if(sAccionBusqueda.equals("PorId")) {
				Long idTipoAutoriConsep=0L;
				
				if(this.idActual!=null && this.idActual!=0L) {
					idTipoAutoriConsep=this.idActual;
				
				} else if(this.idTipoAutoriConsepActual!=null && this.idTipoAutoriConsepActual!=0L) {
					idTipoAutoriConsep=idTipoAutoriConsepActual;
				}
				
					
				this.sDetalleReporte=TipoAutoriConsepConstantesFunciones.getDetalleIndicePorId(idTipoAutoriConsep);
				
				this.tipoautoriconseps=new ArrayList<TipoAutoriConsep>();
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {					
					tipoautoriconsepLogic.getEntity(idTipoAutoriConsep);
					
					//tipoautoriconsepLogic.getEntityWithConnection(idTipoAutoriConsep);
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
								
				if(Constantes.ISUSAEJBLOGICLAYER) {
					tipoautoriconsepLogic.setTipoAutoriConseps(new ArrayList<TipoAutoriConsep>());
					tipoautoriconsepLogic.getTipoAutoriConseps().add(tipoautoriconsepLogic.getTipoAutoriConsep());
				
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.tipoautoriconseps=new ArrayList<TipoAutoriConsep>();
					this.tipoautoriconseps.add(tipoautoriconsep);
				}
				
				if(tipoautoriconsepLogic.getTipoAutoriConsep()==null)	{
					
				
				}			
			}
			
		
			else if(sAccionBusqueda.equals("BusquedaPorCodigo")) {
				this.sDetalleReporte=TipoAutoriConsepConstantesFunciones.getDetalleIndiceBusquedaPorCodigo(codigoBusquedaPorCodigo);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					tipoautoriconsepLogic.getTipoAutoriConsepsBusquedaPorCodigo(finalQueryGlobal,pagination,codigoBusquedaPorCodigo);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=TipoAutoriConsepConstantesFunciones.getDetalleIndiceBusquedaPorCodigo(codigoBusquedaPorCodigo);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=TipoAutoriConsepConstantesFunciones.getDetalleIndiceBusquedaPorCodigo(codigoBusquedaPorCodigo);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=tipoautoriconsepLogic.getTipoAutoriConseps()==null||tipoautoriconsepLogic.getTipoAutoriConseps().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=tipoautoriconseps==null|| tipoautoriconseps.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						tipoautoriconsepsAux=new ArrayList<TipoAutoriConsep>();
						tipoautoriconsepsAux.addAll(tipoautoriconsepLogic.getTipoAutoriConseps());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							tipoautoriconsepsAux=new ArrayList<TipoAutoriConsep>();
							tipoautoriconsepsAux.addAll(tipoautoriconseps);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							tipoautoriconsepLogic.getTipoAutoriConsepsBusquedaPorCodigo(finalQueryGlobal,pagination,codigoBusquedaPorCodigo);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=TipoAutoriConsepConstantesFunciones.getDetalleIndiceBusquedaPorCodigo(codigoBusquedaPorCodigo);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=TipoAutoriConsepConstantesFunciones.getDetalleIndiceBusquedaPorCodigo(codigoBusquedaPorCodigo);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteTipoAutoriConseps("BusquedaPorCodigo",tipoautoriconsepLogic.getTipoAutoriConseps());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteTipoAutoriConseps("BusquedaPorCodigo",tipoautoriconseps);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						tipoautoriconsepLogic.setTipoAutoriConseps(new ArrayList<TipoAutoriConsep>());
						tipoautoriconsepLogic.getTipoAutoriConseps().addAll(tipoautoriconsepsAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							tipoautoriconseps=new ArrayList<TipoAutoriConsep>();
							tipoautoriconseps.addAll(tipoautoriconsepsAux);
						}
						//ARCHITECTURE
					}
				}

			}
			else if(sAccionBusqueda.equals("BusquedaPorNombre")) {
				this.sDetalleReporte=TipoAutoriConsepConstantesFunciones.getDetalleIndiceBusquedaPorNombre(nombreBusquedaPorNombre);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					tipoautoriconsepLogic.getTipoAutoriConsepsBusquedaPorNombre(finalQueryGlobal,pagination,nombreBusquedaPorNombre);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=TipoAutoriConsepConstantesFunciones.getDetalleIndiceBusquedaPorNombre(nombreBusquedaPorNombre);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=TipoAutoriConsepConstantesFunciones.getDetalleIndiceBusquedaPorNombre(nombreBusquedaPorNombre);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=tipoautoriconsepLogic.getTipoAutoriConseps()==null||tipoautoriconsepLogic.getTipoAutoriConseps().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=tipoautoriconseps==null|| tipoautoriconseps.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						tipoautoriconsepsAux=new ArrayList<TipoAutoriConsep>();
						tipoautoriconsepsAux.addAll(tipoautoriconsepLogic.getTipoAutoriConseps());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							tipoautoriconsepsAux=new ArrayList<TipoAutoriConsep>();
							tipoautoriconsepsAux.addAll(tipoautoriconseps);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							tipoautoriconsepLogic.getTipoAutoriConsepsBusquedaPorNombre(finalQueryGlobal,pagination,nombreBusquedaPorNombre);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=TipoAutoriConsepConstantesFunciones.getDetalleIndiceBusquedaPorNombre(nombreBusquedaPorNombre);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=TipoAutoriConsepConstantesFunciones.getDetalleIndiceBusquedaPorNombre(nombreBusquedaPorNombre);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteTipoAutoriConseps("BusquedaPorNombre",tipoautoriconsepLogic.getTipoAutoriConseps());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteTipoAutoriConseps("BusquedaPorNombre",tipoautoriconseps);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						tipoautoriconsepLogic.setTipoAutoriConseps(new ArrayList<TipoAutoriConsep>());
						tipoautoriconsepLogic.getTipoAutoriConseps().addAll(tipoautoriconsepsAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							tipoautoriconseps=new ArrayList<TipoAutoriConsep>();
							tipoautoriconseps.addAll(tipoautoriconsepsAux);
						}
						//ARCHITECTURE
					}
				}

			} 
		
		
		
		this.redimensionarTablaDatos();
		//this.refrescarForeignKeysDescripcionesTipoAutoriConsep();
		
		
		if(this.conTotales) {
			this.crearFilaTotales();
		}		
		} catch (JRException e) {
			throw e;
		} catch(Exception e) {
			throw e;
      	} finally {
      		//this.finishProcessTipoAutoriConsep();
      	}
		
	}				
	
	public void redimensionarTablaDatos() throws Exception {
		int iSizeTabla=0;
				
		iSizeTabla=this.getSizeTablaDatos();
		
		//ARCHITECTURE
		/*
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=tipoautoriconsepLogic.getTipoAutoriConseps().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=tipoautoriconseps.size();
		}
		*/
		//ARCHITECTURE
											
		this.redimensionarTablaDatos(iSizeTabla);		
	}
	
	public Integer getSizeTablaDatos() throws Exception {
		Integer iSizeTabla=0;
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=tipoautoriconsepLogic.getTipoAutoriConseps().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=tipoautoriconseps.size();
		}
		//ARCHITECTURE
											
		return iSizeTabla;		
	}
	
			
	public Boolean permiteMantenimiento(TipoAutoriConsep tipoautoriconsep) {
		Boolean permite=true;
		
		if(this.tipoautoriconsep.getsType().equals(Constantes2.S_TOTALES)) {
			permite=false;
		}
		
		return permite;
	}
	
	public void traerValoresTablaTotales() throws Exception {
	}
	
	
	public void traerValoresTablaOrderBy() throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.arrOrderBy=TipoAutoriConsepConstantesFunciones.getOrderByListaTipoAutoriConsep();							
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.arrOrderBy=TipoAutoriConsepConstantesFunciones.getOrderByListaTipoAutoriConsep();
		}		
	}
	
	
	public Boolean existeFilaTotales() throws Exception {
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(TipoAutoriConsep tipoautoriconsep:tipoautoriconsepLogic.getTipoAutoriConseps()) {
				if(tipoautoriconsep.getsType().equals(Constantes2.S_TOTALES)) {
					tipoautoriconsepTotales=tipoautoriconsep;
					existe=true;
					break;
				}
			}
								
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(TipoAutoriConsep tipoautoriconsep:this.tipoautoriconseps) {
				if(tipoautoriconsep.getsType().equals(Constantes2.S_TOTALES)) {
					tipoautoriconsepTotales=tipoautoriconsep;
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
			this.tipoautoriconsepAux=new TipoAutoriConsep();
			this.tipoautoriconsepAux.setsType(Constantes2.S_TOTALES);
			this.tipoautoriconsepAux.setIsNew(false);
			this.tipoautoriconsepAux.setIsChanged(false);
			this.tipoautoriconsepAux.setIsDeleted(false);
				
			if(Constantes.ISUSAEJBLOGICLAYER) {
				TipoAutoriConsepConstantesFunciones.TotalizarValoresFilaTipoAutoriConsep(this.tipoautoriconsepLogic.getTipoAutoriConseps(),this.tipoautoriconsepAux);
				
				this.tipoautoriconsepLogic.getTipoAutoriConseps().add(this.tipoautoriconsepAux);
				
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				TipoAutoriConsepConstantesFunciones.TotalizarValoresFilaTipoAutoriConsep(this.tipoautoriconseps,this.tipoautoriconsepAux);
				
				this.tipoautoriconseps.add(this.tipoautoriconsepAux);
			}
		}
	}
	
	public void quitarFilaTotales() throws Exception {
		tipoautoriconsepTotales=new TipoAutoriConsep();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.tipoautoriconsepLogic.getTipoAutoriConseps().remove(tipoautoriconsepTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.tipoautoriconseps.remove(tipoautoriconsepTotales);
			}
		}
	}
	
	public void actualizarFilaTotales() throws Exception {
		tipoautoriconsepTotales=new TipoAutoriConsep();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(TipoAutoriConsep tipoautoriconsep:tipoautoriconsepLogic.getTipoAutoriConseps()) {
				if(tipoautoriconsep.getsType().equals(Constantes2.S_TOTALES)) {
					tipoautoriconsepTotales=tipoautoriconsep;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				TipoAutoriConsepConstantesFunciones.TotalizarValoresFilaTipoAutoriConsep(this.tipoautoriconsepLogic.getTipoAutoriConseps(),tipoautoriconsepTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(TipoAutoriConsep tipoautoriconsep:this.tipoautoriconseps) {
				if(tipoautoriconsep.getsType().equals(Constantes2.S_TOTALES)) {
					tipoautoriconsepTotales=tipoautoriconsep;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				TipoAutoriConsepConstantesFunciones.TotalizarValoresFilaTipoAutoriConsep(this.tipoautoriconseps,tipoautoriconsepTotales);
			}
		}
	}		
	
	public void recargarInformacion()throws Exception {
		try {
			sAccionBusqueda="Todos";
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda(sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoAutoriConsepConstantesFunciones.CLASSNAME);
		}	
	}		
	
	
	public void getTipoAutoriConsepsBusquedaPorCodigo()throws Exception {
		try {
			sAccionBusqueda="BusquedaPorCodigo";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getTipoAutoriConsepsBusquedaPorNombre()throws Exception {
		try {
			sAccionBusqueda="BusquedaPorNombre";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	
	
	public void getTipoAutoriConsepsBusquedaPorCodigo(String sFinalQuery,String codigo)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					tipoautoriconsepLogic.getTipoAutoriConsepsBusquedaPorCodigo(sFinalQuery,this.pagination,codigo);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getTipoAutoriConsepsBusquedaPorNombre(String sFinalQuery,String nombre)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					tipoautoriconsepLogic.getTipoAutoriConsepsBusquedaPorNombre(sFinalQuery,this.pagination,nombre);
				
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
	
	public void inicializarPermisosTipoAutoriConsep() {
		this.isPermisoTodoTipoAutoriConsep=false;
		this.isPermisoNuevoTipoAutoriConsep=false;
		this.isPermisoActualizarTipoAutoriConsep=false;
		this.isPermisoActualizarOriginalTipoAutoriConsep=false;
		this.isPermisoEliminarTipoAutoriConsep=false;
		this.isPermisoGuardarCambiosTipoAutoriConsep=false;
		this.isPermisoConsultaTipoAutoriConsep=false;
		this.isPermisoBusquedaTipoAutoriConsep=false;
		this.isPermisoReporteTipoAutoriConsep=false;		
		this.isPermisoOrdenTipoAutoriConsep=false;		
		this.isPermisoPaginacionMedioTipoAutoriConsep=false;		
		this.isPermisoPaginacionAltoTipoAutoriConsep=false;
		this.isPermisoPaginacionTodoTipoAutoriConsep=false;
		this.isPermisoCopiarTipoAutoriConsep=false;		
		this.isPermisoVerFormTipoAutoriConsep=false;		
		this.isPermisoDuplicarTipoAutoriConsep=false;		
		this.isPermisoOrdenTipoAutoriConsep=false;		
	}
	
	public void setPermisosUsuarioTipoAutoriConsep(Boolean isPermiso) {
		this.isPermisoTodoTipoAutoriConsep=isPermiso;
		this.isPermisoNuevoTipoAutoriConsep=isPermiso;
		this.isPermisoActualizarTipoAutoriConsep=isPermiso;
		this.isPermisoActualizarOriginalTipoAutoriConsep=isPermiso;
		this.isPermisoEliminarTipoAutoriConsep=isPermiso;
		this.isPermisoGuardarCambiosTipoAutoriConsep=isPermiso;
		this.isPermisoConsultaTipoAutoriConsep=isPermiso;
		this.isPermisoBusquedaTipoAutoriConsep=isPermiso;
		this.isPermisoReporteTipoAutoriConsep=isPermiso;
		this.isPermisoOrdenTipoAutoriConsep=isPermiso;		
		this.isPermisoPaginacionMedioTipoAutoriConsep=isPermiso;		
		this.isPermisoPaginacionAltoTipoAutoriConsep=isPermiso;		
		this.isPermisoPaginacionTodoTipoAutoriConsep=isPermiso;		
		this.isPermisoCopiarTipoAutoriConsep=isPermiso;		
		this.isPermisoVerFormTipoAutoriConsep=isPermiso;		
		this.isPermisoDuplicarTipoAutoriConsep=isPermiso;
		this.isPermisoOrdenTipoAutoriConsep=isPermiso;
	}
	
	public void setPermisosMantenimientoUsuarioTipoAutoriConsep(Boolean isPermiso) {
		//this.isPermisoTodoTipoAutoriConsep=isPermiso;
		this.isPermisoNuevoTipoAutoriConsep=isPermiso;
		this.isPermisoActualizarTipoAutoriConsep=isPermiso;
		this.isPermisoActualizarOriginalTipoAutoriConsep=isPermiso;
		this.isPermisoEliminarTipoAutoriConsep=isPermiso;
		this.isPermisoGuardarCambiosTipoAutoriConsep=isPermiso;
		//this.isPermisoConsultaTipoAutoriConsep=isPermiso;
		//this.isPermisoBusquedaTipoAutoriConsep=isPermiso;
		//this.isPermisoReporteTipoAutoriConsep=isPermiso;
		//this.isPermisoOrdenTipoAutoriConsep=isPermiso;		
		//this.isPermisoPaginacionMedioTipoAutoriConsep=isPermiso;		
		//this.isPermisoPaginacionAltoTipoAutoriConsep=isPermiso;		
		//this.isPermisoPaginacionTodoTipoAutoriConsep=isPermiso;		
		//this.isPermisoCopiarTipoAutoriConsep=isPermiso;		
		//this.isPermisoDuplicarTipoAutoriConsep=isPermiso;
		//this.isPermisoOrdenTipoAutoriConsep=isPermiso;
	}
	
	public void inicializarSetPermisosUsuarioTipoAutoriConsepClasesRelacionadas() throws Exception {
		ArrayList<String> arrPaginas=new ArrayList<String>();		
		ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
		
		arrPaginas.add(AutoriConsepConstantesFunciones.SNOMBREOPCION);
		
		if(TipoAutoriConsepJInternalFrame.CON_LLAMADA_SIMPLE) {
			this.opcionsRelacionadas.addAll(this.sistemaReturnGeneral.getOpcionsRelacionadas());
			
		} else {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				opcionsFinal=sistemaLogicAdditional.tienePermisosOpcionesEnPaginaWeb(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, arrPaginas);
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
			
			this.opcionsRelacionadas.addAll(opcionsFinal);
		}
		
		

		this.isTienePermisosAutoriConsep=false;
		this.isTienePermisosAutoriConsep=this.verificarGetPermisosUsuarioOpcionTipoAutoriConsepClaseRelacionada(this.opcionsRelacionadas,AutoriConsepConstantesFunciones.SNOMBREOPCION);
		
	}
	
	public Boolean tienePermisosUsuarioEnPaginaWebTipoAutoriConsep(String sPagina) throws Exception {
		Boolean tienePermisos=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tienePermisos=sistemaLogicAdditional.tienePermisosEnPaginaWeb(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, sPagina);
		} else if(Constantes.ISUSAEJBREMOTE) {
		} else if(Constantes.ISUSAEJBHOME) {
		}
		
		return tienePermisos;
	}
	
	public void inicializarSetPermisosUsuarioTipoAutoriConsepClasesRelacionadas(Boolean conPermiso) throws Exception {
		
		this.isTienePermisosAutoriConsep=conPermiso;
	}
	
	public Boolean verificarGetPermisosUsuarioTipoAutoriConsepClaseRelacionada(ArrayList<String> arrPaginasFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioClaseRelacionada(arrPaginasFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public Boolean verificarGetPermisosUsuarioOpcionTipoAutoriConsepClaseRelacionada(List<Opcion> opcionsFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioOpcionClaseRelacionada(opcionsFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public void actualizarTabsSetPermisosUsuarioTipoAutoriConsepClasesRelacionadas() throws Exception {
		

		if(!this.isTienePermisosAutoriConsep && this.jInternalFrameDetalleFormTipoAutoriConsep!=null && this.jInternalFrameDetalleFormTipoAutoriConsep.autoriconsepBeanSwingJInternalFrame!=null) {
			this.jInternalFrameDetalleFormTipoAutoriConsep.jTabbedPaneRelacionesTipoAutoriConsep.remove(this.jInternalFrameDetalleFormTipoAutoriConsep.autoriconsepBeanSwingJInternalFrame.getContentPane());
		}
	}
	
	public void setPermisosUsuarioTipoAutoriConsep() throws Exception {
		
		PerfilOpcion perfilOpcionUsuario=new PerfilOpcion();		
		Long idOpcion=this.opcionActual.getId();
		
		if(TipoAutoriConsepJInternalFrame.CON_LLAMADA_SIMPLE) {
			perfilOpcionUsuario=this.sistemaReturnGeneral.getPerfilOpcion();
			
		} else {
			if(this.tipoautoriconsepSessionBean.getEsGuardarRelacionado()) {
				idOpcion=0L;
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				perfilOpcionUsuario=sistemaLogicAdditional.traerPermisosPaginaWebPerfilOpcion(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, TipoAutoriConsepConstantesFunciones.SNOMBREOPCION,idOpcion);				
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
		}
		
		if(perfilOpcionUsuario!=null && perfilOpcionUsuario.getId()>0) {
			this.isPermisoNuevoTipoAutoriConsep=perfilOpcionUsuario.getingreso()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarTipoAutoriConsep=perfilOpcionUsuario.getmodificacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarOriginalTipoAutoriConsep=this.isPermisoActualizarTipoAutoriConsep;
			this.isPermisoEliminarTipoAutoriConsep=perfilOpcionUsuario.geteliminacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoGuardarCambiosTipoAutoriConsep=perfilOpcionUsuario.getguardar_cambios()||perfilOpcionUsuario.gettodo();
			this.isPermisoConsultaTipoAutoriConsep=perfilOpcionUsuario.getconsulta()||perfilOpcionUsuario.gettodo();
			this.isPermisoBusquedaTipoAutoriConsep=perfilOpcionUsuario.getbusqueda()||perfilOpcionUsuario.gettodo();
			this.isPermisoTodoTipoAutoriConsep=perfilOpcionUsuario.gettodo()||perfilOpcionUsuario.gettodo();
			this.isPermisoReporteTipoAutoriConsep=perfilOpcionUsuario.getreporte()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenTipoAutoriConsep=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionMedioTipoAutoriConsep=perfilOpcionUsuario.getpaginacion_medio()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionAltoTipoAutoriConsep=perfilOpcionUsuario.getpaginacion_alto()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionTodoTipoAutoriConsep=perfilOpcionUsuario.getpaginacion_todo()||perfilOpcionUsuario.gettodo();
			this.isPermisoCopiarTipoAutoriConsep=perfilOpcionUsuario.getcopiar()||perfilOpcionUsuario.gettodo();
			this.isPermisoVerFormTipoAutoriConsep=true;//perfilOpcionUsuario.getver_form()||perfilOpcionUsuario.gettodo();
			this.isPermisoDuplicarTipoAutoriConsep=perfilOpcionUsuario.getduplicar()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenTipoAutoriConsep=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			
			if(this.tipoautoriconsepSessionBean.getEsGuardarRelacionado()) {
				this.opcionActual.setId(perfilOpcionUsuario.getid_opcion());
				
				this.jTableDatosTipoAutoriConsep.setToolTipText(this.jTableDatosTipoAutoriConsep.getToolTipText()+"_"+perfilOpcionUsuario.getid_opcion());		
			}
		} else {
			this.setPermisosUsuarioTipoAutoriConsep(false);
		}
		
		//SI SE NECESITA PONER TODOS LOS PERMISOS POR DEFECTO
		//
		
	}
	
	public void setAccionesUsuarioTipoAutoriConsep(Boolean esParaAccionesFormulario) throws Exception {		
		Reporte reporte=null;
		
		if(!esParaAccionesFormulario) {
			this.accions=new ArrayList<Accion>();
			
			if(TipoAutoriConsepJInternalFrame.CON_LLAMADA_SIMPLE) {
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
			
			if(TipoAutoriConsepJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public void setRelacionesUsuarioTipoAutoriConsep() throws Exception {
		Reporte reporte=null;
		
		

		if(this.isTienePermisosAutoriConsep && this.tipoautoriconsepConstantesFunciones.mostrarAutoriConsepTipoAutoriConsep && !TipoAutoriConsepConstantesFunciones.ISGUARDARREL) {

			reporte=new Reporte();
			reporte.setsCodigo("Autorizaciones Consep");
			reporte.setsDescripcion("Autorizaciones Consep");
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
	
		
	public void inicializarCombosForeignKeyTipoAutoriConsepListas()throws Exception {
		try	{						
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void cargarCombosTodosForeignKeyTipoAutoriConsepListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			String sFinalQueryCombo="";
			
			Modulo  moduloActualAux=new Modulo();
			
			if(TipoAutoriConsepJInternalFrame.ISLOAD_FKLOTE) {
				this.cargarCombosLoteForeignKeyTipoAutoriConsepListas(false);
			} else {
			
			}
		} catch(Exception e) {
			throw e;
		}		
	}		
	
	
	
	public void cargarCombosLoteForeignKeyTipoAutoriConsepListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			Modulo  moduloActualAux=new Modulo();
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void addItemDefectoCombosTodosForeignKeyTipoAutoriConsep()throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	


	
	public void initActionsCombosTodosForeignKeyTipoAutoriConsep()throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void initActionsCombosTodosForeignKeyTipoAutoriConsep(String sFormularioTipoBusqueda)throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	


	
	


	
	public void setVariablesGlobalesCombosForeignKeyTipoAutoriConsep()throws Exception {	
		try {
			if(this.parametroGeneralUsuario!=null && this.parametroGeneralUsuario.getId()>0) {
			
			
			
			}
			
			//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
			this.setVariablesGlobalesAuxiliaresCombosForeignKeyTipoAutoriConsep();
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToFormularioForeignKeyTipoAutoriConsep(TipoAutoriConsep tipoautoriconsep)throws Exception {	
		try {
						
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToListasForeignKeyTipoAutoriConsep(TipoAutoriConsep tipoautoriconsep,String sTipoEvento)throws Exception {	
		try {
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	/*
	public void setVariablesCombosFromBeanForeignKeyTipoAutoriConsep()throws Exception {	
		try {
						
		} catch(Exception e) {
			throw e;
		}
	}
	*/
	
	public void setVariablesGlobalesAuxiliaresCombosForeignKeyTipoAutoriConsep()throws Exception {	
		try {
			
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesDefaultCombosForeignKeyTipoAutoriConsep()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesParametroCombosForeignKeyTipoAutoriConsep()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void cargarCombosParametroTipoAutoriConsep()throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			//this.cargarDatosCliente();
			
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
		
	public void cargarCombosFrameForeignKeyTipoAutoriConsep()throws Exception {
		try {
			


		} catch(Exception e) {
			throw e;
		}		
	}		
	
	public void cargarCombosFrameForeignKeyTipoAutoriConsep(String sFormularioTipoBusqueda)throws Exception {
		try {
			


		} catch(Exception e) {
			throw e;
		}		
	}	
	
	public void setItemDefectoCombosForeignKeyTipoAutoriConsep()throws Exception {
		try {
			


		} catch(Exception e) {
			throw e;
		}		
	}		
	
	
	
	

	public TipoAutoriConsepBeanSwingJInternalFrame() throws Exception {
		super(false,PaginaTipo.PRINCIPAL);
	}
	
	public TipoAutoriConsepBeanSwingJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
	}
	
	public TipoAutoriConsepBeanSwingJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
		
		this.tipoautoriconsepSessionBean=new TipoAutoriConsepSessionBean(); 
		this.tipoautoriconsepConstantesFunciones=new TipoAutoriConsepConstantesFunciones(); 
		this.tipoautoriconsepBean=new TipoAutoriConsep();//(this.tipoautoriconsepConstantesFunciones); 		
		this.tipoautoriconsepReturnGeneral=new TipoAutoriConsepParameterReturnGeneral(); 
		
		this.tipoautoriconsepSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.tipoautoriconsepSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
				
	}
	
	public TipoAutoriConsepBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,cargarTodosDatos);
	}
		
	public TipoAutoriConsepBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,false,false,cargarRelaciones,cargarTodosDatos);
	}	
	
	public TipoAutoriConsepBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos) throws Exception //Boolean esParaBusquedaForeignKey
    {
		super(jdesktopPane,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		try {
			
			this.permiteRecargarForm=false;
			
			this.startProcessTipoAutoriConsep(true);
			
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
			
			this.tipoautoriconsepConstantesFunciones=new TipoAutoriConsepConstantesFunciones(); 
			this.tipoautoriconsepBean=new TipoAutoriConsep();//this.tipoautoriconsepConstantesFunciones); 			
			this.tipoautoriconsepReturnGeneral=new TipoAutoriConsepParameterReturnGeneral(); 
		
			TipoAutoriConsepBeanSwingJInternalFrameAdditional.CargaInicialInicio(this, "NORMAL", null);
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Tipo Autorizacion Consep Mantenimiento",paginaTipo));			
			
			this.conTotales=false;
			
			
			
			this.tipoautoriconsep=new TipoAutoriConsep();
			this.tipoautoriconseps = new ArrayList<TipoAutoriConsep>();
			this.tipoautoriconsepsAux = new ArrayList<TipoAutoriConsep>();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoautoriconsepLogic=new TipoAutoriConsepLogic();
				this.tipoautoriconsepLogic.getNewConnexionToDeep("");
			}
			
			//this.tipoautoriconsepSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
			//this.tipoautoriconsepSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
			
			this.jDesktopPane=jdesktopPane;
			
			if(this.jDesktopPane.getClass().equals(JDesktopPaneMe.class)) {
				this.constantes2=((JDesktopPaneMe)this.jDesktopPane).constantes2;
			}
			
			if(!Constantes.CON_VARIAS_VENTANAS) {
    			MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameDetalleFormTipoAutoriConsep);
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameReporteDinamicoTipoAutoriConsep!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoTipoAutoriConsep);	
					}
					
					if(this.jInternalFrameImportacionTipoAutoriConsep!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionTipoAutoriConsep);							
					}
					
				}
				
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameOrderByTipoAutoriConsep!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameOrderByTipoAutoriConsep);					
					}
					
				}
			}
			
			//DETALLE DATOS
			if(this.jInternalFrameDetalleFormTipoAutoriConsep!=null) { //this.conCargarFormDetalle) {
				this.jDesktopPane.add(this.jInternalFrameDetalleFormTipoAutoriConsep);
				this.jInternalFrameDetalleFormTipoAutoriConsep.setVisible(false);
				this.jInternalFrameDetalleFormTipoAutoriConsep.setSelected(false);						
			}
			
			if(!this.conCargarMinimo) {
				
				//REPORTE DINAMICO
				if(this.jInternalFrameReporteDinamicoTipoAutoriConsep!=null) {
					this.jDesktopPane.add(this.jInternalFrameReporteDinamicoTipoAutoriConsep);
					this.jInternalFrameReporteDinamicoTipoAutoriConsep.setVisible(false);
					this.jInternalFrameReporteDinamicoTipoAutoriConsep.setSelected(false);
				}
				
				//IMPORTACION
				if(this.jInternalFrameImportacionTipoAutoriConsep!=null) {
					this.jDesktopPane.add(this.jInternalFrameImportacionTipoAutoriConsep);
					this.jInternalFrameImportacionTipoAutoriConsep.setVisible(false);
					this.jInternalFrameImportacionTipoAutoriConsep.setSelected(false);
				}
				
				
			}
			
			
			if(!this.conCargarMinimo) {
				
				if(this.jInternalFrameOrderByTipoAutoriConsep!=null) {
					this.jDesktopPane.add(this.jInternalFrameOrderByTipoAutoriConsep);
					this.jInternalFrameOrderByTipoAutoriConsep.setVisible(false);
					this.jInternalFrameOrderByTipoAutoriConsep.setSelected(false);				
				}
				
			}
			
			
			//this.esParaBusquedaForeignKey=false;
			this.esParaBusquedaForeignKey=esParaBusquedaForeignKey;
			
			this.invalidValues=new InvalidValue[0];
			
			
			
			this.idTipoAutoriConsepActual=0L;
			this.rowIndexActual=0;
			
			
			this.iNumeroPaginacionPagina=0;
			this.iNumeroPaginacion=TipoAutoriConsepConstantesFunciones.INUMEROPAGINACION;
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
			
			this.tipoautoriconsepReturnGeneral=new TipoAutoriConsepParameterReturnGeneral();
			
			this.tipoautoriconsepParameterGeneral=new TipoAutoriConsepParameterReturnGeneral();
			
			
			
			this.sistemaLogicAdditional=new SistemaLogicAdditional();
			
			this.sistemaLogicAdditional.setConnexion(this.tipoautoriconsepLogic.getConnexion());			
			
			
			
			
			
			
			
			//VERIFICAR GLOBAL
			this.cargarDatosCliente();			
			
			
			if(!this.tipoautoriconsepSessionBean.getEsGuardarRelacionado()) {
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
			
			if(TipoAutoriConsepJInternalFrame.CON_LLAMADA_SIMPLE) {
				if(this.tipoautoriconsepSessionBean.getEsGuardarRelacionado()) {
					this.opcionActual.setId(0L);
					
					//idOpcion=0L;					
				}
				
				ArrayList<String> arrPaginas=new ArrayList<String>();		
				ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
				
				arrPaginas.add(AutoriConsepConstantesFunciones.SNOMBREOPCION);
		
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					//this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActualWithConnection(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,TipoAutoriConsepConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.tipoautoriconsepSessionBean.getEsGuardarRelacionado(),this.tipoautoriconsepSessionBean.getConGuardarRelaciones(),arrPaginas);
					
					this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActual(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,TipoAutoriConsepConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.tipoautoriconsepSessionBean.getEsGuardarRelacionado(),this.tipoautoriconsepSessionBean.getConGuardarRelaciones(),arrPaginas);
					
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
			
			this.isVisibilidadCeldaNuevoTipoAutoriConsep=false;
			this.isVisibilidadCeldaDuplicarTipoAutoriConsep=true;
			this.isVisibilidadCeldaCopiarTipoAutoriConsep=true;
			this.isVisibilidadCeldaVerFormTipoAutoriConsep=true;
			this.isVisibilidadCeldaOrdenTipoAutoriConsep=true;
			this.isVisibilidadCeldaNuevoRelacionesTipoAutoriConsep=false;
			this.isVisibilidadCeldaModificarTipoAutoriConsep=false;
			this.isVisibilidadCeldaActualizarTipoAutoriConsep=false;
			this.isVisibilidadCeldaEliminarTipoAutoriConsep=false;
			this.isVisibilidadCeldaCancelarTipoAutoriConsep=false;
			this.isVisibilidadCeldaGuardarTipoAutoriConsep=false;
			this.isVisibilidadCeldaGuardarCambiosTipoAutoriConsep=false;
			
			
			this.isVisibilidadBusquedaPorCodigo=true;
			this.isVisibilidadBusquedaPorNombre=true;
			
			//ELEMENTOS TABLAS PARAMETOS
			
			
			
			//ELEMENTOS TABLAS PARAMETOS_FIN
			
			//this.actualizarEstadoCeldasBotonesTipoAutoriConsep("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
						
			
			
			this.inicializarPermisosTipoAutoriConsep();
			
			//INICIALIZAR FALSE, TALVEZ COMENTAR
			this.setPermisosUsuarioTipoAutoriConsep(false);
			
			this.setPermisosUsuarioTipoAutoriConsep();
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.tipoautoriconsepSessionBean.getEsGuardarRelacionado() 
				|| (this.tipoautoriconsepSessionBean.getEsGuardarRelacionado() && this.tipoautoriconsepSessionBean.getConGuardarRelaciones())) {
				
				this.inicializarSetPermisosUsuarioTipoAutoriConsepClasesRelacionadas();
			}
			
			if(this.tipoautoriconsepSessionBean.getConGuardarRelaciones()) {
				this.actualizarTabsSetPermisosUsuarioTipoAutoriConsepClasesRelacionadas();
			}
			
			
			
			//SOLO SE EJECUTA LA PRIMERA VEZ, BINDINGS SI FUNCIONA
			if(!TipoAutoriConsepJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingBotonesPermisosTipoAutoriConsep();
			} else {
				this.inicializarActualizarBindingBotonesPermisosManualTipoAutoriConsep();
			}
			
			if(!this.isPermisoBusquedaTipoAutoriConsep) {
				//BYDAN_BUSQUEDAS
				
				this.jTabbedPaneBusquedasTipoAutoriConsep.setVisible(false);				
				
			}
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.tipoautoriconsepSessionBean.getEsGuardarRelacionado()) {				
				this.tiposArchivosReportes=Funciones.getListTiposArchivosReportes();
				this.tiposArchivosReportesDinamico=Funciones.getListTiposArchivosReportes();
				this.tiposReportes=Funciones.getListTiposReportes(false);
				this.tiposReportesDinamico=Funciones.getListTiposReportesDinamico(false);
				
				
				this.tiposReportes.add(new Reporte("RELACIONES","RELACIONES"));
				this.tiposReportesDinamico.add(new Reporte("RELACIONES","RELACIONES"));
				
				this.tiposGraficosReportes=Funciones2.getListTiposGraficosReportes();
				this.tiposPaginacion=Funciones2.getListTiposPaginacion(this.isPermisoPaginacionMedioTipoAutoriConsep,this.isPermisoPaginacionMedioTipoAutoriConsep,this.isPermisoPaginacionTodoTipoAutoriConsep);
				this.tiposSeleccionar=Funciones2.getListTiposSeleccionar();
				this.tiposSeleccionar.addAll(TipoAutoriConsepConstantesFunciones.getTiposSeleccionarTipoAutoriConsep());
				
				this.tiposColumnasSelect=TipoAutoriConsepConstantesFunciones.getTiposSeleccionarTipoAutoriConsep(true);
				
				this.tiposRelacionesSelect=new ArrayList<Reporte>();								
				
				this.cargarTiposRelacionesSelectTipoAutoriConsep();				
				//this.tiposRelacionesSelect=TipoAutoriConsepConstantesFunciones.getTiposRelacionesTipoAutoriConsep(true);
				
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
			//if(!this.tipoautoriconsepSessionBean.getEsGuardarRelacionado()) {
				//SE ENCUENTRA MAS ADELANTE CON ACCIONES POR USUARIO
				//ACCIONES GENERALES Y POR USUARIO
				this.tiposRelaciones=Funciones2.getListTiposRelaciones();
				this.setRelacionesUsuarioTipoAutoriConsep();
				
				this.tiposAcciones=Funciones2.getListTiposAcciones(false,true,false);
				this.setAccionesUsuarioTipoAutoriConsep(false);	
				
				this.tiposAccionesFormulario=Funciones2.getListTiposAccionesFormulario(false,true,false);							
				this.setAccionesUsuarioTipoAutoriConsep(true);	
				
				this.inicializarActualizarBindingtiposArchivosReportesAccionesTipoAutoriConsep() ;
			
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
			
			
			this.autoriconsepLogic=new AutoriConsepLogic(); 
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
				tipoautoriconsepImplementable= (TipoAutoriConsepImplementable) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+TipoAutoriConsepConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBREMOTE);
			} else if(Constantes.ISUSAEJBHOME) {
				tipoautoriconsepImplementableHome= (TipoAutoriConsepImplementableHome) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+TipoAutoriConsepConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBLOCAL);
			}			
			*/
			
			
			this.tipoautoriconseps= new ArrayList<TipoAutoriConsep>();
			this.tipoautoriconsepsEliminados= new ArrayList<TipoAutoriConsep>();
						
			this.isEsNuevoTipoAutoriConsep=false;
			this.esParaAccionDesdeFormularioTipoAutoriConsep=false;
			this.isEsMantenimientoRelacionesRelacionadoUnico=false;
			this.isEsMantenimientoRelaciones=false;
			this.isEsMantenimientoRelacionado=false;
			this.isContieneImagenes=false;
			
			
			
			
			
			//INICIALIZAR LISTAS FK
			
			
			
			
			
			if(blncargarCombostrForeignKey) {
				this.cargarCombosForeignKeyTipoAutoriConsep(this.isCargarCombosDependencia);
			}
			
			this.cargarCombosParametroTipoAutoriConsep();
			
			
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.tipoautoriconsepSessionBean.getEsGuardarRelacionado()) {
				this.onLoad();
			}
						
			
			/*
			if(blnCargarInformacionInicial) {
				this.recargarInformacion();
			}
			*/
			//this.iNumeroPaginacionPagina=0;
			//this.iNumeroPaginacion=TipoAutoriConsepConstantesFunciones.INUMEROPAGINACION;
			
			this.actualizarEstadoCeldasBotonesTipoAutoriConsep("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			//SOLO LA PRIMERA VEZ HACE LOS BINDINGS, SOLO AHI FUNCIONA
			this.inicializarActualizarBindingTipoAutoriConsep(true); 
			
			//SE REDIMENSIONA SINO NO SE ACTUALIZA
			this.redimensionarTablaDatos();
			
			
			this.initActions();
			
			;
						
			if(this.jInternalFrameDetalleFormTipoAutoriConsep!=null) {//if(this.conCargarFormDetalle) {
				this.cargarMenuRelaciones();
			}
			
			//OBLIGA CARGAR DETALLE, MEJOR DESHABILITAR, FALTA TALVEZ PONER EN SELECCIONAR
			//MAYBE
			//this.updateControlesFormularioTipoAutoriConsep();
			
			if(!this.conCargarMinimo) {
				this.updateBusquedasFormularioTipoAutoriConsep();
			}
			
			
			
			//SE REALIZA ESTO PARA QUE SE PUEDA RECORRER TAB SIN IMPORTAR ORDEN
			Boolean existeTabBusqueda=false;
			
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				
				for(int i=0; i<this.jTabbedPaneBusquedasTipoAutoriConsep.getTabCount(); i++) {
					this.jTabbedPaneBusquedasTipoAutoriConsep.setSelectedIndex(i);
						
					if(!existeTabBusqueda) {
						existeTabBusqueda=true;
					}
				}
					
				if(existeTabBusqueda) {
					this.jTabbedPaneBusquedasTipoAutoriConsep.setSelectedIndex(0);
				}	
				
				
			}
			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoautoriconsepLogic.commitNewConnexionToDeep();
			}
			
			
			if(Constantes2.ISDEVELOPING2) {
				end_time = System.currentTimeMillis();			
				String sTipo="Load Ventana";
				Funciones2.getMensajeTiempoEjecucion(start_time, end_time, sTipo,false);
			}  
			
			this.finishProcessTipoAutoriConsep(true);
			
			this.dEnd=(double)System.currentTimeMillis();
			
			this.dDif=this.dEnd - this.dStart;
			
			if(Constantes.ISDEVELOPING) {
				System.out.println("Tiempo(ms) Carga TipoAutoriConsep: " + this.dDif); 
			}
			
			this.permiteRecargarForm=true;
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoautoriconsepLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,TipoAutoriConsepConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoautoriconsepLogic.closeNewConnexionToDeep();
			}
		}	 
    }
	
	public void cargarTiposRelacionesSelectTipoAutoriConsep() {
		Reporte reporte=new Reporte();
		
	

		reporte=new Reporte();
		reporte.setsCodigo(AutoriConsepConstantesFunciones.SCLASSWEBTITULO);
		reporte.setsDescripcion(AutoriConsepConstantesFunciones.SCLASSWEBTITULO);
		this.tiposRelacionesSelect.add(reporte);
	}
	
	
	
	public void jTabbedPaneChangeListenerGeneral(String sTipo,ChangeEvent evt) { 	  
		Boolean procesaCargarParteTab=false;
			
		try {
			int iIndex=0;		    			
			String sTitle="";
			
			//TABBED PANE RELACIONES
			if(sTipo.equals("RelacionesTipoAutoriConsep")) {
				iIndex=this.jInternalFrameDetalleFormTipoAutoriConsep.jTabbedPaneRelacionesTipoAutoriConsep.getSelectedIndex();		    
			
				sTitle=this.jInternalFrameDetalleFormTipoAutoriConsep.jTabbedPaneRelacionesTipoAutoriConsep.getTitleAt(iIndex);
				
				Integer intSelectedRow = 0;	
			
				intSelectedRow = this.jTableDatosTipoAutoriConsep.getSelectedRow();	
				
				

				if(sTitle.equals("Autorizaciones Consepes")) {
					if(!AutoriConsepJInternalFrame.ESTA_CARGADO_PORPARTE) {
						procesaCargarParteTab=true;
						this.startProcessTipoAutoriConsep();

						this.cargarParteTabPanelRelacionadaAutoriConsep(iIndex,intSelectedRow);
					}
					
				}
				
			}
			
			//TABBED PANE RELACIONES FIN(EXTRA TAB)
			;
			
  		} catch(Exception e) {
  			e.printStackTrace();
  		} finally {
			if(procesaCargarParteTab) {				
				this.finishProcessTipoAutoriConsep();	
			}
		}
    }
	
	

	public void cargarParteTabPanelRelacionadaAutoriConsep(int iIndex,int intSelectedRow) throws Exception {
		this.jInternalFrameDetalleFormTipoAutoriConsep.cargarSessionConBeanSwingJInternalFrameAutoriConsep(false,true,iIndex);
		this.jButtonAutoriConsepActionPerformed(null,intSelectedRow,false,true,null);
		this.redimensionarTablaPanelRelacionadaAutoriConsep();

		//this.jTabbedPaneRelacionesTipoAutoriConsep.updateUI();
		//this.jTabbedPaneRelacionesTipoAutoriConsep.removeTabAt(iIndex);
		//this.jTabbedPaneRelacionesTipoAutoriConsep.setSelectedIndex(iIndex);


	}
	
	public void jButtonRelacionActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
				 if(sTipo.equals("AutoriConsep")) {
				int row=this.jTableDatosTipoAutoriConsep.getSelectedRow();
				jButtonAutoriConsepActionPerformed(evt,row,true,false,null);
				}
  		} catch(Exception e) {
  			e.printStackTrace();
  		}
    }
	
	public void cargarMenuRelaciones() {	
		JMenuItem jmenuItem= new JMenuItem("General");
		String sLabelMenu="";
		
		if(!this.tipoautoriconsepSessionBean.getEsGuardarRelacionado()) {
			for(Reporte reporte:this.tiposRelaciones) {
			

				if(reporte.getsCodigo().equals("Autorizaciones Consep")) {

					if(this.isTienePermisosAutoriConsep && this.tipoautoriconsepConstantesFunciones.mostrarAutoriConsepTipoAutoriConsep && !TipoAutoriConsepConstantesFunciones.ISGUARDARREL) {
						if(Constantes.ISDEVELOPING) {
							sLabelMenu="Autorizaciones Consepes"+"("+AutoriConsepConstantesFunciones.CLASSNAME+")";
						}

						jmenuItem = new JMenuItem(sLabelMenu);
						//jmenuItem.setMnemonic(KeyEvent.VK_S);
						//jmenuItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_S, ActionEvent.ALT_MASK));
						jmenuItem.setActionCommand("Autorizaciones Consepes");

						if(tipoautoriconsepConstantesFunciones.resaltarAutoriConsepTipoAutoriConsep!=null) {
							jmenuItem.setBorderPainted(true);
							jmenuItem.setBorder(tipoautoriconsepConstantesFunciones.resaltarAutoriConsepTipoAutoriConsep);
						}

						jmenuItem.setEnabled(this.tipoautoriconsepConstantesFunciones.activarAutoriConsepTipoAutoriConsep);

						jmenuItem.addActionListener (new MenuItemRelacionActionListener(this,"AutoriConsep"));

						

						this.jInternalFrameDetalleFormTipoAutoriConsep.jmenuDetalleTipoAutoriConsep.add(jmenuItem);

						
					}

					continue;
				}
			}
		}
	}		
	
	public void cargarCombosForeignKeyTipoAutoriConsep(Boolean cargarCombosDependencia) throws Exception {   
		this.cargarCombosForeignKeyTipoAutoriConsep(cargarCombosDependencia,true,true);
	}
	
	//CARGAR COMBOS EN LOTE
	public void cargarCombosForeignKeyTipoAutoriConsep(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales) throws Exception {   
		this.cargarCombosTodosForeignKeyTipoAutoriConsepListas(cargarCombosDependencia);
				
		this.addItemDefectoCombosTodosForeignKeyTipoAutoriConsep();
		
		this.cargarCombosFrameForeignKeyTipoAutoriConsep();						
		
		if(conInitActions) {
			this.initActionsCombosTodosForeignKeyTipoAutoriConsep();
		}
		
		if(conSetVariablesGlobales) {
			this.setVariablesGlobalesCombosForeignKeyTipoAutoriConsep();
		}
	}
	
	
	
	public void jButtonNuevoTipoAutoriConsepActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.FORM_RECARGAR;
			String sTipo="NUEVO_NORMAL";
			
			this.estaModoNuevo=true;
			
			if(this.tipoautoriconsepSessionBean.getConGuardarRelaciones()) {
				this.dStart=(double)System.currentTimeMillis();
			}
				
			//if(this.esUsoDesdeHijo) {
			//	eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
			//}
											
			if(this.jInternalFrameDetalleFormTipoAutoriConsep==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}			
				
			TipoAutoriConsepBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.tipoautoriconsep,new Object(),this.tipoautoriconsepParameterGeneral,this.tipoautoriconsepReturnGeneral);
			
			
			if(jTableDatosTipoAutoriConsep.getRowCount()>=1) {
				jTableDatosTipoAutoriConsep.removeRowSelectionInterval(0, jTableDatosTipoAutoriConsep.getRowCount()-1);						
			}
			
			this.isEsNuevoTipoAutoriConsep=true;
			
			//ESTABLECE SI ES RELACIONADO O NO 
			this.habilitarDeshabilitarTipoMantenimientoTipoAutoriConsep(esRelaciones);
			
			this.nuevoPreparar(false); 
			this.habilitarDeshabilitarControlesTipoAutoriConsep(true);			
			//this.tipoautoriconsep=new TipoAutoriConsep();
			//this.tipoautoriconsep.setIsChanged(true);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesTipoAutoriConsep(false) ;						
			 
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualTipoAutoriConsep() ;
			
			if(TipoAutoriConsepJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleTipoAutoriConsep(esRelaciones);
			}
					
			//Se Duplica, sin sentido
			//this.actualizarInformacion("EVENTO_NUEVO",false,this.tipoautoriconsep);	
			this.actualizarInformacion("INFO_PADRE",false,this.tipoautoriconsep);				
			
			TipoAutoriConsepBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.tipoautoriconsep,new Object(),this.tipoautoriconsepParameterGeneral,this.tipoautoriconsepReturnGeneral);
			
			if(this.tipoautoriconsepSessionBean.getConGuardarRelaciones()) {
				this.dEnd=(double)System.currentTimeMillis();					
				this.dDif=this.dEnd - this.dStart;
					
				if(Constantes.ISDEVELOPING) {
					System.out.println("Tiempo(ms) Nuevo Preparar TipoAutoriConsep: " + this.dDif); 
				}
			}
			
			//false para que pueda generar eventos
			this.estaModoNuevo=false;
							
			//Con this.estaModoNuevo=false;, se permite actualizar y usar eventos control al mismo tiempo (FuncionTipo.LAST)			
			TipoAutoriConsepBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.LAST,ControlTipo.FORM,EventoTipo.CLIC,EventoSubTipo.NEW,sTipo,this.tipoautoriconsep,new Object(),this.tipoautoriconsepParameterGeneral,this.tipoautoriconsepReturnGeneral);
			
		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,TipoAutoriConsepConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;			
		}
	}
	
	public void jButtonDuplicarTipoAutoriConsepActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			Boolean soloDuplicarUno=false;
			Boolean conSeleccionarFilaTabla=false;
			
			this.estaModoNuevo=true;
			this.estaModoDuplicar=true;
			
			ArrayList<TipoAutoriConsep> tipoautoriconsepsSeleccionados=new ArrayList<TipoAutoriConsep>();
			int intSelectedRow =-1;
			Integer iNumRowsSeleccionados=0;
			int[] arrNumRowsSeleccionados=null;
			
			//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
			if(conSeleccionarFilaTabla) {
				arrNumRowsSeleccionados=this.jTableDatosTipoAutoriConsep.getSelectedRows();
				iNumRowsSeleccionados=this.jTableDatosTipoAutoriConsep.getSelectedRows().length;			
			}
			
			tipoautoriconsepsSeleccionados=this.getTipoAutoriConsepsSeleccionados(false);
				
			if((soloDuplicarUno && iNumRowsSeleccionados.equals(1)) || !soloDuplicarUno) {
				//LO HACE NUEVOPREPARAR
				//this.iIdNuevoTipoAutoriConsep--;			
				//TipoAutoriConsep tipoautoriconsepAux= new TipoAutoriConsep();			
				//tipoautoriconsepAux.setId(this.iIdNuevoTipoAutoriConsep);																
				
				//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
				//TipoAutoriConsep tipoautoriconsepOrigen=new TipoAutoriConsep();
				//for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {				
				
				for(TipoAutoriConsep tipoautoriconsepOrigen : tipoautoriconsepsSeleccionados) {
					if(conSeleccionarFilaTabla) {
						if(!soloDuplicarUno) {
							//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
							//intSelectedRow =iNumRowSeleccionado;
						} else {
							intSelectedRow = this.jTableDatosTipoAutoriConsep.getSelectedRow();
						}
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							tipoautoriconsepOrigen =(TipoAutoriConsep) this.tipoautoriconsepLogic.getTipoAutoriConseps().toArray()[this.jTableDatosTipoAutoriConsep.convertRowIndexToModel(intSelectedRow)];
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							tipoautoriconsepOrigen =(TipoAutoriConsep) this.tipoautoriconseps.toArray()[this.jTableDatosTipoAutoriConsep.convertRowIndexToModel(intSelectedRow)];
						}
					}
					
					this.aumentarTamanioFilaNuevaTablaTipoAutoriConsep();
					
					if(this.conTotales) {
						this.quitarFilaTotales();
					}
					
					this.nuevoPreparar(true);
					
					this.tipoautoriconsep.setsType("DUPLICADO");
					
					this.setCopiarVariablesObjetosTipoAutoriConsep(tipoautoriconsepOrigen,this.tipoautoriconsep,true,true);
					
					this.setVariablesFormularioToObjetoActualForeignKeysTipoAutoriConsep(this.tipoautoriconsep);
					
					//LO HACE NUEVOPREPARAR
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.tipoautoriconsepLogic.getTipoAutoriConseps().add(this.tipoautoriconsepAux);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.tipoautoriconseps.add(this.tipoautoriconsepAux);				
					}
					*/
				}
				
				this.inicializarActualizarBindingTablaTipoAutoriConsep(false);
				
				this.jTableDatosTipoAutoriConsep.setRowSelectionInterval(this.getIndiceNuevoTipoAutoriConsep(), this.getIndiceNuevoTipoAutoriConsep());
				
				int iLastRow =  this.jTableDatosTipoAutoriConsep.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosTipoAutoriConsep.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosTipoAutoriConsep.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaTipoAutoriConsep(false);
				}
			} else {
				throw new Exception("DEBE ESTAR SELECCIONADO 1 REGISTRO");
			}
			
		} catch(Exception e) {			
			FuncionesSwing.manageException(this, e,logger,TipoAutoriConsepConstantesFunciones.CLASSNAME);
		
		} finally {
			this.estaModoNuevo=false;
			this.estaModoDuplicar=false;
		}
	}
	
	public void jButtonCopiarTipoAutoriConsepActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			Boolean conSeleccionarFilaTabla=false;
			Integer iNumRowsSeleccionados=0;
			int[] intSelectedRows =null;
			int intSelectedRow =0;
			
			this.estaModoCopiar=true;
			
			ArrayList<TipoAutoriConsep> tipoautoriconsepsSeleccionados=new ArrayList<TipoAutoriConsep>();									
		
			TipoAutoriConsep tipoautoriconsepOrigen=new TipoAutoriConsep();
			TipoAutoriConsep tipoautoriconsepDestino=new TipoAutoriConsep();
				
			tipoautoriconsepsSeleccionados=this.getTipoAutoriConsepsSeleccionados(false);
			
			if(conSeleccionarFilaTabla) {
				iNumRowsSeleccionados=this.jTableDatosTipoAutoriConsep.getSelectedRows().length;	
			}
			
			if(iNumRowsSeleccionados.equals(2) || tipoautoriconsepsSeleccionados.size()==2) {
				if(conSeleccionarFilaTabla) {
					intSelectedRows =this.jTableDatosTipoAutoriConsep.getSelectedRows();
					intSelectedRow = intSelectedRows[0];	
									
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						tipoautoriconsepOrigen =(TipoAutoriConsep) this.tipoautoriconsepLogic.getTipoAutoriConseps().toArray()[this.jTableDatosTipoAutoriConsep.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						tipoautoriconsepOrigen =(TipoAutoriConsep) this.tipoautoriconseps.toArray()[this.jTableDatosTipoAutoriConsep.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					intSelectedRow = intSelectedRows[1];
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						tipoautoriconsepDestino =(TipoAutoriConsep) this.tipoautoriconsepLogic.getTipoAutoriConseps().toArray()[this.jTableDatosTipoAutoriConsep.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						tipoautoriconsepDestino =(TipoAutoriConsep) this.tipoautoriconseps.toArray()[this.jTableDatosTipoAutoriConsep.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				}
				
				tipoautoriconsepOrigen =tipoautoriconsepsSeleccionados.get(0);
				tipoautoriconsepDestino =tipoautoriconsepsSeleccionados.get(1);
				
				this.setCopiarVariablesObjetosTipoAutoriConsep(tipoautoriconsepOrigen,tipoautoriconsepDestino,true,false);
				
				tipoautoriconsepDestino.setsType("DUPLICADO");
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(tipoautoriconsepDestino,tipoautoriconsepLogic.getTipoAutoriConseps());					
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(tipoautoriconsepDestino,tipoautoriconseps);
				}
				//ARCHITECTURE
				
				this.inicializarActualizarBindingTablaTipoAutoriConsep(false);
				
				//this.jTableDatosTipoAutoriConsep.setRowSelectionInterval(this.getIndiceNuevoTipoAutoriConsep(), this.getIndiceNuevoTipoAutoriConsep());
				
				int iLastRow =  this.jTableDatosTipoAutoriConsep.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosTipoAutoriConsep.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosTipoAutoriConsep.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					//this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaTipoAutoriConsep(false);
				}
			} else {
				throw new Exception("DEBEN ESTAR SELECCIONADOS 2 REGISTROS");
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoAutoriConsepConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.estaModoCopiar=false;
		}
	}
	
	public void jButtonVerFormTipoAutoriConsepActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormTipoAutoriConsep==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.jInternalFrameDetalleFormTipoAutoriConsep.setSelected(true);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoAutoriConsepConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonMostrarOcultarTipoAutoriConsepActionPerformed(ActionEvent evt) throws Exception {   
		try {
			Boolean isVisible=this.jPanelParametrosReportesTipoAutoriConsep.isVisible();
			
			//BYDAN_BUSQUEDAS
			
			this.jTabbedPaneBusquedasTipoAutoriConsep.setVisible(!isVisible);			
			
			
			this.jPanelParametrosReportesTipoAutoriConsep.setVisible(!isVisible);
			this.jPanelPaginacionTipoAutoriConsep.setVisible(!isVisible);
			this.jPanelAccionesTipoAutoriConsep.setVisible(!isVisible);
							
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoAutoriConsepConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarTipoAutoriConsepActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.closingInternalFrameTipoAutoriConsep();
			
			//if(this.jInternalFrameParent==null) {
				//this.dispose();
			/*} else {
				this.setVisible(false);
	        	this.setSelected(false);	
			}*/			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoAutoriConsepConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarReporteDinamicoTipoAutoriConsepActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameReporteDinamicoTipoAutoriConsep();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoAutoriConsepConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarImportacionTipoAutoriConsepActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameImportacionTipoAutoriConsep();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoAutoriConsepConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonAbrirOrderByTipoAutoriConsepActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			
			this.abrirInicializarFrameOrderByTipoAutoriConsep();
			
			this.abrirFrameOrderByTipoAutoriConsep();
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoAutoriConsepConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarOrderByTipoAutoriConsepActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameOrderByTipoAutoriConsep();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoAutoriConsepConstantesFunciones.CLASSNAME);
		}
	}
	
	public void abrirFrameDetalleTipoAutoriConsep(Boolean esRelaciones) throws Exception {	    	        
	    try {
			//CAUSA PROBLEMAS, SE ADICIONA EN CONSTRUCTOR, LUEGO SOLO VISIBLE true y false
			//this.jDesktopPane.add(jInternalFrameDetalleFormTipoAutoriConsep);
			
			if(!esRelaciones) {
				if(this.jInternalFrameDetalleFormTipoAutoriConsep.isMaximum()) {
					this.jInternalFrameDetalleFormTipoAutoriConsep.setMaximum(false);
				}								
				
	    		this.jInternalFrameDetalleFormTipoAutoriConsep.setSize(this.jInternalFrameDetalleFormTipoAutoriConsep.iWidthFormulario,this.jInternalFrameDetalleFormTipoAutoriConsep.iHeightFormulario);
	    	} else {
				if(this.iWidthScroll<this.jInternalFrameDetalleFormTipoAutoriConsep.iWidthFormularioMaximo) {
	    			this.jInternalFrameDetalleFormTipoAutoriConsep.setSize(this.iWidthScroll,this.iHeightScroll);
				} else {
					if(!this.jInternalFrameDetalleFormTipoAutoriConsep.isMaximum()) {
						this.jInternalFrameDetalleFormTipoAutoriConsep.setMaximum(true);
					}
				}
				
				if(this.jInternalFrameDetalleFormTipoAutoriConsep.jContentPaneDetalleTipoAutoriConsep.getWidth() > this.getWidth()) {
					this.jInternalFrameDetalleFormTipoAutoriConsep.jTabbedPaneRelacionesTipoAutoriConsep.setMinimumSize(new Dimension(this.jInternalFrameDetalleFormTipoAutoriConsep.jContentPaneDetalleTipoAutoriConsep.getWidth(),TipoAutoriConsepConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormTipoAutoriConsep.jTabbedPaneRelacionesTipoAutoriConsep.setMaximumSize(new Dimension(this.jInternalFrameDetalleFormTipoAutoriConsep.jContentPaneDetalleTipoAutoriConsep.getWidth(),TipoAutoriConsepConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormTipoAutoriConsep.jTabbedPaneRelacionesTipoAutoriConsep.setPreferredSize(new Dimension(this.jInternalFrameDetalleFormTipoAutoriConsep.jContentPaneDetalleTipoAutoriConsep.getWidth(),TipoAutoriConsepConstantesFunciones.ALTO_TABPANE_RELACIONES));
					
					Dimension dimension=new Dimension(); 
					
					

					if(AutoriConsepJInternalFrame.ESTA_CARGADO_PORPARTE) {
						this.redimensionarTablaPanelRelacionadaAutoriConsep();
					}
					
				}
	    	}
			
		
	       	this.jInternalFrameDetalleFormTipoAutoriConsep.setVisible(true);
	        this.jInternalFrameDetalleFormTipoAutoriConsep.setSelected(true);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoAutoriConsepConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirInicializarFrameOrderByTipoAutoriConsep() throws Exception {	    	        
	    try {
			if(this.jInternalFrameOrderByTipoAutoriConsep==null) {
				
				if(!this.conCargarMinimo) {
					this.jInternalFrameOrderByTipoAutoriConsep=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByTipoAutoriConsep,false,this);
				} else {
					this.jInternalFrameOrderByTipoAutoriConsep=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByTipoAutoriConsep,true,this);
				}
				
				this.jDesktopPane.add(this.jInternalFrameOrderByTipoAutoriConsep);
				this.jInternalFrameOrderByTipoAutoriConsep.setVisible(false);
				this.jInternalFrameOrderByTipoAutoriConsep.setSelected(false);
				
				this.jInternalFrameOrderByTipoAutoriConsep.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByTipoAutoriConsep"));
				
				this.inicializarActualizarBindingTablaOrderByTipoAutoriConsep();
			}
		} catch (final Exception e) {
			
		}
	}
	
	
	
	public void abrirInicializarFrameImportacionTipoAutoriConsep() throws Exception {	    	        
	    try {
			if(this.jInternalFrameImportacionTipoAutoriConsep==null) {
				
				this.jInternalFrameImportacionTipoAutoriConsep=new ImportacionJInternalFrame(TipoAutoriConsepConstantesFunciones.SCLASSWEBTITULO,this);			
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionTipoAutoriConsep);							
				
				this.jDesktopPane.add(this.jInternalFrameImportacionTipoAutoriConsep);
				this.jInternalFrameImportacionTipoAutoriConsep.setVisible(false);
				this.jInternalFrameImportacionTipoAutoriConsep.setSelected(false);


				this.jInternalFrameImportacionTipoAutoriConsep.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionTipoAutoriConsep"));
				this.jInternalFrameImportacionTipoAutoriConsep.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionTipoAutoriConsep"));
				this.jInternalFrameImportacionTipoAutoriConsep.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionTipoAutoriConsep"));


			}
		} catch (final Exception e) {
			
		}
	}		
	
	
	
	public void abrirInicializarFrameReporteDinamicoTipoAutoriConsep() throws Exception {	    	        
	    try {
			
			if(this.jInternalFrameReporteDinamicoTipoAutoriConsep==null) {
				this.jInternalFrameReporteDinamicoTipoAutoriConsep=new ReporteDinamicoJInternalFrame(TipoAutoriConsepConstantesFunciones.SCLASSWEBTITULO,this);	
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoTipoAutoriConsep);	
	
	
				this.jDesktopPane.add(this.jInternalFrameReporteDinamicoTipoAutoriConsep);
				this.jInternalFrameReporteDinamicoTipoAutoriConsep.setVisible(false);
				this.jInternalFrameReporteDinamicoTipoAutoriConsep.setSelected(false);
	
	
	
				this.jInternalFrameReporteDinamicoTipoAutoriConsep.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoTipoAutoriConsep"));
				this.jInternalFrameReporteDinamicoTipoAutoriConsep.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoTipoAutoriConsep"));
				this.jInternalFrameReporteDinamicoTipoAutoriConsep.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoTipoAutoriConsep"));
	
				this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualTipoAutoriConsep();
			}

		} catch (final Exception e) {
			
		}
	}	
	
	
	
		

	public void redimensionarTablaPanelRelacionadaAutoriConsep() {
		Dimension dimension=new Dimension();

		dimension=this.jInternalFrameDetalleFormTipoAutoriConsep.autoriconsepBeanSwingJInternalFrame.jScrollPanelDatosAutoriConsep.getPreferredSize();
		dimension.setSize(this.jInternalFrameDetalleFormTipoAutoriConsep.jContentPaneDetalleTipoAutoriConsep.getWidth(),dimension.getHeight());

		this.jInternalFrameDetalleFormTipoAutoriConsep.autoriconsepBeanSwingJInternalFrame.jScrollPanelDatosAutoriConsep.setMinimumSize(dimension);
		this.jInternalFrameDetalleFormTipoAutoriConsep.autoriconsepBeanSwingJInternalFrame.jScrollPanelDatosAutoriConsep.setMaximumSize(dimension);
		this.jInternalFrameDetalleFormTipoAutoriConsep.autoriconsepBeanSwingJInternalFrame.jScrollPanelDatosAutoriConsep.setPreferredSize(dimension);


	}
					
	public void cerrarFrameDetalleTipoAutoriConsep() throws Exception {	    	        
	    try {
			//this.jDesktopPane.add(jInternalFrameDetalleFormTipoAutoriConsep);
			
	       	this.jInternalFrameDetalleFormTipoAutoriConsep.setVisible(false);
	        this.jInternalFrameDetalleFormTipoAutoriConsep.setSelected(false);
			
			//this.jInternalFrameDetalleFormTipoAutoriConsep.dispose();
			//this.jInternalFrameDetalleFormTipoAutoriConsep=null;
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoAutoriConsepConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirFrameReporteDinamicoTipoAutoriConsep() throws Exception {	    	        
	    try {
			
			this.jInternalFrameReporteDinamicoTipoAutoriConsep.setVisible(true);
	        this.jInternalFrameReporteDinamicoTipoAutoriConsep.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoAutoriConsepConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void abrirFrameImportacionTipoAutoriConsep() throws Exception {	    	        		
	    try {			
			this.jInternalFrameImportacionTipoAutoriConsep.setVisible(true);
	        this.jInternalFrameImportacionTipoAutoriConsep.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoAutoriConsepConstantesFunciones.CLASSNAME);
	    }		
	}	
	
	
	
	
	
	public void abrirFrameOrderByTipoAutoriConsep() throws Exception {	    	        		
	    try {
			this.jInternalFrameOrderByTipoAutoriConsep.setVisible(true);
	        this.jInternalFrameOrderByTipoAutoriConsep.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoAutoriConsepConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameOrderByTipoAutoriConsep() throws Exception {	    	        		
	    try {			
			this.jInternalFrameOrderByTipoAutoriConsep.setVisible(false);
	        this.jInternalFrameOrderByTipoAutoriConsep.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoAutoriConsepConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameReporteDinamicoTipoAutoriConsep() throws Exception {			
	    try {
			this.jInternalFrameReporteDinamicoTipoAutoriConsep.setVisible(false);
	        this.jInternalFrameReporteDinamicoTipoAutoriConsep.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoAutoriConsepConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameImportacionTipoAutoriConsep() throws Exception {	    	        		
	    try {
			this.jInternalFrameImportacionTipoAutoriConsep.setVisible(false);
	        this.jInternalFrameImportacionTipoAutoriConsep.setSelected(false);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoAutoriConsepConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	
	public void jButtonModificarTipoAutoriConsepActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.modificarTipoAutoriConsep(evt,-1,false);
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoAutoriConsepConstantesFunciones.CLASSNAME);
		}
	}
	
	public void modificarTipoAutoriConsep(ActionEvent evt,int rowIndex,Boolean esRelaciones) throws Exception {   
		try {
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosTipoAutoriConsep.getSelectedRow();
			}
			
			this.habilitarDeshabilitarControlesTipoAutoriConsep(true);
			//this.isEsNuevoTipoAutoriConsep=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoautoriconsep =(TipoAutoriConsep) this.tipoautoriconsepLogic.getTipoAutoriConseps().toArray()[this.jTableDatosTipoAutoriConsep.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.tipoautoriconsep =(TipoAutoriConsep) this.tipoautoriconseps.toArray()[this.jTableDatosTipoAutoriConsep.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.actualizarEstadoCeldasBotonesTipoAutoriConsep("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesTipoAutoriConsep(false) ;
			
			if(tipoautoriconsepSessionBean.getConGuardarRelaciones()) {
			

				if(this.jInternalFrameDetalleFormTipoAutoriConsep.autoriconsepBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoAutoriConsep.autoriconsepBeanSwingJInternalFrame.autoriconsepSessionBean.getEsGuardarRelacionado() && AutoriConsepJInternalFrame.ESTA_CARGADO_PORPARTE) {
					this.jButtonAutoriConsepActionPerformed(null,intSelectedRow,false,true,null);
				}
			}
			
			if(TipoAutoriConsepJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleTipoAutoriConsep(esRelaciones);
			}
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualTipoAutoriConsep(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoAutoriConsepConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarFilaTablaTipoAutoriConsepActual() { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL
			Integer intSelectedRow = this.jTableDatosTipoAutoriConsep.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoautoriconsep =(TipoAutoriConsep) this.tipoautoriconsepLogic.getTipoAutoriConseps().toArray()[this.jTableDatosTipoAutoriConsep.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipoautoriconsep =(TipoAutoriConsep) this.tipoautoriconseps.toArray()[this.jTableDatosTipoAutoriConsep.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoAutoriConsepConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void seleccionarTipoAutoriConsep(ActionEvent evt,int rowIndex) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormTipoAutoriConsep==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosTipoAutoriConsep.getSelectedRow();
			}
			
			//this.habilitarDeshabilitarControlesTipoAutoriConsep(true);
			//this.isEsNuevoTipoAutoriConsep=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoautoriconsep =(TipoAutoriConsep) this.tipoautoriconsepLogic.getTipoAutoriConseps().toArray()[this.jTableDatosTipoAutoriConsep.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.tipoautoriconsep =(TipoAutoriConsep) this.tipoautoriconseps.toArray()[this.jTableDatosTipoAutoriConsep.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.jInternalFrameParent.setIdCombosCodigoDesdeBusquedaForeignKey(this.tipoautoriconsep.getId(),this.sTipoBusqueda);
			
			this.dispose();
			
			//this.actualizarEstadoCeldasBotonesTipoAutoriConsep("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			/*
			this.inicializarActualizarBindingBotonesTipoAutoriConsep(false) ;
			
			if(TipoAutoriConsepJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleTipoAutoriConsep(esRelaciones);
			}
			*/
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualTipoAutoriConsep(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoAutoriConsepConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void setIdCombosCodigoDesdeBusquedaForeignKey(Long id,String sType)throws Exception{
		
		try {
		} catch(Exception e) {
			throw e;
		}
	}
	
	
	
	
	public void jButtonActualizarTipoAutoriConsepActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoautoriconsepLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingParametrosReportesTipoAutoriConsep(false);
			
			//if(!this.isEsNuevoTipoAutoriConsep) {								
				int intSelectedRow = this.jTableDatosTipoAutoriConsep.getSelectedRow();	
				
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoautoriconsep =(TipoAutoriConsep) this.tipoautoriconsepLogic.getTipoAutoriConseps().toArray()[this.jTableDatosTipoAutoriConsep.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.tipoautoriconsep =(TipoAutoriConsep) this.tipoautoriconseps.toArray()[this.jTableDatosTipoAutoriConsep.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
			//}
				
			if(TipoAutoriConsepJInternalFrame.ISBINDING_MANUAL_TABLA) {
				this.setVariablesFormularioToObjetoActualTipoAutoriConsep(this.tipoautoriconsep,true);
				this.setVariablesFormularioToObjetoActualForeignKeysTipoAutoriConsep(this.tipoautoriconsep);
				
			}
			
			if(this.permiteMantenimiento(this.tipoautoriconsep)) {	
				this.actualizar();
				
				if(!this.isGuardarCambiosEnLote && !this.tipoautoriconsepSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
					
					this.isEsNuevoTipoAutoriConsep=true;
					this.inicializarActualizarBindingTablaTipoAutoriConsep(false);
					this.isEsNuevoTipoAutoriConsep=false;
				
				} else {					
					
					//PARA RELACIONADO ACTUALIZAR FILA TOTALES
					this.isEsNuevoTipoAutoriConsep=true;
					this.procesoActualizarFilaTotales(false,"MANTENIMIENTO");
					this.isEsNuevoTipoAutoriConsep=false;
				}
						
								
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesTipoAutoriConsep(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualTipoAutoriConsep(false);
				
				this.habilitarDeshabilitarControlesTipoAutoriConsep(false);
			
												
				
				if(TipoAutoriConsepJInternalFrame.CON_DATOS_FRAME) {
					if(!this.isPostAccionSinCerrar) {
						this.cerrarFrameDetalleTipoAutoriConsep();
					}
				}
				
				if(this.isPostAccionNuevo) {
					this.jButtonNuevoTipoAutoriConsepActionPerformed(evt,tipoautoriconsepSessionBean.getConGuardarRelaciones());
				} else {
					if(this.isPostAccionSinCerrar) {
						Integer intSelectedRowActual=this.getIndiceActualTipoAutoriConsep(this.tipoautoriconsep,intSelectedRow);
						
						if(intSelectedRow>-1) {
							this.jTableDatosTipoAutoriConsep.setRowSelectionInterval(intSelectedRowActual, intSelectedRowActual);
							this.jButtonIdActionPerformed(evt,intSelectedRowActual,tipoautoriconsepSessionBean.getConGuardarRelaciones(),false);
						}
					}
				}
				
				this.cancelar(false);
				
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoautoriconsepLogic.commitNewConnexionToDeep();
			}
			
			
			if(this.jInternalFrameParent!=null) { //&& this.isEsMantenimientoRelacionado) {
				Boolean esUsoDesdeHijoLocal=true;
				String sTipo="Formulario";
				Boolean conIrServidorAplicacionParent=false;
				Long id=this.tipoautoriconsep.getId();
				ArrayList<String> arrClasses=new ArrayList<String>();
				
				GeneralEntityParameterGeneral generalEntityParameterGeneral=new GeneralEntityParameterGeneral();
				
				generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
				generalEntityParameterGeneral.setsDominio("Formulario");
				generalEntityParameterGeneral.setsDominioTipo(TipoAutoriConsep.class.getName());
				
				this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoAutoriConsep.class.getName(),sTipo,"FORMULARIO",esControlTabla,conIrServidorAplicacionParent,
					id,this, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.FORM,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
					evt,generalEntityParameterGeneral,this);
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoautoriconsepLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,TipoAutoriConsepConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoautoriconsepLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonEliminarTipoAutoriConsepActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoautoriconsepLogic.getNewConnexionToDeep("");
			}
			
			int intSelectedRow = this.jTableDatosTipoAutoriConsep.getSelectedRow();	       
							
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoautoriconsep =(TipoAutoriConsep) this.tipoautoriconsepLogic.getTipoAutoriConseps().toArray()[this.jTableDatosTipoAutoriConsep.convertRowIndexToModel(intSelectedRow)];
				this.tipoautoriconsep.setIsDeleted(true);
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.tipoautoriconsep =(TipoAutoriConsep) this.tipoautoriconseps.toArray()[this.jTableDatosTipoAutoriConsep.convertRowIndexToModel(intSelectedRow)];
				this.tipoautoriconsep.setIsDeleted(true);
			}
			//ARCHITECTURE
			
			if(this.permiteMantenimiento(this.tipoautoriconsep)) {
				this.eliminar();
				
				if(!this.isGuardarCambiosEnLote && !this.tipoautoriconsepSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
				}
				
				((TipoAutoriConsepModel) this.jTableDatosTipoAutoriConsep.getModel()).fireTableRowsDeleted(intSelectedRow,intSelectedRow);
				
				this.isEsNuevoTipoAutoriConsep=true;
				this.inicializarActualizarBindingTablaTipoAutoriConsep(false);
				this.isEsNuevoTipoAutoriConsep=false;									
					
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesTipoAutoriConsep(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualTipoAutoriConsep(false);
				
				this.habilitarDeshabilitarControlesTipoAutoriConsep(false);
				
				
				
				if(TipoAutoriConsepJInternalFrame.CON_DATOS_FRAME) {
					this.cerrarFrameDetalleTipoAutoriConsep();
				}
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoautoriconsepLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoautoriconsepLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,TipoAutoriConsepConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoautoriconsepLogic.closeNewConnexionToDeep();
			}
		}		
	}
		
	public void jButtonCancelarTipoAutoriConsepActionPerformed(ActionEvent evt) throws Exception {                                         	   	       
	  	try {
			if(jTableDatosTipoAutoriConsep.getRowCount()>=1) {
				jTableDatosTipoAutoriConsep.removeRowSelectionInterval(0, jTableDatosTipoAutoriConsep.getRowCount()-1);						
			}
						
			this.invalidValues=new InvalidValue[0];
			this.habilitarDeshabilitarControlesTipoAutoriConsep(false);
			this.cancelar(true);			
			this.inicializarActualizarBindingTablaTipoAutoriConsep(false);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesTipoAutoriConsep(false) ;
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualTipoAutoriConsep(false) ;
			
			this.isEsNuevoTipoAutoriConsep=false;
			
			if(TipoAutoriConsepJInternalFrame.CON_DATOS_FRAME) {
				this.cerrarFrameDetalleTipoAutoriConsep();
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoAutoriConsepConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonGuardarCambiosTipoAutoriConsepActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoautoriconsepLogic.getNewConnexionToDeep("");
			}
			
			//this.estaModoGuardarCambios=true;
			
	    	this.guardarCambios();
			
			if(!this.isErrorGuardar) {
				this.procesarBusqueda(this.sAccionBusqueda);
				
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingTipoAutoriConsep(false);
				
				//SI ES MANUAL
				if(TipoAutoriConsepJInternalFrame.ISBINDING_MANUAL) {				
					//this.inicializarActualizarBindingManualTipoAutoriConsep();				
				}
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoautoriconsepLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoautoriconsepLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,TipoAutoriConsepConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoautoriconsepLogic.closeNewConnexionToDeep();
			}
			
			//this.estaModoGuardarCambios=false;
		}
	}
	
	public void jButtonNuevoGuardarCambiosTipoAutoriConsepActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			this.estaModoNuevo=true;
			this.estaModoNuevoGuardarCambios=true;
			
			//LO HACE NUEVOPREPARAR
			//this.iIdNuevoTipoAutoriConsep--;			
			//TipoAutoriConsep tipoautoriconsepAux= new TipoAutoriConsep();			
			//tipoautoriconsepAux.setId(this.iIdNuevoTipoAutoriConsep);
			
			if(this.jInternalFrameDetalleFormTipoAutoriConsep==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.aumentarTamanioFilaNuevaTablaTipoAutoriConsep();
			
			if(this.conTotales) {
				this.quitarFilaTotales();
			}
			
			this.nuevoPreparar(true);
			
			this.setVariablesFormularioToObjetoActualForeignKeysTipoAutoriConsep(this.tipoautoriconsep);
			
			this.tipoautoriconsep.setsType("NUEVO_GUARDAR_CAMBIOS");
			
			//LO HACE NUEVOPREPARAR
			/*
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				this.tipoautoriconsepLogic.getTipoAutoriConseps().add(this.tipoautoriconsepAux);
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				this.tipoautoriconseps.add(this.tipoautoriconsepAux);				
			}
			*/
			
			this.inicializarActualizarBindingTablaTipoAutoriConsep(false);
			
			this.jTableDatosTipoAutoriConsep.setRowSelectionInterval(this.getIndiceNuevoTipoAutoriConsep(), this.getIndiceNuevoTipoAutoriConsep());
			
			int iLastRow =  this.jTableDatosTipoAutoriConsep.getRowCount () - 1;
			Rectangle rectangle = this.jTableDatosTipoAutoriConsep.getCellRect(iLastRow, 0, true);
			
			this.jTableDatosTipoAutoriConsep.scrollRectToVisible(rectangle);
			
			//FILA TOTALES
			if(this.conTotales) {
				this.crearFilaTotales();
				
				this.inicializarActualizarBindingTablaTipoAutoriConsep(false);
			}

		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,TipoAutoriConsepConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;
			this.estaModoNuevoGuardarCambios=false;
		}
	}		
	
	public void jButtonRecargarInformacionTipoAutoriConsepActionPerformed(ActionEvent evt) throws Exception {    		
		try {
			this.iNumeroPaginacionPagina=0;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoautoriconsepLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingTipoAutoriConsep(false,false);
			
	    	this.recargarInformacion();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingTipoAutoriConsep(false);
			
			//SI ES MANUAL
			if(TipoAutoriConsepJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualTipoAutoriConsep();
			}
			
			//this.abrirFrameTreeTipoAutoriConsep();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoautoriconsepLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoautoriconsepLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,TipoAutoriConsepConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoautoriconsepLogic.closeNewConnexionToDeep();
			}
		}	
	}
	
	
	public void jButtonGenerarImportacionTipoAutoriConsepActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedReader bufferedReader = null;
		String sXmlStringFile="";
		String sPath="";
		this.arrDatoGeneralMinimos= new  ArrayList<DatoGeneralMinimo>();
		DatoGeneralMinimo datoGeneralMinimo=new DatoGeneralMinimo();
		String sLine="";
		
		try {			
			if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR IMPORTACION DE Tipo Autorizacion ConsepES ?", "MANTENIMIENTO DE Tipo Autorizacion Consep", JOptionPane.OK_CANCEL_OPTION) == 0) {
				bufferedReader = new BufferedReader(new FileReader(this.jInternalFrameImportacionTipoAutoriConsep.getFileImportacion().getAbsolutePath()));
								
				while ((sLine = bufferedReader.readLine()) != null) {
					datoGeneralMinimo=new DatoGeneralMinimo();
					datoGeneralMinimo.setsDescripcion(sLine);
					
					this.arrDatoGeneralMinimos.add(datoGeneralMinimo);
				}
				
				this.actualizarParametrosGeneralTipoAutoriConsep();
						
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {						
					this.tipoautoriconsepReturnGeneral=tipoautoriconsepLogic.procesarImportacionTipoAutoriConsepsWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this.arrDatoGeneralMinimos,this.tipoautoriconsepParameterGeneral);
						
				} else if(Constantes.ISUSAEJBREMOTE) {
						
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
						
				this.procesarTipoAutoriConsepReturnGeneral();
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoAutoriConsepConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedReader != null) {
				bufferedReader.close();
			}	
		}				
	}
	
	
	
	public void jButtonAbrirImportacionTipoAutoriConsepActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {
			int iReturnArchivo = this.jInternalFrameImportacionTipoAutoriConsep.getjFileChooserImportacion().showOpenDialog(this);
 
            if (iReturnArchivo == JFileChooser.APPROVE_OPTION) {
            	this.jInternalFrameImportacionTipoAutoriConsep.setFileImportacion(this.jInternalFrameImportacionTipoAutoriConsep.getjFileChooserImportacion().getSelectedFile());
            	
				this.jInternalFrameImportacionTipoAutoriConsep.getjTextFieldPathArchivoImportacion().setText(this.jInternalFrameImportacionTipoAutoriConsep.getFileImportacion().getName());
				
				//System.out.println("ARCHIVO ESCOGIDO: "+this.fileImportacionTipoAutoriConsep.getName());
				
            } else {
                //System.out.println("CANCELAR SELECCION");
				this.jInternalFrameImportacionTipoAutoriConsep.getjTextFieldPathArchivoImportacion().setText("SELECCION CANCELADA");
            }			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoAutoriConsepConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedWriter != null) {
				bufferedWriter.close();
			}	
		}		
	}
	
	
	public void jButtonGenerarReporteDinamicoTipoAutoriConsepActionPerformed(ActionEvent evt) throws Exception {    		
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {	
		
		ArrayList<TipoAutoriConsep> tipoautoriconsepsSeleccionados=new ArrayList<TipoAutoriConsep>();		

		tipoautoriconsepsSeleccionados=this.getTipoAutoriConsepsSeleccionados(true);
		
		
		this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoTipoAutoriConsep.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();
		
		this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoTipoAutoriConsep.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
		
		
		this.sTipoArchivoReporte=this.sTipoArchivoReporteDinamico;
		
		//this.sTipoReporteExtra="Base";
		
			InputStream reportFile=null;
			InputStream imageFile=null;
			
			imageFile=AuxiliarImagenes.class.getResourceAsStream("LogoReporte.jpg");			
				
		
		
			reportFile = AuxiliarReportes.class.getResourceAsStream("TipoAutoriConsepBaseDesign.jrxml");	
			
			sPath=this.parametroGeneralUsuario.getpath_exportar()+"TipoAutoriConsepBaseDesign.jrxml";
			
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
			
			this.generarReporteTipoAutoriConseps("Todos",tipoautoriconsepsSeleccionados );

			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipoautoriconsepSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				//DEBE APARECER EL REPORTE DIRECTAMENTE
				//JOptionPane.showMessageDialog(this,"GENERADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Autorizacion Consep",JOptionPane.INFORMATION_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoAutoriConsepConstantesFunciones.CLASSNAME);
		
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
		
		for(int index:this.jInternalFrameReporteDinamicoTipoAutoriConsep.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoTipoAutoriConsep.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case TipoAutoriConsepConstantesFunciones.LABEL_CODIGO:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_digo_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_digo_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_digo_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_digo_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case TipoAutoriConsepConstantesFunciones.LABEL_NOMBRE:
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
		
		if(this.jInternalFrameReporteDinamicoTipoAutoriConsep.getjCheckBoxConGraficoDinamico().isSelected()) {
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
		reporte=((Reporte)this.jInternalFrameReporteDinamicoTipoAutoriConsep.getjComboBoxColumnaCategoriaGrafico().getSelectedItem());
				
		//TIPO GRAFICO REPORTE
		reporteTipoGraficoReporte=((Reporte)this.jInternalFrameReporteDinamicoTipoAutoriConsep.getjComboBoxTiposGraficosReportesDinamico().getSelectedItem());
		
		String sTipoGraficoReporte=reporteTipoGraficoReporte.getsCodigo();
		
		switch(reporte.getsCodigo()) {
			
				case TipoAutoriConsepConstantesFunciones.LABEL_CODIGO:
					sNombreCampoCategoria="codigo";
					break;

				case TipoAutoriConsepConstantesFunciones.LABEL_NOMBRE:
					sNombreCampoCategoria="nombre";
					break;
					
			default :
				break;
		}		
		//CATEGORIA GRAFICO
		
		//CATEGORIA VALOR				
		reporteCategoriaValor=((Reporte)this.jInternalFrameReporteDinamicoTipoAutoriConsep.getjComboBoxColumnaCategoriaValor().getSelectedItem());
		
		switch(reporteCategoriaValor.getsCodigo()) {
			
				case TipoAutoriConsepConstantesFunciones.LABEL_CODIGO:
					sNombreCampoCategoriaValor="codigo";
					break;

				case TipoAutoriConsepConstantesFunciones.LABEL_NOMBRE:
					sNombreCampoCategoriaValor="nombre";
					break;
					
			default :
				break;
		}	
		//CATEGORIA VALOR
		
		//VALORES GRAFICO
		for(int index:this.jInternalFrameReporteDinamicoTipoAutoriConsep.getjListColumnasValoresGrafico().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoTipoAutoriConsep.getjListColumnasValoresGrafico().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case TipoAutoriConsepConstantesFunciones.LABEL_CODIGO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Codigo",sNombreCampoCategoria,sNombreCampoCategoriaValor,"codigo");
					break;

				case TipoAutoriConsepConstantesFunciones.LABEL_NOMBRE:
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
	
	public void jButtonGenerarExcelReporteDinamicoTipoAutoriConsepActionPerformed(ActionEvent evt) throws Exception {		
		ArrayList<TipoAutoriConsep> tipoautoriconsepsSeleccionados=new ArrayList<TipoAutoriConsep>();		
		
		tipoautoriconsepsSeleccionados=this.getTipoAutoriConsepsSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tipoautoriconsep";//.xls";
		
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
		
			Sheet sheet = workbook.createSheet("TipoAutoriConseps");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			Row row = sheet.createRow(iRow);
			Cell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");
			
			for(int index:this.jInternalFrameReporteDinamicoTipoAutoriConsep.getjListColumnasSelectReporte().getSelectedIndices()) {
				reporte=(Reporte)this.jInternalFrameReporteDinamicoTipoAutoriConsep.getjListColumnasSelectReporte().getModel().getElementAt(index);
				
				switch(reporte.getsCodigo()) {
					
				case TipoAutoriConsepConstantesFunciones.LABEL_CODIGO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(TipoAutoriConsepConstantesFunciones.LABEL_CODIGO);
					iRow++;

					for(TipoAutoriConsep tipoautoriconsep:tipoautoriconsepsSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(tipoautoriconsep.getcodigo());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case TipoAutoriConsepConstantesFunciones.LABEL_NOMBRE:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(TipoAutoriConsepConstantesFunciones.LABEL_NOMBRE);
					iRow++;

					for(TipoAutoriConsep tipoautoriconsep:tipoautoriconsepsSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(tipoautoriconsep.getnombre());
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
			//	this.getFilaCabeceraExportarExcelTipoAutoriConsep(row);				
			//	iRow++;
			//}				
			
			//for(TipoAutoriConsep tipoautoriconsepAux:tipoautoriconsepsSeleccionados) {
			//	row = sheet.createRow(iRow);
				
			//	this.getFilaDatosExportarExcelTipoAutoriConsep(tipoautoriconsepAux,row);
				
			//	iRow++;
			//}
			
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipoautoriconsepSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Autorizacion Consep",JOptionPane.INFORMATION_MESSAGE);
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
				this.tipoautoriconsepLogic.getNewConnexionToDeep("");
			}
			
			this.idActual=idActual;
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda("PorId");
				    	
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingTipoAutoriConsep(false);
			
			//SI ES MANUAL
			if(TipoAutoriConsepJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualTipoAutoriConsep();
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoautoriconsepLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoautoriconsepLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger);
			
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoautoriconsepLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonAnterioresTipoAutoriConsepActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion-=this.iNumeroPaginacion;
			/*
			if(this.iNumeroPaginacion<0) {
				this.iNumeroPaginacion=0;
			}
			*/
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoautoriconsepLogic.getNewConnexionToDeep("");
			}
			
			this.anteriores();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingTipoAutoriConsep(false);
			
			//SI ES MANUAL
			if(TipoAutoriConsepJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualTipoAutoriConsep();
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoautoriconsepLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoautoriconsepLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,TipoAutoriConsepConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoautoriconsepLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonSiguientesTipoAutoriConsepActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion+=this.iNumeroPaginacion;
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoautoriconsepLogic.getNewConnexionToDeep("");
			}
			
			this.siguientes();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingTipoAutoriConsep(false);
			
			//SI ES MANUAL
			if(TipoAutoriConsepJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualTipoAutoriConsep();
			}		
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoautoriconsepLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoautoriconsepLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,TipoAutoriConsepConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoautoriconsepLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void aumentarTamanioFilaNuevaTablaTipoAutoriConsep() throws Exception {		
		Dimension dimensionMinimum=this.jTableDatosTipoAutoriConsep.getMinimumSize();
		Dimension dimensionMaximum=this.jTableDatosTipoAutoriConsep.getMaximumSize();
		Dimension dimensionPreferred=this.jTableDatosTipoAutoriConsep.getPreferredSize();
	
		double iHeightConFilaNueva=dimensionPreferred.getHeight();
		
		iHeightConFilaNueva+=this.jTableDatosTipoAutoriConsep.getRowHeight();
		
		dimensionMinimum.setSize(dimensionMinimum.getWidth(),iHeightConFilaNueva);
		dimensionMaximum.setSize(dimensionMaximum.getWidth(),iHeightConFilaNueva);
		dimensionPreferred.setSize(dimensionPreferred.getWidth(),iHeightConFilaNueva);
		
		this.jTableDatosTipoAutoriConsep.setMinimumSize(dimensionMinimum);
		this.jTableDatosTipoAutoriConsep.setMaximumSize(dimensionMaximum);
		this.jTableDatosTipoAutoriConsep.setPreferredSize(dimensionPreferred);	
	}
	
	public void inicializarActualizarBindingTipoAutoriConsep(Boolean esInicializar) throws Exception {
		this.inicializarActualizarBindingTipoAutoriConsep(esInicializar,true);
	}
	
	public void inicializarActualizarBindingTipoAutoriConsep(Boolean esInicializar,Boolean conTabla) throws Exception {		
		if(conTabla) {
			this.inicializarActualizarBindingTablaTipoAutoriConsep(esInicializar);
		}
		
		this.inicializarActualizarBindingBotonesTipoAutoriConsep(esInicializar);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.tipoautoriconsepSessionBean.getEsGuardarRelacionado()) {
			try{this.inicializarActualizarBindingBusquedasTipoAutoriConsep(esInicializar);}catch(Exception e){e.printStackTrace();}
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesTipoAutoriConsep(esInicializar) ;
			
			this.inicializarActualizarBindingParametrosReportesTipoAutoriConsep(esInicializar) ;
		}
		
		if(esInicializar) {
			if( !TipoAutoriConsepJInternalFrame.ISBINDING_MANUAL_TABLA ||
			   	!TipoAutoriConsepJInternalFrame.ISBINDING_MANUAL) {
			   	
			}
		}
	}
	
	public void inicializarActualizarBindingManualTipoAutoriConsep() throws Exception {		
		//NO SE NECESITA HACER BINDING OTRA VEZ
		//this.inicializarActualizarBindingTablaTipoAutoriConsep();
		
		this.inicializarActualizarBindingBotonesManualTipoAutoriConsep(true);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.tipoautoriconsepSessionBean.getEsGuardarRelacionado()) {
			
			this.inicializarActualizarBindingBusquedasManualTipoAutoriConsep();			
			
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesTipoAutoriConsep() ;
			
			this.inicializarActualizarBindingParametrosReportesPostAccionesManualTipoAutoriConsep(false) ;			
			
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesPostAccionesManualTipoAutoriConsep(Boolean esSetControles) throws Exception {
		try	{					
			if(!esSetControles) {
				this.isSeleccionarTodos=this.jCheckBoxSeleccionarTodosTipoAutoriConsep.isSelected();
				this.isSeleccionados=this.jCheckBoxSeleccionadosTipoAutoriConsep.isSelected();
				
				
				this.conGraficoReporte=this.jCheckBoxConGraficoReporteTipoAutoriConsep.isSelected();															
				
				
				if(this.jInternalFrameDetalleFormTipoAutoriConsep!=null) {
				this.isPostAccionNuevo=this.jInternalFrameDetalleFormTipoAutoriConsep.jCheckBoxPostAccionNuevoTipoAutoriConsep.isSelected();
				this.isPostAccionSinCerrar=this.jInternalFrameDetalleFormTipoAutoriConsep.jCheckBoxPostAccionSinCerrarTipoAutoriConsep.isSelected();
				this.isPostAccionSinMensaje=this.jInternalFrameDetalleFormTipoAutoriConsep.jCheckBoxPostAccionSinMensajeTipoAutoriConsep.isSelected();
				}
			
			} else {
				this.jCheckBoxSeleccionarTodosTipoAutoriConsep.setSelected(this.isSeleccionarTodos);
				this.jCheckBoxSeleccionadosTipoAutoriConsep.setSelected(this.isSeleccionados);
				
				
				this.jCheckBoxConGraficoReporteTipoAutoriConsep.setSelected(this.conGraficoReporte);				
				
				
				if(this.jInternalFrameDetalleFormTipoAutoriConsep!=null) {
				this.jInternalFrameDetalleFormTipoAutoriConsep.jCheckBoxPostAccionNuevoTipoAutoriConsep.setSelected(this.isPostAccionNuevo);
				this.jInternalFrameDetalleFormTipoAutoriConsep.jCheckBoxPostAccionSinCerrarTipoAutoriConsep.setSelected(this.isPostAccionSinCerrar);
				this.jInternalFrameDetalleFormTipoAutoriConsep.jCheckBoxPostAccionSinMensajeTipoAutoriConsep.setSelected(this.isPostAccionSinMensaje);
				}
			}
			
			
			if(this.jComboBoxTiposPaginacionTipoAutoriConsep.getSelectedItem()!=null) {
				this.sTipoPaginacion=((Reporte)this.jComboBoxTiposPaginacionTipoAutoriConsep.getSelectedItem()).getsCodigo();			
			}
			
			
			
			if(this.jInternalFrameDetalleFormTipoAutoriConsep!=null) {
			this.sTipoAccionFormulario=((Reporte)this.jInternalFrameDetalleFormTipoAutoriConsep.jComboBoxTiposAccionesFormularioTipoAutoriConsep.getSelectedItem()).getsCodigo();
			}
			
			
			
			if(!this.conCargarMinimo) {
				this.sTipoArchivoReporte=((Reporte)this.jComboBoxTiposArchivosReportesTipoAutoriConsep.getSelectedItem()).getsCodigo();			
				
				if(this.jInternalFrameReporteDinamicoTipoAutoriConsep!=null) {
					this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoTipoAutoriConsep.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
				}
				
				this.sTipoRelacion=((Reporte)this.jComboBoxTiposRelacionesTipoAutoriConsep.getSelectedItem()).getsCodigo();
									
				this.sTipoAccion=((Reporte)this.jComboBoxTiposAccionesTipoAutoriConsep.getSelectedItem()).getsCodigo();
													
				this.sTipoSeleccionar=((Reporte)this.jComboBoxTiposSeleccionarTipoAutoriConsep.getSelectedItem()).getsCodigo();
									
				this.sTipoReporte=((Reporte)this.jComboBoxTiposReportesTipoAutoriConsep.getSelectedItem()).getsCodigo();							
					
				if(this.jInternalFrameReporteDinamicoTipoAutoriConsep!=null) {
					this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoTipoAutoriConsep.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();							
				}
				
				this.sTipoGraficoReporte=((Reporte)this.jComboBoxTiposGraficosReportesTipoAutoriConsep.getSelectedItem()).getsCodigo();											
			}			
			
			this.sValorCampoGeneral=this.jTextFieldValorCampoGeneralTipoAutoriConsep.getText();						
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesTipoAutoriConsep(Boolean esInicializar) throws Exception {
		try	{	
			if(TipoAutoriConsepJInternalFrame.ISBINDING_MANUAL) {
				this. inicializarActualizarBindingParametrosReportesPostAccionesManualTipoAutoriConsep(false);
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public void inicializarActualizarBindingtiposArchivosReportesAccionesTipoAutoriConsep() throws Exception {
		try	{
			if(TipoAutoriConsepJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingtiposArchivosReportesAccionesManualTipoAutoriConsep();
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleTipoAutoriConsep() throws Exception {
		//TIPOS ACCIONES FORMULARIO	
		this.jInternalFrameDetalleFormTipoAutoriConsep.jComboBoxTiposAccionesFormularioTipoAutoriConsep.removeAllItems();
				
		for(Reporte reporte:this.tiposAccionesFormulario) {
			this.jInternalFrameDetalleFormTipoAutoriConsep.jComboBoxTiposAccionesFormularioTipoAutoriConsep.addItem(reporte);
		}
		
		//TIPOS ACCIONES FORMULARIO
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualTipoAutoriConsep() throws Exception {
		try	{
			
			//TIPOS ARCHIVOS REPORTES
			this.jComboBoxTiposArchivosReportesTipoAutoriConsep.removeAllItems();
				
			for(Reporte reporte:this.tiposArchivosReportes) {
				this.jComboBoxTiposArchivosReportesTipoAutoriConsep.addItem(reporte);
			}
			
			
				
			//TIPOS REPORTES
			this.jComboBoxTiposReportesTipoAutoriConsep.removeAllItems();
				
			for(Reporte reporte:this.tiposReportes) {
				this.jComboBoxTiposReportesTipoAutoriConsep.addItem(reporte);
			}
			
			
			//TIPOS GRAFICOS REPORTES
			this.jComboBoxTiposGraficosReportesTipoAutoriConsep.removeAllItems();
				
			for(Reporte reporte:this.tiposGraficosReportes) {
				this.jComboBoxTiposGraficosReportesTipoAutoriConsep.addItem(reporte);
			}
			
			
			//TIPOS PAGINACION
			this.jComboBoxTiposPaginacionTipoAutoriConsep.removeAllItems();
				
			for(Reporte reporte:this.tiposPaginacion) {
				this.jComboBoxTiposPaginacionTipoAutoriConsep.addItem(reporte);
			}
			
			
			if(!this.tipoautoriconsepSessionBean.getEsGuardarRelacionado()) {
				this.jComboBoxTiposPaginacionTipoAutoriConsep.setSelectedItem(Funciones2.getTipoPaginacionDefecto("NORMAL",this.tiposPaginacion));
			} else {
				this.jComboBoxTiposPaginacionTipoAutoriConsep.setSelectedItem(Funciones2.getTipoPaginacionDefecto("RELACIONADO",this.tiposPaginacion));
			}
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposRelacionesTipoAutoriConsep.removeAllItems();
				
			for(Reporte reporte:this.tiposRelaciones) {
				this.jComboBoxTiposRelacionesTipoAutoriConsep.addItem(reporte);
			}
			
			//TIPOS ACCIONES
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposAccionesTipoAutoriConsep.removeAllItems();
				
			for(Reporte reporte:this.tiposAcciones) {
				this.jComboBoxTiposAccionesTipoAutoriConsep.addItem(reporte);
			}
			
			//TIPOS ACCIONES			
			
			
			
			//TIPOS ACCIONES FORMULARIO	
			if(this.jInternalFrameDetalleFormTipoAutoriConsep!=null) { //if(this.conCargarFormDetalle) {
				this.jInternalFrameDetalleFormTipoAutoriConsep.jComboBoxTiposAccionesFormularioTipoAutoriConsep.removeAllItems();
				
				for(Reporte reporte:this.tiposAccionesFormulario) {
					this.jInternalFrameDetalleFormTipoAutoriConsep.jComboBoxTiposAccionesFormularioTipoAutoriConsep.addItem(reporte);
				}
				
			}
			//TIPOS ACCIONES FORMULARIO
			
			
			
			//TIPOS SELECCIONAR
			this.jComboBoxTiposSeleccionarTipoAutoriConsep.removeAllItems();
				
			for(Reporte reporte:this.tiposSeleccionar) {
				this.jComboBoxTiposSeleccionarTipoAutoriConsep.addItem(reporte);
			}
			
			
			if(this.tiposSeleccionar!=null && this.tiposSeleccionar.size()>1) {
				this.jComboBoxTiposSeleccionarTipoAutoriConsep.setSelectedIndex(1);
			}
				
			//REPORTE DINAMICO
			this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualTipoAutoriConsep();
							
			//TIPOS COLUMNAS SELECT
			//TIPOS SELECCIONAR
			
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualTipoAutoriConsep() throws Exception {
		try	{
			DefaultListModel<Reporte> defaultListModel=new DefaultListModel<Reporte>();
			
			
			//TIPOS ARCHIVOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoTipoAutoriConsep!=null) {
				this.jInternalFrameReporteDinamicoTipoAutoriConsep.getjComboBoxTiposArchivosReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposArchivosReportesDinamico) {
					this.jInternalFrameReporteDinamicoTipoAutoriConsep.getjComboBoxTiposArchivosReportesDinamico().addItem(reporte);
				}
				
			}
			
			//TIPOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoTipoAutoriConsep!=null) {
				this.jInternalFrameReporteDinamicoTipoAutoriConsep.getjComboBoxTiposReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposReportesDinamico) {
					this.jInternalFrameReporteDinamicoTipoAutoriConsep.getjComboBoxTiposReportesDinamico().addItem(reporte);
				}
				
			}
			
			defaultListModel=new DefaultListModel<Reporte>();
			
			if(this.jInternalFrameReporteDinamicoTipoAutoriConsep!=null) {
				
				if(this.jInternalFrameReporteDinamicoTipoAutoriConsep.getjListColumnasSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoTipoAutoriConsep.getjListColumnasSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposColumnasSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoTipoAutoriConsep.getjListColumnasSelectReporte().setModel(defaultListModel);									
						
				}	
					
				//TIPOS RELACIONES SELECT
				//TIPOS SELECCIONAR
				defaultListModel=new DefaultListModel<Reporte>();
				if(this.jInternalFrameReporteDinamicoTipoAutoriConsep.getjListRelacionesSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoTipoAutoriConsep.getjListRelacionesSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposRelacionesSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoTipoAutoriConsep.getjListRelacionesSelectReporte().setModel(defaultListModel);									
						
				}	
				
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	
	
	public void inicializarActualizarBindingBusquedasManualTipoAutoriConsep()  throws Exception {				
		//BYDAN_BUSQUEDAS		
		
		this.codigoBusquedaPorCodigo=this.jTextFieldcodigoBusquedaPorCodigoTipoAutoriConsep.getText();
		this.nombreBusquedaPorNombre=this.jTextFieldnombreBusquedaPorNombreTipoAutoriConsep.getText();
		
	}
	
	
	
	
	public void inicializarActualizarBindingBusquedasTipoAutoriConsep(Boolean esInicializar) throws Exception {				
		if(TipoAutoriConsepJInternalFrame.ISBINDING_MANUAL) {
			
			this.inicializarActualizarBindingBusquedasManualTipoAutoriConsep();			
			
		} else {
		}
	}		
		
	public void inicializarActualizarBindingTablaTipoAutoriConsep() throws Exception {
		this.inicializarActualizarBindingTablaTipoAutoriConsep(false);
	}
	
	
	public void inicializarActualizarBindingTablaOrderByTipoAutoriConsep() {
		//TABLA OrderBy	
		TableColumn tableColumn=new TableColumn();
		Integer iWidthTableDefinicionOrderBy=0;			
			
		this.jInternalFrameOrderByTipoAutoriConsep.getjTableDatosOrderBy().setModel(new TablaGeneralOrderByModel(this.arrOrderBy));
					
		//DEFINIR RENDERERS OrderBy
		tableColumn=this.jInternalFrameOrderByTipoAutoriConsep.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByTipoAutoriConsep.getjTableDatosOrderBy(),OrderBy.ISSELECTED));			
		//tableColumn.addPropertyChangeListener(new TipoAutoriConsepPropertyChangeListener());
					
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		iWidthTableDefinicionOrderBy+=50;
					
		tableColumn=this.jInternalFrameOrderByTipoAutoriConsep.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByTipoAutoriConsep.getjTableDatosOrderBy(),OrderBy.NOMBRE));
		//tableColumn.addPropertyChangeListener(new TipoAutoriConsepPropertyChangeListener());
					
		tableColumn.setPreferredWidth(150); 	 
		tableColumn.setWidth(150); 	 
		tableColumn.setMinWidth(150);
		tableColumn.setMaxWidth(150);
				
		iWidthTableDefinicionOrderBy+=150;
					
		//tableColumn=this.jTableDatosTipoAutoriConsepOrderBy.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTipoAutoriConsepOrderBy,OrderBy.NOMBREDB));			
		////tableColumn.addPropertyChangeListener(new TipoAutoriConsepPropertyChangeListener());
								
		tableColumn=this.jInternalFrameOrderByTipoAutoriConsep.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByTipoAutoriConsep.getjTableDatosOrderBy(),OrderBy.ESDESC));
		//tableColumn.addPropertyChangeListener(new TipoAutoriConsepPropertyChangeListener());
												
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		((AbstractTableModel) this.jInternalFrameOrderByTipoAutoriConsep.getjTableDatosOrderBy().getModel()).fireTableDataChanged();
				
		iWidthTableDefinicionOrderBy+=50;
	}
	
	
	
	public void inicializarActualizarBindingTablaTipoAutoriConsep(Boolean esInicializar) throws Exception {
		Boolean isNoExiste=false;
		Integer iCountNumeroColumnasNormal=0;
		Integer iCountNumeroColumnasFk=0;
		
		this.iWidthTableDefinicion=0;
		
		int iSizeTabla=0;
		
		iSizeTabla=this.getSizeTablaDatos();
		
	if(esInicializar || ConstantesSwing.FORZAR_INICIALIZAR_TABLA) {//esInicializar
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			isNoExiste=tipoautoriconsepLogic.getTipoAutoriConseps().size()==0;
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			isNoExiste=tipoautoriconseps.size()==0;
		}
		//ARCHITECTURE
			
		if(isNoExiste) {
			if(this.iNumeroPaginacion-this.iNumeroPaginacion>0) {
				this.iNumeroPaginacion-=this.iNumeroPaginacion;
			}
		}
		
		TableColumn tableColumn=new TableColumn();
		
		if(TipoAutoriConsepJInternalFrame.ISBINDING_MANUAL_TABLA) {
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.jTableDatosTipoAutoriConsep.setModel(new TipoAutoriConsepModel(this.tipoautoriconsepLogic.getTipoAutoriConseps(),this));
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.jTableDatosTipoAutoriConsep.setModel(new TipoAutoriConsepModel(this.tipoautoriconseps,this));
			}
			//ARCHITECTURE
			
							
			
			
			if(this.jInternalFrameOrderByTipoAutoriConsep!=null && this.jInternalFrameOrderByTipoAutoriConsep.getjTableDatosOrderBy()!=null) {
				this.inicializarActualizarBindingTablaOrderByTipoAutoriConsep();
			}
			
								
			//DEFINIR RENDERERS
			tableColumn=this.jTableDatosTipoAutoriConsep.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTipoAutoriConsep,Constantes2.S_SELECCIONAR));
			//tableColumn.addPropertyChangeListener(new TipoAutoriConsepPropertyChangeListener());
			tableColumn.setCellRenderer(new BooleanRenderer(true,"Seleccionar "+TipoAutoriConsepConstantesFunciones.SCLASSWEBTITULO,tipoautoriconsepConstantesFunciones.resaltarSeleccionarTipoAutoriConsep,true,false,"","",this));
			tableColumn.setCellEditor(new BooleanEditorRenderer(true,"Seleccionar "+TipoAutoriConsepConstantesFunciones.SCLASSWEBTITULO,tipoautoriconsepConstantesFunciones.resaltarSeleccionarTipoAutoriConsep,false,"","",this));			
			
			tableColumn.setPreferredWidth(50); 	 
			tableColumn.setWidth(50); 	 
			tableColumn.setMinWidth(50); 
			tableColumn.setMaxWidth(50); 
			
			this.iWidthTableDefinicion+=50;
			
			


			tableColumn=this.jTableDatosTipoAutoriConsep.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTipoAutoriConsep,TipoAutoriConsepConstantesFunciones.LABEL_ID));

		if(this.tipoautoriconsepConstantesFunciones.mostraridTipoAutoriConsep && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,TipoAutoriConsepConstantesFunciones.LABEL_ID,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.tipoautoriconsepConstantesFunciones.resaltaridTipoAutoriConsep,this.tipoautoriconsepConstantesFunciones.activaridTipoAutoriConsep,this,true,"idTipoAutoriConsep","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.tipoautoriconsepConstantesFunciones.resaltaridTipoAutoriConsep,this.tipoautoriconsepConstantesFunciones.activaridTipoAutoriConsep,this,true,"idTipoAutoriConsep","BASICO",false));

			tableColumn.setPreferredWidth(50);
			tableColumn.setWidth(50);
			tableColumn.setMinWidth(50);
			tableColumn.setMaxWidth(50);

			this.iWidthTableDefinicion+=50;
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosTipoAutoriConsep.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTipoAutoriConsep,TipoAutoriConsepConstantesFunciones.LABEL_CODIGO));

		if(this.tipoautoriconsepConstantesFunciones.mostrarcodigoTipoAutoriConsep && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,TipoAutoriConsepConstantesFunciones.LABEL_CODIGO,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.tipoautoriconsepConstantesFunciones.resaltarcodigoTipoAutoriConsep,this.tipoautoriconsepConstantesFunciones.activarcodigoTipoAutoriConsep,this,true,"codigoTipoAutoriConsep","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.tipoautoriconsepConstantesFunciones.resaltarcodigoTipoAutoriConsep,this.tipoautoriconsepConstantesFunciones.activarcodigoTipoAutoriConsep,this,true,"codigoTipoAutoriConsep","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new TipoAutoriConsepPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosTipoAutoriConsep.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTipoAutoriConsep,TipoAutoriConsepConstantesFunciones.LABEL_NOMBRE));

		if(this.tipoautoriconsepConstantesFunciones.mostrarnombreTipoAutoriConsep && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,TipoAutoriConsepConstantesFunciones.LABEL_NOMBRE,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.tipoautoriconsepConstantesFunciones.resaltarnombreTipoAutoriConsep,this.tipoautoriconsepConstantesFunciones.activarnombreTipoAutoriConsep,this,true,"nombreTipoAutoriConsep","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.tipoautoriconsepConstantesFunciones.resaltarnombreTipoAutoriConsep,this.tipoautoriconsepConstantesFunciones.activarnombreTipoAutoriConsep,this,true,"nombreTipoAutoriConsep","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new TipoAutoriConsepPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}
			
		} else {
		}			
					
		if(!this.tipoautoriconsepSessionBean.getEsGuardarRelacionado()
			&& !this.esParaBusquedaForeignKey) {
			

			if(this.isTienePermisosAutoriConsep && this.tipoautoriconsepConstantesFunciones.mostrarAutoriConsepTipoAutoriConsep && !TipoAutoriConsepConstantesFunciones.ISGUARDARREL) {
				tableColumn= new TableColumn();
				tableColumn.setIdentifier("Autorizaciones Consepes");
				tableColumn.setHeaderValue("Autorizaciones Consepes");
				tableColumn.setCellRenderer(new AutoriConsepTableCell(tipoautoriconsepConstantesFunciones.resaltarAutoriConsepTipoAutoriConsep,this,this.tipoautoriconsepConstantesFunciones.activarAutoriConsepTipoAutoriConsep));
				tableColumn.setCellEditor(new AutoriConsepTableCell(tipoautoriconsepConstantesFunciones.resaltarAutoriConsepTipoAutoriConsep,this,this.tipoautoriconsepConstantesFunciones.activarAutoriConsepTipoAutoriConsep));

				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
				tableColumn.setWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);

				this.jTableDatosTipoAutoriConsep.addColumn(tableColumn);
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
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.tipoautoriconsepSessionBean.getEsGuardarRelacionado()));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.tipoautoriconsepSessionBean.getEsGuardarRelacionado()));
	
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosTipoAutoriConsep.addColumn(tableColumn);
			
			} else {				
				
				//LO MISMO QUE IF
				
				tableColumn= new TableColumn();
				tableColumn.setIdentifier(sLabelColumnAccion);
				tableColumn.setHeaderValue(sLabelColumnAccion);
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.tipoautoriconsepSessionBean.getEsGuardarRelacionado()));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.tipoautoriconsepSessionBean.getEsGuardarRelacionado()));
		
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosTipoAutoriConsep.addColumn(tableColumn);				
					
				//ELIMINAR
				if(this.isPermisoEliminarTipoAutoriConsep && this.isPermisoGuardarCambiosTipoAutoriConsep) {
					tableColumn= new TableColumn();
					tableColumn.setIdentifier(Constantes2.S_ELI);
					tableColumn.setHeaderValue(sLabelColumnAccionEli);
					tableColumn.setCellRenderer(new IdTableCell(this,false,true,this.tipoautoriconsepSessionBean.getEsGuardarRelacionado()));
					tableColumn.setCellEditor(new IdTableCell(this,false,true,this.tipoautoriconsepSessionBean.getEsGuardarRelacionado()));
			
					tableColumn.setPreferredWidth(65); 	 
					tableColumn.setWidth(65); 	 
					tableColumn.setMinWidth(65); 
					tableColumn.setMaxWidth(65);
					
					this.iWidthTableDefinicion+=65;
						
					this.jTableDatosTipoAutoriConsep.addColumn(tableColumn);
				}
			}			
						
			if(this.conMaximoRelaciones && this.tipoautoriconsepSessionBean.getConGuardarRelaciones()) {
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
				
					this.jTableDatosTipoAutoriConsep.addColumn(tableColumn);
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
			
			this.jTableDatosTipoAutoriConsep.addColumn(tableColumn);
			*/
		}
		
		Integer iUltimaColumna=0;//1
		Integer iNuevaPosicionColumna=0;
		
		
		//PERMITE ELIMINAR SIMPLE
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarTipoAutoriConsep && this.isPermisoGuardarCambiosTipoAutoriConsep) {
				iUltimaColumna++;
			}	
		}
		
		//PERMITE EDITAR SIMPLE
		iUltimaColumna++;	
		
				
		if(this.conFuncionalidadRelaciones) {
			if(this.conMaximoRelaciones && this.tipoautoriconsepSessionBean.getConGuardarRelaciones()) {			
				//PERMITE EDITAR RELACIONES
				iUltimaColumna++;//2
			}
		}
		
		//MOVIA SELECCIONAR
		//iUltimaColumna++;
		
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarTipoAutoriConsep && this.isPermisoGuardarCambiosTipoAutoriConsep) {
				//REUBICA ELIMINAR SIMPLE
				jTableDatosTipoAutoriConsep.moveColumn(this.jTableDatosTipoAutoriConsep.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3
					
				iUltimaColumna--;
			}
		}
		//REUBICA EDITAR SIMPLE
		jTableDatosTipoAutoriConsep.moveColumn(this.jTableDatosTipoAutoriConsep.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3				
		
		
		if(this.conFuncionalidadRelaciones) {
			if(this.conMaximoRelaciones && this.tipoautoriconsepSessionBean.getConGuardarRelaciones()) {	
				if(iUltimaColumna>1) {
					iUltimaColumna--;
				}
				
				//iNuevaPosicionColumna++;
				
				//REUBICA EDITAR RELACIONES
				jTableDatosTipoAutoriConsep.moveColumn(this.jTableDatosTipoAutoriConsep.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1
			}
		}
		
		
		//REUBICABA SELECCIONAR
		/*
		if(iUltimaColumna>1) {
			iUltimaColumna--;
		}
		
		//iNuevaPosicionColumna++;
			
		//REUBICA SELECCIONAR FILA CHECK
		jTableDatosTipoAutoriConsep.moveColumn(this.jTableDatosTipoAutoriConsep.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1		
		*/
		
		//DEFINEN HEADERS
		final TableCellRenderer tableHeaderDefaultCellRenderer = this.jTableDatosTipoAutoriConsep.getTableHeader().getDefaultRenderer();
		
		this.jTableDatosTipoAutoriConsep.getTableHeader().setDefaultRenderer(new TableCellRendererHeader(this.jTableDatosTipoAutoriConsep,tableHeaderDefaultCellRenderer));
	    
		TableColumn column=null;
		
		if(!TipoAutoriConsepJInternalFrame.ISBINDING_MANUAL_TABLA) {
			for(int i = 0; i < this.jTableDatosTipoAutoriConsep.getColumnModel().getColumnCount(); i++) { 
				column = this.jTableDatosTipoAutoriConsep.getColumnModel().getColumn(i); 
				
				if(column.getIdentifier()!=null) {
					//SI SE UTILIZA UN HEADER ES GENERICO
					//column.setHeaderRenderer(new HeaderRenderer(column.getIdentifier().toString()));
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_ELI)) {
					continue;
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_SELECCIONAR)) {
					if(!TipoAutoriConsepJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(50); 	 
						column.setWidth(50); 	 
						column.setMinWidth(50); 	
						column.setMaxWidth(50); 
						
						this.iWidthTableDefinicion+=50;
					}
					
				} else {
					if(!TipoAutoriConsepJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						column.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						
						this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
					}
				}
			}
		}
		
		this.jTableDatosTipoAutoriConsep.setSelectionBackground(FuncionesSwing.getColorSelectedBackground());
		this.jTableDatosTipoAutoriConsep.setSelectionForeground(FuncionesSwing.getColorSelectedForeground());
		
		/*
		this.jTableDatosTipoAutoriConsep.setDefaultRenderer(Object.class, new DefaultTableCellRenderer() {
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
							iSize=tipoautoriconsepLogic.getTipoAutoriConseps().size()-1;
								
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							iSize=tipoautoriconseps.size()-1;
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
		//this.jTableDatosTipoAutoriConsep.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA);
		
		/*
		column=this.jTableDatosTipoAutoriConsep.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosSistema,Constantes2.S_SELECCIONAR));
		
		if(column!=null) {
			column.setPreferredWidth(25); 	 
			column.setWidth(25); 	 
			column.setMinWidth(25); 	
		}
		*/
			
			//CopyTableToTableTotal();
		} else {
			
			this.actualizarVisualTableDatosTipoAutoriConsep();
			
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
				
				//this.isEsNuevoTipoAutoriConsep=false;
					
				TipoAutoriConsepBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.tipoautoriconsep,new Object(),this.tipoautoriconsepParameterGeneral,this.tipoautoriconsepReturnGeneral);
			
				if(this.tipoautoriconsepSessionBean.getConGuardarRelaciones()) {
					this.dStart=(double)System.currentTimeMillis();
				}
				
				if(this.jInternalFrameDetalleFormTipoAutoriConsep==null) {
					this.inicializarFormDetalle();
				}
				
				this.inicializarInvalidValues();
				
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosTipoAutoriConsep.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosTipoAutoriConsep.getSelectedRow();	       
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoautoriconsep =(TipoAutoriConsep) this.tipoautoriconsepLogic.getTipoAutoriConseps().toArray()[this.jTableDatosTipoAutoriConsep.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipoautoriconsep =(TipoAutoriConsep) this.tipoautoriconseps.toArray()[this.jTableDatosTipoAutoriConsep.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//PUEDE SER PARA DUPLICADO O NUEVO TABLA
				
				if(this.tipoautoriconsep.getsType().equals("DUPLICADO")
				   || this.tipoautoriconsep.getsType().equals("NUEVO_GUARDAR_CAMBIOS")) {
					
					this.isEsNuevoTipoAutoriConsep=true;
				
				} else {
					this.isEsNuevoTipoAutoriConsep=false;	
				}
				
				//CONTROL VERSION ANTERIOR
				/*
				if(!this.tipoautoriconsepSessionBean.getEsGuardarRelacionado()) {
					if(this.tipoautoriconsep.getId()>=0 && !this.tipoautoriconsep.getIsNew()) {						
						this.isEsNuevoTipoAutoriConsep=false;
						
					} else {
						this.isEsNuevoTipoAutoriConsep=true;
					}
					
				} else {
					//CONTROLAR PARA RELACIONADO
				}
				*/
				
				//ESTABLECE SI ES RELACIONADO O NO 
				this.habilitarDeshabilitarTipoMantenimientoTipoAutoriConsep(esRelaciones);						
				
				this.seleccionarTipoAutoriConsep(evt,null,rowIndex);
				
				//SELECCIONA ACTUAL PERO AUN NO SE HA INGRESADO AL SISTEMA
				//SE DESHABILITA POR GUARDAR CAMBIOS
				/*
				if(this.tipoautoriconsep.getId()<0) {
					this.isEsNuevoTipoAutoriConsep=true;
				}
				*/
				
				if(!this.esParaBusquedaForeignKey) {
					this.modificarTipoAutoriConsep(evt,rowIndex,esRelaciones);
				} else {
					this.seleccionarTipoAutoriConsep(evt,rowIndex);
				}	
				
				if(this.tipoautoriconsepSessionBean.getConGuardarRelaciones()) {
					this.dEnd=(double)System.currentTimeMillis();					
					this.dDif=this.dEnd - this.dStart;
					
					if(Constantes.ISDEVELOPING) {
						System.out.println("Tiempo(ms) Seleccion TipoAutoriConsep: " + this.dDif); 
					}
				}								
				
				TipoAutoriConsepBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.tipoautoriconsep,new Object(),this.tipoautoriconsepParameterGeneral,this.tipoautoriconsepReturnGeneral);
				
			} else {
				this.estaModoEliminarGuardarCambios=true;
				
				this.seleccionarTipoAutoriConsep(evt,null,rowIndex);
				
				if(this.permiteMantenimiento(this.tipoautoriconsep)) {
					if(this.tipoautoriconsep.getId()>0) {
						this.tipoautoriconsep.setIsDeleted(true);
						
						this.tipoautoriconsepsEliminados.add(this.tipoautoriconsep);
					}
					
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.tipoautoriconsepLogic.getTipoAutoriConseps().remove(this.tipoautoriconsep);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.tipoautoriconseps.remove(this.tipoautoriconsep);				
					}
					
					
					((TipoAutoriConsepModel) this.jTableDatosTipoAutoriConsep.getModel()).fireTableRowsDeleted(rowIndex,rowIndex);
					
					this.actualizarFilaTotales();
					
					this.inicializarActualizarBindingTablaTipoAutoriConsep(false);					
				}								
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException2(this, e,logger,TipoAutoriConsepConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoSeleccionar=false;				
			this.estaModoEliminarGuardarCambios=false;
		}
	}
	
	
	public void seleccionarTipoAutoriConsep(ActionEvent evt,javax.swing.event.ListSelectionEvent evt2,int rowIndex) throws Exception { 
		try {
			//SI PUEDE SER NUEVO Y SELECCIONAR (PARA DUPLICAR Y NUEVO TABLA)
			//if(!this.isEsNuevoTipoAutoriConsep) {
			
			if(this.jInternalFrameDetalleFormTipoAutoriConsep==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosTipoAutoriConsep.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosTipoAutoriConsep.getSelectedRow();	       
				}
				
				//CUANDO SE RECARGA TABLA TAMBIEN SE SELECCIONA PERO CON -1 POR LO QUE SE NECESITA VALIDAR ANTES
				if(intSelectedRow<0) {
					return;
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoautoriconsep =(TipoAutoriConsep) this.tipoautoriconsepLogic.getTipoAutoriConseps().toArray()[this.jTableDatosTipoAutoriConsep.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipoautoriconsep =(TipoAutoriConsep) this.tipoautoriconseps.toArray()[this.jTableDatosTipoAutoriConsep.convertRowIndexToModel(intSelectedRow)];
				}
				
				if(TipoAutoriConsepJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesObjetoActualToFormularioTipoAutoriConsep(this.tipoautoriconsep);
				}
				
				//ARCHITECTURE
				try {
					
				} catch(Exception e) {
					throw e;
				}
				
				this.actualizarEstadoCeldasBotonesTipoAutoriConsep("s", this.isGuardarCambiosEnLote, this.isEsMantenimientoRelacionado);
				
				//NO FUNCIONA BINDING PERO SE MANTIENE
				this.inicializarActualizarBindingBotonesTipoAutoriConsep(false) ;
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualTipoAutoriConsep() ;
			//}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoAutoriConsepConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesObjetoActualToFormularioTodoTipoAutoriConsep(TipoAutoriConsep tipoautoriconsep) throws Exception { 
		this.setVariablesObjetoActualToFormularioTodoTipoAutoriConsep(tipoautoriconsep,false,"NINGUNO");
	}
	
	public void setVariablesObjetoActualToFormularioTodoTipoAutoriConsep(TipoAutoriConsep tipoautoriconsep,Boolean conCargarListasDesdeObjetoActual,String sTipoEvento) throws Exception { 
		this.setVariablesObjetoActualToFormularioTipoAutoriConsep(tipoautoriconsep);
		
		if(conCargarListasDesdeObjetoActual) {
			this.setVariablesObjetoActualToListasForeignKeyTipoAutoriConsep(tipoautoriconsep,sTipoEvento);
		}
		
		this.setVariablesObjetoActualToFormularioForeignKeyTipoAutoriConsep(tipoautoriconsep);
	}
	
	public void setVariablesObjetoActualToFormularioTipoAutoriConsep(TipoAutoriConsep tipoautoriconsep) throws Exception { 
		try {			
			Image imageActual=null;
			ImageIcon imageIcon = null;
			
			if(this.jInternalFrameDetalleFormTipoAutoriConsep==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			
			this.jInternalFrameDetalleFormTipoAutoriConsep.jTextFieldidTipoAutoriConsep.setText(tipoautoriconsep.getId().toString());
			this.jInternalFrameDetalleFormTipoAutoriConsep.jTextFieldcodigoTipoAutoriConsep.setText(tipoautoriconsep.getcodigo());
			this.jInternalFrameDetalleFormTipoAutoriConsep.jTextFieldnombreTipoAutoriConsep.setText(tipoautoriconsep.getnombre());
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoAutoriConsepConstantesFunciones.CLASSNAME);
		}
	}
		
	public void actualizarInformacion(String sTipo,TipoAutoriConsep tipoautoriconsepLocal) throws Exception {
		this.actualizarInformacion(sTipo,false,tipoautoriconsepLocal);
	}	
	
	public void actualizarInformacion(String sTipo,Boolean conParametroObjeto,TipoAutoriConsep tipoautoriconsepLocal) throws Exception {
		
		if(!conParametroObjeto) {
			if(!this.getEsControlTabla()) {
				tipoautoriconsepLocal=this.tipoautoriconsep;
			} else {
				tipoautoriconsepLocal=this.tipoautoriconsepAnterior;
			}
		}
		
		if(this.permiteMantenimiento(tipoautoriconsepLocal)) {
			if(sTipo.equals("EVENTO_CONTROL")) { // || sTipo.equals("EVENTO_NUEVO")
				if(!this.esControlTabla) {
					this.setVariablesFormularioToObjetoActualTodoTipoAutoriConsep(tipoautoriconsepLocal,true);
					
					if(tipoautoriconsepSessionBean.getConGuardarRelaciones()) {
						this.actualizarRelaciones(tipoautoriconsepLocal);
					}
				}
			
			} else if(sTipo.equals("INFO_PADRE")) {
				
				if(this.tipoautoriconsepSessionBean.getEsGuardarRelacionado()) {
					this.actualizarRelacionFkPadreActual(tipoautoriconsepLocal);
				}
			}
		}
	}
	
	public void setVariablesFormularioToObjetoActualTodoTipoAutoriConsep(TipoAutoriConsep tipoautoriconsep,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualTipoAutoriConsep(tipoautoriconsep,conColumnasBase);
		this.setVariablesFormularioToObjetoActualForeignKeysTipoAutoriConsep(tipoautoriconsep);
	}
	
	public void setVariablesFormularioToObjetoActualTipoAutoriConsep(TipoAutoriConsep tipoautoriconsep,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualTipoAutoriConsep(tipoautoriconsep,conColumnasBase,true);
	}
	
	public void setVariablesFormularioToObjetoActualTipoAutoriConsep(TipoAutoriConsep tipoautoriconsep,Boolean conColumnasBase,Boolean conInicializarInvalidValues) throws Exception { 
		String sMensajeCampoActual="";
		Boolean estaValidado=true;
		try {
			
			if(this.jInternalFrameDetalleFormTipoAutoriConsep==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			if(conInicializarInvalidValues) {
				this.inicializarInvalidValues();
			}
			
			

		try {
			if(this.jInternalFrameDetalleFormTipoAutoriConsep.jTextFieldidTipoAutoriConsep.getText()==null || this.jInternalFrameDetalleFormTipoAutoriConsep.jTextFieldidTipoAutoriConsep.getText()=="" || this.jInternalFrameDetalleFormTipoAutoriConsep.jTextFieldidTipoAutoriConsep.getText()=="Id") {
				this.jInternalFrameDetalleFormTipoAutoriConsep.jTextFieldidTipoAutoriConsep.setText("0");
			}

			if(conColumnasBase) {tipoautoriconsep.setId(Long.parseLong(this.jInternalFrameDetalleFormTipoAutoriConsep.jTextFieldidTipoAutoriConsep.getText()));}
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+TipoAutoriConsepConstantesFunciones.LABEL_ID+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTipoAutoriConsep.jLabelIdTipoAutoriConsep,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			tipoautoriconsep.setcodigo(this.jInternalFrameDetalleFormTipoAutoriConsep.jTextFieldcodigoTipoAutoriConsep.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+TipoAutoriConsepConstantesFunciones.LABEL_CODIGO+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTipoAutoriConsep.jLabelcodigoTipoAutoriConsep,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			tipoautoriconsep.setnombre(this.jInternalFrameDetalleFormTipoAutoriConsep.jTextFieldnombreTipoAutoriConsep.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+TipoAutoriConsepConstantesFunciones.LABEL_NOMBRE+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTipoAutoriConsep.jLabelnombreTipoAutoriConsep,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}
			
			if(!estaValidado) {
				throw new Exception(sMensajeCampoActual);
			}
		} catch(NumberFormatException e) {
			throw new Exception(sMensajeCampoActual);
			//FuncionesSwing.manageException(this, e,logger,MovimientoInventarioConstantesFunciones.CLASSNAME);
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoAutoriConsepConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualTipoAutoriConsep(TipoAutoriConsep tipoautoriconsepBean,TipoAutoriConsep tipoautoriconsep,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoAutoriConsepConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setCopiarVariablesObjetosTipoAutoriConsep(TipoAutoriConsep tipoautoriconsepOrigen,TipoAutoriConsep tipoautoriconsep,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			if(conColumnasBase) {if(conDefault || (!conDefault && tipoautoriconsepOrigen.getId()!=null && !tipoautoriconsepOrigen.getId().equals(0L))) {tipoautoriconsep.setId(tipoautoriconsepOrigen.getId());}}
			if(conDefault || (!conDefault && tipoautoriconsepOrigen.getcodigo()!=null && !tipoautoriconsepOrigen.getcodigo().equals(""))) {tipoautoriconsep.setcodigo(tipoautoriconsepOrigen.getcodigo());}
			if(conDefault || (!conDefault && tipoautoriconsepOrigen.getnombre()!=null && !tipoautoriconsepOrigen.getnombre().equals(""))) {tipoautoriconsep.setnombre(tipoautoriconsepOrigen.getnombre());}
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoAutoriConsepConstantesFunciones.CLASSNAME);
		}
	}
	
	/*
	public void setVariablesObjetoBeanActualToFormularioTipoAutoriConsep(TipoAutoriConsep tipoautoriconsep) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormTipoAutoriConsep.jTextFieldidTipoAutoriConsep.setText(tipoautoriconsep.getId().toString());
			this.jInternalFrameDetalleFormTipoAutoriConsep.jTextFieldcodigoTipoAutoriConsep.setText(tipoautoriconsep.getcodigo());
			this.jInternalFrameDetalleFormTipoAutoriConsep.jTextFieldnombreTipoAutoriConsep.setText(tipoautoriconsep.getnombre());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoAutoriConsepConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoBeanActualToFormularioTipoAutoriConsep(TipoAutoriConsepBean tipoautoriconsepBean) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormTipoAutoriConsep.jTextFieldidTipoAutoriConsep.setText(tipoautoriconsepBean.getId().toString());
			this.jInternalFrameDetalleFormTipoAutoriConsep.jTextFieldcodigoTipoAutoriConsep.setText(tipoautoriconsepBean.getcodigo());
			this.jInternalFrameDetalleFormTipoAutoriConsep.jTextFieldnombreTipoAutoriConsep.setText(tipoautoriconsepBean.getnombre());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoAutoriConsepConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoReturnGeneralToBeanTipoAutoriConsep(TipoAutoriConsepParameterReturnGeneral tipoautoriconsepReturnGeneral,TipoAutoriConsepBean tipoautoriconsepBean,Boolean conDefault) throws Exception { 
		try {
			TipoAutoriConsep tipoautoriconsepLocal=new TipoAutoriConsep();
			
			tipoautoriconsepLocal=tipoautoriconsepReturnGeneral.getTipoAutoriConsep();
			
			
			if(conColumnasBase) {if(conDefault || (!conDefault && tipoautoriconsepLocal.getId()!=null && !tipoautoriconsepLocal.getId().equals(0L))) {tipoautoriconsepBean.setId(tipoautoriconsepLocal.getId());}}
			if(conDefault || (!conDefault && tipoautoriconsepLocal.getcodigo()!=null && !tipoautoriconsepLocal.getcodigo().equals(""))) {tipoautoriconsepBean.setcodigo(tipoautoriconsepLocal.getcodigo());}
			if(conDefault || (!conDefault && tipoautoriconsepLocal.getnombre()!=null && !tipoautoriconsepLocal.getnombre().equals(""))) {tipoautoriconsepBean.setnombre(tipoautoriconsepLocal.getnombre());}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoAutoriConsepConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	@SuppressWarnings("rawtypes")
	public static void setActualComboBoxTipoAutoriConsepGenerico(Long idTipoAutoriConsepSeleccionado,JComboBox jComboBoxTipoAutoriConsep,List<TipoAutoriConsep> tipoautoriconsepsLocal)throws Exception {
		try {
			TipoAutoriConsep  tipoautoriconsepTemp=null;

			for(TipoAutoriConsep tipoautoriconsepAux:tipoautoriconsepsLocal) {
				if(tipoautoriconsepAux.getId()!=null && tipoautoriconsepAux.getId().equals(idTipoAutoriConsepSeleccionado)) {
					tipoautoriconsepTemp=tipoautoriconsepAux;
					break;
				}
			}

			jComboBoxTipoAutoriConsep.setSelectedItem(tipoautoriconsepTemp);

		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("rawtypes")
	public static void setHotKeysComboBoxTipoAutoriConsepGenerico(JComboBox jComboBoxTipoAutoriConsep,JInternalFrameBase jInternalFrameBase,String sNombreHotKeyAbstractAction,String sTipoBusqueda)throws Exception {
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
				
				jComboBoxTipoAutoriConsep.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxTipoAutoriConsep.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Busqueda"));
				//BUSCAR
				
				
				//ACTUALIZAR
				sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
				keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_ACTUALIZAR");
				
				jComboBoxTipoAutoriConsep.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxTipoAutoriConsep.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Update"));
				//ACTUALIZAR
				
				if(sTipoBusqueda.contains("CON_EVENT_CHANGE")) {
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxTipoAutoriConsep.addFocusListener(new ComboBoxFocusListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
						jComboBoxTipoAutoriConsep.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));						
					}
					
					/*
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxTipoAutoriConsep.addItemListener(new ComboBoxItemListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					} else {
						jComboBoxTipoAutoriConsep.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					}
					*/
				}								
				
				//CON_BUSQUEDA								
				if(sTipoBusqueda.contains("CON_BUSQUEDA")) {
					sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
					keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_BUSQUEDA");
							
					jComboBoxTipoAutoriConsep.getInputMap().put(keyStrokeControl, sKeyStrokeName);
					jComboBoxTipoAutoriConsep.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction));
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
			
		if(sTipo.equals("AutoriConsep")) {
			jButtonAutoriConsepActionPerformed(evt,rowIndex,true,false,null);
		}
		} catch (Exception e) {
			FuncionesSwing.manageException2(this, e,logger,TipoAutoriConsepConstantesFunciones.CLASSNAME);
		}
	}
	
	public String getDescripcionFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		String sDescripcion="";
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tipoautoriconsep=(TipoAutoriConsep) tipoautoriconsepLogic.getTipoAutoriConseps().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			tipoautoriconsep =(TipoAutoriConsep) tipoautoriconseps.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		
		return sDescripcion;
	}
	
	public Color getColorFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		Color color=Color.WHITE;
		
		TipoAutoriConsep tipoautoriconsepRow=new TipoAutoriConsep();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tipoautoriconsepRow=(TipoAutoriConsep) tipoautoriconsepLogic.getTipoAutoriConseps().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			tipoautoriconsepRow=(TipoAutoriConsep) tipoautoriconseps.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		
		return color;
	}
	
	
	
	
	public void jButtonAutoriConsepActionPerformed(ActionEvent evt,int rowIndex,Boolean conInicializar,Boolean esRelacionado,TipoAutoriConsep tipoautoriconsep) throws Exception {
			try {

				if(this.jInternalFrameDetalleFormTipoAutoriConsep==null) {
					this.inicializarFormDetalle();
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoautoriconsepLogic.getNewConnexionToDeep("");
				}

				int intSelectedRow =rowIndex;

				if(intSelectedRow!=-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tipoautoriconsep = (TipoAutoriConsep)this.tipoautoriconsepLogic.getTipoAutoriConseps().toArray()[this.jTableDatosTipoAutoriConsep.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE) {
						this.tipoautoriconsep = (TipoAutoriConsep)this.tipoautoriconseps.toArray()[this.jTableDatosTipoAutoriConsep.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				} else {
					if(tipoautoriconsep!=null) {
						this.tipoautoriconsep = tipoautoriconsep;
					} else {
						this.tipoautoriconsep = new TipoAutoriConsep();
					}
				}

				if(this.isTienePermisosAutoriConsep && this.permiteMantenimiento(this.tipoautoriconsep)) {
					AutoriConsepBeanSwingJInternalFrame autoriconsepBeanSwingJInternalFrame=null;

					if(conInicializar) {
						this.jInternalFrameDetalleFormTipoAutoriConsep.autoriconsepBeanSwingJInternalFramePopup=new AutoriConsepBeanSwingJInternalFrame(false,false,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.SECUNDARIO,false,false,true,false);
						this.jInternalFrameDetalleFormTipoAutoriConsep.autoriconsepBeanSwingJInternalFramePopup.setJInternalFrameParent(this);

						autoriconsepBeanSwingJInternalFrame=this.jInternalFrameDetalleFormTipoAutoriConsep.autoriconsepBeanSwingJInternalFramePopup;
					} else {
						autoriconsepBeanSwingJInternalFrame=this.jInternalFrameDetalleFormTipoAutoriConsep.autoriconsepBeanSwingJInternalFrame;
					}

					List<TipoAutoriConsep> tipoautoriconseps=new ArrayList<TipoAutoriConsep>();
					tipoautoriconseps.add(this.tipoautoriconsep);
					if(!esRelacionado) {
						//autoriconsepBeanSwingJInternalFrame.autoriconsepSessionBean.setConGuardarRelaciones(false);
						//autoriconsepBeanSwingJInternalFrame.autoriconsepSessionBean.setEsGuardarRelacionado(false);
					}

					//DESHABILITA TEMPORALMENTE EVENTOS CHANGE DE TEXTOS,COMBOS,ETC
					autoriconsepBeanSwingJInternalFrame.estaModoSeleccionar=true;
					this.jInternalFrameDetalleFormTipoAutoriConsep.cargarAutoriConsepBeanSwingJInternalFrame(tipoautoriconseps,this.tipoautoriconsep,autoriconsepBeanSwingJInternalFrame,/*conInicializar,*/autoriconsepBeanSwingJInternalFrame.autoriconsepSessionBean.getConGuardarRelaciones(),autoriconsepBeanSwingJInternalFrame.autoriconsepSessionBean.getEsGuardarRelacionado());
					autoriconsepBeanSwingJInternalFrame.estaModoSeleccionar=false;


					if(!esRelacionado) {
						autoriconsepBeanSwingJInternalFrame.actualizarEstadoPanelsAutoriConsep("no_relacionado");

						autoriconsepBeanSwingJInternalFrame.redimensionarTablaDatosConTamanio(AutoriConsepConstantesFunciones.ITAMANIOFILATABLA + (AutoriConsepConstantesFunciones.ITAMANIOFILATABLA/2));

						autoriconsepBeanSwingJInternalFrame.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_REL_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_REL_Y));

						TitledBorder titledBorderTipoAutoriConsep=(TitledBorder)this.jScrollPanelDatosTipoAutoriConsep.getBorder();
						TitledBorder titledBorderAutoriConsep=(TitledBorder)autoriconsepBeanSwingJInternalFrame.jScrollPanelDatosAutoriConsep.getBorder();

						titledBorderAutoriConsep.setTitle(titledBorderTipoAutoriConsep.getTitle() + " -> Autorizaciones Consep");

						if(!Constantes.CON_VARIAS_VENTANAS) {
							MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,autoriconsepBeanSwingJInternalFrame);
						}

						autoriconsepBeanSwingJInternalFrame.setVisible(true);

						this.jDesktopPane.add(autoriconsepBeanSwingJInternalFrame);

						autoriconsepBeanSwingJInternalFrame.setSelected(true);
					}

				} else {
					if(!this.tipoautoriconsepSessionBean.getConGuardarRelaciones()) {
						JOptionPane.showMessageDialog(this,"NO TIENE PERMISOS PARA USAR LA FUNCIONALIDAD DE Autorizaciones Consep",Constantes.SERROR,JOptionPane.ERROR_MESSAGE);
					}
				}
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoautoriconsepLogic.commitNewConnexionToDeep();
				}

			}

			catch(Exception e) {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoautoriconsepLogic.rollbackNewConnexionToDeep();
				}


				FuncionesSwing.manageException2(this, e,logger,TipoAutoriConsepConstantesFunciones.CLASSNAME);
			} finally { 
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoautoriconsepLogic.closeNewConnexionToDeep();
				}

			}
		}

	
	
	
	public void refrescarBindingTabla(Boolean blnSoloTabla) {
	}
	
	public void inicializarActualizarBindingBotonesManualTipoAutoriConsep(Boolean esSetControles) {						
		if(esSetControles) {
			this.jButtonNuevoTipoAutoriConsep.setVisible((this.isVisibilidadCeldaNuevoTipoAutoriConsep && this.isPermisoNuevoTipoAutoriConsep));			
			this.jButtonDuplicarTipoAutoriConsep.setVisible((this.isVisibilidadCeldaDuplicarTipoAutoriConsep && this.isPermisoDuplicarTipoAutoriConsep));			
			this.jButtonCopiarTipoAutoriConsep.setVisible((this.isVisibilidadCeldaCopiarTipoAutoriConsep && this.isPermisoCopiarTipoAutoriConsep));
			this.jButtonVerFormTipoAutoriConsep.setVisible((this.isVisibilidadCeldaVerFormTipoAutoriConsep && this.isPermisoVerFormTipoAutoriConsep));
			
			this.jButtonAbrirOrderByTipoAutoriConsep.setVisible((this.isVisibilidadCeldaOrdenTipoAutoriConsep && this.isPermisoOrdenTipoAutoriConsep));			
			
			this.jButtonNuevoRelacionesTipoAutoriConsep.setVisible((this.isVisibilidadCeldaNuevoRelacionesTipoAutoriConsep && this.isPermisoNuevoTipoAutoriConsep));			
			this.jButtonNuevoGuardarCambiosTipoAutoriConsep.setVisible((this.isVisibilidadCeldaNuevoTipoAutoriConsep && this.isPermisoNuevoTipoAutoriConsep && this.isPermisoGuardarCambiosTipoAutoriConsep));
			
			if(this.jInternalFrameDetalleFormTipoAutoriConsep!=null) {
			this.jInternalFrameDetalleFormTipoAutoriConsep.jButtonModificarTipoAutoriConsep.setVisible((this.isVisibilidadCeldaModificarTipoAutoriConsep && this.isPermisoActualizarTipoAutoriConsep));	
			this.jInternalFrameDetalleFormTipoAutoriConsep.jButtonActualizarTipoAutoriConsep.setVisible((this.isVisibilidadCeldaActualizarTipoAutoriConsep && this.isPermisoActualizarTipoAutoriConsep));	
			this.jInternalFrameDetalleFormTipoAutoriConsep.jButtonEliminarTipoAutoriConsep.setVisible((this.isVisibilidadCeldaEliminarTipoAutoriConsep && this.isPermisoEliminarTipoAutoriConsep));
			this.jInternalFrameDetalleFormTipoAutoriConsep.jButtonCancelarTipoAutoriConsep.setVisible(this.isVisibilidadCeldaCancelarTipoAutoriConsep);							
			this.jInternalFrameDetalleFormTipoAutoriConsep.jButtonGuardarCambiosTipoAutoriConsep.setVisible((this.isVisibilidadCeldaGuardarTipoAutoriConsep && this.isPermisoGuardarCambiosTipoAutoriConsep));			
			
			}
						
			this.jButtonGuardarCambiosTablaTipoAutoriConsep.setVisible((this.isVisibilidadCeldaGuardarCambiosTipoAutoriConsep && this.isPermisoGuardarCambiosTipoAutoriConsep));							
			
			//TOOLBAR
			
			this.jButtonNuevoToolBarTipoAutoriConsep.setVisible((this.isVisibilidadCeldaNuevoTipoAutoriConsep && this.isPermisoNuevoTipoAutoriConsep));						
			this.jButtonDuplicarToolBarTipoAutoriConsep.setVisible((this.isVisibilidadCeldaDuplicarTipoAutoriConsep && this.isPermisoDuplicarTipoAutoriConsep));						
			this.jButtonCopiarToolBarTipoAutoriConsep.setVisible((this.isVisibilidadCeldaCopiarTipoAutoriConsep && this.isPermisoCopiarTipoAutoriConsep));			
			this.jButtonVerFormToolBarTipoAutoriConsep.setVisible((this.isVisibilidadCeldaVerFormTipoAutoriConsep && this.isPermisoVerFormTipoAutoriConsep));			
			this.jButtonAbrirOrderByToolBarTipoAutoriConsep.setVisible((this.isVisibilidadCeldaOrdenTipoAutoriConsep && this.isPermisoOrdenTipoAutoriConsep));
			this.jButtonNuevoRelacionesToolBarTipoAutoriConsep.setVisible((this.isVisibilidadCeldaNuevoRelacionesTipoAutoriConsep && this.isPermisoNuevoTipoAutoriConsep));			
			this.jButtonNuevoGuardarCambiosToolBarTipoAutoriConsep.setVisible((this.isVisibilidadCeldaNuevoTipoAutoriConsep && this.isPermisoNuevoTipoAutoriConsep && this.isPermisoGuardarCambiosTipoAutoriConsep));			
			
			if(this.jInternalFrameDetalleFormTipoAutoriConsep!=null) {
			this.jInternalFrameDetalleFormTipoAutoriConsep.jButtonModificarToolBarTipoAutoriConsep.setVisible((this.isVisibilidadCeldaModificarTipoAutoriConsep && this.isPermisoActualizarTipoAutoriConsep));	
			this.jInternalFrameDetalleFormTipoAutoriConsep.jButtonActualizarToolBarTipoAutoriConsep.setVisible((this.isVisibilidadCeldaActualizarTipoAutoriConsep  && this.isPermisoActualizarTipoAutoriConsep));	
			this.jInternalFrameDetalleFormTipoAutoriConsep.jButtonEliminarToolBarTipoAutoriConsep.setVisible((this.isVisibilidadCeldaEliminarTipoAutoriConsep && this.isPermisoEliminarTipoAutoriConsep));
			this.jInternalFrameDetalleFormTipoAutoriConsep.jButtonCancelarToolBarTipoAutoriConsep.setVisible(this.isVisibilidadCeldaCancelarTipoAutoriConsep);				
			this.jInternalFrameDetalleFormTipoAutoriConsep.jButtonGuardarCambiosToolBarTipoAutoriConsep.setVisible((this.isVisibilidadCeldaGuardarTipoAutoriConsep && this.isPermisoGuardarCambiosTipoAutoriConsep));									
			}
			
			this.jButtonGuardarCambiosTablaToolBarTipoAutoriConsep.setVisible((this.isVisibilidadCeldaGuardarCambiosTipoAutoriConsep && this.isPermisoGuardarCambiosTipoAutoriConsep));									
			
			//TOOLBAR
			
			//MENUS
			
			this.jMenuItemNuevoTipoAutoriConsep.setVisible((this.isVisibilidadCeldaNuevoTipoAutoriConsep && this.isPermisoNuevoTipoAutoriConsep));			
			this.jMenuItemDuplicarTipoAutoriConsep.setVisible((this.isVisibilidadCeldaDuplicarTipoAutoriConsep && this.isPermisoDuplicarTipoAutoriConsep));			
			this.jMenuItemCopiarTipoAutoriConsep.setVisible((this.isVisibilidadCeldaCopiarTipoAutoriConsep && this.isPermisoCopiarTipoAutoriConsep));			
			this.jMenuItemVerFormTipoAutoriConsep.setVisible((this.isVisibilidadCeldaVerFormTipoAutoriConsep && this.isPermisoVerFormTipoAutoriConsep));			
			this.jMenuItemAbrirOrderByTipoAutoriConsep.setVisible((this.isVisibilidadCeldaOrdenTipoAutoriConsep && this.isPermisoOrdenTipoAutoriConsep));			
			//this.jMenuItemMostrarOcultarTipoAutoriConsep.setVisible((this.isVisibilidadCeldaOrdenTipoAutoriConsep && this.isPermisoOrdenTipoAutoriConsep));
			this.jMenuItemDetalleAbrirOrderByTipoAutoriConsep.setVisible((this.isVisibilidadCeldaOrdenTipoAutoriConsep && this.isPermisoOrdenTipoAutoriConsep));			
			//this.jMenuItemDetalleMostrarOcultarTipoAutoriConsep.setVisible((this.isVisibilidadCeldaOrdenTipoAutoriConsep && this.isPermisoOrdenTipoAutoriConsep));			
			this.jMenuItemNuevoRelacionesTipoAutoriConsep.setVisible((this.isVisibilidadCeldaNuevoRelacionesTipoAutoriConsep && this.isPermisoNuevoTipoAutoriConsep));			
			this.jMenuItemNuevoGuardarCambiosTipoAutoriConsep.setVisible((this.isVisibilidadCeldaNuevoTipoAutoriConsep && this.isPermisoNuevoTipoAutoriConsep && this.isPermisoGuardarCambiosTipoAutoriConsep));									
			
			if(this.jInternalFrameDetalleFormTipoAutoriConsep!=null) {
			this.jInternalFrameDetalleFormTipoAutoriConsep.jMenuItemModificarTipoAutoriConsep.setVisible((this.isVisibilidadCeldaModificarTipoAutoriConsep && this.isPermisoActualizarTipoAutoriConsep));	
			this.jInternalFrameDetalleFormTipoAutoriConsep.jMenuItemActualizarTipoAutoriConsep.setVisible((this.isVisibilidadCeldaActualizarTipoAutoriConsep && this.isPermisoActualizarTipoAutoriConsep));	
			this.jInternalFrameDetalleFormTipoAutoriConsep.jMenuItemEliminarTipoAutoriConsep.setVisible((this.isVisibilidadCeldaEliminarTipoAutoriConsep && this.isPermisoEliminarTipoAutoriConsep));
			this.jInternalFrameDetalleFormTipoAutoriConsep.jMenuItemCancelarTipoAutoriConsep.setVisible(this.isVisibilidadCeldaCancelarTipoAutoriConsep);				
			}
			
			this.jMenuItemGuardarCambiosTipoAutoriConsep.setVisible((this.isVisibilidadCeldaGuardarTipoAutoriConsep && this.isPermisoGuardarCambiosTipoAutoriConsep));						
			this.jMenuItemGuardarCambiosTablaTipoAutoriConsep.setVisible((this.isVisibilidadCeldaGuardarCambiosTipoAutoriConsep && this.isPermisoGuardarCambiosTipoAutoriConsep));						
			
			//MENUS
			
		} else {
			this.isVisibilidadCeldaNuevoTipoAutoriConsep=this.jButtonNuevoTipoAutoriConsep.isVisible();
			this.isVisibilidadCeldaDuplicarTipoAutoriConsep=this.jButtonDuplicarTipoAutoriConsep.isVisible();
			this.isVisibilidadCeldaCopiarTipoAutoriConsep=this.jButtonCopiarTipoAutoriConsep.isVisible();
			this.isVisibilidadCeldaVerFormTipoAutoriConsep=this.jButtonVerFormTipoAutoriConsep.isVisible();
			
			this.isVisibilidadCeldaOrdenTipoAutoriConsep=this.jButtonAbrirOrderByTipoAutoriConsep.isVisible();			
			
			this.isVisibilidadCeldaNuevoRelacionesTipoAutoriConsep=this.jButtonNuevoRelacionesTipoAutoriConsep.isVisible();
			this.isVisibilidadCeldaModificarTipoAutoriConsep=this.jButtonModificarTipoAutoriConsep.isVisible();
			
			if(this.jInternalFrameDetalleFormTipoAutoriConsep!=null) {
			this.isVisibilidadCeldaActualizarTipoAutoriConsep=this.jInternalFrameDetalleFormTipoAutoriConsep.jButtonActualizarTipoAutoriConsep.isVisible();
			this.isVisibilidadCeldaEliminarTipoAutoriConsep=this.jInternalFrameDetalleFormTipoAutoriConsep.jButtonEliminarTipoAutoriConsep.isVisible();
			this.isVisibilidadCeldaCancelarTipoAutoriConsep=this.jInternalFrameDetalleFormTipoAutoriConsep.jButtonCancelarTipoAutoriConsep.isVisible();
			this.isVisibilidadCeldaGuardarTipoAutoriConsep=this.jInternalFrameDetalleFormTipoAutoriConsep.jButtonGuardarCambiosTipoAutoriConsep.isVisible();			
			}
			
			this.isVisibilidadCeldaGuardarCambiosTipoAutoriConsep=this.jButtonGuardarCambiosTablaTipoAutoriConsep.isVisible();
			
			//TOOLBAR
			
			this.isVisibilidadCeldaNuevoTipoAutoriConsep=this.jButtonNuevoToolBarTipoAutoriConsep.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesTipoAutoriConsep=this.jButtonNuevoRelacionesToolBarTipoAutoriConsep.isVisible();
			
			if(this.jInternalFrameDetalleFormTipoAutoriConsep!=null) {
			this.isVisibilidadCeldaModificarTipoAutoriConsep=this.jInternalFrameDetalleFormTipoAutoriConsep.jButtonModificarToolBarTipoAutoriConsep.isVisible();
			this.isVisibilidadCeldaActualizarTipoAutoriConsep=this.jInternalFrameDetalleFormTipoAutoriConsep.jButtonActualizarToolBarTipoAutoriConsep.isVisible();
			this.isVisibilidadCeldaEliminarTipoAutoriConsep=this.jInternalFrameDetalleFormTipoAutoriConsep.jButtonEliminarToolBarTipoAutoriConsep.isVisible();
			this.isVisibilidadCeldaCancelarTipoAutoriConsep=this.jInternalFrameDetalleFormTipoAutoriConsep.jButtonCancelarToolBarTipoAutoriConsep.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarTipoAutoriConsep=this.jButtonGuardarCambiosToolBarTipoAutoriConsep.isVisible();
			this.isVisibilidadCeldaGuardarCambiosTipoAutoriConsep=this.jButtonGuardarCambiosTablaToolBarTipoAutoriConsep.isVisible();						
			
			//TOOLBAR
			
			//MENUS
			
			this.isVisibilidadCeldaNuevoTipoAutoriConsep=this.jMenuItemNuevoTipoAutoriConsep.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesTipoAutoriConsep=this.jMenuItemNuevoRelacionesTipoAutoriConsep.isVisible();
			
			if(this.jInternalFrameDetalleFormTipoAutoriConsep!=null) {
			this.isVisibilidadCeldaModificarTipoAutoriConsep=this.jInternalFrameDetalleFormTipoAutoriConsep.jMenuItemModificarTipoAutoriConsep.isVisible();
			this.isVisibilidadCeldaActualizarTipoAutoriConsep=this.jInternalFrameDetalleFormTipoAutoriConsep.jMenuItemActualizarTipoAutoriConsep.isVisible();
			this.isVisibilidadCeldaEliminarTipoAutoriConsep=this.jInternalFrameDetalleFormTipoAutoriConsep.jMenuItemEliminarTipoAutoriConsep.isVisible();
			this.isVisibilidadCeldaCancelarTipoAutoriConsep=this.jInternalFrameDetalleFormTipoAutoriConsep.jMenuItemCancelarTipoAutoriConsep.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarTipoAutoriConsep=this.jMenuItemGuardarCambiosTipoAutoriConsep.isVisible();
			this.isVisibilidadCeldaGuardarCambiosTipoAutoriConsep=this.jMenuItemGuardarCambiosTablaTipoAutoriConsep.isVisible();						
			
			//MENUS
		}
	}
	
	public void inicializarActualizarBindingBotonesTipoAutoriConsep(Boolean esInicializar) {
		if(TipoAutoriConsepJInternalFrame.ISBINDING_MANUAL) {			
			if(this.tipoautoriconsepSessionBean.getConGuardarRelaciones()) {
				//if(this.tipoautoriconsepSessionBean.getEsGuardarRelacionado()) {
				
				this.actualizarEstadoCeldasBotonesConGuardarRelacionesTipoAutoriConsep();
			}
			
			this.inicializarActualizarBindingBotonesManualTipoAutoriConsep(true);
			
		} else {	
		}
	}		
	
	public void inicializarActualizarBindingBotonesPermisosManualTipoAutoriConsep() {
		this.jButtonNuevoTipoAutoriConsep.setVisible(this.isPermisoNuevoTipoAutoriConsep);			
		this.jButtonDuplicarTipoAutoriConsep.setVisible(this.isPermisoDuplicarTipoAutoriConsep);			
		this.jButtonCopiarTipoAutoriConsep.setVisible(this.isPermisoCopiarTipoAutoriConsep);			
		this.jButtonVerFormTipoAutoriConsep.setVisible(this.isPermisoVerFormTipoAutoriConsep);			
		
		this.jButtonAbrirOrderByTipoAutoriConsep.setVisible(this.isPermisoOrdenTipoAutoriConsep);					
		
		this.jButtonNuevoRelacionesTipoAutoriConsep.setVisible(this.isPermisoNuevoTipoAutoriConsep);			
		
		if(this.jInternalFrameDetalleFormTipoAutoriConsep!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoAutoriConsep.jButtonModificarTipoAutoriConsep.setVisible(this.isPermisoActualizarTipoAutoriConsep);	
			this.jInternalFrameDetalleFormTipoAutoriConsep.jButtonActualizarTipoAutoriConsep.setVisible(this.isPermisoActualizarTipoAutoriConsep);	
			this.jInternalFrameDetalleFormTipoAutoriConsep.jButtonEliminarTipoAutoriConsep.setVisible(this.isPermisoEliminarTipoAutoriConsep);
			this.jInternalFrameDetalleFormTipoAutoriConsep.jButtonCancelarTipoAutoriConsep.setVisible(this.isVisibilidadCeldaCancelarTipoAutoriConsep);						
			this.jInternalFrameDetalleFormTipoAutoriConsep.jButtonGuardarCambiosTipoAutoriConsep.setVisible(this.isPermisoGuardarCambiosTipoAutoriConsep);							
		}
		
		this.jButtonGuardarCambiosTablaTipoAutoriConsep.setVisible(this.isPermisoActualizarTipoAutoriConsep);
	}
	
	public void inicializarActualizarBindingBotonesPermisosManualFormDetalleTipoAutoriConsep() {
		this.jInternalFrameDetalleFormTipoAutoriConsep.jButtonModificarTipoAutoriConsep.setVisible(this.isPermisoActualizarTipoAutoriConsep);	
		this.jInternalFrameDetalleFormTipoAutoriConsep.jButtonActualizarTipoAutoriConsep.setVisible(this.isPermisoActualizarTipoAutoriConsep);	
		this.jInternalFrameDetalleFormTipoAutoriConsep.jButtonEliminarTipoAutoriConsep.setVisible(this.isPermisoEliminarTipoAutoriConsep);
		this.jInternalFrameDetalleFormTipoAutoriConsep.jButtonCancelarTipoAutoriConsep.setVisible(this.isVisibilidadCeldaCancelarTipoAutoriConsep);							
		this.jInternalFrameDetalleFormTipoAutoriConsep.jButtonGuardarCambiosTipoAutoriConsep.setVisible((this.isVisibilidadCeldaGuardarTipoAutoriConsep && this.isPermisoGuardarCambiosTipoAutoriConsep));			
	}
	
	public void inicializarActualizarBindingBotonesPermisosTipoAutoriConsep() {
		if(TipoAutoriConsepJInternalFrame.ISBINDING_MANUAL) {
			this.inicializarActualizarBindingBotonesPermisosManualTipoAutoriConsep();
		} else {
		}
	}
	
	
	public void refrescarBindingBotonesTipoAutoriConsep() {
	}
	
	public void jTableDatosTipoAutoriConsepListSelectionListener(javax.swing.event.ListSelectionEvent evt) throws Exception { 
		try {
			this.seleccionarTipoAutoriConsep(null,evt,-1);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoAutoriConsepConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonidTipoAutoriConsepBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoautoriconsepLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosTipoAutoriConsep.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualTipoAutoriConsep(this.gettipoautoriconsep(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoAutoriConsep(this.tipoautoriconsep);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tipoautoriconsep =(TipoAutoriConsep) this.tipoautoriconsepLogic.getTipoAutoriConseps().toArray()[this.jTableDatosTipoAutoriConsep.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.tipoautoriconsep =(TipoAutoriConsep) this.tipoautoriconseps.toArray()[this.jTableDatosTipoAutoriConsep.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.tipoautoriconsep==null) {
						this.tipoautoriconsep = new TipoAutoriConsep();
					}

					this.setVariablesFormularioToObjetoActualTipoAutoriConsep(this.tipoautoriconsep,true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoAutoriConsep(this.tipoautoriconsep);
				}

				if(this.tipoautoriconsep.getId()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id = "+this.tipoautoriconsep.getId().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingTipoAutoriConsep(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoautoriconsepLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoautoriconsepLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,TipoAutoriConsepConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoautoriconsepLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtoncodigoTipoAutoriConsepBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoautoriconsepLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosTipoAutoriConsep.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualTipoAutoriConsep(this.gettipoautoriconsep(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoAutoriConsep(this.tipoautoriconsep);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tipoautoriconsep =(TipoAutoriConsep) this.tipoautoriconsepLogic.getTipoAutoriConseps().toArray()[this.jTableDatosTipoAutoriConsep.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.tipoautoriconsep =(TipoAutoriConsep) this.tipoautoriconseps.toArray()[this.jTableDatosTipoAutoriConsep.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.tipoautoriconsep==null) {
						this.tipoautoriconsep = new TipoAutoriConsep();
					}

					this.setVariablesFormularioToObjetoActualTipoAutoriConsep(this.tipoautoriconsep,true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoAutoriConsep(this.tipoautoriconsep);
				}

				if(this.tipoautoriconsep.getcodigo()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where codigo like '%"+this.tipoautoriconsep.getcodigo()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingTipoAutoriConsep(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoautoriconsepLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoautoriconsepLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,TipoAutoriConsepConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoautoriconsepLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonnombreTipoAutoriConsepBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoautoriconsepLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosTipoAutoriConsep.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualTipoAutoriConsep(this.gettipoautoriconsep(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoAutoriConsep(this.tipoautoriconsep);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tipoautoriconsep =(TipoAutoriConsep) this.tipoautoriconsepLogic.getTipoAutoriConseps().toArray()[this.jTableDatosTipoAutoriConsep.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.tipoautoriconsep =(TipoAutoriConsep) this.tipoautoriconseps.toArray()[this.jTableDatosTipoAutoriConsep.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.tipoautoriconsep==null) {
						this.tipoautoriconsep = new TipoAutoriConsep();
					}

					this.setVariablesFormularioToObjetoActualTipoAutoriConsep(this.tipoautoriconsep,true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoAutoriConsep(this.tipoautoriconsep);
				}

				if(this.tipoautoriconsep.getnombre()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where nombre like '%"+this.tipoautoriconsep.getnombre()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingTipoAutoriConsep(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoautoriconsepLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoautoriconsepLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,TipoAutoriConsepConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoautoriconsepLogic.closeNewConnexionToDeep();
				}

			}
		}

	
	
	public void jButtonBusquedaPorCodigoTipoAutoriConsepActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoautoriconsepLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingTipoAutoriConsep(false,false);

			this.getTipoAutoriConsepsBusquedaPorCodigo();

			this.inicializarActualizarBindingTipoAutoriConsep(false);

			//if(TipoAutoriConsepBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingTipoAutoriConsep(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoautoriconsepLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoautoriconsepLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,TipoAutoriConsepConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoautoriconsepLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonBusquedaPorNombreTipoAutoriConsepActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoautoriconsepLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingTipoAutoriConsep(false,false);

			this.getTipoAutoriConsepsBusquedaPorNombre();

			this.inicializarActualizarBindingTipoAutoriConsep(false);

			//if(TipoAutoriConsepBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingTipoAutoriConsep(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoautoriconsepLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoautoriconsepLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,TipoAutoriConsepConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoautoriconsepLogic.closeNewConnexionToDeep();
			}
		}
	}

	
	public void closingInternalFrameTipoAutoriConsep() {
		if(this.jInternalFrameDetalleFormTipoAutoriConsep!=null) {
		

		if(this.jInternalFrameDetalleFormTipoAutoriConsep.autoriconsepBeanSwingJInternalFrame!=null) {
			this.jInternalFrameDetalleFormTipoAutoriConsep.autoriconsepBeanSwingJInternalFrame.setVisible(false);
			this.jInternalFrameDetalleFormTipoAutoriConsep.autoriconsepBeanSwingJInternalFrame.dispose();
			this.jInternalFrameDetalleFormTipoAutoriConsep.autoriconsepBeanSwingJInternalFrame=null;
		}

		if(this.jInternalFrameDetalleFormTipoAutoriConsep.autoriconsepBeanSwingJInternalFramePopup!=null) {
			this.jInternalFrameDetalleFormTipoAutoriConsep.autoriconsepBeanSwingJInternalFramePopup.setVisible(false);
			this.jInternalFrameDetalleFormTipoAutoriConsep.autoriconsepBeanSwingJInternalFramePopup.dispose();
			this.jInternalFrameDetalleFormTipoAutoriConsep.autoriconsepBeanSwingJInternalFramePopup=null;
		}	
		
		
		}
		
		if(this.jInternalFrameDetalleFormTipoAutoriConsep!=null) {
			this.jInternalFrameDetalleFormTipoAutoriConsep.setVisible(false);	    			
			this.jInternalFrameDetalleFormTipoAutoriConsep.dispose();
			this.jInternalFrameDetalleFormTipoAutoriConsep=null;
		}
		
		
		if(this.jInternalFrameReporteDinamicoTipoAutoriConsep!=null) {
			this.jInternalFrameReporteDinamicoTipoAutoriConsep.setVisible(false);	    			
			this.jInternalFrameReporteDinamicoTipoAutoriConsep.dispose();
			this.jInternalFrameReporteDinamicoTipoAutoriConsep=null;
		}
		
		if(this.jInternalFrameImportacionTipoAutoriConsep!=null) {
			this.jInternalFrameImportacionTipoAutoriConsep.setVisible(false);	    			
			this.jInternalFrameImportacionTipoAutoriConsep.dispose();
			this.jInternalFrameImportacionTipoAutoriConsep=null;
		}		
		
		
		this.setVisible(false);
		this.dispose();
		//this=null;
	}
	
	
	
	public void jButtonActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {			
			this.startProcessTipoAutoriConsep();
			
			TipoAutoriConsepBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipoautoriconsep,new Object(),this.tipoautoriconsepParameterGeneral,this.tipoautoriconsepReturnGeneral);
			
			
			if(sTipo.equals("NuevoTipoAutoriConsep")) {
				jButtonNuevoTipoAutoriConsepActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarTipoAutoriConsep")) {
				jButtonDuplicarTipoAutoriConsepActionPerformed(evt,false);
			} else if(sTipo.equals("CopiarTipoAutoriConsep")) {
				jButtonCopiarTipoAutoriConsepActionPerformed(evt);
			} else if(sTipo.equals("VerFormTipoAutoriConsep")) {
				jButtonVerFormTipoAutoriConsepActionPerformed(evt);
			} else if(sTipo.equals("NuevoToolBarTipoAutoriConsep")) {
				jButtonNuevoTipoAutoriConsepActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarToolBarTipoAutoriConsep")) {
				jButtonDuplicarTipoAutoriConsepActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemNuevoTipoAutoriConsep")) {
				jButtonNuevoTipoAutoriConsepActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemDuplicarTipoAutoriConsep")) {
				jButtonDuplicarTipoAutoriConsepActionPerformed(evt,false);
			} else if(sTipo.equals("NuevoRelacionesTipoAutoriConsep")) {
				jButtonNuevoTipoAutoriConsepActionPerformed(evt,true);
			} else if(sTipo.equals("NuevoRelacionesToolBarTipoAutoriConsep")) {
				jButtonNuevoTipoAutoriConsepActionPerformed(evt,true);
			} else if(sTipo.equals("MenuItemNuevoRelacionesTipoAutoriConsep")) {
				jButtonNuevoTipoAutoriConsepActionPerformed(evt,true);
			} else if(sTipo.equals("ModificarTipoAutoriConsep")) {
				jButtonModificarTipoAutoriConsepActionPerformed(evt);
			} else if(sTipo.equals("ModificarToolBarTipoAutoriConsep")) {
				jButtonModificarTipoAutoriConsepActionPerformed(evt);
			} else if(sTipo.equals("MenuItemModificarTipoAutoriConsep")) {
				jButtonModificarTipoAutoriConsepActionPerformed(evt);
			} else if(sTipo.equals("ActualizarTipoAutoriConsep")) {
				jButtonActualizarTipoAutoriConsepActionPerformed(evt);
			} else if(sTipo.equals("ActualizarToolBarTipoAutoriConsep")) {
				jButtonActualizarTipoAutoriConsepActionPerformed(evt);
			} else if(sTipo.equals("MenuItemActualizarTipoAutoriConsep")) {
				jButtonActualizarTipoAutoriConsepActionPerformed(evt);
			} else if(sTipo.equals("EliminarTipoAutoriConsep")) {
				jButtonEliminarTipoAutoriConsepActionPerformed(evt);
			} else if(sTipo.equals("EliminarToolBarTipoAutoriConsep")) {
				jButtonEliminarTipoAutoriConsepActionPerformed(evt);
			} else if(sTipo.equals("MenuItemEliminarTipoAutoriConsep")) {
				jButtonEliminarTipoAutoriConsepActionPerformed(evt);
			} else if(sTipo.equals("CancelarTipoAutoriConsep")) {
				jButtonCancelarTipoAutoriConsepActionPerformed(evt);
			} else if(sTipo.equals("CancelarToolBarTipoAutoriConsep")) {
				jButtonCancelarTipoAutoriConsepActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCancelarTipoAutoriConsep")) {
				jButtonCancelarTipoAutoriConsepActionPerformed(evt);
			} else if(sTipo.equals("CerrarTipoAutoriConsep")) {
				jButtonCerrarTipoAutoriConsepActionPerformed(evt);
			} else if(sTipo.equals("CerrarToolBarTipoAutoriConsep")) {
				jButtonCerrarTipoAutoriConsepActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCerrarTipoAutoriConsep")) {
				jButtonCerrarTipoAutoriConsepActionPerformed(evt);
			} else if(sTipo.equals("MostrarOcultarToolBarTipoAutoriConsep")) {
				jButtonMostrarOcultarTipoAutoriConsepActionPerformed(evt);
			} else if(sTipo.equals("MenuItemDetalleCerrarTipoAutoriConsep")) {
				jButtonCancelarTipoAutoriConsepActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTipoAutoriConsep")) {
				jButtonGuardarCambiosTipoAutoriConsepActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosToolBarTipoAutoriConsep")) {
				jButtonGuardarCambiosTipoAutoriConsepActionPerformed(evt);
			} else if(sTipo.equals("CopiarToolBarTipoAutoriConsep")) {
				jButtonCopiarTipoAutoriConsepActionPerformed(evt);
			} else if(sTipo.equals("VerFormToolBarTipoAutoriConsep")) {
				jButtonVerFormTipoAutoriConsepActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosTipoAutoriConsep")) {
				jButtonGuardarCambiosTipoAutoriConsepActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCopiarTipoAutoriConsep")) {
				jButtonCopiarTipoAutoriConsepActionPerformed(evt);
			} else if(sTipo.equals("MenuItemVerFormTipoAutoriConsep")) {
				jButtonVerFormTipoAutoriConsepActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaTipoAutoriConsep")) {
				jButtonGuardarCambiosTipoAutoriConsepActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaToolBarTipoAutoriConsep")) {
				jButtonGuardarCambiosTipoAutoriConsepActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosTablaTipoAutoriConsep")) {
				jButtonGuardarCambiosTipoAutoriConsepActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionTipoAutoriConsep")) {
				jButtonRecargarInformacionTipoAutoriConsepActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionToolBarTipoAutoriConsep")) {
				jButtonRecargarInformacionTipoAutoriConsepActionPerformed(evt);
			} else if(sTipo.equals("MenuItemRecargarInformacionTipoAutoriConsep")) {
				jButtonRecargarInformacionTipoAutoriConsepActionPerformed(evt);
			}
			else if(sTipo.equals("AnterioresTipoAutoriConsep")) {
				jButtonAnterioresTipoAutoriConsepActionPerformed(evt);
			} else if(sTipo.equals("AnterioresToolBarTipoAutoriConsep")) {
				jButtonAnterioresTipoAutoriConsepActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAnterioreTipoAutoriConsep")) {
				jButtonAnterioresTipoAutoriConsepActionPerformed(evt);
			} else if(sTipo.equals("SiguientesTipoAutoriConsep")) {
				jButtonSiguientesTipoAutoriConsepActionPerformed(evt);
			} else if(sTipo.equals("SiguientesToolBarTipoAutoriConsep")) {
				jButtonSiguientesTipoAutoriConsepActionPerformed(evt);
			} else if(sTipo.equals("MenuItemSiguientesTipoAutoriConsep")) {
				jButtonSiguientesTipoAutoriConsepActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAbrirOrderByTipoAutoriConsep") || sTipo.equals("MenuItemDetalleAbrirOrderByTipoAutoriConsep")) {
				jButtonAbrirOrderByTipoAutoriConsepActionPerformed(evt);
			} else if(sTipo.equals("MenuItemMostrarOcultarTipoAutoriConsep") || sTipo.equals("MenuItemDetalleMostrarOcultarTipoAutoriConsep")) {
				jButtonMostrarOcultarTipoAutoriConsepActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosTipoAutoriConsep")) {
				jButtonNuevoGuardarCambiosTipoAutoriConsepActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosToolBarTipoAutoriConsep")) {
				jButtonNuevoGuardarCambiosTipoAutoriConsepActionPerformed(evt);
			} else if(sTipo.equals("MenuItemNuevoGuardarCambiosTipoAutoriConsep")) {
				jButtonNuevoGuardarCambiosTipoAutoriConsepActionPerformed(evt);
			} 
			else if(sTipo.equals("CerrarReporteDinamicoTipoAutoriConsep")) {
				jButtonCerrarReporteDinamicoTipoAutoriConsepActionPerformed(evt);
			} else if(sTipo.equals("GenerarReporteDinamicoTipoAutoriConsep")) {
				jButtonGenerarReporteDinamicoTipoAutoriConsepActionPerformed(evt);
			} else if(sTipo.equals("GenerarExcelReporteDinamicoTipoAutoriConsep")) {
				
				jButtonGenerarExcelReporteDinamicoTipoAutoriConsepActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarImportacionTipoAutoriConsep")) {
				jButtonCerrarImportacionTipoAutoriConsepActionPerformed(evt);
			} else if(sTipo.equals("GenerarImportacionTipoAutoriConsep")) {
				
				jButtonGenerarImportacionTipoAutoriConsepActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirImportacionTipoAutoriConsep")) {
				
				jButtonAbrirImportacionTipoAutoriConsepActionPerformed(evt);
				
			} else if(sTipo.equals("TiposAccionesTipoAutoriConsep")) {
				jComboBoxTiposAccionesTipoAutoriConsepActionListener(evt,false);
			} else if(sTipo.equals("TiposRelacionesTipoAutoriConsep")) {
				jComboBoxTiposRelacionesTipoAutoriConsepActionListener(evt);
			} else if(sTipo.equals("TiposAccionesFormularioTipoAutoriConsep")) {
				jComboBoxTiposAccionesTipoAutoriConsepActionListener(evt,true);
			} else if(sTipo.equals("TiposSeleccionarTipoAutoriConsep")) {
				
				jComboBoxTiposSeleccionarTipoAutoriConsepActionListener(evt);
				
			} else if(sTipo.equals("ValorCampoGeneralTipoAutoriConsep")) {
				jTextFieldValorCampoGeneralTipoAutoriConsepActionListener(evt);
			}
			
			
			else if(sTipo.equals("AbrirOrderByTipoAutoriConsep")) {
				jButtonAbrirOrderByTipoAutoriConsepActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirOrderByToolBarTipoAutoriConsep")) {
				jButtonAbrirOrderByTipoAutoriConsepActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarOrderByTipoAutoriConsep")) {
				jButtonCerrarOrderByTipoAutoriConsepActionPerformed(evt);
			} 
						
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idTipoAutoriConsepBusqueda")) {
				this.jButtonidTipoAutoriConsepBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("codigoTipoAutoriConsepBusqueda")) {
				this.jButtoncodigoTipoAutoriConsepBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombreTipoAutoriConsepBusqueda")) {
				this.jButtonnombreTipoAutoriConsepBusquedaActionPerformed(evt);
			}
			
			
			
			
			else if(sTipo.equals("BusquedaPorCodigoTipoAutoriConsep")) {
				this.jButtonBusquedaPorCodigoTipoAutoriConsepActionPerformed(evt);
			}
			else if(sTipo.equals("BusquedaPorNombreTipoAutoriConsep")) {
				this.jButtonBusquedaPorNombreTipoAutoriConsepActionPerformed(evt);
			}
			
			;
			
			
			TipoAutoriConsepBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipoautoriconsep,new Object(),this.tipoautoriconsepParameterGeneral,this.tipoautoriconsepReturnGeneral);
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoAutoriConsepConstantesFunciones.CLASSNAME);
			
  		} finally {
      		this.finishProcessTipoAutoriConsep();
      	}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoAutoriConsepActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipoautoriconsep);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipoautoriconsep);
				
				TipoAutoriConsepBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoautoriconsep,new Object(),this.tipoautoriconsepParameterGeneral,this.tipoautoriconsepReturnGeneral);
				
				


				
				TipoAutoriConsepBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoautoriconsep,new Object(),this.tipoautoriconsepParameterGeneral,this.tipoautoriconsepReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoAutoriConsep.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoAutoriConsep.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
				}
				
			} catch(Exception e) {
  				FuncionesSwing.manageException2(this, e,logger,TipoAutoriConsepConstantesFunciones.CLASSNAME);
  			}
    }
	
	public Boolean existeCambioValor(ControlTipo controlTipo,String sTipo) throws Exception {
		Boolean existeCambio=true;
		
		try {
			TipoAutoriConsep tipoautoriconsepLocal=null;
			
			if(!this.getEsControlTabla()) {
				tipoautoriconsepLocal=this.tipoautoriconsep;
			} else {
				tipoautoriconsepLocal=this.tipoautoriconsepAnterior;
			}
			
			if(controlTipo.equals(ControlTipo.TEXTBOX)) {
				


			}
		
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoAutoriConsepConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipoautoriconsep);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipoautoriconsep);
				
				TipoAutoriConsepBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoautoriconsep,new Object(),this.tipoautoriconsepParameterGeneral,this.tipoautoriconsepReturnGeneral);
							
				
				


				
				TipoAutoriConsepBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoautoriconsep,new Object(),this.tipoautoriconsepParameterGeneral,this.tipoautoriconsepReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoAutoriConsep.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoAutoriConsep.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoAutoriConsepConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoAutoriConsepActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosTipoAutoriConsep.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoautoriconsepAnterior =(TipoAutoriConsep) this.tipoautoriconsepLogic.getTipoAutoriConseps().toArray()[this.jTableDatosTipoAutoriConsep.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipoautoriconsepAnterior =(TipoAutoriConsep) this.tipoautoriconseps.toArray()[this.jTableDatosTipoAutoriConsep.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoAutoriConsepConstantesFunciones.CLASSNAME);
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
			
			TipoAutoriConsepBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoautoriconsep,new Object(),this.tipoautoriconsepParameterGeneral,this.tipoautoriconsepReturnGeneral);
			
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
			
			


			
			TipoAutoriConsepBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoautoriconsep,new Object(),this.tipoautoriconsepParameterGeneral,this.tipoautoriconsepReturnGeneral);
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoAutoriConsepConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE QUITA ALGUN CARACTER
	public void jTextFieldRemoveUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoAutoriConsepConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE INGRESA ALGUN CARACTER
	public void jTextFieldInsertUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoAutoriConsepConstantesFunciones.CLASSNAME);
  		}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jFormattedTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoAutoriConsepActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipoautoriconsep);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipoautoriconsep);
				
				TipoAutoriConsepBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoautoriconsep,new Object(),this.tipoautoriconsepParameterGeneral,this.tipoautoriconsepReturnGeneral);
								
						
				


				
				TipoAutoriConsepBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoautoriconsep,new Object(),this.tipoautoriconsepParameterGeneral,this.tipoautoriconsepReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoAutoriConsep.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoAutoriConsep.class.getName(),sTipo,"DATE",esControlTabla,conIrServidorAplicacionParent,
							id,JFormattedTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoAutoriConsepConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipoautoriconsep);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipoautoriconsep);
				
				TipoAutoriConsepBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoautoriconsep,new Object(),this.tipoautoriconsepParameterGeneral,this.tipoautoriconsepReturnGeneral);
								
				
				


				
				TipoAutoriConsepBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoautoriconsep,new Object(),this.tipoautoriconsepParameterGeneral,this.tipoautoriconsepReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoAutoriConsep.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoAutoriConsep.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoAutoriConsepConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jFormattedTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoAutoriConsepActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosTipoAutoriConsep.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoautoriconsepAnterior =(TipoAutoriConsep) this.tipoautoriconsepLogic.getTipoAutoriConseps().toArray()[this.jTableDatosTipoAutoriConsep.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipoautoriconsepAnterior =(TipoAutoriConsep) this.tipoautoriconseps.toArray()[this.jTableDatosTipoAutoriConsep.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoAutoriConsepConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusLostGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl() && this.existeCambioValor(ControlTipo.DATE,sTipo)) {
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipoautoriconsep);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipoautoriconsep);
			}	
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoAutoriConsepConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoAutoriConsepActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosTipoAutoriConsep.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoautoriconsepAnterior =(TipoAutoriConsep) this.tipoautoriconsepLogic.getTipoAutoriConseps().toArray()[this.jTableDatosTipoAutoriConsep.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipoautoriconsepAnterior =(TipoAutoriConsep) this.tipoautoriconseps.toArray()[this.jTableDatosTipoAutoriConsep.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoAutoriConsepConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoAutoriConsepActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.tipoautoriconsep);
			
			this.actualizarInformacion("INFO_PADRE",false,this.tipoautoriconsep);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoAutoriConsepConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipoautoriconsep);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipoautoriconsep);
				
				TipoAutoriConsepBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoautoriconsep,new Object(),this.tipoautoriconsepParameterGeneral,this.tipoautoriconsepReturnGeneral);
							
				
				


				
				TipoAutoriConsepBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoautoriconsep,new Object(),this.tipoautoriconsepParameterGeneral,this.tipoautoriconsepReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoAutoriConsep.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoAutoriConsep.class.getName(),sTipo,"TEXTAREA",esControlTabla,conIrServidorAplicacionParent,
							id,jTextArea, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoAutoriConsepConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoAutoriConsepActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosTipoAutoriConsep.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tipoautoriconsepAnterior =(TipoAutoriConsep) this.tipoautoriconsepLogic.getTipoAutoriConseps().toArray()[this.jTableDatosTipoAutoriConsep.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.tipoautoriconsepAnterior =(TipoAutoriConsep) this.tipoautoriconseps.toArray()[this.jTableDatosTipoAutoriConsep.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoAutoriConsepConstantesFunciones.CLASSNAME);
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
			
			TipoAutoriConsepBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoautoriconsep,new Object(),this.tipoautoriconsepParameterGeneral,this.tipoautoriconsepReturnGeneral);
			
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
			
			


			
			TipoAutoriConsepBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoautoriconsep,new Object(),this.tipoautoriconsepParameterGeneral,this.tipoautoriconsepReturnGeneral);
			
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoAutoriConsepConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaRemoveUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoAutoriConsepConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaInsertUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoAutoriConsepConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jTextAreaActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoAutoriConsepActual();
			
			this.actualizarInformacion("EVENTO_CONTROL",false,this.tipoautoriconsep);
			
			this.actualizarInformacion("INFO_PADRE",false,this.tipoautoriconsep);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoAutoriConsepConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipoautoriconsep);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipoautoriconsep);
				
				TipoAutoriConsepBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoautoriconsep,new Object(),this.tipoautoriconsepParameterGeneral,this.tipoautoriconsepReturnGeneral);
								
				
				


				
				TipoAutoriConsepBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoautoriconsep,new Object(),this.tipoautoriconsepParameterGeneral,this.tipoautoriconsepReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoAutoriConsep.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoAutoriConsep.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jLabel, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoAutoriConsepConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jLabelFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoAutoriConsepActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosTipoAutoriConsep.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoautoriconsepAnterior =(TipoAutoriConsep) this.tipoautoriconsepLogic.getTipoAutoriConseps().toArray()[this.jTableDatosTipoAutoriConsep.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipoautoriconsepAnterior =(TipoAutoriConsep) this.tipoautoriconseps.toArray()[this.jTableDatosTipoAutoriConsep.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoAutoriConsepConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jLabelActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoAutoriConsepActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.tipoautoriconsep);
			
			this.actualizarInformacion("INFO_PADRE",false,this.tipoautoriconsep);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoAutoriConsepConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxItemListenerGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoAutoriConsepActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipoautoriconsep);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipoautoriconsep);
				
				TipoAutoriConsepBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipoautoriconsep,new Object(),this.tipoautoriconsepParameterGeneral,this.tipoautoriconsepReturnGeneral);
												
				
				if(sTipo.equals("SeleccionarTodosTipoAutoriConsep")) {
					jCheckBoxSeleccionarTodosTipoAutoriConsepItemListener(evt);
				
				} else if(sTipo.equals("SeleccionadosTipoAutoriConsep")) {
					jCheckBoxSeleccionadosTipoAutoriConsepItemListener(evt);
				
				} else if(sTipo.equals("NuevoToolBarTipoAutoriConsep")) {
					
				}
				
				


				
				
				TipoAutoriConsepBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipoautoriconsep,new Object(),this.tipoautoriconsepParameterGeneral,this.tipoautoriconsepReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoAutoriConsep.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoAutoriConsep.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoAutoriConsepConstantesFunciones.CLASSNAME);
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
				
				//this.actualizarInformacion("EVENTO_CONTROL",false,this.tipoautoriconsep);
				
				//this.actualizarInformacion("INFO_PADRE",false,this.tipoautoriconsep);
				
				TipoAutoriConsepBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipoautoriconsep,new Object(),this.tipoautoriconsepParameterGeneral,this.tipoautoriconsepReturnGeneral);
												
				
				


				
				
				TipoAutoriConsepBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipoautoriconsep,new Object(),this.tipoautoriconsepParameterGeneral,this.tipoautoriconsepReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoAutoriConsep.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoAutoriConsep.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoAutoriConsepConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoAutoriConsepActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosTipoAutoriConsep.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tipoautoriconsepAnterior =(TipoAutoriConsep) this.tipoautoriconsepLogic.getTipoAutoriConseps().toArray()[this.jTableDatosTipoAutoriConsep.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.tipoautoriconsepAnterior =(TipoAutoriConsep) this.tipoautoriconseps.toArray()[this.jTableDatosTipoAutoriConsep.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoAutoriConsepConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoAutoriConsepActual();
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipoautoriconsep);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipoautoriconsep);
				
				TipoAutoriConsepBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipoautoriconsep,new Object(),this.tipoautoriconsepParameterGeneral,this.tipoautoriconsepReturnGeneral);
				
				
				TipoAutoriConsepBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipoautoriconsep,new Object(),this.tipoautoriconsepParameterGeneral,this.tipoautoriconsepReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoAutoriConsepConstantesFunciones.CLASSNAME);
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
			
			TipoAutoriConsepBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.tipoautoriconsep,new Object(),this.tipoautoriconsepParameterGeneral,this.tipoautoriconsepReturnGeneral);
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
			
			


			
			TipoAutoriConsepBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoautoriconsep,new Object(),this.tipoautoriconsepParameterGeneral,this.tipoautoriconsepReturnGeneral);
			*/						
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoAutoriConsepConstantesFunciones.CLASSNAME);
  		}		
    }
	
	@SuppressWarnings("rawtypes")
	public void jComboBoxItemStateChangedGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if (evt.getStateChange() == ItemEvent.SELECTED && this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoAutoriConsepActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipoautoriconsep);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipoautoriconsep);
				
				TipoAutoriConsepBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.tipoautoriconsep,new Object(),this.tipoautoriconsepParameterGeneral,this.tipoautoriconsepReturnGeneral);
				
				
				String sFinalQueryCombo="";
				
				


				
				TipoAutoriConsepBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoautoriconsep,new Object(),this.tipoautoriconsepParameterGeneral,this.tipoautoriconsepReturnGeneral);
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoAutoriConsep.class.getName());
								
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoAutoriConsep.class.getName(),sTipo,"COMBOBOX",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoAutoriConsepConstantesFunciones.CLASSNAME);
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
			
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipoautoriconsep);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipoautoriconsep);
				
				TipoAutoriConsepBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.tipoautoriconsep,new Object(),this.tipoautoriconsepParameterGeneral,this.tipoautoriconsepReturnGeneral);
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
				
				


				
				TipoAutoriConsepBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoautoriconsep,new Object(),this.tipoautoriconsepParameterGeneral,this.tipoautoriconsepReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoAutoriConsep.class.getName());
				
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoAutoriConsep.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoAutoriConsepConstantesFunciones.CLASSNAME);
  		}
		
		*/
    }
	
	public void jComboBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoAutoriConsepActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosTipoAutoriConsep.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoautoriconsepAnterior =(TipoAutoriConsep) this.tipoautoriconsepLogic.getTipoAutoriConseps().toArray()[this.jTableDatosTipoAutoriConsep.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipoautoriconsepAnterior =(TipoAutoriConsep) this.tipoautoriconseps.toArray()[this.jTableDatosTipoAutoriConsep.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoAutoriConsepConstantesFunciones.CLASSNAME);
  		}
    }		
	
	public void tableValueChangedGeneral(String sTipo,ListSelectionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				TipoAutoriConsepBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoautoriconsep,new Object(),this.tipoautoriconsepParameterGeneral,this.tipoautoriconsepReturnGeneral);
				
				if(sTipo.equals("TableDatosSeleccionarTipoAutoriConsep")) {
					//BYDAN_DESHABILITADO
					//try {jTableDatosTipoAutoriConsepListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
					
					//SOLO CUANDO MOUSE ES SOLTADO
					if (!evt.getValueIsAdjusting()) {
						//SELECCIONA FILA A OBJETO ACTUAL
						Integer intSelectedRow = this.jTableDatosTipoAutoriConsep.getSelectedRow();
						
						if(intSelectedRow!=null && intSelectedRow>-1) {
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								this.tipoautoriconsep =(TipoAutoriConsep) this.tipoautoriconsepLogic.getTipoAutoriConseps().toArray()[this.jTableDatosTipoAutoriConsep.convertRowIndexToModel(intSelectedRow)];
							} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
								this.tipoautoriconsep =(TipoAutoriConsep) this.tipoautoriconseps.toArray()[this.jTableDatosTipoAutoriConsep.convertRowIndexToModel(intSelectedRow)];
							}
							//ARCHITECTURE
							
							//System.out.println(this.tipoautoriconsep);
						}
					}
					
				} else if(sTipo.equals("jButtonCancelarTipoAutoriConsep")) {
				
				}
				
				TipoAutoriConsepBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoautoriconsep,new Object(),this.tipoautoriconsepParameterGeneral,this.tipoautoriconsepReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoAutoriConsepConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void tableMouseAdapterGeneral(String sTipo,MouseEvent evt) { 	  
		try {
			TipoAutoriConsepBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.tipoautoriconsep,new Object(),this.tipoautoriconsepParameterGeneral,this.tipoautoriconsepReturnGeneral);
			
			if(sTipo.equals("DatosSeleccionarTipoAutoriConsep")) {
				if (evt.getClickCount() == 2) {
					jButtonIdActionPerformed(null,jTableDatosTipoAutoriConsep.getSelectedRow(),false,false);
				}	
			} else if(sTipo.equals("jButtonCancelarTipoAutoriConsep")) {
			
			}
			
			TipoAutoriConsepBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.tipoautoriconsep,new Object(),this.tipoautoriconsepParameterGeneral,this.tipoautoriconsepReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoAutoriConsepConstantesFunciones.CLASSNAME);
  		}
    }
	
	;
	
	public void jButtonActionPerformedTecladoGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			this.startProcessTipoAutoriConsep();
			
			TipoAutoriConsepBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipoautoriconsep,new Object(),this.tipoautoriconsepParameterGeneral,this.tipoautoriconsepReturnGeneral);
			
			if(sTipo.equals("NuevoTipoAutoriConsep")) {
				jButtonNuevoTipoAutoriConsepActionPerformed(evt,false);
				
			} else if(sTipo.equals("DuplicarTipoAutoriConsep")) {
				jButtonDuplicarTipoAutoriConsepActionPerformed(evt,false);
				
			} else if(sTipo.equals("CopiarTipoAutoriConsep")) {
				jButtonCopiarTipoAutoriConsepActionPerformed(evt);
				
			} else if(sTipo.equals("VerFormTipoAutoriConsep")) {
				jButtonVerFormTipoAutoriConsepActionPerformed(evt);
				
			} else if(sTipo.equals("NuevoRelacionesTipoAutoriConsep")) {
				jButtonNuevoTipoAutoriConsepActionPerformed(evt,true);
				
			} else if(sTipo.equals("ModificarTipoAutoriConsep")) {
				jButtonModificarTipoAutoriConsepActionPerformed(evt);
				
			} else if(sTipo.equals("ActualizarTipoAutoriConsep")) {
				jButtonActualizarTipoAutoriConsepActionPerformed(evt);
				
			} else if(sTipo.equals("EliminarTipoAutoriConsep")) {
				jButtonEliminarTipoAutoriConsepActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosTablaTipoAutoriConsep")) {
				jButtonGuardarCambiosTipoAutoriConsepActionPerformed(evt);
				
			} else if(sTipo.equals("CancelarTipoAutoriConsep")) {
				jButtonCancelarTipoAutoriConsepActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarTipoAutoriConsep")) {
				jButtonCerrarTipoAutoriConsepActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosTipoAutoriConsep")) {
				jButtonGuardarCambiosTipoAutoriConsepActionPerformed(evt);
			
			} else if(sTipo.equals("NuevoGuardarCambiosTipoAutoriConsep")) {
				jButtonNuevoGuardarCambiosTipoAutoriConsepActionPerformed(evt);
			
			} else if(sTipo.equals("AbrirOrderByTipoAutoriConsep")) {
				jButtonAbrirOrderByTipoAutoriConsepActionPerformed(evt);
			
			} else if(sTipo.equals("RecargarInformacionTipoAutoriConsep")) {
				jButtonRecargarInformacionTipoAutoriConsepActionPerformed(evt);
			
			} else if(sTipo.equals("AnterioresTipoAutoriConsep")) {
				jButtonAnterioresTipoAutoriConsepActionPerformed(evt);			
			
			}  else if(sTipo.equals("SiguientesTipoAutoriConsep")) {
				jButtonSiguientesTipoAutoriConsepActionPerformed(evt);			
			} 
			
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idTipoAutoriConsepBusqueda")) {
				this.jButtonidTipoAutoriConsepBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("codigoTipoAutoriConsepBusqueda")) {
				this.jButtoncodigoTipoAutoriConsepBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombreTipoAutoriConsepBusqueda")) {
				this.jButtonnombreTipoAutoriConsepBusquedaActionPerformed(evt);
			}
			
			TipoAutoriConsepBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipoautoriconsep,new Object(),this.tipoautoriconsepParameterGeneral,this.tipoautoriconsepReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoAutoriConsepConstantesFunciones.CLASSNAME);
			
  		}  finally {
      		this.finishProcessTipoAutoriConsep();
      	}
    }
	
	public void internalFrameClosingInternalFrameGeneral(String sTipo,InternalFrameEvent evt) { 	  
		try {
			TipoAutoriConsepBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.tipoautoriconsep,new Object(),this.tipoautoriconsepParameterGeneral,this.tipoautoriconsepReturnGeneral);
			
			if(sTipo.equals("CloseInternalFrameTipoAutoriConsep")) {
				closingInternalFrameTipoAutoriConsep();
				
			} else if(sTipo.equals("jButtonCancelarTipoAutoriConsep")) {
				JInternalFrameBase jInternalFrameDetalleFormTipoAutoriConsep = (JInternalFrameBase)evt.getSource();
	            	
	            TipoAutoriConsepBeanSwingJInternalFrame jInternalFrameParent=(TipoAutoriConsepBeanSwingJInternalFrame)jInternalFrameDetalleFormTipoAutoriConsep.getjInternalFrameParent();
	            
				jInternalFrameParent.jButtonCancelarTipoAutoriConsepActionPerformed(null);
			}
			
			TipoAutoriConsepBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.tipoautoriconsep,new Object(),this.tipoautoriconsepParameterGeneral,this.tipoautoriconsepReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoAutoriConsepConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void recargarFormTipoAutoriConsep(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion) throws Exception {
		this.recargarFormTipoAutoriConsep(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,false);
	}
	
	public void recargarFormTipoAutoriConsep(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion,Boolean esControlTabla) throws Exception {
		if(this.permiteRecargarForm && this.permiteMantenimiento(this.tipoautoriconsep)) {
			if(!esControlTabla) {
				if(TipoAutoriConsepJInternalFrame.ISBINDING_MANUAL_TABLA) {			
					this.setVariablesFormularioToObjetoActualTipoAutoriConsep(this.tipoautoriconsep,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoAutoriConsep(this.tipoautoriconsep);			
				}
				
				if(this.tipoautoriconsepSessionBean.getEstaModoGuardarRelaciones()) {
					this.setVariablesFormularioRelacionesToObjetoActualTipoAutoriConsep(this.tipoautoriconsep,classes);				
				}
			
				if(conIrServidorAplicacion) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {						
						this.tipoautoriconsepReturnGeneral=tipoautoriconsepLogic.procesarEventosTipoAutoriConsepsWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.tipoautoriconsepLogic.getTipoAutoriConseps(),this.tipoautoriconsep,this.tipoautoriconsepParameterGeneral,this.isEsNuevoTipoAutoriConsep,classes);//this.tipoautoriconsepLogic.getTipoAutoriConsep()//sTipoGeneral
									
					} else if(Constantes.ISUSAEJBREMOTE) {
									
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE
					
					//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					//this.setVariablesObjetoReturnGeneralToBeanTipoAutoriConsep(this.tipoautoriconsepReturnGeneral,this.tipoautoriconsepBean,false);
						
					//ACTUALIZA VARIABLES RELACIONES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					if(this.tipoautoriconsepSessionBean.getEstaModoGuardarRelaciones()) {
						//this.setVariablesRelacionesObjetoReturnGeneralToBeanTipoAutoriConsep(classes,this.tipoautoriconsepReturnGeneral,this.tipoautoriconsepBean,false);
					}
						
					if(this.tipoautoriconsepReturnGeneral.getConRecargarPropiedades()) {
						//INICIALIZA VARIABLES COMBOS NORMALES (FK)
						this.setVariablesObjetoActualToFormularioForeignKeyTipoAutoriConsep(this.tipoautoriconsepReturnGeneral.getTipoAutoriConsep());
							
						//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
						this.setVariablesObjetoActualToFormularioTipoAutoriConsep(this.tipoautoriconsepReturnGeneral.getTipoAutoriConsep());	
					}
						
					if(this.tipoautoriconsepReturnGeneral.getConRecargarRelaciones()) {
						//INICIALIZA VARIABLES RELACIONES A FORMULARIO
						this.setVariablesRelacionesObjetoActualToFormularioTipoAutoriConsep(this.tipoautoriconsepReturnGeneral.getTipoAutoriConsep(),classes);//this.tipoautoriconsepBean);	
					}									
					
				} else {				
					//INICIALIZA VARIABLES RELACIONES A FORMULARIO
					this.setVariablesRelacionesObjetoActualToFormularioTipoAutoriConsep(this.tipoautoriconsep,classes);//this.tipoautoriconsepBean);									
				}
			
				if(TipoAutoriConsepJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesFormularioToObjetoActualTipoAutoriConsep(this.tipoautoriconsep,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoAutoriConsep(this.tipoautoriconsep);				
				}
				
			} else {
				
				if(((controlTipo.equals(ControlTipo.TEXTBOX) || controlTipo.equals(ControlTipo.DATE)
					|| controlTipo.equals(ControlTipo.TEXTAREA) || controlTipo.equals(ControlTipo.COMBOBOX)
					)				
					&& eventoTipo.equals(EventoTipo.CHANGE)
					)
					
					|| (controlTipo.equals(ControlTipo.CHECKBOX) && eventoTipo.equals(EventoTipo.CLIC))
					
				) { // && sTipoGeneral.equals("TEXTBOX")
					
					if(this.tipoautoriconsepAnterior!=null) {
						this.tipoautoriconsep=this.tipoautoriconsepAnterior;
					}
				}
				
				if(conIrServidorAplicacion) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {						
						this.tipoautoriconsepReturnGeneral=tipoautoriconsepLogic.procesarEventosTipoAutoriConsepsWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.tipoautoriconsepLogic.getTipoAutoriConseps(),this.tipoautoriconsep,this.tipoautoriconsepParameterGeneral,this.isEsNuevoTipoAutoriConsep,classes);//this.tipoautoriconsepLogic.getTipoAutoriConsep()//sTipoGeneral
									
					} else if(Constantes.ISUSAEJBREMOTE) {
									
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.tipoautoriconsepSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.tipoautoriconsepSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(this.tipoautoriconsepReturnGeneral.getTipoAutoriConsep(),tipoautoriconsepLogic.getTipoAutoriConseps());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(this.tipoautoriconsepReturnGeneral.getTipoAutoriConsep(),this.tipoautoriconseps);
				}
				//ARCHITECTURE
				
				//this.jTableDatosTipoAutoriConsep.repaint();
				
				//((AbstractTableModel) this.jTableDatosTipoAutoriConsep.getModel()).fireTableDataChanged();
				
				this.actualizarVisualTableDatosTipoAutoriConsep();
			}
		}
	}
	
	public void actualizarVisualTableDatosTipoAutoriConsep() throws Exception {
		
		TipoAutoriConsepModel tipoautoriconsepModel=(TipoAutoriConsepModel)this.jTableDatosTipoAutoriConsep.getModel();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tipoautoriconsepModel.tipoautoriconseps=this.tipoautoriconsepLogic.getTipoAutoriConseps();
		
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
			tipoautoriconsepModel.tipoautoriconseps=this.tipoautoriconseps;
		}
		
		
		((TipoAutoriConsepModel) this.jTableDatosTipoAutoriConsep.getModel()).fireTableDataChanged();
	}
	
	public void actualizarVisualTableDatosEventosVistaTipoAutoriConsep() throws Exception {
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.actualizarLista(this.gettipoautoriconsepAnterior(),this.tipoautoriconsepLogic.getTipoAutoriConseps());
					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			this.actualizarLista(this.gettipoautoriconsepAnterior(),this.tipoautoriconseps);
		}
		//ARCHITECTURE
						
		this.actualizarFilaTotales();
						
		this.actualizarVisualTableDatosTipoAutoriConsep();	
	}
	
	public void setVariablesRelacionesObjetoActualToFormularioTipoAutoriConsep(TipoAutoriConsep tipoautoriconsep,ArrayList<Classe> classes) throws Exception { 
		try {
			
			for(Classe clas:classes) {
				if(clas.clas.equals(AutoriConsep.class)) {
					this.jInternalFrameDetalleFormTipoAutoriConsep.autoriconsepBeanSwingJInternalFrame.autoriconsepLogic.setAutoriConseps(tipoautoriconsep.getAutoriConseps());
					this.jInternalFrameDetalleFormTipoAutoriConsep.autoriconsepBeanSwingJInternalFrame.inicializarActualizarBindingTablaAutoriConsep(false);
					break;
				}
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoAutoriConsepConstantesFunciones.CLASSNAME);
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
										
				TipoAutoriConsepBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.tipoautoriconsep,new Object(),generalEntityParameterGeneral,this.tipoautoriconsepReturnGeneral);
				
				ArrayList<Classe> classes=new ArrayList<Classe>();
				
				for(String sClasse:arrClasses) {
					if(sClasse.equals("TODOS")) {
						conTodasRelaciones=true;
						break;
					}
				}
				
				if(this.tipoautoriconsepSessionBean.getConGuardarRelaciones()) {
					if(conTodasRelaciones) {
						classes=TipoAutoriConsepConstantesFunciones.getClassesRelationshipsOfTipoAutoriConsep(new ArrayList<Classe>(),DeepLoadType.NONE);
					} else {
						classes=TipoAutoriConsepConstantesFunciones.getClassesRelationshipsFromStringsOfTipoAutoriConsep(arrClasses,DeepLoadType.NONE);
					}
				}
	
				this.classesActual=new ArrayList<Classe>();
				this.classesActual.addAll(classes);
	
				this.recargarFormTipoAutoriConsep(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,esControlTabla);
										
				TipoAutoriConsepBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.tipoautoriconsep,new Object(),generalEntityParameterGeneral,this.tipoautoriconsepReturnGeneral);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoAutoriConsepConstantesFunciones.CLASSNAME);
  		}
    }
	
	/*
	public void setVariablesRelacionesObjetoBeanActualToFormularioTipoAutoriConsep(TipoAutoriConsepBean tipoautoriconsepBean) throws Exception { 
		try {
			
			for(Classe clas:classes) {
				if(clas.clas.equals(AutoriConsep.class)) {
					this.jInternalFrameDetalleFormTipoAutoriConsep.autoriconsepBeanSwingJInternalFrame.autoriconsepLogic.setAutoriConseps(tipoautoriconsep.getAutoriConseps());
					this.jInternalFrameDetalleFormTipoAutoriConsep.autoriconsepBeanSwingJInternalFrame.inicializarActualizarBindingTablaAutoriConsep(false);
					break;
				}
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoAutoriConsepConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesRelacionesObjetoReturnGeneralToBeanTipoAutoriConsep(ArrayList<Classe> classes,TipoAutoriConsepReturnGeneral tipoautoriconsepReturnGeneral,TipoAutoriConsepBean tipoautoriconsepBean,Boolean conDefault) throws Exception {
		
			this.tipoautoriconsepBean.setAutoriConseps(tipoautoriconsepReturnGeneral.getTipoAutoriConsep().getAutoriConseps());
	}
	*/
	
	public void setVariablesFormularioRelacionesToObjetoActualTipoAutoriConsep(TipoAutoriConsep tipoautoriconsep,ArrayList<Classe> classes) throws Exception {
		
			for(Classe clas:classes) {
				if(clas.clas.equals(AutoriConsep.class)) {
					tipoautoriconsep.setAutoriConseps(this.jInternalFrameDetalleFormTipoAutoriConsep.autoriconsepBeanSwingJInternalFrame.autoriconsepLogic.getAutoriConseps());
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
		if(!paraTabla && !this.permiteMantenimiento(this.tipoautoriconsep)) {
			System.out.println("ERROR:EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES");
				
			//JOptionPane.showMessageDialog(this,"EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES","EVENTO",JOptionPane.ERROR_MESSAGE);			
		}
		*/
		
		return permite;
	}
	
	public void inicializarFormDetalle() throws Exception {
		
		this.jInternalFrameDetalleFormTipoAutoriConsep = new TipoAutoriConsepDetalleFormJInternalFrame(jDesktopPane,this.tipoautoriconsepSessionBean.getConGuardarRelaciones(),this.tipoautoriconsepSessionBean.getEsGuardarRelacionado(),this.cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		this.jDesktopPane.add(this.jInternalFrameDetalleFormTipoAutoriConsep);
		this.jInternalFrameDetalleFormTipoAutoriConsep.setVisible(false);
		this.jInternalFrameDetalleFormTipoAutoriConsep.setSelected(false);						
		
		this.jInternalFrameDetalleFormTipoAutoriConsep.setJInternalFrameParent(this);
		
		this.jInternalFrameDetalleFormTipoAutoriConsep.tipoautoriconsepLogic=this.tipoautoriconsepLogic;
		
		this.cargarCombosFrameForeignKeyTipoAutoriConsep("Formulario");
		
		this.inicializarActualizarBindingBotonesPermisosManualFormDetalleTipoAutoriConsep();
		this.inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleTipoAutoriConsep();
		
		this.initActionsFormDetalle();		
		
		this.initActionsCombosTodosForeignKeyTipoAutoriConsep("Formulario");
		
		//TALVEZ conSetVariablesGlobales COMO if() 
		this.setVariablesGlobalesCombosForeignKeyTipoAutoriConsep();
		
		this.cargarMenuRelaciones();
		
	}
	
	public void initActionsFormDetalle() {	
		
		this.jInternalFrameDetalleFormTipoAutoriConsep.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarTipoAutoriConsep"));
		
		this.jInternalFrameDetalleFormTipoAutoriConsep.jButtonModificarTipoAutoriConsep.addActionListener(new ButtonActionListener(this,"ModificarTipoAutoriConsep"));

		
		this.jInternalFrameDetalleFormTipoAutoriConsep.jButtonModificarToolBarTipoAutoriConsep.addActionListener(new ButtonActionListener(this,"ModificarToolBarTipoAutoriConsep"));
					
		this.jInternalFrameDetalleFormTipoAutoriConsep.jMenuItemModificarTipoAutoriConsep.addActionListener(new ButtonActionListener(this,"MenuItemModificarTipoAutoriConsep"));		
		
		
		
		this.jInternalFrameDetalleFormTipoAutoriConsep.jButtonActualizarTipoAutoriConsep.addActionListener (new ButtonActionListener(this,"ActualizarTipoAutoriConsep"));
		
		
		this.jInternalFrameDetalleFormTipoAutoriConsep.jButtonActualizarToolBarTipoAutoriConsep.addActionListener(new ButtonActionListener(this,"ActualizarToolBarTipoAutoriConsep"));
						
		this.jInternalFrameDetalleFormTipoAutoriConsep.jMenuItemActualizarTipoAutoriConsep.addActionListener (new ButtonActionListener(this,"MenuItemActualizarTipoAutoriConsep"));		
		
		
		
		this.jInternalFrameDetalleFormTipoAutoriConsep.jButtonEliminarTipoAutoriConsep.addActionListener (new ButtonActionListener(this,"EliminarTipoAutoriConsep"));
		
		
		this.jInternalFrameDetalleFormTipoAutoriConsep.jButtonEliminarToolBarTipoAutoriConsep.addActionListener (new ButtonActionListener(this,"EliminarToolBarTipoAutoriConsep"));
								
		this.jInternalFrameDetalleFormTipoAutoriConsep.jMenuItemEliminarTipoAutoriConsep.addActionListener (new ButtonActionListener(this,"MenuItemEliminarTipoAutoriConsep"));		
		
		
		
		this.jInternalFrameDetalleFormTipoAutoriConsep.jButtonCancelarTipoAutoriConsep.addActionListener (new ButtonActionListener(this,"CancelarTipoAutoriConsep"));
		
		
		this.jInternalFrameDetalleFormTipoAutoriConsep.jButtonCancelarToolBarTipoAutoriConsep.addActionListener (new ButtonActionListener(this,"CancelarToolBarTipoAutoriConsep"));
					
		this.jInternalFrameDetalleFormTipoAutoriConsep.jMenuItemCancelarTipoAutoriConsep.addActionListener (new ButtonActionListener(this,"MenuItemCancelarTipoAutoriConsep"));		
		
		
		
		
		
		this.jInternalFrameDetalleFormTipoAutoriConsep.jMenuItemDetalleCerrarTipoAutoriConsep.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarTipoAutoriConsep"));		
		
		
		
		this.jInternalFrameDetalleFormTipoAutoriConsep.jButtonGuardarCambiosToolBarTipoAutoriConsep.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarTipoAutoriConsep"));
		
		
		
		this.jInternalFrameDetalleFormTipoAutoriConsep.jButtonGuardarCambiosToolBarTipoAutoriConsep.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarTipoAutoriConsep"));
		
		
		
		this.jInternalFrameDetalleFormTipoAutoriConsep.jComboBoxTiposAccionesFormularioTipoAutoriConsep.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioTipoAutoriConsep"));
		
		
				
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoAutoriConsep.jButtonidTipoAutoriConsepBusqueda.addActionListener(new ButtonActionListener(this,"idTipoAutoriConsepBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoAutoriConsep.jButtoncodigoTipoAutoriConsepBusqueda.addActionListener(new ButtonActionListener(this,"codigoTipoAutoriConsepBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoAutoriConsep.jButtonnombreTipoAutoriConsepBusqueda.addActionListener(new ButtonActionListener(this,"nombreTipoAutoriConsepBusqueda"));
		
		
		;

		//TABBED PANE RELACIONES
		this.jInternalFrameDetalleFormTipoAutoriConsep.jTabbedPaneRelacionesTipoAutoriConsep.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesTipoAutoriConsep"));
		
		;		
		//TABBED PANE RELACIONES FIN(EXTRA TAB)	
	}
	
	public void initActions() {				
		this.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"CloseInternalFrameTipoAutoriConsep"));
		
		if(this.jInternalFrameDetalleFormTipoAutoriConsep!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoAutoriConsep.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarTipoAutoriConsep"));
		}
		
		this.jTableDatosTipoAutoriConsep.getSelectionModel().addListSelectionListener(new TableListSelectionListener(this,"TableDatosSeleccionarTipoAutoriConsep"));
		
		this.jTableDatosTipoAutoriConsep.addMouseListener(new TableMouseAdapter(this,"DatosSeleccionarTipoAutoriConsep"));
		
		this.jButtonNuevoTipoAutoriConsep.addActionListener(new ButtonActionListener(this,"NuevoTipoAutoriConsep"));
		
		this.jButtonDuplicarTipoAutoriConsep.addActionListener(new ButtonActionListener(this,"DuplicarTipoAutoriConsep"));
		
		this.jButtonCopiarTipoAutoriConsep.addActionListener(new ButtonActionListener(this,"CopiarTipoAutoriConsep"));
		
		this.jButtonVerFormTipoAutoriConsep.addActionListener(new ButtonActionListener(this,"VerFormTipoAutoriConsep"));
		
		
		this.jButtonNuevoToolBarTipoAutoriConsep.addActionListener(new ButtonActionListener(this,"NuevoToolBarTipoAutoriConsep"));
			
		this.jButtonDuplicarToolBarTipoAutoriConsep.addActionListener(new ButtonActionListener(this,"DuplicarToolBarTipoAutoriConsep"));
			
		this.jMenuItemNuevoTipoAutoriConsep.addActionListener (new ButtonActionListener(this,"MenuItemNuevoTipoAutoriConsep"));
			
		this.jMenuItemDuplicarTipoAutoriConsep.addActionListener (new ButtonActionListener(this,"MenuItemDuplicarTipoAutoriConsep"));		
		
		
		this.jButtonNuevoRelacionesTipoAutoriConsep.addActionListener (new ButtonActionListener(this,"NuevoRelacionesTipoAutoriConsep"));
		
		
		this.jButtonNuevoRelacionesToolBarTipoAutoriConsep.addActionListener(new ButtonActionListener(this,"NuevoRelacionesToolBarTipoAutoriConsep"));
			
		this.jMenuItemNuevoRelacionesTipoAutoriConsep.addActionListener(new ButtonActionListener(this,"MenuItemNuevoRelacionesTipoAutoriConsep"));		
		
		
		if(this.jInternalFrameDetalleFormTipoAutoriConsep!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoAutoriConsep.jButtonModificarTipoAutoriConsep.addActionListener(new ButtonActionListener(this,"ModificarTipoAutoriConsep"));
		}
		
		
		if(this.jInternalFrameDetalleFormTipoAutoriConsep!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoAutoriConsep.jButtonModificarToolBarTipoAutoriConsep.addActionListener(new ButtonActionListener(this,"ModificarToolBarTipoAutoriConsep"));
			
			this.jInternalFrameDetalleFormTipoAutoriConsep.jMenuItemModificarTipoAutoriConsep.addActionListener(new ButtonActionListener(this,"MenuItemModificarTipoAutoriConsep"));		
		}
		
		
		if(this.jInternalFrameDetalleFormTipoAutoriConsep!=null) { //if(this.conCargarFormDetalle) {			
			this.jInternalFrameDetalleFormTipoAutoriConsep.jButtonActualizarTipoAutoriConsep.addActionListener (new ButtonActionListener(this,"ActualizarTipoAutoriConsep"));
		}
		
		
		if(this.jInternalFrameDetalleFormTipoAutoriConsep!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoAutoriConsep.jButtonActualizarToolBarTipoAutoriConsep.addActionListener(new ButtonActionListener(this,"ActualizarToolBarTipoAutoriConsep"));
				
			this.jInternalFrameDetalleFormTipoAutoriConsep.jMenuItemActualizarTipoAutoriConsep.addActionListener (new ButtonActionListener(this,"MenuItemActualizarTipoAutoriConsep"));		
		}
		
		
		if(this.jInternalFrameDetalleFormTipoAutoriConsep!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoAutoriConsep.jButtonEliminarTipoAutoriConsep.addActionListener (new ButtonActionListener(this,"EliminarTipoAutoriConsep"));
		}
		
		
		if(this.jInternalFrameDetalleFormTipoAutoriConsep!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoAutoriConsep.jButtonEliminarToolBarTipoAutoriConsep.addActionListener (new ButtonActionListener(this,"EliminarToolBarTipoAutoriConsep"));
						
			this.jInternalFrameDetalleFormTipoAutoriConsep.jMenuItemEliminarTipoAutoriConsep.addActionListener (new ButtonActionListener(this,"MenuItemEliminarTipoAutoriConsep"));		
		}
		
		
		if(this.jInternalFrameDetalleFormTipoAutoriConsep!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoAutoriConsep.jButtonCancelarTipoAutoriConsep.addActionListener (new ButtonActionListener(this,"CancelarTipoAutoriConsep"));
		}
		
		
		if(this.jInternalFrameDetalleFormTipoAutoriConsep!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoAutoriConsep.jButtonCancelarToolBarTipoAutoriConsep.addActionListener (new ButtonActionListener(this,"CancelarToolBarTipoAutoriConsep"));
			
			this.jInternalFrameDetalleFormTipoAutoriConsep.jMenuItemCancelarTipoAutoriConsep.addActionListener (new ButtonActionListener(this,"MenuItemCancelarTipoAutoriConsep"));		
		}
		
		this.jButtonMostrarOcultarTablaToolBarTipoAutoriConsep.addActionListener (new ButtonActionListener(this,"MostrarOcultarToolBarTipoAutoriConsep"));		
		
		
		this.jButtonCerrarTipoAutoriConsep.addActionListener (new ButtonActionListener(this,"CerrarTipoAutoriConsep"));
		
		
		this.jButtonCerrarToolBarTipoAutoriConsep.addActionListener (new ButtonActionListener(this,"CerrarToolBarTipoAutoriConsep"));
			
		this.jMenuItemCerrarTipoAutoriConsep.addActionListener (new ButtonActionListener(this,"MenuItemCerrarTipoAutoriConsep"));
			
		if(this.jInternalFrameDetalleFormTipoAutoriConsep!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoAutoriConsep.jMenuItemDetalleCerrarTipoAutoriConsep.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarTipoAutoriConsep"));		
		}
		
		
		if(this.jInternalFrameDetalleFormTipoAutoriConsep!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoAutoriConsep.jButtonGuardarCambiosTipoAutoriConsep.addActionListener (new ButtonActionListener(this,"GuardarCambiosTipoAutoriConsep"));
		}
		
		
		if(this.jInternalFrameDetalleFormTipoAutoriConsep!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoAutoriConsep.jButtonGuardarCambiosToolBarTipoAutoriConsep.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarTipoAutoriConsep"));
		}
		
		this.jButtonCopiarToolBarTipoAutoriConsep.addActionListener (new ButtonActionListener(this,"CopiarToolBarTipoAutoriConsep"));
			
		this.jButtonVerFormToolBarTipoAutoriConsep.addActionListener (new ButtonActionListener(this,"VerFormToolBarTipoAutoriConsep"));
		
		this.jMenuItemGuardarCambiosTipoAutoriConsep.addActionListener (new ButtonActionListener(this,"MenuItemGuardarCambiosTipoAutoriConsep"));
			
		this.jMenuItemCopiarTipoAutoriConsep.addActionListener (new ButtonActionListener(this,"MenuItemCopiarTipoAutoriConsep"));		
		
		this.jMenuItemVerFormTipoAutoriConsep.addActionListener (new ButtonActionListener(this,"MenuItemVerFormTipoAutoriConsep"));		
		
		
		this.jButtonGuardarCambiosTablaTipoAutoriConsep.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaTipoAutoriConsep"));
		
		
		this.jButtonGuardarCambiosTablaToolBarTipoAutoriConsep.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaToolBarTipoAutoriConsep"));
			
		this.jMenuItemGuardarCambiosTablaTipoAutoriConsep.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaTipoAutoriConsep"));		
		
		
		
		this.jButtonRecargarInformacionTipoAutoriConsep.addActionListener (new ButtonActionListener(this,"RecargarInformacionTipoAutoriConsep"));
					
		this.jButtonRecargarInformacionToolBarTipoAutoriConsep.addActionListener (new ButtonActionListener(this,"RecargarInformacionToolBarTipoAutoriConsep"));
		
		this.jMenuItemRecargarInformacionTipoAutoriConsep.addActionListener (new ButtonActionListener(this,"MenuItemRecargarInformacionTipoAutoriConsep"));		
		
		
		
		this.jButtonAnterioresTipoAutoriConsep.addActionListener (new ButtonActionListener(this,"AnterioresTipoAutoriConsep"));
		
		
		this.jButtonAnterioresToolBarTipoAutoriConsep.addActionListener (new ButtonActionListener(this,"AnterioresToolBarTipoAutoriConsep"));
		
		this.jMenuItemAnterioresTipoAutoriConsep.addActionListener (new ButtonActionListener(this,"MenuItemAnterioresTipoAutoriConsep"));		
		
		
		this.jButtonSiguientesTipoAutoriConsep.addActionListener (new ButtonActionListener(this,"SiguientesTipoAutoriConsep"));
		
		
		this.jButtonSiguientesToolBarTipoAutoriConsep.addActionListener (new ButtonActionListener(this,"SiguientesToolBarTipoAutoriConsep"));
			
		this.jMenuItemSiguientesTipoAutoriConsep.addActionListener (new ButtonActionListener(this,"MenuItemSiguientesTipoAutoriConsep"));
			
		this.jMenuItemAbrirOrderByTipoAutoriConsep.addActionListener (new ButtonActionListener(this,"MenuItemAbrirOrderByTipoAutoriConsep"));
			
		this.jMenuItemMostrarOcultarTipoAutoriConsep.addActionListener (new ButtonActionListener(this,"MenuItemMostrarOcultarTipoAutoriConsep"));
			
		this.jMenuItemDetalleAbrirOrderByTipoAutoriConsep.addActionListener (new ButtonActionListener(this,"MenuItemDetalleAbrirOrderByTipoAutoriConsep"));
			
		this.jMenuItemDetalleMostarOcultarTipoAutoriConsep.addActionListener (new ButtonActionListener(this,"MenuItemDetalleMostrarOcultarTipoAutoriConsep"));		
		
		
		this.jButtonNuevoGuardarCambiosTipoAutoriConsep.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosTipoAutoriConsep"));
		
		
		this.jButtonNuevoGuardarCambiosToolBarTipoAutoriConsep.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosToolBarTipoAutoriConsep"));
			
		this.jMenuItemNuevoGuardarCambiosTipoAutoriConsep.addActionListener (new ButtonActionListener(this,"MenuItemNuevoGuardarCambiosTipoAutoriConsep"));		
		
		
		
		//SELECCIONAR TODOS
		
		this.jCheckBoxSeleccionarTodosTipoAutoriConsep.addItemListener(new CheckBoxItemListener(this,"SeleccionarTodosTipoAutoriConsep"));

		this.jCheckBoxSeleccionadosTipoAutoriConsep.addItemListener(new CheckBoxItemListener(this,"SeleccionadosTipoAutoriConsep"));
		
		if(this.jInternalFrameDetalleFormTipoAutoriConsep!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoAutoriConsep.jComboBoxTiposAccionesFormularioTipoAutoriConsep.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioTipoAutoriConsep"));
		}
		
		
		this.jComboBoxTiposRelacionesTipoAutoriConsep.addActionListener (new ButtonActionListener(this,"TiposRelacionesTipoAutoriConsep"));
			
		this.jComboBoxTiposAccionesTipoAutoriConsep.addActionListener (new ButtonActionListener(this,"TiposAccionesTipoAutoriConsep"));
					
		this.jComboBoxTiposSeleccionarTipoAutoriConsep.addActionListener (new ButtonActionListener(this,"TiposSeleccionarTipoAutoriConsep"));
			
		this.jTextFieldValorCampoGeneralTipoAutoriConsep.addActionListener (new ButtonActionListener(this,"ValorCampoGeneralTipoAutoriConsep"));		
		
		
		if(this.jInternalFrameDetalleFormTipoAutoriConsep!=null) { //if(this.conCargarFormDetalle) {
		
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoAutoriConsep.jButtonidTipoAutoriConsepBusqueda.addActionListener(new ButtonActionListener(this,"idTipoAutoriConsepBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoAutoriConsep.jButtoncodigoTipoAutoriConsepBusqueda.addActionListener(new ButtonActionListener(this,"codigoTipoAutoriConsepBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoAutoriConsep.jButtonnombreTipoAutoriConsepBusqueda.addActionListener(new ButtonActionListener(this,"nombreTipoAutoriConsepBusqueda"));
		}
		
		if(!this.conCargarMinimo) {
		//BYDAN_BUSQUEDAS
		
		
			this.jButtonBusquedaPorCodigoTipoAutoriConsep.addActionListener(new ButtonActionListener(this,"BusquedaPorCodigoTipoAutoriConsep"));

			this.jButtonBusquedaPorNombreTipoAutoriConsep.addActionListener(new ButtonActionListener(this,"BusquedaPorNombreTipoAutoriConsep"));
		
		
		
			//REPORTE DINAMICO
			
			if(this.jInternalFrameReporteDinamicoTipoAutoriConsep!=null) {
				this.jInternalFrameReporteDinamicoTipoAutoriConsep.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoTipoAutoriConsep"));
				this.jInternalFrameReporteDinamicoTipoAutoriConsep.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoTipoAutoriConsep"));
				this.jInternalFrameReporteDinamicoTipoAutoriConsep.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoTipoAutoriConsep"));
			}
			
			//this.jButtonCerrarReporteDinamicoTipoAutoriConsep.addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoTipoAutoriConsep"));				
			//this.jButtonGenerarReporteDinamicoTipoAutoriConsep.addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoTipoAutoriConsep"));
			//this.jButtonGenerarExcelReporteDinamicoTipoAutoriConsep.addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoTipoAutoriConsep"));
				
				
			//IMPORTACION			
			if(this.jInternalFrameImportacionTipoAutoriConsep!=null) {
				this.jInternalFrameImportacionTipoAutoriConsep.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionTipoAutoriConsep"));
				this.jInternalFrameImportacionTipoAutoriConsep.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionTipoAutoriConsep"));
				this.jInternalFrameImportacionTipoAutoriConsep.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionTipoAutoriConsep"));
			}
			
			//ORDER BY
			this.jButtonAbrirOrderByTipoAutoriConsep.addActionListener (new ButtonActionListener(this,"AbrirOrderByTipoAutoriConsep"));
			
			this.jButtonAbrirOrderByToolBarTipoAutoriConsep.addActionListener (new ButtonActionListener(this,"AbrirOrderByToolBarTipoAutoriConsep"));			
			
			if(this.jInternalFrameOrderByTipoAutoriConsep!=null) {
				this.jInternalFrameOrderByTipoAutoriConsep.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByTipoAutoriConsep"));				
			}
			
			
		}
		
		
		
		if(!this.conCargarMinimo) {
			if(this.jInternalFrameDetalleFormTipoAutoriConsep!=null) { //if(this.conCargarFormDetalle) {
			;
			}
		}
		
		
		//TABBED PANE RELACIONES
		if(this.jInternalFrameDetalleFormTipoAutoriConsep!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoAutoriConsep.jTabbedPaneRelacionesTipoAutoriConsep.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesTipoAutoriConsep"));
		
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
            		closingInternalFrameTipoAutoriConsep();
				} catch (Exception e) {
					e.printStackTrace();
				}
            }
        });
		
		this.jInternalFrameDetalleFormTipoAutoriConsep.addInternalFrameListener(new javax.swing.event.InternalFrameAdapter() {
	        public void internalFrameClosing(InternalFrameEvent event) {
	            JInternalFrameBase jInternalFrameDetalleFormTipoAutoriConsep = (JInternalFrameBase)event.getSource();
	            	
	            TipoAutoriConsepBeanSwingJInternalFrame jInternalFrameParent=(TipoAutoriConsepBeanSwingJInternalFrame)jInternalFrameDetalleFormTipoAutoriConsep.getjInternalFrameParent();
	                
	            try {
					jInternalFrameParent.jButtonCancelarTipoAutoriConsepActionPerformed(null);
					
					//jInternalFrameParent.dispose();
					//jInternalFrameParent=null;
					
				} catch (Exception e) {
					e.printStackTrace();
				}
	        }
	    });
			
		this.jTableDatosTipoAutoriConsep.getSelectionModel().addListSelectionListener (
	                new ListSelectionListener() {
	                    public void valueChanged(ListSelectionEvent e) {
							//BYDAN_DESHABILITADO
	                    	//try {jTableDatosTipoAutoriConsepListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
	                    }
	                }
	     );
		
		this.jTableDatosTipoAutoriConsep.addMouseListener(new MouseAdapter() {
			   public void mouseClicked(MouseEvent evt) {
				      if (evt.getClickCount() == 2) {
				    	  jButtonIdActionPerformed(null,jTableDatosTipoAutoriConsep.getSelectedRow(),false,false);
				      }
				   }
		});
		
		this.jButtonNuevoTipoAutoriConsep.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoTipoAutoriConsepActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoToolBarTipoAutoriConsep.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoTipoAutoriConsepActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoTipoAutoriConsep.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoTipoAutoriConsepActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoTipoAutoriConsep";
		inputMap = this.jButtonNuevoTipoAutoriConsep.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_N , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoTipoAutoriConsep.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoTipoAutoriConsepActionPerformed(evt,false);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonNuevoRelacionesTipoAutoriConsep.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoTipoAutoriConsepActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoRelacionesToolBarTipoAutoriConsep.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoTipoAutoriConsepActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoRelacionesTipoAutoriConsep.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoTipoAutoriConsepActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoRelacionesTipoAutoriConsep";
		inputMap = this.jButtonNuevoRelacionesTipoAutoriConsep.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_R , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoRelacionesTipoAutoriConsep.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoTipoAutoriConsepActionPerformed(evt,true);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonModificarTipoAutoriConsep.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarTipoAutoriConsepActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonModificarToolBarTipoAutoriConsep.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarTipoAutoriConsepActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemModificarTipoAutoriConsep.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarTipoAutoriConsepActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ModificarTipoAutoriConsep";
		inputMap = this.jButtonModificarTipoAutoriConsep.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_M , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonModificarTipoAutoriConsep.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonModificarTipoAutoriConsepActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonActualizarTipoAutoriConsep.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarTipoAutoriConsepActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonActualizarToolBarTipoAutoriConsep.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarTipoAutoriConsepActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemActualizarTipoAutoriConsep.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarTipoAutoriConsepActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ActualizarTipoAutoriConsep";
		inputMap = this.jButtonActualizarTipoAutoriConsep.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonActualizarTipoAutoriConsep.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonActualizarTipoAutoriConsepActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonEliminarTipoAutoriConsep.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarTipoAutoriConsepActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonEliminarToolBarTipoAutoriConsep.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarTipoAutoriConsepActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
				
		this.jMenuItemEliminarTipoAutoriConsep.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarTipoAutoriConsepActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "EliminarTipoAutoriConsep";
		inputMap = this.jButtonEliminarTipoAutoriConsep.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_E , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonEliminarTipoAutoriConsep.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonEliminarTipoAutoriConsepActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCancelarTipoAutoriConsep.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarTipoAutoriConsepActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCancelarToolBarTipoAutoriConsep.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarTipoAutoriConsepActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCancelarTipoAutoriConsep.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarTipoAutoriConsepActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CancelarTipoAutoriConsep";
		inputMap = this.jButtonCancelarTipoAutoriConsep.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_Q , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonCancelarTipoAutoriConsep.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCancelarTipoAutoriConsepActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCerrarTipoAutoriConsep.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarTipoAutoriConsepActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCerrarToolBarTipoAutoriConsep.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarTipoAutoriConsepActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCerrarTipoAutoriConsep.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarTipoAutoriConsepActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemDetalleCerrarTipoAutoriConsep.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  //try {jButtonCerrarTipoAutoriConsepActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
					try {jButtonCancelarTipoAutoriConsepActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CerrarTipoAutoriConsep";
		inputMap = this.jButtonCerrarTipoAutoriConsep.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_C , KeyEvent.ALT_MASK), sMapKey);
			
		this.jButtonCerrarTipoAutoriConsep.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCerrarTipoAutoriConsepActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jInternalFrameDetalleFormTipoAutoriConsep.jButtonGuardarCambiosTipoAutoriConsep.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosTipoAutoriConsepActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosToolBarTipoAutoriConsep.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosTipoAutoriConsepActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosTipoAutoriConsep.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosTipoAutoriConsepActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaTipoAutoriConsep.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosTipoAutoriConsepActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaToolBarTipoAutoriConsep.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosTipoAutoriConsepActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosTablaTipoAutoriConsep.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosTipoAutoriConsepActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "GuardarCambiosTipoAutoriConsep";
		inputMap = this.jInternalFrameDetalleFormTipoAutoriConsep.jButtonGuardarCambiosTipoAutoriConsep.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jInternalFrameDetalleFormTipoAutoriConsep.jButtonGuardarCambiosTipoAutoriConsep.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonGuardarCambiosTipoAutoriConsepActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonRecargarInformacionTipoAutoriConsep.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionTipoAutoriConsepActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonRecargarInformacionToolBarTipoAutoriConsep.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionTipoAutoriConsepActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemRecargarInformacionTipoAutoriConsep.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionTipoAutoriConsepActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		this.jButtonAnterioresTipoAutoriConsep.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresTipoAutoriConsepActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAnterioresToolBarTipoAutoriConsep.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresTipoAutoriConsepActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemAnterioresTipoAutoriConsep.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresTipoAutoriConsepActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesTipoAutoriConsep.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesTipoAutoriConsepActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesToolBarTipoAutoriConsep.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesTipoAutoriConsepActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemSiguientesTipoAutoriConsep.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesTipoAutoriConsepActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosTipoAutoriConsep.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosTipoAutoriConsepActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosToolBarTipoAutoriConsep.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosTipoAutoriConsepActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoGuardarCambiosTipoAutoriConsep.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosTipoAutoriConsepActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		//SELECCIONAR TODOS
		this.jCheckBoxSeleccionarTodosTipoAutoriConsep.addItemListener(new ItemListener() {		
			public void itemStateChanged(ItemEvent evt) {
				try {jCheckBoxSeleccionarTodosTipoAutoriConsepItemListener(evt);}catch(Exception e){e.printStackTrace();}
			}
		});

		this.jComboBoxTiposAccionesTipoAutoriConsep.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposAccionesTipoAutoriConsepActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jComboBoxTiposSeleccionarTipoAutoriConsep.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposSeleccionarTipoAutoriConsepActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jTextFieldValorCampoGeneralTipoAutoriConsep.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jTextFieldValorCampoGeneralTipoAutoriConsepActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoAutoriConsep.jButtonidTipoAutoriConsepBusqueda.addActionListener(new ButtonActionListener(this,"idTipoAutoriConsepBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoAutoriConsep.jButtoncodigoTipoAutoriConsepBusqueda.addActionListener(new ButtonActionListener(this,"codigoTipoAutoriConsepBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoAutoriConsep.jButtonnombreTipoAutoriConsepBusqueda.addActionListener(new ButtonActionListener(this,"nombreTipoAutoriConsepBusqueda"));
		
		
		this.jButtonBusquedaPorCodigoTipoAutoriConsep.addActionListener(new ButtonActionListener(this,"BusquedaPorCodigoTipoAutoriConsep"));

		this.jButtonBusquedaPorNombreTipoAutoriConsep.addActionListener(new ButtonActionListener(this,"BusquedaPorNombreTipoAutoriConsep"));

		
		//REPORTE DINAMICO
		this.jButtonCerrarReporteDinamicoTipoAutoriConsep.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarReporteDinamicoTipoAutoriConsepActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarReporteDinamicoTipoAutoriConsep.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarReporteDinamicoTipoAutoriConsepActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarExcelReporteDinamicoTipoAutoriConsep.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarExcelReporteDinamicoTipoAutoriConsepActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		//IMPORTACION
		this.jButtonCerrarImportacionTipoAutoriConsep.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarImportacionTipoAutoriConsepActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarImportacionTipoAutoriConsep.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarImportacionTipoAutoriConsepActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAbrirImportacionTipoAutoriConsep.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAbrirImportacionTipoAutoriConsepActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
	}
	*/
	
	
	public void jComboBoxTiposSeleccionarTipoAutoriConsepActionListener(ActionEvent evt) throws Exception {    		
		try {			
			Reporte reporte=(Reporte)this.jComboBoxTiposSeleccionarTipoAutoriConsep.getSelectedItem();
			
			//if(reporte.getsCodigo().equals("SELECCIONAR")) {
			//}					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoAutoriConsepConstantesFunciones.CLASSNAME);
		}
	}	
	
	
	
	public void seleccionarTodosTipoAutoriConsep(Boolean conSeleccionarTodos) throws Exception {    		
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				for(TipoAutoriConsep tipoautoriconsepAux:this.tipoautoriconsepLogic.getTipoAutoriConseps()) {
					tipoautoriconsepAux.setIsSelected(conSeleccionarTodos);
				}			
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(TipoAutoriConsep tipoautoriconsepAux:tipoautoriconseps) {
					tipoautoriconsepAux.setIsSelected(conSeleccionarTodos);
				}
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoAutoriConsepConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarTodosTipoAutoriConsepItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingTipoAutoriConsep(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			
			if(sTipoSeleccionar.equals("COLUMNAS")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(TipoAutoriConsep tipoautoriconsepAux:this.tipoautoriconsepLogic.getTipoAutoriConseps()) {
						tipoautoriconsepAux.setIsSelected(this.isSeleccionarTodos);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(TipoAutoriConsep tipoautoriconsepAux:tipoautoriconseps) {
						tipoautoriconsepAux.setIsSelected(this.isSeleccionarTodos);
					}
				}
			} else {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					for(TipoAutoriConsep tipoautoriconsepAux:this.tipoautoriconsepLogic.getTipoAutoriConseps()) {
					
					}	
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(TipoAutoriConsep tipoautoriconsepAux:tipoautoriconseps) {
						
					}
				}
			}
					
			if(existe) {
				this.inicializarActualizarBindingTablaTipoAutoriConsep(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosTipoAutoriConsep.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosTipoAutoriConsep.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosTipoAutoriConsep,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoAutoriConsepConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionadosTipoAutoriConsepItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingTipoAutoriConsep(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			int[] arrNumRowsSeleccionados=null;
			
			arrNumRowsSeleccionados=this.jTableDatosTipoAutoriConsep.getSelectedRows();
			
			TipoAutoriConsep tipoautoriconsepLocal=new TipoAutoriConsep();
			
			//this.seleccionarTodosTipoAutoriConsep(false);
			
			for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					tipoautoriconsepLocal =(TipoAutoriConsep) this.tipoautoriconsepLogic.getTipoAutoriConseps().toArray()[this.jTableDatosTipoAutoriConsep.convertRowIndexToModel(iNumRowSeleccionado)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					tipoautoriconsepLocal =(TipoAutoriConsep) this.tipoautoriconseps.toArray()[this.jTableDatosTipoAutoriConsep.convertRowIndexToModel(iNumRowSeleccionado)];
				}
				
				tipoautoriconsepLocal.setIsSelected(this.isSeleccionados);
			}
			
			/*
			if(sTipoSeleccionar.equals("SELECCIONAR")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(TipoAutoriConsep tipoautoriconsepAux:this.tipoautoriconsepLogic.getTipoAutoriConseps()) {
						tipoautoriconsepAux.setIsSelected(this.isSeleccionados);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(TipoAutoriConsep tipoautoriconsepAux:tipoautoriconseps) {
						tipoautoriconsepAux.setIsSelected(this.isSeleccionados);
					}
				}
			}
			*/
			
			//if(existe) {
				this.inicializarActualizarBindingTablaTipoAutoriConsep(false);
			/*
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			*/
			
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosTipoAutoriConsep.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosTipoAutoriConsep.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosTipoAutoriConsep,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoAutoriConsepConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarActualTipoAutoriConsepItemListener(ItemEvent evt,Long idActual) throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoAutoriConsepConstantesFunciones.CLASSNAME);
		}
	}
	
	public void ejecutarAuxiliarTipoAutoriConsepParaAjaxPostBack() throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoAutoriConsepConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jTextFieldValorCampoGeneralTipoAutoriConsepActionListener(ActionEvent evt) throws Exception {    		
		try {
			this.inicializarActualizarBindingTipoAutoriConsep(false,false);
			
			//System.out.println(this.jTextFieldValorCampoGeneralTipoAutoriConsep.getText());		
			
			Boolean existe=false;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(TipoAutoriConsep tipoautoriconsepAux:this.tipoautoriconsepLogic.getTipoAutoriConseps()) {
				
						if(sTipoSeleccionar.equals(TipoAutoriConsepConstantesFunciones.LABEL_CODIGO)) {
							existe=true;
							tipoautoriconsepAux.setcodigo(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(TipoAutoriConsepConstantesFunciones.LABEL_NOMBRE)) {
							existe=true;
							tipoautoriconsepAux.setnombre(this.sValorCampoGeneral);
						}
				}	
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(TipoAutoriConsep tipoautoriconsepAux:tipoautoriconseps) {
					
						if(sTipoSeleccionar.equals(TipoAutoriConsepConstantesFunciones.LABEL_CODIGO)) {
							existe=true;
							tipoautoriconsepAux.setcodigo(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(TipoAutoriConsepConstantesFunciones.LABEL_NOMBRE)) {
							existe=true;
							tipoautoriconsepAux.setnombre(this.sValorCampoGeneral);
						}
				}
			}
								
			if(existe) {
				this.inicializarActualizarBindingTablaTipoAutoriConsep(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoAutoriConsepConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jComboBoxTiposAccionesTipoAutoriConsepActionListener(ActionEvent evt,Boolean esParaAccionDesdeFormulario) throws Exception {    				
		Boolean conSplash=true;
		
		try {							
		
			this.inicializarActualizarBindingTipoAutoriConsep(false,false);
			
			Reporte reporte=new Reporte();
			
			this.esParaAccionDesdeFormularioTipoAutoriConsep=esParaAccionDesdeFormulario;
			
			if(!esParaAccionDesdeFormulario) {
				
				reporte=(Reporte)this.jComboBoxTiposAccionesTipoAutoriConsep.getSelectedItem();
				
			} else {
				reporte=(Reporte)this.jInternalFrameDetalleFormTipoAutoriConsep.jComboBoxTiposAccionesFormularioTipoAutoriConsep.getSelectedItem();
			}
			String sTipoAccionLocal=this.sTipoAccion;
			
			if(!esParaAccionDesdeFormulario) {
				sTipoAccionLocal=this.sTipoAccion;
			} else {
				sTipoAccionLocal=this.sTipoAccionFormulario;
			}
			
			if(sTipoAccionLocal.equals("GENERAR REPORTE")) {//reporte.getsCodigo().equals("GENERAR REPORTE")) {
				if(this.isPermisoReporteTipoAutoriConsep) {				
					conSplash=true;//false;										
					
					//this.startProcessTipoAutoriConsep(conSplash);
				
					this.generarReporteTipoAutoriConsepsSeleccionados();
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesTipoAutoriConsep.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormTipoAutoriConsep.jComboBoxTiposAccionesFormularioTipoAutoriConsep.setSelectedIndex(0);					
				}
			} else if(sTipoAccionLocal.equals("GENERAR REPORTE DINAMICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.mostrarReporteDinamicoTipoAutoriConsepsSeleccionados();
				//this.jComboBoxTiposAccionesTipoAutoriConsep.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("GENERAR_REPORTE_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoTipoAutoriConsepsSeleccionados(false);
				//this.jComboBoxTiposAccionesTipoAutoriConsep.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("GENERAR_REPORTE_TOTALES_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoTipoAutoriConsepsSeleccionados(true);
				//this.jComboBoxTiposAccionesTipoAutoriConsep.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessTipoAutoriConsep();
				
				this.exportarTipoAutoriConsepsSeleccionados();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesTipoAutoriConsep.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormTipoAutoriConsep.jComboBoxTiposAccionesFormularioTipoAutoriConsep.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("IMPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				this.mostrarImportacionTipoAutoriConseps();
				//this.importarTipoAutoriConseps();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesTipoAutoriConsep.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormTipoAutoriConsep.jComboBoxTiposAccionesFormularioTipoAutoriConsep.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS_EXCEL")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessTipoAutoriConsep();
				//SE EXPORTA SEGUN TIPO ARCHIVO SELECCIONADO
				//this.exportarExcelTipoAutoriConsepsSeleccionados();
				//this.jComboBoxTiposAccionesTipoAutoriConsep.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("RECARGAR_FK")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {								
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE RECARGAR REFERENCIAS ?", "MANTENIMIENTO DE Tipo Autorizacion Consep", JOptionPane.OK_CANCEL_OPTION) == 0) {
				
				//this.startProcessTipoAutoriConsep();
				
					if(!esParaAccionDesdeFormulario || (esParaAccionDesdeFormulario && this.isEsNuevoTipoAutoriConsep)) {
						this.esRecargarFks=true;
						this.cargarCombosForeignKeyTipoAutoriConsep(false,false,false);
						this.esRecargarFks=false;
						
						JOptionPane.showMessageDialog(this,"PROCESO EJECUTADO CORRECTAMENTE","MANTENIMIENTO DE Tipo Autorizacion Consep",JOptionPane.INFORMATION_MESSAGE);
					} else {
						JOptionPane.showMessageDialog(this,"ESTE PROCESO SOLO FUNCIONA AL INGRESAR UN NUEVO ELEMENTO","MANTENIMIENTO",JOptionPane.ERROR_MESSAGE);	
					}
					
					
				}
				
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesTipoAutoriConsep.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormTipoAutoriConsep.jComboBoxTiposAccionesFormularioTipoAutoriConsep.setSelectedIndex(0);					
				}	
			} 			
			else {
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					this.actualizarParametrosGeneralTipoAutoriConsep();
					
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}
			}
		} catch(Exception e) {
			this.esRecargarFks=false;
			
			FuncionesSwing.manageException(this, e,logger,TipoAutoriConsepConstantesFunciones.CLASSNAME);
		
		}  finally {
      		//this.finishProcessTipoAutoriConsep(conSplash);
      	}
	}
	
	public void jComboBoxTiposRelacionesTipoAutoriConsepActionListener(ActionEvent evt) throws Exception {    				
		Boolean conSplash=true;
		
		try {			
			this.startProcessTipoAutoriConsep();
			
			if(this.jInternalFrameDetalleFormTipoAutoriConsep==null) { //if(!this.conCargarFormDetalle) {			
				this.inicializarFormDetalle();
			}
			
			ArrayList<TipoAutoriConsep> tipoautoriconsepsSeleccionados=new ArrayList<TipoAutoriConsep>();		
			TipoAutoriConsep tipoautoriconsep=new TipoAutoriConsep();
			
			int rowIndex=-1;//CON ESTO SE DESHABILITA SELECCION POR INDICE
			
			this.inicializarActualizarBindingTipoAutoriConsep(false,false);
			
			Reporte reporte=new Reporte();
			
			
			reporte=(Reporte)this.jComboBoxTiposRelacionesTipoAutoriConsep.getSelectedItem();
			
			
			
			
			tipoautoriconsepsSeleccionados=this.getTipoAutoriConsepsSeleccionados(true);
			//this.sTipoAccion;
			
			if(tipoautoriconsepsSeleccionados.size()==1) {
				for(TipoAutoriConsep tipoautoriconsepAux:tipoautoriconsepsSeleccionados) {
					tipoautoriconsep=tipoautoriconsepAux;
				}
				
				if(this.sTipoAccion.equals("NONE")) {
				
				}
				
				else if(this.sTipoRelacion.equals("Autorizaciones Consep")) {
					jButtonAutoriConsepActionPerformed(null,rowIndex,true,false,tipoautoriconsep);
				}
			} else {
				JOptionPane.showMessageDialog(this,"SELECCIONE SOLO UN REGISTRO","RELACIONES",JOptionPane.ERROR_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoAutoriConsepConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.finishProcessTipoAutoriConsep();
			
      		//this.finishProcessTipoAutoriConsep(conSplash);
      	}
	}
			
	public static Boolean EsProcesoReporte(String sTipoProceso) throws Exception {
		Boolean esProcesoAccionRepoorte=false;

		if(sTipoProceso.contains("REPORTE_")) {
			 esProcesoAccionRepoorte=true;
		}

		return esProcesoAccionRepoorte;
	}
	
	public void procesarTipoAutoriConsepReturnGeneral() throws Exception {
		if(this.tipoautoriconsepReturnGeneral.getConRetornoEstaProcesado()) {
			JOptionPane.showMessageDialog(this,this.tipoautoriconsepReturnGeneral.getsMensajeProceso(),"PROCESO",JOptionPane.INFORMATION_MESSAGE);
		}
		
		if(this.tipoautoriconsepReturnGeneral.getConMostrarMensaje()) {
			JOptionPane.showMessageDialog(this,this.tipoautoriconsepReturnGeneral.getsMensajeProceso(),"PROCESO",FuncionesSwing.getColorSelectedBackground(this.tipoautoriconsepReturnGeneral.getsTipoMensaje()));
		}
		
		if(this.tipoautoriconsepReturnGeneral.getConRecargarInformacion()) {
			this.procesarBusqueda(this.sAccionBusqueda);
			
			this.inicializarActualizarBindingTipoAutoriConsep(false);
		}
		
		if(this.tipoautoriconsepReturnGeneral.getConRetornoLista() || this.tipoautoriconsepReturnGeneral.getConRetornoObjeto()) {
			if(this.tipoautoriconsepReturnGeneral.getConRetornoLista()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.tipoautoriconsepLogic.setTipoAutoriConseps(this.tipoautoriconsepReturnGeneral.getTipoAutoriConseps());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			if(this.tipoautoriconsepReturnGeneral.getConRetornoObjeto()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.tipoautoriconsepLogic.setTipoAutoriConsep(this.tipoautoriconsepReturnGeneral.getTipoAutoriConsep());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			this.inicializarActualizarBindingTipoAutoriConsep(false);
		}
	}
	
	public void actualizarParametrosGeneralTipoAutoriConsep() throws Exception {
		
		
	}
	
	public ArrayList<TipoAutoriConsep> getTipoAutoriConsepsSeleccionados(Boolean conSeleccionarTodosAutomatico) throws Exception {
		ArrayList<TipoAutoriConsep> tipoautoriconsepsSeleccionados=new ArrayList<TipoAutoriConsep>();
		Boolean existe=false;
		
		if(!this.esParaAccionDesdeFormularioTipoAutoriConsep) {
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				
				for(TipoAutoriConsep tipoautoriconsepAux:tipoautoriconsepLogic.getTipoAutoriConseps()) {
					if(tipoautoriconsepAux.getIsSelected()) {
						tipoautoriconsepsSeleccionados.add(tipoautoriconsepAux);				
					}
				}
				
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(TipoAutoriConsep tipoautoriconsepAux:this.tipoautoriconseps) {
					if(tipoautoriconsepAux.getIsSelected()) {
						tipoautoriconsepsSeleccionados.add(tipoautoriconsepAux);				
					}
				}
			}
			
			if(tipoautoriconsepsSeleccionados.size()>0) {
				existe=true;
			}
			
			//SI NO ESTA NINGUNO SELECCIONADO SE SELECCIONA TODOS
			if(!existe) {
				if(conSeleccionarTodosAutomatico) {
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						tipoautoriconsepsSeleccionados.addAll(this.tipoautoriconsepLogic.getTipoAutoriConseps());
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						tipoautoriconsepsSeleccionados.addAll(this.tipoautoriconseps);				
					}
				}
			}
		} else {
			tipoautoriconsepsSeleccionados.add(this.tipoautoriconsep);
		}
		
		return tipoautoriconsepsSeleccionados;
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
	
	public void generarReporteTipoAutoriConsepsSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoReporte.equals("NORMAL") || this.sTipoReporte.equals("FORMULARIO")) {
			existe=true;								
			this.generarReporteNormalTipoAutoriConsepsSeleccionados();
			
		} else if(this.sTipoReporte.equals("DINAMICO")) {
			existe=true;
			this.mostrarReporteDinamicoTipoAutoriConsepsSeleccionados();
			
		} else if(this.sTipoReporte.equals("GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoTipoAutoriConsepsSeleccionados(false);
			
		} else if(this.sTipoReporte.equals("TOTALES_GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoTipoAutoriConsepsSeleccionados(true);
		}
		else if(this.sTipoReporte.equals("RELACIONES")) {
			//SI SE GENERA REPORTE RELACIONES
			existe=true;
			this.generarReporteRelacionesTipoAutoriConsepsSeleccionados();
		}					
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE REPORTE VALIDO","REPORTE DE Tipo Autorizacion Consep",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void generarReporteRelacionesTipoAutoriConsepsSeleccionados() throws Exception {
		ArrayList<TipoAutoriConsep> tipoautoriconsepsSeleccionados=new ArrayList<TipoAutoriConsep>();		
		
		tipoautoriconsepsSeleccionados=this.getTipoAutoriConsepsSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
					
		//this.sTipoReporteExtra="MasterRelaciones";
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		
		this.generarReporteTipoAutoriConseps("Todos",tipoautoriconsepsSeleccionados);
		
	}	
	
	public void generarReporteNormalTipoAutoriConsepsSeleccionados() throws Exception {
		ArrayList<TipoAutoriConsep> tipoautoriconsepsSeleccionados=new ArrayList<TipoAutoriConsep>();		
		
		tipoautoriconsepsSeleccionados=this.getTipoAutoriConsepsSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
								
		if(this.sTipoReporte.equals("FORMULARIO")) {
			this.sTipoReporteExtra="Vertical";					
		}
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.generarReporteTipoAutoriConseps("Todos",tipoautoriconsepsSeleccionados);
	}		
	
	public void generarReporteProcesoAccionTipoAutoriConsepsSeleccionados(String sProcesoReporte) throws Exception {
		ArrayList<TipoAutoriConsep> tipoautoriconsepsSeleccionados=new ArrayList<TipoAutoriConsep>();
		
		tipoautoriconsepsSeleccionados=this.getTipoAutoriConsepsSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(false,false,true,"");
		
		/*
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.sTipoReporteExtra=sProcesoReporte.toLowerCase();
		
		this.esReporteAccionProceso=true;
		this.generarReporteTipoAutoriConseps("Todos",tipoautoriconsepsSeleccionados);
		this.esReporteAccionProceso=false;
	}
	
	
	public void mostrarReporteDinamicoTipoAutoriConsepsSeleccionados() throws Exception {
		ArrayList<TipoAutoriConsep> tipoautoriconsepsSeleccionados=new ArrayList<TipoAutoriConsep>();		
		
		
		this.abrirInicializarFrameReporteDinamicoTipoAutoriConsep();
		
		
		tipoautoriconsepsSeleccionados=this.getTipoAutoriConsepsSeleccionados(true);
		
		this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirFrameReporteDinamicoTipoAutoriConsep();
		
		
		//this.generarReporteTipoAutoriConseps("Todos",tipoautoriconsepsSeleccionados ,tipoautoriconsepImplementable,tipoautoriconsepImplementableHome);
	}
	
	public void mostrarImportacionTipoAutoriConseps() throws Exception {
		//this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirInicializarFrameImportacionTipoAutoriConsep();
		
		this.abrirFrameImportacionTipoAutoriConsep();		
		
			
		//this.generarReporteTipoAutoriConseps("Todos",tipoautoriconsepsSeleccionados ,tipoautoriconsepImplementable,tipoautoriconsepImplementableHome);
	}
	
	public void importarTipoAutoriConseps() throws Exception {		
	
	}
	
	public void exportarTipoAutoriConsepsSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoArchivoReporte.equals("EXCEL")) {
			existe=true;
			this.exportarExcelTipoAutoriConsepsSeleccionados();
			
		} else if(this.sTipoArchivoReporte.equals("TEXTO")) {
			existe=true;
			this.exportarTextoTipoAutoriConsepsSeleccionados();
		
		} else if(this.sTipoArchivoReporte.equals("XML")) {
			existe=true;
			this.exportarXmlTipoAutoriConsepsSeleccionados();
		} 
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE ARCHIVO VALIDO","EXPORTACION DE Tipo Autorizacion Consep",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void exportarTextoTipoAutoriConsepsSeleccionados() throws Exception {
		ArrayList<TipoAutoriConsep> tipoautoriconsepsSeleccionados=new ArrayList<TipoAutoriConsep>();		
		
		tipoautoriconsepsSeleccionados=this.getTipoAutoriConsepsSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tipoautoriconsep."+"txt";//Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario);
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		BufferedWriter bufferedWriter = null;
		FileWriter fileWriter=null;
		
		fileWriter=new FileWriter(sPath);
		
		bufferedWriter = new BufferedWriter(fileWriter);
		
		try {
			if(conCabecera) {
				sFilaCabecera=this.getFilaCabeceraExportarTipoAutoriConsep(sDelimiter);
				
				bufferedWriter.write(sFilaCabecera);
			}				
			
			for(TipoAutoriConsep tipoautoriconsepAux:tipoautoriconsepsSeleccionados) {
				sFilaDatos=this.getFilaDatosExportarTipoAutoriConsep(tipoautoriconsepAux,sDelimiter);
				
				bufferedWriter.write(sFilaDatos);
				
				//tipoautoriconsepAux.setsDetalleGeneralEntityReporte(tipoautoriconsepAux.toString());			
			}
			
			bufferedWriter.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipoautoriconsepSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Autorizacion Consep",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {
       		if (bufferedWriter != null) {
				bufferedWriter.close();
			}
		}
	}
	
	public String getFilaCabeceraExportarTipoAutoriConsep(String sDelimiter) {
		String sFilaCabecera="";
		
		
		sFilaCabecera+=TipoAutoriConsepConstantesFunciones.LABEL_ID;

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaCabecera+=sDelimiter;
		sFilaCabecera+=TipoAutoriConsepConstantesFunciones.LABEL_VERSIONROW;
		}

		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=TipoAutoriConsepConstantesFunciones.LABEL_CODIGO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=TipoAutoriConsepConstantesFunciones.LABEL_NOMBRE;
		
		return sFilaCabecera;
	}
	
	public String getFilaDatosExportarTipoAutoriConsep(TipoAutoriConsep tipoautoriconsep,String sDelimiter) {
		String sFilaDatos="";
		
		sFilaDatos+="\r\n";
		
		
		sFilaDatos+=tipoautoriconsep.getId().toString();

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaDatos+=sDelimiter;
		sFilaDatos+=tipoautoriconsep.getVersionRow().toString();
		}

		sFilaDatos+=sDelimiter;
		sFilaDatos+=tipoautoriconsep.getcodigo();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=tipoautoriconsep.getnombre();
		
		return sFilaDatos;
	}
	
	//@SuppressWarnings("deprecation")
	public void exportarExcelTipoAutoriConsepsSeleccionados() throws Exception {
		ArrayList<TipoAutoriConsep> tipoautoriconsepsSeleccionados=new ArrayList<TipoAutoriConsep>();		
		
		tipoautoriconsepsSeleccionados=this.getTipoAutoriConsepsSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tipoautoriconsep.xls";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		FileOutputStream fileOutputStream=null;
		
		try {
			HSSFWorkbook workbook = new HSSFWorkbook();
			HSSFSheet sheet = workbook.createSheet("TipoAutoriConseps");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			HSSFRow row = sheet.createRow(iRow);
			HSSFCell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");

			if(conCabecera) {
				this.getFilaCabeceraExportarExcelTipoAutoriConsep(row);				
				iRow++;
			}				
			
			for(TipoAutoriConsep tipoautoriconsepAux:tipoautoriconsepsSeleccionados) {
				row = sheet.createRow(iRow);
				
				this.getFilaDatosExportarExcelTipoAutoriConsep(tipoautoriconsepAux,row);
				
				iRow++;
			}
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipoautoriconsepSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Autorizacion Consep",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			
       		if (fileOutputStream != null) {
				fileOutputStream.close();
			}			
		}
	}		
	
	public void exportarXmlTipoAutoriConsepsSeleccionados() throws Exception {
		ArrayList<TipoAutoriConsep> tipoautoriconsepsSeleccionados=new ArrayList<TipoAutoriConsep>();		
		
		tipoautoriconsepsSeleccionados=this.getTipoAutoriConsepsSeleccionados(true);
		
		//String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		//Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		//String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tipoautoriconsep.xml";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		DocumentBuilderFactory documentBuilderFactory=null;
		DocumentBuilder documentBuilder =null;
		
		try {
			documentBuilderFactory = DocumentBuilderFactory.newInstance();
			documentBuilder = documentBuilderFactory.newDocumentBuilder();
	
			Document document = documentBuilder.newDocument();
			Element elementRoot = document.createElement("tipoautoriconseps");
			
			document.appendChild(elementRoot);
		    			
												
			Element element = null;//document.createElement("tipoautoriconsep");
			//elementRoot.appendChild(element);
		
			for(TipoAutoriConsep tipoautoriconsepAux:tipoautoriconsepsSeleccionados) {
				element = document.createElement("tipoautoriconsep");
				elementRoot.appendChild(element);
			
				this.setFilaDatosExportarXmlTipoAutoriConsep(tipoautoriconsepAux,document,element);
			}
			
			TransformerFactory transformerFactory = TransformerFactory.newInstance();
			Transformer transformer = transformerFactory.newTransformer();
			DOMSource domSource = new DOMSource(document);
			
			StreamResult streamResult = new StreamResult(new File(sPath));
	
			transformer.transform(domSource, streamResult);
						
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipoautoriconsepSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Autorizacion Consep",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			       				
		}
	}	
	
	//@SuppressWarnings("deprecation")
	public void getFilaCabeceraExportarExcelTipoAutoriConsep(HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(TipoAutoriConsepConstantesFunciones.LABEL_ID);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
		cell = row.createCell(iColumn++);cell.setCellValue(TipoAutoriConsepConstantesFunciones.LABEL_VERSIONROW);
		}

		cell = row.createCell(iColumn++);cell.setCellValue(TipoAutoriConsepConstantesFunciones.LABEL_CODIGO);
		cell = row.createCell(iColumn++);cell.setCellValue(TipoAutoriConsepConstantesFunciones.LABEL_NOMBRE);
	}
	
	//@SuppressWarnings("deprecation")
	public void getFilaDatosExportarExcelTipoAutoriConsep(TipoAutoriConsep tipoautoriconsep,HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(tipoautoriconsep.getId());
		cell = row.createCell(iColumn++);cell.setCellValue(tipoautoriconsep.getcodigo());
		cell = row.createCell(iColumn++);cell.setCellValue(tipoautoriconsep.getnombre());				
	}
	
	public void setFilaDatosExportarXmlTipoAutoriConsep(TipoAutoriConsep tipoautoriconsep,Document document,Element element) {
		/*
		Element lastname = document.createElement("lastname");
		lastname.appendChild(document.createTextNode("mook kim"));
		element.appendChild(lastname);
		*/
		

		Element elementId = document.createElement(TipoAutoriConsepConstantesFunciones.ID);
		elementId.appendChild(document.createTextNode(tipoautoriconsep.getId().toString().trim()));
		element.appendChild(elementId);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){

		Element elementVersionRow = document.createElement(TipoAutoriConsepConstantesFunciones.VERSIONROW);
		elementVersionRow.appendChild(document.createTextNode(tipoautoriconsep.getVersionRow().toString().trim()));
		element.appendChild(elementVersionRow);
		}


		Element elementcodigo = document.createElement(TipoAutoriConsepConstantesFunciones.CODIGO);
		elementcodigo.appendChild(document.createTextNode(tipoautoriconsep.getcodigo().trim()));
		element.appendChild(elementcodigo);

		Element elementnombre = document.createElement(TipoAutoriConsepConstantesFunciones.NOMBRE);
		elementnombre.appendChild(document.createTextNode(tipoautoriconsep.getnombre().trim()));
		element.appendChild(elementnombre);
	}
	
	public void generarReporteGroupGenericoTipoAutoriConsepsSeleccionados(Boolean soloTotales) throws Exception {
		ArrayList<TipoAutoriConsep> tipoautoriconsepsSeleccionados=new ArrayList<TipoAutoriConsep>();
		
		tipoautoriconsepsSeleccionados=this.getTipoAutoriConsepsSeleccionados(true);
		
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
		
		this.setColumnaDescripcionReporteGroupGenericoTipoAutoriConsep(tipoautoriconsepsSeleccionados);
		
		this.generarReporteTipoAutoriConseps("Todos",tipoautoriconsepsSeleccionados);
	}
	
	public void setColumnaDescripcionReporteGroupGenericoTipoAutoriConsep(ArrayList<TipoAutoriConsep> tipoautoriconsepsSeleccionados) throws Exception {    		
		try {
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			
			Boolean existe=false;
			
			for(TipoAutoriConsep tipoautoriconsepAux:tipoautoriconsepsSeleccionados) {
				tipoautoriconsepAux.setsDetalleGeneralEntityReporte(tipoautoriconsepAux.toString());
			
				if(sTipoSeleccionar.equals(TipoAutoriConsepConstantesFunciones.LABEL_CODIGO)) {
					existe=true;
					tipoautoriconsepAux.setsDescripcionGeneralEntityReporte1(tipoautoriconsepAux.getcodigo());
				}
				 else if(sTipoSeleccionar.equals(TipoAutoriConsepConstantesFunciones.LABEL_NOMBRE)) {
					existe=true;
					tipoautoriconsepAux.setsDescripcionGeneralEntityReporte1(tipoautoriconsepAux.getnombre());
				}
			}	
											
			if(!existe) {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}										
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoAutoriConsepConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void actualizarEstadoCeldasBotonesTipoAutoriConsep(String sAccion,Boolean isGuardarCambiosEnLote,Boolean isEsMantenimientoRelacionado) throws Exception {
		if(sAccion=="n") {
			if(!this.esParaBusquedaForeignKey) {
				this.isVisibilidadCeldaNuevoTipoAutoriConsep=true;
				this.isVisibilidadCeldaNuevoRelacionesTipoAutoriConsep=true;
				this.isVisibilidadCeldaGuardarCambiosTipoAutoriConsep=true;
			}
			
			this.isVisibilidadCeldaModificarTipoAutoriConsep=false;
			this.isVisibilidadCeldaActualizarTipoAutoriConsep=false;
			this.isVisibilidadCeldaEliminarTipoAutoriConsep=false;
			this.isVisibilidadCeldaCancelarTipoAutoriConsep=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoAutoriConsep=true;
				} else {
					this.isVisibilidadCeldaGuardarTipoAutoriConsep=false;
				}
			}
		} else if(sAccion=="a") {
			this.isVisibilidadCeldaNuevoTipoAutoriConsep=false;
			this.isVisibilidadCeldaNuevoRelacionesTipoAutoriConsep=false;
			this.isVisibilidadCeldaGuardarCambiosTipoAutoriConsep=false;
			this.isVisibilidadCeldaModificarTipoAutoriConsep=false;
			this.isVisibilidadCeldaActualizarTipoAutoriConsep=true;
			this.isVisibilidadCeldaEliminarTipoAutoriConsep=false;
			this.isVisibilidadCeldaCancelarTipoAutoriConsep=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoAutoriConsep=true;
				} else {
					this.isVisibilidadCeldaGuardarTipoAutoriConsep=false;
				}
			}
		} else if(sAccion=="ae") {
			this.isVisibilidadCeldaNuevoTipoAutoriConsep=false;
			this.isVisibilidadCeldaNuevoRelacionesTipoAutoriConsep=false;
			this.isVisibilidadCeldaGuardarCambiosTipoAutoriConsep=false;
			this.isVisibilidadCeldaModificarTipoAutoriConsep=false;
			this.isVisibilidadCeldaActualizarTipoAutoriConsep=true;
			this.isVisibilidadCeldaEliminarTipoAutoriConsep=true;
			this.isVisibilidadCeldaCancelarTipoAutoriConsep=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoAutoriConsep=true;
				} else {
					this.isVisibilidadCeldaGuardarTipoAutoriConsep=false;
				}
			}
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {
			this.isVisibilidadCeldaNuevoTipoAutoriConsep=false;
			this.isVisibilidadCeldaNuevoRelacionesTipoAutoriConsep=false;
			this.isVisibilidadCeldaGuardarCambiosTipoAutoriConsep=false;
			this.isVisibilidadCeldaModificarTipoAutoriConsep=false;
			this.isVisibilidadCeldaActualizarTipoAutoriConsep=true;
			this.isVisibilidadCeldaEliminarTipoAutoriConsep=false;
			this.isVisibilidadCeldaCancelarTipoAutoriConsep=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoAutoriConsep=false;
				} else {
					this.isVisibilidadCeldaGuardarTipoAutoriConsep=false;
				}
			}
		} else if(sAccion=="c") {
			this.isVisibilidadCeldaNuevoTipoAutoriConsep=true;
			this.isVisibilidadCeldaNuevoRelacionesTipoAutoriConsep=true;
			this.isVisibilidadCeldaGuardarCambiosTipoAutoriConsep=true;
			this.isVisibilidadCeldaModificarTipoAutoriConsep=false;
			this.isVisibilidadCeldaActualizarTipoAutoriConsep=false;
			this.isVisibilidadCeldaEliminarTipoAutoriConsep=false;
			this.isVisibilidadCeldaCancelarTipoAutoriConsep=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoAutoriConsep=true;
				} else {
					this.isVisibilidadCeldaGuardarTipoAutoriConsep=false;
				}
			}
		} else if(sAccion=="t") {
			this.isVisibilidadCeldaNuevoTipoAutoriConsep=false;
			this.isVisibilidadCeldaNuevoRelacionesTipoAutoriConsep=false;
			this.isVisibilidadCeldaGuardarCambiosTipoAutoriConsep=false;
			this.isVisibilidadCeldaActualizarTipoAutoriConsep=false;
			this.isVisibilidadCeldaEliminarTipoAutoriConsep=false;
			this.isVisibilidadCeldaCancelarTipoAutoriConsep=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoAutoriConsep=false;
				} else {
					this.isVisibilidadCeldaGuardarTipoAutoriConsep=false;
				}
			}
		}  else if(sAccion=="s"||sAccion=="s2") {
			this.isVisibilidadCeldaNuevoTipoAutoriConsep=false;
			this.isVisibilidadCeldaNuevoRelacionesTipoAutoriConsep=false;
			this.isVisibilidadCeldaGuardarCambiosTipoAutoriConsep=false;
			this.isVisibilidadCeldaModificarTipoAutoriConsep=true;
			this.isVisibilidadCeldaActualizarTipoAutoriConsep=false;
			this.isVisibilidadCeldaEliminarTipoAutoriConsep=false;
			this.isVisibilidadCeldaCancelarTipoAutoriConsep=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoAutoriConsep=false;
				} else {
					this.isVisibilidadCeldaGuardarTipoAutoriConsep=false;
				}
			}
		}
		
		//ACTUALIZA VISIBILIDAD PANELES
		if(TipoAutoriConsepJInternalFrame.CON_DATOS_FRAME && !this.esParaBusquedaForeignKey) {
			//SIEMPRE VISIBLE
			this.isVisibilidadCeldaNuevoTipoAutoriConsep=true;
			this.isVisibilidadCeldaNuevoRelacionesTipoAutoriConsep=true;
			this.isVisibilidadCeldaGuardarCambiosTipoAutoriConsep=true;
		} else {
			this.actualizarEstadoPanelsTipoAutoriConsep(sAccion);						
		}
		
		if(this.esParaBusquedaForeignKey) {
			this.isVisibilidadCeldaCopiarTipoAutoriConsep=false;
			//this.isVisibilidadCeldaVerFormTipoAutoriConsep=false;
			this.isVisibilidadCeldaDuplicarTipoAutoriConsep=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONES
		if(!tipoautoriconsepSessionBean.getConGuardarRelaciones()) {
			this.isVisibilidadCeldaNuevoRelacionesTipoAutoriConsep=false;
		} else {
			this.isVisibilidadCeldaNuevoTipoAutoriConsep=false;
			this.isVisibilidadCeldaGuardarCambiosTipoAutoriConsep=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONADO
		if(tipoautoriconsepSessionBean.getEsGuardarRelacionado()) {
			if(!tipoautoriconsepSessionBean.getConGuardarRelaciones()) {	
				this.isVisibilidadCeldaNuevoRelacionesTipoAutoriConsep=false;												
			}
			
			this.jButtonCerrarTipoAutoriConsep.setVisible(false);
		}
		
		//SI NO TIENE MAXIMO DE RELACIONES PERMITIDAS
		if(!this.conMaximoRelaciones) {
			this.isVisibilidadCeldaNuevoRelacionesTipoAutoriConsep=false;
		}
		
		if(!this.permiteMantenimiento(this.tipoautoriconsep)) {
			this.isVisibilidadCeldaActualizarTipoAutoriConsep=false;
			this.isVisibilidadCeldaEliminarTipoAutoriConsep=false;
		}
		
		
		
	}
	
	public void actualizarEstadoCeldasBotonesConGuardarRelacionesTipoAutoriConsep() {
		this.isVisibilidadCeldaNuevoTipoAutoriConsep=false;
		this.isVisibilidadCeldaGuardarCambiosTipoAutoriConsep=false;
	}
	
	public void actualizarEstadoPanelsTipoAutoriConsep(String sAccion) {
		if(sAccion=="n") {
			if(this.jScrollPanelDatosEdicionTipoAutoriConsep!=null) {
				this.jScrollPanelDatosEdicionTipoAutoriConsep.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasTipoAutoriConsep!=null) {
				this.jTabbedPaneBusquedasTipoAutoriConsep.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosTipoAutoriConsep!=null) {
				this.jScrollPanelDatosTipoAutoriConsep.setVisible(true);
			}
			
			if(this.jPanelPaginacionTipoAutoriConsep!=null) {
				this.jPanelPaginacionTipoAutoriConsep.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesTipoAutoriConsep!=null) {
				this.jPanelParametrosReportesTipoAutoriConsep.setVisible(true);		    
			}
			
		} else if(sAccion=="a") {				
			if(this.jScrollPanelDatosEdicionTipoAutoriConsep!=null) {
				this.jScrollPanelDatosEdicionTipoAutoriConsep.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasTipoAutoriConsep!=null) {
				this.jTabbedPaneBusquedasTipoAutoriConsep.setVisible(false);			
			}
			
			
			
			if(this.jScrollPanelDatosTipoAutoriConsep!=null) {
				this.jScrollPanelDatosTipoAutoriConsep.setVisible(false);
			}
			
			if(this.jPanelPaginacionTipoAutoriConsep!=null) {
				this.jPanelPaginacionTipoAutoriConsep.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesTipoAutoriConsep!=null) {
				this.jPanelParametrosReportesTipoAutoriConsep.setVisible(false);
			}
						
		} else if(sAccion=="ae") {		
			if(this.jScrollPanelDatosEdicionTipoAutoriConsep!=null) {
				this.jScrollPanelDatosEdicionTipoAutoriConsep.setVisible(true);		
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasTipoAutoriConsep!=null) {
				this.jTabbedPaneBusquedasTipoAutoriConsep.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosTipoAutoriConsep!=null) {
				this.jScrollPanelDatosTipoAutoriConsep.setVisible(false);
			}
			
			if(this.jPanelPaginacionTipoAutoriConsep!=null) {
				this.jPanelPaginacionTipoAutoriConsep.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesTipoAutoriConsep!=null) {
				this.jPanelParametrosReportesTipoAutoriConsep.setVisible(false);
			}
						
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {	
			if(this.jScrollPanelDatosEdicionTipoAutoriConsep!=null) {
				this.jScrollPanelDatosEdicionTipoAutoriConsep.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasTipoAutoriConsep!=null) {
				this.jTabbedPaneBusquedasTipoAutoriConsep.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosTipoAutoriConsep!=null) {
				this.jScrollPanelDatosTipoAutoriConsep.setVisible(false);
			}
			
			if(this.jPanelPaginacionTipoAutoriConsep!=null) {
				this.jPanelPaginacionTipoAutoriConsep.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesTipoAutoriConsep!=null) {
				this.jPanelParametrosReportesTipoAutoriConsep.setVisible(false);
			}
						
		} else if(sAccion=="c") {	
			if(this.jScrollPanelDatosEdicionTipoAutoriConsep!=null) {
				this.jScrollPanelDatosEdicionTipoAutoriConsep.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasTipoAutoriConsep!=null) {
				this.jTabbedPaneBusquedasTipoAutoriConsep.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosTipoAutoriConsep!=null) {
				this.jScrollPanelDatosTipoAutoriConsep.setVisible(true);
			}
			
			if(this.jPanelPaginacionTipoAutoriConsep!=null) {
				this.jPanelPaginacionTipoAutoriConsep.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesTipoAutoriConsep!=null) {
				this.jPanelParametrosReportesTipoAutoriConsep.setVisible(true);
			}
						
		} else if(sAccion=="t") {
			
			if(this.jScrollPanelDatosEdicionTipoAutoriConsep!=null) {
				this.jScrollPanelDatosEdicionTipoAutoriConsep.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasTipoAutoriConsep!=null) {
				this.jTabbedPaneBusquedasTipoAutoriConsep.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosTipoAutoriConsep!=null) {
				this.jScrollPanelDatosTipoAutoriConsep.setVisible(true);
			}
			
			if(this.jPanelPaginacionTipoAutoriConsep!=null) {
				this.jPanelPaginacionTipoAutoriConsep.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesTipoAutoriConsep!=null) {
				this.jPanelParametrosReportesTipoAutoriConsep.setVisible(true);
			}
						
		}  else if(sAccion=="s"||sAccion=="s2") {
			if(this.jScrollPanelDatosEdicionTipoAutoriConsep!=null) {
				this.jScrollPanelDatosEdicionTipoAutoriConsep.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasTipoAutoriConsep!=null) {
				this.jTabbedPaneBusquedasTipoAutoriConsep.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosTipoAutoriConsep!=null) {
				this.jScrollPanelDatosTipoAutoriConsep.setVisible(true);
			}
			
			if(this.jPanelPaginacionTipoAutoriConsep!=null) {
				this.jPanelPaginacionTipoAutoriConsep.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesTipoAutoriConsep!=null) {
				this.jPanelParametrosReportesTipoAutoriConsep.setVisible(true);
			}
			
		} 
		
		if(sAccion.equals("relacionado") || this.tipoautoriconsepSessionBean.getEsGuardarRelacionado()) {
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				if(this.jTabbedPaneBusquedasTipoAutoriConsep!=null) {
					this.jTabbedPaneBusquedasTipoAutoriConsep.setVisible(false);				
				}
				
			}
			
			if(this.jPanelParametrosReportesTipoAutoriConsep!=null) {
				this.jPanelParametrosReportesTipoAutoriConsep.setVisible(false);
			}
		
		} else if(sAccion.equals("no_relacionado") && !this.tipoautoriconsepSessionBean.getEsGuardarRelacionado()) {
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasTipoAutoriConsep!=null) {
				this.jTabbedPaneBusquedasTipoAutoriConsep.setVisible(true);			
			}
			
			if(this.jPanelParametrosReportesTipoAutoriConsep!=null) {
				this.jPanelParametrosReportesTipoAutoriConsep.setVisible(true);
			}
		}
	}	
	
	
	
	

	public String registrarSesionTipoAutoriConsepParaAutoriConsepes() throws Exception {
		Boolean isPaginaPopupAutoriConsep=false;

		try {

			if(this.tipoautoriconsepSessionBean==null) {
				this.tipoautoriconsepSessionBean=new TipoAutoriConsepSessionBean();
			}

			if(this.jInternalFrameDetalleFormTipoAutoriConsep.autoriconsepSessionBean==null) {
				this.jInternalFrameDetalleFormTipoAutoriConsep.autoriconsepSessionBean=new AutoriConsepSessionBean();
			}

			this.jInternalFrameDetalleFormTipoAutoriConsep.autoriconsepSessionBean.setsPathNavegacionActual(tipoautoriconsepSessionBean.getsPathNavegacionActual()+Constantes.SHTMLFLECHA+AutoriConsepConstantesFunciones.SCLASSWEBTITULO);
			this.jInternalFrameDetalleFormTipoAutoriConsep.autoriconsepSessionBean.setisPermiteRecargarInformacion(false);
			isPaginaPopupAutoriConsep=this.jInternalFrameDetalleFormTipoAutoriConsep.autoriconsepSessionBean.getisPaginaPopup();
			this.jInternalFrameDetalleFormTipoAutoriConsep.autoriconsepSessionBean.setisPermiteNavegacionHaciaForeignKeyDesdeAutoriConsep(true);
			this.jInternalFrameDetalleFormTipoAutoriConsep.autoriconsepSessionBean.setsNombrePaginaNavegacionHaciaForeignKeyDesdeAutoriConsep(TipoAutoriConsepConstantesFunciones.SNOMBREOPCION);
			this.jInternalFrameDetalleFormTipoAutoriConsep.autoriconsepSessionBean.setisBusquedaDesdeForeignKeySesionTipoAutoriConsep(true);
			this.jInternalFrameDetalleFormTipoAutoriConsep.autoriconsepSessionBean.setlidTipoAutoriConsepActual(this.idTipoAutoriConsepActual);

			tipoautoriconsepSessionBean.setisBusquedaDesdeForeignKeySesionForeignKeyTipoAutoriConsep(true);
			tipoautoriconsepSessionBean.setlIdTipoAutoriConsepActualForeignKey(this.idTipoAutoriConsepActual);

			String strPagina=Constantes.SNONE;
			SistemaLogicAdditional sistemaLogicAdditional=new SistemaLogicAdditional();

			guardarDatosBusquedaSession();

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}

		return "";
	}
	
	
	
	
	public void guardarDatosBusquedaSession() throws Exception {
		
		//TipoAutoriConsepSessionBean tipoautoriconsepSessionBean=new TipoAutoriConsepSessionBean();
		
		if(this.tipoautoriconsepSessionBean==null) {
			this.tipoautoriconsepSessionBean=new TipoAutoriConsepSessionBean();
		}
		
		this.tipoautoriconsepSessionBean.setsUltimaBusquedaTipoAutoriConsep(this.getsAccionBusqueda());
		this.tipoautoriconsepSessionBean.setiNumeroPaginacion(this.getiNumeroPaginacion());
		this.tipoautoriconsepSessionBean.setiNumeroPaginacionPagina(this.getiNumeroPaginacionPagina());
		
		if(this.getsAccionBusqueda().equals("Todos")) {
			;
		}
		

		else if(this.getsAccionBusqueda().equals("BusquedaPorCodigo")) {
			tipoautoriconsepSessionBean.setcodigo(this.getcodigoBusquedaPorCodigo());	
		}
		else if(this.getsAccionBusqueda().equals("BusquedaPorNombre")) {
			tipoautoriconsepSessionBean.setnombre(this.getnombreBusquedaPorNombre());	
		}
		
	}
	
	public void traerDatosBusquedaDesdeSession() throws Exception {
		//TipoAutoriConsepSessionBean tipoautoriconsepSessionBean=new TipoAutoriConsepSessionBean();
		
		if(this.tipoautoriconsepSessionBean==null) {
			this.tipoautoriconsepSessionBean=new TipoAutoriConsepSessionBean();
		}
		
		if(this.tipoautoriconsepSessionBean.getsUltimaBusquedaTipoAutoriConsep()!=null&&!this.tipoautoriconsepSessionBean.getsUltimaBusquedaTipoAutoriConsep().equals("")) {
			this.setsAccionBusqueda(tipoautoriconsepSessionBean.getsUltimaBusquedaTipoAutoriConsep());
			this.setiNumeroPaginacion(tipoautoriconsepSessionBean.getiNumeroPaginacion());
			this.setiNumeroPaginacionPagina(tipoautoriconsepSessionBean.getiNumeroPaginacionPagina());		
				
			if(this.getsAccionBusqueda().equals("Todos")) {
				;
			}
			

			 else if(this.getsAccionBusqueda().equals("BusquedaPorCodigo")) {
				this.setcodigoBusquedaPorCodigo(tipoautoriconsepSessionBean.getcodigo());
				tipoautoriconsepSessionBean.setcodigo("");
			}
			 else if(this.getsAccionBusqueda().equals("BusquedaPorNombre")) {
				this.setnombreBusquedaPorNombre(tipoautoriconsepSessionBean.getnombre());
				tipoautoriconsepSessionBean.setnombre("");
			}
		}
		
		this.tipoautoriconsepSessionBean.setsUltimaBusquedaTipoAutoriConsep("");
		this.tipoautoriconsepSessionBean.setiNumeroPaginacion(TipoAutoriConsepConstantesFunciones.INUMEROPAGINACION);
		this.tipoautoriconsepSessionBean.setiNumeroPaginacionPagina(0);
		
	}
	
	public void procesoActualizarFilaTotales(Boolean esCampoValor,String sTipo) {
		try {
			this.actualizarFilaTotales();
				
			this.traerValoresTablaTotales();
			
			this.inicializarActualizarBindingTablaTipoAutoriConsep(false);
			
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	public void updateBusquedasFormularioTipoAutoriConsep() {
		this.updateBorderResaltarBusquedasFormularioTipoAutoriConsep();
		this.updateVisibilidadBusquedasFormularioTipoAutoriConsep();
		this.updateHabilitarBusquedasFormularioTipoAutoriConsep();
	}
	
	public void updateBorderResaltarBusquedasFormularioTipoAutoriConsep() {					
	//BYDAN_BUSQUEDAS
		
	int index=0;
		
	if(this.jTabbedPaneBusquedasTipoAutoriConsep.getComponents().length>0) {
	

		if(this.tipoautoriconsepConstantesFunciones.resaltarBusquedaPorCodigoTipoAutoriConsep!=null) {
			index= this.jTabbedPaneBusquedasTipoAutoriConsep.indexOfComponent(this.jPanelBusquedaPorCodigoTipoAutoriConsep);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasTipoAutoriConsep.getComponent(index);
				jPanel.setBorder(this.tipoautoriconsepConstantesFunciones.resaltarBusquedaPorCodigoTipoAutoriConsep);
			}
		}

		if(this.tipoautoriconsepConstantesFunciones.resaltarBusquedaPorNombreTipoAutoriConsep!=null) {
			index= this.jTabbedPaneBusquedasTipoAutoriConsep.indexOfComponent(this.jPanelBusquedaPorNombreTipoAutoriConsep);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasTipoAutoriConsep.getComponent(index);
				jPanel.setBorder(this.tipoautoriconsepConstantesFunciones.resaltarBusquedaPorNombreTipoAutoriConsep);
			}
		}
	}	
	
	}
	
	public void updateVisibilidadBusquedasFormularioTipoAutoriConsep() {
	//BYDAN_BUSQUEDAS
	
	int index=0;
	JPanel jPanel=null;
		
	if(this.jTabbedPaneBusquedasTipoAutoriConsep.getComponents().length>0) {
	

			index= this.jTabbedPaneBusquedasTipoAutoriConsep.indexOfComponent(this.jPanelBusquedaPorCodigoTipoAutoriConsep);
			jPanel=(JPanel)this.jTabbedPaneBusquedasTipoAutoriConsep.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.tipoautoriconsepConstantesFunciones.mostrarBusquedaPorCodigoTipoAutoriConsep);
			if(!this.tipoautoriconsepConstantesFunciones.mostrarBusquedaPorCodigoTipoAutoriConsep && index>-1) {
				this.jTabbedPaneBusquedasTipoAutoriConsep.remove(index);
			}

			index= this.jTabbedPaneBusquedasTipoAutoriConsep.indexOfComponent(this.jPanelBusquedaPorNombreTipoAutoriConsep);
			jPanel=(JPanel)this.jTabbedPaneBusquedasTipoAutoriConsep.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.tipoautoriconsepConstantesFunciones.mostrarBusquedaPorNombreTipoAutoriConsep);
			if(!this.tipoautoriconsepConstantesFunciones.mostrarBusquedaPorNombreTipoAutoriConsep && index>-1) {
				this.jTabbedPaneBusquedasTipoAutoriConsep.remove(index);
			}
	}	
	
	}
	
	public void updateHabilitarBusquedasFormularioTipoAutoriConsep() {
	
	//BYDAN_BUSQUEDAS		
		int index=0;
		JPanel jPanel=null;
			
		if(this.jTabbedPaneBusquedasTipoAutoriConsep.getComponents().length>0) {
	

			index= this.jTabbedPaneBusquedasTipoAutoriConsep.indexOfComponent(this.jPanelBusquedaPorCodigoTipoAutoriConsep);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedasTipoAutoriConsep.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.tipoautoriconsepConstantesFunciones.activarBusquedaPorCodigoTipoAutoriConsep);
				this.jTabbedPaneBusquedasTipoAutoriConsep.setEnabledAt(index,this.tipoautoriconsepConstantesFunciones.activarBusquedaPorCodigoTipoAutoriConsep);
			}

			index= this.jTabbedPaneBusquedasTipoAutoriConsep.indexOfComponent(this.jPanelBusquedaPorNombreTipoAutoriConsep);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedasTipoAutoriConsep.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.tipoautoriconsepConstantesFunciones.activarBusquedaPorNombreTipoAutoriConsep);
				this.jTabbedPaneBusquedasTipoAutoriConsep.setEnabledAt(index,this.tipoautoriconsepConstantesFunciones.activarBusquedaPorNombreTipoAutoriConsep);
			}
		}	
	
	}
	
	
	public void resaltarPanelBusquedaTipoAutoriConsep(String sTipoBusqueda) {
		Boolean existe=false;
		//BYDAN_BUSQUEDAS
		
		int index=0;
		Border resaltar = Funciones2.getBorderResaltar(this.parametroGeneralUsuario,"TAB");

		if(sTipoBusqueda.equals("BusquedaPorCodigo")) {
			index= this.jTabbedPaneBusquedasTipoAutoriConsep.indexOfComponent(this.jPanelBusquedaPorCodigoTipoAutoriConsep);

			this.jTabbedPaneBusquedasTipoAutoriConsep.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasTipoAutoriConsep.getComponent(index);

			this.tipoautoriconsepConstantesFunciones.setResaltarBusquedaPorCodigoTipoAutoriConsep(resaltar);

			jPanel.setBorder(this.tipoautoriconsepConstantesFunciones.resaltarBusquedaPorCodigoTipoAutoriConsep);
			existe=true;
		}
		else if(sTipoBusqueda.equals("BusquedaPorNombre")) {
			index= this.jTabbedPaneBusquedasTipoAutoriConsep.indexOfComponent(this.jPanelBusquedaPorNombreTipoAutoriConsep);

			this.jTabbedPaneBusquedasTipoAutoriConsep.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasTipoAutoriConsep.getComponent(index);

			this.tipoautoriconsepConstantesFunciones.setResaltarBusquedaPorNombreTipoAutoriConsep(resaltar);

			jPanel.setBorder(this.tipoautoriconsepConstantesFunciones.resaltarBusquedaPorNombreTipoAutoriConsep);
			existe=true;
		}
		

		if(existe) {
			
			this.jTtoolBarTipoAutoriConsep.setBorder(resaltar);
			
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
	
	public void updateControlesFormularioTipoAutoriConsep() throws Exception {

		if(this.jInternalFrameDetalleFormTipoAutoriConsep==null) { //if(!this.conCargarFormDetalle) {			
			this.inicializarFormDetalle();
		}
		
		this.updateBorderResaltarControlesFormularioTipoAutoriConsep();
		this.updateVisibilidadResaltarControlesFormularioTipoAutoriConsep();
		this.updateHabilitarResaltarControlesFormularioTipoAutoriConsep();
		
	}
	
	public void updateBorderResaltarControlesFormularioTipoAutoriConsep() throws Exception {
		if(this.jInternalFrameDetalleFormTipoAutoriConsep==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
	
		if(this.tipoautoriconsepConstantesFunciones.resaltaridTipoAutoriConsep!=null && this.jInternalFrameDetalleFormTipoAutoriConsep!=null) {this.jInternalFrameDetalleFormTipoAutoriConsep.jTextFieldidTipoAutoriConsep.setBorder(this.tipoautoriconsepConstantesFunciones.resaltaridTipoAutoriConsep);}
		if(this.tipoautoriconsepConstantesFunciones.resaltarcodigoTipoAutoriConsep!=null && this.jInternalFrameDetalleFormTipoAutoriConsep!=null) {this.jInternalFrameDetalleFormTipoAutoriConsep.jTextFieldcodigoTipoAutoriConsep.setBorder(this.tipoautoriconsepConstantesFunciones.resaltarcodigoTipoAutoriConsep);}
		if(this.tipoautoriconsepConstantesFunciones.resaltarnombreTipoAutoriConsep!=null && this.jInternalFrameDetalleFormTipoAutoriConsep!=null) {this.jInternalFrameDetalleFormTipoAutoriConsep.jTextFieldnombreTipoAutoriConsep.setBorder(this.tipoautoriconsepConstantesFunciones.resaltarnombreTipoAutoriConsep);}
	}
	
	public void updateVisibilidadResaltarControlesFormularioTipoAutoriConsep() throws Exception {		
		if(this.jInternalFrameDetalleFormTipoAutoriConsep==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormTipoAutoriConsep!=null) {
	
		//this.jInternalFrameDetalleFormTipoAutoriConsep.jTextFieldidTipoAutoriConsep.setVisible(this.tipoautoriconsepConstantesFunciones.mostraridTipoAutoriConsep);
		this.jInternalFrameDetalleFormTipoAutoriConsep.jPanelidTipoAutoriConsep.setVisible(this.tipoautoriconsepConstantesFunciones.mostraridTipoAutoriConsep);
		//this.jInternalFrameDetalleFormTipoAutoriConsep.jTextFieldcodigoTipoAutoriConsep.setVisible(this.tipoautoriconsepConstantesFunciones.mostrarcodigoTipoAutoriConsep);
		this.jInternalFrameDetalleFormTipoAutoriConsep.jPanelcodigoTipoAutoriConsep.setVisible(this.tipoautoriconsepConstantesFunciones.mostrarcodigoTipoAutoriConsep);
		//this.jInternalFrameDetalleFormTipoAutoriConsep.jTextFieldnombreTipoAutoriConsep.setVisible(this.tipoautoriconsepConstantesFunciones.mostrarnombreTipoAutoriConsep);
		this.jInternalFrameDetalleFormTipoAutoriConsep.jPanelnombreTipoAutoriConsep.setVisible(this.tipoautoriconsepConstantesFunciones.mostrarnombreTipoAutoriConsep);
		}
	}
	
	public void updateHabilitarResaltarControlesFormularioTipoAutoriConsep() throws Exception {
		if(this.jInternalFrameDetalleFormTipoAutoriConsep==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormTipoAutoriConsep!=null) {
	
		this.jInternalFrameDetalleFormTipoAutoriConsep.jTextFieldidTipoAutoriConsep.setEnabled(this.tipoautoriconsepConstantesFunciones.activaridTipoAutoriConsep);
		this.jInternalFrameDetalleFormTipoAutoriConsep.jTextFieldcodigoTipoAutoriConsep.setEnabled(this.tipoautoriconsepConstantesFunciones.activarcodigoTipoAutoriConsep);
		this.jInternalFrameDetalleFormTipoAutoriConsep.jTextFieldnombreTipoAutoriConsep.setEnabled(this.tipoautoriconsepConstantesFunciones.activarnombreTipoAutoriConsep);
		}
	}
	
		
}