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
package com.bydan.erp.cartera.presentation.swing.jinternalframes;




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

import com.bydan.erp.cartera.util.TipoSexoConstantesFunciones;
import com.bydan.erp.cartera.util.TipoSexoParameterReturnGeneral;
//import com.bydan.erp.cartera.util.TipoSexoParameterGeneral;
//import com.bydan.erp.cartera.presentation.report.source.TipoSexoBean;
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

import com.bydan.erp.cartera.presentation.swing.jinternalframes.auxiliar.*;
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
import com.bydan.erp.cartera.resources.reportes.AuxiliarReportes;


import com.bydan.erp.cartera.util.*;
import com.bydan.erp.cartera.business.logic.*;

import com.bydan.erp.seguridad.business.logic.*;

//EJB

//PARAMETROS


//EJB PARAMETROS

import com.bydan.framework.erp.business.logic.*;
import com.bydan.framework.erp.util.*;

import com.bydan.erp.cartera.business.entity.*;
//import com.bydan.framework.erp.business.entity.ConexionBeanFace;
//import com.bydan.framework.erp.business.entity.Mensajes;


import com.bydan.erp.seguridad.presentation.swing.jinternalframes.*;

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


import com.bydan.erp.cartera.presentation.web.jsf.sessionbean.*;

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
import com.bydan.erp.seguridad.util.*;
import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;


@SuppressWarnings("unused")
public class TipoSexoBeanSwingJInternalFrame extends TipoSexoJInternalFrame implements WindowListener,WindowFocusListener
{				
	
	public static final long serialVersionUID = 1L;
	
	public static Logger logger = Logger.getLogger(TipoSexoBeanSwingJInternalFrame.class);  
	
	public static ClassValidator<TipoSexo> tiposexoValidator = new ClassValidator<TipoSexo>(TipoSexo.class);
	
	public InvalidValue[] invalidValues=null;
		

	//Ejb Foreign Keys
	
	public TipoSexo tiposexo;	
	public TipoSexo tiposexoAux;
	public TipoSexo tiposexoAnterior;//USADO PARA MANEJAR FOCUS GAINED,LOST
	public TipoSexo tiposexoTotales;
	public Long idTipoSexoActual;
	public Long iIdNuevoTipoSexo=0L;
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
	
	public Boolean isPermisoTodoTipoSexo;
	public Boolean isPermisoNuevoTipoSexo;
	public Boolean isPermisoActualizarTipoSexo;
	public Boolean isPermisoActualizarOriginalTipoSexo;
	public Boolean isPermisoEliminarTipoSexo;
	public Boolean isPermisoGuardarCambiosTipoSexo;
	public Boolean isPermisoConsultaTipoSexo;
	public Boolean isPermisoBusquedaTipoSexo;
	public Boolean isPermisoReporteTipoSexo;
	public Boolean isPermisoPaginacionMedioTipoSexo;
	public Boolean isPermisoPaginacionAltoTipoSexo;
	public Boolean isPermisoPaginacionTodoTipoSexo;
	public Boolean isPermisoCopiarTipoSexo;
	public Boolean isPermisoVerFormTipoSexo;
	public Boolean isPermisoDuplicarTipoSexo;
	public Boolean isPermisoOrdenTipoSexo;
	
	
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
	
	public TipoSexoParameterReturnGeneral tiposexoReturnGeneral;
	public TipoSexoParameterReturnGeneral tiposexoParameterGeneral;
	
	 	
	public JasperPrint jasperPrint = null;
	
	public Long lIdUsuarioSesion=0L;				
	
	public Boolean isEsNuevoTipoSexo=false;
	public Boolean esParaAccionDesdeFormularioTipoSexo=false;
	public Boolean isEsMantenimientoRelacionesRelacionadoUnico=false;
	public Boolean isEsMantenimientoRelaciones=false;
	public Boolean isEsMantenimientoRelacionado=false;	
	public Boolean isContieneImagenes=false;
		
	//public Boolean conTotales=false; //Viene heredado de JInternalFrameBase
	//public Boolean esParaBusquedaForeignKey=false;
	
	
	protected TipoSexoSessionBeanAdditional tiposexoSessionBeanAdditional=null;
	
	public TipoSexoSessionBeanAdditional getTipoSexoSessionBeanAdditional() {
		return this.tiposexoSessionBeanAdditional;
	}
	
	public void setTipoSexoSessionBeanAdditional(TipoSexoSessionBeanAdditional tiposexoSessionBeanAdditional) {
		try {
			this.tiposexoSessionBeanAdditional=tiposexoSessionBeanAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	protected TipoSexoBeanSwingJInternalFrameAdditional tiposexoBeanSwingJInternalFrameAdditional=null;
	//public class TipoSexoBeanSwingJInternalFrame
	
	public TipoSexoBeanSwingJInternalFrameAdditional getTipoSexoBeanSwingJInternalFrameAdditional() {
		return this.tiposexoBeanSwingJInternalFrameAdditional;
	}
	
	public void setTipoSexoBeanSwingJInternalFrameAdditional(TipoSexoBeanSwingJInternalFrameAdditional tiposexoBeanSwingJInternalFrameAdditional) {
		try {
			this.tiposexoBeanSwingJInternalFrameAdditional=tiposexoBeanSwingJInternalFrameAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	//ESTA EN PADRE
	
	//public TipoSexoLogic tiposexoLogic;
	public SistemaLogicAdditional sistemaLogicAdditional;
	
	
	public TipoSexo tiposexoBean;
	public TipoSexoConstantesFunciones tiposexoConstantesFunciones;
	//public TipoSexoParameterReturnGeneral tiposexoReturnGeneral;
	
	//FK
	
	public EmpresaLogic empresaLogic;
	
	//PARAMETROS
	
	
	//public List<TipoSexo> tiposexos;	
	//public List<TipoSexo> tiposexosEliminados;
	//public List<TipoSexo> tiposexosAux;
	
	public String sAccionMantenimiento="";
	public String sAccionBusqueda="";
	public String sAccionAdicional="";
	public String sUltimaBusqueda="";
	
	public Mensaje mensaje;
	
	
	public String sVisibilidadTablaBusquedas="";					
	public String sVisibilidadTablaElementos="";	
	public String sVisibilidadTablaAcciones="";			
	
	public Boolean isVisibilidadCeldaNuevoTipoSexo=false;
	public Boolean isVisibilidadCeldaDuplicarTipoSexo=true;
	public Boolean isVisibilidadCeldaCopiarTipoSexo=true;
	public Boolean isVisibilidadCeldaVerFormTipoSexo=true;
	public Boolean isVisibilidadCeldaOrdenTipoSexo=true;
	public Boolean isVisibilidadCeldaNuevoRelacionesTipoSexo=false;
	public Boolean isVisibilidadCeldaModificarTipoSexo=false;
	public Boolean isVisibilidadCeldaActualizarTipoSexo=false;
	public Boolean isVisibilidadCeldaEliminarTipoSexo=false;
	public Boolean isVisibilidadCeldaCancelarTipoSexo=false;
	public Boolean isVisibilidadCeldaGuardarTipoSexo=false;	
	public Boolean isVisibilidadCeldaGuardarCambiosTipoSexo=false;	
	
	
	public Boolean isVisibilidadFK_IdEmpresa=false;
	
	public Long getiIdNuevoTipoSexo() {
		return this.iIdNuevoTipoSexo;
	}

	public void setiIdNuevoTipoSexo(Long iIdNuevoTipoSexo) {
		this.iIdNuevoTipoSexo = iIdNuevoTipoSexo;
	}
	
	public Long getidTipoSexoActual() {
		return this.idTipoSexoActual;
	}

	public void setidTipoSexoActual(Long idTipoSexoActual) {
		this.idTipoSexoActual = idTipoSexoActual;
	}
	
	public int getrowIndexActual() {
		return this.rowIndexActual;
	}

	public void setrowIndexActual(int rowIndexActual) {
		this.rowIndexActual=rowIndexActual;
	}
	
	
	public TipoSexo gettiposexo() {
		return this.tiposexo;
	}

	public void settiposexo(TipoSexo tiposexo) {
		this.tiposexo = tiposexo;
	}
	
	public TipoSexo gettiposexoAux() {
		return this.tiposexoAux;
	}

	public void settiposexoAux(TipoSexo tiposexoAux) {
		this.tiposexoAux = tiposexoAux;
	}				
	
	public TipoSexo gettiposexoAnterior() {
		return this.tiposexoAnterior;
	}

	public void settiposexoAnterior(TipoSexo tiposexoAnterior) {
		this.tiposexoAnterior = tiposexoAnterior;
	}	
	
	public TipoSexo gettiposexoTotales() {
		return this.tiposexoTotales;
	}

	public void settiposexoTotales(TipoSexo tiposexoTotales) {
		this.tiposexoTotales = tiposexoTotales;
	}	
	
	public TipoSexo gettiposexoBean() {
		return this.tiposexoBean;
	}

	public void settiposexoBean(TipoSexo tiposexoBean) {
		this.tiposexoBean = tiposexoBean;
	}	
	
	public TipoSexoParameterReturnGeneral gettiposexoReturnGeneral() {
		return this.tiposexoReturnGeneral;
	}

	public void settiposexoReturnGeneral(TipoSexoParameterReturnGeneral tiposexoReturnGeneral) {
		this.tiposexoReturnGeneral = tiposexoReturnGeneral;
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
	
	
	public TipoSexoLogic getTipoSexoLogic()	{		
		return tiposexoLogic;
	}

	public void setTipoSexoLogic(TipoSexoLogic tiposexoLogic) {
		this.tiposexoLogic = tiposexoLogic;
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
	
	public Boolean getIsEsNuevoTipoSexo() {
		return isEsNuevoTipoSexo;
	}

	public void setIsEsNuevoTipoSexo(Boolean isEsNuevoTipoSexo) {
		this.isEsNuevoTipoSexo = isEsNuevoTipoSexo;
	}

	public Boolean getEsParaAccionDesdeFormularioTipoSexo() {
		return esParaAccionDesdeFormularioTipoSexo;
	}
	
	public void setEsParaAccionDesdeFormularioTipoSexo(Boolean esParaAccionDesdeFormularioTipoSexo) {
		this.esParaAccionDesdeFormularioTipoSexo = esParaAccionDesdeFormularioTipoSexo;
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

			if(this.tiposexoSessionBean==null) {
				this.tiposexoSessionBean=new TipoSexoSessionBean();
			}

			if(!this.tiposexoSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {
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
					empresaLogic.getEntityWithConnection(tiposexoSessionBean.getlidEmpresaActual());
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

					if(this.tiposexo!=null) {
						this.tiposexo.setEmpresa(empresaTemp);
					}

					if(this.jInternalFrameDetalleFormTipoSexo!=null) {
						this.jInternalFrameDetalleFormTipoSexo.jComboBoxid_empresaTipoSexo.setSelectedItem(empresaTemp);
					}
				} else {
					//jComboBoxid_empresaTipoSexo.setSelectedItem(empresaTemp);
					if(this.jInternalFrameDetalleFormTipoSexo!=null) {
						if(this.jInternalFrameDetalleFormTipoSexo.jComboBoxid_empresaTipoSexo.getItemCount()>0) {
							this.jInternalFrameDetalleFormTipoSexo.jComboBoxid_empresaTipoSexo.setSelectedIndex(0);
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
	public void setActualEmpresaForeignKeyGenerico(Long idEmpresaSeleccionado,JComboBox jComboBoxid_empresaTipoSexoGenerico)throws Exception
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
				jComboBoxid_empresaTipoSexoGenerico.setSelectedItem(empresaTemp);
			} else {
				if(jComboBoxid_empresaTipoSexoGenerico!=null && jComboBoxid_empresaTipoSexoGenerico.getItemCount()>0) {
					jComboBoxid_empresaTipoSexoGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	
	
	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarEmpresaForeignKey(TipoSexo tiposexo,JComboBox jComboBoxid_empresaTipoSexoGenerico)throws Exception
	{
		try
		{
			Empresa  empresaAux=new Empresa();

			if(jComboBoxid_empresaTipoSexoGenerico==null) {
				empresaAux=(Empresa)this.jInternalFrameDetalleFormTipoSexo.jComboBoxid_empresaTipoSexo.getSelectedItem();
			} else {
				empresaAux=(Empresa)jComboBoxid_empresaTipoSexoGenerico.getSelectedItem();
			}

			if(empresaAux!=null && empresaAux.getId()!=null) {
				tiposexo.setid_empresa(empresaAux.getId());
				tiposexo.setempresa_descripcion(TipoSexoConstantesFunciones.getEmpresaDescripcion(empresaAux));
				tiposexo.setEmpresa(empresaAux);			}
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

					if(!TipoSexoJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormTipoSexo!=null) { 
							this.jInternalFrameDetalleFormTipoSexo.jComboBoxid_empresaTipoSexo.removeAllItems();

							for(Empresa empresa:this.empresasForeignKey) {
								this.jInternalFrameDetalleFormTipoSexo.jComboBoxid_empresaTipoSexo.addItem(empresa);
							}
						}
					}

					if(this.jInternalFrameDetalleFormTipoSexo!=null) { 
					}

					if(!TipoSexoJInternalFrame.ISBINDING_MANUAL) {
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
						if(this.jInternalFrameDetalleFormTipoSexo!=null) {
							this.jInternalFrameDetalleFormTipoSexo.jComboBoxid_empresaTipoSexo.setSelectedItem(empresa);
						}
					} else {
						if(this.jInternalFrameDetalleFormTipoSexo!=null) {
							this.jInternalFrameDetalleFormTipoSexo.jComboBoxid_empresaTipoSexo.setSelectedIndex(iIndexSelected);
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

	


	
	public void refrescarForeignKeysDescripcionesTipoSexo() throws Exception {
		//SI FUNCIONA DEEPLOAD ESTO VA AL ULTIMO
		if(Constantes.ISUSAEJBLOGICLAYER) {
			TipoSexoConstantesFunciones.refrescarForeignKeysDescripcionesTipoSexo(this.tiposexoLogic.getTipoSexos());
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			TipoSexoConstantesFunciones.refrescarForeignKeysDescripcionesTipoSexo(this.tiposexos);
		}
		
		/*
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		classes.add(new Classe(Empresa.class));
			
		if(Constantes.ISUSAEJBLOGICLAYER) {
			//USA LOS OBJETOS DE LOGIC DIRECTAMENTE
			//tiposexoLogic.setTipoSexos(this.tiposexos);
			tiposexoLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
	
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
		
	public TipoSexoParameterReturnGeneral getTipoSexoParameterGeneral() {
		return this.tiposexoParameterGeneral;
	}
	
	public void setTipoSexoParameterGeneral(TipoSexoParameterReturnGeneral tiposexoParameterGeneral) {
		this.tiposexoParameterGeneral = tiposexoParameterGeneral;
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
	
	public Boolean getIsPermisoTodoTipoSexo() {
		return isPermisoTodoTipoSexo;
	}

	public void setIsPermisoTodoTipoSexo(Boolean isPermisoTodoTipoSexo) {
		this.isPermisoTodoTipoSexo = isPermisoTodoTipoSexo;
	}

	public Boolean getIsPermisoNuevoTipoSexo() {
		return isPermisoNuevoTipoSexo;
	}

	public void setIsPermisoNuevoTipoSexo(Boolean isPermisoNuevoTipoSexo) {
		this.isPermisoNuevoTipoSexo = isPermisoNuevoTipoSexo;
	}

	public Boolean getIsPermisoActualizarTipoSexo() {
		return isPermisoActualizarTipoSexo;
	}

	public void setIsPermisoActualizarTipoSexo(Boolean isPermisoActualizarTipoSexo) {
		this.isPermisoActualizarTipoSexo = isPermisoActualizarTipoSexo;
	}

	public Boolean getIsPermisoEliminarTipoSexo() {
		return isPermisoEliminarTipoSexo;
	}

	public void setIsPermisoEliminarTipoSexo(Boolean isPermisoEliminarTipoSexo) {
		this.isPermisoEliminarTipoSexo = isPermisoEliminarTipoSexo;
	}

	public Boolean getIsPermisoGuardarCambiosTipoSexo() {
		return isPermisoGuardarCambiosTipoSexo;
	}

	public void setIsPermisoGuardarCambiosTipoSexo(Boolean isPermisoGuardarCambiosTipoSexo) {
		this.isPermisoGuardarCambiosTipoSexo = isPermisoGuardarCambiosTipoSexo;
	}
	
	public Boolean getIsPermisoConsultaTipoSexo() {
		return isPermisoConsultaTipoSexo;
	}

	public void setIsPermisoConsultaTipoSexo(Boolean isPermisoConsultaTipoSexo) {
		this.isPermisoConsultaTipoSexo = isPermisoConsultaTipoSexo;
	}

	public Boolean getIsPermisoBusquedaTipoSexo() {
		return isPermisoBusquedaTipoSexo;
	}

	public void setIsPermisoBusquedaTipoSexo(Boolean isPermisoBusquedaTipoSexo) {
		this.isPermisoBusquedaTipoSexo = isPermisoBusquedaTipoSexo;
	}

	public Boolean getIsPermisoReporteTipoSexo() {
		return isPermisoReporteTipoSexo;
	}

	public void setIsPermisoReporteTipoSexo(Boolean isPermisoReporteTipoSexo) {
		this.isPermisoReporteTipoSexo = isPermisoReporteTipoSexo;
	}
	
	public Boolean getIsPermisoPaginacionMedioTipoSexo() {
		return isPermisoPaginacionMedioTipoSexo;
	}

	public void setIsPermisoPaginacionMedioTipoSexo(Boolean isPermisoPaginacionMedioTipoSexo) {
		this.isPermisoPaginacionMedioTipoSexo = isPermisoPaginacionMedioTipoSexo;
	}
	
	public Boolean getIsPermisoPaginacionTodoTipoSexo() {
		return isPermisoPaginacionTodoTipoSexo;
	}

	public void setIsPermisoPaginacionTodoTipoSexo(Boolean isPermisoPaginacionTodoTipoSexo) {
		this.isPermisoPaginacionTodoTipoSexo = isPermisoPaginacionTodoTipoSexo;
	}
	
	public Boolean getIsPermisoPaginacionAltoTipoSexo() {
		return isPermisoPaginacionAltoTipoSexo;
	}

	public void setIsPermisoPaginacionAltoTipoSexo(Boolean isPermisoPaginacionAltoTipoSexo) {
		this.isPermisoPaginacionAltoTipoSexo = isPermisoPaginacionAltoTipoSexo;
	}
	
	public Boolean getIsPermisoCopiarTipoSexo() {
		return isPermisoCopiarTipoSexo;
	}

	public void setIsPermisoCopiarTipoSexo(Boolean isPermisoCopiarTipoSexo) {
		this.isPermisoCopiarTipoSexo = isPermisoCopiarTipoSexo;
	}
	
	public Boolean getIsPermisoVerFormTipoSexo() {
		return isPermisoVerFormTipoSexo;
	}

	public void setIsPermisoVerFormTipoSexo(Boolean isPermisoVerFormTipoSexo) {
		this.isPermisoVerFormTipoSexo = isPermisoVerFormTipoSexo;
	}
	
	public Boolean getIsPermisoDuplicarTipoSexo() {
		return isPermisoDuplicarTipoSexo;
	}

	public void setIsPermisoDuplicarTipoSexo(Boolean isPermisoDuplicarTipoSexo) {
		this.isPermisoDuplicarTipoSexo = isPermisoDuplicarTipoSexo;
	}
	
	public Boolean getIsPermisoOrdenTipoSexo() {
		return isPermisoOrdenTipoSexo;
	}

	public void setIsPermisoOrdenTipoSexo(Boolean isPermisoOrdenTipoSexo) {
		this.isPermisoOrdenTipoSexo = isPermisoOrdenTipoSexo;
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
	
	public Boolean getIsVisibilidadCeldaNuevoTipoSexo() {
		return isVisibilidadCeldaNuevoTipoSexo;
	}

	public void setIsVisibilidadCeldaNuevoTipoSexo(Boolean isVisibilidadCeldaNuevoTipoSexo) {
		this.isVisibilidadCeldaNuevoTipoSexo = isVisibilidadCeldaNuevoTipoSexo;
	}
	
	public Boolean getIsVisibilidadCeldaDuplicarTipoSexo() {
		return isVisibilidadCeldaDuplicarTipoSexo;
	}

	public void setIsVisibilidadCeldaDuplicarTipoSexo(Boolean isVisibilidadCeldaDuplicarTipoSexo) {
		this.isVisibilidadCeldaDuplicarTipoSexo = isVisibilidadCeldaDuplicarTipoSexo;
	}
	
	public Boolean getIsVisibilidadCeldaCopiarTipoSexo() {
		return isVisibilidadCeldaCopiarTipoSexo;
	}

	public void setIsVisibilidadCeldaCopiarTipoSexo(Boolean isVisibilidadCeldaCopiarTipoSexo) {
		this.isVisibilidadCeldaCopiarTipoSexo = isVisibilidadCeldaCopiarTipoSexo;
	}
	
	public Boolean getIsVisibilidadCeldaVerFormTipoSexo() {
		return isVisibilidadCeldaVerFormTipoSexo;
	}

	public void setIsVisibilidadCeldaVerFormTipoSexo(Boolean isVisibilidadCeldaVerFormTipoSexo) {
		this.isVisibilidadCeldaVerFormTipoSexo = isVisibilidadCeldaVerFormTipoSexo;
	}
	
	public Boolean getIsVisibilidadCeldaOrdenTipoSexo() {
		return isVisibilidadCeldaOrdenTipoSexo;
	}

	public void setIsVisibilidadCeldaOrdenTipoSexo(Boolean isVisibilidadCeldaOrdenTipoSexo) {
		this.isVisibilidadCeldaOrdenTipoSexo = isVisibilidadCeldaOrdenTipoSexo;
	}
	
	public Boolean getIsVisibilidadCeldaNuevoRelacionesTipoSexo() {
		return isVisibilidadCeldaNuevoRelacionesTipoSexo;
	}

	public void setIsVisibilidadCeldaNuevoRelacionesTipoSexo(Boolean isVisibilidadCeldaNuevoRelacionesTipoSexo) {
		this.isVisibilidadCeldaNuevoRelacionesTipoSexo = isVisibilidadCeldaNuevoRelacionesTipoSexo;
	}
	
	public Boolean getIsVisibilidadCeldaModificarTipoSexo() {
		return isVisibilidadCeldaModificarTipoSexo;
	}

	public void setIsVisibilidadCeldaModificarTipoSexo(Boolean isVisibilidadCeldaModificarTipoSexo) {
		this.isVisibilidadCeldaModificarTipoSexo = isVisibilidadCeldaModificarTipoSexo;
	}
	
	public Boolean getIsVisibilidadCeldaActualizarTipoSexo() {
		return isVisibilidadCeldaActualizarTipoSexo;
	}

	public void setIsVisibilidadCeldaActualizarTipoSexo(Boolean isVisibilidadCeldaActualizarTipoSexo) {
		this.isVisibilidadCeldaActualizarTipoSexo = isVisibilidadCeldaActualizarTipoSexo;
	}

	public Boolean getIsVisibilidadCeldaEliminarTipoSexo() {
		return isVisibilidadCeldaEliminarTipoSexo;
	}

	public void setIsVisibilidadCeldaEliminarTipoSexo(Boolean isVisibilidadCeldaEliminarTipoSexo) {
		this.isVisibilidadCeldaEliminarTipoSexo = isVisibilidadCeldaEliminarTipoSexo;
	}

	public Boolean getIsVisibilidadCeldaCancelarTipoSexo() {
		return isVisibilidadCeldaCancelarTipoSexo;
	}

	public void setIsVisibilidadCeldaCancelarTipoSexo(Boolean isVisibilidadCeldaCancelarTipoSexo) {
		this.isVisibilidadCeldaCancelarTipoSexo = isVisibilidadCeldaCancelarTipoSexo;
	}

	public Boolean getIsVisibilidadCeldaGuardarTipoSexo() {
		return isVisibilidadCeldaGuardarTipoSexo;
	}

	public void setIsVisibilidadCeldaGuardarTipoSexo(Boolean isVisibilidadCeldaGuardarTipoSexo) {
		this.isVisibilidadCeldaGuardarTipoSexo = isVisibilidadCeldaGuardarTipoSexo;
	}
	
	public Boolean getIsVisibilidadCeldaGuardarCambiosTipoSexo() {
		return isVisibilidadCeldaGuardarCambiosTipoSexo;
	}

	public void setIsVisibilidadCeldaGuardarCambiosTipoSexo(Boolean isVisibilidadCeldaGuardarCambiosTipoSexo) {
		this.isVisibilidadCeldaGuardarCambiosTipoSexo = isVisibilidadCeldaGuardarCambiosTipoSexo;
	}
		
	public TipoSexoSessionBean gettiposexoSessionBean() {
		return this.tiposexoSessionBean;
	}
	
	public void settiposexoSessionBean(TipoSexoSessionBean tiposexoSessionBean) {
		this.tiposexoSessionBean=tiposexoSessionBean;
	}
	
	
	public Boolean getisVisibilidadFK_IdEmpresa() {
		return this.isVisibilidadFK_IdEmpresa;
	}

	public void setisVisibilidadFK_IdEmpresa(Boolean isVisibilidadFK_IdEmpresa) {
		this.isVisibilidadFK_IdEmpresa=isVisibilidadFK_IdEmpresa;
	}

	
	
	public void setVariablesFormularioToObjetoActualForeignKeysTipoSexo(TipoSexo tiposexo)throws Exception {
		try {
			
				this.setActualParaGuardarEmpresaForeignKey(tiposexo,null);
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
	
	public void bugActualizarReferenciaActual(TipoSexo tiposexo,TipoSexo tiposexoAux) throws Exception {
		//ARCHITECTURE		
		//EL ID NEGATIVO GUARDADO EN ORIGINAL SIRVE PARA VERIFICAR Y ACTUALIZAR EL REGISTRO NUEVO (ID,VERSIONROW)
		this.setCamposBaseDesdeOriginalTipoSexo(tiposexo);
					
		//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
		tiposexoAux.setId(tiposexo.getId());
		tiposexoAux.setVersionRow(tiposexo.getVersionRow());					
	}
	
	public void ejecutarMantenimiento(MaintenanceType maintenanceType)throws Exception {	
		try	{								
			
			//this.startProcessTipoSexo();
		
			int intSelectedRow = this.jTableDatosTipoSexo.getSelectedRow();	       
			
			//PUEDE SER -1 CUANDO SE ELIMINA EN GUARDAR CAMBIOS
			if(intSelectedRow>=0 && maintenanceType!=MaintenanceType.GUARDARCAMBIOS) {
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
					
				//ARCHITECTURE
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tiposexo =(TipoSexo) this.tiposexoLogic.getTipoSexos().toArray()[this.jTableDatosTipoSexo.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
					this.tiposexo =(TipoSexo) this.tiposexos.toArray()[this.jTableDatosTipoSexo.convertRowIndexToModel(intSelectedRow)];
				}
				
				//ARCHITECTURE
				
				if(TipoSexoJInternalFrame.ISBINDING_MANUAL_TABLA) {
					//this.setVariablesFormularioToObjetoActualTipoSexo(this.tiposexo,true);
				}
				
				this.setVariablesFormularioToObjetoActualForeignKeysTipoSexo(this.tiposexo);
			}
			
			//LUEGO DE TRAER DATOS CORRESPONDIENTES QUE COINCIDA LISTA TABLA QUITO FILA TOTALES
			if(this.conTotales) {
				//MEJOR LO DEJO, SI EXISTE EXCEPCION SE PIEDE FILA TOTALES Y ORDEN INDICE FILA ACTUAL
				//this.quitarFilaTotales();
			}
			
			this.cargarDatosCliente();
			
			this.datosDeep=new DatosDeep();
			
			//SE CAMBIA ESTADOS CON ERROR, ENTONCES SE EJECUTA ANTES
			//this.invalidValues = tiposexoValidator.getInvalidValues(this.tiposexo);
			
			//if(this.invalidValues==null || this.invalidValues.length<=0) {
			
			tiposexoLogic.setDatosCliente(datosCliente);
			tiposexoLogic.setIsConDeep(false);
			
			if(maintenanceType==MaintenanceType.NUEVO) {
				tiposexoAux=new  TipoSexo();
				
				tiposexoAux.setIsNew(true);
				tiposexoAux.setIsChanged(true);
				
				tiposexoAux.setTipoSexoOriginal(this.tiposexo);
				
				tiposexoAux.setId(this.tiposexo.getId());	
				tiposexoAux.setVersionRow(this.tiposexo.getVersionRow());	
				tiposexoAux.setid_empresa(this.tiposexo.getid_empresa());	
				tiposexoAux.setcodigo(this.tiposexo.getcodigo());	
				tiposexoAux.setnombre(this.tiposexo.getnombre());	
								
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.tiposexoSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.tiposexoSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(tiposexoAux,tiposexoLogic.getTipoSexos());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(tiposexoAux,tiposexos);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote  && !this.tiposexoSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.tiposexoSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						tiposexoLogic.saveTipoSexos();//WithConnection
						//tiposexoLogic.getSetVersionRowTipoSexos();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE		
					
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.tiposexo,tiposexoAux);
					
					this.refrescarForeignKeysDescripcionesTipoSexo();
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.tiposexoSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
						}
						//ARCHITECTURE	
						
						if(!this.tiposexoSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE
												
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								tiposexoLogic.saveTipoSexoRelaciones(tiposexoAux);//WithConnection
								//tiposexoLogic.getSetVersionRowTipoSexos();//WithConnection
							} else if(Constantes.ISUSAEJBREMOTE) {
							} else if(Constantes.ISUSAEJBHOME) {
							}
							//ARCHITECTURE
							
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							this.bugActualizarReferenciaActual(this.tiposexo,tiposexoAux);
					
					
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE	
						} else {
							
							
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								if(this.tiposexoSessionBean.getEstaModoGuardarRelaciones() 
									|| this.tiposexoSessionBean.getEsGuardarRelacionado())	{
									actualizarLista(tiposexoAux,tiposexoLogic.getTipoSexos());
								}
							} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
								actualizarLista(tiposexoAux,tiposexos);
							}
							//ARCHITECTURE
							
							//AQUI EL ID NEGATIVO ES EL ID BUSCADO, YA QUE NO SE GENERA OTRO EN LA DB POR INGRESAR UNO NUEVO
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							//this.bugActualizarReferenciaActual(this.tiposexo,tiposexoAux);												
						}
					}
				}
			} else if(maintenanceType==MaintenanceType.ACTUALIZAR) {
				tiposexoAux=new  TipoSexo();
				
				//PUEDE QUE SE ACTUALIZE ALGUN REGISTRO NUEVO
				if(!this.tiposexoSessionBean.getEsGuardarRelacionado() 
					|| (this.tiposexoSessionBean.getEsGuardarRelacionado() && this.tiposexo.getId()>=0)) {
						
					tiposexoAux.setIsNew(false);
				}
				
				tiposexoAux.setIsDeleted(false);
			
				tiposexoAux.setId(this.tiposexo.getId());	
				tiposexoAux.setVersionRow(this.tiposexo.getVersionRow());	
				tiposexoAux.setid_empresa(this.tiposexo.getid_empresa());	
				tiposexoAux.setcodigo(this.tiposexo.getcodigo());	
				tiposexoAux.setnombre(this.tiposexo.getnombre());	
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(tiposexoAux,tiposexoLogic.getTipoSexos());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(tiposexoAux,tiposexos);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote && !this.tiposexoSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.tiposexoSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						tiposexoLogic.saveTipoSexos();//WithConnection
						//tiposexoLogic.getSetVersionRowTipoSexos();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}	
					//ARCHITECTURE
					
					//TALVEZ ESTA DEMAS POR SER UPDATE
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.tiposexo,tiposexoAux);
					
					this.refrescarForeignKeysDescripcionesTipoSexo();
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.tiposexoSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
						}
						//ARCHITECTURE
						
						if(!this.tiposexoSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								tiposexoLogic.saveTipoSexoRelaciones(tiposexoAux);//WithConnection
								//tiposexoLogic.getSetVersionRowTipoSexos();//WithConnection
							} else if(Constantes.ISUSAEJBREMOTE) {
							} else if(Constantes.ISUSAEJBHOME) {
							}
							//ARCHITECTURE
							
							//TALVEZ ESTA DEMAS POR SER UPDATE
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							this.bugActualizarReferenciaActual(this.tiposexo,tiposexoAux);
					
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE
						} else {
							
							
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								if(this.tiposexoSessionBean.getEstaModoGuardarRelaciones() 
									|| this.tiposexoSessionBean.getEsGuardarRelacionado())	{
									actualizarLista(tiposexoAux,tiposexoLogic.getTipoSexos());
								}
							} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
								actualizarLista(tiposexoAux,tiposexos);
							}
							//ARCHITECTURE
							
							//AQUI EL ID NEGATIVO ES EL ID BUSCADO, YA QUE NO SE GENERA OTRO EN LA DB POR INGRESAR UNO NUEVO							
							//TALVEZ ESTA DEMAS POR SER UPDATE
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							//this.bugActualizarReferenciaActual(this.tiposexo,tiposexoAux);
					
						}
					}
				}				
			} else if(maintenanceType==MaintenanceType.ELIMINAR) {
				tiposexoAux=new  TipoSexo();
				
				tiposexoAux.setIsNew(false);
				tiposexoAux.setIsChanged(false);
				
				tiposexoAux.setIsDeleted(true);
				
				tiposexoAux.setId(this.tiposexo.getId());	
				tiposexoAux.setVersionRow(this.tiposexo.getVersionRow());	
				tiposexoAux.setid_empresa(this.tiposexo.getid_empresa());	
				tiposexoAux.setcodigo(this.tiposexo.getcodigo());	
				tiposexoAux.setnombre(this.tiposexo.getnombre());	
				
				if(this.tiposexoSessionBean.getEsGuardarRelacionado()) {
					//ELEMENTO ACTUAL NO SE HA INGRESADO AL SISTEMA, NO SE PUEDE ELIMINAR ALGO QUE NO EXISTE
					if(this.tiposexoAux.getId()>=0) {	
						this.tiposexosEliminados.add(tiposexoAux);											
					}
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					actualizarLista(tiposexoAux,tiposexoLogic.getTipoSexos());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(tiposexoAux,tiposexos);
				}
				//ARCHITECTURE
				
				
				if(!isGuardarCambiosEnLote && !this.tiposexoSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.tiposexoSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						tiposexoLogic.saveTipoSexos();//WithConnection
						//tiposexoLogic.getSetVersionRowTipoSexos();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}	
					//ARCHITECTURE
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.tiposexoSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
						}
						//ARCHITECTURE
						
						
						if(!this.tiposexoSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								tiposexoLogic.saveTipoSexoRelaciones(tiposexoAux);//WithConnection
								//tiposexoLogic.getSetVersionRowTipoSexos();//WithConnection
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
							if(this.tiposexoSessionBean.getEstaModoGuardarRelaciones() 
								|| this.tiposexoSessionBean.getEsGuardarRelacionado())	{
								actualizarLista(tiposexoAux,tiposexoLogic.getTipoSexos());
							}
						} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
							actualizarLista(tiposexoAux,tiposexos);
						}
						//ARCHITECTURE
					}
				}				
			} else if(maintenanceType==MaintenanceType.GUARDARCAMBIOS) {		
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tiposexoLogic.getTipoSexos().addAll(this.tiposexosEliminados);
					
					tiposexoLogic.saveTipoSexos();//WithConnection
					//tiposexoLogic.getSetVersionRowTipoSexos();//WithConnection
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}	
				//ARCHITECTURE
				this.refrescarForeignKeysDescripcionesTipoSexo();
				
				this.tiposexosEliminados= new ArrayList<TipoSexo>();		
			}
			
			if(this.tiposexoSessionBean.getEsGuardarRelacionado()) {
				 this.crearFilaTotales();
			}
			
			
									
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tiposexoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				if(!this.isPostAccionSinMensaje) {
					JOptionPane.showMessageDialog(this,"Tipo Sexo GUARDADO CORRECTAMENTE","MANTENIMIENTO DE Tipo Sexo",JOptionPane.INFORMATION_MESSAGE);
					if(maintenanceType==MaintenanceType.NUEVO || maintenanceType==MaintenanceType.ACTUALIZAR) {
						//CUANDO ES NUEVO SE PIERDE REFERENCIA NO SE PORQUE
						this.tiposexo=tiposexoAux;
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
      		//this.finishProcessTipoSexo();
      	}
		
	}	
	
	public void actualizarRelaciones(TipoSexo tiposexoLocal) throws Exception {
		
		if(this.tiposexoSessionBean.getConGuardarRelaciones()) {			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
			
			
			} else {
				
			}
		}
	}
	
	public void actualizarRelacionFkPadreActual(TipoSexo tiposexoLocal) throws Exception {	
		if(this.tiposexoSessionBean.getEsGuardarRelacionado()) {			
			
		
			if(this.jInternalFrameParent.getClass().equals(EmpresaDetalleFormJInternalFrame.class)) {
				EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrameLocal=(EmpresaBeanSwingJInternalFrame) ((EmpresaDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				empresaBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoEmpresa(empresaBeanSwingJInternalFrameLocal.getempresa(),true);
				empresaBeanSwingJInternalFrameLocal.actualizarLista(empresaBeanSwingJInternalFrameLocal.empresa,this.empresasForeignKey);

				empresaBeanSwingJInternalFrameLocal.actualizarRelaciones(empresaBeanSwingJInternalFrameLocal.empresa);

				tiposexoLocal.setEmpresa(empresaBeanSwingJInternalFrameLocal.empresa);

				this.addItemDefectoCombosForeignKeyEmpresa();
				this.cargarCombosFrameEmpresasForeignKey("Formulario");
				this.setActualEmpresaForeignKey(empresaBeanSwingJInternalFrameLocal.empresa.getId(),false,"Formulario");
			}
		
		}
	}
	
	public Boolean validarTipoSexoActual() throws Exception {
		Boolean estaValidado=false;
		this.inicializarInvalidValues();
		
		/*
		int intSelectedRow = this.jTableDatosTipoSexo.getSelectedRow();
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.tiposexo =(TipoSexo) this.tiposexoLogic.getTipoSexos().toArray()[this.jTableDatosTipoSexo.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
			this.tiposexo =(TipoSexo) this.tiposexos.toArray()[this.jTableDatosTipoSexo.convertRowIndexToModel(intSelectedRow)];
		}
		//ARCHITECTURE
		*/
		
		this.invalidValues = tiposexoValidator.getInvalidValues(this.tiposexo);
					
		if(this.invalidValues==null || this.invalidValues.length<=0) {
			estaValidado=true;
		} else {
			this.mostrarInvalidValues();	
		}
		
		return estaValidado;
	}
	
	public void actualizarLista(TipoSexo tiposexo,List<TipoSexo> tiposexos) throws Exception {
		try	{		
			TipoSexoConstantesFunciones.actualizarLista(tiposexo,tiposexos,this.tiposexoSessionBean.getEsGuardarRelacionado());		
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void actualizarSelectedLista(TipoSexo tiposexo,List<TipoSexo> tiposexos) throws Exception {
		try	{			
			TipoSexoConstantesFunciones.actualizarSelectedLista(tiposexo,tiposexos);
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public Boolean tieneElementosSeleccionados() throws Exception {
		Boolean tiene=false;
		
		List<TipoSexo> tiposexosLocal=null;
		
		try	{			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				tiposexosLocal=this.tiposexoLogic.getTipoSexos();
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				tiposexosLocal=this.tiposexos;
			}
			//ARCHITECTURE
		
			for(TipoSexo tiposexoLocal:tiposexosLocal) {
				if(this.permiteMantenimiento(tiposexoLocal) && tiposexoLocal.getIsSelected()) {
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
			sMensaje+="\r\n"+TipoSexoConstantesFunciones.getTipoSexoLabelDesdeNombre(invalidValue.getPropertyName())+"->"+invalidValue.getMessage();
			
			//MOSTRAR CAMPOS INVALIDOS
			if(invalidValue.getPropertyName().equals(TipoSexoConstantesFunciones.IDEMPRESA)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTipoSexo.jLabelid_empresaTipoSexo,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(TipoSexoConstantesFunciones.CODIGO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTipoSexo.jLabelcodigoTipoSexo,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(TipoSexoConstantesFunciones.NOMBRE)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTipoSexo.jLabelnombreTipoSexo,invalidValue.getMessage());}
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
		
		if(this.jInternalFrameDetalleFormTipoSexo!=null) {
		
		//MOSTRAR CAMPOS INVALIDOS
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormTipoSexo.jLabelid_empresaTipoSexo,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormTipoSexo.jLabelcodigoTipoSexo,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormTipoSexo.jLabelnombreTipoSexo,"");
		
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
		this.iIdNuevoTipoSexo--;	
		
		
		this.tiposexoAux=new TipoSexo();
		
		this.tiposexoAux.setId(this.iIdNuevoTipoSexo);
		this.tiposexoAux.setIsChanged(true);
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.tiposexoLogic.getTipoSexos().add(this.tiposexoAux);
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.tiposexos.add(this.tiposexoAux);
		}
		//ARCHITECTURE
		
		this.tiposexo=this.tiposexoAux;
		
		if(TipoSexoJInternalFrame.ISBINDING_MANUAL_TABLA) {
			this.setVariablesObjetoActualToFormularioTipoSexo(this.tiposexo);
			this.setVariablesObjetoActualToFormularioForeignKeyTipoSexo(this.tiposexo);
		}
				
		//this.setDefaultControlesTipoSexo();
		
		this.inicializarInvalidValues();
				
		//SELECCIONA ITEM DEFECTO-->SET O SELECTED INDEX
		this.setItemDefectoCombosForeignKeyTipoSexo();
		
		
		//INICIALIZA VARIABLES COMBOS GLOBALES A FORMULARIO(ParametroGeneralUsuario)
		this.setVariablesGlobalesCombosForeignKeyTipoSexo();
		
		//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
		//this.setVariablesGlobalesAuxiliaresCombosForeignKeyTipoSexo();
		
		//SI TIENE FOREIGN KEY CON CAMPO esDefecto=true, SE ACTUALIZA A OBJETO ACTUAL
		this.setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualTipoSexo(this.tiposexoBean,this.tiposexo,false,false);
		
		//ACTUALIZA VALORES PARA EL OBJETO ACTUAL ANTES DE ENVIARLO A ACTUALIZAR
		this.setVariablesFormularioToObjetoActualForeignKeysTipoSexo(this.tiposexo);
				
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		if(this.jInternalFrameParent!=null) {
			this.jInternalFrameParent.actualizarObjetoPadreFk(TipoSexoConstantesFunciones.CLASSNAME);
		}	
		
		
		if(this.tiposexoSessionBean.getConGuardarRelaciones()) {
			classes=TipoSexoConstantesFunciones.getClassesRelationshipsOfTipoSexo(new ArrayList<Classe>(),DeepLoadType.NONE);
		}
		
		this.classesActual=new ArrayList<Classe>();
		this.classesActual.addAll(classes);
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {						
			this.tiposexoReturnGeneral=tiposexoLogic.procesarEventosTipoSexosWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,EventoGlobalTipo.FORM_RECARGAR,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.tiposexoLogic.getTipoSexos(),this.tiposexo,this.tiposexoParameterGeneral,this.isEsNuevoTipoSexo,classes);//this.tiposexoLogic.getTipoSexo()
						
		} else if(Constantes.ISUSAEJBREMOTE) {
						
		} else if(Constantes.ISUSAEJBHOME) {
		}
		//ARCHITECTURE
		
		//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
		//this.setVariablesObjetoReturnGeneralToBeanTipoSexo(this.tiposexoReturnGeneral,this.tiposexoBean,false);
		
		if(this.tiposexoReturnGeneral.getConRecargarPropiedades()) {
			//INICIALIZA VARIABLES COMBOS NORMALES (FK)
			this.setVariablesObjetoActualToFormularioForeignKeyTipoSexo(this.tiposexoReturnGeneral.getTipoSexo());
			
			//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
			this.setVariablesObjetoActualToFormularioTipoSexo(this.tiposexoReturnGeneral.getTipoSexo());
		}
		
		if(this.tiposexoReturnGeneral.getConRecargarRelaciones()) {
			//INICIALIZA VARIABLES RELACIONES A FORMULARIO
			this.setVariablesRelacionesObjetoActualToFormularioTipoSexo(this.tiposexoReturnGeneral.getTipoSexo(),classes);//this.tiposexoBean);	
		}
			
		//ACTUALIZA VARIABLES FORMULARIO A OBJETO ACTUAL (PARA NUEVO TABLA O GUARDAR CAMBIOS
		if(esNuevoGuardarCambios) {
			this.setVariablesFormularioToObjetoActualTipoSexo(this.tiposexo,false);
		}
		
		//INICIALIZA VARIABLES COMBOS DEFAULT DEL PROYECTO(|DEFAULT para FK)
		//this.setVariablesDefaultCombosForeignKeyTipoSexo();
		
		//INICIALIZA VARIABLES COMBOS PARAMETRO DEL PROYECTO(|VALORPARAM Era para ParametroModulo, ahora en logic)
		//this.setVariablesParametroCombosForeignKeyTipoSexo();						
		
		if(!esNuevoGuardarCambios) {
			//INICIALIZA VARIABLES POR OPCION MENU
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			TipoSexoBeanSwingJInternalFrameAdditional.RecargarFormTipoSexo(this,"NUEVO_PREPARAR","",this.arrDatoGeneral);
		
			//NO FUNCIONA BINDINGS			
			this.inicializarActualizarBindingTipoSexo(false);
						
			if(tiposexoSessionBean.getConGuardarRelaciones()) {
				//DEBERIA YA ESTAR CARGADO LOS COMBOS Y SI SE NECESITA ALGO MAS SE DEBE CREAR FUNCION LIMITADA
				//SI DEBE TRAER Y RESETEAR TABLA
								
			}
				
			//SI ES MANUAL
			if(TipoSexoJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualTipoSexo();
			}
			
			this.actualizarVisualTableDatosTipoSexo();
			
			this.jTableDatosTipoSexo.setRowSelectionInterval(this.getIndiceNuevoTipoSexo(), this.getIndiceNuevoTipoSexo());
			
			this.seleccionarFilaTablaTipoSexoActual();
						
			this.actualizarEstadoCeldasBotonesTipoSexo("a", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		}		
	}
	
	public void habilitarDeshabilitarControlesTipoSexo(Boolean isHabilitar) throws Exception {
		
		this.jInternalFrameDetalleFormTipoSexo.jTextFieldcodigoTipoSexo.setEnabled(isHabilitar && this.tiposexoConstantesFunciones.activarcodigoTipoSexo);
		this.jInternalFrameDetalleFormTipoSexo.jTextAreanombreTipoSexo.setEnabled(isHabilitar && this.tiposexoConstantesFunciones.activarnombreTipoSexo);	
		//
		this.jInternalFrameDetalleFormTipoSexo.jComboBoxid_empresaTipoSexo.setEnabled(isHabilitar && this.tiposexoConstantesFunciones.activarid_empresaTipoSexo);
	};
	
	public void setDefaultControlesTipoSexo() throws Exception {
			
	};
	
	
	public void habilitarDeshabilitarTipoMantenimientoTipoSexo(Boolean esRelaciones) throws Exception {
		if(esRelaciones) {
			//this.tiposexoSessionBean.setConGuardarRelaciones(true);			
			this.tiposexoSessionBean.setEstaModoGuardarRelaciones(true);				
			this.jInternalFrameDetalleFormTipoSexo.jTabbedPaneRelacionesTipoSexo.setVisible(true);
			
					
		} else {
			//this.tiposexoSessionBean.setConGuardarRelaciones(false);			
			this.tiposexoSessionBean.setEstaModoGuardarRelaciones(false);						
			this.jInternalFrameDetalleFormTipoSexo.jTabbedPaneRelacionesTipoSexo.setVisible(false);
			
			
		}
	};
	
	public int getIndiceNuevoTipoSexo() throws Exception {
		int iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(TipoSexo tiposexoAux:this.tiposexoLogic.getTipoSexos()) {
				if(tiposexoAux.getId().equals(this.iIdNuevoTipoSexo)) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(TipoSexo tiposexoAux:this.tiposexos) {
				if(tiposexoAux.getId().equals(this.iIdNuevoTipoSexo)) {
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
	
	public int getIndiceActualTipoSexo(TipoSexo tiposexo,Integer iIndiceActual) throws Exception {
		Integer iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(TipoSexo tiposexoAux:this.tiposexoLogic.getTipoSexos()) {
				if(tiposexoAux.getId().equals(tiposexo.getId())) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(TipoSexo tiposexoAux:this.tiposexos) {
				if(tiposexoAux.getId().equals(tiposexo.getId())) {
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
	
	public void setCamposBaseDesdeOriginalTipoSexo(TipoSexo tiposexoOriginal) throws Exception {
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(TipoSexo tiposexoAux:this.tiposexoLogic.getTipoSexos()) {
				if(tiposexoAux.getTipoSexoOriginal().getId().equals(tiposexoOriginal.getId())) {
					existe=true;
					tiposexoOriginal.setId(tiposexoAux.getId());
					tiposexoOriginal.setVersionRow(tiposexoAux.getVersionRow());
					break;
				}
				
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(TipoSexo tiposexoAux:this.tiposexos) {
				if(tiposexoAux.getTipoSexoOriginal().getId().equals(tiposexoOriginal.getId())) {
					existe=true;
					tiposexoOriginal.setId(tiposexoAux.getId());
					tiposexoOriginal.setVersionRow(tiposexoAux.getVersionRow());
					break;
				}				
			}
		}
		//ARCHITECTURE
		
		if(!existe) {
			//SI NO EXISTE TOMA LA ULTIMA FILA
		}
	}
	
	public void cancelarNuevosTipoSexo(Boolean esParaCancelar) throws Exception {
		tiposexosAux=new ArrayList<TipoSexo>();
		tiposexoAux=new TipoSexo();
		
		if(!this.tiposexoSessionBean.getEsGuardarRelacionado()) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(TipoSexo tiposexoAux:this.tiposexoLogic.getTipoSexos()) {
					if(tiposexoAux.getId()<0) {
						tiposexosAux.add(tiposexoAux);
					}		
				}
				this.iIdNuevoTipoSexo=0L;
				this.tiposexoLogic.getTipoSexos().removeAll(tiposexosAux);
					
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(TipoSexo tiposexoAux:this.tiposexos) {
					if(tiposexoAux.getId()<0) {
						tiposexosAux.add(tiposexoAux);
					}		
				}
				this.iIdNuevoTipoSexo=0L;
				this.tiposexos.removeAll(tiposexosAux);
			}	
		} else {			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				if(esParaCancelar && this.isEsNuevoTipoSexo 
					&& this.tiposexoLogic.getTipoSexos().size()>0
					) {
					tiposexoAux=this.tiposexoLogic.getTipoSexos().get(this.tiposexoLogic.getTipoSexos().size() - 1);
				
					if(tiposexoAux.getId()<0) {
						this.tiposexoLogic.getTipoSexos().remove(tiposexoAux);
					}
				}
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				if(esParaCancelar && this.isEsNuevoTipoSexo && this.tiposexos.size()>0) {
					tiposexoAux=this.tiposexos.get(this.tiposexos.size() - 1);
				
					if(tiposexoAux.getId()<0) {
						this.tiposexos.remove(tiposexoAux);
					}
				}
			}	
		}
	}
	
	public void cancelarNuevoTipoSexo(Boolean esParaCancelar) throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			if(tiposexo.getId()<0) {
				this.tiposexoLogic.getTipoSexos().remove(this.tiposexo);
			}					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			if(tiposexo.getId()<0) {
				this.tiposexos.remove(this.tiposexo);
			}
		}			
	}
	
	public void setEstadosInicialesTipoSexo(List<TipoSexo> tiposexosAux) throws Exception {
		TipoSexoConstantesFunciones.setEstadosInicialesTipoSexo(tiposexosAux);
	}
	
	public void setEstadosInicialesTipoSexo(TipoSexo tiposexoAux) throws Exception {
		TipoSexoConstantesFunciones.setEstadosInicialesTipoSexo(tiposexoAux);		
	}
	
	public void nuevo() throws Exception {
		try	{
			//ESTA VALIDADO EN FUNCION ACTUALIZAR
			//if(this.validarTipoSexoActual()) {
				this.ejecutarMantenimiento(MaintenanceType.NUEVO);
				
				this.actualizarEstadoCeldasBotonesTipoSexo("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
				
			//}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoSexoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void actualizar() throws Exception {
		try	{
			if(this.validarTipoSexoActual()) {
				if(!this.isEsNuevoTipoSexo) {
					this.ejecutarMantenimiento(MaintenanceType.ACTUALIZAR);
					
					this.actualizarEstadoCeldasBotonesTipoSexo("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
					
				} else {					
					this.nuevo();
					this.isEsNuevoTipoSexo=false;
				}
				
				//SE CANCELA AL FINAL DEL PROCESO JBUTTONACTUALIZAR
				//this.cancelar(false);
			}		
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoSexoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void eliminar() throws Exception {
		try	{	
			if(this.validarTipoSexoActual()) {
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE ELIMINAR EL/LA Tipo Sexo ?", "MANTENIMIENTO DE Tipo Sexo", JOptionPane.OK_CANCEL_OPTION) == 0) {
					this.ejecutarMantenimiento(MaintenanceType.ELIMINAR);			
					this.actualizarEstadoCeldasBotonesTipoSexo("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
				}
			
			}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoSexoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void guardarCambios() throws Exception {
		try	{
			this.ejecutarMantenimiento(MaintenanceType.GUARDARCAMBIOS);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoSexoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarAsignar(TipoSexo tiposexo) throws Exception {
		TipoSexoConstantesFunciones.seleccionarAsignar(this.tiposexo,tiposexo);
	}
	
	public void seleccionar() throws Exception {
		try	{
			//ACTUALIZO EL PERMISO ACTUALIZAR CON EL PERMISO ACTUALIZAR ORIGINAL ESTE PERMISO SE UTILIZA PARA EL NUEVO TAMBIEN
			this.isPermisoActualizarTipoSexo=this.isPermisoActualizarOriginalTipoSexo;
			
			
			this.seleccionarAsignar(tiposexo);
			
			
			
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			TipoSexoConstantesFunciones.quitarEspaciosTipoSexo(this.tiposexo,this.arrDatoGeneral);
			
			
			this.actualizarEstadoCeldasBotonesTipoSexo("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoSexoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarBusqueda(Long id) throws Exception {
		try	{
			this.tiposexoSessionBean.setsFuncionBusquedaRapida(this.tiposexoSessionBean.getsFuncionBusquedaRapida().replace("TO_REPLACE", id.toString()));
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoSexoConstantesFunciones.CLASSNAME);
		}
	}
	
	
	
	public void cancelar() throws Exception {
		this.cancelar(true);
	}
	
	public void cancelar(Boolean esParaCancelar) throws Exception {
		try {
														
			
			//SE UTILIZA COLUMNA ELIMINAR EN TABLA
			if(this.isEsNuevoTipoSexo) {
				//NO CANCELA TODOS NUEVOS POR FUNCIONALIDAD GUARDAR CAMBIOS
				//this.cancelarNuevosTipoSexo(esParaCancelar);				
				this.cancelarNuevoTipoSexo(esParaCancelar);								
			}
			
			this.tiposexo=new TipoSexo();
			
			this.inicializarTipoSexo();
			
			this.actualizarEstadoCeldasBotonesTipoSexo("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoSexoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void inicializarTipoSexo() throws Exception {
		try {
			TipoSexoConstantesFunciones.inicializarTipoSexo(this.tiposexo);
			
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
			FuncionesSwing.manageException(this, e,logger,TipoSexoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void siguientes()throws Exception {
		try	{			
			if(this.tiposexoLogic.getTipoSexos().size()>0) {
					
				this.iNumeroPaginacionPagina=this.iNumeroPaginacionPagina+this.iNumeroPaginacion;
			}
				
			this.procesarBusqueda(this.sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoSexoConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void generarReporteTipoSexos(String sAccionBusqueda,List<TipoSexo> tiposexosParaReportes) throws Exception {
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
					sPathReporteFinal="TipoSexo"+this.sTipoReporteExtra+"Design.jasper";
					reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);	
				} else {
					sPathReporteFinal=this.sPathReporteDinamico;
					reportFile = new FileInputStream(sPathReporteFinal);
				}
			} else {
				sPathReporteFinal="TipoSexoMasterRelaciones"+this.sTipoReporteExtra+"Design.jasper";
				reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);
				//sPathReportes=reportFile.getPath().replace("TipoSexoMasterRelacionesDesign.jasper", "");
			}
		} else {
				sPathReporteFinal="TipoSexo"+this.sTipoReporteExtra+"Design.jasper";
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
		parameters.put("subtitulo", "Reporte De  Tipo Sexos");		
		parameters.put("busquedapor", TipoSexoConstantesFunciones.getNombreIndice(sAccionBusqueda)+sDetalleReporte);
		
		
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
		
		JRBeanArrayDataSource jrbeanArrayDataSourceTipoSexo=null;
		
		if(this.sTipoReporteExtra!=null && !this.sTipoReporteExtra.equals("")) {
			TipoSexoConstantesFunciones.S_TIPOREPORTE_EXTRA=this.sTipoReporteExtra;
		} else {
			TipoSexoConstantesFunciones.S_TIPOREPORTE_EXTRA="";
		}
		
		jrbeanArrayDataSourceTipoSexo=new JRBeanArrayDataSource(TipoSexoJInternalFrame.TraerTipoSexoBeans(tiposexosParaReportes,classes).toArray());
		
		jasperPrint = JasperFillManager.fillReport(jasperReport,parameters,jrbeanArrayDataSourceTipoSexo);
				
		
		String sPathDest=Constantes.SUNIDAD_ARCHIVOS+":/"+Constantes.SCONTEXTSERVER+"/"+TipoSexoConstantesFunciones.SCHEMA+"/reportes";
		
		File filePathDest = new File(sPathDest);
		
		if(!filePathDest.exists()) {
			filePathDest.mkdirs();				
		}
				
		String sDestFileName=sPathDest+"/"+TipoSexoConstantesFunciones.CLASSNAME;
				
		if(this.sTipoArchivoReporte=="VISUALIZAR") {
			JasperViewer jasperViewer = new JasperViewer(jasperPrint,false) ;
			jasperViewer.setVisible(true) ; 

		} else if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML") {	
			//JasperFillManager.fillReportToFile(reportFile.getAbsolutePath(),parameters, new JRBeanArrayDataSource(TipoSexoBean.TraerTipoSexoBeans(tiposexosParaReportes).toArray()));
							
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
				this.generarExcelReporteTipoSexos(sAccionBusqueda,sTipoArchivoReporte,tiposexosParaReportes);
			
			} else if(this.sTipoReporte.equals("FORMULARIO")){
				this.generarExcelReporteVerticalTipoSexos(sAccionBusqueda,sTipoArchivoReporte,tiposexosParaReportes,false);
			
			} else if(this.sTipoReporte.equals("DINAMICO")){
				
				if(this.sTipoReporteDinamico.equals("NORMAL")) {
					
					this.jButtonGenerarExcelReporteDinamicoTipoSexoActionPerformed(null);
					//this.generarExcelReporteTipoSexos(sAccionBusqueda,sTipoArchivoReporte,tiposexosParaReportes);
					
				
				} else if(this.sTipoReporteDinamico.equals("FORMULARIO")){
					this.generarExcelReporteVerticalTipoSexos(sAccionBusqueda,sTipoArchivoReporte,tiposexosParaReportes,true);
				
				} else if(this.sTipoReporteDinamico.equals("RELACIONES")){
					this.generarExcelReporteRelacionesTipoSexos(sAccionBusqueda,sTipoArchivoReporte,tiposexosParaReportes,true);
				}
				
			} else if(this.sTipoReporte.equals("RELACIONES")){
				this.generarExcelReporteRelacionesTipoSexos(sAccionBusqueda,sTipoArchivoReporte,tiposexosParaReportes,false);
			}
		}
		
		if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML"||this.sTipoArchivoReporte=="WORD"||this.sTipoArchivoReporte=="EXCEL") {				
			JOptionPane.showMessageDialog(this,"REPORTE "+sDestFileName+" GENERADO SATISFACTORIAMENTE","REPORTES ",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteTipoSexos(String sAccionBusqueda,String sTipoArchivoReporte,List<TipoSexo> tiposexosParaReportes) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tiposexo";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("TipoSexos");
         
        int iRow = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderTipoSexo("NORMAL",row,workbook);
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux=null;
		
		int i=0;
		
      	for(TipoSexo tiposexo : tiposexosParaReportes) {            
			row = sheet.createRow(iRow++);
			iCell = 0;
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				cellStyleDataAux=cellStyleData;
			}
			
			TipoSexoConstantesFunciones.generarExcelReporteDataTipoSexo("NORMAL",row,workbook,tiposexo,cellStyleDataAux);
		
			
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
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tiposexoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Sexo",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteHeaderTipoSexo(String sTipo,Row row,Workbook workbook) {
		
		TipoSexoConstantesFunciones.generarExcelReporteHeaderTipoSexo(sTipo,row,workbook);
		
		/*
		Cell cell=null;
		int iCell=0;
		
		CellStyle cellStyle = workbook.createCellStyle();
		cellStyle.setFillBackgroundColor(IndexedColors.GREEN.getIndex());
		cellStyle.setFillPattern(CellStyle.ALIGN_FILL);
		*/
		
	}
	
	public void generarExcelReporteVerticalTipoSexos(String sAccionBusqueda,String sTipoArchivoReporte,List<TipoSexo> tiposexosParaReportes,Boolean paraDinamico) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tiposexo_vertical";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("TipoSexos");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		CellStyle cellStyle = Funciones2.getStyleTitulo(workbook,"ZEBRA");;
		
		CellStyle cellStyleTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL_VERTICAL");
		
		
		for(TipoSexo tiposexo : tiposexosParaReportes) {
			row = sheet.createRow(iRow++);
			iRowLast=iRow - 1;
			
			cell = row.createCell(0);
			cell.setCellValue(TipoSexoConstantesFunciones.getTipoSexoDescripcion(tiposexo));
			cell.setCellStyle(cellStyleTitulo);
			
			sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
	
			


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(TipoSexoConstantesFunciones.LABEL_IDEMPRESA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(TipoSexoConstantesFunciones.LABEL_IDEMPRESA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(tiposexo.getempresa_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(TipoSexoConstantesFunciones.LABEL_CODIGO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(TipoSexoConstantesFunciones.LABEL_CODIGO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(tiposexo.getcodigo());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(TipoSexoConstantesFunciones.LABEL_NOMBRE))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(TipoSexoConstantesFunciones.LABEL_NOMBRE);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(tiposexo.getnombre());


			}						
        }
        
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tiposexoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Sexo",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteRelacionesTipoSexos(String sAccionBusqueda,String sTipoArchivoReporte,List<TipoSexo> tiposexosParaReportes,Boolean paraDinamico) throws Exception {
		
		ArrayList<Classe> classes=new ArrayList<Classe>();
		List<TipoSexo> tiposexosRespaldo=null;
		
		classes=TipoSexoConstantesFunciones.getClassesRelationshipsOfTipoSexo(new ArrayList<Classe>(),DeepLoadType.NONE,false);
					
		this.datosDeep=new DatosDeep();
		
		this.datosDeep.setIsDeep(false);
		this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
		this.datosDeep.setClases(classes);
			
		this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
		this.datosCliente.setIsConDeep(true);	
		this.datosCliente.setIsConExportar(false);
		
						
		this.tiposexoLogic.setDatosCliente(this.datosCliente);
		this.tiposexoLogic.setDatosDeep(this.datosDeep);
		this.tiposexoLogic.setIsConDeep(true);
		
		tiposexosRespaldo=this.tiposexoLogic.getTipoSexos();
		
		this.tiposexoLogic.setTipoSexos(tiposexosParaReportes);	
		this.tiposexoLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
		
		tiposexosParaReportes=this.tiposexoLogic.getTipoSexos();
		this.tiposexoLogic.setTipoSexos(tiposexosRespaldo);
		
		
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tiposexo_relacion";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("TipoSexos");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderTipoSexo("NORMAL",row,workbook);
		
		int i=0;
		int i2=0;
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL");
		CellStyle cellStyleDataZebra = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux =null;
		CellStyle cellStyleDataAuxHijo =null;
		
		for(TipoSexo tiposexo : tiposexosParaReportes) {			
			if(i!=0) {
				row = sheet.createRow(iRow++);				
				this.generarExcelReporteHeaderTipoSexo("NORMAL",row,workbook);
			}
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				//cellStyleDataAux=cellStyleData;
			}
			
			row = sheet.createRow(iRow++);						
			TipoSexoConstantesFunciones.generarExcelReporteDataTipoSexo("NORMAL",row,workbook,tiposexo,cellStyleDataAux);
		
			
			
			
			i++;
        }
        
		/*
		row = sheet.createRow(iRow++);
		iRowLast=iRow - 1;
			
		cell = row.createCell(0);
		cell.setCellValue(TipoSexoConstantesFunciones.getTipoSexoDescripcion(tiposexo));
		cell.setCellStyle(cellStyleTitulo);
			
		sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
		*/
		
			
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tiposexoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Sexo",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	
	public Boolean existeColumnaReporteDinamico(String sColumna) {
		Boolean existe=false;
		
		Reporte reporte=new Reporte();
		
		
		for(int index:this.jInternalFrameReporteDinamicoTipoSexo.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoTipoSexo.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
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
		
		
		for(int index:this.jInternalFrameReporteDinamicoTipoSexo.getjListRelacionesSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoTipoSexo.getjListRelacionesSelectReporte().getModel().getElementAt(index);
			
			if(sColumna.equals(reporte.getsCodigo())) {
				existe=true;
				break;
			}
		
		}
		
		
		return existe;
	}
	
	public void startProcessTipoSexo() throws Exception {		
		this.startProcessTipoSexo(true);
	}
	
	public void startProcessTipoSexo(Boolean conSplash) throws Exception {		
		//FuncionesSwing.enableDisablePanels(false,this.jTabbedPaneBusquedasTipoSexo ,this.jPanelParametrosReportesTipoSexo, this.jScrollPanelDatosTipoSexo,this.jPanelPaginacionTipoSexo, this.jScrollPanelDatosEdicionTipoSexo, this.jPanelAccionesTipoSexo,this.jPanelAccionesFormularioTipoSexo,this.jmenuBarTipoSexo,this.jmenuBarDetalleTipoSexo,this.jTtoolBarTipoSexo,this.jTtoolBarDetalleTipoSexo);		
		
		final JTabbedPane jTabbedPaneBusquedasTipoSexo=this.jTabbedPaneBusquedasTipoSexo; 
		
		final JPanel jPanelParametrosReportesTipoSexo=this.jPanelParametrosReportesTipoSexo;
		//final JScrollPane jScrollPanelDatosTipoSexo=this.jScrollPanelDatosTipoSexo;
		final JTable jTableDatosTipoSexo=this.jTableDatosTipoSexo;		
		final JPanel jPanelPaginacionTipoSexo=this.jPanelPaginacionTipoSexo;
		//final JScrollPane jScrollPanelDatosEdicionTipoSexo=this.jScrollPanelDatosEdicionTipoSexo;
		final JPanel jPanelAccionesTipoSexo=this.jPanelAccionesTipoSexo;
		
		JPanel jPanelCamposAuxiliarTipoSexo=new JPanelMe();
		JPanel jPanelAccionesFormularioAuxiliarTipoSexo=new JPanelMe();
		
		if(this.jInternalFrameDetalleFormTipoSexo!=null) {
			jPanelCamposAuxiliarTipoSexo=this.jInternalFrameDetalleFormTipoSexo.jPanelCamposTipoSexo;
			jPanelAccionesFormularioAuxiliarTipoSexo=this.jInternalFrameDetalleFormTipoSexo.jPanelAccionesFormularioTipoSexo;
		}
		
		final JPanel jPanelCamposTipoSexo=jPanelCamposAuxiliarTipoSexo;
		final JPanel jPanelAccionesFormularioTipoSexo=jPanelAccionesFormularioAuxiliarTipoSexo;
		
		
		final JMenuBar jmenuBarTipoSexo=this.jmenuBarTipoSexo;
		final JToolBar jTtoolBarTipoSexo=this.jTtoolBarTipoSexo;		
		
		
		JMenuBar jmenuBarDetalleAuxiliarTipoSexo=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarTipoSexo=new JToolBar();		
		
		if(this.jInternalFrameDetalleFormTipoSexo!=null) {
			jmenuBarDetalleAuxiliarTipoSexo=this.jInternalFrameDetalleFormTipoSexo.jmenuBarDetalleTipoSexo;
			jTtoolBarDetalleAuxiliarTipoSexo=this.jInternalFrameDetalleFormTipoSexo.jTtoolBarDetalleTipoSexo;
		}
		
		final JMenuBar jmenuBarDetalleTipoSexo=jmenuBarDetalleAuxiliarTipoSexo;
		final JToolBar jTtoolBarDetalleTipoSexo=jTtoolBarDetalleAuxiliarTipoSexo;		
		
		
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasTipoSexo;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesTipoSexo;
			processRunnable.jTableDatos=jTableDatosTipoSexo;
			processRunnable.jPanelCampos=jPanelCamposTipoSexo;
			processRunnable.jPanelPaginacion=jPanelPaginacionTipoSexo;
			processRunnable.jPanelAcciones=jPanelAccionesTipoSexo;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioTipoSexo;
			
			
			processRunnable.jmenuBar=jmenuBarTipoSexo;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleTipoSexo;
			processRunnable.jTtoolBar=jTtoolBarTipoSexo;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleTipoSexo;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasTipoSexo ,jPanelParametrosReportesTipoSexo,jTableDatosTipoSexo, /*jScrollPanelDatosTipoSexo,*/jPanelCamposTipoSexo,jPanelPaginacionTipoSexo, /*jScrollPanelDatosEdicionTipoSexo,*/ jPanelAccionesTipoSexo,jPanelAccionesFormularioTipoSexo,jmenuBarTipoSexo,jmenuBarDetalleTipoSexo,jTtoolBarTipoSexo,jTtoolBarDetalleTipoSexo);
		
			startProcess();//this.
		}
						
		/*
		if(conSplash) {
			SwingUtilities.invokeLater(new Runnable() {
			      public void run() {
			    	  try {
							FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasTipoSexo ,jPanelParametrosReportesTipoSexo, jScrollPanelDatosTipoSexo,jPanelPaginacionTipoSexo, jScrollPanelDatosEdicionTipoSexo, jPanelAccionesTipoSexo,jPanelAccionesFormularioTipoSexo,jmenuBarTipoSexo,jmenuBarDetalleTipoSexo,jTtoolBarTipoSexo,jTtoolBarDetalleTipoSexo);
						
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
	
	public void finishProcessTipoSexo() {// throws Exception 
		this.finishProcessTipoSexo(true);
	}
	
	public void finishProcessTipoSexo(Boolean conSplash) {// throws Exception 
		//FuncionesSwing.enableDisablePanels(true,this.jTabbedPaneBusquedasTipoSexo ,this.jPanelParametrosReportesTipoSexo, this.jScrollPanelDatosTipoSexo,this.jPanelPaginacionTipoSexo, this.jScrollPanelDatosEdicionTipoSexo, this.jPanelAccionesTipoSexo,this.jPanelAccionesFormularioTipoSexo,this.jmenuBarTipoSexo,this.jmenuBarDetalleTipoSexo,this.jTtoolBarTipoSexo,this.jTtoolBarDetalleTipoSexo);		
		
		final JTabbedPane jTabbedPaneBusquedasTipoSexo=this.jTabbedPaneBusquedasTipoSexo; 
		
		final JPanel jPanelParametrosReportesTipoSexo=this.jPanelParametrosReportesTipoSexo;
		//final JScrollPane jScrollPanelDatosTipoSexo=this.jScrollPanelDatosTipoSexo;
		final JTable jTableDatosTipoSexo=this.jTableDatosTipoSexo;		
		final JPanel jPanelPaginacionTipoSexo=this.jPanelPaginacionTipoSexo;
		//final JScrollPane jScrollPanelDatosEdicionTipoSexo=this.jScrollPanelDatosEdicionTipoSexo;
		final JPanel jPanelAccionesTipoSexo=this.jPanelAccionesTipoSexo;
		
		JPanel jPanelCamposAuxiliarTipoSexo=new JPanel();
		JPanel jPanelAccionesFormularioAuxiliarTipoSexo=new JPanel();
		
		if(this.jInternalFrameDetalleFormTipoSexo!=null) {
			jPanelCamposAuxiliarTipoSexo=this.jInternalFrameDetalleFormTipoSexo.jPanelCamposTipoSexo;
			jPanelAccionesFormularioAuxiliarTipoSexo=this.jInternalFrameDetalleFormTipoSexo.jPanelAccionesFormularioTipoSexo;
		}
		
		final JPanel jPanelCamposTipoSexo=jPanelCamposAuxiliarTipoSexo;
		final JPanel jPanelAccionesFormularioTipoSexo=jPanelAccionesFormularioAuxiliarTipoSexo;
		
		
		final JMenuBar jmenuBarTipoSexo=this.jmenuBarTipoSexo;		
		final JToolBar jTtoolBarTipoSexo=this.jTtoolBarTipoSexo;
				
		JMenuBar jmenuBarDetalleAuxiliarTipoSexo=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarTipoSexo=new JToolBar();
		
		if(this.jInternalFrameDetalleFormTipoSexo!=null) {
			jmenuBarDetalleAuxiliarTipoSexo=this.jInternalFrameDetalleFormTipoSexo.jmenuBarDetalleTipoSexo;
			jTtoolBarDetalleAuxiliarTipoSexo=this.jInternalFrameDetalleFormTipoSexo.jTtoolBarDetalleTipoSexo;		
		}
		
		final JMenuBar jmenuBarDetalleTipoSexo=jmenuBarDetalleAuxiliarTipoSexo;
		final JToolBar jTtoolBarDetalleTipoSexo=jTtoolBarDetalleAuxiliarTipoSexo;
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasTipoSexo;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesTipoSexo;
			processRunnable.jTableDatos=jTableDatosTipoSexo;
			processRunnable.jPanelCampos=jPanelCamposTipoSexo;
			processRunnable.jPanelPaginacion=jPanelPaginacionTipoSexo;
			processRunnable.jPanelAcciones=jPanelAccionesTipoSexo;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioTipoSexo;
			
			
			processRunnable.jmenuBar=jmenuBarTipoSexo;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleTipoSexo;
			processRunnable.jTtoolBar=jTtoolBarTipoSexo;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleTipoSexo;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			if(conSplash) {
				SwingUtilities.invokeLater(new RunnableProceso(true,this,jTabbedPaneBusquedasTipoSexo ,jPanelParametrosReportesTipoSexo, jTableDatosTipoSexo,/*jScrollPanelDatosTipoSexo,*/jPanelCamposTipoSexo,jPanelPaginacionTipoSexo, /*jScrollPanelDatosEdicionTipoSexo,*/ jPanelAccionesTipoSexo,jPanelAccionesFormularioTipoSexo,jmenuBarTipoSexo,jmenuBarDetalleTipoSexo,jTtoolBarTipoSexo,jTtoolBarDetalleTipoSexo));
			}
		}						
	}
	
	/*
	public void habilitarDeshabilitarControlesTipoSexo(Boolean esHabilitar,Boolean conDetalle) {
		this.habilitarDeshabilitarToolBarTipoSexo(esHabilitar,conDetalle);
		this.habilitarDeshabilitarMenuTipoSexo(esHabilitar,conDetalle);
	}
	
	public void habilitarDeshabilitarToolBarTipoSexo(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jTtoolBarTipoSexo,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jTtoolBarDetalleTipoSexo,esHabilitar,1,1);
		}
	}
	
	public void habilitarDeshabilitarMenuTipoSexo(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jmenuBarTipoSexo,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jmenuBarDetalleTipoSexo,esHabilitar,1,1);
		}
	}
	*/
	
	
	
	public void procesarBusqueda(String sAccionBusqueda) throws Exception {		
		String  finalQueryPaginacion=this.tiposexoConstantesFunciones.getsFinalQueryTipoSexo();
		String  finalQueryPaginacionTodos=this.tiposexoConstantesFunciones.getsFinalQueryTipoSexo();
		
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
		
		ArrayList<String> arrColumnasGlobalesNo=TipoSexoConstantesFunciones.getArrayColumnasGlobalesNoTipoSexo(this.arrDatoGeneral);
		ArrayList<String> arrColumnasGlobales=TipoSexoConstantesFunciones.getArrayColumnasGlobalesTipoSexo(this.arrDatoGeneral,arrColumnasGlobalesNo);
		
			
		String  finalQueryGlobal="";
		
		finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,!esBusqueda,esBusqueda,arrColumnasGlobales,TipoSexoConstantesFunciones.TABLENAME);
		
		String sOrderBy="";
		
		
		sOrderBy=Funciones2.getFinalQueryOrderBy(this.arrOrderBy);
		
		
		if(!sOrderBy.equals("")) {			
			finalQueryPaginacion=sOrderBy;
			finalQueryPaginacionTodos=sOrderBy;
		}
		
		
		//INICIALIZA ELIMINADOS
		this.tiposexosEliminados= new ArrayList<TipoSexo>();
		
		if(!this.isEntroOnLoad) {
			this.onLoad();
		}/* else {
			this.isEntroOnLoad=false;
		}*/
		
		
		
				
		try	{		
			
			//this.startProcessTipoSexo();
		
				///*TipoSexoSessionBean*/this.tiposexoSessionBean=new TipoSexoSessionBean();
			
			if(this.tiposexoSessionBean==null) {
				this.tiposexoSessionBean=new TipoSexoSessionBean();
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
					this.iNumeroPaginacion=TipoSexoConstantesFunciones.INUMEROPAGINACION;
				}
			}
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);
			
			this.cargarDatosCliente();
			
			ArrayList<Classe> classes=new ArrayList<Classe>();
			
			classes=TipoSexoConstantesFunciones.getClassesForeignKeysOfTipoSexo(new ArrayList<Classe>(),DeepLoadType.NONE);
			
		
			this.datosDeep=new DatosDeep();
			this.datosDeep.setIsDeep(false);
			this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
			this.datosDeep.setClases(classes);
			
			this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
			this.datosCliente.setIsConDeep(true);
			
			if(false) {//this.conExportar
				this.datosCliente.setIsConExportar(true);
				this.datosCliente.setDatosExportarParametros(Funciones2.getTipoExportar(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getcon_exportar_cabecera(),Funciones2.getTipoDelimiter(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getpath_exportar()+"/tiposexo."+Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario));
			} else {
				this.datosCliente.setIsConExportar(false);
			}
			
			tiposexosAux= new ArrayList<TipoSexo>();
			
				
			tiposexoLogic.setDatosCliente(this.datosCliente);
			tiposexoLogic.setDatosDeep(this.datosDeep);
			tiposexoLogic.setIsConDeep(true);
			
			
			tiposexoLogic.getTipoSexoDataAccess().setIsForForeingsKeysDataRelationships(true);
			
			if(sAccionBusqueda.equals("Todos") || sAccionBusqueda.equals("Query"))	{	
				if(sAccionBusqueda.equals("Todos")) {
					//FALTA:PARA BUSQUEDAS POR CAMPO EN FORMULARIO
					//this.sFinalQueryGeneral="";
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacionTodos );
					
					tiposexoLogic.getTodosTipoSexos(finalQueryGlobal,pagination);
					
					//tiposexoLogic.getTodosTipoSexosWithConnection(finalQueryGlobal,pagination);										
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
				
				if(tiposexoLogic.getTipoSexos()==null|| tiposexoLogic.getTipoSexos().size()==0)	{
					
				
				}
				
				if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(-1);
						this.pagination.setiMaxResults(-1);
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							tiposexosAux= new ArrayList<TipoSexo>();
							tiposexosAux.addAll(tiposexoLogic.getTipoSexos());						
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							tiposexosAux= new ArrayList<TipoSexo>();
							tiposexosAux.addAll(tiposexos);
						}
						//ARCHITECTURE
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							tiposexoLogic.getTodosTipoSexos(finalQueryGlobal+"",this.pagination);												
							
							//tiposexoLogic.getTodosTipoSexosWithConnection(finalQueryGlobal+"",this.pagination);												
						} else if(Constantes.ISUSAEJBREMOTE) {
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
					}
					
					this.generarReporteTipoSexos("Todos",tiposexoLogic.getTipoSexos() );
					
					if(false) {//isMostrarTodosResultadosReporte						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							tiposexoLogic.setTipoSexos(new ArrayList<TipoSexo>());					
							tiposexoLogic.getTipoSexos().addAll(tiposexosAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							tiposexos=new ArrayList<TipoSexo>();
							tiposexos.addAll(tiposexosAux);
						}
						//ARCHITECTURE
						
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);														
					}
				}
			}
			else if(sAccionBusqueda.equals("PorId")) {
				Long idTipoSexo=0L;
				
				if(this.idActual!=null && this.idActual!=0L) {
					idTipoSexo=this.idActual;
				
				} else if(this.idTipoSexoActual!=null && this.idTipoSexoActual!=0L) {
					idTipoSexo=idTipoSexoActual;
				}
				
					
				this.sDetalleReporte=TipoSexoConstantesFunciones.getDetalleIndicePorId(idTipoSexo);
				
				this.tiposexos=new ArrayList<TipoSexo>();
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {					
					tiposexoLogic.getEntity(idTipoSexo);
					
					//tiposexoLogic.getEntityWithConnection(idTipoSexo);
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
								
				if(Constantes.ISUSAEJBLOGICLAYER) {
					tiposexoLogic.setTipoSexos(new ArrayList<TipoSexo>());
					tiposexoLogic.getTipoSexos().add(tiposexoLogic.getTipoSexo());
				
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.tiposexos=new ArrayList<TipoSexo>();
					this.tiposexos.add(tiposexo);
				}
				
				if(tiposexoLogic.getTipoSexo()==null)	{
					
				
				}			
			}
			
		
			else if(sAccionBusqueda.equals("FK_IdEmpresa")) {
				this.sDetalleReporte=TipoSexoConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					tiposexoLogic.getTipoSexosFK_IdEmpresa(finalQueryGlobal,pagination,id_empresaFK_IdEmpresa);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=TipoSexoConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=TipoSexoConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=tiposexoLogic.getTipoSexos()==null||tiposexoLogic.getTipoSexos().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=tiposexos==null|| tiposexos.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						tiposexosAux=new ArrayList<TipoSexo>();
						tiposexosAux.addAll(tiposexoLogic.getTipoSexos());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							tiposexosAux=new ArrayList<TipoSexo>();
							tiposexosAux.addAll(tiposexos);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							tiposexoLogic.getTipoSexosFK_IdEmpresa(finalQueryGlobal,pagination,id_empresaFK_IdEmpresa);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=TipoSexoConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=TipoSexoConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteTipoSexos("FK_IdEmpresa",tiposexoLogic.getTipoSexos());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteTipoSexos("FK_IdEmpresa",tiposexos);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						tiposexoLogic.setTipoSexos(new ArrayList<TipoSexo>());
						tiposexoLogic.getTipoSexos().addAll(tiposexosAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							tiposexos=new ArrayList<TipoSexo>();
							tiposexos.addAll(tiposexosAux);
						}
						//ARCHITECTURE
					}
				}

			} 
		
		
		
		this.redimensionarTablaDatos();
		//this.refrescarForeignKeysDescripcionesTipoSexo();
		
		
		if(this.conTotales) {
			this.crearFilaTotales();
		}		
		} catch (JRException e) {
			throw e;
		} catch(Exception e) {
			throw e;
      	} finally {
      		//this.finishProcessTipoSexo();
      	}
		
	}				
	
	public void redimensionarTablaDatos() throws Exception {
		int iSizeTabla=0;
				
		iSizeTabla=this.getSizeTablaDatos();
		
		//ARCHITECTURE
		/*
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=tiposexoLogic.getTipoSexos().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=tiposexos.size();
		}
		*/
		//ARCHITECTURE
											
		this.redimensionarTablaDatos(iSizeTabla);		
	}
	
	public Integer getSizeTablaDatos() throws Exception {
		Integer iSizeTabla=0;
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=tiposexoLogic.getTipoSexos().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=tiposexos.size();
		}
		//ARCHITECTURE
											
		return iSizeTabla;		
	}
	
			
	public Boolean permiteMantenimiento(TipoSexo tiposexo) {
		Boolean permite=true;
		
		if(this.tiposexo.getsType().equals(Constantes2.S_TOTALES)) {
			permite=false;
		}
		
		return permite;
	}
	
	public void traerValoresTablaTotales() throws Exception {
	}
	
	
	public void traerValoresTablaOrderBy() throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.arrOrderBy=TipoSexoConstantesFunciones.getOrderByListaTipoSexo();							
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.arrOrderBy=TipoSexoConstantesFunciones.getOrderByListaTipoSexo();
		}		
	}
	
	
	public Boolean existeFilaTotales() throws Exception {
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(TipoSexo tiposexo:tiposexoLogic.getTipoSexos()) {
				if(tiposexo.getsType().equals(Constantes2.S_TOTALES)) {
					tiposexoTotales=tiposexo;
					existe=true;
					break;
				}
			}
								
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(TipoSexo tiposexo:this.tiposexos) {
				if(tiposexo.getsType().equals(Constantes2.S_TOTALES)) {
					tiposexoTotales=tiposexo;
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
			this.tiposexoAux=new TipoSexo();
			this.tiposexoAux.setsType(Constantes2.S_TOTALES);
			this.tiposexoAux.setIsNew(false);
			this.tiposexoAux.setIsChanged(false);
			this.tiposexoAux.setIsDeleted(false);
				
			if(Constantes.ISUSAEJBLOGICLAYER) {
				TipoSexoConstantesFunciones.TotalizarValoresFilaTipoSexo(this.tiposexoLogic.getTipoSexos(),this.tiposexoAux);
				
				this.tiposexoLogic.getTipoSexos().add(this.tiposexoAux);
				
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				TipoSexoConstantesFunciones.TotalizarValoresFilaTipoSexo(this.tiposexos,this.tiposexoAux);
				
				this.tiposexos.add(this.tiposexoAux);
			}
		}
	}
	
	public void quitarFilaTotales() throws Exception {
		tiposexoTotales=new TipoSexo();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.tiposexoLogic.getTipoSexos().remove(tiposexoTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.tiposexos.remove(tiposexoTotales);
			}
		}
	}
	
	public void actualizarFilaTotales() throws Exception {
		tiposexoTotales=new TipoSexo();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(TipoSexo tiposexo:tiposexoLogic.getTipoSexos()) {
				if(tiposexo.getsType().equals(Constantes2.S_TOTALES)) {
					tiposexoTotales=tiposexo;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				TipoSexoConstantesFunciones.TotalizarValoresFilaTipoSexo(this.tiposexoLogic.getTipoSexos(),tiposexoTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(TipoSexo tiposexo:this.tiposexos) {
				if(tiposexo.getsType().equals(Constantes2.S_TOTALES)) {
					tiposexoTotales=tiposexo;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				TipoSexoConstantesFunciones.TotalizarValoresFilaTipoSexo(this.tiposexos,tiposexoTotales);
			}
		}
	}		
	
	public void recargarInformacion()throws Exception {
		try {
			sAccionBusqueda="Todos";
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda(sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoSexoConstantesFunciones.CLASSNAME);
		}	
	}		
	
	
	public void getTipoSexosFK_IdEmpresa()throws Exception {
		try {
			sAccionBusqueda="FK_IdEmpresa";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	
	
	public void getTipoSexosFK_IdEmpresa(String sFinalQuery,Long id_empresa)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					tiposexoLogic.getTipoSexosFK_IdEmpresa(sFinalQuery,this.pagination,id_empresa);
				
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
	
	public void inicializarPermisosTipoSexo() {
		this.isPermisoTodoTipoSexo=false;
		this.isPermisoNuevoTipoSexo=false;
		this.isPermisoActualizarTipoSexo=false;
		this.isPermisoActualizarOriginalTipoSexo=false;
		this.isPermisoEliminarTipoSexo=false;
		this.isPermisoGuardarCambiosTipoSexo=false;
		this.isPermisoConsultaTipoSexo=false;
		this.isPermisoBusquedaTipoSexo=false;
		this.isPermisoReporteTipoSexo=false;		
		this.isPermisoOrdenTipoSexo=false;		
		this.isPermisoPaginacionMedioTipoSexo=false;		
		this.isPermisoPaginacionAltoTipoSexo=false;
		this.isPermisoPaginacionTodoTipoSexo=false;
		this.isPermisoCopiarTipoSexo=false;		
		this.isPermisoVerFormTipoSexo=false;		
		this.isPermisoDuplicarTipoSexo=false;		
		this.isPermisoOrdenTipoSexo=false;		
	}
	
	public void setPermisosUsuarioTipoSexo(Boolean isPermiso) {
		this.isPermisoTodoTipoSexo=isPermiso;
		this.isPermisoNuevoTipoSexo=isPermiso;
		this.isPermisoActualizarTipoSexo=isPermiso;
		this.isPermisoActualizarOriginalTipoSexo=isPermiso;
		this.isPermisoEliminarTipoSexo=isPermiso;
		this.isPermisoGuardarCambiosTipoSexo=isPermiso;
		this.isPermisoConsultaTipoSexo=isPermiso;
		this.isPermisoBusquedaTipoSexo=isPermiso;
		this.isPermisoReporteTipoSexo=isPermiso;
		this.isPermisoOrdenTipoSexo=isPermiso;		
		this.isPermisoPaginacionMedioTipoSexo=isPermiso;		
		this.isPermisoPaginacionAltoTipoSexo=isPermiso;		
		this.isPermisoPaginacionTodoTipoSexo=isPermiso;		
		this.isPermisoCopiarTipoSexo=isPermiso;		
		this.isPermisoVerFormTipoSexo=isPermiso;		
		this.isPermisoDuplicarTipoSexo=isPermiso;
		this.isPermisoOrdenTipoSexo=isPermiso;
	}
	
	public void setPermisosMantenimientoUsuarioTipoSexo(Boolean isPermiso) {
		//this.isPermisoTodoTipoSexo=isPermiso;
		this.isPermisoNuevoTipoSexo=isPermiso;
		this.isPermisoActualizarTipoSexo=isPermiso;
		this.isPermisoActualizarOriginalTipoSexo=isPermiso;
		this.isPermisoEliminarTipoSexo=isPermiso;
		this.isPermisoGuardarCambiosTipoSexo=isPermiso;
		//this.isPermisoConsultaTipoSexo=isPermiso;
		//this.isPermisoBusquedaTipoSexo=isPermiso;
		//this.isPermisoReporteTipoSexo=isPermiso;
		//this.isPermisoOrdenTipoSexo=isPermiso;		
		//this.isPermisoPaginacionMedioTipoSexo=isPermiso;		
		//this.isPermisoPaginacionAltoTipoSexo=isPermiso;		
		//this.isPermisoPaginacionTodoTipoSexo=isPermiso;		
		//this.isPermisoCopiarTipoSexo=isPermiso;		
		//this.isPermisoDuplicarTipoSexo=isPermiso;
		//this.isPermisoOrdenTipoSexo=isPermiso;
	}
	
	public void inicializarSetPermisosUsuarioTipoSexoClasesRelacionadas() throws Exception {
		ArrayList<String> arrPaginas=new ArrayList<String>();		
		ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
		
		
		if(TipoSexoJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public Boolean tienePermisosUsuarioEnPaginaWebTipoSexo(String sPagina) throws Exception {
		Boolean tienePermisos=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tienePermisos=sistemaLogicAdditional.tienePermisosEnPaginaWeb(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, sPagina);
		} else if(Constantes.ISUSAEJBREMOTE) {
		} else if(Constantes.ISUSAEJBHOME) {
		}
		
		return tienePermisos;
	}
	
	public void inicializarSetPermisosUsuarioTipoSexoClasesRelacionadas(Boolean conPermiso) throws Exception {
		
	}
	
	public Boolean verificarGetPermisosUsuarioTipoSexoClaseRelacionada(ArrayList<String> arrPaginasFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioClaseRelacionada(arrPaginasFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public Boolean verificarGetPermisosUsuarioOpcionTipoSexoClaseRelacionada(List<Opcion> opcionsFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioOpcionClaseRelacionada(opcionsFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public void actualizarTabsSetPermisosUsuarioTipoSexoClasesRelacionadas() throws Exception {
		
	}
	
	public void setPermisosUsuarioTipoSexo() throws Exception {
		
		PerfilOpcion perfilOpcionUsuario=new PerfilOpcion();		
		Long idOpcion=this.opcionActual.getId();
		
		if(TipoSexoJInternalFrame.CON_LLAMADA_SIMPLE) {
			perfilOpcionUsuario=this.sistemaReturnGeneral.getPerfilOpcion();
			
		} else {
			if(this.tiposexoSessionBean.getEsGuardarRelacionado()) {
				idOpcion=0L;
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				perfilOpcionUsuario=sistemaLogicAdditional.traerPermisosPaginaWebPerfilOpcion(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, TipoSexoConstantesFunciones.SNOMBREOPCION,idOpcion);				
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
		}
		
		if(perfilOpcionUsuario!=null && perfilOpcionUsuario.getId()>0) {
			this.isPermisoNuevoTipoSexo=perfilOpcionUsuario.getingreso()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarTipoSexo=perfilOpcionUsuario.getmodificacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarOriginalTipoSexo=this.isPermisoActualizarTipoSexo;
			this.isPermisoEliminarTipoSexo=perfilOpcionUsuario.geteliminacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoGuardarCambiosTipoSexo=perfilOpcionUsuario.getguardar_cambios()||perfilOpcionUsuario.gettodo();
			this.isPermisoConsultaTipoSexo=perfilOpcionUsuario.getconsulta()||perfilOpcionUsuario.gettodo();
			this.isPermisoBusquedaTipoSexo=perfilOpcionUsuario.getbusqueda()||perfilOpcionUsuario.gettodo();
			this.isPermisoTodoTipoSexo=perfilOpcionUsuario.gettodo()||perfilOpcionUsuario.gettodo();
			this.isPermisoReporteTipoSexo=perfilOpcionUsuario.getreporte()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenTipoSexo=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionMedioTipoSexo=perfilOpcionUsuario.getpaginacion_medio()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionAltoTipoSexo=perfilOpcionUsuario.getpaginacion_alto()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionTodoTipoSexo=perfilOpcionUsuario.getpaginacion_todo()||perfilOpcionUsuario.gettodo();
			this.isPermisoCopiarTipoSexo=perfilOpcionUsuario.getcopiar()||perfilOpcionUsuario.gettodo();
			this.isPermisoVerFormTipoSexo=true;//perfilOpcionUsuario.getver_form()||perfilOpcionUsuario.gettodo();
			this.isPermisoDuplicarTipoSexo=perfilOpcionUsuario.getduplicar()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenTipoSexo=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			
			if(this.tiposexoSessionBean.getEsGuardarRelacionado()) {
				this.opcionActual.setId(perfilOpcionUsuario.getid_opcion());
				
				this.jTableDatosTipoSexo.setToolTipText(this.jTableDatosTipoSexo.getToolTipText()+"_"+perfilOpcionUsuario.getid_opcion());		
			}
		} else {
			this.setPermisosUsuarioTipoSexo(false);
		}
		
		//SI SE NECESITA PONER TODOS LOS PERMISOS POR DEFECTO
		//
		
	}
	
	public void setAccionesUsuarioTipoSexo(Boolean esParaAccionesFormulario) throws Exception {		
		Reporte reporte=null;
		
		if(!esParaAccionesFormulario) {
			this.accions=new ArrayList<Accion>();
			
			if(TipoSexoJInternalFrame.CON_LLAMADA_SIMPLE) {
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
			
			if(TipoSexoJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public void setRelacionesUsuarioTipoSexo() throws Exception {
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
	public void inicializarCombosForeignKeyTipoSexoListas()throws Exception {
		try	{						
			
				this.empresasForeignKey=new ArrayList();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void cargarCombosTodosForeignKeyTipoSexoListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			String sFinalQueryCombo="";
			
			Modulo  moduloActualAux=new Modulo();
			
			if(TipoSexoJInternalFrame.ISLOAD_FKLOTE) {
				this.cargarCombosLoteForeignKeyTipoSexoListas(false);
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
	
	public void cargarCombosLoteForeignKeyTipoSexoListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			Modulo  moduloActualAux=new Modulo();
			
			
			TipoSexoParameterReturnGeneral tiposexoReturnGeneral=new TipoSexoParameterReturnGeneral();
						
			


				String finalQueryGlobalEmpresa="";

				if(((this.empresasForeignKey==null||this.empresasForeignKey.size()<=0) && this.tiposexoConstantesFunciones.cargarid_empresaTipoSexo)
					 || (this.esRecargarFks && this.tiposexoConstantesFunciones.cargarid_empresaTipoSexo)) {

					if(!this.tiposexoSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=EmpresaConstantesFunciones.getArrayColumnasGlobalesEmpresa(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalEmpresa=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,EmpresaConstantesFunciones.TABLENAME);

						finalQueryGlobalEmpresa=Funciones.GetFinalQueryAppend(finalQueryGlobalEmpresa, "");
						finalQueryGlobalEmpresa+=EmpresaConstantesFunciones.SFINALQUERY;

						//this.cargarCombosEmpresasForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalEmpresa=" WHERE " + ConstantesSql.ID + "="+tiposexoSessionBean.getlidEmpresaActual();
					}
				} else {
					finalQueryGlobalEmpresa="NONE";
				}
			
			//ARCHITECTURE			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				tiposexoReturnGeneral=tiposexoLogic.cargarCombosLoteForeignKeyTipoSexo(finalQueryGlobalEmpresa);//WithConnection
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}			
			//ARCHITECTURE
			
			

			if(!finalQueryGlobalEmpresa.equals("NONE")) {
				this.empresasForeignKey=tiposexoReturnGeneral.getempresasForeignKey();
			}
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void addItemDefectoCombosTodosForeignKeyTipoSexo()throws Exception {
		try {
			
			this.addItemDefectoCombosForeignKeyEmpresa();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	



	public void addItemDefectoCombosForeignKeyEmpresa()throws Exception {
		try {
			if(this.tiposexoSessionBean==null) {
				this.tiposexoSessionBean=new TipoSexoSessionBean();
			}

			if(!this.tiposexoSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {
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
	
	public void initActionsCombosTodosForeignKeyTipoSexo()throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void initActionsCombosTodosForeignKeyTipoSexo(String sFormularioTipoBusqueda)throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	


	
	


	
	public void setVariablesGlobalesCombosForeignKeyTipoSexo()throws Exception {	
		try {
			if(this.parametroGeneralUsuario!=null && this.parametroGeneralUsuario.getId()>0) {
			
				this.setActualEmpresaForeignKey(this.parametroGeneralUsuario.getid_empresa(),false,"Formulario");
			
			
			}
			
			//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
			this.setVariablesGlobalesAuxiliaresCombosForeignKeyTipoSexo();
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToFormularioForeignKeyTipoSexo(TipoSexo tiposexo)throws Exception {	
		try {
						
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToListasForeignKeyTipoSexo(TipoSexo tiposexo,String sTipoEvento)throws Exception {	
		try {
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	/*
	public void setVariablesCombosFromBeanForeignKeyTipoSexo()throws Exception {	
		try {
						
		} catch(Exception e) {
			throw e;
		}
	}
	*/
	
	public void setVariablesGlobalesAuxiliaresCombosForeignKeyTipoSexo()throws Exception {	
		try {
			
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesDefaultCombosForeignKeyTipoSexo()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesParametroCombosForeignKeyTipoSexo()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void cargarCombosParametroTipoSexo()throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			//this.cargarDatosCliente();
			
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
		
	public void cargarCombosFrameForeignKeyTipoSexo()throws Exception {
		try {
			

			this.cargarCombosFrameEmpresasForeignKey("Todos");

		} catch(Exception e) {
			throw e;
		}		
	}		
	
	public void cargarCombosFrameForeignKeyTipoSexo(String sFormularioTipoBusqueda)throws Exception {
		try {
			

			this.cargarCombosFrameEmpresasForeignKey(sFormularioTipoBusqueda);

		} catch(Exception e) {
			throw e;
		}		
	}	
	
	public void setItemDefectoCombosForeignKeyTipoSexo()throws Exception {
		try {
			



			if(this.jInternalFrameDetalleFormTipoSexo.jComboBoxid_empresaTipoSexo!=null && this.jInternalFrameDetalleFormTipoSexo.jComboBoxid_empresaTipoSexo.getItemCount()>0) {
				this.jInternalFrameDetalleFormTipoSexo.jComboBoxid_empresaTipoSexo.setSelectedIndex(0);
			}
		} catch(Exception e) {
			throw e;
		}		
	}		
	
	


	
	

	public TipoSexoBeanSwingJInternalFrame() throws Exception {
		super(false,PaginaTipo.PRINCIPAL);
	}
	
	public TipoSexoBeanSwingJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
	}
	
	public TipoSexoBeanSwingJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
		
		this.tiposexoSessionBean=new TipoSexoSessionBean(); 
		this.tiposexoConstantesFunciones=new TipoSexoConstantesFunciones(); 
		this.tiposexoBean=new TipoSexo();//(this.tiposexoConstantesFunciones); 		
		this.tiposexoReturnGeneral=new TipoSexoParameterReturnGeneral(); 
		
		this.tiposexoSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.tiposexoSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
				
	}
	
	public TipoSexoBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,cargarTodosDatos);
	}
		
	public TipoSexoBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,false,false,cargarRelaciones,cargarTodosDatos);
	}	
	
	public TipoSexoBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos) throws Exception //Boolean esParaBusquedaForeignKey
    {
		super(jdesktopPane,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		try {
			
			this.permiteRecargarForm=false;
			
			this.startProcessTipoSexo(true);
			
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
			
			this.tiposexoConstantesFunciones=new TipoSexoConstantesFunciones(); 
			this.tiposexoBean=new TipoSexo();//this.tiposexoConstantesFunciones); 			
			this.tiposexoReturnGeneral=new TipoSexoParameterReturnGeneral(); 
		
			TipoSexoBeanSwingJInternalFrameAdditional.CargaInicialInicio(this, "NORMAL", null);
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Tipo Sexo Mantenimiento",paginaTipo));			
			
			this.conTotales=false;
			
			
			
			this.tiposexo=new TipoSexo();
			this.tiposexos = new ArrayList<TipoSexo>();
			this.tiposexosAux = new ArrayList<TipoSexo>();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tiposexoLogic=new TipoSexoLogic();
				this.tiposexoLogic.getNewConnexionToDeep("");
			}
			
			//this.tiposexoSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
			//this.tiposexoSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
			
			this.jDesktopPane=jdesktopPane;
			
			if(this.jDesktopPane.getClass().equals(JDesktopPaneMe.class)) {
				this.constantes2=((JDesktopPaneMe)this.jDesktopPane).constantes2;
			}
			
			if(!Constantes.CON_VARIAS_VENTANAS) {
    			MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameDetalleFormTipoSexo);
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameReporteDinamicoTipoSexo!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoTipoSexo);	
					}
					
					if(this.jInternalFrameImportacionTipoSexo!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionTipoSexo);							
					}
					
				}
				
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameOrderByTipoSexo!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameOrderByTipoSexo);					
					}
					
				}
			}
			
			//DETALLE DATOS
			if(this.jInternalFrameDetalleFormTipoSexo!=null) { //this.conCargarFormDetalle) {
				this.jDesktopPane.add(this.jInternalFrameDetalleFormTipoSexo);
				this.jInternalFrameDetalleFormTipoSexo.setVisible(false);
				this.jInternalFrameDetalleFormTipoSexo.setSelected(false);						
			}
			
			if(!this.conCargarMinimo) {
				
				//REPORTE DINAMICO
				if(this.jInternalFrameReporteDinamicoTipoSexo!=null) {
					this.jDesktopPane.add(this.jInternalFrameReporteDinamicoTipoSexo);
					this.jInternalFrameReporteDinamicoTipoSexo.setVisible(false);
					this.jInternalFrameReporteDinamicoTipoSexo.setSelected(false);
				}
				
				//IMPORTACION
				if(this.jInternalFrameImportacionTipoSexo!=null) {
					this.jDesktopPane.add(this.jInternalFrameImportacionTipoSexo);
					this.jInternalFrameImportacionTipoSexo.setVisible(false);
					this.jInternalFrameImportacionTipoSexo.setSelected(false);
				}
				
				
			}
			
			
			if(!this.conCargarMinimo) {
				
				if(this.jInternalFrameOrderByTipoSexo!=null) {
					this.jDesktopPane.add(this.jInternalFrameOrderByTipoSexo);
					this.jInternalFrameOrderByTipoSexo.setVisible(false);
					this.jInternalFrameOrderByTipoSexo.setSelected(false);				
				}
				
			}
			
			
			//this.esParaBusquedaForeignKey=false;
			this.esParaBusquedaForeignKey=esParaBusquedaForeignKey;
			
			this.invalidValues=new InvalidValue[0];
			
			
			
			this.idTipoSexoActual=0L;
			this.rowIndexActual=0;
			
			
			this.iNumeroPaginacionPagina=0;
			this.iNumeroPaginacion=TipoSexoConstantesFunciones.INUMEROPAGINACION;
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
			
			this.tiposexoReturnGeneral=new TipoSexoParameterReturnGeneral();
			
			this.tiposexoParameterGeneral=new TipoSexoParameterReturnGeneral();
			
			
			
			this.sistemaLogicAdditional=new SistemaLogicAdditional();
			
			this.sistemaLogicAdditional.setConnexion(this.tiposexoLogic.getConnexion());			
			
			
			
			
			
			
			
			//VERIFICAR GLOBAL
			this.cargarDatosCliente();			
			
			
			if(!this.tiposexoSessionBean.getEsGuardarRelacionado()) {
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
			
			if(TipoSexoJInternalFrame.CON_LLAMADA_SIMPLE) {
				if(this.tiposexoSessionBean.getEsGuardarRelacionado()) {
					this.opcionActual.setId(0L);
					
					//idOpcion=0L;					
				}
				
				ArrayList<String> arrPaginas=new ArrayList<String>();		
				ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
				
		
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					//this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActualWithConnection(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,TipoSexoConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.tiposexoSessionBean.getEsGuardarRelacionado(),this.tiposexoSessionBean.getConGuardarRelaciones(),arrPaginas);
					
					this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActual(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,TipoSexoConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.tiposexoSessionBean.getEsGuardarRelacionado(),this.tiposexoSessionBean.getConGuardarRelaciones(),arrPaginas);
					
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
			
			this.isVisibilidadCeldaNuevoTipoSexo=false;
			this.isVisibilidadCeldaDuplicarTipoSexo=true;
			this.isVisibilidadCeldaCopiarTipoSexo=true;
			this.isVisibilidadCeldaVerFormTipoSexo=true;
			this.isVisibilidadCeldaOrdenTipoSexo=true;
			this.isVisibilidadCeldaNuevoRelacionesTipoSexo=false;
			this.isVisibilidadCeldaModificarTipoSexo=false;
			this.isVisibilidadCeldaActualizarTipoSexo=false;
			this.isVisibilidadCeldaEliminarTipoSexo=false;
			this.isVisibilidadCeldaCancelarTipoSexo=false;
			this.isVisibilidadCeldaGuardarTipoSexo=false;
			this.isVisibilidadCeldaGuardarCambiosTipoSexo=false;
			
			
			this.isVisibilidadFK_IdEmpresa=true;
			
			//ELEMENTOS TABLAS PARAMETOS
			
			
			
			//ELEMENTOS TABLAS PARAMETOS_FIN
			
			//this.actualizarEstadoCeldasBotonesTipoSexo("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
						
			
			
			this.inicializarPermisosTipoSexo();
			
			//INICIALIZAR FALSE, TALVEZ COMENTAR
			this.setPermisosUsuarioTipoSexo(false);
			
			this.setPermisosUsuarioTipoSexo();
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.tiposexoSessionBean.getEsGuardarRelacionado() 
				|| (this.tiposexoSessionBean.getEsGuardarRelacionado() && this.tiposexoSessionBean.getConGuardarRelaciones())) {
				
				this.inicializarSetPermisosUsuarioTipoSexoClasesRelacionadas();
			}
			
			if(this.tiposexoSessionBean.getConGuardarRelaciones()) {
				this.actualizarTabsSetPermisosUsuarioTipoSexoClasesRelacionadas();
			}
			
			
			
			//SOLO SE EJECUTA LA PRIMERA VEZ, BINDINGS SI FUNCIONA
			if(!TipoSexoJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingBotonesPermisosTipoSexo();
			} else {
				this.inicializarActualizarBindingBotonesPermisosManualTipoSexo();
			}
			
			if(!this.isPermisoBusquedaTipoSexo) {
				//BYDAN_BUSQUEDAS
				
				this.jTabbedPaneBusquedasTipoSexo.setVisible(false);				
				
			}
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.tiposexoSessionBean.getEsGuardarRelacionado()) {				
				this.tiposArchivosReportes=Funciones.getListTiposArchivosReportes();
				this.tiposArchivosReportesDinamico=Funciones.getListTiposArchivosReportes();
				this.tiposReportes=Funciones.getListTiposReportes(false);
				this.tiposReportesDinamico=Funciones.getListTiposReportesDinamico(false);
				
				
				
				this.tiposGraficosReportes=Funciones2.getListTiposGraficosReportes();
				this.tiposPaginacion=Funciones2.getListTiposPaginacion(this.isPermisoPaginacionMedioTipoSexo,this.isPermisoPaginacionMedioTipoSexo,this.isPermisoPaginacionTodoTipoSexo);
				this.tiposSeleccionar=Funciones2.getListTiposSeleccionar();
				this.tiposSeleccionar.addAll(TipoSexoConstantesFunciones.getTiposSeleccionarTipoSexo());
				
				this.tiposColumnasSelect=TipoSexoConstantesFunciones.getTiposSeleccionarTipoSexo(true);
				
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
			//if(!this.tiposexoSessionBean.getEsGuardarRelacionado()) {
				//SE ENCUENTRA MAS ADELANTE CON ACCIONES POR USUARIO
				//ACCIONES GENERALES Y POR USUARIO
				this.tiposRelaciones=Funciones2.getListTiposRelaciones();
				this.setRelacionesUsuarioTipoSexo();
				
				this.tiposAcciones=Funciones2.getListTiposAcciones(false,false,true);
				this.setAccionesUsuarioTipoSexo(false);	
				
				this.tiposAccionesFormulario=Funciones2.getListTiposAccionesFormulario(false,false,true);							
				this.setAccionesUsuarioTipoSexo(true);	
				
				this.inicializarActualizarBindingtiposArchivosReportesAccionesTipoSexo() ;
			
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
				tiposexoImplementable= (TipoSexoImplementable) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+TipoSexoConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBREMOTE);
			} else if(Constantes.ISUSAEJBHOME) {
				tiposexoImplementableHome= (TipoSexoImplementableHome) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+TipoSexoConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBLOCAL);
			}			
			*/
			
			
			this.tiposexos= new ArrayList<TipoSexo>();
			this.tiposexosEliminados= new ArrayList<TipoSexo>();
						
			this.isEsNuevoTipoSexo=false;
			this.esParaAccionDesdeFormularioTipoSexo=false;
			this.isEsMantenimientoRelacionesRelacionadoUnico=false;
			this.isEsMantenimientoRelaciones=false;
			this.isEsMantenimientoRelacionado=false;
			this.isContieneImagenes=false;
			
			
			
			
			
			//INICIALIZAR LISTAS FK
			
			this.empresasForeignKey=new ArrayList<Empresa>() ;
			
			
			
			
			if(blncargarCombostrForeignKey) {
				this.cargarCombosForeignKeyTipoSexo(this.isCargarCombosDependencia);
			}
			
			this.cargarCombosParametroTipoSexo();
			
			
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.tiposexoSessionBean.getEsGuardarRelacionado()) {
				this.onLoad();
			}
						
			TipoSexoBeanSwingJInternalFrameAdditional.RecargarVentanaSegunOpcion(this,opcionActual);
			
			/*
			if(blnCargarInformacionInicial) {
				this.recargarInformacion();
			}
			*/
			//this.iNumeroPaginacionPagina=0;
			//this.iNumeroPaginacion=TipoSexoConstantesFunciones.INUMEROPAGINACION;
			
			this.actualizarEstadoCeldasBotonesTipoSexo("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			//SOLO LA PRIMERA VEZ HACE LOS BINDINGS, SOLO AHI FUNCIONA
			this.inicializarActualizarBindingTipoSexo(true); 
			
			//SE REDIMENSIONA SINO NO SE ACTUALIZA
			this.redimensionarTablaDatos();
			
			
			this.initActions();
			
			;
						
			if(this.jInternalFrameDetalleFormTipoSexo!=null) {//if(this.conCargarFormDetalle) {
				this.cargarMenuRelaciones();
			}
			
			//OBLIGA CARGAR DETALLE, MEJOR DESHABILITAR, FALTA TALVEZ PONER EN SELECCIONAR
			//MAYBE
			//this.updateControlesFormularioTipoSexo();
			
			if(!this.conCargarMinimo) {
				this.updateBusquedasFormularioTipoSexo();
			}
			
			TipoSexoBeanSwingJInternalFrameAdditional.CargaInicial(this, "NORMAL", null);
			
			
			//SE REALIZA ESTO PARA QUE SE PUEDA RECORRER TAB SIN IMPORTAR ORDEN
			Boolean existeTabBusqueda=false;
			
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				
				for(int i=0; i<this.jTabbedPaneBusquedasTipoSexo.getTabCount(); i++) {
					this.jTabbedPaneBusquedasTipoSexo.setSelectedIndex(i);
						
					if(!existeTabBusqueda) {
						existeTabBusqueda=true;
					}
				}
					
				if(existeTabBusqueda) {
					this.jTabbedPaneBusquedasTipoSexo.setSelectedIndex(0);
				}	
				
				
			}
			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tiposexoLogic.commitNewConnexionToDeep();
			}
			
			
			if(Constantes2.ISDEVELOPING2) {
				end_time = System.currentTimeMillis();			
				String sTipo="Load Ventana";
				Funciones2.getMensajeTiempoEjecucion(start_time, end_time, sTipo,false);
			}  
			
			this.finishProcessTipoSexo(true);
			
			this.dEnd=(double)System.currentTimeMillis();
			
			this.dDif=this.dEnd - this.dStart;
			
			if(Constantes.ISDEVELOPING) {
				System.out.println("Tiempo(ms) Carga TipoSexo: " + this.dDif); 
			}
			
			this.permiteRecargarForm=true;
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tiposexoLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,TipoSexoConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tiposexoLogic.closeNewConnexionToDeep();
			}
		}	 
    }
	
	public void cargarTiposRelacionesSelectTipoSexo() {
		Reporte reporte=new Reporte();
		
	
	}
	
	
	
	public void jTabbedPaneChangeListenerGeneral(String sTipo,ChangeEvent evt) { 	  
		Boolean procesaCargarParteTab=false;
			
		try {
			int iIndex=0;		    			
			String sTitle="";
			
			//TABBED PANE RELACIONES
			if(sTipo.equals("RelacionesTipoSexo")) {
				iIndex=this.jInternalFrameDetalleFormTipoSexo.jTabbedPaneRelacionesTipoSexo.getSelectedIndex();		    
			
				sTitle=this.jInternalFrameDetalleFormTipoSexo.jTabbedPaneRelacionesTipoSexo.getTitleAt(iIndex);
				
				Integer intSelectedRow = 0;	
			
				intSelectedRow = this.jTableDatosTipoSexo.getSelectedRow();	
				
				
				
			}
			
			//TABBED PANE RELACIONES FIN(EXTRA TAB)
			;
			
  		} catch(Exception e) {
  			e.printStackTrace();
  		} finally {
			if(procesaCargarParteTab) {				
				this.finishProcessTipoSexo();	
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
	
	public void cargarCombosForeignKeyTipoSexo(Boolean cargarCombosDependencia) throws Exception {   
		this.cargarCombosForeignKeyTipoSexo(cargarCombosDependencia,true,true);
	}
	
	//CARGAR COMBOS EN LOTE
	public void cargarCombosForeignKeyTipoSexo(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales) throws Exception {   
		this.cargarCombosTodosForeignKeyTipoSexoListas(cargarCombosDependencia);
				
		this.addItemDefectoCombosTodosForeignKeyTipoSexo();
		
		this.cargarCombosFrameForeignKeyTipoSexo();						
		
		if(conInitActions) {
			this.initActionsCombosTodosForeignKeyTipoSexo();
		}
		
		if(conSetVariablesGlobales) {
			this.setVariablesGlobalesCombosForeignKeyTipoSexo();
		}
	}
	
	
	
	public void jButtonNuevoTipoSexoActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.FORM_RECARGAR;
			String sTipo="NUEVO_NORMAL";
			
			this.estaModoNuevo=true;
			
			if(this.tiposexoSessionBean.getConGuardarRelaciones()) {
				this.dStart=(double)System.currentTimeMillis();
			}
				
			//if(this.esUsoDesdeHijo) {
			//	eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
			//}
											
			if(this.jInternalFrameDetalleFormTipoSexo==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}			
				
			TipoSexoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.tiposexo,new Object(),this.tiposexoParameterGeneral,this.tiposexoReturnGeneral);
			
			
			if(jTableDatosTipoSexo.getRowCount()>=1) {
				jTableDatosTipoSexo.removeRowSelectionInterval(0, jTableDatosTipoSexo.getRowCount()-1);						
			}
			
			this.isEsNuevoTipoSexo=true;
			
			//ESTABLECE SI ES RELACIONADO O NO 
			this.habilitarDeshabilitarTipoMantenimientoTipoSexo(esRelaciones);
			
			this.nuevoPreparar(false); 
			this.habilitarDeshabilitarControlesTipoSexo(true);			
			//this.tiposexo=new TipoSexo();
			//this.tiposexo.setIsChanged(true);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesTipoSexo(false) ;						
			 
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualTipoSexo() ;
			
			if(TipoSexoJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleTipoSexo(esRelaciones);
			}
					
			//Se Duplica, sin sentido
			//this.actualizarInformacion("EVENTO_NUEVO",false,this.tiposexo);	
			this.actualizarInformacion("INFO_PADRE",false,this.tiposexo);				
			
			TipoSexoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.tiposexo,new Object(),this.tiposexoParameterGeneral,this.tiposexoReturnGeneral);
			
			if(this.tiposexoSessionBean.getConGuardarRelaciones()) {
				this.dEnd=(double)System.currentTimeMillis();					
				this.dDif=this.dEnd - this.dStart;
					
				if(Constantes.ISDEVELOPING) {
					System.out.println("Tiempo(ms) Nuevo Preparar TipoSexo: " + this.dDif); 
				}
			}
			
			//false para que pueda generar eventos
			this.estaModoNuevo=false;
							
			//Con this.estaModoNuevo=false;, se permite actualizar y usar eventos control al mismo tiempo (FuncionTipo.LAST)			
			TipoSexoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.LAST,ControlTipo.FORM,EventoTipo.CLIC,EventoSubTipo.NEW,sTipo,this.tiposexo,new Object(),this.tiposexoParameterGeneral,this.tiposexoReturnGeneral);
			
		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,TipoSexoConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;			
		}
	}
	
	public void jButtonDuplicarTipoSexoActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			Boolean soloDuplicarUno=false;
			Boolean conSeleccionarFilaTabla=false;
			
			this.estaModoNuevo=true;
			this.estaModoDuplicar=true;
			
			ArrayList<TipoSexo> tiposexosSeleccionados=new ArrayList<TipoSexo>();
			int intSelectedRow =-1;
			Integer iNumRowsSeleccionados=0;
			int[] arrNumRowsSeleccionados=null;
			
			//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
			if(conSeleccionarFilaTabla) {
				arrNumRowsSeleccionados=this.jTableDatosTipoSexo.getSelectedRows();
				iNumRowsSeleccionados=this.jTableDatosTipoSexo.getSelectedRows().length;			
			}
			
			tiposexosSeleccionados=this.getTipoSexosSeleccionados(false);
				
			if((soloDuplicarUno && iNumRowsSeleccionados.equals(1)) || !soloDuplicarUno) {
				//LO HACE NUEVOPREPARAR
				//this.iIdNuevoTipoSexo--;			
				//TipoSexo tiposexoAux= new TipoSexo();			
				//tiposexoAux.setId(this.iIdNuevoTipoSexo);																
				
				//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
				//TipoSexo tiposexoOrigen=new TipoSexo();
				//for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {				
				
				for(TipoSexo tiposexoOrigen : tiposexosSeleccionados) {
					if(conSeleccionarFilaTabla) {
						if(!soloDuplicarUno) {
							//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
							//intSelectedRow =iNumRowSeleccionado;
						} else {
							intSelectedRow = this.jTableDatosTipoSexo.getSelectedRow();
						}
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							tiposexoOrigen =(TipoSexo) this.tiposexoLogic.getTipoSexos().toArray()[this.jTableDatosTipoSexo.convertRowIndexToModel(intSelectedRow)];
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							tiposexoOrigen =(TipoSexo) this.tiposexos.toArray()[this.jTableDatosTipoSexo.convertRowIndexToModel(intSelectedRow)];
						}
					}
					
					this.aumentarTamanioFilaNuevaTablaTipoSexo();
					
					if(this.conTotales) {
						this.quitarFilaTotales();
					}
					
					this.nuevoPreparar(true);
					
					this.tiposexo.setsType("DUPLICADO");
					
					this.setCopiarVariablesObjetosTipoSexo(tiposexoOrigen,this.tiposexo,true,true);
					
					this.setVariablesFormularioToObjetoActualForeignKeysTipoSexo(this.tiposexo);
					
					//LO HACE NUEVOPREPARAR
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.tiposexoLogic.getTipoSexos().add(this.tiposexoAux);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.tiposexos.add(this.tiposexoAux);				
					}
					*/
				}
				
				this.inicializarActualizarBindingTablaTipoSexo(false);
				
				this.jTableDatosTipoSexo.setRowSelectionInterval(this.getIndiceNuevoTipoSexo(), this.getIndiceNuevoTipoSexo());
				
				int iLastRow =  this.jTableDatosTipoSexo.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosTipoSexo.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosTipoSexo.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaTipoSexo(false);
				}
			} else {
				throw new Exception("DEBE ESTAR SELECCIONADO 1 REGISTRO");
			}
			
		} catch(Exception e) {			
			FuncionesSwing.manageException(this, e,logger,TipoSexoConstantesFunciones.CLASSNAME);
		
		} finally {
			this.estaModoNuevo=false;
			this.estaModoDuplicar=false;
		}
	}
	
	public void jButtonCopiarTipoSexoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			Boolean conSeleccionarFilaTabla=false;
			Integer iNumRowsSeleccionados=0;
			int[] intSelectedRows =null;
			int intSelectedRow =0;
			
			this.estaModoCopiar=true;
			
			ArrayList<TipoSexo> tiposexosSeleccionados=new ArrayList<TipoSexo>();									
		
			TipoSexo tiposexoOrigen=new TipoSexo();
			TipoSexo tiposexoDestino=new TipoSexo();
				
			tiposexosSeleccionados=this.getTipoSexosSeleccionados(false);
			
			if(conSeleccionarFilaTabla) {
				iNumRowsSeleccionados=this.jTableDatosTipoSexo.getSelectedRows().length;	
			}
			
			if(iNumRowsSeleccionados.equals(2) || tiposexosSeleccionados.size()==2) {
				if(conSeleccionarFilaTabla) {
					intSelectedRows =this.jTableDatosTipoSexo.getSelectedRows();
					intSelectedRow = intSelectedRows[0];	
									
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						tiposexoOrigen =(TipoSexo) this.tiposexoLogic.getTipoSexos().toArray()[this.jTableDatosTipoSexo.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						tiposexoOrigen =(TipoSexo) this.tiposexos.toArray()[this.jTableDatosTipoSexo.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					intSelectedRow = intSelectedRows[1];
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						tiposexoDestino =(TipoSexo) this.tiposexoLogic.getTipoSexos().toArray()[this.jTableDatosTipoSexo.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						tiposexoDestino =(TipoSexo) this.tiposexos.toArray()[this.jTableDatosTipoSexo.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				}
				
				tiposexoOrigen =tiposexosSeleccionados.get(0);
				tiposexoDestino =tiposexosSeleccionados.get(1);
				
				this.setCopiarVariablesObjetosTipoSexo(tiposexoOrigen,tiposexoDestino,true,false);
				
				tiposexoDestino.setsType("DUPLICADO");
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(tiposexoDestino,tiposexoLogic.getTipoSexos());					
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(tiposexoDestino,tiposexos);
				}
				//ARCHITECTURE
				
				this.inicializarActualizarBindingTablaTipoSexo(false);
				
				//this.jTableDatosTipoSexo.setRowSelectionInterval(this.getIndiceNuevoTipoSexo(), this.getIndiceNuevoTipoSexo());
				
				int iLastRow =  this.jTableDatosTipoSexo.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosTipoSexo.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosTipoSexo.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					//this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaTipoSexo(false);
				}
			} else {
				throw new Exception("DEBEN ESTAR SELECCIONADOS 2 REGISTROS");
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoSexoConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.estaModoCopiar=false;
		}
	}
	
	public void jButtonVerFormTipoSexoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormTipoSexo==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.jInternalFrameDetalleFormTipoSexo.setSelected(true);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoSexoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonMostrarOcultarTipoSexoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			Boolean isVisible=this.jPanelParametrosReportesTipoSexo.isVisible();
			
			//BYDAN_BUSQUEDAS
			
			this.jTabbedPaneBusquedasTipoSexo.setVisible(!isVisible);			
			
			
			this.jPanelParametrosReportesTipoSexo.setVisible(!isVisible);
			this.jPanelPaginacionTipoSexo.setVisible(!isVisible);
			this.jPanelAccionesTipoSexo.setVisible(!isVisible);
							
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoSexoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarTipoSexoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.closingInternalFrameTipoSexo();
			
			//if(this.jInternalFrameParent==null) {
				//this.dispose();
			/*} else {
				this.setVisible(false);
	        	this.setSelected(false);	
			}*/			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoSexoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarReporteDinamicoTipoSexoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameReporteDinamicoTipoSexo();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoSexoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarImportacionTipoSexoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameImportacionTipoSexo();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoSexoConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonAbrirOrderByTipoSexoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			
			this.abrirInicializarFrameOrderByTipoSexo();
			
			this.abrirFrameOrderByTipoSexo();
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoSexoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarOrderByTipoSexoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameOrderByTipoSexo();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoSexoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void abrirFrameDetalleTipoSexo(Boolean esRelaciones) throws Exception {	    	        
	    try {
			//CAUSA PROBLEMAS, SE ADICIONA EN CONSTRUCTOR, LUEGO SOLO VISIBLE true y false
			//this.jDesktopPane.add(jInternalFrameDetalleFormTipoSexo);
			
			if(!esRelaciones) {
				if(this.jInternalFrameDetalleFormTipoSexo.isMaximum()) {
					this.jInternalFrameDetalleFormTipoSexo.setMaximum(false);
				}								
				
	    		this.jInternalFrameDetalleFormTipoSexo.setSize(this.jInternalFrameDetalleFormTipoSexo.iWidthFormulario,this.jInternalFrameDetalleFormTipoSexo.iHeightFormulario);
	    	} else {
				if(this.iWidthScroll<this.jInternalFrameDetalleFormTipoSexo.iWidthFormularioMaximo) {
	    			this.jInternalFrameDetalleFormTipoSexo.setSize(this.iWidthScroll,this.iHeightScroll);
				} else {
					if(!this.jInternalFrameDetalleFormTipoSexo.isMaximum()) {
						this.jInternalFrameDetalleFormTipoSexo.setMaximum(true);
					}
				}
				
				if(this.jInternalFrameDetalleFormTipoSexo.jContentPaneDetalleTipoSexo.getWidth() > this.getWidth()) {
					this.jInternalFrameDetalleFormTipoSexo.jTabbedPaneRelacionesTipoSexo.setMinimumSize(new Dimension(this.jInternalFrameDetalleFormTipoSexo.jContentPaneDetalleTipoSexo.getWidth(),TipoSexoConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormTipoSexo.jTabbedPaneRelacionesTipoSexo.setMaximumSize(new Dimension(this.jInternalFrameDetalleFormTipoSexo.jContentPaneDetalleTipoSexo.getWidth(),TipoSexoConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormTipoSexo.jTabbedPaneRelacionesTipoSexo.setPreferredSize(new Dimension(this.jInternalFrameDetalleFormTipoSexo.jContentPaneDetalleTipoSexo.getWidth(),TipoSexoConstantesFunciones.ALTO_TABPANE_RELACIONES));
					
					Dimension dimension=new Dimension(); 
					
					
					
				}
	    	}
			
		
	       	this.jInternalFrameDetalleFormTipoSexo.setVisible(true);
	        this.jInternalFrameDetalleFormTipoSexo.setSelected(true);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoSexoConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirInicializarFrameOrderByTipoSexo() throws Exception {	    	        
	    try {
			if(this.jInternalFrameOrderByTipoSexo==null) {
				
				if(!this.conCargarMinimo) {
					this.jInternalFrameOrderByTipoSexo=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByTipoSexo,false,this);
				} else {
					this.jInternalFrameOrderByTipoSexo=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByTipoSexo,true,this);
				}
				
				this.jDesktopPane.add(this.jInternalFrameOrderByTipoSexo);
				this.jInternalFrameOrderByTipoSexo.setVisible(false);
				this.jInternalFrameOrderByTipoSexo.setSelected(false);
				
				this.jInternalFrameOrderByTipoSexo.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByTipoSexo"));
				
				this.inicializarActualizarBindingTablaOrderByTipoSexo();
			}
		} catch (final Exception e) {
			
		}
	}
	
	
	
	public void abrirInicializarFrameImportacionTipoSexo() throws Exception {	    	        
	    try {
			if(this.jInternalFrameImportacionTipoSexo==null) {
				
				this.jInternalFrameImportacionTipoSexo=new ImportacionJInternalFrame(TipoSexoConstantesFunciones.SCLASSWEBTITULO,this);			
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionTipoSexo);							
				
				this.jDesktopPane.add(this.jInternalFrameImportacionTipoSexo);
				this.jInternalFrameImportacionTipoSexo.setVisible(false);
				this.jInternalFrameImportacionTipoSexo.setSelected(false);


				this.jInternalFrameImportacionTipoSexo.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionTipoSexo"));
				this.jInternalFrameImportacionTipoSexo.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionTipoSexo"));
				this.jInternalFrameImportacionTipoSexo.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionTipoSexo"));


			}
		} catch (final Exception e) {
			
		}
	}		
	
	
	
	public void abrirInicializarFrameReporteDinamicoTipoSexo() throws Exception {	    	        
	    try {
			
			if(this.jInternalFrameReporteDinamicoTipoSexo==null) {
				this.jInternalFrameReporteDinamicoTipoSexo=new ReporteDinamicoJInternalFrame(TipoSexoConstantesFunciones.SCLASSWEBTITULO,this);	
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoTipoSexo);	
	
	
				this.jDesktopPane.add(this.jInternalFrameReporteDinamicoTipoSexo);
				this.jInternalFrameReporteDinamicoTipoSexo.setVisible(false);
				this.jInternalFrameReporteDinamicoTipoSexo.setSelected(false);
	
	
	
				this.jInternalFrameReporteDinamicoTipoSexo.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoTipoSexo"));
				this.jInternalFrameReporteDinamicoTipoSexo.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoTipoSexo"));
				this.jInternalFrameReporteDinamicoTipoSexo.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoTipoSexo"));
	
				this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualTipoSexo();
			}

		} catch (final Exception e) {
			
		}
	}	
	
	
	
		
					
	public void cerrarFrameDetalleTipoSexo() throws Exception {	    	        
	    try {
			//this.jDesktopPane.add(jInternalFrameDetalleFormTipoSexo);
			
	       	this.jInternalFrameDetalleFormTipoSexo.setVisible(false);
	        this.jInternalFrameDetalleFormTipoSexo.setSelected(false);
			
			//this.jInternalFrameDetalleFormTipoSexo.dispose();
			//this.jInternalFrameDetalleFormTipoSexo=null;
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoSexoConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirFrameReporteDinamicoTipoSexo() throws Exception {	    	        
	    try {
			
			this.jInternalFrameReporteDinamicoTipoSexo.setVisible(true);
	        this.jInternalFrameReporteDinamicoTipoSexo.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoSexoConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void abrirFrameImportacionTipoSexo() throws Exception {	    	        		
	    try {			
			this.jInternalFrameImportacionTipoSexo.setVisible(true);
	        this.jInternalFrameImportacionTipoSexo.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoSexoConstantesFunciones.CLASSNAME);
	    }		
	}	
	
	
	
	
	
	public void abrirFrameOrderByTipoSexo() throws Exception {	    	        		
	    try {
			this.jInternalFrameOrderByTipoSexo.setVisible(true);
	        this.jInternalFrameOrderByTipoSexo.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoSexoConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameOrderByTipoSexo() throws Exception {	    	        		
	    try {			
			this.jInternalFrameOrderByTipoSexo.setVisible(false);
	        this.jInternalFrameOrderByTipoSexo.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoSexoConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameReporteDinamicoTipoSexo() throws Exception {			
	    try {
			this.jInternalFrameReporteDinamicoTipoSexo.setVisible(false);
	        this.jInternalFrameReporteDinamicoTipoSexo.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoSexoConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameImportacionTipoSexo() throws Exception {	    	        		
	    try {
			this.jInternalFrameImportacionTipoSexo.setVisible(false);
	        this.jInternalFrameImportacionTipoSexo.setSelected(false);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoSexoConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	
	public void jButtonModificarTipoSexoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.modificarTipoSexo(evt,-1,false);
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoSexoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void modificarTipoSexo(ActionEvent evt,int rowIndex,Boolean esRelaciones) throws Exception {   
		try {
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosTipoSexo.getSelectedRow();
			}
			
			this.habilitarDeshabilitarControlesTipoSexo(true);
			//this.isEsNuevoTipoSexo=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tiposexo =(TipoSexo) this.tiposexoLogic.getTipoSexos().toArray()[this.jTableDatosTipoSexo.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.tiposexo =(TipoSexo) this.tiposexos.toArray()[this.jTableDatosTipoSexo.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.actualizarEstadoCeldasBotonesTipoSexo("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesTipoSexo(false) ;
			
			if(tiposexoSessionBean.getConGuardarRelaciones()) {
			
			}
			
			if(TipoSexoJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleTipoSexo(esRelaciones);
			}
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualTipoSexo(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoSexoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarFilaTablaTipoSexoActual() { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL
			Integer intSelectedRow = this.jTableDatosTipoSexo.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tiposexo =(TipoSexo) this.tiposexoLogic.getTipoSexos().toArray()[this.jTableDatosTipoSexo.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tiposexo =(TipoSexo) this.tiposexos.toArray()[this.jTableDatosTipoSexo.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoSexoConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void seleccionarTipoSexo(ActionEvent evt,int rowIndex) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormTipoSexo==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosTipoSexo.getSelectedRow();
			}
			
			//this.habilitarDeshabilitarControlesTipoSexo(true);
			//this.isEsNuevoTipoSexo=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tiposexo =(TipoSexo) this.tiposexoLogic.getTipoSexos().toArray()[this.jTableDatosTipoSexo.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.tiposexo =(TipoSexo) this.tiposexos.toArray()[this.jTableDatosTipoSexo.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.jInternalFrameParent.setIdCombosCodigoDesdeBusquedaForeignKey(this.tiposexo.getId(),this.sTipoBusqueda);
			
			this.dispose();
			
			//this.actualizarEstadoCeldasBotonesTipoSexo("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			/*
			this.inicializarActualizarBindingBotonesTipoSexo(false) ;
			
			if(TipoSexoJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleTipoSexo(esRelaciones);
			}
			*/
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualTipoSexo(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoSexoConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void setIdCombosCodigoDesdeBusquedaForeignKey(Long id,String sType)throws Exception{
		
		try {
		} catch(Exception e) {
			throw e;
		}
	}
	
		
	
	
	public void jButtonActualizarTipoSexoActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tiposexoLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingParametrosReportesTipoSexo(false);
			
			//if(!this.isEsNuevoTipoSexo) {								
				int intSelectedRow = this.jTableDatosTipoSexo.getSelectedRow();	
				
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tiposexo =(TipoSexo) this.tiposexoLogic.getTipoSexos().toArray()[this.jTableDatosTipoSexo.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.tiposexo =(TipoSexo) this.tiposexos.toArray()[this.jTableDatosTipoSexo.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
			//}
				
			if(TipoSexoJInternalFrame.ISBINDING_MANUAL_TABLA) {
				this.setVariablesFormularioToObjetoActualTipoSexo(this.tiposexo,true);
				this.setVariablesFormularioToObjetoActualForeignKeysTipoSexo(this.tiposexo);
				
			}
			
			if(this.permiteMantenimiento(this.tiposexo)) {	
				this.actualizar();
				
				if(!this.isGuardarCambiosEnLote && !this.tiposexoSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
					
					this.isEsNuevoTipoSexo=true;
					this.inicializarActualizarBindingTablaTipoSexo(false);
					this.isEsNuevoTipoSexo=false;
				
				} else {					
					
					//PARA RELACIONADO ACTUALIZAR FILA TOTALES
					this.isEsNuevoTipoSexo=true;
					this.procesoActualizarFilaTotales(false,"MANTENIMIENTO");
					this.isEsNuevoTipoSexo=false;
				}
						
								
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesTipoSexo(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualTipoSexo(false);
				
				this.habilitarDeshabilitarControlesTipoSexo(false);
			
												
				
				if(TipoSexoJInternalFrame.CON_DATOS_FRAME) {
					if(!this.isPostAccionSinCerrar) {
						this.cerrarFrameDetalleTipoSexo();
					}
				}
				
				if(this.isPostAccionNuevo) {
					this.jButtonNuevoTipoSexoActionPerformed(evt,tiposexoSessionBean.getConGuardarRelaciones());
				} else {
					if(this.isPostAccionSinCerrar) {
						Integer intSelectedRowActual=this.getIndiceActualTipoSexo(this.tiposexo,intSelectedRow);
						
						if(intSelectedRow>-1) {
							this.jTableDatosTipoSexo.setRowSelectionInterval(intSelectedRowActual, intSelectedRowActual);
							this.jButtonIdActionPerformed(evt,intSelectedRowActual,tiposexoSessionBean.getConGuardarRelaciones(),false);
						}
					}
				}
				
				this.cancelar(false);
				
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tiposexoLogic.commitNewConnexionToDeep();
			}
			
			
			if(this.jInternalFrameParent!=null) { //&& this.isEsMantenimientoRelacionado) {
				Boolean esUsoDesdeHijoLocal=true;
				String sTipo="Formulario";
				Boolean conIrServidorAplicacionParent=false;
				Long id=this.tiposexo.getId();
				ArrayList<String> arrClasses=new ArrayList<String>();
				
				GeneralEntityParameterGeneral generalEntityParameterGeneral=new GeneralEntityParameterGeneral();
				
				generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
				generalEntityParameterGeneral.setsDominio("Formulario");
				generalEntityParameterGeneral.setsDominioTipo(TipoSexo.class.getName());
				
				this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoSexo.class.getName(),sTipo,"FORMULARIO",esControlTabla,conIrServidorAplicacionParent,
					id,this, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.FORM,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
					evt,generalEntityParameterGeneral,this);
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tiposexoLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,TipoSexoConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tiposexoLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonEliminarTipoSexoActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tiposexoLogic.getNewConnexionToDeep("");
			}
			
			int intSelectedRow = this.jTableDatosTipoSexo.getSelectedRow();	       
							
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tiposexo =(TipoSexo) this.tiposexoLogic.getTipoSexos().toArray()[this.jTableDatosTipoSexo.convertRowIndexToModel(intSelectedRow)];
				this.tiposexo.setIsDeleted(true);
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.tiposexo =(TipoSexo) this.tiposexos.toArray()[this.jTableDatosTipoSexo.convertRowIndexToModel(intSelectedRow)];
				this.tiposexo.setIsDeleted(true);
			}
			//ARCHITECTURE
			
			if(this.permiteMantenimiento(this.tiposexo)) {
				this.eliminar();
				
				if(!this.isGuardarCambiosEnLote && !this.tiposexoSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
				}
				
				((TipoSexoModel) this.jTableDatosTipoSexo.getModel()).fireTableRowsDeleted(intSelectedRow,intSelectedRow);
				
				this.isEsNuevoTipoSexo=true;
				this.inicializarActualizarBindingTablaTipoSexo(false);
				this.isEsNuevoTipoSexo=false;									
					
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesTipoSexo(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualTipoSexo(false);
				
				this.habilitarDeshabilitarControlesTipoSexo(false);
				
				
				
				if(TipoSexoJInternalFrame.CON_DATOS_FRAME) {
					this.cerrarFrameDetalleTipoSexo();
				}
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tiposexoLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tiposexoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,TipoSexoConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tiposexoLogic.closeNewConnexionToDeep();
			}
		}		
	}
		
	public void jButtonCancelarTipoSexoActionPerformed(ActionEvent evt) throws Exception {                                         	   	       
	  	try {
			if(jTableDatosTipoSexo.getRowCount()>=1) {
				jTableDatosTipoSexo.removeRowSelectionInterval(0, jTableDatosTipoSexo.getRowCount()-1);						
			}
						
			this.invalidValues=new InvalidValue[0];
			this.habilitarDeshabilitarControlesTipoSexo(false);
			this.cancelar(true);			
			this.inicializarActualizarBindingTablaTipoSexo(false);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesTipoSexo(false) ;
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualTipoSexo(false) ;
			
			this.isEsNuevoTipoSexo=false;
			
			if(TipoSexoJInternalFrame.CON_DATOS_FRAME) {
				this.cerrarFrameDetalleTipoSexo();
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoSexoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonGuardarCambiosTipoSexoActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tiposexoLogic.getNewConnexionToDeep("");
			}
			
			//this.estaModoGuardarCambios=true;
			
	    	this.guardarCambios();
			
			if(!this.isErrorGuardar) {
				this.procesarBusqueda(this.sAccionBusqueda);
				
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingTipoSexo(false);
				
				//SI ES MANUAL
				if(TipoSexoJInternalFrame.ISBINDING_MANUAL) {				
					//this.inicializarActualizarBindingManualTipoSexo();				
				}
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tiposexoLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tiposexoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,TipoSexoConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tiposexoLogic.closeNewConnexionToDeep();
			}
			
			//this.estaModoGuardarCambios=false;
		}
	}
	
	public void jButtonNuevoGuardarCambiosTipoSexoActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			this.estaModoNuevo=true;
			this.estaModoNuevoGuardarCambios=true;
			
			//LO HACE NUEVOPREPARAR
			//this.iIdNuevoTipoSexo--;			
			//TipoSexo tiposexoAux= new TipoSexo();			
			//tiposexoAux.setId(this.iIdNuevoTipoSexo);
			
			if(this.jInternalFrameDetalleFormTipoSexo==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.aumentarTamanioFilaNuevaTablaTipoSexo();
			
			if(this.conTotales) {
				this.quitarFilaTotales();
			}
			
			this.nuevoPreparar(true);
			
			this.setVariablesFormularioToObjetoActualForeignKeysTipoSexo(this.tiposexo);
			
			this.tiposexo.setsType("NUEVO_GUARDAR_CAMBIOS");
			
			//LO HACE NUEVOPREPARAR
			/*
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				this.tiposexoLogic.getTipoSexos().add(this.tiposexoAux);
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				this.tiposexos.add(this.tiposexoAux);				
			}
			*/
			
			this.inicializarActualizarBindingTablaTipoSexo(false);
			
			this.jTableDatosTipoSexo.setRowSelectionInterval(this.getIndiceNuevoTipoSexo(), this.getIndiceNuevoTipoSexo());
			
			int iLastRow =  this.jTableDatosTipoSexo.getRowCount () - 1;
			Rectangle rectangle = this.jTableDatosTipoSexo.getCellRect(iLastRow, 0, true);
			
			this.jTableDatosTipoSexo.scrollRectToVisible(rectangle);
			
			//FILA TOTALES
			if(this.conTotales) {
				this.crearFilaTotales();
				
				this.inicializarActualizarBindingTablaTipoSexo(false);
			}

		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,TipoSexoConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;
			this.estaModoNuevoGuardarCambios=false;
		}
	}		
	
	public void jButtonRecargarInformacionTipoSexoActionPerformed(ActionEvent evt) throws Exception {    		
		try {
			this.iNumeroPaginacionPagina=0;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tiposexoLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingTipoSexo(false,false);
			
	    	this.recargarInformacion();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingTipoSexo(false);
			
			//SI ES MANUAL
			if(TipoSexoJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualTipoSexo();
			}
			
			//this.abrirFrameTreeTipoSexo();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tiposexoLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tiposexoLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,TipoSexoConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tiposexoLogic.closeNewConnexionToDeep();
			}
		}	
	}
	
	
	public void jButtonGenerarImportacionTipoSexoActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedReader bufferedReader = null;
		String sXmlStringFile="";
		String sPath="";
		this.arrDatoGeneralMinimos= new  ArrayList<DatoGeneralMinimo>();
		DatoGeneralMinimo datoGeneralMinimo=new DatoGeneralMinimo();
		String sLine="";
		
		try {			
			if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR IMPORTACION DE Tipo SexoS ?", "MANTENIMIENTO DE Tipo Sexo", JOptionPane.OK_CANCEL_OPTION) == 0) {
				bufferedReader = new BufferedReader(new FileReader(this.jInternalFrameImportacionTipoSexo.getFileImportacion().getAbsolutePath()));
								
				while ((sLine = bufferedReader.readLine()) != null) {
					datoGeneralMinimo=new DatoGeneralMinimo();
					datoGeneralMinimo.setsDescripcion(sLine);
					
					this.arrDatoGeneralMinimos.add(datoGeneralMinimo);
				}
				
				this.actualizarParametrosGeneralTipoSexo();
						
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {						
					this.tiposexoReturnGeneral=tiposexoLogic.procesarImportacionTipoSexosWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this.arrDatoGeneralMinimos,this.tiposexoParameterGeneral);
						
				} else if(Constantes.ISUSAEJBREMOTE) {
						
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
						
				this.procesarTipoSexoReturnGeneral();
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoSexoConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedReader != null) {
				bufferedReader.close();
			}	
		}				
	}
	
	
	
	public void jButtonAbrirImportacionTipoSexoActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {
			int iReturnArchivo = this.jInternalFrameImportacionTipoSexo.getjFileChooserImportacion().showOpenDialog(this);
 
            if (iReturnArchivo == JFileChooser.APPROVE_OPTION) {
            	this.jInternalFrameImportacionTipoSexo.setFileImportacion(this.jInternalFrameImportacionTipoSexo.getjFileChooserImportacion().getSelectedFile());
            	
				this.jInternalFrameImportacionTipoSexo.getjTextFieldPathArchivoImportacion().setText(this.jInternalFrameImportacionTipoSexo.getFileImportacion().getName());
				
				//System.out.println("ARCHIVO ESCOGIDO: "+this.fileImportacionTipoSexo.getName());
				
            } else {
                //System.out.println("CANCELAR SELECCION");
				this.jInternalFrameImportacionTipoSexo.getjTextFieldPathArchivoImportacion().setText("SELECCION CANCELADA");
            }			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoSexoConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedWriter != null) {
				bufferedWriter.close();
			}	
		}		
	}
	
	
	public void jButtonGenerarReporteDinamicoTipoSexoActionPerformed(ActionEvent evt) throws Exception {    		
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {	
		
		ArrayList<TipoSexo> tiposexosSeleccionados=new ArrayList<TipoSexo>();		

		tiposexosSeleccionados=this.getTipoSexosSeleccionados(true);
		
		
		this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoTipoSexo.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();
		
		this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoTipoSexo.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
		
		
		this.sTipoArchivoReporte=this.sTipoArchivoReporteDinamico;
		
		//this.sTipoReporteExtra="Base";
		
			InputStream reportFile=null;
			InputStream imageFile=null;
			
			imageFile=AuxiliarImagenes.class.getResourceAsStream("LogoReporte.jpg");			
				
		
		
			reportFile = AuxiliarReportes.class.getResourceAsStream("TipoSexoBaseDesign.jrxml");	
			
			sPath=this.parametroGeneralUsuario.getpath_exportar()+"TipoSexoBaseDesign.jrxml";
			
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
			
			this.generarReporteTipoSexos("Todos",tiposexosSeleccionados );

			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tiposexoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				//DEBE APARECER EL REPORTE DIRECTAMENTE
				//JOptionPane.showMessageDialog(this,"GENERADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Sexo",JOptionPane.INFORMATION_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoSexoConstantesFunciones.CLASSNAME);
		
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
		
		for(int index:this.jInternalFrameReporteDinamicoTipoSexo.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoTipoSexo.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case TipoSexoConstantesFunciones.LABEL_IDEMPRESA:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_Empresa_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_Empresa_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_Empresa_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_Empresa_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case TipoSexoConstantesFunciones.LABEL_CODIGO:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_digo_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_digo_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_digo_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_digo_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case TipoSexoConstantesFunciones.LABEL_NOMBRE:
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
		
		if(this.jInternalFrameReporteDinamicoTipoSexo.getjCheckBoxConGraficoDinamico().isSelected()) {
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
		reporte=((Reporte)this.jInternalFrameReporteDinamicoTipoSexo.getjComboBoxColumnaCategoriaGrafico().getSelectedItem());
				
		//TIPO GRAFICO REPORTE
		reporteTipoGraficoReporte=((Reporte)this.jInternalFrameReporteDinamicoTipoSexo.getjComboBoxTiposGraficosReportesDinamico().getSelectedItem());
		
		String sTipoGraficoReporte=reporteTipoGraficoReporte.getsCodigo();
		
		switch(reporte.getsCodigo()) {
			
				case TipoSexoConstantesFunciones.LABEL_IDEMPRESA:
					sNombreCampoCategoria="id_empresa";
					break;

				case TipoSexoConstantesFunciones.LABEL_CODIGO:
					sNombreCampoCategoria="codigo";
					break;

				case TipoSexoConstantesFunciones.LABEL_NOMBRE:
					sNombreCampoCategoria="nombre";
					break;
					
			default :
				break;
		}		
		//CATEGORIA GRAFICO
		
		//CATEGORIA VALOR				
		reporteCategoriaValor=((Reporte)this.jInternalFrameReporteDinamicoTipoSexo.getjComboBoxColumnaCategoriaValor().getSelectedItem());
		
		switch(reporteCategoriaValor.getsCodigo()) {
			
				case TipoSexoConstantesFunciones.LABEL_IDEMPRESA:
					sNombreCampoCategoriaValor="id_empresa";
					break;

				case TipoSexoConstantesFunciones.LABEL_CODIGO:
					sNombreCampoCategoriaValor="codigo";
					break;

				case TipoSexoConstantesFunciones.LABEL_NOMBRE:
					sNombreCampoCategoriaValor="nombre";
					break;
					
			default :
				break;
		}	
		//CATEGORIA VALOR
		
		//VALORES GRAFICO
		for(int index:this.jInternalFrameReporteDinamicoTipoSexo.getjListColumnasValoresGrafico().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoTipoSexo.getjListColumnasValoresGrafico().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case TipoSexoConstantesFunciones.LABEL_IDEMPRESA:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Empresa",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_empresa");
					break;

				case TipoSexoConstantesFunciones.LABEL_CODIGO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Codigo",sNombreCampoCategoria,sNombreCampoCategoriaValor,"codigo");
					break;

				case TipoSexoConstantesFunciones.LABEL_NOMBRE:
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
	
	public void jButtonGenerarExcelReporteDinamicoTipoSexoActionPerformed(ActionEvent evt) throws Exception {		
		ArrayList<TipoSexo> tiposexosSeleccionados=new ArrayList<TipoSexo>();		
		
		tiposexosSeleccionados=this.getTipoSexosSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tiposexo";//.xls";
		
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
		
			Sheet sheet = workbook.createSheet("TipoSexos");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			Row row = sheet.createRow(iRow);
			Cell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");
			
			for(int index:this.jInternalFrameReporteDinamicoTipoSexo.getjListColumnasSelectReporte().getSelectedIndices()) {
				reporte=(Reporte)this.jInternalFrameReporteDinamicoTipoSexo.getjListColumnasSelectReporte().getModel().getElementAt(index);
				
				switch(reporte.getsCodigo()) {
					
				case TipoSexoConstantesFunciones.LABEL_IDEMPRESA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(TipoSexoConstantesFunciones.LABEL_IDEMPRESA);
					iRow++;

					for(TipoSexo tiposexo:tiposexosSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(tiposexo.getempresa_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case TipoSexoConstantesFunciones.LABEL_CODIGO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(TipoSexoConstantesFunciones.LABEL_CODIGO);
					iRow++;

					for(TipoSexo tiposexo:tiposexosSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(tiposexo.getcodigo());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case TipoSexoConstantesFunciones.LABEL_NOMBRE:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(TipoSexoConstantesFunciones.LABEL_NOMBRE);
					iRow++;

					for(TipoSexo tiposexo:tiposexosSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(tiposexo.getnombre());
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
			//	this.getFilaCabeceraExportarExcelTipoSexo(row);				
			//	iRow++;
			//}				
			
			//for(TipoSexo tiposexoAux:tiposexosSeleccionados) {
			//	row = sheet.createRow(iRow);
				
			//	this.getFilaDatosExportarExcelTipoSexo(tiposexoAux,row);
				
			//	iRow++;
			//}
			
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tiposexoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Sexo",JOptionPane.INFORMATION_MESSAGE);
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
				this.tiposexoLogic.getNewConnexionToDeep("");
			}
			
			this.idActual=idActual;
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda("PorId");
				    	
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingTipoSexo(false);
			
			//SI ES MANUAL
			if(TipoSexoJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualTipoSexo();
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tiposexoLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tiposexoLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger);
			
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tiposexoLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonAnterioresTipoSexoActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion-=this.iNumeroPaginacion;
			/*
			if(this.iNumeroPaginacion<0) {
				this.iNumeroPaginacion=0;
			}
			*/
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tiposexoLogic.getNewConnexionToDeep("");
			}
			
			this.anteriores();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingTipoSexo(false);
			
			//SI ES MANUAL
			if(TipoSexoJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualTipoSexo();
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tiposexoLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tiposexoLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,TipoSexoConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tiposexoLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonSiguientesTipoSexoActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion+=this.iNumeroPaginacion;
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tiposexoLogic.getNewConnexionToDeep("");
			}
			
			this.siguientes();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingTipoSexo(false);
			
			//SI ES MANUAL
			if(TipoSexoJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualTipoSexo();
			}		
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tiposexoLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tiposexoLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,TipoSexoConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tiposexoLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void aumentarTamanioFilaNuevaTablaTipoSexo() throws Exception {		
		Dimension dimensionMinimum=this.jTableDatosTipoSexo.getMinimumSize();
		Dimension dimensionMaximum=this.jTableDatosTipoSexo.getMaximumSize();
		Dimension dimensionPreferred=this.jTableDatosTipoSexo.getPreferredSize();
	
		double iHeightConFilaNueva=dimensionPreferred.getHeight();
		
		iHeightConFilaNueva+=this.jTableDatosTipoSexo.getRowHeight();
		
		dimensionMinimum.setSize(dimensionMinimum.getWidth(),iHeightConFilaNueva);
		dimensionMaximum.setSize(dimensionMaximum.getWidth(),iHeightConFilaNueva);
		dimensionPreferred.setSize(dimensionPreferred.getWidth(),iHeightConFilaNueva);
		
		this.jTableDatosTipoSexo.setMinimumSize(dimensionMinimum);
		this.jTableDatosTipoSexo.setMaximumSize(dimensionMaximum);
		this.jTableDatosTipoSexo.setPreferredSize(dimensionPreferred);	
	}
	
	public void inicializarActualizarBindingTipoSexo(Boolean esInicializar) throws Exception {
		this.inicializarActualizarBindingTipoSexo(esInicializar,true);
	}
	
	public void inicializarActualizarBindingTipoSexo(Boolean esInicializar,Boolean conTabla) throws Exception {		
		if(conTabla) {
			this.inicializarActualizarBindingTablaTipoSexo(esInicializar);
		}
		
		this.inicializarActualizarBindingBotonesTipoSexo(esInicializar);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.tiposexoSessionBean.getEsGuardarRelacionado()) {
			try{this.inicializarActualizarBindingBusquedasTipoSexo(esInicializar);}catch(Exception e){e.printStackTrace();}
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesTipoSexo(esInicializar) ;
			
			this.inicializarActualizarBindingParametrosReportesTipoSexo(esInicializar) ;
		}
		
		if(esInicializar) {
			if( !TipoSexoJInternalFrame.ISBINDING_MANUAL_TABLA ||
			   	!TipoSexoJInternalFrame.ISBINDING_MANUAL) {
			   	
			}
		}
	}
	
	public void inicializarActualizarBindingManualTipoSexo() throws Exception {		
		//NO SE NECESITA HACER BINDING OTRA VEZ
		//this.inicializarActualizarBindingTablaTipoSexo();
		
		this.inicializarActualizarBindingBotonesManualTipoSexo(true);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.tiposexoSessionBean.getEsGuardarRelacionado()) {
			
			this.inicializarActualizarBindingBusquedasManualTipoSexo();			
			
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesTipoSexo() ;
			
			this.inicializarActualizarBindingParametrosReportesPostAccionesManualTipoSexo(false) ;			
			
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesPostAccionesManualTipoSexo(Boolean esSetControles) throws Exception {
		try	{					
			if(!esSetControles) {
				this.isSeleccionarTodos=this.jCheckBoxSeleccionarTodosTipoSexo.isSelected();
				this.isSeleccionados=this.jCheckBoxSeleccionadosTipoSexo.isSelected();
				
				
				this.conGraficoReporte=this.jCheckBoxConGraficoReporteTipoSexo.isSelected();															
				
				
				if(this.jInternalFrameDetalleFormTipoSexo!=null) {
				this.isPostAccionNuevo=this.jInternalFrameDetalleFormTipoSexo.jCheckBoxPostAccionNuevoTipoSexo.isSelected();
				this.isPostAccionSinCerrar=this.jInternalFrameDetalleFormTipoSexo.jCheckBoxPostAccionSinCerrarTipoSexo.isSelected();
				this.isPostAccionSinMensaje=this.jInternalFrameDetalleFormTipoSexo.jCheckBoxPostAccionSinMensajeTipoSexo.isSelected();
				}
			
			} else {
				this.jCheckBoxSeleccionarTodosTipoSexo.setSelected(this.isSeleccionarTodos);
				this.jCheckBoxSeleccionadosTipoSexo.setSelected(this.isSeleccionados);
				
				
				this.jCheckBoxConGraficoReporteTipoSexo.setSelected(this.conGraficoReporte);				
				
				
				if(this.jInternalFrameDetalleFormTipoSexo!=null) {
				this.jInternalFrameDetalleFormTipoSexo.jCheckBoxPostAccionNuevoTipoSexo.setSelected(this.isPostAccionNuevo);
				this.jInternalFrameDetalleFormTipoSexo.jCheckBoxPostAccionSinCerrarTipoSexo.setSelected(this.isPostAccionSinCerrar);
				this.jInternalFrameDetalleFormTipoSexo.jCheckBoxPostAccionSinMensajeTipoSexo.setSelected(this.isPostAccionSinMensaje);
				}
			}
			
			
			if(this.jComboBoxTiposPaginacionTipoSexo.getSelectedItem()!=null) {
				this.sTipoPaginacion=((Reporte)this.jComboBoxTiposPaginacionTipoSexo.getSelectedItem()).getsCodigo();			
			}
			
			
			
			if(this.jInternalFrameDetalleFormTipoSexo!=null) {
			this.sTipoAccionFormulario=((Reporte)this.jInternalFrameDetalleFormTipoSexo.jComboBoxTiposAccionesFormularioTipoSexo.getSelectedItem()).getsCodigo();
			}
			
			
			
			if(!this.conCargarMinimo) {
				this.sTipoArchivoReporte=((Reporte)this.jComboBoxTiposArchivosReportesTipoSexo.getSelectedItem()).getsCodigo();			
				
				if(this.jInternalFrameReporteDinamicoTipoSexo!=null) {
					this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoTipoSexo.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
				}
				
				this.sTipoRelacion=((Reporte)this.jComboBoxTiposRelacionesTipoSexo.getSelectedItem()).getsCodigo();
									
				this.sTipoAccion=((Reporte)this.jComboBoxTiposAccionesTipoSexo.getSelectedItem()).getsCodigo();
													
				this.sTipoSeleccionar=((Reporte)this.jComboBoxTiposSeleccionarTipoSexo.getSelectedItem()).getsCodigo();
									
				this.sTipoReporte=((Reporte)this.jComboBoxTiposReportesTipoSexo.getSelectedItem()).getsCodigo();							
					
				if(this.jInternalFrameReporteDinamicoTipoSexo!=null) {
					this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoTipoSexo.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();							
				}
				
				this.sTipoGraficoReporte=((Reporte)this.jComboBoxTiposGraficosReportesTipoSexo.getSelectedItem()).getsCodigo();											
			}			
			
			this.sValorCampoGeneral=this.jTextFieldValorCampoGeneralTipoSexo.getText();						
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesTipoSexo(Boolean esInicializar) throws Exception {
		try	{	
			if(TipoSexoJInternalFrame.ISBINDING_MANUAL) {
				this. inicializarActualizarBindingParametrosReportesPostAccionesManualTipoSexo(false);
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public void inicializarActualizarBindingtiposArchivosReportesAccionesTipoSexo() throws Exception {
		try	{
			if(TipoSexoJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingtiposArchivosReportesAccionesManualTipoSexo();
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleTipoSexo() throws Exception {
		//TIPOS ACCIONES FORMULARIO	
		this.jInternalFrameDetalleFormTipoSexo.jComboBoxTiposAccionesFormularioTipoSexo.removeAllItems();
				
		for(Reporte reporte:this.tiposAccionesFormulario) {
			this.jInternalFrameDetalleFormTipoSexo.jComboBoxTiposAccionesFormularioTipoSexo.addItem(reporte);
		}
		
		//TIPOS ACCIONES FORMULARIO
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualTipoSexo() throws Exception {
		try	{
			
			//TIPOS ARCHIVOS REPORTES
			this.jComboBoxTiposArchivosReportesTipoSexo.removeAllItems();
				
			for(Reporte reporte:this.tiposArchivosReportes) {
				this.jComboBoxTiposArchivosReportesTipoSexo.addItem(reporte);
			}
			
			
				
			//TIPOS REPORTES
			this.jComboBoxTiposReportesTipoSexo.removeAllItems();
				
			for(Reporte reporte:this.tiposReportes) {
				this.jComboBoxTiposReportesTipoSexo.addItem(reporte);
			}
			
			
			//TIPOS GRAFICOS REPORTES
			this.jComboBoxTiposGraficosReportesTipoSexo.removeAllItems();
				
			for(Reporte reporte:this.tiposGraficosReportes) {
				this.jComboBoxTiposGraficosReportesTipoSexo.addItem(reporte);
			}
			
			
			//TIPOS PAGINACION
			this.jComboBoxTiposPaginacionTipoSexo.removeAllItems();
				
			for(Reporte reporte:this.tiposPaginacion) {
				this.jComboBoxTiposPaginacionTipoSexo.addItem(reporte);
			}
			
			
			if(!this.tiposexoSessionBean.getEsGuardarRelacionado()) {
				this.jComboBoxTiposPaginacionTipoSexo.setSelectedItem(Funciones2.getTipoPaginacionDefecto("NORMAL",this.tiposPaginacion));
			} else {
				this.jComboBoxTiposPaginacionTipoSexo.setSelectedItem(Funciones2.getTipoPaginacionDefecto("RELACIONADO",this.tiposPaginacion));
			}
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposRelacionesTipoSexo.removeAllItems();
				
			for(Reporte reporte:this.tiposRelaciones) {
				this.jComboBoxTiposRelacionesTipoSexo.addItem(reporte);
			}
			
			//TIPOS ACCIONES
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposAccionesTipoSexo.removeAllItems();
				
			for(Reporte reporte:this.tiposAcciones) {
				this.jComboBoxTiposAccionesTipoSexo.addItem(reporte);
			}
			
			//TIPOS ACCIONES			
			
			
			
			//TIPOS ACCIONES FORMULARIO	
			if(this.jInternalFrameDetalleFormTipoSexo!=null) { //if(this.conCargarFormDetalle) {
				this.jInternalFrameDetalleFormTipoSexo.jComboBoxTiposAccionesFormularioTipoSexo.removeAllItems();
				
				for(Reporte reporte:this.tiposAccionesFormulario) {
					this.jInternalFrameDetalleFormTipoSexo.jComboBoxTiposAccionesFormularioTipoSexo.addItem(reporte);
				}
				
			}
			//TIPOS ACCIONES FORMULARIO
			
			
			
			//TIPOS SELECCIONAR
			this.jComboBoxTiposSeleccionarTipoSexo.removeAllItems();
				
			for(Reporte reporte:this.tiposSeleccionar) {
				this.jComboBoxTiposSeleccionarTipoSexo.addItem(reporte);
			}
			
			
			if(this.tiposSeleccionar!=null && this.tiposSeleccionar.size()>1) {
				this.jComboBoxTiposSeleccionarTipoSexo.setSelectedIndex(1);
			}
				
			//REPORTE DINAMICO
			this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualTipoSexo();
							
			//TIPOS COLUMNAS SELECT
			//TIPOS SELECCIONAR
			
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualTipoSexo() throws Exception {
		try	{
			DefaultListModel<Reporte> defaultListModel=new DefaultListModel<Reporte>();
			
			
			//TIPOS ARCHIVOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoTipoSexo!=null) {
				this.jInternalFrameReporteDinamicoTipoSexo.getjComboBoxTiposArchivosReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposArchivosReportesDinamico) {
					this.jInternalFrameReporteDinamicoTipoSexo.getjComboBoxTiposArchivosReportesDinamico().addItem(reporte);
				}
				
			}
			
			//TIPOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoTipoSexo!=null) {
				this.jInternalFrameReporteDinamicoTipoSexo.getjComboBoxTiposReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposReportesDinamico) {
					this.jInternalFrameReporteDinamicoTipoSexo.getjComboBoxTiposReportesDinamico().addItem(reporte);
				}
				
			}
			
			defaultListModel=new DefaultListModel<Reporte>();
			
			if(this.jInternalFrameReporteDinamicoTipoSexo!=null) {
				
				if(this.jInternalFrameReporteDinamicoTipoSexo.getjListColumnasSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoTipoSexo.getjListColumnasSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposColumnasSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoTipoSexo.getjListColumnasSelectReporte().setModel(defaultListModel);									
						
				}	
					
				//TIPOS RELACIONES SELECT
				//TIPOS SELECCIONAR
				defaultListModel=new DefaultListModel<Reporte>();
				if(this.jInternalFrameReporteDinamicoTipoSexo.getjListRelacionesSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoTipoSexo.getjListRelacionesSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposRelacionesSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoTipoSexo.getjListRelacionesSelectReporte().setModel(defaultListModel);									
						
				}	
				
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	
	
	public void inicializarActualizarBindingBusquedasManualTipoSexo()  throws Exception {				
		//BYDAN_BUSQUEDAS		
		
		
	}
	
	
	
	
	public void inicializarActualizarBindingBusquedasTipoSexo(Boolean esInicializar) throws Exception {				
		if(TipoSexoJInternalFrame.ISBINDING_MANUAL) {
			
			this.inicializarActualizarBindingBusquedasManualTipoSexo();			
			
		} else {
		}
	}		
		
	public void inicializarActualizarBindingTablaTipoSexo() throws Exception {
		this.inicializarActualizarBindingTablaTipoSexo(false);
	}
	
	
	public void inicializarActualizarBindingTablaOrderByTipoSexo() {
		//TABLA OrderBy	
		TableColumn tableColumn=new TableColumn();
		Integer iWidthTableDefinicionOrderBy=0;			
			
		this.jInternalFrameOrderByTipoSexo.getjTableDatosOrderBy().setModel(new TablaGeneralOrderByModel(this.arrOrderBy));
					
		//DEFINIR RENDERERS OrderBy
		tableColumn=this.jInternalFrameOrderByTipoSexo.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByTipoSexo.getjTableDatosOrderBy(),OrderBy.ISSELECTED));			
		//tableColumn.addPropertyChangeListener(new TipoSexoPropertyChangeListener());
					
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		iWidthTableDefinicionOrderBy+=50;
					
		tableColumn=this.jInternalFrameOrderByTipoSexo.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByTipoSexo.getjTableDatosOrderBy(),OrderBy.NOMBRE));
		//tableColumn.addPropertyChangeListener(new TipoSexoPropertyChangeListener());
					
		tableColumn.setPreferredWidth(150); 	 
		tableColumn.setWidth(150); 	 
		tableColumn.setMinWidth(150);
		tableColumn.setMaxWidth(150);
				
		iWidthTableDefinicionOrderBy+=150;
					
		//tableColumn=this.jTableDatosTipoSexoOrderBy.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTipoSexoOrderBy,OrderBy.NOMBREDB));			
		////tableColumn.addPropertyChangeListener(new TipoSexoPropertyChangeListener());
								
		tableColumn=this.jInternalFrameOrderByTipoSexo.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByTipoSexo.getjTableDatosOrderBy(),OrderBy.ESDESC));
		//tableColumn.addPropertyChangeListener(new TipoSexoPropertyChangeListener());
												
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		((AbstractTableModel) this.jInternalFrameOrderByTipoSexo.getjTableDatosOrderBy().getModel()).fireTableDataChanged();
				
		iWidthTableDefinicionOrderBy+=50;
	}
	
	
	
	public void inicializarActualizarBindingTablaTipoSexo(Boolean esInicializar) throws Exception {
		Boolean isNoExiste=false;
		Integer iCountNumeroColumnasNormal=0;
		Integer iCountNumeroColumnasFk=0;
		
		this.iWidthTableDefinicion=0;
		
		int iSizeTabla=0;
		
		iSizeTabla=this.getSizeTablaDatos();
		
	if(esInicializar || ConstantesSwing.FORZAR_INICIALIZAR_TABLA) {//esInicializar
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			isNoExiste=tiposexoLogic.getTipoSexos().size()==0;
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			isNoExiste=tiposexos.size()==0;
		}
		//ARCHITECTURE
			
		if(isNoExiste) {
			if(this.iNumeroPaginacion-this.iNumeroPaginacion>0) {
				this.iNumeroPaginacion-=this.iNumeroPaginacion;
			}
		}
		
		TableColumn tableColumn=new TableColumn();
		
		if(TipoSexoJInternalFrame.ISBINDING_MANUAL_TABLA) {
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.jTableDatosTipoSexo.setModel(new TipoSexoModel(this.tiposexoLogic.getTipoSexos(),this));
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.jTableDatosTipoSexo.setModel(new TipoSexoModel(this.tiposexos,this));
			}
			//ARCHITECTURE
			
							
			
			
			if(this.jInternalFrameOrderByTipoSexo!=null && this.jInternalFrameOrderByTipoSexo.getjTableDatosOrderBy()!=null) {
				this.inicializarActualizarBindingTablaOrderByTipoSexo();
			}
			
								
			//DEFINIR RENDERERS
			tableColumn=this.jTableDatosTipoSexo.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTipoSexo,Constantes2.S_SELECCIONAR));
			//tableColumn.addPropertyChangeListener(new TipoSexoPropertyChangeListener());
			tableColumn.setCellRenderer(new BooleanRenderer(true,"Seleccionar "+TipoSexoConstantesFunciones.SCLASSWEBTITULO,tiposexoConstantesFunciones.resaltarSeleccionarTipoSexo,true,false,"","",this));
			tableColumn.setCellEditor(new BooleanEditorRenderer(true,"Seleccionar "+TipoSexoConstantesFunciones.SCLASSWEBTITULO,tiposexoConstantesFunciones.resaltarSeleccionarTipoSexo,false,"","",this));			
			
			tableColumn.setPreferredWidth(50); 	 
			tableColumn.setWidth(50); 	 
			tableColumn.setMinWidth(50); 
			tableColumn.setMaxWidth(50); 
			
			this.iWidthTableDefinicion+=50;
			
			


			tableColumn=this.jTableDatosTipoSexo.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTipoSexo,TipoSexoConstantesFunciones.LABEL_ID));

		if(this.tiposexoConstantesFunciones.mostraridTipoSexo && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,TipoSexoConstantesFunciones.LABEL_ID,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.tiposexoConstantesFunciones.resaltaridTipoSexo,this.tiposexoConstantesFunciones.activaridTipoSexo,this,true,"idTipoSexo","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.tiposexoConstantesFunciones.resaltaridTipoSexo,this.tiposexoConstantesFunciones.activaridTipoSexo,this,true,"idTipoSexo","BASICO",false));

			tableColumn.setPreferredWidth(50);
			tableColumn.setWidth(50);
			tableColumn.setMinWidth(50);
			tableColumn.setMaxWidth(50);

			this.iWidthTableDefinicion+=50;
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosTipoSexo.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTipoSexo,TipoSexoConstantesFunciones.LABEL_IDEMPRESA));

		if(this.tiposexoConstantesFunciones.mostrarid_empresaTipoSexo && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,TipoSexoConstantesFunciones.LABEL_IDEMPRESA,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++) && Constantes.ISDEVELOPING) {
			tableColumn.setCellRenderer(new EmpresaTableCell(this.empresasForeignKey,this.tiposexoConstantesFunciones.resaltarid_empresaTipoSexo,this,this.tiposexoConstantesFunciones.activarid_empresaTipoSexo));
			tableColumn.setCellEditor(new EmpresaTableCell(this.empresasForeignKey,this.tiposexoConstantesFunciones.resaltarid_empresaTipoSexo,this,this.tiposexoConstantesFunciones.activarid_empresaTipoSexo,false,"id_empresaTipoSexo","GLOBAL"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new TipoSexoPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosTipoSexo.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTipoSexo,TipoSexoConstantesFunciones.LABEL_CODIGO));

		if(this.tiposexoConstantesFunciones.mostrarcodigoTipoSexo && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,TipoSexoConstantesFunciones.LABEL_CODIGO,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.tiposexoConstantesFunciones.resaltarcodigoTipoSexo,this.tiposexoConstantesFunciones.activarcodigoTipoSexo,this,true,"codigoTipoSexo","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.tiposexoConstantesFunciones.resaltarcodigoTipoSexo,this.tiposexoConstantesFunciones.activarcodigoTipoSexo,this,true,"codigoTipoSexo","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new TipoSexoPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosTipoSexo.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTipoSexo,TipoSexoConstantesFunciones.LABEL_NOMBRE));

		if(this.tiposexoConstantesFunciones.mostrarnombreTipoSexo && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,TipoSexoConstantesFunciones.LABEL_NOMBRE,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.tiposexoConstantesFunciones.resaltarnombreTipoSexo,this.tiposexoConstantesFunciones.activarnombreTipoSexo,this,true,"nombreTipoSexo","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.tiposexoConstantesFunciones.resaltarnombreTipoSexo,this.tiposexoConstantesFunciones.activarnombreTipoSexo,this,true,"nombreTipoSexo","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new TipoSexoPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}
			
		} else {
		}			
					
		if(!this.tiposexoSessionBean.getEsGuardarRelacionado()
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
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.tiposexoSessionBean.getEsGuardarRelacionado()));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.tiposexoSessionBean.getEsGuardarRelacionado()));
	
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosTipoSexo.addColumn(tableColumn);
			
			} else {				
				
				//LO MISMO QUE IF
				
				tableColumn= new TableColumn();
				tableColumn.setIdentifier(sLabelColumnAccion);
				tableColumn.setHeaderValue(sLabelColumnAccion);
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.tiposexoSessionBean.getEsGuardarRelacionado()));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.tiposexoSessionBean.getEsGuardarRelacionado()));
		
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosTipoSexo.addColumn(tableColumn);				
					
				//ELIMINAR
				if(this.isPermisoEliminarTipoSexo && this.isPermisoGuardarCambiosTipoSexo) {
					tableColumn= new TableColumn();
					tableColumn.setIdentifier(Constantes2.S_ELI);
					tableColumn.setHeaderValue(sLabelColumnAccionEli);
					tableColumn.setCellRenderer(new IdTableCell(this,false,true,this.tiposexoSessionBean.getEsGuardarRelacionado()));
					tableColumn.setCellEditor(new IdTableCell(this,false,true,this.tiposexoSessionBean.getEsGuardarRelacionado()));
			
					tableColumn.setPreferredWidth(65); 	 
					tableColumn.setWidth(65); 	 
					tableColumn.setMinWidth(65); 
					tableColumn.setMaxWidth(65);
					
					this.iWidthTableDefinicion+=65;
						
					this.jTableDatosTipoSexo.addColumn(tableColumn);
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
			
			this.jTableDatosTipoSexo.addColumn(tableColumn);
			*/
		}
		
		Integer iUltimaColumna=0;//1
		Integer iNuevaPosicionColumna=0;
		
		
		//PERMITE ELIMINAR SIMPLE
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarTipoSexo && this.isPermisoGuardarCambiosTipoSexo) {
				iUltimaColumna++;
			}	
		}
		
		//PERMITE EDITAR SIMPLE
		iUltimaColumna++;	
		
				
		
		//MOVIA SELECCIONAR
		//iUltimaColumna++;
		
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarTipoSexo && this.isPermisoGuardarCambiosTipoSexo) {
				//REUBICA ELIMINAR SIMPLE
				jTableDatosTipoSexo.moveColumn(this.jTableDatosTipoSexo.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3
					
				iUltimaColumna--;
			}
		}
		//REUBICA EDITAR SIMPLE
		jTableDatosTipoSexo.moveColumn(this.jTableDatosTipoSexo.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3				
		
		
		
		
		//REUBICABA SELECCIONAR
		/*
		if(iUltimaColumna>1) {
			iUltimaColumna--;
		}
		
		//iNuevaPosicionColumna++;
			
		//REUBICA SELECCIONAR FILA CHECK
		jTableDatosTipoSexo.moveColumn(this.jTableDatosTipoSexo.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1		
		*/
		
		//DEFINEN HEADERS
		final TableCellRenderer tableHeaderDefaultCellRenderer = this.jTableDatosTipoSexo.getTableHeader().getDefaultRenderer();
		
		this.jTableDatosTipoSexo.getTableHeader().setDefaultRenderer(new TableCellRendererHeader(this.jTableDatosTipoSexo,tableHeaderDefaultCellRenderer));
	    
		TableColumn column=null;
		
		if(!TipoSexoJInternalFrame.ISBINDING_MANUAL_TABLA) {
			for(int i = 0; i < this.jTableDatosTipoSexo.getColumnModel().getColumnCount(); i++) { 
				column = this.jTableDatosTipoSexo.getColumnModel().getColumn(i); 
				
				if(column.getIdentifier()!=null) {
					//SI SE UTILIZA UN HEADER ES GENERICO
					//column.setHeaderRenderer(new HeaderRenderer(column.getIdentifier().toString()));
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_ELI)) {
					continue;
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_SELECCIONAR)) {
					if(!TipoSexoJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(50); 	 
						column.setWidth(50); 	 
						column.setMinWidth(50); 	
						column.setMaxWidth(50); 
						
						this.iWidthTableDefinicion+=50;
					}
					
				} else {
					if(!TipoSexoJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						column.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						
						this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
					}
				}
			}
		}
		
		this.jTableDatosTipoSexo.setSelectionBackground(FuncionesSwing.getColorSelectedBackground());
		this.jTableDatosTipoSexo.setSelectionForeground(FuncionesSwing.getColorSelectedForeground());
		
		/*
		this.jTableDatosTipoSexo.setDefaultRenderer(Object.class, new DefaultTableCellRenderer() {
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
							iSize=tiposexoLogic.getTipoSexos().size()-1;
								
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							iSize=tiposexos.size()-1;
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
		//this.jTableDatosTipoSexo.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA);
		
		/*
		column=this.jTableDatosTipoSexo.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosSistema,Constantes2.S_SELECCIONAR));
		
		if(column!=null) {
			column.setPreferredWidth(25); 	 
			column.setWidth(25); 	 
			column.setMinWidth(25); 	
		}
		*/
			
			//CopyTableToTableTotal();
		} else {
			
			this.actualizarVisualTableDatosTipoSexo();
			
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
				
				//this.isEsNuevoTipoSexo=false;
					
				TipoSexoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.tiposexo,new Object(),this.tiposexoParameterGeneral,this.tiposexoReturnGeneral);
			
				if(this.tiposexoSessionBean.getConGuardarRelaciones()) {
					this.dStart=(double)System.currentTimeMillis();
				}
				
				if(this.jInternalFrameDetalleFormTipoSexo==null) {
					this.inicializarFormDetalle();
				}
				
				this.inicializarInvalidValues();
				
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosTipoSexo.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosTipoSexo.getSelectedRow();	       
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tiposexo =(TipoSexo) this.tiposexoLogic.getTipoSexos().toArray()[this.jTableDatosTipoSexo.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tiposexo =(TipoSexo) this.tiposexos.toArray()[this.jTableDatosTipoSexo.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//PUEDE SER PARA DUPLICADO O NUEVO TABLA
				
				if(this.tiposexo.getsType().equals("DUPLICADO")
				   || this.tiposexo.getsType().equals("NUEVO_GUARDAR_CAMBIOS")) {
					
					this.isEsNuevoTipoSexo=true;
				
				} else {
					this.isEsNuevoTipoSexo=false;	
				}
				
				//CONTROL VERSION ANTERIOR
				/*
				if(!this.tiposexoSessionBean.getEsGuardarRelacionado()) {
					if(this.tiposexo.getId()>=0 && !this.tiposexo.getIsNew()) {						
						this.isEsNuevoTipoSexo=false;
						
					} else {
						this.isEsNuevoTipoSexo=true;
					}
					
				} else {
					//CONTROLAR PARA RELACIONADO
				}
				*/
				
				//ESTABLECE SI ES RELACIONADO O NO 
				this.habilitarDeshabilitarTipoMantenimientoTipoSexo(esRelaciones);						
				
				this.seleccionarTipoSexo(evt,null,rowIndex);
				
				//SELECCIONA ACTUAL PERO AUN NO SE HA INGRESADO AL SISTEMA
				//SE DESHABILITA POR GUARDAR CAMBIOS
				/*
				if(this.tiposexo.getId()<0) {
					this.isEsNuevoTipoSexo=true;
				}
				*/
				
				if(!this.esParaBusquedaForeignKey) {
					this.modificarTipoSexo(evt,rowIndex,esRelaciones);
				} else {
					this.seleccionarTipoSexo(evt,rowIndex);
				}	
				
				if(this.tiposexoSessionBean.getConGuardarRelaciones()) {
					this.dEnd=(double)System.currentTimeMillis();					
					this.dDif=this.dEnd - this.dStart;
					
					if(Constantes.ISDEVELOPING) {
						System.out.println("Tiempo(ms) Seleccion TipoSexo: " + this.dDif); 
					}
				}								
				
				TipoSexoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.tiposexo,new Object(),this.tiposexoParameterGeneral,this.tiposexoReturnGeneral);
				
			} else {
				this.estaModoEliminarGuardarCambios=true;
				
				this.seleccionarTipoSexo(evt,null,rowIndex);
				
				if(this.permiteMantenimiento(this.tiposexo)) {
					if(this.tiposexo.getId()>0) {
						this.tiposexo.setIsDeleted(true);
						
						this.tiposexosEliminados.add(this.tiposexo);
					}
					
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.tiposexoLogic.getTipoSexos().remove(this.tiposexo);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.tiposexos.remove(this.tiposexo);				
					}
					
					
					((TipoSexoModel) this.jTableDatosTipoSexo.getModel()).fireTableRowsDeleted(rowIndex,rowIndex);
					
					this.actualizarFilaTotales();
					
					this.inicializarActualizarBindingTablaTipoSexo(false);					
				}								
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException2(this, e,logger,TipoSexoConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoSeleccionar=false;				
			this.estaModoEliminarGuardarCambios=false;
		}
	}
	
	
	public void seleccionarTipoSexo(ActionEvent evt,javax.swing.event.ListSelectionEvent evt2,int rowIndex) throws Exception { 
		try {
			//SI PUEDE SER NUEVO Y SELECCIONAR (PARA DUPLICAR Y NUEVO TABLA)
			//if(!this.isEsNuevoTipoSexo) {
			
			if(this.jInternalFrameDetalleFormTipoSexo==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosTipoSexo.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosTipoSexo.getSelectedRow();	       
				}
				
				//CUANDO SE RECARGA TABLA TAMBIEN SE SELECCIONA PERO CON -1 POR LO QUE SE NECESITA VALIDAR ANTES
				if(intSelectedRow<0) {
					return;
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tiposexo =(TipoSexo) this.tiposexoLogic.getTipoSexos().toArray()[this.jTableDatosTipoSexo.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tiposexo =(TipoSexo) this.tiposexos.toArray()[this.jTableDatosTipoSexo.convertRowIndexToModel(intSelectedRow)];
				}
				
				if(TipoSexoJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesObjetoActualToFormularioTipoSexo(this.tiposexo);
				}
				
				//ARCHITECTURE
				try {
					

					//Empresa
					if(!this.tiposexoConstantesFunciones.cargarid_empresaTipoSexo || this.tiposexoConstantesFunciones.event_dependid_empresaTipoSexo) {
						//this.cargarCombosEmpresasForeignKeyLista(" where id="+this.tiposexo.getid_empresa());
									//this.inicializarActualizarBindingTipoSexo(false,false);
						this.empresasForeignKey=new ArrayList<Empresa>();

						if(tiposexo.getEmpresa()!=null) {
							this.empresasForeignKey.add(tiposexo.getEmpresa());
						}

						this.addItemDefectoCombosForeignKeyEmpresa();
						this.cargarCombosFrameEmpresasForeignKey("Todos");
					}
					this.setActualEmpresaForeignKey(this.tiposexo.getid_empresa(),false,"Formulario");
				} catch(Exception e) {
					throw e;
				}
				
				this.actualizarEstadoCeldasBotonesTipoSexo("s", this.isGuardarCambiosEnLote, this.isEsMantenimientoRelacionado);
				
				//NO FUNCIONA BINDING PERO SE MANTIENE
				this.inicializarActualizarBindingBotonesTipoSexo(false) ;
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualTipoSexo() ;
			//}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoSexoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesObjetoActualToFormularioTodoTipoSexo(TipoSexo tiposexo) throws Exception { 
		this.setVariablesObjetoActualToFormularioTodoTipoSexo(tiposexo,false,"NINGUNO");
	}
	
	public void setVariablesObjetoActualToFormularioTodoTipoSexo(TipoSexo tiposexo,Boolean conCargarListasDesdeObjetoActual,String sTipoEvento) throws Exception { 
		this.setVariablesObjetoActualToFormularioTipoSexo(tiposexo);
		
		if(conCargarListasDesdeObjetoActual) {
			this.setVariablesObjetoActualToListasForeignKeyTipoSexo(tiposexo,sTipoEvento);
		}
		
		this.setVariablesObjetoActualToFormularioForeignKeyTipoSexo(tiposexo);
	}
	
	public void setVariablesObjetoActualToFormularioTipoSexo(TipoSexo tiposexo) throws Exception { 
		try {			
			Image imageActual=null;
			ImageIcon imageIcon = null;
			
			if(this.jInternalFrameDetalleFormTipoSexo==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			
			this.jInternalFrameDetalleFormTipoSexo.jLabelidTipoSexo.setText(tiposexo.getId().toString());
			this.jInternalFrameDetalleFormTipoSexo.jTextFieldcodigoTipoSexo.setText(tiposexo.getcodigo());
			this.jInternalFrameDetalleFormTipoSexo.jTextAreanombreTipoSexo.setText(tiposexo.getnombre());
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoSexoConstantesFunciones.CLASSNAME);
		}
	}
		
	public void actualizarInformacion(String sTipo,TipoSexo tiposexoLocal) throws Exception {
		this.actualizarInformacion(sTipo,false,tiposexoLocal);
	}	
	
	public void actualizarInformacion(String sTipo,Boolean conParametroObjeto,TipoSexo tiposexoLocal) throws Exception {
		
		if(!conParametroObjeto) {
			if(!this.getEsControlTabla()) {
				tiposexoLocal=this.tiposexo;
			} else {
				tiposexoLocal=this.tiposexoAnterior;
			}
		}
		
		if(this.permiteMantenimiento(tiposexoLocal)) {
			if(sTipo.equals("EVENTO_CONTROL")) { // || sTipo.equals("EVENTO_NUEVO")
				if(!this.esControlTabla) {
					this.setVariablesFormularioToObjetoActualTodoTipoSexo(tiposexoLocal,true);
					
					if(tiposexoSessionBean.getConGuardarRelaciones()) {
						this.actualizarRelaciones(tiposexoLocal);
					}
				}
			
			} else if(sTipo.equals("INFO_PADRE")) {
				
				if(this.tiposexoSessionBean.getEsGuardarRelacionado()) {
					this.actualizarRelacionFkPadreActual(tiposexoLocal);
				}
			}
		}
	}
	
	public void setVariablesFormularioToObjetoActualTodoTipoSexo(TipoSexo tiposexo,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualTipoSexo(tiposexo,conColumnasBase);
		this.setVariablesFormularioToObjetoActualForeignKeysTipoSexo(tiposexo);
	}
	
	public void setVariablesFormularioToObjetoActualTipoSexo(TipoSexo tiposexo,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualTipoSexo(tiposexo,conColumnasBase,true);
	}
	
	public void setVariablesFormularioToObjetoActualTipoSexo(TipoSexo tiposexo,Boolean conColumnasBase,Boolean conInicializarInvalidValues) throws Exception { 
		String sMensajeCampoActual="";
		Boolean estaValidado=true;
		try {
			
			if(this.jInternalFrameDetalleFormTipoSexo==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			if(conInicializarInvalidValues) {
				this.inicializarInvalidValues();
			}
			
			

		try {
			if(this.jInternalFrameDetalleFormTipoSexo.jLabelidTipoSexo.getText()==null || this.jInternalFrameDetalleFormTipoSexo.jLabelidTipoSexo.getText()=="" || this.jInternalFrameDetalleFormTipoSexo.jLabelidTipoSexo.getText()=="Id") {
				this.jInternalFrameDetalleFormTipoSexo.jLabelidTipoSexo.setText("0");
			}

			if(conColumnasBase) {tiposexo.setId(Long.parseLong(this.jInternalFrameDetalleFormTipoSexo.jLabelidTipoSexo.getText()));}
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+TipoSexoConstantesFunciones.LABEL_ID+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTipoSexo.jLabelIdTipoSexo,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			tiposexo.setcodigo(this.jInternalFrameDetalleFormTipoSexo.jTextFieldcodigoTipoSexo.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+TipoSexoConstantesFunciones.LABEL_CODIGO+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTipoSexo.jLabelcodigoTipoSexo,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			tiposexo.setnombre(this.jInternalFrameDetalleFormTipoSexo.jTextAreanombreTipoSexo.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+TipoSexoConstantesFunciones.LABEL_NOMBRE+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTipoSexo.jLabelnombreTipoSexo,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}
			
			if(!estaValidado) {
				throw new Exception(sMensajeCampoActual);
			}
		} catch(NumberFormatException e) {
			throw new Exception(sMensajeCampoActual);
			//FuncionesSwing.manageException(this, e,logger,MovimientoInventarioConstantesFunciones.CLASSNAME);
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoSexoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualTipoSexo(TipoSexo tiposexoBean,TipoSexo tiposexo,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoSexoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setCopiarVariablesObjetosTipoSexo(TipoSexo tiposexoOrigen,TipoSexo tiposexo,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			if(conColumnasBase) {if(conDefault || (!conDefault && tiposexoOrigen.getId()!=null && !tiposexoOrigen.getId().equals(0L))) {tiposexo.setId(tiposexoOrigen.getId());}}
			if(conDefault || (!conDefault && tiposexoOrigen.getcodigo()!=null && !tiposexoOrigen.getcodigo().equals(""))) {tiposexo.setcodigo(tiposexoOrigen.getcodigo());}
			if(conDefault || (!conDefault && tiposexoOrigen.getnombre()!=null && !tiposexoOrigen.getnombre().equals(""))) {tiposexo.setnombre(tiposexoOrigen.getnombre());}
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoSexoConstantesFunciones.CLASSNAME);
		}
	}
	
	/*
	public void setVariablesObjetoBeanActualToFormularioTipoSexo(TipoSexo tiposexo) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormTipoSexo.jLabelidTipoSexo.setText(tiposexo.getId().toString());
			this.jInternalFrameDetalleFormTipoSexo.jTextFieldcodigoTipoSexo.setText(tiposexo.getcodigo());
			this.jInternalFrameDetalleFormTipoSexo.jTextAreanombreTipoSexo.setText(tiposexo.getnombre());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoSexoConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoBeanActualToFormularioTipoSexo(TipoSexoBean tiposexoBean) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormTipoSexo.jLabelidTipoSexo.setText(tiposexoBean.getId().toString());
			this.jInternalFrameDetalleFormTipoSexo.jTextFieldcodigoTipoSexo.setText(tiposexoBean.getcodigo());
			this.jInternalFrameDetalleFormTipoSexo.jTextAreanombreTipoSexo.setText(tiposexoBean.getnombre());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoSexoConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoReturnGeneralToBeanTipoSexo(TipoSexoParameterReturnGeneral tiposexoReturnGeneral,TipoSexoBean tiposexoBean,Boolean conDefault) throws Exception { 
		try {
			TipoSexo tiposexoLocal=new TipoSexo();
			
			tiposexoLocal=tiposexoReturnGeneral.getTipoSexo();
			
			
			if(conColumnasBase) {if(conDefault || (!conDefault && tiposexoLocal.getId()!=null && !tiposexoLocal.getId().equals(0L))) {tiposexoBean.setId(tiposexoLocal.getId());}}
			if(conDefault || (!conDefault && tiposexoLocal.getcodigo()!=null && !tiposexoLocal.getcodigo().equals(""))) {tiposexoBean.setcodigo(tiposexoLocal.getcodigo());}
			if(conDefault || (!conDefault && tiposexoLocal.getnombre()!=null && !tiposexoLocal.getnombre().equals(""))) {tiposexoBean.setnombre(tiposexoLocal.getnombre());}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoSexoConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	@SuppressWarnings("rawtypes")
	public static void setActualComboBoxTipoSexoGenerico(Long idTipoSexoSeleccionado,JComboBox jComboBoxTipoSexo,List<TipoSexo> tiposexosLocal)throws Exception {
		try {
			TipoSexo  tiposexoTemp=null;

			for(TipoSexo tiposexoAux:tiposexosLocal) {
				if(tiposexoAux.getId()!=null && tiposexoAux.getId().equals(idTipoSexoSeleccionado)) {
					tiposexoTemp=tiposexoAux;
					break;
				}
			}

			jComboBoxTipoSexo.setSelectedItem(tiposexoTemp);

		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("rawtypes")
	public static void setHotKeysComboBoxTipoSexoGenerico(JComboBox jComboBoxTipoSexo,JInternalFrameBase jInternalFrameBase,String sNombreHotKeyAbstractAction,String sTipoBusqueda)throws Exception {
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
				
				jComboBoxTipoSexo.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxTipoSexo.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Busqueda"));
				//BUSCAR
				
				
				//ACTUALIZAR
				sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
				keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_ACTUALIZAR");
				
				jComboBoxTipoSexo.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxTipoSexo.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Update"));
				//ACTUALIZAR
				
				if(sTipoBusqueda.contains("CON_EVENT_CHANGE")) {
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxTipoSexo.addFocusListener(new ComboBoxFocusListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
						jComboBoxTipoSexo.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));						
					}
					
					/*
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxTipoSexo.addItemListener(new ComboBoxItemListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					} else {
						jComboBoxTipoSexo.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					}
					*/
				}								
				
				//CON_BUSQUEDA								
				if(sTipoBusqueda.contains("CON_BUSQUEDA")) {
					sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
					keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_BUSQUEDA");
							
					jComboBoxTipoSexo.getInputMap().put(keyStrokeControl, sKeyStrokeName);
					jComboBoxTipoSexo.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction));
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
			FuncionesSwing.manageException2(this, e,logger,TipoSexoConstantesFunciones.CLASSNAME);
		}
	}
	
	public String getDescripcionFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		String sDescripcion="";
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tiposexo=(TipoSexo) tiposexoLogic.getTipoSexos().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			tiposexo =(TipoSexo) tiposexos.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		if(sTipo.equals("Empresa")) {
			//sDescripcion=this.getActualEmpresaForeignKeyDescripcion((Long)value);
			if(!tiposexo.getIsNew() && !tiposexo.getIsChanged() && !tiposexo.getIsDeleted()) {
				sDescripcion=tiposexo.getempresa_descripcion();
			} else {
				//sDescripcion=this.getActualEmpresaForeignKeyDescripcion((Long)value);
				sDescripcion=tiposexo.getempresa_descripcion();
			}
		}

		
		return sDescripcion;
	}
	
	public Color getColorFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		Color color=Color.WHITE;
		
		TipoSexo tiposexoRow=new TipoSexo();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tiposexoRow=(TipoSexo) tiposexoLogic.getTipoSexos().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			tiposexoRow=(TipoSexo) tiposexos.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		
		return color;
	}
	
	
	
	
	
	
	
	public void refrescarBindingTabla(Boolean blnSoloTabla) {
	}
	
	public void inicializarActualizarBindingBotonesManualTipoSexo(Boolean esSetControles) {						
		if(esSetControles) {
			this.jButtonNuevoTipoSexo.setVisible((this.isVisibilidadCeldaNuevoTipoSexo && this.isPermisoNuevoTipoSexo));			
			this.jButtonDuplicarTipoSexo.setVisible((this.isVisibilidadCeldaDuplicarTipoSexo && this.isPermisoDuplicarTipoSexo));			
			this.jButtonCopiarTipoSexo.setVisible((this.isVisibilidadCeldaCopiarTipoSexo && this.isPermisoCopiarTipoSexo));
			this.jButtonVerFormTipoSexo.setVisible((this.isVisibilidadCeldaVerFormTipoSexo && this.isPermisoVerFormTipoSexo));
			
			this.jButtonAbrirOrderByTipoSexo.setVisible((this.isVisibilidadCeldaOrdenTipoSexo && this.isPermisoOrdenTipoSexo));			
			
			this.jButtonNuevoRelacionesTipoSexo.setVisible((this.isVisibilidadCeldaNuevoRelacionesTipoSexo && this.isPermisoNuevoTipoSexo));			
			this.jButtonNuevoGuardarCambiosTipoSexo.setVisible((this.isVisibilidadCeldaNuevoTipoSexo && this.isPermisoNuevoTipoSexo && this.isPermisoGuardarCambiosTipoSexo));
			
			if(this.jInternalFrameDetalleFormTipoSexo!=null) {
			this.jInternalFrameDetalleFormTipoSexo.jButtonModificarTipoSexo.setVisible((this.isVisibilidadCeldaModificarTipoSexo && this.isPermisoActualizarTipoSexo));	
			this.jInternalFrameDetalleFormTipoSexo.jButtonActualizarTipoSexo.setVisible((this.isVisibilidadCeldaActualizarTipoSexo && this.isPermisoActualizarTipoSexo));	
			this.jInternalFrameDetalleFormTipoSexo.jButtonEliminarTipoSexo.setVisible((this.isVisibilidadCeldaEliminarTipoSexo && this.isPermisoEliminarTipoSexo));
			this.jInternalFrameDetalleFormTipoSexo.jButtonCancelarTipoSexo.setVisible(this.isVisibilidadCeldaCancelarTipoSexo);							
			this.jInternalFrameDetalleFormTipoSexo.jButtonGuardarCambiosTipoSexo.setVisible((this.isVisibilidadCeldaGuardarTipoSexo && this.isPermisoGuardarCambiosTipoSexo));			
			
			}
						
			this.jButtonGuardarCambiosTablaTipoSexo.setVisible((this.isVisibilidadCeldaGuardarCambiosTipoSexo && this.isPermisoGuardarCambiosTipoSexo));							
			
			//TOOLBAR
			
			this.jButtonNuevoToolBarTipoSexo.setVisible((this.isVisibilidadCeldaNuevoTipoSexo && this.isPermisoNuevoTipoSexo));						
			this.jButtonDuplicarToolBarTipoSexo.setVisible((this.isVisibilidadCeldaDuplicarTipoSexo && this.isPermisoDuplicarTipoSexo));						
			this.jButtonCopiarToolBarTipoSexo.setVisible((this.isVisibilidadCeldaCopiarTipoSexo && this.isPermisoCopiarTipoSexo));			
			this.jButtonVerFormToolBarTipoSexo.setVisible((this.isVisibilidadCeldaVerFormTipoSexo && this.isPermisoVerFormTipoSexo));			
			this.jButtonAbrirOrderByToolBarTipoSexo.setVisible((this.isVisibilidadCeldaOrdenTipoSexo && this.isPermisoOrdenTipoSexo));
			this.jButtonNuevoRelacionesToolBarTipoSexo.setVisible((this.isVisibilidadCeldaNuevoRelacionesTipoSexo && this.isPermisoNuevoTipoSexo));			
			this.jButtonNuevoGuardarCambiosToolBarTipoSexo.setVisible((this.isVisibilidadCeldaNuevoTipoSexo && this.isPermisoNuevoTipoSexo && this.isPermisoGuardarCambiosTipoSexo));			
			
			if(this.jInternalFrameDetalleFormTipoSexo!=null) {
			this.jInternalFrameDetalleFormTipoSexo.jButtonModificarToolBarTipoSexo.setVisible((this.isVisibilidadCeldaModificarTipoSexo && this.isPermisoActualizarTipoSexo));	
			this.jInternalFrameDetalleFormTipoSexo.jButtonActualizarToolBarTipoSexo.setVisible((this.isVisibilidadCeldaActualizarTipoSexo  && this.isPermisoActualizarTipoSexo));	
			this.jInternalFrameDetalleFormTipoSexo.jButtonEliminarToolBarTipoSexo.setVisible((this.isVisibilidadCeldaEliminarTipoSexo && this.isPermisoEliminarTipoSexo));
			this.jInternalFrameDetalleFormTipoSexo.jButtonCancelarToolBarTipoSexo.setVisible(this.isVisibilidadCeldaCancelarTipoSexo);				
			this.jInternalFrameDetalleFormTipoSexo.jButtonGuardarCambiosToolBarTipoSexo.setVisible((this.isVisibilidadCeldaGuardarTipoSexo && this.isPermisoGuardarCambiosTipoSexo));									
			}
			
			this.jButtonGuardarCambiosTablaToolBarTipoSexo.setVisible((this.isVisibilidadCeldaGuardarCambiosTipoSexo && this.isPermisoGuardarCambiosTipoSexo));									
			
			//TOOLBAR
			
			//MENUS
			
			this.jMenuItemNuevoTipoSexo.setVisible((this.isVisibilidadCeldaNuevoTipoSexo && this.isPermisoNuevoTipoSexo));			
			this.jMenuItemDuplicarTipoSexo.setVisible((this.isVisibilidadCeldaDuplicarTipoSexo && this.isPermisoDuplicarTipoSexo));			
			this.jMenuItemCopiarTipoSexo.setVisible((this.isVisibilidadCeldaCopiarTipoSexo && this.isPermisoCopiarTipoSexo));			
			this.jMenuItemVerFormTipoSexo.setVisible((this.isVisibilidadCeldaVerFormTipoSexo && this.isPermisoVerFormTipoSexo));			
			this.jMenuItemAbrirOrderByTipoSexo.setVisible((this.isVisibilidadCeldaOrdenTipoSexo && this.isPermisoOrdenTipoSexo));			
			//this.jMenuItemMostrarOcultarTipoSexo.setVisible((this.isVisibilidadCeldaOrdenTipoSexo && this.isPermisoOrdenTipoSexo));
			this.jMenuItemDetalleAbrirOrderByTipoSexo.setVisible((this.isVisibilidadCeldaOrdenTipoSexo && this.isPermisoOrdenTipoSexo));			
			//this.jMenuItemDetalleMostrarOcultarTipoSexo.setVisible((this.isVisibilidadCeldaOrdenTipoSexo && this.isPermisoOrdenTipoSexo));			
			this.jMenuItemNuevoRelacionesTipoSexo.setVisible((this.isVisibilidadCeldaNuevoRelacionesTipoSexo && this.isPermisoNuevoTipoSexo));			
			this.jMenuItemNuevoGuardarCambiosTipoSexo.setVisible((this.isVisibilidadCeldaNuevoTipoSexo && this.isPermisoNuevoTipoSexo && this.isPermisoGuardarCambiosTipoSexo));									
			
			if(this.jInternalFrameDetalleFormTipoSexo!=null) {
			this.jInternalFrameDetalleFormTipoSexo.jMenuItemModificarTipoSexo.setVisible((this.isVisibilidadCeldaModificarTipoSexo && this.isPermisoActualizarTipoSexo));	
			this.jInternalFrameDetalleFormTipoSexo.jMenuItemActualizarTipoSexo.setVisible((this.isVisibilidadCeldaActualizarTipoSexo && this.isPermisoActualizarTipoSexo));	
			this.jInternalFrameDetalleFormTipoSexo.jMenuItemEliminarTipoSexo.setVisible((this.isVisibilidadCeldaEliminarTipoSexo && this.isPermisoEliminarTipoSexo));
			this.jInternalFrameDetalleFormTipoSexo.jMenuItemCancelarTipoSexo.setVisible(this.isVisibilidadCeldaCancelarTipoSexo);				
			}
			
			this.jMenuItemGuardarCambiosTipoSexo.setVisible((this.isVisibilidadCeldaGuardarTipoSexo && this.isPermisoGuardarCambiosTipoSexo));						
			this.jMenuItemGuardarCambiosTablaTipoSexo.setVisible((this.isVisibilidadCeldaGuardarCambiosTipoSexo && this.isPermisoGuardarCambiosTipoSexo));						
			
			//MENUS
			
		} else {
			this.isVisibilidadCeldaNuevoTipoSexo=this.jButtonNuevoTipoSexo.isVisible();
			this.isVisibilidadCeldaDuplicarTipoSexo=this.jButtonDuplicarTipoSexo.isVisible();
			this.isVisibilidadCeldaCopiarTipoSexo=this.jButtonCopiarTipoSexo.isVisible();
			this.isVisibilidadCeldaVerFormTipoSexo=this.jButtonVerFormTipoSexo.isVisible();
			
			this.isVisibilidadCeldaOrdenTipoSexo=this.jButtonAbrirOrderByTipoSexo.isVisible();			
			
			this.isVisibilidadCeldaNuevoRelacionesTipoSexo=this.jButtonNuevoRelacionesTipoSexo.isVisible();
			this.isVisibilidadCeldaModificarTipoSexo=this.jButtonModificarTipoSexo.isVisible();
			
			if(this.jInternalFrameDetalleFormTipoSexo!=null) {
			this.isVisibilidadCeldaActualizarTipoSexo=this.jInternalFrameDetalleFormTipoSexo.jButtonActualizarTipoSexo.isVisible();
			this.isVisibilidadCeldaEliminarTipoSexo=this.jInternalFrameDetalleFormTipoSexo.jButtonEliminarTipoSexo.isVisible();
			this.isVisibilidadCeldaCancelarTipoSexo=this.jInternalFrameDetalleFormTipoSexo.jButtonCancelarTipoSexo.isVisible();
			this.isVisibilidadCeldaGuardarTipoSexo=this.jInternalFrameDetalleFormTipoSexo.jButtonGuardarCambiosTipoSexo.isVisible();			
			}
			
			this.isVisibilidadCeldaGuardarCambiosTipoSexo=this.jButtonGuardarCambiosTablaTipoSexo.isVisible();
			
			//TOOLBAR
			
			this.isVisibilidadCeldaNuevoTipoSexo=this.jButtonNuevoToolBarTipoSexo.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesTipoSexo=this.jButtonNuevoRelacionesToolBarTipoSexo.isVisible();
			
			if(this.jInternalFrameDetalleFormTipoSexo!=null) {
			this.isVisibilidadCeldaModificarTipoSexo=this.jInternalFrameDetalleFormTipoSexo.jButtonModificarToolBarTipoSexo.isVisible();
			this.isVisibilidadCeldaActualizarTipoSexo=this.jInternalFrameDetalleFormTipoSexo.jButtonActualizarToolBarTipoSexo.isVisible();
			this.isVisibilidadCeldaEliminarTipoSexo=this.jInternalFrameDetalleFormTipoSexo.jButtonEliminarToolBarTipoSexo.isVisible();
			this.isVisibilidadCeldaCancelarTipoSexo=this.jInternalFrameDetalleFormTipoSexo.jButtonCancelarToolBarTipoSexo.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarTipoSexo=this.jButtonGuardarCambiosToolBarTipoSexo.isVisible();
			this.isVisibilidadCeldaGuardarCambiosTipoSexo=this.jButtonGuardarCambiosTablaToolBarTipoSexo.isVisible();						
			
			//TOOLBAR
			
			//MENUS
			
			this.isVisibilidadCeldaNuevoTipoSexo=this.jMenuItemNuevoTipoSexo.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesTipoSexo=this.jMenuItemNuevoRelacionesTipoSexo.isVisible();
			
			if(this.jInternalFrameDetalleFormTipoSexo!=null) {
			this.isVisibilidadCeldaModificarTipoSexo=this.jInternalFrameDetalleFormTipoSexo.jMenuItemModificarTipoSexo.isVisible();
			this.isVisibilidadCeldaActualizarTipoSexo=this.jInternalFrameDetalleFormTipoSexo.jMenuItemActualizarTipoSexo.isVisible();
			this.isVisibilidadCeldaEliminarTipoSexo=this.jInternalFrameDetalleFormTipoSexo.jMenuItemEliminarTipoSexo.isVisible();
			this.isVisibilidadCeldaCancelarTipoSexo=this.jInternalFrameDetalleFormTipoSexo.jMenuItemCancelarTipoSexo.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarTipoSexo=this.jMenuItemGuardarCambiosTipoSexo.isVisible();
			this.isVisibilidadCeldaGuardarCambiosTipoSexo=this.jMenuItemGuardarCambiosTablaTipoSexo.isVisible();						
			
			//MENUS
		}
	}
	
	public void inicializarActualizarBindingBotonesTipoSexo(Boolean esInicializar) {
		if(TipoSexoJInternalFrame.ISBINDING_MANUAL) {			
			if(this.tiposexoSessionBean.getConGuardarRelaciones()) {
				//if(this.tiposexoSessionBean.getEsGuardarRelacionado()) {
				
				this.actualizarEstadoCeldasBotonesConGuardarRelacionesTipoSexo();
			}
			
			this.inicializarActualizarBindingBotonesManualTipoSexo(true);
			
		} else {	
		}
	}		
	
	public void inicializarActualizarBindingBotonesPermisosManualTipoSexo() {
		this.jButtonNuevoTipoSexo.setVisible(this.isPermisoNuevoTipoSexo);			
		this.jButtonDuplicarTipoSexo.setVisible(this.isPermisoDuplicarTipoSexo);			
		this.jButtonCopiarTipoSexo.setVisible(this.isPermisoCopiarTipoSexo);			
		this.jButtonVerFormTipoSexo.setVisible(this.isPermisoVerFormTipoSexo);			
		
		this.jButtonAbrirOrderByTipoSexo.setVisible(this.isPermisoOrdenTipoSexo);					
		
		this.jButtonNuevoRelacionesTipoSexo.setVisible(this.isPermisoNuevoTipoSexo);			
		
		if(this.jInternalFrameDetalleFormTipoSexo!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoSexo.jButtonModificarTipoSexo.setVisible(this.isPermisoActualizarTipoSexo);	
			this.jInternalFrameDetalleFormTipoSexo.jButtonActualizarTipoSexo.setVisible(this.isPermisoActualizarTipoSexo);	
			this.jInternalFrameDetalleFormTipoSexo.jButtonEliminarTipoSexo.setVisible(this.isPermisoEliminarTipoSexo);
			this.jInternalFrameDetalleFormTipoSexo.jButtonCancelarTipoSexo.setVisible(this.isVisibilidadCeldaCancelarTipoSexo);						
			this.jInternalFrameDetalleFormTipoSexo.jButtonGuardarCambiosTipoSexo.setVisible(this.isPermisoGuardarCambiosTipoSexo);							
		}
		
		this.jButtonGuardarCambiosTablaTipoSexo.setVisible(this.isPermisoActualizarTipoSexo);
	}
	
	public void inicializarActualizarBindingBotonesPermisosManualFormDetalleTipoSexo() {
		this.jInternalFrameDetalleFormTipoSexo.jButtonModificarTipoSexo.setVisible(this.isPermisoActualizarTipoSexo);	
		this.jInternalFrameDetalleFormTipoSexo.jButtonActualizarTipoSexo.setVisible(this.isPermisoActualizarTipoSexo);	
		this.jInternalFrameDetalleFormTipoSexo.jButtonEliminarTipoSexo.setVisible(this.isPermisoEliminarTipoSexo);
		this.jInternalFrameDetalleFormTipoSexo.jButtonCancelarTipoSexo.setVisible(this.isVisibilidadCeldaCancelarTipoSexo);							
		this.jInternalFrameDetalleFormTipoSexo.jButtonGuardarCambiosTipoSexo.setVisible((this.isVisibilidadCeldaGuardarTipoSexo && this.isPermisoGuardarCambiosTipoSexo));			
	}
	
	public void inicializarActualizarBindingBotonesPermisosTipoSexo() {
		if(TipoSexoJInternalFrame.ISBINDING_MANUAL) {
			this.inicializarActualizarBindingBotonesPermisosManualTipoSexo();
		} else {
		}
	}
	
	
	public void refrescarBindingBotonesTipoSexo() {
	}
	
	public void jTableDatosTipoSexoListSelectionListener(javax.swing.event.ListSelectionEvent evt) throws Exception { 
		try {
			this.seleccionarTipoSexo(null,evt,-1);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoSexoConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonidTipoSexoBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tiposexoLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosTipoSexo.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualTipoSexo(this.gettiposexo(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoSexo(this.tiposexo);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tiposexo =(TipoSexo) this.tiposexoLogic.getTipoSexos().toArray()[this.jTableDatosTipoSexo.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.tiposexo =(TipoSexo) this.tiposexos.toArray()[this.jTableDatosTipoSexo.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.tiposexo==null) {
						this.tiposexo = new TipoSexo();
					}

					this.setVariablesFormularioToObjetoActualTipoSexo(this.tiposexo,true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoSexo(this.tiposexo);
				}

				if(this.tiposexo.getId()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id = "+this.tiposexo.getId().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingTipoSexo(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tiposexoLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tiposexoLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,TipoSexoConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tiposexoLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_empresaTipoSexoUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tiposexoLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisoempresa=true;

			idTienePermisoempresa=this.tienePermisosUsuarioEnPaginaWebTipoSexo(EmpresaConstantesFunciones.CLASSNAME);

			if(idTienePermisoempresa) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosTipoSexo.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosTipoSexo.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosTipoSexo.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tiposexo =(TipoSexo) this.tiposexoLogic.getTipoSexos().toArray()[this.jTableDatosTipoSexo.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.tiposexo =(TipoSexo) this.tiposexos.toArray()[this.jTableDatosTipoSexo.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualTipoSexo(this.gettiposexo(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysTipoSexo(this.tiposexo);

				this.empresaBeanSwingJInternalFrame=new EmpresaBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.empresaBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.empresaBeanSwingJInternalFrame.getEmpresaLogic().setConnexion(this.tiposexoLogic.getConnexion());

				if(this.tiposexo.getid_empresa()!=null) {
					this.empresaBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.empresaBeanSwingJInternalFrame.setIdActual(this.tiposexo.getid_empresa());
					this.empresaBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.empresaBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.empresaBeanSwingJInternalFrame.inicializarActualizarBindingTablaEmpresa();
				}

				JInternalFrameBase jinternalFrame =this.empresaBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderTipoSexo=(TitledBorder)this.jScrollPanelDatosTipoSexo.getBorder();
				TitledBorder titledBorderempresa=(TitledBorder)this.empresaBeanSwingJInternalFrame.jScrollPanelDatosEmpresa.getBorder();

				titledBorderempresa.setTitle(titledBorderTipoSexo.getTitle() + " -> Empresa");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tiposexoLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tiposexoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,TipoSexoConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tiposexoLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_empresaTipoSexoBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tiposexoLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosTipoSexo.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualTipoSexo(this.gettiposexo(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoSexo(this.tiposexo);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tiposexo =(TipoSexo) this.tiposexoLogic.getTipoSexos().toArray()[this.jTableDatosTipoSexo.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.tiposexo =(TipoSexo) this.tiposexos.toArray()[this.jTableDatosTipoSexo.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.tiposexo==null) {
						this.tiposexo = new TipoSexo();
					}

					this.setVariablesFormularioToObjetoActualTipoSexo(this.tiposexo,true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoSexo(this.tiposexo);
				}

				if(this.tiposexo.getid_empresa()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_empresa = "+this.tiposexo.getid_empresa().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingTipoSexo(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tiposexoLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tiposexoLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,TipoSexoConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tiposexoLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtoncodigoTipoSexoBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tiposexoLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosTipoSexo.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualTipoSexo(this.gettiposexo(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoSexo(this.tiposexo);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tiposexo =(TipoSexo) this.tiposexoLogic.getTipoSexos().toArray()[this.jTableDatosTipoSexo.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.tiposexo =(TipoSexo) this.tiposexos.toArray()[this.jTableDatosTipoSexo.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.tiposexo==null) {
						this.tiposexo = new TipoSexo();
					}

					this.setVariablesFormularioToObjetoActualTipoSexo(this.tiposexo,true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoSexo(this.tiposexo);
				}

				if(this.tiposexo.getcodigo()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where codigo like '%"+this.tiposexo.getcodigo()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingTipoSexo(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tiposexoLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tiposexoLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,TipoSexoConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tiposexoLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonnombreTipoSexoBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tiposexoLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosTipoSexo.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualTipoSexo(this.gettiposexo(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoSexo(this.tiposexo);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tiposexo =(TipoSexo) this.tiposexoLogic.getTipoSexos().toArray()[this.jTableDatosTipoSexo.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.tiposexo =(TipoSexo) this.tiposexos.toArray()[this.jTableDatosTipoSexo.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.tiposexo==null) {
						this.tiposexo = new TipoSexo();
					}

					this.setVariablesFormularioToObjetoActualTipoSexo(this.tiposexo,true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoSexo(this.tiposexo);
				}

				if(this.tiposexo.getnombre()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where nombre like '%"+this.tiposexo.getnombre()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingTipoSexo(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tiposexoLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tiposexoLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,TipoSexoConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tiposexoLogic.closeNewConnexionToDeep();
				}

			}
		}

	
	
	public void jButtonFK_IdEmpresaTipoSexoActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tiposexoLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingTipoSexo(false,false);

			this.getTipoSexosFK_IdEmpresa();

			this.inicializarActualizarBindingTipoSexo(false);

			//if(TipoSexoBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingTipoSexo(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tiposexoLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tiposexoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,TipoSexoConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tiposexoLogic.closeNewConnexionToDeep();
			}
		}
	}

	
	public void closingInternalFrameTipoSexo() {
		if(this.jInternalFrameDetalleFormTipoSexo!=null) {
			
		
		
		}
		
		if(this.jInternalFrameDetalleFormTipoSexo!=null) {
			this.jInternalFrameDetalleFormTipoSexo.setVisible(false);	    			
			this.jInternalFrameDetalleFormTipoSexo.dispose();
			this.jInternalFrameDetalleFormTipoSexo=null;
		}
		
		
		if(this.jInternalFrameReporteDinamicoTipoSexo!=null) {
			this.jInternalFrameReporteDinamicoTipoSexo.setVisible(false);	    			
			this.jInternalFrameReporteDinamicoTipoSexo.dispose();
			this.jInternalFrameReporteDinamicoTipoSexo=null;
		}
		
		if(this.jInternalFrameImportacionTipoSexo!=null) {
			this.jInternalFrameImportacionTipoSexo.setVisible(false);	    			
			this.jInternalFrameImportacionTipoSexo.dispose();
			this.jInternalFrameImportacionTipoSexo=null;
		}		
		
		
		this.setVisible(false);
		this.dispose();
		//this=null;
	}
	
	
	
	public void jButtonActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {			
			this.startProcessTipoSexo();
			
			TipoSexoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tiposexo,new Object(),this.tiposexoParameterGeneral,this.tiposexoReturnGeneral);
			
			
			if(sTipo.equals("NuevoTipoSexo")) {
				jButtonNuevoTipoSexoActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarTipoSexo")) {
				jButtonDuplicarTipoSexoActionPerformed(evt,false);
			} else if(sTipo.equals("CopiarTipoSexo")) {
				jButtonCopiarTipoSexoActionPerformed(evt);
			} else if(sTipo.equals("VerFormTipoSexo")) {
				jButtonVerFormTipoSexoActionPerformed(evt);
			} else if(sTipo.equals("NuevoToolBarTipoSexo")) {
				jButtonNuevoTipoSexoActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarToolBarTipoSexo")) {
				jButtonDuplicarTipoSexoActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemNuevoTipoSexo")) {
				jButtonNuevoTipoSexoActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemDuplicarTipoSexo")) {
				jButtonDuplicarTipoSexoActionPerformed(evt,false);
			} else if(sTipo.equals("NuevoRelacionesTipoSexo")) {
				jButtonNuevoTipoSexoActionPerformed(evt,true);
			} else if(sTipo.equals("NuevoRelacionesToolBarTipoSexo")) {
				jButtonNuevoTipoSexoActionPerformed(evt,true);
			} else if(sTipo.equals("MenuItemNuevoRelacionesTipoSexo")) {
				jButtonNuevoTipoSexoActionPerformed(evt,true);
			} else if(sTipo.equals("ModificarTipoSexo")) {
				jButtonModificarTipoSexoActionPerformed(evt);
			} else if(sTipo.equals("ModificarToolBarTipoSexo")) {
				jButtonModificarTipoSexoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemModificarTipoSexo")) {
				jButtonModificarTipoSexoActionPerformed(evt);
			} else if(sTipo.equals("ActualizarTipoSexo")) {
				jButtonActualizarTipoSexoActionPerformed(evt);
			} else if(sTipo.equals("ActualizarToolBarTipoSexo")) {
				jButtonActualizarTipoSexoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemActualizarTipoSexo")) {
				jButtonActualizarTipoSexoActionPerformed(evt);
			} else if(sTipo.equals("EliminarTipoSexo")) {
				jButtonEliminarTipoSexoActionPerformed(evt);
			} else if(sTipo.equals("EliminarToolBarTipoSexo")) {
				jButtonEliminarTipoSexoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemEliminarTipoSexo")) {
				jButtonEliminarTipoSexoActionPerformed(evt);
			} else if(sTipo.equals("CancelarTipoSexo")) {
				jButtonCancelarTipoSexoActionPerformed(evt);
			} else if(sTipo.equals("CancelarToolBarTipoSexo")) {
				jButtonCancelarTipoSexoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCancelarTipoSexo")) {
				jButtonCancelarTipoSexoActionPerformed(evt);
			} else if(sTipo.equals("CerrarTipoSexo")) {
				jButtonCerrarTipoSexoActionPerformed(evt);
			} else if(sTipo.equals("CerrarToolBarTipoSexo")) {
				jButtonCerrarTipoSexoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCerrarTipoSexo")) {
				jButtonCerrarTipoSexoActionPerformed(evt);
			} else if(sTipo.equals("MostrarOcultarToolBarTipoSexo")) {
				jButtonMostrarOcultarTipoSexoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemDetalleCerrarTipoSexo")) {
				jButtonCancelarTipoSexoActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTipoSexo")) {
				jButtonGuardarCambiosTipoSexoActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosToolBarTipoSexo")) {
				jButtonGuardarCambiosTipoSexoActionPerformed(evt);
			} else if(sTipo.equals("CopiarToolBarTipoSexo")) {
				jButtonCopiarTipoSexoActionPerformed(evt);
			} else if(sTipo.equals("VerFormToolBarTipoSexo")) {
				jButtonVerFormTipoSexoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosTipoSexo")) {
				jButtonGuardarCambiosTipoSexoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCopiarTipoSexo")) {
				jButtonCopiarTipoSexoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemVerFormTipoSexo")) {
				jButtonVerFormTipoSexoActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaTipoSexo")) {
				jButtonGuardarCambiosTipoSexoActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaToolBarTipoSexo")) {
				jButtonGuardarCambiosTipoSexoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosTablaTipoSexo")) {
				jButtonGuardarCambiosTipoSexoActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionTipoSexo")) {
				jButtonRecargarInformacionTipoSexoActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionToolBarTipoSexo")) {
				jButtonRecargarInformacionTipoSexoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemRecargarInformacionTipoSexo")) {
				jButtonRecargarInformacionTipoSexoActionPerformed(evt);
			}
			else if(sTipo.equals("AnterioresTipoSexo")) {
				jButtonAnterioresTipoSexoActionPerformed(evt);
			} else if(sTipo.equals("AnterioresToolBarTipoSexo")) {
				jButtonAnterioresTipoSexoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAnterioreTipoSexo")) {
				jButtonAnterioresTipoSexoActionPerformed(evt);
			} else if(sTipo.equals("SiguientesTipoSexo")) {
				jButtonSiguientesTipoSexoActionPerformed(evt);
			} else if(sTipo.equals("SiguientesToolBarTipoSexo")) {
				jButtonSiguientesTipoSexoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemSiguientesTipoSexo")) {
				jButtonSiguientesTipoSexoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAbrirOrderByTipoSexo") || sTipo.equals("MenuItemDetalleAbrirOrderByTipoSexo")) {
				jButtonAbrirOrderByTipoSexoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemMostrarOcultarTipoSexo") || sTipo.equals("MenuItemDetalleMostrarOcultarTipoSexo")) {
				jButtonMostrarOcultarTipoSexoActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosTipoSexo")) {
				jButtonNuevoGuardarCambiosTipoSexoActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosToolBarTipoSexo")) {
				jButtonNuevoGuardarCambiosTipoSexoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemNuevoGuardarCambiosTipoSexo")) {
				jButtonNuevoGuardarCambiosTipoSexoActionPerformed(evt);
			} 
			else if(sTipo.equals("CerrarReporteDinamicoTipoSexo")) {
				jButtonCerrarReporteDinamicoTipoSexoActionPerformed(evt);
			} else if(sTipo.equals("GenerarReporteDinamicoTipoSexo")) {
				jButtonGenerarReporteDinamicoTipoSexoActionPerformed(evt);
			} else if(sTipo.equals("GenerarExcelReporteDinamicoTipoSexo")) {
				
				jButtonGenerarExcelReporteDinamicoTipoSexoActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarImportacionTipoSexo")) {
				jButtonCerrarImportacionTipoSexoActionPerformed(evt);
			} else if(sTipo.equals("GenerarImportacionTipoSexo")) {
				
				jButtonGenerarImportacionTipoSexoActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirImportacionTipoSexo")) {
				
				jButtonAbrirImportacionTipoSexoActionPerformed(evt);
				
			} else if(sTipo.equals("TiposAccionesTipoSexo")) {
				jComboBoxTiposAccionesTipoSexoActionListener(evt,false);
			} else if(sTipo.equals("TiposRelacionesTipoSexo")) {
				jComboBoxTiposRelacionesTipoSexoActionListener(evt);
			} else if(sTipo.equals("TiposAccionesFormularioTipoSexo")) {
				jComboBoxTiposAccionesTipoSexoActionListener(evt,true);
			} else if(sTipo.equals("TiposSeleccionarTipoSexo")) {
				
				jComboBoxTiposSeleccionarTipoSexoActionListener(evt);
				
			} else if(sTipo.equals("ValorCampoGeneralTipoSexo")) {
				jTextFieldValorCampoGeneralTipoSexoActionListener(evt);
			}
			
			
			else if(sTipo.equals("AbrirOrderByTipoSexo")) {
				jButtonAbrirOrderByTipoSexoActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirOrderByToolBarTipoSexo")) {
				jButtonAbrirOrderByTipoSexoActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarOrderByTipoSexo")) {
				jButtonCerrarOrderByTipoSexoActionPerformed(evt);
			} 
						
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idTipoSexoBusqueda")) {
				this.jButtonidTipoSexoBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_empresaTipoSexoUpdate")) {
				this.jButtonid_empresaTipoSexoUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_empresaTipoSexoBusqueda")) {
				this.jButtonid_empresaTipoSexoBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("codigoTipoSexoBusqueda")) {
				this.jButtoncodigoTipoSexoBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombreTipoSexoBusqueda")) {
				this.jButtonnombreTipoSexoBusquedaActionPerformed(evt);
			}
			
			
			
			
			
			;
			
			
			TipoSexoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tiposexo,new Object(),this.tiposexoParameterGeneral,this.tiposexoReturnGeneral);
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoSexoConstantesFunciones.CLASSNAME);
			
  		} finally {
      		this.finishProcessTipoSexo();
      	}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoSexoActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tiposexo);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tiposexo);
				
				TipoSexoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tiposexo,new Object(),this.tiposexoParameterGeneral,this.tiposexoReturnGeneral);
				
				


				
				TipoSexoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tiposexo,new Object(),this.tiposexoParameterGeneral,this.tiposexoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoSexo.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoSexo.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
				}
				
			} catch(Exception e) {
  				FuncionesSwing.manageException2(this, e,logger,TipoSexoConstantesFunciones.CLASSNAME);
  			}
    }
	
	public Boolean existeCambioValor(ControlTipo controlTipo,String sTipo) throws Exception {
		Boolean existeCambio=true;
		
		try {
			TipoSexo tiposexoLocal=null;
			
			if(!this.getEsControlTabla()) {
				tiposexoLocal=this.tiposexo;
			} else {
				tiposexoLocal=this.tiposexoAnterior;
			}
			
			if(controlTipo.equals(ControlTipo.TEXTBOX)) {
				


			}
		
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoSexoConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tiposexo);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tiposexo);
				
				TipoSexoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tiposexo,new Object(),this.tiposexoParameterGeneral,this.tiposexoReturnGeneral);
							
				
				


				
				TipoSexoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tiposexo,new Object(),this.tiposexoParameterGeneral,this.tiposexoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoSexo.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoSexo.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoSexoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoSexoActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosTipoSexo.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tiposexoAnterior =(TipoSexo) this.tiposexoLogic.getTipoSexos().toArray()[this.jTableDatosTipoSexo.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tiposexoAnterior =(TipoSexo) this.tiposexos.toArray()[this.jTableDatosTipoSexo.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoSexoConstantesFunciones.CLASSNAME);
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
			
			TipoSexoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tiposexo,new Object(),this.tiposexoParameterGeneral,this.tiposexoReturnGeneral);
			
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
			
			


			
			TipoSexoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tiposexo,new Object(),this.tiposexoParameterGeneral,this.tiposexoReturnGeneral);
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoSexoConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE QUITA ALGUN CARACTER
	public void jTextFieldRemoveUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoSexoConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE INGRESA ALGUN CARACTER
	public void jTextFieldInsertUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoSexoConstantesFunciones.CLASSNAME);
  		}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jFormattedTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoSexoActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tiposexo);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tiposexo);
				
				TipoSexoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tiposexo,new Object(),this.tiposexoParameterGeneral,this.tiposexoReturnGeneral);
								
						
				


				
				TipoSexoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tiposexo,new Object(),this.tiposexoParameterGeneral,this.tiposexoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoSexo.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoSexo.class.getName(),sTipo,"DATE",esControlTabla,conIrServidorAplicacionParent,
							id,JFormattedTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoSexoConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tiposexo);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tiposexo);
				
				TipoSexoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tiposexo,new Object(),this.tiposexoParameterGeneral,this.tiposexoReturnGeneral);
								
				
				


				
				TipoSexoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tiposexo,new Object(),this.tiposexoParameterGeneral,this.tiposexoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoSexo.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoSexo.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoSexoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jFormattedTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoSexoActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosTipoSexo.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tiposexoAnterior =(TipoSexo) this.tiposexoLogic.getTipoSexos().toArray()[this.jTableDatosTipoSexo.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tiposexoAnterior =(TipoSexo) this.tiposexos.toArray()[this.jTableDatosTipoSexo.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoSexoConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusLostGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl() && this.existeCambioValor(ControlTipo.DATE,sTipo)) {
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tiposexo);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tiposexo);
			}	
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoSexoConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoSexoActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosTipoSexo.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tiposexoAnterior =(TipoSexo) this.tiposexoLogic.getTipoSexos().toArray()[this.jTableDatosTipoSexo.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tiposexoAnterior =(TipoSexo) this.tiposexos.toArray()[this.jTableDatosTipoSexo.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoSexoConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoSexoActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.tiposexo);
			
			this.actualizarInformacion("INFO_PADRE",false,this.tiposexo);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoSexoConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tiposexo);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tiposexo);
				
				TipoSexoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tiposexo,new Object(),this.tiposexoParameterGeneral,this.tiposexoReturnGeneral);
							
				
				


				
				TipoSexoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tiposexo,new Object(),this.tiposexoParameterGeneral,this.tiposexoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoSexo.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoSexo.class.getName(),sTipo,"TEXTAREA",esControlTabla,conIrServidorAplicacionParent,
							id,jTextArea, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoSexoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoSexoActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosTipoSexo.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tiposexoAnterior =(TipoSexo) this.tiposexoLogic.getTipoSexos().toArray()[this.jTableDatosTipoSexo.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.tiposexoAnterior =(TipoSexo) this.tiposexos.toArray()[this.jTableDatosTipoSexo.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoSexoConstantesFunciones.CLASSNAME);
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
			
			TipoSexoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tiposexo,new Object(),this.tiposexoParameterGeneral,this.tiposexoReturnGeneral);
			
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
			
			


			
			TipoSexoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tiposexo,new Object(),this.tiposexoParameterGeneral,this.tiposexoReturnGeneral);
			
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoSexoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaRemoveUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoSexoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaInsertUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoSexoConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jTextAreaActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoSexoActual();
			
			this.actualizarInformacion("EVENTO_CONTROL",false,this.tiposexo);
			
			this.actualizarInformacion("INFO_PADRE",false,this.tiposexo);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoSexoConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tiposexo);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tiposexo);
				
				TipoSexoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tiposexo,new Object(),this.tiposexoParameterGeneral,this.tiposexoReturnGeneral);
								
				
				


				
				TipoSexoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tiposexo,new Object(),this.tiposexoParameterGeneral,this.tiposexoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoSexo.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoSexo.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jLabel, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoSexoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jLabelFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoSexoActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosTipoSexo.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tiposexoAnterior =(TipoSexo) this.tiposexoLogic.getTipoSexos().toArray()[this.jTableDatosTipoSexo.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tiposexoAnterior =(TipoSexo) this.tiposexos.toArray()[this.jTableDatosTipoSexo.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoSexoConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jLabelActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoSexoActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.tiposexo);
			
			this.actualizarInformacion("INFO_PADRE",false,this.tiposexo);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoSexoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxItemListenerGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoSexoActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tiposexo);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tiposexo);
				
				TipoSexoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tiposexo,new Object(),this.tiposexoParameterGeneral,this.tiposexoReturnGeneral);
												
				
				if(sTipo.equals("SeleccionarTodosTipoSexo")) {
					jCheckBoxSeleccionarTodosTipoSexoItemListener(evt);
				
				} else if(sTipo.equals("SeleccionadosTipoSexo")) {
					jCheckBoxSeleccionadosTipoSexoItemListener(evt);
				
				} else if(sTipo.equals("NuevoToolBarTipoSexo")) {
					
				}
				
				


				
				
				TipoSexoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tiposexo,new Object(),this.tiposexoParameterGeneral,this.tiposexoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoSexo.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoSexo.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoSexoConstantesFunciones.CLASSNAME);
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
				
				//this.actualizarInformacion("EVENTO_CONTROL",false,this.tiposexo);
				
				//this.actualizarInformacion("INFO_PADRE",false,this.tiposexo);
				
				TipoSexoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tiposexo,new Object(),this.tiposexoParameterGeneral,this.tiposexoReturnGeneral);
												
				
				


				
				
				TipoSexoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tiposexo,new Object(),this.tiposexoParameterGeneral,this.tiposexoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoSexo.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoSexo.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoSexoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoSexoActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosTipoSexo.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tiposexoAnterior =(TipoSexo) this.tiposexoLogic.getTipoSexos().toArray()[this.jTableDatosTipoSexo.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.tiposexoAnterior =(TipoSexo) this.tiposexos.toArray()[this.jTableDatosTipoSexo.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoSexoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoSexoActual();
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tiposexo);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tiposexo);
				
				TipoSexoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tiposexo,new Object(),this.tiposexoParameterGeneral,this.tiposexoReturnGeneral);
				
				
				TipoSexoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tiposexo,new Object(),this.tiposexoParameterGeneral,this.tiposexoReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoSexoConstantesFunciones.CLASSNAME);
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
			
			TipoSexoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.tiposexo,new Object(),this.tiposexoParameterGeneral,this.tiposexoReturnGeneral);
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
			
			


			
			TipoSexoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tiposexo,new Object(),this.tiposexoParameterGeneral,this.tiposexoReturnGeneral);
			*/						
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoSexoConstantesFunciones.CLASSNAME);
  		}		
    }
	
	@SuppressWarnings("rawtypes")
	public void jComboBoxItemStateChangedGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if (evt.getStateChange() == ItemEvent.SELECTED && this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoSexoActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tiposexo);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tiposexo);
				
				TipoSexoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.tiposexo,new Object(),this.tiposexoParameterGeneral,this.tiposexoReturnGeneral);
				
				
				String sFinalQueryCombo="";
				
				


				
				TipoSexoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tiposexo,new Object(),this.tiposexoParameterGeneral,this.tiposexoReturnGeneral);
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoSexo.class.getName());
								
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoSexo.class.getName(),sTipo,"COMBOBOX",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoSexoConstantesFunciones.CLASSNAME);
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
			
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tiposexo);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tiposexo);
				
				TipoSexoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.tiposexo,new Object(),this.tiposexoParameterGeneral,this.tiposexoReturnGeneral);
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
				
				


				
				TipoSexoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tiposexo,new Object(),this.tiposexoParameterGeneral,this.tiposexoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoSexo.class.getName());
				
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoSexo.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoSexoConstantesFunciones.CLASSNAME);
  		}
		
		*/
    }
	
	public void jComboBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoSexoActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosTipoSexo.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tiposexoAnterior =(TipoSexo) this.tiposexoLogic.getTipoSexos().toArray()[this.jTableDatosTipoSexo.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tiposexoAnterior =(TipoSexo) this.tiposexos.toArray()[this.jTableDatosTipoSexo.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoSexoConstantesFunciones.CLASSNAME);
  		}
    }		
	
	public void tableValueChangedGeneral(String sTipo,ListSelectionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				TipoSexoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tiposexo,new Object(),this.tiposexoParameterGeneral,this.tiposexoReturnGeneral);
				
				if(sTipo.equals("TableDatosSeleccionarTipoSexo")) {
					//BYDAN_DESHABILITADO
					//try {jTableDatosTipoSexoListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
					
					//SOLO CUANDO MOUSE ES SOLTADO
					if (!evt.getValueIsAdjusting()) {
						//SELECCIONA FILA A OBJETO ACTUAL
						Integer intSelectedRow = this.jTableDatosTipoSexo.getSelectedRow();
						
						if(intSelectedRow!=null && intSelectedRow>-1) {
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								this.tiposexo =(TipoSexo) this.tiposexoLogic.getTipoSexos().toArray()[this.jTableDatosTipoSexo.convertRowIndexToModel(intSelectedRow)];
							} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
								this.tiposexo =(TipoSexo) this.tiposexos.toArray()[this.jTableDatosTipoSexo.convertRowIndexToModel(intSelectedRow)];
							}
							//ARCHITECTURE
							
							//System.out.println(this.tiposexo);
						}
					}
					
				} else if(sTipo.equals("jButtonCancelarTipoSexo")) {
				
				}
				
				TipoSexoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tiposexo,new Object(),this.tiposexoParameterGeneral,this.tiposexoReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoSexoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void tableMouseAdapterGeneral(String sTipo,MouseEvent evt) { 	  
		try {
			TipoSexoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.tiposexo,new Object(),this.tiposexoParameterGeneral,this.tiposexoReturnGeneral);
			
			if(sTipo.equals("DatosSeleccionarTipoSexo")) {
				if (evt.getClickCount() == 2) {
					jButtonIdActionPerformed(null,jTableDatosTipoSexo.getSelectedRow(),false,false);
				}	
			} else if(sTipo.equals("jButtonCancelarTipoSexo")) {
			
			}
			
			TipoSexoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.tiposexo,new Object(),this.tiposexoParameterGeneral,this.tiposexoReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoSexoConstantesFunciones.CLASSNAME);
  		}
    }
	
	;
	
	public void jButtonActionPerformedTecladoGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			this.startProcessTipoSexo();
			
			TipoSexoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tiposexo,new Object(),this.tiposexoParameterGeneral,this.tiposexoReturnGeneral);
			
			if(sTipo.equals("NuevoTipoSexo")) {
				jButtonNuevoTipoSexoActionPerformed(evt,false);
				
			} else if(sTipo.equals("DuplicarTipoSexo")) {
				jButtonDuplicarTipoSexoActionPerformed(evt,false);
				
			} else if(sTipo.equals("CopiarTipoSexo")) {
				jButtonCopiarTipoSexoActionPerformed(evt);
				
			} else if(sTipo.equals("VerFormTipoSexo")) {
				jButtonVerFormTipoSexoActionPerformed(evt);
				
			} else if(sTipo.equals("NuevoRelacionesTipoSexo")) {
				jButtonNuevoTipoSexoActionPerformed(evt,true);
				
			} else if(sTipo.equals("ModificarTipoSexo")) {
				jButtonModificarTipoSexoActionPerformed(evt);
				
			} else if(sTipo.equals("ActualizarTipoSexo")) {
				jButtonActualizarTipoSexoActionPerformed(evt);
				
			} else if(sTipo.equals("EliminarTipoSexo")) {
				jButtonEliminarTipoSexoActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosTablaTipoSexo")) {
				jButtonGuardarCambiosTipoSexoActionPerformed(evt);
				
			} else if(sTipo.equals("CancelarTipoSexo")) {
				jButtonCancelarTipoSexoActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarTipoSexo")) {
				jButtonCerrarTipoSexoActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosTipoSexo")) {
				jButtonGuardarCambiosTipoSexoActionPerformed(evt);
			
			} else if(sTipo.equals("NuevoGuardarCambiosTipoSexo")) {
				jButtonNuevoGuardarCambiosTipoSexoActionPerformed(evt);
			
			} else if(sTipo.equals("AbrirOrderByTipoSexo")) {
				jButtonAbrirOrderByTipoSexoActionPerformed(evt);
			
			} else if(sTipo.equals("RecargarInformacionTipoSexo")) {
				jButtonRecargarInformacionTipoSexoActionPerformed(evt);
			
			} else if(sTipo.equals("AnterioresTipoSexo")) {
				jButtonAnterioresTipoSexoActionPerformed(evt);			
			
			}  else if(sTipo.equals("SiguientesTipoSexo")) {
				jButtonSiguientesTipoSexoActionPerformed(evt);			
			} 
			
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idTipoSexoBusqueda")) {
				this.jButtonidTipoSexoBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_empresaTipoSexoUpdate")) {
				this.jButtonid_empresaTipoSexoUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_empresaTipoSexoBusqueda")) {
				this.jButtonid_empresaTipoSexoBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("codigoTipoSexoBusqueda")) {
				this.jButtoncodigoTipoSexoBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombreTipoSexoBusqueda")) {
				this.jButtonnombreTipoSexoBusquedaActionPerformed(evt);
			}
			
			TipoSexoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tiposexo,new Object(),this.tiposexoParameterGeneral,this.tiposexoReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoSexoConstantesFunciones.CLASSNAME);
			
  		}  finally {
      		this.finishProcessTipoSexo();
      	}
    }
	
	public void internalFrameClosingInternalFrameGeneral(String sTipo,InternalFrameEvent evt) { 	  
		try {
			TipoSexoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.tiposexo,new Object(),this.tiposexoParameterGeneral,this.tiposexoReturnGeneral);
			
			if(sTipo.equals("CloseInternalFrameTipoSexo")) {
				closingInternalFrameTipoSexo();
				
			} else if(sTipo.equals("jButtonCancelarTipoSexo")) {
				JInternalFrameBase jInternalFrameDetalleFormTipoSexo = (JInternalFrameBase)evt.getSource();
	            	
	            TipoSexoBeanSwingJInternalFrame jInternalFrameParent=(TipoSexoBeanSwingJInternalFrame)jInternalFrameDetalleFormTipoSexo.getjInternalFrameParent();
	            
				jInternalFrameParent.jButtonCancelarTipoSexoActionPerformed(null);
			}
			
			TipoSexoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.tiposexo,new Object(),this.tiposexoParameterGeneral,this.tiposexoReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoSexoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void recargarFormTipoSexo(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion) throws Exception {
		this.recargarFormTipoSexo(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,false);
	}
	
	public void recargarFormTipoSexo(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion,Boolean esControlTabla) throws Exception {
		if(this.permiteRecargarForm && this.permiteMantenimiento(this.tiposexo)) {
			if(!esControlTabla) {
				if(TipoSexoJInternalFrame.ISBINDING_MANUAL_TABLA) {			
					this.setVariablesFormularioToObjetoActualTipoSexo(this.tiposexo,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoSexo(this.tiposexo);			
				}
				
				if(this.tiposexoSessionBean.getEstaModoGuardarRelaciones()) {
					this.setVariablesFormularioRelacionesToObjetoActualTipoSexo(this.tiposexo,classes);				
				}
			
				if(conIrServidorAplicacion) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {						
						this.tiposexoReturnGeneral=tiposexoLogic.procesarEventosTipoSexosWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.tiposexoLogic.getTipoSexos(),this.tiposexo,this.tiposexoParameterGeneral,this.isEsNuevoTipoSexo,classes);//this.tiposexoLogic.getTipoSexo()//sTipoGeneral
									
					} else if(Constantes.ISUSAEJBREMOTE) {
									
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE
					
					//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					//this.setVariablesObjetoReturnGeneralToBeanTipoSexo(this.tiposexoReturnGeneral,this.tiposexoBean,false);
						
					//ACTUALIZA VARIABLES RELACIONES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					if(this.tiposexoSessionBean.getEstaModoGuardarRelaciones()) {
						//this.setVariablesRelacionesObjetoReturnGeneralToBeanTipoSexo(classes,this.tiposexoReturnGeneral,this.tiposexoBean,false);
					}
						
					if(this.tiposexoReturnGeneral.getConRecargarPropiedades()) {
						//INICIALIZA VARIABLES COMBOS NORMALES (FK)
						this.setVariablesObjetoActualToFormularioForeignKeyTipoSexo(this.tiposexoReturnGeneral.getTipoSexo());
							
						//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
						this.setVariablesObjetoActualToFormularioTipoSexo(this.tiposexoReturnGeneral.getTipoSexo());	
					}
						
					if(this.tiposexoReturnGeneral.getConRecargarRelaciones()) {
						//INICIALIZA VARIABLES RELACIONES A FORMULARIO
						this.setVariablesRelacionesObjetoActualToFormularioTipoSexo(this.tiposexoReturnGeneral.getTipoSexo(),classes);//this.tiposexoBean);	
					}									
					
				} else {				
					//INICIALIZA VARIABLES RELACIONES A FORMULARIO
					this.setVariablesRelacionesObjetoActualToFormularioTipoSexo(this.tiposexo,classes);//this.tiposexoBean);									
				}
			
				if(TipoSexoJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesFormularioToObjetoActualTipoSexo(this.tiposexo,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoSexo(this.tiposexo);				
				}
				
			} else {
				
				if(((controlTipo.equals(ControlTipo.TEXTBOX) || controlTipo.equals(ControlTipo.DATE)
					|| controlTipo.equals(ControlTipo.TEXTAREA) || controlTipo.equals(ControlTipo.COMBOBOX)
					)				
					&& eventoTipo.equals(EventoTipo.CHANGE)
					)
					
					|| (controlTipo.equals(ControlTipo.CHECKBOX) && eventoTipo.equals(EventoTipo.CLIC))
					
				) { // && sTipoGeneral.equals("TEXTBOX")
					
					if(this.tiposexoAnterior!=null) {
						this.tiposexo=this.tiposexoAnterior;
					}
				}
				
				if(conIrServidorAplicacion) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {						
						this.tiposexoReturnGeneral=tiposexoLogic.procesarEventosTipoSexosWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.tiposexoLogic.getTipoSexos(),this.tiposexo,this.tiposexoParameterGeneral,this.isEsNuevoTipoSexo,classes);//this.tiposexoLogic.getTipoSexo()//sTipoGeneral
									
					} else if(Constantes.ISUSAEJBREMOTE) {
									
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.tiposexoSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.tiposexoSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(this.tiposexoReturnGeneral.getTipoSexo(),tiposexoLogic.getTipoSexos());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(this.tiposexoReturnGeneral.getTipoSexo(),this.tiposexos);
				}
				//ARCHITECTURE
				
				//this.jTableDatosTipoSexo.repaint();
				
				//((AbstractTableModel) this.jTableDatosTipoSexo.getModel()).fireTableDataChanged();
				
				this.actualizarVisualTableDatosTipoSexo();
			}
		}
	}
	
	public void actualizarVisualTableDatosTipoSexo() throws Exception {
		
		TipoSexoModel tiposexoModel=(TipoSexoModel)this.jTableDatosTipoSexo.getModel();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tiposexoModel.tiposexos=this.tiposexoLogic.getTipoSexos();
		
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
			tiposexoModel.tiposexos=this.tiposexos;
		}
		
		
		((TipoSexoModel) this.jTableDatosTipoSexo.getModel()).fireTableDataChanged();
	}
	
	public void actualizarVisualTableDatosEventosVistaTipoSexo() throws Exception {
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.actualizarLista(this.gettiposexoAnterior(),this.tiposexoLogic.getTipoSexos());
					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			this.actualizarLista(this.gettiposexoAnterior(),this.tiposexos);
		}
		//ARCHITECTURE
						
		this.actualizarFilaTotales();
						
		this.actualizarVisualTableDatosTipoSexo();	
	}
	
	public void setVariablesRelacionesObjetoActualToFormularioTipoSexo(TipoSexo tiposexo,ArrayList<Classe> classes) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoSexoConstantesFunciones.CLASSNAME);
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
										
				TipoSexoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.tiposexo,new Object(),generalEntityParameterGeneral,this.tiposexoReturnGeneral);
				
				ArrayList<Classe> classes=new ArrayList<Classe>();
				
				for(String sClasse:arrClasses) {
					if(sClasse.equals("TODOS")) {
						conTodasRelaciones=true;
						break;
					}
				}
				
				if(this.tiposexoSessionBean.getConGuardarRelaciones()) {
					if(conTodasRelaciones) {
						classes=TipoSexoConstantesFunciones.getClassesRelationshipsOfTipoSexo(new ArrayList<Classe>(),DeepLoadType.NONE);
					} else {
						classes=TipoSexoConstantesFunciones.getClassesRelationshipsFromStringsOfTipoSexo(arrClasses,DeepLoadType.NONE);
					}
				}
	
				this.classesActual=new ArrayList<Classe>();
				this.classesActual.addAll(classes);
	
				this.recargarFormTipoSexo(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,esControlTabla);
										
				TipoSexoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.tiposexo,new Object(),generalEntityParameterGeneral,this.tiposexoReturnGeneral);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoSexoConstantesFunciones.CLASSNAME);
  		}
    }
	
	/*
	public void setVariablesRelacionesObjetoBeanActualToFormularioTipoSexo(TipoSexoBean tiposexoBean) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoSexoConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesRelacionesObjetoReturnGeneralToBeanTipoSexo(ArrayList<Classe> classes,TipoSexoReturnGeneral tiposexoReturnGeneral,TipoSexoBean tiposexoBean,Boolean conDefault) throws Exception {
		
	}
	*/
	
	public void setVariablesFormularioRelacionesToObjetoActualTipoSexo(TipoSexo tiposexo,ArrayList<Classe> classes) throws Exception {
		
	}
	
	public Boolean permiteManejarEventosControl() {
		Boolean permite=true;				
		
		if(this.estaModoNuevo || this.estaModoSeleccionar || this.estaModoEliminarGuardarCambios) {
			permite=false;
			
		} 
		
		//NO DEBE MEZCLARSE CONCEPTOS
		/*	
		if(!paraTabla && !this.permiteMantenimiento(this.tiposexo)) {
			System.out.println("ERROR:EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES");
				
			//JOptionPane.showMessageDialog(this,"EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES","EVENTO",JOptionPane.ERROR_MESSAGE);			
		}
		*/
		
		return permite;
	}
	
	public void inicializarFormDetalle() throws Exception {
		
		this.jInternalFrameDetalleFormTipoSexo = new TipoSexoDetalleFormJInternalFrame(jDesktopPane,this.tiposexoSessionBean.getConGuardarRelaciones(),this.tiposexoSessionBean.getEsGuardarRelacionado(),this.cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		this.jDesktopPane.add(this.jInternalFrameDetalleFormTipoSexo);
		this.jInternalFrameDetalleFormTipoSexo.setVisible(false);
		this.jInternalFrameDetalleFormTipoSexo.setSelected(false);						
		
		this.jInternalFrameDetalleFormTipoSexo.setJInternalFrameParent(this);
		
		this.jInternalFrameDetalleFormTipoSexo.tiposexoLogic=this.tiposexoLogic;
		
		this.cargarCombosFrameForeignKeyTipoSexo("Formulario");
		
		this.inicializarActualizarBindingBotonesPermisosManualFormDetalleTipoSexo();
		this.inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleTipoSexo();
		
		this.initActionsFormDetalle();		
		
		this.initActionsCombosTodosForeignKeyTipoSexo("Formulario");
		
		//TALVEZ conSetVariablesGlobales COMO if() 
		this.setVariablesGlobalesCombosForeignKeyTipoSexo();
		
		this.cargarMenuRelaciones();
		
	}
	
	public void initActionsFormDetalle() {	
		
		this.jInternalFrameDetalleFormTipoSexo.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarTipoSexo"));
		
		this.jInternalFrameDetalleFormTipoSexo.jButtonModificarTipoSexo.addActionListener(new ButtonActionListener(this,"ModificarTipoSexo"));

		
		this.jInternalFrameDetalleFormTipoSexo.jButtonModificarToolBarTipoSexo.addActionListener(new ButtonActionListener(this,"ModificarToolBarTipoSexo"));
					
		this.jInternalFrameDetalleFormTipoSexo.jMenuItemModificarTipoSexo.addActionListener(new ButtonActionListener(this,"MenuItemModificarTipoSexo"));		
		
		
		
		this.jInternalFrameDetalleFormTipoSexo.jButtonActualizarTipoSexo.addActionListener (new ButtonActionListener(this,"ActualizarTipoSexo"));
		
		
		this.jInternalFrameDetalleFormTipoSexo.jButtonActualizarToolBarTipoSexo.addActionListener(new ButtonActionListener(this,"ActualizarToolBarTipoSexo"));
						
		this.jInternalFrameDetalleFormTipoSexo.jMenuItemActualizarTipoSexo.addActionListener (new ButtonActionListener(this,"MenuItemActualizarTipoSexo"));		
		
		
		
		this.jInternalFrameDetalleFormTipoSexo.jButtonEliminarTipoSexo.addActionListener (new ButtonActionListener(this,"EliminarTipoSexo"));
		
		
		this.jInternalFrameDetalleFormTipoSexo.jButtonEliminarToolBarTipoSexo.addActionListener (new ButtonActionListener(this,"EliminarToolBarTipoSexo"));
								
		this.jInternalFrameDetalleFormTipoSexo.jMenuItemEliminarTipoSexo.addActionListener (new ButtonActionListener(this,"MenuItemEliminarTipoSexo"));		
		
		
		
		this.jInternalFrameDetalleFormTipoSexo.jButtonCancelarTipoSexo.addActionListener (new ButtonActionListener(this,"CancelarTipoSexo"));
		
		
		this.jInternalFrameDetalleFormTipoSexo.jButtonCancelarToolBarTipoSexo.addActionListener (new ButtonActionListener(this,"CancelarToolBarTipoSexo"));
					
		this.jInternalFrameDetalleFormTipoSexo.jMenuItemCancelarTipoSexo.addActionListener (new ButtonActionListener(this,"MenuItemCancelarTipoSexo"));		
		
		
		
		
		
		this.jInternalFrameDetalleFormTipoSexo.jMenuItemDetalleCerrarTipoSexo.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarTipoSexo"));		
		
		
		
		this.jInternalFrameDetalleFormTipoSexo.jButtonGuardarCambiosToolBarTipoSexo.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarTipoSexo"));
		
		
		
		this.jInternalFrameDetalleFormTipoSexo.jButtonGuardarCambiosToolBarTipoSexo.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarTipoSexo"));
		
		
		
		this.jInternalFrameDetalleFormTipoSexo.jComboBoxTiposAccionesFormularioTipoSexo.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioTipoSexo"));
		
		
				
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoSexo.jButtonidTipoSexoBusqueda.addActionListener(new ButtonActionListener(this,"idTipoSexoBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormTipoSexo.jButtonid_empresaTipoSexoUpdate.addActionListener(new ButtonActionListener(this,"id_empresaTipoSexoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoSexo.jButtonid_empresaTipoSexoBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaTipoSexoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoSexo.jButtoncodigoTipoSexoBusqueda.addActionListener(new ButtonActionListener(this,"codigoTipoSexoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoSexo.jButtonnombreTipoSexoBusqueda.addActionListener(new ButtonActionListener(this,"nombreTipoSexoBusqueda"));
		
		
		;

		//TABBED PANE RELACIONES
		this.jInternalFrameDetalleFormTipoSexo.jTabbedPaneRelacionesTipoSexo.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesTipoSexo"));
		
		;		
		//TABBED PANE RELACIONES FIN(EXTRA TAB)	
	}
	
	public void initActions() {				
		this.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"CloseInternalFrameTipoSexo"));
		
		if(this.jInternalFrameDetalleFormTipoSexo!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoSexo.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarTipoSexo"));
		}
		
		this.jTableDatosTipoSexo.getSelectionModel().addListSelectionListener(new TableListSelectionListener(this,"TableDatosSeleccionarTipoSexo"));
		
		this.jTableDatosTipoSexo.addMouseListener(new TableMouseAdapter(this,"DatosSeleccionarTipoSexo"));
		
		this.jButtonNuevoTipoSexo.addActionListener(new ButtonActionListener(this,"NuevoTipoSexo"));
		
		this.jButtonDuplicarTipoSexo.addActionListener(new ButtonActionListener(this,"DuplicarTipoSexo"));
		
		this.jButtonCopiarTipoSexo.addActionListener(new ButtonActionListener(this,"CopiarTipoSexo"));
		
		this.jButtonVerFormTipoSexo.addActionListener(new ButtonActionListener(this,"VerFormTipoSexo"));
		
		
		this.jButtonNuevoToolBarTipoSexo.addActionListener(new ButtonActionListener(this,"NuevoToolBarTipoSexo"));
			
		this.jButtonDuplicarToolBarTipoSexo.addActionListener(new ButtonActionListener(this,"DuplicarToolBarTipoSexo"));
			
		this.jMenuItemNuevoTipoSexo.addActionListener (new ButtonActionListener(this,"MenuItemNuevoTipoSexo"));
			
		this.jMenuItemDuplicarTipoSexo.addActionListener (new ButtonActionListener(this,"MenuItemDuplicarTipoSexo"));		
		
		
		this.jButtonNuevoRelacionesTipoSexo.addActionListener (new ButtonActionListener(this,"NuevoRelacionesTipoSexo"));
		
		
		this.jButtonNuevoRelacionesToolBarTipoSexo.addActionListener(new ButtonActionListener(this,"NuevoRelacionesToolBarTipoSexo"));
			
		this.jMenuItemNuevoRelacionesTipoSexo.addActionListener(new ButtonActionListener(this,"MenuItemNuevoRelacionesTipoSexo"));		
		
		
		if(this.jInternalFrameDetalleFormTipoSexo!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoSexo.jButtonModificarTipoSexo.addActionListener(new ButtonActionListener(this,"ModificarTipoSexo"));
		}
		
		
		if(this.jInternalFrameDetalleFormTipoSexo!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoSexo.jButtonModificarToolBarTipoSexo.addActionListener(new ButtonActionListener(this,"ModificarToolBarTipoSexo"));
			
			this.jInternalFrameDetalleFormTipoSexo.jMenuItemModificarTipoSexo.addActionListener(new ButtonActionListener(this,"MenuItemModificarTipoSexo"));		
		}
		
		
		if(this.jInternalFrameDetalleFormTipoSexo!=null) { //if(this.conCargarFormDetalle) {			
			this.jInternalFrameDetalleFormTipoSexo.jButtonActualizarTipoSexo.addActionListener (new ButtonActionListener(this,"ActualizarTipoSexo"));
		}
		
		
		if(this.jInternalFrameDetalleFormTipoSexo!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoSexo.jButtonActualizarToolBarTipoSexo.addActionListener(new ButtonActionListener(this,"ActualizarToolBarTipoSexo"));
				
			this.jInternalFrameDetalleFormTipoSexo.jMenuItemActualizarTipoSexo.addActionListener (new ButtonActionListener(this,"MenuItemActualizarTipoSexo"));		
		}
		
		
		if(this.jInternalFrameDetalleFormTipoSexo!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoSexo.jButtonEliminarTipoSexo.addActionListener (new ButtonActionListener(this,"EliminarTipoSexo"));
		}
		
		
		if(this.jInternalFrameDetalleFormTipoSexo!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoSexo.jButtonEliminarToolBarTipoSexo.addActionListener (new ButtonActionListener(this,"EliminarToolBarTipoSexo"));
						
			this.jInternalFrameDetalleFormTipoSexo.jMenuItemEliminarTipoSexo.addActionListener (new ButtonActionListener(this,"MenuItemEliminarTipoSexo"));		
		}
		
		
		if(this.jInternalFrameDetalleFormTipoSexo!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoSexo.jButtonCancelarTipoSexo.addActionListener (new ButtonActionListener(this,"CancelarTipoSexo"));
		}
		
		
		if(this.jInternalFrameDetalleFormTipoSexo!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoSexo.jButtonCancelarToolBarTipoSexo.addActionListener (new ButtonActionListener(this,"CancelarToolBarTipoSexo"));
			
			this.jInternalFrameDetalleFormTipoSexo.jMenuItemCancelarTipoSexo.addActionListener (new ButtonActionListener(this,"MenuItemCancelarTipoSexo"));		
		}
		
		this.jButtonMostrarOcultarTablaToolBarTipoSexo.addActionListener (new ButtonActionListener(this,"MostrarOcultarToolBarTipoSexo"));		
		
		
		this.jButtonCerrarTipoSexo.addActionListener (new ButtonActionListener(this,"CerrarTipoSexo"));
		
		
		this.jButtonCerrarToolBarTipoSexo.addActionListener (new ButtonActionListener(this,"CerrarToolBarTipoSexo"));
			
		this.jMenuItemCerrarTipoSexo.addActionListener (new ButtonActionListener(this,"MenuItemCerrarTipoSexo"));
			
		if(this.jInternalFrameDetalleFormTipoSexo!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoSexo.jMenuItemDetalleCerrarTipoSexo.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarTipoSexo"));		
		}
		
		
		if(this.jInternalFrameDetalleFormTipoSexo!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoSexo.jButtonGuardarCambiosTipoSexo.addActionListener (new ButtonActionListener(this,"GuardarCambiosTipoSexo"));
		}
		
		
		if(this.jInternalFrameDetalleFormTipoSexo!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoSexo.jButtonGuardarCambiosToolBarTipoSexo.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarTipoSexo"));
		}
		
		this.jButtonCopiarToolBarTipoSexo.addActionListener (new ButtonActionListener(this,"CopiarToolBarTipoSexo"));
			
		this.jButtonVerFormToolBarTipoSexo.addActionListener (new ButtonActionListener(this,"VerFormToolBarTipoSexo"));
		
		this.jMenuItemGuardarCambiosTipoSexo.addActionListener (new ButtonActionListener(this,"MenuItemGuardarCambiosTipoSexo"));
			
		this.jMenuItemCopiarTipoSexo.addActionListener (new ButtonActionListener(this,"MenuItemCopiarTipoSexo"));		
		
		this.jMenuItemVerFormTipoSexo.addActionListener (new ButtonActionListener(this,"MenuItemVerFormTipoSexo"));		
		
		
		this.jButtonGuardarCambiosTablaTipoSexo.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaTipoSexo"));
		
		
		this.jButtonGuardarCambiosTablaToolBarTipoSexo.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaToolBarTipoSexo"));
			
		this.jMenuItemGuardarCambiosTablaTipoSexo.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaTipoSexo"));		
		
		
		
		this.jButtonRecargarInformacionTipoSexo.addActionListener (new ButtonActionListener(this,"RecargarInformacionTipoSexo"));
					
		this.jButtonRecargarInformacionToolBarTipoSexo.addActionListener (new ButtonActionListener(this,"RecargarInformacionToolBarTipoSexo"));
		
		this.jMenuItemRecargarInformacionTipoSexo.addActionListener (new ButtonActionListener(this,"MenuItemRecargarInformacionTipoSexo"));		
		
		
		
		this.jButtonAnterioresTipoSexo.addActionListener (new ButtonActionListener(this,"AnterioresTipoSexo"));
		
		
		this.jButtonAnterioresToolBarTipoSexo.addActionListener (new ButtonActionListener(this,"AnterioresToolBarTipoSexo"));
		
		this.jMenuItemAnterioresTipoSexo.addActionListener (new ButtonActionListener(this,"MenuItemAnterioresTipoSexo"));		
		
		
		this.jButtonSiguientesTipoSexo.addActionListener (new ButtonActionListener(this,"SiguientesTipoSexo"));
		
		
		this.jButtonSiguientesToolBarTipoSexo.addActionListener (new ButtonActionListener(this,"SiguientesToolBarTipoSexo"));
			
		this.jMenuItemSiguientesTipoSexo.addActionListener (new ButtonActionListener(this,"MenuItemSiguientesTipoSexo"));
			
		this.jMenuItemAbrirOrderByTipoSexo.addActionListener (new ButtonActionListener(this,"MenuItemAbrirOrderByTipoSexo"));
			
		this.jMenuItemMostrarOcultarTipoSexo.addActionListener (new ButtonActionListener(this,"MenuItemMostrarOcultarTipoSexo"));
			
		this.jMenuItemDetalleAbrirOrderByTipoSexo.addActionListener (new ButtonActionListener(this,"MenuItemDetalleAbrirOrderByTipoSexo"));
			
		this.jMenuItemDetalleMostarOcultarTipoSexo.addActionListener (new ButtonActionListener(this,"MenuItemDetalleMostrarOcultarTipoSexo"));		
		
		
		this.jButtonNuevoGuardarCambiosTipoSexo.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosTipoSexo"));
		
		
		this.jButtonNuevoGuardarCambiosToolBarTipoSexo.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosToolBarTipoSexo"));
			
		this.jMenuItemNuevoGuardarCambiosTipoSexo.addActionListener (new ButtonActionListener(this,"MenuItemNuevoGuardarCambiosTipoSexo"));		
		
		
		
		//SELECCIONAR TODOS
		
		this.jCheckBoxSeleccionarTodosTipoSexo.addItemListener(new CheckBoxItemListener(this,"SeleccionarTodosTipoSexo"));

		this.jCheckBoxSeleccionadosTipoSexo.addItemListener(new CheckBoxItemListener(this,"SeleccionadosTipoSexo"));
		
		if(this.jInternalFrameDetalleFormTipoSexo!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoSexo.jComboBoxTiposAccionesFormularioTipoSexo.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioTipoSexo"));
		}
		
		
		this.jComboBoxTiposRelacionesTipoSexo.addActionListener (new ButtonActionListener(this,"TiposRelacionesTipoSexo"));
			
		this.jComboBoxTiposAccionesTipoSexo.addActionListener (new ButtonActionListener(this,"TiposAccionesTipoSexo"));
					
		this.jComboBoxTiposSeleccionarTipoSexo.addActionListener (new ButtonActionListener(this,"TiposSeleccionarTipoSexo"));
			
		this.jTextFieldValorCampoGeneralTipoSexo.addActionListener (new ButtonActionListener(this,"ValorCampoGeneralTipoSexo"));		
		
		
		if(this.jInternalFrameDetalleFormTipoSexo!=null) { //if(this.conCargarFormDetalle) {
		
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoSexo.jButtonidTipoSexoBusqueda.addActionListener(new ButtonActionListener(this,"idTipoSexoBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormTipoSexo.jButtonid_empresaTipoSexoUpdate.addActionListener(new ButtonActionListener(this,"id_empresaTipoSexoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoSexo.jButtonid_empresaTipoSexoBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaTipoSexoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoSexo.jButtoncodigoTipoSexoBusqueda.addActionListener(new ButtonActionListener(this,"codigoTipoSexoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoSexo.jButtonnombreTipoSexoBusqueda.addActionListener(new ButtonActionListener(this,"nombreTipoSexoBusqueda"));
		}
		
		if(!this.conCargarMinimo) {
		//BYDAN_BUSQUEDAS
		
				
		
		
			//REPORTE DINAMICO
			
			if(this.jInternalFrameReporteDinamicoTipoSexo!=null) {
				this.jInternalFrameReporteDinamicoTipoSexo.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoTipoSexo"));
				this.jInternalFrameReporteDinamicoTipoSexo.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoTipoSexo"));
				this.jInternalFrameReporteDinamicoTipoSexo.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoTipoSexo"));
			}
			
			//this.jButtonCerrarReporteDinamicoTipoSexo.addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoTipoSexo"));				
			//this.jButtonGenerarReporteDinamicoTipoSexo.addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoTipoSexo"));
			//this.jButtonGenerarExcelReporteDinamicoTipoSexo.addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoTipoSexo"));
				
				
			//IMPORTACION			
			if(this.jInternalFrameImportacionTipoSexo!=null) {
				this.jInternalFrameImportacionTipoSexo.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionTipoSexo"));
				this.jInternalFrameImportacionTipoSexo.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionTipoSexo"));
				this.jInternalFrameImportacionTipoSexo.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionTipoSexo"));
			}
			
			//ORDER BY
			this.jButtonAbrirOrderByTipoSexo.addActionListener (new ButtonActionListener(this,"AbrirOrderByTipoSexo"));
			
			this.jButtonAbrirOrderByToolBarTipoSexo.addActionListener (new ButtonActionListener(this,"AbrirOrderByToolBarTipoSexo"));			
			
			if(this.jInternalFrameOrderByTipoSexo!=null) {
				this.jInternalFrameOrderByTipoSexo.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByTipoSexo"));				
			}
			
			
		}
		
		
		
		if(!this.conCargarMinimo) {
			if(this.jInternalFrameDetalleFormTipoSexo!=null) { //if(this.conCargarFormDetalle) {
			;
			}
		}
		
		
		//TABBED PANE RELACIONES
		if(this.jInternalFrameDetalleFormTipoSexo!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoSexo.jTabbedPaneRelacionesTipoSexo.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesTipoSexo"));
		
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
            		closingInternalFrameTipoSexo();
				} catch (Exception e) {
					e.printStackTrace();
				}
            }
        });
		
		this.jInternalFrameDetalleFormTipoSexo.addInternalFrameListener(new javax.swing.event.InternalFrameAdapter() {
	        public void internalFrameClosing(InternalFrameEvent event) {
	            JInternalFrameBase jInternalFrameDetalleFormTipoSexo = (JInternalFrameBase)event.getSource();
	            	
	            TipoSexoBeanSwingJInternalFrame jInternalFrameParent=(TipoSexoBeanSwingJInternalFrame)jInternalFrameDetalleFormTipoSexo.getjInternalFrameParent();
	                
	            try {
					jInternalFrameParent.jButtonCancelarTipoSexoActionPerformed(null);
					
					//jInternalFrameParent.dispose();
					//jInternalFrameParent=null;
					
				} catch (Exception e) {
					e.printStackTrace();
				}
	        }
	    });
			
		this.jTableDatosTipoSexo.getSelectionModel().addListSelectionListener (
	                new ListSelectionListener() {
	                    public void valueChanged(ListSelectionEvent e) {
							//BYDAN_DESHABILITADO
	                    	//try {jTableDatosTipoSexoListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
	                    }
	                }
	     );
		
		this.jTableDatosTipoSexo.addMouseListener(new MouseAdapter() {
			   public void mouseClicked(MouseEvent evt) {
				      if (evt.getClickCount() == 2) {
				    	  jButtonIdActionPerformed(null,jTableDatosTipoSexo.getSelectedRow(),false,false);
				      }
				   }
		});
		
		this.jButtonNuevoTipoSexo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoTipoSexoActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoToolBarTipoSexo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoTipoSexoActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoTipoSexo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoTipoSexoActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoTipoSexo";
		inputMap = this.jButtonNuevoTipoSexo.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_N , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoTipoSexo.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoTipoSexoActionPerformed(evt,false);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonNuevoRelacionesTipoSexo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoTipoSexoActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoRelacionesToolBarTipoSexo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoTipoSexoActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoRelacionesTipoSexo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoTipoSexoActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoRelacionesTipoSexo";
		inputMap = this.jButtonNuevoRelacionesTipoSexo.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_R , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoRelacionesTipoSexo.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoTipoSexoActionPerformed(evt,true);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonModificarTipoSexo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarTipoSexoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonModificarToolBarTipoSexo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarTipoSexoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemModificarTipoSexo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarTipoSexoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ModificarTipoSexo";
		inputMap = this.jButtonModificarTipoSexo.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_M , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonModificarTipoSexo.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonModificarTipoSexoActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonActualizarTipoSexo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarTipoSexoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonActualizarToolBarTipoSexo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarTipoSexoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemActualizarTipoSexo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarTipoSexoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ActualizarTipoSexo";
		inputMap = this.jButtonActualizarTipoSexo.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonActualizarTipoSexo.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonActualizarTipoSexoActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonEliminarTipoSexo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarTipoSexoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonEliminarToolBarTipoSexo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarTipoSexoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
				
		this.jMenuItemEliminarTipoSexo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarTipoSexoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "EliminarTipoSexo";
		inputMap = this.jButtonEliminarTipoSexo.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_E , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonEliminarTipoSexo.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonEliminarTipoSexoActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCancelarTipoSexo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarTipoSexoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCancelarToolBarTipoSexo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarTipoSexoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCancelarTipoSexo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarTipoSexoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CancelarTipoSexo";
		inputMap = this.jButtonCancelarTipoSexo.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_Q , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonCancelarTipoSexo.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCancelarTipoSexoActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCerrarTipoSexo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarTipoSexoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCerrarToolBarTipoSexo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarTipoSexoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCerrarTipoSexo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarTipoSexoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemDetalleCerrarTipoSexo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  //try {jButtonCerrarTipoSexoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
					try {jButtonCancelarTipoSexoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CerrarTipoSexo";
		inputMap = this.jButtonCerrarTipoSexo.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_C , KeyEvent.ALT_MASK), sMapKey);
			
		this.jButtonCerrarTipoSexo.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCerrarTipoSexoActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jInternalFrameDetalleFormTipoSexo.jButtonGuardarCambiosTipoSexo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosTipoSexoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosToolBarTipoSexo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosTipoSexoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosTipoSexo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosTipoSexoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaTipoSexo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosTipoSexoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaToolBarTipoSexo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosTipoSexoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosTablaTipoSexo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosTipoSexoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "GuardarCambiosTipoSexo";
		inputMap = this.jInternalFrameDetalleFormTipoSexo.jButtonGuardarCambiosTipoSexo.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jInternalFrameDetalleFormTipoSexo.jButtonGuardarCambiosTipoSexo.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonGuardarCambiosTipoSexoActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonRecargarInformacionTipoSexo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionTipoSexoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonRecargarInformacionToolBarTipoSexo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionTipoSexoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemRecargarInformacionTipoSexo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionTipoSexoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		this.jButtonAnterioresTipoSexo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresTipoSexoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAnterioresToolBarTipoSexo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresTipoSexoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemAnterioresTipoSexo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresTipoSexoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesTipoSexo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesTipoSexoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesToolBarTipoSexo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesTipoSexoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemSiguientesTipoSexo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesTipoSexoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosTipoSexo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosTipoSexoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosToolBarTipoSexo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosTipoSexoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoGuardarCambiosTipoSexo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosTipoSexoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		//SELECCIONAR TODOS
		this.jCheckBoxSeleccionarTodosTipoSexo.addItemListener(new ItemListener() {		
			public void itemStateChanged(ItemEvent evt) {
				try {jCheckBoxSeleccionarTodosTipoSexoItemListener(evt);}catch(Exception e){e.printStackTrace();}
			}
		});

		this.jComboBoxTiposAccionesTipoSexo.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposAccionesTipoSexoActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jComboBoxTiposSeleccionarTipoSexo.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposSeleccionarTipoSexoActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jTextFieldValorCampoGeneralTipoSexo.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jTextFieldValorCampoGeneralTipoSexoActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoSexo.jButtonidTipoSexoBusqueda.addActionListener(new ButtonActionListener(this,"idTipoSexoBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormTipoSexo.jButtonid_empresaTipoSexoUpdate.addActionListener(new ButtonActionListener(this,"id_empresaTipoSexoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoSexo.jButtonid_empresaTipoSexoBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaTipoSexoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoSexo.jButtoncodigoTipoSexoBusqueda.addActionListener(new ButtonActionListener(this,"codigoTipoSexoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoSexo.jButtonnombreTipoSexoBusqueda.addActionListener(new ButtonActionListener(this,"nombreTipoSexoBusqueda"));
		
		
		
		//REPORTE DINAMICO
		this.jButtonCerrarReporteDinamicoTipoSexo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarReporteDinamicoTipoSexoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarReporteDinamicoTipoSexo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarReporteDinamicoTipoSexoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarExcelReporteDinamicoTipoSexo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarExcelReporteDinamicoTipoSexoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		//IMPORTACION
		this.jButtonCerrarImportacionTipoSexo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarImportacionTipoSexoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarImportacionTipoSexo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarImportacionTipoSexoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAbrirImportacionTipoSexo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAbrirImportacionTipoSexoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
	}
	*/
	
	
	public void jComboBoxTiposSeleccionarTipoSexoActionListener(ActionEvent evt) throws Exception {    		
		try {			
			Reporte reporte=(Reporte)this.jComboBoxTiposSeleccionarTipoSexo.getSelectedItem();
			
			//if(reporte.getsCodigo().equals("SELECCIONAR")) {
			//}					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoSexoConstantesFunciones.CLASSNAME);
		}
	}	
	
	
	
	public void seleccionarTodosTipoSexo(Boolean conSeleccionarTodos) throws Exception {    		
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				for(TipoSexo tiposexoAux:this.tiposexoLogic.getTipoSexos()) {
					tiposexoAux.setIsSelected(conSeleccionarTodos);
				}			
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(TipoSexo tiposexoAux:tiposexos) {
					tiposexoAux.setIsSelected(conSeleccionarTodos);
				}
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoSexoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarTodosTipoSexoItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingTipoSexo(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			
			if(sTipoSeleccionar.equals("COLUMNAS")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(TipoSexo tiposexoAux:this.tiposexoLogic.getTipoSexos()) {
						tiposexoAux.setIsSelected(this.isSeleccionarTodos);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(TipoSexo tiposexoAux:tiposexos) {
						tiposexoAux.setIsSelected(this.isSeleccionarTodos);
					}
				}
			} else {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					for(TipoSexo tiposexoAux:this.tiposexoLogic.getTipoSexos()) {
					
					}	
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(TipoSexo tiposexoAux:tiposexos) {
						
					}
				}
			}
					
			if(existe) {
				this.inicializarActualizarBindingTablaTipoSexo(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosTipoSexo.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosTipoSexo.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosTipoSexo,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoSexoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionadosTipoSexoItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingTipoSexo(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			int[] arrNumRowsSeleccionados=null;
			
			arrNumRowsSeleccionados=this.jTableDatosTipoSexo.getSelectedRows();
			
			TipoSexo tiposexoLocal=new TipoSexo();
			
			//this.seleccionarTodosTipoSexo(false);
			
			for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					tiposexoLocal =(TipoSexo) this.tiposexoLogic.getTipoSexos().toArray()[this.jTableDatosTipoSexo.convertRowIndexToModel(iNumRowSeleccionado)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					tiposexoLocal =(TipoSexo) this.tiposexos.toArray()[this.jTableDatosTipoSexo.convertRowIndexToModel(iNumRowSeleccionado)];
				}
				
				tiposexoLocal.setIsSelected(this.isSeleccionados);
			}
			
			/*
			if(sTipoSeleccionar.equals("SELECCIONAR")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(TipoSexo tiposexoAux:this.tiposexoLogic.getTipoSexos()) {
						tiposexoAux.setIsSelected(this.isSeleccionados);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(TipoSexo tiposexoAux:tiposexos) {
						tiposexoAux.setIsSelected(this.isSeleccionados);
					}
				}
			}
			*/
			
			//if(existe) {
				this.inicializarActualizarBindingTablaTipoSexo(false);
			/*
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			*/
			
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosTipoSexo.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosTipoSexo.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosTipoSexo,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoSexoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarActualTipoSexoItemListener(ItemEvent evt,Long idActual) throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoSexoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void ejecutarAuxiliarTipoSexoParaAjaxPostBack() throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoSexoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jTextFieldValorCampoGeneralTipoSexoActionListener(ActionEvent evt) throws Exception {    		
		try {
			this.inicializarActualizarBindingTipoSexo(false,false);
			
			//System.out.println(this.jTextFieldValorCampoGeneralTipoSexo.getText());		
			
			Boolean existe=false;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(TipoSexo tiposexoAux:this.tiposexoLogic.getTipoSexos()) {
				
						if(sTipoSeleccionar.equals(TipoSexoConstantesFunciones.LABEL_CODIGO)) {
							existe=true;
							tiposexoAux.setcodigo(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(TipoSexoConstantesFunciones.LABEL_NOMBRE)) {
							existe=true;
							tiposexoAux.setnombre(this.sValorCampoGeneral);
						}
				}	
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(TipoSexo tiposexoAux:tiposexos) {
					
						if(sTipoSeleccionar.equals(TipoSexoConstantesFunciones.LABEL_CODIGO)) {
							existe=true;
							tiposexoAux.setcodigo(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(TipoSexoConstantesFunciones.LABEL_NOMBRE)) {
							existe=true;
							tiposexoAux.setnombre(this.sValorCampoGeneral);
						}
				}
			}
								
			if(existe) {
				this.inicializarActualizarBindingTablaTipoSexo(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoSexoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jComboBoxTiposAccionesTipoSexoActionListener(ActionEvent evt,Boolean esParaAccionDesdeFormulario) throws Exception {    				
		Boolean conSplash=true;
		
		try {							
		
			this.inicializarActualizarBindingTipoSexo(false,false);
			
			Reporte reporte=new Reporte();
			
			this.esParaAccionDesdeFormularioTipoSexo=esParaAccionDesdeFormulario;
			
			if(!esParaAccionDesdeFormulario) {
				
				reporte=(Reporte)this.jComboBoxTiposAccionesTipoSexo.getSelectedItem();
				
			} else {
				reporte=(Reporte)this.jInternalFrameDetalleFormTipoSexo.jComboBoxTiposAccionesFormularioTipoSexo.getSelectedItem();
			}
			String sTipoAccionLocal=this.sTipoAccion;
			
			if(!esParaAccionDesdeFormulario) {
				sTipoAccionLocal=this.sTipoAccion;
			} else {
				sTipoAccionLocal=this.sTipoAccionFormulario;
			}
			
			if(sTipoAccionLocal.equals("GENERAR REPORTE")) {//reporte.getsCodigo().equals("GENERAR REPORTE")) {
				if(this.isPermisoReporteTipoSexo) {				
					conSplash=true;//false;										
					
					//this.startProcessTipoSexo(conSplash);
				
					this.generarReporteTipoSexosSeleccionados();
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesTipoSexo.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormTipoSexo.jComboBoxTiposAccionesFormularioTipoSexo.setSelectedIndex(0);					
				}
			} else if(sTipoAccionLocal.equals("GENERAR REPORTE DINAMICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.mostrarReporteDinamicoTipoSexosSeleccionados();
				//this.jComboBoxTiposAccionesTipoSexo.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("GENERAR_REPORTE_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoTipoSexosSeleccionados(false);
				//this.jComboBoxTiposAccionesTipoSexo.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("GENERAR_REPORTE_TOTALES_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoTipoSexosSeleccionados(true);
				//this.jComboBoxTiposAccionesTipoSexo.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessTipoSexo();
				
				this.exportarTipoSexosSeleccionados();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesTipoSexo.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormTipoSexo.jComboBoxTiposAccionesFormularioTipoSexo.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("IMPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				this.mostrarImportacionTipoSexos();
				//this.importarTipoSexos();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesTipoSexo.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormTipoSexo.jComboBoxTiposAccionesFormularioTipoSexo.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS_EXCEL")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessTipoSexo();
				//SE EXPORTA SEGUN TIPO ARCHIVO SELECCIONADO
				//this.exportarExcelTipoSexosSeleccionados();
				//this.jComboBoxTiposAccionesTipoSexo.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("RECARGAR_FK")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {								
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE RECARGAR REFERENCIAS ?", "MANTENIMIENTO DE Tipo Sexo", JOptionPane.OK_CANCEL_OPTION) == 0) {
				
				//this.startProcessTipoSexo();
				
					if(!esParaAccionDesdeFormulario || (esParaAccionDesdeFormulario && this.isEsNuevoTipoSexo)) {
						this.esRecargarFks=true;
						this.cargarCombosForeignKeyTipoSexo(false,false,false);
						this.esRecargarFks=false;
						
						JOptionPane.showMessageDialog(this,"PROCESO EJECUTADO CORRECTAMENTE","MANTENIMIENTO DE Tipo Sexo",JOptionPane.INFORMATION_MESSAGE);
					} else {
						JOptionPane.showMessageDialog(this,"ESTE PROCESO SOLO FUNCIONA AL INGRESAR UN NUEVO ELEMENTO","MANTENIMIENTO",JOptionPane.ERROR_MESSAGE);	
					}
					
					
				}
				
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesTipoSexo.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormTipoSexo.jComboBoxTiposAccionesFormularioTipoSexo.setSelectedIndex(0);					
				}	
			} 			
			else if(TipoSexoBeanSwingJInternalFrame.EsProcesoReporte(reporte.getsCodigo())){
				if(this.isPermisoReporteTipoSexo) {				
					if(this.tieneElementosSeleccionados()) {
						this.quitarFilaTotales();
						
						conSplash=false;
						
						//this.startProcessTipoSexo(conSplash);
					
						//this.actualizarParametrosGeneralTipoSexo();
						
						this.generarReporteProcesoAccionTipoSexosSeleccionados(reporte.getsCodigo());
						
						if(!esParaAccionDesdeFormulario) {
							
							this.jComboBoxTiposAccionesTipoSexo.setSelectedIndex(0);					
							
						} else {
							this.jInternalFrameDetalleFormTipoSexo.jComboBoxTiposAccionesFormularioTipoSexo.setSelectedIndex(0);					
						}
					} else {
						JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
			} 
			else if(TipoSexoBeanSwingJInternalFrameAdditional.EsProcesoAccionNormal(reporte.getsCodigo())){
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR "+reporte.getsDescripcion()+" EN PROCESO Tipo SexoS SELECCIONADOS?", "MANTENIMIENTO DE Tipo Sexo", JOptionPane.OK_CANCEL_OPTION) == 0) {
						//this.startProcessTipoSexo();
				
						this.actualizarParametrosGeneralTipoSexo();
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {						
							this.tiposexoReturnGeneral=tiposexoLogic.procesarAccionTipoSexosWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,sTipoAccionLocal,this.tiposexoLogic.getTipoSexos(),this.tiposexoParameterGeneral);
						
						} else if(Constantes.ISUSAEJBREMOTE) {
						
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
						this.procesarTipoSexoReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesTipoSexo.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormTipoSexo.jComboBoxTiposAccionesFormularioTipoSexo.setSelectedIndex(0);					
					}
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}				
			} 
			else {
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					this.actualizarParametrosGeneralTipoSexo();
					
					TipoSexoBeanSwingJInternalFrameAdditional.ProcesarAccion(reporte.getsCodigo(),reporte.getsDescripcion(),this);
					
					this.procesarTipoSexoReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesTipoSexo.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormTipoSexo.jComboBoxTiposAccionesFormularioTipoSexo.setSelectedIndex(0);					
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}
			}
		} catch(Exception e) {
			this.esRecargarFks=false;
			
			FuncionesSwing.manageException(this, e,logger,TipoSexoConstantesFunciones.CLASSNAME);
		
		}  finally {
      		//this.finishProcessTipoSexo(conSplash);
      	}
	}
	
	public void jComboBoxTiposRelacionesTipoSexoActionListener(ActionEvent evt) throws Exception {    				
		Boolean conSplash=true;
		
		try {			
			this.startProcessTipoSexo();
			
			if(this.jInternalFrameDetalleFormTipoSexo==null) { //if(!this.conCargarFormDetalle) {			
				this.inicializarFormDetalle();
			}
			
			ArrayList<TipoSexo> tiposexosSeleccionados=new ArrayList<TipoSexo>();		
			TipoSexo tiposexo=new TipoSexo();
			
			int rowIndex=-1;//CON ESTO SE DESHABILITA SELECCION POR INDICE
			
			this.inicializarActualizarBindingTipoSexo(false,false);
			
			Reporte reporte=new Reporte();
			
			
			reporte=(Reporte)this.jComboBoxTiposRelacionesTipoSexo.getSelectedItem();
			
			
			
			
			tiposexosSeleccionados=this.getTipoSexosSeleccionados(true);
			//this.sTipoAccion;
			
			if(tiposexosSeleccionados.size()==1) {
				for(TipoSexo tiposexoAux:tiposexosSeleccionados) {
					tiposexo=tiposexoAux;
				}
				
				if(this.sTipoAccion.equals("NONE")) {
				
				}
				
			} else {
				JOptionPane.showMessageDialog(this,"SELECCIONE SOLO UN REGISTRO","RELACIONES",JOptionPane.ERROR_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoSexoConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.finishProcessTipoSexo();
			
      		//this.finishProcessTipoSexo(conSplash);
      	}
	}
			
	public static Boolean EsProcesoReporte(String sTipoProceso) throws Exception {
		Boolean esProcesoAccionRepoorte=false;

		if(sTipoProceso.contains("REPORTE_")) {
			 esProcesoAccionRepoorte=true;
		}

		return esProcesoAccionRepoorte;
	}
	
	public void procesarTipoSexoReturnGeneral() throws Exception {
		if(this.tiposexoReturnGeneral.getConRetornoEstaProcesado()) {
			JOptionPane.showMessageDialog(this,this.tiposexoReturnGeneral.getsMensajeProceso(),"PROCESO",JOptionPane.INFORMATION_MESSAGE);
		}
		
		if(this.tiposexoReturnGeneral.getConMostrarMensaje()) {
			JOptionPane.showMessageDialog(this,this.tiposexoReturnGeneral.getsMensajeProceso(),"PROCESO",FuncionesSwing.getColorSelectedBackground(this.tiposexoReturnGeneral.getsTipoMensaje()));
		}
		
		if(this.tiposexoReturnGeneral.getConRecargarInformacion()) {
			this.procesarBusqueda(this.sAccionBusqueda);
			
			this.inicializarActualizarBindingTipoSexo(false);
		}
		
		if(this.tiposexoReturnGeneral.getConRetornoLista() || this.tiposexoReturnGeneral.getConRetornoObjeto()) {
			if(this.tiposexoReturnGeneral.getConRetornoLista()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.tiposexoLogic.setTipoSexos(this.tiposexoReturnGeneral.getTipoSexos());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			if(this.tiposexoReturnGeneral.getConRetornoObjeto()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.tiposexoLogic.setTipoSexo(this.tiposexoReturnGeneral.getTipoSexo());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			this.inicializarActualizarBindingTipoSexo(false);
		}
	}
	
	public void actualizarParametrosGeneralTipoSexo() throws Exception {
		
		
	}
	
	public ArrayList<TipoSexo> getTipoSexosSeleccionados(Boolean conSeleccionarTodosAutomatico) throws Exception {
		ArrayList<TipoSexo> tiposexosSeleccionados=new ArrayList<TipoSexo>();
		Boolean existe=false;
		
		if(!this.esParaAccionDesdeFormularioTipoSexo) {
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				
				for(TipoSexo tiposexoAux:tiposexoLogic.getTipoSexos()) {
					if(tiposexoAux.getIsSelected()) {
						tiposexosSeleccionados.add(tiposexoAux);				
					}
				}
				
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(TipoSexo tiposexoAux:this.tiposexos) {
					if(tiposexoAux.getIsSelected()) {
						tiposexosSeleccionados.add(tiposexoAux);				
					}
				}
			}
			
			if(tiposexosSeleccionados.size()>0) {
				existe=true;
			}
			
			//SI NO ESTA NINGUNO SELECCIONADO SE SELECCIONA TODOS
			if(!existe) {
				if(conSeleccionarTodosAutomatico) {
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						tiposexosSeleccionados.addAll(this.tiposexoLogic.getTipoSexos());
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						tiposexosSeleccionados.addAll(this.tiposexos);				
					}
				}
			}
		} else {
			tiposexosSeleccionados.add(this.tiposexo);
		}
		
		return tiposexosSeleccionados;
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
	
	public void generarReporteTipoSexosSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoReporte.equals("NORMAL") || this.sTipoReporte.equals("FORMULARIO")) {
			existe=true;								
			this.generarReporteNormalTipoSexosSeleccionados();
			
		} else if(this.sTipoReporte.equals("DINAMICO")) {
			existe=true;
			this.mostrarReporteDinamicoTipoSexosSeleccionados();
			
		} else if(this.sTipoReporte.equals("GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoTipoSexosSeleccionados(false);
			
		} else if(this.sTipoReporte.equals("TOTALES_GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoTipoSexosSeleccionados(true);
		}
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE REPORTE VALIDO","REPORTE DE Tipo Sexo",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void generarReporteRelacionesTipoSexosSeleccionados() throws Exception {
		ArrayList<TipoSexo> tiposexosSeleccionados=new ArrayList<TipoSexo>();		
		
		tiposexosSeleccionados=this.getTipoSexosSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
					
		//this.sTipoReporteExtra="MasterRelaciones";
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		
		this.generarReporteTipoSexos("Todos",tiposexosSeleccionados);
		
	}	
	
	public void generarReporteNormalTipoSexosSeleccionados() throws Exception {
		ArrayList<TipoSexo> tiposexosSeleccionados=new ArrayList<TipoSexo>();		
		
		tiposexosSeleccionados=this.getTipoSexosSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
								
		if(this.sTipoReporte.equals("FORMULARIO")) {
			this.sTipoReporteExtra="Vertical";					
		}
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.generarReporteTipoSexos("Todos",tiposexosSeleccionados);
	}		
	
	public void generarReporteProcesoAccionTipoSexosSeleccionados(String sProcesoReporte) throws Exception {
		ArrayList<TipoSexo> tiposexosSeleccionados=new ArrayList<TipoSexo>();
		
		tiposexosSeleccionados=this.getTipoSexosSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(false,false,true,"");
		
		/*
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.sTipoReporteExtra=sProcesoReporte.toLowerCase();
		
		this.esReporteAccionProceso=true;
		this.generarReporteTipoSexos("Todos",tiposexosSeleccionados);
		this.esReporteAccionProceso=false;
	}
	
	
	public void mostrarReporteDinamicoTipoSexosSeleccionados() throws Exception {
		ArrayList<TipoSexo> tiposexosSeleccionados=new ArrayList<TipoSexo>();		
		
		
		this.abrirInicializarFrameReporteDinamicoTipoSexo();
		
		
		tiposexosSeleccionados=this.getTipoSexosSeleccionados(true);
		
		this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirFrameReporteDinamicoTipoSexo();
		
		
		//this.generarReporteTipoSexos("Todos",tiposexosSeleccionados ,tiposexoImplementable,tiposexoImplementableHome);
	}
	
	public void mostrarImportacionTipoSexos() throws Exception {
		//this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirInicializarFrameImportacionTipoSexo();
		
		this.abrirFrameImportacionTipoSexo();		
		
			
		//this.generarReporteTipoSexos("Todos",tiposexosSeleccionados ,tiposexoImplementable,tiposexoImplementableHome);
	}
	
	public void importarTipoSexos() throws Exception {		
	
	}
	
	public void exportarTipoSexosSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoArchivoReporte.equals("EXCEL")) {
			existe=true;
			this.exportarExcelTipoSexosSeleccionados();
			
		} else if(this.sTipoArchivoReporte.equals("TEXTO")) {
			existe=true;
			this.exportarTextoTipoSexosSeleccionados();
		
		} else if(this.sTipoArchivoReporte.equals("XML")) {
			existe=true;
			this.exportarXmlTipoSexosSeleccionados();
		} 
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE ARCHIVO VALIDO","EXPORTACION DE Tipo Sexo",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void exportarTextoTipoSexosSeleccionados() throws Exception {
		ArrayList<TipoSexo> tiposexosSeleccionados=new ArrayList<TipoSexo>();		
		
		tiposexosSeleccionados=this.getTipoSexosSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tiposexo."+"txt";//Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario);
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		BufferedWriter bufferedWriter = null;
		FileWriter fileWriter=null;
		
		fileWriter=new FileWriter(sPath);
		
		bufferedWriter = new BufferedWriter(fileWriter);
		
		try {
			if(conCabecera) {
				sFilaCabecera=this.getFilaCabeceraExportarTipoSexo(sDelimiter);
				
				bufferedWriter.write(sFilaCabecera);
			}				
			
			for(TipoSexo tiposexoAux:tiposexosSeleccionados) {
				sFilaDatos=this.getFilaDatosExportarTipoSexo(tiposexoAux,sDelimiter);
				
				bufferedWriter.write(sFilaDatos);
				
				//tiposexoAux.setsDetalleGeneralEntityReporte(tiposexoAux.toString());			
			}
			
			bufferedWriter.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tiposexoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Sexo",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {
       		if (bufferedWriter != null) {
				bufferedWriter.close();
			}
		}
	}
	
	public String getFilaCabeceraExportarTipoSexo(String sDelimiter) {
		String sFilaCabecera="";
		
		
		sFilaCabecera+=TipoSexoConstantesFunciones.LABEL_ID;

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaCabecera+=sDelimiter;
		sFilaCabecera+=TipoSexoConstantesFunciones.LABEL_VERSIONROW;
		}

		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=TipoSexoConstantesFunciones.LABEL_IDEMPRESA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=TipoSexoConstantesFunciones.LABEL_CODIGO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=TipoSexoConstantesFunciones.LABEL_NOMBRE;
		
		return sFilaCabecera;
	}
	
	public String getFilaDatosExportarTipoSexo(TipoSexo tiposexo,String sDelimiter) {
		String sFilaDatos="";
		
		sFilaDatos+="\r\n";
		
		
		sFilaDatos+=tiposexo.getId().toString();

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaDatos+=sDelimiter;
		sFilaDatos+=tiposexo.getVersionRow().toString();
		}

		sFilaDatos+=sDelimiter;
		sFilaDatos+=tiposexo.getempresa_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=tiposexo.getcodigo();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=tiposexo.getnombre();
		
		return sFilaDatos;
	}
	
	//@SuppressWarnings("deprecation")
	public void exportarExcelTipoSexosSeleccionados() throws Exception {
		ArrayList<TipoSexo> tiposexosSeleccionados=new ArrayList<TipoSexo>();		
		
		tiposexosSeleccionados=this.getTipoSexosSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tiposexo.xls";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		FileOutputStream fileOutputStream=null;
		
		try {
			HSSFWorkbook workbook = new HSSFWorkbook();
			HSSFSheet sheet = workbook.createSheet("TipoSexos");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			HSSFRow row = sheet.createRow(iRow);
			HSSFCell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");

			if(conCabecera) {
				this.getFilaCabeceraExportarExcelTipoSexo(row);				
				iRow++;
			}				
			
			for(TipoSexo tiposexoAux:tiposexosSeleccionados) {
				row = sheet.createRow(iRow);
				
				this.getFilaDatosExportarExcelTipoSexo(tiposexoAux,row);
				
				iRow++;
			}
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tiposexoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Sexo",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			
       		if (fileOutputStream != null) {
				fileOutputStream.close();
			}			
		}
	}		
	
	public void exportarXmlTipoSexosSeleccionados() throws Exception {
		ArrayList<TipoSexo> tiposexosSeleccionados=new ArrayList<TipoSexo>();		
		
		tiposexosSeleccionados=this.getTipoSexosSeleccionados(true);
		
		//String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		//Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		//String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tiposexo.xml";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		DocumentBuilderFactory documentBuilderFactory=null;
		DocumentBuilder documentBuilder =null;
		
		try {
			documentBuilderFactory = DocumentBuilderFactory.newInstance();
			documentBuilder = documentBuilderFactory.newDocumentBuilder();
	
			Document document = documentBuilder.newDocument();
			Element elementRoot = document.createElement("tiposexos");
			
			document.appendChild(elementRoot);
		    			
												
			Element element = null;//document.createElement("tiposexo");
			//elementRoot.appendChild(element);
		
			for(TipoSexo tiposexoAux:tiposexosSeleccionados) {
				element = document.createElement("tiposexo");
				elementRoot.appendChild(element);
			
				this.setFilaDatosExportarXmlTipoSexo(tiposexoAux,document,element);
			}
			
			TransformerFactory transformerFactory = TransformerFactory.newInstance();
			Transformer transformer = transformerFactory.newTransformer();
			DOMSource domSource = new DOMSource(document);
			
			StreamResult streamResult = new StreamResult(new File(sPath));
	
			transformer.transform(domSource, streamResult);
						
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tiposexoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Sexo",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			       				
		}
	}	
	
	//@SuppressWarnings("deprecation")
	public void getFilaCabeceraExportarExcelTipoSexo(HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(TipoSexoConstantesFunciones.LABEL_ID);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
		cell = row.createCell(iColumn++);cell.setCellValue(TipoSexoConstantesFunciones.LABEL_VERSIONROW);
		}

		cell = row.createCell(iColumn++);cell.setCellValue(TipoSexoConstantesFunciones.LABEL_IDEMPRESA);
		cell = row.createCell(iColumn++);cell.setCellValue(TipoSexoConstantesFunciones.LABEL_CODIGO);
		cell = row.createCell(iColumn++);cell.setCellValue(TipoSexoConstantesFunciones.LABEL_NOMBRE);
	}
	
	//@SuppressWarnings("deprecation")
	public void getFilaDatosExportarExcelTipoSexo(TipoSexo tiposexo,HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(tiposexo.getId());
		cell = row.createCell(iColumn++);cell.setCellValue(tiposexo.getempresa_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(tiposexo.getcodigo());
		cell = row.createCell(iColumn++);cell.setCellValue(tiposexo.getnombre());				
	}
	
	public void setFilaDatosExportarXmlTipoSexo(TipoSexo tiposexo,Document document,Element element) {
		/*
		Element lastname = document.createElement("lastname");
		lastname.appendChild(document.createTextNode("mook kim"));
		element.appendChild(lastname);
		*/
		

		Element elementId = document.createElement(TipoSexoConstantesFunciones.ID);
		elementId.appendChild(document.createTextNode(tiposexo.getId().toString().trim()));
		element.appendChild(elementId);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){

		Element elementVersionRow = document.createElement(TipoSexoConstantesFunciones.VERSIONROW);
		elementVersionRow.appendChild(document.createTextNode(tiposexo.getVersionRow().toString().trim()));
		element.appendChild(elementVersionRow);
		}


		Element elementempresa_descripcion = document.createElement(TipoSexoConstantesFunciones.IDEMPRESA);
		elementempresa_descripcion.appendChild(document.createTextNode(tiposexo.getempresa_descripcion()));
		element.appendChild(elementempresa_descripcion);

		Element elementcodigo = document.createElement(TipoSexoConstantesFunciones.CODIGO);
		elementcodigo.appendChild(document.createTextNode(tiposexo.getcodigo().trim()));
		element.appendChild(elementcodigo);

		Element elementnombre = document.createElement(TipoSexoConstantesFunciones.NOMBRE);
		elementnombre.appendChild(document.createTextNode(tiposexo.getnombre().trim()));
		element.appendChild(elementnombre);
	}
	
	public void generarReporteGroupGenericoTipoSexosSeleccionados(Boolean soloTotales) throws Exception {
		ArrayList<TipoSexo> tiposexosSeleccionados=new ArrayList<TipoSexo>();
		
		tiposexosSeleccionados=this.getTipoSexosSeleccionados(true);
		
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
		
		this.setColumnaDescripcionReporteGroupGenericoTipoSexo(tiposexosSeleccionados);
		
		this.generarReporteTipoSexos("Todos",tiposexosSeleccionados);
	}
	
	public void setColumnaDescripcionReporteGroupGenericoTipoSexo(ArrayList<TipoSexo> tiposexosSeleccionados) throws Exception {    		
		try {
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			
			Boolean existe=false;
			
			for(TipoSexo tiposexoAux:tiposexosSeleccionados) {
				tiposexoAux.setsDetalleGeneralEntityReporte(tiposexoAux.toString());
			
				if(sTipoSeleccionar.equals(TipoSexoConstantesFunciones.LABEL_IDEMPRESA)) {
					existe=true;
					tiposexoAux.setsDescripcionGeneralEntityReporte1(tiposexoAux.getempresa_descripcion());
				}
				 else if(sTipoSeleccionar.equals(TipoSexoConstantesFunciones.LABEL_CODIGO)) {
					existe=true;
					tiposexoAux.setsDescripcionGeneralEntityReporte1(tiposexoAux.getcodigo());
				}
				 else if(sTipoSeleccionar.equals(TipoSexoConstantesFunciones.LABEL_NOMBRE)) {
					existe=true;
					tiposexoAux.setsDescripcionGeneralEntityReporte1(tiposexoAux.getnombre());
				}
			}	
											
			if(!existe) {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}										
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoSexoConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void actualizarEstadoCeldasBotonesTipoSexo(String sAccion,Boolean isGuardarCambiosEnLote,Boolean isEsMantenimientoRelacionado) throws Exception {
		if(sAccion=="n") {
			if(!this.esParaBusquedaForeignKey) {
				this.isVisibilidadCeldaNuevoTipoSexo=true;
				this.isVisibilidadCeldaNuevoRelacionesTipoSexo=true;
				this.isVisibilidadCeldaGuardarCambiosTipoSexo=true;
			}
			
			this.isVisibilidadCeldaModificarTipoSexo=false;
			this.isVisibilidadCeldaActualizarTipoSexo=false;
			this.isVisibilidadCeldaEliminarTipoSexo=false;
			this.isVisibilidadCeldaCancelarTipoSexo=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoSexo=true;
				} else {
					this.isVisibilidadCeldaGuardarTipoSexo=false;
				}
			}
		} else if(sAccion=="a") {
			this.isVisibilidadCeldaNuevoTipoSexo=false;
			this.isVisibilidadCeldaNuevoRelacionesTipoSexo=false;
			this.isVisibilidadCeldaGuardarCambiosTipoSexo=false;
			this.isVisibilidadCeldaModificarTipoSexo=false;
			this.isVisibilidadCeldaActualizarTipoSexo=true;
			this.isVisibilidadCeldaEliminarTipoSexo=false;
			this.isVisibilidadCeldaCancelarTipoSexo=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoSexo=true;
				} else {
					this.isVisibilidadCeldaGuardarTipoSexo=false;
				}
			}
		} else if(sAccion=="ae") {
			this.isVisibilidadCeldaNuevoTipoSexo=false;
			this.isVisibilidadCeldaNuevoRelacionesTipoSexo=false;
			this.isVisibilidadCeldaGuardarCambiosTipoSexo=false;
			this.isVisibilidadCeldaModificarTipoSexo=false;
			this.isVisibilidadCeldaActualizarTipoSexo=true;
			this.isVisibilidadCeldaEliminarTipoSexo=true;
			this.isVisibilidadCeldaCancelarTipoSexo=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoSexo=true;
				} else {
					this.isVisibilidadCeldaGuardarTipoSexo=false;
				}
			}
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {
			this.isVisibilidadCeldaNuevoTipoSexo=false;
			this.isVisibilidadCeldaNuevoRelacionesTipoSexo=false;
			this.isVisibilidadCeldaGuardarCambiosTipoSexo=false;
			this.isVisibilidadCeldaModificarTipoSexo=false;
			this.isVisibilidadCeldaActualizarTipoSexo=true;
			this.isVisibilidadCeldaEliminarTipoSexo=false;
			this.isVisibilidadCeldaCancelarTipoSexo=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoSexo=false;
				} else {
					this.isVisibilidadCeldaGuardarTipoSexo=false;
				}
			}
		} else if(sAccion=="c") {
			this.isVisibilidadCeldaNuevoTipoSexo=true;
			this.isVisibilidadCeldaNuevoRelacionesTipoSexo=true;
			this.isVisibilidadCeldaGuardarCambiosTipoSexo=true;
			this.isVisibilidadCeldaModificarTipoSexo=false;
			this.isVisibilidadCeldaActualizarTipoSexo=false;
			this.isVisibilidadCeldaEliminarTipoSexo=false;
			this.isVisibilidadCeldaCancelarTipoSexo=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoSexo=true;
				} else {
					this.isVisibilidadCeldaGuardarTipoSexo=false;
				}
			}
		} else if(sAccion=="t") {
			this.isVisibilidadCeldaNuevoTipoSexo=false;
			this.isVisibilidadCeldaNuevoRelacionesTipoSexo=false;
			this.isVisibilidadCeldaGuardarCambiosTipoSexo=false;
			this.isVisibilidadCeldaActualizarTipoSexo=false;
			this.isVisibilidadCeldaEliminarTipoSexo=false;
			this.isVisibilidadCeldaCancelarTipoSexo=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoSexo=false;
				} else {
					this.isVisibilidadCeldaGuardarTipoSexo=false;
				}
			}
		}  else if(sAccion=="s"||sAccion=="s2") {
			this.isVisibilidadCeldaNuevoTipoSexo=false;
			this.isVisibilidadCeldaNuevoRelacionesTipoSexo=false;
			this.isVisibilidadCeldaGuardarCambiosTipoSexo=false;
			this.isVisibilidadCeldaModificarTipoSexo=true;
			this.isVisibilidadCeldaActualizarTipoSexo=false;
			this.isVisibilidadCeldaEliminarTipoSexo=false;
			this.isVisibilidadCeldaCancelarTipoSexo=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoSexo=false;
				} else {
					this.isVisibilidadCeldaGuardarTipoSexo=false;
				}
			}
		}
		
		//ACTUALIZA VISIBILIDAD PANELES
		if(TipoSexoJInternalFrame.CON_DATOS_FRAME && !this.esParaBusquedaForeignKey) {
			//SIEMPRE VISIBLE
			this.isVisibilidadCeldaNuevoTipoSexo=true;
			this.isVisibilidadCeldaNuevoRelacionesTipoSexo=true;
			this.isVisibilidadCeldaGuardarCambiosTipoSexo=true;
		} else {
			this.actualizarEstadoPanelsTipoSexo(sAccion);						
		}
		
		if(this.esParaBusquedaForeignKey) {
			this.isVisibilidadCeldaCopiarTipoSexo=false;
			//this.isVisibilidadCeldaVerFormTipoSexo=false;
			this.isVisibilidadCeldaDuplicarTipoSexo=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONES
		if(!tiposexoSessionBean.getConGuardarRelaciones()) {
			this.isVisibilidadCeldaNuevoRelacionesTipoSexo=false;
		} else {
			this.isVisibilidadCeldaNuevoTipoSexo=false;
			this.isVisibilidadCeldaGuardarCambiosTipoSexo=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONADO
		if(tiposexoSessionBean.getEsGuardarRelacionado()) {
			if(!tiposexoSessionBean.getConGuardarRelaciones()) {	
				this.isVisibilidadCeldaNuevoRelacionesTipoSexo=false;												
			}
			
			this.jButtonCerrarTipoSexo.setVisible(false);
		}
		
		//SI NO TIENE MAXIMO DE RELACIONES PERMITIDAS
		if(!this.conMaximoRelaciones) {
			this.isVisibilidadCeldaNuevoRelacionesTipoSexo=false;
		}
		
		if(!this.permiteMantenimiento(this.tiposexo)) {
			this.isVisibilidadCeldaActualizarTipoSexo=false;
			this.isVisibilidadCeldaEliminarTipoSexo=false;
		}
		
		
		
	}
	
	public void actualizarEstadoCeldasBotonesConGuardarRelacionesTipoSexo() {
	}
	
	public void actualizarEstadoPanelsTipoSexo(String sAccion) {
		if(sAccion=="n") {
			if(this.jScrollPanelDatosEdicionTipoSexo!=null) {
				this.jScrollPanelDatosEdicionTipoSexo.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasTipoSexo!=null) {
				this.jTabbedPaneBusquedasTipoSexo.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosTipoSexo!=null) {
				this.jScrollPanelDatosTipoSexo.setVisible(true);
			}
			
			if(this.jPanelPaginacionTipoSexo!=null) {
				this.jPanelPaginacionTipoSexo.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesTipoSexo!=null) {
				this.jPanelParametrosReportesTipoSexo.setVisible(true);		    
			}
			
		} else if(sAccion=="a") {				
			if(this.jScrollPanelDatosEdicionTipoSexo!=null) {
				this.jScrollPanelDatosEdicionTipoSexo.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasTipoSexo!=null) {
				this.jTabbedPaneBusquedasTipoSexo.setVisible(false);			
			}
			
			
			
			if(this.jScrollPanelDatosTipoSexo!=null) {
				this.jScrollPanelDatosTipoSexo.setVisible(false);
			}
			
			if(this.jPanelPaginacionTipoSexo!=null) {
				this.jPanelPaginacionTipoSexo.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesTipoSexo!=null) {
				this.jPanelParametrosReportesTipoSexo.setVisible(false);
			}
						
		} else if(sAccion=="ae") {		
			if(this.jScrollPanelDatosEdicionTipoSexo!=null) {
				this.jScrollPanelDatosEdicionTipoSexo.setVisible(true);		
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasTipoSexo!=null) {
				this.jTabbedPaneBusquedasTipoSexo.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosTipoSexo!=null) {
				this.jScrollPanelDatosTipoSexo.setVisible(false);
			}
			
			if(this.jPanelPaginacionTipoSexo!=null) {
				this.jPanelPaginacionTipoSexo.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesTipoSexo!=null) {
				this.jPanelParametrosReportesTipoSexo.setVisible(false);
			}
						
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {	
			if(this.jScrollPanelDatosEdicionTipoSexo!=null) {
				this.jScrollPanelDatosEdicionTipoSexo.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasTipoSexo!=null) {
				this.jTabbedPaneBusquedasTipoSexo.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosTipoSexo!=null) {
				this.jScrollPanelDatosTipoSexo.setVisible(false);
			}
			
			if(this.jPanelPaginacionTipoSexo!=null) {
				this.jPanelPaginacionTipoSexo.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesTipoSexo!=null) {
				this.jPanelParametrosReportesTipoSexo.setVisible(false);
			}
						
		} else if(sAccion=="c") {	
			if(this.jScrollPanelDatosEdicionTipoSexo!=null) {
				this.jScrollPanelDatosEdicionTipoSexo.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasTipoSexo!=null) {
				this.jTabbedPaneBusquedasTipoSexo.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosTipoSexo!=null) {
				this.jScrollPanelDatosTipoSexo.setVisible(true);
			}
			
			if(this.jPanelPaginacionTipoSexo!=null) {
				this.jPanelPaginacionTipoSexo.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesTipoSexo!=null) {
				this.jPanelParametrosReportesTipoSexo.setVisible(true);
			}
						
		} else if(sAccion=="t") {
			
			if(this.jScrollPanelDatosEdicionTipoSexo!=null) {
				this.jScrollPanelDatosEdicionTipoSexo.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasTipoSexo!=null) {
				this.jTabbedPaneBusquedasTipoSexo.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosTipoSexo!=null) {
				this.jScrollPanelDatosTipoSexo.setVisible(true);
			}
			
			if(this.jPanelPaginacionTipoSexo!=null) {
				this.jPanelPaginacionTipoSexo.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesTipoSexo!=null) {
				this.jPanelParametrosReportesTipoSexo.setVisible(true);
			}
						
		}  else if(sAccion=="s"||sAccion=="s2") {
			if(this.jScrollPanelDatosEdicionTipoSexo!=null) {
				this.jScrollPanelDatosEdicionTipoSexo.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasTipoSexo!=null) {
				this.jTabbedPaneBusquedasTipoSexo.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosTipoSexo!=null) {
				this.jScrollPanelDatosTipoSexo.setVisible(true);
			}
			
			if(this.jPanelPaginacionTipoSexo!=null) {
				this.jPanelPaginacionTipoSexo.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesTipoSexo!=null) {
				this.jPanelParametrosReportesTipoSexo.setVisible(true);
			}
			
		} 
		
		if(sAccion.equals("relacionado") || this.tiposexoSessionBean.getEsGuardarRelacionado()) {
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				if(this.jTabbedPaneBusquedasTipoSexo!=null) {
					this.jTabbedPaneBusquedasTipoSexo.setVisible(false);				
				}
				
			}
			
			if(this.jPanelParametrosReportesTipoSexo!=null) {
				this.jPanelParametrosReportesTipoSexo.setVisible(false);
			}
		
		} else if(sAccion.equals("no_relacionado") && !this.tiposexoSessionBean.getEsGuardarRelacionado()) {
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasTipoSexo!=null) {
				this.jTabbedPaneBusquedasTipoSexo.setVisible(true);			
			}
			
			if(this.jPanelParametrosReportesTipoSexo!=null) {
				this.jPanelParametrosReportesTipoSexo.setVisible(true);
			}
		}
	}	
	
	

	public void setVisibilidadBusquedasParaEmpresa(Boolean isParaEmpresa){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaEmpresaNegation=!isParaEmpresa;
		}
		
	}
	
	
	
	
	
	
	public void guardarDatosBusquedaSession() throws Exception {
		
		//TipoSexoSessionBean tiposexoSessionBean=new TipoSexoSessionBean();
		
		if(this.tiposexoSessionBean==null) {
			this.tiposexoSessionBean=new TipoSexoSessionBean();
		}
		
		this.tiposexoSessionBean.setsUltimaBusquedaTipoSexo(this.getsAccionBusqueda());
		this.tiposexoSessionBean.setiNumeroPaginacion(this.getiNumeroPaginacion());
		this.tiposexoSessionBean.setiNumeroPaginacionPagina(this.getiNumeroPaginacionPagina());
		
		if(this.getsAccionBusqueda().equals("Todos")) {
			;
		}
		

		else if(this.getsAccionBusqueda().equals("FK_IdEmpresa")) {
			tiposexoSessionBean.setid_empresa(this.getid_empresaFK_IdEmpresa());	
		}
		
	}
	
	public void traerDatosBusquedaDesdeSession() throws Exception {
		//TipoSexoSessionBean tiposexoSessionBean=new TipoSexoSessionBean();
		
		if(this.tiposexoSessionBean==null) {
			this.tiposexoSessionBean=new TipoSexoSessionBean();
		}
		
		if(this.tiposexoSessionBean.getsUltimaBusquedaTipoSexo()!=null&&!this.tiposexoSessionBean.getsUltimaBusquedaTipoSexo().equals("")) {
			this.setsAccionBusqueda(tiposexoSessionBean.getsUltimaBusquedaTipoSexo());
			this.setiNumeroPaginacion(tiposexoSessionBean.getiNumeroPaginacion());
			this.setiNumeroPaginacionPagina(tiposexoSessionBean.getiNumeroPaginacionPagina());		
				
			if(this.getsAccionBusqueda().equals("Todos")) {
				;
			}
			

			 else if(this.getsAccionBusqueda().equals("FK_IdEmpresa")) {
				this.setid_empresaFK_IdEmpresa(tiposexoSessionBean.getid_empresa());
				tiposexoSessionBean.setid_empresa(-1L);
			}
		}
		
		this.tiposexoSessionBean.setsUltimaBusquedaTipoSexo("");
		this.tiposexoSessionBean.setiNumeroPaginacion(TipoSexoConstantesFunciones.INUMEROPAGINACION);
		this.tiposexoSessionBean.setiNumeroPaginacionPagina(0);
		
	}
	
	public void procesoActualizarFilaTotales(Boolean esCampoValor,String sTipo) {
		try {
			this.actualizarFilaTotales();
				
			this.traerValoresTablaTotales();
			
			this.inicializarActualizarBindingTablaTipoSexo(false);
			
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	public void updateBusquedasFormularioTipoSexo() {
		this.updateBorderResaltarBusquedasFormularioTipoSexo();
		this.updateVisibilidadBusquedasFormularioTipoSexo();
		this.updateHabilitarBusquedasFormularioTipoSexo();
	}
	
	public void updateBorderResaltarBusquedasFormularioTipoSexo() {					
	//BYDAN_BUSQUEDAS
		
	int index=0;
		
	if(this.jTabbedPaneBusquedasTipoSexo.getComponents().length>0) {
	
	}	
	
	}
	
	public void updateVisibilidadBusquedasFormularioTipoSexo() {
	//BYDAN_BUSQUEDAS
	
	int index=0;
	JPanel jPanel=null;
		
	if(this.jTabbedPaneBusquedasTipoSexo.getComponents().length>0) {
	
	}	
	
	}
	
	public void updateHabilitarBusquedasFormularioTipoSexo() {
	
	//BYDAN_BUSQUEDAS		
		int index=0;
		JPanel jPanel=null;
			
		if(this.jTabbedPaneBusquedasTipoSexo.getComponents().length>0) {
	
		}	
	
	}
	
	
	public void resaltarPanelBusquedaTipoSexo(String sTipoBusqueda) {
		Boolean existe=false;
		//BYDAN_BUSQUEDAS
		
		int index=0;
		Border resaltar = Funciones2.getBorderResaltar(this.parametroGeneralUsuario,"TAB");

		

		if(existe) {
			
			this.jTtoolBarTipoSexo.setBorder(resaltar);
			
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
	
	public void updateControlesFormularioTipoSexo() throws Exception {

		if(this.jInternalFrameDetalleFormTipoSexo==null) { //if(!this.conCargarFormDetalle) {			
			this.inicializarFormDetalle();
		}
		
		this.updateBorderResaltarControlesFormularioTipoSexo();
		this.updateVisibilidadResaltarControlesFormularioTipoSexo();
		this.updateHabilitarResaltarControlesFormularioTipoSexo();
		
	}
	
	public void updateBorderResaltarControlesFormularioTipoSexo() throws Exception {
		if(this.jInternalFrameDetalleFormTipoSexo==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
	
		if(this.tiposexoConstantesFunciones.resaltaridTipoSexo!=null && this.jInternalFrameDetalleFormTipoSexo!=null) {this.jInternalFrameDetalleFormTipoSexo.jLabelidTipoSexo.setBorder(this.tiposexoConstantesFunciones.resaltaridTipoSexo);}
		if(this.tiposexoConstantesFunciones.resaltarid_empresaTipoSexo!=null && this.jInternalFrameDetalleFormTipoSexo!=null) {this.jInternalFrameDetalleFormTipoSexo.jComboBoxid_empresaTipoSexo.setBorder(this.tiposexoConstantesFunciones.resaltarid_empresaTipoSexo);}
		if(this.tiposexoConstantesFunciones.resaltarcodigoTipoSexo!=null && this.jInternalFrameDetalleFormTipoSexo!=null) {this.jInternalFrameDetalleFormTipoSexo.jTextFieldcodigoTipoSexo.setBorder(this.tiposexoConstantesFunciones.resaltarcodigoTipoSexo);}
		if(this.tiposexoConstantesFunciones.resaltarnombreTipoSexo!=null && this.jInternalFrameDetalleFormTipoSexo!=null) {this.jInternalFrameDetalleFormTipoSexo.jTextAreanombreTipoSexo.setBorder(this.tiposexoConstantesFunciones.resaltarnombreTipoSexo);}
	}
	
	public void updateVisibilidadResaltarControlesFormularioTipoSexo() throws Exception {		
		if(this.jInternalFrameDetalleFormTipoSexo==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormTipoSexo!=null) {
	
		//this.jInternalFrameDetalleFormTipoSexo.jLabelidTipoSexo.setVisible(this.tiposexoConstantesFunciones.mostraridTipoSexo);
		this.jInternalFrameDetalleFormTipoSexo.jPanelidTipoSexo.setVisible(this.tiposexoConstantesFunciones.mostraridTipoSexo);
		//this.jInternalFrameDetalleFormTipoSexo.jComboBoxid_empresaTipoSexo.setVisible(this.tiposexoConstantesFunciones.mostrarid_empresaTipoSexo);
		this.jInternalFrameDetalleFormTipoSexo.jPanelid_empresaTipoSexo.setVisible(this.tiposexoConstantesFunciones.mostrarid_empresaTipoSexo);
		//this.jInternalFrameDetalleFormTipoSexo.jTextFieldcodigoTipoSexo.setVisible(this.tiposexoConstantesFunciones.mostrarcodigoTipoSexo);
		this.jInternalFrameDetalleFormTipoSexo.jPanelcodigoTipoSexo.setVisible(this.tiposexoConstantesFunciones.mostrarcodigoTipoSexo);
		//this.jInternalFrameDetalleFormTipoSexo.jTextAreanombreTipoSexo.setVisible(this.tiposexoConstantesFunciones.mostrarnombreTipoSexo);
		this.jInternalFrameDetalleFormTipoSexo.jPanelnombreTipoSexo.setVisible(this.tiposexoConstantesFunciones.mostrarnombreTipoSexo);
		}
	}
	
	public void updateHabilitarResaltarControlesFormularioTipoSexo() throws Exception {
		if(this.jInternalFrameDetalleFormTipoSexo==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormTipoSexo!=null) {
	
		this.jInternalFrameDetalleFormTipoSexo.jLabelidTipoSexo.setEnabled(this.tiposexoConstantesFunciones.activaridTipoSexo);
		this.jInternalFrameDetalleFormTipoSexo.jComboBoxid_empresaTipoSexo.setEnabled(this.tiposexoConstantesFunciones.activarid_empresaTipoSexo);
		this.jInternalFrameDetalleFormTipoSexo.jTextFieldcodigoTipoSexo.setEnabled(this.tiposexoConstantesFunciones.activarcodigoTipoSexo);
		this.jInternalFrameDetalleFormTipoSexo.jTextAreanombreTipoSexo.setEnabled(this.tiposexoConstantesFunciones.activarnombreTipoSexo);
		}
	}
	
		
}