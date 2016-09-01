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

import com.bydan.erp.activosfijos.util.GastoDepreciacionConstantesFunciones;
import com.bydan.erp.activosfijos.util.GastoDepreciacionParameterReturnGeneral;
//import com.bydan.erp.activosfijos.util.GastoDepreciacionParameterGeneral;
//import com.bydan.erp.activosfijos.presentation.report.source.GastoDepreciacionBean;
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

import com.bydan.erp.activosfijos.presentation.swing.jinternalframes.auxiliar.*;
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
import com.bydan.erp.activosfijos.resources.reportes.AuxiliarReportes;


import com.bydan.erp.activosfijos.util.*;
import com.bydan.erp.activosfijos.business.logic.*;

import com.bydan.erp.seguridad.business.logic.*;

//EJB

//PARAMETROS


//EJB PARAMETROS

import com.bydan.framework.erp.business.logic.*;
import com.bydan.framework.erp.util.*;

import com.bydan.erp.activosfijos.business.entity.*;
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


import com.bydan.erp.activosfijos.presentation.web.jsf.sessionbean.*;

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
public class GastoDepreciacionBeanSwingJInternalFrame extends GastoDepreciacionJInternalFrame implements WindowListener,WindowFocusListener
{				
	
	public static final long serialVersionUID = 1L;
	
	public static Logger logger = Logger.getLogger(GastoDepreciacionBeanSwingJInternalFrame.class);  
	
	public static ClassValidator<GastoDepreciacion> gastodepreciacionValidator = new ClassValidator<GastoDepreciacion>(GastoDepreciacion.class);
	
	public InvalidValue[] invalidValues=null;
		

	//Ejb Foreign Keys
	
	public GastoDepreciacion gastodepreciacion;	
	public GastoDepreciacion gastodepreciacionAux;
	public GastoDepreciacion gastodepreciacionAnterior;//USADO PARA MANEJAR FOCUS GAINED,LOST
	public GastoDepreciacion gastodepreciacionTotales;
	public Long idGastoDepreciacionActual;
	public Long iIdNuevoGastoDepreciacion=0L;
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

	public String sFinalQueryComboDetalleGrupoActivoFijo="";

	public List<DetalleGrupoActivoFijo> detallegrupoactivofijosForeignKey;

	public List<DetalleGrupoActivoFijo> getdetallegrupoactivofijosForeignKey() {
		return detallegrupoactivofijosForeignKey;
	}

	public void setdetallegrupoactivofijosForeignKey(List<DetalleGrupoActivoFijo> detallegrupoactivofijosForeignKey) {
		this.detallegrupoactivofijosForeignKey = detallegrupoactivofijosForeignKey;
	}

	//OBJETO FK ACTUAL
	public DetalleGrupoActivoFijo detallegrupoactivofijoForeignKey;

	public DetalleGrupoActivoFijo getdetallegrupoactivofijoForeignKey() {
		return detallegrupoactivofijoForeignKey;
	}

	public void setdetallegrupoactivofijoForeignKey(DetalleGrupoActivoFijo detallegrupoactivofijoForeignKey) {
		this.detallegrupoactivofijoForeignKey = detallegrupoactivofijoForeignKey;
	}

		
	
	
	
	
	

	public Boolean isTienePermisosCuentaContaGastoDepre=false;

	public Boolean getIsTienePermisosCuentaContaGastoDepre() {
		return isTienePermisosCuentaContaGastoDepre;
	}

	public void setIsTienePermisosCuentaContaGastoDepre(Boolean isTienePermisosCuentaContaGastoDepre) {
		this.isTienePermisosCuentaContaGastoDepre= isTienePermisosCuentaContaGastoDepre;
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
	
	public Boolean isPermisoTodoGastoDepreciacion;
	public Boolean isPermisoNuevoGastoDepreciacion;
	public Boolean isPermisoActualizarGastoDepreciacion;
	public Boolean isPermisoActualizarOriginalGastoDepreciacion;
	public Boolean isPermisoEliminarGastoDepreciacion;
	public Boolean isPermisoGuardarCambiosGastoDepreciacion;
	public Boolean isPermisoConsultaGastoDepreciacion;
	public Boolean isPermisoBusquedaGastoDepreciacion;
	public Boolean isPermisoReporteGastoDepreciacion;
	public Boolean isPermisoPaginacionMedioGastoDepreciacion;
	public Boolean isPermisoPaginacionAltoGastoDepreciacion;
	public Boolean isPermisoPaginacionTodoGastoDepreciacion;
	public Boolean isPermisoCopiarGastoDepreciacion;
	public Boolean isPermisoVerFormGastoDepreciacion;
	public Boolean isPermisoDuplicarGastoDepreciacion;
	public Boolean isPermisoOrdenGastoDepreciacion;
	
	
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
	
	public GastoDepreciacionParameterReturnGeneral gastodepreciacionReturnGeneral;
	public GastoDepreciacionParameterReturnGeneral gastodepreciacionParameterGeneral;
	
	

	public CuentaContaGastoDepreLogic cuentacontagastodepreLogic=null;

	public CuentaContaGastoDepreLogic getCuentaContaGastoDepreLogic() {
		return cuentacontagastodepreLogic;
	}

	public void setCuentaContaGastoDepreLogic(CuentaContaGastoDepreLogic cuentacontagastodepreLogic) {
		this.cuentacontagastodepreLogic = cuentacontagastodepreLogic;
	}
 	
	public JasperPrint jasperPrint = null;
	
	public Long lIdUsuarioSesion=0L;				
	
	public Boolean isEsNuevoGastoDepreciacion=false;
	public Boolean esParaAccionDesdeFormularioGastoDepreciacion=false;
	public Boolean isEsMantenimientoRelacionesRelacionadoUnico=false;
	public Boolean isEsMantenimientoRelaciones=false;
	public Boolean isEsMantenimientoRelacionado=false;	
	public Boolean isContieneImagenes=false;
		
	//public Boolean conTotales=false; //Viene heredado de JInternalFrameBase
	//public Boolean esParaBusquedaForeignKey=false;
	
	
	protected GastoDepreciacionSessionBeanAdditional gastodepreciacionSessionBeanAdditional=null;
	
	public GastoDepreciacionSessionBeanAdditional getGastoDepreciacionSessionBeanAdditional() {
		return this.gastodepreciacionSessionBeanAdditional;
	}
	
	public void setGastoDepreciacionSessionBeanAdditional(GastoDepreciacionSessionBeanAdditional gastodepreciacionSessionBeanAdditional) {
		try {
			this.gastodepreciacionSessionBeanAdditional=gastodepreciacionSessionBeanAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	protected GastoDepreciacionBeanSwingJInternalFrameAdditional gastodepreciacionBeanSwingJInternalFrameAdditional=null;
	//public class GastoDepreciacionBeanSwingJInternalFrame
	
	public GastoDepreciacionBeanSwingJInternalFrameAdditional getGastoDepreciacionBeanSwingJInternalFrameAdditional() {
		return this.gastodepreciacionBeanSwingJInternalFrameAdditional;
	}
	
	public void setGastoDepreciacionBeanSwingJInternalFrameAdditional(GastoDepreciacionBeanSwingJInternalFrameAdditional gastodepreciacionBeanSwingJInternalFrameAdditional) {
		try {
			this.gastodepreciacionBeanSwingJInternalFrameAdditional=gastodepreciacionBeanSwingJInternalFrameAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	//ESTA EN PADRE
	
	//public GastoDepreciacionLogic gastodepreciacionLogic;
	public SistemaLogicAdditional sistemaLogicAdditional;
	
	
	public GastoDepreciacion gastodepreciacionBean;
	public GastoDepreciacionConstantesFunciones gastodepreciacionConstantesFunciones;
	//public GastoDepreciacionParameterReturnGeneral gastodepreciacionReturnGeneral;
	
	//FK
	
	public EmpresaLogic empresaLogic;
	public DetalleGrupoActivoFijoLogic detallegrupoactivofijoLogic;
	
	//PARAMETROS
	
	
	//public List<GastoDepreciacion> gastodepreciacions;	
	//public List<GastoDepreciacion> gastodepreciacionsEliminados;
	//public List<GastoDepreciacion> gastodepreciacionsAux;
	
	public String sAccionMantenimiento="";
	public String sAccionBusqueda="";
	public String sAccionAdicional="";
	public String sUltimaBusqueda="";
	
	public Mensaje mensaje;
	
	
	public String sVisibilidadTablaBusquedas="";					
	public String sVisibilidadTablaElementos="";	
	public String sVisibilidadTablaAcciones="";			
	
	public Boolean isVisibilidadCeldaNuevoGastoDepreciacion=false;
	public Boolean isVisibilidadCeldaDuplicarGastoDepreciacion=true;
	public Boolean isVisibilidadCeldaCopiarGastoDepreciacion=true;
	public Boolean isVisibilidadCeldaVerFormGastoDepreciacion=true;
	public Boolean isVisibilidadCeldaOrdenGastoDepreciacion=true;
	public Boolean isVisibilidadCeldaNuevoRelacionesGastoDepreciacion=false;
	public Boolean isVisibilidadCeldaModificarGastoDepreciacion=false;
	public Boolean isVisibilidadCeldaActualizarGastoDepreciacion=false;
	public Boolean isVisibilidadCeldaEliminarGastoDepreciacion=false;
	public Boolean isVisibilidadCeldaCancelarGastoDepreciacion=false;
	public Boolean isVisibilidadCeldaGuardarGastoDepreciacion=false;	
	public Boolean isVisibilidadCeldaGuardarCambiosGastoDepreciacion=false;	
	
	
	public Boolean isVisibilidadFK_IdDetalleGrupoActivoFijo=false;
	public Boolean isVisibilidadFK_IdEmpresa=false;
	
	public Long getiIdNuevoGastoDepreciacion() {
		return this.iIdNuevoGastoDepreciacion;
	}

	public void setiIdNuevoGastoDepreciacion(Long iIdNuevoGastoDepreciacion) {
		this.iIdNuevoGastoDepreciacion = iIdNuevoGastoDepreciacion;
	}
	
	public Long getidGastoDepreciacionActual() {
		return this.idGastoDepreciacionActual;
	}

	public void setidGastoDepreciacionActual(Long idGastoDepreciacionActual) {
		this.idGastoDepreciacionActual = idGastoDepreciacionActual;
	}
	
	public int getrowIndexActual() {
		return this.rowIndexActual;
	}

	public void setrowIndexActual(int rowIndexActual) {
		this.rowIndexActual=rowIndexActual;
	}
	
	
	public GastoDepreciacion getgastodepreciacion() {
		return this.gastodepreciacion;
	}

	public void setgastodepreciacion(GastoDepreciacion gastodepreciacion) {
		this.gastodepreciacion = gastodepreciacion;
	}
	
	public GastoDepreciacion getgastodepreciacionAux() {
		return this.gastodepreciacionAux;
	}

	public void setgastodepreciacionAux(GastoDepreciacion gastodepreciacionAux) {
		this.gastodepreciacionAux = gastodepreciacionAux;
	}				
	
	public GastoDepreciacion getgastodepreciacionAnterior() {
		return this.gastodepreciacionAnterior;
	}

	public void setgastodepreciacionAnterior(GastoDepreciacion gastodepreciacionAnterior) {
		this.gastodepreciacionAnterior = gastodepreciacionAnterior;
	}	
	
	public GastoDepreciacion getgastodepreciacionTotales() {
		return this.gastodepreciacionTotales;
	}

	public void setgastodepreciacionTotales(GastoDepreciacion gastodepreciacionTotales) {
		this.gastodepreciacionTotales = gastodepreciacionTotales;
	}	
	
	public GastoDepreciacion getgastodepreciacionBean() {
		return this.gastodepreciacionBean;
	}

	public void setgastodepreciacionBean(GastoDepreciacion gastodepreciacionBean) {
		this.gastodepreciacionBean = gastodepreciacionBean;
	}	
	
	public GastoDepreciacionParameterReturnGeneral getgastodepreciacionReturnGeneral() {
		return this.gastodepreciacionReturnGeneral;
	}

	public void setgastodepreciacionReturnGeneral(GastoDepreciacionParameterReturnGeneral gastodepreciacionReturnGeneral) {
		this.gastodepreciacionReturnGeneral = gastodepreciacionReturnGeneral;
	}	
	
	
	public Long id_detalle_grupo_activo_fijoFK_IdDetalleGrupoActivoFijo=-1L;

	public Long getid_detalle_grupo_activo_fijoFK_IdDetalleGrupoActivoFijo() {
		return this.id_detalle_grupo_activo_fijoFK_IdDetalleGrupoActivoFijo;
	}

	public void setid_detalle_grupo_activo_fijoFK_IdDetalleGrupoActivoFijo(Long id_detalle_grupo_activo_fijoFK_IdDetalleGrupoActivoFijo) {
		this.id_detalle_grupo_activo_fijoFK_IdDetalleGrupoActivoFijo = id_detalle_grupo_activo_fijoFK_IdDetalleGrupoActivoFijo;
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
	
	
	public GastoDepreciacionLogic getGastoDepreciacionLogic()	{		
		return gastodepreciacionLogic;
	}

	public void setGastoDepreciacionLogic(GastoDepreciacionLogic gastodepreciacionLogic) {
		this.gastodepreciacionLogic = gastodepreciacionLogic;
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
	
	public Boolean getIsEsNuevoGastoDepreciacion() {
		return isEsNuevoGastoDepreciacion;
	}

	public void setIsEsNuevoGastoDepreciacion(Boolean isEsNuevoGastoDepreciacion) {
		this.isEsNuevoGastoDepreciacion = isEsNuevoGastoDepreciacion;
	}

	public Boolean getEsParaAccionDesdeFormularioGastoDepreciacion() {
		return esParaAccionDesdeFormularioGastoDepreciacion;
	}
	
	public void setEsParaAccionDesdeFormularioGastoDepreciacion(Boolean esParaAccionDesdeFormularioGastoDepreciacion) {
		this.esParaAccionDesdeFormularioGastoDepreciacion = esParaAccionDesdeFormularioGastoDepreciacion;
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

			if(this.gastodepreciacionSessionBean==null) {
				this.gastodepreciacionSessionBean=new GastoDepreciacionSessionBean();
			}

			if(!this.gastodepreciacionSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {
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
					empresaLogic.getEntityWithConnection(gastodepreciacionSessionBean.getlidEmpresaActual());
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

	public void cargarCombosDetalleGrupoActivoFijosForeignKeyLista(String sFinalQuery)throws Exception
	{
		try
		{
			this.detallegrupoactivofijosForeignKey=new ArrayList<DetalleGrupoActivoFijo>();

			ArrayList<Classe> clases=new ArrayList<Classe>();
			ArrayList<String> arrClasses=new ArrayList<String>();
			Classe classe=new Classe();
			DatosDeep datosDeep=new DatosDeep(false,DeepLoadType.INCLUDE,clases,"");

			DetalleGrupoActivoFijoLogic detallegrupoactivofijoLogic=new DetalleGrupoActivoFijoLogic();

			//detallegrupoactivofijoLogic.getDetalleGrupoActivoFijoDataAccess().setIsForForeingKeyData(true);

			if(this.gastodepreciacionSessionBean==null) {
				this.gastodepreciacionSessionBean=new GastoDepreciacionSessionBean();
			}

			if(!this.gastodepreciacionSessionBean.getisBusquedaDesdeForeignKeySesionDetalleGrupoActivoFijo()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//detallegrupoactivofijoLogic.getDetalleGrupoActivoFijoDataAccess().setIsForForeingKeyData(true);

					detallegrupoactivofijoLogic.getTodosDetalleGrupoActivoFijosWithConnection(sFinalQuery,new Pagination());

					this.detallegrupoactivofijosForeignKey=detallegrupoactivofijoLogic.getDetalleGrupoActivoFijos();

				} else if(Constantes.ISUSAEJBREMOTE) {

				} else if(Constantes.ISUSAEJBHOME) {
				}


				//ARCHITECTURE
			} else {
				if(!this.conCargarMinimo) {
					this.setVisibilidadBusquedasParaDetalleGrupoActivoFijo(true);
				}
				//ARCHITECTURE

				if(Constantes.ISUSAEJBLOGICLAYER) {
					detallegrupoactivofijoLogic.getEntityWithConnection(gastodepreciacionSessionBean.getlidDetalleGrupoActivoFijoActual());
					this.detallegrupoactivofijosForeignKey.add(detallegrupoactivofijoLogic.getDetalleGrupoActivoFijo());
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

					if(this.gastodepreciacion!=null) {
						this.gastodepreciacion.setEmpresa(empresaTemp);
					}

					if(this.jInternalFrameDetalleFormGastoDepreciacion!=null) {
						this.jInternalFrameDetalleFormGastoDepreciacion.jComboBoxid_empresaGastoDepreciacion.setSelectedItem(empresaTemp);
					}
				} else {
					//jComboBoxid_empresaGastoDepreciacion.setSelectedItem(empresaTemp);
					if(this.jInternalFrameDetalleFormGastoDepreciacion!=null) {
						if(this.jInternalFrameDetalleFormGastoDepreciacion.jComboBoxid_empresaGastoDepreciacion.getItemCount()>0) {
							this.jInternalFrameDetalleFormGastoDepreciacion.jComboBoxid_empresaGastoDepreciacion.setSelectedIndex(0);
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
	public void setActualEmpresaForeignKeyGenerico(Long idEmpresaSeleccionado,JComboBox jComboBoxid_empresaGastoDepreciacionGenerico)throws Exception
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
				jComboBoxid_empresaGastoDepreciacionGenerico.setSelectedItem(empresaTemp);
			} else {
				if(jComboBoxid_empresaGastoDepreciacionGenerico!=null && jComboBoxid_empresaGastoDepreciacionGenerico.getItemCount()>0) {
					jComboBoxid_empresaGastoDepreciacionGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	public void setActualDetalleGrupoActivoFijoForeignKey(Long idDetalleGrupoActivoFijoSeleccionado,Boolean conCombosBusquedas,String sFormularioTipoBusqueda)throws Exception
	{
		try
		{
			DetalleGrupoActivoFijo  detallegrupoactivofijoTemp=null;

			for(DetalleGrupoActivoFijo detallegrupoactivofijoAux:detallegrupoactivofijosForeignKey) {
				if(detallegrupoactivofijoAux.getId()!=null && detallegrupoactivofijoAux.getId().equals(idDetalleGrupoActivoFijoSeleccionado)) {
					detallegrupoactivofijoTemp=detallegrupoactivofijoAux;
					break;
				}
			}

			if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){
				if(detallegrupoactivofijoTemp!=null) {

					if(this.gastodepreciacion!=null) {
						this.gastodepreciacion.setDetalleGrupoActivoFijo(detallegrupoactivofijoTemp);
					}

					if(this.jInternalFrameDetalleFormGastoDepreciacion!=null) {
						this.jInternalFrameDetalleFormGastoDepreciacion.jComboBoxid_detalle_grupo_activo_fijoGastoDepreciacion.setSelectedItem(detallegrupoactivofijoTemp);
					}
				} else {
					//jComboBoxid_detalle_grupo_activo_fijoGastoDepreciacion.setSelectedItem(detallegrupoactivofijoTemp);
					if(this.jInternalFrameDetalleFormGastoDepreciacion!=null) {
						if(this.jInternalFrameDetalleFormGastoDepreciacion.jComboBoxid_detalle_grupo_activo_fijoGastoDepreciacion.getItemCount()>0) {
							this.jInternalFrameDetalleFormGastoDepreciacion.jComboBoxid_detalle_grupo_activo_fijoGastoDepreciacion.setSelectedIndex(0);
						}
					}
				}
			}

			if(conCombosBusquedas) {

		//BYDAN_BUSQUEDAS
						
				if(sFormularioTipoBusqueda.equals("FK_IdDetalleGrupoActivoFijo") || sFormularioTipoBusqueda.equals("Todos")){
					if(detallegrupoactivofijoTemp!=null && jComboBoxid_detalle_grupo_activo_fijoFK_IdDetalleGrupoActivoFijoGastoDepreciacion!=null) {
						jComboBoxid_detalle_grupo_activo_fijoFK_IdDetalleGrupoActivoFijoGastoDepreciacion.setSelectedItem(detallegrupoactivofijoTemp);
					} else {
						if(jComboBoxid_detalle_grupo_activo_fijoFK_IdDetalleGrupoActivoFijoGastoDepreciacion!=null) {
							//jComboBoxid_detalle_grupo_activo_fijoFK_IdDetalleGrupoActivoFijoGastoDepreciacion.setSelectedItem(detallegrupoactivofijoTemp);
							if(jComboBoxid_detalle_grupo_activo_fijoFK_IdDetalleGrupoActivoFijoGastoDepreciacion.getItemCount()>0) {
								jComboBoxid_detalle_grupo_activo_fijoFK_IdDetalleGrupoActivoFijoGastoDepreciacion.setSelectedIndex(0);
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

	public String getActualDetalleGrupoActivoFijoForeignKeyDescripcion(Long idDetalleGrupoActivoFijoSeleccionado)throws Exception
	{
		String sDescripcion="";

		try
		{
			DetalleGrupoActivoFijo  detallegrupoactivofijoTemp=null;

			for(DetalleGrupoActivoFijo detallegrupoactivofijoAux:detallegrupoactivofijosForeignKey) {
				if(detallegrupoactivofijoAux.getId()!=null && detallegrupoactivofijoAux.getId().equals(idDetalleGrupoActivoFijoSeleccionado)) {
					detallegrupoactivofijoTemp=detallegrupoactivofijoAux;
					break;
				}
			}


			sDescripcion=DetalleGrupoActivoFijoConstantesFunciones.getDetalleGrupoActivoFijoDescripcion(detallegrupoactivofijoTemp);
		}
		catch(Exception e)
		{
			throw e;
		}

		return sDescripcion;
	}

	@SuppressWarnings("rawtypes")
	public void setActualDetalleGrupoActivoFijoForeignKeyGenerico(Long idDetalleGrupoActivoFijoSeleccionado,JComboBox jComboBoxid_detalle_grupo_activo_fijoGastoDepreciacionGenerico)throws Exception
	{
		try
		{
			DetalleGrupoActivoFijo  detallegrupoactivofijoTemp=null;

			for(DetalleGrupoActivoFijo detallegrupoactivofijoAux:detallegrupoactivofijosForeignKey) {
				if(detallegrupoactivofijoAux.getId()!=null && detallegrupoactivofijoAux.getId().equals(idDetalleGrupoActivoFijoSeleccionado)) {
					detallegrupoactivofijoTemp=detallegrupoactivofijoAux;
					break;
				}
			}

			if(detallegrupoactivofijoTemp!=null) {
				jComboBoxid_detalle_grupo_activo_fijoGastoDepreciacionGenerico.setSelectedItem(detallegrupoactivofijoTemp);
			} else {
				if(jComboBoxid_detalle_grupo_activo_fijoGastoDepreciacionGenerico!=null && jComboBoxid_detalle_grupo_activo_fijoGastoDepreciacionGenerico.getItemCount()>0) {
					jComboBoxid_detalle_grupo_activo_fijoGastoDepreciacionGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	
	
	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarEmpresaForeignKey(GastoDepreciacion gastodepreciacion,JComboBox jComboBoxid_empresaGastoDepreciacionGenerico)throws Exception
	{
		try
		{
			Empresa  empresaAux=new Empresa();

			if(jComboBoxid_empresaGastoDepreciacionGenerico==null) {
				empresaAux=(Empresa)this.jInternalFrameDetalleFormGastoDepreciacion.jComboBoxid_empresaGastoDepreciacion.getSelectedItem();
			} else {
				empresaAux=(Empresa)jComboBoxid_empresaGastoDepreciacionGenerico.getSelectedItem();
			}

			if(empresaAux!=null && empresaAux.getId()!=null) {
				gastodepreciacion.setid_empresa(empresaAux.getId());
				gastodepreciacion.setempresa_descripcion(GastoDepreciacionConstantesFunciones.getEmpresaDescripcion(empresaAux));
				gastodepreciacion.setEmpresa(empresaAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarDetalleGrupoActivoFijoForeignKey(GastoDepreciacion gastodepreciacion,JComboBox jComboBoxid_detalle_grupo_activo_fijoGastoDepreciacionGenerico)throws Exception
	{
		try
		{
			DetalleGrupoActivoFijo  detallegrupoactivofijoAux=new DetalleGrupoActivoFijo();

			if(jComboBoxid_detalle_grupo_activo_fijoGastoDepreciacionGenerico==null) {
				detallegrupoactivofijoAux=(DetalleGrupoActivoFijo)this.jInternalFrameDetalleFormGastoDepreciacion.jComboBoxid_detalle_grupo_activo_fijoGastoDepreciacion.getSelectedItem();
			} else {
				detallegrupoactivofijoAux=(DetalleGrupoActivoFijo)jComboBoxid_detalle_grupo_activo_fijoGastoDepreciacionGenerico.getSelectedItem();
			}

			if(detallegrupoactivofijoAux!=null && detallegrupoactivofijoAux.getId()!=null) {
				gastodepreciacion.setid_detalle_grupo_activo_fijo(detallegrupoactivofijoAux.getId());
				gastodepreciacion.setdetallegrupoactivofijo_descripcion(GastoDepreciacionConstantesFunciones.getDetalleGrupoActivoFijoDescripcion(detallegrupoactivofijoAux));
				gastodepreciacion.setDetalleGrupoActivoFijo(detallegrupoactivofijoAux);			}
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

					if(!GastoDepreciacionJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormGastoDepreciacion!=null) { 
							this.jInternalFrameDetalleFormGastoDepreciacion.jComboBoxid_empresaGastoDepreciacion.removeAllItems();

							for(Empresa empresa:this.empresasForeignKey) {
								this.jInternalFrameDetalleFormGastoDepreciacion.jComboBoxid_empresaGastoDepreciacion.addItem(empresa);
							}
						}
					}

					if(this.jInternalFrameDetalleFormGastoDepreciacion!=null) { 
					}

					if(!GastoDepreciacionJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {


				}

			}  catch(Exception e) {
				throw e;
			}
		}

		@SuppressWarnings({ "unchecked", "rawtypes" })
		public void cargarCombosFrameDetalleGrupoActivoFijosForeignKey(String sFormularioTipoBusqueda)throws Exception {
			try {

				JComboBoxBinding jComboBoxBindingDetalleGrupoActivoFijo=null;

				if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){

					if(!GastoDepreciacionJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormGastoDepreciacion!=null) { 
							this.jInternalFrameDetalleFormGastoDepreciacion.jComboBoxid_detalle_grupo_activo_fijoGastoDepreciacion.removeAllItems();

							for(DetalleGrupoActivoFijo detallegrupoactivofijo:this.detallegrupoactivofijosForeignKey) {
								this.jInternalFrameDetalleFormGastoDepreciacion.jComboBoxid_detalle_grupo_activo_fijoGastoDepreciacion.addItem(detallegrupoactivofijo);
							}
						}
					}

					if(this.jInternalFrameDetalleFormGastoDepreciacion!=null) { 
					}

					if(!GastoDepreciacionJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {

					if(sFormularioTipoBusqueda.equals("FK_IdDetalleGrupoActivoFijo") || sFormularioTipoBusqueda.equals("Todos")){

						//BYDAN_BUSQUEDAS
						
						if(!GastoDepreciacionJInternalFrame.ISBINDING_MANUAL) {
						} else {
							this.jComboBoxid_detalle_grupo_activo_fijoFK_IdDetalleGrupoActivoFijoGastoDepreciacion.removeAllItems();

							for(DetalleGrupoActivoFijo detallegrupoactivofijo:this.detallegrupoactivofijosForeignKey) {
								this.jComboBoxid_detalle_grupo_activo_fijoFK_IdDetalleGrupoActivoFijoGastoDepreciacion.addItem(detallegrupoactivofijo);
							}
						}

						if(!GastoDepreciacionJInternalFrame.ISBINDING_MANUAL) {
						}

						
					}

				}

			}  catch(Exception e) {
				throw e;
			}
		}

	


		public void setSelectedItemCombosFrameEmpresaForeignKey(Empresa empresa,int iIndexSelected,Boolean conSelectedIndex,Boolean conFormulario,Boolean conBusqueda)throws Exception {
			try {

				if(conFormulario) {
					if(!conSelectedIndex) {
						if(this.jInternalFrameDetalleFormGastoDepreciacion!=null) {
							this.jInternalFrameDetalleFormGastoDepreciacion.jComboBoxid_empresaGastoDepreciacion.setSelectedItem(empresa);
						}
					} else {
						if(this.jInternalFrameDetalleFormGastoDepreciacion!=null) {
							this.jInternalFrameDetalleFormGastoDepreciacion.jComboBoxid_empresaGastoDepreciacion.setSelectedIndex(iIndexSelected);
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

		public void setSelectedItemCombosFrameDetalleGrupoActivoFijoForeignKey(DetalleGrupoActivoFijo detallegrupoactivofijo,int iIndexSelected,Boolean conSelectedIndex,Boolean conFormulario,Boolean conBusqueda)throws Exception {
			try {

				if(conFormulario) {
					if(!conSelectedIndex) {
						if(this.jInternalFrameDetalleFormGastoDepreciacion!=null) {
							this.jInternalFrameDetalleFormGastoDepreciacion.jComboBoxid_detalle_grupo_activo_fijoGastoDepreciacion.setSelectedItem(detallegrupoactivofijo);
						}
					} else {
						if(this.jInternalFrameDetalleFormGastoDepreciacion!=null) {
							this.jInternalFrameDetalleFormGastoDepreciacion.jComboBoxid_detalle_grupo_activo_fijoGastoDepreciacion.setSelectedIndex(iIndexSelected);
						}
					}
				}


				if(!this.conCargarMinimo) {
					if(conBusqueda) {

					//BYDAN_BUSQUEDAS
					
						if(!conSelectedIndex) {
							this.jComboBoxid_detalle_grupo_activo_fijoFK_IdDetalleGrupoActivoFijoGastoDepreciacion.setSelectedItem(detallegrupoactivofijo);
						} else {
							this.jComboBoxid_detalle_grupo_activo_fijoFK_IdDetalleGrupoActivoFijoGastoDepreciacion.setSelectedIndex(iIndexSelected);
						}

										}
				}
			} catch(Exception e) {
				throw e;
			}
		}

	


	
	public void refrescarForeignKeysDescripcionesGastoDepreciacion() throws Exception {
		//SI FUNCIONA DEEPLOAD ESTO VA AL ULTIMO
		if(Constantes.ISUSAEJBLOGICLAYER) {
			GastoDepreciacionConstantesFunciones.refrescarForeignKeysDescripcionesGastoDepreciacion(this.gastodepreciacionLogic.getGastoDepreciacions());
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			GastoDepreciacionConstantesFunciones.refrescarForeignKeysDescripcionesGastoDepreciacion(this.gastodepreciacions);
		}
		
		/*
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		classes.add(new Classe(Empresa.class));
		classes.add(new Classe(DetalleGrupoActivoFijo.class));
			
		if(Constantes.ISUSAEJBLOGICLAYER) {
			//USA LOS OBJETOS DE LOGIC DIRECTAMENTE
			//gastodepreciacionLogic.setGastoDepreciacions(this.gastodepreciacions);
			gastodepreciacionLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
	
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
		
	public GastoDepreciacionParameterReturnGeneral getGastoDepreciacionParameterGeneral() {
		return this.gastodepreciacionParameterGeneral;
	}
	
	public void setGastoDepreciacionParameterGeneral(GastoDepreciacionParameterReturnGeneral gastodepreciacionParameterGeneral) {
		this.gastodepreciacionParameterGeneral = gastodepreciacionParameterGeneral;
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
	
	public Boolean getIsPermisoTodoGastoDepreciacion() {
		return isPermisoTodoGastoDepreciacion;
	}

	public void setIsPermisoTodoGastoDepreciacion(Boolean isPermisoTodoGastoDepreciacion) {
		this.isPermisoTodoGastoDepreciacion = isPermisoTodoGastoDepreciacion;
	}

	public Boolean getIsPermisoNuevoGastoDepreciacion() {
		return isPermisoNuevoGastoDepreciacion;
	}

	public void setIsPermisoNuevoGastoDepreciacion(Boolean isPermisoNuevoGastoDepreciacion) {
		this.isPermisoNuevoGastoDepreciacion = isPermisoNuevoGastoDepreciacion;
	}

	public Boolean getIsPermisoActualizarGastoDepreciacion() {
		return isPermisoActualizarGastoDepreciacion;
	}

	public void setIsPermisoActualizarGastoDepreciacion(Boolean isPermisoActualizarGastoDepreciacion) {
		this.isPermisoActualizarGastoDepreciacion = isPermisoActualizarGastoDepreciacion;
	}

	public Boolean getIsPermisoEliminarGastoDepreciacion() {
		return isPermisoEliminarGastoDepreciacion;
	}

	public void setIsPermisoEliminarGastoDepreciacion(Boolean isPermisoEliminarGastoDepreciacion) {
		this.isPermisoEliminarGastoDepreciacion = isPermisoEliminarGastoDepreciacion;
	}

	public Boolean getIsPermisoGuardarCambiosGastoDepreciacion() {
		return isPermisoGuardarCambiosGastoDepreciacion;
	}

	public void setIsPermisoGuardarCambiosGastoDepreciacion(Boolean isPermisoGuardarCambiosGastoDepreciacion) {
		this.isPermisoGuardarCambiosGastoDepreciacion = isPermisoGuardarCambiosGastoDepreciacion;
	}
	
	public Boolean getIsPermisoConsultaGastoDepreciacion() {
		return isPermisoConsultaGastoDepreciacion;
	}

	public void setIsPermisoConsultaGastoDepreciacion(Boolean isPermisoConsultaGastoDepreciacion) {
		this.isPermisoConsultaGastoDepreciacion = isPermisoConsultaGastoDepreciacion;
	}

	public Boolean getIsPermisoBusquedaGastoDepreciacion() {
		return isPermisoBusquedaGastoDepreciacion;
	}

	public void setIsPermisoBusquedaGastoDepreciacion(Boolean isPermisoBusquedaGastoDepreciacion) {
		this.isPermisoBusquedaGastoDepreciacion = isPermisoBusquedaGastoDepreciacion;
	}

	public Boolean getIsPermisoReporteGastoDepreciacion() {
		return isPermisoReporteGastoDepreciacion;
	}

	public void setIsPermisoReporteGastoDepreciacion(Boolean isPermisoReporteGastoDepreciacion) {
		this.isPermisoReporteGastoDepreciacion = isPermisoReporteGastoDepreciacion;
	}
	
	public Boolean getIsPermisoPaginacionMedioGastoDepreciacion() {
		return isPermisoPaginacionMedioGastoDepreciacion;
	}

	public void setIsPermisoPaginacionMedioGastoDepreciacion(Boolean isPermisoPaginacionMedioGastoDepreciacion) {
		this.isPermisoPaginacionMedioGastoDepreciacion = isPermisoPaginacionMedioGastoDepreciacion;
	}
	
	public Boolean getIsPermisoPaginacionTodoGastoDepreciacion() {
		return isPermisoPaginacionTodoGastoDepreciacion;
	}

	public void setIsPermisoPaginacionTodoGastoDepreciacion(Boolean isPermisoPaginacionTodoGastoDepreciacion) {
		this.isPermisoPaginacionTodoGastoDepreciacion = isPermisoPaginacionTodoGastoDepreciacion;
	}
	
	public Boolean getIsPermisoPaginacionAltoGastoDepreciacion() {
		return isPermisoPaginacionAltoGastoDepreciacion;
	}

	public void setIsPermisoPaginacionAltoGastoDepreciacion(Boolean isPermisoPaginacionAltoGastoDepreciacion) {
		this.isPermisoPaginacionAltoGastoDepreciacion = isPermisoPaginacionAltoGastoDepreciacion;
	}
	
	public Boolean getIsPermisoCopiarGastoDepreciacion() {
		return isPermisoCopiarGastoDepreciacion;
	}

	public void setIsPermisoCopiarGastoDepreciacion(Boolean isPermisoCopiarGastoDepreciacion) {
		this.isPermisoCopiarGastoDepreciacion = isPermisoCopiarGastoDepreciacion;
	}
	
	public Boolean getIsPermisoVerFormGastoDepreciacion() {
		return isPermisoVerFormGastoDepreciacion;
	}

	public void setIsPermisoVerFormGastoDepreciacion(Boolean isPermisoVerFormGastoDepreciacion) {
		this.isPermisoVerFormGastoDepreciacion = isPermisoVerFormGastoDepreciacion;
	}
	
	public Boolean getIsPermisoDuplicarGastoDepreciacion() {
		return isPermisoDuplicarGastoDepreciacion;
	}

	public void setIsPermisoDuplicarGastoDepreciacion(Boolean isPermisoDuplicarGastoDepreciacion) {
		this.isPermisoDuplicarGastoDepreciacion = isPermisoDuplicarGastoDepreciacion;
	}
	
	public Boolean getIsPermisoOrdenGastoDepreciacion() {
		return isPermisoOrdenGastoDepreciacion;
	}

	public void setIsPermisoOrdenGastoDepreciacion(Boolean isPermisoOrdenGastoDepreciacion) {
		this.isPermisoOrdenGastoDepreciacion = isPermisoOrdenGastoDepreciacion;
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
	
	public Boolean getIsVisibilidadCeldaNuevoGastoDepreciacion() {
		return isVisibilidadCeldaNuevoGastoDepreciacion;
	}

	public void setIsVisibilidadCeldaNuevoGastoDepreciacion(Boolean isVisibilidadCeldaNuevoGastoDepreciacion) {
		this.isVisibilidadCeldaNuevoGastoDepreciacion = isVisibilidadCeldaNuevoGastoDepreciacion;
	}
	
	public Boolean getIsVisibilidadCeldaDuplicarGastoDepreciacion() {
		return isVisibilidadCeldaDuplicarGastoDepreciacion;
	}

	public void setIsVisibilidadCeldaDuplicarGastoDepreciacion(Boolean isVisibilidadCeldaDuplicarGastoDepreciacion) {
		this.isVisibilidadCeldaDuplicarGastoDepreciacion = isVisibilidadCeldaDuplicarGastoDepreciacion;
	}
	
	public Boolean getIsVisibilidadCeldaCopiarGastoDepreciacion() {
		return isVisibilidadCeldaCopiarGastoDepreciacion;
	}

	public void setIsVisibilidadCeldaCopiarGastoDepreciacion(Boolean isVisibilidadCeldaCopiarGastoDepreciacion) {
		this.isVisibilidadCeldaCopiarGastoDepreciacion = isVisibilidadCeldaCopiarGastoDepreciacion;
	}
	
	public Boolean getIsVisibilidadCeldaVerFormGastoDepreciacion() {
		return isVisibilidadCeldaVerFormGastoDepreciacion;
	}

	public void setIsVisibilidadCeldaVerFormGastoDepreciacion(Boolean isVisibilidadCeldaVerFormGastoDepreciacion) {
		this.isVisibilidadCeldaVerFormGastoDepreciacion = isVisibilidadCeldaVerFormGastoDepreciacion;
	}
	
	public Boolean getIsVisibilidadCeldaOrdenGastoDepreciacion() {
		return isVisibilidadCeldaOrdenGastoDepreciacion;
	}

	public void setIsVisibilidadCeldaOrdenGastoDepreciacion(Boolean isVisibilidadCeldaOrdenGastoDepreciacion) {
		this.isVisibilidadCeldaOrdenGastoDepreciacion = isVisibilidadCeldaOrdenGastoDepreciacion;
	}
	
	public Boolean getIsVisibilidadCeldaNuevoRelacionesGastoDepreciacion() {
		return isVisibilidadCeldaNuevoRelacionesGastoDepreciacion;
	}

	public void setIsVisibilidadCeldaNuevoRelacionesGastoDepreciacion(Boolean isVisibilidadCeldaNuevoRelacionesGastoDepreciacion) {
		this.isVisibilidadCeldaNuevoRelacionesGastoDepreciacion = isVisibilidadCeldaNuevoRelacionesGastoDepreciacion;
	}
	
	public Boolean getIsVisibilidadCeldaModificarGastoDepreciacion() {
		return isVisibilidadCeldaModificarGastoDepreciacion;
	}

	public void setIsVisibilidadCeldaModificarGastoDepreciacion(Boolean isVisibilidadCeldaModificarGastoDepreciacion) {
		this.isVisibilidadCeldaModificarGastoDepreciacion = isVisibilidadCeldaModificarGastoDepreciacion;
	}
	
	public Boolean getIsVisibilidadCeldaActualizarGastoDepreciacion() {
		return isVisibilidadCeldaActualizarGastoDepreciacion;
	}

	public void setIsVisibilidadCeldaActualizarGastoDepreciacion(Boolean isVisibilidadCeldaActualizarGastoDepreciacion) {
		this.isVisibilidadCeldaActualizarGastoDepreciacion = isVisibilidadCeldaActualizarGastoDepreciacion;
	}

	public Boolean getIsVisibilidadCeldaEliminarGastoDepreciacion() {
		return isVisibilidadCeldaEliminarGastoDepreciacion;
	}

	public void setIsVisibilidadCeldaEliminarGastoDepreciacion(Boolean isVisibilidadCeldaEliminarGastoDepreciacion) {
		this.isVisibilidadCeldaEliminarGastoDepreciacion = isVisibilidadCeldaEliminarGastoDepreciacion;
	}

	public Boolean getIsVisibilidadCeldaCancelarGastoDepreciacion() {
		return isVisibilidadCeldaCancelarGastoDepreciacion;
	}

	public void setIsVisibilidadCeldaCancelarGastoDepreciacion(Boolean isVisibilidadCeldaCancelarGastoDepreciacion) {
		this.isVisibilidadCeldaCancelarGastoDepreciacion = isVisibilidadCeldaCancelarGastoDepreciacion;
	}

	public Boolean getIsVisibilidadCeldaGuardarGastoDepreciacion() {
		return isVisibilidadCeldaGuardarGastoDepreciacion;
	}

	public void setIsVisibilidadCeldaGuardarGastoDepreciacion(Boolean isVisibilidadCeldaGuardarGastoDepreciacion) {
		this.isVisibilidadCeldaGuardarGastoDepreciacion = isVisibilidadCeldaGuardarGastoDepreciacion;
	}
	
	public Boolean getIsVisibilidadCeldaGuardarCambiosGastoDepreciacion() {
		return isVisibilidadCeldaGuardarCambiosGastoDepreciacion;
	}

	public void setIsVisibilidadCeldaGuardarCambiosGastoDepreciacion(Boolean isVisibilidadCeldaGuardarCambiosGastoDepreciacion) {
		this.isVisibilidadCeldaGuardarCambiosGastoDepreciacion = isVisibilidadCeldaGuardarCambiosGastoDepreciacion;
	}
		
	public GastoDepreciacionSessionBean getgastodepreciacionSessionBean() {
		return this.gastodepreciacionSessionBean;
	}
	
	public void setgastodepreciacionSessionBean(GastoDepreciacionSessionBean gastodepreciacionSessionBean) {
		this.gastodepreciacionSessionBean=gastodepreciacionSessionBean;
	}
	
	
	public Boolean getisVisibilidadFK_IdDetalleGrupoActivoFijo() {
		return this.isVisibilidadFK_IdDetalleGrupoActivoFijo;
	}

	public void setisVisibilidadFK_IdDetalleGrupoActivoFijo(Boolean isVisibilidadFK_IdDetalleGrupoActivoFijo) {
		this.isVisibilidadFK_IdDetalleGrupoActivoFijo=isVisibilidadFK_IdDetalleGrupoActivoFijo;
	}

	public Boolean getisVisibilidadFK_IdEmpresa() {
		return this.isVisibilidadFK_IdEmpresa;
	}

	public void setisVisibilidadFK_IdEmpresa(Boolean isVisibilidadFK_IdEmpresa) {
		this.isVisibilidadFK_IdEmpresa=isVisibilidadFK_IdEmpresa;
	}

	
	
	public void setVariablesFormularioToObjetoActualForeignKeysGastoDepreciacion(GastoDepreciacion gastodepreciacion)throws Exception {
		try {
			
				this.setActualParaGuardarEmpresaForeignKey(gastodepreciacion,null);
				this.setActualParaGuardarDetalleGrupoActivoFijoForeignKey(gastodepreciacion,null);
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
	
	public void bugActualizarReferenciaActual(GastoDepreciacion gastodepreciacion,GastoDepreciacion gastodepreciacionAux) throws Exception {
		//ARCHITECTURE		
		//EL ID NEGATIVO GUARDADO EN ORIGINAL SIRVE PARA VERIFICAR Y ACTUALIZAR EL REGISTRO NUEVO (ID,VERSIONROW)
		this.setCamposBaseDesdeOriginalGastoDepreciacion(gastodepreciacion);
					
		//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
		gastodepreciacionAux.setId(gastodepreciacion.getId());
		gastodepreciacionAux.setVersionRow(gastodepreciacion.getVersionRow());					
	}
	
	public void ejecutarMantenimiento(MaintenanceType maintenanceType)throws Exception {	
		try	{								
			
			//this.startProcessGastoDepreciacion();
		
			int intSelectedRow = this.jTableDatosGastoDepreciacion.getSelectedRow();	       
			
			//PUEDE SER -1 CUANDO SE ELIMINA EN GUARDAR CAMBIOS
			if(intSelectedRow>=0 && maintenanceType!=MaintenanceType.GUARDARCAMBIOS) {
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
					
				//ARCHITECTURE
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.gastodepreciacion =(GastoDepreciacion) this.gastodepreciacionLogic.getGastoDepreciacions().toArray()[this.jTableDatosGastoDepreciacion.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
					this.gastodepreciacion =(GastoDepreciacion) this.gastodepreciacions.toArray()[this.jTableDatosGastoDepreciacion.convertRowIndexToModel(intSelectedRow)];
				}
				
				//ARCHITECTURE
				
				if(GastoDepreciacionJInternalFrame.ISBINDING_MANUAL_TABLA) {
					//this.setVariablesFormularioToObjetoActualGastoDepreciacion(this.gastodepreciacion,true);
				}
				
				this.setVariablesFormularioToObjetoActualForeignKeysGastoDepreciacion(this.gastodepreciacion);
			}
			
			//LUEGO DE TRAER DATOS CORRESPONDIENTES QUE COINCIDA LISTA TABLA QUITO FILA TOTALES
			if(this.conTotales) {
				//MEJOR LO DEJO, SI EXISTE EXCEPCION SE PIEDE FILA TOTALES Y ORDEN INDICE FILA ACTUAL
				//this.quitarFilaTotales();
			}
			
			this.cargarDatosCliente();
			
			this.datosDeep=new DatosDeep();
			
			//SE CAMBIA ESTADOS CON ERROR, ENTONCES SE EJECUTA ANTES
			//this.invalidValues = gastodepreciacionValidator.getInvalidValues(this.gastodepreciacion);
			
			//if(this.invalidValues==null || this.invalidValues.length<=0) {
			
			gastodepreciacionLogic.setDatosCliente(datosCliente);
			gastodepreciacionLogic.setIsConDeep(false);
			
			if(maintenanceType==MaintenanceType.NUEVO) {
				gastodepreciacionAux=new  GastoDepreciacion();
				
				gastodepreciacionAux.setIsNew(true);
				gastodepreciacionAux.setIsChanged(true);
				
				gastodepreciacionAux.setGastoDepreciacionOriginal(this.gastodepreciacion);
				
				gastodepreciacionAux.setId(this.gastodepreciacion.getId());	
				gastodepreciacionAux.setVersionRow(this.gastodepreciacion.getVersionRow());	
				gastodepreciacionAux.setid_empresa(this.gastodepreciacion.getid_empresa());	
				gastodepreciacionAux.setid_detalle_grupo_activo_fijo(this.gastodepreciacion.getid_detalle_grupo_activo_fijo());	
				gastodepreciacionAux.setanio(this.gastodepreciacion.getanio());	
				gastodepreciacionAux.setvalor(this.gastodepreciacion.getvalor());	
								
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.gastodepreciacionSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.gastodepreciacionSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(gastodepreciacionAux,gastodepreciacionLogic.getGastoDepreciacions());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(gastodepreciacionAux,gastodepreciacions);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote  && !this.gastodepreciacionSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.gastodepreciacionSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						gastodepreciacionLogic.saveGastoDepreciacions();//WithConnection
						//gastodepreciacionLogic.getSetVersionRowGastoDepreciacions();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE		
					
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.gastodepreciacion,gastodepreciacionAux);
					
					this.refrescarForeignKeysDescripcionesGastoDepreciacion();
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.gastodepreciacionSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
							this.jInternalFrameDetalleFormGastoDepreciacion.cuentacontagastodepreBeanSwingJInternalFrame.cuentacontagastodepreLogic.getCuentaContaGastoDepres().addAll(this.jInternalFrameDetalleFormGastoDepreciacion.cuentacontagastodepreBeanSwingJInternalFrame.cuentacontagastodepresEliminados);
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
							this.jInternalFrameDetalleFormGastoDepreciacion.cuentacontagastodepreBeanSwingJInternalFrame.cuentacontagastodepres.addAll(this.jInternalFrameDetalleFormGastoDepreciacion.cuentacontagastodepreBeanSwingJInternalFrame.cuentacontagastodepresEliminados);
						}
						//ARCHITECTURE	
						
						if(!this.gastodepreciacionSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
								if(this.jInternalFrameDetalleFormGastoDepreciacion.cuentacontagastodepreBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormGastoDepreciacion.cuentacontagastodepreBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormGastoDepreciacion.cuentacontagastodepreBeanSwingJInternalFrame.quitarFilaTotales();*/}
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
								if(this.jInternalFrameDetalleFormGastoDepreciacion.cuentacontagastodepreBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormGastoDepreciacion.cuentacontagastodepreBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormGastoDepreciacion.cuentacontagastodepreBeanSwingJInternalFrame.quitarFilaTotales();*/}	
							}
							//ARCHITECTURE
												
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								gastodepreciacionLogic.saveGastoDepreciacionRelaciones(gastodepreciacionAux,this.jInternalFrameDetalleFormGastoDepreciacion.cuentacontagastodepreBeanSwingJInternalFrame.cuentacontagastodepreLogic.getCuentaContaGastoDepres());//WithConnection
								//gastodepreciacionLogic.getSetVersionRowGastoDepreciacions();//WithConnection
							} else if(Constantes.ISUSAEJBREMOTE) {
							} else if(Constantes.ISUSAEJBHOME) {
							}
							//ARCHITECTURE
							
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							this.bugActualizarReferenciaActual(this.gastodepreciacion,gastodepreciacionAux);
					
					
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								
							this.jInternalFrameDetalleFormGastoDepreciacion.cuentacontagastodepreBeanSwingJInternalFrame.cuentacontagastodepreLogic.setCuentaContaGastoDepres(new ArrayList<CuentaContaGastoDepre>());
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							this.jInternalFrameDetalleFormGastoDepreciacion.cuentacontagastodepreBeanSwingJInternalFrame.cuentacontagastodepres= new ArrayList<CuentaContaGastoDepre>();
							}
							//ARCHITECTURE	
						} else {
							
							

							if(this.jInternalFrameDetalleFormGastoDepreciacion.cuentacontagastodepreBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormGastoDepreciacion.cuentacontagastodepreBeanSwingJInternalFrame.conTotales) {this.jInternalFrameDetalleFormGastoDepreciacion.cuentacontagastodepreBeanSwingJInternalFrame.quitarFilaTotales();}
							gastodepreciacionAux.setCuentaContaGastoDepres(this.jInternalFrameDetalleFormGastoDepreciacion.cuentacontagastodepreBeanSwingJInternalFrame.cuentacontagastodepreLogic.getCuentaContaGastoDepres());
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								if(this.gastodepreciacionSessionBean.getEstaModoGuardarRelaciones() 
									|| this.gastodepreciacionSessionBean.getEsGuardarRelacionado())	{
									actualizarLista(gastodepreciacionAux,gastodepreciacionLogic.getGastoDepreciacions());
								}
							} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
								actualizarLista(gastodepreciacionAux,gastodepreciacions);
							}
							//ARCHITECTURE
							
							//AQUI EL ID NEGATIVO ES EL ID BUSCADO, YA QUE NO SE GENERA OTRO EN LA DB POR INGRESAR UNO NUEVO
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							//this.bugActualizarReferenciaActual(this.gastodepreciacion,gastodepreciacionAux);												
						}
					}
				}
			} else if(maintenanceType==MaintenanceType.ACTUALIZAR) {
				gastodepreciacionAux=new  GastoDepreciacion();
				
				//PUEDE QUE SE ACTUALIZE ALGUN REGISTRO NUEVO
				if(!this.gastodepreciacionSessionBean.getEsGuardarRelacionado() 
					|| (this.gastodepreciacionSessionBean.getEsGuardarRelacionado() && this.gastodepreciacion.getId()>=0)) {
						
					gastodepreciacionAux.setIsNew(false);
				}
				
				gastodepreciacionAux.setIsDeleted(false);
			
				gastodepreciacionAux.setId(this.gastodepreciacion.getId());	
				gastodepreciacionAux.setVersionRow(this.gastodepreciacion.getVersionRow());	
				gastodepreciacionAux.setid_empresa(this.gastodepreciacion.getid_empresa());	
				gastodepreciacionAux.setid_detalle_grupo_activo_fijo(this.gastodepreciacion.getid_detalle_grupo_activo_fijo());	
				gastodepreciacionAux.setanio(this.gastodepreciacion.getanio());	
				gastodepreciacionAux.setvalor(this.gastodepreciacion.getvalor());	
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(gastodepreciacionAux,gastodepreciacionLogic.getGastoDepreciacions());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(gastodepreciacionAux,gastodepreciacions);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote && !this.gastodepreciacionSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.gastodepreciacionSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						gastodepreciacionLogic.saveGastoDepreciacions();//WithConnection
						//gastodepreciacionLogic.getSetVersionRowGastoDepreciacions();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}	
					//ARCHITECTURE
					
					//TALVEZ ESTA DEMAS POR SER UPDATE
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.gastodepreciacion,gastodepreciacionAux);
					
					this.refrescarForeignKeysDescripcionesGastoDepreciacion();
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.gastodepreciacionSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
							this.jInternalFrameDetalleFormGastoDepreciacion.cuentacontagastodepreBeanSwingJInternalFrame.cuentacontagastodepreLogic.getCuentaContaGastoDepres().addAll(this.jInternalFrameDetalleFormGastoDepreciacion.cuentacontagastodepreBeanSwingJInternalFrame.cuentacontagastodepresEliminados);
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
							this.jInternalFrameDetalleFormGastoDepreciacion.cuentacontagastodepreBeanSwingJInternalFrame.cuentacontagastodepres.addAll(this.jInternalFrameDetalleFormGastoDepreciacion.cuentacontagastodepreBeanSwingJInternalFrame.cuentacontagastodepresEliminados);
						}
						//ARCHITECTURE
						
						if(!this.gastodepreciacionSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
								if(this.jInternalFrameDetalleFormGastoDepreciacion.cuentacontagastodepreBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormGastoDepreciacion.cuentacontagastodepreBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormGastoDepreciacion.cuentacontagastodepreBeanSwingJInternalFrame.quitarFilaTotales();*/}
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
								if(this.jInternalFrameDetalleFormGastoDepreciacion.cuentacontagastodepreBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormGastoDepreciacion.cuentacontagastodepreBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormGastoDepreciacion.cuentacontagastodepreBeanSwingJInternalFrame.quitarFilaTotales();*/}	
							}
							//ARCHITECTURE
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								gastodepreciacionLogic.saveGastoDepreciacionRelaciones(gastodepreciacionAux,this.jInternalFrameDetalleFormGastoDepreciacion.cuentacontagastodepreBeanSwingJInternalFrame.cuentacontagastodepreLogic.getCuentaContaGastoDepres());//WithConnection
								//gastodepreciacionLogic.getSetVersionRowGastoDepreciacions();//WithConnection
							} else if(Constantes.ISUSAEJBREMOTE) {
							} else if(Constantes.ISUSAEJBHOME) {
							}
							//ARCHITECTURE
							
							//TALVEZ ESTA DEMAS POR SER UPDATE
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							this.bugActualizarReferenciaActual(this.gastodepreciacion,gastodepreciacionAux);
					
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								
							this.jInternalFrameDetalleFormGastoDepreciacion.cuentacontagastodepreBeanSwingJInternalFrame.cuentacontagastodepreLogic.setCuentaContaGastoDepres(new ArrayList<CuentaContaGastoDepre>());
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							this.jInternalFrameDetalleFormGastoDepreciacion.cuentacontagastodepreBeanSwingJInternalFrame.cuentacontagastodepres= new ArrayList<CuentaContaGastoDepre>();
							}
							//ARCHITECTURE
						} else {
							
							

							if(this.jInternalFrameDetalleFormGastoDepreciacion.cuentacontagastodepreBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormGastoDepreciacion.cuentacontagastodepreBeanSwingJInternalFrame.conTotales) {this.jInternalFrameDetalleFormGastoDepreciacion.cuentacontagastodepreBeanSwingJInternalFrame.quitarFilaTotales();}
							gastodepreciacionAux.setCuentaContaGastoDepres(this.jInternalFrameDetalleFormGastoDepreciacion.cuentacontagastodepreBeanSwingJInternalFrame.cuentacontagastodepreLogic.getCuentaContaGastoDepres());
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								if(this.gastodepreciacionSessionBean.getEstaModoGuardarRelaciones() 
									|| this.gastodepreciacionSessionBean.getEsGuardarRelacionado())	{
									actualizarLista(gastodepreciacionAux,gastodepreciacionLogic.getGastoDepreciacions());
								}
							} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
								actualizarLista(gastodepreciacionAux,gastodepreciacions);
							}
							//ARCHITECTURE
							
							//AQUI EL ID NEGATIVO ES EL ID BUSCADO, YA QUE NO SE GENERA OTRO EN LA DB POR INGRESAR UNO NUEVO							
							//TALVEZ ESTA DEMAS POR SER UPDATE
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							//this.bugActualizarReferenciaActual(this.gastodepreciacion,gastodepreciacionAux);
					
						}
					}
				}				
			} else if(maintenanceType==MaintenanceType.ELIMINAR) {
				gastodepreciacionAux=new  GastoDepreciacion();
				
				gastodepreciacionAux.setIsNew(false);
				gastodepreciacionAux.setIsChanged(false);
				
				gastodepreciacionAux.setIsDeleted(true);
				
				gastodepreciacionAux.setId(this.gastodepreciacion.getId());	
				gastodepreciacionAux.setVersionRow(this.gastodepreciacion.getVersionRow());	
				gastodepreciacionAux.setid_empresa(this.gastodepreciacion.getid_empresa());	
				gastodepreciacionAux.setid_detalle_grupo_activo_fijo(this.gastodepreciacion.getid_detalle_grupo_activo_fijo());	
				gastodepreciacionAux.setanio(this.gastodepreciacion.getanio());	
				gastodepreciacionAux.setvalor(this.gastodepreciacion.getvalor());	
				
				if(this.gastodepreciacionSessionBean.getEsGuardarRelacionado()) {
					//ELEMENTO ACTUAL NO SE HA INGRESADO AL SISTEMA, NO SE PUEDE ELIMINAR ALGO QUE NO EXISTE
					if(this.gastodepreciacionAux.getId()>=0) {	
						this.gastodepreciacionsEliminados.add(gastodepreciacionAux);											
					}
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					actualizarLista(gastodepreciacionAux,gastodepreciacionLogic.getGastoDepreciacions());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(gastodepreciacionAux,gastodepreciacions);
				}
				//ARCHITECTURE
				
				
				if(!isGuardarCambiosEnLote && !this.gastodepreciacionSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.gastodepreciacionSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						gastodepreciacionLogic.saveGastoDepreciacions();//WithConnection
						//gastodepreciacionLogic.getSetVersionRowGastoDepreciacions();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}	
					//ARCHITECTURE
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.gastodepreciacionSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
							this.jInternalFrameDetalleFormGastoDepreciacion.cuentacontagastodepreBeanSwingJInternalFrame.cuentacontagastodepreLogic.getCuentaContaGastoDepres().addAll(this.jInternalFrameDetalleFormGastoDepreciacion.cuentacontagastodepreBeanSwingJInternalFrame.cuentacontagastodepresEliminados);
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
							this.jInternalFrameDetalleFormGastoDepreciacion.cuentacontagastodepreBeanSwingJInternalFrame.cuentacontagastodepres.addAll(this.jInternalFrameDetalleFormGastoDepreciacion.cuentacontagastodepreBeanSwingJInternalFrame.cuentacontagastodepresEliminados);
						}
						//ARCHITECTURE
						
						
						if(!this.gastodepreciacionSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
								if(this.jInternalFrameDetalleFormGastoDepreciacion.cuentacontagastodepreBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormGastoDepreciacion.cuentacontagastodepreBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormGastoDepreciacion.cuentacontagastodepreBeanSwingJInternalFrame.quitarFilaTotales();*/}
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
								if(this.jInternalFrameDetalleFormGastoDepreciacion.cuentacontagastodepreBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormGastoDepreciacion.cuentacontagastodepreBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormGastoDepreciacion.cuentacontagastodepreBeanSwingJInternalFrame.quitarFilaTotales();*/}	
							}
							//ARCHITECTURE
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								gastodepreciacionLogic.saveGastoDepreciacionRelaciones(gastodepreciacionAux,this.jInternalFrameDetalleFormGastoDepreciacion.cuentacontagastodepreBeanSwingJInternalFrame.cuentacontagastodepreLogic.getCuentaContaGastoDepres());//WithConnection
								//gastodepreciacionLogic.getSetVersionRowGastoDepreciacions();//WithConnection
							} else if(Constantes.ISUSAEJBREMOTE) {
							} else if(Constantes.ISUSAEJBHOME) {
							}
							//ARCHITECTURE
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								
							this.jInternalFrameDetalleFormGastoDepreciacion.cuentacontagastodepreBeanSwingJInternalFrame.cuentacontagastodepreLogic.setCuentaContaGastoDepres(new ArrayList<CuentaContaGastoDepre>());
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							this.jInternalFrameDetalleFormGastoDepreciacion.cuentacontagastodepreBeanSwingJInternalFrame.cuentacontagastodepres= new ArrayList<CuentaContaGastoDepre>();
							}
							//ARCHITECTURE
						}
					}  else {
							
						

							if(this.jInternalFrameDetalleFormGastoDepreciacion.cuentacontagastodepreBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormGastoDepreciacion.cuentacontagastodepreBeanSwingJInternalFrame.conTotales) {this.jInternalFrameDetalleFormGastoDepreciacion.cuentacontagastodepreBeanSwingJInternalFrame.quitarFilaTotales();}
							gastodepreciacionAux.setCuentaContaGastoDepres(this.jInternalFrameDetalleFormGastoDepreciacion.cuentacontagastodepreBeanSwingJInternalFrame.cuentacontagastodepreLogic.getCuentaContaGastoDepres());
								
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							if(this.gastodepreciacionSessionBean.getEstaModoGuardarRelaciones() 
								|| this.gastodepreciacionSessionBean.getEsGuardarRelacionado())	{
								actualizarLista(gastodepreciacionAux,gastodepreciacionLogic.getGastoDepreciacions());
							}
						} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
							actualizarLista(gastodepreciacionAux,gastodepreciacions);
						}
						//ARCHITECTURE
					}
				}				
			} else if(maintenanceType==MaintenanceType.GUARDARCAMBIOS) {		
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.gastodepreciacionLogic.getGastoDepreciacions().addAll(this.gastodepreciacionsEliminados);
					
					gastodepreciacionLogic.saveGastoDepreciacions();//WithConnection
					//gastodepreciacionLogic.getSetVersionRowGastoDepreciacions();//WithConnection
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}	
				//ARCHITECTURE
				this.refrescarForeignKeysDescripcionesGastoDepreciacion();
				
				this.gastodepreciacionsEliminados= new ArrayList<GastoDepreciacion>();		
			}
			
			if(this.gastodepreciacionSessionBean.getEsGuardarRelacionado()) {
				 this.crearFilaTotales();
			}
			
			
									
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.gastodepreciacionSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				if(!this.isPostAccionSinMensaje) {
					JOptionPane.showMessageDialog(this,"Gasto Depreciacion GUARDADO CORRECTAMENTE","MANTENIMIENTO DE Gasto Depreciacion",JOptionPane.INFORMATION_MESSAGE);
					if(maintenanceType==MaintenanceType.NUEVO || maintenanceType==MaintenanceType.ACTUALIZAR) {
						//CUANDO ES NUEVO SE PIERDE REFERENCIA NO SE PORQUE
						this.gastodepreciacion=gastodepreciacionAux;
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
      		//this.finishProcessGastoDepreciacion();
      	}
		
	}	
	
	public void actualizarRelaciones(GastoDepreciacion gastodepreciacionLocal) throws Exception {
		
		if(this.gastodepreciacionSessionBean.getConGuardarRelaciones()) {			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
			
				gastodepreciacionLocal.setCuentaContaGastoDepres(this.jInternalFrameDetalleFormGastoDepreciacion.cuentacontagastodepreBeanSwingJInternalFrame.cuentacontagastodepreLogic.getCuentaContaGastoDepres());
			
			} else {
			
				gastodepreciacionLocal.setCuentaContaGastoDepres(this.jInternalFrameDetalleFormGastoDepreciacion.cuentacontagastodepreBeanSwingJInternalFrame.cuentacontagastodepres);	
			}
		}
	}
	
	public void actualizarRelacionFkPadreActual(GastoDepreciacion gastodepreciacionLocal) throws Exception {	
		if(this.gastodepreciacionSessionBean.getEsGuardarRelacionado()) {			
			
		
			if(this.jInternalFrameParent.getClass().equals(EmpresaDetalleFormJInternalFrame.class)) {
				EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrameLocal=(EmpresaBeanSwingJInternalFrame) ((EmpresaDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				empresaBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoEmpresa(empresaBeanSwingJInternalFrameLocal.getempresa(),true);
				empresaBeanSwingJInternalFrameLocal.actualizarLista(empresaBeanSwingJInternalFrameLocal.empresa,this.empresasForeignKey);

				empresaBeanSwingJInternalFrameLocal.actualizarRelaciones(empresaBeanSwingJInternalFrameLocal.empresa);

				gastodepreciacionLocal.setEmpresa(empresaBeanSwingJInternalFrameLocal.empresa);

				this.addItemDefectoCombosForeignKeyEmpresa();
				this.cargarCombosFrameEmpresasForeignKey("Formulario");
				this.setActualEmpresaForeignKey(empresaBeanSwingJInternalFrameLocal.empresa.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(DetalleGrupoActivoFijoDetalleFormJInternalFrame.class)) {
				DetalleGrupoActivoFijoBeanSwingJInternalFrame detallegrupoactivofijoBeanSwingJInternalFrameLocal=(DetalleGrupoActivoFijoBeanSwingJInternalFrame) ((DetalleGrupoActivoFijoDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				detallegrupoactivofijoBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoDetalleGrupoActivoFijo(detallegrupoactivofijoBeanSwingJInternalFrameLocal.getdetallegrupoactivofijo(),true);
				detallegrupoactivofijoBeanSwingJInternalFrameLocal.actualizarLista(detallegrupoactivofijoBeanSwingJInternalFrameLocal.detallegrupoactivofijo,this.detallegrupoactivofijosForeignKey);

				detallegrupoactivofijoBeanSwingJInternalFrameLocal.actualizarRelaciones(detallegrupoactivofijoBeanSwingJInternalFrameLocal.detallegrupoactivofijo);

				gastodepreciacionLocal.setDetalleGrupoActivoFijo(detallegrupoactivofijoBeanSwingJInternalFrameLocal.detallegrupoactivofijo);

				this.addItemDefectoCombosForeignKeyDetalleGrupoActivoFijo();
				this.cargarCombosFrameDetalleGrupoActivoFijosForeignKey("Formulario");
				this.setActualDetalleGrupoActivoFijoForeignKey(detallegrupoactivofijoBeanSwingJInternalFrameLocal.detallegrupoactivofijo.getId(),false,"Formulario");
			}
		
		}
	}
	
	public Boolean validarGastoDepreciacionActual() throws Exception {
		Boolean estaValidado=false;
		this.inicializarInvalidValues();
		
		/*
		int intSelectedRow = this.jTableDatosGastoDepreciacion.getSelectedRow();
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.gastodepreciacion =(GastoDepreciacion) this.gastodepreciacionLogic.getGastoDepreciacions().toArray()[this.jTableDatosGastoDepreciacion.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
			this.gastodepreciacion =(GastoDepreciacion) this.gastodepreciacions.toArray()[this.jTableDatosGastoDepreciacion.convertRowIndexToModel(intSelectedRow)];
		}
		//ARCHITECTURE
		*/
		
		this.invalidValues = gastodepreciacionValidator.getInvalidValues(this.gastodepreciacion);
					
		if(this.invalidValues==null || this.invalidValues.length<=0) {
			estaValidado=true;
		} else {
			this.mostrarInvalidValues();	
		}
		
		return estaValidado;
	}
	
	public void actualizarLista(GastoDepreciacion gastodepreciacion,List<GastoDepreciacion> gastodepreciacions) throws Exception {
		try	{		
			GastoDepreciacionConstantesFunciones.actualizarLista(gastodepreciacion,gastodepreciacions,this.gastodepreciacionSessionBean.getEsGuardarRelacionado());		
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void actualizarSelectedLista(GastoDepreciacion gastodepreciacion,List<GastoDepreciacion> gastodepreciacions) throws Exception {
		try	{			
			GastoDepreciacionConstantesFunciones.actualizarSelectedLista(gastodepreciacion,gastodepreciacions);
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public Boolean tieneElementosSeleccionados() throws Exception {
		Boolean tiene=false;
		
		List<GastoDepreciacion> gastodepreciacionsLocal=null;
		
		try	{			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				gastodepreciacionsLocal=this.gastodepreciacionLogic.getGastoDepreciacions();
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				gastodepreciacionsLocal=this.gastodepreciacions;
			}
			//ARCHITECTURE
		
			for(GastoDepreciacion gastodepreciacionLocal:gastodepreciacionsLocal) {
				if(this.permiteMantenimiento(gastodepreciacionLocal) && gastodepreciacionLocal.getIsSelected()) {
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
			sMensaje+="\r\n"+GastoDepreciacionConstantesFunciones.getGastoDepreciacionLabelDesdeNombre(invalidValue.getPropertyName())+"->"+invalidValue.getMessage();
			
			//MOSTRAR CAMPOS INVALIDOS
			if(invalidValue.getPropertyName().equals(GastoDepreciacionConstantesFunciones.IDEMPRESA)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormGastoDepreciacion.jLabelid_empresaGastoDepreciacion,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(GastoDepreciacionConstantesFunciones.IDDETALLEGRUPOACTIVOFIJO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormGastoDepreciacion.jLabelid_detalle_grupo_activo_fijoGastoDepreciacion,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(GastoDepreciacionConstantesFunciones.ANIO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormGastoDepreciacion.jLabelanioGastoDepreciacion,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(GastoDepreciacionConstantesFunciones.VALOR)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormGastoDepreciacion.jLabelvalorGastoDepreciacion,invalidValue.getMessage());}
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
		
		if(this.jInternalFrameDetalleFormGastoDepreciacion!=null) {
		
		//MOSTRAR CAMPOS INVALIDOS
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormGastoDepreciacion.jLabelid_empresaGastoDepreciacion,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormGastoDepreciacion.jLabelid_detalle_grupo_activo_fijoGastoDepreciacion,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormGastoDepreciacion.jLabelanioGastoDepreciacion,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormGastoDepreciacion.jLabelvalorGastoDepreciacion,"");
		
		}
	}
	
	
	
	public void actualizarObjetoPadreFk(String sTipo)  throws Exception {
		if(sTipo.equals("XXXAuxiliar")) {
		
		}
		
		 else  if(sTipo.equals("CuentaContaGastoDepre")) {
			if(this.gastodepreciacion==null) {
				this.gastodepreciacion= new GastoDepreciacion();
			}

			if(this.gastodepreciacionSessionBean.getConGuardarRelaciones()) { //&& this.isEsNuevoGastoDepreciacion
				this.setVariablesFormularioToObjetoActualGastoDepreciacion(this.gastodepreciacion,true);//false
				this.setVariablesFormularioToObjetoActualForeignKeysGastoDepreciacion(this.gastodepreciacion);

				this.jInternalFrameDetalleFormGastoDepreciacion.cuentacontagastodepreBeanSwingJInternalFrame.getcuentacontagastodepre().setGastoDepreciacion(this.gastodepreciacion);
			}

			return;
		}
	}
	
	public void nuevoPreparar() throws Exception {
		this.nuevoPreparar(false);
	}
	
	public void nuevoPreparar(Boolean esNuevoGuardarCambios) throws Exception {
		this.iIdNuevoGastoDepreciacion--;	
		
		
		this.gastodepreciacionAux=new GastoDepreciacion();
		
		this.gastodepreciacionAux.setId(this.iIdNuevoGastoDepreciacion);
		this.gastodepreciacionAux.setIsChanged(true);
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.gastodepreciacionLogic.getGastoDepreciacions().add(this.gastodepreciacionAux);
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.gastodepreciacions.add(this.gastodepreciacionAux);
		}
		//ARCHITECTURE
		
		this.gastodepreciacion=this.gastodepreciacionAux;
		
		if(GastoDepreciacionJInternalFrame.ISBINDING_MANUAL_TABLA) {
			this.setVariablesObjetoActualToFormularioGastoDepreciacion(this.gastodepreciacion);
			this.setVariablesObjetoActualToFormularioForeignKeyGastoDepreciacion(this.gastodepreciacion);
		}
				
		//this.setDefaultControlesGastoDepreciacion();
		
		this.inicializarInvalidValues();
				
		//SELECCIONA ITEM DEFECTO-->SET O SELECTED INDEX
		this.setItemDefectoCombosForeignKeyGastoDepreciacion();
		
		
		//INICIALIZA VARIABLES COMBOS GLOBALES A FORMULARIO(ParametroGeneralUsuario)
		this.setVariablesGlobalesCombosForeignKeyGastoDepreciacion();
		
		//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
		//this.setVariablesGlobalesAuxiliaresCombosForeignKeyGastoDepreciacion();
		
		//SI TIENE FOREIGN KEY CON CAMPO esDefecto=true, SE ACTUALIZA A OBJETO ACTUAL
		this.setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualGastoDepreciacion(this.gastodepreciacionBean,this.gastodepreciacion,false,false);
		
		//ACTUALIZA VALORES PARA EL OBJETO ACTUAL ANTES DE ENVIARLO A ACTUALIZAR
		this.setVariablesFormularioToObjetoActualForeignKeysGastoDepreciacion(this.gastodepreciacion);
				
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		if(this.jInternalFrameParent!=null) {
			this.jInternalFrameParent.actualizarObjetoPadreFk(GastoDepreciacionConstantesFunciones.CLASSNAME);
		}	
		
		
		if(this.gastodepreciacionSessionBean.getConGuardarRelaciones()) {
			classes=GastoDepreciacionConstantesFunciones.getClassesRelationshipsOfGastoDepreciacion(new ArrayList<Classe>(),DeepLoadType.NONE);
		}
		
		this.classesActual=new ArrayList<Classe>();
		this.classesActual.addAll(classes);
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {						
			this.gastodepreciacionReturnGeneral=gastodepreciacionLogic.procesarEventosGastoDepreciacionsWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,EventoGlobalTipo.FORM_RECARGAR,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.gastodepreciacionLogic.getGastoDepreciacions(),this.gastodepreciacion,this.gastodepreciacionParameterGeneral,this.isEsNuevoGastoDepreciacion,classes);//this.gastodepreciacionLogic.getGastoDepreciacion()
						
		} else if(Constantes.ISUSAEJBREMOTE) {
						
		} else if(Constantes.ISUSAEJBHOME) {
		}
		//ARCHITECTURE
		
		//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
		//this.setVariablesObjetoReturnGeneralToBeanGastoDepreciacion(this.gastodepreciacionReturnGeneral,this.gastodepreciacionBean,false);
		
		if(this.gastodepreciacionReturnGeneral.getConRecargarPropiedades()) {
			//INICIALIZA VARIABLES COMBOS NORMALES (FK)
			this.setVariablesObjetoActualToFormularioForeignKeyGastoDepreciacion(this.gastodepreciacionReturnGeneral.getGastoDepreciacion());
			
			//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
			this.setVariablesObjetoActualToFormularioGastoDepreciacion(this.gastodepreciacionReturnGeneral.getGastoDepreciacion());
		}
		
		if(this.gastodepreciacionReturnGeneral.getConRecargarRelaciones()) {
			//INICIALIZA VARIABLES RELACIONES A FORMULARIO
			this.setVariablesRelacionesObjetoActualToFormularioGastoDepreciacion(this.gastodepreciacionReturnGeneral.getGastoDepreciacion(),classes);//this.gastodepreciacionBean);	
		}
			
		//ACTUALIZA VARIABLES FORMULARIO A OBJETO ACTUAL (PARA NUEVO TABLA O GUARDAR CAMBIOS
		if(esNuevoGuardarCambios) {
			this.setVariablesFormularioToObjetoActualGastoDepreciacion(this.gastodepreciacion,false);
		}
		
		//INICIALIZA VARIABLES COMBOS DEFAULT DEL PROYECTO(|DEFAULT para FK)
		//this.setVariablesDefaultCombosForeignKeyGastoDepreciacion();
		
		//INICIALIZA VARIABLES COMBOS PARAMETRO DEL PROYECTO(|VALORPARAM Era para ParametroModulo, ahora en logic)
		//this.setVariablesParametroCombosForeignKeyGastoDepreciacion();						
		
		if(!esNuevoGuardarCambios) {
			//INICIALIZA VARIABLES POR OPCION MENU
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			GastoDepreciacionBeanSwingJInternalFrameAdditional.RecargarFormGastoDepreciacion(this,"NUEVO_PREPARAR","",this.arrDatoGeneral);
		
			//NO FUNCIONA BINDINGS			
			this.inicializarActualizarBindingGastoDepreciacion(false);
						
			if(gastodepreciacionSessionBean.getConGuardarRelaciones()) {
				//DEBERIA YA ESTAR CARGADO LOS COMBOS Y SI SE NECESITA ALGO MAS SE DEBE CREAR FUNCION LIMITADA
				//SI DEBE TRAER Y RESETEAR TABLA
				

				if(this.jInternalFrameDetalleFormGastoDepreciacion.cuentacontagastodepreBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormGastoDepreciacion.cuentacontagastodepreBeanSwingJInternalFrame.cuentacontagastodepreSessionBean.getEsGuardarRelacionado() && CuentaContaGastoDepreJInternalFrame.ESTA_CARGADO_PORPARTE) {
					this.jButtonCuentaContaGastoDepreActionPerformed(null,-1,false,true,null);
				}				
			}
				
			//SI ES MANUAL
			if(GastoDepreciacionJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualGastoDepreciacion();
			}
			
			this.actualizarVisualTableDatosGastoDepreciacion();
			
			this.jTableDatosGastoDepreciacion.setRowSelectionInterval(this.getIndiceNuevoGastoDepreciacion(), this.getIndiceNuevoGastoDepreciacion());
			
			this.seleccionarFilaTablaGastoDepreciacionActual();
						
			this.actualizarEstadoCeldasBotonesGastoDepreciacion("a", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		}		
	}
	
	public void habilitarDeshabilitarControlesGastoDepreciacion(Boolean isHabilitar) throws Exception {
		
		this.jInternalFrameDetalleFormGastoDepreciacion.jTextFieldanioGastoDepreciacion.setEnabled(isHabilitar && this.gastodepreciacionConstantesFunciones.activaranioGastoDepreciacion);
		this.jInternalFrameDetalleFormGastoDepreciacion.jTextFieldvalorGastoDepreciacion.setEnabled(isHabilitar && this.gastodepreciacionConstantesFunciones.activarvalorGastoDepreciacion);	
		//
		this.jInternalFrameDetalleFormGastoDepreciacion.jComboBoxid_empresaGastoDepreciacion.setEnabled(isHabilitar && this.gastodepreciacionConstantesFunciones.activarid_empresaGastoDepreciacion);
		this.jInternalFrameDetalleFormGastoDepreciacion.jComboBoxid_detalle_grupo_activo_fijoGastoDepreciacion.setEnabled(isHabilitar && this.gastodepreciacionConstantesFunciones.activarid_detalle_grupo_activo_fijoGastoDepreciacion);
	};
	
	public void setDefaultControlesGastoDepreciacion() throws Exception {
			
	};
	
	
	public void habilitarDeshabilitarTipoMantenimientoGastoDepreciacion(Boolean esRelaciones) throws Exception {
		if(esRelaciones) {
			//this.gastodepreciacionSessionBean.setConGuardarRelaciones(true);			
			this.gastodepreciacionSessionBean.setEstaModoGuardarRelaciones(true);				
			this.jInternalFrameDetalleFormGastoDepreciacion.jTabbedPaneRelacionesGastoDepreciacion.setVisible(true);
			
			

			if(this.jInternalFrameDetalleFormGastoDepreciacion.cuentacontagastodepreBeanSwingJInternalFrame!=null) {
				this.jInternalFrameDetalleFormGastoDepreciacion.cuentacontagastodepreBeanSwingJInternalFrame.cuentacontagastodepreSessionBean.setEsGuardarRelacionado(true);
				//this.jInternalFrameDetalleFormGastoDepreciacion.cuentacontagastodepreBeanSwingJInternalFrame.getContentPane().setVisible(true);
			}		
		} else {
			//this.gastodepreciacionSessionBean.setConGuardarRelaciones(false);			
			this.gastodepreciacionSessionBean.setEstaModoGuardarRelaciones(false);						
			this.jInternalFrameDetalleFormGastoDepreciacion.jTabbedPaneRelacionesGastoDepreciacion.setVisible(false);
			
			

			if(this.jInternalFrameDetalleFormGastoDepreciacion.cuentacontagastodepreBeanSwingJInternalFrame!=null) {
				this.jInternalFrameDetalleFormGastoDepreciacion.cuentacontagastodepreBeanSwingJInternalFrame.cuentacontagastodepreSessionBean.setEsGuardarRelacionado(false);
				//this.jInternalFrameDetalleFormGastoDepreciacion.cuentacontagastodepreBeanSwingJInternalFrame.getContentPane().setVisible(false);
			}
		}
	};
	
	public int getIndiceNuevoGastoDepreciacion() throws Exception {
		int iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(GastoDepreciacion gastodepreciacionAux:this.gastodepreciacionLogic.getGastoDepreciacions()) {
				if(gastodepreciacionAux.getId().equals(this.iIdNuevoGastoDepreciacion)) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(GastoDepreciacion gastodepreciacionAux:this.gastodepreciacions) {
				if(gastodepreciacionAux.getId().equals(this.iIdNuevoGastoDepreciacion)) {
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
	
	public int getIndiceActualGastoDepreciacion(GastoDepreciacion gastodepreciacion,Integer iIndiceActual) throws Exception {
		Integer iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(GastoDepreciacion gastodepreciacionAux:this.gastodepreciacionLogic.getGastoDepreciacions()) {
				if(gastodepreciacionAux.getId().equals(gastodepreciacion.getId())) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(GastoDepreciacion gastodepreciacionAux:this.gastodepreciacions) {
				if(gastodepreciacionAux.getId().equals(gastodepreciacion.getId())) {
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
	
	public void setCamposBaseDesdeOriginalGastoDepreciacion(GastoDepreciacion gastodepreciacionOriginal) throws Exception {
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(GastoDepreciacion gastodepreciacionAux:this.gastodepreciacionLogic.getGastoDepreciacions()) {
				if(gastodepreciacionAux.getGastoDepreciacionOriginal().getId().equals(gastodepreciacionOriginal.getId())) {
					existe=true;
					gastodepreciacionOriginal.setId(gastodepreciacionAux.getId());
					gastodepreciacionOriginal.setVersionRow(gastodepreciacionAux.getVersionRow());
					break;
				}
				
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(GastoDepreciacion gastodepreciacionAux:this.gastodepreciacions) {
				if(gastodepreciacionAux.getGastoDepreciacionOriginal().getId().equals(gastodepreciacionOriginal.getId())) {
					existe=true;
					gastodepreciacionOriginal.setId(gastodepreciacionAux.getId());
					gastodepreciacionOriginal.setVersionRow(gastodepreciacionAux.getVersionRow());
					break;
				}				
			}
		}
		//ARCHITECTURE
		
		if(!existe) {
			//SI NO EXISTE TOMA LA ULTIMA FILA
		}
	}
	
	public void cancelarNuevosGastoDepreciacion(Boolean esParaCancelar) throws Exception {
		gastodepreciacionsAux=new ArrayList<GastoDepreciacion>();
		gastodepreciacionAux=new GastoDepreciacion();
		
		if(!this.gastodepreciacionSessionBean.getEsGuardarRelacionado()) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(GastoDepreciacion gastodepreciacionAux:this.gastodepreciacionLogic.getGastoDepreciacions()) {
					if(gastodepreciacionAux.getId()<0) {
						gastodepreciacionsAux.add(gastodepreciacionAux);
					}		
				}
				this.iIdNuevoGastoDepreciacion=0L;
				this.gastodepreciacionLogic.getGastoDepreciacions().removeAll(gastodepreciacionsAux);
					
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(GastoDepreciacion gastodepreciacionAux:this.gastodepreciacions) {
					if(gastodepreciacionAux.getId()<0) {
						gastodepreciacionsAux.add(gastodepreciacionAux);
					}		
				}
				this.iIdNuevoGastoDepreciacion=0L;
				this.gastodepreciacions.removeAll(gastodepreciacionsAux);
			}	
		} else {			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				if(esParaCancelar && this.isEsNuevoGastoDepreciacion 
					&& this.gastodepreciacionLogic.getGastoDepreciacions().size()>0
					) {
					gastodepreciacionAux=this.gastodepreciacionLogic.getGastoDepreciacions().get(this.gastodepreciacionLogic.getGastoDepreciacions().size() - 1);
				
					if(gastodepreciacionAux.getId()<0) {
						this.gastodepreciacionLogic.getGastoDepreciacions().remove(gastodepreciacionAux);
					}
				}
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				if(esParaCancelar && this.isEsNuevoGastoDepreciacion && this.gastodepreciacions.size()>0) {
					gastodepreciacionAux=this.gastodepreciacions.get(this.gastodepreciacions.size() - 1);
				
					if(gastodepreciacionAux.getId()<0) {
						this.gastodepreciacions.remove(gastodepreciacionAux);
					}
				}
			}	
		}
	}
	
	public void cancelarNuevoGastoDepreciacion(Boolean esParaCancelar) throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			if(gastodepreciacion.getId()<0) {
				this.gastodepreciacionLogic.getGastoDepreciacions().remove(this.gastodepreciacion);
			}					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			if(gastodepreciacion.getId()<0) {
				this.gastodepreciacions.remove(this.gastodepreciacion);
			}
		}			
	}
	
	public void setEstadosInicialesGastoDepreciacion(List<GastoDepreciacion> gastodepreciacionsAux) throws Exception {
		GastoDepreciacionConstantesFunciones.setEstadosInicialesGastoDepreciacion(gastodepreciacionsAux);
	}
	
	public void setEstadosInicialesGastoDepreciacion(GastoDepreciacion gastodepreciacionAux) throws Exception {
		GastoDepreciacionConstantesFunciones.setEstadosInicialesGastoDepreciacion(gastodepreciacionAux);		
	}
	
	public void nuevo() throws Exception {
		try	{
			//ESTA VALIDADO EN FUNCION ACTUALIZAR
			//if(this.validarGastoDepreciacionActual()) {
				this.ejecutarMantenimiento(MaintenanceType.NUEVO);
				
				this.actualizarEstadoCeldasBotonesGastoDepreciacion("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
				
			//}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,GastoDepreciacionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void actualizar() throws Exception {
		try	{
			if(this.validarGastoDepreciacionActual()) {
				if(!this.isEsNuevoGastoDepreciacion) {
					this.ejecutarMantenimiento(MaintenanceType.ACTUALIZAR);
					
					this.actualizarEstadoCeldasBotonesGastoDepreciacion("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
					
				} else {					
					this.nuevo();
					this.isEsNuevoGastoDepreciacion=false;
				}
				
				//SE CANCELA AL FINAL DEL PROCESO JBUTTONACTUALIZAR
				//this.cancelar(false);
			}		
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,GastoDepreciacionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void eliminar() throws Exception {
		try	{	
			if(this.validarGastoDepreciacionActual()) {
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE ELIMINAR EL/LA Gasto Depreciacion ?", "MANTENIMIENTO DE Gasto Depreciacion", JOptionPane.OK_CANCEL_OPTION) == 0) {
					this.ejecutarMantenimiento(MaintenanceType.ELIMINAR);			
					this.actualizarEstadoCeldasBotonesGastoDepreciacion("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
				}
			
			}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,GastoDepreciacionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void guardarCambios() throws Exception {
		try	{
			this.ejecutarMantenimiento(MaintenanceType.GUARDARCAMBIOS);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,GastoDepreciacionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarAsignar(GastoDepreciacion gastodepreciacion) throws Exception {
		GastoDepreciacionConstantesFunciones.seleccionarAsignar(this.gastodepreciacion,gastodepreciacion);
	}
	
	public void seleccionar() throws Exception {
		try	{
			//ACTUALIZO EL PERMISO ACTUALIZAR CON EL PERMISO ACTUALIZAR ORIGINAL ESTE PERMISO SE UTILIZA PARA EL NUEVO TAMBIEN
			this.isPermisoActualizarGastoDepreciacion=this.isPermisoActualizarOriginalGastoDepreciacion;
			
			
			this.seleccionarAsignar(gastodepreciacion);
			
			
			
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			GastoDepreciacionConstantesFunciones.quitarEspaciosGastoDepreciacion(this.gastodepreciacion,this.arrDatoGeneral);
			
			
			this.actualizarEstadoCeldasBotonesGastoDepreciacion("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,GastoDepreciacionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarBusqueda(Long id) throws Exception {
		try	{
			this.gastodepreciacionSessionBean.setsFuncionBusquedaRapida(this.gastodepreciacionSessionBean.getsFuncionBusquedaRapida().replace("TO_REPLACE", id.toString()));
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,GastoDepreciacionConstantesFunciones.CLASSNAME);
		}
	}
	
	
	
	public void cancelar() throws Exception {
		this.cancelar(true);
	}
	
	public void cancelar(Boolean esParaCancelar) throws Exception {
		try {
														
			
			//SE UTILIZA COLUMNA ELIMINAR EN TABLA
			if(this.isEsNuevoGastoDepreciacion) {
				//NO CANCELA TODOS NUEVOS POR FUNCIONALIDAD GUARDAR CAMBIOS
				//this.cancelarNuevosGastoDepreciacion(esParaCancelar);				
				this.cancelarNuevoGastoDepreciacion(esParaCancelar);								
			}
			
			this.gastodepreciacion=new GastoDepreciacion();
			
			this.inicializarGastoDepreciacion();
			
			this.actualizarEstadoCeldasBotonesGastoDepreciacion("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,GastoDepreciacionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void inicializarGastoDepreciacion() throws Exception {
		try {
			GastoDepreciacionConstantesFunciones.inicializarGastoDepreciacion(this.gastodepreciacion);
			
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
			FuncionesSwing.manageException(this, e,logger,GastoDepreciacionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void siguientes()throws Exception {
		try	{			
			if(this.gastodepreciacionLogic.getGastoDepreciacions().size()>0) {
					
				this.iNumeroPaginacionPagina=this.iNumeroPaginacionPagina+this.iNumeroPaginacion;
			}
				
			this.procesarBusqueda(this.sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,GastoDepreciacionConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void generarReporteGastoDepreciacions(String sAccionBusqueda,List<GastoDepreciacion> gastodepreciacionsParaReportes) throws Exception {
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
					sPathReporteFinal="GastoDepreciacion"+this.sTipoReporteExtra+"Design.jasper";
					reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);	
				} else {
					sPathReporteFinal=this.sPathReporteDinamico;
					reportFile = new FileInputStream(sPathReporteFinal);
				}
			} else {
				sPathReporteFinal="GastoDepreciacionMasterRelaciones"+this.sTipoReporteExtra+"Design.jasper";
				reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);
				//sPathReportes=reportFile.getPath().replace("GastoDepreciacionMasterRelacionesDesign.jasper", "");
			}
		} else {
				sPathReporteFinal="GastoDepreciacion"+this.sTipoReporteExtra+"Design.jasper";
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
		parameters.put("subtitulo", "Reporte De  Gasto Depreciaciones");		
		parameters.put("busquedapor", GastoDepreciacionConstantesFunciones.getNombreIndice(sAccionBusqueda)+sDetalleReporte);
		
		
		if(this.sTipoReporte.equals("RELACIONES")) {//isEsReporteRelaciones
			parameters.put("SUBREPORT_DIR", sPathReportes);
		}
		
		parameters.put("con_grafico", this.conGraficoReporte);
		
		JasperReport jasperReport = (JasperReport)JRLoader.loadObject(reportFile);
				
		this.cargarDatosCliente();
		
		ArrayList<Classe> classes=new ArrayList<Classe>();		
		
		if(this.sTipoReporte.equals("RELACIONES")) {//isEsReporteRelaciones
			
			classes.add(new Classe(CuentaContaGastoDepre.class));
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {		
				try	{
					
					GastoDepreciacionLogic gastodepreciacionLogicAuxiliar=new GastoDepreciacionLogic();
					gastodepreciacionLogicAuxiliar.setDatosCliente(gastodepreciacionLogic.getDatosCliente());				
					gastodepreciacionLogicAuxiliar.setGastoDepreciacions(gastodepreciacionsParaReportes);
					
					gastodepreciacionLogicAuxiliar.cargarRelacionesLoteForeignKeyGastoDepreciacionWithConnection(); //deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes, "");
					
					gastodepreciacionsParaReportes=gastodepreciacionLogicAuxiliar.getGastoDepreciacions();
					
					//gastodepreciacionLogic.getNewConnexionToDeep();
					
					//for (GastoDepreciacion gastodepreciacion:gastodepreciacionsParaReportes) {
					//	gastodepreciacionLogic.deepLoad(gastodepreciacion, false, DeepLoadType.INCLUDE, classes);
					//}						
					//gastodepreciacionLogic.commitNewConnexionToDeep();
					
						
				} catch(Exception e) {
					throw e;
					
				} finally {
					//gastodepreciacionLogic.closeNewConnexionToDeep();
				}
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
			//ARCHITECTURE		
			
		
			
			

			InputStream reportFileCuentaContaGastoDepre = AuxiliarReportes.class.getResourceAsStream("CuentaContaGastoDepreDetalleRelacionesDesign.jasper");
			parameters.put("subreport_cuentacontagastodepre", reportFileCuentaContaGastoDepre);
		} else {
			//FK DEBERIA TRAERSE DE ANTEMANO
			
		}
								
		
		//CLASSES PARA REPORTES OBJETOS RELACIONADOS
		if(!this.sTipoReporte.equals("RELACIONES")) {//!isEsReporteRelaciones
			classes=new ArrayList<Classe>();
		}
		
		JRBeanArrayDataSource jrbeanArrayDataSourceGastoDepreciacion=null;
		
		if(this.sTipoReporteExtra!=null && !this.sTipoReporteExtra.equals("")) {
			GastoDepreciacionConstantesFunciones.S_TIPOREPORTE_EXTRA=this.sTipoReporteExtra;
		} else {
			GastoDepreciacionConstantesFunciones.S_TIPOREPORTE_EXTRA="";
		}
		
		jrbeanArrayDataSourceGastoDepreciacion=new JRBeanArrayDataSource(GastoDepreciacionJInternalFrame.TraerGastoDepreciacionBeans(gastodepreciacionsParaReportes,classes).toArray());
		
		jasperPrint = JasperFillManager.fillReport(jasperReport,parameters,jrbeanArrayDataSourceGastoDepreciacion);
				
		
		String sPathDest=Constantes.SUNIDAD_ARCHIVOS+":/"+Constantes.SCONTEXTSERVER+"/"+GastoDepreciacionConstantesFunciones.SCHEMA+"/reportes";
		
		File filePathDest = new File(sPathDest);
		
		if(!filePathDest.exists()) {
			filePathDest.mkdirs();				
		}
				
		String sDestFileName=sPathDest+"/"+GastoDepreciacionConstantesFunciones.CLASSNAME;
				
		if(this.sTipoArchivoReporte=="VISUALIZAR") {
			JasperViewer jasperViewer = new JasperViewer(jasperPrint,false) ;
			jasperViewer.setVisible(true) ; 

		} else if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML") {	
			//JasperFillManager.fillReportToFile(reportFile.getAbsolutePath(),parameters, new JRBeanArrayDataSource(GastoDepreciacionBean.TraerGastoDepreciacionBeans(gastodepreciacionsParaReportes).toArray()));
							
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
				this.generarExcelReporteGastoDepreciacions(sAccionBusqueda,sTipoArchivoReporte,gastodepreciacionsParaReportes);
			
			} else if(this.sTipoReporte.equals("FORMULARIO")){
				this.generarExcelReporteVerticalGastoDepreciacions(sAccionBusqueda,sTipoArchivoReporte,gastodepreciacionsParaReportes,false);
			
			} else if(this.sTipoReporte.equals("DINAMICO")){
				
				if(this.sTipoReporteDinamico.equals("NORMAL")) {
					
					this.jButtonGenerarExcelReporteDinamicoGastoDepreciacionActionPerformed(null);
					//this.generarExcelReporteGastoDepreciacions(sAccionBusqueda,sTipoArchivoReporte,gastodepreciacionsParaReportes);
					
				
				} else if(this.sTipoReporteDinamico.equals("FORMULARIO")){
					this.generarExcelReporteVerticalGastoDepreciacions(sAccionBusqueda,sTipoArchivoReporte,gastodepreciacionsParaReportes,true);
				
				} else if(this.sTipoReporteDinamico.equals("RELACIONES")){
					this.generarExcelReporteRelacionesGastoDepreciacions(sAccionBusqueda,sTipoArchivoReporte,gastodepreciacionsParaReportes,true);
				}
				
			} else if(this.sTipoReporte.equals("RELACIONES")){
				this.generarExcelReporteRelacionesGastoDepreciacions(sAccionBusqueda,sTipoArchivoReporte,gastodepreciacionsParaReportes,false);
			}
		}
		
		if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML"||this.sTipoArchivoReporte=="WORD"||this.sTipoArchivoReporte=="EXCEL") {				
			JOptionPane.showMessageDialog(this,"REPORTE "+sDestFileName+" GENERADO SATISFACTORIAMENTE","REPORTES ",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteGastoDepreciacions(String sAccionBusqueda,String sTipoArchivoReporte,List<GastoDepreciacion> gastodepreciacionsParaReportes) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"gastodepreciacion";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("GastoDepreciacions");
         
        int iRow = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderGastoDepreciacion("NORMAL",row,workbook);
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux=null;
		
		int i=0;
		
      	for(GastoDepreciacion gastodepreciacion : gastodepreciacionsParaReportes) {            
			row = sheet.createRow(iRow++);
			iCell = 0;
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				cellStyleDataAux=cellStyleData;
			}
			
			GastoDepreciacionConstantesFunciones.generarExcelReporteDataGastoDepreciacion("NORMAL",row,workbook,gastodepreciacion,cellStyleDataAux);
		
			
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
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.gastodepreciacionSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Gasto Depreciacion",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteHeaderGastoDepreciacion(String sTipo,Row row,Workbook workbook) {
		
		GastoDepreciacionConstantesFunciones.generarExcelReporteHeaderGastoDepreciacion(sTipo,row,workbook);
		
		/*
		Cell cell=null;
		int iCell=0;
		
		CellStyle cellStyle = workbook.createCellStyle();
		cellStyle.setFillBackgroundColor(IndexedColors.GREEN.getIndex());
		cellStyle.setFillPattern(CellStyle.ALIGN_FILL);
		*/
		
	}
	
	public void generarExcelReporteVerticalGastoDepreciacions(String sAccionBusqueda,String sTipoArchivoReporte,List<GastoDepreciacion> gastodepreciacionsParaReportes,Boolean paraDinamico) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"gastodepreciacion_vertical";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("GastoDepreciacions");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		CellStyle cellStyle = Funciones2.getStyleTitulo(workbook,"ZEBRA");;
		
		CellStyle cellStyleTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL_VERTICAL");
		
		
		for(GastoDepreciacion gastodepreciacion : gastodepreciacionsParaReportes) {
			row = sheet.createRow(iRow++);
			iRowLast=iRow - 1;
			
			cell = row.createCell(0);
			cell.setCellValue(GastoDepreciacionConstantesFunciones.getGastoDepreciacionDescripcion(gastodepreciacion));
			cell.setCellStyle(cellStyleTitulo);
			
			sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
	
			


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(GastoDepreciacionConstantesFunciones.LABEL_IDEMPRESA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(GastoDepreciacionConstantesFunciones.LABEL_IDEMPRESA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(gastodepreciacion.getempresa_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(GastoDepreciacionConstantesFunciones.LABEL_IDDETALLEGRUPOACTIVOFIJO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(GastoDepreciacionConstantesFunciones.LABEL_IDDETALLEGRUPOACTIVOFIJO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(gastodepreciacion.getdetallegrupoactivofijo_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(GastoDepreciacionConstantesFunciones.LABEL_ANIO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(GastoDepreciacionConstantesFunciones.LABEL_ANIO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(gastodepreciacion.getanio());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(GastoDepreciacionConstantesFunciones.LABEL_VALOR))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(GastoDepreciacionConstantesFunciones.LABEL_VALOR);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(gastodepreciacion.getvalor());


			}						
        }
        
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.gastodepreciacionSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Gasto Depreciacion",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteRelacionesGastoDepreciacions(String sAccionBusqueda,String sTipoArchivoReporte,List<GastoDepreciacion> gastodepreciacionsParaReportes,Boolean paraDinamico) throws Exception {
		
		ArrayList<Classe> classes=new ArrayList<Classe>();
		List<GastoDepreciacion> gastodepreciacionsRespaldo=null;
		
		classes=GastoDepreciacionConstantesFunciones.getClassesRelationshipsOfGastoDepreciacion(new ArrayList<Classe>(),DeepLoadType.NONE,false);
					
		this.datosDeep=new DatosDeep();
		
		this.datosDeep.setIsDeep(false);
		this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
		this.datosDeep.setClases(classes);
			
		this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
		this.datosCliente.setIsConDeep(true);	
		this.datosCliente.setIsConExportar(false);
		
						
		this.gastodepreciacionLogic.setDatosCliente(this.datosCliente);
		this.gastodepreciacionLogic.setDatosDeep(this.datosDeep);
		this.gastodepreciacionLogic.setIsConDeep(true);
		
		gastodepreciacionsRespaldo=this.gastodepreciacionLogic.getGastoDepreciacions();
		
		this.gastodepreciacionLogic.setGastoDepreciacions(gastodepreciacionsParaReportes);	
		this.gastodepreciacionLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
		
		gastodepreciacionsParaReportes=this.gastodepreciacionLogic.getGastoDepreciacions();
		this.gastodepreciacionLogic.setGastoDepreciacions(gastodepreciacionsRespaldo);
		
		
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"gastodepreciacion_relacion";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("GastoDepreciacions");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderGastoDepreciacion("NORMAL",row,workbook);
		
		int i=0;
		int i2=0;
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL");
		CellStyle cellStyleDataZebra = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux =null;
		CellStyle cellStyleDataAuxHijo =null;
		
		for(GastoDepreciacion gastodepreciacion : gastodepreciacionsParaReportes) {			
			if(i!=0) {
				row = sheet.createRow(iRow++);				
				this.generarExcelReporteHeaderGastoDepreciacion("NORMAL",row,workbook);
			}
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				//cellStyleDataAux=cellStyleData;
			}
			
			row = sheet.createRow(iRow++);						
			GastoDepreciacionConstantesFunciones.generarExcelReporteDataGastoDepreciacion("NORMAL",row,workbook,gastodepreciacion,cellStyleDataAux);
		
			
			


				//CuentaContaGastoDepre
			if(!paraDinamico || (paraDinamico && this.existeRelacionReporteDinamico(CuentaContaGastoDepreConstantesFunciones.SCLASSWEBTITULO))) {

				if(gastodepreciacion.getCuentaContaGastoDepres()!=null && gastodepreciacion.getCuentaContaGastoDepres().size()>0) {
					row = sheet.createRow(iRow++);

					iCell=1;iRowLast=iRow-1; cell = row.createCell(iCell++);cell.setCellStyle(cellStyleDataTitulo);sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,1,5));
					cell.setCellValue(CuentaContaGastoDepreConstantesFunciones.SCLASSWEBTITULO);

					row = sheet.createRow(iRow++);
					CuentaContaGastoDepreConstantesFunciones.generarExcelReporteHeaderCuentaContaGastoDepre("RELACIONADO",row,workbook);
				}

				if(gastodepreciacion.getCuentaContaGastoDepres()!=null) {
					i2=0;
					for(CuentaContaGastoDepre cuentacontagastodepre : gastodepreciacion.getCuentaContaGastoDepres()) {
						row = sheet.createRow(iRow++);

						cellStyleDataAuxHijo=null;
						if(i2%2==0) {
							cellStyleDataAuxHijo=cellStyleData;
						}

						CuentaContaGastoDepreConstantesFunciones.generarExcelReporteDataCuentaContaGastoDepre("RELACIONADO",row,workbook,cuentacontagastodepre,cellStyleDataAuxHijo);
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
		cell.setCellValue(GastoDepreciacionConstantesFunciones.getGastoDepreciacionDescripcion(gastodepreciacion));
		cell.setCellStyle(cellStyleTitulo);
			
		sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
		*/
		
			
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.gastodepreciacionSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Gasto Depreciacion",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	
	public Boolean existeColumnaReporteDinamico(String sColumna) {
		Boolean existe=false;
		
		Reporte reporte=new Reporte();
		
		
		for(int index:this.jInternalFrameReporteDinamicoGastoDepreciacion.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoGastoDepreciacion.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
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
		
		
		for(int index:this.jInternalFrameReporteDinamicoGastoDepreciacion.getjListRelacionesSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoGastoDepreciacion.getjListRelacionesSelectReporte().getModel().getElementAt(index);
			
			if(sColumna.equals(reporte.getsCodigo())) {
				existe=true;
				break;
			}
		
		}
		
		
		return existe;
	}
	
	public void startProcessGastoDepreciacion() throws Exception {		
		this.startProcessGastoDepreciacion(true);
	}
	
	public void startProcessGastoDepreciacion(Boolean conSplash) throws Exception {		
		//FuncionesSwing.enableDisablePanels(false,this.jTabbedPaneBusquedasGastoDepreciacion ,this.jPanelParametrosReportesGastoDepreciacion, this.jScrollPanelDatosGastoDepreciacion,this.jPanelPaginacionGastoDepreciacion, this.jScrollPanelDatosEdicionGastoDepreciacion, this.jPanelAccionesGastoDepreciacion,this.jPanelAccionesFormularioGastoDepreciacion,this.jmenuBarGastoDepreciacion,this.jmenuBarDetalleGastoDepreciacion,this.jTtoolBarGastoDepreciacion,this.jTtoolBarDetalleGastoDepreciacion);		
		
		final JTabbedPane jTabbedPaneBusquedasGastoDepreciacion=this.jTabbedPaneBusquedasGastoDepreciacion; 
		
		final JPanel jPanelParametrosReportesGastoDepreciacion=this.jPanelParametrosReportesGastoDepreciacion;
		//final JScrollPane jScrollPanelDatosGastoDepreciacion=this.jScrollPanelDatosGastoDepreciacion;
		final JTable jTableDatosGastoDepreciacion=this.jTableDatosGastoDepreciacion;		
		final JPanel jPanelPaginacionGastoDepreciacion=this.jPanelPaginacionGastoDepreciacion;
		//final JScrollPane jScrollPanelDatosEdicionGastoDepreciacion=this.jScrollPanelDatosEdicionGastoDepreciacion;
		final JPanel jPanelAccionesGastoDepreciacion=this.jPanelAccionesGastoDepreciacion;
		
		JPanel jPanelCamposAuxiliarGastoDepreciacion=new JPanelMe();
		JPanel jPanelAccionesFormularioAuxiliarGastoDepreciacion=new JPanelMe();
		
		if(this.jInternalFrameDetalleFormGastoDepreciacion!=null) {
			jPanelCamposAuxiliarGastoDepreciacion=this.jInternalFrameDetalleFormGastoDepreciacion.jPanelCamposGastoDepreciacion;
			jPanelAccionesFormularioAuxiliarGastoDepreciacion=this.jInternalFrameDetalleFormGastoDepreciacion.jPanelAccionesFormularioGastoDepreciacion;
		}
		
		final JPanel jPanelCamposGastoDepreciacion=jPanelCamposAuxiliarGastoDepreciacion;
		final JPanel jPanelAccionesFormularioGastoDepreciacion=jPanelAccionesFormularioAuxiliarGastoDepreciacion;
		
		
		final JMenuBar jmenuBarGastoDepreciacion=this.jmenuBarGastoDepreciacion;
		final JToolBar jTtoolBarGastoDepreciacion=this.jTtoolBarGastoDepreciacion;		
		
		
		JMenuBar jmenuBarDetalleAuxiliarGastoDepreciacion=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarGastoDepreciacion=new JToolBar();		
		
		if(this.jInternalFrameDetalleFormGastoDepreciacion!=null) {
			jmenuBarDetalleAuxiliarGastoDepreciacion=this.jInternalFrameDetalleFormGastoDepreciacion.jmenuBarDetalleGastoDepreciacion;
			jTtoolBarDetalleAuxiliarGastoDepreciacion=this.jInternalFrameDetalleFormGastoDepreciacion.jTtoolBarDetalleGastoDepreciacion;
		}
		
		final JMenuBar jmenuBarDetalleGastoDepreciacion=jmenuBarDetalleAuxiliarGastoDepreciacion;
		final JToolBar jTtoolBarDetalleGastoDepreciacion=jTtoolBarDetalleAuxiliarGastoDepreciacion;		
		
		
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasGastoDepreciacion;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesGastoDepreciacion;
			processRunnable.jTableDatos=jTableDatosGastoDepreciacion;
			processRunnable.jPanelCampos=jPanelCamposGastoDepreciacion;
			processRunnable.jPanelPaginacion=jPanelPaginacionGastoDepreciacion;
			processRunnable.jPanelAcciones=jPanelAccionesGastoDepreciacion;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioGastoDepreciacion;
			
			
			processRunnable.jmenuBar=jmenuBarGastoDepreciacion;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleGastoDepreciacion;
			processRunnable.jTtoolBar=jTtoolBarGastoDepreciacion;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleGastoDepreciacion;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasGastoDepreciacion ,jPanelParametrosReportesGastoDepreciacion,jTableDatosGastoDepreciacion, /*jScrollPanelDatosGastoDepreciacion,*/jPanelCamposGastoDepreciacion,jPanelPaginacionGastoDepreciacion, /*jScrollPanelDatosEdicionGastoDepreciacion,*/ jPanelAccionesGastoDepreciacion,jPanelAccionesFormularioGastoDepreciacion,jmenuBarGastoDepreciacion,jmenuBarDetalleGastoDepreciacion,jTtoolBarGastoDepreciacion,jTtoolBarDetalleGastoDepreciacion);
		
			startProcess();//this.
		}
						
		/*
		if(conSplash) {
			SwingUtilities.invokeLater(new Runnable() {
			      public void run() {
			    	  try {
							FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasGastoDepreciacion ,jPanelParametrosReportesGastoDepreciacion, jScrollPanelDatosGastoDepreciacion,jPanelPaginacionGastoDepreciacion, jScrollPanelDatosEdicionGastoDepreciacion, jPanelAccionesGastoDepreciacion,jPanelAccionesFormularioGastoDepreciacion,jmenuBarGastoDepreciacion,jmenuBarDetalleGastoDepreciacion,jTtoolBarGastoDepreciacion,jTtoolBarDetalleGastoDepreciacion);
						
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
	
	public void finishProcessGastoDepreciacion() {// throws Exception 
		this.finishProcessGastoDepreciacion(true);
	}
	
	public void finishProcessGastoDepreciacion(Boolean conSplash) {// throws Exception 
		//FuncionesSwing.enableDisablePanels(true,this.jTabbedPaneBusquedasGastoDepreciacion ,this.jPanelParametrosReportesGastoDepreciacion, this.jScrollPanelDatosGastoDepreciacion,this.jPanelPaginacionGastoDepreciacion, this.jScrollPanelDatosEdicionGastoDepreciacion, this.jPanelAccionesGastoDepreciacion,this.jPanelAccionesFormularioGastoDepreciacion,this.jmenuBarGastoDepreciacion,this.jmenuBarDetalleGastoDepreciacion,this.jTtoolBarGastoDepreciacion,this.jTtoolBarDetalleGastoDepreciacion);		
		
		final JTabbedPane jTabbedPaneBusquedasGastoDepreciacion=this.jTabbedPaneBusquedasGastoDepreciacion; 
		
		final JPanel jPanelParametrosReportesGastoDepreciacion=this.jPanelParametrosReportesGastoDepreciacion;
		//final JScrollPane jScrollPanelDatosGastoDepreciacion=this.jScrollPanelDatosGastoDepreciacion;
		final JTable jTableDatosGastoDepreciacion=this.jTableDatosGastoDepreciacion;		
		final JPanel jPanelPaginacionGastoDepreciacion=this.jPanelPaginacionGastoDepreciacion;
		//final JScrollPane jScrollPanelDatosEdicionGastoDepreciacion=this.jScrollPanelDatosEdicionGastoDepreciacion;
		final JPanel jPanelAccionesGastoDepreciacion=this.jPanelAccionesGastoDepreciacion;
		
		JPanel jPanelCamposAuxiliarGastoDepreciacion=new JPanel();
		JPanel jPanelAccionesFormularioAuxiliarGastoDepreciacion=new JPanel();
		
		if(this.jInternalFrameDetalleFormGastoDepreciacion!=null) {
			jPanelCamposAuxiliarGastoDepreciacion=this.jInternalFrameDetalleFormGastoDepreciacion.jPanelCamposGastoDepreciacion;
			jPanelAccionesFormularioAuxiliarGastoDepreciacion=this.jInternalFrameDetalleFormGastoDepreciacion.jPanelAccionesFormularioGastoDepreciacion;
		}
		
		final JPanel jPanelCamposGastoDepreciacion=jPanelCamposAuxiliarGastoDepreciacion;
		final JPanel jPanelAccionesFormularioGastoDepreciacion=jPanelAccionesFormularioAuxiliarGastoDepreciacion;
		
		
		final JMenuBar jmenuBarGastoDepreciacion=this.jmenuBarGastoDepreciacion;		
		final JToolBar jTtoolBarGastoDepreciacion=this.jTtoolBarGastoDepreciacion;
				
		JMenuBar jmenuBarDetalleAuxiliarGastoDepreciacion=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarGastoDepreciacion=new JToolBar();
		
		if(this.jInternalFrameDetalleFormGastoDepreciacion!=null) {
			jmenuBarDetalleAuxiliarGastoDepreciacion=this.jInternalFrameDetalleFormGastoDepreciacion.jmenuBarDetalleGastoDepreciacion;
			jTtoolBarDetalleAuxiliarGastoDepreciacion=this.jInternalFrameDetalleFormGastoDepreciacion.jTtoolBarDetalleGastoDepreciacion;		
		}
		
		final JMenuBar jmenuBarDetalleGastoDepreciacion=jmenuBarDetalleAuxiliarGastoDepreciacion;
		final JToolBar jTtoolBarDetalleGastoDepreciacion=jTtoolBarDetalleAuxiliarGastoDepreciacion;
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasGastoDepreciacion;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesGastoDepreciacion;
			processRunnable.jTableDatos=jTableDatosGastoDepreciacion;
			processRunnable.jPanelCampos=jPanelCamposGastoDepreciacion;
			processRunnable.jPanelPaginacion=jPanelPaginacionGastoDepreciacion;
			processRunnable.jPanelAcciones=jPanelAccionesGastoDepreciacion;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioGastoDepreciacion;
			
			
			processRunnable.jmenuBar=jmenuBarGastoDepreciacion;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleGastoDepreciacion;
			processRunnable.jTtoolBar=jTtoolBarGastoDepreciacion;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleGastoDepreciacion;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			if(conSplash) {
				SwingUtilities.invokeLater(new RunnableProceso(true,this,jTabbedPaneBusquedasGastoDepreciacion ,jPanelParametrosReportesGastoDepreciacion, jTableDatosGastoDepreciacion,/*jScrollPanelDatosGastoDepreciacion,*/jPanelCamposGastoDepreciacion,jPanelPaginacionGastoDepreciacion, /*jScrollPanelDatosEdicionGastoDepreciacion,*/ jPanelAccionesGastoDepreciacion,jPanelAccionesFormularioGastoDepreciacion,jmenuBarGastoDepreciacion,jmenuBarDetalleGastoDepreciacion,jTtoolBarGastoDepreciacion,jTtoolBarDetalleGastoDepreciacion));
			}
		}						
	}
	
	/*
	public void habilitarDeshabilitarControlesGastoDepreciacion(Boolean esHabilitar,Boolean conDetalle) {
		this.habilitarDeshabilitarToolBarGastoDepreciacion(esHabilitar,conDetalle);
		this.habilitarDeshabilitarMenuGastoDepreciacion(esHabilitar,conDetalle);
	}
	
	public void habilitarDeshabilitarToolBarGastoDepreciacion(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jTtoolBarGastoDepreciacion,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jTtoolBarDetalleGastoDepreciacion,esHabilitar,1,1);
		}
	}
	
	public void habilitarDeshabilitarMenuGastoDepreciacion(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jmenuBarGastoDepreciacion,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jmenuBarDetalleGastoDepreciacion,esHabilitar,1,1);
		}
	}
	*/
	
	
	
	public void procesarBusqueda(String sAccionBusqueda) throws Exception {		
		String  finalQueryPaginacion=this.gastodepreciacionConstantesFunciones.getsFinalQueryGastoDepreciacion();
		String  finalQueryPaginacionTodos=this.gastodepreciacionConstantesFunciones.getsFinalQueryGastoDepreciacion();
		
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
		
		ArrayList<String> arrColumnasGlobalesNo=GastoDepreciacionConstantesFunciones.getArrayColumnasGlobalesNoGastoDepreciacion(this.arrDatoGeneral);
		ArrayList<String> arrColumnasGlobales=GastoDepreciacionConstantesFunciones.getArrayColumnasGlobalesGastoDepreciacion(this.arrDatoGeneral,arrColumnasGlobalesNo);
		
			
		String  finalQueryGlobal="";
		
		finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,!esBusqueda,esBusqueda,arrColumnasGlobales,GastoDepreciacionConstantesFunciones.TABLENAME);
		
		String sOrderBy="";
		
		
		sOrderBy=Funciones2.getFinalQueryOrderBy(this.arrOrderBy);
		
		
		if(!sOrderBy.equals("")) {			
			finalQueryPaginacion=sOrderBy;
			finalQueryPaginacionTodos=sOrderBy;
		}
		
		
		//INICIALIZA ELIMINADOS
		this.gastodepreciacionsEliminados= new ArrayList<GastoDepreciacion>();
		
		if(!this.isEntroOnLoad) {
			this.onLoad();
		}/* else {
			this.isEntroOnLoad=false;
		}*/
		
		
		
				
		try	{		
			
			//this.startProcessGastoDepreciacion();
		
				///*GastoDepreciacionSessionBean*/this.gastodepreciacionSessionBean=new GastoDepreciacionSessionBean();
			
			if(this.gastodepreciacionSessionBean==null) {
				this.gastodepreciacionSessionBean=new GastoDepreciacionSessionBean();
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
					this.iNumeroPaginacion=GastoDepreciacionConstantesFunciones.INUMEROPAGINACION;
				}
			}
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);
			
			this.cargarDatosCliente();
			
			ArrayList<Classe> classes=new ArrayList<Classe>();
			
			classes=GastoDepreciacionConstantesFunciones.getClassesForeignKeysOfGastoDepreciacion(new ArrayList<Classe>(),DeepLoadType.NONE);
			
		
			this.datosDeep=new DatosDeep();
			this.datosDeep.setIsDeep(false);
			this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
			this.datosDeep.setClases(classes);
			
			this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
			this.datosCliente.setIsConDeep(true);
			
			if(false) {//this.conExportar
				this.datosCliente.setIsConExportar(true);
				this.datosCliente.setDatosExportarParametros(Funciones2.getTipoExportar(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getcon_exportar_cabecera(),Funciones2.getTipoDelimiter(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getpath_exportar()+"/gastodepreciacion."+Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario));
			} else {
				this.datosCliente.setIsConExportar(false);
			}
			
			gastodepreciacionsAux= new ArrayList<GastoDepreciacion>();
			
				
			gastodepreciacionLogic.setDatosCliente(this.datosCliente);
			gastodepreciacionLogic.setDatosDeep(this.datosDeep);
			gastodepreciacionLogic.setIsConDeep(true);
			
			
			gastodepreciacionLogic.getGastoDepreciacionDataAccess().setIsForForeingsKeysDataRelationships(true);
			
			if(sAccionBusqueda.equals("Todos") || sAccionBusqueda.equals("Query"))	{	
				if(sAccionBusqueda.equals("Todos")) {
					//FALTA:PARA BUSQUEDAS POR CAMPO EN FORMULARIO
					//this.sFinalQueryGeneral="";
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacionTodos );
					
					gastodepreciacionLogic.getTodosGastoDepreciacions(finalQueryGlobal,pagination);
					
					//gastodepreciacionLogic.getTodosGastoDepreciacionsWithConnection(finalQueryGlobal,pagination);										
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
				
				if(gastodepreciacionLogic.getGastoDepreciacions()==null|| gastodepreciacionLogic.getGastoDepreciacions().size()==0)	{
					
				
				}
				
				if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(-1);
						this.pagination.setiMaxResults(-1);
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							gastodepreciacionsAux= new ArrayList<GastoDepreciacion>();
							gastodepreciacionsAux.addAll(gastodepreciacionLogic.getGastoDepreciacions());						
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							gastodepreciacionsAux= new ArrayList<GastoDepreciacion>();
							gastodepreciacionsAux.addAll(gastodepreciacions);
						}
						//ARCHITECTURE
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							gastodepreciacionLogic.getTodosGastoDepreciacions(finalQueryGlobal+"",this.pagination);												
							
							//gastodepreciacionLogic.getTodosGastoDepreciacionsWithConnection(finalQueryGlobal+"",this.pagination);												
						} else if(Constantes.ISUSAEJBREMOTE) {
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
					}
					
					this.generarReporteGastoDepreciacions("Todos",gastodepreciacionLogic.getGastoDepreciacions() );
					
					if(false) {//isMostrarTodosResultadosReporte						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							gastodepreciacionLogic.setGastoDepreciacions(new ArrayList<GastoDepreciacion>());					
							gastodepreciacionLogic.getGastoDepreciacions().addAll(gastodepreciacionsAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							gastodepreciacions=new ArrayList<GastoDepreciacion>();
							gastodepreciacions.addAll(gastodepreciacionsAux);
						}
						//ARCHITECTURE
						
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);														
					}
				}
			}
			else if(sAccionBusqueda.equals("PorId")) {
				Long idGastoDepreciacion=0L;
				
				if(this.idActual!=null && this.idActual!=0L) {
					idGastoDepreciacion=this.idActual;
				
				} else if(this.idGastoDepreciacionActual!=null && this.idGastoDepreciacionActual!=0L) {
					idGastoDepreciacion=idGastoDepreciacionActual;
				}
				
					
				this.sDetalleReporte=GastoDepreciacionConstantesFunciones.getDetalleIndicePorId(idGastoDepreciacion);
				
				this.gastodepreciacions=new ArrayList<GastoDepreciacion>();
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {					
					gastodepreciacionLogic.getEntity(idGastoDepreciacion);
					
					//gastodepreciacionLogic.getEntityWithConnection(idGastoDepreciacion);
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
								
				if(Constantes.ISUSAEJBLOGICLAYER) {
					gastodepreciacionLogic.setGastoDepreciacions(new ArrayList<GastoDepreciacion>());
					gastodepreciacionLogic.getGastoDepreciacions().add(gastodepreciacionLogic.getGastoDepreciacion());
				
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.gastodepreciacions=new ArrayList<GastoDepreciacion>();
					this.gastodepreciacions.add(gastodepreciacion);
				}
				
				if(gastodepreciacionLogic.getGastoDepreciacion()==null)	{
					
				
				}			
			}
			
		
			else if(sAccionBusqueda.equals("FK_IdDetalleGrupoActivoFijo")) {
				this.sDetalleReporte=GastoDepreciacionConstantesFunciones.getDetalleIndiceFK_IdDetalleGrupoActivoFijo(id_detalle_grupo_activo_fijoFK_IdDetalleGrupoActivoFijo);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					gastodepreciacionLogic.getGastoDepreciacionsFK_IdDetalleGrupoActivoFijo(finalQueryGlobal,pagination,id_detalle_grupo_activo_fijoFK_IdDetalleGrupoActivoFijo);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=GastoDepreciacionConstantesFunciones.getDetalleIndiceFK_IdDetalleGrupoActivoFijo(id_detalle_grupo_activo_fijoFK_IdDetalleGrupoActivoFijo);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=GastoDepreciacionConstantesFunciones.getDetalleIndiceFK_IdDetalleGrupoActivoFijo(id_detalle_grupo_activo_fijoFK_IdDetalleGrupoActivoFijo);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=gastodepreciacionLogic.getGastoDepreciacions()==null||gastodepreciacionLogic.getGastoDepreciacions().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=gastodepreciacions==null|| gastodepreciacions.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						gastodepreciacionsAux=new ArrayList<GastoDepreciacion>();
						gastodepreciacionsAux.addAll(gastodepreciacionLogic.getGastoDepreciacions());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							gastodepreciacionsAux=new ArrayList<GastoDepreciacion>();
							gastodepreciacionsAux.addAll(gastodepreciacions);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							gastodepreciacionLogic.getGastoDepreciacionsFK_IdDetalleGrupoActivoFijo(finalQueryGlobal,pagination,id_detalle_grupo_activo_fijoFK_IdDetalleGrupoActivoFijo);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=GastoDepreciacionConstantesFunciones.getDetalleIndiceFK_IdDetalleGrupoActivoFijo(id_detalle_grupo_activo_fijoFK_IdDetalleGrupoActivoFijo);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=GastoDepreciacionConstantesFunciones.getDetalleIndiceFK_IdDetalleGrupoActivoFijo(id_detalle_grupo_activo_fijoFK_IdDetalleGrupoActivoFijo);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteGastoDepreciacions("FK_IdDetalleGrupoActivoFijo",gastodepreciacionLogic.getGastoDepreciacions());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteGastoDepreciacions("FK_IdDetalleGrupoActivoFijo",gastodepreciacions);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						gastodepreciacionLogic.setGastoDepreciacions(new ArrayList<GastoDepreciacion>());
						gastodepreciacionLogic.getGastoDepreciacions().addAll(gastodepreciacionsAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							gastodepreciacions=new ArrayList<GastoDepreciacion>();
							gastodepreciacions.addAll(gastodepreciacionsAux);
						}
						//ARCHITECTURE
					}
				}

			}
			else if(sAccionBusqueda.equals("FK_IdEmpresa")) {
				this.sDetalleReporte=GastoDepreciacionConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					gastodepreciacionLogic.getGastoDepreciacionsFK_IdEmpresa(finalQueryGlobal,pagination,id_empresaFK_IdEmpresa);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=GastoDepreciacionConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=GastoDepreciacionConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=gastodepreciacionLogic.getGastoDepreciacions()==null||gastodepreciacionLogic.getGastoDepreciacions().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=gastodepreciacions==null|| gastodepreciacions.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						gastodepreciacionsAux=new ArrayList<GastoDepreciacion>();
						gastodepreciacionsAux.addAll(gastodepreciacionLogic.getGastoDepreciacions());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							gastodepreciacionsAux=new ArrayList<GastoDepreciacion>();
							gastodepreciacionsAux.addAll(gastodepreciacions);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							gastodepreciacionLogic.getGastoDepreciacionsFK_IdEmpresa(finalQueryGlobal,pagination,id_empresaFK_IdEmpresa);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=GastoDepreciacionConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=GastoDepreciacionConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteGastoDepreciacions("FK_IdEmpresa",gastodepreciacionLogic.getGastoDepreciacions());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteGastoDepreciacions("FK_IdEmpresa",gastodepreciacions);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						gastodepreciacionLogic.setGastoDepreciacions(new ArrayList<GastoDepreciacion>());
						gastodepreciacionLogic.getGastoDepreciacions().addAll(gastodepreciacionsAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							gastodepreciacions=new ArrayList<GastoDepreciacion>();
							gastodepreciacions.addAll(gastodepreciacionsAux);
						}
						//ARCHITECTURE
					}
				}

			} 
		
		
		
		this.redimensionarTablaDatos();
		//this.refrescarForeignKeysDescripcionesGastoDepreciacion();
		
		
		if(this.conTotales) {
			this.crearFilaTotales();
		}		
		} catch (JRException e) {
			throw e;
		} catch(Exception e) {
			throw e;
      	} finally {
      		//this.finishProcessGastoDepreciacion();
      	}
		
	}				
	
	public void redimensionarTablaDatos() throws Exception {
		int iSizeTabla=0;
				
		iSizeTabla=this.getSizeTablaDatos();
		
		//ARCHITECTURE
		/*
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=gastodepreciacionLogic.getGastoDepreciacions().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=gastodepreciacions.size();
		}
		*/
		//ARCHITECTURE
											
		this.redimensionarTablaDatos(iSizeTabla);		
	}
	
	public Integer getSizeTablaDatos() throws Exception {
		Integer iSizeTabla=0;
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=gastodepreciacionLogic.getGastoDepreciacions().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=gastodepreciacions.size();
		}
		//ARCHITECTURE
											
		return iSizeTabla;		
	}
	
			
	public Boolean permiteMantenimiento(GastoDepreciacion gastodepreciacion) {
		Boolean permite=true;
		
		if(this.gastodepreciacion.getsType().equals(Constantes2.S_TOTALES)) {
			permite=false;
		}
		
		return permite;
	}
	
	public void traerValoresTablaTotales() throws Exception {
	}
	
	
	public void traerValoresTablaOrderBy() throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.arrOrderBy=GastoDepreciacionConstantesFunciones.getOrderByListaGastoDepreciacion();							
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.arrOrderBy=GastoDepreciacionConstantesFunciones.getOrderByListaGastoDepreciacion();
		}		
	}
	
	
	public Boolean existeFilaTotales() throws Exception {
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(GastoDepreciacion gastodepreciacion:gastodepreciacionLogic.getGastoDepreciacions()) {
				if(gastodepreciacion.getsType().equals(Constantes2.S_TOTALES)) {
					gastodepreciacionTotales=gastodepreciacion;
					existe=true;
					break;
				}
			}
								
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(GastoDepreciacion gastodepreciacion:this.gastodepreciacions) {
				if(gastodepreciacion.getsType().equals(Constantes2.S_TOTALES)) {
					gastodepreciacionTotales=gastodepreciacion;
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
			this.gastodepreciacionAux=new GastoDepreciacion();
			this.gastodepreciacionAux.setsType(Constantes2.S_TOTALES);
			this.gastodepreciacionAux.setIsNew(false);
			this.gastodepreciacionAux.setIsChanged(false);
			this.gastodepreciacionAux.setIsDeleted(false);
				
			if(Constantes.ISUSAEJBLOGICLAYER) {
				GastoDepreciacionConstantesFunciones.TotalizarValoresFilaGastoDepreciacion(this.gastodepreciacionLogic.getGastoDepreciacions(),this.gastodepreciacionAux);
				
				this.gastodepreciacionLogic.getGastoDepreciacions().add(this.gastodepreciacionAux);
				
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				GastoDepreciacionConstantesFunciones.TotalizarValoresFilaGastoDepreciacion(this.gastodepreciacions,this.gastodepreciacionAux);
				
				this.gastodepreciacions.add(this.gastodepreciacionAux);
			}
		}
	}
	
	public void quitarFilaTotales() throws Exception {
		gastodepreciacionTotales=new GastoDepreciacion();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.gastodepreciacionLogic.getGastoDepreciacions().remove(gastodepreciacionTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.gastodepreciacions.remove(gastodepreciacionTotales);
			}
		}
	}
	
	public void actualizarFilaTotales() throws Exception {
		gastodepreciacionTotales=new GastoDepreciacion();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(GastoDepreciacion gastodepreciacion:gastodepreciacionLogic.getGastoDepreciacions()) {
				if(gastodepreciacion.getsType().equals(Constantes2.S_TOTALES)) {
					gastodepreciacionTotales=gastodepreciacion;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				GastoDepreciacionConstantesFunciones.TotalizarValoresFilaGastoDepreciacion(this.gastodepreciacionLogic.getGastoDepreciacions(),gastodepreciacionTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(GastoDepreciacion gastodepreciacion:this.gastodepreciacions) {
				if(gastodepreciacion.getsType().equals(Constantes2.S_TOTALES)) {
					gastodepreciacionTotales=gastodepreciacion;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				GastoDepreciacionConstantesFunciones.TotalizarValoresFilaGastoDepreciacion(this.gastodepreciacions,gastodepreciacionTotales);
			}
		}
	}		
	
	public void recargarInformacion()throws Exception {
		try {
			sAccionBusqueda="Todos";
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda(sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,GastoDepreciacionConstantesFunciones.CLASSNAME);
		}	
	}		
	
	
	public void getGastoDepreciacionsFK_IdDetalleGrupoActivoFijo()throws Exception {
		try {
			sAccionBusqueda="FK_IdDetalleGrupoActivoFijo";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getGastoDepreciacionsFK_IdEmpresa()throws Exception {
		try {
			sAccionBusqueda="FK_IdEmpresa";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	
	
	public void getGastoDepreciacionsFK_IdDetalleGrupoActivoFijo(String sFinalQuery,Long id_detalle_grupo_activo_fijo)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					gastodepreciacionLogic.getGastoDepreciacionsFK_IdDetalleGrupoActivoFijo(sFinalQuery,this.pagination,id_detalle_grupo_activo_fijo);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getGastoDepreciacionsFK_IdEmpresa(String sFinalQuery,Long id_empresa)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					gastodepreciacionLogic.getGastoDepreciacionsFK_IdEmpresa(sFinalQuery,this.pagination,id_empresa);
				
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
	
	public void inicializarPermisosGastoDepreciacion() {
		this.isPermisoTodoGastoDepreciacion=false;
		this.isPermisoNuevoGastoDepreciacion=false;
		this.isPermisoActualizarGastoDepreciacion=false;
		this.isPermisoActualizarOriginalGastoDepreciacion=false;
		this.isPermisoEliminarGastoDepreciacion=false;
		this.isPermisoGuardarCambiosGastoDepreciacion=false;
		this.isPermisoConsultaGastoDepreciacion=false;
		this.isPermisoBusquedaGastoDepreciacion=false;
		this.isPermisoReporteGastoDepreciacion=false;		
		this.isPermisoOrdenGastoDepreciacion=false;		
		this.isPermisoPaginacionMedioGastoDepreciacion=false;		
		this.isPermisoPaginacionAltoGastoDepreciacion=false;
		this.isPermisoPaginacionTodoGastoDepreciacion=false;
		this.isPermisoCopiarGastoDepreciacion=false;		
		this.isPermisoVerFormGastoDepreciacion=false;		
		this.isPermisoDuplicarGastoDepreciacion=false;		
		this.isPermisoOrdenGastoDepreciacion=false;		
	}
	
	public void setPermisosUsuarioGastoDepreciacion(Boolean isPermiso) {
		this.isPermisoTodoGastoDepreciacion=isPermiso;
		this.isPermisoNuevoGastoDepreciacion=isPermiso;
		this.isPermisoActualizarGastoDepreciacion=isPermiso;
		this.isPermisoActualizarOriginalGastoDepreciacion=isPermiso;
		this.isPermisoEliminarGastoDepreciacion=isPermiso;
		this.isPermisoGuardarCambiosGastoDepreciacion=isPermiso;
		this.isPermisoConsultaGastoDepreciacion=isPermiso;
		this.isPermisoBusquedaGastoDepreciacion=isPermiso;
		this.isPermisoReporteGastoDepreciacion=isPermiso;
		this.isPermisoOrdenGastoDepreciacion=isPermiso;		
		this.isPermisoPaginacionMedioGastoDepreciacion=isPermiso;		
		this.isPermisoPaginacionAltoGastoDepreciacion=isPermiso;		
		this.isPermisoPaginacionTodoGastoDepreciacion=isPermiso;		
		this.isPermisoCopiarGastoDepreciacion=isPermiso;		
		this.isPermisoVerFormGastoDepreciacion=isPermiso;		
		this.isPermisoDuplicarGastoDepreciacion=isPermiso;
		this.isPermisoOrdenGastoDepreciacion=isPermiso;
	}
	
	public void setPermisosMantenimientoUsuarioGastoDepreciacion(Boolean isPermiso) {
		//this.isPermisoTodoGastoDepreciacion=isPermiso;
		this.isPermisoNuevoGastoDepreciacion=isPermiso;
		this.isPermisoActualizarGastoDepreciacion=isPermiso;
		this.isPermisoActualizarOriginalGastoDepreciacion=isPermiso;
		this.isPermisoEliminarGastoDepreciacion=isPermiso;
		this.isPermisoGuardarCambiosGastoDepreciacion=isPermiso;
		//this.isPermisoConsultaGastoDepreciacion=isPermiso;
		//this.isPermisoBusquedaGastoDepreciacion=isPermiso;
		//this.isPermisoReporteGastoDepreciacion=isPermiso;
		//this.isPermisoOrdenGastoDepreciacion=isPermiso;		
		//this.isPermisoPaginacionMedioGastoDepreciacion=isPermiso;		
		//this.isPermisoPaginacionAltoGastoDepreciacion=isPermiso;		
		//this.isPermisoPaginacionTodoGastoDepreciacion=isPermiso;		
		//this.isPermisoCopiarGastoDepreciacion=isPermiso;		
		//this.isPermisoDuplicarGastoDepreciacion=isPermiso;
		//this.isPermisoOrdenGastoDepreciacion=isPermiso;
	}
	
	public void inicializarSetPermisosUsuarioGastoDepreciacionClasesRelacionadas() throws Exception {
		ArrayList<String> arrPaginas=new ArrayList<String>();		
		ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
		
		arrPaginas.add(CuentaContaGastoDepreConstantesFunciones.SNOMBREOPCION);
		
		if(GastoDepreciacionJInternalFrame.CON_LLAMADA_SIMPLE) {
			this.opcionsRelacionadas.addAll(this.sistemaReturnGeneral.getOpcionsRelacionadas());
			
		} else {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				opcionsFinal=sistemaLogicAdditional.tienePermisosOpcionesEnPaginaWeb(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, arrPaginas);
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
			
			this.opcionsRelacionadas.addAll(opcionsFinal);
		}
		
		

		this.isTienePermisosCuentaContaGastoDepre=false;
		this.isTienePermisosCuentaContaGastoDepre=this.verificarGetPermisosUsuarioOpcionGastoDepreciacionClaseRelacionada(this.opcionsRelacionadas,CuentaContaGastoDepreConstantesFunciones.SNOMBREOPCION);
		
	}
	
	public Boolean tienePermisosUsuarioEnPaginaWebGastoDepreciacion(String sPagina) throws Exception {
		Boolean tienePermisos=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tienePermisos=sistemaLogicAdditional.tienePermisosEnPaginaWeb(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, sPagina);
		} else if(Constantes.ISUSAEJBREMOTE) {
		} else if(Constantes.ISUSAEJBHOME) {
		}
		
		return tienePermisos;
	}
	
	public void inicializarSetPermisosUsuarioGastoDepreciacionClasesRelacionadas(Boolean conPermiso) throws Exception {
		
		this.isTienePermisosCuentaContaGastoDepre=conPermiso;
	}
	
	public Boolean verificarGetPermisosUsuarioGastoDepreciacionClaseRelacionada(ArrayList<String> arrPaginasFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioClaseRelacionada(arrPaginasFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public Boolean verificarGetPermisosUsuarioOpcionGastoDepreciacionClaseRelacionada(List<Opcion> opcionsFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioOpcionClaseRelacionada(opcionsFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public void actualizarTabsSetPermisosUsuarioGastoDepreciacionClasesRelacionadas() throws Exception {
		

		if(!this.isTienePermisosCuentaContaGastoDepre && this.jInternalFrameDetalleFormGastoDepreciacion!=null && this.jInternalFrameDetalleFormGastoDepreciacion.cuentacontagastodepreBeanSwingJInternalFrame!=null) {
			this.jInternalFrameDetalleFormGastoDepreciacion.jTabbedPaneRelacionesGastoDepreciacion.remove(this.jInternalFrameDetalleFormGastoDepreciacion.cuentacontagastodepreBeanSwingJInternalFrame.getContentPane());
		}
	}
	
	public void setPermisosUsuarioGastoDepreciacion() throws Exception {
		
		PerfilOpcion perfilOpcionUsuario=new PerfilOpcion();		
		Long idOpcion=this.opcionActual.getId();
		
		if(GastoDepreciacionJInternalFrame.CON_LLAMADA_SIMPLE) {
			perfilOpcionUsuario=this.sistemaReturnGeneral.getPerfilOpcion();
			
		} else {
			if(this.gastodepreciacionSessionBean.getEsGuardarRelacionado()) {
				idOpcion=0L;
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				perfilOpcionUsuario=sistemaLogicAdditional.traerPermisosPaginaWebPerfilOpcion(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, GastoDepreciacionConstantesFunciones.SNOMBREOPCION,idOpcion);				
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
		}
		
		if(perfilOpcionUsuario!=null && perfilOpcionUsuario.getId()>0) {
			this.isPermisoNuevoGastoDepreciacion=perfilOpcionUsuario.getingreso()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarGastoDepreciacion=perfilOpcionUsuario.getmodificacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarOriginalGastoDepreciacion=this.isPermisoActualizarGastoDepreciacion;
			this.isPermisoEliminarGastoDepreciacion=perfilOpcionUsuario.geteliminacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoGuardarCambiosGastoDepreciacion=perfilOpcionUsuario.getguardar_cambios()||perfilOpcionUsuario.gettodo();
			this.isPermisoConsultaGastoDepreciacion=perfilOpcionUsuario.getconsulta()||perfilOpcionUsuario.gettodo();
			this.isPermisoBusquedaGastoDepreciacion=perfilOpcionUsuario.getbusqueda()||perfilOpcionUsuario.gettodo();
			this.isPermisoTodoGastoDepreciacion=perfilOpcionUsuario.gettodo()||perfilOpcionUsuario.gettodo();
			this.isPermisoReporteGastoDepreciacion=perfilOpcionUsuario.getreporte()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenGastoDepreciacion=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionMedioGastoDepreciacion=perfilOpcionUsuario.getpaginacion_medio()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionAltoGastoDepreciacion=perfilOpcionUsuario.getpaginacion_alto()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionTodoGastoDepreciacion=perfilOpcionUsuario.getpaginacion_todo()||perfilOpcionUsuario.gettodo();
			this.isPermisoCopiarGastoDepreciacion=perfilOpcionUsuario.getcopiar()||perfilOpcionUsuario.gettodo();
			this.isPermisoVerFormGastoDepreciacion=true;//perfilOpcionUsuario.getver_form()||perfilOpcionUsuario.gettodo();
			this.isPermisoDuplicarGastoDepreciacion=perfilOpcionUsuario.getduplicar()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenGastoDepreciacion=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			
			if(this.gastodepreciacionSessionBean.getEsGuardarRelacionado()) {
				this.opcionActual.setId(perfilOpcionUsuario.getid_opcion());
				
				this.jTableDatosGastoDepreciacion.setToolTipText(this.jTableDatosGastoDepreciacion.getToolTipText()+"_"+perfilOpcionUsuario.getid_opcion());		
			}
		} else {
			this.setPermisosUsuarioGastoDepreciacion(false);
		}
		
		//SI SE NECESITA PONER TODOS LOS PERMISOS POR DEFECTO
		//
		
	}
	
	public void setAccionesUsuarioGastoDepreciacion(Boolean esParaAccionesFormulario) throws Exception {		
		Reporte reporte=null;
		
		if(!esParaAccionesFormulario) {
			this.accions=new ArrayList<Accion>();
			
			if(GastoDepreciacionJInternalFrame.CON_LLAMADA_SIMPLE) {
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
			
			if(GastoDepreciacionJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public void setRelacionesUsuarioGastoDepreciacion() throws Exception {
		Reporte reporte=null;
		
		

		if(this.isTienePermisosCuentaContaGastoDepre && this.gastodepreciacionConstantesFunciones.mostrarCuentaContaGastoDepreGastoDepreciacion && !GastoDepreciacionConstantesFunciones.ISGUARDARREL) {

			reporte=new Reporte();
			reporte.setsCodigo("Cuenta Conta Gasto Depre");
			reporte.setsDescripcion("Cuenta Conta Gasto Depre");
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
	public void inicializarCombosForeignKeyGastoDepreciacionListas()throws Exception {
		try	{						
			
				this.empresasForeignKey=new ArrayList();
				this.detallegrupoactivofijosForeignKey=new ArrayList();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void cargarCombosTodosForeignKeyGastoDepreciacionListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			String sFinalQueryCombo="";
			
			Modulo  moduloActualAux=new Modulo();
			
			if(GastoDepreciacionJInternalFrame.ISLOAD_FKLOTE) {
				this.cargarCombosLoteForeignKeyGastoDepreciacionListas(false);
			} else {
			
				this.cargarCombosForeignKeyEmpresaListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeyDetalleGrupoActivoFijoListas(cargarCombosDependencia,sFinalQueryCombo);
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

	public void cargarCombosForeignKeyDetalleGrupoActivoFijoListas(Boolean cargarCombosDependencia,String sFinalQuery)throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();

			String  finalQueryGlobal="";

			Modulo  moduloActualAux=new Modulo();

			if((this.detallegrupoactivofijosForeignKey==null||this.detallegrupoactivofijosForeignKey.size()<=0)) {
				this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
				this.arrDatoGeneralNo= new  ArrayList<String>();

				arrColumnasGlobales=DetalleGrupoActivoFijoConstantesFunciones.getArrayColumnasGlobalesDetalleGrupoActivoFijo(this.arrDatoGeneral,this.arrDatoGeneralNo);
				finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,DetalleGrupoActivoFijoConstantesFunciones.TABLENAME);

				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, sFinalQuery);
				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, "");

				finalQueryGlobal+=DetalleGrupoActivoFijoConstantesFunciones.SFINALQUERY;

				this.cargarCombosDetalleGrupoActivoFijosForeignKeyLista(finalQueryGlobal);
			}

		} catch(Exception e) {
			throw e;
		}
	}
	
	public void cargarCombosLoteForeignKeyGastoDepreciacionListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			Modulo  moduloActualAux=new Modulo();
			
			
			GastoDepreciacionParameterReturnGeneral gastodepreciacionReturnGeneral=new GastoDepreciacionParameterReturnGeneral();
						
			


				String finalQueryGlobalEmpresa="";

				if(((this.empresasForeignKey==null||this.empresasForeignKey.size()<=0) && this.gastodepreciacionConstantesFunciones.cargarid_empresaGastoDepreciacion)
					 || (this.esRecargarFks && this.gastodepreciacionConstantesFunciones.cargarid_empresaGastoDepreciacion)) {

					if(!this.gastodepreciacionSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=EmpresaConstantesFunciones.getArrayColumnasGlobalesEmpresa(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalEmpresa=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,EmpresaConstantesFunciones.TABLENAME);

						finalQueryGlobalEmpresa=Funciones.GetFinalQueryAppend(finalQueryGlobalEmpresa, "");
						finalQueryGlobalEmpresa+=EmpresaConstantesFunciones.SFINALQUERY;

						//this.cargarCombosEmpresasForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalEmpresa=" WHERE " + ConstantesSql.ID + "="+gastodepreciacionSessionBean.getlidEmpresaActual();
					}
				} else {
					finalQueryGlobalEmpresa="NONE";
				}


				String finalQueryGlobalDetalleGrupoActivoFijo="";

				if(((this.detallegrupoactivofijosForeignKey==null||this.detallegrupoactivofijosForeignKey.size()<=0) && this.gastodepreciacionConstantesFunciones.cargarid_detalle_grupo_activo_fijoGastoDepreciacion)
					 || (this.esRecargarFks && this.gastodepreciacionConstantesFunciones.cargarid_detalle_grupo_activo_fijoGastoDepreciacion)) {

					if(!this.gastodepreciacionSessionBean.getisBusquedaDesdeForeignKeySesionDetalleGrupoActivoFijo()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=DetalleGrupoActivoFijoConstantesFunciones.getArrayColumnasGlobalesDetalleGrupoActivoFijo(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalDetalleGrupoActivoFijo=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,DetalleGrupoActivoFijoConstantesFunciones.TABLENAME);

						finalQueryGlobalDetalleGrupoActivoFijo=Funciones.GetFinalQueryAppend(finalQueryGlobalDetalleGrupoActivoFijo, "");
						finalQueryGlobalDetalleGrupoActivoFijo+=DetalleGrupoActivoFijoConstantesFunciones.SFINALQUERY;

						//this.cargarCombosDetalleGrupoActivoFijosForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalDetalleGrupoActivoFijo=" WHERE " + ConstantesSql.ID + "="+gastodepreciacionSessionBean.getlidDetalleGrupoActivoFijoActual();
					}
				} else {
					finalQueryGlobalDetalleGrupoActivoFijo="NONE";
				}
			
			//ARCHITECTURE			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				gastodepreciacionReturnGeneral=gastodepreciacionLogic.cargarCombosLoteForeignKeyGastoDepreciacion(finalQueryGlobalEmpresa,finalQueryGlobalDetalleGrupoActivoFijo);//WithConnection
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}			
			//ARCHITECTURE
			
			

			if(!finalQueryGlobalEmpresa.equals("NONE")) {
				this.empresasForeignKey=gastodepreciacionReturnGeneral.getempresasForeignKey();
			}

			if(!finalQueryGlobalDetalleGrupoActivoFijo.equals("NONE")) {
				this.detallegrupoactivofijosForeignKey=gastodepreciacionReturnGeneral.getdetallegrupoactivofijosForeignKey();
			}
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void addItemDefectoCombosTodosForeignKeyGastoDepreciacion()throws Exception {
		try {
			
			this.addItemDefectoCombosForeignKeyEmpresa();
			this.addItemDefectoCombosForeignKeyDetalleGrupoActivoFijo();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	



	public void addItemDefectoCombosForeignKeyEmpresa()throws Exception {
		try {
			if(this.gastodepreciacionSessionBean==null) {
				this.gastodepreciacionSessionBean=new GastoDepreciacionSessionBean();
			}

			if(!this.gastodepreciacionSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {
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

	public void addItemDefectoCombosForeignKeyDetalleGrupoActivoFijo()throws Exception {
		try {

			if(!this.gastodepreciacionSessionBean.getisBusquedaDesdeForeignKeySesionDetalleGrupoActivoFijo()) {
				DetalleGrupoActivoFijo detallegrupoactivofijo=new DetalleGrupoActivoFijo();
				DetalleGrupoActivoFijoConstantesFunciones.setDetalleGrupoActivoFijoDescripcion(detallegrupoactivofijo,Constantes.SMENSAJE_ESCOJA_OPCION);
				detallegrupoactivofijo.setId(null);

				if(!DetalleGrupoActivoFijoConstantesFunciones.ExisteEnLista(this.detallegrupoactivofijosForeignKey,detallegrupoactivofijo,true)) {

					this.detallegrupoactivofijosForeignKey.add(0,detallegrupoactivofijo);
				}
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void initActionsCombosTodosForeignKeyGastoDepreciacion()throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void initActionsCombosTodosForeignKeyGastoDepreciacion(String sFormularioTipoBusqueda)throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	


	
	


	
	public void setVariablesGlobalesCombosForeignKeyGastoDepreciacion()throws Exception {	
		try {
			if(this.parametroGeneralUsuario!=null && this.parametroGeneralUsuario.getId()>0) {
			
				this.setActualEmpresaForeignKey(this.parametroGeneralUsuario.getid_empresa(),false,"Formulario");
			
			
			}
			
			//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
			this.setVariablesGlobalesAuxiliaresCombosForeignKeyGastoDepreciacion();
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToFormularioForeignKeyGastoDepreciacion(GastoDepreciacion gastodepreciacion)throws Exception {	
		try {
			
			this.setActualDetalleGrupoActivoFijoForeignKey(gastodepreciacion.getid_detalle_grupo_activo_fijo(),false,"Formulario");			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToListasForeignKeyGastoDepreciacion(GastoDepreciacion gastodepreciacion,String sTipoEvento)throws Exception {	
		try {
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	/*
	public void setVariablesCombosFromBeanForeignKeyGastoDepreciacion()throws Exception {	
		try {
			
			this.setActualDetalleGrupoActivoFijoForeignKey(this.gastodepreciacionConstantesFunciones.getid_detalle_grupo_activo_fijo(),false,"Formulario");			
		} catch(Exception e) {
			throw e;
		}
	}
	*/
	
	public void setVariablesGlobalesAuxiliaresCombosForeignKeyGastoDepreciacion()throws Exception {	
		try {
			
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesDefaultCombosForeignKeyGastoDepreciacion()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesParametroCombosForeignKeyGastoDepreciacion()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void cargarCombosParametroGastoDepreciacion()throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			//this.cargarDatosCliente();
			
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
		
	public void cargarCombosFrameForeignKeyGastoDepreciacion()throws Exception {
		try {
			

			this.cargarCombosFrameEmpresasForeignKey("Todos");
			this.cargarCombosFrameDetalleGrupoActivoFijosForeignKey("Todos");

		} catch(Exception e) {
			throw e;
		}		
	}		
	
	public void cargarCombosFrameForeignKeyGastoDepreciacion(String sFormularioTipoBusqueda)throws Exception {
		try {
			

			this.cargarCombosFrameEmpresasForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameDetalleGrupoActivoFijosForeignKey(sFormularioTipoBusqueda);

		} catch(Exception e) {
			throw e;
		}		
	}	
	
	public void setItemDefectoCombosForeignKeyGastoDepreciacion()throws Exception {
		try {
			



			if(this.jInternalFrameDetalleFormGastoDepreciacion.jComboBoxid_empresaGastoDepreciacion!=null && this.jInternalFrameDetalleFormGastoDepreciacion.jComboBoxid_empresaGastoDepreciacion.getItemCount()>0) {
				this.jInternalFrameDetalleFormGastoDepreciacion.jComboBoxid_empresaGastoDepreciacion.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormGastoDepreciacion.jComboBoxid_detalle_grupo_activo_fijoGastoDepreciacion!=null && this.jInternalFrameDetalleFormGastoDepreciacion.jComboBoxid_detalle_grupo_activo_fijoGastoDepreciacion.getItemCount()>0) {
				this.jInternalFrameDetalleFormGastoDepreciacion.jComboBoxid_detalle_grupo_activo_fijoGastoDepreciacion.setSelectedIndex(0);
			}
		} catch(Exception e) {
			throw e;
		}		
	}		
	
	




	
	

	public GastoDepreciacionBeanSwingJInternalFrame() throws Exception {
		super(false,PaginaTipo.PRINCIPAL);
	}
	
	public GastoDepreciacionBeanSwingJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
	}
	
	public GastoDepreciacionBeanSwingJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
		
		this.gastodepreciacionSessionBean=new GastoDepreciacionSessionBean(); 
		this.gastodepreciacionConstantesFunciones=new GastoDepreciacionConstantesFunciones(); 
		this.gastodepreciacionBean=new GastoDepreciacion();//(this.gastodepreciacionConstantesFunciones); 		
		this.gastodepreciacionReturnGeneral=new GastoDepreciacionParameterReturnGeneral(); 
		
		this.gastodepreciacionSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.gastodepreciacionSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
				
	}
	
	public GastoDepreciacionBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,cargarTodosDatos);
	}
		
	public GastoDepreciacionBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,false,false,cargarRelaciones,cargarTodosDatos);
	}	
	
	public GastoDepreciacionBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos) throws Exception //Boolean esParaBusquedaForeignKey
    {
		super(jdesktopPane,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		try {
			
			this.permiteRecargarForm=false;
			
			this.startProcessGastoDepreciacion(true);
			
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
			
			this.gastodepreciacionConstantesFunciones=new GastoDepreciacionConstantesFunciones(); 
			this.gastodepreciacionBean=new GastoDepreciacion();//this.gastodepreciacionConstantesFunciones); 			
			this.gastodepreciacionReturnGeneral=new GastoDepreciacionParameterReturnGeneral(); 
		
			GastoDepreciacionBeanSwingJInternalFrameAdditional.CargaInicialInicio(this, "NORMAL", null);
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Gasto Depreciacion Mantenimiento",paginaTipo));			
			
			this.conTotales=false;
			
			this.conTotales=true;
			
			
			this.gastodepreciacion=new GastoDepreciacion();
			this.gastodepreciacions = new ArrayList<GastoDepreciacion>();
			this.gastodepreciacionsAux = new ArrayList<GastoDepreciacion>();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.gastodepreciacionLogic=new GastoDepreciacionLogic();
				this.gastodepreciacionLogic.getNewConnexionToDeep("");
			}
			
			//this.gastodepreciacionSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
			//this.gastodepreciacionSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
			
			this.jDesktopPane=jdesktopPane;
			
			if(this.jDesktopPane.getClass().equals(JDesktopPaneMe.class)) {
				this.constantes2=((JDesktopPaneMe)this.jDesktopPane).constantes2;
			}
			
			if(!Constantes.CON_VARIAS_VENTANAS) {
    			MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameDetalleFormGastoDepreciacion);
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameReporteDinamicoGastoDepreciacion!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoGastoDepreciacion);	
					}
					
					if(this.jInternalFrameImportacionGastoDepreciacion!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionGastoDepreciacion);							
					}
					
				}
				
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameOrderByGastoDepreciacion!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameOrderByGastoDepreciacion);					
					}
					
				}
			}
			
			//DETALLE DATOS
			if(this.jInternalFrameDetalleFormGastoDepreciacion!=null) { //this.conCargarFormDetalle) {
				this.jDesktopPane.add(this.jInternalFrameDetalleFormGastoDepreciacion);
				this.jInternalFrameDetalleFormGastoDepreciacion.setVisible(false);
				this.jInternalFrameDetalleFormGastoDepreciacion.setSelected(false);						
			}
			
			if(!this.conCargarMinimo) {
				
				//REPORTE DINAMICO
				if(this.jInternalFrameReporteDinamicoGastoDepreciacion!=null) {
					this.jDesktopPane.add(this.jInternalFrameReporteDinamicoGastoDepreciacion);
					this.jInternalFrameReporteDinamicoGastoDepreciacion.setVisible(false);
					this.jInternalFrameReporteDinamicoGastoDepreciacion.setSelected(false);
				}
				
				//IMPORTACION
				if(this.jInternalFrameImportacionGastoDepreciacion!=null) {
					this.jDesktopPane.add(this.jInternalFrameImportacionGastoDepreciacion);
					this.jInternalFrameImportacionGastoDepreciacion.setVisible(false);
					this.jInternalFrameImportacionGastoDepreciacion.setSelected(false);
				}
				
				
			}
			
			
			if(!this.conCargarMinimo) {
				
				if(this.jInternalFrameOrderByGastoDepreciacion!=null) {
					this.jDesktopPane.add(this.jInternalFrameOrderByGastoDepreciacion);
					this.jInternalFrameOrderByGastoDepreciacion.setVisible(false);
					this.jInternalFrameOrderByGastoDepreciacion.setSelected(false);				
				}
				
			}
			
			
			//this.esParaBusquedaForeignKey=false;
			this.esParaBusquedaForeignKey=esParaBusquedaForeignKey;
			
			this.invalidValues=new InvalidValue[0];
			
			
			
			this.idGastoDepreciacionActual=0L;
			this.rowIndexActual=0;
			
			
			this.iNumeroPaginacionPagina=0;
			this.iNumeroPaginacion=GastoDepreciacionConstantesFunciones.INUMEROPAGINACION;
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
			
			this.gastodepreciacionReturnGeneral=new GastoDepreciacionParameterReturnGeneral();
			
			this.gastodepreciacionParameterGeneral=new GastoDepreciacionParameterReturnGeneral();
			
			
			
			this.sistemaLogicAdditional=new SistemaLogicAdditional();
			
			this.sistemaLogicAdditional.setConnexion(this.gastodepreciacionLogic.getConnexion());			
			
			
			
			
			
			
			
			//VERIFICAR GLOBAL
			this.cargarDatosCliente();			
			
			
			if(!this.gastodepreciacionSessionBean.getEsGuardarRelacionado()) {
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
			
			if(GastoDepreciacionJInternalFrame.CON_LLAMADA_SIMPLE) {
				if(this.gastodepreciacionSessionBean.getEsGuardarRelacionado()) {
					this.opcionActual.setId(0L);
					
					//idOpcion=0L;					
				}
				
				ArrayList<String> arrPaginas=new ArrayList<String>();		
				ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
				
				arrPaginas.add(CuentaContaGastoDepreConstantesFunciones.SNOMBREOPCION);
		
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					//this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActualWithConnection(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,GastoDepreciacionConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.gastodepreciacionSessionBean.getEsGuardarRelacionado(),this.gastodepreciacionSessionBean.getConGuardarRelaciones(),arrPaginas);
					
					this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActual(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,GastoDepreciacionConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.gastodepreciacionSessionBean.getEsGuardarRelacionado(),this.gastodepreciacionSessionBean.getConGuardarRelaciones(),arrPaginas);
					
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
			
			this.isVisibilidadCeldaNuevoGastoDepreciacion=false;
			this.isVisibilidadCeldaDuplicarGastoDepreciacion=true;
			this.isVisibilidadCeldaCopiarGastoDepreciacion=true;
			this.isVisibilidadCeldaVerFormGastoDepreciacion=true;
			this.isVisibilidadCeldaOrdenGastoDepreciacion=true;
			this.isVisibilidadCeldaNuevoRelacionesGastoDepreciacion=false;
			this.isVisibilidadCeldaModificarGastoDepreciacion=false;
			this.isVisibilidadCeldaActualizarGastoDepreciacion=false;
			this.isVisibilidadCeldaEliminarGastoDepreciacion=false;
			this.isVisibilidadCeldaCancelarGastoDepreciacion=false;
			this.isVisibilidadCeldaGuardarGastoDepreciacion=false;
			this.isVisibilidadCeldaGuardarCambiosGastoDepreciacion=false;
			
			
			this.isVisibilidadFK_IdDetalleGrupoActivoFijo=true;
			this.isVisibilidadFK_IdEmpresa=true;
			
			//ELEMENTOS TABLAS PARAMETOS
			
			
			
			//ELEMENTOS TABLAS PARAMETOS_FIN
			
			//this.actualizarEstadoCeldasBotonesGastoDepreciacion("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
						
			
			
			this.inicializarPermisosGastoDepreciacion();
			
			//INICIALIZAR FALSE, TALVEZ COMENTAR
			this.setPermisosUsuarioGastoDepreciacion(false);
			
			this.setPermisosUsuarioGastoDepreciacion();
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.gastodepreciacionSessionBean.getEsGuardarRelacionado() 
				|| (this.gastodepreciacionSessionBean.getEsGuardarRelacionado() && this.gastodepreciacionSessionBean.getConGuardarRelaciones())) {
				
				this.inicializarSetPermisosUsuarioGastoDepreciacionClasesRelacionadas();
			}
			
			if(this.gastodepreciacionSessionBean.getConGuardarRelaciones()) {
				this.actualizarTabsSetPermisosUsuarioGastoDepreciacionClasesRelacionadas();
			}
			
			
			
			//SOLO SE EJECUTA LA PRIMERA VEZ, BINDINGS SI FUNCIONA
			if(!GastoDepreciacionJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingBotonesPermisosGastoDepreciacion();
			} else {
				this.inicializarActualizarBindingBotonesPermisosManualGastoDepreciacion();
			}
			
			if(!this.isPermisoBusquedaGastoDepreciacion) {
				//BYDAN_BUSQUEDAS
				
				this.jTabbedPaneBusquedasGastoDepreciacion.setVisible(false);				
				
			}
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.gastodepreciacionSessionBean.getEsGuardarRelacionado()) {				
				this.tiposArchivosReportes=Funciones.getListTiposArchivosReportes();
				this.tiposArchivosReportesDinamico=Funciones.getListTiposArchivosReportes();
				this.tiposReportes=Funciones.getListTiposReportes(true);
				this.tiposReportesDinamico=Funciones.getListTiposReportesDinamico(true);
				
				
				this.tiposReportes.add(new Reporte("RELACIONES","RELACIONES"));
				this.tiposReportesDinamico.add(new Reporte("RELACIONES","RELACIONES"));
				
				this.tiposGraficosReportes=Funciones2.getListTiposGraficosReportes();
				this.tiposPaginacion=Funciones2.getListTiposPaginacion(this.isPermisoPaginacionMedioGastoDepreciacion,this.isPermisoPaginacionMedioGastoDepreciacion,this.isPermisoPaginacionTodoGastoDepreciacion);
				this.tiposSeleccionar=Funciones2.getListTiposSeleccionar();
				this.tiposSeleccionar.addAll(GastoDepreciacionConstantesFunciones.getTiposSeleccionarGastoDepreciacion());
				
				this.tiposColumnasSelect=GastoDepreciacionConstantesFunciones.getTiposSeleccionarGastoDepreciacion(true);
				
				this.tiposRelacionesSelect=new ArrayList<Reporte>();								
				
				this.cargarTiposRelacionesSelectGastoDepreciacion();				
				//this.tiposRelacionesSelect=GastoDepreciacionConstantesFunciones.getTiposRelacionesGastoDepreciacion(true);
				
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
			//if(!this.gastodepreciacionSessionBean.getEsGuardarRelacionado()) {
				//SE ENCUENTRA MAS ADELANTE CON ACCIONES POR USUARIO
				//ACCIONES GENERALES Y POR USUARIO
				this.tiposRelaciones=Funciones2.getListTiposRelaciones();
				this.setRelacionesUsuarioGastoDepreciacion();
				
				this.tiposAcciones=Funciones2.getListTiposAcciones(true,false,true);
				this.setAccionesUsuarioGastoDepreciacion(false);	
				
				this.tiposAccionesFormulario=Funciones2.getListTiposAccionesFormulario(true,false,true);							
				this.setAccionesUsuarioGastoDepreciacion(true);	
				
				this.inicializarActualizarBindingtiposArchivosReportesAccionesGastoDepreciacion() ;
			
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
			
			
			this.cuentacontagastodepreLogic=new CuentaContaGastoDepreLogic(); 
			jasperPrint = null;												
			
			//FK
			
			this.empresaLogic=new EmpresaLogic();
			this.detallegrupoactivofijoLogic=new DetalleGrupoActivoFijoLogic();
			
			//PARAMETROS
			
			
			/*
			if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {		
				hashtableEnv =  Funciones.getHashtableEnv();		
				initialContext = new InitialContext(hashtableEnv);	
			}
			*/
			/*
			if(Constantes.ISUSAEJBREMOTE) {
				gastodepreciacionImplementable= (GastoDepreciacionImplementable) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+GastoDepreciacionConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBREMOTE);
			} else if(Constantes.ISUSAEJBHOME) {
				gastodepreciacionImplementableHome= (GastoDepreciacionImplementableHome) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+GastoDepreciacionConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBLOCAL);
			}			
			*/
			
			
			this.gastodepreciacions= new ArrayList<GastoDepreciacion>();
			this.gastodepreciacionsEliminados= new ArrayList<GastoDepreciacion>();
						
			this.isEsNuevoGastoDepreciacion=false;
			this.esParaAccionDesdeFormularioGastoDepreciacion=false;
			this.isEsMantenimientoRelacionesRelacionadoUnico=false;
			this.isEsMantenimientoRelaciones=false;
			this.isEsMantenimientoRelacionado=false;
			this.isContieneImagenes=false;
			
			
			
			
			
			//INICIALIZAR LISTAS FK
			
			this.empresasForeignKey=new ArrayList<Empresa>() ;
			this.detallegrupoactivofijosForeignKey=new ArrayList<DetalleGrupoActivoFijo>() ;
			
			
			
			
			if(blncargarCombostrForeignKey) {
				this.cargarCombosForeignKeyGastoDepreciacion(this.isCargarCombosDependencia);
			}
			
			this.cargarCombosParametroGastoDepreciacion();
			
			
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.gastodepreciacionSessionBean.getEsGuardarRelacionado()) {
				this.onLoad();
			}
						
			GastoDepreciacionBeanSwingJInternalFrameAdditional.RecargarVentanaSegunOpcion(this,opcionActual);
			
			/*
			if(blnCargarInformacionInicial) {
				this.recargarInformacion();
			}
			*/
			//this.iNumeroPaginacionPagina=0;
			//this.iNumeroPaginacion=GastoDepreciacionConstantesFunciones.INUMEROPAGINACION;
			
			this.actualizarEstadoCeldasBotonesGastoDepreciacion("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			//SOLO LA PRIMERA VEZ HACE LOS BINDINGS, SOLO AHI FUNCIONA
			this.inicializarActualizarBindingGastoDepreciacion(true); 
			
			//SE REDIMENSIONA SINO NO SE ACTUALIZA
			this.redimensionarTablaDatos();
			
			
			this.initActions();
			
			;
						
			if(this.jInternalFrameDetalleFormGastoDepreciacion!=null) {//if(this.conCargarFormDetalle) {
				this.cargarMenuRelaciones();
			}
			
			//OBLIGA CARGAR DETALLE, MEJOR DESHABILITAR, FALTA TALVEZ PONER EN SELECCIONAR
			//MAYBE
			//this.updateControlesFormularioGastoDepreciacion();
			
			if(!this.conCargarMinimo) {
				this.updateBusquedasFormularioGastoDepreciacion();
			}
			
			GastoDepreciacionBeanSwingJInternalFrameAdditional.CargaInicial(this, "NORMAL", null);
			
			
			//SE REALIZA ESTO PARA QUE SE PUEDA RECORRER TAB SIN IMPORTAR ORDEN
			Boolean existeTabBusqueda=false;
			
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				
				for(int i=0; i<this.jTabbedPaneBusquedasGastoDepreciacion.getTabCount(); i++) {
					this.jTabbedPaneBusquedasGastoDepreciacion.setSelectedIndex(i);
						
					if(!existeTabBusqueda) {
						existeTabBusqueda=true;
					}
				}
					
				if(existeTabBusqueda) {
					this.jTabbedPaneBusquedasGastoDepreciacion.setSelectedIndex(0);
				}	
				
				
			}
			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.gastodepreciacionLogic.commitNewConnexionToDeep();
			}
			
			
			if(Constantes2.ISDEVELOPING2) {
				end_time = System.currentTimeMillis();			
				String sTipo="Load Ventana";
				Funciones2.getMensajeTiempoEjecucion(start_time, end_time, sTipo,false);
			}  
			
			this.finishProcessGastoDepreciacion(true);
			
			this.dEnd=(double)System.currentTimeMillis();
			
			this.dDif=this.dEnd - this.dStart;
			
			if(Constantes.ISDEVELOPING) {
				System.out.println("Tiempo(ms) Carga GastoDepreciacion: " + this.dDif); 
			}
			
			this.permiteRecargarForm=true;
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.gastodepreciacionLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,GastoDepreciacionConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.gastodepreciacionLogic.closeNewConnexionToDeep();
			}
		}	 
    }
	
	public void cargarTiposRelacionesSelectGastoDepreciacion() {
		Reporte reporte=new Reporte();
		
	

		reporte=new Reporte();
		reporte.setsCodigo(CuentaContaGastoDepreConstantesFunciones.SCLASSWEBTITULO);
		reporte.setsDescripcion(CuentaContaGastoDepreConstantesFunciones.SCLASSWEBTITULO);
		this.tiposRelacionesSelect.add(reporte);
	}
	
	
	
	public void jTabbedPaneChangeListenerGeneral(String sTipo,ChangeEvent evt) { 	  
		Boolean procesaCargarParteTab=false;
			
		try {
			int iIndex=0;		    			
			String sTitle="";
			
			//TABBED PANE RELACIONES
			if(sTipo.equals("RelacionesGastoDepreciacion")) {
				iIndex=this.jInternalFrameDetalleFormGastoDepreciacion.jTabbedPaneRelacionesGastoDepreciacion.getSelectedIndex();		    
			
				sTitle=this.jInternalFrameDetalleFormGastoDepreciacion.jTabbedPaneRelacionesGastoDepreciacion.getTitleAt(iIndex);
				
				Integer intSelectedRow = 0;	
			
				intSelectedRow = this.jTableDatosGastoDepreciacion.getSelectedRow();	
				
				

				if(sTitle.equals("Cuenta Conta Gasto Depres")) {
					if(!CuentaContaGastoDepreJInternalFrame.ESTA_CARGADO_PORPARTE) {
						procesaCargarParteTab=true;
						this.startProcessGastoDepreciacion();

						this.cargarParteTabPanelRelacionadaCuentaContaGastoDepre(iIndex,intSelectedRow);
					}
					
				}
				
			}
			
			//TABBED PANE RELACIONES FIN(EXTRA TAB)
			;
			
  		} catch(Exception e) {
  			e.printStackTrace();
  		} finally {
			if(procesaCargarParteTab) {				
				this.finishProcessGastoDepreciacion();	
			}
		}
    }
	
	

	public void cargarParteTabPanelRelacionadaCuentaContaGastoDepre(int iIndex,int intSelectedRow) throws Exception {
		this.jInternalFrameDetalleFormGastoDepreciacion.cargarSessionConBeanSwingJInternalFrameCuentaContaGastoDepre(false,true,iIndex);
		this.jButtonCuentaContaGastoDepreActionPerformed(null,intSelectedRow,false,true,null);
		this.redimensionarTablaPanelRelacionadaCuentaContaGastoDepre();

		//this.jTabbedPaneRelacionesGastoDepreciacion.updateUI();
		//this.jTabbedPaneRelacionesGastoDepreciacion.removeTabAt(iIndex);
		//this.jTabbedPaneRelacionesGastoDepreciacion.setSelectedIndex(iIndex);


	}
	
	public void jButtonRelacionActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
				 if(sTipo.equals("CuentaContaGastoDepre")) {
				int row=this.jTableDatosGastoDepreciacion.getSelectedRow();
				jButtonCuentaContaGastoDepreActionPerformed(evt,row,true,false,null);
				}
  		} catch(Exception e) {
  			e.printStackTrace();
  		}
    }
	
	public void cargarMenuRelaciones() {	
		JMenuItem jmenuItem= new JMenuItem("General");
		String sLabelMenu="";
		
		if(!this.gastodepreciacionSessionBean.getEsGuardarRelacionado()) {
			for(Reporte reporte:this.tiposRelaciones) {
			

				if(reporte.getsCodigo().equals("Cuenta Conta Gasto Depre")) {

					if(this.isTienePermisosCuentaContaGastoDepre && this.gastodepreciacionConstantesFunciones.mostrarCuentaContaGastoDepreGastoDepreciacion && !GastoDepreciacionConstantesFunciones.ISGUARDARREL) {
						if(Constantes.ISDEVELOPING) {
							sLabelMenu="Cuenta Conta Gasto Depres"+"("+CuentaContaGastoDepreConstantesFunciones.CLASSNAME+")";
						}

						jmenuItem = new JMenuItem(sLabelMenu);
						//jmenuItem.setMnemonic(KeyEvent.VK_S);
						//jmenuItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_S, ActionEvent.ALT_MASK));
						jmenuItem.setActionCommand("Cuenta Conta Gasto Depres");

						if(gastodepreciacionConstantesFunciones.resaltarCuentaContaGastoDepreGastoDepreciacion!=null) {
							jmenuItem.setBorderPainted(true);
							jmenuItem.setBorder(gastodepreciacionConstantesFunciones.resaltarCuentaContaGastoDepreGastoDepreciacion);
						}

						jmenuItem.setEnabled(this.gastodepreciacionConstantesFunciones.activarCuentaContaGastoDepreGastoDepreciacion);

						jmenuItem.addActionListener (new MenuItemRelacionActionListener(this,"CuentaContaGastoDepre"));

						

						this.jInternalFrameDetalleFormGastoDepreciacion.jmenuDetalleGastoDepreciacion.add(jmenuItem);

						
					}

					continue;
				}
			}
		}
	}		
	
	public void cargarCombosForeignKeyGastoDepreciacion(Boolean cargarCombosDependencia) throws Exception {   
		this.cargarCombosForeignKeyGastoDepreciacion(cargarCombosDependencia,true,true);
	}
	
	//CARGAR COMBOS EN LOTE
	public void cargarCombosForeignKeyGastoDepreciacion(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales) throws Exception {   
		this.cargarCombosTodosForeignKeyGastoDepreciacionListas(cargarCombosDependencia);
				
		this.addItemDefectoCombosTodosForeignKeyGastoDepreciacion();
		
		this.cargarCombosFrameForeignKeyGastoDepreciacion();						
		
		if(conInitActions) {
			this.initActionsCombosTodosForeignKeyGastoDepreciacion();
		}
		
		if(conSetVariablesGlobales) {
			this.setVariablesGlobalesCombosForeignKeyGastoDepreciacion();
		}
	}
	
	

	public void cargarCombosForeignKeyDetalleGrupoActivoFijo(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales,String sFinalQueryCombo,String sFormularioTipoBusqueda) throws Exception {
		try {
				this.cargarCombosForeignKeyDetalleGrupoActivoFijoListas(cargarCombosDependencia,sFinalQueryCombo);
				this.addItemDefectoCombosForeignKeyDetalleGrupoActivoFijo();
				this.cargarCombosFrameDetalleGrupoActivoFijosForeignKey(sFormularioTipoBusqueda);

				if(conInitActions) {
				}

			this.recargarComboTablaDetalleGrupoActivoFijo(this.detallegrupoactivofijosForeignKey);

		} catch(Exception e) {
			throw e;
		}
	}
	
	public void jButtonNuevoGastoDepreciacionActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.FORM_RECARGAR;
			String sTipo="NUEVO_NORMAL";
			
			this.estaModoNuevo=true;
			
			if(this.gastodepreciacionSessionBean.getConGuardarRelaciones()) {
				this.dStart=(double)System.currentTimeMillis();
			}
				
			//if(this.esUsoDesdeHijo) {
			//	eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
			//}
											
			if(this.jInternalFrameDetalleFormGastoDepreciacion==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}			
				
			GastoDepreciacionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.gastodepreciacion,new Object(),this.gastodepreciacionParameterGeneral,this.gastodepreciacionReturnGeneral);
			
			
			if(jTableDatosGastoDepreciacion.getRowCount()>=1) {
				jTableDatosGastoDepreciacion.removeRowSelectionInterval(0, jTableDatosGastoDepreciacion.getRowCount()-1);						
			}
			
			this.isEsNuevoGastoDepreciacion=true;
			
			//ESTABLECE SI ES RELACIONADO O NO 
			this.habilitarDeshabilitarTipoMantenimientoGastoDepreciacion(esRelaciones);
			
			this.nuevoPreparar(false); 
			this.habilitarDeshabilitarControlesGastoDepreciacion(true);			
			//this.gastodepreciacion=new GastoDepreciacion();
			//this.gastodepreciacion.setIsChanged(true);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesGastoDepreciacion(false) ;						
			 
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualGastoDepreciacion() ;
			
			if(GastoDepreciacionJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleGastoDepreciacion(esRelaciones);
			}
					
			//Se Duplica, sin sentido
			//this.actualizarInformacion("EVENTO_NUEVO",false,this.gastodepreciacion);	
			this.actualizarInformacion("INFO_PADRE",false,this.gastodepreciacion);				
			
			GastoDepreciacionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.gastodepreciacion,new Object(),this.gastodepreciacionParameterGeneral,this.gastodepreciacionReturnGeneral);
			
			if(this.gastodepreciacionSessionBean.getConGuardarRelaciones()) {
				this.dEnd=(double)System.currentTimeMillis();					
				this.dDif=this.dEnd - this.dStart;
					
				if(Constantes.ISDEVELOPING) {
					System.out.println("Tiempo(ms) Nuevo Preparar GastoDepreciacion: " + this.dDif); 
				}
			}
			
			//false para que pueda generar eventos
			this.estaModoNuevo=false;
							
			//Con this.estaModoNuevo=false;, se permite actualizar y usar eventos control al mismo tiempo (FuncionTipo.LAST)			
			GastoDepreciacionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.LAST,ControlTipo.FORM,EventoTipo.CLIC,EventoSubTipo.NEW,sTipo,this.gastodepreciacion,new Object(),this.gastodepreciacionParameterGeneral,this.gastodepreciacionReturnGeneral);
			
		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,GastoDepreciacionConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;			
		}
	}
	
	public void jButtonDuplicarGastoDepreciacionActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			Boolean soloDuplicarUno=false;
			Boolean conSeleccionarFilaTabla=false;
			
			this.estaModoNuevo=true;
			this.estaModoDuplicar=true;
			
			ArrayList<GastoDepreciacion> gastodepreciacionsSeleccionados=new ArrayList<GastoDepreciacion>();
			int intSelectedRow =-1;
			Integer iNumRowsSeleccionados=0;
			int[] arrNumRowsSeleccionados=null;
			
			//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
			if(conSeleccionarFilaTabla) {
				arrNumRowsSeleccionados=this.jTableDatosGastoDepreciacion.getSelectedRows();
				iNumRowsSeleccionados=this.jTableDatosGastoDepreciacion.getSelectedRows().length;			
			}
			
			gastodepreciacionsSeleccionados=this.getGastoDepreciacionsSeleccionados(false);
				
			if((soloDuplicarUno && iNumRowsSeleccionados.equals(1)) || !soloDuplicarUno) {
				//LO HACE NUEVOPREPARAR
				//this.iIdNuevoGastoDepreciacion--;			
				//GastoDepreciacion gastodepreciacionAux= new GastoDepreciacion();			
				//gastodepreciacionAux.setId(this.iIdNuevoGastoDepreciacion);																
				
				//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
				//GastoDepreciacion gastodepreciacionOrigen=new GastoDepreciacion();
				//for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {				
				
				for(GastoDepreciacion gastodepreciacionOrigen : gastodepreciacionsSeleccionados) {
					if(conSeleccionarFilaTabla) {
						if(!soloDuplicarUno) {
							//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
							//intSelectedRow =iNumRowSeleccionado;
						} else {
							intSelectedRow = this.jTableDatosGastoDepreciacion.getSelectedRow();
						}
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							gastodepreciacionOrigen =(GastoDepreciacion) this.gastodepreciacionLogic.getGastoDepreciacions().toArray()[this.jTableDatosGastoDepreciacion.convertRowIndexToModel(intSelectedRow)];
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							gastodepreciacionOrigen =(GastoDepreciacion) this.gastodepreciacions.toArray()[this.jTableDatosGastoDepreciacion.convertRowIndexToModel(intSelectedRow)];
						}
					}
					
					this.aumentarTamanioFilaNuevaTablaGastoDepreciacion();
					
					if(this.conTotales) {
						this.quitarFilaTotales();
					}
					
					this.nuevoPreparar(true);
					
					this.gastodepreciacion.setsType("DUPLICADO");
					
					this.setCopiarVariablesObjetosGastoDepreciacion(gastodepreciacionOrigen,this.gastodepreciacion,true,true);
					
					this.setVariablesFormularioToObjetoActualForeignKeysGastoDepreciacion(this.gastodepreciacion);
					
					//LO HACE NUEVOPREPARAR
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.gastodepreciacionLogic.getGastoDepreciacions().add(this.gastodepreciacionAux);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.gastodepreciacions.add(this.gastodepreciacionAux);				
					}
					*/
				}
				
				this.inicializarActualizarBindingTablaGastoDepreciacion(false);
				
				this.jTableDatosGastoDepreciacion.setRowSelectionInterval(this.getIndiceNuevoGastoDepreciacion(), this.getIndiceNuevoGastoDepreciacion());
				
				int iLastRow =  this.jTableDatosGastoDepreciacion.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosGastoDepreciacion.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosGastoDepreciacion.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaGastoDepreciacion(false);
				}
			} else {
				throw new Exception("DEBE ESTAR SELECCIONADO 1 REGISTRO");
			}
			
		} catch(Exception e) {			
			FuncionesSwing.manageException(this, e,logger,GastoDepreciacionConstantesFunciones.CLASSNAME);
		
		} finally {
			this.estaModoNuevo=false;
			this.estaModoDuplicar=false;
		}
	}
	
	public void jButtonCopiarGastoDepreciacionActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			Boolean conSeleccionarFilaTabla=false;
			Integer iNumRowsSeleccionados=0;
			int[] intSelectedRows =null;
			int intSelectedRow =0;
			
			this.estaModoCopiar=true;
			
			ArrayList<GastoDepreciacion> gastodepreciacionsSeleccionados=new ArrayList<GastoDepreciacion>();									
		
			GastoDepreciacion gastodepreciacionOrigen=new GastoDepreciacion();
			GastoDepreciacion gastodepreciacionDestino=new GastoDepreciacion();
				
			gastodepreciacionsSeleccionados=this.getGastoDepreciacionsSeleccionados(false);
			
			if(conSeleccionarFilaTabla) {
				iNumRowsSeleccionados=this.jTableDatosGastoDepreciacion.getSelectedRows().length;	
			}
			
			if(iNumRowsSeleccionados.equals(2) || gastodepreciacionsSeleccionados.size()==2) {
				if(conSeleccionarFilaTabla) {
					intSelectedRows =this.jTableDatosGastoDepreciacion.getSelectedRows();
					intSelectedRow = intSelectedRows[0];	
									
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						gastodepreciacionOrigen =(GastoDepreciacion) this.gastodepreciacionLogic.getGastoDepreciacions().toArray()[this.jTableDatosGastoDepreciacion.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						gastodepreciacionOrigen =(GastoDepreciacion) this.gastodepreciacions.toArray()[this.jTableDatosGastoDepreciacion.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					intSelectedRow = intSelectedRows[1];
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						gastodepreciacionDestino =(GastoDepreciacion) this.gastodepreciacionLogic.getGastoDepreciacions().toArray()[this.jTableDatosGastoDepreciacion.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						gastodepreciacionDestino =(GastoDepreciacion) this.gastodepreciacions.toArray()[this.jTableDatosGastoDepreciacion.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				}
				
				gastodepreciacionOrigen =gastodepreciacionsSeleccionados.get(0);
				gastodepreciacionDestino =gastodepreciacionsSeleccionados.get(1);
				
				this.setCopiarVariablesObjetosGastoDepreciacion(gastodepreciacionOrigen,gastodepreciacionDestino,true,false);
				
				gastodepreciacionDestino.setsType("DUPLICADO");
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(gastodepreciacionDestino,gastodepreciacionLogic.getGastoDepreciacions());					
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(gastodepreciacionDestino,gastodepreciacions);
				}
				//ARCHITECTURE
				
				this.inicializarActualizarBindingTablaGastoDepreciacion(false);
				
				//this.jTableDatosGastoDepreciacion.setRowSelectionInterval(this.getIndiceNuevoGastoDepreciacion(), this.getIndiceNuevoGastoDepreciacion());
				
				int iLastRow =  this.jTableDatosGastoDepreciacion.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosGastoDepreciacion.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosGastoDepreciacion.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					//this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaGastoDepreciacion(false);
				}
			} else {
				throw new Exception("DEBEN ESTAR SELECCIONADOS 2 REGISTROS");
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,GastoDepreciacionConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.estaModoCopiar=false;
		}
	}
	
	public void jButtonVerFormGastoDepreciacionActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormGastoDepreciacion==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.jInternalFrameDetalleFormGastoDepreciacion.setSelected(true);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,GastoDepreciacionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonMostrarOcultarGastoDepreciacionActionPerformed(ActionEvent evt) throws Exception {   
		try {
			Boolean isVisible=this.jPanelParametrosReportesGastoDepreciacion.isVisible();
			
			//BYDAN_BUSQUEDAS
			
			this.jTabbedPaneBusquedasGastoDepreciacion.setVisible(!isVisible);			
			
			
			this.jPanelParametrosReportesGastoDepreciacion.setVisible(!isVisible);
			this.jPanelPaginacionGastoDepreciacion.setVisible(!isVisible);
			this.jPanelAccionesGastoDepreciacion.setVisible(!isVisible);
							
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,GastoDepreciacionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarGastoDepreciacionActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.closingInternalFrameGastoDepreciacion();
			
			//if(this.jInternalFrameParent==null) {
				//this.dispose();
			/*} else {
				this.setVisible(false);
	        	this.setSelected(false);	
			}*/			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,GastoDepreciacionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarReporteDinamicoGastoDepreciacionActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameReporteDinamicoGastoDepreciacion();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,GastoDepreciacionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarImportacionGastoDepreciacionActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameImportacionGastoDepreciacion();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,GastoDepreciacionConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonAbrirOrderByGastoDepreciacionActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			
			this.abrirInicializarFrameOrderByGastoDepreciacion();
			
			this.abrirFrameOrderByGastoDepreciacion();
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,GastoDepreciacionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarOrderByGastoDepreciacionActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameOrderByGastoDepreciacion();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,GastoDepreciacionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void abrirFrameDetalleGastoDepreciacion(Boolean esRelaciones) throws Exception {	    	        
	    try {
			//CAUSA PROBLEMAS, SE ADICIONA EN CONSTRUCTOR, LUEGO SOLO VISIBLE true y false
			//this.jDesktopPane.add(jInternalFrameDetalleFormGastoDepreciacion);
			
			if(!esRelaciones) {
				if(this.jInternalFrameDetalleFormGastoDepreciacion.isMaximum()) {
					this.jInternalFrameDetalleFormGastoDepreciacion.setMaximum(false);
				}								
				
	    		this.jInternalFrameDetalleFormGastoDepreciacion.setSize(this.jInternalFrameDetalleFormGastoDepreciacion.iWidthFormulario,this.jInternalFrameDetalleFormGastoDepreciacion.iHeightFormulario);
	    	} else {
				if(this.iWidthScroll<this.jInternalFrameDetalleFormGastoDepreciacion.iWidthFormularioMaximo) {
	    			this.jInternalFrameDetalleFormGastoDepreciacion.setSize(this.iWidthScroll,this.iHeightScroll);
				} else {
					if(!this.jInternalFrameDetalleFormGastoDepreciacion.isMaximum()) {
						this.jInternalFrameDetalleFormGastoDepreciacion.setMaximum(true);
					}
				}
				
				if(this.jInternalFrameDetalleFormGastoDepreciacion.jContentPaneDetalleGastoDepreciacion.getWidth() > this.getWidth()) {
					this.jInternalFrameDetalleFormGastoDepreciacion.jTabbedPaneRelacionesGastoDepreciacion.setMinimumSize(new Dimension(this.jInternalFrameDetalleFormGastoDepreciacion.jContentPaneDetalleGastoDepreciacion.getWidth(),GastoDepreciacionConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormGastoDepreciacion.jTabbedPaneRelacionesGastoDepreciacion.setMaximumSize(new Dimension(this.jInternalFrameDetalleFormGastoDepreciacion.jContentPaneDetalleGastoDepreciacion.getWidth(),GastoDepreciacionConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormGastoDepreciacion.jTabbedPaneRelacionesGastoDepreciacion.setPreferredSize(new Dimension(this.jInternalFrameDetalleFormGastoDepreciacion.jContentPaneDetalleGastoDepreciacion.getWidth(),GastoDepreciacionConstantesFunciones.ALTO_TABPANE_RELACIONES));
					
					Dimension dimension=new Dimension(); 
					
					

					if(CuentaContaGastoDepreJInternalFrame.ESTA_CARGADO_PORPARTE) {
						this.redimensionarTablaPanelRelacionadaCuentaContaGastoDepre();
					}
					
				}
	    	}
			
		
	       	this.jInternalFrameDetalleFormGastoDepreciacion.setVisible(true);
	        this.jInternalFrameDetalleFormGastoDepreciacion.setSelected(true);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,GastoDepreciacionConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirInicializarFrameOrderByGastoDepreciacion() throws Exception {	    	        
	    try {
			if(this.jInternalFrameOrderByGastoDepreciacion==null) {
				
				if(!this.conCargarMinimo) {
					this.jInternalFrameOrderByGastoDepreciacion=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByGastoDepreciacion,false,this);
				} else {
					this.jInternalFrameOrderByGastoDepreciacion=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByGastoDepreciacion,true,this);
				}
				
				this.jDesktopPane.add(this.jInternalFrameOrderByGastoDepreciacion);
				this.jInternalFrameOrderByGastoDepreciacion.setVisible(false);
				this.jInternalFrameOrderByGastoDepreciacion.setSelected(false);
				
				this.jInternalFrameOrderByGastoDepreciacion.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByGastoDepreciacion"));
				
				this.inicializarActualizarBindingTablaOrderByGastoDepreciacion();
			}
		} catch (final Exception e) {
			
		}
	}
	
	
	
	public void abrirInicializarFrameImportacionGastoDepreciacion() throws Exception {	    	        
	    try {
			if(this.jInternalFrameImportacionGastoDepreciacion==null) {
				
				this.jInternalFrameImportacionGastoDepreciacion=new ImportacionJInternalFrame(GastoDepreciacionConstantesFunciones.SCLASSWEBTITULO,this);			
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionGastoDepreciacion);							
				
				this.jDesktopPane.add(this.jInternalFrameImportacionGastoDepreciacion);
				this.jInternalFrameImportacionGastoDepreciacion.setVisible(false);
				this.jInternalFrameImportacionGastoDepreciacion.setSelected(false);


				this.jInternalFrameImportacionGastoDepreciacion.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionGastoDepreciacion"));
				this.jInternalFrameImportacionGastoDepreciacion.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionGastoDepreciacion"));
				this.jInternalFrameImportacionGastoDepreciacion.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionGastoDepreciacion"));


			}
		} catch (final Exception e) {
			
		}
	}		
	
	
	
	public void abrirInicializarFrameReporteDinamicoGastoDepreciacion() throws Exception {	    	        
	    try {
			
			if(this.jInternalFrameReporteDinamicoGastoDepreciacion==null) {
				this.jInternalFrameReporteDinamicoGastoDepreciacion=new ReporteDinamicoJInternalFrame(GastoDepreciacionConstantesFunciones.SCLASSWEBTITULO,this);	
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoGastoDepreciacion);	
	
	
				this.jDesktopPane.add(this.jInternalFrameReporteDinamicoGastoDepreciacion);
				this.jInternalFrameReporteDinamicoGastoDepreciacion.setVisible(false);
				this.jInternalFrameReporteDinamicoGastoDepreciacion.setSelected(false);
	
	
	
				this.jInternalFrameReporteDinamicoGastoDepreciacion.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoGastoDepreciacion"));
				this.jInternalFrameReporteDinamicoGastoDepreciacion.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoGastoDepreciacion"));
				this.jInternalFrameReporteDinamicoGastoDepreciacion.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoGastoDepreciacion"));
	
				this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualGastoDepreciacion();
			}

		} catch (final Exception e) {
			
		}
	}	
	
	
	
		

	public void redimensionarTablaPanelRelacionadaCuentaContaGastoDepre() {
		Dimension dimension=new Dimension();

		dimension=this.jInternalFrameDetalleFormGastoDepreciacion.cuentacontagastodepreBeanSwingJInternalFrame.jScrollPanelDatosCuentaContaGastoDepre.getPreferredSize();
		dimension.setSize(this.jInternalFrameDetalleFormGastoDepreciacion.jContentPaneDetalleGastoDepreciacion.getWidth(),dimension.getHeight());

		this.jInternalFrameDetalleFormGastoDepreciacion.cuentacontagastodepreBeanSwingJInternalFrame.jScrollPanelDatosCuentaContaGastoDepre.setMinimumSize(dimension);
		this.jInternalFrameDetalleFormGastoDepreciacion.cuentacontagastodepreBeanSwingJInternalFrame.jScrollPanelDatosCuentaContaGastoDepre.setMaximumSize(dimension);
		this.jInternalFrameDetalleFormGastoDepreciacion.cuentacontagastodepreBeanSwingJInternalFrame.jScrollPanelDatosCuentaContaGastoDepre.setPreferredSize(dimension);


	}
					
	public void cerrarFrameDetalleGastoDepreciacion() throws Exception {	    	        
	    try {
			//this.jDesktopPane.add(jInternalFrameDetalleFormGastoDepreciacion);
			
	       	this.jInternalFrameDetalleFormGastoDepreciacion.setVisible(false);
	        this.jInternalFrameDetalleFormGastoDepreciacion.setSelected(false);
			
			//this.jInternalFrameDetalleFormGastoDepreciacion.dispose();
			//this.jInternalFrameDetalleFormGastoDepreciacion=null;
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,GastoDepreciacionConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirFrameReporteDinamicoGastoDepreciacion() throws Exception {	    	        
	    try {
			
			this.jInternalFrameReporteDinamicoGastoDepreciacion.setVisible(true);
	        this.jInternalFrameReporteDinamicoGastoDepreciacion.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,GastoDepreciacionConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void abrirFrameImportacionGastoDepreciacion() throws Exception {	    	        		
	    try {			
			this.jInternalFrameImportacionGastoDepreciacion.setVisible(true);
	        this.jInternalFrameImportacionGastoDepreciacion.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,GastoDepreciacionConstantesFunciones.CLASSNAME);
	    }		
	}	
	
	
	
	
	
	public void abrirFrameOrderByGastoDepreciacion() throws Exception {	    	        		
	    try {
			this.jInternalFrameOrderByGastoDepreciacion.setVisible(true);
	        this.jInternalFrameOrderByGastoDepreciacion.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,GastoDepreciacionConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameOrderByGastoDepreciacion() throws Exception {	    	        		
	    try {			
			this.jInternalFrameOrderByGastoDepreciacion.setVisible(false);
	        this.jInternalFrameOrderByGastoDepreciacion.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,GastoDepreciacionConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameReporteDinamicoGastoDepreciacion() throws Exception {			
	    try {
			this.jInternalFrameReporteDinamicoGastoDepreciacion.setVisible(false);
	        this.jInternalFrameReporteDinamicoGastoDepreciacion.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,GastoDepreciacionConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameImportacionGastoDepreciacion() throws Exception {	    	        		
	    try {
			this.jInternalFrameImportacionGastoDepreciacion.setVisible(false);
	        this.jInternalFrameImportacionGastoDepreciacion.setSelected(false);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,GastoDepreciacionConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	
	public void jButtonModificarGastoDepreciacionActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.modificarGastoDepreciacion(evt,-1,false);
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,GastoDepreciacionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void modificarGastoDepreciacion(ActionEvent evt,int rowIndex,Boolean esRelaciones) throws Exception {   
		try {
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosGastoDepreciacion.getSelectedRow();
			}
			
			this.habilitarDeshabilitarControlesGastoDepreciacion(true);
			//this.isEsNuevoGastoDepreciacion=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.gastodepreciacion =(GastoDepreciacion) this.gastodepreciacionLogic.getGastoDepreciacions().toArray()[this.jTableDatosGastoDepreciacion.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.gastodepreciacion =(GastoDepreciacion) this.gastodepreciacions.toArray()[this.jTableDatosGastoDepreciacion.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.actualizarEstadoCeldasBotonesGastoDepreciacion("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesGastoDepreciacion(false) ;
			
			if(gastodepreciacionSessionBean.getConGuardarRelaciones()) {
			

				if(this.jInternalFrameDetalleFormGastoDepreciacion.cuentacontagastodepreBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormGastoDepreciacion.cuentacontagastodepreBeanSwingJInternalFrame.cuentacontagastodepreSessionBean.getEsGuardarRelacionado() && CuentaContaGastoDepreJInternalFrame.ESTA_CARGADO_PORPARTE) {
					this.jButtonCuentaContaGastoDepreActionPerformed(null,intSelectedRow,false,true,null);
				}
			}
			
			if(GastoDepreciacionJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleGastoDepreciacion(esRelaciones);
			}
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualGastoDepreciacion(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,GastoDepreciacionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarFilaTablaGastoDepreciacionActual() { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL
			Integer intSelectedRow = this.jTableDatosGastoDepreciacion.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.gastodepreciacion =(GastoDepreciacion) this.gastodepreciacionLogic.getGastoDepreciacions().toArray()[this.jTableDatosGastoDepreciacion.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.gastodepreciacion =(GastoDepreciacion) this.gastodepreciacions.toArray()[this.jTableDatosGastoDepreciacion.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,GastoDepreciacionConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void seleccionarGastoDepreciacion(ActionEvent evt,int rowIndex) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormGastoDepreciacion==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosGastoDepreciacion.getSelectedRow();
			}
			
			//this.habilitarDeshabilitarControlesGastoDepreciacion(true);
			//this.isEsNuevoGastoDepreciacion=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.gastodepreciacion =(GastoDepreciacion) this.gastodepreciacionLogic.getGastoDepreciacions().toArray()[this.jTableDatosGastoDepreciacion.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.gastodepreciacion =(GastoDepreciacion) this.gastodepreciacions.toArray()[this.jTableDatosGastoDepreciacion.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.jInternalFrameParent.setIdCombosCodigoDesdeBusquedaForeignKey(this.gastodepreciacion.getId(),this.sTipoBusqueda);
			
			this.dispose();
			
			//this.actualizarEstadoCeldasBotonesGastoDepreciacion("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			/*
			this.inicializarActualizarBindingBotonesGastoDepreciacion(false) ;
			
			if(GastoDepreciacionJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleGastoDepreciacion(esRelaciones);
			}
			*/
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualGastoDepreciacion(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,GastoDepreciacionConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void setIdCombosCodigoDesdeBusquedaForeignKey(Long id,String sType)throws Exception{
		
		try {
		} catch(Exception e) {
			throw e;
		}
	}
	
		
	
	public void recargarComboTablaDetalleGrupoActivoFijo(List<DetalleGrupoActivoFijo> detallegrupoactivofijosForeignKey)throws Exception{
		TableColumn tableColumnDetalleGrupoActivoFijo=this.jTableDatosGastoDepreciacion.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosGastoDepreciacion,GastoDepreciacionConstantesFunciones.LABEL_IDDETALLEGRUPOACTIVOFIJO));
		TableCellEditor tableCellEditorDetalleGrupoActivoFijo =tableColumnDetalleGrupoActivoFijo.getCellEditor();

		DetalleGrupoActivoFijoTableCell detallegrupoactivofijoTableCellFk=(DetalleGrupoActivoFijoTableCell)tableCellEditorDetalleGrupoActivoFijo;

		if(detallegrupoactivofijoTableCellFk!=null) {
			detallegrupoactivofijoTableCellFk.setdetallegrupoactivofijosForeignKey(detallegrupoactivofijosForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosGastoDepreciacion.getSelectedRow();

		//if(intSelectedRow<=0) {
			//detallegrupoactivofijoTableCellFk.setRowActual(intSelectedRow);
			//detallegrupoactivofijoTableCellFk.setdetallegrupoactivofijosForeignKeyActual(detallegrupoactivofijosForeignKey);
		//}


		if(detallegrupoactivofijoTableCellFk!=null) {
			detallegrupoactivofijoTableCellFk.RecargarDetalleGrupoActivoFijosForeignKey();
			//ACTUALIZA COMBOS DE TABLA-FIN
		}

	}	
	
	
	
	public void jButtonActualizarGastoDepreciacionActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.gastodepreciacionLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingParametrosReportesGastoDepreciacion(false);
			
			//if(!this.isEsNuevoGastoDepreciacion) {								
				int intSelectedRow = this.jTableDatosGastoDepreciacion.getSelectedRow();	
				
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.gastodepreciacion =(GastoDepreciacion) this.gastodepreciacionLogic.getGastoDepreciacions().toArray()[this.jTableDatosGastoDepreciacion.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.gastodepreciacion =(GastoDepreciacion) this.gastodepreciacions.toArray()[this.jTableDatosGastoDepreciacion.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
			//}
				
			if(GastoDepreciacionJInternalFrame.ISBINDING_MANUAL_TABLA) {
				this.setVariablesFormularioToObjetoActualGastoDepreciacion(this.gastodepreciacion,true);
				this.setVariablesFormularioToObjetoActualForeignKeysGastoDepreciacion(this.gastodepreciacion);
				
			}
			
			if(this.permiteMantenimiento(this.gastodepreciacion)) {	
				this.actualizar();
				
				if(!this.isGuardarCambiosEnLote && !this.gastodepreciacionSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
					
					this.isEsNuevoGastoDepreciacion=true;
					this.inicializarActualizarBindingTablaGastoDepreciacion(false);
					this.isEsNuevoGastoDepreciacion=false;
				
				} else {					
					
					//PARA RELACIONADO ACTUALIZAR FILA TOTALES
					this.isEsNuevoGastoDepreciacion=true;
					this.procesoActualizarFilaTotales(false,"MANTENIMIENTO");
					this.isEsNuevoGastoDepreciacion=false;
				}
						
								
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesGastoDepreciacion(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualGastoDepreciacion(false);
				
				this.habilitarDeshabilitarControlesGastoDepreciacion(false);
			
												
				
				if(GastoDepreciacionJInternalFrame.CON_DATOS_FRAME) {
					if(!this.isPostAccionSinCerrar) {
						this.cerrarFrameDetalleGastoDepreciacion();
					}
				}
				
				if(this.isPostAccionNuevo) {
					this.jButtonNuevoGastoDepreciacionActionPerformed(evt,gastodepreciacionSessionBean.getConGuardarRelaciones());
				} else {
					if(this.isPostAccionSinCerrar) {
						Integer intSelectedRowActual=this.getIndiceActualGastoDepreciacion(this.gastodepreciacion,intSelectedRow);
						
						if(intSelectedRow>-1) {
							this.jTableDatosGastoDepreciacion.setRowSelectionInterval(intSelectedRowActual, intSelectedRowActual);
							this.jButtonIdActionPerformed(evt,intSelectedRowActual,gastodepreciacionSessionBean.getConGuardarRelaciones(),false);
						}
					}
				}
				
				this.cancelar(false);
				
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.gastodepreciacionLogic.commitNewConnexionToDeep();
			}
			
			
			if(this.jInternalFrameParent!=null) { //&& this.isEsMantenimientoRelacionado) {
				Boolean esUsoDesdeHijoLocal=true;
				String sTipo="Formulario";
				Boolean conIrServidorAplicacionParent=false;
				Long id=this.gastodepreciacion.getId();
				ArrayList<String> arrClasses=new ArrayList<String>();
				
				GeneralEntityParameterGeneral generalEntityParameterGeneral=new GeneralEntityParameterGeneral();
				
				generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
				generalEntityParameterGeneral.setsDominio("Formulario");
				generalEntityParameterGeneral.setsDominioTipo(GastoDepreciacion.class.getName());
				
				this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",GastoDepreciacion.class.getName(),sTipo,"FORMULARIO",esControlTabla,conIrServidorAplicacionParent,
					id,this, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.FORM,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
					evt,generalEntityParameterGeneral,this);
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.gastodepreciacionLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,GastoDepreciacionConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.gastodepreciacionLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonEliminarGastoDepreciacionActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.gastodepreciacionLogic.getNewConnexionToDeep("");
			}
			
			int intSelectedRow = this.jTableDatosGastoDepreciacion.getSelectedRow();	       
							
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.gastodepreciacion =(GastoDepreciacion) this.gastodepreciacionLogic.getGastoDepreciacions().toArray()[this.jTableDatosGastoDepreciacion.convertRowIndexToModel(intSelectedRow)];
				this.gastodepreciacion.setIsDeleted(true);
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.gastodepreciacion =(GastoDepreciacion) this.gastodepreciacions.toArray()[this.jTableDatosGastoDepreciacion.convertRowIndexToModel(intSelectedRow)];
				this.gastodepreciacion.setIsDeleted(true);
			}
			//ARCHITECTURE
			
			if(this.permiteMantenimiento(this.gastodepreciacion)) {
				this.eliminar();
				
				if(!this.isGuardarCambiosEnLote && !this.gastodepreciacionSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
				}
				
				((GastoDepreciacionModel) this.jTableDatosGastoDepreciacion.getModel()).fireTableRowsDeleted(intSelectedRow,intSelectedRow);
				
				this.isEsNuevoGastoDepreciacion=true;
				this.inicializarActualizarBindingTablaGastoDepreciacion(false);
				this.isEsNuevoGastoDepreciacion=false;									
					
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesGastoDepreciacion(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualGastoDepreciacion(false);
				
				this.habilitarDeshabilitarControlesGastoDepreciacion(false);
				
				
				
				if(GastoDepreciacionJInternalFrame.CON_DATOS_FRAME) {
					this.cerrarFrameDetalleGastoDepreciacion();
				}
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.gastodepreciacionLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.gastodepreciacionLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,GastoDepreciacionConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.gastodepreciacionLogic.closeNewConnexionToDeep();
			}
		}		
	}
		
	public void jButtonCancelarGastoDepreciacionActionPerformed(ActionEvent evt) throws Exception {                                         	   	       
	  	try {
			if(jTableDatosGastoDepreciacion.getRowCount()>=1) {
				jTableDatosGastoDepreciacion.removeRowSelectionInterval(0, jTableDatosGastoDepreciacion.getRowCount()-1);						
			}
						
			this.invalidValues=new InvalidValue[0];
			this.habilitarDeshabilitarControlesGastoDepreciacion(false);
			this.cancelar(true);			
			this.inicializarActualizarBindingTablaGastoDepreciacion(false);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesGastoDepreciacion(false) ;
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualGastoDepreciacion(false) ;
			
			this.isEsNuevoGastoDepreciacion=false;
			
			if(GastoDepreciacionJInternalFrame.CON_DATOS_FRAME) {
				this.cerrarFrameDetalleGastoDepreciacion();
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,GastoDepreciacionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonGuardarCambiosGastoDepreciacionActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.gastodepreciacionLogic.getNewConnexionToDeep("");
			}
			
			//this.estaModoGuardarCambios=true;
			
	    	this.guardarCambios();
			
			if(!this.isErrorGuardar) {
				this.procesarBusqueda(this.sAccionBusqueda);
				
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingGastoDepreciacion(false);
				
				//SI ES MANUAL
				if(GastoDepreciacionJInternalFrame.ISBINDING_MANUAL) {				
					//this.inicializarActualizarBindingManualGastoDepreciacion();				
				}
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.gastodepreciacionLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.gastodepreciacionLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,GastoDepreciacionConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.gastodepreciacionLogic.closeNewConnexionToDeep();
			}
			
			//this.estaModoGuardarCambios=false;
		}
	}
	
	public void jButtonNuevoGuardarCambiosGastoDepreciacionActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			this.estaModoNuevo=true;
			this.estaModoNuevoGuardarCambios=true;
			
			//LO HACE NUEVOPREPARAR
			//this.iIdNuevoGastoDepreciacion--;			
			//GastoDepreciacion gastodepreciacionAux= new GastoDepreciacion();			
			//gastodepreciacionAux.setId(this.iIdNuevoGastoDepreciacion);
			
			if(this.jInternalFrameDetalleFormGastoDepreciacion==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.aumentarTamanioFilaNuevaTablaGastoDepreciacion();
			
			if(this.conTotales) {
				this.quitarFilaTotales();
			}
			
			this.nuevoPreparar(true);
			
			this.setVariablesFormularioToObjetoActualForeignKeysGastoDepreciacion(this.gastodepreciacion);
			
			this.gastodepreciacion.setsType("NUEVO_GUARDAR_CAMBIOS");
			
			//LO HACE NUEVOPREPARAR
			/*
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				this.gastodepreciacionLogic.getGastoDepreciacions().add(this.gastodepreciacionAux);
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				this.gastodepreciacions.add(this.gastodepreciacionAux);				
			}
			*/
			
			this.inicializarActualizarBindingTablaGastoDepreciacion(false);
			
			this.jTableDatosGastoDepreciacion.setRowSelectionInterval(this.getIndiceNuevoGastoDepreciacion(), this.getIndiceNuevoGastoDepreciacion());
			
			int iLastRow =  this.jTableDatosGastoDepreciacion.getRowCount () - 1;
			Rectangle rectangle = this.jTableDatosGastoDepreciacion.getCellRect(iLastRow, 0, true);
			
			this.jTableDatosGastoDepreciacion.scrollRectToVisible(rectangle);
			
			//FILA TOTALES
			if(this.conTotales) {
				this.crearFilaTotales();
				
				this.inicializarActualizarBindingTablaGastoDepreciacion(false);
			}

		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,GastoDepreciacionConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;
			this.estaModoNuevoGuardarCambios=false;
		}
	}		
	
	public void jButtonRecargarInformacionGastoDepreciacionActionPerformed(ActionEvent evt) throws Exception {    		
		try {
			this.iNumeroPaginacionPagina=0;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.gastodepreciacionLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingGastoDepreciacion(false,false);
			
	    	this.recargarInformacion();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingGastoDepreciacion(false);
			
			//SI ES MANUAL
			if(GastoDepreciacionJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualGastoDepreciacion();
			}
			
			//this.abrirFrameTreeGastoDepreciacion();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.gastodepreciacionLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.gastodepreciacionLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,GastoDepreciacionConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.gastodepreciacionLogic.closeNewConnexionToDeep();
			}
		}	
	}
	
	
	public void jButtonGenerarImportacionGastoDepreciacionActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedReader bufferedReader = null;
		String sXmlStringFile="";
		String sPath="";
		this.arrDatoGeneralMinimos= new  ArrayList<DatoGeneralMinimo>();
		DatoGeneralMinimo datoGeneralMinimo=new DatoGeneralMinimo();
		String sLine="";
		
		try {			
			if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR IMPORTACION DE Gasto DepreciacionES ?", "MANTENIMIENTO DE Gasto Depreciacion", JOptionPane.OK_CANCEL_OPTION) == 0) {
				bufferedReader = new BufferedReader(new FileReader(this.jInternalFrameImportacionGastoDepreciacion.getFileImportacion().getAbsolutePath()));
								
				while ((sLine = bufferedReader.readLine()) != null) {
					datoGeneralMinimo=new DatoGeneralMinimo();
					datoGeneralMinimo.setsDescripcion(sLine);
					
					this.arrDatoGeneralMinimos.add(datoGeneralMinimo);
				}
				
				this.actualizarParametrosGeneralGastoDepreciacion();
						
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {						
					this.gastodepreciacionReturnGeneral=gastodepreciacionLogic.procesarImportacionGastoDepreciacionsWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this.arrDatoGeneralMinimos,this.gastodepreciacionParameterGeneral);
						
				} else if(Constantes.ISUSAEJBREMOTE) {
						
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
						
				this.procesarGastoDepreciacionReturnGeneral();
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,GastoDepreciacionConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedReader != null) {
				bufferedReader.close();
			}	
		}				
	}
	
	
	
	public void jButtonAbrirImportacionGastoDepreciacionActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {
			int iReturnArchivo = this.jInternalFrameImportacionGastoDepreciacion.getjFileChooserImportacion().showOpenDialog(this);
 
            if (iReturnArchivo == JFileChooser.APPROVE_OPTION) {
            	this.jInternalFrameImportacionGastoDepreciacion.setFileImportacion(this.jInternalFrameImportacionGastoDepreciacion.getjFileChooserImportacion().getSelectedFile());
            	
				this.jInternalFrameImportacionGastoDepreciacion.getjTextFieldPathArchivoImportacion().setText(this.jInternalFrameImportacionGastoDepreciacion.getFileImportacion().getName());
				
				//System.out.println("ARCHIVO ESCOGIDO: "+this.fileImportacionGastoDepreciacion.getName());
				
            } else {
                //System.out.println("CANCELAR SELECCION");
				this.jInternalFrameImportacionGastoDepreciacion.getjTextFieldPathArchivoImportacion().setText("SELECCION CANCELADA");
            }			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,GastoDepreciacionConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedWriter != null) {
				bufferedWriter.close();
			}	
		}		
	}
	
	
	public void jButtonGenerarReporteDinamicoGastoDepreciacionActionPerformed(ActionEvent evt) throws Exception {    		
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {	
		
		ArrayList<GastoDepreciacion> gastodepreciacionsSeleccionados=new ArrayList<GastoDepreciacion>();		

		gastodepreciacionsSeleccionados=this.getGastoDepreciacionsSeleccionados(true);
		
		
		this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoGastoDepreciacion.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();
		
		this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoGastoDepreciacion.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
		
		
		this.sTipoArchivoReporte=this.sTipoArchivoReporteDinamico;
		
		//this.sTipoReporteExtra="Base";
		
			InputStream reportFile=null;
			InputStream imageFile=null;
			
			imageFile=AuxiliarImagenes.class.getResourceAsStream("LogoReporte.jpg");			
				
		
		
			reportFile = AuxiliarReportes.class.getResourceAsStream("GastoDepreciacionBaseDesign.jrxml");	
			
			sPath=this.parametroGeneralUsuario.getpath_exportar()+"GastoDepreciacionBaseDesign.jrxml";
			
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
			
			this.generarReporteGastoDepreciacions("Todos",gastodepreciacionsSeleccionados );

			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.gastodepreciacionSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				//DEBE APARECER EL REPORTE DIRECTAMENTE
				//JOptionPane.showMessageDialog(this,"GENERADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Gasto Depreciacion",JOptionPane.INFORMATION_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,GastoDepreciacionConstantesFunciones.CLASSNAME);
		
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
		
		for(int index:this.jInternalFrameReporteDinamicoGastoDepreciacion.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoGastoDepreciacion.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case GastoDepreciacionConstantesFunciones.LABEL_IDEMPRESA:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_Empresa_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_Empresa_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_Empresa_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_Empresa_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case GastoDepreciacionConstantesFunciones.LABEL_IDDETALLEGRUPOACTIVOFIJO:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_DetalleGrupoActivoFijo_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_DetalleGrupoActivoFijo_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_DetalleGrupoActivoFijo_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_DetalleGrupoActivoFijo_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case GastoDepreciacionConstantesFunciones.LABEL_ANIO:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_io_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_io_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_io_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_io_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case GastoDepreciacionConstantesFunciones.LABEL_VALOR:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_lor_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_lor_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_lor_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_lor_colx", iAnchoSum.toString());

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
		
		if(this.jInternalFrameReporteDinamicoGastoDepreciacion.getjCheckBoxConGraficoDinamico().isSelected()) {
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
		reporte=((Reporte)this.jInternalFrameReporteDinamicoGastoDepreciacion.getjComboBoxColumnaCategoriaGrafico().getSelectedItem());
				
		//TIPO GRAFICO REPORTE
		reporteTipoGraficoReporte=((Reporte)this.jInternalFrameReporteDinamicoGastoDepreciacion.getjComboBoxTiposGraficosReportesDinamico().getSelectedItem());
		
		String sTipoGraficoReporte=reporteTipoGraficoReporte.getsCodigo();
		
		switch(reporte.getsCodigo()) {
			
				case GastoDepreciacionConstantesFunciones.LABEL_IDEMPRESA:
					sNombreCampoCategoria="id_empresa";
					break;

				case GastoDepreciacionConstantesFunciones.LABEL_IDDETALLEGRUPOACTIVOFIJO:
					sNombreCampoCategoria="id_detalle_grupo_activo_fijo";
					break;

				case GastoDepreciacionConstantesFunciones.LABEL_ANIO:
					sNombreCampoCategoria="anio";
					break;

				case GastoDepreciacionConstantesFunciones.LABEL_VALOR:
					sNombreCampoCategoria="valor";
					break;
					
			default :
				break;
		}		
		//CATEGORIA GRAFICO
		
		//CATEGORIA VALOR				
		reporteCategoriaValor=((Reporte)this.jInternalFrameReporteDinamicoGastoDepreciacion.getjComboBoxColumnaCategoriaValor().getSelectedItem());
		
		switch(reporteCategoriaValor.getsCodigo()) {
			
				case GastoDepreciacionConstantesFunciones.LABEL_IDEMPRESA:
					sNombreCampoCategoriaValor="id_empresa";
					break;

				case GastoDepreciacionConstantesFunciones.LABEL_IDDETALLEGRUPOACTIVOFIJO:
					sNombreCampoCategoriaValor="id_detalle_grupo_activo_fijo";
					break;

				case GastoDepreciacionConstantesFunciones.LABEL_ANIO:
					sNombreCampoCategoriaValor="anio";
					break;

				case GastoDepreciacionConstantesFunciones.LABEL_VALOR:
					sNombreCampoCategoriaValor="valor";
					break;
					
			default :
				break;
		}	
		//CATEGORIA VALOR
		
		//VALORES GRAFICO
		for(int index:this.jInternalFrameReporteDinamicoGastoDepreciacion.getjListColumnasValoresGrafico().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoGastoDepreciacion.getjListColumnasValoresGrafico().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case GastoDepreciacionConstantesFunciones.LABEL_IDEMPRESA:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Empresa",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_empresa");
					break;

				case GastoDepreciacionConstantesFunciones.LABEL_IDDETALLEGRUPOACTIVOFIJO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Detalle Grupo Activo Fijo",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_detalle_grupo_activo_fijo");
					break;

				case GastoDepreciacionConstantesFunciones.LABEL_ANIO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Anio",sNombreCampoCategoria,sNombreCampoCategoriaValor,"anio");
					break;

				case GastoDepreciacionConstantesFunciones.LABEL_VALOR:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Valor",sNombreCampoCategoria,sNombreCampoCategoriaValor,"valor");
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
	
	public void jButtonGenerarExcelReporteDinamicoGastoDepreciacionActionPerformed(ActionEvent evt) throws Exception {		
		ArrayList<GastoDepreciacion> gastodepreciacionsSeleccionados=new ArrayList<GastoDepreciacion>();		
		
		gastodepreciacionsSeleccionados=this.getGastoDepreciacionsSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"gastodepreciacion";//.xls";
		
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
		
			Sheet sheet = workbook.createSheet("GastoDepreciacions");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			Row row = sheet.createRow(iRow);
			Cell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");
			
			for(int index:this.jInternalFrameReporteDinamicoGastoDepreciacion.getjListColumnasSelectReporte().getSelectedIndices()) {
				reporte=(Reporte)this.jInternalFrameReporteDinamicoGastoDepreciacion.getjListColumnasSelectReporte().getModel().getElementAt(index);
				
				switch(reporte.getsCodigo()) {
					
				case GastoDepreciacionConstantesFunciones.LABEL_IDEMPRESA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(GastoDepreciacionConstantesFunciones.LABEL_IDEMPRESA);
					iRow++;

					for(GastoDepreciacion gastodepreciacion:gastodepreciacionsSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(gastodepreciacion.getempresa_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case GastoDepreciacionConstantesFunciones.LABEL_IDDETALLEGRUPOACTIVOFIJO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(GastoDepreciacionConstantesFunciones.LABEL_IDDETALLEGRUPOACTIVOFIJO);
					iRow++;

					for(GastoDepreciacion gastodepreciacion:gastodepreciacionsSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(gastodepreciacion.getdetallegrupoactivofijo_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case GastoDepreciacionConstantesFunciones.LABEL_ANIO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(GastoDepreciacionConstantesFunciones.LABEL_ANIO);
					iRow++;

					for(GastoDepreciacion gastodepreciacion:gastodepreciacionsSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(gastodepreciacion.getanio());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case GastoDepreciacionConstantesFunciones.LABEL_VALOR:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(GastoDepreciacionConstantesFunciones.LABEL_VALOR);
					iRow++;

					for(GastoDepreciacion gastodepreciacion:gastodepreciacionsSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(gastodepreciacion.getvalor());
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
			//	this.getFilaCabeceraExportarExcelGastoDepreciacion(row);				
			//	iRow++;
			//}				
			
			//for(GastoDepreciacion gastodepreciacionAux:gastodepreciacionsSeleccionados) {
			//	row = sheet.createRow(iRow);
				
			//	this.getFilaDatosExportarExcelGastoDepreciacion(gastodepreciacionAux,row);
				
			//	iRow++;
			//}
			
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.gastodepreciacionSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Gasto Depreciacion",JOptionPane.INFORMATION_MESSAGE);
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
				this.gastodepreciacionLogic.getNewConnexionToDeep("");
			}
			
			this.idActual=idActual;
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda("PorId");
				    	
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingGastoDepreciacion(false);
			
			//SI ES MANUAL
			if(GastoDepreciacionJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualGastoDepreciacion();
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.gastodepreciacionLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.gastodepreciacionLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger);
			
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.gastodepreciacionLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonAnterioresGastoDepreciacionActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion-=this.iNumeroPaginacion;
			/*
			if(this.iNumeroPaginacion<0) {
				this.iNumeroPaginacion=0;
			}
			*/
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.gastodepreciacionLogic.getNewConnexionToDeep("");
			}
			
			this.anteriores();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingGastoDepreciacion(false);
			
			//SI ES MANUAL
			if(GastoDepreciacionJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualGastoDepreciacion();
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.gastodepreciacionLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.gastodepreciacionLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,GastoDepreciacionConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.gastodepreciacionLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonSiguientesGastoDepreciacionActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion+=this.iNumeroPaginacion;
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.gastodepreciacionLogic.getNewConnexionToDeep("");
			}
			
			this.siguientes();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingGastoDepreciacion(false);
			
			//SI ES MANUAL
			if(GastoDepreciacionJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualGastoDepreciacion();
			}		
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.gastodepreciacionLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.gastodepreciacionLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,GastoDepreciacionConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.gastodepreciacionLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void aumentarTamanioFilaNuevaTablaGastoDepreciacion() throws Exception {		
		Dimension dimensionMinimum=this.jTableDatosGastoDepreciacion.getMinimumSize();
		Dimension dimensionMaximum=this.jTableDatosGastoDepreciacion.getMaximumSize();
		Dimension dimensionPreferred=this.jTableDatosGastoDepreciacion.getPreferredSize();
	
		double iHeightConFilaNueva=dimensionPreferred.getHeight();
		
		iHeightConFilaNueva+=this.jTableDatosGastoDepreciacion.getRowHeight();
		
		dimensionMinimum.setSize(dimensionMinimum.getWidth(),iHeightConFilaNueva);
		dimensionMaximum.setSize(dimensionMaximum.getWidth(),iHeightConFilaNueva);
		dimensionPreferred.setSize(dimensionPreferred.getWidth(),iHeightConFilaNueva);
		
		this.jTableDatosGastoDepreciacion.setMinimumSize(dimensionMinimum);
		this.jTableDatosGastoDepreciacion.setMaximumSize(dimensionMaximum);
		this.jTableDatosGastoDepreciacion.setPreferredSize(dimensionPreferred);	
	}
	
	public void inicializarActualizarBindingGastoDepreciacion(Boolean esInicializar) throws Exception {
		this.inicializarActualizarBindingGastoDepreciacion(esInicializar,true);
	}
	
	public void inicializarActualizarBindingGastoDepreciacion(Boolean esInicializar,Boolean conTabla) throws Exception {		
		if(conTabla) {
			this.inicializarActualizarBindingTablaGastoDepreciacion(esInicializar);
		}
		
		this.inicializarActualizarBindingBotonesGastoDepreciacion(esInicializar);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.gastodepreciacionSessionBean.getEsGuardarRelacionado()) {
			try{this.inicializarActualizarBindingBusquedasGastoDepreciacion(esInicializar);}catch(Exception e){e.printStackTrace();}
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesGastoDepreciacion(esInicializar) ;
			
			this.inicializarActualizarBindingParametrosReportesGastoDepreciacion(esInicializar) ;
		}
		
		if(esInicializar) {
			if( !GastoDepreciacionJInternalFrame.ISBINDING_MANUAL_TABLA ||
			   	!GastoDepreciacionJInternalFrame.ISBINDING_MANUAL) {
			   	
			}
		}
	}
	
	public void inicializarActualizarBindingManualGastoDepreciacion() throws Exception {		
		//NO SE NECESITA HACER BINDING OTRA VEZ
		//this.inicializarActualizarBindingTablaGastoDepreciacion();
		
		this.inicializarActualizarBindingBotonesManualGastoDepreciacion(true);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.gastodepreciacionSessionBean.getEsGuardarRelacionado()) {
			
			this.inicializarActualizarBindingBusquedasManualGastoDepreciacion();			
			
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesGastoDepreciacion() ;
			
			this.inicializarActualizarBindingParametrosReportesPostAccionesManualGastoDepreciacion(false) ;			
			
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesPostAccionesManualGastoDepreciacion(Boolean esSetControles) throws Exception {
		try	{					
			if(!esSetControles) {
				this.isSeleccionarTodos=this.jCheckBoxSeleccionarTodosGastoDepreciacion.isSelected();
				this.isSeleccionados=this.jCheckBoxSeleccionadosGastoDepreciacion.isSelected();
				
				
				this.conGraficoReporte=this.jCheckBoxConGraficoReporteGastoDepreciacion.isSelected();															
				
				
				if(this.jInternalFrameDetalleFormGastoDepreciacion!=null) {
				this.isPostAccionNuevo=this.jInternalFrameDetalleFormGastoDepreciacion.jCheckBoxPostAccionNuevoGastoDepreciacion.isSelected();
				this.isPostAccionSinCerrar=this.jInternalFrameDetalleFormGastoDepreciacion.jCheckBoxPostAccionSinCerrarGastoDepreciacion.isSelected();
				this.isPostAccionSinMensaje=this.jInternalFrameDetalleFormGastoDepreciacion.jCheckBoxPostAccionSinMensajeGastoDepreciacion.isSelected();
				}
			
			} else {
				this.jCheckBoxSeleccionarTodosGastoDepreciacion.setSelected(this.isSeleccionarTodos);
				this.jCheckBoxSeleccionadosGastoDepreciacion.setSelected(this.isSeleccionados);
				
				
				this.jCheckBoxConGraficoReporteGastoDepreciacion.setSelected(this.conGraficoReporte);				
				
				
				if(this.jInternalFrameDetalleFormGastoDepreciacion!=null) {
				this.jInternalFrameDetalleFormGastoDepreciacion.jCheckBoxPostAccionNuevoGastoDepreciacion.setSelected(this.isPostAccionNuevo);
				this.jInternalFrameDetalleFormGastoDepreciacion.jCheckBoxPostAccionSinCerrarGastoDepreciacion.setSelected(this.isPostAccionSinCerrar);
				this.jInternalFrameDetalleFormGastoDepreciacion.jCheckBoxPostAccionSinMensajeGastoDepreciacion.setSelected(this.isPostAccionSinMensaje);
				}
			}
			
			
			if(this.jComboBoxTiposPaginacionGastoDepreciacion.getSelectedItem()!=null) {
				this.sTipoPaginacion=((Reporte)this.jComboBoxTiposPaginacionGastoDepreciacion.getSelectedItem()).getsCodigo();			
			}
			
			
			
			if(this.jInternalFrameDetalleFormGastoDepreciacion!=null) {
			this.sTipoAccionFormulario=((Reporte)this.jInternalFrameDetalleFormGastoDepreciacion.jComboBoxTiposAccionesFormularioGastoDepreciacion.getSelectedItem()).getsCodigo();
			}
			
			
			
			if(!this.conCargarMinimo) {
				this.sTipoArchivoReporte=((Reporte)this.jComboBoxTiposArchivosReportesGastoDepreciacion.getSelectedItem()).getsCodigo();			
				
				if(this.jInternalFrameReporteDinamicoGastoDepreciacion!=null) {
					this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoGastoDepreciacion.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
				}
				
				this.sTipoRelacion=((Reporte)this.jComboBoxTiposRelacionesGastoDepreciacion.getSelectedItem()).getsCodigo();
									
				this.sTipoAccion=((Reporte)this.jComboBoxTiposAccionesGastoDepreciacion.getSelectedItem()).getsCodigo();
													
				this.sTipoSeleccionar=((Reporte)this.jComboBoxTiposSeleccionarGastoDepreciacion.getSelectedItem()).getsCodigo();
									
				this.sTipoReporte=((Reporte)this.jComboBoxTiposReportesGastoDepreciacion.getSelectedItem()).getsCodigo();							
					
				if(this.jInternalFrameReporteDinamicoGastoDepreciacion!=null) {
					this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoGastoDepreciacion.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();							
				}
				
				this.sTipoGraficoReporte=((Reporte)this.jComboBoxTiposGraficosReportesGastoDepreciacion.getSelectedItem()).getsCodigo();											
			}			
			
			this.sValorCampoGeneral=this.jTextFieldValorCampoGeneralGastoDepreciacion.getText();						
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesGastoDepreciacion(Boolean esInicializar) throws Exception {
		try	{	
			if(GastoDepreciacionJInternalFrame.ISBINDING_MANUAL) {
				this. inicializarActualizarBindingParametrosReportesPostAccionesManualGastoDepreciacion(false);
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public void inicializarActualizarBindingtiposArchivosReportesAccionesGastoDepreciacion() throws Exception {
		try	{
			if(GastoDepreciacionJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingtiposArchivosReportesAccionesManualGastoDepreciacion();
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleGastoDepreciacion() throws Exception {
		//TIPOS ACCIONES FORMULARIO	
		this.jInternalFrameDetalleFormGastoDepreciacion.jComboBoxTiposAccionesFormularioGastoDepreciacion.removeAllItems();
				
		for(Reporte reporte:this.tiposAccionesFormulario) {
			this.jInternalFrameDetalleFormGastoDepreciacion.jComboBoxTiposAccionesFormularioGastoDepreciacion.addItem(reporte);
		}
		
		//TIPOS ACCIONES FORMULARIO
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualGastoDepreciacion() throws Exception {
		try	{
			
			//TIPOS ARCHIVOS REPORTES
			this.jComboBoxTiposArchivosReportesGastoDepreciacion.removeAllItems();
				
			for(Reporte reporte:this.tiposArchivosReportes) {
				this.jComboBoxTiposArchivosReportesGastoDepreciacion.addItem(reporte);
			}
			
			
				
			//TIPOS REPORTES
			this.jComboBoxTiposReportesGastoDepreciacion.removeAllItems();
				
			for(Reporte reporte:this.tiposReportes) {
				this.jComboBoxTiposReportesGastoDepreciacion.addItem(reporte);
			}
			
			
			//TIPOS GRAFICOS REPORTES
			this.jComboBoxTiposGraficosReportesGastoDepreciacion.removeAllItems();
				
			for(Reporte reporte:this.tiposGraficosReportes) {
				this.jComboBoxTiposGraficosReportesGastoDepreciacion.addItem(reporte);
			}
			
			
			//TIPOS PAGINACION
			this.jComboBoxTiposPaginacionGastoDepreciacion.removeAllItems();
				
			for(Reporte reporte:this.tiposPaginacion) {
				this.jComboBoxTiposPaginacionGastoDepreciacion.addItem(reporte);
			}
			
			
			if(!this.gastodepreciacionSessionBean.getEsGuardarRelacionado()) {
				this.jComboBoxTiposPaginacionGastoDepreciacion.setSelectedItem(Funciones2.getTipoPaginacionDefecto("NORMAL",this.tiposPaginacion));
			} else {
				this.jComboBoxTiposPaginacionGastoDepreciacion.setSelectedItem(Funciones2.getTipoPaginacionDefecto("RELACIONADO",this.tiposPaginacion));
			}
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposRelacionesGastoDepreciacion.removeAllItems();
				
			for(Reporte reporte:this.tiposRelaciones) {
				this.jComboBoxTiposRelacionesGastoDepreciacion.addItem(reporte);
			}
			
			//TIPOS ACCIONES
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposAccionesGastoDepreciacion.removeAllItems();
				
			for(Reporte reporte:this.tiposAcciones) {
				this.jComboBoxTiposAccionesGastoDepreciacion.addItem(reporte);
			}
			
			//TIPOS ACCIONES			
			
			
			
			//TIPOS ACCIONES FORMULARIO	
			if(this.jInternalFrameDetalleFormGastoDepreciacion!=null) { //if(this.conCargarFormDetalle) {
				this.jInternalFrameDetalleFormGastoDepreciacion.jComboBoxTiposAccionesFormularioGastoDepreciacion.removeAllItems();
				
				for(Reporte reporte:this.tiposAccionesFormulario) {
					this.jInternalFrameDetalleFormGastoDepreciacion.jComboBoxTiposAccionesFormularioGastoDepreciacion.addItem(reporte);
				}
				
			}
			//TIPOS ACCIONES FORMULARIO
			
			
			
			//TIPOS SELECCIONAR
			this.jComboBoxTiposSeleccionarGastoDepreciacion.removeAllItems();
				
			for(Reporte reporte:this.tiposSeleccionar) {
				this.jComboBoxTiposSeleccionarGastoDepreciacion.addItem(reporte);
			}
			
			
			if(this.tiposSeleccionar!=null && this.tiposSeleccionar.size()>1) {
				this.jComboBoxTiposSeleccionarGastoDepreciacion.setSelectedIndex(1);
			}
				
			//REPORTE DINAMICO
			this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualGastoDepreciacion();
							
			//TIPOS COLUMNAS SELECT
			//TIPOS SELECCIONAR
			
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualGastoDepreciacion() throws Exception {
		try	{
			DefaultListModel<Reporte> defaultListModel=new DefaultListModel<Reporte>();
			
			
			//TIPOS ARCHIVOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoGastoDepreciacion!=null) {
				this.jInternalFrameReporteDinamicoGastoDepreciacion.getjComboBoxTiposArchivosReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposArchivosReportesDinamico) {
					this.jInternalFrameReporteDinamicoGastoDepreciacion.getjComboBoxTiposArchivosReportesDinamico().addItem(reporte);
				}
				
			}
			
			//TIPOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoGastoDepreciacion!=null) {
				this.jInternalFrameReporteDinamicoGastoDepreciacion.getjComboBoxTiposReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposReportesDinamico) {
					this.jInternalFrameReporteDinamicoGastoDepreciacion.getjComboBoxTiposReportesDinamico().addItem(reporte);
				}
				
			}
			
			defaultListModel=new DefaultListModel<Reporte>();
			
			if(this.jInternalFrameReporteDinamicoGastoDepreciacion!=null) {
				
				if(this.jInternalFrameReporteDinamicoGastoDepreciacion.getjListColumnasSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoGastoDepreciacion.getjListColumnasSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposColumnasSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoGastoDepreciacion.getjListColumnasSelectReporte().setModel(defaultListModel);									
						
				}	
					
				//TIPOS RELACIONES SELECT
				//TIPOS SELECCIONAR
				defaultListModel=new DefaultListModel<Reporte>();
				if(this.jInternalFrameReporteDinamicoGastoDepreciacion.getjListRelacionesSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoGastoDepreciacion.getjListRelacionesSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposRelacionesSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoGastoDepreciacion.getjListRelacionesSelectReporte().setModel(defaultListModel);									
						
				}	
				
				
				//TIPOS COLUMNAS CATEGORIA DINAMICO
				if(this.jInternalFrameReporteDinamicoGastoDepreciacion.getjComboBoxColumnaCategoriaGrafico()!=null) {
					this.jInternalFrameReporteDinamicoGastoDepreciacion.getjComboBoxColumnaCategoriaGrafico().removeAllItems();
						
					ArrayList<Reporte> tiposColumnasCategoria=GastoDepreciacionConstantesFunciones.getTiposSeleccionarGastoDepreciacion(true,true,false,true,true);
						
					for(Reporte reporte:tiposColumnasCategoria) {//this.tiposSeleccionar
						this.jInternalFrameReporteDinamicoGastoDepreciacion.getjComboBoxColumnaCategoriaGrafico().addItem(reporte);
					}
					
				}
					
				//TIPOS COLUMNAS CATEGORIA VALOR DINAMICO
				if(this.jInternalFrameReporteDinamicoGastoDepreciacion.getjComboBoxColumnaCategoriaValor()!=null) {
					this.jInternalFrameReporteDinamicoGastoDepreciacion.getjComboBoxColumnaCategoriaValor().removeAllItems();
						
					ArrayList<Reporte> tiposColumnasCategoriaValor=GastoDepreciacionConstantesFunciones.getTiposSeleccionarGastoDepreciacion(false,false,true,false,false);
						
					for(Reporte reporte:tiposColumnasCategoriaValor) {//this.tiposSeleccionar
						this.jInternalFrameReporteDinamicoGastoDepreciacion.getjComboBoxColumnaCategoriaValor().addItem(reporte);
					}
					
				}
					
				//TIPOS COLUMNAS VALOR
				defaultListModel=new DefaultListModel<Reporte>();
					
				if(this.jInternalFrameReporteDinamicoGastoDepreciacion.getjListColumnasValoresGrafico()!=null) {
					this.jInternalFrameReporteDinamicoGastoDepreciacion.getjListColumnasValoresGrafico().removeAll();
						
					ArrayList<Reporte> tiposColumnasValor=GastoDepreciacionConstantesFunciones.getTiposSeleccionarGastoDepreciacion(false,false,true,false,false);
						
					for(Reporte reporte:tiposColumnasValor) {//this.tiposSeleccionar
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoGastoDepreciacion.getjListColumnasValoresGrafico().setModel(defaultListModel);									
						
				}
					
				//TIPOS GRAFICOS REPORTES DINAMICOS
				if(this.jInternalFrameReporteDinamicoGastoDepreciacion.getjComboBoxTiposGraficosReportesDinamico()!=null) {
					this.jInternalFrameReporteDinamicoGastoDepreciacion.getjComboBoxTiposGraficosReportesDinamico().removeAllItems();
						
					for(Reporte reporte:this.tiposGraficosReportes) {
						this.jInternalFrameReporteDinamicoGastoDepreciacion.getjComboBoxTiposGraficosReportesDinamico().addItem(reporte);
					}
					
				}
			
			
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	
	
	public void inicializarActualizarBindingBusquedasManualGastoDepreciacion()  throws Exception {				
		//BYDAN_BUSQUEDAS		
		
		if(this.jComboBoxid_detalle_grupo_activo_fijoFK_IdDetalleGrupoActivoFijoGastoDepreciacion.getSelectedItem()!=null){this.id_detalle_grupo_activo_fijoFK_IdDetalleGrupoActivoFijo=((DetalleGrupoActivoFijo)this.jComboBoxid_detalle_grupo_activo_fijoFK_IdDetalleGrupoActivoFijoGastoDepreciacion.getSelectedItem()).getId();}
		
	}
	
	
	
	
	public void inicializarActualizarBindingBusquedasGastoDepreciacion(Boolean esInicializar) throws Exception {				
		if(GastoDepreciacionJInternalFrame.ISBINDING_MANUAL) {
			
			this.inicializarActualizarBindingBusquedasManualGastoDepreciacion();			
			
		} else {
		}
	}		
		
	public void inicializarActualizarBindingTablaGastoDepreciacion() throws Exception {
		this.inicializarActualizarBindingTablaGastoDepreciacion(false);
	}
	
	
	public void inicializarActualizarBindingTablaOrderByGastoDepreciacion() {
		//TABLA OrderBy	
		TableColumn tableColumn=new TableColumn();
		Integer iWidthTableDefinicionOrderBy=0;			
			
		this.jInternalFrameOrderByGastoDepreciacion.getjTableDatosOrderBy().setModel(new TablaGeneralOrderByModel(this.arrOrderBy));
					
		//DEFINIR RENDERERS OrderBy
		tableColumn=this.jInternalFrameOrderByGastoDepreciacion.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByGastoDepreciacion.getjTableDatosOrderBy(),OrderBy.ISSELECTED));			
		//tableColumn.addPropertyChangeListener(new GastoDepreciacionPropertyChangeListener());
					
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		iWidthTableDefinicionOrderBy+=50;
					
		tableColumn=this.jInternalFrameOrderByGastoDepreciacion.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByGastoDepreciacion.getjTableDatosOrderBy(),OrderBy.NOMBRE));
		//tableColumn.addPropertyChangeListener(new GastoDepreciacionPropertyChangeListener());
					
		tableColumn.setPreferredWidth(150); 	 
		tableColumn.setWidth(150); 	 
		tableColumn.setMinWidth(150);
		tableColumn.setMaxWidth(150);
				
		iWidthTableDefinicionOrderBy+=150;
					
		//tableColumn=this.jTableDatosGastoDepreciacionOrderBy.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosGastoDepreciacionOrderBy,OrderBy.NOMBREDB));			
		////tableColumn.addPropertyChangeListener(new GastoDepreciacionPropertyChangeListener());
								
		tableColumn=this.jInternalFrameOrderByGastoDepreciacion.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByGastoDepreciacion.getjTableDatosOrderBy(),OrderBy.ESDESC));
		//tableColumn.addPropertyChangeListener(new GastoDepreciacionPropertyChangeListener());
												
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		((AbstractTableModel) this.jInternalFrameOrderByGastoDepreciacion.getjTableDatosOrderBy().getModel()).fireTableDataChanged();
				
		iWidthTableDefinicionOrderBy+=50;
	}
	
	
	
	public void inicializarActualizarBindingTablaGastoDepreciacion(Boolean esInicializar) throws Exception {
		Boolean isNoExiste=false;
		Integer iCountNumeroColumnasNormal=0;
		Integer iCountNumeroColumnasFk=0;
		
		this.iWidthTableDefinicion=0;
		
		int iSizeTabla=0;
		
		iSizeTabla=this.getSizeTablaDatos();
		
	if(esInicializar || ConstantesSwing.FORZAR_INICIALIZAR_TABLA) {//esInicializar
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			isNoExiste=gastodepreciacionLogic.getGastoDepreciacions().size()==0;
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			isNoExiste=gastodepreciacions.size()==0;
		}
		//ARCHITECTURE
			
		if(isNoExiste) {
			if(this.iNumeroPaginacion-this.iNumeroPaginacion>0) {
				this.iNumeroPaginacion-=this.iNumeroPaginacion;
			}
		}
		
		TableColumn tableColumn=new TableColumn();
		
		if(GastoDepreciacionJInternalFrame.ISBINDING_MANUAL_TABLA) {
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.jTableDatosGastoDepreciacion.setModel(new GastoDepreciacionModel(this.gastodepreciacionLogic.getGastoDepreciacions(),this));
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.jTableDatosGastoDepreciacion.setModel(new GastoDepreciacionModel(this.gastodepreciacions,this));
			}
			//ARCHITECTURE
			
							
			
			
			if(this.jInternalFrameOrderByGastoDepreciacion!=null && this.jInternalFrameOrderByGastoDepreciacion.getjTableDatosOrderBy()!=null) {
				this.inicializarActualizarBindingTablaOrderByGastoDepreciacion();
			}
			
								
			//DEFINIR RENDERERS
			tableColumn=this.jTableDatosGastoDepreciacion.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosGastoDepreciacion,Constantes2.S_SELECCIONAR));
			//tableColumn.addPropertyChangeListener(new GastoDepreciacionPropertyChangeListener());
			tableColumn.setCellRenderer(new BooleanRenderer(true,"Seleccionar "+GastoDepreciacionConstantesFunciones.SCLASSWEBTITULO,gastodepreciacionConstantesFunciones.resaltarSeleccionarGastoDepreciacion,iSizeTabla,true,false,"","",this));
			tableColumn.setCellEditor(new BooleanEditorRenderer(true,"Seleccionar "+GastoDepreciacionConstantesFunciones.SCLASSWEBTITULO,gastodepreciacionConstantesFunciones.resaltarSeleccionarGastoDepreciacion,false,"","",this));			
			
			tableColumn.setPreferredWidth(50); 	 
			tableColumn.setWidth(50); 	 
			tableColumn.setMinWidth(50); 
			tableColumn.setMaxWidth(50); 
			
			this.iWidthTableDefinicion+=50;
			
			


			tableColumn=this.jTableDatosGastoDepreciacion.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosGastoDepreciacion,GastoDepreciacionConstantesFunciones.LABEL_ID));

		if(this.gastodepreciacionConstantesFunciones.mostraridGastoDepreciacion && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,GastoDepreciacionConstantesFunciones.LABEL_ID,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.gastodepreciacionConstantesFunciones.resaltaridGastoDepreciacion,this.gastodepreciacionConstantesFunciones.activaridGastoDepreciacion,iSizeTabla,this,true,"idGastoDepreciacion","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.gastodepreciacionConstantesFunciones.resaltaridGastoDepreciacion,this.gastodepreciacionConstantesFunciones.activaridGastoDepreciacion,this,true,"idGastoDepreciacion","BASICO",false));

			tableColumn.setPreferredWidth(50);
			tableColumn.setWidth(50);
			tableColumn.setMinWidth(50);
			tableColumn.setMaxWidth(50);

			this.iWidthTableDefinicion+=50;
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosGastoDepreciacion.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosGastoDepreciacion,GastoDepreciacionConstantesFunciones.LABEL_IDEMPRESA));

		if(this.gastodepreciacionConstantesFunciones.mostrarid_empresaGastoDepreciacion && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,GastoDepreciacionConstantesFunciones.LABEL_IDEMPRESA,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++) && Constantes.ISDEVELOPING) {
			tableColumn.setCellRenderer(new EmpresaTableCell(this.empresasForeignKey,this.gastodepreciacionConstantesFunciones.resaltarid_empresaGastoDepreciacion,this,this.gastodepreciacionConstantesFunciones.activarid_empresaGastoDepreciacion,iSizeTabla));
			tableColumn.setCellEditor(new EmpresaTableCell(this.empresasForeignKey,this.gastodepreciacionConstantesFunciones.resaltarid_empresaGastoDepreciacion,this,this.gastodepreciacionConstantesFunciones.activarid_empresaGastoDepreciacion,false,"id_empresaGastoDepreciacion","GLOBAL"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new GastoDepreciacionPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosGastoDepreciacion.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosGastoDepreciacion,GastoDepreciacionConstantesFunciones.LABEL_IDDETALLEGRUPOACTIVOFIJO));

		if(this.gastodepreciacionConstantesFunciones.mostrarid_detalle_grupo_activo_fijoGastoDepreciacion && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,GastoDepreciacionConstantesFunciones.LABEL_IDDETALLEGRUPOACTIVOFIJO,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++)) {
			tableColumn.setCellRenderer(new DetalleGrupoActivoFijoTableCell(this.detallegrupoactivofijosForeignKey,this.gastodepreciacionConstantesFunciones.resaltarid_detalle_grupo_activo_fijoGastoDepreciacion,this,this.gastodepreciacionConstantesFunciones.activarid_detalle_grupo_activo_fijoGastoDepreciacion,iSizeTabla));
			tableColumn.setCellEditor(new DetalleGrupoActivoFijoTableCell(this.detallegrupoactivofijosForeignKey,this.gastodepreciacionConstantesFunciones.resaltarid_detalle_grupo_activo_fijoGastoDepreciacion,this,this.gastodepreciacionConstantesFunciones.activarid_detalle_grupo_activo_fijoGastoDepreciacion,true,"id_detalle_grupo_activo_fijoGastoDepreciacion","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new GastoDepreciacionPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosGastoDepreciacion.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosGastoDepreciacion,GastoDepreciacionConstantesFunciones.LABEL_ANIO));

		if(this.gastodepreciacionConstantesFunciones.mostraranioGastoDepreciacion && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,GastoDepreciacionConstantesFunciones.LABEL_ANIO,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.gastodepreciacionConstantesFunciones.resaltaranioGastoDepreciacion,this.gastodepreciacionConstantesFunciones.activaranioGastoDepreciacion,iSizeTabla,this,true,"anioGastoDepreciacion","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.gastodepreciacionConstantesFunciones.resaltaranioGastoDepreciacion,this.gastodepreciacionConstantesFunciones.activaranioGastoDepreciacion,this,true,"anioGastoDepreciacion","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA);

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
			//tableColumn.addPropertyChangeListener(new GastoDepreciacionPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosGastoDepreciacion.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosGastoDepreciacion,GastoDepreciacionConstantesFunciones.LABEL_VALOR));

		if(this.gastodepreciacionConstantesFunciones.mostrarvalorGastoDepreciacion && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,GastoDepreciacionConstantesFunciones.LABEL_VALOR,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.gastodepreciacionConstantesFunciones.resaltarvalorGastoDepreciacion,this.gastodepreciacionConstantesFunciones.activarvalorGastoDepreciacion,iSizeTabla,this,true,"valorGastoDepreciacion","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.gastodepreciacionConstantesFunciones.resaltarvalorGastoDepreciacion,this.gastodepreciacionConstantesFunciones.activarvalorGastoDepreciacion,this,true,"valorGastoDepreciacion","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA);

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
			//tableColumn.addPropertyChangeListener(new GastoDepreciacionPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}
			
		} else {
		}			
					
		if(!this.gastodepreciacionSessionBean.getEsGuardarRelacionado()
			&& !this.esParaBusquedaForeignKey) {
			

			if(this.isTienePermisosCuentaContaGastoDepre && this.gastodepreciacionConstantesFunciones.mostrarCuentaContaGastoDepreGastoDepreciacion && !GastoDepreciacionConstantesFunciones.ISGUARDARREL) {
				tableColumn= new TableColumn();
				tableColumn.setIdentifier("Cuenta Conta Gasto Depres");
				tableColumn.setHeaderValue("Cuenta Conta Gasto Depres");
				tableColumn.setCellRenderer(new CuentaContaGastoDepreTableCell(gastodepreciacionConstantesFunciones.resaltarCuentaContaGastoDepreGastoDepreciacion,this,this.gastodepreciacionConstantesFunciones.activarCuentaContaGastoDepreGastoDepreciacion));
				tableColumn.setCellEditor(new CuentaContaGastoDepreTableCell(gastodepreciacionConstantesFunciones.resaltarCuentaContaGastoDepreGastoDepreciacion,this,this.gastodepreciacionConstantesFunciones.activarCuentaContaGastoDepreGastoDepreciacion));

				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
				tableColumn.setWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);

				this.jTableDatosGastoDepreciacion.addColumn(tableColumn);
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
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.gastodepreciacionSessionBean.getEsGuardarRelacionado(),iSizeTabla));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.gastodepreciacionSessionBean.getEsGuardarRelacionado(),iSizeTabla));
	
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosGastoDepreciacion.addColumn(tableColumn);
			
			} else {				
				
				//LO MISMO QUE IF
				
				tableColumn= new TableColumn();
				tableColumn.setIdentifier(sLabelColumnAccion);
				tableColumn.setHeaderValue(sLabelColumnAccion);
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.gastodepreciacionSessionBean.getEsGuardarRelacionado(),iSizeTabla));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.gastodepreciacionSessionBean.getEsGuardarRelacionado(),iSizeTabla));
		
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosGastoDepreciacion.addColumn(tableColumn);				
					
				//ELIMINAR
				if(this.isPermisoEliminarGastoDepreciacion && this.isPermisoGuardarCambiosGastoDepreciacion) {
					tableColumn= new TableColumn();
					tableColumn.setIdentifier(Constantes2.S_ELI);
					tableColumn.setHeaderValue(sLabelColumnAccionEli);
					tableColumn.setCellRenderer(new IdTableCell(this,false,true,this.gastodepreciacionSessionBean.getEsGuardarRelacionado(),iSizeTabla));
					tableColumn.setCellEditor(new IdTableCell(this,false,true,this.gastodepreciacionSessionBean.getEsGuardarRelacionado(),iSizeTabla));
			
					tableColumn.setPreferredWidth(65); 	 
					tableColumn.setWidth(65); 	 
					tableColumn.setMinWidth(65); 
					tableColumn.setMaxWidth(65);
					
					this.iWidthTableDefinicion+=65;
						
					this.jTableDatosGastoDepreciacion.addColumn(tableColumn);
				}
			}			
						
			if(this.conMaximoRelaciones && this.gastodepreciacionSessionBean.getConGuardarRelaciones()) {
				if(this.conFuncionalidadRelaciones) {
					tableColumn= new TableColumn();
					tableColumn.setIdentifier("Editar Rel");
					tableColumn.setHeaderValue("Editar Rel");
					tableColumn.setCellRenderer(new IdTableCell(this,true,false,iSizeTabla));
					tableColumn.setCellEditor(new IdTableCell(this,true,false,iSizeTabla));
		
					tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
					tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
					tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
					tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
					
					this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
					this.jTableDatosGastoDepreciacion.addColumn(tableColumn);
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
			
			this.jTableDatosGastoDepreciacion.addColumn(tableColumn);
			*/
		}
		
		Integer iUltimaColumna=0;//1
		Integer iNuevaPosicionColumna=0;
		
		
		//PERMITE ELIMINAR SIMPLE
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarGastoDepreciacion && this.isPermisoGuardarCambiosGastoDepreciacion) {
				iUltimaColumna++;
			}	
		}
		
		//PERMITE EDITAR SIMPLE
		iUltimaColumna++;	
		
				
		if(this.conFuncionalidadRelaciones) {
			if(this.conMaximoRelaciones && this.gastodepreciacionSessionBean.getConGuardarRelaciones()) {			
				//PERMITE EDITAR RELACIONES
				iUltimaColumna++;//2
			}
		}
		
		//MOVIA SELECCIONAR
		//iUltimaColumna++;
		
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarGastoDepreciacion && this.isPermisoGuardarCambiosGastoDepreciacion) {
				//REUBICA ELIMINAR SIMPLE
				jTableDatosGastoDepreciacion.moveColumn(this.jTableDatosGastoDepreciacion.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3
					
				iUltimaColumna--;
			}
		}
		//REUBICA EDITAR SIMPLE
		jTableDatosGastoDepreciacion.moveColumn(this.jTableDatosGastoDepreciacion.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3				
		
		
		if(this.conFuncionalidadRelaciones) {
			if(this.conMaximoRelaciones && this.gastodepreciacionSessionBean.getConGuardarRelaciones()) {	
				if(iUltimaColumna>1) {
					iUltimaColumna--;
				}
				
				//iNuevaPosicionColumna++;
				
				//REUBICA EDITAR RELACIONES
				jTableDatosGastoDepreciacion.moveColumn(this.jTableDatosGastoDepreciacion.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1
			}
		}
		
		
		//REUBICABA SELECCIONAR
		/*
		if(iUltimaColumna>1) {
			iUltimaColumna--;
		}
		
		//iNuevaPosicionColumna++;
			
		//REUBICA SELECCIONAR FILA CHECK
		jTableDatosGastoDepreciacion.moveColumn(this.jTableDatosGastoDepreciacion.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1		
		*/
		
		//DEFINEN HEADERS
		final TableCellRenderer tableHeaderDefaultCellRenderer = this.jTableDatosGastoDepreciacion.getTableHeader().getDefaultRenderer();
		
		this.jTableDatosGastoDepreciacion.getTableHeader().setDefaultRenderer(new TableCellRendererHeader(this.jTableDatosGastoDepreciacion,tableHeaderDefaultCellRenderer));
	    
		TableColumn column=null;
		
		if(!GastoDepreciacionJInternalFrame.ISBINDING_MANUAL_TABLA) {
			for(int i = 0; i < this.jTableDatosGastoDepreciacion.getColumnModel().getColumnCount(); i++) { 
				column = this.jTableDatosGastoDepreciacion.getColumnModel().getColumn(i); 
				
				if(column.getIdentifier()!=null) {
					//SI SE UTILIZA UN HEADER ES GENERICO
					//column.setHeaderRenderer(new HeaderRenderer(column.getIdentifier().toString()));
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_ELI)) {
					continue;
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_SELECCIONAR)) {
					if(!GastoDepreciacionJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(50); 	 
						column.setWidth(50); 	 
						column.setMinWidth(50); 	
						column.setMaxWidth(50); 
						
						this.iWidthTableDefinicion+=50;
					}
					
				} else {
					if(!GastoDepreciacionJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						column.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						
						this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
					}
				}
			}
		}
		
		this.jTableDatosGastoDepreciacion.setSelectionBackground(FuncionesSwing.getColorSelectedBackground());
		this.jTableDatosGastoDepreciacion.setSelectionForeground(FuncionesSwing.getColorSelectedForeground());
		
		/*
		this.jTableDatosGastoDepreciacion.setDefaultRenderer(Object.class, new DefaultTableCellRenderer() {
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
							iSize=gastodepreciacionLogic.getGastoDepreciacions().size()-1;
								
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							iSize=gastodepreciacions.size()-1;
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
		//this.jTableDatosGastoDepreciacion.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA);
		
		/*
		column=this.jTableDatosGastoDepreciacion.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosSistema,Constantes2.S_SELECCIONAR));
		
		if(column!=null) {
			column.setPreferredWidth(25); 	 
			column.setWidth(25); 	 
			column.setMinWidth(25); 	
		}
		*/
			
			//CopyTableToTableTotal();
		} else {
			
			this.actualizarVisualTableDatosGastoDepreciacion();
			
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
				
				//this.isEsNuevoGastoDepreciacion=false;
					
				GastoDepreciacionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.gastodepreciacion,new Object(),this.gastodepreciacionParameterGeneral,this.gastodepreciacionReturnGeneral);
			
				if(this.gastodepreciacionSessionBean.getConGuardarRelaciones()) {
					this.dStart=(double)System.currentTimeMillis();
				}
				
				if(this.jInternalFrameDetalleFormGastoDepreciacion==null) {
					this.inicializarFormDetalle();
				}
				
				this.inicializarInvalidValues();
				
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosGastoDepreciacion.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosGastoDepreciacion.getSelectedRow();	       
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.gastodepreciacion =(GastoDepreciacion) this.gastodepreciacionLogic.getGastoDepreciacions().toArray()[this.jTableDatosGastoDepreciacion.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.gastodepreciacion =(GastoDepreciacion) this.gastodepreciacions.toArray()[this.jTableDatosGastoDepreciacion.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//PUEDE SER PARA DUPLICADO O NUEVO TABLA
				
				if(this.gastodepreciacion.getsType().equals("DUPLICADO")
				   || this.gastodepreciacion.getsType().equals("NUEVO_GUARDAR_CAMBIOS")) {
					
					this.isEsNuevoGastoDepreciacion=true;
				
				} else {
					this.isEsNuevoGastoDepreciacion=false;	
				}
				
				//CONTROL VERSION ANTERIOR
				/*
				if(!this.gastodepreciacionSessionBean.getEsGuardarRelacionado()) {
					if(this.gastodepreciacion.getId()>=0 && !this.gastodepreciacion.getIsNew()) {						
						this.isEsNuevoGastoDepreciacion=false;
						
					} else {
						this.isEsNuevoGastoDepreciacion=true;
					}
					
				} else {
					//CONTROLAR PARA RELACIONADO
				}
				*/
				
				//ESTABLECE SI ES RELACIONADO O NO 
				this.habilitarDeshabilitarTipoMantenimientoGastoDepreciacion(esRelaciones);						
				
				this.seleccionarGastoDepreciacion(evt,null,rowIndex);
				
				//SELECCIONA ACTUAL PERO AUN NO SE HA INGRESADO AL SISTEMA
				//SE DESHABILITA POR GUARDAR CAMBIOS
				/*
				if(this.gastodepreciacion.getId()<0) {
					this.isEsNuevoGastoDepreciacion=true;
				}
				*/
				
				if(!this.esParaBusquedaForeignKey) {
					this.modificarGastoDepreciacion(evt,rowIndex,esRelaciones);
				} else {
					this.seleccionarGastoDepreciacion(evt,rowIndex);
				}	
				
				if(this.gastodepreciacionSessionBean.getConGuardarRelaciones()) {
					this.dEnd=(double)System.currentTimeMillis();					
					this.dDif=this.dEnd - this.dStart;
					
					if(Constantes.ISDEVELOPING) {
						System.out.println("Tiempo(ms) Seleccion GastoDepreciacion: " + this.dDif); 
					}
				}								
				
				GastoDepreciacionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.gastodepreciacion,new Object(),this.gastodepreciacionParameterGeneral,this.gastodepreciacionReturnGeneral);
				
			} else {
				this.estaModoEliminarGuardarCambios=true;
				
				this.seleccionarGastoDepreciacion(evt,null,rowIndex);
				
				if(this.permiteMantenimiento(this.gastodepreciacion)) {
					if(this.gastodepreciacion.getId()>0) {
						this.gastodepreciacion.setIsDeleted(true);
						
						this.gastodepreciacionsEliminados.add(this.gastodepreciacion);
					}
					
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.gastodepreciacionLogic.getGastoDepreciacions().remove(this.gastodepreciacion);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.gastodepreciacions.remove(this.gastodepreciacion);				
					}
					
					
					((GastoDepreciacionModel) this.jTableDatosGastoDepreciacion.getModel()).fireTableRowsDeleted(rowIndex,rowIndex);
					
					this.actualizarFilaTotales();
					
					this.inicializarActualizarBindingTablaGastoDepreciacion(false);					
				}								
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException2(this, e,logger,GastoDepreciacionConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoSeleccionar=false;				
			this.estaModoEliminarGuardarCambios=false;
		}
	}
	
	
	public void seleccionarGastoDepreciacion(ActionEvent evt,javax.swing.event.ListSelectionEvent evt2,int rowIndex) throws Exception { 
		try {
			//SI PUEDE SER NUEVO Y SELECCIONAR (PARA DUPLICAR Y NUEVO TABLA)
			//if(!this.isEsNuevoGastoDepreciacion) {
			
			if(this.jInternalFrameDetalleFormGastoDepreciacion==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosGastoDepreciacion.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosGastoDepreciacion.getSelectedRow();	       
				}
				
				//CUANDO SE RECARGA TABLA TAMBIEN SE SELECCIONA PERO CON -1 POR LO QUE SE NECESITA VALIDAR ANTES
				if(intSelectedRow<0) {
					return;
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.gastodepreciacion =(GastoDepreciacion) this.gastodepreciacionLogic.getGastoDepreciacions().toArray()[this.jTableDatosGastoDepreciacion.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.gastodepreciacion =(GastoDepreciacion) this.gastodepreciacions.toArray()[this.jTableDatosGastoDepreciacion.convertRowIndexToModel(intSelectedRow)];
				}
				
				if(GastoDepreciacionJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesObjetoActualToFormularioGastoDepreciacion(this.gastodepreciacion);
				}
				
				//ARCHITECTURE
				try {
					

					//Empresa
					if(!this.gastodepreciacionConstantesFunciones.cargarid_empresaGastoDepreciacion || this.gastodepreciacionConstantesFunciones.event_dependid_empresaGastoDepreciacion) {
						//this.cargarCombosEmpresasForeignKeyLista(" where id="+this.gastodepreciacion.getid_empresa());
									//this.inicializarActualizarBindingGastoDepreciacion(false,false);
						this.empresasForeignKey=new ArrayList<Empresa>();

						if(gastodepreciacion.getEmpresa()!=null) {
							this.empresasForeignKey.add(gastodepreciacion.getEmpresa());
						}

						this.addItemDefectoCombosForeignKeyEmpresa();
						this.cargarCombosFrameEmpresasForeignKey("Todos");
					}
					this.setActualEmpresaForeignKey(this.gastodepreciacion.getid_empresa(),false,"Formulario");

					//DetalleGrupoActivoFijo
					if(!this.gastodepreciacionConstantesFunciones.cargarid_detalle_grupo_activo_fijoGastoDepreciacion || this.gastodepreciacionConstantesFunciones.event_dependid_detalle_grupo_activo_fijoGastoDepreciacion) {
						//this.cargarCombosDetalleGrupoActivoFijosForeignKeyLista(" where id="+this.gastodepreciacion.getid_detalle_grupo_activo_fijo());
									//this.inicializarActualizarBindingGastoDepreciacion(false,false);
						this.detallegrupoactivofijosForeignKey=new ArrayList<DetalleGrupoActivoFijo>();

						if(gastodepreciacion.getDetalleGrupoActivoFijo()!=null) {
							this.detallegrupoactivofijosForeignKey.add(gastodepreciacion.getDetalleGrupoActivoFijo());
						}

						this.addItemDefectoCombosForeignKeyDetalleGrupoActivoFijo();
						this.cargarCombosFrameDetalleGrupoActivoFijosForeignKey("Todos");
					}
					this.setActualDetalleGrupoActivoFijoForeignKey(this.gastodepreciacion.getid_detalle_grupo_activo_fijo(),false,"Formulario");
				} catch(Exception e) {
					throw e;
				}
				
				this.actualizarEstadoCeldasBotonesGastoDepreciacion("s", this.isGuardarCambiosEnLote, this.isEsMantenimientoRelacionado);
				
				//NO FUNCIONA BINDING PERO SE MANTIENE
				this.inicializarActualizarBindingBotonesGastoDepreciacion(false) ;
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualGastoDepreciacion() ;
			//}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,GastoDepreciacionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesObjetoActualToFormularioTodoGastoDepreciacion(GastoDepreciacion gastodepreciacion) throws Exception { 
		this.setVariablesObjetoActualToFormularioTodoGastoDepreciacion(gastodepreciacion,false,"NINGUNO");
	}
	
	public void setVariablesObjetoActualToFormularioTodoGastoDepreciacion(GastoDepreciacion gastodepreciacion,Boolean conCargarListasDesdeObjetoActual,String sTipoEvento) throws Exception { 
		this.setVariablesObjetoActualToFormularioGastoDepreciacion(gastodepreciacion);
		
		if(conCargarListasDesdeObjetoActual) {
			this.setVariablesObjetoActualToListasForeignKeyGastoDepreciacion(gastodepreciacion,sTipoEvento);
		}
		
		this.setVariablesObjetoActualToFormularioForeignKeyGastoDepreciacion(gastodepreciacion);
	}
	
	public void setVariablesObjetoActualToFormularioGastoDepreciacion(GastoDepreciacion gastodepreciacion) throws Exception { 
		try {			
			Image imageActual=null;
			ImageIcon imageIcon = null;
			
			if(this.jInternalFrameDetalleFormGastoDepreciacion==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			
			this.jInternalFrameDetalleFormGastoDepreciacion.jLabelidGastoDepreciacion.setText(gastodepreciacion.getId().toString());
			this.jInternalFrameDetalleFormGastoDepreciacion.jTextFieldanioGastoDepreciacion.setText(gastodepreciacion.getanio().toString());
			this.jInternalFrameDetalleFormGastoDepreciacion.jTextFieldvalorGastoDepreciacion.setText(gastodepreciacion.getvalor().toString());
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,GastoDepreciacionConstantesFunciones.CLASSNAME);
		}
	}
		
	public void actualizarInformacion(String sTipo,GastoDepreciacion gastodepreciacionLocal) throws Exception {
		this.actualizarInformacion(sTipo,false,gastodepreciacionLocal);
	}	
	
	public void actualizarInformacion(String sTipo,Boolean conParametroObjeto,GastoDepreciacion gastodepreciacionLocal) throws Exception {
		
		if(!conParametroObjeto) {
			if(!this.getEsControlTabla()) {
				gastodepreciacionLocal=this.gastodepreciacion;
			} else {
				gastodepreciacionLocal=this.gastodepreciacionAnterior;
			}
		}
		
		if(this.permiteMantenimiento(gastodepreciacionLocal)) {
			if(sTipo.equals("EVENTO_CONTROL")) { // || sTipo.equals("EVENTO_NUEVO")
				if(!this.esControlTabla) {
					this.setVariablesFormularioToObjetoActualTodoGastoDepreciacion(gastodepreciacionLocal,true);
					
					if(gastodepreciacionSessionBean.getConGuardarRelaciones()) {
						this.actualizarRelaciones(gastodepreciacionLocal);
					}
				}
			
			} else if(sTipo.equals("INFO_PADRE")) {
				
				if(this.gastodepreciacionSessionBean.getEsGuardarRelacionado()) {
					this.actualizarRelacionFkPadreActual(gastodepreciacionLocal);
				}
			}
		}
	}
	
	public void setVariablesFormularioToObjetoActualTodoGastoDepreciacion(GastoDepreciacion gastodepreciacion,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualGastoDepreciacion(gastodepreciacion,conColumnasBase);
		this.setVariablesFormularioToObjetoActualForeignKeysGastoDepreciacion(gastodepreciacion);
	}
	
	public void setVariablesFormularioToObjetoActualGastoDepreciacion(GastoDepreciacion gastodepreciacion,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualGastoDepreciacion(gastodepreciacion,conColumnasBase,true);
	}
	
	public void setVariablesFormularioToObjetoActualGastoDepreciacion(GastoDepreciacion gastodepreciacion,Boolean conColumnasBase,Boolean conInicializarInvalidValues) throws Exception { 
		String sMensajeCampoActual="";
		Boolean estaValidado=true;
		try {
			
			if(this.jInternalFrameDetalleFormGastoDepreciacion==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			if(conInicializarInvalidValues) {
				this.inicializarInvalidValues();
			}
			
			

		try {
			if(this.jInternalFrameDetalleFormGastoDepreciacion.jLabelidGastoDepreciacion.getText()==null || this.jInternalFrameDetalleFormGastoDepreciacion.jLabelidGastoDepreciacion.getText()=="" || this.jInternalFrameDetalleFormGastoDepreciacion.jLabelidGastoDepreciacion.getText()=="Id") {
				this.jInternalFrameDetalleFormGastoDepreciacion.jLabelidGastoDepreciacion.setText("0");
			}

			if(conColumnasBase) {gastodepreciacion.setId(Long.parseLong(this.jInternalFrameDetalleFormGastoDepreciacion.jLabelidGastoDepreciacion.getText()));}
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+GastoDepreciacionConstantesFunciones.LABEL_ID+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormGastoDepreciacion.jLabelIdGastoDepreciacion,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			gastodepreciacion.setanio(Integer.parseInt(this.jInternalFrameDetalleFormGastoDepreciacion.jTextFieldanioGastoDepreciacion.getText()));
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+GastoDepreciacionConstantesFunciones.LABEL_ANIO+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormGastoDepreciacion.jLabelanioGastoDepreciacion,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			gastodepreciacion.setvalor(Double.parseDouble(this.jInternalFrameDetalleFormGastoDepreciacion.jTextFieldvalorGastoDepreciacion.getText()));
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+GastoDepreciacionConstantesFunciones.LABEL_VALOR+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormGastoDepreciacion.jLabelvalorGastoDepreciacion,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}
			
			if(!estaValidado) {
				throw new Exception(sMensajeCampoActual);
			}
		} catch(NumberFormatException e) {
			throw new Exception(sMensajeCampoActual);
			//FuncionesSwing.manageException(this, e,logger,MovimientoInventarioConstantesFunciones.CLASSNAME);
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,GastoDepreciacionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualGastoDepreciacion(GastoDepreciacion gastodepreciacionBean,GastoDepreciacion gastodepreciacion,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			if(conDefault || (!conDefault && gastodepreciacionBean.getid_detalle_grupo_activo_fijo()!=null && !gastodepreciacionBean.getid_detalle_grupo_activo_fijo().equals(-1L))) {gastodepreciacion.setid_detalle_grupo_activo_fijo(gastodepreciacionBean.getid_detalle_grupo_activo_fijo());}
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,GastoDepreciacionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setCopiarVariablesObjetosGastoDepreciacion(GastoDepreciacion gastodepreciacionOrigen,GastoDepreciacion gastodepreciacion,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			if(conColumnasBase) {if(conDefault || (!conDefault && gastodepreciacionOrigen.getId()!=null && !gastodepreciacionOrigen.getId().equals(0L))) {gastodepreciacion.setId(gastodepreciacionOrigen.getId());}}
			if(conDefault || (!conDefault && gastodepreciacionOrigen.getid_detalle_grupo_activo_fijo()!=null && !gastodepreciacionOrigen.getid_detalle_grupo_activo_fijo().equals(-1L))) {gastodepreciacion.setid_detalle_grupo_activo_fijo(gastodepreciacionOrigen.getid_detalle_grupo_activo_fijo());}
			if(conDefault || (!conDefault && gastodepreciacionOrigen.getanio()!=null && !gastodepreciacionOrigen.getanio().equals(0))) {gastodepreciacion.setanio(gastodepreciacionOrigen.getanio());}
			if(conDefault || (!conDefault && gastodepreciacionOrigen.getvalor()!=null && !gastodepreciacionOrigen.getvalor().equals(0.0))) {gastodepreciacion.setvalor(gastodepreciacionOrigen.getvalor());}
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,GastoDepreciacionConstantesFunciones.CLASSNAME);
		}
	}
	
	/*
	public void setVariablesObjetoBeanActualToFormularioGastoDepreciacion(GastoDepreciacion gastodepreciacion) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormGastoDepreciacion.jLabelidGastoDepreciacion.setText(gastodepreciacion.getId().toString());
			this.jInternalFrameDetalleFormGastoDepreciacion.jTextFieldanioGastoDepreciacion.setText(gastodepreciacion.getanio().toString());
			this.jInternalFrameDetalleFormGastoDepreciacion.jTextFieldvalorGastoDepreciacion.setText(gastodepreciacion.getvalor().toString());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,GastoDepreciacionConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoBeanActualToFormularioGastoDepreciacion(GastoDepreciacionBean gastodepreciacionBean) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormGastoDepreciacion.jLabelidGastoDepreciacion.setText(gastodepreciacionBean.getId().toString());
			this.jInternalFrameDetalleFormGastoDepreciacion.jTextFieldanioGastoDepreciacion.setText(gastodepreciacionBean.getanio().toString());
			this.jInternalFrameDetalleFormGastoDepreciacion.jTextFieldvalorGastoDepreciacion.setText(gastodepreciacionBean.getvalor().toString());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,GastoDepreciacionConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoReturnGeneralToBeanGastoDepreciacion(GastoDepreciacionParameterReturnGeneral gastodepreciacionReturnGeneral,GastoDepreciacionBean gastodepreciacionBean,Boolean conDefault) throws Exception { 
		try {
			GastoDepreciacion gastodepreciacionLocal=new GastoDepreciacion();
			
			gastodepreciacionLocal=gastodepreciacionReturnGeneral.getGastoDepreciacion();
			
			
			if(conColumnasBase) {if(conDefault || (!conDefault && gastodepreciacionLocal.getId()!=null && !gastodepreciacionLocal.getId().equals(0L))) {gastodepreciacionBean.setId(gastodepreciacionLocal.getId());}}
			if(conDefault || (!conDefault && gastodepreciacionLocal.getid_detalle_grupo_activo_fijo()!=null && !gastodepreciacionLocal.getid_detalle_grupo_activo_fijo().equals(-1L))) {gastodepreciacionBean.setid_detalle_grupo_activo_fijo(gastodepreciacionLocal.getid_detalle_grupo_activo_fijo());}
			if(conDefault || (!conDefault && gastodepreciacionLocal.getanio()!=null && !gastodepreciacionLocal.getanio().equals(0))) {gastodepreciacionBean.setanio(gastodepreciacionLocal.getanio());}
			if(conDefault || (!conDefault && gastodepreciacionLocal.getvalor()!=null && !gastodepreciacionLocal.getvalor().equals(0.0))) {gastodepreciacionBean.setvalor(gastodepreciacionLocal.getvalor());}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,GastoDepreciacionConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	@SuppressWarnings("rawtypes")
	public static void setActualComboBoxGastoDepreciacionGenerico(Long idGastoDepreciacionSeleccionado,JComboBox jComboBoxGastoDepreciacion,List<GastoDepreciacion> gastodepreciacionsLocal)throws Exception {
		try {
			GastoDepreciacion  gastodepreciacionTemp=null;

			for(GastoDepreciacion gastodepreciacionAux:gastodepreciacionsLocal) {
				if(gastodepreciacionAux.getId()!=null && gastodepreciacionAux.getId().equals(idGastoDepreciacionSeleccionado)) {
					gastodepreciacionTemp=gastodepreciacionAux;
					break;
				}
			}

			jComboBoxGastoDepreciacion.setSelectedItem(gastodepreciacionTemp);

		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("rawtypes")
	public static void setHotKeysComboBoxGastoDepreciacionGenerico(JComboBox jComboBoxGastoDepreciacion,JInternalFrameBase jInternalFrameBase,String sNombreHotKeyAbstractAction,String sTipoBusqueda)throws Exception {
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
				
				jComboBoxGastoDepreciacion.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxGastoDepreciacion.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Busqueda"));
				//BUSCAR
				
				
				//ACTUALIZAR
				sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
				keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_ACTUALIZAR");
				
				jComboBoxGastoDepreciacion.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxGastoDepreciacion.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Update"));
				//ACTUALIZAR
				
				if(sTipoBusqueda.contains("CON_EVENT_CHANGE")) {
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxGastoDepreciacion.addFocusListener(new ComboBoxFocusListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
						jComboBoxGastoDepreciacion.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));						
					}
					
					/*
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxGastoDepreciacion.addItemListener(new ComboBoxItemListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					} else {
						jComboBoxGastoDepreciacion.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					}
					*/
				}								
				
				//CON_BUSQUEDA								
				if(sTipoBusqueda.contains("CON_BUSQUEDA")) {
					sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
					keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_BUSQUEDA");
							
					jComboBoxGastoDepreciacion.getInputMap().put(keyStrokeControl, sKeyStrokeName);
					jComboBoxGastoDepreciacion.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction));
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
			
		if(sTipo.equals("CuentaContaGastoDepre")) {
			jButtonCuentaContaGastoDepreActionPerformed(evt,rowIndex,true,false,null);
		}
		} catch (Exception e) {
			FuncionesSwing.manageException2(this, e,logger,GastoDepreciacionConstantesFunciones.CLASSNAME);
		}
	}
	
	public String getDescripcionFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		String sDescripcion="";
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			gastodepreciacion=(GastoDepreciacion) gastodepreciacionLogic.getGastoDepreciacions().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			gastodepreciacion =(GastoDepreciacion) gastodepreciacions.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		if(sTipo.equals("Empresa")) {
			//sDescripcion=this.getActualEmpresaForeignKeyDescripcion((Long)value);
			if(!gastodepreciacion.getIsNew() && !gastodepreciacion.getIsChanged() && !gastodepreciacion.getIsDeleted()) {
				sDescripcion=gastodepreciacion.getempresa_descripcion();
			} else {
				//sDescripcion=this.getActualEmpresaForeignKeyDescripcion((Long)value);
				sDescripcion=gastodepreciacion.getempresa_descripcion();
			}
		}

		if(sTipo.equals("DetalleGrupoActivoFijo")) {
			//sDescripcion=this.getActualDetalleGrupoActivoFijoForeignKeyDescripcion((Long)value);
			if(!gastodepreciacion.getIsNew() && !gastodepreciacion.getIsChanged() && !gastodepreciacion.getIsDeleted()) {
				sDescripcion=gastodepreciacion.getdetallegrupoactivofijo_descripcion();
			} else {
				//sDescripcion=this.getActualDetalleGrupoActivoFijoForeignKeyDescripcion((Long)value);
				sDescripcion=gastodepreciacion.getdetallegrupoactivofijo_descripcion();
			}
		}

		
		return sDescripcion;
	}
	
	public Color getColorFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		Color color=Color.WHITE;
		
		GastoDepreciacion gastodepreciacionRow=new GastoDepreciacion();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			gastodepreciacionRow=(GastoDepreciacion) gastodepreciacionLogic.getGastoDepreciacions().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			gastodepreciacionRow=(GastoDepreciacion) gastodepreciacions.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		
		return color;
	}
	
	
	
	
	public void jButtonCuentaContaGastoDepreActionPerformed(ActionEvent evt,int rowIndex,Boolean conInicializar,Boolean esRelacionado,GastoDepreciacion gastodepreciacion) throws Exception {
			try {

				if(this.jInternalFrameDetalleFormGastoDepreciacion==null) {
					this.inicializarFormDetalle();
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.gastodepreciacionLogic.getNewConnexionToDeep("");
				}

				int intSelectedRow =rowIndex;

				if(intSelectedRow!=-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.gastodepreciacion = (GastoDepreciacion)this.gastodepreciacionLogic.getGastoDepreciacions().toArray()[this.jTableDatosGastoDepreciacion.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE) {
						this.gastodepreciacion = (GastoDepreciacion)this.gastodepreciacions.toArray()[this.jTableDatosGastoDepreciacion.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				} else {
					if(gastodepreciacion!=null) {
						this.gastodepreciacion = gastodepreciacion;
					} else {
						this.gastodepreciacion = new GastoDepreciacion();
					}
				}

				if(this.isTienePermisosCuentaContaGastoDepre && this.permiteMantenimiento(this.gastodepreciacion)) {
					CuentaContaGastoDepreBeanSwingJInternalFrame cuentacontagastodepreBeanSwingJInternalFrame=null;

					if(conInicializar) {
						this.jInternalFrameDetalleFormGastoDepreciacion.cuentacontagastodepreBeanSwingJInternalFramePopup=new CuentaContaGastoDepreBeanSwingJInternalFrame(false,false,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.SECUNDARIO,false,false,true,false);
						this.jInternalFrameDetalleFormGastoDepreciacion.cuentacontagastodepreBeanSwingJInternalFramePopup.setJInternalFrameParent(this);

						cuentacontagastodepreBeanSwingJInternalFrame=this.jInternalFrameDetalleFormGastoDepreciacion.cuentacontagastodepreBeanSwingJInternalFramePopup;
					} else {
						cuentacontagastodepreBeanSwingJInternalFrame=this.jInternalFrameDetalleFormGastoDepreciacion.cuentacontagastodepreBeanSwingJInternalFrame;
					}

					List<GastoDepreciacion> gastodepreciacions=new ArrayList<GastoDepreciacion>();
					gastodepreciacions.add(this.gastodepreciacion);
					if(!esRelacionado) {
						//cuentacontagastodepreBeanSwingJInternalFrame.cuentacontagastodepreSessionBean.setConGuardarRelaciones(false);
						//cuentacontagastodepreBeanSwingJInternalFrame.cuentacontagastodepreSessionBean.setEsGuardarRelacionado(false);
					}

					//DESHABILITA TEMPORALMENTE EVENTOS CHANGE DE TEXTOS,COMBOS,ETC
					cuentacontagastodepreBeanSwingJInternalFrame.estaModoSeleccionar=true;
					this.jInternalFrameDetalleFormGastoDepreciacion.cargarCuentaContaGastoDepreBeanSwingJInternalFrame(gastodepreciacions,this.gastodepreciacion,cuentacontagastodepreBeanSwingJInternalFrame,/*conInicializar,*/cuentacontagastodepreBeanSwingJInternalFrame.cuentacontagastodepreSessionBean.getConGuardarRelaciones(),cuentacontagastodepreBeanSwingJInternalFrame.cuentacontagastodepreSessionBean.getEsGuardarRelacionado());
					cuentacontagastodepreBeanSwingJInternalFrame.estaModoSeleccionar=false;


					if(!esRelacionado) {
						cuentacontagastodepreBeanSwingJInternalFrame.actualizarEstadoPanelsCuentaContaGastoDepre("no_relacionado");

						cuentacontagastodepreBeanSwingJInternalFrame.redimensionarTablaDatosConTamanio(CuentaContaGastoDepreConstantesFunciones.ITAMANIOFILATABLA + (CuentaContaGastoDepreConstantesFunciones.ITAMANIOFILATABLA/2));

						cuentacontagastodepreBeanSwingJInternalFrame.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_REL_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_REL_Y));

						TitledBorder titledBorderGastoDepreciacion=(TitledBorder)this.jScrollPanelDatosGastoDepreciacion.getBorder();
						TitledBorder titledBorderCuentaContaGastoDepre=(TitledBorder)cuentacontagastodepreBeanSwingJInternalFrame.jScrollPanelDatosCuentaContaGastoDepre.getBorder();

						titledBorderCuentaContaGastoDepre.setTitle(titledBorderGastoDepreciacion.getTitle() + " -> Cuenta Conta Gasto Depre");

						if(!Constantes.CON_VARIAS_VENTANAS) {
							MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,cuentacontagastodepreBeanSwingJInternalFrame);
						}

						cuentacontagastodepreBeanSwingJInternalFrame.setVisible(true);

						this.jDesktopPane.add(cuentacontagastodepreBeanSwingJInternalFrame);

						cuentacontagastodepreBeanSwingJInternalFrame.setSelected(true);
					}

				} else {
					if(!this.gastodepreciacionSessionBean.getConGuardarRelaciones()) {
						JOptionPane.showMessageDialog(this,"NO TIENE PERMISOS PARA USAR LA FUNCIONALIDAD DE Cuenta Conta Gasto Depre",Constantes.SERROR,JOptionPane.ERROR_MESSAGE);
					}
				}
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.gastodepreciacionLogic.commitNewConnexionToDeep();
				}

			}

			catch(Exception e) {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.gastodepreciacionLogic.rollbackNewConnexionToDeep();
				}


				FuncionesSwing.manageException2(this, e,logger,GastoDepreciacionConstantesFunciones.CLASSNAME);
			} finally { 
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.gastodepreciacionLogic.closeNewConnexionToDeep();
				}

			}
		}

	
	
	
	public void refrescarBindingTabla(Boolean blnSoloTabla) {
	}
	
	public void inicializarActualizarBindingBotonesManualGastoDepreciacion(Boolean esSetControles) {						
		if(esSetControles) {
			this.jButtonNuevoGastoDepreciacion.setVisible((this.isVisibilidadCeldaNuevoGastoDepreciacion && this.isPermisoNuevoGastoDepreciacion));			
			this.jButtonDuplicarGastoDepreciacion.setVisible((this.isVisibilidadCeldaDuplicarGastoDepreciacion && this.isPermisoDuplicarGastoDepreciacion));			
			this.jButtonCopiarGastoDepreciacion.setVisible((this.isVisibilidadCeldaCopiarGastoDepreciacion && this.isPermisoCopiarGastoDepreciacion));
			this.jButtonVerFormGastoDepreciacion.setVisible((this.isVisibilidadCeldaVerFormGastoDepreciacion && this.isPermisoVerFormGastoDepreciacion));
			
			this.jButtonAbrirOrderByGastoDepreciacion.setVisible((this.isVisibilidadCeldaOrdenGastoDepreciacion && this.isPermisoOrdenGastoDepreciacion));			
			
			this.jButtonNuevoRelacionesGastoDepreciacion.setVisible((this.isVisibilidadCeldaNuevoRelacionesGastoDepreciacion && this.isPermisoNuevoGastoDepreciacion));			
			this.jButtonNuevoGuardarCambiosGastoDepreciacion.setVisible((this.isVisibilidadCeldaNuevoGastoDepreciacion && this.isPermisoNuevoGastoDepreciacion && this.isPermisoGuardarCambiosGastoDepreciacion));
			
			if(this.jInternalFrameDetalleFormGastoDepreciacion!=null) {
			this.jInternalFrameDetalleFormGastoDepreciacion.jButtonModificarGastoDepreciacion.setVisible((this.isVisibilidadCeldaModificarGastoDepreciacion && this.isPermisoActualizarGastoDepreciacion));	
			this.jInternalFrameDetalleFormGastoDepreciacion.jButtonActualizarGastoDepreciacion.setVisible((this.isVisibilidadCeldaActualizarGastoDepreciacion && this.isPermisoActualizarGastoDepreciacion));	
			this.jInternalFrameDetalleFormGastoDepreciacion.jButtonEliminarGastoDepreciacion.setVisible((this.isVisibilidadCeldaEliminarGastoDepreciacion && this.isPermisoEliminarGastoDepreciacion));
			this.jInternalFrameDetalleFormGastoDepreciacion.jButtonCancelarGastoDepreciacion.setVisible(this.isVisibilidadCeldaCancelarGastoDepreciacion);							
			this.jInternalFrameDetalleFormGastoDepreciacion.jButtonGuardarCambiosGastoDepreciacion.setVisible((this.isVisibilidadCeldaGuardarGastoDepreciacion && this.isPermisoGuardarCambiosGastoDepreciacion));			
			
			}
						
			this.jButtonGuardarCambiosTablaGastoDepreciacion.setVisible((this.isVisibilidadCeldaGuardarCambiosGastoDepreciacion && this.isPermisoGuardarCambiosGastoDepreciacion));							
			
			//TOOLBAR
			
			this.jButtonNuevoToolBarGastoDepreciacion.setVisible((this.isVisibilidadCeldaNuevoGastoDepreciacion && this.isPermisoNuevoGastoDepreciacion));						
			this.jButtonDuplicarToolBarGastoDepreciacion.setVisible((this.isVisibilidadCeldaDuplicarGastoDepreciacion && this.isPermisoDuplicarGastoDepreciacion));						
			this.jButtonCopiarToolBarGastoDepreciacion.setVisible((this.isVisibilidadCeldaCopiarGastoDepreciacion && this.isPermisoCopiarGastoDepreciacion));			
			this.jButtonVerFormToolBarGastoDepreciacion.setVisible((this.isVisibilidadCeldaVerFormGastoDepreciacion && this.isPermisoVerFormGastoDepreciacion));			
			this.jButtonAbrirOrderByToolBarGastoDepreciacion.setVisible((this.isVisibilidadCeldaOrdenGastoDepreciacion && this.isPermisoOrdenGastoDepreciacion));
			this.jButtonNuevoRelacionesToolBarGastoDepreciacion.setVisible((this.isVisibilidadCeldaNuevoRelacionesGastoDepreciacion && this.isPermisoNuevoGastoDepreciacion));			
			this.jButtonNuevoGuardarCambiosToolBarGastoDepreciacion.setVisible((this.isVisibilidadCeldaNuevoGastoDepreciacion && this.isPermisoNuevoGastoDepreciacion && this.isPermisoGuardarCambiosGastoDepreciacion));			
			
			if(this.jInternalFrameDetalleFormGastoDepreciacion!=null) {
			this.jInternalFrameDetalleFormGastoDepreciacion.jButtonModificarToolBarGastoDepreciacion.setVisible((this.isVisibilidadCeldaModificarGastoDepreciacion && this.isPermisoActualizarGastoDepreciacion));	
			this.jInternalFrameDetalleFormGastoDepreciacion.jButtonActualizarToolBarGastoDepreciacion.setVisible((this.isVisibilidadCeldaActualizarGastoDepreciacion  && this.isPermisoActualizarGastoDepreciacion));	
			this.jInternalFrameDetalleFormGastoDepreciacion.jButtonEliminarToolBarGastoDepreciacion.setVisible((this.isVisibilidadCeldaEliminarGastoDepreciacion && this.isPermisoEliminarGastoDepreciacion));
			this.jInternalFrameDetalleFormGastoDepreciacion.jButtonCancelarToolBarGastoDepreciacion.setVisible(this.isVisibilidadCeldaCancelarGastoDepreciacion);				
			this.jInternalFrameDetalleFormGastoDepreciacion.jButtonGuardarCambiosToolBarGastoDepreciacion.setVisible((this.isVisibilidadCeldaGuardarGastoDepreciacion && this.isPermisoGuardarCambiosGastoDepreciacion));									
			}
			
			this.jButtonGuardarCambiosTablaToolBarGastoDepreciacion.setVisible((this.isVisibilidadCeldaGuardarCambiosGastoDepreciacion && this.isPermisoGuardarCambiosGastoDepreciacion));									
			
			//TOOLBAR
			
			//MENUS
			
			this.jMenuItemNuevoGastoDepreciacion.setVisible((this.isVisibilidadCeldaNuevoGastoDepreciacion && this.isPermisoNuevoGastoDepreciacion));			
			this.jMenuItemDuplicarGastoDepreciacion.setVisible((this.isVisibilidadCeldaDuplicarGastoDepreciacion && this.isPermisoDuplicarGastoDepreciacion));			
			this.jMenuItemCopiarGastoDepreciacion.setVisible((this.isVisibilidadCeldaCopiarGastoDepreciacion && this.isPermisoCopiarGastoDepreciacion));			
			this.jMenuItemVerFormGastoDepreciacion.setVisible((this.isVisibilidadCeldaVerFormGastoDepreciacion && this.isPermisoVerFormGastoDepreciacion));			
			this.jMenuItemAbrirOrderByGastoDepreciacion.setVisible((this.isVisibilidadCeldaOrdenGastoDepreciacion && this.isPermisoOrdenGastoDepreciacion));			
			//this.jMenuItemMostrarOcultarGastoDepreciacion.setVisible((this.isVisibilidadCeldaOrdenGastoDepreciacion && this.isPermisoOrdenGastoDepreciacion));
			this.jMenuItemDetalleAbrirOrderByGastoDepreciacion.setVisible((this.isVisibilidadCeldaOrdenGastoDepreciacion && this.isPermisoOrdenGastoDepreciacion));			
			//this.jMenuItemDetalleMostrarOcultarGastoDepreciacion.setVisible((this.isVisibilidadCeldaOrdenGastoDepreciacion && this.isPermisoOrdenGastoDepreciacion));			
			this.jMenuItemNuevoRelacionesGastoDepreciacion.setVisible((this.isVisibilidadCeldaNuevoRelacionesGastoDepreciacion && this.isPermisoNuevoGastoDepreciacion));			
			this.jMenuItemNuevoGuardarCambiosGastoDepreciacion.setVisible((this.isVisibilidadCeldaNuevoGastoDepreciacion && this.isPermisoNuevoGastoDepreciacion && this.isPermisoGuardarCambiosGastoDepreciacion));									
			
			if(this.jInternalFrameDetalleFormGastoDepreciacion!=null) {
			this.jInternalFrameDetalleFormGastoDepreciacion.jMenuItemModificarGastoDepreciacion.setVisible((this.isVisibilidadCeldaModificarGastoDepreciacion && this.isPermisoActualizarGastoDepreciacion));	
			this.jInternalFrameDetalleFormGastoDepreciacion.jMenuItemActualizarGastoDepreciacion.setVisible((this.isVisibilidadCeldaActualizarGastoDepreciacion && this.isPermisoActualizarGastoDepreciacion));	
			this.jInternalFrameDetalleFormGastoDepreciacion.jMenuItemEliminarGastoDepreciacion.setVisible((this.isVisibilidadCeldaEliminarGastoDepreciacion && this.isPermisoEliminarGastoDepreciacion));
			this.jInternalFrameDetalleFormGastoDepreciacion.jMenuItemCancelarGastoDepreciacion.setVisible(this.isVisibilidadCeldaCancelarGastoDepreciacion);				
			}
			
			this.jMenuItemGuardarCambiosGastoDepreciacion.setVisible((this.isVisibilidadCeldaGuardarGastoDepreciacion && this.isPermisoGuardarCambiosGastoDepreciacion));						
			this.jMenuItemGuardarCambiosTablaGastoDepreciacion.setVisible((this.isVisibilidadCeldaGuardarCambiosGastoDepreciacion && this.isPermisoGuardarCambiosGastoDepreciacion));						
			
			//MENUS
			
		} else {
			this.isVisibilidadCeldaNuevoGastoDepreciacion=this.jButtonNuevoGastoDepreciacion.isVisible();
			this.isVisibilidadCeldaDuplicarGastoDepreciacion=this.jButtonDuplicarGastoDepreciacion.isVisible();
			this.isVisibilidadCeldaCopiarGastoDepreciacion=this.jButtonCopiarGastoDepreciacion.isVisible();
			this.isVisibilidadCeldaVerFormGastoDepreciacion=this.jButtonVerFormGastoDepreciacion.isVisible();
			
			this.isVisibilidadCeldaOrdenGastoDepreciacion=this.jButtonAbrirOrderByGastoDepreciacion.isVisible();			
			
			this.isVisibilidadCeldaNuevoRelacionesGastoDepreciacion=this.jButtonNuevoRelacionesGastoDepreciacion.isVisible();
			this.isVisibilidadCeldaModificarGastoDepreciacion=this.jButtonModificarGastoDepreciacion.isVisible();
			
			if(this.jInternalFrameDetalleFormGastoDepreciacion!=null) {
			this.isVisibilidadCeldaActualizarGastoDepreciacion=this.jInternalFrameDetalleFormGastoDepreciacion.jButtonActualizarGastoDepreciacion.isVisible();
			this.isVisibilidadCeldaEliminarGastoDepreciacion=this.jInternalFrameDetalleFormGastoDepreciacion.jButtonEliminarGastoDepreciacion.isVisible();
			this.isVisibilidadCeldaCancelarGastoDepreciacion=this.jInternalFrameDetalleFormGastoDepreciacion.jButtonCancelarGastoDepreciacion.isVisible();
			this.isVisibilidadCeldaGuardarGastoDepreciacion=this.jInternalFrameDetalleFormGastoDepreciacion.jButtonGuardarCambiosGastoDepreciacion.isVisible();			
			}
			
			this.isVisibilidadCeldaGuardarCambiosGastoDepreciacion=this.jButtonGuardarCambiosTablaGastoDepreciacion.isVisible();
			
			//TOOLBAR
			
			this.isVisibilidadCeldaNuevoGastoDepreciacion=this.jButtonNuevoToolBarGastoDepreciacion.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesGastoDepreciacion=this.jButtonNuevoRelacionesToolBarGastoDepreciacion.isVisible();
			
			if(this.jInternalFrameDetalleFormGastoDepreciacion!=null) {
			this.isVisibilidadCeldaModificarGastoDepreciacion=this.jInternalFrameDetalleFormGastoDepreciacion.jButtonModificarToolBarGastoDepreciacion.isVisible();
			this.isVisibilidadCeldaActualizarGastoDepreciacion=this.jInternalFrameDetalleFormGastoDepreciacion.jButtonActualizarToolBarGastoDepreciacion.isVisible();
			this.isVisibilidadCeldaEliminarGastoDepreciacion=this.jInternalFrameDetalleFormGastoDepreciacion.jButtonEliminarToolBarGastoDepreciacion.isVisible();
			this.isVisibilidadCeldaCancelarGastoDepreciacion=this.jInternalFrameDetalleFormGastoDepreciacion.jButtonCancelarToolBarGastoDepreciacion.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarGastoDepreciacion=this.jButtonGuardarCambiosToolBarGastoDepreciacion.isVisible();
			this.isVisibilidadCeldaGuardarCambiosGastoDepreciacion=this.jButtonGuardarCambiosTablaToolBarGastoDepreciacion.isVisible();						
			
			//TOOLBAR
			
			//MENUS
			
			this.isVisibilidadCeldaNuevoGastoDepreciacion=this.jMenuItemNuevoGastoDepreciacion.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesGastoDepreciacion=this.jMenuItemNuevoRelacionesGastoDepreciacion.isVisible();
			
			if(this.jInternalFrameDetalleFormGastoDepreciacion!=null) {
			this.isVisibilidadCeldaModificarGastoDepreciacion=this.jInternalFrameDetalleFormGastoDepreciacion.jMenuItemModificarGastoDepreciacion.isVisible();
			this.isVisibilidadCeldaActualizarGastoDepreciacion=this.jInternalFrameDetalleFormGastoDepreciacion.jMenuItemActualizarGastoDepreciacion.isVisible();
			this.isVisibilidadCeldaEliminarGastoDepreciacion=this.jInternalFrameDetalleFormGastoDepreciacion.jMenuItemEliminarGastoDepreciacion.isVisible();
			this.isVisibilidadCeldaCancelarGastoDepreciacion=this.jInternalFrameDetalleFormGastoDepreciacion.jMenuItemCancelarGastoDepreciacion.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarGastoDepreciacion=this.jMenuItemGuardarCambiosGastoDepreciacion.isVisible();
			this.isVisibilidadCeldaGuardarCambiosGastoDepreciacion=this.jMenuItemGuardarCambiosTablaGastoDepreciacion.isVisible();						
			
			//MENUS
		}
	}
	
	public void inicializarActualizarBindingBotonesGastoDepreciacion(Boolean esInicializar) {
		if(GastoDepreciacionJInternalFrame.ISBINDING_MANUAL) {			
			if(this.gastodepreciacionSessionBean.getConGuardarRelaciones()) {
				//if(this.gastodepreciacionSessionBean.getEsGuardarRelacionado()) {
				
				this.actualizarEstadoCeldasBotonesConGuardarRelacionesGastoDepreciacion();
			}
			
			this.inicializarActualizarBindingBotonesManualGastoDepreciacion(true);
			
		} else {	
		}
	}		
	
	public void inicializarActualizarBindingBotonesPermisosManualGastoDepreciacion() {
		this.jButtonNuevoGastoDepreciacion.setVisible(this.isPermisoNuevoGastoDepreciacion);			
		this.jButtonDuplicarGastoDepreciacion.setVisible(this.isPermisoDuplicarGastoDepreciacion);			
		this.jButtonCopiarGastoDepreciacion.setVisible(this.isPermisoCopiarGastoDepreciacion);			
		this.jButtonVerFormGastoDepreciacion.setVisible(this.isPermisoVerFormGastoDepreciacion);			
		
		this.jButtonAbrirOrderByGastoDepreciacion.setVisible(this.isPermisoOrdenGastoDepreciacion);					
		
		this.jButtonNuevoRelacionesGastoDepreciacion.setVisible(this.isPermisoNuevoGastoDepreciacion);			
		
		if(this.jInternalFrameDetalleFormGastoDepreciacion!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormGastoDepreciacion.jButtonModificarGastoDepreciacion.setVisible(this.isPermisoActualizarGastoDepreciacion);	
			this.jInternalFrameDetalleFormGastoDepreciacion.jButtonActualizarGastoDepreciacion.setVisible(this.isPermisoActualizarGastoDepreciacion);	
			this.jInternalFrameDetalleFormGastoDepreciacion.jButtonEliminarGastoDepreciacion.setVisible(this.isPermisoEliminarGastoDepreciacion);
			this.jInternalFrameDetalleFormGastoDepreciacion.jButtonCancelarGastoDepreciacion.setVisible(this.isVisibilidadCeldaCancelarGastoDepreciacion);						
			this.jInternalFrameDetalleFormGastoDepreciacion.jButtonGuardarCambiosGastoDepreciacion.setVisible(this.isPermisoGuardarCambiosGastoDepreciacion);							
		}
		
		this.jButtonGuardarCambiosTablaGastoDepreciacion.setVisible(this.isPermisoActualizarGastoDepreciacion);
	}
	
	public void inicializarActualizarBindingBotonesPermisosManualFormDetalleGastoDepreciacion() {
		this.jInternalFrameDetalleFormGastoDepreciacion.jButtonModificarGastoDepreciacion.setVisible(this.isPermisoActualizarGastoDepreciacion);	
		this.jInternalFrameDetalleFormGastoDepreciacion.jButtonActualizarGastoDepreciacion.setVisible(this.isPermisoActualizarGastoDepreciacion);	
		this.jInternalFrameDetalleFormGastoDepreciacion.jButtonEliminarGastoDepreciacion.setVisible(this.isPermisoEliminarGastoDepreciacion);
		this.jInternalFrameDetalleFormGastoDepreciacion.jButtonCancelarGastoDepreciacion.setVisible(this.isVisibilidadCeldaCancelarGastoDepreciacion);							
		this.jInternalFrameDetalleFormGastoDepreciacion.jButtonGuardarCambiosGastoDepreciacion.setVisible((this.isVisibilidadCeldaGuardarGastoDepreciacion && this.isPermisoGuardarCambiosGastoDepreciacion));			
	}
	
	public void inicializarActualizarBindingBotonesPermisosGastoDepreciacion() {
		if(GastoDepreciacionJInternalFrame.ISBINDING_MANUAL) {
			this.inicializarActualizarBindingBotonesPermisosManualGastoDepreciacion();
		} else {
		}
	}
	
	
	public void refrescarBindingBotonesGastoDepreciacion() {
	}
	
	public void jTableDatosGastoDepreciacionListSelectionListener(javax.swing.event.ListSelectionEvent evt) throws Exception { 
		try {
			this.seleccionarGastoDepreciacion(null,evt,-1);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,GastoDepreciacionConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonidGastoDepreciacionBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.gastodepreciacionLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosGastoDepreciacion.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualGastoDepreciacion(this.getgastodepreciacion(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysGastoDepreciacion(this.gastodepreciacion);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.gastodepreciacion =(GastoDepreciacion) this.gastodepreciacionLogic.getGastoDepreciacions().toArray()[this.jTableDatosGastoDepreciacion.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.gastodepreciacion =(GastoDepreciacion) this.gastodepreciacions.toArray()[this.jTableDatosGastoDepreciacion.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.gastodepreciacion==null) {
						this.gastodepreciacion = new GastoDepreciacion();
					}

					this.setVariablesFormularioToObjetoActualGastoDepreciacion(this.gastodepreciacion,true);
					this.setVariablesFormularioToObjetoActualForeignKeysGastoDepreciacion(this.gastodepreciacion);
				}

				if(this.gastodepreciacion.getId()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id = "+this.gastodepreciacion.getId().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingGastoDepreciacion(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.gastodepreciacionLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.gastodepreciacionLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,GastoDepreciacionConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.gastodepreciacionLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_empresaGastoDepreciacionUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.gastodepreciacionLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisoempresa=true;

			idTienePermisoempresa=this.tienePermisosUsuarioEnPaginaWebGastoDepreciacion(EmpresaConstantesFunciones.CLASSNAME);

			if(idTienePermisoempresa) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosGastoDepreciacion.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosGastoDepreciacion.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosGastoDepreciacion.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.gastodepreciacion =(GastoDepreciacion) this.gastodepreciacionLogic.getGastoDepreciacions().toArray()[this.jTableDatosGastoDepreciacion.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.gastodepreciacion =(GastoDepreciacion) this.gastodepreciacions.toArray()[this.jTableDatosGastoDepreciacion.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualGastoDepreciacion(this.getgastodepreciacion(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysGastoDepreciacion(this.gastodepreciacion);

				this.empresaBeanSwingJInternalFrame=new EmpresaBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.empresaBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.empresaBeanSwingJInternalFrame.getEmpresaLogic().setConnexion(this.gastodepreciacionLogic.getConnexion());

				if(this.gastodepreciacion.getid_empresa()!=null) {
					this.empresaBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.empresaBeanSwingJInternalFrame.setIdActual(this.gastodepreciacion.getid_empresa());
					this.empresaBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.empresaBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.empresaBeanSwingJInternalFrame.inicializarActualizarBindingTablaEmpresa();
				}

				JInternalFrameBase jinternalFrame =this.empresaBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderGastoDepreciacion=(TitledBorder)this.jScrollPanelDatosGastoDepreciacion.getBorder();
				TitledBorder titledBorderempresa=(TitledBorder)this.empresaBeanSwingJInternalFrame.jScrollPanelDatosEmpresa.getBorder();

				titledBorderempresa.setTitle(titledBorderGastoDepreciacion.getTitle() + " -> Empresa");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.gastodepreciacionLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.gastodepreciacionLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,GastoDepreciacionConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.gastodepreciacionLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_empresaGastoDepreciacionBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.gastodepreciacionLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosGastoDepreciacion.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualGastoDepreciacion(this.getgastodepreciacion(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysGastoDepreciacion(this.gastodepreciacion);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.gastodepreciacion =(GastoDepreciacion) this.gastodepreciacionLogic.getGastoDepreciacions().toArray()[this.jTableDatosGastoDepreciacion.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.gastodepreciacion =(GastoDepreciacion) this.gastodepreciacions.toArray()[this.jTableDatosGastoDepreciacion.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.gastodepreciacion==null) {
						this.gastodepreciacion = new GastoDepreciacion();
					}

					this.setVariablesFormularioToObjetoActualGastoDepreciacion(this.gastodepreciacion,true);
					this.setVariablesFormularioToObjetoActualForeignKeysGastoDepreciacion(this.gastodepreciacion);
				}

				if(this.gastodepreciacion.getid_empresa()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_empresa = "+this.gastodepreciacion.getid_empresa().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingGastoDepreciacion(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.gastodepreciacionLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.gastodepreciacionLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,GastoDepreciacionConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.gastodepreciacionLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_detalle_grupo_activo_fijoGastoDepreciacionUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.gastodepreciacionLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisodetallegrupoactivofijo=true;

			idTienePermisodetallegrupoactivofijo=this.tienePermisosUsuarioEnPaginaWebGastoDepreciacion(DetalleGrupoActivoFijoConstantesFunciones.CLASSNAME);

			if(idTienePermisodetallegrupoactivofijo) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosGastoDepreciacion.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosGastoDepreciacion.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosGastoDepreciacion.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.gastodepreciacion =(GastoDepreciacion) this.gastodepreciacionLogic.getGastoDepreciacions().toArray()[this.jTableDatosGastoDepreciacion.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.gastodepreciacion =(GastoDepreciacion) this.gastodepreciacions.toArray()[this.jTableDatosGastoDepreciacion.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualGastoDepreciacion(this.getgastodepreciacion(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysGastoDepreciacion(this.gastodepreciacion);

				this.detallegrupoactivofijoBeanSwingJInternalFrame=new DetalleGrupoActivoFijoBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.detallegrupoactivofijoBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.detallegrupoactivofijoBeanSwingJInternalFrame.getDetalleGrupoActivoFijoLogic().setConnexion(this.gastodepreciacionLogic.getConnexion());

				if(this.gastodepreciacion.getid_detalle_grupo_activo_fijo()!=null) {
					this.detallegrupoactivofijoBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.detallegrupoactivofijoBeanSwingJInternalFrame.setIdActual(this.gastodepreciacion.getid_detalle_grupo_activo_fijo());
					this.detallegrupoactivofijoBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.detallegrupoactivofijoBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.detallegrupoactivofijoBeanSwingJInternalFrame.inicializarActualizarBindingTablaDetalleGrupoActivoFijo();
				}

				JInternalFrameBase jinternalFrame =this.detallegrupoactivofijoBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderGastoDepreciacion=(TitledBorder)this.jScrollPanelDatosGastoDepreciacion.getBorder();
				TitledBorder titledBorderdetallegrupoactivofijo=(TitledBorder)this.detallegrupoactivofijoBeanSwingJInternalFrame.jScrollPanelDatosDetalleGrupoActivoFijo.getBorder();

				titledBorderdetallegrupoactivofijo.setTitle(titledBorderGastoDepreciacion.getTitle() + " -> Detalle Grupo Activo Fijo");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.gastodepreciacionLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.gastodepreciacionLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,GastoDepreciacionConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.gastodepreciacionLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_detalle_grupo_activo_fijoGastoDepreciacionBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.gastodepreciacionLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosGastoDepreciacion.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualGastoDepreciacion(this.getgastodepreciacion(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysGastoDepreciacion(this.gastodepreciacion);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.gastodepreciacion =(GastoDepreciacion) this.gastodepreciacionLogic.getGastoDepreciacions().toArray()[this.jTableDatosGastoDepreciacion.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.gastodepreciacion =(GastoDepreciacion) this.gastodepreciacions.toArray()[this.jTableDatosGastoDepreciacion.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.gastodepreciacion==null) {
						this.gastodepreciacion = new GastoDepreciacion();
					}

					this.setVariablesFormularioToObjetoActualGastoDepreciacion(this.gastodepreciacion,true);
					this.setVariablesFormularioToObjetoActualForeignKeysGastoDepreciacion(this.gastodepreciacion);
				}

				if(this.gastodepreciacion.getid_detalle_grupo_activo_fijo()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_detalle_grupo_activo_fijo = "+this.gastodepreciacion.getid_detalle_grupo_activo_fijo().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingGastoDepreciacion(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.gastodepreciacionLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.gastodepreciacionLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,GastoDepreciacionConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.gastodepreciacionLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonanioGastoDepreciacionBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.gastodepreciacionLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosGastoDepreciacion.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualGastoDepreciacion(this.getgastodepreciacion(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysGastoDepreciacion(this.gastodepreciacion);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.gastodepreciacion =(GastoDepreciacion) this.gastodepreciacionLogic.getGastoDepreciacions().toArray()[this.jTableDatosGastoDepreciacion.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.gastodepreciacion =(GastoDepreciacion) this.gastodepreciacions.toArray()[this.jTableDatosGastoDepreciacion.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.gastodepreciacion==null) {
						this.gastodepreciacion = new GastoDepreciacion();
					}

					this.setVariablesFormularioToObjetoActualGastoDepreciacion(this.gastodepreciacion,true);
					this.setVariablesFormularioToObjetoActualForeignKeysGastoDepreciacion(this.gastodepreciacion);
				}

				if(this.gastodepreciacion.getanio()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where anio = "+this.gastodepreciacion.getanio().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingGastoDepreciacion(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.gastodepreciacionLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.gastodepreciacionLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,GastoDepreciacionConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.gastodepreciacionLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonvalorGastoDepreciacionBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.gastodepreciacionLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosGastoDepreciacion.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualGastoDepreciacion(this.getgastodepreciacion(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysGastoDepreciacion(this.gastodepreciacion);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.gastodepreciacion =(GastoDepreciacion) this.gastodepreciacionLogic.getGastoDepreciacions().toArray()[this.jTableDatosGastoDepreciacion.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.gastodepreciacion =(GastoDepreciacion) this.gastodepreciacions.toArray()[this.jTableDatosGastoDepreciacion.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.gastodepreciacion==null) {
						this.gastodepreciacion = new GastoDepreciacion();
					}

					this.setVariablesFormularioToObjetoActualGastoDepreciacion(this.gastodepreciacion,true);
					this.setVariablesFormularioToObjetoActualForeignKeysGastoDepreciacion(this.gastodepreciacion);
				}

				if(this.gastodepreciacion.getvalor()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where valor = "+this.gastodepreciacion.getvalor().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingGastoDepreciacion(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.gastodepreciacionLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.gastodepreciacionLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,GastoDepreciacionConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.gastodepreciacionLogic.closeNewConnexionToDeep();
				}

			}
		}

	
	
	public void jButtonFK_IdDetalleGrupoActivoFijoGastoDepreciacionActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.gastodepreciacionLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingGastoDepreciacion(false,false);

			this.getGastoDepreciacionsFK_IdDetalleGrupoActivoFijo();

			this.inicializarActualizarBindingGastoDepreciacion(false);

			//if(GastoDepreciacionBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingGastoDepreciacion(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.gastodepreciacionLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.gastodepreciacionLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,GastoDepreciacionConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.gastodepreciacionLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdEmpresaGastoDepreciacionActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.gastodepreciacionLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingGastoDepreciacion(false,false);

			this.getGastoDepreciacionsFK_IdEmpresa();

			this.inicializarActualizarBindingGastoDepreciacion(false);

			//if(GastoDepreciacionBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingGastoDepreciacion(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.gastodepreciacionLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.gastodepreciacionLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,GastoDepreciacionConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.gastodepreciacionLogic.closeNewConnexionToDeep();
			}
		}
	}

	
	public void closingInternalFrameGastoDepreciacion() {
		if(this.jInternalFrameDetalleFormGastoDepreciacion!=null) {
		

		if(this.jInternalFrameDetalleFormGastoDepreciacion.cuentacontagastodepreBeanSwingJInternalFrame!=null) {
			this.jInternalFrameDetalleFormGastoDepreciacion.cuentacontagastodepreBeanSwingJInternalFrame.setVisible(false);
			this.jInternalFrameDetalleFormGastoDepreciacion.cuentacontagastodepreBeanSwingJInternalFrame.dispose();
			this.jInternalFrameDetalleFormGastoDepreciacion.cuentacontagastodepreBeanSwingJInternalFrame=null;
		}

		if(this.jInternalFrameDetalleFormGastoDepreciacion.cuentacontagastodepreBeanSwingJInternalFramePopup!=null) {
			this.jInternalFrameDetalleFormGastoDepreciacion.cuentacontagastodepreBeanSwingJInternalFramePopup.setVisible(false);
			this.jInternalFrameDetalleFormGastoDepreciacion.cuentacontagastodepreBeanSwingJInternalFramePopup.dispose();
			this.jInternalFrameDetalleFormGastoDepreciacion.cuentacontagastodepreBeanSwingJInternalFramePopup=null;
		}	
		
		
		}
		
		if(this.jInternalFrameDetalleFormGastoDepreciacion!=null) {
			this.jInternalFrameDetalleFormGastoDepreciacion.setVisible(false);	    			
			this.jInternalFrameDetalleFormGastoDepreciacion.dispose();
			this.jInternalFrameDetalleFormGastoDepreciacion=null;
		}
		
		
		if(this.jInternalFrameReporteDinamicoGastoDepreciacion!=null) {
			this.jInternalFrameReporteDinamicoGastoDepreciacion.setVisible(false);	    			
			this.jInternalFrameReporteDinamicoGastoDepreciacion.dispose();
			this.jInternalFrameReporteDinamicoGastoDepreciacion=null;
		}
		
		if(this.jInternalFrameImportacionGastoDepreciacion!=null) {
			this.jInternalFrameImportacionGastoDepreciacion.setVisible(false);	    			
			this.jInternalFrameImportacionGastoDepreciacion.dispose();
			this.jInternalFrameImportacionGastoDepreciacion=null;
		}		
		
		
		this.setVisible(false);
		this.dispose();
		//this=null;
	}
	
	
	
	public void jButtonActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {			
			this.startProcessGastoDepreciacion();
			
			GastoDepreciacionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.gastodepreciacion,new Object(),this.gastodepreciacionParameterGeneral,this.gastodepreciacionReturnGeneral);
			
			
			if(sTipo.equals("NuevoGastoDepreciacion")) {
				jButtonNuevoGastoDepreciacionActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarGastoDepreciacion")) {
				jButtonDuplicarGastoDepreciacionActionPerformed(evt,false);
			} else if(sTipo.equals("CopiarGastoDepreciacion")) {
				jButtonCopiarGastoDepreciacionActionPerformed(evt);
			} else if(sTipo.equals("VerFormGastoDepreciacion")) {
				jButtonVerFormGastoDepreciacionActionPerformed(evt);
			} else if(sTipo.equals("NuevoToolBarGastoDepreciacion")) {
				jButtonNuevoGastoDepreciacionActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarToolBarGastoDepreciacion")) {
				jButtonDuplicarGastoDepreciacionActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemNuevoGastoDepreciacion")) {
				jButtonNuevoGastoDepreciacionActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemDuplicarGastoDepreciacion")) {
				jButtonDuplicarGastoDepreciacionActionPerformed(evt,false);
			} else if(sTipo.equals("NuevoRelacionesGastoDepreciacion")) {
				jButtonNuevoGastoDepreciacionActionPerformed(evt,true);
			} else if(sTipo.equals("NuevoRelacionesToolBarGastoDepreciacion")) {
				jButtonNuevoGastoDepreciacionActionPerformed(evt,true);
			} else if(sTipo.equals("MenuItemNuevoRelacionesGastoDepreciacion")) {
				jButtonNuevoGastoDepreciacionActionPerformed(evt,true);
			} else if(sTipo.equals("ModificarGastoDepreciacion")) {
				jButtonModificarGastoDepreciacionActionPerformed(evt);
			} else if(sTipo.equals("ModificarToolBarGastoDepreciacion")) {
				jButtonModificarGastoDepreciacionActionPerformed(evt);
			} else if(sTipo.equals("MenuItemModificarGastoDepreciacion")) {
				jButtonModificarGastoDepreciacionActionPerformed(evt);
			} else if(sTipo.equals("ActualizarGastoDepreciacion")) {
				jButtonActualizarGastoDepreciacionActionPerformed(evt);
			} else if(sTipo.equals("ActualizarToolBarGastoDepreciacion")) {
				jButtonActualizarGastoDepreciacionActionPerformed(evt);
			} else if(sTipo.equals("MenuItemActualizarGastoDepreciacion")) {
				jButtonActualizarGastoDepreciacionActionPerformed(evt);
			} else if(sTipo.equals("EliminarGastoDepreciacion")) {
				jButtonEliminarGastoDepreciacionActionPerformed(evt);
			} else if(sTipo.equals("EliminarToolBarGastoDepreciacion")) {
				jButtonEliminarGastoDepreciacionActionPerformed(evt);
			} else if(sTipo.equals("MenuItemEliminarGastoDepreciacion")) {
				jButtonEliminarGastoDepreciacionActionPerformed(evt);
			} else if(sTipo.equals("CancelarGastoDepreciacion")) {
				jButtonCancelarGastoDepreciacionActionPerformed(evt);
			} else if(sTipo.equals("CancelarToolBarGastoDepreciacion")) {
				jButtonCancelarGastoDepreciacionActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCancelarGastoDepreciacion")) {
				jButtonCancelarGastoDepreciacionActionPerformed(evt);
			} else if(sTipo.equals("CerrarGastoDepreciacion")) {
				jButtonCerrarGastoDepreciacionActionPerformed(evt);
			} else if(sTipo.equals("CerrarToolBarGastoDepreciacion")) {
				jButtonCerrarGastoDepreciacionActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCerrarGastoDepreciacion")) {
				jButtonCerrarGastoDepreciacionActionPerformed(evt);
			} else if(sTipo.equals("MostrarOcultarToolBarGastoDepreciacion")) {
				jButtonMostrarOcultarGastoDepreciacionActionPerformed(evt);
			} else if(sTipo.equals("MenuItemDetalleCerrarGastoDepreciacion")) {
				jButtonCancelarGastoDepreciacionActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosGastoDepreciacion")) {
				jButtonGuardarCambiosGastoDepreciacionActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosToolBarGastoDepreciacion")) {
				jButtonGuardarCambiosGastoDepreciacionActionPerformed(evt);
			} else if(sTipo.equals("CopiarToolBarGastoDepreciacion")) {
				jButtonCopiarGastoDepreciacionActionPerformed(evt);
			} else if(sTipo.equals("VerFormToolBarGastoDepreciacion")) {
				jButtonVerFormGastoDepreciacionActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosGastoDepreciacion")) {
				jButtonGuardarCambiosGastoDepreciacionActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCopiarGastoDepreciacion")) {
				jButtonCopiarGastoDepreciacionActionPerformed(evt);
			} else if(sTipo.equals("MenuItemVerFormGastoDepreciacion")) {
				jButtonVerFormGastoDepreciacionActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaGastoDepreciacion")) {
				jButtonGuardarCambiosGastoDepreciacionActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaToolBarGastoDepreciacion")) {
				jButtonGuardarCambiosGastoDepreciacionActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosTablaGastoDepreciacion")) {
				jButtonGuardarCambiosGastoDepreciacionActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionGastoDepreciacion")) {
				jButtonRecargarInformacionGastoDepreciacionActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionToolBarGastoDepreciacion")) {
				jButtonRecargarInformacionGastoDepreciacionActionPerformed(evt);
			} else if(sTipo.equals("MenuItemRecargarInformacionGastoDepreciacion")) {
				jButtonRecargarInformacionGastoDepreciacionActionPerformed(evt);
			}
			else if(sTipo.equals("AnterioresGastoDepreciacion")) {
				jButtonAnterioresGastoDepreciacionActionPerformed(evt);
			} else if(sTipo.equals("AnterioresToolBarGastoDepreciacion")) {
				jButtonAnterioresGastoDepreciacionActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAnterioreGastoDepreciacion")) {
				jButtonAnterioresGastoDepreciacionActionPerformed(evt);
			} else if(sTipo.equals("SiguientesGastoDepreciacion")) {
				jButtonSiguientesGastoDepreciacionActionPerformed(evt);
			} else if(sTipo.equals("SiguientesToolBarGastoDepreciacion")) {
				jButtonSiguientesGastoDepreciacionActionPerformed(evt);
			} else if(sTipo.equals("MenuItemSiguientesGastoDepreciacion")) {
				jButtonSiguientesGastoDepreciacionActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAbrirOrderByGastoDepreciacion") || sTipo.equals("MenuItemDetalleAbrirOrderByGastoDepreciacion")) {
				jButtonAbrirOrderByGastoDepreciacionActionPerformed(evt);
			} else if(sTipo.equals("MenuItemMostrarOcultarGastoDepreciacion") || sTipo.equals("MenuItemDetalleMostrarOcultarGastoDepreciacion")) {
				jButtonMostrarOcultarGastoDepreciacionActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosGastoDepreciacion")) {
				jButtonNuevoGuardarCambiosGastoDepreciacionActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosToolBarGastoDepreciacion")) {
				jButtonNuevoGuardarCambiosGastoDepreciacionActionPerformed(evt);
			} else if(sTipo.equals("MenuItemNuevoGuardarCambiosGastoDepreciacion")) {
				jButtonNuevoGuardarCambiosGastoDepreciacionActionPerformed(evt);
			} 
			else if(sTipo.equals("CerrarReporteDinamicoGastoDepreciacion")) {
				jButtonCerrarReporteDinamicoGastoDepreciacionActionPerformed(evt);
			} else if(sTipo.equals("GenerarReporteDinamicoGastoDepreciacion")) {
				jButtonGenerarReporteDinamicoGastoDepreciacionActionPerformed(evt);
			} else if(sTipo.equals("GenerarExcelReporteDinamicoGastoDepreciacion")) {
				
				jButtonGenerarExcelReporteDinamicoGastoDepreciacionActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarImportacionGastoDepreciacion")) {
				jButtonCerrarImportacionGastoDepreciacionActionPerformed(evt);
			} else if(sTipo.equals("GenerarImportacionGastoDepreciacion")) {
				
				jButtonGenerarImportacionGastoDepreciacionActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirImportacionGastoDepreciacion")) {
				
				jButtonAbrirImportacionGastoDepreciacionActionPerformed(evt);
				
			} else if(sTipo.equals("TiposAccionesGastoDepreciacion")) {
				jComboBoxTiposAccionesGastoDepreciacionActionListener(evt,false);
			} else if(sTipo.equals("TiposRelacionesGastoDepreciacion")) {
				jComboBoxTiposRelacionesGastoDepreciacionActionListener(evt);
			} else if(sTipo.equals("TiposAccionesFormularioGastoDepreciacion")) {
				jComboBoxTiposAccionesGastoDepreciacionActionListener(evt,true);
			} else if(sTipo.equals("TiposSeleccionarGastoDepreciacion")) {
				
				jComboBoxTiposSeleccionarGastoDepreciacionActionListener(evt);
				
			} else if(sTipo.equals("ValorCampoGeneralGastoDepreciacion")) {
				jTextFieldValorCampoGeneralGastoDepreciacionActionListener(evt);
			}
			
			
			else if(sTipo.equals("AbrirOrderByGastoDepreciacion")) {
				jButtonAbrirOrderByGastoDepreciacionActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirOrderByToolBarGastoDepreciacion")) {
				jButtonAbrirOrderByGastoDepreciacionActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarOrderByGastoDepreciacion")) {
				jButtonCerrarOrderByGastoDepreciacionActionPerformed(evt);
			} 
						
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idGastoDepreciacionBusqueda")) {
				this.jButtonidGastoDepreciacionBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_empresaGastoDepreciacionUpdate")) {
				this.jButtonid_empresaGastoDepreciacionUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_empresaGastoDepreciacionBusqueda")) {
				this.jButtonid_empresaGastoDepreciacionBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_detalle_grupo_activo_fijoGastoDepreciacionUpdate")) {
				this.jButtonid_detalle_grupo_activo_fijoGastoDepreciacionUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_detalle_grupo_activo_fijoGastoDepreciacionBusqueda")) {
				this.jButtonid_detalle_grupo_activo_fijoGastoDepreciacionBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("anioGastoDepreciacionBusqueda")) {
				this.jButtonanioGastoDepreciacionBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("valorGastoDepreciacionBusqueda")) {
				this.jButtonvalorGastoDepreciacionBusquedaActionPerformed(evt);
			}
			
			
			
			
			else if(sTipo.equals("FK_IdDetalleGrupoActivoFijoGastoDepreciacion")) {
				this.jButtonFK_IdDetalleGrupoActivoFijoGastoDepreciacionActionPerformed(evt);
			}
			
			;
			
			
			GastoDepreciacionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.gastodepreciacion,new Object(),this.gastodepreciacionParameterGeneral,this.gastodepreciacionReturnGeneral);
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,GastoDepreciacionConstantesFunciones.CLASSNAME);
			
  		} finally {
      		this.finishProcessGastoDepreciacion();
      	}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaGastoDepreciacionActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.gastodepreciacion);
				
				this.actualizarInformacion("INFO_PADRE",false,this.gastodepreciacion);
				
				GastoDepreciacionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.gastodepreciacion,new Object(),this.gastodepreciacionParameterGeneral,this.gastodepreciacionReturnGeneral);
				
				


				
				GastoDepreciacionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.gastodepreciacion,new Object(),this.gastodepreciacionParameterGeneral,this.gastodepreciacionReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(GastoDepreciacion.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",GastoDepreciacion.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
				}
				
			} catch(Exception e) {
  				FuncionesSwing.manageException2(this, e,logger,GastoDepreciacionConstantesFunciones.CLASSNAME);
  			}
    }
	
	public Boolean existeCambioValor(ControlTipo controlTipo,String sTipo) throws Exception {
		Boolean existeCambio=true;
		
		try {
			GastoDepreciacion gastodepreciacionLocal=null;
			
			if(!this.getEsControlTabla()) {
				gastodepreciacionLocal=this.gastodepreciacion;
			} else {
				gastodepreciacionLocal=this.gastodepreciacionAnterior;
			}
			
			if(controlTipo.equals(ControlTipo.TEXTBOX)) {
				


			}
		
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,GastoDepreciacionConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.gastodepreciacion);
				
				this.actualizarInformacion("INFO_PADRE",false,this.gastodepreciacion);
				
				GastoDepreciacionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.gastodepreciacion,new Object(),this.gastodepreciacionParameterGeneral,this.gastodepreciacionReturnGeneral);
							
				
				


				
				GastoDepreciacionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.gastodepreciacion,new Object(),this.gastodepreciacionParameterGeneral,this.gastodepreciacionReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(GastoDepreciacion.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",GastoDepreciacion.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,GastoDepreciacionConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaGastoDepreciacionActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosGastoDepreciacion.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.gastodepreciacionAnterior =(GastoDepreciacion) this.gastodepreciacionLogic.getGastoDepreciacions().toArray()[this.jTableDatosGastoDepreciacion.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.gastodepreciacionAnterior =(GastoDepreciacion) this.gastodepreciacions.toArray()[this.jTableDatosGastoDepreciacion.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,GastoDepreciacionConstantesFunciones.CLASSNAME);
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
			
			GastoDepreciacionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.gastodepreciacion,new Object(),this.gastodepreciacionParameterGeneral,this.gastodepreciacionReturnGeneral);
			
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
			
			


			
			GastoDepreciacionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.gastodepreciacion,new Object(),this.gastodepreciacionParameterGeneral,this.gastodepreciacionReturnGeneral);
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,GastoDepreciacionConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE QUITA ALGUN CARACTER
	public void jTextFieldRemoveUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,GastoDepreciacionConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE INGRESA ALGUN CARACTER
	public void jTextFieldInsertUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,GastoDepreciacionConstantesFunciones.CLASSNAME);
  		}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jFormattedTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaGastoDepreciacionActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.gastodepreciacion);
				
				this.actualizarInformacion("INFO_PADRE",false,this.gastodepreciacion);
				
				GastoDepreciacionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.gastodepreciacion,new Object(),this.gastodepreciacionParameterGeneral,this.gastodepreciacionReturnGeneral);
								
						
				


				
				GastoDepreciacionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.gastodepreciacion,new Object(),this.gastodepreciacionParameterGeneral,this.gastodepreciacionReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(GastoDepreciacion.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",GastoDepreciacion.class.getName(),sTipo,"DATE",esControlTabla,conIrServidorAplicacionParent,
							id,JFormattedTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,GastoDepreciacionConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.gastodepreciacion);
				
				this.actualizarInformacion("INFO_PADRE",false,this.gastodepreciacion);
				
				GastoDepreciacionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.gastodepreciacion,new Object(),this.gastodepreciacionParameterGeneral,this.gastodepreciacionReturnGeneral);
								
				
				


				
				GastoDepreciacionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.gastodepreciacion,new Object(),this.gastodepreciacionParameterGeneral,this.gastodepreciacionReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(GastoDepreciacion.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",GastoDepreciacion.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,GastoDepreciacionConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jFormattedTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaGastoDepreciacionActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosGastoDepreciacion.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.gastodepreciacionAnterior =(GastoDepreciacion) this.gastodepreciacionLogic.getGastoDepreciacions().toArray()[this.jTableDatosGastoDepreciacion.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.gastodepreciacionAnterior =(GastoDepreciacion) this.gastodepreciacions.toArray()[this.jTableDatosGastoDepreciacion.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,GastoDepreciacionConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusLostGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl() && this.existeCambioValor(ControlTipo.DATE,sTipo)) {
				this.actualizarInformacion("EVENTO_CONTROL",false,this.gastodepreciacion);
				
				this.actualizarInformacion("INFO_PADRE",false,this.gastodepreciacion);
			}	
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,GastoDepreciacionConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaGastoDepreciacionActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosGastoDepreciacion.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.gastodepreciacionAnterior =(GastoDepreciacion) this.gastodepreciacionLogic.getGastoDepreciacions().toArray()[this.jTableDatosGastoDepreciacion.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.gastodepreciacionAnterior =(GastoDepreciacion) this.gastodepreciacions.toArray()[this.jTableDatosGastoDepreciacion.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,GastoDepreciacionConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaGastoDepreciacionActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.gastodepreciacion);
			
			this.actualizarInformacion("INFO_PADRE",false,this.gastodepreciacion);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,GastoDepreciacionConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.gastodepreciacion);
				
				this.actualizarInformacion("INFO_PADRE",false,this.gastodepreciacion);
				
				GastoDepreciacionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.gastodepreciacion,new Object(),this.gastodepreciacionParameterGeneral,this.gastodepreciacionReturnGeneral);
							
				
				


				
				GastoDepreciacionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.gastodepreciacion,new Object(),this.gastodepreciacionParameterGeneral,this.gastodepreciacionReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(GastoDepreciacion.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",GastoDepreciacion.class.getName(),sTipo,"TEXTAREA",esControlTabla,conIrServidorAplicacionParent,
							id,jTextArea, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,GastoDepreciacionConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaGastoDepreciacionActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosGastoDepreciacion.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.gastodepreciacionAnterior =(GastoDepreciacion) this.gastodepreciacionLogic.getGastoDepreciacions().toArray()[this.jTableDatosGastoDepreciacion.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.gastodepreciacionAnterior =(GastoDepreciacion) this.gastodepreciacions.toArray()[this.jTableDatosGastoDepreciacion.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,GastoDepreciacionConstantesFunciones.CLASSNAME);
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
			
			GastoDepreciacionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.gastodepreciacion,new Object(),this.gastodepreciacionParameterGeneral,this.gastodepreciacionReturnGeneral);
			
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
			
			


			
			GastoDepreciacionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.gastodepreciacion,new Object(),this.gastodepreciacionParameterGeneral,this.gastodepreciacionReturnGeneral);
			
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,GastoDepreciacionConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaRemoveUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,GastoDepreciacionConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaInsertUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,GastoDepreciacionConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jTextAreaActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaGastoDepreciacionActual();
			
			this.actualizarInformacion("EVENTO_CONTROL",false,this.gastodepreciacion);
			
			this.actualizarInformacion("INFO_PADRE",false,this.gastodepreciacion);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,GastoDepreciacionConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.gastodepreciacion);
				
				this.actualizarInformacion("INFO_PADRE",false,this.gastodepreciacion);
				
				GastoDepreciacionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.gastodepreciacion,new Object(),this.gastodepreciacionParameterGeneral,this.gastodepreciacionReturnGeneral);
								
				
				


				
				GastoDepreciacionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.gastodepreciacion,new Object(),this.gastodepreciacionParameterGeneral,this.gastodepreciacionReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(GastoDepreciacion.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",GastoDepreciacion.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jLabel, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,GastoDepreciacionConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jLabelFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaGastoDepreciacionActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosGastoDepreciacion.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.gastodepreciacionAnterior =(GastoDepreciacion) this.gastodepreciacionLogic.getGastoDepreciacions().toArray()[this.jTableDatosGastoDepreciacion.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.gastodepreciacionAnterior =(GastoDepreciacion) this.gastodepreciacions.toArray()[this.jTableDatosGastoDepreciacion.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,GastoDepreciacionConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jLabelActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaGastoDepreciacionActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.gastodepreciacion);
			
			this.actualizarInformacion("INFO_PADRE",false,this.gastodepreciacion);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,GastoDepreciacionConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxItemListenerGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaGastoDepreciacionActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.gastodepreciacion);
				
				this.actualizarInformacion("INFO_PADRE",false,this.gastodepreciacion);
				
				GastoDepreciacionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.gastodepreciacion,new Object(),this.gastodepreciacionParameterGeneral,this.gastodepreciacionReturnGeneral);
												
				
				if(sTipo.equals("SeleccionarTodosGastoDepreciacion")) {
					jCheckBoxSeleccionarTodosGastoDepreciacionItemListener(evt);
				
				} else if(sTipo.equals("SeleccionadosGastoDepreciacion")) {
					jCheckBoxSeleccionadosGastoDepreciacionItemListener(evt);
				
				} else if(sTipo.equals("NuevoToolBarGastoDepreciacion")) {
					
				}
				
				


				
				
				GastoDepreciacionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.gastodepreciacion,new Object(),this.gastodepreciacionParameterGeneral,this.gastodepreciacionReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(GastoDepreciacion.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",GastoDepreciacion.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,GastoDepreciacionConstantesFunciones.CLASSNAME);
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
				
				//this.actualizarInformacion("EVENTO_CONTROL",false,this.gastodepreciacion);
				
				//this.actualizarInformacion("INFO_PADRE",false,this.gastodepreciacion);
				
				GastoDepreciacionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.gastodepreciacion,new Object(),this.gastodepreciacionParameterGeneral,this.gastodepreciacionReturnGeneral);
												
				
				


				
				
				GastoDepreciacionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.gastodepreciacion,new Object(),this.gastodepreciacionParameterGeneral,this.gastodepreciacionReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(GastoDepreciacion.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",GastoDepreciacion.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,GastoDepreciacionConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaGastoDepreciacionActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosGastoDepreciacion.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.gastodepreciacionAnterior =(GastoDepreciacion) this.gastodepreciacionLogic.getGastoDepreciacions().toArray()[this.jTableDatosGastoDepreciacion.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.gastodepreciacionAnterior =(GastoDepreciacion) this.gastodepreciacions.toArray()[this.jTableDatosGastoDepreciacion.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,GastoDepreciacionConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaGastoDepreciacionActual();
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.gastodepreciacion);
				
				this.actualizarInformacion("INFO_PADRE",false,this.gastodepreciacion);
				
				GastoDepreciacionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.gastodepreciacion,new Object(),this.gastodepreciacionParameterGeneral,this.gastodepreciacionReturnGeneral);
				
				
				GastoDepreciacionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.gastodepreciacion,new Object(),this.gastodepreciacionParameterGeneral,this.gastodepreciacionReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,GastoDepreciacionConstantesFunciones.CLASSNAME);
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
			
			GastoDepreciacionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.gastodepreciacion,new Object(),this.gastodepreciacionParameterGeneral,this.gastodepreciacionReturnGeneral);
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
			
			


			
			GastoDepreciacionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.gastodepreciacion,new Object(),this.gastodepreciacionParameterGeneral,this.gastodepreciacionReturnGeneral);
			*/						
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,GastoDepreciacionConstantesFunciones.CLASSNAME);
  		}		
    }
	
	@SuppressWarnings("rawtypes")
	public void jComboBoxItemStateChangedGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if (evt.getStateChange() == ItemEvent.SELECTED && this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaGastoDepreciacionActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.gastodepreciacion);
				
				this.actualizarInformacion("INFO_PADRE",false,this.gastodepreciacion);
				
				GastoDepreciacionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.gastodepreciacion,new Object(),this.gastodepreciacionParameterGeneral,this.gastodepreciacionReturnGeneral);
				
				
				String sFinalQueryCombo="";
				
				


				
				GastoDepreciacionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.gastodepreciacion,new Object(),this.gastodepreciacionParameterGeneral,this.gastodepreciacionReturnGeneral);
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(GastoDepreciacion.class.getName());
								
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",GastoDepreciacion.class.getName(),sTipo,"COMBOBOX",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,GastoDepreciacionConstantesFunciones.CLASSNAME);
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
			
				this.actualizarInformacion("EVENTO_CONTROL",false,this.gastodepreciacion);
				
				this.actualizarInformacion("INFO_PADRE",false,this.gastodepreciacion);
				
				GastoDepreciacionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.gastodepreciacion,new Object(),this.gastodepreciacionParameterGeneral,this.gastodepreciacionReturnGeneral);
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
				
				


				
				GastoDepreciacionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.gastodepreciacion,new Object(),this.gastodepreciacionParameterGeneral,this.gastodepreciacionReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(GastoDepreciacion.class.getName());
				
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",GastoDepreciacion.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,GastoDepreciacionConstantesFunciones.CLASSNAME);
  		}
		
		*/
    }
	
	public void jComboBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaGastoDepreciacionActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosGastoDepreciacion.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.gastodepreciacionAnterior =(GastoDepreciacion) this.gastodepreciacionLogic.getGastoDepreciacions().toArray()[this.jTableDatosGastoDepreciacion.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.gastodepreciacionAnterior =(GastoDepreciacion) this.gastodepreciacions.toArray()[this.jTableDatosGastoDepreciacion.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,GastoDepreciacionConstantesFunciones.CLASSNAME);
  		}
    }		
	
	public void tableValueChangedGeneral(String sTipo,ListSelectionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				GastoDepreciacionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.gastodepreciacion,new Object(),this.gastodepreciacionParameterGeneral,this.gastodepreciacionReturnGeneral);
				
				if(sTipo.equals("TableDatosSeleccionarGastoDepreciacion")) {
					//BYDAN_DESHABILITADO
					//try {jTableDatosGastoDepreciacionListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
					
					//SOLO CUANDO MOUSE ES SOLTADO
					if (!evt.getValueIsAdjusting()) {
						//SELECCIONA FILA A OBJETO ACTUAL
						Integer intSelectedRow = this.jTableDatosGastoDepreciacion.getSelectedRow();
						
						if(intSelectedRow!=null && intSelectedRow>-1) {
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								this.gastodepreciacion =(GastoDepreciacion) this.gastodepreciacionLogic.getGastoDepreciacions().toArray()[this.jTableDatosGastoDepreciacion.convertRowIndexToModel(intSelectedRow)];
							} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
								this.gastodepreciacion =(GastoDepreciacion) this.gastodepreciacions.toArray()[this.jTableDatosGastoDepreciacion.convertRowIndexToModel(intSelectedRow)];
							}
							//ARCHITECTURE
							
							//System.out.println(this.gastodepreciacion);
						}
					}
					
				} else if(sTipo.equals("jButtonCancelarGastoDepreciacion")) {
				
				}
				
				GastoDepreciacionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.gastodepreciacion,new Object(),this.gastodepreciacionParameterGeneral,this.gastodepreciacionReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,GastoDepreciacionConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void tableMouseAdapterGeneral(String sTipo,MouseEvent evt) { 	  
		try {
			GastoDepreciacionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.gastodepreciacion,new Object(),this.gastodepreciacionParameterGeneral,this.gastodepreciacionReturnGeneral);
			
			if(sTipo.equals("DatosSeleccionarGastoDepreciacion")) {
				if (evt.getClickCount() == 2) {
					jButtonIdActionPerformed(null,jTableDatosGastoDepreciacion.getSelectedRow(),false,false);
				}	
			} else if(sTipo.equals("jButtonCancelarGastoDepreciacion")) {
			
			}
			
			GastoDepreciacionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.gastodepreciacion,new Object(),this.gastodepreciacionParameterGeneral,this.gastodepreciacionReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,GastoDepreciacionConstantesFunciones.CLASSNAME);
  		}
    }
	
	;
	
	public void jButtonActionPerformedTecladoGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			this.startProcessGastoDepreciacion();
			
			GastoDepreciacionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.gastodepreciacion,new Object(),this.gastodepreciacionParameterGeneral,this.gastodepreciacionReturnGeneral);
			
			if(sTipo.equals("NuevoGastoDepreciacion")) {
				jButtonNuevoGastoDepreciacionActionPerformed(evt,false);
				
			} else if(sTipo.equals("DuplicarGastoDepreciacion")) {
				jButtonDuplicarGastoDepreciacionActionPerformed(evt,false);
				
			} else if(sTipo.equals("CopiarGastoDepreciacion")) {
				jButtonCopiarGastoDepreciacionActionPerformed(evt);
				
			} else if(sTipo.equals("VerFormGastoDepreciacion")) {
				jButtonVerFormGastoDepreciacionActionPerformed(evt);
				
			} else if(sTipo.equals("NuevoRelacionesGastoDepreciacion")) {
				jButtonNuevoGastoDepreciacionActionPerformed(evt,true);
				
			} else if(sTipo.equals("ModificarGastoDepreciacion")) {
				jButtonModificarGastoDepreciacionActionPerformed(evt);
				
			} else if(sTipo.equals("ActualizarGastoDepreciacion")) {
				jButtonActualizarGastoDepreciacionActionPerformed(evt);
				
			} else if(sTipo.equals("EliminarGastoDepreciacion")) {
				jButtonEliminarGastoDepreciacionActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosTablaGastoDepreciacion")) {
				jButtonGuardarCambiosGastoDepreciacionActionPerformed(evt);
				
			} else if(sTipo.equals("CancelarGastoDepreciacion")) {
				jButtonCancelarGastoDepreciacionActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarGastoDepreciacion")) {
				jButtonCerrarGastoDepreciacionActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosGastoDepreciacion")) {
				jButtonGuardarCambiosGastoDepreciacionActionPerformed(evt);
			
			} else if(sTipo.equals("NuevoGuardarCambiosGastoDepreciacion")) {
				jButtonNuevoGuardarCambiosGastoDepreciacionActionPerformed(evt);
			
			} else if(sTipo.equals("AbrirOrderByGastoDepreciacion")) {
				jButtonAbrirOrderByGastoDepreciacionActionPerformed(evt);
			
			} else if(sTipo.equals("RecargarInformacionGastoDepreciacion")) {
				jButtonRecargarInformacionGastoDepreciacionActionPerformed(evt);
			
			} else if(sTipo.equals("AnterioresGastoDepreciacion")) {
				jButtonAnterioresGastoDepreciacionActionPerformed(evt);			
			
			}  else if(sTipo.equals("SiguientesGastoDepreciacion")) {
				jButtonSiguientesGastoDepreciacionActionPerformed(evt);			
			} 
			
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idGastoDepreciacionBusqueda")) {
				this.jButtonidGastoDepreciacionBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_empresaGastoDepreciacionUpdate")) {
				this.jButtonid_empresaGastoDepreciacionUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_empresaGastoDepreciacionBusqueda")) {
				this.jButtonid_empresaGastoDepreciacionBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_detalle_grupo_activo_fijoGastoDepreciacionUpdate")) {
				this.jButtonid_detalle_grupo_activo_fijoGastoDepreciacionUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_detalle_grupo_activo_fijoGastoDepreciacionBusqueda")) {
				this.jButtonid_detalle_grupo_activo_fijoGastoDepreciacionBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("anioGastoDepreciacionBusqueda")) {
				this.jButtonanioGastoDepreciacionBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("valorGastoDepreciacionBusqueda")) {
				this.jButtonvalorGastoDepreciacionBusquedaActionPerformed(evt);
			}
			
			GastoDepreciacionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.gastodepreciacion,new Object(),this.gastodepreciacionParameterGeneral,this.gastodepreciacionReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,GastoDepreciacionConstantesFunciones.CLASSNAME);
			
  		}  finally {
      		this.finishProcessGastoDepreciacion();
      	}
    }
	
	public void internalFrameClosingInternalFrameGeneral(String sTipo,InternalFrameEvent evt) { 	  
		try {
			GastoDepreciacionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.gastodepreciacion,new Object(),this.gastodepreciacionParameterGeneral,this.gastodepreciacionReturnGeneral);
			
			if(sTipo.equals("CloseInternalFrameGastoDepreciacion")) {
				closingInternalFrameGastoDepreciacion();
				
			} else if(sTipo.equals("jButtonCancelarGastoDepreciacion")) {
				JInternalFrameBase jInternalFrameDetalleFormGastoDepreciacion = (JInternalFrameBase)evt.getSource();
	            	
	            GastoDepreciacionBeanSwingJInternalFrame jInternalFrameParent=(GastoDepreciacionBeanSwingJInternalFrame)jInternalFrameDetalleFormGastoDepreciacion.getjInternalFrameParent();
	            
				jInternalFrameParent.jButtonCancelarGastoDepreciacionActionPerformed(null);
			}
			
			GastoDepreciacionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.gastodepreciacion,new Object(),this.gastodepreciacionParameterGeneral,this.gastodepreciacionReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,GastoDepreciacionConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void recargarFormGastoDepreciacion(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion) throws Exception {
		this.recargarFormGastoDepreciacion(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,false);
	}
	
	public void recargarFormGastoDepreciacion(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion,Boolean esControlTabla) throws Exception {
		if(this.permiteRecargarForm && this.permiteMantenimiento(this.gastodepreciacion)) {
			if(!esControlTabla) {
				if(GastoDepreciacionJInternalFrame.ISBINDING_MANUAL_TABLA) {			
					this.setVariablesFormularioToObjetoActualGastoDepreciacion(this.gastodepreciacion,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysGastoDepreciacion(this.gastodepreciacion);			
				}
				
				if(this.gastodepreciacionSessionBean.getEstaModoGuardarRelaciones()) {
					this.setVariablesFormularioRelacionesToObjetoActualGastoDepreciacion(this.gastodepreciacion,classes);				
				}
			
				if(conIrServidorAplicacion) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {						
						this.gastodepreciacionReturnGeneral=gastodepreciacionLogic.procesarEventosGastoDepreciacionsWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.gastodepreciacionLogic.getGastoDepreciacions(),this.gastodepreciacion,this.gastodepreciacionParameterGeneral,this.isEsNuevoGastoDepreciacion,classes);//this.gastodepreciacionLogic.getGastoDepreciacion()//sTipoGeneral
									
					} else if(Constantes.ISUSAEJBREMOTE) {
									
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE
					
					//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					//this.setVariablesObjetoReturnGeneralToBeanGastoDepreciacion(this.gastodepreciacionReturnGeneral,this.gastodepreciacionBean,false);
						
					//ACTUALIZA VARIABLES RELACIONES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					if(this.gastodepreciacionSessionBean.getEstaModoGuardarRelaciones()) {
						//this.setVariablesRelacionesObjetoReturnGeneralToBeanGastoDepreciacion(classes,this.gastodepreciacionReturnGeneral,this.gastodepreciacionBean,false);
					}
						
					if(this.gastodepreciacionReturnGeneral.getConRecargarPropiedades()) {
						//INICIALIZA VARIABLES COMBOS NORMALES (FK)
						this.setVariablesObjetoActualToFormularioForeignKeyGastoDepreciacion(this.gastodepreciacionReturnGeneral.getGastoDepreciacion());
							
						//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
						this.setVariablesObjetoActualToFormularioGastoDepreciacion(this.gastodepreciacionReturnGeneral.getGastoDepreciacion());	
					}
						
					if(this.gastodepreciacionReturnGeneral.getConRecargarRelaciones()) {
						//INICIALIZA VARIABLES RELACIONES A FORMULARIO
						this.setVariablesRelacionesObjetoActualToFormularioGastoDepreciacion(this.gastodepreciacionReturnGeneral.getGastoDepreciacion(),classes);//this.gastodepreciacionBean);	
					}									
					
				} else {				
					//INICIALIZA VARIABLES RELACIONES A FORMULARIO
					this.setVariablesRelacionesObjetoActualToFormularioGastoDepreciacion(this.gastodepreciacion,classes);//this.gastodepreciacionBean);									
				}
			
				if(GastoDepreciacionJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesFormularioToObjetoActualGastoDepreciacion(this.gastodepreciacion,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysGastoDepreciacion(this.gastodepreciacion);				
				}
				
			} else {
				
				if(((controlTipo.equals(ControlTipo.TEXTBOX) || controlTipo.equals(ControlTipo.DATE)
					|| controlTipo.equals(ControlTipo.TEXTAREA) || controlTipo.equals(ControlTipo.COMBOBOX)
					)				
					&& eventoTipo.equals(EventoTipo.CHANGE)
					)
					
					|| (controlTipo.equals(ControlTipo.CHECKBOX) && eventoTipo.equals(EventoTipo.CLIC))
					
				) { // && sTipoGeneral.equals("TEXTBOX")
					
					if(this.gastodepreciacionAnterior!=null) {
						this.gastodepreciacion=this.gastodepreciacionAnterior;
					}
				}
				
				if(conIrServidorAplicacion) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {						
						this.gastodepreciacionReturnGeneral=gastodepreciacionLogic.procesarEventosGastoDepreciacionsWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.gastodepreciacionLogic.getGastoDepreciacions(),this.gastodepreciacion,this.gastodepreciacionParameterGeneral,this.isEsNuevoGastoDepreciacion,classes);//this.gastodepreciacionLogic.getGastoDepreciacion()//sTipoGeneral
									
					} else if(Constantes.ISUSAEJBREMOTE) {
									
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.gastodepreciacionSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.gastodepreciacionSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(this.gastodepreciacionReturnGeneral.getGastoDepreciacion(),gastodepreciacionLogic.getGastoDepreciacions());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(this.gastodepreciacionReturnGeneral.getGastoDepreciacion(),this.gastodepreciacions);
				}
				//ARCHITECTURE
				
				//this.jTableDatosGastoDepreciacion.repaint();
				
				//((AbstractTableModel) this.jTableDatosGastoDepreciacion.getModel()).fireTableDataChanged();
				
				this.actualizarVisualTableDatosGastoDepreciacion();
			}
		}
	}
	
	public void actualizarVisualTableDatosGastoDepreciacion() throws Exception {
		
		GastoDepreciacionModel gastodepreciacionModel=(GastoDepreciacionModel)this.jTableDatosGastoDepreciacion.getModel();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			gastodepreciacionModel.gastodepreciacions=this.gastodepreciacionLogic.getGastoDepreciacions();
		
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
			gastodepreciacionModel.gastodepreciacions=this.gastodepreciacions;
		}
		
		
		((GastoDepreciacionModel) this.jTableDatosGastoDepreciacion.getModel()).fireTableDataChanged();
	}
	
	public void actualizarVisualTableDatosEventosVistaGastoDepreciacion() throws Exception {
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.actualizarLista(this.getgastodepreciacionAnterior(),this.gastodepreciacionLogic.getGastoDepreciacions());
					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			this.actualizarLista(this.getgastodepreciacionAnterior(),this.gastodepreciacions);
		}
		//ARCHITECTURE
						
		this.actualizarFilaTotales();
						
		this.actualizarVisualTableDatosGastoDepreciacion();	
	}
	
	public void setVariablesRelacionesObjetoActualToFormularioGastoDepreciacion(GastoDepreciacion gastodepreciacion,ArrayList<Classe> classes) throws Exception { 
		try {
			
			for(Classe clas:classes) {
				if(clas.clas.equals(CuentaContaGastoDepre.class)) {
					this.jInternalFrameDetalleFormGastoDepreciacion.cuentacontagastodepreBeanSwingJInternalFrame.cuentacontagastodepreLogic.setCuentaContaGastoDepres(gastodepreciacion.getCuentaContaGastoDepres());
					this.jInternalFrameDetalleFormGastoDepreciacion.cuentacontagastodepreBeanSwingJInternalFrame.inicializarActualizarBindingTablaCuentaContaGastoDepre(false);
					break;
				}
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,GastoDepreciacionConstantesFunciones.CLASSNAME);
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
										
				GastoDepreciacionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.gastodepreciacion,new Object(),generalEntityParameterGeneral,this.gastodepreciacionReturnGeneral);
				
				ArrayList<Classe> classes=new ArrayList<Classe>();
				
				for(String sClasse:arrClasses) {
					if(sClasse.equals("TODOS")) {
						conTodasRelaciones=true;
						break;
					}
				}
				
				if(this.gastodepreciacionSessionBean.getConGuardarRelaciones()) {
					if(conTodasRelaciones) {
						classes=GastoDepreciacionConstantesFunciones.getClassesRelationshipsOfGastoDepreciacion(new ArrayList<Classe>(),DeepLoadType.NONE);
					} else {
						classes=GastoDepreciacionConstantesFunciones.getClassesRelationshipsFromStringsOfGastoDepreciacion(arrClasses,DeepLoadType.NONE);
					}
				}
	
				this.classesActual=new ArrayList<Classe>();
				this.classesActual.addAll(classes);
	
				this.recargarFormGastoDepreciacion(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,esControlTabla);
										
				GastoDepreciacionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.gastodepreciacion,new Object(),generalEntityParameterGeneral,this.gastodepreciacionReturnGeneral);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,GastoDepreciacionConstantesFunciones.CLASSNAME);
  		}
    }
	
	/*
	public void setVariablesRelacionesObjetoBeanActualToFormularioGastoDepreciacion(GastoDepreciacionBean gastodepreciacionBean) throws Exception { 
		try {
			
			for(Classe clas:classes) {
				if(clas.clas.equals(CuentaContaGastoDepre.class)) {
					this.jInternalFrameDetalleFormGastoDepreciacion.cuentacontagastodepreBeanSwingJInternalFrame.cuentacontagastodepreLogic.setCuentaContaGastoDepres(gastodepreciacion.getCuentaContaGastoDepres());
					this.jInternalFrameDetalleFormGastoDepreciacion.cuentacontagastodepreBeanSwingJInternalFrame.inicializarActualizarBindingTablaCuentaContaGastoDepre(false);
					break;
				}
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,GastoDepreciacionConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesRelacionesObjetoReturnGeneralToBeanGastoDepreciacion(ArrayList<Classe> classes,GastoDepreciacionReturnGeneral gastodepreciacionReturnGeneral,GastoDepreciacionBean gastodepreciacionBean,Boolean conDefault) throws Exception {
		
			this.gastodepreciacionBean.setCuentaContaGastoDepres(gastodepreciacionReturnGeneral.getGastoDepreciacion().getCuentaContaGastoDepres());
	}
	*/
	
	public void setVariablesFormularioRelacionesToObjetoActualGastoDepreciacion(GastoDepreciacion gastodepreciacion,ArrayList<Classe> classes) throws Exception {
		
			for(Classe clas:classes) {
				if(clas.clas.equals(CuentaContaGastoDepre.class)) {
					gastodepreciacion.setCuentaContaGastoDepres(this.jInternalFrameDetalleFormGastoDepreciacion.cuentacontagastodepreBeanSwingJInternalFrame.cuentacontagastodepreLogic.getCuentaContaGastoDepres());
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
		if(!paraTabla && !this.permiteMantenimiento(this.gastodepreciacion)) {
			System.out.println("ERROR:EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES");
				
			//JOptionPane.showMessageDialog(this,"EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES","EVENTO",JOptionPane.ERROR_MESSAGE);			
		}
		*/
		
		return permite;
	}
	
	public void inicializarFormDetalle() throws Exception {
		
		this.jInternalFrameDetalleFormGastoDepreciacion = new GastoDepreciacionDetalleFormJInternalFrame(jDesktopPane,this.gastodepreciacionSessionBean.getConGuardarRelaciones(),this.gastodepreciacionSessionBean.getEsGuardarRelacionado(),this.cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		this.jDesktopPane.add(this.jInternalFrameDetalleFormGastoDepreciacion);
		this.jInternalFrameDetalleFormGastoDepreciacion.setVisible(false);
		this.jInternalFrameDetalleFormGastoDepreciacion.setSelected(false);						
		
		this.jInternalFrameDetalleFormGastoDepreciacion.setJInternalFrameParent(this);
		
		this.jInternalFrameDetalleFormGastoDepreciacion.gastodepreciacionLogic=this.gastodepreciacionLogic;
		
		this.cargarCombosFrameForeignKeyGastoDepreciacion("Formulario");
		
		this.inicializarActualizarBindingBotonesPermisosManualFormDetalleGastoDepreciacion();
		this.inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleGastoDepreciacion();
		
		this.initActionsFormDetalle();		
		
		this.initActionsCombosTodosForeignKeyGastoDepreciacion("Formulario");
		
		//TALVEZ conSetVariablesGlobales COMO if() 
		this.setVariablesGlobalesCombosForeignKeyGastoDepreciacion();
		
		this.cargarMenuRelaciones();
		
	}
	
	public void initActionsFormDetalle() {	
		
		this.jInternalFrameDetalleFormGastoDepreciacion.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarGastoDepreciacion"));
		
		this.jInternalFrameDetalleFormGastoDepreciacion.jButtonModificarGastoDepreciacion.addActionListener(new ButtonActionListener(this,"ModificarGastoDepreciacion"));

		
		this.jInternalFrameDetalleFormGastoDepreciacion.jButtonModificarToolBarGastoDepreciacion.addActionListener(new ButtonActionListener(this,"ModificarToolBarGastoDepreciacion"));
					
		this.jInternalFrameDetalleFormGastoDepreciacion.jMenuItemModificarGastoDepreciacion.addActionListener(new ButtonActionListener(this,"MenuItemModificarGastoDepreciacion"));		
		
		
		
		this.jInternalFrameDetalleFormGastoDepreciacion.jButtonActualizarGastoDepreciacion.addActionListener (new ButtonActionListener(this,"ActualizarGastoDepreciacion"));
		
		
		this.jInternalFrameDetalleFormGastoDepreciacion.jButtonActualizarToolBarGastoDepreciacion.addActionListener(new ButtonActionListener(this,"ActualizarToolBarGastoDepreciacion"));
						
		this.jInternalFrameDetalleFormGastoDepreciacion.jMenuItemActualizarGastoDepreciacion.addActionListener (new ButtonActionListener(this,"MenuItemActualizarGastoDepreciacion"));		
		
		
		
		this.jInternalFrameDetalleFormGastoDepreciacion.jButtonEliminarGastoDepreciacion.addActionListener (new ButtonActionListener(this,"EliminarGastoDepreciacion"));
		
		
		this.jInternalFrameDetalleFormGastoDepreciacion.jButtonEliminarToolBarGastoDepreciacion.addActionListener (new ButtonActionListener(this,"EliminarToolBarGastoDepreciacion"));
								
		this.jInternalFrameDetalleFormGastoDepreciacion.jMenuItemEliminarGastoDepreciacion.addActionListener (new ButtonActionListener(this,"MenuItemEliminarGastoDepreciacion"));		
		
		
		
		this.jInternalFrameDetalleFormGastoDepreciacion.jButtonCancelarGastoDepreciacion.addActionListener (new ButtonActionListener(this,"CancelarGastoDepreciacion"));
		
		
		this.jInternalFrameDetalleFormGastoDepreciacion.jButtonCancelarToolBarGastoDepreciacion.addActionListener (new ButtonActionListener(this,"CancelarToolBarGastoDepreciacion"));
					
		this.jInternalFrameDetalleFormGastoDepreciacion.jMenuItemCancelarGastoDepreciacion.addActionListener (new ButtonActionListener(this,"MenuItemCancelarGastoDepreciacion"));		
		
		
		
		
		
		this.jInternalFrameDetalleFormGastoDepreciacion.jMenuItemDetalleCerrarGastoDepreciacion.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarGastoDepreciacion"));		
		
		
		
		this.jInternalFrameDetalleFormGastoDepreciacion.jButtonGuardarCambiosToolBarGastoDepreciacion.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarGastoDepreciacion"));
		
		
		
		this.jInternalFrameDetalleFormGastoDepreciacion.jButtonGuardarCambiosToolBarGastoDepreciacion.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarGastoDepreciacion"));
		
		
		
		this.jInternalFrameDetalleFormGastoDepreciacion.jComboBoxTiposAccionesFormularioGastoDepreciacion.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioGastoDepreciacion"));
		
		
				
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormGastoDepreciacion.jButtonidGastoDepreciacionBusqueda.addActionListener(new ButtonActionListener(this,"idGastoDepreciacionBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormGastoDepreciacion.jButtonid_empresaGastoDepreciacionUpdate.addActionListener(new ButtonActionListener(this,"id_empresaGastoDepreciacionUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormGastoDepreciacion.jButtonid_empresaGastoDepreciacionBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaGastoDepreciacionBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormGastoDepreciacion.jButtonid_detalle_grupo_activo_fijoGastoDepreciacionUpdate.addActionListener(new ButtonActionListener(this,"id_detalle_grupo_activo_fijoGastoDepreciacionUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormGastoDepreciacion.jButtonid_detalle_grupo_activo_fijoGastoDepreciacionBusqueda.addActionListener(new ButtonActionListener(this,"id_detalle_grupo_activo_fijoGastoDepreciacionBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormGastoDepreciacion.jButtonanioGastoDepreciacionBusqueda.addActionListener(new ButtonActionListener(this,"anioGastoDepreciacionBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormGastoDepreciacion.jButtonvalorGastoDepreciacionBusqueda.addActionListener(new ButtonActionListener(this,"valorGastoDepreciacionBusqueda"));
		
		
		;

		//TABBED PANE RELACIONES
		this.jInternalFrameDetalleFormGastoDepreciacion.jTabbedPaneRelacionesGastoDepreciacion.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesGastoDepreciacion"));
		
		;		
		//TABBED PANE RELACIONES FIN(EXTRA TAB)	
	}
	
	public void initActions() {				
		this.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"CloseInternalFrameGastoDepreciacion"));
		
		if(this.jInternalFrameDetalleFormGastoDepreciacion!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormGastoDepreciacion.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarGastoDepreciacion"));
		}
		
		this.jTableDatosGastoDepreciacion.getSelectionModel().addListSelectionListener(new TableListSelectionListener(this,"TableDatosSeleccionarGastoDepreciacion"));
		
		this.jTableDatosGastoDepreciacion.addMouseListener(new TableMouseAdapter(this,"DatosSeleccionarGastoDepreciacion"));
		
		this.jButtonNuevoGastoDepreciacion.addActionListener(new ButtonActionListener(this,"NuevoGastoDepreciacion"));
		
		this.jButtonDuplicarGastoDepreciacion.addActionListener(new ButtonActionListener(this,"DuplicarGastoDepreciacion"));
		
		this.jButtonCopiarGastoDepreciacion.addActionListener(new ButtonActionListener(this,"CopiarGastoDepreciacion"));
		
		this.jButtonVerFormGastoDepreciacion.addActionListener(new ButtonActionListener(this,"VerFormGastoDepreciacion"));
		
		
		this.jButtonNuevoToolBarGastoDepreciacion.addActionListener(new ButtonActionListener(this,"NuevoToolBarGastoDepreciacion"));
			
		this.jButtonDuplicarToolBarGastoDepreciacion.addActionListener(new ButtonActionListener(this,"DuplicarToolBarGastoDepreciacion"));
			
		this.jMenuItemNuevoGastoDepreciacion.addActionListener (new ButtonActionListener(this,"MenuItemNuevoGastoDepreciacion"));
			
		this.jMenuItemDuplicarGastoDepreciacion.addActionListener (new ButtonActionListener(this,"MenuItemDuplicarGastoDepreciacion"));		
		
		
		this.jButtonNuevoRelacionesGastoDepreciacion.addActionListener (new ButtonActionListener(this,"NuevoRelacionesGastoDepreciacion"));
		
		
		this.jButtonNuevoRelacionesToolBarGastoDepreciacion.addActionListener(new ButtonActionListener(this,"NuevoRelacionesToolBarGastoDepreciacion"));
			
		this.jMenuItemNuevoRelacionesGastoDepreciacion.addActionListener(new ButtonActionListener(this,"MenuItemNuevoRelacionesGastoDepreciacion"));		
		
		
		if(this.jInternalFrameDetalleFormGastoDepreciacion!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormGastoDepreciacion.jButtonModificarGastoDepreciacion.addActionListener(new ButtonActionListener(this,"ModificarGastoDepreciacion"));
		}
		
		
		if(this.jInternalFrameDetalleFormGastoDepreciacion!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormGastoDepreciacion.jButtonModificarToolBarGastoDepreciacion.addActionListener(new ButtonActionListener(this,"ModificarToolBarGastoDepreciacion"));
			
			this.jInternalFrameDetalleFormGastoDepreciacion.jMenuItemModificarGastoDepreciacion.addActionListener(new ButtonActionListener(this,"MenuItemModificarGastoDepreciacion"));		
		}
		
		
		if(this.jInternalFrameDetalleFormGastoDepreciacion!=null) { //if(this.conCargarFormDetalle) {			
			this.jInternalFrameDetalleFormGastoDepreciacion.jButtonActualizarGastoDepreciacion.addActionListener (new ButtonActionListener(this,"ActualizarGastoDepreciacion"));
		}
		
		
		if(this.jInternalFrameDetalleFormGastoDepreciacion!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormGastoDepreciacion.jButtonActualizarToolBarGastoDepreciacion.addActionListener(new ButtonActionListener(this,"ActualizarToolBarGastoDepreciacion"));
				
			this.jInternalFrameDetalleFormGastoDepreciacion.jMenuItemActualizarGastoDepreciacion.addActionListener (new ButtonActionListener(this,"MenuItemActualizarGastoDepreciacion"));		
		}
		
		
		if(this.jInternalFrameDetalleFormGastoDepreciacion!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormGastoDepreciacion.jButtonEliminarGastoDepreciacion.addActionListener (new ButtonActionListener(this,"EliminarGastoDepreciacion"));
		}
		
		
		if(this.jInternalFrameDetalleFormGastoDepreciacion!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormGastoDepreciacion.jButtonEliminarToolBarGastoDepreciacion.addActionListener (new ButtonActionListener(this,"EliminarToolBarGastoDepreciacion"));
						
			this.jInternalFrameDetalleFormGastoDepreciacion.jMenuItemEliminarGastoDepreciacion.addActionListener (new ButtonActionListener(this,"MenuItemEliminarGastoDepreciacion"));		
		}
		
		
		if(this.jInternalFrameDetalleFormGastoDepreciacion!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormGastoDepreciacion.jButtonCancelarGastoDepreciacion.addActionListener (new ButtonActionListener(this,"CancelarGastoDepreciacion"));
		}
		
		
		if(this.jInternalFrameDetalleFormGastoDepreciacion!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormGastoDepreciacion.jButtonCancelarToolBarGastoDepreciacion.addActionListener (new ButtonActionListener(this,"CancelarToolBarGastoDepreciacion"));
			
			this.jInternalFrameDetalleFormGastoDepreciacion.jMenuItemCancelarGastoDepreciacion.addActionListener (new ButtonActionListener(this,"MenuItemCancelarGastoDepreciacion"));		
		}
		
		this.jButtonMostrarOcultarTablaToolBarGastoDepreciacion.addActionListener (new ButtonActionListener(this,"MostrarOcultarToolBarGastoDepreciacion"));		
		
		
		this.jButtonCerrarGastoDepreciacion.addActionListener (new ButtonActionListener(this,"CerrarGastoDepreciacion"));
		
		
		this.jButtonCerrarToolBarGastoDepreciacion.addActionListener (new ButtonActionListener(this,"CerrarToolBarGastoDepreciacion"));
			
		this.jMenuItemCerrarGastoDepreciacion.addActionListener (new ButtonActionListener(this,"MenuItemCerrarGastoDepreciacion"));
			
		if(this.jInternalFrameDetalleFormGastoDepreciacion!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormGastoDepreciacion.jMenuItemDetalleCerrarGastoDepreciacion.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarGastoDepreciacion"));		
		}
		
		
		if(this.jInternalFrameDetalleFormGastoDepreciacion!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormGastoDepreciacion.jButtonGuardarCambiosGastoDepreciacion.addActionListener (new ButtonActionListener(this,"GuardarCambiosGastoDepreciacion"));
		}
		
		
		if(this.jInternalFrameDetalleFormGastoDepreciacion!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormGastoDepreciacion.jButtonGuardarCambiosToolBarGastoDepreciacion.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarGastoDepreciacion"));
		}
		
		this.jButtonCopiarToolBarGastoDepreciacion.addActionListener (new ButtonActionListener(this,"CopiarToolBarGastoDepreciacion"));
			
		this.jButtonVerFormToolBarGastoDepreciacion.addActionListener (new ButtonActionListener(this,"VerFormToolBarGastoDepreciacion"));
		
		this.jMenuItemGuardarCambiosGastoDepreciacion.addActionListener (new ButtonActionListener(this,"MenuItemGuardarCambiosGastoDepreciacion"));
			
		this.jMenuItemCopiarGastoDepreciacion.addActionListener (new ButtonActionListener(this,"MenuItemCopiarGastoDepreciacion"));		
		
		this.jMenuItemVerFormGastoDepreciacion.addActionListener (new ButtonActionListener(this,"MenuItemVerFormGastoDepreciacion"));		
		
		
		this.jButtonGuardarCambiosTablaGastoDepreciacion.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaGastoDepreciacion"));
		
		
		this.jButtonGuardarCambiosTablaToolBarGastoDepreciacion.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaToolBarGastoDepreciacion"));
			
		this.jMenuItemGuardarCambiosTablaGastoDepreciacion.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaGastoDepreciacion"));		
		
		
		
		this.jButtonRecargarInformacionGastoDepreciacion.addActionListener (new ButtonActionListener(this,"RecargarInformacionGastoDepreciacion"));
					
		this.jButtonRecargarInformacionToolBarGastoDepreciacion.addActionListener (new ButtonActionListener(this,"RecargarInformacionToolBarGastoDepreciacion"));
		
		this.jMenuItemRecargarInformacionGastoDepreciacion.addActionListener (new ButtonActionListener(this,"MenuItemRecargarInformacionGastoDepreciacion"));		
		
		
		
		this.jButtonAnterioresGastoDepreciacion.addActionListener (new ButtonActionListener(this,"AnterioresGastoDepreciacion"));
		
		
		this.jButtonAnterioresToolBarGastoDepreciacion.addActionListener (new ButtonActionListener(this,"AnterioresToolBarGastoDepreciacion"));
		
		this.jMenuItemAnterioresGastoDepreciacion.addActionListener (new ButtonActionListener(this,"MenuItemAnterioresGastoDepreciacion"));		
		
		
		this.jButtonSiguientesGastoDepreciacion.addActionListener (new ButtonActionListener(this,"SiguientesGastoDepreciacion"));
		
		
		this.jButtonSiguientesToolBarGastoDepreciacion.addActionListener (new ButtonActionListener(this,"SiguientesToolBarGastoDepreciacion"));
			
		this.jMenuItemSiguientesGastoDepreciacion.addActionListener (new ButtonActionListener(this,"MenuItemSiguientesGastoDepreciacion"));
			
		this.jMenuItemAbrirOrderByGastoDepreciacion.addActionListener (new ButtonActionListener(this,"MenuItemAbrirOrderByGastoDepreciacion"));
			
		this.jMenuItemMostrarOcultarGastoDepreciacion.addActionListener (new ButtonActionListener(this,"MenuItemMostrarOcultarGastoDepreciacion"));
			
		this.jMenuItemDetalleAbrirOrderByGastoDepreciacion.addActionListener (new ButtonActionListener(this,"MenuItemDetalleAbrirOrderByGastoDepreciacion"));
			
		this.jMenuItemDetalleMostarOcultarGastoDepreciacion.addActionListener (new ButtonActionListener(this,"MenuItemDetalleMostrarOcultarGastoDepreciacion"));		
		
		
		this.jButtonNuevoGuardarCambiosGastoDepreciacion.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosGastoDepreciacion"));
		
		
		this.jButtonNuevoGuardarCambiosToolBarGastoDepreciacion.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosToolBarGastoDepreciacion"));
			
		this.jMenuItemNuevoGuardarCambiosGastoDepreciacion.addActionListener (new ButtonActionListener(this,"MenuItemNuevoGuardarCambiosGastoDepreciacion"));		
		
		
		
		//SELECCIONAR TODOS
		
		this.jCheckBoxSeleccionarTodosGastoDepreciacion.addItemListener(new CheckBoxItemListener(this,"SeleccionarTodosGastoDepreciacion"));

		this.jCheckBoxSeleccionadosGastoDepreciacion.addItemListener(new CheckBoxItemListener(this,"SeleccionadosGastoDepreciacion"));
		
		if(this.jInternalFrameDetalleFormGastoDepreciacion!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormGastoDepreciacion.jComboBoxTiposAccionesFormularioGastoDepreciacion.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioGastoDepreciacion"));
		}
		
		
		this.jComboBoxTiposRelacionesGastoDepreciacion.addActionListener (new ButtonActionListener(this,"TiposRelacionesGastoDepreciacion"));
			
		this.jComboBoxTiposAccionesGastoDepreciacion.addActionListener (new ButtonActionListener(this,"TiposAccionesGastoDepreciacion"));
					
		this.jComboBoxTiposSeleccionarGastoDepreciacion.addActionListener (new ButtonActionListener(this,"TiposSeleccionarGastoDepreciacion"));
			
		this.jTextFieldValorCampoGeneralGastoDepreciacion.addActionListener (new ButtonActionListener(this,"ValorCampoGeneralGastoDepreciacion"));		
		
		
		if(this.jInternalFrameDetalleFormGastoDepreciacion!=null) { //if(this.conCargarFormDetalle) {
		
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormGastoDepreciacion.jButtonidGastoDepreciacionBusqueda.addActionListener(new ButtonActionListener(this,"idGastoDepreciacionBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormGastoDepreciacion.jButtonid_empresaGastoDepreciacionUpdate.addActionListener(new ButtonActionListener(this,"id_empresaGastoDepreciacionUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormGastoDepreciacion.jButtonid_empresaGastoDepreciacionBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaGastoDepreciacionBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormGastoDepreciacion.jButtonid_detalle_grupo_activo_fijoGastoDepreciacionUpdate.addActionListener(new ButtonActionListener(this,"id_detalle_grupo_activo_fijoGastoDepreciacionUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormGastoDepreciacion.jButtonid_detalle_grupo_activo_fijoGastoDepreciacionBusqueda.addActionListener(new ButtonActionListener(this,"id_detalle_grupo_activo_fijoGastoDepreciacionBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormGastoDepreciacion.jButtonanioGastoDepreciacionBusqueda.addActionListener(new ButtonActionListener(this,"anioGastoDepreciacionBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormGastoDepreciacion.jButtonvalorGastoDepreciacionBusqueda.addActionListener(new ButtonActionListener(this,"valorGastoDepreciacionBusqueda"));
		}
		
		if(!this.conCargarMinimo) {
		//BYDAN_BUSQUEDAS
		
		
			this.jButtonFK_IdDetalleGrupoActivoFijoGastoDepreciacion.addActionListener(new ButtonActionListener(this,"FK_IdDetalleGrupoActivoFijoGastoDepreciacion"));
		
		
		
			//REPORTE DINAMICO
			
			if(this.jInternalFrameReporteDinamicoGastoDepreciacion!=null) {
				this.jInternalFrameReporteDinamicoGastoDepreciacion.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoGastoDepreciacion"));
				this.jInternalFrameReporteDinamicoGastoDepreciacion.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoGastoDepreciacion"));
				this.jInternalFrameReporteDinamicoGastoDepreciacion.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoGastoDepreciacion"));
			}
			
			//this.jButtonCerrarReporteDinamicoGastoDepreciacion.addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoGastoDepreciacion"));				
			//this.jButtonGenerarReporteDinamicoGastoDepreciacion.addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoGastoDepreciacion"));
			//this.jButtonGenerarExcelReporteDinamicoGastoDepreciacion.addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoGastoDepreciacion"));
				
				
			//IMPORTACION			
			if(this.jInternalFrameImportacionGastoDepreciacion!=null) {
				this.jInternalFrameImportacionGastoDepreciacion.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionGastoDepreciacion"));
				this.jInternalFrameImportacionGastoDepreciacion.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionGastoDepreciacion"));
				this.jInternalFrameImportacionGastoDepreciacion.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionGastoDepreciacion"));
			}
			
			//ORDER BY
			this.jButtonAbrirOrderByGastoDepreciacion.addActionListener (new ButtonActionListener(this,"AbrirOrderByGastoDepreciacion"));
			
			this.jButtonAbrirOrderByToolBarGastoDepreciacion.addActionListener (new ButtonActionListener(this,"AbrirOrderByToolBarGastoDepreciacion"));			
			
			if(this.jInternalFrameOrderByGastoDepreciacion!=null) {
				this.jInternalFrameOrderByGastoDepreciacion.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByGastoDepreciacion"));				
			}
			
			
		}
		
		
		
		if(!this.conCargarMinimo) {
			if(this.jInternalFrameDetalleFormGastoDepreciacion!=null) { //if(this.conCargarFormDetalle) {
			;
			}
		}
		
		
		//TABBED PANE RELACIONES
		if(this.jInternalFrameDetalleFormGastoDepreciacion!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormGastoDepreciacion.jTabbedPaneRelacionesGastoDepreciacion.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesGastoDepreciacion"));
		
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
            		closingInternalFrameGastoDepreciacion();
				} catch (Exception e) {
					e.printStackTrace();
				}
            }
        });
		
		this.jInternalFrameDetalleFormGastoDepreciacion.addInternalFrameListener(new javax.swing.event.InternalFrameAdapter() {
	        public void internalFrameClosing(InternalFrameEvent event) {
	            JInternalFrameBase jInternalFrameDetalleFormGastoDepreciacion = (JInternalFrameBase)event.getSource();
	            	
	            GastoDepreciacionBeanSwingJInternalFrame jInternalFrameParent=(GastoDepreciacionBeanSwingJInternalFrame)jInternalFrameDetalleFormGastoDepreciacion.getjInternalFrameParent();
	                
	            try {
					jInternalFrameParent.jButtonCancelarGastoDepreciacionActionPerformed(null);
					
					//jInternalFrameParent.dispose();
					//jInternalFrameParent=null;
					
				} catch (Exception e) {
					e.printStackTrace();
				}
	        }
	    });
			
		this.jTableDatosGastoDepreciacion.getSelectionModel().addListSelectionListener (
	                new ListSelectionListener() {
	                    public void valueChanged(ListSelectionEvent e) {
							//BYDAN_DESHABILITADO
	                    	//try {jTableDatosGastoDepreciacionListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
	                    }
	                }
	     );
		
		this.jTableDatosGastoDepreciacion.addMouseListener(new MouseAdapter() {
			   public void mouseClicked(MouseEvent evt) {
				      if (evt.getClickCount() == 2) {
				    	  jButtonIdActionPerformed(null,jTableDatosGastoDepreciacion.getSelectedRow(),false,false);
				      }
				   }
		});
		
		this.jButtonNuevoGastoDepreciacion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGastoDepreciacionActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoToolBarGastoDepreciacion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGastoDepreciacionActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoGastoDepreciacion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGastoDepreciacionActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoGastoDepreciacion";
		inputMap = this.jButtonNuevoGastoDepreciacion.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_N , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoGastoDepreciacion.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoGastoDepreciacionActionPerformed(evt,false);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonNuevoRelacionesGastoDepreciacion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGastoDepreciacionActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoRelacionesToolBarGastoDepreciacion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGastoDepreciacionActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoRelacionesGastoDepreciacion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGastoDepreciacionActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoRelacionesGastoDepreciacion";
		inputMap = this.jButtonNuevoRelacionesGastoDepreciacion.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_R , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoRelacionesGastoDepreciacion.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoGastoDepreciacionActionPerformed(evt,true);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonModificarGastoDepreciacion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarGastoDepreciacionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonModificarToolBarGastoDepreciacion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarGastoDepreciacionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemModificarGastoDepreciacion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarGastoDepreciacionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ModificarGastoDepreciacion";
		inputMap = this.jButtonModificarGastoDepreciacion.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_M , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonModificarGastoDepreciacion.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonModificarGastoDepreciacionActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonActualizarGastoDepreciacion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarGastoDepreciacionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonActualizarToolBarGastoDepreciacion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarGastoDepreciacionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemActualizarGastoDepreciacion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarGastoDepreciacionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ActualizarGastoDepreciacion";
		inputMap = this.jButtonActualizarGastoDepreciacion.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonActualizarGastoDepreciacion.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonActualizarGastoDepreciacionActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonEliminarGastoDepreciacion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarGastoDepreciacionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonEliminarToolBarGastoDepreciacion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarGastoDepreciacionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
				
		this.jMenuItemEliminarGastoDepreciacion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarGastoDepreciacionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "EliminarGastoDepreciacion";
		inputMap = this.jButtonEliminarGastoDepreciacion.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_E , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonEliminarGastoDepreciacion.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonEliminarGastoDepreciacionActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCancelarGastoDepreciacion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarGastoDepreciacionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCancelarToolBarGastoDepreciacion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarGastoDepreciacionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCancelarGastoDepreciacion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarGastoDepreciacionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CancelarGastoDepreciacion";
		inputMap = this.jButtonCancelarGastoDepreciacion.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_Q , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonCancelarGastoDepreciacion.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCancelarGastoDepreciacionActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCerrarGastoDepreciacion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarGastoDepreciacionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCerrarToolBarGastoDepreciacion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarGastoDepreciacionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCerrarGastoDepreciacion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarGastoDepreciacionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemDetalleCerrarGastoDepreciacion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  //try {jButtonCerrarGastoDepreciacionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
					try {jButtonCancelarGastoDepreciacionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CerrarGastoDepreciacion";
		inputMap = this.jButtonCerrarGastoDepreciacion.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_C , KeyEvent.ALT_MASK), sMapKey);
			
		this.jButtonCerrarGastoDepreciacion.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCerrarGastoDepreciacionActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jInternalFrameDetalleFormGastoDepreciacion.jButtonGuardarCambiosGastoDepreciacion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosGastoDepreciacionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosToolBarGastoDepreciacion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosGastoDepreciacionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosGastoDepreciacion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosGastoDepreciacionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaGastoDepreciacion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosGastoDepreciacionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaToolBarGastoDepreciacion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosGastoDepreciacionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosTablaGastoDepreciacion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosGastoDepreciacionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "GuardarCambiosGastoDepreciacion";
		inputMap = this.jInternalFrameDetalleFormGastoDepreciacion.jButtonGuardarCambiosGastoDepreciacion.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jInternalFrameDetalleFormGastoDepreciacion.jButtonGuardarCambiosGastoDepreciacion.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonGuardarCambiosGastoDepreciacionActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonRecargarInformacionGastoDepreciacion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionGastoDepreciacionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonRecargarInformacionToolBarGastoDepreciacion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionGastoDepreciacionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemRecargarInformacionGastoDepreciacion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionGastoDepreciacionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		this.jButtonAnterioresGastoDepreciacion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresGastoDepreciacionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAnterioresToolBarGastoDepreciacion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresGastoDepreciacionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemAnterioresGastoDepreciacion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresGastoDepreciacionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesGastoDepreciacion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesGastoDepreciacionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesToolBarGastoDepreciacion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesGastoDepreciacionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemSiguientesGastoDepreciacion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesGastoDepreciacionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosGastoDepreciacion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosGastoDepreciacionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosToolBarGastoDepreciacion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosGastoDepreciacionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoGuardarCambiosGastoDepreciacion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosGastoDepreciacionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		//SELECCIONAR TODOS
		this.jCheckBoxSeleccionarTodosGastoDepreciacion.addItemListener(new ItemListener() {		
			public void itemStateChanged(ItemEvent evt) {
				try {jCheckBoxSeleccionarTodosGastoDepreciacionItemListener(evt);}catch(Exception e){e.printStackTrace();}
			}
		});

		this.jComboBoxTiposAccionesGastoDepreciacion.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposAccionesGastoDepreciacionActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jComboBoxTiposSeleccionarGastoDepreciacion.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposSeleccionarGastoDepreciacionActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jTextFieldValorCampoGeneralGastoDepreciacion.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jTextFieldValorCampoGeneralGastoDepreciacionActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormGastoDepreciacion.jButtonidGastoDepreciacionBusqueda.addActionListener(new ButtonActionListener(this,"idGastoDepreciacionBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormGastoDepreciacion.jButtonid_empresaGastoDepreciacionUpdate.addActionListener(new ButtonActionListener(this,"id_empresaGastoDepreciacionUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormGastoDepreciacion.jButtonid_empresaGastoDepreciacionBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaGastoDepreciacionBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormGastoDepreciacion.jButtonid_detalle_grupo_activo_fijoGastoDepreciacionUpdate.addActionListener(new ButtonActionListener(this,"id_detalle_grupo_activo_fijoGastoDepreciacionUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormGastoDepreciacion.jButtonid_detalle_grupo_activo_fijoGastoDepreciacionBusqueda.addActionListener(new ButtonActionListener(this,"id_detalle_grupo_activo_fijoGastoDepreciacionBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormGastoDepreciacion.jButtonanioGastoDepreciacionBusqueda.addActionListener(new ButtonActionListener(this,"anioGastoDepreciacionBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormGastoDepreciacion.jButtonvalorGastoDepreciacionBusqueda.addActionListener(new ButtonActionListener(this,"valorGastoDepreciacionBusqueda"));
		
		
		this.jButtonFK_IdDetalleGrupoActivoFijoGastoDepreciacion.addActionListener(new ButtonActionListener(this,"FK_IdDetalleGrupoActivoFijoGastoDepreciacion"));

		
		//REPORTE DINAMICO
		this.jButtonCerrarReporteDinamicoGastoDepreciacion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarReporteDinamicoGastoDepreciacionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarReporteDinamicoGastoDepreciacion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarReporteDinamicoGastoDepreciacionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarExcelReporteDinamicoGastoDepreciacion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarExcelReporteDinamicoGastoDepreciacionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		//IMPORTACION
		this.jButtonCerrarImportacionGastoDepreciacion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarImportacionGastoDepreciacionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarImportacionGastoDepreciacion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarImportacionGastoDepreciacionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAbrirImportacionGastoDepreciacion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAbrirImportacionGastoDepreciacionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
	}
	*/
	
	
	public void jComboBoxTiposSeleccionarGastoDepreciacionActionListener(ActionEvent evt) throws Exception {    		
		try {			
			Reporte reporte=(Reporte)this.jComboBoxTiposSeleccionarGastoDepreciacion.getSelectedItem();
			
			//if(reporte.getsCodigo().equals("SELECCIONAR")) {
			//}					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,GastoDepreciacionConstantesFunciones.CLASSNAME);
		}
	}	
	
	
	
	public void seleccionarTodosGastoDepreciacion(Boolean conSeleccionarTodos) throws Exception {    		
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				for(GastoDepreciacion gastodepreciacionAux:this.gastodepreciacionLogic.getGastoDepreciacions()) {
					gastodepreciacionAux.setIsSelected(conSeleccionarTodos);
				}			
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(GastoDepreciacion gastodepreciacionAux:gastodepreciacions) {
					gastodepreciacionAux.setIsSelected(conSeleccionarTodos);
				}
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,GastoDepreciacionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarTodosGastoDepreciacionItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingGastoDepreciacion(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			
			if(sTipoSeleccionar.equals("COLUMNAS")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(GastoDepreciacion gastodepreciacionAux:this.gastodepreciacionLogic.getGastoDepreciacions()) {
						gastodepreciacionAux.setIsSelected(this.isSeleccionarTodos);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(GastoDepreciacion gastodepreciacionAux:gastodepreciacions) {
						gastodepreciacionAux.setIsSelected(this.isSeleccionarTodos);
					}
				}
			} else {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					for(GastoDepreciacion gastodepreciacionAux:this.gastodepreciacionLogic.getGastoDepreciacions()) {
					
					}	
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(GastoDepreciacion gastodepreciacionAux:gastodepreciacions) {
						
					}
				}
			}
					
			if(existe) {
				this.inicializarActualizarBindingTablaGastoDepreciacion(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosGastoDepreciacion.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosGastoDepreciacion.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosGastoDepreciacion,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,GastoDepreciacionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionadosGastoDepreciacionItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingGastoDepreciacion(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			int[] arrNumRowsSeleccionados=null;
			
			arrNumRowsSeleccionados=this.jTableDatosGastoDepreciacion.getSelectedRows();
			
			GastoDepreciacion gastodepreciacionLocal=new GastoDepreciacion();
			
			//this.seleccionarTodosGastoDepreciacion(false);
			
			for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					gastodepreciacionLocal =(GastoDepreciacion) this.gastodepreciacionLogic.getGastoDepreciacions().toArray()[this.jTableDatosGastoDepreciacion.convertRowIndexToModel(iNumRowSeleccionado)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					gastodepreciacionLocal =(GastoDepreciacion) this.gastodepreciacions.toArray()[this.jTableDatosGastoDepreciacion.convertRowIndexToModel(iNumRowSeleccionado)];
				}
				
				gastodepreciacionLocal.setIsSelected(this.isSeleccionados);
			}
			
			/*
			if(sTipoSeleccionar.equals("SELECCIONAR")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(GastoDepreciacion gastodepreciacionAux:this.gastodepreciacionLogic.getGastoDepreciacions()) {
						gastodepreciacionAux.setIsSelected(this.isSeleccionados);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(GastoDepreciacion gastodepreciacionAux:gastodepreciacions) {
						gastodepreciacionAux.setIsSelected(this.isSeleccionados);
					}
				}
			}
			*/
			
			//if(existe) {
				this.inicializarActualizarBindingTablaGastoDepreciacion(false);
			/*
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			*/
			
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosGastoDepreciacion.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosGastoDepreciacion.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosGastoDepreciacion,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,GastoDepreciacionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarActualGastoDepreciacionItemListener(ItemEvent evt,Long idActual) throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,GastoDepreciacionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void ejecutarAuxiliarGastoDepreciacionParaAjaxPostBack() throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,GastoDepreciacionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jTextFieldValorCampoGeneralGastoDepreciacionActionListener(ActionEvent evt) throws Exception {    		
		try {
			this.inicializarActualizarBindingGastoDepreciacion(false,false);
			
			//System.out.println(this.jTextFieldValorCampoGeneralGastoDepreciacion.getText());		
			
			Boolean existe=false;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(GastoDepreciacion gastodepreciacionAux:this.gastodepreciacionLogic.getGastoDepreciacions()) {
				
						if(sTipoSeleccionar.equals(GastoDepreciacionConstantesFunciones.LABEL_ANIO)) {
							existe=true;
							gastodepreciacionAux.setanio(Integer.parseInt(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(GastoDepreciacionConstantesFunciones.LABEL_VALOR)) {
							existe=true;
							gastodepreciacionAux.setvalor(Double.parseDouble(this.sValorCampoGeneral));
						}
				}	
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(GastoDepreciacion gastodepreciacionAux:gastodepreciacions) {
					
						if(sTipoSeleccionar.equals(GastoDepreciacionConstantesFunciones.LABEL_ANIO)) {
							existe=true;
							gastodepreciacionAux.setanio(Integer.parseInt(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(GastoDepreciacionConstantesFunciones.LABEL_VALOR)) {
							existe=true;
							gastodepreciacionAux.setvalor(Double.parseDouble(this.sValorCampoGeneral));
						}
				}
			}
								
			if(existe) {
				this.inicializarActualizarBindingTablaGastoDepreciacion(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,GastoDepreciacionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jComboBoxTiposAccionesGastoDepreciacionActionListener(ActionEvent evt,Boolean esParaAccionDesdeFormulario) throws Exception {    				
		Boolean conSplash=true;
		
		try {							
		
			this.inicializarActualizarBindingGastoDepreciacion(false,false);
			
			Reporte reporte=new Reporte();
			
			this.esParaAccionDesdeFormularioGastoDepreciacion=esParaAccionDesdeFormulario;
			
			if(!esParaAccionDesdeFormulario) {
				
				reporte=(Reporte)this.jComboBoxTiposAccionesGastoDepreciacion.getSelectedItem();
				
			} else {
				reporte=(Reporte)this.jInternalFrameDetalleFormGastoDepreciacion.jComboBoxTiposAccionesFormularioGastoDepreciacion.getSelectedItem();
			}
			String sTipoAccionLocal=this.sTipoAccion;
			
			if(!esParaAccionDesdeFormulario) {
				sTipoAccionLocal=this.sTipoAccion;
			} else {
				sTipoAccionLocal=this.sTipoAccionFormulario;
			}
			
			if(sTipoAccionLocal.equals("GENERAR REPORTE")) {//reporte.getsCodigo().equals("GENERAR REPORTE")) {
				if(this.isPermisoReporteGastoDepreciacion) {				
					conSplash=true;//false;										
					
					//this.startProcessGastoDepreciacion(conSplash);
				
					this.generarReporteGastoDepreciacionsSeleccionados();
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesGastoDepreciacion.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormGastoDepreciacion.jComboBoxTiposAccionesFormularioGastoDepreciacion.setSelectedIndex(0);					
				}
			} else if(sTipoAccionLocal.equals("GENERAR REPORTE DINAMICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.mostrarReporteDinamicoGastoDepreciacionsSeleccionados();
				//this.jComboBoxTiposAccionesGastoDepreciacion.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("GENERAR_REPORTE_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoGastoDepreciacionsSeleccionados(false);
				//this.jComboBoxTiposAccionesGastoDepreciacion.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("GENERAR_REPORTE_TOTALES_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoGastoDepreciacionsSeleccionados(true);
				//this.jComboBoxTiposAccionesGastoDepreciacion.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessGastoDepreciacion();
				
				this.exportarGastoDepreciacionsSeleccionados();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesGastoDepreciacion.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormGastoDepreciacion.jComboBoxTiposAccionesFormularioGastoDepreciacion.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("IMPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				this.mostrarImportacionGastoDepreciacions();
				//this.importarGastoDepreciacions();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesGastoDepreciacion.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormGastoDepreciacion.jComboBoxTiposAccionesFormularioGastoDepreciacion.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS_EXCEL")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessGastoDepreciacion();
				//SE EXPORTA SEGUN TIPO ARCHIVO SELECCIONADO
				//this.exportarExcelGastoDepreciacionsSeleccionados();
				//this.jComboBoxTiposAccionesGastoDepreciacion.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("RECARGAR_FK")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {								
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE RECARGAR REFERENCIAS ?", "MANTENIMIENTO DE Gasto Depreciacion", JOptionPane.OK_CANCEL_OPTION) == 0) {
				
				//this.startProcessGastoDepreciacion();
				
					if(!esParaAccionDesdeFormulario || (esParaAccionDesdeFormulario && this.isEsNuevoGastoDepreciacion)) {
						this.esRecargarFks=true;
						this.cargarCombosForeignKeyGastoDepreciacion(false,false,false);
						this.esRecargarFks=false;
						
						JOptionPane.showMessageDialog(this,"PROCESO EJECUTADO CORRECTAMENTE","MANTENIMIENTO DE Gasto Depreciacion",JOptionPane.INFORMATION_MESSAGE);
					} else {
						JOptionPane.showMessageDialog(this,"ESTE PROCESO SOLO FUNCIONA AL INGRESAR UN NUEVO ELEMENTO","MANTENIMIENTO",JOptionPane.ERROR_MESSAGE);	
					}
					
					
				}
				
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesGastoDepreciacion.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormGastoDepreciacion.jComboBoxTiposAccionesFormularioGastoDepreciacion.setSelectedIndex(0);					
				}	
			} 			
			else if(GastoDepreciacionBeanSwingJInternalFrame.EsProcesoReporte(reporte.getsCodigo())){
				if(this.isPermisoReporteGastoDepreciacion) {				
					if(this.tieneElementosSeleccionados()) {
						this.quitarFilaTotales();
						
						conSplash=false;
						
						//this.startProcessGastoDepreciacion(conSplash);
					
						//this.actualizarParametrosGeneralGastoDepreciacion();
						
						this.generarReporteProcesoAccionGastoDepreciacionsSeleccionados(reporte.getsCodigo());
						
						if(!esParaAccionDesdeFormulario) {
							
							this.jComboBoxTiposAccionesGastoDepreciacion.setSelectedIndex(0);					
							
						} else {
							this.jInternalFrameDetalleFormGastoDepreciacion.jComboBoxTiposAccionesFormularioGastoDepreciacion.setSelectedIndex(0);					
						}
					} else {
						JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
			} 
			else if(GastoDepreciacionBeanSwingJInternalFrameAdditional.EsProcesoAccionNormal(reporte.getsCodigo())){
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR "+reporte.getsDescripcion()+" EN PROCESO Gasto DepreciacionES SELECCIONADOS?", "MANTENIMIENTO DE Gasto Depreciacion", JOptionPane.OK_CANCEL_OPTION) == 0) {
						//this.startProcessGastoDepreciacion();
				
						this.actualizarParametrosGeneralGastoDepreciacion();
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {						
							this.gastodepreciacionReturnGeneral=gastodepreciacionLogic.procesarAccionGastoDepreciacionsWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,sTipoAccionLocal,this.gastodepreciacionLogic.getGastoDepreciacions(),this.gastodepreciacionParameterGeneral);
						
						} else if(Constantes.ISUSAEJBREMOTE) {
						
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
						this.procesarGastoDepreciacionReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesGastoDepreciacion.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormGastoDepreciacion.jComboBoxTiposAccionesFormularioGastoDepreciacion.setSelectedIndex(0);					
					}
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}				
			} 
			else {
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					this.actualizarParametrosGeneralGastoDepreciacion();
					
					GastoDepreciacionBeanSwingJInternalFrameAdditional.ProcesarAccion(reporte.getsCodigo(),reporte.getsDescripcion(),this);
					
					this.procesarGastoDepreciacionReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesGastoDepreciacion.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormGastoDepreciacion.jComboBoxTiposAccionesFormularioGastoDepreciacion.setSelectedIndex(0);					
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}
			}
		} catch(Exception e) {
			this.esRecargarFks=false;
			
			FuncionesSwing.manageException(this, e,logger,GastoDepreciacionConstantesFunciones.CLASSNAME);
		
		}  finally {
      		//this.finishProcessGastoDepreciacion(conSplash);
      	}
	}
	
	public void jComboBoxTiposRelacionesGastoDepreciacionActionListener(ActionEvent evt) throws Exception {    				
		Boolean conSplash=true;
		
		try {			
			this.startProcessGastoDepreciacion();
			
			if(this.jInternalFrameDetalleFormGastoDepreciacion==null) { //if(!this.conCargarFormDetalle) {			
				this.inicializarFormDetalle();
			}
			
			ArrayList<GastoDepreciacion> gastodepreciacionsSeleccionados=new ArrayList<GastoDepreciacion>();		
			GastoDepreciacion gastodepreciacion=new GastoDepreciacion();
			
			int rowIndex=-1;//CON ESTO SE DESHABILITA SELECCION POR INDICE
			
			this.inicializarActualizarBindingGastoDepreciacion(false,false);
			
			Reporte reporte=new Reporte();
			
			
			reporte=(Reporte)this.jComboBoxTiposRelacionesGastoDepreciacion.getSelectedItem();
			
			
			
			
			gastodepreciacionsSeleccionados=this.getGastoDepreciacionsSeleccionados(true);
			//this.sTipoAccion;
			
			if(gastodepreciacionsSeleccionados.size()==1) {
				for(GastoDepreciacion gastodepreciacionAux:gastodepreciacionsSeleccionados) {
					gastodepreciacion=gastodepreciacionAux;
				}
				
				if(this.sTipoAccion.equals("NONE")) {
				
				}
				
				else if(this.sTipoRelacion.equals("Cuenta Conta Gasto Depre")) {
					jButtonCuentaContaGastoDepreActionPerformed(null,rowIndex,true,false,gastodepreciacion);
				}
			} else {
				JOptionPane.showMessageDialog(this,"SELECCIONE SOLO UN REGISTRO","RELACIONES",JOptionPane.ERROR_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,GastoDepreciacionConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.finishProcessGastoDepreciacion();
			
      		//this.finishProcessGastoDepreciacion(conSplash);
      	}
	}
			
	public static Boolean EsProcesoReporte(String sTipoProceso) throws Exception {
		Boolean esProcesoAccionRepoorte=false;

		if(sTipoProceso.contains("REPORTE_")) {
			 esProcesoAccionRepoorte=true;
		}

		return esProcesoAccionRepoorte;
	}
	
	public void procesarGastoDepreciacionReturnGeneral() throws Exception {
		if(this.gastodepreciacionReturnGeneral.getConRetornoEstaProcesado()) {
			JOptionPane.showMessageDialog(this,this.gastodepreciacionReturnGeneral.getsMensajeProceso(),"PROCESO",JOptionPane.INFORMATION_MESSAGE);
		}
		
		if(this.gastodepreciacionReturnGeneral.getConMostrarMensaje()) {
			JOptionPane.showMessageDialog(this,this.gastodepreciacionReturnGeneral.getsMensajeProceso(),"PROCESO",FuncionesSwing.getColorSelectedBackground(this.gastodepreciacionReturnGeneral.getsTipoMensaje()));
		}
		
		if(this.gastodepreciacionReturnGeneral.getConRecargarInformacion()) {
			this.procesarBusqueda(this.sAccionBusqueda);
			
			this.inicializarActualizarBindingGastoDepreciacion(false);
		}
		
		if(this.gastodepreciacionReturnGeneral.getConRetornoLista() || this.gastodepreciacionReturnGeneral.getConRetornoObjeto()) {
			if(this.gastodepreciacionReturnGeneral.getConRetornoLista()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.gastodepreciacionLogic.setGastoDepreciacions(this.gastodepreciacionReturnGeneral.getGastoDepreciacions());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			if(this.gastodepreciacionReturnGeneral.getConRetornoObjeto()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.gastodepreciacionLogic.setGastoDepreciacion(this.gastodepreciacionReturnGeneral.getGastoDepreciacion());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			this.inicializarActualizarBindingGastoDepreciacion(false);
		}
	}
	
	public void actualizarParametrosGeneralGastoDepreciacion() throws Exception {
		
		
	}
	
	public ArrayList<GastoDepreciacion> getGastoDepreciacionsSeleccionados(Boolean conSeleccionarTodosAutomatico) throws Exception {
		ArrayList<GastoDepreciacion> gastodepreciacionsSeleccionados=new ArrayList<GastoDepreciacion>();
		Boolean existe=false;
		
		if(!this.esParaAccionDesdeFormularioGastoDepreciacion) {
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				
				for(GastoDepreciacion gastodepreciacionAux:gastodepreciacionLogic.getGastoDepreciacions()) {
					if(gastodepreciacionAux.getIsSelected()) {
						gastodepreciacionsSeleccionados.add(gastodepreciacionAux);				
					}
				}
				
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(GastoDepreciacion gastodepreciacionAux:this.gastodepreciacions) {
					if(gastodepreciacionAux.getIsSelected()) {
						gastodepreciacionsSeleccionados.add(gastodepreciacionAux);				
					}
				}
			}
			
			if(gastodepreciacionsSeleccionados.size()>0) {
				existe=true;
			}
			
			//SI NO ESTA NINGUNO SELECCIONADO SE SELECCIONA TODOS
			if(!existe) {
				if(conSeleccionarTodosAutomatico) {
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						gastodepreciacionsSeleccionados.addAll(this.gastodepreciacionLogic.getGastoDepreciacions());
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						gastodepreciacionsSeleccionados.addAll(this.gastodepreciacions);				
					}
				}
			}
		} else {
			gastodepreciacionsSeleccionados.add(this.gastodepreciacion);
		}
		
		return gastodepreciacionsSeleccionados;
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
	
	public void generarReporteGastoDepreciacionsSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoReporte.equals("NORMAL") || this.sTipoReporte.equals("FORMULARIO")) {
			existe=true;								
			this.generarReporteNormalGastoDepreciacionsSeleccionados();
			
		} else if(this.sTipoReporte.equals("DINAMICO")) {
			existe=true;
			this.mostrarReporteDinamicoGastoDepreciacionsSeleccionados();
			
		} else if(this.sTipoReporte.equals("GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoGastoDepreciacionsSeleccionados(false);
			
		} else if(this.sTipoReporte.equals("TOTALES_GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoGastoDepreciacionsSeleccionados(true);
		}
		else if(this.sTipoReporte.equals("RELACIONES")) {
			//SI SE GENERA REPORTE RELACIONES
			existe=true;
			this.generarReporteRelacionesGastoDepreciacionsSeleccionados();
		}					
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE REPORTE VALIDO","REPORTE DE Gasto Depreciacion",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void generarReporteRelacionesGastoDepreciacionsSeleccionados() throws Exception {
		ArrayList<GastoDepreciacion> gastodepreciacionsSeleccionados=new ArrayList<GastoDepreciacion>();		
		
		gastodepreciacionsSeleccionados=this.getGastoDepreciacionsSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
					
		//this.sTipoReporteExtra="MasterRelaciones";
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		
		this.generarReporteGastoDepreciacions("Todos",gastodepreciacionsSeleccionados);
		
	}	
	
	public void generarReporteNormalGastoDepreciacionsSeleccionados() throws Exception {
		ArrayList<GastoDepreciacion> gastodepreciacionsSeleccionados=new ArrayList<GastoDepreciacion>();		
		
		gastodepreciacionsSeleccionados=this.getGastoDepreciacionsSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
								
		if(this.sTipoReporte.equals("FORMULARIO")) {
			this.sTipoReporteExtra="Vertical";					
		}
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.generarReporteGastoDepreciacions("Todos",gastodepreciacionsSeleccionados);
	}		
	
	public void generarReporteProcesoAccionGastoDepreciacionsSeleccionados(String sProcesoReporte) throws Exception {
		ArrayList<GastoDepreciacion> gastodepreciacionsSeleccionados=new ArrayList<GastoDepreciacion>();
		
		gastodepreciacionsSeleccionados=this.getGastoDepreciacionsSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(false,false,true,"");
		
		/*
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.sTipoReporteExtra=sProcesoReporte.toLowerCase();
		
		this.esReporteAccionProceso=true;
		this.generarReporteGastoDepreciacions("Todos",gastodepreciacionsSeleccionados);
		this.esReporteAccionProceso=false;
	}
	
	
	public void mostrarReporteDinamicoGastoDepreciacionsSeleccionados() throws Exception {
		ArrayList<GastoDepreciacion> gastodepreciacionsSeleccionados=new ArrayList<GastoDepreciacion>();		
		
		
		this.abrirInicializarFrameReporteDinamicoGastoDepreciacion();
		
		
		gastodepreciacionsSeleccionados=this.getGastoDepreciacionsSeleccionados(true);
		
		this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirFrameReporteDinamicoGastoDepreciacion();
		
		
		//this.generarReporteGastoDepreciacions("Todos",gastodepreciacionsSeleccionados ,gastodepreciacionImplementable,gastodepreciacionImplementableHome);
	}
	
	public void mostrarImportacionGastoDepreciacions() throws Exception {
		//this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirInicializarFrameImportacionGastoDepreciacion();
		
		this.abrirFrameImportacionGastoDepreciacion();		
		
			
		//this.generarReporteGastoDepreciacions("Todos",gastodepreciacionsSeleccionados ,gastodepreciacionImplementable,gastodepreciacionImplementableHome);
	}
	
	public void importarGastoDepreciacions() throws Exception {		
	
	}
	
	public void exportarGastoDepreciacionsSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoArchivoReporte.equals("EXCEL")) {
			existe=true;
			this.exportarExcelGastoDepreciacionsSeleccionados();
			
		} else if(this.sTipoArchivoReporte.equals("TEXTO")) {
			existe=true;
			this.exportarTextoGastoDepreciacionsSeleccionados();
		
		} else if(this.sTipoArchivoReporte.equals("XML")) {
			existe=true;
			this.exportarXmlGastoDepreciacionsSeleccionados();
		} 
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE ARCHIVO VALIDO","EXPORTACION DE Gasto Depreciacion",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void exportarTextoGastoDepreciacionsSeleccionados() throws Exception {
		ArrayList<GastoDepreciacion> gastodepreciacionsSeleccionados=new ArrayList<GastoDepreciacion>();		
		
		gastodepreciacionsSeleccionados=this.getGastoDepreciacionsSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"gastodepreciacion."+"txt";//Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario);
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		BufferedWriter bufferedWriter = null;
		FileWriter fileWriter=null;
		
		fileWriter=new FileWriter(sPath);
		
		bufferedWriter = new BufferedWriter(fileWriter);
		
		try {
			if(conCabecera) {
				sFilaCabecera=this.getFilaCabeceraExportarGastoDepreciacion(sDelimiter);
				
				bufferedWriter.write(sFilaCabecera);
			}				
			
			for(GastoDepreciacion gastodepreciacionAux:gastodepreciacionsSeleccionados) {
				sFilaDatos=this.getFilaDatosExportarGastoDepreciacion(gastodepreciacionAux,sDelimiter);
				
				bufferedWriter.write(sFilaDatos);
				
				//gastodepreciacionAux.setsDetalleGeneralEntityReporte(gastodepreciacionAux.toString());			
			}
			
			bufferedWriter.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.gastodepreciacionSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Gasto Depreciacion",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {
       		if (bufferedWriter != null) {
				bufferedWriter.close();
			}
		}
	}
	
	public String getFilaCabeceraExportarGastoDepreciacion(String sDelimiter) {
		String sFilaCabecera="";
		
		
		sFilaCabecera+=GastoDepreciacionConstantesFunciones.LABEL_ID;

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaCabecera+=sDelimiter;
		sFilaCabecera+=GastoDepreciacionConstantesFunciones.LABEL_VERSIONROW;
		}

		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=GastoDepreciacionConstantesFunciones.LABEL_IDEMPRESA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=GastoDepreciacionConstantesFunciones.LABEL_IDDETALLEGRUPOACTIVOFIJO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=GastoDepreciacionConstantesFunciones.LABEL_ANIO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=GastoDepreciacionConstantesFunciones.LABEL_VALOR;
		
		return sFilaCabecera;
	}
	
	public String getFilaDatosExportarGastoDepreciacion(GastoDepreciacion gastodepreciacion,String sDelimiter) {
		String sFilaDatos="";
		
		sFilaDatos+="\r\n";
		
		
		sFilaDatos+=gastodepreciacion.getId().toString();

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaDatos+=sDelimiter;
		sFilaDatos+=gastodepreciacion.getVersionRow().toString();
		}

		sFilaDatos+=sDelimiter;
		sFilaDatos+=gastodepreciacion.getempresa_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=gastodepreciacion.getdetallegrupoactivofijo_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=gastodepreciacion.getanio().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=gastodepreciacion.getvalor().toString();
		
		return sFilaDatos;
	}
	
	//@SuppressWarnings("deprecation")
	public void exportarExcelGastoDepreciacionsSeleccionados() throws Exception {
		ArrayList<GastoDepreciacion> gastodepreciacionsSeleccionados=new ArrayList<GastoDepreciacion>();		
		
		gastodepreciacionsSeleccionados=this.getGastoDepreciacionsSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"gastodepreciacion.xls";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		FileOutputStream fileOutputStream=null;
		
		try {
			HSSFWorkbook workbook = new HSSFWorkbook();
			HSSFSheet sheet = workbook.createSheet("GastoDepreciacions");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			HSSFRow row = sheet.createRow(iRow);
			HSSFCell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");

			if(conCabecera) {
				this.getFilaCabeceraExportarExcelGastoDepreciacion(row);				
				iRow++;
			}				
			
			for(GastoDepreciacion gastodepreciacionAux:gastodepreciacionsSeleccionados) {
				row = sheet.createRow(iRow);
				
				this.getFilaDatosExportarExcelGastoDepreciacion(gastodepreciacionAux,row);
				
				iRow++;
			}
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.gastodepreciacionSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Gasto Depreciacion",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			
       		if (fileOutputStream != null) {
				fileOutputStream.close();
			}			
		}
	}		
	
	public void exportarXmlGastoDepreciacionsSeleccionados() throws Exception {
		ArrayList<GastoDepreciacion> gastodepreciacionsSeleccionados=new ArrayList<GastoDepreciacion>();		
		
		gastodepreciacionsSeleccionados=this.getGastoDepreciacionsSeleccionados(true);
		
		//String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		//Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		//String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"gastodepreciacion.xml";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		DocumentBuilderFactory documentBuilderFactory=null;
		DocumentBuilder documentBuilder =null;
		
		try {
			documentBuilderFactory = DocumentBuilderFactory.newInstance();
			documentBuilder = documentBuilderFactory.newDocumentBuilder();
	
			Document document = documentBuilder.newDocument();
			Element elementRoot = document.createElement("gastodepreciacions");
			
			document.appendChild(elementRoot);
		    			
												
			Element element = null;//document.createElement("gastodepreciacion");
			//elementRoot.appendChild(element);
		
			for(GastoDepreciacion gastodepreciacionAux:gastodepreciacionsSeleccionados) {
				element = document.createElement("gastodepreciacion");
				elementRoot.appendChild(element);
			
				this.setFilaDatosExportarXmlGastoDepreciacion(gastodepreciacionAux,document,element);
			}
			
			TransformerFactory transformerFactory = TransformerFactory.newInstance();
			Transformer transformer = transformerFactory.newTransformer();
			DOMSource domSource = new DOMSource(document);
			
			StreamResult streamResult = new StreamResult(new File(sPath));
	
			transformer.transform(domSource, streamResult);
						
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.gastodepreciacionSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Gasto Depreciacion",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			       				
		}
	}	
	
	//@SuppressWarnings("deprecation")
	public void getFilaCabeceraExportarExcelGastoDepreciacion(HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(GastoDepreciacionConstantesFunciones.LABEL_ID);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
		cell = row.createCell(iColumn++);cell.setCellValue(GastoDepreciacionConstantesFunciones.LABEL_VERSIONROW);
		}

		cell = row.createCell(iColumn++);cell.setCellValue(GastoDepreciacionConstantesFunciones.LABEL_IDEMPRESA);
		cell = row.createCell(iColumn++);cell.setCellValue(GastoDepreciacionConstantesFunciones.LABEL_IDDETALLEGRUPOACTIVOFIJO);
		cell = row.createCell(iColumn++);cell.setCellValue(GastoDepreciacionConstantesFunciones.LABEL_ANIO);
		cell = row.createCell(iColumn++);cell.setCellValue(GastoDepreciacionConstantesFunciones.LABEL_VALOR);
	}
	
	//@SuppressWarnings("deprecation")
	public void getFilaDatosExportarExcelGastoDepreciacion(GastoDepreciacion gastodepreciacion,HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(gastodepreciacion.getId());
		cell = row.createCell(iColumn++);cell.setCellValue(gastodepreciacion.getempresa_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(gastodepreciacion.getdetallegrupoactivofijo_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(gastodepreciacion.getanio());
		cell = row.createCell(iColumn++);cell.setCellValue(gastodepreciacion.getvalor());				
	}
	
	public void setFilaDatosExportarXmlGastoDepreciacion(GastoDepreciacion gastodepreciacion,Document document,Element element) {
		/*
		Element lastname = document.createElement("lastname");
		lastname.appendChild(document.createTextNode("mook kim"));
		element.appendChild(lastname);
		*/
		

		Element elementId = document.createElement(GastoDepreciacionConstantesFunciones.ID);
		elementId.appendChild(document.createTextNode(gastodepreciacion.getId().toString().trim()));
		element.appendChild(elementId);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){

		Element elementVersionRow = document.createElement(GastoDepreciacionConstantesFunciones.VERSIONROW);
		elementVersionRow.appendChild(document.createTextNode(gastodepreciacion.getVersionRow().toString().trim()));
		element.appendChild(elementVersionRow);
		}


		Element elementempresa_descripcion = document.createElement(GastoDepreciacionConstantesFunciones.IDEMPRESA);
		elementempresa_descripcion.appendChild(document.createTextNode(gastodepreciacion.getempresa_descripcion()));
		element.appendChild(elementempresa_descripcion);

		Element elementdetallegrupoactivofijo_descripcion = document.createElement(GastoDepreciacionConstantesFunciones.IDDETALLEGRUPOACTIVOFIJO);
		elementdetallegrupoactivofijo_descripcion.appendChild(document.createTextNode(gastodepreciacion.getdetallegrupoactivofijo_descripcion()));
		element.appendChild(elementdetallegrupoactivofijo_descripcion);

		Element elementanio = document.createElement(GastoDepreciacionConstantesFunciones.ANIO);
		elementanio.appendChild(document.createTextNode(gastodepreciacion.getanio().toString().trim()));
		element.appendChild(elementanio);

		Element elementvalor = document.createElement(GastoDepreciacionConstantesFunciones.VALOR);
		elementvalor.appendChild(document.createTextNode(gastodepreciacion.getvalor().toString().trim()));
		element.appendChild(elementvalor);
	}
	
	public void generarReporteGroupGenericoGastoDepreciacionsSeleccionados(Boolean soloTotales) throws Exception {
		ArrayList<GastoDepreciacion> gastodepreciacionsSeleccionados=new ArrayList<GastoDepreciacion>();
		
		gastodepreciacionsSeleccionados=this.getGastoDepreciacionsSeleccionados(true);
		
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
		
		this.setColumnaDescripcionReporteGroupGenericoGastoDepreciacion(gastodepreciacionsSeleccionados);
		
		this.generarReporteGastoDepreciacions("Todos",gastodepreciacionsSeleccionados);
	}
	
	public void setColumnaDescripcionReporteGroupGenericoGastoDepreciacion(ArrayList<GastoDepreciacion> gastodepreciacionsSeleccionados) throws Exception {    		
		try {
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			
			Boolean existe=false;
			
			for(GastoDepreciacion gastodepreciacionAux:gastodepreciacionsSeleccionados) {
				gastodepreciacionAux.setsDetalleGeneralEntityReporte(gastodepreciacionAux.toString());
			
				if(sTipoSeleccionar.equals(GastoDepreciacionConstantesFunciones.LABEL_IDEMPRESA)) {
					existe=true;
					gastodepreciacionAux.setsDescripcionGeneralEntityReporte1(gastodepreciacionAux.getempresa_descripcion());
				}
				 else if(sTipoSeleccionar.equals(GastoDepreciacionConstantesFunciones.LABEL_IDDETALLEGRUPOACTIVOFIJO)) {
					existe=true;
					gastodepreciacionAux.setsDescripcionGeneralEntityReporte1(gastodepreciacionAux.getdetallegrupoactivofijo_descripcion());
				}
				 else if(sTipoSeleccionar.equals(GastoDepreciacionConstantesFunciones.LABEL_ANIO)) {
					existe=true;
					gastodepreciacionAux.setsDescripcionGeneralEntityReporte1(gastodepreciacionAux.getanio().toString());
				}
			}	
											
			if(!existe) {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}										
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,GastoDepreciacionConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void actualizarEstadoCeldasBotonesGastoDepreciacion(String sAccion,Boolean isGuardarCambiosEnLote,Boolean isEsMantenimientoRelacionado) throws Exception {
		if(sAccion=="n") {
			if(!this.esParaBusquedaForeignKey) {
				this.isVisibilidadCeldaNuevoGastoDepreciacion=true;
				this.isVisibilidadCeldaNuevoRelacionesGastoDepreciacion=true;
				this.isVisibilidadCeldaGuardarCambiosGastoDepreciacion=true;
			}
			
			this.isVisibilidadCeldaModificarGastoDepreciacion=false;
			this.isVisibilidadCeldaActualizarGastoDepreciacion=false;
			this.isVisibilidadCeldaEliminarGastoDepreciacion=false;
			this.isVisibilidadCeldaCancelarGastoDepreciacion=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarGastoDepreciacion=true;
				} else {
					this.isVisibilidadCeldaGuardarGastoDepreciacion=false;
				}
			}
		} else if(sAccion=="a") {
			this.isVisibilidadCeldaNuevoGastoDepreciacion=false;
			this.isVisibilidadCeldaNuevoRelacionesGastoDepreciacion=false;
			this.isVisibilidadCeldaGuardarCambiosGastoDepreciacion=false;
			this.isVisibilidadCeldaModificarGastoDepreciacion=false;
			this.isVisibilidadCeldaActualizarGastoDepreciacion=true;
			this.isVisibilidadCeldaEliminarGastoDepreciacion=false;
			this.isVisibilidadCeldaCancelarGastoDepreciacion=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarGastoDepreciacion=true;
				} else {
					this.isVisibilidadCeldaGuardarGastoDepreciacion=false;
				}
			}
		} else if(sAccion=="ae") {
			this.isVisibilidadCeldaNuevoGastoDepreciacion=false;
			this.isVisibilidadCeldaNuevoRelacionesGastoDepreciacion=false;
			this.isVisibilidadCeldaGuardarCambiosGastoDepreciacion=false;
			this.isVisibilidadCeldaModificarGastoDepreciacion=false;
			this.isVisibilidadCeldaActualizarGastoDepreciacion=true;
			this.isVisibilidadCeldaEliminarGastoDepreciacion=true;
			this.isVisibilidadCeldaCancelarGastoDepreciacion=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarGastoDepreciacion=true;
				} else {
					this.isVisibilidadCeldaGuardarGastoDepreciacion=false;
				}
			}
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {
			this.isVisibilidadCeldaNuevoGastoDepreciacion=false;
			this.isVisibilidadCeldaNuevoRelacionesGastoDepreciacion=false;
			this.isVisibilidadCeldaGuardarCambiosGastoDepreciacion=false;
			this.isVisibilidadCeldaModificarGastoDepreciacion=false;
			this.isVisibilidadCeldaActualizarGastoDepreciacion=true;
			this.isVisibilidadCeldaEliminarGastoDepreciacion=false;
			this.isVisibilidadCeldaCancelarGastoDepreciacion=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarGastoDepreciacion=false;
				} else {
					this.isVisibilidadCeldaGuardarGastoDepreciacion=false;
				}
			}
		} else if(sAccion=="c") {
			this.isVisibilidadCeldaNuevoGastoDepreciacion=true;
			this.isVisibilidadCeldaNuevoRelacionesGastoDepreciacion=true;
			this.isVisibilidadCeldaGuardarCambiosGastoDepreciacion=true;
			this.isVisibilidadCeldaModificarGastoDepreciacion=false;
			this.isVisibilidadCeldaActualizarGastoDepreciacion=false;
			this.isVisibilidadCeldaEliminarGastoDepreciacion=false;
			this.isVisibilidadCeldaCancelarGastoDepreciacion=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarGastoDepreciacion=true;
				} else {
					this.isVisibilidadCeldaGuardarGastoDepreciacion=false;
				}
			}
		} else if(sAccion=="t") {
			this.isVisibilidadCeldaNuevoGastoDepreciacion=false;
			this.isVisibilidadCeldaNuevoRelacionesGastoDepreciacion=false;
			this.isVisibilidadCeldaGuardarCambiosGastoDepreciacion=false;
			this.isVisibilidadCeldaActualizarGastoDepreciacion=false;
			this.isVisibilidadCeldaEliminarGastoDepreciacion=false;
			this.isVisibilidadCeldaCancelarGastoDepreciacion=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarGastoDepreciacion=false;
				} else {
					this.isVisibilidadCeldaGuardarGastoDepreciacion=false;
				}
			}
		}  else if(sAccion=="s"||sAccion=="s2") {
			this.isVisibilidadCeldaNuevoGastoDepreciacion=false;
			this.isVisibilidadCeldaNuevoRelacionesGastoDepreciacion=false;
			this.isVisibilidadCeldaGuardarCambiosGastoDepreciacion=false;
			this.isVisibilidadCeldaModificarGastoDepreciacion=true;
			this.isVisibilidadCeldaActualizarGastoDepreciacion=false;
			this.isVisibilidadCeldaEliminarGastoDepreciacion=false;
			this.isVisibilidadCeldaCancelarGastoDepreciacion=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarGastoDepreciacion=false;
				} else {
					this.isVisibilidadCeldaGuardarGastoDepreciacion=false;
				}
			}
		}
		
		//ACTUALIZA VISIBILIDAD PANELES
		if(GastoDepreciacionJInternalFrame.CON_DATOS_FRAME && !this.esParaBusquedaForeignKey) {
			//SIEMPRE VISIBLE
			this.isVisibilidadCeldaNuevoGastoDepreciacion=true;
			this.isVisibilidadCeldaNuevoRelacionesGastoDepreciacion=true;
			this.isVisibilidadCeldaGuardarCambiosGastoDepreciacion=true;
		} else {
			this.actualizarEstadoPanelsGastoDepreciacion(sAccion);						
		}
		
		if(this.esParaBusquedaForeignKey) {
			this.isVisibilidadCeldaCopiarGastoDepreciacion=false;
			//this.isVisibilidadCeldaVerFormGastoDepreciacion=false;
			this.isVisibilidadCeldaDuplicarGastoDepreciacion=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONES
		if(!gastodepreciacionSessionBean.getConGuardarRelaciones()) {
			this.isVisibilidadCeldaNuevoRelacionesGastoDepreciacion=false;
		} else {
			this.isVisibilidadCeldaNuevoGastoDepreciacion=false;
			this.isVisibilidadCeldaGuardarCambiosGastoDepreciacion=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONADO
		if(gastodepreciacionSessionBean.getEsGuardarRelacionado()) {
			if(!gastodepreciacionSessionBean.getConGuardarRelaciones()) {	
				this.isVisibilidadCeldaNuevoRelacionesGastoDepreciacion=false;												
			}
			
			this.jButtonCerrarGastoDepreciacion.setVisible(false);
		}
		
		//SI NO TIENE MAXIMO DE RELACIONES PERMITIDAS
		if(!this.conMaximoRelaciones) {
			this.isVisibilidadCeldaNuevoRelacionesGastoDepreciacion=false;
		}
		
		if(!this.permiteMantenimiento(this.gastodepreciacion)) {
			this.isVisibilidadCeldaActualizarGastoDepreciacion=false;
			this.isVisibilidadCeldaEliminarGastoDepreciacion=false;
		}
		
		
		
	}
	
	public void actualizarEstadoCeldasBotonesConGuardarRelacionesGastoDepreciacion() {
		this.isVisibilidadCeldaNuevoGastoDepreciacion=false;
		this.isVisibilidadCeldaGuardarCambiosGastoDepreciacion=false;
	}
	
	public void actualizarEstadoPanelsGastoDepreciacion(String sAccion) {
		if(sAccion=="n") {
			if(this.jScrollPanelDatosEdicionGastoDepreciacion!=null) {
				this.jScrollPanelDatosEdicionGastoDepreciacion.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasGastoDepreciacion!=null) {
				this.jTabbedPaneBusquedasGastoDepreciacion.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosGastoDepreciacion!=null) {
				this.jScrollPanelDatosGastoDepreciacion.setVisible(true);
			}
			
			if(this.jPanelPaginacionGastoDepreciacion!=null) {
				this.jPanelPaginacionGastoDepreciacion.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesGastoDepreciacion!=null) {
				this.jPanelParametrosReportesGastoDepreciacion.setVisible(true);		    
			}
			
		} else if(sAccion=="a") {				
			if(this.jScrollPanelDatosEdicionGastoDepreciacion!=null) {
				this.jScrollPanelDatosEdicionGastoDepreciacion.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasGastoDepreciacion!=null) {
				this.jTabbedPaneBusquedasGastoDepreciacion.setVisible(false);			
			}
			
			
			
			if(this.jScrollPanelDatosGastoDepreciacion!=null) {
				this.jScrollPanelDatosGastoDepreciacion.setVisible(false);
			}
			
			if(this.jPanelPaginacionGastoDepreciacion!=null) {
				this.jPanelPaginacionGastoDepreciacion.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesGastoDepreciacion!=null) {
				this.jPanelParametrosReportesGastoDepreciacion.setVisible(false);
			}
						
		} else if(sAccion=="ae") {		
			if(this.jScrollPanelDatosEdicionGastoDepreciacion!=null) {
				this.jScrollPanelDatosEdicionGastoDepreciacion.setVisible(true);		
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasGastoDepreciacion!=null) {
				this.jTabbedPaneBusquedasGastoDepreciacion.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosGastoDepreciacion!=null) {
				this.jScrollPanelDatosGastoDepreciacion.setVisible(false);
			}
			
			if(this.jPanelPaginacionGastoDepreciacion!=null) {
				this.jPanelPaginacionGastoDepreciacion.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesGastoDepreciacion!=null) {
				this.jPanelParametrosReportesGastoDepreciacion.setVisible(false);
			}
						
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {	
			if(this.jScrollPanelDatosEdicionGastoDepreciacion!=null) {
				this.jScrollPanelDatosEdicionGastoDepreciacion.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasGastoDepreciacion!=null) {
				this.jTabbedPaneBusquedasGastoDepreciacion.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosGastoDepreciacion!=null) {
				this.jScrollPanelDatosGastoDepreciacion.setVisible(false);
			}
			
			if(this.jPanelPaginacionGastoDepreciacion!=null) {
				this.jPanelPaginacionGastoDepreciacion.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesGastoDepreciacion!=null) {
				this.jPanelParametrosReportesGastoDepreciacion.setVisible(false);
			}
						
		} else if(sAccion=="c") {	
			if(this.jScrollPanelDatosEdicionGastoDepreciacion!=null) {
				this.jScrollPanelDatosEdicionGastoDepreciacion.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasGastoDepreciacion!=null) {
				this.jTabbedPaneBusquedasGastoDepreciacion.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosGastoDepreciacion!=null) {
				this.jScrollPanelDatosGastoDepreciacion.setVisible(true);
			}
			
			if(this.jPanelPaginacionGastoDepreciacion!=null) {
				this.jPanelPaginacionGastoDepreciacion.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesGastoDepreciacion!=null) {
				this.jPanelParametrosReportesGastoDepreciacion.setVisible(true);
			}
						
		} else if(sAccion=="t") {
			
			if(this.jScrollPanelDatosEdicionGastoDepreciacion!=null) {
				this.jScrollPanelDatosEdicionGastoDepreciacion.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasGastoDepreciacion!=null) {
				this.jTabbedPaneBusquedasGastoDepreciacion.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosGastoDepreciacion!=null) {
				this.jScrollPanelDatosGastoDepreciacion.setVisible(true);
			}
			
			if(this.jPanelPaginacionGastoDepreciacion!=null) {
				this.jPanelPaginacionGastoDepreciacion.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesGastoDepreciacion!=null) {
				this.jPanelParametrosReportesGastoDepreciacion.setVisible(true);
			}
						
		}  else if(sAccion=="s"||sAccion=="s2") {
			if(this.jScrollPanelDatosEdicionGastoDepreciacion!=null) {
				this.jScrollPanelDatosEdicionGastoDepreciacion.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasGastoDepreciacion!=null) {
				this.jTabbedPaneBusquedasGastoDepreciacion.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosGastoDepreciacion!=null) {
				this.jScrollPanelDatosGastoDepreciacion.setVisible(true);
			}
			
			if(this.jPanelPaginacionGastoDepreciacion!=null) {
				this.jPanelPaginacionGastoDepreciacion.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesGastoDepreciacion!=null) {
				this.jPanelParametrosReportesGastoDepreciacion.setVisible(true);
			}
			
		} 
		
		if(sAccion.equals("relacionado") || this.gastodepreciacionSessionBean.getEsGuardarRelacionado()) {
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				if(this.jTabbedPaneBusquedasGastoDepreciacion!=null) {
					this.jTabbedPaneBusquedasGastoDepreciacion.setVisible(false);				
				}
				
			}
			
			if(this.jPanelParametrosReportesGastoDepreciacion!=null) {
				this.jPanelParametrosReportesGastoDepreciacion.setVisible(false);
			}
		
		} else if(sAccion.equals("no_relacionado") && !this.gastodepreciacionSessionBean.getEsGuardarRelacionado()) {
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasGastoDepreciacion!=null) {
				this.jTabbedPaneBusquedasGastoDepreciacion.setVisible(true);			
			}
			
			if(this.jPanelParametrosReportesGastoDepreciacion!=null) {
				this.jPanelParametrosReportesGastoDepreciacion.setVisible(true);
			}
		}
	}	
	
	

	public void setVisibilidadBusquedasParaEmpresa(Boolean isParaEmpresa){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaEmpresaNegation=!isParaEmpresa;

			this.isVisibilidadFK_IdDetalleGrupoActivoFijo=isParaEmpresaNegation;
			if(!this.isVisibilidadFK_IdDetalleGrupoActivoFijo) {this.jTabbedPaneBusquedasGastoDepreciacion.remove(jPanelFK_IdDetalleGrupoActivoFijoGastoDepreciacion);}
		}
		
	}

	public void setVisibilidadBusquedasParaDetalleGrupoActivoFijo(Boolean isParaDetalleGrupoActivoFijo){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaDetalleGrupoActivoFijoNegation=!isParaDetalleGrupoActivoFijo;

			this.isVisibilidadFK_IdDetalleGrupoActivoFijo=isParaDetalleGrupoActivoFijo;
			if(!this.isVisibilidadFK_IdDetalleGrupoActivoFijo) {this.jTabbedPaneBusquedasGastoDepreciacion.remove(jPanelFK_IdDetalleGrupoActivoFijoGastoDepreciacion);}
		}
		
	}
	
	

	public String registrarSesionGastoDepreciacionParaCuentaContaGastoDepres() throws Exception {
		Boolean isPaginaPopupCuentaContaGastoDepre=false;

		try {

			if(this.gastodepreciacionSessionBean==null) {
				this.gastodepreciacionSessionBean=new GastoDepreciacionSessionBean();
			}

			if(this.jInternalFrameDetalleFormGastoDepreciacion.cuentacontagastodepreSessionBean==null) {
				this.jInternalFrameDetalleFormGastoDepreciacion.cuentacontagastodepreSessionBean=new CuentaContaGastoDepreSessionBean();
			}

			this.jInternalFrameDetalleFormGastoDepreciacion.cuentacontagastodepreSessionBean.setsPathNavegacionActual(gastodepreciacionSessionBean.getsPathNavegacionActual()+Constantes.SHTMLFLECHA+CuentaContaGastoDepreConstantesFunciones.SCLASSWEBTITULO);
			this.jInternalFrameDetalleFormGastoDepreciacion.cuentacontagastodepreSessionBean.setisPermiteRecargarInformacion(false);
			isPaginaPopupCuentaContaGastoDepre=this.jInternalFrameDetalleFormGastoDepreciacion.cuentacontagastodepreSessionBean.getisPaginaPopup();
			this.jInternalFrameDetalleFormGastoDepreciacion.cuentacontagastodepreSessionBean.setisPermiteNavegacionHaciaForeignKeyDesdeCuentaContaGastoDepre(true);
			this.jInternalFrameDetalleFormGastoDepreciacion.cuentacontagastodepreSessionBean.setsNombrePaginaNavegacionHaciaForeignKeyDesdeCuentaContaGastoDepre(GastoDepreciacionConstantesFunciones.SNOMBREOPCION);
			this.jInternalFrameDetalleFormGastoDepreciacion.cuentacontagastodepreSessionBean.setisBusquedaDesdeForeignKeySesionGastoDepreciacion(true);
			this.jInternalFrameDetalleFormGastoDepreciacion.cuentacontagastodepreSessionBean.setlidGastoDepreciacionActual(this.idGastoDepreciacionActual);

			gastodepreciacionSessionBean.setisBusquedaDesdeForeignKeySesionForeignKeyGastoDepreciacion(true);
			gastodepreciacionSessionBean.setlIdGastoDepreciacionActualForeignKey(this.idGastoDepreciacionActual);

			String strPagina=Constantes.SNONE;
			SistemaLogicAdditional sistemaLogicAdditional=new SistemaLogicAdditional();

			guardarDatosBusquedaSession();

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}

		return "";
	}
	
	
	
	
	public void guardarDatosBusquedaSession() throws Exception {
		
		//GastoDepreciacionSessionBean gastodepreciacionSessionBean=new GastoDepreciacionSessionBean();
		
		if(this.gastodepreciacionSessionBean==null) {
			this.gastodepreciacionSessionBean=new GastoDepreciacionSessionBean();
		}
		
		this.gastodepreciacionSessionBean.setsUltimaBusquedaGastoDepreciacion(this.getsAccionBusqueda());
		this.gastodepreciacionSessionBean.setiNumeroPaginacion(this.getiNumeroPaginacion());
		this.gastodepreciacionSessionBean.setiNumeroPaginacionPagina(this.getiNumeroPaginacionPagina());
		
		if(this.getsAccionBusqueda().equals("Todos")) {
			;
		}
		

		else if(this.getsAccionBusqueda().equals("FK_IdDetalleGrupoActivoFijo")) {
			gastodepreciacionSessionBean.setid_detalle_grupo_activo_fijo(this.getid_detalle_grupo_activo_fijoFK_IdDetalleGrupoActivoFijo());	
		}
		else if(this.getsAccionBusqueda().equals("FK_IdEmpresa")) {
			gastodepreciacionSessionBean.setid_empresa(this.getid_empresaFK_IdEmpresa());	
		}
		
	}
	
	public void traerDatosBusquedaDesdeSession() throws Exception {
		//GastoDepreciacionSessionBean gastodepreciacionSessionBean=new GastoDepreciacionSessionBean();
		
		if(this.gastodepreciacionSessionBean==null) {
			this.gastodepreciacionSessionBean=new GastoDepreciacionSessionBean();
		}
		
		if(this.gastodepreciacionSessionBean.getsUltimaBusquedaGastoDepreciacion()!=null&&!this.gastodepreciacionSessionBean.getsUltimaBusquedaGastoDepreciacion().equals("")) {
			this.setsAccionBusqueda(gastodepreciacionSessionBean.getsUltimaBusquedaGastoDepreciacion());
			this.setiNumeroPaginacion(gastodepreciacionSessionBean.getiNumeroPaginacion());
			this.setiNumeroPaginacionPagina(gastodepreciacionSessionBean.getiNumeroPaginacionPagina());		
				
			if(this.getsAccionBusqueda().equals("Todos")) {
				;
			}
			

			 else if(this.getsAccionBusqueda().equals("FK_IdDetalleGrupoActivoFijo")) {
				this.setid_detalle_grupo_activo_fijoFK_IdDetalleGrupoActivoFijo(gastodepreciacionSessionBean.getid_detalle_grupo_activo_fijo());
				gastodepreciacionSessionBean.setid_detalle_grupo_activo_fijo(-1L);
			}
			 else if(this.getsAccionBusqueda().equals("FK_IdEmpresa")) {
				this.setid_empresaFK_IdEmpresa(gastodepreciacionSessionBean.getid_empresa());
				gastodepreciacionSessionBean.setid_empresa(-1L);
			}
		}
		
		this.gastodepreciacionSessionBean.setsUltimaBusquedaGastoDepreciacion("");
		this.gastodepreciacionSessionBean.setiNumeroPaginacion(GastoDepreciacionConstantesFunciones.INUMEROPAGINACION);
		this.gastodepreciacionSessionBean.setiNumeroPaginacionPagina(0);
		
	}
	
	public void procesoActualizarFilaTotales(Boolean esCampoValor,String sTipo) {
		try {
			this.actualizarFilaTotales();
				
			this.traerValoresTablaTotales();
			
			this.inicializarActualizarBindingTablaGastoDepreciacion(false);
			
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	public void updateBusquedasFormularioGastoDepreciacion() {
		this.updateBorderResaltarBusquedasFormularioGastoDepreciacion();
		this.updateVisibilidadBusquedasFormularioGastoDepreciacion();
		this.updateHabilitarBusquedasFormularioGastoDepreciacion();
	}
	
	public void updateBorderResaltarBusquedasFormularioGastoDepreciacion() {					
	//BYDAN_BUSQUEDAS
		
	int index=0;
		
	if(this.jTabbedPaneBusquedasGastoDepreciacion.getComponents().length>0) {
	

		if(this.gastodepreciacionConstantesFunciones.resaltarFK_IdDetalleGrupoActivoFijoGastoDepreciacion!=null) {
			index= this.jTabbedPaneBusquedasGastoDepreciacion.indexOfComponent(this.jPanelFK_IdDetalleGrupoActivoFijoGastoDepreciacion);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasGastoDepreciacion.getComponent(index);
				jPanel.setBorder(this.gastodepreciacionConstantesFunciones.resaltarFK_IdDetalleGrupoActivoFijoGastoDepreciacion);
			}
		}
	}	
	
	}
	
	public void updateVisibilidadBusquedasFormularioGastoDepreciacion() {
	//BYDAN_BUSQUEDAS
	
	int index=0;
	JPanel jPanel=null;
		
	if(this.jTabbedPaneBusquedasGastoDepreciacion.getComponents().length>0) {
	

			index= this.jTabbedPaneBusquedasGastoDepreciacion.indexOfComponent(this.jPanelFK_IdDetalleGrupoActivoFijoGastoDepreciacion);
			jPanel=(JPanel)this.jTabbedPaneBusquedasGastoDepreciacion.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.gastodepreciacionConstantesFunciones.mostrarFK_IdDetalleGrupoActivoFijoGastoDepreciacion);
			if(!this.gastodepreciacionConstantesFunciones.mostrarFK_IdDetalleGrupoActivoFijoGastoDepreciacion && index>-1) {
				this.jTabbedPaneBusquedasGastoDepreciacion.remove(index);
			}
	}	
	
	}
	
	public void updateHabilitarBusquedasFormularioGastoDepreciacion() {
	
	//BYDAN_BUSQUEDAS		
		int index=0;
		JPanel jPanel=null;
			
		if(this.jTabbedPaneBusquedasGastoDepreciacion.getComponents().length>0) {
	

			index= this.jTabbedPaneBusquedasGastoDepreciacion.indexOfComponent(this.jPanelFK_IdDetalleGrupoActivoFijoGastoDepreciacion);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedasGastoDepreciacion.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.gastodepreciacionConstantesFunciones.activarFK_IdDetalleGrupoActivoFijoGastoDepreciacion);
				this.jTabbedPaneBusquedasGastoDepreciacion.setEnabledAt(index,this.gastodepreciacionConstantesFunciones.activarFK_IdDetalleGrupoActivoFijoGastoDepreciacion);
			}
		}	
	
	}
	
	
	public void resaltarPanelBusquedaGastoDepreciacion(String sTipoBusqueda) {
		Boolean existe=false;
		//BYDAN_BUSQUEDAS
		
		int index=0;
		Border resaltar = Funciones2.getBorderResaltar(this.parametroGeneralUsuario,"TAB");

		if(sTipoBusqueda.equals("FK_IdDetalleGrupoActivoFijo")) {
			index= this.jTabbedPaneBusquedasGastoDepreciacion.indexOfComponent(this.jPanelFK_IdDetalleGrupoActivoFijoGastoDepreciacion);

			this.jTabbedPaneBusquedasGastoDepreciacion.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasGastoDepreciacion.getComponent(index);

			this.gastodepreciacionConstantesFunciones.setResaltarFK_IdDetalleGrupoActivoFijoGastoDepreciacion(resaltar);

			jPanel.setBorder(this.gastodepreciacionConstantesFunciones.resaltarFK_IdDetalleGrupoActivoFijoGastoDepreciacion);
			existe=true;
		}
		

		if(existe) {
			
			this.jTtoolBarGastoDepreciacion.setBorder(resaltar);
			
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
	
	public void updateControlesFormularioGastoDepreciacion() throws Exception {

		if(this.jInternalFrameDetalleFormGastoDepreciacion==null) { //if(!this.conCargarFormDetalle) {			
			this.inicializarFormDetalle();
		}
		
		this.updateBorderResaltarControlesFormularioGastoDepreciacion();
		this.updateVisibilidadResaltarControlesFormularioGastoDepreciacion();
		this.updateHabilitarResaltarControlesFormularioGastoDepreciacion();
		
	}
	
	public void updateBorderResaltarControlesFormularioGastoDepreciacion() throws Exception {
		if(this.jInternalFrameDetalleFormGastoDepreciacion==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
	
		if(this.gastodepreciacionConstantesFunciones.resaltaridGastoDepreciacion!=null && this.jInternalFrameDetalleFormGastoDepreciacion!=null) {this.jInternalFrameDetalleFormGastoDepreciacion.jLabelidGastoDepreciacion.setBorder(this.gastodepreciacionConstantesFunciones.resaltaridGastoDepreciacion);}
		if(this.gastodepreciacionConstantesFunciones.resaltarid_empresaGastoDepreciacion!=null && this.jInternalFrameDetalleFormGastoDepreciacion!=null) {this.jInternalFrameDetalleFormGastoDepreciacion.jComboBoxid_empresaGastoDepreciacion.setBorder(this.gastodepreciacionConstantesFunciones.resaltarid_empresaGastoDepreciacion);}
		if(this.gastodepreciacionConstantesFunciones.resaltarid_detalle_grupo_activo_fijoGastoDepreciacion!=null && this.jInternalFrameDetalleFormGastoDepreciacion!=null) {this.jInternalFrameDetalleFormGastoDepreciacion.jComboBoxid_detalle_grupo_activo_fijoGastoDepreciacion.setBorder(this.gastodepreciacionConstantesFunciones.resaltarid_detalle_grupo_activo_fijoGastoDepreciacion);}
		if(this.gastodepreciacionConstantesFunciones.resaltaranioGastoDepreciacion!=null && this.jInternalFrameDetalleFormGastoDepreciacion!=null) {this.jInternalFrameDetalleFormGastoDepreciacion.jTextFieldanioGastoDepreciacion.setBorder(this.gastodepreciacionConstantesFunciones.resaltaranioGastoDepreciacion);}
		if(this.gastodepreciacionConstantesFunciones.resaltarvalorGastoDepreciacion!=null && this.jInternalFrameDetalleFormGastoDepreciacion!=null) {this.jInternalFrameDetalleFormGastoDepreciacion.jTextFieldvalorGastoDepreciacion.setBorder(this.gastodepreciacionConstantesFunciones.resaltarvalorGastoDepreciacion);}
	}
	
	public void updateVisibilidadResaltarControlesFormularioGastoDepreciacion() throws Exception {		
		if(this.jInternalFrameDetalleFormGastoDepreciacion==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormGastoDepreciacion!=null) {
	
		//this.jInternalFrameDetalleFormGastoDepreciacion.jLabelidGastoDepreciacion.setVisible(this.gastodepreciacionConstantesFunciones.mostraridGastoDepreciacion);
		this.jInternalFrameDetalleFormGastoDepreciacion.jPanelidGastoDepreciacion.setVisible(this.gastodepreciacionConstantesFunciones.mostraridGastoDepreciacion);
		//this.jInternalFrameDetalleFormGastoDepreciacion.jComboBoxid_empresaGastoDepreciacion.setVisible(this.gastodepreciacionConstantesFunciones.mostrarid_empresaGastoDepreciacion);
		this.jInternalFrameDetalleFormGastoDepreciacion.jPanelid_empresaGastoDepreciacion.setVisible(this.gastodepreciacionConstantesFunciones.mostrarid_empresaGastoDepreciacion);
		//this.jInternalFrameDetalleFormGastoDepreciacion.jComboBoxid_detalle_grupo_activo_fijoGastoDepreciacion.setVisible(this.gastodepreciacionConstantesFunciones.mostrarid_detalle_grupo_activo_fijoGastoDepreciacion);
		this.jInternalFrameDetalleFormGastoDepreciacion.jPanelid_detalle_grupo_activo_fijoGastoDepreciacion.setVisible(this.gastodepreciacionConstantesFunciones.mostrarid_detalle_grupo_activo_fijoGastoDepreciacion);
		//this.jInternalFrameDetalleFormGastoDepreciacion.jTextFieldanioGastoDepreciacion.setVisible(this.gastodepreciacionConstantesFunciones.mostraranioGastoDepreciacion);
		this.jInternalFrameDetalleFormGastoDepreciacion.jPanelanioGastoDepreciacion.setVisible(this.gastodepreciacionConstantesFunciones.mostraranioGastoDepreciacion);
		//this.jInternalFrameDetalleFormGastoDepreciacion.jTextFieldvalorGastoDepreciacion.setVisible(this.gastodepreciacionConstantesFunciones.mostrarvalorGastoDepreciacion);
		this.jInternalFrameDetalleFormGastoDepreciacion.jPanelvalorGastoDepreciacion.setVisible(this.gastodepreciacionConstantesFunciones.mostrarvalorGastoDepreciacion);
		}
	}
	
	public void updateHabilitarResaltarControlesFormularioGastoDepreciacion() throws Exception {
		if(this.jInternalFrameDetalleFormGastoDepreciacion==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormGastoDepreciacion!=null) {
	
		this.jInternalFrameDetalleFormGastoDepreciacion.jLabelidGastoDepreciacion.setEnabled(this.gastodepreciacionConstantesFunciones.activaridGastoDepreciacion);
		this.jInternalFrameDetalleFormGastoDepreciacion.jComboBoxid_empresaGastoDepreciacion.setEnabled(this.gastodepreciacionConstantesFunciones.activarid_empresaGastoDepreciacion);
		this.jInternalFrameDetalleFormGastoDepreciacion.jComboBoxid_detalle_grupo_activo_fijoGastoDepreciacion.setEnabled(this.gastodepreciacionConstantesFunciones.activarid_detalle_grupo_activo_fijoGastoDepreciacion);
		this.jInternalFrameDetalleFormGastoDepreciacion.jTextFieldanioGastoDepreciacion.setEnabled(this.gastodepreciacionConstantesFunciones.activaranioGastoDepreciacion);
		this.jInternalFrameDetalleFormGastoDepreciacion.jTextFieldvalorGastoDepreciacion.setEnabled(this.gastodepreciacionConstantesFunciones.activarvalorGastoDepreciacion);
		}
	}
	
		
}